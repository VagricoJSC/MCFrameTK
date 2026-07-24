package mcframe.serverMSBE.MSBEL5740;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5740.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5740.Query.*;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBE.MSBEL5700.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5050.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBC.MSBCL6130.*;
import mcframe.serverMSUC.MSUCL0020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSUC.MSUCL0130.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_RcptIvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_RcptIvRegService_MC extends MSBEL_RcptIvRegService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBEL_RcptIvRegService> CLAZZ = MSBEL_RcptIvRegService.class;
	
	/** 更新前の受領インボイス明細を保持 */
	protected MCList<RcptIv_Chk01_DtlR> _bfrDtlL = null;
	/** 更新前の受領インボイスマップを保持 */
	protected MCList<RcptIv_Chk01_MapR> _bfrMapL = null;
	
	/** 受領インボイス登録サービス実行用・上り電文キャッシュ(ヘッダ) */
	protected MCList<RcptIv_Chk01_HdrR> _hdrCache = null;
	/** 受領インボイス登録サービス実行用・上り電文キャッシュ(明細) */
	protected MCList<RcptIv_Chk01_DtlR> _dtlCache = null;
	/** 受領インボイス登録サービス実行用・上り電文キャッシュ(受領インボイスマップ) */
	protected MCList<RcptIv_Chk01_MapR> _mapCache = null;
	
	/** 電文キャッシュ(ヘッダ)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxHdrCache = null;
	/** 電文キャッシュ(明細)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxDtlCache = null;
	/** 電文キャッシュ(受領インボイスマップ)を紐付NOで検索する為のインデックス */
	protected MCIndexKey _keyIdxMapCache = null;
	
	/**
	 * 上り電文(ヘッダ)をキャッシュする
	 * @param hdrL 上り電文(ヘッダ)
	 */
	protected static void initHdrCache(MCList<RcptIv_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initHdrCache(hdrL);
	}
	protected void _initHdrCache(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_hdrCache = MCList.create(RcptIv_Chk01_HdrR.class);
		_hdrCache.addAll(hdrL);
		_keyIdxHdrCache = _hdrCache.createIndex(RcptIv_Chk01_HdrR.$peg_no);
	}
	
	/**
	 * ヘッダ上り電文キャッシュを取得する
	 * @param hdrPegNo ヘッダ紐付NO
	 * @return ヘッダ上り電文キャッシュ
	 */
	protected static RcptIv_Chk01_HdrR getHdrCache(MCNumber hdrPegNo) {
		return object(CLAZZ)._getHdrCache(hdrPegNo);
	}
	protected RcptIv_Chk01_HdrR _getHdrCache(MCNumber hdrPegNo) {
		return _hdrCache.getFirst(_keyIdxHdrCache, hdrPegNo);
	}
	
	/**
	 * 上り電文(明細)をキャッシュする
	 * @param dtlL 上り電文(明細)
	 */
	protected static void initDtlCache(MCList<RcptIv_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initDtlCache(dtlL);
	}
	protected void _initDtlCache(MCList<RcptIv_Chk01_DtlR> dtlL) {
		_dtlCache = MCList.create(RcptIv_Chk01_DtlR.class);
		_dtlCache.addAll(dtlL);
		_keyIdxDtlCache = _dtlCache.createIndex(RcptIv_Chk01_DtlR.$peg_no);
	}
	
	/**
	 * 明細上り電文キャッシュを取得する
	 * @param dtlPegNo 明細紐付NO
	 * @return 明細上り電文キャッシュ
	 */
	protected static RcptIv_Chk01_DtlR getDtlCache(MCNumber dtlPegNo) {
		return object(CLAZZ)._getDtlCache(dtlPegNo);
	}
	protected RcptIv_Chk01_DtlR _getDtlCache(MCNumber dtlPegNo) {
		return _dtlCache.getFirst(_keyIdxDtlCache, dtlPegNo);
	}
	
	/**
	 * 上り電文(受領インボイスマップ)をキャッシュする
	 * @param dtlL 上り電文(受領インボイスマップ)
	 */
	protected static void initMapCache(MCList<RcptIv_Chk01_MapR> mapL) {
		object(CLAZZ)._initMapCache(mapL);
	}
	protected void _initMapCache(MCList<RcptIv_Chk01_MapR> mapL) {
		_mapCache = MCList.create(RcptIv_Chk01_MapR.class);
		_mapCache.addAll(mapL);
		_keyIdxMapCache = _mapCache.createIndex(RcptIv_Chk01_MapR.$peg_no);
	}
	
	/**
	 * 受領インボイスマップ上り電文キャッシュを取得する
	 * @param pegNo 紐付NO
	 * @return 受領インボイスマップ上り電文キャッシュ
	 */
	protected static RcptIv_Chk01_MapR getMapCache(MCNumber pegNo) {
		return object(CLAZZ)._getMapCache(pegNo);
	}
	protected RcptIv_Chk01_MapR _getMapCache(MCNumber pegNo) {
		return _mapCache.getFirst(_keyIdxMapCache, pegNo);
	}
	
	// 取引先のキャッシュ（発注先）
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	protected void initDbcCacheBp(MCList<RcptIv_Chk01_HdrR> hdrL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
		
		bp_bldr.setSelect(t.prnt_lcl_cd);
		bp_bldr.addSelect(t.repurc_obli_flg);
		bp_bldr.addSelect(t.outsrc_upri_typ);
		bp_bldr.addSelect(t.rcpt_iv_dup_flg);
		bp_bldr.addSelect(t.purc_tax_calc_typ);
		bp_bldr.addSelect(t.purc_tax_rnd_typ);
		
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bp_bldr, hdrL, RcptIv_Chk01_DtlR.$sppl_cd);
	}
	
	// 品目のキャッシュ
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
	protected void initDbcCacheItm(MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, dtlL,
				RcptIv_Chk01_DtlR.$itm_cd, RcptIv_Chk01_DtlR.$itm_sub1,
				RcptIv_Chk01_DtlR.$itm_sub2, RcptIv_Chk01_DtlR.$itm_sub3);
	}
	
	// 受領インボイスのキャッシュ（受領インボイス管理ＮＯをキーにして検索）
	protected FXUCL_MCDbcCache<MST_RCPT_IV_R> _cacheRcptIv;
	protected static void initDbcCacheRcptIv(MCList<RcptIv_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initDbcCacheRcptIv(hdrL);
	}
	protected void _initDbcCacheRcptIv(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_cacheRcptIv = new FXUCL_MCDbcCache<MST_RCPT_IV_R>(
				MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T")), hdrL,
				MST_RCPT_IV_R.$rcpt_iv_mng_no);
	}
	protected static FXUCL_MCDbcCache<MST_RCPT_IV_R> getCacheRcptIv() {
		return object(CLAZZ)._cacheRcptIv;
	}
	
	// 受領インボイスのキャッシュ（受領インボイスＮＯをキーにして検索）
	protected MCList<MST_RCPT_IV_R> _cacheRcptIvByRcptIvNo;
	protected MCIndexKey _cacheRcptIvByRcptIvNoIndex = null;
	protected static void initDbcCacheRcptIvByRcptIvNo(MCList<RcptIv_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initDbcCacheRcptIvByRcptIvNo(hdrL);
	}
	protected void _initDbcCacheRcptIvByRcptIvNo(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_cacheRcptIvByRcptIvNo = MCList.create(MST_RCPT_IV_R.class);
		MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.addWhereWithAnd(t.rcpt_iv_no.eq(bind("rcpt_iv_no")));
		dbSelect("MSBEL5740_MST_RCPT_IV_S01", _cacheRcptIvByRcptIvNo, dbcL_bldr, hdrL);
		_cacheRcptIvByRcptIvNoIndex = _cacheRcptIvByRcptIvNo.createIndex("rcpt_iv_no");
	}
	protected static MCList<MST_RCPT_IV_R> getCacheRcptIvByRcptIvNo(String rcptIvNo) {
		return object(CLAZZ)._getCacheRcptIvByRcptIvNo(rcptIvNo);
	}
	protected MCList<MST_RCPT_IV_R> _getCacheRcptIvByRcptIvNo(String rcptIvNo) {
		return _cacheRcptIvByRcptIvNo.subList(_cacheRcptIvByRcptIvNoIndex, rcptIvNo);
	}
	
	// インボイスのキャッシュ（受領インボイス管理ＮＯをキーにして本登録済のインボイスを検索）
	protected MCList<MST_IV_R> _cacheIv;
	protected MCIndexKey _cacheIvIndex = null;
	protected static void initDbcCacheIv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_HdrR> bindL = hdrL.shallowClone();
		srchArrSchd(dtlL).forEach(r -> {
			if (!isNull(r.rcpt_iv_mng_no())) {
				RcptIv_Chk01_HdrR bindR = bindL.add();
				bindR.rcpt_iv_mng_no(r.rcpt_iv_mng_no());
			}
		});
		object(CLAZZ)._initDbcCacheIv(bindL.groupBy(RcptIv_Chk01_HdrR.$rcpt_iv_mng_no));
	}
	protected void _initDbcCacheIv(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_cacheIv = MCList.create(MST_IV_R.class);
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.addWhereWithAnd(t.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
		dbcL_bldr.addWhereWithAnd(t.pre_rcpt_iv_flg.eq(value(false)));
		dbSelect("MSBEL5740_MST_RCPT_IV_S01", _cacheIv, dbcL_bldr, hdrL);
		_cacheIvIndex = _cacheIv.createIndex("rcpt_iv_mng_no");
	}
	protected static MCList<MST_IV_R> getCacheIv(String rcptIvMngNo) {
		return object(CLAZZ)._getCacheIv(rcptIvMngNo);
	}
	protected MCList<MST_IV_R> _getCacheIv(String rcptIvMngNo) {
		return _cacheIv.subList(_cacheIvIndex, rcptIvMngNo);
	}
	// 通貨のキャッシュ
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;
	protected void initDbcCacheCur(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(
				MCQueryApiBuilder.create(MAM_CUR_R.create("T")), hdrL,
				RcptIv_Chk01_HdrR.$trd_cur_cd);
	}
	
	/**
	 * RcptIv_Chk01オペレーション.<p>
	 *
	 * 更新前のチェック処理を行う。<br>
	 */
	public class RcptIv_Chk01 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callExIvChkSrv();
				
				callPurcSchdChkSrv();
				
				callArrSchdChkSrv(up0(), up1(), up2(), false);
				
				callAprvChk();
			}
			setParamCache();
			
			setDown();
		}
		
		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogic(MCNumber paramIndex, MCList<E> chkTarL) {
			MCList<RcptIv_Chk01_HdrR> notHdrTgtL = MCList.create(RcptIv_Chk01_HdrR.class);
			MCList<RcptIv_Chk01_DtlR> notDtlTgtL = MCList.create(RcptIv_Chk01_DtlR.class);
			
			// 操作種別が「削除する」の場合、リストロジックチェックは行わない
			for (MCConstRow chkRow : chkTarL) {
				if (chkRow instanceof RcptIv_Chk01_HdrR) {
					RcptIv_Chk01_HdrR hdrR = (RcptIv_Chk01_HdrR) chkRow;
					if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
						notHdrTgtL.add(hdrR);
					}
				}
				else if (chkRow instanceof RcptIv_Chk01_DtlR) {
					RcptIv_Chk01_DtlR dtlR = (RcptIv_Chk01_DtlR) chkRow;
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						notDtlTgtL.add(dtlR);
					}
				}
			}
			
			// チェック対象から除外する
			if (!notHdrTgtL.isEmpty()) {
				for (RcptIv_Chk01_HdrR notHdrTgtR : notHdrTgtL) {
					chkTarL.remove(notHdrTgtR);
				}
			}
			if (!notDtlTgtL.isEmpty()) {
				for (RcptIv_Chk01_DtlR notHdrTgtR : notDtlTgtL) {
					chkTarL.remove(notHdrTgtR);
				}
			}
			if (isNull(chkTarL)) {
				return new MCMessageList();
			}
			
			return super.doSvrChkListLogic(paramIndex, chkTarL);
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				MCDate baseDt = hdrR.fix_flg() ? hdrR.ac_dt() :  hdrR.iv_dt();
				// 購買部門からリストロジックでＷＧを取得するために設定
				hdrR.base_dt(baseDt);
				
				// 購買担当者
				ListLogicBind purcUsrBind = getListLogicBind(up1(), RcptIv_Chk01_DtlR.$purc_usr_cd);
				purcUsrBind.putBind(MAUAC_List.UsrCols.$i_dt, hdrR, RcptIv_Chk01_HdrR.$base_dt);
				
				// 購買部門、債務部門、負担部門
				for (String col : new String[]{RcptIv_Chk01_DtlR.$purc_dpt_cd, RcptIv_Chk01_DtlR.$ap_dpt_cd, RcptIv_Chk01_DtlR.$bd_dpt_cd}) {
					ListLogicBind bind = getListLogicBind(up1(), col);
					bind.putBind(MAUAC_List.DptCols.$i_dt, hdrR, RcptIv_Chk01_HdrR.$base_dt);
				}
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			initDbcCache();
			
			editUp();
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			MSBDL_PurcUtil.getDataForExistChk(up1());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			
			if (!msgList.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgList;
			}
			
			setDefValAfterDoServerChk();
			
			msgList.addAll(checkPorts());
			
			setBaseUnitQty();
			
			// 共通チェック
			msgList.addAll(checkSub());
			
			// 703の受領インボイス登録画面は単価や金額を訂正できるようになるため、サービスで計算しない
			
			return msgList;
		}
		
		/**
		 * キャッシュを設定する
		 */
		protected void initDbcCache() {
			initDbcCacheBp(up0());
			initDbcCacheItm(up1());
			initDbcCacheRcptIv(up0());
			initDbcCacheRcptIvByRcptIvNo(up0());
			srchArrSchd(up1());
			initDbcCacheIv(up0(), up1());
		}
		
		/**
		 * 上り電文を補完する
		 */
		protected void editUp() {
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				
				MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
				
				// 計画外の補完
				if (isUplnd(hdrR)) {
					setInToLoc(hdrR);
					for (RcptIv_Chk01_DtlR dtlR : dtlL) {
						dtlR.manual_add_flg(true);
					}
					continue;
				}
				
				// 補完項目取得
				MCList<RcptIv_Chk01_DtlR> down = MCList.create(RcptIv_Chk01_DtlR.class);
				MCQueryPlan sql = MSBEL5740_MST_PURC_SCHD_S01();
				// 受領インボイス作成元区分：入荷予定
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
					sql.addDynamicSQLInfo(MSBEL5740_MST_PURC_SCHD_S01_WHERE01());
				}
				// 受領インボイス作成元区分：入荷実績
				else if (MSC_RCPT_IV_SRC_TYP.isARR_ACT(hdrR.rcpt_iv_src_typ())) {
					sql.addDynamicSQLInfo(MSBEL5740_MST_PURC_SCHD_S01_WHERE02());
				}
				executeQuery(down, sql, dtlL);
				
				// 削除用補完項目取得
				MCQueryApiBuilder rcptIvD_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_D_R.create("T"));
				FXUCL_MCDbcCache<MST_RCPT_IV_D_R> cacheRcptIvD = new FXUCL_MCDbcCache<MST_RCPT_IV_D_R>(rcptIvD_bldr, up1(), RcptIv_Chk01_DtlR.$rcpt_iv_d_no);
				
				// ヘッダの補完
				if (!down.isEmpty()) {
					// downが空（明細なし or 諸掛のみ）は後続のチェック処理で止まるのでここでは何もしない
					copyValue(hdrR, down.get(0), createMap_RcptIv_Chk01_HdrR_RcptIv_Chk01_DtlR());
				}
				
				// 明細の補完
				MCIndexKey psIdx = down.createIndex(RcptIv_Chk01_DtlR.$purc_schd_no);
				for (RcptIv_Chk01_DtlR dtlR : dtlL) {
					// 仕入諸掛分はnullになるので補完対象外
					RcptIv_Chk01_DtlR src = down.getFirst(psIdx, dtlR.purc_schd_no());
					dtlR.manual_add_flg(isNull(src));
					
					if (!dtlR.manual_add_flg()) {
						copyValue(dtlR, src, createMap_RcptIv_Chk01_DtlR_RcptIv_Chk01_DtlR());
					}
					else {
						MAM_ITM_R itmR = _cacheItm.get(
								dtlR.itm_cd(), dtlR.itm_sub1(),
								dtlR.itm_sub2(), dtlR.itm_sub3());
						dtlR.stk_mng_typ(itmR.stk_mng_typ());
						dtlR.asset_mng_typ(itmR.asset_mng_typ());
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							dtlR.ivd(cacheRcptIvD.get(dtlR.rcpt_iv_d_no()));
						}
					}
				}
			}
			
			setXrate();
			
			setDefVal();
		}
		
		/**
		 * 納入場所情報を補完 
		 */
		protected void setInToLoc(RcptIv_Chk01_HdrR hdrR) {
			MAM_LOC_R locR = MAM_LOC_R.create("T");
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			
			locL_bldr.setSelect(t.loc_nm, t.cntry_cd);
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.ZIP_CD.value()), nullValue()).as(MAM_LOC_R.$zip_cd));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.ADDR1.value()), nullValue()).as(MAM_LOC_R.$addr1));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.ADDR2.value()), nullValue()).as(MAM_LOC_R.$addr2));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.ADDR3.value()), nullValue()).as(MAM_LOC_R.$addr3));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.ADDR4.value()), nullValue()).as(MAM_LOC_R.$addr4));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.TEL.value()), nullValue()).as(MAM_LOC_R.$tel));
			locL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, value(hdrR.purc_dt()), value(MAC_BP_ADDR_TYP.FAX.value()), nullValue()).as(MAM_LOC_R.$fax));
			locL_bldr.setWhere(t.loc_cd.eq(bind("1")), hdrR.in_to_id_cd());
			dbSelect("MSBEL5740_MAM_LOC_S01", locR, locL_bldr);
			
			hdrR.in_to_id_typ(MSC_IN_TO_ID_TYP.LOC.value());
			hdrR.in_to_id_nm(locR.loc_nm());
			hdrR.in_to_zip_cd(locR.zip_cd());
			hdrR.in_to_addr1(locR.addr1());
			hdrR.in_to_addr2(locR.addr2());
			hdrR.in_to_addr3(locR.addr3());
			hdrR.in_to_addr4(locR.addr4());
			hdrR.in_to_cntct_dpt(null);
			hdrR.in_to_cntct_psn(null);
			hdrR.in_to_tel(locR.tel());
			hdrR.in_to_fax(locR.fax());
			hdrR.in_to_cntry_cd(locR.cntry_cd());
			hdrR.in_to_sundry_flg(false);
		}
		
		/**
		 * 最新の為替レートを取得
		 */
		protected void setXrate() {
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) || isUplnd(hdrR)) {
					return;
				}
				
				MCDate baseDt = hdrR.fix_flg() ? hdrR.purc_dt() :  hdrR.iv_dt();
				
				// 為替レート
				if (!hdrR.xrate_inpt_flg()) {
					hdrR.xrate(getDefXrate(hdrR.trd_cur_cd(), getCo().base_cur_cd(),
							getCo().purc_xrate_cd(),baseDt));
				}
				
				// 納税通貨
				hdrR.ptax_cur_cd(getCo().ptax_cur_cd());
				
				// 納税為替レート
				if (!hdrR.ptax_xrate_inpt_flg()) {
					hdrR.ptax_xrate(getDefXrate(hdrR.trd_cur_cd(), getCo().ptax_cur_cd(),
							getCo().purc_xrate_cd(), baseDt));
				}
			}
		}
		
		/**
		 * 初期値を補完 
		 */
		protected void setDefVal() {
			for (RcptIv_Chk01_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				r.maker_cd(nvl(r.maker_cd(), MAC_STR.NULL_VAL.value()));
				
				if (r.manual_add_flg() && isNotMng(r)) {
					r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
				}
			}
		}
		
		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void setDefValAfterDoServerChk() {
			for (RcptIv_Chk01_DtlR r : up1()) {
				// リストロジックによって補完する項目を元に条件分岐するので、リストロジック実行後に補完している
				
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno1(nullValToNull(r.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno2(nullValToNull(r.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno3(nullValToNull(r.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno4(nullValToNull(r.sno4()));
				}
			}
		}
		
		/**
		 * 基準単位数量の算出し補完する<br>
		 * ※事前に基準数量、換算数量、小数部有効桁数、端数処理区分が補完されていること
		 */
		protected void setBaseUnitQty() {
			MCIndexKey ioIdx = up2().createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
			for (RcptIv_Chk01_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}	
				r.base_unit_qty(
					convToBaseUnit(
						r.trd_unit_qty(), r.trd_unit_conv_base_qty() , r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ())
				);
				MCList<RcptIv_Chk01_MapR> ioL = up2().subList(ioIdx, r.peg_no());
				for (RcptIv_Chk01_MapR ioR : ioL) {
					if (isNullOrNullVal(ioR.arr_schd_no())
						&& isNullOrNullVal(ioR.arr_act_no())) {
						continue;
					}
					ioR.base_unit_qty(
						convToBaseUnit(
							ioR.trd_unit_qty(), ioR.trd_unit_conv_base_qty() , ioR.trd_unit_conv_qty(),
							r.base_unit_dec_place(), r.base_unit_rnd_typ())
					);
				}
			}
		}
		
		/**
		 * インボイススイッチサービスチェックの呼出し
		 */
		protected void callExIvChkSrv() {
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				if (isDdlv(hdrR)) {
					// 更新でインボイス本登録済の場合はサービス呼出対象外（インボイス関連項目は画面で入力制御）
					if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && isRegIv(hdrR)) {
						continue;
					}
					MSBEL_ExIvService.ExIv_Chk01 ope = MSBEL_ExIvService.crtExIv_Chk01();
					copy(ope.up0(), hdrR, createMap_ExIv_HdrR_RcptIv_Chk01_HdrR());
					ope.exec();
					copyErrFlg(hdrR, ope.down0());
				}
			}
		}
		
		/**
		 * 仕入予定サービスチェックの呼出し
		 */
		protected void callPurcSchdChkSrv() {
			MCList<RcptIv_Chk01_DtlR> plndL = getPlndL(up0(), up1());
			MCList<RcptIv_Chk01_DtlR> tgtL = getNotMngAddL(plndL);
			if (tgtL.isEmpty()) {
				return;
			}
			
			MSBDL_PurcSchdRegService.PurcSchd_Chk01 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Chk01();
			setAll(ope.up0(), tgtL, createMap_PurcSchd_DtlR_RcptIv_Chk01_DtlR());
			ope.exec();
			copyErrFlg(up1(), ope.down0());
		}
		
		/**
		 * 承認提供サービスチェックの呼出し
		 */
		protected void callAprvChk() {
			MCList<RcptIv_Chk01_DtlR> updL = MCList.create(RcptIv_Chk01_DtlR.class);
			MCList<RcptIv_Chk01_DtlR> delL = MCList.create(RcptIv_Chk01_DtlR.class);
			MCList<RcptIv_Chk01_DtlR> unFixL = getUnFixL(up0(), up1());
			divUpdDelForAprv(updL, delL, unFixL);
			MBBAL_AprvService.Aprv_Chk03 delOpe = MBBAL_AprvService.crtAprv_Chk03();
			MBBAL_AprvService.Aprv_Chk02 updOpe = MBBAL_AprvService.crtAprv_Chk02();
			createAprvSrvDelUp(delL, delOpe.up0(), true);
			createAprvSrvUpdUp(updL, updOpe.up0());
			
			if (!delOpe.up0().isEmpty()) {
				delOpe.exec();
				copyErrFlg(up1(), delOpe.down0());
			}
			if (!updOpe.up0().isEmpty()) {
				updOpe.exec();
				copyErrFlg(up1(), updOpe.down0());
			}
		}
		
		/**
		 * 船積港、船卸港、経由地に同じ港ＣＤが設定されていた場合、エラーメッセージを返す
		 */
		protected MCMessageList checkPorts() {
			MCMessageList msgL = new MCMessageList();
			
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				if (!isNullOr(hdrR.load_port_cd(), hdrR.dschrg_port_cd())
						&& isSame(hdrR.load_port_cd(), hdrR.dschrg_port_cd())) {
					msgL.add(new MCMessage(hdrR, null, MSBEL0077));
				}
				else if (!isNullOr(hdrR.load_port_cd(), hdrR.via_port_cd())
						&& isSame(hdrR.load_port_cd(), hdrR.via_port_cd())) {
					msgL.add(new MCMessage(hdrR, null, MSBEL0077));
				}
				else if (!isNullOr(hdrR.dschrg_port_cd(), hdrR.via_port_cd())
						&& isSame(hdrR.dschrg_port_cd(), hdrR.via_port_cd())) {
					msgL.add(new MCMessage(hdrR, null, MSBEL0077));
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
				
				//----------------------------
				// 条件付必須チェック
				//----------------------------
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					if (hdrR.xrate_inpt_flg()) {
						msgL.addAll(check(hdrR, RcptIv_Chk01_HdrR.$xrate, new FXUCL_RequiredValidater()));
					}
					if (hdrR.ptax_xrate_inpt_flg()) {
						msgL.addAll(check(hdrR, RcptIv_Chk01_HdrR.$ptax_xrate, new FXUCL_RequiredValidater()));
					}
				}
				for (RcptIv_Chk01_DtlR r : dtlL) {
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						msgL.addAll(check(r, RcptIv_Chk01_DtlR.$rcpt_iv_d_no, new FXUCL_RequiredValidater()));
					}
					if (r.manual_add_flg()) {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cd, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$itm_cd, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$itm_sub1, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$itm_sub2, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$itm_sub3, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_unit_cd, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$purc_dpt_cd, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
							
							if (isNotMng(r)) {
								msgL.addAll(check(r, RcptIv_Chk01_DtlR.$purc_rsn_cd, new FXUCL_RequiredValidater()));
								msgL.addAll(check(r, RcptIv_Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
							}
							
							if (!isNull(r.trd_cur_dscnt_amt()) && r.trd_cur_dscnt_amt().isPositive()) {
								msgL.addAll(check(r, RcptIv_Chk01_DtlR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
							}
						}
					}
					else {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$purc_schd_no, new FXUCL_RequiredValidater()));
						}
					}
					if (!r.manual_add_flg() && !r.non_purc_flg()) {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, RcptIv_Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
						}
					}
				}
				
				// 削除行を除いたリスト
				MCList<RcptIv_Chk01_DtlR> exceptDelL = dtlL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				
				//----------------------------
				// 受領インボイスＮＯ重複チェック
				//----------------------------
				msgL.addAll(checkRcptIvNo(hdrR));
				
				//----------------------------
				// 品目チェック
				//----------------------------
				msgL.addAll(checkItm(exceptDelL.subList(r -> r.manual_add_flg()), hdrR));
				
				//----------------------------
				// 仕入理由チェック
				//----------------------------
				msgL.addAll(checkPurcRsn(exceptDelL));
				
				//----------------------------
				// 仕入予定チェック
				//----------------------------
				msgL.addAll(checkPurcSchd(dtlL.subList(r -> !r.manual_add_flg()), hdrR));
				
				//----------------------------
				// 入荷予定チェック
				//----------------------------
				msgL.addAll(checkArrSchd(exceptDelL.subList(r -> !r.manual_add_flg()), hdrR));
				
				//----------------------------
				// 品目詳細存在チェック
				//----------------------------
				// 在庫品の仕入諸掛追加は確定オンのみのため、品目詳細存在チェックは仕入実績登録サービスで実行される
				
				//----------------------------
				// 負担関連存在チェック
				//----------------------------
				msgL.addAll(checkExistBd(exceptDelL.subList(r -> r.manual_add_flg())));
				
				//----------------------------
				// 打切チェック
				//----------------------------
				msgL.addAll(checkAbort(hdrR, exceptDelL.subList(r -> !r.manual_add_flg())));
				
				//----------------------------
				// 数量チェック
				//----------------------------
				msgL.addAll(check(exceptDelL, RcptIv_Chk01_DtlR.$trd_unit_qty, new FXUCL_PositiveValidater()));
				
				//----------------------------
				// 有効桁数チェック
				//----------------------------
				msgL.addAll(checkDecPlace(exceptDelL, RcptIv_Chk01_DtlR.$trd_unit_dec_place, RcptIv_Chk01_DtlR.$trd_unit_qty));
				
				//----------------------------
				// 明細チェック
				//----------------------------
				// 明細行が1件以上あるか
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) { 
					msgL.addAll(checkAtLeastOneDtl(hdrR, exceptDelL));
				}
				
				if (exceptDelL.size() > 0) {
					// 値引品のみでは登録できません。
					if (exceptDelL.subList(RcptIv_Chk01_DtlR.$dscnt_itm_flg, true).size() == exceptDelL.size()) {
						// 明細に対するメッセージではないのでバインド変数(行番号)は指定しないのでヘッダのロウを渡す
						msgL.add(new MCMessage(MSBDL0092, toDispGUIIndex(hdrR)));
					}
					
					// 仕入諸掛のみでは登録できません
					if (!isUplnd(hdrR) && exceptDelL.subList(RcptIv_Chk01_DtlR.$manual_add_flg, true).size() == exceptDelL.size()) {
						msgL.add(new MCMessage(MSBEL1058));
					}
				}
				
				//----------------------------
				// 金額関連チェック
				//----------------------------
				for (RcptIv_Chk01_DtlR r : exceptDelL) {
					// 単価＜０、値引額≦０は認めない
					msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cur_upri, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
					
					// 単価「0」指定で、値引額が入力されていないかチェック
					msgL.addAll(MSBDL_PurcUtil.checkDscntAmt(r, RcptIv_Chk01_DtlR.$trd_cur_upri, RcptIv_Chk01_DtlR.$trd_cur_dscnt_amt));
					
					// 値引額が大きすぎて金額が負の値になってはいけない
					msgL.addAll(check(r, RcptIv_Chk01_DtlR.$trd_cur_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
				}
				
				//----------------------------
				// DACチェック
				//----------------------------
				msgL.addAll(checkDac());
			}
			
			return msgL;
		}
		
		/**
		 * DACチェック
		 */
		protected MCMessageList checkDac() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<RcptIv_Chk01_DtlR>
				insL = MCList.create(RcptIv_Chk01_DtlR.class),
				exceptInsL = MCList.create(RcptIv_Chk01_DtlR.class),
				exceptDelL = MCList.create(RcptIv_Chk01_DtlR.class);
			
			MCIndexKey hdrIdx = up0().createIndex(RcptIv_Chk01_HdrR.$peg_no);
			for (RcptIv_Chk01_DtlR r : up1()) {
				RcptIv_Chk01_HdrR hdrR = up0().getFirst(hdrIdx, r.hdr_peg_no());
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						&& !isUplnd(hdrR)
						&& !r.manual_add_flg()
						&& !isSame(r.wg_cd(), r.po_wg_cd())) {
					insL.add(r);
				}
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					exceptInsL.add(r);
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					exceptDelL.add(r);
				}
			}
			
			msgL.addAll(checkDacForInsL(insL));
			msgL.addAll(checkDacForExceptInsL(exceptInsL));
			msgL.addAll(checkDacForExceptDelL(exceptDelL));
			
			return msgL;
		}
		protected MCMessageList checkDacForInsL(MCList<RcptIv_Chk01_DtlR> insL) {
			// 変更前(新規行)の購買部門のWGに対するDACチェック
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableWgCdDac(insL, RcptIv_Chk01_DtlR.$po_wg_cd));
			return msgL;
		}
		protected MCMessageList checkDacForExceptInsL(MCList<RcptIv_Chk01_DtlR> exceptInsL) {
			// 変更前(更新行と削除行)の購買部門のWGに対するDACチェック
			
			MCMessageList msgL = new MCMessageList();
			if (!exceptInsL.isEmpty()) {
			
				MCList<MST_RCPT_IV_D_R>
					dbc = MCList.create(MST_RCPT_IV_D_R.class),
					chkL = MCList.create(MST_RCPT_IV_D_R.class);
				MST_RCPT_IV_D_R t = MST_RCPT_IV_D_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.rcpt_iv_d_no, t.wg_cd);
				dbSelectKey("MSBEL5740_MST_RCPT_IV_D_S01", dbc, dbc_bldr, exceptInsL);
				
				MCIndexKey idx = exceptInsL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_d_no);
				for (MST_RCPT_IV_D_R r : dbc) {
					RcptIv_Chk01_DtlR upR = exceptInsL.getFirst(idx, r.rcpt_iv_d_no());
					if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ()) || !isSame(r.wg_cd(), upR.wg_cd())) {
						r.setAttributes(upR);
						chkL.add(r);
					}
				}
				msgL.addAll(checkWritableWgCdDac(chkL, MST_RCPT_IV_D_R.$wg_cd));
			}
			
			return msgL;
		}
		protected MCMessageList checkDacForExceptDelL(MCList<RcptIv_Chk01_DtlR> exceptDelL) {
			// 変更後(新規行と更新行)の購買部門のWGに対するDACチェック
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableWgCdDac(exceptDelL, RcptIv_Chk01_DtlR.$wg_cd));
			return msgL;
		}
		
		/**
		 * 仕入予定チェック
		 */
		protected MCMessageList checkPurcSchd(MCList<RcptIv_Chk01_DtlR> dtlL, RcptIv_Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			
			// 確定オンの場合はチェック不要
			if (hdrR.fix_flg()) {
				return msgL;
			}
			
			MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(dtlL);
			MCIndexKey asIdx = dtlL.createIndex(RcptIv_Chk01_DtlR.$arr_schd_no);
			
			for (MCList<MST_ARR_SCHD_R> asL : arrSchdL.groupList(getArrSchdGrpKey(true))) {
				
				MCList<RcptIv_Chk01_DtlR> chkL = MCList.create(RcptIv_Chk01_DtlR.class);
				MCList<MST_ARR_SCHD_R> exceptL = MCList.create(MST_ARR_SCHD_R.class);
				MCNumber trdQty = MCNumber.ZERO;
				for (MST_ARR_SCHD_R asR : asL) {
					
					RcptIv_Chk01_DtlR r = dtlL.getFirst(asIdx, asR.arr_schd_no());
					if (isNull(r)) {
						if (asR.arr_qty().isPositive()) {
							// チェック対象にない入荷済みの予定は割当対象から除外
							exceptL.add(asR);
						}
						continue;
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						continue;
					}
					
					// チェック対象の数量
					trdQty = trdQty.add(r.base_unit_qty());
					chkL.add(r);
				}
				
				if (!chkL.isEmpty()) {
					// 未割当の数量
					if (!exceptL.isEmpty()) {
						asL.removeAll(exceptL);
					}
					MCNumber freeQty = nvl(asL.subList(r -> 
						isNull(r.rcpt_iv_no()) || isSame(r.rcpt_iv_mng_no(), hdrR.rcpt_iv_mng_no())
					).sum(MST_ARR_SCHD_R.$base_unit_qty), MCNumber.ZERO);
					
					if (trdQty.gt(freeQty) && MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
						MCNumber excessQty = trdQty.subtract(freeQty);
						chkL.forEach(r -> {
							// 受領インボイス明細の数量が受領インボイス未登録の数量を超えています。
							msgL.add(new MCMessage(r, RcptIv_Chk01_DtlR.$trd_unit_qty, MSBEL1054, excessQty, toDispGUIIndex(r)));
						});
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 入荷予定チェック
		 */
		protected MCMessageList checkArrSchd(MCList<RcptIv_Chk01_DtlR> dtlL, RcptIv_Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(dtlL);
			MCIndexKey asIdx = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			
			for (RcptIv_Chk01_DtlR r : dtlL.subList(r -> !isNull(r.arr_schd_no()))) {
				MST_ARR_SCHD_R asR = arrSchdL.getFirst(asIdx, r.arr_schd_no());
				
				// 同時計上オフ、受領インボイス作成元区分「入荷予定」は入荷数未満で登録できない
				if (!r.sync_flg()
						&& MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())
						&& r.base_unit_qty().lt(asR.arr_qty())) {
						msgL.add(new MCMessage(
							r, RcptIv_Chk01_DtlR.$trd_unit_qty, MSBEL1059, r.base_unit_qty(), asR.arr_qty(), toDispGUIIndex(r)));
				}
				
				if (asR.outsrc_flg() && isNull(asR.mfg_inst_no())) {
					// 受領インボイスを登録すると入荷予定は触れなくなるので、登録前に入荷予定を製造指図を紐付けてもらう
					msgL.add(new MCMessage(r, null, MSBEL1061, r.arr_schd_no(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 受領インボイスＮＯ重複チェック
		 */
		protected MCMessageList checkRcptIvNo(RcptIv_Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				return msgL;
			}
			
			// 受領インボイスＮＯが重複許可の場合はチェック不要
			MAM_BP_R bpR = _cacheBp.get(hdrR.sppl_cd());
			if(bpR.rcpt_iv_dup_flg()) {
				return msgL;
			}
			
			MCList<MST_RCPT_IV_R> rcptIvL = getCacheRcptIvByRcptIvNo(hdrR.rcpt_iv_no());
			for (MST_RCPT_IV_R rcptIvR : rcptIvL) {
				// 更新対象以外に同一発注先で同一受領インボイスＮＯが登録されてる場合、エラー
				if (!isSame(rcptIvR.rcpt_iv_mng_no(), hdrR.rcpt_iv_mng_no())
						&& isSame(rcptIvR.sppl_cd(), hdrR.sppl_cd())) {
					msgL.add(new MCMessage(hdrR, RcptIv_Chk01_HdrR.$rcpt_iv_no, MSBEL1118,
							hdrR.rcpt_iv_no(), toDispGUIIndex(hdrR)));
				}
			}
			
			return msgL;
		}
		
		
		/**
		 * 品目に対するチェック
		 */
		protected MCMessageList checkItm(MCList<RcptIv_Chk01_DtlR> dtlL, RcptIv_Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			
			// 確定オンの場合はチェック不要
			if (hdrR.fix_flg()) {
				return msgL;
			}
			
			for (RcptIv_Chk01_DtlR r : dtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						msgL.add(new MCMessage(r, RcptIv_Chk01_DtlR.$itm_cd, MSBEL1055,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),  toDispGUIIndex(r)));
					}
					if (!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
						msgL.add(new MCMessage(r, RcptIv_Chk01_DtlR.$itm_cd, MSBEL1056,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),  toDispGUIIndex(r)));
					}
				}
				else if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!isNotMng(r)) {
						msgL.add(new MCMessage(r, RcptIv_Chk01_DtlR.$itm_cd, MSBEL1120,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 仕入理由に対するチェック
		 */
		protected MCMessageList checkPurcRsn(MCList<RcptIv_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcptIv_Chk01_DtlR r : dtlL) {
				if (isNotMng(r) && !r.xpns_purc_flg()) {
					msgL.add(new MCMessage(r, RcptIv_Chk01_DtlR.$itm_cd, MSBEL1057,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),  toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 負担項目の各種ＮＯの存在チェック
		 */
		protected MCMessageList checkExistBd(MCList<RcptIv_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			MCList<RcptIv_Chk01_DtlR> bdLotChkTgtL = MCList.create(RcptIv_Chk01_DtlR.class);
			
			for (RcptIv_Chk01_DtlR dr : dtlL) {
				if (!isNotMng(dr)) {
					continue;
				}
				if (!isNull(dr.bd_po_no())) {
					if (!MSBDL_PurcUtil.existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, RcptIv_Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!MSBDL_PurcUtil.existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, RcptIv_Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					if (!MSBDL_PurcUtil.existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, RcptIv_Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
			}
			callLotServiceChkBdItm(bdLotChkTgtL);
			
			return msgL;
		}
		/**
		 * 打切に対するチェック
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkAbort(RcptIv_Chk01_HdrR hdrR, MCList<RcptIv_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(dtlL);
			MCIndexKey asIdx = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			
			for (RcptIv_Chk01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				MST_ARR_SCHD_R asR = arrSchdL.getFirst(asIdx, dtlR.arr_schd_no());
				if (!isNull(asR)
					&& !isNull(dtlR.base_unit_qty())
					&& dtlR.base_unit_qty().gte(asR.base_unit_qty())
					&& dtlR.abort_flg()) {
					// 予定数以上での打切は不可
					msgL.add(new MCMessage(
						dtlR, RcptIv_Chk01_DtlR.$abort_flg, MSBEL1123, toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
		
		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 */
		protected void callLotServiceChkBdItm(MCList<RcptIv_Chk01_DtlR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}		
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_RcptIv_Chk01_DtlR());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}
		protected Map_Lot_Chk03_CndR_RcptIv_Chk01_DtlR<Lot_Chk03_CndR,RcptIv_Chk01_DtlR> createMap_Lot_Chk03_CndR_RcptIv_Chk01_DtlR() {
			return new Map_Lot_Chk03_CndR_RcptIv_Chk01_DtlR<Lot_Chk03_CndR, RcptIv_Chk01_DtlR>();
		}
		public class Map_Lot_Chk03_CndR_RcptIv_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, RcptIv_Chk01_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, RcptIv_Chk01_DtlR.$bd_itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, RcptIv_Chk01_DtlR.$bd_itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, RcptIv_Chk01_DtlR.$bd_itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, RcptIv_Chk01_DtlR.$bd_itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, RcptIv_Chk01_DtlR.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, RcptIv_Chk01_DtlR.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$err_flg, RcptIv_Chk01_DtlR.$err_flg);
			}
		}
		
		/**
		 * チェックの上り電文から、仕入実績サービス(Upd02)実行用の電文キャッシュを作成する</p>
		 * ただし、エラーFLGがONの電文は対象から除外される
		 */
		protected void setParamCache() {
			MCList<RcptIv_Chk01_HdrR> hdrForCacheL = MCList.create(RcptIv_Chk01_HdrR.class);
			MCList<RcptIv_Chk01_DtlR> dtlForCacheL = MCList.create(RcptIv_Chk01_DtlR.class);
			MCList<RcptIv_Chk01_MapR> mapForCacheL = MCList.create(RcptIv_Chk01_MapR.class);
			MCIndexKey mapIdx = up2().createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
			
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			MCList<RcptIv_Chk01_HdrR> noErrHdrList = up0().subList(RcptIv_Chk01_HdrR.$err_flg, false);
			
			// エラーなしのヘッダに対応する明細にエラーがないかチェックする。
			// 明細または詳細にエラーがある場合は、電文キャッシュには含めない。
			for (RcptIv_Chk01_HdrR hdrRow : noErrHdrList) {
				// ヘッダに紐付く明細、または詳細の電文内に一つでもエラーの行があればtrueとなる
				boolean errFlg = false;
				
				// 紐付く明細を取得
				MCList<RcptIv_Chk01_DtlR> addDtlList = up1().subList(dtlIdx, hdrRow.peg_no());
				
				for (RcptIv_Chk01_DtlR dtlRow : addDtlList) {
					if (errFlg) {
						break;
					}
					if (dtlRow.err_flg()) {
						errFlg = true;
					}
				}
				
				// 明細にもエラーがない場合に、電文をヘッダ単位でキャッシュする
				if (!errFlg) {
					hdrForCacheL.add(hdrRow);
					dtlForCacheL.addAll(addDtlList);
					addDtlList.forEach(r -> {
						mapForCacheL.addAll(up2().subList(mapIdx, r.peg_no()));
					});
				}
			}
			
			// 電文キャッシュを作成
			if (hdrForCacheL.size() > 0) {
				initHdrCache(hdrForCacheL);
				initDtlCache(dtlForCacheL);
				initMapCache(mapForCacheL);
			}
		}
		
		protected void setDown() {
			MCIndexKey hdrIdx = up0().createIndex(RcptIv_Chk01_HdrR.$peg_no);
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			
			// 明細行でチェックした結果エラーであれば、ヘッダ行もエラーにする
			for (RcptIv_Chk01_DtlR dtlR : up1()) {
				if (dtlR.err_flg()) {
					RcptIv_Chk01_HdrR hdrRow = up0().getFirst(hdrIdx, dtlR.hdr_peg_no());
					if (!isNull(hdrRow)) {
						hdrRow.err_flg(true);
					}
				}
			}
			
			// ヘッダ行がエラーであれば、紐付く明細全てエラーとする
			for (RcptIv_Chk01_HdrR hdrRow : up0()) {
				if (hdrRow.err_flg()) {
					MCList<RcptIv_Chk01_DtlR> dtlList = up1().subList(dtlIdx, hdrRow.peg_no());
					dtlList.setBoolean(RcptIv_Chk01_DtlR.$err_flg, hdrRow.err_flg());
				}
			}
			
			down0().setAll(up0());
			down1().setAll(up1());
		}
		
		protected Map_RcptIv_Chk01_HdrR_RcptIv_Chk01_DtlR<RcptIv_Chk01_HdrR,RcptIv_Chk01_DtlR> createMap_RcptIv_Chk01_HdrR_RcptIv_Chk01_DtlR() {
			return new Map_RcptIv_Chk01_HdrR_RcptIv_Chk01_DtlR<RcptIv_Chk01_HdrR, RcptIv_Chk01_DtlR>();
		}
		
		public class Map_RcptIv_Chk01_HdrR_RcptIv_Chk01_DtlR<D extends RcptIv_Chk01_HdrR, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcptIv_Chk01_HdrR.$old_rcpt_iv_no, RcptIv_Chk01_DtlR.$old_rcpt_iv_no);
				addColumnPathMap(RcptIv_Chk01_HdrR.$sppl_cd, RcptIv_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_id_typ, RcptIv_Chk01_DtlR.$in_to_id_typ);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_id_cd, RcptIv_Chk01_DtlR.$in_to_id_cd);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_zip_cd, RcptIv_Chk01_DtlR.$in_to_zip_cd);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr1, RcptIv_Chk01_DtlR.$in_to_addr1);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr2, RcptIv_Chk01_DtlR.$in_to_addr2);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr3, RcptIv_Chk01_DtlR.$in_to_addr3);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_addr4, RcptIv_Chk01_DtlR.$in_to_addr4);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntct_dpt, RcptIv_Chk01_DtlR.$in_to_cntct_dpt);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntct_psn, RcptIv_Chk01_DtlR.$in_to_cntct_psn);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_tel, RcptIv_Chk01_DtlR.$in_to_tel);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_fax, RcptIv_Chk01_DtlR.$in_to_fax);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_cntry_cd, RcptIv_Chk01_DtlR.$in_to_cntry_cd);
				addColumnPathMap(RcptIv_Chk01_HdrR.$in_to_sundry_flg, RcptIv_Chk01_DtlR.$in_to_sundry_flg);
				addColumnPathMap(RcptIv_Chk01_HdrR.$cst_iv_flg, RcptIv_Chk01_DtlR.$cst_iv_flg);
				addColumnPathMap(RcptIv_Chk01_HdrR.$trd_cur_cd, RcptIv_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(RcptIv_Chk01_HdrR.$trd_amt_dec_place, RcptIv_Chk01_DtlR.$trd_amt_dec_place);
				addColumnPathMap(RcptIv_Chk01_HdrR.$trd_upri_dec_place, RcptIv_Chk01_DtlR.$trd_upri_dec_place);
				addColumnPathMap(RcptIv_Chk01_HdrR.$purc_amt_rnd_typ, RcptIv_Chk01_DtlR.$purc_amt_rnd_typ);
				addColumnPathMap(RcptIv_Chk01_HdrR.$purc_tax_rnd_typ, RcptIv_Chk01_DtlR.$purc_tax_rnd_typ);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (dest.in_to_sundry_flg()) {
					dest.in_to_id_nm(src.in_to_id_nm());
				}
				else {
					dest.in_to_id_nm(null);
				}
				dest.setStringNE("old_rcpt_iv_mng_no", dest.rcpt_iv_mng_no());
				dest.slo_tterm_cd1(src.getStringNE("slo_tterm_cd1"));
				dest.slo_tterm_rmrks1(src.getStringNE("slo_tterm_rmrks1"));
				dest.slo_tterm_cd2(src.getStringNE("slo_tterm_cd2"));
				dest.slo_tterm_rmrks2(src.getStringNE("slo_tterm_rmrks2"));
				dest.slo_tterm_cd3(src.getStringNE("slo_tterm_cd3"));
				dest.slo_tterm_rmrks3(src.getStringNE("slo_tterm_rmrks3"));
			}
		}
		
		protected Map_RcptIv_Chk01_DtlR_RcptIv_Chk01_DtlR<RcptIv_Chk01_DtlR,RcptIv_Chk01_DtlR> createMap_RcptIv_Chk01_DtlR_RcptIv_Chk01_DtlR() {
			return new Map_RcptIv_Chk01_DtlR_RcptIv_Chk01_DtlR<RcptIv_Chk01_DtlR, RcptIv_Chk01_DtlR>();
		}
		
		public class Map_RcptIv_Chk01_DtlR_RcptIv_Chk01_DtlR<D extends RcptIv_Chk01_DtlR, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcptIv_Chk01_DtlR.$trd_cd, RcptIv_Chk01_DtlR.$trd_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$trd_ptn_typ, RcptIv_Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(RcptIv_Chk01_DtlR.$itm_cd, RcptIv_Chk01_DtlR.$itm_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub1, RcptIv_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub2, RcptIv_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(RcptIv_Chk01_DtlR.$itm_sub3, RcptIv_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(RcptIv_Chk01_DtlR.$itm_nm, RcptIv_Chk01_DtlR.$itm_nm);
				addColumnPathMap(RcptIv_Chk01_DtlR.$iv_itm_nm, RcptIv_Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sundry_itm_flg, RcptIv_Chk01_DtlR.$sundry_itm_flg);
				addColumnPathMap(RcptIv_Chk01_DtlR.$maker_cd, RcptIv_Chk01_DtlR.$maker_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_cd, RcptIv_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sppl_itm_cd, RcptIv_Chk01_DtlR.$sppl_itm_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sppl_itm_nm, RcptIv_Chk01_DtlR.$sppl_itm_nm);
				addColumnPathMap(RcptIv_Chk01_DtlR.$purc_id_typ, RcptIv_Chk01_DtlR.$purc_id_typ);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sno1, RcptIv_Chk01_DtlR.$sno1);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sno2, RcptIv_Chk01_DtlR.$sno2);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sno3, RcptIv_Chk01_DtlR.$sno3);
				addColumnPathMap(RcptIv_Chk01_DtlR.$sno4, RcptIv_Chk01_DtlR.$sno4);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$old_rcpt_iv_no, RcptIv_Chk01_DtlR.$old_rcpt_iv_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$arr_schd_no, RcptIv_Chk01_DtlR.$arr_schd_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$arr_pr_no, RcptIv_Chk01_DtlR.$arr_pr_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$slo_d_no, RcptIv_Chk01_DtlR.$slo_d_no);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$slo_sts_typ, RcptIv_Chk01_DtlR.$slo_sts_typ);
				addColumnPathMap(RcptIv_Chk01_DtlR.$unit_cd, RcptIv_Chk01_DtlR.$unit_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$purc_qty, RcptIv_Chk01_DtlR.$purc_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_accpt_dfct_qty, RcptIv_Chk01_DtlR.$base_unit_accpt_dfct_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_abort_qty, RcptIv_Chk01_DtlR.$base_unit_abort_qty);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_conv_qty, RcptIv_Chk01_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$trd_unit_conv_base_qty, RcptIv_Chk01_DtlR.$trd_unit_conv_base_qty);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_dec_place, RcptIv_Chk01_DtlR.$base_unit_dec_place);
				addColumnPathMap(RcptIv_Chk01_DtlR.$base_unit_rnd_typ, RcptIv_Chk01_DtlR.$base_unit_rnd_typ);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$aprv_no, RcptIv_Chk01_DtlR.$aprv_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$slo_no, RcptIv_Chk01_DtlR.$slo_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$rqst_can_flg, RcptIv_Chk01_DtlR.$rqst_can_flg);
				addColumnPathMap(RcptIv_Chk01_DtlR.$err_flg, RcptIv_Chk01_DtlR.$err_flg);
				
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_no, RcptIv_Chk01_DtlR.$po_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_d_no, RcptIv_Chk01_DtlR.$po_d_no);
				addColumnPathMap(RcptIv_Chk01_DtlR.$non_purc_flg, RcptIv_Chk01_DtlR.$non_purc_flg);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_unit_cd, RcptIv_Chk01_DtlR.$po_trd_unit_cd);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_unit_qty, RcptIv_Chk01_DtlR.$po_trd_unit_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_upri, RcptIv_Chk01_DtlR.$po_trd_cur_upri);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_dscnt_amt, RcptIv_Chk01_DtlR.$po_trd_cur_dscnt_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_proc_upri, RcptIv_Chk01_DtlR.$po_trd_cur_proc_upri);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_onr_prov_upri, RcptIv_Chk01_DtlR.$po_trd_cur_onr_prov_upri);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_amt, RcptIv_Chk01_DtlR.$po_trd_cur_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_proc_amt, RcptIv_Chk01_DtlR.$po_trd_cur_proc_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_onr_prov_amt, RcptIv_Chk01_DtlR.$po_trd_cur_onr_prov_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_tax_amt, RcptIv_Chk01_DtlR.$po_trd_cur_tax_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_cur_inc_ctax_amt, RcptIv_Chk01_DtlR.$po_trd_cur_inc_ctax_amt);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_unit_conv_qty, RcptIv_Chk01_DtlR.$po_trd_unit_conv_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_trd_unit_conv_base_qty, RcptIv_Chk01_DtlR.$po_trd_unit_conv_base_qty);
				addColumnPathMap(RcptIv_Chk01_DtlR.$po_wg_cd, RcptIv_Chk01_DtlR.$po_wg_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.qty(dest.trd_unit_qty());	// 受注状況の数量
				
				// 上り電文のdata_crud_typがそのまま設定されているdestで判定
				if(MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())){
					dest.purc_schd_dt(src.purc_schd_dt());
					dest.trd_unit_qty(src.trd_unit_qty());
					dest.base_unit_qty(src.base_unit_qty());
				}
			}
		}
		
		protected Map_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR,RcptIv_Chk01_HdrR> createMap_ExIv_HdrR_RcptIv_Chk01_HdrR() {
			return new Map_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR, RcptIv_Chk01_HdrR>();
		}
		
		public class Map_ExIv_HdrR_RcptIv_Chk01_HdrR<D extends ExIv_HdrR, S extends RcptIv_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcptIv_Chk01_DtlR.$peg_no, RcptIv_Chk01_DtlR.$peg_no);
				addColumnPathMap(ExIv_HdrR.$dlv_id_cd, RcptIv_Chk01_HdrR.$in_to_id_cd);
				addColumnPathMap(ExIv_HdrR.$dlv_id_nm, RcptIv_Chk01_HdrR.$in_to_id_nm);
				addColumnPathMap(ExIv_HdrR.$dlv_cntct_dpt, RcptIv_Chk01_HdrR.$in_to_cntct_dpt);
				addColumnPathMap(ExIv_HdrR.$dlv_cntct_psn, RcptIv_Chk01_HdrR.$in_to_cntct_psn);
				addColumnPathMap(ExIv_HdrR.$dlv_zip_cd, RcptIv_Chk01_HdrR.$in_to_zip_cd);
				addColumnPathMap(ExIv_HdrR.$dlv_addr1, RcptIv_Chk01_HdrR.$in_to_addr1);
				addColumnPathMap(ExIv_HdrR.$dlv_addr2, RcptIv_Chk01_HdrR.$in_to_addr2);
				addColumnPathMap(ExIv_HdrR.$dlv_addr3, RcptIv_Chk01_HdrR.$in_to_addr3);
				addColumnPathMap(ExIv_HdrR.$dlv_addr4, RcptIv_Chk01_HdrR.$in_to_addr4);
				addColumnPathMap(ExIv_HdrR.$dlv_tel, RcptIv_Chk01_HdrR.$in_to_tel);
				addColumnPathMap(ExIv_HdrR.$dlv_cntry_cd, RcptIv_Chk01_HdrR.$in_to_cntry_cd);
				addColumnPathMap(ExIv_HdrR.$dlv_sundry_flg, RcptIv_Chk01_HdrR.$in_to_sundry_flg);
				
				addColumnPathMap(ExIv_HdrR.$trnspt_cd, RcptIv_Chk01_HdrR.$trnspt_cd);
				addColumnPathMap(ExIv_HdrR.$vssl_flght, RcptIv_Chk01_HdrR.$vssl_flght);
				addColumnPathMap(ExIv_HdrR.$load_port_cd, RcptIv_Chk01_HdrR.$load_port_cd);
				addColumnPathMap(ExIv_HdrR.$etd_dt, RcptIv_Chk01_HdrR.$etd_dt);
				addColumnPathMap(ExIv_HdrR.$dschrg_port_cd, RcptIv_Chk01_HdrR.$dschrg_port_cd);
				addColumnPathMap(ExIv_HdrR.$eta_dt, RcptIv_Chk01_HdrR.$eta_dt);
				addColumnPathMap(ExIv_HdrR.$via_port_cd, RcptIv_Chk01_HdrR.$via_port_cd);
				addColumnPathMap(ExIv_HdrR.$via_schd_dt, RcptIv_Chk01_HdrR.$via_schd_dt);
				
				addColumnPathMap(ExIv_HdrR.$tterm_cd1, RcptIv_Chk01_HdrR.$tterm_cd1);
				addColumnPathMap(ExIv_HdrR.$tterm_rmrks1, RcptIv_Chk01_HdrR.$tterm_rmrks1);
				addColumnPathMap(ExIv_HdrR.$tterm_cd2, RcptIv_Chk01_HdrR.$tterm_cd2);
				addColumnPathMap(ExIv_HdrR.$tterm_rmrks2, RcptIv_Chk01_HdrR.$tterm_rmrks2);
				addColumnPathMap(ExIv_HdrR.$tterm_cd3, RcptIv_Chk01_HdrR.$tterm_cd3);
				addColumnPathMap(ExIv_HdrR.$tterm_rmrks3, RcptIv_Chk01_HdrR.$tterm_rmrks3);
				
				addColumnPathMap(ExIv_HdrR.$rcpt_iv_mng_no, RcptIv_Chk01_HdrR.$rcpt_iv_mng_no);
				addColumnPathMap(ExIv_HdrR.$rcpt_iv_no, RcptIv_Chk01_HdrR.$old_rcpt_iv_no);
			}
		}
	}
	
	/**
	 * RcptIv_Ins01オペレーション.<p>
	 *
	 * インボイスを更新する。<br>
	 */
	public class RcptIv_Ins01 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initDbcCache();
			
			removeByCache(up0(), up1(), up2());
			
			callPurcSchdSrv(up0(), up1());
			
			insRcptIv();
			
			insIv();
			
			callArrSchdUpdSrv(up0(), up1(), up2(), false);
			
			callPurcIoSchdRegSrv(up0(), up1(), up2());
			
			callAprvSrvForIns(up0(), up1());
			
			callSloStsUpdSrv(up0(), up1(), this);
			
			callCredUpd(up0(), null, up1());
			
			setDown();
		}
		
		protected void initDbcCache() {
			initDbcCacheBp(up0());
			initDbcCacheCur(up0());
		}
		
		/**
		 * 受領インボイスを登録する
		 */
		protected void insRcptIv() {
			// 上り電文をソート
			up0().sort(RcptIv_Chk01_HdrR.$peg_no);
			up1().sort(RcptIv_Chk01_DtlR.$hdr_peg_no);
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			
			// 受領インボイス
			MCList<MST_RCPT_IV_R> insHdrL = MCList.create(MST_RCPT_IV_R.class);
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				hdrR.rcpt_iv_mng_no(getStrSeq(MSC_NUM_SYS_TYP.RCPTIVMNG));
				hdrR.rcpt_iv_rev(1);
				hdrR.iv().purc_cmpl_flg(isPurcCmpl(hdrR, up1()));
				// 確定オンの場合、予定日は設定しない
				if (hdrR.fix_flg()) {
					hdrR.purc_schd_dt(null);
					hdrR.purc_ac_schd_dt(null);
				}
				MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
				callAmtUtilCalc01(hdrR, dtlL.subList(r -> !r.non_purc_flg()));
				insHdrL.add(hdrR.iv());
			}
			
			// 受領インボイス明細
			doSeqCache(MSC_NUM_SYS_TYP.RCPTIVD, up1().size());
			MCList<MST_RCPT_IV_D_R> insDtlL = MCList.create(MST_RCPT_IV_D_R.class);
			
			MCIndexKey hdrIdx = up0().createIndex(RcptIv_Chk01_HdrR.$peg_no);
			for (RcptIv_Chk01_DtlR dtlR : up1()) {
				dtlR.rcpt_iv_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCPTIVD));
				
				// ヘッダ情報
				RcptIv_Chk01_HdrR hdrR = up0().getFirst(hdrIdx, dtlR.hdr_peg_no());
				dtlR.rcpt_iv_mng_no(hdrR.rcpt_iv_mng_no());
				dtlR.rcpt_iv_rev(hdrR.rcpt_iv_rev());
				
				// 入荷予定
				MCList<MST_ARR_SCHD_R> orgArrSchdL = srchArrSchd(up1());
				MST_ARR_SCHD_R arrSchdR = orgArrSchdL.getFirst("purc_schd_no",dtlR.purc_schd_no());
				if (!isNull(arrSchdR)) {
					dtlR.ivd().ref_dlv_inst_d_no(arrSchdR.getStringNE("ref_dlv_inst_d_no"));
					dtlR.ivd().ref_prms_rcpt_d_no(arrSchdR.prms_rcpt_d_no());
				}
				// まとめ
				dtlR.ivd().bndl_flg(isBndl(dtlR));
				insDtlL.add(dtlR.ivd());
			}
			
			dbInsert("MSBEL5740_MST_RCPT_IV_I01", insHdrL,
					MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T")));
			dbInsert("MSBEL5740_MST_RCPT_IV_D_I01", insDtlL,
					MCQueryApiBuilder.create(MST_RCPT_IV_D_R.create("T")));
			
			// 受領インボイスマップ
			insRcptIvMap();
			// 改訂履歴データ更新サービス呼出（受領インボイス改訂履歴テーブル更新）
			callRevDataServiceIns01(insHdrL);
		}
		/**
		 * まとめか判定する
		 */
		protected MCIndexKey _up2DtlPegIdx;
		protected boolean isBndl(RcptIv_Chk01_DtlR dtlR) {
			if (_up2DtlPegIdx == null) {
				_up2DtlPegIdx = up2().createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
			}
			return up2().subList(_up2DtlPegIdx, dtlR.peg_no()).size() > 1;
		}
		
		/**
		 * 受領インボイスマップを登録する
		 */
		protected void insRcptIvMap() {
			MCJoinKey<MCList<RcptIv_Chk01_DtlR>>
				jk = up2().join(RcptIv_Chk01_MapR.$dtl_peg_no, up1(), RcptIv_Chk01_DtlR.$peg_no);
			for (RcptIv_Chk01_MapR r : up2()) {
				RcptIv_Chk01_DtlR dtlR = r.getJoinedRow(jk);
				r.ivmap().rcpt_iv_d_no(dtlR.rcpt_iv_d_no());
			}
			insRcptIvMapCmn(up2().innerRowList("ivmap", MST_RCPT_IV_MAP_R.class));
		}
		
		/**
		 * インボイスを登録する
		 */
		protected void insIv() {
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			for(RcptIv_Chk01_HdrR hdrR :up0()) {
				if (isDdlv(hdrR)) {
					MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
					callExIvUpdSrv(hdrR ,dtlL.subList(r -> !r.manual_add_flg()));
				}
			}
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	/**
	 * RcptIv_Upd01オペレーション.<p>
	 *
	 * インボイスを更新する。<br>
	 */
	public class RcptIv_Upd01 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initDbcCache();
			
			removeByCache(up0(), up1(), up2());
			
			callPurcSchdSrv(up0(), up1());
			
			setBfrRcptIvD(up0());
			
			updRcptIv();
			
			updIv();
			
			callArrSchdUpdSrv(up0(), up1(), up2(), false);
			
			callPurcIoSchdRegSrv(up0(), up1(), up2());
			
			callAprvSrvForUpd(up0(), up1());
			
			callSloStsUpdSrv(up0(), up1(), this);
			
			callCredUpd(up0(), _bfrDtlL, up1());
			
			setDown();
		}
		
		protected void initDbcCache() {
			initDbcCacheBp(up0());
			initDbcCacheCur(up0());
		}
		
		/**
		 * 受領インボイスを更新する
		 */
		protected void updRcptIv() {
			// 上り電文をソート
			up0().sort(RcptIv_Chk01_HdrR.$peg_no);
			up1().sort(RcptIv_Chk01_DtlR.$hdr_peg_no);
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			
			MCList<MST_RCPT_IV_R> updHdrL = MCList.create(MST_RCPT_IV_R.class);
			MCList<MST_RCPT_IV_D_R> insDtlL = MCList.create(MST_RCPT_IV_D_R.class);
			MCList<MST_RCPT_IV_D_R> updDtlL = MCList.create(MST_RCPT_IV_D_R.class);
			MCList<MST_RCPT_IV_D_R> delDtlL = MCList.create(MST_RCPT_IV_D_R.class);
			
			// 受領インボイス
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				hdrR.rcpt_iv_rev(hdrR.rcpt_iv_rev().add(1));
				hdrR.iv().purc_cmpl_flg(isPurcCmpl(hdrR, up1()));
				// 確定オンの場合、予定日は更新前の値を設定
				if (hdrR.fix_flg()) {
					MST_RCPT_IV_R rcptIv = getCacheRcptIv().get(hdrR.rcpt_iv_mng_no());
					hdrR.purc_schd_dt(rcptIv.purc_schd_dt());
					hdrR.purc_ac_schd_dt(rcptIv.purc_ac_schd_dt());
				}
				MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
				callAmtUtilCalc01(hdrR, dtlL.subList(r -> !r.non_purc_flg()));
				updHdrL.add(hdrR.iv());
			}
			MST_RCPT_IV_R updHdrL_t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder updHdrL_bldr = MCQueryApiBuilder.create(updHdrL_t);
			execUpdRcptIvCol(updHdrL, updHdrL_bldr, updHdrL_t);
			dbUpdateKey("MSBEL5740_MST_RCPT_IV_U01", updHdrL, updHdrL_bldr);
			
			// 受領インボイス明細
			doSeqCache(MSC_NUM_SYS_TYP.RCPTIVD,
					up1().subList(RcptIv_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());
			
			MCIndexKey hdrIdx = up0().createIndex(RcptIv_Chk01_HdrR.$peg_no);
			for (RcptIv_Chk01_DtlR dtlR : up1()) {
				// ヘッダ情報
				RcptIv_Chk01_HdrR hdrR = up0().getFirst(hdrIdx, dtlR.hdr_peg_no());
				dtlR.rcpt_iv_mng_no(hdrR.rcpt_iv_mng_no());
				dtlR.rcpt_iv_rev(hdrR.rcpt_iv_rev());
				// まとめ
				dtlR.ivd().bndl_flg(isBndl(dtlR));
				
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlR.rcpt_iv_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCPTIVD));
					
					// 入荷予定
					MCList<MST_ARR_SCHD_R> orgArrSchdL = srchArrSchd(up1());
					MST_ARR_SCHD_R arrSchdR = orgArrSchdL.getFirst("purc_schd_no",dtlR.purc_schd_no());
					if (!isNull(arrSchdR)) {
						dtlR.ivd().ref_dlv_inst_d_no(arrSchdR.getStringNE("ref_dlv_inst_d_no"));
						dtlR.ivd().ref_prms_rcpt_d_no(arrSchdR.prms_rcpt_d_no());
					}
					insDtlL.add(dtlR.ivd());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					updDtlL.add(dtlR.ivd());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					delDtlL.add(dtlR.ivd());
				}
			}
			
			if (!insDtlL.isEmpty()) {
				MST_RCPT_IV_D_R insDtlL_t = MST_RCPT_IV_D_R.create("T");
				MCQueryApiBuilder insDtlL_bldr = MCQueryApiBuilder.create(insDtlL_t);
				dbInsert("MSBEL5740_MST_RCPT_IV_D_I02", insDtlL, insDtlL_bldr);
			}
			if (!updDtlL.isEmpty()) {
				MST_RCPT_IV_D_R updDtlL_t = MST_RCPT_IV_D_R.create("T");
				MCQueryApiBuilder updDtlL_bldr = MCQueryApiBuilder.create(updDtlL_t);
				execUpdrcptIvDCol(updDtlL, updDtlL_bldr, updDtlL_t);
				dbUpdateKey("MSBEL5740_MST_RCPT_IV_D_U01", updDtlL, updDtlL_bldr);
			}
			if (!delDtlL.isEmpty()) {
				MST_RCPT_IV_D_R delDtlL_t = MST_RCPT_IV_D_R.create("T");
				MCQueryApiBuilder delDtlL_bldr = MCQueryApiBuilder.create(delDtlL_t);
				dbDeleteKey("MSBEL5740_MST_RCPT_IV_D_D01", delDtlL, delDtlL_bldr);
			}
			// 受領インボイスマップ
			insRcptIvMap();
			// 改訂履歴データ更新サービス呼出（受領インボイス改訂履歴テーブル更新）
			callRevDataServiceIns01(updHdrL);
		}
		/**
		 * まとめか判定する
		 */
		protected MCIndexKey _up2DtlPegIdx;
		protected boolean isBndl(RcptIv_Chk01_DtlR dtlR) {
			if (_up2DtlPegIdx == null) {
				_up2DtlPegIdx = up2().createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
			}
			return up2().subList(_up2DtlPegIdx, dtlR.peg_no()).size() > 1;
		}
		/**
		 * 受領インボイスマップを更新する
		 */
		protected void insRcptIvMap() {
			MCIndexKey idx = up2().createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
			MCList<MST_RCPT_IV_MAP_R> ivmapL = MCList.create(MST_RCPT_IV_MAP_R.class);
			for (RcptIv_Chk01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					// 明細枠で行削除された分
					MST_RCPT_IV_MAP_R ivmapR = ivmapL.add();
					ivmapR.rcpt_iv_d_no(dtlR.rcpt_iv_d_no());
				}
				else {
					for (RcptIv_Chk01_MapR r : up2().subList(idx, dtlR.peg_no())) {
						r.ivmap().rcpt_iv_d_no(dtlR.rcpt_iv_d_no());
						ivmapL.add(r.ivmap());
					}
				}
			}
			insRcptIvMapCmn(ivmapL);
		}
		
		/**
		 * インボイスを更新する
		 */
		protected void updIv() {
			MCIndexKey dtlIdx = up1().createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				if (isDdlv(hdrR)) {
					// 更新でインボイス本登録済の場合はサービス呼出対象外（インボイス関連項目は画面で入力制御）
					if (isRegIv(hdrR)) {
						continue;
					}
					MCList<RcptIv_Chk01_DtlR> dtlL = up1().subList(dtlIdx, hdrR.peg_no());
					callExIvDelSrv(hdrR);
					callExIvUpdSrv(hdrR,
							getInsUpdL(dtlL.subList(r -> !r.manual_add_flg())));
				}
			}
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
		/**
		 * 更新しない項目を設定する(受領インボイスヘッダ)
		 */
		protected void execUpdRcptIvCol(MCList<MST_RCPT_IV_R> rcptIvL, MCQueryApiBuilder bldr, MST_RCPT_IV_R t) {
			bldr.removeSet(
					MST_RCPT_IV_R.$sppl_cd,
					MST_RCPT_IV_R.$in_to_id_typ,
					MST_RCPT_IV_R.$in_to_id_cd,
					MST_RCPT_IV_R.$in_to_id_nm,
					MST_RCPT_IV_R.$in_to_zip_cd,
					MST_RCPT_IV_R.$in_to_addr1,
					MST_RCPT_IV_R.$in_to_addr2,
					MST_RCPT_IV_R.$in_to_addr3,
					MST_RCPT_IV_R.$in_to_addr4,
					MST_RCPT_IV_R.$in_to_cntct_dpt,
					MST_RCPT_IV_R.$in_to_cntct_psn,
					MST_RCPT_IV_R.$in_to_tel,
					MST_RCPT_IV_R.$in_to_fax,
					MST_RCPT_IV_R.$in_to_cntry_cd,
					MST_RCPT_IV_R.$in_to_sundry_flg,
					MST_RCPT_IV_R.$trd_cur_cd,
					MST_RCPT_IV_R.$ptax_cur_cd);
		}
		
		/**
		 * 更新しない項目を設定する(受領インボイス明細)
		 */
		protected void execUpdrcptIvDCol(MCList<MST_RCPT_IV_D_R> rcptIvDL, MCQueryApiBuilder bldr, MST_RCPT_IV_D_R t) {
			bldr.removeSet(
					MST_RCPT_IV_D_R.$ref_dlv_inst_d_no,
					MST_RCPT_IV_D_R.$ref_prms_rcpt_d_no);
		}
	}
	
	/**
	 * RcptIv_Del01オペレーション.<p>
	 *
	 * インボイスを更新する。<br>
	 */
	public class RcptIv_Del01 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			removeByCache(up0(), up1());
			
			callPurcSchdSrv(up0(), up1());
			
			setBfrRcptIvD(up0());
			
			setBfrRcptIvMap(up0());
			
			delRcptIv();
			
			delIv();
			
			callArrSchdUpdSrv(up0(), up1(), null, false);
			
			callPurcIoSchdRegSrv(up0(), up1(), _bfrMapL);
			
			callAprvSrvForDel(up0(), up1());
			
			callSloStsUpdSrv(up0(), up1(), this);
			
			callCredUpd(up0(), _bfrDtlL, up1());
			
			updPurcSchdDt();
			
			setDown();
		}
		
		/**
		 * 受領インボイスを削除する
		 */
		protected void delRcptIv() {
			// 上り電文をソート
			up0().sort(RcptIv_Chk01_HdrR.$peg_no);
			up1().sort(RcptIv_Chk01_DtlR.$hdr_peg_no);
			
			// 受領インボイスマップ
			delRcptIvMap();
			
			MST_RCPT_IV_R t2 = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder delR_bldr = MCQueryApiBuilder.create(t2);
			dbDeleteKey("MSBEL5740_MST_RCPT_IV_D01", up0(), delR_bldr);
			
			MST_RCPT_IV_D_R t1 = MST_RCPT_IV_D_R.create("T");
			execDbDelete("MSBEL5740_MST_RCPT_IV_D_D02", t1, t1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")), up1());
			
			MCList<MST_RCPT_IV_R> delHdrL = MCList.create(MST_RCPT_IV_R.class);
			for (RcptIv_Chk01_HdrR r : up0()) {
				MST_RCPT_IV_R ivR = delHdrL.add();
				MCRow.copyall(ivR, r.iv());
			}
			
			// 改訂履歴データ更新サービス呼出（受領インボイス改訂履歴テーブル更新）
			callRevDataServiceIns01(delHdrL);
		}
		/**
		 * 受領インボイスマップを削除する
		 */
		protected void delRcptIvMap() {
			MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
			MST_RCPT_IV_D_R w1 = MST_RCPT_IV_D_R.create("W1");
			execDbDelete(
				"MSBEL5740_MST_RCPT_IV_MAP_D04",
				t1,
				t1.rcpt_iv_d_no.in(
					subQuery()
					.select(w1.rcpt_iv_d_no)
					.from(w1)
					.where(w1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
				),
				up0()
			);
		}
		
		/**
		 * インボイスを削除する
		 */
		protected void delIv() {
			for (RcptIv_Chk01_HdrR hdrR : up0()) {
				if (isDdlv(hdrR)) {
					callExIvDelSrv(hdrR);
				}
			}
		}
		
		/**
		 * 仕入予定の仕入予定日更新<br>
		 * 仕入予定：受領インボイス＝１：Ｎの場合、取消対象でない受領インボイスの仕入予定日で更新する
		 */
		protected void updPurcSchdDt() {
			// 取消時２回目の入荷予定サービス呼出前にチェックを呼び出す（キャッシュ取得用）
			callArrSchdChkSrv(up0(), up1(), null, true);
			callArrSchdUpdSrv(up0(), up1(), null, true);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	
	/**
	 * 仕入直送か判定する
	 */
	protected boolean isDdlv(RcptIv_Chk01_HdrR hdrR){
		return hdrR.cst_iv_flg() && MSC_IN_TO_ID_TYP.isSCST(hdrR.in_to_id_typ());
	}
	
	/**
	 * 仕入完了か判定する
	 */
	protected boolean isPurcCmpl(RcptIv_Chk01_HdrR hdrR, MCList<RcptIv_Chk01_DtlR> dtlL) {
		// 確定オンの場合は仕入完了オン
		if (hdrR.fix_flg()) {
			return true;
		}
		// 削除行を除く明細すべて仕入対象外の場合は仕入完了オン
		MCList<RcptIv_Chk01_DtlR> exceptDelL = dtlL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())); 
		return exceptDelL.size() == exceptDelL.subList(r -> r.non_purc_flg()).size();
	}
	
	/**
	 * 債務使用対象か判定する
	 */
	protected boolean isCredTgt() {
		if (getCo().ap_no_use_flg()) {
			return false;
		}
		return true;
	}
	
	/**
	 * 非在庫品か判定する
	 */
	protected boolean isNotMng(RcptIv_Chk01_DtlR dtlR) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())
				&& MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 計画外か判定する
	 */
	protected boolean isUplnd(RcptIv_Chk01_HdrR hdrR){
		// 受領インボイス作成元区分「仕入」の場合、計画外
		return MSC_RCPT_IV_SRC_TYP.isPURC(hdrR.rcpt_iv_src_typ());
	}
	
	/**
	 * 与信更新を仕入実績登録サービスで実行するか判定する
	 */
	protected boolean isCredUpdInPurcAct(RcptIv_Chk01_HdrR hdrR, RcptIv_Chk01_DtlR bfrDtlR){
		// 計画外または登録・取消で確定オンまたは訂正で確定オン→オンの場合は仕入実績登録サービスで更新
		return isUplnd(hdrR)
				|| (!MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && hdrR.fix_flg())
				|| (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						&& bfrDtlR.getBoolean("purc_cmpl_flg") && hdrR.fix_flg());
	}
	
	/**
	 * 確定オフ→オンに変更したか判定する
	 */
	protected boolean isCngFix(RcptIv_Chk01_HdrR hdrR, RcptIv_Chk01_DtlR bfrDtlR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
				&& !bfrDtlR.getBoolean("purc_cmpl_flg") && hdrR.fix_flg();
	}
	
	/**
	 * 確定オン→オフに変更したか判定する
	 */
	protected boolean isCngUnFix(RcptIv_Chk01_HdrR hdrR, RcptIv_Chk01_DtlR bfrDtlR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
				&& bfrDtlR.getBoolean("purc_cmpl_flg") && !hdrR.fix_flg();
	}
	
	/**
	 * 確定オン→オンの更新か判定する
	 */
	protected boolean isUpdFix(RcptIv_Chk01_HdrR hdrR, RcptIv_Chk01_DtlR bfrDtlR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
				&& bfrDtlR.getBoolean("purc_cmpl_flg") && hdrR.fix_flg();
	}
	
	/**
	 * 確定オフ→オフの更新か判定する
	 */
	protected boolean isUpdUnFix(RcptIv_Chk01_HdrR hdrR, RcptIv_Chk01_DtlR bfrDtlR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
				&& !bfrDtlR.getBoolean("purc_cmpl_flg") && !hdrR.fix_flg();
	}
	
	/**
	 * インボイスが本登録済か判定する
	 */
	protected boolean isRegIv(RcptIv_Chk01_HdrR hdrR){
		return isRegIv(hdrR.rcpt_iv_mng_no());
	}
	protected boolean isRegIv(String rcptIvMngNo){
		MCList<MST_IV_R> ivL = getCacheIv(rcptIvMngNo);
		if (!isNull(ivL) && ivL.size() > 0) {
			return true;
		}
		return false;
	}
	
	protected boolean isArrSchdRFree(ArrSchd_DtlR asR) {
		return isNullAnd(asR.prms_rcpt_d_no(), asR.dlv_inst_d_no());
	}
	
	protected void setLotNo(ArrSchd_DtlR asR, MCList<MST_ARR_PR_R> orgArrPrL, MCIndexKey arrPrIdx) {
		if (isNull(asR.mfg_inst_no())) {
			asR.lot_no(null);
			asR.sublot_no(null);
		}
		MST_ARR_PR_R orgApR = orgArrPrL.getFirst(arrPrIdx, asR.arr_pr_no());
		asR.bp_lot_no(orgApR.getStringNE("po_bp_lot_no"));
	}
	
	/**
	 * 上り電文をキャッシュ情報で置き換える
	 */
	protected void removeByCache(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		removeByCache(hdrL, dtlL, MCList.create(RcptIv_Chk01_MapR.class));
	}
	protected void removeByCache(
			MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL, MCList<RcptIv_Chk01_MapR> mapL) {
		// 更新前チェックで補完した情報をキャッシュで取得し、上り電文に置き換える
		MCList<RcptIv_Chk01_HdrR> tmpHdrL = MCList.create(RcptIv_Chk01_HdrR.class);
		MCList<RcptIv_Chk01_DtlR> tmpDtlL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCList<RcptIv_Chk01_MapR> tmpMapL = MCList.create(RcptIv_Chk01_MapR.class);
		
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			RcptIv_Chk01_HdrR tmp = getHdrCache(hdrR.peg_no());
			tmpHdrL.add(tmp);
		}
		hdrL.removeAll(hdrL);
		hdrL.addAll(tmpHdrL);
		
		for (RcptIv_Chk01_DtlR dtlR : dtlL) {
			RcptIv_Chk01_DtlR tmp = getDtlCache(dtlR.peg_no());
			tmpDtlL.add(tmp);
		}
		dtlL.removeAll(dtlL);
		dtlL.addAll(tmpDtlL);
		
		for (RcptIv_Chk01_MapR mapR : mapL) {
			RcptIv_Chk01_MapR tmp = getMapCache(mapR.peg_no());
			tmpMapL.add(tmp);
		}
		mapL.removeAll(mapL);
		mapL.addAll(tmpMapL);
	}
	
	/**
	 * 更新前の受領インボイス明細を退避する（与信更新に使用する）
	 */
	protected void setBfrRcptIvD(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_bfrDtlL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCList<MST_RCPT_IV_D_R> dbc = MCList.create(MST_RCPT_IV_D_R.class);
		MST_RCPT_IV_D_R t1 = MST_RCPT_IV_D_R.create("T1");
		MST_RCPT_IV_R t2 = MST_RCPT_IV_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
		_bfrDtlL.addBooleanColumn("purc_cmpl_flg");
		dbc.addBooleanColumn("purc_cmpl_flg");
		dbc_bldr.addSelect(t2.purc_cmpl_flg);
		dbc_bldr.addInnerJoin(t2, bracket(t1.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no)));
		dbc_bldr.addWhereWithAnd(t1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
		dbSelect("MSBEL5740_MST_RCPT_IV_D_S02", dbc, dbc_bldr, hdrL);
		dbc.forEach(r -> {
			_bfrDtlL.add().ivd(r);
			_bfrDtlL.setBooleanNE("purc_cmpl_flg", r.getBooleanNE("purc_cmpl_flg"));
		});
	}
	
	/**
	 * 更新前の受領インボイスマップを退避する（受払予定更新に使用する）
	 */
	protected void setBfrRcptIvMap(MCList<RcptIv_Chk01_HdrR> hdrL) {
		_bfrMapL = MCList.create(RcptIv_Chk01_MapR.class);
		MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
		MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
		dbc_bldr.addLeftOuterJoin(t2, t2.rcpt_iv_d_no.eq(t1.rcpt_iv_d_no));
		dbc_bldr.addWhereWithAnd(t2.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
		dbSelect("MSBEL5740_MST_RCPT_IV_MAP_S03", _bfrMapL, dbc_bldr, hdrL);
	}
	
	/**
	 * データ更新区分が新規・更新のデータを取得する
	 */
	protected MCList<RcptIv_Chk01_DtlR> getInsUpdL(MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> retL = dtlL.createInstance();
		for (RcptIv_Chk01_DtlR retR : dtlL) {
			if (MAC_DATA_CRUD_TYP.isCRT(retR.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(retR.data_crud_typ())) {
				retL.add(retR);
			}
		}
		return retL;
	}
	
	/**
	 * 非在庫品の仕入諸掛追加データを取得する
	 */
	protected MCList<RcptIv_Chk01_DtlR> getNotMngAddL(MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> retL = dtlL.createInstance();
		for (RcptIv_Chk01_DtlR retR : dtlL) {
			if (retR.manual_add_flg() && isNotMng(retR)) {
				retL.add(retR);
			}
		}
		return retL;
	}
	
	/**
	 * 発注ありデータを取得する
	 */
	protected MCList<RcptIv_Chk01_DtlR> getPlndL(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> retL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCIndexKey dtlIdx = dtlL.createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			if (!isUplnd(hdrR)) {
				retL.addAll(dtlL.subList(dtlIdx, hdrR.peg_no()));
			}
		}
		return retL;
	}
	
	/**
	 * 確定オフのデータを取得する
	 */
	protected MCList<RcptIv_Chk01_DtlR> getUnFixL(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> retL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCIndexKey dtlIdx = dtlL.createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			if (!hdrR.fix_flg()) {
				retL.addAll(dtlL.subList(dtlIdx, hdrR.peg_no()));
			}
		}
		return retL;
	}
	
	/**
	 * 仕入予定サービス<br>
	 * マニュアル追加した仕入予定を登録する
	 */
	protected void callPurcSchdSrv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> plndL = getPlndL(hdrL, dtlL);
		MCList<RcptIv_Chk01_DtlR> tgtL = getNotMngAddL(plndL);
		if (tgtL.isEmpty()) {
			return;
		}
		MSBDL_PurcSchdRegService.PurcSchd_Upd01 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Upd01();
		setAll(ope.up0(), tgtL, createMap_PurcSchd_DtlR_RcptIv_Chk01_DtlR());
		ope.exec();
		
		copyByPegNo(
			dtlL, new String[]{RcptIv_Chk01_DtlR.$purc_schd_no},
			ope.down0(), new String[]{PurcSchd_DtlR.$purc_schd_no});
	}
	
	/**
	 * インボイススイッチサービス<br>
	 * インボイススイッチを登録する
	 */
	protected void callExIvUpdSrv(RcptIv_Chk01_HdrR hdrR, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MSBEL_ExIvService.ExIv_Upd01 ope = MSBEL_ExIvService.crtExIv_Upd01();
		copyValue(ope.up0(), hdrR, createMapUpd_ExIv_HdrR_RcptIv_Chk01_HdrR());
		addAll(ope.up1(), dtlL, createMap_MST_IV_D_R_RcptIv_Chk01_DtlR());
		ope.exec();
	}
	
	/**
	 * インボイススイッチサービス<br>
	 * インボイススイッチを削除する
	 */
	protected void callExIvDelSrv(RcptIv_Chk01_HdrR hdrR) {
		MSBEL_ExIvService.ExIv_Del01 ope = MSBEL_ExIvService.crtExIv_Del01();
		copyValue(ope.up0(), hdrR, createMapDel_ExIv_HdrR_RcptIv_Chk01_HdrR());
		ope.exec();
	}
	
	/**
	 * 入荷予定サービスチェックの呼出し
	 */
	protected void callArrSchdChkSrv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL,
			MCList<RcptIv_Chk01_MapR> mapL, boolean isSecondDel) {
		MCList<RcptIv_Chk01_DtlR> plndL = getPlndL(hdrL, dtlL);
		MCList<RcptIv_Chk01_DtlR> tgtL = plndL.subList(r -> !r.manual_add_flg());
		if (tgtL.isEmpty()) {
			return;
		}
		
		MCList<MST_ARR_PR_R> orgArrPrL = srchArrPr(tgtL);
		MCList<MST_ARR_SCHD_R> orgArrSchdL = srchArrSchd(tgtL);
		MCIndexKey apIdx = orgArrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
		
		MSBEL_ArrSchdService.ArrSchd_Chk01 ope = MSBEL_ArrSchdService.crtArrSchd_Chk01();
		ope.up0().setAll(
			makeArrSchdForArrSchdSrv(
				hdrL, tgtL, mapL, orgArrPrL, apIdx, orgArrSchdL, isSecondDel, MCList.create(ArrSchd_DtlR.class)
			)
		);
		
		// チェック用の値を補完
		MCIndexKey dtlIdx = tgtL.createIndex(RcptIv_Chk01_DtlR.$arr_pr_no);
		MCIndexKey hdrIdx = hdrL.createIndex(RcptIv_Chk01_HdrR.$peg_no);
		for (ArrSchd_DtlR r : ope.up0()) {
			RcptIv_Chk01_DtlR dtlR = tgtL.getFirst(dtlIdx, r.arr_pr_no());
			RcptIv_Chk01_HdrR hdrR = hdrL.getFirst(hdrIdx, dtlR.hdr_peg_no()); 
			
			r.trd_cd(dtlR.trd_cd());
			r.trd_ptn_typ(dtlR.trd_ptn_typ());
			r.xrate(hdrR.xrate());
			r.ptax_xrate(hdrR.ptax_xrate());
			r.trd_cur_cd(hdrR.trd_cur_cd());
			r.tax_cd(dtlR.tax_cd());
			r.trd_cur_upri(dtlR.trd_cur_upri());
		}
		ope.exec();
		copyErrFlg(dtlL, ope.down0());
	}
	
	/**
	 * 入荷予定サービス<br>
	 * 入荷予定・入荷進捗を更新する
	 */
	protected void callArrSchdUpdSrv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL,
			MCList<RcptIv_Chk01_MapR> mapL, boolean isSecondDel) {
		MCList<RcptIv_Chk01_DtlR> tgtL = getPlndL(hdrL, dtlL);
		if (tgtL.isEmpty()) {
			return;
		}
		
		MCList<MST_ARR_PR_R> orgArrPrL = srchArrPr(tgtL);
		MCList<MST_ARR_SCHD_R> orgArrSchdL = srchArrSchd(tgtL);
		MCIndexKey arrPrIdx = orgArrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
		MCList<ArrSchd_DtlR> abortL = MCList.create(ArrSchd_DtlR.class);
		
		MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		ope.up1().setAll(
			makeArrSchdForArrSchdSrv(
				hdrL, tgtL, mapL, orgArrPrL, arrPrIdx, orgArrSchdL, isSecondDel, abortL
			)
		);
		ope.up0().setAll(makeArrPrForArrSchdSrv(ope.up1(), orgArrPrL, arrPrIdx));
		ope.exec();
		// 予定打切分の入荷予定サービスを実行
		callArrSchdUpdSrv4Abort(abortL, ope);
	}
	protected void callArrSchdUpdSrv4Abort(MCList<ArrSchd_DtlR> abortL, MSBEL_ArrSchdService.ArrSchd_Upd01 ope) {
		if (abortL.isEmpty()) {
			return;
		}
		// 受領インボイス作成元区分「入荷予定」で打切がある場合、分割先の入荷予定を打ち切る
		 copyByPegNo(
			abortL, ope.down0(),
			ArrSchd_DtlR.$peg_d_no, new String[]{ArrSchd_DtlR.$arr_schd_no},
			ArrSchd_DtlR.$peg_d_no, new String[]{ArrSchd_DtlR.$arr_schd_no}
		);
		abortL.forEach(r -> {
			r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			r.abort_flg(true);
		});
		
		MSBEL_ArrSchdService.ArrSchd_Upd01 upd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		upd01.up1().setAll(abortL);
		abortL.groupBy(ArrSchd_DtlR.$peg_no).forEach(r -> {
			upd01.up0().add(ope.up0().getFirst(ArrPr_DtlR.$peg_no, r.peg_no()));
		});
		
		// 事前にチェック処理を実行（呼ばないとキャッシュ等が取得できずエラーになるので）
		MSBEL_ArrSchdService.ArrSchd_Chk01 chk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
		chk01.up0().setAll(upd01.up1());
		chk01.exec();
		throwUpdErr();
		
		// 予定を打ち切る
		upd01.exec();
	}
	
	/**
	 * 入荷予定サービスの電文(up1)を作成する
	 */
	protected MCList<ArrSchd_DtlR> makeArrSchdForArrSchdSrv(
			MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL, MCList<RcptIv_Chk01_MapR> mapL,
			MCList<MST_ARR_PR_R> orgArrPrL, MCIndexKey apIdx, MCList<MST_ARR_SCHD_R> orgArrSchdL,
			boolean isSecondDel, MCList<ArrSchd_DtlR> abortL) {
		MCList<ArrSchd_DtlR> arrSchdL = MCList.create(ArrSchd_DtlR.class);
		arrSchdL.addBooleanColumn("org_sync_flg");
		MCIndexKey dtlIdx = dtlL.createIndex(RcptIv_Chk01_DtlR.$arr_schd_no);
		MCIndexKey hdrIdx = hdrL.createIndex(RcptIv_Chk01_HdrR.$peg_no);
		MCIndexKey asIdx = orgArrSchdL.createIndex(MST_ARR_SCHD_R.$arr_pr_no, MST_ARR_SCHD_R.$dlv_inst_d_no, MST_ARR_SCHD_R.$prms_rcpt_d_no);
		
		for (MST_ARR_SCHD_R orgAsR : orgArrSchdL) {
			MST_ARR_PR_R orgApR = orgArrPrL.getFirst(apIdx, orgAsR.arr_pr_no());
			
			ArrSchd_DtlR asR = arrSchdL.add();
			asR.arr_schd(orgAsR);
			asR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			asR.peg_no(orgApR.getNumberNE("peg_no"));	// 入荷進捗ごと
			asR.no_cred_upd_flg(true);		// 与信更新しない（発注に紐付く分は金額が変わらないので）
			asR.setStringNE(_$org_trd_unit_cd, orgAsR.getStringNE(_$org_trd_unit_cd));
			asR.is_src_rcptivreg_srv_flg(true);
			
			RcptIv_Chk01_DtlR dtlR = dtlL.getFirst(dtlIdx, orgAsR.arr_schd_no());
			if (isNull(dtlR)) {
				asR.purc_schd_no(orgAsR.getStringNE("purc_schd_no"));
				asR.accpt_schd_dt(orgAsR.getDateNE("purc_schd_dt"));
				if (isRegIv(asR.rcpt_iv_mng_no())) {
					// 処理対象外の入荷予定のうち、インボイス本登録済分はサービス呼出対象外
					arrSchdL.remove(asR);
				}
				continue;
			}
			
			RcptIv_Chk01_HdrR hdrR = hdrL.getFirst(hdrIdx, dtlR.hdr_peg_no());
			// 更新でインボイス本登録済の場合はサービス呼出対象外（入荷予定関連項目は画面で入力制御）
			if (isDdlv(hdrR) && MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && isRegIv(hdrR)) {
				arrSchdL.remove(asR);
				continue;
			}
			asR.purc_schd_no(dtlR.purc_schd_no());
			asR.setBooleanNE("org_sync_flg", dtlR.sync_flg());
			MCDate maxPurcSchdDt = getMaxPurcSchdDt(dtlR);
			if (hdrR.fix_flg()) {
				asR.accpt_schd_dt(orgAsR.getDateNE("purc_schd_dt"));
			}
			else if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
				asR.accpt_schd_dt(hdrR.purc_schd_dt());
			}
			else {
				if (isCompRcptIv(orgAsR, dtlR, mapL)) {
					asR.accpt_schd_dt(getMaxDt(hdrR.purc_schd_dt(), maxPurcSchdDt));
				}
				else {
					ArrSchd_DtlR toR = asR.clone();
					setOrgArrSchd(toR, orgApR, orgAsR);
					asR.accpt_schd_dt(getMaxDt(hdrR.purc_schd_dt(), maxPurcSchdDt, toR.accpt_schd_dt()));
				}
			}
			
			setDlvInstPrmsRcpt(asR, orgApR, orgAsR);
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				asR.rcpt_iv_no(null);
				asR.rcpt_iv_mng_no(null);
				setOrgArrSchd(asR, orgApR, orgAsR);
				// 取消時１回目の入荷予定サービスは発注時の仕入予定日で更新
				// 取消時２回目の入荷予定サービスは取消対象以外の最大仕入予定日で更新
				// （仕入予定：受領インボイス＝１：Ｎの場合、
				//   取消対象の受払予定は発注時の仕入予定日で更新し、仕入予定は最大日付）
				if (isSecondDel) {
					asR.accpt_schd_dt(getMaxDt(maxPurcSchdDt, asR.accpt_schd_dt()));
				}
			}
			else {
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
					asR.rcpt_iv_no(hdrR.rcpt_iv_no());
					asR.rcpt_iv_mng_no(hdrR.rcpt_iv_mng_no());
				}
				else {
					asR.rcpt_iv_no(null);
					asR.rcpt_iv_mng_no(null);
				}
				asR.arr_ptn_typ(getArrPtnTyp(asR));
				asR.sync_flg(getSyncFlg(asR, orgApR, orgAsR));
				// 更新対象以外に未入荷・未仕入のフリーな予定数を取得
				// 更新対象の予定数とフリーな予定数を合算してインボイス数と一致する場合、予定をまとめる
				// （予定数未満で登録して予定分割後、元の予定数に戻した場合など）
				MCList<MST_ARR_SCHD_R> asSubL = orgArrSchdL.subList(asIdx, orgAsR.arr_pr_no(), orgAsR.dlv_inst_d_no(), orgAsR.prms_rcpt_d_no());
				MCNumber freeSchdQty = MCNumber.ZERO;
				for (MST_ARR_SCHD_R asSubR : asSubL) {
					if (!isSame(asSubR.arr_schd_no(), dtlR.arr_schd_no())) {
						if (isNull(asSubR.arr_qty()) || asSubR.arr_qty().isZero()
							&& (isNull(asSubR.purc_qty()) || asSubR.purc_qty().isZero())) {
							freeSchdQty = freeSchdQty.add(nvl(asSubR.base_unit_qty(), MCNumber.ZERO));
						}
					}
				}
				MCNumber qty = asR.base_unit_qty().subtract(dtlR.base_unit_qty());
				// 数量に差があり、受領インボイス作成元区分「入荷予定」
				if ((qty.isPositive() || qty.isNegative() && qty.add(freeSchdQty).isZero())
					&& MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {

					ArrSchd_DtlR toR = asR.clone();

					// 分割元
					asR.trd_unit_cd(dtlR.trd_unit_cd());
					asR.trd_unit_qty(dtlR.trd_unit_qty());
					asR.base_unit_qty(
						convToBaseUnit(dtlR.trd_unit_qty(),
							dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
							dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ())
					);
					
					// 分割先
					toR.base_unit_qty(qty);
					toR.trd_unit_cd(asR.getStringNE(_$org_trd_unit_cd));
					// 取引単数量は後続のまとめ処理で設定されるので、ここでは設定しない
					toR.trd_unit_qty(null);
					toR.arr_schd_no(null);
					toR.purc_schd_no(null);
					toR.rcpt_iv_no(null);
					toR.rcpt_iv_mng_no(null);
					toR.arr_qty(0);
					// 発注明細の値に戻す
					setOrgArrSchd(toR, orgApR);
					toR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					toR.pr_sts_typ(MSC_PR_STS_TYP.NOT_ARR.value());
					// 納入指示明細ＮＯ、納期回答受領明細ＮＯをクリア
					clearOrgArrAchd(toR);
					
					arrSchdL.add(toR);
					
					// 打切対象に追加
					if (shouldAbortRemainingQuantity(dtlR, asR)) {
						asR.abort_qty(asR.abort_qty().subtract(qty));
						asR.abort_flg(asR.abort_qty().isPositive());
						toR.abort_qty(qty); 
						
						// 受領インボイス作成元区分「入荷予定」の場合、分割先の入荷予定を打ち切る（予定打切）
						// 受領インボイス作成元区分「入荷実績」の場合、入荷実績に対応する入荷予定を打ち切る（残数打切）
						// ※残数打切は仕入実績サービス経由で行うので、ここでは何もしない
						abortL.add(toR);
					}
				}
				// 数量に差がない場合や受領インボイス作成元区分「入荷実績」の場合、
				// 入荷予定数は変更しないが入荷進捗の受領インボイス数は変更するために受領インボイス数量を保持
				else {
					if (qty.isZero() && MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
						// 数量に差がないかつ「入荷予定」の時は、単位変更を踏まえ上り電文の値を設定する
						asR.trd_unit_cd(dtlR.trd_unit_cd());
						asR.trd_unit_qty(dtlR.trd_unit_qty());
					}
				}
			}
		}
		
		// マスタ取得（単位変換用）
		initDbcForArrSchd(arrSchdL);
		
		// 同じキーでかつ、以下の条件を満たす入荷予定はまとめる
		// ・ 受領インボイスが未登録
		// ・ 未入荷（同時計上オフ）
		// ・ 既存の打ち切りでない
		for (MCList<ArrSchd_DtlR> lst : getArrSchdGrpList(getArrSchdGrpKey(false), arrSchdL, abortL)) {
			lst = lst.subList(r -> 
				isNull(r.rcpt_iv_no())
				 && ((r.arr_qty().isZero() && !r.getBooleanNE("org_sync_flg")) 
						 || r.getBooleanNE("org_sync_flg"))
				 && (r.abort_qty().isZero() || MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) // 新規作成(CRT)時は打切フラグに関わらず、一旦まとめ対象に含める
			);
			if (lst.size() <= 0) {	// 単位調整するので1件でも後続処理の対象にする
				continue;
			}
			
			lst.sort(SortType.ASC, ArrSchd_DtlR.$arr_schd_no);
			
			// 先頭の入荷予定にまとめる
			ArrSchd_DtlR asR = lst.get(0);
			if (isNull(asR.data_crud_typ())) {
				// 更新対象ではなかったが、まとめる側になったのでデータ更新区分を設定する
				asR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (isArrSchdRFree(asR)) {
				setLotNo(asR, orgArrPrL, apIdx);
			}
			
			for (int i=1; i<lst.size(); i++) {
				ArrSchd_DtlR r = lst.get(i);
				
				// まとめる側に加算する
				asR.base_unit_qty(asR.base_unit_qty().add(r.base_unit_qty()));
				
				// まとめられる側は削除
				if (!isNull(r.arr_schd_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(null);
				}
			}
			
			// 数量を増やした結果、未割当の予定数がなくなった場合は削除する
			if (asR.base_unit_qty().isZero()) {
				if (!isNull(asR.arr_schd_no())) {
					asR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					asR.data_crud_typ(null);
				}
			}
			
			// まとめた分の単位を調整する（発注明細、納入指示明細、納期回答受領明細のいずれかの単位に変換）
			String convUnitCd = asR.getStringNE(_$org_trd_unit_cd);
			MCNumber convQty = convBaseToTrdUnitQty(asR, convUnitCd);
			if (isNull(convQty)) {
				asR.trd_unit_cd(asR.base_unit_cd());
				asR.trd_unit_qty(asR.base_unit_qty());
			}
			else {
				asR.trd_unit_cd(convUnitCd);
				asR.trd_unit_qty(convQty);
			}
		}
		
		// 取消時１回目の入荷予定サービスで削除済のため、取消時２回目は削除データは除外
		if (isSecondDel) {
			arrSchdL = arrSchdL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
		}
		
		// 入荷予定ごと
		setPegNo(ArrSchd_DtlR.$peg_d_no, arrSchdL);
		
		return arrSchdL;
	}
	
	/**
	 * 残数を打ち切る対象かどうかを判定する。</p>
	 * 明細で明示的に打切が指定、または分割元が打切の場合
	 * 未割り当ての残数予定を自動的に打ち切るため true を返す。
	 */
	private boolean shouldAbortRemainingQuantity(RcptIv_Chk01_DtlR detail, ArrSchd_DtlR asR) {
		return detail.abort_flg() || asR.abort_flg();
	}
	
	/**
	 * 入荷予定の基準単位数量を戻すべき単位（発注明細、納入指示明細、納期回答受領明細のいずれかの単位）に変換する
	 */
	protected MCNumber convBaseToTrdUnitQty(ArrSchd_DtlR asR, String convUnitCd) {
		MAM_ITM_R itmR = _cacheItmForArrSchd.get(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3());
		MAVM_ITM_UNIT_R itmUnitR = _cacheItmUnitForArrSchd.get(asR.itm_cd(), asR.itm_sub1(),
				asR.itm_sub2(), asR.itm_sub3(), convUnitCd);
		
		MCNumber convQty = rvrsBaseUnitConv(
				asR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
				itmUnitR.dec_place(), itmUnitR.rnd_typ());
		MCNumber reEntQty = convToBaseUnit(
				convQty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
				itmR.dec_place(), itmR.rnd_typ());
		
		if (!isSame(reEntQty, asR.base_unit_qty())) {
			return null;
		}
		else {
			return convQty;
		}
	}
	
	/**
	 * 入荷予定サービスの電文(up0)を作成する<br>
	 */
	protected MCList<ArrPr_DtlR> makeArrPrForArrSchdSrv(
			MCList<ArrSchd_DtlR> arrSchdL, MCList<MST_ARR_PR_R> orgArrPrL, MCIndexKey apIdx) {
		MCList<ArrPr_DtlR> arrPrL = MCList.create(ArrPr_DtlR.class);
		
		for (MCList<ArrSchd_DtlR> lst : arrSchdL.groupList(ArrSchd_DtlR.$arr_pr_no)) {
			ArrSchd_DtlR r = lst.get(0);
			
			ArrPr_DtlR apR = arrPrL.add();
			apR.arr_pr(orgArrPrL.getFirst(apIdx, r.arr_pr_no()));
			apR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			apR.peg_no(r.peg_no());
		}
		
		// まとめる側にならなかった、もしくはcloneしたがまとめられる側になった入荷予定は対象外とする
		// ※入荷進捗の持つ受領インボイス数の計算に必要なので、ここで対象から除外する
		arrSchdL.removeAll(arrSchdL.subList(r -> isNull(r.data_crud_typ())));
		
		return arrPrL;
	}
	
	/**
	 * 購買受払予定サービス<br>
	 * 入荷済みの受払予定に対して仕入予定日を反映する<br>
	 * ※入荷済みの分は、入荷予定サービスからは更新されないので自らサービスを呼び出しして更新する
	 */
	protected void callPurcIoSchdRegSrv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL, MCList<RcptIv_Chk01_MapR> mapL) {
		MCList<RcptIv_Chk01_DtlR> unFixL = getUnFixL(hdrL, dtlL);
		MCList<MST_ARR_ACT_R> tgtL = getPurcIoSchdTgtL(unFixL, mapL);
		if (tgtL.isEmpty()) {
			return;
		}
		MCList<MST_IO_SCHD_R> ioSchdL = getIoSchd(tgtL);
		if (ioSchdL.isEmpty()) {
			return;
		}
		
		MSBDL_PurcIoSchdRegService.PurcIoSchd_Upd01 o = MSBDL_PurcIoSchdRegService.crtPurcIoSchd_Upd01();
		setAll(o.up0(), ioSchdL, createMap_PurcIoSchd_Upd01_DtlR_MST_IO_SCHD_R());
		o.exec();
	}
	
	protected MCList<MST_ARR_ACT_R> getPurcIoSchdTgtL(MCList<RcptIv_Chk01_DtlR> dtlL, MCList<RcptIv_Chk01_MapR> mapL) {
		MCList<RcptIv_Chk01_DtlR> tgtL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(dtlL);
		MCIndexKey asIdx = arrSchdL.createIndex(RcptIv_Chk01_DtlR.$arr_schd_no);
		
		for (RcptIv_Chk01_DtlR r : dtlL.subList(r -> !isNull(r.arr_schd_no()))) {
			MST_ARR_SCHD_R asR = arrSchdL.getFirst(asIdx, r.arr_schd_no());
			if (asR.arr_qty().isPositive() && asR.purc_qty().isZero()) {	// 入荷済、未仕入
				tgtL.add(r);
			}
		}
		
		MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
		if (!tgtL.isEmpty()) {
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t);
			arrActL_bldr.setSelect(t.arr_act_no);
			arrActL_bldr.addSelect(t.arr_schd_no);
			arrActL_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
			arrActL_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL5740_MST_ARR_ACT_S01", arrActL, arrActL_bldr, tgtL, null);
		}
		
		if (isNull(mapL)) {
			return arrActL;
		}
		
		// 受領インボイスマップと一致する入荷実績のみ取得
		// 受領インボイスを登録しない受払予定は更新をしない
		MCList<MST_ARR_ACT_R> mapArrActL = MCList.create(MST_ARR_ACT_R.class);
		for (MST_ARR_ACT_R arrActR : arrActL) {
			for (RcptIv_Chk01_MapR mapR : mapL) {
				if ((!isNullOrNullVal(mapR.arr_act_no()) && isSame(mapR.arr_act_no(), arrActR.arr_act_no()))
						|| (!isNullOrNullVal(mapR.arr_schd_no()) && isSame(mapR.arr_schd_no(), arrActR.arr_schd_no()))) {
					mapArrActL.add(arrActR);
				}
			}
		}
		
		return mapArrActL;
	}
	
	protected MCList<MST_IO_SCHD_R> getIoSchd(MCList<MST_ARR_ACT_R> tgtL) {
		// 仕入出庫、仕入出庫(支給)のいずれかに該当する受払予定を取得する
		MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
		MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
		MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(t);
		ioSchdL_bldr.setWhere(t.io_schd_no.eq(bind("arr_act_no")));
		ioSchdL_bldr.addConstWhereWithAnd(t.io_schd_typ
				.in(value(MSC_IO_SCHD_TYP.PURC_GI.value()),
						value(MSC_IO_SCHD_TYP.PURC_GI_PROV.value()))
				.and(t.io_schd_sts_typ.in(value(MSC_IO_SCHD_STS_TYP.ARR.value()),
						value(MSC_IO_SCHD_STS_TYP.INSP.value()))));
		dbSelect("MSBEL5740_MST_IO_SCHD_S01", ioSchdL, ioSchdL_bldr, tgtL, null);
		return ioSchdL;
	}
	
	/**
	 * 承認提供サービス.承認次処理済更新
	 */
	protected void callAprvSrvForIns(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> unFixL = getUnFixL(hdrL, dtlL);
		MBBAL_AprvService.Aprv_Upd02 updOpe = MBBAL_AprvService.crtAprv_Upd02();
		createAprvSrvUpdUp(unFixL, updOpe.up0());
		if (!updOpe.up0().isEmpty()) {
			updOpe.exec();
		}
	}
	
	/**
	 * 承認提供サービス.承認次処理済解除
	 */
	protected void callAprvSrvForDel(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> unFixL = getUnFixL(hdrL, dtlL);
		MBBAL_AprvService.Aprv_Upd03 delOpe = MBBAL_AprvService.crtAprv_Upd03();
		createAprvSrvDelUp(unFixL, delOpe.up0(), false);
		if (!delOpe.up0().isEmpty()) {
			delOpe.exec();
		}
	}
	
	/**
	 * 承認提供サービス.承認次処理済更新<br>
	 * 承認提供サービス.承認次処理済解除
	 */
	protected void callAprvSrvForUpd(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<RcptIv_Chk01_DtlR> unFixL = getUnFixL(hdrL, dtlL);
		MCList<RcptIv_Chk01_DtlR> updL = MCList.create(RcptIv_Chk01_DtlR.class);
		MCList<RcptIv_Chk01_DtlR> delL = MCList.create(RcptIv_Chk01_DtlR.class);
		divUpdDelForAprv(updL, delL, unFixL);
		MBBAL_AprvService.Aprv_Upd03 delOpe = MBBAL_AprvService.crtAprv_Upd03();
		MBBAL_AprvService.Aprv_Upd02 updOpe = MBBAL_AprvService.crtAprv_Upd02();
		createAprvSrvDelUp(delL, delOpe.up0(), false);
		createAprvSrvUpdUp(updL, updOpe.up0());
		
		if (!delOpe.up0().isEmpty()) {
			delOpe.exec();
		}
		if (!updOpe.up0().isEmpty()) {
			updOpe.exec();
		}
	}
	
	protected void createAprvSrvUpdUp(MCList<RcptIv_Chk01_DtlR> dtlL, MCList<Aprv_Chk02_Rslt1R> upL) {
		MCList<RcptIv_Chk01_DtlR> tempL = MCList.create(RcptIv_Chk01_DtlR.class);
		tempL = dtlL.groupBy(RcptIv_Chk01_DtlR.$aprv_no, RcptIv_Chk01_DtlR.$po_no);
		for (RcptIv_Chk01_DtlR r : tempL) {
			if (isNull(r.aprv_no())) {
				continue;
			}
			Aprv_Chk02_Rslt1R updR = Aprv_Chk02_Rslt1R.create();
			updR.aprv_no(r.aprv_no());
			upL.add(updR);
		}
	}
	
	protected void createAprvSrvDelUp(MCList<RcptIv_Chk01_DtlR> dtlL, MCList<Aprv_Chk02_Rslt1R> upL, boolean check) {
		MCList<RcptIv_Chk01_DtlR> tempL = MCList.create(RcptIv_Chk01_DtlR.class);
		tempL = dtlL.groupBy(RcptIv_Chk01_DtlR.$aprv_no, RcptIv_Chk01_DtlR.$po_no);
		for (RcptIv_Chk01_DtlR r : tempL) {
			if (isNull(r.aprv_no())) {
				continue;
			}
			if (!MSBDL_PurcUtil.isAprvNextOpr(r.po_no(), null) || check) {
				Aprv_Chk02_Rslt1R delR = Aprv_Chk02_Rslt1R.create();
				delR.aprv_no(r.aprv_no());
				upL.add(delR);
			}
		}
	}
	
	protected void divUpdDelForAprv(MCList<RcptIv_Chk01_DtlR> updL, MCList<RcptIv_Chk01_DtlR> delL, MCList<RcptIv_Chk01_DtlR> dtlL) {
		for (RcptIv_Chk01_DtlR r : dtlL) {
			// 削除行
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				delL.add(r);
			}
			else {
				updL.add(r);
			}
		}
	}
	
	/**
	 * 受注状況更新サービス<br>
	 * 受注状況を更新する
	 */
	protected void callSloStsUpdSrv(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> dtlL, MCOperation srcOpe) {
		MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
		
		Map_SloStsForIns<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> mprIns = createMapSloStsForIns();
		Map_SloStsForUpd<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> mprUpd = createMapSloStsForUpd();
		Map_SloStsForDel<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> mprDel = createMapSloStsForDel();
		
		MCIndexKey hdrIdx = hdrL.createIndex(RcptIv_Chk01_HdrR.$peg_no);
		for (RcptIv_Chk01_DtlR dtlR : dtlL) {
			if (isNull(dtlR.slo_d_no()) || dtlR.rqst_can_flg()) {
				continue;
			}
			
			// ヘッダ情報取得
			RcptIv_Chk01_HdrR hdrR = hdrL.getFirst(hdrIdx, dtlR.hdr_peg_no());
			mprIns.setWith(hdrR);
			mprUpd.setWith(hdrR);
			mprDel.setWith(hdrR);
			
			SloSts_DtlR sloR = SloSts_DtlR.create();
			// ヘッダ新規の場合、全行新規
			// ヘッダ取消の場合、全行取消
			// ヘッダ訂正の場合、行ステータスに従う
			if (srcOpe instanceof RcptIv_Ins01){
				copy(sloR, dtlR, mprIns);
				ope.up0().add(sloR);
			}
			else if (srcOpe instanceof RcptIv_Del01){
				copy(sloR, dtlR, mprDel);
				ope.up0().add(sloR);
			}
			else if (isSame(MCRow.Status.CREATE, dtlR.getStatus())) {
				copy(sloR, dtlR, mprIns);
				ope.up0().add(sloR);
			}
			else if (isSame(MCRow.Status.MODIFY, dtlR.getStatus()) || isSame(MCRow.Status.NONE, dtlR.getStatus())) {
				if (!isNull(hdrR.old_rcpt_iv_no()) && !isSame(hdrR.old_rcpt_iv_no(), hdrR.rcpt_iv_no())) {
					//訂正でインボイスNOに変更があった場合のみ、削除→新規の2行で実行する
					//取消
					copy(sloR, dtlR, mprDel);
					ope.up0().add(sloR);
					//新規
					SloSts_DtlR sloCrtR = sloR.clone();
					copy(sloCrtR, dtlR, mprIns);
					ope.up0().add(sloCrtR);
				}
				else {
					copy(sloR, dtlR, mprUpd);
					ope.up0().add(sloR);
				}
			}
			else if (isSame(MCRow.Status.DELETE, dtlR.getStatus())) {
				copy(sloR, dtlR, mprDel);
				ope.up0().add(sloR);
			}
		}
		ope.exec();
	}
	
	/**
	 * 与信を更新する<br>
	 * 登録・取消で確定オン、訂正で確定オン→オン：仕入実績登録サービスで更新<br>
	 * 登録・取消で確定オフ、訂正で確定オフ→オフ：受領インボイス登録サービスで更新<br>
	 * 訂正で確定オフ→オン：受領インボイス登録サービスで発注時に戻して、仕入実績サービスで更新<br>
	 * 訂正で確定オン→オフ：仕入実績サービスで発注時に戻して、受領インボイス登録サービスで更新<br>
	 */
	protected void callCredUpd(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> bfrDtlL, MCList<RcptIv_Chk01_DtlR> aftrDtlL) {
		if (!isCredTgt()) {
			return;
		}
		
		// マスタ取得
		initDbcForCredUpd(aftrDtlL);
		
		credUpdForPo(hdrL, bfrDtlL, aftrDtlL);
		
		credUpdForPoBackord(hdrL, bfrDtlL, aftrDtlL);
		
		credUpdForAdd(hdrL, bfrDtlL, aftrDtlL);
	}
	
	/**
	 * 発注引継分の与信を更新する
	 */
	protected void credUpdForPo(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> bfrDtlL, MCList<RcptIv_Chk01_DtlR> aftrDtlL) {
		MCList<MST_PO_D_R> poDL = getPoDL(aftrDtlL);
		MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(aftrDtlL);
		
		MCIndexKey poDIdx = null;
		MCIndexKey asIdx = null;
		MCIndexKey bfrHdrIdx = null;
		MCIndexKey bfrDtlIdx = null;
		MCIndexKey aftrDtlIdx = null;
		
		if (!isNull(poDL)) poDIdx = poDL.createIndex(MST_PO_D_R.$po_d_no);
		if (!isNull(arrSchdL)) asIdx = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
		if (!isNull(bfrDtlL)) bfrHdrIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_mng_no);
		if (!isNull(bfrDtlL)) bfrDtlIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_d_no);
		if (!isNull(aftrDtlL)) aftrDtlIdx = aftrDtlL.createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
		
		MCList<Cred_Upd02_CndR> credCndL = MCList.create(Cred_Upd02_CndR.class);
		
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			RcptIv_Chk01_DtlR bfrHdrR = null;
			if (!isNull(bfrDtlL)) bfrHdrR = bfrDtlL.getFirst(bfrHdrIdx, hdrR.rcpt_iv_mng_no());
			if (isCredUpdInPurcAct(hdrR, bfrHdrR)) {
				continue;
			}
			
			MCNumber poDCredAmtSum = MCNumber.ZERO;
			MCNumber bfrIvCredAmtSum = MCNumber.ZERO;
			MCNumber aftrIvCredAmtSum = MCNumber.ZERO;
			
			MCList<RcptIv_Chk01_DtlR> tmpL = MCList.create(RcptIv_Chk01_DtlR.class);
			MCList<RcptIv_Chk01_DtlR> dtlL = aftrDtlL.subList(aftrDtlIdx, hdrR.peg_no());
			if (isCngFix(hdrR, bfrHdrR)) {
				for (RcptIv_Chk01_DtlR dtlR : dtlL) {
					if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						RcptIv_Chk01_DtlR tmpR = dtlR.clone();
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						tmpL.add(tmpR);
					}
				}
				dtlL.removeAll(dtlL);
				dtlL.addAll(tmpL);
			}
			else if (isCngUnFix(hdrR, bfrHdrR)) {
				for (RcptIv_Chk01_DtlR dtlR : dtlL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						RcptIv_Chk01_DtlR tmpR = dtlR.clone();
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						tmpL.add(tmpR);
					}
				}
				dtlL.removeAll(dtlL);
				dtlL.addAll(tmpL);
			}
			
			for (RcptIv_Chk01_DtlR dtlR : dtlL) {
				if (dtlR.manual_add_flg() || dtlR.non_purc_flg() || isNull(dtlR.po_d_no())) {
					continue;
				}
				
				MST_PO_D_R poDR = poDL.getFirst(poDIdx, dtlR.po_d_no());
				MST_ARR_SCHD_R asR = arrSchdL.getFirst(asIdx, dtlR.arr_schd_no());
				MAM_ITM_R itmR = _cacheItmForCredUpd.get(
						dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3());
				
				MCNumber credPoDQty = MCNumber.ZERO;
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					credPoDQty = dtlR.abort_flg()
							? asR.base_unit_qty()
							: dtlR.base_unit_qty();
				}
				else {
					// 更新前の金額
					RcptIv_Chk01_DtlR bfrIvR = bfrDtlL.getFirst(bfrDtlIdx, dtlR.rcpt_iv_d_no());
					MCNumber bfrIvCredAmt = sum(bfrIvR.trd_cur_amt(), bfrIvR.trd_cur_tax_amt());
					bfrIvCredAmtSum = bfrIvCredAmtSum.add(
							itmR.dscnt_itm_flg() ? bfrIvCredAmt.negate() : bfrIvCredAmt);
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						credPoDQty = bfrIvR.base_unit_qty().negate();
					}
					else {
						credPoDQty = dtlR.abort_flg()
								? asR.base_unit_qty().subtract(bfrIvR.base_unit_qty())
								: dtlR.base_unit_qty().subtract(bfrIvR.base_unit_qty());
					}
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					// 更新後の金額
					MCNumber aftrIvCredAmt = sum(dtlR.trd_cur_amt(), dtlR.trd_cur_tax_amt());
					aftrIvCredAmtSum = aftrIvCredAmtSum.add(
							itmR.dscnt_itm_flg() ? aftrIvCredAmt.negate() : aftrIvCredAmt);
				}
				
				if(!credPoDQty.isZero()) {
					// 発注の金額をインボイス数量で換算（更新時は更新前後の差分数量で換算）
					MCNumber poDCredAmt = (poDR.trd_cur_amt().add(poDR.trd_cur_tax_amt()))
							.multiply(credPoDQty)
							.divide(poDR.base_unit_qty(),
									hdrR.trd_amt_dec_place().intValue(),
									MAC_RND_TYP.toMC(hdrR.purc_amt_rnd_typ()));
					poDCredAmtSum = poDCredAmtSum.add(
							itmR.dscnt_itm_flg() ? poDCredAmt.negate() : poDCredAmt);
				}
			}
			// 与信情報作成
			Cred_Upd02_CndR credCndR = credCndL.add();
			credCndR.sppl_cd(hdrR.sppl_cd());
			credCndR.cur_cd(hdrR.trd_cur_cd());
			MCNumber amt = poDCredAmtSum.add(bfrIvCredAmtSum).subtract(aftrIvCredAmtSum);
			credCndR.amt(amt);
		}
		callCredUpd02(credCndL);
	}
	
	/**
	 * 発注残分の与信を更新する
	 */
	protected void credUpdForPoBackord(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> bfrDtlL, MCList<RcptIv_Chk01_DtlR> aftrDtlL) {
		// 仕入実績登録サービスから仕入予定登録サービスを呼び出して与信更新をしているが、
		// 訂正前の仕入予定が完了していると発注残分を与信更新しないため受領インボイス登録サービスで対応
		// 予定数より少ない数量で登録、打切解除などで発生する発注残分の更新を行う
		MCList<MST_PO_D_R> poDL = getPoDL(aftrDtlL);
		MCList<MST_ARR_SCHD_R> arrSchdL = srchArrSchd(aftrDtlL);
		
		MCIndexKey poDIdx = null;
		MCIndexKey asIdx = null;
		MCIndexKey bfrHdrIdx = null;
		MCIndexKey bfrDtlIdx = null;
		MCIndexKey aftrDtlIdx = null;
		
		if (!isNull(poDL)) poDIdx = poDL.createIndex(MST_PO_D_R.$po_d_no);
		if (!isNull(arrSchdL)) asIdx = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
		if (!isNull(bfrDtlL)) bfrHdrIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_mng_no);
		if (!isNull(bfrDtlL)) bfrDtlIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_d_no);
		if (!isNull(aftrDtlL)) aftrDtlIdx = aftrDtlL.createIndex(RcptIv_Chk01_DtlR.$hdr_peg_no);
		
		MCList<Cred_Upd02_CndR> credCndL = MCList.create(Cred_Upd02_CndR.class);
		
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			RcptIv_Chk01_DtlR bfrHdrR = null;
			if (!isNull(bfrDtlL)) bfrHdrR = bfrDtlL.getFirst(bfrHdrIdx, hdrR.rcpt_iv_mng_no());
			if (isUplnd(hdrR)
					|| isUpdUnFix(hdrR, bfrHdrR)
					|| (!hdrR.fix_flg() && !MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()))) {
				continue;
			}
			
			MCNumber amtSum = MCNumber.ZERO;
			
			MCList<RcptIv_Chk01_DtlR> dtlL = aftrDtlL.subList(aftrDtlIdx, hdrR.peg_no());
			for (RcptIv_Chk01_DtlR dtlR : dtlL) {
				if (dtlR.manual_add_flg() || dtlR.non_purc_flg() || isNull(dtlR.po_d_no())) {
					continue;
				}
				
				// 予定数より少ない数量で更新する場合、予定が割れるため差分を更新
				// 予定数より多い数量や金額変更は発注残に関係ないため更新不要（実績分のみ仕入実績登録サービスで更新）
				MST_ARR_SCHD_R asR = arrSchdL.getFirst(asIdx, dtlR.arr_schd_no());
				MCNumber qty = MCNumber.ZERO;
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
								&& MSC_RCPT_IV_SRC_TYP.isARR_ACT(hdrR.rcpt_iv_src_typ()))) {
					RcptIv_Chk01_DtlR bfrIvR = bfrDtlL.getFirst(bfrDtlIdx, dtlR.rcpt_iv_d_no());
					qty = asR.base_unit_qty().subtract(bfrIvR.base_unit_qty());
				}
				else {
					qty = asR.base_unit_qty().subtract(dtlR.base_unit_qty());
				}
				if (!qty.isPositive()) {
					continue;
				}
				
				boolean isSchdSub = false;
				boolean isSchdAdd = false;
				boolean isActAdd = false;
				// 作成元区分「入荷予定」は予定数未満、打切が対象
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(hdrR.rcpt_iv_src_typ())) {
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && hdrR.fix_flg() && dtlR.abort_flg()) {
						isSchdSub = true;
					}
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						if (isCngFix(hdrR, bfrHdrR) && dtlR.abort_flg()) {
							isSchdSub = true;
						}
						if (((isUpdFix(hdrR, bfrHdrR) || isCngUnFix(hdrR, bfrHdrR)) && !dtlR.abort_flg())
								|| (isCngUnFix(hdrR, bfrHdrR) && dtlR.abort_flg())) {
							isSchdAdd = true;
						}
					}
				}
				// 作成元区分「入荷実績」は打切解除のみ対象
				if (MSC_RCPT_IV_SRC_TYP.isARR_ACT(hdrR.rcpt_iv_src_typ())) {
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						if ((isUpdFix(hdrR, bfrHdrR) && asR.getBoolean("purc_abort_flg") && !dtlR.abort_flg())
								|| (isCngUnFix(hdrR, bfrHdrR) && asR.getBoolean("purc_abort_flg"))) {
							isActAdd = true;
						}
					}
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && asR.getBoolean("purc_abort_flg")) {
						isActAdd = true;
					}
				}
				if (!isSchdSub && !isSchdAdd && !isActAdd) {
					continue;
				}
				
				// 加算対象
				if (isSchdAdd|| isActAdd) {
					qty = qty.negate();
				}
				MST_PO_D_R poDR = poDL.getFirst(poDIdx, dtlR.po_d_no());
				MAM_ITM_R itmR = _cacheItmForCredUpd.get(
						dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3());
				
				MCNumber amt = (poDR.trd_cur_amt().add(poDR.trd_cur_tax_amt()))
						.multiply(qty)
						.divide(poDR.base_unit_qty(),
								hdrR.trd_amt_dec_place().intValue(),
								MAC_RND_TYP.toMC(hdrR.purc_amt_rnd_typ()));
				amtSum = amtSum.add(
						itmR.dscnt_itm_flg() ? amt.negate() : amt);
			}
			Cred_Upd02_CndR credCndR = credCndL.add();
			credCndR.sppl_cd(hdrR.sppl_cd());
			credCndR.cur_cd(hdrR.trd_cur_cd());
			MCNumber amt = amtSum;
			credCndR.amt(amt);
		}
		callCredUpd02(credCndL);
	}
	
	/**
	 * 仕入諸掛分の与信を更新する
	 */
	protected void credUpdForAdd(MCList<RcptIv_Chk01_HdrR> hdrL, MCList<RcptIv_Chk01_DtlR> bfrDtlL, MCList<RcptIv_Chk01_DtlR> aftrDtlL) {
		MCIndexKey bfrHdrIdx = null;
		MCIndexKey aftHdrrIdx = null;
		MCIndexKey bfrDtlIdx = null;
		if (!isNull(bfrDtlL))	bfrHdrIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_mng_no);
		if (!isNull(aftrDtlL))	aftHdrrIdx = aftrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_mng_no);
		if (!isNull(bfrDtlL))	bfrDtlIdx = bfrDtlL.createIndex(RcptIv_Chk01_DtlR.$rcpt_iv_d_no);
		
		MCList<Cred_Upd02_CndR> credCndL = MCList.create(Cred_Upd02_CndR.class);
		
		for (RcptIv_Chk01_HdrR hdrR : hdrL) {
			RcptIv_Chk01_DtlR bfrHdrR = null;
			if (!isNull(bfrDtlL)) bfrHdrR = bfrDtlL.getFirst(bfrHdrIdx, hdrR.rcpt_iv_mng_no());
			if (isCredUpdInPurcAct(hdrR, bfrHdrR)) {
				continue;
			}
			
			MCList<RcptIv_Chk01_DtlR> bDtlL = MCList.create(RcptIv_Chk01_DtlR.class);
			MCList<RcptIv_Chk01_DtlR> aDtlL = MCList.create(RcptIv_Chk01_DtlR.class);
			if (!isNull(bfrDtlL))	bDtlL = bfrDtlL.subList(bfrHdrIdx, hdrR.rcpt_iv_mng_no());
			if (!isNull(aftrDtlL))	aDtlL = aftrDtlL.subList(aftHdrrIdx, hdrR.rcpt_iv_mng_no());
			
			MCList<RcptIv_Chk01_DtlR> tmpL = MCList.create(RcptIv_Chk01_DtlR.class);
			if (isCngFix(hdrR, bfrHdrR)) {
				for (RcptIv_Chk01_DtlR aDtlR : aDtlL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(aDtlR.data_crud_typ())) {
						RcptIv_Chk01_DtlR tmpR = aDtlR.clone();
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						tmpL.add(tmpR);
					}
				}
				aDtlL.removeAll(aDtlL);
				aDtlL.addAll(tmpL);
			}
			else if (isCngUnFix(hdrR, bfrHdrR)) {
				for (RcptIv_Chk01_DtlR aDtlR : aDtlL) {
					if (!MAC_DATA_CRUD_TYP.isCRT(aDtlR.data_crud_typ())) {
						RcptIv_Chk01_DtlR bfrDtlR = bfrDtlL.getFirst(bfrDtlIdx, aDtlR.rcpt_iv_d_no());
						RcptIv_Chk01_DtlR tmpR = bfrDtlR.clone();
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						tmpL.add(tmpR);
					}
				}
				bDtlL.removeAll(bDtlL);
				bDtlL.addAll(tmpL);
			}
			
			credCndL.addAll(getCredListForAdd(hdrR, bDtlL, true));
			credCndL.addAll(getCredListForAdd(hdrR, aDtlL, false));
		}
		callCredUpd02(credCndL);
	}
	
	/**
	 * 仕入諸掛分の与信情報を取得
	 */
	protected MCList<Cred_Upd02_CndR> getCredListForAdd(RcptIv_Chk01_HdrR hdrR, MCList<RcptIv_Chk01_DtlR> dtlL, boolean bfr) {
		MCList<Cred_Upd02_CndR> credCndL = MCList.create(Cred_Upd02_CndR.class);
		if (!isNull(dtlL)) {
			for (RcptIv_Chk01_DtlR dtlR : dtlL.subList(r -> r.manual_add_flg())) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				
				Cred_Upd02_CndR credCndR = credCndL.add();
				credCndR.sppl_cd(hdrR.sppl_cd());
				credCndR.cur_cd(hdrR.trd_cur_cd());
				
				MAM_ITM_R itmR = _cacheItmForCredUpd.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				MCNumber amt = dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt());
				credCndR.amt(itmR.dscnt_itm_flg() ? amt : amt.negate());
				
				if (bfr) {
					credCndR.amt(credCndR.amt().negate());
				}
			}
		}
		return credCndL;
	}
	
	/**
	 * 与信サービス.与信更新（買掛）
	 */
	protected void callCredUpd02(MCList<Cred_Upd02_CndR> credCndL) {
		credCndL = credCndL.groupBy(getGroupByPolicy()).subList(r -> !r.amt().isZero());
		if (!isNull(credCndL)) {
			MSBGL_CredService.Cred_Upd02 o = MSBGL_CredService.crtCred_Upd02();
			o.up0().setAll(credCndL);
			o.exec();
		}
	}
	/**
	 * 発注先の税計算区分が伝票単位の場合
	 * 受領インボイス単位で消費税を再計算する
	 */
	protected void callAmtUtilCalc01(RcptIv_Chk01_HdrR hdrR, MCList<RcptIv_Chk01_DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}
		MAM_BP_R bpR = _cacheBp.get(hdrR.sppl_cd());
		if (MAC_TAX_CALC_TYP.isSLIP(bpR.purc_tax_calc_typ())) {
			MSUCL_AmtUtil.AmtUtil_Calc01 ope = MSUCL_AmtUtil.crtAmtUtil_Calc01();
			copy(ope.up0(), hdrR, createMap_AmtUtil_Calc01_HdrR_RcptIv_Chk01_HdrR());
			setAll(ope.up1(), dtlL, createMap_AmtUtil_Calc01_DtlR_RcptIv_Chk01_DtlR());
			setPurcType(ope.up1());
			ope.exec();
			
			String[] destCols = {RcptIv_Chk01_DtlR.$trd_cur_amt, RcptIv_Chk01_DtlR.$trd_cur_tax_amt,
					RcptIv_Chk01_DtlR.$base_cur_amt, RcptIv_Chk01_DtlR.$base_cur_tax_amt,
					RcptIv_Chk01_DtlR.$ptax_cur_amt, RcptIv_Chk01_DtlR.$ptax_cur_tax_amt,
					RcptIv_Chk01_DtlR.$trd_cur_proc_amt, RcptIv_Chk01_DtlR.$trd_cur_onr_prov_amt,
					RcptIv_Chk01_DtlR.$wtax_amt};
			String[] srcCols = {AmtUtil_Calc01_DtlR.$trd_cur_amt, AmtUtil_Calc01_DtlR.$trd_cur_tax_amt,
					AmtUtil_Calc01_DtlR.$base_cur_amt, AmtUtil_Calc01_DtlR.$base_cur_tax_amt,
					AmtUtil_Calc01_DtlR.$ptax_cur_amt, AmtUtil_Calc01_DtlR.$ptax_cur_tax_amt,
					AmtUtil_Calc01_DtlR.$trd_cur_proc_amt, AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_amt,
					AmtUtil_Calc01_DtlR.$wtax_amt};
			copyByPegNo(dtlL, destCols, ope.down0(), srcCols);
		}
	}
	/**
	 * 購買区分を設定する
	 */
	protected void setPurcType(MCList<AmtUtil_Calc01_DtlR> dtlL) {
		MCList<OutSrcAct_Sprt02_CndR> paramListForOsaSprt02 = MCList.create(OutSrcAct_Sprt02_CndR.class);
		
		for (AmtUtil_Calc01_DtlR dtlR : dtlL) {
			// 製造指図NOがある場合、外注製造実績サービス呼出用のパラメータに追加する
			if (!isNull(dtlR.mfg_inst_no())) {
				OutSrcAct_Sprt02_CndR paramRowForOsaSprt02 = OutSrcAct_Sprt02_CndR.create();
				paramRowForOsaSprt02.peg_no(dtlR.peg_no());
				paramRowForOsaSprt02.mfg_inst_no(dtlR.mfg_inst_no());
				paramListForOsaSprt02.add(paramRowForOsaSprt02);
			}
			else {
				dtlR.purc_typ(MAC_PURC_TYP.PURC_ITM.value());
			}
		}
		
		if (paramListForOsaSprt02.size() > 0) {
			MSBCL_OutSrcActService.OutSrcAct_Sprt02 ope = MSBCL_OutSrcActService.crtOutSrcAct_Sprt02();
			ope.up0().addAll(paramListForOsaSprt02);
			ope.exec();
			
			String[] destCols = {AmtUtil_Calc01_DtlR.$purc_typ};
			String[] srcCols = {OutSrcAct_Sprt02_RsltR.$purc_typ};
			copyByPegNo(dtlL, destCols, ope.down0(), srcCols);
		}
	}
	protected Map_AmtUtil_Calc01_HdrR_RcptIv_Chk01_HdrR<AmtUtil_Calc01_HdrR,RcptIv_Chk01_HdrR> createMap_AmtUtil_Calc01_HdrR_RcptIv_Chk01_HdrR() {
		return new Map_AmtUtil_Calc01_HdrR_RcptIv_Chk01_HdrR<AmtUtil_Calc01_HdrR, RcptIv_Chk01_HdrR>();
	}
	public class Map_AmtUtil_Calc01_HdrR_RcptIv_Chk01_HdrR<D extends AmtUtil_Calc01_HdrR, S extends RcptIv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_HdrR.$trd_cur_cd, RcptIv_Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$xrate, RcptIv_Chk01_HdrR.$xrate);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$ptax_xrate, RcptIv_Chk01_HdrR.$ptax_xrate);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.amt_dec_place(_cacheCur.get(src.trd_cur_cd()).amt_dec_place());
			
			MAM_BP_R bpR = _cacheBp.get(src.sppl_cd());
			dest.tax_rnd_typ(bpR.purc_tax_rnd_typ());
			dest.repurc_obli_flg(bpR.repurc_obli_flg());
		}
	}
	protected Map_AmtUtil_Calc01_DtlR_RcptIv_Chk01_DtlR<AmtUtil_Calc01_DtlR,RcptIv_Chk01_DtlR> createMap_AmtUtil_Calc01_DtlR_RcptIv_Chk01_DtlR() {
		return new Map_AmtUtil_Calc01_DtlR_RcptIv_Chk01_DtlR<AmtUtil_Calc01_DtlR, RcptIv_Chk01_DtlR>();
	}
	public class Map_AmtUtil_Calc01_DtlR_RcptIv_Chk01_DtlR<D extends AmtUtil_Calc01_DtlR, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_DtlR.$peg_no, RcptIv_Chk01_DtlR.$peg_no);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$tax_rate, RcptIv_Chk01_DtlR.$tax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$inc_tax_flg, RcptIv_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$dscnt_itm_flg, RcptIv_Chk01_DtlR.$dscnt_itm_flg);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_ptn_typ, RcptIv_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$mfg_inst_no, RcptIv_Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_upri, RcptIv_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_amt, RcptIv_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_tax_amt, RcptIv_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_dscnt_amt, RcptIv_Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_amt, RcptIv_Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$base_cur_tax_amt, RcptIv_Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_amt, RcptIv_Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_tax_amt, RcptIv_Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_proc_upri, RcptIv_Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_upri, RcptIv_Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_proc_amt, RcptIv_Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_onr_prov_amt, RcptIv_Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_rate, RcptIv_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_amt, RcptIv_Chk01_DtlR.$wtax_amt);
		}
	}
	protected MCGroupByPolicy getGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(
			Cred_Upd02_CndR.$sppl_cd,
			Cred_Upd02_CndR.$cur_cd
		);
		gp.sum(Cred_Upd02_CndR.$amt);
		
		return gp;
	}

	protected Map_PurcSchd_DtlR_RcptIv_Chk01_DtlR<PurcSchd_DtlR,RcptIv_Chk01_DtlR> createMap_PurcSchd_DtlR_RcptIv_Chk01_DtlR() {
		return new Map_PurcSchd_DtlR_RcptIv_Chk01_DtlR<PurcSchd_DtlR, RcptIv_Chk01_DtlR>();
	}
	
	public class Map_PurcSchd_DtlR_RcptIv_Chk01_DtlR<D extends PurcSchd_DtlR, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcSchd_DtlR.$peg_no, RcptIv_Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcSchd_DtlR.$data_crud_typ, RcptIv_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(PurcSchd_DtlR.$po_d_no, RcptIv_Chk01_DtlR.$po_d_no);
			addColumnPathMap(PurcSchd_DtlR.$purc_schd_no, RcptIv_Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(PurcSchd_DtlR.$purc_schd_dt, RcptIv_Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(PurcSchd_DtlR.$trd_unit_schd_qty, RcptIv_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcSchd_DtlR.$trd_unit_cd, RcptIv_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcSchd_DtlR.$base_unit_schd_qty, RcptIv_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcSchd_DtlR.$base_unit_cd, RcptIv_Chk01_DtlR.$base_unit_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.arr_pr_no(MAC_STR.NULL_VAL.value());
			dest.arr_schd_no(MAC_STR.NULL_VAL.value());
			dest.no_cred_upd_flg(true);		// 与信更新しない（仕入諸掛分は自身で与信更新サービスを呼び出すので）
			dest.base_unit_purc_qty(0);
			dest.base_unit_accpt_dfct_qty(0);
			dest.non_purc_flg(false);
			dest.abort_flg(false);
			dest.sub_char1(null);
			dest.sub_char2(null);
			dest.sub_char3(null);
		}
	}
	
	protected MapUpd_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR,RcptIv_Chk01_HdrR> createMapUpd_ExIv_HdrR_RcptIv_Chk01_HdrR() {
		return new MapUpd_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR, RcptIv_Chk01_HdrR>();
	}
	
	public class MapUpd_ExIv_HdrR_RcptIv_Chk01_HdrR<D extends ExIv_HdrR, S extends RcptIv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ExIv_HdrR.$peg_no, RcptIv_Chk01_HdrR.$peg_no);
			addColumnPathMap(ExIv_HdrR.$dlv_id_cd, RcptIv_Chk01_HdrR.$in_to_id_cd);
			addColumnPathMap(ExIv_HdrR.$dlv_id_nm, RcptIv_Chk01_HdrR.$in_to_id_nm);
			addColumnPathMap(ExIv_HdrR.$dlv_cntct_dpt, RcptIv_Chk01_HdrR.$in_to_cntct_dpt);
			addColumnPathMap(ExIv_HdrR.$dlv_cntct_psn, RcptIv_Chk01_HdrR.$in_to_cntct_psn);
			addColumnPathMap(ExIv_HdrR.$dlv_zip_cd, RcptIv_Chk01_HdrR.$in_to_zip_cd);
			addColumnPathMap(ExIv_HdrR.$dlv_addr1, RcptIv_Chk01_HdrR.$in_to_addr1);
			addColumnPathMap(ExIv_HdrR.$dlv_addr2, RcptIv_Chk01_HdrR.$in_to_addr2);
			addColumnPathMap(ExIv_HdrR.$dlv_addr3, RcptIv_Chk01_HdrR.$in_to_addr3);
			addColumnPathMap(ExIv_HdrR.$dlv_addr4, RcptIv_Chk01_HdrR.$in_to_addr4);
			addColumnPathMap(ExIv_HdrR.$dlv_tel, RcptIv_Chk01_HdrR.$in_to_tel);
			addColumnPathMap(ExIv_HdrR.$dlv_fax, RcptIv_Chk01_HdrR.$in_to_fax);
			addColumnPathMap(ExIv_HdrR.$dlv_cntry_cd, RcptIv_Chk01_HdrR.$in_to_cntry_cd);
			addColumnPathMap(ExIv_HdrR.$dlv_sundry_flg, RcptIv_Chk01_HdrR.$in_to_sundry_flg);
			
			addColumnPathMap(ExIv_HdrR.$trnspt_cd, RcptIv_Chk01_HdrR.$trnspt_cd);
			addColumnPathMap(ExIv_HdrR.$vssl_flght, RcptIv_Chk01_HdrR.$vssl_flght);
			addColumnPathMap(ExIv_HdrR.$load_port_cd, RcptIv_Chk01_HdrR.$load_port_cd);
			addColumnPathMap(ExIv_HdrR.$etd_dt, RcptIv_Chk01_HdrR.$etd_dt);
			addColumnPathMap(ExIv_HdrR.$dschrg_port_cd, RcptIv_Chk01_HdrR.$dschrg_port_cd);
			addColumnPathMap(ExIv_HdrR.$eta_dt, RcptIv_Chk01_HdrR.$eta_dt);
			addColumnPathMap(ExIv_HdrR.$via_port_cd, RcptIv_Chk01_HdrR.$via_port_cd);
			addColumnPathMap(ExIv_HdrR.$via_schd_dt, RcptIv_Chk01_HdrR.$via_schd_dt);
			
			addColumnPathMap(ExIv_HdrR.$tterm_cd1, RcptIv_Chk01_HdrR.$slo_tterm_cd1);
			addColumnPathMap(ExIv_HdrR.$tterm_rmrks1, RcptIv_Chk01_HdrR.$slo_tterm_rmrks1);
			addColumnPathMap(ExIv_HdrR.$tterm_cd2, RcptIv_Chk01_HdrR.$slo_tterm_cd2);
			addColumnPathMap(ExIv_HdrR.$tterm_rmrks2, RcptIv_Chk01_HdrR.$slo_tterm_rmrks2);
			addColumnPathMap(ExIv_HdrR.$tterm_cd3, RcptIv_Chk01_HdrR.$slo_tterm_cd3);
			addColumnPathMap(ExIv_HdrR.$tterm_rmrks3, RcptIv_Chk01_HdrR.$slo_tterm_rmrks3);
			
			addColumnPathMap(ExIv_HdrR.$rcpt_iv_mng_no, RcptIv_Chk01_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(ExIv_HdrR.$rcpt_iv_no, RcptIv_Chk01_HdrR.$rcpt_iv_no);
			addColumnPathMap(ExIv_HdrR.$trd_cur_cd, RcptIv_Chk01_HdrR.$trd_cur_cd);
		}
	}
	
	protected Map_MST_IV_D_R_RcptIv_Chk01_DtlR<MST_IV_D_R, RcptIv_Chk01_DtlR> createMap_MST_IV_D_R_RcptIv_Chk01_DtlR() {
		return new Map_MST_IV_D_R_RcptIv_Chk01_DtlR<MST_IV_D_R, RcptIv_Chk01_DtlR>();
	}
	
	public class Map_MST_IV_D_R_RcptIv_Chk01_DtlR<D extends MST_IV_D_R, S extends RcptIv_Chk01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_D_R.$slo_d_no, RcptIv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(MST_IV_D_R.$slo_no, RcptIv_Chk01_DtlR.$slo_no);
			addColumnPathMap(MST_IV_D_R.$itm_cd, RcptIv_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_IV_D_R.$itm_sub1, RcptIv_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_IV_D_R.$itm_sub2, RcptIv_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_IV_D_R.$itm_sub3, RcptIv_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_IV_D_R.$itm_nm, RcptIv_Chk01_DtlR.$itm_nm);
			addColumnPathMap(MST_IV_D_R.$sno1, RcptIv_Chk01_DtlR.$sno1);
			addColumnPathMap(MST_IV_D_R.$sno2, RcptIv_Chk01_DtlR.$sno2);
			addColumnPathMap(MST_IV_D_R.$sno3, RcptIv_Chk01_DtlR.$sno3);
			addColumnPathMap(MST_IV_D_R.$sno4, RcptIv_Chk01_DtlR.$sno4);
			addColumnPathMap(MST_IV_D_R.$iv_itm_nm, RcptIv_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(MST_IV_D_R.$trd_unit_cd, RcptIv_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_IV_D_R.$trd_unit_qty, RcptIv_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_IV_D_R.$purc_schd_no, RcptIv_Chk01_DtlR.$purc_schd_no);
		}
	}
	
	protected MapDel_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR,RcptIv_Chk01_HdrR> createMapDel_ExIv_HdrR_RcptIv_Chk01_HdrR() {
		return new MapDel_ExIv_HdrR_RcptIv_Chk01_HdrR<ExIv_HdrR, RcptIv_Chk01_HdrR>();
	}

	public class MapDel_ExIv_HdrR_RcptIv_Chk01_HdrR<D extends ExIv_HdrR, S extends RcptIv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.rcpt_iv_mng_no(nvl(src.getStringNE("old_rcpt_iv_mng_no"), src.rcpt_iv_mng_no()));
		}
	}
	
	protected Map_PurcIoSchd_Upd01_DtlR_MST_IO_SCHD_R<PurcIoSchd_Upd01_DtlR,MST_IO_SCHD_R> createMap_PurcIoSchd_Upd01_DtlR_MST_IO_SCHD_R() {
		return new Map_PurcIoSchd_Upd01_DtlR_MST_IO_SCHD_R<PurcIoSchd_Upd01_DtlR, MST_IO_SCHD_R>();
	}
	
	public class Map_PurcIoSchd_Upd01_DtlR_MST_IO_SCHD_R<D extends PurcIoSchd_Upd01_DtlR, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_cd, MST_IO_SCHD_R.$itm_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub1, MST_IO_SCHD_R.$itm_sub1);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub2, MST_IO_SCHD_R.$itm_sub2);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub3, MST_IO_SCHD_R.$itm_sub3);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$lot_no, MST_IO_SCHD_R.$lot_no);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sublot_no, MST_IO_SCHD_R.$sublot_no);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno1, MST_IO_SCHD_R.$sno1);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno2, MST_IO_SCHD_R.$sno2);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno3, MST_IO_SCHD_R.$sno3);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno4, MST_IO_SCHD_R.$sno4);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$loc_cd, MST_IO_SCHD_R.$loc_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$str_ln_cd, MST_IO_SCHD_R.$str_ln_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$pack_unit_qty, MST_IO_SCHD_R.$pack_unit_qty);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$pack_unit_cd, MST_IO_SCHD_R.$pack_unit_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$base_unit_qty, MST_IO_SCHD_R.$base_unit_qty);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$gd_cd, MST_IO_SCHD_R.$gd_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$quality_typ, MST_IO_SCHD_R.$quality_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$asst_typ, MST_IO_SCHD_R.$asst_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_arrv_bp_cd, MST_IO_SCHD_R.$stk_arrv_bp_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_insp_typ, MST_IO_SCHD_R.$stk_insp_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_id_typ, MST_IO_SCHD_R.$stk_id_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_bp_cd, MST_IO_SCHD_R.$stk_bp_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
			dest.fix_no(src.io_schd_no());	// 入荷実績ＮＯ
		}
	}
	
	protected Map_SloStsForIns<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> createMapSloStsForIns() {
		return new Map_SloStsForIns<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR>();
	}
	
	public class Map_SloStsForIns<D extends SloSts_DtlR, S extends RcptIv_Chk01_DtlR, W extends RcptIv_Chk01_HdrR> extends FXUCC_RowMapperWith<D, S, W> {
		protected W _hdrR;
		@Override
		public void setWith(W _hdrR) {
			this._hdrR = _hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, RcptIv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$unit_cd, RcptIv_Chk01_DtlR.$unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, RcptIv_Chk01_DtlR.$qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.slo_sts_typ(MSC_SLO_STS_TYP.IV_RCPT.value());
			dest.rcpt_iv_no(_hdrR.rcpt_iv_no());
			dest.rcpt_iv_d_no(src.rcpt_iv_d_no());
		}
	}
	
	protected Map_SloStsForUpd<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> createMapSloStsForUpd() {
		return new Map_SloStsForUpd<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR>();
	}
	
	public class Map_SloStsForUpd<D extends SloSts_DtlR, S extends RcptIv_Chk01_DtlR, W extends RcptIv_Chk01_HdrR> extends FXUCC_RowMapperWith<D, S, W> {
		protected W _hdrR;
		@Override
		public void setWith(W _hdrR) {
			this._hdrR = _hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, RcptIv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$unit_cd, RcptIv_Chk01_DtlR.$unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, RcptIv_Chk01_DtlR.$qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.slo_sts_typ(MSC_SLO_STS_TYP.IV_RCPT_UPD.value());
			dest.rcpt_iv_no(_hdrR.rcpt_iv_no());
			dest.rcpt_iv_d_no(src.rcpt_iv_d_no());
		}
	}
	
	protected Map_SloStsForDel<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR> createMapSloStsForDel() {
		return new Map_SloStsForDel<SloSts_DtlR, RcptIv_Chk01_DtlR, RcptIv_Chk01_HdrR>();
	}
	
	public class Map_SloStsForDel<D extends SloSts_DtlR, S extends RcptIv_Chk01_DtlR, W extends RcptIv_Chk01_HdrR> extends FXUCC_RowMapperWith<D, S, W> {
		protected W _hdrR;
		@Override
		public void setWith(W _hdrR) {
			this._hdrR = _hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, RcptIv_Chk01_DtlR.$slo_d_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.slo_sts_typ(MSC_SLO_STS_TYP.IV_RCPT_CAN.value());
			dest.rcpt_iv_no(_hdrR.old_rcpt_iv_no());
			dest.rcpt_iv_d_no(src.rcpt_iv_d_no());
		}
	}
	
	/** 入荷進捗キャッシュ */
	protected MCList<MST_ARR_PR_R> _arrPrL;
	protected  static MCList<MST_ARR_PR_R> srchArrPr(MCList<RcptIv_Chk01_DtlR> dtlL) {
		return object(CLAZZ)._srchArrPr(dtlL);
	}
	protected MCList<MST_ARR_PR_R> _srchArrPr(MCList<RcptIv_Chk01_DtlR> dtlL) {
		if (_arrPrL == null) {
			_arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MCQueryApiBuilder _arrPrL_bldr = MCQueryApiBuilder.create(t);
			_arrPrL.addDateColumn("po_arr_schd_tm");
			_arrPrL.addDateColumn("po_purc_schd_dt");
			_arrPrL.addStringColumn("po_arr_loc_cd");
			_arrPrL.addStringColumn("po_arr_lstr_ln_cd");
			_arrPrL.addBooleanColumn("po_sync_flg");
			_arrPrL.addStringColumn("po_trd_unit_cd");
			_arrPrL.addStringColumn("po_bp_lot_no");
			_arrPrL_bldr.addSelect(t2.dlv_rqst_tm.as("po_arr_schd_tm"));
			_arrPrL_bldr.addSelect(t2.purc_schd_dt.as("po_purc_schd_dt"));
			_arrPrL_bldr.addSelect(t2.in_to_loc_cd.as("po_arr_loc_cd"));
			_arrPrL_bldr.addSelect(t2.str_ln_cd.as("po_arr_lstr_ln_cd"));
			_arrPrL_bldr.addSelect(t2.sync_flg.as("po_sync_flg"));
			_arrPrL_bldr.addSelect(t2.trd_unit_cd.as("po_trd_unit_cd"));
			_arrPrL_bldr.addSelect(t2.bp_lot_no.as("po_bp_lot_no"));
			_arrPrL_bldr.addInnerJoin(t2, bracket( t2.po_d_no.eq(t.po_d_no)));
			dbSelectKey("MSBEL5740_MST_ARR_PR_S01", _arrPrL, _arrPrL_bldr, dtlL.groupBy(RcptIv_Chk01_DtlR.$arr_pr_no));
			setPegNo(_arrPrL);
		}
		// チェック処理の後に受領インボイスが更新されるのでキャッシュしない
		setRcptIvQty(_arrPrL);
		return _arrPrL;
	}
	protected void setRcptIvQty(MCList<MST_ARR_PR_R> arrPrL) {
		MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T1");
		MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
		bldr.addInnerJoin(t2, t2.purc_schd_no.eq(t1.purc_schd_no));
		bldr.setWhere(t1.arr_pr_no.eq(bind("arr_pr_no")));
		bldr.setGroupBy(t1.arr_pr_no);
		bldr.addSum(t2.base_unit_qty, "rcpt_iv_qty");
		
		MCList<MST_ARR_PR_R> rsltL = MCList.create(MST_ARR_PR_R.class);
		dbSelect("MSBEL5740_MST_ARR_PR_S02", rsltL, bldr, arrPrL);
		MCIndexKey idx = rsltL.createIndex(MST_ARR_PR_R.$arr_pr_no);
		
		for (MST_ARR_PR_R apR : arrPrL) {
			MST_ARR_PR_R rsltR = rsltL.getFirst(idx, apR.arr_pr_no());
			apR.rcpt_iv_qty(isNull(rsltR) ? MCNumber.ZERO : rsltR.rcpt_iv_qty());
		}
	}
	
	/** 入荷予定キャッシュ */
	protected MCList<MST_ARR_SCHD_R> _arrSchdL;
	protected  static MCList<MST_ARR_SCHD_R> srchArrSchd(MCList<RcptIv_Chk01_DtlR> dtlL) {
		return object(CLAZZ)._srchArrSchd(dtlL);
	}
	protected MCList<MST_ARR_SCHD_R> _srchArrSchd(MCList<RcptIv_Chk01_DtlR> dtlL) {
		if (_arrSchdL == null) {
			MST_PRMS_RCPT_D_R t2 = MST_PRMS_RCPT_D_R.create("T2");
			MST_DLV_INST_D_R t3 = MST_DLV_INST_D_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			MST_ARR_PR_R t5 = MST_ARR_PR_R.create("T5");
			
			_arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder _arrSchdL_bldr = MCQueryApiBuilder.create(t);
			_arrSchdL_bldr.addSelect(nvl(t.dlv_inst_d_no, t2.dlv_inst_d_no).as("ref_dlv_inst_d_no"));
			_arrSchdL.addDateColumn("purc_schd_dt");
			_arrSchdL.addDateColumn("prms_arr_schd_tm");
			_arrSchdL.addDateColumn("prms_purc_schd_dt");
			_arrSchdL.addBooleanColumn("prms_sync_flg");
			_arrSchdL.addStringColumn("prms_trd_unit_cd");
			_arrSchdL.addDateColumn("dlv_arr_schd_dt");
			_arrSchdL.addDateColumn("dlv_purc_schd_dt");
			_arrSchdL.addStringColumn("dlv_arr_loc_cd");
			_arrSchdL.addStringColumn("dlv_arr_str_ln_cd");
			_arrSchdL.addBooleanColumn("dlv_sync_flg");
			_arrSchdL.addStringColumn("dlv_trd_unit_cd");
			_arrSchdL.addStringColumn("po_d_no");
			_arrSchdL.addBooleanColumn("purc_abort_flg");
			// 入荷不要の場合、数量が０なので仕入予定の数量を取得する（入荷予定の数量は入荷予定サービス内で０に置き換わるので）
			// 逆に仕入対象外の場合は仕入予定の数量が０なので入荷予定の数量を取得する
			_arrSchdL_bldr.removeSelect(MST_ARR_SCHD_R.$trd_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
			// 納期回答受領明細
			_arrSchdL_bldr.addSelect(t2.prms_dlv_tm.as("prms_arr_schd_tm"));
			_arrSchdL_bldr.addSelect(t2.purc_schd_dt.as("prms_purc_schd_dt"));
			_arrSchdL_bldr.addSelect(t2.sync_flg.as("prms_sync_flg"));
			_arrSchdL_bldr.addSelect(t2.trd_unit_cd.as("prms_trd_unit_cd"));
			// 納入指示明細
			_arrSchdL_bldr.addSelect(t3.dlv_rqst_tm.as("dlv_arr_schd_tm"));
			_arrSchdL_bldr.addSelect(t3.purc_schd_dt.as("dlv_purc_schd_dt"));
			_arrSchdL_bldr.addSelect(t3.in_to_loc_cd.as("dlv_arr_loc_cd"));
			_arrSchdL_bldr.addSelect(t3.str_ln_cd.as("dlv_arr_str_ln_cd"));
			_arrSchdL_bldr.addSelect(t3.sync_flg.as("dlv_sync_flg"));
			_arrSchdL_bldr.addSelect(t3.trd_unit_cd.as("dlv_trd_unit_cd"));
			_arrSchdL_bldr.addSelect(t4.purc_schd_no, t4.purc_schd_dt,
					decode(t4.non_purc_flg, value(false), t4.trd_unit_schd_qty, t.trd_unit_qty).as("trd_unit_qty"),
					decode(t4.non_purc_flg, value(false), t4.base_unit_schd_qty, t.base_unit_qty).as("base_unit_qty"));
			_arrSchdL_bldr.addSelect(
					decode( t.rcpt_iv_no, nullValue(), coalesce(t2.trd_unit_cd, t3.trd_unit_cd, t5.trd_unit_cd ), t.trd_unit_cd).as(_$org_trd_unit_cd));
			_arrSchdL_bldr.addSelect(t5.po_d_no);
			_arrSchdL_bldr.addSelect(t4.abort_flg.as("purc_abort_flg"));
			_arrSchdL_bldr.addLeftOuterJoin(t2, bracket(t2.prms_rcpt_d_no.eq(t.prms_rcpt_d_no)));
			_arrSchdL_bldr.addLeftOuterJoin(t3, bracket(t3.dlv_inst_d_no.eq(t.dlv_inst_d_no)));
			_arrSchdL_bldr.addInnerJoin(t4, bracket(t4.arr_schd_no.eq(t.arr_schd_no)));
			_arrSchdL_bldr.addInnerJoin(t5, bracket(t5.arr_pr_no.eq(t.arr_pr_no)));
			_arrSchdL_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			dbSelect("MSBEL5740_MST_ARR_SCHD_S01", _arrSchdL, _arrSchdL_bldr, dtlL.groupBy(RcptIv_Chk01_DtlR.$arr_pr_no));
		}
		return _arrSchdL;
	}
	
	protected final String _$org_trd_unit_cd = "org_trd_unit_cd";
	protected void setOrgArrSchd(ArrSchd_DtlR asR, MST_ARR_PR_R orgApR) {
		setOrgArrSchd(asR, orgApR, null);
	}
	protected void setOrgArrSchd(ArrSchd_DtlR asR, MST_ARR_PR_R orgApR, MST_ARR_SCHD_R orgAsR) {
		if (isNull(orgAsR) || isNullAnd(orgAsR.prms_rcpt_d_no(), orgAsR.dlv_inst_d_no())) {
			asR.arr_schd_tm(orgApR.getDateNE("po_arr_schd_tm"));
			asR.accpt_schd_dt(orgApR.getDateNE("po_purc_schd_dt"));
			asR.arr_loc_cd(orgApR.getStringNE("po_arr_loc_cd"));
			asR.str_ln_cd(orgApR.getStringNE("po_arr_lstr_ln_cd"));
			asR.setStringNE(_$org_trd_unit_cd, orgApR.getStringNE("po_trd_unit_cd"));
		}
		else if (!isNull(orgAsR.prms_rcpt_d_no())) {
			asR.arr_schd_tm(orgAsR.getDateNE("prms_arr_schd_tm"));
			asR.accpt_schd_dt(orgAsR.getDateNE("prms_purc_schd_dt"));
			asR.arr_loc_cd(orgApR.getStringNE("po_arr_loc_cd"));
			asR.str_ln_cd(orgApR.getStringNE("po_arr_lstr_ln_cd"));
			asR.setStringNE(_$org_trd_unit_cd, orgAsR.getStringNE("prms_trd_unit_cd"));
		}
		else if (!isNull(orgAsR.dlv_inst_d_no())) {
			asR.arr_schd_tm(orgAsR.getDateNE("dlv_arr_schd_tm"));
			asR.accpt_schd_dt(orgAsR.getDateNE("dlv_purc_schd_dt"));
			asR.arr_loc_cd(orgAsR.getStringNE("dlv_arr_loc_cd"));
			asR.str_ln_cd(orgAsR.getStringNE("dlv_arr_str_ln_cd"));
			asR.setStringNE(_$org_trd_unit_cd, orgAsR.getStringNE("dlv_trd_unit_cd"));
		}
		asR.arr_ptn_typ(getArrPtnTyp(asR));
		asR.sync_flg(getSyncFlg(asR, orgApR, orgAsR));
	}
	protected String getArrPtnTyp(ArrSchd_DtlR asR) {
		if (asR.arr_qty().isPositive() || asR.purc_qty().isPositive()) {
			return asR.arr_ptn_typ();
		}
		else if (!isNull(asR.accpt_schd_dt()) && asR.accpt_schd_dt().ltDate(asR.arr_schd_tm())) {
			return MSC_ARR_PTN_TYP.N_YET_ARR.value();
		}
		else {
			return MSC_ARR_PTN_TYP.NRML.value();
		}
	}
	protected boolean getSyncFlg(ArrSchd_DtlR asR, MST_ARR_PR_R orgApR, MST_ARR_SCHD_R orgAsR) {
		if (asR.arr_qty().isPositive() || asR.purc_qty().isPositive()) {
			return asR.sync_flg();
		}
		else if (MSC_ARR_PTN_TYP.isN_YET_ARR(asR.arr_ptn_typ())) {
			return false;
		}
		else if (isNull(orgAsR) || isNullAnd(orgAsR.prms_rcpt_d_no(), orgAsR.dlv_inst_d_no())) {
			return orgApR.getBooleanNE("po_sync_flg");
		}
		else if (!isNull(orgAsR.prms_rcpt_d_no())) {
			return orgAsR.getBooleanNE("prms_sync_flg");
		}
		else if (!isNull(orgAsR.dlv_inst_d_no())) {
			return orgAsR.getBooleanNE("dlv_sync_flg");
		}
		return asR.sync_flg();
	}
	protected MCDate getMaxPurcSchdDt(RcptIv_Chk01_DtlR dtlR) {
		MCDate dt = null;
		// 変更前の仕入予定日を除外
		MCList<MST_RCPT_IV_R> rcptIvL = getRcptIvL(dtlR).subList(r -> !isSame(r.getString("rcpt_iv_d_no"), dtlR.rcpt_iv_d_no()));
		if (!isNull(rcptIvL)) {
			rcptIvL.sort(SortType.DESC, MST_RCPT_IV_R.$purc_schd_dt);
			dt = rcptIvL.get(0).purc_schd_dt();
		}
		return dt;
	}
	protected MCDate getMaxDt(MCDate... dts) {
		List<MCDate> dtl = Arrays.asList(dts).stream()
				.sorted(Comparator.nullsLast(Comparator.reverseOrder()))
				.collect(Collectors.toList());
		return dtl.get(0);
	}
	protected boolean isCompRcptIv(MST_ARR_SCHD_R arrSchdR, RcptIv_Chk01_DtlR dtlR, MCList<RcptIv_Chk01_MapR> mapL) {
		if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
			return false;
		}
		if (!isCompRcptIvForArrSchd(arrSchdR, dtlR)) {
			return false;
		}
		return isCompRcptIvForArrAct(dtlR, mapL);
	}
	protected boolean isCompRcptIvForArrSchd(MST_ARR_SCHD_R arrSchdR, RcptIv_Chk01_DtlR dtlR) {
		// 変更前の数量を除外
		MCList<MST_RCPT_IV_R> rcptIvL = getRcptIvL(dtlR).subList(r -> !isSame(r.getString("rcpt_iv_d_no"), dtlR.rcpt_iv_d_no()));
		MCNumber remainQty = arrSchdR.base_unit_qty()
				.subtract(nvl(rcptIvL.sum("base_unit_qty"), MCNumber.ZERO))
				.subtract(dtlR.base_unit_qty());
		
		return !remainQty.isPositive();
	}
	protected boolean isCompRcptIvForArrAct(RcptIv_Chk01_DtlR dtlR, MCList<RcptIv_Chk01_MapR> mapL) {
		MCIndexKey ioIdx = mapL.createIndex(RcptIv_Chk01_MapR.$dtl_peg_no);
		MCList<RcptIv_Chk01_MapR> ioL = mapL.subList(ioIdx, dtlR.peg_no());
		
		MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
		arrActL.addStringColumn("rcpt_iv_d_no");
		arrActL.addNumberColumn("rcpt_iv_qty");
		MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create("ARRACT");
		MST_RCPT_IV_MAP_R rcptIvMapR = MST_RCPT_IV_MAP_R.create("RCPTIVMAP");
		MCQueryApiBuilder arrAct_bldr = MCQueryApiBuilder.create(arrActR);
		arrAct_bldr.addSelect(rcptIvMapR.rcpt_iv_d_no);
		arrAct_bldr.addSelect(rcptIvMapR.base_unit_qty.as("rcpt_iv_qty"));
		arrAct_bldr.addLeftOuterJoin(rcptIvMapR, rcptIvMapR.arr_act_no.eq(arrActR.arr_act_no));
		arrAct_bldr.addWhereWithAnd(arrActR.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBEL5740_MST_ARR_ACT_S02", arrActL, arrAct_bldr, ioL);
		
		// 変更前の数量を除外
		MCList<MST_ARR_ACT_R> arrActSubL = arrActL.subList(r -> !isSame(r.getString("rcpt_iv_d_no"), dtlR.rcpt_iv_d_no()));
		// 受領インボイス明細と入荷実績はＮ対Ｍのため、重複する入荷実績ＮＯを除外
		MCList<MST_ARR_ACT_R> arrActMergeL = arrActL.distinctNE(MST_RCPT_IV_MAP_R.$arr_act_no);
		MCNumber rcptIvQty = nvl(arrActSubL.sum("rcpt_iv_qty"), MCNumber.ZERO);
		MCNumber arrActQty = nvl(arrActMergeL.sum(MST_ARR_ACT_R.$base_unit_qty), MCNumber.ZERO);
		MCNumber remainQty = arrActQty.subtract(rcptIvQty).subtract(dtlR.base_unit_qty());
		
		return !remainQty.isPositive();
	}
	protected void setDlvInstPrmsRcpt (ArrSchd_DtlR asR, MST_ARR_PR_R orgApR, MST_ARR_SCHD_R orgAsR) {
		if (!isNull(orgAsR)) {
			asR.dlv_slip_no(orgAsR.dlv_slip_no());
			asR.dlv_slip_mng_no(orgAsR.dlv_slip_mng_no());
			asR.dlv_slip_mng_seq(orgAsR.dlv_slip_mng_seq());
			asR.dlv_slip_mng_d_no(orgAsR.dlv_slip_mng_d_no());
			asR.dlv_slip_mng_d_seq(orgAsR.dlv_slip_mng_d_seq());
			if (!isNull(orgAsR.prms_rcpt_d_no())) {
				asR.dlv_inst_d_no(orgAsR.dlv_inst_d_no());
				asR.prms_rcpt_d_no(orgAsR.prms_rcpt_d_no());
			}
			else if (!isNull(orgAsR.dlv_inst_d_no())) {
				asR.dlv_inst_d_no(orgAsR.dlv_inst_d_no());
			}
		}
	}
	protected void clearOrgArrAchd(ArrSchd_DtlR asR) {
		// ひとつ前の業務の番号に戻す
		// 納期回答受領→納入指示時の状態
		// 納入指示時→納期回答受領時の状態
		if (!isNull(asR.prms_rcpt_d_no())) {
			asR.prms_rcpt_d_no(null);
		}
		else {
			asR.dlv_inst_d_no(null);
		}
	}
	
	/**
	 * 入荷予定の調整に必要なマスタを取得する
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmForArrSchd;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnitForArrSchd;
	protected void initDbcForArrSchd(MCList<ArrSchd_DtlR> arrSchdL) {
		MCList<ArrSchd_DtlR> tgtL = MCList.create(ArrSchd_DtlR.class);
		arrSchdL.forEach(r -> {
			if (!isNull(r.getStringNE(_$org_trd_unit_cd))) {
				ArrSchd_DtlR tgtR = tgtL.add();
				tgtR.itm_cd(r.itm_cd());
				tgtR.itm_sub1(r.itm_sub1());
				tgtR.itm_sub2(r.itm_sub2());
				tgtR.itm_sub3(r.itm_sub3());
				tgtR.trd_unit_cd(r.getStringNE(_$org_trd_unit_cd));
			}
		});
		
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_cacheItmForArrSchd = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, tgtL,
				ArrSchd_DtlR.$itm_cd, ArrSchd_DtlR.$itm_sub1, ArrSchd_DtlR.$itm_sub2,
				ArrSchd_DtlR.$itm_sub3);
		MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		_cacheItmUnitForArrSchd = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnit_bldr, tgtL,
				ArrSchd_DtlR.$itm_cd, ArrSchd_DtlR.$itm_sub1, ArrSchd_DtlR.$itm_sub2,
				ArrSchd_DtlR.$itm_sub3, ArrSchd_DtlR.$trd_unit_cd);
	}
	
	/**
	 * 入荷予定を分割・統合する際にまとめるキー
	 */
	protected String[] getArrSchdGrpKey(boolean isChk) {
		if (isChk) {
			return new String[]{
				MST_ARR_SCHD_R.$arr_pr_no,
				MST_ARR_SCHD_R.$prms_rcpt_d_no,
				MST_ARR_SCHD_R.$dlv_inst_d_no,
				MST_ARR_SCHD_R.$purc_act_d_no,
				MST_ARR_SCHD_R.$mfg_inst_no,
				MST_ARR_SCHD_R.$arr_schd_tm,
				MST_ARR_SCHD_R.$lot_no,
				MST_ARR_SCHD_R.$sublot_no,
				MST_ARR_SCHD_R.$arr_loc_cd,
				MST_ARR_SCHD_R.$str_ln_cd,
				MST_ARR_SCHD_R.$trd_unit_cd
			};
		}
		else {
			return new String[]{
				ArrSchd_DtlR.$arr_pr_no,
				ArrSchd_DtlR.$prms_rcpt_d_no,
				ArrSchd_DtlR.$dlv_inst_d_no,
				ArrSchd_DtlR.$purc_act_d_no,
				ArrSchd_DtlR.$mfg_inst_no,
				ArrSchd_DtlR.$arr_schd_tm,
				ArrSchd_DtlR.$arr_loc_cd,
				ArrSchd_DtlR.$str_ln_cd,
			};
		}
	}
	/**
	 * 入荷予定を分割・統合する単位にまとめるグループを取得する
	 */
	protected ArrayList<MCList<ArrSchd_DtlR>> getArrSchdGrpList(
		String[] grpKey, MCList<ArrSchd_DtlR> arrSchdL, MCList<ArrSchd_DtlR> abortL) {
		
		// 予定打切分はまとめない。個別に追加する
		MCList<ArrSchd_DtlR> asL = arrSchdL.shallowClone();
		asL.removeAll(abortL);
		
		MCList<ArrSchd_DtlR>[] gl = asL.groupList(grpKey);
		ArrayList<MCList<ArrSchd_DtlR>> arr =  new ArrayList<>();
		for (int i=0; i<gl.length; i++) {
			arr.add(gl[i]); 
		}
		
		// 予定打切分
		abortL.forEach(r -> {
			MCList<ArrSchd_DtlR> tmpL = MCList.create(ArrSchd_DtlR.class);
			tmpL.add(r);
			arr.add(tmpL);
		});
		
		return arr;
	}
	
	/**
	 * 与信更新に必要なマスタを取得する
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmForCredUpd;
	protected void initDbcForCredUpd(MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_cacheItmForCredUpd = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, dtlL,
				RcptIv_Chk01_DtlR.$itm_cd, RcptIv_Chk01_DtlR.$itm_sub1, RcptIv_Chk01_DtlR.$itm_sub2,
				RcptIv_Chk01_DtlR.$itm_sub3);
	}
	
	/**
	 * 入荷予定ＮＯに紐づく受領インボイスを取得
	 */
	protected MCList<MST_RCPT_IV_R> getRcptIvL(RcptIv_Chk01_DtlR dtlR) {
		MCList<MST_RCPT_IV_R> rcptIvL = MCList.create(MST_RCPT_IV_R.class);
		MST_RCPT_IV_R t1 = MST_RCPT_IV_R.create("T1");
		MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
		dbc_bldr.addSelect(t2.rcpt_iv_d_no);
		dbc_bldr.addSelect(t2.base_unit_qty );
		dbc_bldr.addInnerJoin(t2, t2.rcpt_iv_mng_no.eq(t1.rcpt_iv_mng_no));
		dbc_bldr.addWhereWithAnd(t2.purc_schd_no.eq(bind("purc_schd_no")));
		dbSelect("MSBEL5740_MST_RCPT_IV_S03", rcptIvL, dbc_bldr, dtlR);
		return rcptIvL;
	}
	
	/**
	 * 受領インボイス明細に紐づく発注明細を取得
	 */
	protected MCList<MST_PO_D_R> getPoDL(MCList<RcptIv_Chk01_DtlR> dtlL) {
		MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
		MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("t"));
		dbSelectKey("MSBEL5740_MST_PO_D_S01", poDL, poD_bldr, dtlL);
		return poDL;
	}
	
	/**
	 * RcptIv_RevUpd01オペレーション.<p>
	 *
	 * 受領インボイス改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class RcptIv_RevUpd01 extends MSBEL_RcptIvRegService_MC_A.RcptIv_RevUpd01 {

		MCList<MST_RCPT_IV_R> _hCurrentL = MCList.create(MST_RCPT_IV_R.class);
		MCList<MST_RCPT_IV_D_R> _dCurrentL = MCList.create(MST_RCPT_IV_D_R.class);
		MCList<MST_RCPT_IV_P_R> _hRevL = MCList.create(MST_RCPT_IV_P_R.class);
		MCList<MST_RCPT_IV_D_P_R> _dRevL = MCList.create(MST_RCPT_IV_D_P_R.class);

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
			MCList<MST_RCPT_IV_R> wkL = MCList.create(MST_RCPT_IV_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_RCPT_IV_R wkR = MST_RCPT_IV_R.create();
				wkR.rcpt_iv_mng_no(r.rev_data_src_no());
				wkR.rcpt_iv_rev(r.rev_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T"));
			dbWkDelete("MSBEL5740_MSW_RCPT_IV_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5740_MSW_RCPT_IV_I02", wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_RCPT_IV_P_R> wkpL = MCList.create(MST_RCPT_IV_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_RCPT_IV_P_R wkpR = MST_RCPT_IV_P_R.create();
				wkpR.rcpt_iv_mng_no(r.rev_data_src_no());
				wkpR.rcpt_iv_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_P_R.create("T"));
			dbWkDelete("MSBEL5740_MSW_RCPT_IV_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5740_MSW_RCPT_IV_P_I01", wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()), wkpL_bldr.getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		private void selectCurrent() {
			MST_RCPT_IV_R hCurrentL_t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			MSW_RCPT_IV_KEY_R w1 = MSW_RCPT_IV_KEY_R.create("W");
			hCurrentL_bldr.addInnerJoin(w1, bracket(hCurrentL_t.rcpt_iv_mng_no.eq(w1.rcpt_iv_mng_no)));
			dbSelect("MSBEL5740_MST_RCPT_IV_S02", _hCurrentL, hCurrentL_bldr);

			MST_RCPT_IV_D_R dCurrentL_t = MST_RCPT_IV_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1, bracket(dCurrentL_t.rcpt_iv_mng_no.eq(w1.rcpt_iv_mng_no)));
			dbSelect("MSBEL5740_MST_RCPT_IV_D_S03", _dCurrentL, dCurrentL_bldr);

			MST_RCPT_IV_P_R hRevL_t = MST_RCPT_IV_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			MSW_RCPT_IV_P_KEY_R w2 = MSW_RCPT_IV_P_KEY_R.create("W");
			hRevL_bldr.addInnerJoin(w2, bracket(hRevL_t.rcpt_iv_mng_no.eq(w2.rcpt_iv_mng_no)
											.and(hRevL_t.rcpt_iv_rev.eq(w2.rcpt_iv_rev))));
			dbSelect("MSBEL5740_MST_RCPT_IV_P_S01", _hRevL, hRevL_bldr);

			MST_RCPT_IV_D_P_R dRevL_t = MST_RCPT_IV_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2, bracket(dRevL_t.rcpt_iv_mng_no.eq(w2.rcpt_iv_mng_no)
											.and(dRevL_t.rcpt_iv_rev.eq(w2.rcpt_iv_rev))));
			dbSelect("MSBEL5740_MST_RCPT_IV_D_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		private void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加または更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_RCPT_IV_P_R.$rcpt_iv_mng_no, MST_RCPT_IV_P_R.$rcpt_iv_rev);
			MCList<MST_RCPT_IV_P_R> hUpd = MCList.create(MST_RCPT_IV_P_R.class);
			MCList<MST_RCPT_IV_P_R> hIns = MCList.create(MST_RCPT_IV_P_R.class);

			for (MST_RCPT_IV_R hcurrentR : _hCurrentL) {
				MST_RCPT_IV_P_R tempRevR = MST_RCPT_IV_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.rcpt_iv_mng_no(), hcurrentR.rcpt_iv_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBEL5740_MST_RCPT_IV_P_I01", hIns, MCQueryApiBuilder.create(MST_RCPT_IV_P_R.create("T")));
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5740_MST_RCPT_IV_P_U01", hUpd, hUpd_bldr);
			}

			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_RCPT_IV_D_P_R.$rcpt_iv_d_no, MST_RCPT_IV_D_P_R.$rcpt_iv_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_RCPT_IV_D_P_R.$rcpt_iv_mng_no);
			MCList<MST_RCPT_IV_D_P_R> dUpd = MCList.create(MST_RCPT_IV_D_P_R.class);
			MCList<MST_RCPT_IV_D_P_R> dIns = MCList.create(MST_RCPT_IV_D_P_R.class);

			for (MST_RCPT_IV_D_R dcurrentR : _dCurrentL) {
				MST_RCPT_IV_D_P_R tempRevR = MST_RCPT_IV_D_P_R.create();
				tempRevR.setByName(dcurrentR);

				// ヘッダーより改訂番号を取得
				MST_RCPT_IV_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.rcpt_iv_mng_no());
				tempRevR.rcpt_iv_rev(hCurrentR.rcpt_iv_rev());
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.rcpt_iv_d_no(), tempRevR.rcpt_iv_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				dbInsert("MSBEL5740_MST_RCPT_IV_D_P_I01", dIns, MCQueryApiBuilder.create(MST_RCPT_IV_D_P_R.create("T")));
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_D_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5740_MST_RCPT_IV_D_P_U01", dUpd, dUpd_bldr);
			}
		}
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
	 * 受領インボイスマップを登録する
	 */
	protected void insRcptIvMapCmn(MCList<MST_RCPT_IV_MAP_R> rcptIvMapL) {
		
		rcptIvMapL.forEach(r -> {
			r.rcpt_iv_no(nvl(r.rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
			r.arr_schd_no(nvl(r.arr_schd_no(), MAC_STR.NULL_VAL.value()));
			r.arr_act_no(nvl(r.arr_act_no(), MAC_STR.NULL_VAL.value()));
			r.trd_unit_qty(0);		// 不使用項目
		});
		
		MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
		
		// 受領インボイスマップを削除
		execDbDelete(
			"MSBEL5740_MST_RCPT_IV_MAP_D01",
			t1,
			t1.rcpt_iv_d_no.eq(bind("rcpt_iv_d_no")),
			rcptIvMapL.distinctNE(MST_RCPT_IV_MAP_R.$rcpt_iv_d_no)
		);
		
		// 入荷予定に対応する、仮登録分の受領インボイスＮＯを削除
		MCList<MST_RCPT_IV_MAP_R> schdL = rcptIvMapL.subList(r -> !isNullOrNullVal(r.arr_schd_no()));
		if (!schdL.isEmpty()) {
			MST_ARR_ACT_R w1 = MST_ARR_ACT_R.create("W1");
			execDbDelete(
				"MSBEL5740_MST_RCPT_IV_MAP_D02",
				t1,
				t1.rcpt_iv_d_no.eq(value(MAC_STR.NULL_VAL.value()))
				.and(
					t1.arr_act_no.in(
						subQuery()
						.select(w1.arr_act_no)
						.from(w1)
						.where(
							w1.arr_schd_no.eq(bind("arr_schd_no"))
							.and(w1.can_flg.eq(value(false)))
						)
					)
				),
				schdL
			);
		}
		
		// 入荷実績に対応する、仮登録分の受領インボイスＮＯを削除
		MCList<MST_RCPT_IV_MAP_R> actL = rcptIvMapL.subList(r -> !isNullOrNullVal(r.arr_act_no()));
		if (!actL.isEmpty()) {
			execDbDelete(
				"MSBEL5740_MST_RCPT_IV_MAP_D03",
				t1,
				t1.rcpt_iv_d_no.eq(value(MAC_STR.NULL_VAL.value()))
				.and(t1.arr_act_no.eq(bind("arr_act_no"))),
				actL
			);
		}
		
		// 受領インボイスマップを追加
		MCList<MST_RCPT_IV_MAP_R> insL = MCList.create(MST_RCPT_IV_MAP_R.class);
		insL.addAll(schdL);
		insL.addAll(actL);
		dbInsert(
			"MSBEL5740_MST_RCPT_IV_MAP_I01",
			insL,
			MCQueryApiBuilder.create(t1)
		);
	}
	/**
	 * RcptIv_Chk02オペレーション.<p>
	 *
	 * 受領インボイスＮＯ仮登録前のチェック処理を行う<br>
	 */
	public class RcptIv_Chk02 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initCache();
			doCheck();
			setDown();
		}
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected void initCache() {
			initRcptIvMapActCache();
		}
		
		/**
		 * 入荷実績をもとに作成された受領インボイスマップを取得
		 */
		protected MCList<MST_RCPT_IV_MAP_R> _rcptIvMapActL;
		protected MCIndexKey _rcptIvMapActIdx;
		protected void initRcptIvMapActCache() {
			
			_rcptIvMapActL = MCList.create(MST_RCPT_IV_MAP_R.class);
			_rcptIvMapActL.addAll(getRcptIvMapAct(up0()));
			_rcptIvMapActL.addAll(getRcptIvMapSchd(up0()));
			
			_rcptIvMapActIdx = _rcptIvMapActL.createIndex(MST_RCPT_IV_MAP_R.$arr_act_no);
		}
		
		protected MCList<MST_RCPT_IV_MAP_R> getRcptIvMapAct(MCList<RcptIv_Chk02_MapR> bindL) {
			MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
			MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
			MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T3");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.addSelect(t3.rcpt_iv_no, t3.rcpt_iv_mng_no);
			bldr.addLeftOuterJoin(t2, t2.rcpt_iv_d_no.eq(t1.rcpt_iv_d_no));
			bldr.addLeftOuterJoin(t3, t3.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no));
			bldr.setWhere(t1.arr_act_no.eq(bind("arr_act_no")));
			bldr.setOrderByAsc(t1.arr_act_no);
			bldr.setLockTable(t1.arr_act_no);
			
			MCList<MST_RCPT_IV_MAP_R> rsltL = MCList.create(MST_RCPT_IV_MAP_R.class);
			dbSelectForUpdate("MSBEL5740_MST_RCPT_IV_MAP_S01", rsltL, bldr, bindL);
			
			return rsltL;
		}
		
		/**
		 * 入荷予定をもとに作成された受領インボイスマップを取得
		 */
		protected MCList<MST_RCPT_IV_MAP_R> getRcptIvMapSchd(MCList<RcptIv_Chk02_MapR> bindL) {
			MST_ARR_ACT_R t0 = MST_ARR_ACT_R.create("T0");
			MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
			MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
			MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T3");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t0);
			bldr.removeSelect(t1.arr_act_no);
			bldr.addSelect(t0.arr_act_no, t3.rcpt_iv_no, t3.rcpt_iv_mng_no);
			bldr.addInnerJoin(t1, t1.arr_schd_no.eq(t0.arr_schd_no));
			bldr.addLeftOuterJoin(t2, t2.rcpt_iv_d_no.eq(t1.rcpt_iv_d_no));
			bldr.addLeftOuterJoin(t3, t3.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no));
			bldr.setWhere(t0.arr_act_no.eq(bind("arr_act_no")));
			bldr.setOrderByAsc(t1.arr_schd_no);
			bldr.setLockTable(t1.arr_schd_no);
			
			MCList<MST_RCPT_IV_MAP_R> rsltL = MCList.create(MST_RCPT_IV_MAP_R.class);
			dbSelectForUpdate("MSBEL5740_MST_RCPT_IV_MAP_S02", rsltL, bldr, bindL);
			
			return rsltL;
		}
		
		/**
		 * 仮登録前のチェック処理
		 */
		protected void doCheck() {
			MCMessageList msgL = new MCMessageList();
			
			for (RcptIv_Chk02_MapR r : up0()) {
				
				// 入荷実績が受領インボイス登録済みかチェック
				for (MST_RCPT_IV_MAP_R rcptIvMapR : _rcptIvMapActL.subList(_rcptIvMapActIdx, r.arr_act_no())) {
					if (!isNull(rcptIvMapR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no))) {
						msgL.add(
							new MCMessage(
								r, null,
								MSBEL1115,
								r.arr_act_no(),
								rcptIvMapR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_no),
								rcptIvMapR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_mng_no),
								toDispGUIIndex(r))
						);
						r.err_flg(true);
						break;
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
	}
	/**
	 * RcptIv_Upd02オペレーション.<p>
	 *
	 * 受領インボイスＮＯを仮登録する。<br>
	 */
	public class RcptIv_Upd02 extends MSBEL_RcptIvRegService_MC_A.RcptIv_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			insRcptIvMap();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().forEach(r -> {
				r.ivmap().rcpt_iv_d_no(MAC_STR.NULL_VAL.value());
				r.ivmap().arr_schd_no(MAC_STR.NULL_VAL.value());
				r.ivmap().trd_unit_qty(0);		// 不使用項目
			});
		}
		
		/**
		 * 受領インボイスマップを登録する
		 */
		protected void insRcptIvMap() {
			MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
			
			// 受領インボイスマップを削除
			execDbDelete(
				"MSBEL5740_MST_RCPT_IV_MAP_D02",
				t1,
				t1.arr_act_no.eq(bind("arr_act_no"))
					.and(t1.rcpt_iv_d_no.eq(value(MAC_STR.NULL_VAL.value()))),
				up0()
			);
			
			// 受領インボイスマップを追加
			dbInsert(
				"MSBEL5740_MST_RCPT_IV_MAP_I02",
				up0().subList(r -> !isNull(r.rcpt_iv_no())),
				MCQueryApiBuilder.create(t1)
			);
		}
	}

	//FMCB CUSTOM END
}