package mcframe.serverMSBI.MSBIL5010;

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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mcframe.serverMSBC.MSBCL6110.MSBCL_MfgInstActComService;
import mcframe.serverMSBG.MSBGL5100.MSBGL_ArDtlApplService;
import mcframe.serverMSBG.MSBGL5170.MSBGL_XrateRevService;
import mcframe.serverMSBH.MSBHL5120.MSBHL_ApXrateRevService;
import mcframe.serverMSBE.MSBEL5030.MSBEL_StkMngService;
import mcframe.serverMSBI.MSBIL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSBI.MSBIL5010.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import mcframe.serverMSBH.MSBHL5110.*;
import mcframe.serverMSBH.MSBHL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBIL_ClService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBIL_ClService_MC extends MSBIL_ClService_MC_A{
	//FMCB CUSTOM START
	
	// キャッシュ関連
	protected static final Class<MSBIL_ClService> CLAZZ = MSBIL_ClService.class;
	
	/** ユーザＩＤ */
	protected static final String USER_ID = "user_id";
	/** 計上年月 */
	protected static final String YM = "ym";
	
	/** 担当者権限マスタキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _usrAclCache = null;
	/** 締処理情報キャッシュ */
	protected FXUCL_MCDbcCache<MST_CLOSE_R> _clCache = null;
	protected MST_CLOSE_R _slsR = null;
	protected MST_CLOSE_R _rcvR = null;
	protected MST_CLOSE_R _purcR = null;
	protected MST_CLOSE_R _payR = null;
	protected MST_CLOSE_R _stkR = null;
	
	/** 売掛仮締情報キャッシュ */
	protected FXUCL_MCDbcCache<MST_AR_PRE_CLOSE_R> _arPreClCache = null;
	/** 買掛仮締情報キャッシュ */
	protected FXUCL_MCDbcCache<MST_AP_PRE_CLOSE_R> _apPreClCache = null;
	/** 棚卸制御管理キャッシュ（場所） */
	protected Map<String, MST_STKTK_R> _stktkLocCache = null;
	/** 棚卸制御管理キャッシュ（場所、品目） */
	protected Map<List<String>, MST_STKTK_R> _stktkLocItmCache = null;
	
	// -----------------------------------------------
	// キャッシュ初期化
	
	/**
	 * 担当者権限マスタのキャッシュの初期化
	 */
	protected static void initUsrAclCache(MCList<Cl_Chk03_CndR> dtlL) {	
		object(CLAZZ)._initUsrAclCache(dtlL);
	}	
	protected void _initUsrAclCache(MCList<Cl_Chk03_CndR> dtlL) {
		dtlL.addStringColumn(USER_ID, MCSys.user.ID());
		_usrAclCache = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(
				MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")), dtlL, USER_ID);
	}
	
	/**
	 * 締処理情報のキャッシュの初期化
	 * @param dtlL
	 */
	protected static void initClCache(MCList<Cl_Chk03_CndR> dtlL) {	
		object(CLAZZ)._initClCache(dtlL);
	}	

	protected void _initClCache(MCList<Cl_Chk03_CndR> dtlL) {
		// 最新の締年月
		crtSlsCache();
		crtRcvCache();
		crtPurcCache();
		crtPayCache();
		crtStkCache();

		// バインドリストの作成
		MCList<Cl_Chk03_CndR> cndL = crtBindList(dtlL);
		// 指定された年月の締処理情報
		_clCache = new FXUCL_MCDbcCache<MST_CLOSE_R>(
				MCQueryApiBuilder.create(MST_CLOSE_R.create("T")), cndL, YM);
	}
	
	protected void crtSlsCache(){
		if (null == _slsR) {
			_slsR = MST_CLOSE_R.create();
			executeQuery(_slsR, MSBIL5010_MST_CLOSE_S01());
		}
	}
	protected void crtRcvCache(){
		if (null == _rcvR) {
			_rcvR = MST_CLOSE_R.create();
			executeQuery(_rcvR, MSBIL5010_MST_CLOSE_S02());
		}
	}
	protected void crtPurcCache(){
		if (null == _purcR) {
			_purcR = MST_CLOSE_R.create();
			executeQuery(_purcR, MSBIL5010_MST_CLOSE_S03());
		}
	}
	protected void crtPayCache(){
		if (null == _payR) {
			_payR = MST_CLOSE_R.create();
			executeQuery(_payR, MSBIL5010_MST_CLOSE_S04());
		}
	}
	protected void crtStkCache(){
		if (null == _stkR) {
			_stkR = MST_CLOSE_R.create();
			executeQuery(_stkR, MSBIL5010_MST_CLOSE_S05());
		}
	}
	
	
	
	/**
	 * 売掛仮締情報キャッシュの初期化
	 * @param dtlL
	 */
	protected static void initArPreClCache(MCList<Cl_Chk03_CndR> dtlL) {	
		object(CLAZZ)._initArPreClCache(dtlL);
	}	
	protected void _initArPreClCache(MCList<Cl_Chk03_CndR> dtlL) {
		
		//  売上締、入金締チェックがtrueのデータから検索条件を作成
		MCList<Cl_Chk03_CndR> cndL = crtBindList(getArList(dtlL));
		
		if (!cndL.isEmpty()) {
			_arPreClCache = new FXUCL_MCDbcCache<MST_AR_PRE_CLOSE_R>(
					MCQueryApiBuilder.create(MST_AR_PRE_CLOSE_R.create("T")), cndL, YM,
					Cl_Chk03_CndR.$bp_cd);
		}
	}
	
	protected MCList<Cl_Chk03_CndR> getArList(MCList<Cl_Chk03_CndR> dtlL) {
		MCList<Cl_Chk03_CndR> retL = MCList.create(Cl_Chk03_CndR.class);
		for (Cl_Chk03_CndR r : dtlL) {
			if (r.sls_cls_chk_flg() || r.rcv_cls_chk_flg()) {
				retL.add(r);
			}
		}
		return retL;
	}
	
	/**
	 * 買掛仮締情報キャッシュの初期化
	 * @param dtlL
	 */
	protected static void initApPreClCache(MCList<Cl_Chk03_CndR> dtlL) {	
		object(CLAZZ)._initApPreClCache(dtlL);
	}
	protected void _initApPreClCache(MCList<Cl_Chk03_CndR> dtlL) {
		
		// 仕入締、支払締チェックがtrueのデータから検索条件を作成
		MCList<Cl_Chk03_CndR> cndL = crtBindList(getApList(dtlL));
		
		if (!cndL.isEmpty()) {
			_apPreClCache = new FXUCL_MCDbcCache<MST_AP_PRE_CLOSE_R>(
					MCQueryApiBuilder.create(MST_AP_PRE_CLOSE_R.create("T")), cndL, YM,
					Cl_Chk03_CndR.$bp_cd);
		}
	}
	
	protected MCList<Cl_Chk03_CndR> getApList(MCList<Cl_Chk03_CndR> dtlL) {
		MCList<Cl_Chk03_CndR> retL = MCList.create(Cl_Chk03_CndR.class);
		for (Cl_Chk03_CndR r : dtlL) {
			if (r.purc_cls_chk_flg() || r.pay_cls_chk_flg()) {
				retL.add(r);
			}
		}
		return retL;
	}

	/**
	 * キャッシュ作成用のバインドリストを作成する <br>
	 * 締処理、仮締情報の取得のために計上日、取消計上日を同じ一時カラムに設定する
	 */
	protected MCList<Cl_Chk03_CndR> crtBindList(MCList<Cl_Chk03_CndR> dtlL) {
		MCList<Cl_Chk03_CndR> cndL = dtlL.createInstance();
		cndL.addDateColumn(YM);
		for (Cl_Chk03_CndR r : dtlL) {
			// 計上日をもとにした計上年月を設定
			if (!isNull(r.ac_dt())) {
				Cl_Chk03_CndR cndR = r.clone();
				cndR.addDateColumn(YM, getAcYm(r.ac_dt()));
				cndL.add(cndR);
			}
			// 計上取消日をもとにした計上年月を設定
			if (!isNull(r.can_ac_dt())) {
				Cl_Chk03_CndR cndR = r.clone();
				cndR.addDateColumn(YM, getAcYm(r.can_ac_dt()));
				cndL.add(cndR);
			}
		}
		return cndL;
	}
	
	/**
	 * 棚卸制御管理キャッシュの初期化
	 * @param dtlL
	 */
	protected static void initStktkCache(MCList<Cl_Chk03_CndR> dtlL) {	
		object(CLAZZ)._initStktkCache(dtlL);
	}
	protected void _initStktkCache(MCList<Cl_Chk03_CndR> dtlL) {
		
		
		_stktkLocCache = new LinkedHashMap<String, MST_STKTK_R>();
		_stktkLocItmCache= new LinkedHashMap<List<String>, MST_STKTK_R>();
		// 入出庫制限チェック対象のみ
		MCList<Cl_Chk03_CndR> tgtL = dtlL.subList(new String[]{Cl_Chk03_CndR.$stk_cls_chk_flg, Cl_Chk03_CndR.$io_lmt_skip_flg},
				new Comparable[]{true, false});

		// 変更前の場所、品目もtgtLに追加
		MCList<Cl_Chk03_CndR> addL = MCList.create(Cl_Chk03_CndR.class);
		addAll(addL, tgtL, createMap_Cl_Chk03_CndR_Cl_Chk03_CndR());
		tgtL.addAll(addL);
		
		if (!tgtL.isEmpty()) {
			// 場所ＣＤのみで取得
			MCList<MST_STKTK_R> dbcLoc = MCList.create(MST_STKTK_R.class);
			String[] locCd = tgtL.groupBy(Cl_Chk03_CndR.$loc_cd).getString(Cl_Chk03_CndR.$loc_cd).toArray(new String[0]);
			MST_STKTK_R bindR = MST_STKTK_R.create();
			bindR.loc_cd(MCStringUtil.arrayValueJoin(locCd));
			executeQuery(dbcLoc, MSBIL5010_MST_STKTK_S01(), bindR);
			dbcLoc.forEach(dbcR -> {
				_stktkLocCache.put(dbcR.loc_cd(), dbcR);
			});
			
			//場所ＣＤ、品目で取得
			MCList<MST_STKTK_R> dbcLocItm = MCList.create(MST_STKTK_R.class);
			MCList<MST_STKTK_R> wkDbc = MCList.create(MST_STKTK_R.class);
			MCQueryApiBuilder wkDbc_bldr = MCQueryApiBuilder.create(MST_STKTK_R.create("T"));
			dbWkDelete("MSBIL5010_MSW_STKTK_D01", wkDbc_bldr.getBaseDbc());
			addAll(wkDbc, tgtL.subList(r-> !MAC_STR.isNULL_VAL(r.itm_cd())), createMap_MST_STKTK_R_Cl_Chk03_CndR());	
			dbWkInsert("MSBIL5010_MSW_STKTK_I01", wkDbc, wkDbc_bldr.getBaseDbc());
			executeQuery(dbcLocItm, MSBIL5010_MST_STKTK_S02(), bindR);
			dbcLocItm
					.forEach(dbcR -> {
						_stktkLocItmCache.put(
								Arrays.asList(dbcR.loc_cd(), dbcR.itm_cd(), dbcR.itm_sub1(), dbcR.itm_sub2(), dbcR.itm_sub3()), dbcR);
					});
			dbWkDelete("MSBIL5010_MSW_STKTK_D02", wkDbc_bldr.getBaseDbc());
		}
	}
	
	
	protected static MST_CLOSE_R getSlsClCache() {
		return object(CLAZZ)._slsR;
	}

	protected static MST_CLOSE_R getRcvClCache() {
		return object(CLAZZ)._rcvR;
	}

	protected static MST_CLOSE_R getPurcClCache() {
		return object(CLAZZ)._purcR;
	}

	protected static MST_CLOSE_R getPayClCache() {
		return object(CLAZZ)._payR;
	}

	protected static MST_CLOSE_R getStkClCache() {
		return object(CLAZZ)._stkR;
	}	
	
	protected static FXUCL_MCDbcCache<MST_CLOSE_R> getClCache() {
		return object(CLAZZ)._clCache;
	}
	
	protected static FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> getUsrAclCache() {
		return object(CLAZZ)._usrAclCache;
	}
	
	protected static FXUCL_MCDbcCache<MST_AR_PRE_CLOSE_R> getArPreClCache() {
		return object(CLAZZ)._arPreClCache;
	}
	
	protected static FXUCL_MCDbcCache<MST_AP_PRE_CLOSE_R> getApPreClCache() {
		return object(CLAZZ)._apPreClCache;
	}
	
	protected static MST_STKTK_R getStktkLocCache(String locCd) {
		Map<String, MST_STKTK_R> cache = object(CLAZZ)._stktkLocCache;
		return cache.get(locCd);
	}

	protected static MST_STKTK_R getStktkLocItmCache(List<String> key) {
		Map<List<String>, MST_STKTK_R> cache = object(CLAZZ)._stktkLocItmCache;
		return cache.get(key);
	}

	// -----------------------------------------------
	// オペレーション
	/**
	 * Cl_Chk01オペレーション.<p>
	 *
	 * 締処理前チェックを行う<br>
	 */
	public class Cl_Chk01 extends MSBIL_ClService_MC_A.Cl_Chk01 {
		
		/** 締処理情報過去データ */
		protected MCList<MST_CLOSE_R> _pastCl;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessagePool.addAll(checkCl());
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
		}
		
		protected MCMessageList checkCl() {
			MCMessageList msgL = new MCMessageList();
			
			// 仮締のチェック
			if (up0().pre_cl_flg()) {
				msgL.addAll(chkPreClose(up0()));
			}
			
			// 仮締解除のチェック
			if (up0().rel_pre_cl_flg()) {
				msgL.addAll(chkRelPreClose(up0()));
			}
			
			// 本締のチェック
			if (up0().cl_flg()) {
				msgL.addAll(chkClose(up0()));
			}
			
			// 本締解除のチェック
			if (up0().rel_cl_flg()) {
				msgL.addAll(chkRelClose(up0()));
			}
			return msgL;
		}
		
		/**
		 * 仮締のチェック処理
		 * @param notErrR
		 * @return
		 */
		protected MCMessageList chkPreClose(Cl_Chk01_HdrR notErrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCDate prv_mt = notErrR.ym().addMonth(-1).startOfMonth();
			MCDate cur_mt = notErrR.ym().startOfMonth();
			
			MST_CLOSE_R prvCls = getCloseInfo(prv_mt);
			MST_CLOSE_R curCls = getCloseInfo(cur_mt);
			
			// 売掛仮締
			if (notErrR.ar_pre_cl_flg()) {
				// check 前月未締の場合、エラー
				if (getCo().ar_no_use_flg()) {
					if (getCo().sls_cl_flg() && !prvCls.sls_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0003, toYMString(notErrR.ym())));
					}
				} else {
					if (!prvCls.sls_cl_flg() || !prvCls.rcv_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0001, toYMString(notErrR.ym())));
					}
				}
				
				// check 当月本締済の場合、エラー
				if (curCls.sls_cl_flg() || curCls.rcv_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0007, toYMString(notErrR.ym())));
				}

				crtSlsCache();
				crtRcvCache();
				if(!_slsR.isEmpty() && _slsR.ym().gte(notErrR.ym()) || !_rcvR.isEmpty() && _rcvR.ym().gte(notErrR.ym())){
					msgL.add(new MCMessage(MSBIL0070, toYMString(notErrR.ym()), toDispGUIIndex(notErrR)));
				}
			}
			// 買掛仮締
			if (notErrR.ap_pre_cl_flg()) {
				// check 前月未締の場合、エラー
				if (getCo().ap_no_use_flg()) {
					if (getCo().purc_cl_flg() && !prvCls.purc_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0075, toYMString(notErrR.ym())));
					}
				}
				else {
					if (!prvCls.purc_cl_flg() || !prvCls.pay_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0002, toYMString(notErrR.ym())));
					}
				}
				
				// check 当月本締済の場合、エラー
				if (getCo().ap_no_use_flg()) {
					if (getCo().purc_cl_flg() && curCls.purc_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0074, toYMString(notErrR.ym())));
					}
				}
				else {
					if (curCls.purc_cl_flg() || curCls.pay_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0008, toYMString(notErrR.ym())));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 仮締解除のチェック
		 * @param notErrR
		 * @return
		 */
		protected MCMessageList chkRelPreClose(Cl_Chk01_HdrR notErrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCDate nxt_mt = notErrR.ym().addMonth(1).startOfMonth();
			MCDate cur_mt = notErrR.ym().startOfMonth();
			
			MST_CLOSE_R curCls = getCloseInfo(cur_mt);
			MST_CLOSE_R nxtCls = getCloseInfo(nxt_mt);
			
			// 売掛仮締
			if (notErrR.ar_pre_cl_flg()) {
				// check 次月の売掛仮締済の場合、エラー
				if (nxtCls.ar_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0013, toYMString(notErrR.ym())));
				}
				crtSlsCache();
				crtRcvCache();
				if (!_slsR.isEmpty() && _slsR.ym().gte(notErrR.ym()) || !_rcvR.isEmpty() && _rcvR.ym().gte(notErrR.ym())) {
					msgL.add(new MCMessage(MSBIL0072, toYMString(notErrR.ym()), toDispGUIIndex(notErrR)));
				}
				// 売掛仮締情報の取得
				MCList<MST_AR_PRE_CLOSE_R> selectL = getArPreCloseL(cur_mt);
				
				// 全売掛先のチェック
				if (notErrR.all_acst_pre_cl_flg()) {
					// check 全売掛先仮締解除 当月仮締なしの場合
					if (selectL.isEmpty() && !curCls.all_acst_pre_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0019, toYMString(notErrR.ym())));
					}
				}
				// 任意売掛先のチェック
				else {
					// check 売掛先指定の仮締解除 当月仮締なしの場合
					MCIndexKey idxkey = selectL.createIndex(MST_AR_PRE_CLOSE_R.$acst_cd);
					for (Cl_Chk01_ArR r : up1()) {
						MST_AR_PRE_CLOSE_R selectR = selectL.getFirst(idxkey, r.acst_cd());
						if (isNull(selectR)) {
							msgL.add(new MCMessage(MSBIL0021, toYMString(notErrR.ym()), r.acst_cd()));
						}
					}
				}
			}
			
			
			// 買掛仮締
			if (notErrR.ap_pre_cl_flg()) {
				// check 次月の買掛仮締済の場合、エラー
				if (nxtCls.ap_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0014, toYMString(notErrR.ym())));
				}
				crtPurcCache();
				crtPayCache();
				if (!_purcR.isEmpty() && _purcR.ym().gte(notErrR.ym()) || !_payR.isEmpty() && _payR.ym().gte(notErrR.ym())) {
					msgL.add(new MCMessage(MSBIL0073, toYMString(notErrR.ym()), toDispGUIIndex(notErrR)));
				}
				// 買掛仮締情報の取得
				MCList<MST_AP_PRE_CLOSE_R> selectL = getApPreCloseL(cur_mt);
				
				// 全買掛先のチェック
				if (notErrR.all_asppl_pre_cl_flg()) {
					// check 全買掛先仮締解除 当月仮締なしの場合
					if (selectL.isEmpty() && !curCls.all_asppl_pre_cl_flg()) {
						msgL.add(new MCMessage(MSBIL0020, toYMString(notErrR.ym())));
					}
				}
				// 任意買掛先のチェック
				else {
					// check 買掛先指定の仮締解除 当月仮締なしの場合	
					MCIndexKey idxkey = selectL.createIndex(MST_AP_PRE_CLOSE_R.$asppl_cd);
					for (Cl_Chk01_ApR r : up2()) {
						MST_AP_PRE_CLOSE_R selectR = selectL.getFirst(idxkey, r.asppl_cd());
						if (isNull(selectR)) {
							msgL.add(new MCMessage(MSBIL0022, toYMString(notErrR.ym()), r.asppl_cd()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 本締のチェック
		 * @param notErrR
		 * @return
		 */
		protected MCMessageList chkClose(Cl_Chk01_HdrR notErrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCDate cur_mt = notErrR.ym().startOfMonth();
			MCDate prv_mt = notErrR.ym().addMonth(-1).startOfMonth();
			
			MST_CLOSE_R prvCls = getCloseInfo(prv_mt);
			MST_CLOSE_R curCls = getCloseInfo(cur_mt);
			
			// 売上締
			if (notErrR.sls_cl_flg()) {
				// check 前月売上未締の場合、エラー
				// ただし、前月以前に、売上締済のレコードが存在しない場合はチェックしない
				if (!prvCls.sls_cl_flg() && isPastSlsClExist(cur_mt)) {
					msgL.add(new MCMessage(MSBIL0003, toYMString(notErrR.ym())));
				}
				// check 当月本締済の場合、エラー
				if (curCls.sls_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0009, toYMString(notErrR.ym())));
				}
				
				// 固有check 売上実績明細に仮単価のデータがある場合エラー
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MSBIL5010_MST_SLS_ACT_S01(), notErrR);
				if (cntR.getNumberNE("cnt").intValue() > 0) {
					msgL.add(new MCMessage(MSBIL0027));
				}
				
			}
			
			// 入金締
			if (notErrR.rcv_cl_flg()) {
				// check 前月入金未締の場合、エラー
				// ただし、前月以前に、入金締済のレコードが存在しない場合はチェックしない
				if (!prvCls.rcv_cl_flg() && isPastRcvClExist(cur_mt)) {
					msgL.add(new MCMessage(MSBIL0004, toYMString(notErrR.ym())));
				}
				// check 当月本締済の場合、エラー
				if (curCls.rcv_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0010, toYMString(notErrR.ym())));
				}
				
				// 固有check 未消込残高が0より大きいデータがある場合、メッセージを表示
				MCList<MST_RCV_R> rcvL = getRcvLForRcv(cur_mt);
				if (rcvL.size() > 0) {
					MCMessagePool.add(new MCMessage(MSBIL0028));
				}
			}
			
			// 仕入締
			if (notErrR.purc_cl_flg()) {
				// check 前月仕入未締の場合、エラー
				// ただし、前月以前に、仕入締済のレコードが存在しない場合はチェックしない
				if (!prvCls.purc_cl_flg() && isPastPurcClExist(cur_mt)) {
					msgL.add(new MCMessage(MSBIL0005, toYMString(notErrR.ym())));
				}
				// check 当月本締済の場合、エラー
				if (curCls.purc_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0011, toYMString(notErrR.ym())));
				}
				
				// 固有check 仕入実績明細に仮単価のデータがある場合エラー
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MSBIL5010_MST_PURC_ACT_S01(), notErrR);
				if (cntR.getNumberNE("cnt").intValue() > 0) {
					msgL.add(new MCMessage(MSBIL0029));
				}
				
			}
			
			// 支払締
			if (notErrR.pay_cl_flg()) {
				// check 前月支払未締の場合、エラー
				// ただし、前月以前に、支払締済のレコードが存在しない場合はチェックしない
				if (!prvCls.pay_cl_flg() && isPastPayClExist(cur_mt)) {
					msgL.add(new MCMessage(MSBIL0006, toYMString(notErrR.ym())));
				}
				// check  当月本締済の場合、エラー
				if (curCls.pay_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0012, toYMString(notErrR.ym())));
				}
				
				// 固有check 未消込残高が0より大きいデータがある場合エラー
				MCList<MST_RCV_R> payL = getRcvLForPay(cur_mt);
				if (payL.size() > 0) {
					msgL.add(new MCMessage(MSBIL0030));
				}
				
			}
			
			// 在庫締
			if (notErrR.stk_cl_flg()) {
				// check 前月在庫未締の場合、エラー
				// ただし、前月以前に、在庫締済のレコードが存在しない場合はチェックしない
				if (!prvCls.stk_cl_flg() && isPastStkClExist(cur_mt)) {
					msgL.add(new MCMessage(MSBIL0031, toYMString(notErrR.ym())));
				}
				
				// check 当月在庫締済の場合、エラー
				if (curCls.stk_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0032, toYMString(notErrR.ym())));
				}
				
				MCDate clDt = getYmEndDt(notErrR.ym());
				MCRow bind = MCRow.create();
				bind.addDateColumn("cl_dt", clDt);

				MCList<MST_STKTK_R> ls = MCList.create(MST_STKTK_R.class);
				executeQuery(ls, MSBIL5010_MST_STKTK_S03(), bind);
				for (MST_STKTK_R r : ls) {
					msgL.add(new MCMessage(MSBIL0050, toYMDString(clDt), toYMDString(r.ctrl_tgt_dt()),
							r.loc_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()), r.stktk_sts_typ(),  toDispGUIIndex(r)));
				}
				
				msgL.addAll(chkStkMinus(notErrR));

			}

			return msgL;
		}
		
		
		protected MCMessageList chkStkMinus(Cl_Chk01_HdrR notErrR) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_MLY_STK_DTL_R> dbcL = MCList.create(MST_MLY_STK_DTL_R.class);
			MST_MLY_STK_DTL_R t = MST_MLY_STK_DTL_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setWhere(t.ac_ym.eq(bind("1")), notErrR.ym());
			dbcL_bldr.addWhereWithAnd(t.base_unit_qty.lt(value(0)));
			dbcL_bldr.addWhereWithAnd(t.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())));
			dbSelect("MSBIL5010_MST_MLY_STK_DTL_S01", dbcL, dbcL_bldr);
			for (MST_MLY_STK_DTL_R dbc : dbcL) {
				msgL.add(new MCMessage(notErrR, null, MSBIL0067, toYMString(dbc.ac_ym()), dbc.io_act_typ(),
						toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()), dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
						dbc.lot_no(), dbc.sublot_no(), toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()), dbc.fix_no_typ(), dbc.fix_no(),
						dbc.pack_unit_cd(), dbc.gd_cd(), dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(), dbc.stk_insp_typ(), dbc.stk_id_typ(),
						dbc.stk_bp_cd(), dbc.pack_unit_qty(), dbc.base_unit_qty(), toDispGUIIndex(notErrR)));
			}

			return msgL;
		}

		/**
		 * 本締解除のチェック
		 * @param notErrR
		 * @return
		 */
		protected MCMessageList chkRelClose(Cl_Chk01_HdrR notErrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCDate nxt_mt = up0().ym().addMonth(1).startOfMonth();
			MCDate cur_mt = up0().ym().startOfMonth();

			MST_CLOSE_R curCls = getCloseInfo(cur_mt);
			MST_CLOSE_R nxtCls = getCloseInfo(nxt_mt);
			
			// 売上締
			if (notErrR.sls_cl_flg()) {
				// check 次月の売掛仮締済の場合、エラー
				if (nxtCls.ar_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0059, toYMString(notErrR.ym())));
				}
				
				// check 次月の売上締が行われている場合はエラー
				if (nxtCls.sls_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0015, toYMString(notErrR.ym())));
				}
				
				// check 当月 未売上締の場合はエラー
				if (!curCls.sls_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0023, toYMString(notErrR.ym())));
				}
				
			}

			// 入金締
			if (notErrR.rcv_cl_flg()) {
				// check 次月の売掛仮締済の場合、エラー
				if (nxtCls.ar_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0060, toYMString(notErrR.ym())));
				}
				
				// check 次月の入金締が行われている場合はエラー
				if (nxtCls.rcv_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0016, toYMString(notErrR.ym())));
				}
				
				// check 当月 未入金締の場合はエラー
				if (!curCls.rcv_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0024, toYMString(notErrR.ym())));
				}
				
			}

			// 仕入締
			if (notErrR.purc_cl_flg()) {
				// check 次月の買掛仮締済の場合、エラー
				if (nxtCls.ap_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0061, toYMString(notErrR.ym())));
				}
				
				// check 次月の仕入締が行われている場合はエラー
				if (nxtCls.purc_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0017, toYMString(notErrR.ym())));
				}
				
				// check 当月 未仕入締の場合はエラー
				if (!curCls.purc_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0025, toYMString(notErrR.ym())));
				}
				
			}

			// 支払締
			if (notErrR.pay_cl_flg()) {
				// check 次月の買掛仮締済の場合、エラー
				if (nxtCls.ap_pre_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0062, toYMString(notErrR.ym())));
				}
				
				// check 次月の支払締が行われている場合はエラー
				if (nxtCls.pay_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0018, toYMString(notErrR.ym())));
				}
				
				// check 当月 未支払締の場合はエラー
				if (!curCls.pay_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0026, toYMString(notErrR.ym())));
				}
				
			}
			
			// 在庫締
			if (notErrR.stk_cl_flg()) {
				// check 次月在庫締済の場合エラー
				if (nxtCls.stk_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0033, toYMString(notErrR.ym())));
				}
				
				// check 当月在庫未締の場合エラー
				if (!curCls.stk_cl_flg()) {
					msgL.add(new MCMessage(MSBIL0034, toYMString(notErrR.ym())));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 指定年月の売掛仮締情報を取得します
		 * @param dt 該当年月
		 * @return
		 */
		protected MCList<MST_AR_PRE_CLOSE_R> getArPreCloseL(MCDate ym) {
			MCList<MST_AR_PRE_CLOSE_R> dbc = MCList.create(MST_AR_PRE_CLOSE_R.class);
			MST_AR_PRE_CLOSE_R t = MST_AR_PRE_CLOSE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.setWhere(t.ym.eq(bind("1")), ym);
			dbc_bldr.addWhereWithAnd(t.acst_cd.eq(bind("acst_cd")));
			dbSelect("MSBIL5010_MST_AR_PRE_CLOSE_S01", dbc, dbc_bldr, up1());
			return dbc;
		}
		
		/**
		 * 指定年月の買掛仮締情報を取得します
		 * @param ym 該当年月
		 * @return
		 */
		protected MCList<MST_AP_PRE_CLOSE_R> getApPreCloseL(MCDate ym) {
			MCList<MST_AP_PRE_CLOSE_R> dbc = MCList.create(MST_AP_PRE_CLOSE_R.class);
			MST_AP_PRE_CLOSE_R t = MST_AP_PRE_CLOSE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.setWhere(t.ym.eq(bind("1")), ym);
			dbc_bldr.addWhereWithAnd(t.asppl_cd.eq(bind("asppl_cd")));
			dbSelect("MSBIL5010_MST_AP_PRE_CLOSE_S01", dbc, dbc_bldr, up2());
			return dbc;
		}
		
		/**
		 * 入金情報を取得する（入金締）
		 * @param ym
		 * @return
		 */
		protected MCList<MST_RCV_R> getRcvLForRcv(MCDate ym) {
			MCList<MST_RCV_R> dbc = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.setWhere(t.dat_typ.in( bind("1"), bind("2")), MSC_RCV_DAT_TYP.RCV.value(), MSC_RCV_DAT_TYP.AP.value());
			dbc_bldr.addWhereWithAnd(t.not_proc_bal.neq(value(0)));
			dbc_bldr.addWhereWithAnd(t.rcv_dt.lte(bind("1")), getYmEndDt(ym));
			dbSelect("MSBIL5010_MST_RCV_S01", dbc, dbc_bldr);
			return dbc;
		}
		
		/**
		 * 入金情報を取得する（支払締）
		 * @param ym
		 * @return
		 */
		protected MCList<MST_RCV_R> getRcvLForPay(MCDate ym) {
			MCList<MST_RCV_R> dbc = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.setWhere(t.dat_typ.eq(bind("1")), MSC_RCV_DAT_TYP.AP.value());
			dbc_bldr.addWhereWithAnd(t.not_proc_bal.neq(value(0)));
			dbc_bldr.addWhereWithAnd(t.ac_dt.lte(bind("1")), getYmEndDt(ym));
			dbSelect("MSBIL5010_MST_RCV_S02", dbc, dbc_bldr);
			return dbc;
		}
		
	
		/**
		 * 対象月の前月以前に売上締済の締処理情報が存在する場合、trueを返す
		 * @param ym 対象月
		 * @return
		 */
		protected boolean isPastSlsClExist(MCDate ym) {
			MCList<MST_CLOSE_R> pastCl = getPastCl(ym);
			for (MST_CLOSE_R r : pastCl) {
				if (r.sls_cl_flg()) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 対象月の前月以前に入金締済の締処理情報が存在する場合、trueを返す
		 * @param ym 対象月
		 * @return
		 */
		protected boolean isPastRcvClExist(MCDate ym) {
			MCList<MST_CLOSE_R> pastCl = getPastCl(ym);
			for (MST_CLOSE_R r : pastCl) {
				if (r.rcv_cl_flg()) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 対象月の前月以前に仕入締済の締処理情報が存在する場合、trueを返す
		 * @param ym 対象月
		 * @return
		 */
		protected boolean isPastPurcClExist(MCDate ym) {
			MCList<MST_CLOSE_R> pastCl = getPastCl(ym);
			for (MST_CLOSE_R r : pastCl) {
				if (r.purc_cl_flg()) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 対象月の前月以前に支払締済の締処理情報が存在する場合、trueを返す
		 * @param ym 対象月
		 * @return
		 */
		protected boolean isPastPayClExist(MCDate ym) {
			MCList<MST_CLOSE_R> pastCl = getPastCl(ym);
			for (MST_CLOSE_R r : pastCl) {
				if (r.pay_cl_flg()) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 対象月の前月以前に在庫締済の締処理情報が存在する場合、trueを返す
		 * @param ym 対象月
		 * @return
		 */
		protected boolean isPastStkClExist(MCDate ym) {
			MCList<MST_CLOSE_R> pastCl = getPastCl(ym);
			for (MST_CLOSE_R r : pastCl) {
				if (r.stk_cl_flg()) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 対象月の前月以前の締処理情報を取得する
		 * @param ym 対象月
		 * @return 締処理情報
		 */
		protected MCList<MST_CLOSE_R> getPastCl(MCDate ym) {
			if (_pastCl == null) {
				_pastCl = MCList.create(MST_CLOSE_R.class);
				MST_CLOSE_R pastCl_t = MST_CLOSE_R.create("T");
				MCQueryApiBuilder pastCl_bldr = MCQueryApiBuilder.create(pastCl_t);
				MCDate prv_mt = ym.addMonth(-1).startOfMonth();
				pastCl_bldr.setSelect(pastCl_t.ym, pastCl_t.sls_cl_flg,
						pastCl_t.rcv_cl_flg, pastCl_t.purc_cl_flg, pastCl_t.pay_cl_flg,
						pastCl_t.stk_cl_flg);
				pastCl_bldr.setWhere(pastCl_t.ym.lte(bind("1")), prv_mt);
				dbSelect("MSBIL5010_MST_CLOSE_S01", _pastCl, pastCl_bldr);
			}
			return _pastCl;
		}
		
	}
	/**
	 * Cl_Chk03オペレーション.<p>
	 *
	 * 売上、入金、支払、仕入、在庫のどの締チェックを行うか指定して締日チェックを行う。<br>
	 */
	public class Cl_Chk03 extends MSBIL_ClService_MC_A.Cl_Chk03 {
		
		/** 計上日でチェックするモード */
		protected final String AC = "1";
		/** 取消計上日でチェックするモード */
		protected final String CAN = "2";
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理を実行
			MCMessagePool.addAll(checkClDt());
			// 下り電文を設定する
			setDown();
		}
		
		protected MCMessageList checkClDt() {
			MCMessageList msgL = new MCMessageList();
			
			// キャッシュの初期化
			initCache();			

			// チェック処理
			for (Cl_Chk03_CndR cndR : up0()) {
				MCMessageList tmpMsgL = new MCMessageList();
				
				// 計上日での締日チェック
				boolean updatable = isPreClUsr(cndR.ac_dt());
				if (!isNull(cndR.ac_dt())) {
					tmpMsgL.addAll(checkCl(cndR, AC, updatable));
				}

				if (tmpMsgL.size() > 0) {
					cndR.err_flg(true);
					msgL.addAll(tmpMsgL);
					continue;
				}

				// 取消計上日での締日チェック
				updatable = isPreClUsr(cndR.can_ac_dt());
				if (!isNull(cndR.can_ac_dt())) {
					tmpMsgL.addAll(checkCl(cndR, CAN, updatable));
				}
				
				if (tmpMsgL.size() > 0) {
					cndR.err_flg(true);
					msgL.addAll(tmpMsgL);
					continue;
				}
				
			}
			//メッセージ不要の場合はメッセージは返さない。その場合はエラーＦＬＧでエラーの有無を取得する。
			return up1().no_msg_flg() ? null : msgL;
		}
		
		/**
		 * キャッシュの初期化 <br>
		 * 処理で使用するデータをあらかじめ取得する
		 */
		protected void initCache() {
			initUsrAclCache(up0());
			initClCache(up0());
			initArPreClCache(up0());
			initApPreClCache(up0());
			initStktkCache(up0());
		}
		
		/**
		 * 締処理チェックを実行する
		 * @param cndR 上り電文
		 * @param mode 更新モード(訂正・取り消し or 登録)
		 * @param updatable 仮締訂正可能ＦＬＧ
		 * @return
		 */
		protected MCMessageList checkCl(Cl_Chk03_CndR cndR, String mode, boolean updatable) {
			MCMessageList msgL = new MCMessageList();
			
			// 売上締チェック
			msgL.addAll(checkSlsCl(cndR, mode, updatable));
			
			// 入金締チェック
			msgL.addAll(checkRcvCl(cndR, mode, updatable));
			
			// 仕入締チェック
			msgL.addAll(checkPurcCl(cndR, mode, updatable));
			
			// 支払締チェック
			msgL.addAll(checkPayCl(cndR, mode, updatable));
			
			// 在庫締チェック
			msgL.addAll(checkStkCl(cndR, mode));
			
			// 入出庫制限チェック
			if (!updatable) {
				msgL.addAll(checkIoCtrl(cndR, mode));
			}
			
			return msgL;
		}
		
		/**
		 * 売上締チェックを行う
		 * @return
		 */
		protected MCMessageList checkSlsCl(Cl_Chk03_CndR cndR, String mode, boolean updatable) {
			MCMessageList msgL = new MCMessageList();
			
			// 計上年月の算出
			MCDate clYm = getClYm(cndR, mode);
			if (isNull(clYm)) {
				return msgL;
			}
			// 計上年月の締処理情報の取得
			MST_CLOSE_R clR = getClCache().get(clYm);
			
			if (cndR.sls_cls_chk_flg()) {
				// 締済
				if (!getSlsClCache().isEmpty() && getSlsClCache().ym().gte(clYm)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$ac_dt, MSBIL0041, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$can_ac_dt, MSBIL0054, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
					}
				}
				// 仮締済
				else if (clR.ar_pre_cl_flg() && !updatable) {
					msgL.addAll(checkArPreCl(clR, cndR, mode));
				}
			}
			return msgL;
		}
		
		/**
		 * 入金締チェックを行う <br>
		 * 売上締チェックの後に行うことを前提としている
		 * @return
		 */
		protected MCMessageList checkRcvCl(Cl_Chk03_CndR cndR, String mode, boolean updatable) {
			MCMessageList msgL = new MCMessageList();
			
			// 計上年月の算出
			MCDate clYm = getClYm(cndR, mode);
			if (isNull(clYm)) {
				return msgL;
			}
			
			// 計上年月の締処理情報の取得
			MST_CLOSE_R clR = getClCache().get(clYm);
			
			if (cndR.rcv_cls_chk_flg()) {
				// 締済
				if (!getRcvClCache().isEmpty() && getRcvClCache().ym().gte(clYm)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$ac_dt, MSBIL0044, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$can_ac_dt, MSBIL0055, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
					}
				}
				// 仮締済
				else if (clR.ar_pre_cl_flg() && !updatable) {
					// 売上締で売掛仮締チェックをしていた場合、仮締チェックはしない
					if (!cndR.sls_cls_chk_flg() || !clR.ar_pre_cl_flg()) {
						msgL.addAll(checkArPreCl(clR, cndR, mode));
					}	
				}
			}
			return msgL;
		}
		
		/**
		 * 売掛先仮締チェックを行う <br>
		 * 全売掛先仮締済または対象取引先が仮締済の場合はエラーを返す
		 * @param clR 締処理情報
		 * @param cndR 上り電文
		 * @return エラーメッセージ
		 */
		protected MCMessageList checkArPreCl(MST_CLOSE_R clR, Cl_Chk03_CndR cndR, String mode) {
			MCMessageList msgL = new MCMessageList();
			
			// 全売掛先仮締済
			if (clR.all_acst_pre_cl_flg()) {
				if (isSame(mode, AC)) {
					msgL.add(new MCMessage(cndR, null, MSBIL0042, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
				}
				if (isSame(mode, CAN)) {
					msgL.add(new MCMessage(cndR, null, MSBIL0063, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
				}
			}
			// 一部売掛締
			else {
				// リストで渡された場合
				for (Cl_Chk03_CndBpR bpR : up2()) {
					String bpCd = isSame(mode, AC) ? bpR.bp_cd() : bpR.old_bp_cd();
					MST_AR_PRE_CLOSE_R arPreClR = getArPreClCache().get(clR.ym(), bpCd);
					if (!arPreClR.isEmpty()) {
						if (isSame(mode, AC)) {
							msgL.add(new MCMessage(cndR, null, MSBIL0043, toYMDString(cndR.ac_dt()), bpCd, toDispGUIIndex(cndR)));
						}
						if (isSame(mode, CAN)) {
							msgL.add(new MCMessage(cndR, null, MSBIL0064, toYMDString(cndR.can_ac_dt()), bpCd, toDispGUIIndex(cndR)));
						}
					}
				}
				// ヘッダで渡された場合
				String bpCd = isSame(mode, AC) ? cndR.bp_cd() : cndR.old_bp_cd();
				MST_AR_PRE_CLOSE_R arPreClR = getArPreClCache().get(clR.ym(), bpCd);
				if (!arPreClR.isEmpty()) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0043, toYMDString(cndR.ac_dt()), bpCd, toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0064, toYMDString(cndR.can_ac_dt()), bpCd, toDispGUIIndex(cndR)));
					}
				}
			}

			return msgL;
		}
		
		/**
		 * 仕入締チェックを行う
		 * @return
		 */
		protected MCMessageList checkPurcCl(Cl_Chk03_CndR cndR, String mode, boolean updatable) {
			MCMessageList msgL = new MCMessageList();
			
			// 計上年月の算出
			MCDate clYm = getClYm(cndR, mode);
			if (isNull(clYm)) {
				return msgL;
			}
			
			// 計上年月の締処理情報の取得
			MST_CLOSE_R clR = getClCache().get(clYm);
			
			if (cndR.purc_cls_chk_flg()) {
				// 締済
				if (!getPurcClCache().isEmpty() && getPurcClCache().ym().gte(clYm)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$ac_dt, MSBIL0045, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$can_ac_dt, MSBIL0056, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
					}
				}
				// 仮締済
				else if (clR.ap_pre_cl_flg() && !updatable) {
					msgL.addAll(checkApPreCl(clR, cndR, mode));
				}
			}
			return msgL;
		}
		
		/**
		 * 支払締チェックを行う <br>
		 * 仕入締チェックの後に行うことを前提としている
		 * @return
		 */
		protected MCMessageList checkPayCl(Cl_Chk03_CndR cndR, String mode, boolean updatable) {
			MCMessageList msgL = new MCMessageList();
			
			// 計上年月の算出
			MCDate clYm = getClYm(cndR, mode);
			if (isNull(clYm)) {
				return msgL;
			}
			
			// 計上年月の締処理情報の取得
			MST_CLOSE_R clR = getClCache().get(clYm);
			
			if (cndR.pay_cls_chk_flg()) {
				// 締済
				if (!getPayClCache().isEmpty() && getPayClCache().ym().gte(clYm)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$ac_dt, MSBIL0048, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$can_ac_dt, MSBIL0057, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
					}
				}
				// 仮締済
				else if (clR.ap_pre_cl_flg() && !updatable) {
					// 仕入締で買掛仮締チェックをしていた場合、仮締チェックはしない
					if (!cndR.purc_cls_chk_flg() || !clR.ap_pre_cl_flg()) {
						msgL.addAll(checkApPreCl(clR, cndR, mode));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 買掛先仮締チェックを行う <br>
		 * 全買掛先仮締済または対象取引先が仮締済の場合はエラーを返す
		 * @param clR 締処理情報
		 * @param cndR 上り電文
		 * @return エラーメッセージ
		 */
		protected MCMessageList checkApPreCl(MST_CLOSE_R clR, Cl_Chk03_CndR cndR, String mode) {
			MCMessageList msgL = new MCMessageList();
			
			// 全買掛先仮締済
			if (clR.all_asppl_pre_cl_flg()) {
				if (isSame(mode, AC)) {
					msgL.add(new MCMessage(cndR, null, MSBIL0046, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
				}
				if (isSame(mode, CAN)) {
					msgL.add(new MCMessage(cndR, null, MSBIL0065, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
				}
			}
			// 一部買掛締
			else {
				// リストで渡された場合
				for (Cl_Chk03_CndBpR bpR : up2()) {
					String bpCd = isSame(mode, AC) ? bpR.bp_cd() : bpR.old_bp_cd();
					MST_AP_PRE_CLOSE_R apPreClR = getApPreClCache().get(clR.ym(), bpCd);
					if (!apPreClR.isEmpty()) {
						if (isSame(mode, AC)) {
							msgL.add(new MCMessage(cndR, null, MSBIL0047, toYMDString(cndR.ac_dt()), bpCd, toDispGUIIndex(cndR)));
						}
						if (isSame(mode, CAN)) {
							msgL.add(new MCMessage(cndR, null, MSBIL0066, toYMDString(cndR.can_ac_dt()), bpCd, toDispGUIIndex(cndR)));
						}
					}
				}
				// ヘッダで渡された場合
				String bpCd = isSame(mode, AC) ? cndR.bp_cd() : cndR.old_bp_cd();
				MST_AP_PRE_CLOSE_R apPreClR = getApPreClCache().get(clR.ym(), bpCd);
				if (!apPreClR.isEmpty()) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0047, toYMDString(cndR.ac_dt()), bpCd, toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0066, toYMDString(cndR.can_ac_dt()), bpCd, toDispGUIIndex(cndR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 在庫締チェックを行う
		 * @return
		 */
		protected MCMessageList checkStkCl(Cl_Chk03_CndR cndR, String mode) {
			MCMessageList msgL = new MCMessageList();
			
			// 計上年月の算出
			MCDate clYm = getClYm(cndR, mode);
			if (isNull(clYm)) {
				return msgL;
			}
			
			if (cndR.stk_cls_chk_flg()) {
				if (!getStkClCache().isEmpty() && getStkClCache().ym().gte(clYm)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$ac_dt, MSBIL0049, toYMDString(cndR.ac_dt()), toDispGUIIndex(cndR)));
					}
					if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, Cl_Chk03_CndR.$can_ac_dt, MSBIL0058, toYMDString(cndR.can_ac_dt()), toDispGUIIndex(cndR)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 入出庫制限チェックを行う
		 * @param cndR
		 * @return
		 */
		protected MCMessageList checkIoCtrl(Cl_Chk03_CndR cndR, String mode) {

			MCMessageList msgL = new MCMessageList();
			MCDate dt;
			String itmCd;
			String itmSub1;
			String itmSub2;
			String itmSub3;
			String locCd;
			// 基準日の設定
			if (isSame(mode, AC)) {
				dt = cndR.ac_dt();
				itmCd = cndR.itm_cd();
				itmSub1 = cndR.itm_sub1();
				itmSub2 = cndR.itm_sub2();
				itmSub3 = cndR.itm_sub3();
				locCd = cndR.loc_cd();
			}
			else if (isSame(mode, CAN)) {
				dt = cndR.can_ac_dt();
				itmCd = cndR.old_itm_cd();
				itmSub1 = cndR.old_itm_sub1();
				itmSub2 = cndR.old_itm_sub2();
				itmSub3 = cndR.old_itm_sub3();
				locCd = cndR.old_loc_cd();
			}
			else {
				return msgL;
			}

			// チェック対象は在庫締チェックがオン、かつ入出庫制限不要ＦＬＧがオフのデータ
			if (cndR.stk_cls_chk_flg() && !cndR.io_lmt_skip_flg()) {
				//場所ＣＤでチェック
				MST_STKTK_R stkR = getStktkLocCache(locCd);
				if (!isNull(stkR) && stkR.ctrl_tgt_dt().gte(dt)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0068, locCd, toYMDString(dt), toDispGUIIndex(cndR)));
					}
					else if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0069, locCd, toYMDString(dt), toDispGUIIndex(cndR)));
					}
					cndR.err_flg(true);
					return msgL;
				}
				//場所ＣＤ、品目ＣＤ、枝番１～３でチェック
				MST_STKTK_R stkItmR = getStktkLocItmCache(Arrays.asList(locCd, itmCd, itmSub1, itmSub2, itmSub3));
				if (!isNull(stkItmR)) {
					if (isSame(mode, AC)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0040, locCd, toDispItm(itmCd, itmSub1, itmSub2, itmSub3), toYMDString(dt),
								toDispGUIIndex(cndR)));
					}
					else if (isSame(mode, CAN)) {
						msgL.add(new MCMessage(cndR, null, MSBIL0039, locCd, toDispItm(itmCd, itmSub1, itmSub2, itmSub3), toYMDString(dt),
								toDispGUIIndex(cndR)));
					}
					cndR.err_flg(true);
					return msgL;
				}

			}
			return msgL;
		}
		
		/**
		 * チェックモードをもとに計上年月を返す
		 * @param cndR
		 * @param mode チェックモード
		 * @return
		 */
		protected MCDate getClYm(Cl_Chk03_CndR cndR, String mode) {
			MCDate clYm = null;
			if (isSame(mode, AC)) {
				clYm = getAcYm(cndR.ac_dt());
			}
			else if (isSame(mode, CAN)) {
				clYm = getAcYm(cndR.can_ac_dt());
			}
			return clYm;
		}
		
		/**
		 * 担当者が仮締訂正可能ユーザの場合にtrueを返す
		 * @param dt 基準日
		 * @return
		 */
		protected boolean isPreClUsr(MCDate dt) {
			// キャッシュから担当者権限マスタを取得する
			MAM_USR_ACL_R dbc = getUsrAclCache().get(dt, MCSys.user.ID());
			if (!isNull(dbc)) {
				return dbc.pre_cl_usr_flg();
			}
			else {
				return false;
			}
			
		}
		
		protected void setDown() {
			down0().addAll(up0());
		}
		
	}
	/**
	 * Cl_Upd01オペレーション.<p>
	 *
	 * 締処理情報の更新を行う<br>
	 */
	public class Cl_Upd01 extends MSBIL_ClService_MC_A.Cl_Upd01 {
		
		protected MCDate _now;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			_now = MCDate.now();
			
			editUp();
			
			// A.仮締
			if (up0().pre_cl_flg()) {
				execPreCl();
			}
			// B.仮締解除
			if (up0().rel_pre_cl_flg()) {
				execRelPreCl();
			}
			// C.本締
			if (up0().cl_flg()) {
				execCl();
			}
			// D.本締解除
			if (up0().rel_cl_flg()) {
				execRelCl();
			}
			
			setDown();
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// 年月度の設定
			up1().setDateNE("ym", up0().ym());
			up2().setDateNE("ym", up0().ym());
			
			// 仮締実行日時の設定
			up1().setDateNE(Cl_Chk01_ArR.$pre_cl_tm, _now);
			up2().setDateNE(Cl_Chk01_ArR.$pre_cl_tm, _now);
		}
		
		/**
		 * 仮締処理
		 */
		protected void execPreCl() {
			// １．売掛仮締情報の登録
			if (up0().ar_pre_cl_flg()) {
				// 全売掛先ＦＬＧが「1」の場合、対象年月の売掛仮締情報を全削除
				if (up0().all_acst_pre_cl_flg()) {
					delAllArPreClose(up0().ym());
				}
				// 売掛仮締情報の登録
				else {
					MCList<MST_AR_PRE_CLOSE_R> dbc = MCList.create(MST_AR_PRE_CLOSE_R.class);
					setAll(dbc, up1(), up0(), createMap_MST_AR_PRE_CLOSE_R_Cl_Chk01_ArR());
					MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AR_PRE_CLOSE_R.create("T"));
					dbInsert("MSBIL5010_MST_AR_PRE_CLOSE_I01", dbc, dbc_bldr);
				}
			}
			
			// ２．買掛仮締情報の登録
			if (up0().ap_pre_cl_flg()) {
				// 全買掛先ＦＬＧが「1」の場合、対象年月の買掛仮締情報を全削除
				if (up0().all_asppl_pre_cl_flg()) {
					delAllApPreClose(up0().ym());
				}
				// 買掛仮締情報の登録
				else {
					MCList<MST_AP_PRE_CLOSE_R> dbc = MCList.create(MST_AP_PRE_CLOSE_R.class);
					setAll(dbc, up2(), up0(), createMap_MST_AP_PRE_CLOSE_R_Cl_Chk01_ApR());
					MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AP_PRE_CLOSE_R.create("T"));
					dbInsert("MSBIL5010_MST_AP_PRE_CLOSE_I01", dbc, dbc_bldr);
				}
			}
			
			// ３．締処理情報の登録
			MST_CLOSE_R closeR = MST_CLOSE_R.create("T");
			MCQueryApiBuilder closeR_bldr = MCQueryApiBuilder.create(closeR);
			int cnt = dbSelectKey("MSBIL5010_MST_CLOSE_S02", closeR, closeR_bldr, up0());
			if (cnt > 0) {
				MST_CLOSE_R upd = getPreCloseRUpd(closeR, up0());
				MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(MST_CLOSE_R.create("T"));
				dbUpdateKey("MSBIL5010_MST_CLOSE_U01", upd, upd_bldr);
			}
			else {
				MST_CLOSE_R ins = getPreCloseRIns(up0());
				MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_CLOSE_R.create("T"));
				dbInsert("MSBIL5010_MST_CLOSE_I01", ins, ins_bldr);
			}
		}
		
		protected MST_CLOSE_R getPreCloseRIns(mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR src) {
			MST_CLOSE_R dbc = MST_CLOSE_R.create();
			copy(dbc, src, createMap_MST_CLOSE_R_Cl_Chk01_HdrR());
			dbc.sls_cl_flg(false);
			dbc.rcv_cl_flg(false);
			dbc.purc_cl_flg(false);
			dbc.pay_cl_flg(false);
			dbc.stk_cl_flg(false);
			if (src.ar_pre_cl_flg() && src.all_acst_pre_cl_flg()) {
				dbc.ar_pre_cl_tm(_now);
				dbc.ar_pre_cl_usr_cd(MCSys.user.ID());
			}
			if (src.ap_pre_cl_flg() && src.all_asppl_pre_cl_flg()) {
				dbc.ap_pre_cl_tm(_now);
				dbc.ap_pre_cl_usr_cd(MCSys.user.ID());
			}
			return dbc;
		}
		
		protected MST_CLOSE_R getPreCloseRUpd(MST_CLOSE_R bf, mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR src) {
			
			MST_CLOSE_R dbc = MST_CLOSE_R.create();
			
			MCRow.copyvalue(dbc, bf);
			
			// 売掛先仮締
			if (src.ar_pre_cl_flg()) {
				dbc.ar_pre_cl_flg(src.ar_pre_cl_flg());
				dbc.all_acst_pre_cl_flg(src.all_acst_pre_cl_flg());
				// 全売掛先仮締
				if (src.all_acst_pre_cl_flg()) {
					if (!bf.ar_pre_cl_flg()) {
						dbc.ar_pre_cl_tm(_now);
						dbc.ar_pre_cl_usr_cd(MCSys.user.ID());
					}
					else if (bf.ar_pre_cl_flg() && !bf.all_acst_pre_cl_flg()) {
						dbc.ar_pre_cl_tm(_now);
						dbc.ar_pre_cl_usr_cd(MCSys.user.ID());
					}
				}
			}
			
			// 買掛先仮締
			if (src.ap_pre_cl_flg()) {
				dbc.ap_pre_cl_flg(src.ap_pre_cl_flg());
				dbc.all_asppl_pre_cl_flg(src.all_asppl_pre_cl_flg());
				// 全買掛先仮締
				if (src.all_asppl_pre_cl_flg()) {
					if (!bf.ap_pre_cl_flg()) {
						dbc.ap_pre_cl_tm(_now);
						dbc.ap_pre_cl_usr_cd(MCSys.user.ID());
					}
					else if (bf.ap_pre_cl_flg() && !bf.all_asppl_pre_cl_flg()) {
						dbc.ap_pre_cl_tm(_now);
						dbc.ap_pre_cl_usr_cd(MCSys.user.ID());
					}
				}
			}
			
			return dbc;
		}
		
		/**
		 * 仮締解除
		 */
		protected void execRelPreCl() {
			
			// １．売掛仮締情報の更新
			if (up0().ar_pre_cl_flg()) {
				// 売掛仮締情報をすべて削除
				if (up0().all_acst_pre_cl_flg()) {
					delAllArPreClose(up0().ym());
				}
				// 任意の売掛先を削除
				else {
					delAnyArPreClose();
				}
			}
			
			// ２．買掛仮締情報の更新
			if (up0().ap_pre_cl_flg()) {
				// 買掛仮締情報をすべて削除
				if (up0().all_asppl_pre_cl_flg()) {
					delAllApPreClose(up0().ym());
				}
				// 任意の買掛先を削除
				else {
					delAnyApPreClose();
				}
			}
			
			// ３．締処理情報の更新
			updPreClose();
			
		}
		
		/**
		 * 任意の売掛仮締情報を削除する
		 */
		protected void delAnyArPreClose() {
			// 年月度はeditUpで設定済
			MST_AR_PRE_CLOSE_R t = MST_AR_PRE_CLOSE_R.create("T");
			execDbDeleteKey("MSBIL5010_MST_AR_PRE_CLOSE_D01", t, up1());
		}
		/**
		 * 任意の買掛仮締情報を削除する
		 */
		protected void delAnyApPreClose() {
			// 年月度はeditUpで設定済
			MST_AP_PRE_CLOSE_R t = MST_AP_PRE_CLOSE_R.create("T");
			execDbDeleteKey("MSBIL5010_MST_AP_PRE_CLOSE_D01", t, up2());
		}
		/*
		 * 締処理情報の更新(仮締)
		 */
		protected void updPreClose() {
			MST_CLOSE_R upd = MST_CLOSE_R.create("T");
			MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(upd);
			
			// 締処理情報セット
			dbSelectKey("MSBIL5010_MST_CLOSE_S03", upd, upd_bldr, up0().ym());
			
			if (up0().ar_pre_cl_flg() && up0().all_acst_pre_cl_flg()) {
				upd.ar_pre_cl_flg(false);
				upd.ar_pre_cl_tm(null);
				upd.all_acst_pre_cl_flg(false);
				upd.ar_pre_cl_usr_cd(null);
			}
			if (up0().ap_pre_cl_flg() && up0().all_asppl_pre_cl_flg()) {
				upd.ap_pre_cl_flg(false);
				upd.ap_pre_cl_tm(null);
				upd.all_asppl_pre_cl_flg(false);
				upd.ap_pre_cl_usr_cd(null);
			}
			if (up0().ar_pre_cl_flg() && !up0().all_acst_pre_cl_flg()) {
				MCList<MST_AR_PRE_CLOSE_R> arL = MCList.create(MST_AR_PRE_CLOSE_R.class);
				MST_AR_PRE_CLOSE_R arL_t = MST_AR_PRE_CLOSE_R.create("T");
				MCQueryApiBuilder arL_bldr = MCQueryApiBuilder.create(arL_t);
				arL_bldr.setWhere(arL_t.ym.eq(bind("1")), up0().ym());
				if (dbSelect("MSBIL5010_MST_AR_PRE_CLOSE_S02", arL, arL_bldr) == 0) {
					upd.ar_pre_cl_flg(false);
				}
			}
			if (up0().ap_pre_cl_flg() && !up0().all_asppl_pre_cl_flg()) {
				MCList<MST_AP_PRE_CLOSE_R> apL = MCList.create(MST_AP_PRE_CLOSE_R.class);
				MST_AP_PRE_CLOSE_R apL_t = MST_AP_PRE_CLOSE_R.create("T");
				MCQueryApiBuilder apL_bldr = MCQueryApiBuilder.create(apL_t);
				apL_bldr.setWhere(apL_t.ym.eq(bind("1")), up0().ym());
				if (dbSelect("MSBIL5010_MST_AP_PRE_CLOSE_S02", apL, apL_bldr) == 0) {
					upd.ap_pre_cl_flg(false);
				}
			}
			
			// 締処理情報更新
			if (isNotClAll(upd)) {
				dbDeleteKey("MSBIL5010_MST_CLOSE_D01", upd, upd_bldr);
			}
			else {
				dbUpdateKey("MSBIL5010_MST_CLOSE_U02", upd, upd_bldr);
			}
			
		}
		
		/**
		 * 本締処理
		 */
		protected void execCl() {
			
			// 締処理対象データの確認
			MST_CLOSE_R oldR = getCloseInfo(up0().ym());
			// 更新用データの作成
			boolean update = false;
			MST_CLOSE_R newR = MST_CLOSE_R.create("T");
			if (oldR.isEmpty()) {
				newR = getCloseForIns(up0());
				update = false;
			}
			else {
				newR = getCloseForUpd(oldR, up0());
				update = true;
			}
			
			// 月次売掛金残高の繰越
			if (newR.sls_cl_flg() && newR.rcv_cl_flg() &&
					!(oldR.sls_cl_flg() && oldR.rcv_cl_flg())) {
				bringOverMlyArBal();
			}
			
			// 売掛明細消込サービス
			if (newR.sls_cl_flg() && newR.rcv_cl_flg() &&
					!(oldR.sls_cl_flg() && oldR.rcv_cl_flg())) {
				callArDtlApplUpd03Srv();
			}
			
			// 債権為替レート評価替サービス
			if (newR.sls_cl_flg() && newR.rcv_cl_flg()
					&& !(oldR.sls_cl_flg() && oldR.rcv_cl_flg()) && isTgtYm(up0().ym())) {
				callXrateRevIns01Srv();
			}
			
			// 買掛締処理の実行
			if (newR.purc_cl_flg() && newR.pay_cl_flg() &&
					!(oldR.purc_cl_flg() && oldR.pay_cl_flg())) {
				
				execApCl();
			}
			
			// 債務為替レート評価替サービス
			if (newR.purc_cl_flg() && newR.pay_cl_flg() &&
					!(oldR.purc_cl_flg() && oldR.pay_cl_flg()) && isTgtYm(up0().ym())) {
				callApXrateRevIns01Srv();
			}
			
			// 在庫繰り越し
			if (newR.stk_cl_flg() && !oldR.stk_cl_flg()) {
				callStkUpd02Srv();
			}
			
			// 有償支給残高の繰越
			if (newR.stk_cl_flg() && newR.pay_cl_flg() &&
					!(oldR.stk_cl_flg() && oldR.pay_cl_flg())) {
				insOnrProvBal();
			}
			// 製造指図・実績共通処理サービス
			if (up0().stk_cl_flg()) {
				callMfgInstActComUpd07Srv(up0(), true);
			}
			
			// 締処理情報の登録
			MCQueryApiBuilder newR_bldr = MCQueryApiBuilder.create(newR);
			if (update) {
				dbUpdateKey("MSBIL5010_MST_CLOSE_U03", newR, newR_bldr);
			}
			else {
				dbInsert("MSBIL5010_MST_CLOSE_I02", newR, newR_bldr);
			}
		}
		
		/**
		 * 処理対象月か判断
		 * @param ym
		 * @return 対象：true、対象外：false
		 */
		protected boolean isTgtYm(MCDate ym) {
			int iMonth = ym.getMonth();
			
			switch (iMonth) {
				case 1:
					if (getCo().mon01_xrate_rev_flg()) {
						return true;
					}
					break;
				case 2:
					if (getCo().mon02_xrate_rev_flg()) {
						return true;
					}
					break;
				case 3:
					if (getCo().mon03_xrate_rev_flg()) {
						return true;
					}
					break;
				case 4:
					if (getCo().mon04_xrate_rev_flg()) {
						return true;
					}
					break;
				case 5:
					if (getCo().mon05_xrate_rev_flg()) {
						return true;
					}
					break;
				case 6:
					if (getCo().mon06_xrate_rev_flg()) {
						return true;
					}
					break;
				case 7:
					if (getCo().mon07_xrate_rev_flg()) {
						return true;
					}
					break;
				case 8:
					if (getCo().mon08_xrate_rev_flg()) {
						return true;
					}
					break;
				case 9:
					if (getCo().mon09_xrate_rev_flg()) {
						return true;
					}
					break;
				case 10:
					if (getCo().mon10_xrate_rev_flg()) {
						return true;
					}
					break;
				case 11:
					if (getCo().mon11_xrate_rev_flg()) {
						return true;
					}
					break;
				case 12:
					if (getCo().mon12_xrate_rev_flg()) {
						return true;
					}
					break;
			}
			
			return false;
		}
		
		/**
		 * 月次売掛残高の繰り越し
		 */
		protected void bringOverMlyArBal() {
			executeUpdate(MSBIL5010_MST_MLY_AR_BAL_I01(), up0());
		}
		
		/**
		 * 売掛明細消込サービスの不要明細消込を呼出す
		 */
		protected void callArDtlApplUpd03Srv() {
			MSBGL_ArDtlApplService.ArDtlAppl_Upd03 ope = MSBGL_ArDtlApplService.crtArDtlAppl_Upd03();
			ope.exec();
		}
		
		/**
		 * 本締処理(新規登録)
		 */
		protected MST_CLOSE_R getCloseForIns(Cl_Chk01_HdrR src) {
			MST_CLOSE_R dbc = MST_CLOSE_R.create();
			dbc.ym(src.ym());
			dbc.sls_cl_flg(src.sls_cl_flg());
			dbc.rcv_cl_flg(src.rcv_cl_flg());
			dbc.purc_cl_flg(src.purc_cl_flg());
			dbc.pay_cl_flg(src.pay_cl_flg());
			dbc.stk_cl_flg(src.stk_cl_flg());
			if (src.sls_cl_flg()) {
				dbc.sls_cl_tm(_now);
				dbc.sls_cl_usr_cd(MCSys.user.ID());
			}
			if (src.rcv_cl_flg()) {
				dbc.rcv_cl_tm(_now);
				dbc.rcv_cl_usr_cd(MCSys.user.ID());
			}
			if (src.purc_cl_flg()) {
				dbc.purc_cl_tm(_now);
				dbc.purc_cl_usr_cd(MCSys.user.ID());
			}
			if (src.pay_cl_flg()) {
				dbc.pay_cl_tm(_now);
				dbc.pay_cl_usr_cd(MCSys.user.ID());
			}
			if (src.stk_cl_flg()) {
				dbc.stk_cl_tm(_now);
				dbc.stk_cl_usr_cd(MCSys.user.ID());
			}
			return dbc;
		}
		
		/**
		 * 本締処理(更新)
		 */
		protected MST_CLOSE_R getCloseForUpd(MST_CLOSE_R oldR, Cl_Chk01_HdrR src) {
			MST_CLOSE_R dbc = oldR.clone();
			if (!oldR.sls_cl_flg() && up0().sls_cl_flg()) {
				dbc.sls_cl_flg(true);
				dbc.sls_cl_tm(_now);
				dbc.sls_cl_usr_cd(MCSys.user.ID());
			}
			if (!oldR.rcv_cl_flg() && up0().rcv_cl_flg()) {
				dbc.rcv_cl_flg(true);
				dbc.rcv_cl_tm(_now);
				dbc.rcv_cl_usr_cd(MCSys.user.ID());
			}
			if (!oldR.purc_cl_flg() && up0().purc_cl_flg()) {
				dbc.purc_cl_flg(true);
				dbc.purc_cl_tm(_now);
				dbc.purc_cl_usr_cd(MCSys.user.ID());
			}
			if (!oldR.pay_cl_flg() && up0().pay_cl_flg()) {
				dbc.pay_cl_flg(true);
				dbc.pay_cl_tm(_now);
				dbc.pay_cl_usr_cd(MCSys.user.ID());
			}
			if (!oldR.stk_cl_flg() && up0().stk_cl_flg()) {
				dbc.stk_cl_flg(true);
				dbc.stk_cl_tm(_now);
				dbc.stk_cl_usr_cd(MCSys.user.ID());
			}
			return dbc;
		}
		
		/**
		 * 債権為替レート評価替サービスを呼出す
		 */
		protected void callXrateRevIns01Srv() {
			MSBGL_XrateRevService.XrateRev_Ins01 ope = MSBGL_XrateRevService.crtXrateRev_Ins01();
			ope.up0().tgt_ym(up0().ym());
			ope.exec();
		}

		protected void callApXrateRevIns01Srv() {
			MSBHL_ApXrateRevService.XrateRev_Ins01 ope = MSBHL_ApXrateRevService.crtXrateRev_Ins01();
			ope.up0().tgt_ym(up0().ym());
			ope.exec();
		}

		protected void callStkUpd02Srv() {
			MSBEL_StkMngService.Stk_Upd02 ope = MSBEL_StkMngService.crtStk_Upd02();
			ope.up0().ac_ym(up0().ym());
			ope.exec();
		}
		
		protected void execApCl() {
			MCList<MST_MLY_AP_BAL_R> mlyApBalL = callApBalSrch01Srv();

			if (!mlyApBalL.isEmpty()) {
				MCQueryApiBuilder mlyApBalL_bldr = MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T"));
				dbInsert("MSBIL5010_MST_MLY_AP_BAL_I01", mlyApBalL, mlyApBalL_bldr);
			}
		}

		protected MCList<MST_MLY_AP_BAL_R> callApBalSrch01Srv() {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();
			ope.up0().group_ap_dpt_flg(true);
			ope.up0().group_wg_flg(true);
			ope.up0().group_asppl_flg(true);
			ope.up0().group_purc_act_no_flg(true);
			ope.up0().group_rcpt_iv_no_flg(true);
			ope.up0().group_rcpt_iv_mng_no_flg(true);
			ope.up0().group_trd_cur_flg(true);
			ope.up0().group_wrk_no_flg(true);
			ope.up0().group_ap_typ_flg(true);
			ope.up0().ac_ym_fr(up0().ym());
			ope.up0().ac_ym_to(up0().ym());
			ope.up0().close_flg(true);
			ope.exec();
			MCList<MST_MLY_AP_BAL_R> retL = MCList.create(MST_MLY_AP_BAL_R.class);
			 addAll(retL, ope.down0(), createMap_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR());
			return retL;
		}
		
		protected Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<MST_MLY_AP_BAL_R,ApBal_Srch01_RsltR> createMap_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR() {
			return new Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<MST_MLY_AP_BAL_R, ApBal_Srch01_RsltR>();
		}

		public class Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<D extends MST_MLY_AP_BAL_R, S extends ApBal_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_AP_BAL_R.$ac_ym, ApBal_Srch01_RsltR.$ac_ym);
				addColumnPathMap(MST_MLY_AP_BAL_R.$asppl_cd, ApBal_Srch01_RsltR.$asppl_cd);
				addColumnPathMap(MST_MLY_AP_BAL_R.$ap_dpt_cd, ApBal_Srch01_RsltR.$ap_dpt_cd);
				addColumnPathMap(MST_MLY_AP_BAL_R.$trd_cur_cd, ApBal_Srch01_RsltR.$trd_cur_cd);
				addColumnPathMap(MST_MLY_AP_BAL_R.$purc_act_no, ApBal_Srch01_RsltR.$purc_act_no);
				addColumnPathMap(MST_MLY_AP_BAL_R.$ap_typ, ApBal_Srch01_RsltR.$ap_typ);
				addColumnPathMap(MST_MLY_AP_BAL_R.$init_bal, ApBal_Srch01_RsltR.$init_bal);
				addColumnPathMap(MST_MLY_AP_BAL_R.$purc_amt, ApBal_Srch01_RsltR.$purc_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$ret_amt, ApBal_Srch01_RsltR.$ret_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$dscnt_amt, ApBal_Srch01_RsltR.$dscnt_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$sw_to_amt, ApBal_Srch01_RsltR.$sw_to_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$tax_amt, ApBal_Srch01_RsltR.$tax_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$cash_amt, ApBal_Srch01_RsltR.$cash_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$note_amt, ApBal_Srch01_RsltR.$note_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$account_amt, ApBal_Srch01_RsltR.$account_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$setoff_amt, ApBal_Srch01_RsltR.$setoff_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$sw_amt, ApBal_Srch01_RsltR.$sw_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$end_bal, ApBal_Srch01_RsltR.$end_bal);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_cd, ApBal_Srch01_RsltR.$base_cur_cd);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_init_bal, ApBal_Srch01_RsltR.$base_cur_init_bal);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_purc_amt, ApBal_Srch01_RsltR.$base_cur_purc_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_ret_amt, ApBal_Srch01_RsltR.$base_cur_ret_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_dscnt_amt, ApBal_Srch01_RsltR.$base_cur_dscnt_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_sw_to_amt, ApBal_Srch01_RsltR.$base_cur_sw_to_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_tax_amt, ApBal_Srch01_RsltR.$base_cur_tax_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_cash_amt, ApBal_Srch01_RsltR.$base_cur_cash_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_note_amt, ApBal_Srch01_RsltR.$base_cur_note_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_account_amt, ApBal_Srch01_RsltR.$base_cur_account_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_setoff_amt, ApBal_Srch01_RsltR.$base_cur_setoff_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_sw_amt, ApBal_Srch01_RsltR.$base_cur_sw_amt);
				addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_end_bal, ApBal_Srch01_RsltR.$base_cur_end_bal);
				addColumnPathMap(MST_MLY_AP_BAL_R.$exc_gain_loss, ApBal_Srch01_RsltR.$exc_gain_loss);
				addColumnPathMap(MST_MLY_AP_BAL_R.$total_exc_gain_loss, ApBal_Srch01_RsltR.$total_exc_gain_loss);
				addColumnPathMap(MST_MLY_AP_BAL_R.$rcpt_iv_no, ApBal_Srch01_RsltR.$rcpt_iv_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.rcpt_iv_mng_no(nvl(src.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
				dest.wrk_no(nvl(src.wrk_no(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		/**
		 * 月次買掛残高を削除する
		 * 
		 * @param clR
		 * @param hdrR
		 */
		protected void delMlyApBal(MST_CLOSE_R clR, Cl_Chk01_HdrR hdrR) {
			if (clR.purc_cl_flg() && clR.pay_cl_flg()
					&& (hdrR.purc_cl_flg() || hdrR.pay_cl_flg())) {

				MST_MLY_AP_BAL_R t = MST_MLY_AP_BAL_R.create("T");
				execDbDelete("MSBIL5010_MST_MLY_AP_BAL_D01", t, t.ac_ym.eq(bind("1")), hdrR.ym());
			}
		}
		
		/**
		 * (締年月－１)月の有償支給残高を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_ONR_PROV_BAL_R> srchOnrProvBal() {
			MCList<MST_ONR_PROV_BAL_R> selL = MCList.create(MST_ONR_PROV_BAL_R.class);
			MST_ONR_PROV_BAL_R t = MST_ONR_PROV_BAL_R.create("T");
			MCQueryApiBuilder selL_bldr = MCQueryApiBuilder.create(t);
			selL_bldr.setWhere(t.ac_ym.eq(bind("1")), up0().ym().addMonth(-1));
			return selL;
		}
		
		protected MCList<ApSetoff_Srch04_DtlR> callApSetoffSrch04() {
			MSBHL_ApSetoffService.ApSetoff_Srch04 ope = MSBHL_ApSetoffService.crtApSetoff_Srch04();
			ope.up0().ac_ym_fr(up0().ym());
			ope.up0().ac_ym_to(up0().ym());
			ope.exec();
			
			return ope.down0();
		}

		/**
		 * 締年月の有償支給残高情報を登録する
		 */
		protected void insOnrProvBal() {
			MCList<MST_ONR_PROV_BAL_R> insL = MCList.create(MST_ONR_PROV_BAL_R.class);

			// 締済の有償支給残高情報を取得する
			MCList<MST_ONR_PROV_BAL_R> dbL = srchOnrProvBal();
			
			// 未締の有償支給残高情報を取得する
			MCList<ApSetoff_Srch04_DtlR> apSetoffL = callApSetoffSrch04();

			// 支給実績、支払実績に存在する情報から有償支給残高に登録する情報を作成する
			addAll(insL, apSetoffL, createMap_MST_ONR_PROV_BAL_R_ApSetoff_Srch04_DtlR());
			
			// 有償支給情報にのみ存在する情報は繰越データを作成する
			MCIndexKey idxkey = apSetoffL.createIndex(ApSetoff_Srch04_DtlR.$asppl_cd, ApSetoff_Srch04_DtlR.$ap_dpt_cd, ApSetoff_Srch04_DtlR.$trd_cur_cd);
			for (MST_ONR_PROV_BAL_R r : dbL) {
				if (!apSetoffL.contains(idxkey, r.asppl_cd(), r.ap_dpt_cd(), r.trd_cur_cd())) {
					MST_ONR_PROV_BAL_R nextR = MST_ONR_PROV_BAL_R.create();
					
					nextR.ac_ym(up0().ym());
					nextR.asppl_cd(r.asppl_cd());
					nextR.ap_dpt_cd(r.ap_dpt_cd());
					nextR.trd_cur_cd(r.trd_cur_cd());
					nextR.init_bal(r.end_bal());
					nextR.onr_prov_amt(MCNumber.ZERO);
					nextR.onr_prov_ret_amt(MCNumber.ZERO);
					nextR.setoff_amt(MCNumber.ZERO);
					nextR.tax_amt(MCNumber.ZERO);
					nextR.end_bal(nextR.init_bal());
					nextR.base_cur_cd(r.base_cur_cd());
					nextR.base_cur_init_bal(r.base_cur_end_bal());
					nextR.base_cur_onr_prov_amt(MCNumber.ZERO);
					nextR.base_cur_onr_prov_ret_amt(MCNumber.ZERO);
					nextR.base_cur_setoff_amt(MCNumber.ZERO);
					nextR.base_cur_tax_amt(MCNumber.ZERO);
					nextR.base_cur_end_bal(nextR.base_cur_init_bal());
					
					insL.add(nextR);
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_ONR_PROV_BAL_R.create("T"));
				dbInsertEx("MSBIL5010_MST_ONR_PROV_BAL_I01", insL, insL_bldr);
			}
		}
		
		/**
		 * 有償支給残高情報を削除する
		 * 
		 * @param clR
		 * @param hdrR
		 */
		protected void delOnrProvBal(MST_CLOSE_R clR, Cl_Chk01_HdrR hdrR) {
			if (clR.stk_cl_flg() && clR.pay_cl_flg()
					&& (hdrR.stk_cl_flg() || hdrR.pay_cl_flg())) {

				MST_ONR_PROV_BAL_R t = MST_ONR_PROV_BAL_R.create("T");
				execDbDelete("MSBIL5010_MST_ONR_PROV_BAL_D01", t, t.ac_ym.eq(bind("1")), hdrR.ym());
			}
		}
		
		protected Map_MST_ONR_PROV_BAL_R_ApSetoff_Srch04_DtlR<MST_ONR_PROV_BAL_R,ApSetoff_Srch04_DtlR> createMap_MST_ONR_PROV_BAL_R_ApSetoff_Srch04_DtlR() {
			return new Map_MST_ONR_PROV_BAL_R_ApSetoff_Srch04_DtlR<MST_ONR_PROV_BAL_R, ApSetoff_Srch04_DtlR>();
		}

		public class Map_MST_ONR_PROV_BAL_R_ApSetoff_Srch04_DtlR<D extends MST_ONR_PROV_BAL_R, S extends ApSetoff_Srch04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ONR_PROV_BAL_R.$asppl_cd, ApSetoff_Srch04_DtlR.$asppl_cd);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$ap_dpt_cd, ApSetoff_Srch04_DtlR.$ap_dpt_cd);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$ac_ym, ApSetoff_Srch04_DtlR.$ac_ym);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$trd_cur_cd, ApSetoff_Srch04_DtlR.$trd_cur_cd);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$init_bal, ApSetoff_Srch04_DtlR.$init_bal);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$onr_prov_amt, ApSetoff_Srch04_DtlR.$onr_prov_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$onr_prov_ret_amt, ApSetoff_Srch04_DtlR.$onr_prov_ret_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$setoff_amt, ApSetoff_Srch04_DtlR.$setoff_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$tax_amt, ApSetoff_Srch04_DtlR.$tax_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$end_bal, ApSetoff_Srch04_DtlR.$end_bal);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_cd, ApSetoff_Srch04_DtlR.$base_cur_cd);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_init_bal, ApSetoff_Srch04_DtlR.$base_cur_init_bal);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_onr_prov_amt, ApSetoff_Srch04_DtlR.$base_cur_onr_prov_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_onr_prov_ret_amt, ApSetoff_Srch04_DtlR.$base_cur_onr_prov_ret_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_setoff_amt, ApSetoff_Srch04_DtlR.$base_cur_setoff_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_tax_amt, ApSetoff_Srch04_DtlR.$base_cur_tax_amt);
				addColumnPathMap(MST_ONR_PROV_BAL_R.$base_cur_end_bal, ApSetoff_Srch04_DtlR.$base_cur_end_bal);

			}
		}
		/**
		 * 製造指図・実績共通サービスを呼出す
		 * @param up0 上り電文
		 * @param clFlg 締処理済FLG
		 */
		protected void callMfgInstActComUpd07Srv(Cl_Chk01_HdrR up0, boolean clFlg) {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd07 ope = 
					MSBCL_MfgInstActComService.crtMfgInstActCom_Upd07();
			ope.up0().ym(up0.ym());
			ope.up0().closing_flg(clFlg);
			ope.exec();
		}
		
		protected void execRelCl() {
			// 締処理情報を取得
			MST_CLOSE_R dbc = getCloseInfo(up0().ym());
			// 債務為替レート評価替サービス
			if (dbc.purc_cl_flg() && dbc.pay_cl_flg()
					&& (up0().purc_cl_flg() || up0().pay_cl_flg())) {
				callApXrateRevDel01Srv();
			}
			
			// 債権為替レート評価替サービス
			if (dbc.sls_cl_flg() && dbc.rcv_cl_flg() &&
					(up0().sls_cl_flg() || up0().rcv_cl_flg())) {
				callXrateRevDel01Srv();
			}
			
			// 製造指図・実績共通処理サービス
			if (up0().stk_cl_flg()) {
				callMfgInstActComUpd07Srv(up0(), false);
			}
			
			// 月次買掛残高
			delMlyApBal(dbc, up0());
			
			// 有償支給残高
			delOnrProvBal(dbc, up0());
			// 締処理情報の更新
			setRelCl(dbc, up0());
			
			// 締処理情報更新
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			if (isNotClAll(dbc)) {
				dbDeleteKey("MSBIL5010_MST_CLOSE_D02", dbc, dbc_bldr);
			}
			else {
				dbUpdateKey("MSBIL5010_MST_CLOSE_U04", dbc, dbc_bldr);
			}
		}
		
		protected void callXrateRevDel01Srv() {
			MSBGL_XrateRevService.XrateRev_Del01 ope = MSBGL_XrateRevService.crtXrateRev_Del01();
			ope.up0().tgt_ym(up0().ym());
			ope.exec();
		}
		
		protected void callApXrateRevDel01Srv() {
			MSBHL_ApXrateRevService.XrateRev_Del01 ope = MSBHL_ApXrateRevService.crtXrateRev_Del01();
			ope.up0().tgt_ym(up0().ym());
			ope.exec();
		}
		
		/**
		 * 本締解除用にＤＢコンテナを設定する
		 * @param dbc
		 */
		protected void setRelCl(MST_CLOSE_R dest, Cl_Chk01_HdrR src) {
			if (src.sls_cl_flg()) {
				dest.sls_cl_flg(false);
				dest.sls_cl_tm(null);
				dest.sls_cl_usr_cd(null);
			}
			if (src.rcv_cl_flg()) {
				dest.rcv_cl_flg(false);
				dest.rcv_cl_tm(null);
				dest.rcv_cl_usr_cd(null);
			}
			if (src.purc_cl_flg()) {
				dest.purc_cl_flg(false);
				dest.purc_cl_tm(null);
				dest.purc_cl_usr_cd(null);
			}
			if (src.pay_cl_flg()) {
				dest.pay_cl_flg(false);
				dest.pay_cl_tm(null);
				dest.pay_cl_usr_cd(null);
			}
			if (src.stk_cl_flg()) {
				dest.stk_cl_flg(false);
				dest.stk_cl_tm(null);
				dest.stk_cl_usr_cd(null);
			}
		}
		
		protected void setDown() {
			// 締処理情報を下り電文に設定する
			setDown0();
			down1().setAll(up1());
			down2().setAll(up2());
			
		}
	
		protected void setDown0(){
			
			executeQuery(down0(), MSBIL5010_MST_CLOSE_S06(), up0());
			executeQuery(down0(), MSBIL5010_MST_CLOSE_S07(), up0());
			executeQuery(down0(), MSBIL5010_MST_CLOSE_S08(), up0());
			executeQuery(down0(), MSBIL5010_MST_CLOSE_S09(), up0());
			executeQuery(down0(), MSBIL5010_MST_CLOSE_S10(), up0());
			if (up0().pre_cl_flg()) {
				if (up0().ar_pre_cl_flg()) {
					executeQuery(down0(), MSBIL5010_MST_CLOSE_S11(), up0());
				}
				if (up0().ap_pre_cl_flg()) {
					executeQuery(down0(), MSBIL5010_MST_CLOSE_S12(), up0());
				}

			}
			else if (up0().rel_pre_cl_flg()) {
				if (up0().ar_pre_cl_flg()) {
					down0().ar_pre_cl_usr_cd(null);
					down0().ar_pre_cl_tm(null);
					down0().ar_pre_cl_usr_nm(null);
				}
				if (up0().ap_pre_cl_flg()) {
					down0().ap_pre_cl_usr_cd(null);
					down0().ap_pre_cl_tm(null);
					down0().ap_pre_cl_usr_nm(null);
				}
			}
			
		}
		
		
		
	}
	/**
	 * Cl_Srch01オペレーション.<p>
	 *
	 * 本日締処理対象を取得する<br>
	 */
	public class Cl_Srch01 extends MSBIL_ClService_MC_A.Cl_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			// 売上締情報の設定
			setSlsClInfo();
			
			// 入金締情報の設定
			setRcvClInfo();
			
			// 仕入締情報の設定
			setPurcClInfo();
			
			// 支払締情報の設定
			setPayClInfo();
			
			// 在庫締情報の設定
			setStkClInfo();
			
		}
		
		/**
		 * 売上締情報を設定する
		 */
		protected void setSlsClInfo() {
			// 締処理ＦＬＧがオフの場合、締処理を行わない
			if (!getCo().sls_cl_flg()) {
				return;
			}
			
			// 締実行日に必要なパラメータの取得
			String calCd = nvl(getCo().sls_cl_cal_cd(), getCo().std_cal_cd());
			MCNumber delayDays = getCo().sls_cl_delay_days();
			String baTyp = getCo().sls_cl_ba_typ();
			
			// 締年月の取得
			MCDate clYm = getSlsClYm(calCd, delayDays, baTyp);
			// 締実行日の取得
			MCDate clDt = getProcDt(clYm, calCd, delayDays, baTyp);
			// 運用日が売上締実行日の場合、実行設定を行う
			if (isSame(getToday(), clDt)) {
				down0().sls_cl_flg(true);
				down0().sls_cl_ym(clYm);
			}
		}
		
		/**
		 * 売上締年月を取得する
		 * @return
		 */
		protected MCDate getSlsClYm(String calCd, MCNumber delayDays, String baTyp) {
			// 直近の締処理情報の取得
			MST_CLOSE_R selectR = MST_CLOSE_R.create();
			int cnt = executeQuery(selectR, MSBIL5010_MST_CLOSE_S01());
			
			// 締処理情報が存在する場合、締年月の次月を返す
			if (cnt > 0) {
				return selectR.ym().addMonth(1);
			}
			// 締処理情報が存在しない場合（稼働直後）、運用日をもとに算出
			return getClYm(getToday(), calCd, delayDays, baTyp);
		}
		
		/**
		 * 入金締情報を設定する
		 */
		protected void setRcvClInfo() {
			// 締処理ＦＬＧがオフの場合、締処理を行わない
			if (!getCo().rcv_cl_flg()) {
				return;
			}

			// 締実行日に必要なパラメータの取得
			String calCd = nvl(getCo().rcv_cl_cal_cd(), getCo().std_cal_cd());
			MCNumber delayDays = getCo().rcv_cl_delay_days();
			String baTyp = getCo().rcv_cl_ba_typ();

			// 締年月の取得
			MCDate clYm = getRcvClYm(calCd, delayDays, baTyp);
			// 締実行日の取得
			MCDate clDt = getProcDt(clYm, calCd, delayDays, baTyp);
			// 運用日が売上締実行日の場合、実行設定を行う
			if (isSame(getToday(), clDt)) {
				down0().rcv_cl_flg(true);
				down0().rcv_cl_ym(clYm);
			}
		}
		
		/**
		 * 入金締年月を取得する
		 * @return
		 */
		protected MCDate getRcvClYm(String calCd, MCNumber delayDays, String baTyp) {
			// 直近の締処理情報の取得
			MST_CLOSE_R selectR = MST_CLOSE_R.create();
			int cnt = executeQuery(selectR, MSBIL5010_MST_CLOSE_S02());
			
			// 締処理情報が存在する場合、締年月の次月を返す
			if (cnt > 0) {
				return selectR.ym().addMonth(1);
			}
			// 締処理情報が存在しない場合（稼働直後）、運用日をもとに算出
			return getClYm(getToday(), calCd, delayDays, baTyp);
		}
		
		/**
		 * 仕入締情報を設定する
		 */
		protected void setPurcClInfo() {
			// 締処理ＦＬＧがオフの場合、締処理を行わない
			if (!getCo().purc_cl_flg()) {
				return;
			}

			// 締実行日に必要なパラメータの取得
			String calCd = nvl(getCo().purc_cl_cal_cd(), getCo().std_cal_cd());
			MCNumber delayDays = getCo().purc_cl_delay_days();
			String baTyp = getCo().purc_cl_ba_typ();

			// 締年月の取得
			MCDate clYm = getPurcClYm(calCd, delayDays, baTyp);
			// 締実行日の取得
			MCDate clDt = getProcDt(clYm, calCd, delayDays, baTyp);
			// 運用日が売上締実行日の場合、実行設定を行う
			if (isSame(getToday(), clDt)) {
				down0().purc_cl_flg(true);
				down0().purc_cl_ym(clYm);
			}
		}
		
		/**
		 * 仕入締年月を取得する
		 * @return
		 */
		protected MCDate getPurcClYm(String calCd, MCNumber delayDays, String baTyp) {
			// 直近の締処理情報の取得
			MST_CLOSE_R selectR = MST_CLOSE_R.create();
			int cnt = executeQuery(selectR, MSBIL5010_MST_CLOSE_S03());
			
			// 締処理情報が存在する場合、締年月の次月を返す
			if (cnt > 0) {
				return selectR.ym().addMonth(1);
			}
			// 締処理情報が存在しない場合（稼働直後）、運用日をもとに算出
			return getClYm(getToday(), calCd, delayDays, baTyp);
		}
		
		/**
		 * 支払締情報を設定する
		 */
		protected void setPayClInfo() {
			// 締処理ＦＬＧがオフの場合、締処理を行わない
			if (!getCo().pay_cl_flg()) {
				return;
			}

			// 締実行日に必要なパラメータの取得
			String calCd = nvl(getCo().pay_cl_cal_cd(), getCo().std_cal_cd());
			MCNumber delayDays = getCo().pay_cl_delay_days();
			String baTyp = getCo().pay_cl_ba_typ();

			// 締年月の取得
			MCDate clYm = getPayClYm(calCd, delayDays, baTyp);
			// 締実行日の取得
			MCDate clDt = getProcDt(clYm, calCd, delayDays, baTyp);
			// 運用日が売上締実行日の場合、実行設定を行う
			if (isSame(getToday(), clDt)) {
				down0().pay_cl_flg(true);
				down0().pay_cl_ym(clYm);
			}
		}

		/**
		 * 支払締年月を取得する
		 * @return
		 */
		protected MCDate getPayClYm(String calCd, MCNumber delayDays, String baTyp) {
			// 直近の締処理情報の取得
			MST_CLOSE_R selectR = MST_CLOSE_R.create();
			int cnt = executeQuery(selectR, MSBIL5010_MST_CLOSE_S04());
			
			// 締処理情報が存在する場合、締年月の次月を返す
			if (cnt > 0) {
				return selectR.ym().addMonth(1);
			}
			// 締処理情報が存在しない場合（稼働直後）、運用日をもとに算出
			return getClYm(getToday(), calCd, delayDays, baTyp);
		}
		
		/**
		 * 在庫締情報を設定する
		 */
		protected void setStkClInfo() {
			// 締実行日に必要なパラメータの取得
			String calCd = nvl(getCo().stk_cl_cal_cd(), getCo().std_cal_cd());
			MCNumber delayDays = getCo().stk_cl_delay_days();
			String baTyp = getCo().stk_cl_ba_typ();

			// 締年月の取得
			MCDate clYm = getStkClYm(calCd, delayDays, baTyp);
			// 締実行日の取得
			MCDate clDt = getProcDt(clYm, calCd, delayDays, baTyp);
			// 運用日が売上締実行日の場合、実行設定を行う
			if (isSame(getToday(), clDt)) {
				down0().stk_cl_flg(true);
				down0().stk_cl_ym(clYm);
			}
		}

		/**
		 * 在庫締年月を取得する
		 * @return
		 */
		protected MCDate getStkClYm(String calCd, MCNumber delayDays, String baTyp) {
			// 直近の締処理情報の取得
			MST_CLOSE_R selectR = MST_CLOSE_R.create();
			int cnt = executeQuery(selectR, MSBIL5010_MST_CLOSE_S05());
			
			// 締処理情報が存在する場合、締年月の次月を返す
			if (cnt > 0) {
				return selectR.ym().addMonth(1);
			}
			// 締処理情報が存在しない場合（稼働直後）、運用日をもとに算出
			return getClYm(getToday(), calCd, delayDays, baTyp);
		}
		
		/**
		 * 対象日付に対する締処理年月を算出する
		 * @param ym 対象日付
		 * @param calCd
		 * @param delayDays
		 * @param baTyp
		 * @return
		 */
		protected MCDate getClYm(MCDate ym, String calCd, MCNumber delayDays, String baTyp) {
			ym = ym.startOfMonth();
			MCDate clDt = getProcDt(ym, calCd, delayDays, baTyp);
			if (getToday().lt(clDt)) {
				return getClYm(ym.addMonth(-1), calCd, delayDays, baTyp);
			}
			return ym;
		}
		
	}
	
	/**
	 * 指定年月の締処理情報を返します
	 * @param dt 該当年月
	 * @return
	 */
	protected MST_CLOSE_R getCloseInfo(MCDate ym) {
		
		MST_CLOSE_R dbc = MST_CLOSE_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
		dbSelectKey("MSBIL5010_MST_CLOSE_S04", dbc, dbc_bldr, ym);
		
		return dbc;
	}
	
	
	/**
	 * bindLとマスタをキーで比較し、bindLからマスタに存在しないデータを返す
	 * @param bindL
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected <R extends MCDBContainer, L extends MCList<R>> L getNotFindDbcL(L bindL) {
		
		L notFindL = (L) bindL.createInstance();
		
		L dbc = (L) bindL.createInstance();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc.createRow());
		dbSelectKey(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "S50"), dbc, dbc_bldr, bindL);
		MCJoinKey<L> jk = bindL.join(bindL.createRow().getKeyColumn(), dbc,
				dbc_bldr.getBaseDbc().getKeyColumn());
		for (R row : bindL) {
			R findR = row.getJoinedRow(jk);
			if (isNull(findR)) {
				notFindL.add(row);
			}
		}
		return notFindL;
	}
	
	/**
	 * 締、仮締がされていない場合にtrueを返します
	 * @param std
	 * @return
	 */
	protected boolean isNotClAll(MST_CLOSE_R std) {
		if (!std.sls_cl_flg() && !std.rcv_cl_flg() && !std.purc_cl_flg() && 
				!std.pay_cl_flg() && !std.stk_cl_flg() && !std.ar_pre_cl_flg() && !std.ap_pre_cl_flg()) {
			return true;
		}
		return false;
	}
	
	/**
	 * 締処理情報を年月度ソートしてロックします
	 */
	protected MCList<MST_CLOSE_R> lockClose() {
		MCList<MST_CLOSE_R> dbc = MCList.create(MST_CLOSE_R.class);
		MST_CLOSE_R t = MST_CLOSE_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.setOrderByAsc(t.ym);
		dbSelectForUpdateNoWait("MSBIL5010_MST_CLOSE_S05", dbc, dbc_bldr);
		return dbc;
	}
	
	/**
	 * 該当年月の売掛仮締情報をすべて削除する
	 * @param ym 対象年月
	 */
	protected void delAllArPreClose(MCDate ym) {
		MST_AR_PRE_CLOSE_R t = MST_AR_PRE_CLOSE_R.create("T");
		execDbDelete("MSBIL5010_MST_AR_PRE_CLOSE_D02", t, t.ym.eq(bind("1")), ym);
	}
	/**
	 * 該当年月の買掛仮締情報をすべて削除する
	 * @param ym 対象年月
	 */
	protected void delAllApPreClose(MCDate ym) {
		MST_AP_PRE_CLOSE_R t = MST_AP_PRE_CLOSE_R.create("T");
		execDbDelete("MSBIL5010_MST_AP_PRE_CLOSE_D02", t, t.ym.eq(bind("1")), ym);
	}
	
	/**
	 * カレンダ、遅延日数、前後区分からymに対する締処理日を取得する
	 * @param ym 年月(YM)
	 * @param calCd カレンダ
	 * @param delayDays 遅延日数
	 * @param baTyp 前後区分
	 * @return 締処理日
	 */
	protected MCDate getProcDt(MCDate ym, String calCd, MCNumber delayDays, String baTyp) {

		MCDate clDt = null;
		
		MCDate baseDt = getYmEndDt(ym.startOfMonth());

		//遅延日数に0が指定された場合、締日=締処理日となる。
		//締処理日が休日であれば、前後区分を参照し、直近の営業日を締処理日とする。
		if(delayDays.isZero()) {
			boolean isWrkday = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_DT$F_IS_WRKDAY", "01"),
					MAPA_DT$F_IS_WRKDAY(value(baseDt), value(calCd)));
			if(!isWrkday) {
				// 締日が休日の場合
				// 締前後区分が1なら前日以前で直近の営業日、2なら後日以降で直近の営業日を締処理日とする。
				
				if(MAC_BA_TYP.isBF(baTyp)){
					clDt = getCalDate(baseDt, delayDays, false, calCd, true);
				}
				else if(MAC_BA_TYP.isAF(baTyp)) {
					clDt = getCalDate(baseDt, delayDays, true, calCd, true);
				}
			}
			else {
				clDt = baseDt;
			}
		}
		//遅延日数に0以外が指定された場合、営業日ベースで指定日数後の日付を締処理日とする。
		else {
			MCRow cnd = MCRow.create();
			cnd.addDateColumn("base_dt", baseDt);
			cnd.addNumberColumn("lt", delayDays);
			cnd.addBooleanColumn("fwd_flg", true);
			cnd.addStringColumn("cal_cd", calCd);
			
			clDt = execFuncDate(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DATE_LT", "01"), MAPA_DT$F_CAL_DATE_LT(bind("base_dt"),
					bind("lt"), bind("fwd_flg"), bind("cal_cd")), cnd);
		}
		return clDt;
	}
	

	
	protected Map_MST_AR_PRE_CLOSE_R_Cl_Chk01_ArR<MST_AR_PRE_CLOSE_R,Cl_Chk01_ArR,Cl_Chk01_HdrR> createMap_MST_AR_PRE_CLOSE_R_Cl_Chk01_ArR() {
		return new Map_MST_AR_PRE_CLOSE_R_Cl_Chk01_ArR<MST_AR_PRE_CLOSE_R, Cl_Chk01_ArR,Cl_Chk01_HdrR>();
	}

	public class Map_MST_AR_PRE_CLOSE_R_Cl_Chk01_ArR<D extends MST_AR_PRE_CLOSE_R, S extends Cl_Chk01_ArR, W extends Cl_Chk01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _cl_Chk01_HdrR;
		@Override
		public void setWith(W _cl_Chk01_HdrR){
			this._cl_Chk01_HdrR = _cl_Chk01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_AR_PRE_CLOSE_R.$acst_cd, Cl_Chk01_ArR.$acst_cd);
			addColumnPathMap(MST_AR_PRE_CLOSE_R.$pre_cl_tm, Cl_Chk01_ArR.$pre_cl_tm);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ym(_cl_Chk01_HdrR.ym());
		}
	}
	
	protected Map_MST_AP_PRE_CLOSE_R_Cl_Chk01_ApR<MST_AP_PRE_CLOSE_R,Cl_Chk01_ApR,Cl_Chk01_HdrR> createMap_MST_AP_PRE_CLOSE_R_Cl_Chk01_ApR() {
		return new Map_MST_AP_PRE_CLOSE_R_Cl_Chk01_ApR<MST_AP_PRE_CLOSE_R, Cl_Chk01_ApR,Cl_Chk01_HdrR>();
	}

	public class Map_MST_AP_PRE_CLOSE_R_Cl_Chk01_ApR<D extends MST_AP_PRE_CLOSE_R, S extends Cl_Chk01_ApR, W extends Cl_Chk01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _cl_Chk01_HdrR;
		@Override
		public void setWith(W _cl_Chk01_HdrR){
			this._cl_Chk01_HdrR = _cl_Chk01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_AP_PRE_CLOSE_R.$asppl_cd, Cl_Chk01_ApR.$asppl_cd);
			addColumnPathMap(MST_AP_PRE_CLOSE_R.$pre_cl_tm, Cl_Chk01_ApR.$pre_cl_tm);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ym(_cl_Chk01_HdrR.ym());
		}
		
	}
	
	protected Map_MST_CLOSE_R_Cl_Chk01_HdrR<MST_CLOSE_R,Cl_Chk01_HdrR> createMap_MST_CLOSE_R_Cl_Chk01_HdrR() {
		return new Map_MST_CLOSE_R_Cl_Chk01_HdrR<MST_CLOSE_R, Cl_Chk01_HdrR>();
	}

	public class Map_MST_CLOSE_R_Cl_Chk01_HdrR<D extends MST_CLOSE_R, S extends Cl_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_CLOSE_R.$ym, Cl_Chk01_HdrR.$ym);
			addColumnPathMap(MST_CLOSE_R.$ar_pre_cl_flg, Cl_Chk01_HdrR.$ar_pre_cl_flg);
			addColumnPathMap(MST_CLOSE_R.$ap_pre_cl_flg, Cl_Chk01_HdrR.$ap_pre_cl_flg);
			addColumnPathMap(MST_CLOSE_R.$all_acst_pre_cl_flg, Cl_Chk01_HdrR.$all_acst_pre_cl_flg);
			addColumnPathMap(MST_CLOSE_R.$all_asppl_pre_cl_flg, Cl_Chk01_HdrR.$all_asppl_pre_cl_flg);

		}
	}
	
	protected Map_MST_AR_PRE_CLOSE_R_Cl_Chk03_CndR<MST_AR_PRE_CLOSE_R,Cl_Chk03_CndR> createMap_MST_AR_PRE_CLOSE_R_Cl_Chk03_CndR() {
		return new Map_MST_AR_PRE_CLOSE_R_Cl_Chk03_CndR<MST_AR_PRE_CLOSE_R, Cl_Chk03_CndR>();
	}

	public class Map_MST_AR_PRE_CLOSE_R_Cl_Chk03_CndR<D extends MST_AR_PRE_CLOSE_R, S extends Cl_Chk03_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_AR_PRE_CLOSE_R.$acst_cd, Cl_Chk03_CndR.$bp_cd);
		}
	}
	
	protected Map_MST_AP_PRE_CLOSE_R_Cl_Chk03_CndR<MST_AP_PRE_CLOSE_R,Cl_Chk03_CndR> createMap_MST_AP_PRE_CLOSE_R_Cl_Chk03_CndR() {
		return new Map_MST_AP_PRE_CLOSE_R_Cl_Chk03_CndR<MST_AP_PRE_CLOSE_R, Cl_Chk03_CndR>();
	}

	public class Map_MST_AP_PRE_CLOSE_R_Cl_Chk03_CndR<D extends MST_AP_PRE_CLOSE_R, S extends Cl_Chk03_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_AP_PRE_CLOSE_R.$asppl_cd, Cl_Chk03_CndR.$bp_cd);
		}
	}
	protected Map_MST_STKTK_R_Cl_Chk03_CndR<MST_STKTK_R,Cl_Chk03_CndR> createMap_MST_STKTK_R_Cl_Chk03_CndR() {
		return new Map_MST_STKTK_R_Cl_Chk03_CndR<MST_STKTK_R, Cl_Chk03_CndR>();
	}

	public class Map_MST_STKTK_R_Cl_Chk03_CndR<D extends MST_STKTK_R, S extends Cl_Chk03_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STKTK_R.$loc_cd, Cl_Chk03_CndR.$loc_cd);
			addColumnPathMap(MST_STKTK_R.$ctrl_tgt_dt, Cl_Chk03_CndR.$ac_dt);
			addColumnPathMap(MST_STKTK_R.$itm_cd, Cl_Chk03_CndR.$itm_cd);
			addColumnPathMap(MST_STKTK_R.$itm_sub1, Cl_Chk03_CndR.$itm_sub1);
			addColumnPathMap(MST_STKTK_R.$itm_sub2, Cl_Chk03_CndR.$itm_sub2);
			addColumnPathMap(MST_STKTK_R.$itm_sub3, Cl_Chk03_CndR.$itm_sub3);

		}
	}

	protected Map_Cl_Chk03_CndR_Cl_Chk03_CndR<Cl_Chk03_CndR,Cl_Chk03_CndR> createMap_Cl_Chk03_CndR_Cl_Chk03_CndR() {
		return new Map_Cl_Chk03_CndR_Cl_Chk03_CndR<Cl_Chk03_CndR, Cl_Chk03_CndR>();
	}

	public class Map_Cl_Chk03_CndR_Cl_Chk03_CndR<D extends Cl_Chk03_CndR, S extends Cl_Chk03_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, Cl_Chk03_CndR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, Cl_Chk03_CndR.$can_ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$bp_cd, Cl_Chk03_CndR.$old_bp_cd);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, Cl_Chk03_CndR.$old_loc_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, Cl_Chk03_CndR.$old_itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, Cl_Chk03_CndR.$old_itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, Cl_Chk03_CndR.$old_itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, Cl_Chk03_CndR.$old_itm_sub3);
			addColumnPathMap(Cl_Chk03_CndR.$err_flg, Cl_Chk03_CndR.$err_flg);

		}
	}

	//FMCB CUSTOM END
}