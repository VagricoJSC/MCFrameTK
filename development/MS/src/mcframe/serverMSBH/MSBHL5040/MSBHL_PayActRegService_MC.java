package mcframe.serverMSBH.MSBHL5040;

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
import mcframe.serverMSBH.MSBHL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndBpR;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_NotZeroValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R;
import mcframe.serverMBBA.MBBAL5010.MBBAL_AprvService;
import mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR;
import mcframe.serverMSBG.MSBGL5060.MSBGL_ApSetoffRcvService;
import mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR;
import mcframe.serverMSBG.MSBGL5080.MSBGL_CredService;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5070.MSBHL_PayActIfCrtService;
import mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR;
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayActRegService_MC extends MSBHL_PayActRegService_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBHL_PayActRegService> CLAZZ = MSBHL_PayActRegService.class;
	
	/**
	 * 更新対象の支払実績のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_ACT_R>> _payActCache = null;
	
	/**
	 * 支払実績に紐付く支払実績明細のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_ACT_D_R>> _payActDCache = null;
	protected FXUCL_Cache<MCList<MST_PAY_ACT_D_R>> _payActDLCache = null;
	
	/**
	 * 支払実績に紐付く支払手形のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_NOTE_R>> _payNoteCache = null;
	
	/**
	 * 更新対象の支払照合ヘッダのキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_CHK_R>> _payChkCache = null;
	
	/**
	 * 支払照合ヘッダに紐付く支払予定のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_SCHD_R>> _paySchdCache = null;
	
	/**
	 * 支払予定に紐付く買掛消込予定のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_AP_APPL_SCHD_R>> _apApplSchdCache = null;
	
	/**
	 * 買掛金相殺入金登録サービスの登録・訂正・取消前チェックの下り電文のキャッシュ
	 */
	protected FXUCL_Cache<MCList<ApSetoffRcv_Chk01_DtlR>> _apSetoffRcvChk01RsltCache = null;
	
	/**
	 * 支払実績に関連するテーブルのキャッシュを作成する。<br>
	 * ・支払実績ヘッダ<br>
	 * ・支払実績明細<br>
	 * ・買掛消込予定<br>
	 * ・支払照合ヘッダ<br>
	 * ・支払予定
	 * @param upPayActHdrL 上り電文の支払実績ヘッダリスト
	 * @param upPayActDtlL 上り電文の支払実績明細リスト
	 */
	protected static void initPayCache(MCList<PayAct_Chk01_HdrR> upPayActHdrL, MCList<PayAct_Chk01_DtlR> upPayActDtlL) {
		object(CLAZZ)._initPayCache(upPayActHdrL, upPayActDtlL);
	}
	
	protected void _initPayCache(MCList<PayAct_Chk01_HdrR> upPayActHdrL, MCList<PayAct_Chk01_DtlR> upPayActDtlL) {
		
		/*
		 * 支払照合ヘッダ
		 */
		MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.class);
		MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		payChkL_bldr.setOrderByAsc(payChkL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectColumnForUpdateNoWait("MSBHL5040_MST_PAY_CHK_S01", payChkL, payChkL_bldr, MST_PAY_CHK_R.$pay_chk_mng_no, upPayActDtlL, PayAct_Chk01_DtlR.$pay_chk_mng_no);
		
		if (_payChkCache == null) {
			_payChkCache = new FXUCL_Cache<MCList<MST_PAY_CHK_R>>();
			_payChkCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_CHK_R> l : payChkL.groupList(MST_PAY_CHK_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_CHK_R.$pay_chk_mng_no);
			_payChkCache.putCache(key, l);
		}
		
		/*
		 * 支払実績
		 */
		MCList<MST_PAY_ACT_R> payActL = MCList.create(MST_PAY_ACT_R.class);
		MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_R.create("T"));
		payActL_bldr.setOrderByAsc(payActL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectColumnForUpdateNoWait("MSBHL5040_MST_PAY_ACT_S01", payActL, payActL_bldr, MST_PAY_ACT_R.$pay_act_no, upPayActHdrL, PayAct_Chk01_HdrR.$pay_act_no);
		
		if (_payActCache == null) {
			_payActCache = new FXUCL_Cache<MCList<MST_PAY_ACT_R>>();
			_payActCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_ACT_R> l : payActL.groupList(MST_PAY_ACT_R.$pay_act_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_ACT_R.$pay_act_no);
			_payActCache.putCache(key, l);
		}
		
		/*
		 * 支払実績明細
		 */
		MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
		MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_D_R.create("T"));
		payActDL_bldr.setOrderByAsc(payActDL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectColumnForUpdateNoWait("MSBHL5040_MST_PAY_ACT_D_S01", payActDL, payActDL_bldr, MST_PAY_ACT_D_R.$pay_act_no, payActL, MST_PAY_ACT_R.$pay_act_no);
		
		if (_payActDCache == null) {
			_payActDCache = new FXUCL_Cache<MCList<MST_PAY_ACT_D_R>>();
			_payActDCache.setFixMaxCacheSize(-1);
			_payActDLCache = new FXUCL_Cache<MCList<MST_PAY_ACT_D_R>>();
			_payActDLCache.setFixMaxCacheSize(-1);
		}
		
		String[] keys = {MST_PAY_ACT_D_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_seq};
		for (MCList<MST_PAY_ACT_D_R> l : payActDL.groupList(keys)) {
			Comparable<?>[] key = l.get(0).toArray(keys);
			_payActDCache.putCache(key, l);
		}
		
		String[] actDLkeys = {MST_PAY_ACT_D_R.$pay_act_no, MST_PAY_ACT_D_R.$pay_act_seq};
		for (MCList<MST_PAY_ACT_D_R> l : payActDL.groupList(actDLkeys)) {
			Comparable<?>[] key = l.get(0).toArray(actDLkeys);
			_payActDLCache.putCache(key, l);
		}
		
		/*
		 * 支払手形
		 */
		String[] payNoteKeys = {MST_PAY_NOTE_R.$pay_act_no, MST_PAY_NOTE_R.$pay_act_seq};
		
		MCList<MST_PAY_NOTE_R> payNoteL = MCList.create(MST_PAY_NOTE_R.class);
		MST_PAY_NOTE_R t3 = MST_PAY_NOTE_R.create("T");
		MCQueryApiBuilder payNoteL_bldr = MCQueryApiBuilder.create(t3);
		payNoteL_bldr.setOrderByAsc(payNoteL_bldr.getBaseDbc().getKeyColumn$());
		payNoteL_bldr.setWhere(createWhere(t3, payNoteKeys));
		dbSelectForUpdateNoWait("MSBHL5040_MST_PAY_NOTE_S01", payNoteL, payNoteL_bldr, payActL);
		
		if (_payNoteCache == null) {
			_payNoteCache = new FXUCL_Cache<MCList<MST_PAY_NOTE_R>>();
			_payNoteCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_NOTE_R> l : payNoteL.groupList(payNoteKeys)) {
			Comparable<?>[] key = l.get(0).toArray(payNoteKeys);
			_payNoteCache.putCache(key, l);
		}
		
		/*
		 * 支払予定
		 */
		MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
		MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
		paySchdL_bldr.setOrderByAsc(paySchdL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectColumnForUpdateNoWait("MSBHL5040_MST_PAY_SCHD_S01", paySchdL, paySchdL_bldr, MST_PAY_SCHD_R.$pay_chk_mng_no, payChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
		
		if (_paySchdCache == null) {
			_paySchdCache = new FXUCL_Cache<MCList<MST_PAY_SCHD_R>>();
			_paySchdCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_SCHD_R> l : paySchdL.groupList(MST_PAY_SCHD_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_SCHD_R.$pay_chk_mng_no);
			_paySchdCache.putCache(key, l);
		}
		
		/*
		 * 買掛消込予定
		 */
		MCList<MST_AP_APPL_SCHD_R> apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
		MCQueryApiBuilder apApplSchdL_bldr = MCQueryApiBuilder.create(MST_AP_APPL_SCHD_R.create("T"));
		apApplSchdL_bldr.setOrderByAsc(apApplSchdL_bldr.getBaseDbc().getKeyColumn$());
		dbSelectColumnForUpdateNoWait("MSBHL5040_MST_AP_APPL_SCHD_S01", apApplSchdL, apApplSchdL_bldr, MST_AP_APPL_SCHD_R.$pay_schd_no, paySchdL, MST_PAY_SCHD_R.$pay_schd_no);
		
		if (_apApplSchdCache == null) {
			_apApplSchdCache = new FXUCL_Cache<MCList<MST_AP_APPL_SCHD_R>>();
			_apApplSchdCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_AP_APPL_SCHD_R> l : apApplSchdL.groupList(MST_AP_APPL_SCHD_R.$ap_appl_schd_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_AP_APPL_SCHD_R.$ap_appl_schd_no);
			_apApplSchdCache.putCache(key, l);
		}
	}
	
	/**
	 * 指定された支払実績ＮＯに対応する支払実績ヘッダを取得する。
	 * @param payActNo 支払実績ＮＯ
	 * @return 支払実績ヘッダ
	 */
	protected static MST_PAY_ACT_R getCachePayActR(String payActNo) {
		return object(CLAZZ)._getPayActR(payActNo);
	}
	
	protected MST_PAY_ACT_R _getPayActR(String payActNo) {
		
		MCList<MST_PAY_ACT_R> lst = _getPayActL(payActNo);
		
		if (lst != null && !lst.isEmpty()) {
			// 支払実績連番の最後のレコードを取得
			lst.sort(SortType.DESC, MST_PAY_ACT_R.$pay_act_seq);
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_ACT_R> _getPayActL(String payActNo) {
		
		return _payActCache.getCache(payActNo);
	}
	
	/**
	 * 指定された支払実績ＮＯ、支払実績連番に対応する支払手形を取得する。
	 * @param payActNo 支払実績ＮＯ
	 * @param payActSeq 支払実績連番
	 * @return 支払手形
	 */
	protected static MST_PAY_NOTE_R getCachePayNoteR(String payActNo, MCNumber payActSeq) {
		return object(CLAZZ)._getPayNoteR(payActNo, payActSeq);
	}
	
	protected MST_PAY_NOTE_R _getPayNoteR(String payActNo, MCNumber payActSeq) {
		
		MCList<MST_PAY_NOTE_R> lst = _getPayNoteL(payActNo, payActSeq);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_NOTE_R> _getPayNoteL(String payActNo, MCNumber payActSeq) {
		Comparable<?>[] key = {payActNo, payActSeq};
		return _payNoteCache.getCache(key);
	}
	
	/**
	 * 指定された支払実績明細ＮＯ、支払実績明細連番に対応する支払実績明細を取得する。
	 * @param payActDNo 支払実績明細ＮＯ
	 * @param payActDSeq 支払実績明細連番
	 * @return 支払実績明細
	 */
	protected static MST_PAY_ACT_D_R getCachePayActDR(String payActDNo, MCNumber payActDSeq) {
		return object(CLAZZ)._getPayActDR(payActDNo, payActDSeq);
	}
	
	protected MST_PAY_ACT_D_R _getPayActDR(String payActDNo, MCNumber payActDSeq) {
		
		MCList<MST_PAY_ACT_D_R> lst = _getPayActDL(payActDNo, payActDSeq);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_ACT_D_R> _getPayActDL(String payActDNo, MCNumber payActDSeq) {
		
		return _payActDCache.getCache(payActDNo, payActDSeq);
	}
	
	/**
	 * 指定された支払実績明細ＮＯ、支払実績明細連番に対応する支払実績明細を取得する。
	 * @param payActDNo 支払実績明細ＮＯ
	 * @param payActDSeq 支払実績明細連番
	 * @return 支払実績明細
	 */
	protected static MCList<MST_PAY_ACT_D_R> getCachePayActDL(String payActNo, MCNumber payActSeq) {
		return object(CLAZZ)._getSrcPayActDL(payActNo, payActSeq);
	}
	
	protected MCList<MST_PAY_ACT_D_R> _getSrcPayActDL(String payActNo, MCNumber payActSeq) {
		
		MCList<MST_PAY_ACT_D_R> lst = _getSrcPayActDCacheL(payActNo, payActSeq);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst;
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_ACT_D_R> _getSrcPayActDCacheL(String payActNo, MCNumber payActSeq) {
		
		return _payActDLCache.getCache(payActNo, payActSeq);
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する支払照合ヘッダを取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 支払照合ヘッダ
	 */
	protected static MST_PAY_CHK_R getCachePayChkR(String payChkMngNo) {
		return object(CLAZZ)._getPayChkR(payChkMngNo);
	}
	
	protected MST_PAY_CHK_R _getPayChkR(String payChkMngNo) {
		
		MCList<MST_PAY_CHK_R> lst = _getPayChkL(payChkMngNo);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_CHK_R> _getPayChkL(String payChkMngNo) {
		
		return _payChkCache.getCache(payChkMngNo);
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する支払予定を取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 支払予定リスト
	 */
	protected static MCList<MST_PAY_SCHD_R> getCachePaySchdL(String payChkMngNo) {
		return object(CLAZZ)._getPaySchdL(payChkMngNo);
	}
	
	protected MCList<MST_PAY_SCHD_R> _getPaySchdL(String payChkMngNo) {
		
		return _paySchdCache.getCache(payChkMngNo);
	}
	
	/**
	 * 指定された支払照合管理ＮＯと支払予定ＮＯに対応する支払予定を取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @param paySchdNo 支払予定ＮＯ
	 * @return 支払予定
	 */
	protected static MST_PAY_SCHD_R getCachePaySchdR(String payChkMngNo, String paySchdNo) {
		return object(CLAZZ)._getPaySchdR(payChkMngNo, paySchdNo);
	}
	
	protected MST_PAY_SCHD_R _getPaySchdR(String payChkMngNo, String paySchdNo) {
		
		MCList<MST_PAY_SCHD_R> lst = _getPaySchdL(payChkMngNo);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.getFirst(MST_PAY_SCHD_R.$pay_schd_no, paySchdNo);
		}
		
		return null;
	}
	
	/**
	 * 指定された買掛消込予定ＮＯに対応する買掛消込予定を取得する。
	 * @param apApplSchdNo 買掛消込予定ＮＯ
	 * @return 買掛消込予定
	 */
	protected static MST_AP_APPL_SCHD_R getCacheApApplSchdR(String apApplSchdNo) {
		return object(CLAZZ)._getApApplSchdR(apApplSchdNo);
	}
	
	protected MST_AP_APPL_SCHD_R _getApApplSchdR(String apApplSchdNo) {
		
		MCList<MST_AP_APPL_SCHD_R> lst = _getApApplSchdL(apApplSchdNo);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_AP_APPL_SCHD_R> _getApApplSchdL(String apApplSchdNo) {
		
		return _apApplSchdCache.getCache(apApplSchdNo);
	}
	
	/**
	 * 部門マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptcache = null;
	
	/**
	 * 引数で指定された部門ＣＤと基準日で部門マスタを取得する。
	 * @param dptCd 部門ＣＤ
	 * @param baseDt 基準日
	 * @return 部門マスタ
	 */
	protected MAM_DPT_R getDptCache(String dptCd, MCDate baseDt) {
		return _dptcache.get(baseDt, dptCd);
	}
	
	/**
	 * 部門マスタのキャッシュを作成する
	 */
	protected void initDptCache() {
		
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dptcache == null){
			_dptcache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
															bindL, MAM_DPT_R.$dpt_cd);
		}
	}
	
	/**
	 * 支払予定登録サービスの支払予定削除前チェックの下り電文のキャッシュを作成する。
	 * @param rsltL 支払予定登録サービスの支払予定削除前チェックの下り電文
	 */
	protected static void putApSetoffRcvChk01RsltCache(MCList<ApSetoffRcv_Chk01_DtlR> chkRsltL) {
		object(CLAZZ)._putApSetoffRcvChk01RsltCache(chkRsltL);
	}
	
	protected void _putApSetoffRcvChk01RsltCache(MCList<ApSetoffRcv_Chk01_DtlR> chkRsltL) {
	
		if (_apSetoffRcvChk01RsltCache == null) {
			_apSetoffRcvChk01RsltCache = new FXUCL_Cache<MCList<ApSetoffRcv_Chk01_DtlR>>();
			_apSetoffRcvChk01RsltCache.setFixMaxCacheSize(-1);
		}
		
		// エラーＦＬＧがオフの下り電文のみキャッシュする
		MCList<ApSetoffRcv_Chk01_DtlR> chkL = getChkList(chkRsltL);
		
		for (MCList<ApSetoffRcv_Chk01_DtlR> l : chkL.groupList(ApSetoffRcv_Chk01_DtlR.$peg_no)) {
			Comparable<?>[] key = l.get(0).toArray(ApSetoffRcv_Chk01_DtlR.$peg_no);
			_apSetoffRcvChk01RsltCache.putCache(key, l);
		}
	}
	
	protected static MCList<ApSetoffRcv_Chk01_DtlR> getApSetoffRcvChk01RsltCache(MCNumber pegNo) {
		
		return object(CLAZZ)._getApSetoffRcvChk01RsltCache(pegNo);
	}
	
	protected MCList<ApSetoffRcv_Chk01_DtlR> _getApSetoffRcvChk01RsltCache(MCNumber pegNo) {
		if (_apSetoffRcvChk01RsltCache == null) {
			return null;
		}
		return _apSetoffRcvChk01RsltCache.getCache(pegNo);
	}
	
	/**
	 * PayAct_Chk01オペレーション.<p>
	 *
	 * 支払実績の登録・更新・削除が可能かチェックをする。<br>
	 */
	public class PayAct_Chk01 extends MSBHL_PayActRegService_MC_A.PayAct_Chk01 {
		
		/**
		 * 上り電文の支払実績明細のインデックス
		 */
		protected MCIndexKey _upPayActDIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			createUpIndex();
			
			editUp();
			
			super.doIt();
			
			callAprvServiceChk02();
			
			callAprvServiceChk03();
			
			callApSetoffRcvServiceChk01();
			
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			
			msgL.addAll(chkUpdCntReq());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkUpdCnt());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			// 更新カウンタチェック含む、基本となるチェックエラーになった場合、後続のチェックを実行されないために、支払実績ヘッダのエラーＦＬＧをオンに設定する
			setHdrErrFLg();
			
			msgL.addAll(chkReq());
			
			msgL.addAll(chkTrdCurAmt());
			
			msgL.addAll(chkDt());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			msgL.addAll(chkDac());
			
			msgL.addAll(chkAprvStsTyp());
			
			msgL.addAll(chkNoteDays());
			
			msgL.addAll(chkPayChkMngNo());
			
			msgL.addAll(chkDataCrudTyp());
			
			return msgL;
		}
		
		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex,
				MCList<E> chkTarL,
				String chkTarCol, String listLogicId,
				String listIn, String listInBase,
				String listOut, String listOutBase) {
			
			// 相殺先リストロジック対象外（ヘッダ）
			if (isSame(chkTarCol, PayAct_Chk01_HdrR.$setoff_cd)) {
				
				MCList<PayAct_Chk01_HdrR> notHdrTgtL = MCList.create(PayAct_Chk01_HdrR.class); 
				for (MCConstRow chkRow : chkTarL) {
					PayAct_Chk01_HdrR hdrR = (PayAct_Chk01_HdrR)chkRow;
					
					if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
						continue;
					}
					
					if (!isNull(hdrR.setoff_cd()) && !isNull(hdrR.ap_setoff_typ())) {
						// 相殺先区分＝'9'：任意 はチェック対象から除外
						if (MAC_AP_SETOFF_TYP.isFLEX(hdrR.ap_setoff_typ())) {
							notHdrTgtL.add(hdrR);
						}
					}
				}
				
				if (!notHdrTgtL.isEmpty()) {
					// チェック対象から除外する
					for (PayAct_Chk01_HdrR notHdrTgtR : notHdrTgtL) {
						chkTarL.remove(notHdrTgtR);
					}
				}
			}
			// 相殺先リストロジック対象外（明細）
			else if (isSame(chkTarCol, PayAct_Chk01_DtlR.$setoff_cd)) {
				MCList<PayAct_Chk01_DtlR> notDtlTgtL = MCList.create(PayAct_Chk01_DtlR.class); 
				for (MCConstRow chkRow : chkTarL) {
					PayAct_Chk01_DtlR dtlR = (PayAct_Chk01_DtlR)chkRow;
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						continue;
					}
					
					if (!isNull(dtlR.setoff_cd()) && !isNull(dtlR.ap_setoff_typ())) {
						// 相殺先区分＝'9'：任意 はチェック対象から除外
						if (MAC_AP_SETOFF_TYP.isFLEX(dtlR.ap_setoff_typ())) {
							notDtlTgtL.add(dtlR);
						}
					}
				}
				
				if (!notDtlTgtL.isEmpty()) {
					// チェック対象から除外する
					for (PayAct_Chk01_DtlR notDtlTgtR : notDtlTgtL) {
						chkTarL.remove(notDtlTgtR);
					}
				}
			}
			// 支払予定管理先担当部門、債務部門リストロジック対象外（明細）
			else if (isSame(chkTarCol, PayAct_Chk01_DtlR.$bsppl_dpt_cd)
					|| isSame(chkTarCol, PayAct_Chk01_DtlR.$ap_dpt_cd)) {
				MCList<PayAct_Chk01_DtlR> notDtlTgtL = MCList.create(PayAct_Chk01_DtlR.class); 
				for (MCConstRow chkRow : chkTarL) {
					PayAct_Chk01_DtlR dtlR = (PayAct_Chk01_DtlR)chkRow;
					
					// 払出（振替元）の実績はチェックしない
					if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(dtlR.ap_sttl_typ())
						|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(dtlR.ap_sttl_typ())) {
						notDtlTgtL.add(dtlR);
					}
				}
				
				if (!notDtlTgtL.isEmpty()) {
					// チェック対象から除外する
					for (PayAct_Chk01_DtlR notDtlTgtR : notDtlTgtL) {
						chkTarL.remove(notDtlTgtR);
					}
				}
			}
			
			if (isNull(chkTarL)) {
				return new MCMessageList();
			}
			
 			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol, listLogicId, listIn,
					listInBase, listOut, listOutBase);
		}
		
		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			
			// リストロジックチェック条件（ヘッダ）
			if (data instanceof PayAct_Chk01_HdrR) {
				PayAct_Chk01_HdrR upPayActR = (PayAct_Chk01_HdrR)data;
				// 相殺先
				if (isSame(column, PayAct_Chk01_HdrR.$setoff_cd)) {
					if (!isNull(upPayActR.setoff_cd()) && !isNull(upPayActR.ap_setoff_typ())) {
						// 相殺先区分＝'1'：支払予定管理先
						if (MAC_AP_SETOFF_TYP.isBSPPL(upPayActR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.BSPPL.value());
						}
						// 相殺先区分＝'2'：売掛先
						else if (MAC_AP_SETOFF_TYP.isACST(upPayActR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.AP_SETOFF.value());
						}
						// 相殺先区分＝'3'：有償支給先
						else if (MAC_AP_SETOFF_TYP.isPRSPPL(upPayActR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.ASPPL.value());
						}
						else {
							// 9：任意 はチェックしない
						}
					}
				}
				
				// 相殺部門
				if (isSame(column, PayAct_Chk01_HdrR.$so_dpt_cd)) {
					if (!isNull(upPayActR.so_dpt_cd())) {
						if (!isNull(upPayActR.setoff_cd()) && !isNull(upPayActR.ap_setoff_typ())) {
							// 相殺先区分＝'1'：支払予定管理先：債務部門フラグがオン
							if (MAC_AP_SETOFF_TYP.isBSPPL(upPayActR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
							}
							// 相殺先区分＝'2'：売掛先：債権部門フラグがオン
							else if (MAC_AP_SETOFF_TYP.isACST(upPayActR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AR.value());
							}
							// 相殺先区分＝'3'：有償支給先：債務部門フラグがオン
							else if (MAC_AP_SETOFF_TYP.isPRSPPL(upPayActR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
							}
							// 全部門
							else {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
							}
						}
						// 全部門
						else {
							cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
						}
					}
				}
			}
			// リストロジックチェック条件（明細）
			else if (data instanceof PayAct_Chk01_DtlR) {
				PayAct_Chk01_DtlR upPayActDR = (PayAct_Chk01_DtlR)data;
				// 相殺先
				if (isSame(column, PayAct_Chk01_DtlR.$setoff_cd)) {
					if (!isNull(upPayActDR.setoff_cd()) && !isNull(upPayActDR.ap_setoff_typ())) {
						// 相殺先区分＝'1'：支払予定管理先
						if (MAC_AP_SETOFF_TYP.isBSPPL(upPayActDR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.BSPPL.value());
						}
						// 相殺先区分＝'2'：売掛先
						else if (MAC_AP_SETOFF_TYP.isACST(upPayActDR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.AP_SETOFF.value());
						}
						// 相殺先区分＝'3'：有償支給先
						else if (MAC_AP_SETOFF_TYP.isPRSPPL(upPayActDR.ap_setoff_typ())) {
							cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.ASPPL.value());
						}
						else{
							// 9：任意 はチェックしない
						}
					}
				}
				
				// 相殺部門
				if (isSame(column, PayAct_Chk01_DtlR.$so_dpt_cd)) {
					if (!isNull(upPayActDR.so_dpt_cd())) {
						if (!isNull(upPayActDR.setoff_cd()) && !isNull(upPayActDR.ap_setoff_typ())) {
							// 相殺先区分＝'1'：支払予定管理先：債務部門フラグがオン
							if (MAC_AP_SETOFF_TYP.isBSPPL(upPayActDR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
							}
							// 相殺先区分＝'2'：売掛先：債権部門フラグがオン
							else if (MAC_AP_SETOFF_TYP.isACST(upPayActDR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AR.value());
							}
							// 相殺先区分＝'3'：有償支給先：債務部門フラグがオン
							else if (MAC_AP_SETOFF_TYP.isPRSPPL(upPayActDR.ap_setoff_typ())) {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
							}
							// 全部門
							else {
								cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
							}
						}
						// 全部門
						else {
							cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
						}
					}
				}
			}
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {

			initPayCache(up0(), up1());
			
			setDtlAcDt();
			
			editDpt();
		}
		
		/**
		 * 支払実績ヘッダの計上日を支払実績明細に反映する。
		 */
		protected void setDtlAcDt() {

			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				upPayActDL.setValueNE(PayAct_Chk01_DtlR.$ac_dt, upPayActR.ac_dt());
				upPayActDL.setValueNE(PayAct_Chk01_DtlR.$can_ac_dt, upPayActR.can_ac_dt());
			}
		}
		
		/**
		 * 部門の変換を行う。
		 */
		protected void editDpt() {

			// 支払部門変換する・しないは混在しない想定
			if (up0().get(0).pay_dpt_chng_flg()) {
				MAUCL_DptUtil.setDpt(up0(), PayAct_Chk01_HdrR.$pay_dpt_cd, PayAct_Chk01_HdrR.$ac_dt);
			}
			MAUCL_DptUtil.setDpt(up0(), PayAct_Chk01_HdrR.$so_dpt_cd, PayAct_Chk01_HdrR.$ac_dt);
			
			MAUCL_DptUtil.setDpt(up1(), PayAct_Chk01_DtlR.$so_dpt_cd, PayAct_Chk01_DtlR.$ac_dt);
		}
		
		/**
		 * 排他必須チェックを行う。（更新カウンタ必須）
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpdCntReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				// 更新カウンタチェック対象外がオフの場合、支払照合更新カウンタ必須とする
				if (!upPayActR.upd_cntr_not_chk_flg()) {
					
					MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
					
					for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
						// 支払照合管理ＮＯがNULLの行は更新カウンタの必須チェックをしない
						if (!isNull(upPayActDR.pay_chk_mng_no())) {
							msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$pay_chk_upd_cntr, new FXUCL_RequiredValidater()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 排他チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpdCnt() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				// 更新カウンタチェック対象外がオフの場合のみ排他チェックを行う
				if (!upPayActR.upd_cntr_not_chk_flg()) {
					
					MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
					
					for (PayAct_Chk01_DtlR upPayActDR : upPayActDL.distinctNE(PayAct_Chk01_DtlR.$pay_chk_mng_no, PayAct_Chk01_DtlR.$pay_chk_upd_cntr)) {
						
						// 支払照合管理ＮＯがNULLの行は更新カウンタチェックをしない 
						if (!isNull(upPayActDR.pay_chk_mng_no())) {
							
							MST_PAY_CHK_R payChkR = getCachePayChkR(upPayActDR.pay_chk_mng_no());
							
							msgL.addAll(checkUpdCntrNE(upPayActDR, PayAct_Chk01_DtlR.$pay_chk_upd_cntr, payChkR));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			setPayNoteInfo();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				if (isCrt(upPayActR) || isUpd(upPayActR)) {
					
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$psppl_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$pay_dpt_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$pay_act_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$ac_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$trd_cur_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$xrate, new FXUCL_RequiredValidater()));
					
					// 明細のデータ更新区分が、新規or訂正かつ債務決済区分＝'5'（手形）のレコードが存在している場合
					MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->(isCrt(r) || isUpd(r)) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ()));
					if (!isNull(upPayActDL)) {
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$note_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$note_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$draw_dt, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$drawer_nm, new FXUCL_RequiredValidater()));
						// 手形区分が為替手形の場合
						if (MAC_NOTE_TYP.isXCHNG(upPayActR.note_typ())) {
							msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$accptr, new FXUCL_RequiredValidater()));
						}
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$draw_bank_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$draw_branch_cd, new FXUCL_RequiredValidater()));
						
						// 手形サイトが指定されていない
						if (isNull(upPayActR.note_days())) {
							
							msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$due_dt, new FXUCL_RequiredValidater()));
						}
						// 支払期日が指定されていない
						else if (isNull(upPayActR.due_dt())) {
							
							msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$note_days, new FXUCL_RequiredValidater()));
						}
					}
				}
				
				if (isUpd(upPayActR) || isDel(upPayActR)) {
					
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$pay_act_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$pay_act_seq, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			for (PayAct_Chk01_DtlR upPayActDR : up1()) {
				
				if (isCrt(upPayActDR) || isUpd(upPayActDR)) {
					
					msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$ap_sttl_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt, new FXUCL_RequiredValidater()));
					
					// 債務決済区分＝'1'（預金）または'2'（預金（手数料））
					if (MAC_AP_STTL_TYP.isACNT(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isACNT_COM_PAID(upPayActDR.ap_sttl_typ())) {
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$bank_ac_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$pay_bank_ac_cd, new FXUCL_RequiredValidater()));
					}
					
					// 債務決済区分＝'2'（預金（手数料））または'4'（現金（手数料））
					if (MAC_AP_STTL_TYP.isACNT_COM_PAID(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isCASH_COM_PAID(upPayActDR.ap_sttl_typ())) {
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_com_paid_tax_cd, new FXUCL_RequiredValidater()));
					}
					
					// 債務決済区分＝'6'（相殺）
					if (MAC_AP_STTL_TYP.isSETOFF(upPayActDR.ap_sttl_typ())) {
						
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$ap_setoff_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$setoff_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$so_dpt_cd, new FXUCL_RequiredValidater()));
						
						// 債務決済区分＝'6'（相殺）かつ相殺先区分＝'9'（任意）
						if (MAC_AP_SETOFF_TYP.isFLEX(upPayActDR.ap_setoff_typ())) {
							
							msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$setoff_nm, new FXUCL_RequiredValidater()));
						}
					}
				}
				
				if (isCrt(upPayActDR)) {
					
					// 買掛消込予定ＮＯが未設定
					if (isNull(upPayActDR.ap_appl_schd_no())) {
						
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$bsppl_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$bsppl_dpt_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$asppl_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$purc_act_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$rcpt_iv_mng_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$rcpt_iv_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$wrk_no, new FXUCL_RequiredValidater()));
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$ap_typ, new FXUCL_RequiredValidater()));
					}
				}
				
				if (isUpd(upPayActDR) || isDel(upPayActDR)) {
					
					msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$pay_act_d_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$pay_act_d_seq, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 手形管理の場合の支払期日・手形サイトの設定
		 */
		protected void setPayNoteInfo() {
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
	
				MCList<PayAct_Chk01_DtlR> payNoteDL = getUpPayActDL(upPayActR).subList(r->((isCrt(r) || isUpd(r)) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())));
				
				if (payNoteDL.isEmpty()) {
					// 支払実績明細に手形が存在しない場合、支払実績ヘッダの手形情報をクリアする
					upPayActR.pn().clear();
				}
				else {
					
					if (!isNull(upPayActR.pay_act_no())) {
						
						MST_PAY_NOTE_R payNoteR = getCachePayNoteR(upPayActR.pay_act_no(), upPayActR.pay_act_seq());
						if (!isNull(payNoteR)) {
							upPayActR.pay_note_mng_no(payNoteR.pay_note_mng_no());
						}
					}
					
					if (isCrt(upPayActR) || isUpd(upPayActR)) {
						// 支払期日の算出
						if (isNull(upPayActR.due_dt()) && !isNull(upPayActR.draw_dt()) && !isNull(upPayActR.note_days())) {
							upPayActR.due_dt(upPayActR.draw_dt().addDay(upPayActR.note_days()));
						}
						// 手形サイトの算出
						if (isNull(upPayActR.note_days()) && !isNull(upPayActR.due_dt()) && !isNull(upPayActR.draw_dt())) {
							upPayActR.note_days(upPayActR.due_dt().diffDay(upPayActR.draw_dt()));
						}
					}
				}
			}
		}
		
		/**
		 * 取引通貨金額に関連するチェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTrdCurAmt() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isCrt(r) || isUpd(r));
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					
					msgL.addAll(checkDecPlace(upPayActDR, upPayActR.trd_cur_amt_dec_place().intValue(), PayAct_Chk01_DtlR.$trd_cur_amt));
					
					// 債務決済方法が預金（手数料）、現金（手数料）の場合は予定超過許容する
					if (!isNull(upPayActDR.ap_appl_schd_no())
							&& !MAC_AP_STTL_TYP.isACNT_COM_PAID(upPayActDR.ap_sttl_typ())
							&& !MAC_AP_STTL_TYP.isCASH_COM_PAID(upPayActDR.ap_sttl_typ())) {
						// 金額大小チェック
						
						// 買掛消込予定の取得
						MST_AP_APPL_SCHD_R apApplSchdR = getCacheApApplSchdR(upPayActDR.ap_appl_schd_no());
						
						if (apApplSchdR.trd_cur_amt().isPositive() && !upPayActDR.trd_cur_amt().isPositive()) {
							msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt, new FXUCL_PositiveValidater()));
						}
						else if (apApplSchdR.trd_cur_amt().isNegative() && !upPayActDR.trd_cur_amt().isNegative()) {
							msgL.add(new MCMessage(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt, MSBHL0055, getLabel(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt), toDispGUIIndex(upPayActDR)));
						}
						else {
							// 同一買掛消込予定ＮＯで有効行の支払額合計の算出
							MCList<PayAct_Chk01_DtlR> sameGrpL = upPayActDL.subList(r->(isCrt(r) || isUpd(r)) && isSame(upPayActDR.ap_appl_schd_no(), r.ap_appl_schd_no()));
							MCNumber sumPayAmt = sameGrpL.sum(PayAct_Chk01_DtlR.$trd_cur_amt);
						
							// 訂正前の金額取得
							MCNumber beforeAmt = MCNumber.ZERO;
							for (PayAct_Chk01_DtlR sameGrpR : sameGrpL) {
								// 支払実績明細を取得し、同一買掛消込予定ＮＯの明細の支払額合計を算出
								if (!isNull(upPayActR.pay_act_no())) {
									MCList<MST_PAY_ACT_D_R> srcPayActDL = getCachePayActDL(upPayActR.pay_act_no(), upPayActR.pay_act_seq());
									beforeAmt = srcPayActDL.subList(r->isSame(sameGrpR.ap_appl_schd_no(), r.ap_appl_schd_no())).sum(MST_PAY_ACT_D_R.$trd_cur_amt);
								}
							}
							
							// 買掛消込予定の取引通貨金額ー消込額＋訂正前の支払実績明細の取引通貨金額　を算出
							MCNumber paySchdAmt = apApplSchdR.trd_cur_amt().subtract(apApplSchdR.trd_cur_appl_amt()).add(nvl(beforeAmt, MCNumber.ZERO));
							
							// 同一買掛消込予定ＮＯに対する予定額を超過する支払金額（合計）の場合はエラー
							if (sumPayAmt.abs().gt(paySchdAmt.abs())) {
								msgL.add(new MCMessage(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt, MSBHL0044, upPayActDR.ap_appl_schd_no(), sumPayAmt, paySchdAmt, toDispGUIIndex(upPayActDR)));
							}
						}
					}
					
					// 前渡金相殺の場合、取引通貨金額＞0
					if (!isNull(upPayActDR.adv_pay_act_no())) {
						msgL.addAll(check(upPayActDR, PayAct_Chk01_DtlR.$trd_cur_amt, new FXUCL_PositiveValidater()));
					}
					// 債務決済方法が預金（手数料）、現金（手数料）の場合は制限なし
					else if (MAC_AP_STTL_TYP.isACNT_COM_PAID(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isCASH_COM_PAID(upPayActDR.ap_sttl_typ())) {
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 日付に関連するチェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDt() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				if (isCrt(upPayActR) || isUpd(upPayActR)) {
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$pay_act_dt, new FXUCL_BeforeTodayValidater()));
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$ac_dt, new FXUCL_BeforeTodayValidater()));
					
					msgL.addAll(check(upPayActR, new String[] {PayAct_Chk01_HdrR.$draw_dt, PayAct_Chk01_HdrR.$due_dt}, new FXUCL_BeforeAfterValidater()));
					msgL.addAll(check(upPayActR, new String[] {PayAct_Chk01_HdrR.$draw_dt, PayAct_Chk01_HdrR.$pay_act_dt}, new FXUCL_BeforeAfterValidater()));
				}
				
				if (isUpd(upPayActR) || isDel(upPayActR)) {
					msgL.addAll(check(upPayActR, PayAct_Chk01_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
				}
			}
			
			callClServiceChk03();
			
			return msgL;
		}
		
		/**
		 * ＤＡＣチェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDac() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
					
				// ＤＡＣチェック対象外がオフの場合のみＤＡＣチェックを行う
				if (!upPayActR.dac_not_chk_flg()) {
					
					MST_PAY_ACT_R payActR = getCachePayActR(upPayActR.pay_act_no());
					
					if ((isCrt(upPayActR) || isUpd(upPayActR))) {
						msgL.addAll(checkWritableDptCdDac(upPayActR, PayAct_Chk01_HdrR.$pay_dpt_cd));
					}
					
					if ((isUpd(upPayActR) && !isSame(upPayActR.pay_dpt_cd(), payActR.pay_dpt_cd())) || (isDel(upPayActR))) {
						upPayActR.addStringColumn("bf_pay_dpt_cd", payActR.pay_dpt_cd());
						msgL.addAll(checkWritableDptCdDac(upPayActR, "bf_pay_dpt_cd"));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 承認チェックを行う。
		 * 支払照合ヘッダ.承認対象ＦＬＧがオンかつ承認状況区分が「最終承認済」でない場合、エラーとする。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAprvStsTyp() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
					
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isCrt(r));
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL.distinctNE(PayAct_Chk01_DtlR.$pay_chk_mng_no)) {
					if (isNull(upPayActDR.pay_chk_mng_no())) {
						continue;
					}
					MST_PAY_CHK_R payChkR = getCachePayChkR(upPayActDR.pay_chk_mng_no());
					
					if (payChkR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(payChkR.aprv_sts_typ())) {
						
						msgL.add(new MCMessage(upPayActR, null, MSBHL0035, payChkR.pay_chk_no(), toDispGUIIndex(upPayActR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 手形サイト上限チェックを行う。<br>
		 * 手形サイト＞手形サイト上限の場合にエラーとする。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkNoteDays() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				if ((isCrt(upPayActR) || isUpd(upPayActR)) 
						&& !isNull(upPayActR.note_days_lmt()) && !isNull(upPayActR.note_days())
						&& upPayActR.note_days().gt(upPayActR.note_days_lmt())) {
					
					msgL.add(new MCMessage(upPayActR, null, MSBHL0036, upPayActR.psppl_cd(),
							toYMDString(upPayActR.draw_dt()), toYMDString(upPayActR.due_dt()), upPayActR.note_days(),
							upPayActR.note_days_lmt(), toDispGUIIndex(upPayActR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 支払照合の行の存在チェックを行う。<br>
		 * 明細上り電文の中に、支払照合ＮＯが設定された行が１件もない場合にエラーとする。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPayChkMngNo() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				// 全取消の場合、支払照合管理ＮＯを持つ行は必ず存在する
				if (isDel(upPayActR)) {
					continue;
				}
				// 未照合残高振替は対象外
				if (MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(upPayActR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(upPayActR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_OUT_CHK(upPayActR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(upPayActR.ap_sttl_typ())) {
					continue;
				}
				if (upPayActDL.subList(r->(isCrt(r) || isUpd(r)) && !isNull(r.pay_chk_mng_no())).isEmpty()) {
					
					msgL.add(new MCMessage(upPayActR, null, MSBHL0037, toDispGUIIndex(upPayActR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * データ更新区分チェックを行う。<br>
		 * 全明細が削除された場合にエラーとする。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDataCrudTyp() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(upPayActR.data_crud_typ())) {
					continue;
				}
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				if (upPayActDL.size() == upPayActDL.subList(r->isDel(r)).size()) {
					
					msgL.add(new MCMessage(upPayActR, null, MSBHL0038, upPayActR.pay_act_no(), toDispGUIIndex(upPayActR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 締処理提供サービスの締日チェックを実行する。
		 */
		protected void callClServiceChk03() {

			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR up0R = null;
			Cl_Chk03_CndBpR up2R = null;
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				up0R = Cl_Chk03_CndR.create();
				
				up0R.peg_no(upPayActR.hdr_peg_no());
				up0R.ac_dt(upPayActR.ac_dt());
				up0R.can_ac_dt(upPayActR.can_ac_dt());
				up0R.pay_cls_chk_flg(true);
				
				up0R.setAttributes(upPayActR);
				
				ope.up0().add(up0R);
					
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					
					up2R = Cl_Chk03_CndBpR.create();
					
					if (isCrt(upPayActDR) || isUpd(upPayActDR)) {
						if (!isNull(upPayActDR.ap_appl_schd_no())) {
							
							MST_AP_APPL_SCHD_R apApplSchdR = getCacheApApplSchdR(upPayActDR.ap_appl_schd_no());
							MST_PAY_SCHD_R paySchdR = getCachePaySchdR(upPayActDR.pay_chk_mng_no(), apApplSchdR.pay_schd_no());
							
							up2R.bp_cd(paySchdR.asppl_cd());
						}
						else {
							up2R.bp_cd(upPayActDR.asppl_cd());
						}
					}
					
					if (isUpd(upPayActDR) || isDel(upPayActDR)) {
						MST_PAY_ACT_D_R payActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.pay_act_d_seq());
						up2R.old_bp_cd(payActDR.asppl_cd());
					}
					
					ope.up2().add(up2R);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up0(), ope.down0(), PayAct_Chk01_HdrR.$hdr_peg_no, Cl_Chk03_CndR.$peg_no);
			}
		}
		
		/**
		 * 承認提供サービスの承認次処理済更新前チェックを実行する。
		 */
		protected void callAprvServiceChk02() {
			
			MBBAL_AprvService.Aprv_Chk02 ope = MBBAL_AprvService.crtAprv_Chk02();
			Aprv_Chk02_Rslt1R upR = null;
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				// 予定時実績は除外
				if (upPayActR.schd_act_flg()) {
					continue;
				}
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isCrt(r));
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL.distinctNE(PayAct_Chk01_DtlR.$pay_chk_mng_no)) {
					
					if (isNull(upPayActDR.pay_chk_mng_no())) {
						continue;
					}
					
					MST_PAY_CHK_R payChkR = getCachePayChkR(upPayActDR.pay_chk_mng_no());
					
					// 承認対象以外は除外
					if (!isNull(payChkR) && !payChkR.aprv_flg()) {
						continue;
					}
					
					upR = Aprv_Chk02_Rslt1R.create();
					
					upR.peg_no(upPayActDR.peg_no());
					upR.aprv_no(payChkR.aprv_no());
					
					upR.setAttributes(upPayActDR);
					
					ope.up0().add(upR);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up1(), ope.down0());
			}
		}
		
		/**
		 * 承認提供サービスの承認次処理済解除前チェックを実行する。
		 */
		protected void callAprvServiceChk03() {
			
			MBBAL_AprvService.Aprv_Chk03 ope = MBBAL_AprvService.crtAprv_Chk03();
			Aprv_Chk02_Rslt1R upR = null;
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				// 予定時実績は除外
				if (upPayActR.schd_act_flg()) {
					continue;
				}
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isDel(r));
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL.distinctNE(PayAct_Chk01_DtlR.$pay_chk_mng_no)) {
					if (isNull(upPayActDR.pay_chk_mng_no())) {
						continue;
					}
					
					MST_PAY_CHK_R payChkR = getCachePayChkR(upPayActDR.pay_chk_mng_no());
					
					// 承認対象以外は除外
					if (!isNull(payChkR) && !payChkR.aprv_flg()) {
						continue;
					}
					
					upR = Aprv_Chk02_Rslt1R.create();
					
					upR.peg_no(upPayActDR.peg_no());
					upR.aprv_no(payChkR.aprv_no());
					
					upR.setAttributes(upPayActDR);
					
					ope.up0().add(upR);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up1(), ope.down0());
			}
		}
		
		/**
		 * 買掛金相殺入金登録サービスの登録・訂正・取消前チェックを実行する。
		 */
		protected void callApSetoffRcvServiceChk01() {
			
			if (getCo().ar_no_use_flg()) {
				// 債権不使用がオンの場合、実行しない
				return;
			}
			
			MSBGL_ApSetoffRcvService.ApSetoffRcv_Chk01 ope = MSBGL_ApSetoffRcvService.crtApSetoffRcv_Chk01();
			
			ApSetoffRcv_Chk01_DtlR upR = null;
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
					
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					String tmpApSttlTyp = null;
					String tmpApSetoffTyp = null;
					
					MST_PAY_ACT_D_R payActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.pay_act_d_seq());
					
					if (MAC_DATA_CRUD_TYP.isDEL(upPayActR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(upPayActDR.data_crud_typ())) {
						tmpApSttlTyp = payActDR.ap_sttl_typ();
						tmpApSetoffTyp = payActDR.ap_setoff_typ();
					}
					else {
						tmpApSttlTyp = upPayActDR.ap_sttl_typ();
						tmpApSetoffTyp = upPayActDR.ap_setoff_typ();
					}
					
					if (MAC_AP_STTL_TYP.isSETOFF(tmpApSttlTyp) && MAC_AP_SETOFF_TYP.isACST(tmpApSetoffTyp)) {
					
						upR = ApSetoffRcv_Chk01_DtlR.create();
						
						upR.peg_no(upPayActDR.peg_no());
						upR.data_crud_typ(upPayActDR.data_crud_typ());
						if (!isNull(payActDR)) { 
							upR.rcv_no(payActDR.rcv_no());
						}
						
						upR.rcv_dpt_cd(upPayActDR.so_dpt_cd());
						upR.rcv_usr_cd(upPayActR.pay_usr_cd());
						upR.acst_cd(upPayActDR.setoff_cd());
						
						if (!isNull(payActDR) && isNull(upPayActDR.pay_schd_no())) {
							upPayActDR.pay_schd_no(payActDR.pay_schd_no());
						}
						else if (isNull(upPayActDR.pay_schd_no())) {
							MST_AP_APPL_SCHD_R apApplSchdR = getCacheApApplSchdR(upPayActDR.ap_appl_schd_no());
							upPayActDR.pay_schd_no(apApplSchdR.pay_schd_no());
						}
						MST_PAY_SCHD_R paySchdR = getCachePaySchdR(upPayActDR.pay_chk_mng_no(), upPayActDR.pay_schd_no());
						upR.asppl_cd(paySchdR.asppl_cd());
						
						upR.rcv_dt(upPayActR.pay_act_dt());
						upR.ac_dt(upPayActR.ac_dt());
						upR.trd_cur_cd(upPayActR.trd_cur_cd());
						upR.xrate(upPayActR.xrate());
						upR.rcv_amt(upPayActDR.trd_cur_amt());
						upR.rcv_mtd_cd(upPayActDR.ap_sttl_cd());
						
						upR.setAttributes(upPayActDR);
						ope.up0().add(upR);
					}
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up1(), ope.down0());
				putApSetoffRcvChk01RsltCache(ope.down0());
			}
		}
		
		/**
		 * ヘッダのエラーＦＬＧを設定する。
		 */
		protected void setHdrErrFLg() {
			
			MCList<PayAct_Chk01_HdrR> chkL = getChkList(up0());
			
			for (PayAct_Chk01_HdrR upPayActR : chkL) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				if (hasErrFlgOn(upPayActDL)) {
					// 支払実績明細で１件でもエラーがあった場合、支払実績ヘッダもエラーにする。
					upPayActR.err_flg(true);
				}
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				if (upPayActR.err_flg()) {
					// 支払実績ヘッダがエラーの場合、明細すべてエラーにする。
					upPayActDL.setValueNE(PayAct_Chk01_DtlR.$err_flg, true);
					continue;
				}
				
				if (hasErrFlgOn(upPayActDL)) {
					// 支払実績明細で１件でもエラーがあった場合、支払実績ヘッダもエラーにする。
					upPayActR.err_flg(true);
					upPayActDL.setValueNE(PayAct_Chk01_DtlR.$err_flg, true);
					
					continue;
				}
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					compUpPayActD(upPayActR, upPayActDR);
				}
				
				setDispSeqStNoChg(upPayActDL);
			}
			
			down0().setAll(up0());
			down1().setAll(up1());
		}
		
		/**
		 * 表示順を設定する。
		 */
		protected void setDispSeqStNoChg(MCList<PayAct_Chk01_DtlR> l) {
			// ステータスを維持する（MAUDL5010#setDispSeq ではステータスが変わることがあるので）
			Function<PayAct_Chk01_DtlR, List<MCNumber>> key = (r) -> {
				List<MCNumber> arr = new ArrayList<>();
				arr.add(r.peg_no());
				arr.add(r.hdr_peg_no());
				return arr;
			};
			Map<List<MCNumber>, MCRow.Status> map = new HashMap<>();
			l.forEach(r -> map.put(key.apply(r), r.getStatus()));
			setDispSeq(l);
			l.forEach(r -> r.setStatus(map.get(key.apply(r))));
		}
		
		/**
		 * 支払実績明細の補完を行う。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param upPayActDR 上り電文の支払実績明細
		 */
		protected void compUpPayActD(PayAct_Chk01_HdrR upPayActR, PayAct_Chk01_DtlR upPayActDR) {
			
			upPayActDR.pay_act_no(upPayActR.pay_act_no());
			upPayActDR.pay_act_seq(upPayActR.pay_act_seq());
			
			MST_PAY_ACT_D_R payActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.pay_act_d_seq());
			
			if (isDel(upPayActDR)) {
				upPayActDR.ap_appl_schd_no(payActDR.ap_appl_schd_no());
			}
			
			if (isNull(upPayActDR.ap_appl_schd_no())) {
				return;
			}
			MST_AP_APPL_SCHD_R apApplSchdR = getCacheApApplSchdR(upPayActDR.ap_appl_schd_no());
			upPayActDR.pay_schd_no(apApplSchdR.pay_schd_no());
			MST_PAY_SCHD_R paySchdR = getCachePaySchdR(upPayActDR.pay_chk_mng_no(), upPayActDR.pay_schd_no());
			MST_PAY_CHK_R payChkR = getCachePayChkR(upPayActDR.pay_chk_mng_no());
			
			if (!isNull(upPayActDR.ap_setoff_typ()) && !MAC_AP_SETOFF_TYP.isFLEX(upPayActDR.ap_setoff_typ())) {
				upPayActDR.setoff_nm(upPayActDR.setoff_nm_mst());
			}
			
			upPayActDR.pay_chk_no(payChkR.pay_chk_no());
			
			if (!isNull(payActDR)) {
				upPayActDR.rcv_no(payActDR.rcv_no());
			}
			if (isCrt(upPayActDR) && !isNull(upPayActDR.ap_appl_schd_no())) {
				
				upPayActDR.bsppl_cd(payChkR.bsppl_cd());
				upPayActDR.bsppl_dpt_cd(payChkR.bsppl_dpt_cd());
				upPayActDR.asppl_cd(paySchdR.asppl_cd());
				upPayActDR.ap_dpt_cd(paySchdR.ap_dpt_cd());
				upPayActDR.purc_act_no(apApplSchdR.purc_act_no());
				upPayActDR.rcpt_iv_mng_no(apApplSchdR.rcpt_iv_mng_no());
				upPayActDR.rcpt_iv_no(apApplSchdR.rcpt_iv_no());
				upPayActDR.wrk_no(payChkR.wrk_no());
				upPayActDR.ap_typ(paySchdR.ap_typ());
			}
			else if (!isNull(upPayActDR.pay_act_d_no())) {
				
				upPayActDR.bsppl_cd(payActDR.bsppl_cd());
				upPayActDR.bsppl_dpt_cd(payActDR.bsppl_dpt_cd());
				upPayActDR.asppl_cd(payActDR.asppl_cd());
				upPayActDR.ap_dpt_cd(payActDR.ap_dpt_cd());
				upPayActDR.purc_act_no(payActDR.purc_act_no());
				upPayActDR.rcpt_iv_mng_no(payActDR.rcpt_iv_mng_no());
				upPayActDR.rcpt_iv_no(payActDR.rcpt_iv_no());
				upPayActDR.wrk_no(payActDR.wrk_no());
				upPayActDR.ap_typ(payActDR.ap_typ());
			}
		}
		
		/**
		 * 上り電文の支払実績明細のインデックスを作成する。
		 */
		protected void createUpIndex() {
			
			_upPayActDIdxkey = up1().createIndex(PayAct_Chk01_HdrR.$hdr_peg_no);
		}
		
		/**
		 * 支払実績ヘッダに紐付く支払実績明細を取得する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @return 支払実績ヘッダに紐付く支払実績明細リスト
		 */
		protected MCList<PayAct_Chk01_DtlR> getUpPayActDL(PayAct_Chk01_HdrR upPayActR) {

			return up1().subList(_upPayActDIdxkey, upPayActR.hdr_peg_no());
		}
	}
	
	/**
	 * PayAct_Upd01オペレーション.<p>
	 *
	 * 支払実績を登録・更新・削除する。関連するテーブルを更新する。<br>
	 */
	public class PayAct_Upd01 extends MSBHL_PayActRegService_MC_A.PayAct_Upd01 {
		
		/**
		 * 上り電文の支払実績明細のインデックス
		 */
		protected MCIndexKey _upPayActDIdxkey = null;
		
		/**
		 * 支払実績明細リスト
		 */
		protected MCList<MST_PAY_ACT_D_R> _payActDL = null;
		
		/**
		 * 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		
		/**
		 * 支払予定リスト
		 */
		protected MCList<MST_PAY_SCHD_R> _paySchdL = null;
		
		/**
		 * 買掛金相殺入金サービスの下り電文
		 */
		protected MCList<ApSetoffRcv_Chk01_DtlR> _apSetoffRcvUpd01Rslt = null;
		
		/**
		 * 買掛金相殺入金サービスの下り電文のインデックス（紐付けＮＯ）
		 */
		protected MCIndexKey _apSetoffRcvIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initDptCache();
			
			createUpIndex();
			
			doNoSeqCache();
			
			setNo();
			
			calcComPaidAmt();
			
			calcBaseCurAmt();
			
			callApSetoffRcvServiceUpd01();
			
			updPayAct();
			
			updPayActD();
			
			updApApplSchd();
			
			updPaySchd();
			
			updPayChk();
			
			updPayNote();
			
			updApExcGainLoss();
			
			updPayActDBaseCurAmt();
			
			callCredServiceUpd02();
			
			updAdvPayAct();
			
			callAprvServiceUpd02();
			
			callAprvServiceUpd03();
			
			callPayActIfCrtServiceIns01();
			
			setDown();
		}
		
		/**
		 * 発番するＮＯのキャッシュを作成する。
		 */
		protected void doNoSeqCache() {
			
			// 支払手形管理ＮＯ
			MCList<PayAct_Chk01_HdrR> crtUpPayActL = up0().subList(r->isCrt(r));
			int payNoteCnt = 0;
			for (PayAct_Chk01_HdrR crtUpPayActR : crtUpPayActL) {
				// ヘッダに紐づく明細が新規かつ債務決済区分＝'5'（手形）が存在する場合に、支払手形管理ＮＯの発番対象とする
				MCList<PayAct_Chk01_DtlR> crtUpPayNoteDL = up1().subList(r->isCrt(r) && isSame(crtUpPayActR.hdr_peg_no(), r.hdr_peg_no()) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ()));
				if (!isNull(crtUpPayNoteDL)) {
					payNoteCnt++;
				}
			}
			if (payNoteCnt > 0) {
				doSeqCache(MSC_NUM_SYS_TYP.PAYNOTEMNG, payNoteCnt);
			}
			
			// 支払実績明細ＮＯ
			MCList<PayAct_Chk01_DtlR> crtUpPayActDL = up1().subList(r->(isCrt(r) || (isUpd(r) && isNull(r.pay_act_d_no()))));
			if (!crtUpPayActDL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.PAYACTD, crtUpPayActDL.size());
			}
		}
		
		/**
		 * 支払実績ＮＯを発番し、支払実績明細に反映する。
		 */
		protected void setNo() {
			
			// 支払実績ＮＯ発番対象取得
			MCList<ElmArgsR> payActNoL = MCList.create(ElmArgsR.class);
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				if (isCrt(upPayActR)) {
					payActNoL.add(getPayActNoArgs(upPayActR));
				}
			}
			
			// 支払実績ＮＯ発番
			if (!payActNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.PAYACT, payActNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{PayAct_Chk01_HdrR.$pay_act_no};
				copyByPegNo(up0(), payActNoL, PayAct_Chk01_HdrR.$hdr_peg_no, destCols, 
						ElmArgsR.$peg_no, srcCols);
			}
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				if (isCrt(upPayActR)) {
					upPayActR.pay_act_seq(1);
				}
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					if (isCrt(upPayActR) || (isUpd(upPayActR) && isCrt(upPayActDR))) {
						// 発番した支払実績ＮＯ、支払実績連番を支払実績明細に反映する
						upPayActDR.pay_act_no(upPayActR.pay_act_no());
						if (isUpd(upPayActR)) {
							upPayActDR.pay_act_seq(upPayActR.pay_act_seq().add(2));
						}
						else {
							upPayActDR.pay_act_seq(upPayActR.pay_act_seq());
						}
					}
				}
				
				// 支払手形管理ＮＯを設定
				MCList<PayAct_Chk01_DtlR> payNoteDL = upPayActDL.subList(r->((isCrt(r) || isUpd(r)) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())));
				if ((isCrt(upPayActR) && !isNull(payNoteDL)) || (isUpd(upPayActR) && isNull(upPayActR.pay_note_mng_no()) && !isNull(payNoteDL))) {
					upPayActR.pay_note_mng_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNOTEMNG));
					upPayActR.pay_note_mng_seq(1);
				}
				
				// 支払実績明細ＮＯを設定
				for (PayAct_Chk01_DtlR dtlR : upPayActDL) {
					if (isCrt(upPayActR) || (isUpd(upPayActR) && isNull(dtlR.pay_act_d_no()))) { 
						dtlR.pay_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.PAYACTD));
						dtlR.pay_act_d_seq(1);
					}
				}
			}
		}
		
		/**
		 * 手数料の税抜金額と税額を算出する。
		 */
		protected void calcComPaidAmt() {
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				if (isCrt(upPayActR) || isUpd(upPayActR)) {
					
					MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
					
					for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
						
						if (isDel(upPayActDR)) {
							continue;
						}
						if (MAC_AP_STTL_TYP.is_com_paid(upPayActDR.ap_sttl_typ()) || MAC_AP_STTL_TYP.isSETOFF(upPayActDR.ap_sttl_typ())) {
							
							upPayActDR.trd_cur_com_paid_tax_amt(MAUCL_AmtUtil.getIncTaxAmt(
									upPayActDR.trd_cur_amt(), 
									upPayActDR.trd_cur_com_paid_tax_rate(), 
									upPayActR.trd_cur_amt_dec_place(), 
									getCo().com_paid_tax_rnd_typ()));
							
							upPayActDR.trd_cur_exc_com_paid(upPayActDR.trd_cur_amt().subtract(upPayActDR.trd_cur_com_paid_tax_amt()));
						}
					}
				}
			}
		}
		
		/**
		 * 金額項目を基準通貨に換算する。
		 */
		protected void calcBaseCurAmt() {
			
			MCList<PayAct_Chk01_HdrR> upPayActL = up0().subList(r->isCrt(r) || isUpd(r));
			
			MCList<PayAct_Chk01_DtlR> advPayActAdjustTgtL = MCList.create(PayAct_Chk01_DtlR.class);
			
			for (PayAct_Chk01_HdrR upPayActR : upPayActL) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isCrt(r) || isUpd(r));
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					
					if (!upPayActDR.base_cur_amt_not_calc_flg() || isNull(upPayActDR.base_cur_amt())) {
						// 基準通貨金額計算対象外フラグがオフ、またはオンだが基準通貨金額が未設定の場合は従来通り計算する
						upPayActDR.base_cur_amt(convToBaseCur(upPayActDR.trd_cur_amt(), upPayActR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
					}
					if (!isNull(upPayActDR.trd_cur_com_paid_tax_amt())) {
						upPayActDR.base_cur_com_paid_tax_amt(convToBaseCur(upPayActDR.trd_cur_com_paid_tax_amt(), upPayActR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
						upPayActDR.base_cur_exc_com_paid(upPayActDR.base_cur_amt().subtract(upPayActDR.base_cur_com_paid_tax_amt()));
					}
					
					if (isAdvPayActAdjustTgt(upPayActR, upPayActDR)) {
						advPayActAdjustTgtL.add(upPayActDR);
					}
				}
			}
			
			doAdvPayActAdjust(advPayActAdjustTgtL);
		}
		
		/**
		 * 前渡金調整を行う対象か評価する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param upPayActDR 上り電文の支払実績明細
		 * @return 対象の場合はtrue
		 */
		protected boolean isAdvPayActAdjustTgt(PayAct_Chk01_HdrR upPayActR, PayAct_Chk01_DtlR upPayActDR) {
			
			return (isCrt(upPayActR) || isUpd(upPayActR)) 
					&& !isSame(upPayActR.trd_cur_cd(), upPayActR.base_cur_cd())
					&& MAC_AP_STTL_TYP.isSETOFF(upPayActDR.ap_sttl_typ())
					&& !isNull(upPayActDR.adv_pay_act_no());
		}
		
		/**
		 * 前渡金調整を行う。
		 * @param advPayActAdjustTgtL 前渡金調整対象リスト
		 */
		protected void doAdvPayActAdjust(MCList<PayAct_Chk01_DtlR> advPayActAdjustTgtL) {
			
			if (advPayActAdjustTgtL.isEmpty()) {
				return;
			}
			
			// 前渡金実績を取得する
			MCList<MST_ADV_PAY_ACT_R> advPayActL = getAdvPayActL(advPayActAdjustTgtL);
			MCIndexKey advPayActIdxkey = advPayActL.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no);
			
			// 前渡金支払実績ＮＯで支払実績を取得する
			MCList<MST_PAY_ACT_D_R> advPayActDL = getAdvPayActDL(advPayActAdjustTgtL);
			MCIndexKey advPayActDIdxkey = advPayActDL.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no);
			
			for (MCList<PayAct_Chk01_DtlR> upPayActDGrpL : advPayActAdjustTgtL.groupList(PayAct_Chk01_DtlR.$adv_pay_act_no)) {
				// 前渡金支払実績ＮＯ単位で調整を行う
				
				// 同一キーの相殺対象金額
				MCNumber sameKeyTrdCurAmt = MCNumber.ZERO;
				MCNumber sameKeyBaseCurAmt = MCNumber.ZERO;
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDGrpL) {
					
					MST_ADV_PAY_ACT_R advPayActR = advPayActL.getFirst(advPayActIdxkey, upPayActDR.adv_pay_act_no());
					
					MCList<MST_PAY_ACT_D_R> subAdvPayActDL = advPayActDL.subList(advPayActDIdxkey, upPayActDR.adv_pay_act_no());
					
					// 前渡金の取引通貨相殺実績額(同一キーの相殺対象金額を含む)
					MCNumber didSetOffActTrdCurAmt = sameKeyTrdCurAmt.add(nvl(subAdvPayActDL.sum(MST_PAY_ACT_D_R.$trd_cur_amt), MCNumber.ZERO));
					
					// 調整金額
					MCNumber adjustAmt = MCNumber.ZERO;
					if (advPayActR.trd_cur_setoff_tgt_amt().subtract(sum(didSetOffActTrdCurAmt, upPayActDR.trd_cur_amt())).isZero()) {
						// 前渡金の取引通貨相殺対象金額ー前渡金の取引通貨相殺実績額ー今回登録する前渡金の取引通貨相殺実績額が0になった場合が調整対象とする
						
						// 前渡金の基準通貨相殺実績額(同一キーの相殺対象金額を含む)
						MCNumber didSetOffActBaseCurAmt = sameKeyBaseCurAmt.add(nvl(subAdvPayActDL.sum(MST_PAY_ACT_D_R.$base_cur_amt), MCNumber.ZERO));
						
						// 調整金額＝前渡金の基準通貨相殺対象金額ー前渡金の基準通貨相殺実績額ー今回登録する前渡金の基準通貨相殺実績額
						adjustAmt = advPayActR.base_cur_setoff_tgt_amt().subtract(sum(didSetOffActBaseCurAmt, upPayActDR.base_cur_amt()));
						
						upPayActDR.base_cur_amt(upPayActDR.base_cur_amt().add(adjustAmt));
					}
					else {
						sameKeyTrdCurAmt = sameKeyTrdCurAmt.add(upPayActDR.trd_cur_amt());
						sameKeyBaseCurAmt = sameKeyBaseCurAmt.add(upPayActDR.base_cur_amt());
					}
				}
			}
		}
		
		/**
		 * 引数で指定された前渡金調整対象で前渡金実績を取得する。
		 * @param advPayActAdjustTgtL 前渡金調整対象リスト
		 * @return  前渡金実績リスト
		 */
		protected MCList<MST_ADV_PAY_ACT_R> getAdvPayActL(MCList<PayAct_Chk01_DtlR> advPayActAdjustTgtL) {
			
			MCList<MST_ADV_PAY_ACT_R> advPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
			MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
			MCQueryApiBuilder advPayActL_bldr = MCQueryApiBuilder.create(t);
			
			advPayActL_bldr.setWhere(createWhere(t, MST_ADV_PAY_ACT_R.$adv_pay_act_no));
			
			advPayActL_bldr.addConstWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBHL5040_MST_ADV_PAY_ACT_S01", advPayActL, advPayActL_bldr, advPayActAdjustTgtL, null);
			
			return advPayActL;
		}
		
		/**
		 * 引数で指定された前渡金調整対象で支払実績明細を取得する。
		 * @param advPayActAdjustTgtL 前渡金調整対象リスト
		 * @return  支払実績明細リスト
		 */
		protected MCList<MST_PAY_ACT_D_R> getAdvPayActDL(MCList<PayAct_Chk01_DtlR> advPayActAdjustTgtL) {
			
			MST_PAY_ACT_R t1 = MST_PAY_ACT_R.create("T1");

			MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(t);
			
			payActDL_bldr.addInnerJoin(t1, bracket( t.pay_act_no.eq(t1.pay_act_no) .and(t.pay_act_seq.eq(t1.pay_act_seq))));
			
			payActDL_bldr.setWhere(createWhere(t, MST_PAY_ACT_D_R.$adv_pay_act_no));
			
			payActDL_bldr.addConstWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBHL5040_MST_PAY_ACT_D_S02", payActDL, payActDL_bldr, advPayActAdjustTgtL, null);
			
			return payActDL;
		}
		
		/**
		 * 買掛金相殺入金登録サービスの登録・訂正・取消を実行する。
		 */
		protected void callApSetoffRcvServiceUpd01() {

			MSBGL_ApSetoffRcvService.ApSetoffRcv_Upd01 ope = MSBGL_ApSetoffRcvService.crtApSetoffRcv_Upd01();
			
			for (PayAct_Chk01_DtlR upPayActDR : up1()) {
				
				MCList<ApSetoffRcv_Chk01_DtlR> chkRsltL = null;
				String tmpApSttlTyp = null;
				String tmpApSetoffTyp = null;
				
				MST_PAY_ACT_D_R payActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.pay_act_d_seq());
				
				if (MAC_DATA_CRUD_TYP.isDEL(upPayActDR.data_crud_typ())) {
					tmpApSttlTyp = payActDR.ap_sttl_typ();
					tmpApSetoffTyp = payActDR.ap_setoff_typ();
				}
				else {
					tmpApSttlTyp = upPayActDR.ap_sttl_typ();
					tmpApSetoffTyp = upPayActDR.ap_setoff_typ();
				}
				
				if (MAC_AP_STTL_TYP.isSETOFF(tmpApSttlTyp) && MAC_AP_SETOFF_TYP.isACST(tmpApSetoffTyp)) {
					chkRsltL = getApSetoffRcvChk01RsltCache(upPayActDR.peg_no());
				}
				
				if (!isNull(chkRsltL) && !chkRsltL.isEmpty()) {
					chkRsltL.setValueNE(ApSetoffRcv_Chk01_DtlR.$pay_act_no, upPayActDR.pay_act_no());
					ope.up0().addAll(chkRsltL);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				
				_apSetoffRcvUpd01Rslt = ope.down0();
				_apSetoffRcvIdxkey = _apSetoffRcvUpd01Rslt.createIndex(ApSetoffRcv_Chk01_DtlR.$peg_no);
			}
		}
		
		/**
		 * 引数で指定された紐付けＮＯで買掛金相殺入金サービスの下り電文を取得する。
		 * @param pegNo 紐付けＮＯ
		 * @return 買掛金相殺入金サービスの下り電文
		 */
		protected ApSetoffRcv_Chk01_DtlR getApSetoffRcvUpd01Rslt(MCNumber pegNo) {
			
			if (!isNull(_apSetoffRcvUpd01Rslt)) {
				
				return _apSetoffRcvUpd01Rslt.getFirst(_apSetoffRcvIdxkey, pegNo);
			}
			
			return null;
		}
		
		/**
		 * 支払実績を更新する。
		 */
		protected void updPayAct() {
			MST_PAY_ACT_R t = MST_PAY_ACT_R.create("T");
			MCList<MST_PAY_ACT_R> insPayActL = MCList.create(MST_PAY_ACT_R.class);
			MCList<MST_PAY_ACT_R> updPayActL = MCList.create(MST_PAY_ACT_R.class);
			MCQueryApiBuilder updPayActL_bldr = MCQueryApiBuilder.create(t);
			updPayActL_bldr.setSet(t.slip_sts_typ);
			MST_PAY_ACT_R srcPayActR = null;
			up0().addStringColumn("del_trd_cur_cd");
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				if (isUpd(upPayActR) || isDel(upPayActR)) {
					
					srcPayActR = getCachePayActR(upPayActR.pay_act_no());
					
					// 無効伝票
					MST_PAY_ACT_R disPayActR = srcPayActR.clone();
					setPayActDisDefVal(disPayActR);
					updPayActL.add(disPayActR);
					
					// 取消伝票
					MST_PAY_ACT_R canPayActR = srcPayActR.clone();
					setPayActCanDefVal(upPayActR, canPayActR, srcPayActR);
					if (isDel(upPayActR)) {
						upPayActR.setValueNE("del_trd_cur_cd", srcPayActR.trd_cur_cd());
					}
					insPayActL.add(canPayActR);
				}
				
				if (isCrt(upPayActR) || isUpd(upPayActR)) {
					
					// 新規伝票
					setPayActCrtDefVal(upPayActR, srcPayActR);
					
					insPayActL.add(upPayActR.pa());
				}
			}
			
			dbUpdateKey("MSBHL5040_MST_PAY_ACT_U01", updPayActL, updPayActL_bldr);
			
			convDptCd(insPayActL);
			dbInsertEx("MSBHL5040_MST_PAY_ACT_I01", insPayActL, MCQueryApiBuilder.create(MST_PAY_ACT_R.create("T")));
		}
		
		/**
		 * 支払実績ヘッダの部門ＣＤを変換する。
		 */
		protected void convDptCd(MCList<MST_PAY_ACT_R> payActL) {
			
			MCList<MST_PAY_ACT_R> convL = MCList.create(MST_PAY_ACT_R.class);
			convL.addStringColumn("dis_ac_dt");
			convL.addStringColumn("can_ac_dt ");
			convL.addNumberColumn("peg_no");
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MST_PAY_ACT_R srcPayActR = getCachePayActR(upPayActR.pay_act_no());
				if (!isNull(srcPayActR) && !isSame(upPayActR.can_ac_dt(), srcPayActR.ac_dt())) {
					
					MST_PAY_ACT_R convR = MST_PAY_ACT_R.create();
					convR.pay_dpt_cd(srcPayActR.pay_dpt_cd());
					convR.so_dpt_cd(srcPayActR.so_dpt_cd());
					convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PAY_ACT_R.$pay_dpt_cd), upPayActR.pay_dpt_cd());
					convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PAY_ACT_R.$so_dpt_cd), upPayActR.so_dpt_cd());
					
					convR.ac_dt(upPayActR.ac_dt());
					convR.setDateNE("dis_ac_dt", srcPayActR.ac_dt());
					convR.setDateNE("can_ac_dt", upPayActR.can_ac_dt());
					convR.setNumberNE("peg_no", upPayActR.hdr_peg_no());
					
					convR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
					
					convL.add(convR);
				}
			}
			
			if (!convL.isEmpty()) {
				
				String[] tgtKeys = { MST_PAY_ACT_R.$pay_dpt_cd, MST_PAY_ACT_R.$so_dpt_cd };
				MAUCL_DptUtil.setCanDpt(convL, tgtKeys, null);
				
				for (MST_PAY_ACT_R convR : convL) {
					convR.wg_cd(getDptCache(convR.pay_dpt_cd(), convR.getDateNE("can_ac_dt")).wg_cd());
				}
				
				String[] cols = { MST_PAY_ACT_R.$pay_dpt_cd, MST_PAY_ACT_R.$so_dpt_cd, MST_PAY_ACT_R.$wg_cd};
				copyByPegNo(payActL, cols, convL, cols);
			}
		}
		
		/**
		 * 支払実績の新規伝票の初期値を設定する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param srcPayActR 更新対象の支払実績ヘッダ
		 */
		protected void setPayActCrtDefVal(PayAct_Chk01_HdrR upPayActR, MST_PAY_ACT_R srcPayActR) {
			
			if (isCrt(upPayActR)) {
				upPayActR.pa().pay_act_seq(1);
				upPayActR.pa().pay_act_rev(1);
			}
			else if (isUpd(upPayActR)) {
				upPayActR.pa().pay_act_seq(srcPayActR.pay_act_seq().add(2));
				upPayActR.pa().pay_act_rev(srcPayActR.pay_act_rev().add(1));
			}
			
			upPayActR.pa().slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			upPayActR.pa().ac_ym(getAcYm(upPayActR.pa().ac_dt()));
			upPayActR.pa().base_cur_cd(getCo().base_cur_cd());
			upPayActR.pa().xrate_cd(getCo().purc_xrate_cd());
		}
		
		/**
		 * 支払実績の無効伝票の初期値を設定する。
		 * @param disPayActR 支払実績の無効伝票
		 */
		protected void setPayActDisDefVal(MST_PAY_ACT_R disPayActR) {
			
			disPayActR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
		}
		
		/**
		 * 支払実績の取消伝票の初期値を設定する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param canPayActR 支払実績の無効伝票
		 * @param srcPayActR  更新対象の支払実績ヘッダ
		 */
		protected void setPayActCanDefVal(PayAct_Chk01_HdrR upPayActR, MST_PAY_ACT_R canPayActR, MST_PAY_ACT_R srcPayActR) {
			
			canPayActR.pay_act_seq(srcPayActR.pay_act_seq().add(1));
			canPayActR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			canPayActR.ac_dt(upPayActR.can_ac_dt());
			canPayActR.ac_ym(getAcYm(upPayActR.can_ac_dt()));
			canPayActR.setNumberNE("peg_no", upPayActR.hdr_peg_no());
		}
		
		/**
		 * 支払実績明細を更新する。
		 */
		protected void updPayActD() {

			_payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			_payActDL.addStringColumn("slip_sts_typ");
			
			MST_PAY_ACT_D_R srcPayActDR = null;
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
				
				for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
					
					if (isUpd(upPayActDR) || isDel(upPayActDR)) {
						
						srcPayActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.pay_act_d_seq());
						
						// 取消伝票
						MST_PAY_ACT_D_R canPayActDR = srcPayActDR.clone();
						setPayActDCanDefVal(upPayActR, upPayActDR, canPayActDR, srcPayActDR);
						_payActDL.add(canPayActDR);
					}
					
					if (isCrt(upPayActDR) || isUpd(upPayActDR)) {
						
						// 新規伝票
						setPayActDCrtDefVal(upPayActR, upPayActDR, srcPayActDR);
						_payActDL.add(upPayActDR.pad());
					}
				}
			}
			
			convDptCdD(_payActDL);
			dbInsertEx("MSBHL5040_MST_PAY_ACT_D_I01", _payActDL, MCQueryApiBuilder.create(MST_PAY_ACT_D_R.create("T")));
		}
		
		/**
		 * 支払実績明細の部門ＣＤを変換する。
		 */
		protected void convDptCdD(MCList<MST_PAY_ACT_D_R> payActDL) {
			
			MCList<MST_PAY_ACT_D_R> convL = MCList.create(MST_PAY_ACT_D_R.class);
			convL.addDateColumn("ac_dt");
			convL.addDateColumn("dis_ac_dt");
			convL.addDateColumn("can_ac_dt");
			convL.addNumberColumn("peg_no");
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MST_PAY_ACT_R srcPayActR = getCachePayActR(upPayActR.pay_act_no());
				
				if (!isNull(srcPayActR) && !isSame(upPayActR.can_ac_dt(), srcPayActR.ac_dt())) {
					
					MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR);
					
					for (PayAct_Chk01_DtlR upPayActDR : upPayActDL) {
						
						MST_PAY_ACT_D_R srcPayActDR = getCachePayActDR(upPayActDR.pay_act_d_no(), upPayActDR.src_pay_act_d_seq());
							
						if (!isNull(srcPayActDR)) {
							
							MST_PAY_ACT_D_R convR = MST_PAY_ACT_D_R.create();
							
							convR.so_dpt_cd(srcPayActDR.so_dpt_cd());
							convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_PAY_ACT_D_R.$so_dpt_cd), upPayActDR.so_dpt_cd());
							
							convR.setDateNE("ac_dt", upPayActR.ac_dt());
							convR.setDateNE("dis_ac_dt", srcPayActR.ac_dt());
							convR.setDateNE("can_ac_dt", upPayActR.can_ac_dt());
							
							convR.setNumberNE("peg_no", upPayActDR.peg_no());
							
							convL.add(convR);
						}
					}
				}
			}
			
			if (!convL.isEmpty()) {
				
				String[] tgtKeys = { MST_PAY_ACT_R.$so_dpt_cd };
				MAUCL_DptUtil.setCanDpt(convL, tgtKeys, null);
				
				copyByPegNo(payActDL, tgtKeys, convL, tgtKeys);
			}
		}
		
		/**
		 * 支払実績明細の新規伝票の初期値を設定する。
		 * @param upPayActR 上り電文支払実績ヘッダ
		 * @param upPayActDR 上り電文の支払実績明細
		 * @param srcPayActDR 更新前の支払実績明細
		 */
		protected void setPayActDCrtDefVal(PayAct_Chk01_HdrR upPayActR, PayAct_Chk01_DtlR upPayActDR, MST_PAY_ACT_D_R srcPayActDR) {
			
			if (isCrt(upPayActDR)) {
				upPayActDR.pad().pay_act_d_seq(1);
			}
			else if (isUpd(upPayActDR)) {
				upPayActDR.pad().pay_act_d_seq(srcPayActDR.pay_act_d_seq().add(2));
				upPayActDR.src_pay_act_d_seq(srcPayActDR.pay_act_d_seq());
				upPayActDR.pad().pay_act_seq(srcPayActDR.pay_act_seq().add(2));
			}
			upPayActDR.pad().calc_tgt_pay_chk_mng_no(null);
			
			ApSetoffRcv_Chk01_DtlR apSetoffRcvR = getApSetoffRcvUpd01Rslt(upPayActDR.peg_no());
			if (!isNull(apSetoffRcvR)) {
				upPayActDR.pad().rcv_no(apSetoffRcvR.rcv_no());
			}
			
			upPayActDR.pad().setValueNE("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
		}
		
		/**
		 * 支払実績明細の取消伝票の初期値を設定する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param canPayActDR 取消伝票の支払実績明細
		 * @param srcPayActDR 更新前の支払実績明細
		 */
		protected void setPayActDCanDefVal(PayAct_Chk01_HdrR upPayActR, PayAct_Chk01_DtlR upPayActDR, MST_PAY_ACT_D_R canPayActDR, MST_PAY_ACT_D_R srcPayActDR) {
			
			canPayActDR.pay_act_seq(srcPayActDR.pay_act_seq().add(1));
			canPayActDR.calc_tgt_pay_chk_mng_no(null);
			canPayActDR.pay_act_d_seq(srcPayActDR.pay_act_d_seq().add(1));
			upPayActDR.src_pay_act_d_seq(srcPayActDR.pay_act_d_seq());
			
			if (!isNull(srcPayActDR.trd_cur_com_paid_tax_amt())) {
				canPayActDR.trd_cur_com_paid_tax_amt(srcPayActDR.trd_cur_com_paid_tax_amt().multiply(-1));
				canPayActDR.base_cur_com_paid_tax_amt(srcPayActDR.base_cur_com_paid_tax_amt().multiply(-1));
			}
			if (!isNull(srcPayActDR.trd_cur_exc_com_paid())) {
				canPayActDR.trd_cur_exc_com_paid(srcPayActDR.trd_cur_exc_com_paid().multiply(-1));
				canPayActDR.base_cur_exc_com_paid(srcPayActDR.base_cur_exc_com_paid().multiply(-1));
			}
			canPayActDR.trd_cur_amt(srcPayActDR.trd_cur_amt().multiply(-1));
			canPayActDR.base_cur_amt(srcPayActDR.base_cur_amt().multiply(-1));
			
			canPayActDR.ac_rsn_cd(srcPayActDR.ac_rsn_cd());
			
			canPayActDR.setValueNE("slip_sts_typ", MAC_SLIP_STS_TYP.CAN.value());
			canPayActDR.setNumberNE("peg_no", upPayActDR.peg_no());
		}
		
		/**
		 * 買掛消込予定を更新する。
		 */
		protected void updApApplSchd() {
		
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_PAY_ACT_D_R.$ap_appl_schd_no, 
					MST_PAY_ACT_D_R.$pay_schd_no, 
					MST_PAY_ACT_D_R.$pay_chk_mng_no);
			policy.sum(MST_PAY_ACT_D_R.$trd_cur_amt);
			
			MCList<MST_PAY_ACT_D_R> grpPayActDL = _payActDL.groupBy(policy);
			
			MCList<MST_AP_APPL_SCHD_R> apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
			
			MST_AP_APPL_SCHD_R updApApplSchdR = null;
			for (MST_PAY_ACT_D_R payActDR : grpPayActDL) {
				
				updApApplSchdR = MST_AP_APPL_SCHD_R.create();
				
				MST_AP_APPL_SCHD_R apApplSchdR = getCacheApApplSchdR(payActDR.ap_appl_schd_no());
				if (isNull(apApplSchdR)) {
					continue;
				}
				MST_PAY_SCHD_R paySchdR = getCachePaySchdR(payActDR.pay_chk_mng_no(), payActDR.pay_schd_no());
				
				updApApplSchdR.ap_appl_schd_no(apApplSchdR.ap_appl_schd_no());
				updApApplSchdR.trd_cur_appl_amt(apApplSchdR.trd_cur_appl_amt());
				updApApplSchdR.trd_cur_amt(apApplSchdR.trd_cur_amt());
				updApApplSchdR.trd_cur_appl_amt(updApApplSchdR.trd_cur_appl_amt().add(payActDR.trd_cur_amt()));
				
				if (MAC_AP_STTL_TYP.is_com_paid(paySchdR.ap_sttl_typ())) {
					// 預金（手数料）、現金（手数料）の場合、支払実績明細（伝票状況区分「新規」）が発生したら、支払済にする。
					MCList<MST_PAY_ACT_D_R> subPayActDL = 
							_payActDL.subList(r->isSame(r.ap_appl_schd_no(), payActDR.ap_appl_schd_no()) && MAC_SLIP_STS_TYP.isCRT(r.getStringNE("slip_sts_typ")));
					if (!subPayActDL.isEmpty())  {
						updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
					}
					else {
						updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
					}
				}
				else {
					if (updApApplSchdR.trd_cur_appl_amt().isZero()) {
						updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
						
						if (updApApplSchdR.trd_cur_amt().isZero()) {
							MCList<MST_PAY_ACT_D_R> subPayActDL = 
									_payActDL.subList(r->isSame(r.ap_appl_schd_no(), payActDR.ap_appl_schd_no()) && MAC_SLIP_STS_TYP.isCRT(r.getStringNE("slip_sts_typ")));
							if (!subPayActDL.isEmpty())  {
								updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
							}
						}
					}
					else {
						MCNumber diffAmt = updApApplSchdR.trd_cur_amt().subtract(updApApplSchdR.trd_cur_appl_amt());
						
						if (diffAmt.isZero()){
							updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
						}
						else {
							updApApplSchdR.pay_sts_typ(MSC_PAY_STS_TYP.PART_PAY.value());
						}
					}
				}
				
				apApplSchdL.add(updApApplSchdR);
			}

			MST_AP_APPL_SCHD_R t = MST_AP_APPL_SCHD_R.create("T");
			MCQueryApiBuilder apApplSchdL_bldr = MCQueryApiBuilder.create(t);
			apApplSchdL_bldr.setSet(t.trd_cur_appl_amt, t.pay_sts_typ);
			
			dbUpdateKey("MSBHL5040_MST_AP_APPL_SCHD_U01", apApplSchdL, apApplSchdL_bldr);
		}
		
		/**
		 * 支払予定を更新する。
		 */
		protected void updPaySchd() {


		
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_PAY_ACT_D_R.$pay_chk_mng_no, MST_PAY_ACT_D_R.$pay_schd_no);
			policy.sum(MST_PAY_ACT_D_R.$trd_cur_amt);
			
			MCList<MST_PAY_ACT_D_R> grpPayActDL = _payActDL.groupBy(policy);
			
			_paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			
			MST_PAY_SCHD_R updPaySchdR = null;
					
			for (MST_PAY_ACT_D_R payActDR : grpPayActDL) {
				if (isNull(payActDR.pay_chk_mng_no())) {
					continue;
				}
				
				MST_PAY_SCHD_R paySchdR = getCachePaySchdR(payActDR.pay_chk_mng_no(), payActDR.pay_schd_no());
				
				updPaySchdR = MST_PAY_SCHD_R.create();
				updPaySchdR.pay_schd_no(paySchdR.pay_schd_no());
				updPaySchdR.pay_chk_mng_no(paySchdR.pay_chk_mng_no());
				updPaySchdR.trd_cur_appl_amt(paySchdR.trd_cur_appl_amt());
				updPaySchdR.trd_cur_amt(paySchdR.trd_cur_amt());
				updPaySchdR.trd_cur_appl_amt(updPaySchdR.trd_cur_appl_amt().add(payActDR.trd_cur_amt()));
				
				if (MAC_AP_STTL_TYP.is_com_paid(paySchdR.ap_sttl_typ())) {
					// 預金（手数料）、現金（手数料）の場合、支払実績明細（伝票状況区分「新規」）が発生したら、支払済にする。
					MCList<MST_PAY_ACT_D_R> subPayActDL = 
							_payActDL.subList(r->isSame(r.pay_schd_no(), payActDR.pay_schd_no()) && MAC_SLIP_STS_TYP.isCRT(r.getStringNE("slip_sts_typ")));
					if (!subPayActDL.isEmpty())  {
						updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
					}
					else {
						updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
					}
				}
				else {
					if (updPaySchdR.trd_cur_appl_amt().isZero()) {
						updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
						
						if (updPaySchdR.trd_cur_amt().isZero()) {
							MCList<MST_PAY_ACT_D_R> subPayActDL = 
									_payActDL.subList(r->isSame(r.pay_schd_no(), payActDR.pay_schd_no()) && MAC_SLIP_STS_TYP.isCRT(r.getStringNE("slip_sts_typ")));
							if (!subPayActDL.isEmpty())  {
								updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
							}
						}
					}
					else {
						MCNumber diffAmt = updPaySchdR.trd_cur_amt().subtract(updPaySchdR.trd_cur_appl_amt());
						if (diffAmt.isZero()){
							updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.PAY.value());
						}
						else {
							updPaySchdR.pay_sts_typ(MSC_PAY_STS_TYP.PART_PAY.value());
						}
					}
				}
				
				_paySchdL.add(updPaySchdR);
			}
			MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(t);
			paySchdL_bldr.setSet(t.trd_cur_appl_amt, t.pay_sts_typ);
			
			dbUpdateKey("MSBHL5040_MST_PAY_SCHD_U01", _paySchdL, paySchdL_bldr);
		}
		
		/**
		 * 支払照合ヘッダを更新する。
		 */
		protected void updPayChk() {
		
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			
			MST_PAY_CHK_R updPayChkR = null;
			for (MCList<MST_PAY_SCHD_R> paySchdL : _paySchdL.groupList(MST_PAY_SCHD_R.$pay_chk_mng_no)) {
				
				MCList<MST_PAY_SCHD_R> srcPaySchdL = getCachePaySchdL(paySchdL.get(0).pay_chk_mng_no());
				if (!isNull(srcPaySchdL)) {
					paySchdL.merge(srcPaySchdL, MST_PAY_SCHD_R.$pay_schd_no);
				}
				
				MST_PAY_CHK_R payChkR = getCachePayChkR(paySchdL.get(0).pay_chk_mng_no());
				
				updPayChkR = MST_PAY_CHK_R.create();
				updPayChkR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
				
				MCList<MST_PAY_SCHD_R> payStsTypL = paySchdL.distinctNE(MST_PAY_SCHD_R.$pay_sts_typ);
				
				if (payStsTypL.size() == 1) {
					updPayChkR.pay_sts_typ(payStsTypL.get(0).getStringNE(MST_PAY_SCHD_R.$pay_sts_typ));
				}
				else if (payStsTypL.size() > 1){
					updPayChkR.pay_sts_typ(MSC_PAY_STS_TYP.PART_PAY.value());
				}
				
				_payChkL.add(updPayChkR);
			}
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(t);
			payChkL_bldr.setSet(t.pay_sts_typ);
			dbUpdateKey("MSBHL5040_MST_PAY_CHK_U01", _payChkL, payChkL_bldr);
		}
		
		/**
		 * 支払手形を更新する。
		 */
		protected void updPayNote() {
			
			MST_PAY_NOTE_R t = MST_PAY_NOTE_R.create("T");

			MCList<MST_PAY_NOTE_R> insPayNoteL = MCList.create(MST_PAY_NOTE_R.class);
			MCList<MST_PAY_NOTE_R> updPayNoteL = MCList.create(MST_PAY_NOTE_R.class);
			MCQueryApiBuilder updPayNoteL_bldr = MCQueryApiBuilder.create(t);
			updPayNoteL_bldr.setSet(t.slip_sts_typ);
			
			MST_PAY_NOTE_R srcPayNoteR = null;
			
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MST_PAY_ACT_R payActR = getCachePayActR(upPayActR.pay_act_no());
				// 明細のデータ更新区分が、訂正or取消かつ債務決済区分＝'5'（手形）のレコードが存在している場合
				MCList<PayAct_Chk01_DtlR> upPayActDUpdDelL = getUpPayActDL(upPayActR).subList(r->(isUpd(r) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) || isDel(r));
				if (!isNull(upPayActDUpdDelL)) {
					
					srcPayNoteR = getCachePayNoteR(payActR.pay_act_no(), payActR.pay_act_seq());
					if (!isNull(srcPayNoteR)) {
						// 無効伝票
						MST_PAY_NOTE_R disPayNoteR = srcPayNoteR.clone();
						setPayNoteDisDefVal(disPayNoteR);
						updPayNoteL.add(disPayNoteR);
						
						// 取消伝票
						MST_PAY_NOTE_R canPayNoteR = srcPayNoteR.clone();
						setPayNoteCanDefVal(payActR, canPayNoteR, srcPayNoteR);
						insPayNoteL.add(canPayNoteR);
					}
				}
				
				// 明細のデータ更新区分が、新規or訂正かつ債務決済区分＝'5'（手形）のレコードが存在している場合
				MCList<PayAct_Chk01_DtlR> upPayActDCrtUpdL = getUpPayActDL(upPayActR).subList(r->(isCrt(r) || isUpd(r)) && MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ()));
				if (!isNull(upPayActDCrtUpdL)) {
					
					// 新規支払手形伝票
					setPayNoteCrtDefVal(upPayActR, srcPayNoteR);
					insPayNoteL.add(upPayActR.pn());
				}
			}
			
			dbUpdateKey("MSBHL5040_MST_PAY_NOTE_U01", updPayNoteL, updPayNoteL_bldr);

			MCQueryApiBuilder insPayNoteL_bldr = MCQueryApiBuilder.create(t);
			dbInsertEx("MSBHL5040_MST_PAY_NOTE_I01", insPayNoteL, insPayNoteL_bldr);
		}
		
		/**
		 * 支払手形の新規伝票のデフォルト値を設定する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @param srcPayNoteR 更新前の支払手形
		 */
		protected void setPayNoteCrtDefVal(PayAct_Chk01_HdrR upPayActR, MST_PAY_NOTE_R srcPayNoteR) {
			
			if (isCrt(upPayActR) || isNull(srcPayNoteR)) {
				upPayActR.pn().pay_act_seq(1);
				upPayActR.pn().pay_note_mng_seq(1);
			}
			else if (isUpd(upPayActR)) {
				upPayActR.pn().pay_act_seq(srcPayNoteR.pay_act_seq().add(2));
				upPayActR.pn().pay_note_mng_seq(srcPayNoteR.pay_note_mng_seq().add(2));
			}
			upPayActR.pn().slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			upPayActR.pn().note_amt(calcNoteAmt(upPayActR));
			upPayActR.pn().pay_act_no(upPayActR.pay_act_no());
			upPayActR.pn().pay_act_seq(upPayActR.pay_act_seq());
			upPayActR.pn().adv_pay_act_no(null);
			upPayActR.pn().adv_pay_act_seq(null);
			upPayActR.pn().a_imp_flg(false);
			upPayActR.pn().cur_cd(upPayActR.trd_cur_cd());
			
		}
		
		/**
		 * 手形額を算出する。<br>
		 * 支払実績明細の取引通貨金額を合計した値
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @return 手形額
		 */
		protected MCNumber calcNoteAmt(PayAct_Chk01_HdrR upPayActR) {
			
			String [] keys = {MST_PAY_ACT_D_R.$pay_act_no, MST_PAY_ACT_D_R.$pay_act_seq};
			MCList<MST_PAY_ACT_D_R> subPayActDL = _payActDL.subList(keys, upPayActR.toArray(keys));
			
			return subPayActDL.sum(MST_PAY_ACT_D_R.$trd_cur_amt);
		}
		
		/**
		 * 支払手形の無効伝票のデフォルト値を設定する。
		 * @param disPayNoteR 支払手形の無効伝票
		 */
		protected void setPayNoteDisDefVal(MST_PAY_NOTE_R disPayNoteR) {
			
			disPayNoteR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
		}
		
		/**
		 * 支払手形の取消伝票のデフォルト値を設定する。
		 * @param payNoteR 支払実績ヘッダ
		 * @param canPayNoteR 支払手形の取消伝票
		 * @param srcPayNoteR 更新前の支払手形
		 */
		protected void setPayNoteCanDefVal(MST_PAY_ACT_R payActR, MST_PAY_NOTE_R canPayNoteR, MST_PAY_NOTE_R srcPayNoteR) {
			
			canPayNoteR.pay_note_mng_seq(srcPayNoteR.pay_note_mng_seq().add(1));
			canPayNoteR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			canPayNoteR.note_amt(srcPayNoteR.note_amt().multiply(-1));
			canPayNoteR.pay_act_no(payActR.pay_act_no());
			canPayNoteR.pay_act_seq(payActR.pay_act_seq().add(1));
			canPayNoteR.a_imp_flg(false);
		}
		
		/**
		 * 債務為替差損益を更新する。
		 */
		protected void updApExcGainLoss() {
			
			insApExcGainLossForUpdDel();
			
			insApExcGainLossForCrtUpd();
		}
		
		/**
		 * 新規または更新対象の支払実績に紐付く為替差損益を登録する。
		 */
		protected void insApExcGainLossForCrtUpd() {
			
			up1().addNumberColumn("base_cur_adjust_amt", MCNumber.ZERO);
			
			MCList<PayAct_Chk01_DtlR> upPayActTgtDL = MCList.create(PayAct_Chk01_DtlR.class);
			for (PayAct_Chk01_HdrR upPayActR : up0()) {
				
				MCList<PayAct_Chk01_DtlR> upPayActDL = getUpPayActDL(upPayActR).subList(r->isApExcGainLossTgt(upPayActR, r));
				upPayActTgtDL.addAll(upPayActDL);
			}
			
			// 為替差損益の計算対象の買掛明細を取得する。
			MCList<MST_AP_D_R> apDL = getApDL(upPayActTgtDL);
			MCIndexKey apDIdxkey = apDL.createIndex(getApExcGainLossApDKeys());
			MCIndexKey apDIvIdxkey = apDL.createIndex(getApExcGainLossApDIvKeys());
			
			// 為替差損益の計算対象の支払実績明細を取得する。
			MCList<MST_PAY_ACT_D_R> payActDL = getPayActDL(upPayActTgtDL);
			MCIndexKey payActDIdxkey = payActDL.createIndex(getApExcGainLossPayActDKeys());
			
			// 為替差損益の計算対象の為替レート評価替を取得する。
			MCList<MST_AP_XRATE_REV_HIS_R> apXrateRevHisL = getApXrateRevHisL(payActDL);
			MCIndexKey apXrateRevHisIdx = apXrateRevHisL.createIndex(getApXrateRevHisKeys());
			
			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossL = MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);
			MST_AP_EXC_GAIN_LOSS_R apExcGainLossR = null;
			
			for (MCList<PayAct_Chk01_DtlR> grpUpPayActDL : upPayActTgtDL.groupList(getApExcGainLossPayActDKeys())) {
				
				// 同一キーの為替差損益合計
				MCNumber sameKeyExcGainLoss = MCNumber.ZERO;
				
				for (int i = 0; i < grpUpPayActDL.size(); i++) {
					
					PayAct_Chk01_DtlR upPayActDR = grpUpPayActDL.get(i);
					PayAct_Chk01_HdrR upPayActR = up0().getFirst(PayAct_Chk01_HdrR.$hdr_peg_no, upPayActDR.hdr_peg_no());
					
					MCList<MST_AP_D_R> subApDL = null;
					MCNumber purcXrate = null;
					MCNumber xrateRevHisGainLoss = MCNumber.ZERO;
					
					if (!isNullOrNullVal(upPayActDR.purc_act_no())) {
						subApDL = apDL.subList(apDIdxkey, upPayActDR.toArray(getApExcGainLossApDKeys()));
					}
					else {
						subApDL = apDL.subList(apDIvIdxkey, upPayActDR.toArray(getApExcGainLossApDIvKeys()));
					}

					MCList<MST_AP_XRATE_REV_HIS_R> subApXrateRevHisL =
						apXrateRevHisL.subList(	apXrateRevHisIdx,
							upPayActDR.asppl_cd(), upPayActDR.ap_dpt_cd(), upPayActR.trd_cur_cd(),
							upPayActDR.purc_act_no(), upPayActDR.rcpt_iv_mng_no(), upPayActDR.wrk_no(), upPayActDR.ap_typ());
					MST_AP_XRATE_REV_HIS_R hisXrateR = null;
					if (!isNull(subApXrateRevHisL)) {
						// 最新の評価替変更後レートを取得
						subApXrateRevHisL.sort(SortType.DESC, MST_AP_XRATE_REV_HIS_R.$ap_xrate_rev_his_no);
						hisXrateR = subApXrateRevHisL.get(0);
					}
					// 為替レートを取得
					MCRow row = MSBHL_ApUtil.getXRate(hisXrateR, subApDL);
					purcXrate = row.getNumber(MST_AP_D_R.$xrate);
					if (row.getBooleanNE("hisXrate")) {
						xrateRevHisGainLoss = subApXrateRevHisL.sum("exc_gain_loss");
					}
					
					// 仕入の取引通貨金額（税込）
					MCNumber purcTrdCurAmt = MCNumber.ZERO;
					// 仕入の基準通貨金額（税込）
					MCNumber purcBaseCurAmt = MCNumber.ZERO;
					for (MST_AP_D_R apDR : subApDL) {
						
						MCNumber dscntItmPm = MSBHL_ApUtil.getDscntItmPm(apDR.trd_ptn_typ(), apDR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg));
						
						purcTrdCurAmt = purcTrdCurAmt.add(sum(apDR.trd_cur_amt(), apDR.trd_cur_tax_amt()).multiply(
								MAC_TRD_PTN_TYP.ap_amt_pm(apDR.trd_ptn_typ())).multiply(dscntItmPm));
						purcBaseCurAmt = purcBaseCurAmt.add(sum(apDR.base_cur_amt(), apDR.base_cur_tax_amt()).multiply(
								MAC_TRD_PTN_TYP.ap_amt_pm(apDR.trd_ptn_typ())).multiply(dscntItmPm));
					}
					
					MCList<MST_PAY_ACT_D_R>
						subPayActDL = payActDL.subList(payActDIdxkey, upPayActDR.toArray(getApExcGainLossPayActDKeys())),
						subPayActDL2 = subPayActDL.createInstance();
						for (MST_PAY_ACT_D_R r : subPayActDL) {
							if (isSame(r.ap_sttl_typ(), MAC_AP_STTL_TYP.APSW_IN_CHK.value())
								|| isSame(r.ap_sttl_typ(), MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value())) {
								// 受入は除外
								continue;
							}
							else if (isSame(r.ap_sttl_typ(), MAC_AP_STTL_TYP.APSW_OUT_CHK.value())
								|| isSame(r.ap_sttl_typ(), MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value())) {
								
								String[] keys = {MST_PAY_ACT_D_R.$par_pay_act_d_no, MST_PAY_ACT_D_R.$par_pay_act_d_seq};
								Comparable<?>[] vals = new Comparable<?>[]{r.pay_act_d_no(), r.pay_act_d_seq()};
								if (!isNull(subPayActDL.getFirst(keys, vals))) {
									// 払出でも対になる受入がある場合は除外
									continue;
								}
							}
							subPayActDL2.add(r);
						}
					
					// 支払の取引通貨金額
					// 為替レート評価替えによって支払実績明細に対して複数の差損益が発生することがあるので、支払実績明細ごとの金額を取得する
					MCGroupByPolicy gp = new MCGroupByPolicy(
						MST_PAY_ACT_D_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_seq
					);
					gp.max(MST_PAY_ACT_D_R.$trd_cur_amt);	// 明細内はすべて同じ金額なのでMAXでもMINでもどちらでも構わない
					gp.max(MST_PAY_ACT_D_R.$base_cur_amt);
					MCNumber payTrdCurAmt = nvl(subPayActDL2.groupBy(gp).sum(MST_PAY_ACT_D_R.$trd_cur_amt), MCNumber.ZERO);
					
					if (isSame(upPayActR.xrate(), purcXrate) 
							&& (!isSame(purcTrdCurAmt, payTrdCurAmt) || i != grpUpPayActDL.size() - 1)) {
						// 為替レートが変わってないかつ全額支払いではない場合、為替差損益の更新対象としない。
						continue;
					}
					
					// 仕入時または評価替え後の為替レートで基準通貨金額を算出する
					MCNumber convPurcBaseCurAmt = convToBaseCur(upPayActDR.trd_cur_amt(), purcXrate, getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
					
					// 為替差損益 = 仕入時または評価替え後の為替レートで計算した基準通貨金額 - 基準通貨支払金額
					MCNumber excGainLoss = convPurcBaseCurAmt.subtract(upPayActDR.base_cur_amt());
					
					MCNumber adjustAmt = MCNumber.ZERO;
					boolean isAdjAmt = false;
					MCNumber paidSumExcGainLoss = null;
					if (isSame(purcTrdCurAmt, payTrdCurAmt) && i == grpUpPayActDL.size() - 1) {
						// 全額支払の場合、最終行のみ為替差損益の調整を行う
						
						// 基準通貨支払金額の合計
						MCNumber payBaseCurAmt = subPayActDL2.groupBy(gp).sum(MST_PAY_ACT_D_R.$base_cur_amt);
						// 過去の債務為替差損益の合計額
						paidSumExcGainLoss = sameKeyExcGainLoss.add(nvl(subPayActDL.sum(MST_AP_EXC_GAIN_LOSS_R.$exc_gain_loss), MCNumber.ZERO));
						
						// 調整額 = 仕入の基準通貨金額（税込） - (基準通貨支払金額の合計 + 過去の債務為替差損益の合計額 + 為替差損益(支払実績) + 為替差損益(評価替))
						adjustAmt = purcBaseCurAmt.subtract(
							sum(payBaseCurAmt, paidSumExcGainLoss, excGainLoss, xrateRevHisGainLoss)
						);
						isAdjAmt = true;
					}
					else {
						sameKeyExcGainLoss = sameKeyExcGainLoss.add(excGainLoss);
					}
					
					if (!excGainLoss.add(adjustAmt).isZero()) {
						// 為替差損益が発生した（0でない）の場合のみ作成する
						
						if (!isSame(upPayActR.xrate(), purcXrate)) {
							// 為替レートが変わった場合、為替差損益を作成する
							apExcGainLossR = MST_AP_EXC_GAIN_LOSS_R.create();
							apExcGainLossR.exc_gain_loss(excGainLoss.add(adjustAmt));
							apExcGainLossR.pay_act_d_no(upPayActDR.pay_act_d_no());
							apExcGainLossR.pay_act_d_seq(upPayActDR.pay_act_d_seq());
							
							apExcGainLossL.add(apExcGainLossR);
							if (row.getBooleanNE("hisXrate") && !xrateRevHisGainLoss.isZero()) {
								// 評価替分の為替差損益を作成
								MST_AP_EXC_GAIN_LOSS_R eglR =
									crtExcGainLoss4Rev(
										upPayActDR,
										hisXrateR, 
										MSBHL_ApUtil.getXRate(null, subApDL).getNumber(MST_AP_D_R.$xrate),
										isAdjAmt,
										xrateRevHisGainLoss,
										paidSumExcGainLoss);
								
								apExcGainLossL.add(eglR);
								
								apExcGainLossR.exc_gain_loss(apExcGainLossR.exc_gain_loss().subtract(eglR.exc_gain_loss()));
							}
						}
						else {
							// 為替レートが変わってない場合、支払実績の基準通貨金額を調整する。
							upPayActDR.setNumberNE("base_cur_adjust_amt", excGainLoss.add(adjustAmt));
						}
					}
				}
			}
			apExcGainLossL.removeIf(r -> r.exc_gain_loss().isZero());
			MCQueryApiBuilder apExcGainLossL_bldr = MCQueryApiBuilder.create(MST_AP_EXC_GAIN_LOSS_R.create("T"));
			dbInsertEx("MSBHL5040_MST_AP_EXC_GAIN_LOSS_I01", apExcGainLossL, apExcGainLossL_bldr);
		}
		protected MST_AP_EXC_GAIN_LOSS_R crtExcGainLoss4Rev(
			PayAct_Chk01_DtlR upPayActDR, MST_AP_XRATE_REV_HIS_R hisXrateR, MCNumber purcXrate,
			boolean isAdjAmt, MCNumber revGainLoss, MCNumber paidGainLoss) {
			
			// (支払額 * 評価替後レート) ー (支払額 * 仕入時レート)
			MCNumber excGainLoss1 = convToBaseCur(
					upPayActDR.trd_cur_amt(), hisXrateR.new_xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			MCNumber excGainLoss2 = convToBaseCur(
					upPayActDR.trd_cur_amt(), purcXrate,
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
					
			MCNumber excGainLoss = excGainLoss1.subtract(excGainLoss2);
			
			if (isAdjAmt) {
				// 全額支払の場合、最終行のみ為替差損益の調整を行う。xrateRevHisGainLoss に合わせる
				// excGainLoss と revGainLoss は符号が反転しているため、excGainLoss の符号に合わせた上で調整する
				MCNumber adjGainLoss =  
					revGainLoss.multiply(-1)
					.subtract(
						paidGainLoss.add(excGainLoss)
					);
				excGainLoss = excGainLoss.add(adjGainLoss);
			}
			
			MST_AP_EXC_GAIN_LOSS_R excGainLossR = MST_AP_EXC_GAIN_LOSS_R.create();
			excGainLossR.exc_gain_loss(excGainLoss);
			excGainLossR.pay_act_d_no(upPayActDR.pay_act_d_no());
			excGainLossR.pay_act_d_seq(upPayActDR.pay_act_d_seq());
			excGainLossR.ref_ap_xrate_rev_his_no(hisXrateR.ap_xrate_rev_his_no());
			
			return excGainLossR;
		}
		
		/**
		 * 為替差損益の計算対象か評価する。
		 * @param upPayActR 上り電文の支払実績
		 * @param upPayActDR 上り電文の支払実績明細
		 * @return 為替差損益の計算対象の場合はtrue
		 */
		protected boolean isApExcGainLossTgt(PayAct_Chk01_HdrR upPayActR, PayAct_Chk01_DtlR upPayActDR) {
			
			return (isCrt(upPayActDR) || isUpd(upPayActDR)) 
					&& !isSame(upPayActR.trd_cur_cd(), upPayActR.base_cur_cd())
					&& (MAC_AP_STTL_TYP.isACNT(upPayActDR.ap_sttl_typ()) 
							|| MAC_AP_STTL_TYP.isCASH(upPayActDR.ap_sttl_typ()) 
							|| MAC_AP_STTL_TYP.isNOTE(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isSETOFF(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_OUT_CHK(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(upPayActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(upPayActDR.ap_sttl_typ()));
		}
		
		/**
		 * 引数で指定された支払実績明細リストに紐付く為替レート評価替を取得する。
		 * @param payActDL 支払実績明細リスト
		 * @return 為替レート評価替リスト
		 */
		protected MCList<MST_AP_XRATE_REV_HIS_R> getApXrateRevHisL(MCList<MST_PAY_ACT_D_R> payActDL) {

			// 月次買掛残高テーブルのワークを利用する
			MCList<MST_MLY_AP_BAL_R> dbcWk = MCList.create(MST_MLY_AP_BAL_R.class);
			payActDL.groupBy(
					MST_PAY_ACT_D_R.$asppl_cd,
					MST_PAY_ACT_D_R.$ap_dpt_cd,
					MST_PAY_ACT_R.$trd_cur_cd,
					MST_PAY_ACT_D_R.$purc_act_no,
					MST_PAY_ACT_D_R.$rcpt_iv_mng_no,
					MST_PAY_ACT_D_R.$wrk_no,
					MST_PAY_ACT_D_R.$ap_typ).forEach(r -> {
				MST_MLY_AP_BAL_R dbcR = dbcWk.add();
				// 計上年月は使用しない
				dbcR.asppl_cd(r.asppl_cd());
				dbcR.ap_dpt_cd(r.ap_dpt_cd());
				dbcR.trd_cur_cd(r.getString(MST_PAY_ACT_R.$trd_cur_cd));
				dbcR.purc_act_no(r.purc_act_no());
				dbcR.rcpt_iv_mng_no(r.rcpt_iv_mng_no());
				dbcR.wrk_no(r.wrk_no());
				dbcR.ap_typ(r.ap_typ());
			});
			dbWkDelete("MSBHL5040_MSW_MLY_AP_BAL_D01", MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T")).getBaseDbc());
			dbWkInsert("MSBHL5040_MSW_MLY_AP_BAL_I01", dbcWk, MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T")).getBaseDbc());

			MCList<MST_AP_XRATE_REV_HIS_R>
				dbc = MCList.create(MST_AP_XRATE_REV_HIS_R.class);
			MSW_MLY_AP_BAL_KEY_R w1 = MSW_MLY_AP_BAL_KEY_R.create("W1");
			MST_AP_EXC_GAIN_LOSS_R t2 = MST_AP_EXC_GAIN_LOSS_R.create("T2");
			MST_AP_XRATE_REV_HIS_R t1 = MST_AP_XRATE_REV_HIS_R.create("T1");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbc.addNumberColumn("exc_gain_loss");
			dbc_bldr.setSelect(t1.ap_xrate_rev_his_no, t1.ac_ym, t1.asppl_cd, t1.ap_dpt_cd, t1.trd_cur_cd, t1.purc_act_no, t1.rcpt_iv_mng_no, t1.wrk_no, t1.ap_typ, t1.new_xrate, t2.exc_gain_loss);
			dbc_bldr.addInnerJoin(w1, bracket( w1.asppl_cd.eq(t1.asppl_cd) .and(w1.ap_dpt_cd.eq(t1.ap_dpt_cd)) .and(w1.trd_cur_cd.eq(t1.trd_cur_cd)) .and(w1.purc_act_no.eq(t1.purc_act_no)) .and(w1.rcpt_iv_mng_no.eq(t1.rcpt_iv_mng_no)) .and(w1.wrk_no.eq(t1.wrk_no)) .and(w1.ap_typ.eq(t1.ap_typ))));
			dbc_bldr.addInnerJoin(t2, bracket( t2.ap_xrate_rev_his_no.eq(t1.ap_xrate_rev_his_no) .and(t2.pay_act_d_no.isNull()) .and(t2.pay_act_d_seq.isNull()) .and(t2.ref_ap_xrate_rev_his_no.isNull())));
			dbSelect("MSBHL5040_MST_AP_XRATE_REV_HIS_S01", dbc, dbc_bldr);
			dbWkDelete("MSBHL5040_MSW_MLY_AP_BAL_D02", MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T")).getBaseDbc());
			
			return dbc;
		}
		
		/**
		 * 債務為替差損益を行う単位のキー項目を取得する。（為替レート評価替）
		 * @return 債務為替差損益を行う単位のキー項目
		 */
		protected String[] getApXrateRevHisKeys() {
			return new String[] {
				MST_AP_XRATE_REV_HIS_R.$asppl_cd, 
				MST_AP_XRATE_REV_HIS_R.$ap_dpt_cd, 
				MST_AP_XRATE_REV_HIS_R.$trd_cur_cd, 
				MST_AP_XRATE_REV_HIS_R.$purc_act_no, 
				MST_AP_XRATE_REV_HIS_R.$rcpt_iv_mng_no, 
				MST_AP_XRATE_REV_HIS_R.$wrk_no,
				MST_AP_XRATE_REV_HIS_R.$ap_typ
			};
		}
		
		/**
		 * 引数で指定された支払実績明細リストに紐付く為替差損益の計算対象の買掛明細を取得する。
		 * @param payActDL 支払実績明細リスト
		 * @return 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> getApDL(MCList<PayAct_Chk01_DtlR> payActDL) {
			
			MCList<PayAct_Chk01_DtlR> bindL = payActDL.clone();
			
			for (PayAct_Chk01_DtlR bindR : bindL) {
				
				bindR.purc_act_no(nullValToNull(bindR.purc_act_no()));
				bindR.rcpt_iv_mng_no(nullValToNull(bindR.rcpt_iv_mng_no()));
				bindR.rcpt_iv_no(nullValToNull(bindR.rcpt_iv_no()));
			}
			
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);
			apDL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			apDL_bldr.setSelect(t.ap_d_no, t.purc_act_no, t.rcpt_iv_mng_no, t.rcpt_iv_no,
					t.ap_typ, t.ac_ym, t.trd_ptn_typ, t.slip_sts_typ, t.asppl_cd,
					t.ap_dpt_cd, t.wrk_no, t.xrate, t.trd_cur_amt, t.trd_cur_tax_amt,
					t.base_cur_amt, t.base_cur_tax_amt, t.sw_src_ap_appl_schd_no,
					t.sw_src_ap_d_no);
			apDL_bldr.addSelect(m1.dscnt_itm_flg);
			apDL_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			apDL_bldr.setWhere(t.asppl_cd.eq(bind("asppl_cd")));
			apDL_bldr.addWhereWithAnd(t.ap_dpt_cd.eq(bind("ap_dpt_cd")));
			apDL_bldr.addWhereWithCutOffAnd(t.purc_act_no.eq(bind("purc_act_no")));
			apDL_bldr.addWhereWithCutOffAnd(t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			apDL_bldr.addWhereWithCutOffAnd(t.rcpt_iv_no.eq(bind("rcpt_iv_no")));
			apDL_bldr.addWhereWithAnd(t.ap_typ.eq(bind("ap_typ")));
			apDL_bldr.addWhereWithAnd(t.wrk_no.eq(bind("wrk_no")));
			apDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			
			dbSelect("MSBHL5040_MST_AP_D_S01", apDL, apDL_bldr, bindL);
			
			return apDL;
		}
		
		/**
		 * 債務為替差損益を行う単位のキー項目を取得する。（買掛明細）
		 * @return 債務為替差損益を行う単位のキー項目
		 */
		protected String[] getApExcGainLossApDKeys() {
			
			return new String[] {MST_AP_D_R.$asppl_cd, 
					MST_AP_D_R.$ap_dpt_cd, 
					MST_AP_D_R.$purc_act_no, 
					MST_AP_D_R.$ap_typ, 
					MST_AP_D_R.$wrk_no};
		}
		
		/**
		 * 債務為替差損益を行う単位のキー項目を取得する。（買掛明細・インボイス用）
		 * @return 債務為替差損益を行う単位のキー項目
		 */
		protected String[] getApExcGainLossApDIvKeys() {
			
			return new String[] {MST_AP_D_R.$asppl_cd, 
					MST_AP_D_R.$ap_dpt_cd, 
					MST_AP_D_R.$rcpt_iv_mng_no, 
					MST_AP_D_R.$rcpt_iv_no, 
					MST_AP_D_R.$ap_typ, 
					MST_AP_D_R.$wrk_no};
		}
		
		/**
		 * 引数で指定された支払実績明細リストに紐付く為替差損益の計算対象の支払実績リストを取得する。
		 * @param bindL 支払実績明細リスト
		 * @return 為替差損益の計算対象の支払実績リスト（過去分を含む）
		 */
		protected MCList<MST_PAY_ACT_D_R> getPayActDL(MCList<PayAct_Chk01_DtlR> bindL) {
			
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MST_PAY_ACT_R t1 = MST_PAY_ACT_R.create("T1");
			MST_AP_EXC_GAIN_LOSS_R t2 = MST_AP_EXC_GAIN_LOSS_R.create("T2");

			MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(t);
			payActDL.addStringColumn(MST_PAY_ACT_R.$trd_cur_cd);
			
			payActDL_bldr.addSelect(t1.trd_cur_cd);
			payActDL_bldr.addSelect(t2.exc_gain_loss);
			
			payActDL_bldr.addInnerJoin(t1, bracket( t.pay_act_no.eq(t1.pay_act_no) .and(t.pay_act_seq.eq(t1.pay_act_seq))));
			payActDL_bldr.addLeftOuterJoin(t2, bracket( t.pay_act_d_no.eq(t2.pay_act_d_no) .and(t.pay_act_d_seq.eq(t2.pay_act_d_seq))));
			
			payActDL_bldr.setWhere(createWhere(t, getApExcGainLossPayActDKeys()));
			payActDL_bldr.addWhereWithAnd(t.ap_sttl_typ.in(
							value(MAC_AP_STTL_TYP.ACNT.value()),
							value(MAC_AP_STTL_TYP.CASH.value()),
							value(MAC_AP_STTL_TYP.NOTE.value()),
							value(MAC_AP_STTL_TYP.SETOFF.value()),
							value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_IN_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value())));
			payActDL_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			
			dbSelect("MSBHL5040_MST_PAY_ACT_D_S03", payActDL, payActDL_bldr, bindL);
			
			return payActDL;
		}
		
		/**
		 * 債務為替差損益を行う単位のキー項目を取得する。（支払実績明細）
		 * @return 債務為替差損益を行う単位のキー項目
		 */
		protected String[] getApExcGainLossPayActDKeys() {
			
			return new String[] { MST_PAY_ACT_D_R.$asppl_cd, 
					MST_PAY_ACT_D_R.$ap_dpt_cd, 
					MST_PAY_ACT_D_R.$purc_act_no, 
					MST_PAY_ACT_D_R.$rcpt_iv_mng_no, 
					MST_PAY_ACT_D_R.$rcpt_iv_no, 
					MST_PAY_ACT_D_R.$ap_typ, 
					MST_PAY_ACT_D_R.$wrk_no };
		}
		
		/**
		 * 更新または削除対象の支払実績に紐付く為替差損益を取得し、符号を反転して新規登録する。<br>
		 * ※支払実績明細連番に＋１
		 */
		protected void insApExcGainLossForUpdDel() {
			
			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossL = getApExcGainLossL();
			
			for (MST_AP_EXC_GAIN_LOSS_R apExcGainLossR : apExcGainLossL) {
				apExcGainLossR.pay_act_d_seq(apExcGainLossR.pay_act_d_seq().add(1));
				apExcGainLossR.exc_gain_loss(apExcGainLossR.exc_gain_loss().multiply(-1));
			}
			dbInsertEx("MSBHL5040_MST_AP_EXC_GAIN_LOSS_I02", apExcGainLossL, MCQueryApiBuilder.create(MST_AP_EXC_GAIN_LOSS_R.create("T")));
		}
		
		/**
		 * 更新または削除対象の支払実績に紐付く為替差損益を取得する。
		 * @return 為替差損益リスト
		 */
		protected MCList<MST_AP_EXC_GAIN_LOSS_R> getApExcGainLossL() {
			
			MSW_AP_EXC_GAIN_LOSS_KEY_R w = MSW_AP_EXC_GAIN_LOSS_KEY_R.create("W");

			MCList<PayAct_Chk01_HdrR> updDelL = up0().subList(r->isUpd(r) || isDel(r));
			
			MCList<MST_AP_EXC_GAIN_LOSS_R> wkL = MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);
			
			for (PayAct_Chk01_HdrR upPayActR : updDelL) {
				
				for (PayAct_Chk01_DtlR dtlR : getUpPayActDL(upPayActR)) {
					if (!isCrt(dtlR)) {
						MST_AP_EXC_GAIN_LOSS_R wkR = MST_AP_EXC_GAIN_LOSS_R.create();
						wkR.pay_act_d_no(dtlR.pay_act_d_no());
						wkR.pay_act_d_seq(dtlR.src_pay_act_d_seq());
						wkL.add(wkR);
					}
				}
			}
			
			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossL = MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);
			if (!wkL.isEmpty()) {
				MST_AP_EXC_GAIN_LOSS_R t = MST_AP_EXC_GAIN_LOSS_R.create("T");
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
				
				dbWkDelete("MSBHL5040_MSW_AP_EXC_GAIN_LOSS_D01", wkL_bldr.getBaseDbc());
				
				dbWkInsert("MSBHL5040_MSW_AP_EXC_GAIN_LOSS_I01", wkL, wkL_bldr.getBaseDbc());
				
				MCQueryApiBuilder apExcGainLossL_bldr = MCQueryApiBuilder.create(t);
				apExcGainLossL_bldr.addInnerJoin(w, bracket( t.pay_act_d_no.eq(w.pay_act_d_no) .and(t.pay_act_d_seq.eq(w.pay_act_d_seq))));
				dbSelect("MSBHL5040_MST_AP_EXC_GAIN_LOSS_S01", apExcGainLossL, apExcGainLossL_bldr);
				
				dbWkDelete("MSBHL5040_MSW_AP_EXC_GAIN_LOSS_D02", wkL_bldr.getBaseDbc());
			}
			
			return apExcGainLossL;
		}
		
		/**
		 * 支払実績明細の基準通貨金額の調整を行う。（為替レートが変わってない場合、仕入と支払の端数処理による差額）
		 */
		protected void updPayActDBaseCurAmt() {
			
			MCGroupByPolicy policy = new MCGroupByPolicy(PayAct_Chk01_DtlR.$pay_act_no);
			policy.addKey(getApExcGainLossPayActDKeys());
			policy.sum("base_cur_adjust_amt");
			
			MCList<MST_PAY_ACT_D_R> updPayActDL = MCList.create(MST_PAY_ACT_D_R.class);
			updPayActDL.addNumberColumn("alloc_amt");
			
			for (PayAct_Chk01_DtlR upDtlR : up1().groupByNE(policy)) {
				
				if (!upDtlR.getNumberNE("base_cur_adjust_amt").isZero()) {
					
					MCList<MST_PAY_ACT_D_R> payActDL =_payActDL.subList(r->isBaseCurAmtAdjustTgt(r, upDtlR));
					
					payActDL.addNumberColumn("base_amt");
					if (payActDL.subList(r -> r.base_cur_amt().isZero()).size() == payActDL.size()) {
						// 全行０円⇒均等に割り当てる
						payActDL.forEach(r -> r.setNumber("base_amt", 1));
					}
					else {
						payActDL = payActDL.subList(r -> !r.base_cur_amt().isZero());
						payActDL.forEach(r -> r.setNumber("base_amt", r.base_cur_amt()));
					}
					
					FXUCC_Divide.propNE(
							payActDL,
							upDtlR.getNumberNE("base_cur_adjust_amt"),
							getBaseCur().amt_dec_place().intValue(),
							"base_amt",
							"alloc_amt");
					
					updPayActDL.addAll(payActDL);
				}
			}
			
			if (!updPayActDL.isEmpty()) {
				MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
				MCQueryApiBuilder updPayActDL_bldr = MCQueryApiBuilder.create(t);
				updPayActDL_bldr.setSetVL(t.base_cur_amt, t.base_cur_amt.add(bindEx("alloc_amt")));
				dbUpdateKey("MSBHL5040_MST_PAY_ACT_D_U01", updPayActDL, updPayActDL_bldr);
			}
		}
		
		/**
		 * 基準通貨金額の調整対象かどうか評価する。
		 * @param payActDR 支払実績明細
		 * @param dtlR 上り電文の支払実績明細
		 * @return 調整対象の場合はtrue
		 */
		protected boolean isBaseCurAmtAdjustTgt(MST_PAY_ACT_D_R payActDR, PayAct_Chk01_DtlR dtlR) {
			
			if (isSame(payActDR.pay_act_no(), dtlR.pay_act_no()) 
					&& isSame(payActDR.asppl_cd(), dtlR.asppl_cd())
					&& isSame(payActDR.ap_dpt_cd(), dtlR.ap_dpt_cd())
					&& isSame(payActDR.purc_act_no(), dtlR.purc_act_no())
					&& isSame(payActDR.rcpt_iv_mng_no(), dtlR.rcpt_iv_mng_no())
					&& isSame(payActDR.rcpt_iv_no(), dtlR.rcpt_iv_no())
					&& isSame(payActDR.ap_typ(), dtlR.ap_typ())
					&& isSame(payActDR.wrk_no(), dtlR.wrk_no())
					&& MAC_SLIP_STS_TYP.isCRT(payActDR.getStringNE("slip_sts_typ"))
					&& (MAC_AP_STTL_TYP.isACNT(payActDR.ap_sttl_typ()) 
							|| MAC_AP_STTL_TYP.isCASH(payActDR.ap_sttl_typ()) 
							|| MAC_AP_STTL_TYP.isNOTE(payActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isSETOFF(payActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_OUT_CHK(payActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(payActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(payActDR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(payActDR.ap_sttl_typ()))) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 与信サービスの与信更新（買掛）を実行する。
		 */
		protected void callCredServiceUpd02() {
			
			MCList<MST_PAY_ACT_D_R> credTgtL = _payActDL.subList(r->isCredUpdTgt(r));
			
			MCList<Cred_Upd02_CndR> credL = MCList.create(Cred_Upd02_CndR.class);
			Cred_Upd02_CndR upR = null;
			
			for (MST_PAY_ACT_D_R credTgtR : credTgtL) {
				
				PayAct_Chk01_HdrR upPayActR = up0().getFirst(PayAct_Chk01_HdrR.$pay_act_no, credTgtR.pay_act_no());
				
				upR = Cred_Upd02_CndR.create();
				upR.bsppl_cd(credTgtR.bsppl_cd());
				if (isDel(upPayActR)) {
					upR.cur_cd(upPayActR.getStringNE("del_trd_cur_cd"));
				}
				else {
					upR.cur_cd(upPayActR.trd_cur_cd());
				}
				upR.amt(credTgtR.trd_cur_amt());
				
				credL.add(upR);
			}
			
			if (!credL.isEmpty()) {
				
				MSBGL_CredService.Cred_Upd02 ope = MSBGL_CredService.crtCred_Upd02();
				
				MCGroupByPolicy policy = new MCGroupByPolicy(Cred_Upd02_CndR.$bsppl_cd, Cred_Upd02_CndR.$cur_cd);
				policy.sum(Cred_Upd02_CndR.$amt);
				
				ope.up0().addAll(credL.groupBy(policy));
				ope.exec();
			}
		}
		
		/**
		 * 与信更新対象かどうか評価する。
		 * @param payActDR 支払実績明細
		 * @return 与信更新対象の場合はtrue
		 */
		protected boolean isCredUpdTgt(MST_PAY_ACT_D_R payActDR) {
			
			return	(MAC_AP_STTL_TYP.isACNT(payActDR.ap_sttl_typ()) 
					|| MAC_AP_STTL_TYP.isCASH(payActDR.ap_sttl_typ()) 
					|| MAC_AP_STTL_TYP.isNOTE(payActDR.ap_sttl_typ()) 
					|| MAC_AP_STTL_TYP.isSETOFF(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isWTAX(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_OUT_CHK(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(payActDR.ap_sttl_typ()))
					&& isNull(payActDR.adv_pay_act_no());
		}
		
		/**
		 * 前渡金実績を更新する。
		 */
		protected void updAdvPayAct() {
			
			MCList<MST_PAY_ACT_D_R> advPayActUpdTgtL = _payActDL.subList(r->!isNull(r.adv_pay_act_no()));
			
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_PAY_ACT_D_R.$adv_pay_act_no);
			policy.sum(MST_PAY_ACT_D_R.$trd_cur_amt);
			
			MCList<MST_PAY_ACT_D_R> bindL = advPayActUpdTgtL.groupBy(policy);
			
			MST_ADV_PAY_ACT_R dbc = MST_ADV_PAY_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			
			builder.setWhere(dbc.adv_pay_act_no.eq(bindEx(MST_PAY_ACT_D_R.$adv_pay_act_no)));
			builder.addWhereWithAnd(dbc.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			builder.setSet("trd_cur_setoff_act_amt", dbc.trd_cur_setoff_act_amt, dbc.trd_cur_setoff_act_amt.add(bindEx(MST_PAY_ACT_D_R.$trd_cur_amt)));
			dbUpdate("MSBHL5040_MST_ADV_PAY_ACT_U01", bindL, builder);
		}
		
		/**
		 * 承認提供サービスの承認次処理済更新を実行する。
		 */
		protected void callAprvServiceUpd02() {
			
			MBBAL_AprvService.Aprv_Upd02 ope = MBBAL_AprvService.crtAprv_Upd02();
			
			Aprv_Chk02_Rslt1R upR = null;
			
			MCIndexKey up1IdxKey = up1().createIndex(PayAct_Chk01_DtlR.$pay_chk_mng_no);
			MCIndexKey up0IdxKey = up0().createIndex(PayAct_Chk01_HdrR.$hdr_peg_no);
			for (MST_PAY_CHK_R payChkR : _payChkL) {
				
				MST_PAY_CHK_R srcPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
				
				if (srcPayChkR.aprv_flg()) {
					PayAct_Chk01_DtlR upPayActDR = up1().getFirst(up1IdxKey, payChkR.pay_chk_mng_no());
					PayAct_Chk01_HdrR upPayActR = up0().getFirst(up0IdxKey, upPayActDR.hdr_peg_no());
					if (MAC_DATA_CRUD_TYP.isCRT(upPayActDR.data_crud_typ())
							&& (MSC_PAY_STS_TYP.isPART_PAY(payChkR.pay_sts_typ())
									|| MSC_PAY_STS_TYP.isPAY(payChkR.pay_sts_typ()))
							&& !upPayActR.schd_act_flg()) {
						upR = Aprv_Chk02_Rslt1R.create();
						
						upR.aprv_no(srcPayChkR.aprv_no());
						
						ope.up0().add(upR);
					}
				}
			}
			
			if (!ope.up0().isEmpty()) {
				
				ope.exec();
			}
		}
		
		/**
		 * 承認提供サービスの承認次処理済解除を実行する。
		 */
		protected void callAprvServiceUpd03() {
			
			MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
			
			Aprv_Chk02_Rslt1R upR = null;
			
			// 支払照合ヘッダに紐づく予定時実績ではない有効な支払実績明細を取得
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MST_PAY_ACT_R t1 = MST_PAY_ACT_R.create("T1");

			MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(t);
			payActDL_bldr.setSelect(t.pay_chk_mng_no);
			payActDL_bldr.addInnerJoin(t1, bracket( t.pay_act_no.eq(t1.pay_act_no) .and(t.pay_act_seq.eq(t1.pay_act_seq)) .and(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))) .and(t1.schd_act_flg.eq(value(false)))));
			payActDL_bldr.setWhere(t.pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL5040_MST_PAY_ACT_D_S04", payActDL, payActDL_bldr, _payChkL);
			MCIndexKey payActDLIdxKey = payActDL.createIndex(MST_PAY_ACT_D_R.$pay_chk_mng_no);
			MCIndexKey up1IdxKey = up1().createIndex(PayAct_Chk01_DtlR.$pay_chk_mng_no);
			MCIndexKey up0IdxKey = up0().createIndex(PayAct_Chk01_HdrR.$hdr_peg_no);
			
			for (MST_PAY_CHK_R payChkR : _payChkL) {
				
				MST_PAY_CHK_R srcPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
				
				if (srcPayChkR.aprv_flg()) {
					PayAct_Chk01_DtlR upPayActDR = up1().getFirst(up1IdxKey, payChkR.pay_chk_mng_no());
					PayAct_Chk01_HdrR upPayActR = up0().getFirst(up0IdxKey, upPayActDR.hdr_peg_no());
					MCList<MST_PAY_ACT_D_R> validPayActDL = payActDL.subList(payActDLIdxKey, payChkR.pay_chk_mng_no());
					if (!upPayActR.schd_act_flg() && isNull(validPayActDL) ) {
						
						upR = Aprv_Chk02_Rslt1R.create();
						
						upR.aprv_no(srcPayChkR.aprv_no());
						
						ope.up0().add(upR);
					}
				}
			}
			
			if (!ope.up0().isEmpty()) {
				
				ope.exec();
			}
		}
		
		/**
		 * 支払実績ＩＦ作成サービスを実行する。
		 */
		protected void callPayActIfCrtServiceIns01() {
			
			MSBHL_PayActIfCrtService.PayActIfCrt_Ins01 ope = MSBHL_PayActIfCrtService.crtPayActIfCrt_Ins01();
			
			MCList<PayActIfCrt_Ins01_CndR> payActIfL = MCList.create(PayActIfCrt_Ins01_CndR.class);
			for (MST_PAY_ACT_D_R payActDR : _payActDL) {
				PayActIfCrt_Ins01_CndR upR = PayActIfCrt_Ins01_CndR.create();
				// 残高振替でインタフェースする対象は「払出」だが、「受入」の支払実績を作成するタイミングでインタフェースする
				// ※相殺関連に振替先の情報を設定する必要があるので
				if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(payActDR.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(payActDR.ap_sttl_typ())) {
					upR.pay_act_d_no(payActDR.par_pay_act_d_no());
					upR.pay_act_d_seq(payActDR.par_pay_act_d_seq());
				}
				else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(payActDR.ap_sttl_typ())
						|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(payActDR.ap_sttl_typ())) {
					continue;
				}
				else {
					upR.pay_act_d_no(payActDR.pay_act_d_no());
					upR.pay_act_d_seq(payActDR.pay_act_d_seq());
				}
				payActIfL.add(upR);
			}
			
			if (!payActIfL.isEmpty()) {
				ope.up0().addAll(payActIfL);
				ope.exec();
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().setAll(up0());
			
			down1().setAll(up1());
		}
		
		/**
		 * 支払実績ＮＯ発番の要素を取得する
		 * 
		 * @param upPayActR 支払実績ヘッダ
		 * @return 発番要素
		 */
		protected ElmArgsR getPayActNoArgs(PayAct_Chk01_HdrR upPayActR) {
			ElmArgsR argsR = ElmArgsR.create();

			argsR.dpt_cd(upPayActR.pay_dpt_cd());
			argsR.co_cd(getCo().co_cd());
			argsR.bp_cd(upPayActR.psppl_cd());
			argsR.wg_cd(upPayActR.wg_cd());
			argsR.dt(upPayActR.ac_dt());
			
			argsR.peg_no(upPayActR.hdr_peg_no());
			
			return argsR;
		}
		
		/**
		 * 上り電文の支払実績明細のインデックスを作成する。
		 */
		protected void createUpIndex() {
			
			_upPayActDIdxkey = up1().createIndex(PayAct_Chk01_HdrR.$hdr_peg_no);
		}
		
		/**
		 * 支払実績ヘッダに紐付く支払実績明細を取得する。
		 * @param upPayActR 上り電文の支払実績ヘッダ
		 * @return 支払実績ヘッダに紐付く支払実績明細リスト
		 */
		protected MCList<PayAct_Chk01_DtlR> getUpPayActDL(PayAct_Chk01_HdrR upPayActR) {

			return up1().subList(_upPayActDIdxkey, upPayActR.hdr_peg_no());
		}
	}
	
	/**
	 * 指定された支払実績ヘッダが新規かどうか。
	 * @param upPayActR 上り電文の支払実績ヘッダ
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(PayAct_Chk01_HdrR upPayActR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(upPayActR.data_crud_typ());
	}
	
	/**
	 * 指定された支払実績ヘッダが更新かどうか。
	 * @param upPayActR 上り電文の支払実績ヘッダ
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(PayAct_Chk01_HdrR upPayActR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(upPayActR.data_crud_typ());
	}
	
	/**
	 * 指定された支払実績ヘッダが削除かどうか。
	 * @param upPayActR 上り電文の支払実績ヘッダ
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(PayAct_Chk01_HdrR upPayActR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(upPayActR.data_crud_typ());
	}
	
	/**
	 * 指定された支払実績明細が新規かどうか。
	 * @param upPayActDR 上り電文の支払実績明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(PayAct_Chk01_DtlR upPayActDR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(upPayActDR.data_crud_typ());
	}
	
	/**
	 * 指定された支払実績明細が更新かどうか。
	 * @param upPayActDR 上り電文の支払実績明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(PayAct_Chk01_DtlR upPayActDR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(upPayActDR.data_crud_typ());
	}
	
	/**
	 * 指定された支払実績明細が削除かどうか。
	 * @param upPayActDR 上り電文の支払実績明細
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(PayAct_Chk01_DtlR upPayActDR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(upPayActDR.data_crud_typ());
	}

	//FMCB CUSTOM END
}