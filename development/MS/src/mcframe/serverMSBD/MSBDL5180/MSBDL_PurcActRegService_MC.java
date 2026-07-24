package mcframe.serverMSBD.MSBDL5180;

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
import mcframe.serverMSBD.MSBDL5180.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6220.MSBBL_SlsSchdService;
import mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6130.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBD.MSBDL5300.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBE.MSBEL5930.*;
import mcframe.serverMSBF.MSBFL5050.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import static mcframe.commonCore.container.MCRow.Status.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import static mcframe.serverMSBD.MSBDL5180.Query.*;
import mcframe.serverFXUC.FXUCL0020.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSLA.MSLAL6030.*;
import mcframe.serverMSLA.MSLAL5060.AccptSendIf_Upd01_DtlR;
import mcframe.serverMSLA.MSLAL5060.MSLAL_AccptSendIfService;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import java.util.ArrayList;
import mcframe.serverMSBH.MSBHL5020.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSUC.MSUCL0130.MSUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0130.*;
import mcframe.serverMAUC.MAUCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcActRegService_MC extends MSBDL_PurcActRegService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBDL_PurcActRegService> CLAZZ = MSBDL_PurcActRegService.class;
	
	/** 取引先禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStpCache = null;
	/**
	 * 取引先禁止マスタをキャッシュする
	 * @param HdrL ヘッダチェック上り電文リスト
	 */
	protected static void initBpStpCache(MCList<Purc_Chk03_HdrR> HdrL) {
		object(CLAZZ)._initBpStpCache(HdrL);
	}
	protected void _initBpStpCache(MCList<Purc_Chk03_HdrR> HdrL) {
		_bpStpCache = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
				MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")), HdrL, "sppl_cd");
	}
	/**
	 * 取引先禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_BP_STOP_R> getBpStpCache() {
		return object(CLAZZ)._bpStpCache;
	}

	/** 場所マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	/**
	 * 場所マスタをキャッシュする
	 * @param ioL 詳細チェック上り電文
	 */
	protected static void initLocCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initLocCache(ioL);
	}
	protected void _initLocCache(MCList<Purc_Chk03_IoR> ioL) {
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")), ioL,
				Purc_Chk03_DtlR.$dlv_loc_cd);
	}
	
	/**
	 * 場所マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		return object(CLAZZ)._locCache;
	}

	/** 場所マスタキャッシュ(入荷予定) */
	protected MCList<MAM_LOC_R> _arrSchdLocCache = null;
	protected MCIndexKey _arrSchdLocCacheIdx = null;
	/**
	 * 場所マスタキャッシュ(入荷予定)を作成する
	 * @param dtlL 明細チェック上り電文
	 * @param asL insertされた入荷予定ワーク
	 */
	protected static void initArrSchdLocCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_ARR_SCHD_R> asL) {
		object(CLAZZ)._initArrSchdLocCache(dtlL, asL);
	}
	protected void _initArrSchdLocCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_ARR_SCHD_R> asL) {

		_arrSchdLocCache = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder arrSchdLocCache_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		MSW_ARR_SCHD_KEY_R k01 = MSW_ARR_SCHD_KEY_R.create("K01");

		arrSchdLocCache_bldr.addSelect(t2.arr_schd_no);
		arrSchdLocCache_bldr.addInnerJoin(t2, bracket( t.loc_cd.eq(t2.arr_loc_cd)));
		arrSchdLocCache_bldr.addInnerJoin(k01, bracket( t2.arr_schd_no.eq(k01.arr_schd_no)));
		if (asL.size() > 0) {
			dbSelect("MSBDL5180_MAM_LOC_S01", _arrSchdLocCache, arrSchdLocCache_bldr);
		}
		_arrSchdLocCacheIdx = _arrSchdLocCache.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
	}
	/**
	 * 場所マスタキャッシュ(入荷予定)を取得する
	 */
	protected static MAM_LOC_R getArrSchdLocCache(String arrSchdNo) {
		return object(CLAZZ)._getArrSchdLocCache(arrSchdNo);
	}
	protected MAM_LOC_R _getArrSchdLocCache(String arrSchdNo) {
		return _arrSchdLocCache.getFirst(_arrSchdLocCacheIdx, arrSchdNo);
	}
	
	/** 場所マスタキャッシュ(仕入実績受払) */
	protected MCList<MAM_LOC_R> _paiLocCache = null;
	protected MCIndexKey _paiLocCacheIdx = null;
	/**
	 * 場所マスタキャッシュ(仕入実績受払)を作成する
	 * @param ioL 詳細チェック上り電文
	 */
	protected static void initPaiLocCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initPaiLocCache(ioL);
	}
	protected void _initPaiLocCache(MCList<Purc_Chk03_IoR> ioL) {
		_paiLocCache = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder paiLocCache_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_IO_R t2 = MST_PURC_ACT_IO_R.create("T2");
		paiLocCache_bldr.addSelect(t2.purc_act_io_no, t2.purc_act_io_seq);
		paiLocCache_bldr.addLeftOuterJoin(t2, bracket( t.loc_cd.eq(t2.in_to_loc_cd)));
		paiLocCache_bldr.setWhere(t2.purc_act_io_no.eq(bind("purc_act_io_no")));
		paiLocCache_bldr.addWhereWithAnd(t2.purc_act_io_seq.eq(bind("purc_act_io_seq")));
		dbSelect("MSBDL5180_MAM_LOC_S02", _paiLocCache, paiLocCache_bldr, ioL);
		_paiLocCacheIdx = _paiLocCache.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no,
				MST_PURC_ACT_IO_R.$purc_act_io_seq);
	}
	/**
	 * 場所マスタキャッシュ(仕入実績受払)を取得する
	 */
	protected static MAM_LOC_R getPaiLocCache(String purcActIoNo, MCNumber purcActIoSeq) {
		return object(CLAZZ)._getPaiLocCache(purcActIoNo, purcActIoSeq);
	}
	protected MAM_LOC_R _getPaiLocCache(String purcActIoNo, MCNumber purcActIoSeq) {
		return _paiLocCache.getFirst(_paiLocCacheIdx, purcActIoNo, purcActIoSeq);
	}
	
	/** 場所マスタキャッシュ(入荷実績) */
	protected MCList<MAM_LOC_R> _arrActLocCache = null;
	protected MCIndexKey _arrActLocCacheIdx = null;
	/**
	 * 場所マスタキャッシュ(入荷実績)を作成する
	 * @param ioL 詳細チェック上り電文
	 */
	protected static void initArrActLocCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initArrActLocCache(ioL);
	}
	protected void _initArrActLocCache(MCList<Purc_Chk03_IoR> ioL) {
		_arrActLocCache = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder arrActLocCache_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
		arrActLocCache_bldr.addSelect(t2.arr_act_no);
		arrActLocCache_bldr.addLeftOuterJoin(t2, bracket( t.loc_cd.eq(t2.arr_loc_cd)));
		arrActLocCache_bldr.setWhere(t2.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBDL5180_MAM_LOC_S03", _arrActLocCache, arrActLocCache_bldr, ioL);
		_arrActLocCacheIdx = _arrActLocCache.createIndex(MST_ARR_ACT_R.$arr_act_no);
	}
	/**
	 * 場所マスタキャッシュ(入荷実績)を取得する
	 */
	protected static MAM_LOC_R getArrActLocCache(String arrActNo) {
		return object(CLAZZ)._getArrActLocCache(arrActNo);
	}
	protected MAM_LOC_R _getArrActLocCache(String arrActNo) {
		return _arrActLocCache.getFirst(_arrActLocCacheIdx, arrActNo);
	}
	
	/** 税マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	protected static void initTaxCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initTaxCache(dtlL);
	}
	protected void _initTaxCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(
				MCQueryApiBuilder.create(MAM_TAX_R.create("T")), dtlL,
				Purc_Chk03_DtlR.$tax_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_TAX_R> getTaxCache() {
		return object(CLAZZ)._taxCache;
	}
	

	/** 業務理由マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _rsnCache = null;
	protected static void initRsnCache(MCList<Purc_Ins01_DtlR> dtlL) {
		object(CLAZZ)._initRsnCache(dtlL);
	}
	protected void _initRsnCache(MCList<Purc_Ins01_DtlR> dtlL) {
		_rsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(
				MCQueryApiBuilder.create(MAM_BIZ_RSN_R.create("T")), dtlL,
				Purc_Ins01_DtlR.$rsn_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_BIZ_RSN_R> getRsnCache() {
		return object(CLAZZ)._rsnCache;
	}
	
	/** 取引先マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_BP_R> _spplCache = null;
	/**
	 * 取引先マスタをキャッシュする
	 * @param ioL 在庫取引先ＣＤが含まれるリスト
	 */
	protected static void initSpplCacheByStkBpCd(MCList<Purc_Chk02_IoR> ioL) {	
		object(CLAZZ)._initSpplCacheByStkBpCd(ioL);
	}
	protected void _initSpplCacheByStkBpCd(MCList<Purc_Chk02_IoR> ioL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R t2 = MAM_BP_R.create("T2");
		MAM_BP_R t3 = MAM_BP_R.create("T3");
		dbcL_bldr.addSelect(t.asppl_cd);
		dbcL_bldr.addSelect(t2.bsppl_cd);
		dbcL_bldr.addSelect(t3.psppl_cd);
		dbcL_bldr.addSelect(t3.ap_cred_cd);
		dbcL_bldr.addLeftOuterJoin(t2, bracket( t.asppl_cd.eq(t2.bp_cd)));
		dbcL_bldr.addLeftOuterJoin(t3, bracket( t2.bsppl_cd.eq(t3.bp_cd)));
		dbcL_bldr.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		_spplCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, ioL, Purc_Chk02_IoR.$stk_bp_cd);
	}
	/**
	 * 取引先マスタをキャッシュする
	 * @param hdrL 発注先ＣＤが含まれるリスト
	 */
	protected static void initSpplCacheBySpplCd(MCList<Purc_Chk03_HdrR> hdrL) {
		object(CLAZZ)._initSpplCacheBySpplCd(hdrL);
	}
	protected void _initSpplCacheBySpplCd(MCList<Purc_Chk03_HdrR> hdrL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R t2 = MAM_BP_R.create("T2");
		MAM_BP_R t3 = MAM_BP_R.create("T3");
		dbcL_bldr.addSelect(t.asppl_cd);
		dbcL_bldr.addSelect(t2.bsppl_cd);
		dbcL_bldr.addSelect(t3.psppl_cd);
		dbcL_bldr.addSelect(t3.ap_cred_cd);
		dbcL_bldr.addLeftOuterJoin(t2, bracket( t.asppl_cd.eq(t2.bp_cd)));
		dbcL_bldr.addLeftOuterJoin(t3, bracket( t2.bsppl_cd.eq(t3.bp_cd)));
		dbcL_bldr.addWhereWithAnd(t.sppl_flg.eq(value(true)));

		_spplCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, hdrL, Purc_Chk03_HdrR.$sppl_cd);
	}
	/**
	 *  取引先マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_BP_R> getSpplCache() {
		return object(CLAZZ)._spplCache;
	}

	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
	protected static void initCurCache(MCList<Purc_Chk03_HdrR> hdrL) {
		object(CLAZZ)._initCurCache(hdrL);
	}
	protected void _initCurCache(MCList<Purc_Chk03_HdrR> hdrL) {
		_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(
				MCQueryApiBuilder.create(MAM_CUR_R.create("T")), hdrL,
				Purc_Chk03_HdrR.$trd_cur_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_CUR_R> getCurCache() {
		return object(CLAZZ)._curCache;
	}
	
	
	/** 品目マスタキャッシュ*/
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	/**
	 * 品目マスタをキャッシュする
	 * @param dtlL 明細チェック上り電文リスト
	 */
	protected static void initItmCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}	
	protected void _initItmCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	/**
	 * 品目マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}
	
	/** 品目禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopCache = null;
	/**
	 * 品目禁止マスタをキャッシュする
	 * @param dtlL 明細チェック上り電文リスト
	 */
	protected static void initStopItmCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initStopItmCache(dtlL);
	}
	protected void _initStopItmCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_itmStopCache = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
				MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")), dtlL,
				Purc_Chk03_DtlR.$itm_cd, Purc_Chk03_DtlR.$itm_sub1,
				Purc_Chk03_DtlR.$itm_sub2, Purc_Chk03_DtlR.$itm_sub3);
	}
	/**
	 * 品目禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_ITM_STOP_R> getItmStopCache() {
		return object(CLAZZ)._itmStopCache;
	}

	/** 支給先キャッシュ */
	protected MCList<MAM_BP_R> _prspplCache = null;
	protected MCIndexKey _prspplCacheIndex = null;
	protected static void initPrspplCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initPrspplCache(ioL);
	}
	protected void _initPrspplCache(MCList<Purc_Chk03_IoR> ioL) {
		_prspplCache = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder prspplCache_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		prspplCache_bldr.addLeftOuterJoin(t2, bracket( t.bp_cd.eq(t2.sppl_cd)));
		prspplCache_bldr.addSelect(t2.loc_cd);
		prspplCache_bldr.setWhere(t2.loc_cd.eq(bind("dlv_loc_cd")));
		dbSelect("MSBDL5180_MAM_BP_S01", _prspplCache, prspplCache_bldr, ioL);
		_prspplCacheIndex = _prspplCache.createIndex(MAM_LOC_R.$loc_cd); 
	}
	protected static MAM_BP_R getPrspplCache(String locCd) {
		return object(CLAZZ)._getPrspplCache(locCd);
	}
	protected MAM_BP_R _getPrspplCache(String locCd) {
		return _prspplCache.getFirst(_prspplCacheIndex, locCd);
	}
	
	/** 会計理由マスタキャッシュ */
	protected MCList<MAM_AC_RSN_R> _acRsnCache = null;
	protected MCIndexKey _acRsnCacheIdx = null;
	protected static void initAcRsnCache(MCList<Purc_Ins01_DtlR> dtlL) {
		object(CLAZZ)._initAcRsnCache(dtlL);
	}
	protected void _initAcRsnCache(MCList<Purc_Ins01_DtlR> dtlL) {
		_acRsnCache = MCList.create(MAM_AC_RSN_R.class);
		MAM_AC_RSN_R t = MAM_AC_RSN_R.create("T");
		MCQueryApiBuilder acRsnCache_bldr = MCQueryApiBuilder.create(t);
		MAM_BIZ_RSN_R t2 = MAM_BIZ_RSN_R.create("T2");
		acRsnCache_bldr.addSelect(t2.biz_rsn_cd);
		acRsnCache_bldr.addLeftOuterJoin(t2, bracket( t.ac_rsn_cd.eq(t2.ac_rsn_cd)));
		acRsnCache_bldr.setWhere(t2.biz_rsn_cd.eq(bind("rsn_cd")));
		dbSelect("MSBDL5180_MAM_AC_RSN_S01", _acRsnCache, acRsnCache_bldr, dtlL);
		_acRsnCacheIdx = _acRsnCache.createIndex(MAM_BIZ_RSN_R.$biz_rsn_cd);
	}
	/**
	 * 会計理由マスタキャッシュを取得します。<br>
	 * @param bizRsnCd 業務理由ＣＤ
	 * @return 会計理由マスタキャッシュ
	 */
	protected static MAM_AC_RSN_R getAcRsnCache(String bizRsnCd) {
		return object(CLAZZ)._getAcRsnCache(bizRsnCd);
	}
	protected MAM_AC_RSN_R _getAcRsnCache(String bizRsnCd) {
		return _acRsnCache.getFirst(MAM_BIZ_RSN_R.$biz_rsn_cd, bizRsnCd);
	}
	
	/** 品目仕訳マスタキャッシュ */
	protected MCList<MAM_ITM_JNL_R> _itmJnlCache = null;
	MCIndexKey _itmJnlCacheIdx = null;
	protected static void initItmJnlCache(MCList<Purc_Ins01_DtlR> dtlL) {
		object(CLAZZ)._initItmJnlCache(dtlL);
	}
	protected void _initItmJnlCache(MCList<Purc_Ins01_DtlR> dtlL) {
		_itmJnlCache = MCList.create(MAM_ITM_JNL_R.class);
		MAM_ITM_JNL_R t = MAM_ITM_JNL_R.create("T");
		MCQueryApiBuilder itmJnlCache_bldr = MCQueryApiBuilder.create(t);
		MAM_ITM_R t2 = MAM_ITM_R.create("T2");
		itmJnlCache_bldr.addSelect(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3);
		itmJnlCache_bldr.addLeftOuterJoin(t2, bracket( t.itm_jnl_cd.eq(t2.itm_jnl_cd)));
		itmJnlCache_bldr.setWhere(t2.itm_cd.eq(bind("itm_cd")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub1.eq(bind("itm_sub1")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub2.eq(bind("itm_sub2")));
		itmJnlCache_bldr.addWhereWithAnd(t2.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBDL5180_MAM_ITM_JNL_S01", _itmJnlCache, itmJnlCache_bldr, dtlL);
		_itmJnlCacheIdx = _itmJnlCache.createIndex(MAM_ITM_R.$itm_cd, 
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	/**
	 * 品目仕訳マスタキャッシュを取得します
	 * @param itmCd 品目ＣＤ
	 * @param itmSub1 枝番１
	 * @param itmSub2 枝番２
	 * @param itmSub3 枝番３
	 * @return 品目仕訳マスタキャッシュ
	 */
	protected static MAM_ITM_JNL_R getItmJnlCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmJnlCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MAM_ITM_JNL_R _getItmJnlCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmJnlCache.getFirst(_itmJnlCacheIdx, itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	/** 検査実績キャッシュ */
	protected MCList<MST_INSP_ACT_R> _inspActCache = null;
	MCIndexKey _inspActCacheIdx = null;
	protected static void initInspActCache(MCList<?> ioL) {
		object(CLAZZ)._initInspActCache(ioL);
	}
	protected void _initInspActCache(MCList<?> ioL) {
		_inspActCache = MCList.create(MST_INSP_ACT_R.class);
		MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
		MCQueryApiBuilder inspActCache_bldr = MCQueryApiBuilder.create(t);
		MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
		MST_INSP_SMPL_ACT_R t3 = MST_INSP_SMPL_ACT_R.create("T3");
		inspActCache_bldr.setGroupBy(t2.src_no4, t3.bd_dpt_cd);
		inspActCache_bldr.addSum(t3.so_qty, "so_qty");
		inspActCache_bldr.addSum(t3.pack_xfr_pack_unit_qty, "pack_xfr_pack_unit_qty");
		inspActCache_bldr.addInnerJoin(t2, t.insp_no.eq(t2.insp_no));
		inspActCache_bldr.addInnerJoin(t3, bracket(t3.insp_act_no.eq(t.insp_act_no)
				.and(t3.stk_id_typ.eq(value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value())))
				.and(t3.so_qty.isNotNull())));
		inspActCache_bldr.setWhere(t2.src_no4.eq(bind("arr_act_no")));
		dbSelect("MSBDL5180_MST_INSP_ACT_S01", _inspActCache, inspActCache_bldr, ioL.groupBy("arr_act_no"));
		_inspActCacheIdx = _inspActCache.createIndex("src_no4");
	}
	/**
	 * 検査実績キャッシュを取得します
	 * @param arrActNo 入荷実績ＮＯ
	 * @return 検査実績キャッシュ
	 */
	protected static MST_INSP_ACT_R getInspActCache(String arrActNo) {
		return object(CLAZZ)._getInspActCache(arrActNo);
	}
	protected MST_INSP_ACT_R _getInspActCache(String arrActNo) {
		return _inspActCache.getFirst(_inspActCacheIdx, arrActNo);
	}
	
	/** 発注明細トランザクション・キャッシュ */
	protected FXUCL_MCDbcCache<MST_PO_D_R> _poDCache = null;
	/**
	 * 発注明細トランザクションをキャッシュする
	 * @param list 発注明細NOを含むリスト
	 */
	protected static void initPoDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initPoDCache(dtlL);
	}
	protected void _initPoDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		MCList<MST_PO_D_R> dbcL = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T2");
		MAM_TAX_R t3 = MAM_TAX_R.create("T3");
		dbcL_bldr.addSelect(t2.conv_qty);
		dbcL_bldr.addSelect(t2.conv_base_qty);
		dbcL_bldr.addSelect(t3.tax_rate.as("po_tax_rate"));
		dbcL.addBooleanColumn("po_inc_tax_flg");
		dbcL_bldr.addSelect(t3.inc_tax_flg.as("po_inc_tax_flg"));
		dbcL_bldr.addSelect(t.purc_basis_typ);
		dbcL_bldr.addLeftOuterJoin(t2, bracket(t.itm_cd.eq(t2.itm_cd)
						.and(t.itm_sub1.eq(t2.itm_sub1))
						.and(t.itm_sub2.eq(t2.itm_sub2))
						.and(t.itm_sub3.eq(t2.itm_sub3))
						.and(t.trd_unit_cd.eq(t2.unit_cd))));
		dbcL_bldr.addLeftOuterJoin(t3, bracket( t.tax_cd.eq(t3.tax_cd)));
		_poDCache = new FXUCL_MCDbcCache<MST_PO_D_R>(dbcL, dbcL_bldr, dtlL, MST_PO_D_R.$po_d_no);
	}

	
	/**
	 * 発注明細トランザクションキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MST_PO_D_R> getPoDCache() {
		return object(CLAZZ)._poDCache;
	}
	
	
	/** 受領インボイス明細トランザクション・キャッシュ */
	protected FXUCL_MCDbcCache<MST_RCPT_IV_D_R> _rcptIvDCache = null;
	/**
	 * 受領インボイス明細トランザクションをキャッシュする
	 * @param list 受領インボイス明細NOを含むリスト
	 */
	protected static void initRcptIvDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initRcptIvDCache(dtlL);
	}
	protected void _initRcptIvDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		MCList<MST_RCPT_IV_D_R> dbcL = MCList.create(MST_RCPT_IV_D_R.class);
		MST_RCPT_IV_D_R t = MST_RCPT_IV_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MST_RCPT_IV_R t1 = MST_RCPT_IV_R.create("T1");
		MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T2");
		MAM_TAX_R t3 = MAM_TAX_R.create("T3");
		MAM_ITM_R t4 = MAM_ITM_R.create("T4");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_BP_R m2 = MAM_BP_R.create("M2");
		MAM_BP_R m3 = MAM_BP_R.create("M3");
		MAM_BP_R m4 = MAM_BP_R.create("M4");
		// 金額計算を発注と受領インボイスで共有するため、フィールド名の先頭に「po_」をつける 
		dbcL_bldr.addSelect(t1.trd_cur_cd, t1.pay_basis_dt, t1.pay_schd_dt);
		dbcL_bldr.addSelect(t2.conv_qty);
		dbcL_bldr.addSelect(t2.conv_base_qty);
		dbcL_bldr.addSelect(t3.tax_rate.as("po_tax_rate"));
		dbcL.addBooleanColumn("po_inc_tax_flg");
		dbcL_bldr.addSelect(t3.inc_tax_flg.as("po_inc_tax_flg"));
		dbcL_bldr.addSelect(nvl( t4.pay_crryovr_times, m1.pay_crryovr_times).as("pay_crryovr_times"));
		dbcL_bldr.addSelect(t1.sppl_cd, m1.asppl_cd, m2.bsppl_cd, m3.psppl_cd, m4.ap_cred_cd);
		dbcL_bldr.addInnerJoin(t1, bracket( t.rcpt_iv_mng_no.eq(t1.rcpt_iv_mng_no)));
		dbcL_bldr.addLeftOuterJoin(t2, bracket(t.itm_cd.eq(t2.itm_cd)
						.and(t.itm_sub1.eq(t2.itm_sub1))
						.and(t.itm_sub2.eq(t2.itm_sub2))
						.and(t.itm_sub3.eq(t2.itm_sub3))
						.and(t.trd_unit_cd.eq(t2.unit_cd))));
		dbcL_bldr.addLeftOuterJoin(t3, bracket(t.tax_cd.eq(t3.tax_cd)));
		dbcL_bldr.addLeftOuterJoin(t4, bracket(t.itm_cd.eq(t4.itm_cd)
						.and(t.itm_sub1.eq(t4.itm_sub1))
						.and(t.itm_sub2.eq(t4.itm_sub2))
						.and(t.itm_sub3.eq(t4.itm_sub3))));
		dbcL_bldr.addLeftOuterJoin(m1, bracket( t1.sppl_cd.eq(m1.bp_cd)));
		dbcL_bldr.addLeftOuterJoin(m2, bracket( m1.asppl_cd.eq(m2.bp_cd)));
		dbcL_bldr.addLeftOuterJoin(m3, bracket( m2.bsppl_cd.eq(m3.bp_cd)));
		dbcL_bldr.addLeftOuterJoin(m4, bracket( m3.psppl_cd.eq(m4.bp_cd)));
		_rcptIvDCache = new FXUCL_MCDbcCache<MST_RCPT_IV_D_R>(dbcL, dbcL_bldr, dtlL, MST_RCPT_IV_D_R.$rcpt_iv_d_no);
	}
	/**
	 * 受領インボイス明細トランザクションキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MST_RCPT_IV_D_R> getRcptIvDCache() {
		return object(CLAZZ)._rcptIvDCache;
	}


	/** 入荷進捗トランザクション・キャッシュ*/
	protected MCList<MST_ARR_PR_R> _arrPrCache = null;
	/**
	 * 入荷進捗トランザクションをキャッシュする
	 * @param dtlL 明細チェック上り電文
	 * @param wkPoD insert済み発注明細ワーク
	 */
	protected static void initArrPrCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_PO_D_R> wkPoD) {
		object(CLAZZ)._initArrPrCache(dtlL, wkPoD);
	}
	protected void _initArrPrCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_PO_D_R> wkPoD) {
		_arrPrCache = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder arrPrCache_bldr = MCQueryApiBuilder.create(t);
		MSW_PO_D_KEY_R k01 = MSW_PO_D_KEY_R.create("K01");
		arrPrCache_bldr.addInnerJoin(k01, bracket( t.po_d_no.eq(k01.po_d_no)));
		if (wkPoD.size() > 0) {
			dbSelect("MSBDL5180_MST_ARR_PR_S01", _arrPrCache, arrPrCache_bldr);
		}
		_idxArrPrCache = _arrPrCache.createIndex(MST_ARR_PR_R.$po_d_no);
	}
	/**
	 * 入荷進捗トランザクションキャッシュからデータを取得する
	 * @param poDNo 発注明細ＮＯ
	 * @return キャッシュのデータ
	 */
	protected static MST_ARR_PR_R getArrPrCache(String poDNo) {
		return object(CLAZZ)._getArrPrCache(poDNo);
	}
	protected MST_ARR_PR_R _getArrPrCache(String poDNo) {
		return _arrPrCache.getFirst(_idxArrPrCache, poDNo);
	}
	protected static MCList<MST_ARR_PR_R> getArrPrCacheList(MCList<?> poDNoList) {
		return object(CLAZZ)._getArrPrCacheList(poDNoList);
	}
	protected MCList<MST_ARR_PR_R> _getArrPrCacheList(MCList<?> poDNoList) {
		
		MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
		
		for (MCRow row : poDNoList) {
			String poDNo = row.getStringNE("po_d_no");
			if (!isNull(poDNo)) {
				MST_ARR_PR_R arrPrRow = arrPrL.getFirst(MST_ARR_PR_R.$po_d_no, poDNo);
				if (isNull(arrPrRow)) {
					arrPrRow = _arrPrCache.getFirst(_idxArrPrCache, poDNo);
					arrPrL.add(arrPrRow);
				}
			}
		}
		
		return arrPrL;
		
	}
	/** 入荷進捗トランザクションのインデックスキー */
	protected MCIndexKey _idxArrPrCache = null;
	
	
	/** 品目オーダートランザクション・キャッシュ */
	protected MCList<MST_ITM_ORDER_R> _itmOrdCache = null;
	/**
	 * 品目オーダーをキャッシュする
	 * @param dtlL 明細チェック上り電文
	 * @param wkPoD insert済み発注明細ワーク
	 */
	protected static void initItmOrdCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_PO_D_R> wkPoD) {
		object(CLAZZ)._initItmOrdCache(dtlL, wkPoD);
	}
	protected void _initItmOrdCache(MCList<Purc_Chk03_DtlR> dtlL, MCList<MST_PO_D_R> wkPoD) {
		_itmOrdCache = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder itmOrdCache_bldr = MCQueryApiBuilder.create(t);
		MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T2");
		MSW_PO_D_KEY_R k01 = MSW_PO_D_KEY_R.create("K01");
		itmOrdCache_bldr.addSelect(t2.po_d_no);
		itmOrdCache_bldr.addInnerJoin(t2, bracket( t.itm_ord_no.eq(t2.pln_itm_ord_no)));
		itmOrdCache_bldr.addInnerJoin(k01, bracket( t2.po_d_no.eq(k01.po_d_no)));
		if (wkPoD.size() > 0) {
			dbSelect("MSBDL5180_MST_ITM_ORDER_S01", _itmOrdCache, itmOrdCache_bldr);
		}
		_idxItmOrd = _itmOrdCache.createIndex(MST_PO_D_R.$po_d_no);
	}
	/**
	 * 品目オーダートランザクションキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static MCList<MST_ITM_ORDER_R> getItmOrdCache(String poDNo) {
		return object(CLAZZ)._getItmOrdCache(poDNo);
	}
	protected MCList<MST_ITM_ORDER_R> _getItmOrdCache(String poDNo) {
		return _itmOrdCache.subList(_idxItmOrd, poDNo);
	}
	/** 品目オーダートランザクションのインデックスキー */
	protected MCIndexKey _idxItmOrd = null;
	
	/** 更新前の仕入実績明細キャッシュ */
	protected FXUCL_MCDbcCache<MST_PURC_ACT_D_R> _bfUpdPurcActDCache = null;
	
	protected static void initBfUpdPurcActDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initBfUpdPurcActDCache(dtlL);
	}
	
	protected void _initBfUpdPurcActDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_bfUpdPurcActDCache = new FXUCL_MCDbcCache<MST_PURC_ACT_D_R>(
				MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T")), dtlL,
				Purc_Chk03_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_seq);
	}
	
	/**
	 * 更新前の仕入実績明細キャッシュを取得する
	 * @return 仕入実績明細キャッシュ
	 */
	protected static FXUCL_MCDbcCache<MST_PURC_ACT_D_R> getBfUpdPurcActDCache() {
		return object(CLAZZ)._bfUpdPurcActDCache;
	}
	
	/** 発注ヘッダトランザクション・キャッシュ*/
	protected FXUCL_MCDbcCache<MST_PO_R> _poCache = null;
	/**
	 * 発注ヘッダトランザクションをキャッシュする
	 * @param hdrL ヘッダチェック上り電文リスト
	 */
	protected static void initPoCache(MCList<?> list) {	
		object(CLAZZ)._initPoCache(list);
	}	
	protected void _initPoCache(MCList<?> list) {
		_poCache = new FXUCL_MCDbcCache<MST_PO_R>(
				MCQueryApiBuilder.create(MST_PO_R.create("T")), list, MST_PO_R.$po_no);
	}

	/**
	 * 発注ヘッダトランザクションキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MST_PO_R> getPoCache() {
		return object(CLAZZ)._poCache;
	}
	
	/** 仕入予定(キャッシュ) */
	protected FXUCL_MCDbcCache<MST_PURC_SCHD_R> _purcSchdCache = null;
	/**
	 * 仕入予定をキャッシュする
	 * @param dtlL 明細チェック上り電文
	 */
	protected static void initPurcSchdCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initPurcSchdCache(dtlL);
	}
	
	protected void _initPurcSchdCache(MCList<Purc_Chk03_DtlR> dtlL) {
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		MST_RCPT_IV_D_R t3 = MST_RCPT_IV_D_R.create("T3");
		MST_RCPT_IV_R t4 = MST_RCPT_IV_R.create("T4");
		dbcL_bldr.removeSelect(MST_PURC_SCHD_R.$arr_pr_no, MST_PURC_SCHD_R.$arr_schd_no);
		dbcL_bldr.addSelect(t2.arr_pr_no, t2.arr_schd_no);		// 仕入予定だとNULL文字の可能性があるので入荷予定の値を使用する
		dbcL_bldr.addSelect(t4.rcpt_iv_mng_no, t3.rcpt_iv_d_no, t4.rcpt_iv_no, t3.rcpt_iv_rev, t3.iv_itm_nm);
		dbcL_bldr.addLeftOuterJoin(t2, bracket( t.arr_schd_no.eq(t2.arr_schd_no)));
		dbcL_bldr.addLeftOuterJoin(t3, bracket( t.purc_schd_no.eq(t3.purc_schd_no)));
		dbcL_bldr.addLeftOuterJoin(t4, bracket( t3.rcpt_iv_mng_no.eq(t4.rcpt_iv_mng_no)));
		_purcSchdCache = new FXUCL_MCDbcCache<MST_PURC_SCHD_R>(dbcL_bldr, dtlL, MST_PURC_SCHD_R.$purc_schd_no);
	}
	/**
	 * 仕入予定のキャッシュを取得する
	 * @return 仕入予定のキャッシュ
	 */
	protected static FXUCL_MCDbcCache<MST_PURC_SCHD_R> getPurcSchdCache() {
		return object(CLAZZ)._purcSchdCache;
	}
	
	// 仕入予定・キャッシュ（受領インボイス管理NOを持つ予定全て)
	protected MCList<MST_PURC_SCHD_R> _havIvPurcSchdCache = null;
	protected MCIndexKey _idxHavIvPurcSchdCache = null;
	protected Map<String, String> _ivMngNoMap = null;
	protected static void initHavIvPurcSchdCache(MCList<?> dtlL) {
		initHavIvPurcSchdCache(dtlL, false);
	}
	protected static void initHavIvPurcSchdCache(MCList<?> dtlL, boolean getCache) {
		object(CLAZZ)._initHavIvPurcSchdCache(dtlL, getCache);
	}
	protected void _initHavIvPurcSchdCache(MCList<?> dtlL, boolean getCache) {

		_havIvPurcSchdCache = MCList.create(MST_PURC_SCHD_R.class);
		_ivMngNoMap = new HashMap<String,String>();
		
		// 仕入予定に紐付く受領インボイスNOを取得
		MCList<MST_RCPT_IV_D_R> rcptIvL = MCList.create(MST_RCPT_IV_D_R.class);
		MST_RCPT_IV_D_R rcptIvL_t = MST_RCPT_IV_D_R.create("T");
		
		MCQueryApiBuilder rcptIvL_bldr = MCQueryApiBuilder.create(rcptIvL_t);
		rcptIvL_bldr.addGroupBy(rcptIvL_t.rcpt_iv_mng_no);
		rcptIvL_bldr.addWhereWithAnd(rcptIvL_t.purc_schd_no.eq(bind("purc_schd_no")));
		
		if (dbSelect("MSBDL5180_MST_RCPT_IV_D_S01", rcptIvL, rcptIvL_bldr, dtlL) > 0) {
			
			// 受領インボイス管理NOに紐付く全ての仕入予定を取得する。ただし仕入対象外ＦＬＧがオンのものは除く。
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder havIvPurcSchdCache_bldr = MCQueryApiBuilder.create(t);
			MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			havIvPurcSchdCache_bldr.removeSelect(MST_PURC_SCHD_R.$arr_pr_no, MST_PURC_SCHD_R.$arr_schd_no);
			havIvPurcSchdCache_bldr.addSelect(t3.arr_pr_no, t3.arr_schd_no);		// 仕入予定だとNULL文字の可能性があるので入荷予定の値を使用する
			havIvPurcSchdCache_bldr.addSelect(t2.rcpt_iv_mng_no, t2.rcpt_iv_d_no, t2.rcpt_iv_rev);
			havIvPurcSchdCache_bldr.addInnerJoin(t2, bracket( t.purc_schd_no.eq(t2.purc_schd_no)));
			havIvPurcSchdCache_bldr.addLeftOuterJoin(t3, bracket( t.arr_schd_no.eq(t3.arr_schd_no)));
			havIvPurcSchdCache_bldr.addWhereWithAnd(t2.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			havIvPurcSchdCache_bldr.addWhereWithAnd(t.non_purc_flg.eq(value(false)));
			dbSelect("MSBDL5180_MST_PURC_SCHD_S01", _havIvPurcSchdCache, havIvPurcSchdCache_bldr, rcptIvL);
			_idxHavIvPurcSchdCache = _havIvPurcSchdCache.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);
			
			for (MST_PURC_SCHD_R row : _havIvPurcSchdCache) {
				_ivMngNoMap.put(row.purc_schd_no(), row.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no));
			}
			
			if (getCache) {
				MCList<Purc_Chk03_DtlR> lst = MCList.create(Purc_Chk03_DtlR.class);
				_havIvPurcSchdCache.forEach(r -> lst.add().rcpt_iv_d_no(r.getStringNE("rcpt_iv_d_no")));
				initRcptIvDCache(lst);
			}
		}
		
	}
	/**
	 * 仕入予定NOから受領インボイスNOを取得して、受領インボイスNOに紐付く全ての仕入予定を取得する
	 * @param purcSchdNo 仕入予定NO
	 * @return 仕入予定
	 */
	protected static MCList<MST_PURC_SCHD_R> getHavIvPurcSchdCache(String purcSchdNo) {
		return object(CLAZZ)._getHavIvPurcSchdCache(purcSchdNo);
	}
	protected MCList<MST_PURC_SCHD_R> _getHavIvPurcSchdCache(String purcSchdNo) {
		
		if (_ivMngNoMap.containsKey(purcSchdNo)) {
			String ivMngNo = _ivMngNoMap.get(purcSchdNo);
			return _havIvPurcSchdCache.subList(_idxHavIvPurcSchdCache, ivMngNo);
		}
		
		return null;

	}
	
	
	// 入荷予定（キャッシュ）
	
	/**
	 * 入荷予定をキャッシュに格納する
	 * @param DtlL 明細チェック上り電文
	 */
	protected static void initArrSchdCache(MCList<Purc_Chk03_DtlR> DtlL) {	
		object(CLAZZ)._initArrSchdCache(DtlL);
	}
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchdCache = null;
	
	protected void _initArrSchdCache(MCList<Purc_Chk03_DtlR> DtlL) {
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		dbcL_bldr.addSelect(m1.lg_grp_cd, m1.loc_grp_cd, m1.sppl_cd);
		dbcL_bldr.addInnerJoin(m1, bracket( t.arr_loc_cd.eq(m1.loc_cd)));
		_arrSchdCache = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(dbcL_bldr, DtlL, MST_PURC_SCHD_R.$arr_schd_no);
	}
	
	protected static FXUCL_MCDbcCache<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdCache;
	}
	
	
	// 発注ヘッダキャッシュ
	protected MCList<MST_PO_R> _poCacheByArrSchdNo;
	protected MCIndexKey _poCacheByArrSchdNoIndex = null;
	protected static void initPoCacheByArrSchdNo(MCList<Purc_Chk02_IoR> ioL) {
		object(CLAZZ)._initPoCacheByArrSchdNo(ioL);
	}
	protected void _initPoCacheByArrSchdNo(MCList<Purc_Chk02_IoR> ioL) {
		_poCacheByArrSchdNo = MCList.create(MST_PO_R.class);
		MST_PO_R t = MST_PO_R.create("T");
		MCQueryApiBuilder poCacheByArrSchdNo_bldr = MCQueryApiBuilder.create(t);
		MST_PO_D_R t2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		MST_ARR_SCHD_R t4 = MST_ARR_SCHD_R.create("T4");
		poCacheByArrSchdNo_bldr.addSelect(t4.arr_schd_no);
		poCacheByArrSchdNo_bldr.addInnerJoin(t2, bracket( t.po_no.eq(t2.po_no)));
		poCacheByArrSchdNo_bldr.addInnerJoin(t3, bracket( t2.po_d_no.eq(t3.po_d_no)));
		poCacheByArrSchdNo_bldr.addInnerJoin(t4, bracket( t3.arr_pr_no.eq(t4.arr_pr_no)));
		poCacheByArrSchdNo_bldr.addWhereWithAnd(t4.arr_schd_no.eq(bind("arr_schd_no")));
		dbSelect("MSBDL5180_MST_PO_S01", _poCacheByArrSchdNo, poCacheByArrSchdNo_bldr, ioL);
		_poCacheByArrSchdNoIndex = _poCacheByArrSchdNo.createIndex("arr_schd_no");
	}
	
	
	// 発注明細キャッシュ
	protected MCList<MST_PO_D_R> _poDCacheByArrSchdNo;
	protected MCIndexKey _poDCacheByArrSchdNoIndex = null;

	protected static void initPoDCacheByArrSchdNo(MCList<?> ioL) {
		object(CLAZZ)._initPoDCacheByArrSchdNo(ioL);
	}

	protected void _initPoDCacheByArrSchdNo(MCList<?> ioL) {
		_poDCacheByArrSchdNo = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder poDCacheByArrSchdNo_bldr = MCQueryApiBuilder.create(t);
		MST_PO_R t2 = MST_PO_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		MST_ARR_SCHD_R t4 = MST_ARR_SCHD_R.create("T4");
		MST_RCPT_IV_R t5 = MST_RCPT_IV_R.create("T5");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_BP_R m4 = MAM_BP_R.create("M4");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		poDCacheByArrSchdNo_bldr.addSelect(m1.purc_slip_each_lot_typ, t2.sppl_cd,
				cases().when(m1.sppl_iv_flg.eq(value(true))
						.and(m5.pay_spot_flg.eq(value(true)))).then(t5.pay_schd_dt)
						.otherwise(nullValue()).as("pay_schd_dt"),
				cases().when(m1.sppl_iv_flg.eq(value(true))
						.and(m5.pay_spot_flg.eq(value(false)))).then(t5.pay_basis_dt)
						.otherwise(nullValue()).as("pay_basis_dt"),
				t4.arr_schd_no);
		poDCacheByArrSchdNo_bldr.addInnerJoin(t2, bracket( t.po_no.eq(t2.po_no)));
		poDCacheByArrSchdNo_bldr.addInnerJoin(t3, bracket( t.po_d_no.eq(t3.po_d_no)));
		poDCacheByArrSchdNo_bldr.addInnerJoin(t4, bracket( t3.arr_pr_no.eq(t4.arr_pr_no)));
		poDCacheByArrSchdNo_bldr.addLeftOuterJoin(t5, bracket( t4.rcpt_iv_mng_no.eq(t5.rcpt_iv_mng_no)));
		poDCacheByArrSchdNo_bldr.addLeftOuterJoin(m1, bracket( t2.sppl_cd.eq(m1.bp_cd)));
		poDCacheByArrSchdNo_bldr.addLeftOuterJoin(m4, bracket( m1.asppl_cd.eq(m4.bp_cd)));
		poDCacheByArrSchdNo_bldr.addLeftOuterJoin(m5, bracket( m4.bsppl_cd.eq(m5.bp_cd)));
		poDCacheByArrSchdNo_bldr.addWhereWithAnd(t4.arr_schd_no.eq(bind("arr_schd_no")));
		dbSelect("MSBDL5180_MST_PO_D_S01", _poDCacheByArrSchdNo, poDCacheByArrSchdNo_bldr, ioL);
		_poDCacheByArrSchdNoIndex = _poDCacheByArrSchdNo.createIndex("arr_schd_no");
	}
	protected static MST_PO_D_R getPoDCacheByArrSchdNo(String arrSchdNo) {
		return object(CLAZZ)._getPoDCacheByArrSchdNo(arrSchdNo);
	}
	protected MST_PO_D_R _getPoDCacheByArrSchdNo(String arrSchdNo) {
		return _poDCacheByArrSchdNo.getFirst(_poDCacheByArrSchdNoIndex, arrSchdNo);
	}
	
	// 入荷実績(キャッシュ)
	protected FXUCL_MCDbcCache<MST_ARR_ACT_R> _arrActCache = null;
	protected static void initArrActCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initArrActCache(ioL);
	}
	protected void _initArrActCache(MCList<Purc_Chk03_IoR> ioL) {
		_arrActCache = new FXUCL_MCDbcCache<MST_ARR_ACT_R>(
				MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T")), ioL,
				Purc_Chk03_IoR.$arr_act_no);
	}
	protected static FXUCL_MCDbcCache<MST_ARR_ACT_R> getArrActCache() {
		return object(CLAZZ)._arrActCache;
	}

	// 仕入実績(キャッシュ)
	protected FXUCL_MCDbcCache<MST_PURC_ACT_R> _purcActCache = null;
	protected static void initPurcActCache(MCList<Purc_Chk03_HdrR> hdrL) {
		object(CLAZZ)._initPurcActCache(hdrL);
	}
	protected void _initPurcActCache(MCList<Purc_Chk03_HdrR> hdrL) {
		_purcActCache = new FXUCL_MCDbcCache<MST_PURC_ACT_R>(
				MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), hdrL,
				Purc_Chk03_HdrR.$purc_act_no, Purc_Chk03_HdrR.$purc_act_seq);
	}
	protected static FXUCL_MCDbcCache<MST_PURC_ACT_R> getPurcActCache() {
		return object(CLAZZ)._purcActCache;
	}
	
	// 仕入実績明細(キャッシュ)
	protected FXUCL_MCDbcCache<MST_PURC_ACT_D_R> _purcActDCache = null;
	protected static void initPurcActDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initPurcActDCache(dtlL);
	}
	protected void _initPurcActDCache(MCList<Purc_Chk03_DtlR> dtlL) {
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_RET_ACT_D_R retactd = MST_PURC_RET_ACT_D_R.create("RETACTD");
		dbcL_bldr.addLeftOuterJoin(retactd, bracket( t.purc_ret_act_d_no.eq(retactd.purc_ret_act_d_no)));
		dbcL_bldr.addSelect(retactd.purc_ret_schd_d_no);
		dbcL_bldr.addSelect(retactd.sls_act_d_no);
		_purcActDCache = new FXUCL_MCDbcCache<MST_PURC_ACT_D_R>(dbcL_bldr, dtlL,
				Purc_Chk03_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_seq);
	}
	protected static FXUCL_MCDbcCache<MST_PURC_ACT_D_R> getPurcActDCache() {
		return object(CLAZZ)._purcActDCache;
	}

	// 仕入実績明細・キャッシュ、仕入予定NOを元に取得する
	protected MCList<MST_PURC_ACT_D_R> _purcActDCacheByPurcSchdNo = null;
	protected MCIndexKey _idxPurcActDCacheByPurcSchdNo = null;
	protected static void initPurcActDCacheByPurcSchdNo(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initPurcActDCacheByPurcSchdNo(dtlL);
	}
	protected void _initPurcActDCacheByPurcSchdNo(MCList<Purc_Chk03_DtlR> dtlL) {
		_purcActDCacheByPurcSchdNo = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder purcActDCacheByPurcSchdNo_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
		purcActDCacheByPurcSchdNo_bldr.addLeftOuterJoin(t2, bracket( t.purc_act_no.eq(t2.purc_act_no)
				.and(t.purc_act_seq.eq(t2.purc_act_seq))));
		purcActDCacheByPurcSchdNo_bldr.addWhereWithAnd(t.purc_schd_no.eq(bind("purc_schd_no")));
		purcActDCacheByPurcSchdNo_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBDL5180_MST_PURC_ACT_D_S01", _purcActDCacheByPurcSchdNo, purcActDCacheByPurcSchdNo_bldr, dtlL);
		_idxPurcActDCacheByPurcSchdNo = _purcActDCacheByPurcSchdNo.createIndex(MST_PURC_ACT_D_R.$purc_schd_no);
	}
	protected static MCList<MST_PURC_ACT_D_R> getPurcActDCacheByPurcSchdNo(String purcSchdNo) {		
		return object(CLAZZ)._getPurcActDCacheByPurcSchdNo(purcSchdNo);
	}
	protected MCList<MST_PURC_ACT_D_R> _getPurcActDCacheByPurcSchdNo(String purcSchdNo) {		
		return _purcActDCacheByPurcSchdNo.subList(_idxPurcActDCacheByPurcSchdNo, purcSchdNo);
	}
	
	// 仕入実績受払(キャッシュ)
	protected FXUCL_MCDbcCache<MST_PURC_ACT_IO_R> _purcActIoCache = null;
	protected static void initPurcActIoCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initPurcActIoCache(ioL);
	}
	protected void _initPurcActIoCache(MCList<Purc_Chk03_IoR> ioL) {
		_purcActIoCache = new FXUCL_MCDbcCache<MST_PURC_ACT_IO_R>(
				MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")), ioL,
				Purc_Chk03_IoR.$purc_act_io_no, Purc_Chk03_IoR.$purc_act_io_seq);
	}
	protected static FXUCL_MCDbcCache<MST_PURC_ACT_IO_R> getPurcActIoCache() {
		return object(CLAZZ)._purcActIoCache;
	}

	// 仕入実績受払・キャッシュ（入荷実績ＮＯをキーにして検索）
	protected MCList<MST_PURC_ACT_IO_R> _paiCcByAaNo = null;
	protected MCIndexKey _paiCcByAaNoIdx = null;
	/**
	 * 入荷実績NOで仕入実績受払トランをキャッシュする
	 * @param incAaNoList 入荷実績NOを持つリスト
	 */
	protected static void initPaiCcByAaNo(MCList<?> incAaNoList) {
		object(CLAZZ)._initPaiCcByAaNo(incAaNoList);
	}
	protected void _initPaiCcByAaNo(MCList<?> incAaNoList) {
		_paiCcByAaNo = MCList.create(MST_PURC_ACT_IO_R.class);
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MCQueryApiBuilder paiCcByAaNo_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
		paiCcByAaNo_bldr.addInnerJoin(t2, bracket(t.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t.purc_act_d_seq.eq(t2.purc_act_d_seq))));
		paiCcByAaNo_bldr.addInnerJoin(t3, bracket(t2.purc_act_no.eq(t3.purc_act_no)
				.and(t2.purc_act_seq.eq(t3.purc_act_seq))));
		paiCcByAaNo_bldr.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		paiCcByAaNo_bldr.addWhereWithAnd(t.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBDL5180_MST_PURC_ACT_IO_S01", _paiCcByAaNo, paiCcByAaNo_bldr, incAaNoList);
		_paiCcByAaNoIdx = _paiCcByAaNo.createIndex(MST_PURC_ACT_IO_R.$arr_act_no);
	}
	/**
	 * 入荷実績NOで仕入実績受払のキャッシュを取得する
	 * @param aaNo 入荷実績NO
	 * @return 仕入実績受払のキャッシュ
	 */
	protected static MCList<MST_PURC_ACT_IO_R> getPaiCcByAaNo(String aaNo) {
		return object(CLAZZ)._getPaiCcByAaNo(aaNo);
	}
	protected MCList<MST_PURC_ACT_IO_R> _getPaiCcByAaNo(String aaNo) {
		return _paiCcByAaNo.subList(_paiCcByAaNoIdx, aaNo);
	}
	
	
	// 入荷実績NOで仕入実績ヘッダをキャッシュする
	
	protected MCList<Purc_HdrR> _paCcByAaNo = null;
	/** 仕入実績ヘッダキャッシュ */
	protected static void initPaCcByAaNo(MCList<?> incAaNoList) {
		object(CLAZZ)._initPaCcByAaNo(incAaNoList);
	}
	protected void _initPaCcByAaNo(MCList<?> incAaNoList) {
		_paCcByAaNo = MCList.create(Purc_HdrR.class);
		
		MCList<MST_PURC_ACT_R> dbc = MCList.create(MST_PURC_ACT_R.class);
		MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");

		for (String col : MST_PURC_ACT_R.colnames()) {
			MCPermColumn permColumn = dbc_bldr.getBaseDbc().getColumn$(col);
			dbc_bldr.addGroupBy(permColumn);
		}
		dbc_bldr.addInnerJoin(t2, bracket( t.purc_act_no.eq(t2.purc_act_no) 
									.and(t.purc_act_seq.eq(t2.purc_act_seq))));
		dbc_bldr.addInnerJoin(t3, bracket( t2.purc_act_d_no.eq(t3.purc_act_d_no) 
									.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq))));
		dbc_bldr.addWhereWithAnd(t3.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBDL5180_MST_PURC_ACT_S01", dbc, dbc_bldr, incAaNoList);
		
		for (MST_PURC_ACT_R row : dbc) {
			Purc_HdrR hdrRow = Purc_HdrR.create();
			hdrRow.pa(row);
			_paCcByAaNo.add(hdrRow);
		}
		
	}
	
	/**
	 * 仕入実績ヘッダキャッシュを取得する
	 * @return
	 */
	protected static MCList<Purc_HdrR> getPaCcByAaNo() {
		return object(CLAZZ)._paCcByAaNo;
	}
	
	// 仕入実績明細キャッシュ(仕入実績ヘッダで検索)
	protected MCList<Purc_DtlR> _padCcByPaNo = null;
	protected MCIndexKey _padCcByPaNoIdx = null;

	protected static void initPadCcByPaNo(MCList<Purc_HdrR> purcActL) {
		object(CLAZZ)._initPadCcByPaNo(purcActL);
	}

	protected void _initPadCcByPaNo(MCList<Purc_HdrR> purcActL) {
		_padCcByPaNo = MCList.create(Purc_DtlR.class);
		
		MCList<MST_PURC_ACT_D_R> dbc = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addWhereWithAnd(t.purc_act_no.eq(bind("purc_act_no"))
									.and(t.purc_act_seq.eq(bind("purc_act_seq"))));
		dbSelect("MSBDL5180_MST_PURC_ACT_D_S02", dbc, dbc_bldr, purcActL);
		for (MST_PURC_ACT_D_R row : dbc) {
			Purc_DtlR dtlRow = Purc_DtlR.create();
			dtlRow.pad(row);
			_padCcByPaNo.add(dtlRow);
		}
		_padCcByPaNoIdx = _padCcByPaNo.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
	}

	// 入荷実績・キャッシュ（仕入実績受払ＮＯをキーにして検索）
	protected MCList<MST_ARR_ACT_R> _arrActCacheByPurcActIoNo = null;
	protected MCIndexKey idxArrActCacheByPurcActIoNo = null;
	protected static void initArrActCacheByPurcActIoNo(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._initArrActCacheByPurcActIoNo(ioL);
	}
	protected void _initArrActCacheByPurcActIoNo(MCList<Purc_Chk03_IoR> ioL) {
		_arrActCacheByPurcActIoNo = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrActCacheByPurcActIoNo_bldr = MCQueryApiBuilder.create(t);
		arrActCacheByPurcActIoNo_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		arrActCacheByPurcActIoNo_bldr.addWhereWithAnd(t.purc_act_io_no.eq(bind("purc_act_io_no")));
		dbSelect("MSBDL5180_MST_ARR_ACT_S01", _arrActCacheByPurcActIoNo, arrActCacheByPurcActIoNo_bldr, ioL);
		idxArrActCacheByPurcActIoNo = _arrActCacheByPurcActIoNo.createIndex(MST_ARR_ACT_R.$purc_act_io_no);
	}
	protected static MCList<MST_ARR_ACT_R> getArrActCacheByPurcActIoNo(String purcActIoNo) {
		return object(CLAZZ)._getArrActCacheByPurcActIoNo(purcActIoNo);
	}
	protected MCList<MST_ARR_ACT_R> _getArrActCacheByPurcActIoNo(String purcActIoNo) {
		return _arrActCacheByPurcActIoNo.subList(idxArrActCacheByPurcActIoNo, purcActIoNo);
	}
	
	/** 再入荷予定キャッシュ */
	protected MCList<MST_ARR_SCHD_R> _reArrSchdCache = null;
	/** 再入荷予定キャッシュ用のインデックス */
	protected MCIndexKey _idxReArrSchdCache = null;
	/**
	 * 再入荷の入荷予定情報を、キャッシュに格納する</p>
	 * 検索条件として仕入実績明細NOを使用する
	 * @param dtlL 明細チェック上り電文
	 */
	protected static void initReArrSchd(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initReArrSchd(dtlL);
	}
	protected void _initReArrSchd(MCList<Purc_Chk03_DtlR> dtlL) {
		_reArrSchdCache = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder reArrSchdCache_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
		MST_DLV_INST_D_R t2 = MST_DLV_INST_D_R.create("T2");
		MST_PRMS_RCPT_D_R t3 = MST_PRMS_RCPT_D_R.create("T3");
		reArrSchdCache_bldr.addSelect(t2.dlv_inst_no, t3.prms_rcpt_no);
		reArrSchdCache_bldr.addSelect(t4.base_unit_abort_qty.as("purc_abort_qty"));
		reArrSchdCache_bldr.addSelect(t4.base_unit_accpt_dfct_qty.as("purc_accpt_dfct_qty"));
		reArrSchdCache_bldr.addSelect(t4.base_unit_purc_qty.as("purc_qty"));
		reArrSchdCache_bldr.addInnerJoin(t4, t.arr_schd_no.eq(t4.arr_schd_no));
		reArrSchdCache_bldr.addLeftOuterJoin(t2, t.dlv_inst_d_no.eq(t2.dlv_inst_d_no));
		reArrSchdCache_bldr.addLeftOuterJoin(t3, t.prms_rcpt_d_no.eq(t3.prms_rcpt_d_no));
		reArrSchdCache_bldr.addWhereWithAnd(t.re_arr_schd_flg.eq(value(true)));
		reArrSchdCache_bldr.addWhereWithAnd(t.purc_act_d_no.eq(bind("purc_act_d_no")));
		dbSelect("MSBDL5180_MST_ARR_SCHD_S01", _reArrSchdCache, reArrSchdCache_bldr, dtlL);
		_idxReArrSchdCache = _reArrSchdCache.createIndex(MST_ARR_SCHD_R.$purc_act_d_no);
	}
	/**
	 * 再入荷予定キャッシュを取得する
	 * @return 再入荷予定DBコンテナLIST
	 */
	protected static MCList<MST_ARR_SCHD_R> getReArrSchdCache(String purcActDNo) {
		return object(CLAZZ)._getReArrSchdCache(purcActDNo);
	}
	protected MCList<MST_ARR_SCHD_R> _getReArrSchdCache(String purcActDNo) {
		
		if (_reArrSchdCache.size() > 0) {
			return _reArrSchdCache.subList(_idxReArrSchdCache, purcActDNo);
		}
		return null;
	}

	/** 仕入実績サービス実行用・上り電文キャッシュ(ヘッダ) */
	protected MCList<Purc_Ins01_HdrR> _hdrCache = null;
	
	/** 仕入実績サービス実行用・上り電文キャッシュ(明細) */
	protected MCList<Purc_Ins01_DtlR> _dtlCache = null;
	
	/** 仕入実績サービス実行用・上り電文キャッシュ(受払) */
	protected MCList<Purc_Ins01_IoR> _ioCache = null;
	
	/**
	 * 上り電文(ヘッダ)をキャッシュする
	 * @param hdrL 上り電文(ヘッダ)
	 */
	protected static void initHdrCache(MCList<Purc_Ins01_HdrR> hdrL) {
		object(CLAZZ)._initHdrCache(hdrL);
	}
	protected void _initHdrCache(MCList<Purc_Ins01_HdrR> hdrL) {
		_hdrCache = MCList.create(Purc_Ins01_HdrR.class);
		_hdrCache.addAll(hdrL);
		_keyIdxHdrCache = _hdrCache.createIndex(Purc_Ins01_HdrR.$peg_no);
		_idxHdrCacheByRcptIvNo = _hdrCache.createIndex(Purc_Ins01_HdrR.$rcpt_iv_mng_no);
	}
	
	/**
	 * ヘッダ上り電文キャッシュを取得する
	 * @param hdrPegNo ヘッダ紐付NO
	 * @return ヘッダ上り電文キャッシュ
	 */
	protected static Purc_Ins01_HdrR getHdrCache(MCNumber hdrPegNo) {
		return object(CLAZZ)._getHdrCache(hdrPegNo);
	}
	protected Purc_Ins01_HdrR _getHdrCache(MCNumber hdrPegNo) {
		return _hdrCache.getFirst(_keyIdxHdrCache, hdrPegNo);
	}
	
	/**
	 * ヘッダ上り電文キャッシュを取得する
	 * @param rcptIvMngNo 受領インボイス管理NO
	 * @return ヘッダ上り電文キャッシュ
	 */
	protected static MCList<Purc_Ins01_HdrR> getHdrCacheByRcptIvNo(String rcptIvMngNo) {
		return object(CLAZZ)._getHdrCacheByRcptIvNo(rcptIvMngNo);
	}
	protected MCList<Purc_Ins01_HdrR> _getHdrCacheByRcptIvNo(String rcptIvMngNo) {
		return _hdrCache.subList(_idxHdrCacheByRcptIvNo, rcptIvMngNo);
	}
	
	/**
	 * 上り電文(明細)をキャッシュする
	 * @param dtlL 上り電文(明細)
	 */
	protected static void initDtlCache(MCList<Purc_Ins01_DtlR> dtlL) {
		object(CLAZZ)._initDtlCache(dtlL);
	}
	protected void _initDtlCache(MCList<Purc_Ins01_DtlR> dtlL) {
		_dtlCache = MCList.create(Purc_Ins01_DtlR.class);
		_dtlCache.addAll(dtlL);
		_keyIdxDtlCache = _dtlCache.createIndex(Purc_Ins01_DtlR.$peg_no);
		_idxDtlCacheByHdrPegNo = _dtlCache.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
	}
	
	/**
	 * 明細上り電文キャッシュを取得する
	 * @param dtlPegNo 明細紐付NO
	 * @return 明細上り電文キャッシュ
	 */
	protected static Purc_Ins01_DtlR getDtlCache(MCNumber dtlPegNo) {
		return object(CLAZZ)._getDtlCache(dtlPegNo);
	}
	protected Purc_Ins01_DtlR _getDtlCache(MCNumber dtlPegNo) {
		return _dtlCache.getFirst(_keyIdxDtlCache, dtlPegNo);
	}

	/**
	 * 明細上り電文キャッシュを取得する
	 * @param hdrPegNo ヘッダ紐付NO
	 * @return 明細上り電文キャッシュ
	 */
	protected static MCList<Purc_Ins01_DtlR> getDtlCacheByHdrPegNo(MCNumber hdrPegNo) {
		return object(CLAZZ)._getDtlCacheByHdrPegNo(hdrPegNo);
	}
	protected MCList<Purc_Ins01_DtlR> _getDtlCacheByHdrPegNo(MCNumber hdrPegNo) {
		return _dtlCache.subList(_idxDtlCacheByHdrPegNo, hdrPegNo);
	}
	
	/**
	 * 上り電文(受払)をキャッシュする
	 * @param ioL 上り電文(受払)
	 */
	protected static void initIoCache(MCList<Purc_Ins01_IoR> ioL) {
		object(CLAZZ)._initIoCache(ioL);
	}
	protected void _initIoCache(MCList<Purc_Ins01_IoR> ioL) {
		_ioCache = MCList.create(Purc_Ins01_IoR.class);
		_ioCache.addAll(ioL);
		_keyIdxIoCache = _ioCache.createIndex(Purc_Ins01_IoR.$peg_no);
		_idxIoCacheByDtlPegNo = _ioCache.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		_srcPegNoIdxIoCache = _ioCache.createIndex(Purc_Ins01_IoR.$src_peg_no);
	}
	
	/**
	 * 詳細上り電文キャッシュを取得する
	 * @param ioPegNo 詳細紐付NO
	 * @return 詳細上り電文キャッシュ
	 */
	protected static Purc_Ins01_IoR getIoCache(MCNumber ioPegNo) {
		return object(CLAZZ)._getIoCache(ioPegNo);
	}
	protected Purc_Ins01_IoR _getIoCache(MCNumber ioPegNo) {
		return _ioCache.getFirst(_keyIdxIoCache, ioPegNo);
	}
	/**
	 * 詳細上り電文キャッシュを取得する
	 * @param dtlPegNo 明細紐付NO
	 * @return 詳細上り電文キャッシュ
	 */
	protected static MCList<Purc_Ins01_IoR> getIoCacheByDtlPegNo(MCNumber dtlPegNo) {
		return object(CLAZZ)._getIoCacheByDtlPegNo(dtlPegNo);
	}
	protected MCList<Purc_Ins01_IoR> _getIoCacheByDtlPegNo(MCNumber dtlPegNo) {
		return _ioCache.subList(_idxIoCacheByDtlPegNo, dtlPegNo);
	}
	/**
	 * 詳細上り電文キャッシュを取得する
	 * @param srcPegNo 元紐付NO
	 * @return 詳細上り電文キャッシュ
	 */
	protected static MCList<Purc_Ins01_IoR> getIoCacheBySrcPegNo(MCNumber srcPegNo) {
		return object(CLAZZ)._getIoCacheBySrcPegNo(srcPegNo);
	}
	protected MCList<Purc_Ins01_IoR> _getIoCacheBySrcPegNo(MCNumber srcPegNo) {
		return _ioCache.subList(_srcPegNoIdxIoCache, srcPegNo);
	}
	
	/** 電文キャッシュ(ヘッダ)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxHdrCache = null;
	/** 電文キャッシュ(明細)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxDtlCache = null;
	/** 電文キャッシュ(受払)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxIoCache = null;
	/** 電文キャッシュ(受払)を元紐付NOで検索する為のインデックス */
	protected MCIndexKey _srcPegNoIdxIoCache = null;
	
	
	/** 電文キャッシュ(ヘッダ)を受領インボイス管理NOで検索する為のインデックス */
	protected MCIndexKey _idxHdrCacheByRcptIvNo = null;
	/** 電文キャッシュ(明細)をヘッダ紐付NOで検索する為のインデックス */
	protected MCIndexKey _idxDtlCacheByHdrPegNo = null;
	/** 電文キャッシュ(受払)を明細紐付NOで検索する為のインデックス */
	protected MCIndexKey _idxIoCacheByDtlPegNo = null;

	/** 負担部門 */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheBdDpt = null;

	/**
	 * キャッシュ作成（部門マスタ（負担部門））
	 * @param r
	 */
	protected static void createBdDptCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._createBdDptCache(dtlL);
	}
	protected void _createBdDptCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_cacheBdDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
				MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
				dtlL,
				Purc_Chk03_DtlR.$bd_dpt_cd);
	}
	
	/**
	 * キャッシュ取得（部門マスタ(負担部門)）
	 * @param hdrR
	 * @param dtlR
	 * @return
	 */
	protected static MAM_DPT_R getCacheBdDpt(MCRow hdrR, MCRow dtlR) {
		return object(CLAZZ)._getCacheBdDpt(hdrR, dtlR);
	}
	protected MAM_DPT_R _getCacheBdDpt(MCRow hdrR, MCRow dtlR) {
		return _cacheBdDpt.get(hdrR.getDateNE("ac_dt"), dtlR.getStringNE("bd_dpt_cd"));
	}

	/** 仕入理由 */
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _cachePurcRsn = null;
	
	/**
	 * キャッシュ作成（業務理由マスタ（仕入理由））
	 * @param dtlL
	 */
	protected static void createPurcRsnCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._createPurcRsnCache(dtlL);
	}
	protected void _createPurcRsnCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_cachePurcRsn = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(
				MCQueryApiBuilder.create(MAM_BIZ_RSN_R.create("T")), dtlL,
				Purc_Chk03_DtlR.$rsn_cd);
	}
	
	/**
	 * キャッシュ取得（業務理由マスタ（仕入理由））
	 * @return キャッシュ
	 */
	protected static FXUCL_MCDbcCache<MAM_BIZ_RSN_R> getCachePurcRsn() {
		return object(CLAZZ)._cachePurcRsn;
	}
	/** 入荷実績（外注かつ同時計上FLGがオン）*/
	protected FXUCL_MCDbcCache<MST_ARR_ACT_R> _arrActCache2 = null;
	
	/**
	 * Purc_Chk01オペレーション.<p>
	 *
	 * 仕入明細訂正登録・仕入実績一覧登録画面から呼出すチェック処理<br>
	 */
	public class Purc_Chk01 extends MSBDL_PurcActRegService_MC_A.Purc_Chk01 {
		
		protected MCNumber _maxHdrPegNo = MCNumber.ZERO;
		protected MCNumber _maxDtlPegNo = MCNumber.ZERO;
		protected MCNumber _maxIoPegNo = MCNumber.ZERO;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 明細紐付NO初期化
			initDtlPegNo();
			
			/** 仕入実績ヘッダ更新用 */
			MCList<Purc_Ins01_HdrR> updHdrL = MCList.create(Purc_Ins01_HdrR.create());
			/** 仕入実績明細更新用 */
			MCList<Purc_Ins01_DtlR> updDtlL = MCList.create(Purc_Ins01_DtlR.create());
			/** 仕入実績受払更新用 */
			MCList<Purc_Ins01_IoR> updIoL = MCList.create(Purc_Ins01_IoR.create());
			
			// 仕入実績登録SV実行用に補完した電文を以下に格納する
			MCList<Purc_Chk03_HdrR> hdrL = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> dtlL= MCList.create(Purc_Chk03_DtlR.class);
			MCList<Purc_Chk03_IoR> ioL= MCList.create(Purc_Chk03_IoR.class);

			// 仕入明細訂正から呼ばれた場合
			if (up0().dtl_upd_flg()) {
				
				// 仕入実績ヘッダ・明細・受払のデータを取得する
				setPurcDataForPurcDtlModReg(hdrL, dtlL, ioL);

				MSBDL_PurcActRegService.Purc_Chk03 chk03Ope = MSBDL_PurcActRegService.crtPurc_Chk03();
				chk03Ope.up0().addAll(hdrL);
				chk03Ope.up1().addAll(dtlL);
				chk03Ope.up2().addAll(ioL);
				chk03Ope.up3().crt_param_cache_flg(true);
				chk03Ope.up3().purc_dtl_flg(true);
				chk03Ope.exec();

				// 共通チェックの結果を反映
				String[] destCols = {Purc_Chk01_DtlR.$err_flg};
				String[] srcCols = {Purc_Chk03_DtlR.$err_flg};
				copyByPegNo(up1(), destCols, chk03Ope.down1(), srcCols);
				down0().setAll(up1());
			}
			else {

				// 受領インボイスキャッシュ
				initHavIvPurcSchdCache(up1(), true);
				// 受領インボイス更新チェック
				checkRcptIv();

				setPurcActDataForPurcActListReg(updHdrL, updDtlL, updIoL);

				addAll(hdrL, updHdrL, createMap_Purc_Chk03_HdrR_Purc_Ins01_HdrR());

				Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR<Purc_Chk03_DtlR,Purc_Ins01_DtlR> dtlMap = createMap_Purc_Chk03_DtlR_Purc_Ins01_DtlR();
				dtlMap.setWith(up1());

				addAll(dtlL, updDtlL, dtlMap);
				addAll(ioL, updIoL, createMap_Purc_Chk03_IoR_Purc_Ins01_IoR());

				MSBDL_PurcActRegService.Purc_Chk03 chk03Ope = MSBDL_PurcActRegService.crtPurc_Chk03();
				chk03Ope.up0().addAll(hdrL);
				chk03Ope.up1().addAll(dtlL);
				chk03Ope.up2().addAll(ioL);
				chk03Ope.up3().crt_param_cache_flg(true);
				chk03Ope.up3().arr_act_flg(true);
				chk03Ope.up3().io_make_flg(true);
				chk03Ope.exec();

				// 共通チェックの結果を反映
				String[] destCols = {Purc_Chk01_DtlR.$err_flg};
				String[] srcCols = {Purc_Chk03_DtlR.$err_flg};
				copyByPegNo(up1(), destCols, chk03Ope.down1(), srcCols);
				down0().setAll(up1());

			}
		}

		/**
		 * 明細紐付NOの初期値設定
		 */
		protected void initDtlPegNo() {
			_maxDtlPegNo = (MCNumber) up1().max(Purc_Chk01_DtlR.$peg_no);
		}
		/**
		 * ヘッダ紐付NOを発番して返します
		 * @return ヘッダ紐付NO
		 */
		protected MCNumber getHdrPegNo() {
			_maxHdrPegNo = _maxHdrPegNo.add(1);
			return _maxHdrPegNo;
		}
		/**
		 * 明細紐付NOを発番して返します
		 * @return 明細紐付NO
		 */
		protected MCNumber getDtlPegNo() {
			_maxDtlPegNo = _maxDtlPegNo.add(1);
			return _maxDtlPegNo;
		}
		/**
		 * 詳細紐付NOを発番して返します
		 * @return 詳細紐付NO
		 */
		protected MCNumber getIoPegNo() {
			_maxIoPegNo = _maxIoPegNo.add(1);
			return _maxIoPegNo;
		}
		
		/**
		 * 仕入明細訂正用の電文を作成します
		 */
		protected void setPurcDataForPurcDtlModReg(MCList<Purc_Chk03_HdrR> hdrL, MCList<Purc_Chk03_DtlR> dtlL, MCList<Purc_Chk03_IoR> ioL) {
			
			MCList<Purc_Chk01_DtlR> hdrList
				= up1().groupBy(Purc_Chk01_DtlR.$purc_act_no, Purc_Chk01_DtlR.$purc_act_seq);
			
			// 仕入実績ヘッダ取得
			MCList<MST_PURC_ACT_R> dbcPurcAct = MCList.create(MST_PURC_ACT_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_ACT_S02", dbcPurcAct,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), hdrList);

			// 仕入実績明細取得
			MCList<MST_PURC_ACT_D_R> dblPurcActD = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R dblPurcActD_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder dblPurcActD_bldr = MCQueryApiBuilder.create(dblPurcActD_t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			dblPurcActD_bldr.addSelect(t3.arr_ptn_typ);
			dblPurcActD_bldr.addLeftOuterJoin(t2, bracket( dblPurcActD_t.purc_schd_no.eq(t2.purc_schd_no)));
			dblPurcActD_bldr.addLeftOuterJoin(t3, bracket( t2.arr_schd_no.eq(t3.arr_schd_no)));
			dblPurcActD_bldr.addWhereWithAnd(dblPurcActD_t.purc_act_no.eq(bind("purc_act_no")));
			dblPurcActD_bldr.addWhereWithAnd(dblPurcActD_t.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S04", dblPurcActD, dblPurcActD_bldr, dbcPurcAct);
			
			// 仕入実績受払取得
			MCList<MST_PURC_ACT_IO_R> dblPurcActIo = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R dblPurcActIo_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder dblPurcActIo_bldr = MCQueryApiBuilder.create(dblPurcActIo_t);
			dblPurcActIo_bldr.addWhereWithAnd(dblPurcActIo_t.purc_act_d_no.eq(bind("purc_act_d_no")));
			dblPurcActIo_bldr.addWhereWithAnd(dblPurcActIo_t.purc_act_d_seq.eq(bind("purc_act_d_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S02", dblPurcActIo, dblPurcActIo_bldr, dblPurcActD);
			
			// 登録済の仕入実績に上り電文の内容を反映して、Purc_Chk03チェック用の電文を作成する
			MCIndexKey idxPad = dblPurcActD.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
			MCIndexKey idxPai = dblPurcActIo.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);
			MCIndexKey idxHdr = up1().createIndex(Purc_Chk01_DtlR.$purc_act_no, Purc_Chk01_DtlR.$purc_act_seq);
			MCIndexKey idxDtl = up1().createIndex(Purc_Chk01_DtlR.$purc_act_d_no, Purc_Chk01_DtlR.$purc_act_d_seq);
			
			MCNumber maxHdrPegNo = MCNumber.ZERO;
			MCNumber maxDtlPegNo = (MCNumber) up1().max(Purc_Chk01_DtlR.$peg_no);
			if (isNull(maxDtlPegNo)) {
				maxDtlPegNo = MCNumber.ZERO;
			}
			else {
				maxDtlPegNo = maxDtlPegNo.add(1);
			}
			MCNumber maxIoPegNo = MCNumber.ZERO;
								
			for (MST_PURC_ACT_R paRow : dbcPurcAct) {
				
				Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR, MST_PURC_ACT_R> hdrMap = createMap_Purc_Chk03_HdrR_MST_PURC_ACT_R();
				// ヘッダ項目を更新するための電文を取得
				Purc_Chk01_DtlR chk01DtlRow = up1().getFirst(idxHdr, paRow.purc_act_no(), paRow.purc_act_seq());
				hdrMap.setWith(chk01DtlRow);
				
				// 仕入実績ヘッダを、PUrc_Chk03_HdrRに連携する。 ヘッダのpeg_noを発番する
				Purc_Chk03_HdrR hdrRow = Purc_Chk03_HdrR.create();
				copy(hdrRow, paRow, hdrMap);
				hdrRow.peg_no(maxHdrPegNo);
				maxHdrPegNo = maxHdrPegNo.add(1); 
				hdrL.add(hdrRow);
				
				// 仕入実績ヘッダに対応する仕入実績明細から、Purc_Chk03_DtlRに連携する
				// 上り電文に仕入実績明細NO+SEQで一致する電文があれば、仕入実績明細よりも電文を優先する
				MCList<MST_PURC_ACT_D_R> tgtPadL
					= dblPurcActD.subList(idxPad, paRow.purc_act_no(), paRow.purc_act_seq());
				for (MST_PURC_ACT_D_R padRow : tgtPadL) {
					
					Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR, MST_PURC_ACT_D_R> dtlMap = createMap_Purc_Chk03_DtlR_MST_PURC_ACT_D_R();
					
					Purc_Chk01_DtlR upParamRow = up1().getFirst(idxDtl, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					if (!isNull(upParamRow)) {
						dtlMap.setWith(upParamRow);
					}
					
					Purc_Chk03_DtlR dtlRow = Purc_Chk03_DtlR.create();
					copy(dtlRow, padRow, dtlMap);
					
					// ヘッダ紐付NOを設定する
					dtlRow.hdr_peg_no(hdrRow.peg_no());
					// 対応する上り電文がない場合、明細の紐付NOを設定する
					if (isNull(dtlRow.peg_no())) {
						dtlRow.peg_no(maxDtlPegNo);
						maxDtlPegNo = maxDtlPegNo.add(1);
					}					
					dtlRow.setAttributes(upParamRow);
					
					dtlL.add(dtlRow);
					
					// 仕入実績受払からPurc_Chk03_IoRに連携する
					MCList<MST_PURC_ACT_IO_R> tgtPaiL
						= dblPurcActIo.subList(idxPai, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					for (MST_PURC_ACT_IO_R paiRow : tgtPaiL) {
						
						Purc_Chk03_IoR ioRow = Purc_Chk03_IoR.create();
						copy(ioRow, paiRow, createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R());
						ioRow.dtl_peg_no(dtlRow.peg_no());
						ioRow.peg_no(maxIoPegNo);
						ioRow.setAttributes(upParamRow);
						maxIoPegNo = maxIoPegNo.add(1);
						
						ioL.add(ioRow);
						
					}
					
				}
				
			}
			
		}
		
		protected void divUpList(MCList<Purc_Chk01_DtlR> upL, MCList<Purc_Chk01_DtlR> insList, MCList<Purc_Chk01_DtlR> updList, MCList<Purc_Chk01_DtlR> delList) {
			for (Purc_Chk01_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insList.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updList.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delList.add(r);
				}
			}
		}
		
		/**
		 * 受領インボイス単位で登録・更新、または取消しようとしているかチェックします<br>
		 */
		protected void checkRcptIv() {
			
			MCMessageList msgL = new MCMessageList();
			MCList<Purc_Chk01_DtlR> insList = MCList.create(Purc_Chk01_DtlR.class);
			MCList<Purc_Chk01_DtlR> updList = MCList.create(Purc_Chk01_DtlR.class);
			MCList<Purc_Chk01_DtlR> delList = MCList.create(Purc_Chk01_DtlR.class);
			divUpList(up1(), insList, updList, delList);
			MCList<Purc_Chk01_DtlR> crtOrUpdList = MCList.create(Purc_Chk01_DtlR.class);
			crtOrUpdList.setAll(insList);
			crtOrUpdList.addAll(updList);
			MCIndexKey delKey = delList.createIndex(Purc_Chk01_DtlR.$purc_schd_no);
			MCIndexKey crtUpdKey = crtOrUpdList.createIndex(Purc_Chk01_DtlR.$purc_schd_no);
			// 上り電文に紐づく仕入実績明細
			MCList<MST_PURC_ACT_R> allPurcActL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder allPurcActL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
			MST_PURC_ACT_D_R t3 = MST_PURC_ACT_D_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			allPurcActL_bldr.setSelect(t3.purc_act_d_no,t4.purc_schd_no,t3.base_unit_qty);
			allPurcActL_bldr.addInnerJoin(t2, bracket( t2.rcpt_iv_mng_no.eq(t.rcpt_iv_mng_no)));
			allPurcActL_bldr.addInnerJoin(t3, bracket(t3.purc_act_no.eq(t2.purc_act_no)
					.and(t3.purc_act_seq.eq(t2.purc_act_seq))));
			allPurcActL_bldr.addInnerJoin(t4, bracket( t4.purc_schd_no.eq(t3.purc_schd_no)));
			allPurcActL_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
			allPurcActL_bldr.addConstWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
					.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
			dbSelect("MSBDL5180_MST_PURC_ACT_S03", allPurcActL, allPurcActL_bldr, up1(), null);
			
			MCIndexKey idxPurcActDL = allPurcActL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			MCIndexKey idxUp1 = up1().createIndex(Purc_Chk01_DtlR.$purc_act_d_no);
			// 上ってきていない電文に紐づく仕入実績明細
			MCList<MST_PURC_ACT_D_R> subPurcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			for (MST_PURC_ACT_R r : allPurcActL) {
				Purc_Chk01_DtlR up1R = up1().getFirst(idxUp1, r.getStringNE("purc_act_d_no"));
				if (isNull(up1R)){
					// 上ってきていない仕入実績を取得
					MST_PURC_ACT_D_R purcActDR = MST_PURC_ACT_D_R.create();
					purcActDR.purc_act_d_no(r.getStringNE("purc_act_d_no"));
					purcActDR.purc_schd_no(r.getStringNE("purc_schd_no"));
					purcActDR.base_unit_qty(r.getNumberNE("base_unit_qty"));
					subPurcActDL.add(purcActDR);
				}
			}
			MCIndexKey idxSubPurcActDL = subPurcActDL.createIndex(MST_PURC_ACT_D_R.$purc_schd_no);
			for (Purc_Chk01_DtlR dtlRow : up1()) {
				// 仕入予定NOに対応する受領インボイス情報を取得
				MCList<MST_PURC_SCHD_R> havIvPurcSchdL = getHavIvPurcSchdCache(dtlRow.purc_schd_no());
				if (!isNull(havIvPurcSchdL)) {
					// 受領インボイスに対応する仕入予定ＮＯをもつ上り電文が全て揃っているかチェックする
					for (MST_PURC_SCHD_R purcSchdRow : havIvPurcSchdL) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
							// 削除用の明細チェック上り電文に受領インボイス管理の仕入予定が全て含まれているか
							MCList<Purc_Chk01_DtlR> dtlParamL = delList.subList(delKey, purcSchdRow.purc_schd_no());
							MCNumber baseUnitQty = MCNumber.ZERO;
							for (Purc_Chk01_DtlR r : dtlParamL) {
								baseUnitQty = baseUnitQty.add(allPurcActL.getFirst(idxPurcActDL, r.purc_act_d_no()).getNumberNE("base_unit_qty"));
							}
							if ((dtlParamL.isEmpty()
									|| !isSame(baseUnitQty, purcSchdRow.base_unit_schd_qty()))
										&& !dtlRow.err_flg()) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk02_IoR.$purc_schd_no, MSBDL0031, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
								break;
							}
						}
						else {
							// 明細チェック上り電文の新規と更新を対象にチェック							
							// 新規or更新用の明細チェック上り電文に受領インボイス登録の仕入予定が含まれているか
							MCList<Purc_Chk01_DtlR> dtlParamL = crtOrUpdList.subList(crtUpdKey, purcSchdRow.purc_schd_no());
							MCNumber subBaseUnitQty = MCNumber.ZERO;
							if (!MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ()) && dtlParamL.isEmpty() && !dtlRow.err_flg()) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk01_DtlR.$purc_schd_no, MSBDL0030, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
								break;
							}
							else {
								subBaseUnitQty = dtlParamL.sum(Purc_Chk01_DtlR.$base_unit_qty);
								// 上ってきていない電文の数量も加算
								MCList<MST_PURC_ACT_D_R> notExistL = subPurcActDL.subList(idxSubPurcActDL, dtlRow.purc_schd_no());
								if (!isNull(subBaseUnitQty) && !notExistL.isEmpty()) {
									subBaseUnitQty = subBaseUnitQty.add(notExistL.sum(MST_PURC_ACT_D_R.$base_unit_qty));
								}
								
								if (isSame(dtlRow.purc_schd_no(), purcSchdRow.purc_schd_no())
										&& !isSame(subBaseUnitQty, purcSchdRow.base_unit_schd_qty())) {
									dtlRow.err_flg(true);
									msgL.add(new MCMessage(dtlRow, Purc_Chk01_DtlR.$rcpt_iv_mng_no, MSBDL0205
											, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)
											, purcSchdRow.purc_schd_no()
											, purcSchdRow.base_unit_schd_qty()
											, subBaseUnitQty));
									break;
								}
							}
						}
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
			
		}
		
		/**
		 * 仕入実績一覧登録から呼出された場合の、仕入実績登録用の電文情報を作成します
		 */
		protected void setPurcActDataForPurcActListReg(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {

			MCList<Purc_Chk01_DtlR> cl = up1().createInstance();
			MCList<Purc_Chk01_DtlR> dl = up1().createInstance();
			MCList<Purc_Chk01_DtlR> ul = up1().createInstance();
			up1().forEach(upr -> {
				if (MAC_DATA_CRUD_TYP.isCRT(upr.data_crud_typ())) {
					cl.add(upr);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upr.data_crud_typ())) {
					dl.add(upr);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upr.data_crud_typ())) {
					ul.add(upr);
				}
			});
			
			// 仕入実績登録オペレーション実行用
			crtParamForIns(hdrL,dtlL,ioL, cl);
			
			// 仕入実績削除オペレーション実行用
			crtParamForDel(hdrL, dtlL, ioL, dl);
			
			// 仕入実績更新オペレーション実行用
			crtParamForUpd(hdrL, dtlL, ioL, ul);
			
		}
		
		/**
		 * 仕入実績一覧登録から連携された新規登録用の電文を補完します
		 */
		protected void cmplPurcListRegParamForCrt(MCList<Purc_Chk01_DtlR> crtDtlList) {
			
			if (crtDtlList.size() > 0) {
				MCList<MST_PO_D_R> poD = MCList.create(MST_PO_D_R.class);
				crtDtlList.forEach(r -> {
					MST_PO_D_R pr = MST_PO_D_R.create();
					pr.po_d_no(r.po_d_no());
					poD.add(pr);
				});
				MST_PO_D_R poD_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(poD_t);
				MSW_PO_D_KEY_R k01 = MSW_PO_D_KEY_R.create("K01");
				MST_PO_R t2 = MST_PO_R.create("T2");
				MAM_BP_R m1 = MAM_BP_R.create("M1");
				MAM_BP_R m2 = MAM_BP_R.create("M2");
				MAM_BP_R m3 = MAM_BP_R.create("M3");
				MAM_BP_R m4 = MAM_BP_R.create("M4");
				dbWkInsert("MSBDL5180_MSW_PO_D_I01", poD, poD_bldr.getBaseDbc());
				poD_bldr.addSelect(t2.trd_cd, t2.trd_ptn_typ, t2.trd_cur_cd, t2.sppl_cd, m1.asppl_cd, m2.bsppl_cd, m3.psppl_cd, m4.ap_cred_cd);
				poD_bldr.addInnerJoin(k01, bracket( poD_t.po_d_no.eq(k01.po_d_no)));
				poD_bldr.addLeftOuterJoin(t2, bracket( poD_t.po_no.eq(t2.po_no)));
				poD_bldr.addLeftOuterJoin(m1, bracket( t2.sppl_cd.eq(m1.bp_cd)));
				poD_bldr.addLeftOuterJoin(m2, bracket( m1.asppl_cd.eq(m2.bp_cd)));
				poD_bldr.addLeftOuterJoin(m3, bracket( m2.bsppl_cd.eq(m3.bp_cd)));
				poD_bldr.addLeftOuterJoin(m4, bracket( m3.psppl_cd.eq(m4.bp_cd)));
				dbSelect("MSBDL5180_MST_PO_D_S02", poD, poD_bldr);
				dbWkDelete("MSBDL5180_MSW_PO_D_D01", poD_bldr.getBaseDbc());
				
				MCList<MAVM_ITM_UNIT_R> itmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
				MAVM_ITM_UNIT_R itmUnit_t = MAVM_ITM_UNIT_R.create("T");
				MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(itmUnit_t);
				itmUnit_bldr.addWhereWithAnd(itmUnit_t.itm_cd.eq(bind("itm_cd"))
						.and(itmUnit_t.itm_sub1.eq(bind("itm_sub1")))
						.and(itmUnit_t.itm_sub2.eq(bind("itm_sub2")))
						.and(itmUnit_t.itm_sub3.eq(bind("itm_sub3")))
						.and(itmUnit_t.unit_cd.eq(bind("trd_unit_cd"))));
				dbSelect("MSBDL5180_MAVM_ITM_UNIT_S01", itmUnit, itmUnit_bldr, crtDtlList);
				MCIndexKey iuIdx = itmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, 
						MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
				
				for (Purc_Chk01_DtlR dtlRow : crtDtlList) {
					
					// 発注明細もしくは受領インボイス明細から補完
					MCRow podRow = !isNull(dtlRow.rcpt_iv_d_no()) ?
						getRcptIvDCache().get(dtlRow.rcpt_iv_d_no()) : poD.getFirst(MST_PO_D_R.$po_d_no, dtlRow.po_d_no());
					
					if (isNull(dtlRow.trd_ptn_typ())) {
						dtlRow.trd_cd(podRow.getStringNE("trd_cd"));
						dtlRow.trd_ptn_typ(podRow.getStringNE("trd_ptn_typ"));
					}
					
					if (isNull(dtlRow.trd_cur_cd())) {
						dtlRow.trd_cur_cd(podRow.getStringNE("trd_cur_cd"));
					}
					if (isNull(dtlRow.ptax_cur_cd())) {
						dtlRow.ptax_cur_cd(getCo().ptax_cur_cd());
					}
					if (isNull(dtlRow.base_cur_cd())) {
						dtlRow.base_cur_cd(getCo().base_cur_cd());
					}
					if (isNull(dtlRow.sppl_cd())) {
						dtlRow.sppl_cd(podRow.getStringNE("sppl_cd"));
						dtlRow.asppl_cd(podRow.getStringNE("asppl_cd"));
						dtlRow.bsppl_cd(podRow.getStringNE("bsppl_cd"));
						dtlRow.psppl_cd(podRow.getStringNE("psppl_cd"));
						dtlRow.cred_cd(podRow.getStringNE("ap_cred_cd"));
					}					
					dtlRow.purc_id_typ(podRow.getStringNE("purc_id_typ"));
					
					// 荷姿単位の設定
					MAVM_ITM_UNIT_R itmUnitRow = itmUnit.getFirst(iuIdx, dtlRow.itm_cd(), 
							dtlRow.itm_sub1(),dtlRow.itm_sub2(), dtlRow.itm_sub3(), dtlRow.trd_unit_cd());
					if (itmUnitRow.pack_flg()) {
						dtlRow.pack_unit_cd(dtlRow.trd_unit_cd());
						dtlRow.pack_unit_qty(dtlRow.trd_unit_qty());
					}
					else {
						dtlRow.pack_unit_cd(dtlRow.base_unit_cd());
						dtlRow.pack_unit_qty(dtlRow.base_unit_qty());
					}
					
				}
				
			}
			
		}
		
		/**
		 * 仕入実績一覧登録から連携された更新用の電文を補完します
		 */
		protected void cmplPurcListRegParamForUpd(MCList<Purc_Chk01_DtlR> updDtlList) {
			
			// 荷姿単位、荷姿単位数量の設定
			MCList<MAVM_ITM_UNIT_R> itmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(t);
			itmUnit_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3")))
					.and(t.unit_cd.eq(bind("trd_unit_cd"))));
			dbSelect("MSBDL5180_MAVM_ITM_UNIT_S02", itmUnit, itmUnit_bldr, updDtlList);
			MCIndexKey iuIdx = itmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, 
					MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
			
			for (Purc_Chk01_DtlR dtlRow : updDtlList) {

				MAVM_ITM_UNIT_R itmUnitRow = itmUnit.getFirst(iuIdx, dtlRow.itm_cd(), 
						dtlRow.itm_sub1(),dtlRow.itm_sub2(), dtlRow.itm_sub3(), dtlRow.trd_unit_cd());
				if (itmUnitRow.pack_flg()) {
					dtlRow.pack_unit_cd(dtlRow.trd_unit_cd());
					dtlRow.pack_unit_qty(dtlRow.trd_unit_qty());
				}
				else {
					dtlRow.pack_unit_cd(dtlRow.base_unit_cd());
					dtlRow.pack_unit_qty(dtlRow.base_unit_qty());
				}
			}
		}
		
		/**
		 * Purc_Ins01(仕入実績登録)実行用の電文を作成する
		 */
		protected void crtParamForIns(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL,
				MCList<Purc_Chk01_DtlR> crtDtlList) {
			
			if (crtDtlList.size() == 0) {
				return;
			}
			
			// 電文の補完
			cmplPurcListRegParamForCrt(crtDtlList);
			
			// 仕入ヘッダまとめ条件のグループキー 
			String[]hdrGrpKey={
					Purc_Chk01_DtlR.$trd_cd,
					Purc_Chk01_DtlR.$trd_ptn_typ,
					Purc_Chk01_DtlR.$po_no,
					Purc_Chk01_DtlR.$purc_dpt_cd,
					Purc_Chk01_DtlR.$purc_usr_cd,
					Purc_Chk01_DtlR.$sppl_cd,
					Purc_Chk01_DtlR.$asppl_cd,
					Purc_Chk01_DtlR.$trd_cur_cd,
					Purc_Chk01_DtlR.$base_cur_cd,
					Purc_Chk01_DtlR.$ptax_cur_cd,
					Purc_Chk01_DtlR.$rcpt_iv_no,
					Purc_Chk01_DtlR.$rcpt_iv_mng_no,
					Purc_Chk01_DtlR.$purc_dt,
					Purc_Chk01_DtlR.$ac_dt,
					Purc_Chk01_DtlR.$pay_basis_dt,
					Purc_Chk01_DtlR.$pay_schd_dt,
					Purc_Chk01_DtlR.$xrate,
					Purc_Chk01_DtlR.$ptax_dt,
					Purc_Chk01_DtlR.$ptax_xrate,
					Purc_Chk01_DtlR.$tterm_cd1,
					Purc_Chk01_DtlR.$tterm_rmrks1,
					Purc_Chk01_DtlR.$tterm_cd2,
					Purc_Chk01_DtlR.$tterm_rmrks2,
					Purc_Chk01_DtlR.$tterm_cd3,
					Purc_Chk01_DtlR.$tterm_rmrks3,
					Purc_Chk01_DtlR.$trd_rmrks,
					Purc_Chk01_DtlR.$intr_rmrks,
					Purc_Chk01_DtlR.$sub_char1,
					Purc_Chk01_DtlR.$sub_char2,
					Purc_Chk01_DtlR.$sub_char3
			};
			
			// 仕入ヘッダ単位の明細のリスト
			MCList<Purc_Chk01_DtlR>[] hdrGrpLists = crtDtlList.groupList(hdrGrpKey);

			// 仕入実績登録SV用電文に格納			
			for (MCList<Purc_Chk01_DtlR> hdrGrp : hdrGrpLists) {
				if (isNull(hdrGrp)) {
					continue;
				}
				
				Purc_Ins01_HdrR hdr = Purc_Ins01_HdrR.create();
				
				// 仕入実績登録SV用の上り電文(ヘッダ)に追加
				copy(hdr, hdrGrp.get(0), createMap_Purc_Ins01_HdrR_Purc_Chk01_DtlR());
				hdr.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdr.peg_no(getHdrPegNo());
				hdrL.add(hdr);
				
				// 仕入実績登録SV用の上り電文(明細)に追加
				// ヘッダに紐付く明細登録用リスト
				MCList<Purc_Ins01_DtlR> hdrPegList = MCList.create(Purc_Ins01_DtlR.class);
				addAll(hdrPegList, hdrGrp, createMap_Purc_Ins01_DtlR_Purc_Chk01_DtlR());
				
				// ヘッダ紐付NOをセット
				hdrPegList.setNumber(Purc_Ins01_DtlR.$hdr_peg_no, hdr.peg_no());
				dtlL.addAll(hdrPegList);
				
				// 仕入実績登録SV用の上り電文(受払)に作成
				addAll(ioL, hdrPegList, createMap_Purc_Ins01_IoR_Purc_Ins01_DtlR());
				for (Purc_Ins01_IoR ioRow : ioL) {
					if (isNull(ioRow.peg_no())) {
						ioRow.peg_no(getIoPegNo());
					}
				}
			}
			
		}
		
		
		/**
		 * 仕入実績ヘッダを取得します
		 * @param paramL 仕入実績一覧登録からのチェック上り電文
		 * @return 仕入実績ヘッダ
		 */
		protected MCList<MST_PURC_ACT_R> getPurcAct(MCList<Purc_Chk01_DtlR> paramL) {
			MCList<Purc_Chk01_DtlR> paNoList = paramL.groupBy(Purc_Chk01_DtlR.$purc_act_no, Purc_Chk01_DtlR.$purc_act_seq);
			MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_ACT_S04", paL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), paNoList);
			return paL;
		}
		/**
		 * 仕入実績明細を取得します
		 * @param paL 仕入実績ヘッダ
		 * @return 仕入実績明細
		 */
		protected MCList<MST_PURC_ACT_D_R> getPurcActD(MCList<MST_PURC_ACT_R> paL) {
			MCList<MST_PURC_ACT_D_R> padL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			padL_bldr.addSelect(t3.arr_ptn_typ);
			padL_bldr.addSelect(t2.abort_flg);
			padL_bldr.addLeftOuterJoin(t2, bracket( t.purc_schd_no.eq(t2.purc_schd_no)));
			padL_bldr.addLeftOuterJoin(t3, bracket( t2.arr_schd_no.eq(t3.arr_schd_no)));
			padL_bldr.addWhereWithAnd(t.purc_act_no.eq(bind("purc_act_no")));
			padL_bldr.addWhereWithAnd(t.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S05", padL, padL_bldr, paL);
			return padL;
		}
		/**
		 * 仕入実績受払を取得します
		 * @param padL 仕入実績明細
		 * @return 仕入実績受払
		 */
		protected MCList<MST_PURC_ACT_IO_R> getPurcActIo(MCList<MST_PURC_ACT_D_R> padL) {
			MCList<MST_PURC_ACT_IO_R> paIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paIoL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_ACT_R t1 = MST_ARR_ACT_R.create("T1");
			paIoL_bldr.addLeftOuterJoin(t1, bracket( t.arr_act_no.eq(t1.arr_act_no)
					.and(t1.can_flg.eq(value(false)))));
			paIoL_bldr.addSelect(t1.ship_fr_valid_dt);
			paIoL_bldr.addWhereWithAnd(t.purc_act_d_no.eq(bind("purc_act_d_no")));
			paIoL_bldr.addWhereWithAnd(t.purc_act_d_seq.eq(bind("purc_act_d_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S03", paIoL, paIoL_bldr, padL);
			return paIoL;
		}
				
		/**
		 * Purc_Upd01(仕入実績訂正)実行用の電文を作成します
		 * @param hdrL 作成したヘッダ電文を格納
		 * @param dtlL 作成した明細電文を格納
		 * @param ioL 作成した詳細電文を格納
		 * @param paramL データ更新区分 UPDのデータ
		 */
		protected void crtParamForUpd(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, MCList<Purc_Chk01_DtlR> paramL) {
			
			if (paramL.size() == 0) {
				return;
			}
			
			// 電文の補完
			cmplPurcListRegParamForUpd(paramL);
			
			MCIndexKey idxHdr = paramL.createIndex(Purc_Chk01_DtlR.$purc_act_no, Purc_Chk01_DtlR.$purc_act_seq);
			MCIndexKey idxDtl = paramL.createIndex(Purc_Chk01_DtlR.$purc_act_d_no, Purc_Chk01_DtlR.$purc_act_d_seq);

			// 更新対象の仕入実績を取得する
			MCList<MST_PURC_ACT_R> paL = getPurcAct(paramL);
			MCList<MST_PURC_ACT_D_R> padL = getPurcActD(paL);
			MCList<MST_PURC_ACT_IO_R> paIoL = getPurcActIo(padL);
			
			MCIndexKey idxPad = padL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
			MCIndexKey idxPaIo = paIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);
			
			for (MST_PURC_ACT_R paRow : paL) {
				
				Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD<Purc_Ins01_HdrR, MST_PURC_ACT_R> hdrMap = createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD();
				// 仕入実績NO+seqが一致する上り電文の値をヘッダ電文に連携
				Purc_Chk01_DtlR paramRow = paramL.getFirst(idxHdr, paRow.purc_act_no(), paRow.purc_act_seq());
				hdrMap.setWith(paramRow);
				
				hdrMap.setDataCrudTyp(MAC_DATA_CRUD_TYP.UPD.value());
				
				Purc_Ins01_HdrR hdrRow = Purc_Ins01_HdrR.create();
				copy(hdrRow, paRow, hdrMap);
				hdrRow.can_ac_dt(paramRow.can_ac_dt());
				hdrRow.peg_no(getHdrPegNo());
				hdrL.add(hdrRow);
				
				// 仕入実績ヘッダ ⇒ Purc_Ins01_HdrRでマッピング
				MCList<MST_PURC_ACT_D_R> tgtPadL
					= padL.subList(idxPad, paRow.purc_act_no(), paRow.purc_act_seq());

				for (MST_PURC_ACT_D_R padRow : tgtPadL) {
					
					// 仕入実績明細NO+SEQが一致する上り電文がある場合は、仕入実績明細更新用の電文に連携する
					// ない場合は仕入実績明細の値をそのまま連携する
					Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> dtlMap = createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD();
					dtlMap.setWith(hdrRow);
					dtlMap.setDataCrudTyp(MAC_DATA_CRUD_TYP.UPD.value());
					
					Purc_Chk01_DtlR tgtChk01DtlRow = paramL.getFirst(idxDtl, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					if (!isNull(tgtChk01DtlRow)) {
						dtlMap.setWith(tgtChk01DtlRow);
					}
					
					// 明細電文を追加
					Purc_Ins01_DtlR dtlRow = Purc_Ins01_DtlR.create();
					copy(dtlRow, padRow, dtlMap);
					if (isNull(dtlRow.peg_no())) {
						dtlRow.peg_no(getDtlPegNo());
					}
					dtlRow.setAttributes(tgtChk01DtlRow);
					dtlL.add(dtlRow);
					
					MCList<MST_PURC_ACT_IO_R> tgtPaIoL
					= paIoL.subList(idxPaIo, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					
					// 仕入実績明細に紐付く仕入実績受払が１件のみかチェックする
					// 仕入実績明細の件数：仕入実績受払の件数 = 1:1の場合のみ、明細の値で実績受払を上書きする
					boolean onlyOne = false;
					if (tgtPaIoL.size() == 1) {
						onlyOne = true;
					}
					
					for (MST_PURC_ACT_IO_R paIoRow : tgtPaIoL) {
					
						Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> ioMap = createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD();
						ioMap.setWith(dtlRow);
						if (!isNull(tgtChk01DtlRow) && onlyOne) {
							ioMap.setWith(tgtChk01DtlRow);
						}
						// 詳細電文を追加
						Purc_Ins01_IoR ioRow = Purc_Ins01_IoR.create();
						copy(ioRow, paIoRow, ioMap);
						ioRow.peg_no(getIoPegNo());
						ioRow.setAttributes(tgtChk01DtlRow);
						ioL.add(ioRow);
					
					}
					
				}
				
			}
		}

		/**
		 * RowMapper<br>
		 * 仕入実績ヘッダ(MST_PURC_ACT_R) -> 上り電文(Purc_Ins01_HdrR)<br>
		 * 仕入実績一覧登録の「訂正」で使用
		 */
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD<Purc_Ins01_HdrR,MST_PURC_ACT_R> createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD() {
			if (_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD == null) {
				_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD = new Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD<Purc_Ins01_HdrR, MST_PURC_ACT_R>();
			}
			_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD.setWith(null);
			_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD.setDataCrudTyp(null);
			return _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD;
		}
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD<Purc_Ins01_HdrR, MST_PURC_ACT_R> _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD = null;
		public class Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_UPD<D extends Purc_Ins01_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
			
			protected Purc_Chk01_DtlR _chk01DtlR;
			
			protected void setWith(Purc_Chk01_DtlR _chk01DtlR) {
				this._chk01DtlR = _chk01DtlR;
			}
			
			protected String _dataCrudTyp;
			
			protected void setDataCrudTyp(String _dataCrudTyp) {
				this._dataCrudTyp = _dataCrudTyp;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_rev, MST_PURC_ACT_R.$purc_act_rev);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate_cd, MST_PURC_ACT_R.$xrate_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate, MST_PURC_ACT_R.$xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, MST_PURC_ACT_R.$ptax_xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, MST_PURC_ACT_R.$pay_basis_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_schd_dt, MST_PURC_ACT_R.$pay_schd_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, MST_PURC_ACT_R.$ptax_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, MST_PURC_ACT_R.$rcpt_iv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_mng_no, MST_PURC_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(Purc_Ins01_HdrR.$ref_rcpt_iv_no, MST_PURC_ACT_R.$ref_rcpt_iv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, MST_PURC_ACT_R.$trd_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, MST_PURC_ACT_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, MST_PURC_ACT_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, MST_PURC_ACT_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, MST_PURC_ACT_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				if (MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {
					dest.purc_dt(_chk01DtlR.purc_dt());
					dest.ac_dt(_chk01DtlR.ac_dt());
					dest.pay_basis_dt(_chk01DtlR.pay_basis_dt());
					dest.pay_schd_dt(_chk01DtlR.pay_schd_dt());
					dest.ptax_dt(_chk01DtlR.ptax_dt());

					dest.purc_usr_cd(_chk01DtlR.purc_usr_cd());
					dest.purc_dpt_cd(_chk01DtlR.purc_dpt_cd());
					dest.wg_cd(_chk01DtlR.wg_cd());

					dest.xrate(_chk01DtlR.xrate());
					dest.ptax_xrate(_chk01DtlR.ptax_xrate());
					
					dest.trd_rmrks(_chk01DtlR.trd_rmrks());
					dest.intr_rmrks(_chk01DtlR.intr_rmrks());
					dest.sub_char1(_chk01DtlR.sub_char1());
					dest.sub_char2(_chk01DtlR.sub_char2());
					dest.sub_char3(_chk01DtlR.sub_char3());
					
					dest.tterm_cd1(_chk01DtlR.tterm_cd1());
					dest.tterm_rmrks1(_chk01DtlR.tterm_rmrks1());
					dest.tterm_cd2(_chk01DtlR.tterm_cd2());
					dest.tterm_rmrks2(_chk01DtlR.tterm_rmrks2());
					dest.tterm_cd3(_chk01DtlR.tterm_cd3());
					dest.tterm_rmrks3(_chk01DtlR.tterm_rmrks3());
				}
				
			}
			
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績明細(MST_PURC_ACT_D_R) -> 上り電文(Purc_Ins01_DtlR)<br>
		 * 仕入実績一覧登録の「訂正」で使用
		 */
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<Purc_Ins01_DtlR,MST_PURC_ACT_D_R> createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD() {
			if (_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD == null) {
				_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD = new Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<Purc_Ins01_DtlR, MST_PURC_ACT_D_R>();
			}
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD.setWith((Purc_Ins01_HdrR)null);
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD.setWith((Purc_Chk01_DtlR)null);
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD.setDataCrudTyp(null);
			return _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD;
		}
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD = null;
		public class Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<D extends Purc_Ins01_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
			
			protected Purc_Ins01_HdrR _ins01HdrR;
			protected void setWith(Purc_Ins01_HdrR _ins01HdrR) {
				this._ins01HdrR = _ins01HdrR;
			}
			
			protected Purc_Chk01_DtlR _chk01DtlR;
			
			protected void setWith(Purc_Chk01_DtlR _chk01DtlR) {
				this._chk01DtlR = _chk01DtlR;
			}
			
			protected String _dataCrudTyp;
			
			protected void setDataCrudTyp(String _dataCrudTyp) {
				this._dataCrudTyp = _dataCrudTyp;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, MST_PURC_ACT_D_R.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_typ, MST_PURC_ACT_D_R.$ap_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, MST_PURC_ACT_D_R.$purc_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, MST_PURC_ACT_D_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, MST_PURC_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_id_typ, MST_PURC_ACT_D_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, MST_PURC_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, MST_PURC_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, MST_PURC_ACT_D_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$edi_flg, MST_PURC_ACT_D_R.$edi_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_re_arr_qty, MST_PURC_ACT_D_R.$base_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_bp_cd, MST_PURC_ACT_D_R.$bd_bp_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$po_no, MST_PURC_ACT_D_R.$po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$slo_no, MST_PURC_ACT_D_R.$slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_no, MST_PURC_ACT_D_R.$ref_purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_seq, MST_PURC_ACT_D_R.$ref_purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_no, MST_PURC_ACT_D_R.$ref_purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_seq, MST_PURC_ACT_D_R.$ref_purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, MST_PURC_ACT_D_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);
				addColumnPathMap(Purc_Ins01_DtlR.$gi_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gi_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gi_str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
				
				addColumnPathMap(Purc_Ins01_DtlR.$from_gd_cd, MST_PURC_ACT_D_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, MST_PURC_ACT_D_R.$disp_seq);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// ヘッダ紐付NO
				dest.hdr_peg_no(_ins01HdrR.peg_no());
				// データ更新区分
				dest.data_crud_typ(_dataCrudTyp);
				// 入荷パタン
				dest.arr_ptn_typ(src.getStringNE("arr_ptn_typ"));
				dest.abort_flg(MCBooleanUtil.dbStringToBoolean(src.getStringNE("abort_flg")));
				
				if (!isNull(_chk01DtlR)) {
					// 紐付NO
					dest.peg_no(_chk01DtlR.peg_no());

					// 変更前場所・格付情報
					dest.from_gd_cd(_chk01DtlR.from_gd_cd());
					dest.gi_wg_cd(_chk01DtlR.gi_wg_cd());
					dest.gi_loc_cd(_chk01DtlR.gi_loc_cd());
					dest.gi_str_ln_cd(_chk01DtlR.gi_str_ln_cd());
					
					if (MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {

						// 同時計上
						dest.sync_flg(_chk01DtlR.sync_flg());
						// 各種NO
						dest.arr_schd_no(_chk01DtlR.arr_schd_no());
						dest.arr_act_no(_chk01DtlR.arr_act_no());
						
						//部門
						dest.ap_dpt_cd(_chk01DtlR.ap_dpt_cd());
						dest.bd_dpt_cd(_chk01DtlR.bd_dpt_cd());
						dest.bd_wg_cd(_chk01DtlR.bd_wg_cd());
						
						// 場所・棚
						dest.in_to_loc_cd(_chk01DtlR.in_to_loc_cd());
						dest.in_to_loc_wg_cd(_chk01DtlR.in_to_loc_wg_cd());
						dest.str_ln_cd(_chk01DtlR.str_ln_cd());
						// ロット
						dest.crt_lot_flg(_chk01DtlR.crt_lot_flg());
						dest.lot_no(_chk01DtlR.lot_no());
						dest.sublot_no(_chk01DtlR.sublot_no());
						dest.bp_lot_no(_chk01DtlR.bp_lot_no());
						dest.ver_no(_chk01DtlR.ver_no());
						// 格付・良品区分・在庫識別区分
						dest.gd_cd(_chk01DtlR.gd_cd());
						dest.quality_typ(_chk01DtlR.quality_typ());
						dest.stk_insp_typ(_chk01DtlR.stk_insp_typ());
						dest.stk_id_typ(_chk01DtlR.stk_id_typ());
						// 数量
						dest.trd_unit_cd(_chk01DtlR.trd_unit_cd());
						dest.trd_unit_qty(_chk01DtlR.trd_unit_qty());
						dest.base_unit_cd(_chk01DtlR.base_unit_cd());
						dest.base_unit_qty(_chk01DtlR.base_unit_qty());
						dest.pack_unit_cd(_chk01DtlR.pack_unit_cd());
						dest.pack_unit_qty(_chk01DtlR.pack_unit_qty());
						// 単価・金額・税
						dest.interim_flg(_chk01DtlR.interim_flg());
						dest.upri_not_tgt_flg(_chk01DtlR.upri_not_tgt_flg());
						dest.ncv_flg(_chk01DtlR.ncv_flg());
						dest.trd_cur_upri(_chk01DtlR.trd_cur_upri());
						dest.trd_cur_proc_upri(_chk01DtlR.trd_cur_proc_upri());
						dest.trd_cur_onr_prov_upri(_chk01DtlR.trd_cur_onr_prov_upri());
						dest.trd_cur_amt(_chk01DtlR.trd_cur_amt());
						dest.trd_cur_proc_amt(_chk01DtlR.trd_cur_proc_amt());
						dest.trd_cur_onr_prov_amt(_chk01DtlR.trd_cur_onr_prov_amt());
						dest.trd_cur_tax_amt(_chk01DtlR.trd_cur_tax_amt());
						dest.trd_cur_dscnt_amt(_chk01DtlR.trd_cur_dscnt_amt());
						dest.dscnt_rsn_cd(_chk01DtlR.dscnt_rsn_cd());
						dest.wtax_rate(_chk01DtlR.wtax_rate());
						dest.wtax_amt(_chk01DtlR.wtax_amt());
						// 検収不良
						dest.accpt_dfct_flg(_chk01DtlR.accpt_dfct_flg());
						// 再入荷
						dest.re_arr_flg(_chk01DtlR.re_arr_flg());
						dest.re_arr_loc_cd(_chk01DtlR.re_arr_loc_cd());
						dest.re_arr_loc_wg_cd(_chk01DtlR.re_arr_loc_wg_cd());
						dest.re_arr_str_ln_cd(_chk01DtlR.re_arr_str_ln_cd());
						dest.re_arr_rqst_tm(_chk01DtlR.re_arr_rqst_tm());
						dest.re_arr_purc_schd_dt(_chk01DtlR.re_arr_purc_schd_dt());
						dest.re_arr_sync_flg(_chk01DtlR.re_arr_sync_flg());
						dest.trd_unit_re_arr_qty(_chk01DtlR.trd_unit_re_arr_qty());
						dest.base_unit_re_arr_qty(_chk01DtlR.base_unit_re_arr_qty());
						// 打切
						dest.abort_flg(_chk01DtlR.abort_flg());
						
						// 備考
						dest.trd_d_rmrks(_chk01DtlR.trd_d_rmrks());
						dest.intr_rmrks(_chk01DtlR.intr_d_rmrks());
						dest.sub_char1(_chk01DtlR.sub_d_char1());
						dest.sub_char2(_chk01DtlR.sub_d_char2());
						dest.sub_char3(_chk01DtlR.sub_d_char3());
												
						//業者納品書、出荷元期限
						dest.bp_dlv_slip_no(_chk01DtlR.bp_dlv_slip_no());
						dest.bp_dlv_slip_d_no(_chk01DtlR.bp_dlv_slip_d_no());
						dest.ship_fr_valid_dt(_chk01DtlR.ship_fr_valid_dt());
												
						dest.tax_cd(_chk01DtlR.tax_cd());
						dest.pay_crryovr_times(_chk01DtlR.pay_crryovr_times());
						dest.rsn_cd(_chk01DtlR.rsn_cd());
						dest.purc_cont_qty(_chk01DtlR.purc_cont_qty());
						dest.bd_itm_cd(_chk01DtlR.bd_itm_cd());
						dest.bd_itm_sub1(_chk01DtlR.bd_itm_sub1());
						dest.bd_itm_sub2(_chk01DtlR.bd_itm_sub2());
						dest.bd_itm_sub3(_chk01DtlR.bd_itm_sub3());
						dest.bd_sno1(_chk01DtlR.bd_sno1());
						dest.bd_sno2(_chk01DtlR.bd_sno2());
						dest.bd_sno3(_chk01DtlR.bd_sno3());
						dest.bd_sno4(_chk01DtlR.bd_sno4());
						dest.bd_lot_no(_chk01DtlR.bd_lot_no());
						dest.bd_sublot_no(_chk01DtlR.bd_sublot_no());
						dest.bd_ctg_cd(_chk01DtlR.bd_ctg_cd());
						dest.bd_oper_cd(_chk01DtlR.bd_oper_cd());
						dest.bd_iv_no(_chk01DtlR.bd_iv_no());
						dest.bd_loc_cd(_chk01DtlR.bd_loc_cd());
						dest.bd_po_no(_chk01DtlR.bd_po_no());
						dest.bd_slo_no(_chk01DtlR.bd_slo_no());
						dest.base_cur_upri(_chk01DtlR.base_cur_upri());
						dest.base_cur_proc_upri(_chk01DtlR.base_cur_proc_upri());
						dest.base_cur_onr_prov_upri(_chk01DtlR.base_cur_onr_prov_upri());
						dest.base_cur_amt(_chk01DtlR.base_cur_amt());
						dest.base_cur_proc_amt(_chk01DtlR.base_cur_proc_amt());
						dest.base_cur_onr_prov_amt(_chk01DtlR.base_cur_onr_prov_amt());
						dest.base_cur_tax_amt(_chk01DtlR.base_cur_tax_amt());
						dest.base_cur_dscnt_amt(_chk01DtlR.base_cur_dscnt_amt());
						dest.ptax_cur_upri(_chk01DtlR.ptax_cur_upri());
						dest.ptax_cur_proc_upri(_chk01DtlR.ptax_cur_proc_upri());
						dest.ptax_cur_onr_prov_upri(_chk01DtlR.ptax_cur_onr_prov_upri());
						dest.ptax_cur_amt(_chk01DtlR.ptax_cur_amt());
						dest.ptax_cur_proc_amt(_chk01DtlR.ptax_cur_proc_amt());
						dest.ptax_cur_onr_prov_amt(_chk01DtlR.ptax_cur_onr_prov_amt());
						dest.ptax_cur_tax_amt(_chk01DtlR.ptax_cur_tax_amt());
						dest.ptax_cur_dscnt_amt(_chk01DtlR.ptax_cur_dscnt_amt());
					}
				}
				
			}
			
			
			
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績受払(MST_PURC_ACT_IO_R) -> 上り電文(Purc_Ins01_IoR)<br>
		 * 仕入実績一覧登録の「取消」・「訂正」で使用
		 */
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<Purc_Ins01_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD() {
			if (_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD == null) {
				_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD = new Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<Purc_Ins01_IoR, MST_PURC_ACT_IO_R>();
			}
			_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD.setWith((Purc_Chk01_DtlR)null);
			_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD.setWith((Purc_Ins01_DtlR)null);
			return _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD;
		}
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD = null;
		public class Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<D extends Purc_Ins01_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
			
			protected Purc_Chk01_DtlR _chk01DtlR;
			protected Purc_Ins01_DtlR _ins01DtlR;
			
			protected void setWith(Purc_Chk01_DtlR _chk01DtlR) {
				this._chk01DtlR = _chk01DtlR;
			}
			protected void setWith(Purc_Ins01_DtlR _ins01DtlR) {
				this._ins01DtlR = _ins01DtlR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_upri, MST_PURC_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_upri, MST_PURC_ACT_IO_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_amt, MST_PURC_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_amt, MST_PURC_ACT_IO_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_tax_amt, MST_PURC_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_dscnt_amt, MST_PURC_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_upri, MST_PURC_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_upri, MST_PURC_ACT_IO_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_dscnt_amt, MST_PURC_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_amt, MST_PURC_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_amt, MST_PURC_ACT_IO_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_tax_amt, MST_PURC_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_upri, MST_PURC_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_upri, MST_PURC_ACT_IO_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_dscnt_amt, MST_PURC_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_amt, MST_PURC_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_amt, MST_PURC_ACT_IO_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_tax_amt, MST_PURC_ACT_IO_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$wtax_amt, MST_PURC_ACT_IO_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, MST_PURC_ACT_IO_R.$gi_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, MST_PURC_ACT_IO_R.$gi_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, MST_PURC_ACT_IO_R.$gi_str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, MST_PURC_ACT_IO_R.$gi_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(_ins01DtlR.data_crud_typ());
				dest.dtl_peg_no(_ins01DtlR.peg_no());
				dest.ship_fr_valid_dt(src.getDateNE("ship_fr_valid_dt"));
				
				// 更新対象の仕入実績明細に対して、上り電文が連携された場合のみ、明細の値を詳細にコピーする
				// 上り電文がない場合は、仕入実績受払の値を引継ぐ
				if (!isNull(_chk01DtlR)) {					
					dest.from_gd_cd(_ins01DtlR.from_gd_cd());
					dest.data_crud_typ(_ins01DtlR.data_crud_typ());
					dest.purc_act_d_no(_ins01DtlR.purc_act_d_no());
					dest.purc_act_d_seq(_ins01DtlR.purc_act_d_seq());
					dest.in_to_loc_wg_cd(_ins01DtlR.in_to_loc_wg_cd());
					dest.in_to_loc_cd(_ins01DtlR.in_to_loc_cd());
					dest.str_ln_cd(_ins01DtlR.str_ln_cd());
					dest.ver_no(_ins01DtlR.ver_no());
					dest.crt_lot_flg(_ins01DtlR.crt_lot_flg());
					dest.lot_no(_ins01DtlR.lot_no());
					dest.sublot_no(_ins01DtlR.sublot_no());
					dest.gd_cd(_ins01DtlR.gd_cd());
					dest.quality_typ(_ins01DtlR.quality_typ());
					dest.bp_lot_no(_ins01DtlR.bp_lot_no());
					dest.bp_dlv_slip_no(_ins01DtlR.bp_dlv_slip_no());
					dest.bp_dlv_slip_d_no(_ins01DtlR.bp_dlv_slip_d_no());
					dest.ship_fr_valid_dt(_ins01DtlR.ship_fr_valid_dt());
					dest.trd_unit_cd(_ins01DtlR.trd_unit_cd());
					dest.trd_unit_qty(_ins01DtlR.trd_unit_qty());
					dest.base_unit_cd(_ins01DtlR.base_unit_cd());
					dest.base_unit_qty(_ins01DtlR.base_unit_qty());
					dest.pack_unit_cd(_ins01DtlR.pack_unit_cd());
					dest.pack_unit_qty(_ins01DtlR.pack_unit_qty());
					dest.trd_cur_upri(_ins01DtlR.trd_cur_upri());
					dest.trd_cur_proc_upri(_ins01DtlR.trd_cur_proc_upri());
					dest.trd_cur_onr_prov_upri(_ins01DtlR.trd_cur_onr_prov_upri());
					dest.trd_cur_amt(_ins01DtlR.trd_cur_amt());
					dest.trd_cur_proc_amt(_ins01DtlR.trd_cur_proc_amt());
					dest.trd_cur_onr_prov_amt(_ins01DtlR.trd_cur_onr_prov_amt());
					dest.trd_cur_tax_amt(_ins01DtlR.trd_cur_tax_amt());
					dest.trd_cur_dscnt_amt(_ins01DtlR.trd_cur_dscnt_amt());
					dest.base_cur_upri(_ins01DtlR.base_cur_upri());
					dest.base_cur_proc_upri(_ins01DtlR.base_cur_proc_upri());
					dest.base_cur_onr_prov_upri(_ins01DtlR.base_cur_onr_prov_upri());
					dest.base_cur_dscnt_amt(_ins01DtlR.base_cur_dscnt_amt());
					dest.base_cur_amt(_ins01DtlR.base_cur_amt());
					dest.base_cur_proc_amt(_ins01DtlR.base_cur_proc_amt());
					dest.base_cur_onr_prov_amt(_ins01DtlR.base_cur_onr_prov_amt());
					dest.base_cur_tax_amt(_ins01DtlR.base_cur_tax_amt());
					dest.ptax_cur_upri(_ins01DtlR.ptax_cur_upri());
					dest.ptax_cur_proc_upri(_ins01DtlR.ptax_cur_proc_upri());
					dest.ptax_cur_onr_prov_upri(_ins01DtlR.ptax_cur_onr_prov_upri());
					dest.ptax_cur_dscnt_amt(_ins01DtlR.ptax_cur_dscnt_amt());
					dest.ptax_cur_amt(_ins01DtlR.ptax_cur_amt());
					dest.ptax_cur_proc_amt(_ins01DtlR.ptax_cur_proc_amt());
					dest.ptax_cur_onr_prov_amt(_ins01DtlR.ptax_cur_onr_prov_amt());
					dest.ptax_cur_tax_amt(_ins01DtlR.ptax_cur_tax_amt());
					dest.sub_char1(_ins01DtlR.sub_char1());
					dest.sub_char2(_ins01DtlR.sub_char2());
					dest.sub_char3(_ins01DtlR.sub_char3());
					dest.purc_cont_qty(_ins01DtlR.purc_cont_qty());
					dest.arr_act_no(_ins01DtlR.arr_act_no());
					
				}

				
			}
			
			
		}
		
		/**
		 * Purc_Del01(仕入実績削除)実行用の電文を作成します
		 */
		protected void crtParamForDel(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, MCList<Purc_Chk01_DtlR> paramL) {
			
			if (paramL.size() == 0) {
				return;
			}
			MCIndexKey idxDtl = paramL.createIndex(Purc_Chk01_DtlR.$purc_act_d_no, Purc_Chk01_DtlR.$purc_act_d_seq);
			MCIndexKey idxActNo = paramL.createIndex(Purc_Chk01_DtlR.$purc_act_no);
			
			// 削除対象の仕入実績を取得する
			// 仕入実績ヘッダを取得
			MCList<Purc_Chk01_DtlR> paNoList = paramL.groupBy(Purc_Chk01_DtlR.$purc_act_no, Purc_Chk01_DtlR.$purc_act_seq);
			MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_ACT_S05", paL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), paNoList);

			// 仕入実績明細を取得
			MCList<MST_PURC_ACT_D_R> padL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R padL_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(padL_t);
			MST_PURC_SCHD_R padL_t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_SCHD_R padL_t3 = MST_ARR_SCHD_R.create("T3");
			padL_bldr.addSelect(padL_t3.arr_ptn_typ);
			padL_bldr.addLeftOuterJoin(padL_t2, bracket( padL_t.purc_schd_no.eq(padL_t2.purc_schd_no)));
			padL_bldr.addLeftOuterJoin(padL_t3, bracket( padL_t2.arr_schd_no.eq(padL_t3.arr_schd_no)));
			padL_bldr.addWhereWithAnd(padL_t.purc_act_no.eq(bind("purc_act_no")));
			padL_bldr.addWhereWithAnd(padL_t.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S06", padL, padL_bldr, paL);
			MCIndexKey idxPad = padL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
			
			// 仕入実績受払を取得
			MCList<MST_PURC_ACT_IO_R> paIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R paIoL_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paIoL_bldr = MCQueryApiBuilder.create(paIoL_t);
			MST_ARR_ACT_R paIoL_t1 = MST_ARR_ACT_R.create("T1");
			paIoL_bldr.addLeftOuterJoin(paIoL_t1, bracket(paIoL_t.arr_act_no.eq(paIoL_t1.arr_act_no)
					.and(paIoL_t1.can_flg.eq(value(false)))));
			paIoL_bldr.addSelect(paIoL_t1.ship_fr_valid_dt);
			paIoL_bldr.addWhereWithAnd(paIoL_t.purc_act_d_no.eq(bind("purc_act_d_no")));
			paIoL_bldr.addWhereWithAnd(paIoL_t.purc_act_d_seq.eq(bind("purc_act_d_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S04", paIoL, paIoL_bldr, padL);
			MCIndexKey idxPaIo = paIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);

			for (MST_PURC_ACT_R paRow : paL) {
				
				// 明細が全て削除か
				boolean isAllDel = true;
				
				Purc_Ins01_HdrR hdrRow = Purc_Ins01_HdrR.create();
				hdrRow.peg_no(getHdrPegNo());
				
				// 仕入実績ヘッダ ⇒ Purc_Ins01_HdrRでマッピング				
				MCList<MST_PURC_ACT_D_R> tgtPadL
					= padL.subList(idxPad, paRow.purc_act_no(), paRow.purc_act_seq());
				
				for (MST_PURC_ACT_D_R padRow : tgtPadL) {
					
					// 明細電文を追加
					Purc_Ins01_DtlR dtlRow = Purc_Ins01_DtlR.create();
					Purc_Chk01_DtlR tgtChk01DtlRow = paramL.getFirst(idxDtl, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					if (isNull(tgtChk01DtlRow)) {
						// 削除対象の伝票と同じ伝票だが、電文として上って来ていない場合は更新
						isAllDel = false;
						Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> dtlUpdMap = createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_UPD();
						dtlUpdMap.setWith(hdrRow);
						dtlUpdMap.setDataCrudTyp(MAC_DATA_CRUD_TYP.UPD.value());
						copy(dtlRow, padRow, dtlUpdMap);
					}
					else {
						// 削除対象として上ってきた場合は削除
						Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> dtlDelMap = createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL();
						dtlDelMap.setWith(hdrRow);
						dtlDelMap.setDataCrudTyp(MAC_DATA_CRUD_TYP.DEL.value());
						dtlDelMap.setWith(tgtChk01DtlRow);
						copy(dtlRow, padRow, dtlDelMap);
					}
					if (isNull(dtlRow.peg_no())) {
						dtlRow.peg_no(getDtlPegNo());
					}
					dtlRow.setAttributes(tgtChk01DtlRow);
					dtlL.add(dtlRow);
					
					MCList<MST_PURC_ACT_IO_R> tgtPaIoL
						= paIoL.subList(idxPaIo, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					
					for (MST_PURC_ACT_IO_R paIoRow : tgtPaIoL) {
						
						// 属する仕入実績明細のデータ更新区分でPurc_Ins01_IoRにマッピングする。
						Purc_Ins01_IoR ioRow = Purc_Ins01_IoR.create();
						if (!isNull(tgtChk01DtlRow)) {
							// 削除対象として上ってきた場合は削除
							Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> ioMap = createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL();
							ioMap.setWith(dtlRow);
							ioMap.setWith(tgtChk01DtlRow);
							copy(ioRow, paIoRow, ioMap);
						}
						else {
							// 削除対象の伝票と同じ伝票だが、電文として上って来ていない場合は更新
							Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> ioMap = createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_UPD();
							ioMap.setWith(dtlRow);
							copy(ioRow, paIoRow, ioMap);
						}
						ioRow.peg_no(getIoPegNo());
						ioRow.setAttributes(tgtChk01DtlRow);
						ioL.add(ioRow);
						
					}
					
				}
				
				// 属する明細が全て「削除」になった場合、Purc_Ins01_HdrRに「削除」でマッピング
				Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL<Purc_Ins01_HdrR, MST_PURC_ACT_R> map = createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL();
				if (isAllDel) {
					map.setDataCrudTyp(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					map.setDataCrudTyp(MAC_DATA_CRUD_TYP.UPD.value());
				}
				
				// ヘッダ電文を追加
				copy(hdrRow, paRow, map);
				hdrRow.can_ac_dt(paramL.getFirst(idxActNo, hdrRow.purc_act_no()).can_ac_dt());
				hdrL.add(hdrRow);
				
			}
			
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績ヘッダ(MST_PURC_ACT_R) -> 上り電文(Purc_Ins01_HdrR)<br>
		 * 仕入実績一覧登録の「取消」で使用
		 */
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL<Purc_Ins01_HdrR,MST_PURC_ACT_R> createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL() {
			if (_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL == null) {
				_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL = new Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL<Purc_Ins01_HdrR, MST_PURC_ACT_R>();
			}
			_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL.setDataCrudTyp(null);
			return _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL;
		}
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL<Purc_Ins01_HdrR, MST_PURC_ACT_R> _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL = null;
		public class Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_DEL<D extends Purc_Ins01_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
			
			protected String _dataCrudTyp;
			
			protected void setDataCrudTyp(String _dataCrudTyp) {
				this._dataCrudTyp = _dataCrudTyp;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_rev, MST_PURC_ACT_R.$purc_act_rev);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, MST_PURC_ACT_R.$purc_dpt_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, MST_PURC_ACT_R.$wg_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, MST_PURC_ACT_R.$purc_usr_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate_cd, MST_PURC_ACT_R.$xrate_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate, MST_PURC_ACT_R.$xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, MST_PURC_ACT_R.$ptax_xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, MST_PURC_ACT_R.$pay_basis_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_schd_dt, MST_PURC_ACT_R.$pay_schd_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, MST_PURC_ACT_R.$ptax_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ref_rcpt_iv_no, MST_PURC_ACT_R.$ref_rcpt_iv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, MST_PURC_ACT_R.$trd_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, MST_PURC_ACT_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, MST_PURC_ACT_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, MST_PURC_ACT_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, MST_PURC_ACT_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(_dataCrudTyp);
				// 仕入実績一覧登録にて、明細を取り消したが、全明細の削除とはならずに伝票は「更新」扱いとなった場合
				if (MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {
					// 仕入実績ヘッダから、仕入日を設定する
					dest.purc_dt(src.purc_dt());
					// 仕入実績ヘッダの計上日を、計上日・取消計上日に設定する
					dest.can_ac_dt(src.ac_dt());
					dest.ac_dt(src.ac_dt());
				}
				// 仕入実績一覧登録にて、全明細を削除し、「取消」扱いとなった場合
				else {
					dest.can_ac_dt(src.ac_dt());
				}
				
			}
			
			
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績明細(MST_PURC_ACT_D_R) -> 上り電文(Purc_Ins01_DtlR)<br>
		 * 仕入実績一覧登録の「取消」で使用
		 */
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL<Purc_Ins01_DtlR,MST_PURC_ACT_D_R> createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL() {
			if (_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL == null) {
				_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL = new Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL<Purc_Ins01_DtlR, MST_PURC_ACT_D_R>();
			}
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL.setWith((Purc_Ins01_HdrR)null);
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL.setWith((Purc_Chk01_DtlR)null);
			_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL.setDataCrudTyp(null);
			return _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL;
		}
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL = null;
		public class Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_DEL<D extends Purc_Ins01_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
			
			protected Purc_Ins01_HdrR _ins01HdrR;
			protected void setWith(Purc_Ins01_HdrR _ins01HdrR) {
				this._ins01HdrR = _ins01HdrR;
			}
			
			protected Purc_Chk01_DtlR _chk01DtlR;
			
			protected void setWith(Purc_Chk01_DtlR _chk01DtlR) {
				this._chk01DtlR = _chk01DtlR;
			}
			
			protected String _dataCrudTyp;
			
			protected void setDataCrudTyp(String _dataCrudTyp) {
				this._dataCrudTyp = _dataCrudTyp;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, MST_PURC_ACT_D_R.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_typ, MST_PURC_ACT_D_R.$ap_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, MST_PURC_ACT_D_R.$purc_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, MST_PURC_ACT_D_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, MST_PURC_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_id_typ, MST_PURC_ACT_D_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, MST_PURC_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, MST_PURC_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, MST_PURC_ACT_D_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$edi_flg, MST_PURC_ACT_D_R.$edi_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_re_arr_qty, MST_PURC_ACT_D_R.$base_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_wg_cd, MST_PURC_ACT_D_R.$bd_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_bp_cd, MST_PURC_ACT_D_R.$bd_bp_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$po_no, MST_PURC_ACT_D_R.$po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$slo_no, MST_PURC_ACT_D_R.$slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_no, MST_PURC_ACT_D_R.$ref_purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_seq, MST_PURC_ACT_D_R.$ref_purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_no, MST_PURC_ACT_D_R.$ref_purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_seq, MST_PURC_ACT_D_R.$ref_purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, MST_PURC_ACT_D_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// ヘッダ紐付NO
				dest.hdr_peg_no(_ins01HdrR.peg_no());
				// データ更新区分
				dest.data_crud_typ(_dataCrudTyp);
				// 入荷パタン
				dest.arr_ptn_typ(src.getStringNE("arr_ptn_typ"));
				
				if (!isNull(_chk01DtlR)) {
					// 紐付NO
					dest.peg_no(_chk01DtlR.peg_no());
					
					// 変更前場所・格付情報
					dest.from_gd_cd(_chk01DtlR.from_gd_cd());
					dest.gi_wg_cd(_chk01DtlR.gi_wg_cd());
					dest.gi_loc_cd(_chk01DtlR.gi_loc_cd());
					dest.gi_str_ln_cd(_chk01DtlR.gi_str_ln_cd());
					
					if (MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {

						// 同時計上
						dest.sync_flg(_chk01DtlR.sync_flg());
						// 各種NO
						dest.arr_schd_no(_chk01DtlR.arr_schd_no());
						dest.arr_act_no(_chk01DtlR.arr_act_no());
						// 場所・棚
						dest.in_to_loc_cd(_chk01DtlR.in_to_loc_cd());
						dest.in_to_loc_wg_cd(_chk01DtlR.in_to_loc_wg_cd());
						dest.str_ln_cd(_chk01DtlR.str_ln_cd());
						// ロット
						dest.crt_lot_flg(_chk01DtlR.crt_lot_flg());
						dest.lot_no(_chk01DtlR.lot_no());
						dest.sublot_no(_chk01DtlR.sublot_no());
						dest.bp_lot_no(_chk01DtlR.bp_lot_no());
						// 格付・良品区分・在庫識別区分
						dest.gd_cd(_chk01DtlR.gd_cd());
						dest.quality_typ(_chk01DtlR.quality_typ());
						dest.stk_insp_typ(_chk01DtlR.stk_insp_typ());
						dest.stk_id_typ(_chk01DtlR.stk_id_typ());
						// 数量
						dest.trd_unit_cd(_chk01DtlR.trd_unit_cd());
						dest.trd_unit_qty(_chk01DtlR.trd_unit_qty());
						dest.base_unit_cd(_chk01DtlR.base_unit_cd());
						dest.base_unit_qty(_chk01DtlR.base_unit_qty());
						dest.pack_unit_cd(_chk01DtlR.pack_unit_cd());
						dest.pack_unit_qty(_chk01DtlR.pack_unit_qty());
						// 単価・金額・税
						dest.trd_cur_upri(_chk01DtlR.trd_cur_upri());
						dest.trd_cur_proc_upri(_chk01DtlR.trd_cur_proc_upri());
						dest.trd_cur_onr_prov_upri(_chk01DtlR.trd_cur_onr_prov_upri());
						dest.trd_cur_amt(_chk01DtlR.trd_cur_amt());
						dest.trd_cur_proc_amt(_chk01DtlR.trd_cur_proc_amt());
						dest.trd_cur_onr_prov_amt(_chk01DtlR.trd_cur_onr_prov_amt());
						dest.trd_cur_tax_amt(_chk01DtlR.trd_cur_tax_amt());
						dest.trd_cur_dscnt_amt(_chk01DtlR.trd_cur_dscnt_amt());
						dest.dscnt_rsn_cd(_chk01DtlR.dscnt_rsn_cd());
						dest.wtax_rate(_chk01DtlR.wtax_rate());
						dest.wtax_amt(_chk01DtlR.wtax_amt());
						

					}
				}
				else {
					
					// 変更前場所・格付情報
					dest.from_gd_cd(src.gd_cd());
					dest.gi_wg_cd(src.in_to_loc_wg_cd());
					dest.gi_loc_cd(src.in_to_loc_cd());
					dest.gi_str_ln_cd(src.str_ln_cd());

				}
				
			}
			
			
			
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績受払(MST_PURC_ACT_IO_R) -> 上り電文(Purc_Ins01_IoR)<br>
		 * 仕入実績一覧登録の「取消」で使用
		 */
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL<Purc_Ins01_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL() {
			if (_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL == null) {
				_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL = new Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL<Purc_Ins01_IoR, MST_PURC_ACT_IO_R>();
			}
			_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL.setWith((Purc_Chk01_DtlR)null);
			_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL.setWith((Purc_Ins01_DtlR)null);
			return _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL;
		}
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL = null;
		public class Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_DEL<D extends Purc_Ins01_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
			
			protected Purc_Chk01_DtlR _chk01DtlR;
			protected Purc_Ins01_DtlR _ins01DtlR;
			
			protected void setWith(Purc_Chk01_DtlR _chk01DtlR) {
				this._chk01DtlR = _chk01DtlR;
			}
			protected void setWith(Purc_Ins01_DtlR _ins01DtlR) {
				this._ins01DtlR = _ins01DtlR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_upri, MST_PURC_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_upri, MST_PURC_ACT_IO_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_amt, MST_PURC_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_amt, MST_PURC_ACT_IO_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_tax_amt, MST_PURC_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_dscnt_amt, MST_PURC_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_upri, MST_PURC_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_upri, MST_PURC_ACT_IO_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_dscnt_amt, MST_PURC_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_amt, MST_PURC_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_amt, MST_PURC_ACT_IO_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_tax_amt, MST_PURC_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_upri, MST_PURC_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_upri, MST_PURC_ACT_IO_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_dscnt_amt, MST_PURC_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_amt, MST_PURC_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_amt, MST_PURC_ACT_IO_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_tax_amt, MST_PURC_ACT_IO_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$wtax_amt, MST_PURC_ACT_IO_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(_ins01DtlR.data_crud_typ());
				dest.dtl_peg_no(_ins01DtlR.peg_no());
				
				// 更新対象の仕入実績明細に対して、上り電文が連携された場合のみ、明細の値を詳細にコピーする
				if (!isNull(_chk01DtlR)) {
					dest.from_gd_cd(_ins01DtlR.from_gd_cd());
					dest.gi_loc_cd(_ins01DtlR.gi_loc_cd());
					dest.gi_wg_cd(_ins01DtlR.gi_wg_cd());
					dest.gi_str_ln_cd(_ins01DtlR.gi_str_ln_cd());
					dest.data_crud_typ(_ins01DtlR.data_crud_typ());
					dest.purc_act_d_no(_ins01DtlR.purc_act_d_no());
					dest.purc_act_d_seq(_ins01DtlR.purc_act_d_seq());
					dest.in_to_loc_wg_cd(_ins01DtlR.in_to_loc_wg_cd());
					dest.in_to_loc_cd(_ins01DtlR.in_to_loc_cd());
					dest.str_ln_cd(_ins01DtlR.str_ln_cd());
					dest.ver_no(_ins01DtlR.ver_no());
					dest.crt_lot_flg(_ins01DtlR.crt_lot_flg());
					dest.lot_no(_ins01DtlR.lot_no());
					dest.sublot_no(_ins01DtlR.sublot_no());
					dest.gd_cd(_ins01DtlR.gd_cd());
					dest.quality_typ(_ins01DtlR.quality_typ());
					dest.stk_insp_typ(_ins01DtlR.stk_insp_typ());
					dest.stk_id_typ(_ins01DtlR.stk_id_typ());
					dest.bp_lot_no(_ins01DtlR.bp_lot_no());
					dest.bp_dlv_slip_no(_ins01DtlR.bp_dlv_slip_no());
					dest.bp_dlv_slip_d_no(_ins01DtlR.bp_dlv_slip_d_no());
					dest.trd_unit_cd(_ins01DtlR.trd_unit_cd());
					dest.trd_unit_qty(_ins01DtlR.trd_unit_qty());
					dest.base_unit_cd(_ins01DtlR.base_unit_cd());
					dest.base_unit_qty(_ins01DtlR.base_unit_qty());
					dest.pack_unit_cd(_ins01DtlR.pack_unit_cd());
					dest.pack_unit_qty(_ins01DtlR.pack_unit_qty());
					dest.trd_cur_upri(_ins01DtlR.trd_cur_upri());
					dest.trd_cur_proc_upri(_ins01DtlR.trd_cur_proc_upri());
					dest.trd_cur_onr_prov_upri(_ins01DtlR.trd_cur_onr_prov_upri());
					dest.trd_cur_amt(_ins01DtlR.trd_cur_amt());
					dest.trd_cur_proc_amt(_ins01DtlR.trd_cur_proc_amt());
					dest.trd_cur_onr_prov_amt(_ins01DtlR.trd_cur_onr_prov_amt());
					dest.trd_cur_tax_amt(_ins01DtlR.trd_cur_tax_amt());
					dest.trd_cur_dscnt_amt(_ins01DtlR.trd_cur_dscnt_amt());
					dest.sub_char1(_ins01DtlR.sub_char1());
					dest.sub_char2(_ins01DtlR.sub_char2());
					dest.sub_char3(_ins01DtlR.sub_char3());
					dest.purc_cont_qty(_ins01DtlR.purc_cont_qty());
					dest.arr_act_no(_ins01DtlR.arr_act_no());
				}
			}
		}
	}

	/**
	 * Purc_Chk02オペレーション.<p>
	 *
	 * 入荷実績サービスから呼出すチェック処理<br>
	 */
	public class Purc_Chk02 extends MSBDL_PurcActRegService_MC_A.Purc_Chk02 {
		
		protected MCList<MST_PURC_SCHD_R> _purcSchdL = null;
		protected MCIndexKey _idxPurcSchd = null;
		
		protected MCNumber _hdrPegNo = MCNumber.ZERO;
		protected MCNumber _dtlPegNo = MCNumber.ZERO;
		protected MCNumber _ioPegNo = MCNumber.ZERO;
		
		protected MCNumber getNewHdrPegNo() {
			_hdrPegNo = _hdrPegNo.add(1);
			return _hdrPegNo;
		}
		protected MCNumber getNewDtlPegNo() {
			_dtlPegNo = _dtlPegNo.add(1);
			return _dtlPegNo; 
		}
		protected MCNumber getNewIoPegNo() {
			_ioPegNo = _ioPegNo.add(1);
			return _ioPegNo;
		}
		
		protected MCIndexKey _srchPurcHdrByKey = null;
		protected MCIndexKey _srchPurcDtlByKey = null;
		protected MCIndexKey _srchPurcDtlByHdrNo = null;
		protected MCIndexKey _srchPurcIoByKey = null;
		protected MCIndexKey _srchPurcIoByDtlNo = null;
		protected MCIndexKey _srchPurcIoByArrNo = null;
		
		protected String[] _ivGrpKey = new String[] {
				Purc_Ins01_DtlR.$arr_schd_no, MST_PURC_ACT_D_R.$rcpt_iv_d_no
		};
		protected String[] getIvGrpKey() {
			return _ivGrpKey;
		}
		
		protected String[] _notEachGrpKey = new String[] {
				Purc_Ins01_DtlR.$arr_schd_no, MST_PURC_ACT_D_R.$trd_unit_cd,
				Purc_Ins01_DtlR.$ac_dt, Purc_Ins01_DtlR.$arr_dt
		};
		protected String[] getNotEachGrpKey() {
			return _notEachGrpKey;
		}
		
		protected String[] _eachLotGrpKey = new String[] {
				Purc_Ins01_DtlR.$arr_schd_no, MST_PURC_ACT_D_R.$lot_no,
				MST_PURC_ACT_D_R.$trd_unit_cd, Purc_Ins01_DtlR.$ac_dt,
				Purc_Ins01_DtlR.$arr_dt
		};
		protected String[] getEachLotGrpKey() {
			return _eachLotGrpKey;
		}
		
		protected String[] _eachLotSublotGrpKey = new String[] {
				Purc_Ins01_DtlR.$arr_schd_no, MST_PURC_ACT_D_R.$lot_no,
				MST_PURC_ACT_D_R.$sublot_no, MST_PURC_ACT_D_R.$trd_unit_cd,
				Purc_Ins01_DtlR.$ac_dt, Purc_Ins01_DtlR.$arr_dt
		};
		protected String[] getEachLotSublotGrpKey() {
			return _eachLotSublotGrpKey;
		}
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			if (up0().size() == 0) {
				return;
			}
			
			getPurcSchd();
			
			initUpParam();
			
			initPegNo();
			
			// 受領インボイスキャッシュ
			initHavIvPurcSchdCache(up0(), true);
			
			// 受領インボイスチェック
			checkRcptIv();
			
			// 発注ヘッダキャッシュ
			initPoCacheByArrSchdNo(up0());
			
			// 発注明細キャッシュ
			initPoDCacheByArrSchdNo(up0());
			
			// 発注先キャッシュ
			initSpplCacheByStkBpCd(up0());
			
			// 仕入実績受払・仕入実績明細キャッシュ
			initPaCcByAaNo(up0());
			initPadCcByPaNo(getPaCcByAaNo());
			
			/** 仕入実績ヘッダ更新用 */
			MCList<Purc_Ins01_HdrR> updHdrL = MCList.create(Purc_Ins01_HdrR.create());
			/** 仕入実績明細更新用 */
			MCList<Purc_Ins01_DtlR> updDtlL = MCList.create(Purc_Ins01_DtlR.create());
			/** 仕入実績受払更新用 */
			MCList<Purc_Ins01_IoR> updIoL = MCList.create(Purc_Ins01_IoR.create());

			// 仕入実績SV用データ作成

			MCList<Purc_Chk02_IoR> udL = up0().createInstance();
			MCList<Purc_Chk02_IoR> cL = up0().createInstance();
			up0().forEach(r -> {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) ||
						MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					udL.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					cL.add(r);
				}
			});
			crtParamForUpdOrDel(updHdrL, updDtlL, updIoL, udL);
			crtParamForCrt(updHdrL, updDtlL, updIoL, cL);
			setBdDpt(updHdrL, updDtlL, updIoL);
			mergeForCrtAndUpd(updHdrL, updDtlL, updIoL);
			// チェック上り電文に明細紐付NOをコピー
			String[] destCols = {Purc_Chk03_IoR.$dtl_peg_no};
			String[] srcCols = {Purc_Chk03_IoR.$dtl_peg_no};
			copyByPegNo(up0(), destCols, updIoL, srcCols);

			// 共通チェック処理
			MSBDL_PurcActRegService.Purc_Chk03 chk03Ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			addAll(chk03Ope.up0(), updHdrL, createMap_Purc_Chk03_HdrR_Purc_Ins01_HdrR());
			addAll(chk03Ope.up1(), updDtlL, createMap_Purc_Chk03_DtlR_Purc_Ins01_DtlR());
			Map_Purc_Chk03_IoR_Purc_Ins01_IoR<Purc_Chk03_IoR,Purc_Ins01_IoR> map = createMap_Purc_Chk03_IoR_Purc_Ins01_IoR();
			map.setWith(up0());
			addAll(chk03Ope.up2(), updIoL, map);
			
			chk03Ope.up3().crt_param_cache_flg(true);
			chk03Ope.up3().arr_act_srvs_flg(true);
			chk03Ope.exec();
			
			// 詳細行のerr_flgをチェック上り電文に設定
			copyErrFlg(up0(), chk03Ope.down2());
			
			// 詳細行に紐付く明細行、またはヘッダ行がエラーの場合も、チェック上り電文にerr_flgを設定する
			for (Purc_Chk02_IoR row : up0()) {
				if (!row.err_flg()) {
					Purc_Chk03_DtlR dtlRow = chk03Ope.down1().getFirst(Purc_Chk03_DtlR.$peg_no, row.dtl_peg_no());
					if (!isNull(dtlRow)) {
						if (dtlRow.err_flg()) {
							row.err_flg(true);
							continue;
						}
					}
					Purc_Chk03_HdrR hdrRow = chk03Ope.down0().getFirst(Purc_Chk03_HdrR.$peg_no, dtlRow.hdr_peg_no());
					if (!isNull(hdrRow)) {
						if (hdrRow.err_flg()) {
							row.err_flg(true);
						}						
					}
				}
			}
			
			setDown();
			
		}
		
		protected void setBdDpt(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
			setDpt(dtlL, Purc_Ins01_DtlR.$bd_dpt_cd, Purc_Ins01_DtlR.$ac_dt);
			setDpt(dtlL, Purc_Ins01_DtlR.$ap_dpt_cd, null, Purc_Ins01_DtlR.$ac_dt, true);
			dtlL.addStringColumn("purc_dpt_cd");
			setDpt(dtlL, "purc_dpt_cd", null, Purc_Ins01_DtlR.$ac_dt, true);
			MCIndexKey up0Key = up0().createIndex(Purc_Chk02_IoR.$peg_no);
			MCIndexKey dtlLKey = dtlL.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			MCIndexKey ioLKey = ioL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
			for (Purc_Ins01_DtlR dtlR : dtlL) {
				if (dtlR.getBooleanNE("err_flg")) {
					for (Purc_Ins01_IoR errIoR : ioL.subList(ioLKey, dtlR.peg_no())) {
						Purc_Chk02_IoR up0R = up0().getFirst(up0Key, errIoR.peg_no());
						if (!isNull(up0R)) {
							up0R.err_flg(true);
							MCMessageList msgL = MCMessagePool.getMessageList();
							for (MCMessage msg : msgL) {
								if (dtlR == msg.getCauseRow() && isSame(MAUCL0118, msg.getID())) {
									msg.setCauseRow(up0R, null);
								}
							}
						}
					}
				}
			}
			for (Purc_Ins01_HdrR hdrR : hdrL) {
				Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlLKey, hdrR.peg_no());
				hdrR.purc_dpt_cd(dtlR.getStringNE("purc_dpt_cd"));
			}
			initUsrDptCache(hdrL);
			initDptCache(hdrL);
			checkValidDpt(hdrL, dtlL, ioL, up0Key, dtlLKey, ioLKey);
		}
		protected void checkValidDpt(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, MCIndexKey up0Key, MCIndexKey dtlLKey, MCIndexKey ioLKey) {
			for (Purc_Ins01_HdrR hdrR : hdrL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlLKey, hdrR.peg_no());
					if (!isValidUsrDpt(hdrR)) {
						MCMessageList msgL = MCMessagePool.getMessageList();
						Purc_Ins01_IoR ioR = ioL.getFirst(ioLKey, dtlR.peg_no());
						Purc_Chk02_IoR up0R = up0().getFirst(up0Key, ioR.peg_no());
						up0R.err_flg(true);
						msgL.add(new MCMessage(up0R, Purc_Chk02_IoR.$ac_dt, MSBDL0509,
								toYMDString(hdrR.ac_dt()), hdrR.purc_usr_cd(), hdrR.purc_dpt_cd()));
					}
					if (!isValidDpt(hdrR)) {
						MCMessageList msgL = MCMessagePool.getMessageList();
						Purc_Ins01_IoR ioR = ioL.getFirst(ioLKey, dtlR.peg_no());
						Purc_Chk02_IoR up0R = up0().getFirst(up0Key, ioR.peg_no());
						up0R.err_flg(true);
						msgL.add(new MCMessage(up0R, Purc_Chk02_IoR.$ac_dt, MSBDL0510,
								toYMDString(hdrR.ac_dt()), hdrR.purc_dpt_cd()));
					}
				}
			}
		}
		protected boolean isValidUsrDpt(Purc_Ins01_HdrR hdrR) {
			if (isNull(hdrR.purc_usr_cd())) {
				return true;
			}
			MAVM_USR_DPT_R usrDptR = _cacheUsrDpt.get(hdrR.ac_dt(), hdrR.purc_usr_cd(), hdrR.purc_dpt_cd());
			return !usrDptR.isEmpty();
		}
		protected FXUCL_MCDbcCacheStEnd<MAVM_USR_DPT_R> _cacheUsrDpt;
		protected void initUsrDptCache(MCList<Purc_Ins01_HdrR> hdrL) {
			if (_cacheUsrDpt == null) {
				_cacheUsrDpt = new FXUCL_MCDbcCacheStEnd<MAVM_USR_DPT_R>(
						MCQueryApiBuilder.create(MAVM_USR_DPT_R.create("USRDPT")),
						hdrL.groupBy(Purc_Ins01_HdrR.$purc_usr_cd, Purc_Ins01_HdrR.$purc_dpt_cd),
						new String[] {
								Purc_Ins01_HdrR.$purc_usr_cd, Purc_Ins01_HdrR.$purc_dpt_cd
						});
			}
		}
		protected boolean isValidDpt(Purc_Ins01_HdrR hdrR) {
			MAM_DPT_R dptR = _cacheDpt.get(hdrR.ac_dt(), hdrR.purc_dpt_cd());
			if (!isNull(dptR) && !dptR.purc_dpt_flg()) {
				return false;
			}
			return true;
		}
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected void initDptCache(MCList<Purc_Ins01_HdrR> hdrL) {
			if (_cacheDpt == null) {
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
						MCQueryApiBuilder.create(MAM_DPT_R.create("DPT")),
						hdrL.groupBy(Purc_Ins01_HdrR.$purc_dpt_cd),
						new String[] {
								Purc_Ins01_HdrR.$purc_dpt_cd
						});
			}
		}

		/**
		 * 仕入予定を取得します<br>
		 * (上り電文の仕入予定NOの補完に使用)<br>
		 */
		protected void getPurcSchd() {
			_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R purcSchdL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(purcSchdL_t);
			purcSchdL_bldr.setWhere(purcSchdL_t.arr_schd_no.eq(bind("arr_schd_no")));
			if (dbSelect("MSBDL5180_MST_PURC_SCHD_S02", _purcSchdL, purcSchdL_bldr, up0()) > 0) {
				_idxPurcSchd = _purcSchdL.createIndex("arr_schd_no");
			}
		}
		
		/**
		 * 上り電文初期設定
		 */
		protected void initUpParam() {
			for (Purc_Chk02_IoR ioRow : up0()) {
				ioRow.src_peg_no(ioRow.peg_no());
				ioRow.screen_tgt_flg(true);
				// ロットNO,サブロットNOのNULL文字補完
				if (isNull(ioRow.lot_no())) {
					ioRow.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(ioRow.sublot_no())) {
					ioRow.sublot_no(MAC_STR.NULL_VAL.value());
				}
				// 仕入予定ＮＯを補完
				MST_PURC_SCHD_R purcSchd = _purcSchdL.getFirst(_idxPurcSchd, ioRow.arr_schd_no());
				ioRow.purc_schd_no(purcSchd.purc_schd_no());
			}
		}
		
		/**
		 * 受領インボイス単位で登録・更新、または取消しようとしているかチェックします<br>
		 */
		protected void checkRcptIv() {
			
			MCMessageList msgL = new MCMessageList();
			
			boolean iscached = false;
			MCIndexKey crtOrUpdKey = null;
			MCList<Purc_Chk02_IoR> crtOrUpdList = up0().createInstance();
			MCIndexKey delKey = null;
			MCList<Purc_Chk02_IoR> delList = up0().createInstance();
			// 上り電文に紐づく仕入実績明細
			MCList<MST_PURC_SCHD_R> allPurcSchdL = MCList.create(MST_PURC_SCHD_R.class);

			up0().forEach(r -> {
				MST_PURC_SCHD_R row = MST_PURC_SCHD_R.create();
				row.purc_schd_no(r.purc_schd_no());
				allPurcSchdL.add(row);
			});
			if (allPurcSchdL.size() != 0) {
				MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
				MCQueryApiBuilder allPurcSchdL_bldr = MCQueryApiBuilder.create(t);
				MSW_PURC_SCHD_KEY_R t6 = MSW_PURC_SCHD_KEY_R.create("T6");
				MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
				MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
				MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
				MST_ARR_ACT_R t5 = MST_ARR_ACT_R.create("T5");
				allPurcSchdL.addBooleanColumn(MST_ARR_ACT_R.$sync_flg);
				allPurcSchdL_bldr.setSelect(t5.arr_act_no,t4.purc_schd_no,t5.base_unit_qty,t5.sync_flg,t5.arr_tm,t5.ac_dt);
				allPurcSchdL_bldr.addInnerJoin(t6, t.purc_schd_no.eq(t6.purc_schd_no));
				allPurcSchdL_bldr.addInnerJoin(t2, t2.arr_schd_no.eq(t.arr_schd_no));
				allPurcSchdL_bldr.addInnerJoin(t3, t3.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no));
				allPurcSchdL_bldr.addInnerJoin(t4, t4.arr_schd_no.eq(t3.arr_schd_no));
				allPurcSchdL_bldr.addLeftOuterJoin(t5, t5.arr_schd_no.eq(t3.arr_schd_no));
				allPurcSchdL_bldr.setWhere(t5.can_flg.eq(value(false)));
				createPurcSchdWK(allPurcSchdL, t, allPurcSchdL_bldr);
				dbSelect("MSBDL5180_MST_PURC_SCHD_S03", allPurcSchdL, allPurcSchdL_bldr);
				dbWkDelete("MSBDL5180_MSW_PURC_SCHD_D01", allPurcSchdL_bldr.getBaseDbc());
			}
			MCIndexKey idxAllArrActL_1 = allPurcSchdL.createIndex(MST_ARR_ACT_R.$arr_act_no);
			MCIndexKey idxAllArrActL_2 = allPurcSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			MCIndexKey idxUp0_1 = up0().createIndex(Purc_Chk02_IoR.$arr_act_no);
			MCIndexKey idxUp0_2 = up0().createIndex(Purc_Chk02_IoR.$purc_schd_no);
			// 入荷分割されていて、分割されたうちの一方が上ってきていない場合は取得
			MCList<MST_PURC_SCHD_R> subPurcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			for (MST_PURC_SCHD_R r : allPurcSchdL) {
				// 引っ張り上げるのは同時計上のみ。個別計上分は仕入実績が未登録(のはず)なので
				if (r.getBoolean(MST_ARR_ACT_R.$sync_flg)) {
					Purc_Chk02_IoR up0R = up0().getFirst(idxUp0_1, r.getStringNE("arr_act_no"));
					if (isNull(up0R)){
						// 上ってきていない仕入実績を取得
						subPurcSchdL.add(r);
					}
				}
			}
			MCIndexKey idxSubPurcActDL = subPurcSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			MCGroupByPolicy gp = new MCGroupByPolicy(Purc_Chk02_IoR.$arr_dt, Purc_Chk02_IoR.$ac_dt);
			
			// 入荷実績一覧登録画面の同時計上ＦＬＧがオフの場合は暫定買掛の仕入実績登録のため、チェック対象外
			MCList<Purc_Chk02_IoR> chkList = up0().subList(Purc_Chk02_IoR.$arr_sync_flg, true);
			for (Purc_Chk02_IoR ioRow : chkList) {
				
				// 仕入予定NOに対応する受領インボイス情報を取得
				MCList<MST_PURC_SCHD_R> havIvPurcSchdL = getHavIvPurcSchdCache(ioRow.purc_schd_no());
				if (!isNull(havIvPurcSchdL)) {
					// 上り電文の対象行自身にエラーはなくても、同じ受領インボイス管理ＮＯを持つ仕入予定にエラーがあったとき、
					//　同じ受領インボイス管理ＮＯを持つ仕入予定に一致する上り電文は、一律エラーにするために必要なリスト
					MCList<MST_PURC_SCHD_R> errL = MCList.create(MST_PURC_SCHD_R.class);
					if (!iscached) {
						chkList.forEach(r-> {
							if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) ||
									MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
								crtOrUpdList.add(r);
							}
							else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
								delList.add(r);
							}
						});
						crtOrUpdKey = crtOrUpdList.createIndex(Purc_Chk02_IoR.$purc_schd_no);
						delKey = delList.createIndex(Purc_Chk02_IoR.$purc_schd_no);
						iscached = true;
					}
					// 受領インボイスに対応する仕入予定ＮＯをもつ上り電文が全て揃っているかチェックする
					for (MST_PURC_SCHD_R purcSchdRow : havIvPurcSchdL) {
						if (isNull(purcSchdRow.arr_schd_no())) {
							// 仕入諸掛分はチェック対象外とする（本サービス内で引っ張り上げるのでチェックする必要がない）
							continue;
						}

						if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
							// 明細チェック上り電文の削除を対象にチェック
							// 削除用の明細チェック上り電文に受領インボイス管理の仕入予定が全て含まれているか
							MCList<Purc_Chk02_IoR> dtlParamL = delList.subList(delKey, purcSchdRow.purc_schd_no());
							MCNumber baseUnitQty = MCNumber.ZERO;
							for (Purc_Chk02_IoR r : dtlParamL) {
								baseUnitQty = baseUnitQty.add(allPurcSchdL.getFirst(idxAllArrActL_1, r.arr_act_no()).getNumberNE("base_unit_qty"));
							}
							if ((dtlParamL.isEmpty()
									|| !isSame(baseUnitQty, purcSchdRow.base_unit_schd_qty()))
										&& !ioRow.err_flg()) {
								errL.add(purcSchdRow);
								ioRow.err_flg(true);
								msgL.add(new MCMessage(ioRow, Purc_Chk02_IoR.$purc_schd_no, 
										MSBDL0031, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
								break;
							}
						}
						else {
							// 明細チェック上り電文の新規と更新を対象にチェック
							// 新規or更新用の明細チェック上り電文に受領インボイス登録の仕入予定が含まれているか
							MCList<Purc_Chk02_IoR> ioParamL = crtOrUpdList.subList(crtOrUpdKey, purcSchdRow.purc_schd_no());
							MCNumber subBaseUnitQty = MCNumber.ZERO;
							MST_PURC_SCHD_R tmpR = allPurcSchdL.getFirst(idxAllArrActL_2, ioRow.purc_schd_no());
							if (isNull(tmpR) && ioParamL.isEmpty() && !ioRow.err_flg()) {
								errL.add(purcSchdRow);
								ioRow.err_flg(true);
								msgL.add(new MCMessage(ioRow, Purc_Chk02_IoR.$purc_schd_no,
										MSBDL0030, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
								break;
							}
							else {
								subBaseUnitQty = ioParamL.sum("base_unit_qty");
								// 上ってきていない電文の数量も加算
								MCList<MST_PURC_SCHD_R> notExistL = subPurcSchdL.subList(idxSubPurcActDL, ioRow.purc_schd_no());
								if (!isNull(subBaseUnitQty) && !notExistL.isEmpty()) {
									subBaseUnitQty = subBaseUnitQty.add(notExistL.sum(MST_ARR_ACT_R.$base_unit_qty));
								}
								if (isSame(ioRow.purc_schd_no(), purcSchdRow.purc_schd_no())
										&& !isSame(subBaseUnitQty, purcSchdRow.base_unit_schd_qty())) {
									errL.add(purcSchdRow);
									ioRow.err_flg(true);
									msgL.add(new MCMessage(ioRow, Purc_Chk02_IoR.$purc_schd_no, MSBDL0205
											, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)
											, purcSchdRow.purc_schd_no()
											, purcSchdRow.base_unit_schd_qty()
											, subBaseUnitQty));
									break;
								}
							}
							
							// 同一受領インボイス明細ＮＯに対し、異なる計上日、入荷日を設定している場合エラー
							if (!isNull(purcSchdRow.getStringNE(MST_RCPT_IV_D_R.$rcpt_iv_d_no))) {
								MCList<Purc_Chk02_IoR> grpL = ioParamL.groupBy(gp);
								if (grpL.size() > 1) {
									ioRow.err_flg(true);
									msgL.add(new MCMessage(ioRow,
											Purc_Chk02_IoR.$rcpt_iv_d_no, MSBDL0608,
											purcSchdRow.getStringNE(MST_RCPT_IV_D_R.$rcpt_iv_d_no)));
								}
							}
						}
					}
					MCIndexKey idxErrL = errL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
					if (!errL.isEmpty()) {
						for (MST_PURC_SCHD_R trgtR : havIvPurcSchdL) {
							if (isNull(trgtR.arr_schd_no())) {
								// 仕入諸掛分はチェック対象外とする（本サービス内で引っ張り上げるのでチェックする必要がない）
								continue;
							}
							for (Purc_Chk02_IoR r : up0().subList(idxUp0_2, trgtR.purc_schd_no())) {
								if (!r.err_flg() && !errL.contains(idxErrL, r.purc_schd_no())) {
									if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
										msgL.add(new MCMessage(r, Purc_Chk02_IoR.$purc_schd_no, 
												MSBDL0031, trgtR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
									}
									else {
										msgL.add(new MCMessage(r, Purc_Chk02_IoR.$purc_schd_no,
												MSBDL0030, trgtR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
									}
									r.setBooleanNE(Purc_Chk02_IoR.$err_flg, true);
								}
							}
						}
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
			
		}
		/**
		 * 仕入予定のワークテーブルにデータを登録する。
		 * @param allPurcSchdL 仕入予定
		 * @param allPurcSchdL_bldr 
		 * @param t 
		 */
		protected void createPurcSchdWK(MCList<MST_PURC_SCHD_R> allPurcSchdL,
				MST_PURC_SCHD_R t, MCQueryApiBuilder allPurcSchdL_bldr) {
			dbWkDelete("MSBDL5180_MSW_PURC_SCHD_D02", allPurcSchdL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5180_MSW_PURC_SCHD_I01", allPurcSchdL, allPurcSchdL_bldr.getBaseDbc());
		}
		
		/**
		 * 紐付NO初期化
		 */
		protected void initPegNo() {
			MCNumber max = (MCNumber) up0().max(Purc_Ins01_IoR.$peg_no);
			_ioPegNo = max.add(1);
			
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 新規用の電文を作成します
		 */
		protected void crtParamForCrt(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL,
				MCList<Purc_Chk02_IoR> paramL) {
			
			if (paramL.size() == 0) {
				return;
			}
			
			// 発注明細キャッシュ
			MCList<MCRow> cnd = MCList.create(MCRow.class);
			// 上り電文からキャッシュ取得用の入荷予定NOを取得
			for (Purc_Chk02_IoR ioRow : paramL) {
				MCRow row = MCRow.create();
				row.addStringColumn("arr_schd_no", ioRow.arr_schd_no());
				cnd.add(row);
			}
			initPoDCacheByArrSchdNo(cnd);
			
			// 入荷実績の変更内容に応じてデータ更新区分を設定する
			// データ更新区分が「U」の場合、計上日が変更されている場合は、既存の仕入実績受払に対して「削除」を行う電文と「新規」で新たに登録する電文の２つを作成
			// その他は上り電文のデータ更新区分と同じ値をセットする
			ioL.addAll(crtIoParamForPurcActSv(paramL));
			
			// 発注ヘッダキャッシュ
			initPoCache(ioL);
			
			// 仕入実績サービスの明細連携用の電文を作成する
			dtlL.addAll(crtDtlParamForPurcActSv(ioL));
			
			// 仕入実績サービスのヘッダ連携用の電文を作成する
			hdrL.addAll(crtHdrParamForPurcActSv(dtlL));
		}
		
		/**
		 * 仕入実績サービス連携用の詳細上り電文を作成する
		 * @return 詳細上り電文
		 */
		protected MCList<Purc_Ins01_IoR> crtIoParamForPurcActSv(MCList<Purc_Chk02_IoR> paramL) {
			
			// 詳細上り電文
			MCList<Purc_Ins01_IoR> ioParamList = MCList.create(Purc_Ins01_IoR.class);

			// 仕入予定
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R purcSchdL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(purcSchdL_t);
			MST_RCPT_IV_D_R purcSchdL_t2 = MST_RCPT_IV_D_R.create("T2");
			purcSchdL_bldr.addSelect(purcSchdL_t2.rcpt_iv_d_no);
			purcSchdL_bldr.addLeftOuterJoin(purcSchdL_t2,
					bracket(purcSchdL_t2.purc_schd_no.eq(purcSchdL_t.purc_schd_no)));
			purcSchdL_bldr.addWhereWithAnd(purcSchdL_t.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBDL5180_MST_PURC_SCHD_S04", purcSchdL, purcSchdL_bldr, paramL);
			MCIndexKey purcSchdKey = purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			
			// 入荷予定取得
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			dbSelectKey("MSBDL5180_MST_ARR_SCHD_S02", arrSchdL,
					MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")), paramL);
			MCIndexKey arrSchdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);

			// 発注明細取得
			MCList<MST_ARR_SCHD_R> arrSchd = MCList.create(MST_ARR_SCHD_R.class);
			paramL.forEach(r -> {
				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R ar = MST_ARR_SCHD_R.create();
					ar.arr_schd_no(r.arr_schd_no());
					arrSchd.add(ar);
				}
			});
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			dbWkInsert("MSBDL5180_MSW_ARR_SCHD_I01", arrSchd, arrSchd_bldr.getBaseDbc());

			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R poDL_t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poDL_t);
			MST_ARR_PR_R poDL_t2 = MST_ARR_PR_R.create("T2");
			MST_ARR_SCHD_R poDL_t3 = MST_ARR_SCHD_R.create("T3");
			MSW_ARR_SCHD_KEY_R poDL_k01 = MSW_ARR_SCHD_KEY_R.create("K01");
			poDL_bldr.addSelect(poDL_t3.arr_schd_no);
			poDL_bldr.addInnerJoin(poDL_t2, bracket( poDL_t.po_d_no.eq(poDL_t2.po_d_no)));
			poDL_bldr.addInnerJoin(poDL_t3, bracket( poDL_t2.arr_pr_no.eq(poDL_t3.arr_pr_no)));
			poDL_bldr.addInnerJoin(poDL_k01, bracket( poDL_t3.arr_schd_no.eq(poDL_k01.arr_schd_no)));
			dbSelect("MSBDL5180_MST_PO_D_S03", poDL, poDL_bldr);
			
			dbWkDelete("MSBDL5180_MSW_ARR_SCHD_D01", arrSchd_bldr.getBaseDbc());
			
			MCIndexKey poDKey = poDL.createIndex("arr_schd_no");
			
			for (Purc_Chk02_IoR ioRow : paramL) {

				// 発注NO、発注明細NOを補完
				MST_PO_D_R poDRow = poDL.getFirst(poDKey, ioRow.arr_schd_no());
				ioRow.po_no(poDRow.po_no());
				ioRow.po_d_no(poDRow.po_d_no());

				// 仕入予定NOを補完
				MST_PURC_SCHD_R purcSchdR = purcSchdL.getFirst(purcSchdKey, ioRow.arr_schd_no());
				ioRow.purc_schd_no(purcSchdR.purc_schd_no());
				ioRow.rcpt_iv_d_no(purcSchdR.getStringNE("rcpt_iv_d_no"));
				
				// 購買識別区分を補完
				ioRow.setStringNE("purc_id_typ", arrSchdL.getFirst(arrSchdKey, ioRow.arr_schd_no()).purc_id_typ());

				// 新規追加用電文 後続処理でヘッダ作成対象となる
				Purc_Ins01_IoR ioParamForCrt = Purc_Ins01_IoR.create();
				copy(ioParamForCrt, ioRow, createMap_Purc_Ins01_IoR_Purc_Chk02_IoR());
				ioParamForCrt.peg_no(ioRow.peg_no());
				ioParamForCrt.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				ioParamList.add(ioParamForCrt);
				
			}
			
			return ioParamList;
			
		}
		
		/**
		 * 仕入実績サービス連携用の明細上り電文を作成する
		 * @param ioParamList 仕入実績サービス連携用の詳細上り電文
		 * @return 明細上り電文
		 */
		protected MCList<Purc_Ins01_DtlR> crtDtlParamForPurcActSv(MCList<Purc_Ins01_IoR> ioParamList) {
			
			MCList<Purc_Ins01_IoR> crtIoParamList = ioParamList
					.subList(Purc_Ins01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
						
			MCList<Purc_Ins01_DtlR> dtlParamList = MCList.create(Purc_Ins01_DtlR.class);
			
			// 入荷予定取得
			MCList<MST_ARR_SCHD_R> arrSchd = MCList.create(MST_ARR_SCHD_R.class);
			dbSelectKey("MSBDL5180_MST_ARR_SCHD_S03", arrSchd,
					MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")), crtIoParamList);
			MCIndexKey keyForArrSchd = arrSchd.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			
			// 入荷予定NOで、仕入予定を取得
			MCList<MST_PURC_SCHD_R> purcSchd = MCList.create(MST_PURC_SCHD_R.class);
			purcSchd.addStringColumn("rcpt_iv_d_no");
			purcSchd.addBooleanColumn("purc_cmpl_flg");
			
			MST_PURC_SCHD_R purcSchd_t = MST_PURC_SCHD_R.create("T");
			MST_RCPT_IV_D_R purcSchd_t2 = MST_RCPT_IV_D_R.create("T2");
			MST_RCPT_IV_R purcSchd_t3 = MST_RCPT_IV_R.create("T3");
			MCQueryApiBuilder purcSchd_bldr = MCQueryApiBuilder.create(purcSchd_t);
			
			purcSchd_bldr.addSelect(purcSchd_t2.rcpt_iv_d_no);
			purcSchd_bldr.addSelect(purcSchd_t3.purc_cmpl_flg);
			purcSchd_bldr.addLeftOuterJoin(purcSchd_t2, purcSchd_t2.purc_schd_no.eq(purcSchd_t.purc_schd_no));
			purcSchd_bldr.addLeftOuterJoin(purcSchd_t3, purcSchd_t3.rcpt_iv_mng_no.eq(purcSchd_t2.rcpt_iv_mng_no));
			purcSchd_bldr.addWhereWithAnd(purcSchd_t.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBDL5180_MST_PURC_SCHD_S05", purcSchd, purcSchd_bldr, crtIoParamList);
			MCIndexKey keyForPurcSchdd = purcSchd.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			
			String[] tgtKeys = null;
			Comparable<?>[] vals = null;
			
			for (Purc_Ins01_IoR ioParamRow : crtIoParamList) {

				Purc_Ins01_DtlR dtlParamRow = null;
				
				// 発注先キャッシュ
				MAM_BP_R spplCc = getSpplCache().get(ioParamRow.stk_bp_cd());
				
				// 発注先インボイス取引で同時計上の場合、受領インボイス明細毎に仕入実績明細を作成
				if (spplCc.sppl_iv_flg() && ioParamRow.arr_sync_flg()) {
					tgtKeys = getIvGrpKey();
				}
				// 仕入ロット明細分割区分毎に、詳細電文と予定NO,単位,計上日,入荷日が一致する明細を取得する
				else if (MAC_SLIP_EACH_LOT_TYP.isNOT_EACH(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getNotEachGrpKey();
				}
				else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getEachLotGrpKey();
				}
				else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getEachLotSublotGrpKey();
				}
				
				vals = getVals(tgtKeys, ioParamRow);
				dtlParamRow = dtlParamList.getFirst(tgtKeys, vals);
				
				if (isNull(dtlParamRow)) {
					// 明細が取得できない場合は、詳細電文を元に新規作成する
					dtlParamRow = Purc_Ins01_DtlR.create();
					copy(dtlParamRow, ioParamRow, createMap_Purc_Ins01_DtlR_Purc_Ins01_IoR());
					
					// 同時計上は常にON
					dtlParamRow.sync_flg(true);

					// 入荷予定・仕入予定取得
					MST_ARR_SCHD_R arrSchdRow = arrSchd.getFirst(keyForArrSchd, ioParamRow.arr_schd_no());
					MST_PURC_SCHD_R purcSchdRow = purcSchd.getFirst(keyForPurcSchdd, ioParamRow.arr_schd_no());
					
					dtlParamRow.purc_schd_no(purcSchdRow.purc_schd_no());
					dtlParamRow.purc_id_typ(arrSchdRow.purc_id_typ());
					dtlParamRow.mfg_inst_no(arrSchdRow.mfg_inst_no());
					
					if (dtlParamRow.arr_sync_flg()) {
						dtlParamRow.rcpt_iv_mng_no(arrSchdRow.rcpt_iv_mng_no());
						dtlParamRow.rcpt_iv_d_no(purcSchdRow.getStringNE("rcpt_iv_d_no"));
						// 受領インボイス登録済の場合、受領インボイス明細の値を仕入実績明細に設定
						if (!isNull(dtlParamRow.rcpt_iv_d_no())) {
							MST_RCPT_IV_D_R rcptIvD = getRcptIvDCache().get(dtlParamRow.rcpt_iv_d_no());
							dtlParamRow.trd_unit_cd(rcptIvD.trd_unit_cd());
							dtlParamRow.trd_unit_qty(rcptIvD.trd_unit_qty());
							dtlParamRow.base_unit_qty(rcptIvD.base_unit_qty());
						}
					}
					else {
						dtlParamRow.rcpt_iv_mng_no(null);
						dtlParamRow.rcpt_iv_d_no(null);
					}
					
					// 発注明細情報で補完
					MST_PO_D_R poDRow = getPoDCacheByArrSchdNo(ioParamRow.arr_schd_no());
					
					dtlParamRow.rsn_cd(poDRow.purc_rsn_cd());
					dtlParamRow.dscnt_rsn_cd(poDRow.dscnt_rsn_cd());
					dtlParamRow.sppl_itm_cd(poDRow.sppl_itm_cd());
					dtlParamRow.sppl_itm_nm(poDRow.sppl_itm_nm());
					dtlParamRow.sno1(poDRow.sno1());
					dtlParamRow.sno2(poDRow.sno2());
					dtlParamRow.sno3(poDRow.sno3());
					dtlParamRow.sno4(poDRow.sno4());
					dtlParamRow.bd_bp_cd(poDRow.bd_bp_cd());
					dtlParamRow.bd_dpt_cd(poDRow.bd_dpt_cd());
					dtlParamRow.bd_wg_cd(poDRow.bd_wg_cd());
					dtlParamRow.bd_ctg_cd(poDRow.bd_ctg_cd());
					dtlParamRow.bd_itm_cd(poDRow.bd_itm_cd());
					dtlParamRow.bd_itm_sub1(poDRow.bd_itm_sub1());
					dtlParamRow.bd_itm_sub2(poDRow.bd_itm_sub2());
					dtlParamRow.bd_itm_sub3(poDRow.bd_itm_sub3());
					dtlParamRow.bd_iv_no(poDRow.bd_iv_no());
					dtlParamRow.bd_loc_cd(poDRow.bd_loc_cd());
					dtlParamRow.bd_lot_no(poDRow.bd_lot_no());
					dtlParamRow.bd_sublot_no(poDRow.bd_sublot_no());
					dtlParamRow.bd_oper_cd(poDRow.bd_oper_cd());
					dtlParamRow.bd_po_no(poDRow.bd_po_no());
					dtlParamRow.bd_slo_no(poDRow.bd_slo_no());
					dtlParamRow.bd_sno1(poDRow.bd_sno1());
					dtlParamRow.bd_sno2(poDRow.bd_sno2());
					dtlParamRow.bd_sno3(poDRow.bd_sno3());
					dtlParamRow.bd_sno4(poDRow.bd_sno4());
					dtlParamRow.trd_d_rmrks(poDRow.trd_d_rmrks());
					dtlParamRow.ap_dpt_cd(poDRow.ap_dpt_cd());
					dtlParamRow.pay_crryovr_times(poDRow.pay_crryovr_times());
					dtlParamRow.maker_cd(poDRow.maker_cd());
					// 金額情報を発注明細からコピー
					dtlParamRow.tax_cd(poDRow.tax_cd());
					dtlParamRow.trd_cur_upri(poDRow.trd_cur_upri());
					dtlParamRow.trd_cur_onr_prov_upri(poDRow.trd_cur_onr_prov_upri());
					dtlParamRow.trd_cur_proc_upri(poDRow.trd_cur_proc_upri());
					dtlParamRow.trd_cur_dscnt_amt(poDRow.trd_cur_dscnt_amt());
					dtlParamRow.trd_cur_amt(poDRow.trd_cur_amt());
					dtlParamRow.trd_cur_onr_prov_amt(poDRow.trd_cur_onr_prov_amt());
					dtlParamRow.trd_cur_proc_amt(poDRow.trd_cur_proc_amt());
					dtlParamRow.trd_cur_tax_amt(poDRow.trd_cur_tax_amt());
					dtlParamRow.interim_flg(poDRow.interim_flg());
					dtlParamRow.wtax_rate(poDRow.wtax_rate());
					// 受領インボイス情報の支払起算日、支払予定日
					dtlParamRow.addDateColumn("pay_basis_dt",poDRow.getDateNE("pay_basis_dt"));
					dtlParamRow.addDateColumn("pay_schd_dt",poDRow.getDateNE("pay_schd_dt"));
					
					// データ更新区分は「新規」
					dtlParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					
					// 紐付NO
					dtlParamRow.peg_no(getNewDtlPegNo());
					ioParamRow.dtl_peg_no(dtlParamRow.peg_no());
					
					// 明細上り電文に追加
					dtlParamList.add(dtlParamRow);
				}
				else {
					// 詳細電文に対応する明細があった場合、明細上り電文の取引単位・基準単位数量を加算
					if (isNull(dtlParamRow.rcpt_iv_d_no())) {
						dtlParamRow.trd_unit_qty(dtlParamRow.trd_unit_qty().add(ioParamRow.trd_unit_qty()));
						dtlParamRow.base_unit_qty(dtlParamRow.base_unit_qty().add(ioParamRow.base_unit_qty()));
					}
					
					// 紐付NOをセット
					ioParamRow.dtl_peg_no(dtlParamRow.peg_no());
				}
				
			}
			
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			dbSelectKey("MSBDL5180_MST_PO_D_S04", poDL,
					MCQueryApiBuilder.create(MST_PO_D_R.create("T")), dtlParamList);

			for (Purc_Ins01_DtlR dtlRow : dtlParamList) {
				// 明細と詳細の共通項目で、詳細リスト内で値が割れている場合、明細の項目をクリアする
				clearDiffValue(dtlRow, crtIoParamList);
				// 発注時に税指定をしていない発注明細ＮＯを持つ明細伝聞の仕入税を再取得する
				MST_PO_D_R poR = poDL.getFirst(MST_PO_D_R.$po_d_no, dtlRow.po_d_no());
				MST_PO_R poHR = getPoCache().get(dtlRow.pa_po_no());
				dtlRow.setStringNE("sppl_cd", poHR.sppl_cd());
				resetPurcTaxCd(poR, dtlRow, crtIoParamList);
			}
			
			return dtlParamList;
			
		}
		
		/**
		 * 仕入実績サービス連携用のヘッダ上り電文を作成する
		 * @param dtlParamList 仕入実績サービス連携用の明細上り電文
		 * @return ヘッダ上り電文
		 */
		protected MCList<Purc_Ins01_HdrR> crtHdrParamForPurcActSv(MCList<Purc_Ins01_DtlR> dtlParamList) {
			
			MCList<Purc_Ins01_DtlR> crtDtlParamList = dtlParamList
					.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<Purc_Ins01_HdrR> hdrParamList = MCList.create(Purc_Ins01_HdrR.class);

			// 発注NO,入荷日,計上日でグルーピング
			String[] groupKey = getPurcHGrpKey(); 
			MCGroupByPolicy policy = new MCGroupByPolicy(groupKey);
			MCList<Purc_Ins01_DtlR> hdrGroupList = crtDtlParamList.groupBy(policy);
			MCIndexKey idxkey = crtDtlParamList.createIndex(Purc_Ins01_DtlR.$pa_po_no);
			Purc_Ins01_DtlR dtlR = null;
			MCList<MST_RCPT_IV_R> rcptIvL = MCList.create(MST_RCPT_IV_R.class);
			dbSelectKey("MSBDL5180_MST_RCPT_IV_S02", rcptIvL,
					MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T")), hdrGroupList);
			MCIndexKey rcptIdx = rcptIvL.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);
			for (Purc_Ins01_DtlR hdrGroupRow : hdrGroupList) {
				
				Purc_Ins01_HdrR hdrParamRow = Purc_Ins01_HdrR.create();
				
				// 発注情報取得
				MST_PO_R poR = getPoCache().get(hdrGroupRow.pa_po_no());
				
				copy(hdrParamRow, poR, createMap_Purc_Ins01_HdrR_MST_PO_R());
				hdrParamRow.ac_dt(hdrGroupRow.ac_dt());
				hdrParamRow.purc_dt(hdrGroupRow.arr_dt());
				hdrParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrParamRow.peg_no(getNewHdrPegNo());
				hdrParamRow.rcpt_iv_mng_no(hdrGroupRow.rcpt_iv_mng_no());
				dtlR = crtDtlParamList.getFirst(idxkey, hdrGroupRow.pa_po_no());
				hdrParamRow.pay_basis_dt(dtlR.getDateNE("pay_basis_dt"));
				hdrParamRow.pay_schd_dt(dtlR.getDateNE("pay_schd_dt"));
				MST_RCPT_IV_R iv = rcptIvL.getFirst(rcptIdx, hdrGroupRow.rcpt_iv_mng_no());
				setRate(hdrParamRow, iv, poR);
				if (isNull(hdrParamRow.pay_basis_dt()) && isNull(hdrParamRow.pay_schd_dt())) {
					hdrParamRow.pay_basis_dt(hdrParamRow.ac_dt());
				}
				if (!isNull(iv) && !iv.isEmpty() && iv.purc_cmpl_flg()) {
					hdrParamRow.rcpt_iv_no(iv.rcpt_iv_no());
					hdrParamRow.rcpt_iv_rev(iv.rcpt_iv_rev());
				}
				
				// 紐付く明細行にも、紐付NOをセット
				Comparable<?>[] groupVal = {hdrParamRow.po_no(), hdrParamRow.purc_dt(), hdrParamRow.ac_dt(), hdrParamRow.rcpt_iv_mng_no()};
				MCList<Purc_Ins01_DtlR> tgtDtlParamListForCrt = crtDtlParamList.subList(groupKey, groupVal);
				tgtDtlParamListForCrt.setNumber(Purc_Ins01_DtlR.$hdr_peg_no, hdrParamRow.peg_no());
				// 部門変換のユーティリティを実行するために使用する部門を設定
				tgtDtlParamListForCrt.setStringNE("purc_dpt_cd", hdrParamRow.purc_dpt_cd());
				
				hdrParamList.add(hdrParamRow);
			}
			
			return hdrParamList;
			
		}
		
		protected String[] getPurcHGrpKey() {
			return new String[] { Purc_Ins01_DtlR.$pa_po_no, Purc_Ins01_DtlR.$arr_dt, Purc_Ins01_DtlR.$ac_dt, Purc_Ins01_DtlR.$rcpt_iv_mng_no};
		}
		
		/**
		 * 為替レート、納税為替レートをマスタから取得し、仕入実績ヘッダ登録用の電文に設定します。
		 * @param hdrR 仕入実績ヘッダ登録用電文
		 * @param iv 受領インボイス
		 * @param poR 発注ヘッダ
		 */
		protected void setRate(Purc_Ins01_HdrR hdrR, MST_RCPT_IV_R iv, MST_PO_R poR) {
			
			boolean xrateInptFlg = false;
			boolean ptaxXrateInptFlg = false;
			MCNumber xrate = null;
			MCNumber ptaxXrate = null;
			String curCd = null;
			
			if (isNull(iv)) {
				xrateInptFlg = poR.xrate_inpt_flg();
				xrate = poR.xrate();
				ptaxXrateInptFlg = poR.ptax_xrate_inpt_flg();
				ptaxXrate = poR.ptax_xrate();
				curCd = poR.trd_cur_cd();
			}
			else {
				xrateInptFlg = iv.xrate_inpt_flg();
				xrate = iv.xrate();
				ptaxXrateInptFlg = iv.ptax_xrate_inpt_flg();
				ptaxXrate = iv.ptax_xrate();
				curCd = iv.trd_cur_cd();
			}
			
			if (xrateInptFlg) {
				hdrR.xrate(xrate);
			}
			else {
				hdrR.xrate(getDefXrate(curCd,getBaseCur().cur_cd(),
					getCo().purc_xrate_cd(), hdrR.purc_dt()));
			}
			
			if (!isNull(getCo().ptax_cur_cd())) {
				if (ptaxXrateInptFlg) {
					hdrR.ptax_xrate(ptaxXrate);
				}
				else {
					hdrR.ptax_xrate(getDefXrate(curCd, getPtaxCur().cur_cd(), 
						getCo().purc_xrate_cd(), hdrR.purc_dt()));
				}
			}
		}
		/**
		 * 対応する詳細行リストの値が全行で一致しない場合に、明細行の項目をクリアします。<br>
		 * ただし、「削除」の詳細行はチェック対象外です。<br>
		 * ※例) 詳細行の1行目のロットNOが「A」、2行目のロットNOが「B」の場合、明細行のロットNOをクリア。
		 * @param dtlRow　明細行のRow
		 * @param ioL 詳細行のリスト (メソッド内で明細に対応する詳細行のみを抽出します)
		 */
		protected void clearDiffValue(Purc_Ins01_DtlR dtlRow, MCList<Purc_Ins01_IoR> ioL) {
						
			MCList<Purc_Ins01_IoR> tgtIoL = MCList.create(Purc_Ins01_IoR.class);
			for (Purc_Ins01_IoR ioRow : ioL.subList(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					continue;
				}
				tgtIoL.add(ioRow);
			}
			
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$in_to_loc_cd).size() != 1) {
				dtlRow.in_to_loc_cd(null);
				dtlRow.in_to_loc_wg_cd(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$str_ln_cd).size() != 1) {
				dtlRow.str_ln_cd(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$quality_typ).size() != 1) {
				dtlRow.quality_typ(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$gd_cd).size() != 1) {
				dtlRow.gd_cd(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$lot_no, Purc_Ins01_IoR.$sublot_no).size() != 1) {
				dtlRow.lot_no(null);
				dtlRow.sublot_no(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_lot_no).size() != 1) {
				dtlRow.bp_lot_no(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_dlv_slip_no).size() != 1) {
				dtlRow.bp_dlv_slip_no(null);
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_dlv_slip_d_no).size() != 1) {
				dtlRow.bp_dlv_slip_d_no(null);
			}
		}
		
		/**
		 * 明細行の仕入税を再セットします。<br>
		 * ただし、対応する発注明細の税指定がオフの場合のみ対象になります。<br>
		 * @param poD 発注明細
		 * @param dtlRow 明細行のRow
		 * @param ioL 詳細行のリスト (本メソッド内で明細に対応する詳細行のみを抽出するため、絞込み不要)
		 */
		protected void resetPurcTaxCd(MST_PO_D_R poD, Purc_Ins01_DtlR dtlRow, MCList<Purc_Ins01_IoR> ioL) {
		Purc_Ins01_IoR ioRow = ioL
				// 削除行は入荷日がnullになるため除く
				.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()))
				.getFirst(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no());
		
			if (isUnplanned(poD) || !poD.tax_fix_flg()) {
				MCList<MCRow> rsltL = MCList.create(MCRow.class);
				rsltL.addStringColumn("tax_cd");
				rsltL.addStringColumn("itm_cd");
				rsltL.addStringColumn("itm_sub1");
				rsltL.addStringColumn("itm_sub2");
				rsltL.addStringColumn("itm_sub3");
				rsltL.addStringColumn("sppl_cd");
				rsltL.addDateColumn("base_dt");
				
				MCRow rsltR = rsltL.createRow();
				rsltR.setString("itm_cd", dtlRow.itm_cd());
				rsltR.setString("itm_sub1", dtlRow.itm_sub1());
				rsltR.setString("itm_sub2", dtlRow.itm_sub2());
				rsltR.setString("itm_sub3", dtlRow.itm_sub3());
				rsltR.setString("sppl_cd", dtlRow.getStringNE("sppl_cd"));
				rsltR.setDate("base_dt", ioRow.arr_dt());
				rsltL.add(rsltR);
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
						"tax_cd", rsltL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "sppl_cd", "base_dt");
				if (!isNull(rsltL)) {
					dtlRow.tax_cd(rsltL.get(0).getStringNE("tax_cd"));
				}
			}
		}
		
		protected boolean isUnplanned(MST_PO_D_R poD) {
			return isNull(poD);
		}
		
		/**
		 * 対応する詳細行リストの値が全行で一致する場合に、明細行の項目に同じ値を設定します。<br>
		 * ただし、「削除」の詳細行はチェック対象外です。<br>
		 * ※例) 詳細行の1行目のロットNOが「A」、2行目のロットNOが「A」の場合、明細行のロットNOに「A」をセット。
		 * @param dtlRow　明細行のRow
		 * @param ioL 詳細行のリスト (メソッド内で明細に対応する詳細行のみを抽出します)
		 */
		protected void setSameValue(Purc_Ins01_DtlR dtlRow, MCList<Purc_Ins01_IoR> ioL) {
			MCList<Purc_Ins01_IoR> tgtIoL = MCList.create(Purc_Ins01_IoR.class);
			for (Purc_Ins01_IoR ioRow : ioL.subList(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					continue;
				}
				tgtIoL.add(ioRow);
			}
			
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$in_to_loc_cd).size() == 1) {
				dtlRow.in_to_loc_cd(tgtIoL.get(0).in_to_loc_cd());
				dtlRow.in_to_loc_wg_cd(tgtIoL.get(0).in_to_loc_wg_cd());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$str_ln_cd).size() == 1) {
				dtlRow.str_ln_cd(tgtIoL.get(0).str_ln_cd());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$quality_typ).size() == 1) {
				dtlRow.quality_typ(tgtIoL.get(0).quality_typ());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$gd_cd).size() == 1) {
				dtlRow.gd_cd(tgtIoL.get(0).gd_cd());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$lot_no, Purc_Ins01_IoR.$sublot_no).size() == 1) {
				dtlRow.lot_no(tgtIoL.get(0).lot_no());
				dtlRow.sublot_no(tgtIoL.get(0).sublot_no());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_lot_no).size() == 1) {
				dtlRow.bp_lot_no(tgtIoL.get(0).bp_lot_no());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_dlv_slip_no).size() == 1) {
				dtlRow.bp_dlv_slip_no(tgtIoL.get(0).bp_dlv_slip_no());
			}
			if (tgtIoL.groupBy(Purc_Ins01_IoR.$bp_dlv_slip_d_no).size() == 1) {
				dtlRow.bp_dlv_slip_d_no(tgtIoL.get(0).bp_dlv_slip_d_no());
			}
		}
		
		/**
		 * 更新・削除用の電文を作成します
		 */
		protected void crtParamForUpdOrDel(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL,
				MCList<Purc_Chk02_IoR> paramL) {
						
			if (paramL.size() == 0) {
				return;
			}
			
			// 仕入実績取得
			MCList<MST_PURC_ACT_R> paL = getPurcAct(paramL);
			MCList<MST_PURC_ACT_D_R> padL = getPurcActD(paL);
			MCList<MST_PURC_ACT_IO_R> paIoL = getPurcActIo(padL);
			MST_PURC_SCHD_R purcSchdL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(purcSchdL_t);
			MCList<MST_PURC_SCHD_R> paSchdL = MCList.create(MST_PURC_SCHD_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_SCHD_S06", paSchdL, purcSchdL_bldr, padL);
			
			// 仕入実績サービス用電文
			MCList<Purc_Ins01_HdrR> hdrParamL = MCList.create(Purc_Ins01_HdrR.class);
			MCList<Purc_Ins01_DtlR> dtlParamL = MCList.create(Purc_Ins01_DtlR.class);
			MCList<Purc_Ins01_IoR> ioParamL = MCList.create(Purc_Ins01_IoR.class);
			
			// index
			MCIndexKey idxPadL = padL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
			MCIndexKey idxPadLPurcActD = padL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
			MCIndexKey idxPaIoL = paIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);
			MCIndexKey idxPaIoLArrAct = paIoL.createIndex(MST_PURC_ACT_IO_R.$arr_act_no);
			MCIndexKey ioRK = paramL.createIndex(Purc_Chk02_IoR.$arr_act_no);
			MCIndexKey idxPaSchdL = paSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			
			// 受領インボイス取得
			MCList<MST_RCPT_IV_R> rcptIvL = getRcptIv(paL);
			MCIndexKey rcptIdx = rcptIvL.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);
			// 発注取得
			MCList<MST_PO_R> poL = getPo(paL);
			MCIndexKey poIdx = poL.createIndex(MST_PO_R.$po_no);
			// 発注明細取得
			MCList<MST_PO_D_R> poDL = getPoD(paL);
			
			setPurcActNoToParam(paramL, paIoL, idxPaIoLArrAct, padL, idxPadLPurcActD);
			MCIndexKey paramK = paramL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq, Purc_Chk02_IoR.$data_crud_typ);
			
			for (MST_PURC_ACT_R paRow : paL) {
				
				// 仕入実績サービス・ヘッダ電文
				Purc_Ins01_HdrR hdrParamRow = Purc_Ins01_HdrR.create();
				copy(hdrParamRow, paRow, createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del());
				
				// ヘッダ紐付NOを発番してセット
				hdrParamRow.peg_no(getNewHdrPegNo());
				
				boolean allDtlDel = true;
				
				// チェック上り電文で指定した日付を格納
				MCDate purcDt = null;
				MCDate acDt = null;
				MCDate canAcDt = null;
				
				MCList<MST_PURC_ACT_D_R> tgtPadL = padL.subList(idxPadL, paRow.purc_act_no(), paRow.purc_act_seq());
				for (MST_PURC_ACT_D_R padRow : tgtPadL) {
					
					// 仕入実績サービス・明細電文
					Purc_Ins01_DtlR dtlParamRow = Purc_Ins01_DtlR.create();
					copy(dtlParamRow, padRow, createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del());
					
					// ヘッダ紐付NOをセット
					dtlParamRow.hdr_peg_no(hdrParamRow.peg_no());
					// 明細紐付NOを発番・セット
					dtlParamRow.peg_no(getNewDtlPegNo());
					dtlParamRow.setStringNE("purc_dpt_cd", hdrParamRow.purc_dpt_cd());
					boolean allIoDel = true;
					
					MCList<MST_PURC_ACT_IO_R> tgtPaIoL = paIoL.subList(idxPaIoL, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
					for (MST_PURC_ACT_IO_R paIoRow : tgtPaIoL) {
						
						// 取得した仕入実績受払を、上り電文にセット
						Purc_Ins01_IoR ioParamRow = Purc_Ins01_IoR.create();
						ioParamRow.addDateColumn("can_ac_dt");
						copy(ioParamRow, paIoRow, createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del());
						// 仕入実績ヘッダの計上日,仕入日(入荷日)を暫定でセット
						ioParamRow.ac_dt(paRow.ac_dt());
						ioParamRow.arr_dt(paRow.purc_dt());
						ioParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						
						// チェック上り電文を入荷実績NOで取得
						Purc_Chk02_IoR chk02Row = paramL.getFirst(ioRK, paIoRow.arr_act_no());
						if (!isNull(chk02Row)) {
							// チェック上り電文を詳細電文にコピー(計上日を入荷実績一覧登録の計上日で置き換え)
							copy(ioParamRow, chk02Row, createMap_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del());
							ioParamRow.data_crud_typ(chk02Row.data_crud_typ());
							ioParamRow.setDateNE("can_ac_dt", chk02Row.can_ac_dt());
							
							// チェック上り電文より仕入日(入荷日)、計上日を取得
							// 更新後の仕入実績ヘッダの仕入日、計上日として使用
							if (MAC_DATA_CRUD_TYP.isUPD(chk02Row.data_crud_typ())) {
								purcDt = chk02Row.arr_dt();
								acDt = chk02Row.ac_dt();
							}
							if (MAC_DATA_CRUD_TYP.isUPD(chk02Row.data_crud_typ())
									|| MAC_DATA_CRUD_TYP
											.isDEL(chk02Row.data_crud_typ())) {
								canAcDt = chk02Row.can_ac_dt();
							}
							
							// 打切FLGを詳細電文から明細電文に連携
							dtlParamRow.abort_flg(ioParamRow.abort_flg());
							dtlParamRow.arr_schd_no(ioParamRow.arr_schd_no());
							// 版ＮＯ
							dtlParamRow.ver_no(ioParamRow.ver_no());
						}
						else {
							// 上り電文がない場合、peg_noを設定
							ioParamRow.peg_no(getNewIoPegNo());
							// 打切FLGを仕入予定から明細電文に連携
							MST_PURC_SCHD_R paSchdR = paSchdL.getFirst(idxPaSchdL, dtlParamRow.purc_schd_no());
							if (!isNull(paSchdR)) {
								dtlParamRow.abort_flg(paSchdR.abort_flg());
								dtlParamRow.arr_schd_no(paSchdR.arr_schd_no());
							}
							if (isUnplannedPurcActD(padRow)) {
								Purc_Chk02_IoR samaHdrParamR = paramL.getFirst(paramK, paRow.purc_act_no(), paRow.purc_act_seq(), MAC_DATA_CRUD_TYP.UPD.value());
								if (!isNull(samaHdrParamR)) {
									ioParamRow.ac_dt(samaHdrParamR.ac_dt());
									ioParamRow.arr_dt(samaHdrParamR.arr_dt());
								}
							}
						}
						// 明細紐付NOセット
						ioParamRow.dtl_peg_no(dtlParamRow.peg_no());

						if (MAC_DATA_CRUD_TYP.isUPD(ioParamRow.data_crud_typ())) {
							allIoDel = false;
						}
						ioParamL.add(ioParamRow);
												
					}
					
					// 紐付く詳細リストが全て「削除」の場合は、明細のデータ更新区分も「削除」にする
					if (allIoDel) {
						dtlParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						dtlParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						allDtlDel = false;
						
						// 対象の詳細行全行の値が一致していない場合に、明細の対象項目をクリア
						clearDiffValue(dtlParamRow, ioParamL);
						// 対象の詳細行全行の値が一致している場合に、明細の値に同値をセット
						setSameValue(dtlParamRow, ioParamL);
						// 仕入税の再設定
						MST_PO_D_R poR = poDL.getFirst(MST_PO_D_R.$po_d_no, padRow.po_d_no());
						dtlParamRow.setStringNE("sppl_cd", hdrParamRow.sppl_cd());
						resetPurcTaxCd(poR, dtlParamRow, ioParamL);
					}
					dtlParamL.add(dtlParamRow);
					
				}
				
				// 紐付く明細リストが全て「削除」の場合は、ヘッダのデータ更新区分も「削除」にする
				if (allDtlDel) {
					hdrParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					hdrParamRow.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					
					// 明細の取引単位、数量を計算する
					MCJoinKey<MCList<Purc_Ins01_IoR>> dtlIoKey = 
							dtlParamL.join(Purc_Ins01_DtlR.$peg_no, ioParamL, Purc_Ins01_IoR.$dtl_peg_no);
					calcDtlQty(dtlParamL, dtlIoKey);
					
				}
				
				// 更新時、更新上り電文の計上日、仕入日を使用する。なければ登録済の仕入実績ヘッダの日付を使用。
				if (MAC_DATA_CRUD_TYP.isUPD(hdrParamRow.data_crud_typ())) {
					if (!isNull(acDt) || !isNull(purcDt)) {
						hdrParamRow.ac_dt(acDt);
						hdrParamRow.purc_dt(purcDt);
					}
					else {
						hdrParamRow.ac_dt(paRow.ac_dt());
						hdrParamRow.purc_dt(paRow.purc_dt());
					}
					MAM_BP_R spplCache = getSpplCache().get(hdrParamRow.sppl_cd());
					if (!spplCache.sppl_iv_flg()) {
						hdrParamRow.pay_basis_dt(hdrParamRow.ac_dt());
					}
					// 為替レートの再設定
					MST_RCPT_IV_R iv = rcptIvL.getFirst(rcptIdx, paRow.rcpt_iv_mng_no());
					MST_PO_R poR = poL.getFirst(poIdx, paRow.po_no());
					setRate(hdrParamRow, iv, poR);
				}
				if (!isNull(canAcDt)) {
					hdrParamRow.can_ac_dt(canAcDt);
				}

				hdrParamL.add(hdrParamRow);

			}

			// 計上日・チェック処理
			checkAcDtAndActDt(hdrParamL, dtlParamL, ioParamL);
			
			// 部門変換のユーティリティを実行、仕入実績明細をマージするために使用する日付を設定
			MCIndexKey hdrK = hdrParamL.createIndex(Purc_Ins01_HdrR.$peg_no);
			for(Purc_Ins01_DtlR dtlParamR : dtlParamL){
				Purc_Ins01_HdrR hdrR = hdrParamL.getFirst(hdrK, dtlParamR.hdr_peg_no());
				dtlParamR.ac_dt(hdrR.ac_dt());
				dtlParamR.arr_dt(hdrR.purc_dt());
			}
			
			hdrL.addAll(hdrParamL);
			dtlL.addAll(dtlParamL);
			ioL.addAll(ioParamL);

		}
		
		protected void setPurcActNoToParam(MCList<Purc_Chk02_IoR> paramL, MCList<MST_PURC_ACT_IO_R> paIoL, MCIndexKey idxPaIoLArrAct,
				MCList<MST_PURC_ACT_D_R> padL, MCIndexKey idxPadLPurcActD) {
			paramL.addStringColumn(MST_PURC_ACT_D_R.$purc_act_no);
			paramL.addNumberColumn(MST_PURC_ACT_D_R.$purc_act_seq);
			for (Purc_Chk02_IoR paramR : paramL) {
				MST_PURC_ACT_IO_R ioR = paIoL.getFirst(idxPaIoLArrAct, paramR.arr_act_no());
				MST_PURC_ACT_D_R padR = padL.getFirst(idxPadLPurcActD, ioR.purc_act_d_no(), ioR.purc_act_d_seq());
				paramR.setStringNE(MST_PURC_ACT_D_R.$purc_act_no, padR.purc_act_no());
				paramR.setNumberNE(MST_PURC_ACT_D_R.$purc_act_seq, padR.purc_act_seq());
			}
		}
		
		protected boolean isUnplannedPurcActD(MST_PURC_ACT_D_R pad) {
			return isNull(pad.purc_schd_no());
		}
		
		/**
		 * 新規・更新の仕入実績をマージする
		 */
		protected void mergeForCrtAndUpd(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
			
			MCList<Purc_Ins01_DtlR> tgtDtlL = getMergeTgtL(hdrL, dtlL, ioL);
			if (tgtDtlL.isEmpty()) {
				return;
			}
			
			MCList<Purc_Ins01_DtlR> removeDtlL = MCList.create(Purc_Ins01_DtlR.class);
			MCList<Purc_Ins01_HdrR> removeHdrL = MCList.create(Purc_Ins01_HdrR.class);
			
			MCIndexKey hdrIdx = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
			MCIndexKey ioIdx = ioL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
			
			String[] tgtKeys = null;
			Comparable<?>[] vals = null;
			
			MCList<Purc_Ins01_DtlR> updDtlL = tgtDtlL.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			MCList<Purc_Ins01_DtlR> crtDtlL = tgtDtlL.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			
			for (Purc_Ins01_DtlR crtDtlR : crtDtlL) {
				Purc_Ins01_DtlR mergeDtlR = null;
				
				// 発注先キャッシュ
				Purc_Ins01_HdrR tgtHdrR = hdrL.getFirst(hdrIdx, crtDtlR.hdr_peg_no());
				MAM_BP_R spplCc = getSpplCache().get(tgtHdrR.sppl_cd());
				
				// 発注先インボイス取引で同時計上の場合、受領インボイス明細毎に仕入実績明細を作成
				if (spplCc.sppl_iv_flg() && !isNull(crtDtlR.rcpt_iv_d_no())) {
					tgtKeys = getIvGrpKey();
				}
				// 仕入ロット明細分割区分毎に、詳細電文と予定NO,単位,計上日,入荷日が一致する明細を取得する
				else if (MAC_SLIP_EACH_LOT_TYP.isNOT_EACH(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getNotEachGrpKey();
				}
				else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getEachLotGrpKey();
				}
				else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT(spplCc.purc_slip_each_lot_typ())) {
					tgtKeys = getEachLotSublotGrpKey();
				}
				
				vals = getVals(tgtKeys, crtDtlR);
				mergeDtlR = updDtlL.getFirst(tgtKeys, vals);
				
				if (!isNull(mergeDtlR)) {
					removeDtlL.add(crtDtlR);
					
					// まとめる側に加算
					if (isNull(mergeDtlR.rcpt_iv_d_no())) {
						mergeDtlR.trd_unit_qty(mergeDtlR.trd_unit_qty().add(crtDtlR.trd_unit_qty()));
						mergeDtlR.base_unit_qty(mergeDtlR.base_unit_qty().add(crtDtlR.base_unit_qty()));
					}
					
					// 詳細の紐付ＮＯをまとめる側の値で再設定
					MCList<Purc_Ins01_IoR> tgtIoL = ioL.subList(ioIdx, crtDtlR.peg_no());
					for (Purc_Ins01_IoR tgtIoR : tgtIoL) {
						tgtIoR.dtl_peg_no(mergeDtlR.peg_no());
					}
				}
			}
			dtlL.removeAll(removeDtlL);
			
			// 明細と詳細の共通項目で、詳細リスト内で値が割れている場合、明細の項目をクリアする
			for (Purc_Ins01_DtlR dtlR : dtlL) {
				clearDiffValue(dtlR, ioL);
			}
			
			// ヘッダに紐づく明細がない場合はヘッダも削除する
			MCIndexKey dtlIdx = dtlL.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			for (Purc_Ins01_HdrR hdrR : hdrL) {
				MCList<Purc_Ins01_DtlR> subDtlL = dtlL.subList(dtlIdx, hdrR.peg_no());
				if (subDtlL.isEmpty()) {
					removeHdrL.add(hdrR);
				}
			}
			hdrL.removeAll(removeHdrL);
		}
		
		protected MCList<Purc_Ins01_DtlR> getMergeTgtL(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
			MCList<Purc_Ins01_DtlR> tgtDtlL = MCList.create(Purc_Ins01_DtlR.class);
			
			MCList<Purc_Ins01_DtlR> subDtlL = dtlL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (subDtlL.isEmpty()) {
				return tgtDtlL;
			}
			
			// 訂正時に行コピーした場合など、新規と訂正が混ざっているデータがマージ対象
			for (MCList<Purc_Ins01_DtlR> groupL : subDtlL.groupList(Purc_Ins01_DtlR.$arr_schd_no, Purc_Ins01_DtlR.$rcpt_iv_d_no)) {
				if (groupL.groupBy(Purc_Ins01_DtlR.$data_crud_typ).size() > 1) {
					tgtDtlL.addAll(groupL);
				}
			}
			
			return tgtDtlL;
		}
		
		protected Comparable[] getVals(String[] keys, MCRow r) {
			Comparable[] vals = new Comparable[keys.length];
			for (int i = 0; i < vals.length; i++) {
				vals[i] = r.getValueNE(keys[i]);
			}
			return vals;
		}
		
		/**
		 * 受領インボイス管理ＮＯで受領インボイスを取得します
		 * @param poNo 受領インボイス管理ＮＯ
		 * @return 受領インボイスリスト
		 */
		protected MCList<MST_RCPT_IV_R> getRcptIv(MCList<?> rcptIvNoList) {
			MCList<MST_RCPT_IV_R> rcptIv = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder rcptIv_bldr = MCQueryApiBuilder.create(t);
			rcptIv_bldr.setWhere(t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			dbSelect("MSBDL5180_MST_RCPT_IV_S03", rcptIv, rcptIv_bldr, rcptIvNoList);
			
			return rcptIv;
		}
		
		/**
		 * 発注ＮＯで発注を取得します
		 * @param poNo 発注ＮＯ
		 * @return 発注リスト
		 */
		protected MCList<MST_PO_R> getPo(MCList<?> poNoList) {
			MCList<MST_PO_R> po = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder po_bldr = MCQueryApiBuilder.create(t);
			po_bldr.setWhere(t.po_no.eq(bind("po_no")));
			po_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL5180_MST_PO_S02", po, po_bldr, poNoList);
			
			return po;
		}
		
		/**
		 * 発注ＮＯで発注明細を取得します
		 * @param poNo 発注ＮＯ
		 * @return 発注明細リスト
		 */
		protected MCList<MST_PO_D_R> getPoD(MCList<?> poNoList) {
			MCList<MST_PO_D_R> poD = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(t);
			poD_bldr.setWhere(t.po_no.eq(bind("po_no")));
			poD_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL5180_MST_PO_D_S05", poD, poD_bldr, poNoList);
			
			return poD;
		}
		
		/**
		 * 計上日チェック<br>
		 * 同じ仕入実績ヘッダに属する仕入実績受払に対して、全て同じ計上日を設定しているかチェックします<br>
		 * @param hdrParamL
		 * @param dtlParamL
		 * @param ioParamL
		 */
		protected void checkAcDtAndActDt(MCList<Purc_Ins01_HdrR> hdrParamL, MCList<Purc_Ins01_DtlR> dtlParamL, MCList<Purc_Ins01_IoR> ioParamL) {
			
			MCIndexKey dtlIdx = dtlParamL.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			MCIndexKey ioIdx = ioParamL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
			
			for (Purc_Ins01_HdrR hdrRow : hdrParamL) {
				// 同一ヘッダに属する詳細リスト
				MCList<Purc_Ins01_IoR> samaHdrIoParamL = MCList.create(Purc_Ins01_IoR.class);
				
				MCList<Purc_Ins01_DtlR> tgtDtlParamL = dtlParamL.subList(dtlIdx, hdrRow.peg_no());
				for (Purc_Ins01_DtlR dtlRow : tgtDtlParamL) {
					samaHdrIoParamL.addAll(ioParamL.subList(ioIdx, dtlRow.peg_no()));
				}
				
				boolean errFlg = false;
				
				// 同一ヘッダ内の計上日、入荷日の重複チェックにしようする電文（データ区分が「削除」以外）を取得
				MCList<Purc_Ins01_IoR> exceptDelL = MCList.create(Purc_Ins01_IoR.class);
				MCList<Purc_Ins01_IoR> exceptCrtL = MCList.create(Purc_Ins01_IoR.class);
				exceptCrtL.addDateColumn("can_ac_dt");
				for (Purc_Ins01_IoR r : samaHdrIoParamL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						exceptDelL.add(r);
					}
					if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						// 更新・取消時の取消計上日用チェックリスト取得
						exceptCrtL.add(r);
					}
				}
				
				// 計上日が複数存在しないかチェック、複数あればエラー
				MCList<Purc_Ins01_IoR> grpLByAcDt = MCList.create(Purc_Ins01_IoR.class);
				for (Purc_Ins01_IoR r : exceptDelL.groupBy(Purc_Ins01_IoR.$ac_dt)) {
					if (!isNull(r.ac_dt())) {
						grpLByAcDt.add(r);
					}
				}
				if (grpLByAcDt.size() > 1) {
					errFlg = true;
					MCMessagePool.add(new MCMessage(MSBDL0146, hdrRow.purc_act_no()));
				}
				// 取消計上日が複数存在しないかチェック、複数あればエラー
				MCList<Purc_Ins01_IoR> grpLByCanAcDt = MCList.create(Purc_Ins01_IoR.class);
				for (Purc_Ins01_IoR r : exceptCrtL.groupBy("can_ac_dt")) {
					if (!isNull(r.getDateNE("can_ac_dt"))) {
						grpLByCanAcDt.add(r);
					}
				}
				if (grpLByCanAcDt.size() > 1) {
					errFlg = true;
					MCMessagePool.add(new MCMessage(MSBDL0200, hdrRow.purc_act_no()));
				}
				
				// 入荷日が複数存在しないかチェック、複数あればエラー
				MCList<Purc_Ins01_IoR> grpLByArrDt = MCList.create(Purc_Ins01_IoR.class);
				for (Purc_Ins01_IoR r : exceptDelL.groupBy(Purc_Ins01_IoR.$arr_dt)) {
					if (!isNull(r.arr_dt())) {
						grpLByArrDt.add(r);
					}
				}
				if (grpLByArrDt.size() > 1) {
					errFlg = true;
					MCMessagePool.add(new MCMessage(MSBDL0147, hdrRow.purc_act_no()));
				}
				
				if (errFlg) {
					// 紐付くチェック上り電文を全てエラーにする
					for (Purc_Ins01_IoR ioRow : samaHdrIoParamL) {
						Purc_Chk02_IoR chk02Row = up0().getFirst(Purc_Chk02_IoR.$peg_no, ioRow.peg_no());
						if (!isNull(chk02Row)) {
							chk02Row.err_flg(true);
						}
					}
				}
				
			}
			
		}
		
		/**
		 * 明細リストの数量を計算します
		 * @param dtlParamL 明細上り電文
		 * @param dtlIoKey JOINキー
		 */
		protected void calcDtlQty(MCList<Purc_Ins01_DtlR> dtlParamL, MCJoinKey<MCList<Purc_Ins01_IoR>> dtlIoKey) {

			for (Purc_Ins01_DtlR dtlParamRow : dtlParamL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlParamRow.data_crud_typ())) {
					continue;
				}
				
				// 受領インボイス登録済の場合、受領インボイス明細の値を仕入実績明細に設定
				if (!isNull(dtlParamRow.rcpt_iv_d_no())) {
					MST_RCPT_IV_D_R rcptIvD = getRcptIvDCache().get(dtlParamRow.rcpt_iv_d_no());
					dtlParamRow.trd_unit_cd(rcptIvD.trd_unit_cd());
					dtlParamRow.trd_unit_qty(rcptIvD.trd_unit_qty());
					dtlParamRow.base_unit_qty(rcptIvD.base_unit_qty());
					continue;
				}
				
				String convUnitCd = null;
				MCNumber convUnitQty = MCNumber.ZERO;
				MCNumber baseUnitQty = MCNumber.ZERO;
				
				boolean useBaseUnit = false;
				
				// 詳細リストの単位CDが割れている場合、明細の単位CDは基準単位にする
				// 割れていない場合でも、明細の単位CDは詳細リストの単位にする
				MCList<Purc_Ins01_IoR> ioParamL = dtlParamRow.getJoined(dtlIoKey);
				if (ioParamL.subList(Purc_Ins01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value())
						.groupBy(Purc_Ins01_IoR.$trd_unit_cd).size() >= 2 ) {
					useBaseUnit = true;
				}
				
				for (Purc_Ins01_IoR ioParamRow : ioParamL) {
					if (MAC_DATA_CRUD_TYP.isDEL(ioParamRow.data_crud_typ())) {
						continue;
					}
					
					if (useBaseUnit) {
						// 基準単位で加算
						convUnitCd = ioParamRow.base_unit_cd();
						convUnitQty = convUnitQty.add(ioParamRow.base_unit_qty());
					}
					else {
						// 取引単位で加算
						convUnitCd = ioParamRow.trd_unit_cd();
						convUnitQty = convUnitQty.add(ioParamRow.trd_unit_qty());
					}
					// 基準単位数量を加算
					baseUnitQty = baseUnitQty.add(ioParamRow.base_unit_qty());
					
				}
				
				// 明細の単位と数量を設定
				dtlParamRow.trd_unit_cd(convUnitCd);
				dtlParamRow.trd_unit_qty(convUnitQty);
				dtlParamRow.base_unit_qty(baseUnitQty);
				
			}
			
		}
		
		/**
		 * 仕入実績ヘッダを取得します
		 * @param paramL 上り電文(データ更新区分：更新または削除)
		 * @return 仕入実績ヘッダ
		 */
		protected MCList<MST_PURC_ACT_R> getPurcAct(MCList<Purc_Chk02_IoR> paramL) {
			MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R paL_t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder paL_bldr = MCQueryApiBuilder.create(paL_t);
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
			MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");
			MST_ARR_ACT_R t4 = MST_ARR_ACT_R.create("T4");
			paL_bldr.addLeftOuterJoin(t2, bracket(paL_t.purc_act_no.eq(t2.purc_act_no)
					.and(paL_t.purc_act_seq.eq(t2.purc_act_seq))));
			paL_bldr.addLeftOuterJoin(t3, bracket(t2.purc_act_d_no.eq(t3.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq))));
			paL_bldr.setWhere(paL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			paL_bldr.addWhereWithAnd(t3.arr_act_no.eq(bind("arr_act_no")));
			dbSelect("MSBDL5180_MST_PURC_ACT_S06", paL, paL_bldr, paramL);

			MCList<MST_PURC_ACT_R> paL2 = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R paL2_t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder paL2_bldr = MCQueryApiBuilder.create(paL2_t);
			paL2_bldr.addLeftOuterJoin(t2, bracket(paL2_t.purc_act_no.eq(t2.purc_act_no)
					.and(paL2_t.purc_act_seq.eq(t2.purc_act_seq))));
			paL2_bldr.addLeftOuterJoin(t3, bracket(t2.purc_act_d_no.eq(t3.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq))));
			paL2_bldr.addLeftOuterJoin(t4, bracket( t3.purc_act_io_no.eq(t4.purc_act_io_no)));
			paL2_bldr.setWhere(paL2_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			paL2_bldr.addWhereWithAnd(t4.arr_act_no.eq(bind("arr_act_no")));
			dbSelect("MSBDL5180_MST_PURC_ACT_S07", paL2, paL2_bldr, paramL);

			paL.addAll(paL2);
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_PURC_ACT_R.colnames());
			paL = paL.groupBy(policy);
			
			return paL;
		}
		/**
		 * 仕入実績明細を取得します
		 * @param paL 仕入実績ヘッダ
		 * @return 仕入実績明細
		 */
		protected MCList<MST_PURC_ACT_D_R> getPurcActD(MCList<MST_PURC_ACT_R> paL) {
			MCList<MST_PURC_ACT_D_R> padL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R pschd = MST_PURC_SCHD_R.create("PSCHD");
			MST_ARR_SCHD_R aschd = MST_ARR_SCHD_R.create("ASCHD");
			
			padL_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no"))
					.and(t.purc_act_seq.eq(bind("purc_act_seq"))));
			padL_bldr.addLeftOuterJoin(pschd, bracket( t.purc_schd_no.eq(pschd.purc_schd_no)));
			padL_bldr.addLeftOuterJoin(aschd, bracket( pschd.arr_schd_no.eq(aschd.arr_schd_no)));
			padL_bldr.addSelect(aschd.arr_ptn_typ);
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S07", padL, padL_bldr, paL);
			
			return padL;
		}
		/**
		 * 仕入実績受払を取得します
		 * @param padL 仕入実績明細
		 * @return 仕入実績受払
		 */
		protected MCList<MST_PURC_ACT_IO_R> getPurcActIo(MCList<MST_PURC_ACT_D_R> padL) {
			MCList<MST_PURC_ACT_IO_R> paIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paIoL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			// 未着管理時の入荷実績NOを取得
			paIoL_bldr.addSelect(t2.arr_act_no.as("n_yer_arr_act_no"));
			paIoL_bldr.addLeftOuterJoin(t2, bracket( t.purc_act_io_no.eq(t2.purc_act_io_no)));
			paIoL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no"))
					.and(t.purc_act_d_seq.eq(bind("purc_act_d_seq"))));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S05", paIoL, paIoL_bldr, padL);
			
			return paIoL;
		}
		
		/**
		 * 仕入実績ヘッダ(MST_PURC_ACT_R) -> 仕入実績サービス.上り電文(Purc_Ins01_HdrR)<br>
		 */
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del<Purc_Ins01_HdrR,MST_PURC_ACT_R> createMap_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del() {
			if (_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del == null) {
				_Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del = new Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del<Purc_Ins01_HdrR, MST_PURC_ACT_R>();
			}
			return _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del;
		}
		protected Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del<Purc_Ins01_HdrR, MST_PURC_ACT_R> _Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del = null;
		public class Map_Purc_Ins01_HdrR_MST_PURC_ACT_R_for_upd_or_del<D extends Purc_Ins01_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_act_rev, MST_PURC_ACT_R.$purc_act_rev);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, MST_PURC_ACT_R.$purc_dpt_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, MST_PURC_ACT_R.$wg_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, MST_PURC_ACT_R.$purc_usr_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate_cd, MST_PURC_ACT_R.$xrate_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate, MST_PURC_ACT_R.$xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, MST_PURC_ACT_R.$ptax_xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, MST_PURC_ACT_R.$ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, MST_PURC_ACT_R.$pay_basis_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_schd_dt, MST_PURC_ACT_R.$pay_schd_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, MST_PURC_ACT_R.$ptax_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, MST_PURC_ACT_R.$rcpt_iv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_mng_no, MST_PURC_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_rev, MST_PURC_ACT_R.$rcpt_iv_rev);
				addColumnPathMap(Purc_Ins01_HdrR.$ref_rcpt_iv_no, MST_PURC_ACT_R.$ref_rcpt_iv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_ret_act_no, MST_PURC_ACT_R.$purc_ret_act_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_ret_act_rev, MST_PURC_ACT_R.$purc_ret_act_rev);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, MST_PURC_ACT_R.$trd_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, MST_PURC_ACT_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, MST_PURC_ACT_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, MST_PURC_ACT_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, MST_PURC_ACT_R.$sub_char3);

			}
		}
		
		/**
		 * 仕入実績ヘッダ(MST_PURC_ACT_D_R) -> 仕入実績サービス.上り電文(Purc_Ins01_DtlR)<br>
		 */
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del<Purc_Ins01_DtlR,MST_PURC_ACT_D_R> createMap_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del() {
			if (_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del == null) {
				_Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del = new Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del<Purc_Ins01_DtlR, MST_PURC_ACT_D_R>();
			}
			return _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del;
		}
		protected Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del<Purc_Ins01_DtlR, MST_PURC_ACT_D_R> _Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del = null;
		public class Map_Purc_Ins01_DtlR_MST_PURC_ACT_D_R_for_upd_or_del<D extends Purc_Ins01_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, MST_PURC_ACT_D_R.$disp_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, MST_PURC_ACT_D_R.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rcpt_iv_d_no, MST_PURC_ACT_D_R.$rcpt_iv_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_typ, MST_PURC_ACT_D_R.$ap_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, MST_PURC_ACT_D_R.$purc_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, MST_PURC_ACT_D_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, MST_PURC_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_id_typ, MST_PURC_ACT_D_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, MST_PURC_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, MST_PURC_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$temp_ap_flg, MST_PURC_ACT_D_R.$temp_ap_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, MST_PURC_ACT_D_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$edi_flg, MST_PURC_ACT_D_R.$edi_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_re_arr_qty, MST_PURC_ACT_D_R.$base_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_wg_cd, MST_PURC_ACT_D_R.$bd_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_bp_cd, MST_PURC_ACT_D_R.$bd_bp_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$po_no, MST_PURC_ACT_D_R.$po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$slo_no, MST_PURC_ACT_D_R.$slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_no, MST_PURC_ACT_D_R.$ref_purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_seq, MST_PURC_ACT_D_R.$ref_purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_no, MST_PURC_ACT_D_R.$ref_purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_seq, MST_PURC_ACT_D_R.$ref_purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, MST_PURC_ACT_D_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.arr_ptn_typ(src.getStringNE("arr_ptn_typ"));
			}
		}
		
		/**
		 * 仕入実績受払(MST_PURC_ACT_IO_R) -> 仕入実績サービス.上り電文(Purc_Ins01_IoR)<br>
		 */
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del<Purc_Ins01_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del() {
			if (_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del == null) {
				_Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del = new Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del<Purc_Ins01_IoR, MST_PURC_ACT_IO_R>();
			}
			return _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del;
		}
		protected Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del<Purc_Ins01_IoR, MST_PURC_ACT_IO_R> _Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del = null;
		public class Map_Purc_Ins01_IoR_MST_PURC_ACT_IO_R_for_upd_or_del<D extends Purc_Ins01_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_upri, MST_PURC_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_upri, MST_PURC_ACT_IO_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_amt, MST_PURC_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_amt, MST_PURC_ACT_IO_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_tax_amt, MST_PURC_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_cur_dscnt_amt, MST_PURC_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_upri, MST_PURC_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_upri, MST_PURC_ACT_IO_R.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_dscnt_amt, MST_PURC_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_amt, MST_PURC_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_amt, MST_PURC_ACT_IO_R.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$base_cur_tax_amt, MST_PURC_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_upri, MST_PURC_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_upri, MST_PURC_ACT_IO_R.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_dscnt_amt, MST_PURC_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_amt, MST_PURC_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_amt, MST_PURC_ACT_IO_R.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_tax_amt, MST_PURC_ACT_IO_R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$wtax_amt, MST_PURC_ACT_IO_R.$wtax_amt);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.gi_loc_cd(src.gi_loc_cd());
				dest.gi_wg_cd(src.gi_wg_cd());
				dest.gi_str_ln_cd(src.gi_str_ln_cd());
				dest.gi_unit_cd(src.gi_unit_cd());
				dest.from_gd_cd(src.gd_cd());
			}
			
			
		}
		
		/**
		 * 仕入実績サービス.上り電文(Purc_Chk02_IoR) -> 仕入実績サービス.上り電文(Purc_Ins01_IoR)<br>
		 */
		protected Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del<Purc_Ins01_IoR,Purc_Chk02_IoR> createMap_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del() {
			if (_Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del == null) {
				_Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del = new Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del<Purc_Ins01_IoR, Purc_Chk02_IoR>();
			}
			return _Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del;
		}
		protected Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del<Purc_Ins01_IoR, Purc_Chk02_IoR> _Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del = null;
		public class Map_Purc_Ins01_IoR_Purc_Chk02_IoR_for_upd_or_del<D extends Purc_Ins01_IoR, S extends Purc_Chk02_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$screen_tgt_flg, Purc_Chk02_IoR.$screen_tgt_flg);
				addColumnPathMap(Purc_Ins01_IoR.$src_peg_no, Purc_Chk02_IoR.$src_peg_no);
				addColumnPathMap(Purc_Ins01_IoR.$peg_no, Purc_Chk02_IoR.$peg_no);
				addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Purc_Chk02_IoR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_IoR.$arr_dt, Purc_Chk02_IoR.$arr_dt);
				addColumnPathMap(Purc_Ins01_IoR.$ac_dt, Purc_Chk02_IoR.$ac_dt);
				addColumnPathMap(Purc_Ins01_IoR.$arr_ptn_typ, Purc_Chk02_IoR.$arr_ptn_typ);
				addColumnPathMap(Purc_Ins01_IoR.$po_no, Purc_Chk02_IoR.$po_no);
				addColumnPathMap(Purc_Ins01_IoR.$po_d_no, Purc_Chk02_IoR.$po_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$arr_schd_no, Purc_Chk02_IoR.$arr_schd_no);
				addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, Purc_Chk02_IoR.$arr_act_no);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, Purc_Chk02_IoR.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Purc_Chk02_IoR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Purc_Chk02_IoR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Purc_Chk02_IoR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Purc_Chk02_IoR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Purc_Chk02_IoR.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, Purc_Chk02_IoR.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_qty, Purc_Chk02_IoR.$trd_unit_conv_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_base_qty, Purc_Chk02_IoR.$trd_unit_conv_base_qty);
				addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Chk02_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, Purc_Chk02_IoR.$gi_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, Purc_Chk02_IoR.$gi_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, Purc_Chk02_IoR.$gi_str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, Purc_Chk02_IoR.$gi_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Purc_Chk02_IoR.$from_gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Purc_Chk02_IoR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, Purc_Chk02_IoR.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Purc_Chk02_IoR.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Purc_Chk02_IoR.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Purc_Chk02_IoR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, Purc_Chk02_IoR.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, Purc_Chk02_IoR.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, Purc_Chk02_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, Purc_Chk02_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Chk02_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Ins01_IoR.$abort_flg, Purc_Chk02_IoR.$abort_flg);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Purc_Chk02_IoR.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Purc_Chk02_IoR.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Purc_Chk02_IoR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Purc_Chk02_IoR.$gd_cd);

			}
		}
		
		/**
		 * リスト内のデータ更新区分が全て「削除」かチェックする
		 * @param tgtList 対象リスト
		 * @return true:全て「削除」のデータ更新区分
		 */
		protected boolean isAllDel(MCList<?> tgtList) {
			
			boolean allDelFlg = true;
			
			for (MCRow row : tgtList) {
				if (!MAC_DATA_CRUD_TYP.isDEL(row.getStringNE("data_crud_typ"))) {
					allDelFlg = false;
					break;
				}
			}
			
			return allDelFlg;
		}
		
		/**
		 * RowMapper<br>
		 * 仕入実績サービス.上り電文(Purc_Ins01_IoR) -> 仕入実績サービス.上り電文(Purc_Ins01_DtlR)<br>
		 */
		protected Map_Purc_Ins01_DtlR_Purc_Ins01_IoR<Purc_Ins01_DtlR,Purc_Ins01_IoR> createMap_Purc_Ins01_DtlR_Purc_Ins01_IoR() {
			if (_Map_Purc_Ins01_DtlR_Purc_Ins01_IoR == null) {
				_Map_Purc_Ins01_DtlR_Purc_Ins01_IoR = new Map_Purc_Ins01_DtlR_Purc_Ins01_IoR<Purc_Ins01_DtlR, Purc_Ins01_IoR>();
			}
			return _Map_Purc_Ins01_DtlR_Purc_Ins01_IoR;
		}
		protected Map_Purc_Ins01_DtlR_Purc_Ins01_IoR<Purc_Ins01_DtlR, Purc_Ins01_IoR> _Map_Purc_Ins01_DtlR_Purc_Ins01_IoR = null;
		public class Map_Purc_Ins01_DtlR_Purc_Ins01_IoR<D extends Purc_Ins01_DtlR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$ac_dt, Purc_Ins01_IoR.$ac_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_dt, Purc_Ins01_IoR.$arr_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_ptn_typ, Purc_Ins01_IoR.$arr_ptn_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_IoR.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, Purc_Ins01_IoR.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, Purc_Ins01_IoR.$po_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rcpt_iv_d_no, Purc_Ins01_IoR.$rcpt_iv_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, Purc_Ins01_IoR.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, Purc_Ins01_IoR.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, Purc_Ins01_IoR.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, Purc_Ins01_IoR.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, Purc_Ins01_IoR.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, Purc_Ins01_IoR.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, Purc_Ins01_IoR.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, Purc_Ins01_IoR.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, Purc_Ins01_IoR.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, Purc_Ins01_IoR.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, Purc_Ins01_IoR.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, Purc_Ins01_IoR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, Purc_Ins01_IoR.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, Purc_Ins01_IoR.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, Purc_Ins01_IoR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_id_typ, Purc_Ins01_IoR.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, Purc_Ins01_IoR.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, Purc_Ins01_IoR.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, Purc_Ins01_IoR.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, Purc_Ins01_IoR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, Purc_Ins01_IoR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, Purc_Ins01_IoR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, Purc_Ins01_IoR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, Purc_Ins01_IoR.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, Purc_Ins01_IoR.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_IoR.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, Purc_Ins01_IoR.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, Purc_Ins01_IoR.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, Purc_Ins01_IoR.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, Purc_Ins01_IoR.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, Purc_Ins01_IoR.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, Purc_Ins01_IoR.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, Purc_Ins01_IoR.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, Purc_Ins01_IoR.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, Purc_Ins01_IoR.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, Purc_Ins01_IoR.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, Purc_Ins01_IoR.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, Purc_Ins01_IoR.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, Purc_Ins01_IoR.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, Purc_Ins01_IoR.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, Purc_Ins01_IoR.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, Purc_Ins01_IoR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, Purc_Ins01_IoR.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, Purc_Ins01_IoR.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, Purc_Ins01_IoR.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, Purc_Ins01_IoR.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, Purc_Ins01_IoR.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, Purc_Ins01_IoR.$wtax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$pa_po_no, Purc_Ins01_IoR.$po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, Purc_Ins01_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, Purc_Ins01_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, Purc_Ins01_IoR.$sub_char1);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, Purc_Ins01_IoR.$sub_char2);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, Purc_Ins01_IoR.$sub_char3);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_schd_no, Purc_Ins01_IoR.$arr_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, Purc_Ins01_IoR.$abort_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_cont_qty, Purc_Ins01_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_sync_flg, Purc_Ins01_IoR.$arr_sync_flg);

			}
			
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Purc_Chk02_IoR) -> 仕入実績サービス.上り電文(Purc_Ins01_IoR)<br>
		 */
		protected Map_Purc_Ins01_IoR_Purc_Chk02_IoR<Purc_Ins01_IoR,Purc_Chk02_IoR> createMap_Purc_Ins01_IoR_Purc_Chk02_IoR() {
			if (_Map_Purc_Ins01_IoR_Purc_Chk02_IoR == null) {
				_Map_Purc_Ins01_IoR_Purc_Chk02_IoR = new Map_Purc_Ins01_IoR_Purc_Chk02_IoR<Purc_Ins01_IoR, Purc_Chk02_IoR>();
			}
			return _Map_Purc_Ins01_IoR_Purc_Chk02_IoR;
		}
		protected Map_Purc_Ins01_IoR_Purc_Chk02_IoR<Purc_Ins01_IoR, Purc_Chk02_IoR> _Map_Purc_Ins01_IoR_Purc_Chk02_IoR = null;
		public class Map_Purc_Ins01_IoR_Purc_Chk02_IoR<D extends Purc_Ins01_IoR, S extends Purc_Chk02_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$ac_dt, Purc_Chk02_IoR.$ac_dt);
				addColumnPathMap(Purc_Ins01_IoR.$arr_dt, Purc_Chk02_IoR.$arr_dt);
				addColumnPathMap(Purc_Ins01_IoR.$arr_schd_no, Purc_Chk02_IoR.$arr_schd_no);
				addColumnPathMap(Purc_Ins01_IoR.$po_no, Purc_Chk02_IoR.$po_no);
				addColumnPathMap(Purc_Ins01_IoR.$po_d_no, Purc_Chk02_IoR.$po_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Purc_Chk02_IoR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_IoR.$arr_ptn_typ, Purc_Chk02_IoR.$arr_ptn_typ);
				addColumnPathMap(Purc_Ins01_IoR.$po_no, Purc_Chk02_IoR.$po_no);
				addColumnPathMap(Purc_Ins01_IoR.$po_d_no, Purc_Chk02_IoR.$po_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$rcpt_iv_d_no, Purc_Chk02_IoR.$rcpt_iv_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$itm_cd, Purc_Chk02_IoR.$itm_cd);
				addColumnPathMap(Purc_Ins01_IoR.$itm_sub1, Purc_Chk02_IoR.$itm_sub1);
				addColumnPathMap(Purc_Ins01_IoR.$itm_sub2, Purc_Chk02_IoR.$itm_sub2);
				addColumnPathMap(Purc_Ins01_IoR.$itm_sub3, Purc_Chk02_IoR.$itm_sub3);
				addColumnPathMap(Purc_Ins01_IoR.$sundry_itm_flg, Purc_Chk02_IoR.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_IoR.$itm_nm, Purc_Chk02_IoR.$itm_nm);
				addColumnPathMap(Purc_Ins01_IoR.$iv_itm_nm, Purc_Chk02_IoR.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Purc_Chk02_IoR.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Purc_Chk02_IoR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, Purc_Chk02_IoR.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Purc_Chk02_IoR.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$arr_schd_no, Purc_Chk02_IoR.$arr_schd_no);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_qty, Purc_Chk02_IoR.$trd_unit_conv_qty);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_base_qty, Purc_Chk02_IoR.$trd_unit_conv_base_qty);
				addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Chk02_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, Purc_Chk02_IoR.$gi_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, Purc_Chk02_IoR.$gi_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, Purc_Chk02_IoR.$gi_str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, Purc_Chk02_IoR.$gi_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Purc_Chk02_IoR.$from_gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Purc_Chk02_IoR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_IoR.$abort_flg, Purc_Chk02_IoR.$abort_flg);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Purc_Chk02_IoR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Purc_Chk02_IoR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Purc_Chk02_IoR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Purc_Chk02_IoR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Purc_Chk02_IoR.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, Purc_Chk02_IoR.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Purc_Chk02_IoR.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Purc_Chk02_IoR.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Purc_Chk02_IoR.$in_to_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Purc_Chk02_IoR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, Purc_Chk02_IoR.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Purc_Chk02_IoR.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, Purc_Chk02_IoR.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, Purc_Chk02_IoR.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, Purc_Chk02_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, Purc_Chk02_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$arr_sync_flg, Purc_Chk02_IoR.$arr_sync_flg);
				
			}
		}

		/**
		 * RowMaper<br>
		 * 発注ヘッダ(MST_PO_R) -> 仕入実績サービス.上り電文(Purc_Ins01_HdrR)<br>
		 */
		protected Map_Purc_Ins01_HdrR_MST_PO_R<Purc_Ins01_HdrR,MST_PO_R> createMap_Purc_Ins01_HdrR_MST_PO_R() {
			if (_Map_Purc_Ins01_HdrR_MST_PO_R == null) {
				_Map_Purc_Ins01_HdrR_MST_PO_R = new Map_Purc_Ins01_HdrR_MST_PO_R<Purc_Ins01_HdrR, MST_PO_R>();
			}
			return _Map_Purc_Ins01_HdrR_MST_PO_R;
		}
		protected Map_Purc_Ins01_HdrR_MST_PO_R<Purc_Ins01_HdrR, MST_PO_R> _Map_Purc_Ins01_HdrR_MST_PO_R = null;
		public class Map_Purc_Ins01_HdrR_MST_PO_R<D extends Purc_Ins01_HdrR, S extends MST_PO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, MST_PO_R.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, MST_PO_R.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$po_no, MST_PO_R.$po_no);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, MST_PO_R.$purc_dpt_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, MST_PO_R.$wg_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, MST_PO_R.$purc_usr_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, MST_PO_R.$sppl_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, MST_PO_R.$trd_cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, MST_PO_R.$tterm_cd1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, MST_PO_R.$tterm_rmrks1);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, MST_PO_R.$tterm_cd2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, MST_PO_R.$tterm_rmrks2);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, MST_PO_R.$tterm_cd3);
				addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, MST_PO_R.$tterm_rmrks3);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, MST_PO_R.$trd_rmrks);
				addColumnPathMap(Purc_Ins01_HdrR.$aprv_flg, MST_PO_R.$aprv_flg);
				addColumnPathMap(Purc_Ins01_HdrR.$aprv_no, MST_PO_R.$aprv_no);

			}
		}
		
	}
	
	/**
	 * Purc_Chk03オペレーション.<p>
	 *
	 */
	public class Purc_Chk03 extends MSBDL_PurcActRegService_MC_A.Purc_Chk03 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 仕入諸掛分を補完
			cmplForRcptIv();

			// 仕入実績キャッシュ
			initPurcActCache(up0());
			initPurcActDCache(up1());
			initPurcActIoCache(up2());

			cmplForCache();

			//ワークテーブルに保存
			MCList<MST_ARR_SCHD_R> wkArrSchd = crtWkArrSchd(up1());
			MCList<MST_PO_D_R> wkPoD = crtWkPod(up1());

			// 発注先キャッシュ
			initSpplCacheBySpplCd(up0());
			// 支給先キャッシュ
			initPrspplCache(up2());
			// 負担部門キャッシュ
			createBdDptCache(up1());
			// 通貨キャッシュ
			initCurCache(up0());
			// 取引先禁止マスタをキャッシュ
			initBpStpCache(up0());
			// 品目禁止マスタキャッシュ
			initStopItmCache(up1());
			// 場所マスタをキャッシュ
			initArrSchdLocCache(up1(), wkArrSchd);
			initArrActLocCache(up2());
			initPaiLocCache(up2());
			initLocCache(up2());
			// 発注ヘッダをキャッシュ
			initPoCache(up0());
			// 品目マスタをキャッシュ
			initItmCache(up1());
			// 仕入理由をキャッシュ
			createPurcRsnCache(up1());
			initTaxCache(up1());
			// 発注明細をキャッシュ
			initPoDCache(up1());
			// 受領インボイス明細をキャッシュ
			initRcptIvDCache(up1());
			// 仕入予定をキャッシュ
			initPurcSchdCache(up1());
			// 仕入予定キャッシュから入荷予定NOを取得し、電文にセット
			cmplUpParamByCache();
			// 入荷予定をキャッシュ
			initArrSchdCache(up1());
			// 受領インボイスを持つ仕入予定をキャッシュ
			if (up3().purc_ddlv_reg_exec_flg()) {
				initHavIvPurcSchdCache(up1());
			}
			// 入荷実績をキャッシュ
			initArrActCache(up2());
			// 入荷実績を仕入実績受払NOでキャッシュ
			initArrActCacheByPurcActIoNo(up2());
			// 仕入実績明細をキャッシュ
			initBfUpdPurcActDCache(up1());
			// 仕入実績明細を仕入予定NOでキャッシュ
			initPurcActDCacheByPurcSchdNo(up1());
			// 仕入実績受払を入荷実績NOでキャッシュ
			initPaiCcByAaNo(up2());
			// 再入荷予定をキャッシュ
			initReArrSchd(up1());
			// 品目オーダをキャッシュ
			initItmOrdCache(up1(), wkPoD);
			// 入荷進捗をキャッシュ
			initArrPrCache(up1(), wkPoD);
			// 仕入実績受払をキャッシュ
			initPurcActIoCache(up2());
			// 検査実績をキャッシュ
			initInspActCache(up2());
			
			//ワークテーブルの削除
			MST_ARR_SCHD_R wkArrSchd_t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder wkArrSchd_bldr = MCQueryApiBuilder.create(wkArrSchd_t);
			delWk(wkArrSchd, wkArrSchd_t, wkArrSchd_bldr);
			MST_PO_D_R wkPoD_t = MST_PO_D_R.create("T");
			MCQueryApiBuilder wkPoD_bldr = MCQueryApiBuilder.create(wkPoD_t);
			delWk(wkPoD, wkPoD_t, wkPoD_bldr);
			
			// 仕入実績サービスのチェック処理
			chkHdr();
			chkDtl();
			chkIo();

			// 明細上り電文と詳細上り電文の整合性チェック
			checkValueBetweenDtlAndIo();

			// 電文の補完
			cmplParams();

			if (!up3().purc_dtl_flg()) {
				// 仕入予定サービスのチェック処理
				callPurcSchdCheckService();
				
				// 入荷実績サービスのチェック処理
				callArrActCheckService();
				
				// 入荷予定サービスのチェック処理
				callArrSchdCheckService();

				// 市場出荷判定・仕入直送売上可能チェック処理
				callMrktJudg_Chk03();
				
				// 支給実績サービスのチェック処理
				callProvActChk01();
				
				// 外注製造実績サービス・チェック処理
				callOutSrcAct_Chk01();
				
				// 承認提供サービス・次処理済更新前チェック
				callAprvChk02(up0());
				
				// 承認提供サービス・次処理済解除前チェック
				callAprvChk03(up0());
			}
			else {
				// 入荷実績サービスのチェック処理
				callArrActCheck4PurcDtl();
			}
			
			// 締処理チェック
			MCJoinKey<MCList<Purc_Chk03_HdrR>> d2h = up1().join(
					Purc_Chk03_DtlR.$hdr_peg_no, up0(), Purc_Chk03_HdrR.$peg_no);
			MCJoinKey<MCList<Purc_Chk03_DtlR>> i2d = up2().join(
					Purc_Chk03_IoR.$dtl_peg_no, up1(), Purc_Chk03_DtlR.$peg_no);
			callCl_ChkOpe(up2(), d2h, i2d, up3());

			callApDtlRegServiceChk01(up0(), up1());
			// エラーＦＬＧがオフの仕入伝票をキャッシュに登録
			if (up3().crt_param_cache_flg()) {
				setParamCache();
			}

			// チェック結果を下り電文にセット
			setDown();
			
		}

		/**
		 * 受領インボイスで登録される仕入諸掛分を補完する
		 */
		protected void cmplForRcptIv() {

			if ( !(up3().arr_act_srvs_flg() || up3().purc_ddlv_reg_exec_flg()) ) {
				return;
			}
			
			MCJoinKey<MCList<Purc_Chk03_HdrR>> jk = up1().join(Purc_Chk03_DtlR.$hdr_peg_no, up0(), Purc_Chk03_HdrR.$peg_no);
			
			// 受領インボイス管理ＮＯが設定されてこないので仕入予定ＮＯまたは仕入実績ＮＯを元に補完する
			MCList<MST_RCPT_IV_D_R> dbc1 = MCList.create(MST_RCPT_IV_D_R.class);
			MST_RCPT_IV_D_R dbc1_t = MST_RCPT_IV_D_R.create("T");
			MCQueryApiBuilder dbc1_bldr = MCQueryApiBuilder.create(dbc1_t);
			dbc1_bldr.setSelect(dbc1_t.rcpt_iv_mng_no, dbc1_t.purc_schd_no);
			dbc1_bldr.setWhere(dbc1_t.purc_schd_no.eq(bind("purc_schd_no")));
			dbSelect("MSBDL5180_MST_RCPT_IV_D_S02", dbc1, dbc1_bldr, up1());
			MCIndexKey idx1 = dbc1.createIndex(MST_RCPT_IV_D_R.$purc_schd_no);
			for (Purc_Chk03_DtlR up1R : up1()) {
				MST_RCPT_IV_D_R dbcR = dbc1.getFirst(idx1, up1R.purc_schd_no());
				if (!isNull(dbcR)) {
					up1R.getJoinedRow(jk).rcpt_iv_mng_no(dbcR.rcpt_iv_mng_no());
				}
			}
			
			MCList<MST_PURC_ACT_R> dbc2 = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R dbc2_t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder dbc2_bldr = MCQueryApiBuilder.create(dbc2_t);
			MST_RCPT_IV_R dbc2_t2 = MST_RCPT_IV_R.create("T2");
			
			dbc2_bldr.setSelect(dbc2_t.rcpt_iv_mng_no, dbc2_t.purc_act_no, dbc2_t.rcpt_iv_no, dbc2_t.rcpt_iv_rev);
			dbc2_bldr.addInnerJoin(dbc2_t2, bracket( dbc2_t2.rcpt_iv_mng_no.eq(dbc2_t.rcpt_iv_mng_no)));
			dbc2_bldr.setWhere(dbc2_t.purc_act_no.eq(bind("purc_act_no")));
			dbc2_bldr.addConstWhereWithAnd(dbc2_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbc2_bldr.addConstWhereWithAnd(dbc2_t2.purc_cmpl_flg.eq(value(true)));
			dbSelect("MSBDL5180_MST_PURC_ACT_S08", dbc2, dbc2_bldr, up0(), null);
			
			MCIndexKey idx2 = dbc2.createIndex(MST_PURC_ACT_R.$purc_act_no);
			MCIndexKey idxUp1 = up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no);
			for (Purc_Chk03_HdrR up0R : up0()) {
				MST_PURC_ACT_R dbcR = dbc2.getFirst(idx2, up0R.purc_act_no());
				if (!isNull(dbcR)) {
					up0R.rcpt_iv_mng_no(dbcR.rcpt_iv_mng_no());
					up0R.rcpt_iv_no(dbcR.rcpt_iv_no());
					up0R.rcpt_iv_rev(dbcR.rcpt_iv_rev());
				}
				else if (up3().arr_act_srvs_flg()) {
					Purc_Chk03_DtlR up1R = up1().getFirst(idxUp1, up0R.peg_no());
					if (!up1R.arr_sync_flg()) {
						up0R.rcpt_iv_mng_no(null);
						up0R.rcpt_iv_no(null);
						up0R.rcpt_iv_rev(null);
					}
				}
			}
			
			MCList<Purc_Chk03_HdrR> tgtL =
				up0().groupBy(Purc_Chk03_HdrR.$rcpt_iv_mng_no).subList(r -> !isNull(r.rcpt_iv_mng_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			
			// 受領インボイス登録で追加された仕入諸掛分を取得
			MCList<MST_RCPT_IV_D_R> rcptIvL = MCList.create(MST_RCPT_IV_D_R.class);
			rcptIvL.addBooleanColumn("dscnt_itm_flg");
			rcptIvL.addBooleanColumn("xpns_purc_flg");
			MST_RCPT_IV_D_R rcptIvL_t = MST_RCPT_IV_D_R.create("T");
			MCQueryApiBuilder rcptIvL_bldr = MCQueryApiBuilder.create(rcptIvL_t);
			MST_RCPT_IV_R rcptIvL_t2 = MST_RCPT_IV_R.create("T2");
			MAM_ITM_R rcptIvL_m1 = MAM_ITM_R.create("M1");
			MAM_BP_R rcptIvL_m2 = MAM_BP_R.create("M2");
			MAM_BIZ_RSN_R rcptIvL_m3 = MAM_BIZ_RSN_R.create("M3");
			rcptIvL_bldr.addSelect(rcptIvL_m1.stk_mng_typ, rcptIvL_m1.asset_mng_typ, rcptIvL_m1.dscnt_itm_flg);
			rcptIvL_bldr.addSelect(nvl( rcptIvL_m1.pay_crryovr_times, rcptIvL_m2.pay_crryovr_times).as("pay_crryovr_times"));
			rcptIvL_bldr.addSelect(rcptIvL_m3.xpns_purc_flg);
			rcptIvL_bldr.addInnerJoin(rcptIvL_t2, bracket( rcptIvL_t2.rcpt_iv_mng_no.eq(rcptIvL_t.rcpt_iv_mng_no)));
			rcptIvL_bldr.addLeftOuterJoin(rcptIvL_m1,
					bracket(rcptIvL_m1.itm_cd.eq(rcptIvL_t.itm_cd)
							.and(rcptIvL_m1.itm_sub1.eq(rcptIvL_t.itm_sub1))
							.and(rcptIvL_m1.itm_sub2.eq(rcptIvL_t.itm_sub2))
							.and(rcptIvL_m1.itm_sub3.eq(rcptIvL_t.itm_sub3))));
			rcptIvL_bldr.addLeftOuterJoin(rcptIvL_m2, bracket( rcptIvL_m2.bp_cd.eq(rcptIvL_t2.sppl_cd)));
			rcptIvL_bldr.addLeftOuterJoin(rcptIvL_m3, bracket( rcptIvL_m3.biz_rsn_cd.eq(rcptIvL_t.purc_rsn_cd)));
			rcptIvL_bldr.setWhere(rcptIvL_t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			rcptIvL_bldr.addConstWhereWithAnd(rcptIvL_t.manual_add_flg.eq(value(true)));
			dbSelect("MSBDL5180_MST_RCPT_IV_D_S03", rcptIvL, rcptIvL_bldr, tgtL, null);
			
			if (rcptIvL.isEmpty()) {
				return;
			}
			
			// 受領インボイス明細に対応する仕入実績を取得（受領インボイス明細と仕入実績明細、仕入実績詳細は常に1対1対1の関係となる）
			MCList<MST_PURC_ACT_D_R> purcActL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R purcActL_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(purcActL_t);
			MST_PURC_ACT_IO_R purcActL_t2 = MST_PURC_ACT_IO_R.create("T2");
			MST_PURC_ACT_R purcActL_t3 = MST_PURC_ACT_R.create("T3");
			purcActL_bldr.setGroupBy(purcActL_t.rcpt_iv_d_no, purcActL_t.purc_act_no,
					purcActL_t.purc_act_d_no, purcActL_t2.purc_act_io_no);
			purcActL_bldr.addGroupFunc(max(purcActL_t.purc_act_seq), "purc_act_seq");
			purcActL_bldr.addGroupFunc(max(purcActL_t.purc_act_d_seq), "purc_act_d_seq");
			purcActL_bldr.addGroupFunc(max(purcActL_t2.purc_act_io_seq), "purc_act_io_seq");
			purcActL_bldr.addInnerJoin(purcActL_t2,
					bracket(purcActL_t2.purc_act_d_no.eq(purcActL_t.purc_act_d_no)
							.and(purcActL_t2.purc_act_d_seq.eq(purcActL_t.purc_act_d_seq))));
			purcActL_bldr.addInnerJoin(purcActL_t3,
					bracket(purcActL_t3.purc_act_no.eq(purcActL_t.purc_act_no)
							.and(purcActL_t3.purc_act_seq.eq(purcActL_t.purc_act_seq))
							.and(purcActL_t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			purcActL_bldr.setWhere(purcActL_t.rcpt_iv_d_no.eq(bind("rcpt_iv_d_no")));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S08", purcActL, purcActL_bldr, rcptIvL);
			
			MCIndexKey
				rcptIvIdx = rcptIvL.createIndex(MST_RCPT_IV_D_R.$rcpt_iv_mng_no),
				purcActIdx = purcActL.createIndex(MST_PURC_ACT_D_R.$rcpt_iv_d_no),
				up0Idx = up0().createIndex(Purc_Chk03_HdrR.$rcpt_iv_mng_no),
				up1Idx = up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no),
				up2Idx = up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);

			int
				hdrPegNo = ((MCNumber)up0().max(Purc_Chk03_HdrR.$peg_no)).intValue(),
				dtlPegNo = ((MCNumber)up1().max(Purc_Chk03_DtlR.$peg_no)).intValue(),
				ioPegNo = ((MCNumber)up2().max(Purc_Chk03_IoR.$peg_no)).intValue();

			MCList<Purc_Chk03_HdrR> up0L = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> up1L = MCList.create(Purc_Chk03_DtlR.class);
			MCList<Purc_Chk03_IoR> up2L = MCList.create(Purc_Chk03_IoR.class);

			// ヘッダまとめ用カラム
			up1L.addStringColumn(Purc_Chk03_HdrR.$trd_cd);
			up1L.addStringColumn(Purc_Chk03_HdrR.$trd_ptn_typ);
			up1L.addStringColumn(Purc_Chk03_HdrR.$purc_dpt_cd);
			up1L.addStringColumn(Purc_Chk03_HdrR.$purc_usr_cd);
			up1L.addStringColumn(Purc_Chk03_HdrR.$wg_cd);
			up1L.addStringColumn(Purc_Chk03_HdrR.$rcpt_iv_mng_no);
			
			// 税取得用カラム
			up1L.addBooleanColumn(MST_RCPT_IV_D_R.$tax_fix_flg);
			up1L.addStringColumn(Purc_Chk03_HdrR.$sppl_cd);
			up1L.addDateColumn(Purc_Chk03_HdrR.$purc_dt);
			
			// 組織変更用カラム
			up1L.addDateColumn(Purc_Chk03_HdrR.$ac_dt);

			for (Purc_Chk03_HdrR tgtR : tgtL) {

				// 仕入諸掛を取得
				MCList<MST_RCPT_IV_D_R> subRcptIvL = rcptIvL.subList(rcptIvIdx, tgtR.rcpt_iv_mng_no());
				if (subRcptIvL.isEmpty()) {
					continue;
				}
				
				Purc_Chk03_HdrR baseHdrR = up0().getFirst(up0Idx, tgtR.rcpt_iv_mng_no());
				Purc_Chk03_DtlR baseDtlR = up1().getFirst(up1Idx, baseHdrR.peg_no());
				Purc_Chk03_IoR baseIoR = up2().getFirst(up2Idx, baseDtlR.peg_no());
				
				// 仕入諸掛分の明細と詳細を作成
				for (MST_RCPT_IV_D_R rcptIvR : subRcptIvL) {
					MST_PURC_ACT_D_R purcActR = purcActL.getFirst(purcActIdx, rcptIvR.rcpt_iv_d_no());

					// 明細作成
					Purc_Chk03_DtlR dtlR = up1L.add();
					dtlR.peg_no(++dtlPegNo);
					setDtlRForCmplRcptIv(dtlR, rcptIvR, purcActR, baseHdrR, baseDtlR, baseIoR);
					
					// 詳細作成
					Purc_Chk03_IoR ioR = up2L.add();
					ioR.src_peg_no(null);
					ioR.dtl_peg_no(dtlR.peg_no());
					ioR.peg_no(++ioPegNo);
					setIoRForCmplRcptIv(ioR, rcptIvR, purcActR, baseHdrR, baseIoR);
				}
			}
			
			// 仕入諸掛分のヘッダを作成
			for (MCList<Purc_Chk03_DtlR> dtlL : up1L.groupList(getHdrGrpKey())) {
				Purc_Chk03_DtlR baseDtlR = dtlL.get(0);
				Purc_Chk03_HdrR baseHdrR = up0().getFirst(up0Idx, baseDtlR.getStringNE(Purc_Chk03_HdrR.$rcpt_iv_mng_no));
				
				Purc_Chk03_HdrR hdrR = up0L.add();
				hdrR.peg_no(++hdrPegNo);
				setHdrRForCmplRcptIv(hdrR, baseHdrR, baseDtlR);
				
				dtlL.forEach(dtlR -> {
					dtlR.hdr_peg_no(hdrR.peg_no());
				});
			}
			
			// 税ＣＤ最新化
			resetPurcTaxCd(up1L);
			
			// 組織変更
			setDpt(up0L, up1L);
			
			// 処理対象に加える
			if (!up0L.isEmpty()) {
				up0().addAll(up0L);
				up1().addAll(up1L);
				up2().addAll(up2L);
			}
		}
		/**
		 * ヘッダまとめのキー
		 */
		protected String[] getHdrGrpKey() {
			return new String[]{
				Purc_Chk03_DtlR.$purc_act_no,
				Purc_Chk03_DtlR.$purc_act_seq,
				Purc_Chk03_HdrR.$trd_cd,
				Purc_Chk03_HdrR.$trd_ptn_typ,
				Purc_Chk03_HdrR.$purc_dpt_cd,
				Purc_Chk03_HdrR.$purc_usr_cd,
				Purc_Chk03_HdrR.$wg_cd,
				Purc_Chk03_HdrR.$rcpt_iv_mng_no
			};
		}
		/**
		 * 仕入諸掛用のヘッダを設定する
		 */
		protected void setHdrRForCmplRcptIv(Purc_Chk03_HdrR hdrR, Purc_Chk03_HdrR baseHdrR, Purc_Chk03_DtlR baseDtlR) {
			hdrR.no_chk_flg(false);
			hdrR.data_crud_typ(baseHdrR.data_crud_typ());
			hdrR.io_make_flg(baseHdrR.io_make_flg());
			hdrR.purc_act_no(baseDtlR.purc_act_no());
			hdrR.purc_act_seq(baseDtlR.purc_act_seq());
			hdrR.trd_cd(baseDtlR.getStringNE(Purc_Chk03_HdrR.$trd_cd));
			hdrR.trd_ptn_typ(baseDtlR.getStringNE(Purc_Chk03_HdrR.$trd_ptn_typ));
			hdrR.po_no(null);
			hdrR.purc_dpt_cd(baseDtlR.getStringNE(Purc_Chk03_HdrR.$purc_dpt_cd));
			hdrR.purc_usr_cd(baseDtlR.getStringNE(Purc_Chk03_HdrR.$purc_usr_cd));
			hdrR.wg_cd(baseDtlR.getStringNE(Purc_Chk03_HdrR.$wg_cd));
			hdrR.sppl_cd(baseHdrR.sppl_cd());
			hdrR.subcon_flg(baseHdrR.subcon_flg());
			hdrR.purc_amt_rnd_typ(baseHdrR.purc_amt_rnd_typ());
			hdrR.purc_tax_rnd_typ(baseHdrR.purc_tax_rnd_typ());
			hdrR.purc_tax_calc_typ(baseHdrR.purc_tax_calc_typ());
			hdrR.trd_cur_cd(baseHdrR.trd_cur_cd());
			hdrR.trd_rmrks(baseHdrR.trd_rmrks());
			hdrR.intr_rmrks(baseHdrR.intr_rmrks());
			hdrR.tterm_cd1(baseHdrR.tterm_cd1());
			hdrR.tterm_rmrks1(baseHdrR.tterm_rmrks1());
			hdrR.tterm_cd2(baseHdrR.tterm_cd2());
			hdrR.tterm_rmrks2(baseHdrR.tterm_rmrks2());
			hdrR.tterm_cd3(baseHdrR.tterm_cd3());
			hdrR.tterm_rmrks3(baseHdrR.tterm_rmrks3());
			hdrR.sub_char1(baseHdrR.sub_char1());
			hdrR.sub_char2(baseHdrR.sub_char2());
			hdrR.sub_char3(baseHdrR.sub_char3());
			hdrR.purc_dt(baseHdrR.purc_dt());
			hdrR.ac_dt(baseHdrR.ac_dt());
			hdrR.can_ac_dt(baseHdrR.can_ac_dt());
			hdrR.pay_basis_dt(baseHdrR.pay_basis_dt());
			hdrR.pay_schd_dt(baseHdrR.pay_schd_dt());
			hdrR.rcpt_iv_no(baseHdrR.rcpt_iv_no());
			hdrR.rcpt_iv_mng_no(baseHdrR.rcpt_iv_mng_no());
			hdrR.rcpt_iv_rev(baseHdrR.rcpt_iv_rev());
			hdrR.ref_rcpt_iv_no(baseHdrR.ref_rcpt_iv_no());
			hdrR.xrate(baseHdrR.xrate());
			hdrR.ptax_dt(baseHdrR.ptax_dt());
			hdrR.ptax_xrate(baseHdrR.ptax_xrate());
		}
		/**
		 * 仕入諸掛用の明細を設定する
		 */
		protected void setDtlRForCmplRcptIv(
			Purc_Chk03_DtlR dtlR, MST_RCPT_IV_D_R rcptIvDR, MST_PURC_ACT_D_R purcActDR,
			Purc_Chk03_HdrR baseHdrR, Purc_Chk03_DtlR baseDtlR, Purc_Chk03_IoR baseIoR) {
			
			// 基準通貨の通貨マスタ取得
			MAM_CUR_R baseCur = MAM_CUR_R.create("T");
			dbSelectKey("MSBDL5180_MAM_CUR_S05", baseCur, MCQueryApiBuilder.create(baseCur),
					getCo().base_cur_cd());
			String xrate =getCo().xrate_rnd_typ();
			
			dtlR.no_chk_flg(false);
			dtlR.data_crud_typ(baseHdrR.data_crud_typ());
			dtlR.arr_ptn_typ(null);
			if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && !isNull(purcActDR)) {
				dtlR.purc_act_d_no(purcActDR.purc_act_d_no());
				dtlR.purc_act_d_seq(purcActDR.purc_act_d_seq());
				dtlR.purc_act_no(purcActDR.purc_act_no());
				dtlR.purc_act_seq(purcActDR.purc_act_seq());
			}
			dtlR.po_d_no(null);
			dtlR.purc_schd_no(rcptIvDR.purc_schd_no());
			dtlR.arr_schd_no(null);
			dtlR.rcpt_iv_d_no(rcptIvDR.rcpt_iv_d_no());
			dtlR.purc_src_typ(null);
			dtlR.purc_src_no(null);
			dtlR.purc_ret_act_d_no(null);
			dtlR.sync_flg(false);
			dtlR.purc_typ(null);
			dtlR.mfg_inst_no(null);
			dtlR.itm_cd(rcptIvDR.itm_cd());
			dtlR.itm_sub1(rcptIvDR.itm_sub1());
			dtlR.itm_sub2(rcptIvDR.itm_sub2());
			dtlR.itm_sub3(rcptIvDR.itm_sub3());
			dtlR.ver_no(null);
			dtlR.itm_nm(rcptIvDR.itm_nm());
			dtlR.iv_itm_nm(rcptIvDR.iv_itm_nm());
			dtlR.sppl_itm_cd(rcptIvDR.sppl_itm_cd());
			dtlR.sppl_itm_nm(rcptIvDR.sppl_itm_nm());
			dtlR.sundry_itm_flg(rcptIvDR.sundry_itm_flg());
			dtlR.dscnt_flg(rcptIvDR.getBooleanNE("dscnt_itm_flg"));
			dtlR.trd_unit_cd(rcptIvDR.trd_unit_cd());
			dtlR.trd_unit_qty(rcptIvDR.trd_unit_qty());
			dtlR.base_unit_cd(rcptIvDR.base_unit_cd());
			dtlR.base_unit_qty(rcptIvDR.base_unit_qty());
			dtlR.accpt_dfct_flg(false);
			dtlR.interim_flg(false);
			dtlR.trd_cur_upri(rcptIvDR.trd_cur_upri());
			dtlR.dscnt_rsn_cd(rcptIvDR.dscnt_rsn_cd());
			dtlR.trd_cur_dscnt_amt(rcptIvDR.trd_cur_dscnt_amt());
			dtlR.trd_cur_amt(rcptIvDR.trd_cur_amt());
			dtlR.trd_cur_tax_amt(rcptIvDR.trd_cur_tax_amt());
			dtlR.trd_cur_proc_upri(rcptIvDR.trd_cur_proc_upri());
			dtlR.trd_cur_proc_amt(rcptIvDR.trd_cur_proc_amt());
			dtlR.trd_cur_onr_prov_upri(rcptIvDR.trd_cur_onr_prov_upri());
			dtlR.trd_cur_onr_prov_amt(rcptIvDR.trd_cur_onr_prov_amt());
			dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), baseHdrR.xrate(), baseCur.upri_dec_place(), xrate));
			dtlR.base_cur_dscnt_amt(convToBaseCur(dtlR.trd_cur_dscnt_amt(), baseHdrR.xrate(), baseCur.amt_dec_place(), xrate));
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), baseHdrR.xrate(), baseCur.amt_dec_place(), xrate));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), baseHdrR.xrate(), baseCur.amt_dec_place(), xrate));
			dtlR.base_cur_proc_upri(convToBaseCur(dtlR.trd_cur_proc_upri(), baseHdrR.xrate(), baseCur.upri_dec_place(), xrate));
			dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), baseHdrR.xrate(), baseCur.amt_dec_place(), xrate));
			dtlR.base_cur_onr_prov_upri(convToBaseCur(dtlR.trd_cur_onr_prov_upri(), baseHdrR.xrate(), baseCur.upri_dec_place(), xrate));
			dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), baseHdrR.xrate(), baseCur.amt_dec_place(), xrate));
			dtlR.tax_cd(rcptIvDR.tax_cd());
			dtlR.wtax_rate(rcptIvDR.wtax_rate());
			dtlR.wtax_amt(rcptIvDR.wtax_amt());
			dtlR.abort_flg(false);
			dtlR.re_arr_flg(false);
			dtlR.re_arr_loc_cd(null);
			dtlR.re_arr_loc_wg_cd(null);
			dtlR.re_arr_str_ln_cd(null);
			dtlR.trd_unit_re_arr_qty(null);
			dtlR.base_unit_re_arr_qty(null);
			dtlR.re_arr_rqst_tm(null);
			dtlR.re_arr_purc_schd_dt(null);
			dtlR.re_arr_sync_flg(false);
			dtlR.ncv_flg(false);
			dtlR.maker_cd(rcptIvDR.maker_cd());
			dtlR.ap_dpt_cd(rcptIvDR.ap_dpt_cd());
			dtlR.pay_crryovr_times(rcptIvDR.getNumberNE("pay_crryovr_times"));
			dtlR.bd_itm_cd(rcptIvDR.bd_itm_cd());
			dtlR.bd_itm_sub1(rcptIvDR.bd_itm_sub1());
			dtlR.bd_itm_sub2(rcptIvDR.bd_itm_sub2());
			dtlR.bd_itm_sub3(rcptIvDR.bd_itm_sub3());
			dtlR.bd_sno1(rcptIvDR.bd_sno1());
			dtlR.bd_sno2(rcptIvDR.bd_sno2());
			dtlR.bd_sno3(rcptIvDR.bd_sno3());
			dtlR.bd_sno4(rcptIvDR.bd_sno4());
			dtlR.bd_lot_no(rcptIvDR.bd_lot_no());
			dtlR.bd_sublot_no(rcptIvDR.bd_sublot_no());
			dtlR.bd_ctg_cd(rcptIvDR.bd_ctg_cd());
			dtlR.bd_oper_cd(rcptIvDR.bd_oper_cd());
			dtlR.bd_iv_no(rcptIvDR.bd_iv_no());
			dtlR.bd_loc_cd(rcptIvDR.bd_loc_cd());
			dtlR.bd_po_no(rcptIvDR.bd_po_no());
			dtlR.bd_slo_no(rcptIvDR.bd_slo_no());
			dtlR.stk_mng_typ(rcptIvDR.getStringNE("stk_mng_typ"));
			dtlR.asset_mng_typ(rcptIvDR.getStringNE("asset_mng_typ"));
			dtlR.rsn_cd(rcptIvDR.purc_rsn_cd());
			dtlR.xpns_po_flg(rcptIvDR.getBooleanNE("xpns_purc_flg"));
			dtlR.bd_dpt_cd(rcptIvDR.bd_dpt_cd());
			dtlR.purc_cont_qty(null);
			dtlR.intr_rmrks(null);
			dtlR.trd_d_rmrks(rcptIvDR.trd_d_rmrks());
			dtlR.sub_char1(null);
			dtlR.sub_char2(null);
			dtlR.sub_char3(null);
			dtlR.ref_purc_act_no(null);
			dtlR.ref_purc_act_seq(null);
			dtlR.ref_purc_act_d_no(null);
			dtlR.ref_purc_act_d_seq(null);
			dtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
			dtlR.sno1(rcptIvDR.sno1());
			dtlR.sno2(rcptIvDR.sno2());
			dtlR.sno3(rcptIvDR.sno3());
			dtlR.sno4(rcptIvDR.sno4());
			dtlR.dlv_loc_wg_cd(baseIoR.dlv_loc_wg_cd());
			dtlR.dlv_loc_cd(baseIoR.dlv_loc_cd());
			dtlR.str_ln_cd(baseIoR.str_ln_cd());
			dtlR.lot_no(null);
			dtlR.sublot_no(null);
			dtlR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dtlR.stk_insp_typ( MSC_STK_INSP_TYP.FIN.value());
			dtlR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			dtlR.purc_id_typ(rcptIvDR.purc_id_typ());
			dtlR.stk_bp_cd(null);
			dtlR.bp_lot_no(null);
			dtlR.bp_dlv_slip_no(baseIoR.bp_dlv_slip_no());
			dtlR.bp_dlv_slip_d_no(null);
			dtlR.disp_seq(1);
			dtlR.edi_flg(baseDtlR.edi_flg());
			dtlR.ship_fr_valid_dt(null);
			
			// ヘッダまとめ項目
			dtlR.setStringNE(Purc_Chk03_HdrR.$trd_cd, rcptIvDR.trd_cd());
			dtlR.setStringNE(Purc_Chk03_HdrR.$trd_ptn_typ, rcptIvDR.trd_ptn_typ());
			dtlR.setStringNE(Purc_Chk03_HdrR.$purc_dpt_cd, rcptIvDR.purc_dpt_cd());
			dtlR.setStringNE(Purc_Chk03_HdrR.$purc_usr_cd, rcptIvDR.purc_usr_cd());
			dtlR.setStringNE(Purc_Chk03_HdrR.$wg_cd, rcptIvDR.wg_cd());
			dtlR.setStringNE(Purc_Chk03_HdrR.$rcpt_iv_mng_no, rcptIvDR.rcpt_iv_mng_no());
			
			// 税取得用カラム
			dtlR.setBooleanNE(MST_RCPT_IV_D_R.$tax_fix_flg, rcptIvDR.tax_fix_flg());
			dtlR.setStringNE(Purc_Chk03_HdrR.$sppl_cd, baseHdrR.sppl_cd());
			dtlR.setDateNE(Purc_Chk03_HdrR.$purc_dt, baseHdrR.purc_dt());
			
			// 組織変更用カラム
			dtlR.setDateNE(Purc_Chk03_HdrR.$ac_dt, baseHdrR.ac_dt());
		}
		/**
		 * 仕入諸掛用の詳細を設定する
		 */
		protected void setIoRForCmplRcptIv(
			Purc_Chk03_IoR ioR, MST_RCPT_IV_D_R rcptIvDR, MST_PURC_ACT_D_R purcActDR, Purc_Chk03_HdrR baseHdrR, Purc_Chk03_IoR baseIoR) {
			
			ioR.no_chk_flg(false);
			ioR.data_crud_typ(baseHdrR.data_crud_typ());
			if (!MAC_DATA_CRUD_TYP.isCRT(ioR.data_crud_typ()) && !isNull(purcActDR)) {
				ioR.purc_act_io_no(purcActDR.getStringNE("purc_act_io_no"));
				ioR.purc_act_io_seq(purcActDR.getNumberNE("purc_act_io_seq"));
				ioR.purc_act_d_no(purcActDR.purc_act_d_no());
				ioR.purc_act_d_seq(purcActDR.purc_act_d_seq());
			}
			ioR.arr_act_no(null);
			ioR.purc_ret_act_io_no(null);
			ioR.trd_unit_cd(rcptIvDR.trd_unit_cd());
			ioR.trd_unit_qty(rcptIvDR.trd_unit_qty());
			ioR.base_unit_cd(rcptIvDR.base_unit_cd());
			ioR.base_unit_qty(rcptIvDR.base_unit_qty());
			ioR.pack_unit_cd(rcptIvDR.base_unit_cd());
			ioR.pack_unit_qty(rcptIvDR.base_unit_qty());
			ioR.purc_cont_qty(null);
			ioR.ver_no(null);
			ioR.gd_cd(getDefaultFeedStkGd().gd_cd());
			ioR.from_gd_cd(null);
			ioR.gi_wg_cd(null);
			ioR.gi_loc_cd(null);
			ioR.gi_str_ln_cd(null);
			ioR.gi_unit_cd(null);
			ioR.dlv_loc_wg_cd(baseIoR.dlv_loc_wg_cd());
			ioR.dlv_loc_cd(baseIoR.dlv_loc_cd());
			ioR.str_ln_cd(baseIoR.str_ln_cd());
			ioR.crt_lot_flg(false);
			ioR.lot_no(null);
			ioR.sublot_no(null);
			ioR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			ioR.stk_insp_typ( MSC_STK_INSP_TYP.FIN.value());
			ioR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			ioR.stk_bp_cd(null);
			ioR.bp_lot_no(null);
			ioR.bp_dlv_slip_no(baseIoR.bp_dlv_slip_no());
			ioR.bp_dlv_slip_d_no(null);
			ioR.sub_char1(null);
			ioR.sub_char2(null);
			ioR.sub_char3(null);
			ioR.ship_fr_valid_dt(null);
		}
		protected void resetPurcTaxCd(MCList<Purc_Chk03_DtlR> dtlL) {
			// 税指定オフの明細を対象に税ＣＤを再取得する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "02"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Purc_Chk03_DtlR.$tax_cd,
					dtlL.subList(r -> !r.getBooleanNE(MST_RCPT_IV_D_R.$tax_fix_flg)),
					Purc_Chk03_DtlR.$itm_cd, Purc_Chk03_DtlR.$itm_sub1,
					Purc_Chk03_DtlR.$itm_sub2, Purc_Chk03_DtlR.$itm_sub3,
					Purc_Chk03_HdrR.$sppl_cd, Purc_Chk03_HdrR.$purc_dt);
		}
		protected void setDpt(MCList<Purc_Chk03_HdrR> hdrL, MCList<Purc_Chk03_DtlR> dtlL) {
			MAUCL_DptUtil.setDpt(hdrL, Purc_Chk03_HdrR.$purc_dpt_cd, null, Purc_Chk03_HdrR.$ac_dt, true);
			MAUCL_DptUtil.setDpt(dtlL, Purc_Chk03_DtlR.$ap_dpt_cd, null, Purc_Chk03_HdrR.$ac_dt, true);
			MAUCL_DptUtil.setDpt(dtlL, Purc_Chk03_DtlR.$bd_dpt_cd, null, Purc_Chk03_HdrR.$ac_dt, true);
		}
		protected void delWk(MCList<?> wk, MCDBContainer t, MCQueryApiBuilder wk_bldr) {
			if (wk.size() > 0) {
				dbWkDelete(createSqlId(LOGIC_ID, wk_bldr.getBaseDbc().getPkWorkDbc(), "D50"), wk_bldr.getBaseDbc());
			}
		}
		protected MCList<MST_ARR_SCHD_R> crtWkArrSchd(MCList<Purc_Chk03_DtlR> up1) {
			MCList<MST_ARR_SCHD_R> asL = MCList.create(MST_ARR_SCHD_R.class);
			up1.forEach(r -> {
				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R ar = MST_ARR_SCHD_R.create();
					ar.arr_schd_no(r.arr_schd_no());
					asL.add(ar);
				}
			});
			dbWkInsert("MSBDL5180_MSW_ARR_SCHD_I02", asL, MST_ARR_SCHD_R.create("T"));
			return asL;
		}
		protected MCList<MST_PO_D_R> crtWkPod(MCList<Purc_Chk03_DtlR> up1) {
			MCList<MST_PO_D_R> asL = MCList.create(MST_PO_D_R.class);
			up1.forEach(r -> {
				if (!isNull(r.po_d_no())) {
					MST_PO_D_R ar = MST_PO_D_R.create();
					ar.po_d_no(r.po_d_no());
					asL.add(ar);
				}
			});
			dbWkInsert("MSBDL5180_MSW_PO_D_I02", asL, MST_PO_D_R.create("T"));
			return asL;
		}
		/**
		 * キャッシュ取得の為の保管を行います
		 */
		protected void cmplForCache() {
			// ヘッダ
			for (Purc_Chk03_HdrR hdrRow : up0()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrRow.data_crud_typ())) {
					MST_PURC_ACT_R paCc = getPurcActCache().get(hdrRow.purc_act_no(), hdrRow.purc_act_seq());
					if (!isNull(paCc)) {
						// 発注NO
						if (isNull(hdrRow.po_no())) {
							hdrRow.po_no(paCc.po_no());
						}
						// 発注先
						if (isNull(hdrRow.sppl_cd())) {
							hdrRow.sppl_cd(paCc.sppl_cd());
						}
						// 通貨
						if (isNull(hdrRow.trd_cur_cd())) {
							hdrRow.trd_cur_cd(hdrRow.trd_cur_cd());
						}						
					}
				}
			}
			
			// 明細
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())) {
					MST_PURC_ACT_D_R padCc = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
					if (!isNull(padCc)) {
						// 発注明細NO
						if (isNull(dtlRow.po_d_no())) {
							dtlRow.po_d_no(padCc.po_d_no());
						}
						// 仕入予定NO
						if (isNull(dtlRow.purc_schd_no())) {
							dtlRow.purc_schd_no(padCc.purc_schd_no());
						}
						// 品目
						if (isNull(dtlRow.itm_cd())) {
							dtlRow.itm_cd(padCc.itm_cd());
							dtlRow.itm_sub1(padCc.itm_sub1());
							dtlRow.itm_sub2(padCc.itm_sub2());
							dtlRow.itm_sub3(padCc.itm_sub3());
						}
						// 製造指図NO
						if (isNull(dtlRow.mfg_inst_no())) {
							dtlRow.mfg_inst_no(padCc.mfg_inst_no());
						}
					}

				}
			}
			
			// 詳細
			for (Purc_Chk03_IoR ioRow : up2()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {
					MST_PURC_ACT_IO_R paiCc = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
					if (!isNull(paiCc)) {
						// 入荷実績NO
						if (isNull(ioRow.arr_act_no())) {
							ioRow.arr_act_no(paiCc.arr_act_no());
						}
						// 納入場所
						if (isNullOrNullStr(ioRow.dlv_loc_cd())) {
							ioRow.dlv_loc_cd(paiCc.in_to_loc_cd());
						}
						
						
					}
					
				}
			}
			
		}
		
		protected void editUp() {
			for (Purc_Chk03_HdrR hdrR : up0()) {
				if (!isNull(hdrR.pay_basis_dt()) && hdrR.pay_basis_dt().lt(hdrR.ac_dt())) {
					hdrR.pay_basis_dt(hdrR.ac_dt());
				}
				if (!isNull(hdrR.pay_schd_dt()) && hdrR.pay_schd_dt().lt(hdrR.ac_dt())) {
					hdrR.pay_schd_dt(hdrR.ac_dt());
				}
			}
			for (Purc_Chk03_DtlR dtlR : up1()) {
				if (up3().purc_ddlv_reg_exec_flg()) {
					// 仕入直送の場合は入荷実績を必ず同時計上する
					dtlR.sync_flg(true);
				}
			}
		}

		/**
		 * キャッシュからチェック上り電文を補完します
		 */
		protected void cmplUpParamByCache() {
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())) {
					// 仕入予定キャッシュから電文の入荷予定NOを補完
					MST_PURC_SCHD_R psCc = getPurcSchdCache().get(dtlRow.purc_schd_no());
					if (!isNull(psCc)) {
						if (isNull(dtlRow.arr_schd_no())) {
							dtlRow.arr_schd_no(psCc.arr_schd_no());
						}
					}
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					// 経費購買FLGを理由マスタから補完
					MAM_BIZ_RSN_R rsnM = getCachePurcRsn().get(dtlRow.rsn_cd());
					dtlRow.xpns_po_flg(rsnM.xpns_purc_flg());
				}
				
				// 税率を税マスタから補完
				MAM_TAX_R taxRow = getTaxCache().get(dtlRow.tax_cd());
				dtlRow.tax_rate(taxRow.tax_rate());
			}

		}
				
		/**
		 * 明細行と詳細行の値の整合性チェック
		 * @param dtlL 明細行リスト
		 * @param ioL 詳細号リスト
		 * @return メッセージリスト
		 */
		protected void checkValueBetweenDtlAndIo() {
			MCMessageList msgL = new MCMessageList();
			
			// チェック対象カラム
			String dtlCols[] = {Purc_Chk03_DtlR.$dlv_loc_cd, Purc_Chk03_DtlR.$str_ln_cd, Purc_Chk03_DtlR.$lot_no, 
					Purc_Chk03_DtlR.$sublot_no, Purc_Chk03_DtlR.$ver_no, Purc_Chk03_DtlR.$gd_cd,	Purc_Chk03_DtlR.$bp_lot_no, Purc_Chk03_DtlR.$bp_dlv_slip_no, 
					Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$ship_fr_valid_dt};
			
			Map<String, String> dtlIoColsMap = new HashMap<String, String>() {{
				put(Purc_Chk03_DtlR.$dlv_loc_cd, Purc_Chk03_IoR.$dlv_loc_cd);
				put(Purc_Chk03_DtlR.$str_ln_cd, Purc_Chk03_IoR.$str_ln_cd);
				put(Purc_Chk03_DtlR.$lot_no, Purc_Chk03_IoR.$lot_no);
				put(Purc_Chk03_DtlR.$sublot_no, Purc_Chk03_IoR.$sublot_no);
				put(Purc_Chk03_DtlR.$ver_no, Purc_Chk03_IoR.$ver_no);
				put(Purc_Chk03_DtlR.$gd_cd, Purc_Chk03_IoR.$gd_cd);
				put(Purc_Chk03_DtlR.$bp_lot_no, Purc_Chk03_IoR.$bp_lot_no);
				put(Purc_Chk03_DtlR.$bp_dlv_slip_no, Purc_Chk03_IoR.$bp_dlv_slip_no);
				put(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Purc_Chk03_IoR.$bp_dlv_slip_d_no);
				put(Purc_Chk03_DtlR.$ship_fr_valid_dt, Purc_Chk03_IoR.$ship_fr_valid_dt);
			}};
			
			MCIndexKey iok = up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					continue;
				}
				MCList<Purc_Chk03_IoR> tgtIoL = up2().subList(iok, dtlRow.peg_no());
				for (Purc_Chk03_IoR tgtIoR : tgtIoL) {
					if (MAC_DATA_CRUD_TYP.isDEL(tgtIoR.data_crud_typ())) {
						continue;
					}
					for (String tgtDtlCol : dtlCols) {
						// 明細行に値が設定されており、詳細行の値が一致しない場合にエラーにする
						Comparable<?> dtlValue = dtlRow.getValue(tgtDtlCol);
						String tgtIoCol = dtlIoColsMap.get(tgtDtlCol);
						if (dtlValue instanceof String) {
							if (isNullOrNullStr(dtlValue)) {
								continue;
							}
							if (!isSame(dtlValue, tgtIoR.getString(tgtIoCol))) {
								tgtIoR.err_flg(true);
								String colNm = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(tgtIoR, tgtIoCol);
								msgL.add(new MCMessage(tgtIoR, tgtIoCol, MSBDL0019, colNm, toDispGUIIndex(tgtIoR)));
							}
						}
						else if (dtlValue instanceof MCDate) {
							if (isNull(dtlValue)) {
								continue;
							}
							if (!isSame(dtlValue, tgtIoR.getDate(tgtIoCol))) {
								tgtIoR.err_flg(true);
								String colNm = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(tgtIoR, tgtIoCol);
								msgL.add(new MCMessage(tgtIoR, tgtIoCol, MSBDL0019, colNm, toDispGUIIndex(tgtIoR)));
							}
						}
						
					}
					
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 電文の補完
		 */
		protected void cmplParams() {
			
			// 明細電文の補完
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				
				MST_PURC_ACT_D_R padCc = null;
				MST_PURC_SCHD_R psCc = null;
				
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					padCc = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
					if (!isNull(dtlRow.purc_schd_no())) {
						psCc = getPurcSchdCache().get(padCc.purc_schd_no());
					}
				}
				
				// 削除用電文の補完
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					dtlRow.base_unit_qty(padCc.base_unit_qty());
					if (!isNull(psCc)) {
						dtlRow.abort_flg(psCc.abort_flg());
						dtlRow.arr_schd_no(psCc.arr_schd_no());
					}
				}
				// 更新用電文の補完
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					if (!isNull(psCc)) {
						dtlRow.arr_schd_no(psCc.arr_schd_no());
					}
					// 明細訂正しているか否かを実績から補完する(後続の金額再計算を行うか否かの判定に使用)
					if (!up3().purc_dtl_flg()) {
						dtlRow.purc_dtl_upd_flg(padCc.purc_dtl_upd_flg());
					}
				}

			}
			// 受払電文の補完
			for (Purc_Chk03_IoR ioRow : up2()) {
				
				MST_PURC_ACT_IO_R paiCc = null;
				
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
					paiCc = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
				}
				
				// 削除用電文の補完
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					ioRow.base_unit_qty(paiCc.base_unit_qty());
					ioRow.arr_act_no(paiCc.arr_act_no());
				}
				// 更新用電文の補完
				else if (MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
					ioRow.arr_act_no(paiCc.arr_act_no());
				}

			}
		}
		
		
		/**
		 * 仕入予定サービスのチェック処理を実行
		 */
		protected void callPurcSchdCheckService() {
			
			// 仕入予定NOが設定せれている明細上り電文
			MCList<Purc_Chk03_DtlR> tgtList = MCList.create(Purc_Chk03_DtlR.class);
			
			// 仕入予定NOで明細上り電文を集計したリスト
			MCList<Purc_Chk03_DtlR> tgtListGrpBySchdNo = MCList.create(Purc_Chk03_DtlR.class);
			
			for (Purc_Chk03_DtlR row : up1()) {
				if (!isNull(row.purc_schd_no())) {
					tgtList.add(row);
				}
			}
			
			if (tgtList.size() == 0) {
				return;
			}
			
			// 削除の場合、キャッシュから数量を補完する
			for (Purc_Chk03_IoR ioRow : up2()) {
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					MST_PURC_ACT_IO_R actIo = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
					ioRow.base_unit_qty(actIo.base_unit_qty());
				}
			}
			
			// 明細更新用電文毎に検収不良数量(基準単位)を求める
			for (Purc_Chk03_DtlR row : tgtList) {
				if (row.accpt_dfct_flg()) {
					row.base_unit_accpt_dfct_qty(row.base_unit_qty());
				}
				else {
					row.base_unit_accpt_dfct_qty(MCNumber.ZERO);
				}
			}
			
			// 仕入予定NO単位に集計
			MCGroupByPolicy grpPurcSchdNo = new MCGroupByPolicy(Purc_Chk03_DtlR.$purc_schd_no, Purc_Chk03_DtlR.$abort_flg);
			grpPurcSchdNo.sum(Purc_Chk03_DtlR.$base_unit_qty);
			grpPurcSchdNo.sum(Purc_Chk03_DtlR.$base_unit_accpt_dfct_qty);
			
			tgtListGrpBySchdNo = tgtList.groupBy(grpPurcSchdNo);
			
			setPegNo(tgtListGrpBySchdNo);
			
			// 仕入予定サービス・チェック処理を実行
			MSBDL_PurcSchdRegService.PurcSchd_Chk01 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Chk01();
			
			for (Purc_Chk03_DtlR row : tgtListGrpBySchdNo) {
				PurcSchd_DtlR upR = PurcSchd_DtlR.create();
				upR.peg_no(row.peg_no());
				upR.purc_schd_no(row.purc_schd_no());
				upR.abort_flg(row.abort_flg());
				upR.base_unit_purc_qty(row.base_unit_qty());
				upR.base_unit_accpt_dfct_qty(row.base_unit_accpt_dfct_qty());
				ope.up0().add(upR);
			}
			ope.exec();
			
			// 実行結果(err_flg)を明細の上り電文に反映する
			MCIndexKey up1Key = up1().createIndex(Purc_Chk03_DtlR.$purc_schd_no);
			for (PurcSchd_DtlR downR : ope.down0()) {
				if (downR.err_flg()) {
					MCList<Purc_Chk03_DtlR> up1List = up1().subList(up1Key, downR.purc_schd_no());
					up1List.setBoolean(Purc_Chk03_DtlR.$err_flg, true);
				}
			}
			
			
		}
		
		/**
		 * 入荷実績サービスのチェック処理を実行
		 */
		protected void callArrActCheckService() {

			// 入荷実績サービスのチェック処理対象の詳細行電文
			MCList<Purc_Chk03_IoR> ioUpParamL = MCList.create(Purc_Chk03_IoR.class);
			
			// 入荷同時計上対象の明細行
			MCList<Purc_Chk03_DtlR> dtlUpParamL = MCList.create(Purc_Chk03_DtlR.class);
			
			for (Purc_Chk03_DtlR row : up1()) {
				if (isArrActTgt(row, up3())) {
					row.sync_flg(true);
					row.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
					dtlUpParamL.add(row);
				}
			}
			
			for (Purc_Chk03_DtlR row : dtlUpParamL) {
				ioUpParamL.addAll(up2().subList(Purc_Chk03_IoR.$dtl_peg_no, row.peg_no()));
			}
			
			if (ioUpParamL.size() == 0) {
				return;
			}
			
			MSBEL_ArrActService.ArrAct_Chk01 ope = MSBEL_ArrActService.crtArrAct_Chk01();
			
			MCIndexKey up0Key = up0().createIndex(Purc_Chk03_IoR.$peg_no);
			MCIndexKey up1Key = up1().createIndex(Purc_Chk03_DtlR.$peg_no);
			Map_ArrAct_DtlR_Purc_Chk03_HdrR<ArrAct_DtlR, Purc_Chk03_HdrR> rmh = createMap_ArrAct_DtlR_Purc_Chk03_HdrR();
			Map_ArrAct_DtlR_Purc_Chk03_DtlR<ArrAct_DtlR, Purc_Chk03_DtlR> rmd = createMap_ArrAct_DtlR_Purc_Chk03_DtlR();
			Map_ArrAct_DtlR_Purc_Chk03_IoR<ArrAct_DtlR, Purc_Chk03_IoR, Purc_Chk03_DtlR> rmi = createMap_ArrAct_DtlR_Purc_Chk03_IoR();
			for (Purc_Chk03_IoR ioR : ioUpParamL) {
				ArrAct_DtlR arrDtlR = ArrAct_DtlR.create();
				
				// 明細行取得
				Purc_Chk03_DtlR dtlR = up1().getFirst(up1Key, ioR.dtl_peg_no());
				
				// ヘッダ取得
				Purc_Chk03_HdrR hdrR = up0().getFirst(up0Key, dtlR.hdr_peg_no());
				
				// ヘッダ・明細・詳細の電文内容を、入荷実績サービス用の電文にコピーする
				rmh.copyValue(arrDtlR, hdrR);
				rmd.copyValue(arrDtlR, dtlR);
				copy(arrDtlR, ioR, dtlR, rmi);
				
				ope.up0().add(arrDtlR);
				
			}

			// 入荷実績チェックサービス実行
			ope.exec();
			
			copyErrFlg(up2(), ope.down0());
			
		}
		
		protected void callArrActCheck4PurcDtl() {
			
			MCList<Purc_Chk03_IoR> ioUpParamL = MCList.create(Purc_Chk03_IoR.class);
			MCList<Purc_Chk03_DtlR> dtlUpParamL = MCList.create(Purc_Chk03_DtlR.class);
			
			for (Purc_Chk03_DtlR row : up1()) {
				if (isArrActTgt4PurcDtl(row, up3())) {
					dtlUpParamL.add(row);
					ioUpParamL.addAll(up2().subList(Purc_Chk03_IoR.$dtl_peg_no, row.peg_no()));
				}
			}
			if (ioUpParamL.size() == 0) {
				return;
			}
			
			MSBEL_ArrActService.ArrAct_Chk03 ope = MSBEL_ArrActService.crtArrAct_Chk03();
			
			for (Purc_Chk03_IoR ioR : ioUpParamL) {
				ArrAct_DtlR arrDtlR = ope.up0().add();
				arrDtlR.peg_no(ioR.peg_no());
				arrDtlR.purc_act_io_no(ioR.purc_act_io_no());
				arrDtlR.setAttributes(ioR);
			}
			
			ope.exec();
			
			copyErrFlg(ioUpParamL, ope.down0());
		}
		
		/**
		 * 入荷予定サービスのチェック処理を実行
		 */
		protected void callArrSchdCheckService() {
			
			// 入荷予定サービスのチェック処理対象リスト
			MCList<Purc_Chk03_DtlR> tgtList = MCList.create(Purc_Chk03_DtlR.class);
			
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ()) && dtlRow.re_arr_flg()) {
					tgtList.add(dtlRow);
				}
				else {
					// 仕入実績明細を取得
					MST_PURC_ACT_D_R padRow = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
					if (MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
						// 更新前、または更新後のどちらかで再入荷ＦＬＧがオンの場合、チェック対象となる
						if (padRow.re_arr_flg() || dtlRow.re_arr_flg()) {
							tgtList.add(dtlRow);
						}
					}
					else {
						// 削除対象の仕入実績明細が再入荷FLGオンならチェック対象
						if (padRow.re_arr_flg()) {
							tgtList.add(dtlRow);
						}
					}
				}
			}
			
			if (tgtList.size() == 0) {
				return;
			}
			
			// 入荷予定サービス・チェック処理実行
			MSBEL_ArrSchdService.ArrSchd_Chk01 ope = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			
			MCIndexKey mcIdx = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
			
			for (Purc_Chk03_DtlR row : tgtList) {
				
				Purc_Chk03_HdrR hdrR = up0().getFirst(mcIdx, row.hdr_peg_no());
				
				ArrSchd_DtlR upR = ArrSchd_DtlR.create();
				upR.setAttributes(row);
				MCList<MST_ARR_SCHD_R> reArrL = getReArrSchdCache(row.purc_act_d_no());
				if (!isNull(reArrL)) {
					// 更新、削除でここの処理に入るときは、再入荷予定は必ず1件であるため、get(0)する
					upR.arr_schd_no(reArrL.get(0).arr_schd_no());
				}
				upR.mfg_inst_no(row.mfg_inst_no());
				upR.re_arr_schd_flg(true);
				upR.outsrc_flg(!isNull(row.mfg_inst_no()));
				upR.purc_act_d_no(row.purc_act_d_no());
				upR.base_unit_qty(row.base_unit_re_arr_qty());
				upR.trd_ptn_typ(hdrR.trd_ptn_typ());
				upR.peg_no(row.peg_no());
				if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
					if (isNull(reArrL)) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else if (!row.re_arr_flg()) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				else {
					upR.data_crud_typ(row.data_crud_typ());
				}
				upR.wg_cd(row.re_arr_loc_wg_cd());
				upR.arr_loc_cd(row.re_arr_loc_cd());
				upR.arr_schd_tm(row.re_arr_rqst_tm());
				upR.accpt_schd_dt(row.re_arr_purc_schd_dt());
				upR.itm_cd(row.itm_cd());
				upR.itm_sub1(row.itm_sub1());
				upR.itm_sub2(row.itm_sub2());
				upR.itm_sub3(row.itm_sub3());
				// 仕入実績サービスのチェック処理から、入荷予定サービスのチェック処理を呼出したサイン
				upR.is_src_purcact_srv_flg(true);
				ope.up0().add(upR);
			}
			
			ope.exec();
			
			copyErrFlg(up1(), ope.down0());
			
		}

		/**
		 * 市場出荷判定・仕入直送売上可能チェック
		 */
		protected void callMrktJudg_Chk03() {
			
			MCIndexKey idxDtl = up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no);
			MCIndexKey idxIo = up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);
			
			MCList<MrktJudg_Chk03_RsltR> paramList = MCList.create(MrktJudg_Chk03_RsltR.class);
			
			for (Purc_Chk03_HdrR hdrRow : up0()) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrRow.data_crud_typ())) {
					continue;
				}
				
				MCList<Purc_Chk03_DtlR> dtlL = up1().subList(idxDtl, hdrRow.peg_no());
				
				for (Purc_Chk03_DtlR dtlRow : dtlL) {
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
						continue;
					}

					if(isNull(dtlRow.po_d_no())){
						continue;
					}
					MST_ARR_PR_R arrPr = getArrPrCache(dtlRow.po_d_no());
					if (arrPr.purc_ddlv_flg()) {
						MCList<Purc_Chk03_IoR> ioL = up2().subList(idxIo, dtlRow.peg_no());
						for (Purc_Chk03_IoR ioRow : ioL) {
							if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
								continue;
							}
							Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR<MrktJudg_Chk03_RsltR, Purc_Chk03_IoR> map = createMap_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR();
							map.setWith(hdrRow);
							map.setWith(dtlRow);
							MrktJudg_Chk03_RsltR paramRow = MrktJudg_Chk03_RsltR.create();
							copy(paramRow, ioRow, map);
							
							paramList.add(paramRow);
							
						}
						
					}
					

				}

			}
			
			if (paramList.size() > 0) {
				MSBFL_MrktJudgService.MrktJudg_Chk03 ope = MSBFL_MrktJudgService.crtMrktJudg_Chk03(); 
				ope.up0().addAll(paramList);
				ope.exec();
				
				copyErrFlg(up2(), ope.down0());
			}

		}
		
		protected MCList<MST_PURC_ACT_D_R> getPurcActDCacheByPurcActNo(MCList<Purc_Chk03_HdrR> hdrL) {
			MCList<MST_PURC_ACT_IO_R> purcActIoL = getPurcActIOCacheByPurcActNo(hdrL);
			insPurcActIoWk(purcActIoL);
			MCList<MST_SLS_ACT_IO_R> slsActIoL = getSlsActIo();
			MCList<MST_PURC_ACT_D_R> purcActDL = cmplSlsActDNo(slsActIoL, purcActIoL);
			return purcActDL;
		}
		protected MCList<MST_PURC_ACT_IO_R> getPurcActIOCacheByPurcActNo(MCList<Purc_Chk03_HdrR> hdrL) {
			MCList<MST_PURC_ACT_IO_R> purcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_R purcAct = MST_PURC_ACT_R.create("PURCACT");
			MST_PURC_ACT_D_R purcActD = MST_PURC_ACT_D_R.create("PURCACTD");
			MST_PURC_ACT_IO_R purcActIo = MST_PURC_ACT_IO_R.create("PURCACTIO");
			MCQueryApiBuilder purcActIoPurcDdlvBldr = MCQueryApiBuilder.create(purcActIo);
			purcActIoPurcDdlvBldr.setSelect(purcActIo.purc_act_io_no, purcActIo.purc_act_io_seq, purcActD.purc_act_no, 
					purcActD.purc_act_seq, purcActD.purc_act_d_no, purcActD.po_d_no);
			purcActIoPurcDdlvBldr.addInnerJoin(purcActD, bracket(purcActIo.purc_act_d_no.eq(purcActD.purc_act_d_no).and(purcActIo.purc_act_d_seq.eq(purcActD.purc_act_d_seq))));
			purcActIoPurcDdlvBldr.addInnerJoin(purcAct, bracket(purcAct.purc_act_no.eq(purcActD.purc_act_no).and(purcAct.purc_act_seq.eq(purcActD.purc_act_seq))));
			purcActIoPurcDdlvBldr.addWhereWithAnd(purcAct.purc_act_no.eq(bind("purc_act_no")));
			purcActIoPurcDdlvBldr.addWhereWithAnd(purcAct.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S09", purcActIoL, purcActIoPurcDdlvBldr, hdrL);
			return purcActIoL;
		}
		protected MCList<MST_PURC_ACT_D_R> getPurcActDByPurcActNo(MCList<MST_PURC_ACT_D_R> purcActDL, MCIndexKey purcActDIndex, String purcActNo, MCNumber purcActSeq) {
			return purcActDL.subList(purcActDIndex, purcActNo, purcActSeq);
		}
		protected void insPurcActIoWk(MCList<MST_PURC_ACT_IO_R> purcActIOL) {
			MST_PURC_ACT_IO_R purcActIo = MST_PURC_ACT_IO_R.create("PURCACTIO");
			MCQueryApiBuilder purcActIoPurcDdlvBldr = MCQueryApiBuilder.create(purcActIo);
			dbWkDelete("MSBDL5180_MSW_PURC_ACT_IO_D01", purcActIoPurcDdlvBldr.getBaseDbc());
			dbWkInsert("MSBDL5180_MSW_PURC_ACT_IO_I01", purcActIOL, purcActIoPurcDdlvBldr.getBaseDbc());
		}
		protected MCList<MST_SLS_ACT_IO_R> getSlsActIo() {
			MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
			MSW_PURC_ACT_IO_KEY_R purcActIoK = MSW_PURC_ACT_IO_KEY_R.create("PURCACTIOKEY");
			MCQueryApiBuilder purcActIoPurcDdlvBldr = MCQueryApiBuilder.create(purcActIoK);
			MST_PURC_ACT_IO_R purcActIo = MST_PURC_ACT_IO_R.create("PURCACTIO");
			MST_SLS_ACT_IO_R slsActIo = MST_SLS_ACT_IO_R.create("SLSACTIO");
			MST_SLS_ACT_D_R slsActD = MST_SLS_ACT_D_R.create("SLSACTD");
			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("SLSACT");
			purcActIoPurcDdlvBldr.setSelect(slsActIo.purc_act_io_no, slsActIo.sls_act_d_no);
			purcActIoPurcDdlvBldr.addInnerJoin(purcActIo, bracket(purcActIo.purc_act_io_no.eq(purcActIoK.purc_act_io_no).and(purcActIo.purc_act_io_seq.eq(purcActIoK.purc_act_io_seq))));
			purcActIoPurcDdlvBldr.addInnerJoin(slsActIo, bracket(slsActIo.purc_act_io_no.eq(purcActIo.purc_act_io_no)));
			purcActIoPurcDdlvBldr.addInnerJoin(slsActD, bracket(slsActIo.sls_act_d_no.eq(slsActD.sls_act_d_no).and(slsActIo.sls_act_d_seq.eq(slsActD.sls_act_d_seq))));
			purcActIoPurcDdlvBldr.addInnerJoin(slsAct, bracket(slsAct.sls_act_no.eq(slsActD.sls_act_no).and(slsAct.sls_act_seq.eq(slsActD.sls_act_seq).and(slsAct.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S10", slsActIoL, purcActIoPurcDdlvBldr);
			return slsActIoL;
		}
		protected MCList<MST_PURC_ACT_D_R>  cmplSlsActDNo(MCList<MST_SLS_ACT_IO_R> slsActIoL, MCList<MST_PURC_ACT_IO_R> purcActIoL) {
			MCIndexKey purcActDIdx = slsActIoL.createIndex(MST_SLS_ACT_IO_R.$purc_act_io_no);
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			purcActDL.addStringColumn("sls_act_d_no");
			
			for (MST_PURC_ACT_IO_R purcActIoR : purcActIoL) {
				MST_SLS_ACT_IO_R slsActIoR = slsActIoL.getFirst(purcActDIdx, purcActIoR.purc_act_io_no());
				MST_PURC_ACT_D_R purcActDR = purcActDL.createRow();
				purcActDR.purc_act_no(purcActIoR.getStringNE("purc_act_no"));
				purcActDR.purc_act_seq(purcActIoR.getNumberNE("purc_act_seq"));
				purcActDR.purc_act_d_no(purcActIoR.purc_act_d_no());
				purcActDR.po_d_no(purcActIoR.getStringNE("po_d_no"));
				if (!isNull(slsActIoR)) {
					purcActDR.setStringNE("sls_act_d_no", slsActIoR.getStringNE("sls_act_d_no"));
				}
				purcActDL.add(purcActDR);
			}
			
			String[] key = new String[]{
					MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq,
					MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$po_d_no, "sls_act_d_no"};
			return purcActDL.groupBy(key);
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Purc_Chk03_IoR, Purc_Chk03_DtlR, Purc_Chk03_HdrR) -> 市場出荷判定情報サービス.上り電文(MrktJudg_Chk03_RsltR)
		 */
		protected Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR<MrktJudg_Chk03_RsltR,Purc_Chk03_IoR> createMap_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR() {
			if (_Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR == null) {
				_Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR = new Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR<MrktJudg_Chk03_RsltR, Purc_Chk03_IoR>();
			}
			_Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR.setWith((Purc_Chk03_HdrR)null);
			_Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR.setWith((Purc_Chk03_DtlR)null);
			return _Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR;
		}
		protected Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR<MrktJudg_Chk03_RsltR, Purc_Chk03_IoR> _Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR = null;
		public class Map_MrktJudg_Chk03_RsltR_Purc_Chk03_IoR<D extends MrktJudg_Chk03_RsltR, S extends Purc_Chk03_IoR> extends MCRowMapper<D,S>{
			protected Purc_Chk03_HdrR _hdrR = null;
			protected void setWith(Purc_Chk03_HdrR _hdrR) {
				this._hdrR = _hdrR;
			}
			protected Purc_Chk03_DtlR _dtlR = null;
			protected void setWith(Purc_Chk03_DtlR _dtlR) {
				this._dtlR = _dtlR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MrktJudg_Chk03_RsltR.$peg_no, Purc_Chk03_IoR.$peg_no);
				addColumnPathMap(MrktJudg_Chk03_RsltR.$loc_cd, Purc_Chk03_IoR.$dlv_loc_cd);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.base_dt(_hdrR.purc_dt());
				dest.sppl_cd(_hdrR.sppl_cd());
				dest.itm_cd(_dtlR.itm_cd());
				dest.itm_sub1(_dtlR.itm_sub1());
				dest.itm_sub2(_dtlR.itm_sub2());
				dest.itm_sub3(_dtlR.itm_sub3());
				dest.maker_cd(_dtlR.maker_cd());
				// 仕入実績計上と同時にロットを作成しようとした場合は、市場出荷判定サービス・チェックにはロットを連携しない
				if (!src.crt_lot_flg()) {
					dest.lot_no(src.lot_no());
				}
			}
			
		}
		
		/**
		 * 支給実績サービスの更新前チェック
		 */
		protected void callProvActChk01() {

			MCIndexKey idxDtl = up1().createIndex(Purc_Chk03_DtlR.$peg_no);
			MCIndexKey idxHdr = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
	
			MCList<ProvActChk01_DtlR> paramList = MCList.create(ProvActChk01_DtlR.class);
			
			// 支給実績サービスの実行対象リストを作成
			for (Purc_Chk03_IoR ioRow : up2()) {
				
				// 明細を取得
				Purc_Chk03_DtlR dtlRow = up1().getFirst(idxDtl, ioRow.dtl_peg_no());
				// ヘッダ取得
				Purc_Chk03_HdrR hdrRow = up0().getFirst(idxHdr, dtlRow.hdr_peg_no());
				
				// 取引パタンが「仕入返品」または「経費購買返品」の場合、支給実績サービスチェック処理は実行しない
				if (MAC_TRD_PTN_TYP.isPURC_RTN(hdrRow.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hdrRow.trd_ptn_typ())) {
					continue;
				}
				
				// サービス上り電文にセット
				ProvActChk01_DtlR paramRow = ProvActChk01_DtlR.create();
				
				// 納入場所の発注先を取得
				MAM_LOC_R loc = getLocCache().get(ioRow.dlv_loc_cd());
				if (isNull(loc.sppl_cd())) {
					// 納入場所に発注先が設定されていない場合は、処理対象外
					continue;
				}
				
				// 発注明細の直納区分を取得
				MST_PO_D_R poD = getPoDCache().get(dtlRow.po_d_no());
				// 直納区分を判定
				String strDrctDlvTyp = poD.drct_dlv_typ();
				if (!isSame(ioRow.dlv_loc_cd(), poD.in_to_loc_cd())) {
					// 発注の納入場所と異なる場合は、直送
					strDrctDlvTyp = MSC_DRCT_DLV_TYP.DDLV.value();
				}
				if (MSC_DRCT_DLV_TYP.isVIA(strDrctDlvTyp)) {
					// 直納区分が経由の場合は、処理対象外
					continue;
				}
				
				// 引数設定
				Map_ProvActChk01_DtlR_Purc_Chk03_IoR<ProvActChk01_DtlR,Purc_Chk03_IoR> map = createMap_ProvActChk01_DtlR_Purc_Chk03_IoR();
				map.setWithHdrR(hdrRow);
				map.setWithDtlR(dtlRow);
				copy(paramRow, ioRow, map);
				
				paramList.add(paramRow);
			}

			if (paramList.size() > 0) {
				
				MSBEL_ProvActService.ProvAct_Chk01 ope = MSBEL_ProvActService.crtProvAct_Chk01();
				ope.up0().addAll(paramList);
				ope.exec();
				copyErrFlg(up2(), ope.down0());
			}
			
		}
		
		/**
		 * 外注製造実績サービス・チェック処理
		 */
		protected void callOutSrcAct_Chk01() {
			
			
			
			MCList<OutSrcAct_Chk01_ActDR> paramList = MCList.create(OutSrcAct_Chk01_ActDR.class);
			MCList<Purc_Chk03_DtlR> outsrcTgt = getOursrcMfgTgtUp1(up3(), up0(), up1(), up2());
			
			outsrcTgt.forEach(dtlRow -> {
				OutSrcAct_Chk01_ActDR paramRow = OutSrcAct_Chk01_ActDR.create();
				copy(paramRow, dtlRow, createMap_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR());
				paramList.add(paramRow);
			});
			
			if (paramList.size() > 0) {
				MSBCL_OutSrcActService.OutSrcAct_Chk01 ope = MSBCL_OutSrcActService.crtOutSrcAct_Chk01();
				ope.up0().addAll(paramList);
				ope.exec();
				
				copyErrFlg(up1(), ope.down0());
			}
			
			
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Purc_Chk03_DtlR) -> 外注製造実績サービス.上り電文(OutSrcAct_Chk01_ActDR)
		 */
		protected Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR<OutSrcAct_Chk01_ActDR,Purc_Chk03_DtlR> createMap_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR() {
			if (_Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR == null) {
				_Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR = new Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR<OutSrcAct_Chk01_ActDR, Purc_Chk03_DtlR>();
			}
			return _Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR;
		}
		protected Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR<OutSrcAct_Chk01_ActDR, Purc_Chk03_DtlR> _Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR = null;
		public class Map_OutSrcAct_Chk01_ActDR_Purc_Chk03_DtlR<D extends OutSrcAct_Chk01_ActDR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcAct_Chk01_ActDR.$peg_no, Purc_Chk03_DtlR.$peg_no);
				addColumnPathMap(OutSrcAct_Chk01_ActDR.$data_crud_typ, Purc_Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(OutSrcAct_Chk01_ActDR.$mfg_inst_no, Purc_Chk03_DtlR.$mfg_inst_no);

			}
			@Override		
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				Purc_Chk03_HdrR hdrRow = up0().getFirst(Purc_Chk03_HdrR.$peg_no, src.hdr_peg_no());
				dest.st_act_dt(hdrRow.purc_dt());
			}
		}
		
		/**
		 * 承認次処理済更新前チェック
		 * @param hdrL
		 */
		protected void callAprvChk02(MCList<Purc_Chk03_HdrR> hdrL) {
			
			// 呼出元が入荷実績サービスの場合、仕入実績サービスでは承認次処理済更新前チェックは行わない
			if (up3().arr_act_srvs_flg()) {
				return;
			}
			
			MCList<Aprv_Chk02_Rslt1R> paramList = MCList.create(Aprv_Chk02_Rslt1R.class);
			
			MCIndexKey idxChkHdr = hdrL.createIndex(Purc_Chk03_HdrR.$data_crud_typ);
			
			MCList<Purc_Chk03_HdrR> tgtList = hdrL.subList(idxChkHdr, MAC_DATA_CRUD_TYP.CRT.value());
			
			for (Purc_Chk03_HdrR row : tgtList) {
				if (isNull(row.po_no())) {
					continue;
				}
				// 発注ヘッダキャッシュより、承認対象FLG・承認NOを取得
				MST_PO_R poR = getPoCache().get(row.po_no());
				row.aprv_flg(poR.aprv_flg());
				row.aprv_no(poR.aprv_no());
				
				if (poR.aprv_flg()) {
					Aprv_Chk02_Rslt1R paramRow = Aprv_Chk02_Rslt1R.create();
					copy(paramRow, row, createMap_For_MBBAL5010_Aprv_Chk02_up0());
					paramList.add(paramRow);
				}
				
			}
			
			if (paramList.size() > 0) {
				MBBAL_AprvService.Aprv_Chk02 ope = MBBAL_AprvService.crtAprv_Chk02();
				ope.up0().addAll(paramList);
				ope.exec();
				
				copyErrFlg(hdrL, ope.down0());
			}
			
		}

		/**
		 * 承認次処理済解除前チェック
		 * @param hdrL
		 */
		protected void callAprvChk03(MCList<Purc_Chk03_HdrR> hdrL) {
			MCList<Aprv_Chk02_Rslt1R> paramList = MCList.create(Aprv_Chk02_Rslt1R.class);
			
			MCIndexKey idxChkHdr = hdrL.createIndex(Purc_Chk03_HdrR.$data_crud_typ);
			
			MCList<Purc_Chk03_HdrR> tgtList = hdrL.subList(idxChkHdr, MAC_DATA_CRUD_TYP.DEL.value());
			
			for (Purc_Chk03_HdrR row : tgtList) {
				if (isNull(row.po_no())) {
					continue;
				}
				// 発注ヘッダキャッシュより、承認対象FLG・承認NOを取得
				MST_PO_R poR = getPoCache().get(row.po_no());
				row.aprv_flg(poR.aprv_flg());
				row.aprv_no(poR.aprv_no());
				
				if (poR.aprv_flg()) {
					Aprv_Chk02_Rslt1R paramRow = Aprv_Chk02_Rslt1R.create();
					copy(paramRow, row, createMap_For_MBBAL5010_Aprv_Chk02_up0());
					paramList.add(paramRow);
				}
				
			}
			
			if (paramList.size() > 0) {
				MBBAL_AprvService.Aprv_Chk03 ope = MBBAL_AprvService.crtAprv_Chk03();
				ope.up0().addAll(paramList);
				ope.exec();
				
				copyErrFlg(hdrL, ope.down0());
			}

		}
		
		/**
		 * チェックの上り電文から、仕入実績サービス(Upd02)実行用の電文キャッシュを作成する</p>
		 * ただし、エラーFLGがONの電文は対象から除外される
		 */
		protected void setParamCache() {
			
			MCList<Purc_Ins01_HdrR> hdrForCacheL = MCList.create(Purc_Ins01_HdrR.class);
			MCList<Purc_Ins01_DtlR> dtlForCacheL = MCList.create(Purc_Ins01_DtlR.class);
			MCList<Purc_Ins01_IoR> ioForCacheL = MCList.create(Purc_Ins01_IoR.class);
			
			MCIndexKey dtlHdrPegNoKey = up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no);
			MCIndexKey ioDtlPegNoKey =  up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);
			
			// エラーFLGがOFFのヘッダのみ抽出
			MCList<Purc_Chk03_HdrR> noErrHdrList = up0().subList(Purc_Chk03_HdrR.$err_flg, false);
			
			// エラーなしのヘッダに対応する明細・詳細にエラーがないかチェックする。
			// 明細または詳細にエラーがある場合は、電文キャッシュには含めない。
			
			for (Purc_Chk03_HdrR hdrRow : noErrHdrList) {
				
				// ヘッダに紐付く明細、または詳細の電文内に一つでもエラーの行があればtrueとなる
				boolean errFlg = false;
				
				// 紐付く明細を取得
				MCList<Purc_Chk03_DtlR> addDtlList = up1().subList(dtlHdrPegNoKey, hdrRow.peg_no());
				
				MCList<Purc_Chk03_IoR> addIoList = MCList.create(Purc_Chk03_IoR.class);
				
				for (Purc_Chk03_DtlR dtlRow : addDtlList) {

					if (errFlg) {
						break;
					}
					
					if (dtlRow.err_flg()) {
						errFlg = true;
					}
					else {
						// 明細に紐付く詳細を取得
						MCList<Purc_Chk03_IoR> ioListForDtlRow = up2().subList(ioDtlPegNoKey, dtlRow.peg_no());
						
						for (Purc_Chk03_IoR ioRow : ioListForDtlRow) {
							
							if (errFlg) {
								break;
							}
							if (ioRow.err_flg()) {
								errFlg = true;
							}
							MST_PURC_ACT_IO_R actR = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
							ioRow.sub_char1(actR.sub_char1());
							ioRow.sub_char2(actR.sub_char2());
							ioRow.sub_char3(actR.sub_char3());
						}
						
						addIoList.addAll(ioListForDtlRow);
						
					}
					
				}
				
				// 明細・詳細のいずれの電文にもエラーがない場合に、電文をヘッダ単位でキャッシュする
				if (!errFlg) {

					Purc_Ins01_HdrR hdrParamRow = Purc_Ins01_HdrR.create();
					copy(hdrParamRow, hdrRow, createMap_For_HdrCache());

					MCList<Purc_Ins01_DtlR> dtlParamList = MCList.create(Purc_Ins01_DtlR.class);
					setAll(dtlParamList, addDtlList, createMap_For_DtlCache());

					MCList<Purc_Ins01_IoR> ioParamList = MCList.create(Purc_Ins01_IoR.class);
					setAll(ioParamList, addIoList, createMap_For_IoCache());
					
					hdrForCacheL.add(hdrParamRow);
					dtlForCacheL.addAll(dtlParamList);
					ioForCacheL.addAll(ioParamList);
				}
				
			}
			
			// 電文キャッシュを作成
			if (hdrForCacheL.size() > 0) {
				initHdrCache(hdrForCacheL);
				initDtlCache(dtlForCacheL);
				initIoCache(ioForCacheL);
			}
			
		}
		
		/**
		 * 承認提供サービス・承認次処理済更新前チェック、承認次処理済解除前チェック連携用のマッピング定義</p>
		 * 仕入実績サービスの「Purc_Chk03_Hdr」ブロック　⇒　承認提供サービスの「Aprv_Chk02_Rslt1」ブロック
		 * @return
		 */
		protected Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0<Aprv_Chk02_Rslt1R,Purc_Chk03_HdrR> createMap_For_MBBAL5010_Aprv_Chk02_up0() {
			if (_Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0 == null) {
				_Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0 = new Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0<Aprv_Chk02_Rslt1R, Purc_Chk03_HdrR>();
			}
			return _Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0;
		}
		protected Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0<Aprv_Chk02_Rslt1R, Purc_Chk03_HdrR> _Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0 = null;
		public class Map_fr_MSBDL5180_chk03_up0_to_MBBAL5010_Aprv_Chk02_up0<D extends Aprv_Chk02_Rslt1R, S extends Purc_Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Aprv_Chk02_Rslt1R.$peg_no, Purc_Chk03_HdrR.$peg_no);
				addColumnPathMap(Aprv_Chk02_Rslt1R.$aprv_no, Purc_Chk03_HdrR.$aprv_no);
			}
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Purc_Chk03_IoR) -> 支給実績サービス.上り電文(ProvActChk01_DtlR)
		 */
		protected Map_ProvActChk01_DtlR_Purc_Chk03_IoR<ProvActChk01_DtlR,Purc_Chk03_IoR> createMap_ProvActChk01_DtlR_Purc_Chk03_IoR() {
			if (_Map_ProvActChk01_DtlR_Purc_Chk03_IoR == null) {
				_Map_ProvActChk01_DtlR_Purc_Chk03_IoR = new Map_ProvActChk01_DtlR_Purc_Chk03_IoR<ProvActChk01_DtlR, Purc_Chk03_IoR>();
			}
			_Map_ProvActChk01_DtlR_Purc_Chk03_IoR.setWithHdrR(null);
			_Map_ProvActChk01_DtlR_Purc_Chk03_IoR.setWithDtlR(null);
			return _Map_ProvActChk01_DtlR_Purc_Chk03_IoR;
		}
		protected Map_ProvActChk01_DtlR_Purc_Chk03_IoR<ProvActChk01_DtlR, Purc_Chk03_IoR> _Map_ProvActChk01_DtlR_Purc_Chk03_IoR = null;
		public class Map_ProvActChk01_DtlR_Purc_Chk03_IoR<D extends ProvActChk01_DtlR, S extends Purc_Chk03_IoR> extends MCRowMapper<D,S>{

			protected Purc_Chk03_HdrR _hdrR;
			protected Purc_Chk03_DtlR _dtlR;

			public void setWithHdrR(Purc_Chk03_HdrR _hdrR) {
				this._hdrR = _hdrR;
			}
			public void setWithDtlR(Purc_Chk03_DtlR _dtlR) {
				this._dtlR = _dtlR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$peg_no, Purc_Chk03_IoR.$peg_no);
				addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, Purc_Chk03_IoR.$data_crud_typ);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// 取引パタン区分
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
				dest.arr_act_no(src.arr_act_no());
				
				// 支給元実績NO
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.prov_src_act_no(src.purc_act_io_no());
				}

				// 支給元実績区分(チェック時は入荷実績NO不要)
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(_dtlR.arr_ptn_typ())) {
					dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value());
				}
				else {
					dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.DDLV.value());
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					
					// 支給元予定区分・支給元予定NO2
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
					dest.prov_src_schd_no2(_dtlR.arr_schd_no());
					
					// 在庫識別区分
					if (_dtlR.accpt_dfct_flg()) {
						dest.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());
					}
					else {
						dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
					
					// 支給元実績区分
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(_dtlR.arr_ptn_typ())) {
						dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value());
					}
					else {
						dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.DDLV.value());
					}
					
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.accpt_dt(_hdrR.purc_dt());
					dest.ac_dt(_hdrR.ac_dt());
					dest.itm_cd(_dtlR.itm_cd());
					dest.itm_sub1(_dtlR.itm_sub1());
					dest.itm_sub2(_dtlR.itm_sub2());
					dest.itm_sub3(_dtlR.itm_sub3());
					dest.wg_cd(src.dlv_loc_wg_cd());
					MAM_BP_R prsppl = getPrspplCache(src.dlv_loc_cd());
					dest.prsppl_cd(prsppl.bp_cd());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.can_ac_dt(_hdrR.can_ac_dt());
				}
			}
		}

		
		/**
		 * ヘッダチェック上り電文を、仕入実績サービス実行用の電文キャッシュに格納するためのマッピング定義
		 * @return
		 */
		protected Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<Purc_Ins01_HdrR,Purc_Chk03_HdrR> createMap_For_HdrCache() {
			if (_Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR == null) {
				_Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR = new Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<Purc_Ins01_HdrR, Purc_Chk03_HdrR>();
			}
			return _Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR;
		}
		protected Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<Purc_Ins01_HdrR, Purc_Chk03_HdrR> _Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR = null;
		public class Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<D extends Purc_Ins01_HdrR, S extends Purc_Chk03_HdrR> extends MCRowMapper<D,S>{
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Purc_Chk03_HdrR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$peg_no, Purc_Chk03_HdrR.$peg_no);
				addColumnPathMap(Purc_Ins01_HdrR.$pa, Purc_Chk03_HdrR.$pa);
				addColumnPathMap(Purc_Ins01_HdrR.$aprv_flg, Purc_Chk03_HdrR.$aprv_flg);
				addColumnPathMap(Purc_Ins01_HdrR.$aprv_no, Purc_Chk03_HdrR.$aprv_no);
				addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Purc_Chk03_HdrR.$can_ac_dt);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MAM_BP_R spplCache = getSpplCache().get(src.sppl_cd());
				if (!isNull(spplCache)) {
					dest.purc_tax_calc_typ(spplCache.purc_tax_calc_typ());
					dest.purc_amt_rnd_typ(spplCache.purc_amt_rnd_typ());
					dest.purc_tax_rnd_typ(spplCache.purc_tax_rnd_typ());
				}
			}
			
		}
		
		/**
		 * 明細チェック上り電文を、仕入実績サービス実行用の電文キャッシュに格納するためのマッピング定義
		 * @return
		 */
		protected Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<Purc_Ins01_DtlR,Purc_Chk03_DtlR> createMap_For_DtlCache() {
			if (_Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR == null) {
				_Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR = new Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<Purc_Ins01_DtlR, Purc_Chk03_DtlR>();
			}
			return _Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR;
		}
		protected Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<Purc_Ins01_DtlR, Purc_Chk03_DtlR> _Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR = null;
		public class Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<D extends Purc_Ins01_DtlR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			
			@Override
			protected void setupColumnPathMap() {
				// データ更新区分、pegNO
				addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Purc_Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$peg_no, Purc_Chk03_DtlR.$peg_no);
				addColumnPathMap(Purc_Ins01_DtlR.$hdr_peg_no, Purc_Chk03_DtlR.$hdr_peg_no);

				// 業務関連のNO
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, Purc_Chk03_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, Purc_Chk03_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, Purc_Chk03_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$po_d_no, Purc_Chk03_DtlR.$po_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$rcpt_iv_d_no, Purc_Chk03_DtlR.$rcpt_iv_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_ret_act_d_no, Purc_Chk03_DtlR.$purc_ret_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_schd_no, Purc_Chk03_DtlR.$purc_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_schd_no, Purc_Chk03_DtlR.$arr_schd_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, Purc_Chk03_DtlR.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, Purc_Chk03_DtlR.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, Purc_Chk03_DtlR.$purc_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, Purc_Chk03_DtlR.$mfg_inst_no);

				// 品目
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, Purc_Chk03_DtlR.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, Purc_Chk03_DtlR.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, Purc_Chk03_DtlR.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, Purc_Chk03_DtlR.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, Purc_Chk03_DtlR.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$ver_no, Purc_Chk03_DtlR.$ver_no);
				addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, Purc_Chk03_DtlR.$iv_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, Purc_Chk03_DtlR.$rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, Purc_Chk03_DtlR.$sundry_itm_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, Purc_Chk03_DtlR.$sppl_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, Purc_Chk03_DtlR.$sppl_itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, Purc_Chk03_DtlR.$stk_mng_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$asset_mng_typ, Purc_Chk03_DtlR.$asset_mng_typ);

				// 単位・数量など
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, Purc_Chk03_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, Purc_Chk03_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, Purc_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, Purc_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_cont_qty, Purc_Chk03_DtlR.$purc_cont_qty);
				
				// 単価・金額など
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, Purc_Chk03_DtlR.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, Purc_Chk03_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, Purc_Chk03_DtlR.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, Purc_Chk03_DtlR.$trd_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, Purc_Chk03_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, Purc_Chk03_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, Purc_Chk03_DtlR.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, Purc_Chk03_DtlR.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, Purc_Chk03_DtlR.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, Purc_Chk03_DtlR.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, Purc_Chk03_DtlR.$base_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, Purc_Chk03_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, Purc_Chk03_DtlR.$base_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, Purc_Chk03_DtlR.$base_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, Purc_Chk03_DtlR.$base_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, Purc_Chk03_DtlR.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, Purc_Chk03_DtlR.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, Purc_Chk03_DtlR.$ptax_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, Purc_Chk03_DtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, Purc_Chk03_DtlR.$ptax_cur_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, Purc_Chk03_DtlR.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, Purc_Chk03_DtlR.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, Purc_Chk03_DtlR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, Purc_Chk03_DtlR.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, Purc_Chk03_DtlR.$base_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, Purc_Chk03_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, Purc_Chk03_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, Purc_Chk03_DtlR.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, Purc_Chk03_DtlR.$wtax_rate);
				addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, Purc_Chk03_DtlR.$wtax_amt);

				// 場所・ロット・在庫
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, Purc_Chk03_DtlR.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, Purc_Chk03_DtlR.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, Purc_Chk03_DtlR.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, Purc_Chk03_DtlR.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, Purc_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
				
				// 再入荷関連
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_flg, Purc_Chk03_DtlR.$re_arr_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_sync_flg, Purc_Chk03_DtlR.$re_arr_sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_cd, Purc_Chk03_DtlR.$re_arr_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_loc_wg_cd, Purc_Chk03_DtlR.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_str_ln_cd, Purc_Chk03_DtlR.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_rqst_tm, Purc_Chk03_DtlR.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Ins01_DtlR.$re_arr_purc_schd_dt, Purc_Chk03_DtlR.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_re_arr_qty, Purc_Chk03_DtlR.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_re_arr_qty, Purc_Chk03_DtlR.$base_unit_re_arr_qty);
				
				// 参考情報NO
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_no, Purc_Chk03_DtlR.$ref_purc_act_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_seq, Purc_Chk03_DtlR.$ref_purc_act_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_no, Purc_Chk03_DtlR.$ref_purc_act_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_seq, Purc_Chk03_DtlR.$ref_purc_act_d_seq);
				
				// 負担項目
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, Purc_Chk03_DtlR.$bd_itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, Purc_Chk03_DtlR.$bd_itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, Purc_Chk03_DtlR.$bd_itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, Purc_Chk03_DtlR.$bd_itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, Purc_Chk03_DtlR.$bd_sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, Purc_Chk03_DtlR.$bd_sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, Purc_Chk03_DtlR.$bd_sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, Purc_Chk03_DtlR.$bd_sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, Purc_Chk03_DtlR.$bd_loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, Purc_Chk03_DtlR.$bd_lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, Purc_Chk03_DtlR.$bd_sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, Purc_Chk03_DtlR.$bd_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, Purc_Chk03_DtlR.$bd_ctg_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, Purc_Chk03_DtlR.$bd_oper_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, Purc_Chk03_DtlR.$bd_slo_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, Purc_Chk03_DtlR.$bd_iv_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, Purc_Chk03_DtlR.$bd_po_no);
				addColumnPathMap(Purc_Ins01_DtlR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);

				// 備考・予備
				addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, Purc_Chk03_DtlR.$intr_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, Purc_Chk03_DtlR.$trd_d_rmrks);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, Purc_Chk03_DtlR.$sub_char1);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, Purc_Chk03_DtlR.$sub_char2);
				addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, Purc_Chk03_DtlR.$sub_char3);
				
				// その他
				addColumnPathMap(Purc_Ins01_DtlR.$purc_dtl_upd_flg, Purc_Chk03_DtlR.$purc_dtl_upd_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, Purc_Chk03_DtlR.$abort_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, Purc_Chk03_DtlR.$xpns_po_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, Purc_Chk03_DtlR.$purc_id_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_ptn_typ, Purc_Chk03_DtlR.$arr_ptn_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$sync_flg, Purc_Chk03_DtlR.$sync_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, Purc_Chk03_DtlR.$disp_seq);
				addColumnPathMap(Purc_Ins01_DtlR.$ncv_flg, Purc_Chk03_DtlR.$ncv_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$edi_flg, Purc_Chk03_DtlR.$edi_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, Purc_Chk03_DtlR.$maker_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, Purc_Chk03_DtlR.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, Purc_Chk03_DtlR.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$accpt_dfct_flg, Purc_Chk03_DtlR.$accpt_dfct_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$base_purc_ac_dt, Purc_Chk03_DtlR.$base_purc_ac_dt);
				addColumnPathMap(Purc_Ins01_DtlR.$arr_sync_flg, Purc_Chk03_DtlR.$arr_sync_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// 場所・場所ＷＧ
				if (!isNull(src.pad().in_to_loc_cd())) {
					dest.in_to_loc_cd(src.pad().in_to_loc_cd());
					dest.in_to_loc_wg_cd(src.pad().in_to_loc_wg_cd());
				}
				else {
					dest.in_to_loc_cd(src.dlv_loc_cd());
					dest.in_to_loc_wg_cd(src.dlv_loc_wg_cd());
				}
				
			}
			
		}
		
		/**
		 * 詳細チェック上り電文を、仕入実績サービス実行用の電文キャッシュに格納するためのマッピング定義
		 * @return
		 */
		protected Map_Purc_Ins01_IoR_Purc_Chk03_IoR<Purc_Ins01_IoR,Purc_Chk03_IoR> createMap_For_IoCache() {
			if (_Map_Purc_Ins01_IoR_Purc_Chk03_IoR == null) {
				_Map_Purc_Ins01_IoR_Purc_Chk03_IoR = new Map_Purc_Ins01_IoR_Purc_Chk03_IoR<Purc_Ins01_IoR, Purc_Chk03_IoR>();
			}
			return _Map_Purc_Ins01_IoR_Purc_Chk03_IoR;
		}
		protected Map_Purc_Ins01_IoR_Purc_Chk03_IoR<Purc_Ins01_IoR, Purc_Chk03_IoR> _Map_Purc_Ins01_IoR_Purc_Chk03_IoR = null;
		public class Map_Purc_Ins01_IoR_Purc_Chk03_IoR<D extends Purc_Ins01_IoR, S extends Purc_Chk03_IoR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$peg_no, Purc_Chk03_IoR.$peg_no);
				addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, Purc_Chk03_IoR.$dtl_peg_no);
				addColumnPathMap(Purc_Ins01_IoR.$src_peg_no, Purc_Chk03_IoR.$src_peg_no);
				addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Purc_Chk03_IoR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, Purc_Chk03_IoR.$purc_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, Purc_Chk03_IoR.$purc_act_io_seq);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, Purc_Chk03_IoR.$purc_act_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, Purc_Chk03_IoR.$purc_act_d_seq);
				addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, Purc_Chk03_IoR.$arr_act_no);
				addColumnPathMap(Purc_Ins01_IoR.$purc_ret_act_io_no, Purc_Chk03_IoR.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Purc_Chk03_IoR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$ver_no, Purc_Chk03_IoR.$ver_no);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, Purc_Chk03_IoR.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Purc_Chk03_IoR.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Purc_Chk03_IoR.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Purc_Chk03_IoR.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Purc_Chk03_IoR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, Purc_Chk03_IoR.$stk_id_typ);
				addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, Purc_Chk03_IoR.$bp_lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, Purc_Chk03_IoR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, Purc_Chk03_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Ins01_IoR.$ship_fr_valid_dt, Purc_Chk03_IoR.$ship_fr_valid_dt);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Purc_Chk03_IoR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Purc_Chk03_IoR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Purc_Chk03_IoR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Purc_Chk03_IoR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Purc_Chk03_IoR.$pack_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, Purc_Chk03_IoR.$pack_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Chk03_IoR.$purc_cont_qty);
				addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, Purc_Chk03_IoR.$gi_wg_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, Purc_Chk03_IoR.$gi_loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, Purc_Chk03_IoR.$gi_str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, Purc_Chk03_IoR.$gi_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Purc_Chk03_IoR.$from_gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$crt_lot_flg, Purc_Chk03_IoR.$crt_lot_flg);
				addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Purc_Chk03_IoR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char1, Purc_Chk03_IoR.$sub_char1);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char2, Purc_Chk03_IoR.$sub_char2);
				addColumnPathMap(Purc_Ins01_IoR.$sub_char3, Purc_Chk03_IoR.$sub_char3);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNull(src.pai().in_to_loc_cd())) {
					dest.in_to_loc_cd(src.pai().in_to_loc_cd());
					dest.in_to_loc_wg_cd(src.pai().in_to_loc_wg_cd());
				}
				else {
					dest.in_to_loc_cd(src.dlv_loc_cd());
					dest.in_to_loc_wg_cd(src.dlv_loc_wg_cd());
				}
			}
			
		}
		
		/**
		 * ヘッダチェック上り電文のチェック処理
		 */
		protected void chkHdr() {
			MCMessageList msgL = new MCMessageList();
			
			// 仕入明細訂正時はチェックしない
			if (up3().purc_dtl_flg()) {
				return;
			}
			
			MCIndexKey dtlKey = up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no);
			MCList<MST_PURC_ACT_D_R> purcActDL = getPurcActDCacheByPurcActNo(up0());
			MCIndexKey purcActDIndex = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
			
			for (Purc_Chk03_HdrR hdrRow : up0()) {

				if (MAC_DATA_CRUD_TYP.isCRT(hdrRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(hdrRow.data_crud_typ())) {
					// 取引先・禁止チェック
					if (MAC_TRD_PTN_TYP.isPURC(hdrRow.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(hdrRow.trd_ptn_typ())) {
						MAM_BP_STOP_R bpStopRow = getBpStpCache().get(hdrRow.sppl_cd());
						
						if(!isNull(bpStopRow.bp_cd())) {
							if(hdrRow.purc_dt().gte(bpStopRow.purc_stop_dt())){
								hdrRow.err_flg(true);
								MCList<Purc_Chk03_DtlR> dtlL = up1().subList(dtlKey, hdrRow.peg_no());
								for(Purc_Chk03_DtlR dtlRow :dtlL){
									dtlRow.err_flg(true);
									msgL.add(new MCMessage(hdrRow, Purc_Chk03_HdrR.$sppl_cd, MSBDL0028, 
											hdrRow.sppl_cd(), toDispGUIIndex(dtlRow)));
								}
							}
						}
					}
				}

				msgL.addAll(chkPurcDdlv(hdrRow, dtlKey, getPurcActDByPurcActNo(purcActDL, purcActDIndex, hdrRow.purc_act_no(), hdrRow.purc_act_seq())));
			}
			
			MCMessagePool.addAll(msgL);
			
		}
		
		protected MCMessageList chkPurcDdlv(Purc_Chk03_HdrR hdrRow, MCIndexKey dtlKey, MCList<MST_PURC_ACT_D_R> purcActDByPurcActNoL) {
			
			MCMessageList msgL = new MCMessageList();
			MCList<Purc_Chk03_DtlR> dtlL = up1().subList(dtlKey, hdrRow.peg_no());
			
			msgL.addAll(chkPurcDdlvSlsRegRowCopy(purcActDByPurcActNoL, hdrRow, dtlL));
			msgL.addAll(chkPurcDdlvUnlinkedPurcDExists(purcActDByPurcActNoL, hdrRow, dtlL));
			
			return msgL;
		}
		
		protected MCMessageList chkPurcDdlvSlsRegRowCopy(MCList<MST_PURC_ACT_D_R> purcActDByPurcActNoL, Purc_Chk03_HdrR hdrRow, MCList<Purc_Chk03_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			if (!MAC_DATA_CRUD_TYP.isUPD(hdrRow.data_crud_typ())) {
				return msgL;
			}
			
			if (!isPurcDdlvSlsReg(purcActDByPurcActNoL)) {
				return msgL;
			}
			
			for (Purc_Chk03_DtlR dtlR : dtlL) {
				if (isPurcDdlvSlsRegRowCopy(dtlR)) {
					msgL.addAll(handlePurcDdlvSlsRegRowCopy(hdrRow, dtlR));
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList handlePurcDdlvSlsRegRowCopy(Purc_Chk03_HdrR hdrRow, Purc_Chk03_DtlR dtlR) {
			MCMessageList msgL = new MCMessageList();
			
			hdrRow.err_flg(true);
			msgL.add(new MCMessage(hdrRow, Purc_Chk03_HdrR.$purc_act_no, MSBDL0614, hdrRow.purc_act_no(), toDispGUIIndex(dtlR)));
			
			return msgL;
		}
		
		protected MCMessageList chkPurcDdlvUnlinkedPurcDExists(MCList<MST_PURC_ACT_D_R> purcActDByPurcActNoL, Purc_Chk03_HdrR hdrRow, MCList<Purc_Chk03_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_DATA_CRUD_TYP.isCRT(hdrRow.data_crud_typ())) {
				return msgL;
			}
			
			if (!up3().purc_ddlv_reg_exec_flg()) {
				return msgL;
			}
			
			MCIndexKey dtlPurcActNoIndex = dtlL.createIndex(Purc_Chk03_DtlR.$purc_act_no, Purc_Chk03_DtlR.$purc_act_d_no);
			for (MST_PURC_ACT_D_R purcActDR : purcActDByPurcActNoL) {
				
				if (!isSlsPurcSimultaneous(dtlL, purcActDR, dtlPurcActNoIndex)) {
					return handlePurcDdlvUnlinkedPurcDExistsErr(dtlL, dtlPurcActNoIndex, purcActDR, hdrRow, purcActDByPurcActNoL);
				}
			}
			
			return msgL;
		}
		protected MCMessageList handlePurcDdlvUnlinkedPurcDExistsErr(MCList<Purc_Chk03_DtlR> dtlL, MCIndexKey dtlPurcActNoIndex,
				MST_PURC_ACT_D_R purcActDR, Purc_Chk03_HdrR hdrRow, MCList<MST_PURC_ACT_D_R> purcActDByPurcActNoL) {
			
			MCMessageList msgL = new MCMessageList();
			
			Purc_Chk03_DtlR dtlR = dtlL.getFirst(dtlPurcActNoIndex, purcActDR.purc_act_no());
			String slsActDNo = getSlsActDNo(purcActDByPurcActNoL);
			hdrRow.err_flg(true);
			msgL.add(new MCMessage(dtlR, Purc_Chk03_DtlR.$purc_act_no, MSBDL0615, slsActDNo, dtlR.purc_act_no(), toDispGUIIndex(dtlR)));
			
			return msgL;
		}
		protected boolean isSlsPurcSimultaneous(MCList<Purc_Chk03_DtlR> dtlL, MST_PURC_ACT_D_R purcActDR, MCIndexKey purcDIndex) {
			return isNull(dtlL.getFirst(purcDIndex, purcActDR.purc_act_no(), purcActDR.purc_act_d_no())) ? false : true;
		}
		protected String getSlsActDNo(MCList<MST_PURC_ACT_D_R> purcActDByPurcActNoL) {
			return purcActDByPurcActNoL.stream().map(r -> r.getStringNE("sls_act_d_no")).filter(s -> !isNull(s)).findFirst().orElse(null);
		}
		protected boolean isPurcDdlvSlsRegRowCopy(Purc_Chk03_DtlR dtlR) {
			return MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && !isNull(dtlR.po_d_no());
		}
		protected boolean isPurcDdlvSlsReg(MCList<MST_PURC_ACT_D_R> purcActDL) {
			for (MST_PURC_ACT_D_R purcActDR : purcActDL) {
				String poDNo = purcActDR.po_d_no();
				if (!isNull(purcActDR.getStringNE("sls_act_d_no")) && !isNull(poDNo)) {
					MST_ARR_PR_R arrPr = getArrPrCache(poDNo);
					if (arrPr.purc_ddlv_flg()) {
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * 明細チェック上り電文のチェック処理
		 */
		protected void chkDtl() {
			
			MCMessageList msgL = new MCMessageList();
			
			// 更新・削除電文用
			MCIndexKey idxUp1ForUpd = up1().createIndex(Purc_Chk03_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_seq);
			
			// 仕入明細訂正の場合、チェックしない
			if (up3().purc_dtl_flg()) {
				for (Purc_Chk03_DtlR dtlRow : up1()) {
					msgL.addAll(chkItmJnl(dtlRow));
				}
				MCMessagePool.addAll(msgL);
				return;
			}
			
			// 未着で打切りでない明細を仕入予定NOでまとめ、予定数>実績数となっていないかチェック
			MCList<Purc_Chk03_DtlR> crtOrUpdList =  up1().createInstance();
			MCList<Purc_Chk03_DtlR> delList = up1().createInstance();
			up1().forEach(r -> {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					crtOrUpdList.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delList.add(r);
				}
			});
			MCIndexKey idxCrtOrUpdByPurcSchd = null;
			MCIndexKey idxDelByPurcSchd = null;
			
			MCList<Purc_Chk03_DtlR>[] dtlGrpL = crtOrUpdList.subList(r -> 
					MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && !r.abort_flg()
				).groupList(Purc_Chk03_DtlR.$purc_schd_no);

			for (MCList<Purc_Chk03_DtlR> dtlList : dtlGrpL) {
				MST_PURC_SCHD_R purcSchd = getPurcSchdCache().get(dtlList.get(0).purc_schd_no());
				MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(purcSchd.arr_schd_no());

				if (arrSchd.arr_skip_flg()) {
					continue;
				}
				MCList<Purc_Chk03_DtlR> hdrPegNoGrp = dtlList.groupBy(Purc_Chk03_DtlR.$hdr_peg_no);
				MCIndexKey idxHdrByPegNo = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
				Purc_Chk03_HdrR hdrRow = up0().getFirst(idxHdrByPegNo, dtlList.get(0).hdr_peg_no());
				MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
				MCList<Purc_Chk03_DtlR> taxCdGrp = dtlList.groupBy(Purc_Chk03_DtlR.$tax_rate);
				if (hdrPegNoGrp.size() > 1 ||
						(MAC_TAX_CALC_TYP.isSLIP(sppl.purc_tax_calc_typ()) && taxCdGrp.size() > 1)) {
					// ヘッダ分割または、伝票単位で税率が混在する場合、エラー
					for (Purc_Chk03_DtlR dtlLisR : dtlList) {
						dtlLisR.err_flg(true);
						msgL.add(new MCMessage(dtlLisR, Purc_Chk03_DtlR.$purc_schd_no,
								MSBDL0309, dtlLisR.purc_schd_no(), toDispGUIIndex(dtlLisR)));
					}
					continue;
				}
				MCNumber baseUnitQty = dtlList.sum(Purc_Chk03_DtlR.$base_unit_qty);
				if (baseUnitQty.lt(purcSchd.base_unit_schd_qty())) {
					// 仕入予定数よりも、明細の数量合計が少ない場合、エラー
					Purc_Chk03_DtlR firstDtlRow = dtlList.get(0);
					firstDtlRow.err_flg(true);
					msgL.add(new MCMessage(firstDtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0040, toDispGUIIndex(firstDtlRow)));
				}
			}

			// 明細全行に対するチェック
			MCIndexKey idxDtlByPurcSchdNo = up1().createIndex(Purc_Chk03_DtlR.$purc_schd_no);
			MCList<Purc_Chk03_DtlR> purcSchdNoGrp = up1().groupBy(Purc_Chk03_DtlR.$purc_schd_no);
			
			MCIndexKey idxHdrByPegNo = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
			MCIndexKey idxIoByDtlPegNo = null;
			for (Purc_Chk03_DtlR prcSchdNo : purcSchdNoGrp) {
				if (isNull(prcSchdNo)) {
					continue;
				}
				// 同じ仕入予定NOを持つ明細電文リスト
				MCList<Purc_Chk03_DtlR> sameSchdNoList = up1().subList(idxDtlByPurcSchdNo, prcSchdNo.purc_schd_no());
				// 削除の行を除く
				sameSchdNoList = sameSchdNoList.subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				
				if (sameSchdNoList.size() < 2) {
					// 2件以上存在しないのならば、チェックはしない
					continue;
				}

				Purc_Chk03_DtlR preDtlRow = null;
				for (Purc_Chk03_DtlR curDtlRow : sameSchdNoList) {
					if (!isNull(preDtlRow)) {
						if (!isSame(curDtlRow.abort_flg(), preDtlRow.abort_flg())) {
							for (Purc_Chk03_DtlR errR : sameSchdNoList) {
								errR.err_flg(true);
								msgL.add(new MCMessage(errR, Purc_Chk03_DtlR.$abort_flg, MSBDL0049, errR.purc_schd_no()));
							}
							break;
						}
					}
					preDtlRow = curDtlRow;
				}

			}

			// 品目詳細マスタの存在チェック
			msgL.addAll(checkExistItmDtlMst());
			
			// 受領インボイス単位で揃っているかチェック済みか
			Set<String> checkedRcptIv = new HashSet<>();
			
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				// ヘッダを取得
				Purc_Chk03_HdrR hdrRow = up0().getFirst(idxHdrByPegNo, dtlRow.hdr_peg_no());

				// 新規
				if(MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())) {
					
					// 発注あり時のチェック処理
					if (!isNull(dtlRow.po_d_no())) {
						MST_ARR_PR_R arrPrRow = getArrPrCache(dtlRow.po_d_no());
						
						// 発注明細打切チェック
						if(arrPrRow.abort_flg() && !isRemAbort(dtlRow, arrPrRow)) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$po_d_no, MSBDL0046, dtlRow.po_d_no(), toDispGUIIndex(dtlRow)));
						}
						// 打切時の実績数チェック
						if (dtlRow.abort_flg()) {
							MCNumber actBaseUnitQty = MCNumber.valueOf(0);
							
							// 登録済の仕入実績明細を仕入予定NOで取得
							MCList<MST_PURC_ACT_D_R> purcActDL = getPurcActDCacheByPurcSchdNo(dtlRow.purc_schd_no());
							// 更新対象以外の登録済の仕入実績明細の実績総数を取得する
							for (MST_PURC_ACT_D_R padRow : purcActDL) {
								// 上り電文にない仕入実績明細の総数を取得する
								Purc_Chk03_DtlR tgtDtlRow = up1().getFirst(idxUp1ForUpd, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
								if (isNull(tgtDtlRow)) {
									actBaseUnitQty = actBaseUnitQty.add(padRow.base_unit_qty());
								}
							}
							MST_PURC_SCHD_R purcSchdRow = getPurcSchdCache().get(dtlRow.purc_schd_no());
							// 同じ仕入予定NOを持つ、削除行以外を取得する
							// 明細上り電文に設定した数量(基準単位)の合計
							MCNumber actQty = MCNumber.ZERO;
							for (Purc_Chk03_DtlR r : up1().subList(idxDtlByPurcSchdNo, dtlRow.purc_schd_no())) {
								if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
									actQty = actQty.add(r.base_unit_qty());
								}
							}
							// 明細上り電文の数量合計 + 更新対象でない仕入実績明細の数量合計 >= 仕入予定数 のチェック
							if ((actQty.add(actBaseUnitQty)).gte(purcSchdRow.base_unit_schd_qty())) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0187, purcSchdRow.base_unit_schd_qty(), actQty.add(actBaseUnitQty),
										toDispGUIIndex(dtlRow)));
							}
							
						}
						
						// インボイス取引対象チェック
						MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
						// 受領インボイス登録画面から呼ばれた、または
						// 入荷実績サービスから呼ばれ画面の同時計上ＦＬＧがオフの場合はチェック対象外
						if (sppl.sppl_iv_flg()
								&& ((!up3().rcpt_iv_form_flg() && !up3().arr_act_srvs_flg())
									|| (up3().arr_act_srvs_flg() && dtlRow.arr_sync_flg()))) {
							
							MST_PURC_SCHD_R purcSchd = getPurcSchdCache().get(dtlRow.purc_schd_no());
							if (isNull(purcSchd.getStringNE("rcpt_iv_mng_no"))) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$purc_schd_no, MSBDL0174, hdrRow.sppl_cd(), dtlRow.purc_schd_no()));
							}
						}
						
					}
					else {
						// 計画外時のチェック処理

						// 下請対象取引先チェック
						if (hdrRow.subcon_flg()) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$purc_schd_no, MSBDL0052, hdrRow.sppl_cd()));
						}
					}
					
				}
				// 新規 or 更新
				if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					
					// 明細に紐付く詳細リスト
					if (idxIoByDtlPegNo == null) {
						idxIoByDtlPegNo = up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);
					}
					MCList<Purc_Chk03_IoR> ioList = up2().subList(idxIoByDtlPegNo, dtlRow.peg_no());

					// 明細・詳細の数量整合性チェック
					MCNumber ioSumQty = MCNumber.ZERO;
					for (Purc_Chk03_IoR ioRow : ioList) {
						if (!MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
							ioSumQty = ioSumQty.add(ioRow.base_unit_qty());
						}
					}
					if (!isSame(dtlRow.base_unit_qty(), ioSumQty)) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0135, dtlRow.base_unit_qty(), ioSumQty, toDispGUIIndex(dtlRow)));
					}
					
					// 入荷後仕入の場合の、入荷数＜仕入数のチェック
					msgL.addAll(checkPurcQtyOverArrQty(dtlRow));
					
					// 同じ受領インボイスで登録されている仕入予定に対しての電文が揃っているかチェック
					if (up3().purc_ddlv_reg_exec_flg()) {
						MCList<MST_PURC_SCHD_R> havIvPurcSchdL = getHavIvPurcSchdCache(dtlRow.purc_schd_no());
						if (!isNull(havIvPurcSchdL) && !checkedRcptIv.contains(hdrRow.rcpt_iv_mng_no())) {
							checkedRcptIv.add(hdrRow.rcpt_iv_mng_no());	// 受領インボイスチェック済み
							
							for (MST_PURC_SCHD_R purcSchdRow : havIvPurcSchdL) {
								if (idxCrtOrUpdByPurcSchd == null) {
									idxCrtOrUpdByPurcSchd = crtOrUpdList.createIndex(Purc_Chk03_DtlR.$purc_schd_no);
								}
								// 新規or更新用の明細チェック上り電文に受領インボイス登録の仕入予定が含まれているか
								MCList<Purc_Chk03_DtlR> dtlParamList = crtOrUpdList.subList(Purc_Chk03_DtlR.$purc_schd_no, purcSchdRow.purc_schd_no());
								if (isNull(dtlParamList)) {
									dtlRow.err_flg(true);
									msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$purc_schd_no, MSBDL0030, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
									break;
								}
								else {
									MCNumber subBaseUnitQty = dtlParamList.sum(Purc_Chk03_DtlR.$base_unit_qty);
									if (!isSame(subBaseUnitQty, purcSchdRow.base_unit_schd_qty())) {
										dtlRow.err_flg(true);
										msgL.add(new MCMessage(dtlRow, null, MSBDL0205
												, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)
												, purcSchdRow.purc_schd_no()
												, purcSchdRow.base_unit_schd_qty()
												, subBaseUnitQty));
										break;
									}
								}
							}
						}
					}
					
					// 数量０打切チェック
					if (dtlRow.abort_flg() && dtlRow.trd_unit_qty().eq(0)) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0047, toDispGUIIndex(dtlRow)));
					}
					
					// 入荷前仕入で打切りしようとしていないか
					if (dtlRow.abort_flg()) {
						MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(dtlRow.arr_schd_no());
						if (MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ()) && !arrSchd.arr_skip_flg()) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$abort_flg, 
									MSBDL0032, dtlRow.purc_schd_no(), toDispGUIIndex(dtlRow)));
						}
					}

					
					// 入荷後仕入での打切り可否チェック
					msgL.add(chkAbortAfterArr(dtlRow));
					
					// 仕入・経費購買時のみチェックする
					if (MAC_TRD_PTN_TYP.isPURC(hdrRow.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_XPNS(hdrRow.trd_ptn_typ())) {
						// 品目・禁止チェック
						MAM_ITM_STOP_R itmStopRow = getItmStopCache().get(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
						if (!isNull(itmStopRow.itm_cd())) {
							if (hdrRow.purc_dt().gte(itmStopRow.purc_stop_dt())) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$itm_cd, MSBDL0029, 
									toDispItm(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3()) ,toDispGUIIndex(dtlRow)));
							}
						}
					}
					// 品目仕訳チェック
					msgL.addAll(chkItmJnl(dtlRow));
					
					// 再入荷数量チェック
					if (dtlRow.re_arr_flg()) {
						if (dtlRow.trd_unit_re_arr_qty().gt(dtlRow.trd_unit_qty())) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_re_arr_qty, MSBDL0057, 
							dtlRow.trd_unit_re_arr_qty(), dtlRow.trd_unit_qty(), toDispGUIIndex(dtlRow)));
						}
					}
					
					MST_PO_D_R poDCc = getPoDCache().get(dtlRow.po_d_no());
					// 仕入計上区分チェック
					if (!isNull(poDCc.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(poDCc.purc_basis_typ())) {
						// 暫定買掛の場合は同時計上がオンになるため画面の同時計上でチェック
						boolean syncFlg = up3().arr_act_srvs_flg() && MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())
										? dtlRow.arr_sync_flg() : dtlRow.sync_flg();
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(poDCc.purc_basis_typ()) && !syncFlg) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0411, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (MAC_PURC_BASIS_TYP.isIN_BASIS(poDCc.purc_basis_typ()) && syncFlg) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0412, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (dtlRow.re_arr_flg() && MAC_PURC_BASIS_TYP.isARR_BASIS(poDCc.purc_basis_typ())
								&& (isNullOr(dtlRow.re_arr_rqst_tm(), dtlRow.re_arr_purc_schd_dt())
										|| !dtlRow.re_arr_rqst_tm().eqDate(dtlRow.re_arr_purc_schd_dt()))) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0413, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (dtlRow.re_arr_flg() && MAC_PURC_BASIS_TYP.isARR_BASIS(poDCc.purc_basis_typ()) && !dtlRow.re_arr_sync_flg()) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0414, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (dtlRow.re_arr_flg() && MAC_PURC_BASIS_TYP.isIN_BASIS(poDCc.purc_basis_typ()) && dtlRow.re_arr_sync_flg()) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0415, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
					}
				}
				
				// 更新
				if (MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					
					// 再入荷予定取得
					MCList<MST_ARR_SCHD_R> reArrSchdL = getReArrSchdCache(dtlRow.purc_act_d_no()); 
					
					// 再入荷予定が仕入実績明細から作成されている場合のチェック
					if (!isNull(reArrSchdL)) {

						// 再入荷予定を作成している仕入実績明細を取得
						MST_PURC_ACT_D_R purcD = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
						
						msgL.addAll(chkReArrUpdatable(purcD, dtlRow, reArrSchdL));
					}
						
					if (!isNull(dtlRow.purc_schd_no())) {
						
						// 打切チェック
						if (dtlRow.abort_flg()) {
							
							// 登録済の仕入実績明細を仕入予定NOで取得
							MCList<MST_PURC_ACT_D_R> padList = getPurcActDCacheByPurcSchdNo(dtlRow.purc_schd_no());
							
							// 同じ仕入予定NOを持つ、削除行以外を取得する
							// 明細上り電文に設定した数量(基準単位)の合計
							MCNumber updBaseUnitQty = MCNumber.ZERO;
							for (Purc_Chk03_DtlR r : up1().subList(idxDtlByPurcSchdNo, dtlRow.purc_schd_no())) {
								if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
									updBaseUnitQty = updBaseUnitQty.add(r.base_unit_qty());
								}
							}
							
							
							// 打切時の実績数チェック
							MCNumber actBaseUnitQty = MCNumber.ZERO;
							
							// 更新対象以外の登録済の仕入実績明細の実績総数を取得する							
							for (MST_PURC_ACT_D_R padRow : padList) {
								
								// 上り電文にない仕入実績明細の総数を取得する
								Purc_Chk03_DtlR tgtDtlRow = up1().getFirst(idxUp1ForUpd, padRow.purc_act_d_no(), padRow.purc_act_d_seq());
								if (isNull(tgtDtlRow)) {
									actBaseUnitQty = actBaseUnitQty.add(padRow.base_unit_qty());
								}
								
							}
							MST_PURC_SCHD_R purcSchdRow = getPurcSchdCache().get(dtlRow.purc_schd_no());
							
							// 明細上り電文の数量合計 + 更新対象でない仕入実績明細の数量合計 >= 仕入予定数 のチェック
							if (updBaseUnitQty.add(actBaseUnitQty).gte(purcSchdRow.base_unit_schd_qty())) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0187, purcSchdRow.base_unit_schd_qty(), updBaseUnitQty.add(actBaseUnitQty),
										toDispGUIIndex(dtlRow)));
							}
							
						}

					}
					
					// 支給直送の仕入で、新規登録時と異なる検収不良FLGに訂正しようとした場合
					msgL.add(chkAccptDfctIsChangedInDDlv(dtlRow));
					
					// 明細の再入荷ＦＬＧがオンだが、検収不良ＦＬＧをオフにしようとした場合
					MST_PURC_ACT_D_R padRow = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
					if (dtlRow.re_arr_flg() && padRow.accpt_dfct_flg() && !dtlRow.accpt_dfct_flg()) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$accpt_dfct_flg, MSBDL0065, toDispGUIIndex(dtlRow)));
					}
					
					if (!isNull(dtlRow.po_d_no())) {
						MST_ARR_PR_R arrPrRow = getArrPrCache(dtlRow.po_d_no());
						
						if(dtlRow.re_arr_flg() && arrPrRow.abort_flg()) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$po_d_no, MSBDL0609, dtlRow.po_d_no(), toDispGUIIndex(dtlRow)));
						}
					}
				}
				
				// 削除
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					
					// 同じ受領インボイスで登録されている仕入予定に対しての電文が揃っているかチェック
					if (up3().purc_ddlv_reg_exec_flg()) {
						MCList<MST_PURC_SCHD_R> havIvPurcSchdL = getHavIvPurcSchdCache(dtlRow.purc_schd_no());
						if (!isNull(havIvPurcSchdL) && !checkedRcptIv.contains(hdrRow.rcpt_iv_mng_no())) {
							checkedRcptIv.add(hdrRow.rcpt_iv_mng_no());	// 受領インボイスチェック済み
							
							for (MST_PURC_SCHD_R purcSchdRow : havIvPurcSchdL) {
								if (idxDelByPurcSchd == null) {
									idxDelByPurcSchd = delList.createIndex(Purc_Chk03_DtlR.$purc_schd_no);
								}
								
								// 削除用の明細チェック上り電文に受領インボイス管理の仕入予定が全て含まれているか
								Purc_Chk03_DtlR dtlParamRow = delList.getFirst(idxDelByPurcSchd, purcSchdRow.purc_schd_no());
								if (isNull(dtlParamRow)) {
									MCList<Purc_Chk03_DtlR> purcActDtlL = crtOrUpdList.subList(Purc_Chk03_DtlR.$purc_schd_no, purcSchdRow.purc_schd_no());
									if (purcActDtlL.isEmpty() || !purcActDtlL.sum(Purc_Chk03_DtlR.$base_unit_qty).eq(purcSchdRow.base_unit_schd_qty())) {
										dtlRow.err_flg(true);
										msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$purc_schd_no, MSBDL0031, purcSchdRow.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no)));
										break;
									}
								}
							}
						}
					}

					// 仕入予定打切チェック
					MST_PURC_SCHD_R purcSchd = getPurcSchdCache().get(dtlRow.purc_schd_no());
					if (purcSchd.abort_flg()) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$abort_flg, MSBDL0051, toDispGUIIndex(dtlRow)));
					}
					
					// 再入荷予定取得
					MCList<MST_ARR_SCHD_R> reArrSchdL = getReArrSchdCache(dtlRow.purc_act_d_no()); 

					// 再入荷予定が仕入実績明細から作成されている場合のチェック
					if (!isNull(reArrSchdL)) {

						// 再入荷予定を作成している仕入実績明細を取得
						MST_PURC_ACT_D_R purcD = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
						
						msgL.addAll(chkReArrUpdatable(purcD, dtlRow, reArrSchdL));
					}
					
					MAM_ITM_R itmR = getItmCache().get(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
					if (itmR.isEmpty()) {
						msgL.add(new MCMessage(dtlRow, null, MAUAL0189
								, toDispItm(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3()), toDispGUIIndex(dtlRow)));
						dtlRow.err_flg(true);
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
			
		}
		
		/**
		 * 仕入数が入荷数を超えていないかチェックします<br>
		 * ただし、以下の場合はチェック処理は行われません<br>
		 * <ul>
		 * <li>入荷パタンが未着管理</li>
		 * <li>入荷実績サービスから実行された</li>
		 * <li>仕入直送売上サービスから実行された</li>
		 * <li>伝票区分が仕入返品、経費購買返品の仕入実績</li>
		 * </ul>
		 * @return　メッセージリスト 
		 */
		protected MCMessageList checkPurcQtyOverArrQty(Purc_Chk03_DtlR dtlRow) {

			MCMessageList msgL = new MCMessageList();

			Purc_Chk03_HdrR hdrRow = up0().getFirst(Purc_Chk03_HdrR.$peg_no, dtlRow.hdr_peg_no());
			if (up3().arr_act_srvs_flg()
					|| up3().purc_ddlv_reg_exec_flg()
					|| MAC_TRD_PTN_TYP.isPURC_RTN(hdrRow.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hdrRow.trd_ptn_typ())
					|| MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
				return msgL;
			}
			
			MCList<Purc_Chk03_IoR> ioL = up2().subList(Purc_Chk03_IoR.$dtl_peg_no, dtlRow.peg_no());
			
			if (!dtlRow.sync_flg() && !isNull(ioL.get(0).arr_act_no())) {
				
				// 入荷実績ＮＯ毎に仕入数>入荷数をチェック
				for (Purc_Chk03_IoR ioRow : ioL.groupBy(Purc_Chk03_IoR.$arr_act_no)) {

					MST_ARR_ACT_R arrActRow = getArrActCache().get(ioRow.arr_act_no());
					
					String[] srchKey = {Purc_Chk03_IoR.$data_crud_typ, Purc_Chk03_IoR.$arr_act_no};
					Comparable<?>[] srchAddVal = {MAC_DATA_CRUD_TYP.CRT.value(), ioRow.arr_act_no()};
					
					// 入荷実績ＮＯに対して、行追加しようとしている仕入実績受払の数量を求める
					MCNumber addPurcQty = MCNumber.ZERO;
					MCList<Purc_Chk03_IoR> crtIoList = up2().subList(srchKey, srchAddVal);
					if (!isNull(crtIoList)) {
						addPurcQty = crtIoList.sum(Purc_Chk03_IoR.$base_unit_qty);
					}
					// 入荷実績ＮＯに対して、行の更新をしようとしている仕入実績受払を取得し、
					// 数量の増分・減分を求める
					MCNumber diffPurcQty = MCNumber.ZERO;
					Comparable<?>[] srchDiffVal = {MAC_DATA_CRUD_TYP.UPD.value(), ioRow.arr_act_no()};
					MCList<Purc_Chk03_IoR> updIoList = up2().subList(srchKey, srchDiffVal);
					if (!isNull(updIoList)) {
						// 差分を求める
						for (Purc_Chk03_IoR updIoRow : updIoList) {
							MST_PURC_ACT_IO_R purcActIoRow = getPurcActIoCache().get(updIoRow.purc_act_io_no(), updIoRow.purc_act_io_seq());
							diffPurcQty = diffPurcQty.add(
									updIoRow.base_unit_qty().subtract(purcActIoRow.base_unit_qty()));
						}
					}
					// 入荷実績ＮＯに対して、行削除しようとしている仕入実績受払の数量を求める
					MCNumber minusPurcQty = MCNumber.ZERO;
					
					// 仕入実績受払NO,SEQを条件に、仕入実績受払を取得する。
					// 仕入実績受払が削除されることによる数量のマイナス分を計算する。
					for (Purc_Chk03_IoR row : up2()) {
						if (MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
							MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(row.purc_act_io_no(), row.purc_act_io_seq());
							minusPurcQty = minusPurcQty.add(paiRow.base_unit_qty());
						}
					}
					
					// 入荷実績に対する仕入実績受払の基準単位数量の合計を取得
					MCNumber purcQtyForArr = MCNumber.ZERO;
					MCList<MST_PURC_ACT_IO_R> paiL = getPaiCcByAaNo(arrActRow.arr_act_no());
					for (MST_PURC_ACT_IO_R paiRow : paiL) {
						purcQtyForArr = purcQtyForArr.add(paiRow.base_unit_qty());
					}
					// 登録済の仕入実績数に画面からの追加分、マイナス分、登録済数量との差分の数量を反映して、
					// 入荷実績の数量と比較し、入荷実績数＜仕入実績数とならないかチェックする。
					MCNumber sumPurcQty = purcQtyForArr.add(addPurcQty.add(diffPurcQty).subtract(minusPurcQty));
					
					// 仕入数が入荷数より多い場合はエラー
					if (sumPurcQty.gt(arrActRow.base_unit_qty())) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, Purc_Chk03_DtlR.$trd_unit_qty, MSBDL0035, 
								ioRow.arr_act_no(), arrActRow.base_unit_qty(), sumPurcQty, toDispGUIIndex(dtlRow)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 品目詳細マスタの存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList checkExistItmDtlMst() {
			MCMessageList msgL = new MCMessageList();
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			
			for (Purc_Chk03_HdrR hdrRow : up0()) {
				// 仕入または経費購買の場合のみ、チェック処理を行う
				if (!MAC_TRD_PTN_TYP.isPURC(hdrRow.trd_ptn_typ()) &&
						!MAC_TRD_PTN_TYP.isPURC_XPNS(hdrRow.trd_ptn_typ())) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrRow.data_crud_typ())) {
					continue;
				}				
				
				MCList<Purc_Chk03_DtlR> dtlL
					= up1().subList(Purc_Chk03_DtlR.$hdr_peg_no, hdrRow.peg_no());
				for (Purc_Chk03_DtlR dtlRow : dtlL) {
					if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
						continue;
					}
					if (isNull(dtlRow.purc_schd_no())) {
						MAM_ITM_DTL_R itmDtl = MAM_ITM_DTL_R.create();
						itmDtl.setAttributes(dtlRow);
						itmDtl.itm_cd(dtlRow.itm_cd());
						itmDtl.itm_sub1(dtlRow.itm_sub1());
						itmDtl.itm_sub2(dtlRow.itm_sub2());
						itmDtl.itm_sub3(dtlRow.itm_sub3());
						itmDtl.sppl_cd(hdrRow.sppl_cd());
						itmDtl.maker_cd(dtlRow.maker_cd());
						
						// 詳細行の納入場所
						Purc_Chk03_IoR ioRow = up2().getFirst(Purc_Chk03_IoR.$dtl_peg_no, dtlRow.peg_no());
						MAM_LOC_R dlvLocRow = getLocCache().get(ioRow.dlv_loc_cd());
						itmDtl.wg_cd(dlvLocRow.wg_cd());
						
						itmDtl.st_dt(hdrRow.purc_dt());
						itmDtlL.add(itmDtl);
					}
				}
			}
			
			msgL.addAll(chkItmDtlPurc(itmDtlL));
			for (Purc_Chk03_DtlR r : up1()) {
				setErrFlgCmm(r, msgL);
			}

			return msgL;
		}
		
		/**
		 * 詳細チェック上り電文のチェック処理
		 * @return メッセージリスト
		 */
		protected void chkIo() {
			MCMessageList msgL = new MCMessageList();
			
			// 仕入明細訂正時はチェックしない
			if (up3().purc_dtl_flg()) {
				return;
			}
			
			MCIndexKey idxDtl = up1().createIndex(Purc_Chk03_DtlR.$peg_no);
			MCIndexKey idxHdr = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
			
			for (Purc_Chk03_IoR ioRow : up2()) {
				// 明細を取得
				Purc_Chk03_DtlR dtlRow = up1().getFirst(idxDtl, ioRow.dtl_peg_no());
				// ヘッダを取得
				Purc_Chk03_HdrR hdrRow = up0().getFirst(idxHdr, dtlRow.hdr_peg_no());
	
				// 仕入または経費購買の場合のみ、チェック処理を行う
				if (!MAC_TRD_PTN_TYP.isPURC(hdrRow.trd_ptn_typ()) &&
						!MAC_TRD_PTN_TYP.isPURC_XPNS(hdrRow.trd_ptn_typ())) {
					continue;
				}
				
				// データ更新区分が「新規」の場合のチェック処理
				if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {

					if (!up3().arr_act_srvs_flg() && !up3().purc_ddlv_reg_exec_flg()) {

						// 発注あり時のみチェックする
						if (!isNull(dtlRow.po_d_no())) {
							// 入荷パタン「未着管理」でない場合のチェック
							if (!MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
								if (isNull(ioRow.arr_act_no()) && !dtlRow.sync_flg()) {
									ioRow.err_flg(true);
									msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0033, toDispGUIIndex(ioRow)));
								}
								else if (!isNull(ioRow.arr_act_no()) && dtlRow.sync_flg()) {
									ioRow.err_flg(true);
									msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0034, toDispGUIIndex(ioRow)));
								}
							}
						}
					}
				}
				// データ更新区分が「新規」または「更新」の場合のチェック処理
				if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
					
					MAM_BP_R spplCc = getSpplCache().get(hdrRow.sppl_cd());
					
					//入荷済で仕入のみ登録する場合は同じ値であること
					if (!isNull(ioRow.arr_act_no()) && !dtlRow.sync_flg() && !up3().arr_act_srvs_flg()) {
						MST_ARR_ACT_R ar = getArrActCache().get(ioRow.arr_act_no());
						MAM_ITM_R itmr = getItmCache().get(
								dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
						if (!isNull(ar)) {
							if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmr.lot_mng_typ())) {
								chkSameArrAndPurc(msgL, ioRow, ar, Purc_Chk03_IoR.$lot_no, MST_ARR_ACT_R.$lot_no);
							}
							if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmr.sublot_mng_typ())) {
								chkSameArrAndPurc(msgL, ioRow, ar, Purc_Chk03_IoR.$sublot_no, MST_ARR_ACT_R.$sublot_no);
							}
						}
					}
					
					// 下請対象取引先チェック
					if (spplCc.subcon_flg() && isArrActTgt(dtlRow, up3())) {
						if(!dtlRow.sync_flg() && isNull(ioRow.arr_act_no())) {
							ioRow.err_flg(true);
							msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0053, hdrRow.sppl_cd()));
						}
					}
					
					// 納入場所の変更可否チェック
					msgL.add(chkIsLocChangeable(dtlRow, ioRow));

				}	

				// データ更新区分が「更新」の場合のチェック処理
				if (MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {

					if (MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
						// 入荷パタン「未着管理」の場合のチェック
						if (!isNull(ioRow.arr_act_no())) {
							MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
							if (paiRow.base_unit_qty().neq(ioRow.base_unit_qty())
									|| !isSame(paiRow.in_to_loc_cd(), ioRow.dlv_loc_cd())
									|| !isSame(paiRow.str_ln_cd(), ioRow.str_ln_cd())
									|| !isSame(paiRow.trd_unit_cd(), ioRow.trd_unit_cd())) {
								ioRow.err_flg(true);
								msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0044, toDispGUIIndex(ioRow)));
							}
						}
						
						if (dtlRow.sync_flg()) {
							MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
							MST_PURC_ACT_D_R padRow = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
							if (!padRow.sync_flg()) {
								// 仕入実績受払NOが設定されている入荷実績を取得する
								MCList<MST_ARR_ACT_R> arrActL = getArrActCacheByPurcActIoNo(paiRow.purc_act_io_no());
								if (arrActL.size() >= 2) {
									// 仕入実績受払1件に対して、複数件の入荷実績が登録されている場合、同時更新は不可
									ioRow.err_flg(true);
									for (MST_ARR_ACT_R arrRow : arrActL) {
										msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$purc_act_io_no, MSBDL0036, arrRow.arr_act_no(), toDispGUIIndex(ioRow)));
									}
								}
							}
						}
					}
					else {
						if (dtlRow.sync_flg()) {
							// 同時計上ＯＮの場合のチェック
							MST_ARR_ACT_R arrActRow = getArrActCache().get(ioRow.arr_act_no());
							MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
							MST_PURC_ACT_D_R padRow = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
							// 入荷実績と更新前の仕入実績受払の基準単位数量が異なる場合は同時計上は不許可
							if (arrActRow != null && !isNull(arrActRow.base_unit_qty()) && arrActRow.base_unit_qty().neq(paiRow.base_unit_qty())) {
								ioRow.err_flg(true);
								msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$trd_unit_qty, MSBDL0037, ioRow.arr_act_no(), toDispGUIIndex(ioRow)));
							}
							
							// 同時計上ＦＬＧをオフからオンに変える場合のチェック
							if (!padRow.sync_flg()) {
								// 入荷実績NOを使用している仕入実績受払を取得する
								MCList<MST_PURC_ACT_IO_R> havSameArrList = getPaiCcByAaNo(ioRow.arr_act_no());
								if (havSameArrList.size() >= 2) {
									// 入荷実績1件に対して複数件の仕入実績受払が登録されている場合、同時更新不可
									ioRow.err_flg(true);
									msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0036, ioRow.arr_act_no(), toDispGUIIndex(ioRow)));
								}
							}
						}
					}
					
				}
				
				// データ更新区分が「削除」の場合のチェック処理
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					// 入荷パタン「未着管理」の場合のチェック
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
						if (!isNull(ioRow.arr_act_no()) && !dtlRow.sync_flg()) {
							ioRow.err_flg(true);
							msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no, MSBDL0045, toDispGUIIndex(ioRow)));
						}
					}
				}
				
				// 訂正・削除時のチェック
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())) {
					msgL.add(chkArrActIsRegistered(dtlRow));
				}
				
				
			}
			
			// 入荷実績ＮＯ単位に、仕入検収前在庫に対して引落時に荷姿振替が行われている場合のチェック（引き落とした分だけ仕入実績計上時に荷姿振替を実施する必要があるため）
			for (MCList<Purc_Chk03_IoR> ioList : up2().groupList(Purc_Chk03_IoR.$arr_act_no)) {
				Purc_Chk03_IoR ioFirstRow = ioList.get(0);
				
				// 入荷実績ＮＯが設定されていない、または在庫検査区分が検査待の場合はチェック不要
				if (isNull(ioFirstRow.arr_act_no()) || MSC_STK_INSP_TYP.isYET(ioFirstRow.stk_insp_typ())) {
					continue;
				}
				
				// 明細を取得
				Purc_Chk03_DtlR dtlRow = up1().getFirst(idxDtl, ioFirstRow.dtl_peg_no());

				// 同時計上フラグがオンの場合はチェック不要
				if (dtlRow.sync_flg()) {
					continue;
				}
				
				// 入荷実績ＮＯで検査実績を取得
				MST_INSP_ACT_R inspActR = getInspActCache(ioFirstRow.arr_act_no());
				// 検査実績が存在しない、または荷姿振替数量が設定されていない場合はチェック不要
				if (isNull(inspActR) || isNull(inspActR.getNumber("pack_xfr_pack_unit_qty"))) {
					continue;
				}
				
				MCNumber baseUnitQty = MCNumber.ZERO;

				// 入荷実績ＮＯに紐付く登録済の仕入実績受払を取得
				MCList<MST_PURC_ACT_IO_R> purcActIoL = getPaiCcByAaNo(ioFirstRow.arr_act_no());
				MCIndexKey purcActIoKey = purcActIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq);

				// 取引単位ＣＤと基準単位ＣＤが同一のレコードを抽出し、基準単位数量を合計
				if (!purcActIoL.isEmpty()) {
					MCList<MST_PURC_ACT_IO_R> subPurcActIoL = purcActIoL
							.subList(r -> isSame(r.base_unit_cd(), r.trd_unit_cd()));
					if (!subPurcActIoL.isEmpty()) {
						baseUnitQty = subPurcActIoL.sum(MST_PURC_ACT_IO_R.$base_unit_qty);
					}
				}
				
				// 同一入荷実績ＮＯリストの各行のデータ更新区分に基づき、基準単位に振り替えられた数量を集計
				for (Purc_Chk03_IoR ioRow : ioList) {
					// 新規または更新
					if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
						// 取引単位ＣＤ＝基準単位ＣＤの場合は基準単位数量を加算
						if (isSame(ioRow.base_unit_cd(), ioRow.trd_unit_cd())) {
							baseUnitQty = baseUnitQty.add(ioRow.base_unit_qty());
						}
					}
					// 更新または削除
					if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
						// 仕入実績受払ＮＯ、連番で登録済の仕入実績受払を取得
						MST_PURC_ACT_IO_R purcActIoR = purcActIoL.getFirst(purcActIoKey,
								ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
						if (!isNull(purcActIoR)) {
							// 取引単位ＣＤ＝基準単位ＣＤの場合は基準単位数量を減算
							if (isSame(purcActIoR.base_unit_cd(), purcActIoR.trd_unit_cd())) {
								baseUnitQty = baseUnitQty.subtract(purcActIoR.base_unit_qty());
							}
						}
					}
				}
				
				// 算出した基準単位数量と引落数量を比較し、引落数量の方が大きい場合はエラー
				if (inspActR.getNumber("so_qty").gt(baseUnitQty)) {
					// 削除行以外のみエラーメッセージを設定
					for (Purc_Chk03_IoR ioRow : ioList) {
						if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
							ioRow.err_flg(true);
							msgL.add(new MCMessage(ioRow, Purc_Chk03_IoR.$arr_act_no,
									MSBDL0197, ioRow.arr_act_no(),
									inspActR.getNumber("so_qty"),
									inspActR.getNumber("pack_xfr_pack_unit_qty"),
									toDispGUIIndex(ioRow)));
						}
					}
				}
			}
			
			for (Purc_Chk03_IoR r : up2()) {
				setErrFlgCmm(r, msgL);
			}
			
			MCMessagePool.addAll(msgL);
			
		}
		
		protected void chkSameArrAndPurc(MCMessageList msgL, 
				Purc_Chk03_IoR ioRow, MST_ARR_ACT_R arRow, 
				String purcCol, String arrCol) {
			Comparable<?> iv = ioRow.getValue(purcCol);
			Comparable<?> av = arRow.getValue(arrCol);
			if(!isSame(iv, av)) {
				ioRow.err_flg(true);
			
				msgL.add(new MCMessage(ioRow, purcCol, MSBDL0159, 
						getLabel(ioRow, purcCol), 
						getDBLabel("MST_ARR_ACT_ALL", arrCol.toUpperCase()),
						arRow.arr_act_no(),
						av, toDispGUIIndex(ioRow)));
			}
		}

		/**
		 * 支給直送の仕入実績受払が紐付く仕入実績明細の検収不良FLGを、<br>登録時の値から変更しようとしていないかチェックします。<br>
		 * @param dtlRow チェック対象明細行
		 * @return メッセージリスト
		 */
		protected MCMessage chkAccptDfctIsChangedInDDlv(Purc_Chk03_DtlR dtlRow) {
			
			if (!MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ()) ) {
				return null;
			}
			
			MST_PURC_ACT_D_R padRow = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
			if (!isSame(padRow.accpt_dfct_flg(), dtlRow.accpt_dfct_flg())) {
				MCList<Purc_Chk03_IoR> tgtIoL = up2().subList(Purc_Chk03_IoR.$dtl_peg_no, dtlRow.peg_no());
				for (Purc_Chk03_IoR ioRow : tgtIoL) {
					
					MAM_LOC_R loc = getLocCache().get(ioRow.dlv_loc_cd());
					if (!isNull(loc.sppl_cd())) {
						dtlRow.err_flg(true);
						return new MCMessage(dtlRow, Purc_Chk03_DtlR.$accpt_dfct_flg, MSBDL0158, toDispGUIIndex(dtlRow));
					}					
				}
			}
			
			return null;
		}
		
		/**
		 * 入荷後の仕入で打切りを行う場合に、打切りが可能かチェックします<br>
		 * @param dtlRow チェック対象の明細行
		 * @return メッセージ
		 */
		protected MCMessage chkAbortAfterArr(Purc_Chk03_DtlR dtlRow) {
			
			// 個別計上で打切りにした場合にチェックする
			if (!dtlRow.sync_flg() && dtlRow.abort_flg() && !up3().arr_act_srvs_flg()) {
				
				MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(dtlRow.arr_schd_no());
				if (MSC_ARR_PTN_TYP.isNRML(dtlRow.arr_ptn_typ())) {
					
					// 入荷予定が未完了の場合、打切不可
					if (!arrSchd.cmpl_flg()) {
						dtlRow.err_flg(true);
						return new MCMessage(dtlRow, Purc_Chk03_DtlR.$abort_flg,
								MSBDL0188, arrSchd.arr_schd_no(), toDispGUIIndex(dtlRow));
					}
					
					// 仕入予定に紐付く他の上り電文を取得
					MCList<Purc_Chk03_DtlR> otherDtlL = MCList.create(Purc_Chk03_DtlR.class);
					up1().forEach(r -> {
						if (isSame(r.purc_schd_no(),dtlRow.purc_schd_no())
								&& !isSame(r.peg_no(), dtlRow.peg_no())
								&& !MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
							otherDtlL.add(r);
						}
					});
					MCIndexKey idxDtl = otherDtlL.createIndex(
							Purc_Chk03_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_seq);
					
					// 仕入予定に紐付く仕入実績明細
					MCList<MST_PURC_ACT_D_R> dbcL = MCList.create(MST_PURC_ACT_D_R.class);
					
					getPurcActDCacheByPurcSchdNo(dtlRow.purc_schd_no()).forEach(r -> {
						if (!isSame(r.purc_act_d_no(), dtlRow.purc_act_d_no())) {
							Purc_Chk03_DtlR otherDtlRow
								= otherDtlL.getFirst(idxDtl, r.purc_act_d_no(), r.purc_act_d_seq());
							if (isNull(otherDtlRow)) {
								dbcL.add(r);
							}
						}
					});
					
					// チェック中の明細行、同じ仕入予定NOの他の上り電文(新規・更新)、同じ仕入予定NOを持ち、上り電文に連携されていない仕入実績明細で、
					// 基準単位数量を合計して、入荷予定の入荷数よりも少ない数量の場合は打切りを許可しない。
					MCNumber purcQty = dtlRow.base_unit_qty();
					for (Purc_Chk03_DtlR r : otherDtlL) {
						purcQty = purcQty.add(r.base_unit_qty());
					}
					for (MST_PURC_ACT_D_R r : dbcL) {
						purcQty = purcQty.add(r.base_unit_qty());
					}
					if (!isSame(arrSchd.arr_qty(), MCNumber.ZERO) && purcQty.neq(arrSchd.arr_qty())) {
						dtlRow.err_flg(true);
						return new MCMessage(dtlRow, Purc_Chk03_DtlR.$abort_flg, 
								MSBDL0162,	arrSchd.arr_qty(), purcQty, arrSchd.arr_schd_no(), toDispGUIIndex(dtlRow));
					}
					
				}
				
			}
			
			return null;
		}
		
		protected boolean isRemAbort(Purc_Chk03_DtlR dtlRow, MST_ARR_PR_R arrPrRow) {

			if (!dtlRow.sync_flg() && arrPrRow.abort_flg()) {
				if (isSame(arrPrRow.arr_qty().add(arrPrRow.arr_schd_abort_qty()),
						arrPrRow.base_unit_qty())) {
					return true;
				}
			}

			return false;
		}
		
		/**
		 * 未着管理の仕入実績を訂正・または取り消しする場合に、<br>入荷実績が登録済でないかチェックします。
		 * @return メッセージ
		 */
		protected MCMessage chkArrActIsRegistered(Purc_Chk03_DtlR dtlRow) {
			
			if (isNull(dtlRow.arr_schd_no())) {
				return null;
			}
			
			// 未着管理でない場合、チェックしない
			if (!MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ())) {
				return null;
			}
			
			MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(dtlRow.arr_schd_no());
			if (arrSchd.arr_qty().neq(MCNumber.ZERO)) {
				dtlRow.err_flg(true);
				
				String msgId;
				if (MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					msgId = MSBDL0163;
				}
				else {
					msgId = MSBDL0164;
				}
				
				return new MCMessage(dtlRow, 
						Purc_Chk03_DtlR.$purc_act_d_no, msgId, toDispGUIIndex(dtlRow));
			}
			
			return null;
		}
		
		/**
		 * 場所変更時のチェック処理を行います。<br>予定時の場所と異なる物流グループの場所を設定した場合、<br>
		 * 社外の場所から社内の場所、または社内の場所から社外の場所を指定した場合にエラーにします。
		 * @return メッセージ
		 */
		protected MCMessage chkIsLocChangeable(Purc_Chk03_DtlR dtlRow, Purc_Chk03_IoR ioRow) {
			
			// 変更前の場所マスタキャッシュを格納する
			MAM_LOC_R bfLocR = null;
			
			// 変更前の場所マスタキャッシュを取得
			if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {
				
				// 新規登録時、入荷が行われていれば入荷実績、未入荷であれば入荷予定の入荷場所ＣＤから場所マスタキャッシュを取得
				// 計画外仕入の場合は、新規新規登録時はチェック対象外
				if (!isNull(dtlRow.purc_schd_no())) {
					if (!isNull(ioRow.arr_act_no())) {
						bfLocR = getArrActLocCache(ioRow.arr_act_no());
					}
					else {
						bfLocR = getArrSchdLocCache(dtlRow.arr_schd_no());
					}
				}

			}
			else if (MAC_DATA_CRUD_TYP.isUPD(ioRow.data_crud_typ())) {
				// 更新時、仕入実績受払の納入場所ＣＤから場所マスタキャッシュを取得
				bfLocR = getPaiLocCache(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
			}
			
			// 変更前場所情報がない場合、チェックしない
			if (!isNull(bfLocR)) {
				
				// 変更後の場所を取得
				MAM_LOC_R afLocR = getLocCache().get(ioRow.dlv_loc_cd());
				
				if (!isNull(bfLocR.sppl_cd())) {
					if (!isSame(bfLocR.loc_cd(), afLocR.loc_cd())) {
						// 社外場所を他の場所に変更しようとした場合、エラーにする
						ioRow.err_flg(true);
						return new MCMessage(ioRow, Purc_Chk03_IoR.$dlv_loc_cd, MSBDL0166, 
								bfLocR.loc_cd(), bfLocR.sppl_cd(), afLocR.loc_cd(), toDispGUIIndex(ioRow));
					}
				}
				else if (isNull(bfLocR.sppl_cd()) && !isNull(afLocR.sppl_cd())) {
					// 社内場所から社外場所に変更しようとした場合、エラーにする
					ioRow.err_flg(true);
					return new MCMessage(ioRow, Purc_Chk03_IoR.$dlv_loc_cd, MSBDL0165, 
							bfLocR.loc_cd(), afLocR.loc_cd(), afLocR.sppl_cd(), toDispGUIIndex(ioRow));
				}
				
				// 入荷同時計上でない場合にチェックする
				if (!dtlRow.sync_flg() && !up3().arr_act_srvs_flg()) {
					 if (isNull(bfLocR.sppl_cd()) && isNull(afLocR.sppl_cd())) {
						if (!isSame(bfLocR.lg_grp_cd(), afLocR.lg_grp_cd())) {
							// 物流グループが異なる納入場所に変更しようとした場合、エラーにする
							ioRow.err_flg(true);
							return new MCMessage(ioRow, Purc_Chk03_IoR.$dlv_loc_cd, MSBEL0007, 
									bfLocR.loc_cd(), bfLocR.lg_grp_cd(), afLocR.loc_cd(), afLocR.lg_grp_cd(), toDispGUIIndex(ioRow));
						}
					}
				}
				
			}
			
			return null;
		}
		
		protected MCMessageList chkItmJnl(Purc_Chk03_DtlR dtlRow) {
			MCMessageList msgL = new MCMessageList();
			MAM_ITM_R itmR = getItmCache().get(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
			if (isNull(itmR.itm_cd())) {
				msgL.add(new MCMessage(dtlRow, null, MAUAL0189,
						toDispItm(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3()), toDispGUIIndex(dtlRow)));
			}
			else {
				MAM_ITM_JNL_R chkItmJnlR = MAM_ITM_JNL_R.create();
				dbSelectKey("MSBDL5180_MAM_ITM_JNL_S02", chkItmJnlR, MCQueryApiBuilder.create(MAM_ITM_JNL_R.create("T")), itmR.itm_jnl_cd());
				if (isNull(chkItmJnlR.itm_jnl_cd())) {
					msgL.add(new MCMessage(dtlRow, null, MSBDL0307, itmR.itm_jnl_cd(), toDispGUIIndex(dtlRow)));
				}
			}
			setErrFlgCmm(dtlRow, msgL);
			
			return msgL;
		}
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			
			// 詳細行でチェックした結果エラーであれば、明細行・ヘッダ行もエラーにする
			MCIndexKey up1Key = up1().createIndex(Purc_Chk03_DtlR.$peg_no);
			MCIndexKey up0Key = up0().createIndex(Purc_Chk03_HdrR.$peg_no);
			
			for (Purc_Chk03_IoR ioRow : up2()) {
				if (ioRow.err_flg()) {
					Purc_Chk03_DtlR dtlRow = up1().getFirst(up1Key, ioRow.dtl_peg_no());
					if (!isNull(dtlRow)) {
						dtlRow.err_flg(true);
					}
				}
			}
			
			// 明細行でチェックした結果エラーであれば、ヘッダ行もエラーにする
			for (Purc_Chk03_DtlR dtlRow : up1()) {
				if (dtlRow.err_flg()) {
					Purc_Chk03_HdrR hdrRow = up0().getFirst(up0Key, dtlRow.hdr_peg_no());
					if (!isNull(hdrRow)) {
						hdrRow.err_flg(true);
					}
				}
			}
			
			// ヘッダ行がエラーであれば、紐付く明細・詳細全てエラーとする
			for (Purc_Chk03_HdrR hdrRow : up0()) {
				if (hdrRow.err_flg()) {
					MCList<Purc_Chk03_DtlR> dtlList = up1().subList(Purc_Chk03_DtlR.$hdr_peg_no, hdrRow.peg_no());
					dtlList.setBoolean(Purc_Chk03_DtlR.$err_flg, hdrRow.err_flg());
					for (Purc_Chk03_DtlR dtlRow : dtlList) {
						MCList<Purc_Chk03_IoR> ioList = up2().subList(Purc_Chk03_IoR.$dtl_peg_no, dtlRow.peg_no());
						ioList.setBoolean(Purc_Chk03_IoR.$err_flg, hdrRow.err_flg());
					}
				}
			}
			
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}

	/**
	 * Purc_Ins01オペレーション.<p>
	 *
	 * 仕入実績を新規登録する<br>
	 */
	public class Purc_Ins01 extends MSBDL_PurcActRegService_MC_A.Purc_Ins01 {
		MCList<MST_PURC_ACT_R> _hdrL = MCList.create(MST_PURC_ACT_R.class);
		MCList<MST_PURC_ACT_D_R> _dtlL = MCList.create(MST_PURC_ACT_D_R.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// データ更新区分の設定
			setDataCrudTyp();
			
			crtCacheForInsUpd(up1(), up2(), up3());
			
			// 補完処理
			cmplUpParam();
			
			// ヘッダ電文の分割 (税率違いの明細を別ヘッダに分ける(伝票単位の消費税計算の為))
			splitHdr(up1(), up2(), up3());
			
			// 明細の金額計算
			calcDtlAmt(up0(), up1(), up2());
			
			// 消費税再計算
			calcDtlTaxAmt();
			
			// 取引通貨単価、金額、値引額、税額から基準通貨及び、納税通貨の同項目を補完する
			cmplOtherCurUpriAmtTax(up0(), up1(), up2());

			// 明細の金額・税額を詳細に案分
			divideDtlAmtToIo(up1(), up2(), up3());
			
			// 基準通貨・納税通貨換算
			convUpriAmtFrTrdToBasePtax(up0(), up1(), up2(), up3());

			// 上り電文編集
			editUp();
			// 入荷予定送信ＩＦサービス（未着分送信）
			callArrSchdSendIf_Upd01(up2(), up3(), true);
			
			// 検査予定登録サービス(在庫検査区分の取得)
			callInspSchdService(up1(), up2(), up3());
			
			// 入荷実績登録サービス
			callArrActService(up1(), up2(), up3(), up0());

			MCJoinKey<MCList<Purc_Ins01_IoR>> dtl2IoKey = 
					up2().join(Purc_Ins01_DtlR.$peg_no, up3(), Purc_Ins01_IoR.$dtl_peg_no);
			MCList<Purc_Ins01_DtlR> outsrcTgtL = getOursrcMfgTgtUp1(up0(), up1(), up2(), up3());

			// 詳細行の項目を、明細に反映
			syncDtlAndIo(up2(), dtl2IoKey);

			// 債務区分の設定
			setApTyp(up2());

			// 受領インボイスのリビジョン更新
			updRcptIvRev(up0(), up1());

			// 仕入実績登録処理
			insPurcAct();

			// 仕入実績の受払実績ワークを作成する
			callIoAct_Ins01_for_crt_or_upd(up1(), up2(), up3());

			
			// 仕入予定サービス
			callPurcSchd_Upd02(up2());
			
			// 入荷予定サービス(再入荷予定作成)
			callArrSchd_Upd01(up1(), up2());
			// 入荷予定送信ＩＦサービス（未着分送信）
			callArrSchdSendIf_Upd01(up2(), up3(), false);
			
			// 入荷予定サービス（進捗情報の更新）
			callArrSchd_Upd03(up2());
			
			// 支給実績サービス(登録)実行
			callProvAct_Upd01(up1(), up2(), up3());
			
			// 外注製造実績サービス
			callOutSrcAct_Upd01(up0(), up1(), outsrcTgtL, up3(), dtl2IoKey);
			
			// ロット情報サービス
			callLotService(outsrcTgtL,up3());
			// 受払実績作成
			callIoAct_Upd01(up0());
			
			// オーダ登録サービス(品目オーダ更新)実行
			callOrd_Upd04(up0(), up2());
			
			// 受注状況更新サービス(受注状況の更新)
			callSloSts_Upd01(up1(), up2());
			
			// 承認提供サービス(承認次処理済更新)
			callAprvUpd02(up1());
			
			// 売上予定サービス
			callSlsSchdSrv(up2(), up0());
			// 債務与信更新サービス
			callCredUpd02(_hdrL, _dtlL);
			
			// 下り電文編集
			editDown();
			
			// 伝票分割メッセージセット
			setSplitMsg(up1());
			
			// 仮単価メッセージセット
			setInterimMsg(up1(), up2());
			
			// EDI検収送信
			callAccptEdi(up1(), up2());
			callApDtlRegServiceUpd01(up1(), up2(), _hdrL);
			callGALink(_hdrL, MAC_DATA_CRUD_TYP.CRT.value());
		}
		
		/**
		 * データ更新区分の設定
		 */
		protected void setDataCrudTyp() {
			// 全ての電文のデータ更新区分に「新規」を設定
			up1().setString(Purc_Ins01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up2().setString(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up3().setString(Purc_Ins01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		}
		
		/**
		 * 上り電文を補完する
		 */
		protected void cmplUpParam() {
			
			// ヘッダ上り電文補完
			for (Purc_Ins01_HdrR row : up1()) {
				compHdrCommon(row);
				// 通貨ＣＤ
				row.base_cur_cd(getCo().base_cur_cd());
				row.ptax_cur_cd(getCo().ptax_cur_cd());
				// 為替レートＣＤ
				row.xrate_cd(getCo().purc_xrate_cd());
			}

			for (Purc_Ins01_DtlR row : up2()) {
				compDtlCommon(up1(), row, up0());
				// 在庫管理区分(受払実績SVに連携する、在庫を更新するか否かを決定する区分。)
				MAM_ITM_R itm = getItmCache().get(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());
				row.stk_mng_typ(getStkMngTypForTran(itm.stk_mng_typ(), itm.asset_mng_typ(), row.xpns_po_flg()));
				
				MCList<Purc_Ins01_IoR> ioL = MCList.create(Purc_Ins01_IoR.class);
				ioL = up3().subList(Purc_Ins01_IoR.$dtl_peg_no, row.peg_no());
				for (Purc_Ins01_IoR ioRow : ioL) {
					complIoCommon(row, ioRow);
					
				}
				
			}
			
			for (Purc_Ins01_IoR ioRow : up3()) {
				Purc_Ins01_DtlR dtlRow = up2().getFirst(Purc_Ins01_DtlR.$peg_no, ioRow.dtl_peg_no());
				// 品目情報
				ioRow.itm_cd(dtlRow.itm_cd());
				ioRow.itm_sub1(dtlRow.itm_sub1());
				ioRow.itm_sub2(dtlRow.itm_sub2());
				ioRow.itm_sub3(dtlRow.itm_sub3());
				
				// 計画外なら, 仕入前単位を仕入単位で補完
				if (isNull(dtlRow.purc_schd_no())) {
					ioRow.gi_unit_cd(ioRow.trd_unit_cd());
				}
				
				// 同時計上の場合、仕入前の荷姿単位ＣＤに仕入後の単位ＣＤを設定する
				if (dtlRow.sync_flg()) {
					ioRow.gi_unit_cd(ioRow.trd_unit_cd());
				}
				else {
					if (isNull(ioRow.arr_act_no())) {
						// 未着管理の場合も仕入後の単位を指定
						ioRow.gi_wg_cd(ioRow.in_to_loc_wg_cd());
						ioRow.gi_loc_cd(ioRow.in_to_loc_cd());
						ioRow.gi_str_ln_cd(ioRow.str_ln_cd());
						ioRow.gi_unit_cd(ioRow.trd_unit_cd());
					}
				}
				
				// 在庫更新しない場合、ロットNO,サブロットNOにはNULL文字を設定
				if (MAC_STK_MNG_TYP.isNOT_MNG(dtlRow.stk_mng_typ())) {
					ioRow.lot_no(MAC_STR.NULL_VAL.value());
					ioRow.sublot_no(MAC_STR.NULL_VAL.value());
				}
				
				// 非在庫・入荷不要の場合、在庫識別区分は「自社」、在庫検査区分は「検査済」で固定
				MAM_ITM_R itm = getItmCache().get(dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
				if (MAC_STK_MNG_TYP.isNOT_MNG(itm.stk_mng_typ()) && itm.arr_skip_flg()) {
					ioRow.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					ioRow.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				
				if (!dtlRow.sync_flg() && !MSC_STK_INSP_TYP.isYET(ioRow.stk_insp_typ()) && !isNull(ioRow.arr_act_no())) {
					MCList<MST_PURC_ACT_IO_R> purcActIoL = getPaiCcByAaNo(ioRow.arr_act_no());
					MCNumber soFinQty = nvl(purcActIoL.sum("so_qty"), MCNumber.ZERO);
					MST_INSP_ACT_R inspActR = getInspActCache(ioRow.arr_act_no());
					if (!isNull(inspActR)) {
						MCNumber soQty = inspActR.getNumber("so_qty");
						if (!soQty.isZero() && soQty.gt(soFinQty)) {
							if (ioRow.base_unit_qty().gte(soQty.subtract(soFinQty))) {
								ioRow.so_qty(soQty.subtract(soFinQty));
								inspActR.setNumber("so_qty", MCNumber.ZERO);
							}
							else {
								ioRow.so_qty(ioRow.base_unit_qty());
								inspActR.setNumber("so_qty", soQty.subtract(ioRow.base_unit_qty()));
							}
						}
					}
				}
			}
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			
			// ヘッダ上り電文をソート
			up1().sort(Purc_Ins01_HdrR.$peg_no);

			// 明細上り電文をソート
			up2().sort(Purc_Ins01_DtlR.$hdr_peg_no, Purc_Ins01_DtlR.$disp_seq);
			
			// 実績受払上り電文をソート
			up3().sort(Purc_Ins01_IoR.$dtl_peg_no);
			
			// ヘッダ上り電文
			MCList<ElmArgsR> argL = MCList.create(ElmArgsR.class);
			for (Purc_Ins01_HdrR hdrRow : up1()) {
				// 上り電文にない項目を補完する
				hdrRow.purc_act_seq(1);								// 連番(「1」固定)
				hdrRow.purc_act_rev(1);								// 仕入実績改訂番号(「1」固定)
				hdrRow.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());	// 伝票状況区分(「作成」固定)
				hdrRow.ptax_cur_cd(getCo().ptax_cur_cd());			// 納税通貨ＣＤ
				hdrRow.base_cur_cd(getCo().base_cur_cd());			// 基準通貨ＣＤ
				hdrRow.xrate_cd(getCo().purc_xrate_cd());			// 仕入為替レートＣＤ

				ElmArgsR argR = getPurcActNumArgs(hdrRow);			// 仕入実績ＮＯ発番のリスト追加
				argL.add(argR);
			}
			setPurcActNum(up1(), argL);								// 仕入実績ＮＯ発番
			
			// 明細上り電文
			// 仕入実績明細ＮＯ発番領域確保
			doSeqCache(MSC_NUM_SYS_TYP.PURCACTD, up2().size());
			
			// 外注製造実績サービスで購買区分を取得する為のパラメータ
			MCList<OutSrcAct_Sprt02_CndR> paramListForOsaSprt02 = MCList.create(OutSrcAct_Sprt02_CndR.class);
			
			for (Purc_Ins01_DtlR dtlRow : up2()) {
				// 仕入実績明細ＮＯ・連番の発番
				dtlRow.purc_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTD));
				dtlRow.purc_act_d_seq(1);

				// ヘッダ情報取得
				Purc_Ins01_HdrR hdrR = up1().getFirst(Purc_Ins01_HdrR.$peg_no, dtlRow.hdr_peg_no()); 
				
				// 経費購買の場合、負担取引先に発注先を連携する
				if (dtlRow.xpns_po_flg()) {
					dtlRow.bd_bp_cd(hdrR.sppl_cd());
				}
				
				// 仕入実績NO・連番のセット
				dtlRow.purc_act_no(hdrR.purc_act_no());
				dtlRow.purc_act_seq(hdrR.purc_act_seq());
				
				// 仕入作成元区分
				if (!MAC_TRD_PTN_TYP.isPURC_VMI(hdrR.trd_ptn_typ())) {
					dtlRow.purc_src_typ(null);
					dtlRow.purc_src_no(null);
				}
								
				if (isPurcTypDecideInSrvs(dtlRow, up1())) {
					// 製造指図NOがある場合、外注製造実績サービス呼出用のパラメータに追加する
					if (!isNull(dtlRow.mfg_inst_no())) {
						OutSrcAct_Sprt02_CndR paramRowForOsaSprt02 = OutSrcAct_Sprt02_CndR.create();
						copy(paramRowForOsaSprt02, dtlRow, createMap_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR());
						paramListForOsaSprt02.add(paramRowForOsaSprt02);
					}
					else {
						dtlRow.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
					}
				}

				if (!dtlRow.temp_ap_flg() && !isNull(dtlRow.purc_schd_no())) {
					MST_PURC_SCHD_R purcSchdR = getPurcSchdCache().get(dtlRow.purc_schd_no());
					if (!isNull(purcSchdR.getStringNE("rcpt_iv_no"))) {
						hdrR.rcpt_iv_no(nvl(hdrR.rcpt_iv_no(), purcSchdR.getStringNE("rcpt_iv_no")));
						hdrR.rcpt_iv_mng_no(nvl(hdrR.rcpt_iv_mng_no(), purcSchdR.getStringNE("rcpt_iv_mng_no")));
						hdrR.rcpt_iv_rev(nvl(hdrR.rcpt_iv_rev(), purcSchdR.getNumberNE("rcpt_iv_rev")));
						dtlRow.rcpt_iv_d_no(nvl(dtlRow.rcpt_iv_d_no(), purcSchdR.getStringNE("rcpt_iv_d_no")));
						dtlRow.iv_itm_nm(nvl(dtlRow.iv_itm_nm(), purcSchdR.getStringNE("iv_itm_nm")));
					}
				}
				
				// 与信更新不要
				dtlRow.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, isNotUpdCred(up0(), hdrR, dtlRow));
			}
			
			if (paramListForOsaSprt02.size() > 0) {
				MSBCL_OutSrcActService.OutSrcAct_Sprt02 ope = MSBCL_OutSrcActService.crtOutSrcAct_Sprt02();
				ope.up0().addAll(paramListForOsaSprt02);
				ope.exec();
				
				String[] destCols = {Purc_Ins01_DtlR.$purc_typ};
				String[] srcCols = {OutSrcAct_Sprt02_RsltR.$purc_typ};
				copyByPegNo(up2(), destCols, ope.down0(), srcCols);
			}
			
			// 受払上り電文
			// 仕入実績受払ＮＯの領域確保
			doSeqCache(MSC_NUM_SYS_TYP.PURCACTIO, up2().size());
			
			for (Purc_Ins01_IoR ioRow : up3()) {
				// 仕入実績受払ＮＯ・連番の発番
				ioRow.purc_act_io_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTIO));
				ioRow.purc_act_io_seq(1);
				
				// 明細情報取得
				Purc_Ins01_DtlR dtlR = up2().getFirst(Purc_Ins01_DtlR.$peg_no, ioRow.dtl_peg_no());
				
				// 仕入実績明細NO・連番のセット
				ioRow.purc_act_d_no(dtlR.purc_act_d_no());
				ioRow.purc_act_d_seq(dtlR.purc_act_d_seq());
				
				// 在庫識別区分
				if (dtlR.accpt_dfct_flg()) {
					ioRow.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());
				}
				else {
					ioRow.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
			}
			// 表示順
			for (MCList<Purc_Ins01_DtlR> l :up2().groupList(MST_PURC_ACT_D_R.$purc_act_no)) {
				setDispSeq(l);
			}
		}
		
		/**
		 * 下り電文を編集する
		 */
		protected void editDown() {
			down0().addAll(up1());
			down1().addAll(up2());
			down2().addAll(up3());
		}
		
		/**
		 * 明細行の消費税を再計算する
		 */
		protected void calcDtlTaxAmt() {
			MCIndexKey ik = up2().createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			for (Purc_Ins01_HdrR r : up1()) {
				MCList<Purc_Ins01_DtlR> dtlL = up2().subList(ik, r.peg_no());
				if (MAC_TAX_CALC_TYP.isSLIP(r.purc_tax_calc_typ())) {
					if (getSpplCache().get(r.sppl_cd()).sppl_iv_flg()) {
						if (isDscnt(r.trd_ptn_typ()) || isRtn(r.trd_ptn_typ())) {
							if (isCalledSlsRet(up0())) {
								setRepurcObliTaxAmt(up0(), r, dtlL);
							}
							callAmtUtilCalc01(r, dtlL);
						}
						else if (!dtlL.get(0).temp_ap_flg() && !isNullOrNullVal(r.rcpt_iv_mng_no())) {
							// 受領インボイス登録済みは再計算しない
						}
						else {
							setRepurcObliTaxAmt(up0(), r, dtlL);
						}
					}
					else {
						setRepurcObliTaxAmt(up0(), r, dtlL);
						calcTaxAmt(up0(), r, dtlL);
					}
				}
				else if(MAC_TAX_CALC_TYP.isLINE(r.purc_tax_calc_typ())){
					setRepurcObliTaxAmt(up0(), r, dtlL);
				}
			}
		}
		

		
		/**
		 * 仕入実績登録
		 */
		protected void insPurcAct() {
			
			// 仕入実績ヘッダ
			MCList<MST_PURC_ACT_R> insHdrL = MCList.create(MST_PURC_ACT_R.class);
			for (Purc_Ins01_HdrR hdrR : up1()) {
				hdrR.pa().ac_ym(getAcYm(hdrR.ac_dt()));
				insHdrL.add(hdrR.pa());
			}

			// 仕入実績明細
			MCList<MST_PURC_ACT_D_R> insDtlL = MCList.create(MST_PURC_ACT_D_R.class);
			for (Purc_Ins01_DtlR dtlR : up2()) {
				if (!dtlR.re_arr_flg()) {
					dtlR.re_arr_sync_flg(false);
					dtlR.re_arr_loc_cd(null);
					dtlR.re_arr_loc_wg_cd(null);
					dtlR.re_arr_str_ln_cd(null);
					dtlR.re_arr_rqst_tm(null);
					dtlR.re_arr_purc_schd_dt(null);
					dtlR.trd_unit_re_arr_qty(null);
					dtlR.base_unit_re_arr_qty(null);
				}
				// 入荷実績サービスから呼ばれた場合は同時計上オン固定になるため画面の同時計上で登録
				if (up0().arr_act_srvs_flg()) {
					dtlR.sync_flg(dtlR.arr_sync_flg());
				}
				// 与信更新不要
				dtlR.pad().setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, dtlR.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg));
				insDtlL.add(dtlR.pad());
			}
			
			// 仕入実績受払
			MCList<MST_PURC_ACT_IO_R> insIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			for (Purc_Ins01_IoR ioR : up3()) {
				// 計画外仕入の場合、出庫場所情報不要
				if (!isNull(ioR.arr_schd_no())) {
					ioR.pai().gi_wg_cd(null);
					ioR.pai().gi_loc_cd(null);
					ioR.pai().gi_str_ln_cd(null);
				}
				insIoL.add(ioR.pai());
			}

			dbInsert("MSBDL5180_MST_PURC_ACT_I01", insHdrL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_D_I01", insDtlL,
					MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_IO_I01", insIoL,
					MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")));

			_hdrL.addAll(insHdrL);
			_dtlL.addAll(insDtlL);
		}
		

	}
	
	/**
	 * 消費税再計算処理
	 * @param hdrR ヘッダ上り電文
	 * @param dtlL　明細上り電文
	 */
	protected void calcTaxAmt(Purc_Ins01_CtlR ctrl, Purc_Ins01_HdrR hdrR, MCList<Purc_Ins01_DtlR> dtlL) {
		
		Purc_Ins01_DtlR tmpR = dtlL.get(0);
		MAM_BP_R bpR = getSpplCache().get(hdrR.sppl_cd());
		// 税を案分する対象。値引品目以外の明細。
		MCList<Purc_Ins01_DtlR> divL = MCList.create(Purc_Ins01_DtlR.class); 
		
		// 合計値引額(値引品目による値引の合計)
		MCNumber ttlDscntTaxAmt = MCNumber.ZERO;
		// 外注フラグを設定
		MCList<Purc_Ins01_HdrR>hdrL = MCList.create(Purc_Ins01_HdrR.class);
		hdrL.add(hdrR);
		for (Purc_Ins01_DtlR r : dtlL) {
			if ((isPurcTypDecideInSrvs(r, hdrL) && !isNull(r.mfg_inst_no()))
					|| (!isDscntTrdPtn(hdrR.trd_ptn_typ()) && !isNull(r.purc_typ()) && !MAC_PURC_TYP.isPURC_ITM(r.purc_typ()))){
				r.setBooleanNE("outsrc_flg", true);
			}
		}

		// 明細の合計額(金額、値引額)を求める
		for (Purc_Ins01_DtlR r : dtlL) {
			MCNumber dtlDscntAmt = r.trd_cur_dscnt_amt();
			if (isNull(dtlDscntAmt)) {
				dtlDscntAmt = MCNumber.ZERO;
			}
			
			MCNumber taxAblAmt = r.trd_cur_amt();
			if(bpR.repurc_obli_flg()) {
				if (r.getBooleanNE("outsrc_flg")) {
					taxAblAmt = r.trd_cur_proc_amt();
				}
			}
			r.tax_abl_amt(taxAblAmt);
			
			
			MAM_ITM_R itm = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			
			if (itm.dscnt_itm_flg()) {
				ttlDscntTaxAmt = ttlDscntTaxAmt.add(r.trd_cur_tax_amt());
			}
			else {
				divL.add(r);
			}
		}

		// 合計額(金額、値引額)から税額を求める
		// 値引前の金額を連携する必要がある
		MCList<Purc_Ins01_DtlR> taxAmtL = crtGetTaxAmtL(dtlL);
		MCNumber ttlTaxAmt = MSUCL_AmtUtil.getTaxAmtBySlip(taxAmtL,
				hdrR.purc_tax_rnd_typ(), hdrR.amt_dec_place(), tmpR.tax_rate(), null);
		
		ttlTaxAmt = ttlTaxAmt.add(ttlDscntTaxAmt);

		// 消費税額がゼロの場合は案分不要
		if (ttlTaxAmt.isZero()) {
			return;
		}

		// 明細の金額の比率で消費税を明細に案分する
		FXUCC_Divide.prop(divL, ttlTaxAmt, hdrR.amt_dec_place().intValue(), Purc_Ins01_DtlR.$tax_abl_amt, "tmp_cur_tax_amt");
		MAM_CUR_R baseCur = getCurCache().get(getCo().base_cur_cd());
		MAM_CUR_R ptaxCur = getCurCache().get(getCo().ptax_cur_cd());

		for (Purc_Ins01_DtlR dtlR : dtlL) {
			MAM_ITM_R itm = getItmCache().get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (!itm.dscnt_itm_flg()) {
				if (dtlR.inc_tax_flg()) {
					dtlR.trd_cur_amt(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt())
							.subtract(dtlR.getNumber("tmp_cur_tax_amt")));
					if (dtlR.getBooleanNE("outsrc_flg")) {
						if(bpR.repurc_obli_flg()) {
							dtlR.trd_cur_proc_amt(
								dtlR.trd_cur_amt().subtract(
									nvl(dtlR.trd_cur_onr_prov_amt(), MCNumber.ZERO)
								)
							);
						}
						else {
							MCList<MCRow> amtL =
								MSUCL_ConvQtyAmtUtil.calcPropOutSrcUpri(
									dtlR.trd_cur_amt(), hdrR.amt_dec_place(),
									dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
							dtlR.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
							dtlR.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
						}
					}
				}
				dtlR.trd_cur_tax_amt(dtlR.getNumber("tmp_cur_tax_amt"));
			}

			if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
				dtlR.base_cur_tax_amt(dtlR.trd_cur_tax_amt());
			}
			else {
				dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), 
						hdrR.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
			}

			if (!ptaxCur.isEmpty()) {
				dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), 
						hdrR.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		ctrl.amt_calc_flg(true);
	}
	/**
	 * 税金額取得用の上り電文を作成する
	 */
	protected MCList<Purc_Ins01_DtlR> crtGetTaxAmtL(MCList<Purc_Ins01_DtlR> dtlL) {
		// amt は内税・外税関係なく常に税抜金額
		MCList<Purc_Ins01_DtlR> l = dtlL.clone();
		for (Purc_Ins01_DtlR r : l) {
			MAM_ITM_R itm = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (itm.dscnt_itm_flg()) {
				r.addNumberColumn("amt", r.tax_abl_amt().negate());
			}
			else {
				r.addNumberColumn("amt", r.tax_abl_amt());
			}
		}
		return l;
	}
	
	/**
	 * 仕入実績ＮＯ発番の引数を取得する
	 * 
	 * @param row ヘッダ上り電文Row
	 * @return
	 */
	protected ElmArgsR getPurcActNumArgs(Purc_Ins01_HdrR row) {
		ElmArgsR args = ElmArgsR.create();
		args.peg_no(row.peg_no());
		args.dpt_cd(row.purc_dpt_cd());
		args.bp_cd(row.sppl_cd());
		args.co_cd(getCo().co_cd());
		args.wg_cd(row.wg_cd());
		args.dt(row.purc_dt());
		args.trd_cd(row.trd_cd());

		return args;
	}
	
	/**
	 * 仕入実績ＮＯ発番
	 * 
	 * @param up1 上り電文（ヘッダ）
	 * @param argL 発番引数
	 */
	protected void setPurcActNum(MCList<Purc_Ins01_HdrR> up1L, MCList<ElmArgsR> argL) {
		// 仕入実績ＮＯ発番
		setNum(MAC_NUM_BIZ_TYP.PURCACT, argL);
		
		String[] srcCols = new String[]{ElmArgsR.$new_no};
		String[] destCols = new String[]{Purc_Ins01_HdrR.$purc_act_no};
		copyByPegNo(up1L, argL, Purc_Ins01_HdrR.$peg_no, destCols, 
				ElmArgsR.$peg_no, srcCols);

	}
	
	/**
	 * 仕入実績ＮＯ発番
	 * @param row ヘッダ上り電文Row
	 */
	protected void setPurcActNum(Purc_Ins01_HdrR row) {
		ElmArgsR args = getPurcActNumArgs(row);
		
		// 仕入実績ＮＯ発番
		row.purc_act_no(getNum(MAC_NUM_BIZ_TYP.PURCACT, args));
	}
	
	/**
	 * 上り電文(ヘッダ)を上り電文(明細)の税率のグループに合わせて分割する
	 * @param hdrList 上り電文(ヘッダ)
	 * @param dtlList 上り電文(明細)
	 * @param ioList 上り電文(詳細）
	 */
	protected void splitHdr(MCList<Purc_Ins01_HdrR> hdrList, MCList<Purc_Ins01_DtlR> dtlList, MCList<Purc_Ins01_IoR> ioList) {
		
		// 明細のグループ条件(税率で分ける)
		MCGroupByPolicy gpTax = new MCGroupByPolicy(Purc_Ins01_DtlR.$hdr_peg_no, Purc_Ins01_DtlR.$tax_rate);

		gpTax.min(Purc_Ins01_DtlR.$peg_no);
		
		// 分割処理により追加されるヘッダのリスト
		MCList<Purc_Ins01_HdrR> addHdrList = null;
		
		// 分割前のヘッダ紐付NOの最大値を取得
		MCNumber maxHdrPegNo = (MCNumber)hdrList.max(Purc_Ins01_HdrR.$peg_no);
		
		// ヘッダ毎に分割チェック
		for (Purc_Ins01_HdrR hdrRow : hdrList) {
			
			// 仕入税計算区分が「行単位」の場合は、分割しない
			MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
			if (MAC_TAX_CALC_TYP.isLINE(sppl.purc_tax_calc_typ())) {
				continue;
			}
			
			// ヘッダ紐付NOが一致する明細を取得
			MCList<Purc_Ins01_DtlR> dtlL = dtlList.subList(Purc_Ins01_DtlR.$hdr_peg_no, hdrRow.peg_no());
			
			// 取得した明細を、税率でグルーピングする。（グルーピングした結果複数に割れたら、その分ヘッダを追加する。）
			MCList<Purc_Ins01_DtlR> taxGrpList = dtlL.groupBy(gpTax);
			MCIndexKey idxkey = dtlL.createIndex(Purc_Ins01_DtlR.$tax_rate);
			
			// 明細紐付NOの若い順(画面ならば明細昇順になるはず)で並べ替える
			taxGrpList.sort(Purc_Ins01_DtlR.$peg_no);
			
			// 同一ヘッダ内で、税率で明細が分割される場合のみ、処理を行う
			if (taxGrpList.size() > 1) {
				
				// 明細のヘッダ紐付NOを再設定する
				for (int i = 0; i<taxGrpList.size(); i++) {
	
					Purc_Ins01_DtlR cond = taxGrpList.get(i);
					MCList<Purc_Ins01_DtlR> tmpList = dtlL.subList(idxkey, cond.tax_rate());
	
					if (i == 0) {
						// １番目のグループには既存のヘッダ紐付NOを設定する
						tmpList.setValue(Purc_Ins01_DtlR.$hdr_peg_no, hdrRow.peg_no());
						if(isNull(hdrRow.rcpt_iv_no())) {
							hdrRow.split_flg(true);
						}
					}
					else {
						// ヘッダを新規作成
						Purc_Ins01_HdrR addHdrRow = hdrRow.clone();
						maxHdrPegNo = maxHdrPegNo.add(1);
						addHdrRow.peg_no(maxHdrPegNo);
						addHdrRow.setStatus(CREATE);
						addHdrRow.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						if (isNull(addHdrList)) {
							addHdrList = MCList.create(Purc_Ins01_HdrR.class);
						}
						addHdrList.add(addHdrRow);
	
						// ２番目以降のグループには新たに作成したヘッダのヘッダ紐付NOを設定する
						tmpList.setValue(Purc_Ins01_DtlR.$hdr_peg_no, maxHdrPegNo);
						
						// 明細の仕入実績明細NO+SEQ, 明細に紐付く詳細の仕入実績受払NO+SEQをクリアし、新規行として扱う。
						// 後続の更新処理で新たに発番する。
						tmpList.clear(Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq);
						tmpList.setValue(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
						for (Purc_Ins01_DtlR dtlRow : tmpList) {	
							MCList<Purc_Ins01_IoR> tgtIoList = ioList.subList(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no());
							tgtIoList.clear(Purc_Ins01_IoR.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_seq);
							tgtIoList.setValue(Purc_Ins01_IoR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
						}
						
					}
				}
			}
	
		}
		
		// ヘッダが追加された場合は上り電文に追加する
		if (!isNull(addHdrList)) {
			hdrList.addAll(addHdrList);
		}
		
	}
	
	/**
	 * ヘッダが分割された場合のメッセージを作成します。
	 * @param hdrList ヘッダ上り電文リスト
	 */
	protected void setSplitMsg(MCList<Purc_Ins01_HdrR> hdrList) {
		
		MCList<Purc_Ins01_HdrR> splitHdrList = hdrList.subList(Purc_Ins01_HdrR.$split_flg, true);
		if (splitHdrList.size() > 0) {
			for (Purc_Ins01_HdrR hdrRow : hdrList) {
				MCMessage msg = new MCMessage(MSBDL0141, hdrRow.purc_act_no());
				MCMessagePool.add(msg);
			}
			MCMessagePool.add(new MCMessage(MSBDL0140));
		}

	}
	
	/**
	 * インボイス取引で仮単価の場合にメッセージをセット
	 * @param hdrL 上り電文(ヘッダ)
	 * @param dtlL 上り電文(明細)
	 */
	protected void setInterimMsg(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {
		MCIndexKey pegIdx = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
		for (Purc_Ins01_DtlR dtlR : dtlL) {
			if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && dtlR.interim_flg() && !isNull(dtlR.rcpt_iv_d_no()) ) {
				Purc_Ins01_HdrR hdrR = hdrL.getFirst(pegIdx, dtlR.hdr_peg_no());
				if (hdrR.fix_flg() || dtlR.sync_flg()) {
					MCMessagePool.add(new MCMessage(dtlR, null, MSBEL1135, toDispGUIIndex(dtlR)));
				}
			}
		}
	}
	
	/**
	 * Purc_Upd01オペレーション.<p>
	 *
	 * 仕入実績を更新する<br>
	 */
	public class Purc_Upd01 extends MSBDL_PurcActRegService_MC_A.Purc_Upd01 {
		MCList<MST_PURC_ACT_R> _hdrL = MCList.create(MST_PURC_ACT_R.class);
		MCList<MST_PURC_ACT_D_R> _dtlL = MCList.create(MST_PURC_ACT_D_R.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			crtCacheForInsUpd(up1(), up2(), up3());
			
			// 補完処理
			cmplUpParam();

			// 明細上り電文に更新前の仕入実績明細を補完
			copyPurcActSeqNo(up2());
			
			// ヘッダ分割
			splitHdr();
			
			setReCalcNotTgt();
			clearPurcDtlUpdFlg();
			// 明細の金額計算
			if (!up0().purc_dtl_flg()) {
				calcDtlAmt(up0(), up1(), up2());
			}
			
			// 消費税再計算
			calcDtlTaxAmt();
			
			// 取引通貨単価、金額、値引額、税額から基準通貨及び、納税通貨の同項目を補完する
			cmplOtherCurUpriAmtTax(up0(), up1(), up2());
			
			// 明細の金額・税額を詳細に案分
			divideDtlAmtToIo(up1(), up2(), up3());
			
			// 基準通貨・納税通貨換算
			convUpriAmtFrTrdToBasePtax(up0(), up1(), up2(), up3());

			// 上り電文編集
			editUp();

			// 仕入明細訂正時空呼ばれた場合は実行しない
			if (!up0().purc_dtl_flg()) {
				// 入荷予定送信ＩＦサービス（未着(削除)分送信）
				callArrSchdSendIf_Upd01(up2(), up3(), true);
				// 検査予定登録サービス(在庫検査区分の取得)
				callInspSchdService(up1(), up2(), up3());
				// 入荷実績登録サービス
				callArrActService(up1(), up2(), up3(), up0());
			}

			MCJoinKey<MCList<Purc_Ins01_IoR>> dtl2IoKey = 
					up2().join(Purc_Ins01_DtlR.$peg_no, up3(), Purc_Ins01_IoR.$dtl_peg_no);
			MCList<Purc_Ins01_DtlR> outsrcTgtL = getOursrcMfgTgtUp1(up0(), up1(), up2(), up3());

			// 詳細行の項目を、明細に反映
			syncDtlAndIo(up2(), dtl2IoKey);
			
			// 債務区分の設定
			setApTyp(up2());

			// 受領インボイスのリビジョン更新
			updRcptIvRev(up0(), up1());

			// 仕入実績更新
			updPurcAct();
			
			// 受払実績WK作成
			callIoAct_Ins01_for_crt_or_upd(up1(), up2(), up3());
			
			if (!up0().purc_dtl_flg()) {
				// 仕入予定サービス
				callPurcSchd_Upd02(up2());
				// 入荷予定サービス(再入荷予定作成・更新・削除)
				callArrSchd_Upd01(up1(), up2());
				// 入荷予定送信ＩＦサービス（未着(更新)分送信）
				callArrSchdSendIf_Upd01(up2(), up3(), false);
				// 入荷予定サービス（進捗情報の更新）
				callArrSchd_Upd03(up2());
				// 外注製造実績サービス（外注実績自動登録）
				callOutSrcAct_Upd01(up0(), up1(), outsrcTgtL, up3(), dtl2IoKey);
				// ロット情報サービス
				callLotService(outsrcTgtL,up3());
				// 支給実績サービス(登録)実行
				callProvAct_Upd01(up1(), up2(), up3());
			}
			else {
				// 入荷実績登録サービス
				callArrAct4PurcDtl();
			}
			
			// 受払実績作成
			callIoAct_Upd01(up0());
			
			if (!up0().purc_dtl_flg()) {
				// オーダ登録サービス(品目オーダ更新)実行
				callOrd_Upd04(up0(), up2());
				// 受注状況更新サービス(受注状況の更新)
				callSloSts_Upd01(up1(), up2());
			}
			
			// 売上予定サービス実行
			callSlsSchdSrv(up2(), up0());
			// 債務与信更新サービス
			callCredUpd02(_hdrL, _dtlL);

			// 下り電文編集
			editDown();
			
			// 伝票分割メッセージセット
			setSplitMsg(up1());
			
			// 仮単価メッセージセット
			setInterimMsg(up1(), up2());
			
			// EDI検収送信
			callAccptEdi(up1(), up2());
			callApDtlRegServiceUpd01(up1(), up2(), _hdrL);
			callGALink(
				_hdrL.subList(r -> MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())), 
				MAC_DATA_CRUD_TYP.UPD.value()
			);
		}
		
		
		/**
		 * 上り電文を補完する
		 */
		protected void cmplUpParam() {
			
			// ヘッダ上り電文補完
			for (Purc_Ins01_HdrR row : up1()) {
				compHdrCommon(row);
				// 通貨ＣＤ
				row.base_cur_cd(getCo().base_cur_cd());
				row.ptax_cur_cd(getCo().ptax_cur_cd());
				// 為替レートＣＤ
				row.xrate_cd(getCo().purc_xrate_cd());
			}
			
			// 明細上り電文補完
			for (Purc_Ins01_DtlR row : up2()) {
				
				if (!MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
					// 仕入実績明細から手配NO管理区分を補完する
					MST_PURC_ACT_D_R padRow = getBfUpdPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq());
					row.sno1_mng_typ(padRow.sno1_mng_typ());
					row.sno2_mng_typ(padRow.sno2_mng_typ());
					row.sno3_mng_typ(padRow.sno3_mng_typ());
					row.sno4_mng_typ(padRow.sno4_mng_typ());
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
					MST_PURC_ACT_D_R padRow = getBfUpdPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq());
					if (!isNull(padRow)) {
						row.po_d_no(padRow.po_d_no());
						row.trd_unit_cd(padRow.trd_unit_cd());
						row.trd_unit_qty(padRow.trd_unit_qty());
						row.purc_act_no(padRow.purc_act_no());
						row.purc_act_seq(padRow.purc_act_seq());
						row.mfg_inst_no(padRow.mfg_inst_no());
					}
				}
				compDtlCommon(up1(), row, up0());
				
				// 明細と紐付く詳細上り電文を補完
				MCList<Purc_Ins01_IoR> ioL = up3().subList(Purc_Ins01_IoR.$dtl_peg_no, row.peg_no());
				for (Purc_Ins01_IoR ioRow : ioL) {
					
					if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
						MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
						if (!isNull(paiRow)) {
							ioRow.so_qty(paiRow.so_qty());
							// 場所
							ioRow.in_to_loc_cd(paiRow.in_to_loc_cd());
							ioRow.purc_act_d_no(paiRow.purc_act_d_no());
							ioRow.purc_act_d_seq(paiRow.purc_act_d_seq());
						}
						
						if (!row.sync_flg() && !MSC_STK_INSP_TYP.isYET(ioRow.stk_insp_typ()) && !isNull(ioRow.arr_act_no())) {
							MCList<MST_PURC_ACT_IO_R> purcActIoL = getPaiCcByAaNo(ioRow.arr_act_no());
							MCNumber soFinQty = nvl(purcActIoL.sum("so_qty"), MCNumber.ZERO);
							if (!isNull(paiRow) && !isNull(paiRow.so_qty())) {
								soFinQty = soFinQty.subtract(paiRow.so_qty());
							}
							MST_INSP_ACT_R inspActR = getInspActCache(ioRow.arr_act_no());
							if (!isNull(inspActR)) {
								MCNumber soQty = inspActR.getNumber("so_qty");
								if (!soQty.isZero() && soQty.gt(soFinQty)) {
									MCIndexKey purcActIoKey = purcActIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq);
									MST_PURC_ACT_IO_R purcActIoR = purcActIoL.getFirst(purcActIoKey, ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
									if (!isNull(purcActIoR)) {
										purcActIoR.so_qty(MCNumber.ZERO);
									}
								}
							}
						}
					}
					else {
						// 品目情報
						ioRow.itm_cd(row.itm_cd());
						ioRow.itm_sub1(row.itm_sub1());
						ioRow.itm_sub2(row.itm_sub2());
						ioRow.itm_sub3(row.itm_sub3());
						// 計画外なら, 仕入前単位を仕入単位で補完
						if (isNull(row.purc_schd_no())) {
							ioRow.gi_unit_cd(ioRow.trd_unit_cd());
						}
						// 同時計上の場合、仕入前の荷姿単位ＣＤに仕入後の単位ＣＤを設定する
						if (row.sync_flg()) {
							ioRow.gi_unit_cd(ioRow.trd_unit_cd());
						}
						else {
							if (isNull(ioRow.arr_act_no())) {
								// 未着管理の場合も仕入後の単位を指定
								ioRow.gi_wg_cd(ioRow.in_to_loc_wg_cd());
								ioRow.gi_loc_cd(ioRow.in_to_loc_cd());
								ioRow.gi_str_ln_cd(ioRow.str_ln_cd());
								ioRow.gi_unit_cd(ioRow.trd_unit_cd());
							}
						}
						if (MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ())) {
							ioRow.lot_no(MAC_STR.NULL_VAL.value());
							ioRow.sublot_no(MAC_STR.NULL_VAL.value());
						}
						MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
						if (!row.sync_flg() && !MSC_STK_INSP_TYP.isYET(ioRow.stk_insp_typ()) && !isNull(ioRow.arr_act_no())) {
							MCList<MST_PURC_ACT_IO_R> purcActIoL = getPaiCcByAaNo(ioRow.arr_act_no());
							MCNumber soFinQty = nvl(purcActIoL.sum("so_qty"), MCNumber.ZERO);
							if (!isNull(paiRow) && !isNull(paiRow.so_qty())) {
								soFinQty = soFinQty.subtract(paiRow.so_qty());
							}
							MST_INSP_ACT_R inspActR = getInspActCache(ioRow.arr_act_no());
							if (!isNull(inspActR)) {
								MCNumber soQty = inspActR.getNumber("so_qty");
								if (!soQty.isZero() && soQty.gt(soFinQty)) {
									MCIndexKey purcActIoKey = purcActIoL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq);
									MST_PURC_ACT_IO_R purcActIoR = purcActIoL.getFirst(purcActIoKey, ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
									if (ioRow.base_unit_qty().gte(soQty.subtract(soFinQty))) {
										ioRow.so_qty(soQty.subtract(soFinQty));
										if (!isNull(purcActIoR)) {
											purcActIoR.so_qty(ioRow.so_qty());
										}
									}
									else {
										ioRow.so_qty(ioRow.base_unit_qty());
										if (!isNull(purcActIoR)) {
											purcActIoR.so_qty(ioRow.so_qty());
										}
									}
								}
							}
						}
						complIoCommon(row, ioRow);
					}
				}
			}
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			
			// ヘッダ上り電文をソート
			up1().sort(Purc_Ins01_HdrR.$peg_no);

			// 明細上り電文をソート
			up2().sort(Purc_Ins01_DtlR.$hdr_peg_no, Purc_Ins01_DtlR.$disp_seq);
			
			// 実績受払上り電文をソート
			up3().sort(Purc_Ins01_IoR.$dtl_peg_no);
			
			MCIndexKey idxHdrL = up1().createIndex(Purc_Ins01_HdrR.$peg_no);
			MCIndexKey idxIoL = up3().createIndex(Purc_Ins01_IoR.$dtl_peg_no);
			
			// 外注製造実績サービスで購買区分を取得する為のパラメータ
			MCList<OutSrcAct_Sprt02_CndR> paramListForOsaSprt02 = MCList.create(OutSrcAct_Sprt02_CndR.class);

			for (Purc_Ins01_DtlR dtlRow : up2()) {
				Purc_Ins01_HdrR hdrR = up1().getFirst(idxHdrL, dtlRow.hdr_peg_no());
				
				if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					if (isPurcTypDecideInSrvs(dtlRow, up1())) {
						// 購買区分を取得する。外注の場合は外注製造実績サービスで取得する為のパラメータを取得する
						MST_PO_D_R poDCc = getPoDCache().get(dtlRow.po_d_no());
						if (isNull(poDCc)) {
							dtlRow.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
						}
						else {
							if (poDCc.outsrc_flg()) {
								OutSrcAct_Sprt02_CndR paramRowForOsaSprt02 = OutSrcAct_Sprt02_CndR.create();
								copy(paramRowForOsaSprt02, dtlRow, createMap_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR());
								paramListForOsaSprt02.add(paramRowForOsaSprt02);
							}
							else {
								dtlRow.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
							}
						}
					}
					
					// 在庫識別区分を設定する
					MCList<Purc_Ins01_IoR> ioL = up3().subList(idxIoL, dtlRow.peg_no());
					if (dtlRow.accpt_dfct_flg()) {
						ioL.setStringNE(Purc_Ins01_IoR.$stk_id_typ, MSC_STK_ID_TYP.ACCPT_DFCT.value());
					}
					else {
						ioL.setStringNE(Purc_Ins01_IoR.$stk_id_typ, MSC_STK_ID_TYP.COSTK.value());
					}
					
				}
				
				// 与信更新不要
				dtlRow.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, isNotUpdCred(up0(), hdrR, dtlRow));
			}
			
			// 外注製造実績サービスで購買区分を取得する
			if (paramListForOsaSprt02.size() > 0) {
				MSBCL_OutSrcActService.OutSrcAct_Sprt02 ope = MSBCL_OutSrcActService.crtOutSrcAct_Sprt02();
				ope.up0().addAll(paramListForOsaSprt02);
				ope.exec();
				
				String[] destCols = {Purc_Ins01_DtlR.$purc_typ};
				String[] srcCols = {OutSrcAct_Sprt02_RsltR.$purc_typ};
				copyByPegNo(up2(), destCols, ope.down0(), srcCols);
			}

		}
		
		/**
		 * 下り電文を編集する
		 */
		protected void editDown() {
			down0().addAll(up1());
			down1().addAll(up2());
			down2().addAll(up3());
		}
		
		/**
		 * 上り電文(ヘッダ)を上り電文(明細)の税率の単位で分割する
		 */
		protected void splitHdr() {
			
			// 新規追加ヘッダリスト
			MCList<Purc_Ins01_HdrR> addHdrList = MCList.create(Purc_Ins01_HdrR.class);
			// 新規追加明細リスト
			MCList<Purc_Ins01_DtlR> addDtlList = MCList.create(Purc_Ins01_DtlR.class);
			// 新規追加詳細リスト
			MCList<Purc_Ins01_IoR> addIoList = MCList.create(Purc_Ins01_IoR.class);
			
			// 紐付NOの最大値を取得する(新規作成したヘッダに紐付く明細行、詳細行に採番を行うため)
			MCNumber maxHdrPegNo = (MCNumber) up1().max(Purc_Ins01_HdrR.$peg_no);
			MCNumber maxDtlPegNo = (MCNumber) up2().max(Purc_Ins01_DtlR.$peg_no);
			MCNumber maxIoPegNo = (MCNumber) up3().max(Purc_Ins01_IoR.$peg_no);
			
			MCIndexKey up2Key = up2().createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			MCIndexKey up3Key = up3().createIndex(Purc_Ins01_IoR.$dtl_peg_no);
			
			// 税率の異なる明細をまとめて、仕入実績伝票を作成する
			for (Purc_Ins01_HdrR hdrRow : up1()) {
				
				// 仕入税計算区分が「行単位」の場合は、分割しない
				MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
				if (MAC_TAX_CALC_TYP.isLINE(sppl.purc_tax_calc_typ())) {
					continue;
				}
				
				// 明細に複数の税率がない場合は、分割しない
				// 削除行は元の伝票から削除するのみ
				MCList<Purc_Ins01_DtlR> dtlTmpList = up2().subList(up2Key, hdrRow.peg_no());
				MCList<Purc_Ins01_DtlR> dtlList = MCList.create(Purc_Ins01_DtlR.class);
				for (Purc_Ins01_DtlR r : dtlTmpList) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						dtlList.add(r);
					}
				}
				MCList<Purc_Ins01_DtlR> taxGrpList = dtlList.groupBy(Purc_Ins01_DtlR.$tax_rate);
				if (taxGrpList.size() == 1) {
					continue;
				}
				
				if(isNull(hdrRow.rcpt_iv_no())) {
					// 税率違いによりヘッダが分かれることをＦＬＧで示す
					hdrRow.split_flg(true);
				}
				
				// 仕入実績明細NOの一番若い明細の税率を取得
				dtlList.sort(Purc_Ins01_DtlR.$purc_act_d_no);
				Purc_Ins01_DtlR dtlRowFirst = dtlList.get(0);
				MCNumber firstRowTaxRate = dtlRowFirst.tax_rate();

				MCIndexKey idxkey = dtlList.createIndex(Purc_Ins01_DtlR.$tax_rate);

				// 税率の種類分、ヘッダを作成する
				for (Purc_Ins01_DtlR taxGrpRow : taxGrpList) {
					// 更新対象ヘッダに残る税率はスキップ
					if (isSame(taxGrpRow.tax_rate(), firstRowTaxRate)) {
						continue;
					}

					// ヘッダ作成
					Purc_Ins01_HdrR hdrRowCpy = hdrRow.clone();
					maxHdrPegNo = maxHdrPegNo.add(1);
					hdrRowCpy.peg_no(maxHdrPegNo);
					hdrRowCpy.clear(Purc_Ins01_HdrR.$purc_act_no, Purc_Ins01_HdrR.$purc_act_rev, Purc_Ins01_HdrR.$purc_act_seq);
					hdrRowCpy.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					addHdrList.add(hdrRowCpy);

					// 税率が一致する明細をCloneして、紐付けする。
					for (Purc_Ins01_DtlR dtlRow : dtlList.subList(idxkey, taxGrpRow.tax_rate())) {
						// 新規行の場合、別のヘッダに付け替える
						if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())) {
							dtlRow.hdr_peg_no(hdrRowCpy.peg_no());
							dtlRow.clear(Purc_Ins01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq);
							MCList<Purc_Ins01_IoR> ioList = up3().subList(up3Key, dtlRow.peg_no());
							for (Purc_Ins01_IoR ioRow : ioList) {
								ioRow.clear(Purc_Ins01_IoR.$purc_act_d_no, Purc_Ins01_IoR.$purc_act_d_seq, Purc_Ins01_IoR.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_seq);
							}
						}
						else if (!MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
							// 分割前の伝票から明細を削除し、分割後のヘッダに紐づく明細を作成する

							// 分割前
							dtlRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

							// 分割後
							Purc_Ins01_DtlR dtlRowCpy = dtlRow.clone();
							dtlRowCpy.hdr_peg_no(hdrRowCpy.peg_no());
							maxDtlPegNo = maxDtlPegNo.add(1);
							dtlRowCpy.peg_no(maxDtlPegNo);
							dtlRowCpy.clear(Purc_Ins01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq);
							dtlRowCpy.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							addDtlList.add(dtlRowCpy);

							// 旧明細紐付NOに紐付く詳細行をコピーする
							MCList<Purc_Ins01_IoR> oldIoList = up3().subList(up3Key, dtlRow.peg_no());
							for (Purc_Ins01_IoR ioRow : oldIoList) {
								if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {
									ioRow.dtl_peg_no(maxDtlPegNo);
									ioRow.clear(Purc_Ins01_IoR.$purc_act_d_no, Purc_Ins01_IoR.$purc_act_d_seq, Purc_Ins01_IoR.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_seq);
								}
								else if (!MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
									// 分割前
									ioRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

									// 分割後
									Purc_Ins01_IoR ioRowCpy = ioRow.clone();
									maxIoPegNo = maxIoPegNo.add(1);
									ioRowCpy.peg_no(maxIoPegNo);
									// 新・明細紐付NOをセット
									ioRowCpy.dtl_peg_no(maxDtlPegNo);
									ioRowCpy.clear(Purc_Ins01_IoR.$purc_act_d_no, Purc_Ins01_IoR.$purc_act_d_seq, Purc_Ins01_IoR.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_seq);
									ioRowCpy.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									addIoList.add(ioRowCpy);
								}
							}
						}
					}
				}
			}
			
			// 上り電文に追加作成分の仕入実績伝票を追加
			if (addHdrList.size() > 0) {
				up1().addAll(addHdrList);
				up2().addAll(addDtlList);
				up3().addAll(addIoList);
			}
			
		}
		
		/**
		 * 明細上り電文の内、金額再計算の対象外とする電文に再計算対象外ＦＬＧをtrueに設定します。<br>
		 * 登録されている仕入実績明細と明細上り電文の金額関連項目に差異がなければ再計算対象外とします<br>
		 */
		protected void setReCalcNotTgt() {
			MCIndexKey idxkey = up1().createIndex(Purc_Ins01_HdrR.$peg_no);
			for (Purc_Ins01_DtlR dtlR : up2()) {
				Purc_Ins01_HdrR hdrR = up1().getFirst(idxkey, dtlR.hdr_peg_no());
				MST_PURC_ACT_R purcActR = getPurcActCache().get(hdrR.purc_act_no(), hdrR.purc_act_seq());
				MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(dtlR.purc_act_d_no(), dtlR.purc_act_d_seq());
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						|| isAmtColChanged(hdrR, purcActR, dtlR, purcActDR)) {
					dtlR.re_calc_not_tgt_flg(true);
				}
			}
		}
		
		protected boolean isAmtColChanged(Purc_Ins01_HdrR hdrR, MST_PURC_ACT_R purcActR,
				Purc_Ins01_DtlR dtlR, MST_PURC_ACT_D_R purcActDR) {
			MAM_TAX_R taxRow = getTaxCache().get(purcActDR.tax_cd());
			
			if (isSame(dtlR.trd_cur_upri(), purcActDR.trd_cur_upri())
					&& isSame(dtlR.trd_cur_amt(), purcActDR.trd_cur_amt())
					&& isSame(dtlR.trd_cur_tax_amt(), purcActDR.trd_cur_tax_amt())
					&& isSame(dtlR.trd_cur_proc_upri(), purcActDR.trd_cur_proc_upri())
					&& isSame(dtlR.trd_unit_cd(), purcActDR.trd_unit_cd())
					&& isSame(dtlR.trd_unit_qty(), purcActDR.trd_unit_qty())
					&& isSame(hdrR.xrate(), purcActR.xrate())
					&& isSame(dtlR.tax_rate(), taxRow.tax_rate())
					&& isSame(dtlR.inc_tax_flg(), taxRow.inc_tax_flg())) {
				return true;
			}
			return false;
		}
		
		protected void clearPurcDtlUpdFlg() {
			for (Purc_Ins01_DtlR dtlR : up2()) {
				MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(dtlR.purc_act_d_no(), dtlR.purc_act_d_seq());
				if (!up0().purc_dtl_flg() && dtlR.purc_dtl_upd_flg()) {
					if (!isSame(dtlR.trd_unit_cd(), purcActDR.trd_unit_cd())
							|| !isSame(dtlR.trd_cur_upri(), purcActDR.trd_cur_upri())) {
						dtlR.purc_dtl_upd_flg(false);
					}
				}
			}
		}
		
		/**
		 * 明細行の消費税を再計算する
		 */
		protected void calcDtlTaxAmt() {
			MCIndexKey ik = up2().createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
			for (Purc_Ins01_HdrR r : up1()) {
				if (MAC_TAX_CALC_TYP.isSLIP(r.purc_tax_calc_typ())) {
					if (getSpplCache().get(r.sppl_cd()).sppl_iv_flg()) {
						MCList<Purc_Ins01_DtlR> dtlL = up2().subList(ik, r.peg_no());
						if (isDscnt(r.trd_ptn_typ()) || isRtn(r.trd_ptn_typ())) {
							if (isCalledSlsRet(up0())) {
								setRepurcObliTaxAmt(up0(), r, dtlL);
							}
							callAmtUtilCalc01(r, dtlL);
						}
						else if (!dtlL.get(0).temp_ap_flg() && !isNullOrNullVal(r.rcpt_iv_mng_no())) {
							// 受領インボイス登録済みは再計算しない
						}
						else {
							setRepurcObliTaxAmt(up0(), r, dtlL);
						}
					}
					else {
						// 明細行の金額再計算対象外FLGが全てONの場合、単価、金額、税額の変更なしとみなし、消費税再計算は行わない
						if (isReCalcNotTgt(r)) {
							continue;
						}
						
						// 再計算対象は「新規」または「更新」の明細行のみ。
						MCList<Purc_Ins01_DtlR> crtL = up2().subList(ik, r.peg_no())
								.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
						MCList<Purc_Ins01_DtlR> updL = up2().subList(ik, r.peg_no())
								.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
						MCList<Purc_Ins01_DtlR> crdUpdL = MCList.create(Purc_Ins01_DtlR.class);
						crdUpdL.addAll(crtL);
						crdUpdL.addAll(updL);
						
						setRepurcObliTaxAmt(up0(), r, crdUpdL);
						calcTaxAmt(up0(), r, crdUpdL);
					}
				}
				else if(MAC_TAX_CALC_TYP.isLINE(r.purc_tax_calc_typ())){
					MCList<Purc_Ins01_DtlR> dtlL = up2().subList(ik, r.peg_no());
					setRepurcObliTaxAmt(up0(), r, dtlL);
				}
			}
		}
		
		/**
		 * ヘッダ上り電文に紐付く明細上り電文が全て金額計算対象外か調べます。<br>
		 * @param hR ヘッダ上り電文
		 * @return 明細全行が対象外かつ削除のデータが含まれない場合にtrueを返します。<br>１行でも再計算対象または削除のデータが含まれる場合はfalseを返します。
		 */
		protected boolean isReCalcNotTgt(Purc_Ins01_HdrR hR) {
			
			for (Purc_Ins01_DtlR dR : up2().subList(Purc_Ins01_DtlR.$hdr_peg_no, hR.peg_no())) {
				if (!dR.re_calc_not_tgt_flg() || MAC_DATA_CRUD_TYP.isDEL(dR.data_crud_typ())) {
					return false;
				}
			}
			
			return true;
		}
		
		/**
		 * 仕入実績更新
		 */
		protected void updPurcAct() {
			
			// ヘッダ上り電文の仕入実績NO,連番に対応する仕入実績ヘッダを取得
			MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_ACT_S09", paL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), up1());

			// 取得した仕入実績ヘッダに紐付く、実績明細を取得する
			MCList<MST_PURC_ACT_D_R> padL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R padL_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(padL_t);
			padL_bldr.addWhereWithAnd(padL_t.purc_act_no.eq(bind("purc_act_no"))
					.and(padL_t.purc_act_seq.eq(bind("purc_act_seq"))));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S09", padL, padL_bldr, paL);
			
			// 取得した実績明細に紐付く、実績受払を取得する
			MCList<MST_PURC_ACT_IO_R> paiL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R paiL_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paiL_bldr = MCQueryApiBuilder.create(paiL_t);
			paiL_bldr.addWhereWithAnd(paiL_t.purc_act_d_no.eq(bind("purc_act_d_no"))
					.and(paiL_t.purc_act_d_seq.eq(bind("purc_act_d_seq"))));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S06", paiL, paiL_bldr, padL);

			// 既存の仕入実績ヘッダを無効伝票に更新する為のDBコンテナを作成する
			MCList<MST_PURC_ACT_R> ivdPaL = paL.clone();
			ivdPaL.setString(MST_PURC_ACT_R.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
			
			// 取消伝票作成
			MCList<MST_PURC_ACT_R> canPaL = paL.clone();
			MCList<MST_PURC_ACT_D_R> canPadL = padL.clone();
			MCList<MST_PURC_ACT_IO_R> canPaiL = paiL.clone();
			setValForCan(canPaL, canPadL, canPaiL, up1(), up0(), up2());

			// 新規伝票作成
			MCList<MST_PURC_ACT_R> crtPaL = paL.clone();
			MCList<MST_PURC_ACT_D_R> crtPadL = padL.clone();
			MCList<MST_PURC_ACT_IO_R> crtPaiL = paiL.clone();
			setValForCrt(crtPaL, crtPadL, crtPaiL);
			
			// 伝票分割分の伝票新規作成
			crtPurcActBySplit(crtPaL, crtPadL, crtPaiL);
			
			// 既存の仕入実績ヘッダを「無効」に更新
			MST_PURC_ACT_R ivdPaL_t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder ivdPaL_bldr = MCQueryApiBuilder.create(ivdPaL_t);
			ivdPaL_bldr.setSet(ivdPaL_t.slip_sts_typ);
			dbUpdateKey("MSBDL5180_MST_PURC_ACT_U01", ivdPaL, ivdPaL_bldr);
			
			// 既存の仕入実績ヘッダの「取消」を作成
			dbInsert("MSBDL5180_MST_PURC_ACT_I02", canPaL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_D_I02", canPadL,
					MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_IO_I02", canPaiL,
					MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")));

			// 「新規」伝票を作成
			dbInsert("MSBDL5180_MST_PURC_ACT_I03", crtPaL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_D_I03", crtPadL,
					MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_IO_I03", crtPaiL,
					MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")));

			_hdrL.addAll(crtPaL);
			_hdrL.addAll(canPaL);
			_dtlL.addAll(canPadL);
			_dtlL.addAll(crtPadL);
		}
		
		/**
		 * 連携したDBコンテナに、仕入実績伝票を新規作成するための値を設定する
		 * @param paL 仕入実績ヘッダのDBコンテナ
		 * @param padL 仕入実績明細のDBコンテナ
		 * @param paiL 仕入実績受払のDBコンテナ
		 */
		protected void setValForCrt(MCList<MST_PURC_ACT_R> paL, MCList<MST_PURC_ACT_D_R> padL, MCList<MST_PURC_ACT_IO_R> paiL) {

			MCList<MST_PURC_ACT_R> crtPaL = MCList.create(MST_PURC_ACT_R.class);
			MCList<MST_PURC_ACT_D_R> crtPadL = MCList.create(MST_PURC_ACT_D_R.class);
			MCList<MST_PURC_ACT_IO_R> crtPaiL = MCList.create(MST_PURC_ACT_IO_R.class);
			
			for (Purc_Ins01_HdrR hdrUpParamR : up1()) {
				
				// 伝票分割処理で新たに作成されたヘッダ上り電文はスキップする
				if (MAC_DATA_CRUD_TYP.isCRT(hdrUpParamR.data_crud_typ())) {
					continue;
				}
				
				// 登録されている仕入実績ヘッダを取得
				String[] hdrKey = {MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq};
				Comparable<?>[] hdrVal = {hdrUpParamR.purc_act_no(), hdrUpParamR.purc_act_seq()};
				MST_PURC_ACT_R paRow = paL.getFirst(hdrKey, hdrVal);

				// ヘッダ上り電文の連番を2進める
				hdrUpParamR.purc_act_seq(hdrUpParamR.purc_act_seq().add(2));
				// ヘッダ上り電文の改訂番号を１進める
				hdrUpParamR.purc_act_rev(paRow.purc_act_rev().add(1));
				// 上り電文の内容を反映する
				copy(paRow, hdrUpParamR, createMap_MST_PURC_ACT_R_Purc_Ins01_HdrR());
				// 伝票状況を「新規」で作成
				paRow.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				paRow.purc_ret_act_rev(hdrUpParamR.purc_ret_act_rev());
				
				// 新規伝票対象に追加
				crtPaL.add(paRow);
				
				// 明細上り電文取得
				MCList<Purc_Ins01_DtlR> dtlUpParamList = up2().subList(Purc_Ins01_DtlR.$hdr_peg_no, hdrUpParamR.peg_no());
				
				// 仕入実績明細NO発番用の番号をキャッシュ
				int cacheSize = 0;
				cacheSize = dtlUpParamList.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
				doSeqCache(MSC_NUM_SYS_TYP.PURCACTD, cacheSize);

				for (Purc_Ins01_DtlR dtlUpParamRow : dtlUpParamList) {
					
					MST_PURC_ACT_D_R padRow = MST_PURC_ACT_D_R.create();
					
					// データ更新区分「削除」の電文は対象外
					if (MAC_DATA_CRUD_TYP.isCRT(dtlUpParamRow.data_crud_typ())) {
						
						// 仕入実績明細NO,連番を発番
						dtlUpParamRow.purc_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTD));
						dtlUpParamRow.purc_act_d_seq(1);
						// ヘッダNO,連番をセット
						dtlUpParamRow.purc_act_no(paRow.purc_act_no());
						dtlUpParamRow.purc_act_seq(paRow.purc_act_seq());
						// 明細上り電文を、登録用DBコンテナRowにコピー
						padRow = MST_PURC_ACT_D_R.create();
						copy(padRow, dtlUpParamRow, createMap_MST_PURC_ACT_D_R_Purc_Ins01_DtlR());

					}
					else if (MAC_DATA_CRUD_TYP.isUPD(dtlUpParamRow.data_crud_typ())) {
						
						// 登録されている仕入実績明細を取得
						String[] dtlKey = {MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq};
						Comparable<?>[] dtlVal = {dtlUpParamRow.purc_act_d_no(), dtlUpParamRow.purc_act_d_seq()};
						padRow = padL.getFirst(dtlKey, dtlVal);
						
						// 上り電文の仕入実績明細の連番を2進める
						dtlUpParamRow.purc_act_d_seq(dtlUpParamRow.purc_act_d_seq().add(2));
						// ヘッダNO,連番をセット
						dtlUpParamRow.purc_act_no(paRow.purc_act_no());
						dtlUpParamRow.purc_act_seq(paRow.purc_act_seq());
						// 暫定買掛の場合は同時計上オン固定になるため登録済データの同時計上で登録
						if (dtlUpParamRow.temp_ap_flg()) {
							dtlUpParamRow.sync_flg(dtlUpParamRow.arr_sync_flg());
						}

						// 明細上り電文を、登録用DBコンテナRowにコピー
						copy(padRow, dtlUpParamRow, createMap_MST_PURC_ACT_D_R_Purc_Ins01_DtlR());

					}
					else {
						continue;
					}
					
					crtPadL.add(padRow);
					if (hdrUpParamR.split_flg()) {
						padRow.addBooleanColumn("split_flg", true);
					}
					
					// 詳細上り電文取得
					MCList<Purc_Ins01_IoR> ioUpParamList = up3().subList(Purc_Ins01_IoR.$dtl_peg_no, dtlUpParamRow.peg_no());
					// 仕入実績受払NO発番用の番号をキャッシュ
					cacheSize = ioUpParamList.subList(Purc_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
					doSeqCache(MSC_NUM_SYS_TYP.PURCACTIO, cacheSize);

					for (Purc_Ins01_IoR ioUpParamRow : ioUpParamList) {
						
						MST_PURC_ACT_IO_R paiRow = null;
						
						// 新規または更新時
						if (MAC_DATA_CRUD_TYP.isCRT(ioUpParamRow.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isUPD(ioUpParamRow.data_crud_typ())) {
							// 在庫識別区分
							if (dtlUpParamRow.accpt_dfct_flg()) {
								ioUpParamRow.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());
							}
							else {
								ioUpParamRow.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							}							
							// 明細NO,連番をセット
							ioUpParamRow.purc_act_d_no(padRow.purc_act_d_no());
							ioUpParamRow.purc_act_d_seq(padRow.purc_act_d_seq());
						}
						
						
						// データ更新区分「削除」の電文は対象外
						if (MAC_DATA_CRUD_TYP.isCRT(ioUpParamRow.data_crud_typ())) {
							
							// 仕入実績受払NO,連番を発番
							ioUpParamRow.purc_act_io_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTIO));
							ioUpParamRow.purc_act_io_seq(1);
							
							// 詳細上り電文を登録用DBコンテナにコピー
							paiRow = MST_PURC_ACT_IO_R.create();
							copy(paiRow, ioUpParamRow, createMap_fr_up3_to_pai_for_upd());
							
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(ioUpParamRow.data_crud_typ())) {
							
							// 登録されている仕入実績受払を取得
							String[] ioKey = {MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq};
							Comparable<?>[] ioVal = {ioUpParamRow.purc_act_io_no(), ioUpParamRow.purc_act_io_seq()};
							paiRow = paiL.getFirst(ioKey, ioVal);
							
							// 上り電文の仕入実績明細の連番を2進める
							ioUpParamRow.purc_act_io_seq(ioUpParamRow.purc_act_io_seq().add(2));

							// 詳細上り電文を登録用DBコンテナにコピー
							copy(paiRow, ioUpParamRow, createMap_fr_up3_to_pai_for_upd());
						}
						else {
							continue;
						}
						
						crtPaiL.add(paiRow);
						
					}
				}
			}
			
			for (MCList<MST_PURC_ACT_D_R> dtlL : crtPadL.groupList(MST_PURC_ACT_D_R.$purc_act_no)) {
				boolean isSplit = dtlL.stream()
						.anyMatch(detail -> detail.getBooleanNE("split_flg"));
				if (isSplit) {
					setDispSeqOrder(dtlL);
					continue;
				}
				boolean hasPatched = dtlL.stream()
						.anyMatch(detail -> detail.getGUIIndex() == -1);
				if (hasPatched) {
					continue;
				}
				setDispSeq(dtlL);
			}

			paL.setAll(crtPaL);
			padL.setAll(crtPadL);
			paiL.setAll(crtPaiL);
			
		}

		protected void setDispSeqOrder(MCList<MST_PURC_ACT_D_R> l) {
			l.sort(MST_PURC_ACT_D_R.$disp_seq);
			int disp_seq_cntr = 1;
			for (int i = 0; i < l.size(); i++) {
				MST_PURC_ACT_D_R r = l.get(i);
				if (r.isStatusCreate() || r.isStatusModify()) {
					r.disp_seq(disp_seq_cntr++);
				}
				else if (r.isStatusNone()) {
					if (!isSame(r.disp_seq(), new MCNumber(disp_seq_cntr))) {
						r.setStatus(MCRow.MODIFY);
					}
					r.disp_seq(disp_seq_cntr++);
				}
				else {
					r.disp_seq(null);
				}
			}
		}
		/**
		 * 伝票分割により発生したヘッダ上り電文分の仕入実績登録用電文を作成します。
		 * @param paL 仕入実績ヘッダのDBコンテナ
		 * @param padL 仕入実績明細のDBコンテナ
		 * @param paiL 仕入実績受払のDBコンテナ
		 */
		protected void crtPurcActBySplit(MCList<MST_PURC_ACT_R> paL, MCList<MST_PURC_ACT_D_R> padL, MCList<MST_PURC_ACT_IO_R> paiL) {

			MCList<MST_PURC_ACT_R> crtPaL = MCList.create(MST_PURC_ACT_R.class);
			MCList<MST_PURC_ACT_D_R> crtPadL = MCList.create(MST_PURC_ACT_D_R.class);
			MCList<MST_PURC_ACT_IO_R> crtPaiL = MCList.create(MST_PURC_ACT_IO_R.class);
			
			for (Purc_Ins01_HdrR hdrRow : up1()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrRow.data_crud_typ())) {
					continue;
				}
				
				MST_PURC_ACT_R paH = MST_PURC_ACT_R.create();
				
				// 仕入実績NO,SEQ,REV セット
				setPurcActNum(hdrRow);
				hdrRow.purc_act_seq(1);
				hdrRow.purc_act_rev(1);
				
				// 上り電文の内容を反映する
				copy(paH, hdrRow, createMap_MST_PURC_ACT_R_Purc_Ins01_HdrR());
				// 伝票状況を「新規」で作成
				paH.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				// 取引CD, 取引区分
				paH.trd_cd(hdrRow.trd_cd());
				paH.trd_ptn_typ(hdrRow.trd_ptn_typ());
				
				// 仕入実績ヘッダ登録用電文に追加
				crtPaL.add(paH);
				
				MCList<Purc_Ins01_DtlR> dtlList = up2().subList(Purc_Ins01_DtlR.$hdr_peg_no, hdrRow.peg_no());
				int cacheSize = dtlList.size();
				doSeqCache(MSC_NUM_SYS_TYP.PURCACTD, cacheSize);
				
				for (Purc_Ins01_DtlR dtlRow : dtlList) {
					
					MST_PURC_ACT_D_R paD = MST_PURC_ACT_D_R.create();
					dtlRow.purc_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTD));
					dtlRow.purc_act_d_seq(1);
					dtlRow.purc_act_no(hdrRow.purc_act_no());
					dtlRow.purc_act_seq(hdrRow.purc_act_seq());
					copy(paD, dtlRow, createMap_MST_PURC_ACT_D_R_Purc_Ins01_DtlR());
					// 仕入実績明細登録用の電文に追加
					crtPadL.add(paD);
					
					MCList<Purc_Ins01_IoR> ioList = up3().subList(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no());
					cacheSize = ioList.size();
					doSeqCache(MSC_NUM_SYS_TYP.PURCACTIO, cacheSize);
					
					for (Purc_Ins01_IoR ioRow : ioList) {
						
						MST_PURC_ACT_IO_R paIo = MST_PURC_ACT_IO_R.create();
						ioRow.purc_act_io_no(getStrSeq(MSC_NUM_SYS_TYP.PURCACTIO));
						ioRow.purc_act_io_seq(1);
						ioRow.purc_act_d_no(dtlRow.purc_act_d_no());
						ioRow.purc_act_d_seq(dtlRow.purc_act_d_seq());
						copy(paIo, ioRow, createMap_fr_up3_to_pai_for_upd());
						
						// 仕入実績受払登録用の電文に追加
						crtPaiL.add(paIo);
						
					}
					
				}
				
			}
			
			// 表示順設定
			for (MCList<MST_PURC_ACT_D_R> l :crtPadL.groupList(MST_PURC_ACT_D_R.$purc_act_no)) {
				setDispSeq(l);
			}
			
			paL.addAll(crtPaL);
			padL.addAll(crtPadL);
			paiL.addAll(crtPaiL);

			
		}
		
		// 更新処理時、ヘッダ上り電文から仕入実績ヘッダのDBコンテナへのコピー定義 
		protected Map_MST_PURC_ACT_R_Purc_Ins01_HdrR<MST_PURC_ACT_R,Purc_Ins01_HdrR> createMap_MST_PURC_ACT_R_Purc_Ins01_HdrR() {
			if (_Map_MST_PURC_ACT_R_Purc_Ins01_HdrR == null) {
				_Map_MST_PURC_ACT_R_Purc_Ins01_HdrR = new Map_MST_PURC_ACT_R_Purc_Ins01_HdrR<MST_PURC_ACT_R, Purc_Ins01_HdrR>();
			}
			return _Map_MST_PURC_ACT_R_Purc_Ins01_HdrR;
		}
		protected Map_MST_PURC_ACT_R_Purc_Ins01_HdrR<MST_PURC_ACT_R, Purc_Ins01_HdrR> _Map_MST_PURC_ACT_R_Purc_Ins01_HdrR = null;
		public class Map_MST_PURC_ACT_R_Purc_Ins01_HdrR<D extends MST_PURC_ACT_R, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_ACT_R.$purc_act_no, Purc_Ins01_HdrR.$purc_act_no);
				addColumnPathMap(MST_PURC_ACT_R.$purc_act_seq, Purc_Ins01_HdrR.$purc_act_seq);
				addColumnPathMap(MST_PURC_ACT_R.$purc_act_rev, Purc_Ins01_HdrR.$purc_act_rev);
				addColumnPathMap(MST_PURC_ACT_R.$po_no, Purc_Ins01_HdrR.$po_no);
				addColumnPathMap(MST_PURC_ACT_R.$purc_dpt_cd, Purc_Ins01_HdrR.$purc_dpt_cd);
				addColumnPathMap(MST_PURC_ACT_R.$wg_cd, Purc_Ins01_HdrR.$wg_cd);
				addColumnPathMap(MST_PURC_ACT_R.$purc_usr_cd, Purc_Ins01_HdrR.$purc_usr_cd);
				addColumnPathMap(MST_PURC_ACT_R.$sppl_cd, Purc_Ins01_HdrR.$sppl_cd);
				addColumnPathMap(MST_PURC_ACT_R.$asppl_cd, Purc_Ins01_HdrR.$asppl_cd);
				addColumnPathMap(MST_PURC_ACT_R.$bsppl_cd, Purc_Ins01_HdrR.$bsppl_cd);
				addColumnPathMap(MST_PURC_ACT_R.$psppl_cd, Purc_Ins01_HdrR.$psppl_cd);
				addColumnPathMap(MST_PURC_ACT_R.$cred_cd, Purc_Ins01_HdrR.$cred_cd);
				addColumnPathMap(MST_PURC_ACT_R.$trd_cur_cd, Purc_Ins01_HdrR.$trd_cur_cd);
				addColumnPathMap(MST_PURC_ACT_R.$ptax_cur_cd, Purc_Ins01_HdrR.$ptax_cur_cd);
				addColumnPathMap(MST_PURC_ACT_R.$base_cur_cd, Purc_Ins01_HdrR.$base_cur_cd);
				addColumnPathMap(MST_PURC_ACT_R.$xrate_cd, Purc_Ins01_HdrR.$xrate_cd);
				addColumnPathMap(MST_PURC_ACT_R.$xrate, Purc_Ins01_HdrR.$xrate);
				addColumnPathMap(MST_PURC_ACT_R.$ptax_xrate, Purc_Ins01_HdrR.$ptax_xrate);
				addColumnPathMap(MST_PURC_ACT_R.$purc_dt, Purc_Ins01_HdrR.$purc_dt);
				addColumnPathMap(MST_PURC_ACT_R.$ac_dt, Purc_Ins01_HdrR.$ac_dt);
				addColumnPathMap(MST_PURC_ACT_R.$pay_basis_dt, Purc_Ins01_HdrR.$pay_basis_dt);
				addColumnPathMap(MST_PURC_ACT_R.$pay_schd_dt, Purc_Ins01_HdrR.$pay_schd_dt);
				addColumnPathMap(MST_PURC_ACT_R.$ptax_dt, Purc_Ins01_HdrR.$ptax_dt);
				addColumnPathMap(MST_PURC_ACT_R.$rcpt_iv_no, Purc_Ins01_HdrR.$rcpt_iv_no);
				addColumnPathMap(MST_PURC_ACT_R.$rcpt_iv_mng_no, Purc_Ins01_HdrR.$rcpt_iv_mng_no);
				addColumnPathMap(MST_PURC_ACT_R.$rcpt_iv_rev, Purc_Ins01_HdrR.$rcpt_iv_rev);
				addColumnPathMap(MST_PURC_ACT_R.$ref_rcpt_iv_no, Purc_Ins01_HdrR.$ref_rcpt_iv_no);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_cd1, Purc_Ins01_HdrR.$tterm_cd1);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_rmrks1, Purc_Ins01_HdrR.$tterm_rmrks1);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_cd2, Purc_Ins01_HdrR.$tterm_cd2);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_rmrks2, Purc_Ins01_HdrR.$tterm_rmrks2);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_cd3, Purc_Ins01_HdrR.$tterm_cd3);
				addColumnPathMap(MST_PURC_ACT_R.$tterm_rmrks3, Purc_Ins01_HdrR.$tterm_rmrks3);
				addColumnPathMap(MST_PURC_ACT_R.$trd_rmrks, Purc_Ins01_HdrR.$trd_rmrks);
				addColumnPathMap(MST_PURC_ACT_R.$intr_rmrks, Purc_Ins01_HdrR.$intr_rmrks);
				addColumnPathMap(MST_PURC_ACT_R.$sub_char1, Purc_Ins01_HdrR.$sub_char1);
				addColumnPathMap(MST_PURC_ACT_R.$sub_char2, Purc_Ins01_HdrR.$sub_char2);
				addColumnPathMap(MST_PURC_ACT_R.$sub_char3, Purc_Ins01_HdrR.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ac_ym(getAcYm(src.ac_dt())); 
			}
			
		}
		
		// 更新処理時、明細上り電文から仕入実績明細のDBコンテナへのコピー定義 
		protected Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR<MST_PURC_ACT_D_R,Purc_Ins01_DtlR> createMap_MST_PURC_ACT_D_R_Purc_Ins01_DtlR() {
			if (_Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR == null) {
				_Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR = new Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR<MST_PURC_ACT_D_R, Purc_Ins01_DtlR>();
			}
			return _Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR;
		}
		protected Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR<MST_PURC_ACT_D_R, Purc_Ins01_DtlR> _Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR = null;
		public class Map_MST_PURC_ACT_D_R_Purc_Ins01_DtlR<D extends MST_PURC_ACT_D_R, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_seq);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_id_typ, Purc_Ins01_DtlR.$purc_id_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_schd_no, Purc_Ins01_DtlR.$purc_schd_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_src_typ, Purc_Ins01_DtlR.$purc_src_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_src_no, Purc_Ins01_DtlR.$purc_src_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$sync_flg, Purc_Ins01_DtlR.$sync_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$po_d_no, Purc_Ins01_DtlR.$po_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$rcpt_iv_d_no, Purc_Ins01_DtlR.$rcpt_iv_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_ret_act_d_no, Purc_Ins01_DtlR.$purc_ret_act_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$itm_cd, Purc_Ins01_DtlR.$itm_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$itm_sub1, Purc_Ins01_DtlR.$itm_sub1);
				addColumnPathMap(MST_PURC_ACT_D_R.$itm_sub2, Purc_Ins01_DtlR.$itm_sub2);
				addColumnPathMap(MST_PURC_ACT_D_R.$itm_sub3, Purc_Ins01_DtlR.$itm_sub3);
				addColumnPathMap(MST_PURC_ACT_D_R.$itm_nm, Purc_Ins01_DtlR.$itm_nm);
				addColumnPathMap(MST_PURC_ACT_D_R.$iv_itm_nm, Purc_Ins01_DtlR.$iv_itm_nm);
				addColumnPathMap(MST_PURC_ACT_D_R.$ap_typ, Purc_Ins01_DtlR.$ap_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_typ, Purc_Ins01_DtlR.$purc_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$rsn_cd, Purc_Ins01_DtlR.$rsn_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$sundry_itm_flg, Purc_Ins01_DtlR.$sundry_itm_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$sppl_itm_cd, Purc_Ins01_DtlR.$sppl_itm_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$sppl_itm_nm, Purc_Ins01_DtlR.$sppl_itm_nm);
				addColumnPathMap(MST_PURC_ACT_D_R.$ver_no, Purc_Ins01_DtlR.$ver_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno1, Purc_Ins01_DtlR.$sno1);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno2, Purc_Ins01_DtlR.$sno2);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno3, Purc_Ins01_DtlR.$sno3);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno4, Purc_Ins01_DtlR.$sno4);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno1_mng_typ, Purc_Ins01_DtlR.$sno1_mng_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno2_mng_typ, Purc_Ins01_DtlR.$sno2_mng_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno3_mng_typ, Purc_Ins01_DtlR.$sno3_mng_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$sno4_mng_typ, Purc_Ins01_DtlR.$sno4_mng_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$in_to_loc_cd, Purc_Ins01_DtlR.$in_to_loc_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$in_to_loc_wg_cd, Purc_Ins01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$str_ln_cd, Purc_Ins01_DtlR.$str_ln_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$gd_cd, Purc_Ins01_DtlR.$gd_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$quality_typ, Purc_Ins01_DtlR.$quality_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$stk_insp_typ, Purc_Ins01_DtlR.$stk_insp_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$stk_id_typ, Purc_Ins01_DtlR.$stk_id_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$lot_no, Purc_Ins01_DtlR.$lot_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$sublot_no, Purc_Ins01_DtlR.$sublot_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bp_lot_no, Purc_Ins01_DtlR.$bp_lot_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_unit_cd, Purc_Ins01_DtlR.$base_unit_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_unit_qty, Purc_Ins01_DtlR.$base_unit_qty);
				addColumnPathMap(MST_PURC_ACT_D_R.$upri_not_tgt_flg, Purc_Ins01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$purc_dtl_upd_flg, Purc_Ins01_DtlR.$purc_dtl_upd_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$interim_flg, Purc_Ins01_DtlR.$interim_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$temp_ap_flg, Purc_Ins01_DtlR.$temp_ap_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$tax_cd, Purc_Ins01_DtlR.$tax_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_upri, Purc_Ins01_DtlR.$trd_cur_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_upri, Purc_Ins01_DtlR.$base_cur_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_proc_upri, Purc_Ins01_DtlR.$base_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_onr_prov_upri, Purc_Ins01_DtlR.$base_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_dscnt_amt, Purc_Ins01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_onr_prov_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_cur_tax_amt, Purc_Ins01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_upri, Purc_Ins01_DtlR.$ptax_cur_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_proc_upri, Purc_Ins01_DtlR.$ptax_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri, Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt, Purc_Ins01_DtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_proc_amt, Purc_Ins01_DtlR.$ptax_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt, Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_amt, Purc_Ins01_DtlR.$ptax_cur_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$ptax_cur_tax_amt, Purc_Ins01_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$dscnt_rsn_cd, Purc_Ins01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$wtax_rate, Purc_Ins01_DtlR.$wtax_rate);
				addColumnPathMap(MST_PURC_ACT_D_R.$wtax_amt, Purc_Ins01_DtlR.$wtax_amt);
				addColumnPathMap(MST_PURC_ACT_D_R.$maker_cd, Purc_Ins01_DtlR.$maker_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$ap_dpt_cd, Purc_Ins01_DtlR.$ap_dpt_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$pay_crryovr_times, Purc_Ins01_DtlR.$pay_crryovr_times);
				addColumnPathMap(MST_PURC_ACT_D_R.$ncv_flg, Purc_Ins01_DtlR.$ncv_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$stk_mng_typ, Purc_Ins01_DtlR.$stk_mng_typ);
				addColumnPathMap(MST_PURC_ACT_D_R.$edi_flg, Purc_Ins01_DtlR.$edi_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$accpt_dfct_flg, Purc_Ins01_DtlR.$accpt_dfct_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$re_arr_flg, Purc_Ins01_DtlR.$re_arr_flg);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_itm_cd, Purc_Ins01_DtlR.$bd_itm_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_itm_sub1, Purc_Ins01_DtlR.$bd_itm_sub1);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_itm_sub2, Purc_Ins01_DtlR.$bd_itm_sub2);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_itm_sub3, Purc_Ins01_DtlR.$bd_itm_sub3);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_sno1, Purc_Ins01_DtlR.$bd_sno1);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_sno2, Purc_Ins01_DtlR.$bd_sno2);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_sno3, Purc_Ins01_DtlR.$bd_sno3);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_sno4, Purc_Ins01_DtlR.$bd_sno4);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_loc_cd, Purc_Ins01_DtlR.$bd_loc_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_lot_no, Purc_Ins01_DtlR.$bd_lot_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_sublot_no, Purc_Ins01_DtlR.$bd_sublot_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_dpt_cd, Purc_Ins01_DtlR.$bd_dpt_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_wg_cd, Purc_Ins01_DtlR.$bd_wg_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_ctg_cd, Purc_Ins01_DtlR.$bd_ctg_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_oper_cd, Purc_Ins01_DtlR.$bd_oper_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_slo_no, Purc_Ins01_DtlR.$bd_slo_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_iv_no, Purc_Ins01_DtlR.$bd_iv_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_po_no, Purc_Ins01_DtlR.$bd_po_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bd_bp_cd, Purc_Ins01_DtlR.$bd_bp_cd);
				addColumnPathMap(MST_PURC_ACT_D_R.$po_no, Purc_Ins01_DtlR.$po_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$slo_no, Purc_Ins01_DtlR.$slo_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$ref_purc_act_no, Purc_Ins01_DtlR.$ref_purc_act_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$ref_purc_act_seq, Purc_Ins01_DtlR.$ref_purc_act_seq);
				addColumnPathMap(MST_PURC_ACT_D_R.$ref_purc_act_d_no, Purc_Ins01_DtlR.$ref_purc_act_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$ref_purc_act_d_seq, Purc_Ins01_DtlR.$ref_purc_act_d_seq);
				addColumnPathMap(MST_PURC_ACT_D_R.$base_purc_ac_dt, Purc_Ins01_DtlR.$base_purc_ac_dt);
				addColumnPathMap(MST_PURC_ACT_D_R.$bp_dlv_slip_no, Purc_Ins01_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$bp_dlv_slip_d_no, Purc_Ins01_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(MST_PURC_ACT_D_R.$intr_rmrks, Purc_Ins01_DtlR.$intr_rmrks);
				addColumnPathMap(MST_PURC_ACT_D_R.$trd_d_rmrks, Purc_Ins01_DtlR.$trd_d_rmrks);
				addColumnPathMap(MST_PURC_ACT_D_R.$sub_char1, Purc_Ins01_DtlR.$sub_char1);
				addColumnPathMap(MST_PURC_ACT_D_R.$sub_char2, Purc_Ins01_DtlR.$sub_char2);
				addColumnPathMap(MST_PURC_ACT_D_R.$sub_char3, Purc_Ins01_DtlR.$sub_char3);
				addColumnPathMap(MST_PURC_ACT_D_R.$disp_seq, Purc_Ins01_DtlR.$disp_seq);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 再入荷FLGがオンの場合のみ、再入荷の項目を連携する
				if (src.re_arr_flg()) {
					dest.re_arr_sync_flg(src.re_arr_sync_flg());
					dest.re_arr_loc_cd(src.re_arr_loc_cd());
					dest.re_arr_loc_wg_cd(src.re_arr_loc_wg_cd());
					dest.re_arr_str_ln_cd(src.re_arr_str_ln_cd());
					dest.re_arr_rqst_tm(src.re_arr_rqst_tm());
					dest.re_arr_purc_schd_dt(src.re_arr_purc_schd_dt());
					dest.trd_unit_re_arr_qty(src.trd_unit_re_arr_qty());
					dest.base_unit_re_arr_qty(src.base_unit_re_arr_qty());
				}
				else {
					// 再入荷オフの場合、再入荷関連の項目をクリアする
					dest.re_arr_sync_flg(false);
					dest.re_arr_loc_cd(null);
					dest.re_arr_loc_wg_cd(null);
					dest.re_arr_str_ln_cd(null);
					dest.re_arr_rqst_tm(null);
					dest.re_arr_purc_schd_dt(null);
					dest.trd_unit_re_arr_qty(null);
					dest.base_unit_re_arr_qty(null);
				}
				
				// 与信更新不要
				dest.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, src.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg));
			}
			
			
			
		}
		
		/**
		 * RowMapper<br>
		 * 上り電文(Purc_Ins01_IoR) -> 仕入実績受払(MST_PURC_ACT_IO_R)
		 */
		protected Map_fr_up3_to_pai_for_upd<MST_PURC_ACT_IO_R,Purc_Ins01_IoR> createMap_fr_up3_to_pai_for_upd() {
			if (_Map_fr_up3_to_pai_for_upd == null) {
				_Map_fr_up3_to_pai_for_upd = new Map_fr_up3_to_pai_for_upd<MST_PURC_ACT_IO_R, Purc_Ins01_IoR>();
			}
			return _Map_fr_up3_to_pai_for_upd;
		}
		protected Map_fr_up3_to_pai_for_upd<MST_PURC_ACT_IO_R, Purc_Ins01_IoR> _Map_fr_up3_to_pai_for_upd = null;
		public class Map_fr_up3_to_pai_for_upd<D extends MST_PURC_ACT_IO_R, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_ACT_IO_R.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$purc_act_io_seq, Purc_Ins01_IoR.$purc_act_io_seq);
				addColumnPathMap(MST_PURC_ACT_IO_R.$purc_act_d_no, Purc_Ins01_IoR.$purc_act_d_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$purc_act_d_seq, Purc_Ins01_IoR.$purc_act_d_seq);
				addColumnPathMap(MST_PURC_ACT_IO_R.$arr_act_no, Purc_Ins01_IoR.$arr_act_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$purc_ret_act_io_no, Purc_Ins01_IoR.$purc_ret_act_io_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$in_to_loc_wg_cd, Purc_Ins01_IoR.$in_to_loc_wg_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$in_to_loc_cd, Purc_Ins01_IoR.$in_to_loc_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$str_ln_cd, Purc_Ins01_IoR.$str_ln_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ver_no, Purc_Ins01_IoR.$ver_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$lot_no, Purc_Ins01_IoR.$lot_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$sublot_no, Purc_Ins01_IoR.$sublot_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$gd_cd, Purc_Ins01_IoR.$gd_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$quality_typ, Purc_Ins01_IoR.$quality_typ);
				addColumnPathMap(MST_PURC_ACT_IO_R.$stk_insp_typ, Purc_Ins01_IoR.$stk_insp_typ);
				addColumnPathMap(MST_PURC_ACT_IO_R.$stk_id_typ, Purc_Ins01_IoR.$stk_id_typ);
				addColumnPathMap(MST_PURC_ACT_IO_R.$bp_lot_no, Purc_Ins01_IoR.$bp_lot_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$bp_dlv_slip_no, Purc_Ins01_IoR.$bp_dlv_slip_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no, Purc_Ins01_IoR.$bp_dlv_slip_d_no);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_unit_cd, Purc_Ins01_IoR.$trd_unit_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_unit_qty, Purc_Ins01_IoR.$trd_unit_qty);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_unit_cd, Purc_Ins01_IoR.$base_unit_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_unit_qty, Purc_Ins01_IoR.$base_unit_qty);
				addColumnPathMap(MST_PURC_ACT_IO_R.$pack_unit_cd, Purc_Ins01_IoR.$pack_unit_cd);
				addColumnPathMap(MST_PURC_ACT_IO_R.$pack_unit_qty, Purc_Ins01_IoR.$pack_unit_qty);
				addColumnPathMap(MST_PURC_ACT_IO_R.$so_qty, Purc_Ins01_IoR.$so_qty);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_upri, Purc_Ins01_IoR.$trd_cur_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_proc_upri, Purc_Ins01_IoR.$trd_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_onr_prov_upri, Purc_Ins01_IoR.$trd_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_amt, Purc_Ins01_IoR.$trd_cur_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_proc_amt, Purc_Ins01_IoR.$trd_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_onr_prov_amt, Purc_Ins01_IoR.$trd_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_tax_amt, Purc_Ins01_IoR.$trd_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$trd_cur_dscnt_amt, Purc_Ins01_IoR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_upri, Purc_Ins01_IoR.$base_cur_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_proc_upri, Purc_Ins01_IoR.$base_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_onr_prov_upri, Purc_Ins01_IoR.$base_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_dscnt_amt, Purc_Ins01_IoR.$base_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_amt, Purc_Ins01_IoR.$base_cur_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_proc_amt, Purc_Ins01_IoR.$base_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_onr_prov_amt, Purc_Ins01_IoR.$base_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$base_cur_tax_amt, Purc_Ins01_IoR.$base_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_upri, Purc_Ins01_IoR.$ptax_cur_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_proc_upri, Purc_Ins01_IoR.$ptax_cur_proc_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_upri, Purc_Ins01_IoR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_dscnt_amt, Purc_Ins01_IoR.$ptax_cur_dscnt_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_amt, Purc_Ins01_IoR.$ptax_cur_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_proc_amt, Purc_Ins01_IoR.$ptax_cur_proc_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_onr_prov_amt, Purc_Ins01_IoR.$ptax_cur_onr_prov_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$ptax_cur_tax_amt, Purc_Ins01_IoR.$ptax_cur_tax_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$wtax_amt, Purc_Ins01_IoR.$wtax_amt);
				addColumnPathMap(MST_PURC_ACT_IO_R.$sub_char1, Purc_Ins01_IoR.$sub_char1);
				addColumnPathMap(MST_PURC_ACT_IO_R.$sub_char2, Purc_Ins01_IoR.$sub_char2);
				addColumnPathMap(MST_PURC_ACT_IO_R.$sub_char3, Purc_Ins01_IoR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					dest.gi_wg_cd(src.gi_wg_cd());
					dest.gi_loc_cd(src.gi_loc_cd());
					dest.gi_str_ln_cd(src.gi_str_ln_cd());
					dest.gi_unit_cd(src.gi_unit_cd());
					dest.insp_act_d_no(src.insp_act_d_no());
					dest.insp_judg_d_no(src.insp_judg_d_no());
					dest.insp_act_no(src.insp_act_no());
				}
			}
		}
		
		protected void callArrAct4PurcDtl() {
			MSBEL_ArrActService.ArrAct_Upd03 ope = MSBEL_ArrActService.crtArrAct_Upd03();
			
			MCList<Purc_Ins01_IoR> ioUpParamL = MCList.create(Purc_Ins01_IoR.class);
			MCList<Purc_Ins01_DtlR> dtlUpParamL = MCList.create(Purc_Ins01_DtlR.class);
			
			for (Purc_Ins01_DtlR row : up2()) {
				if (isArrActTgt4PurcDtl(row, up0())) {
					dtlUpParamL.add(row);
					ioUpParamL.addAll(up3().subList(Purc_Ins01_IoR.$dtl_peg_no, row.peg_no()));
				}
			}
			if (ioUpParamL.size() == 0) {
				return;
			}
			
			for (Purc_Ins01_IoR ioR : ioUpParamL) {
				ArrAct_DtlR arrDtlR = ope.up0().add();
				arrDtlR.purc_act_io_no(ioR.purc_act_io_no());
				arrDtlR.setAttributes(ioR);
			}
			
			ope.exec();
		}
	}
	
	/**
	 * Purc_Del01オペレーション.<p>
	 *
	 */
	public class Purc_Del01 extends MSBDL_PurcActRegService_MC_A.Purc_Del01 {
		MCList<MST_PURC_ACT_R> _hdrL = MCList.create(MST_PURC_ACT_R.class);
		MCList<MST_PURC_ACT_D_R> _dtlL = MCList.create(MST_PURC_ACT_D_R.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 仕入実績明細の連番を退避
			copyPurcActSeqNo(up2());
			
			// 上り電文編集
			editUp();
			// 入荷予定送信ＩＦサービス（未着分送信）
			callArrSchdSendIf_Upd01(up2(), up3(), true);

			// 入荷実績登録サービス
			callArrActService(up1(), up2(), up3(), up0());

			MCJoinKey<MCList<Purc_Ins01_IoR>> dtl2IoKey = 
					up2().join(Purc_Ins01_DtlR.$peg_no, up3(), Purc_Ins01_IoR.$dtl_peg_no);
			MCList<Purc_Ins01_DtlR> outsrcTgtL = getOursrcMfgTgtUp1(up0(), up1(), up2(), up3());
			
			// 取消処理
			delPurcAct();

			// 受払実績WKサービス
			callIoAct_Ins01_for_del(up1(), up2(), up3());

			// 仕入予定サービス
			callPurcSchd_Upd02(up2());

			// 入荷予定サービス(再入荷予定作成・更新・削除)
			callArrSchd_Upd01(up1(), up2());
			// 入荷予定送信ＩＦサービス（未着分送信）
			callArrSchdSendIf_Upd01(up2(), up3(), false);

			// 入荷予定サービス（進捗情報の更新）
			callArrSchd_Upd03(up2());

			// 外注製造実績サービス（外注実績自動登録）
			callOutSrcAct_Upd01(up0(), up1(), outsrcTgtL, up3(), dtl2IoKey);
			
			// 支給実績サービス
			callProvAct_Upd01(up1(), up2(), up3());

			// 受払実績作成
			callIoAct_Upd01(up0());

			// オーダ登録サービス(品目オーダ更新)実行
			callOrd_Upd04(up0(), up2());

			// 受注状況更新サービス
			callSloSts_Upd01(up1(), up2());
			
			// 承認次処理済解除
			callAprvUpd03(up1());
			
			// 売上予定サービス実行
			callSlsSchdSrv(up2(), up0());
			
			// 債務与信更新サービス
			callCredUpd02(_hdrL, _dtlL);
			// EDI検収送信
			callAccptEdi(up1(), up2());
			callApDtlRegServiceUpd01(up1(), up2(), _hdrL);
			callGALink(_hdrL, MAC_DATA_CRUD_TYP.DEL.value());
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCIndexKey idxHdrL = up1().createIndex(Purc_Ins01_HdrR.$peg_no);
			
			for (Purc_Ins01_DtlR dtlRow : up2()) {
				Purc_Ins01_HdrR hdrR = up1().getFirst(idxHdrL, dtlRow.hdr_peg_no());
				MST_PURC_ACT_D_R padRow = getBfUpdPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
				if (!isNull(padRow)) {
					// 発注明細NO
					dtlRow.po_d_no(padRow.po_d_no());
					// 取引単位CD・数量
					dtlRow.trd_unit_cd(padRow.trd_unit_cd());
					dtlRow.trd_unit_qty(padRow.trd_unit_qty());
					dtlRow.purc_act_no(padRow.purc_act_no());
					dtlRow.purc_act_seq(padRow.purc_act_seq());
					dtlRow.mfg_inst_no(padRow.mfg_inst_no());
					// 品目
					dtlRow.itm_cd(padRow.itm_cd());
					dtlRow.itm_sub1(padRow.itm_sub1());
					dtlRow.itm_sub2(padRow.itm_sub2());
					dtlRow.itm_sub3(padRow.itm_sub3());
					// 暫定買掛
					dtlRow.temp_ap_flg(padRow.temp_ap_flg());
				}
				
				// 与信更新不要
				dtlRow.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, isNotUpdCred(up0(), hdrR, dtlRow));
			}
			// 仕入実績受払トランから補完
			for (Purc_Ins01_IoR ioRow : up3()) {
				MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(ioRow.purc_act_io_no(), ioRow.purc_act_io_seq());
				if (!isNull(paiRow)) {
					// 場所
					ioRow.in_to_loc_cd(paiRow.in_to_loc_cd());
					ioRow.purc_act_d_no(paiRow.purc_act_d_no());
					ioRow.purc_act_d_seq(paiRow.purc_act_d_seq());
				}
			}
			
			
		}
		
		/**
		 * 仕入実績取消<br>
		 */
		protected void delPurcAct() {
			
			// ヘッダ上り電文の仕入実績NO,連番に対応する仕入実績ヘッダを取得
			MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
			dbSelectKey("MSBDL5180_MST_PURC_ACT_S10", paL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), up1());

			// 取得した仕入実績ヘッダに紐付く、実績明細を取得する
			MCList<MST_PURC_ACT_D_R> padL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R padL_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(padL_t);
			padL_bldr.addWhereWithAnd(padL_t.purc_act_no.eq(bind("purc_act_no"))
					.and(padL_t.purc_act_seq.eq(bind("purc_act_seq"))));
			dbSelect("MSBDL5180_MST_PURC_ACT_D_S10", padL, padL_bldr, paL);
			
			// 取得した実績明細に紐付く、実績受払を取得する
			MCList<MST_PURC_ACT_IO_R> paiL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R paiL_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paiL_bldr = MCQueryApiBuilder.create(paiL_t);
			paiL_bldr.addWhereWithAnd(paiL_t.purc_act_d_no.eq(bind("purc_act_d_no"))
					.and(paiL_t.purc_act_d_seq.eq(bind("purc_act_d_seq"))));
			dbSelect("MSBDL5180_MST_PURC_ACT_IO_S07", paiL, paiL_bldr, padL);

			// 既存の仕入実績ヘッダを無効伝票に更新する為のDBコンテナを作成する
			MCList<MST_PURC_ACT_R> ivdPaL = paL.clone();
			ivdPaL.setString(MST_PURC_ACT_R.$slip_sts_typ, MAC_SLIP_STS_TYP.DIS.value());
			
			// 取消伝票作成
			MCList<MST_PURC_ACT_R> canPaL = paL.clone();
			MCList<MST_PURC_ACT_D_R> canPadL = padL.clone();
			MCList<MST_PURC_ACT_IO_R> canPaiL = paiL.clone();
			setValForCan(canPaL, canPadL, canPaiL, up1(), up0(), up2());
			
			// 既存の仕入実績ヘッダを「無効」に更新
			MST_PURC_ACT_R ivdPaL_t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder ivdPaL_bldr = MCQueryApiBuilder.create(ivdPaL_t);
			ivdPaL_bldr.setSet(ivdPaL_t.slip_sts_typ);
			dbUpdateKey("MSBDL5180_MST_PURC_ACT_U02", ivdPaL, ivdPaL_bldr);
			
			// 既存の仕入実績ヘッダの「取消」を作成
			dbInsert("MSBDL5180_MST_PURC_ACT_I04", canPaL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_D_I04", canPadL,
					MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T")));
			dbInsert("MSBDL5180_MST_PURC_ACT_IO_I04", canPaiL,
					MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")));

			_hdrL.addAll(canPaL);
			_dtlL.addAll(canPadL);
		}
	}

	/**
	 * 購買区分をサービスで決めるか
	 * @return true:サービスで購買区分を決める, false:上り電文の購買区分を採用する
	 */
	protected boolean isPurcTypDecideInSrvs(Purc_Ins01_DtlR dtlRow, MCList<Purc_Ins01_HdrR> up1L) {
		Purc_Ins01_HdrR hdrR = up1L.getFirst(Purc_Ins01_HdrR.$peg_no, dtlRow.hdr_peg_no());
		if (MAC_TRD_PTN_TYP.isPURC(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_VMI(hdrR.trd_ptn_typ())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 連携したDBコンテナに、仕入実績伝票を取り消すための値を設定する
	 * @param paL 仕入実績ヘッダのDBコンテナ
	 * @param padL 仕入実績明細のDBコンテナ
	 * @param paiL 仕入実績受払のDBコンテナ
	 */
	protected void setValForCan(MCList<MST_PURC_ACT_R> paL, MCList<MST_PURC_ACT_D_R> padL,
			MCList<MST_PURC_ACT_IO_R> paiL, MCList<Purc_Ins01_HdrR> up1L, Purc_Ins01_CtlR up0R, MCList<Purc_Ins01_DtlR> up2L) {
		MCIndexKey key = up1L.createIndex(Purc_Ins01_HdrR.$purc_act_no, Purc_Ins01_HdrR.$purc_act_seq);
		MCIndexKey dtlKey = padL.createIndex(MST_PURC_ACT_D_R.$purc_act_no);
		MCIndexKey up2Key = up2L.createIndex(Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq);
	
		// ヘッダ
		for (MST_PURC_ACT_R hdr : paL) {
			Purc_Ins01_HdrR upR = up1L.getFirst(key, hdr.purc_act_no(), hdr.purc_act_seq());
			hdr.setDateNE("dis_ac_dt", hdr.ac_dt());
			if (!isNull(upR.can_ac_dt())) {
				hdr.ac_dt(upR.can_ac_dt());
				hdr.setDateNE(Purc_Ins01_HdrR.$can_ac_dt, upR.can_ac_dt());
			}
			else {
				hdr.setDateNE(Purc_Ins01_HdrR.$can_ac_dt, hdr.ac_dt());
			}
			hdr.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_R.$purc_dpt_cd), upR.purc_dpt_cd());
			hdr.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_R.$purc_usr_cd), upR.purc_usr_cd());
			hdr.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_R.$wg_cd), upR.wg_cd());
			hdr.ac_ym(getAcYm(hdr.ac_dt()));
			hdr.setDateNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_R.$ac_dt), upR.ac_dt());
			if (hdr.getDateNE(Purc_Ins01_HdrR.$can_ac_dt).gt(hdr.pay_basis_dt())
					&& isNull(hdr.pay_schd_dt())) {
				hdr.pay_basis_dt(hdr.getDateNE(Purc_Ins01_HdrR.$can_ac_dt));
			}
			hdr.purc_act_seq(hdr.purc_act_seq().add(1));
			hdr.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			
			// 明細
			MCList<MST_PURC_ACT_D_R> dtlL = padL.subList(dtlKey, hdr.purc_act_no());
			
			for (MST_PURC_ACT_D_R dtlRow : dtlL) {
				
				// MAUCL_DptUtil.setCanDptの為の設定 ここから
				Purc_Ins01_DtlR up2R = up2L.getFirst(up2Key, dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
				dtlRow.setDateNE(MST_PURC_ACT_R.$ac_dt, hdr.ac_dt());
				dtlRow.setDateNE("dis_ac_dt", hdr.getDateNE("dis_ac_dt"));
				dtlRow.setDateNE(Purc_Ins01_HdrR.$can_ac_dt, hdr.ac_dt());
				dtlRow.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_D_R.$ap_dpt_cd), up2R.ap_dpt_cd());
				dtlRow.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_D_R.$bd_dpt_cd), up2R.bd_dpt_cd());
				dtlRow.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PURC_ACT_D_R.$bd_wg_cd), up2R.bd_wg_cd());
				dtlRow.setDateNE(MAUCL_DptUtil.getCrtColumn("ac_dt"),upR.ac_dt());
				// MAUCL_DptUtil.setCanDptの為の設定 ここまで
				
				// ヘッダの連番をセット
				dtlRow.purc_act_seq(hdr.purc_act_seq());
				// 明細連番を1つ進める
				dtlRow.purc_act_d_seq(dtlRow.purc_act_d_seq().add(1));
				// 数量をマイナスにする
				dtlRow.trd_unit_qty(dtlRow.trd_unit_qty().negate());
				dtlRow.base_unit_qty(dtlRow.base_unit_qty().negate());
				// 金額をマイナスにする
				dtlRow.trd_cur_amt(dtlRow.trd_cur_amt().negate());
				dtlRow.base_cur_amt(dtlRow.base_cur_amt().negate());
				if (!isNull(dtlRow.ptax_cur_amt())) {
					dtlRow.ptax_cur_amt(dtlRow.ptax_cur_amt().negate());
				}
				// 税額をマイナスにする
				dtlRow.trd_cur_tax_amt(dtlRow.trd_cur_tax_amt().negate());
				dtlRow.base_cur_tax_amt(dtlRow.base_cur_tax_amt().negate());
				if (!isNull(dtlRow.ptax_cur_tax_amt())) {
					dtlRow.ptax_cur_tax_amt(dtlRow.ptax_cur_tax_amt().negate());
				}
				// 源泉税額をマイナスにする
				if (!isNull(dtlRow.wtax_amt())) {
					dtlRow.wtax_amt(dtlRow.wtax_amt().negate());
				}
				// 値引額をマイナスにする
				if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
					dtlRow.trd_cur_dscnt_amt(dtlRow.trd_cur_dscnt_amt().negate());
					dtlRow.base_cur_dscnt_amt(dtlRow.base_cur_dscnt_amt().negate());
					if (!isNull(dtlRow.ptax_cur_dscnt_amt())) {
						dtlRow.ptax_cur_dscnt_amt(dtlRow.ptax_cur_dscnt_amt().negate());
					}
				}
				// 有償支給金額をマイナスにする
				if (!isNull(dtlRow.trd_cur_onr_prov_amt())) {
					dtlRow.trd_cur_onr_prov_amt(dtlRow.trd_cur_onr_prov_amt().negate());
					dtlRow.base_cur_onr_prov_amt(dtlRow.base_cur_onr_prov_amt().negate());
					if (!isNull(dtlRow.ptax_cur_onr_prov_amt())) {
						dtlRow.ptax_cur_onr_prov_amt(dtlRow.ptax_cur_onr_prov_amt().negate());
					}
				}
				// 加工金額をマイナスにする
				if (!isNull(dtlRow.trd_cur_proc_amt())) {
					dtlRow.trd_cur_proc_amt(dtlRow.trd_cur_proc_amt().negate());
					dtlRow.base_cur_proc_amt(dtlRow.base_cur_proc_amt().negate());
					if (!isNull(dtlRow.ptax_cur_proc_amt())) {
						dtlRow.ptax_cur_proc_amt(dtlRow.ptax_cur_proc_amt().negate());
					}
				}
				// 与信更新不要
				dtlRow.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, up2R.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg));
				// 受払
				MCList<MST_PURC_ACT_IO_R> ioL = paiL.subList(MST_PURC_ACT_D_R.$purc_act_d_no, dtlRow.purc_act_d_no());
				for (MST_PURC_ACT_IO_R io : ioL) {
					// 明細の連番をセット
					io.purc_act_d_seq(dtlRow.purc_act_d_seq());
					// 受払の連番を1つ進める
					io.purc_act_io_seq(io.purc_act_io_seq().add(1));
					
					// 数量をマイナスにする
					io.trd_unit_qty(io.trd_unit_qty().negate());
					io.base_unit_qty(io.base_unit_qty().negate());
					if (!isNull(io.so_qty())) {
						io.so_qty(io.so_qty().negate());
					}
					// 金額をマイナスにする
					io.trd_cur_amt(io.trd_cur_amt().negate());
					io.base_cur_amt(io.base_cur_amt().negate());
					if (!isNull(io.ptax_cur_amt())) {
						io.ptax_cur_amt(io.ptax_cur_amt().negate());
					}
					// 税額をマイナスにする
					io.trd_cur_tax_amt(io.trd_cur_tax_amt().negate());
					io.base_cur_tax_amt(io.base_cur_tax_amt().negate());
					if (!isNull(io.ptax_cur_tax_amt())) {
						io.ptax_cur_tax_amt(io.ptax_cur_tax_amt().negate());
					}
					// 源泉税額をマイナスにする
					if (!isNull(io.wtax_amt())) {
						io.wtax_amt(io.wtax_amt().negate());
					}
					// 値引額をマイナスにする
					if (!isNull(io.trd_cur_dscnt_amt())) {
						io.trd_cur_dscnt_amt(io.trd_cur_dscnt_amt().negate());
						io.base_cur_dscnt_amt(io.base_cur_dscnt_amt().negate());
						if (!isNull(io.ptax_cur_dscnt_amt())) {
							io.ptax_cur_dscnt_amt(io.ptax_cur_dscnt_amt().negate());
						}
					}
					// 有償支給金額をマイナスにする
					if (!isNull(io.trd_cur_onr_prov_amt())) {
						io.trd_cur_onr_prov_amt(io.trd_cur_onr_prov_amt().negate());
						io.base_cur_onr_prov_amt(io.base_cur_onr_prov_amt().negate());
						if (!isNull(io.ptax_cur_onr_prov_amt())) {
							io.ptax_cur_onr_prov_amt(io.ptax_cur_onr_prov_amt().negate());
						}
					}
					// 加工金額をマイナスにする
					if (!isNull(io.trd_cur_proc_amt())) {
						io.trd_cur_proc_amt(io.trd_cur_proc_amt().negate());
						io.base_cur_proc_amt(io.base_cur_proc_amt().negate());
						if (!isNull(io.ptax_cur_proc_amt())) {
							io.ptax_cur_proc_amt(io.ptax_cur_proc_amt().negate());
						}
					}
					
				}
			}
		}
		String[] hdrKeys = new String[] { MST_PURC_ACT_R.$purc_dpt_cd };
		MAUCL_DptUtil.setCanDpt(paL, hdrKeys, null);
		String[] dtlKeys = new String[] { MST_PURC_ACT_D_R.$ap_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd };
		MAUCL_DptUtil.setCanDpt(padL, dtlKeys, null);
	}
	
	/**
	 * 受払ワーク作成(伝票削除用)
	 * @param up1L 第1上り電文 ヘッダ
	 */
	protected void callIoAct_Ins01_for_del(MCList<Purc_Ins01_HdrR> up1L, MCList<Purc_Ins01_DtlR> up2L, MCList<Purc_Ins01_IoR> up3L) {
		
		// 受払実績ＷＫ作成サービス
		MSBEL_IoActService.IoAct_Ins01 ioActIns = MSBEL_IoActService.crtIoAct_Ins01();

		MCIndexKey dk = up2L.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
		MCIndexKey ik = up3L.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		
		for (Purc_Ins01_HdrR hdrR : up1L) {
			// 仕入、経費仕入、ＶＭＩ仕入、仕入値引・値増、経費値引・値増 以外の伝票は処理対象外
			if (!isIoActTgt(hdrR)) {
				continue;
			}
			
			// ヘッダに対応する明細行を取得
			MCList<Purc_Ins01_DtlR> dtlL = up2L.subList(dk, hdrR.peg_no());
			
			for (Purc_Ins01_DtlR dtlR : dtlL) {
				
				// 明細に対応する詳細行を取得
				MCList<Purc_Ins01_IoR> ioL = up3L.subList(ik, dtlR.peg_no());
			
				for (Purc_Ins01_IoR ioR : ioL) {
					IoAct_Ins01_DtlR ioWkR = IoAct_Ins01_DtlR.create();
					setDelIoParam(hdrR, dtlR, ioR, ioWkR);
					ioActIns.up0().add(ioWkR);
				}
			}
			
		}
		
		// 受払実績ＷＫサービス実行
		if (ioActIns.up0().size() > 0) {
			ioActIns.exec();
		}
		
	}
	
	protected boolean isIoActTgt(Purc_Ins01_HdrR hdrR) {
		return isIoActTgtPurc(hdrR.trd_ptn_typ())
				|| isIoActTgtPurcRet(hdrR.trd_ptn_typ());
	}
	
	protected boolean isIoActTgtPurc(String trdPtnTyp) {
		return isPurcTrdPtnTyp(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || isDscntTrdPtnTyp(trdPtnTyp);

	}
	
	protected boolean isIoActTgtPurcRet(String trdPtnTyp) {
		return isRtnTrdPtnTyp(trdPtnTyp);
	}
	
	protected void setDelIoParam(Purc_Ins01_HdrR hdrR, Purc_Ins01_DtlR dtlR, Purc_Ins01_IoR ioR, IoAct_Ins01_DtlR ioWkR) {
		ioWkR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		ioWkR.can_ac_dt(hdrR.can_ac_dt());
		if (isIoActTgtPurcRet(hdrR.trd_ptn_typ())) {
			ioWkR.act_no(hdrR.purc_ret_act_no());
			ioWkR.act_d_no(dtlR.purc_ret_act_d_no());
			ioWkR.act_io_no(ioR.purc_ret_act_io_no());
			ioWkR.trn_typ(MSC_TRN_TYP.PURC_RTN.value());
		}
		else {
			ioWkR.act_no(hdrR.purc_act_no());
			ioWkR.act_d_no(dtlR.purc_act_d_no());
			ioWkR.act_io_no(ioR.purc_act_io_no());
			ioWkR.trn_typ(MSC_TRN_TYP.PURC.value());
		}
	}	
	/**
	 * 受払ワーク作成(伝票登録・更新用)
	 * @param up1L 第1上り電文 ヘッダ
	 * @param up2L 第2上り電文 明細
	 * @param up3L 第3上り電文 受払
	 */
	protected void callIoAct_Ins01_for_crt_or_upd(MCList<Purc_Ins01_HdrR> up1L, MCList<Purc_Ins01_DtlR> up2L, MCList<Purc_Ins01_IoR> up3L) {
		
		// 受払実績ＷＫ作成サービス
		MSBEL_IoActService.IoAct_Ins01 ioActIns = MSBEL_IoActService.crtIoAct_Ins01();
		
		MCIndexKey dk = up2L.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
		MCIndexKey ik = up3L.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		
		// 入荷実績を取得する
		MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R arrL_t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrL_t);
		dbWkDelete("MSBDL5180_MSW_ARR_ACT_D01", arrL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5180_MSW_ARR_ACT_I01", up3L, arrL_bldr.getBaseDbc());
		MSW_ARR_ACT_KEY_R k01 = MSW_ARR_ACT_KEY_R.create("K01");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
		arrL_bldr.addInnerJoin(k01, bracket(arrL_t.arr_act_no.eq(k01.arr_act_no)));
		arrL_bldr.addLeftOuterJoin(m1, bracket( arrL_t.arr_loc_cd.eq(m1.loc_cd)));
		arrL_bldr.addLeftOuterJoin(m2, bracket(arrL_t.itm_cd.eq(m2.itm_cd)
				.and(arrL_t.itm_sub1.eq(m2.itm_sub1))
				.and(arrL_t.itm_sub2.eq(m2.itm_sub2))
				.and(arrL_t.itm_sub3.eq(m2.itm_sub3))
				.and(arrL_t.trd_unit_cd.eq(m2.unit_cd))));
		arrL_bldr.addSelect(m1.wg_cd, m2.conv_base_qty, m2.conv_qty, m2.dec_place);
		dbSelect("MSBDL5180_MST_ARR_ACT_S02", arrL, arrL_bldr);
		dbWkDelete("MSBDL5180_MSW_ARR_ACT_D02", arrL_bldr.getBaseDbc());
		MCIndexKey arrKey = arrL.createIndex(MST_ARR_ACT_R.$arr_act_no);

		// 品目単位マスタを取得する
		MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R itmUnitL_t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(itmUnitL_t);
		itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_cd.eq(bind("itm_cd")));
		itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub1.eq(bind("itm_sub1")));
		itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub2.eq(bind("itm_sub2")));
		itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub3.eq(bind("itm_sub3")));
		itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.unit_cd.eq(bind("gi_unit_cd")));
		itmUnitL_bldr.setSelect(itmUnitL_t.itm_cd, itmUnitL_t.itm_sub1,
				itmUnitL_t.itm_sub2, itmUnitL_t.itm_sub3, itmUnitL_t.unit_cd,
				itmUnitL_t.conv_base_qty, itmUnitL_t.conv_qty, itmUnitL_t.dec_place);
		dbSelect("MSBDL5180_MAVM_ITM_UNIT_S03", itmUnitL, itmUnitL_bldr, up3L);
		
		MCIndexKey itmUnitKey = itmUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd, 
				MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
		
		for (Purc_Ins01_HdrR hdrR : up1L) {
			
			// 仕入、経費仕入、ＶＭＩ仕入、仕入値引・値増、経費値引・値増 以外の伝票は処理対象外
			if (!isIoActTgt(hdrR)) {
				continue;
			}

			// ヘッダに対応する明細行を取得
			MCList<Purc_Ins01_DtlR> dtlL = up2L.subList(dk, hdrR.peg_no());
			
			for (Purc_Ins01_DtlR dtlR : dtlL) {
				
				// 明細に対応する詳細行を取得
				MCList<Purc_Ins01_IoR> ioL = up3L.subList(ik, dtlR.peg_no());
				
				for (Purc_Ins01_IoR ioR : ioL) {
					
					// 受払実績WK実行用のコンテナ
					IoAct_Ins01_DtlR ioWkR = IoAct_Ins01_DtlR.create();
					
					// 実績受払のデータ更新区分が「削除」の場合
					if (MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
						setDelIoParam(hdrR, dtlR, ioR, ioWkR);
					}
					// 「新規」・「更新」の場合
					else {
						// 対象の取引パタンにおいて常時設定する項目を上り電文から、受払実績サービスの上り電文にコピー
						copy(ioWkR, hdrR, createMap_IoAct_Ins01_DtlR_Purc_Ins01_HdrR());
						
						// 上り電文(明細)から、受払実績WKサービスの上り電文に、品目・負担項目・コピー
						copy(ioWkR, dtlR, hdrR, createMap_IoAct_Ins01_DtlR_Purc_Ins01_DtlR());
						
						// 上り電文(受払)から、受払実績WKサービスの上り電文に値コピー
						// 受払の一時カラムに、明細の経費購買FLG、入荷パタン、入荷予定NOを追加
						ioR.addBooleanColumn("xpns_po_flg", dtlR.xpns_po_flg());
						ioR.arr_ptn_typ(dtlR.arr_ptn_typ());
						ioR.arr_schd_no(dtlR.arr_schd_no());
						Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR<IoAct_Ins01_DtlR, Purc_Ins01_IoR, Purc_Ins01_HdrR> mpr = createMap_IoAct_Ins01_DtlR_Purc_Ins01_IoR();
						mpr.setDtlR(dtlR);
						MST_ARR_ACT_R arrActR = arrL.getFirst(arrKey, ioR.arr_act_no());
						if (!isNull(arrActR)) {
							mpr.setWith(arrActR);
						}
						MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(itmUnitKey, ioR.itm_cd(), 
								ioR.itm_sub1(), ioR.itm_sub2(), ioR.itm_sub3(), ioR.gi_unit_cd());
						mpr.setWith(itmUnitR);
						copy(ioWkR, ioR, hdrR, mpr);
						
					}
					// 実績ＷＫの電文に追加
					ioActIns.up0().add(ioWkR);
				}
			}
		}
		
		// 受払実績ＷＫサービス実行
		if (ioActIns.up0().size() > 0) {
			ioActIns.exec();
		}
		
	}
	
	/**
	 * 受払実績作成サービス呼出
	 */
	protected void callIoAct_Upd01(Purc_Ins01_CtlR cntl) {
		
		// 受払実績作成ＦＬＧがオンならば、当サービスで受払実績WKの内容を、受払実績に書き込む
		if (cntl.io_make_flg()) {
			MSBEL_IoActService.IoAct_Upd01 ioActUpd = MSBEL_IoActService.crtIoAct_Upd01();
			ioActUpd.exec();
		}
		
	}
	
	/**
	 * 仕入予定サービス(実績更新)実行
	 */
	protected void callPurcSchd_Upd02(MCList<Purc_Ins01_DtlR> dtlL) {
		// 発注ありの仕入のみが対象
		MCList<Purc_Ins01_DtlR> tgtList = MCList.create(Purc_Ins01_DtlR.class);
		
		for (Purc_Ins01_DtlR dtlR : dtlL) {
			if (!isNull(dtlR.purc_schd_no())) {
				tgtList.add(dtlR);
			}
		}
		
		if (tgtList.size() == 0) {
			return;
		}
		
		// 引数設定
		MCList<PurcSchd_DtlR> schdSvParmList = MCList.create(PurcSchd_DtlR.class);
		for (Purc_Ins01_DtlR tgtR : tgtList) {
			PurcSchd_DtlR dtlR = PurcSchd_DtlR.create();
			dtlR.peg_no(tgtR.peg_no());
			dtlR.purc_schd_no(tgtR.purc_schd_no());
			dtlR.abort_flg(tgtR.abort_flg());
			dtlR.no_cred_upd_flg(tgtR.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg));
			schdSvParmList.add(dtlR);
		}
		
		// 仕入予定サービス実行
		MSBDL_PurcSchdRegService.PurcSchd_Upd02 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Upd02();
		ope.up0().addAll(schdSvParmList);
		ope.exec();
		
	}
	
	/**
	 * RowMapper<br>
	 * 仕入実績ヘッダ(MST_PURC_ACT_R) -> 上り電文(Purc_Chk03_HdrR)<br>
	 * ※仕入実績明細訂正専用
	 */
	protected Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR,MST_PURC_ACT_R> createMap_Purc_Chk03_HdrR_MST_PURC_ACT_R() {
		if (_Map_Purc_Chk03_HdrR_MST_PURC_ACT_R == null) {
			_Map_Purc_Chk03_HdrR_MST_PURC_ACT_R = new Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR, MST_PURC_ACT_R>();
		}
		_Map_Purc_Chk03_HdrR_MST_PURC_ACT_R.setWith(null);
		return _Map_Purc_Chk03_HdrR_MST_PURC_ACT_R;
	}
	protected Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR, MST_PURC_ACT_R> _Map_Purc_Chk03_HdrR_MST_PURC_ACT_R = null;
	public class Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<D extends Purc_Chk03_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
		
		protected Purc_Chk01_DtlR _purcChk01DtlR;
		protected void setWith(Purc_Chk01_DtlR _purcChk01DtlR) {
			this._purcChk01DtlR = _purcChk01DtlR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
			addColumnPathMap(Purc_Chk03_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
			addColumnPathMap(Purc_Chk03_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_no, MST_PURC_ACT_R.$rcpt_iv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_mng_no, MST_PURC_ACT_R.$rcpt_iv_mng_no);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_rev, MST_PURC_ACT_R.$rcpt_iv_rev);
			addColumnPathMap(Purc_Chk03_HdrR.$ref_rcpt_iv_no, MST_PURC_ACT_R.$ref_rcpt_iv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$xrate_cd, MST_PURC_ACT_R.$xrate_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_mng_no, MST_PURC_ACT_R.$rcpt_iv_mng_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_ret_act_no, MST_PURC_ACT_R.$purc_ret_act_no);
			addColumnPathMap(Purc_Chk03_HdrR.$adjst_dt, MST_PURC_ACT_R.$adjst_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_adjst_typ, MST_PURC_ACT_R.$purc_adjst_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$adjst_mtd_typ, MST_PURC_ACT_R.$adjst_mtd_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_adjst_flg, MST_PURC_ACT_R.$purc_adjst_flg);
			
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			// 仕入返品実績改訂番号
			dest.purc_ret_act_rev(_purcChk01DtlR.purc_ret_act_rev());
			dest.ac_dt(_purcChk01DtlR.ac_dt());
			dest.ac_ym(getAcYm(src.ac_dt()));
			dest.can_ac_dt(_purcChk01DtlR.can_ac_dt());
			dest.xrate(_purcChk01DtlR.xrate());
			dest.ptax_dt(_purcChk01DtlR.ptax_dt());
			dest.ptax_xrate(_purcChk01DtlR.ptax_xrate());
			dest.pay_basis_dt(_purcChk01DtlR.pay_basis_dt());
			dest.pay_schd_dt(_purcChk01DtlR.pay_schd_dt());
			dest.purc_usr_cd(_purcChk01DtlR.purc_usr_cd());
			dest.purc_dpt_cd(_purcChk01DtlR.purc_dpt_cd());
			dest.wg_cd(_purcChk01DtlR.wg_cd());
			dest.trd_rmrks(_purcChk01DtlR.trd_rmrks());
			dest.intr_rmrks(_purcChk01DtlR.pa().intr_rmrks());
			dest.sub_char1(_purcChk01DtlR.pa().sub_char1());
			dest.sub_char2(_purcChk01DtlR.pa().sub_char2());
			dest.sub_char3(_purcChk01DtlR.pa().sub_char3());

		}

	}

	/**
	 * RowMapper<br>
	 * 仕入実績明細(MST_PURC_ACT_D_R), 上り電文(Purc_Chk01_DtlR) -> 上り電文(Purc_Chk03_DtlR)<br>
	 * ※仕入実績明細訂正専用
	 */
	protected Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR,MST_PURC_ACT_D_R> createMap_Purc_Chk03_DtlR_MST_PURC_ACT_D_R() {
		if (_Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R == null) {
			_Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R = new Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR, MST_PURC_ACT_D_R>();
		}
		_Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R.setWith(null);
		return _Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R;
	}
	protected Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR, MST_PURC_ACT_D_R> _Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R = null;
	public class Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<D extends Purc_Chk03_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
		
		protected Purc_Chk01_DtlR _dtlR;
		protected void setWith(Purc_Chk01_DtlR _dtlR) {
			this._dtlR = _dtlR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$rcpt_iv_d_no, MST_PURC_ACT_D_R.$rcpt_iv_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_no, MST_PURC_ACT_D_R.$purc_src_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_typ, MST_PURC_ACT_D_R.$purc_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
			// 前回までの明細訂正フラグを引継ぐ
			addColumnPathMap(Purc_Chk03_DtlR.$purc_dtl_upd_flg, MST_PURC_ACT_D_R.$purc_dtl_upd_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, MST_PURC_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, MST_PURC_ACT_D_R.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_purc_ac_dt, MST_PURC_ACT_D_R.$base_purc_ac_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
			addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$intr_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_no, MST_PURC_ACT_D_R.$ref_purc_act_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_seq, MST_PURC_ACT_D_R.$ref_purc_act_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_no, MST_PURC_ACT_D_R.$ref_purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_seq, MST_PURC_ACT_D_R.$ref_purc_act_d_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$quality_typ, MST_PURC_ACT_D_R.$quality_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_insp_typ, MST_PURC_ACT_D_R.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_id_typ, MST_PURC_ACT_D_R.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, MST_PURC_ACT_D_R.$disp_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$edi_flg, MST_PURC_ACT_D_R.$edi_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!isNull(_dtlR)) {
				dest.peg_no(_dtlR.peg_no());
				// 仕入明細訂正からの更新では常に仕入実績明細の同時計上FLG、単価再取得対象外FLGを優先する
				dest.sync_flg(src.sync_flg());
				dest.upri_not_tgt_flg(_dtlR.upri_not_tgt_flg());
				// 明細訂正画面で変更した明細行は明細訂正フラグをオンにする
				dest.purc_dtl_upd_flg(true);
				dest.rsn_cd(_dtlR.rsn_cd());
				dest.interim_flg(_dtlR.interim_flg());
				dest.tax_cd(_dtlR.tax_cd());
				dest.trd_cur_upri(_dtlR.trd_cur_upri());
				dest.trd_cur_proc_upri(_dtlR.trd_cur_proc_upri());
				dest.trd_cur_onr_prov_upri(_dtlR.trd_cur_onr_prov_upri());
				dest.trd_cur_amt(_dtlR.trd_cur_amt());
				dest.trd_cur_tax_amt(_dtlR.trd_cur_tax_amt());
				dest.trd_cur_dscnt_amt(_dtlR.trd_cur_dscnt_amt());
				dest.trd_cur_proc_amt(_dtlR.trd_cur_proc_amt());
				dest.trd_cur_onr_prov_amt(_dtlR.trd_cur_onr_prov_amt());
				dest.base_cur_upri(_dtlR.base_cur_upri());
				dest.base_cur_dscnt_amt(_dtlR.base_cur_dscnt_amt());
				dest.base_cur_amt(_dtlR.base_cur_amt());
				dest.base_cur_proc_upri(_dtlR.base_cur_proc_upri());
				dest.base_cur_proc_amt(_dtlR.base_cur_proc_amt());
				dest.base_cur_onr_prov_upri(_dtlR.base_cur_onr_prov_upri());
				dest.base_cur_onr_prov_amt(_dtlR.base_cur_onr_prov_amt());
				dest.ptax_cur_upri(_dtlR.ptax_cur_upri());
				dest.ptax_cur_dscnt_amt(_dtlR.ptax_cur_dscnt_amt());
				dest.ptax_cur_amt(_dtlR.ptax_cur_amt());
				dest.ptax_cur_proc_upri(_dtlR.ptax_cur_proc_upri());
				dest.ptax_cur_proc_amt(_dtlR.ptax_cur_proc_amt());
				dest.ptax_cur_onr_prov_upri(_dtlR.ptax_cur_onr_prov_upri());
				dest.ptax_cur_onr_prov_amt(_dtlR.ptax_cur_onr_prov_amt());
				dest.base_cur_tax_amt(_dtlR.base_cur_tax_amt());
				dest.ptax_cur_tax_amt(_dtlR.ptax_cur_tax_amt());
				dest.dscnt_rsn_cd(_dtlR.dscnt_rsn_cd());
				dest.wtax_rate(_dtlR.wtax_rate());
				dest.wtax_amt(_dtlR.wtax_amt());
				dest.ap_dpt_cd(_dtlR.ap_dpt_cd());
				dest.base_purc_ac_dt(_dtlR.base_purc_ac_dt());
				dest.pay_crryovr_times(_dtlR.pay_crryovr_times());
				dest.bd_itm_cd(_dtlR.bd_itm_cd());
				dest.bd_itm_sub1(_dtlR.bd_itm_sub1());
				dest.bd_itm_sub2(_dtlR.bd_itm_sub2());
				dest.bd_itm_sub3(_dtlR.bd_itm_sub3());
				dest.bd_sno1(_dtlR.bd_sno1());
				dest.bd_sno2(_dtlR.bd_sno2());
				dest.bd_sno3(_dtlR.bd_sno3());
				dest.bd_sno4(_dtlR.bd_sno4());
				dest.bd_loc_cd(_dtlR.bd_loc_cd());
				dest.bd_lot_no(_dtlR.bd_lot_no());
				dest.bd_sublot_no(_dtlR.bd_sublot_no());
				dest.bd_dpt_cd(_dtlR.bd_dpt_cd());
				dest.bd_ctg_cd(_dtlR.bd_ctg_cd());
				dest.bd_oper_cd(_dtlR.bd_oper_cd());
				dest.bd_slo_no(_dtlR.bd_slo_no());
				dest.bd_iv_no(_dtlR.bd_iv_no());
				dest.bd_po_no(_dtlR.bd_po_no());
				dest.trd_d_rmrks(_dtlR.trd_d_rmrks());
				dest.intr_rmrks(_dtlR.intr_d_rmrks());
				dest.sub_char1(_dtlR.sub_d_char1());
				dest.sub_char2(_dtlR.sub_d_char2());
				dest.sub_char3(_dtlR.sub_d_char3());
			}
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			dest.arr_ptn_typ(src.getStringNE("arr_ptn_typ"));
			
		}
		
		
		
	}

	/**
	 * RowMapper<br>
	 * 仕入実績受払(MST_PURC_ACT_IO_R) -> 上り電文(Purc_Chk03_IoR)<br>
	 * ※仕入実績明細訂正専用
	 */
	protected Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<Purc_Chk03_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R() {
		if (_Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R == null) {
			_Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R = new Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<Purc_Chk03_IoR, MST_PURC_ACT_IO_R>();
		}
		return _Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R;
	}
	protected Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<Purc_Chk03_IoR, MST_PURC_ACT_IO_R> _Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R = null;
	public class Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<D extends Purc_Chk03_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
			addColumnPathMap(Purc_Chk03_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
			addColumnPathMap(Purc_Chk03_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$from_gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_wg_cd, MST_PURC_ACT_IO_R.$gi_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, MST_PURC_ACT_IO_R.$gi_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, MST_PURC_ACT_IO_R.$gi_str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, MST_PURC_ACT_IO_R.$gi_unit_cd);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		
		
		
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Chk01_DtlR) -> 上り電文(Purc_Ins01_HdrR)
	 */
	protected Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR<Purc_Ins01_HdrR,Purc_Chk01_DtlR> createMap_Purc_Ins01_HdrR_Purc_Chk01_DtlR() {
		if (_Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR == null) {
			_Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR = new Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR<Purc_Ins01_HdrR, Purc_Chk01_DtlR>();
		}
		return _Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR;
	}
	protected Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR<Purc_Ins01_HdrR, Purc_Chk01_DtlR> _Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR = null;
	public class Map_Purc_Ins01_HdrR_Purc_Chk01_DtlR<D extends Purc_Ins01_HdrR, S extends Purc_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_HdrR.$pa, Purc_Chk01_DtlR.$pa);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_calc_typ, Purc_Chk01_DtlR.$purc_tax_calc_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$amt_dec_place, Purc_Chk01_DtlR.$amt_dec_place);
			addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Purc_Chk01_DtlR.$can_ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, Purc_Chk01_DtlR.$rcpt_iv_no);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_mng_no, Purc_Chk01_DtlR.$rcpt_iv_mng_no);

		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Chk01_DtlR) -> 上り電文(Purc_Ins01_DtlR)
	 */
	protected Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR<Purc_Ins01_DtlR,Purc_Chk01_DtlR> createMap_Purc_Ins01_DtlR_Purc_Chk01_DtlR() {
		if (_Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR == null) {
			_Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR = new Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR<Purc_Ins01_DtlR, Purc_Chk01_DtlR>();
		}
		return _Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR;
	}
	protected Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR<Purc_Ins01_DtlR, Purc_Chk01_DtlR> _Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR = null;
	public class Map_Purc_Ins01_DtlR_Purc_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Purc_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Purc_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_ptn_typ, Purc_Chk01_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$pad, Purc_Chk01_DtlR.$pad);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, Purc_Chk01_DtlR.$sub_d_char1);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, Purc_Chk01_DtlR.$sub_d_char2);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, Purc_Chk01_DtlR.$sub_d_char3);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_typ, Purc_Chk01_DtlR.$tax_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_rate, Purc_Chk01_DtlR.$tax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$asset_mng_typ, Purc_Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, Purc_Chk01_DtlR.$xpns_po_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_cont_qty, Purc_Chk01_DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, Purc_Chk01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_schd_no, Purc_Chk01_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_act_no, Purc_Chk01_DtlR.$arr_act_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, Purc_Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$pack_unit_cd, Purc_Chk01_DtlR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$pack_unit_qty, Purc_Chk01_DtlR.$pack_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$gi_loc_cd, Purc_Chk01_DtlR.$gi_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$gi_wg_cd, Purc_Chk01_DtlR.$gi_wg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$gi_str_ln_cd, Purc_Chk01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$gi_unit_cd, Purc_Chk01_DtlR.$gi_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$from_gd_cd, Purc_Chk01_DtlR.$from_gd_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$crt_lot_flg, Purc_Chk01_DtlR.$crt_lot_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$ship_fr_valid_dt, Purc_Chk01_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, Purc_Chk01_DtlR.$abort_flg);
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR) -> 上り電文(Purc_Ins01_IoR)
	 */	
	protected Map_Purc_Ins01_IoR_Purc_Ins01_DtlR<Purc_Ins01_IoR,Purc_Ins01_DtlR> createMap_Purc_Ins01_IoR_Purc_Ins01_DtlR() {
		if (_Map_Purc_Ins01_IoR_Purc_Ins01_DtlR == null) {
			_Map_Purc_Ins01_IoR_Purc_Ins01_DtlR = new Map_Purc_Ins01_IoR_Purc_Ins01_DtlR<Purc_Ins01_IoR, Purc_Ins01_DtlR>();
		}
		return _Map_Purc_Ins01_IoR_Purc_Ins01_DtlR;
	}
	protected Map_Purc_Ins01_IoR_Purc_Ins01_DtlR<Purc_Ins01_IoR, Purc_Ins01_DtlR> _Map_Purc_Ins01_IoR_Purc_Ins01_DtlR = null;
	public class Map_Purc_Ins01_IoR_Purc_Ins01_DtlR<D extends Purc_Ins01_IoR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Purc_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Purc_Ins01_DtlR.$in_to_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Purc_Ins01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Purc_Ins01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$ver_no, Purc_Ins01_DtlR.$ver_no);
			addColumnPathMap(Purc_Ins01_IoR.$lot_no, Purc_Ins01_DtlR.$lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Purc_Ins01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Purc_Ins01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Purc_Ins01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Purc_Ins01_DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Ins01_IoR.$stk_id_typ, Purc_Ins01_DtlR.$stk_id_typ);
			addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, Purc_Ins01_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, Purc_Ins01_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, Purc_Ins01_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$ship_fr_valid_dt, Purc_Ins01_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Purc_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Purc_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_upri, Purc_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_upri, Purc_Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_upri, Purc_Ins01_DtlR.$base_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_upri, Purc_Ins01_DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_dscnt_amt, Purc_Ins01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_onr_prov_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_tax_amt, Purc_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_upri, Purc_Ins01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_upri, Purc_Ins01_DtlR.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_upri, Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_dscnt_amt, Purc_Ins01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_amt, Purc_Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_proc_amt, Purc_Ins01_DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_onr_prov_amt, Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_tax_amt, Purc_Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char1, Purc_Ins01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char2, Purc_Ins01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char3, Purc_Ins01_DtlR.$sub_char3);
			addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Ins01_DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_IoR.$arr_act_no, Purc_Ins01_DtlR.$arr_act_no);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, Purc_Ins01_DtlR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, Purc_Ins01_DtlR.$pack_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, Purc_Ins01_DtlR.$gi_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, Purc_Ins01_DtlR.$gi_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, Purc_Ins01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, Purc_Ins01_DtlR.$gi_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Purc_Ins01_DtlR.$from_gd_cd);
			addColumnPathMap(Purc_Ins01_IoR.$crt_lot_flg, Purc_Ins01_DtlR.$crt_lot_flg);
			
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_HdrR) -> 上り電文(Purc_Chk03_HdrR)
	 */
	protected Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR<Purc_Chk03_HdrR,Purc_Ins01_HdrR> createMap_Purc_Chk03_HdrR_Purc_Ins01_HdrR() {
		if (_Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR == null) {
			_Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR = new Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR<Purc_Chk03_HdrR, Purc_Ins01_HdrR>();
		}
		return _Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR;
	}
	protected Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR<Purc_Chk03_HdrR, Purc_Ins01_HdrR> _Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR = null;
	public class Map_Purc_Chk03_HdrR_Purc_Ins01_HdrR<D extends Purc_Chk03_HdrR, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_HdrR.$data_crud_typ, Purc_Ins01_HdrR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$pa, Purc_Ins01_HdrR.$pa);
			addColumnPathMap(Purc_Chk03_HdrR.$peg_no, Purc_Ins01_HdrR.$peg_no);
			addColumnPathMap(Purc_Chk03_HdrR.$aprv_flg, Purc_Ins01_HdrR.$aprv_flg);
			addColumnPathMap(Purc_Chk03_HdrR.$aprv_no, Purc_Ins01_HdrR.$aprv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_amt_rnd_typ, Purc_Ins01_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_tax_rnd_typ, Purc_Ins01_HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_tax_calc_typ, Purc_Ins01_HdrR.$purc_tax_calc_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, Purc_Ins01_HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$xrate, Purc_Ins01_HdrR.$xrate);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_xrate, Purc_Ins01_HdrR.$ptax_xrate);

		}
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR) -> 上り電文(Purc_Chk03_IoR)
	 */
	protected Map_Purc_Chk03_IoR_Purc_Ins01_IoR<Purc_Chk03_IoR,Purc_Ins01_IoR> createMap_Purc_Chk03_IoR_Purc_Ins01_IoR() {
		if (_Map_Purc_Chk03_IoR_Purc_Ins01_IoR == null) {
			_Map_Purc_Chk03_IoR_Purc_Ins01_IoR = new Map_Purc_Chk03_IoR_Purc_Ins01_IoR<Purc_Chk03_IoR, Purc_Ins01_IoR>();
		}
		_Map_Purc_Chk03_IoR_Purc_Ins01_IoR.setWith(null);
		return _Map_Purc_Chk03_IoR_Purc_Ins01_IoR;
	}
	protected Map_Purc_Chk03_IoR_Purc_Ins01_IoR<Purc_Chk03_IoR, Purc_Ins01_IoR> _Map_Purc_Chk03_IoR_Purc_Ins01_IoR = null;
	public class Map_Purc_Chk03_IoR_Purc_Ins01_IoR<D extends Purc_Chk03_IoR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		
		protected MCList<Purc_Chk02_IoR> _chk02IoL = null;
		protected void setWith(MCList<Purc_Chk02_IoR> chk02IoL) {
			_chk02IoL = chk02IoL;
		}
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_IoR.$src_peg_no, Purc_Ins01_IoR.$src_peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, Purc_Ins01_IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$peg_no, Purc_Ins01_IoR.$peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$pai, Purc_Ins01_IoR.$pai);
			addColumnPathMap(Purc_Chk03_IoR.$purc_cont_qty, Purc_Ins01_IoR.$purc_cont_qty);
			addColumnPathMap(Purc_Chk03_IoR.$gi_wg_cd, Purc_Ins01_IoR.$gi_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, Purc_Ins01_IoR.$gi_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, Purc_Ins01_IoR.$gi_str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, Purc_Ins01_IoR.$gi_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$from_gd_cd, Purc_Ins01_IoR.$from_gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Ins01_IoR.$in_to_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Ins01_IoR.$in_to_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Ins01_IoR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Ins01_IoR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Ins01_IoR.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$crt_lot_flg, Purc_Ins01_IoR.$crt_lot_flg);
			addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Ins01_IoR.$stk_bp_cd);
			addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Ins01_IoR.$ship_fr_valid_dt);

		}		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 上り電文リストからpeg_noが一致する電文を取得し、err_flgを連携する
			if (!isNull(_chk02IoL)) {
				Purc_Chk02_IoR chk02IoR = _chk02IoL.getFirst(Purc_Chk02_IoR.$peg_no, src.peg_no());
				if (!isNull(chk02IoR)) {
					dest.err_flg(chk02IoR.err_flg());
				}
			}
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR) -> 上り電文(Purc_Chk03_DtlR)
	 */
	protected Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR<Purc_Chk03_DtlR,Purc_Ins01_DtlR> createMap_Purc_Chk03_DtlR_Purc_Ins01_DtlR() {
		if (_Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR == null) {
			_Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR = new Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR<Purc_Chk03_DtlR, Purc_Ins01_DtlR>();
		}
		_Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR.setWith(null);
		return _Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR<Purc_Chk03_DtlR, Purc_Ins01_DtlR> _Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR = null;
	public class Map_Purc_Chk03_DtlR_Purc_Ins01_DtlR<D extends Purc_Chk03_DtlR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		
		protected MCList<Purc_Chk01_DtlR> _chk01DtlL = null;
		protected void setWith(MCList<Purc_Chk01_DtlR> chk01DtlL) {
			_chk01DtlL = chk01DtlL;
		}
		
		@Override
		protected void setupColumnPathMap() {
			
			// データ更新区分、pegNO
			addColumnPathMap(Purc_Chk03_DtlR.$data_crud_typ, Purc_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(Purc_Chk03_DtlR.$hdr_peg_no, Purc_Ins01_DtlR.$hdr_peg_no);
			
			// 業務関連のNO
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$po_d_no, Purc_Ins01_DtlR.$po_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, Purc_Ins01_DtlR.$purc_schd_no);
			addColumnPathMap(Purc_Chk03_DtlR.$arr_schd_no, Purc_Ins01_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Chk03_DtlR.$rcpt_iv_d_no, Purc_Ins01_DtlR.$rcpt_iv_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_typ, Purc_Ins01_DtlR.$purc_src_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_no, Purc_Ins01_DtlR.$purc_src_no);
			addColumnPathMap(Purc_Chk03_DtlR.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);
			
			// 品目
			addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, Purc_Ins01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, Purc_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, Purc_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, Purc_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$ver_no, Purc_Ins01_DtlR.$ver_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, Purc_Ins01_DtlR.$itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$iv_itm_nm, Purc_Ins01_DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_cd, Purc_Ins01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_nm, Purc_Ins01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sundry_itm_flg, Purc_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, Purc_Ins01_DtlR.$stk_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$asset_mng_typ, Purc_Ins01_DtlR.$asset_mng_typ);

			// 単位・数量など
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, Purc_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, Purc_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_cont_qty, Purc_Ins01_DtlR.$purc_cont_qty);
			
			// 単価・金額など
			addColumnPathMap(Purc_Chk03_DtlR.$upri_not_tgt_flg, Purc_Ins01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, Purc_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, Purc_Ins01_DtlR.$interim_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, Purc_Ins01_DtlR.$tax_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_upri, Purc_Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_dscnt_amt, Purc_Ins01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_upri, Purc_Ins01_DtlR.$base_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_upri, Purc_Ins01_DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_onr_prov_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_upri, Purc_Ins01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_dscnt_amt, Purc_Ins01_DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_amt, Purc_Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_upri, Purc_Ins01_DtlR.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_proc_amt, Purc_Ins01_DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_upri, Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_onr_prov_amt, Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$base_cur_tax_amt, Purc_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, Purc_Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, Purc_Ins01_DtlR.$wtax_rate);
			addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, Purc_Ins01_DtlR.$abort_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			
			// 理由
			addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, Purc_Ins01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, Purc_Ins01_DtlR.$rsn_cd);
			
			// 負担項目
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_cd, Purc_Ins01_DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub1, Purc_Ins01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub2, Purc_Ins01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub3, Purc_Ins01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno1, Purc_Ins01_DtlR.$bd_sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno2, Purc_Ins01_DtlR.$bd_sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno3, Purc_Ins01_DtlR.$bd_sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno4, Purc_Ins01_DtlR.$bd_sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_lot_no, Purc_Ins01_DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sublot_no, Purc_Ins01_DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_ctg_cd, Purc_Ins01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_oper_cd, Purc_Ins01_DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_iv_no, Purc_Ins01_DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_loc_cd, Purc_Ins01_DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_po_no, Purc_Ins01_DtlR.$bd_po_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_slo_no, Purc_Ins01_DtlR.$bd_slo_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_dpt_cd, Purc_Ins01_DtlR.$bd_dpt_cd);
			
			// 業者ロット、業者納品書ＮＯ・明細ＮＯ
			addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, Purc_Ins01_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, Purc_Ins01_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Purc_Ins01_DtlR.$bp_dlv_slip_d_no);
			
			// 備考・予備
			addColumnPathMap(Purc_Chk03_DtlR.$intr_rmrks, Purc_Ins01_DtlR.$intr_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_d_rmrks, Purc_Ins01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char1, Purc_Ins01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char2, Purc_Ins01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Chk03_DtlR.$sub_char3, Purc_Ins01_DtlR.$sub_char3);
			
			// 参考情報NO
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_no, Purc_Ins01_DtlR.$ref_purc_act_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_seq, Purc_Ins01_DtlR.$ref_purc_act_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_no, Purc_Ins01_DtlR.$ref_purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_seq, Purc_Ins01_DtlR.$ref_purc_act_d_seq);

			// 再入荷関連
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_flg, Purc_Ins01_DtlR.$re_arr_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_cd, Purc_Ins01_DtlR.$re_arr_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_wg_cd, Purc_Ins01_DtlR.$re_arr_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_str_ln_cd, Purc_Ins01_DtlR.$re_arr_str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_rqst_tm, Purc_Ins01_DtlR.$re_arr_rqst_tm);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_purc_schd_dt, Purc_Ins01_DtlR.$re_arr_purc_schd_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$re_arr_sync_flg, Purc_Ins01_DtlR.$re_arr_sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_re_arr_qty, Purc_Ins01_DtlR.$trd_unit_re_arr_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_re_arr_qty, Purc_Ins01_DtlR.$base_unit_re_arr_qty);

			// 場所・ロット・在庫
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, Purc_Ins01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sno1, Purc_Ins01_DtlR.$sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$sno2, Purc_Ins01_DtlR.$sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$sno3, Purc_Ins01_DtlR.$sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$sno4, Purc_Ins01_DtlR.$sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, Purc_Ins01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_wg_cd, Purc_Ins01_DtlR.$in_to_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, Purc_Ins01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Purc_Ins01_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Purc_Ins01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$quality_typ, Purc_Ins01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_insp_typ, Purc_Ins01_DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_id_typ, Purc_Ins01_DtlR.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, Purc_Ins01_DtlR.$disp_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$edi_flg, Purc_Ins01_DtlR.$edi_flg);
			
			// その他
			addColumnPathMap(Purc_Chk03_DtlR.$accpt_dfct_flg, Purc_Ins01_DtlR.$accpt_dfct_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$ncv_flg, Purc_Ins01_DtlR.$ncv_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$maker_cd, Purc_Ins01_DtlR.$maker_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, Purc_Ins01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, Purc_Ins01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Chk03_DtlR.$arr_ptn_typ, Purc_Ins01_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$sync_flg, Purc_Ins01_DtlR.$sync_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$xpns_po_flg, Purc_Ins01_DtlR.$xpns_po_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_id_typ, Purc_Ins01_DtlR.$purc_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$arr_sync_flg, Purc_Ins01_DtlR.$arr_sync_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 上り電文リストからpeg_noが一致する電文を取得し、err_flgを連携する
			if (!isNull(_chk01DtlL)) {
				Purc_Chk01_DtlR chk01DtlR = _chk01DtlL.getFirst(Purc_Chk01_DtlR.$peg_no, src.peg_no());
				if (!isNull(chk01DtlR)) {
					dest.err_flg(chk01DtlR.err_flg());
				}
			}
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_HdrR) -> 受払実績ワーク作成サービス.上り電文(IoAct_Ins01_DtlR)<br>
	 * ヘッダ上り電文(新規登録)を受払実績WKサービスの上り電文に連携するマッピング
	 */
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR<IoAct_Ins01_DtlR,Purc_Ins01_HdrR> createMap_IoAct_Ins01_DtlR_Purc_Ins01_HdrR() {
		if (_Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR == null) {
			_Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR = new Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR<IoAct_Ins01_DtlR, Purc_Ins01_HdrR>();
		}
		return _Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR;
	}
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR<IoAct_Ins01_DtlR, Purc_Ins01_HdrR> _Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR = null;
	public class Map_IoAct_Ins01_DtlR_Purc_Ins01_HdrR<D extends IoAct_Ins01_DtlR, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, Purc_Ins01_HdrR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, Purc_Ins01_HdrR.$ac_dt);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_tm, Purc_Ins01_HdrR.$purc_dt);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, Purc_Ins01_HdrR.$trd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_ptn_typ, Purc_Ins01_HdrR.$trd_ptn_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$purc_dpt_cd, Purc_Ins01_HdrR.$purc_dpt_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$purc_usr_cd, Purc_Ins01_HdrR.$purc_usr_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_cd, Purc_Ins01_HdrR.$trd_cur_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_cd, Purc_Ins01_HdrR.$base_cur_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_cd, Purc_Ins01_HdrR.$ptax_cur_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$xrate_cd, Purc_Ins01_HdrR.$xrate_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$xrate, Purc_Ins01_HdrR.$xrate);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_xrate_cd, Purc_Ins01_HdrR.$xrate_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_xrate, Purc_Ins01_HdrR.$ptax_xrate);
			addColumnPathMap(IoAct_Ins01_DtlR.$asppl_cd, Purc_Ins01_HdrR.$asppl_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$sppl_cd, Purc_Ins01_HdrR.$sppl_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, Purc_Ins01_HdrR.$trd_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$po_no, Purc_Ins01_HdrR.$po_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$rcpt_iv_no, Purc_Ins01_HdrR.$rcpt_iv_no);

		}
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 受払実績ワーク作成サービス.上り電文(IoAct_Ins01_DtlR)<br>
	 * 明細上り電文(新規登録)を受払実績WKサービスの上り電文に連携するマッピング
	 */
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR<IoAct_Ins01_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_IoAct_Ins01_DtlR_Purc_Ins01_DtlR() {
		if (_Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR == null) {
			_Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR = new Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR<IoAct_Ins01_DtlR, Purc_Ins01_DtlR,Purc_Ins01_HdrR>();
		}
		_Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR.setWith(null);
		return _Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR<IoAct_Ins01_DtlR, Purc_Ins01_DtlR,Purc_Ins01_HdrR>
		_Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR = null;
	public class Map_IoAct_Ins01_DtlR_Purc_Ins01_DtlR<D extends IoAct_Ins01_DtlR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_HdrR;
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, Purc_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, Purc_Ins01_DtlR.$rsn_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$ap_dpt_cd, Purc_Ins01_DtlR.$ap_dpt_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, Purc_Ins01_DtlR.$sno1_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, Purc_Ins01_DtlR.$sno2_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, Purc_Ins01_DtlR.$sno3_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, Purc_Ins01_DtlR.$sno4_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1, Purc_Ins01_DtlR.$sno1);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2, Purc_Ins01_DtlR.$sno2);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3, Purc_Ins01_DtlR.$sno3);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4, Purc_Ins01_DtlR.$sno4);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, Purc_Ins01_DtlR.$itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, Purc_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, Purc_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, Purc_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_nm, Purc_Ins01_DtlR.$itm_nm);
			addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg, Purc_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(IoAct_Ins01_DtlR.$tax_cd, Purc_Ins01_DtlR.$tax_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$purc_typ, Purc_Ins01_DtlR.$purc_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks, Purc_Ins01_DtlR.$trd_d_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$temp_ap_flg, Purc_Ins01_DtlR.$temp_ap_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// ヘッダ電文の取引パタン区分を取得
			String trdPtnTyp = _purc_Ins01_HdrR.trd_ptn_typ();
			
			if (isIoActTgtPurc(trdPtnTyp)) {
				// 仕入実績ＮＯ
				dest.act_no(_purc_Ins01_HdrR.purc_act_no());
				dest.act_seq(_purc_Ins01_HdrR.purc_act_seq());
				dest.act_rev_no(_purc_Ins01_HdrR.purc_act_rev());
				dest.act_d_no(src.purc_act_d_no());
				dest.act_d_seq(src.purc_act_d_seq());
				// トランザクション区分
				dest.trn_typ(MSC_TRN_TYP.PURC.value());
			}
			else if (isIoActTgtPurcRet(trdPtnTyp)) {
				// 仕入返品実績ＮＯ
				dest.act_no(_purc_Ins01_HdrR.purc_ret_act_no());
				dest.act_rev_no(_purc_Ins01_HdrR.purc_ret_act_rev());
				dest.act_d_no(src.purc_ret_act_d_no());
				// トランザクション区分
				dest.trn_typ(MSC_TRN_TYP.PURC_RTN.value());
				MST_PURC_ACT_D_R padRow = getPurcActDCache().get(src.purc_act_d_no(), src.purc_act_d_seq());
				if (!isNull(padRow.getStringNE("purc_ret_schd_d_no")) || !isNull(padRow.getStringNE("sls_act_d_no"))) {
					dest.no_gi_alloc_flg(true);
				}
			}
			
			// 金額未確定ＦＬＧ
			if (isPurcTrdPtnTyp(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || isRtnTrdPtnTyp(trdPtnTyp)) {
				dest.un_fix_flg(src.interim_flg());
			}

			if (!MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp)) {
				// 理由ＣＤ
				dest.rsn_cd(src.rsn_cd());
			}
			addColumnPathMap(IoAct_Ins01_DtlR.$po_no, Purc_Ins01_DtlR.$po_no);
			
			if (!isNull(src.po_no())) {
				dest.po_no(src.po_no());
			}
			
			// 経費仕入、経費購買返品、値引・値増、経費値引・値増のいずれか、または、経費購買ＦＬＧがオンの場合
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp) || isDscntTrdPtnTyp(trdPtnTyp) || src.xpns_po_flg()) {
				// 親品目
				dest.par_itm_cd(src.bd_itm_cd());
				dest.par_itm_sub1(src.bd_itm_sub1());
				dest.par_itm_sub2(src.bd_itm_sub2());
				dest.par_itm_sub3(src.bd_itm_sub3());
				dest.par_itm_nm(src.bd_itm_nm());
				dest.par_lot_no(src.bd_lot_no());
				dest.par_sublot_no(src.bd_sublot_no());
				dest.par_sno1(src.bd_sno1());
				dest.par_sno2(src.bd_sno2());
				dest.par_sno3(src.bd_sno3());
				dest.par_sno4(src.bd_sno4());
				// 負担項目
				dest.bd_dpt_cd(src.bd_dpt_cd());
				dest.bd_ctg_cd(src.bd_ctg_cd());
				dest.bd_bp_cd(src.bd_bp_cd());
				dest.bd_oper_cd(src.bd_oper_cd());
				dest.bd_loc_cd(src.bd_loc_cd());
				dest.bd_slo_no(src.bd_slo_no());
				dest.bd_po_no(src.bd_po_no());
				dest.bd_iv_no(src.bd_iv_no());
				dest.bd_wg_cd(src.bd_wg_cd());
			}
			
			// 入荷パタン
			if (isPurcTrdPtnTyp(trdPtnTyp)) {
				dest.arr_ptn_typ(src.arr_ptn_typ());
			}
			
			// 購買識別区分
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp)) {
				dest.purc_id_typ(src.purc_id_typ());
			}
			
			// 在庫管理区分
			if (isPurcTrdPtnTyp(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || isRtnTrdPtnTyp(trdPtnTyp) || isDscntTrdPtnTyp(trdPtnTyp)) {
				dest.stk_mng_typ(src.stk_mng_typ());
			}
			
			// 発注先品目・品名
			if (isPurcTrdPtnTyp(trdPtnTyp) || isRtnTrdPtnTyp(trdPtnTyp) || isDscntTrdPtnTyp(trdPtnTyp)) {
				dest.sppl_itm_cd(src.sppl_itm_cd());
				dest.sppl_itm_nm(src.sppl_itm_nm());
			}
			// 受注紐付の場合は、対応する受注ＮＯを設定
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) && !isNull(src.po_d_no())) {
				MST_PO_D_R poDR = getPoDCache().get(src.po_d_no());
				dest.slo_no(poDR.slo_no());
			}
		}
		
		
	}
	
	protected boolean isDscntTrdPtnTyp(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp);
	}
	
	protected boolean isPurcTrdPtnTyp(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp);
	}
	
	protected boolean isRtnTrdPtnTyp(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp);
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR), 上り電文(Purc_Ins01_HdrR) -> 受払実績ワーク作成サービス.上り電文(IoAct_Ins01_DtlR)<br>
	 */
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR<IoAct_Ins01_DtlR,Purc_Ins01_IoR,Purc_Ins01_HdrR> createMap_IoAct_Ins01_DtlR_Purc_Ins01_IoR() {
		if (_Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR == null) {
			_Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR = new Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR<IoAct_Ins01_DtlR, Purc_Ins01_IoR,Purc_Ins01_HdrR>();
		}
		_Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR.setWith((Purc_Ins01_HdrR)null);
		_Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR.setDtlR(null);
		_Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR.setWith((MST_ARR_ACT_R)null);
		return _Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR;
	}
	protected Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR<IoAct_Ins01_DtlR, Purc_Ins01_IoR,Purc_Ins01_HdrR> _Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR = null;
	public class Map_IoAct_Ins01_DtlR_Purc_Ins01_IoR<D extends IoAct_Ins01_DtlR, S extends Purc_Ins01_IoR, W extends Purc_Ins01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		
		protected W _purc_Ins01_HdrR;
		protected Purc_Ins01_DtlR _dtlR;
		protected MST_ARR_ACT_R _arrActR;
		protected MAVM_ITM_UNIT_R _itmUnitR;
		
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		protected void setDtlR(Purc_Ins01_DtlR dtlR){
			this._dtlR = dtlR;
		}
		protected void setWith(MST_ARR_ACT_R _arrActR) {
			this._arrActR = _arrActR;
		}
		protected void setWith(MAVM_ITM_UNIT_R _itmUnitR) {
			this._itmUnitR = _itmUnitR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, Purc_Ins01_IoR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, Purc_Ins01_IoR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, Purc_Ins01_IoR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, Purc_Ins01_IoR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, Purc_Ins01_IoR.$pack_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, Purc_Ins01_IoR.$pack_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, Purc_Ins01_IoR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, Purc_Ins01_IoR.$base_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_upri, Purc_Ins01_IoR.$trd_cur_upri);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_amt, Purc_Ins01_IoR.$trd_cur_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_tax_amt, Purc_Ins01_IoR.$trd_cur_tax_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_upri, Purc_Ins01_IoR.$base_cur_upri);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_amt, Purc_Ins01_IoR.$base_cur_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_cur_tax_amt, Purc_Ins01_IoR.$base_cur_tax_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_upri, Purc_Ins01_IoR.$ptax_cur_upri);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_amt, Purc_Ins01_IoR.$ptax_cur_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$ptax_cur_tax_amt, Purc_Ins01_IoR.$ptax_cur_tax_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, Purc_Ins01_IoR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$wtax_amt, Purc_Ins01_IoR.$wtax_amt);
			addColumnPathMap(IoAct_Ins01_DtlR.$stktk_diff_qty, Purc_Ins01_IoR.$so_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// ヘッダ電文の取引パタン区分を取得
			String trdPtnTyp = _purc_Ins01_HdrR.trd_ptn_typ();
			
			// 取消計上日
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				dest.can_ac_dt(_purc_Ins01_HdrR.can_ac_dt());
			}
			
			// 実績受払NO
			if (isIoActTgtPurc(trdPtnTyp)) {
				dest.act_io_no(src.purc_act_io_no());
				dest.act_io_seq(src.purc_act_io_seq());
			}
			else if (isIoActTgtPurcRet(trdPtnTyp)) {
				dest.act_io_no(src.purc_ret_act_io_no());
			}
			
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
				
				if (!isNull(src.arr_schd_no()) && (MSC_ARR_PTN_TYP.isN_YET_ARR(src.getStringNE("arr_ptn_typ")) || _arrActR == null)) {
					// 未着管理の場合
					// 入庫ＷＧ、入庫場所ＣＤ、入庫棚・ラインＣＤ、入庫格付ＣＤに、仕入場所と棚・ライン、仕入場所のWG、仕入後の格付ＣＤの値をセット
					dest.gr_wg_cd(src.gi_wg_cd());
					dest.gr_loc_cd(src.gi_loc_cd());
					dest.gr_str_ln_cd(src.gi_str_ln_cd());
					dest.gr_gd_cd(src.gd_cd());
				}
				else {
					// 計画外仕入,または同時計上の場合は出庫場所は設定しない
					if (isNull(_dtlR.purc_schd_no()) || _dtlR.sync_flg()) {
						dest.gr_wg_cd(src.in_to_loc_wg_cd());
						dest.gr_loc_cd(src.in_to_loc_cd());
						dest.gr_str_ln_cd(src.str_ln_cd());
					}
					else {
						dest.gr_wg_cd(src.gi_wg_cd());
						dest.gr_loc_cd(src.gi_loc_cd());
						dest.gr_str_ln_cd(src.gi_str_ln_cd());
					}
					
					// 出庫格付は画面からの値を受け取る(入荷時の格付だけでなく、検査で変更された格付を受け取るケースもあるため)
					dest.gr_gd_cd(src.gd_cd());
					// 格納場所,格納棚・ライン
					dest.strg_loc_cd(src.in_to_loc_cd());
					dest.strg_str_ln_cd(src.str_ln_cd());
					// 仕入計上しようとしている取引単位が、現状在庫の単位と異なる場合、現状在庫の荷姿単位在庫をいくつ崩すか指定する
					if (_arrActR != null && isBaseUnitConvTgt(src)) {
						MCNumber packXfrUnitQty = rvrsBaseUnitConv(src.base_unit_qty(), _itmUnitR.conv_base_qty(),
								_itmUnitR.conv_qty(), _itmUnitR.dec_place(), MAC_RND_TYP.RNDUP.value());
						dest.pack_xfr_unit_cd(src.gi_unit_cd());
						dest.pack_xfr_qty(packXfrUnitQty);
					}
					
				}
			}
			else if (MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				// 出庫ＷＧ、出庫場所ＣＤ、出庫棚・ラインＣＤ、出庫格付ＣＤに値をセット
				dest.gi_wg_cd(src.in_to_loc_wg_cd());
				dest.gi_loc_cd(src.in_to_loc_cd());
				dest.gi_str_ln_cd(src.str_ln_cd());
				dest.gi_gd_cd(src.gd_cd());
			}
			
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) 
					|| MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				// 積送品区分 「通常」固定
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				// 在庫検査区分
				dest.stk_insp_typ(src.stk_insp_typ());
			}
			
			// 在庫着荷先
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) 
					|| MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp)) {
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else if (MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
			}
			
			// 在庫識別区分
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.getStringNE("arr_ptn_typ"))) {
					// 未着管理の場合は「自社在庫」固定
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				else {
					// 通常管理の場合は「仕入検収前」で、積送品区分は「在庫」
					dest.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
				}
			}
			else if (MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp)) {
				// VMIの場合は「VMI」固定
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
			}
			else if (MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				// 返品時はそのまま受払実績WKサービスに連携する
				dest.stk_id_typ(src.stk_id_typ());
			}
			
			// 在庫取引先ＣＤ
			if (MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp)) {
				dest.stk_bp_cd(_purc_Ins01_HdrR.sppl_cd());
				
			}
			else if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.arr_ptn_typ())) {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					dest.stk_bp_cd(_purc_Ins01_HdrR.sppl_cd());
				}
			}
			else if (MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				if (MSC_STK_ID_TYP.isACCPT_DFCT(src.stk_id_typ())) {
					dest.stk_bp_cd(_purc_Ins01_HdrR.sppl_cd());
				}
				else if (MSC_STK_ID_TYP.isONR_PROV(src.stk_id_typ())) {
					dest.stk_bp_cd(src.stk_bp_cd());
				}
				else {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
			
			// 加工金額、有償支給金額
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp)) {
				if (!src.getBooleanNE("xpns_po_flg")) {
					// 取引パタン「仕入」「仕入返品」で経費購買でない
					dest.trd_cur_proc_amt(src.trd_cur_proc_amt());
					dest.trd_cur_onr_prov_amt(src.trd_cur_onr_prov_amt());
					dest.base_cur_proc_amt(src.base_cur_proc_amt());
					dest.base_cur_onr_prov_amt(src.base_cur_onr_prov_amt());
					dest.ptax_cur_proc_amt(src.ptax_cur_proc_amt());
					dest.ptax_cur_onr_prov_amt(src.ptax_cur_onr_prov_amt());
				}
			}
			
			// 源泉税率
			dest.wtax_rate(_dtlR.wtax_rate());
			
			// 検収不良
			dest.accpt_dfct_flg(_dtlR.accpt_dfct_flg());
			
			// 確定ＮＯ区分、確定ＮＯ
			if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
				
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(_dtlR.arr_ptn_typ())) {
					// 未着管理の場合は「仕入実績受払NO」を確定ＮＯにセットする
					dest.fix_no_typ(MSC_FIX_NO_TYP.PURC_ACT_IO_NO.value());
					dest.fix_no(src.purc_act_io_no());
				}
				else {
					// 通常管理の場合は「入荷実績NO」を確定ＮＯにセットする
					// （仕入諸掛分は入荷がないので何も設定しない）
					if (!isNullOrNullVal(src.arr_act_no())) {
						dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						dest.fix_no(src.arr_act_no());
					}
				}
				
			}
			MST_INSP_ACT_R inspR = getInspActCache(src.arr_act_no());
			if (!isNull(inspR)) {
				dest.bd_dpt_cd(inspR.getString("bd_dpt_cd"));
			}
			
		}
		
		protected boolean isBaseUnitConvTgt(S src) {
			return !isSame(_arrActR.pack_unit_cd(), src.pack_unit_cd()) && isSame(src.base_unit_cd(), src.pack_unit_cd());
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_HdrR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Ins01_HdrR<ArrAct_DtlR,Purc_Ins01_HdrR> createMap_ArrAct_DtlR_Purc_Ins01_HdrR() {
		if (_Map_ArrAct_DtlR_Purc_Ins01_HdrR == null) {
			_Map_ArrAct_DtlR_Purc_Ins01_HdrR = new Map_ArrAct_DtlR_Purc_Ins01_HdrR<ArrAct_DtlR, Purc_Ins01_HdrR>();
		}
		return _Map_ArrAct_DtlR_Purc_Ins01_HdrR;
	}
	protected Map_ArrAct_DtlR_Purc_Ins01_HdrR<ArrAct_DtlR, Purc_Ins01_HdrR> _Map_ArrAct_DtlR_Purc_Ins01_HdrR = null;
	public class Map_ArrAct_DtlR_Purc_Ins01_HdrR<D extends ArrAct_DtlR, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$trd_cd, Purc_Ins01_HdrR.$trd_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_ptn_typ, Purc_Ins01_HdrR.$trd_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$sppl_cd, Purc_Ins01_HdrR.$sppl_cd);
			addColumnPathMap(ArrAct_DtlR.$rcpt_iv_no, Purc_Ins01_HdrR.$rcpt_iv_no);
			addColumnPathMap(ArrAct_DtlR.$ac_dt, Purc_Ins01_HdrR.$ac_dt);
			addColumnPathMap(ArrAct_DtlR.$arr_tm, Purc_Ins01_HdrR.$purc_dt);
			addColumnPathMap(ArrAct_DtlR.$trd_rmrks, Purc_Ins01_HdrR.$trd_rmrks);
			addColumnPathMap(ArrAct_DtlR.$can_ac_dt, Purc_Ins01_HdrR.$can_ac_dt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.stk_bp_cd(src.sppl_cd());
		}
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Ins01_DtlR<ArrAct_DtlR,Purc_Ins01_DtlR> createMap_ArrAct_DtlR_Purc_Ins01_DtlR() {
		if (_Map_ArrAct_DtlR_Purc_Ins01_DtlR == null) {
			_Map_ArrAct_DtlR_Purc_Ins01_DtlR = new Map_ArrAct_DtlR_Purc_Ins01_DtlR<ArrAct_DtlR, Purc_Ins01_DtlR>();
		}
		return _Map_ArrAct_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_ArrAct_DtlR_Purc_Ins01_DtlR<ArrAct_DtlR, Purc_Ins01_DtlR> _Map_ArrAct_DtlR_Purc_Ins01_DtlR = null;
	public class Map_ArrAct_DtlR_Purc_Ins01_DtlR<D extends ArrAct_DtlR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, Purc_Ins01_DtlR.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$itm_cd, Purc_Ins01_DtlR.$itm_cd);
			addColumnPathMap(ArrAct_DtlR.$itm_sub1, Purc_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(ArrAct_DtlR.$itm_sub2, Purc_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(ArrAct_DtlR.$itm_sub3, Purc_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(ArrAct_DtlR.$sno1_mng_typ, Purc_Ins01_DtlR.$sno1_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno2_mng_typ, Purc_Ins01_DtlR.$sno2_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno3_mng_typ, Purc_Ins01_DtlR.$sno3_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno4_mng_typ, Purc_Ins01_DtlR.$sno4_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno1, Purc_Ins01_DtlR.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, Purc_Ins01_DtlR.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, Purc_Ins01_DtlR.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, Purc_Ins01_DtlR.$sno4);
			addColumnPathMap(ArrAct_DtlR.$itm_nm, Purc_Ins01_DtlR.$itm_nm);
			addColumnPathMap(ArrAct_DtlR.$sundry_itm_flg, Purc_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(ArrAct_DtlR.$purc_id_typ, Purc_Ins01_DtlR.$purc_id_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_mng_typ, Purc_Ins01_DtlR.$stk_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_cd, Purc_Ins01_DtlR.$sppl_itm_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_nm, Purc_Ins01_DtlR.$sppl_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$maker_cd, Purc_Ins01_DtlR.$maker_cd);
			addColumnPathMap(ArrAct_DtlR.$rsn_cd, Purc_Ins01_DtlR.$rsn_cd);
			addColumnPathMap(ArrAct_DtlR.$bd_dpt_cd, Purc_Ins01_DtlR.$bd_dpt_cd);
			addColumnPathMap(ArrAct_DtlR.$bd_wg_cd, Purc_Ins01_DtlR.$bd_wg_cd);
			addColumnPathMap(ArrAct_DtlR.$edi_flg, Purc_Ins01_DtlR.$edi_flg);
			addColumnPathMap(ArrAct_DtlR.$arr_ptn_typ, Purc_Ins01_DtlR.$arr_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$abort_flg, Purc_Ins01_DtlR.$abort_flg);
			addColumnPathMap(ArrAct_DtlR.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);

		}
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Ins01_IoR<ArrAct_DtlR,Purc_Ins01_IoR,Purc_Ins01_DtlR> createMap_ArrAct_DtlR_Purc_Ins01_IoR() {
		if (_Map_ArrAct_DtlR_Purc_Ins01_IoR == null) {
			_Map_ArrAct_DtlR_Purc_Ins01_IoR = new Map_ArrAct_DtlR_Purc_Ins01_IoR<ArrAct_DtlR, Purc_Ins01_IoR,Purc_Ins01_DtlR>();
		}
		_Map_ArrAct_DtlR_Purc_Ins01_IoR.setWith(null);
		return _Map_ArrAct_DtlR_Purc_Ins01_IoR;
	}
	protected Map_ArrAct_DtlR_Purc_Ins01_IoR<ArrAct_DtlR, Purc_Ins01_IoR,Purc_Ins01_DtlR> _Map_ArrAct_DtlR_Purc_Ins01_IoR = null;
	public class Map_ArrAct_DtlR_Purc_Ins01_IoR<D extends ArrAct_DtlR, S extends Purc_Ins01_IoR, W extends Purc_Ins01_DtlR> extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_DtlR;
		@Override
		public void setWith(W _purc_Ins01_DtlR){
			this._purc_Ins01_DtlR = _purc_Ins01_DtlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$peg_no, Purc_Ins01_IoR.$peg_no);
			addColumnPathMap(ArrAct_DtlR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
			addColumnPathMap(ArrAct_DtlR.$crt_lot_flg, Purc_Ins01_IoR.$crt_lot_flg);
			addColumnPathMap(ArrAct_DtlR.$lot_no, Purc_Ins01_IoR.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, Purc_Ins01_IoR.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$ver_no, Purc_Ins01_IoR.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, Purc_Ins01_IoR.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$quality_typ, Purc_Ins01_IoR.$quality_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_insp_typ, Purc_Ins01_IoR.$stk_insp_typ);
			addColumnPathMap(ArrAct_DtlR.$bp_lot_no, Purc_Ins01_IoR.$bp_lot_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_no, Purc_Ins01_IoR.$bp_dlv_slip_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_d_no, Purc_Ins01_IoR.$bp_dlv_slip_d_no);
			addColumnPathMap(ArrAct_DtlR.$ship_fr_valid_dt, Purc_Ins01_IoR.$ship_fr_valid_dt);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, Purc_Ins01_IoR.$in_to_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, Purc_Ins01_IoR.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, Purc_Ins01_IoR.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, Purc_Ins01_IoR.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$pack_unit_qty, Purc_Ins01_IoR.$pack_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$pack_unit_cd, Purc_Ins01_IoR.$pack_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, Purc_Ins01_IoR.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, Purc_Ins01_IoR.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$purc_cont_qty, Purc_Ins01_IoR.$purc_cont_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 明細の同時計上FLGを入荷実績サービスに連携
			dest.sync_flg(_purc_Ins01_DtlR.sync_flg());
			
			// データ更新区分が「新規」以外の場合は、入荷実績ＮＯを連携する
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.arr_act_no(src.arr_act_no());
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				// 入荷実績の新規登録時は、仕入検収前で連携する
				dest.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
			}
			
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(_purc_Ins01_DtlR.arr_ptn_typ())) {
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
			else {
				dest.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
			}
			
		}
		
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Chk03_HdrR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Chk03_HdrR<ArrAct_DtlR,Purc_Chk03_HdrR> createMap_ArrAct_DtlR_Purc_Chk03_HdrR() {
		if (_Map_ArrAct_DtlR_Purc_Chk03_HdrR == null) {
			_Map_ArrAct_DtlR_Purc_Chk03_HdrR = new Map_ArrAct_DtlR_Purc_Chk03_HdrR<ArrAct_DtlR, Purc_Chk03_HdrR>();
		}
		return _Map_ArrAct_DtlR_Purc_Chk03_HdrR;
	}
	protected Map_ArrAct_DtlR_Purc_Chk03_HdrR<ArrAct_DtlR, Purc_Chk03_HdrR> _Map_ArrAct_DtlR_Purc_Chk03_HdrR = null;
	public class Map_ArrAct_DtlR_Purc_Chk03_HdrR<D extends ArrAct_DtlR, S extends Purc_Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$trd_cd, Purc_Chk03_HdrR.$trd_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_ptn_typ, Purc_Chk03_HdrR.$trd_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$sppl_cd, Purc_Chk03_HdrR.$sppl_cd);
			addColumnPathMap(ArrAct_DtlR.$ac_dt, Purc_Chk03_HdrR.$ac_dt);
			addColumnPathMap(ArrAct_DtlR.$can_ac_dt, Purc_Chk03_HdrR.$can_ac_dt);
			addColumnPathMap(ArrAct_DtlR.$arr_tm, Purc_Chk03_HdrR.$purc_dt);
			addColumnPathMap(ArrAct_DtlR.$intr_rmrks, Purc_Chk03_HdrR.$intr_rmrks);
			addColumnPathMap(ArrAct_DtlR.$trd_rmrks, Purc_Chk03_HdrR.$trd_rmrks);
			addColumnPathMap(ArrAct_DtlR.$sub_char1, Purc_Chk03_HdrR.$sub_char1);
			addColumnPathMap(ArrAct_DtlR.$sub_char2, Purc_Chk03_HdrR.$sub_char2);
			addColumnPathMap(ArrAct_DtlR.$sub_char3, Purc_Chk03_HdrR.$sub_char3);
			addColumnPathMap(ArrAct_DtlR.$err_flg, Purc_Chk03_HdrR.$err_flg);

		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Chk03_DtlR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Chk03_DtlR<ArrAct_DtlR,Purc_Chk03_DtlR> createMap_ArrAct_DtlR_Purc_Chk03_DtlR() {
		if(_Map_ArrAct_DtlR_Purc_Chk03_DtlR == null) {
			_Map_ArrAct_DtlR_Purc_Chk03_DtlR = new Map_ArrAct_DtlR_Purc_Chk03_DtlR<ArrAct_DtlR, Purc_Chk03_DtlR>();
		}
		return _Map_ArrAct_DtlR_Purc_Chk03_DtlR;
	}
	protected Map_ArrAct_DtlR_Purc_Chk03_DtlR<ArrAct_DtlR, Purc_Chk03_DtlR> _Map_ArrAct_DtlR_Purc_Chk03_DtlR = null;
	public class Map_ArrAct_DtlR_Purc_Chk03_DtlR<D extends ArrAct_DtlR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, Purc_Chk03_DtlR.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$itm_cd, Purc_Chk03_DtlR.$itm_cd);
			addColumnPathMap(ArrAct_DtlR.$itm_sub1, Purc_Chk03_DtlR.$itm_sub1);
			addColumnPathMap(ArrAct_DtlR.$itm_sub2, Purc_Chk03_DtlR.$itm_sub2);
			addColumnPathMap(ArrAct_DtlR.$itm_sub3, Purc_Chk03_DtlR.$itm_sub3);
			addColumnPathMap(ArrAct_DtlR.$itm_nm, Purc_Chk03_DtlR.$itm_nm);
			addColumnPathMap(ArrAct_DtlR.$sno1, Purc_Chk03_DtlR.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, Purc_Chk03_DtlR.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, Purc_Chk03_DtlR.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, Purc_Chk03_DtlR.$sno4);
			addColumnPathMap(ArrAct_DtlR.$sundry_itm_flg, Purc_Chk03_DtlR.$sundry_itm_flg);
			addColumnPathMap(ArrAct_DtlR.$stk_mng_typ, Purc_Chk03_DtlR.$stk_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$ver_no, Purc_Chk03_DtlR.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_cd, Purc_Chk03_DtlR.$sppl_itm_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_nm, Purc_Chk03_DtlR.$sppl_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$maker_cd, Purc_Chk03_DtlR.$maker_cd);
			addColumnPathMap(ArrAct_DtlR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(ArrAct_DtlR.$rsn_cd, Purc_Chk03_DtlR.$rsn_cd);
			addColumnPathMap(ArrAct_DtlR.$bd_dpt_cd, Purc_Chk03_DtlR.$bd_dpt_cd);
			addColumnPathMap(ArrAct_DtlR.$edi_flg, Purc_Chk03_DtlR.$edi_flg);
			addColumnPathMap(ArrAct_DtlR.$intr_rmrks, Purc_Chk03_DtlR.$intr_rmrks);
			addColumnPathMap(ArrAct_DtlR.$trd_d_rmrks, Purc_Chk03_DtlR.$trd_d_rmrks);
			addColumnPathMap(ArrAct_DtlR.$sub_char1, Purc_Chk03_DtlR.$sub_char1);
			addColumnPathMap(ArrAct_DtlR.$sub_char2, Purc_Chk03_DtlR.$sub_char2);
			addColumnPathMap(ArrAct_DtlR.$sub_char3, Purc_Chk03_DtlR.$sub_char3);
			addColumnPathMap(ArrAct_DtlR.$arr_ptn_typ, Purc_Chk03_DtlR.$arr_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$abort_flg, Purc_Chk03_DtlR.$abort_flg);
			addColumnPathMap(ArrAct_DtlR.$mfg_inst_no, Purc_Chk03_DtlR.$mfg_inst_no);
			addColumnPathMap(ArrAct_DtlR.$err_flg, Purc_Chk03_DtlR.$err_flg);
			addColumnPathMap(ArrAct_DtlR.$sync_flg, Purc_Chk03_DtlR.$sync_flg);

		}
	}
	
	/**
	 * 	RowMapper<br>
	 * 	上り電文(Purc_Chk03_IoR) -> 入荷実績サービス.上り電文(ArrAct_DtlR)
	 */
	protected Map_ArrAct_DtlR_Purc_Chk03_IoR<ArrAct_DtlR,Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_ArrAct_DtlR_Purc_Chk03_IoR() {
		if (_Map_ArrAct_DtlR_Purc_Chk03_IoR == null) {
			_Map_ArrAct_DtlR_Purc_Chk03_IoR = new Map_ArrAct_DtlR_Purc_Chk03_IoR<ArrAct_DtlR, Purc_Chk03_IoR,Purc_Chk03_DtlR>();
		}
		_Map_ArrAct_DtlR_Purc_Chk03_IoR.setWith(null);
		return _Map_ArrAct_DtlR_Purc_Chk03_IoR;
	}
	protected Map_ArrAct_DtlR_Purc_Chk03_IoR<ArrAct_DtlR, Purc_Chk03_IoR,Purc_Chk03_DtlR> _Map_ArrAct_DtlR_Purc_Chk03_IoR = null;
	public class Map_ArrAct_DtlR_Purc_Chk03_IoR<D extends ArrAct_DtlR, S extends Purc_Chk03_IoR, W extends Purc_Chk03_DtlR> extends FXUCC_RowMapperWith<D,S,W>{

		protected W _purc_Chk03_DtlR;
		@Override
		public void setWith(W _purc_Chk03_DtlR){
			this._purc_Chk03_DtlR = _purc_Chk03_DtlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$peg_no, Purc_Chk03_IoR.$peg_no);
			addColumnPathMap(ArrAct_DtlR.$data_crud_typ, Purc_Chk03_IoR.$data_crud_typ);
			addColumnPathMap(ArrAct_DtlR.$crt_lot_flg, Purc_Chk03_IoR.$crt_lot_flg);
			addColumnPathMap(ArrAct_DtlR.$lot_no, Purc_Chk03_IoR.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, Purc_Chk03_IoR.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$ver_no, Purc_Chk03_IoR.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, Purc_Chk03_IoR.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$quality_typ, Purc_Chk03_IoR.$quality_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_insp_typ, Purc_Chk03_IoR.$stk_insp_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_id_typ, Purc_Chk03_IoR.$stk_id_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_bp_cd, Purc_Chk03_IoR.$stk_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$bp_lot_no, Purc_Chk03_IoR.$bp_lot_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_no, Purc_Chk03_IoR.$bp_dlv_slip_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_d_no, Purc_Chk03_IoR.$bp_dlv_slip_d_no);
			addColumnPathMap(ArrAct_DtlR.$ship_fr_valid_dt, Purc_Chk03_IoR.$ship_fr_valid_dt);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, Purc_Chk03_IoR.$dlv_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, Purc_Chk03_IoR.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, Purc_Chk03_IoR.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, Purc_Chk03_IoR.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, Purc_Chk03_IoR.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, Purc_Chk03_IoR.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$purc_cont_qty, Purc_Chk03_IoR.$purc_cont_qty);
			addColumnPathMap(ArrAct_DtlR.$err_flg, Purc_Chk03_IoR.$err_flg);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 紐付く明細の同時計上FLGで入荷実績のチェック処理に連携する
			dest.sync_flg(_purc_Chk03_DtlR.sync_flg());
			
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.arr_act_no(src.arr_act_no());
			}
		}
		
	}
	
	protected void syncDtlAndIo(MCList<Purc_Ins01_DtlR> dl, MCJoinKey<MCList<Purc_Ins01_IoR>> d2iKey) {

		//明細と受払1対1の場合に明細に受払の値を設定する
		dl.forEach(dr -> {
			
			//ステータスがDELETEの明細行を除く
			if (MAC_DATA_CRUD_TYP.isDEL(dr.data_crud_typ())) {
				return;
			}
			MCList<Purc_Ins01_IoR> il = dr.getJoined(d2iKey);
			//ステータスがDELETEの詳細行を除く
			java.util.Iterator<Purc_Ins01_IoR> it_il = il.iterator();
			for (; it_il.hasNext();) {
				Purc_Ins01_IoR r = it_il.next();
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					it_il.remove();
				}
			}
			if (il.size() == 1) {
				Purc_Ins01_IoR ir = il.get(0);
				
				//コピー処理				
				dr.lot_no(ir.lot_no());
				dr.sublot_no(ir.sublot_no());
				dr.bp_lot_no(ir.bp_lot_no());
				dr.bp_dlv_slip_no(ir.bp_dlv_slip_no());
				dr.bp_dlv_slip_d_no(ir.bp_dlv_slip_d_no());
				dr.ship_fr_valid_dt(ir.ship_fr_valid_dt());
				dr.gd_cd(ir.gd_cd());
				dr.quality_typ(ir.quality_typ());
				dr.in_to_loc_cd(ir.in_to_loc_cd());
				dr.in_to_loc_wg_cd(ir.in_to_loc_wg_cd());
				dr.str_ln_cd(ir.str_ln_cd());
				dr.stk_id_typ(ir.stk_id_typ());
				dr.stk_insp_typ(ir.stk_insp_typ());
				
			}
			else {
				//明細と受払が1対Nの場合に、受払のレコードの項目値が全て同じ場合、明細に受払の値を設定する
				Purc_Ins01_IoR ir = il.get(0);

				dr.lot_no(ir.lot_no());
				dr.sublot_no(ir.sublot_no());
				dr.bp_lot_no(ir.bp_lot_no());
				dr.bp_dlv_slip_no(ir.bp_dlv_slip_no());
				dr.bp_dlv_slip_d_no(ir.bp_dlv_slip_d_no());
				dr.gd_cd(ir.gd_cd());
				dr.quality_typ(ir.quality_typ());
				dr.in_to_loc_cd(ir.in_to_loc_cd());
				dr.in_to_loc_wg_cd(ir.in_to_loc_wg_cd());
				dr.str_ln_cd(ir.str_ln_cd());
				dr.stk_id_typ(ir.stk_id_typ());
				dr.stk_insp_typ(ir.stk_insp_typ());

				for (int i = 1; i < il.size(); i++) {
					Purc_Ins01_IoR iri = il.get(i);
					if (!isSame(ir.lot_no(), iri.lot_no()) || !isSame(ir.sublot_no(), iri.sublot_no())) {
						dr.lot_no(null);
						dr.sublot_no(null);
					}
					if (!isSame(ir.bp_lot_no(), iri.bp_lot_no())) {
						dr.bp_lot_no(null);
					}
					if (!isSame(ir.bp_dlv_slip_no(), iri.bp_dlv_slip_no())) {
						dr.bp_dlv_slip_no(null);
					}
					if (!isSame(ir.bp_dlv_slip_d_no(), iri.bp_dlv_slip_d_no())) {
						dr.bp_dlv_slip_d_no(null);
					}
					if (!isSame(ir.gd_cd(), iri.gd_cd())) {
						dr.gd_cd(null);
					}
					if (!isSame(ir.quality_typ(), iri.quality_typ())) {
						dr.quality_typ(null);
					}
					if (!isSame(ir.in_to_loc_wg_cd(), iri.in_to_loc_wg_cd())) {
						dr.in_to_loc_wg_cd(null);
					}
					if (!isSame(ir.in_to_loc_cd(), iri.in_to_loc_cd())) {
						dr.in_to_loc_cd(null);
					}
					if (!isSame(ir.str_ln_cd(), iri.str_ln_cd())) {
						dr.str_ln_cd(null);
					}
					if (!isSame(ir.stk_id_typ(), iri.stk_id_typ())) {
						dr.stk_id_typ(null);
					}
					if (!isSame(ir.stk_insp_typ(), iri.stk_insp_typ())) {
						dr.stk_insp_typ(null);
					}
				}

			}
		});
	}
	
	/**
	 * Purc_Upd02オペレーション.<p>
	 *
	 */
	public class Purc_Upd02 extends MSBDL_PurcActRegService_MC_A.Purc_Upd02 {
		
		// 仕入実績サービス実行用の電文リスト
		MCList<Purc_Ins01_HdrR> crtHdrL = MCList.create(Purc_Ins01_HdrR.class);
		MCList<Purc_Ins01_HdrR> updHdrL = MCList.create(Purc_Ins01_HdrR.class);
		MCList<Purc_Ins01_HdrR> delHdrL = MCList.create(Purc_Ins01_HdrR.class);
		
		MCList<Purc_Ins01_DtlR> crtDtlL = MCList.create(Purc_Ins01_DtlR.class);
		MCList<Purc_Ins01_DtlR> updDtlL = MCList.create(Purc_Ins01_DtlR.class);
		MCList<Purc_Ins01_DtlR> delDtlL = MCList.create(Purc_Ins01_DtlR.class);
		
		MCList<Purc_Ins01_IoR> crtIoL = MCList.create(Purc_Ins01_IoR.class);
		MCList<Purc_Ins01_IoR> updIoL = MCList.create(Purc_Ins01_IoR.class);
		MCList<Purc_Ins01_IoR> delIoL = MCList.create(Purc_Ins01_IoR.class);
		
		// 処理対象になった受領インボイスを管理（仕入諸掛を引っ張り上げるのに使用する）
		Set<String> _rcptIvSet = new HashSet<>();
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 上り電文(明細)の紐付NOに対応するキャッシュされた電文を取得し、仕入実績登録サービスを実行する
			MSBDL_PurcActRegService.Purc_Ins01 purcIns01 = MSBDL_PurcActRegService.crtPurc_Ins01();
			MSBDL_PurcActRegService.Purc_Upd01 purcUpd01 = MSBDL_PurcActRegService.crtPurc_Upd01();
			MSBDL_PurcActRegService.Purc_Del01 purcDel01 = MSBDL_PurcActRegService.crtPurc_Del01();

			// 入荷実績サービスから実行された場合
			if (up0().arr_flg()) {
				
				for (Purc_Ins01_IoR pegNoR : up3()) {
					
					// 受払行の紐付NOが連携されたヘッダのみを対象にする
					Purc_Ins01_IoR tmpIoR = getIoCache(pegNoR.peg_no());
					Purc_Ins01_DtlR tmpDtlR = getDtlCache(tmpIoR.dtl_peg_no());
					Purc_Ins01_HdrR tmpHdrR = getHdrCache(tmpDtlR.hdr_peg_no());
					
					setHdrParam(tmpHdrR);
					
					
					if (MAC_DATA_CRUD_TYP.isDEL(tmpHdrR.data_crud_typ())) {
						
						// 削除電文と対になる新規登録電文を探す
						if (!isNull(tmpIoR.src_peg_no())) {
							MCList<Purc_Ins01_IoR> ioParamListEqSrcPegNo = getIoCacheBySrcPegNo(tmpIoR.src_peg_no());
							for (Purc_Ins01_IoR ioParamRow : ioParamListEqSrcPegNo) {
								if (!isSame(ioParamRow.peg_no(), pegNoR.peg_no())
										&& MAC_DATA_CRUD_TYP.isCRT(ioParamRow.data_crud_typ())) {
									
									// 新規登録用ヘッダ電文を取得
									Purc_Ins01_HdrR hdrParamRowForCrt = getHdrCache(getDtlCache(ioParamRow.dtl_peg_no()).hdr_peg_no());
									
									setHdrParam(hdrParamRowForCrt);
									
								}
							}
						}
						
					}
					
					// 仕入諸掛に対応するヘッダを処理対象に加える（仕入諸掛は本サービスで引っ張り上げるので上り電文には設定されてこない）
					if (!isNull(tmpHdrR.rcpt_iv_mng_no()) && !_rcptIvSet.contains(tmpHdrR.rcpt_iv_mng_no())) {
						for (Purc_Ins01_HdrR hdrR : getHdrCacheByRcptIvNo(tmpHdrR.rcpt_iv_mng_no())) {
							if (isNull(hdrR.po_no())) {
								setHdrParam(hdrR);
							}
						}
						_rcptIvSet.add(tmpHdrR.rcpt_iv_mng_no());
					}
				}
			}
			else if (up0().purc_dtl_flg() || up0().purc_lst_flg()) {
				// 仕入明細訂正、仕入実績一覧登録から実行された場合
				for (Purc_Ins01_DtlR pegNoR : up2()) {
					
					// 明細行の紐付NOが連携されたヘッダのみを対象とする
					Purc_Ins01_DtlR tmpDtlR = getDtlCache(pegNoR.peg_no());
					Purc_Ins01_HdrR tmpHdrR = getHdrCache(tmpDtlR.hdr_peg_no());

					setHdrParam(tmpHdrR);
					
				}
			}
			else {
				// 入荷実績一覧、または仕入実績明細・一覧登録以外でキャッシュを利用して更新する場合は、ヘッダ紐付NOで更新対象の電文キャッシュを指定する
				for (Purc_Ins01_HdrR pegNoR : up1()) {
					Purc_Ins01_HdrR tmpHdrR = getHdrCache(pegNoR.peg_no());
					
					if (!isNull(tmpHdrR.rcpt_iv_mng_no())) {
						// 仕入諸掛分を対象に含める
						for (Purc_Ins01_HdrR hdrR : getHdrCacheByRcptIvNo(tmpHdrR.rcpt_iv_mng_no())) {
							setHdrParam(hdrR);
						}
					}
					else {
						setHdrParam(tmpHdrR);
					}
				}
			}
			
			// 上り電文(明細・受払)をSV用の電文に設定する
			setDtlIoParm();

			// 補完
			cmplHdrUpParamForCrt(crtHdrL);
			cmplDtlUpParamForCrt(crtDtlL);
			
			// 仕入実績サービスの電文設定
			purcIns01.up0().io_make_flg(up0().io_make_flg());
			if (up0().purc_lst_flg()) {
				purcIns01.up0().arr_act_flg(true);
			}
			purcIns01.up0().arr_act_srvs_flg(up0().arr_flg());
			purcIns01.up0().purc_ddlv_reg_exec_flg(up0().purc_ddlv_reg_exec_flg());
			purcIns01.up0().insp_act_srvs_flg(up0().insp_act_srvs_flg());
			purcIns01.up0().purc_lst_flg(up0().purc_lst_flg());
			purcIns01.up0().amt_calc_flg(up0().amt_calc_flg());
			purcIns01.up1().addAll(crtHdrL);
			purcIns01.up2().addAll(crtDtlL);
			purcIns01.up3().addAll(crtIoL);
			
			purcUpd01.up0().io_make_flg(up0().io_make_flg());
			purcUpd01.up0().purc_dtl_flg(up0().purc_dtl_flg());
			if (up0().purc_lst_flg()) {
				purcUpd01.up0().arr_act_flg(true);
			}
			purcUpd01.up0().arr_act_srvs_flg(up0().arr_flg());
			purcUpd01.up0().purc_ddlv_reg_exec_flg(up0().purc_ddlv_reg_exec_flg());
			purcUpd01.up0().insp_act_srvs_flg(up0().insp_act_srvs_flg());
			purcUpd01.up0().purc_lst_flg(up0().purc_lst_flg());
			purcUpd01.up0().amt_calc_flg(up0().amt_calc_flg());
			purcUpd01.up1().addAll(updHdrL);
			purcUpd01.up2().addAll(updDtlL);
			purcUpd01.up3().addAll(updIoL);
			
			purcDel01.up0().io_make_flg(up0().io_make_flg());
			if (up0().purc_lst_flg()) {
				purcDel01.up0().arr_act_flg(true);
			}
			purcDel01.up0().arr_act_srvs_flg(up0().arr_flg());
			purcDel01.up0().purc_ddlv_reg_exec_flg(up0().purc_ddlv_reg_exec_flg());
			purcDel01.up0().insp_act_srvs_flg(up0().insp_act_srvs_flg());
			purcDel01.up1().addAll(delHdrL);
			purcDel01.up2().addAll(delDtlL);
			purcDel01.up3().addAll(delIoL);

			String[] hdrCols = {Purc_Ins01_HdrR.$purc_act_no, Purc_Ins01_HdrR.$purc_act_seq, Purc_Ins01_HdrR.$purc_act_rev};
			String[] dtlCols = {Purc_Ins01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_seq};
			String[] ioCols = {Purc_Ins01_IoR.$purc_act_io_no, Purc_Ins01_IoR.$purc_act_io_seq, Purc_Ins01_IoR.$arr_act_no};
			
			// 仕入実績サービス(取消)
			if (purcDel01.up1().size() > 0) {
				purcDel01.exec();
			}
			// 仕入実績サービス(新規)
			if (purcIns01.up1().size() > 0) {
				purcIns01.exec();
				
				copyByPegNo(up1(), hdrCols, purcIns01.down0(), hdrCols);
				copyByPegNo(up2(), dtlCols, purcIns01.down1(), dtlCols);
				copyByPegNo(up3(), ioCols, purcIns01.down2(), ioCols);
			}
			// 仕入実績サービス(訂正)
			if (purcUpd01.up1().size() > 0) {
				purcUpd01.exec();
				
				copyByPegNo(up1(), hdrCols, purcUpd01.down0(), hdrCols);
				copyByPegNo(up2(), dtlCols, purcUpd01.down1(), dtlCols);
				copyByPegNo(up3(), ioCols, purcUpd01.down2(), ioCols);
			}
			
			// 下り電文設定
			down0().setAll(up1());
			down1().setAll(up2());
			down2().setAll(up3());
						
		}
		
		/**
		 * ヘッダ上り電文の設定
		 */
		protected void setHdrParam(Purc_Ins01_HdrR hdrR) {
			
			// 追加されていないヘッダ電文なら更新対象に追加(受払から探すとヘッダが重複することがあるため)
			if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
				// 新規登録用のヘッダ電文に追加
				if (isNull(crtHdrL.getFirst(Purc_Ins01_HdrR.$peg_no, hdrR.peg_no()))) {
					crtHdrL.add(hdrR);
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				// 更新用のヘッダ電文に追加
				if (isNull(updHdrL.getFirst(Purc_Ins01_HdrR.$peg_no, hdrR.peg_no()))) {
					updHdrL.add(hdrR);
				}
			}
			else {
				// 削除用のヘッダ電文に追加
				if (isNull(delHdrL.getFirst(Purc_Ins01_HdrR.$peg_no, hdrR.peg_no()))) {
					delHdrL.add(hdrR);
				}
			}
		}
		
		/**
		 * 明細・受払上り電文の設定
		 */
		protected void setDtlIoParm() {
			
			String[] copyCols = {Purc_Ins01_IoR.$arr_act_no};
			MCIndexKey ioKey = up3().createIndex(Purc_Ins01_IoR.$peg_no);
			
			for (Purc_Ins01_HdrR crtHdrR : crtHdrL) {
				
				// ヘッダ電文に紐付く明細電文を取得して、セット
				MCList<Purc_Ins01_DtlR> tgtDtlL = getDtlCacheByHdrPegNo(crtHdrR.peg_no());
				crtDtlL.addAll(tgtDtlL);
				
				for (Purc_Ins01_DtlR dtlR : tgtDtlL) {
					// 明細電文に紐付く詳細電文を取得・セット
					MCList<Purc_Ins01_IoR> tgtIoL = getIoCacheByDtlPegNo(dtlR.peg_no());
					
					// 詳細電文に、入荷実績サービスで発行された入荷実績NOをセットする
					if (up0().arr_flg()) {
						copy(tgtIoL, copyCols, up3(), copyCols, ioKey);
					}
					// 詳細電文に検査実績サービスで発行された実績ＮＯ（検査実績明細ＮＯ、検査判定明細ＮＯ、検査実績ＮＯのいずれかひとつ）をセットする
					for (Purc_Ins01_IoR destR : tgtIoL) {
						Purc_Ins01_IoR srcR = up3().getFirst(ioKey, destR.peg_no());
						if (!isNull(srcR)) {
							destR.insp_act_d_no(srcR.insp_act_d_no());
							destR.insp_judg_d_no(srcR.insp_judg_d_no());
							destR.insp_act_no(srcR.insp_act_no());
						}
					}
					crtIoL.addAll(tgtIoL);
				}
			}
			
			for (Purc_Ins01_HdrR updHdrR : updHdrL) {
				MCList<Purc_Ins01_DtlR> tgtDtlL = getDtlCacheByHdrPegNo(updHdrR.peg_no());
				if (!up0().purc_dtl_flg() && !up0().purc_lst_flg() && up0().amt_calc_flg()) {
					setCalcTaxTrgtFlg(updHdrR, tgtDtlL);
				}
				updDtlL.addAll(tgtDtlL);
				
				for (Purc_Ins01_DtlR dtlR : tgtDtlL) {
					MCList<Purc_Ins01_IoR> tgtIoL = getIoCacheByDtlPegNo(dtlR.peg_no());
					
					// 紐付NOをキーに入荷実績ＮＯをコピー
					if (up0().arr_flg()) {
						copy(tgtIoL, copyCols, up3(), copyCols, ioKey);
					}
					// 詳細電文に検査実績サービスで発行された実績ＮＯ（検査実績明細ＮＯ、検査判定明細ＮＯ、検査実績ＮＯのいずれかひとつ）をセットする
					for (Purc_Ins01_IoR destR : tgtIoL) {
						Purc_Ins01_IoR srcR = up3().getFirst(ioKey, destR.peg_no());
						if (!isNull(srcR)) {
							destR.insp_act_d_no(srcR.insp_act_d_no());
							destR.insp_judg_d_no(srcR.insp_judg_d_no());
							destR.insp_act_no(srcR.insp_act_no());
						}
					}
					updIoL.addAll(tgtIoL);
				}
			}
			
			for (Purc_Ins01_HdrR delHdrR : delHdrL) {
				MCList<Purc_Ins01_DtlR> tgtDtlL = getDtlCacheByHdrPegNo(delHdrR.peg_no());
				delDtlL.addAll(tgtDtlL);
				
				for (Purc_Ins01_DtlR dtlR : tgtDtlL) {
					MCList<Purc_Ins01_IoR> tgtIoL = getIoCacheByDtlPegNo(dtlR.peg_no());
					
					// 紐付NOをキーに入荷実績ＮＯをコピー
					if (up0().arr_flg()) {
						copy(tgtIoL, copyCols, up3(), copyCols, ioKey);
					}
					delIoL.addAll(tgtIoL);
				}
			}
			
		}
		
		/**
		 * 既存のindexを利用して、MAUCL_MCDataUtil_MC#copyByPegNo()相当の処理を実行します。
		 * @param dest　コピー先のList
		 * @param destCols コピー先の項目
		 * @param src　コピー元のList
		 * @param srcCols コピー元の項目
		 * @param key コピー元のインデックスキー
		 * 
		 */
		protected void copy(MCList<Purc_Ins01_IoR> dest, String[] destCols,
				MCList<Purc_Ins01_IoR> src, String[] srcCols, MCIndexKey key) {
			String dest_peg_no_col = "peg_no";

			for (MCRow destRow : dest) {
				MCRow srcRow = src.getFirst(key, destRow.getNumberNE(dest_peg_no_col));
				if (srcRow == null) {
					continue;
				}
				for (int j = 0; j < destCols.length; j++) {
					destRow.setValueNE(destCols[j], srcRow.getValueNE(srcCols[j]));
				}
			}
		}
		/**
		 * 税計算対象ＦＬＧを設定します
		 * @param updHdrR ヘッダ情報
		 * @param tgtDtlL 明細リスト
		 * @return
		 */
		protected boolean setCalcTaxTrgtFlg(Purc_Ins01_HdrR updHdrR, MCList<Purc_Ins01_DtlR> tgtDtlL) {
			MST_PURC_ACT_R bfUpdPurcActR = getPurcActCache().get(updHdrR.purc_act_no(), updHdrR.purc_act_seq());
			for (Purc_Ins01_DtlR r : tgtDtlL) {
				MST_PURC_ACT_D_R bfUpdPurcActDR = getBfUpdPurcActDCache().get(r.purc_act_d_no(), r.purc_act_d_seq());
				if (isReCalcTaxTrgt(r, bfUpdPurcActR, bfUpdPurcActDR)) {
					r.calc_tax_trgt_flg(true);
					r.base_cur_tax_amt(null);
					r.ptax_cur_tax_amt(null);
				}
				else {
					r.base_cur_tax_amt(bfUpdPurcActDR.base_cur_tax_amt());
					r.ptax_cur_tax_amt(bfUpdPurcActDR.ptax_cur_tax_amt());
				}
			}
			return true;
		}

		/**
		 * 税計算対象であるかを判定します
		 * @param r
		 * @param bfUpdPurcActR
		 * @param bfUpdPurcActDR
		 * @return
		 */
		protected boolean isReCalcTaxTrgt(Purc_Ins01_DtlR r, MST_PURC_ACT_R bfUpdPurcActR, MST_PURC_ACT_D_R bfUpdPurcActDR) {
			Purc_Ins01_HdrR tmpHdrR = getHdrCache(r.hdr_peg_no());
			if (isSame(r.trd_unit_cd(), bfUpdPurcActDR.trd_unit_cd())
					&& isSame(r.trd_unit_qty(), bfUpdPurcActDR.trd_unit_qty())
					&& isSame(tmpHdrR.xrate(), bfUpdPurcActR.xrate())
					&& isSame(r.tax_cd(), bfUpdPurcActDR.tax_cd())) {
				return false;
			}
			return true;
		}
		/**
		 * 新規登録用のヘッダ上り電文を補完
		 */
		protected void cmplHdrUpParamForCrt(MCList<Purc_Ins01_HdrR> hdrL) {
			
			// 入荷実績サービスから呼ばれた場合
			if (up0().arr_flg()) {
				// 計上日を支払い起算日にセット
				for (Purc_Ins01_HdrR hdrRow : hdrL) {
					if (isNull(hdrRow.pay_basis_dt()) && isNull(hdrRow.pay_schd_dt())) {
						hdrRow.pay_basis_dt(hdrRow.ac_dt());
					}
				}
			}
			
		}
		
		protected void cmplDtlUpParamForCrt(MCList<Purc_Ins01_DtlR> dtlL) {
			
			// 入荷実績サービス
			if (up0().arr_flg()) {
				
				MCList<Purc_Ins01_DtlR> tgtHdrPegGrp = dtlL.groupBy(Purc_Ins01_DtlR.$hdr_peg_no);
				
				// 表示順
				for (Purc_Ins01_DtlR tgtHdrPeg : tgtHdrPegGrp) {
					MCList<Purc_Ins01_DtlR> tgtDtlL = dtlL.subList(Purc_Ins01_DtlR.$hdr_peg_no, tgtHdrPeg.hdr_peg_no());
					setDispSeq(tgtDtlL);
				}
				
			}
			
		}
		
	}
	
	/**
	 * 債務区分を設定する
	 * @param dtlL 明細上り電文
	 */
	protected void setApTyp(MCList<Purc_Ins01_DtlR> dtlL) {
		for (Purc_Ins01_DtlR r : dtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			// 暫定買掛の場合、「暫定買掛」を固定で設定する
			if (r.temp_ap_flg()) {
				r.ap_typ(MAC_AP_TYP.TEMP_AP.value());
				continue;
			}
			// 仕入理由ＣＤから会計理由マスタの債務区分を取得する
			MAM_AC_RSN_R rsnR = getAcRsnCache(r.rsn_cd());
			if (!isNull(rsnR)) {
				r.ap_typ(rsnR.ap_typ());
			}
			// 会計理由から債務区分が取得できない場合、品目仕訳マスタから取得する
			if (isNull(r.ap_typ())) {
				MAM_ITM_JNL_R itmJnlR = getItmJnlCache(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.ap_typ(itmJnlR.ap_typ());
			}
			if (isNull(r.ap_typ())) {
				// 債務区分が取得できない場合は「１:買掛金」とする
				r.ap_typ(MAC_AP_TYP.AP.value());
			}
		}
	}
	
	/**
	 * 明細の金額計算を行う
	 * @param ctrl 制御用電文
	 * @param hdrL ヘッダ上り電文
	 * @param dtlL 明細上り電文
	 */
	protected void calcDtlAmt(Purc_Ins01_CtlR ctrl, MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {
		// 金額計算がオフの場合は対象外
		if (!ctrl.amt_calc_flg() && !ctrl.purc_ddlv_reg_exec_flg()) {
			return;
		}
		
		// データ更新区分が「削除」以外、かつ金額再計算対象の明細に対してのみ、計算を行う
		MCList<Purc_Ins01_DtlR> tgtDtlL = MCList.create(Purc_Ins01_DtlR.class);
		MCList<Purc_Ins01_DtlR> notTgtDtlL = MCList.create(Purc_Ins01_DtlR.class);
		MCIndexKey idxHdrL = hdrL.createIndex(Purc_Ins01_DtlR.$peg_no);
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			Purc_Ins01_HdrR hdrR = hdrL.getFirst(idxHdrL, dtlRow.hdr_peg_no());
			// 仕入実績一覧登録、または、仕入実績登録、または仕入返品登録から呼び出された場合、再計算しない。
			if (ctrl.purc_lst_flg() || ctrl.purc_form_flg() || isCalledPurcRet(ctrl)) {
				notTgtDtlL.add(dtlRow);
			}
			// 仕入直送売上登録、売上返品登録から呼び出された場合、再計算対象かを判定する
			else if (isNotCalcAmtPurcDdlv(ctrl, hdrR, dtlRow) || isNotCalcAmtSlsRet(ctrl, hdrR, dtlRow)) {
				notTgtDtlL.add(dtlRow);
			}
			else if (!MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())
					&& !dtlRow.re_calc_not_tgt_flg()) {
				tgtDtlL.add(dtlRow);
			}
			else if (dtlRow.re_calc_not_tgt_flg()) {
				notTgtDtlL.add(dtlRow);
			}
		}
		
		int peg_no = 0;
		
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmList = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		hdrParmList.addStringColumn("po_d_no");
		hdrParmList.addStringColumn("rcpt_iv_d_no");
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmList = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		
		// 発注あり仕入明細
		MCList<Purc_Ins01_DtlR> havPoDtlList = MCList.create(Purc_Ins01_DtlR.class);
		// 計画外仕入明細
		MCList<Purc_Ins01_DtlR> notHavPoDtlList = MCList.create(Purc_Ins01_DtlR.class);
		
		// 取引単位マスタ取得
		MCList<MAVM_ITM_UNIT_R> itmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R itmUnit_t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(itmUnit_t);
		itmUnit_bldr.addWhereWithAnd(itmUnit_t.itm_cd.eq(bind("itm_cd"))
						.and(itmUnit_t.itm_sub1.eq(bind("itm_sub1")))
						.and(itmUnit_t.itm_sub2.eq(bind("itm_sub2")))
						.and(itmUnit_t.itm_sub3.eq(bind("itm_sub3")))
						.and(itmUnit_t.unit_cd.eq(bind("trd_unit_cd"))));
		dbSelect("MSBDL5180_MAVM_ITM_UNIT_S04", itmUnit, itmUnit_bldr, tgtDtlL);
		
		MCIndexKey idxItmUnit = itmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,	
				MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
		
		// 基準単位マスタ取得
		MCList<MAVM_ITM_UNIT_R> itmUnitBase = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R itmUnitBase_t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitBase_bldr = MCQueryApiBuilder.create(itmUnitBase_t);
		itmUnitBase_bldr.addWhereWithAnd(itmUnitBase_t.itm_cd.eq(bind("itm_cd"))
						.and(itmUnitBase_t.itm_sub1.eq(bind("itm_sub1")))
						.and(itmUnitBase_t.itm_sub2.eq(bind("itm_sub2")))
						.and(itmUnitBase_t.itm_sub3.eq(bind("itm_sub3")))
						.and(itmUnitBase_t.unit_cd.eq(bind("base_unit_cd"))));
		dbSelect("MSBDL5180_MAVM_ITM_UNIT_S05", itmUnitBase, itmUnitBase_bldr, tgtDtlL);
		
		MCIndexKey idxItmUnitBase = itmUnitBase.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,	
				MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
				
		MCIndexKey idxHdr = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
		
		MCList<MAVM_ITM_UNIT_R> refItmUnit  = srchRecItmUnit(ctrl, tgtDtlL);
		MCIndexKey idxrefItmUnit = refItmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,	
				MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
		
		for (Purc_Ins01_DtlR dtlRow : tgtDtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
				continue;
			}			
			if (dtlRow.ncv_flg() || dtlRow.accpt_dfct_flg()) {
				// 無償・検収不良の場合
				// 金額・税額
				dtlRow.trd_cur_amt(MCNumber.ZERO);
				dtlRow.trd_cur_tax_amt(MCNumber.ZERO);
				
				// 外注品の場合、加工単価と有償支給単価を設定する
				MST_PO_D_R poD = getPoDOrRcptIvDCacheForCalcDtlAmt(dtlRow);
				if (!isNull(poD) || poD.outsrc_flg()) {
					if (poD.outsrc_flg()) {
						// 加工単価
						if (isNull(poD.trd_cur_proc_upri())) {
							dtlRow.trd_cur_proc_upri(null);
							dtlRow.trd_cur_proc_amt(null);
						}
						else {
							dtlRow.trd_cur_proc_upri(MCNumber.ZERO);
							dtlRow.trd_cur_proc_amt(MCNumber.ZERO);
						}
						
						// 有償支給単価
						if (isNull(poD.trd_cur_onr_prov_upri())) {
							dtlRow.trd_cur_onr_prov_upri(null);
							dtlRow.trd_cur_onr_prov_amt(null);
						}
						else {
							dtlRow.trd_cur_onr_prov_upri(MCNumber.ZERO);
							dtlRow.trd_cur_onr_prov_amt(MCNumber.ZERO);
						}
						
					}
					else {
						// 購買品の場合、加工単価と有償支給単価は常にnull
						dtlRow.trd_cur_proc_upri(null);
						dtlRow.trd_cur_onr_prov_upri(null);
					}
				}
				// 値引額・値引理由
				dtlRow.trd_cur_dscnt_amt(null);
				dtlRow.dscnt_rsn_cd(null);
			}
			else {
				if (isNull(dtlRow.purc_schd_no()) && !isCalledSlsRet(ctrl)) {
					// 計画外仕入の場合は、単価、数量で計算
					notHavPoDtlList.add(dtlRow);
				}
				else {
					// 発注あり仕入の場合、ユーティリティで金額・税額を算出
					havPoDtlList.add(dtlRow);
				}
			}
		}
		
		// 単位・金額計算ユーティリティ実行用の引数リストを作成する
		for (Purc_Ins01_DtlR dtlRow : havPoDtlList) {
			
			// セット済の引数
			ConvQtyAmtUtil_Calc01_HdrR hdrParmRow =
				!isNull(dtlRow.rcpt_iv_d_no()) ?
					hdrParmList.getFirst("rcpt_iv_d_no", dtlRow.rcpt_iv_d_no()) : hdrParmList.getFirst("po_d_no", dtlRow.po_d_no());
			
			// 明細に対応するヘッダを取得
			Purc_Ins01_HdrR hdrR = hdrL.getFirst(idxHdr, dtlRow.hdr_peg_no());
			if (isCalledSlsRet(ctrl)) {
				hdrParmRow = setConvQtyAmtUtilCalc01HdrR(hdrR, dtlRow, itmUnitBase, refItmUnit, idxItmUnitBase, idxrefItmUnit, peg_no);
				peg_no++;
				hdrParmList.add(hdrParmRow);
			}
			else if (isNull(hdrParmRow)) {
				// 発注明細キャッシュをユーティリティ引数にセット
				MST_PO_D_R poD = getPoDOrRcptIvDCacheForCalcDtlAmt(dtlRow);
				hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
				
				// ユーティリティ引数Rowに値をコピー
				copy(hdrParmRow, poD, hdrR, createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R());
				
				// 基準単位小数部有効桁数・端数処理区分
				Comparable<?>[] key1 = {dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3(), dtlRow.base_unit_cd()};
				MAVM_ITM_UNIT_R unitBase = itmUnitBase.getFirst(idxItmUnitBase, key1);
				hdrParmRow.base_unit_dec_place(unitBase.dec_place());
				hdrParmRow.base_unit_rnd_typ(unitBase.rnd_typ());
				
				// 取引単位小数部有効桁数・端数処理区分
				hdrParmRow.trd_unit_conv_qty(poD.getNumber("conv_qty"));
				hdrParmRow.trd_unit_conv_base_qty(poD.getNumber("conv_base_qty"));
				
				// 内税ＦＬＧ、税率をセット
				hdrParmRow.act_inc_tax_flg(dtlRow.inc_tax_flg());
				hdrParmRow.act_tax_rate(dtlRow.tax_rate());
				hdrParmRow.inc_tax_flg(poD.getBooleanNE("po_inc_tax_flg"));
				hdrParmRow.tax_rate(poD.getNumberNE("po_tax_rate"));
				hdrParmRow.schd_base_unit_qty(poD.base_unit_qty());
				setAmtForDtlMod(hdrParmRow, hdrR, dtlRow);
				// 紐付NO
				hdrParmRow.peg_no(peg_no++);
				
				// ユーティリティ実行用引数リストに追加
				hdrParmList.add(hdrParmRow);
			}
			
			// 明細上り電文をユーティリティ引数にセット
			ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			
			MAVM_ITM_UNIT_R selItmUnit = itmUnit.getFirst(idxItmUnit, dtlRow.itm_cd(),
					dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3(), dtlRow.trd_unit_cd());
			
			copy(dtl1ParmRow, dtlRow, selItmUnit, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R());
			
			if (!ctrl.arr_act_srvs_flg() && !ctrl.insp_act_srvs_flg()&& !getSpplCache().get(hdrR.sppl_cd()).sppl_iv_flg()) {
				// 入荷実績サービスかつ検査実績サービスから実行されていない場合は、値引額は入力値を採用する
				dtl1ParmRow.dscnt_amt_input_flg(true);
			}
			
			// ヘッダ紐付NO
			dtl1ParmRow.hdr_peg_no(hdrParmRow.peg_no());
			dtl1ParmRow.wtax_rate(dtlRow.wtax_rate());
			// ユーティリティ実行用引数リストに追加
			dtl1ParmList.add(dtl1ParmRow);

		}
		
		// ユーティリティの実行
		if (hdrParmList.size() > 0) {
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			ope.up0().addAll(hdrParmList);
			ope.up1().addAll(dtl1ParmList);
			ope.exec();
			// ユーティリティの実行結果から、明細上り電文に金額情報を上書き
			String[] destCols = {Purc_Ins01_DtlR.$trd_cur_upri,
					Purc_Ins01_DtlR.$trd_cur_dscnt_amt,
					Purc_Ins01_DtlR.$trd_cur_amt,
					Purc_Ins01_DtlR.$trd_cur_tax_amt,  
					Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, 
					Purc_Ins01_DtlR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$wtax_amt};
			
			String[] srcCols = {ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt, 
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt, 
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt};
			
			copyByPegNo(havPoDtlList, destCols, ope.down0(), srcCols);
		}
		
		// 計画外の仕入実績登録分の金額計算を行う
		for (Purc_Ins01_DtlR dtlRow : notHavPoDtlList) {
			
			// 明細に対応するヘッダを取得
			Purc_Ins01_HdrR hdrR = hdrL.getFirst(idxHdr, dtlRow.hdr_peg_no());

			// 金額・税額を明細に設定
			MCRow rsltRow = getAmtAndTax(dtlRow.trd_cur_upri(), dtlRow.trd_unit_qty(), dtlRow.tax_rate(), dtlRow.inc_tax_flg(), 
					hdrR.amt_dec_place(), hdrR.purc_amt_rnd_typ(), hdrR.purc_tax_rnd_typ(), dtlRow.trd_cur_dscnt_amt());
			
			if (MAC_TRD_PTN_TYP.isPURC_VMI(hdrR.trd_ptn_typ())) {
				// VMI計上サービスから実行された場合、計算された税額を使用
				dtlRow.trd_cur_tax_amt(rsltRow.getNumberNE("tax_amt"));
			}
			dtlRow.wtax_amt(getTaxAmt(dtlRow.trd_cur_amt(), dtlRow.wtax_rate(), hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));
		}
		// 計画・計画外を問わず、仕入時は基準通貨税額や納税通貨税額を手入力できるため、入力値を採用する。
		for (Purc_Ins01_DtlR dtlRow : tgtDtlL) {
			// 明細に対応するヘッダを取得
			Purc_Ins01_HdrR hdrR = hdrL.getFirst(idxHdr, dtlRow.hdr_peg_no());
			// 「MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02」を実行して金額項目を計算済みの場合は、これ以降の計算が不要
			if (ctrl.purc_ddlv_reg_exec_flg() || ctrl.arr_act_srvs_flg() || ctrl.insp_act_srvs_flg()) {
				continue;
			}
						
			if (!dtlRow.calc_tax_trgt_flg()) {
				// 金額・税額を明細に設定
				MCRow rsltRow = getAmtAndTax(dtlRow.trd_cur_upri(), dtlRow.trd_unit_qty(), dtlRow.tax_rate(), dtlRow.inc_tax_flg(), 
						hdrR.amt_dec_place(), hdrR.purc_amt_rnd_typ(), hdrR.purc_tax_rnd_typ(), dtlRow.trd_cur_dscnt_amt());
				if (dtlRow.inc_tax_flg()) {
					// 内税の場合、税込金額から税額を引いて、金額を求める
					MCNumber incTaxAmt = rsltRow.getNumberNE("amt").add(rsltRow.getNumberNE("tax_amt"));
					dtlRow.trd_cur_amt(incTaxAmt.subtract(dtlRow.trd_cur_tax_amt()));
				}
				else {
					dtlRow.trd_cur_amt(rsltRow.getNumberNE("amt"));
				}
				dtlRow.wtax_amt(getTaxAmt(dtlRow.trd_cur_amt(), dtlRow.wtax_rate(), hdrR.amt_dec_place(), getCo().wtax_rnd_typ()));
			}
		}
		
	}
	protected void setAmtForDtlMod(ConvQtyAmtUtil_Calc01_HdrR hdrParmRow, Purc_Ins01_HdrR hdrR,
			Purc_Ins01_DtlR dtlRow) {
		MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
		if (dtlRow.purc_dtl_upd_flg() && isSame(purcActDR.trd_unit_cd(), dtlRow.trd_unit_cd())) {
			hdrParmRow.trd_unit_cd(purcActDR.trd_unit_cd());
			hdrParmRow.trd_unit_qty(purcActDR.trd_unit_qty());
			hdrParmRow.trd_cur_upri(purcActDR.trd_cur_upri());
			hdrParmRow.trd_cur_proc_upri(purcActDR.trd_cur_proc_upri());
			hdrParmRow.trd_cur_onr_prov_upri(purcActDR.trd_cur_onr_prov_upri());
			hdrParmRow.trd_cur_amt(purcActDR.trd_cur_amt());
			hdrParmRow.trd_cur_proc_amt(purcActDR.trd_cur_proc_amt());
			hdrParmRow.trd_cur_onr_prov_amt(purcActDR.trd_cur_onr_prov_amt());
			hdrParmRow.trd_cur_tax_amt(purcActDR.trd_cur_tax_amt());
			hdrParmRow.trd_unit_conv_qty(purcActDR.getNumberNE("conv_qty"));
			hdrParmRow.trd_unit_conv_base_qty(purcActDR.getNumberNE("conv_base_qty"));
			MAM_TAX_R taxRow = getTaxCache().get(purcActDR.tax_cd());
			hdrParmRow.tax_rate(taxRow.tax_rate());
			hdrParmRow.inc_tax_flg(MCBooleanUtil.dbStringToBoolean(purcActDR.getStringNE("inc_tax_flg")));
			hdrParmRow.trd_cur_inc_tax_amt(purcActDR.trd_cur_amt().add(purcActDR.trd_cur_tax_amt()));
		}
	}

	protected MCList<MAVM_ITM_UNIT_R> srchRecItmUnit(Purc_Ins01_CtlR ctrl, MCList<Purc_Ins01_DtlR> tgtDtlL) {
		MCList<MAVM_ITM_UNIT_R> refItmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
		if (isCalledSlsRet(ctrl)) {
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			for (Purc_Ins01_DtlR dtlRow : tgtDtlL) {
				MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
				purcActDL.add(purcActDR);
			}
			MAVM_ITM_UNIT_R refItmUnit_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder refItmUnit_bldr = MCQueryApiBuilder.create(refItmUnit_t);
			refItmUnit_bldr.addWhereWithAnd(refItmUnit_t.itm_cd.eq(bind("itm_cd"))
							.and(refItmUnit_t.itm_sub1.eq(bind("itm_sub1")))
							.and(refItmUnit_t.itm_sub2.eq(bind("itm_sub2")))
							.and(refItmUnit_t.itm_sub3.eq(bind("itm_sub3")))
							.and(refItmUnit_t.unit_cd.eq(bind("trd_unit_cd"))));
			dbSelect("MSBDL5180_MAVM_ITM_UNIT_S06", refItmUnit, refItmUnit_bldr, purcActDL);
		}
		return refItmUnit;
	}
	protected ConvQtyAmtUtil_Calc01_HdrR setConvQtyAmtUtilCalc01HdrR(Purc_Ins01_HdrR hdrR,
			Purc_Ins01_DtlR dtlRow, MCList<MAVM_ITM_UNIT_R> itmUnitBase, MCList<MAVM_ITM_UNIT_R> refItmUnit,
			MCIndexKey idxItmUnitBase, MCIndexKey idxrefItmUnit,int peg_no) {
		ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
		MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(dtlRow.purc_act_d_no(), dtlRow.purc_act_d_seq());
		copy(hdrParmRow, dtlRow, hdrR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR());
		
		Comparable<?>[] key1 = {dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3(), dtlRow.base_unit_cd()};
		MAVM_ITM_UNIT_R unitBase = itmUnitBase.getFirst(idxItmUnitBase, key1);
		hdrParmRow.base_unit_dec_place(unitBase.dec_place());
		hdrParmRow.base_unit_rnd_typ(unitBase.rnd_typ());

		Comparable<?>[] trdUnitKey = {dtlRow.itm_cd(), dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3(), purcActDR.trd_unit_cd()};
		MAVM_ITM_UNIT_R refUnit = refItmUnit.getFirst(idxrefItmUnit, trdUnitKey);
		hdrParmRow.trd_unit_conv_qty(refUnit.conv_qty());
		hdrParmRow.trd_unit_conv_base_qty(refUnit.conv_base_qty());
		
		hdrParmRow.peg_no(peg_no);
		
		hdrParmRow.act_inc_tax_flg(dtlRow.inc_tax_flg());
		hdrParmRow.act_tax_rate(dtlRow.tax_rate());
		hdrParmRow.schd_base_unit_qty(purcActDR.base_unit_qty());
		
		hdrParmRow.trd_unit_cd(purcActDR.trd_unit_cd());
		hdrParmRow.trd_unit_qty(purcActDR.trd_unit_qty());
		hdrParmRow.trd_cur_upri(purcActDR.trd_cur_upri());
		hdrParmRow.trd_cur_proc_upri(purcActDR.trd_cur_proc_upri());
		hdrParmRow.trd_cur_onr_prov_upri(purcActDR.trd_cur_onr_prov_upri());
		hdrParmRow.trd_cur_amt(purcActDR.trd_cur_amt());
		hdrParmRow.trd_cur_proc_amt(purcActDR.trd_cur_proc_amt());
		hdrParmRow.trd_cur_onr_prov_amt(purcActDR.trd_cur_onr_prov_amt());
		hdrParmRow.trd_cur_tax_amt(purcActDR.trd_cur_tax_amt());
		hdrParmRow.tax_rate(purcActDR.getNumberNE("tax_rate"));
		hdrParmRow.inc_tax_flg(MCBooleanUtil.dbStringToBoolean(purcActDR.getStringNE("inc_tax_flg")));
		hdrParmRow.trd_cur_inc_tax_amt(purcActDR.trd_cur_amt().add(purcActDR.trd_cur_tax_amt()));
		
		MAM_BP_R bpR = getSpplCache().get(hdrR.sppl_cd());
		hdrR.purc_tax_calc_typ(bpR.purc_tax_calc_typ());
		hdrParmRow.setStringNE("po_d_no", null);
		hdrParmRow.setStringNE("rcpt_iv_d_no", null);
		
		return hdrParmRow;
	}
	/**
	 * 外注品の買戻義務がある場合の税額を設定する<br>
	 * 外注品でない場合、または買戻義務がない場合は何もしない
	 * 
	 * @param ctrl
	 * @param hdrR
	 * @param dtlL
	 */
	protected void setRepurcObliTaxAmt(Purc_Ins01_CtlR ctrl, Purc_Ins01_HdrR hdrR, MCList<Purc_Ins01_DtlR> dtlL) {
		MCList<Purc_Ins01_HdrR> hdrL = MCList.create(Purc_Ins01_HdrR.class);
		// 金額計算がオフの場合は対象外
		if (!ctrl.amt_calc_flg() && !ctrl.purc_ddlv_reg_exec_flg()) {
			return;
		}
		hdrL.add(hdrR); // isPurcTypDecideInSrvsメソッドを呼ぶため、Listに設定する
	
		for(Purc_Ins01_DtlR dtlR : dtlL) {
			// 削除もしくは明細再計算対象外の場合は再計算の必要なし
			if(MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || dtlR.re_calc_not_tgt_flg()) {
				continue;
			}
			// 外注の場合
			if ((isPurcTypDecideInSrvs(dtlR, hdrL) && !isNull(dtlR.mfg_inst_no()))
					|| (!isDscntTrdPtn(hdrR.trd_ptn_typ()) && !isNull(dtlR.purc_typ()) && !MAC_PURC_TYP.isPURC_ITM(dtlR.purc_typ()))){
				MAM_BP_R bpR = getSpplCache().get(hdrR.sppl_cd());
				if(bpR.repurc_obli_flg()) {
					MCNumber amt = getAmt(dtlR.trd_cur_upri(),
							dtlR.trd_unit_qty(),
							hdrR.amt_dec_place(),
							hdrR.purc_tax_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					if(dtlR.inc_tax_flg()) {
						// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
						MCNumber proc_inc_tax_amt = getAmt(dtlR.trd_cur_proc_upri(),
								dtlR.trd_unit_qty(),
								hdrR.amt_dec_place(),
								hdrR.purc_tax_rnd_typ(),
								dtlR.trd_cur_dscnt_amt());
						dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
						// 有償支給金額は金額-加工金額
						dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
					}
					MCNumber trdCurTaxAmt = getTaxAmt(
							dtlR.trd_cur_proc_amt(),
							dtlR.tax_rate(),
							hdrR.amt_dec_place(),
							hdrR.purc_tax_rnd_typ(),
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
	}
	/**
	 * 納税通貨税額を取引通貨税額にコピーするか
	 * @param hdrR ヘッダ電文
	 * @return true:コピーする
	 */
	protected boolean isCpyPtaxTaxToTrdTaxAmt(Purc_Ins01_HdrR hdrR) {
		if (!isNull(getCo().ptax_cur_cd())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 基準通貨税額を取引通貨税額にコピーするか
	 * @param hdrR ヘッダ電文
	 * @return true:コピーする
	 */
	protected boolean isCpyBaseTaxToTrdTax(Purc_Ins01_HdrR hdrR) {
		if (isNull(getCo().ptax_cur_cd())) {
			return true;
		}
		return false;
	}
	/**
	 * 発注明細、もしくは受領インボイス明細のキャッシュを取得する
	 */
	protected MST_PO_D_R getPoDOrRcptIvDCacheForCalcDtlAmt(Purc_Ins01_DtlR dtlRow) {
		if (!isNull(dtlRow.rcpt_iv_d_no())) {
			MST_RCPT_IV_D_R rcptIvD = getRcptIvDCache().get(dtlRow.rcpt_iv_d_no());
			MST_PO_D_R poDCache = getPoDCache().get(dtlRow.po_d_no());
		
			MST_PO_D_R poD = MST_PO_D_R.create();
			poD.setStringNE("rcpt_iv_d_no", rcptIvD.rcpt_iv_d_no());
			poD.trd_unit_cd(rcptIvD.trd_unit_cd());
			poD.trd_unit_qty(rcptIvD.trd_unit_qty());
			poD.trd_cur_upri(rcptIvD.trd_cur_upri());
			poD.trd_cur_dscnt_amt(rcptIvD.trd_cur_dscnt_amt());
			poD.trd_cur_proc_upri(rcptIvD.trd_cur_proc_upri());
			poD.trd_cur_onr_prov_upri(rcptIvD.trd_cur_onr_prov_upri());
			poD.trd_cur_amt(rcptIvD.trd_cur_amt());
			poD.trd_cur_proc_amt(rcptIvD.trd_cur_proc_amt());
			poD.trd_cur_onr_prov_amt(rcptIvD.trd_cur_onr_prov_amt());
			poD.trd_cur_tax_amt(rcptIvD.trd_cur_tax_amt());
			poD.upri_not_tgt_flg(rcptIvD.upri_not_tgt_flg());
			poD.setNumberNE("conv_qty", rcptIvD.getNumberNE("conv_qty"));
			poD.setNumberNE("conv_base_qty", rcptIvD.getNumberNE("conv_base_qty"));
			poD.setBooleanNE("po_inc_tax_flg", rcptIvD.getBooleanNE("po_inc_tax_flg"));
			poD.setNumberNE("po_tax_rate", rcptIvD.getNumberNE("po_tax_rate"));
			poD.base_unit_qty(rcptIvD.base_unit_qty());
			poD.outsrc_flg(poDCache.outsrc_flg());
			return poD;
		}
		else {
			return getPoDCache().get(dtlRow.po_d_no());
		}
	}


	
	/**
	 * 基準通貨金額の設定<br>
	 * 明細電文の基準通貨金額を設定する
	 * @param hdrRow ヘッダ電文
	 * @param dtlRow 明細電文
	 * @param baseCur 基準通貨の通貨マスタ
	 */
	protected void setBaseCurAmt(Purc_Ins01_HdrR hdrRow, Purc_Ins01_DtlR dtlRow, MAM_CUR_R baseCur) {
		if (dtlRow.inc_tax_flg()) {
			MCNumber trdCurIncTaxAmt = dtlRow.trd_cur_amt().add(dtlRow.trd_cur_tax_amt());
			MCNumber baseCurIncTaxAmt = convCur(trdCurIncTaxAmt, hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ());
			dtlRow.base_cur_amt(baseCurIncTaxAmt.subtract(dtlRow.base_cur_tax_amt()));
		}
		else {
			dtlRow.base_cur_amt(convCur(dtlRow.trd_cur_amt(), hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
		}
	}
	
	/**
	 * 基準通貨金額の設定<br>
	 * 詳細電文の基準通貨金額を設定する
	 * @param hdrRow ヘッダ電文
	 * @param dtlRow 明細電文
	 * @param ioRow 詳細電文
	 * @param baseCur 基準通貨の通貨マスタ
	 */
	protected void setBaseCurAmt(Purc_Ins01_HdrR hdrRow, Purc_Ins01_DtlR dtlRow, Purc_Ins01_IoR ioRow, MAM_CUR_R baseCur) {
		if (dtlRow.inc_tax_flg()) {
			MCNumber trdCurIncTaxAmt = ioRow.trd_cur_amt().add(ioRow.trd_cur_tax_amt());
			MCNumber baseCurIncTaxAmt = convCur(trdCurIncTaxAmt, hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ());
			ioRow.base_cur_amt(baseCurIncTaxAmt.subtract(ioRow.base_cur_tax_amt()));
		}
		else {
			ioRow.base_cur_amt(convCur(ioRow.trd_cur_amt(), hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
		}		
	}
	
	/**
	 * 納税通貨金額の設定<br>
	 * 明細電文の納税通貨金額を設定する
	 * @param hdrRow ヘッダ電文
	 * @param dtlRow 明細電文
	 * @param ptaxCur 納税通貨の通貨マスタ
	 */
	protected void setPtaxCurAmt(Purc_Ins01_HdrR hdrRow, Purc_Ins01_DtlR dtlRow, MAM_CUR_R ptaxCur) {
		if (dtlRow.inc_tax_flg()) {
			MCNumber trdCurIncTaxAmt = dtlRow.trd_cur_amt().add(dtlRow.trd_cur_tax_amt());
			MCNumber ptaxCurIncTaxAmt = convCur(trdCurIncTaxAmt, hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ());
			dtlRow.ptax_cur_amt(ptaxCurIncTaxAmt.subtract(dtlRow.ptax_cur_tax_amt()));
		}
		else {
			dtlRow.ptax_cur_amt(convCur(dtlRow.trd_cur_amt(), hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
		}
	}
	
	/**
	 * 発注先の税計算区分が伝票単位の場合
	 * 受領インボイス単位で消費税を再計算する
	 */
	protected void callAmtUtilCalc01(Purc_Ins01_HdrR r, MCList<Purc_Ins01_DtlR> dtlL) {
		MSUCL_AmtUtil.AmtUtil_Calc01 ope = MSUCL_AmtUtil.crtAmtUtil_Calc01();
		
		copy(ope.up0(), r, createMap_AmtUtil_Calc01_HdrR_Purc_Ins01_HdrR());
		Map_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR<AmtUtil_Calc01_DtlR,Purc_Ins01_DtlR> map = createMap_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR();
		map.setWithHdrR(r);
		setAll(ope.up1(), dtlL, map);
		ope.exec();
		
		String[] destCols = {Purc_Ins01_DtlR.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt,
				Purc_Ins01_DtlR.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_tax_amt,
				Purc_Ins01_DtlR.$ptax_cur_amt, Purc_Ins01_DtlR.$ptax_cur_tax_amt,
				Purc_Ins01_DtlR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt,
				Purc_Ins01_DtlR.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt,
				Purc_Ins01_DtlR.$ptax_cur_proc_amt, Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt,
				Purc_Ins01_DtlR.$wtax_amt};
		String[] srcCols = {AmtUtil_Calc01_DtlR.$trd_cur_amt, AmtUtil_Calc01_DtlR.$trd_cur_tax_amt,
				AmtUtil_Calc01_DtlR.$base_cur_amt, AmtUtil_Calc01_DtlR.$base_cur_tax_amt,
				AmtUtil_Calc01_DtlR.$ptax_cur_amt, AmtUtil_Calc01_DtlR.$ptax_cur_tax_amt,
				AmtUtil_Calc01_DtlR.$trd_cur_proc_amt, AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_amt,
				AmtUtil_Calc01_DtlR.$base_cur_proc_amt, AmtUtil_Calc01_DtlR.$base_cur_onr_prov_amt,
				AmtUtil_Calc01_DtlR.$ptax_cur_proc_amt, AmtUtil_Calc01_DtlR.$ptax_cur_onr_prov_amt,
				AmtUtil_Calc01_DtlR.$wtax_amt};
		copyByPegNo(dtlL, destCols, ope.down0(), srcCols);
	}
	protected Map_AmtUtil_Calc01_HdrR_Purc_Ins01_HdrR<AmtUtil_Calc01_HdrR,Purc_Ins01_HdrR> createMap_AmtUtil_Calc01_HdrR_Purc_Ins01_HdrR() {
		return new Map_AmtUtil_Calc01_HdrR_Purc_Ins01_HdrR<AmtUtil_Calc01_HdrR, Purc_Ins01_HdrR>();
	}
	public class Map_AmtUtil_Calc01_HdrR_Purc_Ins01_HdrR<D extends AmtUtil_Calc01_HdrR, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_HdrR.$trd_cur_cd, Purc_Ins01_HdrR.$trd_cur_cd);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$amt_dec_place, Purc_Ins01_HdrR.$amt_dec_place);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$xrate, Purc_Ins01_HdrR.$xrate);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$ptax_xrate, Purc_Ins01_HdrR.$ptax_xrate);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_BP_R bpR = getSpplCache().get(src.sppl_cd());
			dest.tax_rnd_typ(bpR.purc_tax_rnd_typ());
			dest.repurc_obli_flg(bpR.repurc_obli_flg());
		}
	}
	protected Map_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR<AmtUtil_Calc01_DtlR,Purc_Ins01_DtlR> createMap_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR() {
		return new Map_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR<AmtUtil_Calc01_DtlR, Purc_Ins01_DtlR>();
	}
	public class Map_AmtUtil_Calc01_DtlR_Purc_Ins01_DtlR<D extends AmtUtil_Calc01_DtlR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		protected Purc_Ins01_HdrR _hdrR;
		public void setWithHdrR(Purc_Ins01_HdrR _hdrR) {
			this._hdrR = _hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_DtlR.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$tax_rate, Purc_Ins01_DtlR.$tax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$inc_tax_flg, Purc_Ins01_DtlR.$inc_tax_flg);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$purc_typ, Purc_Ins01_DtlR.$purc_typ);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_upri, Purc_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_tax_amt, Purc_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_amt, Purc_Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_tax_amt, Purc_Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_onr_prov_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_proc_amt, Purc_Ins01_DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_onr_prov_amt, Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_rate, Purc_Ins01_DtlR.$wtax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_amt, Purc_Ins01_DtlR.$wtax_amt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_ITM_R itm = getItmCache().get(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
			dest.dscnt_itm_flg(itm.dscnt_itm_flg());
			dest.trd_ptn_typ(_hdrR.trd_ptn_typ());
		}
	}
	
	/**
	 * 取引通貨金額、基準通貨金額、納税通貨金額の設定
	 */
	protected void convUpriAmtFrTrdToBasePtax(Purc_Ins01_CtlR ctrl, MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
		
		// 基準通貨の通貨マスタ取得
		MAM_CUR_R baseCur = MAM_CUR_R.create("T");
		dbSelectKey("MSBDL5180_MAM_CUR_S01", baseCur, MCQueryApiBuilder.create(baseCur),
				getCo().base_cur_cd());

		// 納税通貨の通貨マスタ取得
		MAM_CUR_R ptaxCur = null;
		if (!isNull(getCo().ptax_cur_cd())) {
			ptaxCur = MAM_CUR_R.create("T");
			dbSelectKey("MSBDL5180_MAM_CUR_S02", ptaxCur,
					MCQueryApiBuilder.create(ptaxCur), getCo().ptax_cur_cd());
		}

		MCList<Purc_Ins01_IoR> tmpIoL = ioL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
		MCIndexKey tmpIoIdx = tmpIoL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		
		for (Purc_Ins01_HdrR hdrRow : hdrL) {
			// 明細行の単価・金額・税額・値引額を、基準通貨・納税通貨に換算
			MCList<Purc_Ins01_DtlR> tgtDtlL = dtlL.subList(Purc_Ins01_DtlR.$hdr_peg_no, hdrRow.peg_no());
			for (Purc_Ins01_DtlR dtlRow : tgtDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					continue;
				}
				
				if (ctrl.amt_calc_flg()
						|| (ctrl.purc_ddlv_reg_exec_flg() && isOutsrc(ctrl, hdrRow, dtlRow))) {
					dtlRow.base_cur_upri(convToBaseCur(dtlRow.trd_cur_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					dtlRow.base_cur_dscnt_amt(convToBaseCur(dtlRow.trd_cur_dscnt_amt(), hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					
					// 基準通貨税額の計算
					// 納税通貨が未設定の場合、上り電文の基準通貨税額を採用するが、
					// 基準通貨税額がNullで連携された場合は取引通貨税額を換算して求める。
					if (isNull(getCo().ptax_cur_cd())) {
						if (isNull(dtlRow.base_cur_tax_amt())) {
							dtlRow.base_cur_tax_amt(convToBaseCur(dtlRow.trd_cur_tax_amt(), 
									hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
						}
						else {
							// 基準通貨と取引通貨の通貨CDが同一の場合、取引通貨税額も基準通貨税額と同じ値をセットする。
							// 調整入力した基準通貨税額と取引通貨税額を一致させる為。
							if (isSame(hdrRow.trd_cur_cd(), getCo().base_cur_cd())) {
								dtlRow.trd_cur_tax_amt(dtlRow.base_cur_tax_amt());
							}
						}
					}
					else {
						// 納税通貨が設定されている場合、基準通貨税額は取引通貨から換算して求める。
						dtlRow.base_cur_tax_amt(convToBaseCur(dtlRow.trd_cur_tax_amt(), 
								hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
					
					// 基準通貨金額
					setBaseCurAmt(hdrRow, dtlRow, baseCur);
					
					// 加工単価・金額
					dtlRow.base_cur_proc_upri(convToBaseCur(dtlRow.trd_cur_proc_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					dtlRow.base_cur_proc_amt(convToBaseCur(dtlRow.trd_cur_proc_amt(), hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
	
					// 有償支給単価・金額
					dtlRow.base_cur_onr_prov_upri(convToBaseCur(dtlRow.trd_cur_onr_prov_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					dtlRow.base_cur_onr_prov_amt(convToBaseCur(dtlRow.trd_cur_onr_prov_amt(), hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					
					if (!isNull(ptaxCur)) {
						dtlRow.ptax_cur_upri(convCur(dtlRow.trd_cur_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
						dtlRow.ptax_cur_dscnt_amt(convCur(dtlRow.trd_cur_dscnt_amt(), hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					
						// 納税通貨税額
						if (isNull(dtlRow.ptax_cur_tax_amt())) {
							if (isSame(hdrRow.trd_cur_cd(), getCo().ptax_cur_cd())) {
								dtlRow.ptax_cur_tax_amt(dtlRow.trd_cur_tax_amt());
							}
							else {
								dtlRow.ptax_cur_tax_amt(convCur(dtlRow.trd_cur_tax_amt(), hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
							}
						}
	
						// 納税通貨金額
						setPtaxCurAmt(hdrRow, dtlRow, ptaxCur);
	
						// 加工単価・金額
						dtlRow.ptax_cur_proc_upri(convCur(dtlRow.trd_cur_proc_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
						dtlRow.ptax_cur_proc_amt(convCur(dtlRow.trd_cur_proc_amt(), hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
	
						// 有償支給単価・金額
						dtlRow.ptax_cur_onr_prov_upri(convCur(dtlRow.trd_cur_onr_prov_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
						dtlRow.ptax_cur_onr_prov_amt(convCur(dtlRow.trd_cur_onr_prov_amt(), hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				
				// 詳細行の単価・金額・税額・値引額を、基準通貨・納税通貨に換算
				MCList<Purc_Ins01_IoR> tgtIoL = ioL.subList(Purc_Ins01_IoR.$dtl_peg_no, dtlRow.peg_no());
				for (Purc_Ins01_IoR ioRow : tgtIoL) {
				
					if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
						continue;
					}
					
					ioRow.base_cur_upri(convToBaseCur(ioRow.trd_cur_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					
					// 加工単価・金額
					ioRow.base_cur_proc_upri(convToBaseCur(ioRow.trd_cur_proc_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));

					// 有償支給単価・金額
					ioRow.base_cur_onr_prov_upri(convToBaseCur(ioRow.trd_cur_onr_prov_upri(), hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					
					if (!isNull(ptaxCur)) {
						ioRow.ptax_cur_upri(convCur(ioRow.trd_cur_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
						
						// 加工単価・金額
						ioRow.ptax_cur_proc_upri(convCur(ioRow.trd_cur_proc_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));

						// 有償支給単価・金額
						ioRow.ptax_cur_onr_prov_upri(convCur(ioRow.trd_cur_onr_prov_upri(), hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 行削除行を除外したリストより、明細行に紐づく処理対象の詳細行リストを取得
				MCList<Purc_Ins01_IoR> tmpTgtIoL = tmpIoL.subList(tmpIoIdx, dtlRow.peg_no());
				
				// 詳細行の各金額項目は、紐づく明細行の各金額項目を案分した値を設定
				// 基準通貨金額
				FXUCC_Divide.prop(
						tmpTgtIoL,
						dtlRow.base_cur_amt(),
						baseCur.amt_dec_place().intValue(),
						Purc_Ins01_IoR.$base_unit_qty,
						Purc_Ins01_IoR.$base_cur_amt);
				
				// 基準通貨税額
				FXUCC_Divide.prop(
						tmpTgtIoL,
						dtlRow.base_cur_tax_amt(),
						baseCur.amt_dec_place().intValue(),
						Purc_Ins01_IoR.$base_unit_qty,
						Purc_Ins01_IoR.$base_cur_tax_amt);
				
				if (!isNull(dtlRow.base_cur_dscnt_amt())) {
					// 基準通貨値引額
					FXUCC_Divide.prop(
							tmpTgtIoL,
							dtlRow.base_cur_dscnt_amt(),
							baseCur.amt_dec_place().intValue(),
							Purc_Ins01_IoR.$base_unit_qty,
							Purc_Ins01_IoR.$base_cur_dscnt_amt);
				}
				
				if (!isNull(dtlRow.base_cur_proc_amt())) {
					// 基準通貨加工金額
					FXUCC_Divide.prop(
							tmpTgtIoL,
							dtlRow.base_cur_proc_amt(),
							baseCur.amt_dec_place().intValue(),
							Purc_Ins01_IoR.$base_unit_qty,
							Purc_Ins01_IoR.$base_cur_proc_amt);
				}
				
				if (!isNull(dtlRow.base_cur_onr_prov_amt())) {
					// 基準通貨有償支給金額
					FXUCC_Divide.prop(
							tmpTgtIoL,
							dtlRow.base_cur_onr_prov_amt(),
							baseCur.amt_dec_place().intValue(),
							Purc_Ins01_IoR.$base_unit_qty,
							Purc_Ins01_IoR.$base_cur_onr_prov_amt);
				}
				
				// 納税通貨指定の場合
				if (!isNull(ptaxCur)) {
					// 納税通貨金額
					FXUCC_Divide.prop(
							tmpTgtIoL,
							dtlRow.ptax_cur_amt(),
							ptaxCur.amt_dec_place().intValue(),
							Purc_Ins01_IoR.$base_unit_qty,
							Purc_Ins01_IoR.$ptax_cur_amt);
					
					// 納税通貨税額
					FXUCC_Divide.prop(
							tmpTgtIoL,
							dtlRow.ptax_cur_tax_amt(),
							ptaxCur.amt_dec_place().intValue(),
							Purc_Ins01_IoR.$base_unit_qty,
							Purc_Ins01_IoR.$ptax_cur_tax_amt);
					
					if (!isNull(dtlRow.ptax_cur_dscnt_amt())) {
						// 納税通貨値引額
						FXUCC_Divide.prop(
								tmpTgtIoL,
								dtlRow.ptax_cur_dscnt_amt(),
								ptaxCur.amt_dec_place().intValue(),
								Purc_Ins01_IoR.$base_unit_qty,
								Purc_Ins01_IoR.$ptax_cur_dscnt_amt);
					}
					
					if (!isNull(dtlRow.ptax_cur_proc_amt())) {
						// 納税通貨加工金額
						FXUCC_Divide.prop(
								tmpTgtIoL,
								dtlRow.ptax_cur_proc_amt(),
								ptaxCur.amt_dec_place().intValue(),
								Purc_Ins01_IoR.$base_unit_qty,
								Purc_Ins01_IoR.$ptax_cur_proc_amt);
					}
					
					if (!isNull(dtlRow.ptax_cur_onr_prov_amt())) {
						// 納税通貨有償支給金額
						FXUCC_Divide.prop(
								tmpTgtIoL,
								dtlRow.ptax_cur_onr_prov_amt(),
								ptaxCur.amt_dec_place().intValue(),
								Purc_Ins01_IoR.$base_unit_qty,
								Purc_Ins01_IoR.$ptax_cur_onr_prov_amt);
					}
				}
			}
		}

	}
	
	/**
	 * 取引通貨以外の通貨の単価、金額、税額、値引額の項目を補完します<br>
	 * ただし、項目がNullの場合に限ります。<br>
	 * @param ctrl 制御用電文
	 * @param hdrL ヘッダ上り電文
	 * @param dtlL 明細上り電文
	 */
	protected void cmplOtherCurUpriAmtTax(Purc_Ins01_CtlR ctrl, MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {

		// 金額計算がオフの場合は対象外
		if (!ctrl.amt_calc_flg() && !ctrl.purc_ddlv_reg_exec_flg()) {
			return;
		}

		// 基準通貨の通貨マスタ取得
		MAM_CUR_R baseCur = MAM_CUR_R.create("T");
		dbSelectKey("MSBDL5180_MAM_CUR_S03", baseCur, MCQueryApiBuilder.create(baseCur),
				getCo().base_cur_cd());

		// 納税通貨の通貨マスタ取得
		MAM_CUR_R ptaxCur = null;
		if (!isNull(getCo().ptax_cur_cd())) {
			ptaxCur = MAM_CUR_R.create("T");
			dbSelectKey("MSBDL5180_MAM_CUR_S04", ptaxCur,
					MCQueryApiBuilder.create(ptaxCur), getCo().ptax_cur_cd());
		}
		
		for (Purc_Ins01_HdrR hdrRow : hdrL) {
			MCList<Purc_Ins01_DtlR> tgtDtlL = dtlL.subList(Purc_Ins01_DtlR.$hdr_peg_no, hdrRow.peg_no());
			for (Purc_Ins01_DtlR dtlRow : tgtDtlL) {
				if (isNotCalcAmtPurcDdlv(ctrl, hdrRow, dtlRow)) {
					continue;
				}
				// 単価
				if (isNull(dtlRow.base_cur_upri())) {
					dtlRow.base_cur_upri(convToBaseCur(dtlRow.trd_cur_upri(), 
							hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
				}
				if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_upri())) {
					dtlRow.ptax_cur_upri(convCur(dtlRow.trd_cur_upri(),
							hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
				}
				// 加工単価
				if (!isNull(dtlRow.trd_cur_proc_upri())) {
					if (isNull(dtlRow.base_cur_proc_upri())) {
						dtlRow.base_cur_proc_upri(convToBaseCur(dtlRow.trd_cur_proc_upri(), 
								hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_proc_upri())) {
						dtlRow.ptax_cur_proc_upri(convCur(dtlRow.trd_cur_proc_upri(),
								hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 加工金額
				if (!isNull(dtlRow.trd_cur_proc_amt())) {
					if (isNull(dtlRow.base_cur_proc_amt())) {
						dtlRow.base_cur_proc_amt(convToBaseCur(dtlRow.trd_cur_proc_amt(), 
								hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_proc_amt())) {
						dtlRow.ptax_cur_proc_amt(convCur(dtlRow.trd_cur_proc_amt(),
								hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 有償支給単価
				if (!isNull(dtlRow.trd_cur_onr_prov_upri())) {
					if (isNull(dtlRow.base_cur_onr_prov_upri())) {
						dtlRow.base_cur_onr_prov_upri(convToBaseCur(dtlRow.trd_cur_onr_prov_upri(), 
								hdrRow.xrate(), baseCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_onr_prov_upri())) {
						dtlRow.ptax_cur_onr_prov_upri(convCur(dtlRow.trd_cur_onr_prov_upri(),
								hdrRow.ptax_xrate(), ptaxCur.upri_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 有償支給金額
				if (!isNull(dtlRow.trd_cur_onr_prov_amt())) {
					if (isNull(dtlRow.base_cur_onr_prov_amt())) {
						dtlRow.base_cur_onr_prov_amt(convToBaseCur(dtlRow.trd_cur_onr_prov_amt(), 
								hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_onr_prov_amt())) {
						dtlRow.ptax_cur_onr_prov_amt(convCur(dtlRow.trd_cur_onr_prov_amt(),
								hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 値引額
				if (!isNull(dtlRow.trd_cur_dscnt_amt())) {
					if (isNull(dtlRow.base_cur_dscnt_amt())) {
						dtlRow.base_cur_dscnt_amt(convToBaseCur(dtlRow.trd_cur_dscnt_amt(), 
								hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(ptaxCur)) {
						dtlRow.ptax_cur_dscnt_amt(convCur(dtlRow.trd_cur_dscnt_amt(),
								hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				// 税額
				if (isNull(dtlRow.base_cur_tax_amt())) {
					dtlRow.base_cur_tax_amt(convToBaseCur(dtlRow.trd_cur_tax_amt(), 
							hdrRow.xrate(), baseCur.amt_dec_place(), getCo().xrate_rnd_typ()));
				}
				if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_tax_amt())) {
					dtlRow.ptax_cur_tax_amt(convCur(dtlRow.trd_cur_tax_amt(), 
							hdrRow.ptax_xrate(), ptaxCur.amt_dec_place(), getCo().xrate_rnd_typ()));
				}

				// 金額
				if (isNull(dtlRow.base_cur_amt())) {
					setBaseCurAmt(hdrRow, dtlRow, baseCur);
				}
				if (!isNull(ptaxCur) && isNull(dtlRow.ptax_cur_amt())) {
					setPtaxCurAmt(hdrRow, dtlRow, ptaxCur);
				}

			}
		}
		
		
	}
	
	/**
	 * 明細上り電文の金額情報を、数量の比率で詳細上り電文に振り分ける
	 * @param hdrL ヘッダ上り電文
	 * @param dtlL 明細上り電文
	 * @param ioL 詳細上り電文
	 */
	protected void divideDtlAmtToIo(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
		
		// 金額計算(下段)の上り電文にセットする引数リスト
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmList = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmList = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl2R> dtl2ParmList = MCList.create(ConvQtyAmtUtil_Calc01_Dtl2R.class);
		
		// ヘッダ上り電文、詳細上り電文にインデックス作成
		MCIndexKey idxHdr = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
		MCIndexKey idxIo = ioL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		
		// 明細上り電文毎に処理
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			
			if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
				continue;
			}
			
			// 明細に対応するヘッダを取得
			Purc_Ins01_HdrR hdrR = hdrL.getFirst(idxHdr, dtlRow.hdr_peg_no());
			
			// 金額計算(下段)の第0上り電文に引数をセット
			ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
			copy(hdrParmRow, dtlRow, hdrR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR());
			hdrParmList.add(hdrParmRow);
			
			// 金額計算(下段)の第1上り電文に引数をセット
			ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			copy(dtl1ParmRow, dtlRow, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR());
			dtl1ParmList.add(dtl1ParmRow);
			
			// 明細に紐付く詳細上り電文を取得
			MCList<Purc_Ins01_IoR> tgtIoList = ioL.subList(idxIo, dtlRow.peg_no());
			for (Purc_Ins01_IoR ioRow : tgtIoList) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(ioRow.data_crud_typ())) {
					continue;
				}
				
				// 金額計算(下段)の第2上り電文に引数をセット
				ConvQtyAmtUtil_Calc01_Dtl2R dtl2ParmRow = ConvQtyAmtUtil_Calc01_Dtl2R.create();
				copy(dtl2ParmRow, ioRow, createMap_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR());
				dtl2ParmList.add(dtl2ParmRow);
			}
			
		}
		
		// 金額計算(下段)を実行
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc03 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc03();
		ope.up0().addAll(hdrParmList);
		ope.up1().addAll(dtl1ParmList);
		ope.up2().addAll(dtl2ParmList);
		ope.exec();
		
		// ユーティリティ実行結果を詳細上り電文に反映
		String[] destCols = {Purc_Ins01_IoR.$trd_cur_upri, Purc_Ins01_IoR.$trd_cur_dscnt_amt,
				Purc_Ins01_IoR.$trd_cur_amt, 
				Purc_Ins01_IoR.$trd_cur_tax_amt, 
				Purc_Ins01_IoR.$trd_cur_proc_upri,
				Purc_Ins01_IoR.$trd_cur_onr_prov_upri, Purc_Ins01_IoR.$trd_cur_proc_amt, Purc_Ins01_IoR.$trd_cur_onr_prov_amt, Purc_Ins01_IoR.$wtax_amt};
		String[] srcCols = {ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_upri, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_dscnt_amt,
				ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_amt, 
				ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_tax_amt, 
				ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_proc_upri,
				ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_onr_prov_upri, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_proc_amt, ConvQtyAmtUtil_Calc01_Dtl2R.$trd_cur_onr_prov_amt, ConvQtyAmtUtil_Calc01_Dtl2R.$wtax_amt};
		
		copyByPegNo(ioL, destCols, ope.down0(), srcCols);
		
		
	}
	
	/**
	 * 仕入実績明細連番を退避する</p>
	 * 後続の処理にて、実績更新前の連番によるキャッシュ検索に使用する為
	 * @param dtlL 明細上り電文
	 */
	protected void copyPurcActSeqNo(MCList<Purc_Ins01_DtlR> dtlL) {
		
		for (Purc_Ins01_DtlR row : dtlL) {
			row.purc_act_d_seq_old(row.purc_act_d_seq());
		}
		
	}
	
	
	/**
	 * 入荷予定サービス実行(再入荷予定作成)
	 */
	protected void callArrSchd_Upd01(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {

		MCList<Purc_Ins01_DtlR> crtList = MCList.create(Purc_Ins01_DtlR.class);
		MCList<Purc_Ins01_DtlR> updList = MCList.create(Purc_Ins01_DtlR.class);
		MCList<Purc_Ins01_DtlR> delList = MCList.create(Purc_Ins01_DtlR.class);
		
		// 明細上り電文毎に、再入荷予定の登録・更新・削除の判定を行う
		for (Purc_Ins01_DtlR row : dtlL) {
			if (MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
				if ( row.re_arr_flg()) {
					crtList.add(row);
					row.re_arr_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
				MST_PURC_ACT_D_R oldPrcActD = getBfUpdPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq_old());
				if (oldPrcActD.re_arr_flg()) {
					if (row.re_arr_flg()) {
						// 再入荷FLGがONのままなら、再入荷予定を更新する
						updList.add(row);
						row.re_arr_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					else {
						// 再入荷ＦＬＧがONからOFFに更新された場合は、再入荷予定を削除する
						delList.add(row);
						row.re_arr_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
				}
				else {
					if (row.re_arr_flg()) {
						// 再入荷FLGがOFFからONに更新された場合は、再入荷予定を新規作成する
						crtList.add(row);
						row.re_arr_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				MST_PURC_ACT_D_R oldPrcActD = getBfUpdPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq_old());
				if (oldPrcActD.re_arr_flg()) {
					delList.add(row);
					row.re_arr_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}

		// 入荷進捗リスト
		MCList<ArrPr_DtlR> arrPrParamList = MCList.create(ArrPr_DtlR.class);

		// 入荷予定サービスの引数リスト
		MCList<ArrSchd_DtlR> arrSchdParamList = MCList.create(ArrSchd_DtlR.class); 
		
		// 更新対象の入荷進捗を取得
		MCList<Purc_Ins01_DtlR> reArrUpdDtlL = MCList.create(Purc_Ins01_DtlR.class);
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			if (!isNull(dtlRow.re_arr_data_crud_typ())) {
				reArrUpdDtlL.add(dtlRow);
			}
		}
		
		if (reArrUpdDtlL.size() == 0) {
			return ;
		}
		
		MCList<MST_ARR_PR_R> arrPrL = getArrPrCacheList(reArrUpdDtlL);
		int pegNo = 0;
		for (MST_ARR_PR_R arrPrRow : arrPrL) {
			ArrPr_DtlR arrPrParamRow = ArrPr_DtlR.create();
			Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR, MST_ARR_PR_R> arrPrMap = createMap_ArrPr_DtlR_MST_ARR_PR_R();
			arrPrMap.setPegNo(pegNo++);
			copy(arrPrParamRow, arrPrRow, arrPrMap);
			arrPrParamList.add(arrPrParamRow);
		}
		
		MCList<Purc_Ins01_DtlR> crtReArrSchdL = dtlL.subList(Purc_Ins01_DtlR.$re_arr_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		if (crtReArrSchdL.size() > 0) {
			// 受払進捗管理NO発番用のキャッシュを確保
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, crtList.size());
		}
		
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			
			if (isNull(dtlRow.re_arr_data_crud_typ())) {
				continue;
			}
			
			// 入荷進捗更新用の電文を取得
			ArrPr_DtlR arrPrDtlRow = arrPrParamList.getFirst(ArrPr_DtlR.$po_d_no, dtlRow.po_d_no());
			// 入荷予定更新用の電文
			ArrSchd_DtlR paramRow = ArrSchd_DtlR.create();
			// サービス連携用マップ
			Map_ArrSchd_DtlR_Purc_Ins01_DtlR<ArrSchd_DtlR,Purc_Ins01_DtlR> map = createMap_ArrSchd_DtlR_Purc_Ins01_DtlR();
			// 入荷進捗更新用電文のヘッダ紐付NOを、入荷予定更新用の電文にセットする
			map.setHdrPegNo(arrPrDtlRow.peg_no());
			// 入荷予定サービスのデータ更新区分
			map.setDataCrudTyp(dtlRow.re_arr_data_crud_typ());
			
			if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.re_arr_data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(dtlRow.re_arr_data_crud_typ())) {
				Purc_Ins01_HdrR hdr = hdrL.getFirst(Purc_Ins01_HdrR.$peg_no, dtlRow.hdr_peg_no());
				map.setPurcIns01HdrR(hdr);
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(dtlRow.re_arr_data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(dtlRow.re_arr_data_crud_typ())) {
				// 仕入実績明細から発生した再入荷予定を取得する
				// 前処理のチェック処理(Purc_Chk03)にて納入指示・納期回答反映で作成された入荷予定は除外されるので、仕入実績明細NOで紐付く入荷予定は1件のみ
				MST_ARR_SCHD_R reArrSchdR = getReArrSchdCache(dtlRow.purc_act_d_no()).get(0);
				map.setArrSchd(reArrSchdR);
			}
			
			copy(paramRow, dtlRow, map);
			arrSchdParamList.add(paramRow);
			
		}

		if (arrSchdParamList.size() > 0) {
			// 入荷予定サービス(登録・更新・削除)実行
			MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			ope.up0().addAll(arrPrParamList);
			ope.up1().addAll(arrSchdParamList);
			ope.exec();

		}

		
	}
	protected MCMessageList chkReArrUpdatable(MST_PURC_ACT_D_R purcActDR, Purc_Chk03_DtlR up1R,
			MCList<MST_ARR_SCHD_R> reArrSchdL) {
		MCMessageList msgL = new MCMessageList();
		if (MAC_DATA_CRUD_TYP.isUPD(up1R.data_crud_typ())) {
			if (isReArrColumnChanged(purcActDR, up1R)) {
				msgL = chkReArrNextOpeDone(up1R, reArrSchdL);
			}
		}
		else if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
			msgL = chkReArrNextOpeDone(up1R, reArrSchdL);
		}
		return msgL;
	}

	protected MCMessageList chkReArrNextOpeDone(Purc_Chk03_DtlR up1R, MCList<MST_ARR_SCHD_R> reArrSchdL) {
		MCMessageList msgL = new MCMessageList();
		for (MST_ARR_SCHD_R reArrSchdR : reArrSchdL) {
			if (isReArrNextOpeDone(up1R, reArrSchdR)) {
				up1R.err_flg(true);
				msgL.add(new MCMessage(up1R, null, MSBDL0203, up1R.purc_act_d_no(), toDispGUIIndex(up1R)));
				return msgL;
			}
		}
		return msgL;
	}

	protected boolean isReArrNextOpeDone(Purc_Chk03_DtlR up1R, MST_ARR_SCHD_R reArrSchdR) {
		return !isNull(reArrSchdR.dlv_inst_d_no())
				|| !isNull(reArrSchdR.prms_rcpt_d_no())
				|| !reArrSchdR.arr_qty().isZero()
				|| !reArrSchdR.abort_qty().isZero()
				|| !reArrSchdR.getNumberNE("purc_qty").isZero()
				|| !reArrSchdR.getNumberNE("purc_accpt_dfct_qty").isZero()
				|| !reArrSchdR.getNumberNE("purc_abort_qty").isZero();
	}

	protected boolean isReArrColumnChanged(MST_PURC_ACT_D_R purcActDR, Purc_Chk03_DtlR up1R) {
		return !isSame(purcActDR.re_arr_flg(), up1R.re_arr_flg())
				|| !isSame(purcActDR.trd_unit_re_arr_qty(), up1R.trd_unit_re_arr_qty())
				|| !isSame(purcActDR.re_arr_loc_cd(), up1R.re_arr_loc_cd())
				|| !isSame(purcActDR.re_arr_str_ln_cd(), up1R.re_arr_str_ln_cd())
				|| !isSame(purcActDR.re_arr_rqst_tm(), up1R.re_arr_rqst_tm())
				|| !isSame(purcActDR.re_arr_purc_schd_dt(), up1R.re_arr_purc_schd_dt())
				|| !isSame(purcActDR.re_arr_sync_flg(), up1R.re_arr_sync_flg());
	}
	
	/**
	 * 入荷予定サービス呼出（進捗情報の更新）
	 */
	protected void callArrSchd_Upd03(MCList<Purc_Ins01_DtlR> dtlL) {

		MCList<ArrSchd_DtlR> paramList = MCList.create(ArrSchd_DtlR.class);
		
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			if (!isNull(dtlRow.arr_schd_no())) {
				ArrSchd_DtlR paramRow = ArrSchd_DtlR.create();
				paramRow.arr_schd_no(dtlRow.arr_schd_no());
				paramRow.arr_ptn_typ(dtlRow.arr_ptn_typ());
				paramRow.wms_flg(dtlRow.wms_flg());
				paramRow.is_src_purcact_srv_flg(true);
				paramList.add(paramRow);
			}
		}
		
		if (paramList.size() > 0) {
			// 入荷予定を取得(入荷パタンの比較用)
			MCList<MST_ARR_SCHD_R> arrSchd = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			MSW_ARR_SCHD_KEY_R k01 = MSW_ARR_SCHD_KEY_R.create("K01");
			arrSchd.setAll(paramList.innerRowList(ArrSchd_DtlR.$arr_schd, MST_ARR_SCHD_R.class));
			dbWkInsert("MSBDL5180_MSW_ARR_SCHD_I03", arrSchd, arrSchd_bldr.getBaseDbc());
			arrSchd_bldr.setSelect(t.arr_schd_no, t.arr_ptn_typ, t.outsrc_flg);
			arrSchd_bldr.addInnerJoin(k01, bracket( t.arr_schd_no.eq(k01.arr_schd_no)));
			dbSelect("MSBDL5180_MST_ARR_SCHD_S04", arrSchd, arrSchd_bldr);
			dbWkDelete("MSBDL5180_MSW_ARR_SCHD_D02", arrSchd_bldr.getBaseDbc());
			
			for (ArrSchd_DtlR paramRow : paramList) {
				MST_ARR_SCHD_R dbR = arrSchd.getFirst(MST_ARR_SCHD_R.$arr_schd_no, paramRow.arr_schd_no());
				
				if (isSame(paramRow.arr_ptn_typ(), dbR.arr_ptn_typ())) {
					// 入荷パタンが同じ場合は、サービス実行用の上り電文から「入荷パタン」を消す
					paramRow.arr_ptn_typ(null);
				}
				paramRow.outsrc_flg(dbR.outsrc_flg());
			}
			
			MSBEL_ArrSchdService.ArrSchd_Upd03 ope = MSBEL_ArrSchdService.crtArrSchd_Upd03();
			ope.up0().addAll(paramList);
			
			ope.exec();
			
		}		
	}
	/**
	 * 入荷予定送信ＩＦサービス実行
	 * @param dtlL 明細上り電文
	 * @param ioL 詳細上り電文
	 * @param bfrUpd true：仕入実績更新前、false：仕入実績更新後
	 */
	protected void callArrSchdSendIf_Upd01(MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, boolean bfrUpd) {
		MCList<Purc_Ins01_IoR>
			sendL = MCList.create(Purc_Ins01_IoR.class),
			sendTgtL = MCList.create(Purc_Ins01_IoR.class),
			chgL = MCList.create(Purc_Ins01_IoR.class);
		MCIndexKey dtlIdx = dtlL.createIndex(Purc_Ins01_DtlR.$peg_no);

		for (Purc_Ins01_IoR r : ioL) {
			Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlIdx, r.dtl_peg_no());
			if (isNull(dtlR.arr_schd_no())) {
				continue;
			}
			MST_ARR_SCHD_R asR = getArrSchdCache().get(dtlR.arr_schd_no());
			dtlR.wms_flg(asR.wms_flg());

			if (!MSC_ARR_PTN_TYP.isN_YET_ARR(dtlR.arr_ptn_typ())
				|| asR.arr_skip_flg()
				|| !MSC_PR_STS_TYP.isNOT_ARR(asR.pr_sts_typ())) {
				// 未入荷、未着かつ入荷不要以外の入荷予定が対象
				continue;
			}
			Purc_Ins01_IoR sendR = r.clone();
			// 未着で新規・削除しても入荷予定NOは変わらないので常に更新とする
			sendR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			sendR.arr_schd_no(dtlR.arr_schd_no());
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				sendR.in_to_loc_cd(asR.arr_loc_cd());
			}
			sendTgtL.add(sendR);

			if (bfrUpd) {
				String bfrLocCd, aftrLocCd = sendR.in_to_loc_cd();
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					bfrLocCd = asR.arr_loc_cd();
				}
				else {
					MST_PURC_ACT_IO_R befI = getPurcActIoCache().get(r.purc_act_io_no(), r.purc_act_io_seq());
					bfrLocCd = befI.in_to_loc_cd();
				}
				// 前回送信済み、かつ前回から場所が変更されている場合も送信対象
				if (asR.wms_flg()
					&& !isSame(bfrLocCd, aftrLocCd)) {
					Purc_Ins01_IoR chgR = sendR.clone();
					chgR.in_to_loc_cd(bfrLocCd);
					chgR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					chgL.add(chgR);
				}
			}
		}

		// 入荷予定はリビジョン管理対象外なので、削除と新規・更新は別々のタイミングで送信する
		if (bfrUpd) {
			MCList<Purc_Ins01_IoR> lst = MCList.create(Purc_Ins01_IoR.class);
			lst.setAll(sendTgtL);
			lst.addAll(chgL);
			setWmsFlg(lst);

			// 削除分（場所によって外部システムCDが変わった場合のみ）
			MCIndexKey idx = chgL.createIndex(Purc_Ins01_IoR.$peg_no);
			for (Purc_Ins01_IoR ioR : sendTgtL) {
				Purc_Ins01_IoR chgR = chgL.getFirst(idx, ioR.peg_no());
				if (!isNull(chgR)) {
					if (chgR.wms_flg()
						&& !isSame(chgR.ext_sys_cd(), ioR.ext_sys_cd())) {
						sendL.add(chgR);
					}
				}
			}

			// 送信可能チェック
			chkSendIfForBfrUpd(dtlL, sendL, dtlIdx);
		}
		else {
			setWmsFlg(sendTgtL);

			// 新規・更新・削除分
			for (MCList<Purc_Ins01_IoR> lst : sendTgtL.groupList(Purc_Ins01_IoR.$dtl_peg_no)) {
				for (Purc_Ins01_IoR ioR : lst) {
					if (ioR.wms_flg()) {
						sendL.add(ioR);
					}
				}
				// 入荷予定に反映する
				Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlIdx, lst.get(0).dtl_peg_no());
				dtlR.wms_flg(!isNull(lst.getFirst(Purc_Ins01_IoR.$wms_flg, true)));
			}

			// 送信可能チェック
			chkSendIfForAftrUpd(dtlL, ioL, sendL, dtlIdx);
		}
		if (sendL.isEmpty()) {
			return;
		}

		MSLAL_ArrSchdSendIfService.ArrSchdSendIf_Upd01 o = MSLAL_ArrSchdSendIfService.crtArrSchdSendIf_Upd01();
		setAll(o.up0(), sendL, createMap_ArrSchdSendIf_Upd01_DtlR_Purc_Ins01_IoR());
		o.exec();
	}
	protected Map_ArrSchdSendIf_Upd01_DtlR_Purc_Ins01_IoR<ArrSchdSendIf_Upd01_DtlR,Purc_Ins01_IoR> createMap_ArrSchdSendIf_Upd01_DtlR_Purc_Ins01_IoR() {
		return new Map_ArrSchdSendIf_Upd01_DtlR_Purc_Ins01_IoR<ArrSchdSendIf_Upd01_DtlR, Purc_Ins01_IoR>();
	}
	public class Map_ArrSchdSendIf_Upd01_DtlR_Purc_Ins01_IoR<D extends ArrSchdSendIf_Upd01_DtlR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchdSendIf_Upd01_DtlR.$arr_schd_no, Purc_Ins01_IoR.$arr_schd_no);
			addColumnPathMap(ArrSchdSendIf_Upd01_DtlR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
		}
	}

	/**
	 * IF送信対象が入荷予定に対して複数件に分割されていないかチェックする<br>
	 * ※明細もしくは詳細の分割は単票画面でのみ可能なので、チェック処理ではなく更新処理でチェックする
	 */
	protected void chkSendIfForBfrUpd(
			MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> sendL, MCIndexKey dtlIdx) {
		// 前回送信分を削除行が同一入荷予定に対して、複数ある場合はエラーとする
		for (MCList<Purc_Ins01_IoR> lst  : sendL.groupList(Purc_Ins01_IoR.$arr_schd_no)) {
			if (lst.size() > 1 && !isNull(lst.getFirst(Purc_Ins01_IoR.$wms_flg, true))) {
				Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlIdx, lst.get(0).dtl_peg_no());
				throw new MCAppException(dtlR, null, MSBDL0301, toDispGUIIndex(dtlR));
			}
		}
	}
	protected void chkSendIfForAftrUpd(
			MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, MCList<Purc_Ins01_IoR> sendL, MCIndexKey dtlIdx) {

		// チェック対象(明細)の絞り込み
		MCList<Purc_Ins01_DtlR> chkDtlL = MCList.create(Purc_Ins01_DtlR.class);
		MCIndexKey idx = dtlL.createIndex(Purc_Ins01_DtlR.$arr_schd_no);
		for (Purc_Ins01_IoR gR : sendL.groupBy(Purc_Ins01_DtlR.$arr_schd_no)) {
			chkDtlL.addAll(dtlL.subList(idx, gR.arr_schd_no()));
		}
		// チェック対象(詳細)の絞り込み
		MCList<Purc_Ins01_IoR> chkIoL = MCList.create(Purc_Ins01_IoR.class);
		idx = ioL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		for (Purc_Ins01_IoR gR : sendL.groupBy(Purc_Ins01_IoR.$dtl_peg_no)) {
			chkIoL.addAll(ioL.subList(idx, gR.dtl_peg_no()));
		}

		// 同一の入荷予定(IF送信対象)の明細行が複数ある場合はエラーとする
		for (MCList<Purc_Ins01_DtlR> lst  : chkDtlL.groupList(Purc_Ins01_DtlR.$arr_schd_no)) {
			if (lst.size() > 1) {
				Purc_Ins01_DtlR dtlR = lst.getFirst(Purc_Ins01_DtlR.$wms_flg, true);
				if (!isNull(dtlR)) {
					throw new MCAppException(dtlR, null, MSBDL0301, toDispGUIIndex(dtlR));
				}
			}
		}
		// 明細行の入荷予定(IF送信対象)に対して、詳細行が複数ある場合はエラーとする
		for (MCList<Purc_Ins01_IoR> lst  : chkIoL.groupList(Purc_Ins01_IoR.$dtl_peg_no)) {
			if (lst.size() > 1) {
				Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlIdx, lst.get(0).dtl_peg_no());
				if (dtlR.wms_flg()) {
					throw new MCAppException(dtlR, null, MSBDL0301, toDispGUIIndex(dtlR));
				}
			}
		}
	}

	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsFlg(MCList<Purc_Ins01_IoR> ioL) {
		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		Map<MCNumber, Purc_Ins01_IoR> map = new HashMap<>();
		MCNumber no = MCNumber.ZERO;
		for (Purc_Ins01_IoR ioR : ioL) {
			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(no);
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.value());
			r.loc_cd(ioR.in_to_loc_cd());
			r.master_dt(getToday());

			map.put(no, ioR);
			no = no.add(1);
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
				Purc_Ins01_IoR ioR = map.get(r.peg_no());
				ioR.wms_flg(!isNull(r.ext_sys_cd()));
				ioR.ext_sys_cd(r.ext_sys_cd());
			}
		}
	}

	/**
	 * 外注製造実績サービス（外注実績自動登録）実行
	 * @param ctlR 制御用上り電文
	 * @param hdrL ヘッダ上り電文
	 * @param dtlL 明細外注製造指図実行対象
	 * @param ioL 詳細上り電文
	 * @param dtl2IoKey 明細から詳細を取得するためのキー
	 */
	protected void callOutSrcAct_Upd01(Purc_Ins01_CtlR ctlR, 
			MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, 
			MCJoinKey<MCList<Purc_Ins01_IoR>> dtl2IoKey) {
		
		if (isNull(dtlL)) {
			return ;
		}

		MCIndexKey hidx = hdrL.createIndex(Purc_Ins01_HdrR.$purc_act_no);
		
		MCList<OutSrcAct_Upd01_ActDR> paramList = MCList.create(OutSrcAct_Upd01_ActDR.class);
		
		for(MCList<?> hGrp : dtlL.groupList(Purc_Ins01_DtlR.$purc_act_no)) {
			Purc_Ins01_HdrR hdrRow = hdrL.getFirst(hidx, hGrp.get(0).getString("purc_act_no"));
			
			Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR<OutSrcAct_Upd01_ActDR, Purc_Ins01_IoR> map
			= createMap_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR();
			map.setHdr(hdrRow);
			
			hGrp.forEach(dtlRow -> {
				map.setDtl((Purc_Ins01_DtlR)dtlRow);
				dtlRow.getJoined(dtl2IoKey).forEach(ioRow -> {
					OutSrcAct_Upd01_ActDR paramRow = OutSrcAct_Upd01_ActDR.create();
					copy(paramRow, ioRow, map);
					paramList.add(paramRow);
				});
			});
		}
		
		if (paramList.size() > 0) {
			MSBCL_OutSrcActService.OutSrcAct_Upd01 ope = MSBCL_OutSrcActService.crtOutSrcAct_Upd01();
			ope.up0().addAll(paramList);
			ope.exec();
		}
		
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR) -> 外注製造実績サービス.上り電文(OutSrcAct_Upd01_ActDR)
	 */
	protected Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR<OutSrcAct_Upd01_ActDR,Purc_Ins01_IoR> createMap_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR() {
		if (_Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR == null) {
			_Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR = new Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR<OutSrcAct_Upd01_ActDR, Purc_Ins01_IoR>();
		}
		_Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR.setHdr(null);
		_Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR.setDtl(null);
		return _Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR;
	}
	protected Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR<OutSrcAct_Upd01_ActDR, Purc_Ins01_IoR> _Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR = null;
	public class Map_OutSrcAct_Upd01_ActDR_Purc_Ins01_IoR<D extends OutSrcAct_Upd01_ActDR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		protected Purc_Ins01_HdrR _hR;
		protected Purc_Ins01_DtlR _dR;
		
		public void setHdr(Purc_Ins01_HdrR hR) {
			this._hR = hR;
		}
		public void setDtl(Purc_Ins01_DtlR dR) {
			this._dR = dR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Upd01_ActDR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.can_ac_dt(_hR.can_ac_dt());
			}
			dest.mfg_inst_no(_dR.mfg_inst_no());
			
			// 未着時は仕入実績受払NO、通常時は入荷実績NOを連携
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(_dR.arr_ptn_typ())) {
				dest.purc_act_io_no(src.purc_act_io_no());
			}
			else {
				dest.arr_act_no(src.arr_act_no());
			}
			
		}
		
	}

	
	/**
	 * ロット情報サービス呼び出し
	 */
	protected void callLotService(MCList<Purc_Ins01_DtlR> list, MCList<Purc_Ins01_IoR> ioL) {
		
		MCList<Purc_Ins01_IoR> tmpl = MCList.create(Purc_Ins01_IoR.class);
		MCIndexKey idxIoR = list.createIndex(Purc_Ins01_DtlR.$peg_no);
		
		if(!isNull(list)) {
			for (Purc_Ins01_IoR r : ioL) {
				Purc_Ins01_DtlR tmpR = list.getFirst(idxIoR,r.getNumberNE("dtl_peg_no"));
				if(isNull(tmpR)) {
					continue;
				}else if(tmpR.sync_flg()){
					r.setString(Purc_Ins01_IoR.$data_crud_typ, tmpR.data_crud_typ());
					r.setString(Purc_Ins01_IoR.$po_d_no, tmpR.po_d_no());
					r.setString(Purc_Ins01_IoR.$itm_cd, tmpR.itm_cd());
					r.setString(Purc_Ins01_IoR.$itm_sub1, tmpR.itm_sub1());
					r.setString(Purc_Ins01_IoR.$itm_sub2, tmpR.itm_sub2());
					r.setString(Purc_Ins01_IoR.$itm_sub3, tmpR.itm_sub3());
					r.setString(Purc_Ins01_IoR.$ver_no, tmpR.ver_no());
					r.setStringNE("maker_cd", tmpR.maker_cd());
					tmpl.add(r);
				}
			}
			callLotUpd08(tmpl);
		}
	}
	
	/**
	* ロット情報サービス.ロット更新（外注製造品・同時計上）
	 */
	protected void callLotUpd08(MCList<Purc_Ins01_IoR> l) {
		if (l.isEmpty()) return ;
		MSBFL_LotService.Lot_Upd08 o = MSBFL_LotService.crtLot_Upd08();
		createActArrCache(l);
		setAll(o.up0(), l, createMap_Lot_Upd08_CndR_Purc_Ins01_IoR());
		o.exec();
	}
	
	protected void createActArrCache(MCList<Purc_Ins01_IoR> l) {
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		dbc_bldr.setSelect(t.arr_act_no, t.sppl_cd, t.arr_loc_cd, t.arr_tm);
		_arrActCache2 = new FXUCL_MCDbcCache<MST_ARR_ACT_R>(dbc_bldr, l, MST_ARR_ACT_R.$arr_act_no);
	}
	
	protected Map_Lot_Upd08_CndR_Purc_Ins01_IoR<Lot_Upd08_CndR,Purc_Ins01_IoR> createMap_Lot_Upd08_CndR_Purc_Ins01_IoR() {
		return new Map_Lot_Upd08_CndR_Purc_Ins01_IoR<Lot_Upd08_CndR, Purc_Ins01_IoR>();
	}

	public class Map_Lot_Upd08_CndR_Purc_Ins01_IoR<D extends Lot_Upd08_CndR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Upd08_CndR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
			addColumnPathMap(Lot_Upd08_CndR.$itm_cd, Purc_Ins01_IoR.$itm_cd);
			addColumnPathMap(Lot_Upd08_CndR.$itm_sub1, Purc_Ins01_IoR.$itm_sub1);
			addColumnPathMap(Lot_Upd08_CndR.$itm_sub2, Purc_Ins01_IoR.$itm_sub2);
			addColumnPathMap(Lot_Upd08_CndR.$itm_sub3, Purc_Ins01_IoR.$itm_sub3);
			addColumnPathMap(Lot_Upd08_CndR.$lot_no, Purc_Ins01_IoR.$lot_no);
			addColumnPathMap(Lot_Upd08_CndR.$sublot_no, Purc_Ins01_IoR.$sublot_no);
			addColumnPathMap(Lot_Upd08_CndR.$ver_no, Purc_Ins01_IoR.$ver_no);
			addColumnPathMap(Lot_Upd08_CndR.$bp_lot_no, Purc_Ins01_IoR.$bp_lot_no);
			addColumnPathMap(Lot_Upd08_CndR.$maker_cd, "maker_cd");
			addColumnPathMap(Lot_Upd08_CndR.$peg_no, Purc_Ins01_IoR.$dtl_peg_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			MST_ARR_ACT_R actR = _arrActCache2.get(src.arr_act_no());
			
			dest.sppl_cd(actR.sppl_cd());
			dest.loc_cd(actR.arr_loc_cd());
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			dest.src_no1(src.po_d_no());
			dest.src_no3(src.arr_schd_no());
			dest.src_no4(src.arr_act_no());
			 
			MAM_LOC_R locR = getLocCache().get(actR.arr_loc_cd());
			dest.base_dt(actR.arr_tm().trunc(MCDateFieldType.DAY));
			dest.site_cd(locR.site_cd());
			
		}
	}

	/**
	 * 支給実績サービス実行
	 */
	protected void callProvAct_Upd01(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
		
		MCIndexKey idxDtl = dtlL.createIndex(Purc_Ins01_DtlR.$peg_no);
		MCIndexKey idxHdr = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
		
		MCList<ProvActUpd01_DtlR> paramList = MCList.create(ProvActUpd01_DtlR.class);
		
		// 支給実績サービスの実行対象リストを作成
		for (Purc_Ins01_IoR ioRow : ioL) {
			// 明細を取得
			Purc_Ins01_DtlR dtlRow = dtlL.getFirst(idxDtl, ioRow.dtl_peg_no());
			// 入荷不要FLG取得
			MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(dtlRow.arr_schd_no());
			MAM_ITM_R itmR = getItmCache().get(dtlRow.getStringNE("itm_cd"),dtlRow.getStringNE("itm_sub1"), dtlRow.getStringNE("itm_sub2"),
					dtlRow.getStringNE("itm_sub3"));
			boolean arrSkip = isNull(arrSchd) ? arrSchd.arr_skip_flg() : itmR.arr_skip_flg(); 
			// 入荷パタンが「未着管理」の場合、支給実績サービスは実行しない
			// ただし、入荷不要の場合は入荷実績サービスを実行しないので、本サービスで実行する
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(dtlRow.arr_ptn_typ()) && !arrSkip) {
				continue;
			}		
			// ヘッダを取得
			Purc_Ins01_HdrR hdrRow = hdrL.getFirst(idxHdr, dtlRow.hdr_peg_no());
			
			// 取引パタンが「仕入返品」または「経費購買返品」の場合、支給実績サービスは実行しない
			if (MAC_TRD_PTN_TYP.isPURC_RTN(hdrRow.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hdrRow.trd_ptn_typ())) {
				continue;
			}
			
			// サービス上り電文にセット
			ProvActUpd01_DtlR paramRow = ProvActUpd01_DtlR.create();
			
			// 納入場所の発注先を取得
			MAM_LOC_R loc = getLocCache().get(ioRow.in_to_loc_cd());
			if (isNull(loc.sppl_cd())) {
				// 納入場所に発注先が設定されていない場合は、処理対象外
				continue;
			}
			
			// 直納区分を判定
			MST_PO_D_R poD = getPoDCache().get(dtlRow.po_d_no());
			String strDrctDlvTyp = poD.drct_dlv_typ();
			if (!isSame(ioRow.in_to_loc_cd(), poD.in_to_loc_cd())) {
				// 発注の納入場所と異なる場合は、直送
				strDrctDlvTyp = MSC_DRCT_DLV_TYP.DDLV.value();
			}

			// 発注明細の直納区分を取得
			if (MSC_DRCT_DLV_TYP.isVIA(strDrctDlvTyp)) {
				// 直納区分が経由の場合は、処理対象外
				continue;
			}

			Map_ProvActUpd01_DtlR_Purc_Ins01_IoR<ProvActUpd01_DtlR,Purc_Ins01_IoR> map = createMap_ProvActUpd01_DtlR_Purc_Ins01_IoR();
			map.setWithHdrR(hdrRow);
			map.setWithDtlR(dtlRow);
			
			copy(paramRow, ioRow, map);
			
			paramList.add(paramRow);
		}
		
		if (paramList.size() > 0) {
			MSBEL_ProvActService.ProvAct_Upd01 ope = MSBEL_ProvActService.crtProvAct_Upd01();
			ope.up0().addAll(paramList);
			ope.exec();
		}
		
	}

	/**
	 * オーダ登録サービス（品目オーダ更新）実行
	 * @param ctl 制御用上り電文
	 * @param dtlL 明細上り電文
	 */
	protected void callOrd_Upd04(Purc_Ins01_CtlR ctl, MCList<Purc_Ins01_DtlR> dtlL) {
		
		if (!ctl.io_make_flg()) {
			return;
		}

		MCList<Ord_Upd04_DtlR> paramList = MCList.create(Ord_Upd04_DtlR.class);
		
		for (Purc_Ins01_DtlR row : dtlL) {
			// 品目オーダキャッシュ取得
			MCList<MST_ITM_ORDER_R> itmOrdL = getItmOrdCache(row.po_d_no());
			if (isNull(itmOrdL)) {
				continue;
			}
			for (MST_ITM_ORDER_R itmOrdR : itmOrdL) {
				Ord_Upd04_DtlR paramRow = Ord_Upd04_DtlR.create();
				copy(paramRow, row, itmOrdR, createMap_Ord_Upd04_DtlR_Purc_Ins01_DtlR());
				paramList.add(paramRow);
			}
		}
		
		if (paramList.size() > 0) {
			MSBCL_OrdRegService.Ord_Upd04 ope = MSBCL_OrdRegService.crtOrd_Upd04();
			ope.up0().addAll(paramList);
			ope.exec();
		}
			
	}
	
	/**
	 * 受注状況更新サービス実行
	 */
	protected void callSloSts_Upd01(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {
		
		MCList<SloSts_DtlR> paramList = MCList.create(SloSts_DtlR.class);
		
		for (Purc_Ins01_DtlR row : dtlL) {
		
			// 発注明細に受注NOがセットされている場合、受注状況を更新する
			MST_PO_D_R poD = getPoDCache().get(row.po_d_no());
			if (isNull(poD) || isNull(poD.slo_d_no()) || poD.rqst_can_flg()) {
				continue;
			}
			// 受注明細NOをセット
			row.slo_d_no(poD.slo_d_no());
			
			// 対応ヘッダ取得
			Purc_Ins01_HdrR hdrRow = hdrL.getFirst(Purc_Ins01_HdrR.$peg_no, row.hdr_peg_no());
			
			// 受領インボイスNO取得
			if (!row.temp_ap_flg()) {
				MST_PURC_SCHD_R psR = getPurcSchdCache().get(row.purc_schd_no());
				if (!isNull(psR)) {
					row.rcpt_iv_no(psR.getStringNE("rcpt_iv_no"));
					row.rcpt_iv_d_no(psR.getStringNE("rcpt_iv_d_no"));
				}
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
				SloSts_DtlR paramRow = SloSts_DtlR.create();
				copy(paramRow, row, hdrRow, createMap_SloSts_DtlR_Purc_Ins01_DtlR_for_del());
				// 受注状況の訂正用データを作成
				MST_PURC_ACT_D_R bfUpdPrcActD = getBfUpdPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq_old());

				if(!bfUpdPrcActD.accpt_dfct_flg()) {
					paramRow.qty(bfUpdPrcActD.trd_unit_qty().negate());
					paramRow.unit_cd(bfUpdPrcActD.trd_unit_cd());
					paramList.add(paramRow);
				}
			}
			
			// 新規・更新時、受注状況ステータス登録用のデータを作成
			if ((MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ()))) {
				if (row.accpt_dfct_flg()) {
					continue;
				}
				SloSts_DtlR paramRow = SloSts_DtlR.create();
				copy(paramRow, row, hdrRow, createMap_SloSts_DtlR_Purc_Ins01_DtlR());
				
				paramList.add(paramRow);
			}

		}
		
		if (paramList.size() > 0) {
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			ope.up0().addAll(paramList);
			ope.exec();
		}
		
	}
	
	/**
	 * 承認次処理済更新を実行する
	 */
	protected void callAprvUpd02(MCList<Purc_Ins01_HdrR> hdrL) {

		MCList<Aprv_Chk02_Rslt1R> paramList = MCList.create(Aprv_Chk02_Rslt1R.class);

		for (Purc_Ins01_HdrR row : hdrL) {
			
			if (!MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ()) || isNull(row.po_no())) {
				continue;
			}
			
			// 発注ヘッダキャッシュより承認情報取得
			MST_PO_R poCache = getPoCache().get(row.po_no());
			
			row.aprv_flg(poCache.aprv_flg());
			row.aprv_no(poCache.aprv_no());

			if (row.aprv_flg()) {
				// 承認サービスの引数設定
				Aprv_Chk02_Rslt1R paramRow = Aprv_Chk02_Rslt1R.create();
				copy(paramRow, row, createMap_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR());
				
				paramList.add(paramRow);
			}
			
		}
		
		if (paramList.size() > 0) {
			MBBAL_AprvService.Aprv_Upd02 ope = MBBAL_AprvService.crtAprv_Upd02();
			ope.up0().addAll(paramList);
			ope.exec();
		}
		
	}
	
	/**
	 * 承認次処理済解除を実行する
	 */
	protected void callAprvUpd03(MCList<Purc_Ins01_HdrR> hdrL) {
		
		MCList<Aprv_Chk02_Rslt1R> paramList = MCList.create(Aprv_Chk02_Rslt1R.class);

		for (Purc_Ins01_HdrR row : hdrL) {

			if (!MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ()) || isNull(row.po_no())) {
				continue;
			}
			
			// 発注ヘッダキャッシュより承認情報取得
			MST_PO_R poCache = getPoCache().get(row.po_no());
			
			row.aprv_flg(poCache.aprv_flg());
			row.aprv_no(poCache.aprv_no());

			if (row.aprv_flg()) {
				if (!isAprvNextOpr(row.po_no(), null)) {
					// 承認サービスの引数設定
					Aprv_Chk02_Rslt1R paramRow = Aprv_Chk02_Rslt1R.create();
					copy(paramRow, row, createMap_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR());
					
					paramList.add(paramRow);
					
				}
			}

		}
		
		if (paramList.size() > 0) {
			MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
			ope.up0().addAll(paramList);
			ope.exec();
		}
		
	}

	/**
	 * 入荷実績登録サービスを実行する
	 */
	protected void callArrActService(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL, Purc_Ins01_CtlR ctlR) {

		// 入荷実績サービスの処理対象の詳細行電文
		MCList<Purc_Ins01_IoR> ioUpParamL = MCList.create(Purc_Ins01_IoR.class);

		// 入荷同時計上対象の明細行
		MCList<Purc_Ins01_DtlR> dtlUpParamL = MCList.create(Purc_Ins01_DtlR.class);
		
		for (Purc_Ins01_DtlR row : dtlL) {
			if (isArrActTgt(row, ctlR)) {
				row.sync_flg(true);
				row.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
				dtlUpParamL.add(row);
			}
		}
		
		for (Purc_Ins01_DtlR row : dtlUpParamL) {
			ioUpParamL.addAll(ioL.subList(Purc_Chk03_IoR.$dtl_peg_no, row.peg_no()));
		}
		
		if (ioUpParamL.size() == 0) {
			return;
		}
		
		MSBEL_ArrActService.ArrAct_Upd01 ope = MSBEL_ArrActService.crtArrAct_Upd01();
		
		MCIndexKey up1Key = hdrL.createIndex(Purc_Ins01_IoR.$peg_no);
		MCIndexKey up2Key = dtlL.createIndex(Purc_Ins01_DtlR.$peg_no);
		
		for (Purc_Ins01_IoR ioRow : ioUpParamL) {
			ArrAct_DtlR arrDtlR = ArrAct_DtlR.create();
			
			// 明細行取得
			Purc_Ins01_DtlR dtlRow = dtlL.getFirst(up2Key, ioRow.dtl_peg_no());
			
			// ヘッダ取得
			Purc_Ins01_HdrR hdrRow = hdrL.getFirst(up1Key, dtlRow.hdr_peg_no());
			
			// ヘッダ・明細・詳細の電文内容を、入荷実績サービス用の電文にコピーする
			copy(arrDtlR, hdrRow, createMap_ArrAct_DtlR_Purc_Ins01_HdrR());
			copy(arrDtlR, dtlRow, createMap_ArrAct_DtlR_Purc_Ins01_DtlR());
			copy(arrDtlR, ioRow, dtlRow, createMap_ArrAct_DtlR_Purc_Ins01_IoR());
			
			ope.up1().add(arrDtlR);
			
		}
		
		// 受払実績の作成処理はしない
		ope.up0().io_act_flg(false);
		// 入荷実績サービス実行
		ope.exec();
		
		// サービス実行結果から、入荷実績ＮＯ・ロットＮＯ・サブロットＮＯを取得して、仕入実績サービスの上り電文にマージ
		for (ArrAct_DtlR arrDtlR : ope.down0()) {
			Purc_Ins01_IoR ioR = ioL.getFirst(Purc_Ins01_IoR.$peg_no, arrDtlR.peg_no());
			ioR.arr_act_no(arrDtlR.arr_act_no());
			ioR.lot_no(arrDtlR.lot_no());
			ioR.sublot_no(arrDtlR.sublot_no());
		}
		
	}

	/**
	 * 検査予定登録サービス・区分取得処理<br>
	 * 入荷同時計上の場合に、入荷で発生する在庫の在庫検査区分を取得する
	 */
	protected void callInspSchdService(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL) {
		
		MCList<InspSchd_Srch02_CndR> paramL = MCList.create(InspSchd_Srch02_CndR.class);
		
		MCIndexKey hdrKey = hdrL.createIndex(Purc_Ins01_HdrR.$peg_no);
		MCIndexKey ioKey = ioL.createIndex(Purc_Ins01_IoR.$dtl_peg_no);
		
		for (Purc_Ins01_DtlR dtlRow : dtlL) {
			if (dtlRow.sync_flg()) {
				Purc_Ins01_HdrR tgtHdrRow = hdrL.getFirst(hdrKey, dtlRow.hdr_peg_no());
				
				MCList<Purc_Ins01_IoR> tgtIoList = ioL.subList(ioKey, dtlRow.peg_no());
				for (Purc_Ins01_IoR ioRow : tgtIoList) {
					if (MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {
						InspSchd_Srch02_CndR paramRow = InspSchd_Srch02_CndR.create();
						copy(paramRow, ioRow, dtlRow, createMap_InspSchd_Srch02_CndR_Purc_Ins01_IoR());
						paramRow.gr_dt(tgtHdrRow.purc_dt());
						paramRow.sppl_cd(tgtHdrRow.sppl_cd());
						paramL.add(paramRow);
					}
				}
			}
		}
		
		if (paramL.size() > 0) {
			MSBFL_InspSchdService.InspSchd_Srch02 ope = MSBFL_InspSchdService.crtInspSchd_Srch02();
			ope.up0().addAll(paramL);
			ope.exec();
			
			String[] destCols = {Purc_Ins01_IoR.$stk_insp_typ};
			String[] srcCols = {InspSchd_Srch02_CndR.$stk_insp_typ};
			copyByPegNo(ioL, destCols, ope.down0(), srcCols);
		}
		
	}
	
	/**
	 * 上り電文(Purc_Ins01_IoR), 上り電文(Purc_Ins01_DtlR) -> 検査予定登録サービス.上り電文(InspSchd_Srch02_CndR)<br>
	 */
	protected Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR<InspSchd_Srch02_CndR,Purc_Ins01_IoR,Purc_Ins01_DtlR> createMap_InspSchd_Srch02_CndR_Purc_Ins01_IoR() {
		if (_Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR == null) {
			_Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR = new Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR<InspSchd_Srch02_CndR, Purc_Ins01_IoR,Purc_Ins01_DtlR>();
		}
		_Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR.setWith(null);
		return _Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR;
	}
	protected Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR<InspSchd_Srch02_CndR, Purc_Ins01_IoR,Purc_Ins01_DtlR>
		_Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR = null;
	public class Map_InspSchd_Srch02_CndR_Purc_Ins01_IoR<D extends InspSchd_Srch02_CndR, S extends Purc_Ins01_IoR, W extends Purc_Ins01_DtlR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_DtlR;
		@Override
		public void setWith(W _purc_Ins01_DtlR){
			this._purc_Ins01_DtlR = _purc_Ins01_DtlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch02_CndR.$peg_no, Purc_Ins01_IoR.$peg_no);
			addColumnPathMap(InspSchd_Srch02_CndR.$src_no4, Purc_Ins01_IoR.$arr_act_no);
			addColumnPathMap(InspSchd_Srch02_CndR.$loc_cd, Purc_Ins01_IoR.$in_to_loc_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			dest.itm_cd(_purc_Ins01_DtlR.itm_cd());
			dest.itm_sub1(_purc_Ins01_DtlR.itm_sub1());
			dest.itm_sub2(_purc_Ins01_DtlR.itm_sub2());
			dest.itm_sub3(_purc_Ins01_DtlR.itm_sub3());
			dest.src_no1(_purc_Ins01_DtlR.po_d_no());
			dest.src_no3(_purc_Ins01_DtlR.arr_schd_no());
			dest.maker_cd(_purc_Ins01_DtlR.maker_cd());
		}
		
	}
	
	/**
	 * 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 受注状況更新サービス.上り電文(SloSts_DtlR)<br>
	 * 受注状況更新サービス・受注状況登録用のマッピング定義(登録用)
	 */
	protected Map_SloSts_DtlR_Purc_Ins01_DtlR<SloSts_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_SloSts_DtlR_Purc_Ins01_DtlR() {
		if (_Map_SloSts_DtlR_Purc_Ins01_DtlR == null) {
			_Map_SloSts_DtlR_Purc_Ins01_DtlR = new Map_SloSts_DtlR_Purc_Ins01_DtlR<SloSts_DtlR, Purc_Ins01_DtlR, Purc_Ins01_HdrR>();
		}
		_Map_SloSts_DtlR_Purc_Ins01_DtlR.setWith(null);
		return _Map_SloSts_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_SloSts_DtlR_Purc_Ins01_DtlR<SloSts_DtlR, Purc_Ins01_DtlR, Purc_Ins01_HdrR> _Map_SloSts_DtlR_Purc_Ins01_DtlR = null;
	public class Map_SloSts_DtlR_Purc_Ins01_DtlR<D extends SloSts_DtlR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR> extends FXUCC_RowMapperWith<D,S,W>{

		protected W _purc_Ins01_HdrR;
		
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, Purc_Ins01_DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(SloSts_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(SloSts_DtlR.$rcpt_iv_no, Purc_Ins01_DtlR.$rcpt_iv_no);
			addColumnPathMap(SloSts_DtlR.$rcpt_iv_d_no, Purc_Ins01_DtlR.$rcpt_iv_d_no);
			addColumnPathMap(SloSts_DtlR.$unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, Purc_Ins01_DtlR.$trd_unit_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ac_dt(_purc_Ins01_HdrR.ac_dt());
			dest.biz_tm(_purc_Ins01_HdrR.purc_dt());
			dest.slo_sts_typ(MSC_SLO_STS_TYP.PURC.value());
		}
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 受注状況更新サービス.上り電文(SloSts_DtlR)<br>
	 * 受注状況更新サービス・受注状況登録用のマッピング定義(取消用)
	 */
	protected Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del<SloSts_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_SloSts_DtlR_Purc_Ins01_DtlR_for_del() {
		if (_Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del == null) {
			_Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del = new Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del<SloSts_DtlR, Purc_Ins01_DtlR, Purc_Ins01_HdrR>();
		}
		_Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del.setWith(null);
		return _Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del;
	}
	protected Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del<SloSts_DtlR, Purc_Ins01_DtlR, Purc_Ins01_HdrR> _Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del = null;
	public class Map_SloSts_DtlR_Purc_Ins01_DtlR_for_del<D extends SloSts_DtlR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR> extends FXUCC_RowMapperWith<D,S,W>{

		protected W _purc_Ins01_HdrR;
		
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, Purc_Ins01_DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(SloSts_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(SloSts_DtlR.$rcpt_iv_no, Purc_Ins01_DtlR.$rcpt_iv_no);
			addColumnPathMap(SloSts_DtlR.$rcpt_iv_d_no, Purc_Ins01_DtlR.$rcpt_iv_d_no);
			addColumnPathMap(SloSts_DtlR.$unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ac_dt(_purc_Ins01_HdrR.can_ac_dt());
			dest.biz_tm(_purc_Ins01_HdrR.purc_dt());
			// マイナス数量に変換してセット
			dest.qty(src.trd_unit_qty().negate());
			dest.slo_sts_typ(MSC_SLO_STS_TYP.PURC.value());
		}
		
	}
	
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_HdrR) -> 承認提供サービス.上り電文(Aprv_Chk02_Rslt1R)
	 */
	protected Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR<Aprv_Chk02_Rslt1R,Purc_Ins01_HdrR> createMap_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR() {
		if (_Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR == null) {
			_Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR = new Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR<Aprv_Chk02_Rslt1R, Purc_Ins01_HdrR>();
		}
		return _Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR;
	}
	protected Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR<Aprv_Chk02_Rslt1R,Purc_Ins01_HdrR> _Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR = null;
	
	public class Map_Aprv_Chk02_Rslt1R_Purc_Ins01_HdrR<D extends Aprv_Chk02_Rslt1R, S extends Purc_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk02_Rslt1R.$aprv_no, Purc_Ins01_HdrR.$aprv_no);
		}
	}
	
	/**
	 * RowMapper<br>
	 * 発注明細(MST_PO_D_R), 上り電文(Purc_Ins01_HdrR) -> 単位・金額計算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
	 */	
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<ConvQtyAmtUtil_Calc01_HdrR,MST_PO_D_R,Purc_Ins01_HdrR> createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R() {
		if (_Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R == null) {
			_Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R = new Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<ConvQtyAmtUtil_Calc01_HdrR, MST_PO_D_R,Purc_Ins01_HdrR>();
		}
		_Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R.setWith(null);
		return _Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R;
	}
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<ConvQtyAmtUtil_Calc01_HdrR, MST_PO_D_R,Purc_Ins01_HdrR> 
		_Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R = null;
	public class Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends MST_PO_D_R, W extends Purc_Ins01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_HdrR;
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, MST_PO_D_R.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, MST_PO_D_R.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, MST_PO_D_R.$trd_cur_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, MST_PO_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_upri, MST_PO_D_R.$trd_cur_proc_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_upri, MST_PO_D_R.$trd_cur_onr_prov_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, MST_PO_D_R.$trd_cur_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_proc_amt, MST_PO_D_R.$trd_cur_proc_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_onr_prov_amt, MST_PO_D_R.$trd_cur_onr_prov_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, MST_PO_D_R.$trd_cur_tax_amt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.setStringNE("PO_D_NO", src.po_d_no());
			dest.setStringNE("RCPT_IV_D_NO", src.getStringNE("rcpt_iv_d_no"));
			dest.trd_cur_cd(_purc_Ins01_HdrR.trd_cur_cd());
			dest.amt_dec_place(_purc_Ins01_HdrR.amt_dec_place());
			dest.upri_dec_place(_purc_Ins01_HdrR.upri_dec_place());
			dest.amt_rnd_typ(_purc_Ins01_HdrR.purc_amt_rnd_typ());
			dest.tax_rnd_typ(_purc_Ins01_HdrR.purc_tax_rnd_typ());
			// 税込金額
			dest.trd_cur_inc_tax_amt(src.trd_cur_amt().add(src.trd_cur_tax_amt()));
		}
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 品目単位マスタ(MAVM_ITM_UNIT_R) -> 単位・金額計算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
	 */
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R<ConvQtyAmtUtil_Calc01_Dtl1R,Purc_Ins01_DtlR,MAVM_ITM_UNIT_R> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R() {
		if (_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R == null) {
			_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R = new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R<ConvQtyAmtUtil_Calc01_Dtl1R, Purc_Ins01_DtlR,MAVM_ITM_UNIT_R>();
		}
		_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R.setWith(null);
		return _Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R;
	}
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R<ConvQtyAmtUtil_Calc01_Dtl1R, Purc_Ins01_DtlR,MAVM_ITM_UNIT_R> 
			_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R =	null;
	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR_MAVM_ITM_UNIT_R<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Purc_Ins01_DtlR, W extends MAVM_ITM_UNIT_R> extends FXUCC_RowMapperWith<D,S,W>{

		protected W _MAVM_ITM_UNIT_R;
		
		@Override
		public void setWith(W _MAVM_ITM_UNIT_R) {
			this._MAVM_ITM_UNIT_R = _MAVM_ITM_UNIT_R;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_unit_conv_qty(_MAVM_ITM_UNIT_R.conv_qty());
			dest.trd_unit_conv_base_qty(_MAVM_ITM_UNIT_R.conv_base_qty());
		}
		
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 単位・金額計算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
	 */
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_HdrR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR() {
		if (_Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR == null) {
			_Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR = new Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Purc_Ins01_DtlR,Purc_Ins01_HdrR>();
		}
		_Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR.setWith(null);
		return _Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR;
	}
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Purc_Ins01_DtlR,Purc_Ins01_HdrR>
		_Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR = null;
	public class Map_ConvQtyAmtUtil_Calc01_HdrR_Purc_Ins01_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_HdrR;
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Purc_Ins01_DtlR.$inc_tax_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.amt_dec_place(_purc_Ins01_HdrR.amt_dec_place());
			dest.upri_dec_place(_purc_Ins01_HdrR.upri_dec_place());
			dest.amt_rnd_typ(_purc_Ins01_HdrR.purc_amt_rnd_typ());
			dest.tax_rnd_typ(_purc_Ins01_HdrR.purc_tax_rnd_typ());
		}
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR) -> 単位・金額計算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
	 */
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R,Purc_Ins01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR() {
		if (_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR == null) {
			_Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR = new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Purc_Ins01_DtlR>();
		}
		return _Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR;
	}
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Purc_Ins01_DtlR> _Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR = null;

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Purc_Ins01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt, Purc_Ins01_DtlR.$wtax_amt);
		}
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR) -> 単位・金額計算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl2R)
	 * @return
	 */
	protected Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR<ConvQtyAmtUtil_Calc01_Dtl2R,Purc_Ins01_IoR> createMap_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR() {
		if (_Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR == null) {
			_Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR = new Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR<ConvQtyAmtUtil_Calc01_Dtl2R, Purc_Ins01_IoR>();
		}
		return _Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR;
	}
	protected Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR<ConvQtyAmtUtil_Calc01_Dtl2R, Purc_Ins01_IoR>
		_Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR = null;
	public class Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Ins01_IoR<D extends ConvQtyAmtUtil_Calc01_Dtl2R, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$peg_no, Purc_Ins01_IoR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no, Purc_Ins01_IoR.$dtl_peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$hdr_peg_no, Purc_Ins01_IoR.$dtl_peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_qty, Purc_Ins01_IoR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$base_unit_qty, Purc_Ins01_IoR.$base_unit_qty);
		}
	}
	
	/**
	 * RowMapper<br>
	 * 入荷進捗トランザクション(MST_ARR_PR_R) -> 入荷予定サービス.上り電文(ArrPr_Dtl)<br>
	 */
	protected Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR,MST_ARR_PR_R> createMap_ArrPr_DtlR_MST_ARR_PR_R() {
		if (_Map_ArrPr_DtlR_MST_ARR_PR_R == null) {
			_Map_ArrPr_DtlR_MST_ARR_PR_R = new Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR, MST_ARR_PR_R>();
		}
		_Map_ArrPr_DtlR_MST_ARR_PR_R.setPegNo(-1);
		return _Map_ArrPr_DtlR_MST_ARR_PR_R;
	}
	protected Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR, MST_ARR_PR_R> _Map_ArrPr_DtlR_MST_ARR_PR_R = null;
	public class Map_ArrPr_DtlR_MST_ARR_PR_R<D extends ArrPr_DtlR, S extends MST_ARR_PR_R> extends MCRowMapper<D,S>{
		
		protected int _pegNo;
		
		public void setPegNo(int _pegNo) {
			this._pegNo = _pegNo;
		}
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

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(_pegNo);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
		}
		
		
	}
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 入荷予定サービス.上り電文(ArrSchd_DtlR)<br>
	 * 入荷予定サービス・更新（入荷進捗・予定）への連携用マッピング定義(新規登録)<br>
	 */
	protected Map_ArrSchd_DtlR_Purc_Ins01_DtlR<ArrSchd_DtlR,Purc_Ins01_DtlR> createMap_ArrSchd_DtlR_Purc_Ins01_DtlR() {
		if (_Map_ArrSchd_DtlR_Purc_Ins01_DtlR == null) {
			_Map_ArrSchd_DtlR_Purc_Ins01_DtlR = new Map_ArrSchd_DtlR_Purc_Ins01_DtlR<ArrSchd_DtlR, Purc_Ins01_DtlR>();
		}
		_Map_ArrSchd_DtlR_Purc_Ins01_DtlR.setPurcIns01HdrR(null);
		_Map_ArrSchd_DtlR_Purc_Ins01_DtlR.setHdrPegNo(null);
		_Map_ArrSchd_DtlR_Purc_Ins01_DtlR.setDataCrudTyp(null);
		_Map_ArrSchd_DtlR_Purc_Ins01_DtlR.setArrSchd(null);
		return _Map_ArrSchd_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_ArrSchd_DtlR_Purc_Ins01_DtlR<ArrSchd_DtlR, Purc_Ins01_DtlR> _Map_ArrSchd_DtlR_Purc_Ins01_DtlR = null;
	public class Map_ArrSchd_DtlR_Purc_Ins01_DtlR<D extends ArrSchd_DtlR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		
		protected Purc_Ins01_HdrR _purc_Ins01_HdrR;
		
		protected MCNumber _hdrPegNo;
		
		protected String _dataCrudTyp;
		
		protected MST_ARR_SCHD_R _arrSchdR;
		
		public void setPurcIns01HdrR(Purc_Ins01_HdrR _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		
		public void setHdrPegNo(MCNumber _hdrPegNo) {
			this._hdrPegNo = _hdrPegNo;
		}
		
		public void setDataCrudTyp(String _dataCrudTyp) {
			this._dataCrudTyp = _dataCrudTyp;
		}
		
		public void setArrSchd(MST_ARR_SCHD_R _arrSchdR) {
			this._arrSchdR = _arrSchdR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$peg_no, Purc_Ins01_DtlR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// ヘッダ紐付NO
			dest.peg_no(_hdrPegNo); 
			
			//　データ更新区分
			dest.data_crud_typ(_dataCrudTyp);
			
			if (!MAC_DATA_CRUD_TYP.isCRT(_dataCrudTyp)) {
				// 再入荷予定の入荷予定NO
				dest.arr_schd_no(_arrSchdR.arr_schd_no());
			}
			if (MAC_DATA_CRUD_TYP.isCRT(_dataCrudTyp)) {
				// 受払進捗管理NO発番
				dest.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
			if (MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {
				// 入荷進捗NO
				dest.arr_pr_no(_arrSchdR.arr_pr_no());
				// 受払進捗管理NO
				dest.io_schd_pr_no(_arrSchdR.io_schd_pr_no());
				dest.prms_rcpt_d_no(_arrSchdR.prms_rcpt_d_no());
				dest.dlv_inst_d_no(_arrSchdR.dlv_inst_d_no());
				dest.abort_flg(_arrSchdR.abort_flg());
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(_dataCrudTyp) || MAC_DATA_CRUD_TYP.isUPD(_dataCrudTyp)) {
				
				dest.purc_act_d_no(src.purc_act_d_no());
				dest.purc_id_typ(src.purc_id_typ());
				// 品目
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.itm_nm(src.itm_nm());
				dest.rcpt_iv_itm_nm(src.iv_itm_nm());
				dest.sundry_itm_flg(src.sundry_itm_flg());
				dest.sno1(src.sno1());
				dest.sno2(src.sno2());
				dest.sno3(src.sno3());
				dest.sno4(src.sno4());
				dest.ver_no(src.ver_no());
				dest.sppl_itm_cd(src.sppl_itm_cd());
				dest.sppl_itm_nm(src.sppl_itm_nm());
				dest.maker_cd(src.maker_cd());
				// 日時
				dest.arr_schd_tm(src.re_arr_rqst_tm());
				dest.accpt_schd_dt(src.re_arr_purc_schd_dt());
				dest.arr_ptn_typ(getArrPtnTyp(dest));
				// 同時計上ＦＬＧ
				dest.sync_flg(src.re_arr_sync_flg());
				// 場所
				dest.wg_cd(src.re_arr_loc_wg_cd());
				dest.arr_loc_cd(src.re_arr_loc_cd());
				dest.str_ln_cd(src.re_arr_str_ln_cd());
				// 数量
				dest.trd_unit_qty(src.trd_unit_re_arr_qty());
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.base_unit_qty(src.base_unit_re_arr_qty());
				dest.base_unit_cd(src.base_unit_cd());
				// 製造指図NO
				dest.mfg_inst_no(src.mfg_inst_no());

				// デフォルト格付CDをセット
				dest.gd_cd(getDefaultFeedStkGd().gd_cd());
				
				// 良品区分はデフォルト「良品」
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				
				// 在庫識別区分
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				
				// 再入荷予定ＦＬＧをオンに設定
				dest.re_arr_schd_flg(true);
				
				// 外注ＦＬＧ
				if (MAC_PURC_TYP.isOUTSRC_ITM_FFR(src.purc_typ())
						|| MAC_PURC_TYP.isOUTSRC_ITM_ONR_SS(src.purc_typ())) {
					dest.outsrc_flg(true);
				}

			}
			// 仕入実績サービスから入荷予定サービスを実行したサイン
			dest.is_src_purcact_srv_flg(true);
			
		}
		
		public String getArrPtnTyp(ArrSchd_DtlR r) {
			if (r.accpt_schd_dt().ltDate(r.arr_schd_tm())) {
				return MSC_ARR_PTN_TYP.N_YET_ARR.value();
			}
			else {
				return MSC_ARR_PTN_TYP.NRML.value();
			}
		}
		
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_IoR), 上り電文(Purc_Ins01_DtlR), 上り電文(Purc_Ins01_HdrR) -> 支給実績サービス.上り電文(ProvActUpd01_DtlR)<br>
	 */
	protected Map_ProvActUpd01_DtlR_Purc_Ins01_IoR<ProvActUpd01_DtlR,Purc_Ins01_IoR> createMap_ProvActUpd01_DtlR_Purc_Ins01_IoR() {
		if (_Map_ProvActUpd01_DtlR_Purc_Ins01_IoR == null) {
			_Map_ProvActUpd01_DtlR_Purc_Ins01_IoR = new Map_ProvActUpd01_DtlR_Purc_Ins01_IoR<ProvActUpd01_DtlR, Purc_Ins01_IoR>();
		}
		_Map_ProvActUpd01_DtlR_Purc_Ins01_IoR.setWithHdrR(null);
		_Map_ProvActUpd01_DtlR_Purc_Ins01_IoR.setWithDtlR(null);
		return _Map_ProvActUpd01_DtlR_Purc_Ins01_IoR;
	}
	protected Map_ProvActUpd01_DtlR_Purc_Ins01_IoR<ProvActUpd01_DtlR, Purc_Ins01_IoR> _Map_ProvActUpd01_DtlR_Purc_Ins01_IoR = null;
	public class Map_ProvActUpd01_DtlR_Purc_Ins01_IoR<D extends ProvActUpd01_DtlR, S extends Purc_Ins01_IoR> extends MCRowMapper<D,S>{
		protected Purc_Ins01_HdrR _hdrR;
		protected Purc_Ins01_DtlR _dtlR;
		public void setWithHdrR(Purc_Ins01_HdrR _hdrR) {
			this._hdrR = _hdrR;
		}
		public void setWithDtlR(Purc_Ins01_DtlR _dtlR) {
			this._dtlR = _dtlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActUpd01_DtlR.$data_crud_typ, Purc_Ins01_IoR.$data_crud_typ);
		}		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			//　紐付NO
			dest.peg_no(src.peg_no());
			
			// 支給元予定区分, 支給元予定NO2
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
				dest.prov_src_schd_no2(_dtlR.arr_schd_no());
			}
			
			// 支給元実績区分
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(_dtlR.arr_ptn_typ())) {
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value());
			}
			else {
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.DDLV.value());
				// 入荷実績NO
				dest.arr_act_no(src.arr_act_no());
			}
			// 支給元実績NO
			dest.prov_src_act_no(src.purc_act_io_no());
			
			// 取引ＣＤ
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				dest.trd_cd(getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV.value()));
			}
			// 取引パタン区分
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());

			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.trd_unit_qty(src.trd_unit_qty());
				dest.base_unit_cd(src.base_unit_cd());
				dest.base_unit_qty(src.base_unit_qty());
				dest.accpt_dt(_hdrR.purc_dt());
				dest.ac_dt(_hdrR.ac_dt());
				dest.wg_cd(src.in_to_loc_wg_cd());
				dest.prsppl_cd(getPrspplCache(src.in_to_loc_cd()).bp_cd());
				dest.itm_cd(_dtlR.itm_cd());
				dest.itm_sub1(_dtlR.itm_sub1());
				dest.itm_sub2(_dtlR.itm_sub2());
				dest.itm_sub3(_dtlR.itm_sub3());
				dest.loc_cd(src.in_to_loc_cd());
				dest.str_ln_cd(src.str_ln_cd());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.sno1(_dtlR.sno1());
				dest.sno2(_dtlR.sno2());
				dest.sno3(_dtlR.sno3());
				dest.sno4(_dtlR.sno4());
				dest.gd_cd(src.gd_cd());
				dest.quality_typ(src.quality_typ());
				dest.stk_insp_typ(src.stk_insp_typ());
				dest.stk_id_typ(src.stk_id_typ());
				if (_dtlR.accpt_dfct_flg()) {
					dest.stk_bp_cd(_hdrR.sppl_cd());
				}
				else {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}

			}
			
			// 更新または削除
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.can_ac_dt(_hdrR.can_ac_dt());
			}			
			
		}
		
	}
	
	
	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR), 品目オーダ(MST_ITM_ORDER) -> 品目オーダ実績サービス.上り電文(Ord_Upd04_DtlR)<br>
	 */
	protected Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR<Ord_Upd04_DtlR,Purc_Ins01_DtlR,MST_ITM_ORDER_R> createMap_Ord_Upd04_DtlR_Purc_Ins01_DtlR() {
		if (_Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR == null) {
			_Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR = new Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR<Ord_Upd04_DtlR, Purc_Ins01_DtlR,MST_ITM_ORDER_R>();
		}
		_Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR.setWith(null);
		return _Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR;
	}
	protected Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR<Ord_Upd04_DtlR, Purc_Ins01_DtlR,MST_ITM_ORDER_R> _Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR = null; 
	public class Map_Ord_Upd04_DtlR_Purc_Ins01_DtlR<D extends Ord_Upd04_DtlR, S extends Purc_Ins01_DtlR, W extends MST_ITM_ORDER_R>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _mST_ITM_ORDER_R;
		@Override
		public void setWith(W _mST_ITM_ORDER_R){
			this._mST_ITM_ORDER_R = _mST_ITM_ORDER_R;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_no(_mST_ITM_ORDER_R.itm_ord_no());
			dest.itm_ord_typ(_mST_ITM_ORDER_R.itm_ord_typ());
		}
	}

	/**
	 * RowMapper<br>
	 * 上り電文(Purc_Ins01_DtlR) -> 外注製造実績サービス.上り電文(OutSrcAct_Sprt02_CndR)<br>
	 */
	protected Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR<OutSrcAct_Sprt02_CndR,Purc_Ins01_DtlR> createMap_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR() {
		if (_Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR == null) {
			_Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR = new Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR<OutSrcAct_Sprt02_CndR, Purc_Ins01_DtlR>();
		}
		return _Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR;
	}
	protected Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR<OutSrcAct_Sprt02_CndR, Purc_Ins01_DtlR> _Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR = null;
	public class Map_OutSrcAct_Sprt02_CndR_Purc_Ins01_DtlR<D extends OutSrcAct_Sprt02_CndR, S extends Purc_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$mfg_inst_no, Purc_Ins01_DtlR.$mfg_inst_no);

		}
	}
	/**
	 * 入荷実績サービスを実行するべきかどうかを判定します。<p>
	 */
	protected boolean isArrActTgt(MCRow row, MCRow ctlR) {
		
		String arrSchdNo = row.getStringNE(Purc_Chk03_DtlR.$arr_schd_no);
		String poDNo = row.getStringNE(Purc_Chk03_DtlR.$po_d_no);
	
		if (!isNull(arrSchdNo)) {
			MST_ARR_PR_R arrPr = getArrPrCache(poDNo);
			if (arrPr.purc_ddlv_flg()) {
				return true;
			}
			MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(arrSchdNo);
			if (!arrSchd.arr_skip_flg()) {
				boolean syncFlg = row.getBooleanNE(Purc_Chk03_DtlR.$sync_flg);
				boolean arrActFlg = ctlR.getBooleanNE(Purc_Chk03_CtlR.$arr_act_flg);
				if (syncFlg && arrActFlg) {
					return true;
				}
			}
		}
		else if (!isNull(row.getStringNE(Purc_Chk03_DtlR.$purc_schd_no))) {
			// 仕入諸掛は実行しない
			return false;
		}
		else {
			MAM_ITM_R itmR = getItmCache().get(row.getStringNE("itm_cd"), row.getStringNE("itm_sub1"), row.getStringNE("itm_sub2"),
					row.getStringNE("itm_sub3"));
			if (!MAC_STK_MNG_TYP.isNOT_MNG(itmR.stk_mng_typ()) && row.getBooleanNE(Purc_Chk03_DtlR.$sync_flg)) {
				return true;
			}

		}
		
		return false;
	}
	protected boolean isArrActTgt4PurcDtl(MCRow row, MCRow ctlR) {
		
		if (ctlR.getBooleanNE(Purc_Chk03_CtlR.$purc_dtl_flg)) {
			
			MST_ARR_SCHD_R arrSchd = getArrSchdCache().get(row.getStringNE(Purc_Chk03_DtlR.$arr_schd_no));
			if (!isNull(arrSchd)
				 && MSC_ARR_PTN_TYP.isN_YET_ARR(arrSchd.arr_ptn_typ())
				 && !arrSchd.arr_skip_flg()
				 && arrSchd.arr_qty().isPositive()
				 && arrSchd.purc_qty().isPositive()) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 締処理提供サービス（締日チェック）を実行します。
	 * 
	 * @param c2 チェック対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void callCl_ChkOpe(MCList<Purc_Chk03_IoR> c2,
			MCJoinKey<MCList<Purc_Chk03_HdrR>> d2h, MCJoinKey<MCList<Purc_Chk03_DtlR>> i2d,
			Purc_Chk03_CtlR up3) {
		
		if (c2.size() == 0) {
			return;
		}
		
		MSBIL_ClService.Cl_Chk03 sope = MSBIL_ClService
				.crtCl_Chk03();
		
		
		Map_Cl_Chk03_CndR_Purc_Chk03_IoR<Cl_Chk03_CndR, Purc_Chk03_IoR> dmap 
			= createMap_Cl_Chk03_CndR_Purc_Chk03_IoR();
		dmap.setWith(i2d, d2h, up3);
		addAll(sope.up0(), c2, dmap);
		
		sope.exec();

		MCIndexKey cu2PegIk = null;
		for(Cl_Chk03_CndR r : sope.down0()) {
			if (r.err_flg()) {
				if (cu2PegIk == null) {
					cu2PegIk = c2.createIndex(Purc_Chk03_IoR.$peg_no);
				}
				Purc_Chk03_IoR ior = c2.getFirst(cu2PegIk, r.peg_no());
				setErrFlg(ior, i2d, d2h);
			}
		}
	}

	/**
	 * 締処理提供サービス（締日チェック）用のRowMapperを作成します。
	 */
	protected Map_Cl_Chk03_CndR_Purc_Chk03_IoR<Cl_Chk03_CndR, Purc_Chk03_IoR> createMap_Cl_Chk03_CndR_Purc_Chk03_IoR() {
		if (_Map_Cl_Chk03_CndR_Purc_Chk03_IoR == null) {
			_Map_Cl_Chk03_CndR_Purc_Chk03_IoR = new Map_Cl_Chk03_CndR_Purc_Chk03_IoR<Cl_Chk03_CndR, Purc_Chk03_IoR>();
		}
		_Map_Cl_Chk03_CndR_Purc_Chk03_IoR.setWith(null, null, null);
		return _Map_Cl_Chk03_CndR_Purc_Chk03_IoR;
	}
	protected Map_Cl_Chk03_CndR_Purc_Chk03_IoR<Cl_Chk03_CndR, Purc_Chk03_IoR> _Map_Cl_Chk03_CndR_Purc_Chk03_IoR = null;
	/**
	 * 締処理提供サービス（締日チェック）用のRowMapperです。
	 */
	public class Map_Cl_Chk03_CndR_Purc_Chk03_IoR<D extends Cl_Chk03_CndR, S extends Purc_Chk03_IoR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<MCList<Purc_Chk03_DtlR>> _i2d;
		protected MCJoinKey<MCList<Purc_Chk03_HdrR>> _d2h;
		protected Purc_Chk03_CtlR _up3;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 */
		public void setWith(MCJoinKey<MCList<Purc_Chk03_DtlR>> _i2d, MCJoinKey<MCList<Purc_Chk03_HdrR>> _d2h, 
				Purc_Chk03_CtlR _up3){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._up3 = _up3;
			
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, Purc_Chk03_IoR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, Purc_Chk03_IoR.$dlv_loc_cd);
	
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.purc_cls_chk_flg(true);
			
			Purc_Chk03_DtlR dr = src.getJoinedRow(_i2d);
			if (dr != null) {
				Purc_Chk03_HdrR hr = dr.getJoinedRow(_d2h);
				if (hr != null) {
					// 値引・値増、明細訂正、非在庫を除き、在庫締チェックを行う
					MAM_ITM_R itm = getItmCache().get(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3());
					if (!isDscntTrdPtn(hr.trd_ptn_typ()) && !_up3.purc_dtl_flg() && MAC_STK_MNG_TYP.isMNG(itm.stk_mng_typ())) {
						// 入荷実績SVを実行する場合は入荷実績SVのチェックで在庫締めチェックが行われるのでスキップ
						if(!isArrActTgt(dr, _up3)){
							dest.stk_cls_chk_flg(true);
						}
					}
					if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
						MAM_BP_R spplR = getSpplCache().get(hr.sppl_cd());
						if (!isNull(spplR)) {
							dest.bp_cd(spplR.asppl_cd());
						}
						dest.ac_dt(hr.ac_dt());
						dest.itm_cd(dr.itm_cd());
						dest.itm_sub1(dr.itm_sub1());
						dest.itm_sub2(dr.itm_sub2());
						dest.itm_sub3(dr.itm_sub3());
						dest.loc_cd(src.pai().in_to_loc_cd());
					}
					if (isTgtBeforeClChk(_up3) && 
							(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ()))) {
						dest.can_ac_dt(hr.can_ac_dt());
						MST_PURC_ACT_R befH = getPurcActCache().get(hr.purc_act_no(), hr.purc_act_seq());
						dest.old_bp_cd(befH.asppl_cd());
						MST_PURC_ACT_D_R befD = getPurcActDCache().get(dr.purc_act_d_no(), dr.purc_act_d_seq());
						dest.old_itm_cd(befD.itm_cd());
						dest.old_itm_sub1(befD.itm_sub1());
						dest.old_itm_sub2(befD.itm_sub2());
						dest.old_itm_sub3(befD.itm_sub3());
						
						MST_PURC_ACT_IO_R befI = getPurcActIoCache().get(src.purc_act_io_no(), src.purc_act_io_seq());
						dest.old_loc_cd(befI.in_to_loc_cd());
					}
				}
			}
		}
	}
	/**
	 * 変更前の締処理チェック対象かどうかを判定します。
	 */
	protected boolean isTgtBeforeClChk(Purc_Chk03_CtlR up3) {
		//仕入明細訂正以外が対象
		return !up3.purc_dtl_flg();
	}
	
	/**
	 * 受払とその明細及びヘッダのエラーフラグを設定します。
	 * @param ior 受払
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void setErrFlg(Purc_Chk03_IoR ior, MCJoinKey<MCList<Purc_Chk03_DtlR>> i2d, MCJoinKey<MCList<Purc_Chk03_HdrR>> d2h) {
		if (ior == null) {
			return;
		}
		ior.err_flg(true);
		Purc_Chk03_DtlR dr = ior.getJoinedRow(i2d);
		setErrFlg(dr, d2h);
	}

	/**
	 * 明細とそのヘッダのエラーフラグを設定します。
	 * @param dr 明細
	 * @param d2h 明細からヘッダを取得するためのキー
	 */
	protected void setErrFlg(Purc_Chk03_DtlR dr, MCJoinKey<MCList<Purc_Chk03_HdrR>> d2h) {
		if (dr == null) {
			return;
		}
		dr.err_flg(true);
		Purc_Chk03_HdrR hr = dr.getJoinedRow(d2h);
		if (hr == null) {
			return;
		}
		hr.err_flg(true);
	}
	
	protected void complIoCommon(Purc_Ins01_DtlR row , Purc_Ins01_IoR ioRow){
		// 未着管理の場合、ロット、サブロット、格付ＣＤに未確定文字列をセット
		if (MSC_ARR_PTN_TYP.isN_YET_ARR(row.arr_ptn_typ())
				&& MAC_DATA_CRUD_TYP.isCRT(ioRow.data_crud_typ())) {
			ioRow.lot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
			ioRow.sublot_no(MSC_PURC_UNFIX_STR.UNFIXED.value());
			ioRow.gd_cd(MSC_PURC_UNFIX_STR.UNFIXED.value());
		}
	}

	protected void compDtlCommon(MCList<Purc_Ins01_HdrR> hdrL, Purc_Ins01_DtlR row, Purc_Ins01_CtlR up0) {
		if (MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
			MAM_ITM_R itm = getItmCache().get(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());
			row.sno1_mng_typ(itm.sno1_mng_typ());
			row.sno2_mng_typ(itm.sno2_mng_typ());
			row.sno3_mng_typ(itm.sno3_mng_typ());
			row.sno4_mng_typ(itm.sno4_mng_typ());
		}
		if (!MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
			// 税率
			MAM_TAX_R taxRow = getTaxCache().get(row.tax_cd());
			row.tax_rate(taxRow.tax_rate());
			row.inc_tax_flg(taxRow.inc_tax_flg());
			MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(row.purc_act_d_no(), row.purc_act_d_seq());
			if (!up0.purc_dtl_flg() && !isNull(purcActDR.purc_src_typ())) {
				complForVmi(row, purcActDR);
			}

			// 経費購買FLG
			if (!isNull(row.rsn_cd())) {
				MAM_BIZ_RSN_R rsnRow = getRsnCache().get(row.rsn_cd());
				row.xpns_po_flg(rsnRow.xpns_purc_flg());

				// 負担取引先（経費の理由が設定されているか、取引が値引の場合は発注先と同じ値を設定する）
				Purc_Ins01_HdrR hdrRow = hdrL.getFirst(Purc_Ins01_HdrR.$peg_no, row.hdr_peg_no());
				if (row.xpns_po_flg() || isDscntTrdPtn(hdrRow.trd_ptn_typ())) {
					row.bd_bp_cd(hdrRow.sppl_cd());
					// 負担部門ＷＧ
					MAM_DPT_R bdDptRow = getCacheBdDpt(hdrRow, row);
					row.bd_wg_cd(bdDptRow.wg_cd());
				}
				else {
					row.bd_bp_cd(null);
					row.bd_wg_cd(null);
				}

			}
			
			// 源泉税
			if (!isNull(row.wtax_rate())) {
				Purc_Ins01_HdrR hdrRow = hdrL.getFirst(Purc_Ins01_HdrR.$peg_no, row.hdr_peg_no());
				row.wtax_amt(getTaxAmt(row.trd_cur_amt(), 
						row.wtax_rate(), hdrRow.amt_dec_place(), getCo().wtax_rnd_typ()));
			}
			
			Purc_Ins01_HdrR hdrRow = hdrL.getFirst(Purc_Ins01_HdrR.$peg_no, row.hdr_peg_no());
			
			// 暫定買掛
			if (MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
				hdrRow.temp_ap_use_flg(getCo().temp_ap_use_flg());
				row.temp_ap_flg(isTempAp(up0, hdrRow, row));
			}
			else {
				MST_PURC_ACT_R purcActR = getPurcActCache().get(hdrRow.purc_act_no(), hdrRow.purc_act_seq());
				hdrRow.temp_ap_use_flg(purcActR.temp_ap_use_flg());
				// 新規以外は登録済の同時計上で暫定買掛か判断する
				row.arr_sync_flg(row.sync_flg());
				row.temp_ap_flg(purcActDR.temp_ap_flg());
			}
			if (!MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ()) && row.temp_ap_flg()) {
				// 暫定買掛の場合、同時計上と同じ更新を行う
				row.sync_flg(true);
			}
			// 受領インボイス明細ＮＯを補完
			if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ()) && !isNull(row.purc_schd_no())) {
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache().get(row.purc_schd_no());
				if (!row.temp_ap_flg()) {
					row.rcpt_iv_d_no(nvl(row.rcpt_iv_d_no(), purcSchdR.getStringNE("rcpt_iv_d_no")));
				}
			}
			// 単価再取得対象外ＦＬＧがない画面から呼ばれた場合は仕入実績明細または受領インボイス明細または発注明細を引継ぐ
			if (!up0.rcpt_iv_form_flg() && !up0.purc_form_flg() && !up0.purc_ret_flg()) {
				if (!isNull(row.purc_act_d_no())) {
					row.upri_not_tgt_flg(purcActDR.upri_not_tgt_flg());
				}
				else if (!isNull(row.rcpt_iv_d_no())) {
					MST_RCPT_IV_D_R rcptIvD = getRcptIvDCache().get(row.rcpt_iv_d_no());
					row.upri_not_tgt_flg(rcptIvD.upri_not_tgt_flg());
				}
				else if (!isNull(row.po_d_no())) {
					MST_PO_D_R poD = getPoDCache().get(row.po_d_no());
					row.upri_not_tgt_flg(poD.upri_not_tgt_flg());
				}
			}
		}
		if (!row.sundry_itm_flg()) {
			row.itm_nm(null);
			row.iv_itm_nm(null);
		}

	}
	
	protected boolean isDscntTrdPtn(String trdPtnTyp){
		return MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp) ||
				MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp) ||
				MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp);
	}

	protected void compHdrCommon(Purc_Ins01_HdrR row){
		// 発注先キャッシュより、仕入金額端数処理区分・仕入税端数処理区分,買掛先・支払予定管理先・支払先を補完
		MAM_BP_R sppl = getSpplCache().get(row.sppl_cd());
		if (!isNull(sppl)) {
			row.purc_amt_rnd_typ(sppl.purc_amt_rnd_typ());
			row.purc_tax_rnd_typ(sppl.purc_tax_rnd_typ());
			row.sppl_cd(sppl.bp_cd());
			row.asppl_cd(sppl.asppl_cd());
			row.bsppl_cd(sppl.bsppl_cd());
			row.psppl_cd(sppl.psppl_cd());
			// 与信管理先
			row.cred_cd(sppl.ap_cred_cd());
		}
		// 取引通貨キャッシュより、単価小数部有効桁数・金額小数部有効桁数を補完
		MAM_CUR_R cur = getCurCache().get(row.trd_cur_cd());
		if (!isNull(cur)) {
			row.upri_dec_place(cur.upri_dec_place());
			row.amt_dec_place(cur.amt_dec_place());
		}
	}
	
	/**
	 * Upd01、Ins01用キャッシュ作成。Chkオペレーションでキャッシュしていない情報を取得する。
	 */
	protected void crtCacheForInsUpd(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<Purc_Ins01_IoR> ioL){
		
		initRsnCache(dtlL);
		initAcRsnCache(dtlL);
		initItmJnlCache(dtlL);
		
		MCIndexKey dtlKey = dtlL.createIndex(Purc_Ins01_DtlR.$peg_no);
		MCList<Purc_Ins01_IoR> cacheL = MCList.create(Purc_Ins01_IoR.class);
		for(Purc_Ins01_IoR ioR : ioL) {
			Purc_Ins01_DtlR dtlR = dtlL.getFirst(dtlKey, ioR.dtl_peg_no());
			if (!dtlR.sync_flg() && !MSC_STK_INSP_TYP.isYET(ioR.stk_insp_typ()) && !isNull(ioR.arr_act_no())) {
				cacheL.add(ioR);
			}
		}
		if (!cacheL.isEmpty()) {
			initInspActCache(ioL);
			initPaiCcByAaNo(ioL);
		}
	}
	
	/**
	 * 外注製造指図サービス対象の明細行のリストを返します。<br>
	 * 仕入実績のＤＢＣキャッシュを使用するため、仕入実績更新後の動作は保証しません。
	 * @param ctlR 制御用コンテナ
	 * @param up0 ヘッダ上り電文
	 * @param up1 明細上り電文
	 * @param up2 詳細上り電文
	 * @return 外注製造指図サービス対象の明細行のリスト
	 */
	protected <E extends MCRow> MCList<E> getOursrcMfgTgtUp1(MCRow ctlR, MCList<?> up0, MCList<E> up1, MCList<?> up2) {

		MCList<E> outsrcTgt = MCList.create(up1.createRow());
		
		// 仕入直送・検査実績以外から実行された場合は、受払実績作成FLGがオフの場合は対象にしない
		if (!ctlR.getBooleanNE("io_make_flg")
				&& (!ctlR.getBooleanNE("purc_ddlv_reg_exec_flg")
						&& !ctlR.getBooleanNE("insp_act_srvs_flg"))) {
			return outsrcTgt;
		}
		
		// 仕入実績明細訂正から呼ばれた場合は対象にしない
		if (ctlR.getBooleanNE("purc_dtl_flg")) {
			return outsrcTgt;
		}
		
		MCIndexKey idxUp1 = up1.createIndex("hdr_peg_no");
		MCIndexKey idxUp2 = up2.createIndex("dtl_peg_no");
		
		for (MCRow hdrRow : up0) {
			
			// 仕入値引・値増、経費購買値引・値増の場合、対象外にする
			String trdPtnTyp = hdrRow.getStringNE("trd_ptn_typ");
			if (isDscnt(trdPtnTyp)) {
				continue;
			}
			
			MCList<E> dtlL = up1.subList(idxUp1, hdrRow.getNumber("peg_no"));
			for (E dtlRow : dtlL) {
				
				if (isNull(dtlRow.getString("mfg_inst_no"))) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.getString("data_crud_typ"))
						|| MAC_DATA_CRUD_TYP.isDEL(dtlRow.getString("data_crud_typ"))) {
					outsrcTgt.add(dtlRow);
				}
				else {
					// 検収合格数,検収不良数,ロットNO,サブロットNO,仕入日,計上日,打切FLGが変更されたら対象とする
					boolean isChange = false;
					MST_PURC_ACT_R pa =	getPurcActCache().get(
							hdrRow.getString("purc_act_no"), 
							hdrRow.getNumber("purc_act_seq"));
					if (!hdrRow.getDate("purc_dt").eq(pa.purc_dt()) ||
							!hdrRow.getDate("ac_dt").eq(pa.ac_dt())) {
						isChange = true;
					}
					
					MCList<?> ioL = up2.subList(idxUp2, dtlRow.getNumber("peg_no"));
			
					MST_PURC_ACT_D_R padRow = getPurcActDCache().get(
							dtlRow.getString("purc_act_d_no"), 
							dtlRow.getNumber("purc_act_d_seq"));
					if ((!padRow.accpt_dfct_flg() && dtlRow.getBoolean("accpt_dfct_flg"))
							|| (padRow.accpt_dfct_flg() && !dtlRow.getBoolean("accpt_dfct_flg"))
							|| (!isSame(padRow.trd_unit_qty(), dtlRow.getNumber("trd_unit_qty")))) {
						isChange = true;
					}
					
					// ロットNO, サブロットNOの変更をチェック
					for (MCRow ioRow : ioL) {
						
						// 一致する仕入実績受払を取得
						MST_PURC_ACT_IO_R paiRow = getPurcActIoCache().get(
								ioRow.getString("purc_act_io_no"),
								ioRow.getNumber("purc_act_io_seq"));
						if (!isSame(paiRow.lot_no(), ioRow.getString("lot_no"))) {
							isChange = true;
							break;
						}
						if (!isSame(paiRow.sublot_no(), ioRow.getString("sublot_no"))) {
							isChange = true;
							break;
						}
						if (MAC_DATA_CRUD_TYP.isDEL(ioRow.getString("data_crud_typ")) && !isNull(paiRow.lot_no())) {
							isChange = true;
							break;
						}
					}
					// 打切FLGの変更をチェック
					MST_PURC_SCHD_R pusRow = getPurcSchdCache().get(dtlRow.getString("purc_schd_no"));
					if (!isSame(dtlRow.getBoolean("abort_flg"), pusRow.abort_flg())) {
						isChange = true;
					}
					if (isChange) {
						outsrcTgt.add(dtlRow);
					}
				}
				
			}
			
		}

		return outsrcTgt;
		
	}
	
	/**
	 * 仕入直送の場合は、売上予定サービスを実行する。
	 * 
	 * @param dtlL 仕入実績明細リスト
	 * @param ctlR  制御用上り電文
	 */
	protected void callSlsSchdSrv(MCList<Purc_Ins01_DtlR> dtlL, Purc_Ins01_CtlR ctlR) {
		
		MSBBL_SlsSchdService.Sls_Schd_Upd04 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
		
		MCList<MST_PURC_ACT_D_R> cnd = MCList.create(MST_PURC_ACT_D_R.class);
		dtlL.forEach(dr -> {
			MST_PURC_ACT_D_R r = dr.pad();
			if (!isNull(r) && !isNull(r.purc_schd_no())) {
				MST_PURC_ACT_D_R cr = MST_PURC_ACT_D_R.create();
				cr.purc_act_d_no(r.purc_act_d_no());
				cr.purc_act_d_seq(r.purc_act_d_seq());
				cnd.add(cr);
			}
		});
		MCQueryApiBuilder cnd_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_D_R.create("T"));
		dbWkInsert("MSBDL5180_MSW_PURC_ACT_D_I01", cnd, cnd_bldr.getBaseDbc());
		MCList<Sls_Schd_Upd04_DtlR> up0L = MCList.create(Sls_Schd_Upd04_DtlR.class);
		executeQuery(up0L, MSBDL5180_MST_PURC_ACT_D_S01());
		dbWkDelete("MSBDL5180_MSW_PURC_ACT_D_D01", cnd_bldr.getBaseDbc());
		MCIndexKey k = up0L.createIndex(Sls_Schd_Upd04_DtlR.$purc_act_d_no);
		
		for (Purc_Ins01_DtlR dtlR : dtlL) {
			
			Sls_Schd_Upd04_DtlR up0R = up0L.getFirst(k, dtlR.purc_act_d_no());
			
			if (!isNull(up0R) && !up0R.isEmpty()) {
				
				up0R.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_ACT_D.value());
				
				up0R.data_crud_typ(dtlR.data_crud_typ());
				up0R.purc_act_d_no(dtlR.purc_act_d_no());
				up0R.sls_purc_sync_flg(ctlR.purc_ddlv_reg_exec_flg());
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					
					up0R.trd_unit_qty(dtlR.trd_unit_qty());
					up0R.trd_unit_cd(dtlR.trd_unit_cd());
					up0R.base_unit_qty(dtlR.base_unit_qty());
					up0R.base_unit_cd(dtlR.base_unit_cd());
					up0R.lot_no(dtlR.lot_no());
					up0R.sublot_no(dtlR.sublot_no());
					up0R.accpt_dfct_flg(dtlR.accpt_dfct_flg());
				}
				
				ope.up0().add(up0R);
			}
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * 債務与信更新サービス
	 * 
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callCredUpd02(MCList<MST_PURC_ACT_R> hdrL, MCList<MST_PURC_ACT_D_R> dtlL) {

		if (getCo().ap_no_use_flg()) {
			return;
		}
		
		FXUCL_Cache<Cred_Upd02_CndR> credCache = new FXUCL_Cache<>();
		ArrayList<Comparable<?>[]> keyL =  new ArrayList<>();
		
		MCIndexKey idxkey = dtlL.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
		for (MST_PURC_ACT_R hdrR : hdrL) {
			if (isNull(hdrR.cred_cd())) {
				continue;
			}

			MCList<MST_PURC_ACT_D_R> subDtlL =
				dtlL
					.subList(idxkey, hdrR.purc_act_no(), hdrR.purc_act_seq())
					.subList(r -> !r.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg));

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
			cndR.amt(MCNumber.sum(cndR.amt(), getTrdCurIncTaxAmt(hdrR.trd_ptn_typ(), subDtlL)));
		}
		
		MCList<Cred_Upd02_CndR> upL = MCList.create(Cred_Upd02_CndR.class);
		for (Comparable<?>[] key : keyL) {
			Cred_Upd02_CndR cndR = credCache.getCache(key);
			if (!MCNumber.ZERO.eq(cndR.amt())) {
				upL.add(cndR);
			}
		}
		
		if (!isNull(upL)) {
			MSBGL_CredService.Cred_Upd02 o = MSBGL_CredService.crtCred_Upd02();
			o.up0().addAll(upL);
			o.exec();
		}
	}
	
	protected MCNumber getTrdCurIncTaxAmt(String trdPtnTyp, MCList<MST_PURC_ACT_D_R> dtlL) {

		// 合計金額
		MCNumber ttlAmt = MCNumber.ZERO;

		for (MST_PURC_ACT_D_R r : dtlL) {
			
			MAM_ITM_R itm = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (itm.dscnt_itm_flg() && !isDscntOrXtra(trdPtnTyp)) {
				ttlAmt = ttlAmt.add(r.trd_cur_amt().add(r.trd_cur_tax_amt()).negate());
			}
			else {
				ttlAmt = ttlAmt.add(r.trd_cur_amt().add(r.trd_cur_tax_amt()));
			}
		}
		
		if (isMinusAtm(trdPtnTyp)) {
			return ttlAmt.negate();
		}
		return ttlAmt;
	}
	
	protected boolean isMinusAtm(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_VMI(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp)) {
			return true;
		}

		return false;
	}
	
	protected boolean isDscntOrXtra(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) 
				|| MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp)) {
			return true;
		}
		return false;
	}
	
	protected boolean isDscnt(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp) || 
				MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp);
	}
	
	protected boolean isRtn(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp) ||
				MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp);
	}
	
	protected boolean isOutsrc(Purc_Ins01_CtlR ctrl, Purc_Ins01_HdrR hdrR,Purc_Ins01_DtlR dtlR) {
		MST_PO_D_R poD = getPoDOrRcptIvDCacheForCalcDtlAmt(dtlR);
		if(isCalledSlsRet(ctrl)) {
			return !isNull(dtlR.mfg_inst_no());
		}
		return poD.outsrc_flg();
	}
	
	protected boolean isCalledSlsRet(Purc_Ins01_CtlR ctrl) {
		return ctrl.purc_ret_flg() && ctrl.amt_calc_flg();
	}
	
	protected boolean isCalledPurcRet(Purc_Ins01_CtlR ctrl) {
		return ctrl.purc_ret_flg() && !ctrl.amt_calc_flg();
	}
	
	/**
	 * 金額計算対象外の仕入直送売上かどうかを判定します。<br>
	 * <br>
	 * 仕入金額項目が画面で入力可能なケース（例：仕入直送売上登録）において<br>
	 * 以下の条件で金額計算対象かどうかを判定します。<br>
	 * <ul>
	 * <li><b>外注品：</b>加工金額・有償支給金額が画面に存在せず、自動計算が必要なため「計算対象（false）」と判定します。</li>
	 * <li><b>購買品：</b>仕入金額が画面で直接入力可能であり、その値を優先するため「計算対象外（true）」と判定します。</li>
	 * </ul>
	 */
	protected boolean isNotCalcAmtPurcDdlv(Purc_Ins01_CtlR ctrl, Purc_Ins01_HdrR hdrR,Purc_Ins01_DtlR dtlR) {
		return ctrl.purc_ddlv_reg_exec_flg() && !ctrl.amt_calc_flg() && !isOutsrc(ctrl,hdrR, dtlR);
	}
	
	/**
	 * 金額計算対象外の売上返品かどうかを判定します。<br>
	 * <br>
	 * 以下の条件で金額計算対象かどうかを判定します。<br>
	 * <ul>
	 * <li><b>外注品：</b>加工金額・有償支給金額が画面に存在せず、自動計算が必要なため「計算対象（false）」と判定します。</li>
	 * <li><b>購買品：</b>参照元の仕入実績明細の金額を利用するため、「計算対象外（true）」と判定します。</li>
	 * </ul>
	 */
	protected boolean isNotCalcAmtSlsRet(Purc_Ins01_CtlR ctrl, Purc_Ins01_HdrR hdrR,Purc_Ins01_DtlR dtlR) {
		return isCalledSlsRet(ctrl) && !isOutsrc(ctrl,hdrR, dtlR);
	}

	protected void complForVmi(Purc_Ins01_DtlR dtlR, MST_PURC_ACT_D_R purcActDR) {
		MAM_TAX_R befTax = getTaxCache().get(purcActDR.tax_cd());
		MAM_TAX_R aftTax = getTaxCache().get(dtlR.tax_cd());
		dtlR.rsn_cd(purcActDR.rsn_cd());
		if (isSame(dtlR.trd_unit_qty(), purcActDR.trd_unit_qty())
				&& isSame(dtlR.trd_unit_cd(), purcActDR.trd_unit_cd())
				&& isSame(befTax.tax_rate(), aftTax.tax_rate())
				&& isSame(befTax.inc_tax_flg(), aftTax.inc_tax_flg())) {
			dtlR.purc_dtl_upd_flg(purcActDR.purc_dtl_upd_flg());
			dtlR.trd_cur_upri(purcActDR.trd_cur_upri());
			dtlR.trd_cur_onr_prov_upri(purcActDR.trd_cur_onr_prov_upri());
			dtlR.trd_cur_amt(purcActDR.trd_cur_amt());
			dtlR.trd_cur_proc_amt(purcActDR.trd_cur_proc_amt());
			dtlR.trd_cur_onr_prov_amt(purcActDR.trd_cur_onr_prov_amt());
			dtlR.trd_cur_tax_amt(purcActDR.trd_cur_tax_amt());
			dtlR.trd_cur_dscnt_amt(purcActDR.trd_cur_dscnt_amt());
			dtlR.base_cur_upri(purcActDR.base_cur_upri());
			dtlR.base_cur_proc_upri(purcActDR.base_cur_proc_upri());
			dtlR.base_cur_onr_prov_upri(purcActDR.base_cur_onr_prov_upri());
			dtlR.base_cur_dscnt_amt(purcActDR.base_cur_dscnt_amt());
			dtlR.base_cur_amt(purcActDR.base_cur_amt());
			dtlR.base_cur_proc_amt(purcActDR.base_cur_proc_amt());
			dtlR.base_cur_onr_prov_amt(purcActDR.base_cur_onr_prov_amt());
			dtlR.base_cur_tax_amt(purcActDR.base_cur_tax_amt());
			dtlR.ptax_cur_upri(purcActDR.ptax_cur_upri());
			dtlR.ptax_cur_proc_upri(purcActDR.ptax_cur_proc_upri());
			dtlR.ptax_cur_onr_prov_upri(purcActDR.ptax_cur_onr_prov_upri());
			dtlR.ptax_cur_dscnt_amt(purcActDR.ptax_cur_dscnt_amt());
			dtlR.ptax_cur_proc_amt(purcActDR.ptax_cur_proc_amt());
			dtlR.ptax_cur_onr_prov_amt(purcActDR.ptax_cur_onr_prov_amt());
			dtlR.ptax_cur_amt(purcActDR.ptax_cur_amt());
			dtlR.ptax_cur_tax_amt(purcActDR.ptax_cur_tax_amt());
			dtlR.dscnt_rsn_cd(purcActDR.dscnt_rsn_cd());
			dtlR.interim_flg(purcActDR.interim_flg());

			dtlR.re_calc_not_tgt_flg(true);
		}
		else {

		}
	}
	protected void callAccptEdi(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL) {
		MSLAL_AccptSendIfService.AccptSendIf_Upd01 o = MSLAL_AccptSendIfService.crtAccptSendIf_Upd01();
		MCIndexKey idxDtlL = dtlL.createIndex(Purc_Ins01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$temp_ap_flg);
		for (Purc_Ins01_HdrR r : hdrL) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				Map_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR<AccptSendIf_Upd01_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> map = createMap_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR();
				map.setWith(r);
				addAll(o.up0(), dtlL.subList(idxDtlL, r.purc_act_no(), false), map);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR<AccptSendIf_Upd01_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR() {
		return new Map_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR<AccptSendIf_Upd01_DtlR, Purc_Ins01_DtlR,Purc_Ins01_HdrR>();
	}

	public class Map_AccptSendIf_Upd01_DtlR_Purc_Ins01_DtlR<D extends AccptSendIf_Upd01_DtlR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_HdrR;
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AccptSendIf_Upd01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(AccptSendIf_Upd01_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_seq);
			addColumnPathMap(AccptSendIf_Upd01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(AccptSendIf_Upd01_DtlR.$purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(AccptSendIf_Upd01_DtlR.$data_crud_typ, Purc_Ins01_DtlR.$data_crud_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.purc_dt(_purc_Ins01_HdrR.purc_dt());
			dest.sppl_cd(_purc_Ins01_HdrR.sppl_cd());
		}
	}
	protected void callApDtlRegServiceChk01(MCList<Purc_Chk03_HdrR> hdrL,  MCList<Purc_Chk03_DtlR> dtlL) {
		
		if (getCo().ap_no_use_flg()) {
			return;
		}
		
		MSBHL_ApDtlRegService.ApDtl_Chk01 ope = MSBHL_ApDtlRegService.crtApDtl_Chk01();
		MCIndexKey idxDtlL = dtlL.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
		for (Purc_Chk03_HdrR r : hdrL) {
			Map_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR<ApDtl_Chk01_DtlR,Purc_Chk03_DtlR,Purc_Chk03_HdrR> map = createMap_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR();
			map.setWith(r);
			addAll(ope.up0(), dtlL.subList(idxDtlL, r.peg_no()), map);
		}
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
		copyErrFlg(dtlL, ope.down0());
	}
	
	protected void callApDtlRegServiceUpd01(MCList<Purc_Ins01_HdrR> hdrL, MCList<Purc_Ins01_DtlR> dtlL, MCList<MST_PURC_ACT_R> canHdrL) {
		
		if (getCo().ap_no_use_flg()) {
			return;
		}
		
		MSBHL_ApDtlRegService.ApDtl_Upd01 ope = MSBHL_ApDtlRegService.crtApDtl_Upd01();
		MCIndexKey idxDtlL = dtlL.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
		MCIndexKey idxCanHdr = canHdrL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$slip_sts_typ);
		for (Purc_Ins01_HdrR r : hdrL) {
			Map_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR<ApDtl_Chk01_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> map = createMap_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR();
			map.setWith(r);
			MST_PURC_ACT_R canHdrR = canHdrL.getFirst(idxCanHdr, r.purc_act_no(), MAC_SLIP_STS_TYP.CAN.value());
			map.setCanHdrR(canHdrR);
			addAll(ope.up0(), dtlL.subList(idxDtlL, r.peg_no()), map);
		}
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	protected Map_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR<ApDtl_Chk01_DtlR,Purc_Chk03_DtlR,Purc_Chk03_HdrR> createMap_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR() {
		return new Map_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR<ApDtl_Chk01_DtlR, Purc_Chk03_DtlR, Purc_Chk03_HdrR>();
	}

	public class Map_ApDtl_Chk01_DtlR_Purc_Chk03_DtlR<D extends ApDtl_Chk01_DtlR, S extends Purc_Chk03_DtlR, W extends Purc_Chk03_HdrR> extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Chk03_HdrR;

		@Override
		public void setWith(W _purc_Chk03_HdrR){
			this._purc_Chk03_HdrR = _purc_Chk03_HdrR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ApDtl_Chk01_DtlR.$peg_no, Purc_Chk03_DtlR.$peg_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$data_crud_typ, Purc_Chk03_DtlR.$data_crud_typ);
			addColumnPathMap(ApDtl_Chk01_DtlR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$old_purc_act_d_seq, Purc_Chk03_DtlR.$purc_act_d_seq);
			addColumnPathMap(ApDtl_Chk01_DtlR.$pay_crryovr_times, Purc_Chk03_DtlR.$pay_crryovr_times);
			addColumnPathMap(ApDtl_Chk01_DtlR.$interim_flg, Purc_Chk03_DtlR.$interim_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$ncv_flg, Purc_Ins01_DtlR.$ncv_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$accpt_dfct_flg, Purc_Ins01_DtlR.$accpt_dfct_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.purc_act_no(_purc_Chk03_HdrR.purc_act_no());
			dest.rcpt_iv_mng_no(_purc_Chk03_HdrR.rcpt_iv_mng_no());
			dest.trd_ptn_typ(_purc_Chk03_HdrR.trd_ptn_typ());
			dest.trd_cur_cd(_purc_Chk03_HdrR.trd_cur_cd());
			dest.ac_dt(_purc_Chk03_HdrR.ac_dt());
			dest.can_ac_dt(_purc_Chk03_HdrR.can_ac_dt());
			dest.pay_basis_dt(nvl(_purc_Chk03_HdrR.pay_basis_dt(), getToday()));
			dest.pay_schd_dt(_purc_Chk03_HdrR.pay_schd_dt());
			dest.bsppl_cd(_purc_Chk03_HdrR.bsppl_cd());

			MAM_BP_R bpR = getSpplCache().get(_purc_Chk03_HdrR.sppl_cd());
			// VMI仕入の場合は、sppl_cdがnullになるためbsppl_cdを取得できない。
			// VMI仕入の呼出元でbsppl_cdを取引先マスタから既に取得しているので、上書きする必要はない。
			if (!isNull(bpR) && !isNull(bpR.bsppl_cd())) {
				dest.bsppl_cd(bpR.bsppl_cd());
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				MST_PURC_ACT_R purcActR = getPurcActCache().get(_purc_Chk03_HdrR.purc_act_no(), _purc_Chk03_HdrR.purc_act_seq());
				// 取消データの支払起算日は、MAX(元伝の支払起算日、取消計上日）
				if (isNull(_purc_Chk03_HdrR.pay_schd_dt()) && isNull(purcActR.pay_schd_dt())) {
					if (purcActR.pay_basis_dt().gt(_purc_Chk03_HdrR.can_ac_dt())) {
						dest.can_pay_basis_dt(purcActR.pay_basis_dt());
					}
					else {
						dest.can_pay_basis_dt(_purc_Chk03_HdrR.can_ac_dt());
					}
				}
			}
			
		}
	}
	
	protected Map_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR<ApDtl_Chk01_DtlR,Purc_Ins01_DtlR,Purc_Ins01_HdrR> createMap_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR() {
		return new Map_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR<ApDtl_Chk01_DtlR, Purc_Ins01_DtlR, Purc_Ins01_HdrR>();
	}

	public class Map_ApDtl_Chk01_DtlR_Purc_Ins01_DtlR<D extends ApDtl_Chk01_DtlR, S extends Purc_Ins01_DtlR, W extends Purc_Ins01_HdrR> extends FXUCC_RowMapperWith<D,S,W>{
		protected W _purc_Ins01_HdrR;
		protected MST_PURC_ACT_R _canHdrR;
		@Override
		public void setWith(W _purc_Ins01_HdrR){
			this._purc_Ins01_HdrR = _purc_Ins01_HdrR;
		}
		
		public void setCanHdrR(MST_PURC_ACT_R canHdrR) {
			_canHdrR = canHdrR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ApDtl_Chk01_DtlR.$peg_no, Purc_Ins01_DtlR.$peg_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$data_crud_typ, Purc_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(ApDtl_Chk01_DtlR.$po_d_no, Purc_Ins01_DtlR.$po_d_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$purc_act_d_no, Purc_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(ApDtl_Chk01_DtlR.$old_purc_act_d_seq, Purc_Ins01_DtlR.$purc_act_d_seq_old);
			addColumnPathMap(ApDtl_Chk01_DtlR.$purc_act_no, Purc_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$purc_act_seq, Purc_Ins01_DtlR.$purc_act_seq);
			addColumnPathMap(ApDtl_Chk01_DtlR.$bp_dlv_slip_no, Purc_Ins01_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$bp_dlv_slip_d_no, Purc_Ins01_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(ApDtl_Chk01_DtlR.$ap_typ, Purc_Ins01_DtlR.$ap_typ);
			addColumnPathMap(ApDtl_Chk01_DtlR.$ap_dpt_cd, Purc_Ins01_DtlR.$ap_dpt_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sno1, Purc_Ins01_DtlR.$sno1);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sno2, Purc_Ins01_DtlR.$sno2);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sno3, Purc_Ins01_DtlR.$sno3);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sno4, Purc_Ins01_DtlR.$sno4);
			addColumnPathMap(ApDtl_Chk01_DtlR.$pay_crryovr_times, Purc_Ins01_DtlR.$pay_crryovr_times);
			addColumnPathMap(ApDtl_Chk01_DtlR.$itm_cd, Purc_Ins01_DtlR.$itm_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$itm_sub1, Purc_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(ApDtl_Chk01_DtlR.$itm_sub2, Purc_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(ApDtl_Chk01_DtlR.$itm_sub3, Purc_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(ApDtl_Chk01_DtlR.$itm_nm, Purc_Ins01_DtlR.$itm_nm);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sundry_itm_flg, Purc_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sppl_itm_cd, Purc_Ins01_DtlR.$sppl_itm_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$sppl_itm_nm, Purc_Ins01_DtlR.$sppl_itm_nm);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_unit_cd, Purc_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_unit_qty, Purc_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_unit_cd, Purc_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_unit_qty, Purc_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(ApDtl_Chk01_DtlR.$tax_cd, Purc_Ins01_DtlR.$tax_cd);
			addColumnPathMap(ApDtl_Chk01_DtlR.$interim_flg, Purc_Ins01_DtlR.$interim_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_upri, Purc_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_amt, Purc_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_tax_amt, Purc_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_dscnt_amt, Purc_Ins01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_upri, Purc_Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_amt, Purc_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_tax_amt, Purc_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_dscnt_amt, Purc_Ins01_DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$wtax_rate, Purc_Ins01_DtlR.$wtax_rate);
			addColumnPathMap(ApDtl_Chk01_DtlR.$wtax_amt, Purc_Ins01_DtlR.$wtax_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$ncv_flg, Purc_Ins01_DtlR.$ncv_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$accpt_dfct_flg, Purc_Ins01_DtlR.$accpt_dfct_flg);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_proc_upri, Purc_Ins01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_proc_amt, Purc_Ins01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_onr_prov_upri, Purc_Ins01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$trd_cur_onr_prov_amt, Purc_Ins01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_proc_upri, Purc_Ins01_DtlR.$base_cur_proc_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_proc_amt, Purc_Ins01_DtlR.$base_cur_proc_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_onr_prov_upri, Purc_Ins01_DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_cur_onr_prov_amt, Purc_Ins01_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(ApDtl_Chk01_DtlR.$base_purc_ac_dt, Purc_Ins01_DtlR.$base_purc_ac_dt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.po_no(_purc_Ins01_HdrR.po_no());
			dest.rcpt_iv_no(_purc_Ins01_HdrR.rcpt_iv_no());
			dest.rcpt_iv_mng_no(_purc_Ins01_HdrR.rcpt_iv_mng_no());
			dest.purc_act_rev(_purc_Ins01_HdrR.purc_act_rev());
			dest.trd_cd(_purc_Ins01_HdrR.trd_cd());
			dest.trd_ptn_typ(_purc_Ins01_HdrR.trd_ptn_typ());
			dest.sppl_cd(_purc_Ins01_HdrR.sppl_cd());
			dest.asppl_cd(_purc_Ins01_HdrR.asppl_cd());
			dest.bsppl_cd(_purc_Ins01_HdrR.bsppl_cd());
			dest.purc_dpt_cd(_purc_Ins01_HdrR.purc_dpt_cd());
			dest.purc_usr_cd(_purc_Ins01_HdrR.purc_usr_cd());
			
			MST_PO_R poR = getPoCache().get(_purc_Ins01_HdrR.po_no());
			dest.wrk_no(poR.wrk_no());
			dest.act_dt(_purc_Ins01_HdrR.purc_dt());
			dest.ac_dt(_purc_Ins01_HdrR.ac_dt());
			dest.can_ac_dt(_purc_Ins01_HdrR.can_ac_dt());
			dest.pay_basis_dt(_purc_Ins01_HdrR.pay_basis_dt());
			dest.pay_schd_dt(_purc_Ins01_HdrR.pay_schd_dt());
			
			dest.xrate(_purc_Ins01_HdrR.xrate());
			dest.trd_cur_cd(_purc_Ins01_HdrR.trd_cur_cd());
			if (MAC_DATA_CRUD_TYP.isDEL(_purc_Ins01_HdrR.data_crud_typ())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(dest.data_crud_typ()) 
					|| MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
				
				MST_PURC_ACT_D_R purcActDR = getPurcActDCache().get(src.purc_act_d_no(), src.purc_act_d_seq_old());
				MST_PURC_ACT_R purcActR = getPurcActCache().get(purcActDR.purc_act_no(), purcActDR.purc_act_seq());
				
				dest.can_purc_act_d_seq(purcActDR.purc_act_d_seq().add(1));
				dest.can_purc_act_seq(purcActR.purc_act_seq().add(1));
				
				dest.can_ap_dpt_cd(purcActDR.ap_dpt_cd());
				dest.can_pay_basis_dt(purcActR.pay_basis_dt());
				
				if (!isNull(_canHdrR)) {
					dest.can_pay_basis_dt(_canHdrR.pay_basis_dt());
				}
			}
			MCList<Purc_Ins01_HdrR> hdrL = MCList.create(Purc_Ins01_HdrR.class);
			hdrL.add(_purc_Ins01_HdrR);
			if ((isPurcTypDecideInSrvs(src, hdrL) && !isNull(src.mfg_inst_no()))
					|| (!isDscntTrdPtn(_purc_Ins01_HdrR.trd_ptn_typ()) && !isNull(src.purc_typ()) && !MAC_PURC_TYP.isPURC_ITM(src.purc_typ()))){
				
				dest.outsrc_flg(true);
				
				MAM_BP_R spplR = getSpplCache().get(_purc_Ins01_HdrR.sppl_cd());
				dest.repurc_obli_flg(spplR.repurc_obli_flg());
			}
		}
	}
	/**
	 * 取引マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache;
	
	/**
	 * GALinkに送信する
	 */
	protected void callGALink(MCList<MST_PURC_ACT_R> hdrL, String dataCrudTyp) {
		if (!isCallGALink()) {
			return;
		}
		
		MCList<MST_PURC_ACT_R> sendL = hdrL.shallowClone();
		if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
			sendL.merge(
				// インボイス取引の場合、仕入伝票に複数の仕入実績が含まれるので、引数に存在しない分を取得する
				// インボイスに対応する仕入実績がすべて揃わないことがあるのは更新の場合のみ（仕入実績一覧の訂正とか仕入明細訂正とか）
				getPurcActIvLForGALink(hdrL.subList(r -> !isNullOrNullVal(r.rcpt_iv_mng_no()))),
				MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq
			);
		}
		
		if (_trdCache == null) {
			_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(
				MCQueryApiBuilder.create(MAM_TRD_R.create("T")), sendL, MST_PURC_ACT_R.$trd_cd
			);
		}
		MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd01 o = MSBDL_PurcSlipSendIfService.crtPurcSlipSendIf_Upd01();
		for (MST_PURC_ACT_R sendR : sendL) {
			MAM_TRD_R trdR = _trdCache.get(sendR.trd_cd());
			if (!trdR.not_purc_slip_snd_flg()) {
				PurcSlipSendIf_Upd01_DtlR r = o.up0().add();
				r.purc_act_no(sendR.purc_act_no());
				r.purc_act_seq(sendR.purc_act_seq());
				r.data_crud_typ(dataCrudTyp);
				r.setAttributes(sendR);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected boolean isCallGALink() {
		String parm = getSysParmNE("GA_PURC_SLIP_EXT_SYS_CD");
		if (!isNull(parm)) {
			MAM_EXT_SYS_R m1 = MAM_EXT_SYS_R.create("M1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(m1);
			bldr.setSelect(m1.ext_sys_cd);
			bldr.setWhere(m1.ext_sys_cd.eq(bind("1")), parm);
			bldr.addWhereWithAnd(m1.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.AC.value())));
			bldr.addWhereWithAnd(m1.web_api_flg.eq(value(true)));
			
			MCRow rslt = MCRow.create();
			dbSelect("MSBDL5180_MAM_EXT_SYS_S01", rslt, bldr);
			return !isNull(rslt.getStringNE(MAM_EXT_SYS_R.$ext_sys_cd));
		}
		return false;
	}
	protected MCList<MST_PURC_ACT_R> getPurcActIvLForGALink(MCList<MST_PURC_ACT_R> ivL) {
		MCList<MST_PURC_ACT_R> paL = MCList.create(MST_PURC_ACT_R.class);
		if (!ivL.isEmpty()) {
			MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.purc_act_no, t.purc_act_seq, t.trd_cd);
			bldr.setWhere(t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			bldr.addConstWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBDL5180_MST_PURC_ACT_S11", paL, bldr, ivL.groupBy(MST_PURC_ACT_R.$rcpt_iv_mng_no));
		}
		return paL;
	}
	
	/**
	 * 暫定買掛か判定する
	 * @param ctlR 制御用上り電文
	 * @param hdrR ヘッダ
	 * @param dtlR 明細
	 * @return 暫定買掛の場合trueを返却する
	 */
	protected boolean isTempAp(Purc_Ins01_CtlR ctlR, Purc_Ins01_HdrR hdrR, Purc_Ins01_DtlR dtlR) {
		// 以下の場合はtrue
		// ・入荷パタンが「未着管理」でない
		// ・発注先が受領インボイス取引対象
		// ・暫定買掛使用ＦＬＧがオン
		// ・確定ＦＬＧがオフ
		// ・以下のいずれかがオン
		//   呼出元・受領インボイス登録、呼出元・入荷実績登録サービス
		// ・同時計上ＦＬＧがオフ
		// ・発注引継
		MAM_BP_R bpR = getSpplCache().get(hdrR.sppl_cd());
		return !MSC_ARR_PTN_TYP.isN_YET_ARR(dtlR.arr_ptn_typ())
				&& bpR.sppl_iv_flg()
				&& hdrR.temp_ap_use_flg()
				&& !hdrR.fix_flg()
				&& (ctlR.rcpt_iv_form_flg() || ctlR.arr_act_srvs_flg())
				&& !dtlR.arr_sync_flg()
				&& !isNull(dtlR.po_d_no());
	}
	
	/**
	 * 受領インボイスのリビジョン更新
	 */
	protected void updRcptIvRev(Purc_Ins01_CtlR ctlR, MCList<Purc_Ins01_HdrR> hdrL) {
		// 受領インボイス登録から呼ばれた場合は更新しない（受領インボイス登録サービスで対応済）
		if (ctlR.rcpt_iv_form_flg()) {
			return;
		}
		
		MCList<Purc_Ins01_HdrR> tgtL = hdrL.subList(r -> !isNull(r.rcpt_iv_mng_no()));
		if (tgtL.isEmpty()) {
			return;
		}
		
		// 更新対象となる受領インボイスを取得
		MCList<MST_RCPT_IV_R> updRcptIvL = MCList.create(MST_RCPT_IV_R.class);
		MCQueryApiBuilder updRcptIvL_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T"));
		dbSelectKey("MSBDL5180_MST_RCPT_IV_S04", updRcptIvL, updRcptIvL_bldr, tgtL);
		
		MCList<MST_RCPT_IV_D_R> updRcptIvDL = MCList.create(MST_RCPT_IV_D_R.class);
		MST_RCPT_IV_D_R updRcptIvDL_t = MST_RCPT_IV_D_R.create("T");
		MCQueryApiBuilder updRcptIvDL_bldr = MCQueryApiBuilder.create(updRcptIvDL_t);
		updRcptIvDL_bldr.setWhere(updRcptIvDL_t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
		dbSelect("MSBDL5180_MST_RCPT_IV_D_S04", updRcptIvDL, updRcptIvDL_bldr, updRcptIvL);
		
		MCIndexKey idxRcptIvD = updRcptIvDL.createIndex(MST_RCPT_IV_D_R.$rcpt_iv_mng_no, MST_RCPT_IV_D_R.$rcpt_iv_rev);
		MCIndexKey idxHdr = hdrL.createIndex(Purc_Ins01_HdrR.$rcpt_iv_mng_no, Purc_Ins01_HdrR.$rcpt_iv_rev);
		
		// 受領インボイスの改訂番号カウントアップ
		for (MST_RCPT_IV_R updRcptIvR : updRcptIvL) {
			MCNumber oldRevNo = updRcptIvR.rcpt_iv_rev();
			MCNumber newRevNo = oldRevNo.add(1);
			// 受領インボイスヘッダ
			updRcptIvR.rcpt_iv_rev(newRevNo);
			
			// 受領インボイス明細
			MCList<MST_RCPT_IV_D_R> subRcptIvDL = updRcptIvDL.subList(idxRcptIvD, updRcptIvR.rcpt_iv_mng_no(), oldRevNo);
			for (MST_RCPT_IV_D_R subRcptIvDR : subRcptIvDL) {
				subRcptIvDR.rcpt_iv_rev(newRevNo);
			}
			
			// 仕入実績ヘッダ
			MCList<Purc_Ins01_HdrR> subHdrL = hdrL.subList(idxHdr, updRcptIvR.rcpt_iv_mng_no(), oldRevNo);
			for (Purc_Ins01_HdrR subHdrR : subHdrL) {
				subHdrR.rcpt_iv_rev(newRevNo);
			}
		}
		
		if (updRcptIvL.size() > 0) {
			dbUpdateKey("MSBDL5180_MST_RCPT_IV_U01", updRcptIvL, updRcptIvL_bldr);
			dbUpdateKey("MSBDL5180_MST_RCPT_IV_D_U01", updRcptIvDL, updRcptIvDL_bldr);
		}
		
		callRevDataServiceIns01(updRcptIvL);
	}
	
	/**
	 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
	 * 受領インボイス改訂履歴テーブルを更新する。
	 * @param rcptIvL 受領インボイスリスト
	 */
	protected void callRevDataServiceIns01(MCList<MST_RCPT_IV_R> rcptIvL) {
		if (rcptIvL.size() > 0) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_RCPT_IV_R r : rcptIvL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.rcpt_iv_mng_no());
				opeR.rev_no(r.rcpt_iv_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_RCPT_IV.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
	}

	/**
	 * 与信を更新しないか判定する
	 * @param ctlR 制御用上り電文
	 * @param hdrR ヘッダ
	 * @param dtlR 明細
	 * @return 更新しない場合 true を返却する
	 */
	protected boolean isNotUpdCred(Purc_Ins01_CtlR ctlR, Purc_Ins01_HdrR hdrR, Purc_Ins01_DtlR dtlR) {
		// インボイス取引対象 かつ 以下のいずれかの場合は、与信を更新しない
		// ・暫定買掛がオン
		//	・呼出元・入荷実績サービスがオン
		//		⇒暫定買掛：与信に含めない
		//		⇒同時計上：事前に受領インボイスが必要(*1)
		//	・呼出元・仕入直送売上がオン
		//		⇒事前に受領インボイスが必要(*1)
		// (*1)：受領インボイス登録時の金額から変わらないので与信を更新する必要がない
		MAM_BP_R bpR = getSpplCache().get(hdrR.sppl_cd());
		if (bpR.sppl_iv_flg()) {
			if (ctlR.arr_act_srvs_flg() || ctlR.purc_ddlv_reg_exec_flg()) {
				return true;
			}
			else if (dtlR.temp_ap_flg()) {
				return true;
			}
		}
		return false;
	}

	//FMCB CUSTOM END
}