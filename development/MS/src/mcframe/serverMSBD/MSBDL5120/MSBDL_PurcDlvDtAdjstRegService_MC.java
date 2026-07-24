package mcframe.serverMSBD.MSBDL5120;

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
import mcframe.serverMSBD.MSBDL5120.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.commonCore.container.MCRow.Status;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR;
import mcframe.serverMSLA.MSLAL5040.MSLAL_DlvInstSendIfService;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDlvDtAdjstRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDlvDtAdjstRegService_MC extends MSBDL_PurcDlvDtAdjstRegService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBDL_PurcDlvDtAdjstRegService> CLAZZ = MSBDL_PurcDlvDtAdjstRegService.class;

	/** 入荷予定キャッシュ */
	protected MCList<MST_ARR_SCHD_R> _arrSchdCache = null;
	/** 入荷予定キャッシュ用インデックス (発注明細NOで検索時に使用) */
	protected MCIndexKey _arrSchdCacheIndexByPoDNo = null;
	/** 入荷予定キャッシュ用インデックス (納入指示明細NOで検索時に使用) */
	protected MCIndexKey _arrSchdCacheIndexByDlvInstDNo = null;
	/** 入荷予定キャッシュ用インデックス (納期回答受領NOで検索時に使用) */
	protected MCIndexKey _arrSchdCacheIndexByPrmsNo = null;
	/** 入荷予定キャッシュ用インデックス (納期回答受領明細NOで検索時に使用) */
	protected MCIndexKey _arrSchdCacheIndexByPrmsDNo = null;
	/**
	 * 入荷予定キャッシュを作成する
	 * @param hdrL 発注明細NOが含まれる上り電文リスト
	 */
	protected static void initArrSchdCache(MCList<?> hdrL) {
		object(CLAZZ)._initArrSchdCache(hdrL);
	}
	protected void _initArrSchdCache(MCList<?> hdrL) {
		_arrSchdCache = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder arrSchdCache_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		MST_PURC_SCHD_R t5 = MST_PURC_SCHD_R.create("T5");
		MST_RCPT_IV_D_R t6 = MST_RCPT_IV_D_R.create("T6");
		MST_DLV_INST_D_R t3 = MST_DLV_INST_D_R.create("T3");
		MST_PRMS_RCPT_D_R t4 = MST_PRMS_RCPT_D_R.create("T4");
		arrSchdCache_bldr.setDistinct();
		arrSchdCache_bldr.removeSelect(MST_ARR_SCHD_R.$trd_unit_qty);
		arrSchdCache_bldr.removeSelect(MST_ARR_SCHD_R.$base_unit_qty);
		arrSchdCache_bldr.addSelect(greatest(t.trd_unit_qty, t5.trd_unit_schd_qty).as("trd_unit_qty"));
		arrSchdCache_bldr.addSelect(greatest(t.base_unit_qty, t5.base_unit_schd_qty).as("base_unit_qty"));
		arrSchdCache_bldr.addInnerJoin(t2, bracket(t.arr_pr_no.eq(t2.arr_pr_no)));
		arrSchdCache_bldr.addInnerJoin(t5, bracket(t.arr_pr_no.eq(t5.arr_pr_no)
				.and(t.arr_schd_no.eq(t5.arr_schd_no))));
		arrSchdCache_bldr.addLeftOuterJoin(t6, t5.purc_schd_no.eq(t6.purc_schd_no));
		arrSchdCache_bldr.addLeftOuterJoin(t3,
				bracket(nvl(t.dlv_inst_d_no, t6.ref_dlv_inst_d_no).eq(t3.dlv_inst_d_no)));
		arrSchdCache_bldr.addLeftOuterJoin(t4,
				bracket(nvl(t.prms_rcpt_d_no, t6.ref_prms_rcpt_d_no).eq(t4.prms_rcpt_d_no)));
		arrSchdCache_bldr.addSelect(
				t2.po_d_no,
				t3.dlv_inst_d_no,
				t3.dlv_inst_no,
				t4.prms_rcpt_d_no,
				t4.prms_rcpt_no,
				t2.trd_ptn_typ
				);
		arrSchdCache_bldr.addSelect(
				t.dlv_inst_d_no.as("arr_dlv_inst_d_no"),
				t.prms_rcpt_d_no.as("arr_prms_rcpt_d_no")
				);
		arrSchdCache_bldr.addWhereWithAnd(t2.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MST_ARR_SCHD_S01", _arrSchdCache, arrSchdCache_bldr, hdrL);
		// インデックス
		_arrSchdCacheIndexByPoDNo = _arrSchdCache.createIndex(MST_ARR_PR_R.$po_d_no);
		_arrSchdCacheIndexByDlvInstDNo = _arrSchdCache.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
		_arrSchdCacheIndexByPrmsNo = _arrSchdCache.createIndex(MST_PRMS_RCPT_R.$prms_rcpt_no);
		_arrSchdCacheIndexByPrmsDNo = _arrSchdCache.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no);
	}
	/**
	 * 格納されている入荷予定キャッシュを全て取得する
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdCache;
	}
	/**
	 * 入荷予定キャッシュを取得する</p>
	 * 発注明細NOを検索条件に使用する
	 * @param poDNo 発注明細NO
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCacheByPoDNo(String poDNo) {
		return object(CLAZZ)._getArrSchdCacheByPoDNo(poDNo);
	}
	/**
	 * 入荷予定キャッシュを取得する</p>
	 * 納入指示明細NOを検索条件に使用する
	 * @param dlvInstDNo 納入指示明細NO
	 * @return 入荷予定キャッシュ
	 */
	protected static MST_ARR_SCHD_R getArrSchdCacheByDlvInstDNo(String dlvInstDNo) {
		return object(CLAZZ)._getArrSchdCacheByDlvInstDNo(dlvInstDNo);
	}
	/**
	 * 入荷予定キャッシュを取得する</p>
	 * 納期回答受領NOを検索条件に使用する
	 * @param prmsNo 納期回答受領NO
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCacheByPrmsNo(String prmsNo) {
		return object(CLAZZ)._getArrSchdCacheByPrmsNo(prmsNo);
	}
	/**
	 * 入荷予定キャッシュを取得する</p>
	 * 納期回答受領明細NOを検索条件に使用する
	 * @param prmsDNo 納期回答受領明細NO
	 * @return 入荷予定キャッシュ
	 */
	protected static MST_ARR_SCHD_R getArrSchdCacheByPrmsDNo(String prmsDNo) {
		return object(CLAZZ)._getArrSchdCacheByPrmsDNo(prmsDNo);
	}
	protected MCList<MST_ARR_SCHD_R> _getArrSchdCacheByPoDNo(String poDNo) {
		return _arrSchdCache.subList(_arrSchdCacheIndexByPoDNo, poDNo);
	}
	protected MST_ARR_SCHD_R _getArrSchdCacheByDlvInstDNo(String dlvInstDNo) {
		return _arrSchdCache.getFirst(_arrSchdCacheIndexByDlvInstDNo, dlvInstDNo);
	}
	protected MCList<MST_ARR_SCHD_R> _getArrSchdCacheByPrmsNo(String prmsNo) {
		return _arrSchdCache.subList(_arrSchdCacheIndexByPrmsNo, prmsNo);
	}
	protected MST_ARR_SCHD_R _getArrSchdCacheByPrmsDNo(String prmsDNo) {
		return _arrSchdCache.getFirst(_arrSchdCacheIndexByPrmsDNo, prmsDNo);
	}
	
	/**
	 * 仕入予定キャッシュを作成する</p>
	 * 入荷予定キャッシュの入荷予定NOを検索条件に使用して仕入予定を取得する
	 * @param arrSchdL 入荷予定キャッシュリスト
	 */
	protected static void initPurcSchdCache(MCList<MST_ARR_SCHD_R> arrSchdL) {	
		object(CLAZZ)._initPurcSchdCache(arrSchdL);
	}
	protected MCList<MST_PURC_SCHD_R> _purcSchdCache = null;

	protected void _initPurcSchdCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		if(_purcSchdCache != null) {
			return;
		}
		_purcSchdCache = MCList.create(MST_PURC_SCHD_R.class);
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder purcSchdCache_bldr = MCQueryApiBuilder.create(t);
		purcSchdCache_bldr.addWhereWithAnd(t.arr_pr_no.eq(bind("arr_pr_no")));
		dbSelect("MSBDL5120_MST_PURC_SCHD_S01", _purcSchdCache, purcSchdCache_bldr, arrSchdL.groupBy(MST_ARR_SCHD_R.$arr_pr_no));
		_purcSchdCacheIndex = _purcSchdCache.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
	}
	protected MCIndexKey _purcSchdCacheIndex = null;
	
	/**
	 * 仕入予定キャッシュを取得する
	 * @param arrSchdNo 入荷予定NO
	 * @return 仕入予定キャッシュ
	 */
	protected static MST_PURC_SCHD_R getPurcSchdCache(String arrSchdNo) {
		return object(CLAZZ)._getPurcSchdCache(arrSchdNo);
	}
	protected MST_PURC_SCHD_R _getPurcSchdCache(String arrSchdNo) {
		MST_PURC_SCHD_R psR = _purcSchdCache.getFirst(_purcSchdCacheIndex, arrSchdNo); 
		if (isNull(psR)) {
			psR = MST_PURC_SCHD_R.create();
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder psR_bldr = MCQueryApiBuilder.create(t); 
			psR_bldr.addWhereWithAnd(t.arr_schd_no.eq(bind("1")), arrSchdNo);
			dbSelect("MSBDL5120_MST_PURC_SCHD_S02", psR, psR_bldr);
			_purcSchdCache.add(psR);
			_purcSchdCacheIndex = _purcSchdCache.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
		}
		return psR;
	}
	
	/**
	 * 発注明細NOで発注ヘッダを検索し、キャッシュに格納する
	 * @param hdrL 発注明細NOがセットされている電文
	 */
	protected static void initPoCache(MCList<?> hdrL) {
		object(CLAZZ)._initPoCache(hdrL);
	}
	protected MCList<MST_PO_R> _poCache = null;

	protected void _initPoCache(MCList<?> hdrL) {
		_poCache = MCList.create(MST_PO_R.class);
		MST_PO_R t = MST_PO_R.create("T");
		MCQueryApiBuilder poCache_bldr = MCQueryApiBuilder.create(t);
		MST_PO_D_R t2 = MST_PO_D_R.create("T2");
		poCache_bldr.addSelect(t2.po_d_no);
		poCache_bldr.addInnerJoin(t2, bracket(t.po_no.eq(t2.po_no)));
		poCache_bldr.addWhereWithAnd(t2.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MST_PO_S01", _poCache, poCache_bldr, hdrL);
		_poCacheIndex = _poCache.createIndex(MST_PO_D_R.$po_d_no);
	}
	protected MCIndexKey _poCacheIndex = null;

	/**
	 * 発注ヘッダキャッシュを取得する
	 * @param poDNo 発注明細NO
	 * @return 発注ヘッダキャッシュ
	 */
	protected static MST_PO_R getPoCache(String poDNo) {
		return object(CLAZZ)._getPoCache(poDNo);
	}
	protected MST_PO_R _getPoCache(String poDNo) {
		return _poCache.getFirst(_poCacheIndex, poDNo);
	}


	/**
	 * 発注明細NOで発注明細を検索し、キャッシュに格納する
	 * @param hdrL 発注明細NOがセットされている電文
	 */
	protected static void initPoDCache(MCList<?> hdrL) {
		object(CLAZZ)._initPoDCache(hdrL);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _poDCache = null;

	protected void _initPoDCache(MCList<?> hdrL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		_poDCache = new FXUCL_MCDbcCache<MST_PO_D_R>(dbcL_bldr, hdrL, MST_PO_D_R.$po_d_no);
	}

	/**
	 * 発注明細キャッシュを取得する
	 * @param poDNo 発注明細NO
	 * @return 発注明細キャッシュ
	 */
	protected static FXUCL_MCDbcCache<MST_PO_D_R> getPoDCache() {
		return object(CLAZZ)._poDCache;
	}
	
	/** 納期回答受領ヘッダキャッシュ*/
	protected FXUCL_MCDbcCache<MST_PRMS_RCPT_R> _prmsRcptCache = null;
	protected static void initPrmsRcptCache(MCList<Prms_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initPrmsRcptCache(hdrL);
	}
	protected void _initPrmsRcptCache(MCList<Prms_Chk01_HdrR> hdrL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PRMS_RCPT_R.create("T"));
		_prmsRcptCache = new FXUCL_MCDbcCache<MST_PRMS_RCPT_R>(dbcL_bldr, hdrL, Prms_Chk01_HdrR.$prms_rcpt_no);
	}
	protected static FXUCL_MCDbcCache<MST_PRMS_RCPT_R> getPrmsRcptCache() {
		return object(CLAZZ)._prmsRcptCache;
	}
	
	/** 納期回答受領明細キャッシュ */
		/** 納期回答受領明細キャッシュ*/
		protected MCList<MST_PRMS_RCPT_D_R> _prmsRcptDCache = null;
		protected static void initPrmsRcptDCache(MCList<?> hdrL) {
			object(CLAZZ)._initPrmsRcptDCache(hdrL);
		}
		protected void _initPrmsRcptDCache(MCList<?> hdrL) {
			_prmsRcptDCache = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(t);
			MST_PRMS_RCPT_R t2 = MST_PRMS_RCPT_R.create("T2");
			MST_RCPT_IV_D_R rid = MST_RCPT_IV_D_R.create("RID");
			MST_PURC_SCHD_R ps = MST_PURC_SCHD_R.create("PS");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			_prmsRcptDCache.addStringColumn("PO_D_NO");
			_prmsRcptDCache.addBooleanColumn("ARR_SCHD_REFL_FLG");
			_prmsRcptDCache.addDateColumn("PRMS_RCPT_DT");
			_prmsRcptDCache.addStringColumn("ARR_SCHD_NO");
			prmsRcptDL_bldr.setDistinct();
			prmsRcptDL_bldr.addSelect(t2.po_d_no);
			prmsRcptDL_bldr.addSelect(t2.arr_schd_refl_flg);
			prmsRcptDL_bldr.addSelect(t2.prms_rcpt_dt);
			prmsRcptDL_bldr.addSelect(t2.prms_rcpt_no);
			prmsRcptDL_bldr.addSelect(t3.arr_schd_no);
			prmsRcptDL_bldr.addInnerJoin(t2, bracket(t2.prms_rcpt_no.eq(t.prms_rcpt_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(rid, bracket(rid.ref_prms_rcpt_d_no.eq(t.prms_rcpt_d_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(ps, ps.purc_schd_no.eq(rid.purc_schd_no));
			prmsRcptDL_bldr.addLeftOuterJoin(t3,
					bracket(t3.prms_rcpt_d_no.eq(t.prms_rcpt_d_no)
							.or(t3.arr_pr_no.eq(ps.arr_pr_no)
							.and(t3.arr_schd_no.eq(ps.arr_schd_no)))));
			
			prmsRcptDL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			prmsRcptDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			prmsRcptDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dbSelect("MSBDL5120_MST_PRMS_RCPT_D_S01", _prmsRcptDCache, prmsRcptDL_bldr, hdrL);
		}
		protected MCList<MST_PRMS_RCPT_D_R> getPrmsRcptDCache() {
			return object(CLAZZ)._getPrmsRcptDCache();
		}
		protected MCList<MST_PRMS_RCPT_D_R> _getPrmsRcptDCache() {
			return _prmsRcptDCache;
		}
		protected MCList<MST_PRMS_RCPT_D_R> getPrmsRcptDCacheByPoDNo(String poDNo) {
			return object(CLAZZ)._getPrmsRcptDCacheByPoDNo(poDNo);
		}
		protected MCList<MST_PRMS_RCPT_D_R> _getPrmsRcptDCacheByPoDNo(String poDNo) {
			MCIndexKey prmsRcptDCacheByPoDNoKey = _prmsRcptDCache.createIndex("PO_D_NO");
			return _prmsRcptDCache.subList(prmsRcptDCacheByPoDNoKey, poDNo);
		}
		protected MCList<MST_PRMS_RCPT_D_R> getPrmsRcptDCacheByMfgInstNo(String mfgInstNo) {
			return object(CLAZZ)._getPrmsRcptDCacheByMfgInstNo(mfgInstNo);
		}
		protected MCList<MST_PRMS_RCPT_D_R> _getPrmsRcptDCacheByMfgInstNo(String mfgInstNo) {
			MCIndexKey prmsRcptDCacheByMfgInstNoKey = _prmsRcptDCache.createIndex(MST_PRMS_RCPT_D_R.$mfg_inst_no);
			return _prmsRcptDCache.subList(prmsRcptDCacheByMfgInstNoKey, mfgInstNo);
		}
	
	protected FXUCL_MCDbcCache<MST_MFG_INST_R> _mfgInstCache = null;
	/**
	 * 製造指図をキャッシュに格納
	 * @param dtlL 製造指図ＮＯがセットされている電文
	 */
	protected static void initMfgInstCache(MCList<?> dtlL) {
		object(CLAZZ)._initMfgInstCache(dtlL);
	}
	protected void _initMfgInstCache(MCList<?> dtlL) {
		MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
		MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);

		dbcL_bldr.addSelect(t2.lot_no);
		dbcL_bldr.addSelect(t2.sublot_no);
		dbcL_bldr.addInnerJoin(t2,
				bracket(t2.itm_mfg_inst_no.eq(t.itm_mfg_inst_no)));
		_mfgInstCache = new FXUCL_MCDbcCache<MST_MFG_INST_R>(dbcL_bldr, dtlL, MST_MFG_INST_R.$mfg_inst_no);
	}
	/**
	 * 製造指図キャッシュを取得する
	 * @return 製造指図キャッシュ
	 */
	protected static FXUCL_MCDbcCache<MST_MFG_INST_R> getMfgInstCache() {
		return object(CLAZZ)._mfgInstCache;
	}
	
	protected MCList<MST_ARR_SCHD_R> _arrSchdSumCache;
	protected MCIndexKey _arrSchdSumCacheIndex = null;
	protected MCList<MST_ARR_SCHD_R> _arrSchdSumByKeyCache;
	protected MCIndexKey _arrSchdSumByKeyCacheIndex = null;
	protected MCList<MST_ARR_SCHD_R> _arrSchdSumForRcptIvCache;
	protected MCIndexKey _arrSchdSumForRcptIvCacheIndex = null;
	/**
	 * 入荷予定キャッシュを設定する</p>
	 * 発注明細NO, 仕入実績明細NOで入荷予定をグルーピングし、入荷予定数、入荷済数、打切済数のサマリー集計も行う。
	 * @param hdrL 発注明細NOが設定されている電文
	 */
	protected static void initArrSchdSum(MCList<?> hdrL) {
		object(CLAZZ)._initArrSchdSum(hdrL);
	}
	protected void _initArrSchdSum(MCList<? extends MCRow> hdrL) {
		// 検索条件を発注明細主キーワークに登録
		MCList<MST_PO_D_R> wkL = MCList.create(MST_PO_D_R.class);
		for (MCRow r : hdrL) {
			if (isNull(r.getStringNE("po_d_no"))) {
				continue;
			}
			MST_PO_D_R wkR = MST_PO_D_R.create();
			wkR.po_d_no(r.getStringNE("po_d_no"));
			wkL.add(wkR);
		}
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		dbWkDelete("MSBDL5120_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5120_MSW_PO_D_I01", wkL, wkL_bldr.getBaseDbc());
		
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
		MSW_PO_D_KEY_R w1 = MSW_PO_D_KEY_R.create("W1");
		// 発注明細主キーワークを利用して検索
		_arrSchdSumCache = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R arrSchdSumCache_t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder arrSchdSumCache_bldr = MCQueryApiBuilder.create(arrSchdSumCache_t);
		arrSchdSumCache_bldr.addGroupBy(t2.po_d_no, arrSchdSumCache_t.purc_act_d_no);
		arrSchdSumCache_bldr.addSum(
				greatest(arrSchdSumCache_t.base_unit_qty, t3.base_unit_schd_qty),
				"SUM_SCHD_QTY");
		arrSchdSumCache_bldr.addSum(
				greatest(cases().when(arrSchdSumCache_t.arr_skip_flg.eq(value(true)))
								.then(value(0))
								.when(arrSchdSumCache_t.cmpl_flg.eq(value(true)))
								.then(least(arrSchdSumCache_t.arr_qty, arrSchdSumCache_t.base_unit_qty))
								.when(arrSchdSumCache_t.rcpt_iv_no.isNotNull())
								.then(arrSchdSumCache_t.base_unit_qty)
								.otherwise(arrSchdSumCache_t.arr_qty),
						cases().when(t3.non_purc_flg.eq(value(true)))
								.then(value(0))
								.when(t3.cmpl_flg.eq(value(true)))
								.then(least(t3.base_unit_purc_qty
										.add(t3.base_unit_accpt_dfct_qty), t3.base_unit_schd_qty))
								.when(arrSchdSumCache_t.rcpt_iv_no.isNotNull())
								.then(t3.base_unit_schd_qty)
								.otherwise(t3.base_unit_purc_qty
										.add(t3.base_unit_accpt_dfct_qty))),
				"SUM_ACT_QTY");
		arrSchdSumCache_bldr.addSum(
				greatest(arrSchdSumCache_t.abort_qty, t3.base_unit_abort_qty),
				"SUM_ABORT_QTY");
		arrSchdSumCache_bldr.addInnerJoin(t2,
				bracket(arrSchdSumCache_t.arr_pr_no.eq(t2.arr_pr_no)));
		arrSchdSumCache_bldr.addInnerJoin(t3,
				bracket(t3.arr_pr_no.eq(arrSchdSumCache_t.arr_pr_no)
						.and(t3.arr_schd_no.eq(arrSchdSumCache_t.arr_schd_no))));
		arrSchdSumCache_bldr.addInnerJoin(w1, bracket(t2.po_d_no.eq(w1.po_d_no)));
		
		dbSelect("MSBDL5120_MST_ARR_SCHD_S02", _arrSchdSumCache, arrSchdSumCache_bldr);
		_arrSchdSumCacheIndex = _arrSchdSumCache.createIndex(MST_ARR_PR_R.$po_d_no);
		// 同一の抽出条件の、キーごとの集計リストを作っておく
		_arrSchdSumByKeyCache = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R arrSchdSumByKeyCache_t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder arrSchdSumByKeyCache_bldr = MCQueryApiBuilder.create(arrSchdSumByKeyCache_t);
		arrSchdSumByKeyCache_bldr.addGroupBy(
				t2.po_d_no,
				arrSchdSumByKeyCache_t.purc_act_d_no,
				arrSchdSumByKeyCache_t.mfg_inst_no
				);
		arrSchdSumByKeyCache_bldr.addSum(
				greatest(arrSchdSumByKeyCache_t.base_unit_qty, t3.base_unit_schd_qty),
				"SUM_SCHD_QTY");
		arrSchdSumByKeyCache_bldr.addSum(
				greatest(arrSchdSumByKeyCache_t.arr_qty, t3.base_unit_purc_qty),
				"SUM_ACT_QTY");
		arrSchdSumByKeyCache_bldr.addSum(
				greatest(arrSchdSumByKeyCache_t.abort_qty, t3.base_unit_abort_qty),
				"SUM_ABORT_QTY");
		arrSchdSumByKeyCache_bldr.addInnerJoin(t2,
				bracket(arrSchdSumByKeyCache_t.arr_pr_no.eq(t2.arr_pr_no)));
		arrSchdSumByKeyCache_bldr.addInnerJoin(t3,
				bracket(t3.arr_pr_no.eq(arrSchdSumByKeyCache_t.arr_pr_no)
						.and(t3.arr_schd_no.eq(arrSchdSumByKeyCache_t.arr_schd_no))));
		arrSchdSumByKeyCache_bldr.addInnerJoin(w1, bracket(t2.po_d_no.eq(w1.po_d_no)));
		arrSchdSumByKeyCache_bldr.addWhereWithAnd(
				bracket(arrSchdSumByKeyCache_t.cmpl_flg.eq(value(false))
						.and(t3.cmpl_flg.eq(value(false)))
						.or(arrSchdSumByKeyCache_t.arr_skip_flg.eq(value(true)))
						.and(t3.cmpl_flg.eq(value(false)))
						.or(t3.non_purc_flg.eq(value(true)))
						.and(arrSchdSumByKeyCache_t.cmpl_flg.eq(value(false)))));
		arrSchdSumByKeyCache_bldr.addWhereWithAnd(arrSchdSumByKeyCache_t.rcpt_iv_no.isNull());
		dbSelect("MSBDL5120_MST_ARR_SCHD_S03", _arrSchdSumByKeyCache, arrSchdSumByKeyCache_bldr);
		_arrSchdSumByKeyCacheIndex = _arrSchdSumByKeyCache
				.createIndex(MST_ARR_PR_R.$po_d_no);
		
		// 受領インボイス数の集計を行う
		// 入荷予定：受領インボイス＝１：Ｎの場合もあるため、arrSchdSumCacheとは別で取得する
		MST_RCPT_IV_D_R t4 = MST_RCPT_IV_D_R.create("T4");
		_arrSchdSumForRcptIvCache = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R arrSchdSumForRcptIvCache_t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder arrSchdSumForRcptIvCache_bldr = MCQueryApiBuilder.create(arrSchdSumForRcptIvCache_t);
		arrSchdSumForRcptIvCache_bldr.addGroupBy(t2.po_d_no, arrSchdSumForRcptIvCache_t.purc_act_d_no);
		arrSchdSumForRcptIvCache_bldr.addSum(t4.base_unit_qty, "SUM_RCPT_IV_QTY");
		arrSchdSumForRcptIvCache_bldr.addInnerJoin(t2,
				bracket(arrSchdSumForRcptIvCache_t.arr_pr_no.eq(t2.arr_pr_no)));
		arrSchdSumForRcptIvCache_bldr.addInnerJoin(t3,
				bracket(t3.arr_pr_no.eq(arrSchdSumForRcptIvCache_t.arr_pr_no)
						.and(t3.arr_schd_no.eq(arrSchdSumForRcptIvCache_t.arr_schd_no))));
		arrSchdSumForRcptIvCache_bldr.addInnerJoin(w1, bracket(t2.po_d_no.eq(w1.po_d_no)));
		arrSchdSumForRcptIvCache_bldr.addLeftOuterJoin(t4,
				bracket(t4.purc_schd_no.eq(t3.purc_schd_no)));
		dbSelect("MSBDL5120_MST_ARR_SCHD_S4", _arrSchdSumForRcptIvCache, arrSchdSumForRcptIvCache_bldr);
		_arrSchdSumForRcptIvCacheIndex = _arrSchdSumForRcptIvCache.createIndex(MST_ARR_PR_R.$po_d_no);
	}
	/**
	 * 入荷予定キャッシュを取得する
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdSumCache(String poDNo) {
		return object(CLAZZ)._getArrSchdSumCache(poDNo);
	}
	protected MCList<MST_ARR_SCHD_R> _getArrSchdSumCache(String poDNo) {
		return _arrSchdSumCache.subList(_arrSchdSumCacheIndex, poDNo);
	}
	/**
	 * キーごとに集計した入荷予定キャッシュを取得する
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdSumByKeyCache(String poDNo) {
		return object(CLAZZ)._getArrSchdSumByKeyCache(poDNo);
	}
	protected MCList<MST_ARR_SCHD_R> _getArrSchdSumByKeyCache(String poDNo) {
		return _arrSchdSumByKeyCache.subList(_arrSchdSumByKeyCacheIndex, poDNo);
	}
	/**
	 * 受領インボイス数集計用の入荷予定キャッシュを取得する
	 * @return 入荷予定キャッシュ
	 */
	protected static MST_ARR_SCHD_R getArrSchdSumForRcptIvCache(String poDNo) {
		return object(CLAZZ)._getArrSchdSumForRcptIvCache(poDNo);
	}
	protected MST_ARR_SCHD_R _getArrSchdSumForRcptIvCache(String poDNo) {
		return _arrSchdSumForRcptIvCache.getFirst(_arrSchdSumForRcptIvCacheIndex, poDNo);
	}
	
	/** 納入指示キャッシュ */
	protected FXUCL_MCDbcCache<MST_DLV_INST_R> _dlvInstCache;
	protected static void initDlvInstCache(MCList<?> hdrL) {
		object(CLAZZ)._initDlvInstCache(hdrL);
	}
	protected void _initDlvInstCache(MCList<?> hdrL) {
		MST_DLV_INST_R t = MST_DLV_INST_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		_dlvInstCache = new FXUCL_MCDbcCache<MST_DLV_INST_R>(dbcL_bldr, hdrL, MST_DLV_INST_R.$dlv_inst_no);
	}
	protected static FXUCL_MCDbcCache<MST_DLV_INST_R> getDlvInstCache() {
		return object(CLAZZ)._dlvInstCache;
	}
	
	/** 納入指示明細キャッシュ */
	protected FXUCL_MCDbcCache<MST_DLV_INST_D_R> _dlvInstDCache;
	protected static void initDlvInstD(MCList<?> dtlL) {
		object(CLAZZ)._initDlvInstD(dtlL);
	}
	protected void _initDlvInstD(MCList<?> dtlL) {
		MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbcL_bldr.addLeftOuterJoin(t2, bracket(t.in_to_loc_cd.eq(t2.loc_cd)));
		dbcL_bldr.addSelect(t2.wg_cd);
		_dlvInstDCache = new FXUCL_MCDbcCache<MST_DLV_INST_D_R>(dbcL_bldr, dtlL, MST_DLV_INST_D_R.$dlv_inst_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_DLV_INST_D_R> getDlvInstDCache() {
		return object(CLAZZ)._dlvInstDCache;
	}
	
	/** 入荷進捗キャッシュ */
	protected MCList<MST_ARR_PR_R> _arrPrCache;
	// 更新後のキャッシュ（承認次処理の判定用）
	protected MCList<MST_ARR_PR_R> _aftArrPrCache;
	protected MCIndexKey _arrPrCacheKey;
	protected MCIndexKey _aftArrPrCacheKey;
	protected static void initArrPr(MCList<?> hdrL) {
		object(CLAZZ)._initArrPr(hdrL);
	}
	protected void _initArrPr(MCList<?> hdrL) {
		_arrPrCache = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder arrPrCache_bldr = MCQueryApiBuilder.create(t);
		arrPrCache_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MST_ARR_PR_S01", _arrPrCache, arrPrCache_bldr, hdrL);
		_arrPrCacheKey = _arrPrCache.createIndex(MST_ARR_PR_R.$po_d_no);
	}
	protected static MST_ARR_PR_R getArrPrCache(String poDNo) {
		return object(CLAZZ)._getArrPrCache(poDNo);
	}
	protected MST_ARR_PR_R _getArrPrCache(String poDNo) {
		return _arrPrCache.getFirst(_arrPrCacheKey, poDNo);
	}
	protected void initAftArrPr(MCList<?> hdrL) {
		_aftArrPrCache = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder aftArrPrCache_bldr = MCQueryApiBuilder.create(t);
		aftArrPrCache_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MST_ARR_PR_S02", _aftArrPrCache, aftArrPrCache_bldr, hdrL.groupBy(MST_ARR_PR_R.$po_d_no));
		_aftArrPrCacheKey = _aftArrPrCache.createIndex(MST_ARR_PR_R.$po_d_no);
	}
	
	/** 納入指示ヘッダキャッシュ */
	protected MCList<MST_DLV_INST_R> _dlvInstCacheByPrmsRcptNo = null;
	protected MCIndexKey _dlvInstCacheIndexByPrmsRcptNo = null;
	protected static void initDlvInstCacheByPrmsRcptNo(MCList<Prms_Chk01_HdrR> hdrL) {	
		object(CLAZZ)._initDlvInstCacheByPrmsRcptNo(hdrL);
	}
	protected void _initDlvInstCacheByPrmsRcptNo(MCList<Prms_Chk01_HdrR> hdrL) {
		_dlvInstCacheByPrmsRcptNo = MCList.create(MST_DLV_INST_R.class);
		MST_DLV_INST_R t = MST_DLV_INST_R.create("T");
		MCQueryApiBuilder dlvInstCacheByPrmsRcptNo_bldr = MCQueryApiBuilder.create(t);
		MST_DLV_INST_D_R t2 = MST_DLV_INST_D_R.create("T2");
		MST_PRMS_RCPT_D_R t3 = MST_PRMS_RCPT_D_R.create("T3");
		
		dlvInstCacheByPrmsRcptNo_bldr.addGroupBy(t.dlv_inst_no, t.dlv_inst_dt, t3.prms_rcpt_no);
		
		dlvInstCacheByPrmsRcptNo_bldr.addInnerJoin(t2, bracket(t.dlv_inst_no.eq(t2.dlv_inst_no)));
		dlvInstCacheByPrmsRcptNo_bldr.addInnerJoin(t3, bracket(t2.dlv_inst_d_no.eq(t3.dlv_inst_d_no)));
		
		dlvInstCacheByPrmsRcptNo_bldr.addWhereWithAnd(t3.prms_rcpt_no.eq(bind("prms_rcpt_no")));
		dbSelect("MSBDL5120_MST_DLV_INST_S01", _dlvInstCacheByPrmsRcptNo, dlvInstCacheByPrmsRcptNo_bldr, hdrL);
		_dlvInstCacheIndexByPrmsRcptNo = _dlvInstCacheByPrmsRcptNo.createIndex(MST_PRMS_RCPT_R.$prms_rcpt_no);
	}
	protected static MST_DLV_INST_R getDlvInstCacheByPrmsRcptNo(String prmsRcptNo) {
		return object(CLAZZ)._getDlvInstCacheByPrmsRcptNo(prmsRcptNo);
	}
	protected MST_DLV_INST_R _getDlvInstCacheByPrmsRcptNo(String prmsRcptNo) {
		return _dlvInstCacheByPrmsRcptNo.getFirst(_dlvInstCacheIndexByPrmsRcptNo, prmsRcptNo);
	}
	
	/** 取引先マスタキャッシュ */
	protected MCList<MAM_BP_R> _bpL = null;
	/** 取引先マスタキャッシュ用インデックス */
	protected MCIndexKey _bpKey = null;

	/**
	 * 取引先マスタキャッシュを作成する
	 * @param hdrL 発注ＮＯが含まれるリスト
	 */
	protected static void initBpCache(MCList<?> hdrL) {
		object(CLAZZ)._initBpCache(hdrL);
	}
	protected void _initBpCache(MCList<?> hdrL) {
		_bpL = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
		MST_PO_R t2 = MST_PO_R.create("T2");
		MST_PO_D_R t3 = MST_PO_D_R.create("T3");
		bpL_bldr.setDistinct();
		bpL_bldr.setWhere(t3.po_d_no.eq(bind("po_d_no")));
		bpL_bldr.addInnerJoin(t2, bracket(t2.sppl_cd.eq(t.bp_cd)));
		bpL_bldr.addInnerJoin(t3, bracket(t3.po_no.eq(t2.po_no)));
		dbSelect("MSBDL5120_MAM_BP_S01", _bpL, bpL_bldr, hdrL);
		_bpKey = _bpL.createIndex(MAM_BP_R.$bp_cd);
	}
	/**
	 * 格納されている取引先マスタキャッシュを取得する</p>
	 * 取引先ＣＤを検索条件に使用する
	 * @param bpCd
	 * @return
	 */
	protected static MAM_BP_R getBpCache(String bpCd) {
		return object(CLAZZ)._getBpCache(bpCd);
	}
	protected MAM_BP_R _getBpCache(String bpCd) {
		return _bpL.getFirst(_bpKey, bpCd);
	}
	
	/** 品目単位マスタのキャッシュ */
	protected Map<List<Comparable<?>>, MCList<MAVM_ITM_UNIT_R>> _itmUnitCache = null;
	
	/**
	 * キャッシュ作成（品目単位マスタ）
	 * @param dtlL
	 */
	protected static void initItmUnitCache(MCList<?> dtlL) {
		object(CLAZZ)._initItmUnitCache(dtlL);
	}
	
	protected void _initItmUnitCache(MCList<?> dtlL) {
		_itmUnitCache = new LinkedHashMap<List<Comparable<?>>, MCList<MAVM_ITM_UNIT_R>>();
		MCList<?> bindL = dtlL.groupBy("ITM_CD", "ITM_SUB1", "ITM_SUB2", "ITM_SUB3");
		MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBDL5120_MAVM_ITM_UNIT_S01", dbc, dbc_bldr, bindL);

		MCIndexKey idxkey = dbc.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3);
		
		for (MAVM_ITM_UNIT_R r : dbc) {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3() };
			MCList<MAVM_ITM_UNIT_R> val = dbc.subList(idxkey, keyArr);
			_itmUnitCache.put(toMapKey(keyArr), val);
		}
	}
	
	/**
	 * キャッシュ取得（品目単位マスタ）
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @return
	 */
	protected static MCList<MAVM_ITM_UNIT_R> getItmUnitCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmUnitCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MCList<MAVM_ITM_UNIT_R> _getItmUnitCache(String itmCd, String itmSub1, String itmSub2, String itmSub3){
		return _itmUnitCache.get(toMapKey(itmCd, itmSub1, itmSub2, itmSub3));
	}

	/** 場所 */
	protected MCList<MAM_LOC_R> _cacheLoc = null;
	protected MCIndexKey _locKey = null;
	
	/**
	 * キャッシュ作成（場所（納入場所））
	 * @param dtlL
	 */
	protected void initCacheLoc(MCList<ArrSchd_DtlR> arrSchdDtlL) {
		_cacheLoc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder cacheLoc_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		cacheLoc_bldr.addSelect(m1.prov_basis_typ);
		cacheLoc_bldr.setWhere(t.loc_cd.eq(bind("arr_loc_cd")));
		cacheLoc_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t.sppl_cd)));
		dbSelect("MSBDL5120_MAM_LOC_S01", _cacheLoc, cacheLoc_bldr, arrSchdDtlL);
		_locKey = _cacheLoc.createIndex(MAM_LOC_R.$loc_cd);
	}
	
	/**
	 * キャッシュ取得（場所（外注場所））
	 */
	protected MAM_LOC_R getCacheLoc(String locCd) {
		return _cacheLoc.getFirst(_locKey, locCd);
	}
	
	/** 支給単価 */
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _cacheProvUpri = null;

	/**
	 * キャッシュ作成（支給単価）
	 * @param dtlL
	 */
	protected void initCacheProvUpri(MCList<MAM_PROV_UPRI_R> dtlL) {
		MCQueryApiBuilder provUpriL_bldr = MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T"));
		_cacheProvUpri = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				provUpriL_bldr,
				dtlL,
				MAM_PROV_UPRI_R.$itm_cd,
				MAM_PROV_UPRI_R.$itm_sub1,
				MAM_PROV_UPRI_R.$itm_sub2,
				MAM_PROV_UPRI_R.$itm_sub3,
				MAM_PROV_UPRI_R.$prsppl_cd,
				MAM_PROV_UPRI_R.$cur_cd,
				MAM_PROV_UPRI_R.$wg_cd);
	}
	
	/**
	 * キャッシュ取得（支給単価）
	 */
	protected MAM_PROV_UPRI_R getCacheProvUpri(MCDate rqstDlvRqstTm, String itmCd,
			String itmSub1, String itmSub2, String itmSub3, String prspplCd, String curCd,
			String wgCd) {
		return _cacheProvUpri.get(rqstDlvRqstTm, itmCd, itmSub1, itmSub2, itmSub3, prspplCd, curCd, wgCd);
	}
	
	/**
	 * 受注明細のキャッシュ
	 */
	protected MCList<MST_SLO_D_R> _cacheSloDL = null;
	
	protected MCIndexKey _sloDKey = null;
	
	protected static void initSloDCache(MCList<DlvInst_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initSloDCache(hdrL);
	}
	
	protected void _initSloDCache(MCList<DlvInst_Chk01_HdrR> hdrL) {
		
		_cacheSloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder cacheSloDL_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		MST_PO_D_R t2 = MST_PO_D_R.create("T2");
		cacheSloDL_bldr.setSelect(t.slo_d_no, t.dlv_cd, t.gd_cd);
		cacheSloDL_bldr.addSelect(t1.cst_cd);
		cacheSloDL_bldr.addSelect(t2.po_d_no);
		cacheSloDL_bldr.addInnerJoin(t1, t.slo_no.eq(t1.slo_no));
		cacheSloDL_bldr.addInnerJoin(t2, t.slo_d_no.eq(t2.slo_d_no));
		cacheSloDL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MST_SLO_D_S01", _cacheSloDL, cacheSloDL_bldr, hdrL.distinctNE(DlvInst_Chk01_HdrR.$po_d_no));
		
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	
	protected static MST_SLO_D_R getSloDCache(String sloDNo) {
		return object(CLAZZ)._getSloDCache(sloDNo);
	}
	
	protected MST_SLO_D_R _getSloDCache(String sloDNo) {
		return _cacheSloDL.getFirst(_sloDKey, sloDNo);
	}
	
	/**
	 * 受注引当格付マスタのキャッシュ
	 */
	protected MCList<MAM_SLO_ALLOC_GD_R> _cacheSloAllocGdL = null;

	protected MCIndexKey _sloAllocGdKey = null;
	
	protected static void initSloAllocGdCache(MCList<DlvInst_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initSloAllocGdCache(hdrL);
	}
	
	protected void _initSloAllocGdCache(MCList<DlvInst_Chk01_HdrR> hdrL) {
		
		_cacheSloAllocGdL = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R t = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder cacheSloAllocGdL_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MST_PO_D_R t3 = MST_PO_D_R.create("T3");
		cacheSloAllocGdL_bldr.setSelect(t.cst_cd, t.dlv_cd, t.gd_cd);
		cacheSloAllocGdL_bldr.addInnerJoin(t1, t.cst_cd.eq(t1.cst_cd));
		cacheSloAllocGdL_bldr.addInnerJoin(t2, t1.slo_no.eq(t2.slo_no));
		cacheSloAllocGdL_bldr.addInnerJoin(t3, t2.slo_d_no.eq(t3.slo_d_no));
		cacheSloAllocGdL_bldr.setWhere(t3.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5120_MAM_SLO_ALLOC_GD_S01", _cacheSloAllocGdL, cacheSloAllocGdL_bldr, hdrL.distinctNE(DlvInst_Chk01_HdrR.$po_d_no));
		
		_sloAllocGdKey = _cacheSloAllocGdL.createIndex(MAM_SLO_ALLOC_GD_R.$cst_cd, MAM_SLO_ALLOC_GD_R.$dlv_cd, MAM_SLO_ALLOC_GD_R.$gd_cd);
	}
	
	protected static MAM_SLO_ALLOC_GD_R getSloAllocGdCache(String... bind) {
		return object(CLAZZ)._getSloAllocGdCache(bind);
	}
	
	protected MAM_SLO_ALLOC_GD_R _getSloAllocGdCache(String... bind) {
		return _cacheSloAllocGdL.getFirst(_sloAllocGdKey, bind);
	}
	
	/**
	 * 受領ＩＶ明細のキャッシュ
	 */
	protected MCList<MST_RCPT_IV_D_R> _cacheRcptIvDL = null;
	
	protected MCIndexKey _cacheRcptIvDDlvInstKey = null;
	
	protected MCIndexKey _cacheRcptIvDPrmsRcptKey = null;
	
	protected static void initRcptIvDCache(MCList<?> hdrL) {
		object(CLAZZ)._initRcptIvDCache(hdrL);
	}
	
	protected void _initRcptIvDCache(MCList<?> hdrL) {

		_cacheRcptIvDL = MCList.create(MST_RCPT_IV_D_R.class);
		MST_RCPT_IV_D_R t = MST_RCPT_IV_D_R.create("T");
		MCQueryApiBuilder cacheRcptIvDL_bldr = MCQueryApiBuilder.create(t);
		MST_DLV_INST_D_R t1 = MST_DLV_INST_D_R.create("T1");
		MST_PRMS_RCPT_D_R t2 = MST_PRMS_RCPT_D_R.create("T2");
		MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T3");
		_cacheRcptIvDL.addNumberColumn("dlv_inst_base_unit_qty");
		_cacheRcptIvDL.addNumberColumn("prms_rcpt_base_unit_qty");
		_cacheRcptIvDL.addStringColumn("rcpt_iv_no");
		cacheRcptIvDL_bldr.addSelect(nvl(t1.base_unit_qty, value(0)).as("dlv_inst_base_unit_qty"));
		cacheRcptIvDL_bldr.addSelect(nvl(t2.base_unit_qty, value(0)).as("prms_rcpt_base_unit_qty"));
		cacheRcptIvDL_bldr.addSelect(t3.rcpt_iv_no);
		cacheRcptIvDL_bldr.addInnerJoin(t3, bracket(t.rcpt_iv_mng_no.eq(t3.rcpt_iv_mng_no)));
		cacheRcptIvDL_bldr.addLeftOuterJoin(t1, bracket(t.ref_dlv_inst_d_no.eq(t1.dlv_inst_d_no)));
		cacheRcptIvDL_bldr.addLeftOuterJoin(t2, bracket(t.ref_prms_rcpt_d_no.eq(t2.prms_rcpt_d_no)));
		cacheRcptIvDL_bldr.setWhere(createWhere(t, MST_RCPT_IV_D_R.$po_d_no));
		
		dbSelect("MSBDL5120_MST_RCPT_IV_D_S01", _cacheRcptIvDL, cacheRcptIvDL_bldr, hdrL.distinctNE(DlvInst_Chk01_HdrR.$po_d_no));
		
		_cacheRcptIvDDlvInstKey = _cacheRcptIvDL.createIndex(MST_RCPT_IV_D_R.$ref_dlv_inst_d_no);
		_cacheRcptIvDPrmsRcptKey = _cacheRcptIvDL.createIndex(MST_RCPT_IV_D_R.$ref_prms_rcpt_d_no);
	}
	
	protected static MCList<MST_RCPT_IV_D_R> getRcptIvDCacheByDlvInstDNo(String dlvInstDNo) {
		return object(CLAZZ)._getRcptIvDCacheByDlvInstDNo(dlvInstDNo);
	}
	
	protected MCList<MST_RCPT_IV_D_R> _getRcptIvDCacheByDlvInstDNo(String dlvInstDNo) {
		return _cacheRcptIvDL.subList(_cacheRcptIvDDlvInstKey, dlvInstDNo);
	}
	
	protected static MCList<MST_RCPT_IV_D_R> getRcptIvDCacheByPrmsRcptDNo(String prmsRcptDNo) {
		return object(CLAZZ)._getRcptIvDCacheByPrmsRcptDNo(prmsRcptDNo);
	}
	
	protected MCList<MST_RCPT_IV_D_R> _getRcptIvDCacheByPrmsRcptDNo(String prmsRcptDNo) {
		return _cacheRcptIvDL.subList(_cacheRcptIvDPrmsRcptKey, prmsRcptDNo);
	}
	
	/**
	 * DlvInst_Chk01オペレーション.<p>
	 *
	 * 納入指示更新前に実行するチェック処理<br>
	 */
	public class DlvInst_Chk01 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.DlvInst_Chk01 {
		/** 明細上り電文インデックス */
		MCIndexKey idxUpDtlParam = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文マップ作成
			crtUpDtlParamIdx();
			
			// キャッシュ作成
			initCache();
			
			// ヘッダチェック処理
			chkDlvInstHdr();
			
			// 明細チェック処理
			chkDlvInstDtl();
						
			// 承認次処理済更新前チェック、承認次処理済解除前チェックを実行
			callAprvSrv();
			
			setDown();
		}
		
		/**
		 * 明細上り電文のインデックスを作成する
		 */
		protected void crtUpDtlParamIdx() {
			idxUpDtlParam = up1().createIndex(DlvInst_Chk01_DtlR.$peg_no, 
					DlvInst_Chk01_DtlR.$dlv_inst_d_no, 
					DlvInst_Chk01_DtlR.$purc_act_d_no);
		}
		
		/**
		 * キャッシュ設定
		 */
		protected void initCache() {
			initDlvInstCache(up0());
			initPoCache(up0());
			initPoDCache(up0());
			initArrSchdCache(up0());
			initPurcSchdCache(getArrSchdCache());
			initMfgInstCache(up1());
			initArrSchdSum(up0());
			initArrPr(up0());
			initBpCache(up0());
			initItmUnitCache(getArrSchdCache());
			initSloDCache(up0());
			initSloAllocGdCache(up0());
			initRcptIvDCache(up0());
		}
		
		/**
		 * ヘッダ上り電文チェック処理
		 */
		protected void chkDlvInstHdr() {
			
			MCMessageList msgL = new MCMessageList();

			for (DlvInst_Chk01_HdrR hdrRow : up0()) {

				// 共通チェック
				msgL.addAll(chkHdrCom(hdrRow, false));
				// 納期回答受領済かチェックする
				msgL.addAll(chkPrmsRcpt(hdrRow));
				
			}

			// 紐付く明細行を入荷予定に反映できるかのチェックを行う
			msgL.addAll(chkUpdArrSchd());

			
			MCMessagePool.addAll(msgL);
		}
		/**
		 * 納期回答受領済の入荷予定が存在するか
		 * @return メッセージリスト
		 */
		protected MCMessageList chkPrmsRcpt(DlvInst_Chk01_HdrR hdrRow) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(hdrRow.po_d_no());
			for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
				if (!isNull(arrSchdR.prms_rcpt_d_no())) {
					msgL.add(new MCMessage(hdrRow, null, MSBDL0602, hdrRow.po_d_no(), toDispGUIIndex(hdrRow)));
					hdrRow.err_flg(true);
					break;
				}
			}
			return msgL;
		}
		
		/**
		 * 入荷予定を更新できるかチェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkUpdArrSchd() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_DLV_INST_D_R> dlvInstDL = srchDlvInstD(up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no));
			MCIndexKey up0Key = up0().createIndex(DlvInst_Chk01_HdrR.$po_d_no);
			MCIndexKey up0Key2 = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);
			MCIndexKey up1Key = up1().createIndex(DlvInst_Chk01_DtlR.$hdr_peg_no, DlvInst_Chk01_DtlR.$purc_act_d_no);
			MCIndexKey up1Key2 = up1().createIndex(DlvInst_Chk01_DtlR.$hdr_peg_no);
			MCIndexKey dlvInstKey = dlvInstDL.createIndex("po_d_no", MST_DLV_INST_D_R.$purc_act_d_no);
			// 発注明細ＮＯ毎に処理
			for(DlvInst_Chk01_HdrR r : up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no)) {
				// 発注明細NOに紐付き納期回答受領していない入荷予定(仕入実績明細NOでサマリーされている)を取得
				MCList<MST_ARR_SCHD_R> arrSchdByPoD = getArrSchdSumCache(r.po_d_no());
				MST_ARR_SCHD_R arrSchdForRcptIv = getArrSchdSumForRcptIvCache(r.po_d_no());

				// フリーの入荷予定がない場合
				if(isNull(arrSchdByPoD.sum("SUM_SCHD_QTY")) || arrSchdByPoD.sum("SUM_SCHD_QTY").isZero()) {
					MCList<DlvInst_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
					boolean exists = false;
					MCList<DlvInst_Chk01_DtlR> tmpL = MCList.create(DlvInst_Chk01_DtlR.class);
					for(DlvInst_Chk01_HdrR hdrR : hdrL) {
						tmpL.addAll(up1().subList(up1Key2, hdrR.peg_no()));
					}
					for(DlvInst_Chk01_DtlR tmpR : tmpL) {
						if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
							exists = true;
							msgL.add(new MCMessage(hdrL.get(0), null, MSBDL0172, r.po_d_no()));
							r.err_flg(true);
							break;
						}
					}
					
					// 電文による更新後の数量が、 現在の入荷予定残数を越えてしまう場合は、対象の明細上り電文を全てエラーにする
					if (exists) {
						for(DlvInst_Chk01_HdrR hdrR : hdrL) {
							MCList<DlvInst_Chk01_DtlR> dtlUpParamL
								= up1().subList(up1Key2, hdrR.peg_no());
	
							for (DlvInst_Chk01_DtlR dtlUpParamRow : dtlUpParamL) {
								dtlUpParamRow.err_flg(true);
							}
						}
					}
				}
				// フリーの入荷予定残数、再入荷予定の残数に対して指示がかけられるかチェックする
				for (MST_ARR_SCHD_R arrSchdRow : arrSchdByPoD) {
					// 明細上り電文をデータ更新区分により、数量の加算・減算し、登録・更新後の基準単位入荷予定数量を求める
					// 電文から求めた基準単位入荷予定数量が、現在の入荷予定の予定数量よりも多い場合はエラーとなる
					MCNumber updQty = MCNumber.valueOf(0);

					MCList<DlvInst_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
					MCList<DlvInst_Chk01_DtlR> allDtlL = MCList.create(DlvInst_Chk01_DtlR.class);
					// 入荷予定に存在した場合にtrue
					allDtlL.addBooleanColumn("find", false);
					
					for(DlvInst_Chk01_HdrR hdrR : hdrL) {
						// 入荷予定に対する明細上り電文を取得
						MCList<DlvInst_Chk01_DtlR> dtlUpParamL
							= up1().subList(up1Key, hdrR.peg_no(), arrSchdRow.purc_act_d_no());

						if(!isNull(dtlUpParamL)) {
							allDtlL.addAll(dtlUpParamL);
						}
					}

					// 現時点の入荷予定を取得
					MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(r.po_d_no());
					MCIndexKey allDtlKey = allDtlL.createIndex(DlvInst_Chk01_DtlR.$dlv_inst_d_no);
					MCIndexKey schdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
					for(MST_ARR_SCHD_R arrSchdR : arrSchdL.subList(MST_ARR_SCHD_R.$purc_act_d_no, arrSchdRow.purc_act_d_no())) {
						if (!isNull(arrSchdR.rcpt_iv_no()) || isArrCmpl(arrSchdR)) {
							continue;
						}
						if(!isNull(arrSchdR.dlv_inst_d_no())) {
							DlvInst_Chk01_DtlR dtlR = allDtlL.getFirst(allDtlKey, arrSchdR.dlv_inst_d_no());
							MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());

							if(arrSchdR.arr_qty().gt(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty()))) {
								updQty = updQty.subtract(arrSchdR.arr_qty());	
							}
							else {
								updQty = updQty.subtract(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty()));
							}

							if(arrSchdR.abort_flg() || purcSchdR.abort_flg()) {
								if(arrSchdR.abort_qty().gt(purcSchdR.base_unit_abort_qty())) {
									updQty = updQty.subtract(arrSchdR.base_unit_qty().add(arrSchdR.arr_qty()));									
								}
								else {
									updQty = updQty.subtract(purcSchdR.base_unit_schd_qty().add(purcSchdR.base_unit_abort_qty()));
								}
							}
							
							if (!isNull(dtlR)) {
								dtlR.addBooleanColumn("find", true);
								DlvInst_Chk01_HdrR hdrR = up0().getFirst(up0Key2, dtlR.hdr_peg_no());
								if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
								else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
								else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
									// 加算しない
								}
								// 何もしていない行
								else {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
							}
							else {
								updQty = updQty.add(arrSchdR.base_unit_qty());
							}
						}
						else {
							// 受領インボイス登録済は更新対象としてみなす
							if(!isNull(arrSchdR.rcpt_iv_mng_no())) {
								updQty = updQty.add(arrSchdR.base_unit_qty());
							}
						}
					}
					
					// 入荷予定が存在しない分の数量を加味
					for (DlvInst_Chk01_DtlR dtlR : allDtlL) {
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, dtlR.dlv_inst_d_no());
						// ループ中の対象と、上り電文の状態が同じだったら（仕入実績明細ＮＯが一致したなら）計算。
						// （再入荷予定でないフリーの予定と、再入荷予定のフリーの予定が混ざらないないように計算する）
						if (!isSame(arrSchdRow.purc_act_d_no(), dtlR.purc_act_d_no())) {
							continue;
						}
						// dtlR.dlv_inst_d_no()がNULLのケースは関係のない入荷予定が取得される
						if (!isNull(schdR) && !isNull(dtlR.dlv_inst_d_no()) && (!isNull(schdR.rcpt_iv_no()) || isArrCmpl(schdR))) {
							continue;
						}
						// 新規の明細行も集計
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							updQty = updQty.add(dtlR.base_unit_qty());
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) && !dtlR.getBooleanNE("find")) {
							// 入荷予定に存在しなかった場合
							// 納入指示後に納期回答受領を行い、納入指示ＮＯ付きの入荷予定が存在しないが納入指示が存在しているケース
							updQty = updQty.add(dtlR.base_unit_qty());
						}
					}
					
					// 上り電文にない、かつ、入荷予定にもない納入指示を加味
					// 納入指示後に納期回答受領を行い、納入指示に紐づく入荷予定がない状態
					MCList<MST_DLV_INST_D_R> tgtDlvInstDL = dlvInstDL.subList(dlvInstKey, r.po_d_no(), arrSchdRow.purc_act_d_no());
					for (MST_DLV_INST_D_R dlvInstDR : tgtDlvInstDL) {
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, dlvInstDR.dlv_inst_d_no());
						if (isNull(schdR)) {
							DlvInst_Chk01_DtlR dtlR = allDtlL.getFirst(allDtlKey, dlvInstDR.dlv_inst_d_no());
							if (isNull(dtlR)) {
								updQty = updQty.add(dlvInstDR.base_unit_qty());
							}
						}
					}
					for (DlvInst_Chk01_DtlR dtlR : allDtlL) {
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(dtlR.dlv_inst_d_no());
							// 納入指示に対して一部受領インボイスを登録している場合、受領インボイスと同じ数量を指定する必要がある
							if (!isNull(rcptIvDL) && !isSame(dtlR.base_unit_qty(), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
								msgL.add(new MCMessage(dtlR, DlvInst_Chk01_DtlR.$trd_unit_qty, MSBDL0408,
										dtlR.dlv_inst_d_no(), rcptIvDL.sum(MST_RCPT_IV_D_R.$trd_unit_qty), toDispGUIIndex(dtlR)));
								dtlR.err_flg(true);
							}
						}
					}
					
					// 受領インボイス作成元区分「入荷実績」、確定オフで受領インボイスを登録した場合、
					// 入荷実績数＜受領インボイス数で登録できるため、大きい数量でチェックする
					MCNumber actQty = arrSchdRow.getNumberNE("SUM_ACT_QTY");
					MCNumber rcptIvQty = arrSchdForRcptIv.getNumberNE("SUM_RCPT_IV_QTY");
					MCNumber remArrQty = arrSchdRow.getNumberNE("SUM_SCHD_QTY")
							.subtract(MCNumber.max(actQty, rcptIvQty))
							.subtract(arrSchdRow.getNumberNE("SUM_ABORT_QTY"));
					
					// 過入荷の場合に数量がマイナスになるので、残数ゼロとして扱う
					if (remArrQty.isNegative()) {
						remArrQty = MCNumber.ZERO;
					}
					if (updQty.gt(remArrQty)) {
						DlvInst_Chk01_HdrR tgtHdrR = DlvInst_Chk01_HdrR.create();
						// 電文による更新後の数量が、 現在の入荷予定残数を越えてしまう場合は、対象の明細上り電文を全てエラーにする
						for(DlvInst_Chk01_HdrR hdrR : hdrL) {
							// 入荷予定に対する明細上り電文を取得
							MCList<DlvInst_Chk01_DtlR> dtlUpParamL
								= up1().subList(up1Key, hdrR.peg_no(), arrSchdRow.purc_act_d_no());

							for (DlvInst_Chk01_DtlR dtlUpParamRow : dtlUpParamL) {
								dtlUpParamRow.err_flg(true);
								if (isNull(tgtHdrR.po_d_no()) && !dtlUpParamRow.isStatusDelete()) {
									tgtHdrR = hdrR;
								}
							}
						}
						if (actQty.gte(rcptIvQty)) {
							if (isNull(arrSchdRow.purc_act_d_no())) {
								msgL.add(new MCMessage(tgtHdrR, null, MSBDL0114, hdrL.get(0).po_d_no(), updQty.subtract(remArrQty)));
								r.err_flg(true);
							}
							else {
								msgL.add(new MCMessage(tgtHdrR, null, MSBDL0181, hdrL.get(0).po_d_no(), arrSchdRow.purc_act_d_no(), updQty.subtract(remArrQty)));
								r.err_flg(true);
							}
						}
						else {
							msgL.add(new MCMessage(tgtHdrR, null, MSBDL0606, hdrL.get(0).po_d_no(), updQty.subtract(remArrQty)));
							r.err_flg(true);
						}
					}
				}
				// 完了している予定に対して登録しようとしている場合は上のチェックを通らないので、
				// 完了した予定に対して登録しようとしていないかチェック
				MCList<MST_ARR_SCHD_R> notCmplL = getArrSchdSumByKeyCache(r.po_d_no());
				MCIndexKey idxNotCmplL = notCmplL.createIndex("purc_act_d_no", MST_ARR_SCHD_R.$mfg_inst_no);
				MCList<DlvInst_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
				for (DlvInst_Chk01_HdrR hdrR : hdrL) {
					MCList<DlvInst_Chk01_DtlR> subL = up1().subList(up1Key2, hdrR.peg_no());
					for (DlvInst_Chk01_DtlR dtlR : subL) {
						if (dtlR.isStatusNone() || dtlR.isStatusDelete()) {
							continue;
						}
						// 自分に紐づく予定もなく、フリーの予定もない場合エラー
						if (notCmplL.subList(idxNotCmplL, dtlR.purc_act_d_no(), dtlR.mfg_inst_no()).size() == 0
								&& notCmplL.subList(idxNotCmplL, dtlR.purc_act_d_no(), null).size() == 0) {
							msgL.add(new MCMessage(dtlR, null, MSBDL0172, r.po_d_no()));
							hdrR.err_flg(true);
							subL.setBooleanNE(DlvInst_Chk01_DtlR.$err_flg, true);
							break;
						}
					}
				}
				MST_PO_D_R poDR = getPoDCache().get(r.po_d_no());
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, poDR.trd_unit_cd());
				if (isNull(itmUnitR)) {
					for (DlvInst_Chk01_HdrR hdrR : up0().subList(up0Key, r.po_d_no())) {
						msgL.add(new MCMessage(hdrR, null, MSBDL0506, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()), poDR.trd_unit_cd(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 明細上り電文チェック処理
		 */
		protected void chkDlvInstDtl() {
			
			MCMessageList msgL = new MCMessageList();
			MCIndexKey up0Key = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);
			
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(t);
			MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
			dlvInstDL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dlvInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dlvInstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dlvInstDL_bldr.addInnerJoin(t2, bracket(t2.dlv_inst_no.eq(t.dlv_inst_no)));
			dbSelect("MSBDL5120_MST_DLV_INST_D_S01", dlvInstDL, dlvInstDL_bldr, up1().groupBy(DlvInst_Chk01_DtlR.$mfg_inst_no));
			MCIndexKey dlvInstDKey = dlvInstDL.createIndex(MST_DLV_INST_D_R.$mfg_inst_no);
			
			MCIndexKey up1Key = up1().createIndex(DlvInst_Chk01_DtlR.$mfg_inst_no);
			MCIndexKey up1Key2 = up1().createIndex(DlvInst_Chk01_DtlR.$dlv_inst_d_no);
			// 製造指図ＮＯ毎にチェック
			for(DlvInst_Chk01_DtlR r : up1().groupBy(DlvInst_Chk01_DtlR.$mfg_inst_no)) {
				if(isNull(r.mfg_inst_no())) {
					continue;
				}
				MCNumber updQty = MCNumber.ZERO;
				// 画面でフォーカスを当てるために、数量にカウントした最初の行を保持
				DlvInst_Chk01_DtlR errFocusR = null;
				for(MST_DLV_INST_D_R dlvInstDR : dlvInstDL.subList(dlvInstDKey, r.mfg_inst_no())) {
					DlvInst_Chk01_DtlR tmpUp1 = up1().getFirst(up1Key2, dlvInstDR.dlv_inst_d_no());
					if(isNull(tmpUp1)) {
						updQty = updQty.add(dlvInstDR.base_unit_qty());
					}
					else {
						DlvInst_Chk01_HdrR hdrR = up0().getFirst(up0Key, tmpUp1.hdr_peg_no());
						if(MAC_DATA_CRUD_TYP.isUPD(tmpUp1.data_crud_typ())) {
							if (isNull(errFocusR)) {
								errFocusR = tmpUp1;
							}
							updQty = updQty.add(tmpUp1.base_unit_qty());
						}
						if(MAC_DATA_CRUD_TYP.isDEL(tmpUp1.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
							// 加算しない
						}
					}
				}
				
				MCList<DlvInst_Chk01_DtlR> up1L = up1().subList(up1Key, r.mfg_inst_no());
	
				for(DlvInst_Chk01_DtlR up1R : up1L) {
					if(MAC_DATA_CRUD_TYP.isCRT(up1R.data_crud_typ())) {
						updQty = updQty.add(up1R.base_unit_qty());
						if (isNull(errFocusR)) {
							errFocusR = up1R;
						}
					}
					else {
						MST_DLV_INST_D_R dlvInstDR = dlvInstDL.getFirst(dlvInstDKey, r.mfg_inst_no());
						if(isNull(dlvInstDR)) {
							if(!MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
								updQty = updQty.add(up1R.base_unit_qty());
								if (isNull(errFocusR)) {
									errFocusR = up1R;
								}
							}
						}
					}
				}
				
				MST_MFG_INST_R mfgInst = getMfgInstCache().get(r.mfg_inst_no());
				if (updQty.gt(mfgInst.base_unit_inst_qty())) {
					msgL.add(new MCMessage(errFocusR, null, MSBDL0116, r.mfg_inst_no(), mfgInst.base_unit_inst_qty(), updQty));
					for(DlvInst_Chk01_DtlR up1R : up1L) {
						up1R.err_flg(true);
					}
				}
			}

			// 明細毎のチェック
			for (DlvInst_Chk01_DtlR dtlRow : up1()) {
				// 削除の場合
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					MST_ARR_SCHD_R arrSchd = getArrSchdCacheByDlvInstDNo(dtlRow.dlv_inst_d_no());
					if(isNull(arrSchd)) {
						continue;
					}
					MST_PURC_SCHD_R purcSchd = getPurcSchdCache(arrSchd.arr_schd_no());
					MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(dtlRow.dlv_inst_d_no());
					
					if (arrSchd.arr_qty().gt(0) || arrSchd.abort_qty().gt(0) || purcSchd.base_unit_abort_qty().gt(0)
							|| purcSchd.base_unit_accpt_dfct_qty().gt(0) || purcSchd.base_unit_purc_qty().gt(0)) {

						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, null, MSBDL0115, dtlRow.dlv_inst_d_no(), toDispGUIIndex(dtlRow)));
					}
					else if (!isNull(rcptIvDL) && rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty).gt(0)) {
						dtlRow.err_flg(true);
						msgL.add(new MCMessage(dtlRow, null, MSBDL0186, dtlRow.dlv_inst_d_no(), toDispGUIIndex(dtlRow)));
					}
				}
				// 新規、または更新の場合
				else if (MAC_DATA_CRUD_TYP.isCRT(dtlRow.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
					
					// 下請法対象取引先に対しては入荷同時検収でないといけない
					DlvInst_Chk01_HdrR hdrRow = up0().getFirst(up0Key, dtlRow.hdr_peg_no());
					MST_PO_D_R podR = getPoDCache().get(hdrRow.po_d_no());
					MST_PO_R poR = getPoCache(hdrRow.po_d_no());
					MAM_BP_R bpR = getBpCache(poR.sppl_cd());
					
					if (!isNull(bpR) && bpR.subcon_flg()
							&& !MAC_PURC_ID_TYP.isVMI(podR.purc_id_typ())
							&& !MAC_PURC_ID_TYP.isFFR_RCV(podR.purc_id_typ())) {

						if (!dtlRow.dlv_rqst_tm().eqDate(dtlRow.purc_schd_dt())) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, null , MSBDL0074, toDispGUIIndex(dtlRow)));
						}
					}
					
					// 製造指図ＮＯの必須チェック
					if (podR.outsrc_flg()) {
						MCMessageList subMsgL = check(dtlRow, DlvInst_Chk01_DtlR.$mfg_inst_no, new FXUCL_RequiredValidater());
						msgL.addAll(subMsgL);
						setErrFlgCmm(dtlRow, subMsgL);
					}
					
					if (!isNull(podR.dlv_cd()) && !isNull(podR.slo_d_no())) {
						// 仕入直送の場合、受注引当格付マスタに存在しない納品先へ変更できないとする
						MST_SLO_D_R sloDR = getSloDCache(podR.slo_d_no());
						if (!isNull(dtlRow.dlv_cd()) 
							&& !isSame(dtlRow.dlv_cd(), sloDR.dlv_cd())
							&& (isNull(getSloAllocGdCache(sloDR.getStringNE(MST_SLO_R.$cst_cd), MAC_STR.NULL_VAL.value(), sloDR.gd_cd()))
							&& isNull(getSloAllocGdCache(sloDR.getStringNE(MST_SLO_R.$cst_cd), dtlRow.dlv_cd(), sloDR.gd_cd())))
							&& (!isNull(getSloAllocGdCache(sloDR.getStringNE(MST_SLO_R.$cst_cd), MAC_STR.NULL_VAL.value()))
									|| !isNull(getSloAllocGdCache(sloDR.getStringNE(MST_SLO_R.$cst_cd), dtlRow.dlv_cd())))) {
							msgL.add(new MCMessage(dtlRow, DlvInst_Chk01_DtlR.$dlv_cd, MSBDL0407, 
									sloDR.getStringNE(MST_SLO_R.$cst_cd), dtlRow.dlv_cd(), sloDR.gd_cd(), toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
					}
					
					// 仕入計上区分チェック
					if (!isNull(podR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(podR.purc_basis_typ())) {
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())
								&& (isNullOr(dtlRow.dlv_rqst_tm(), dtlRow.purc_schd_dt())
										|| !dtlRow.dlv_rqst_tm().eqDate(dtlRow.purc_schd_dt()))) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0410, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ()) && !dtlRow.sync_flg()) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0411, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
						if (MAC_PURC_BASIS_TYP.isIN_BASIS(podR.purc_basis_typ()) && dtlRow.sync_flg()) {
							msgL.add(new MCMessage(dtlRow, null, MSBDL0412, toDispGUIIndex(dtlRow)));
							dtlRow.err_flg(true);
						}
					}
					
					if(MAC_DATA_CRUD_TYP.isUPD(dtlRow.data_crud_typ())) {
						MST_ARR_SCHD_R arrSchd = getArrSchdCacheByDlvInstDNo(dtlRow.dlv_inst_d_no());
						if(isNull(arrSchd)) {
							continue;
						}
						MST_PURC_SCHD_R purcSchd = getPurcSchdCache(arrSchd.arr_schd_no());
						// 実績数量未満に更新する場合はエラー
						if (dtlRow.base_unit_qty().lt(arrSchd.arr_qty().add(arrSchd.abort_qty()))) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, null, MSBDL0121, dtlRow.dlv_inst_d_no(), arrSchd.arr_qty().add(arrSchd.abort_qty()),
									dtlRow.base_unit_qty(), toDispGUIIndex(dtlRow)));
						}
						else if (dtlRow.base_unit_qty().lt(purcSchd.base_unit_purc_qty().add(purcSchd.base_unit_abort_qty()))) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, null, MSBDL0121, dtlRow.dlv_inst_d_no(),
									purcSchd.base_unit_purc_qty().add(purcSchd.base_unit_abort_qty()), dtlRow.base_unit_qty(),
									toDispGUIIndex(dtlRow)));
						}
						else if (!isNull(arrSchd.rcpt_iv_mng_no())) {
							MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(dtlRow.dlv_inst_d_no());
							if (!isNull(rcptIvDL) && isSame(rcptIvDL.get(0).getNumberNE("dlv_inst_base_unit_qty"), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
								dtlRow.err_flg(true);
								msgL.add(new MCMessage(dtlRow, null, MSBDL0184, dtlRow.dlv_inst_d_no(), toDispGUIIndex(dtlRow)));
							}
						}
						
						// 外注で実績が計上されている場合は製造指図ＮＯの変更は不可
						if(podR.outsrc_flg()) {
							if(!arrSchd.arr_qty().isZero() || !arrSchd.purc_qty().isZero()) {
								if(!isSame(arrSchd.mfg_inst_no(), dtlRow.mfg_inst_no())) {
									dtlRow.err_flg(true);
									msgL.add(new MCMessage(dtlRow, null, MSBDL0145, toDispGUIIndex(dtlRow)));
								}
							}
						}
					}
					// 「今回ＥＤＩ納入指示」がオンで、かつ外部システムＣＤの外部システム区分がmcframe内の会社間取引を示す「ＥＤＩ（ＭＣＦ）」であった場合
					if (hdrRow.crnt_edi_dlv_inst_flg() && MAC_EXT_SYS_TYP.isEDI_MCF(hdrRow.ext_sys_typ())) {
						// 再入荷予定に対する納入指示を登録する場合はエラー
						if (!isNull(dtlRow.purc_act_d_no())) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, null, MSBDL0605, toDispGUIIndex(dtlRow)));
						}
						// 発注時と異なる単位で登録する場合はエラー
						if (!isSame(podR.trd_unit_cd(), dtlRow.trd_unit_cd())) {
							dtlRow.err_flg(true);
							msgL.add(new MCMessage(dtlRow, null, MSBDL0603, podR.po_d_no(), podR.trd_unit_cd(), toDispGUIIndex(dtlRow)));
						}
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 承認次処理済更新前チェック、承認次処理済解除前チェックを実行する
		 */
		protected void callAprvSrv() {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_R> delPoL = MCList.create(MST_PO_R.class);
			poL.addNumberColumn("peg_no");
			delPoL.addNumberColumn("peg_no");
			MBBAL_AprvService.Aprv_Chk02 aprvChk02 = MBBAL_AprvService.crtAprv_Chk02();
			MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
			
			for(DlvInst_Chk01_HdrR r : up0()) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				
				if (!isNull(poR)) {
					if (poR.aprv_flg()) {
						poR.addNumberColumn("peg_no", r.peg_no());
						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							if (!delPoL.contains(poR)) {
								delPoL.add(poR);
							}
							continue;
						}
						if (!poL.contains(poR)) {
							poL.add(poR);
						}
					}
				}
			}

			addAll(aprvChk02.up0(), poL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			addAll(aprvChk03.up0(), delPoL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			// 承認提供サービスの承認次処理済更新前チェックを実行
			if(!aprvChk02.up0().isEmpty()) {
				aprvChk02.exec();
				copyErrFlg(up0(), aprvChk02.down0());
			}
			
			// 承認提供サービスの承認次処理済解除前チェックを実行
			if(!aprvChk03.up0().isEmpty()) {
				aprvChk03.exec();
				copyErrFlg(up0(), aprvChk03.down0());
			}
		}
		
		
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		
		/**
		 * 全Rowのデータ更新区分が新規かチェック
		 * @param list 対象リスト
		 * @return true:全て新規, false:新規以外のRowがある
		 */
		protected boolean isCRT(MCList<?> list) {
			for (MCRow row : list) {
				if (MAC_DATA_CRUD_TYP.isUPD(row.getStringNE("data_crud_typ"))
						|| MAC_DATA_CRUD_TYP.isDEL(row.getStringNE("data_crud_typ"))) {
					return false;
				}
			}
			return true;
		}
		protected boolean isAct(MST_ARR_SCHD_R arrSchd, MST_PURC_SCHD_R purcSchd) {
			
			// 実績済の場合
			return (!isNull(arrSchd.arr_qty()) && !arrSchd.arr_qty().isZero())
					|| (!isNull(arrSchd.purc_qty()) && !arrSchd.purc_qty().isZero())
					|| (!isNull(purcSchd.base_unit_accpt_dfct_qty()) && !purcSchd.base_unit_accpt_dfct_qty().isZero());
		}
	}
	/**
	 * Prms_Chk01オペレーション.<p>
	 *
	 * 納期回答受領更新前に実行するチェック処理<br>
	 */
	public class Prms_Chk01 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// キャッシュ作成
			initCache();
			
			// 納期回答受領ヘッダに対するチェック
			chkPrmsHdr();
			
			// 納期回答受領明細に対するチェック
			chkPrmsDtl();
			
			// 当サービスの入荷予定反映解除前チェックを実行
			callPrmsChk02();
			
			// 当サービスの入荷予定反映前チェックを実行
			callPrmsChk03();
						
			// 承認次処理済更新前チェック、承認次処理済解除前チェックを実行
			callAprvSrv();
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		/**
		 * キャッシュ設定
		 */
		protected void initCache() {
			initPoCache(up0());
			initPoDCache(up0());
			initPrmsRcptCache(up0());
			initPrmsRcptDCache(up0());
			
			// 製造指図をキャッシュ
			initMfgInstCache(up1());
			initDlvInstCacheByPrmsRcptNo(up0());
			initDlvInstD(up1());
			initArrSchdCache(up0());
			initArrSchdSum(up0());
			initPurcSchdCache(getArrSchdCache());
			initArrPr(up0());

			// 取引先マスタをキャッシュ
			initBpCache(up0());
			initRcptIvDCache(up0());
			
			// 品目単位マスタをキャッシュ
			initItmUnitCache(getArrSchdCache());
		}
		
		/**
		 * ヘッダ上り電文チェック処理
		 */
		protected void chkPrmsHdr() {
			MCMessageList msgL = new MCMessageList();
			
			for (Prms_Chk01_HdrR hdrRow : up0()) {
				// 共通チェック
				MCMessagePool.addAll(chkHdrCom(hdrRow, hdrRow.is_src_batch_flg()));
				
				// 納入指示日とのチェック
				if (MAC_DATA_CRUD_TYP.isCRT(hdrRow.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(hdrRow.data_crud_typ())) {
					MST_DLV_INST_R dlvInst = getDlvInstCacheByPrmsRcptNo(hdrRow.prms_rcpt_no());
					if (!isNull(dlvInst)) {
						if (hdrRow.prms_rcpt_dt().lt(dlvInst.dlv_inst_dt())) {
							hdrRow.err_flg(true);
							msgL.add(new MCMessage(hdrRow, null, MSBDL0117, toDispGUIIndex(hdrRow)));
						}
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 明細上り電文チェック処理
		 */
		protected void chkPrmsDtl() {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			MCIndexKey up0Key2 = up0().createIndex(Prms_Chk01_HdrR.$prms_rcpt_no);
			MCIndexKey up1Key = up1().createIndex(Prms_Chk01_DtlR.$mfg_inst_no);
			MCIndexKey up1Key2 = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			// 製造指図ＮＯ毎にチェック
			for(Prms_Chk01_DtlR r : up1().groupBy(Prms_Chk01_DtlR.$mfg_inst_no)) {
				if(isNull(r.mfg_inst_no())) {
					continue;
				}
				MCList<MST_PRMS_RCPT_D_R> tmpPrmsRcptDL = getPrmsRcptDCacheByMfgInstNo(r.mfg_inst_no());
				MCNumber updQty = MCNumber.ZERO;
				// 画面でフォーカスを当てるために、数量にカウントした最初の行を保持
				Prms_Chk01_DtlR errFocusR = null;
				for(MST_PRMS_RCPT_D_R prmsRcptDR : tmpPrmsRcptDL) {
					Prms_Chk01_DtlR tmpUp1 = up1().getFirst(up1Key2, prmsRcptDR.prms_rcpt_d_no());
					Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key2, prmsRcptDR.prms_rcpt_no());
					if (isNull(hdrR) || !hdrR.arr_schd_refl_flg()) {
						continue;
					}
					if(isNull(tmpUp1)) {
						updQty = updQty.add(prmsRcptDR.base_unit_qty());
					}
					else {
						if(MAC_DATA_CRUD_TYP.isUPD(tmpUp1.data_crud_typ())) {
							updQty = updQty.add(tmpUp1.base_unit_qty());
							if (isNull(errFocusR)) {
								errFocusR = tmpUp1;
							}
						}
						if(MAC_DATA_CRUD_TYP.isDEL(tmpUp1.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
							// 加算しない
						}
					}
				}
				
				for(Prms_Chk01_DtlR up1R : up1().subList(up1Key, r.mfg_inst_no())) {
					if(MAC_DATA_CRUD_TYP.isCRT(up1R.data_crud_typ())) {
						Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key, up1R.hdr_peg_no());
						if (isNull(hdrR) || !hdrR.arr_schd_refl_flg()) {
							continue;
						}
						updQty = updQty.add(up1R.base_unit_qty());
						if (isNull(errFocusR)) {
							errFocusR = up1R;
						}
					}
				}
				
				MST_MFG_INST_R mfgInst = getMfgInstCache().get(r.mfg_inst_no());
				if (updQty.gt(mfgInst.base_unit_inst_qty())) {
					msgL.add(new MCMessage(errFocusR, null, MSBDL0138, r.mfg_inst_no(), mfgInst.base_unit_inst_qty(), updQty));
					for(Prms_Chk01_DtlR up1R : up1().subList(up1Key, r.mfg_inst_no())) {
						up1R.err_flg(true);
					}
				}
			}
			
			
			// 明細毎のチェック
			for(Prms_Chk01_DtlR r : up1()) {
				Prms_Chk01_HdrR hdrRow = up0().getFirst(up0Key, r.hdr_peg_no());
				MST_PO_D_R podR = getPoDCache().get(hdrRow.po_d_no());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_SCHD_R arrSchd = getArrSchdCacheByPrmsDNo(r.prms_rcpt_d_no());
					MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(r.prms_rcpt_d_no());
					if (!isNull(arrSchd)) {
						MST_PURC_SCHD_R purcSchd = getPurcSchdCache(arrSchd.arr_schd_no());
						// 実績が発生している場合は削除できない
						if (!arrSchd.arr_qty().isZero() || !arrSchd.abort_qty().isZero() || !purcSchd.base_unit_purc_qty().isZero()
								|| !purcSchd.base_unit_abort_qty().isZero() || !purcSchd.base_unit_accpt_dfct_qty().isZero()
								|| (!isNull(rcptIvDL) && rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty).gt(0))) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0173, r.prms_rcpt_d_no(), toDispGUIIndex(r)));
						}
					}
				}

				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ARR_SCHD_R arrSchd = getArrSchdCacheByPrmsDNo(r.prms_rcpt_d_no());
					if(!isNull(arrSchd)) {
						if(isArrCmpl(arrSchd)){
							continue;
						}
						MST_PURC_SCHD_R purcSchd = getPurcSchdCache(arrSchd.arr_schd_no());
						// 実績数量未満に更新する場合はエラー
						if (r.base_unit_qty().lt(arrSchd.arr_qty().add(arrSchd.abort_qty()))) {

							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0139, r.prms_rcpt_d_no(), arrSchd.arr_qty().add(arrSchd.abort_qty()),
									r.base_unit_qty(), toDispGUIIndex(r)));
						}
						else if (r.base_unit_qty()
								.lt(purcSchd.base_unit_purc_qty().add(purcSchd.base_unit_abort_qty()).add(purcSchd.base_unit_accpt_dfct_qty()))) {

							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0139, r.prms_rcpt_d_no(),
									purcSchd.base_unit_purc_qty().add(purcSchd.base_unit_abort_qty()), r.base_unit_qty(), toDispGUIIndex(r)));

						}
						else if (!isNull(arrSchd.rcpt_iv_mng_no())) {
							MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(r.prms_rcpt_d_no());
							if (!isNull(rcptIvDL) && isSame(rcptIvDL.get(0).getNumberNE("prms_rcpt_base_unit_qty"), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
								r.err_flg(true);
								msgL.add(new MCMessage(r, null, MSBDL0183, r.prms_rcpt_d_no(), toDispGUIIndex(r)));
							}
						}
						
						// 外注で実績が計上されている場合は製造指図ＮＯの変更は不可
						if(podR.outsrc_flg()) {
							if(!arrSchd.arr_qty().isZero() || !arrSchd.purc_qty().isZero()) {
								if(!isSame(arrSchd.mfg_inst_no(), r.mfg_inst_no())) {
									r.err_flg(true);
									msgL.add(new MCMessage(r, null, MSBDL0145, toDispGUIIndex(r)));
								}
							}
						}
					}
				}
				if(isNull(r.dlv_inst_d_no())) {
					continue;
				}
				// 入荷予定に反映する際はChk03でチェックする
				if(hdrRow.arr_schd_refl_flg()) {
					continue;
				}
				
				MST_DLV_INST_D_R dlvInstDR = getDlvInstDCache().get(r.dlv_inst_d_no());
				MST_ARR_SCHD_R arrSchdR = getArrSchdCacheByDlvInstDNo(dlvInstDR.dlv_inst_d_no());
				
				if (!isNull(arrSchdR) && !isNull(arrSchdR.rcpt_iv_mng_no())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBDL0183, r.prms_rcpt_d_no(), toDispGUIIndex(r)));
				}
			}

			for (Prms_Chk01_DtlR up1 : up1().groupBy(Prms_Chk01_DtlR.$hdr_peg_no)) {
				Prms_Chk01_HdrR hdrRow = up0().getFirst(up0Key, up1.hdr_peg_no());
				MST_PO_D_R poDR = getPoDCache().get(hdrRow.po_d_no());
				
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, poDR.trd_unit_cd());
				if (isNull(itmUnitR)) {
					up1().subList(Prms_Chk01_DtlR.$hdr_peg_no, up1.hdr_peg_no()).setBooleanNE(Prms_Chk01_DtlR.$err_flg, true);
					msgL.add(new MCMessage(hdrRow, null, MSBDL0610, toDispItm(poDR.itm_cd(),poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()), poDR.trd_unit_cd(), poDR.po_d_no(), toDispGUIIndex(hdrRow)));
				}
			}
			for (MCList<Prms_Chk01_HdrR> up0L : up0().groupList(Prms_Chk01_HdrR.$po_d_no)) {
				Prms_Chk01_HdrR up0R = up0L.get(0);
				msgL.addAll(chkPrmsItmUnit(up0R));
			}
			MCMessagePool.addAll(msgL);
		}
		
		protected MCMessageList chkPrmsItmUnit(Prms_Chk01_HdrR up0R) {
			MCMessageList errMsgL = new MCMessageList();
			MST_PO_D_R poDR = getPoDCache().get(up0R.po_d_no());
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = getPrmsRcptDCacheByPoDNo(up0R.po_d_no());
			MCIndexKey idxUp1 = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			
			for (MST_PRMS_RCPT_D_R prmsRcptDR : prmsRcptDL) {
				if (isNotTgtPrmsRcptDR(idxUp1, prmsRcptDR)) {
					continue;
				}
				
				MCList<MAVM_ITM_UNIT_R> prmsItmUnitL =getItmUnitCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				MAVM_ITM_UNIT_R prmsItmUnitR = prmsItmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, prmsRcptDR.trd_unit_cd());
				if (isNull(prmsItmUnitR)) {
					errMsgL.add(new MCMessage(up0R, null, MSBDL0612, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()),
							prmsRcptDR.trd_unit_cd(), prmsRcptDR.prms_rcpt_d_no(), toDispGUIIndex(up0R)));
					up0R.setBooleanNE(Prms_Chk01_HdrR.$err_flg, true);
				}
			}
			return errMsgL;
		}
		
		protected boolean isNotTgtPrmsRcptDR(MCIndexKey idxUp1, MST_PRMS_RCPT_D_R prmsRcptDR) {
			Prms_Chk01_DtlR tgtR = up1().getFirst(idxUp1, prmsRcptDR.prms_rcpt_d_no());
			if (isNull(tgtR)) {
				return false;
			}
			return !MAC_DATA_CRUD_TYP.isDEL(tgtR.data_crud_typ());
		}
				
		/**
		 * 入荷予定反映解除前チェック処理を実行
		 */
		protected void callPrmsChk02() {
			MCList<Prms_Chk01_HdrR> paramList = MCList.create(Prms_Chk01_HdrR.class);
			MCList<Prms_Chk01_DtlR> paramDtlList = MCList.create(Prms_Chk01_DtlR.class);
			
			for (Prms_Chk01_HdrR hdrRow : up0()) {
				
				if (MAC_DATA_CRUD_TYP.isUPD(hdrRow.data_crud_typ())) {
					MST_PRMS_RCPT_R prmsRcpt = getPrmsRcptCache().get(hdrRow.prms_rcpt_no());
					if (!hdrRow.arr_schd_refl_flg() && prmsRcpt.arr_schd_refl_flg()) {
						// ONからOFFに変更されようとしている場合にも、反映解除前チェック対象とする
						paramList.add(hdrRow);
					}
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(hdrRow.data_crud_typ())) {
					MST_PRMS_RCPT_R prmsRcpt = getPrmsRcptCache().get(hdrRow.prms_rcpt_no());
					if (prmsRcpt.arr_schd_refl_flg()) {
						paramList.add(hdrRow);
					}
				}
			}
			
			MCIndexKey up1Key = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
			for(Prms_Chk01_HdrR hdrRow : paramList) {
				paramDtlList.addAll(up1().subList(up1Key, hdrRow.peg_no()));
			}
			
			if (paramList.size() > 0) {
				MSBDL_PurcDlvDtAdjstRegService.Prms_Chk02 ope = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Chk02();
				ope.up0().addAll(paramList);
				ope.up1().addAll(paramDtlList);
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}

		/**
		 * 入荷予定反映前チェック処理を実行
		 */
		protected void callPrmsChk03() {
			MCList<Prms_Chk01_HdrR> paramList = MCList.create(Prms_Chk01_HdrR.class);
			MCList<Prms_Chk01_DtlR> paramDtlList = MCList.create(Prms_Chk01_DtlR.class);
			MCIndexKey up1Key = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
			MSBDL_PurcDlvDtAdjstRegService.Prms_Chk03 ope = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Chk03();
			for (Prms_Chk01_HdrR hdrRow : up0()) {
				if (!hdrRow.arr_schd_refl_flg()) {
					ope.up3().addAll(up1().subList(up1Key, hdrRow.peg_no()));
					ope.up2().add(hdrRow);
					continue;
				}	
				paramList.add(hdrRow);
				
			}
			
			
			for(Prms_Chk01_HdrR hdrRow : paramList) {
				paramDtlList.addAll(up1().subList(up1Key, hdrRow.peg_no()));
			}
			
			if (paramList.size() > 0) {
				ope.up0().addAll(paramList);
				ope.up1().addAll(paramDtlList);
				ope.exec();
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up1(), ope.down1());
			}
		}

		/**
		 * 承認次処理済更新前チェック、承認次処理済解除前チェックを実行する
		 */
		protected void callAprvSrv() {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_R> delPoL = MCList.create(MST_PO_R.class);
			poL.addNumberColumn("peg_no");
			delPoL.addNumberColumn("peg_no");
			MBBAL_AprvService.Aprv_Chk02 aprvChk02 = MBBAL_AprvService.crtAprv_Chk02();
			MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
			
			for (Prms_Chk01_HdrR r : up0()) {
				MST_PO_R poR = getPoCache(r.po_d_no());

				if (!isNull(poR)) {
					if (poR.aprv_flg()) {
						poR.addNumberColumn("peg_no", r.peg_no());
						poR.setAttributes(r);

						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							if (!delPoL.contains(poR)) {
								delPoL.add(poR);
							}
							continue;
						}
						if (!poL.contains(poR)) {
							poL.add(poR);
						}
					}
				}
			}
			
			addAll(aprvChk02.up0(), poL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			addAll(aprvChk03.up0(), delPoL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			
			// 承認提供サービスの承認次処理済更新前チェックを実行
			if(!aprvChk02.up0().isEmpty()) {
				aprvChk02.exec();
				copyErrFlg(up0(), aprvChk02.down0());
			}
			
			// 承認提供サービスの承認次処理済解除前チェックを実行
			if(!aprvChk03.up0().isEmpty()) {
				aprvChk03.exec();
				copyErrFlg(up0(), aprvChk03.down0());
			}
		}
	}
	/**
	 * Prms_Chk02オペレーション.<p>
	 *
	 * 納期回答受領が入荷予定に反映されている状態を解除する前に実行するチェック処理<br>
	 */
	public class Prms_Chk02 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 納期回答受領ヘッダに対するチェック
			chkPrmsHdr();
			
			// 下り電文設定
			setDown();
		}
		
		/**
		 * ヘッダ上り電文チェック処理
		 */
		protected void chkPrmsHdr() {
			MCMessageList msgL = new MCMessageList();
			
			for (Prms_Chk01_HdrR hdrRow : up0()) {
				MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPrmsNo(hdrRow.prms_rcpt_no());
				for (MST_ARR_SCHD_R arrSchdRow : arrSchdL) {
					MST_PURC_SCHD_R purcSchdRow = getPurcSchdCache(arrSchdRow.arr_schd_no());
					
					// 実績計上済かどうかのチェック
					if (arrSchdRow.arr_qty().gt(0) || purcSchdRow.base_unit_purc_qty().gt(0) || purcSchdRow.base_unit_accpt_dfct_qty().gt(0)) {
						hdrRow.err_flg(true);
						msgL.add(new MCMessage(hdrRow, null, MSBDL0118, hdrRow.prms_rcpt_no(), toDispGUIIndex(hdrRow)));
						break;
					}
					
					// 打切済かどうかのチェック
					if (arrSchdRow.abort_flg() || purcSchdRow.abort_flg()) {
						hdrRow.err_flg(true);
						msgL.add(new MCMessage(hdrRow, null, MSBDL0119, hdrRow.prms_rcpt_no(), toDispGUIIndex(hdrRow)));
						break;
					}
					
					// インボイス受領済かどうかのチェック
					if (!isNull(arrSchdRow.rcpt_iv_mng_no())) {
						hdrRow.err_flg(true);
						msgL.add(new MCMessage(hdrRow, null, MSBDL0185, hdrRow.prms_rcpt_no(), toDispGUIIndex(hdrRow)));
						break;
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prms_Chk03オペレーション.<p>
	 *
	 * 納期回答受領を入荷予定に反映する前に実行するチェック処理<br>
	 */
	public class Prms_Chk03 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 明細上り電文チェック処理
			chkPrmsDtl();
			
			// 下り電文設定
			setDown();
		}

		protected MCList<MST_PRMS_RCPT_D_R> srchPrms(MCList<Prms_Chk01_HdrR> bindL) {

			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(t);
			MST_PRMS_RCPT_R t2 = MST_PRMS_RCPT_R.create("T2");
			MST_RCPT_IV_D_R rid = MST_RCPT_IV_D_R.create("RID");
			MST_PURC_SCHD_R ps = MST_PURC_SCHD_R.create("PS");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			prmsRcptDL.addBooleanColumn("ARR_SCHD_REFL_FLG");
			prmsRcptDL_bldr.setDistinct();
			prmsRcptDL_bldr.addSelect(t2.po_d_no);
			prmsRcptDL_bldr.addSelect(t2.arr_schd_refl_flg);
			prmsRcptDL_bldr.addSelect(t2.prms_rcpt_no);
			prmsRcptDL_bldr.addSelect(t3.arr_schd_no);
			prmsRcptDL_bldr.addInnerJoin(t2, bracket(t2.prms_rcpt_no.eq(t.prms_rcpt_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(rid, bracket(rid.ref_prms_rcpt_d_no.eq(t.prms_rcpt_d_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(ps, ps.purc_schd_no.eq(rid.purc_schd_no));
			prmsRcptDL_bldr.addLeftOuterJoin(t3,
					bracket(t3.prms_rcpt_d_no.eq(t.prms_rcpt_d_no)
							.or(t3.arr_pr_no.eq(ps.arr_pr_no)
							.and(t3.arr_schd_no.eq(ps.arr_schd_no)))));
			
			prmsRcptDL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			prmsRcptDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL5120_MST_PRMS_RCPT_D_S02", prmsRcptDL, prmsRcptDL_bldr, bindL);
			return prmsRcptDL;
		}

		/**
		 * 明細上り電文チェック処理
		 */
		protected void chkPrmsDtl() {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$po_d_no);
			MCIndexKey up0Key2 = up0().createIndex(Prms_Chk01_HdrR.$prms_rcpt_no);
			MCIndexKey up1Key = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no, Prms_Chk01_DtlR.$purc_act_d_no);
			MCIndexKey up1Key2 = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			MCIndexKey up2Key = up2().createIndex(Prms_Chk01_HdrR.$prms_rcpt_no);
			MCIndexKey up3Key = up3().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = srchPrms(up0().groupBy(Prms_Chk01_HdrR.$po_d_no));
			MCList<MST_PRMS_RCPT_D_R> prmsRcptNoReflDL = srchPrms(up2().groupBy(Prms_Chk01_HdrR.$po_d_no));
			MCIndexKey prmsRcptDKey = prmsRcptDL.createIndex(MST_PRMS_RCPT_R.$po_d_no, MST_PRMS_RCPT_D_R.$purc_act_d_no);
			MCIndexKey prmsRcptNoRefDKey = prmsRcptNoReflDL.createIndex(MST_PRMS_RCPT_R.$po_d_no, MST_PRMS_RCPT_D_R.$purc_act_d_no);
			prmsRcptDL.addBooleanColumn("checked", false);
			for(Prms_Chk01_HdrR r : up0().groupBy(Prms_Chk01_HdrR.$po_d_no)) {
				// 発注明細NOに紐付く入荷予定(仕入実績明細NOでサマリーされている)を取得
				MCList<MST_ARR_SCHD_R> arrSchdByPoD = getArrSchdSumCache(r.po_d_no());
				
				// フリーの入荷予定残数、再入荷予定の残数に対して指示がかけられるかチェックする
				for (MST_ARR_SCHD_R arrSchdRow : arrSchdByPoD) {
					MCNumber updQty = MCNumber.valueOf(0);
					MCNumber reQty = MCNumber.valueOf(0);
					MCList<Prms_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
					// 最終的にエラーとなった場合にエラーにする上り電文
					MCList<Prms_Chk01_DtlR> errTgtDtlL = MCList.create(Prms_Chk01_DtlR.class);
					MCList<Prms_Chk01_HdrR> errTgtHdrL = MCList.create(Prms_Chk01_HdrR.class);
					
					// 明細上り電文をデータ更新区分により、数量の加算・減算し、登録・更新後の基準単位入荷予定数量を求める
					// 電文から求めた基準単位入荷予定数量が、現在の入荷予定の予定数量よりも多い場合はエラーとなる
					MCList<Prms_Chk01_DtlR> allDtlL = MCList.create(Prms_Chk01_DtlR.class);
					// 処理対象の納期回答受領（DBに登録されているもの）
					MCList<MST_PRMS_RCPT_D_R> tgtPrmsL = prmsRcptDL.subList(prmsRcptDKey, r.po_d_no(), arrSchdRow.purc_act_d_no());
					MCIndexKey tgtPrmsKey = tgtPrmsL.createIndex(MST_PRMS_RCPT_D_R.$prms_rcpt_d_no);
					for(Prms_Chk01_HdrR hdrR : hdrL) {
						// 入荷予定に対する明細上り電文を取得
						MCList<Prms_Chk01_DtlR> dtlUpParamL
							= up1().subList(up1Key, hdrR.peg_no(), arrSchdRow.purc_act_d_no());

						if(!isNull(dtlUpParamL)) {
							allDtlL.addAll(dtlUpParamL);
							errTgtHdrL.add(hdrR);
						}
					}
					// 現時点の入荷予定を取得
					MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(r.po_d_no());
					MST_ARR_SCHD_R arrSchdForRcptIv = getArrSchdSumForRcptIvCache(r.po_d_no());
					MCIndexKey schdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no, MST_ARR_SCHD_R.$dlv_inst_d_no);
					MCIndexKey allDtlKey = allDtlL.createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
					for(MST_ARR_SCHD_R arrSchdR : arrSchdL.subList(MST_ARR_SCHD_R.$purc_act_d_no, arrSchdRow.purc_act_d_no())) {
						if(!isNull(arrSchdR.rcpt_iv_no()) || isArrCmpl(arrSchdR)){
							setPrmsChkFlg(arrSchdR, tgtPrmsL, tgtPrmsKey);
							continue;
						}
						if(!isNull(arrSchdR.prms_rcpt_d_no())) {
							// 上り電文、DBの両方に存在する上り電文
							Prms_Chk01_DtlR dtlR = allDtlL.getFirst(allDtlKey, arrSchdR.prms_rcpt_d_no());

							MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());

							if(arrSchdR.arr_qty().gt(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty()))) {
								updQty = updQty.subtract(arrSchdR.arr_qty());	
							}
							else {
								updQty = updQty.subtract(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty()));
							}

							if(arrSchdR.abort_flg() || purcSchdR.abort_flg()) {
								if(arrSchdR.abort_qty().gt(purcSchdR.base_unit_abort_qty())) {
									updQty = updQty.subtract(arrSchdR.base_unit_qty().add(arrSchdR.arr_qty()));									
								}
								else {
									updQty = updQty.subtract(purcSchdR.base_unit_schd_qty().add(purcSchdR.base_unit_abort_qty()));
								}
							}

							if (!isNull(dtlR)) {
								Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key2, dtlR.prms_rcpt_no());
								if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
								else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
								else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
									//加算しない
								}
								// 何もしていない行
								else {
									updQty = updQty.add(dtlR.base_unit_qty());
								}
							}
							else {
								updQty = updQty.add(arrSchdR.base_unit_qty());
							}
							setPrmsChkFlg(arrSchdR, tgtPrmsL, tgtPrmsKey);
						}
						else {
							// 受領インボイス登録済の場合は加算
							if(!isNull(arrSchdR.rcpt_iv_mng_no())) {
								updQty = updQty.add(arrSchdR.base_unit_qty());
								setPrmsChkFlg(arrSchdR, tgtPrmsL, tgtPrmsKey);
							}
						}
					}
					
					for (Prms_Chk01_DtlR dtlR : allDtlL) {
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, dtlR.prms_rcpt_d_no(), dtlR.dlv_inst_d_no());
						// 紐づく入荷予定が受領インボイス登録済か、紐づく入荷予定が完了の場合はスキップ
						if (!isNull(schdR) && !isNull(dtlR.prms_rcpt_d_no()) && (!isNull(schdR.rcpt_iv_no()) || isArrCmpl(schdR))) {
							setPrmsChkFlg(schdR, tgtPrmsL, tgtPrmsKey);
							continue;
						}
						// 新規の明細行も集計
						if (isNull(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							updQty = updQty.add(dtlR.base_unit_qty());
							setPrmsChkFlg(dtlR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							// 更新で、入荷予定に存在しない場合は
							// 未反映→反映済に変更した場合の更新行なので、数量を加算
							if (isNull(schdR)) {
								updQty = updQty.add(dtlR.base_unit_qty());
								setPrmsChkFlg(dtlR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
							}
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							// 削除する回答は、この後の処理で数量を加算しないために、納期回答受領明細を処理済にする
							setPrmsChkFlg(dtlR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
						}
					}
					
					// 入荷予定に存在し、納期回答受領に存在し（反映済）、上り電文に存在しない数量を考慮
					// 反映済回答と、反映済から未反映に変更した回答を同時に登録した場合、後者は入荷予定あり、納期回答受領ありで、
					// 上り電文には存在しない（本チェックが入荷予定反映分のチェックであるため）
					// この分の入荷予定の数量は反映済数量に含めてはいけないので、ここで減算する
					for (MST_PRMS_RCPT_D_R prmsRcptDR : prmsRcptNoReflDL.subList(prmsRcptNoRefDKey, r.po_d_no(), arrSchdRow.purc_act_d_no())) {
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, prmsRcptDR.prms_rcpt_d_no(), prmsRcptDR.dlv_inst_d_no());
						// 紐づく入荷予定が受領インボイス登録済か、紐づく入荷予定が完了の場合はスキップ
						if (!isNull(schdR) && (!isNull(schdR.rcpt_iv_no()) || isArrCmpl(schdR))) {
							setPrmsChkFlg(schdR, tgtPrmsL, tgtPrmsKey);
							continue;
						}
						// 未反映の回答で入荷予定に存在するデータは、入荷予定反映をオンからオフに変えたデータ
						if (!isNull(schdR)) {
							// 未反映の回答のみ絞り込む
							if (!isNull(up2().getFirst(up2Key, prmsRcptDR.getString("PRMS_RCPT_NO")))) {
								// 入荷予定数量分が既に加算されているので、数量を戻す
								updQty = updQty.subtract(prmsRcptDR.base_unit_qty());
								setPrmsChkFlg(schdR, tgtPrmsL, tgtPrmsKey);
							}
						}else {
							// 入荷予定反映済になった後で納入指示が更新された場合など、納期回答受領明細に対応する入荷予定がない
							if (!isNull(up2().getFirst(up2Key, prmsRcptDR.getString("PRMS_RCPT_NO")))) {
								// 入荷予定反映済がオンからオフに更新された場合
								// この後の処理で数量を加算しないために、納期回答受領明細を処理済にする
								setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
							}
						}
					}
					
					
					// 入荷予定に反映していない納期回答受領を考慮
					for(MST_PRMS_RCPT_D_R prmsRcptDR : tgtPrmsL) {
						
						if (!allDtlL.contains(allDtlKey, prmsRcptDR.prms_rcpt_d_no())) {
							MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(prmsRcptDR.prms_rcpt_d_no());
							// 納期回答受領に対して一部受領インボイスを登録している場合、受領インボイスと同じ数量を指定する必要がある
							if (!isNull(rcptIvDL) && !isSame(prmsRcptDR.base_unit_qty(), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
								for (Prms_Chk01_DtlR dtlR : allDtlL) {
									if (!isSame(dtlR.prms_rcpt_d_no(), prmsRcptDR.prms_rcpt_d_no())) {
										msgL.add(new MCMessage(dtlR, Prms_Chk01_DtlR.$trd_unit_qty,
												MSBDL0409, prmsRcptDR.prms_rcpt_d_no(), rcptIvDL.sum(MST_RCPT_IV_D_R.$trd_unit_qty), toDispGUIIndex(dtlR)));
										dtlR.err_flg(true);
										break;
									}
								}
							}
						}
						if(!isNull(prmsRcptDR.getStringNE("ARR_SCHD_NO"))) {
							setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
							continue;
						}
						
						// 入荷予定に反映でないものは除外
						if(!prmsRcptDR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
							Prms_Chk01_HdrR up0 = up0().getFirst(up0Key2, prmsRcptDR.prms_rcpt_no());
							if(isNull(up0) || MAC_DATA_CRUD_TYP.isDEL(up0.data_crud_typ()) || !up0.arr_schd_refl_flg()) {
								setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
								continue;
							}
						}
						Prms_Chk01_DtlR tmpUp1 = up1().getFirst(up1Key2, prmsRcptDR.prms_rcpt_d_no());
						Prms_Chk01_DtlR tmpUp3 = up3().getFirst(up3Key, prmsRcptDR.prms_rcpt_d_no());
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, prmsRcptDR.prms_rcpt_d_no(), prmsRcptDR.dlv_inst_d_no());
						boolean skip = false;
						if (!isNull(schdR) && (!isNull(schdR.rcpt_iv_no()) || isArrCmpl(schdR))) {
							skip = true;
							setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
						}
						if(isNull(tmpUp1) && !skip) {
							// 画面で入荷予定反映済のデータを未反映に変更後、行削除したデータの考慮
							if (!isNull(tmpUp3) && !MAC_DATA_CRUD_TYP.isDEL(tmpUp3.data_crud_typ())) {
								updQty = updQty.add(prmsRcptDR.base_unit_qty());
								setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
							}
						}
						else {

							if (MAC_DATA_CRUD_TYP.isDEL(tmpUp1.data_crud_typ())) {
								// 未反映→反映済の場合の削除行は入荷予定に存在しないので減算不要
								if (!isNull(schdR)) {
									updQty = updQty.subtract(prmsRcptDR.base_unit_qty());
									setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
								}
							}
							else if (MAC_DATA_CRUD_TYP.isUPD(tmpUp1.data_crud_typ())) {
								if (!isNull(schdR) && !skip) {
									updQty = updQty.add(tmpUp1.base_unit_qty());
									setPrmsChkFlg(prmsRcptDR.prms_rcpt_d_no(), tgtPrmsL, tgtPrmsKey);
								}
							}

						}
					}
					for (Prms_Chk01_DtlR dtlR : allDtlL) {
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(dtlR.prms_rcpt_d_no());
							// 納期回答受領に対して一部受領インボイスを登録している場合、受領インボイスと同じ数量を指定する必要がある
							if (!isNull(rcptIvDL) && !isSame(dtlR.base_unit_qty(), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
								msgL.add(new MCMessage(dtlR, Prms_Chk01_DtlR.$trd_unit_qty, 
										MSBDL0409, dtlR.prms_rcpt_d_no(), rcptIvDL.sum(MST_RCPT_IV_D_R.$trd_unit_qty), toDispGUIIndex(dtlR)));
								dtlR.err_flg(true);
							}
						}
					}
					// ここまでに処理されていない納期回答受領の数量を加算
					for (MST_PRMS_RCPT_D_R prmsRcptDR : tgtPrmsL.subList("checked", false)) {
						updQty = updQty.add(prmsRcptDR.base_unit_qty());
					}
					// 受領インボイス作成元区分「入荷実績」、確定オフで受領インボイスを登録した場合、
					// 入荷実績数＜受領インボイス数で登録できるため、大きい数量でチェックする
					MCNumber actQty = arrSchdRow.getNumberNE("SUM_ACT_QTY");
					MCNumber rcptIvQty = arrSchdForRcptIv.getNumberNE("SUM_RCPT_IV_QTY");
					MCNumber remArrQty = arrSchdRow.getNumberNE("SUM_SCHD_QTY")
							.subtract(MCNumber.max(actQty, rcptIvQty))
							.subtract(arrSchdRow.getNumberNE("SUM_ABORT_QTY"));
					
					// 過入荷の場合に数量がマイナスになるので、残数ゼロとして扱う
					if (remArrQty.isNegative()) {
						remArrQty = MCNumber.ZERO;
					}
					reQty = reQty.add(remArrQty);
					errTgtDtlL.addAll(allDtlL);

					if (updQty.gt(reQty)) {
						Prms_Chk01_HdrR tgtHdrR = Prms_Chk01_HdrR.create();
						for (Prms_Chk01_DtlR dtlR : allDtlL) {
							if (!dtlR.isStatusDelete()) {
								tgtHdrR = hdrL.getFirst(Prms_Chk01_HdrR.$peg_no, dtlR.hdr_peg_no());
								break;
							}
						}
						
						if (actQty.gte(rcptIvQty)) {
							if (isNull(arrSchdRow.purc_act_d_no())) {
								msgL.add(new MCMessage(tgtHdrR, null, MSBDL0137, hdrL.get(0).po_d_no(), updQty.subtract(reQty)));
							}
							else {
								msgL.add(new MCMessage(tgtHdrR, null, MSBDL0182, hdrL.get(0).po_d_no(), arrSchdRow.purc_act_d_no(), updQty.subtract(reQty)));
							}
						}
						else {
							msgL.add(new MCMessage(tgtHdrR, null, MSBDL0607, hdrL.get(0).po_d_no(), updQty.subtract(reQty)));
						}
						
						errTgtDtlL.setBoolean("err_flg", true);
						errTgtHdrL.setBoolean("err_flg", true);
					}
				}
				// 完了している予定に対して登録しようとしている場合は上のチェックを通らないので、
				// 完了した予定に対して登録しようとしていないかチェック
				MCList<MST_ARR_SCHD_R> notCmplL = getArrSchdSumByKeyCache(r.po_d_no());
				MCIndexKey idxNotCmplL = notCmplL.createIndex("purc_act_d_no", MST_ARR_SCHD_R.$mfg_inst_no);
				MCIndexKey idxUp1 = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
				MCList<Prms_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
				for (Prms_Chk01_HdrR hdrR : hdrL) {
					MCList<Prms_Chk01_DtlR> subL = up1().subList(idxUp1, hdrR.peg_no());
					for (Prms_Chk01_DtlR dtlR : subL) {
						if (dtlR.isStatusDelete()) {
							continue;
						}
						// 自分に紐づく予定もなく、フリーの予定もない場合エラー
						if (notCmplL.subList(idxNotCmplL, dtlR.purc_act_d_no(), dtlR.mfg_inst_no()).size() == 0
								&& notCmplL.subList(idxNotCmplL, dtlR.purc_act_d_no(), null).size() == 0) {
							msgL.add(new MCMessage(dtlR, null,  MSBDL0199, r.po_d_no(), dtlR.purc_act_d_no(), dtlR.mfg_inst_no()));
							hdrR.err_flg(true);
							subL.setBooleanNE(DlvInst_Chk01_DtlR.$err_flg, true);
						}
					}
				}
			}
			

			// 納入指示に対する納期回答受領の数量チェック
			MCIndexKey up0Key3 = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			for(Prms_Chk01_DtlR r : up1()) {
				// 下請法対象取引先に対しては入荷同時検収でないといけない
				Prms_Chk01_HdrR hdrRow = up0().getFirst(up0Key3, r.hdr_peg_no());
				MST_PO_D_R podR = getPoDCache().get(hdrRow.po_d_no());
				MST_PO_R poR = getPoCache(hdrRow.po_d_no());
				MAM_BP_R bpR = getBpCache(poR.sppl_cd());
				
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {

					if (!isNull(bpR) && bpR.subcon_flg() && !MAC_PURC_ID_TYP.isVMI(podR.purc_id_typ())
							&& !MAC_PURC_ID_TYP.isFFR_RCV(podR.purc_id_typ())) {

						if (!r.prms_dlv_tm().eqDate(r.purc_schd_dt())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0074, toDispGUIIndex(r)));
						}
					}

					// 製造指図ＮＯの必須チェック
					if (podR.outsrc_flg()) {
						MCMessageList subMsgL = check(r, DlvInst_Chk01_DtlR.$mfg_inst_no, new FXUCL_RequiredValidater());
						msgL.addAll(subMsgL);
						setErrFlgCmm(r, subMsgL);
					}

					// 仕入計上区分チェック
					if (!isNull(podR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(podR.purc_basis_typ())) {
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ())
								&& (isNullOr(r.prms_dlv_tm(), r.purc_schd_dt())
										|| !r.prms_dlv_tm().eqDate(r.purc_schd_dt()))) {
							msgL.add(new MCMessage(r, null, MSBDL0410, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(podR.purc_basis_typ()) && !r.sync_flg()) {
							msgL.add(new MCMessage(r, null, MSBDL0411, toDispGUIIndex(r)));
							r.err_flg(true);
						}
						if (MAC_PURC_BASIS_TYP.isIN_BASIS(podR.purc_basis_typ()) && r.sync_flg()) {
							msgL.add(new MCMessage(r, null, MSBDL0412, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}

				if(isNull(r.dlv_inst_d_no())) {
					continue;
				}

				MST_DLV_INST_D_R dlvInstDR = getDlvInstDCache().get(r.dlv_inst_d_no());
				MST_ARR_SCHD_R arrSchdR = getArrSchdCacheByDlvInstDNo(dlvInstDR.dlv_inst_d_no());
				if(!isNull(arrSchdR) && !isNull(arrSchdR.rcpt_iv_mng_no())) {
					MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(r.prms_rcpt_d_no());
					if (!isNull(rcptIvDL) && isSame(rcptIvDL.get(0).getNumberNE("prms_rcpt_base_unit_qty"), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBDL0183, r.prms_rcpt_d_no(), toDispGUIIndex(r)));
					}
				}
			}
			
			// 納入指示数量とのチェック
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R dlvInstDL_t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(dlvInstDL_t);
			MST_DLV_INST_R t1 = MST_DLV_INST_R.create("T1");
			dlvInstDL_bldr.setWhere(t1.po_d_no.eq(bind("po_d_no")));
			dlvInstDL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			dlvInstDL_bldr.addInnerJoin(t1,
					bracket(t1.dlv_inst_no.eq(dlvInstDL_t.dlv_inst_no)));
			dbSelect("MSBDL5120_MST_DLV_INST_D_S02", dlvInstDL, dlvInstDL_bldr,
					up0().groupBy(Prms_Chk01_HdrR.$po_d_no));
			
			prmsRcptDL = srchPrms(up0().groupBy(Prms_Chk01_HdrR.$po_d_no));
			prmsRcptDKey = prmsRcptDL.createIndex(MST_PRMS_RCPT_D_R.$dlv_inst_d_no);
			
			MCIndexKey up1Key3 = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
			MCIndexKey up1Key4 = up1().createIndex(Prms_Chk01_DtlR.$dlv_inst_d_no);
			
			up1().addBooleanColumn("add", false);
			for(Prms_Chk01_HdrR r : up0().groupBy(Prms_Chk01_HdrR.$po_d_no)) {
				MCList<Prms_Chk01_HdrR> hdrL = up0().subList(up0Key, r.po_d_no());
				MCList<Prms_Chk01_DtlR> allDtlL = MCList.create(Prms_Chk01_DtlR.class);
				
				for(Prms_Chk01_HdrR hdrR : hdrL) {
					// 入荷予定に対する明細上り電文を取得
					MCList<Prms_Chk01_DtlR> dtlUpParamL = up1().subList(up1Key3, hdrR.peg_no());

					if(!isNull(dtlUpParamL)) {
						allDtlL.addAll(dtlUpParamL);
					}
				}
				
				chkNonDlvInst(hdrL, up1(), msgL);
			}
			
			for(MST_DLV_INST_D_R dlvInstDR : dlvInstDL) {
				MCNumber ReqQty = MCNumber.ZERO;
				MCList<Prms_Chk01_HdrR> errTgtHdrL = MCList.create(Prms_Chk01_HdrR.class);
				
				MCList<MST_PRMS_RCPT_D_R> tmpPrmsRcptDL = prmsRcptDL.subList(prmsRcptDKey, dlvInstDR.dlv_inst_d_no());
				for(MST_PRMS_RCPT_D_R prmsRcptDR : tmpPrmsRcptDL) {
					Prms_Chk01_DtlR up1 = up1().getFirst(up1Key2, prmsRcptDR.prms_rcpt_d_no());
					if(!isNull(up1)) {
						Prms_Chk01_HdrR up0 = up0().getFirst(up0Key3, up1.hdr_peg_no());
						if(MAC_DATA_CRUD_TYP.isDEL(up0.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(up1.data_crud_typ())) {
							// 削除行の数量は加味しない（画面の数量もDBの数量も加味しない）
						}
						// 画面（ステータスがUPD)とDBに存在するデータの数量を加算
						// ただし、納入指示明細NOを変更した場合は更新前のDBの納入指示明細NOと比較してはいけないのでスキップ
						else if(isSame(up1.dlv_inst_d_no(), dlvInstDR.dlv_inst_d_no())){
							ReqQty = ReqQty.add(up1.base_unit_qty());
							errTgtHdrL.add(up0);
							up1.setBoolean("add", true);
						}
					}
					else if(prmsRcptDR.getBooleanNE("ARR_SCHD_REFL_FLG") && !prmsRcptDR.can_flg()){
						// 画面からは上り電文になっていない（ステータスがNONE）が、DBに存在するデータの数量を加算
						ReqQty = ReqQty.add(prmsRcptDR.base_unit_qty());
					}
				}
				

				MCList<Prms_Chk01_DtlR> up1L = up1().subList(up1Key4, dlvInstDR.dlv_inst_d_no());
				for(Prms_Chk01_DtlR up1 : up1L) {
					Prms_Chk01_HdrR up0 = up0().getFirst(up0Key3, up1.hdr_peg_no());
					// 画面の新規行の数量を加算
					if (MAC_DATA_CRUD_TYP.isCRT(up1.data_crud_typ())) {
						ReqQty = ReqQty.add(up1.base_unit_qty());
						errTgtHdrL.add(up0);
					}
					// 画面とDBに存在するが、更新前の納入指示明細NOがNULLの場合
					else if (MAC_DATA_CRUD_TYP.isUPD(up1.data_crud_typ()) && !up1.getBoolean("add")) {
						ReqQty = ReqQty.add(up1.base_unit_qty());
						errTgtHdrL.add(up0);
					}
				}

				if (ReqQty.gt(dlvInstDR.base_unit_qty())) {
					msgL.add(new MCMessage(errTgtHdrL.get(0), null, MSBDL0122, dlvInstDR.dlv_inst_d_no(), dlvInstDR.base_unit_qty(), ReqQty));
					errTgtHdrL.setBooleanNE(Prms_Chk01_HdrR.$err_flg, true);
					MCList<Prms_Chk01_DtlR> up1L2 = up1().subList(up1Key4, dlvInstDR.dlv_inst_d_no());
					for (Prms_Chk01_DtlR up1 : up1L2) {
						up1.err_flg(true);
					}

				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		/**
		 * 納入指示指定なしで入荷予定可能かチェックする
		 * @param hdrL
		 * @param dtlL
		 * @param msgL
		 */
		protected void chkNonDlvInst(MCList<Prms_Chk01_HdrR> hdrL, MCList<Prms_Chk01_DtlR> dtlL, MCMessageList msgL) {
			MCIndexKey dtlIdx = dtlL.createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
			MCList<Prms_Chk01_HdrR> chkL = hdrL.subList(r -> r.arr_schd_refl_flg() && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (isNull(chkL) || chkL.isEmpty()) {
				return;
			}
			Prms_Chk01_HdrR hdrR = chkL.get(0);
			MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(hdrR.po_d_no());
			if (arrSchdL.subList(r -> !isNull(r.dlv_inst_d_no())).size() == 0) {
				return;
			}
			
			MCNumber reqQty = MCNumber.ZERO;
			MCNumber freeQty = MCNumber.ZERO;
			MCNumber dlvInstQty =MCNumber.ZERO;
			for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
				if (isArrCmpl(arrSchdR)) {
					continue;
				}
				if (isNull(arrSchdR.dlv_inst_d_no())) {
					freeQty = freeQty.add(arrSchdR.base_unit_qty());
				}
				else {
					dlvInstQty = dlvInstQty.add(arrSchdR.base_unit_qty());
				}
			}
			for (Prms_Chk01_HdrR chkR : chkL) {
				for (Prms_Chk01_DtlR dtlR : dtlL.subList(dtlIdx, chkR.peg_no())) {
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && isNull(dtlR.dlv_inst_d_no())) reqQty = reqQty.add(dtlR.base_unit_qty());
				}
			}
			if (reqQty.gt(freeQty)) {
				msgL.add(new MCMessage(hdrR, null, MSBDL0601, hdrR.po_d_no(), freeQty, reqQty));
				for (Prms_Chk01_HdrR chkR : chkL) {
					for (Prms_Chk01_DtlR dtlR : dtlL.subList(dtlIdx, chkR.peg_no())) {
						if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && isNull(dtlR.dlv_inst_d_no())) dtlR.err_flg(true);
					}
				}
			}
		}
		/**
		 * 上り電文に存在する入荷予定か
		 * @param arrSchdR 入荷予定
		 * @return 上り電文に存在するか
		 */
		protected boolean isExistsUp(MST_ARR_SCHD_R arrSchdR) {
			if (isNull(arrSchdR.prms_rcpt_d_no())) {
				return false;
			}
			MCIndexKey up1Key = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			Prms_Chk01_DtlR up1R = up1().getFirst(up1Key, arrSchdR.prms_rcpt_d_no());
			return !isNull(up1R) && !up1R.isEmpty();
		}
		
		protected void setPrmsChkFlg(MST_ARR_SCHD_R schdR, MCList<MST_PRMS_RCPT_D_R> prmsL, MCIndexKey key) {
			MST_PRMS_RCPT_D_R prmsR = prmsL.getFirst(key, schdR.prms_rcpt_d_no());
			if (!isNull(prmsR)) {
				prmsR.setBoolean("checked", true);
			}
		}

		protected void setPrmsChkFlg(String prmsRcptDNo, MCList<MST_PRMS_RCPT_D_R> prmsL, MCIndexKey key) {
			MST_PRMS_RCPT_D_R prmsR = prmsL.getFirst(key, prmsRcptDNo);
			if (!isNull(prmsR)) {
				prmsR.setBoolean("checked", true);
			}
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * ヘッダ共通チェック処理
	 * @param hdrRow ヘッダチェック電文
	 * @return メッセージリスト
	 */
	protected MCMessageList chkHdrCom(MCRow hdrRow, boolean isSrcBatch) {
		
		MCMessageList msgL = new MCMessageList();
		
		String dataCrudTyp = hdrRow.getStringNE("data_crud_typ");
		String poDNo = hdrRow.getStringNE("po_d_no");
	
		MST_PO_R po = getPoCache(poDNo);
		if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)
				|| MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
			if (po.can_flg()) {
				hdrRow.setBooleanNE("err_flg", true);
				msgL.add(new MCMessage(MSBDL0120, po.po_no()));
			}
		}
		if (!isSrcBatch) {
			MCMessageList l = checkWritableDptCdDac(po, MST_PO_R.$purc_dpt_cd);
			if (!l.isEmpty()) {
				hdrRow.setBooleanNE("err_flg", true);
				msgL.addAll(l);
			}
		}
		
		return msgL;
	}
	
	/**
	 * DlvInst_Upd01オペレーション.<p>
	 *
	 * 納入指示を更新する<br>
	 */
	public class DlvInst_Upd01 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.DlvInst_Upd01 {
		
		MCIndexKey _up0Key;
		MCIndexKey _tgtUp0Key;
		MCIndexKey _up1Key;
		MCIndexKey _purcActDKey;
		MCIndexKey _dlvInstKey;
		MCList<MST_PURC_ACT_D_R> _purcActDL;
		MCList<MST_DLV_INST_D_R> _dlvInstDL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			// 仕入直送納品書の取消分を退避
			initPurcPrntPrnt01();
			
			// 納入指示ヘッダ・明細を登録
			regDlvInst();
			
			// 入荷予定サービスの実行
			callArrSchd_Upd01();
			
			// 入荷進捗の更新
			updArrPr();
			
			// 受注状況更新サービスの実行
			callSloSts_Upd01();
			
			// 承認次処理済更新、承認次処理済解除を実行
			callAprvSrv();
			
			// 納品書の登録、発行
			callPurcPrntSrvUpd01(up1());
			
			// 発注時の状態に納品書を戻す
			retDlvSlip();
			
			// 納入指示書の即時発行
			callPurcPrntSrvPrnt01();
			
			// 仕入直送納品書の登録、発行
			callPurcPrntUpd02();
			
			MCList<DlvInst_Chk01_HdrR> dlvInstEdiL = getDlvInstL();
			
			// 納入指示ヘッダの更新
			updDlvInst(dlvInstEdiL);
			
			// 納入指示ＩＦ送信
			callDlvInstEdi(dlvInstEdiL);
			
			setDown();
		}
		
		protected void editUp() {
			for (DlvInst_Chk01_HdrR r : up0()) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				r.po_no(poR.po_no());
			}
		}
				
		/**
		 * 納入指示ヘッダ・明細を登録
		 */
		protected void regDlvInst() {
			MCList<MST_DLV_INST_R> insDlvInstL = MCList.create(MST_DLV_INST_R.class);
			MCList<MST_DLV_INST_R> updDlvInstL = MCList.create(MST_DLV_INST_R.class);
			MCList<MST_DLV_INST_R> delDlvInstL = MCList.create(MST_DLV_INST_R.class);
			MCList<MST_DLV_INST_D_R> insDlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MCList<MST_DLV_INST_D_R> updDlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			updDlvInstDL.addNumberColumn("HDR_PEG_NO");
			MCList<MST_DLV_INST_D_R> delDlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			
			MCList<MST_DLV_INST_R> oldDlvInstL = MCList.create(MST_DLV_INST_R.class);
			MCQueryApiBuilder oldDlvInstL_bldr = MCQueryApiBuilder.create(MST_DLV_INST_R.create("T"));
			dbSelectKey("MSBDL5120_MST_DLV_INST_S02", oldDlvInstL, oldDlvInstL_bldr, up0());
			MCIndexKey idxOldDlvInstL = oldDlvInstL.createIndex(MST_DLV_INST_R.$dlv_inst_no, MST_DLV_INST_R.$dlv_inst_rev);
			
			// 納入指示ヘッダの登録準備
			for(DlvInst_Chk01_HdrR r : up0()) {
				MST_DLV_INST_R dlvInstR = MST_DLV_INST_R.create();
				dlvInstR.addNumberColumn("PEG_NO", r.peg_no());
				dlvInstR.dlv_inst_no(r.dlv_inst_no());
				dlvInstR.dlv_inst_rev(r.dlv_inst_rev());
				dlvInstR.po_d_no(r.po_d_no());
				// 変更が加えられていない行の納入指示書発行済ＦＬＧと納入指示書発行日時は変更しない
				if (r.isStatusNone()) {
					MST_DLV_INST_R oldDlvInstR = oldDlvInstL.getFirst(idxOldDlvInstL, r.dlv_inst_no(), r.dlv_inst_rev());
					dlvInstR.dlv_inst_print_flg(oldDlvInstR.dlv_inst_print_flg());
					dlvInstR.dlv_inst_print_dt(oldDlvInstR.dlv_inst_print_dt());
				}
				else {
					dlvInstR.dlv_inst_print_flg(false);
					dlvInstR.dlv_inst_print_dt(null);
				}
				dlvInstR.dlv_inst_dt(r.dlv_inst_dt());
				dlvInstR.edi_flg(r.edi_flg());
				dlvInstR.dlv_inst_print_rmrks(r.dlv_inst_prnt_rmrks());
				dlvInstR.intr_rmrks(r.intr_rmrks());
				dlvInstR.sub_char1(r.sub_char1());
				dlvInstR.sub_char2(r.sub_char2());
				dlvInstR.sub_char3(r.sub_char3());
				dlvInstR.setStatus(r.getStatus());

				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 発番
					MST_PO_R poR = getPoCache(r.po_d_no());
					getDlvInstNo(dlvInstR, poR);
					r.dlv_inst_no(dlvInstR.dlv_inst_no());
					r.dlv_inst_seq(MCNumber.ONE);
					dlvInstR.dlv_inst_seq(r.dlv_inst_seq());
					insDlvInstL.add(dlvInstR);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_DLV_INST_R cacheDlvInstR = getDlvInstCache().get(r.dlv_inst_no());
					r.dlv_inst_seq(cacheDlvInstR.dlv_inst_seq().add(1));
					dlvInstR.dlv_inst_seq(r.dlv_inst_seq());
					updDlvInstL.add(dlvInstR);
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					dlvInstR.can_flg(true);
					delDlvInstL.add(dlvInstR);
				}
			}
						
			// 納入指示明細の登録準備
			MCIndexKey up0Key = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);

			for(DlvInst_Chk01_DtlR r : up1()) {
				DlvInst_Chk01_HdrR up0 = up0().getFirst(up0Key, r.hdr_peg_no());
				MST_DLV_INST_D_R dlvInstDR = MST_DLV_INST_D_R.create();
				dlvInstDR.addNumberColumn("HDR_PEG_NO", r.hdr_peg_no());
				dlvInstDR.dlv_inst_no(r.dlv_inst_no());
				dlvInstDR.dlv_inst_seq(up0.dlv_inst_seq());
				dlvInstDR.dlv_inst_d_no(r.dlv_inst_d_no());
				dlvInstDR.purc_act_d_no(r.purc_act_d_no());
				dlvInstDR.mfg_inst_no(r.mfg_inst_no());
				dlvInstDR.dlv_rqst_tm(r.dlv_rqst_tm());
				dlvInstDR.purc_schd_dt(r.purc_schd_dt());
				dlvInstDR.sync_flg(r.sync_flg());
				dlvInstDR.in_to_loc_cd(r.dlv_rqst_loc_cd());
				dlvInstDR.str_ln_cd(r.dlv_rqst_str_ln_cd());
				dlvInstDR.trd_unit_cd(r.trd_unit_cd());
				dlvInstDR.trd_unit_qty(r.trd_unit_qty());
				dlvInstDR.base_unit_qty(r.base_unit_qty());
				dlvInstDR.base_unit_cd(r.base_unit_cd());
				dlvInstDR.dlv_inst_print_d_rmrks(r.dlv_inst_print_d_rmrks());
				dlvInstDR.intr_rmrks(r.intr_rmrks());
				dlvInstDR.dlv_slip_d_rmrks(r.dlv_slip_d_rmrks());
				dlvInstDR.dlv_cd(r.dlv_cd());
				dlvInstDR.dlv_sundry_flg(r.dlv_sundry_flg());
				if (dlvInstDR.dlv_sundry_flg()) {
					dlvInstDR.dlv_nm(r.dlv_nm());
				}
				else {
					dlvInstDR.dlv_nm(null);
				}
				dlvInstDR.dlv_cntct_dpt(r.dlv_cntct_dpt());
				dlvInstDR.dlv_cntct_psn(r.dlv_cntct_psn());
				dlvInstDR.dlv_zip_cd(r.dlv_zip_cd());
				dlvInstDR.dlv_addr1(r.dlv_addr1());
				dlvInstDR.dlv_addr2(r.dlv_addr2());
				dlvInstDR.dlv_addr3(r.dlv_addr3());
				dlvInstDR.dlv_addr4(r.dlv_addr4());
				dlvInstDR.dlv_tel(r.dlv_tel());
				dlvInstDR.dlv_fax(r.dlv_fax());
				dlvInstDR.dlv_lg_grp_cd(r.dlv_lg_grp_cd());
				dlvInstDR.pri_prnt_flg(r.pri_prnt_flg());
				dlvInstDR.tdlv_cd(r.tdlv_cd());
				dlvInstDR.tdlv_sundry_flg(r.tdlv_sundry_flg());
				if (dlvInstDR.tdlv_sundry_flg()) {
					dlvInstDR.tdlv_nm(r.tdlv_nm());
				}
				else {
					dlvInstDR.tdlv_nm(null);
				}
				dlvInstDR.tdlv_cntct_dpt(r.tdlv_cntct_dpt());
				dlvInstDR.tdlv_cntct_psn(r.tdlv_cntct_psn());
				dlvInstDR.tdlv_zip_cd(r.tdlv_zip_cd());
				dlvInstDR.tdlv_addr1(r.tdlv_addr1());
				dlvInstDR.tdlv_addr2(r.tdlv_addr2());
				dlvInstDR.tdlv_addr3(r.tdlv_addr3());
				dlvInstDR.tdlv_addr4(r.tdlv_addr4());
				dlvInstDR.tdlv_tel(r.tdlv_tel());
				dlvInstDR.tdlv_fax(r.tdlv_fax());
				dlvInstDR.tdlv_lg_grp_cd(r.tdlv_lg_grp_cd());
				dlvInstDR.sub_char1(r.sub_char1());
				dlvInstDR.sub_char2(r.sub_char2());
				dlvInstDR.sub_char3(r.sub_char3());
				
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 発番
					MST_PO_R poR = getPoCache(up0.po_d_no());
					getDlvInstDNo(dlvInstDR, up0, poR);
					r.dlv_inst_no(up0.dlv_inst_no());
					r.dlv_inst_d_no(dlvInstDR.dlv_inst_d_no());
					insDlvInstDL.add(dlvInstDR);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updDlvInstDL.add(dlvInstDR);
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					dlvInstDR.can_flg(true);
					delDlvInstDL.add(dlvInstDR);
				}
			}
			
			// 納入指示ヘッダ、明細の追加・更新・削除
			if(!insDlvInstL.isEmpty()) {
				getDlvInstGNo(insDlvInstL);
				insDlvInstL.setNumberNE(MST_DLV_INST_R.$dlv_inst_rev, MCNumber.ONE);
				setDlvInstRev(insDlvInstL);
				
				MCQueryApiBuilder insDlvInstL_bldr = MCQueryApiBuilder.create(MST_DLV_INST_R.create("T"));
				dbInsert("MSBDL5120_MST_DLV_INST_I01", insDlvInstL, insDlvInstL_bldr);
			}
			if(!updDlvInstL.isEmpty()) {
				for(MST_DLV_INST_R r : updDlvInstL) {
					MST_DLV_INST_R cacheDlvInstR = getDlvInstCache().get(r.dlv_inst_no());
					// 画面上で変更がない行は、帳票発行およびリビジョン更新を行わない
					if(r.getStatus() == Status.NONE){
						r.dlv_inst_print_flg(cacheDlvInstR.dlv_inst_print_flg());
						continue;
					}
					if(cacheDlvInstR.dlv_inst_print_flg() || cacheDlvInstR.edi_flg()) {
						r.dlv_inst_rev(r.dlv_inst_rev().add(1));
					}
				}
				
				setDlvInstRev(updDlvInstL);
				
				MST_DLV_INST_R updDlvInstL_t = MST_DLV_INST_R.create("T");
				MCQueryApiBuilder updDlvInstL_bldr = MCQueryApiBuilder.create(updDlvInstL_t);
				editUpdSetStmt(updDlvInstL, updDlvInstL_bldr, updDlvInstL_t);
				dbUpdateKey("MSBDL5120_MST_DLV_INST_U01", updDlvInstL, updDlvInstL_bldr);
			}
			if(!delDlvInstL.isEmpty()) {
				MST_DLV_INST_R delDlvInstL_t = MST_DLV_INST_R.create("T");
				MCQueryApiBuilder delDlvInstL_bldr = MCQueryApiBuilder.create(delDlvInstL_t);
				delDlvInstL_bldr.setSet(delDlvInstL_t.can_flg);
				delDlvInstL_bldr.addSet(delDlvInstL_t.dlv_inst_print_flg);
				delDlvInstL_bldr.addSet(delDlvInstL_t.dlv_inst_print_dt);
				dbUpdateKey("MSBDL5120_MST_DLV_INST_U02", delDlvInstL, delDlvInstL_bldr);
			}
			
			if(!insDlvInstDL.isEmpty()) {
				for(MST_DLV_INST_D_R r : insDlvInstDL) {
					DlvInst_Chk01_HdrR up0 = up0().getFirst(up0Key, r.getNumberNE("HDR_PEG_NO"));
					r.dlv_inst_no(up0.dlv_inst_no());
				}
				MCQueryApiBuilder insDlvInstDL_bldr = MCQueryApiBuilder.create(MST_DLV_INST_D_R.create("T"));
				dbInsert("MSBDL5120_MST_DLV_INST_D_I01", insDlvInstDL, insDlvInstDL_bldr);
			}
			if(!updDlvInstDL.isEmpty()) {
				MST_DLV_INST_D_R updDlvInstDL_t = MST_DLV_INST_D_R.create("T");
				MCQueryApiBuilder updDlvInstDL_bldr = MCQueryApiBuilder.create(updDlvInstDL_t);
				editUpdSetStmt(updDlvInstDL, updDlvInstDL_bldr, updDlvInstDL_t);
				dbUpdateKey("MSBDL5120_MST_DLV_INST_D_U01", updDlvInstDL, updDlvInstDL_bldr);
			}
			if(!delDlvInstDL.isEmpty()) {
				MST_DLV_INST_D_R delDlvInstDL_t = MST_DLV_INST_D_R.create("T");
				MCQueryApiBuilder delDlvInstDL_bldr = MCQueryApiBuilder.create(delDlvInstDL_t);
				delDlvInstDL_bldr.setSet(delDlvInstDL_t.can_flg);
				dbUpdateKey("MSBDL5120_MST_DLV_INST_D_U02", delDlvInstDL, delDlvInstDL_bldr);
			}
			
			if(!updDlvInstL.isEmpty()) {
				updDlvInstSeq(updDlvInstL);
			}
		}
		
		/**
		 * 納入指示明細の納入指示連番を更新する。<br>
		 * 訂正時に、納入指示に紐づく明細が上り電文に存在しない場合もあるため、一括更新を行う。
		 * @param updDlvInstL 納入指示ヘッダ
		 */
		protected void updDlvInstSeq(MCList<MST_DLV_INST_R> updDlvInstL) {
			
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			for (MST_DLV_INST_R dlvInstR : updDlvInstL) {
				MST_DLV_INST_D_R dlvInstDR = MST_DLV_INST_D_R.create();
				dlvInstDR.dlv_inst_no(dlvInstR.dlv_inst_no());
				dlvInstDR.dlv_inst_seq(dlvInstR.dlv_inst_seq());
				dlvInstDL.add(dlvInstDR);
			}
			MST_DLV_INST_D_R dlvInstD = MST_DLV_INST_D_R.create("DID");
			
			execDbUpdate("MSBDL5120_MST_DLV_INST_D_U03", dlvInstD, dlvInstDL,
					dlvInstD.dlv_inst_no.eq(bindEx(MST_DLV_INST_D_R.$dlv_inst_no)).and(dlvInstD.can_flg.eq(value(false))),
					dlvInstD.dlv_inst_seq);
		}

		/**
		 * 納入指示ヘッダＮＯの発番
		 * @param dlvInstR 対象の納入指示ヘッダ
		 * @param poR　紐付く発注ヘッダ
		 */
		protected void getDlvInstNo(MST_DLV_INST_R dlvInstR, MST_PO_R poR){
			ElmArgsR elm = ElmArgsR.create();
			elm.dpt_cd(poR.purc_dpt_cd());
			elm.wg_cd(poR.wg_cd());
			elm.bp_cd(poR.sppl_cd());
			elm.co_cd(getCo().co_cd());
			elm.trd_cd(poR.trd_cd());
			elm.dt(dlvInstR.dlv_inst_dt());
			dlvInstR.dlv_inst_no(getNum(MAC_NUM_BIZ_TYP.DLVINST, elm));
		}

		/**
		 * 納入指示明細ＮＯの発番
		 * @param dlvInstDR 対象の納入指示明細
		 * @param up0　 紐付く上り電文
		 * @param poR　紐付く発注ヘッダ
		 */
		protected void getDlvInstDNo(MST_DLV_INST_D_R dlvInstDR, DlvInst_Chk01_HdrR up0, MST_PO_R poR){
			ElmArgsR elm = ElmArgsR.create();
			elm.dpt_cd(poR.purc_dpt_cd());
			elm.wg_cd(poR.wg_cd());
			elm.bp_cd(poR.sppl_cd());
			elm.co_cd(getCo().co_cd());
			elm.trd_cd(poR.trd_cd());
			elm.dt(up0.dlv_inst_dt());
			dlvInstDR.dlv_inst_d_no(getNum(MAC_NUM_BIZ_TYP.DLVINSTD, elm));
		}
		
		protected void getDlvInstGNo(MCList<MST_DLV_INST_R>dlvInstL) {
			dlvInstL.addStringColumn(MST_PO_R.$po_no);
			for (MST_DLV_INST_R r :dlvInstL) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				r.setStringNE(MST_PO_R.$po_no, poR.po_no());
			}
			MCList<MST_DLV_INST_R>[] wkGpL = dlvInstL.groupList(MST_PO_R.$po_no);
			doSeqCache(MSC_NUM_SYS_TYP.DLVINSTG, wkGpL.length);
			for (MCList<MST_DLV_INST_R> gpL : wkGpL) {
				gpL.setStringNE(MST_DLV_INST_R.$dlv_inst_grp_no, getStrSeq(MSC_NUM_SYS_TYP.DLVINSTG));
			}
			// 下り電文用に設定
			MCIndexKey idxKey = up0().createIndex(DlvInst_Chk01_HdrR.$dlv_inst_no);
			for (MST_DLV_INST_R r : dlvInstL) {
				DlvInst_Chk01_HdrR up0R = up0().getFirst(idxKey, r.dlv_inst_no());
				up0R.dlv_inst_grp_no(r.dlv_inst_grp_no());
			}
		}
		
		protected void setDlvInstRev(MCList<MST_DLV_INST_R>dlvInstL) {
			MCIndexKey idxKey = up0().createIndex(DlvInst_Chk01_HdrR.$dlv_inst_no);
			for (MST_DLV_INST_R r : dlvInstL) {
				DlvInst_Chk01_HdrR up0R = up0().getFirst(idxKey, r.dlv_inst_no());
				up0R.dlv_inst_rev(r.dlv_inst_rev());
			}
		}

		/**
		 * 納入指示ヘッダ、更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_DLV_INST_R> updDlvInstL, MCQueryApiBuilder updDlvInstL_bldr, MST_DLV_INST_R t) {
			updDlvInstL_bldr.setSet(
					t.dlv_inst_rev,
					t.dlv_inst_seq,
					t.dlv_inst_print_dt,
					t.dlv_inst_print_flg,
					t.dlv_inst_dt,
					t.edi_flg,
					t.can_flg,
					t.dlv_inst_print_rmrks,
					t.intr_rmrks,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3
			);
		}

		/**
		 * 納入指示明細、更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_DLV_INST_D_R> updDlvInstDL, MCQueryApiBuilder updDlvInstDL_bldr, MST_DLV_INST_D_R t) {
			updDlvInstDL_bldr.setSet(
					t.dlv_inst_seq,
					t.mfg_inst_no,
					t.dlv_rqst_tm,
					t.purc_schd_dt,
					t.sync_flg,
					t.in_to_loc_cd,
					t.str_ln_cd,
					t.trd_unit_qty,
					t.trd_unit_cd,
					t.base_unit_qty,
					t.base_unit_cd,
					t.can_flg,
					t.dlv_inst_print_d_rmrks,
					t.intr_rmrks,
					t.dlv_slip_d_rmrks,
					t.dlv_cd,
					t.dlv_sundry_flg,
					t.dlv_nm,
					t.dlv_cntct_dpt,
					t.dlv_cntct_psn,
					t.dlv_zip_cd,
					t.dlv_addr1,
					t.dlv_addr2,
					t.dlv_addr3,
					t.dlv_addr4,
					t.dlv_tel,
					t.dlv_fax,
					t.dlv_lg_grp_cd,
					t.pri_prnt_flg,
					t.tdlv_cd,
					t.tdlv_sundry_flg,
					t.tdlv_nm,
					t.tdlv_cntct_dpt,
					t.tdlv_cntct_psn,
					t.tdlv_zip_cd,
					t.tdlv_addr1,
					t.tdlv_addr2,
					t.tdlv_addr3,
					t.tdlv_addr4,
					t.tdlv_tel,
					t.tdlv_fax,
					t.tdlv_lg_grp_cd,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3
			);
		}
		
		
		protected MCList<MST_ARR_SCHD_R> getNonPrmsSchdArrSchd(MCList<MST_ARR_SCHD_R> arrSchdCache) {
			MCList<MST_ARR_SCHD_R> freeArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			for (MST_ARR_SCHD_R arrSchdR : arrSchdCache) {
				if (isNull(arrSchdR.prms_rcpt_d_no())) {
					freeArrSchdL.add(arrSchdR);
				}
			}
			return freeArrSchdL;
		}
		
		protected MCList<MST_PURC_SCHD_R> srchPurcSchd(MCList<MST_ARR_SCHD_R> arrSchdL) {
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);
			purcSchdL_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBDL5120_MST_PURC_SCHD_S03", purcSchdL, purcSchdL_bldr, arrSchdL);
			return purcSchdL;
		}

		protected MCList<MST_PURC_ACT_D_R> srchPurcActD(){
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
			MST_ARR_PR_R t4 = MST_ARR_PR_R.create("T4");
			if(!up1().groupBy(DlvInst_Chk01_DtlR.$purc_act_d_no).isEmpty()) {
				purcActDL_bldr.setWhere(t4.po_d_no.eq(bind("po_d_no")));
				purcActDL_bldr.addWhereWithAnd(t.re_arr_flg.eq(value(true)));
				purcActDL_bldr.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				purcActDL_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
				purcActDL_bldr.addInnerJoin(t3, bracket(t3.purc_act_no.eq(t.purc_act_no)
						.and(t3.purc_act_seq.eq(t.purc_act_seq))));
				purcActDL_bldr.addInnerJoin(t4, bracket(t4.arr_pr_no.eq(t2.arr_pr_no)));
				dbSelect("MSBDL5120_MST_PURC_ACT_D_S01", purcActDL, purcActDL_bldr, up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no));
			}
			return purcActDL;
		}
		
		
		protected void sortDelFirst(MCList<MST_ARR_SCHD_R> arrSchdCache, MCIndexKey arrSchdCacheIndexByDlvInstDNo) {
			up1().addNumberColumn("tmpReqQty");
			MCList<DlvInst_Chk01_DtlR> insL = MCList.create(DlvInst_Chk01_DtlR.class);
			MCList<DlvInst_Chk01_DtlR> updL = MCList.create(DlvInst_Chk01_DtlR.class);
			MCList<DlvInst_Chk01_DtlR> delL = MCList.create(DlvInst_Chk01_DtlR.class);
			for (DlvInst_Chk01_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r);
				}
				else {
					insL.add(r);
				}
			}
			
			MCList<DlvInst_Chk01_DtlR> tmpUpdL = MCList.create(DlvInst_Chk01_DtlR.class);
			for (MCList<DlvInst_Chk01_DtlR> grpL : updL.groupList(DlvInst_Chk01_DtlR.$hdr_peg_no, DlvInst_Chk01_DtlR.$purc_act_d_no, DlvInst_Chk01_DtlR.$mfg_inst_no)) {
				for (DlvInst_Chk01_DtlR r : grpL) {
					MST_ARR_SCHD_R arrSchdByDlvInstNoR = arrSchdCache.getFirst(arrSchdCacheIndexByDlvInstDNo, r.dlv_inst_d_no());
					if (!isNull(arrSchdByDlvInstNoR)) {
						r.setNumberNE("tmpReqQty", r.base_unit_qty().subtract(arrSchdByDlvInstNoR.base_unit_qty()));
					}
				}
				grpL.sort("tmpReqQty");
				tmpUpdL.addAll(grpL);
			}
			
			up1().setAll(delL);
			up1().addAll(tmpUpdL);
			up1().addAll(insL);
		}
		
		protected void crtDlvInstSchd(MCList<MST_ARR_SCHD_R> arrSchdCache, MSBEL_ArrSchdService.ArrSchd_Chk01 arrSchdChk01,
				MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01, MCIndexKey arrSchdCacheIndexByPoDNo, MCIndexKey arrSchdCacheIndexByDlvInstDNo) {
			
			// 削除、更新で数量が減る明細から処理しないと、入荷予定を更新する数量が正しく計算できない
			sortDelFirst(arrSchdCache, arrSchdCacheIndexByDlvInstDNo);
			// 受領インボイスは一部登録済フラグを追加
			arrSchdUpd01.up1().addBooleanColumn("rcpt_iv_part_flg");
			for (DlvInst_Chk01_DtlR r : up1()) {
				MCList<MST_ARR_SCHD_R> arrSchdByDlvInstNoL = arrSchdCache.subList(arrSchdCacheIndexByDlvInstDNo, r.dlv_inst_d_no());
				DlvInst_Chk01_HdrR hdrR = up0().getFirst(_up0Key, r.hdr_peg_no());
				DlvInst_Chk01_HdrR tgtUp0 = up0().getFirst(_tgtUp0Key, hdrR.po_d_no());
				MCList<MST_ARR_SCHD_R> arrSchdByPoDNoL = arrSchdCache.subList(arrSchdCacheIndexByPoDNo, hdrR.po_d_no());
				MCIndexKey arrSchdByPoNoKey = arrSchdByPoDNoL.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no, MST_ARR_SCHD_R.$dlv_inst_d_no,
						MST_ARR_SCHD_R.$purc_act_d_no, MST_ARR_SCHD_R.$mfg_inst_no);
				MCIndexKey arrSchdCacheIndexByDlvInstDNoKey = arrSchdByDlvInstNoL.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);

				MCList<MST_ARR_SCHD_R> arrSchdLFree = arrSchdByPoDNoL.subList(arrSchdByPoNoKey, null, null, r.purc_act_d_no(), r.mfg_inst_no());
				if (arrSchdLFree.isEmpty()) {
					arrSchdLFree = arrSchdByPoDNoL.subList(arrSchdByPoNoKey, null, null, r.purc_act_d_no(), null);
				}

				// 新規の場合、納入指示明細ＮＯ、納期回答受領明細ＮＯの指定のない入荷予定を更新
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
					MST_PO_D_R poDR = getPoDCache().get(tgtUp0.po_d_no());
					MST_ARR_PR_R arrPrR = getArrPrCache(hdrR.po_d_no());
					MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
							arrSchdUpd01.up1(), arrPrR.arr_pr_no(), null, r.purc_act_d_no(),
							r.mfg_inst_no());
					// 入荷予定の消込を行う
					arrSchdDtlR = crtArrSchdUpdUp1(arrSchdDtlL, r.base_unit_qty(),
							tgtUp0.peg_no(), arrSchdByPoDNoL, poDR, arrPrR, r,
							arrSchdUpd01, _purcActDL);
					
					// 今回登録対象の予定を連携する
					arrSchdDtlR = arrSchdDtlR.clone();
					arrSchdDtlR.peg_no(tgtUp0.peg_no());
					arrSchdDtlR.dlv_inst_d_no(r.dlv_inst_d_no());
					arrSchdDtlR.purc_act_d_no(r.purc_act_d_no());
					arrSchdDtlR.trd_unit_cd(r.trd_unit_cd());
					arrSchdDtlR.trd_unit_qty(r.trd_unit_qty());
					arrSchdDtlR.base_unit_qty(r.base_unit_qty());
					arrSchdDtlR.arr_loc_cd(r.dlv_rqst_loc_cd());
					arrSchdDtlR.str_ln_cd(r.dlv_rqst_str_ln_cd());
					arrSchdDtlR.mfg_inst_no(r.mfg_inst_no());
					arrSchdDtlR.dlv_slip_d_rmrks(r.dlv_slip_d_rmrks());
					arrSchdDtlR.arr_schd_no(null);
					arrSchdDtlR.arr_schd_tm(r.dlv_rqst_tm());
					arrSchdDtlR.accpt_schd_dt(r.purc_schd_dt());
					arrSchdDtlR.sync_flg(r.sync_flg());
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					arrSchdUpd01.up1().add(arrSchdDtlR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
					MST_PO_D_R poDR = getPoDCache().get(tgtUp0.po_d_no());
					MST_ARR_PR_R arrPrR = getArrPrCache(hdrR.po_d_no());
					MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
							arrSchdUpd01.up1(), arrPrR.arr_pr_no(), null, r.purc_act_d_no(),
							r.mfg_inst_no());
					MST_ARR_SCHD_R arrSchdByDlvInstNoR = arrSchdByDlvInstNoL.getFirst(arrSchdCacheIndexByDlvInstDNoKey, r.dlv_inst_d_no());
					MCNumber reqQty = r.base_unit_qty();
					if (!isNull(arrSchdByDlvInstNoR)) {
						reqQty = reqQty.subtract(arrSchdByDlvInstNoR.base_unit_qty());
					}
					// 入荷予定の消込を行う
					arrSchdDtlR = crtArrSchdUpdUp1(arrSchdDtlL, reqQty, tgtUp0.peg_no(),
							arrSchdByPoDNoL, poDR, arrPrR, r, arrSchdUpd01, _purcActDL);
					
					// 今回登録対象の予定を連携する
					arrSchdDtlR = arrSchdDtlR.clone();
					arrSchdDtlR.peg_no(tgtUp0.peg_no());
					arrSchdDtlR.dlv_inst_d_no(r.dlv_inst_d_no());
					arrSchdDtlR.purc_act_d_no(r.purc_act_d_no());
					arrSchdDtlR.trd_unit_cd(r.trd_unit_cd());
					arrSchdDtlR.trd_unit_qty(r.trd_unit_qty());
					arrSchdDtlR.base_unit_qty(r.base_unit_qty());
					arrSchdDtlR.arr_loc_cd(r.dlv_rqst_loc_cd());
					arrSchdDtlR.str_ln_cd(r.dlv_rqst_str_ln_cd());
					arrSchdDtlR.mfg_inst_no(r.mfg_inst_no());
					arrSchdDtlR.dlv_slip_d_rmrks(r.dlv_slip_d_rmrks());
					arrSchdDtlR.arr_schd_no(null);
					arrSchdDtlR.arr_schd_tm(r.dlv_rqst_tm());
					arrSchdDtlR.accpt_schd_dt(r.purc_schd_dt());
					arrSchdDtlR.sync_flg(r.sync_flg());
					if (isNull(arrSchdByDlvInstNoR)) {
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else {
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						arrSchdDtlR.arr_schd_no(arrSchdByDlvInstNoR.arr_schd_no());
						arrSchdDtlR.lot_no(arrSchdByDlvInstNoR.lot_no());
						arrSchdDtlR.sublot_no(arrSchdByDlvInstNoR.sublot_no());
						arrSchdDtlR.bp_lot_no(arrSchdByDlvInstNoR.bp_lot_no());
						arrSchdDtlR.arr_qty(arrSchdByDlvInstNoR.arr_qty());
						arrSchdDtlR.purc_qty(arrSchdByDlvInstNoR.purc_qty());
						arrSchdDtlR.abort_qty(arrSchdByDlvInstNoR.abort_qty());
						
						MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(r.dlv_inst_d_no());
						if (!isNull(arrSchdDtlR.dlv_inst_d_no()) && !isNull(rcptIvDL)) {
							arrSchdDtlR.arr_schd(arrSchdByDlvInstNoR);
							arrSchdDtlR.trd_unit_qty(r.trd_unit_qty());
							arrSchdDtlR.base_unit_qty(r.base_unit_qty());
							arrSchdDtlR.setBooleanNE("rcpt_iv_part_flg", true);
							if (rcptIvDL.size() == 1) {
								arrSchdDtlR.rcpt_iv_no(rcptIvDL.get(0).getStringNE("rcpt_iv_no"));
								arrSchdDtlR.rcpt_iv_mng_no(rcptIvDL.get(0).rcpt_iv_mng_no());
								arrSchdDtlR.rcpt_iv_itm_nm(rcptIvDL.get(0).iv_itm_nm());
							}
						}
					}
					arrSchdUpd01.up1().add(arrSchdDtlR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_SCHD_R arrSchdByDlvInstNoR = arrSchdByDlvInstNoL.getFirst(arrSchdCacheIndexByDlvInstDNoKey, r.dlv_inst_d_no());
					// 入荷予定を作成していない納期回答受領の場合は対象外
					if (isNull(arrSchdByDlvInstNoR)) {
						continue;
					}

					// フリーな入荷予定がない場合
					if (arrSchdLFree.isEmpty()) {
						MST_PO_D_R poDR = getPoDCache().get(hdrR.po_d_no());
						// 納入指示明細で作成した入荷予定を削除
						MST_ARR_SCHD_R oldArrSchdR = arrSchdByPoDNoL.getFirst(arrSchdByPoNoKey, null, r.dlv_inst_d_no(), r.purc_act_d_no());
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, oldArrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
						arrSchdDtlR.peg_no(tgtUp0.peg_no());
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						arrSchdDtlR.accpt_schd_dt(r.purc_schd_dt());
						arrSchdDtlR.sync_flg(r.sync_flg());
						arrSchdUpd01.up1().add(arrSchdDtlR);

						// 発注明細を元に入荷予定を作成
						MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
								arrSchdUpd01.up1(), oldArrSchdR.arr_pr_no(), null, r.purc_act_d_no(),
								r.mfg_inst_no());
						ArrSchd_DtlR arrSchdDtlR2 = null;
						for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
							if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
								arrSchdDtlR2 = tmpR;
								break;
							}
						}

						// 更新対象が上り電文にない場合
						if (isNull(arrSchdDtlR2)) {
							arrSchdDtlR = arrSchdDtlR.clone();
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							arrSchdDtlR.dlv_inst_d_no(null);
							arrSchdDtlR.arr_schd_no(null);
							if (isNull(r.purc_act_d_no())) {
								arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
								arrSchdDtlR.arr_loc_cd(poDR.in_to_loc_cd());
								arrSchdDtlR.str_ln_cd(poDR.str_ln_cd());
								arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
								arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
								arrSchdDtlR.sync_flg(poDR.sync_flg());
							}
							// 再入荷予定の場合
							else {
								MST_PURC_ACT_D_R purcActDR = _purcActDL.getFirst(_purcActDKey, r.purc_act_d_no());
								arrSchdDtlR.trd_unit_cd(purcActDR.trd_unit_cd());
								arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
								arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
								arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
								arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
								arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
							}
							arrSchdUpd01.up1().add(arrSchdDtlR);
						}
						else {
							arrSchdDtlR2.base_unit_qty(arrSchdDtlR2.base_unit_qty().add(oldArrSchdR.base_unit_qty()));
						}
					}
					// フリーな入荷予定がある場合
					else {
						boolean freeExists = false;
						arrSchdLFree.sort(SortType.ASC, MST_ARR_SCHD_R.$cmpl_flg);
						for (MST_ARR_SCHD_R arrSchdR : arrSchdLFree) {
							if (arrSchdR.abort_flg() || !isNull(arrSchdR.rcpt_iv_mng_no())) {
								continue;
							}

							arrSchdR.base_unit_qty(arrSchdR.base_unit_qty().add(arrSchdByDlvInstNoR.base_unit_qty()));
							if (isArrCmpl(arrSchdR)) {
								arrSchdR.cmpl_flg(false);
							}

							// 納入指示明細ＮＯが一致する入荷予定
							ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, arrSchdByDlvInstNoR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
							arrSchdDtlR.peg_no(tgtUp0.peg_no());
							arrSchdDtlR.data_crud_typ(r.data_crud_typ());
							MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(arrSchdByDlvInstNoR.arr_schd_no());
							arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
							arrSchdUpd01.up1().add(arrSchdDtlR);

							// 発注明細ＮＯに紐付く方は既に電文追加されている場合を考慮して、入荷予定サービスの上り電文から取得する。
							MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
									arrSchdUpd01.up1(), arrSchdR.arr_pr_no(), null, r.purc_act_d_no(),
									r.mfg_inst_no());
							ArrSchd_DtlR arrSchdDtlR2 = null;
							for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
								if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
									arrSchdDtlR2 = tmpR;
									break;
								}
							}

							if (isNull(arrSchdDtlR2)) {
								arrSchdDtlR2 = ArrSchd_DtlR.create();
								copy(arrSchdDtlR2, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
								arrSchdDtlR2.peg_no(tgtUp0.peg_no());
								arrSchdDtlR2.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());
								arrSchdDtlR2.accpt_schd_dt(purcSchdR.purc_schd_dt());
								arrSchdUpd01.up1().add(arrSchdDtlR2);
							}
							else {
								copy(arrSchdDtlR2, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
								purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());
								arrSchdDtlR2.accpt_schd_dt(purcSchdR.purc_schd_dt());
							}

							freeExists = true;
							break;
						}

						// フリーな入荷予定がない場合
						if (!freeExists) {
							// 納入指示明細で作成した入荷予定を削除
							MST_ARR_SCHD_R oldArrSchdR = arrSchdByPoDNoL.getFirst(arrSchdByPoNoKey, null, r.dlv_inst_d_no(), r.purc_act_d_no());
							ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, oldArrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
							arrSchdDtlR.peg_no(tgtUp0.peg_no());
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							arrSchdDtlR.accpt_schd_dt(r.purc_schd_dt());
							arrSchdDtlR.sync_flg(r.sync_flg());
							arrSchdUpd01.up1().add(arrSchdDtlR);

							// 発注明細を元に入荷予定を作成
							MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
									arrSchdUpd01.up1(), oldArrSchdR.arr_pr_no(), null, r.purc_act_d_no(),
									r.mfg_inst_no());
							ArrSchd_DtlR arrSchdDtlR2 = null;
							for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
								if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
									arrSchdDtlR2 = tmpR;
									break;
								}
							}

							// 更新対象が上り電文にない場合
							if (isNull(arrSchdDtlR2)) {
								arrSchdDtlR = arrSchdDtlR.clone();
								arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								arrSchdDtlR.dlv_inst_d_no(null);
								arrSchdDtlR.arr_schd_no(null);
								if (isNull(r.purc_act_d_no())) {
									MST_PO_D_R poDR = getPoDCache().get(hdrR.po_d_no());
									arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
									arrSchdDtlR.arr_loc_cd(poDR.in_to_loc_cd());
									arrSchdDtlR.str_ln_cd(poDR.str_ln_cd());
									arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
									arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
									arrSchdDtlR.sync_flg(poDR.sync_flg());
								}
								// 再入荷予定の場合
								else {
									MST_PURC_ACT_D_R purcActDR = _purcActDL.getFirst(_purcActDKey, r.purc_act_d_no());
									arrSchdDtlR.trd_unit_cd(purcActDR.trd_unit_cd());
									arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
									arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
									arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
									arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
									arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
								}
								arrSchdUpd01.up1().add(arrSchdDtlR);
							}
							else {
								arrSchdDtlR2.base_unit_qty(arrSchdDtlR2.base_unit_qty().add(oldArrSchdR.base_unit_qty()));
							}
						}
					}
				}
			}
		}
		
		protected void crtSchdUp0(MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01) {
			// 入荷予定サービスの入荷進捗用上り電文を作成
			for (DlvInst_Chk01_HdrR r : up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no)) {
				DlvInst_Chk01_HdrR tgtUp0 = up0().getFirst(_tgtUp0Key, r.po_d_no());
				MCIndexKey arrSchdUpd01Up0Key = arrSchdUpd01.up0().createIndex(ArrPr_DtlR.$arr_pr_no);

				// 紐付く明細が処理対象外の場合は対象外
				MCIndexKey arrSchdUpd01Up1Key = arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$peg_no);
				MCList<ArrSchd_DtlR> tmpL = arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, tgtUp0.peg_no());
				if (isNull(tmpL)) {
					continue;
				}

				MST_ARR_PR_R arrPrR = getArrPrCache(r.po_d_no());
				ArrPr_DtlR arrPrDtlR = arrSchdUpd01.up0().getFirst(arrSchdUpd01Up0Key, arrPrR.arr_pr_no());
				arrPrDtlR = ArrPr_DtlR.create();
				copy(arrPrDtlR, arrPrR, createMap_ArrPr_DtlR_MST_ARR_PR_R());
				arrPrDtlR.peg_no(tgtUp0.peg_no());
				arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

				// 納入指示を集計する
				MCList<MST_DLV_INST_D_R> tmpDlvInstDL = _dlvInstDL.subList(_dlvInstKey, tgtUp0.po_d_no());
				if (tmpDlvInstDL.isEmpty()) {
					arrPrDtlR.dlv_inst_dt(null);
					arrPrDtlR.dlv_inst_qty(MCNumber.ZERO);
				}
				else {
					arrPrDtlR.dlv_inst_dt((MCDate) tmpDlvInstDL.max("DLV_INST_DT"));
					arrPrDtlR.dlv_inst_qty((MCNumber) tmpDlvInstDL.sum(MST_DLV_INST_D_R.$base_unit_qty));
				}

				arrSchdUpd01.up0().add(arrPrDtlR);
			}
		}
		
		/**
		 * 入荷予定サービス実行
		 */
		protected void callArrSchd_Upd01() {
			MSBEL_ArrSchdService.ArrSchd_Chk01 arrSchdChk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();

			_up0Key = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);
			_tgtUp0Key = up0().createIndex(DlvInst_Chk01_HdrR.$po_d_no);
			 _up1Key = up1().createIndex(DlvInst_Chk01_DtlR.$hdr_peg_no);
			 
			MCList<MST_ARR_SCHD_R> arrSchdCache = getArrSchdCache().clone();
			arrSchdCache = getNonPrmsSchdArrSchd(arrSchdCache);
			MCIndexKey arrSchdCacheIndexByDlvInstDNo = arrSchdCache.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
			MCIndexKey arrSchdCacheIndexByPoDNo = arrSchdCache.createIndex(MST_ARR_PR_R.$po_d_no);
			
			// 再入荷予定に戻すように仕入実績明細を取得
			_purcActDL = srchPurcActD();
			_purcActDKey = _purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);

			// 納入指示ヘッダ、明細を取得
			_dlvInstDL = srchDlvInstD(up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no));
			_dlvInstKey = _dlvInstDL.createIndex("PO_D_NO");

			// 納入指示明細を元に入荷予定サービスの入荷予定用上り電文を設定
			crtDlvInstSchd(arrSchdCache, arrSchdChk01, arrSchdUpd01, arrSchdCacheIndexByPoDNo, arrSchdCacheIndexByDlvInstDNo);


			// 入荷予定ＮＯのない削除データなどは除外
			MCList<ArrSchd_DtlR> tmpArrSchdUpd01Up1 = arrSchdUpd01.up1().clone();
			arrSchdUpd01.up1().clear();
			for(ArrSchd_DtlR r : tmpArrSchdUpd01Up1) {
				if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 新規で基準単位数量が０の場合は除外
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && r.base_unit_qty().isZero()) {
						continue;
					}
					arrSchdUpd01.up1().add(r);
				}
				else {
					if(!isNull(r.arr_schd_no())) {
						arrSchdUpd01.up1().add(r);
					}
				}
			}

			editArrSchdUpd01(arrSchdUpd01.up1());

			// 入荷予定の在庫識別区分などを補完する
			initCache(arrSchdUpd01.up1());
			for(ArrSchd_DtlR r : arrSchdUpd01.up1()) {
				// 取引単位違いの考慮
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				for(MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
					if(isSame(itmUnitR.unit_cd(), r.trd_unit_cd())) {
						MCNumber trdUnitQty = rvrsBaseUnitConv(
								r.base_unit_qty(), itmUnitR.conv_base_qty(),
								itmUnitR.conv_qty(), itmUnitR.dec_place(),
								itmUnitR.rnd_typ(), false);
						r.trd_unit_qty(trdUnitQty);
					}
				}

				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_MFG_INST_R mfgInstR = getMfgInstCache().get(r.mfg_inst_no());
				if(!isNull(mfgInstR) && !isNull(mfgInstR.mfg_inst_no())) {
					r.lot_no(mfgInstR.getStringNE("LOT_NO"));
					r.sublot_no(mfgInstR.getStringNE("SUBLOT_NO"));
				}
				
				DlvInst_Chk01_HdrR hdrR = up0().getFirst(_up0Key, r.peg_no());
				setArrPtnTyp(r);
				
				// 納品書NOの設定
				setDlvSlipNo(r, hdrR, arrSchdCache);
				
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				MST_PO_R poR = getPoCache(hdrR.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(hdrR.po_d_no());
				r.trd_ptn_typ(poR.trd_ptn_typ());
				MAM_PROV_UPRI_R provUpriR = getCacheProvUpri(r.arr_schd_tm(), poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3(), locR.getStringNE("sppl_cd"), poR.trd_cur_cd(), locR.wg_cd());
				r.addStringColumn("outsrc_sppl_cd", locR.sppl_cd());
				r.prov_basis_typ(locR.getStringNE("prov_basis_typ"));
				r.prov_typ(provUpriR.prov_typ());
				r.stk_arrv_bp_cd(null);
				setStkIdTyp(r, poR, poDR);
			}
			
			crtSchdUp0(arrSchdUpd01);
			
			MCIndexKey arrSchdTgtKey = arrSchdCache.createIndex(getArrSchdIndexKey());
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R arrPrL_t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(arrPrL_t);
			arrPrL_bldr.setWhere(arrPrL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL5120_MST_ARR_PR_S03", arrPrL, arrPrL_bldr, up0());
			
			adjustMinusData(arrSchdUpd01.up1(), arrSchdCache, arrSchdTgtKey, arrPrL);
			clearPrmsRcptDNo(arrSchdUpd01.up1());
			editArrSchdUpd01UpL(arrSchdUpd01.up1());
			// 更新前にチェックを実行
			arrSchdChk01.up0().setAll(arrSchdUpd01.up1());
			
			if(!arrSchdChk01.up0().isEmpty()) {
				arrSchdChk01.exec();
			}
			throwUpdErr();

			
			// 入荷予定サービスの呼出
			if(!arrSchdUpd01.up0().isEmpty()) {
				arrSchdUpd01.exec();
			}
		}
		
		/**
		 * 入荷予定の納品書NOを設定する。
		 * 
		 */
		protected void setDlvSlipNo(ArrSchd_DtlR r, DlvInst_Chk01_HdrR hdrR, MCList<MST_ARR_SCHD_R> arrSchdCache) {
			// 納品書ＮＯを初期化
			r.arr_schd().dlv_slip_no(null);
			r.arr_schd().dlv_slip_mng_no(null);
			r.arr_schd().dlv_slip_mng_seq(null);
			r.arr_schd().dlv_slip_mng_d_no(null);
			r.arr_schd().dlv_slip_mng_d_seq(null);
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				// 削除データは関係なし
				return;
			}
			
			MCIndexKey dlvInstDKey = arrSchdCache.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
			MST_ARR_SCHD_R schdR = arrSchdCache.getFirst(dlvInstDKey, r.dlv_inst_d_no());
			if (isNull(schdR)) {
				MCIndexKey arrSchdPK = arrSchdCache.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
				schdR = arrSchdCache.getFirst(arrSchdPK, r.arr_pr_no());
			}
			if (!isNull(schdR)) {
				r.arr_schd().dlv_slip_no(schdR.dlv_slip_no());
				r.arr_schd().dlv_slip_mng_no(schdR.dlv_slip_mng_no());
				r.arr_schd().dlv_slip_mng_seq(schdR.dlv_slip_mng_seq());
				r.arr_schd().dlv_slip_mng_d_no(schdR.dlv_slip_mng_d_no());
				r.arr_schd().dlv_slip_mng_d_seq(schdR.dlv_slip_mng_d_seq());
			}
		}
		
		/**
		 * キャッシュを作成
		 */
		protected void initCache(MCList<ArrSchd_DtlR> arrSchdDtlL) {
			MCList<ArrSchd_DtlR> errArrSchdL = MCList.create(ArrSchd_DtlR.class);
			// 場所マスタ
			initCacheLoc(arrSchdDtlL);
			
			// 品目単位マスタ
			initItmUnitCache(arrSchdDtlL);
			
			// 支給品単価マスタ
			MCList<MAM_PROV_UPRI_R> provUpriL = MCList.create(MAM_PROV_UPRI_R.class);
			MCIndexKey up0Key = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);
			for(ArrSchd_DtlR r : arrSchdDtlL) {
				MAM_PROV_UPRI_R provUpriR = MAM_PROV_UPRI_R.create();
				DlvInst_Chk01_HdrR up0 = up0().getFirst(up0Key, r.peg_no());
				MST_PO_R poR = getPoCache(up0.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				// キャッシュから入荷場所ＣＤに該当する場所が取得できなかった場合にエラー
				if (isNull(locR)) {
					errArrSchdL.add(r);
					continue;
				}
				r.wg_cd(locR.wg_cd());
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				r.gd_cd(getDefaultFeedStkGd().gd_cd());
				if(isNull(locR.sppl_cd())) {
					continue;
				}
				provUpriR.itm_cd(poDR.itm_cd());
				provUpriR.itm_sub1(poDR.itm_sub1());
				provUpriR.itm_sub2(poDR.itm_sub2());
				provUpriR.itm_sub3(poDR.itm_sub3());
				provUpriR.prsppl_cd(locR.sppl_cd());
				provUpriR.cur_cd(poR.trd_cur_cd());
				provUpriR.wg_cd(locR.wg_cd());
				provUpriL.add(provUpriR);
			}
			if (!errArrSchdL.isEmpty()) {
				MCList<ArrSchd_DtlR> arrSchdDtlList = errArrSchdL.groupByNE(ArrSchd_DtlR.$arr_loc_cd);
				MCMessageList msgL = new MCMessageList();

				for (ArrSchd_DtlR r : arrSchdDtlList) {
					msgL.add(new MCMessage(r, null, MAUAL0057, r.arr_loc_cd()));
				}
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}
			initCacheProvUpri(provUpriL);
		}
		/**
		 * 納期回答受領明細ＮＯをクリアする
		 * @param arrSchdUpd01Up1L
		 */
		protected void clearPrmsRcptDNo(MCList<ArrSchd_DtlR> arrSchdUpd01Up1L) {
			for (ArrSchd_DtlR r : arrSchdUpd01Up1L) {
				if(isNull(r.prms_rcpt_d_no())) {
					continue;
				}
				// 受領インボイス登録済の場合は除外
				if(!isNull(r.rcpt_iv_mng_no())) {
					continue;
				}
				// 完了、打切されている場合は除外
				MST_ARR_SCHD_R arrSchdR = getArrSchdCacheByPrmsDNo(r.prms_rcpt_d_no());
				if(!isNull(arrSchdR) && (isArrCmpl(arrSchdR) || arrSchdR.abort_flg())) {
					continue;
				}
				r.prms_rcpt_d_no(null);
			}
		}
		
		protected void editArrSchdUpd01(MCList<ArrSchd_DtlR> arrSchdUpd01L) {
			MCIndexKey dlvInstDKey = up1().createIndex(DlvInst_Chk01_DtlR.$dlv_inst_d_no);
			for (ArrSchd_DtlR r : arrSchdUpd01L) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (!isNull(r.arr_schd_no())) {
					if (hasAct(r.arr_schd())) {
						continue;
					}
				}
				if (!isNull(r.dlv_inst_d_no()) && MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					DlvInst_Chk01_DtlR dlvInstDR = up1().getFirst(dlvInstDKey, r.dlv_inst_d_no());
					if (isNull(dlvInstDR) || dlvInstDR.isStatusNone()) {
						continue;
					}
				}
				
				DlvInst_Chk01_HdrR hdrR = up0().getFirst(_up0Key, r.peg_no());
				setLotNo(r, hdrR.po_d_no());
			}
		}
		
		/**
		 * 削除の場合は、入荷進捗を更新
		 */
		protected void updArrPr() {
			// 削除のデータのみ対象とする
			MCList<DlvInst_Chk01_HdrR> tmpUp0 = MCList.create(DlvInst_Chk01_HdrR.class);
			for(DlvInst_Chk01_HdrR r : up0()) {
				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					tmpUp0.add(r);
				}
			}
			
			// 処理対象がない場合は終了
			if(tmpUp0.isEmpty()) {
				return;
			}

			MCIndexKey up0Key = tmpUp0.createIndex(DlvInst_Chk01_HdrR.$po_d_no);
			
			// 納入指示ヘッダ、明細を取得
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R dlvInstDL_t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(dlvInstDL_t);
			MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
			dlvInstDL_bldr.setSelect(dlvInstDL_t.base_unit_qty);
			dlvInstDL_bldr.addSelect(t2.po_d_no);
			dlvInstDL_bldr.addSelect(t2.dlv_inst_dt);
			dlvInstDL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			dlvInstDL_bldr.addWhereWithAnd(dlvInstDL_t.can_flg.eq(value(false)));
			dlvInstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dlvInstDL_bldr.addInnerJoin(t2,
					bracket(t2.dlv_inst_no.eq(dlvInstDL_t.dlv_inst_no)));
			dbSelect("MSBDL5120_MST_DLV_INST_D_S03", dlvInstDL, dlvInstDL_bldr,
					tmpUp0.groupBy(DlvInst_Chk01_HdrR.$po_d_no));
			MCIndexKey dlvInstKey = dlvInstDL.createIndex("PO_D_NO");

			// 入荷進捗更新準備
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			for(DlvInst_Chk01_HdrR r : tmpUp0.groupBy(DlvInst_Chk01_HdrR.$po_d_no)) {
				DlvInst_Chk01_HdrR tgtUp0 = tmpUp0.getFirst(up0Key, r.po_d_no());
				MST_ARR_PR_R arrPrR = getArrPrCache(r.po_d_no());
				
				// 納入指示を集計する
				MCList<MST_DLV_INST_D_R> tmpDlvInstDL = dlvInstDL.subList(dlvInstKey, tgtUp0.po_d_no());
				if (tmpDlvInstDL.isEmpty()) {
					arrPrR.dlv_inst_dt(null);
					arrPrR.dlv_inst_qty(MCNumber.ZERO);
				}
				else {
					arrPrR.dlv_inst_dt((MCDate) tmpDlvInstDL.max("DLV_INST_DT"));
					arrPrR.dlv_inst_qty((MCNumber) tmpDlvInstDL.sum(MST_DLV_INST_D_R.$base_unit_qty));
				}
				
				arrPrL.add(arrPrR);
			}

			// 入荷進捗を更新
			if(!arrPrL.isEmpty()) {
				MST_ARR_PR_R arrPrL_t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(arrPrL_t);
				arrPrL_bldr.setSet(arrPrL_t.dlv_inst_dt);
				arrPrL_bldr.addSet(arrPrL_t.dlv_inst_qty);
				dbUpdateKey("MSBDL5120_MST_ARR_PR_U01", arrPrL, arrPrL_bldr);
				// 購買状況区分は入荷進捗をSELECTするので、一旦更新した後で実行
				updPurcStsTyp(arrPrL);
			}
		}
				
		/**
		 * 受注状況更新サービス実行
		 */
		protected void callSloSts_Upd01() {
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			// 受注紐付発注の場合、受注状況更新サービス実行する
			MCIndexKey up1Key = up1().createIndex(DlvInst_Chk01_DtlR.$hdr_peg_no);
			for(DlvInst_Chk01_HdrR up0 : up0()) {
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				if(!isNull(poDR.slo_d_no()) && !poDR.rqst_can_flg()) {
					for(DlvInst_Chk01_DtlR r : up1().subList(up1Key, up0.peg_no())) {
						SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
						copy(sloStsDtlR, r, createMap_SloSts_DtlR_DlvInst_Chk01_DtlR());
						sloStsDtlR.slo_d_no(poDR.slo_d_no());
						if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							sloStsDtlR.biz_tm(up0.dlv_inst_dt());
						}
						sloStsIns01.up0().add(sloStsDtlR);
					}
				}
			}
			
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}
		
		/**
		 * 承認次処理済更新、承認次処理済解除を実行する
		 */
		protected void callAprvSrv() {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_R> delPoL = MCList.create(MST_PO_R.class);
			poL.addNumberColumn("peg_no");
			delPoL.addNumberColumn("peg_no");
			MBBAL_AprvService.Aprv_Upd02 aprvUpd02 = MBBAL_AprvService.crtAprv_Upd02();
			MBBAL_AprvService.Aprv_Upd03 aprvUpd03 = MBBAL_AprvService.crtAprv_Upd03();
			initAftArrPr(up0());
			for(DlvInst_Chk01_HdrR r : up0()) {
				MST_PO_R poR = getPoCache(r.po_d_no());

				if(!isNull(poR)) {
					if(poR.aprv_flg()) {
						poR.addNumberColumn("peg_no", r.peg_no());
						MST_ARR_PR_R arrPrR = _aftArrPrCache.getFirst(_aftArrPrCacheKey, r.po_d_no());
						if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !isAprvNextOpr(arrPrR)) {
							if(!delPoL.contains(poR)) {
								delPoL.add(poR);
							}
							continue;
						}

						if (!poL.contains(poR)) {
							poL.add(poR);
						}
					}
				}
			}
			
			addAll(aprvUpd02.up0(), poL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			addAll(aprvUpd03.up0(), delPoL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());

			// 承認提供サービスの承認次処理済更新を実行
			if(!aprvUpd02.up0().isEmpty()) {
				aprvUpd02.exec();
			}
			
			// 承認提供サービスの承認次処理済解除を実行
			if(!aprvUpd03.up0().isEmpty()) {
				aprvUpd03.exec();
			}
		}
		
		/**
		 * 購買帳票発行サービスの購買納品伝票・明細トランザクションの作成・更新を実行する
		 */
		protected void callPurcPrntSrvUpd01(MCList<DlvInst_Chk01_DtlR> dtlL) {
			MSBDL_PurcPrntService.PurcPrnt_Upd01 purcPrntUpd01 = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
			MCList<PurcPrnt_Upd01_HdrR> up0L = MCList.create(PurcPrnt_Upd01_HdrR.class);
			for(DlvInst_Chk01_HdrR r : up0().statusChangedList()) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				PurcPrnt_Upd01_HdrR purcPrnt01HdrR = PurcPrnt_Upd01_HdrR.create();
				copy(purcPrnt01HdrR, r, createMap_PurcPrnt_Upd01_HdrR_DlvInst_Chk01_HdrR());
				purcPrnt01HdrR.po_no(poR.po_no());
				up0L.add(purcPrnt01HdrR);
			}

			purcPrntUpd01.up0().addAll(up0L.groupBy(
					PurcPrnt_Upd01_HdrR.$po_no,
					PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no,
					PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg,
					PurcPrnt_Upd01_HdrR.$data_crud_typ,
					PurcPrnt_Upd01_HdrR.$peg_no
			));
			
			if(!purcPrntUpd01.up0().isEmpty()) {
				purcPrntUpd01.up0().setString(PurcPrnt_Upd01_HdrR.$purc_dlv_slip_src_typ, MSC_PURC_DLV_SLIP_SRC_TYP.DLV_INST.value());
				purcPrntUpd01.exec();
				
				MCIndexKey down1Idx = purcPrntUpd01.down1().createIndex(PurcPrnt_Upd01_DtlR.$dlv_inst_d_no);
				for (DlvInst_Chk01_DtlR dtlR : dtlL) {
					PurcPrnt_Upd01_DtlR down1R = purcPrntUpd01.down1().getFirst(down1Idx, dtlR.dlv_inst_d_no());
					if (!isNull(down1R)) {
						dtlR.dlv_slip_no(down1R.dlv_slip_no());
						dtlR.dlv_slip_seq(down1R.dlv_slip_seq());
						dtlR.dlv_slip_rev(down1R.dlv_slip_rev());
						dtlR.dlv_slip_mng_no(down1R.dlv_slip_mng_no());
						dtlR.dlv_slip_mng_seq(down1R.dlv_slip_mng_seq());
						dtlR.dlv_slip_d_no(down1R.dlv_slip_d_no());
						dtlR.dlv_slip_d_seq(down1R.dlv_slip_d_seq());
					}
				}
			}
		}
		/**
		 * 納入指示取消によって、発注ＮＯに紐づく全ての入荷予定が発注時の状態に戻る場合、
		 * 発注時の状態に納品書ＮＯを戻すため、納品伝票トランの更新サービスを呼ぶ
		 */
		protected void retDlvSlip() {
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			arrSchd_bldr.addSelect(t2.po_no);
			arrSchd_bldr.addInnerJoin(t1, t1.arr_pr_no.eq(t.arr_pr_no));
			arrSchd_bldr.addInnerJoin(t2, t2.po_d_no.eq(t1.po_d_no));
			arrSchd_bldr.setWhere(t2.po_no.eq(bind("po_no")));
			dbSelect(
				"MSBDL5120_MST_ARR_SCHD_S07",
				arrSchdL, arrSchd_bldr, 
				up0().statusChangedList().groupBy(DlvInst_Chk01_HdrR.$po_no)
			);
			MCIndexKey idx = arrSchdL.createIndex(MST_PO_D_R.$po_no);
			
			MSBDL_PurcPrntService.PurcPrnt_Upd01 purcPrntUpd01 = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
			for (MCList<DlvInst_Chk01_HdrR> gl : up0().groupList(DlvInst_Chk01_HdrR.$po_no)) {
				DlvInst_Chk01_HdrR glR = gl.get(0);
				
				MCList<MST_ARR_SCHD_R> wkL = arrSchdL.subList(idx, glR.po_no());
				// wkL.isEmpty->statusChangedでない発注
				boolean poOnlyFlg = wkL.isEmpty() ? false : true;
				for (MST_ARR_SCHD_R r : wkL) {
					if (!isNull(r.dlv_inst_d_no()) || !isNull(r.prms_rcpt_d_no())) {
						poOnlyFlg = false;
						break;
					}
				}
				if (poOnlyFlg) {
					PurcPrnt_Upd01_HdrR purcPrnt01HdrR = purcPrntUpd01.up0().add();
					purcPrnt01HdrR.po_no(glR.po_no());
					purcPrnt01HdrR.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value());
					purcPrnt01HdrR.dlv_slip_prnt_flg(false);
				}
				// 発注の状態に戻すか（MSBDL5200.PurcPrnt_Upd02 を呼び出す際に使用する）
				gl.setBooleanNE("dlv_slip_rvt_flg", poOnlyFlg);
			}
			if(!purcPrntUpd01.up0().isEmpty()) {
				purcPrntUpd01.exec();
			}
		}
			
		/**
		 * 購買帳票発行サービスの注文書・納入指示書・納品書発行を実行する
		 */
		protected void callPurcPrntSrvPrnt01() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 purcPrntPrnt01 = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			
			for(DlvInst_Chk01_HdrR r : up0().statusChangedList()) {
				MST_PO_R poR = getPoCache(r.po_d_no());

				// 納入指示書
				if(r.dlv_inst_print_flg()) {
					PurcPrnt_Prnt01_DlvInstR purcPrntPrnt01DlvInstR = PurcPrnt_Prnt01_DlvInstR.create();
					copy(purcPrntPrnt01DlvInstR, r, createMap_PurcPrnt_Prnt01_DlvInstR_DlvInst_Chk01_HdrR());
					purcPrntPrnt01DlvInstR.po_no(poR.po_no());
					purcPrntPrnt01.up1().add(purcPrntPrnt01DlvInstR);
				}
				purcPrntPrnt01.up3().indiv_prnt_flg(r.indiv_prnt_flg());
			}
			
			if(!purcPrntPrnt01.up1().isEmpty() || !purcPrntPrnt01.up2().isEmpty()) {
				purcPrntPrnt01.exec();
			}
		}
		protected void initPurcPrntPrnt01() {
			// 購買の納品伝票を更新する前に、仕入直送納品書の取消分を抽出する
			initPurcPrntPrnt01Cmn(
				up0().subList(r ->
					r.purc_ddlv_dlv_slip_print_flg()
					 && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				)
			);
		}
		protected void callPurcPrntUpd02() {
			callPurcPrntUpd02Cmn(up0(), up1());
		}
		protected MCList<DlvInst_Chk01_HdrR> getDlvInstL() {
			MCList<DlvInst_Chk01_HdrR> dlvInstEdiL = MCList.create(DlvInst_Chk01_HdrR.class);
			dlvInstEdiL.addBooleanColumn("del_edi_dlv_inst_flg");
			MCList<DlvInst_Chk01_HdrR> tmpUp0L = up0().subList(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, true);
			
			for (DlvInst_Chk01_HdrR r : tmpUp0L.statusChangedList()) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (isHdrDel(r)) {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
				}
				dlvInstEdiL.add(r);
			}
			
			MCList<MST_DLV_INST_R> delL = getDlvInst(dlvInstEdiL);
			MCIndexKey idxkey = delL.createIndex("po_d_no");
			
			for (MCList<DlvInst_Chk01_HdrR> l : dlvInstEdiL.groupList(DlvInst_Chk01_HdrR.$po_d_no)) {
				MST_DLV_INST_R dlvInstDelR = delL.getFirst(idxkey, l.get(0).po_d_no());
				if (isAllDel(l)) {
					if (!isNull(dlvInstDelR)) {
						l.setBoolean(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, dlvInstDelR.getBoolean("del_edi_dlv_inst_flg"));
					}
					else {
						l.setBoolean(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, false);
					}
				}
			}
			
			return dlvInstEdiL;
		}
		/**
		 * 納入指示ヘッダの更新
		 */
		protected void updDlvInst(MCList<DlvInst_Chk01_HdrR> dlvInstEdiL) {
			MCList<MST_DLV_INST_R> updL = MCList.create(MST_DLV_INST_R.class);
			for (DlvInst_Chk01_HdrR tmpUp1R : dlvInstEdiL.groupBy(DlvInst_Chk01_HdrR.$po_d_no, DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg)) {
				MST_DLV_INST_R updR = MST_DLV_INST_R.create();
				updR.po_d_no(tmpUp1R.po_d_no());
				updR.edi_flg(tmpUp1R.crnt_edi_dlv_inst_flg());
				updL.add(updR);
			}
			MST_DLV_INST_R dbc = MST_DLV_INST_R.create("T");
			execDbUpdate("MSBDL5120_MST_DLV_INST_U04", dbc, updL,
				dbc.po_d_no.eq(bindEx(MST_DLV_INST_R.$po_d_no)),
				dbc.edi_flg);
		}
		
		/**
		 * 納入指示ＩＦ送信
		 */
		protected void callDlvInstEdi(MCList<DlvInst_Chk01_HdrR> dlvInstEdiL) {
			MCList<DlvInst_Chk01_HdrR> tmpUp1L = dlvInstEdiL.subList(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, true);
			MSLAL_DlvInstSendIfService.DlvInstSendIf_Upd01 o = MSLAL_DlvInstSendIfService.crtDlvInstSendIf_Upd01();
			
			for (DlvInst_Chk01_HdrR r : tmpUp1L.statusChangedList()) {
				DlvInstSendIf_Upd01_DtlR up0R = DlvInstSendIf_Upd01_DtlR.create();
				up0R.po_d_no(r.po_d_no());
				up0R.dlv_inst_no(r.dlv_inst_no());
				up0R.data_crud_typ(r.data_crud_typ());
				up0R.ext_sys_typ(r.ext_sys_typ());
				o.up0().add(up0R);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		/**
		 * 削除データか判断
		 * 納入指示可能な数量が「0」の場合、TRUEを戻る。
		 */
		protected boolean isHdrDel(DlvInst_Chk01_HdrR r) {
			MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(r.po_d_no());
			MCIndexKey schdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
			_up1Key = up1().createIndex(DlvInst_Chk01_DtlR.$hdr_peg_no);
			MCList<DlvInst_Chk01_DtlR> up1L = up1().subList(_up1Key, r.peg_no());
			MCNumber remQty = MCNumber.ZERO;
			
			for (DlvInst_Chk01_DtlR up1R : up1L) {
				MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, up1R.dlv_inst_d_no());
				MCNumber subtractQty = MCNumber.ZERO;
				
				if (MAC_DATA_CRUD_TYP.isUPD(up1R.data_crud_typ())) {
					MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(schdR.arr_schd_no());
					MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(up1R.dlv_inst_d_no());
					MCNumber arrQty = MCNumber.max(schdR.arr_qty(), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty));
					
					// 残数分
					if ((arrQty.add(schdR.abort_qty())).gt(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty().add(purcSchdR.base_unit_abort_qty())))) {
						subtractQty = subtractQty.add(arrQty.add(schdR.abort_qty()));
					}
					else {
						subtractQty = subtractQty.add(purcSchdR.base_unit_purc_qty().add(purcSchdR.base_unit_accpt_dfct_qty().add(purcSchdR.base_unit_abort_qty())));
					}
					remQty = remQty.add(up1R.base_unit_qty().subtract(subtractQty));
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
					// 加算しないこと。
				}
				else {
					remQty = nvl(up1R.base_unit_qty(), up1R.trd_unit_qty());
				}
			}
			
			if (isSame(remQty, MCNumber.ZERO)) {
				return true;
			}
			
			return false;
		}
		
		protected boolean isAllDel(MCList<DlvInst_Chk01_HdrR> l) {
			
			MCList<MST_DLV_INST_D_R> updL = MCList.create(MST_DLV_INST_D_R.class);
			MCList<MST_DLV_INST_D_R> dlvInstDL = _dlvInstDL.subList(_dlvInstKey, l.get(0).po_d_no());
			MCList<MST_ARR_SCHD_R> arrSchdL = getArrSchdCacheByPoDNo(l.get(0).po_d_no());
			MCIndexKey schdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
			MCIndexKey dlvInstNoKey = l.createIndex(MST_DLV_INST_D_R.$dlv_inst_no);
			
			for (MCList<MST_DLV_INST_D_R> dltL : dlvInstDL.groupList(MST_DLV_INST_D_R.$dlv_inst_no)) {
				DlvInst_Chk01_HdrR hdrR = l.getFirst(dlvInstNoKey, dltL.get(0).dlv_inst_no());
				
				for (MST_DLV_INST_D_R dltR : dltL) {
					if (!isNull(hdrR)) {
						if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
							updL.add(dltR);
						}
						if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
							MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, dltR.dlv_inst_d_no());
							if (!isDlvInstExistsAct(dltR, schdR)) {
								updL.add(dltR);
							}
						}
					}
					else {
						MST_ARR_SCHD_R schdR = arrSchdL.getFirst(schdKey, dltR.dlv_inst_d_no());
						if (!isDlvInstExistsAct(dltR, schdR)) {
							updL.add(dltR);
						}
					}
				}
			}
			
			if (updL.size() == 0) {
				return true;
			}
			
			return false;
		}
		
		protected boolean isDlvInstExistsAct(MST_DLV_INST_D_R dlvInstDR, MST_ARR_SCHD_R schdR) {
			if(isNull(schdR)){
				return false;
			}
			
			MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(schdR.arr_schd_no());
			
			MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(dlvInstDR.dlv_inst_d_no());
			
			Boolean rcptIvCmplFlg = false;
			if (!isNull(rcptIvDL) && isSame(dlvInstDR.base_unit_qty(), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
				rcptIvCmplFlg = true;
			}
			
			// 受領インボイス登録済、打切済、完了の場合、対象行は変更不可
			if ((!isNull(schdR.rcpt_iv_no()) && rcptIvCmplFlg) || (!isNull(schdR.abort_qty()) && !schdR.abort_qty().isZero())
					|| (!isNull(purcSchdR.base_unit_abort_qty()) && !purcSchdR.base_unit_abort_qty().isZero())
					|| (!purcSchdR.non_purc_flg() && purcSchdR.cmpl_flg()) || (!schdR.arr_skip_flg() && schdR.cmpl_flg())){
				return true;
			}
			
			return false;
		}
		
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
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
				addColumnPathMap(ArrSchd_DtlR.$dlv_slip_d_rmrks, MST_ARR_SCHD_R.$dlv_slip_d_rmrks);
				addColumnPathMap(ArrSchd_DtlR.$sub_char1, MST_ARR_SCHD_R.$sub_char1);
				addColumnPathMap(ArrSchd_DtlR.$sub_char2, MST_ARR_SCHD_R.$sub_char2);
				addColumnPathMap(ArrSchd_DtlR.$sub_char3, MST_ARR_SCHD_R.$sub_char3);
			}
		}
		
		protected Map_SloSts_DtlR_DlvInst_Chk01_DtlR<SloSts_DtlR,DlvInst_Chk01_DtlR> createMap_SloSts_DtlR_DlvInst_Chk01_DtlR() {
			return new Map_SloSts_DtlR_DlvInst_Chk01_DtlR<SloSts_DtlR, DlvInst_Chk01_DtlR>();
		}

		public class Map_SloSts_DtlR_DlvInst_Chk01_DtlR<D extends SloSts_DtlR, S extends DlvInst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$dlv_inst_no, DlvInst_Chk01_DtlR.$dlv_inst_no);
				addColumnPathMap(SloSts_DtlR.$dlv_inst_d_no, DlvInst_Chk01_DtlR.$dlv_inst_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
				) {
					dest.unit_cd(src.trd_unit_cd());
					dest.qty(src.trd_unit_qty());
				}
				
				if(MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST.value());
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST_UPD.value());
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST_CAN.value());
				}
			}
		}
		protected Map_PurcPrnt_Upd01_HdrR_DlvInst_Chk01_HdrR<PurcPrnt_Upd01_HdrR,DlvInst_Chk01_HdrR> createMap_PurcPrnt_Upd01_HdrR_DlvInst_Chk01_HdrR() {
			return new Map_PurcPrnt_Upd01_HdrR_DlvInst_Chk01_HdrR<PurcPrnt_Upd01_HdrR, DlvInst_Chk01_HdrR>();
		}

		public class Map_PurcPrnt_Upd01_HdrR_DlvInst_Chk01_HdrR<D extends PurcPrnt_Upd01_HdrR, S extends DlvInst_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$data_crud_typ, Prms_Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no, DlvInst_Chk01_HdrR.$dlv_inst_grp_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg, DlvInst_Chk01_HdrR.$dlv_slip_print_flg);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$peg_no, DlvInst_Chk01_HdrR.$peg_no);
			}
		}
		
		protected Map_PurcPrnt_Prnt01_DlvInstR_DlvInst_Chk01_HdrR<PurcPrnt_Prnt01_DlvInstR,DlvInst_Chk01_HdrR> createMap_PurcPrnt_Prnt01_DlvInstR_DlvInst_Chk01_HdrR() {
			return new Map_PurcPrnt_Prnt01_DlvInstR_DlvInst_Chk01_HdrR<PurcPrnt_Prnt01_DlvInstR, DlvInst_Chk01_HdrR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvInstR_DlvInst_Chk01_HdrR<D extends PurcPrnt_Prnt01_DlvInstR, S extends DlvInst_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$peg_no, DlvInst_Chk01_HdrR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$err_flg, DlvInst_Chk01_HdrR.$err_flg);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$po_d_no, DlvInst_Chk01_HdrR.$po_d_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_no, DlvInst_Chk01_HdrR.$dlv_inst_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_rev, DlvInst_Chk01_HdrR.$dlv_inst_rev);
			}
		}
		
		protected Map_PurcPrnt_Prnt01_DlvSlipR_DlvInst_Chk01_HdrR<PurcPrnt_Prnt01_DlvSlipR,DlvInst_Chk01_HdrR> createMap_PurcPrnt_Prnt01_DlvSlipR_DlvInst_Chk01_HdrR() {
			return new Map_PurcPrnt_Prnt01_DlvSlipR_DlvInst_Chk01_HdrR<PurcPrnt_Prnt01_DlvSlipR, DlvInst_Chk01_HdrR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvSlipR_DlvInst_Chk01_HdrR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends DlvInst_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, DlvInst_Chk01_HdrR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$err_flg, DlvInst_Chk01_HdrR.$err_flg);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_inst_grp_no, DlvInst_Chk01_HdrR.$dlv_inst_grp_no);
			}
		}
	}
		
	/**
	 * Prms_Upd01オペレーション.<p>
	 *
	 * 納期回答受領を更新する<br>
	 */
	public class Prms_Upd01 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			// 仕入直送納品書の取消分を退避
			initPurcPrntPrnt01();
			
			// 前回入荷予定に反映していた場合、当サービスの入荷予定反映解除を行う
			callThisPrmsUpd02();
			
			// 納期回答受領ヘッダ・明細を登録
			regPrmsRcpt();
			
			// 反映も反映解除もしない場合、入荷進捗を更新
			updArrPr();
			
			// 当サービスの入荷予定反映を行う
			callThisPrmsUpd03();
			
			// 承認次処理済更新の実行
			callAprvSrv();
			
			// 納品書の登録、発行
			callPurcPrntSrvUpd01(up1());
			
			// 発注時もしくは納入指示時の状態に納品書を戻す
			retDlvSlip();
			
			// 仕入直送納品書の登録、発行
			callPurcPrntUpd02();
			
			// 下り電文を設定
			setDown();
		}
		
		protected void editUp() {
			for (Prms_Chk01_HdrR r : up0()) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				r.po_no(poR.po_no());
			}
		}
		
		/**
		 * 前回入荷予定に反映していた場合、当サービスの入荷予定反映解除を実行する
		 */
		protected void callThisPrmsUpd02() {
			MSBDL_PurcDlvDtAdjstRegService.Prms_Upd02 prmsUpd02 = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Upd02();

			// 入荷予定反映済から解除するような場合のみ対象とする。
			for(Prms_Chk01_HdrR r : up0()) {
				MST_PRMS_RCPT_R prmsRcptR = getPrmsRcptCache().get(r.prms_rcpt_no());
				if(!isNull(prmsRcptR) && prmsRcptR.arr_schd_refl_flg()) {
					if(!r.arr_schd_refl_flg() || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						prmsUpd02.up0().add(r);
					}
				}
			}
			
			if(!prmsUpd02.up0().isEmpty()) {
				prmsUpd02.exec();
			}
		}
		
		/**
		 * 納期回答受領ヘッダ・明細を登録
		 */
		protected void regPrmsRcpt() {
			MCList<MST_PRMS_RCPT_R> insPrmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			MCList<MST_PRMS_RCPT_R> updPrmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			MCList<MST_PRMS_RCPT_R> delPrmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			MCList<MST_PRMS_RCPT_D_R> insPrmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MCList<MST_PRMS_RCPT_D_R> updPrmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			updPrmsRcptDL.addNumberColumn("HDR_PEG_NO");
			MCList<MST_PRMS_RCPT_D_R> delPrmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);

			// 納期回答受領ヘッダの登録準備
			for(Prms_Chk01_HdrR r : up0()) {
				MST_PRMS_RCPT_R prmsRcptR = MST_PRMS_RCPT_R.create();
				prmsRcptR.addNumberColumn("PEG_NO", r.peg_no());
				prmsRcptR.prms_rcpt_no(r.prms_rcpt_no());
				prmsRcptR.po_d_no(r.po_d_no());
				prmsRcptR.arr_schd_refl_flg(r.arr_schd_refl_flg());
				prmsRcptR.prms_rcpt_dt(r.prms_rcpt_dt());
				prmsRcptR.intr_rmrks(r.intr_rmrks());
				prmsRcptR.sub_char1(r.sub_char1());
				prmsRcptR.sub_char2(r.sub_char2());
				prmsRcptR.sub_char3(r.sub_char3());
				prmsRcptR.edi_flg(r.edi_flg());

				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.prms_rcpt_rev(MCNumber.ONE);
					prmsRcptR.prms_rcpt_rev(r.prms_rcpt_rev());
					insPrmsRcptL.add(prmsRcptR);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_PRMS_RCPT_R cachePrmsRcptR = getPrmsRcptCache().get(r.prms_rcpt_no());
					r.prms_rcpt_rev(cachePrmsRcptR.prms_rcpt_rev().add(1));
					prmsRcptR.prms_rcpt_rev(r.prms_rcpt_rev());
					updPrmsRcptL.add(prmsRcptR);
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					prmsRcptR.can_flg(true);
					delPrmsRcptL.add(prmsRcptR);
				}
			}
			
			// 納期回答受領明細の登録準備
			for(Prms_Chk01_DtlR r : up1()) {
				Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key, r.hdr_peg_no());
				
				MST_PRMS_RCPT_D_R prmsRcptDR = MST_PRMS_RCPT_D_R.create();
				prmsRcptDR.addNumberColumn("HDR_PEG_NO", r.hdr_peg_no());
				prmsRcptDR.addNumberColumn("peg_no", r.peg_no());
				prmsRcptDR.prms_rcpt_d_no(r.prms_rcpt_d_no());
				prmsRcptDR.prms_rcpt_no(r.prms_rcpt_no());
				prmsRcptDR.prms_rcpt_rev(hdrR.prms_rcpt_rev());
				prmsRcptDR.mfg_inst_no(r.mfg_inst_no());
				prmsRcptDR.purc_act_d_no(r.purc_act_d_no());
				prmsRcptDR.trd_unit_cd(r.trd_unit_cd());
				prmsRcptDR.trd_unit_qty(r.trd_unit_qty());
				prmsRcptDR.base_unit_cd(r.base_unit_cd());
				prmsRcptDR.base_unit_qty(r.base_unit_qty());
				prmsRcptDR.prms_dlv_tm(r.prms_dlv_tm());
				prmsRcptDR.purc_schd_dt(r.purc_schd_dt());
				prmsRcptDR.sync_flg(r.sync_flg());
				prmsRcptDR.dlv_inst_d_no(r.dlv_inst_d_no());
				prmsRcptDR.intr_rmrks(r.intr_rmrks());
				prmsRcptDR.sub_char1(r.sub_char1());
				prmsRcptDR.sub_char2(r.sub_char2());
				prmsRcptDR.sub_char3(r.sub_char3());
				prmsRcptDR.prms_rmrks(r.prms_rmrks());

				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insPrmsRcptDL.add(prmsRcptDR);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updPrmsRcptDL.add(prmsRcptDR);
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					prmsRcptDR.can_flg(true);
					delPrmsRcptDL.add(prmsRcptDR);
				}
			}
			
			// 納期回答受領ヘッダ、明細の追加・更新・削除
			if(!insPrmsRcptL.isEmpty()) {
				// 発番
				doSeqCache(MSC_NUM_SYS_TYP.PRMSRCPT, insPrmsRcptL.size());
				getPrmsRCptGNo(insPrmsRcptL);
				
				MCIndexKey up0Key1 = up0().createIndex(DlvInst_Chk01_HdrR.$peg_no);
				for(MST_PRMS_RCPT_R r : insPrmsRcptL) {
					r.prms_rcpt_no(getStrSeq(MSC_NUM_SYS_TYP.PRMSRCPT));
					Prms_Chk01_HdrR up0 = up0().getFirst(up0Key1, r.getNumberNE("PEG_NO"));
					up0.prms_rcpt_no(r.prms_rcpt_no());
					up0.prms_rcpt_grp_no(r.prms_rcpt_grp_no());
				}
				MCQueryApiBuilder insPrmsRcptL_bldr = MCQueryApiBuilder.create(MST_PRMS_RCPT_R.create("T"));
				dbInsert("MSBDL5120_MST_PRMS_RCPT_I01", insPrmsRcptL, insPrmsRcptL_bldr);
			}
			if(!updPrmsRcptL.isEmpty()) {
				MST_PRMS_RCPT_R updPrmsRcptL_t = MST_PRMS_RCPT_R.create("T");
				MCQueryApiBuilder updPrmsRcptL_bldr = MCQueryApiBuilder.create(updPrmsRcptL_t);
				editUpdSetStmt(updPrmsRcptL, updPrmsRcptL_bldr, updPrmsRcptL_t);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_U01", updPrmsRcptL, updPrmsRcptL_bldr);
			}
			if(!delPrmsRcptL.isEmpty()) {
				MST_PRMS_RCPT_R delPrmsRcptL_t = MST_PRMS_RCPT_R.create("T");
				MCQueryApiBuilder delPrmsRcptL_bldr = MCQueryApiBuilder.create(delPrmsRcptL_t);
				editDelSetStmt(delPrmsRcptL, delPrmsRcptL_bldr, delPrmsRcptL_t);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_U04", delPrmsRcptL, delPrmsRcptL_bldr);
			}
			
			if(!insPrmsRcptDL.isEmpty()) {
				// 発番
				doSeqCache(MSC_NUM_SYS_TYP.PRMSRCPTD, insPrmsRcptDL.size());
				
				for(MST_PRMS_RCPT_D_R r : insPrmsRcptDL) {
					r.prms_rcpt_d_no(getStrSeq(MSC_NUM_SYS_TYP.PRMSRCPTD));
					Prms_Chk01_HdrR up0 = up0().getFirst(up0Key, r.getNumberNE("HDR_PEG_NO"));
					r.prms_rcpt_no(up0.prms_rcpt_no());
				}
				setPrmsRcptDNo(insPrmsRcptDL);
				MCQueryApiBuilder insPrmsRcptDL_bldr = MCQueryApiBuilder.create(MST_PRMS_RCPT_D_R.create("T"));
				dbInsert("MSBDL5120_MST_PRMS_RCPT_D_I01", insPrmsRcptDL, insPrmsRcptDL_bldr);
			}
			if(!updPrmsRcptDL.isEmpty()) {
				MST_PRMS_RCPT_D_R updPrmsRcptDL_t = MST_PRMS_RCPT_D_R.create("T");
				MCQueryApiBuilder updPrmsRcptDL_bldr = MCQueryApiBuilder.create(updPrmsRcptDL_t);
				editUpdSetStmt(updPrmsRcptDL, updPrmsRcptDL_bldr, updPrmsRcptDL_t);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_D_U01", updPrmsRcptDL, updPrmsRcptDL_bldr);
			}
			if(!delPrmsRcptDL.isEmpty()) {
				MST_PRMS_RCPT_D_R delPrmsRcptDL_t = MST_PRMS_RCPT_D_R.create("T");
				MCQueryApiBuilder delPrmsRcptDL_bldr = MCQueryApiBuilder.create(delPrmsRcptDL_t);
				editDelSetStmt(delPrmsRcptDL, delPrmsRcptDL_bldr, delPrmsRcptDL_t);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_D_U02", delPrmsRcptDL, delPrmsRcptDL_bldr);
			}
			
			if(!updPrmsRcptL.isEmpty()) {
				updPrmsRcptRev(updPrmsRcptL);
			}
		}
		
		/**
		 * 納期回答受領明細の納期回答受領連番を更新する。<br>
		 * 訂正時に、納期回答受領に紐づく明細が上り電文に存在しない場合もあるため、一括更新を行う。
		 * @param updPrmsRcptL 納期回答受領ヘッダ
		 */
		protected void updPrmsRcptRev(MCList<MST_PRMS_RCPT_R> updPrmsRcptL) {
			
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			for (MST_PRMS_RCPT_R prmsRcptR : updPrmsRcptL) {
				MST_PRMS_RCPT_D_R prmsRcptDR = MST_PRMS_RCPT_D_R.create();
				prmsRcptDR.prms_rcpt_no(prmsRcptR.prms_rcpt_no());
				prmsRcptDR.prms_rcpt_rev(prmsRcptR.prms_rcpt_rev());
				prmsRcptDL.add(prmsRcptDR);
			}
			MST_PRMS_RCPT_D_R prmsRcptD = MST_PRMS_RCPT_D_R.create("PRD");
			
			execDbUpdate("MSBDL5120_MST_PRMS_RCPT_D_U03", prmsRcptD, prmsRcptDL,
					prmsRcptD.prms_rcpt_no.eq(bindEx(MST_PRMS_RCPT_D_R.$prms_rcpt_no)).and(prmsRcptD.can_flg.eq(value(false))),
					prmsRcptD.prms_rcpt_rev);
		}
		
		protected void setPrmsRcptDNo(MCList<MST_PRMS_RCPT_D_R> tgtL) {
			MCIndexKey up1Idx = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no, Prms_Chk01_DtlR.$peg_no);
			for (MST_PRMS_RCPT_D_R tgtR : tgtL) {
				Prms_Chk01_DtlR up1R = up1().getFirst(up1Idx, tgtR.getNumber("HDR_PEG_NO"), tgtR.getNumber("peg_no"));
				if (!isNull(up1R)) {
					up1R.prms_rcpt_no(tgtR.prms_rcpt_no());
					up1R.prms_rcpt_d_no(tgtR.prms_rcpt_d_no());
				}
			}
		}
		
		protected void getPrmsRCptGNo(MCList<MST_PRMS_RCPT_R>prmsRcptL) {
			prmsRcptL.addStringColumn(MST_PO_R.$po_no);
			for (MST_PRMS_RCPT_R r :prmsRcptL) {
				MST_PO_R poR = getPoCache(r.po_d_no());
				r.setStringNE(MST_PO_R.$po_no, poR.po_no());
			}
			MCList<MST_PRMS_RCPT_R>[] wkGpL = prmsRcptL.groupList(MST_PO_R.$po_no);
			doSeqCache(MSC_NUM_SYS_TYP.PRMSRCPTG, wkGpL.length);
			for (MCList<MST_PRMS_RCPT_R> gpL : wkGpL) {
				gpL.setStringNE(MST_PRMS_RCPT_R.$prms_rcpt_grp_no, getStrSeq(MSC_NUM_SYS_TYP.PRMSRCPTG));
			}
			// 下り電文用に設定
			MCIndexKey idxKey = up0().createIndex(Prms_Chk01_HdrR.$prms_rcpt_no);
			for (MST_PRMS_RCPT_R r : prmsRcptL) {
				Prms_Chk01_HdrR up0R = up0().getFirst(idxKey, r.prms_rcpt_no());
				up0R.prms_rcpt_grp_no(r.prms_rcpt_grp_no());
			}
		}
		
		/**
		 * 納期回答受領ヘッダ、更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_PRMS_RCPT_R> updPrmsRcptL, MCQueryApiBuilder updPrmsRcptL_bldr, MST_PRMS_RCPT_R t) {
			updPrmsRcptL_bldr.setSet(
					t.prms_rcpt_rev,
					t.arr_schd_refl_flg,
					t.prms_rcpt_dt,
					t.intr_rmrks,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3
			);
		}
		
		/**
		 * 納期回答受領ヘッダ、取消時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_PRMS_RCPT_R> delPrmsRcptL, MCQueryApiBuilder delPrmsRcptL_bldr, MST_PRMS_RCPT_R t) {
			delPrmsRcptL_bldr.setSet(
					t.can_flg
			);
		}
		
		/**
		 * 納期回答受領明細、更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_PRMS_RCPT_D_R> updPrmsRcptDL, MCQueryApiBuilder updPrmsRcptDL_bldr, MST_PRMS_RCPT_D_R t) {
			updPrmsRcptDL_bldr.setSet(
					t.prms_rcpt_rev,
					t.mfg_inst_no,
					t.purc_act_d_no,
					t.trd_unit_qty,
					t.trd_unit_cd,
					t.base_unit_qty,
					t.base_unit_cd,
					t.prms_dlv_tm,
					t.purc_schd_dt,
					t.sync_flg,
					t.dlv_inst_d_no,
					t.intr_rmrks,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3,
					t.prms_rmrks
			);
		}
		
		/**
		 * 納期回答受領明細、更新時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_PRMS_RCPT_D_R> delPrmsRcptDL, MCQueryApiBuilder delPrmsRcptDL_bldr, MST_PRMS_RCPT_D_R t) {
			delPrmsRcptDL_bldr.setSet(
					t.can_flg
			);
		}
		
		/**
		 * 反映、反映解除しない、削除の場合は、入荷進捗を更新
		 */
		protected void updArrPr() {
			// 反映、反映解除しない、削除のデータのみ対象とする
			MCList<Prms_Chk01_HdrR> tmpUp0 = MCList.create(Prms_Chk01_HdrR.class);
			for(Prms_Chk01_HdrR r : up0()) {
				MST_PRMS_RCPT_R prmsRcptR = getPrmsRcptCache().get(r.prms_rcpt_no());
				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || !isNull(prmsRcptR) && !prmsRcptR.arr_schd_refl_flg() && !r.arr_schd_refl_flg()) {
					tmpUp0.add(r);
				}
			}
			
			// 処理対象がない場合は終了
			if(tmpUp0.isEmpty()) {
				return;
			}

			MCIndexKey up0Key = tmpUp0.createIndex(Prms_Chk01_HdrR.$po_d_no);
			
			// 納期回答受領ヘッダ、明細を取得
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = srchPrmsRcptD(tmpUp0.groupBy(Prms_Chk01_HdrR.$po_d_no));
			MCIndexKey prmsRcptKey = prmsRcptDL.createIndex("PO_D_NO");

			// 入荷進捗更新準備
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			for(Prms_Chk01_HdrR r : tmpUp0.groupBy(Prms_Chk01_HdrR.$po_d_no)) {
				Prms_Chk01_HdrR tgtUp0 = tmpUp0.getFirst(up0Key, r.po_d_no());
				MST_ARR_PR_R arrPrR = getArrPrCache(r.po_d_no());
				
				// 納期回答受領を集計する
				MCList<MST_PRMS_RCPT_D_R> tmpPrmsRcptDL = prmsRcptDL.subList(prmsRcptKey, tgtUp0.po_d_no());
				if(tmpPrmsRcptDL.isEmpty()) {
					arrPrR.prms_rcpt_dt(null);
					arrPrR.prms_dlv_dt(null);
					arrPrR.dlv_inst_prms_rcpt_dt(null);
					arrPrR.prms_rcpt_qty(MCNumber.ZERO);
					arrPrR.dlv_inst_prms_rcpt_qty(MCNumber.ZERO);
					arrPrR.prms_refl_dt(null);
					arrPrR.prms_refl_qty(MCNumber.ZERO);
					arrPrR.dlv_inst_prms_refl_dt(null);
					arrPrR.dlv_inst_prms_refl_qty(MCNumber.ZERO);
				}
				else {
					MCDate prmsRcptDt = null;
					MCDate dlvInstPrmsRcptDt = null;
					MCDate prmsDlvDt = null;
					MCDate dlvInstPrmsReflDt = null;
					MCDate prmsReflDt = null;
					MCNumber prmsRcptQty = MCNumber.ZERO;
					MCNumber dlvInstPrmsRcptQty = MCNumber.ZERO;
					MCNumber prmsReflQty = MCNumber.ZERO;
					MCNumber dlvInstPrmsReflQty = MCNumber.ZERO;
					for(MST_PRMS_RCPT_D_R prmsRcptR : tmpPrmsRcptDL) {
						if(prmsRcptR.can_flg()) {
							continue;
						}
						if (isNull(prmsDlvDt) || prmsDlvDt.lt(prmsRcptR.prms_dlv_tm())) {
							prmsDlvDt = prmsRcptR.prms_dlv_tm();
						}
						if(isNull(prmsRcptR.dlv_inst_d_no())) {
							prmsRcptQty = prmsRcptQty.add(prmsRcptR.base_unit_qty());
							if (prmsRcptR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
								prmsReflQty = prmsReflQty.add(prmsRcptR.base_unit_qty());
							}
							if(isNull(prmsRcptDt) || prmsRcptDt.lt(prmsRcptR.getDateNE("PRMS_RCPT_DT"))) {
								prmsRcptDt = prmsRcptR.getDateNE("PRMS_RCPT_DT");
							}
							if (isNull(prmsReflDt) || prmsReflDt.lt(prmsRcptR.getDateNE("ARR_SCHD_REFL_DT"))) {
								prmsReflDt = prmsRcptR.getDateNE("ARR_SCHD_REFL_DT");
							}
						}
						else {
							dlvInstPrmsRcptQty = dlvInstPrmsRcptQty.add(prmsRcptR.base_unit_qty());
							if (prmsRcptR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
								dlvInstPrmsReflQty = dlvInstPrmsReflQty.add(prmsRcptR.base_unit_qty());
							}
							if(isNull(dlvInstPrmsRcptDt) || dlvInstPrmsRcptDt.lt(prmsRcptR.getDateNE("PRMS_RCPT_DT"))) {
								dlvInstPrmsRcptDt = prmsRcptR.getDateNE("PRMS_RCPT_DT");
							}
							if (isNull(dlvInstPrmsReflDt) || dlvInstPrmsReflDt.lt(prmsRcptR.getDateNE("ARR_SCHD_REFL_DT"))) {
								dlvInstPrmsReflDt = prmsRcptR.getDateNE("ARR_SCHD_REFL_DT");
							}
						}
						
					}
					arrPrR.prms_rcpt_dt(prmsRcptDt);
					arrPrR.dlv_inst_prms_rcpt_dt(dlvInstPrmsRcptDt);
					arrPrR.prms_refl_dt(prmsReflDt);
					arrPrR.dlv_inst_prms_refl_dt(dlvInstPrmsReflDt);
					arrPrR.prms_rcpt_qty(prmsRcptQty);
					arrPrR.dlv_inst_prms_rcpt_qty(dlvInstPrmsRcptQty);
					arrPrR.prms_refl_qty(prmsReflQty);
					arrPrR.dlv_inst_prms_refl_qty(dlvInstPrmsReflQty);
					if (prmsRcptQty.add(dlvInstPrmsRcptQty).gte(arrPrR.base_unit_qty().add(arrPrR.re_arr_schd_qty()))) {
						arrPrR.prms_dlv_dt(prmsDlvDt.trunc(MCDateFieldType.DAY));
					}
					else {
						arrPrR.prms_dlv_dt(null);
					}
				}
				
				arrPrL.add(arrPrR);
			}

			// 入荷進捗を更新
			if (!arrPrL.isEmpty()) {
				MST_ARR_PR_R arrPrL_t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(arrPrL_t);
				arrPrL_bldr.setSet(arrPrL_t.prms_rcpt_dt);
				arrPrL_bldr.addSet(arrPrL_t.dlv_inst_prms_rcpt_dt);
				arrPrL_bldr.addSet(arrPrL_t.prms_refl_dt);
				arrPrL_bldr.addSet(arrPrL_t.dlv_inst_prms_refl_dt);
				arrPrL_bldr.addSet(arrPrL_t.prms_rcpt_qty);
				arrPrL_bldr.addSet(arrPrL_t.dlv_inst_prms_rcpt_qty);
				arrPrL_bldr.addSet(arrPrL_t.prms_refl_qty);
				arrPrL_bldr.addSet(arrPrL_t.dlv_inst_prms_refl_qty);
				arrPrL_bldr.addSet(arrPrL_t.prms_dlv_dt);
				dbUpdateKey("MSBDL5120_MST_ARR_PR_U02", arrPrL, arrPrL_bldr);
				// 購買状況区分は入荷進捗をSELECTするので、一旦更新した後で実行
				updPurcStsTyp(arrPrL);
			}
		}
	
		/**
		 * 当サービスの入荷予定反映を実行する
		 */
		protected void callThisPrmsUpd03() {
			MSBDL_PurcDlvDtAdjstRegService.Prms_Upd03 prmsUpd03 = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Upd03();
			MCIndexKey key = up1().createIndex(Prms_Chk01_DtlR.$hdr_peg_no);
			for(Prms_Chk01_HdrR r : up0()) {

				if(r.arr_schd_refl_flg() && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					prmsUpd03.up0().add(r);
					prmsUpd03.up1().addAll(up1().subList(key, r.peg_no()));	
				}
			}
			
			if(!prmsUpd03.up0().isEmpty()) {
				prmsUpd03.exec();
			}
		}
		
		/**
		 * 購買帳票発行サービスの購買納品伝票・明細トランザクションの作成・更新を実行する
		 */
		protected void callPurcPrntSrvUpd01(MCList<Prms_Chk01_DtlR> dtlL) {
			MSBDL_PurcPrntService.PurcPrnt_Upd01 purcPrntUpd01 = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
			MCList<PurcPrnt_Upd01_HdrR> up0L = MCList.create(PurcPrnt_Upd01_HdrR.class);
			for(Prms_Chk01_HdrR r : up0().statusChangedList()) {
				if (!isUpdArrSchd(r)) {
					continue;
				}
				MST_PO_R poR = getPoCache(r.po_d_no());
				PurcPrnt_Upd01_HdrR purcPrnt01HdrR = PurcPrnt_Upd01_HdrR.create();
				copy(purcPrnt01HdrR, r, createMap_PurcPrnt_Upd01_HdrR_Prms_Chk01_HdrR());
				purcPrnt01HdrR.po_no(poR.po_no());
				up0L.add(purcPrnt01HdrR);
			}
			purcPrntUpd01.up0().addAll(up0L.groupBy(
					PurcPrnt_Upd01_HdrR.$po_no,
					PurcPrnt_Upd01_HdrR.$prms_rcpt_grp_no,
					PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg,
					PurcPrnt_Upd01_HdrR.$data_crud_typ,
					PurcPrnt_Upd01_HdrR.$peg_no)
			);
			
			if(!purcPrntUpd01.up0().isEmpty()) {
				purcPrntUpd01.up0().setString(PurcPrnt_Upd01_HdrR.$purc_dlv_slip_src_typ, MSC_PURC_DLV_SLIP_SRC_TYP.PRMS_RCPT.value());
				purcPrntUpd01.exec();
				
				MCIndexKey down1Idx = purcPrntUpd01.down1().createIndex(PurcPrnt_Upd01_DtlR.$prms_rcpt_d_no);
				for (Prms_Chk01_DtlR dtlR : dtlL) {
					PurcPrnt_Upd01_DtlR down1R = purcPrntUpd01.down1().getFirst(down1Idx, dtlR.prms_rcpt_d_no());
					if (!isNull(down1R)) {
						dtlR.dlv_slip_no(down1R.dlv_slip_no());
						dtlR.dlv_slip_seq(down1R.dlv_slip_seq());
						dtlR.dlv_slip_rev(down1R.dlv_slip_rev());
						dtlR.dlv_slip_mng_no(down1R.dlv_slip_mng_no());
						dtlR.dlv_slip_mng_seq(down1R.dlv_slip_mng_seq());
						dtlR.dlv_slip_d_no(down1R.dlv_slip_d_no());
						dtlR.dlv_slip_d_seq(down1R.dlv_slip_d_seq());
					}
				}
			}
		}
		/**
		 * 納期回答受領取消によって、発注ＮＯに紐づく全ての入荷予定が発注時の状態に戻る場合、
		 * 発注時もしくは納入指示時の状態に納品書ＮＯを戻すため、納品伝票トランの更新サービスを呼ぶ
		 */
		protected void retDlvSlip() {
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			arrSchdL.addStringColumn(MST_DLV_INST_R.$dlv_inst_grp_no);
			arrSchdL.addStringColumn(MST_PO_D_R.$po_no);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MST_DLV_INST_D_R t3 = MST_DLV_INST_D_R.create("T3");
			MST_DLV_INST_R t4 = MST_DLV_INST_R.create("T4");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			arrSchd_bldr.addSelect(t2.po_no, t4.dlv_inst_grp_no);
			arrSchd_bldr.addInnerJoin(t1, t1.arr_pr_no.eq(t.arr_pr_no));
			arrSchd_bldr.addInnerJoin(t2, t2.po_d_no.eq(t1.po_d_no));
			arrSchd_bldr.addLeftOuterJoin(t3, t3.dlv_inst_d_no.eq(t.dlv_inst_d_no));
			arrSchd_bldr.addLeftOuterJoin(t4, t4.dlv_inst_no.eq(t3.dlv_inst_no));
			arrSchd_bldr.setWhere(t2.po_no.eq(bind("po_no")));
			dbSelect(
				"MSBDL5120_MST_ARR_SCHD_S06",
				arrSchdL, arrSchd_bldr,
				up0().statusChangedList().groupBy(Prms_Chk01_HdrR.$po_no)
			);
			MCIndexKey idx = arrSchdL.createIndex(MST_PO_D_R.$po_no);
			
			MSBDL_PurcPrntService.PurcPrnt_Upd01 purcPrntUpd01 = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
			MCList<PurcPrnt_Upd01_HdrR> up0L = MCList.create(PurcPrnt_Upd01_HdrR.class);
			for (MCList<Prms_Chk01_HdrR> gl : up0().groupList(Prms_Chk01_HdrR.$po_no)) {
				Prms_Chk01_HdrR glR = gl.get(0);
				
				MCList<MST_ARR_SCHD_R> wkL = arrSchdL.subList(idx, glR.po_no());
				// wkL.isEmpty->statusChangedでない発注
				boolean poOnlyFlg = wkL.isEmpty() ? false : true;
				boolean nonPrmsRcptFlg = wkL.isEmpty() ? false : true;
				for (MST_ARR_SCHD_R r : wkL) {
					if (!isNull(r.dlv_inst_d_no()) || !isNull(r.prms_rcpt_d_no())) {
						poOnlyFlg = false;
						if (!isNull(r.prms_rcpt_d_no())) {
							nonPrmsRcptFlg = false;
							break;
						}
					}
				}

				if (poOnlyFlg) {
					MST_ARR_SCHD_R wkR = wkL.get(0);
					PurcPrnt_Upd01_HdrR up0R = PurcPrnt_Upd01_HdrR.create();
					up0R.po_no(wkR.getStringNE(MST_PO_D_R.$po_no));
					up0R.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value());
					up0R.dlv_slip_prnt_flg(false);
					up0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					up0L.add(up0R);
				}
				else if (nonPrmsRcptFlg){
					for (MST_ARR_SCHD_R r : wkL.groupBy(MST_DLV_INST_R.$dlv_inst_grp_no)) {
						if (isNull(r.getStringNE(MST_DLV_INST_R.$dlv_inst_grp_no))) {
							continue;
						}
						MST_ARR_SCHD_R wkR = wkL.get(0);
						PurcPrnt_Upd01_HdrR up0R = PurcPrnt_Upd01_HdrR.create();
						up0R.po_no(wkR.getStringNE(MST_PO_D_R.$po_no));
						up0R.dlv_inst_grp_no(r.getStringNE(MST_DLV_INST_R.$dlv_inst_grp_no));
						up0R.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.DLV_INST.value());
						up0R.dlv_slip_prnt_flg(false);
						up0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						up0L.add(up0R);
					}
				}
				// 発注の状態に戻すか（MSBDL5200.PurcPrnt_Upd02 を呼び出す際に使用する）
				gl.setBooleanNE("dlv_slip_rvt_flg", poOnlyFlg || nonPrmsRcptFlg);
			}
			purcPrntUpd01.up0().addAll(up0L);
			if(!purcPrntUpd01.up0().isEmpty()) {
				purcPrntUpd01.exec();
			}
		}
		
		/**
		 * 承認次処理済更新、承認次処理済解除を実行する
		 */
		protected void callAprvSrv() {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_R> delPoL = MCList.create(MST_PO_R.class);
			poL.addNumberColumn("peg_no");
			delPoL.addNumberColumn("peg_no");
			MBBAL_AprvService.Aprv_Upd02 aprvUpd02 = MBBAL_AprvService.crtAprv_Upd02();
			MBBAL_AprvService.Aprv_Upd03 aprvUpd03 = MBBAL_AprvService.crtAprv_Upd03();
			initAftArrPr(up0());
			for(Prms_Chk01_HdrR r : up0()) {				
				MST_PO_R poR = getPoCache(r.po_d_no());
				if(!isNull(poR)) {
					if(poR.aprv_flg()) {
						MST_ARR_PR_R arrPrR = _aftArrPrCache.getFirst(_aftArrPrCacheKey, r.po_d_no());
						if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !isAprvNextOpr(arrPrR)) {
							if(!delPoL.contains(poR)) {
								delPoL.add(poR);
							}
							continue;
						}
						if (!poL.contains(poR)) {
							poL.add(poR);
						}
					}
				}
			}
			
			addAll(aprvUpd02.up0(), poL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			addAll(aprvUpd03.up0(), delPoL, createMap_Aprv_Chk02_Rslt1R_MST_PO_R());
			// 承認提供サービスの承認次処理済更新を実行
			if(!aprvUpd02.up0().isEmpty()) {
				aprvUpd02.exec();
			}
			
			// 承認提供サービスの承認次処理済解除を実行
			if(!aprvUpd03.up0().isEmpty()) {
				aprvUpd03.exec();
			}
		}
		
		protected void initPurcPrntPrnt01() {
			// 購買の納品伝票を更新する前に、仕入直送納品書の取消分を抽出する
			initPurcPrntPrnt01Cmn(
				up0().subList(r ->
					r.purc_ddlv_dlv_slip_print_flg()
					 && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				)
			);
		}
		
		protected void callPurcPrntUpd02() {
			callPurcPrntUpd02Cmn(up0(), up1());
		}
		
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		
		/**
		 * 入荷予定更新対象か
		 */
		protected boolean isUpdArrSchd(Prms_Chk01_HdrR r) {
			if (r.arr_schd_refl_flg()) {
				return true;
			}
			MST_PRMS_RCPT_R prmsRcptR = getPrmsRcptCache().get(r.prms_rcpt_no());
			if (!isNull(prmsRcptR) && prmsRcptR.arr_schd_refl_flg()) {
				if (!r.arr_schd_refl_flg() || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return true;
				}
			}
			return false;
		}

		
		protected Map_PurcPrnt_Upd01_HdrR_Prms_Chk01_HdrR<PurcPrnt_Upd01_HdrR,Prms_Chk01_HdrR> createMap_PurcPrnt_Upd01_HdrR_Prms_Chk01_HdrR() {
			return new Map_PurcPrnt_Upd01_HdrR_Prms_Chk01_HdrR<PurcPrnt_Upd01_HdrR, Prms_Chk01_HdrR>();
		}

		public class Map_PurcPrnt_Upd01_HdrR_Prms_Chk01_HdrR<D extends PurcPrnt_Upd01_HdrR, S extends Prms_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$data_crud_typ, Prms_Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$prms_rcpt_grp_no, Prms_Chk01_HdrR.$prms_rcpt_grp_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg, Prms_Chk01_HdrR.$dlv_slip_print_flg);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$peg_no, Prms_Chk01_HdrR.$peg_no);
			}
		}
	}
	
	/**
	 * Prms_Upd02オペレーション.<p>
	 *
	 * 入荷予定反映解除を行う<br>
	 */
	public class Prms_Upd02 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
	
		@Override
		protected void doIt() {
			// 納期回答受領ヘッダの更新
			updPrmsRcpt();
			
			// 入荷予定サービスの実行
			callArrSchd_Upd01();
			
			// 受注状況更新サービスの実行
			callSloSts_Upd01();
		}
		
		
		/**
		 * 納期回答受領ヘッダの更新
		 */
		protected void updPrmsRcpt() {
			MCList<MST_PRMS_RCPT_R> prmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			for(Prms_Chk01_HdrR up0 : up0()) {
				MST_PRMS_RCPT_R prmsRcptR = MST_PRMS_RCPT_R.create();
				prmsRcptR.prms_rcpt_no(up0.prms_rcpt_no());
				prmsRcptR.arr_schd_refl_dt(null);
				prmsRcptR.arr_schd_refl_flg(false);
				prmsRcptL.add(prmsRcptR);
			}
			
			if(!prmsRcptL.isEmpty()) {
				MST_PRMS_RCPT_R t = MST_PRMS_RCPT_R.create("T");
				MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(t);
				prmsRcptL_bldr.setSet(t.arr_schd_refl_flg);
				prmsRcptL_bldr.addSet(t.arr_schd_refl_dt);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_U02", prmsRcptL, prmsRcptL_bldr);
			}
		}
		
		/**
		 * 入荷予定サービスを実行
		 */
		protected void callArrSchd_Upd01() {
			MSBEL_ArrSchdService.ArrSchd_Chk01 arrSchdChk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$prms_rcpt_no);
			MCIndexKey up0Key2 = up0().createIndex(Prms_Chk01_HdrR.$po_d_no);
			MCIndexKey tgtUp0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			
			// 納期回答受領明細を取得
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R prmsRcptDL_t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(prmsRcptDL_t);
			MST_PRMS_RCPT_R t1 = MST_PRMS_RCPT_R.create("T1");
			prmsRcptDL.addBooleanColumn("ARR_SCHD_REFL_FLG");
			prmsRcptDL.addStringColumn(MST_PRMS_RCPT_R.$po_d_no);
			prmsRcptDL_bldr.addSelect(t1.po_d_no);
			prmsRcptDL_bldr.addSelect(t1.arr_schd_refl_flg);
			prmsRcptDL_bldr.setWhere(prmsRcptDL_t.prms_rcpt_no.eq(bind("prms_rcpt_no")));
			prmsRcptDL_bldr.addInnerJoin(t1,
					bracket(t1.prms_rcpt_no.eq(prmsRcptDL_t.prms_rcpt_no)));
			prmsRcptDL_bldr.setOrderByAsc(t1.po_d_no, t1.prms_rcpt_no,
					prmsRcptDL_t.prms_rcpt_d_no);
			dbSelect("MSBDL5120_MST_PRMS_RCPT_D_S03", prmsRcptDL, prmsRcptDL_bldr, up0());
			
			if(prmsRcptDL.isEmpty()) {
				return;
			}
			
			// 入荷予定を取得
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R arrSchdL_t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(arrSchdL_t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
			arrSchdL_bldr.removeSelect(MST_ARR_SCHD_R.$trd_unit_qty);
			arrSchdL_bldr.removeSelect(MST_ARR_SCHD_R.$base_unit_qty);
			arrSchdL_bldr.addSelect(t2.po_d_no);
			arrSchdL_bldr.addSelect(greatest(arrSchdL_t.trd_unit_qty, t3.trd_unit_schd_qty).as("trd_unit_qty"));
			arrSchdL_bldr.addSelect(greatest(arrSchdL_t.base_unit_qty, t3.base_unit_schd_qty).as("base_unit_qty"));
			arrSchdL_bldr.addSelect(t3.purc_schd_dt);
			arrSchdL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			arrSchdL_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(arrSchdL_t.arr_pr_no)));
			arrSchdL_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(arrSchdL_t.arr_pr_no)
					.and(t3.arr_schd_no.eq(arrSchdL_t.arr_schd_no))));
			dbSelect("MSBDL5120_MST_ARR_SCHD_S05", arrSchdL, arrSchdL_bldr, prmsRcptDL.groupBy(MST_PRMS_RCPT_R.$po_d_no));
			MCIndexKey arrSchdKey = arrSchdL.createIndex(getArrSchdIndexKey());
			
			// 入荷進捗を取得
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R arrPrL_t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(arrPrL_t);
			arrPrL_bldr.setWhere(arrPrL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL5120_MST_ARR_PR_S04", arrPrL, arrPrL_bldr, prmsRcptDL.groupBy(MST_PRMS_RCPT_R.$po_d_no));
			
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R dlvInstDL_t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(dlvInstDL_t);
			dlvInstDL_bldr.setWhere(dlvInstDL_t.dlv_inst_d_no.eq(bind("dlv_inst_d_no")));
			dlvInstDL_bldr.addWhereWithAnd(dlvInstDL_t.can_flg.eq(value(false)));
			dbSelect("MSBDL5120_MST_DLV_INST_D_S05", dlvInstDL, dlvInstDL_bldr, prmsRcptDL.groupBy(MST_PRMS_RCPT_D_R.$dlv_inst_d_no));
			MCIndexKey dlvInstKey = dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
			
			// 再入荷予定に戻すように仕入実績明細を取得
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			if (!prmsRcptDL.groupBy(MST_PRMS_RCPT_D_R.$purc_act_d_no).isEmpty()) {
				MST_PURC_ACT_D_R purcActDL_t = MST_PURC_ACT_D_R.create("T");
				MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(purcActDL_t);
				MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
				MST_ARR_PR_R t5 = MST_ARR_PR_R.create("T5");
				MST_PURC_ACT_R t6 = MST_PURC_ACT_R.create("T6");
				purcActDL_bldr.setWhere(purcActDL_t.purc_act_d_no.eq(bind("purc_act_d_no")));
				purcActDL_bldr.addWhereWithAnd(purcActDL_t.re_arr_flg.eq(value(true)));
				purcActDL_bldr.addWhereWithAnd(t6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				purcActDL_bldr.addInnerJoin(t4, bracket(t4.purc_schd_no.eq(purcActDL_t.purc_schd_no)));
				purcActDL_bldr.addInnerJoin(t5, bracket(t5.arr_pr_no.eq(t4.arr_pr_no)));
				purcActDL_bldr.addInnerJoin(t6,
						bracket(t6.purc_act_no.eq(purcActDL_t.purc_act_no)
								.and(t6.purc_act_seq.eq(purcActDL_t.purc_act_seq))));
				dbSelect("MSBDL5120_MST_PURC_ACT_D_S02", purcActDL, purcActDL_bldr,
						prmsRcptDL.groupBy(MST_PRMS_RCPT_D_R.$purc_act_d_no));
			}
			MCIndexKey purcActDKey = purcActDL
					.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			
			prmsRcptDL.sort(SortType.DESC, MST_PRMS_RCPT_D_R.$dlv_inst_d_no);
			
			// 納期回答受領明細でループ
			for(MST_PRMS_RCPT_D_R prmsRcptDR : prmsRcptDL) {
				// 入荷予定反映済の場合は対象外
				if(prmsRcptDR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
					continue;
				}
				
				Prms_Chk01_HdrR up0 = up0().getFirst(up0Key, prmsRcptDR.prms_rcpt_no());
				Prms_Chk01_HdrR tgtUp0 = up0().getFirst(up0Key2, up0.po_d_no());
				
				// 元の入荷予定は削除
				MCList<MST_ARR_SCHD_R> arrSchdFreeL = getFreeArrSchdL(arrSchdL, prmsRcptDR.getStringNE("PO_D_NO"), prmsRcptDR.dlv_inst_d_no(), prmsRcptDR.purc_act_d_no(), prmsRcptDR.prms_rcpt_d_no(), prmsRcptDR.mfg_inst_no());
				MST_ARR_SCHD_R arrSchdR = arrSchdFreeL.isEmpty()  ? null : arrSchdFreeL.get(0);
				
				if(isNull(arrSchdR)) {
					continue;
				}
				ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
				copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
				arrSchdDtlR.peg_no(tgtUp0.peg_no());
				arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				arrSchdUpd01.up1().add(arrSchdDtlR);
				
				// 入荷予定の戻し先を取得。既に電文にある場合を考慮
				MCList<ArrSchd_DtlR> oldArrSchdL = getArrSchdUpd01Up1(arrSchdUpd01.up1(), arrSchdR.arr_pr_no(), prmsRcptDR.dlv_inst_d_no(), arrSchdR.purc_act_d_no(), arrSchdR.mfg_inst_no());
				ArrSchd_DtlR oldArrSchdDtlR = oldArrSchdL.isEmpty() ? null : oldArrSchdL.get(0);
				// 既に上り電文にある場合
				if(!isNull(oldArrSchdDtlR)) {
					oldArrSchdDtlR.base_unit_qty(oldArrSchdDtlR.base_unit_qty().add(prmsRcptDR.base_unit_qty()));
				}
				else {
					MCList<MST_ARR_SCHD_R> arrSchdLFree = getFreeArrSchdL(arrSchdL, prmsRcptDR.getStringNE("PO_D_NO"), prmsRcptDR.dlv_inst_d_no(), prmsRcptDR.purc_act_d_no(), null, prmsRcptDR.mfg_inst_no());

					// フリーな入荷予定がある場合
					if(!arrSchdLFree.isEmpty()) {
						arrSchdLFree.sort(SortType.ASC, MST_ARR_SCHD_R.$cmpl_flg);
						boolean freeExists = false;
						for(MST_ARR_SCHD_R newArrSchdR : arrSchdLFree) {
							if (newArrSchdR.abort_flg() || !isNull(newArrSchdR.rcpt_iv_mng_no()) || !isSame(arrSchdR.dlv_inst_d_no(), newArrSchdR.dlv_inst_d_no())) {
								continue;
							}
							
							if (isArrCmpl(newArrSchdR)) {
								newArrSchdR.cmpl_flg(false);
							}
							
							arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, newArrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(newArrSchdR.arr_schd_no());
							arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
							arrSchdDtlR.base_unit_qty(arrSchdDtlR.base_unit_qty().add(prmsRcptDR.base_unit_qty()));
							
							freeExists = true;
							break;
						}
						
						// フリーな入荷予定がない場合
						if(!freeExists) {
							arrSchdDtlR = arrSchdDtlR.clone();
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							arrSchdDtlR.arr_schd_no(null);
							if(isNull(arrSchdDtlR.purc_act_d_no())) {
								if (!isNull(prmsRcptDR.dlv_inst_d_no())) {
									MST_DLV_INST_D_R dlvInstDR = dlvInstDL.getFirst(dlvInstKey, prmsRcptDR.dlv_inst_d_no());
									if (!isNull(dlvInstDR)) {
										arrSchdDtlR.mfg_inst_no(dlvInstDR.mfg_inst_no());
										arrSchdDtlR.arr_schd_tm(dlvInstDR.dlv_rqst_tm());
										arrSchdDtlR.sync_flg(dlvInstDR.sync_flg());
										arrSchdDtlR.accpt_schd_dt(dlvInstDR.purc_schd_dt());
										arrSchdDtlR.arr_loc_cd(dlvInstDR.in_to_loc_cd());
										arrSchdDtlR.str_ln_cd(dlvInstDR.str_ln_cd());
										arrSchdDtlR.purc_act_d_no(dlvInstDR.purc_act_d_no());
									}
								}
								else {
									MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
									arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
									arrSchdDtlR.arr_loc_cd(poDR.in_to_loc_cd());
									arrSchdDtlR.str_ln_cd(poDR.str_ln_cd());
									arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
									arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
									arrSchdDtlR.sync_flg(poDR.sync_flg());	
								}
							}
							else {
								MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(purcActDKey, arrSchdDtlR.purc_act_d_no());
								arrSchdDtlR.trd_unit_cd(purcActDR.trd_unit_cd());
								arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
								arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
								arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
								arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
								arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
							}
						}
					}
					// フリーな入荷予定がない場合
					else {
						arrSchdDtlR = arrSchdDtlR.clone();
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						arrSchdDtlR.arr_schd_no(null);
						// 納入指示から作成した場合
						if (!isNull(prmsRcptDR.dlv_inst_d_no())) {
							if (isNull(arrSchdDtlR.purc_act_d_no())) {
								MST_DLV_INST_D_R dlvInstDR = dlvInstDL.getFirst(dlvInstKey, prmsRcptDR.dlv_inst_d_no());
								if (!isNull(dlvInstDR)) {
									arrSchdDtlR.mfg_inst_no(dlvInstDR.mfg_inst_no());
									arrSchdDtlR.arr_schd_tm(dlvInstDR.dlv_rqst_tm());
									arrSchdDtlR.sync_flg(dlvInstDR.sync_flg());
									arrSchdDtlR.accpt_schd_dt(dlvInstDR.purc_schd_dt());
									arrSchdDtlR.arr_loc_cd(dlvInstDR.in_to_loc_cd());
									arrSchdDtlR.str_ln_cd(dlvInstDR.str_ln_cd());
									arrSchdDtlR.purc_act_d_no(dlvInstDR.purc_act_d_no());
								}
							}
							else {
								MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(purcActDKey, arrSchdDtlR.purc_act_d_no());
								arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
								arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
								arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
								arrSchdDtlR.purc_act_d_no(arrSchdDtlR.purc_act_d_no());
								arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
								arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
							}
						}
						else {
							if(isNull(arrSchdDtlR.purc_act_d_no())) {
								MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
								arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
								arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
								arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
								arrSchdDtlR.sync_flg(poDR.sync_flg());
							}
							else {
								MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(purcActDKey, arrSchdDtlR.purc_act_d_no());
								arrSchdDtlR.trd_unit_cd(purcActDR.trd_unit_cd());
								arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
								arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
								arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
								arrSchdDtlR.purc_act_d_no(arrSchdDtlR.purc_act_d_no());
								arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
								arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
							}
						}
					}
					
					arrSchdDtlR.peg_no(tgtUp0.peg_no());
					arrSchdDtlR.prms_rcpt_d_no(null);
					
					arrSchdUpd01.up1().add(arrSchdDtlR);
				}
			}
			
			
			// 入荷予定ＮＯのない削除データなどは除外
			MCList<ArrSchd_DtlR> tmpArrSchdUpd01Up1 = arrSchdUpd01.up1().clone();
			arrSchdUpd01.up1().clear();
			for(ArrSchd_DtlR r : tmpArrSchdUpd01Up1) {
				if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 新規で基準単位数量が０の場合は除外
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && r.base_unit_qty().isZero()) {
						continue;
					}
					arrSchdUpd01.up1().add(r);
				}
				else {
					if(!isNull(r.arr_schd_no())) {
						arrSchdUpd01.up1().add(r);
					}
				}
			}
			
			editArrSchdUpd01(arrSchdUpd01.up1());
			
			// 入荷予定の在庫識別区分などを補完する
			initCache(arrSchdUpd01.up1());
			for(ArrSchd_DtlR r : arrSchdUpd01.up1()) {
				// 取引単位違いの考慮
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				for(MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
					if(isSame(itmUnitR.unit_cd(), r.trd_unit_cd())) {
						MCNumber trdUnitQty = rvrsBaseUnitConv(
								r.base_unit_qty(), itmUnitR.conv_base_qty(),
								itmUnitR.conv_qty(), itmUnitR.dec_place(),
								itmUnitR.rnd_typ(), false);
						r.trd_unit_qty(trdUnitQty);
					}
				}

				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				MST_MFG_INST_R mfgInstR = getMfgInstCache().get(r.mfg_inst_no());
				
				if(!isNull(mfgInstR) && !isNull(mfgInstR.mfg_inst_no())) {
					r.lot_no(mfgInstR.getStringNE("LOT_NO"));
					r.sublot_no(mfgInstR.getStringNE("SUBLOT_NO"));
				}

				Prms_Chk01_HdrR hdrR = up0().getFirst(tgtUp0Key, r.peg_no());
				setArrPtnTyp(r);
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				MST_PO_R poR = getPoCache(hdrR.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(hdrR.po_d_no());
				r.trd_ptn_typ(poR.trd_ptn_typ());
				MAM_PROV_UPRI_R provUpriR = getCacheProvUpri(r.arr_schd_tm(), poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3(), locR.getStringNE("sppl_cd"), poR.trd_cur_cd(), locR.wg_cd());
				r.addStringColumn("outsrc_sppl_cd", locR.sppl_cd());
				r.prov_basis_typ(locR.getStringNE("prov_basis_typ"));
				r.prov_typ(provUpriR.prov_typ());
				r.stk_arrv_bp_cd(null);
				setStkIdTyp(r, poR, poDR);
			}
			
			crtArrSchdUpd01Up0(up0(), arrSchdUpd01);
			
			adjustMinusData(arrSchdUpd01.up1(), arrSchdL, arrSchdKey, arrPrL);
			editArrSchdUpd01UpL(arrSchdUpd01.up1());
			// 更新前にチェックを実行
			arrSchdChk01.up0().setAll(arrSchdUpd01.up1());
			
			// 入荷予定サービスのチェックを実行
			if(!arrSchdChk01.up0().isEmpty()) {
				arrSchdChk01.exec();
			}
			throwUpdErr();
			
			// 入荷予定サービスの呼出
			if(!arrSchdUpd01.up0().isEmpty()) {
				arrSchdUpd01.exec();
			}
		}
		
		protected void editArrSchdUpd01(MCList<ArrSchd_DtlR> arrSchdUpd01L) {
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			for (ArrSchd_DtlR r : arrSchdUpd01L) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (!isNull(r.arr_schd_no())) {
					if (hasAct(r.arr_schd())) {
						continue;
					}
				}
				
				Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key, r.peg_no());
				setLotNo(r, hdrR.po_d_no());
			}
		}
		
		/**
		 * キャッシュを作成
		 */
		protected void initCache(MCList<ArrSchd_DtlR> arrSchdDtlL) {
			MCList<ArrSchd_DtlR> errArrSchdL = MCList.create(ArrSchd_DtlR.class);
			// 場所マスタ
			initCacheLoc(arrSchdDtlL);
			
			// 品目単位マスタ
			initItmUnitCache(arrSchdDtlL);

			// 支給品単価マスタ
			MCList<MAM_PROV_UPRI_R> provUpriL = MCList.create(MAM_PROV_UPRI_R.class);
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			for(ArrSchd_DtlR r : arrSchdDtlL) {
				MAM_PROV_UPRI_R provUpriR = MAM_PROV_UPRI_R.create();
				Prms_Chk01_HdrR up0 = up0().getFirst(up0Key, r.peg_no());
				MST_PO_R poR = getPoCache(up0.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				// キャッシュから入荷場所ＣＤに該当する場所が取得できなかった場合にエラー
				if (isNull(locR)) {
					errArrSchdL.add(r);
					continue;
				}
				r.wg_cd(locR.wg_cd());
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				r.gd_cd(getDefaultFeedStkGd().gd_cd());
				if(isNull(locR.sppl_cd())) {
					continue;
				}
				provUpriR.itm_cd(poDR.itm_cd());
				provUpriR.itm_sub1(poDR.itm_sub1());
				provUpriR.itm_sub2(poDR.itm_sub2());
				provUpriR.itm_sub3(poDR.itm_sub3());
				provUpriR.prsppl_cd(locR.sppl_cd());
				provUpriR.cur_cd(poR.trd_cur_cd());
				provUpriR.wg_cd(locR.wg_cd());
				provUpriL.add(provUpriR);
			}
			if (!errArrSchdL.isEmpty()) {
				MCList<ArrSchd_DtlR> arrSchdDtlList = errArrSchdL.groupByNE(ArrSchd_DtlR.$arr_loc_cd);
				MCMessageList msgL = new MCMessageList();

				for (ArrSchd_DtlR r : arrSchdDtlList) {
					msgL.add(new MCMessage(r, null, MAUAL0057, r.arr_loc_cd()));
				}
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}
			initCacheProvUpri(provUpriL);
		}
		
		/**
		 * 受注状況更新サービス実行
		 */
		protected void callSloSts_Upd01() {
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			// 受注紐付発注の場合、受注状況更新サービス実行する
			for(Prms_Chk01_HdrR up0 : up0()) {
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				if(!isNull(poDR.slo_d_no()) && !poDR.rqst_can_flg()) {
					SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
					copy(sloStsDtlR, up0, createMap_SloSts_DtlR_Prms_Chk01_HdrR());
					sloStsDtlR.po_no(poDR.po_no());
					sloStsDtlR.slo_d_no(poDR.slo_d_no());
					sloStsIns01.up0().add(sloStsDtlR);
				}
			}
			
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}
		
		protected Map_SloSts_DtlR_Prms_Chk01_HdrR<SloSts_DtlR,Prms_Chk01_HdrR> createMap_SloSts_DtlR_Prms_Chk01_HdrR() {
			return new Map_SloSts_DtlR_Prms_Chk01_HdrR<SloSts_DtlR, Prms_Chk01_HdrR>();
		}

		public class Map_SloSts_DtlR_Prms_Chk01_HdrR<D extends SloSts_DtlR, S extends Prms_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$po_d_no, Prms_Chk01_HdrR.$po_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_PRMS_RCPT_CAN.value());
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
				addColumnPathMap(ArrSchd_DtlR.$dlv_slip_mng_no, MST_ARR_SCHD_R.$dlv_slip_mng_no);
				addColumnPathMap(ArrSchd_DtlR.$dlv_slip_mng_seq, MST_ARR_SCHD_R.$dlv_slip_mng_seq);
				addColumnPathMap(ArrSchd_DtlR.$dlv_slip_mng_d_no, MST_ARR_SCHD_R.$dlv_slip_mng_d_no);
				addColumnPathMap(ArrSchd_DtlR.$dlv_slip_mng_d_seq, MST_ARR_SCHD_R.$dlv_slip_mng_d_seq);
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
	}
	/**
	 * Prms_Upd03オペレーション.<p>
	 *
	 * 入荷予定反映を行う<br>
	 */
	public class Prms_Upd03 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.Prms_Upd03 {

		MCList<MST_PRMS_RCPT_R> _prmsRcptL;

		MCList<MST_PRMS_RCPT_D_R> _prmsRcptDL;
		MCIndexKey _prmsRcptPK;

		MCList<MST_ARR_SCHD_R> _arrSchdL;

		MCIndexKey _arrSchdKey;
		MCIndexKey _arrSchdKeyPrms;
		MCIndexKey _arrSchdPK;

		MCList<MST_ARR_PR_R> _arrPrL;

		MCList<MST_PURC_SCHD_R> _purcSchdL;

		MCIndexKey _purcSchdKey;

		MCList<MST_PURC_ACT_D_R> _purcActDL;

		MCIndexKey _purcActDKey;

		MCList<MST_DLV_INST_D_R> _dlvInstDL;

		MCIndexKey _dlvInstKey;
		MCIndexKey _dlvInstKey2;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 納期回答受領ヘッダの更新
			updPrmsRcpt();
			
			// 入荷予定サービスの実行
			callArrSchd_Upd01();
			
			// 受注状況更新サービスの実行
			callSloSts_Upd01();			
		}
		
		/**
		 * 納期回答受領ヘッダの更新
		 */
		protected void updPrmsRcpt() {
			MCList<MST_PRMS_RCPT_R> prmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			for(Prms_Chk01_HdrR up0 : up0()) {
				MST_PRMS_RCPT_R prmsRcptR = MST_PRMS_RCPT_R.create();
				prmsRcptR.prms_rcpt_no(up0.prms_rcpt_no());
				prmsRcptR.arr_schd_refl_dt(up0.arr_schd_refl_dt());
				prmsRcptR.arr_schd_refl_flg(true);
				prmsRcptL.add(prmsRcptR);
			}
			
			if(!prmsRcptL.isEmpty()) {
				MST_PRMS_RCPT_R t = MST_PRMS_RCPT_R.create("T");
				MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(t);
				prmsRcptL_bldr.setSet(t.arr_schd_refl_flg);
				prmsRcptL_bldr.addSet(t.arr_schd_refl_dt);
				dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_U03", prmsRcptL, prmsRcptL_bldr);
			}
		}
		
		protected MCList<MST_ARR_SCHD_R> srchSchd(MCList<MST_PRMS_RCPT_R> prmsRcptL) {
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
			arrSchdL_bldr.removeSelect(MST_ARR_SCHD_R.$trd_unit_qty);
			arrSchdL_bldr.removeSelect(MST_ARR_SCHD_R.$base_unit_qty);
			arrSchdL_bldr.addSelect(greatest(t.trd_unit_qty, t3.trd_unit_schd_qty).as("trd_unit_qty"));
			arrSchdL_bldr.addSelect(greatest(t.base_unit_qty, t3.base_unit_schd_qty).as("base_unit_qty"));
			arrSchdL_bldr.addSelect(t2.po_d_no);
			arrSchdL_bldr.addSelect(t3.purc_schd_dt);
			arrSchdL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
			arrSchdL_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
			arrSchdL_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t.arr_pr_no)
					.and(t3.arr_schd_no.eq(t.arr_schd_no))));
			dbSelect("MSBDL5120_MST_ARR_SCHD_S06", arrSchdL, arrSchdL_bldr, prmsRcptL);
			return arrSchdL;
		}
		
		protected MCList<MST_ARR_PR_R> srchArrPr(MCList<MST_PRMS_RCPT_R> prmsRcptL) {
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL5120_MST_ARR_PR_S05", arrPrL, arrPrL_bldr, prmsRcptL);
			return arrPrL;
		}
		
		protected MCList<MST_PURC_SCHD_R> srchPurcSchd(MCList<MST_ARR_SCHD_R> arrSchdL) {
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);
			purcSchdL_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBDL5120_MST_PURC_SCHD_S04", purcSchdL, purcSchdL_bldr, arrSchdL);
			return purcSchdL;
		}
		
		protected MCList<MST_PURC_ACT_D_R> srchPurcAct(MCList<MST_ARR_SCHD_R> arrSchdL) {

			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			if (!arrSchdL.groupBy(MST_ARR_SCHD_R.$purc_act_d_no).isEmpty()) {
				MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
				MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
				MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
				MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
				MST_PURC_ACT_R t4 = MST_PURC_ACT_R.create("T4");
				purcActDL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
				purcActDL_bldr.addWhereWithAnd(t.re_arr_flg.eq(value(true)));
				purcActDL_bldr.addWhereWithAnd(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				purcActDL_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
				purcActDL_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t2.arr_pr_no)));
				purcActDL_bldr.addInnerJoin(t4, bracket(t4.purc_act_no.eq(t.purc_act_no)
						.and(t4.purc_act_seq.eq(t.purc_act_seq))));
				dbSelect("MSBDL5120_MST_PURC_ACT_D_S03", purcActDL, purcActDL_bldr,
						arrSchdL.groupBy(MST_ARR_SCHD_R.$purc_act_d_no));
			}
			return purcActDL;
		}

		MSBEL_ArrSchdService.ArrSchd_Chk01 _arrSchdChk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
		MSBEL_ArrSchdService.ArrSchd_Upd01 _arrSchdUpd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		MCIndexKey _up0Key;
		MCIndexKey _tgtUp0Key;
		MCIndexKey _up1Key;
		
		protected void sortDelFirst() {
			MCList<MST_PRMS_RCPT_D_R> insL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MCList<MST_PRMS_RCPT_D_R> updL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MCList<MST_PRMS_RCPT_D_R> delL = MCList.create(MST_PRMS_RCPT_D_R.class);

			for (MST_PRMS_RCPT_D_R prmsRcptDR : _prmsRcptDL) {

				Prms_Chk01_DtlR r = up1().getFirst(_up1Key, prmsRcptDR.prms_rcpt_d_no());
				// 上り電文に存在しないデータはステータスがNONE。この場合は数量に変更がないので、
				// 新規行と同じ順で処理する
				if (isNull(r)) {
					insL.add(prmsRcptDR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(prmsRcptDR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ARR_SCHD_R schdR = _arrSchdL.getFirst(_arrSchdKeyPrms, prmsRcptDR.prms_rcpt_d_no());
					if (!isNull(schdR)) {
						// 数量減を先に処理
						if (schdR.base_unit_qty().gte(r.base_unit_qty())) {
							delL.add(prmsRcptDR);
						}
						else {
							updL.add(prmsRcptDR);
						}
					}
					else {
						updL.add(prmsRcptDR);
					}
				}
				else {
					insL.add(prmsRcptDR);
				}
			}
			_prmsRcptDL.setAll(delL);
			_prmsRcptDL.addAll(updL);
			_prmsRcptDL.addAll(insL);
		}
		/**
		 * 入荷予定サービスを実行
		 */
		protected void callArrSchd_Upd01() {
			
			_up0Key = up0().createIndex(Prms_Chk01_HdrR.$po_d_no);
			_tgtUp0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			_up1Key = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);

			// 納期回答受領ヘッダを取得
			_prmsRcptL = srchPrmsRcpt(up0());

			// 納期回答受領明細を取得
			_prmsRcptDL = srchPrmsRcptD(up0());
			if (_prmsRcptDL.isEmpty()) {
				return;
			}
			// 入荷予定を取得
			_arrSchdL = srchSchd(_prmsRcptL);
			_arrSchdKey = _arrSchdL.createIndex(getArrSchdIndexKey());
			_arrSchdKeyPrms = _arrSchdL.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no);
			_arrSchdPK = _arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			// 削除、更新で数量が減る明細から処理しないと、入荷予定を更新する数量が正しく計算できない
			sortDelFirst();
			_prmsRcptPK = _prmsRcptDL.createIndex(MST_PRMS_RCPT_D_R.$prms_rcpt_d_no);
			// 入荷進捗を取得
			_arrPrL = srchArrPr(_prmsRcptL);
			// 仕入予定を取得
			_purcSchdL = srchPurcSchd(_arrSchdL);
			_purcSchdKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			// 再入荷予定に戻すように仕入実績明細を取得
			_purcActDL = srchPurcAct(_arrSchdL);
			_purcActDKey = _purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			_dlvInstDL = srchDlvInstD(up0().groupBy(DlvInst_Chk01_HdrR.$po_d_no));
			_dlvInstKey = _dlvInstDL.createIndex("PO_D_NO");
			_dlvInstKey2 = _dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
			
			// 納期回答受領明細が削除されているものから作成されている入荷予定は削除
			delArrSchdPrms();
			delArrSchdDlvInst();
			
			// 納入指示明細を元に入荷予定を登録、更新
			crtArrSchdDlvInst();
			
			// 入荷予定ＮＯのない削除データなどは除外
			MCList<ArrSchd_DtlR> tmpArrSchdUpd01Up1 = _arrSchdUpd01.up1().clone();
			_arrSchdUpd01.up1().clear();
			for(ArrSchd_DtlR r : tmpArrSchdUpd01Up1) {
				if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 新規で基準単位数量が０の場合は除外
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && r.base_unit_qty().isZero()) {
						continue;
					}
					
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						boolean delExists = false;
						MCIndexKey arrSchdUpd01Up1Key = _arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_schd_no);
						for (ArrSchd_DtlR up1R : _arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, r.arr_schd_no())) {
							if(MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
								delExists = true;
							}
						}
						// 既に上り電文に削除データが存在するか
						if (delExists) {
							r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							r.arr_schd_no(null);
						}
					}
					_arrSchdUpd01.up1().add(r);
				}
				else {
					if(!isNull(r.arr_schd_no())) {
						_arrSchdUpd01.up1().add(r);
					}
				}
			}

			// 入荷予定サービスの上り電文編集
			editArrSchd();
			
			editArrSchdUpd01UpL(_arrSchdUpd01.up1());
			for (ArrSchd_DtlR dtlR : _arrSchdUpd01.up1()) {
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					MST_ARR_SCHD_R arrSchdR = getArrSchdCacheByPrmsDNo(dtlR.prms_rcpt_d_no());
					MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByPrmsRcptDNo(dtlR.prms_rcpt_d_no());
					
					if (!isNull(dtlR.prms_rcpt_d_no()) && !isNull(rcptIvDL) && !isNull(arrSchdR)) {
						if (rcptIvDL.size() == 1) {
							dtlR.rcpt_iv_no(rcptIvDL.get(0).getStringNE("rcpt_iv_no"));
							dtlR.rcpt_iv_mng_no(rcptIvDL.get(0).rcpt_iv_mng_no());
							dtlR.rcpt_iv_itm_nm(rcptIvDL.get(0).iv_itm_nm());
						}
					}
				}
			}
			// 更新前にチェックを実行
			_arrSchdChk01.up0().setAll(_arrSchdUpd01.up1());
			
			if(!_arrSchdChk01.up0().isEmpty()) {
				_arrSchdChk01.exec();
			}
			throwUpdErr();

			
			// 入荷予定サービスの呼出
			if(!_arrSchdUpd01.up0().isEmpty()) {
				_arrSchdUpd01.exec();
			}
		}

		protected void delArrSchdPrms() {

			for (MST_ARR_SCHD_R r : _arrSchdL) {
				if (!isNull(r.prms_rcpt_d_no())) {
					MST_PRMS_RCPT_D_R prmsRcptDR = _prmsRcptDL.getFirst(_prmsRcptPK, r.prms_rcpt_d_no());
					
					if (isNull(prmsRcptDR) || prmsRcptDR.can_flg()) {
						Prms_Chk01_HdrR up0 = up0().getFirst(_up0Key, r.getStringNE("PO_D_NO"));
						// 納入指示明細に対応する入荷予定に削除分の数量を戻す
						String tgtDlvInstDNo = prmsRcptDR.dlv_inst_d_no();

						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, r, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
						arrSchdDtlR.peg_no(up0.peg_no());
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						_arrSchdUpd01.up1().add(arrSchdDtlR);

						// 削除分を戻すため入荷予定を更新
						arrSchdDtlR = arrSchdDtlR.clone();
						MCList<MST_ARR_SCHD_R> arrSchdLFree = _arrSchdL.subList(_arrSchdKey, r.getStringNE("PO_D_NO"), tgtDlvInstDNo,
								r.purc_act_d_no(), null, r.mfg_inst_no());
						if (arrSchdLFree.isEmpty()) {
							arrSchdLFree = _arrSchdL.subList(_arrSchdKey, r.getStringNE("PO_D_NO"), tgtDlvInstDNo,
									r.purc_act_d_no(), null, null);
						}

						// フリーな入荷予定がない場合
						if (arrSchdLFree.isEmpty()) {
							editArrSchdNoTgt(r, arrSchdDtlR, up0, tgtDlvInstDNo);
						}
						// フリーな入荷予定がある場合
						else {
							boolean freeExists = false;
							for (MST_ARR_SCHD_R arrSchdR : arrSchdLFree) {
								if (isArrCmpl(arrSchdR) || arrSchdR.abort_flg() || !isNull(arrSchdR.rcpt_iv_mng_no())) {
									continue;
								}

								MCIndexKey arrSchdUpd01Up1Key = _arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_schd_no);
								ArrSchd_DtlR tmpArrSchdDtlR = _arrSchdUpd01.up1().getFirst(arrSchdUpd01Up1Key, arrSchdR.arr_schd_no());

								// 既に入荷予定サービスの上り電文にあるか
								if (isNull(tmpArrSchdDtlR)) {
									copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
									arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
									MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdKey, arrSchdR.arr_schd_no());
									arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
									arrSchdDtlR.base_unit_qty(arrSchdDtlR.base_unit_qty().add(r.base_unit_qty()));
									_arrSchdUpd01.up1().add(arrSchdDtlR);
								}
								else {
									tmpArrSchdDtlR.base_unit_qty(tmpArrSchdDtlR.base_unit_qty().add(r.base_unit_qty()));
								}

								freeExists = true;
								break;
							}

							// フリーな入荷予定がない場合
							if (!freeExists) {
								editArrSchdNoTgt(r, arrSchdDtlR, up0, tgtDlvInstDNo);
							}
						}
					}
				}
			}

		}


		
		protected void delArrSchdDlvInst() {
			for (MST_ARR_SCHD_R r : _arrSchdL) {
				if (!isNull(r.dlv_inst_d_no())) {

					Prms_Chk01_HdrR up0 = up0().getFirst(_up0Key, r.getStringNE("PO_D_NO"));
					ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
					if (!isNull(r.prms_rcpt_d_no())) {
						continue;
					}
					// 受領インボイス登録済は除外
					if (!isNull(r.rcpt_iv_no())) {
						continue;
					}
					// 完了している場合は除外
					if (isArrCmpl(r)) {
						continue;
					}
					// 仕入予定が完了している場合も除外。VMIや無償受給を考慮
					MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdKey, r.arr_schd_no());
					if (!purcSchdR.non_purc_flg()) {
						if (purcSchdR.cmpl_flg() || purcSchdR.abort_flg() || isSame(purcSchdR.base_unit_purc_qty(), purcSchdR.base_unit_schd_qty())) {
							continue;
						}
					}

					ArrSchd_DtlR tgtR = _arrSchdUpd01.up1().getFirst(ArrSchd_DtlR.$arr_schd_no, r.arr_schd_no());
					copy(arrSchdDtlR, r, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
					arrSchdDtlR.peg_no(up0.peg_no());

					MCNumber remQty = MCNumber.max(r.arr_qty(), r.purc_qty());
					// 回答なしの納入指示から作成される入荷予定が上り電文に存在する場合はDBからではなく
					// 上り電文から削除する
					if (!isNull(tgtR)) {
						if (r.arr_qty().isZero() && r.purc_qty().isZero()) {
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							// 上り電文から削除する数量を他の入荷予定に移すので、数量を保持しておく
							r.base_unit_qty(tgtR.base_unit_qty());
							_arrSchdUpd01.up1().remove(tgtR);

						}
						else {
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							arrSchdDtlR.base_unit_qty(remQty);
							r.base_unit_qty(tgtR.base_unit_qty().subtract(arrSchdDtlR.base_unit_qty()));
						}
					}
					else {
						if (r.arr_qty().isZero() && r.purc_qty().isZero()) {
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						else {
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							arrSchdDtlR.base_unit_qty(remQty);
						}
						arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());

					}

					_arrSchdUpd01.up1().add(arrSchdDtlR);

					// 削除分を戻すため入荷予定を更新
					arrSchdDtlR = arrSchdDtlR.clone();

					MCList<MST_ARR_SCHD_R> arrSchdLFree = getFreeArrSchdL(_arrSchdL, r.getStringNE("PO_D_NO"), r.dlv_inst_d_no(), r.purc_act_d_no(), null, r.mfg_inst_no());
					
					// フリーな入荷予定がない場合
					if (arrSchdLFree.isEmpty()) {
						MCIndexKey arrSchdUpd01Up1Key = _arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_pr_no, ArrSchd_DtlR.$purc_act_d_no, ArrSchd_DtlR.$dlv_inst_d_no,
								ArrSchd_DtlR.$prms_rcpt_d_no, ArrSchd_DtlR.$mfg_inst_no);
						MCList<ArrSchd_DtlR> arrSchdDtlL = _arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, r.arr_pr_no(), r.purc_act_d_no(), null, null, r.mfg_inst_no());
						ArrSchd_DtlR tmpArrSchdDtlR = null;
						for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
							if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
								tmpArrSchdDtlR = tmpR;
								break;
							}
						}

						// まだ入荷予定サービスの上り電文にない場合
						if (isNull(tmpArrSchdDtlR)) {
							editArrSchdNoUp(up0, tmpArrSchdDtlR, r, remQty, true);
						}
						else {
							tmpArrSchdDtlR.base_unit_qty(tmpArrSchdDtlR.base_unit_qty().add(r.base_unit_qty().subtract(remQty)));
						}
					}
					// フリーな入荷予定がある場合
					else {
						boolean freeExists = false;
						for (MST_ARR_SCHD_R arrSchdR : arrSchdLFree) {
							if (isArrCmpl(arrSchdR) || arrSchdR.abort_flg() || !isNull(arrSchdR.rcpt_iv_mng_no())) {
								continue;
							}

							MCIndexKey arrSchdUpd01Up1Key = _arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_schd_no);
							ArrSchd_DtlR tmpArrSchdDtlR = _arrSchdUpd01.up1().getFirst(arrSchdUpd01Up1Key, arrSchdR.arr_schd_no());

							// まだ入荷予定サービスの上り電文にない場合
							if (isNull(tmpArrSchdDtlR)) {
								copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
								arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								MST_PURC_SCHD_R purcSchdR2 = _purcSchdL.getFirst(_purcSchdKey, arrSchdR.arr_schd_no());
								arrSchdDtlR.accpt_schd_dt(purcSchdR2.purc_schd_dt());

								arrSchdDtlR.base_unit_qty(arrSchdDtlR.base_unit_qty().add(r.base_unit_qty()).subtract(remQty));

								_arrSchdUpd01.up1().add(arrSchdDtlR);
							}
							else {
								if (MAC_DATA_CRUD_TYP.isDEL(tmpArrSchdDtlR.data_crud_typ())) {
									continue;
								}
								tmpArrSchdDtlR.base_unit_qty(tmpArrSchdDtlR.base_unit_qty().add(r.base_unit_qty()).subtract(remQty));

							}

							freeExists = true;
						}

						// フリーな入荷予定がない場合
						if (!freeExists) {
							MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
									_arrSchdUpd01.up1(), r.arr_pr_no(), r.dlv_inst_d_no(), r.purc_act_d_no(),
									r.mfg_inst_no());
							ArrSchd_DtlR tmpArrSchdDtlR = null;
							for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
								if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
									tmpArrSchdDtlR = tmpR;
									break;
								}
							}

							// 入荷予定サービスの上り電文に追加している場合を考慮
							if (isNull(tmpArrSchdDtlR)) {
								editArrSchdNoUp(up0, tmpArrSchdDtlR, r, remQty, true);
							}
							else {
								tmpArrSchdDtlR.base_unit_qty(tmpArrSchdDtlR.base_unit_qty().add(r.base_unit_qty()).subtract(remQty));
							}
						}
					}

				}
			}
		}

		
		protected void crtArrSchdDlvInst() {
			MCIndexKey idxArrSchdL = _arrSchdL.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no);
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _prmsRcptDL) {
				// 入荷予定未反映の場合は除外
				if (!prmsRcptDR.getBooleanNE("ARR_SCHD_REFL_FLG") || prmsRcptDR.can_flg()) {
					continue;
				}
				// 完了している入荷予定に紐づいている場合は、無視する
				MST_ARR_SCHD_R tmpR = _arrSchdL.getFirst(idxArrSchdL, prmsRcptDR.prms_rcpt_d_no());
				if (!isNull(tmpR) && isCmpl(tmpR)) {
					continue;
				}

				ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();

				Prms_Chk01_HdrR tgtUp0 = up0().getFirst(_up0Key, prmsRcptDR.getStringNE("PO_D_NO"));

				// 該当の納入指示明細から作成された入荷予定がある場合は更新
				MST_ARR_SCHD_R arrSchdByPrmsDNoR = getArrSchdCacheByPrmsDNo(prmsRcptDR.prms_rcpt_d_no());
				// 納期回答受領明細から作成した入荷予定がない場合
				if (isNull(arrSchdByPrmsDNoR)) {
					// 納入指示明細ＮＯが指定されている場合
					if (!isNull(prmsRcptDR.dlv_inst_d_no())) {
						MST_PO_D_R poDR = getPoDCache().get(tgtUp0.po_d_no());
						MST_ARR_PR_R arrPrR = getArrPrCache(tgtUp0.po_d_no());
						MCList<ArrSchd_DtlR> arrSchdDtlL;

						arrSchdDtlL = getArrSchdUpd01Up1(_arrSchdUpd01.up1(),
								arrPrR.arr_pr_no(), prmsRcptDR.dlv_inst_d_no(), prmsRcptDR.purc_act_d_no(), 
								prmsRcptDR.mfg_inst_no());
						MCNumber reqQty = prmsRcptDR.base_unit_qty();
						// 入荷予定の消込を行う
						arrSchdDtlR = crtArrSchdUpdUp1(arrSchdDtlL, reqQty,
								tgtUp0.peg_no(), _arrSchdL, poDR, arrPrR, prmsRcptDR,
								_arrSchdUpd01, _purcActDL);

					}
					// 納入指示明細ＮＯが指定されていない場合
					else {
						MCList<MST_ARR_SCHD_R> arrSchdLFree = _arrSchdL.subList(_arrSchdKey, prmsRcptDR.getStringNE("PO_D_NO"), null,
								prmsRcptDR.purc_act_d_no(), null, prmsRcptDR.mfg_inst_no());
						if (arrSchdLFree.isEmpty()) {
							arrSchdLFree = _arrSchdL.subList(_arrSchdKey, prmsRcptDR.getStringNE("PO_D_NO"), null,
									prmsRcptDR.purc_act_d_no(), null, null);
						}
						MCNumber reqQty = prmsRcptDR.base_unit_qty();

						MST_ARR_PR_R arrPrR = getArrPrCache(tgtUp0.po_d_no());
						MST_PO_D_R poDR = getPoDCache().get(tgtUp0.po_d_no());
						MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
								_arrSchdUpd01.up1(), arrPrR.arr_pr_no(), prmsRcptDR.dlv_inst_d_no(),
								prmsRcptDR.purc_act_d_no(), prmsRcptDR.mfg_inst_no());
						// 入荷予定の消込を行う
						arrSchdDtlR = crtArrSchdUpdUp1(arrSchdDtlL, reqQty,
								tgtUp0.peg_no(), _arrSchdL, poDR, arrPrR, prmsRcptDR,
								_arrSchdUpd01, _purcActDL);
					}

					// 納期回答受領明細を元にした入荷予定を追加
					arrSchdDtlR = arrSchdDtlR.clone();
					arrSchdDtlR.prms_rcpt_d_no(prmsRcptDR.prms_rcpt_d_no());
					arrSchdDtlR.purc_act_d_no(prmsRcptDR.purc_act_d_no());
					arrSchdDtlR.dlv_inst_d_no(prmsRcptDR.dlv_inst_d_no());
					arrSchdDtlR.mfg_inst_no(prmsRcptDR.mfg_inst_no());
					arrSchdDtlR.arr_schd_tm(prmsRcptDR.prms_dlv_tm());
					arrSchdDtlR.accpt_schd_dt(prmsRcptDR.purc_schd_dt());
					arrSchdDtlR.sync_flg(prmsRcptDR.sync_flg());
					arrSchdDtlR.trd_unit_cd(prmsRcptDR.trd_unit_cd());
					arrSchdDtlR.trd_unit_qty(prmsRcptDR.trd_unit_qty());
					arrSchdDtlR.base_unit_cd(prmsRcptDR.base_unit_cd());
					arrSchdDtlR.base_unit_qty(prmsRcptDR.base_unit_qty());
					arrSchdDtlR.arr_schd_no(null);
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

					// 納入指示明細に対する回答の場合
					if (!isNull(prmsRcptDR.dlv_inst_d_no())) {
						MST_DLV_INST_D_R dlvInstDR = getDlvInstDCache().get(prmsRcptDR.dlv_inst_d_no());
						arrSchdDtlR.arr_loc_cd(dlvInstDR.in_to_loc_cd());
						arrSchdDtlR.str_ln_cd(dlvInstDR.str_ln_cd());
					}

					_arrSchdUpd01.up1().add(arrSchdDtlR);
				}
				// 納期回答受領明細から作成した入荷予定がある場合
				else {
					arrSchdDtlR = ArrSchd_DtlR.create();
					copy(arrSchdDtlR, arrSchdByPrmsDNoR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
					arrSchdDtlR.peg_no(tgtUp0.peg_no());
					arrSchdDtlR.arr_schd_tm(prmsRcptDR.prms_dlv_tm());
					arrSchdDtlR.accpt_schd_dt(prmsRcptDR.purc_schd_dt());
					arrSchdDtlR.sync_flg(prmsRcptDR.sync_flg());
					arrSchdDtlR.trd_unit_cd(prmsRcptDR.trd_unit_cd());
					arrSchdDtlR.trd_unit_qty(prmsRcptDR.trd_unit_qty());
					arrSchdDtlR.base_unit_cd(prmsRcptDR.base_unit_cd());
					arrSchdDtlR.base_unit_qty(prmsRcptDR.base_unit_qty());
					arrSchdDtlR.mfg_inst_no(prmsRcptDR.mfg_inst_no());
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

					_arrSchdUpd01.up1().add(arrSchdDtlR);

					MST_ARR_PR_R arrPrR = getArrPrCache(tgtUp0.po_d_no());
					MST_PO_D_R poDR = getPoDCache().get(tgtUp0.po_d_no());
					MCNumber reqQty = prmsRcptDR.base_unit_qty().subtract(arrSchdByPrmsDNoR.base_unit_qty());
					
					MCList<ArrSchd_DtlR> arrSchdDtlL = getArrSchdUpd01Up1(
							_arrSchdUpd01.up1(), arrPrR.arr_pr_no(), prmsRcptDR.dlv_inst_d_no(),
							prmsRcptDR.purc_act_d_no(), prmsRcptDR.mfg_inst_no());
					// 入荷予定の消込を行う
					arrSchdDtlR = crtArrSchdUpdUp1(arrSchdDtlL, reqQty, tgtUp0.peg_no(),
							_arrSchdL, poDR, arrPrR, prmsRcptDR, _arrSchdUpd01, _purcActDL);
				}
			}
		}
		
		/**
		 * 入荷予定の納品書NOを設定する。
		 * 
		 */
		protected void setDlvSlipNo(ArrSchd_DtlR r, Prms_Chk01_HdrR hdrR) {
			String poDNo = hdrR.po_d_no();
			// 納品書ＮＯを初期化
			r.arr_schd().dlv_slip_no(null);
			r.arr_schd().dlv_slip_mng_no(null);
			r.arr_schd().dlv_slip_mng_seq(null);
			r.arr_schd().dlv_slip_mng_d_no(null);
			r.arr_schd().dlv_slip_mng_d_seq(null);
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) ) {
				// 削除データは関係なし
				return;
			}

			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				MST_ARR_SCHD_R schdR = _arrSchdL.getFirst(_arrSchdPK, r.arr_schd_no());
				if (!isNull(schdR)) {
					r.arr_schd().dlv_slip_no(schdR.dlv_slip_no());
					r.arr_schd().dlv_slip_mng_no(schdR.dlv_slip_mng_no());
					r.arr_schd().dlv_slip_mng_seq(schdR.dlv_slip_mng_seq());
					r.arr_schd().dlv_slip_mng_d_no(schdR.dlv_slip_mng_d_no());
					r.arr_schd().dlv_slip_mng_d_seq(schdR.dlv_slip_mng_d_seq());
				}
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// 納期回答受領から作成された入荷予定の場合
				if (!isNull(r.arr_schd().prms_rcpt_d_no())) {
					// 入荷予定の元となる納期回答受領明細
					MST_PRMS_RCPT_D_R rcptR = _prmsRcptDL.getFirst(_prmsRcptPK, r.arr_schd().prms_rcpt_d_no());
					MST_ARR_SCHD_R schdR = _arrSchdL.getFirst(_arrSchdKey, poDNo, rcptR.dlv_inst_d_no(), rcptR.purc_act_d_no(), null, rcptR.mfg_inst_no());
					if (isNull(schdR)) {
						schdR = _arrSchdL.getFirst(_arrSchdKey, poDNo, rcptR.dlv_inst_d_no(), rcptR.purc_act_d_no(), null, null);
					}
					if (!isNull(schdR)) {
						r.arr_schd().dlv_slip_no(schdR.dlv_slip_no());
						r.arr_schd().dlv_slip_mng_no(schdR.dlv_slip_mng_no());
						r.arr_schd().dlv_slip_mng_seq(schdR.dlv_slip_mng_seq());
						r.arr_schd().dlv_slip_mng_d_no(schdR.dlv_slip_mng_d_no());
						r.arr_schd().dlv_slip_mng_d_seq(schdR.dlv_slip_mng_d_seq());
					}
				}
			}
		}
		
		protected void editArrSchd(){
			editArrSchdUpd01(_arrSchdUpd01.up1());
			adjustMinusData(_arrSchdUpd01.up1(), _arrSchdL, _arrSchdKey, _arrPrL);

			// 入荷予定の在庫識別区分などを補完する
			initCache(_arrSchdUpd01.up1());
			for(ArrSchd_DtlR r : _arrSchdUpd01.up1()) {
				// 取引単位違いの考慮
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				for(MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
					if(isSame(itmUnitR.unit_cd(), r.trd_unit_cd())) {
						MCNumber trdUnitQty = rvrsBaseUnitConv(
								r.base_unit_qty(), itmUnitR.conv_base_qty(),
								itmUnitR.conv_qty(), itmUnitR.dec_place(),
								itmUnitR.rnd_typ(), false);
						r.trd_unit_qty(trdUnitQty);
					}
				}

				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				MST_MFG_INST_R mfgInstR = getMfgInstCache().get(r.mfg_inst_no());
				
				if(!isNull(mfgInstR) && !isNull(mfgInstR.mfg_inst_no())) {
					r.lot_no(mfgInstR.getStringNE("LOT_NO"));
					r.sublot_no(mfgInstR.getStringNE("SUBLOT_NO"));
				}
				
				Prms_Chk01_HdrR hdrR = up0().getFirst(_tgtUp0Key, r.peg_no());
				setArrPtnTyp(r);
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				MST_PO_R poR = getPoCache(hdrR.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(hdrR.po_d_no());
				
				// 納品書NOの設定
				setDlvSlipNo(r, hdrR);
				
				r.trd_ptn_typ(poR.trd_ptn_typ());
				MAM_PROV_UPRI_R provUpriR = getCacheProvUpri(r.arr_schd_tm(), poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3(), locR.getStringNE("sppl_cd"), poR.trd_cur_cd(), locR.wg_cd());
				r.addStringColumn("outsrc_sppl_cd", locR.sppl_cd());
				r.prov_basis_typ(locR.getStringNE("prov_basis_typ"));
				r.prov_typ(provUpriR.prov_typ());
				r.stk_arrv_bp_cd(null);
				setStkIdTyp(r, poR, poDR);
			}
			
			crtArrSchdUpd01Up0(up0(), _arrSchdUpd01);
		}
		

		protected void editArrSchdNoTgt(MST_ARR_SCHD_R r, ArrSchd_DtlR arrSchdDtlR,
				Prms_Chk01_HdrR up0, String tgtDlvInstDNo) {
			MCIndexKey arrSchdUpd01Up1Key = _arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_pr_no, ArrSchd_DtlR.$purc_act_d_no,
					ArrSchd_DtlR.$dlv_inst_d_no, ArrSchd_DtlR.$prms_rcpt_d_no, ArrSchd_DtlR.$mfg_inst_no);
			MCList<ArrSchd_DtlR> arrSchdDtlL = _arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, r.arr_pr_no(), r.purc_act_d_no(), tgtDlvInstDNo,
					null, r.mfg_inst_no());
			if (arrSchdDtlL.isEmpty()) {
				arrSchdDtlL = _arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key,
						r.arr_pr_no(), r.purc_act_d_no(), tgtDlvInstDNo, null, null);
			}
			ArrSchd_DtlR tmpArrSchdDtlR = null;
			for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
					tmpArrSchdDtlR = tmpR;
					break;
				}
			}

			// 入荷予定サービスの上り電文にない場合
			if (isNull(tmpArrSchdDtlR)) {
				Map_ArrSchd_DtlR_MST_ARR_SCHD_R<ArrSchd_DtlR, MST_ARR_SCHD_R, Prms_Chk01_DtlR> mpr = createMap_ArrSchd_DtlR_MST_ARR_SCHD_R();
				MST_DLV_INST_D_R dlvInstDR = _dlvInstDL.getFirst(_dlvInstKey2, tgtDlvInstDNo);
				copy(arrSchdDtlR, r, mpr);
				arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				arrSchdDtlR.prms_rcpt_d_no(null);
				arrSchdDtlR.dlv_inst_d_no(tgtDlvInstDNo);
				arrSchdDtlR.arr_schd_no(null);
				if (!isNull(dlvInstDR)) {
					arrSchdDtlR.mfg_inst_no(dlvInstDR.mfg_inst_no());
					arrSchdDtlR.arr_schd_tm(dlvInstDR.dlv_rqst_tm());
					arrSchdDtlR.sync_flg(dlvInstDR.sync_flg());
					arrSchdDtlR.accpt_schd_dt(dlvInstDR.purc_schd_dt());
					arrSchdDtlR.arr_loc_cd(dlvInstDR.in_to_loc_cd());
					arrSchdDtlR.str_ln_cd(dlvInstDR.str_ln_cd());
					arrSchdDtlR.purc_act_d_no(dlvInstDR.purc_act_d_no());
				}
				else if (isNull(r.purc_act_d_no())) {

					MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
					arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
					arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
					arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
					arrSchdDtlR.sync_flg(poDR.sync_flg());

				}
				else {

					MST_PURC_ACT_D_R purcActDR = _purcActDL.getFirst(_purcActDKey, r.purc_act_d_no());
					arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
					arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
					arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
					arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
					arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());

				}
				_arrSchdUpd01.up1().add(arrSchdDtlR);
			}
			else {
				tmpArrSchdDtlR.base_unit_qty(tmpArrSchdDtlR.base_unit_qty().add(r.base_unit_qty()));
			}

		}
		
		protected void editArrSchdUpd01(MCList<ArrSchd_DtlR> arrSchdUpd01L) {
			MCIndexKey prmsRcptDKey = up1().createIndex(Prms_Chk01_DtlR.$prms_rcpt_d_no);
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			for (ArrSchd_DtlR r : arrSchdUpd01L) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (!isNull(r.arr_schd_no())) {
					if (hasAct(r.arr_schd())) {
						continue;
					}
				}
				if (!isNull(r.prms_rcpt_d_no()) && MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					Prms_Chk01_DtlR prmsRcptDR = up1().getFirst(prmsRcptDKey, r.prms_rcpt_d_no());
					if (isNull(prmsRcptDR)) {
						continue;
					}
				}
				
				Prms_Chk01_HdrR hdrR = up0().getFirst(up0Key, r.peg_no());
				setLotNo(r, hdrR.po_d_no());
			}
		}
		
		protected void editArrSchdNoUp(Prms_Chk01_HdrR up0, ArrSchd_DtlR arrSchdDtlR, MST_ARR_SCHD_R r, MCNumber remQty, boolean existsPoInstPrms) {
			MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
			if (isNull(arrSchdDtlR)) {
				arrSchdDtlR = ArrSchd_DtlR.create();
				arrSchdDtlR.peg_no(up0.peg_no());
			}
			arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (isNull(arrSchdDtlR.purc_act_d_no())) {
				copy(arrSchdDtlR, r, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
				arrSchdDtlR.arr_loc_cd(poDR.in_to_loc_cd());
				arrSchdDtlR.str_ln_cd(poDR.str_ln_cd());
				arrSchdDtlR.arr_schd_tm(poDR.dlv_rqst_tm());
				arrSchdDtlR.accpt_schd_dt(poDR.purc_schd_dt());
				arrSchdDtlR.trd_unit_cd(poDR.trd_unit_cd());
			}
			else {
				MST_PURC_ACT_D_R purcActDR = _purcActDL.getFirst(_purcActDKey, r.purc_act_d_no());
				arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
				arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
				arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
				arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
				arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
			}
			arrSchdDtlR.arr_schd_no(null);

			if (!r.arr_qty().isZero() || !r.purc_qty().isZero()) {
				arrSchdDtlR.base_unit_qty(r.base_unit_qty().subtract(remQty));
			}
			_arrSchdUpd01.up1().add(arrSchdDtlR);

		}
		
		/**
		 * キャッシュを作成
		 */
		protected void initCache(MCList<ArrSchd_DtlR> arrSchdDtlL) {
			MCList<ArrSchd_DtlR> errArrSchdL = MCList.create(ArrSchd_DtlR.class);
			// 場所マスタ
			initCacheLoc(arrSchdDtlL);
			
			// 品目単位マスタ
			initItmUnitCache(arrSchdDtlL);

			// 支給品単価マスタ
			MCList<MAM_PROV_UPRI_R> provUpriL = MCList.create(MAM_PROV_UPRI_R.class);
			MCIndexKey up0Key = up0().createIndex(Prms_Chk01_HdrR.$peg_no);
			for(ArrSchd_DtlR r : arrSchdDtlL) {
				MAM_PROV_UPRI_R provUpriR = MAM_PROV_UPRI_R.create();
				Prms_Chk01_HdrR up0 = up0().getFirst(up0Key, r.peg_no());
				MST_PO_R poR = getPoCache(up0.po_d_no());
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				// キャッシュから入荷場所ＣＤに該当する場所が取得できなかった場合にエラー
				if (isNull(locR)) {
					errArrSchdL.add(r);
					continue;
				}
				r.wg_cd(locR.wg_cd());
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				r.gd_cd(getDefaultFeedStkGd().gd_cd());
				if(isNull(locR.sppl_cd())) {
					continue;
				}
				provUpriR.itm_cd(poDR.itm_cd());
				provUpriR.itm_sub1(poDR.itm_sub1());
				provUpriR.itm_sub2(poDR.itm_sub2());
				provUpriR.itm_sub3(poDR.itm_sub3());
				provUpriR.prsppl_cd(locR.sppl_cd());
				provUpriR.cur_cd(poR.trd_cur_cd());
				provUpriR.wg_cd(locR.wg_cd());
				provUpriL.add(provUpriR);
			}
			if (!errArrSchdL.isEmpty()) {
				MCList<ArrSchd_DtlR> arrSchdDtlList = errArrSchdL.groupByNE(ArrSchd_DtlR.$arr_loc_cd);
				MCMessageList msgL = new MCMessageList();

				for (ArrSchd_DtlR r : arrSchdDtlList) {
					msgL.add(new MCMessage(r, null, MAUAL0057, r.arr_loc_cd()));
				}
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}
			initCacheProvUpri(provUpriL);
		}
		
		/**
		 * 受注状況更新サービス実行
		 */
		protected void callSloSts_Upd01() {
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			// 受注紐付発注の場合、受注状況更新サービス実行する
			for(Prms_Chk01_HdrR up0 : up0()) {
				MST_PO_D_R poDR = getPoDCache().get(up0.po_d_no());
				if(!isNull(poDR.slo_d_no()) && !poDR.rqst_can_flg()) {
					SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
					copy(sloStsDtlR, up0, createMap_SloSts_DtlR_Prms_Chk01_HdrR());
					sloStsDtlR.po_no(poDR.po_no());
					sloStsDtlR.slo_d_no(poDR.slo_d_no());
					sloStsIns01.up0().add(sloStsDtlR);
				}
			}
			
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}

		protected Map_SloSts_DtlR_Prms_Chk01_HdrR<SloSts_DtlR,Prms_Chk01_HdrR> createMap_SloSts_DtlR_Prms_Chk01_HdrR() {
			return new Map_SloSts_DtlR_Prms_Chk01_HdrR<SloSts_DtlR, Prms_Chk01_HdrR>();
		}

		public class Map_SloSts_DtlR_Prms_Chk01_HdrR<D extends SloSts_DtlR, S extends Prms_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$po_d_no, Prms_Chk01_HdrR.$po_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_PRMS_RCPT.value());
			}
		}
		
		protected Map_ArrSchd_DtlR_MST_ARR_SCHD_R<ArrSchd_DtlR, MST_ARR_SCHD_R, Prms_Chk01_DtlR> createMap_ArrSchd_DtlR_MST_ARR_SCHD_R() {
			return new Map_ArrSchd_DtlR_MST_ARR_SCHD_R<ArrSchd_DtlR, MST_ARR_SCHD_R, Prms_Chk01_DtlR>();
		}

		public class Map_ArrSchd_DtlR_MST_ARR_SCHD_R<D extends ArrSchd_DtlR, S extends MST_ARR_SCHD_R, W extends Prms_Chk01_DtlR>
				extends FXUCC_RowMapperWith<D, S, W> {

			protected W _dtlR;

			@Override
			public void setWith(W _dtlR) {
				this._dtlR = _dtlR;
			}

			@Override
			protected void valueCopy(D dest, S src) {
				if (!isNull(_dtlR)) {
					dest.dlv_inst_d_no(_dtlR.dlv_inst_d_no());
				}
				super.valueCopy(dest, src);
			}
			
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
	}
	
	protected void clearArrPrKPIInfo(ArrPr_DtlR arrPrDtlR) {
		arrPrDtlR.prms_refl_qty(MCNumber.ZERO);
		arrPrDtlR.dlv_inst_prms_refl_qty(MCNumber.ZERO);
		arrPrDtlR.prms_refl_dt(null);
		arrPrDtlR.dlv_inst_prms_refl_dt(null);
		arrPrDtlR.prms_rcpt_dt(null);
		arrPrDtlR.dlv_inst_prms_rcpt_dt(null);
		arrPrDtlR.prms_rcpt_qty(MCNumber.ZERO);
		arrPrDtlR.dlv_inst_prms_rcpt_qty(MCNumber.ZERO);
		arrPrDtlR.prms_refl_qty(MCNumber.ZERO);
		arrPrDtlR.dlv_inst_prms_refl_qty(MCNumber.ZERO);
	}
 
	/**
	 * DlvInst_Prms_Del01オペレーション.<p>
	 *
	 * 納入指示、納期回答受領を削除する<br>
	 */
	public class DlvInst_Prms_Del01 extends MSBDL_PurcDlvDtAdjstRegService_MC_A.DlvInst_Prms_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if(up0().isEmpty()) {
				return;
			}

			// 納期回答受領ヘッダ・納入指示ヘッダを行ロック
			MCList<MST_PRMS_RCPT_R> prmsRcptL = lockPrmsRcpt();
			MCList<MST_DLV_INST_R> dlvInstL = lockDlvInst();
			
			// 納期回答受領ヘッダ・明細を削除する
			delPrmsRcpt(prmsRcptL);
			
			// 納入指示受領ヘッダを論理削除する
			delDlvInst(dlvInstL);			
			
			MCList<MST_DLV_INST_R> dlvInstEdiL = getDlvInst(dlvInstL);
			
			// 納入指示ヘッダの更新
			updDlvInst(dlvInstEdiL);
			
			// 納入指示ＩＦ送信
			callDlvInstEdi(dlvInstEdiL);
		}
				
		/**
		 * 納期回答受領ヘッダを行ロックする
		 */
		protected MCList<MST_PRMS_RCPT_R> lockPrmsRcpt() {
			MCList<MST_PRMS_RCPT_R> prmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			MST_PRMS_RCPT_R t = MST_PRMS_RCPT_R.create("T");
			MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(t);
			prmsRcptL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelectForUpdate("MSBDL5120_MST_PRMS_RCPT_S03", prmsRcptL, prmsRcptL_bldr, up0());
			
			return prmsRcptL;
		}
		
		/**
		 * 納入指示ヘッダを行ロックする
		 */
		protected MCList<MST_DLV_INST_R> lockDlvInst() {			
			MCList<MST_DLV_INST_R> dlvInstL = MCList.create(MST_DLV_INST_R.class);
			MST_DLV_INST_R t = MST_DLV_INST_R.create("T");
			MCQueryApiBuilder dlvInstL_bldr = MCQueryApiBuilder.create(t);
			dlvInstL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dlvInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelectForUpdate("MSBDL5120_MST_DLV_INST_S04", dlvInstL, dlvInstL_bldr, up0());
			return dlvInstL;
		}
		
		/**
		 * 納期回答受領ヘッダを論理削除する
		 * @param prmsRcptL
		 */
		protected void delPrmsRcpt(MCList<MST_PRMS_RCPT_R> prmsRcptL) {
			if (prmsRcptL.isEmpty()) {
				return;
			}

			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R prmsRcptDL_t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(prmsRcptDL_t);
			prmsRcptDL_bldr.setWhere(prmsRcptDL_t.prms_rcpt_no.eq(bind("prms_rcpt_no")));
			dbSelectForUpdate("MSBDL5120_MST_PRMS_RCPT_D_S05", prmsRcptDL, prmsRcptDL_bldr, prmsRcptL);

			MST_PRMS_RCPT_R t = MST_PRMS_RCPT_R.create("T");
			MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(t);
			prmsRcptL_bldr.setSetVL(t.can_flg, value(true));
			prmsRcptL_bldr.addSetVL(t.arr_schd_refl_flg, value(false));
			dbUpdateKey("MSBDL5120_MST_PRMS_RCPT_U05", prmsRcptL, prmsRcptL_bldr);
		}
		
		/**
		 * 納入指示ヘッダを論理削除する
		 * @param dlvInstL
		 */
		protected void delDlvInst(MCList<MST_DLV_INST_R> dlvInstL) {
			if(dlvInstL.isEmpty()) {
				return;
			}
			
			// 納入指示ヘッダを論理削除
			MST_DLV_INST_R t = MST_DLV_INST_R.create("T");
			MCQueryApiBuilder dlvInstL_bldr = MCQueryApiBuilder.create(t);
			dlvInstL_bldr.setSetVL(t.can_flg, value(true));
			dlvInstL_bldr.addSetVL(t.dlv_inst_print_flg, value(false));
			dlvInstL_bldr.addSetVL(t.dlv_inst_print_dt, nullValue());
			dlvInstL_bldr.addSet(t.dlv_inst_rev);
			dbUpdateKey("MSBDL5120_MST_DLV_INST_U03", dlvInstL, dlvInstL_bldr);
		}
		
		/**
		 * 納入指示ＩＦ送信対象をワークテーブルに登録します。
		 */
		protected void crtWk(MCList<MST_DLV_INST_R> dtlL) {
			MCList<MST_DLV_INST_R> dlvInstL = MCList.create(MST_DLV_INST_R.class);
			for (MST_DLV_INST_R r : dtlL) {
				MST_DLV_INST_R wkR = MST_DLV_INST_R.create();
				wkR.dlv_inst_no(r.dlv_inst_no());
				dlvInstL.add(wkR);
			}
			MCQueryApiBuilder dlvInstLBldr = MCQueryApiBuilder.create(MST_DLV_INST_R.create("T"));
			dbWkDelete("MSBDL5120_MSW_DLV_INST_D01", dlvInstLBldr.getBaseDbc());
			dbWkInsert("MSBDL5120_MSW_DLV_INST_I01", dlvInstL, dlvInstLBldr.getBaseDbc());
		}
		
		/**
		 * 納入指示ヘッダの更新
		 */
		protected void updDlvInst(MCList<MST_DLV_INST_R> dlvInstEdiL) {
			if (dlvInstEdiL.isEmpty()) {
				return;
			}
			
			MCList<MST_DLV_INST_R> updL = MCList.create(MST_DLV_INST_R.class);
			for (MST_DLV_INST_R dlvInstEdiR : dlvInstEdiL) {
				MST_DLV_INST_R updR = MST_DLV_INST_R.create();
				updR.po_d_no(dlvInstEdiR.po_d_no());
				updR.edi_flg(dlvInstEdiR.getBoolean("del_edi_dlv_inst_flg"));
				updL.add(updR);
			}
			
			MST_DLV_INST_R dbc = MST_DLV_INST_R.create("T");
			execDbUpdate("MSBDL5120_MST_DLV_INST_U05", dbc, updL,
				dbc.po_d_no.eq(bindEx(MST_DLV_INST_R.$po_d_no)),
				dbc.edi_flg);
		}
		
		/**
		 * 納入指示ＩＦ送信
		 */
		protected void callDlvInstEdi(MCList<MST_DLV_INST_R> dlvInstEdiL) {
			MCList<MST_DLV_INST_R> dlvInstL = dlvInstEdiL.subList("del_edi_dlv_inst_flg", true);
			if (dlvInstL.isEmpty()) {
				return;
			}
			
			MSLAL_DlvInstSendIfService.DlvInstSendIf_Upd01 o = MSLAL_DlvInstSendIfService.crtDlvInstSendIf_Upd01();
			for (MST_DLV_INST_R dlvInstEdiR : dlvInstL) {
				DlvInstSendIf_Upd01_DtlR up0R = DlvInstSendIf_Upd01_DtlR.create();
				up0R.po_d_no(dlvInstEdiR.po_d_no());
				up0R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				o.up0().add(up0R);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
	}

	/**
	 * 入荷進捗の購買状況区分を更新する
	 * @param arrPrL
	 */
	protected void updPurcStsTyp(MCList<MST_ARR_PR_R> arrPrL) {
		// 購買状況区分
		MSBDL_PurcUtil.PurcUtil_Srch04 o = MSBDL_PurcUtil.crtPurcUtil_Srch04();
		setAll(o.up0(), arrPrL, createMap_Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R());
		o.exec();
		MCIndexKey idx2 = o.down0().createIndex(PurcUtil_Srch04_DtlR.$po_d_no);
		for (MST_ARR_PR_R r : arrPrL) {
			PurcUtil_Srch04_DtlR downR = o.down0().getFirst(idx2, r.po_d_no());
			r.purc_sts_typ(downR.purc_sts_typ());
		}
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
		arrPrL_bldr.setSet(t.purc_sts_typ);
		dbUpdateKey("MSBDL5120_MST_ARR_PR_U03", arrPrL, arrPrL_bldr);
	}

	/**
	 * 入荷パタン区分を設定します。
	 * @param arrSchdDtlR
	 */
	protected void setArrPtnTyp(ArrSchd_DtlR arrSchdDtlR) {
		if (!isNull(arrSchdDtlR.accpt_schd_dt()) && arrSchdDtlR.accpt_schd_dt().ltDate(arrSchdDtlR.arr_schd_tm())) {
			arrSchdDtlR.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
		}
		else {
			arrSchdDtlR.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
		}
	}
		
	/**
	 * 在庫識別区分・在庫取引先を設定します
	 * @param arrSchdDtlR
	 * @param poR
	 * @param poDR
	 */
	protected void setStkIdTyp(ArrSchd_DtlR dest, MST_PO_R poR, MST_PO_D_R poDR) {
		if (MAC_PURC_ID_TYP.isVMI(poDR.purc_id_typ())) {
			dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
			dest.stk_bp_cd(poR.sppl_cd());
		}
		else if (MAC_PURC_ID_TYP.isFFR_RCV(poDR.purc_id_typ())) {
			dest.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
			dest.stk_bp_cd(poR.sppl_cd());
		}
		else {
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
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

	protected Map_Aprv_Chk02_Rslt1R_MST_PO_R<Aprv_Chk02_Rslt1R,MST_PO_R> createMap_Aprv_Chk02_Rslt1R_MST_PO_R() {
		return new Map_Aprv_Chk02_Rslt1R_MST_PO_R<Aprv_Chk02_Rslt1R, MST_PO_R>();
	}

	public class Map_Aprv_Chk02_Rslt1R_MST_PO_R<D extends Aprv_Chk02_Rslt1R, S extends MST_PO_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk02_Rslt1R.$aprv_no, MST_PO_R.$aprv_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.getNumberNE("peg_no"));
		}
	}
	
	protected Map_ArrSchd_DtlR_MST_PO_D_R<ArrSchd_DtlR,MST_PO_D_R> createMap_ArrSchd_DtlR_MST_PO_D_R() {
		return new Map_ArrSchd_DtlR_MST_PO_D_R<ArrSchd_DtlR, MST_PO_D_R>();
	}

	public class Map_ArrSchd_DtlR_MST_PO_D_R<D extends ArrSchd_DtlR, S extends MST_PO_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_tm, MST_PO_D_R.$dlv_rqst_tm);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, MST_PO_D_R.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, MST_PO_D_R.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, MST_PO_D_R.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, MST_PO_D_R.$itm_sub3);
			addColumnPathMap(ArrSchd_DtlR.$itm_nm, MST_PO_D_R.$itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$sundry_itm_flg, MST_PO_D_R.$sundry_itm_flg);
			addColumnPathMap(ArrSchd_DtlR.$purc_id_typ, MST_PO_D_R.$purc_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$sno1, MST_PO_D_R.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, MST_PO_D_R.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, MST_PO_D_R.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, MST_PO_D_R.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$ver_no, MST_PO_D_R.$ver_no);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_cd, MST_PO_D_R.$sppl_itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_nm, MST_PO_D_R.$sppl_itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$maker_cd, MST_PO_D_R.$maker_cd);
			addColumnPathMap(ArrSchd_DtlR.$bp_lot_no, MST_PO_D_R.$bp_lot_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_loc_cd, MST_PO_D_R.$in_to_loc_cd);
			addColumnPathMap(ArrSchd_DtlR.$str_ln_cd, MST_PO_D_R.$str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, MST_PO_D_R.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, MST_PO_D_R.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, MST_PO_D_R.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, MST_PO_D_R.$base_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$sync_flg, MST_PO_D_R.$sync_flg);
			addColumnPathMap(ArrSchd_DtlR.$outsrc_flg, MST_PO_D_R.$outsrc_flg);
			addColumnPathMap(ArrSchd_DtlR.$io_schd_pr_no, MST_PO_D_R.$io_schd_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$accpt_schd_dt, MST_PO_D_R.$purc_schd_dt);
		}
	}

	
	protected MCList<MST_DLV_INST_D_R> srchDlvInstD(MCList<? extends MCRow> bindL){
		MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
		MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
		MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(t);
		MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
		
		dlvInstDL.addStringColumn(MST_DLV_INST_R.$po_d_no);
		dlvInstDL_bldr.addSelect(t2.po_d_no);
		dlvInstDL_bldr.addSelect(t2.dlv_inst_dt);
		dlvInstDL_bldr.setWhere(t2.po_d_no.eq(bind("po_d_no")));
		dlvInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dlvInstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
		dlvInstDL_bldr.addInnerJoin(t2, bracket(t2.dlv_inst_no.eq(t.dlv_inst_no)));
		dbSelect("MSBDL5120_MST_DLV_INST_D_S04", dlvInstDL, dlvInstDL_bldr, bindL);
		return dlvInstDL; 
	}
	/**
	 * 納期回答受領ヘッダを取得する
	 * @param hdrL 発注明細ＮＯを格納しているリスト
	 * @return 納入指示受領ヘッダ
	 */
	protected MCList<MST_PRMS_RCPT_R> srchPrmsRcpt(MCList<?>hdrL) {
		MCList<MST_PRMS_RCPT_R> prmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
		MST_PRMS_RCPT_R t = MST_PRMS_RCPT_R.create("T");
		MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(t);
		prmsRcptL_bldr.setWhere(t.po_d_no.eq(bind(MST_PRMS_RCPT_R.$po_d_no)));
		dbSelect("MSBDL5120_MST_PRMS_RCPT_S02", prmsRcptL, prmsRcptL_bldr, hdrL);
		return prmsRcptL; 
	}
	
	/**
	 * 納期回答受領明細を取得する
	 * @param hdrL 発注明細ＮＯを格納しているリスト
	 * @return 納期回答受領明細
	 */
	protected MCList<MST_PRMS_RCPT_D_R> srchPrmsRcptD(MCList<?>hdrL) {
		MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
		MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
		MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(t);
		MST_PRMS_RCPT_R t2 = MST_PRMS_RCPT_R.create("T2");
		prmsRcptDL.addBooleanColumn(MST_PRMS_RCPT_R.$arr_schd_refl_flg);
		prmsRcptDL.addStringColumn(MST_PRMS_RCPT_R.$po_d_no);
		prmsRcptDL_bldr.addSelect(t2.po_d_no);
		prmsRcptDL_bldr.addSelect(t2.arr_schd_refl_dt);
		prmsRcptDL_bldr.addSelect(t2.prms_rcpt_dt);
		prmsRcptDL_bldr.addSelect(t2.arr_schd_refl_flg);
		prmsRcptDL_bldr.setWhere(t2.po_d_no.eq(bind(MST_PRMS_RCPT_R.$po_d_no)));
		prmsRcptDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
		prmsRcptDL_bldr.addInnerJoin(t2, bracket(t2.prms_rcpt_no.eq(t.prms_rcpt_no)));
		prmsRcptDL_bldr.setOrderByAsc(t2.po_d_no,t2.prms_rcpt_no,t.prms_rcpt_d_no);
		dbSelect("MSBDL5120_MST_PRMS_RCPT_D_S04", prmsRcptDL, prmsRcptDL_bldr, hdrL);
		return prmsRcptDL;
	}
	
	protected boolean isArrCmpl(MST_ARR_SCHD_R arrSchdR) {
		MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());
		return arrSchdR.cmpl_flg() && !arrSchdR.arr_skip_flg()
				|| purcSchdR.cmpl_flg() && !purcSchdR.non_purc_flg();
	}
	
	protected boolean hasAct(MST_ARR_SCHD_R arrSchdR) {
		MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(arrSchdR.arr_schd_no());
		return (!isNull(arrSchdR.rcpt_iv_no()))
				|| (!isNull(arrSchdR.arr_qty())
						&& !arrSchdR.arr_qty().isZero())
				|| (!isNull(arrSchdR.purc_qty())
						&& !arrSchdR.purc_qty().isZero())
				|| (!isNull(purcSchdR.base_unit_accpt_dfct_qty())
						&& !purcSchdR.base_unit_accpt_dfct_qty().isZero());
	}
	
	protected boolean isArrSchdRFree(MST_ARR_SCHD_R arrSchdR) {
		return isNullAnd(arrSchdR.prms_rcpt_d_no(), arrSchdR.dlv_inst_d_no(), arrSchdR.purc_act_d_no());
	}
	
	protected void setLotNo(ArrSchd_DtlR r, String poDNo) {
		r.lot_no(null);
		r.sublot_no(null);
		if (isArrSchdRFree(r.arr_schd())) {
			MST_PO_D_R poDR = getPoDCache().get(poDNo);
			r.bp_lot_no(poDR.bp_lot_no());
		}
		else {
			r.bp_lot_no(null);
		}
	}
	
	/**
	 * 配列をMapのキーに変換する
	 */
	protected List<Comparable<?>> toMapKey(Comparable<?>... in) {
		List<Comparable<?>> ret = new ArrayList<Comparable<?>>();
		if (in == null) {
			return ret;
		}
		for (Comparable<?> c : in) {
			ret.add(c);
		}
		return ret;
	}

	protected Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<PurcUtil_Srch04_DtlR, MST_ARR_PR_R> createMap_Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R() {
		return new Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<PurcUtil_Srch04_DtlR, MST_ARR_PR_R>();
	}
	public class Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<D extends PurcUtil_Srch04_DtlR, S extends MST_ARR_PR_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUtil_Srch04_DtlR.$po_d_no, MST_ARR_PR_R.$po_d_no);
			addColumnPathMap(PurcUtil_Srch04_DtlR.$purc_sts_typ, MST_ARR_PR_R.$purc_sts_typ);
		}
	}
	
	/**
	 * 入荷予定サービスの上り電文のうち、納期回答に紐付かない入荷予定を取得する
	 * 
	 * @param up1 入荷予定サービス上り電文
	 * @param arrPrNo 入荷進捗ＮＯ
	 * @param dlvInstDno 納入指示明細ＮＯ
	 * @param purcActDNo 仕入実績明細ＮＯ
	 * @param mfgInstNo 製造指図ＮＯ
	 * @return 納期回答に紐づかない入荷予定
	 */
	protected MCList<ArrSchd_DtlR> getArrSchdUpd01Up1(
			MCList<ArrSchd_DtlR> up1, String arrPrNo, String dlvInstDno,
			String purcActDNo, String mfgInstNo) {
		// 優先順位１．納入指示明細ＮＯあり・製造指図ＮＯあり
		MCList<ArrSchd_DtlR> arrSchdDtlL = up1.subList(r -> 
			isSame(r.arr_pr_no(), arrPrNo) &&
			isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlvInstDno, NULL_VAL)) &&
			isSame(r.purc_act_d_no(), purcActDNo) &&
			isSame(nvl(r.mfg_inst_no(), NULL_VAL) , nvl(mfgInstNo, NULL_VAL)) &&
			isNull(r.prms_rcpt_d_no())
		);
		if (arrSchdDtlL.isEmpty()) {
			// 優先順位２．納入指示明細ＮＯなし・製造指図ＮＯあり
			arrSchdDtlL = up1.subList(r -> 
				isSame(r.arr_pr_no(), arrPrNo) &&
				isNull(r.dlv_inst_d_no()) &&
				isSame(r.purc_act_d_no(), purcActDNo) &&
				isSame(nvl(r.mfg_inst_no(), NULL_VAL) , nvl(mfgInstNo, NULL_VAL)) &&
				isNull(r.prms_rcpt_d_no())
			);
			if (arrSchdDtlL.isEmpty()) {
				// 優先順位３．納入指示明細ＮＯあり・製造指図ＮＯなし
				arrSchdDtlL = up1.subList(r -> 
					isSame(r.arr_pr_no(), arrPrNo) &&
					isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlvInstDno, NULL_VAL)) &&
					isSame(r.purc_act_d_no(), purcActDNo) &&
					isNull(r.mfg_inst_no()) &&
					isNull(r.prms_rcpt_d_no())
				);
				if (arrSchdDtlL.isEmpty()) {
					// 優先順位４．納入指示明細ＮＯなし・製造指図ＮＯなし
					arrSchdDtlL = up1.subList(r -> 
						isSame(r.arr_pr_no(), arrPrNo) &&
						isNull(r.dlv_inst_d_no()) &&
						isSame(r.purc_act_d_no(), purcActDNo) &&
						isNull(r.mfg_inst_no()) &&
						isNull(r.prms_rcpt_d_no())
					);
				}
			}
		}
		return arrSchdDtlL;
	}

	/**
	 * 入荷予定サービスの上り電文に、基準単位数量がマイナスのデータが含まれないように上り電文を調整する。
	 */
	protected void adjustMinusData(MCList<ArrSchd_DtlR> up1L, MCList<MST_ARR_SCHD_R> arrSchdL,
			MCIndexKey arrSchdKey, MCList<MST_ARR_PR_R> arrPrL) {
		MCIndexKey prIdx = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
		addArrSchdSVUp(up1L, arrSchdL, arrPrL, prIdx);
		adjustMinusMfgInstPrms(up1L, arrSchdL, arrSchdKey, arrPrL, prIdx);
	}

	protected String[] getArrSchdIndexKey() {
		return new String[] { 
				MST_ARR_PR_R.$po_d_no, 
				MST_ARR_SCHD_R.$dlv_inst_d_no, 
				MST_ARR_SCHD_R.$purc_act_d_no,
				MST_ARR_SCHD_R.$prms_rcpt_d_no, 
				MST_ARR_SCHD_R.$mfg_inst_no };
	}
	
	/**
	 * 入荷予定サービスの上り電文になっていない入荷予定トランザクションを、上り電文として追加する。
	 */
	protected void addArrSchdSVUp(MCList<ArrSchd_DtlR> up1L, MCList<MST_ARR_SCHD_R> arrSchdL,
			MCList<MST_ARR_PR_R> arrPrL, MCIndexKey prIdx) {
		MCIndexKey schdKey = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
		MCIndexKey up1SchdKey = up1L.createIndex(ArrSchd_DtlR.$arr_schd_no);
		MCIndexKey up1PrKey = up1L.createIndex(ArrSchd_DtlR.$arr_pr_no);
		MCList<ArrSchd_DtlR> addL = MCList.create(ArrSchd_DtlR.class);
		for (ArrSchd_DtlR prR : up1L.groupBy(ArrSchd_DtlR.$arr_pr_no)) {
			MCList<MST_ARR_SCHD_R> tgtSchdL = arrSchdL.subList(schdKey, prR.arr_pr_no());
			for (MST_ARR_SCHD_R tgtSchdR : tgtSchdL) {
				// 完了している入荷予定は数量の調整に使用しないので除外する
				if (isCmpl(tgtSchdR)) continue;

				ArrSchd_DtlR up1R = up1L.getFirst(up1SchdKey, tgtSchdR.arr_schd_no());
				if (isNull(up1R)) {
					ArrSchd_DtlR up1OtherR = up1L.getFirst(up1PrKey, tgtSchdR.arr_pr_no());
					ArrSchd_DtlR addR = ArrSchd_DtlR.create();
					addR.arr_schd(tgtSchdR);
					addR.peg_no(up1OtherR.peg_no());
					addR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(tgtSchdR.arr_schd_no());
					addR.accpt_schd_dt(purcSchdR.purc_schd_dt());
					addL.add(addR);
				}
			}
		}
		up1L.addAll(addL);
	}
	
	protected void adjustMinusMfgInstPrms(MCList<ArrSchd_DtlR> up1L, MCList<MST_ARR_SCHD_R> arrSchdL,
			MCIndexKey arrSchdKey, MCList<MST_ARR_PR_R> arrPrL, MCIndexKey prIdx) {
		String[] keys = new String[] { 
				MST_ARR_SCHD_R.$dlv_inst_d_no, 
				MST_ARR_SCHD_R.$purc_act_d_no,
				MST_ARR_SCHD_R.$prms_rcpt_d_no, 
				MST_ARR_SCHD_R.$mfg_inst_no, 
				MST_ARR_SCHD_R.$rcpt_iv_no };
		MCList<ArrSchd_DtlR> removeL = MCList.create(ArrSchd_DtlR.class);
		for (MCList<ArrSchd_DtlR> grpL : up1L.groupList(ArrSchd_DtlR.$arr_pr_no)) {
			if (isSame(grpL.subList(ArrSchd_DtlR.$mfg_inst_no, null).size(), grpL.size())) {
				continue;
			}

			for (ArrSchd_DtlR r : grpL) {
				if (r.base_unit_qty().isNegative()) {
					Comparable<?>[] vals = new Comparable<?>[] {
						null,
						r.purc_act_d_no(),
						null,
						null,
						r.rcpt_iv_no() };
					MCList<ArrSchd_DtlR> defaultL = grpL.subList(keys, vals);
					if (!defaultL.isEmpty()) {
						for (ArrSchd_DtlR defaultR : defaultL) {
							MCNumber availBaseUnitQty = getAvailBaseUnitQty(defaultR);
							if (!availBaseUnitQty.isPositive()) continue;

							MCNumber allocQty = MCNumber.min(availBaseUnitQty, r.base_unit_qty().multiply(-1));
							defaultR.base_unit_qty(defaultR.base_unit_qty().subtract(allocQty));
							if (defaultR.base_unit_qty().isZero()) {
								if (isNull(defaultR.arr_schd_no())) {
									removeL.add(defaultR);
								}
								else {
									defaultR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
							}
							r.base_unit_qty(r.base_unit_qty().add(allocQty));
							if (r.base_unit_qty().isZero()) {
								if (isNull(r.arr_schd_no())) {
									removeL.add(r);
								}
								else {
									r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
								break;
							}
						}
					}
				}
			}

		}
		removeTgt(up1L, removeL);
	}

	protected void removeTgt(MCList<ArrSchd_DtlR> up1L, MCList<ArrSchd_DtlR> removeL) {
		MCList<ArrSchd_DtlR> replaceL = MCList.create(ArrSchd_DtlR.class);
		if (removeL.isEmpty()) {
			return;
		}
		for(ArrSchd_DtlR up1R : up1L) {
			if(!removeL.contains(up1R)) {
				replaceL.add(up1R);
			}
		}
		up1L = replaceL;
	}
	
	protected MCNumber getAvailBaseUnitQty(ArrSchd_DtlR r) {
		MST_ARR_SCHD_R schdR = r.arr_schd();
		if (isNull(schdR.arr_schd_no())) {
			return schdR.base_unit_qty();
		}
		if (isCmpl(schdR)) {
			return MCNumber.ZERO;
		}
		return r.base_unit_qty().subtract(MCNumber.max(schdR.arr_qty(), schdR.purc_qty()));
	}
	
	protected boolean isCmpl(MST_ARR_SCHD_R schdR) {
		return isArrCmpl(schdR) || !isNull(schdR.rcpt_iv_mng_no());
	}
	/**
	 * 入荷予定サービスの上り電文を編集する
	 * @param up1L
	 */
	protected void editArrSchdUpd01UpL(MCList<ArrSchd_DtlR> up1L) {
		for(ArrSchd_DtlR r : up1L) {
			// 取引単位違いの考慮
			MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, r.trd_unit_cd());
			if (!isNull(itmUnitR)) {
				MCNumber trdUnitQty = rvrsBaseUnitConv(
						r.base_unit_qty(), itmUnitR.conv_base_qty(),
						itmUnitR.conv_qty(), itmUnitR.dec_place(),
						itmUnitR.rnd_typ(), false);
				r.trd_unit_qty(trdUnitQty);
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.arr_qty(MCNumber.ZERO);
				r.purc_qty(MCNumber.ZERO);
				r.abort_qty(MCNumber.ZERO);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				r.trd_unit_qty(MCNumber.ZERO);
				r.base_unit_qty(MCNumber.ZERO);
				r.arr_qty(MCNumber.ZERO);
				r.purc_qty(MCNumber.ZERO);
				r.abort_qty(MCNumber.ZERO);
			}
			else {
				r.arr_qty(nvl(r.arr_qty(), MCNumber.ZERO));
				r.purc_qty(nvl(r.purc_qty(), MCNumber.ZERO));
				r.abort_qty(nvl(r.abort_qty(), MCNumber.ZERO));
			}
			
			if (!isNull(r.purc_act_d_no())) {
				r.re_arr_schd_flg(true);
			}
			else {
				r.re_arr_schd_flg(false);
			}
		}
	}
	
	/**
	 * 入荷予定を消込し、入荷予定サービスの上り電文を作成する
	 * 
	 * @param arrSchdDtlL	条件に一致する入荷予定サービスの上り電文
	 * @param reqQty		消込したい数量
	 * @param pegNo			紐付け番号
	 * @param arrSchdL		更新前の入荷予定
	 * @param poDR			発注明細
	 * @param arrPrR		入荷進捗
	 * @param tgtRow		納入指示明細、納期回答受領の対象行
	 * @param arrSchdUpd01	入荷予定サービスのインスタンス
	 * @param purcActDL		仕入実績明細
	 * @return				消込処理した最終行、または、発注明細で初期化した入荷予定サービスの上り電文のRow
	 */
	protected ArrSchd_DtlR crtArrSchdUpdUp1(MCList<ArrSchd_DtlR> arrSchdDtlL,
			MCNumber reqQty, MCNumber pegNo, MCList<MST_ARR_SCHD_R> arrSchdL,
			MST_PO_D_R poDR, MST_ARR_PR_R arrPrR, MCRow tgtRow,
			MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01, MCList<MST_PURC_ACT_D_R> purcActDL) {
		
		String dlv_inst_d_no = isNull(tgtRow.getStringNE("PRMS_RCPT_D_NO")) ? null : tgtRow.getStringNE("DLV_INST_D_NO");
		ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
		// 条件の一致する入荷予定サービスの上り電文
		if (!reqQty.isZero()) {
			for (ArrSchd_DtlR tmpR : arrSchdDtlL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ())) {
					tmpR.peg_no(pegNo);
					if (MAC_DATA_CRUD_TYP.isCRT(tmpR.data_crud_typ())) {
						tmpR.arr_qty(MCNumber.ZERO);
						tmpR.purc_qty(MCNumber.ZERO);
						tmpR.abort_qty(MCNumber.ZERO);
					}
					else {
						tmpR.arr_qty(nvl(tmpR.arr_qty(), MCNumber.ZERO));
						tmpR.purc_qty(nvl(tmpR.purc_qty(), MCNumber.ZERO));
						tmpR.abort_qty(nvl(tmpR.abort_qty(), MCNumber.ZERO));
					}
					MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(tmpR.arr_schd_no());
					MCNumber arrActQty = tmpR.arr_qty().add(tmpR.abort_qty());
					MCNumber purcActQty = MCNumber.ZERO;
					if (!isNull(purcSchdR.purc_schd_no())) {
						purcActQty = tmpR.purc_qty().add(purcSchdR.base_unit_abort_qty().add(purcSchdR.base_unit_accpt_dfct_qty()));
					}
					if (arrActQty.gte(purcActQty)) {
						MCNumber diffQty = tmpR.base_unit_qty().subtract(arrActQty);
						if (diffQty.isNegative()) {
							continue;
						}
						if (reqQty.gt(diffQty)) {
							reqQty = reqQty.subtract(diffQty);
							tmpR.base_unit_qty(arrActQty);
						}
						else {
							tmpR.base_unit_qty(tmpR.base_unit_qty().subtract(reqQty));
							reqQty = MCNumber.ZERO;
						}
					}
					else {
						MCNumber diffQty = tmpR.base_unit_qty().subtract(purcActQty);
						if (diffQty.isNegative()) {
							continue;
						}
						if (reqQty.gt(diffQty)) {
							reqQty = reqQty.subtract(diffQty);
							tmpR.base_unit_qty(purcActQty);
						}
						else {
							tmpR.base_unit_qty(tmpR.base_unit_qty().subtract(reqQty));
							reqQty = MCNumber.ZERO;
						}
					}
					arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
					setCRUDTypForArrSchdSv(true, tmpR, arrSchdUpd01);
					arrSchdDtlR = tmpR;
				}
			}
		}
		
		if (!reqQty.isZero() && !isNull(tgtRow.getStringNE("MFG_INST_NO"))) {
			// 製造指図ＮＯ指定の入荷予定
			for (MST_ARR_SCHD_R tmpArrSchdR : arrSchdL.subList(r -> 
				isSame(r.getStringNE("po_d_no"), poDR.po_d_no()) &&
				isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlv_inst_d_no, NULL_VAL)) &&
				isSame(r.getStringNE("purc_act_d_no"), tgtRow.getStringNE("PURC_ACT_D_NO")) &&
				isNull(r.prms_rcpt_d_no()) &&
				isSame(nvl(r.mfg_inst_no(), NULL_VAL), nvl(tgtRow.getStringNE("MFG_INST_NO"), NULL_VAL))
			)) {
				// 完了分は対象外
				if (!isNull(tmpArrSchdR.rcpt_iv_no()) || isArrCmpl(tmpArrSchdR)) {
					continue;
				}
				arrSchdDtlR = ArrSchd_DtlR.create();
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(tmpArrSchdR.arr_schd_no());
				MCNumber arrActQty = tmpArrSchdR.arr_qty().add(tmpArrSchdR.abort_qty());
				MCNumber purcActQty = tmpArrSchdR.purc_qty().add(purcSchdR.base_unit_abort_qty().add(purcSchdR.base_unit_accpt_dfct_qty()));
				
				if (arrActQty.gte(purcActQty)) {
					MCNumber diffQty = tmpArrSchdR.base_unit_qty().subtract(arrActQty);
					if (diffQty.isNegative()) {
						continue;
					}
					if (reqQty.gt(diffQty)) {
						reqQty = reqQty.subtract(diffQty);
						tmpArrSchdR.base_unit_qty(arrActQty);
					}
					else {
						tmpArrSchdR.base_unit_qty(tmpArrSchdR.base_unit_qty().subtract(reqQty));
						reqQty = MCNumber.ZERO;
					}
				}
				else {
					MCNumber diffQty = tmpArrSchdR.base_unit_qty().subtract(purcActQty);
					if (diffQty.isNegative()) {
						continue;
					}
					if (reqQty.gt(diffQty)) {
						reqQty = reqQty.subtract(diffQty);
						tmpArrSchdR.base_unit_qty(purcActQty);
					}
					else {
						tmpArrSchdR.base_unit_qty(tmpArrSchdR.base_unit_qty().subtract(reqQty));
						reqQty = MCNumber.ZERO;
					}
				}

				copy(arrSchdDtlR, tmpArrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN());
				arrSchdDtlR.peg_no(pegNo);
				arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
				setCRUDTypForArrSchdSv(false, arrSchdDtlR, arrSchdUpd01);
			}
		}
		if (!reqQty.isZero()) {
			// 製造指図ＮＯが未指定の入荷予定
			for (MST_ARR_SCHD_R tmpArrSchdR : arrSchdL.subList(r ->
				isSame(r.getStringNE("po_d_no"), poDR.po_d_no()) &&
				isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlv_inst_d_no, NULL_VAL)) &&
				isSame(r.getStringNE("purc_act_d_no"), tgtRow.getStringNE("PURC_ACT_D_NO")) &&
				isNull(r.prms_rcpt_d_no()) &&
				isNull(r.mfg_inst_no())
			)) {
				// 完了分は対象外
				if (!isNull(tmpArrSchdR.rcpt_iv_no()) || isArrCmpl(tmpArrSchdR)) {
					continue;
				}
				arrSchdDtlR = ArrSchd_DtlR.create();
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(tmpArrSchdR.arr_schd_no());
				MCNumber arrActQty = tmpArrSchdR.arr_qty().add(tmpArrSchdR.abort_qty());
				MCNumber purcActQty = tmpArrSchdR.purc_qty().add(purcSchdR.base_unit_abort_qty().add(purcSchdR.base_unit_accpt_dfct_qty()));

				if (arrActQty.gte(purcActQty)) {
					MCNumber diffQty = tmpArrSchdR.base_unit_qty().subtract(arrActQty);
					if (diffQty.isNegative()) {
						continue;
					}
					if (reqQty.gt(diffQty)) {
						reqQty = reqQty.subtract(diffQty);
						tmpArrSchdR.base_unit_qty(arrActQty);
					}
					else {
						tmpArrSchdR.base_unit_qty(tmpArrSchdR.base_unit_qty().subtract(reqQty));
						reqQty = MCNumber.ZERO;
					}
				}
				else {
					MCNumber diffQty = tmpArrSchdR.base_unit_qty().subtract(purcActQty);
					if (diffQty.isNegative()) {
						continue;
					}
					if (reqQty.gt(diffQty)) {
						reqQty = reqQty.subtract(diffQty);
						tmpArrSchdR.base_unit_qty(purcActQty);
					}
					else {
						tmpArrSchdR.base_unit_qty(tmpArrSchdR.base_unit_qty().subtract(reqQty));
						reqQty = MCNumber.ZERO;
					}
				}

				copy(arrSchdDtlR, tmpArrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN());
				arrSchdDtlR.peg_no(pegNo);
				arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
				setCRUDTypForArrSchdSv(false, arrSchdDtlR, arrSchdUpd01);
			}
		}
		
		if (reqQty.isNegative()) {
			// 数量を減らし、加算する入荷予定がない場合は、発注明細、または仕入実績明細から上り電文を追加作成する
			copy(arrSchdDtlR, poDR, createMap_ArrSchd_DtlR_MST_PO_D_R());
			arrSchdDtlR.peg_no(pegNo);
			arrSchdDtlR.arr_pr_no(arrPrR.arr_pr_no());
			arrSchdDtlR.arr_cnt_rmrks(arrPrR.arr_cnt_rmrks());
			arrSchdDtlR.base_unit_qty(reqQty.negate());
			arrSchdDtlR.dlv_inst_d_no(dlv_inst_d_no);
			if (!isNull(tgtRow.getStringNE("MFG_INST_NO"))) {
				MST_MFG_INST_R mfgInst = getMfgInstCache().get(tgtRow.getStringNE("MFG_INST_NO"));
				// 製造指図が分割されていない場合(発注数と製造指図数が同一の場合)、製造指図NOを引き継ぐ
				if (isSame(arrPrR.base_unit_qty(), mfgInst.base_unit_inst_qty())) {
					arrSchdDtlR.mfg_inst_no(mfgInst.mfg_inst_no());
				}
			}
			
			if (!isNull(tgtRow.getStringNE("PURC_ACT_D_NO"))) {
				MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(MST_PURC_ACT_D_R.$purc_act_d_no, tgtRow.getStringNE("PURC_ACT_D_NO"));
				arrSchdDtlR.purc_act_d_no(tgtRow.getStringNE("PURC_ACT_D_NO"));
				arrSchdDtlR.dlv_inst_d_no(tgtRow.getStringNE("DLV_INST_D_NO"));
				arrSchdDtlR.arr_loc_cd(purcActDR.re_arr_loc_cd());
				arrSchdDtlR.str_ln_cd(purcActDR.re_arr_str_ln_cd());
				arrSchdDtlR.arr_schd_tm(purcActDR.re_arr_rqst_tm());
				arrSchdDtlR.accpt_schd_dt(purcActDR.re_arr_purc_schd_dt());
				arrSchdDtlR.sync_flg(purcActDR.re_arr_sync_flg());
			}
			
			setCRUDTypForArrSchdSv(false, arrSchdDtlR, arrSchdUpd01);
			
			reqQty = MCNumber.ZERO;
		}
		else if (reqQty.isZero() && isNull(arrSchdDtlR.itm_cd())) {
			// 対象データが存在しなかった場合、発注明細を元に初期設定。
			// 詳細項目は当メソッドの呼出元で再設定する。
			copy(arrSchdDtlR, poDR, createMap_ArrSchd_DtlR_MST_PO_D_R());
			arrSchdDtlR.peg_no(pegNo);
			arrSchdDtlR.arr_pr_no(arrPrR.arr_pr_no());
			arrSchdDtlR.arr_cnt_rmrks(arrPrR.arr_cnt_rmrks());
		}
		
		return arrSchdDtlR;
	}
	
	protected void setCRUDTypForArrSchdSv(boolean exists, ArrSchd_DtlR arrSchdDtlR,
			MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01) {
		
		if (arrSchdDtlR.base_unit_qty().isZero()) {
			arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
		else {
			if (isNull(arrSchdDtlR.arr_schd_no())) {
				arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				boolean delExists = false;
				MCIndexKey arrSchdUpd01Up1Key = arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$arr_schd_no);
				for (ArrSchd_DtlR up1R : arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, arrSchdDtlR.arr_schd_no())) {
					if(MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
						delExists = true;
					}
				}
				// 既に上り電文に削除データが存在するか
				if (delExists) {
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					arrSchdDtlR.arr_schd_no(null);
				}
				else {
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		if (!exists) {
			arrSchdUpd01.up1().add(arrSchdDtlR);
		}
	}
	
	/**
	 * 入荷予定サービスの入荷進捗用上り電文を作成
	 * @param up0 自サービスの上り電文0
	 * @param arrSchdUpd01 入荷予定
	 */
	protected void crtArrSchdUpd01Up0(MCList<Prms_Chk01_HdrR> up0, MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01) {
		MCIndexKey up0Key = up0.createIndex(Prms_Chk01_HdrR.$po_d_no);
		MCList<MST_DLV_INST_D_R> dlvInstDL = srchDlvInstD(up0);
		MCIndexKey dlvInstDKey = dlvInstDL.createIndex("po_d_no");
		MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = srchPrmsRcptD(up0);
		MCIndexKey prmsRcptDKey = prmsRcptDL.createIndex("po_d_no");
		MCIndexKey arrSchdUpd01Up1Key = arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$peg_no);

		for(Prms_Chk01_HdrR r : up0.groupBy(Prms_Chk01_HdrR.$po_d_no)) {
			Prms_Chk01_HdrR tgtUp0 = up0.getFirst(up0Key, r.po_d_no());

			// 紐付く明細が処理対象外の場合は対象外
			MCList<ArrSchd_DtlR> tmpL = arrSchdUpd01.up1().subList(arrSchdUpd01Up1Key, tgtUp0.peg_no());
			if(isNull(tmpL)) {
				continue;
			}

			MST_ARR_PR_R arrPrR = getArrPrCache(r.po_d_no());
			ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
			copy(arrPrDtlR, arrPrR, createMap_ArrPr_DtlR_MST_ARR_PR_R());
			arrPrDtlR.peg_no(tgtUp0.peg_no());
			arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			// 納入指示を集計する
			MCList<MST_DLV_INST_D_R> tmpDlvInstDL = dlvInstDL.subList(dlvInstDKey, r.po_d_no());
			if(tmpDlvInstDL.isEmpty()) {
				arrPrDtlR.dlv_inst_dt(null);
				arrPrDtlR.dlv_inst_qty(MCNumber.ZERO);
			}
			else {
				arrPrDtlR.dlv_inst_dt((MCDate)tmpDlvInstDL.max("DLV_INST_DT"));
				arrPrDtlR.dlv_inst_qty((MCNumber)tmpDlvInstDL.sum(MST_DLV_INST_D_R.$base_unit_qty));
			}

			// 納期回答受領を集計する
			MCList<MST_PRMS_RCPT_D_R> tmpPrmsRcptDL = prmsRcptDL.subList(prmsRcptDKey, tgtUp0.po_d_no());
			if(tmpPrmsRcptDL.isEmpty()) {
				clearArrPrKPIInfo(arrPrDtlR);
			}
			else {
				MCDate prmsDlvDt = null;
				MCDate prmsRcptDt = null;
				MCDate dlvInstPrmsRcptDt = null;
				MCDate prmsReflDt = null;
				MCDate dlvInstPrmsReflDt = null;
				MCNumber prmsRcptQty = MCNumber.ZERO;
				MCNumber dlvInstPrmsRcptQty = MCNumber.ZERO;
				MCNumber prmsReflQty = MCNumber.ZERO;
				MCNumber dlvInstPrmsReflQty = MCNumber.ZERO;
				MCIndexKey arrSchdUpd01Up1KeyByPrmsRcptD = arrSchdUpd01.up1().createIndex(ArrSchd_DtlR.$prms_rcpt_d_no);
				boolean exists = false;
				for(MST_PRMS_RCPT_D_R prmsRcptR : tmpPrmsRcptDL) {
					if (prmsRcptR.can_flg()) {
						continue;
					}
					ArrSchd_DtlR tmpArrSchdDtlR = arrSchdUpd01.up1().getFirst(arrSchdUpd01Up1KeyByPrmsRcptD, prmsRcptR.prms_rcpt_d_no());
					if (isNull(prmsDlvDt) || prmsDlvDt.lt(prmsRcptR.prms_dlv_tm())) {
						prmsDlvDt = prmsRcptR.prms_dlv_tm();
					}
					if (isNull(prmsRcptR.dlv_inst_d_no())) {
						prmsRcptQty = prmsRcptQty.add(prmsRcptR.base_unit_qty());
						if (isNull(prmsRcptDt) || prmsRcptDt.lt(prmsRcptR.getDateNE("PRMS_RCPT_DT"))) {
							prmsRcptDt = prmsRcptR.getDateNE("PRMS_RCPT_DT");
						}
					}
					else {
						dlvInstPrmsRcptQty = dlvInstPrmsRcptQty.add(prmsRcptR.base_unit_qty());
						if (isNull(dlvInstPrmsRcptDt) || dlvInstPrmsRcptDt.lt(prmsRcptR.getDateNE("PRMS_RCPT_DT"))) {
							dlvInstPrmsRcptDt = prmsRcptR.getDateNE("PRMS_RCPT_DT");
						}
					}

					if(!isNull(tmpArrSchdDtlR)) {
						if(!MAC_DATA_CRUD_TYP.isDEL(tmpArrSchdDtlR.data_crud_typ())) {
							exists = true;
							if (isNull(prmsRcptR.dlv_inst_d_no())) {

								if (prmsRcptR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
									prmsReflQty = prmsReflQty.add(tmpArrSchdDtlR.base_unit_qty());
								}
								if (isNull(prmsReflDt) || prmsReflDt.lt(prmsRcptR.getDateNE("ARR_SCHD_REFL_DT"))) {
									prmsReflDt = prmsRcptR.getDateNE("ARR_SCHD_REFL_DT");
								}

							}
							else {

								if (prmsRcptR.getBooleanNE("ARR_SCHD_REFL_FLG")) {
									dlvInstPrmsReflQty = dlvInstPrmsReflQty.add(tmpArrSchdDtlR.base_unit_qty());
								}
								if (isNull(dlvInstPrmsReflDt) || dlvInstPrmsReflDt.lt(prmsRcptR.getDateNE("ARR_SCHD_REFL_DT"))) {
									dlvInstPrmsReflDt = prmsRcptR.getDateNE("ARR_SCHD_REFL_DT");
								}
							}
						}
					}
				}

					if(!exists){
						clearArrPrKPIInfo(arrPrDtlR);
					}
					arrPrDtlR.prms_refl_qty(prmsReflQty);
					arrPrDtlR.dlv_inst_prms_refl_qty(dlvInstPrmsReflQty);
					arrPrDtlR.prms_refl_dt(prmsReflDt);
					arrPrDtlR.dlv_inst_prms_refl_dt(dlvInstPrmsReflDt);
					arrPrDtlR.prms_rcpt_dt(prmsRcptDt);
					arrPrDtlR.dlv_inst_prms_rcpt_dt(dlvInstPrmsRcptDt);
					arrPrDtlR.prms_rcpt_qty(prmsRcptQty);
					arrPrDtlR.dlv_inst_prms_rcpt_qty(dlvInstPrmsRcptQty);
					arrPrDtlR.prms_refl_qty(prmsReflQty);
					arrPrDtlR.dlv_inst_prms_refl_qty(dlvInstPrmsReflQty);

					// 打切数量を除いた数量の分（発注明細に対する全数）だけ回答を受領していた場合のみ設定する項目
					if (prmsRcptQty.add(dlvInstPrmsRcptQty)
							.gte(arrPrR.base_unit_qty().add(arrPrR.re_arr_schd_qty()).subtract(arrPrR.arr_schd_abort_qty()))) {
						arrPrDtlR.prms_dlv_dt(prmsDlvDt.trunc(MCDateFieldType.DAY));
					}
					else {
						arrPrDtlR.prms_dlv_dt(null);
				}
			}
			arrSchdUpd01.up0().add(arrPrDtlR);
		}
	}
	
	protected Map_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN<ArrSchd_DtlR,MST_ARR_SCHD_R> createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN() {
		return new Map_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN<ArrSchd_DtlR, MST_ARR_SCHD_R>();
	}

	public class Map_ArrSchd_DtlR_MST_ARR_SCHD_R_CMN<D extends ArrSchd_DtlR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
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
	
	/**
	 * 納入指示・納期回答を引当可能なフリーな入荷予定を取得する。<br />
	 * 優先順位は下記の通り。<br />
	 * 優先順位１．納入指示明細・製造指図に紐づく入荷予定<br />
	 * 優先順位２．製造指図に紐づく入荷予定<br />
	 * 優先順位３．納入指示明細に紐づく入荷予定<br />
	 * 優先順位４．納入指示明細ＮＯなし・製造指図ＮＯなし<br />
	 * @param arrSchdL フリーな入荷予定の取得元になる入荷予定リスト
	 * @param po_d_no 発注明細ＮＯ
	 * @param dlv_inst_d_no 納入指示明細ＮＯ
	 * @param purc_act_d_no 仕入実績明細ＮＯ
	 * @param prms_rcpt_d_no 納入指示明細ＮＯ
	 * @param mfg_inst_no 製造指図ＮＯ
	 * @return フリーな入荷予定
	 */
	protected MCList<MST_ARR_SCHD_R> getFreeArrSchdL(MCList<MST_ARR_SCHD_R> arrSchdL, String po_d_no, String dlv_inst_d_no, String purc_act_d_no, String prms_rcpt_d_no, String mfg_inst_no){
		MCList<MST_ARR_SCHD_R> arrSchdFreeL = MCList.create(MST_ARR_SCHD_R.class);
		// 優先順位１
		arrSchdFreeL = arrSchdL.subList(r -> 
			isSame(r.getStringNE("po_d_no"), po_d_no) &&
			isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlv_inst_d_no, NULL_VAL)) &&
			isSame(r.purc_act_d_no(), purc_act_d_no) &&
			isSame(nvl(r.prms_rcpt_d_no(), NULL_VAL), nvl(prms_rcpt_d_no, NULL_VAL)) &&
			isSame(nvl(r.mfg_inst_no(), NULL_VAL), nvl(mfg_inst_no, NULL_VAL))
		);
		if (arrSchdFreeL.isEmpty()) {
			// 優先順位２
			arrSchdFreeL = arrSchdL.subList(r -> 
				isSame(r.getStringNE("po_d_no"), po_d_no) &&
				isNull(r.dlv_inst_d_no()) &&
				isSame(r.purc_act_d_no(), purc_act_d_no) &&
				isSame(nvl(r.prms_rcpt_d_no(), NULL_VAL), nvl(prms_rcpt_d_no, NULL_VAL)) &&
				isSame(nvl(r.mfg_inst_no(), NULL_VAL), nvl(mfg_inst_no, NULL_VAL))
			);
			if (arrSchdFreeL.isEmpty()) {
				// 優先順位３
				arrSchdFreeL = arrSchdL.subList(r -> 
					isSame(r.getStringNE("po_d_no"), po_d_no) &&
					isSame(nvl(r.dlv_inst_d_no(), NULL_VAL), nvl(dlv_inst_d_no, NULL_VAL)) &&
					isSame(r.purc_act_d_no(), purc_act_d_no) &&
					isSame(nvl(r.prms_rcpt_d_no(), NULL_VAL), nvl(prms_rcpt_d_no, NULL_VAL)) &&
					isNull(r.mfg_inst_no())
				);
				if (arrSchdFreeL.isEmpty()) {
					// 優先順位４
					arrSchdFreeL = arrSchdL.subList(r -> 
						isSame(r.getStringNE("po_d_no"), po_d_no) &&
						isNull(r.dlv_inst_d_no()) &&
						isSame(r.purc_act_d_no(), purc_act_d_no) &&
						isSame(nvl(r.prms_rcpt_d_no(), NULL_VAL), nvl(prms_rcpt_d_no, NULL_VAL)) &&
						isNull(r.mfg_inst_no())
					);
				}
			}
		}
		return arrSchdFreeL;
	}

	protected void callPurcPrntUpd02Cmn(MCList<? extends MCRow> tgtL, MCList<? extends MCRow> dtlL) {
		MCList<PurcPrnt_Upd02_HdrR> lst = MCList.create(PurcPrnt_Upd02_HdrR.class);
		setAll(lst, tgtL, createMap_PurcPrnt_Upd02_HdrR_MCRow());
		
		MSBDL_PurcPrntService.PurcPrnt_Upd02 delOpe = MSBDL_PurcPrntService.crtPurcPrnt_Upd02();
		MSBDL_PurcPrntService.PurcPrnt_Upd02 updOpe = MSBDL_PurcPrntService.crtPurcPrnt_Upd02();
		for (PurcPrnt_Upd02_HdrR r : lst.distinctNE(PurcPrnt_Upd02_HdrR.$po_no)) {
			// 納入指示または納期回答受領を更新した結果、発注または納入指示の状謡に戻す場合は、
			// いったん出荷帳票発行サービスを削除で呼び出す。その後、更新で納品伝票を再作成する
			if (r.getBooleanNE("dlv_slip_rvt_flg")) {
				PurcPrnt_Upd02_HdrR tmpR = r.clone();
				tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				// 納品書はオペレーション実行後にPrnt01で発行する
				tmpR.dlv_slip_prnt_flg(false);
				delOpe.up0().add(tmpR);
				
				// 発注や納入指示の状態に戻す場合は、納品書は発行しない
				r.dlv_slip_prnt_flg(false);
			}
			
			updOpe.up0().add(r);
		}
		
		if (!delOpe.up0().isEmpty()) {
			setPegNo(PurcPrnt_Upd02_HdrR.$hdr_peg_no, delOpe.up0());
			delOpe.exec();
			
			// 取消分の納品書を発行する
			if (!isNull(_purcPrntPrnt01Up4L)) {
				// 発注や納入指示に戻すのみ抽出（元のリストは戻す、戻さない関係なく設定されている）
				MCIndexKey idx = lst.createIndex(PurcPrnt_Upd02_HdrR.$po_no);
				MCList<PurcPrnt_Prnt01_DlvSlipR>  up4L = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
				for (PurcPrnt_Prnt01_DlvSlipR up4R : _purcPrntPrnt01Up4L) {
					PurcPrnt_Upd02_HdrR r = lst.getFirst(idx, up4R.po_no());
					if (r.getBooleanNE("dlv_slip_rvt_flg")) {
						up4L.add(up4R);
					}
				}
				if (!up4L.isEmpty()) {
					setPegNo(up4L);
					MSBDL_PurcPrntService.PurcPrnt_Prnt01 prntOpe = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
					prntOpe.up3().indiv_prnt_flg(lst.get(0).indiv_prnt_flg());
					prntOpe.up4().setAll(up4L);
					prntOpe.exec();
				}
			}
		}
		if (!updOpe.up0().isEmpty()) {
			setPegNo(PurcPrnt_Upd02_HdrR.$hdr_peg_no, updOpe.up0());
			updOpe.exec();
			for (PurcPrnt_Upd02_DtlR downR : updOpe.down1()) {
				for (MCRow dtlR : dtlL) {
					if (dtlR instanceof DlvInst_Chk01_DtlR) {
						if(isSame(dtlR.getString("dlv_inst_d_no"), downR.dlv_inst_d_no())) {
							dtlR.setString("purc_ddlv_dlv_slip_no", downR.purc_ddlv_dlv_slip_no());
							dtlR.setNumber("purc_ddlv_dlv_slip_seq", downR.purc_ddlv_dlv_slip_seq());
							dtlR.setNumber("purc_ddlv_dlv_slip_rev", downR.purc_ddlv_dlv_slip_rev());
							dtlR.setString("purc_ddlv_dlv_slip_d_no", downR.purc_ddlv_dlv_slip_d_no());
						}
					}
					else if (dtlR instanceof Prms_Chk01_DtlR) {
						if(isSame(dtlR.getString("prms_rcpt_d_no"), downR.prms_rcpt_d_no())) {
							dtlR.setString("purc_ddlv_dlv_slip_no", downR.purc_ddlv_dlv_slip_no());
							dtlR.setNumber("purc_ddlv_dlv_slip_seq", downR.purc_ddlv_dlv_slip_seq());
							dtlR.setNumber("purc_ddlv_dlv_slip_rev", downR.purc_ddlv_dlv_slip_rev());
							dtlR.setString("purc_ddlv_dlv_slip_d_no", downR.purc_ddlv_dlv_slip_d_no());
						}
					}
				}
			}
		}
	}
	protected MCList<PurcPrnt_Prnt01_DlvSlipR> _purcPrntPrnt01Up4L;
	protected void initPurcPrntPrnt01Cmn(MCList<? extends MCRow> tgtL) {
		_purcPrntPrnt01Up4L = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
		
		if (tgtL.isEmpty()) {
			return;
		}
		
		// 発注や納入指示の状態に戻すときに発行する取消伝票を取得する
		MST_PURC_DLV_SLIP_R t1 = MST_PURC_DLV_SLIP_R.create("T1");
		MST_PURC_DLV_SLIP_D_R t2 = MST_PURC_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R t3 = MST_DLV_SLIP_R.create("T3");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
		bldr.setDistinct();
		bldr.setSelect(
			t1.dlv_slip_mng_no, t1.dlv_slip_mng_seq, t1.po_no,
			t1.dlv_inst_grp_no, t1.prms_rcpt_grp_no, t1.purc_dlv_slip_src_typ,
			t3.dlv_slip_no, t3.dlv_slip_seq, t3.slip_sts_typ, t3.slip_prnt_flg
		);
		bldr.addInnerJoin(t2,
			t2.dlv_slip_mng_no.eq(t1.dlv_slip_mng_no)
			.and(t2.dlv_slip_mng_seq.eq(t1.dlv_slip_mng_seq))
		);
		bldr.addInnerJoin(t3,
			t3.dlv_slip_no.eq(t2.purc_ddlv_dlv_slip_no)
			.and(t3.dlv_slip_seq.eq(t2.purc_ddlv_dlv_slip_seq))
		);
		bldr.setWhere(t1.po_no.eq(bind("po_no")));
		bldr.addWhereWithCutOffAnd(t1.dlv_inst_grp_no.eq(bind("dlv_inst_grp_no")));
		bldr.addWhereWithCutOffAnd(t1.prms_rcpt_grp_no.eq(bind("prms_rcpt_grp_no")));
		
		MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
		dbSelect("MSBDL5120_MST_DLV_SLIP_S01", rsltL, bldr, tgtL.distinctNE("po_no"));
		
		for (MCList<MST_DLV_SLIP_R> gl : rsltL.groupList(MST_DLV_SLIP_R.$dlv_slip_no)) {
			gl.sort(SortType.DESC, MST_DLV_SLIP_R.$dlv_slip_seq);
			
			MST_DLV_SLIP_R glR = gl.get(0);
			if (MSC_PURC_DLV_SLIP_SRC_TYP.isPO(glR.getStringNE("purc_dlv_slip_src_typ"))) {
				// 発行する取消の納品書は、納入指示または納期回答受領で作成した分のみ
				continue;
			}
			
			for (MST_DLV_SLIP_R r : gl) {
				if (MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())) {
					continue;
				}
				else if (!isColSame(r, glR, "purc_dlv_slip_src_typ", "dlv_inst_grp_no", "prms_rcpt_grp_no")) {
					// 発行する取消の納品書は、最新の納品書と作成元が同じ分のみ
					break;
				}
				else if (r.slip_prnt_flg()) {
					PurcPrnt_Prnt01_DlvSlipR upR = _purcPrntPrnt01Up4L.add();
					upR.po_no(r.getStringNE("po_no"));
					upR.dlv_slip_mng_no(r.getStringNE("dlv_slip_mng_no"));
					upR.dlv_slip_mng_seq(r.getNumberNE("dlv_slip_mng_seq"));
					upR.purc_ddlv_dlv_slip_no(r.dlv_slip_no());
					upR.purc_ddlv_dlv_slip_seq(r.dlv_slip_seq().add(1));	// 取消分を発行するので+1
					break;
				}
			}
		}
	}
	protected Map_PurcPrnt_Upd02_HdrR_MCRow<PurcPrnt_Upd02_HdrR,MCRow> createMap_PurcPrnt_Upd02_HdrR_MCRow() {
		return new Map_PurcPrnt_Upd02_HdrR_MCRow<PurcPrnt_Upd02_HdrR, MCRow>();
	}
	public class Map_PurcPrnt_Upd02_HdrR_MCRow<D extends PurcPrnt_Upd02_HdrR, S extends MCRow> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.po_no(getPoDCache().get(src.getStringNE("po_d_no")).po_no());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			dest.dlv_slip_prnt_flg(src.getBooleanNE("purc_ddlv_dlv_slip_print_flg"));
			dest.indiv_prnt_flg(src.getBooleanNE("indiv_prnt_flg"));
			dest.setBooleanNE("dlv_slip_rvt_flg", src.getBooleanNE("dlv_slip_rvt_flg"));
		}
	}
	
	protected MCList<MST_DLV_INST_R> getDlvInst(MCList<?> dtlL) {
		// ワークテーブルの作成
		MCList<MST_PO_D_R> wkL = MCList.create(MST_PO_D_R.class);
		for (MCRow r : dtlL.groupBy("po_d_no")) {
			wkL.add().po_d_no(r.getString("po_d_no"));
		}
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		dbWkDelete("MSBDL5120_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5120_MSW_PO_D_I01", wkL, wkL_bldr.getBaseDbc());
		
		// 納入指示ＩＦ送信対象を取得
		MCList<MST_DLV_INST_R> dlvInstEdiL = MCList.create(MST_DLV_INST_R.class);
		dlvInstEdiL.addBooleanColumn("del_edi_dlv_inst_flg");
		MCMainQuery q = get_MST_DLV_INST_S05_sql();
		q.executeQuery(dlvInstEdiL);
		
		return dlvInstEdiL;
	}
	public MCMainQuery get_MST_DLV_INST_S05_sql() {
		MST_DLV_INST_SEND_IF_R S0_DLVINSTIF = MST_DLV_INST_SEND_IF_R.create("DLVINSTIF");
		MSW_PO_D_KEY_R S0_PODW = MSW_PO_D_KEY_R.create("PODW");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MCTempView S0_DLVINSTIFG = createTempView("DLVINSTIFG");
		MST_DLV_INST_SEND_IF_R S1 = MST_DLV_INST_SEND_IF_R.create();
		
		MCMainQuery q = sql("MSBDL5120_MST_DLV_INST_S05")
				.mainQuery()
				.select(
					S0_DLVINSTIF.po_d_no,
					cases()
						.when(
							S0_DLVINSTIF.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
							.or(S0_DLVINSTIF.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.UPD.value())))
						)
							.then(value(true))
						.otherwise(value(false)).as("del_edi_dlv_inst_flg")
				)
				.from(
					S0_PODW
					.innerJoin(S0_DLVINSTIF).on(S0_DLVINSTIF.po_d_no.eq(S0_PODW.po_d_no))
					.innerJoin(S0_IFCTL).on(
						S0_IFCTL.ext_sys_cd.eq(S0_DLVINSTIF.ext_sys_cd)
						.and(S0_IFCTL.bp_cd.eq(S0_DLVINSTIF.sppl_cd))
						.and(value(getToday()).between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
						.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
						.and(S0_IFCTL.del_flg.eq(value(false)))
					)
					.innerJoin(
						subQuery()
						.select(
							S1.ext_sys_cd,
							S1.po_d_no,
							max(S1.data_lno).as("data_lno")
						)
						.from(S1)
						.groupBy(
							S1.ext_sys_cd,
							S1.po_d_no
						).view(S0_DLVINSTIFG)
					).on(
						S0_DLVINSTIF.ext_sys_cd.eq(S0_DLVINSTIFG.pr(S1.ext_sys_cd))
						.and(S0_DLVINSTIF.po_d_no.eq(S0_DLVINSTIFG.pr(S1.po_d_no)))
						.and(S0_DLVINSTIF.data_lno.eq(S0_DLVINSTIFG.pr("data_lno")))
					)
				);
		return q;
	}

	//FMCB CUSTOM END
}