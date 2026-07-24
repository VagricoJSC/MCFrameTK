package mcframe.serverMSBH.MSBHL5020;

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
import mcframe.serverMSBH.MSBHL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR;
import mcframe.serverMSBH.MSBHL5130.MSBHL_ApSwBalService;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.BiFunction;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApDtlRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApDtlRegService_MC extends MSBHL_ApDtlRegService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBHL_ApDtlRegService> CLAZZ = MSBHL_ApDtlRegService.class;
	
	/**
	 * 更新・取消対象の買掛明細のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_AP_D_R>> _apDCache = null;
	
	/**
	 * 更新・取消対象の支払照合ヘッダのキャッシュ
	 */
	protected FXUCL_Cache<MST_PAY_CHK_R> _payChkCache = null;
	
	/**
	 * 更新・取消対象の買掛消込予定のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_AP_APPL_SCHD_R>> _apApplSchdCache = null;
	
	/**
	 * 更新・取消対象の支払予定のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_SCHD_R>> _paySchdCache = null;
	
	/**
	 * 評価替履歴のキャッシュ
	 */
	protected FXUCL_Cache<MST_AP_XRATE_REV_HIS_R> _xrateHisCache = null;
	
	protected void editRcptIvMngNo(MCList<ApDtl_Chk01_DtlR> dtlL) {
		for (ApDtl_Chk01_DtlR dtlR : dtlL) {
			if (isNotIvNo(dtlR)) {
				dtlR.rcpt_iv_no(null);
				dtlR.rcpt_iv_mng_no(null);
			}
		}
	}
	
	protected boolean isNotIvNo(ApDtl_Chk01_DtlR dtlR) {
		return MAC_TRD_PTN_TYP.isPURC_RTN(dtlR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(dtlR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT(dtlR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(dtlR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XTRA(dtlR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(dtlR.trd_ptn_typ())
				;
	}
	
	/**
	 * 更新・取消対象の買掛明細・支払照合ヘッダ・買掛消込予定・支払予定のキャッシュを作成する。
	 * @param dtlL 上り電文の買掛明細リスト
	 */
	protected static void initApDCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initApDCache(dtlL);
	}
	
	protected void _initApDCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		
		// ワークデータを作成する。買掛明細・買掛消込予定を取得するため
		MCList<ApDtl_Chk01_DtlR> dtlUpdDelL = MCList.create(ApDtl_Chk01_DtlR.class);
		MCList<ApDtl_Chk01_DtlR> ivL = MCList.create(ApDtl_Chk01_DtlR.class);
		for (ApDtl_Chk01_DtlR dtlR : dtlL) {
			if (!isNull(dtlR.purc_act_no())) {
				dtlUpdDelL.add(dtlR);
			}
			if (isIv(dtlR)) {
				ivL.add(dtlR);
			}
		}
		
		MCList<MST_PURC_ACT_R> apDBindL = MCList.create(MST_PURC_ACT_R.class);
		for (ApDtl_Chk01_DtlR dtlR : dtlUpdDelL.distinctNE(ApDtl_Chk01_DtlR.$purc_act_no)) {
			MST_PURC_ACT_R apDBindR = MST_PURC_ACT_R.create();
			apDBindR.purc_act_no(dtlR.purc_act_no());
			apDBindL.add(apDBindR);
		}

		MCQueryApiBuilder apDBindL_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
		if(!isNull(apDBindL)) {
			dbWkDelete("MSBHL5020_MSW_PURC_ACT_D01", apDBindL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5020_MSW_PURC_ACT_I01", apDBindL, apDBindL_bldr.getBaseDbc());
		}
		
		MCList<MST_RCPT_IV_R> ivDBindL = MCList.create(MST_RCPT_IV_R.class);
		for (ApDtl_Chk01_DtlR dtlR : ivL.distinctNE(ApDtl_Chk01_DtlR.$rcpt_iv_mng_no)) {
			MST_RCPT_IV_R ivDBindR = MST_RCPT_IV_R.create();
			ivDBindR.rcpt_iv_mng_no(dtlR.rcpt_iv_mng_no());
			ivDBindL.add(ivDBindR);
		}
		
		MCQueryApiBuilder ivDBindL_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T"));
		if(!isNull(ivDBindL)) {
			dbWkDelete("MSBHL5020_MSW_RCPT_IV_D01", ivDBindL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5020_MSW_RCPT_IV_I01", ivDBindL, ivDBindL_bldr.getBaseDbc());
		}
		
		// 更新・取消する買掛明細の取得とロックを行う
		MSW_PURC_ACT_KEY_R w1 = MSW_PURC_ACT_KEY_R.create("W1");
		MSW_PURC_ACT_KEY_R S1W1 = MSW_PURC_ACT_KEY_R.create("S1W1");
		MSW_RCPT_IV_KEY_R S2W2 = MSW_RCPT_IV_KEY_R.create("S2W2");
		MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
		apDL.addBooleanColumn("can_valid_flg");
		
		if(!isNull(apDBindL) || !isNull(ivDBindL)) {
			MST_AP_D_R t3 = MST_AP_D_R.create("T3");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t3);
			// 主キー順でロックするため（デッドロックを回避するため）、仕入実績ワークテーブルと結合する
			apDL_bldr.setOrderByAsc(apDL_bldr.getBaseDbc().getKeyColumn$());
			if(isNull(ivDBindL)) {
				apDL_bldr.addInnerJoin(w1, bracket( t3.purc_act_no.eq(w1.purc_act_no)));
			}
			else {
				apDL_bldr.addWhereWithAnd(bracket( exists( subQuery() .select(value("X")) .from(S1W1) .where( t3.purc_act_no.eq(S1W1.purc_act_no) ) ) .or( exists( subQuery() .select(value("X")) .from(S2W2) .where( t3.rcpt_iv_mng_no.eq(S2W2.rcpt_iv_mng_no) ) ) )));
			}
			apDL_bldr.setLockTable(t3.ap_d_no);
			dbSelectForUpdate("MSBHL5020_MST_AP_D_S01", apDL, apDL_bldr);
		}
		
		// 買掛明細に対応する支払照合ヘッダの取得とロックを行う
		MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.class);
		
		MCList<MST_AP_D_R> payChkApDL = apDL.subList(r->!isNull(r.pay_chk_mng_no()));
		if (!isNull(payChkApDL)) {
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			payChkL.sort(MST_AP_D_R.$pay_chk_mng_no);
			payChkL_bldr.setOrderByAsc(payChkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBHL5020_MST_PAY_CHK_S01", payChkL, payChkL_bldr, payChkApDL);
		}
		
		// 仕入実績ＮＯに対応する買掛消込予定の取得とロックを行う
		MST_PAY_SCHD_R t5 = MST_PAY_SCHD_R.create("T5");
		MSW_PURC_ACT_KEY_R w3 = MSW_PURC_ACT_KEY_R.create("W3");
		MSW_PURC_ACT_KEY_R S3W3 = MSW_PURC_ACT_KEY_R.create("S3W3");
		MSW_RCPT_IV_KEY_R S4W4 = MSW_RCPT_IV_KEY_R.create("S4W4");

		MCList<MST_AP_APPL_SCHD_R> apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
		if(!isNull(apDBindL) || !isNull(ivDBindL)) {
			MST_AP_APPL_SCHD_R t6 = MST_AP_APPL_SCHD_R.create("T6");
			MCQueryApiBuilder apApplSchdL_bldr = MCQueryApiBuilder.create(t6);
			// 主キー順でロックするため（デッドロックを回避するため）、ワークテーブルと結合する
			apApplSchdL_bldr.setOrderByAsc(apApplSchdL_bldr.getBaseDbc().getKeyColumn$());
			apApplSchdL_bldr.addSelect(t5.pay_chk_mng_no);
			apApplSchdL_bldr.addInnerJoin(t5, bracket( t6.pay_schd_no.eq(t5.pay_schd_no)));
			if(isNull(ivDBindL)) {
				apApplSchdL_bldr.addInnerJoin(w3, bracket( t6.purc_act_no.eq(w3.purc_act_no)));
			}
			else {
				apApplSchdL_bldr.addWhereWithAnd(bracket( exists( subQuery() .select(value("X")) .from(S3W3) .where( t6.purc_act_no.eq(S3W3.purc_act_no) ) ) .or( exists( subQuery() .select(value("X")) .from(S4W4) .where( t6.rcpt_iv_mng_no.eq(S4W4.rcpt_iv_mng_no) ) ) )));
			}
			apApplSchdL_bldr.setLockTable(t6.ap_appl_schd_no);
			dbSelectForUpdate("MSBHL5020_MST_AP_APPL_SCHD_S01", apApplSchdL, apApplSchdL_bldr);
		}
		
		// 支払照合管理ＮＯに対応する支払予定の取得とロックを行う
		MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
		MST_PAY_SCHD_R t7 = MST_PAY_SCHD_R.create("T7");
		MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(t7);
		paySchdL_bldr.setOrderByAsc(paySchdL_bldr.getBaseDbc().getKeyColumn$());
		paySchdL_bldr.setWhere(t7.pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
		dbSelectForUpdate("MSBHL5020_MST_PAY_SCHD_S01", paySchdL, paySchdL_bldr, payChkL);
		
		// 評価替履歴の取得
		// 月次買掛残高テーブルのワークを利用する
		MCList<MST_MLY_AP_BAL_R> xrateHisBindL = MCList.create(MST_MLY_AP_BAL_R.class);
		for (MST_AP_D_R apDR : apDL) {
			MST_MLY_AP_BAL_R dbcR = xrateHisBindL.add();
			dbcR.asppl_cd(apDR.asppl_cd());
			dbcR.ap_dpt_cd(apDR.ap_dpt_cd());
			dbcR.trd_cur_cd(apDR.trd_cur_cd());
			if (isIv(apDR)) {
				dbcR.purc_act_no(MAC_STR.NULL_VAL.value());
				dbcR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
			}
			else {
				dbcR.purc_act_no(apDR.purc_act_no());
				dbcR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
			}
			dbcR.wrk_no(apDR.wrk_no());
			dbcR.ap_typ(apDR.ap_typ());
		}
		MCQueryApiBuilder xrateHisBindL_bldr = MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T"));
		if (!isNull(xrateHisBindL)) {
			dbWkDelete("MSBHL5020_MSW_MLY_AP_BAL_D01", xrateHisBindL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5020_MSW_MLY_AP_BAL_I01", xrateHisBindL, xrateHisBindL_bldr.getBaseDbc());
		}

		MSW_MLY_AP_BAL_KEY_R w5 = MSW_MLY_AP_BAL_KEY_R.create("W5");
		MCList<MST_AP_XRATE_REV_HIS_R> xrateHisL = MCList.create(MST_AP_XRATE_REV_HIS_R.class);
		MST_AP_XRATE_REV_HIS_R t9 = MST_AP_XRATE_REV_HIS_R.create("T9");
		MCQueryApiBuilder xrateHisL_bldr = MCQueryApiBuilder.create(t9);
		xrateHisL_bldr.addInnerJoin(w5, bracket( w5.asppl_cd.eq(t9.asppl_cd)
				.and(w5.ap_dpt_cd.eq(t9.ap_dpt_cd))
				.and(w5.trd_cur_cd.eq(t9.trd_cur_cd))
				.and(w5.purc_act_no.eq(t9.purc_act_no))
				.and(w5.rcpt_iv_mng_no.eq(t9.rcpt_iv_mng_no))
				.and(w5.wrk_no.eq(t9.wrk_no))
				.and(w5.ap_typ.eq(t9.ap_typ))));
		dbSelect("MSBHL5020_MST_AP_XRATE_REV_HIS_S01", xrateHisL, xrateHisL_bldr);
		
		// ワークデータを削除する
		if(!isNull(apDBindL)) {
			dbWkDelete("MSBHL5020_MSW_PURC_ACT_D02", apDBindL_bldr.getBaseDbc());
		}
		if(!isNull(ivDBindL)) {
			dbWkDelete("MSBHL5020_MSW_RCPT_IV_D02", ivDBindL_bldr.getBaseDbc());
		}
		if (!isNull(xrateHisBindL)) {
			dbWkDelete("MSBHL5020_MSW_MLY_AP_BAL_D02", xrateHisBindL_bldr.getBaseDbc());
		}
		
		
		// 買掛明細情報をキャッシュする。元伝の取得に不要なレコードは除外する
		if (_apDCache == null) {
			_apDCache = new FXUCL_Cache<MCList<MST_AP_D_R>>();
			_apDCache.setFixMaxCacheSize(-1);
		}
		
		apDL = apDL.subList(r-> MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ()) && !MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ()));
		String[] apDKeys = {MST_AP_D_R.$purc_act_d_no, MST_AP_D_R.$purc_act_d_seq};
		for (MCList<MST_AP_D_R> l : apDL.groupList(apDKeys)) {
			Comparable<?>[] key = l.get(0).toArray(apDKeys);
			_apDCache.putCache(key, l);
		}
		
		// 支払照合ヘッダをキャッシュする
		if (_payChkCache == null) {
			_payChkCache = new FXUCL_Cache<MST_PAY_CHK_R>();
			_payChkCache.setFixMaxCacheSize(-1);
		}
		
		for (MST_PAY_CHK_R r : payChkL) {
			Comparable<?>[] key = {r.pay_chk_mng_no()};
			_payChkCache.putCache(key, r);
		} 
		
		// 買掛消込予定をキャッシュする
		if (_apApplSchdCache == null) {
			_apApplSchdCache = new FXUCL_Cache<MCList<MST_AP_APPL_SCHD_R>>();
			_apApplSchdCache.setFixMaxCacheSize(-1);
		}
		
		String[] purcActDkeys = {MST_AP_APPL_SCHD_R.$purc_act_no, MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no};
		for (MCList<MST_AP_APPL_SCHD_R> l : apApplSchdL.groupList(purcActDkeys)) {
			Comparable<?>[] key = l.get(0).toArray(purcActDkeys);
			_apApplSchdCache.putCache(key, l);
		}
		
		// 支払予定をキャッシュする
		if (_paySchdCache == null) {
			_paySchdCache = new FXUCL_Cache<MCList<MST_PAY_SCHD_R>>();
			_paySchdCache.setFixMaxCacheSize(-1);
		}
		
		String[] payChkMngkeys = {MST_PAY_SCHD_R.$pay_chk_mng_no};
		for (MCList<MST_PAY_SCHD_R> l : paySchdL.groupList(payChkMngkeys)) {
			Comparable<?>[] key = l.get(0).toArray(payChkMngkeys);
			_paySchdCache.putCache(key, l);
		}
		
		// 評価替履歴をキャッシュする
		if (_xrateHisCache == null) {
			_xrateHisCache = new FXUCL_Cache<MST_AP_XRATE_REV_HIS_R>();
			_xrateHisCache.setFixMaxCacheSize(-1);
		}
		
		String[] xrateHiskeys = {
			MST_AP_XRATE_REV_HIS_R.$asppl_cd,
			MST_AP_XRATE_REV_HIS_R.$ap_dpt_cd,
			MST_AP_XRATE_REV_HIS_R.$trd_cur_cd,
			MST_AP_XRATE_REV_HIS_R.$purc_act_no,
			MST_AP_XRATE_REV_HIS_R.$rcpt_iv_mng_no,
			MST_AP_XRATE_REV_HIS_R.$wrk_no,
			MST_AP_XRATE_REV_HIS_R.$ap_typ
		};
		for (MCList<MST_AP_XRATE_REV_HIS_R> l : xrateHisL.groupList(xrateHiskeys)) {
			l.sort(SortType.DESC, MST_AP_XRATE_REV_HIS_R.$ac_ym);
			MST_AP_XRATE_REV_HIS_R xRateHisR = l.get(0);
			_xrateHisCache.putCache(xRateHisR.toArray(xrateHiskeys), xRateHisR);
		}
	}
	
	/**
	 * キャッシュから更新・取消の元伝を取得する返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return  更新・取消の元伝
	 */
	protected static MST_AP_D_R getApDR(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getApDR(dtlR);
	}
	
	/**
	 * 一部支払、全額繰越かどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 一部支払、全額繰越の場合はtrue
	 */
	protected static boolean isCrryovr(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._isCrryovr(dtlR);
	}
	
	/**
	 * 振替済みかどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 残高振替済の場合はtrue
	 */
	protected static boolean isSw(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._isSw(dtlR);
	}
	
	/**
	 * 評価替済みかどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 評価替済の場合はtrue
	 */
	protected static boolean isXRateHis(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._isXRateHis(dtlR);
	}
	/**
	 * 買掛明細に対応する支払照合を取得する。
	 * @param apDR 買掛明細
	 * @return 支払照合
	 */
	protected static MST_PAY_CHK_R getPayChkR(MST_AP_D_R apDR) {
		return object(CLAZZ)._getPayChkR(apDR);
	}
	
	/**
	 * 支払照合管理ＮＯに対応する支払照合を取得する。
	 * @param apDR 買掛明細
	 * @return 支払照合
	 */
	protected static MST_PAY_CHK_R getPayChkR(String payChkMngNo) {
		return object(CLAZZ)._getPayChkR(payChkMngNo);
	}

	/**
	 * 買掛明細に対応する買掛消込予定を取得する。
	 * @param apDR 買掛明細
	 * @return 支払照合
	 */
	protected static MCList<MST_AP_APPL_SCHD_R> getApApplSchdR(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getApApplSchdR(dtlR);
	}

	/**
	 * 買掛明細に対応する評価替履歴を取得する。
	 * @param dtlR 上り電文の買掛明細
	 * @return 評価替履歴
	 */
	protected static MST_AP_XRATE_REV_HIS_R getXRateHisR(MST_AP_D_R apDR) {
		return object(CLAZZ)._getXRateHisR(apDR);
	}
	
	protected MST_AP_D_R _getApDR(ApDtl_Chk01_DtlR dtlR) {
		
		MCList<MST_AP_D_R> lst = _getApDL(dtlR);
		
		if (!isNull(lst)) {
			for (MST_AP_D_R apDR : lst) {
				if (MSC_PAY_MTD_TYP.isALL_PAY(apDR.pay_mtd_typ()) && !apDR.crryovr_flg()) {
					return apDR;
				}
			}
		}
		return null;
	}
	
	/**
	 * 支払照合管理ＮＯに対応する支払予定を取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 支払予定
	 */
	protected static MCList<MST_PAY_SCHD_R> getPaySchdR(String payChkMngNo) {
		return object(CLAZZ)._getPaySchdR(payChkMngNo);
	}
	
	protected boolean _isCrryovr(ApDtl_Chk01_DtlR dtlR) {
		
		MST_AP_D_R apDR = _getApDR(dtlR);
		
		if (!isNull(apDR)) {
			
			MCList<MST_AP_D_R> lst = _getApDL(dtlR);
			
			if (!isNull(lst)) {
				for (MST_AP_D_R r : lst) {
					if (!isSame(apDR.ap_d_no(), r.ap_d_no()) && r.chk_flg()) {
						// 仕入実績明細NOと連番が同じ照合済のデータが買掛明細情報に存在する場合、一部支払、全額繰越と判断する
						return true;
					}
				}
			}
		}

		return false;
	}

	protected boolean _isSw(ApDtl_Chk01_DtlR dtlR) {
			
		MCList<MST_AP_D_R> lst = _getApDL(dtlR);
		
		if (!isNull(lst)) {
			for (MST_AP_D_R r : lst) {
				if (r.sw_flg()) {
					return true;
				}
			}
		}

		return false;
	}
	
	protected boolean _isXRateHis(ApDtl_Chk01_DtlR dtlR) {
		MST_AP_D_R apDR = _getApDR(dtlR);
		if (!isNull(apDR)) {
			if (isSame(dtlR.ap_dpt_cd(), apDR.ap_dpt_cd()) || apDR.ac_ym().gteDate(getAcYm(dtlR.can_ac_dt()))) {
				return false;
			}
			MST_AP_XRATE_REV_HIS_R xrateHisR = _getXRateHisR(apDR);
			if (!isNull(xrateHisR)) {
				MCDate clYm = MSUCL_ClUtil.getPurcClYm();
				if (apDR.ac_ym().lteDate(clYm)) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected MCList<MST_AP_D_R> _getApDL(ApDtl_Chk01_DtlR dtlR) {
		Comparable<?>[] key = dtlR.toArray(ApDtl_Chk01_DtlR.$purc_act_d_no, ApDtl_Chk01_DtlR.$old_purc_act_d_seq);
		return _apDCache.getCache(key);
	}
	
	protected MST_PAY_CHK_R _getPayChkR(MST_AP_D_R apDR) {
		return _payChkCache.getCache(apDR.pay_chk_mng_no());
	}
	
	protected MST_PAY_CHK_R _getPayChkR(String paySchdMngNo) {
		return _payChkCache.getCache(paySchdMngNo);
	}
	
	protected MCList<MST_AP_APPL_SCHD_R> _getApApplSchdR(ApDtl_Chk01_DtlR dtlR) {
		String purcActNo = isIv(dtlR) ? MAC_STR.NULL_VAL.value() : dtlR.purc_act_no();
		return _apApplSchdCache.getCache(purcActNo, nvl(dtlR.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
	}
	
	protected MCList<MST_PAY_SCHD_R> _getPaySchdR(String paySchdMngNo) {
		return _paySchdCache.getCache(paySchdMngNo);
	}
	
	protected MST_AP_XRATE_REV_HIS_R _getXRateHisR(MST_AP_D_R apDR) {
		String purcActNo = isIv(apDR) ? MAC_STR.NULL_VAL.value() : apDR.purc_act_no();
		String rcptIvMngNo = isIv(apDR) ? apDR.rcpt_iv_mng_no() : MAC_STR.NULL_VAL.value();
		return _xrateHisCache.getCache(
			apDR.asppl_cd(), apDR.ap_dpt_cd(), apDR.trd_cur_cd(), purcActNo, rcptIvMngNo, apDR.wrk_no(), apDR.ap_typ());
	}
	
	/**
	 * 支払予定管理先担当部門のキャッシュ
	 */
	protected FXUCL_Cache<String> _bspplDptCdCache = null;
	
	/**
	 * 支払予定管理先担当部門のキャッシュを作成する。
	 * @param dtlL 取得した支払予定管理先担当部門のリスト
	 */
	protected static void putBspplDptCdCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		object(CLAZZ)._putBspplDptCdCache(dtlL);
	}
	
	/**
	 * キャッシュから支払予定管理先担当部門を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return 支払予定管理先担当部門
	 */
	protected static String getBspplDptCd(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getBspplDptCd(dtlR);
	}
	
	/**
	 * キャッシュから支払予定管理先担当部門を取得し返す。
	 * @param bsppl_cd 支払予定管理先
	 * @param base_dt 基準日
	 * @return 支払予定管理先担当部門
	 */
	protected static String getBspplDptCd(String bsppl_cd, MCDate base_dt) {
		return object(CLAZZ)._getBspplDptCd(bsppl_cd, base_dt);
	}
	
	protected void _putBspplDptCdCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
	
		if (_bspplDptCdCache == null) {
			_bspplDptCdCache = new FXUCL_Cache<>();
			_bspplDptCdCache.setFixMaxCacheSize(-1);
		}
		
		String[] keys = {ApDtl_Chk01_DtlR.$bsppl_cd, ApDtl_Chk01_DtlR.$base_dt};
		for (MCList<ApDtl_Chk01_DtlR> l : dtlL.groupList(keys)) {
			Comparable<?>[] key = l.get(0).toArray(keys);
			_bspplDptCdCache.putCache(key, l.get(0).bsppl_dpt_cd());
		}
	}
	
	protected String _getBspplDptCd(ApDtl_Chk01_DtlR dtlR) {
		return _getBspplDptCd(dtlR.bsppl_cd(), dtlR.base_dt());
	}

	protected String _getBspplDptCd(String bsppl_cd, MCDate base_dt) {
		return _bspplDptCdCache.getCache(bsppl_cd, base_dt);
	}
	
	/**
	 * 支払予定管理先締年月日のキャッシュ
	 */
	protected FXUCL_Cache<ApDtl_Chk01_DtlR> _bspplClDtCache = null;
	
	/**
	 * 支払予定管理先締年月日のキャッシュを作成する。
	 * @param dtlL 算出した支払予定管理先締年月日のリスト
	 */
	protected static void putBspplClDtCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		object(CLAZZ)._putBspplClDtCache(dtlL);
	}
	
	/**
	 * キャッシュから支払予定管理先締年月日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCDate getBspplClDt(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getBspplClDt(dtlR);
	}
	
	/**
	 * キャッシュから赤伝の支払予定管理先締年月日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @param apDR 元伝の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCDate getCanBspplClDt(ApDtl_Chk01_DtlR dtlR, MST_AP_D_R apDR) {
		return object(CLAZZ)._getCanBspplClDt(dtlR, apDR);
	}
	
	/**
	 * キャッシュから赤伝の支払予定管理先締年月日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @param apDR 元伝の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCNumber getCanBspplClDay(ApDtl_Chk01_DtlR dtlR, MST_AP_D_R apDR) {
		return object(CLAZZ)._getCanBspplClDay(dtlR, apDR);
	}
	
	/**
	 * キャッシュから支払予定管理先締年月日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCDate getBspplClDt(String bsppl_cd, MCDate pay_basis_dt, MCNumber pay_crrovr_times) {
		return object(CLAZZ)._getBspplClDt(bsppl_cd, pay_basis_dt, pay_crrovr_times);
	}
	
	/**
	 * キャッシュから支払予定管理先締年月日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCNumber getBspplClDay(String bsppl_cd, MCDate pay_basis_dt, MCNumber pay_crrovr_times) {
		return object(CLAZZ)._getBspplClDay(bsppl_cd, pay_basis_dt, pay_crrovr_times);
	}
	
	/**
	 * キャッシュから支払予定管理先締年月日を算出した締日を取得し返す。
	 * @param dtlR 上り電文の買掛明細
	 * @return 支払予定管理先締年月日
	 */
	protected static MCNumber getBspplClDay(ApDtl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getBspplClDay(dtlR);
	}
	
	protected void _putBspplClDtCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
	
		if (_bspplClDtCache == null) {
			_bspplClDtCache = new FXUCL_Cache<ApDtl_Chk01_DtlR>();
			_bspplClDtCache.setFixMaxCacheSize(-1);
		}

		String[] bspplClDtKeys = {MST_AP_D_R.$bsppl_cd, MST_AP_D_R.$pay_basis_dt, MST_AP_D_R.$pay_crryovr_times};
		for (ApDtl_Chk01_DtlR r : dtlL.distinctNE(bspplClDtKeys)) {
			Comparable<?>[] key = r.toArray(bspplClDtKeys);
			_bspplClDtCache.putCache(key, r);
		}
	}
	
	protected MCDate _getBspplClDt(ApDtl_Chk01_DtlR dtlR) {
		return _getBspplClDt(dtlR.bsppl_cd(), dtlR.pay_basis_dt(), dtlR.pay_crryovr_times());
	}
	
	protected MCNumber _getBspplClDay(ApDtl_Chk01_DtlR dtlR) {
		return _getBspplClDay(dtlR.bsppl_cd(), dtlR.pay_basis_dt(), dtlR.pay_crryovr_times());
	}
	
	protected MCDate _getCanBspplClDt(ApDtl_Chk01_DtlR dtlR, MST_AP_D_R apDR) {
		return _getBspplClDt(apDR.bsppl_cd(), dtlR.can_pay_basis_dt(), nvl(apDR.pay_crryovr_times(), MCNumber.ZERO));
	}
	
	protected MCNumber _getCanBspplClDay(ApDtl_Chk01_DtlR dtlR, MST_AP_D_R apDR) {
		return _getBspplClDay(apDR.bsppl_cd(), dtlR.can_pay_basis_dt(), nvl(apDR.pay_crryovr_times(), MCNumber.ZERO));
	}
	
	protected MCDate _getBspplClDt(String bsppl_cd, MCDate pay_basis_dt, MCNumber pay_crrovr_times) {
		ApDtl_Chk01_DtlR r = _bspplClDtCache.getCache(bsppl_cd, pay_basis_dt, pay_crrovr_times);
		if (r == null) {
			return null;
		}
		return r.bsppl_cl_dt();
	}
	
	protected MCNumber _getBspplClDay(String bsppl_cd, MCDate pay_basis_dt, MCNumber pay_crrovr_times) {
		ApDtl_Chk01_DtlR r = _bspplClDtCache.getCache(bsppl_cd, pay_basis_dt, pay_crrovr_times);
		if (r == null) {
			return null;
		}
		return r.bsppl_cl_day();
	}
	
	/**
	 * 取引先マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	
	/**
	 * 取引先マスタのキャッシュを作成する。
	 * @param dtlL 上り電文の買掛明細リスト
	 */
	protected static void initBpCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initBpCache(dtlL);
	}
	
	/**
	 * キャッシュから取引先マスタを取得し返す。
	 * @param bpCd 支払予定管理先ＣＤ or 発注先ＣＤ
	 * @return 取引先マスタ
	 */
	protected static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}

	protected void _initBpCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
		
		HashSet<String> set = new HashSet<>();
		for (ApDtl_Chk01_DtlR dtlR : dtlL) {
			set.add(dtlR.bsppl_cd());
			set.add(dtlR.sppl_cd());
			// 赤伝の作成元となる元伝
			if ((isUpd(dtlR) || isDel(dtlR))
					&& (!isNull(dtlR.purc_act_d_no()) && !isNull(dtlR.old_purc_act_d_seq()))) {
				MST_AP_D_R apDR = getApDR(dtlR);
				if (!isNull(apDR)) {
					set.add(apDR.bsppl_cd());
					set.add(apDR.sppl_cd());
				}
			}
		}
		
		MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
		for (String bpCd : set) {
			MAM_BP_R bindR = MAM_BP_R.create();
			bindR.bp_cd(bpCd);
			bindL.add(bindR);
		}
		
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, bindL, MAM_BP_R.$bp_cd);
	}
	
	protected MAM_BP_R _getBp(String bpCd) {
		return _bpCache.getEx(bpCd);
	}
	
	/**
	 * 支払予定登録サービスの支払予定削除前チェックの下り電文のキャッシュ
	 */
	protected FXUCL_Cache<PaySchd_HdrR> _paySchdDelRsltCache = null;

	/**
	 * 支払予定登録サービスの支払予定削除前チェックの下り電文のキャッシュを作成する。
	 * @param rsltL 支払予定登録サービスの支払予定削除前チェックの下り電文
	 */
	protected static void putPaySchdDelRsltCache(MCList<PaySchd_HdrR> rsltL) {
		object(CLAZZ)._putPaySchdDelRsltCache(rsltL);
	}
	protected void _putPaySchdDelRsltCache(MCList<PaySchd_HdrR> rsltL) {
		if (_paySchdDelRsltCache == null) {
			_paySchdDelRsltCache = new FXUCL_Cache<>();
			_paySchdDelRsltCache.setFixMaxCacheSize(-1);
		}
		
		for (PaySchd_HdrR r : rsltL) {
			Comparable<?>[] key = {r.pay_chk_mng_no()};
			_paySchdDelRsltCache.putCache(key, r);
		}
	}
	
	/**
	 * 支払予定は取消可能かどうか。<br>
	 * キャッシュから支払予定登録サービスの支払予定削除前チェックの下り電文のエラーＦＬＧがオフの場合は取消可能とする。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 取消可能の場合はtrue
	 */
	protected static boolean canDelPaySchd(String payChkMngNo) {
		return object(CLAZZ)._canDelPaySchd(payChkMngNo);
	}
	protected boolean _canDelPaySchd(String payChkMngNo) {
		PaySchd_HdrR r = _paySchdDelRsltCache.getCache(payChkMngNo);
		if (r != null) {
			return !r.err_flg();
		}
		return false;
	}
	
	/**
	 * 買掛明細に紐付く支払予定を削除するか評価する。
	 * @param apDR 買掛明細
	 * @param payChkR 支払予定
	 * @param bpR 取引先マスタ
	 * @return 削除対象の場合はtrue
	 */
	protected boolean isDelPaySchdTgt(MST_AP_D_R apDR, MST_PAY_CHK_R payChkR, MAM_BP_R bpR) {
		// 都度支払である
		if (!isNull(payChkR) && payChkR.pay_spot_flg() && !isNull(bpR) && bpR.pay_spot_flg()) {
			// マニュアルで訂正されていない
			if (apDR.chk_flg() && !payChkR.man_reg_flg()) {
				if (payChkR.aprv_flg()) {
					// 承認対象の場合、未承認or却下or否認である
					return MAC_APRV_STS_TYP.isOPN(payChkR.aprv_sts_typ())
							|| MAC_APRV_STS_TYP.isRJCT(payChkR.aprv_sts_typ())
							|| MAC_APRV_STS_TYP.isLAST_RJCT(payChkR.aprv_sts_typ());
				}
				else {
					// 承認対象外の場合、支払予定登録サービスで取消可能か否かで判断する
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * インボイス取引か否か
	 * @return インボイス取引の場合true
	 */
	protected boolean isIv(ApDtl_Chk01_DtlR dtlR) {
		return !isNullOrNullVal(dtlR.rcpt_iv_mng_no());
	}
	/**
	 * インボイス取引か否か
	 * @return インボイス取引の場合true
	 */
	protected boolean isIv(MST_AP_D_R dtlR) {
		return !isNullOrNullVal(dtlR.rcpt_iv_mng_no());
	}

	/**
	 * ApDtl_Chk01オペレーション.<p>
	 *
	 * 買掛明細の登録・更新・取消が可能かチェックをする。<br>
	 */
	public class ApDtl_Chk01 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Chk01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected void initUpSub() {
			editRcptIvMngNo(up0());
			initApDCache(up0());
			initBpCache(up0());
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			msgL.addAll(chkReq(up0()));
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<ApDtl_Chk01_DtlR> chkList = getChkList(up0());
			
			callPaySchdServiceDelChk(chkList);
			
			if (!isNull(chkList)) {
				
				msgL.addAll(chkBspplClDt(chkList));
				msgL.addAll(chkBspplDptCd(chkList));
				setErrFlg(msgL);
				msgL.addAll(chkExcGainLoss(chkList));
				
			}
			
			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param dtlL 上り電文の買掛明細リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<ApDtl_Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ApDtl_Chk01_DtlR dtlR : dtlL) {
				
				if ((isCrt(dtlR) || isUpd(dtlR)) && isMakeCrt(dtlR)) {
					
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$ac_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$bsppl_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, new String[] {ApDtl_Chk01_DtlR.$pay_basis_dt, ApDtl_Chk01_DtlR.$pay_schd_dt}, new FXUCL_AtLeastOneValidater()));
					if (isNull(dtlR.pay_schd_dt())) {
						msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$pay_basis_dt, new FXUCL_RequiredValidater()));
					}
					if (!isNull(dtlR.pay_basis_dt())) {
						msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));	
					}
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$trd_cur_cd, new FXUCL_RequiredValidater()));
				}
				
				if (isUpd(dtlR) || isDel(dtlR)) {
					
					MST_AP_D_R apDR = getApDR(dtlR);
					
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$purc_act_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$purc_act_d_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$old_purc_act_d_seq, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$can_ac_dt, new FXUCL_RequiredValidater()));
					if (!isNull(apDR)) {
						if (isNull(apDR.pay_schd_dt())) {
							msgL.addAll(check(dtlR, ApDtl_Chk01_DtlR.$can_pay_basis_dt, new FXUCL_RequiredValidater()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 *  支払予定登録サービスの支払予定削除前チェックを実行する。
		 * @param dtlL 上り電文の買掛明細リスト
		 */
		protected void callPaySchdServiceDelChk(MCList<ApDtl_Chk01_DtlR> dtlL) {
			
			MCList<PaySchd_HdrR> hdrL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlSchdR> schdL = MCList.create(PaySchd_DtlSchdR.class);
			HashSet<String> payChkMngNoSet = new HashSet<>();
			
			for (ApDtl_Chk01_DtlR dtlR : dtlL) {
				
				if (isUpd(dtlR) || isDel(dtlR)) {
					
					MST_AP_D_R apDR = getApDR(dtlR);
					
					if (!isNull(apDR) && apDR.chk_flg()) {
						
						MST_PAY_CHK_R payChkR = getPayChkR(apDR);
						MAM_BP_R bpR = getBp(dtlR.bsppl_cd());
						
						if (isDelPaySchdTgt(apDR, payChkR, bpR)) {
							if (payChkMngNoSet.contains(payChkR.pay_chk_mng_no())) {
								continue;
							}
							
							PaySchd_HdrR hdrR = PaySchd_HdrR.create();
							
							hdrR.hdr_peg_no(dtlR.peg_no());
							hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							hdrR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
							hdrR.bsppl_cd(payChkR.bsppl_cd());
							hdrR.bsppl_dpt_cd(payChkR.bsppl_dpt_cd());
							hdrR.purc_act_no(payChkR.purc_act_no());
							hdrR.rcpt_iv_mng_no(payChkR.rcpt_iv_mng_no());
							hdrR.rcpt_iv_no(payChkR.rcpt_iv_no());
							hdrR.trd_cur_cd(payChkR.trd_cur_cd());
							hdrR.wrk_no(payChkR.wrk_no());
							hdrR.setAttributes(dtlR);
							hdrR.setStatus(MCRow.Status.NONE);
							
							hdrL.add(hdrR);
							
							MCList<MST_PAY_SCHD_R> paySchdL = getPaySchdR(hdrR.pay_chk_mng_no());
							
							if (!isNull(paySchdL)) {
								for (MST_PAY_SCHD_R paySchdR : paySchdL) {
									PaySchd_DtlSchdR schdR = PaySchd_DtlSchdR.create();
									schdR.hdr_peg_no(hdrR.hdr_peg_no());
									schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									schdR.pay_schd_no(paySchdR.pay_schd_no());

									schdL.add(schdR);
								}
							}
							
							payChkMngNoSet.add(payChkR.pay_chk_mng_no());
						}
					}
				}
			}

			if (!schdL.isEmpty()) {
				setPegNo(schdL);
			}
			
			if (!isNull(hdrL)) {
				callPaySchdRegServiceLock(hdrL);
				
				// 支払予定の取消は、取消可能かどうかの判断のため。エラーメッセージは不要
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(MCMessagePool.getMessageList());

				MSBHL_PaySchdRegService.PaySchd_Chk02 ope = MSBHL_PaySchdRegService.crtPaySchd_Chk02();
				ope.up0().addAll(hdrL);
				ope.up1().addAll(schdL);
				ope.exec();
				
				MCMessagePool.getMessageList().clear();
				MCMessagePool.getMessageList().addAll(msgL);

				putPaySchdDelRsltCache(ope.down0());
			}
			else {
				putPaySchdDelRsltCache(hdrL);
			}
			
		}

		
		/**
		 * 支払予定管理先担当部門を取得できるかチェックする。
		 * 基準日：都度支払は計上日、都度支払以外は締年月日
		 * @param dtlL 上り電文の買掛明細リスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkBspplDptCd(MCList<ApDtl_Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<ApDtl_Chk01_DtlR> chkL = MCList.create(ApDtl_Chk01_DtlR.class);
			
			for (ApDtl_Chk01_DtlR dtlR : dtlL) {
				
				// 黒伝
				if ((isCrt(dtlR) || isUpd(dtlR)) && isMakeCrt(dtlR)) {
					
					MAM_BP_R bpR = getBp(dtlR.bsppl_cd());
					
					ApDtl_Chk01_DtlR chkR = ApDtl_Chk01_DtlR.create();
					
					chkR.bsppl_cd(dtlR.bsppl_cd());
					chkR.base_dt(bpR.pay_spot_flg() ? dtlR.ac_dt() : getBspplClDt(dtlR));
					chkR.setAttributes(dtlR);
					
					chkL.add(chkR);
				}
				
				// 赤伝
				if (isUpd(dtlR) || isDel(dtlR)) {
					
					MST_AP_D_R apDR = getApDR(dtlR);
					
					if (!isNull(apDR)) {
						
						MAM_BP_R bpR = getBp(apDR.bsppl_cd());
						
						ApDtl_Chk01_DtlR chkR = ApDtl_Chk01_DtlR.create();
						
						chkR.bsppl_cd(apDR.bsppl_cd());
						chkR.base_dt(bpR.pay_spot_flg() ? dtlR.can_ac_dt() : getCanBspplClDt(dtlR, apDR));
						chkR.setAttributes(dtlR);
						
						chkL.add(chkR);
					}
				}
			}
			chkL.addBooleanColumn("tmp_no_chk_flg", false);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_BSPPL_DPT_CD_NE", "01"),
					MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_BSPPL_DPT_CD_NE"),
					ApDtl_Chk01_DtlR.$bsppl_dpt_cd, chkL, ApDtl_Chk01_DtlR.$bsppl_cd,
					ApDtl_Chk01_DtlR.$base_dt, "tmp_no_chk_flg");
			
			for (ApDtl_Chk01_DtlR chkR : chkL) {
				if (isNull(chkR.bsppl_dpt_cd())) {
					msgL.add(new MCMessage(chkR, null, MSBHL0001, chkR.bsppl_cd(), toYMDString(chkR.base_dt()), toDispGUIIndex(chkR)));
				}
			}
			
			putBspplDptCdCache(chkL);
			
			return msgL;
		}
		
		/**
		 * 為替差損益の対象の場合、仕入実績ＮＯに対して支払実績が登録されていると、訂正・取消不可とする。
		 * @param dtlL 上り電文の買掛明細リスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkExcGainLoss(MCList<ApDtl_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			// 為替差損益の対象の抽出
			MCList<ApDtl_Chk01_DtlR> xrateL = MCList.create(ApDtl_Chk01_DtlR.class);
			for (ApDtl_Chk01_DtlR dtlR : dtlL) {
				
				if ((isCrt(dtlR) || isUpd(dtlR)) && isMakeCrt(dtlR)) {
					if (!isSame(dtlR.trd_cur_cd(), getCo().base_cur_cd())) {
						xrateL.add(dtlR);
					}
				}
				if (isUpd(dtlR) || isDel(dtlR)) {
					
					MST_AP_D_R apDR = getApDR(dtlR);
					
					if (!isNull(apDR)) {
						if (!isSame(apDR.trd_cur_cd(), getCo().base_cur_cd())) {
							xrateL.add(dtlR);
						}
					}
				}
			}
			
			// 支払実績登録後（受領インボイス管理ＮＯ⇒支払実績ＮＯ単位）、仕入数量の変更に関わる変更は不可⇒仕入実績の訂正を不可とする。
			ArrayList<MCList<ApDtl_Chk01_DtlR>> grpAllL = new ArrayList<>();
			for (MCList<ApDtl_Chk01_DtlR> ivL : xrateL.groupList(ApDtl_Chk01_DtlR.$rcpt_iv_mng_no)) {
				ApDtl_Chk01_DtlR baseR = ivL.get(0);
				if (isIv(baseR)) {
					grpAllL.add(ivL);
				}
				else {
					for (MCList<ApDtl_Chk01_DtlR> purcL : ivL.groupList(ApDtl_Chk01_DtlR.$purc_act_no)) {
						grpAllL.add(purcL);
					}
				}
			}
			if (grpAllL.isEmpty()) {
				return msgL;
			}
			
			for (MCList<ApDtl_Chk01_DtlR> grpL : grpAllL) {
				ApDtl_Chk01_DtlR baseR = grpL.get(0);
				MCList<MST_AP_APPL_SCHD_R> l = getApApplSchdR(baseR);
				
				if (!isNull(l)) {
					MCList<MST_AP_APPL_SCHD_R> ngL = l.subList(r -> !MSC_PAY_STS_TYP.isNOT_PAY(r.pay_sts_typ()));

					// 都度支払の支払予定削除に伴う自動相殺実績の削除を考慮
					MCList<MST_AP_APPL_SCHD_R> rmvL = MCList.create(MST_AP_APPL_SCHD_R.class);
					for (MST_AP_APPL_SCHD_R r : ngL) {
						for (ApDtl_Chk01_DtlR dtlR : grpL) {
							if (!dtlR.err_flg() && canDelPaySchd(r.getStringNE("pay_chk_mng_no"))) {
								rmvL.add(r);
								break;
							}
						}
					}
					ngL.removeAll(rmvL);
					
					if (!isNull(ngL)) {
						grpL.setBoolean(ApDtl_Chk01_DtlR.$err_flg, true);
						if (isIv(baseR)) {
							msgL.add(new MCMessage(baseR, null, MSBHL0039, null, baseR.rcpt_iv_mng_no(), toDispGUIIndex(baseR)));
						}
						else {
							msgL.add(new MCMessage(baseR, null, MSBHL0039, baseR.purc_act_no(), null, toDispGUIIndex(baseR)));
						}
					}
				}
			}
			
			return msgL;
		}
		
	}
	/**
	 * ApDtl_Upd01オペレーション.<p>
	 *
	 * 買掛明細を登録・更新・取消する。<br>
	 */
	public class ApDtl_Upd01 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Upd01 {
		
		/**
		 * 新規登録の買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _insApDL = null;
		
		/**
		 * 更新対象の買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _updApDL = null;
		
		/**
		 * 支払予定削除時に取得した上り電文ない買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _canApDL = null;
		
		protected final String PEG_NO_COL = "peg_no";
		protected final String HDR_PEG_NO_COL = "hdr_peg_no";
		
		protected final String REG_DT_COL = "reg_dt";
		
		/**
		 * 案件手配ＮＯ情報のキャッシュ
		 */
		protected FXUCL_Cache<MST_WRK_SNO_R> _wrkSnoCache = null;
		
		/**
		 * 新規・更新対象の案件手配ＮＯのキャッシュを作成する。
		 * @param dtlL 上り電文の買掛明細リスト
		 */
		protected void initWrkSnoCache(MCList<ApDtl_Chk01_DtlR> dtlL) {
			MCList<ApDtl_Chk01_DtlR> bindL = dtlL.subList(r->!isNullOrNullVal(r.sno1()) && isMakeCrt(r) && (isCrt(r) || isUpd(r)));
			if (_wrkSnoCache == null) {
				_wrkSnoCache = new FXUCL_Cache<>();
				_wrkSnoCache.setFixMaxCacheSize(-1);
			}
			MCList<MST_WRK_SNO_R> wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MCQueryApiBuilder wrkSnoL_bldr = MCQueryApiBuilder.create(MST_WRK_SNO_R.create("T"));
			dbSelectKey("MSBHL5020_MST_WRK_SNO_S01", wrkSnoL, wrkSnoL_bldr, bindL);
			for (MST_WRK_SNO_R wrkR : wrkSnoL) {
				Comparable<?>[] key = new Comparable<?>[] {wrkR.sno1()};
				_wrkSnoCache.putCache(key, wrkR);
			}
			
			initWrkCache(wrkSnoL);
		}
		
		protected String getWrkNo(String sno1) {
			if (_wrkSnoCache == null) {
				return null;
			}
			MST_WRK_SNO_R wrkSnoR = _wrkSnoCache.getCache(sno1);
			if (wrkSnoR == null) {
				return null;
			}
			return wrkSnoR.wrk_no();
		}

		/**
		 * 案件情報のキャッシュ
		 */
		protected FXUCL_Cache<MST_WRK_R> _wrkCache = null;

		/**
		 * 新規・更新対象の案件のキャッシュを作成する。
		 * @param dtlL 上り電文の買掛明細リスト
		 */
		protected void initWrkCache(MCList<MST_WRK_SNO_R> wrkSnoL) {
			if (_wrkCache == null) {
				_wrkCache = new FXUCL_Cache<>();
				_wrkCache.setFixMaxCacheSize(-1);
			}
			MCList<MST_WRK_R> wrkL = MCList.create(MST_WRK_R.class);
			MCQueryApiBuilder wrkL_bldr = MCQueryApiBuilder.create(MST_WRK_R.create("T"));
			dbSelectKey("MSBHL5020_MST_WRK_S01", wrkL, wrkL_bldr, wrkSnoL.distinctNE(MST_WRK_SNO_R.$wrk_no));
			for (MST_WRK_R wrkR : wrkL) {
				Comparable<?>[] key = new Comparable<?>[] {wrkR.wrk_no()};
				_wrkCache.putCache(key, wrkR);
			}
		}
		
		/**
		 * 案件別に債務管理をするか否か。取引先マスタ⇒案件情報。
		 * @param dtlR 上り電文のwrk_noが未編集であること
		 * @return true：案件別に債務管理する
		 */
		protected boolean isWrkAp(ApDtl_Chk01_DtlR dtlR) {
			MAM_BP_R spplR = getBp(dtlR.sppl_cd());
			if (spplR.wrk_ap_flg()) {
				return true;
			}
			else {
				MST_WRK_R wrkR = _wrkCache.getCache(dtlR.wrk_no());
				if (wrkR != null) {
					return wrkR.wrk_ap_flg();
				}
			}
			return false;
		}

		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initCache();
			
			callPaySchdServiceDel();
			
			setCanValidFlg();
			
			makeApD();
			
			updApdD();
			
			insApD();
			
			callPaySchdService();
		}
		
		protected void initCache() {
			editRcptIvMngNo(up0());
			initWrkSnoCache(up0());
		}
		
		/**
		 * 支払予定登録サービスの削除を実行する。
		 */
		protected void callPaySchdServiceDel() {
			
			_canApDL = MCList.create(MST_AP_D_R.class);
			
			MCList<PaySchd_HdrR> hdrL = MCList.create(PaySchd_HdrR.class);
			HashSet<String> payChkMngNoSet = new HashSet<>();
			
			for (ApDtl_Chk01_DtlR dtlR : up0()) {
				
				if (isUpd(dtlR) || isDel(dtlR)) {
					
					MST_AP_D_R apDR = getApDR(dtlR);
					
					if (!isNull(apDR) && apDR.chk_flg()) {
						
						MST_PAY_CHK_R payChkR = getPayChkR(apDR);
						MAM_BP_R bpR = getBp(nvl(dtlR.bsppl_cd(), apDR.bsppl_cd()));
						
						if (isDelPaySchdTgt(apDR, payChkR, bpR)) {
							if (payChkMngNoSet.contains(payChkR.pay_chk_mng_no())) {
								continue;
							}
							
							if (!canDelPaySchd(payChkR.pay_chk_mng_no())) {
								continue;
							}
							
							PaySchd_HdrR hdrR = PaySchd_HdrR.create();
							
							hdrR.hdr_peg_no(dtlR.peg_no());
							hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							hdrR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
							hdrR.setAttributes(dtlR);
							hdrR.setStatus(MCRow.Status.NONE);
							
							hdrL.add(hdrR);
							payChkMngNoSet.add(payChkR.pay_chk_mng_no());
						}
					}
				}
			}
			
			if (!isNull(hdrL)) {
				
				MSBHL_PaySchdRegService.PaySchd_Del01 delOpe = MSBHL_PaySchdRegService.crtPaySchd_Del01();
				delOpe.up0().addAll(hdrL);
				
				MCList<MST_AP_D_R> apDL = getApDL(hdrL);
				_canApDL.addAll(apDL);
				
				MCIndexKey idxkey = delOpe.up0().createIndex(PaySchd_HdrR.$pay_chk_mng_no);
				
				for (MST_AP_D_R apDR : apDL) {
					
					PaySchd_DtlApdR upApdR = PaySchd_DtlApdR.create();
					
					PaySchd_HdrR upHdrR = delOpe.up0().getFirst(idxkey, apDR.pay_chk_mng_no());
					
					upApdR.hdr_peg_no(upHdrR.hdr_peg_no());
					upApdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					upApdR.ap_d_no(apDR.ap_d_no());
					upApdR.co_ap_d_no(apDR.crryovr_ap_d_no());
					upApdR.co_src_ap_d_no(apDR.crryovr_src_ap_d_no());
					delOpe.up1().add(upApdR);
				}
				
				setPegNo(delOpe.up1());
				
				delOpe.exec();
			}
		}
		
		/**
		 * 買掛明細を取得する。
		 */
		protected MCList<MST_AP_D_R> getApDL(MCList<PaySchd_HdrR> hdrL) {
			
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbSelectColumn("MSBHL5020_MST_AP_D_S02", apDL, apDL_bldr, MST_AP_D_R.$pay_chk_mng_no, hdrL, PaySchd_HdrR.$pay_chk_mng_no);
			
			return apDL;
		}
		
		protected void setCanValidFlg() {
			for (ApDtl_Chk01_DtlR dtlR : up0()) {
				if (isUpd(dtlR) || isDel(dtlR)) {
					MST_AP_D_R apDR = getApDR(dtlR);
					
					if (!isNull(apDR)) {
						apDR.setBooleanNE("can_valid_flg", isCanValid(dtlR));
					}
				}
			}
		}
		
		/**
		 * 取消伝票（赤伝）が有効かどうか。
		 * @param dtlR 上り電文の買掛明細
		 * @return 有効の場合はtrue
		 */
		protected boolean isCanValid(ApDtl_Chk01_DtlR dtlR) {
			
			MST_AP_D_R apDR = getApDR(dtlR);
			
			if (!isNull(apDR)) {
				if (MAC_AP_TYP.isTEMP_AP(apDR.ap_typ())) {
					return false;
				}
				MAM_BP_R bpR = getBp(apDR.bsppl_cd());
				
				if (isPayChk(dtlR, apDR) || isCrryovr(dtlR) || isSw(dtlR) || isXRateHis(dtlR)) {
					// ①：支払予定登録済みである（照合済、or、一部支払、or、全額繰越）⇒有効
					return true;
				}
				else if (!bpR.purc_interim_cl_flg() && apDR.interim_flg()){
					// ②：支払予定管理先の仕入仮単価締FLGがオフ、かつ、元伝が仮単価である⇒無効
					return false;
				}
				else if (!bpR.pay_spot_flg()){
					// ③：都度支払でない、かつ、元伝と赤伝の「締年月日」が異なる⇒有効
					MCDate canBspplClDt = getCanBspplClDt(dtlR, apDR);
					if (!isSame(apDR.bsppl_cl_dt(), canBspplClDt)) {
						return true;
					}
				}
			}
			
			// ④：上記に該当しない⇒無効
			return false;
		}
		
		/**
		 * 照合済かどうか。<br>
		 * 取消できない場合のみ、支払照合済とみなす。（取消可能の場合は、後続の処理で支払予定を取り消すため）
		 * @param dtlR 上り電文の買掛明細
		 * @param apDR 買掛明細
		 * @return 照合済の場合はtrue
		 */
		protected boolean isPayChk(ApDtl_Chk01_DtlR dtlR, MST_AP_D_R apDR) {
			return apDR.chk_flg() && !canDelPaySchd(apDR.pay_chk_mng_no());
		}
		
		/**
		 * 買掛明細を作成する。
		 */
		protected void makeApD() {
			
			_insApDL = MCList.create(MST_AP_D_R.class);
			_updApDL = MCList.create(MST_AP_D_R.class);
			
			for (ApDtl_Chk01_DtlR r : up0()) {
				
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					makeCrtApD(r);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					makeUpdApD(r);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					makeDelApD(r);
				}
			}
			
			setApDNo();
		}
		
		/**
		 * データ更新区分が新規の買掛明細を作成する。
		 * @param dtlR 上り電文の買掛明細
		 */
		protected void makeCrtApD(ApDtl_Chk01_DtlR dtlR) {
			
			if (!isMakeCrt(dtlR)) {
				return;
			}
			
			MAM_BP_R bspplR = getBp(dtlR.bsppl_cd());
			
			dtlR.ac_ym(getAcYm(dtlR.ac_dt()));
			
			if (isNull(dtlR.po_d_no())) {
				dtlR.po_no(null);
			}
			dtlR.rcpt_iv_no(nvl(dtlR.rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
			dtlR.rcpt_iv_mng_no(nvl(dtlR.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
			dtlR.wrk_no(getWrkNo(dtlR.sno1()));
			dtlR.apd().po_wrk_no(dtlR.wrk_no());
			dtlR.wrk_no(isWrkAp(dtlR) ? nvl(dtlR.wrk_no(), MAC_STR.NULL_VAL.value()) : MAC_STR.NULL_VAL.value());
			
			dtlR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			
			if (bspplR.pay_spot_flg()) {
				dtlR.bsppl_cl_dt(null);
				dtlR.bsppl_cl_day(null);
				dtlR.base_dt(dtlR.ac_dt());
			}
			else {
				dtlR.bsppl_cl_dt(getBspplClDt(dtlR)); 
				dtlR.bsppl_cl_day(getBspplClDay(dtlR));
				dtlR.base_dt(dtlR.bsppl_cl_dt());
			}
			
			dtlR.bsppl_dpt_cd(getBspplDptCd(dtlR));
			
			dtlR.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			dtlR.crryovr_ap_d_no(null);
			dtlR.crryovr_src_ap_d_no(null);
			dtlR.pay_chk_no(null);
			dtlR.pay_chk_mng_no(null);
			dtlR.chk_flg(false);
			dtlR.crryovr_flg(false);
			dtlR.valid_flg(!MAC_AP_TYP.isTEMP_AP(dtlR.ap_typ()));
			
			dtlR.apd().setAttributes(dtlR);
			_insApDL.add(dtlR.apd());
		}
		
		/**
		 * データ更新区分が更新の買掛明細を作成する。
		 * @param dtlR 上り電文の買掛明細
		 */
		protected void makeUpdApD(ApDtl_Chk01_DtlR dtlR) {
			
			MST_AP_D_R apDR = getApDR(dtlR);
			
			setValid(apDR);
			
			makeCanR(apDR, dtlR);
			
			makeCrtApD(dtlR);
		}
		
		/**
		 * データ更新区分が削除の買掛明細を作成する。
		 * @param dtlR 上り電文の買掛明細
		 */
		protected void makeDelApD(ApDtl_Chk01_DtlR dtlR) {
			
			MST_AP_D_R apDR = getApDR(dtlR);
			
			setValid(apDR);
			
			makeCanR(apDR, dtlR);
		}
		
		/**
		 * 買掛明細の有効を設定する。
		 * @param apDR 買掛明細
		 */
		protected void setValid(MST_AP_D_R apDR) {
			
			if (isNull(apDR)) {
				return;
			}
			
			apDR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
			
			if (!isCanValid(apDR)) {
				apDR.valid_flg(false);
			}
			else {
				apDR.setBooleanNE("can_valid_flg", true);
			}
			_updApDL.add(apDR);
		}
		
		/**
		 * 取消（赤伝）の買掛明細を作成する。
		 * @param apDR 元伝の買掛明細
		 * @param dtlR 上り電文の買掛明細
		 */
		protected void makeCanR(MST_AP_D_R apDR, ApDtl_Chk01_DtlR dtlR) {
			
			if (isNull(apDR)) {
				return;
			}
			
			MST_AP_D_R canApDR = apDR.clone();
			
			MAM_BP_R bspplR = getBp(canApDR.bsppl_cd());
					
			canApDR.valid_flg(isCanValid(apDR));
			
			canApDR.purc_act_d_seq(dtlR.can_purc_act_d_seq());
			canApDR.purc_act_seq(dtlR.can_purc_act_seq());
			canApDR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			
			canApDR.ap_dpt_cd(dtlR.can_ap_dpt_cd());
			canApDR.ac_dt(dtlR.can_ac_dt());
			canApDR.ac_ym(getAcYm(dtlR.can_ac_dt()));
			canApDR.pay_basis_dt(dtlR.can_pay_basis_dt());
			
			MCDate baseDt = null;
			if (bspplR.pay_spot_flg()) {
				canApDR.bsppl_cl_dt(null);
				canApDR.bsppl_cl_day(null);
				baseDt = canApDR.ac_dt();
			}
			else {
				if (isNull(canApDR.pay_crryovr_times())) {
					canApDR.pay_crryovr_times(0);
				}
				canApDR.bsppl_cl_dt(getCanBspplClDt(dtlR, apDR)); 
				canApDR.bsppl_cl_day(getCanBspplClDay(dtlR, apDR)); 
				baseDt = canApDR.bsppl_cl_dt();
			}
			
			canApDR.bsppl_dpt_cd(getBspplDptCd(canApDR.bsppl_cd(), baseDt));
			
			canApDR.trd_unit_qty(canApDR.trd_unit_qty().negate());
			canApDR.base_unit_qty(canApDR.base_unit_qty().negate());
			canApDR.trd_cur_amt(canApDR.trd_cur_amt().negate());
			canApDR.trd_cur_tax_amt(canApDR.trd_cur_tax_amt().negate());
			if (!isNull(canApDR.trd_cur_dscnt_amt())) {
				canApDR.trd_cur_dscnt_amt(canApDR.trd_cur_dscnt_amt().negate());
			}
			canApDR.base_cur_amt(canApDR.base_cur_amt().negate());
			canApDR.base_cur_tax_amt(canApDR.base_cur_tax_amt().negate());
			if (!isNull(canApDR.base_cur_dscnt_amt())) {
				canApDR.base_cur_dscnt_amt(canApDR.base_cur_dscnt_amt().negate());
			}
			if (!isNull(canApDR.wtax_amt())) {
				canApDR.wtax_amt(canApDR.wtax_amt().negate());
			}
			if (!isNull(canApDR.trd_cur_proc_amt())) {
				canApDR.trd_cur_proc_amt(canApDR.trd_cur_proc_amt().negate());
			}
			if (!isNull(canApDR.trd_cur_onr_prov_amt())) {
				canApDR.trd_cur_onr_prov_amt(canApDR.trd_cur_onr_prov_amt().negate());
			}
			if (!isNull(canApDR.base_cur_proc_amt())) {
				canApDR.base_cur_proc_amt(canApDR.base_cur_proc_amt().negate());
			}
			if (!isNull(canApDR.base_cur_onr_prov_amt())) {
				canApDR.base_cur_onr_prov_amt(canApDR.base_cur_onr_prov_amt().negate());
			}
			canApDR.crryovr_ap_d_no(null);
			canApDR.crryovr_src_ap_d_no(null);
			canApDR.pay_chk_no(null);
			canApDR.pay_chk_mng_no(null);
			canApDR.chk_flg(false);
			canApDR.sw_flg(false);
			
			canApDR.setAttributes(dtlR);
			_insApDL.add(canApDR);
		}
		
		/**
		 * 取消伝票（赤伝）が有効かどうか。
		 * @param apDR 買掛明細
		 * @return 有効の場合はtrue
		 */
		protected boolean isCanValid(MST_AP_D_R apDR) {
			return apDR.getBooleanNE("can_valid_flg");
		}
		
		/**
		 * 買掛明細ＮＯの発番を行う。
		 */
		protected void setApDNo() {
			
			_insApDL.sort(MST_AP_D_R.$purc_act_d_no, MST_AP_D_R.$purc_act_d_seq);
			
			doSeqCache(MSC_NUM_SYS_TYP.APD, _insApDL.size());
			
			for (MST_AP_D_R apDR : _insApDL) {
				apDR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
				apDR.org_ap_d_no(apDR.ap_d_no());
			}
		}
		
		/**
		 * 買掛明細を更新する。
		 */
		protected void updApdD() {
			
			if (!isNull(_updApDL)) {
				MST_AP_D_R t = MST_AP_D_R.create("T");
				MCQueryApiBuilder updApDL_bldr = MCQueryApiBuilder.create(t);
				updApDL_bldr.setSet(t.valid_flg);
				updApDL_bldr.addSet(t.slip_sts_typ);
				dbUpdateKey("MSBHL5020_MST_AP_D_U01", _updApDL, updApDL_bldr);
			}
		}
		
		/**
		 * 買掛明細を登録する。
		 */
		protected void insApD() {
			
			if (!isNull(_insApDL)) {
				MCQueryApiBuilder insApDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
				dbInsertEx("MSBHL5020_MST_AP_D_I01", _insApDL, insApDL_bldr);
			}
		}
		
		/**
		 * 支払予定登録サービスを実行する
		 */
		protected void callPaySchdService() {

			if (!isNull(_insApDL)) {
				MCList<MST_AP_D_R> allL = MCList.create(MST_AP_D_R.class);
				allL.addAll(_insApDL);
				
				if (!isNull(_canApDL)) {
					// 取消した支払照合に含まれ、かつ、有効な買掛明細を追加する
					MST_AP_D_R t = MST_AP_D_R.create("T");
					MCQueryApiBuilder canApDL_bldr = MCQueryApiBuilder.create(t);
					canApDL_bldr.setWhere(t.ap_d_no.eq(bind("ap_d_no")));
					canApDL_bldr.addConstWhereWithAnd(t.chk_flg.eq(value(false)));
					canApDL_bldr.addConstWhereWithAnd(t.valid_flg.eq(value(true)));
					dbSelect("MSBHL5020_MST_AP_D_S03", _canApDL, canApDL_bldr, _canApDL, null);
					allL.addAll(_canApDL);
				}
				
				MCList<MST_AP_D_R> tgtApDL = MCList.create(MST_AP_D_R.class);
				tgtApDL.addStringColumn("ref_ap_d_no");
				
				// 有効な黒伝と有効な赤伝のみ支払予定を作成する。
				for (MST_AP_D_R apDR : allL) {
					if (!apDR.valid_flg()) {
						continue;
					}
					
					MAM_BP_R bspplR = getBp(apDR.bsppl_cd());
					
					if (bspplR.pay_spot_flg()) {
						tgtApDL.add(apDR);
					}
				}
				
				if (!isNull(tgtApDL)) {
					callPaySchdRegServiceIns01(tgtApDL);
				}
			}
		}
		
		/**
		 * 支払予定登録サービスの支払予定登録を実行する。
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceIns01(MCList<MST_AP_D_R> tgtApDL) {
			
			MCList<PaySchd_HdrR> upHdrL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlApdR> upApDL = MCList.create(PaySchd_DtlApdR.class);
			MCList<PaySchd_DtlSchdR> upPaySchdL = MCList.create(PaySchd_DtlSchdR.class);
			
			// ここまでに発生しているメッセージを退避し、メッセージプールをクリア
			MCMessageList bfrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
			MCMessagePool.clear();
			boolean errFlg = false;

			callPaySchdRegServiceSrch05(tgtApDL);
			callPaySchdRegServiceSrch02(upHdrL, upApDL, tgtApDL);
			callPaySchdRegServiceLock(upHdrL);
			callPaySchdRegServiceSrch01(upHdrL, upPaySchdL, tgtApDL);
			
			MCList<PaySchd_HdrR> upHdrChkL = upHdrL.subList(r->!r.err_flg());
			
			if (!isNull(upHdrChkL)) {
				
				MSBHL_PaySchdRegService.PaySchd_Chk01 chkOpe = MSBHL_PaySchdRegService.crtPaySchd_Chk01();
				MSBHL_PaySchdRegService.PaySchd_Ins01 insOpe = MSBHL_PaySchdRegService.crtPaySchd_Ins01();
				
				MCIndexKey hdrIdxkey = upHdrChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
				MCIndexKey apDIdxkey = upApDL.createIndex(PaySchd_DtlApdR.$hdr_peg_no);
				MCIndexKey paySchdIdxkey = upPaySchdL.createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
				
				setPegNo(upApDL);
				setPegNo(upPaySchdL);
				
				for (PaySchd_HdrR hdrR : upHdrChkL) {
					chkOpe.up0().add(hdrR);
					MCList<PaySchd_DtlApdR> upApDSubL = upApDL.subList(apDIdxkey, hdrR.hdr_peg_no());
					upApDSubL.setAttributes(hdrR);
					chkOpe.up1().addAll(upApDSubL);
					MCList<PaySchd_DtlSchdR> upPaySchdSubL = upPaySchdL.subList(paySchdIdxkey, hdrR.hdr_peg_no());
					upPaySchdSubL.setAttributes(hdrR);
					chkOpe.up2().addAll(upPaySchdSubL);
				}

				chkOpe.exec();
				
				for (PaySchd_HdrR downR : chkOpe.down0()) {
					if (!downR.err_flg()) {
						insOpe.up0().addAll(upHdrChkL.subList(hdrIdxkey, downR.hdr_peg_no()));
						insOpe.up1().addAll(upApDL.subList(apDIdxkey, downR.hdr_peg_no()));
						insOpe.up2().addAll(upPaySchdL.subList(paySchdIdxkey, downR.hdr_peg_no()));
					}
					else {
						errFlg = true;
					}
				}
				
				if (!isNull(insOpe.up0())) {
					insOpe.exec();
				}
			}
			
			// 支払予定登録サービスで発生したメッセージを退避し、メッセージプールをクリア
			MCMessageList aftMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
			MCMessagePool.clear();

			// 前のメッセージを元に戻す
			MCMessagePool.addAll(bfrMsgL);

			PaySchd_HdrR errR = upHdrL.getFirst(PaySchd_HdrR.$err_flg, true);
			if (errFlg || !isNull(errR)) {
				// 支払予定登録サービスでエラーが発生した場合、支払予定画面での登録を促すメッセージを追加してから、チェックサービスのメッセージを追加する
				MCMessagePool.add(MSBHL0023);
				MCMessagePool.addAll(aftMsgL);
			}
		}
		
		/**
		 * 税差額を取得する
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch05 (MCList<MST_AP_D_R> tgtApDL) {
			MSBHL_PaySchdRegService.PaySchd_Srch05 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch05();
			MCList<MST_AP_D_R> tmpTgtApDL = tgtApDL.clone();
			tmpTgtApDL.forEach(r -> {
				setPurcActNo(r);
				setRcptIvNo(r);
				setApWrkNo(r);
			});
			String[] grpKey = {
					MST_AP_D_R.$bsppl_cd,
					MST_AP_D_R.$bsppl_dpt_cd,
					MST_AP_D_R.$purc_act_no,
					MST_AP_D_R.$rcpt_iv_mng_no,
					MST_AP_D_R.$rcpt_iv_no,
					MST_AP_D_R.$trd_cur_cd,
					MST_AP_D_R.$wrk_no
			};
			MCList<MST_AP_D_R>[] gpApDL = tmpTgtApDL.groupList(grpKey);
			int tmpPegNo = 0;
			for (MCList<MST_AP_D_R> apDL  : gpApDL) {
				for (MST_AP_D_R r : apDL) {
					PaySchd_Srch05_CndR cndR = PaySchd_Srch05_CndR.create();
					cndR.hdr_peg_no(MCNumber.valueOf(tmpPegNo));
					cndR.ap_d_no(r.ap_d_no());
					cndR.bsppl_cd(r.bsppl_cd());
					cndR.trd_cur_amt(r.trd_cur_amt());
					cndR.trd_cur_tax_amt(r.trd_cur_tax_amt());
					
					MCDate xrateBaseDt = nvl(r.bsppl_cl_dt(), r.ac_dt());
					cndR.pay_xrate(
						MAUCL_AmtUtil.getDefXrate(
							r.trd_cur_cd(),
							getBaseCur().cur_cd(),
							getCo().pay_xrate_cd(),
							xrateBaseDt));
					cndR.xrate_base_dt(xrateBaseDt);
					ope.up0().add(cndR);
				}
				tmpPegNo++;
			}
			ope.exec();
			if (!isNull(ope.down0()) && !ope.down0().isEmpty()) {
				ope.down0().forEach(r -> {
					MST_AP_D_R apdR = r.ap_d();
					apdR.setStringNE("ref_ap_d_no", r.ref_ap_d_no());
					tgtApDL.add(apdR);
				});
			}
		}
		/**
		 * 仕入実績ＮＯを設定する
		 */
		protected void setPurcActNo(MST_AP_D_R apdR) {
			if (isIvApd(apdR) || (isSwApd(apdR) && !isNullOrNullVal(apdR.rcpt_iv_no()))) {
				// インボイス取引対象でない場合のみ使用する
				apdR.purc_act_no(null);
			}
			apdR.purc_act_no(nvl(apdR.purc_act_no(), MAC_STR.NULL_VAL.value()));
		}

		/**
		 * 受領インボイスＮＯを設定する
		 */
		protected void setRcptIvNo(MST_AP_D_R apdR) {
			if (!isIvApd(apdR) && !isSwApd(apdR)) {
				// インボイス取引対象の場合のみ使用する。ただし振替先の買掛明細である場合は買掛明細の値を引き継ぐ。
				apdR.rcpt_iv_mng_no(null);
				apdR.rcpt_iv_no(null);
			}
			apdR.rcpt_iv_mng_no(nvl(apdR.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
			apdR.rcpt_iv_no(nvl(apdR.rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
		}

		/**
		 * 案件別債務管理を設定する
		 */
		protected void setApWrkNo(MST_AP_D_R apdR) {
			// 上り電文の案件NO（＝買掛明細.案件NO）はマスタ考慮済み
			apdR.wrk_no(nvl(apdR.wrk_no(), MAC_STR.NULL_VAL.value()));
		}
		/**
		 * インボイス取引対象の発注先か判定する
		 * 
		 * @param param apdR 買掛明細
		 * @return インボイス取引対象の場合trueを返却する
		 */
		protected boolean isIvApd(MST_AP_D_R apdR) {
			MAM_BP_R bpR = getBp(apdR.sppl_cd());
			return !isNull(bpR) && bpR.sppl_iv_flg() && !isNullOrNullVal(apdR.rcpt_iv_no());
		}

		/**
		 * 残高振替後の買掛明細であるか判定する
		 * 
		 * @param param apdR 買掛明細
		 * @return 残高振替後の買掛明細の場合trueを返却する
		 */
		protected boolean isSwApd(MST_AP_D_R apdR) {
			return !isNull(apdR) && (!isNullAnd(apdR.sw_src_ap_d_no(), apdR.sw_src_pay_schd_no())) ;
		}
		/**
		 * 支払予定登録サービスの買掛明細まとめを実行し、支払予定登録サービスの支払予定登録の電文を作成する。
		 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
		 * @param upApDL 支払予定登録の上り電文（買掛明細）
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch02(MCList<PaySchd_HdrR> upHdrL, MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> tgtApDL) {
			
			MSBHL_PaySchdRegService.PaySchd_Srch02 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch02();
			
			setPegNo(tgtApDL);
			for (MST_AP_D_R apDR : tgtApDL) {
				
				PaySchd_Srch02_CndR cndR = PaySchd_Srch02_CndR.create();
				
				cndR.peg_no(apDR.getNumberNE(PEG_NO_COL));
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
				cndR.purc_act_no(apDR.purc_act_no());
				cndR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(apDR.rcpt_iv_no());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(apDR.bsppl_cl_dt());
				cndR.bsppl_cl_day(apDR.bsppl_cl_day());
				cndR.wrk_no(apDR.wrk_no());
				cndR.trd_ptn_typ(apDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_amt(apDR.trd_cur_amt());
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.reg_dt(apDR.ac_dt());
				
				ope.up0().add(cndR);
			}
			
			ope.exec();
			
			for (PaySchd_Srch02_RsltR srch02RsltR : ope.down1()) {
				
				PaySchd_HdrR hdrR = PaySchd_HdrR.create();
				
				hdrR.hdr_peg_no(srch02RsltR.hdr_peg_no());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.bsppl_cd(srch02RsltR.bsppl_cd());
				hdrR.bsppl_dpt_cd(srch02RsltR.bsppl_dpt_cd());
				hdrR.purc_act_no(srch02RsltR.purc_act_no());
				hdrR.rcpt_iv_mng_no(srch02RsltR.rcpt_iv_mng_no());
				hdrR.rcpt_iv_no(srch02RsltR.rcpt_iv_no());
				hdrR.wrk_no(srch02RsltR.wrk_no());
				hdrR.pay_spot_flg(srch02RsltR.pay_spot_flg());
				hdrR.bsppl_cl_day(srch02RsltR.bsppl_cl_day());
				hdrR.bsppl_cl_dt(srch02RsltR.bsppl_cl_dt());
				hdrR.trd_cur_cd(srch02RsltR.trd_cur_cd());
				hdrR.pay_xrate(srch02RsltR.pay_xrate());
				
				upHdrL.add(hdrR);
			}
			
			MCIndexKey apDNoSrch02Idxkey = ope.down0().createIndex(PEG_NO_COL);
			
			for (MST_AP_D_R apDR : tgtApDL) {
				
				PaySchd_Srch02_CndR srch02CndR = ope.down0().getFirst(apDNoSrch02Idxkey, apDR.getNumberNE(PEG_NO_COL));
				
				apDR.setNumberNE(HDR_PEG_NO_COL, srch02CndR.hdr_peg_no());
				if (srch02CndR.err_flg()) {
					apDR.setBooleanNE(ERR_FLG_COL, true);
				}
				else {
					PaySchd_DtlApdR upApDR = PaySchd_DtlApdR.create();
					copyPaySchd_DtlApdR_MST_AP_D_R(upApDR, apDR);
					upApDL.add(upApDR);
				}
			}
			
			MCIndexKey apdHdrIdxKey = tgtApDL.createIndex(HDR_PEG_NO_COL);
			for (PaySchd_HdrR hdrR : upHdrL) {
				// 赤伝と黒伝が１つの支払予定にまとまる場合、登録日は黒伝の計上日⇒赤伝の計上日、とする
				MCList<MST_AP_D_R> subL = tgtApDL.subList(apdHdrIdxKey, hdrR.hdr_peg_no());
				subL.sort(MST_AP_D_R.$slip_sts_typ);
				MST_AP_D_R baseR = subL.get(0);
				hdrR.reg_dt(baseR.ac_dt());
				subL.setDateNE(REG_DT_COL, hdrR.reg_dt());
				hdrR.setAttributes(baseR);
				hdrR.setStatus(MCRow.Status.NONE);
			}
			
		}
		
		protected void copyPaySchd_DtlApdR_MST_AP_D_R(PaySchd_DtlApdR dest, MST_AP_D_R src) {
			dest.hdr_peg_no(src.getNumberNE(HDR_PEG_NO_COL));
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			dest.ap_d_no(src.ap_d_no());
			dest.trd_ptn_typ(src.trd_ptn_typ());
			dest.slip_sts_typ(src.slip_sts_typ());
			dest.asppl_cd(src.asppl_cd());
			dest.ap_dpt_cd(src.ap_dpt_cd());
			dest.ap_typ(src.ap_typ());
			dest.interim_flg(src.interim_flg());
			dest.pay_amt(src.trd_cur_amt());
			dest.pay_tax_amt(src.trd_cur_tax_amt());
			dest.pay_wtax_amt(src.wtax_amt());
			dest.repurc_obli_flg(src.repurc_obli_flg());
			dest.pay_proc_amt(src.trd_cur_proc_amt());
			dest.pay_onr_prov_amt(src.trd_cur_onr_prov_amt());
			dest.ref_ap_d_no(src.getStringNE("ref_ap_d_no"));
		}

		/**
		 * 支払予定登録サービスの金額按分を実行し、支払予定登録サービスの支払予定登録の電文を作成する。
		 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
		 * @param upPaySchdL 支払予定登録の上り電文（支払予定）
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch01(MCList<PaySchd_HdrR> upHdrL, 
				MCList<PaySchd_DtlSchdR> upPaySchdL, MCList<MST_AP_D_R> tgtApDL) {
			
			MSBHL_PaySchdRegService.PaySchd_Srch01 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch01();
			
			MCList<MST_AP_D_R> tmpApDL = tgtApDL.shallowClone();
			
			for (MST_AP_D_R apDR : tmpApDL) {
				if (apDR.getBooleanNE(ERR_FLG_COL)) {
					continue;
				}
				
				PaySchd_Srch01_CndR cndR = PaySchd_Srch01_CndR.create();
				
				cndR.hdr_peg_no(apDR.getNumberNE(HDR_PEG_NO_COL));
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.asppl_cd(apDR.asppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
				cndR.ap_dpt_cd(apDR.ap_dpt_cd());
				cndR.trd_ptn_typ(apDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.ac_dt(apDR.ac_dt());
				cndR.pay_basis_dt(apDR.pay_basis_dt());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(apDR.bsppl_cl_dt());
				cndR.ap_typ(apDR.ap_typ());
				cndR.trd_cur_amt(apDR.trd_cur_amt());
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.wtax_amt(apDR.wtax_amt());
				cndR.is_ref_xrate(true);
				cndR.zero_flg(true);
				cndR.base_dt(apDR.getDateNE(REG_DT_COL));
				cndR.setAttributes(apDR);
				
				ope.up0().add(cndR);
			}
			
			ope.exec();
			
			HashSet<MCNumber> errSet = new HashSet<>();
			MCList<PaySchd_Srch01_RsltR> errPayDptL = MCList.create(PaySchd_Srch01_RsltR.class);
			
			for(PaySchd_Srch01_RsltR srch01RsltR : ope.down1()) {
				
				if (isNull(srch01RsltR.pay_schd_dt()) || isNull(srch01RsltR.pay_dpt_cd())) {
					errSet.add(srch01RsltR.hdr_peg_no());
					errPayDptL.add(srch01RsltR);
					continue;
				}
				
				PaySchd_DtlSchdR upPaySchdR = PaySchd_DtlSchdR.create();
				
				upPaySchdR.hdr_peg_no(srch01RsltR.hdr_peg_no());
				upPaySchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				upPaySchdR.asppl_cd(srch01RsltR.asppl_cd());
				upPaySchdR.ap_dpt_cd(srch01RsltR.ap_dpt_cd());
				upPaySchdR.pay_dpt_cd(srch01RsltR.pay_dpt_cd());
				upPaySchdR.ap_typ(srch01RsltR.ap_typ());
				upPaySchdR.ap_sttl_cd(srch01RsltR.ap_sttl_cd());
				upPaySchdR.ap_sttl_typ(srch01RsltR.ap_sttl_typ());
				upPaySchdR.pay_schd_dt(srch01RsltR.pay_schd_dt());
				upPaySchdR.pay_bank_ac_cd(srch01RsltR.pay_bank_ac_cd());
				upPaySchdR.bank_ac_cd(srch01RsltR.bank_ac_cd());
				upPaySchdR.ap_setoff_typ(srch01RsltR.ap_setoff_typ());
				upPaySchdR.setoff_cd(srch01RsltR.setoff_cd());
				upPaySchdR.setoff_nm(srch01RsltR.setoff_nm());
				upPaySchdR.so_dpt_cd(srch01RsltR.so_dpt_cd());
				upPaySchdR.trd_cur_amt(srch01RsltR.trd_cur_amt());
				upPaySchdR.trd_cur_com_paid_tax_cd(srch01RsltR.trd_cur_com_paid_tax_cd());
				upPaySchdR.xrate(srch01RsltR.xrate());
				
				upPaySchdL.add(upPaySchdR);
			}
			
			for (PaySchd_Srch01_CndR down0R : ope.down0()) {
				if (down0R.err_flg()) {
					errSet.add(down0R.hdr_peg_no());
				}
			}
			
			if (!errSet.isEmpty()) {
				MCIndexKey hdrIdxkey = upHdrL.createIndex(PaySchd_HdrR.$hdr_peg_no);
				MCIndexKey tmpIdxkey = tmpApDL.createIndex(HDR_PEG_NO_COL);
				MCIndexKey payDptKey = errPayDptL.createIndex(PaySchd_Srch01_RsltR.$hdr_peg_no, PaySchd_Srch01_RsltR.$pay_dpt_cd);
				
				for (MCNumber hdrPegNo : errSet) {
					PaySchd_HdrR hdrR = upHdrL.getFirst(hdrIdxkey, hdrPegNo);
					hdrR.err_flg(true);
					for (MST_AP_D_R apDR : tmpApDL.subList(tmpIdxkey, hdrPegNo)) {
						apDR.setBooleanNE(ERR_FLG_COL, true);
					}
					MCList<PaySchd_Srch01_RsltR> errPayDptSubL = errPayDptL.subList(payDptKey, hdrPegNo, null);
					if (!isNull(errPayDptSubL)) {
						MAM_BP_R bspplR = getBp(hdrR.bsppl_cd());
						for (PaySchd_Srch01_RsltR errR : errPayDptSubL.distinctNE(PaySchd_Srch01_RsltR.$pay_schd_dt)) {
							if (isNull(errR.pay_schd_dt())) {
								MCMessagePool.add(new MCMessage(hdrR, null, MSBHL0033, bspplR.bsppl_cd(), toDispGUIIndex(hdrR)));
							}
							else {
								MCMessagePool.add(new MCMessage(hdrR, null, MSBHL0034, bspplR.psppl_cd(), toYMDString(errR.pay_schd_dt()), toDispGUIIndex(hdrR)));
							}
						}
					}
				}
			}
		}
		
	}
		
	/**
	 * 支払予定管理先締年月日を算出できるかチェックする。
	 * @param dtlL 上り電文の買掛明細リスト
	 * @return エラーメッセージ
	 */
	protected MCMessageList chkBspplClDt(MCList<ApDtl_Chk01_DtlR> dtlL) {
		
		MCMessageList msgL = new MCMessageList();
		
		MCList<ApDtl_Chk01_DtlR> chkL = MCList.create(ApDtl_Chk01_DtlR.class);
		
		for (ApDtl_Chk01_DtlR dtlR : dtlL) {
			
			// 黒伝
			if ((isCrt(dtlR) || isUpd(dtlR)) && isMakeCrt(dtlR)) {
				
				MAM_BP_R bpR = getBp(dtlR.bsppl_cd());
				
				if (!bpR.pay_spot_flg()) {
					
					ApDtl_Chk01_DtlR chkR = ApDtl_Chk01_DtlR.create();
					
					chkR.bsppl_cd(dtlR.bsppl_cd());
					chkR.pay_basis_dt(dtlR.pay_basis_dt());
					chkR.pay_crryovr_times(dtlR.pay_crryovr_times());
					chkR.setAttributes(dtlR);
					
					chkL.add(chkR);
				}
			}
			
			// 赤伝
			if (isUpd(dtlR) || isDel(dtlR)) {
				
				MST_AP_D_R apDR = getApDR(dtlR);
				
				if (!isNull(apDR)) {
					
					MAM_BP_R bpR = getBp(apDR.bsppl_cd());
					
					if (!bpR.pay_spot_flg()) {
						
						ApDtl_Chk01_DtlR chkR = ApDtl_Chk01_DtlR.create();
						
						chkR.bsppl_cd(apDR.bsppl_cd());
						chkR.pay_basis_dt(dtlR.can_pay_basis_dt());
						chkR.pay_crryovr_times(nvl(apDR.pay_crryovr_times(), MCNumber.ZERO));
						chkR.setAttributes(dtlR);
						
						chkL.add(chkR);
					}
				}
			}
		}
		
		MSBHL_ApUtil.setBspplClDt(chkL, MST_AP_D_R.$bsppl_cd, MST_AP_D_R.$pay_basis_dt, MST_AP_D_R.$pay_crryovr_times, MST_AP_D_R.$bsppl_cl_dt, null, MST_AP_D_R.$bsppl_cl_day);
		
		for (ApDtl_Chk01_DtlR chkR : chkL) {
			if (isNull(chkR.bsppl_cl_dt())) {
				msgL.add(new MCMessage(chkR, null, MSBHL0002, 
						chkR.bsppl_cd(), toYMDString(chkR.pay_basis_dt()), chkR.pay_crryovr_times(), toDispGUIIndex(chkR)));
			}
		}
		
		putBspplClDtCache(chkL);
		
		return msgL;
	}
	
	/**
	 * 支払予定登録サービスのロック処理を実行する。
	 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
	 */
	protected void callPaySchdRegServiceLock(MCList<PaySchd_HdrR> upHdrL) {
		if (isNull(upHdrL)) {
			return ;
		}
		
		MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 ope = MSBHL_PaySchdRegService.crtPaySchd_Lock_Upd01();
		
		for (PaySchd_HdrR upHdrR : upHdrL) {
			
			MST_PAY_SCHD_LOCK_R cndR = MST_PAY_SCHD_LOCK_R.create();
			
			cndR.bsppl_cd(upHdrR.bsppl_cd());
			cndR.bsppl_dpt_cd(upHdrR.bsppl_dpt_cd());
			cndR.purc_act_no(upHdrR.purc_act_no());
			cndR.rcpt_iv_mng_no(upHdrR.rcpt_iv_mng_no());
			cndR.rcpt_iv_no(upHdrR.rcpt_iv_no());
			cndR.wrk_no(upHdrR.wrk_no());
			cndR.trd_cur_cd(upHdrR.trd_cur_cd());
			
			ope.up0().add(cndR);
		}
		
		ope.exec();
	}


	
	/**
	 * ApDtl_Upd02オペレーション.<p>
	 *
	 * 一部支払、もしくは全額支払に対する繰越処理を行う。<br>
	 */
	public class ApDtl_Upd02 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Upd02 {
		
		/**
		 * 繰越元買掛明細のインデックスキー
		 */
		protected MCIndexKey _crryovrSrcApDIdxKey = null;
		
		/**
		 * 繰越元買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _crryovrSrcApDL = null;
		
		/**
		 * 繰越用の買掛明細リスト（新規登録）
		 */
		protected MCList<MST_AP_D_R> _crryovrApDL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			doApDNoSeqCache();
			
			getCrryovrSrcApDL();
			
			doCrryovr();
			
			updCrryovrSrcApdD();
			
			insCrryovrApD();
			
			setDown();
		}
		
		/**
		 * 発番する買掛明細ＮＯのキャッシュを作成する。
		 */
		protected void doApDNoSeqCache() {

			if (!up0().isEmpty()) {
				
				up0().sort(ApDtl_Upd02_DtlR.$crryovr_src_ap_d_no);
				
				// 上り電文の１レコードに対して繰越分と一部支払・全数繰越を作成する
				doSeqCache(MSC_NUM_SYS_TYP.APD, up0().size() * 2);
			}
		}
		
		/**
		 * 繰越元の買掛明細を取得する。
		 */
		protected void getCrryovrSrcApDL() {
			
			_crryovrSrcApDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder crryovrSrcApDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbSelectColumn("MSBHL5020_MST_AP_D_S04", _crryovrSrcApDL, crryovrSrcApDL_bldr, MST_AP_D_R.$ap_d_no, up0(), ApDtl_Upd02_DtlR.$crryovr_src_ap_d_no);
			
			_crryovrSrcApDIdxKey = _crryovrSrcApDL.createIndex(MST_AP_D_R.$ap_d_no);
		}
		
		/**
		 * 引数で指定された買掛明細ＮＯで買掛明細を取得する。
		 * @param apDNo 買掛明細ＮＯ
		 * @return 買掛明細
		 */
		protected MST_AP_D_R getCrryovrSrcApDR(String apDNo) {

			return _crryovrSrcApDL.getFirst(_crryovrSrcApDIdxKey, apDNo);
		}
		
		/**
		 * 繰越を行う。
		 */
		protected void doCrryovr() {
			
			_crryovrApDL = MCList.create(MST_AP_D_R.class);
			
			for (ApDtl_Upd02_DtlR dtlR : up0()) {
				
				MST_AP_D_R crryovrSrcApDR = getCrryovrSrcApDR(dtlR.crryovr_src_ap_d_no());
				
				calcBaseCurAmt(dtlR, crryovrSrcApDR);
				
				MST_AP_D_R crryovrApdR = crtCrryovrApdR(dtlR, crryovrSrcApDR);
				
				crtPayApdR(dtlR, crryovrApdR, crryovrSrcApDR);
			}
		}
		
		/**
		 * 取引通貨の金額を基準単位に計算する。
		 * @param dtlR 上り電文の買掛明細
		 * @param crryovrSrcApDR 繰越元の買掛明細
		 */
		protected void calcBaseCurAmt(ApDtl_Upd02_DtlR dtlR, MST_AP_D_R crryovrSrcApDR) {

			dtlR.pay_tax_amt(nvl(dtlR.pay_tax_amt(), MCNumber.ZERO));
			
			dtlR.pay_base_cur_amt(convToBaseCur(dtlR.pay_amt(), crryovrSrcApDR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.pay_base_cur_tax_amt(convToBaseCur(dtlR.pay_tax_amt(), crryovrSrcApDR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(dtlR.pay_proc_amt())) {
				dtlR.pay_base_cur_proc_amt(convToBaseCur(dtlR.pay_proc_amt(), crryovrSrcApDR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			if (!isNull(dtlR.pay_onr_prov_amt())) {
				dtlR.pay_base_cur_onr_prov_amt(convToBaseCur(dtlR.pay_onr_prov_amt(), crryovrSrcApDR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		
		/**
		 * 繰越分の買掛明細を作成する。
		 * @param dtlR 上り電文の買掛明細
		 * @param crryovrSrcApDR 繰越元の買掛明細
		 * @return 繰越分の買掛明細
		 */
		protected MST_AP_D_R crtCrryovrApdR(ApDtl_Upd02_DtlR dtlR, MST_AP_D_R crryovrSrcApDR) {
			
			MST_AP_D_R crryovrApdR = crryovrSrcApDR.clone();
			
			crryovrApdR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
			
			crryovrApdR.bsppl_cl_dt(dtlR.co_bsppl_cl_dt());
			crryovrApdR.bsppl_cl_day(dtlR.co_bsppl_cl_day());
			crryovrApdR.bsppl_dpt_cd(nvl(dtlR.co_bsppl_dpt_cd(), crryovrApdR.bsppl_dpt_cd()));
			
			if (!isNull(crryovrSrcApDR.pay_crryovr_times()) || !isNull(dtlR.pay_crryovr_times())) {
				crryovrApdR.pay_crryovr_times(
						sum(nvl(crryovrSrcApDR.pay_crryovr_times(), MCNumber.ZERO), nvl(dtlR.pay_crryovr_times(), MCNumber.ZERO)));
			}
			
			if (MSC_PAY_MTD_TYP.isALL_CO(dtlR.pay_mtd_typ())) {
				crryovrApdR.trd_unit_qty(crryovrSrcApDR.trd_unit_qty());
				crryovrApdR.base_unit_qty(crryovrSrcApDR.base_unit_qty());
			}
			else if (MSC_PAY_MTD_TYP.isPART_PAY(dtlR.pay_mtd_typ())){
				crryovrApdR.trd_unit_qty(0);
				crryovrApdR.base_unit_qty(0);
			}
			
			crryovrApdR.trd_cur_amt(crryovrSrcApDR.trd_cur_amt().subtract(dtlR.pay_amt()));
			crryovrApdR.trd_cur_tax_amt(crryovrSrcApDR.trd_cur_tax_amt().subtract(dtlR.pay_tax_amt()));
			crryovrApdR.base_cur_amt(crryovrSrcApDR.base_cur_amt().subtract(dtlR.pay_base_cur_amt()));
			crryovrApdR.base_cur_tax_amt(crryovrSrcApDR.base_cur_tax_amt().subtract(dtlR.pay_base_cur_tax_amt()));
			if (!isNull(crryovrSrcApDR.wtax_amt()) || !isNull(dtlR.pay_wtax_amt())) {
				crryovrApdR.wtax_amt(nvl(crryovrSrcApDR.wtax_amt(), MCNumber.ZERO).subtract(
						nvl(dtlR.pay_wtax_amt(), MCNumber.ZERO)));
			}
			
			crryovrApdR.crryovr_ap_d_no(null);
			crryovrApdR.crryovr_src_ap_d_no(crryovrSrcApDR.ap_d_no());
			
			crryovrApdR.pay_chk_no(null);
			crryovrApdR.pay_chk_mng_no(null);
			crryovrApdR.chk_flg(false);
			
			crryovrApdR.crryovr_flg(true);
			if (!isNull(crryovrSrcApDR.trd_cur_proc_amt())) {
				crryovrApdR.trd_cur_proc_amt(crryovrSrcApDR.trd_cur_proc_amt().subtract(dtlR.pay_proc_amt()));
			}
			if (!isNull(crryovrSrcApDR.trd_cur_onr_prov_amt())) {
				crryovrApdR.trd_cur_onr_prov_amt(crryovrSrcApDR.trd_cur_onr_prov_amt().subtract(dtlR.pay_onr_prov_amt()));
			}
			if (!isNull(crryovrSrcApDR.base_cur_proc_amt())) {
				crryovrApdR.base_cur_proc_amt(crryovrSrcApDR.base_cur_proc_amt().subtract(dtlR.pay_base_cur_proc_amt()));
			}
			if (!isNull(crryovrSrcApDR.base_cur_onr_prov_amt())) {
				crryovrApdR.base_cur_onr_prov_amt(crryovrSrcApDR.base_cur_onr_prov_amt().subtract(dtlR.pay_base_cur_onr_prov_amt()));
			}
			
			_crryovrApDL.add(crryovrApdR);
			
			return crryovrApdR;
		}
		
		/**
		 * 一部支払、または全額繰越の買掛明細を作成する。
		 * @param dtlR 上り電文の買掛明細
		 * @param crryovrApdR 繰越分の買掛明細
		 * @param crryovrSrcApDR 繰越元の買掛明細
		 */
		protected void crtPayApdR(ApDtl_Upd02_DtlR dtlR, MST_AP_D_R crryovrApdR, MST_AP_D_R crryovrSrcApDR) {
			
			MST_AP_D_R payApdR = crryovrSrcApDR.clone();
			
			payApdR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
			
			payApdR.trd_unit_qty(crryovrSrcApDR.trd_unit_qty().subtract(crryovrApdR.trd_unit_qty()));
			payApdR.base_unit_qty(crryovrSrcApDR.base_unit_qty().subtract(crryovrApdR.base_unit_qty()));
			
			payApdR.trd_cur_amt(dtlR.pay_amt());
			payApdR.trd_cur_tax_amt(dtlR.pay_tax_amt());
			payApdR.base_cur_amt(dtlR.pay_base_cur_amt());
			payApdR.base_cur_tax_amt(dtlR.pay_base_cur_tax_amt());
			payApdR.wtax_amt(dtlR.pay_wtax_amt());
			
			payApdR.crryovr_ap_d_no(crryovrApdR.ap_d_no());
			payApdR.crryovr_src_ap_d_no(crryovrSrcApDR.ap_d_no());
			
			payApdR.pay_mtd_typ(dtlR.pay_mtd_typ());
			payApdR.pay_crryovr_times(crryovrSrcApDR.pay_crryovr_times());
			payApdR.pay_chk_no(dtlR.pay_chk_no());
			payApdR.pay_chk_mng_no(dtlR.pay_chk_mng_no());
			payApdR.chk_flg(true);
			if (!isNull(dtlR.pay_proc_amt())) {
				payApdR.trd_cur_proc_amt(dtlR.pay_proc_amt());
			}
			if (!isNull(crryovrSrcApDR.trd_cur_onr_prov_amt())) {
				payApdR.trd_cur_onr_prov_amt(dtlR.pay_onr_prov_amt());
			}
			if (!isNull(crryovrSrcApDR.base_cur_proc_amt())) {
				payApdR.base_cur_proc_amt(dtlR.pay_base_cur_proc_amt());
			}
			if (!isNull(crryovrSrcApDR.base_cur_onr_prov_amt())) {
				payApdR.base_cur_onr_prov_amt(dtlR.pay_base_cur_onr_prov_amt());
			}
			
			_crryovrApDL.add(payApdR);
			
			dtlR.pay_ap_d_no(payApdR.ap_d_no());
		}
		
		/**
		 * 繰越元の買掛明細を更新する。
		 */
		protected void updCrryovrSrcApdD() {
			
			if (!isNull(_crryovrSrcApDL)) {
				
				MST_AP_D_R t = MST_AP_D_R.create("T");
				MCQueryApiBuilder crryovrSrcApDL_bldr = MCQueryApiBuilder.create(t);
				
				_crryovrSrcApDL.clear(MST_AP_D_R.$valid_flg, MST_AP_D_R.$pay_chk_no, MST_AP_D_R.$pay_chk_mng_no, MST_AP_D_R.$chk_flg);
				
				crryovrSrcApDL_bldr.setSet(t.valid_flg, t.pay_chk_no, t.pay_chk_mng_no, t.chk_flg);
				
				dbUpdateKey("MSBHL5020_MST_AP_D_U02", _crryovrSrcApDL, crryovrSrcApDL_bldr);
			}
		}
		
		/**
		 * 繰越分と支払分の買掛明細を登録する。
		 */
		protected void insCrryovrApD() {
			
			if (!isNull(_crryovrApDL)) {
				MCQueryApiBuilder crryovrApDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
				dbInsertEx("MSBHL5020_MST_AP_D_I02", _crryovrApDL, crryovrApDL_bldr);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().setAll(up0());
		}
	}
	/**
	 * ApDtl_Del01オペレーション.<p>
	 *
	 * 一部支払、もしくは全額支払に対する繰越処理を取り消す。<br>
	 */
	public class ApDtl_Del01 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			delCrryovrApdD();
			
			updCrryovrSrcApdD();
		}
		
		/**
		 * 繰越用の買掛明細を削除する。
		 */
		protected void delCrryovrApdD() {

			MST_AP_D_R dbc = MST_AP_D_R.create("T");
			execDbDelete("MSBHL5020_MST_AP_D_D01", dbc, dbc.crryovr_src_ap_d_no.eq(bind("ap_d_no")), up0().groupBy(ApDtl_Del01_DtlR.$ap_d_no));
		}
		
		/**
		 * 繰越元の買掛明細を更新する。
		 */
		protected void updCrryovrSrcApdD() {
			
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCList<MST_AP_D_R> crryovrSrcApDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder crryovrSrcApDL_bldr = MCQueryApiBuilder.create(t);
			dbSelectColumn("MSBHL5020_MST_AP_D_S05", crryovrSrcApDL, crryovrSrcApDL_bldr, MST_AP_D_R.$ap_d_no, up0(), ApDtl_Del01_DtlR.$ap_d_no);
			
			if (!isNull(crryovrSrcApDL)) {
				
				crryovrSrcApDL.clear(MST_AP_D_R.$pay_chk_no, MST_AP_D_R.$pay_chk_mng_no, MST_AP_D_R.$chk_flg);
				
				crryovrSrcApDL.setValueNE(MST_AP_D_R.$valid_flg, true);
				
				crryovrSrcApDL_bldr.setSet(t.valid_flg, t.pay_chk_no, t.pay_chk_mng_no, t.chk_flg);
				
				dbUpdateKey("MSBHL5020_MST_AP_D_U03", crryovrSrcApDL, crryovrSrcApDL_bldr);
			}
		}
	}
	
	/**
	 * 伝票状況区分が新規の伝票を作成するかどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 削除する場合はtrue
	 */
	protected boolean isMakeCrt(ApDtl_Chk01_DtlR dtlR) {

		return !dtlR.ncv_flg() && !dtlR.accpt_dfct_flg();
	}

	/**
	 * 指定された買掛明細が新規かどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(ApDtl_Chk01_DtlR dtlR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ());
	}
	
	/**
	 * 指定された買掛明細が更新かどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(ApDtl_Chk01_DtlR dtlR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ());
	}
	
	/**
	 * 指定された買掛明細が削除かどうか。
	 * @param dtlR 上り電文の買掛明細
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(ApDtl_Chk01_DtlR dtlR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ());
	}
	
	/**
	 * ApDtl_Chk03オペレーション.<p>
	 *
	 * 残高振替に伴う買掛明細の登録が可能かチェックをする。<br>
	 */
	public class ApDtl_Chk03 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Chk03 {
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
		protected void initUpSub() {
			editUp();
			initBpCache(up0());
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<ApDtl_Chk01_DtlR> chkList = getChkList(up0());
			msgL.addAll(chkBspplClDt(chkList));
			msgL.addAll(chkTrd());
			
			return msgL;
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (ApDtl_Chk01_DtlR r : up0()) {
				// chkBspplClDt で必要
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		/**
		 * 照合済残高受入を持つ取引の存在チェックを行う
		 */
		protected MCMessageList chkTrd() {
			MCMessageList msgL = new MCMessageList();
			
			MAM_TRD_R trdR = getTrdApSwInChk();
			if (isNull(trdR) || trdR.isEmpty()) {
				getChkList(up0()).forEach(r -> { 
					msgL.add(new MCMessage(r, null, MSBEL0252, MAC_TRD_PTN_TYP.APSW_IN_CHK.value(), toDispGUIIndex(r)));
				});
			}
			
			return msgL;
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	
	/**
	 * ApDtl_Upd03オペレーション.<p>
	 *
	 * 残高振替に伴う買掛明細を登録する。<br>
	 */
	public class ApDtl_Upd03 extends MSBHL_ApDtlRegService_MC_A.ApDtl_Upd03 {
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setApDNo();
			updApDFr();
			updApDTo();
			setDown();
		}
		
		/**
		 * 振替先の買掛明細ＮＯの発番を行う
		 */
		protected void setApDNo() {
			doSeqCache(MSC_NUM_SYS_TYP.APD, up0().size());
		}
		
		/**
		 * 振替元の買掛明細を更新する（未照合）
		 */
		protected void updApDFr() {
			MCList<ApDtl_Chk01_DtlR> swNotChkL = up0().subList(r -> !isSwChk(r));
			if (!swNotChkL.isEmpty()) {
				MST_AP_D_R dbc = MST_AP_D_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet("valid_flg", dbc.valid_flg, value(false));
				builder.addSet("sw_flg", dbc.sw_flg, value(true));
				dbUpdateKey("MSBHL5020_MST_AP_D_U04", swNotChkL, builder);
				
			}
		}
		
		/**
		 * 振替先の買掛明細を更新する（照合済／未照合）
		 */
		protected void updApDTo() {
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			
			apDL.addAll(makeSwInChk());
			apDL.addAll(makeSwInNotChk());
			
			dbInsertEx("MSBHL5020_MST_AP_D_I03", apDL, apDL_bldr);
		}

		/**
		 * 振替先の買掛明細を作成する（照合済）
		 */
		protected MCList<MST_AP_D_R> makeSwInChk() {
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			for (ApDtl_Chk01_DtlR r : up0().subList(r -> isSwChk(r))) {
				apDL.add(makeSwInChk(r));
			}
			return apDL;
		}
		protected MST_AP_D_R makeSwInChk(ApDtl_Chk01_DtlR r) {
			MST_AP_APPL_SCHD_R applR = MSBHL_ApSwBalService.getApApplSchdCache(r.ap_appl_schd_no());
			MST_PAY_SCHD_R psR = MSBHL_ApSwBalService.getPaySchdCache(applR.pay_schd_no());
			MST_PAY_CHK_R pcR = MSBHL_ApSwBalService.getPayChkCache(psR.pay_chk_mng_no());
			MST_AP_D_R apDR =
				MSBHL_ApSwBalService.getApDCacheByPaySchd(applR.pay_schd_no(), applR.purc_act_no(), applR.rcpt_iv_mng_no());
			MAM_TRD_R trdR = getTrdApSwInChk();

			MST_AP_D_R toR = MST_AP_D_R.create();
			toR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
			toR.purc_act_d_no(MAC_STR.NULL_VAL.value());
			toR.purc_act_d_seq(0);
			toR.purc_act_no(applR.purc_act_no());
			toR.purc_act_seq(0);
			toR.purc_act_rev(0);
			toR.rcpt_iv_no(applR.rcpt_iv_no());
			toR.rcpt_iv_mng_no(applR.rcpt_iv_mng_no());
			toR.ap_typ(psR.ap_typ());
			toR.trd_cd(trdR.trd_cd());
			toR.trd_ptn_typ(trdR.trd_ptn_typ());
			toR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			toR.sppl_cd(MAC_STR.NULL_VAL.value());
			toR.asppl_cd(r.asppl_cd());
			toR.bsppl_cd(r.bsppl_cd());
			toR.bsppl_dpt_cd(r.bsppl_dpt_cd());
			toR.ap_dpt_cd(r.ap_dpt_cd());
			toR.purc_dpt_cd(MAC_STR.NULL_VAL.value());
			toR.purc_usr_cd(MAC_STR.NULL_VAL.value());
			toR.wrk_no(r.wrk_no());	// 呼出元の残高振替サービスで編集済み
			toR.sno1(MAC_STR.NULL_VAL.value());
			toR.sno2(MAC_STR.NULL_VAL.value());
			toR.sno3(MAC_STR.NULL_VAL.value());
			toR.sno4(MAC_STR.NULL_VAL.value());
			toR.act_dt(r.act_dt());
			toR.ac_dt(r.ac_dt());
			toR.ac_ym(getAcYm(r.ac_dt()));
			toR.bsppl_cl_dt(getBspplClDt(r));
			toR.bsppl_cl_day(getBspplClDay(r));
			toR.pay_crryovr_times(r.pay_crryovr_times());
			toR.pay_basis_dt(r.pay_basis_dt());
			toR.pay_schd_dt(r.pay_schd_dt());
			toR.itm_cd(MAC_STR.NULL_VAL.value());
			toR.itm_sub1(MAC_STR.NULL_VAL.value());
			toR.itm_sub2(MAC_STR.NULL_VAL.value());
			toR.itm_sub3(MAC_STR.NULL_VAL.value());
			toR.sundry_itm_flg(false);
			toR.trd_unit_cd(MAC_STR.NULL_VAL.value());
			toR.trd_unit_qty(0);
			toR.base_unit_cd(MAC_STR.NULL_VAL.value());
			toR.base_unit_qty(0);
			toR.tax_cd(MAC_STR.NULL_VAL.value());
			toR.interim_flg(false);
			toR.xrate(r.xrate());
			toR.trd_cur_cd(apDR.trd_cur_cd());
			toR.trd_cur_upri(0);
			toR.trd_cur_amt(r.trd_cur_amt());
			toR.trd_cur_tax_amt(0);
			toR.base_cur_upri(0);
			toR.base_cur_amt(r.base_cur_amt());
			toR.base_cur_tax_amt(0);
			toR.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			toR.org_ap_d_no(toR.ap_d_no());
			toR.chk_flg(false);
			toR.crryovr_flg(false);
			toR.valid_flg(true);
			toR.sw_flg(false);
			toR.sw_src_ap_appl_schd_no(applR.ap_appl_schd_no());
			toR.sw_src_pay_chk_no(pcR.pay_chk_no());
			toR.sw_src_pay_chk_mng_no(psR.pay_chk_mng_no());
			toR.sw_src_pay_schd_no(psR.pay_schd_no());
			
			r.to_ap_d_no(toR.ap_d_no());
			
			return toR;
		}

		/**
		 * 振替先の買掛明細を作成する（未照合）
		 */
		protected MCList<MST_AP_D_R> makeSwInNotChk() {
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			for (ApDtl_Chk01_DtlR r : up0().subList(r -> !isSwChk(r))) {
				apDL.add(makeSwInNotChk(r));
			}
			return apDL;
		}
		protected MST_AP_D_R makeSwInNotChk(ApDtl_Chk01_DtlR r) {
			MST_AP_D_R apDR = MSBHL_ApSwBalService.getApDCache(r.ap_d_no());
			BiFunction<MCNumber, MCNumber, MCNumber> convToBCur = (amt, xrate) -> {
				return convToBaseCur(amt, xrate, getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			};
			
			MST_AP_D_R toR = MST_AP_D_R.create();
			MCRow.copyvalue(toR, apDR);
			toR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
			toR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			toR.asppl_cd(r.asppl_cd());
			toR.bsppl_cd(r.bsppl_cd());
			toR.bsppl_dpt_cd(r.bsppl_dpt_cd());
			toR.ap_dpt_cd(r.ap_dpt_cd());
			toR.wrk_no(r.wrk_no());	// 呼出元の残高振替サービスで編集済み
			toR.act_dt(r.act_dt());
			toR.ac_dt(r.ac_dt());
			toR.ac_ym(getAcYm(r.ac_dt()));
			toR.bsppl_cl_dt(getBspplClDt(r));
			toR.bsppl_cl_day(getBspplClDay(r));
			toR.pay_crryovr_times(r.pay_crryovr_times());
			toR.pay_basis_dt(r.pay_basis_dt());
			toR.pay_schd_dt(r.pay_schd_dt());
			toR.xrate(r.xrate());
			if (!isSame(r.xrate(), apDR.xrate())) {
				toR.base_cur_tax_amt(convToBCur.apply(toR.trd_cur_tax_amt(), r.xrate()));
				toR.base_cur_dscnt_amt(convToBCur.apply(toR.trd_cur_dscnt_amt(), r.xrate()));
			}
			// 支払時に算出された調整額を含む金額
			toR.base_cur_amt(r.base_cur_amt().subtract(toR.base_cur_tax_amt()));
			toR.org_ap_d_no(toR.ap_d_no());
			toR.crryovr_ap_d_no(null);
			toR.crryovr_src_ap_d_no(null);
			toR.pay_schd_d_print_rmrks(null);
			toR.intr_rmrks(null);
			toR.pay_chk_no(null);
			toR.pay_chk_mng_no(null);
			toR.chk_flg(false);
			toR.crryovr_flg(false);
			toR.valid_flg(true);
			toR.sub_char1(null);
			toR.sub_char2(null);
			toR.sub_char3(null);
			toR.sw_flg(false);
			toR.sw_src_ap_appl_schd_no(null);
			toR.sw_src_pay_chk_no(null);
			toR.sw_src_pay_chk_mng_no(null);
			toR.sw_src_pay_schd_no(null);
			toR.sw_src_ap_d_no(apDR.ap_d_no());
			if(toR.outsrc_flg() && !isSame(r.xrate(), apDR.xrate())) {
				
				MCList<MCRow> upriL = MSUCL_ConvQtyAmtUtil.calcPropOutSrcUpri(toR.base_cur_upri(), 
						getBaseCur().upri_dec_place(), toR.trd_cur_onr_prov_upri(), toR.trd_cur_proc_upri(), null);
				toR.base_cur_onr_prov_upri(upriL.get(0).getNumberNE("amt"));
				toR.base_cur_proc_upri(upriL.get(1).getNumberNE("amt"));
				
				MAM_TAX_R taxR = MSBHL_ApUtil.getTax(toR.tax_cd());
				if (toR.repurc_obli_flg() && taxR.inc_tax_flg()) {
					// 買戻義務がオン、かつ内税の場合、加工金額には金額から有償支給金額を差し引いた金額を設定する
					// ※単純に案分すると税調整額が有償支給金額に含まれてしまう可能性があるため
					toR.base_cur_onr_prov_amt(convToBCur.apply(toR.trd_cur_onr_prov_amt(), r.xrate()));
					toR.base_cur_proc_amt(
						toR.base_cur_amt().subtract(
							nvl(toR.base_cur_onr_prov_amt(), MCNumber.ZERO)
						)
					);
				}
				else {
					MCList<MCRow> amtL = MSUCL_ConvQtyAmtUtil.calcPropOutSrcUpri(toR.base_cur_amt(), 
							getBaseCur().amt_dec_place(), toR.trd_cur_onr_prov_upri(), toR.trd_cur_proc_upri(), toR.base_cur_dscnt_amt());
					toR.base_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
					toR.base_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
				}
			}
			
			r.to_ap_d_no(toR.ap_d_no());
			
			return toR;
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 残高振替の対象が、照合済か未照合を判定する
		 */
		protected boolean isSwChk(ApDtl_Chk01_DtlR r) {
			if (!isNull(r.ap_appl_schd_no())) {
				// 買掛消込予定ＮＯが設定されている場合は「照合済残高振替」とみなす
				return true;
			}
			return false;
		}
	}
	
	/**
	 * 照合済残高振替受入の取引マスタ
	 */
	protected MAM_TRD_R _apswInChkTrd;
	protected MAM_TRD_R getTrdApSwInChk() {
		if (object(CLAZZ)._apswInChkTrd == null) {
			MCList<MAM_TRD_R> dbc = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.APSW_IN_CHK.value())));
			dbc_bldr.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));
			dbc_bldr.setOrderByAsc(t.trd_cd);
			dbSelect("MSBHL5020_MAM_TRD_S01", dbc, dbc_bldr);
			
			if (dbc.isEmpty()) {
				object(CLAZZ)._apswInChkTrd = MAM_TRD_R.create();
			}
			else {
				object(CLAZZ)._apswInChkTrd = dbc.get(0);
			}
		}
		return object(CLAZZ)._apswInChkTrd;
	}

	//FMCB CUSTOM END
}