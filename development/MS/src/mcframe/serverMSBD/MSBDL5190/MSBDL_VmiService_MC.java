package mcframe.serverMSBD.MSBDL5190;

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
import mcframe.serverMSBD.MSBDL5190.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5180.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_VmiService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_VmiService_MC extends MSBDL_VmiService_MC_A{
	//FMCB CUSTOM START
	//----------------------------------
	// Cache
	//----------------------------------
	/** 取引マスタキャッシュ */
	protected MAM_TRD_R _trdCache = null;
	/** 為替レートマスタキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _xrateCache = null;
	/** 納税為替レートマスタキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _ptaxXrateCache = null;
	/** 取引先マスタキャッシュ */
	protected MCList<MAM_BP_R> _bpCache = MCList.create(MAM_BP_R.class);
	/** 部門マスタキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache = null;
	/** 税マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	/** 品目マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	/** 品目マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	/** 品目単位マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	/** 業務理由マスタキャッシュ */
	protected MAM_BIZ_RSN_R _rsnCache = MAM_BIZ_RSN_R.create();
	/** 仕入実績ヘッダのキャッシュ */
	protected MCList<MST_PURC_ACT_R> _purcActCache = MCList.create(MST_PURC_ACT_R.class);	
	/** 仕入実績明細キャッシュ */
	protected MCList<MST_PURC_ACT_D_R> _purcActDCache = MCList.create(MST_PURC_ACT_D_R.class);
	protected MCList<MST_PURC_ACT_IO_R> _purcActIoCache = MCList.create(MST_PURC_ACT_IO_R.class);
	/** 補完結果キャッシュ */
	protected MCList<Vmi_Chk01_DtlR> _myCache = MCList.create(Vmi_Chk01_DtlR.class);
	//----------------------------------
	// indexKey
	//----------------------------------
	/** 取引先マスタ */
	protected MCIndexKey _idxCacheBp = null;
	/** 仕入実績ヘッダ */
	protected MCIndexKey _idxCachePurcAct = null;
	/** 仕入実績明細 */
	protected MCIndexKey _idxCachePurcDAct = null;
	protected MCIndexKey _idxCachePurcActIo = null;
	/** 補完結果 */
	protected MCIndexKey _idxMyCache = null;
	//----------------------------------
	// Cache作成
	//----------------------------------
	public static final Class<MSBDL_VmiService> CLAZZ = MSBDL_VmiService.class;
	/**
	 * キャッシュ初期化（取引）
	 * 
	 * @param dtlL
	 */
	protected static void initTrdCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initTrdCache(dtlL);
	}
	/**
	 * キャッシュ初期化（為替レート）
	 * 
	 * @param dtlL
	 */
	protected static void initXrateCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initXrateCache(dtlL);
	}
	/**
	 * キャッシュ初期化（納税為替レート）
	 * 
	 * @param dtlL
	 */
	protected static void initPtaxXrateCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initPtaxXrateCache(dtlL);
	}
	/**
	 * キャッシュ初期化（取引先）
	 * 
	 * @param dtlL
	 */
	protected static void initBpCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initBpCache(dtlL);
	}
	/**
	 * キャッシュ初期化（品目マスタ）
	 * 
	 * @param dtlL
	 */
	protected static void initItmCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	/**
	 * キャッシュ初期化（場所マスタ）
	 * 
	 * @param dtlL
	 */
	protected static void initLocCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initLocCache(dtlL);
	}
	/**
	 * キャッシュ初期化（業務理由マスタ）
	 * 
	 * @param dtlL
	 */
	protected static void initRsnCache() {
		object(CLAZZ)._initRsnCache();
	}
	/**
	 * キャッシュ初期化（部門マスタ）
	 * 
	 * @param dtlL
	 */
	protected static void initDptCache() {	
		object(CLAZZ)._initDptCache();
	}
	/**
	 * キャッシュ初期化（税）
	 * 
	 * @param dtlL
	 */
	protected static void initTaxCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initTaxCache(dtlL);
	}
	/**
	 * キャッシュ初期化（仕入実績明細）
	 * 
	 * @param dtlL
	 */
	protected static MCList<MST_PURC_ACT_D_R> initPurcActDCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		return object(CLAZZ)._initPurcActDCache(dtlL);
	}
	protected static void initPurcActIoCache(MCList<MST_PURC_ACT_D_R> purcActDC) {	
		object(CLAZZ)._initPurcActIoCache(purcActDC);
	}
	/**
	 * キャッシュ初期化（仕入実績）
	 * 
	 * @param dtlL
	 */
	protected static void initPurcActCache(MCList<MST_PURC_ACT_D_R> purcActDC) {	
		object(CLAZZ)._initPurcActCache(purcActDC);
	}
	
	protected static void initItmUnitCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initItmUnitCache(dtlL);
	}
	/**
	 * キャッシュ（自サービス補完結果）
	 */
	protected static void initMyCache(MCList<Vmi_Chk01_DtlR> dtlL) {	
		object(CLAZZ)._initMyCache(dtlL);
	}	
	//----------------------------------
	/**
	 * キャッシュ作成（取引）
	 * @param dtlL
	 */
	protected void _initTrdCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		MAM_TRD_R dbcR = MAM_TRD_R.create();
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(t);
		dbcR_bldr.setSelect(t.trd_cd);
		dbcR_bldr.setWhere(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC_VMI.value())));
		dbcR_bldr.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));
		dbSelect("MSBDL5190_MAM_TRD_S01", dbcR, dbcR_bldr);
		_trdCache = dbcR.clone();
	}
	/**
	 * キャッシュ作成（為替レート）
	 * @param dtlL
	 */
	protected void _initXrateCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		// 取引先マスタを先に初期化してから実行すること
		MCList<MAM_CUR_XRATE_R> bindL = MCList.create(MAM_CUR_XRATE_R.class);
		for (Vmi_Chk01_DtlR r : dtlL) {
			MAM_CUR_XRATE_R bindR = MAM_CUR_XRATE_R.create();
			bindR.fr_cur_cd(getBpCache(r).cur_cd());
			bindR.to_cur_cd(getCo().base_cur_cd());
			bindR.xrate_cd(getCo().purc_xrate_cd());
			bindL.add(bindR);
		}
		MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setWhere(t.fr_cur_cd.eq(bind("fr_cur_cd")));
		dbcL_bldr.addWhereWithAnd(t.to_cur_cd.eq(bind("to_cur_cd")));
		dbcL_bldr.addWhereWithAnd(t.xrate_cd.eq(bind("xrate_cd")));
		_xrateCache = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(dbcL_bldr, bindL,
				MAM_CUR_XRATE_R.$fr_cur_cd, MAM_CUR_XRATE_R.$to_cur_cd,
				MAM_CUR_XRATE_R.$xrate_cd);
	}
	/**
	 * キャッシュ作成（納税為替レート）
	 * @param dtlL
	 */
	protected void _initPtaxXrateCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		
		if (isNull(getCo().ptax_cur_cd())) {
			return;
		}
		MCList<MAM_CUR_XRATE_R> bindL = MCList.create(MAM_CUR_XRATE_R.class);
		for (Vmi_Chk01_DtlR r : dtlL) {
			MAM_CUR_XRATE_R bindR = MAM_CUR_XRATE_R.create();
			bindR.fr_cur_cd(getBpCache(r).cur_cd());
			bindR.to_cur_cd(getCo().ptax_cur_cd());
			bindR.xrate_cd(getCo().purc_xrate_cd());
			bindL.add(bindR);
		}
		MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setWhere(t.fr_cur_cd.eq(bind("fr_cur_cd")));
		dbcL_bldr.addWhereWithAnd(t.to_cur_cd.eq(bind("to_cur_cd")));
		dbcL_bldr.addWhereWithAnd(t.xrate_cd.eq(bind("xrate_cd")));
		_ptaxXrateCache = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(dbcL_bldr, bindL,
				MAM_CUR_XRATE_R.$fr_cur_cd, MAM_CUR_XRATE_R.$to_cur_cd,
				MAM_CUR_XRATE_R.$xrate_cd);
		

	}
	/**
	 * キャッシュ作成（取引先）
	 * @param dtlL
	 */
	protected void _initBpCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		
		if (null == _bpCache) {
			_bpCache = MCList.create(MAM_BP_R.class);
		}
		
		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R asppl = MAM_BP_R.create("ASPPL");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		dbc.addStringColumn("add_vmi_purc_dpt_cd");
		dbc.addStringColumn("add_ap_dpt_cd");
		dbc_bldr.addSelect(MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(t.bp_cd, bind("ac_dt"), value(false)).as("add_vmi_purc_dpt_cd"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_AP_DPT_CD2(t.bp_cd,t.asppl_cd, bind("ac_dt")).as("add_ap_dpt_cd"));
		dbc_bldr.addSelect(bsppl.bp_cd.as("bsppl_cd"));
		dbc_bldr.addSelect(bsppl.psppl_cd.as("psppl_cd"));
		dbc_bldr.addLeftOuterJoin(asppl, t.asppl_cd.eq(asppl.bp_cd));
		dbc_bldr.addLeftOuterJoin(bsppl, asppl.bsppl_cd.eq(bsppl.bp_cd));
		dbc_bldr.setWhere(t.bp_cd.eq(bind("stk_bp_cd")));
		dbSelect("MSBDL5190_MAM_BP_S01", dbc, dbc_bldr, dtlL);
		_bpCache.addAll(dbc);
		_idxCacheBp = _bpCache.createIndex(MAM_BP_R.$bp_cd);
	}
	/**
	 * キャッシュ作成（品目）
	 * @param dtlL
	 */
	protected void _initItmCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL,
				Vmi_Chk01_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_sub1,
				Vmi_Chk01_DtlR.$itm_sub2, Vmi_Chk01_DtlR.$itm_sub3);
	}

	/**
	 * キャッシュ作成（場所）
	 * @param dtlL
	 */
	protected void _initLocCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
				dtlL, Vmi_Chk01_DtlR.$loc_cd);
	}
	
	/**
	 * キャッシュ作成（業務理由）
	 * @param dtlL
	 */
	protected void _initRsnCache() {
		MCList<MAM_BIZ_RSN_R> rsnL = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder rsnL_bldr = MCQueryApiBuilder.create(t);
		rsnL_bldr.setSelect(t.biz_rsn_cd);
		rsnL_bldr.setWhere(t.purc_flg.eq(value(true)));
		rsnL_bldr.addWhereWithAnd(t.xpns_purc_flg.eq(value(true)));
		rsnL_bldr.setOrderByAsc(t.purc_sort_seq,t.biz_rsn_cd);
		dbSelect("MSBDL5190_MAM_BIZ_RSN_S01", rsnL, rsnL_bldr);
		if (!rsnL.isEmpty()) {
			_rsnCache = rsnL.get(0);
		}
	}
	
	/**
	 * キャッシュ作成（部門）
	 * @param dtlL
	 */
	protected void _initDptCache() {
 		MCList<Vmi_Chk01_DtlR> bindL = MCList.create(Vmi_Chk01_DtlR.class);
		for (MAM_BP_R bpR : _bpCache) {
			Vmi_Chk01_DtlR bindR = Vmi_Chk01_DtlR.create();
			bindR.vmi_purc_dpt_cd(bpR.getStringNE("add_vmi_purc_dpt_cd"));
			bindL.add(bindR);
		}
		_dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
				MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
				bindL, Vmi_Chk01_DtlR.$vmi_purc_dpt_cd);
	}
	/**
	 * キャッシュ取得（税）
	 * @param dtlL
	 */
	protected void _initTaxCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.addSelect(MAPA_TAX$F_GET_WTAX_RATE(bind("itm_cd"), bind("itm_sub1"),
				bind("itm_sub2"), bind("itm_sub3"), bind("dt")).as("add_wtax_rate"));
		dbcL_bldr.setWhere(t.purc_flg.eq(value(true)));
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbcL_bldr, dtlL, MAM_TAX_R.$tax_cd);
	}
	/**
	 * キャッシュ作成（仕入実績ヘッダ）
	 * @param r
	 */
	protected void _initPurcActCache(MCList<MST_PURC_ACT_D_R> purcActDC) {
		
		if(null == _purcActCache){
			_purcActCache = MCList.create(MST_PURC_ACT_R.class);	
		}
		MCList<MST_PURC_ACT_R> dbc = MCList.create(MST_PURC_ACT_R.class);
		MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MCList<MST_PURC_ACT_D_R> bindL = purcActDC.groupBy(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
		dbc_bldr.setSelect(t.purc_act_no, t.purc_act_seq);
		dbSelectKeyForUpdateNoWait("MSBDL5190_MST_PURC_ACT_S01", dbc, dbc_bldr, bindL);
		// チェックが複数回呼ばれる場合の対応
		_purcActCache.addAll(dbc);
		_idxCachePurcAct = _purcActCache.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
	}
	/**
	 * キャッシュ作成（仕入実績明細）
	 * @param r
	 */
	protected MCList<MST_PURC_ACT_D_R> _initPurcActDCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		
		if(null == _purcActDCache){
			_purcActDCache = MCList.create(MST_PURC_ACT_D_R.class);	
		}
		MCList<Vmi_Chk01_DtlR> bindL = dtlL.groupBy(Vmi_Chk01_DtlR.$purc_src_typ, Vmi_Chk01_DtlR.$purc_src_no);
		MST_PURC_ACT_R act = MST_PURC_ACT_R.create("ACT");
		MCList<MST_PURC_ACT_D_R> dbc = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		dbc_bldr.setWhere(t.purc_src_typ.eq(bind("purc_src_typ")));
		dbc_bldr.addWhereWithAnd(t.purc_src_no.eq(bind("purc_src_no")));
		dbc_bldr.addInnerJoin(act, act.purc_act_no.eq(t.purc_act_no)
				.and(act.purc_act_seq.eq(t.purc_act_seq))
				.and(act.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
		dbSelect("MSBDL5190_MST_PURC_ACT_D_S01", dbc, dbc_bldr, bindL);
		// チェックが複数回呼ばれる場合の対応
		_purcActDCache.addAll(dbc);
		_idxCachePurcDAct = _purcActDCache.createIndex(MST_PURC_ACT_D_R.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_no);
		return dbc;
	}

	protected void _initPurcActIoCache(MCList<MST_PURC_ACT_D_R> purcActDC) {
		
		if(null == _purcActIoCache){
			_purcActIoCache = MCList.create(MST_PURC_ACT_IO_R.class);	
		}
		MCList<MST_PURC_ACT_IO_R> dbc = MCList.create(MST_PURC_ACT_IO_R.class);
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t); 
		dbc_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
		dbc_bldr.addWhereWithAnd(t.purc_act_d_seq.eq(bind("purc_act_d_seq")));
		dbSelect("MSBDL5190_MST_PURC_ACT_IO_S01", dbc, dbc_bldr, purcActDC);
		// チェックが複数回呼ばれる場合の対応
		_purcActIoCache.addAll(dbc);
		_idxCachePurcActIo = _purcActIoCache.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);
		
	}

	protected void _initItmUnitCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
				dtlL, Vmi_Chk01_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_sub1, Vmi_Chk01_DtlR.$itm_sub2,
				Vmi_Chk01_DtlR.$itm_sub3, Vmi_Chk01_DtlR.$trd_unit_cd);
	}
	/**
	 * キャッシュ作成（補完結果）
	 * @param dtlL
	 */
	protected void _initMyCache(MCList<Vmi_Chk01_DtlR> dtlL) {
		_myCache = dtlL.clone();
		_idxMyCache = _myCache.createIndex(Vmi_Chk01_DtlR.$peg_no);
	}
	//----------------------------------
	/**
	 * キャッシュ取得（取引）
	 * 
	 * @return
	 */
	protected static MAM_TRD_R getTrdCache() {
		return object(CLAZZ)._trdCache;
	}
	/**
	 * キャッシュ取得（為替レート）
	 * @param dtlR
	 * @return
	 */
	protected static MAM_CUR_XRATE_R getXrateCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._xrateCache.get(dtlR.ac_dt(), getBpCache(dtlR).cur_cd(), getCo().base_cur_cd(), getCo().purc_xrate_cd());
	}
	/**
	 * キャッシュ取得（納税為替レート）
	 * @param dtlR
	 * @return
	 */
	protected static MAM_CUR_XRATE_R getPtaxXrateCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._ptaxXrateCache.get(dtlR.ac_dt(), getBpCache(dtlR).cur_cd(), getCo().ptax_cur_cd(), getCo().purc_xrate_cd());
	}
	/**
	 * キャッシュ取得（取引先）
	 * @param dtlR
	 * @return
	 */
	protected static MAM_BP_R getBpCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._bpCache.getFirst(object(CLAZZ)._idxCacheBp, dtlR.stk_bp_cd());
	}
	/**
	 * キャッシュ取得（品目）
	 * @param dtlR
	 * @return
	 */
	protected static MAM_ITM_R getItmCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._itmCache.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
	}

	protected static MAM_LOC_R getLocCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._locCache.get(dtlR.loc_cd());
	}
	
	protected static MAVM_ITM_UNIT_R getItmUnitCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._itmUnitCache.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
	}
	/**
	 * キャッシュ取得（部門）
	 * @return
	 */
	protected static MAM_DPT_R getDptCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._dptCache.get(dtlR.ac_dt(), dtlR.vmi_purc_dpt_cd());
	}
	/**
	 * キャッシュ取得（税）
	 * @param dtlR
	 * @return
	 */
	protected static MAM_TAX_R getTaxCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._taxCache.get(dtlR.tax_cd());
	}
	/**
	 * キャッシュ取得(仕入実績ヘッダ)
	 * @param dtlR
	 * @return
	 */
	protected MST_PURC_ACT_R getPurcActCache(Vmi_Chk01_DtlR dtlR) {
		MST_PURC_ACT_D_R key = getPurcActDCache(dtlR);
		return object(CLAZZ)._purcActCache.getFirst(object(CLAZZ)._idxCachePurcAct, key.purc_act_no(), key.purc_act_seq());
	}
	/**
	 * キャッシュ取得(仕入実績明細)
	 * @return
	 */
	protected MST_PURC_ACT_D_R getPurcActDCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._purcActDCache.getFirst(object(CLAZZ)._idxCachePurcDAct, dtlR.purc_src_typ(), dtlR.purc_src_no());
	}

	protected MST_PURC_ACT_IO_R getPurcActIoCache(Vmi_Chk01_DtlR dtlR) {
		MST_PURC_ACT_D_R key = getPurcActDCache(dtlR);
		return object(CLAZZ)._purcActIoCache.getFirst(object(CLAZZ)._idxCachePurcActIo, key.purc_act_d_no(), key.purc_act_d_seq());
	}
	/**
	 * キャッシュ取得（補完結果）
	 * @param dtlR
	 * @return
	 */
	protected static Vmi_Chk01_DtlR getMyCache(Vmi_Chk01_DtlR dtlR) {
		return object(CLAZZ)._myCache.getFirst(object(CLAZZ)._idxMyCache, dtlR.peg_no());
	}
	//----------------------------------
	
	/**
	 * Vmi_Chk01オペレーション.<p>
	 *
	 * ＶＭＩ計上サービス更新前チェックを行う。<br>
	 */
	public class Vmi_Chk01 extends MSBDL_VmiService_MC_A.Vmi_Chk01 {
		
		// Ins、Updのチェック対象
		MCList<Vmi_Chk01_DtlR> _chkTgt  = MCList.create(Vmi_Chk01_DtlR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initTgt();
			// 仕入実績キャッシュおよびロック
			doCachAndLock();
			// マスタキャッシュ
			doCacheMstr();
			// 上り電文をマスタで補完する
			cmplUp();
			callPurcChk03();
			// 下り電文設定
			setDown();
		}

		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を実行する
		 */
		protected void callPurcChk03() {

			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();

			addAll(ope.up0(), up0(), createMapPurcChk03Hdr());
			addAll(ope.up1(), up0(), createMapPurcChk03Dtl());
			addAll(ope.up2(), up0(), createMapPurcChk03Io());

			ope.exec();

			copyErrFlg(up0(), ope.down1());
			copyErrFlg(up0(), ope.down1());
			copyErrFlg(up0(), ope.down2());

		}
		
		protected void initTgt() {
			_chkTgt = getInsUpdList(up0());
		}
		
		/**
		 * キャッシュをリクエストスコープに保存します
		 * @param dtlL
		 */
		protected void doCacheMstr() {
			 
			// 取引マスタ
			initTrdCache(_chkTgt);
			// 取引先
			initBpCache(_chkTgt);
			// 為替レート
			initXrateCache(_chkTgt);
			// 納税為替レート
			initPtaxXrateCache(_chkTgt);
			// 品目
			initItmCache(_chkTgt);
			// 品目単位
			initItmUnitCache(_chkTgt);
			// 部門
			initDptCache();
			// 業務理由
			initRsnCache();
			// 場所
			initLocCache(_chkTgt);
		}
		
		/**
		 * 仕入実績ヘッダをロックする
		 */
		protected void doCachAndLock() {
			// ロック対象の取得
			MCList<Vmi_Chk01_DtlR> bindL = up0().createInstance();
			bindL.addAll(up0().subList(Vmi_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			bindL.addAll(up0().subList(Vmi_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			bindL.groupBy(Vmi_Chk01_DtlR.$purc_src_typ, Vmi_Chk01_DtlR.$purc_src_no);
			// 仕入実績明細の取得
			MCList<MST_PURC_ACT_D_R> purcActDC = initPurcActDCache(bindL);
			// 仕入実績ヘッダのロック
			initPurcActCache(purcActDC);
			initPurcActIoCache(purcActDC);
		}
		
		/**
		 * 上り電文をマスタで補完する
		 */
		protected void cmplUp() {
			MCMessageList msgL = new MCMessageList();
			// 取引マスタチェック
			msgL.addAll(checkTrd());
			
			// 税マスタチェック
			msgL.addAll(checkTax());
			
			// 為替レートマスタチェック
			msgL.addAll(checkXrate());
			
			// ＶＭＩ購買部門チェック
			msgL.addAll(checkVmiDpt());
			
			// 単価チェック
			msgL.addAll(checkUpri());
			
			// 業務理由チェック
			msgL.addAll(checkRsn());
			
			// 補完結果をキャッシュ
			initMyCache(up0());
			
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 税マスタの補完・存在チェックを行う
		 * @return
		 */
		protected MCMessageList checkTax() {
			MCMessageList msgL = new MCMessageList();
			// 税ＣＤの補完処理
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Vmi_Chk01_DtlR.$tax_cd,
					_chkTgt,
					Vmi_Chk01_DtlR.$itm_cd,
					Vmi_Chk01_DtlR.$itm_sub1,
					Vmi_Chk01_DtlR.$itm_sub2,
					Vmi_Chk01_DtlR.$itm_sub3,
					Vmi_Chk01_DtlR.$stk_bp_cd,
					Vmi_Chk01_DtlR.$ac_dt);
			
			// 税マスタ取得
			initTaxCache(_chkTgt);
			
			// チェック処理
			for (Vmi_Chk01_DtlR r : _chkTgt) {
				// 税ＣＤチェック
				if (isNull(r.tax_cd())) {
					msgL.add(new MCMessage(r, Vmi_Chk01_DtlR.$tax_cd,
							MSBDL0008, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toYMDString(r.ac_dt())));
					r.err_flg(true);
				}
				else if (isNull(getTaxCache(r)) || getTaxCache(r).isEmpty()) {
					msgL.add(new MCMessage(r, Vmi_Chk01_DtlR.$tax_cd, MSBDL0198, r.tax_cd(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}

		protected MCMessageList checkRsn() {
			MCMessageList msgL = new MCMessageList();
			for (Vmi_Chk01_DtlR r : _chkTgt) {
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(getItmCache(r).asset_mng_typ()) && _rsnCache.isEmpty()) {
					msgL.add(new MCMessage(r, Vmi_Chk01_DtlR.$itm_cd,
							MSBDL0132, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}

		protected MCMessageList checkVmiDpt() {
			MCMessageList msgL = new MCMessageList();
			for (Vmi_Chk01_DtlR r : _chkTgt) {
				r.vmi_purc_dpt_cd(getBpCache(r).getStringNE("add_vmi_purc_dpt_cd"));
				if (getDptCache(r).isEmpty()) {
					msgL.add(new MCMessage(r, Vmi_Chk01_DtlR.$stk_bp_cd,
							MSBDL0133, r.stk_bp_cd(), getBpCache(r).getStringNE("add_vmi_purc_dpt_cd"), toYMDString(r.ac_dt()), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected MCMessageList checkTrd() {
			MCMessageList msgL = new MCMessageList();
			for (Vmi_Chk01_DtlR r : _chkTgt) {
				if (isNull(getTrdCache()) || getTrdCache().isEmpty()) {
					msgL.add(new MCMessage(r, null, MSBDL0142, MAC_TRD_PTN_TYP.PURC_VMI.value(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 為替レートの補完・存在チェックを行う
		 * @return
		 */
		protected MCMessageList checkXrate() {
			MCMessageList msgL = new MCMessageList();
			// 為替レートチェック
			for (Vmi_Chk01_DtlR r : _chkTgt) {
				// 為替レートチェック
				if (!isSame(getBpCache(r).cur_cd(), getCo().base_cur_cd())) {
					if (isNull(getXrateCache(r).xrate())) {
						msgL.add(new MCMessage(r, null, MSBDL0009, getBpCache(r).cur_cd(), getCo().base_cur_cd(), toYMDString(r.ac_dt())));
						r.err_flg(true);
					}
				}
				// 納税為替レートチェック
				if (isNull(getCo().ptax_cur_cd())) {
					continue;
				}
				if (!isSame(getBpCache(r).cur_cd(), getCo().ptax_cur_cd())) {
					if (isNull(getPtaxXrateCache(r).xrate())) {
						msgL.add(new MCMessage(r, null, MSBDL0009, getBpCache(r).cur_cd(), getCo().ptax_cur_cd(), toYMDString(r.ac_dt())));
						r.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 単価の存在チェックを行う
		 * @return
		 */
		protected MCMessageList checkUpri() {
			MCMessageList msgL = new MCMessageList();
			// 購買単価取得サービスの呼び出し
			// サービスコール
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), getChkList(_chkTgt), createMap_PurcUtil_Srch02_DtlR_Vmi_Chk01_DtlR());
			if (purcUtilSrch02.up0().isEmpty()) {
				return msgL;
			}
			purcUtilSrch02.exec();
			String[] destCols = {Vmi_Chk01_DtlR.$trd_cur_upri, Vmi_Chk01_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(up0(), destCols, purcUtilSrch02.down0(), srcCols);

			for (Vmi_Chk01_DtlR r : _chkTgt) {
				if (isNull(r.trd_cur_upri())) {
					msgL.add(new MCMessage(r, Vmi_Chk01_DtlR.$trd_cur_upri,
							MSBDL0010, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.stk_bp_cd(),
							MAC_STR.NULL_VAL.value(), r.trd_unit_cd(), getBpCache(r).cur_cd(), getLocCache(r).wg_cd(), toYMDString(r.ac_dt())));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	
	protected MCList<Vmi_Chk01_DtlR> getInsUpdList(MCList<Vmi_Chk01_DtlR> lst) {
		MCList<Vmi_Chk01_DtlR> retL = MCList.create(Vmi_Chk01_DtlR.class);
		for (Vmi_Chk01_DtlR r : lst) {
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}
		
	
	
	/**
	 * Vmi_Upd01オペレーション.<p>
	 *
	 * ＶＭＩ計上処理を行う。<br>
	 */
	public class Vmi_Upd01 extends MSBDL_VmiService_MC_A.Vmi_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 補完処理
			cmplUp();
			// 仕入実績登録処理の呼び出し
			callPurcActRegUpdSrv();
		}

		/**
		 * 上り電文をキャッシュで補完する
		 */
		protected void cmplUp() {
			
			for (Vmi_Chk01_DtlR r : getInsUpdList(up0())) {
				cmplTrd(r);
				cmplBp(r);
				cmplItm(r);
				cmplXrate(r);
				cmplPtaxXrate(r);
				cmplDpt(r);
				cmplPurcUpri(r);
				cmplTax(r);
				cmplLoc(r);
			}
		}
		/**
		 * 補完処理（取引）
		 * @param dtlR
		 */
		protected void cmplTrd(Vmi_Chk01_DtlR dtlR) {
			// 取引情報の補完
			dtlR.trd_cd(getTrdCache().trd_cd());
			dtlR.trd_ptn_typ(getTrdCache().trd_ptn_typ());
		}
		/**
		 * 補完処理（場所）
		 * @param dtlR
		 */
		protected void cmplLoc(Vmi_Chk01_DtlR dtlR) {
			dtlR.loc_wg_cd(getLocCache(dtlR).wg_cd());
		}
		/**
		 * 補完処理（取引先）
		 * @param dtlR
		 */
		protected void cmplBp(Vmi_Chk01_DtlR dtlR) {
			// キャッシュから取引先情報を取得
			MAM_BP_R bp = getBpCache(dtlR);
			// 補完処理
			dtlR.asppl_cd(bp.asppl_cd());
			dtlR.bsppl_cd(bp.bsppl_cd());
			dtlR.psppl_cd(bp.psppl_cd());
			dtlR.ap_cred_cd(bp.ap_cred_cd());
			dtlR.cur_cd(bp.cur_cd());
			dtlR.vmi_purc_dpt_cd(bp.getStringNE("add_vmi_purc_dpt_cd"));
			dtlR.ap_dpt_cd(bp.getStringNE("add_ap_dpt_cd"));
		}
		
		/**
		 * 補完処理（品目）
		 * @param dtlR
		 */
		protected void cmplItm(Vmi_Chk01_DtlR dtlR) {
			// キャッシュから品目情報を取得
			MAM_ITM_R itm = getItmCache(dtlR);
			MAM_BP_R bp = getBpCache(dtlR);
			
			// 補完処理
			dtlR.pay_crryovr_times(isNull(itm.pay_crryovr_times()) ? bp.pay_crryovr_times() : itm.pay_crryovr_times());
			dtlR.stk_mng_typ(itm.stk_mng_typ());
		}
		
		
		/**
		 * 補完処理（為替レート）
		 * @param dtlR
		 */
		protected void cmplXrate(Vmi_Chk01_DtlR dtlR) {
			if (isSame(getBpCache(dtlR).cur_cd(), getCo().base_cur_cd())) {
				dtlR.xrate(1);
			}
			else {
				MAM_CUR_XRATE_R xrate = getXrateCache(dtlR);
				dtlR.xrate(xrate.xrate());
			}
		}
		
		protected void cmplPtaxXrate(Vmi_Chk01_DtlR dtlR) {
			if (isNull(getCo().ptax_cur_cd())) {
				return;
			}
			
			if (isSame(getBpCache(dtlR).cur_cd(), getCo().ptax_cur_cd())) {
				dtlR.ptax_xrate(1);
			}
			else {
				MAM_CUR_XRATE_R xrate = getPtaxXrateCache(dtlR);
				dtlR.ptax_xrate(xrate.xrate());
			}
		}
		
		/**
		 * 補完処理（部門）
		 * @param dtlR
		 */
		protected void cmplDpt(Vmi_Chk01_DtlR dtlR) {
			// キャッシュから部門情報を取得
			MAM_DPT_R dpt = getDptCache(dtlR);
			
			// 補完処理
			dtlR.wg_cd(dpt.wg_cd());
		}
		
		/**
		 * 補完（自サービス補完結果）
		 */
		protected void cmplPurcUpri(Vmi_Chk01_DtlR dtlR) {
			Vmi_Chk01_DtlR src = getMyCache(dtlR);
			dtlR.tax_cd(src.tax_cd());
		}
		
		/**
		 * 補完処理（税）
		 * @param dtlR
		 */
		protected void cmplTax(Vmi_Chk01_DtlR dtlR) {
			// キャッシュから税情報を取得
			MAM_TAX_R tax = getTaxCache(dtlR);
			
			// 補完処理
			dtlR.inc_tax_flg(tax.inc_tax_flg());
			dtlR.wtax_rate(tax.getNumberNE("add_wtax_rate"));
		}
		
		/**
		 * 仕入実績登録処理を実行する
		 */
		protected void callPurcActRegUpdSrv() {
			MCList<Vmi_Chk01_DtlR> insDtlList = up0().subList(Vmi_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<Vmi_Chk01_DtlR> updDtlList = up0().subList(Vmi_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			MCList<Vmi_Chk01_DtlR> delDtlList = up0().subList(Vmi_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			
			// 登録処理
			if (insDtlList.size() > 0) {
				execIns(insDtlList);
			}

			// 更新処理
			if (updDtlList.size() > 0) {
				execUpd(updDtlList);
			}

			// 削除処理
			if (delDtlList.size() > 0) {
				execDel(delDtlList);
			}
		}
		
		protected void execIns(MCList<Vmi_Chk01_DtlR> dtlL) {
			MSBDL_PurcActRegService.Purc_Ins01 ope = MSBDL_PurcActRegService.crtPurc_Ins01();
			ope.up0().io_make_flg(false);
			ope.up0().amt_calc_flg(true);
			setAll(ope.up1(), dtlL, createMapForPurcActInsHdr());
			setAll(ope.up2(), dtlL, createMapForPurcActInsDtl());
			setAll(ope.up3(), dtlL, createMapForPurcActInsIo());
			ope.exec();
		}
		
		protected void execUpd(MCList<Vmi_Chk01_DtlR> dtlL) {
			MSBDL_PurcActRegService.Purc_Upd01 ope = MSBDL_PurcActRegService.crtPurc_Upd01();
			ope.up0().io_make_flg(false);
			ope.up0().amt_calc_flg(true);
			setAll(ope.up1(), dtlL, createMapForPurcActUpdHdr());
			setAll(ope.up2(), dtlL, createMapForPurcActUpdDtl());
			setAll(ope.up3(), dtlL, createMapForPurcActUpdIo());
			ope.exec();
		}

		protected void execDel(MCList<Vmi_Chk01_DtlR> dtlL) {
			MSBDL_PurcActRegService.Purc_Del01 ope = MSBDL_PurcActRegService.crtPurc_Del01();
			ope.up0().io_make_flg(false);
			compPegNo(dtlL);
			setAll(ope.up1(), dtlL, createMapForPurcActDelHdr());
			setAll(ope.up2(), dtlL, createMapForPurcActDelDtl());
			setAll(ope.up3(), dtlL, createMapForPurcActDelIo());
			ope.exec();
		}
		protected void compPegNo(MCList<Vmi_Chk01_DtlR> dtlL) {
			// dtlLの件数とpeg_noでグループ化した件数が不一致の場合、設定しなおす
			if (dtlL.size() != dtlL.groupBy(Purc_Ins01_HdrR.$peg_no).size()) {
				setPegNo(dtlL);
			}
		};
		
		/** 仕入実績ＳＶ（ヘッダ） */
		protected Map_Purc_Ins01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR,Vmi_Chk01_DtlR> createMapForPurcActInsHdr() {
			return new Map_Purc_Ins01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR, Vmi_Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_HdrR_Vmi_Chk01_DtlR<D extends Purc_Ins01_HdrR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, Vmi_Chk01_DtlR.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, Vmi_Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, Vmi_Chk01_DtlR.$vmi_purc_dpt_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, Vmi_Chk01_DtlR.$wg_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, Vmi_Chk01_DtlR.$cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, Vmi_Chk01_DtlR.$purc_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, Vmi_Chk01_DtlR.$ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, Vmi_Chk01_DtlR.$ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate, Vmi_Chk01_DtlR.$xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, Vmi_Chk01_DtlR.$ptax_xrate);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber("peg_no"));
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
				
			}
		}
		/** 仕入実績ＳＶ（明細） */
		protected Map_Purc_Ins01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR,Vmi_Chk01_DtlR> createMapForPurcActInsDtl() {
			return new Map_Purc_Ins01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR, Vmi_Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_DtlR_Vmi_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, Vmi_Chk01_DtlR.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, Vmi_Chk01_DtlR.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, Vmi_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, Vmi_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, Vmi_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, Vmi_Chk01_DtlR.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, Vmi_Chk01_DtlR.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, Vmi_Chk01_DtlR.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, Vmi_Chk01_DtlR.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, Vmi_Chk01_DtlR.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, Vmi_Chk01_DtlR.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, Vmi_Chk01_DtlR.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, Vmi_Chk01_DtlR.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, Vmi_Chk01_DtlR.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, Vmi_Chk01_DtlR.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, Vmi_Chk01_DtlR.$loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
				dest.purc_id_typ(MAC_PURC_ID_TYP.VMI.value());
				dest.sundry_itm_flg(getItmCache(src).sundry_itm_flg());
				dest.abort_flg(false);
				dest.re_arr_flg(false);
				dest.ncv_flg(false);
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.asset_mng_typ(getItmCache(src).asset_mng_typ());
				if (MAC_ASSET_MNG_TYP.isMNG(dest.asset_mng_typ())) {
					dest.xpns_po_flg(false);
				}
				else if (MAC_ASSET_MNG_TYP.isNOT_MNG(dest.asset_mng_typ())) {
					dest.xpns_po_flg(true);
				}
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
				dest.disp_seq(MCNumber.ONE);
				dest.edi_flg(false);
				dest.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
				dest.sync_flg(false);

			}
			
		}
		/** 仕入実績ＳＶ（受払） */
		protected Map_Purc_Ins01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR,Vmi_Chk01_DtlR> createMapForPurcActInsIo() {
			return new Map_Purc_Ins01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR, Vmi_Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_IoR_Vmi_Chk01_DtlR<D extends Purc_Ins01_IoR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Vmi_Chk01_DtlR.$loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dtl_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());

				MAVM_ITM_UNIT_R itmUnit = getItmUnitCache(src);
				if (!isNull(itmUnit)) {
					dest.pack_unit_cd(itmUnit.pack_flg() ? src.trd_unit_cd() : src.base_unit_cd());
					dest.pack_unit_qty(itmUnit.pack_flg() ? src.trd_unit_qty() : src.base_unit_qty());
				}
			}

		}
		
		protected Map_Purc_Upd01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR,Vmi_Chk01_DtlR> createMapForPurcActUpdHdr() {
			return new Map_Purc_Upd01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Upd01_HdrR_Vmi_Chk01_DtlR<D extends Purc_Ins01_HdrR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, Vmi_Chk01_DtlR.$trd_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, Vmi_Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, Vmi_Chk01_DtlR.$vmi_purc_dpt_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, Vmi_Chk01_DtlR.$wg_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, Vmi_Chk01_DtlR.$cur_cd);
				addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, Vmi_Chk01_DtlR.$purc_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, Vmi_Chk01_DtlR.$ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Vmi_Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, Vmi_Chk01_DtlR.$ac_dt);
				addColumnPathMap(Purc_Ins01_HdrR.$xrate, Vmi_Chk01_DtlR.$xrate);
				addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, Vmi_Chk01_DtlR.$ptax_xrate);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber("peg_no"));
				dest.purc_act_no(getPurcActCache(src).purc_act_no());
				dest.purc_act_seq(getPurcActCache(src).purc_act_seq());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
				
			}
		}

		protected Map_Purc_Upd01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR,Vmi_Chk01_DtlR> createMapForPurcActUpdDtl() {
			return new Map_Purc_Upd01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Upd01_DtlR_Vmi_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_typ, Vmi_Chk01_DtlR.$purc_src_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$purc_src_no, Vmi_Chk01_DtlR.$purc_src_no);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, Vmi_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, Vmi_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, Vmi_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, Vmi_Chk01_DtlR.$itm_nm);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, Vmi_Chk01_DtlR.$interim_flg);
				addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, Vmi_Chk01_DtlR.$trd_cur_upri);
				addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, Vmi_Chk01_DtlR.$tax_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, Vmi_Chk01_DtlR.$ap_dpt_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, Vmi_Chk01_DtlR.$pay_crryovr_times);
				addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$sno1, Vmi_Chk01_DtlR.$sno1);
				addColumnPathMap(Purc_Ins01_DtlR.$sno2, Vmi_Chk01_DtlR.$sno2);
				addColumnPathMap(Purc_Ins01_DtlR.$sno3, Vmi_Chk01_DtlR.$sno3);
				addColumnPathMap(Purc_Ins01_DtlR.$sno4, Vmi_Chk01_DtlR.$sno4);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_DtlR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
				addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_DtlR.$in_to_loc_wg_cd, Vmi_Chk01_DtlR.$loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.purc_act_d_no(getPurcActDCache(src).purc_act_d_no());
				dest.purc_act_d_seq(getPurcActDCache(src).purc_act_d_seq());
				dest.purc_act_no(getPurcActDCache(src).purc_act_no());
				dest.purc_act_seq(getPurcActDCache(src).purc_act_seq());
				dest.sundry_itm_flg(getPurcActDCache(src).sundry_itm_flg());
				dest.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
				dest.purc_id_typ(MAC_PURC_ID_TYP.VMI.value());
				dest.sundry_itm_flg(getItmCache(src).sundry_itm_flg());
				dest.abort_flg(false);
				dest.re_arr_flg(false);
				dest.ncv_flg(false);
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.asset_mng_typ(getItmCache(src).asset_mng_typ());
				if (MAC_ASSET_MNG_TYP.isMNG(dest.asset_mng_typ())) {
					dest.xpns_po_flg(false);
				}
				else if (MAC_ASSET_MNG_TYP.isNOT_MNG(dest.asset_mng_typ())) {
					dest.xpns_po_flg(true);
				}
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
				dest.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
				dest.disp_seq(MCNumber.ONE);
				dest.edi_flg(false);
				dest.sync_flg(false);
				
			}
			
		}
		
		protected Map_Purc_Upd01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR,Vmi_Chk01_DtlR> createMapForPurcActUpdIo() {
			return new Map_Purc_Upd01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Upd01_IoR_Vmi_Chk01_DtlR<D extends Purc_Ins01_IoR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Ins01_IoR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Ins01_IoR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
				addColumnPathMap(Purc_Ins01_IoR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
				addColumnPathMap(Purc_Ins01_IoR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, Vmi_Chk01_DtlR.$loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dtl_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.purc_act_d_no(getPurcActDCache(src).purc_act_d_no());
				dest.purc_act_d_seq(getPurcActDCache(src).purc_act_d_seq());
				dest.purc_act_io_no(getPurcActIoCache(src).purc_act_io_no());
				dest.purc_act_io_seq(getPurcActIoCache(src).purc_act_io_seq());
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
				dest.pack_unit_cd(getPurcActIoCache(src).pack_unit_cd());
				dest.pack_unit_qty(isSame(getPurcActIoCache(src).pack_unit_cd(), src.trd_unit_cd()) ? src.trd_unit_qty() : src.base_unit_qty());
			}
			
		}
		
		protected Map_Purc_Del01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR,Vmi_Chk01_DtlR> createMapForPurcActDelHdr() {
			return new Map_Purc_Del01_HdrR_Vmi_Chk01_DtlR<Purc_Ins01_HdrR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Del01_HdrR_Vmi_Chk01_DtlR<D extends Purc_Ins01_HdrR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Vmi_Chk01_DtlR.$can_ac_dt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber("peg_no"));
				dest.purc_act_no(getPurcActCache(src).purc_act_no());
				dest.purc_act_seq(getPurcActCache(src).purc_act_seq());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
			}
		}
		
		protected Map_Purc_Del01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR,Vmi_Chk01_DtlR> createMapForPurcActDelDtl() {
			return new Map_Purc_Del01_DtlR_Vmi_Chk01_DtlR<Purc_Ins01_DtlR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Del01_DtlR_Vmi_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.purc_act_d_no(getPurcActDCache(src).purc_act_d_no());
				dest.purc_act_d_seq(getPurcActDCache(src).purc_act_d_seq());
			}
		}
		
		protected Map_Purc_Del01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR,Vmi_Chk01_DtlR> createMapForPurcActDelIo() {
			return new Map_Purc_Del01_IoR_Vmi_Chk01_DtlR<Purc_Ins01_IoR, Vmi_Chk01_DtlR>();
		}

		public class Map_Purc_Del01_IoR_Vmi_Chk01_DtlR<D extends Purc_Ins01_IoR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dtl_peg_no(src.peg_no());
				dest.peg_no(src.peg_no());
				dest.purc_act_io_no(getPurcActIoCache(src).purc_act_io_no());
				dest.purc_act_io_seq(getPurcActIoCache(src).purc_act_io_seq());
			}
			
		}
		
		
	}
	protected Map_PurcUtil_Srch02_DtlR_Vmi_Chk01_DtlR<PurcUtil_Srch02_DtlR,Vmi_Chk01_DtlR> createMap_PurcUtil_Srch02_DtlR_Vmi_Chk01_DtlR() {
		return new Map_PurcUtil_Srch02_DtlR_Vmi_Chk01_DtlR<PurcUtil_Srch02_DtlR, Vmi_Chk01_DtlR>();
	}

	public class Map_PurcUtil_Srch02_DtlR_Vmi_Chk01_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Vmi_Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Vmi_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Vmi_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Vmi_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, MAC_STR.NULL_VAL.value());
			addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, Vmi_Chk01_DtlR.$cur_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Vmi_Chk01_DtlR.$wg_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Vmi_Chk01_DtlR.$ac_dt);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Vmi_Chk01_DtlR.$tax_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Vmi_Chk01_DtlR.$sno1);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Vmi_Chk01_DtlR.$sno2);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Vmi_Chk01_DtlR.$sno3);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Vmi_Chk01_DtlR.$sno4);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.grp_no(dest.peg_no().toString());
			dest.cur_cd(getBpCache(src).cur_cd());
			dest.wg_cd(getLocCache(src).wg_cd());
			dest.dlv_cd(MAC_STR.NULL_VAL.value());
		}
	}

	protected Map_Purc_Chk03_HdrR_Vmi_Chk01_DtlR<Purc_Chk03_HdrR, Vmi_Chk01_DtlR> createMapPurcChk03Hdr() {
		return new Map_Purc_Chk03_HdrR_Vmi_Chk01_DtlR<Purc_Chk03_HdrR, Vmi_Chk01_DtlR>();
	}

	public class Map_Purc_Chk03_HdrR_Vmi_Chk01_DtlR<D extends Purc_Chk03_HdrR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D, S> {

		@Override
		protected void valueCopy(D dest, S src) {
			dest.io_make_flg(false);
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.purc_act_no(getPurcActCache(src).purc_act_no());
				dest.purc_act_seq(getPurcActCache(src).purc_act_seq());
			}
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC_VMI.value());
			if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				MAM_BP_R bp = getBpCache(src);
				dest.trd_cur_cd(bp.cur_cd());
				dest.bsppl_cd(bp.bsppl_cd());
				dest.psppl_cd(bp.psppl_cd());
			}
			super.valueCopy(dest, src);
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_HdrR.$peg_no, Vmi_Chk01_DtlR.$peg_no);

			addColumnPathMap(Purc_Chk03_HdrR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);

			addColumnPathMap(Purc_Chk03_HdrR.$err_flg, Vmi_Chk01_DtlR.$err_flg);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, Vmi_Chk01_DtlR.$trd_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dpt_cd, Vmi_Chk01_DtlR.$vmi_purc_dpt_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$wg_cd, Vmi_Chk01_DtlR.$wg_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, Vmi_Chk01_DtlR.$cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, Vmi_Chk01_DtlR.$purc_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, Vmi_Chk01_DtlR.$ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, Vmi_Chk01_DtlR.$can_ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$pay_basis_dt, Vmi_Chk01_DtlR.$ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$xrate, Vmi_Chk01_DtlR.$xrate);

		}
	}
	
	
	protected Map_Purc_Chk03_DtlR_Vmi_Chk01_DtlR<Purc_Chk03_DtlR,Vmi_Chk01_DtlR> createMapPurcChk03Dtl() {
		return new Map_Purc_Chk03_DtlR_Vmi_Chk01_DtlR<Purc_Chk03_DtlR, Vmi_Chk01_DtlR>();
	}

	public class Map_Purc_Chk03_DtlR_Vmi_Chk01_DtlR<D extends Purc_Chk03_DtlR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.peg_no());
			dest.peg_no(src.peg_no());
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.purc_act_d_no(getPurcActDCache(src).purc_act_d_no());
				dest.purc_act_d_seq(getPurcActDCache(src).purc_act_d_seq());
				dest.purc_act_no(getPurcActDCache(src).purc_act_no());
				dest.purc_act_seq(getPurcActDCache(src).purc_act_seq());
				dest.sundry_itm_flg(getPurcActDCache(src).sundry_itm_flg());
			}
			else {
				dest.sundry_itm_flg(getItmCache(src).sundry_itm_flg());
			}
			dest.abort_flg(false);
			dest.re_arr_flg(false);
			dest.ncv_flg(false);
			dest.maker_cd(MAC_STR.NULL_VAL.value());
			dest.asset_mng_typ(getItmCache(src).asset_mng_typ());
			if (MAC_ASSET_MNG_TYP.isMNG(dest.asset_mng_typ())) {
				dest.xpns_po_flg(false);
			}
			else if (MAC_ASSET_MNG_TYP.isNOT_MNG(dest.asset_mng_typ())) {
				dest.xpns_po_flg(true);
			}
			dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
			dest.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
			dest.disp_seq(MCNumber.ONE);
			dest.edi_flg(false);
			dest.sync_flg(false);
			if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				MAM_ITM_R itm = getItmCache(src);
				MAM_BP_R bp = getBpCache(src);
				dest.pay_crryovr_times(isNull(itm.pay_crryovr_times()) ? bp.pay_crryovr_times() : itm.pay_crryovr_times());
			}
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_DtlR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_typ, Vmi_Chk01_DtlR.$purc_src_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_src_no, Vmi_Chk01_DtlR.$purc_src_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, Vmi_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, Vmi_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, Vmi_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, Vmi_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, Vmi_Chk01_DtlR.$itm_nm);
			
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, Vmi_Chk01_DtlR.$interim_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, Vmi_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, Vmi_Chk01_DtlR.$tax_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, Vmi_Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, Vmi_Chk01_DtlR.$pay_crryovr_times);
			
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sno1, Vmi_Chk01_DtlR.$sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$sno2, Vmi_Chk01_DtlR.$sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$sno3, Vmi_Chk01_DtlR.$sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$sno4, Vmi_Chk01_DtlR.$sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
		}
		
	}
	
	/** 仕入実績ＳＶ（受払） */
	protected Map_Purc_Chk03_IoR_Vmi_Chk01_DtlR<Purc_Chk03_IoR,Vmi_Chk01_DtlR> createMapPurcChk03Io() {
		return new Map_Purc_Chk03_IoR_Vmi_Chk01_DtlR<Purc_Chk03_IoR, Vmi_Chk01_DtlR>();
	}
	public class Map_Purc_Chk03_IoR_Vmi_Chk01_DtlR<D extends Purc_Chk03_IoR, S extends Vmi_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, Vmi_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Vmi_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Vmi_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Vmi_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Vmi_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Vmi_Chk01_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Vmi_Chk01_DtlR.$loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Vmi_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$lot_no, Vmi_Chk01_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Vmi_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Vmi_Chk01_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Vmi_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Vmi_Chk01_DtlR.$stk_bp_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dtl_peg_no(src.peg_no());
			dest.peg_no(src.peg_no());
			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.purc_act_d_no(getPurcActDCache(src).purc_act_d_no());
				dest.purc_act_d_seq(getPurcActDCache(src).purc_act_d_seq());
				dest.purc_act_io_no(getPurcActIoCache(src).purc_act_io_no());
				dest.purc_act_io_seq(getPurcActIoCache(src).purc_act_io_seq());
			}
			dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());

		}

	}

	//FMCB CUSTOM END
}