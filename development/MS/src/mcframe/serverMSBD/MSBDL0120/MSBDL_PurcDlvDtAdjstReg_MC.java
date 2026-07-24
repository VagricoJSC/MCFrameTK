package mcframe.serverMSBD.MSBDL0120;

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
import mcframe.serverMSBD.MSBDL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBD.MSBDL0120.Query.*;
import mcframe.serverMSBC.MSBCL6130.*;
import mcframe.serverMSBD.MSBDL5120.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBE.MSBEL5900.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL0010.*;
import java.util.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDlvDtAdjstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDlvDtAdjstReg_MC extends MSBDL_PurcDlvDtAdjstReg_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBDL_PurcDlvDtAdjstReg> CLAZZ = MSBDL_PurcDlvDtAdjstReg.class;
	
	/** 入荷進捗キャッシュ　*/
	protected MCList<MST_ARR_PR_R> _arrPrL = null; 
	
	/** 更新対象の入荷予定キャッシュ */
	protected MCList<MST_ARR_SCHD_R> _arrSchdL = null;
	/** 更新対象の入荷予定キャッシュ用インデックス */
	protected MCIndexKey _arrSchdKey = null;

	/** 製造指図ＮＯに紐付く入荷実績キャッシュ */
	protected MCList<MST_ARR_ACT_R> _arrActByMfgInstNoL = null;
	/** 製造指図ＮＯに紐付く入荷実績キャッシュ用インデックス */
	protected MCIndexKey _arrActByMfgInstNoKey = null;
	
	/** 発注明細キャッシュ */
	protected MCList<MST_PO_D_R> _poDL = null;
	/** 発注明細キャッシュ用インデックス */
	protected MCIndexKey _poDKey = null; 

	/** 発注ヘッダキャッシュ */
	protected MCList<MST_PO_R> _poL = null;
	/** 発注ヘッダキャッシュ用インデックス */
	protected MCIndexKey _poKey = null;

	/** 仕入予定キャッシュ */
	protected MCList<MST_PURC_SCHD_R> _purcSchdL = null;
	/** 仕入予定キャッシュ用インデックス */
	protected MCIndexKey _purcSchdKey = null;
	
	/** 支給予定キャッシュ */
	protected MCList<MST_PROV_SCHD_R> _provSchdL = null;
	/** 支給予定キャッシュ用インデックス */
	protected MCIndexKey _provSchdKey = null;

	/** 納入指示明細キャッシュ */
	protected MCList<MST_DLV_INST_D_R> _dlvInstDL = null;
	/** 納入指示明細キャッシュ用インデックス */
	protected MCIndexKey _dlvInstDKey = null;
	/** 納期回答受領明細キャッシュ */
	protected MCList<MST_PRMS_RCPT_D_R> _prmsRcptDL = null;
	/** 納期回答受領明細キャッシュ用インデックス */
	protected MCIndexKey _prmsRcptDKey = null;

	/** 品目マスタキャッシュ */
	protected MCList<MAM_ITM_R> _itmL = null;
	/** 品目マスタキャッシュ用インデックス */
	protected MCIndexKey _itmKey = null;
	
	/** 品目単位マスタキャッシュ */
	protected MCList<MAVM_ITM_UNIT_R> _itmUnitL = null;
	/** 品目単位マスタキャッシュ用インデックス */
	protected MCIndexKey _itmUnitKey = null;
	

	/**
	 * 入荷進捗キャッシュを作成する
	 * @param dtlL 発注明細ＮＯが含まれる上り電文リスト
	 */
	protected static void initArrPrCache(MCList<Chk05_DtlR> dtlL) {
		object(CLAZZ)._initArrPrCache(dtlL);
	}
	protected void _initArrPrCache(MCList<Chk05_DtlR> dtlL) {
		_arrPrL = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
		arrPrL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL0120_MST_ARR_PR_S01", _arrPrL, arrPrL_bldr, dtlL.groupBy(Chk05_DtlR.$po_d_no));
	}
	/**
	 * 格納されている入荷進捗キャッシュを全て取得する
	 * @return 入荷進捗キャッシュ
	 */
	protected static MCList<MST_ARR_PR_R> getArrPrCache() {
		return object(CLAZZ)._arrPrL;
	}

	/**
	 * 更新対象の入荷予定キャッシュを作成する
	 * @param dtlL 入荷進捗ＮＯが含まれる上り電文リスト
	 */
	protected static void initArrSchdCache(MCList<Chk05_DtlR> dtlL) {
		object(CLAZZ)._initArrSchdCache(dtlL);
	}
	protected void _initArrSchdCache(MCList<Chk05_DtlR> dtlL) {
		_arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
		MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
		dbSelectKey("MSBDL0120_MST_ARR_SCHD_S02", _arrSchdL, arrSchdL_bldr, dtlL);
		_arrSchdKey = _arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
	}
	/**
	 * 更新対象の入荷予定キャッシュを取得する</p>
	 * 入荷予定ＮＯを検索条件に使用する
	 * @param arrSchdNo 入荷予定ＮＯ
	 * @return 入荷予定キャッシュ
	 */
	protected static MST_ARR_SCHD_R getArrSchdCache(String arrSchdNo) {
		return object(CLAZZ)._getArrSchdCache(arrSchdNo);
	}
	protected MST_ARR_SCHD_R _getArrSchdCache(String arrSchdNo) {
		return _arrSchdL.getFirst(_arrSchdKey, arrSchdNo);
	}

	/**
	 * 格納されている入荷予定キャッシュを全て取得する
	 * @return 入荷予定キャッシュ
	 */
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdL;
	}
	/**
	 * 製造指図ＮＯに紐付く入荷実績キャッシュを作成する
	 * @param arrSchdL 製造指図ＮＯが含まれるリスト
	 */
	protected static void initArrActByMfgInstNoCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		object(CLAZZ)._initArrActByMfgInstNoCache(arrSchdL);
	}
	protected void _initArrActByMfgInstNoCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
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
		dbSelectForUpdate("MSBDL0120_MST_ARR_ACT_S01", _arrActByMfgInstNoL, arrActByMfgInstNoL_bldr, arrSchdL);
		_arrActByMfgInstNoKey = _arrActByMfgInstNoL.createIndex("mfg_inst_no");
	}
	/**
	 * 製造指図ＮＯに紐付く入荷実績キャッシュを取得する</p>
	 * 製造指図ＮＯを検索条件に使用する
	 * @param mfgInstNo 製造指図ＮＯ
	 * @return 入荷実績キャッシュ
	 */
	protected static MCList<MST_ARR_ACT_R> getArrActCacheByMfgInstNo(String mfgInstNo) {
		return object(CLAZZ)._getArrActCacheByMfgInstNo(mfgInstNo);
	}
	protected MCList<MST_ARR_ACT_R> _getArrActCacheByMfgInstNo(String mfgInstNo) {
		return _arrActByMfgInstNoL.subList(_arrActByMfgInstNoKey, mfgInstNo);
	}

	/**
	 * 発注明細キャッシュを作成する
	 * @param dtlL 発注明細ＮＯが含まれる上り電文リスト
	 */
	protected static void initPoDCache(MCList<Chk05_DtlR> dtlL) {
		object(CLAZZ)._initPoDCache(dtlL);
	}
	protected void _initPoDCache(MCList<Chk05_DtlR> dtlL) {
		_poDL = MCList.create(MST_PO_D_R.class);
		MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		dbSelectKey("MSBDL0120_MST_PO_D_S01", _poDL, poDL_bldr, dtlL.groupBy(Chk05_DtlR.$po_d_no));
		_poDKey = _poDL.createIndex(MST_PO_D_R.$po_d_no);
	}
	/**
	 * 格納されている発注明細キャッシュを全て取得する
	 * @return 発注明細キャッシュ
	 */
	protected static MCList<MST_PO_D_R> getPoDCache() {
		return object(CLAZZ)._poDL;
	}
	/**
	 * 格納されている発注明細キャッシュを取得する</p>
	 * 発注明細ＮＯを検索条件に使用する
	 * @param poDNo 発注明細ＮＯ
	 * @return 発注明細キャッシュ
	 */
	protected static MST_PO_D_R getPoDCacheByPoD(String poDNo) {
		return object(CLAZZ)._getPoDCacheByPoD(poDNo);
	}
	protected MST_PO_D_R _getPoDCacheByPoD(String poDNo) {
		return _poDL.getFirst(_poDKey, poDNo);
	}	

	/**
	 * 発注ヘッダキャッシュを作成する
	 * @param poDL 発注ＮＯが含まれるリスト
	 */
	protected static void initPoCache(MCList<MST_PO_D_R> poDL) {
		object(CLAZZ)._initPoCache(poDL);
	}
	protected void _initPoCache(MCList<MST_PO_D_R> poDL) {
		_poL = MCList.create(MST_PO_R.class);
		MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
		dbSelectKey("MSBDL0120_MST_PO_S01", _poL, poL_bldr, poDL.groupBy(MST_PO_R.$po_no));
		_poKey = _poL.createIndex(MST_PO_R.$po_no);
	}
	/**
	 * 格納されている発注ヘッダキャッシュを取得する</p>
	 * 発注ＮＯを検索条件に使用する
	 * @param poNo 発注ＮＯ
	 * @return 発注ヘッダキャッシュ
	 */
	protected static MST_PO_R getPoDCache(String poNo) {
		return object(CLAZZ)._getPoCache(poNo);
	}
	protected MST_PO_R _getPoCache(String poNo) {
		return _poL.getFirst(_poKey, poNo);
	}

	/**
	 * 仕入予定キャッシュを作成する
	 * @param dtlL 入荷予定ＮＯが含まれる上り電文リスト
	 */
	protected static void initPurcSchdCache(MCList<Chk05_DtlR> dtlL) {
		object(CLAZZ)._initPurcSchdCache(dtlL);
	}
	protected void _initPurcSchdCache(MCList<Chk05_DtlR> dtlL) {
		_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);
		purcSchdL_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
		dbSelect("MSBDL0120_MST_PURC_SCHD_S01", _purcSchdL, purcSchdL_bldr, dtlL);
		_purcSchdKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
	}
	/**
	 * 格納されている仕入予定キャッシュを取得する</p>
	 * 入荷予定ＮＯを検索条件に使用する
	 * @param arrSchdNo 入荷予定ＮＯ
	 * @return 仕入予定キャッシュ
	 */
	protected static MST_PURC_SCHD_R getPurcSchdCache(String arrSchdNo) {
		return object(CLAZZ)._getPurcSchdCache(arrSchdNo);
	}
	protected MST_PURC_SCHD_R _getPurcSchdCache(String arrSchdNo) {
		return _purcSchdL.getFirst(_purcSchdKey, arrSchdNo);
	}

	
	/**
	 * 支給予定キャッシュを作成する
	 * @param dtlL 発注明細ＮＯが含まれる上り電文リスト
	 */
	protected static void initProvSchdCache(MCList<Chk05_DtlR> dtlL) {
		object(CLAZZ)._initProvSchdCache(dtlL);
	}
	protected void _initProvSchdCache(MCList<Chk05_DtlR> dtlL) {
		_provSchdL = MCList.create(MST_PROV_SCHD_R.class);
		MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
		MCQueryApiBuilder provSchdL_bldr = MCQueryApiBuilder.create(t);
		provSchdL_bldr.setWhere(t.prov_src_schd_no1.eq(bind("po_d_no")));
		provSchdL_bldr.addWhereWithAnd(t.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())));
		dbSelect("MSBDL0120_MST_PROV_SCHD_S01", _provSchdL, provSchdL_bldr, dtlL.groupBy(Chk05_DtlR.$po_d_no));
		_provSchdKey = _provSchdL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_no1);
	}
	/**
	 * 格納されている支給予定キャッシュを取得する</p>
	 * 支給予定ＮＯを検索条件に使用する
	 * @param poDNo 発注明細ＮＯ
	 * @return 支給予定キャッシュ
	 */
	protected static MST_PROV_SCHD_R getProvSchdCache(String poDNo) {
		return object(CLAZZ)._getProvSchdCache(poDNo);
	}
	protected MST_PROV_SCHD_R _getProvSchdCache(String poDNo) {
		return _provSchdL.getFirst(_provSchdKey, poDNo);
	}

	/**
	 * 納入指示明細キャッシュを作成する
	 * @param dtlL 発注明細ＮＯが含まれる上り電文リスト
	 */
	protected static void initDlvInstDCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		object(CLAZZ)._initDlvInstDCache(arrSchdL);
	}
	protected void _initDlvInstDCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		_dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
		_dlvInstDL.addStringColumn(MST_DLV_INST_R.$dlv_inst_grp_no);
		MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MST_DLV_INST_R DLVINST = MST_DLV_INST_R.create("DLVINST");
		MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(DLVINSTD);
		dlvInstDL_bldr.addSelect(DLVINST.dlv_inst_grp_no);
		dlvInstDL_bldr.addInnerJoin(DLVINST, DLVINSTD.dlv_inst_no.eq(DLVINST.dlv_inst_no));
		dlvInstDL_bldr.addInnerJoin(ARRSCHD, DLVINSTD.dlv_inst_d_no.eq(ARRSCHD.dlv_inst_d_no));
		dlvInstDL_bldr.setWhere(ARRSCHD.arr_schd_no.eq(bind("arr_schd_no")));
		dlvInstDL_bldr.addWhereWithAnd(DLVINSTD.can_flg.eq(value(false)));
		dbSelect("MSBDL0120_MST_DLV_INST_D_S03", _dlvInstDL, dlvInstDL_bldr, arrSchdL);
		_dlvInstDKey = _dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
	}
	/**
	 * 格納されている納入指示明細キャッシュを取得する</p>
	 * @param dlvInstDNo 納入指示明細ＮＯ
	 * @return 納入指示明細キャッシュ
	 */
	protected static MST_DLV_INST_D_R getDlvInstDCache(String dlvInstDNo) {
		return object(CLAZZ)._getDlvInstDCache(dlvInstDNo);
	}
	protected MST_DLV_INST_D_R _getDlvInstDCache(String dlvInstDNo) {
		return _dlvInstDL.getFirst(_dlvInstDKey, dlvInstDNo);
	}
	/**
	 * 納期回答受領明細キャッシュを作成する
	 * @param dtlL 発注明細ＮＯが含まれる上り電文リスト
	 */
	protected static void initPrmsRcptDCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		object(CLAZZ)._initPrmsRcptDCache(arrSchdL);
	}
	protected void _initPrmsRcptDCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		_prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
		_prmsRcptDL.addStringColumn(MST_PRMS_RCPT_R.$prms_rcpt_grp_no);
		MST_PRMS_RCPT_D_R PRMSRCPTD = MST_PRMS_RCPT_D_R.create("PRMSRCPTD");
		MST_PRMS_RCPT_R PRMSRCPT = MST_PRMS_RCPT_R.create("PRMSRCPT");
		MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(PRMSRCPTD);
		prmsRcptDL_bldr.addSelect(PRMSRCPT.prms_rcpt_grp_no);
		prmsRcptDL_bldr.addInnerJoin(PRMSRCPT, PRMSRCPTD.prms_rcpt_no.eq(PRMSRCPT.prms_rcpt_no));
		prmsRcptDL_bldr.addInnerJoin(ARRSCHD, PRMSRCPTD.prms_rcpt_d_no.eq(ARRSCHD.prms_rcpt_d_no));
		prmsRcptDL_bldr.setWhere(ARRSCHD.arr_schd_no.eq(bind("arr_schd_no")));
		prmsRcptDL_bldr.addWhereWithAnd(PRMSRCPTD.can_flg.eq(value(false)));
		dbSelect("MSBDL0120_MST_PRMS_RCPT_D_S03", _prmsRcptDL, prmsRcptDL_bldr, arrSchdL);
		_prmsRcptDKey = _prmsRcptDL.createIndex(MST_PRMS_RCPT_D_R.$prms_rcpt_d_no);
	}
	/**
	 * 格納されている納期回答受領明細キャッシュを取得する</p>
	 * @param prmsRcptDNo 納期回答受領明細ＮＯ
	 * @return 納期回答受領明細キャッシュ
	 */
	protected static MST_PRMS_RCPT_D_R getPrmsRcptDCache(String prmsRcptDNo) {
		return object(CLAZZ)._getPrmsRcptDCache(prmsRcptDNo);
	}
	protected MST_PRMS_RCPT_D_R _getPrmsRcptDCache(String prmsRcptDNo) {
		return _prmsRcptDL.getFirst(_prmsRcptDKey, prmsRcptDNo);
	}
	
	/**
	 * 品目マスタキャッシュを作成する
	 * @param poDL 発注ＮＯが含まれるリスト
	 */
	protected static void initItmCache(MCList<MST_PO_D_R> poDL) {
		object(CLAZZ)._initItmCache(poDL);
	}
	protected void _initItmCache(MCList<MST_PO_D_R> poDL) {
		_itmL = MCList.create(MAM_ITM_R.class);
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		dbSelectKey("MSBDL0120_MAM_ITM_S01", _itmL, itmL_bldr, poDL.groupBy(MST_PO_D_R.$itm_cd,
				MST_PO_D_R.$itm_sub1, MST_PO_D_R.$itm_sub2, MST_PO_D_R.$itm_sub3));
		_itmKey = _itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	/**
	 * 格納されている品目マスタキャッシュを取得する</p>
	 * 品目、枝番１～３を検索条件に使用する
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @return
	 */
	protected static MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MAM_ITM_R _getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmL.getFirst(_itmKey, itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	/**
	 * 品目マスタキャッシュを作成する
	 * @param arrSchdL 入荷予定が含まれるリスト
	 */
	protected static void initItmUnitCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		object(CLAZZ)._initItmUnitCache(arrSchdL);
	}
	protected void _initItmUnitCache(MCList<MST_ARR_SCHD_R> arrSchdL) {
		_itmUnitL =  MCList.create(MAVM_ITM_UNIT_R.class);
		MCList<?> bindL = arrSchdL.groupBy("ITM_CD", "ITM_SUB1", "ITM_SUB2", "ITM_SUB3");
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBDL0120_MAVM_ITM_UNIT_S01", _itmUnitL, dbc_bldr, bindL);

		_itmUnitKey = _itmUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3);
	}
	/**
	 * 格納されている品目単位マスタキャッシュを取得する</p>
	 * 品目、枝番１～３を検索条件に使用する
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @return
	 */
	protected static MCList<MAVM_ITM_UNIT_R> getItmUnitCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItmUnitCache(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MCList<MAVM_ITM_UNIT_R> _getItmUnitCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _itmUnitL.subList(_itmUnitKey, itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注情報、入荷予定、仕入予定、入荷実績、仕入実績、納入指示情報、納期回答情報を検索する<br>
	 */
	public class Srch01 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Srch01 {		
		/** 操作種別：参照する */
		protected static final String OPE_REF = "5";

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol(up0());

			executeQuery(down0(), MSBDL0120_MST_PO_S01(), up0());
			executeQuery(down1(), MSBDL0120_MST_PO_D_S01(), up0());
			
			// 発注ヘッダ、発注明細が取得できない場合、そのままreturnする
			if (isSame(down0().size(), 0)) {
				return;
			}
			if (isSame(down1().size(), 0)) {
				return;
			}
				
			// 検索用に発注明細ＮＯをワークに書き込む
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSBDL0120_MSW_PO_D_D01", poDL_bldr.getBaseDbc());
			for(Srch01_Dtl2R r : down1()) {
				MST_PO_D_R poDR = MST_PO_D_R.create();
				poDR.po_d_no(r.po_d_no());
				poDL.add(poDR);
			}
			if(!poDL.isEmpty()) {
				dbWkInsert("MSBDL0120_MSW_PO_D_I01", poDL, poDL_bldr.getBaseDbc());
			}
			
			executeQuery(down2(), MSBDL0120_MST_ARR_SCHD_S01());
			executeQuery(down3(), MSBDL0120_MST_ARR_ACT_S01());
			executeQuery(down4(), MSBDL0120_MST_PURC_ACT_S01(), up0());
			executeQuery(down5(), MSBDL0120_MST_DLV_INST_S01(), up0());
			executeQuery(down6(), MSBDL0120_MST_DLV_INST_D_S01(), up0());
			executeQuery(down7(), MSBDL0120_MST_PRMS_RCPT_S01());
			executeQuery(down8(), MSBDL0120_MST_PRMS_RCPT_D_S01());
			
			filterArrSchd();
			filterDlvInstD();
			filterPrmsRcptD();
		}
		/**
		 * 入荷予定の重複分を除外する
		 */
		protected void filterArrSchd() {
			if (down2().isEmpty()) {
				return;
			}
			
			// 受領インボイス明細違いで入荷予定が重複することがあるので、重複分を除外する
			String key = Srch01_Dtl3R.$arr_schd_no;
			
			MCIndexKey idx = down2().createIndex(key);
			MCList<Srch01_Dtl3R> down2 = down2().distinctNE(key);
			for (Srch01_Dtl3R r : down2) {
				MCList<Srch01_Dtl3R> tmpL = down2().subList(idx, r.toArray(idx.getKeys()));
				if (tmpL.size() > 1) {
					MCNumber sumQty = tmpL.sum(Srch01_Dtl3R.$rcpt_iv_qty);
					r.rcpt_iv_qty(sumQty);
					r.rcpt_iv_no(null);
					r.rcpt_iv_d_no(null);
					if (isSame(r.base_unit_qty(), sumQty)) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
			}
			down2().setAll(down2);
		}
		
		/**
		 * 納入指示明細の重複分を除外する
		 */
		protected void filterDlvInstD() {
			if (down6().isEmpty()) {
				return;
			}
			
			// 受領インボイス明細違いで納入指示明細が重複することがあるので、重複分を除外する
			String key = Srch01_Dtl7R.$dlv_inst_d_no;
			
			MCIndexKey idx = down6().createIndex(key);
			MCList<Srch01_Dtl7R> down6 = down6().distinctNE(key);
			for (Srch01_Dtl7R r : down6) {
				MCList<Srch01_Dtl7R> tmpL = down6().subList(idx, r.toArray(idx.getKeys()));
				if (tmpL.size() > 1) {
					MCNumber sumQty = tmpL.sum(Srch01_Dtl7R.$rcpt_iv_qty);
					r.rcpt_iv_qty(sumQty);
					if (isSame(r.base_unit_qty(), sumQty)) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
			}
			down6().setAll(down6);
		}
		
		/**
		 * 納期回答受領明細の重複分を除外する
		 */
		protected void filterPrmsRcptD() {
			if (down8().isEmpty()) {
				return;
			}
			
			// 受領インボイス明細違いで納期回答受領明細が重複することがあるので、重複分を除外する
			String key = Srch01_Dtl9R.$prms_rcpt_d_no;
			
			MCIndexKey idx = down8().createIndex(key);
			MCList<Srch01_Dtl9R> down8 = down8().distinctNE(key);
			for (Srch01_Dtl9R r : down8) {
				MCList<Srch01_Dtl9R> tmpL = down8().subList(idx, r.toArray(idx.getKeys()));
				if (tmpL.size() > 1) {
					MCNumber sumQty = tmpL.sum(Srch01_Dtl9R.$rcpt_iv_qty);
					r.rcpt_iv_qty(sumQty);
					if (isSame(r.base_unit_qty(), sumQty)) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
			}
			down8().setAll(down8);
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up 上り電文
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			
			up.addStringColumn("TMP_PO_NO", up0().po_no());
			up.addDateColumn("today", getToday());
			
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			for(Srch01_Dtl2R r : down1()) {
				r.cont_qty(MAUCL_MCDataUtil.convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納入指示受領を検索する<br>
	 */
	public class Srch02 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			Srch02_CndR up0 = Srch02_CndR.create();
			if(!up0().isEmpty()) {
				up0 = up0().get(0);
			}
			
			executeQuery(down0(), MSBDL0120_MST_DLV_INST_RCPT_S01(), up0);
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正可能かチェックする<br>
	 */
	public class Chk01 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callPurcDlvDtAdjstRegSrvDlvInstChk01();
			}

			setDown();
		}
		
		/**
		 * 購買納期調整登録サービスの納入指示更新前チェックを実行
		 */
		protected void callPurcDlvDtAdjstRegSrvDlvInstChk01() {
			MSBDL_PurcDlvDtAdjstRegService.DlvInst_Chk01 ope = MSBDL_PurcDlvDtAdjstRegService.crtDlvInst_Chk01();
			for(Chk01_HdrR r : up0()) {
				DlvInst_Chk01_HdrR dlvInstChk01HdrR = DlvInst_Chk01_HdrR.create();
				copy(dlvInstChk01HdrR, r, createMap_DlvInst_Chk01_HdrR_Chk01_HdrR());
				ope.up0().add(dlvInstChk01HdrR);
			}
			
			for(Chk01_DtlR r : up1()) {
				DlvInst_Chk01_DtlR dlvInstChk01DtlR = DlvInst_Chk01_DtlR.create();
				copy(dlvInstChk01DtlR, r, createMap_DlvInst_Chk01_DtlR_Chk01_DtlR());
				ope.up1().add(dlvInstChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
			copyErrFlg(up0(), ope.down0());
			copyErrFlg(up1(), ope.down1());
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			createCacheBp();
			msgL.addAll(chkDtlCnt());
			msgL.addAll(chkItm());
			msgL.addAll(chkArrPr());
			msgL.addAll(chkMfgInst());
			msgL.addAll(chkPurcActD());
			
			return msgL;
		}
		
		/**
		 * 納入指示ヘッダに紐付く納入指示明細があるかチェック
		 */
		protected MCMessageList chkDtlCnt() {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey dtlKey = up1().createIndex(Chk01_DtlR.$hdr_peg_no);
			MCIndexKey dtlKey2 = up1().createIndex(Chk01_DtlR.$dlv_inst_d_no);

			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(t);
			MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
			dlvInstDL_bldr.setWhere(t.dlv_inst_no.eq(bind("dlv_inst_no")));
			dlvInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dlvInstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dlvInstDL_bldr.addInnerJoin(t2, bracket(t2.dlv_inst_no.eq(t.dlv_inst_no)));
			dbSelect("MSBDL0120_MST_DLV_INST_D_S01", dlvInstDL, dlvInstDL_bldr, up0().groupBy(Chk01_HdrR.$dlv_inst_no));
			MCIndexKey dlvInstDKey = dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_no);

			for(Chk01_HdrR hdrR : up0()) {
				if(MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					MCList<Chk01_DtlR> dtlL = up1().subList(dtlKey, hdrR.peg_no());
					if(isNull(dtlL)) {
						hdrR.err_flg(true);
						msgL.add(new MCMessage(hdrR, null, MSBDL0123, toDispGUIIndex(hdrR)));
					}
				}
				// 明細が削除行しかない場合はエラー
				else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCList<Chk01_DtlR> tmpL = MCList.create(Chk01_DtlR.class);
					MCList<Chk01_DtlR> dtlL = up1().subList(dtlKey, hdrR.peg_no());
					for(Chk01_DtlR r : dtlL) {
						if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							tmpL.add(r);
						}
					}
					
					// 何もしていない納期回答受領明細があるかも考慮
					MCList<MST_DLV_INST_D_R> chkDlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
					for(MST_DLV_INST_D_R dlvInstDR : dlvInstDL.subList(dlvInstDKey, hdrR.dlv_inst_no())) {
						Chk01_DtlR chk01DtlR = up1().getFirst(dtlKey2, dlvInstDR.dlv_inst_d_no());
						if(isNull(chk01DtlR)) {
							chkDlvInstDL.add(dlvInstDR);
						}
					}
					
					if(tmpL.isEmpty() && chkDlvInstDL.isEmpty()) {
						hdrR.err_flg(true);
						msgL.add(new MCMessage(hdrR, null, MSBDL0143, hdrR.dlv_inst_no(), toDispGUIIndex(hdrR)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 削除時品目マスタ存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			
			dbSelect("MSBDL0120_MAM_ITM_S02", itmL, itmL_bldr, up1());
			
			MCIndexKey idxItmL = itmL.createIndex(
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			for (Chk01_DtlR r : up1()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MAM_ITM_R itmR = itmL.getFirst(idxItmL, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					msgL.add(new MCMessage(r, null, MAUAL0189
							, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
							, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 入荷進捗のロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkArrPr() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_HdrR> notErrHdrL = getChkList(up0());
			if (notErrHdrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			arrPrL_bldr.setOrderByAsc(t.arr_pr_no);
			MCList<Chk01_HdrR> bindHdrL = notErrHdrL;
			bindHdrL.sort(Chk01_HdrR.$arr_pr_no);
			dbSelectForUpdateNoWait("MSBDL0120_MST_ARR_PR_S02", arrPrL, arrPrL_bldr, bindHdrL);
			
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			for (Chk01_HdrR r : notErrHdrL) {
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, r.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_HdrR.$arr_pr_upd_cntr, arrPrR));
			}
			
			return msgL;
		}
		
		/**
		 * 製造指図の存在チェック、ロック
		 * @return
		 */
		protected MCMessageList chkMfgInst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			if (notErrDtlL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			mfgInstL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			mfgInstL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			mfgInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			mfgInstL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
			mfgInstL_bldr.setOrderByAsc(t.mfg_inst_no);
			MCList<Chk01_DtlR> bindDtlL = notErrDtlL;
			bindDtlL.sort(Chk01_DtlR.$po_d_no);
			dbSelectForUpdate("MSBDL0120_MST_MFG_INST_S01", mfgInstL, mfgInstL_bldr, bindDtlL);
			
			MCIndexKey idxkey = mfgInstL.createIndex(MST_MFG_INST_R.$po_d_no, MST_MFG_INST_R.$mfg_inst_no);
			for (Chk01_DtlR r : notErrDtlL) {
				if(isNull(r.mfg_inst_no())) {
					continue;
				}
				if (r.isStatusDelete()) {
					continue;
				}
				MST_MFG_INST_R mfgInstR = mfgInstL.getFirst(idxkey, r.po_d_no(), r.mfg_inst_no());
				if(isNull(mfgInstR)) {
					msgL.add(msgNotExistInTable(t, r, MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$po_d_no));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 仕入実績の存在チェック、ロック
		 * @return
		 */
		protected MCMessageList chkPurcActD() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			if (notErrDtlL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_PURC_ACT_R t4 = MST_PURC_ACT_R.create("T4");
			purcActDL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
			purcActDL_bldr.addWhereWithAnd(t.re_arr_flg.eq(value(true)));
			purcActDL_bldr.addWhereWithAnd(t3.po_d_no.eq(bind("po_d_no")));
			purcActDL_bldr.addWhereWithAnd(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActDL_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
			purcActDL_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t2.arr_pr_no)));
			purcActDL_bldr.addInnerJoin(t4, bracket(t4.purc_act_no.eq(t.purc_act_no)
					.and(t4.purc_act_seq.eq(t.purc_act_seq))));

			purcActDL_bldr.setOrderByAsc(t.purc_act_d_no);
			MCList<Chk01_DtlR> bindDtlL = notErrDtlL;
			bindDtlL.sort(Chk01_DtlR.$purc_act_d_no);
			dbSelect("MSBDL0120_MST_PURC_ACT_D_S01", purcActDL, purcActDL_bldr, bindDtlL);
			
			MCIndexKey idxkey = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			for (Chk01_DtlR r : notErrDtlL) {
				if(isNull(r.purc_act_d_no())) {
					continue;
				}
				MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(idxkey, r.purc_act_d_no());
				if(isNull(purcActDR)) {
					msgL.add(msgNotExistInTable(t, r, MST_PURC_ACT_D_R.$purc_act_d_no));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 必須チェックを行う。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			
			MCList<MST_PO_D_R> poDL = getPoDL();
			MCIndexKey poKey = poDL.createIndex(MST_PO_D_R.$po_d_no);
			
			for (Chk01_DtlR r : notErrDtlL) {
				
				MST_PO_D_R poDR = poDL.getFirst(poKey, r.po_d_no());
				
				if (MAC_DATA_CRUD_TYP.isDEL(r .data_crud_typ())) {
					continue;
				}
				
				if (!isNull(r.dlv_cd()) && r.dlv_sundry_flg()){
					msgL.addAll(check(r, Chk01_DtlR.$dlv_nm, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(r.dlv_cd()) && r.tdlv_req_flg() && isNull(poDR.tdlv_cd())){
					msgL.addAll(check(r, Chk01_DtlR.$tdlv_cd, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(r.tdlv_cd()) && r.tdlv_sundry_flg()){
					msgL.addAll(check(r, Chk01_DtlR.$tdlv_nm, new FXUCL_RequiredValidater()));
				}
				
				if (!MAC_PURC_ID_TYP.isVMI(poDR.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(poDR.purc_id_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$purc_schd_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			for(Chk01_DtlR r : up1()) {
				setBaseUnitQty(r);
			}
			setBpInfo();
			msgL.addAll(chkReq());
			msgL.addAll(chkDecPlace());
			
			return msgL;
		}
		
		protected void setBpInfo() {
			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			MCList<MST_PO_D_R> poDL = getPoDL();
			MCIndexKey poDKey = poDL.createIndex(MST_PO_D_R.$po_d_no);

			for (Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				MST_PO_D_R poDR = poDL.getFirst(poDKey, r.po_d_no());
				if (!isNull(poDR)) {
					if (!r.dlv_sundry_flg()) {
						MAM_BP_R dlv = getCacheBp(r.dlv_cd());
						MAM_BP_SUB_R bpSubDlv = getCacheBpSub(poDR.getDateNE("slo_dt"), r.dlv_cd());
						if (!isNull(bpSubDlv.bp_cd())) {
							r.dlv_zip_cd(bpSubDlv.zip_cd());
							r.dlv_addr1(bpSubDlv.addr1());
							r.dlv_addr2(bpSubDlv.addr2());
							r.dlv_addr3(bpSubDlv.addr3());
							r.dlv_addr4(bpSubDlv.addr4());
							r.dlv_tel(bpSubDlv.tel());
							r.dlv_fax(bpSubDlv.fax());
							r.dlv_cntct_dpt(bpSubDlv.dlv_cntct_dpt());
							r.dlv_cntct_psn(bpSubDlv.dlv_cntct_psn());
						}
						else {
							r.dlv_zip_cd(dlv.zip_cd());
							r.dlv_addr1(dlv.addr1());
							r.dlv_addr2(dlv.addr2());
							r.dlv_addr3(dlv.addr3());
							r.dlv_addr4(dlv.addr4());
							r.dlv_tel(dlv.tel());
							r.dlv_fax(dlv.fax());
							r.dlv_cntct_dpt(dlv.dlv_cntct_dpt());
							r.dlv_cntct_psn(dlv.dlv_cntct_psn());
						}
					}
					
					if (!r.tdlv_sundry_flg()) {
						MAM_BP_R tdlv = getCacheBp(r.tdlv_cd());
						MAM_BP_SUB_R bpSubTdlv = getCacheBpSub(poDR.getDateNE("slo_dt"), r.tdlv_cd());
						if (!isNull(bpSubTdlv.bp_cd())) {
							r.tdlv_zip_cd(bpSubTdlv.zip_cd());
							r.tdlv_addr1(bpSubTdlv.addr1());
							r.tdlv_addr2(bpSubTdlv.addr2());
							r.tdlv_addr3(bpSubTdlv.addr3());
							r.tdlv_addr4(bpSubTdlv.addr4());
							r.tdlv_tel(bpSubTdlv.tel());
							r.tdlv_fax(bpSubTdlv.fax());
							r.tdlv_cntct_dpt(bpSubTdlv.dlv_cntct_dpt());
							r.tdlv_cntct_psn(bpSubTdlv.dlv_cntct_psn());
						}
						else {
							r.tdlv_zip_cd(tdlv.zip_cd());
							r.tdlv_addr1(tdlv.addr1());
							r.tdlv_addr2(tdlv.addr2());
							r.tdlv_addr3(tdlv.addr3());
							r.tdlv_addr4(tdlv.addr4());
							r.tdlv_tel(tdlv.tel());
							r.tdlv_fax(tdlv.fax());
							r.tdlv_cntct_dpt(tdlv.dlv_cntct_dpt());
							r.tdlv_cntct_psn(tdlv.dlv_cntct_psn());
						}
					}
				}
			}
		}
		
		protected MCList<MST_PO_D_R> getPoDL() {
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MST_SLO_R slo = MST_SLO_R.create("SLO");
			MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			poDL.addDateColumn("slo_dt");
			poDL_bldr.setSelect(t.po_d_no, t.tdlv_cd, t.purc_id_typ);
			poDL_bldr.addSelect(slo.slo_dt);
			poDL_bldr.addLeftOuterJoin(sloD, bracket(t.slo_d_no.eq(sloD.slo_d_no)));
			poDL_bldr.addLeftOuterJoin(slo, bracket(sloD.slo_no.eq(slo.slo_no)));
			dbSelectKey("MSBDL0120_MST_PO_D_S02", poDL, poDL_bldr, up0().distinctNE(MST_PO_D_R.$po_d_no));
			return poDL;
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		protected void createCacheBp() {
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			for (Chk01_DtlR r : up1()) {
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
			
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					bindBpL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
		}
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}
		protected MAM_BP_SUB_R getCacheBpSub(MCDate sloDt, String bpCd) {
			return _cacheBpSub.get(sloDt, bpCd);
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param dtlR
		 */
		protected void setBaseUnitQty(Chk01_DtlR dtlR) {
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_qty(dtlR.trd_unit_qty());
			}
			else {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> notErrL = getChkList(up1());
			
			// 小数有効桁数チェック
			for (Chk01_DtlR upR : notErrL){
				msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$base_unit_dec_place, Chk01_DtlR.$base_unit_qty));
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正する<br>
	 */
	public class Upd01 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			
			// 購買納期調整登録サービスの納入指示更新を実行
			callPurcDlvDtAdjstRegSrvDlvInstUpd01();
			
			setDown();
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up2());
			
			copyPegNoAndAttr(down1(), up2());
			
			for (Chk01_HdrR r : up1()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if(r.isStatusNone()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
			
			MCIndexKey idxKey = up1().createIndex(Chk01_HdrR.$peg_no);
			for (Chk01_DtlR r : up2()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if(r.isStatusNone()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				
				Chk01_HdrR hdrR = up1().getFirst(idxKey, r.hdr_peg_no());
				if(!isNull(hdrR)) {
					r.setGUIIndex(hdrR.getGUIIndex());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBDL_PurcDlvDtAdjstReg.Chk01 ope = MSBDL_PurcDlvDtAdjstReg.crtChk01();
			ope.up0().setAll(up1());
			ope.up1().setAll(up2());
			ope.exec();
			up1().setAll(ope.down0());
			up2().setAll(ope.down1());
		}
		
		/**
		 * 購買納期調整登録サービスの納入指示更新処理を実行する
		 */
		protected void callPurcDlvDtAdjstRegSrvDlvInstUpd01() {
			MSBDL_PurcDlvDtAdjstRegService.DlvInst_Upd01 ope = MSBDL_PurcDlvDtAdjstRegService.crtDlvInst_Upd01();
			for(Chk01_HdrR r : up1()) {
				DlvInst_Chk01_HdrR dlvInstChk01HdrR = DlvInst_Chk01_HdrR.create();
				copy(dlvInstChk01HdrR, r, createMap_DlvInst_Chk01_HdrR_Chk01_HdrR());
				dlvInstChk01HdrR.dlv_inst_print_flg(up0().dlv_inst_print_flg());
				dlvInstChk01HdrR.dlv_slip_print_flg(up0().dlv_slip_print_flg());
				dlvInstChk01HdrR.purc_ddlv_dlv_slip_print_flg(up0().purc_ddlv_dlv_slip_print_flg());
				dlvInstChk01HdrR.indiv_prnt_flg(up0().indiv_prnt_flg());
				ope.up0().add(dlvInstChk01HdrR);
			}
			
			for(Chk01_DtlR r : up2()) {
				DlvInst_Chk01_DtlR dlvInstChk01DtlR = DlvInst_Chk01_DtlR.create();
				copy(dlvInstChk01DtlR, r, createMap_DlvInst_Chk01_DtlR_Chk01_DtlR());
				ope.up1().add(dlvInstChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
				
				String[] destCols = new String[] {
						Chk01_HdrR.$dlv_inst_no,
						Chk01_HdrR.$dlv_inst_rev,
						Chk01_HdrR.$dlv_inst_grp_no
				};
				String[] srcCols = new String[] {
						DlvInst_Chk01_HdrR.$dlv_inst_no,
						DlvInst_Chk01_HdrR.$dlv_inst_rev,
						DlvInst_Chk01_HdrR.$dlv_inst_grp_no
				};
				copyByPegNo(up1(), destCols, ope.down0(), srcCols);
				
				destCols = new String[] {
						Chk01_DtlR.$dlv_inst_no,
						Chk01_DtlR.$dlv_inst_d_no,
						Chk01_DtlR.$dlv_slip_no,
						Chk01_DtlR.$dlv_slip_seq,
						Chk01_DtlR.$dlv_slip_rev,
						Chk01_DtlR.$purc_ddlv_dlv_slip_no,
						Chk01_DtlR.$purc_ddlv_dlv_slip_rev
				};
				srcCols = new String[] {
						DlvInst_Chk01_DtlR.$dlv_inst_no,
						DlvInst_Chk01_DtlR.$dlv_inst_d_no,
						DlvInst_Chk01_DtlR.$dlv_slip_no,
						DlvInst_Chk01_DtlR.$dlv_slip_seq,
						DlvInst_Chk01_DtlR.$dlv_slip_rev,
						DlvInst_Chk01_DtlR.$purc_ddlv_dlv_slip_no,
						DlvInst_Chk01_DtlR.$purc_ddlv_dlv_slip_rev
				};
				copyByPegNo(up2(), destCols, ope.down1(), srcCols);
			}
		}
		
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			down0().setAll(up1());
			
			String[] downCols = new String[] {
					Chk01_DtlR.$dlv_inst_no,
					Chk01_DtlR.$dlv_inst_d_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_seq,
					Chk01_DtlR.$dlv_slip_rev,
					Chk01_DtlR.$purc_ddlv_dlv_slip_no,
					Chk01_DtlR.$purc_ddlv_dlv_slip_rev
			};
			copyByPegNo(down1(), downCols, up2(), downCols);
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 納期回答受領を登録・訂正可能かチェックする<br>
	 */
	public class Chk02 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Chk02 {
		/** DBに登録されているものの、今回更新対象として上ってきていない納期回答受領明細 */
		MCList<MST_PRMS_RCPT_D_R> _notExtUpPrmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (up0().get(0).is_src_batch_flg()) {
				MCList<Chk02_HdrR> notErrHdrL = MCList.create(Chk02_HdrR.class);
				MCList<Chk02_DtlR> notErrDtlL = MCList.create(Chk02_DtlR.class);
				MCIndexKey dtlIdx = up1().createIndex(Chk02_DtlR.$hdr_peg_no);
				for (Chk02_HdrR r : up0()) {
					MCList<Chk02_DtlR> dtlL = up1().subList(dtlIdx, r.peg_no());
					if (r.err_flg()) {
						dtlL.setBoolean(Chk02_DtlR.$err_flg, true);
						continue;
					}
					MCList<Chk02_DtlR> subDtlL = dtlL.subList(dtlR -> !dtlR.err_flg());
					if (isNull(subDtlL)) {
						r.err_flg(true);
						continue;
					}
					notErrHdrL.add(r);
					notErrDtlL.addAll(subDtlL);
				}
				if (!isNull(notErrHdrL)) {
					callPurcDlvDtAdjstRegSrvPrmsChk01(notErrHdrL, notErrDtlL);
				}
			}
			else if (!hasErr()) {
				callPurcDlvDtAdjstRegSrvPrmsChk01(up0(), up1());
			}

			setDown();
		}
		
		/**
		 * 購買納期調整登録サービスの納期回答受領更新前チェックを実行
		 */
		protected void callPurcDlvDtAdjstRegSrvPrmsChk01(MCList<Chk02_HdrR> hdrL, MCList<Chk02_DtlR> dtlL) {
			MSBDL_PurcDlvDtAdjstRegService.Prms_Chk01 ope = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Chk01();
			for(Chk02_HdrR r : hdrL) {
				Prms_Chk01_HdrR prmsChk01HdrR = Prms_Chk01_HdrR.create();
				copy(prmsChk01HdrR, r, createMap_Prms_Chk01_HdrR_Chk02_HdrR());
				ope.up0().add(prmsChk01HdrR);
			}
			
			for(Chk02_DtlR r : dtlL) {
				Prms_Chk01_DtlR prmsChk01DtlR = Prms_Chk01_DtlR.create();
				copy(prmsChk01DtlR, r, createMap_Prms_Chk01_DtlR_Chk02_DtlR());
				ope.up1().add(prmsChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
			copyErrFlg(hdrL, ope.down0());
			copyErrFlg(dtlL, ope.down1());
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 電文として上ってきていないレコードの取得
			getNotExtUpPrmsRcpt();
			createCachePoD();
			msgL.addAll(chkDtlCnt());
			msgL.addAll(chkItm());
			msgL.addAll(chkArrPr());
			msgL.addAll(chkMfgInst());
			msgL.addAll(chkPurcActD());
			msgL.addAll(chkDlvInstD());
			
			return msgL;
		}
		
		protected MCList<MST_PO_D_R> _poDL;
		protected MCIndexKey _poDLIndex = null;
		protected void createCachePoD() {
			_poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R poD = MST_PO_D_R.create("POD");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poD);
			poDL_bldr.setSelect(poD.po_d_no, poD.purc_id_typ);
			dbSelectKey("MSBDL0120_MST_PO_D_S05", _poDL, poDL_bldr, up0().groupBy(MST_PO_D_R.$po_d_no));
			_poDLIndex = _poDL.createIndex(MST_PO_D_R.$po_d_no);
		}
		
		/**
		 * 納期回答受領ヘッダに紐付く納期回答受領明細があるかチェック
		 */
		protected MCMessageList chkDtlCnt() {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey dtlKey = up1().createIndex(Chk02_DtlR.$hdr_peg_no);
			MCIndexKey dtlKey2 = up1().createIndex(Chk02_DtlR.$prms_rcpt_d_no);

			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(t);
			prmsRcptDL_bldr.setWhere(t.prms_rcpt_no.eq(bind("prms_rcpt_no")));
			prmsRcptDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL0120_MST_PRMS_RCPT_D_S01", prmsRcptDL, prmsRcptDL_bldr, up0().groupBy(Chk02_HdrR.$prms_rcpt_no));
			MCIndexKey prmsRcptDKey = prmsRcptDL.createIndex(MST_PRMS_RCPT_D_R.$prms_rcpt_no);
			
			for(Chk02_HdrR hdrR : up0()) {
				if(MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					MCList<Chk02_DtlR> dtlL = up1().subList(dtlKey, hdrR.peg_no());
					if(isNull(dtlL)) {
						hdrR.err_flg(true);
						msgL.add(new MCMessage(hdrR, null, MSBDL0124, toDispGUIIndex(hdrR)));
					}
				}
				// 明細が削除行しかない場合はエラー
				else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCList<Chk02_DtlR> tmpL = MCList.create(Chk02_DtlR.class);
					MCList<Chk02_DtlR> dtlL = up1().subList(dtlKey, hdrR.peg_no());
					for(Chk02_DtlR r : dtlL) {
						if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							tmpL.add(r);
						}
					}
					
					// 何もしていない納期回答受領明細があるかも考慮
					MCList<MST_PRMS_RCPT_D_R> chkPrmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
					for(MST_PRMS_RCPT_D_R prmsRcptDR : prmsRcptDL.subList(prmsRcptDKey, hdrR.prms_rcpt_no())) {
						Chk02_DtlR chk02DtlR = up1().getFirst(dtlKey2, prmsRcptDR.prms_rcpt_d_no());
						if(isNull(chk02DtlR)) {
							chkPrmsRcptDL.add(prmsRcptDR);
						}
					}
					
					if(tmpL.isEmpty() && chkPrmsRcptDL.isEmpty()) {
						hdrR.err_flg(true);
						msgL.add(new MCMessage(hdrR, null, MSBDL0144, hdrR.prms_rcpt_no(), toDispGUIIndex(hdrR)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 削除時品目マスタ存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkItm() {
			
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			poDL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL0120_MST_PO_D_S04", poDL, poDL_bldr, up0());
			MCIndexKey idxPodL = poDL.createIndex(MST_PO_D_R.$po_d_no);
			
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
			for (Chk02_HdrR hdrR : up0()) {
				MAM_ITM_R bindR = MAM_ITM_R.create();
				MST_PO_D_R poDR = poDL.getFirst(idxPodL, hdrR.po_d_no());
				bindR.itm_cd(poDR.itm_cd());
				bindR.itm_sub1(poDR.itm_sub1());
				bindR.itm_sub2(poDR.itm_sub2());
				bindR.itm_sub3(poDR.itm_sub3());
				bindL.add(bindR);
			}
			
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R itmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itmL_t);
			itmL_bldr.setWhere(itmL_t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(itmL_t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(itmL_t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(itmL_t.itm_sub3.eq(bind("itm_sub3")));
			
			dbSelect("MSBDL0120_MAM_ITM_S03", itmL, itmL_bldr, bindL);
			
			MCIndexKey idxItmL = itmL.createIndex(
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			MCMessageList msgL = new MCMessageList();
			for (Chk02_HdrR hdrR : up0()) {
				MST_PO_D_R poDR = poDL.getFirst(idxPodL, hdrR.po_d_no());
				MAM_ITM_R itmR = itmL.getFirst(idxItmL, poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					msgL.add(new MCMessage(hdrR, null, MAUAL0189
							, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3())
							, toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 入荷進捗のロック、更新カウンタチェック
		 */
		protected MCMessageList chkArrPr() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_HdrR> notErrHdrL = getChkList(up0());
			if (notErrHdrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			arrPrL_bldr.setOrderByAsc(t.arr_pr_no);
			MCList<Chk02_HdrR> bindHdrL = notErrHdrL;
			bindHdrL.sort(Chk02_HdrR.$arr_pr_no);
			dbSelectForUpdateNoWait("MSBDL0120_MST_ARR_PR_S03", arrPrL, arrPrL_bldr, bindHdrL);
			
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			for (Chk02_HdrR r : notErrHdrL) {
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, r.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_HdrR.$arr_pr_upd_cntr, arrPrR));
			}
			
			return msgL;
		}
		
		/**
		 * 製造指図の存在チェック
		 * @return
		 */
		protected MCMessageList chkMfgInst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_DtlR> notErrDtlL = getChkList(up1());
			if (notErrDtlL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			mfgInstL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			mfgInstL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			mfgInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			mfgInstL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
			mfgInstL_bldr.setOrderByAsc(t.po_d_no);
			MCList<Chk02_DtlR> bindDtlL = notErrDtlL.clone();
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				Chk02_DtlR r = Chk02_DtlR.create();
				r.po_d_no(prmsRcptDR.getStringNE("po_d_no"));
				r.mfg_inst_no(prmsRcptDR.mfg_inst_no());
				bindDtlL.add(r);
			}
			bindDtlL.sort(Chk02_DtlR.$po_d_no);
			dbSelect("MSBDL0120_MST_MFG_INST_S02", mfgInstL, mfgInstL_bldr, bindDtlL);
			
			MCIndexKey idxkey = mfgInstL.createIndex(MST_MFG_INST_R.$po_d_no, MST_MFG_INST_R.$mfg_inst_no);
			for (Chk02_DtlR r : notErrDtlL) {
				if(isNull(r.mfg_inst_no()) ||  MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_MFG_INST_R mfgInstR = mfgInstL.getFirst(idxkey, r.po_d_no(), r.mfg_inst_no());
				if(isNull(mfgInstR)) {
					msgL.add(msgNotExistInTable(t, r, MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$po_d_no));
				}
			}
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				if(!prmsRcptDR.getBooleanNE("outsrc_flg")) {
					continue;
				}
				MST_MFG_INST_R mfgInstR = mfgInstL.getFirst(idxkey, prmsRcptDR.getStringNE("po_d_no"), prmsRcptDR.mfg_inst_no());
				if(isNull(mfgInstR)) {
					msgL.add(msgNotExistInTable(t, prmsRcptDR, MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$po_d_no));
				}
			}
			return msgL;
		}

		/**
		 * 仕入実績の存在チェック、ロック
		 * @return
		 */
		protected MCMessageList chkPurcActD() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_DtlR> notErrDtlL = getChkList(up1());
			
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_PURC_ACT_R t4 = MST_PURC_ACT_R.create("T4");
			purcActDL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
			purcActDL_bldr.addWhereWithAnd(t.re_arr_flg.eq(value(true)));
			purcActDL_bldr.addWhereWithAnd(t3.po_d_no.eq(bind("po_d_no")));
			purcActDL_bldr.addWhereWithAnd(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActDL_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
			purcActDL_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t2.arr_pr_no)));
			purcActDL_bldr.addInnerJoin(t4, bracket(t4.purc_act_no.eq(t.purc_act_no)
					.and(t4.purc_act_seq.eq(t.purc_act_seq))));

			purcActDL_bldr.setOrderByAsc(t.purc_act_d_no);
			MCList<Chk02_DtlR> bindDtlL = notErrDtlL.clone();
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				Chk02_DtlR r = Chk02_DtlR.create();
				r.po_d_no(prmsRcptDR.getStringNE("po_d_no"));
				r.purc_act_d_no(prmsRcptDR.purc_act_d_no());
				bindDtlL.add(r);
			}
			bindDtlL.sort(Chk02_DtlR.$purc_act_d_no);
			dbSelect("MSBDL0120_MST_PURC_ACT_D_S02", purcActDL, purcActDL_bldr, bindDtlL);
			
			MCIndexKey idxkey = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			for (Chk02_DtlR r : notErrDtlL) {
				if(isNull(r.purc_act_d_no()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(idxkey, r.purc_act_d_no());
				if(isNull(purcActDR)) {
					msgL.add(msgNotExistInTable(t, r, MST_PURC_ACT_D_R.$purc_act_d_no));
				}
			}
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				if(isNull(prmsRcptDR.purc_act_d_no())) {
					continue;
				}
				MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(idxkey, prmsRcptDR.purc_act_d_no());
				if(isNull(purcActDR)) {
					Chk02_DtlR r = Chk02_DtlR.create();
					r.purc_act_d_no(prmsRcptDR.purc_act_d_no());
					msgL.add(msgNotExistInTable(t, r, MST_PURC_ACT_D_R.$purc_act_d_no));
				}
			}
			return msgL;
		}

		/**
		 * 納期回答受領明細の存在チェック、ロック
		 * @return
		 */
		protected MCMessageList chkDlvInstD() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_DtlR> notErrDtlL = getChkList(up1());
			
			MCList<MST_DLV_INST_D_R> dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(t);
			MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
			dlvInstDL_bldr.setWhere(t.dlv_inst_d_no.eq(bind("dlv_inst_d_no")));
			dlvInstDL_bldr.addWhereWithAnd(t2.po_d_no.eq(bind("po_d_no")));
			dlvInstDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			dlvInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dlvInstDL_bldr.addInnerJoin(t2, bracket(t2.dlv_inst_no.eq(t.dlv_inst_no)));
			dlvInstDL_bldr.setOrderByAsc(t.dlv_inst_d_no);
			MCList<Chk02_DtlR> bindDtlL = notErrDtlL.clone();
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				Chk02_DtlR r = Chk02_DtlR.create();
				r.po_d_no(prmsRcptDR.getStringNE("po_d_no"));
				r.dlv_inst_d_no(prmsRcptDR.dlv_inst_d_no());
				bindDtlL.add(r);
			}
			bindDtlL.sort(Chk02_DtlR.$dlv_inst_d_no);
			dbSelect("MSBDL0120_MST_DLV_INST_D_S02", dlvInstDL, dlvInstDL_bldr, bindDtlL);
			
			MCIndexKey idxkey = dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
			for (Chk02_DtlR r : notErrDtlL) {
				if(isNull(r.dlv_inst_d_no()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_DLV_INST_D_R dlvInstDR = dlvInstDL.getFirst(idxkey, r.dlv_inst_d_no());
				if(isNull(dlvInstDR)) {
					msgL.add(msgNotExistInTable(t, r, MST_DLV_INST_D_R.$dlv_inst_d_no));
				}
				else if (!isSame(dlvInstDR.purc_act_d_no(), r.purc_act_d_no())) {
					msgL.add(new MCMessage(r, null, MSBDL0180, r.dlv_inst_d_no(), r.purc_act_d_no(), toDispGUIIndex(r)));
				}
			}
			for (MST_PRMS_RCPT_D_R prmsRcptDR : _notExtUpPrmsRcptDL) {
				if (isNull(prmsRcptDR.dlv_inst_d_no())) {
					continue;
				}
				MST_DLV_INST_D_R dlvInstDR = dlvInstDL.getFirst(idxkey, prmsRcptDR.dlv_inst_d_no());
				if(isNull(dlvInstDR)) {
					Chk02_DtlR r = Chk02_DtlR.create();
					r.dlv_inst_d_no(prmsRcptDR.dlv_inst_d_no());
					msgL.add(msgNotExistInTable(t, r, MST_DLV_INST_D_R.$dlv_inst_d_no));
				}
			}
			return msgL;
		}
		
		/**
		 * 必須チェックを行う。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk02_HdrR> notErrHdrL = getChkList(up0());
			MCList<Chk02_DtlR> notErrDtlL = getChkList(up1());
			
			for (Chk02_HdrR r : notErrHdrL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(r .data_crud_typ())) {
					continue;
				}
				
				if(r.arr_schd_refl_flg()) {
					msgL.addAll(check(r, Chk02_HdrR.$arr_schd_refl_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			for (Chk02_DtlR r : notErrDtlL) {
				
				MST_PO_D_R poDR = _poDL.getFirst(_poDLIndex, r.po_d_no());
				
				if (MAC_DATA_CRUD_TYP.isDEL(r .data_crud_typ())) {
					continue;
				}
				
				if (!MAC_PURC_ID_TYP.isVMI(poDR.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(poDR.purc_id_typ())) {
					msgL.addAll(check(r, Chk02_DtlR.$purc_schd_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			for(Chk02_DtlR r : up1()) {
				setBaseUnitQty(r);
			}
			msgL.addAll(chkReq());
			msgL.addAll(chkDecPlace());
			
			return msgL;
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param dtlR
		 */
		protected void setBaseUnitQty(Chk02_DtlR dtlR) {
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_qty(dtlR.trd_unit_qty());
			}
			else {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_DtlR> notErrL = getChkList(up1());
			
			// 小数有効桁数チェック
			for (Chk02_DtlR upR : notErrL){
				msgL.addAll(checkDecPlace(upR, Chk02_DtlR.$trd_unit_dec_place, Chk02_DtlR.$trd_unit_qty));
				msgL.addAll(checkDecPlace(upR, Chk02_DtlR.$base_unit_dec_place, Chk02_DtlR.$base_unit_qty));
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		/**
		 * 上ってきていないヘッダ・明細に対しても、存在チェックを実施するために、
		 * 上ってきていない納期回答受領ヘッダ・明細を取得する。
		 */
		protected void getNotExtUpPrmsRcpt() {
			// 発注明細ＮＯで、納期回答受領ヘッダを取得
			MCList<MST_PRMS_RCPT_R> prmsRcptL = MCList.create(MST_PRMS_RCPT_R.class);
			MST_PRMS_RCPT_R prmsRcptL_t = MST_PRMS_RCPT_R.create("T");
			MCQueryApiBuilder prmsRcptL_bldr = MCQueryApiBuilder.create(prmsRcptL_t);
			prmsRcptL_bldr.setWhere(prmsRcptL_t.po_d_no.eq(bind("po_d_no")));
			prmsRcptL_bldr.addWhereWithAnd(prmsRcptL_t.can_flg.eq(value(false)));
			prmsRcptL_bldr.addWhereWithAnd(prmsRcptL_t.arr_schd_refl_flg.eq(value(true)));
			dbSelect("MSBDL0120_MST_PRMS_RCPT_S01", prmsRcptL, prmsRcptL_bldr, up0().groupBy(Chk02_HdrR.$po_d_no));
			
			// 納期回答受領ヘッダを取得したのと同様に、納期回答受領明細で上ってきていない分を取得する。
			MCList<MST_PRMS_RCPT_D_R> prmsRcptDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MST_PRMS_RCPT_D_R prmsRcptDL_t = MST_PRMS_RCPT_D_R.create("T");
			MCQueryApiBuilder prmsRcptDL_bldr = MCQueryApiBuilder.create(prmsRcptDL_t);
			MST_PRMS_RCPT_R t2 = MST_PRMS_RCPT_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_ARR_SCHD_R t4 = MST_ARR_SCHD_R.create("T4");
			MST_PURC_SCHD_R t5 = MST_PURC_SCHD_R.create("T5");
			MST_PO_D_R t6 = MST_PO_D_R.create("T6");
			
			prmsRcptDL.addStringColumn("po_d_no");
			prmsRcptDL.addStringColumn("rcpt_iv_no");
			prmsRcptDL.addNumberColumn("act_abort_qty");
			prmsRcptDL.addNumberColumn("purc_abort_qty");
			prmsRcptDL.addBooleanColumn("non_purc_flg");
			prmsRcptDL.addBooleanColumn("purc_cmpl_flg");
			prmsRcptDL.addBooleanColumn("arr_skip_flg");
			prmsRcptDL.addBooleanColumn("arr_cmpl_flg");
			prmsRcptDL.addBooleanColumn("outsrc_flg");
			
			prmsRcptDL_bldr.setSelect(prmsRcptDL_t.prms_rcpt_d_no);
			prmsRcptDL_bldr.addSelect(prmsRcptDL_t.dlv_inst_d_no);
			prmsRcptDL_bldr.addSelect(prmsRcptDL_t.mfg_inst_no);
			prmsRcptDL_bldr.addSelect(prmsRcptDL_t.purc_act_d_no);
			prmsRcptDL_bldr.addSelect(t2.po_d_no);
			prmsRcptDL_bldr.addSelect(t4.rcpt_iv_no);
			prmsRcptDL_bldr.addSelect(t4.abort_qty.as("act_abort_qty"));
			prmsRcptDL_bldr.addSelect(t5.base_unit_abort_qty.as("purc_abort_qty"));
			prmsRcptDL_bldr.addSelect(t5.non_purc_flg);
			prmsRcptDL_bldr.addSelect(t5.cmpl_flg.as("purc_cmpl_flg"));
			prmsRcptDL_bldr.addSelect(t4.arr_skip_flg);
			prmsRcptDL_bldr.addSelect(t4.cmpl_flg.as("arr_cmpl_flg"));
			prmsRcptDL_bldr.addSelect(t6.outsrc_flg);
			prmsRcptDL_bldr.addInnerJoin(t2,
					bracket(t2.prms_rcpt_no.eq(prmsRcptDL_t.prms_rcpt_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(t3, bracket(t3.po_d_no.eq(t2.po_d_no)));
			prmsRcptDL_bldr.addLeftOuterJoin(t4, bracket(t4.arr_pr_no.eq(t3.arr_pr_no)
					.and(t4.prms_rcpt_d_no.eq(prmsRcptDL_t.prms_rcpt_d_no))));
			prmsRcptDL_bldr.addLeftOuterJoin(t5, bracket(t5.arr_pr_no.eq(t3.arr_pr_no)
					.and(t5.arr_schd_no.eq(t4.arr_schd_no))));
			prmsRcptDL_bldr.addLeftOuterJoin(t6, bracket(t6.po_d_no.eq(t3.po_d_no)));
			prmsRcptDL_bldr.setWhere(prmsRcptDL_t.prms_rcpt_no.eq(bind("prms_rcpt_no")));
			prmsRcptDL_bldr.addWhereWithAnd(prmsRcptDL_t.can_flg.eq(value(false)));
			dbSelect("MSBDL0120_MST_PRMS_RCPT_D_S02", prmsRcptDL, prmsRcptDL_bldr, prmsRcptL);
			
			MCIndexKey idxUp1 = up1().createIndex(Chk02_DtlR.$prms_rcpt_d_no);
			for (MST_PRMS_RCPT_D_R r : prmsRcptDL) {
				if (isNull(up1().getFirst(idxUp1, r.prms_rcpt_d_no())) && !isPrmsExistsAct(r)) {
					_notExtUpPrmsRcptDL.add(r);
				}
			}
		}
		/**
		 * 完了扱いとするか否かを判定します。
		 * @param r
		 * @return
		 */
		protected boolean isPrmsExistsAct(MST_PRMS_RCPT_D_R r) {
			return !isNull(r.getStringNE("rcpt_iv_no")) || (!isNull(r.getNumberNE("act_abort_qty")) && !r.getNumberNE("act_abort_qty").isZero())
					|| (!isNull(r.getNumberNE("purc_abort_qty")) && !r.getNumberNE("purc_abort_qty").isZero())
					|| (!r.getBooleanNE("non_purc_flg") && r.getBooleanNE("purc_cmpl_flg")) || (!r.getBooleanNE("arr_skip_flg") && r.getBooleanNE("arr_cmpl_flg"));
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 納期回答受領を登録・訂正する<br>
	 */
	public class Upd02 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwUpdErr();

			// 購買納期調整登録サービスの納期回答受領更新を実行
			callPurcDlvDtAdjstRegSrvPrmsUpd01();
			
			setDown();
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk02_DtlR.$peg_no, up1());
			copyPegNoAndAttr(down1(), up1());
			
			for (Chk02_HdrR r : up0()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			
			MCIndexKey up0Key = up0().createIndex(Chk02_HdrR.$peg_no);
			for (Chk02_DtlR r : up1()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				
				Chk02_HdrR hdrR = up0().getFirst(up0Key, r.hdr_peg_no());
				if(!isNull(hdrR)) {
					r.setGUIIndex(hdrR.getGUIIndex());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBDL_PurcDlvDtAdjstReg.Chk02 ope = MSBDL_PurcDlvDtAdjstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 購買納期調整登録サービスの納期回答受領更新処理を実行する
		 */
		protected void callPurcDlvDtAdjstRegSrvPrmsUpd01() {
			MSBDL_PurcDlvDtAdjstRegService.Prms_Upd01 ope = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Upd01();
			for(Chk02_HdrR r : up0()) {
				Prms_Chk01_HdrR prmsChk01HdrR = Prms_Chk01_HdrR.create();
				copy(prmsChk01HdrR, r, createMap_Prms_Chk01_HdrR_Chk02_HdrR());
				prmsChk01HdrR.dlv_slip_print_flg(up2().dlv_slip_print_flg());
				prmsChk01HdrR.purc_ddlv_dlv_slip_print_flg(up2().purc_ddlv_dlv_slip_print_flg());
				prmsChk01HdrR.indiv_prnt_flg(up2().indiv_prnt_flg());
				prmsChk01HdrR.dlv_slip_print_flg(up2().dlv_slip_print_flg());
				ope.up0().add(prmsChk01HdrR);
			}
			
			for(Chk02_DtlR r : up1()) {
				Prms_Chk01_DtlR prmsChk01DtlR = Prms_Chk01_DtlR.create();
				copy(prmsChk01DtlR, r, createMap_Prms_Chk01_DtlR_Chk02_DtlR());
				ope.up1().add(prmsChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
				
				String[] destCols = new String[] {
						Chk02_HdrR.$prms_rcpt_no,
						Chk02_HdrR.$prms_rcpt_grp_no
				};
				String[] srcCols = new String[] {
						Prms_Chk01_HdrR.$prms_rcpt_no,
						Prms_Chk01_HdrR.$prms_rcpt_grp_no
				};
				copyByPegNo(up0(), destCols, ope.down0(), srcCols);
				
				destCols = new String[] {
						Chk02_DtlR.$prms_rcpt_no,
						Chk02_DtlR.$prms_rcpt_d_no,
						Chk02_DtlR.$dlv_slip_no,
						Chk02_DtlR.$dlv_slip_seq,
						Chk02_DtlR.$dlv_slip_rev,
						Chk02_DtlR.$purc_ddlv_dlv_slip_no,
						Chk02_DtlR.$purc_ddlv_dlv_slip_rev
				};
				srcCols = new String[] {
						Prms_Chk01_DtlR.$prms_rcpt_no,
						Prms_Chk01_DtlR.$prms_rcpt_d_no,
						Prms_Chk01_DtlR.$dlv_slip_no,
						Prms_Chk01_DtlR.$dlv_slip_seq,
						Prms_Chk01_DtlR.$dlv_slip_rev,
						Prms_Chk01_DtlR.$purc_ddlv_dlv_slip_no,
						Prms_Chk01_DtlR.$purc_ddlv_dlv_slip_rev
				};
				copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			}
		}
		
		/**
		 * 下り電文を設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			String[] downCols = new String[] {
					Chk02_DtlR.$prms_rcpt_no,
					Chk02_DtlR.$prms_rcpt_d_no,
					Chk02_DtlR.$dlv_slip_no,
					Chk02_DtlR.$dlv_slip_seq,
					Chk02_DtlR.$dlv_slip_rev,
					Chk02_DtlR.$purc_ddlv_dlv_slip_no,
					Chk02_DtlR.$purc_ddlv_dlv_slip_rev
			};
			copyByPegNo(down1(), downCols, up1(), downCols);
		}
	}
	
	
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 入荷予定・仕入予定を訂正可能かチェックする<br>
	 */
	public class Chk05 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			
			if (!hasErr()) {
				// 入荷予定サービス、仕入予定サービスのチェックを実行
				callNextSrv();
			}
						
			setDown();
		}
		
		/**
		 * 関連するトランザクションデータをキャッシュ
		 */
		protected void initCache() {
			initArrPrCache(up0());
			initArrSchdCache(up0());
			initArrActByMfgInstNoCache(getArrSchdCache());
			initPoDCache(up0());
			initPoCache(getPoDCache());
			initPurcSchdCache(up0());
			initProvSchdCache(up0());
			initItmCache(getPoDCache());
			initItmUnitCache(getNotExtUpArrSchdCache(getPoDCache()));
			initDlvInstDCache(getArrSchdCache());
			initPrmsRcptDCache(getArrSchdCache());
		}
		
		/**
		 * 入荷予定サービス、仕入予定サービス、外注実績サービスのチェック処理を実行
		 */
		protected void callNextSrv() {
			MSBEL_ArrSchdService.ArrSchd_Chk01 arrSchdChk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			MSBEL_ArrSchdService.ArrSchd_Chk02 arrSchdChk02 = MSBEL_ArrSchdService.crtArrSchd_Chk02();
			MSBDL_PurcSchdRegService.PurcSchd_Chk01 purcSchdChk01 = MSBDL_PurcSchdRegService.crtPurcSchd_Chk01();
			
			// 入荷進捗を取得
			MCList<MST_ARR_PR_R> arrPrL = getArrPrCache();
			MCIndexKey arrPrKey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			
			for(Chk05_DtlR up0 : up0()) {
				MST_ARR_SCHD_R arrSchdR = getArrSchdCache(up0.arr_schd_no());
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(up0.arr_schd_no());
				// 全数打切の場合
				if ((up0.arr_abort_flg() || up0.purc_abort_flg())
						&& (arrSchdR.arr_qty().isZero()
								&& arrSchdR.purc_qty().isZero())) {
					MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrKey, arrSchdR.arr_pr_no());
					// 同時に打切しない場合はエラー
					if (!(purcSchdR.non_purc_flg() || arrSchdR.arr_skip_flg() && isNull(getPoDCacheByPoD(arrPrR.po_d_no()).dlv_cd())) && (!up0.purc_abort_flg() || !up0.arr_abort_flg())) {
						up0.err_flg(true);
						MCMessagePool.add(new MCMessage(up0, null, MSBDL0125, up0.arr_schd_no(), toDispGUIIndex(up0)));
						continue;
					}
					else {
						// 仕入実績がある場合はエラー
						if(!purcSchdR.base_unit_purc_qty().isZero()) {
							up0.err_flg(true);
							MCMessagePool.add(new MCMessage(up0, null, MSBDL0126, up0.arr_schd_no(), toDispGUIIndex(up0)));
							continue;
						}
						// 入荷予定サービスの更新（入荷進捗・予定）前チェックの上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
						arrSchdDtlR.peg_no(up0.peg_no());
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						if (arrSchdR.arr_skip_flg()) {
							arrSchdDtlR.abort_flg(up0.purc_abort_flg());
						}
						else {
							arrSchdDtlR.abort_flg(up0.arr_abort_flg());
						}
						arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
						MST_PO_D_R poDR = getPoDCacheByPoD(arrPrR.po_d_no());
						MST_PO_R poR = getPoDCache(poDR.po_no());
						
						arrSchdDtlR.xrate(poR.xrate());
						arrSchdDtlR.ptax_xrate(poR.ptax_xrate());
						arrSchdDtlR.trd_cur_cd(poR.trd_cur_cd());
						arrSchdDtlR.trd_cur_upri(poDR.trd_cur_upri());

						MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
						if(!isNull(provSchdR)) {
							arrSchdDtlR.prov_typ(provSchdR.prov_typ());
							arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
						}
						arrSchdChk01.up0().add(arrSchdDtlR);
					}
				}
				// 全数打切でない場合
				else {
					// 入荷・仕入同時打切
					if(up0.arr_abort_flg() && up0.purc_abort_flg()) {
						// 残数が等しくない場合はエラー
						if (!isSame(arrSchdR.arr_qty(),
								MCNumber.sum(purcSchdR.base_unit_purc_qty(), purcSchdR.base_unit_accpt_dfct_qty()))) {
							up0.err_flg(true);
							MCMessagePool.add(new MCMessage(up0, null, MSBDL0127, up0.arr_schd_no(), toDispGUIIndex(up0)));
							continue;
						}

						// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
						if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
							if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
								arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
							}
						}

						arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
						arrSchdChk02.up0().add(arrSchdDtlR);

						// 仕入予定サービスの実績更新前チェック　の上り電文設定
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						purcSchdChk01.up0().add(purcSchdDtlR);
					}
					// 入荷予定のみの残数打切
					else if(up0.arr_abort_flg()) {
						// 仕入実績がある場合はエラー
						if(!arrSchdR.purc_qty().isZero()) {
							up0.err_flg(true);
							MCMessagePool.add(new MCMessage(up0, null, MSBDL0128, up0.arr_schd_no(), toDispGUIIndex(up0)));
							continue;
						}
						// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
						if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
							if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
								arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
							}
						}

						arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
						arrSchdChk02.up0().add(arrSchdDtlR);
					}
					// 仕入予定の残数打切
					else if(up0.purc_abort_flg()) {
						// 入荷実績がある場合はエラー
						if(!arrSchdR.arr_qty().isZero()) {
							up0.err_flg(true);
							MCMessagePool.add(new MCMessage(up0, null, MSBDL0128, up0.arr_schd_no(), toDispGUIIndex(up0)));
							continue;
						}

						// 仕入予定サービスの実績更新前チェック　の上り電文設定
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						purcSchdChk01.up0().add(purcSchdDtlR);
					}
					// ロットＮＯなどの更新
					else {
						MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrKey, arrSchdR.arr_pr_no());
						// 入荷進捗、入荷予定が打切済の場合は解除
						if(arrPrR.abort_flg() || arrSchdR.abort_flg()) {
							// 全数打切の解除
							if(arrSchdR.arr_qty().isZero()) {
								// 入荷予定サービスの更新（入荷進捗・予定）前チェックの上り電文設定
								ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
								copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
								arrSchdDtlR.peg_no(up0.peg_no());
								arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								arrSchdDtlR.abort_flg(up0.arr_abort_flg());
								arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
								MST_PO_D_R poDR = getPoDCacheByPoD(arrPrR.po_d_no());
								MST_PO_R poR = getPoDCache(poDR.po_no());
								
								arrSchdDtlR.xrate(poR.xrate());
								arrSchdDtlR.ptax_xrate(poR.ptax_xrate());
								arrSchdDtlR.trd_cur_cd(poR.trd_cur_cd());
								arrSchdDtlR.trd_cur_upri(poDR.trd_cur_upri());

								MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
								if(!isNull(provSchdR)) {
									arrSchdDtlR.prov_typ(provSchdR.prov_typ());
									arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
								}
								arrSchdChk01.up0().add(arrSchdDtlR);
							}
							// 残数打切の解除
							else {
								// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
								ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
								copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
								// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
								if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
									MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
									MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
									if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
										arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
									}
								}

								arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
								arrSchdChk02.up0().add(arrSchdDtlR);
							}
						}
						// ロットなどの更新
						else {
							// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
							ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
							// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
							if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
								MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
								MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
								if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
									arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
								}
							}
	
							arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
							arrSchdChk02.up0().add(arrSchdDtlR);
						}
					}
				}
				
				// 前回仕入予定が残数打切の場合は仕入予定サービスに連携
				if(!up0.purc_abort_flg()) {
					if (purcSchdR.abort_flg()
							&& (!purcSchdR.base_unit_purc_qty().isZero()
									|| !purcSchdR.base_unit_accpt_dfct_qty().isZero())) {
						// 仕入予定サービスの実績更新前チェック　の上り電文設定
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						purcSchdChk01.up0().add(purcSchdDtlR);
					}
				}
			}
			
			for (Chk05_DtlR up : up0()) {
				MST_PO_D_R poDR = getPoDCacheByPoD(up.po_d_no());
				MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, poDR.trd_unit_cd());
				if (isNull(itmUnitR)) {
					up.err_flg(true);
					MCMessagePool.add(new MCMessage(up, null, MSBDL0610, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()), poDR.trd_unit_cd(), poDR.po_d_no(), toDispGUIIndex(up)));
				}
				chkTrdItmUnit(up);
			}
			
			// 入荷予定サービスの更新（入荷進捗・予定）前チェックを実行
			if(!arrSchdChk01.up0().isEmpty()) {
				arrSchdChk01.exec();
				copyErrFlg(up0(), arrSchdChk01.down0());
			}
			
			// 入荷予定サービスの更新（予定・実績）前チェックを実行
			if(!arrSchdChk02.up0().isEmpty()) {
				arrSchdChk02.exec();
				copyErrFlg(up0(), arrSchdChk02.down0());
			}
			
			// 仕入予定サービスの実績更新前チェックを実行
			if(!purcSchdChk01.up0().isEmpty()) {
				purcSchdChk01.exec();
				copyErrFlg(up0(), purcSchdChk01.down0());
			}
			
			// 外注製造実績サービスの更新前チェックを実行
			callOutSrcActChkSrv();
		}
		
		protected void callOutSrcActChkSrv() {
			MSBCL_OutSrcActService.OutSrcAct_Chk01 srv = MSBCL_OutSrcActService.crtOutSrcAct_Chk01();
			
			for (Chk05_DtlR up0 : up0()) {
				MST_ARR_SCHD_R schdR = getArrSchdCache(up0.arr_schd_no());
				if (isNull(schdR)) {
					continue;
				}
				if (!schdR.outsrc_flg()) {
					continue;
				}
				MCList<MST_ARR_ACT_R> aaL = getArrActCacheByMfgInstNo(schdR.mfg_inst_no());
				if (isNull(aaL)) {
					continue;
				}

				OutSrcAct_Chk01_ActDR srvUpR = OutSrcAct_Chk01_ActDR.create();
				copy(srvUpR, up0, createMap_OutSrcAct_Chk01_ActDR_Chk05_DtlR());
				srvUpR.mfg_inst_no(schdR.mfg_inst_no());

				if (!schdR.abort_flg() && up0.arr_abort_flg()) {
					// 今回打切する場合
					srvUpR.arr_schd_abort_flg(true);
				}
				else if (schdR.abort_flg() && !up0.arr_abort_flg()) {
					// 打切解除する場合
					srvUpR.arr_schd_abort_can_flg(true);
				}
				srv.up0().add(srvUpR);
			}
			
			if (!srv.up0().isEmpty()) {
				srv.exec();
				copyErrFlg(up0(), srv.down0());
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// 関連するトランザクションデータをキャッシュ
			initCache();

			msgL.addAll(chkItm());
			msgL.addAll(chkArrPr());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			checkReqLotNo();
			checkDac();
			checkArrSchdItmUnit(up0().get(0));
			return super.doServerCheckSub();
		}
		
		/**
		 * ロットＮＯ、サブロットＮＯの条件付必須チェック
		 */
		protected void checkReqLotNo() {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk05_DtlR r : up0()) {
				if (!r.crt_lot_flg()) {
					continue;
				}
				
				MST_PO_D_R poDR = getPoDCacheByPoD(r.po_d_no());
				MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				
				if (isNull(itmR)) {
					continue;
				}
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(itmR.lot_no_typ())) {
					msgL.addAll(check(r, Chk05_DtlR.$lot_no, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()) && MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())) {
					msgL.addAll(check(r, Chk05_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		
		protected void checkDac() {
			MST_PO_R poR = getPoDCache(getPoDCacheByPoD(up0().get(0).po_d_no()).po_no());
			MCMessagePool.addAll(checkWritableDptCdDac(poR, MST_PO_R.$purc_dpt_cd));
		}
		
		/**
		 * 入荷進捗のロック、更新カウンタチェック
		 */
		protected MCMessageList chkArrPr() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk05_DtlR> notErrHdrL = getChkList(up0());
			notErrHdrL = notErrHdrL.groupBy(Chk05_DtlR.$arr_pr_no, Chk05_DtlR.$arr_pr_upd_cntr);
			if (notErrHdrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			arrPrL_bldr.setOrderByAsc(t.arr_pr_no);
			MCList<Chk05_DtlR> bindHdrL = notErrHdrL;
			bindHdrL.sort(Chk05_DtlR.$arr_pr_no);
			dbSelectForUpdateNoWait("MSBDL0120_MST_ARR_PR_S04", arrPrL, arrPrL_bldr, bindHdrL);
			
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			for (Chk05_DtlR r : notErrHdrL) {
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, r.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(r, Chk05_DtlR.$arr_pr_upd_cntr, arrPrR));
			}
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkItm() {
			MCMessageList msgL = new MCMessageList();
			for(Chk05_DtlR r : up0()) {
				MST_PO_D_R poDR = getPoDCacheByPoD(r.po_d_no());
				MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					msgL.add(new MCMessage(r, null, MAUAL0189
							, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3())
							, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		protected void chkTrdItmUnit(Chk05_DtlR up0R) {
			MST_ARR_SCHD_R arrSchdR = getArrSchdCache(up0R.arr_schd_no());
			chkArrTrdUnit(arrSchdR, up0R);
		}
		
		protected void checkArrSchdItmUnit(Chk05_DtlR up0R) {
			MCList<MST_ARR_SCHD_R> arrSchdL = getNotExtUpArrSchdCache(getPoDCache());
			MCIndexKey idxUp0 = up0().createIndex(Chk05_DtlR.$arr_schd_no);
			for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
				if (isNull(up0().getFirst(idxUp0, arrSchdR.arr_schd_no()))) {
					chkArrTrdUnit(arrSchdR, up0R);
				}
			}
		}
		
		protected MCList<MST_ARR_SCHD_R> getNotExtUpArrSchdCache(MCList<MST_PO_D_R> poDL) {
			MCList<MST_ARR_SCHD_R> notExtUpArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R arrSchd = MST_ARR_SCHD_R.create("ARRSCHD");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create( arrSchd);
			MST_ARR_PR_R arrPr =MST_ARR_PR_R.create("ARRPR");
			MST_PO_D_R poD = MST_PO_D_R.create("POD");
			arrSchdL_bldr.setSelect(arrSchd.arr_schd_no);
			arrSchdL_bldr.addSelect(arrSchd.itm_cd);
			arrSchdL_bldr.addSelect(arrSchd.itm_sub1);
			arrSchdL_bldr.addSelect(arrSchd.itm_sub2);
			arrSchdL_bldr.addSelect(arrSchd.itm_sub3);
			arrSchdL_bldr.addSelect(arrSchd.trd_unit_cd);
			arrSchdL_bldr.addInnerJoin(arrPr, arrSchd.arr_pr_no.eq(arrPr.arr_pr_no));
			arrSchdL_bldr.addInnerJoin(poD, arrPr.po_d_no.eq(poD.po_d_no));
			arrSchdL_bldr.setWhere(poD.po_no.eq(bind("po_no")));
			arrSchdL_bldr.addWhereWithAnd(poD.can_flg.eq(value(false)));
			dbSelect("MSBDL0120_MST_ARR_SCHD_S03", notExtUpArrSchdL, arrSchdL_bldr, poDL.groupBy(MST_PO_D_R.$po_no));
			return notExtUpArrSchdL;
		}
		
		protected void chkArrTrdUnit(MST_ARR_SCHD_R arrSchdR, Chk05_DtlR up0R) {
			MCList<MAVM_ITM_UNIT_R> itmUnitL = getItmUnitCache(arrSchdR.itm_cd(), arrSchdR.itm_sub1(), arrSchdR.itm_sub2(), arrSchdR.itm_sub3());
			MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(MAVM_ITM_UNIT_R.$unit_cd, arrSchdR.trd_unit_cd());
			if (isNull(itmUnitR)) {
				up0R.err_flg(true);
				MCMessagePool.add(new MCMessage(up0R, null, MSBDL0611, toDispItm(arrSchdR.itm_cd(), arrSchdR.itm_sub1(), arrSchdR.itm_sub2(), arrSchdR.itm_sub3()),
						arrSchdR.trd_unit_cd(), arrSchdR.arr_schd_no(), toDispGUIIndex(up0R)));
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
	 * Upd05オペレーション.<p>
	 *
	 * 入荷予定・仕入予定を訂正する<br>
	 */
	public class Upd05 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Upd05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			
			callThisChk05();
			throwUpdErr();

			// 入荷予定サービス、仕入予定サービスを実行
			callNextSrv();
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk05_DtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBDL_PurcDlvDtAdjstReg.Chk05 ope = MSBDL_PurcDlvDtAdjstReg.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 入荷予定サービス、仕入予定サービスを実行
		 */
		protected void callNextSrv() {
			MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			MSBEL_ArrSchdService.ArrSchd_Upd02 arrSchdUpd02 = MSBEL_ArrSchdService.crtArrSchd_Upd02();
			MSBEL_ArrSchdService.ArrSchd_Upd03 arrSchdUpd03 = MSBEL_ArrSchdService.crtArrSchd_Upd03();
			MSBDL_PurcSchdRegService.PurcSchd_Upd02 purcSchdUpd02 = MSBDL_PurcSchdRegService.crtPurcSchd_Upd02();
			
			// 入荷進捗を取得
			MCList<MST_ARR_PR_R> arrPrL = getArrPrCache();
			MCIndexKey arrPrKey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			
			MCIndexKey up0Key = up0().createIndex(Chk05_DtlR.$po_d_no);
			
			for(Chk05_DtlR up0 : up0()) {
				MST_ARR_SCHD_R arrSchdR = getArrSchdCache(up0.arr_schd_no());
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(up0.arr_schd_no());

				// 全数打切の場合
				if ((up0.arr_abort_flg() || up0.purc_abort_flg())
						&& (arrSchdR.arr_qty().isZero()
								&& arrSchdR.purc_qty().isZero())) {
					
					// 同時に打切しない場合はエラーとしているため、該当ケースなし
					if (!(purcSchdR.non_purc_flg() || arrSchdR.arr_skip_flg())
							&& (!up0.purc_abort_flg() || !up0.arr_abort_flg())) {
						continue;
					}
					else {
						// 入荷予定サービスの更新（入荷進捗・予定）の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
						arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());

						MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrKey, arrSchdR.arr_pr_no());
						Chk05_DtlR tmpUp0 = up0().getFirst(up0Key, arrPrR.po_d_no());
						arrSchdDtlR.peg_no(tmpUp0.peg_no());
						arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						if (arrSchdR.arr_skip_flg()) {
							arrSchdDtlR.abort_flg(up0.purc_abort_flg());
						}
						else {
							arrSchdDtlR.abort_flg(up0.arr_abort_flg());
						}
						arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
						MST_PO_D_R poDR = getPoDCacheByPoD(arrPrR.po_d_no());
						MST_PO_R poR = getPoDCache(poDR.po_no());
						
						arrSchdDtlR.xrate(poR.xrate());
						arrSchdDtlR.ptax_xrate(poR.ptax_xrate());
						arrSchdDtlR.trd_cur_cd(poR.trd_cur_cd());
						arrSchdDtlR.trd_cur_upri(poDR.trd_cur_upri());

						MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
						if(!isNull(provSchdR)) {
							arrSchdDtlR.prov_typ(provSchdR.prov_typ());
							arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
						}
						arrSchdUpd01.up1().add(arrSchdDtlR);
					}
				}
				else {
					if(up0.arr_abort_flg() && up0.purc_abort_flg()) {
						// 数量が一致していない場合はエラーとしている
						
						// 入荷予定サービスの更新（予定・実績）　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
						if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
							if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
								arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
							}
						}
						
						arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
						arrSchdUpd02.up0().add(arrSchdDtlR);
						
						// 仕入予定サービスの実績更新　の上り電文設定
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
						purcSchdDtlR.purc_ddlv_flg(!isNull(poDR.dlv_cd()));
						purcSchdUpd02.up0().add(purcSchdDtlR);
						
						// 入荷予定サービスの更新（仕入・売上返品）　の上り電文設定
						arrSchdDtlR.arr_ptn_typ(arrSchdR.arr_ptn_typ());
						arrSchdUpd03.up0().add(arrSchdDtlR);
					}
					// 入荷予定のみの残数打切
					else if(up0.arr_abort_flg()) {
						// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
						if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
							if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
								arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
							}
						}
						
						arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
						arrSchdUpd02.up0().add(arrSchdDtlR);
					}
					// 仕入予定のみの残数打切
					else if(up0.purc_abort_flg()) {
						// 仕入予定サービスの実績更新前チェック　の上り電文設定
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						purcSchdUpd02.up0().add(purcSchdDtlR);
						
						// 入荷予定サービスの更新（仕入・売上返品）　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						arrSchdDtlR.arr_ptn_typ(arrSchdR.arr_ptn_typ());
						arrSchdUpd03.up0().add(arrSchdDtlR);
					}
					// ロットＮＯなどの更新
					else {
						MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrKey, arrSchdR.arr_pr_no());
						// 入荷進捗、入荷予定が打切済の場合は解除
						if(arrPrR.abort_flg() || arrSchdR.abort_flg()) {
							// 全数打切の解除
							if(arrSchdR.arr_qty().isZero()) {
								// 入荷予定サービスの更新（入荷進捗・予定）の上り電文設定
								ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
								copy(arrSchdDtlR, arrSchdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
								
								Chk05_DtlR tmpUp0 = up0().getFirst(up0Key, arrPrR.po_d_no());
								arrSchdDtlR.accpt_schd_dt(purcSchdR.purc_schd_dt());
								arrSchdDtlR.peg_no(tmpUp0.peg_no());
								arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								arrSchdDtlR.abort_flg(up0.arr_abort_flg());
								arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
								MST_PO_D_R poDR = getPoDCacheByPoD(arrPrR.po_d_no());
								MST_PO_R poR = getPoDCache(poDR.po_no());
								
								arrSchdDtlR.xrate(poR.xrate());
								arrSchdDtlR.ptax_xrate(poR.ptax_xrate());
								arrSchdDtlR.trd_cur_cd(poR.trd_cur_cd());
								arrSchdDtlR.trd_cur_upri(poDR.trd_cur_upri());

								MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
								if(!isNull(provSchdR)) {
									arrSchdDtlR.prov_typ(provSchdR.prov_typ());
									arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
								}
								arrSchdUpd01.up1().add(arrSchdDtlR);
							}
							// 残数打切の解除
							else {
								// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
								ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
								copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
								// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
								if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
									MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
									MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
									if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
										arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
									}
								}
		
								arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
								arrSchdUpd02.up0().add(arrSchdDtlR);
							}
						}
						else {
							// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
							ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
							// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
							if(!isNullOrNullVal(arrSchdDtlR.lot_no())) {
								MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
								MAM_ITM_R itmR = getItmCache(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
								if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
									arrSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
								}
							}
	
							arrSchdDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
							arrSchdUpd02.up0().add(arrSchdDtlR);
						}
					}
				}
				
				// 前回仕入予定が打切の場合は仕入予定サービスに連携
				if(!up0.purc_abort_flg()) {
					if (purcSchdR.abort_flg()
							&& (!purcSchdR.base_unit_purc_qty().isZero()
									|| !purcSchdR.base_unit_accpt_dfct_qty().isZero())) {
						PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
						copy(purcSchdDtlR, up0, createMap_PurcSchd_DtlR_Chk05_DtlR());
						purcSchdDtlR.purc_schd_no(purcSchdR.purc_schd_no());
						purcSchdDtlR.base_unit_purc_qty(purcSchdR.base_unit_purc_qty());
						purcSchdDtlR.base_unit_accpt_dfct_qty(purcSchdR.base_unit_accpt_dfct_qty());
						MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
						purcSchdDtlR.purc_ddlv_flg(!isNull(poDR.dlv_cd()));
						purcSchdUpd02.up0().add(purcSchdDtlR);
						
						// 入荷予定サービスの更新（仕入・売上返品）　の上り電文設定
						ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
						copy(arrSchdDtlR, up0, createMap_ArrSchd_DtlR_Chk05_DtlR_For02());
						arrSchdDtlR.arr_ptn_typ(arrSchdR.arr_ptn_typ());
						arrSchdUpd03.up0().add(arrSchdDtlR);
					}
				}
			}
			
			// 入荷予定サービスの更新（入荷進捗・予定）の入荷進捗に対する上り電文設定
			for(ArrSchd_DtlR r : arrSchdUpd01.up1().groupBy(ArrSchd_DtlR.$arr_pr_no)) {
				ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(arrPrKey, r.arr_pr_no());
				copy(arrPrDtlR, arrPrR, createMap_ArrPr_DtlR_MST_ARR_PR_R());
				Chk05_DtlR up0 = up0().getFirst(up0Key, arrPrR.po_d_no());
				arrPrDtlR.peg_no(up0.peg_no());
				arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				arrPrDtlR.abort_flg(false);
				arrSchdUpd01.up0().add(arrPrDtlR);
			}

			
			// 入荷予定サービスの更新（入荷進捗・予定）を実行
			if(!arrSchdUpd01.up0().isEmpty()) {
				arrSchdUpd01.exec();
			}
			
			// 入荷予定サービスの更新（予定・実績）を実行
			if(!arrSchdUpd02.up0().isEmpty()) {
				arrSchdUpd02.exec();
			}
			
			// 仕入予定サービスの実績更新を実行
			if(!purcSchdUpd02.up0().isEmpty()) {
				purcSchdUpd02.exec();
			}
			
			// 入荷予定サービスの更新（仕入・売上返品）を実行
			if(!arrSchdUpd03.up0().isEmpty()) {
				arrSchdUpd03.exec();
			}
			
			// 外注製造実績サービスの更新を実行
			callOutSrcActUpdSrv();
			callPurcPrntUpd01();
			callPurcPrntUpd02();
			setDown();
		}
		protected void setDown() {
			down0().setAll(up0());
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
		
		protected void callOutSrcActUpdSrv() {
			MSBCL_OutSrcActService.OutSrcAct_Upd01 srv = MSBCL_OutSrcActService.crtOutSrcAct_Upd01();
			
			Set<String> mfgInstNoSet = new HashSet<String>();
			for (Chk05_DtlR upR : up0()) {
				MST_ARR_SCHD_R schdR = getArrSchdCache(upR.arr_schd_no());
				if (isNull(schdR)) {
					continue;
				}
				if (!schdR.outsrc_flg()) {
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
					srvUpR.setAttributes(upR);
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
			
			if (!srv.up0().isEmpty()) {
				srv.exec();
			}
		}
		protected void callPurcPrntUpd01() {
			MCList<PurcPrnt_Upd01_HdrR> srvUp0 = MCList.create(PurcPrnt_Upd01_HdrR.class);
			boolean prmsRcptFlg = false;
			boolean dlvInstFlg = false;
			boolean nonTgtFlg = true;
			for(Chk05_DtlR up0 : up0()) {
				MST_ARR_SCHD_R arrSchdR = getArrSchdCache(up0.arr_schd_no());
				if (!isNull(arrSchdR.dlv_slip_mng_d_no())) {
					nonTgtFlg = false;
				}
				if (!isNull(arrSchdR.prms_rcpt_d_no())) {
					prmsRcptFlg = true;
					break;
				}
				else if (!isNull(arrSchdR.dlv_inst_d_no())) {
					dlvInstFlg = true;
				}
			}
			// 上り電文の納品書ＮＯがすべて設定されていない場合は、処理対象外
			if (nonTgtFlg) {
				return;
			}
			if (!prmsRcptFlg && !dlvInstFlg) {
				// 発注ＮＯごとに処理するので、先頭行だけ参照する
				Chk05_DtlR up0 = up0().get(0);
				PurcPrnt_Upd01_HdrR hdrR = srvUp0.add();
				MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
				MST_PO_R poR = getPoDCache(poDR.po_no());
				hdrR.po_no(poDR.po_no());
				hdrR.po_rev(poR.po_rev());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				hdrR.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value());
			}
			else {
				MCList<PurcPrnt_Upd01_HdrR> wk = MCList.create(PurcPrnt_Upd01_HdrR.class);
				String[] gpKey = new String[] {
					PurcPrnt_Upd01_HdrR.$po_no,
					PurcPrnt_Upd01_HdrR.$po_rev,
					prmsRcptFlg ? PurcPrnt_Upd01_HdrR.$prms_rcpt_grp_no : PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no,
					PurcPrnt_Upd01_HdrR.$purc_dlv_slip_src_typ
				};
				for(Chk05_DtlR up0 : up0()) {
					MST_ARR_SCHD_R arrSchdR = getArrSchdCache(up0.arr_schd_no());
					// 納期回答受領済の場合、納期回答受領GNOをキーに納品書発行サービスを呼び出す
					if (prmsRcptFlg) {
						if (!isNull(arrSchdR.prms_rcpt_d_no())) {
							PurcPrnt_Upd01_HdrR hdrR = wk.add();
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MST_PO_R poR = getPoDCache(poDR.po_no());
							MST_PRMS_RCPT_D_R prmsRcptDR = getPrmsRcptDCache(arrSchdR.prms_rcpt_d_no());
							hdrR.po_no(poDR.po_no());
							hdrR.po_rev(poR.po_rev());
							hdrR.prms_rcpt_grp_no(prmsRcptDR.getStringNE("prms_rcpt_grp_no"));
							hdrR.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.PRMS_RCPT.value());
						}
					}
					// 納入指示済で、納期回答受領をしていない場合、納入指示GNOをキーに納品書発行サービスを呼び出す
					else {
						if (!isNull(arrSchdR.dlv_inst_d_no())) {
							PurcPrnt_Upd01_HdrR hdrR = wk.add();
							MST_PO_D_R poDR = getPoDCacheByPoD(up0.po_d_no());
							MST_PO_R poR = getPoDCache(poDR.po_no());
							MST_DLV_INST_D_R dlvInstDR = getDlvInstDCache(arrSchdR.dlv_inst_d_no());
							hdrR.po_no(poDR.po_no());
							hdrR.po_rev(poR.po_rev());
							hdrR.dlv_inst_grp_no(dlvInstDR.getStringNE("dlv_inst_grp_no"));
							hdrR.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.DLV_INST.value());
						}
					}
				}
				srvUp0 = wk.groupBy(gpKey);
			}
			if (!isNull(srvUp0) && !srvUp0.isEmpty()) {
				srvUp0.setBooleanNE(PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg, up1().dlv_slip_print_flg());
				MSBDL_PurcPrntService.PurcPrnt_Upd01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
				ope.up0().addAll(srvUp0);
				setPegNo(ope.up0());
				ope.exec();
				MCIndexKey down1Idx = ope.down1().createIndex(PurcPrnt_Upd01_DtlR.$arr_schd_no);
				for (Chk05_DtlR up0R : up0()) {
					PurcPrnt_Upd01_DtlR down1R = ope.down1().getFirst(down1Idx, up0R.arr_schd_no());
					if (!isNull(down1R)) {
						up0R.dlv_slip_mng_no(down1R.dlv_slip_mng_no());
						up0R.dlv_slip_mng_seq(down1R.dlv_slip_mng_seq());
						up0R.dlv_slip_no(down1R.dlv_slip_no());
						up0R.dlv_slip_seq(down1R.dlv_slip_seq());
						up0R.dlv_slip_rev(down1R.dlv_slip_rev());
						up0R.dlv_slip_d_no(down1R.dlv_slip_d_no());
						up0R.dlv_slip_d_seq(down1R.dlv_slip_d_seq());
					}
				}
			}
		}
		protected void callPurcPrntUpd02() {
			MCList<PurcPrnt_Upd02_HdrR> lst = MCList.create(PurcPrnt_Upd02_HdrR.class);
			setAll(lst, up0(), createMap_PurcPrnt_Upd02_HdrR_Chk05_DtlR());
			
			MSBDL_PurcPrntService.PurcPrnt_Upd02 ope = MSBDL_PurcPrntService.crtPurcPrnt_Upd02();
			ope.up0().setAll(lst.distinctNE(PurcPrnt_Upd02_HdrR.$po_no));
			ope.up0().forEach(r -> {
				r.dlv_slip_prnt_flg(up1().purc_ddlv_dlv_slip_print_flg());
				r.indiv_prnt_flg(up1().indiv_prnt_flg());
			});
			setPegNo(ope.up0());
			ope.exec();
			MCIndexKey down1Idx = ope.down1().createIndex(PurcPrnt_Upd01_DtlR.$arr_schd_no);
			for (Chk05_DtlR up0R : up0()) {
				PurcPrnt_Upd02_DtlR down1R = ope.down1().getFirst(down1Idx, up0R.arr_schd_no());
				if (!isNull(down1R)) {
					up0R.purc_ddlv_dlv_slip_no(down1R.purc_ddlv_dlv_slip_no());
					up0R.purc_ddlv_dlv_slip_seq(down1R.purc_ddlv_dlv_slip_seq());
					up0R.purc_ddlv_dlv_slip_rev(down1R.purc_ddlv_dlv_slip_rev());
					up0R.purc_ddlv_dlv_slip_d_no(down1R.purc_ddlv_dlv_slip_d_no());
				}
			}
		}
		protected Map_PurcPrnt_Upd02_HdrR_Chk05_DtlR<PurcPrnt_Upd02_HdrR,Chk05_DtlR> createMap_PurcPrnt_Upd02_HdrR_Chk05_DtlR() {
			return new Map_PurcPrnt_Upd02_HdrR_Chk05_DtlR<PurcPrnt_Upd02_HdrR, Chk05_DtlR>();
		}
		public class Map_PurcPrnt_Upd02_HdrR_Chk05_DtlR<D extends PurcPrnt_Upd02_HdrR, S extends Chk05_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.po_no(getPoDCacheByPoD(src.po_d_no()).po_no());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書・納入指示書を発行する<br>
	 */
	public class Prnt01 extends MSBDL_PurcDlvDtAdjstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 購買帳票発行サービスを実行
			callPurcPrntSrvPrnt01();
		}
		
		/**
		 * 購買帳票発行サービスの注文書・納入指示書・納品書発行を実行する
		 */
		protected void callPurcPrntSrvPrnt01() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 purcPrntPrnt01 = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			poDL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL0120_MST_PO_D_S03", poDL, poDL_bldr, up2());
			MCIndexKey poDLKey = poDL.createIndex(MST_PO_D_R.$po_d_no);
			// 納入指示書
			if (up0().dlv_inst_print_flg()) {
				for (Prnt01_DtlR r : up1()) {
					MST_PO_D_R poDR = poDL.getFirst(poDLKey, r.po_d_no());
					PurcPrnt_Prnt01_DlvInstR purcPrntPrnt01DlvInstR = PurcPrnt_Prnt01_DlvInstR.create();
					copy(purcPrntPrnt01DlvInstR, r, createMap_PurcPrnt_Prnt01_DlvInstR_Prnt01_DtlR());
					purcPrntPrnt01DlvInstR.po_no(poDR.po_no());
					purcPrntPrnt01.up1().add(purcPrntPrnt01DlvInstR);
				}
			}
			
			if(up0().dlv_slip_print_flg() || up0().purc_ddlv_dlv_slip_print_flg()) {
				MST_PO_D_R tmpPoDR = poDL.get(0);
				MCList<Prnt01_Dtl2R>[] grpL = up2().groupList(Prnt01_Dtl2R.$dlv_slip_mng_no, Prnt01_Dtl2R.$dlv_slip_mng_seq);
				MCList<Prnt01_Dtl2R> hdrL = MCList.create(Prnt01_Dtl2R.class);
				for (MCList<Prnt01_Dtl2R> dtlL : grpL) {
					hdrL.add(dtlL.get(0));
				}
				for(Prnt01_Dtl2R r : hdrL){
					if (isNull(r.dlv_slip_mng_no()) || r.dlv_slip_mng_no().isEmpty()) {
						continue;
					}
					PurcPrnt_Prnt01_DlvSlipR upR = purcPrntPrnt01.up2().createRow();
					copy(upR, r, createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR());
					upR.po_no(tmpPoDR.po_no());
					upR.bp_srch_flg(true);
					upR.inc_can_flg(true);
					if(up0().dlv_slip_print_flg()) {
						purcPrntPrnt01.up2().add(upR);
					}
					if (up0().purc_ddlv_dlv_slip_print_flg()) {
						purcPrntPrnt01.up4().add(upR);
					}
				}
			}
			purcPrntPrnt01.up3().indiv_prnt_flg(up0().indiv_prnt_flg());
			
			if(!purcPrntPrnt01.up1().isEmpty() || !purcPrntPrnt01.up2().isEmpty() || !purcPrntPrnt01.up4().isEmpty()) {
				purcPrntPrnt01.exec();
			}
		}
		
		protected Map_PurcPrnt_Prnt01_DlvInstR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvInstR,Prnt01_DtlR> createMap_PurcPrnt_Prnt01_DlvInstR_Prnt01_DtlR() {
			return new Map_PurcPrnt_Prnt01_DlvInstR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvInstR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvInstR_Prnt01_DtlR<D extends PurcPrnt_Prnt01_DlvInstR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$po_d_no, Prnt01_DtlR.$po_d_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_no, Prnt01_DtlR.$dlv_inst_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_rev, Prnt01_DtlR.$dlv_inst_rev);
			}
		}
		
		protected Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvSlipR,Prnt01_Dtl2R> createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR() {
			return new Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<PurcPrnt_Prnt01_DlvSlipR, Prnt01_Dtl2R>();
		}

		public class Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_DtlR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_Dtl2R.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_d_no, Prnt01_Dtl2R.$po_d_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, Prnt01_Dtl2R.$dlv_slip_mng_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq, Prnt01_Dtl2R.$dlv_slip_mng_seq);
			}
		}
	}
	
	protected Map_DlvInst_Chk01_HdrR_Chk01_HdrR<DlvInst_Chk01_HdrR,Chk01_HdrR> createMap_DlvInst_Chk01_HdrR_Chk01_HdrR() {
		return new Map_DlvInst_Chk01_HdrR_Chk01_HdrR<DlvInst_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_DlvInst_Chk01_HdrR_Chk01_HdrR<D extends DlvInst_Chk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInst_Chk01_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(DlvInst_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$err_flg, Chk01_HdrR.$err_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$po_d_no, Chk01_HdrR.$po_d_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_no, Chk01_HdrR.$dlv_inst_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_rev, Chk01_HdrR.$dlv_inst_rev);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_dt, Chk01_HdrR.$dlv_inst_dt);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_prnt_rmrks, Chk01_HdrR.$dlv_inst_print_rmrks);
			addColumnPathMap(DlvInst_Chk01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(DlvInst_Chk01_HdrR.$edi_flg, Chk01_HdrR.$crnt_edi_dlv_inst_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_grp_no, Chk01_HdrR.$dlv_inst_grp_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, Chk01_HdrR.$crnt_edi_dlv_inst_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$ext_sys_typ, Chk01_HdrR.$dlv_inst_ext_sys_typ);
		}
	}
	
	protected Map_DlvInst_Chk01_DtlR_Chk01_DtlR<DlvInst_Chk01_DtlR,Chk01_DtlR> createMap_DlvInst_Chk01_DtlR_Chk01_DtlR() {
		return new Map_DlvInst_Chk01_DtlR_Chk01_DtlR<DlvInst_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_DlvInst_Chk01_DtlR_Chk01_DtlR<D extends DlvInst_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInst_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(DlvInst_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_no, Chk01_DtlR.$dlv_inst_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_d_no, Chk01_DtlR.$dlv_inst_d_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_loc_cd, Chk01_DtlR.$dlv_rqst_loc_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_str_ln_cd, Chk01_DtlR.$dlv_rqst_str_ln_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(DlvInst_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_print_d_rmrks, Chk01_DtlR.$dlv_inst_print_d_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_slip_d_rmrks, Chk01_DtlR.$dlv_slip_d_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_lg_grp_cd, Chk01_DtlR.$dlv_lg_grp_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_sundry_flg, Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_lg_grp_cd, Chk01_DtlR.$tdlv_lg_grp_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
		}
	}
	
	
	protected Map_Prms_Chk01_HdrR_Chk02_HdrR<Prms_Chk01_HdrR,Chk02_HdrR> createMap_Prms_Chk01_HdrR_Chk02_HdrR() {
		return new Map_Prms_Chk01_HdrR_Chk02_HdrR<Prms_Chk01_HdrR, Chk02_HdrR>();
	}

	public class Map_Prms_Chk01_HdrR_Chk02_HdrR<D extends Prms_Chk01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Prms_Chk01_HdrR.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
			addColumnPathMap(Prms_Chk01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(Prms_Chk01_HdrR.$err_flg, Chk02_HdrR.$err_flg);
			addColumnPathMap(Prms_Chk01_HdrR.$prms_rcpt_no, Chk02_HdrR.$prms_rcpt_no);
			addColumnPathMap(Prms_Chk01_HdrR.$po_d_no, Chk02_HdrR.$po_d_no);
			addColumnPathMap(Prms_Chk01_HdrR.$arr_schd_refl_flg, Chk02_HdrR.$arr_schd_refl_flg);
			addColumnPathMap(Prms_Chk01_HdrR.$arr_schd_refl_dt, Chk02_HdrR.$arr_schd_refl_dt);
			addColumnPathMap(Prms_Chk01_HdrR.$prms_rcpt_dt, Chk02_HdrR.$prms_rcpt_dt);
			addColumnPathMap(Prms_Chk01_HdrR.$intr_rmrks, Chk02_HdrR.$intr_rmrks);
			addColumnPathMap(Prms_Chk01_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
			addColumnPathMap(Prms_Chk01_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
			addColumnPathMap(Prms_Chk01_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
			addColumnPathMap(Prms_Chk01_HdrR.$edi_flg, Chk02_HdrR.$edi_flg);
			addColumnPathMap(Prms_Chk01_HdrR.$is_src_batch_flg, Chk02_HdrR.$is_src_batch_flg);
			addColumnPathMap(Prms_Chk01_HdrR.$prms_rcpt_grp_no, Chk02_HdrR.$prms_rcpt_grp_no);
		}
	}
	
	protected Map_Prms_Chk01_DtlR_Chk02_DtlR<Prms_Chk01_DtlR,Chk02_DtlR> createMap_Prms_Chk01_DtlR_Chk02_DtlR() {
		return new Map_Prms_Chk01_DtlR_Chk02_DtlR<Prms_Chk01_DtlR, Chk02_DtlR>();
	}

	public class Map_Prms_Chk01_DtlR_Chk02_DtlR<D extends Prms_Chk01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Prms_Chk01_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(Prms_Chk01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
			addColumnPathMap(Prms_Chk01_DtlR.$hdr_peg_no, Chk02_DtlR.$hdr_peg_no);
			addColumnPathMap(Prms_Chk01_DtlR.$err_flg, Chk02_DtlR.$err_flg);
			addColumnPathMap(Prms_Chk01_DtlR.$prms_rcpt_no, Chk02_DtlR.$prms_rcpt_no);
			addColumnPathMap(Prms_Chk01_DtlR.$prms_rcpt_d_no, Chk02_DtlR.$prms_rcpt_d_no);
			addColumnPathMap(Prms_Chk01_DtlR.$dlv_inst_d_no, Chk02_DtlR.$dlv_inst_d_no);
			addColumnPathMap(Prms_Chk01_DtlR.$purc_act_d_no, Chk02_DtlR.$purc_act_d_no);
			addColumnPathMap(Prms_Chk01_DtlR.$mfg_inst_no, Chk02_DtlR.$mfg_inst_no);
			addColumnPathMap(Prms_Chk01_DtlR.$prms_dlv_tm, Chk02_DtlR.$prms_dlv_tm);
			addColumnPathMap(Prms_Chk01_DtlR.$purc_schd_dt, Chk02_DtlR.$purc_schd_dt);
			addColumnPathMap(Prms_Chk01_DtlR.$sync_flg, Chk02_DtlR.$sync_flg);
			addColumnPathMap(Prms_Chk01_DtlR.$trd_unit_cd, Chk02_DtlR.$trd_unit_cd);
			addColumnPathMap(Prms_Chk01_DtlR.$trd_unit_qty, Chk02_DtlR.$trd_unit_qty);
			addColumnPathMap(Prms_Chk01_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
			addColumnPathMap(Prms_Chk01_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
			addColumnPathMap(Prms_Chk01_DtlR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
			addColumnPathMap(Prms_Chk01_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
			addColumnPathMap(Prms_Chk01_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
			addColumnPathMap(Prms_Chk01_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);
			addColumnPathMap(Prms_Chk01_DtlR.$prms_rmrks, Chk02_DtlR.$prms_rmrks);
		}
	}

	
	
	protected Map_ArrSchd_DtlR_Chk05_DtlR_For01<ArrSchd_DtlR,Chk05_DtlR> createMap_ArrSchd_DtlR_Chk05_DtlR_For01() {
		return new Map_ArrSchd_DtlR_Chk05_DtlR_For01<ArrSchd_DtlR, Chk05_DtlR>();
	}

	public class Map_ArrSchd_DtlR_Chk05_DtlR_For01<D extends ArrSchd_DtlR, S extends Chk05_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$peg_no, Chk05_DtlR.$peg_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk05_DtlR.$arr_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$abort_flg, Chk05_DtlR.$arr_abort_flg);
		}
	}
	
	protected Map_ArrSchd_DtlR_Chk05_DtlR_For02<ArrSchd_DtlR,Chk05_DtlR> createMap_ArrSchd_DtlR_Chk05_DtlR_For02() {
		return new Map_ArrSchd_DtlR_Chk05_DtlR_For02<ArrSchd_DtlR, Chk05_DtlR>();
	}

	public class Map_ArrSchd_DtlR_Chk05_DtlR_For02<D extends ArrSchd_DtlR, S extends Chk05_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$peg_no, Chk05_DtlR.$peg_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk05_DtlR.$arr_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, Chk05_DtlR.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, Chk05_DtlR.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$abort_flg, Chk05_DtlR.$arr_abort_flg);
			addColumnPathMap(ArrSchd_DtlR.$crt_lot_flg, Chk05_DtlR.$crt_lot_flg);
			addColumnPathMap(ArrSchd_DtlR.$bp_lot_no, Chk05_DtlR.$bp_lot_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.bp_lot_upd_flg(true);
			dest.is_src_purcdlvadjst_flg(true);
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
	
	protected Map_PurcSchd_DtlR_Chk05_DtlR<PurcSchd_DtlR,Chk05_DtlR> createMap_PurcSchd_DtlR_Chk05_DtlR() {
		return new Map_PurcSchd_DtlR_Chk05_DtlR<PurcSchd_DtlR, Chk05_DtlR>();
	}

	public class Map_PurcSchd_DtlR_Chk05_DtlR<D extends PurcSchd_DtlR, S extends Chk05_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcSchd_DtlR.$peg_no, Chk05_DtlR.$peg_no);
			addColumnPathMap(PurcSchd_DtlR.$arr_schd_no, Chk05_DtlR.$arr_schd_no);
			addColumnPathMap(PurcSchd_DtlR.$abort_flg, Chk05_DtlR.$purc_abort_flg);
		}
	}
	
	protected Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<OutSrcAct_Chk01_ActDR,Chk05_DtlR> createMap_OutSrcAct_Chk01_ActDR_Chk05_DtlR() {
		return new Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<OutSrcAct_Chk01_ActDR, Chk05_DtlR>();
	}

	public class Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<D extends OutSrcAct_Chk01_ActDR, S extends Chk05_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Chk01_ActDR.$peg_no, Chk05_DtlR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		
	}

	//FMCB CUSTOM END
}