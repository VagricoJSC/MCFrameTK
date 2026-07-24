package mcframe.serverMSBE.MSBEL2210;

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
import mcframe.serverMSBE.MSBEL2210.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;

import mcframe.commonCore.meta.MCMeta;
import static mcframe.commonCore.container.MCRow.Status.*;
import static mcframe.serverCore.requester.MCRequestObject.*;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;

import mcframe.serverMSBE.MSBEL5740.*;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverMSBE.MSBEL2210.Query.*;
import mcframe.serverMSBD.MSBDL0140.Chk01_DtlR;
import mcframe.serverMSBD.MSBDL0140.Chk01_HdrR;
import mcframe.serverMSBD.MSBDL0140.Chk01_IoR;
import mcframe.serverMSBD.MSBDL0140.Srch01_HdrR;
import mcframe.serverMSBD.MSBDL0140.Srch01_DtlR;
import mcframe.serverMSBD.MSBDL0140.Srch01_IoR;
import mcframe.serverMSBD.MSBDL0140.Srch01_CndR;
import mcframe.serverMSBD.MSBDL0140.Srch02_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_RcptIvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_RcptIvReg_MC extends MSBEL_RcptIvReg_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBEL_RcptIvReg> CLAZZ = MSBEL_RcptIvReg.class;
	
	// 仕入実績受払を登録するか
	protected boolean _purcActIoRegFlg = false;
	
	/**
	 * 受払実績を登録するか
	 * @return true:受払実績を登録する false:受払実績を登録しない
	 */
	protected static boolean isPurcActIoReg() {
		return object(CLAZZ)._purcActIoRegFlg;
	}
	/**
	 * 受払を登録するか判定するためのＦＬＧに値を設定する
	 * @param isReg 受払を登録するか
	 */
	protected static void setPurcActIoRegFlg(boolean isReg) {
		object(CLAZZ)._setPurcActIoRegFlg(isReg);
	}
	protected void _setPurcActIoRegFlg(boolean isReg) {
		_purcActIoRegFlg = isReg;
	}
	// 暫定買掛の登録か
	protected boolean _tempApRegFlg = false;
	
	/**
	 * 暫定買掛を登録するか
	 * @return true:暫定買掛を登録する false:暫定買掛を登録しない
	 */
	protected static boolean isTempApReg() {
		return object(CLAZZ)._tempApRegFlg;
	}
	/**
	 * 暫定買掛を登録するか判定するためのＦＬＧに値を設定する
	 * @param isReg 暫定買掛を登録するか
	 */
	protected static void setTempApRegFlg(boolean isReg) {
		object(CLAZZ)._setTempApRegFlg(isReg);
	}
	protected void _setTempApRegFlg(boolean isReg) {
		_tempApRegFlg = isReg;
	}
	
	
	protected FXUCL_MCDbcCache<MST_RCPT_IV_D_R> _rcptIvDCache = null;
	
	// ---- 受領インボイス明細キャッシュ
	protected static void initRcptIvDCc(MCList<?> list) {
		object(CLAZZ)._initRcptIvDCc(list);
	}
	protected void _initRcptIvDCc(MCList<?> list) {
		_rcptIvDCache = new FXUCL_MCDbcCache<MST_RCPT_IV_D_R>(MCQueryApiBuilder.create(MST_RCPT_IV_D_R.create("T")), list, MST_RCPT_IV_D_R.$rcpt_iv_d_no);
	}
	/**
	 *  受領インボイス明細キャッシュを取得する
	 * @param rcpt_iv_d_no  受領インボイス明細ＮＯ
	 * @return 受領インボイス明細キャッシュ
	 */
	protected MST_RCPT_IV_D_R getRcptIvDCc(String rcpt_iv_d_no) {
		return object(CLAZZ)._getRcptIvDCc(rcpt_iv_d_no);
	}
	MST_RCPT_IV_D_R _getRcptIvDCc(String rcpt_iv_d_no) {
		return _rcptIvDCache.get(rcpt_iv_d_no);
	}
	
	protected FXUCL_MCDbcCache<MST_PO_R> _poCache = null;
	
	// ---- 発注キャッシュ
	protected static void initPoCc(MCList<?> list) {
		object(CLAZZ)._initPoCc(list);
	}
	protected void _initPoCc(MCList<?> list) {
		_poCache = new FXUCL_MCDbcCache<MST_PO_R>(MCQueryApiBuilder.create(MST_PO_R.create("T")), list, MST_PO_R.$po_no);
	}
	/**
	 * 発注キャッシュを取得する
	 * @param po_no 発注ＮＯ
	 * @return 発注キャッシュ
	 */
	protected MST_PO_R getPoCc(String po_no) {
		return object(CLAZZ)._getPoCc(po_no);
	}
	MST_PO_R _getPoCc(String po_no) {
		return _poCache.get(po_no);
	}
	// ---- 発注明細キャッシュ
	protected MCList<MST_PO_D_R> _poDCache = null;
	MCIndexKey _idxPoDCacheByKey = null;
	protected static void initPoDCc(MCList<?> list) {
		object(CLAZZ)._initPoDCc(list);
	}
	protected void _initPoDCc(MCList<?> list) {
		_poDCache = MCList.create(MST_PO_D_R.class);
		_poDCache.addStringColumn("purc_dpt_cd");
		_poDCache.addStringColumn("purc_usr_cd");
		_poDCache.addStringColumn("wg_cd");
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MCQueryApiBuilder poDCache_bldr = MCQueryApiBuilder.create(POD);
		poDCache_bldr.addSelect(PO.purc_dpt_cd, PO.purc_usr_cd, PO.wg_cd);
		poDCache_bldr.addInnerJoin(PO, PO.po_no.eq(POD.po_no));
		poDCache_bldr.setWhere(POD.po_no.eq(bind("po_no")));
		dbSelect("MSBEL5240_MST_PURC_ACT_D_S01", _poDCache, poDCache_bldr, list.groupBy("po_no"));
		_idxPoDCacheByKey = _poDCache.createIndex(MST_PO_D_R.$po_d_no);
	}
	/**
	 * 発注明細キャッシュを取得する
	 * @param po_d_no 発注明細ＮＯ
	 * @return 発注明細キャッシュ
	 */
	protected MST_PO_D_R getPoDCc(String po_d_no) {
		return object(CLAZZ)._getPoDCc(po_d_no);
	}
	MST_PO_D_R _getPoDCc(String po_d_no) {
		return _poDCache.getFirst(_idxPoDCacheByKey, po_d_no);
	}
	// ---- 仕入予定キャッシュ
	protected FXUCL_MCDbcCache<MST_PURC_SCHD_R> _purcSchdCache = null;
	protected static void initPurcSchdCache(MCList<?> list) {
		object(CLAZZ)._initPurcSchdCache(list);
	}
	protected void _initPurcSchdCache(MCList<?> list) {
		_purcSchdCache = new FXUCL_MCDbcCache<MST_PURC_SCHD_R>(MCQueryApiBuilder.create(MST_PURC_SCHD_R.create("T")), list, MST_PURC_SCHD_R.$purc_schd_no);
	}
	protected static MST_PURC_SCHD_R getPurcSchdCache(String purcSchdNo) {
		return object(CLAZZ)._getPurcSchdCache(purcSchdNo);
	}
	protected MST_PURC_SCHD_R _getPurcSchdCache(String purcSchdNo) {
		return _purcSchdCache.get(purcSchdNo);
	}
	// ---- 仕入実績キャッシュ
	protected FXUCL_MCDbcCache<MST_PURC_ACT_R> _purcActCache = null;
	protected static void initPurcActCache(MCList<?> list) {
		object(CLAZZ)._initPurcActCache(list);
	}
	protected void _initPurcActCache(MCList<?> list) {
		_purcActCache = new FXUCL_MCDbcCache<MST_PURC_ACT_R>(MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), list, MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
	}
	protected static MST_PURC_ACT_R getPurcActCache(String purcActNo, MCNumber purcActSeq) {
		return object(CLAZZ)._getPurcActCache(purcActNo, purcActSeq);
	}
	protected MST_PURC_ACT_R _getPurcActCache(String purcActNo, MCNumber purcActSeq) {
		return _purcActCache.get(purcActNo, purcActSeq);
	}
	// ---- 仕入実績明細キャッシュ
	protected MCList<MST_PURC_ACT_D_R> _purcActDCache = null;
	protected MCIndexKey _idxPurcActDCacheByPurcSchdNo = null;
	protected MCIndexKey _idxPurcActDCacheByKey = null;
	protected MCIndexKey _idxPurcActDCacheByPONo = null;
	protected static void initPurcActDCache(MCList<?> list) {
		object(CLAZZ)._initPurcActDCache(list);
	}
	protected void _initPurcActDCache(MCList<?> list) {
		// 仕入実績明細・キャッシュ、仕入予定NOを元に取得する
		_purcActDCache = MCList.create(MST_PURC_ACT_D_R.class);
		_purcActDCache.addNumberColumn("purc_act_upd_cntr");
		_purcActDCache.addBooleanColumn("temp_ap_use_flg");
		_purcActDCache.addStringColumn("trd_cd");
		MST_PURC_ACT_D_R PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MCQueryApiBuilder purcActDCache_bldr = MCQueryApiBuilder.create(PURCACTD);
		MST_PURC_ACT_R PURCACT = MST_PURC_ACT_R.create("PURCACT");
		purcActDCache_bldr.removeSelect(PURCACTD.po_no);
		purcActDCache_bldr.addSelect(PURCACT.upd_cntr.as("purc_act_upd_cntr"));
		purcActDCache_bldr.addSelect(PURCACT.temp_ap_use_flg);
		purcActDCache_bldr.addSelect(PURCACT.trd_cd);
		purcActDCache_bldr.addSelect(PURCACT.po_no);
		purcActDCache_bldr.addLeftOuterJoin(PURCACT, bracket(PURCACTD.purc_act_no.eq(PURCACT.purc_act_no)
				.and(PURCACTD.purc_act_seq.eq(PURCACT.purc_act_seq))));
		purcActDCache_bldr.addWhereWithCutOffAnd(PURCACT.po_no.eq(bind("po_no")));
		purcActDCache_bldr.addWhereWithAnd(PURCACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBEL5240_MST_PURC_ACT_D_S01", _purcActDCache, purcActDCache_bldr, list.groupBy("po_no"));
		_idxPurcActDCacheByPurcSchdNo = _purcActDCache.createIndex(MST_PURC_ACT_D_R.$purc_schd_no);
		_idxPurcActDCacheByKey = _purcActDCache.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
		_idxPurcActDCacheByPONo = _purcActDCache.createIndex(MST_PURC_ACT_D_R.$po_no);
	}
	protected static MCList<MST_PURC_ACT_D_R> getPurcActDCacheByPurcSchdNo(String purcSchdNo) {
		return object(CLAZZ)._getPurcActDCacheByPurcSchdNo(purcSchdNo);
	}
	protected MCList<MST_PURC_ACT_D_R> _getPurcActDCacheByPurcSchdNo(String purcSchdNo) {
		return _purcActDCache.subList(_idxPurcActDCacheByPurcSchdNo, purcSchdNo);
	}
	protected static MST_PURC_ACT_D_R getPurcActDCacheByKey(String purcActDNo, MCNumber purcActDSeq) {
		return object(CLAZZ)._getPurcActDCacheByKey(purcActDNo, purcActDSeq);
	}
	protected MST_PURC_ACT_D_R _getPurcActDCacheByKey(String purcActDNo, MCNumber purcActDSeq) {
		return _purcActDCache.getFirst(_idxPurcActDCacheByKey, purcActDNo, purcActDSeq);
	}
	protected static MCList<MST_PURC_ACT_D_R> getPurcActDCacheByPo(String po_no) {
		return object(CLAZZ)._getPurcActDCacheByPo(po_no);
	}
	protected MCList<MST_PURC_ACT_D_R> _getPurcActDCacheByPo(String po_no) {
		return _purcActDCache.subList(_idxPurcActDCacheByPONo, po_no);
	}
	// ---- 仕入実績詳細キャッシュ
	protected MCList<MST_PURC_ACT_IO_R> _purcActIoCache = null;
	protected MCIndexKey _idxPurcActIoCacheByArrActNo = null;
	protected MCIndexKey _idxPurcActIoCacheByKey = null;
	protected MCIndexKey _idxPurcActIoCacheByDKey = null;
	protected static void initPurcActIoCache() {
		object(CLAZZ)._initPurcActIoCache();
	}
	protected void _initPurcActIoCache() {
		// 仕入実績詳細キャッシュ：仕入実績明細キャッシュをもとに取得する
		_purcActIoCache = MCList.create(MST_PURC_ACT_IO_R.class);
		_purcActIoCache.addBooleanColumn("temp_ap_flg");
		MST_PURC_ACT_IO_R PURCACTIO = MST_PURC_ACT_IO_R.create("PURCACTIO");
		MST_PURC_ACT_D_R PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MCQueryApiBuilder purcActIoCache_bldr = MCQueryApiBuilder.create(PURCACTIO);
		purcActIoCache_bldr.addSelect(PURCACTD.temp_ap_flg);
		purcActIoCache_bldr.addInnerJoin(PURCACTD,
				bracket(
					PURCACTD.purc_act_d_no.eq(PURCACTIO.purc_act_d_no)
					.and(PURCACTD.purc_act_d_seq.eq(PURCACTIO.purc_act_d_seq))
				));
		purcActIoCache_bldr.addWhereWithAnd(PURCACTIO.purc_act_d_no.eq(bind("purc_act_d_no")).and(PURCACTIO.purc_act_d_seq.eq(bind("purc_act_d_seq"))));
		dbSelect("MSBEL5240_MST_PURC_ACT_IO_S01", _purcActIoCache, purcActIoCache_bldr, _purcActDCache);
		_idxPurcActIoCacheByArrActNo = _purcActIoCache.createIndex(MST_PURC_ACT_IO_R.$arr_act_no);
		_idxPurcActIoCacheByKey  =_purcActIoCache.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_seq);
		_idxPurcActIoCacheByDKey = _purcActIoCache.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_seq);
	}
	protected static MCList<MST_PURC_ACT_IO_R> getPurcActIoCacheByArrAct(String arrActNo) {
		return object(CLAZZ)._getPurcActIoCacheByArrAct(arrActNo);
	}
	protected MCList<MST_PURC_ACT_IO_R> _getPurcActIoCacheByArrAct(String arrActNo) {
		return _purcActIoCache.subList(_idxPurcActIoCacheByArrActNo, arrActNo);
	}
	protected static MST_PURC_ACT_IO_R getPurcActIoCacheByArrActTempAp(String arrActNo) {
		return object(CLAZZ)._getPurcActIoCacheByArrActTempAp(arrActNo);
	}
	protected MST_PURC_ACT_IO_R _getPurcActIoCacheByArrActTempAp(String arrActNo) {
		MCList<MST_PURC_ACT_IO_R>ioL = _getPurcActIoCacheByArrAct(arrActNo);
		for (MST_PURC_ACT_IO_R ioR : ioL) {
			if (ioR.getBooleanNE("temp_ap_flg")) {
				return ioR;
			}
		}
		return MST_PURC_ACT_IO_R.create();
	}
	protected static MST_PURC_ACT_IO_R getPurcActIoCacheByKey(String purcActIoNo, MCNumber purcActIoSeq) {
		return object(CLAZZ)._getPurcActIoCacheByKey(purcActIoNo, purcActIoSeq);
	}
	protected MST_PURC_ACT_IO_R _getPurcActIoCacheByKey(String purcActIoNo, MCNumber purcActIoSeq) {
		return _purcActIoCache.getFirst(_idxPurcActIoCacheByKey, purcActIoNo, purcActIoSeq);
	}
	protected static MCList<MST_PURC_ACT_IO_R> getPurcActIoCacheByDKey(String purcActDNo, MCNumber purcActDSeq) {
		return object(CLAZZ)._getPurcActIoCacheByDKey(purcActDNo, purcActDSeq);
	}
	protected MCList<MST_PURC_ACT_IO_R> _getPurcActIoCacheByDKey(String purcActDNo, MCNumber purcActDSeq) {
		return _purcActIoCache.subList(_idxPurcActIoCacheByDKey, purcActDNo, purcActDSeq);
	}
	// ---- 入荷実績キャッシュ
	protected FXUCL_MCDbcCache<MST_ARR_ACT_R> _arrActCache = null;
	protected static void initArrActCache() {
		object(CLAZZ)._initArrActCache();
	}
	protected void _initArrActCache() {
		_arrActCache = new FXUCL_MCDbcCache<MST_ARR_ACT_R>(MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T")), _purcActIoCache, MST_ARR_ACT_R.$arr_act_no);
	}
	protected static MST_ARR_ACT_R getArrActCache(String arrActNo) {
		return object(CLAZZ)._getArrActCache(arrActNo);
	}
	protected MST_ARR_ACT_R _getArrActCache(String arrActNo) {
		return _arrActCache.get(arrActNo);
	}
	
	// サービス用の上り電文（チェックと共通にする）
	protected MCList<Purc_Chk03_HdrR> _purcActSvHdrCache;
	protected void initPurcActSvHdrCache() {
		object(CLAZZ)._initPurcActSvHdrCache();
	}
	void _initPurcActSvHdrCache() {
		_purcActSvHdrCache = MCList.create(Purc_Chk03_HdrR.class);
	}
	MCList<Purc_Chk03_HdrR> getPurcActSvHdrCache() {
		return object(CLAZZ)._getPurcActSvHdrCache();
	}
	MCList<Purc_Chk03_HdrR> _getPurcActSvHdrCache() {
		return _purcActSvHdrCache;
	}
	protected void addPurcActSvHdrCache(MCList<Purc_Chk03_HdrR> hdrL) {
		object(CLAZZ)._addPurcActSvHdrCache(hdrL);
	}
	void _addPurcActSvHdrCache(MCList<Purc_Chk03_HdrR> hdrL) {
		_purcActSvHdrCache.addAll(hdrL);
	}
	protected MCList<Purc_Chk03_DtlR> _purcActSvDtlCache;
	protected void initPurcActSvDtlCache() {
		object(CLAZZ)._initPurcActSvDtlCache();
	}
	void _initPurcActSvDtlCache() {
		_purcActSvDtlCache = MCList.create(Purc_Chk03_DtlR.class);
	}
	MCList<Purc_Chk03_DtlR> getPurcActSvDtlCache() {
		return object(CLAZZ)._getPurcActSvDtlCache();
	}
	MCList<Purc_Chk03_DtlR> _getPurcActSvDtlCache() {
		return _purcActSvDtlCache;
	}
	protected void addPurcActSvDtlCache(MCList<Purc_Chk03_DtlR> dtlL) {
		object(CLAZZ)._addPurcActSvDtlCache(dtlL);
	}
	void _addPurcActSvDtlCache(MCList<Purc_Chk03_DtlR> dtlL) {
		_purcActSvDtlCache.addAll(dtlL);
	}
	protected MCList<Purc_Chk03_IoR> _purcActSvIoCache;
	protected void initPurcActSvIoCache() {
		object(CLAZZ)._initPurcActSvIoCache();
	}
	void _initPurcActSvIoCache() {
		_purcActSvIoCache = MCList.create(Purc_Chk03_IoR.class);
	}
	MCList<Purc_Chk03_IoR> getPurcActSvIoCache() {
		return object(CLAZZ)._getPurcActSvIoCache();
	}
	MCList<Purc_Chk03_IoR> _getPurcActSvIoCache() {
		return _purcActSvIoCache;
	}
	protected void addPurcActSvIoCache(MCList<Purc_Chk03_IoR> ioL) {
		object(CLAZZ)._addPurcActSvIoCache(ioL);
	}
	void _addPurcActSvIoCache(MCList<Purc_Chk03_IoR> ioL) {
		_purcActSvIoCache.addAll(ioL);
	}
	
	/**
	 * RcptIv_Chk01オペレーション.<p>
	 *
	 * 受領インボイス登録・訂正・取消前のチェックを行う。（共通処理）<br>
	 */
	public class RcptIv_Chk01 extends MSBEL_RcptIvReg_MC_A.RcptIv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 受領インボイスサービスのチェック実行
				callRcptIvChk();
			}
			setDown();
		}
		@Override
		protected void init() {
			super.init();
			// キャッシュ取得
			initPoCc(up1());
			initPoDCc(up1());
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msg = super.doServerCheckBase();
			// キャッシュ
			createCache();
			// 補完用のトラン
			MST_RCPT_IV_R rcptIv = MST_RCPT_IV_R.create();
			
			MCList<Chk01_DtlR> pd = MCList.create(Chk01_DtlR.class);
			up1().forEach(r -> {
				pd.add(r.pd());
			});
			// 入荷進捗
			msg.addAll(lockArrPrAndChkUpdCntr(up0().ph(), pd));
			// 受領インボイス
			msg.addAll(lockRcptIvAndChkUpdCntr(rcptIv));
			// 仕入実績
			msg.addAll(lockPurcActAndChkUpdCntr());
			// 上り電文補完
			cmplUpParamInTranData(rcptIv);
			
			return msg;
		}
		protected void createCache() {
			// 格付ＣＤ
			MCList<MAM_STK_GD_R> list = MCList.create(MAM_STK_GD_R.class);
			up1().forEach(r -> {
				MAM_STK_GD_R row = MAM_STK_GD_R.create();
				row.gd_cd(r.gd_cd());
				list.add(row);
			});
			initStkGdCache(list);
			// 仕入実績明細
			initPurcActDCache(up1());
			// 仕入実績
			initPurcActCache(up1());
			// 仕入実績詳細
			initPurcActIoCache();
			// 仕入予定
			initPurcSchdCache(up1());
			// 入荷実績
			initArrActCache();
		}
		/**
		 * 受領インボイスヘッダのロックと、更新カウンタチェックを行います。
		 * @return メッセージリスト
		 */
		protected MCMessageList lockRcptIvAndChkUpdCntr(MST_RCPT_IV_R rcptIv) {
			
			// 受領インボイス未登録の場合はチェック対象外
			if (isNull(up0().rcpt_iv_mng_no())) {
				return null;
			}
			
			MCMessageList msg = new MCMessageList();
			
			dbSelectKeyForUpdateNoWait("MSBEL2210_MST_RCPT_IV_S01", rcptIv,
					MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T")), up0());

			if (!isNull(rcptIv.rcpt_iv_mng_no())) {
				msg.addAll(checkUpdCntrNE(up0(), Iv_Chk01_HdrR.$rcpt_iv_upd_cntr, rcptIv));
			}
			
			return msg;
		}
		/**
		 *仕入実績ヘッダのロックと、更新カウンタチェックを行います。
		 * @return メッセージリスト
		 */
		protected MCMessageList lockPurcActAndChkUpdCntr() {
			MCMessageList msg = new MCMessageList();
			
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MCIndexKey idxKey = up1().createIndex(Iv_Chk01_DtlR.$purc_act_d_no, Iv_Chk01_DtlR.$purc_act_d_seq);
			
			for (Iv_Chk01_DtlR r : up1().subList(r -> isNull(r.purc_act_d_no()))) {
				purcActDL.addAll(getPurcActDCacheByPurcSchdNo(r.purc_schd_no()));
			}
			
			MCList<Iv_Chk01_DtlR> tgtDL = up1().clone();
			// 仕入予定ＮＯに紐づく暫定買掛がある場合はロック対象に含める
			for (MST_PURC_ACT_D_R actDR : purcActDL) {
				// 暫定買掛以外はロックしない
				if (!actDR.temp_ap_flg()) {
					continue;
				}
				Iv_Chk01_DtlR up1R = up1().getFirst(idxKey, actDR.purc_act_d_no(), actDR.purc_act_d_seq());
				// 上り電文に存在しない場合、ロック対象に追加する
				if (isNull(up1R) || up1R.isEmpty()) {
					Iv_Chk01_DtlR tmpDR = tgtDL.add();
					tmpDR.purc_act_no(actDR.purc_act_no());
					tmpDR.purc_act_seq(actDR.purc_act_seq());
					tmpDR.purc_act_upd_cntr(actDR.getNumberNE("purc_act_upd_cntr"));
				}
			}
			
			MCList<MST_PURC_ACT_R> purcActHL = MCList.create(MST_PURC_ACT_R.class);
			// 行ロック
			dbSelectKeyForUpdateNoWait("MSBEL2210_MST_PURC_ACT_S04", purcActHL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), tgtDL);
			
			MCIndexKey lockHIdx = purcActHL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
			
			// 更新カウンタチェック
			tgtDL.forEach(dr -> {
				if (!dr.err_flg() && !isNull(dr.purc_act_no())) {
					MST_PURC_ACT_R pa =purcActHL.getFirst(lockHIdx, dr.purc_act_no(), dr.purc_act_seq());
					msg.addAll(checkUpdCntrNE(dr, Iv_Chk01_DtlR.$purc_act_upd_cntr, pa));
				}
			});
			
			return msg;
		}
		protected void cmplUpParamInTranData(MST_RCPT_IV_R rcptIv) {
			// ヘッダ
			up0().bef_fix_flg(rcptIv.purc_cmpl_flg());
			// 明細
			for (Iv_Chk01_DtlR up1R : up1()) {
				cmplUpInActD(up1R);
				cmplProcUpriAmt(up0(), up1R);
			}
			MCIndexKey up1Key = up1().createIndex(Iv_Chk01_DtlR.$peg_no);
			// 詳細
			for (Chk01_IoR up2R : up2()) {
				Iv_Chk01_DtlR up1R = up1().getFirst(up1Key, up2R.dtl_peg_no());
				cmplUpInActIo(up1R, up2R);
			}
		}
		protected void cmplUpInActD (Iv_Chk01_DtlR up1R) {
			if (!isNull(up1R.purc_act_d_no())) {
				MST_PURC_ACT_D_R purcActDR = getPurcActDCacheByKey(up1R.purc_act_d_no(), up1R.purc_act_d_seq());
				if (!isNull(purcActDR) && !purcActDR.isEmpty()) {
					up1R.temp_ap_flg(purcActDR.temp_ap_flg());
					up1R.temp_ap_use_flg(purcActDR.getBoolean("temp_ap_use_flg"));
				}
				return;
			}
			MCList<MST_PURC_ACT_D_R> actDCacheL = getPurcActDCacheByPurcSchdNo(up1R.purc_schd_no());
			if (isNull(actDCacheL) || actDCacheL.isEmpty()) {
				return;
			}
			MCList<MST_PURC_ACT_D_R> tmpActDL = actDCacheL.subList(r -> r.temp_ap_flg());
			if (!isNull(tmpActDL) && !tmpActDL.isEmpty()) {
				MST_PURC_ACT_D_R tmpActDR = tmpActDL.get(0);
				up1R.temp_ap_flg(tmpActDR.temp_ap_flg());
				up1R.temp_ap_use_flg(tmpActDR.getBoolean("temp_ap_use_flg"));
				up1R.purc_act_d_no(tmpActDR.purc_act_d_no());
				up1R.purc_act_d_seq(tmpActDR.purc_act_d_seq());
				up1R.purc_act_upd_cntr(tmpActDR.getNumberNE("purc_act_upd_cntr"));
				up1R.purc_act_no(tmpActDR.purc_act_no());
				up1R.purc_act_seq(tmpActDR.purc_act_seq());
			}
		}
		protected void cmplUpInActIo (Iv_Chk01_DtlR up1R, Chk01_IoR up2R) {
			if (!up1R.temp_ap_flg() || isNull(up2R.arr_act_no())) {
				return;
			}
			MST_PURC_ACT_IO_R ioR = getPurcActIoCacheByArrActTempAp(up2R.arr_act_no());
			if (!isNull(ioR) && !ioR.isEmpty()) {
				up2R.purc_act_io_no(ioR.purc_act_io_no());
				up2R.purc_act_io_seq(ioR.purc_act_io_seq());
			}
		}
		
		protected void cmplProcUpriAmt(Iv_Chk01_HdrR up0, Iv_Chk01_DtlR up1R) {
			if (up1R.outsrc_flg()) {
				if (isNull(up1R.trd_cur_proc_upri())) {
					up1R.trd_cur_proc_upri(MCNumber.ZERO);
					up1R.trd_cur_proc_amt(MCNumber.ZERO);
					up1R.base_cur_proc_upri(MCNumber.ZERO);
					up1R.base_cur_proc_amt(MCNumber.ZERO);
					if (!isNull(up0.ptax_xrate())) {
						up1R.ptax_cur_proc_upri(MCNumber.ZERO);
						up1R.ptax_cur_proc_amt(MCNumber.ZERO);
					}
				}
				if (isNull(up1R.trd_cur_tax_amt())) {
					up1R.trd_cur_tax_amt(MCNumber.ZERO);
					up1R.base_cur_tax_amt(MCNumber.ZERO);
					if (!isNull(up0.ptax_xrate())) {
						up1R.ptax_cur_tax_amt(MCNumber.ZERO);
					}
				}
			}
		}
		@Override
		protected MCMessageList doServerCheck(MCContainer block) {
			if (block == up2()) {
				return null;
			}
			return super.doServerCheck(block);
		}
		
		protected void callRcptIvChk() {
			callRcptIvChkCmn(up0(), up1(), up2());
		}
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入実績登録前のチェックを行う。<br>
	 */
	public class Chk01 extends MSBEL_RcptIvReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void init() {
			super.init();
			// キャッシュ取得
			initPoCc(up1());
			initPoDCc(up1());
			initPurcActSvHdrCache();
			initPurcActSvDtlCache();
			initPurcActSvIoCache();
			initRcptIvDCc(up1());
		}
		@Override
		protected void cmplUpParamInTranData() {
			// ヘッダ・明細の持ち方が違うので、親クラスの処理は行わない。
			MCIndexKey ioIdxKey = up2().createIndex(Chk01_IoR.$dtl_peg_no);
			for (Chk01_DtlR up1R : up1()) {
				if (!up1R.temp_ap_flg()) {
					MST_RCPT_IV_D_R ivDR = getRcptIvDCc(up1R.rcpt_iv_d_no());
					up1R.purc_dpt_cd(ivDR.purc_dpt_cd());
					up1R.purc_usr_cd(ivDR.purc_usr_cd());
					up1R.wg_cd(ivDR.wg_cd());
				}
			}
			// 計画外仕入を格納するリスト
			MCList<Chk01_DtlR> addL = MCList.create(Chk01_DtlR.class);
			for (MCList<Chk01_DtlR> gpL : up1().groupList(Chk01_DtlR.$po_no, Chk01_DtlR.$temp_ap_flg)) {
				Chk01_DtlR gpR = gpL.get(0);
				if (!isNull(gpR.po_no())) {
					// ヘッダ項目の書き換え
					MST_PO_R poR = getPoCc(gpR.po_no());
					gpL.setStringNE(Chk01_DtlR.$trd_cd, poR.trd_cd());
					gpL.setStringNE(Chk01_DtlR.$trd_ptn_typ, poR.trd_ptn_typ());
					if (gpR.temp_ap_flg()) {
						gpL.setStringNE(Chk01_DtlR.$purc_dpt_cd, poR.purc_dpt_cd());
						gpL.setStringNE(Chk01_DtlR.$purc_usr_cd, poR.purc_usr_cd());
						gpL.setStringNE(Chk01_DtlR.$rcpt_iv_d_no, null);
					}
					for (Chk01_DtlR r : gpL) {
						MST_PO_D_R poDR = getPoDCc(r.po_d_no());
						
						r.mfg_loc_cd(poDR.mfg_loc_cd());
						r.bom_ptn(poDR.bom_ptn());
						r.rqst_avl_rqst_dt(poDR.rqst_avl_rqst_dt());
						
						r.itm_cd(poDR.itm_cd());
						r.itm_sub1(poDR.itm_sub1());
						r.itm_sub2(poDR.itm_sub2());
						r.itm_sub3(poDR.itm_sub3());
						r.maker_cd(poDR.maker_cd());
						r.sno1(poDR.sno1());
						r.sno2(poDR.sno2());
						r.sno3(poDR.sno3());
						r.sno4(poDR.sno4());
						r.ver_no(poDR.ver_no());
						r.drct_dlv_typ(poDR.drct_dlv_typ());
						r.scst_cd(poDR.dlv_cd());
						r.sundry_itm_flg(poDR.sundry_itm_flg());
						if (!poDR.sundry_itm_flg()) {
							r.itm_nm(null);
							r.iv_itm_nm(null);
						}
						else {
							r.itm_nm(poDR.itm_nm());
							r.iv_itm_nm(poDR.iv_itm_nm());
						}
						if (gpR.temp_ap_flg()) {
							r.ap_dpt_cd(poDR.ap_dpt_cd());
						}
						
						r.sppl_itm_cd(poDR.sppl_itm_cd());
						r.sppl_itm_nm(poDR.sppl_itm_nm());
						
						// 明細上り電文に紐付く、詳細上り電文の項目も上書きする
						MCList<Chk01_IoR> ioL = up2().subList(ioIdxKey, r.peg_no());
						for (Chk01_IoR ioR : ioL) {
							ioR.itm_cd(poDR.itm_cd());
							ioR.itm_sub1(poDR.itm_sub1());
							ioR.itm_sub2(poDR.itm_sub2());
							ioR.itm_sub3(poDR.itm_sub3());
							ioR.ver_no(poDR.ver_no());
						}
					}
				}
				else {
					addL.addAll(gpL);
				}
			}
			if (!isNull(addL) && !addL.isEmpty()) {
				// 計画外仕入
				MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
				dbSelectKey("MSBEL2210_MAM_ITM_S01", itmL, MCQueryApiBuilder.create(MAM_ITM_R.create("T")), addL);
				MCIndexKey idx = itmL.createIndex(MAM_ITM_R.$itm_cd, 
						MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
				
				for (Chk01_DtlR dtlRow : addL) {
					
					// 参照登録による計画外仕入の場合、参照元の入荷不要ＦＬＧが最新でない可能性があるため、
					// チェック処理で品目マスタを取り直し、最新の入荷不要ＦＬＧにより同時計上オン・オフを決定する。
					MAM_ITM_R itmR = itmL.getFirst(idx, dtlRow.itm_cd(), 
							dtlRow.itm_sub1(), dtlRow.itm_sub2(), dtlRow.itm_sub3());
					if (itmR.arr_skip_flg()) {
						dtlRow.sync_flg(false);
					}
					else {
						dtlRow.sync_flg(true);
					}
					
					if (isNull(dtlRow.sno1())) {
						dtlRow.sno1(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno2())) {
						dtlRow.sno2(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno3())) {
						dtlRow.sno3(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlRow.sno4())) {
						dtlRow.sno4(MAC_STR.NULL_VAL.value());
					}
				}
			}
			if (isNull(up0().pay_basis_dt())) {
				up0().pay_basis_dt(getToday());
			}
		}
		@Override
		protected MCMessageList checkDAC() {
			// DACチェックは受領インボイス登録サービスで行うので、画面側では空振りさせる。
			return new MCMessageList();
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 購買部門
			ListLogicBind purcDptBind = getListLogicBind(up1(), Chk01_DtlR.$purc_dpt_cd);
			purcDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 仕入実績訂正前のチェックを行う。<br>
	 */
	public class Chk02 extends MSBEL_RcptIvReg_MC_A.Chk02 {
		MCList<MST_PURC_ACT_R> _purcActHL = MCList.create(MST_PURC_ACT_R.class);
		MCList<Chk01_DtlR> _upDL = MCList.create(Chk01_DtlR.class);
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void init() {
			super.init();
			initPurcActSvHdrCache();
			initPurcActSvDtlCache();
			initPurcActSvIoCache();
			initRcptIvDCc(up1());
			
			// 上り電文を保持しておく
			_upDL.addAll(up1());
		}
		@Override
		protected MCMessageList lockPurcActAndChkUpdCntr(MST_PURC_ACT_R prcActH,
				MCList<MST_PURC_ACT_D_R> prcActD, MCList<MST_PURC_ACT_IO_R> prcActIo) {

			MCMessageList msgL = new MCMessageList();

			_purcActHL = MCList.create(MST_PURC_ACT_R.class);
			
			// 行ロック
			dbSelectKeyForUpdateNoWait("MSBEL2210_MST_PURC_ACT_S01", _purcActHL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), up1());

			MCIndexKey idx = _purcActHL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
			
			// 更新カウンタチェック  発注ありの場合チェックしない
			for (Chk01_DtlR dtlR : up1()) {
				if (isNull(dtlR.purc_act_d_no())) {
					continue;
				}
				MST_PURC_ACT_R paR = _purcActHL.getFirst(idx, dtlR.toArray(idx.getKeys()));
				if (isNull(prcActH) || prcActH.isEmpty()) {
					MCRow.copyall(prcActH, paR);
				}
				if (isNull(paR.po_no())) {
					msgL.addAll(checkUpdCntrNE(dtlR, Chk01_HdrR.$purc_act_upd_cntr, paR));
				}
			}
			
			// 更新カウンタチェック正常時、仕入実績明細・受払を取得し、電文に補完する
			MST_PURC_ACT_D_R prcActD_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder prcActD_bldr = MCQueryApiBuilder.create(prcActD_t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			MST_PO_D_R t4 = MST_PO_D_R.create("T4");
			prcActD_bldr.addSelect(t2.arr_schd_no, prcActD_t.purc_id_typ);
			prcActD_bldr.addLeftOuterJoin(t2, bracket( prcActD_t.purc_schd_no.eq(t2.purc_schd_no)));
			prcActD_bldr.addLeftOuterJoin(t3, bracket( t2.arr_pr_no.eq(t3.arr_pr_no)));
			prcActD_bldr.addLeftOuterJoin(t4, bracket( t3.po_d_no.eq(t4.po_d_no)));
			prcActD_bldr.addWhereWithAnd(prcActD_t.purc_act_no.eq(bind("purc_act_no"))
					.and(prcActD_t.purc_act_seq.eq(bind("purc_act_seq"))));
			dbSelect("MSBEL2210_MST_PURC_ACT_D_S01", prcActD, prcActD_bldr, up1());

			MST_PURC_ACT_IO_R prcActIo_t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder prcActIo_bldr = MCQueryApiBuilder.create(prcActIo_t);
			MST_PURC_ACT_D_R prcActIo_t2 = MST_PURC_ACT_D_R.create("T2");
			prcActIo_bldr.addInnerJoin(prcActIo_t2,
					bracket(prcActIo_t.purc_act_d_no.eq(prcActIo_t2.purc_act_d_no)
							.and(prcActIo_t.purc_act_d_seq.eq(prcActIo_t2.purc_act_d_seq))));
			prcActIo_bldr.addWhereWithAnd(prcActIo_t2.purc_act_no.eq(bind("purc_act_no"))
					.and(prcActIo_t2.purc_act_seq.eq(bind("purc_act_seq"))));
			dbSelect("MSBEL2210_MST_PURC_ACT_IO_S01", prcActIo, prcActIo_bldr, up1());
			
			return msgL;
		}
		@Override
		protected void cmplUpParamInTranData(MST_PURC_ACT_R paH, MCList<MST_PURC_ACT_D_R> paD,
				MCList<MST_PURC_ACT_IO_R> paIo) {
			super.cmplUpParamInTranData(paH, paD, paIo);
			
			MCIndexKey upIDdx = _upDL.createIndex(Chk01_DtlR.$peg_no);
			// 明細の補完
			for (Chk01_DtlR dtlRow : up1()) {
				MST_RCPT_IV_D_R ivDR = getRcptIvDCc(dtlRow.rcpt_iv_d_no());
				if (!isNull(ivDR) && !ivDR.isEmpty()) {
					dtlRow.purc_dpt_cd(ivDR.purc_dpt_cd());
					dtlRow.purc_usr_cd(ivDR.purc_usr_cd());
					dtlRow.wg_cd(ivDR.wg_cd());
				}
				MST_PURC_ACT_R oldHdrR = getPurcActCache(dtlRow.purc_act_no(), dtlRow.purc_act_seq());
				dtlRow.old_purc_dpt_cd(oldHdrR.purc_dpt_cd());
				if (MAC_DATA_CRUD_TYP.isDEL(dtlRow.data_crud_typ())) {
					dtlRow.purc_dpt_cd(oldHdrR.purc_dpt_cd());
					dtlRow.purc_usr_cd(oldHdrR.purc_usr_cd());
				}
				else {
					dtlRow.can_ac_dt(oldHdrR.ac_dt());
				}
				// 仕入実績明細から補完している場合は補完不要
				if (!isNull(dtlRow.purc_act_d_no())) {
					continue;
				}
				Chk01_DtlR upDR = _upDL.getFirst(upIDdx, dtlRow.peg_no());
				dtlRow.trd_cd(upDR.trd_cd());
				dtlRow.purc_id_typ(upDR.purc_id_typ());
				dtlRow.purc_dpt_cd(upDR.purc_dpt_cd());
				dtlRow.purc_usr_cd(upDR.purc_usr_cd());
				dtlRow.ac_rsn_cd(upDR.ac_rsn_cd());
				dtlRow.gd_cd(upDR.gd_cd());
				dtlRow.dlv_loc_cd(upDR.dlv_loc_cd());
			}
			// ヘッダ行補完（up0に発注NOなしのため、空振りするので、ここで補完する）
			MCList<Chk01_DtlR> dtlByPoL = up1().subList(r -> !isNull(r.po_no()));
			if (!isNull(dtlByPoL) && !dtlByPoL.isEmpty()) {
				Chk01_DtlR dtlByPoR = dtlByPoL.get(0);
				
				MST_PO_R poH = getPoCc(dtlByPoR.po_no());
				
				up0().sppl_cd(poH.sppl_cd());
				// 買掛先、支払先予定管理先、支払先、与信管理先は、仕入実績ヘッダから取得
				up0().asppl_cd(paH.asppl_cd());
				up0().bsppl_cd(paH.bsppl_cd());
				up0().psppl_cd(paH.psppl_cd());
				up0().cred_cd(paH.cred_cd());
				up0().old_purc_dpt_cd(paH.purc_dpt_cd());
			}
			up0().trd_cd(up1().getString(0, Chk01_DtlR.$trd_cd)); 
			up0().purc_usr_cd(up1().getString(0, Chk01_DtlR.$purc_usr_cd));
			up0().purc_dpt_cd(up1().getString(0, Chk01_DtlR.$purc_dpt_cd));
			if (isNull(up0().pay_basis_dt())) {
				up0().pay_basis_dt(getToday());
			}
		}
		@Override
		protected MCMessageList checkDAC() {
			// DACチェックは受領インボイス登録サービスで行うので、画面側では空振りさせる。
			return new MCMessageList();
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 購買部門
			ListLogicBind purcDptBind = getListLogicBind(up1(), Chk01_DtlR.$purc_dpt_cd);
			purcDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 仕入実績取消前のチェックを行う。<br>
	 */
	public class Chk03 extends MSBEL_RcptIvReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void init() {
			super.init();
			initPurcActSvHdrCache();
			initPurcActSvDtlCache();
			initPurcActSvIoCache();
		}
		@Override
		protected void callPurcChk03() {
			super.callPurcChk03();
		}
		@Override
		protected MCMessageList lockPurcActAndChkUpdCntr(MST_PURC_ACT_R lockedR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.purc_act_no()));
			
			// ロック対象がない場合は処理不要
			if (isNull(bindL) || bindL.isEmpty()) {
				return msgL;
			} 
			
			MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
			
			dbSelectKeyForUpdateNoWait("MSBEL2210_MST_PURC_ACT_S02", purcActL,
					MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), bindL);

			MCIndexKey idx = purcActL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);

			for (Chk01_DtlR dtlR : bindL) {
				if (isNull(dtlR.purc_act_d_no())) {
					continue;
				}
				MST_PURC_ACT_R paR = purcActL.getFirst(idx, dtlR.toArray(idx.getKeys()));
				if (isNull(paR.po_no())) {
					msgL.addAll(checkUpdCntrNE(dtlR, Chk01_HdrR.$purc_act_upd_cntr, paR));
				}
			}
			
			return msgL;
		}
		@Override
		protected void cmplUpParamInTranData() {
			super.cmplUpParamInTranData();
			if (isNull(up0().can_ac_dt())) {
				up0().can_ac_dt(up0().ac_dt());
			}
			if (isNull(up0().pay_basis_dt())) {
				up0().pay_basis_dt(getToday());
			}
		}
		@Override
		protected void cmplUpInPurcAct() {
			MCList<MST_PURC_ACT_R> retL = MCList.create(MST_PURC_ACT_R.class);
			
			MST_PURC_ACT_R purcH = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcH_bldr = MCQueryApiBuilder.create(purcH);
			MCTempView S1V1 = createTempView("V1");
			MST_PURC_ACT_R S2 = MST_PURC_ACT_R.create("S2");

			purcH_bldr.addWhereWithAnd(
							exists(subQuery()
									.select(value(1)).from(subQuery()
													.select(S2.purc_act_no,
															max(S2.purc_act_seq).as("max_seq"))
													.from(S2)
													.where(S2.purc_act_no.eq(bind("purc_act_no")))
													.groupBy(S2.purc_act_no).view(S1V1))
									.where(purcH.purc_act_no.eq(S1V1.pr(S2.purc_act_no))
											.and(purcH.purc_act_seq.eq(S1V1.pr("max_seq"))))));
			dbSelect("MSBEL2210_MST_PURC_ACT_S03", retL, purcH_bldr, up1());
			
			if (retL.size() > 0) {
				copy(up0(), retL.get(0), createMap_Chk01_HdrR_MST_PURC_ACT_R());
				MCIndexKey idx = retL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
				for (Chk01_DtlR r : up1()) {
					MST_PURC_ACT_R retR = retL.getFirst(idx, r.toArray(idx.getKeys()));
					copy(r, retR, createMap_Chk01_DtlR_MST_PURC_ACT_R());
				}
			}
		}
		@Override
		protected MCMessageList checkDAC() {
			// DACチェックは受領インボイス登録サービスで行うので、画面側では空振りさせる。
			return new MCMessageList();
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			
			// 購買部門
			ListLogicBind purcDptBind = getListLogicBind(up1(), Chk01_DtlR.$purc_dpt_cd);
			purcDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 仕入実績を登録する。<br>
	 */
	public class Ins01 extends MSBEL_RcptIvReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void callThisChk01() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.Chk01 chk01Ope = MSBEL_RcptIvReg.crtChk01();
			MCRow.copyall(chk01Ope.up0(), up0());
			chk01Ope.up1().setAll(up1());
			chk01Ope.up2().setAll(up2());
			chk01Ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), chk01Ope.down0());
			up1().setAll(chk01Ope.down1());
			up2().setAll(chk01Ope.down2());
		}
		@Override
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Ins01 ope,
				Chk01_HdrR up0, MCList<Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
			// チェック結果のキャッシュから電文を設定する
			// 暫定買掛を登録する場合は、金額計算をサーバ処理で行う
			ope.up0().amt_calc_flg(isTempApReg());
			ope.up0().io_make_flg(isPurcActIoReg());
			ope.up0().arr_act_flg(true);
			ope.up0().purc_form_flg(!isTempApReg());
			ope.up0().rcpt_iv_form_flg(true);
			addAll(ope.up1(), getPurcActSvHdrCache(), createMap_Purc_Ins01_HdrR_Purc_Chk03_HdrR());
			addAll(ope.up2(), getPurcActSvDtlCache(), createMap_Purc_Ins01_DtlR_Purc_Chk03_DtlR());
			addAll(ope.up3(), getPurcActSvIoCache(), createMap_Purc_Ins01_IoR_Purc_Chk03_IoR());
		}
		@Override
		protected void setDownPurcActRegSv(MSBDL_PurcActRegService.Purc_Ins01 ope) {
			setDownPurcActRegSvCmn(ope.down0(), ope.down1(), ope.down2(), up0(), up1(), up2());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入実績を訂正する。<br>
	 */
	public class Upd01 extends MSBEL_RcptIvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void replaceParam() {
			super.replaceParam();
			MCIndexKey idxUp2 = up2().createIndex(Chk01_IoR.$dtl_peg_no);
			for (Chk01_DtlR r : up1()) {
				MCList<Chk01_IoR> subL = up2().subList(idxUp2, r.peg_no());
				if (isNull(subL)) {
					continue;
				}
				if (isYetArr(r)) {
					// 未着の仕入登録時は在庫情報を補完
					if (isNull(subL.get(0).arr_act_no())) {
						r.gd_cd(r.tmp_gd_cd());
						r.quality_typ(r.tmp_quality_typ());
						for (Chk01_IoR dtl2R : subL) {
							dtl2R.quality_typ(dtl2R.tmp_quality_typ());
							dtl2R.stk_insp_typ(dtl2R.tmp_stk_insp_typ());
							dtl2R.stk_id_typ(dtl2R.tmp_stk_id_typ());
							dtl2R.gd_cd(dtl2R.from_gd_cd());
						}
					}
				}
				else {
					if (isUnplanned(r)) {
						// 計画外の場合
						String qualityTyp = MAC_QUALITY_TYP.GOOD.value();
						r.quality_typ(qualityTyp);
						subL.setStringNE(Chk01_IoR.$quality_typ, r.quality_typ());
						subL.setStringNE(Chk01_IoR.$stk_insp_typ, MSC_STK_INSP_TYP.FIN.value());
						subL.setStringNE(Chk01_IoR.$stk_id_typ, MSC_STK_ID_TYP.COSTK.value());
					}
					if (isNull(r.purc_act_d_no()) && !isNull(r.tmp_quality_typ())) {
						// 同時計上しない予定だったが、同時計上で仕入する場合
						r.quality_typ(r.tmp_quality_typ());
						for (Chk01_IoR ioR : subL) {
							ioR.quality_typ(ioR.tmp_quality_typ());
							ioR.stk_id_typ(ioR.tmp_stk_id_typ());
							ioR.stk_insp_typ(ioR.tmp_stk_insp_typ());
						}
					}
				}
			}
		}
		protected boolean isYetArr(Chk01_DtlR dtlR) {
			return !dtlR.sync_flg() && !isNull(dtlR.purc_schd_no()) && !isNull(dtlR.arr_schd_no());
		}
		protected boolean isUnplanned(Chk01_DtlR dtlR) {
			return isNull(dtlR.purc_schd_no()) || isNull(dtlR.arr_schd_no());
		}
		@Override
		protected void callThisChk02() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.Chk02 ope = MSBEL_RcptIvReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}
		@Override
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Upd01 ope,
				Chk01_HdrR up0, MCList<Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
			// チェック結果のキャッシュから電文を設定する
			ope.up0().io_make_flg(isPurcActIoReg());
			ope.up0().arr_act_flg(true);
			ope.up0().purc_form_flg(true);
			ope.up0().rcpt_iv_form_flg(true);
			addAll(ope.up1(), getPurcActSvHdrCache(), createMap_Purc_Ins01_HdrR_Purc_Chk03_HdrR());
			addAll(ope.up2(), getPurcActSvDtlCache(), createMap_Purc_Ins01_DtlR_Purc_Chk03_DtlR());
			addAll(ope.up3(), getPurcActSvIoCache(), createMap_Purc_Ins01_IoR_Purc_Chk03_IoR());
		}
		@Override
		protected void setDownPurcActRegSv(MSBDL_PurcActRegService.Purc_Upd01 ope) {
			setDownPurcActRegSvCmn(ope.down0(), ope.down1(), ope.down2(), up0(), up1(), up2());
		}
	}	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕入実績を取り消す。<br>
	 */
	public class Del01 extends MSBEL_RcptIvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void callThisChk03() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.Chk03 ope = MSBEL_RcptIvReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			// チェック結果を取得
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}
		@Override
		protected void setUpPurcActRegSv(MSBDL_PurcActRegService.Purc_Del01 ope,
				Chk01_HdrR up0, MCList<Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
			// チェック結果のキャッシュから電文を設定する
			ope.up0().io_make_flg(isPurcActIoReg());
			ope.up0().arr_act_flg(true);
			addAll(ope.up1(), getPurcActSvHdrCache(), createMap_Purc_Ins01_HdrR_Purc_Chk03_HdrR());
			addAll(ope.up2(), getPurcActSvDtlCache(), createMap_Purc_Ins01_DtlR_Purc_Chk03_DtlR());
			addAll(ope.up3(), getPurcActSvIoCache(), createMap_Purc_Ins01_IoR_Purc_Chk03_IoR());
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 仕入予定、入荷予定、入荷実績情報を検索する。<br>
	 */
	public class Srch01 extends MSBEL_RcptIvReg_MC_A.Srch01 {
		protected MCIndexKey _up1ArrActIdx;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			_up1ArrActIdx = up1().createIndex(Srch01_Cnd2R.$arr_act_no);
		}
		@Override
		protected void doSearchMain() {
			if (!up0().io_srch_only_flg()) {
				editUp();
				super.doSearchMain();
			}
			else {
				MCList<Srch01_IoR> srchIoL = MCList.create(Srch01_IoR.class);
				int cnt = srchIo(srchIoL);
				if (isSame(cnt, 0)) {
					return;
				}
				// 数量計算
				calcQty(srchIoL);
				
				down2().setAll(srchIoL);
			}
		}
		protected void editUp() {
			java.util.function.Function<String, String> toArryVal = col -> {
				return MCStringUtil.arrayValueJoin(
					up1()
						.subList(r -> !isNull(r.getString(col)))
						.getString(col)
						.toArray(new String[0])
				);
			};
			up0().purc_schd_no(toArryVal.apply(Srch01_Cnd2R.$purc_schd_no));
			up0().arr_act_no(toArryVal.apply(Srch01_Cnd2R.$arr_act_no));
			up0().addDateColumn("today", getToday());
		}
		@Override
		protected int srchHdr(Srch01_HdrR srchHdr) {
			MCList<Srch01_HdrR> hdrL = MCList.create(Srch01_HdrR.class);
			// 計算に必要な情報を発注ヘッダから参照する。
			// 値の設定自体はクライアント側で行うので、発注・取引先だけ参照
			int cnt = executeQuery(hdrL, MSBEL2210_MST_PO_S01(), up0());
			if (cnt > 0) {
				srchHdr.setValuesByName(hdrL.get(0));
				cnt = 1;
			}
			return cnt;
		}
		@Override
		protected int srchIo(MCList<Srch01_IoR> srchIoL) {
			int cnt = super.srchIo(srchIoL);
			srchIoSub(srchIoL);
			return cnt;
		}
		protected void srchIoSub(MCList<Srch01_IoR> srchIoL) {
			MCList<Srch01_IoR> tgtL = srchIoL.subList(r -> 
				// 暫定買掛の仕入分（在庫から補完できないので、入荷実績から補完する）
				!isNull(r.arr_act_no())
				 && isNull(r.getStringNE("fix_no"))
				 && MCBooleanUtil.dbStringToBoolean(r.getStringNE(Srch01_DtlR.$temp_ap_flg))
			);
			setValuesDbc(MSBEL2210_IoR_J01(), up0(), tgtL);
			
			if (up0().io_srch_only_flg()) {
				filterIo4RcptIv(srchIoL);
				setQtyIo4RcptIv(srchIoL);
			}
			else {
				filterIo4Schd(srchIoL);
				setQtyIo4Schd(srchIoL.subList(r -> !isNull(r.arr_act_no())));
			}
		}
		protected void filterIo4Schd(MCList<Srch01_IoR> srchIoL) {
			MCList<Srch01_IoR> removeL = MCList.create(Srch01_IoR.class);
			if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ())) {
				// 同一仕入予定内に入荷分が存在する場合、未入荷分は表示しない
				for (MCList<Srch01_IoR> gl : srchIoL.groupList(Srch01_IoR.$purc_schd_no)) {
					MCList<Srch01_IoR> actL = gl.subList(r -> !isNull(r.arr_act_no()));
					if (!actL.isEmpty()) {
						Srch01_IoR schdR = gl.getFirst(Srch01_IoR.$arr_act_no, null);
						if (!isNull(schdR)) {
							// 詳細枠には表示しないけど明細枠の数量には加算する
							// そのため、このタイミングでは削除せずsetDownで削除する
							schdR.setBooleanNE("del_flg", true);
						}
					}
				}
			}
			else {
				// 未入荷分、または受領インボイス登録対象選択、明細追加選択で選択されていない入荷実績は表示しない
				for (Srch01_IoR ioR : srchIoL) {
					if (isNull(ioR.arr_act_no())) {
						removeL.add(ioR);
					}
					else {
						Srch01_Cnd2R cnd1R = up1().getFirst(_up1ArrActIdx, ioR.arr_act_no());
						if (isNull(cnd1R)) {
							removeL.add(ioR);
						}
					}
				}
			}
			if (!removeL.isEmpty()) {
				srchIoL.removeAll(removeL);
			}
		}
		protected void filterIo4RcptIv(MCList<Srch01_IoR> srchIoL) {
			MCList<Srch01_IoR> removeL = MCList.create(Srch01_IoR.class);
			if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ())) {
				// 同一仕入予定内に入荷分が存在する場合、未入荷分は表示しない
				for (MCList<Srch01_IoR> gl : srchIoL.groupList(Srch01_IoR.$purc_schd_no)) {
					MCList<Srch01_IoR> actL = gl.subList(r -> !isNull(r.arr_act_no()));
					if (!actL.isEmpty()) {
						removeL.add(gl.getFirst(Srch01_IoR.$arr_act_no, null));
					}
				}
			}
			if (!removeL.isEmpty()) {
				srchIoL.removeAll(removeL);
			}
		}
		protected void setQtyIo4Schd(MCList<Srch01_IoR> srchIoL) {
			// 受領インボイスを考慮した数量（基準単位）を設定
			// 受領インボイスマップに登録済みの分は差し引く（実績は一部数量をインボイスに割り当て可能。予定は不可）
			if (srchIoL.isEmpty()) {
				return;
			}
			MST_ARR_ACT_R t1 = MST_ARR_ACT_R.create("T1");
			MST_RCPT_IV_MAP_R w1 = MST_RCPT_IV_MAP_R.create("W1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.arr_act_no,
				t1.base_unit_qty.subtract(
					nvl(subQuery()
						.select(sum(w1.base_unit_qty))
						.from(w1)
						.where(
							w1.arr_act_no.eq(t1.arr_act_no)	
							.and(w1.rcpt_iv_d_no.neq(value(MAC_STR.NULL_VAL.value())))
						), value(0))
				).as("base_unit_qty")
			);
			bldr.setWhere(t1.arr_act_no.eq(bind("arr_act_no")));
			
			MCList<MST_ARR_ACT_R> rsltL = MCList.create(MST_ARR_ACT_R.class);
			dbSelect("MSBEL2210_MST_ARR_ACT_S01", rsltL, bldr, srchIoL);
			
			MCIndexKey idx = srchIoL.createIndex(Srch01_IoR.$arr_act_no);
			for (MST_ARR_ACT_R rsltR : rsltL) {
				MCList<Srch01_IoR> ioL = srchIoL.subList(idx, rsltR.arr_act_no());
				if (ioL.size() > 1) {
					// 入荷実績が複数件ある場合、受領インボイスマップの数量は考慮しない
					// この場合、明細枠と詳細枠とで数量が合わないことがあるが、その時はマニュアルで修正してもらう
					// 複数になるのは暫定買掛使用がオフのときに、仕入検収前在庫を一部移動した場合や、一部検査した場合など
				}
				else {
					ioL.get(0).base_unit_qty(rsltR.base_unit_qty());
				}
			}
		}
		protected void setQtyIo4RcptIv(MCList<Srch01_IoR> srchIoL) {
			if (srchIoL.isEmpty()) {
				return;
			}
			MST_RCPT_IV_D_R t1 = MST_RCPT_IV_D_R.create("T1");
			MST_RCPT_IV_MAP_R t2 = MST_RCPT_IV_MAP_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(t1.rcpt_iv_d_no, t1.purc_schd_no, t2.arr_act_no, t2.base_unit_qty);
			bldr.addInnerJoin(t2, t2.rcpt_iv_d_no.eq(t1.rcpt_iv_d_no));
			bldr.setWhere(t1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			
			MCList<MST_RCPT_IV_MAP_R> rsltL = MCList.create(MST_RCPT_IV_MAP_R.class);
			dbSelect("MSBEL2210_MST_RCPT_IV_MAP_S01", rsltL, bldr, up0());
			
			MCList<Srch01_IoR> orgSrchIoL = srchIoL.shallowClone();
			srchIoL.clear();
			srchIoL.addStringColumn(Srch01_DtlR.$rcpt_iv_d_no);
			
			// 受領インボイスマップをもとに、詳細枠を再設定する
			MCIndexKey idx = orgSrchIoL.createIndex(
				MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ()) ?
				Srch01_IoR.$purc_schd_no : Srch01_IoR.$arr_act_no
			);
			for (MST_RCPT_IV_MAP_R rsltR : rsltL) {
				MCList<Srch01_IoR>
					ioL = orgSrchIoL.subList(idx, rsltR.toArray(idx.getKeys())).clone();
				
				ioL.setStringNE(Srch01_DtlR.$rcpt_iv_d_no, rsltR.rcpt_iv_d_no());
				srchIoL.addAll(ioL);
				
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ())) {
					// base_unit_qty は仕入数を差し引いているので、差し引いていない数量を設定する
					for (Srch01_IoR ioR : ioL) {
						ioR.base_unit_qty(ioR.getNumberNE("org_base_unit_qty"));
					}
				}
				else {
					if (ioL.size() > 1) {
						// 入荷実績が複数件ある場合、受領インボイスマップの数量は考慮しない
						// この場合、明細枠と詳細枠とで数量が合わないことがあるが、その時はマニュアルで修正してもらう
						// 複数になるのは暫定買掛使用がオフのときに、仕入検収前在庫を一部移動した場合や、一部検査した場合など
					}
					else if (ioL.size() == 1) {
						ioL.get(0).base_unit_qty(rsltR.base_unit_qty());
					}
				}
			}
		}
		@Override
		protected MCDynamicSQLInfo getDtlWhere() {
			return MSBEL2210_MST_PURC_SCHD_S01_WHERE01();
		}
		@Override
		protected MCDynamicSQLInfo getIoWhere1() {
			return MSBEL2210_MST_PURC_SCHD_S02_WHERE01();
		}
		@Override
		protected MCDynamicSQLInfo getIoWhere2() {
			return MSBEL2210_MST_PURC_SCHD_S03_WHERE01();
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0(), down1());
			sortDown(down1());
		}
		// 親クラスではgrp_no2には0または1が設定されるので、1より大きい値を初期値とする
		protected int _grpNo2Seq = 10;
		@Override
		protected void setDtl2RowCalcQtyAndSplitDtl(
			mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl2R dtl2ParmRow, Srch01_IoR ioR) {
			
			// calcQtyAndSplitDtl で明細単位を決定するキーは以下の通り
			//　仕入予定ＮＯ(grp_no)＋入荷実績の有無(grp_no2)＋ロット明細分割区分(内部で補完）
			// ■受領インボイス作成元区分が「入荷実績」の場合
			//  ・まとめ対象がオフの場合、grp_no2に一意の値を設定することで明細（仕入予定）を分割する
			//  ・まとめ対象がオンの場合、親クラスの仕様に従う（一律"0"が設定されるので仕入予定でまとまる）
			// ■受領インボイス作成元区分が「入荷予定」の場合
			//  ・入荷分、未入荷分で明細を分割しない（入荷分と未入荷分が混在している場合、未入荷分は詳細に表示しない）
			if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0().rcpt_iv_src_typ())) {
				ioR.grp_no2("0");
				dtl2ParmRow.grp_no(ioR.purc_schd_no());
				dtl2ParmRow.grp_no2(ioR.grp_no2());
			}
			else {
				Srch01_Cnd2R cnd1R = up1().getFirst(_up1ArrActIdx, ioR.arr_act_no());
				if (!isNull(cnd1R) && !cnd1R.bndl_tgt_flg()) {
					// まとめない（入荷実績ごと）
					ioR.grp_no2(Integer.toString(_grpNo2Seq++));
					
					dtl2ParmRow.grp_no(ioR.purc_schd_no());
					dtl2ParmRow.grp_no2(ioR.grp_no2());
				}
				else {
					// まとめる（仕入予定ごと）
					super.setDtl2RowCalcQtyAndSplitDtl(dtl2ParmRow, ioR);
				}
			}
			
			// 取引単位違いで明細を分割しないために基準単位を設定する
			dtl2ParmRow.trd_unit_qty(ioR.base_unit_qty());
			dtl2ParmRow.trd_unit_cd(ioR.base_unit_cd());
			dtl2ParmRow.trd_unit_conv_qty(1);
			dtl2ParmRow.trd_unit_conv_base_qty(1);
		}
		@Override
		protected void setDown(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL, MCList<Srch01_IoR> srchIoL) {
			super.setDown(srchHdr, srchDtlL, srchIoL);
			down2().setAll(srchIoL.subList(r -> !r.getBooleanNE("del_flg")));
		}
		protected void sortDown(MCList<Srch01_DtlR> srchDtlL) {
			// 受領インボイス登録は複数発注をまとめて登録可能なため、ソートに発注ＮＯを追加
			srchDtlL.sort(Srch01_DtlR.$po_no, Srch01_DtlR.$po_d_no, Srch01_DtlR.$purc_schd_no, 
					Srch01_DtlR.$lot_no, Srch01_DtlR.$sublot_no, Srch01_DtlR.$trd_unit_cd);
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 受領インボイス情報もしくは仕入実績情報を検索する。<br>
	 */
	public class Srch02 extends MSBEL_RcptIvReg_MC_A.Srch02 {
		protected MCList<Srch01_DtlR> _srchDtlL;
		protected Srch01_HdrR _srchHdrR;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			preProc();
			super.doSearchMain();
		}
		@Override
		protected void setDown() {
			super.setDown();
			editDown(down0(), down1(),down2());
			down2().setAll(down2().subList(r -> !r.getBooleanNE("del_flg")));
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0(), down1());
		}
		@Override
		protected String[] getIoKeys() {
			return new String[] {
				Srch01_DtlR.$rcpt_iv_d_no
			};
		}
		@Override
		protected void editListSub() {
			super.editListSub();
			if (down1().size() > 0) {
				if (down0().fix_flg() && down0().pay_spot_flg()) {
					// 仕入実績ヘッダには都度支払いの場合でも設定されているのでクリアする
					down1().setDateNE(Srch01_HdrR.$pay_basis_dt, null);
				}
				
				// 明細⇒ヘッダへ項目を設定
				Srch01_DtlR tmpDtlR = down1().get(0);
				for (String[] cols : getDtlToHdrColumn()) {
					if (MCBooleanUtil.dbStringToBoolean(cols[0])
						&& down1().groupByNE(cols[1]).size() > 1) {
						continue;
					}
					for (int i= 1; i<cols.length; i++) {
						String addCol = cols[i];
						down0().setValueNE(addCol, tmpDtlR.getValueNE(addCol));
					}
				}
			}
			down0().setStringNE(Srch01_HdrR.$sub_char1, down0().getStringNE("hdr_sub_char1"));
			down0().setStringNE(Srch01_HdrR.$sub_char2, down0().getStringNE("hdr_sub_char2"));
			down0().setStringNE(Srch01_HdrR.$sub_char3, down0().getStringNE("hdr_sub_char3"));
			
			setHdrApDptCd(down0());
			setHdrMstApDptCd(down0());
		}
		protected void preProc() {
			_srchHdrR = Srch01_HdrR.create();
			_srchDtlL = MCList.create(Srch01_DtlR.class);
			
			// 明細⇒ヘッダにコピーする項目を定義する
			for (String[] cols : getDtlToHdrColumn()) {
				for (int i= 1; i<cols.length; i++) {
					String addCol = cols[i];
					MCMeta meta =  _srchHdrR.getConstMeta(addCol);
					if (meta == null) meta = _srchHdrR.getTempMeta(addCol);
					
					if (_srchDtlL.createRow().contains(addCol)) {
						// 既に存在する場合は追加しない
						continue;
					}
					
					if (meta == null) {
						_srchDtlL.addStringColumn(addCol);
					}
					else {
						if (MCDataType.STRING == meta.type()) {
							_srchDtlL.addStringColumn(addCol);
						}
						else if (MCDataType.BOOLEAN == meta.type()) {
							_srchDtlL.addBooleanColumn(addCol);
						}
						else if (MCDataType.DATE == meta.type() || MCDataType.TIMESTAMP == meta.type()) {
							_srchDtlL.addDateColumn(addCol);
						}
						else if (MCDataType.NUMBER == meta.type()) {
							_srchDtlL.addNumberColumn(addCol);
						}
					}
				}
			}
		}
		
		/**
		 * 明細からヘッダにコピーする項目
		 */
		protected String[][] _dtlToHdrArray;
		protected String[][] getDtlToHdrColumn() {
			if (_dtlToHdrArray == null) {
				_dtlToHdrArray = new String[][]{
					// 明細の値が混在していたらヘッダに設定しない項目
					// 混在しているかは2番目の要素（trd_cdとかpurc_usr_cdなど）で判断する
					{"1", Srch01_HdrR.$trd_cd, Srch01_HdrR.$trd_nm, Srch01_HdrR.$trd_ptn_typ},
					{"1", Srch01_HdrR.$purc_usr_cd, Srch01_HdrR.$purc_usr_nm},
					{"1", Srch01_HdrR.$purc_dpt_cd, Srch01_HdrR.$purc_dpt_nm, Srch01_HdrR.$purc_dpt_wg_cd, Srch01_HdrR.$purc_dpt_wg_nm, Srch01_HdrR.$ap_dpt_flg},
					{"1", Srch01_HdrR.$trd_rmrks},				// 取引備考
					{"1", Srch01_HdrR.$intr_rmrks},				// 仕入実績内部備考
					{"1", Srch01_HdrR.$po_print_rmrks},	// 注文書備考
					{"1", "hdr_sub_char1"},		// 仕入実績予備１
					{"1", "hdr_sub_char2"},		// 仕入実績予備２
					{"1", "hdr_sub_char3"},		// 仕入実績予備３
					
					// 明細の値が混在していてもヘッダに設定する項目
					{"0", Srch01_HdrR.$ac_dt},
					{"0", Srch01_HdrR.$pay_basis_dt},
					{"0", Srch01_HdrR.$xrate},
					{"0", Srch01_HdrR.$ptax_xrate},
					{"0", Srch01_HdrR.$ptax_dt},
					{"0", Srch01_HdrR.$cst_cd, Srch01_HdrR.$cst_nm},
					{"0", Srch01_HdrR.$slo_xrate},
					{"0", Srch01_HdrR.$slo_trd_ptn_typ},
					{"0", Srch01_HdrR.$sls_basis_typ,},
					{"0", Srch01_HdrR.$slo_tterm_cd1, Srch01_HdrR.$slo_tterm_nm1},
					{"0", Srch01_HdrR.$slo_tterm_cd2, Srch01_HdrR.$slo_tterm_nm2},
					{"0", Srch01_HdrR.$slo_tterm_cd3, Srch01_HdrR.$slo_tterm_nm3},
					{"0", Srch01_HdrR.$slo_tterm_rmrks1,},
					{"0", Srch01_HdrR.$slo_tterm_rmrks2},
					{"0", Srch01_HdrR.$slo_tterm_rmrks3},
					{"0", Srch01_HdrR.$slo_cur_cd, Srch01_HdrR.$slo_cur_nm},
					{"0", Srch01_HdrR.$slo_ptax_xrate},
				};
			}
			return _dtlToHdrArray;
		}
		@Override
		protected int srchHdr() {
			// 受領インボイス情報を検索する
			MCList<Srch01_HdrR> tmpL = MCList.create(Srch01_HdrR.class);
			//受領インボイス管理ＮＯ優先で検索。受領インボイス一覧照会から画面遷移後の初期検索は受領インボイス管理ＮＯのみが設定される想定。
			//画面遷移後、2回目以降の検索は画面の受領インボイスＮＯで検索する。
			if(!isNull(up0().rcpt_iv_mng_no())){
				up0().rcpt_iv_no(null);
			}
			
			if (isSame(getMaxRev(), 0)) {
				return 0;
			}
			
			int cnt = executeQuery(tmpL, MSBEL2210_MST_RCPT_IV_S01(), up0());
			
			if (isSame(cnt, 0)) {
				return 0;
			}
			
			MCRow.copyall(_srchHdrR, tmpL.get(0));
			
			if ((isSame(up0().ope(), OPE_UPD) || isSame(up0().ope(),OPE_DEL))
					&& _srchHdrR.can_flg()) { 
				throw new MCAppException(new MCMessage(MSBEL1128, _srchHdrR.rcpt_iv_no()));
			}
			
			setHdrCur(_srchHdrR);
			
			MCRow.copyall(down0(), _srchHdrR);
			
			return cnt;
		}
		protected int getMaxRev() {
			MCList<MST_RCPT_IV_R> rcptIvL = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t1 = MST_RCPT_IV_R.create("T1");
			MCQueryApiBuilder maxRev_bldr = MCQueryApiBuilder.create(t1);
			maxRev_bldr.setSelect(t1.rcpt_iv_rev, t1.rcpt_iv_mng_no);
			maxRev_bldr.addWhereWithCutOffAnd(t1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			maxRev_bldr.addWhereWithCutOffAnd(t1.rcpt_iv_no.eq(bind("rcpt_iv_no")));
			dbSelect("MSBEL2210_MST_RCPT_IV_S02", rcptIvL, maxRev_bldr, up0());
			int cnt = rcptIvL.size();
			if (isSame(cnt, 1)) {
				MST_RCPT_IV_R rcptIvR = rcptIvL.get(0);
				up0().addNumberColumn("tmp_max_rev", rcptIvR.rcpt_iv_rev());
				up0().rcpt_iv_mng_no(rcptIvR.rcpt_iv_mng_no());
				up0().rcpt_iv_no(null);
			}
			else if (isSame(cnt, 0)) {
				MCList<MST_RCPT_IV_P_R> rcptIvPL = MCList.create(MST_RCPT_IV_P_R.class);
				MST_RCPT_IV_P_R t2 = MST_RCPT_IV_P_R.create("T2");
				maxRev_bldr = MCQueryApiBuilder.create(t2);
				maxRev_bldr.setSelect(t2.rcpt_iv_mng_no);
				maxRev_bldr.addWhereWithCutOffAnd(t2.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
				maxRev_bldr.addWhereWithCutOffAnd(t2.rcpt_iv_no.eq(bind("rcpt_iv_no")));
				maxRev_bldr.setGroupBy(t2.rcpt_iv_mng_no);
				maxRev_bldr.addGroupFunc(max(t2.rcpt_iv_rev), "rcpt_iv_rev");
				dbSelect("MSBEL2210_MST_RCPT_IV_P_S01", rcptIvPL, maxRev_bldr, up0());
				cnt = rcptIvPL.size();
				if (isSame(cnt, 1)) {
					MST_RCPT_IV_P_R rcptIvPR = rcptIvPL.get(0);
					up0().rcpt_iv_mng_no(rcptIvPR.rcpt_iv_mng_no());
					up0().rcpt_iv_no(null);
				}
			}
			
			// 受領インボイスＮＯは一意ではない。
			if (1 < cnt) {
				throw new MCAppException(up0(), null, MSBEL0194, up0().rcpt_iv_no(), toDispGUIIndex(up0()));
			}
			
			return 1;
		}
		protected String[] getIvOnlyColumn() {
			return new String[]{
					Srch01_DtlR.$arr_schd_dt,
					Srch01_DtlR.$schd_sync_flg,
					Srch01_DtlR.$cntry_org_cd,
					Srch01_DtlR.$cntry_org_nm,
					Srch01_DtlR.$tax_fix_flg,
					Srch01_DtlR.$trd_cd,
					Srch01_DtlR.$rcpt_iv_d_no,
					Srch01_DtlR.$rcpt_iv_d_rmrks,
					Srch01_DtlR.$rcpt_iv_intr_d_rmrks,
					Srch01_DtlR.$rcpt_iv_d_sub_char1,
					Srch01_DtlR.$rcpt_iv_d_sub_char2,
					Srch01_DtlR.$rcpt_iv_d_sub_char3,
					Srch01_DtlR.$slo_d_no,
					Srch01_HdrR.$cst_cd,
					Srch01_HdrR.$cst_nm,
					Srch01_HdrR.$slo_xrate,
					Srch01_HdrR.$slo_trd_ptn_typ,
					Srch01_HdrR.$sls_basis_typ,
					Srch01_HdrR.$slo_tterm_cd1,
					Srch01_HdrR.$slo_tterm_nm1,
					Srch01_HdrR.$slo_tterm_cd2,
					Srch01_HdrR.$slo_tterm_nm2,
					Srch01_HdrR.$slo_tterm_cd3,
					Srch01_HdrR.$slo_tterm_nm3,
					Srch01_HdrR.$slo_tterm_rmrks1,
					Srch01_HdrR.$slo_tterm_rmrks2,
					Srch01_HdrR.$slo_tterm_rmrks3,
					Srch01_HdrR.$slo_cur_cd,
					Srch01_HdrR.$slo_cur_nm,
					Srch01_HdrR.$slo_ptax_xrate
			};
		}
		@Override
		protected int srchDtl() {
			int cnt = executeQuery(_srchDtlL, MSBEL2210_MST_RCPT_IV_D_S01(), down0());
			if (isSame(cnt, 0) || !checkDac()) {
				return 0;
			}
			if (down0().fix_flg()) {
				MCList<Srch01_DtlR> ivDL = _srchDtlL.clone();
				MCList<Srch01_DtlR> purcActDL = ivDL.shallowClone();
				
				cnt = executeQuery(purcActDL, getDtlSrchSql(), down0());
				if (isSame(cnt, 0)) {
					return 0;
				}
				_srchDtlL.init();
				MCIndexKey idx = purcActDL.createIndex(Srch01_DtlR.$rcpt_iv_d_no);
				// 仕入実績の検索結果を反映
				for (Srch01_DtlR ivDR :ivDL) {
					MCList<Srch01_DtlR> tmpL = purcActDL.subList(idx, ivDR.rcpt_iv_d_no());
					if (tmpL.isEmpty()) {
						_srchDtlL.add(ivDR);
					}
					else {
						tmpL.sort(SortType.DESC, Srch01_DtlR.$purc_act_d_seq);
						Srch01_DtlR purcActDR = tmpL.get(0);
						
						// 受領インボイスにしか存在しない項目を補完
						purcActDR.setValuesByName(ivDR, getIvOnlyColumn());
						_srchDtlL.add(purcActDR);
					}
				}
				_srchDtlL.sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$rcpt_iv_d_no);
			}
			else {
				setPegNo(_srchDtlL);
				
				MCList<Srch01_DtlR> calcTgtL = _srchDtlL.subList(r -> 
					// 仕入対象外は計算対象から除く
					!r.non_purc_flg()
				);
				// 金額計算
				callConvQtyAmtUtil(down0(), calcTgtL);
			}
			down1().setAll(_srchDtlL);
			return cnt;
		}
		protected boolean checkDac() {
			for(Srch01_DtlR r : _srchDtlL){
				if(!readableWgCdDac(r.purc_dpt_wg_cd())){
					return false;
				}
			}
			return true;
		}
		@Override
		protected int srchIo() {
			if (down0().fix_flg()) {
				executeQuery(down2(), getIoSrchSql(), down1());
			}
			
			if (!down0().can_flg() || down0().fix_flg()) {
				// 取消済みでない、または確定済みの場合は、仕入予定(入荷実績)または仕入実績受払を表示する
				MCList<Srch01_DtlR> srch01CndL =
					down0().fix_flg() ? down1().subList(r -> r.non_purc_flg()) : down1();
				
				if (!srch01CndL.isEmpty()) {
					MSBEL_RcptIvReg.Srch01 ope = MSBEL_RcptIvReg.crtSrch01();
					ope.up0().setStringNE(Srch01_HdrR.$rcpt_iv_mng_no, down0().rcpt_iv_mng_no());
					ope.up0().rcpt_iv_src_typ(down0().rcpt_iv_src_typ());
					ope.up0().purc_schd_no(
						MCStringUtil.arrayValueJoin(
							srch01CndL.getString(Srch01_DtlR.$purc_schd_no).toArray(new String[0])
						)
					);
					ope.up0().io_srch_only_flg(true);
					ope.exec();
					
					down2().addAll(ope.down2());
					
					// 輸入諸掛り分
					addXpnsRows(down1().subList(r -> r.manual_add_flg()));
					
					if (MSC_RCPT_IV_SRC_TYP.isARR_ACT(down0().rcpt_iv_src_typ())) {
						// 入荷実績を紐付けたあとに入荷実績を削除された分
						// この場合でも詳細枠なしでヘッダ枠と明細枠は表示する
						addDmyRows();
					}
				}
			}
			else {
				// 未確定、かつ取消済みの場合は何も表示しない
				addDmyRows();
			}
			
			return down2().size();
		}
		
		/**
		 * 輸入諸掛り分の詳細を追加する
		 */
		protected void addXpnsRows(MCList<Srch01_DtlR> dtlL) {
			MCIndexKey idx = down2().createIndex(getIoKeys());
			MCList<Srch01_IoR> down2 = MCList.create(Srch01_IoR.class);
			for (Srch01_DtlR dtlR : dtlL) {
				if (isNull(down2().getFirst(idx, dtlR.toArray(getIoKeys())))) {
					// 輸入諸掛りで詳細が存在しない場合、明細をもとに詳細を作成する
					
					// 納入場所関連の補完
					setXpnsDtlRow(dtlR);
					
					// 詳細を追加
					down2.add(createIoR4Xpns(dtlR));
				}
			}
			down2().addAll(down2);
		}
		
		/**
		 * 輸入諸掛り分の明細に、受領インボイス明細にはない情報を設定する
		 */
		protected void setXpnsDtlRow(Srch01_DtlR dtlR) {
			
			// 輸入諸掛り分に設定する初期明細を取得
			Srch01_DtlR baseR = getXpnsBaseDtlR();
			
			// 輸入諸掛り分の納入場所関連
			dtlR.dlv_loc_wg_cd(baseR.dlv_loc_wg_cd());
			dtlR.dlv_loc_wg_nm(baseR.dlv_loc_wg_nm());
			dtlR.dlv_loc_cd(baseR.dlv_loc_cd());
			dtlR.dlv_loc_nm(baseR.dlv_loc_nm());
			dtlR.dlv_loc_sppl_cd(baseR.dlv_loc_sppl_cd());
			dtlR.str_ln_tgt_flg(baseR.str_ln_tgt_flg());
			dtlR.str_ln_cd(baseR.str_ln_cd());
			dtlR.str_ln_nm(baseR.str_ln_nm());
			dtlR.str_ln_cd_none_flg(baseR.str_ln_cd_none_flg());
			
			dtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
			dtlR.gd_nm(getDefaultFeedStkGd().gd_nm());
		}
		protected Srch01_DtlR _xpnsBaseDtlR = null;
		protected Srch01_DtlR getXpnsBaseDtlR() {
			// 発注引継ぎのうち最も古い明細を、輸入し諸掛り分と初期値とする
			if (isNull(_xpnsBaseDtlR)) {
				MCList<Srch01_DtlR> tmpL = down1().subList(r -> !isNull(r.dlv_loc_cd()));
				if (tmpL.isEmpty()) {
					_xpnsBaseDtlR = Srch01_DtlR.create();
				}
				else {
					_xpnsBaseDtlR = tmpL.distinctNE(Srch01_DtlR.$purc_schd_no).get(0);
				}
			}
			return _xpnsBaseDtlR;
		}
		
		/**
		 * 輸入諸掛り分の詳細を作成する
		 */
		protected Srch01_IoR createIoR4Xpns(Srch01_DtlR dtlR) {
			Srch01_IoR ioR = Srch01_IoR.create();
			
			// 明細との紐付け情報
			for (String key : getIoKeys()) {
				ioR.setValueNE(key, dtlR.getValue(key));
			}
			ioR.from_gd_cd(dtlR.gd_cd());
			ioR.gi_wg_cd(dtlR.dlv_loc_wg_cd());
			ioR.gi_loc_cd(dtlR.dlv_loc_cd());
			ioR.gi_str_ln_cd(dtlR.str_ln_cd());
			
			ioR.dlv_loc_wg_cd(dtlR.dlv_loc_wg_cd());
			ioR.dlv_loc_wg_nm(dtlR.dlv_loc_wg_nm());
			ioR.dlv_loc_cd(dtlR.dlv_loc_cd());
			ioR.dlv_loc_nm(dtlR.dlv_loc_nm());
			ioR.dlv_loc_sppl_cd(dtlR.dlv_loc_sppl_cd());
			ioR.str_ln_tgt_flg(dtlR.str_ln_tgt_flg());
			ioR.str_ln_cd(dtlR.str_ln_cd());
			ioR.str_ln_nm(dtlR.str_ln_nm());
			ioR.str_ln_cd_none_flg(dtlR.str_ln_cd_none_flg());
			ioR.itm_cd(dtlR.itm_cd());
			ioR.itm_sub1(dtlR.itm_sub1());
			ioR.itm_sub2(dtlR.itm_sub2());
			ioR.itm_sub3(dtlR.itm_sub3());
			ioR.gd_cd(dtlR.gd_cd());
			ioR.gd_nm(dtlR.gd_nm());
			ioR.trd_unit_cd(dtlR.trd_unit_cd());
			ioR.trd_unit_nm(dtlR.trd_unit_nm());
			ioR.trd_unit_dec_place(dtlR.trd_unit_dec_place());
			ioR.trd_unit_rnd_typ(dtlR.trd_unit_rnd_typ());
			ioR.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
			ioR.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
			ioR.trd_unit_qty(dtlR.trd_unit_qty());
			ioR.base_unit_cd(dtlR.base_unit_cd());
			ioR.base_unit_nm(dtlR.base_unit_nm());
			ioR.base_unit_dec_place(dtlR.base_unit_dec_place());
			ioR.base_unit_rnd_typ(dtlR.base_unit_rnd_typ());
			ioR.base_unit_qty(dtlR.base_unit_qty());
			
			// SQLで結果をStringで取得するので、一時カラムもStringとする
			ioR.addStringColumn(Srch01_DtlR.$temp_ap_flg);
			
			return ioR;
		}
		
		/**
		 * ダミー行を追加する<p>
		 * 以下の時に追加する想定<br>
		 * ・確定オフ、かつ取消済み分<br>
		 * ・入荷実績を紐付けたあとに、入荷実績を削除された分<br>
		 * ※処理手順上の追加するだけで、下り電文には設定されない
		 */
		protected void addDmyRows() {
			MCIndexKey idx = down2().createIndex(getIoKeys());
			MCList<Srch01_IoR> down2 = MCList.create(Srch01_IoR.class);
			for (Srch01_DtlR dtlR : down1()) {
				if (isNull(down2().getFirst(idx, dtlR.toArray(getIoKeys())))) {
					Srch01_IoR ioR = createDmyRow(dtlR);
					
					// 明細との紐付け情報
					for (String key : getIoKeys()) {
						ioR.setValueNE(key, dtlR.getValue(key));
					}
					// SQLで結果をStringで取得するので、一時カラムもStringとする
					ioR.addStringColumn(Srch01_DtlR.$temp_ap_flg);
					
					// 追加するダミー行は、詳細枠は表示しない
					// 継承元の関係でダミー行を追加しておき、setDownで削除する
					ioR.setBooleanNE("del_flg", true);
					
					down2.add(ioR);
				}
			}
			down2().addAll(down2);
		}
		
		/**
		 * ダミー行を作成する
		 */
		protected Srch01_IoR createDmyRow(Srch01_DtlR dtlR) {
			Srch01_IoR ioR =Srch01_IoR.create();
			
			// 明細との紐付け情報
			for (String key : getIoKeys()) {
				ioR.setValueNE(key, dtlR.getValue(key));
			}
			// SQLで結果をStringで取得するので、一時カラムもStringとする
			ioR.addStringColumn(Srch01_DtlR.$temp_ap_flg);
			
			// 確定オフ、かつ取消済みは、詳細枠は表示しない
			// 継承元の関係でダミー行を追加しておき、setDownで削除する
			ioR.setBooleanNE("del_flg", true);
			
			return ioR;
		}
		@Override
		protected MCDynamicSQLInfo getDtlWhere() {
			return MSBDL0140_MST_PURC_ACT_D_S01_WHERE01();
		}
	}
	@Override
	protected void editDtl(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL, MCList<Srch01_IoR> ioL) {
		if (!hdr.fix_flg()) {
			// 以下のときに実行する
			// ・Srch01から呼ばれたとき
			// ・Srch02からio_schd_only=trueでSrch01が呼ばれたとき
			super.editDtl(hdr, dtlL, ioL);
			
			MCIndexKey iok = ioL.createIndex(Srch01_IoR.$dtl_peg_no);
			
			// 暫定買掛フラグ
			for (Srch01_DtlR dtlR : dtlL) {
				// 入荷実績経由で取得した値を設定する
				MCList<Srch01_IoR> tmpL = ioL.subList(iok,  dtlR.peg_no());
				if (!tmpL.isEmpty()) {
					dtlR.temp_ap_flg(
						MCBooleanUtil.dbStringToBoolean(
							(String)tmpL.max(Srch01_DtlR.$temp_ap_flg)
						)
					);
				}
			}
		}
	}
	@Override
	protected void callConvQtyAmtUtil(Srch01_HdrR srchHdr, MCList<Srch01_DtlR> srchDtlL) {
		if (isNull(srchHdr.rcpt_iv_mng_no())) {
			// Srch01
			super.callConvQtyAmtUtil(srchHdr, srchDtlL);
		}
		else {
			// Srch02
			srchDtlL.subList(r -> r.manual_add_flg()).forEach(r -> {
				// 画面側の金額ユーティリティ用に補完
				r.src_trd_unit_cd(r.trd_unit_cd());
				r.src_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.src_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.src_trd_unit_dec_place(r.trd_unit_dec_place());
				r.src_trd_unit_rnd_typ(r.trd_unit_rnd_typ());
				r.src_trd_unit_qty(r.trd_unit_qty());
				r.src_base_unit_qty(r.base_unit_qty());
				r.src_trd_cur_upri(r.trd_cur_upri());
				r.src_trd_cur_proc_upri(r.trd_cur_proc_upri());
				r.src_trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri());
				r.src_trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
				r.src_trd_cur_amt(r.trd_cur_amt());
				r.src_trd_cur_proc_amt(r.trd_cur_proc_amt());
				r.src_trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt());
				r.src_trd_cur_tax_amt(r.trd_cur_tax_amt());
				r.src_wtax_rate(r.wtax_rate());
				r.src_tax_cd(r.tax_cd());
				r.src_tax_nm(r.tax_nm());
				r.src_tax_rate(r.tax_rate());
				r.src_tax_typ(r.tax_typ());
				r.src_inc_tax_flg(r.inc_tax_flg());
			});
			
			// 以下の金額計算を行う
			// ・基準通貨、納税通貨
			super.callConvQtyAmtUtilAftr(srchHdr, srchDtlL);
		}
	}
	/**
	 * Iv_Ins01オペレーション.<p>
	 *
	 * 受領インボイス・仕入実績を登録する。<br>
	 */
	public class Iv_Ins01 extends MSBEL_RcptIvReg_MC_A.Iv_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setRowStatus();
			
			setDataCrudTyp(up0(), up1());
			
			// 受領インボイス登録チェック実行
			callThisRcptIvChk01();
			
			// チェック・補完処理でエラーがあった場合は処理中断
			throwUpdErr();
			
			// 受領インボイス登録SV呼出
			callRcptIvIns();
			
			// 仕入実績登録オペレーション実行
			callPurcRegOpe();
			
			// 下り電文セット
			setDown();
			
			setInterimMsg(up0(), up1());
		}
		protected void setRowStatus () {
			up0().setStatus(CREATE);
			up1().setStatus(CREATE);
			up2().setStatus(CREATE);
		}
		protected void callThisRcptIvChk01() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.RcptIv_Chk01 chk01Ope = MSBEL_RcptIvReg.crtRcptIv_Chk01();
			MCRow.copyall(chk01Ope.up0(), up0());
			chk01Ope.up1().setAll(up1());
			chk01Ope.up2().setAll(up2());
			chk01Ope.exec();

			// チェック結果を取得
			MCRow.copyall(up0(), chk01Ope.down0());
			up1().setAll(chk01Ope.down1());
		}
		/**
		 * 仕入実績登録関連のオペレーションを実行する。
		 */
		protected void callPurcRegOpe() {
			// 確定以外は呼出不要
			if (!up0().fix_flg()) {
				return;
			}
			callPurcRegOpeCmn(up0(), up1(), up2());
		}
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			// up2の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq};
			copyByPegNo(down2(), downCols, up2(), downCols);
		}
		/**
		 * 受領インボイス登録サービスの登録処理を実行する
		 */
		protected void callRcptIvIns() {
			MSBEL_RcptIvRegService.RcptIv_Ins01 ope = MSBEL_RcptIvRegService.crtRcptIv_Ins01();
			
			RcptIv_Chk01_HdrR hdrR = RcptIv_Chk01_HdrR.create();
			
			Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR, Iv_Chk01_HdrR> hdrRMap = createMap_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR();
			
			copy(hdrR, up0(), hdrRMap);
			ope.up0().add(hdrR);
			
			addAll(ope.up1(), up1(), createMap_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR(up0()));
			addRcptIvMap(ope.up2(), up0(), up1(), up2());
			
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
			
			setDownRcptIvSrv(ope);
		}
		protected void setDownRcptIvSrv(MSBEL_RcptIvRegService.RcptIv_Ins01 ope) {
			RcptIv_Chk01_HdrR hdrR = ope.up0().get(0);
			up0().rcpt_iv_mng_no(hdrR.rcpt_iv_mng_no());
			up0().rcpt_iv_rev(hdrR.rcpt_iv_rev());
			
			String[] destColsD = new String[] {Iv_Chk01_DtlR.$rcpt_iv_d_no, Iv_Chk01_DtlR.$purc_schd_no,
					Iv_Chk01_DtlR.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt, Iv_Chk01_DtlR.$trd_cur_wtax_amt,
					Iv_Chk01_DtlR.$trd_cur_proc_amt, Iv_Chk01_DtlR.$trd_cur_onr_prov_amt,
					Iv_Chk01_DtlR.$base_cur_amt, Iv_Chk01_DtlR.$base_cur_tax_amt,
					Iv_Chk01_DtlR.$ptax_cur_amt, Iv_Chk01_DtlR.$ptax_cur_tax_amt};
			String[] srcColsD = new String[] {RcptIv_Chk01_DtlR.$rcpt_iv_d_no, RcptIv_Chk01_DtlR.$purc_schd_no,
					RcptIv_Chk01_DtlR.$trd_cur_amt, RcptIv_Chk01_DtlR.$trd_cur_tax_amt, RcptIv_Chk01_DtlR.$wtax_amt,
					RcptIv_Chk01_DtlR.$trd_cur_proc_amt, RcptIv_Chk01_DtlR.$trd_cur_onr_prov_amt,
					RcptIv_Chk01_DtlR.$base_cur_amt, RcptIv_Chk01_DtlR.$base_cur_tax_amt,
					RcptIv_Chk01_DtlR.$ptax_cur_amt, RcptIv_Chk01_DtlR.$ptax_cur_tax_amt};
			
			copyByPegNo(up1(), destColsD, ope.down1(), srcColsD);
		}
	}
	/**
	 * Iv_Upd01オペレーション.<p>
	 *
	 * 受領インボイスを訂正する。仕入実績を登録・訂正する。（確定ＦＬＧにより変動）<br>
	 */
	public class Iv_Upd01 extends MSBEL_RcptIvReg_MC_A.Iv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setRowStatus();
			
			setDataCrudTyp(up0(), up1());
			
			replaceParam();
			
			// チェック
			callThisRcptIvChk01();
			
			// チェック・補完処理でエラーがあった場合は処理中断
			throwUpdErr();
			
			// 受領インボイス登録SV実行
			callRcptIvUpd();
			
			// 仕入実績SV実行
			callPurcRegOpe();
			
			setDown();
			
			setInterimMsg(up0(), up1());
		}
		protected void setRowStatus () {
			up0().setStatus(MODIFY);
			for (Iv_Chk01_DtlR dtlRow : up1()) {
				if (dtlRow.getStatus() == NONE) {
					dtlRow.setStatus(MODIFY);
				}
			}
			for (Chk01_IoR ioRow : up2()) {
				if (ioRow.getStatus() == NONE) {
					Iv_Chk01_DtlR dtlRow = up1().getFirst(Chk01_DtlR.$peg_no, ioRow.dtl_peg_no());
					ioRow.setStatus(dtlRow.getStatus());
				}
			}
		}
		protected void replaceParam() {
			
		}
		protected void callThisRcptIvChk01() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.RcptIv_Chk01 chk01Ope = MSBEL_RcptIvReg.crtRcptIv_Chk01();
			MCRow.copyall(chk01Ope.up0(), up0());
			chk01Ope.up1().setAll(up1());
			chk01Ope.up2().setAll(up2());
			chk01Ope.exec();

			// チェック結果を取得
			MCRow.copyall(up0(), chk01Ope.down0());
			up1().setAll(chk01Ope.down1());
		}
		/**
		 * 受領インボイス登録サービスの訂正処理を実行する
		 */
		protected void callRcptIvUpd() {
			MSBEL_RcptIvRegService.RcptIv_Upd01 ope = MSBEL_RcptIvRegService.crtRcptIv_Upd01();
			
			RcptIv_Chk01_HdrR hdrR = RcptIv_Chk01_HdrR.create();
			
			Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR, Iv_Chk01_HdrR> hdrRMap = createMap_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR();
			
			copy(hdrR, up0(), hdrRMap);
			ope.up0().add(hdrR);
			
			addAll(ope.up1(), up1(), createMap_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR(up0()));
			addRcptIvMap(ope.up2(), up0(), up1(), up2());
			
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
			
			setDownRcptIvSrv(ope);
		}
		protected void setDownRcptIvSrv(MSBEL_RcptIvRegService.RcptIv_Upd01 ope) {
			RcptIv_Chk01_HdrR hdrR = ope.up0().get(0);
			up0().rcpt_iv_mng_no(hdrR.rcpt_iv_mng_no());
			up0().rcpt_iv_rev(hdrR.rcpt_iv_rev());
			
			String[] destColsD = new String[] {Iv_Chk01_DtlR.$rcpt_iv_d_no, Iv_Chk01_DtlR.$purc_schd_no,
					Iv_Chk01_DtlR.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt, Iv_Chk01_DtlR.$trd_cur_wtax_amt,
					Iv_Chk01_DtlR.$trd_cur_proc_amt, Iv_Chk01_DtlR.$trd_cur_onr_prov_amt,
					Iv_Chk01_DtlR.$base_cur_amt, Iv_Chk01_DtlR.$base_cur_tax_amt,
					Iv_Chk01_DtlR.$ptax_cur_amt, Iv_Chk01_DtlR.$ptax_cur_tax_amt};
			String[] srcColsD = new String[] {RcptIv_Chk01_DtlR.$rcpt_iv_d_no, RcptIv_Chk01_DtlR.$purc_schd_no,
					RcptIv_Chk01_DtlR.$trd_cur_amt, RcptIv_Chk01_DtlR.$trd_cur_tax_amt, RcptIv_Chk01_DtlR.$wtax_amt,
					RcptIv_Chk01_DtlR.$trd_cur_proc_amt, RcptIv_Chk01_DtlR.$trd_cur_onr_prov_amt,
					RcptIv_Chk01_DtlR.$base_cur_amt, RcptIv_Chk01_DtlR.$base_cur_tax_amt,
					RcptIv_Chk01_DtlR.$ptax_cur_amt, RcptIv_Chk01_DtlR.$ptax_cur_tax_amt};
			
			copyByPegNo(up1(), destColsD, ope.down1(), srcColsD);
		}
		/**
		 * 仕入実績登録関連のオペレーションを実行する。
		 */
		protected void callPurcRegOpe() {
			callPurcRegOpeCmn(up0(), up1(), up2());
		}
		/**
		 * 下り電文セット
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			// up2の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq};
			copyByPegNo(down2(), downCols, up2(), downCols);
		}
	}
	/**
	 * Iv_Del01オペレーション.<p>
	 *
	 * 受領インボイスを取り消す。仕入実績を登録・取消する。（暫定ＦＬＧにより変動）<br>
	 */
	public class Iv_Del01 extends MSBEL_RcptIvReg_MC_A.Iv_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			setRowStatus();
			
			setDataCrudTyp(up0(), up1());
			
			// チェック
			callThisRcptIvChk01();
			
			// チェック・補完処理でエラーがあった場合は処理中断
			throwUpdErr();
			
			// 受領インボイス登録SV実行
			callRcptIvDel();
			
			// 仕入実績SV実行
			callPurcRegOpe();
		}
		protected void setRowStatus () {
			up0().setStatus(DELETE);
			up1().setStatus(DELETE);
			up2().setStatus(DELETE);
		}
		protected void callThisRcptIvChk01() {
			// チェック・補完処理を呼出し
			MSBEL_RcptIvReg.RcptIv_Chk01 chk01Ope = MSBEL_RcptIvReg.crtRcptIv_Chk01();
			MCRow.copyall(chk01Ope.up0(), up0());
			chk01Ope.up1().setAll(up1());
			chk01Ope.up2().setAll(up2());
			chk01Ope.exec();

			// チェック結果を取得
			MCRow.copyall(up0(), chk01Ope.down0());
			up1().setAll(chk01Ope.down1());
		}
		/**
		 * 受領インボイス登録サービスの取消処理を実行する
		 */
		protected void callRcptIvDel() {
			MSBEL_RcptIvRegService.RcptIv_Del01 ope = MSBEL_RcptIvRegService.crtRcptIv_Del01();
			
			RcptIv_Chk01_HdrR hdrR = RcptIv_Chk01_HdrR.create();
			
			Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR, Iv_Chk01_HdrR> hdrRMap = createMap_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR();
			
			copy(hdrR, up0(), hdrRMap);
			ope.up0().add(hdrR);
			
			addAll(ope.up1(), up1(), createMap_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR(up0()));
			
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
		}
		/**
		 * 仕入実績登録関連のオペレーションを実行する。
		 */
		protected void callPurcRegOpe() {
			callPurcRegOpeCmn(up0(), up1(), up2());
		}
	}
	protected void setValuesDbc(MCRow upR, Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
		if (upR instanceof Srch01_CndR) {
			setValuesDbc(MSBEL2210_DtlR_J01(), upR, dtlL);
		}
		else if (upR instanceof Srch02_CndR){
			setValuesDbc(MSBEL2210_DtlR_J02(), upR, dtlL);
		}
	}
	@Override
	protected MCMessageList lockArrPrAndChkUpdCntr(Chk01_HdrR chkH,
			MCList<Chk01_DtlR> chkDtl) {
		MCMessageList msgL = new MCMessageList();
		
		MCList<Chk01_DtlR> tgtDtl = chkDtl.subList(r -> !isNull(r.po_d_no()));
		
		MCList<MST_ARR_PR_R> dblArrPr = MCList.create(MST_ARR_PR_R.class);
		dbSelectKeyForUpdateNoWait("MSBEL2210_MST_ARR_PR_S01", dblArrPr,
				MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")), tgtDtl);
		MCIndexKey idxKey = dblArrPr.createIndex(MST_ARR_PR_R.$arr_pr_no);
		
		for (Chk01_DtlR chkR : tgtDtl) {
			// 発注あり仕入の場合でも、行追加された明細は入荷進捗がないので、カウンタチェック対象外
			if (!isNull(chkR.arr_pr_no())) {
				MST_ARR_PR_R lockR = dblArrPr.getFirst(idxKey, chkR.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(chkR, Chk01_DtlR.$arr_pr_upd_cntr, lockR));
				// 排他エラーが発生したら、原因行をヘッダに設定し、処理を抜ける
				if (msgL.size() > 0) {
					MCMessage msg = msgL.get(0);
					msg.setCauseRow(chkH, Chk01_HdrR.$purc_act_no);
					chkH.err_flg(true);
					break;
				}
			}
		}
		
		return msgL;
	}
	
	/**
	 * 仕入実績登録・訂正・取消オペレーションを実行する。
	 * 実行対象は確定ＦＬＧ、暫定ＦＬＧにより変動する。
	 * @param up0 上り電文１
	 * @param up1 上り電文２
	 * @param up2 上り電文３
	 */
	protected void callPurcRegOpeCmn (Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
		MCList<Chk01_DtlR> insDL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_DtlR> updDL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_DtlR> delDL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_IoR> insIoL = MCList.create(Chk01_IoR.class);
		MCList<Chk01_IoR> updIoL = MCList.create(Chk01_IoR.class);
		MCList<Chk01_IoR> delIoL = MCList.create(Chk01_IoR.class);
		// 戻し用のキー
		String[] colsD = new String[] {Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_seq, Chk01_DtlR.$purc_act_rev,
				Chk01_DtlR.$ap_dpt_nm, Chk01_DtlR.$purc_dpt_nm, Chk01_DtlR.$bd_dpt_nm};
		String[] colsIo = new String[] {Chk01_IoR.$purc_act_io_no};
		// オペレーション上り電文を設定する
		setUpDtlPurcOpe(up0, up1, up2, insDL, updDL, delDL, insIoL, updIoL, delIoL);
		
		setTempApRegFlg(false);

		// 画面戻し用の明細を取得するキー
		// 削除⇒訂正⇒登録の順で実行する
		if (!isNull(delDL) && !delDL.isEmpty()) {
			// 受払実績を登録するか：登録・訂正上り電文なしの場合は登録する。
			setPurcActIoRegFlg(isSame(insDL.size(), 0) && isSame(updDL.size(), 0));
			
			MCIndexKey ioKey = delIoL.createIndex(Chk01_IoR.$dtl_peg_no);
			for (MCList<Chk01_DtlR> delDGpL : delDL.groupList(Chk01_DtlR.$can_ac_dt)) {
				MSBEL_RcptIvReg.Del01 delOpe = MSBEL_RcptIvReg.crtDel01();
				MCRow.copyall(delOpe.up0(), up0.ph());
				delOpe.up0().setStatus(DELETE);
				delOpe.up0().pay_schd_dt(null);
				
				// 確定取消時（確定オンで取消、確定オン→オフで訂正）は取消計上日を設定
				if (isNull(up0.can_ac_dt())) {
					delOpe.up0().can_ac_dt(delDGpL.get(0).can_ac_dt());
				}
				
				delOpe.up1().addAll(delDGpL);
				delOpe.up1().setStatus(DELETE);
				for (Chk01_DtlR delDGpR : delDGpL) {
					MCList<Chk01_IoR> delIoSubL = delIoL.subList(ioKey, delDGpR.peg_no());
					delOpe.up2().addAll(delIoSubL);
				}
				delOpe.up2().setStatus(DELETE);
				delOpe.exec();
			}
		}
		if (!isNull(updDL) && !updDL.isEmpty()) {
			// 受払実績を登録するか：登録上り電文なしの場合は登録する。
			setPurcActIoRegFlg(isSame(insDL.size(), 0));
			MSBEL_RcptIvReg.Upd01 updOpe = MSBEL_RcptIvReg.crtUpd01();
			MCRow.copyall(updOpe.up0(), up0.ph());
			updOpe.up0().setStatus(MODIFY);
			if (isNull(updOpe.up0().pay_basis_dt())) updOpe.up0().pay_basis_dt(updOpe.up0().ac_dt());
			updOpe.up1().addAll(updDL);
			updOpe.up2().addAll(updIoL);
			updOpe.exec();
			
			// 仕入実績NO, 明細NO, 実績受払NOを設定する
			copyByPegNo(updDL, colsD, updOpe.down1(), colsD);
			copyByPegNo(updIoL, colsIo, updOpe.down2(), colsIo);
		}
		if (!isNull(insDL) && !insDL.isEmpty()) {
			MCIndexKey ioKey = insIoL.createIndex(Chk01_IoR.$dtl_peg_no);
			MCList<Chk01_DtlR> fixInsDL = insDL.clone();
			MCList<Chk01_DtlR> tempApDL = fixInsDL.subList(r -> r.temp_ap_flg());
			fixInsDL.removeAll(tempApDL);
			
			String[] dtlClearCol = new String[]{
					Chk01_DtlR.$purc_act_no,
					Chk01_DtlR.$purc_act_seq,
					Chk01_DtlR.$purc_act_rev,
					Chk01_DtlR.$purc_act_d_no,
					Chk01_DtlR.$purc_act_d_seq,
			};
			String [] ioClearCol = new String[] {
					Chk01_IoR.$purc_act_io_no,
					Chk01_IoR.$purc_act_io_seq
			};
			
			boolean tempApInsFlg = !isNull(tempApDL) && !tempApDL.isEmpty();
			
			if (!isNull(fixInsDL) && !fixInsDL.isEmpty()) {
				Chk01_DtlR wkR = fixInsDL.get(0);
				// 受払実績を登録するか
				setPurcActIoRegFlg(!tempApInsFlg);
				// 暫定仕入を除いて登録
				MSBEL_RcptIvReg.Ins01 insOpe = MSBEL_RcptIvReg.crtIns01();
				insOpe.up0().setStatus(CREATE);
				MCRow.copyall(insOpe.up0(), up0.ph());
				insOpe.up0().trd_cd(wkR.trd_cd());
				insOpe.up0().purc_dpt_cd(wkR.purc_dpt_cd());
				insOpe.up0().purc_usr_cd(wkR.purc_usr_cd());
				if (isNull(insOpe.up0().pay_basis_dt())) insOpe.up0().pay_basis_dt(insOpe.up0().ac_dt());
				fixInsDL.clear(dtlClearCol);
				insOpe.up1().addAll(fixInsDL);
				insOpe.up1().setStatus(CREATE);
				for (Chk01_DtlR fixInsDR : fixInsDL) {
					MCList<Chk01_IoR> fixInsIoL = insIoL.subList(ioKey, fixInsDR.peg_no());
					fixInsIoL.clear(ioClearCol);
					insOpe.up2().addAll(fixInsIoL);
				}
				insOpe.up2().setStatus(CREATE);
				insOpe.exec();
				
				// 仕入実績NO, 明細NO, 実績受払NOを設定する
				copyByPegNo(insDL, colsD, insOpe.down1(), colsD);
				copyByPegNo(insIoL, colsIo, insOpe.down2(), colsIo);
			}
			
			if (tempApInsFlg) {
				setPurcActIoRegFlg(true);
				setTempApRegFlg(true);
				Chk01_DtlR wkR = tempApDL.get(0);
				
				for (Chk01_DtlR tempApDR : tempApDL) {
					// 暫定買掛はヘッダ：明細：詳細＝１：１：１
					MSBEL_RcptIvReg.Ins01 insOpe2 = MSBEL_RcptIvReg.crtIns01();
					insOpe2.up0().setStatus(CREATE);
					if (isNull(insOpe2.up0().pay_basis_dt())) insOpe2.up0().pay_basis_dt(insOpe2.up0().ac_dt());
					MCRow.copyall(insOpe2.up0(), up0.ph());
					insOpe2.up0().trd_cd(wkR.trd_cd());
					insOpe2.up0().purc_dpt_cd(wkR.purc_dpt_cd());
					insOpe2.up0().purc_usr_cd(wkR.purc_usr_cd());
					
					MCList<Chk01_IoR> tempApIoL = insIoL.subList(ioKey, tempApDR.peg_no());
					MST_ARR_ACT_R arrActR = getArrActCache(tempApIoL.get(0).arr_act_no());
					// 確定時（確定オンで登録、確定オフ→オンで訂正）は画面の日付を設定（上り電文）
					// 確定取消時（確定オンで取消、確定オン→オフで訂正）は取消計上日を設定
					if (!isNull(up0.can_ac_dt())) {
						insOpe2.up0().ac_dt(up0.can_ac_dt());
						insOpe2.up0().purc_dt(arrActR.arr_tm().trunc(MCDateFieldType.DAY));
					}
					// 入荷実績の計上日が締前の場合は入荷実績の日付に戻す
					if(!isPurcCl(arrActR.ac_dt())) {
						insOpe2.up0().ac_dt(arrActR.ac_dt());
						insOpe2.up0().purc_dt(arrActR.arr_tm().trunc(MCDateFieldType.DAY));
					}
					
					tempApDR.clear(dtlClearCol);
					insOpe2.up1().add(tempApDR);
					insOpe2.up1().setStatus(CREATE);
					
					tempApIoL.clear(ioClearCol);
					insOpe2.up2().addAll(tempApIoL);
					insOpe2.up2().setStatus(CREATE);
					insOpe2.exec();
				}
			}
		}

		setPurcOpeDown(up1, up2, insDL, updDL, insIoL, updIoL);
	}
	// 再設定用の紐づけＮＯ
	int _maxInsDtlPegNo = 0;
	int _maxUpdDtlPegNo = 0;
	int _maxDelDtlPegNo = 0;
	int _maxInsIoPegNo = 0;
	int _maxUpdIoPegNo = 0;
	int _maxDelIoPegNo = 0;
	int _maxTempApPegNo = 0;
	// 処理で使用する固有のカラム名
	String _hdrChgFlg = "hdr_chg_flg";
	/**
	 * 仕入実績登録用のオペレーションを実行するための、明細上り電文を設定する。
	 * 変更前確定ＦＬＧ、確定ＦＬＧ、暫定ＦＬＧにより、対象が変動する。
	 * @param up0 上り電文１
	 * @param up1 上り電文２
	 * @param up2 上り電文３
	 * @param insDL 登録用の明細行を格納するリスト
	 * @param updDL 訂正用の明細行を格納するリスト
	 * @param delDL 取消用の明細行を格納するリスト
	 * @param insIoL 登録用の詳細行を格納するリスト
	 * @param updIoL 訂正用の詳細行を格納するリスト
	 * @param delIoL 取消用の詳細行を格納するリスト
	 */
	protected void setUpDtlPurcOpe(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, MCList<Chk01_IoR> up2,
			MCList<Chk01_DtlR> insDL, MCList<Chk01_DtlR>updDL, MCList<Chk01_DtlR>delDL,
			MCList<Chk01_IoR> insIoL, MCList<Chk01_IoR>updIoL, MCList<Chk01_IoR>delIoL) {
		// 未確定→未確定の場合は処理不要
		if (!up0.bef_fix_flg() && !up0.fix_flg()) {
			return;
		}
		// ヘッダを変更しているか判定する
		setHdrChgFlg(up0, up1);
		
		// 詳細取得用のキー
		MCIndexKey ioIdxKey1 = up2.createIndex(Chk01_IoR.$dtl_peg_no);
		MCIndexKey ioIdxKey2 = up2.createIndex(Chk01_IoR.$arr_act_no);
		
		// 暫定買掛の残数を登録する場合にクリアする項目
		String [] clearDtlCol = new String[]{
			Chk01_DtlR.$purc_act_no,
			Chk01_DtlR.$purc_act_seq,
			Chk01_DtlR.$purc_act_d_no,
			Chk01_DtlR.$purc_act_d_seq,
			Chk01_DtlR.$bd_itm_cd,
			Chk01_DtlR.$bd_itm_sub1,
			Chk01_DtlR.$bd_itm_sub2,
			Chk01_DtlR.$bd_itm_sub3,
			Chk01_DtlR.$bd_sno1,
			Chk01_DtlR.$bd_sno2,
			Chk01_DtlR.$bd_sno3,
			Chk01_DtlR.$bd_sno4,
			Chk01_DtlR.$bd_loc_cd,
			Chk01_DtlR.$bd_lot_no,
			Chk01_DtlR.$bd_sublot_no,
			Chk01_DtlR.$bd_wg_cd,
			Chk01_DtlR.$bd_ctg_cd,
			Chk01_DtlR.$bd_oper_cd,
			Chk01_DtlR.$bd_slo_no,
			Chk01_DtlR.$bd_iv_no,
			Chk01_DtlR.$bd_po_no,
			Chk01_DtlR.$bd_bp_cd,
			Chk01_DtlR.$trd_d_rmrks,
			Chk01_DtlR.$intr_d_rmrks,
			Chk01_DtlR.$sub_char1,
			Chk01_DtlR.$sub_char2,
			Chk01_DtlR.$sub_char3
		};
		String [] clearIoCol = new String [] {
			Chk01_IoR.$sub_char1,
			Chk01_IoR.$sub_char2,
			Chk01_IoR.$sub_char3
		};
		String[] gpCol = new String[] {
				Chk01_DtlR.$po_no,
				Chk01_DtlR.$trd_cd,
				Chk01_DtlR.$temp_ap_flg,
				Chk01_DtlR.$purc_dpt_cd,
				Chk01_DtlR.$purc_usr_cd
		};
		
		// 暫定の場合に電文以外の暫定行を考慮する必要があるので、ワーク用のリストに一旦格納する。
		MCList<Iv_Chk01_DtlR>tmpInsL = MCList.create(Iv_Chk01_DtlR.class);
		MCList<Iv_Chk01_DtlR>tmpUpdL = MCList.create(Iv_Chk01_DtlR.class);
		MCList<Iv_Chk01_DtlR>tmpDelL = MCList.create(Iv_Chk01_DtlR.class);
		// 暫定買掛を新規登録するためのリスト
		MCList<Iv_Chk01_DtlR> tempApDL = MCList.create(Iv_Chk01_DtlR.class);
		MCList<Chk01_IoR> tempApIoL = MCList.create(Chk01_IoR.class);
		
		// 仕入対象外を除いて実行
		MCList<Iv_Chk01_DtlR> tgtL = up1.subList(r -> !r.non_purc_flg());
		// 仕入対象外を除く行がない場合は処理不要
		if (isNull(tgtL) || tgtL.isEmpty()) {
			return;
		}
		for (MCList<Iv_Chk01_DtlR> gpL : tgtL.groupList(gpCol)) {
			gpL.sort(_hdrChgFlg);
			Iv_Chk01_DtlR wkR = gpL.get(0);
			MCList<Iv_Chk01_DtlR> hdrChgL = gpL.subList(r -> r.getBooleanNE(_hdrChgFlg));
			boolean isHdrIns = isSame(hdrChgL.size(), gpL.size());
			// 確定ＦＬＧにより登録、訂正、取消対象かを判定する
			for (Iv_Chk01_DtlR gpR : gpL) {
				boolean allDel = false;
				MCList<Iv_Chk01_DtlR> actL = up1.subList(r -> isSame(gpR.purc_act_no(), r.purc_act_no()));
				MCList<Iv_Chk01_DtlR> delL = actL.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.getBooleanNE(_hdrChgFlg));
				// 仕入実績ＮＯに紐づく全ての行が削除またはヘッダを変更しているか
				if (!isNull(delL) && !delL.isEmpty() && isSame(actL.size(), delL.size())) {
					allDel = true;
				}
				boolean isFix = up0.fix_flg();
				if (isFix && !allDel) {
					// 確定⇒確定
					if (up0.bef_fix_flg() && MAC_DATA_CRUD_TYP.isUPD(up0.data_crud_typ())) {
						if (wkR.isStatusCreate()) {
							tmpInsL.add(gpR);
						}
						else {
							if (gpR.getBooleanNE(_hdrChgFlg) || gpR.isStatusCreate()) {
								gpR.purc_act_no(wkR.purc_act_no());
								gpR.purc_act_seq(wkR.purc_act_seq());
							}
							tmpUpdL.add(gpR);
						}
					}
					// 未確定→確定
					else {
						// 前回登録していない削除行は対象外
						if (isNull(gpR.purc_act_d_no()) && MAC_DATA_CRUD_TYP.isDEL(gpR.data_crud_typ())) {
							continue;
						}
						tmpInsL.add(gpR);
					}
				}
				// 確定→未確定
				// もしくはヘッダに紐づく明細をすべて変更している
				else {
					// 確定時に登録していない登録行は対象外
					if (gpR.isStatusCreate()) {
						continue;
					}
					tmpDelL.add(gpR);
					if (!isFix) {
						gpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						if (isNull(up0.can_ac_dt())) {
							MST_PURC_ACT_R oldActR = getPurcActCache(wkR.purc_act_no(), wkR.purc_act_seq());
							if (!isNull(oldActR) && !oldActR.isEmpty()) {
								up0.can_ac_dt(oldActR.ac_dt());
							}
						}
					}
					if (gpR.isStatusDelete() || !isFix) {
						continue;
					}
					if (isHdrIns) {
						tmpInsL.add(gpR);
					}
					else {
						Iv_Chk01_DtlR updR = gpR.clone();
						updR.setBooleanNE(_hdrChgFlg, false);
						updR.purc_act_no(wkR.purc_act_no());
						updR.purc_act_seq(wkR.purc_act_seq());
						updR.setStatus(CREATE);
						tmpUpdL.add(updR);
					}
				}
			}
		}
		
		// 上り電文から登録行を設定する
		for (MCList<Iv_Chk01_DtlR> gpL : tmpInsL.groupList(gpCol)) {
			Iv_Chk01_DtlR  gpR = gpL.get(0);
			for (Iv_Chk01_DtlR tmpInsR : gpL) {
				MCNumber oldBaseUnitQty = MCNumber.ZERO;
				MST_PURC_ACT_D_R oldActDR = getPurcActDCacheByKey(tmpInsR.purc_act_d_no(), tmpInsR.purc_act_d_seq());
				if (!isNull(oldActDR) && !oldActDR.isEmpty()) {
					oldBaseUnitQty = oldActDR.base_unit_qty();
				}
				MCList<Chk01_IoR> tmpIoL = up2.subList(ioIdxKey1, tmpInsR.peg_no());
				boolean tempApInsFlg = isTempApIns(tmpInsR, oldBaseUnitQty, tmpIoL);
				tmpInsR.ins_peg_no(_maxInsDtlPegNo);
				_maxInsDtlPegNo++;
				Chk01_DtlR insDR = insDL.add();
				MCRow.copyall(insDR, tmpInsR.pd());
				insDR.peg_no(tmpInsR.ins_peg_no());
				insDR.temp_ap_flg(false);
				for (MCList<Chk01_IoR> arrGpIoL : tmpIoL.groupList(Chk01_IoR.$arr_act_no)) {
					for (Chk01_IoR r : arrGpIoL) {
						r.ins_peg_no(_maxInsIoPegNo);
						_maxInsIoPegNo++;
						Chk01_IoR insIoR = insIoL.add();
						MCRow.copyall(insIoR, r);
						insIoR.dtl_peg_no(insDR.peg_no());
						insIoR.peg_no(insIoR.ins_peg_no());
					}
					Chk01_IoR arrGpIoR = arrGpIoL.get(0);
					MCNumber freeQty = getFreeArrActQty(arrGpIoR.arr_act_no(), up2);
					MCNumber gpSumBaseUnitQty = arrGpIoL.sum(Chk01_IoR.$base_unit_qty);
					// 暫定買掛を登録する場合、入荷実績ＮＯをもとに取得した詳細行をもとに差分数量を登録する
					if (tempApInsFlg && freeQty.gt(gpSumBaseUnitQty)) {
						MST_PURC_ACT_IO_R oldTempApR = getPurcActIoCacheByArrActTempAp(arrGpIoR.arr_act_no());
						Chk01_IoR tempIoR = tempApIoL.add();
						copy(tempIoR, oldTempApR, createMap_Chk01_IoR_MST_PURC_ACT_IO_R());
						tempIoR.dtl_peg_no(_maxTempApPegNo);
						tempIoR.trd_unit_qty(0);
						tempIoR.base_unit_qty(freeQty.subtract(gpSumBaseUnitQty));
					}
				}
				if (tempApInsFlg) {
					MST_PURC_ACT_D_R actDR = getPurcActDCacheByKey(tmpInsR.purc_act_d_no(), tmpInsR.purc_act_d_seq());
					Iv_Chk01_DtlR tempApDR = tempApDL.add();
					copy(tempApDR.pd(), actDR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					tempApDR.peg_no(_maxTempApPegNo);
					tempApDR.trd_unit_qty(oldBaseUnitQty.subtract(tmpInsR.base_unit_qty()));
					_maxTempApPegNo++;
				}
			}
			setPurcOpeUpTDelInsOldTempAp(up0, up2, gpR, ioIdxKey2, tempApDL, tempApIoL, delDL, delIoL);
		}
		// 上り電文から訂正行を設定する
		for (MCList<Iv_Chk01_DtlR> gpL : tmpUpdL.groupList(gpCol)) {
			Iv_Chk01_DtlR  gpR = gpL.get(0);
			boolean isInsTempAp = false;
			for (Iv_Chk01_DtlR tmpUpdR : gpL) {
				MCNumber oldBaseUnitQty = MCNumber.ZERO;
				MST_PURC_ACT_D_R oldActDR = getPurcActDCacheByKey(tmpUpdR.purc_act_d_no(), tmpUpdR.purc_act_d_seq());
				if (!isNull(oldActDR) && !oldActDR.isEmpty()) {
					oldBaseUnitQty = oldActDR.base_unit_qty();
				}
				MCList<Chk01_IoR> tmpIoL = up2.subList(ioIdxKey1, tmpUpdR.peg_no());
				boolean tempApInsFlg = isTempApIns(tmpUpdR, oldBaseUnitQty, tmpIoL);
				isInsTempAp = isInsTempAp || tempApInsFlg;
				boolean isHdrChg = tmpUpdR.getBooleanNE(_hdrChgFlg);
				tmpUpdR.upd_peg_no(_maxUpdDtlPegNo);
				_maxUpdDtlPegNo++;
				Chk01_DtlR updDR = updDL.add();
				MCRow.copyall(updDR, tmpUpdR.pd());
				updDR.peg_no(tmpUpdR.upd_peg_no());
				updDR.temp_ap_flg(false);
				// ヘッダを変更している場合
				if (isHdrChg) {
					// 更新行は行削除し、登録行を追加する（DEL/INS)
					updDR.setStatus(DELETE);
					updDR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					tmpUpdR.ins_peg_no(_maxInsDtlPegNo);
					_maxInsDtlPegNo++;
					Chk01_DtlR insDR = insDL.add();
					MCRow.copyall(insDR, tmpUpdR.pd());
					insDR.peg_no(tmpUpdR.ins_peg_no());
					insDR.temp_ap_flg(false);
				}
				int tempIoCnt = 0;
				for (MCList<Chk01_IoR> ioGpL : tmpIoL.groupList(Chk01_IoR.$arr_act_no)) {
					MCList<Chk01_IoR> sameKeyTempApL = tempApIoL.subList(ioR -> isSame(ioR.arr_act_no() , ioGpL.get(0).arr_act_no()));
					MCNumber baseUnitQty = MCNumber.ZERO;
					int delCnt = 0;
					for (Chk01_IoR r : ioGpL) {
						r.upd_peg_no(_maxUpdIoPegNo);
						_maxUpdIoPegNo++;
						Chk01_IoR updIoR = updIoL.add();
						MCRow.copyall(updIoR, r);
						updIoR.dtl_peg_no(updDR.peg_no());
						updIoR.peg_no(updIoR.upd_peg_no());
						updIoR.base_unit_cd(updDR.base_unit_cd());
						if (updIoR.isStatusDelete()) {
							delCnt++;
						}
						else {
							baseUnitQty = baseUnitQty.add(updIoR.base_unit_qty());
						}
						if (tmpUpdR.isStatusCreate()) {
							updIoR.setStatus(CREATE);
						}
						if (isHdrChg) {
							updIoR.setStatus(DELETE);
							updIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							r.ins_peg_no(_maxInsIoPegNo);
							_maxInsIoPegNo++;
							Chk01_IoR insIoR = insIoL.add();
							MCRow.copyall(insIoR, r);
							insIoR.dtl_peg_no(tmpUpdR.ins_peg_no());
							insIoR.peg_no(insIoR.ins_peg_no());
						}
					}
					if (!tempApInsFlg) {
						continue;
					}
					Chk01_IoR wkGpR = ioGpL.get(0);
					MST_PURC_ACT_IO_R ioR = getPurcActIoCacheByKey(wkGpR.purc_act_io_no(), wkGpR.purc_act_io_seq());
					MCNumber arrActQty = getFreeArrActQty(wkGpR.arr_act_no(), up2);
					Chk01_IoR sameKeyR = Chk01_IoR.create();
					boolean isSameKeyExists = false;
					// 既にほかの行で計上済の場合、計上済の行の数量を採用する
					if (!isNull(sameKeyTempApL) && !sameKeyTempApL.isEmpty()) {
						isSameKeyExists = true;
						sameKeyR = sameKeyTempApL.get(0);
						arrActQty = sameKeyR.base_unit_qty();
					}
					Chk01_IoR tempIoR = Chk01_IoR.create();
					copy(tempIoR, ioR, createMap_Chk01_IoR_MST_PURC_ACT_IO_R());
					// 入荷実績に紐づく詳細行を全て行削除する場合
					if (isSame(delCnt, ioGpL.size())) {
						tempIoR.base_unit_qty(arrActQty);
					}
					// 入荷実績の数量＞今回登録対象の数量の場合
					else if (arrActQty.gt(baseUnitQty)) {
						tempIoR.base_unit_qty(arrActQty.subtract(baseUnitQty));
						if (isSameKeyExists) {
							sameKeyR.base_unit_qty(tempIoR.base_unit_qty());
							continue;
						}
					}
					else {
						if (isSameKeyExists) {
							sameKeyR.base_unit_qty(0);
						}
						continue;
					}
					MCList<Iv_Chk01_DtlR> wkL = tempApDL.subList(r -> isSame(ioR.purc_act_d_no(), r.purc_act_d_no()) && isSame(ioR.purc_act_d_seq(), r.purc_act_d_seq()));
					// 設定済の明細があればそちらに紐づける
					if (isNull(wkL) || wkL.isEmpty()) {
						tempIoR.dtl_peg_no(_maxTempApPegNo);
						tempIoCnt++;
					}
					else {
						Iv_Chk01_DtlR wkR = wkL.get(0);
						tempIoR.dtl_peg_no(wkR.peg_no());
					}
					tempApIoL.add(tempIoR);
				}
				if (tempIoCnt > 0) {
					MST_PURC_ACT_D_R actDR = getPurcActDCacheByKey(tmpUpdR.purc_act_d_no(), tmpUpdR.purc_act_d_seq());
					Iv_Chk01_DtlR tempApDR = tempApDL.add();
					copy(tempApDR.pd(), actDR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					tempApDR.peg_no(_maxTempApPegNo);
					_maxTempApPegNo++;
				}
			}
			// 暫定買掛の登録対象がある場合だけ、古い暫定買掛の削除を行う
			if (isInsTempAp) {
				setPurcOpeUpTDelInsOldTempAp(up0, up2, gpR, ioIdxKey2, tempApDL, tempApIoL, delDL, delIoL);
			}
		}
		
		// 上り電文から取消行を設定する
		for (MCList<Iv_Chk01_DtlR> gpL : tmpDelL.groupList(gpCol)) {
			Iv_Chk01_DtlR  gpR = gpL.get(0);
			boolean isInsTempAp = false;
			for (Iv_Chk01_DtlR tmpDelR : gpL) {
				MST_PURC_ACT_D_R oldActDR = getPurcActDCacheByKey(tmpDelR.purc_act_d_no(), tmpDelR.purc_act_d_seq());
				// 確定→未確定に変更した際、画面側で仕入実績項目がクリアされるため、登録済の値を補完
				if (!isNull(oldActDR) && !oldActDR.isEmpty()) {
					tmpDelR.sync_flg(oldActDR.sync_flg());
				}
				Chk01_DtlR delDR = delDL.add();
				MCRow.copyall(delDR, tmpDelR.pd());
				delDR.peg_no(_maxDelDtlPegNo);
				_maxDelDtlPegNo++;
				MCList<Chk01_IoR> tmpIoL = up2.subList(ioIdxKey1, tmpDelR.peg_no());
				tmpIoL.sort(Chk01_IoR.$arr_act_no);
				int tempIoCnt = 0;
				boolean tempApInsFlg = isTempApIns(tmpDelR, tmpDelR.trd_unit_qty(), tmpIoL);
				String befArrActNo = null;
				for (Chk01_IoR r : tmpIoL) {
					MCList<Chk01_IoR> sameKeyTempApL = tempApIoL.subList(ioR -> isSame(ioR.arr_act_no() , r.arr_act_no()));
					Chk01_IoR delIoR = delIoL.add();
					MCRow.copyall(delIoR, r);
					delIoR.dtl_peg_no(delDR.peg_no());
					delIoR.peg_no(_maxDelIoPegNo);
					_maxDelIoPegNo++;
					// 暫定買掛使用の場合
					if (tempApInsFlg) {
						// ループ内で入荷実績NOを処理済なら追加しない
						if (isSame(befArrActNo, r.arr_act_no())) {
							continue;
						}
						isInsTempAp = true;
						MCNumber arrActQty = getFreeArrActQty(r.arr_act_no(), up2);
						Chk01_IoR sameKeyR = Chk01_IoR.create();
						boolean isSameKeyExists = false;
						// 既にほかの行で計上済の場合、計上済の行の数量を採用する
						if (!isNull(sameKeyTempApL) && !sameKeyTempApL.isEmpty()) {
							isSameKeyExists = true;
							sameKeyR = sameKeyTempApL.get(0);
							arrActQty = sameKeyR.base_unit_qty();
						}
						MST_PURC_ACT_IO_R ioR = getPurcActIoCacheByKey(delIoR.purc_act_io_no(), delIoR.purc_act_io_seq());
						Chk01_IoR tempIoR = delIoR.clone();
						tempIoR.base_unit_qty(arrActQty);
						if (isSameKeyExists) {
							sameKeyR.base_unit_qty(tempIoR.base_unit_qty());
							continue;
						}
						MCList<Iv_Chk01_DtlR> wkL = tempApDL.subList(wkR -> isSame(ioR.purc_act_d_no(), wkR.purc_act_d_no()) && isSame(ioR.purc_act_d_seq(), wkR.purc_act_d_seq()));
						// 設定済の明細があればそちらに紐づける
						if (isNull(wkL) || wkL.isEmpty()) {
							tempIoR.dtl_peg_no(_maxTempApPegNo);
							tempIoCnt++;
						}
						else {
							Iv_Chk01_DtlR wkR = wkL.get(0);
							tempIoR.dtl_peg_no(wkR.peg_no());
						}
						tempApIoL.add(tempIoR);
					}
					befArrActNo = r.arr_act_no();
				}
				if (tempIoCnt > 0) {
					MST_PURC_ACT_D_R actDR = getPurcActDCacheByKey(tmpDelR.purc_act_d_no(), tmpDelR.purc_act_d_seq());
					Iv_Chk01_DtlR tempApDR = tempApDL.add();
					copy(tempApDR.pd(), actDR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					tempApDR.peg_no(_maxTempApPegNo);
					_maxTempApPegNo++;
				}
			}
			// 暫定買掛の登録対象がある場合だけ、古い暫定買掛の削除を行う
			if (isInsTempAp) {
				setPurcOpeUpTDelInsOldTempAp(up0, up2, gpR, ioIdxKey2, tempApDL, tempApIoL, delDL, delIoL);
			}
		}
		
		MCIndexKey tempApIoIdxKey = tempApIoL.createIndex(Chk01_IoR.$dtl_peg_no);
		// 暫定買掛登録対象行をもとに登録行を設定する
		if (!isNull(tempApDL) && !tempApDL.isEmpty()) {
			MCList<MST_PURC_ACT_D_R> oldTempApActDL =getOldTempAp(tempApDL);
			MCIndexKey oldTempApIdx = oldTempApActDL.createIndex(MST_PURC_ACT_D_R.$purc_schd_no, MST_PURC_ACT_IO_R.$arr_act_no);
			for (Iv_Chk01_DtlR tempApDR : tempApDL) {
				MCList<Chk01_IoR> ioL = tempApIoL.subList(tempApIoIdxKey, tempApDR.peg_no());
				MST_PURC_ACT_D_R oldActDR =MST_PURC_ACT_D_R.create();
				// 入荷実績NO単位でグルーピングする
				MCList<Chk01_IoR> [] gpLByArrAct = ioL.groupList(Chk01_IoR.$arr_act_no);
				// 詳細の設定
				for (MCList<Chk01_IoR>wkIoL : gpLByArrAct) {
					Iv_Chk01_DtlR insIoR = tempApDR.clone();
					Chk01_IoR wkIoR = wkIoL.get(0);
					if (isNull(oldActDR)|| oldActDR.isEmpty()) {
						oldActDR = oldTempApActDL.getFirst(oldTempApIdx, insIoR.purc_schd_no(), wkIoR.arr_act_no());
					}
					MCNumber ioQty = wkIoL.sum(Chk01_IoR.$base_unit_qty);
					if (ioQty.isNegative() || ioQty.isZero()) {
						continue;
					}
					MST_ARR_ACT_R arrActR = getArrActCache(wkIoR.arr_act_no());
					Chk01_IoR ioR = Chk01_IoR.create();
					MCRow.copyall(ioR, wkIoR);
					ioR.itm_cd(insIoR.itm_cd());
					ioR.itm_sub1(insIoR.itm_sub1());
					ioR.itm_sub2(insIoR.itm_sub2());
					ioR.itm_sub3(insIoR.itm_sub3());
					// 画面で設定した項目をクリアする
					ioR.clear(clearIoCol);
					// 入荷実績時の設定値に戻す
					copy(ioR, arrActR , createMap_Chk01_IoR_MST_ARR_ACT_R());
					// 紐づけＮＯの設定
					ioR.dtl_peg_no(_maxInsDtlPegNo);
					ioR.peg_no(_maxInsIoPegNo);
					_maxInsIoPegNo++;
					// 数量をマージする
					ioR.base_unit_qty(ioQty);
					ioR.trd_unit_qty(ioQty);
					ioR.purc_cont_qty(0);
					insIoL.add(ioR);
					// 暫定の明細、詳細は１：１
					copy(insIoR.pd(), oldActDR , createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					insIoR.clear(clearDtlCol);
					insIoR.peg_no(_maxInsDtlPegNo);
					insIoR.sync_flg(false);
					insIoR.temp_ap_flg(true);
					insIoR.base_unit_qty(ioQty);
					insIoR.trd_unit_qty(ioQty);
					insIoR.trd_unit_cd(ioR.trd_unit_cd());
					insIoR.arr_schd_no(arrActR.arr_schd_no());
					insIoR.lot_no(ioR.lot_no());
					insIoR.sublot_no(ioR.sublot_no());
					// 詳細⇒明細へ値をコピー
					insIoR.dlv_loc_cd(wkIoR.dlv_loc_cd());
					insIoR.purc_cont_qty(0);
					insDL.add(insIoR.pd());
					_maxInsDtlPegNo++;
				}
			}
		}
	}
	/**
	 * 割り当て可能な入荷実績数量を取得する
	 * @param arrActNo
	 * @param up2
	 * @return 割り当て可能な入荷実績数量(基準単位)
	 */
	protected MCNumber getFreeArrActQty (String arrActNo, MCList<Chk01_IoR> up2) {
		if (isNull(arrActNo)) {
			return MCNumber.ZERO;
		}
		MCIndexKey up2Key = up2.createIndex(Chk01_IoR.$purc_act_io_no, Chk01_IoR.$purc_act_io_seq);
		MST_ARR_ACT_R arrAcrR = getArrActCache(arrActNo);
		MCList<MST_PURC_ACT_IO_R> oldActIoL = getPurcActIoCacheByArrAct(arrActNo);
		MCNumber arrActQty = arrAcrR.base_unit_qty();
		// 上り電文に紐づかない（別の受領インボイスに使用している）場合、割り当て可能な数量から除外する
		for (MST_PURC_ACT_IO_R oldActIoR : oldActIoL) {
			// 暫定買掛は割り当て可能
			if (oldActIoR.getBooleanNE("temp_ap_flg")) {
				continue;
			}
			Chk01_IoR up2R = up2.getFirst(up2Key, oldActIoR.purc_act_io_no(), oldActIoR.purc_act_io_seq());
			if (isNull(up2R) || up2R.isEmpty()) {
				arrActQty = arrActQty.subtract(oldActIoR.base_unit_qty());
			}
		}
		return arrActQty;
	}
	/**
	 * 暫定仕入の登録対象か
	 * @return
	 */
	protected boolean isTempApIns(Iv_Chk01_DtlR dR, MCNumber oldBaseUnitQty, MCList<Chk01_IoR> ioL) {
		MCList<Chk01_IoR> arrActExitstL = ioL.subList(r -> !isNull(r.arr_act_no()));
		boolean isArrAct = !isNull(arrActExitstL) && !arrActExitstL.isEmpty();
		return dR.temp_ap_use_flg() 
				&& !isNull(dR.po_d_no()) 
				&& isArrAct
				&& !dR.sync_flg() 
				&& (MAC_DATA_CRUD_TYP.isDEL(dR.data_crud_typ()) || !isSame(oldBaseUnitQty, dR.base_unit_qty()));
	}
	/**
	 * ヘッダ項目を変更しているかを判定する
	 */
	protected void setHdrChgFlg(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		String [] compareCol = new String[] {
			"purc_dpt_cd",
			"purc_usr_cd"
		};
		up1.addBooleanColumn(_hdrChgFlg);
		if (up0.isStatusCreate()) {
			return;
		}
		for (Iv_Chk01_DtlR up1R : up1) {
			MST_PURC_ACT_R oldActR = getPurcActCache(up1R.purc_act_no(), up1R.purc_act_seq());
			if (isNull(oldActR) || oldActR.isEmpty()) {
				up1R.setBooleanNE(_hdrChgFlg, false);
				continue;
			}
			boolean isChg = false;
			for (int i = 0; i < compareCol.length; i++) {
				String col = compareCol[i];
				if (!isSame(up1R.getStringNE(col), oldActR.getStringNE(col))) {
					isChg = true;
					break;
				}
			}
			up1R.setBooleanNE(_hdrChgFlg, isChg);
		}
	}
	/**
	 * 暫定買掛の登録・削除行を設定する
	 */
	protected void setPurcOpeUpTDelInsOldTempAp(Iv_Chk01_HdrR up0 , MCList<Chk01_IoR> up2,
			Iv_Chk01_DtlR  gpR, MCIndexKey ioIdxKey,
			MCList<Iv_Chk01_DtlR> tempApDL, MCList<Chk01_IoR> tempApIoL,
			MCList<Chk01_DtlR>delDL, MCList<Chk01_IoR>delIoL) {
		MCList<Chk01_IoR> addTempApIoL = MCList.create(Chk01_IoR.class);
		MCList<Iv_Chk01_DtlR> addTempApDL = MCList.create(Iv_Chk01_DtlR.class);
		int wkTempApPegNo = _maxTempApPegNo;
		MCIndexKey befIoKey = tempApIoL.createIndex(Chk01_IoR.$arr_act_no);
		MCIndexKey befDtlKey = tempApDL.createIndex(Iv_Chk01_DtlR.$purc_act_d_no, Iv_Chk01_DtlR.$purc_act_d_seq);
		if (isNull(gpR.po_no())) {
			return;
		}
		MCList<MST_PURC_ACT_D_R> oldActDL = getOldPurcActD(up2);
		if (!isNull(oldActDL) && !oldActDL.isEmpty()) {
			MCList<MST_PURC_ACT_D_R> oldActTempApL = oldActDL.subList(r -> r.temp_ap_flg());
			if (isNull(oldActTempApL) || oldActTempApL.isEmpty()) {
				return;
			}
			for (MCList<MST_PURC_ACT_D_R>gpL : oldActTempApL.groupList(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq)) {
				MCList<Chk01_IoR> wkAddTempApIoL = MCList.create(Chk01_IoR.class);
				MCList<Iv_Chk01_DtlR> wkAddTempApDL = MCList.create(Iv_Chk01_DtlR.class);
				boolean isInsTgt = false;
				int befTempApPegNo = wkTempApPegNo;
				for (MST_PURC_ACT_D_R oldTempApR : gpL) {
					MCList<Chk01_DtlR> lateL = delDL.subList(r -> isSame(r.purc_act_d_no(), oldTempApR.purc_act_d_no()) && isSame(r.purc_act_d_seq(), oldTempApR.purc_act_d_seq()));
					// 既に取消対象の明細が存在する場合は処理しない
					if (!isNull(lateL) && !lateL.isEmpty()) {
						continue;
					}
					Chk01_DtlR delDR = delDL.add();
					copy(delDR, oldTempApR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					delDR.peg_no(_maxDelDtlPegNo);
					_maxDelDtlPegNo++;
					MCList<MST_PURC_ACT_IO_R> oldActIoL = getPurcActIoCacheByDKey(oldTempApR.purc_act_d_no(), oldTempApR.purc_act_d_seq());
					int tempIoCnt = 0;
					for (MST_PURC_ACT_IO_R oldActIoR : oldActIoL) {
						Chk01_IoR delIoR = delIoL.add();
						copy(delIoR, oldActIoR, createMap_Chk01_IoR_MST_PURC_ACT_IO_R());
						delIoR.dtl_peg_no(delDR.peg_no());
						delIoR.peg_no(_maxDelIoPegNo);
						_maxDelIoPegNo++;
						MCNumber freeQty = getFreeArrActQty(oldActIoR.arr_act_no(), up2);
						MCList<Chk01_IoR> upIoL = up2.subList(ioIdxKey, delIoR.toArray(ioIdxKey.getKeys()));
						MCNumber upActQty = MCNumber.ZERO;
						if (!isNull(upIoL) && !upIoL.isEmpty()) {
							upActQty = upIoL.sum(Chk01_IoR.$base_unit_qty);
						}
						// 上り電文に存在しない場合は登録対象
						isInsTgt = isInsTgt || isNull(upIoL) || upIoL.isEmpty() || freeQty.gt(upActQty);
						Chk01_IoR befIoR = tempApIoL.getFirst(befIoKey, oldActIoR.arr_act_no());
						if (!isNull(befIoR) && !befIoR.isEmpty()) {
							isInsTgt = true;
							continue;
						}
						Chk01_IoR tempIoR = delIoR.clone();
						tempIoR.base_unit_qty(freeQty.subtract(upActQty));
						MCList<Iv_Chk01_DtlR> wkL = tempApDL.subList(befDtlKey, oldActIoR.purc_act_d_no(), oldActIoR.purc_act_d_seq());
						if (isNull(wkL) || wkL.isEmpty()) {
							tempIoR.dtl_peg_no(wkTempApPegNo);
							tempIoCnt++;
						}
						else {
							// 設定済の明細があればそちらに紐づける
							Iv_Chk01_DtlR wkR = wkL.get(0);
							tempIoR.dtl_peg_no(wkR.peg_no());
						}
						// 入荷実績の計上日が締済の場合は画面の計上日を設定
						// 入荷実績の計上日が締前の場合は入荷実績の計上日を設定
						MST_ARR_ACT_R arrActR = getArrActCache(oldActIoR.arr_act_no());
						if(isPurcCl(arrActR.ac_dt())) {
							delDR.can_ac_dt(up0.ac_dt());
						}
						else {
							delDR.can_ac_dt(arrActR.ac_dt());
						}
						wkAddTempApIoL.add(tempIoR);
					}
					if (tempIoCnt > 0) {
						MST_PURC_ACT_D_R actDR = getPurcActDCacheByKey(oldTempApR.purc_act_d_no(), oldTempApR.purc_act_d_seq());
						Iv_Chk01_DtlR tempApDR = wkAddTempApDL.add();
						copy(tempApDR.pd(), actDR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
						tempApDR.peg_no(wkTempApPegNo);
						wkTempApPegNo++;
					}
				}
				if (isInsTgt) {
					addTempApIoL.addAll(wkAddTempApIoL);
					addTempApDL.addAll(wkAddTempApDL);
				}
				else {
					wkTempApPegNo = befTempApPegNo;
				}
			}
		}
		tempApIoL.addAll(addTempApIoL);
		tempApDL.addAll(addTempApDL);
		_maxTempApPegNo = wkTempApPegNo;
	}
	/**
	 * 入荷実績NOに紐づく仕入実績NOを持つ仕入実績明細を取得する
	 * @param oldPurcActDL
	 */
	protected MCList<MST_PURC_ACT_D_R> getOldPurcActD(MCList<Chk01_IoR> ioL) {
		MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
		MST_PURC_ACT_D_R PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_IO_R PURCACTIO = MST_PURC_ACT_IO_R.create("PURCACTIO");
		MST_PURC_ACT_R PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MCQueryApiBuilder prcAct_bldr = MCQueryApiBuilder.create(PURCACTD);
		prcAct_bldr.addSelect(PURCACT.purc_act_no, PURCACT.purc_act_seq);
		prcAct_bldr.addInnerJoin(PURCACT,
			bracket(
					PURCACTD.purc_act_no.eq(PURCACT.purc_act_no)
					.and(PURCACTD.purc_act_seq.eq(PURCACT.purc_act_seq))
			));
		prcAct_bldr.addInnerJoin(PURCACTIO,
			bracket(
					PURCACTD.purc_act_d_no.eq(PURCACTIO.purc_act_d_no)
					.and(PURCACTD.purc_act_d_seq.eq(PURCACTIO.purc_act_d_seq))
			));
		prcAct_bldr.setGroupBy(PURCACT.purc_act_no, PURCACT.purc_act_seq);
		prcAct_bldr.addWhereWithAnd(PURCACTIO.arr_act_no.eq(bind("arr_act_no")));
		prcAct_bldr.addWhereWithAnd(PURCACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBEL2210_MST_PURC_ACT_S05", purcActL, prcAct_bldr, ioL);
		
		MCList<MST_PURC_ACT_D_R> oldPurcActDL = MCList.create(MST_PURC_ACT_D_R.class);
		MCQueryApiBuilder prcActD_bldr = MCQueryApiBuilder.create(PURCACTD);
		prcActD_bldr.addWhereWithAnd(PURCACTD.purc_act_no.eq(bind("purc_act_no")));
		prcActD_bldr.addWhereWithAnd(PURCACTD.purc_act_seq.eq(bind("purc_act_seq")));
		dbSelect("MSBEL2210_MST_PURC_ACT_D_S02", oldPurcActDL, prcActD_bldr, purcActL);
		
		return oldPurcActDL;
	}
	/**
	 * 同一仕入予定NOを持つ暫定買掛の無効・新規伝票を取得する。
	 * @param tempApDL
	 */
	protected MCList<MST_PURC_ACT_D_R> getOldTempAp(MCList<Iv_Chk01_DtlR> tempApDL) {
		MCList<MST_PURC_ACT_D_R> oldTempApActDL = MCList.create(MST_PURC_ACT_D_R.class);
		oldTempApActDL.addStringColumn("arr_act_no");
		oldTempApActDL.addStringColumn("trd_cd");
		oldTempApActDL.addStringColumn("purc_dpt_cd");
		oldTempApActDL.addStringColumn("purc_usr_cd");
		MST_PURC_ACT_D_R PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_IO_R PURCACTIO = MST_PURC_ACT_IO_R.create("PURCACTIO");
		MST_PURC_ACT_R PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MCQueryApiBuilder prcActD_bldr = MCQueryApiBuilder.create(PURCACTD);
		prcActD_bldr.removeSelect(PURCACTD.po_no);
		prcActD_bldr.addSelect(
				PURCACT.trd_cd,
				PURCACT.purc_dpt_cd,
				PURCACT.purc_usr_cd,
				PURCACT.po_no,
				PURCACTIO.arr_act_no);
		prcActD_bldr.addInnerJoin(PURCACT,
			bracket(
					PURCACTD.purc_act_no.eq(PURCACT.purc_act_no)
					.and(PURCACTD.purc_act_seq.eq(PURCACT.purc_act_seq))
			));
		prcActD_bldr.addInnerJoin(PURCACTIO,
				bracket(
						PURCACTD.purc_act_d_no.eq(PURCACTIO.purc_act_d_no)
						.and(PURCACTD.purc_act_d_seq.eq(PURCACTIO.purc_act_d_seq))
				));
		prcActD_bldr.setWhere(PURCACTD.purc_schd_no.eq(bind("purc_schd_no")));
		prcActD_bldr.addConstWhereWithAnd(PURCACTD.temp_ap_flg.eq(value(true)));
		prcActD_bldr.addConstWhereWithAnd(MAC_SLIP_STS_TYP$IS_CAN(PURCACT.slip_sts_typ).eq(value(false)));
		prcActD_bldr.setOrderByDesc(PURCACTD.purc_act_d_no, PURCACTD.purc_act_d_seq);
		dbSelect("MSBEL2210_MST_PURC_ACT_D_S03", oldTempApActDL, prcActD_bldr, tempApDL);
		
		return oldTempApActDL;
	}
	protected void setPurcOpeDown (MCList<Iv_Chk01_DtlR> up1, MCList<Chk01_IoR> up2,
			MCList<Chk01_DtlR> insDL, MCList<Chk01_DtlR>updDL,
			MCList<Chk01_IoR> insIoL, MCList<Chk01_IoR>updIoL) {
			MCIndexKey insDIdx = insDL.createIndex(Chk01_DtlR.$peg_no);
			MCIndexKey insIoIdx = insIoL.createIndex(Chk01_IoR.$peg_no);
			MCIndexKey updDIdx = updDL.createIndex(Chk01_DtlR.$peg_no);
			MCIndexKey updIoIdx = updIoL.createIndex(Chk01_IoR.$peg_no);
			
			// 戻し用のキー
			String[] colsSrcD = new String[] {Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_seq, Chk01_DtlR.$purc_act_rev};
			String[] colsIo = new String[] {Chk01_IoR.$purc_act_io_no};
			String[] colsDestD = new String[] {Iv_Chk01_DtlR.$purc_act_d_no, Iv_Chk01_DtlR.$purc_act_no, Iv_Chk01_DtlR.$purc_act_seq, Iv_Chk01_DtlR.$purc_act_rev};
			
			for (Iv_Chk01_DtlR up1R : up1.subList(r -> !isNull(r.ins_peg_no()) || !isNull(r.upd_peg_no()))) {
				Chk01_DtlR downR = null;
				if (!isNull(up1R.ins_peg_no())) {
					downR = insDL.getFirst(insDIdx, up1R.ins_peg_no());
				}
				else {
					downR = updDL.getFirst(updDIdx, up1R.upd_peg_no());
				}
				up1R.setValues(colsDestD, downR, colsSrcD);
			}
			for (Chk01_IoR up2R : up2.subList(r -> !isNull(r.ins_peg_no()) || !isNull(r.upd_peg_no()))) {
				Chk01_IoR downR = null;
				if (!isNull(up2R.ins_peg_no())) {
					downR = insIoL.getFirst(insIoIdx, up2R.ins_peg_no());
				}
				else {
					downR = updIoL.getFirst(updIoIdx, up2R.upd_peg_no());
				}
				up2R.setValues(colsIo, downR, colsIo);
			}
	}
	@Override
	protected void setPurcChk03Up(MSBDL_PurcActRegService.Purc_Chk03 ope, Chk01_HdrR up0, MCList<Chk01_DtlR>up1, MCList<Chk01_IoR>up2) {
		Purc_Chk03_HdrR baseHdrR = Purc_Chk03_HdrR.create();
		copy(baseHdrR, up0, createMap_Purc_Chk03_HdrR_Chk01_HdrR());
		MCList<Purc_Chk03_HdrR> hdrL = MCList.create(Purc_Chk03_HdrR.class);
		
		String[] gpCol = new String[] {
				Chk01_DtlR.$po_no,
				Chk01_DtlR.$purc_act_no,
				Chk01_DtlR.$trd_cd,
				Chk01_DtlR.$temp_ap_flg,
				Chk01_DtlR.$purc_dpt_cd,
				Chk01_DtlR.$purc_usr_cd
		};
		String[] hdrClearCol = new String[] {
			Chk01_HdrR.$trd_rmrks,
			Chk01_HdrR.$intr_rmrks,
			Chk01_HdrR.$sub_char1,
			Chk01_HdrR.$sub_char2,
			Chk01_HdrR.$sub_char3
		};
		up1.sort(SortType.ASC, Chk01_DtlR.$data_crud_typ);
		for (MCList<Chk01_DtlR> gpL : up1.groupList(gpCol)) {
			Purc_Chk03_HdrR hdrR = baseHdrR.clone();
			Chk01_DtlR gpR = gpL.get(0);
			hdrR.trd_cd(gpR.trd_cd());
			hdrR.purc_act_no(gpR.purc_act_no());
			hdrR.purc_act_seq(gpR.purc_act_seq());
			hdrR.po_no(gpR.po_no());
			hdrR.purc_dpt_cd(gpR.purc_dpt_cd());
			hdrR.purc_usr_cd(gpR.purc_usr_cd());
			hdrR.wg_cd(gpR.wg_cd());
			hdrR.addBooleanColumn(Chk01_DtlR.$temp_ap_flg, gpR.temp_ap_flg());
			if (gpR.temp_ap_flg()) {
				hdrR.rcpt_iv_mng_no(null);
				hdrR.rcpt_iv_no(null);
				hdrR.rcpt_iv_rev(null);
				gpL.setBoolean(Chk01_DtlR.$sync_flg, false);
			}
			else {
				hdrR.fix_flg(true);
			}
			hdrL.add(hdrR);
			// 登録かつ暫定買掛の場合、ヘッダの項目を初期化する
			if (up0.isStatusCreate() && gpR.temp_ap_flg()) {
				hdrR.clear(hdrClearCol);
			}
		}
		
		setPegNo(Purc_Chk03_HdrR.$peg_no, hdrL);
		ope.up0().addAll(hdrL);
		MCIndexKey hdrIdx = hdrL.createIndex(gpCol);
		MCIndexKey ioIdx = up2.createIndex(Chk01_IoR.$dtl_peg_no);
		MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_IoR> ioL = MCList.create(Chk01_IoR.class);
		up1.addNumberColumn("hdr_peg_no");
		for (Chk01_DtlR r : up1) {
			Purc_Chk03_HdrR hdrR = hdrL.getFirst(hdrIdx, r.toArray(gpCol));
			r.setNumberNE("hdr_peg_no", hdrR.peg_no());
			dtlL.add(r);
			MCList<Chk01_IoR> tmpIoL = up2.subList(ioIdx, r.peg_no());
			ioL.addAll(tmpIoL);
		}
		addAll(ope.up1(), dtlL, createMap_Purc_Chk03_DtlR_Chk01_DtlR());
		addAll(ope.up2(), ioL, createMap_Purc_Chk03_IoR_Chk01_IoR());
		// 入荷実績作成FLGをオン
		ope.up3().arr_act_flg(true);
		// 受払実績作FLG
		ope.up3().io_make_flg(isPurcActIoReg());
		// 受領インボイス登録FLGをオン
		ope.up3().rcpt_iv_form_flg(true);
	}
	@Override
	protected void setPurcChk03Down(MSBDL_PurcActRegService.Purc_Chk03 ope, Chk01_HdrR hdrR,
			MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		
		MCList<Purc_Chk03_HdrR> upH = ope.up0().clone();
		MCList<Purc_Chk03_DtlR> upD = ope.up1().clone();
		MCList<Purc_Chk03_IoR> upIo = ope.up2().clone();
	
		String [] copyDVal = new String[] {
				Purc_Chk03_DtlR.$purc_dtl_upd_flg
		};
		String [] copyIoVal = new String[] {
				Purc_Chk03_IoR.$outsrc_act_flg
		};
		copyByPegNo(upD, copyDVal, ope.down1(), copyDVal);
		copyByPegNo(upIo, copyIoVal, ope.down2(), copyIoVal);
		
		addPurcActSvHdrCache(upH);
		addPurcActSvDtlCache(upD);
		addPurcActSvIoCache(upIo);
		super.setPurcChk03Down(ope, hdrR, dtlL, ioL);
	}
	protected void setDownPurcActRegSvCmn(MCList<Purc_Ins01_HdrR> down0,
			MCList<Purc_Ins01_DtlR>down1, MCList<Purc_Ins01_IoR>down2, 
			Chk01_HdrR up0, MCList<Chk01_DtlR> up1, MCList<Chk01_IoR> up2){
		MCIndexKey down1Key = down1.createIndex(Purc_Ins01_DtlR.$hdr_peg_no);
		MCIndexKey up1Key1 = up1.createIndex(Chk01_DtlR.$ins_peg_no);
		MCIndexKey up1Key2 = up1.createIndex(Chk01_DtlR.$upd_peg_no);
		for (Purc_Ins01_HdrR hR : down0) {
			// 仕入実績NO, 明細NO, 実績受払NOを画面に戻す
			MCList<Purc_Ins01_DtlR> dL =down1.subList(down1Key, hR.peg_no());
			for (Purc_Ins01_DtlR dR : dL) {
				MCIndexKey key = hR.isStatusCreate() ? up1Key1 : up1Key2;
				Chk01_DtlR up1R = up1.getFirst(key, dR.peg_no());
				if (isNull(up1R) || up1R.isEmpty()) {
					continue;
				}
				up1R.purc_act_no(hR.purc_act_no());
				up1R.purc_act_seq(hR.purc_act_seq());
				up1R.purc_act_rev(hR.purc_act_rev());
			}
		}
		
		String[] destColsD = new String[] {Chk01_DtlR.$purc_act_d_no};
		String[] srcColsD = new String[] {Purc_Ins01_DtlR.$purc_act_d_no};
		copyByPegNo(up1, destColsD, down1, srcColsD);
		
		String[] destColsIo = new String[] {Chk01_IoR.$purc_act_io_no};
		String[] srcColsIo = new String[] {Purc_Ins01_IoR.$purc_act_io_no};
		copyByPegNo(up2, destColsIo, down2, srcColsIo);
	}
	/**
	 * 受領インボイス登録サービスの更新前チェックを実行する
	 */
	protected void callRcptIvChkCmn(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
		
		MSBEL_RcptIvRegService.RcptIv_Chk01 ope = MSBEL_RcptIvRegService.crtRcptIv_Chk01();
		
		RcptIv_Chk01_HdrR hdrR = RcptIv_Chk01_HdrR.create();
		
		Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR,Iv_Chk01_HdrR> hdrRMap = createMap_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR();
		
		copy(hdrR, up0, hdrRMap);
		ope.up0().add(hdrR);
		
		addAll(ope.up1(), up1, createMap_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR(up0));
		addRcptIvMap(ope.up2(), up0, up1, up2);
		
		ope.exec();
		
		copyErrFlg(up0, ope.down0().get(0));
		copyErrFlg(up1, ope.down1());
		
		setDownRcptIvSrvChk(up1, ope);
	}
	protected void addRcptIvMap(
		MCList<RcptIv_Chk01_MapR> mapL,
		Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, MCList<Chk01_IoR> up2) {
		if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(up0.rcpt_iv_src_typ())) {
			for (Iv_Chk01_DtlR r : up1) {
				RcptIv_Chk01_MapR mapR = mapL.add();
				mapR.dtl_peg_no(r.peg_no());
				mapR.rcpt_iv_d_no(r.rcpt_iv_d_no());
				mapR.arr_schd_no(r.arr_schd_no());
				mapR.trd_unit_qty(r.trd_unit_qty());
				// 以下の項目は基準単位数量算出用
				mapR.itm_cd(r.itm_cd());
				mapR.itm_sub1(r.itm_sub1());
				mapR.itm_sub2(r.itm_sub2());
				mapR.itm_sub3(r.itm_sub3());
				mapR.trd_unit_cd(r.trd_unit_cd());
				
				mapR.setAttributes(r);
			}
		}
		else if (MSC_RCPT_IV_SRC_TYP.isARR_ACT(up0.rcpt_iv_src_typ())) {
			MCList<Chk01_IoR> tmpUp2L = up2.subList(r -> !r.isStatusDelete());
			MCIndexKey idx  = tmpUp2L.createIndex(Chk01_IoR.$dtl_peg_no);
			
			// 確定オンのときに詳細枠で行コピーできる
			// そのとき明細に対して同じ入荷実績ＮＯが複数できることがある
			for (Iv_Chk01_DtlR dtlR : up1) {
				for (MCList<Chk01_IoR> gl :
						tmpUp2L.subList(idx, dtlR.peg_no()).groupList(Chk01_IoR.$arr_act_no)) {
					Chk01_IoR r = gl.get(0);
					
					RcptIv_Chk01_MapR mapR = mapL.add();
					mapR.dtl_peg_no(dtlR.peg_no());
					mapR.rcpt_iv_d_no(dtlR.rcpt_iv_d_no());
					mapR.arr_act_no(r.arr_act_no());
					mapR.trd_unit_qty(gl.sum(Chk01_IoR.$trd_unit_qty));
					// 以下の項目は基準単位数量算出用
					mapR.itm_cd(r.itm_cd());
					mapR.itm_sub1(r.itm_sub1());
					mapR.itm_sub2(r.itm_sub2());
					mapR.itm_sub3(r.itm_sub3());
					mapR.trd_unit_cd(r.trd_unit_cd());
					
					mapR.setAttributes(r);
				}
			}
		}
		setPegNo(mapL);
	}
	protected void setDownRcptIvSrvChk(MCList<Iv_Chk01_DtlR> up1, MSBEL_RcptIvRegService.RcptIv_Chk01 ope) {
		String[] destColsD = new String[] {Iv_Chk01_DtlR.$ap_dpt_nm,
				Iv_Chk01_DtlR.$purc_dpt_nm,
				Iv_Chk01_DtlR.$bd_dpt_nm};
		String[] srcColsD = new String[] {RcptIv_Chk01_DtlR.$ap_dpt_nm,
				RcptIv_Chk01_DtlR.$purc_dpt_nm,
				RcptIv_Chk01_DtlR.$bd_dpt_nm};
		
		copyByPegNo(up1, destColsD, ope.down1(), srcColsD);
	}
	@Override
	protected void setBaseUnitQtyAndPackUnitQty(MCList<Chk01_DtlR> dtlL, MCList<Chk01_IoR> ioL) {
		MCList<Chk01_DtlR> tempApDL = dtlL.subList(r -> r.temp_ap_flg());
		MCIndexKey tempIoIdx = ioL.createIndex(Chk01_IoR.$dtl_peg_no);
		for (Chk01_DtlR tempApDR : tempApDL) {
			MCNumber dtlTrdUnitQty = rvrsBaseUnitConv(tempApDR.base_unit_qty(), tempApDR.trd_unit_conv_base_qty(), tempApDR.trd_unit_conv_qty(), tempApDR.trd_unit_dec_place(), tempApDR.trd_unit_rnd_typ());
			tempApDR.trd_unit_qty(dtlTrdUnitQty);
			MCList<Chk01_IoR> tempApIoL = ioL.subList(tempIoIdx, tempApDR.peg_no());
			for (Chk01_IoR tempApIoR : tempApIoL) {
				MCNumber ioTrdUnitQty = rvrsBaseUnitConv(tempApIoR.base_unit_qty(), tempApIoR.trd_unit_conv_base_qty(), tempApIoR.trd_unit_conv_qty(), tempApIoR.trd_unit_dec_place(), tempApIoR.trd_unit_rnd_typ());
				tempApIoR.trd_unit_qty(ioTrdUnitQty);
			}
		}
		super.setBaseUnitQtyAndPackUnitQty(dtlL, ioL);
		MCIndexKey ioKey = ioL.createIndex(Chk01_IoR.$dtl_peg_no);
		for (Chk01_DtlR dtlR : dtlL.subList(r -> r.temp_ap_flg())) {
			MCList<Chk01_IoR> tempIoL = ioL.subList(ioKey, dtlR.peg_no());
			dtlR.base_unit_qty(tempIoL.sum(Chk01_IoR.$base_unit_qty));
			MCNumber trdUnitQty = rvrsBaseUnitConv(dtlR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ());
			dtlR.trd_unit_qty(trdUnitQty);
		}
	}
	/**
	 * 通貨情報を設定する（ヘッダ）
	 */
	protected void setHdrCur(Srch01_HdrR down0) {
		// 基準通貨情報
		down0.base_cur_cd(getBaseCur().cur_cd());
		down0.base_cur_nm(getBaseCur().cur_nm());
		down0.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		down0.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		
		// 納税通貨情報
		down0.ptax_cur_cd(getPtaxCur().cur_cd());
		down0.ptax_cur_nm(getPtaxCur().cur_nm());
		down0.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
		down0.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
	}
	
	protected void setHdrApDptCd(Srch01_HdrR down0) {
		MCList<Srch01_HdrR> list = MCList.create(Srch01_HdrR.class);
		list.add(down0);
		list.addBooleanColumn("no_chk_flg", true);
		
		execDbFuncBatch(
			createSqlId(LOGIC_ID, "MAPA_BP$F_GET_AP_DPT_CD_NE2", "01"),
			MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_AP_DPT_CD_NE2"),
			Srch01_HdrR.$ap_dpt_cd,
			list,
			Srch01_HdrR.$sppl_cd,
			Srch01_HdrR.$asppl_cd,
			down0.fix_flg() ? Srch01_HdrR.$ac_dt : Srch01_HdrR.$iv_dt,
			"no_chk_flg"
		);
	}
	protected void setHdrMstApDptCd(Srch01_HdrR down0) {
		MCList<Srch01_HdrR> list = MCList.create(Srch01_HdrR.class);
		list.add(down0);
		list.addBooleanColumn("no_chk_flg", true);
		
		execDbFuncBatch(
			createSqlId(LOGIC_ID, "MAPA_BP$F_GET_AP_DPT_CD_NE", "01"),
			MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_AP_DPT_CD_NE"),
			Srch01_HdrR.$mst_ap_dpt_cd,
			list,
			Srch01_HdrR.$asppl_cd,
			down0.fix_flg() ? Srch01_HdrR.$ac_dt : Srch01_HdrR.$iv_dt,
			"no_chk_flg"
		);
	}
	/**
	 * データ更新区分設定
	 * @param up0Row ヘッダ上り電文Row
	 * @param up1L 明細上り電文List
	 */
	protected void setDataCrudTyp(Iv_Chk01_HdrR up0Row, MCList<Iv_Chk01_DtlR> up1L) {
		
		if (up0Row.getStatus() == CREATE) {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
		else if (up0Row.getStatus() == MODIFY) {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		else {
			up0Row.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
		
		for (Iv_Chk01_DtlR up1Row : up1L) {
			if (up1Row.getStatus() == CREATE) {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (up1Row.getStatus() == MODIFY) {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else {
				up1Row.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}
	
	@Override
	protected boolean isIvReg() {
		return true;
	}
	
	/**
	 * 仕入締済か判断する
	 */
	protected boolean isPurcCl(MCDate baseDt) {
		MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
		Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
		cndR.ac_dt(baseDt);
		cndR.purc_cls_chk_flg(true);
		op.up0().add(cndR);
		op.up1().no_msg_flg(true);
		op.exec();
		return op.down0().get(0).err_flg();
	}
	
	protected void setInterimMsg(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		for (Iv_Chk01_DtlR dtlR : up1) {
			if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && dtlR.interim_flg() && !up0.err_flg()) {
				if (!up0.fix_flg()) {
					MCMessagePool.add(new MCMessage(dtlR, null, MSBEL1134, toDispGUIIndex(dtlR)));
				}
			}
		}
	}
	
// Map
	protected Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR,Iv_Chk01_HdrR> createMap_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR() {
		return new Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<RcptIv_Chk01_HdrR, Iv_Chk01_HdrR>();
	}

	public class Map_RcptIv_Chk01_HdrR_Iv_Chk01_HdrR<D extends RcptIv_Chk01_HdrR, S extends Iv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcptIv_Chk01_HdrR.$data_crud_typ, Iv_Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(RcptIv_Chk01_HdrR.$rcpt_iv_mng_no, Iv_Chk01_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(RcptIv_Chk01_HdrR.$rcpt_iv_rev, Iv_Chk01_HdrR.$rcpt_iv_rev);
			addColumnPathMap(RcptIv_Chk01_HdrR.$rcpt_iv_no, Iv_Chk01_HdrR.$rcpt_iv_no);
			addColumnPathMap(RcptIv_Chk01_HdrR.$rcpt_iv_src_typ, Iv_Chk01_HdrR.$rcpt_iv_src_typ);
			addColumnPathMap(RcptIv_Chk01_HdrR.$fix_flg, Iv_Chk01_HdrR.$fix_flg);
			addColumnPathMap(RcptIv_Chk01_HdrR.$sppl_cd, Iv_Chk01_HdrR.$sppl_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$iv_dt, Iv_Chk01_HdrR.$iv_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$purc_schd_dt, Iv_Chk01_HdrR.$purc_schd_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$purc_ac_schd_dt, Iv_Chk01_HdrR.$purc_ac_schd_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$purc_dt, Iv_Chk01_HdrR.$purc_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$ac_dt, Iv_Chk01_HdrR.$ac_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_id_cd, Iv_Chk01_HdrR.$in_to_id_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_id_nm, Iv_Chk01_HdrR.$in_to_id_nm);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntct_dpt, Iv_Chk01_HdrR.$in_to_cntct_dpt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntct_psn, Iv_Chk01_HdrR.$in_to_cntct_psn);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_zip_cd, Iv_Chk01_HdrR.$in_to_zip_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr1, Iv_Chk01_HdrR.$in_to_addr1);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr2, Iv_Chk01_HdrR.$in_to_addr2);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr3, Iv_Chk01_HdrR.$in_to_addr3);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr4, Iv_Chk01_HdrR.$in_to_addr4);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_tel, Iv_Chk01_HdrR.$in_to_tel);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_fax, Iv_Chk01_HdrR.$in_to_fax);
			addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntry_cd, Iv_Chk01_HdrR.$in_to_cntry_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$trnspt_cd, Iv_Chk01_HdrR.$trnspt_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$vssl_flght, Iv_Chk01_HdrR.$vssl_flght);
			addColumnPathMap(RcptIv_Chk01_HdrR.$load_port_cd, Iv_Chk01_HdrR.$load_port_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$etd_dt, Iv_Chk01_HdrR.$etd_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$dschrg_port_cd, Iv_Chk01_HdrR.$dschrg_port_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$eta_dt, Iv_Chk01_HdrR.$eta_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$via_port_cd, Iv_Chk01_HdrR.$via_port_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$via_schd_dt, Iv_Chk01_HdrR.$via_schd_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_cd1, Iv_Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_rmrks1, Iv_Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_cd2, Iv_Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_rmrks2, Iv_Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_cd3, Iv_Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(RcptIv_Chk01_HdrR.$tterm_rmrks3, Iv_Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(RcptIv_Chk01_HdrR.$trd_cur_cd, Iv_Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$ptax_cur_cd, Iv_Chk01_HdrR.$ptax_cur_cd);
			addColumnPathMap(RcptIv_Chk01_HdrR.$xrate_inpt_flg, Iv_Chk01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(RcptIv_Chk01_HdrR.$xrate, Iv_Chk01_HdrR.$xrate);
			addColumnPathMap(RcptIv_Chk01_HdrR.$ptax_xrate_inpt_flg, Iv_Chk01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(RcptIv_Chk01_HdrR.$ptax_xrate, Iv_Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(RcptIv_Chk01_HdrR.$pay_basis_dt, Iv_Chk01_HdrR.$pay_basis_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$pay_schd_dt, Iv_Chk01_HdrR.$pay_schd_dt);
			addColumnPathMap(RcptIv_Chk01_HdrR.$trd_rmrks, Iv_Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(RcptIv_Chk01_HdrR.$rcpt_iv_rmrks, Iv_Chk01_HdrR.$rcpt_iv_rmrks);
			addColumnPathMap(RcptIv_Chk01_HdrR.$intr_rmrks, Iv_Chk01_HdrR.$rcpt_iv_intr_rmrks);
			addColumnPathMap(RcptIv_Chk01_HdrR.$sub_char1, Iv_Chk01_HdrR.$rcpt_iv_sub_char1);
			addColumnPathMap(RcptIv_Chk01_HdrR.$sub_char2, Iv_Chk01_HdrR.$rcpt_iv_sub_char2);
			addColumnPathMap(RcptIv_Chk01_HdrR.$sub_char3, Iv_Chk01_HdrR.$rcpt_iv_sub_char3);
			addColumnPathMap(RcptIv_Chk01_HdrR.$purc_amt_rnd_typ, Iv_Chk01_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(RcptIv_Chk01_HdrR.$purc_tax_rnd_typ, Iv_Chk01_HdrR.$purc_tax_rnd_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(0);
		}
	}
	protected Map_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR<RcptIv_Chk01_DtlR, Iv_Chk01_DtlR> createMap_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR(Iv_Chk01_HdrR hdr) {
		return new Map_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR<RcptIv_Chk01_DtlR, Iv_Chk01_DtlR>(hdr);
	}

	public class Map_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR<D extends RcptIv_Chk01_DtlR, S extends Iv_Chk01_DtlR> extends MCRowMapper<D,S>{
		protected Iv_Chk01_HdrR _hdr;
		public Map_RcptIv_Chk01_DtlR_Iv_Chk01_DtlR (Iv_Chk01_HdrR hdr) {
			super();
			_hdr = hdr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcptIv_Chk01_DtlR.$peg_no, Iv_Chk01_DtlR.$peg_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$data_crud_typ, Iv_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$rcpt_iv_d_no, Iv_Chk01_DtlR.$rcpt_iv_d_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$purc_schd_no, Iv_Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cd, Iv_Chk01_DtlR.$trd_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_ptn_typ, Iv_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$itm_cd, Iv_Chk01_DtlR.$itm_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub1, Iv_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub2, Iv_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub3, Iv_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(RcptIv_Chk01_DtlR.$itm_nm, Iv_Chk01_DtlR.$itm_nm);
			addColumnPathMap(RcptIv_Chk01_DtlR.$iv_itm_nm, Iv_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(RcptIv_Chk01_DtlR.$purc_id_typ, Iv_Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$purc_rsn_cd, Iv_Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sundry_itm_flg, Iv_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sppl_itm_cd, Iv_Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sppl_itm_nm, Iv_Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno1, Iv_Chk01_DtlR.$sno1);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno2, Iv_Chk01_DtlR.$sno2);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno3, Iv_Chk01_DtlR.$sno3);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno4, Iv_Chk01_DtlR.$sno4);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno1_mng_typ, Iv_Chk01_DtlR.$sno1_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno2_mng_typ, Iv_Chk01_DtlR.$sno2_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno3_mng_typ, Iv_Chk01_DtlR.$sno3_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sno4_mng_typ, Iv_Chk01_DtlR.$sno4_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_cd, Iv_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_qty, Iv_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_cd, Iv_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_qty, Iv_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(RcptIv_Chk01_DtlR.$tax_fix_flg, Iv_Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$tax_cd, Iv_Chk01_DtlR.$tax_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$tax_rate, Iv_Chk01_DtlR.$tax_rate);
			addColumnPathMap(RcptIv_Chk01_DtlR.$upri_not_tgt_flg, Iv_Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$interim_flg, Iv_Chk01_DtlR.$interim_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_upri, Iv_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_proc_upri, Iv_Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_onr_prov_upri, Iv_Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_proc_amt, Iv_Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_onr_prov_amt, Iv_Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_tax_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cur_dscnt_amt, Iv_Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$dscnt_rsn_cd, Iv_Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$wtax_rate, Iv_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(RcptIv_Chk01_DtlR.$maker_cd, Iv_Chk01_DtlR.$maker_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$ap_dpt_cd, Iv_Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$stk_mng_typ, Iv_Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$asset_mng_typ, Iv_Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$xpns_purc_flg, Iv_Chk01_DtlR.$xpns_purc_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$purc_usr_cd, Iv_Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$purc_dpt_cd, Iv_Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_itm_cd, Iv_Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_itm_sub1, Iv_Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_itm_sub2, Iv_Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_itm_sub3, Iv_Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno1, Iv_Chk01_DtlR.$bd_sno1);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno2, Iv_Chk01_DtlR.$bd_sno2);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno3, Iv_Chk01_DtlR.$bd_sno3);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno4, Iv_Chk01_DtlR.$bd_sno4);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_lot_mng_typ, Iv_Chk01_DtlR.$bd_lot_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sublot_mng_typ, Iv_Chk01_DtlR.$bd_sublot_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_lot_no_typ, Iv_Chk01_DtlR.$bd_lot_no_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sublot_no_typ, Iv_Chk01_DtlR.$bd_sublot_no_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno1_mng_typ, Iv_Chk01_DtlR.$bd_sno1_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno2_mng_typ, Iv_Chk01_DtlR.$bd_sno2_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno3_mng_typ, Iv_Chk01_DtlR.$bd_sno3_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sno4_mng_typ, Iv_Chk01_DtlR.$bd_sno4_mng_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_loc_cd, Iv_Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_lot_no, Iv_Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_sublot_no, Iv_Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_dpt_cd, Iv_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_wg_cd, Iv_Chk01_DtlR.$bd_wg_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_ctg_cd, Iv_Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_oper_cd, Iv_Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_slo_no, Iv_Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_iv_no, Iv_Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_po_no, Iv_Chk01_DtlR.$bd_po_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$bd_bp_cd, Iv_Chk01_DtlR.$bd_bp_cd);
			addColumnPathMap(RcptIv_Chk01_DtlR.$po_no, Iv_Chk01_DtlR.$po_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$po_d_no, Iv_Chk01_DtlR.$po_d_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$slo_no, Iv_Chk01_DtlR.$slo_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$slo_d_no, Iv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$intr_d_rmrks, Iv_Chk01_DtlR.$rcpt_iv_intr_d_rmrks);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_d_rmrks, Iv_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sub_char1, Iv_Chk01_DtlR.$rcpt_iv_d_sub_char1);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sub_char2, Iv_Chk01_DtlR.$rcpt_iv_d_sub_char2);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sub_char3, Iv_Chk01_DtlR.$rcpt_iv_d_sub_char3);
			addColumnPathMap(RcptIv_Chk01_DtlR.$rcpt_iv_d_rmrks, Iv_Chk01_DtlR.$rcpt_iv_d_rmrks);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_conv_base_qty, Iv_Chk01_DtlR.$trd_unit_conv_base_qty);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_conv_qty, Iv_Chk01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_dec_place, Iv_Chk01_DtlR.$trd_unit_dec_place);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_dec_place, Iv_Chk01_DtlR.$base_unit_dec_place);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_rnd_typ, Iv_Chk01_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(RcptIv_Chk01_DtlR.$inc_tax_flg, Iv_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$arr_schd_no, Iv_Chk01_DtlR.$arr_schd_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$arr_pr_no, Iv_Chk01_DtlR.$arr_pr_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$dscnt_itm_flg, Iv_Chk01_DtlR.$dscnt_itm_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$abort_flg, Iv_Chk01_DtlR.$schd_abort_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$sync_flg, Iv_Chk01_DtlR.$sync_flg);
			addColumnPathMap(RcptIv_Chk01_DtlR.$mfg_inst_no, Iv_Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_cur_amt, Iv_Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$base_cur_tax_amt, Iv_Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$ptax_cur_amt, Iv_Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(RcptIv_Chk01_DtlR.$ptax_cur_tax_amt, Iv_Chk01_DtlR.$ptax_cur_tax_amt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(0);
			dest.rcpt_iv_mng_no(_hdr.rcpt_iv_mng_no());
			dest.trd_amt_dec_place(_hdr.trd_cur_amt_dec_place());
			dest.trd_upri_dec_place(_hdr.trd_cur_upri_dec_place());
			dest.wtax_amt(src.trd_cur_wtax_amt());
			dest.manual_add_flg(src.manual_add_flg());
			dest.po_trd_unit_cd(src.src_trd_unit_cd());
			dest.po_trd_unit_qty(src.src_trd_unit_qty());
			dest.po_trd_cur_upri(src.src_trd_cur_upri());
			dest.po_trd_cur_dscnt_amt(src.src_trd_cur_dscnt_amt());
			dest.po_trd_cur_proc_upri(src.trd_cur_proc_upri());
			dest.po_trd_cur_onr_prov_upri(src.src_trd_cur_onr_prov_upri());
			dest.po_trd_cur_amt(src.src_trd_cur_amt());
			dest.po_trd_cur_proc_amt(src.src_trd_cur_proc_amt());
			dest.po_trd_cur_onr_prov_amt(src.src_trd_cur_onr_prov_amt());
			dest.po_trd_cur_tax_amt(src.src_trd_cur_tax_amt());
			dest.po_trd_cur_inc_ctax_amt(nvl(src.src_trd_cur_amt(), MCNumber.ZERO).add(nvl(src.trd_cur_tax_amt(), MCNumber.ZERO)));
			dest.po_trd_unit_conv_qty(src.src_trd_unit_conv_qty());
			dest.po_trd_unit_conv_base_qty(src.src_trd_unit_conv_base_qty());
		}
	}
	/**
	 * マッピング定義（ ヘッダ電文から、仕入実績サービスのChk03のヘッダ電文へ）
	 * @return
	 */
	protected Map_Purc_Chk03_HdrR_Chk01_HdrR<Purc_Chk03_HdrR,Chk01_HdrR> createMap_Purc_Chk03_HdrR_Chk01_HdrR() {
		return new Map_Purc_Chk03_HdrR_Chk01_HdrR_add<Purc_Chk03_HdrR, Chk01_HdrR>();
	}
	public class Map_Purc_Chk03_HdrR_Chk01_HdrR_add<D extends Purc_Chk03_HdrR, S extends Chk01_HdrR> extends Map_Purc_Chk03_HdrR_Chk01_HdrR<D,S>{
		@Override
		protected void setupColumnPathMap() {
			super.setupColumnPathMap();
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_mng_no, Chk01_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_no, Chk01_HdrR.$rcpt_iv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_rev, Chk01_HdrR.$rcpt_iv_rev);
			addColumnPathMap(Purc_Chk03_HdrR.$pay_schd_dt, Chk01_HdrR.$pay_schd_dt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!isNull(dest.pay_schd_dt())) {
				dest.pay_basis_dt(null);
			}
		}
	}
	/**
	 * マッピング定義（ 明細電文から、仕入実績サービスのChk03の明細電文へ）
	 * @return
	 */
	@Override
	protected Map_Purc_Chk03_DtlR_Chk01_DtlR<Purc_Chk03_DtlR, Chk01_DtlR> createMap_Purc_Chk03_DtlR_Chk01_DtlR() {
		return new Map_Purc_Chk03_DtlR_Chk01_DtlR_add<Purc_Chk03_DtlR, Chk01_DtlR>();
	}
	public class Map_Purc_Chk03_DtlR_Chk01_DtlR_add<D extends Purc_Chk03_DtlR, S extends Chk01_DtlR> extends Map_Purc_Chk03_DtlR_Chk01_DtlR<D,S>{
		@Override
		protected void setupColumnPathMap() {
			super.setupColumnPathMap();
			addColumnPathMap(Purc_Chk03_DtlR.$rcpt_iv_d_no, Chk01_DtlR.$rcpt_iv_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$intr_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_cont_qty, Chk01_DtlR.$purc_cont_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
			dest.base_unit_accpt_dfct_qty(0);
		}
	}
	@Override
	protected Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR, Chk01_DtlR> createMap_Purc_Ins01_DtlR_Chk01_DtlR() {
		return new Map_Purc_Ins01_DtlR_Chk01_DtlR_add<Purc_Ins01_DtlR, Chk01_DtlR>();
	}
	public class Map_Purc_Ins01_DtlR_Chk01_DtlR_add <D extends Purc_Ins01_DtlR, S extends Chk01_DtlR> extends Map_Purc_Ins01_DtlR_Chk01_DtlR<D, S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(_hdrR.peg_no());
			dest.rcpt_iv_mng_no(_hdrR.rcpt_iv_mng_no());
		}
	}
	protected Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<Purc_Ins01_HdrR,Purc_Chk03_HdrR> createMap_Purc_Ins01_HdrR_Purc_Chk03_HdrR() {
		return new Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<Purc_Ins01_HdrR, Purc_Chk03_HdrR>();
	}

	public class Map_Purc_Ins01_HdrR_Purc_Chk03_HdrR<D extends Purc_Ins01_HdrR, S extends Purc_Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, Purc_Chk03_HdrR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$peg_no, Purc_Chk03_HdrR.$peg_no);
			addColumnPathMap(Purc_Ins01_HdrR.$pa, Purc_Chk03_HdrR.$pa);
			addColumnPathMap(Purc_Ins01_HdrR.$aprv_flg, Purc_Chk03_HdrR.$aprv_flg);
			addColumnPathMap(Purc_Ins01_HdrR.$aprv_no, Purc_Chk03_HdrR.$aprv_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_amt_rnd_typ, Purc_Chk03_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_rnd_typ, Purc_Chk03_HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_calc_typ, Purc_Chk03_HdrR.$purc_tax_calc_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, Purc_Chk03_HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$fix_flg, Purc_Chk03_HdrR.$fix_flg);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_mng_no, Purc_Chk03_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, Purc_Chk03_HdrR.$rcpt_iv_no);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_rev, Purc_Chk03_HdrR.$rcpt_iv_rev);
		}
	}
	protected Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<Purc_Ins01_DtlR,Purc_Chk03_DtlR> createMap_Purc_Ins01_DtlR_Purc_Chk03_DtlR() {
		return new Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<Purc_Ins01_DtlR, Purc_Chk03_DtlR>();
	}

	public class Map_Purc_Ins01_DtlR_Purc_Chk03_DtlR<D extends Purc_Ins01_DtlR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, Purc_Chk03_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$hdr_peg_no, Purc_Chk03_DtlR.$hdr_peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, Purc_Chk03_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_ptn_typ, Purc_Chk03_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$pad, Purc_Chk03_DtlR.$pad);
			addColumnPathMap(Purc_Ins01_DtlR.$arr_schd_no, Purc_Chk03_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_rate, Purc_Chk03_DtlR.$tax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, Purc_Chk03_DtlR.$abort_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$asset_mng_typ, Purc_Chk03_DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, Purc_Chk03_DtlR.$xpns_po_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_cont_qty, Purc_Chk03_DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Ins01_DtlR.$rcpt_iv_d_no, Purc_Chk03_DtlR.$rcpt_iv_d_no);
		}
	}
	protected Map_Purc_Ins01_IoR_Purc_Chk03_IoR<Purc_Ins01_IoR,Purc_Chk03_IoR> createMap_Purc_Ins01_IoR_Purc_Chk03_IoR() {
		return new Map_Purc_Ins01_IoR_Purc_Chk03_IoR<Purc_Ins01_IoR, Purc_Chk03_IoR>();
	}

	public class Map_Purc_Ins01_IoR_Purc_Chk03_IoR<D extends Purc_Ins01_IoR, S extends Purc_Chk03_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_IoR.$src_peg_no, Purc_Chk03_IoR.$src_peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$peg_no, Purc_Chk03_IoR.$peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, Purc_Chk03_IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$outsrc_act_flg, Purc_Chk03_IoR.$outsrc_act_flg);
			addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, Purc_Chk03_IoR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_IoR.$pai, Purc_Chk03_IoR.$pai);
			addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, Purc_Chk03_IoR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, Purc_Chk03_IoR.$from_gd_cd);
			addColumnPathMap(Purc_Ins01_IoR.$crt_lot_flg, Purc_Chk03_IoR.$crt_lot_flg);
			addColumnPathMap(Purc_Ins01_IoR.$stk_bp_cd, Purc_Chk03_IoR.$stk_bp_cd);
			addColumnPathMap(Purc_Ins01_IoR.$ship_fr_valid_dt, Purc_Chk03_IoR.$ship_fr_valid_dt);
		}
	}
	protected Map_Chk01_DtlR_MST_PURC_ACT_D_R<Chk01_DtlR,MST_PURC_ACT_D_R> createMap_Chk01_DtlR_MST_PURC_ACT_D_R() {
		return new Map_Chk01_DtlR_MST_PURC_ACT_D_R<Chk01_DtlR, MST_PURC_ACT_D_R>();
	}

	public class Map_Chk01_DtlR_MST_PURC_ACT_D_R<D extends Chk01_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
			addColumnPathMap(Chk01_DtlR.$temp_ap_flg, MST_PURC_ACT_D_R.$temp_ap_flg);
			addColumnPathMap(Chk01_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
			addColumnPathMap(Chk01_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
			addColumnPathMap(Chk01_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
			addColumnPathMap(Chk01_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
			addColumnPathMap(Chk01_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
			addColumnPathMap(Chk01_DtlR.$base_unit_re_arr_qty, MST_PURC_ACT_D_R.$base_unit_re_arr_qty);
			addColumnPathMap(Chk01_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
			addColumnPathMap(Chk01_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
			addColumnPathMap(Chk01_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
			addColumnPathMap(Chk01_DtlR.$po_no, MST_PURC_ACT_D_R.$po_no);
			addColumnPathMap(Chk01_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
			addColumnPathMap(Chk01_DtlR.$rcpt_iv_d_no, MST_PURC_ACT_D_R.$rcpt_iv_d_no);
			addColumnPathMap(Chk01_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
			addColumnPathMap(Chk01_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
			addColumnPathMap(Chk01_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
			addColumnPathMap(Chk01_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
			addColumnPathMap(Chk01_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
			addColumnPathMap(Chk01_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
			addColumnPathMap(Chk01_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
			addColumnPathMap(Chk01_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
			addColumnPathMap(Chk01_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
			addColumnPathMap(Chk01_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
			addColumnPathMap(Chk01_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
			addColumnPathMap(Chk01_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
			addColumnPathMap(Chk01_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
			addColumnPathMap(Chk01_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
			addColumnPathMap(Chk01_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
			addColumnPathMap(Chk01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
			addColumnPathMap(Chk01_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
			addColumnPathMap(Chk01_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(Chk01_DtlR.$trd_unit_qty, MST_PURC_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(Chk01_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
			addColumnPathMap(Chk01_DtlR.$base_unit_qty, MST_PURC_ACT_D_R.$base_unit_qty);
			addColumnPathMap(Chk01_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
			addColumnPathMap(Chk01_DtlR.$gd_cd, MST_PURC_ACT_D_R.$gd_cd);
			addColumnPathMap(Chk01_DtlR.$quality_typ, MST_PURC_ACT_D_R.$quality_typ);
			addColumnPathMap(Chk01_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
			addColumnPathMap(Chk01_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
			addColumnPathMap(Chk01_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
			addColumnPathMap(Chk01_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
			addColumnPathMap(Chk01_DtlR.$dlv_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
			addColumnPathMap(Chk01_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
			addColumnPathMap(Chk01_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
			addColumnPathMap(Chk01_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
			addColumnPathMap(Chk01_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
			addColumnPathMap(Chk01_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
			addColumnPathMap(Chk01_DtlR.$bp_dlv_slip_no, MST_PURC_ACT_D_R.$bp_dlv_slip_no);
			addColumnPathMap(Chk01_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
			addColumnPathMap(Chk01_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
			addColumnPathMap(Chk01_DtlR.$purc_dtl_upd_flg, MST_PURC_ACT_D_R.$purc_dtl_upd_flg);
			addColumnPathMap(Chk01_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
			addColumnPathMap(Chk01_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
			addColumnPathMap(Chk01_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
			addColumnPathMap(Chk01_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
			addColumnPathMap(Chk01_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(Chk01_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
			addColumnPathMap(Chk01_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
			addColumnPathMap(Chk01_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
			addColumnPathMap(Chk01_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
			addColumnPathMap(Chk01_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
			addColumnPathMap(Chk01_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
			addColumnPathMap(Chk01_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
			addColumnPathMap(Chk01_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
			addColumnPathMap(Chk01_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
			addColumnPathMap(Chk01_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
			addColumnPathMap(Chk01_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
			addColumnPathMap(Chk01_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
			addColumnPathMap(Chk01_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
			addColumnPathMap(Chk01_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
			addColumnPathMap(Chk01_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
			addColumnPathMap(Chk01_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
			addColumnPathMap(Chk01_DtlR.$trd_cur_wtax_amt, MST_PURC_ACT_D_R.$wtax_amt);
			addColumnPathMap(Chk01_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
			addColumnPathMap(Chk01_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
			addColumnPathMap(Chk01_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
			addColumnPathMap(Chk01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
			addColumnPathMap(Chk01_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
			addColumnPathMap(Chk01_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
			addColumnPathMap(Chk01_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
			addColumnPathMap(Chk01_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
			addColumnPathMap(Chk01_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
			addColumnPathMap(Chk01_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
			addColumnPathMap(Chk01_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
			addColumnPathMap(Chk01_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
			addColumnPathMap(Chk01_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
			addColumnPathMap(Chk01_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
			addColumnPathMap(Chk01_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
			addColumnPathMap(Chk01_DtlR.$bd_wg_cd, MST_PURC_ACT_D_R.$bd_wg_cd);
			addColumnPathMap(Chk01_DtlR.$bd_bp_cd, MST_PURC_ACT_D_R.$bd_bp_cd);
			addColumnPathMap(Chk01_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
			addColumnPathMap(Chk01_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
			addColumnPathMap(Chk01_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
			addColumnPathMap(Chk01_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
			addColumnPathMap(Chk01_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
			addColumnPathMap(Chk01_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
			addColumnPathMap(Chk01_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
			addColumnPathMap(Chk01_DtlR.$purc_rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
			addColumnPathMap(Chk01_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
			addColumnPathMap(Chk01_DtlR.$intr_d_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
			addColumnPathMap(Chk01_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
			addColumnPathMap(Chk01_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
			addColumnPathMap(Chk01_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_cd(src.getStringNE("trd_cd"));
			dest.purc_dpt_cd(src.getStringNE("purc_dpt_cd"));
			dest.purc_usr_cd(src.getStringNE("purc_usr_cd"));
			dest.purc_cont_qty(src.getNumberNE("purc_cont_qty"));
		}
	}
	protected Map_Chk01_DtlR_MST_PURC_ACT_R<Chk01_DtlR,MST_PURC_ACT_R> createMap_Chk01_DtlR_MST_PURC_ACT_R() {
		return new Map_Chk01_DtlR_MST_PURC_ACT_R<Chk01_DtlR, MST_PURC_ACT_R>();
	}
	public class Map_Chk01_DtlR_MST_PURC_ACT_R<D extends Chk01_DtlR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_DtlR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
			addColumnPathMap(Chk01_DtlR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
			addColumnPathMap(Chk01_DtlR.$purc_act_rev, MST_PURC_ACT_R.$purc_act_rev);
		}
	}
	protected Map_Chk01_IoR_MST_PURC_ACT_IO_R<Chk01_IoR,MST_PURC_ACT_IO_R> createMap_Chk01_IoR_MST_PURC_ACT_IO_R() {
		return new Map_Chk01_IoR_MST_PURC_ACT_IO_R<Chk01_IoR, MST_PURC_ACT_IO_R>();
	}

	public class Map_Chk01_IoR_MST_PURC_ACT_IO_R<D extends Chk01_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
			addColumnPathMap(Chk01_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
			addColumnPathMap(Chk01_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
			addColumnPathMap(Chk01_IoR.$gi_wg_cd, MST_PURC_ACT_IO_R.$gi_wg_cd);
			addColumnPathMap(Chk01_IoR.$gi_loc_cd, MST_PURC_ACT_IO_R.$gi_loc_cd);
			addColumnPathMap(Chk01_IoR.$gi_str_ln_cd, MST_PURC_ACT_IO_R.$gi_str_ln_cd);
			addColumnPathMap(Chk01_IoR.$gi_unit_cd, MST_PURC_ACT_IO_R.$gi_unit_cd);
			addColumnPathMap(Chk01_IoR.$dlv_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
			addColumnPathMap(Chk01_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
			addColumnPathMap(Chk01_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
			addColumnPathMap(Chk01_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
			addColumnPathMap(Chk01_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
			addColumnPathMap(Chk01_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
			addColumnPathMap(Chk01_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
			addColumnPathMap(Chk01_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
			addColumnPathMap(Chk01_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
			addColumnPathMap(Chk01_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
			addColumnPathMap(Chk01_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
			addColumnPathMap(Chk01_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
			addColumnPathMap(Chk01_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$trd_unit_cd);
			addColumnPathMap(Chk01_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$trd_unit_qty);
			addColumnPathMap(Chk01_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
			addColumnPathMap(Chk01_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
			addColumnPathMap(Chk01_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
			addColumnPathMap(Chk01_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
			addColumnPathMap(Chk01_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
			addColumnPathMap(Chk01_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
			addColumnPathMap(Chk01_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);
		}
	}
	protected Map_Chk01_IoR_MST_ARR_ACT_R<Chk01_IoR,MST_ARR_ACT_R> createMap_Chk01_IoR_MST_ARR_ACT_R() {
		return new Map_Chk01_IoR_MST_ARR_ACT_R<Chk01_IoR, MST_ARR_ACT_R>();
	}

	public class Map_Chk01_IoR_MST_ARR_ACT_R<D extends Chk01_IoR, S extends MST_ARR_ACT_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_IoR.$str_ln_cd, MST_ARR_ACT_R.$str_ln_cd);
			addColumnPathMap(Chk01_IoR.$stk_id_typ, MST_ARR_ACT_R.$stk_id_typ);
			addColumnPathMap(Chk01_IoR.$gd_cd, MST_ARR_ACT_R.$gd_cd);
			addColumnPathMap(Chk01_IoR.$stk_insp_typ, MST_ARR_ACT_R.$stk_insp_typ);
			addColumnPathMap(Chk01_IoR.$quality_typ, MST_ARR_ACT_R.$quality_typ);
			addColumnPathMap(Chk01_IoR.$lot_no, MST_ARR_ACT_R.$lot_no);
			addColumnPathMap(Chk01_IoR.$sublot_no, MST_ARR_ACT_R.$sublot_no);
			addColumnPathMap(Chk01_IoR.$ver_no, MST_ARR_ACT_R.$ver_no);
			addColumnPathMap(Chk01_IoR.$bp_lot_no, MST_ARR_ACT_R.$bp_lot_no);
			addColumnPathMap(Chk01_IoR.$bp_dlv_slip_no, MST_ARR_ACT_R.$bp_dlv_slip_no);
			addColumnPathMap(Chk01_IoR.$bp_dlv_slip_d_no, MST_ARR_ACT_R.$bp_dlv_slip_d_no);
			addColumnPathMap(Chk01_IoR.$ship_fr_valid_dt, MST_ARR_ACT_R.$ship_fr_valid_dt);
			addColumnPathMap(Chk01_IoR.$trd_unit_cd, MST_ARR_ACT_R.$trd_unit_cd);
			addColumnPathMap(Chk01_IoR.$pack_unit_cd, MST_ARR_ACT_R.$pack_unit_cd);
			addColumnPathMap(Chk01_IoR.$pack_unit_qty, MST_ARR_ACT_R.$pack_unit_qty);	
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dlv_loc_cd(src.arr_loc_cd());
		}
	}

	//FMCB CUSTOM END
}