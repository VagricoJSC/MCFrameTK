package mcframe.serverMSBE.MSBEL5070;

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
import mcframe.serverMSBE.MSBEL5070.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverMSBE.MSBEL5070.Query.*;
import mcframe.serverMSBA.MSBAL5130.*;
import mcframe.serverMSBC.MSBCL5010.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_OPStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_OPStkRplService_MC extends MSBEL_OPStkRplService_MC_A{
	//FMCB CUSTOM START


	protected static final Class<MSBEL_OPStkRplService> CLAZZ = MSBEL_OPStkRplService.class;
	
	/**
	 * 版マスタ・キャッシュ
	 */
	protected FXUCL_Cache<MCList<MAM_ITM_VER_R>> _cacheVer;
	
	protected static void createItmVerCache(MCList<MAM_ITM_VER_R> dtlL) {
		object(CLAZZ)._createItmVerCache(dtlL);
	}

	/**
	 * キャッシュ作成（版マスタ）
	 */
	protected void _createItmVerCache(MCList<MAM_ITM_VER_R> dtlL) {
		MAW_ITM_VER_KEY_R wk = MAW_ITM_VER_KEY_R.create("WK");
		
		MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
		MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t);
		dbWkDelete("MSBEL5070_MAW_ITM_VER_D01", dtlL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5070_MAW_ITM_VER_I01", dtlL, dtlL_bldr.getBaseDbc());
		dtlL.clear();
		dtlL_bldr.setSelect(t.itm_cd);
		dtlL_bldr.addSelect(t.itm_sub1);
		dtlL_bldr.addSelect(t.itm_sub2);
		dtlL_bldr.addSelect(t.itm_sub3);
		dtlL_bldr.addSelect(t.site_cd);
		dtlL_bldr.addSelect(t.purc_st_dt);
		dtlL_bldr.addSelect(t.ver_no);
		dtlL_bldr.addInnerJoin(wk, bracket(wk.itm_cd.eq(t.itm_cd)
						.and(wk.itm_sub1.eq(t.itm_sub1))
						.and(wk.itm_sub2.eq(t.itm_sub2))
						.and(wk.itm_sub3.eq(t.itm_sub3))
						.and(wk.site_cd.eq(t.site_cd))));
		dbSelect("MSBEL5070_MAM_ITM_VER_S01", dtlL, dtlL_bldr);
		_cacheVer = new FXUCL_Cache<MCList<MAM_ITM_VER_R>>();
		_cacheVer.setFixMaxCacheSize(-1);
		String[] keys = new String[] {
				MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1,
				MAM_ITM_VER_R.$itm_sub2, MAM_ITM_VER_R.$itm_sub3,
				MAM_ITM_VER_R.$site_cd
		};
		for (MCList<MAM_ITM_VER_R> subL : dtlL.groupList(keys)) {
			_cacheVer.putCache(getVals(keys, subL.get(0)), subL);
		}
	}
	
	protected String getItmVerCache(OPRqst_Chk01_RsltR dtlR) {
		return object(CLAZZ)._getItmVerCache(dtlR);
	}

	/**
	 * キャッシュ取得（版マスタ）
	 */
	protected String _getItmVerCache(OPRqst_Chk01_RsltR dtlR){
		String[] keys = new String[] {
				OPRqst_Chk01_RsltR.$itm_cd, OPRqst_Chk01_RsltR.$itm_sub1,
				OPRqst_Chk01_RsltR.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub3,
				OPRqst_Chk01_RsltR.$strg_site_cd
		};
		MCList<MAM_ITM_VER_R> dbcL = _cacheVer.getCache(getVals(keys, dtlR));
		if (!isNull(dbcL)) {
			dbcL.sort(SortType.DESC, MAM_ITM_VER_R.$purc_st_dt);
			for (MAM_ITM_VER_R r : dbcL) {
				if (dtlR.end_schd_dt().gte(r.purc_st_dt())) {
					return r.ver_no();
				}
			}
		}
		return null;
	}
	
	/**
	 * OPRqst_Srch01オペレーション.<p>
	 *
	 */
	public class OPRqst_Srch01 extends MSBEL_OPStkRplService_MC_A.OPRqst_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		/**
		 * 検索処理
		 */
		protected void srch() {
			insStkRplWk();
			MCList<OPRqst_Srch01_RsltR> stkL = srchStk();
			MCList<OPRqst_Srch01_RsltR> ioSchdL = srchIoSchd();
			delStkRplWk();
			editDown(stkL, ioSchdL);
		}

		/**
		 * 在庫補充対象ワークテーブル登録
		 */
		protected void insStkRplWk() {
			MCList<MAM_STK_RPL_R> wkL = MCList.create(MAM_STK_RPL_R.class);
			addAll(wkL, up0(), createMap_MAM_STK_RPL_R_OPRqst_Srch01_CndR());
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_STK_RPL_R.create("T"));
			dbWkDelete("MSBEL5070_MAW_STK_RPL_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5070_MAW_STK_RPL_I01", wkL, wkL_bldr.getBaseDbc());
		}
		/**
		 * 在庫補充対象ワークテーブル削除
		 */
		protected void delStkRplWk() {
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_STK_RPL_R.create("T"));
			dbWkDelete("MSBEL5070_MAW_STK_RPL_D02", wkL_bldr.getBaseDbc());
		}

		/**
		 * 現状在庫検索
		 */
		protected MCList<OPRqst_Srch01_RsltR> srchStk() {
			MCList<OPRqst_Srch01_RsltR> rsltL = MCList.create(OPRqst_Srch01_RsltR.class);
			executeQuery(rsltL, MSBEL5070_MSVT_AVL_STK_S01());
			return rsltL;
		}

		/**
		 * 受払予定検索
		 */
		protected MCList<OPRqst_Srch01_RsltR> srchIoSchd() {
			MCList<OPRqst_Srch01_RsltR> rsltL = MCList.create(OPRqst_Srch01_RsltR.class);
			executeQuery(rsltL, MSBEL5070_MSVT_AVL_IO_SCHD_S01(), up0().get(0));
			return rsltL;
		}

		/**
		 * 下り電文編集
		 */
		protected void editDown(MCList<OPRqst_Srch01_RsltR> stkL, MCList<OPRqst_Srch01_RsltR> ioSchdL) {
			MCList<OPRqst_Srch01_RsltR> downL = MCList.create(OPRqst_Srch01_RsltR.class);
			addAll(downL, up0(), createMap_OPRqst_Srch01_RsltR_OPRqst_Srch01_CndR());
			String[] itmLocKeys = new String[] {
					OPRqst_Srch01_RsltR.$itm_cd,
					OPRqst_Srch01_RsltR.$itm_sub1,
					OPRqst_Srch01_RsltR.$itm_sub2,
					OPRqst_Srch01_RsltR.$itm_sub3,
					OPRqst_Srch01_RsltR.$strg_loc_cd
			};
			MCIndexKey upIdxKey = up0().createIndex(itmLocKeys);

			MAM_ITM_R t = MAM_ITM_R.create("T");

			// 品目マスタ検索
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.cont_fctr_flg);
			dbcItmL_bldr.addSelect(t.std_cont_fctr);
			dbcItmL_bldr.addSelect(t.cont_fctr_dec_place);
			dbcItmL_bldr.addSelect(t.cont_fctr_rnd_typ);

			FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcItmL_bldr, up0(),
				new String[] {
						OPRqst_Srch01_CndR.$itm_cd,
						OPRqst_Srch01_CndR.$itm_sub1,
						OPRqst_Srch01_CndR.$itm_sub2,
						OPRqst_Srch01_CndR.$itm_sub3});

			// 在庫数量と在庫有効成分計算
			for (OPRqst_Srch01_RsltR downR : downL) {
				MAM_ITM_R itmR = cacheItm.get(downR.itm_cd(), downR.itm_sub1(), downR.itm_sub2(), downR.itm_sub3());
				MCList<OPRqst_Srch01_RsltR> subL = stkL.subList(itmLocKeys, getVals(itmLocKeys, downR));
				downR.stk_qty(0);
				if (!isNull(subL)) {
					downR.stk_qty(subL.sum(OPRqst_Srch01_RsltR.$stk_qty));
					if (itmR.cont_fctr_flg()) {
						downR.stk_cont_qty(subL.sum(OPRqst_Srch01_RsltR.$stk_cont_qty));
					}
				}
			}
			// 受払予定入庫／出庫数量と有効成分計算
			for (OPRqst_Srch01_RsltR downR : downL) {
				MAM_ITM_R itmR = cacheItm.get(downR.itm_cd(), downR.itm_sub1(), downR.itm_sub2(), downR.itm_sub3());
				OPRqst_Srch01_CndR upR = up0().getFirst(upIdxKey, getVals(itmLocKeys, downR));
				MCList<OPRqst_Srch01_RsltR> subL = ioSchdL.subList(itmLocKeys, getVals(itmLocKeys, downR));
				if (!isNull(subL)) {
					downR.gr_schd_qty(subL.sum(OPRqst_Srch01_RsltR.$gr_schd_qty));
					downR.gi_schd_qty(subL.sum(OPRqst_Srch01_RsltR.$gi_schd_qty));
				}

				// 不足数計算
				downR.shortage_qty(calcShortageQty(downR.gr_schd_qty(),
						downR.stk_qty(),
						downR.gi_schd_qty(),
						upR.rord_stk_qty(),
						upR.gi_schd_flg()));

				// 不足有効成分数計算
				if (itmR.cont_fctr_flg()) {
					downR.gr_schd_cont_qty(subL.sum(OPRqst_Srch01_RsltR.$gr_schd_cont_qty));
					downR.gi_schd_cont_qty(subL.sum(OPRqst_Srch01_RsltR.$gi_schd_cont_qty));
					MCNumber rordStkContQty = MCNumber.ZERO;
					if (!isNull(upR.rord_stk_qty())) {
						rordStkContQty = convToContFctrUnit(upR.rord_stk_qty(),
								itmR.std_cont_fctr(),
								itmR.cont_fctr_dec_place(),
								itmR.cont_fctr_rnd_typ());
					}
					downR.shortage_cont_qty(calcShortageQty(downR.gr_schd_cont_qty(),
							downR.stk_cont_qty(),
							downR.gi_schd_cont_qty(),
							rordStkContQty,
							upR.gi_schd_flg()));
				}

				// 不足ＦＬＧ
				downR.shortage_flg(MCNumber.ZERO.lt(nvl(downR.shortage_qty(), MCNumber.ZERO)));
				// 依頼数
				if (downR.shortage_flg()) {
					downR.rqst_qty(nvl(upR.rord_rqst_qty(), downR.shortage_qty()));
				}
			}
			down0().setAll(downL);
		}

		/**
		 * 不足数計算
		 */
		protected MCNumber calcShortageQty(MCNumber grSchdQty,
				MCNumber stkQty,
				MCNumber giSchdQty,
				MCNumber rordStkQty,
				boolean giSchdFlg) {
			MCNumber grQty = nvl(grSchdQty, MCNumber.ZERO);
			grQty =  grQty.add(nvl(stkQty, MCNumber.ZERO));
			if(grQty.isNegative()) {
				grQty = MCNumber.ZERO;
			}
			MCNumber giQty = giSchdFlg?nvl(giSchdQty, MCNumber.ZERO):MCNumber.ZERO;
			MCNumber shortageQty = grQty.subtract(giQty);
			shortageQty = nvl(rordStkQty, MCNumber.ZERO).subtract(shortageQty);
			if (shortageQty.lte(MCNumber.ZERO)) {
				return null;
			}
			else {
				return shortageQty;
			}
		}

		protected Map_MAM_STK_RPL_R_OPRqst_Srch01_CndR<MAM_STK_RPL_R,OPRqst_Srch01_CndR> createMap_MAM_STK_RPL_R_OPRqst_Srch01_CndR() {
			return new Map_MAM_STK_RPL_R_OPRqst_Srch01_CndR<MAM_STK_RPL_R, OPRqst_Srch01_CndR>();
		}
		public class Map_MAM_STK_RPL_R_OPRqst_Srch01_CndR<D extends MAM_STK_RPL_R, S extends OPRqst_Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAM_STK_RPL_R.$itm_cd, OPRqst_Srch01_CndR.$itm_cd);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub1, OPRqst_Srch01_CndR.$itm_sub1);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub2, OPRqst_Srch01_CndR.$itm_sub2);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub3, OPRqst_Srch01_CndR.$itm_sub3);
				addColumnPathMap(MAM_STK_RPL_R.$loc_cd, OPRqst_Srch01_CndR.$strg_loc_cd);
			}
		}

		protected Map_OPRqst_Srch01_RsltR_OPRqst_Srch01_CndR<OPRqst_Srch01_RsltR,OPRqst_Srch01_CndR> createMap_OPRqst_Srch01_RsltR_OPRqst_Srch01_CndR() {
			return new Map_OPRqst_Srch01_RsltR_OPRqst_Srch01_CndR<OPRqst_Srch01_RsltR, OPRqst_Srch01_CndR>();
		}
		public class Map_OPRqst_Srch01_RsltR_OPRqst_Srch01_CndR<D extends OPRqst_Srch01_RsltR, S extends OPRqst_Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OPRqst_Srch01_RsltR.$itm_cd, OPRqst_Srch01_CndR.$itm_cd);
				addColumnPathMap(OPRqst_Srch01_RsltR.$itm_sub1, OPRqst_Srch01_CndR.$itm_sub1);
				addColumnPathMap(OPRqst_Srch01_RsltR.$itm_sub2, OPRqst_Srch01_CndR.$itm_sub2);
				addColumnPathMap(OPRqst_Srch01_RsltR.$itm_sub3, OPRqst_Srch01_CndR.$itm_sub3);
				addColumnPathMap(OPRqst_Srch01_RsltR.$strg_loc_cd, OPRqst_Srch01_CndR.$strg_loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.rqst_qty(0);
				dest.gr_schd_qty(0);
				dest.stk_qty(0);
				dest.gi_schd_qty(0);
				dest.shortage_qty(0);
				dest.shortage_flg(false);
			}
		}

	}

	/**
	 * OPRqst_Srch02オペレーション.<p>
	 *
	 */
	public class OPRqst_Srch02 extends MSBEL_OPStkRplService_MC_A.OPRqst_Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		/**
		 * 検索処理
		 */
		protected void srch() {
			if (up0().isEmpty()) {
				return;
			}
			insWk();
			srchItmDtl();
			srchAllocCtl();
			delWk();
			MCList<OPRqst_Srch02_RsltR> downL = calcRqstQty();
			editDown(downL);
		}

		/**
		 * 品目詳細マスタ・キャッシュ
		 */
		protected FXUCL_Cache<MCList<OPRqst_Srch02_RsltR>> _cacheItmDtlL;
		protected String[] _itmDtlKey = new String[] {
				OPRqst_Srch02_RsltR.$itm_cd,
				OPRqst_Srch02_RsltR.$itm_sub1,
				OPRqst_Srch02_RsltR.$itm_sub2,
				OPRqst_Srch02_RsltR.$itm_sub3,
				OPRqst_Srch02_RsltR.$strg_loc_cd};
		/**
		 * 引当制御マスタ・キャッシュ
		 */
		protected FXUCL_Cache<MCList<MAM_ALLOC_CTL_R>> _cacheAllocCtlL;

		/**
		 * ワークテーブル登録
		 */
		protected void insWk() {
			MCList<MAM_STK_RPL_R> wkL = MCList.create(MAM_STK_RPL_R.class);
			addAll(wkL, up0().groupBy(_itmDtlKey), createMap_MAM_STK_RPL_R_OPRqst_Srch02_RsltR());
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_STK_RPL_R.create("T"));
			dbWkDelete("MSBEL5070_MAW_STK_RPL_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5070_MAW_STK_RPL_I02", wkL, wkL_bldr.getBaseDbc());
		}
		/**
		 * ワークテーブル削除
		 */
		protected void delWk() {
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_STK_RPL_R.create("T"));
			dbWkDelete("MSBEL5070_MAW_STK_RPL_D04", wkL_bldr.getBaseDbc());
		}

		/**
		 * 品目詳細マスタ検索
		 */
		protected void srchItmDtl() {
			_cacheItmDtlL = new FXUCL_Cache<MCList<OPRqst_Srch02_RsltR>>();
			_cacheItmDtlL.setFixMaxCacheSize(-1);
			MCList<OPRqst_Srch02_RsltR> dbcL = MCList.create(OPRqst_Srch02_RsltR.class);
			executeQuery(dbcL, MSBEL5070_MAM_ITM_DTL_S01(), up0().get(0));
			// 上り電文より項目補完
			MCJoinKey<MCList<OPRqst_Srch02_RsltR>> jk = dbcL.join(_itmDtlKey, up0(), _itmDtlKey);
			join(dbcL, jk, createMap_OPRqst_Srch02_RsltR_OPRqst_Srch02_RsltR());
			// キャッシュ作成
			for (MCList<OPRqst_Srch02_RsltR> subL : dbcL.groupList(_itmDtlKey)) {
				_cacheItmDtlL.putCache(getVals(_itmDtlKey, subL.get(0)), subL);
			}
		}

		/**
		 * 引当制御マスタ検索
		 */
		protected void srchAllocCtl() {
			_cacheAllocCtlL = new FXUCL_Cache<MCList<MAM_ALLOC_CTL_R>>();
			_cacheAllocCtlL.setFixMaxCacheSize(-1);
			MCList<MAM_ALLOC_CTL_R> dbcL = MCList.create(MAM_ALLOC_CTL_R.class);
			executeQuery(dbcL, MSBEL5070_MAM_ALLOC_CTL_S01());

			String[] allocCtlKeys = new String[] {
					MAM_ALLOC_CTL_R.$to_loc_cd
				};
			for (MCList<MAM_ALLOC_CTL_R> subL : dbcL.groupList(allocCtlKeys)) {
				_cacheAllocCtlL.putCache(getVals(allocCtlKeys, subL.get(0)), subL);
			}
		}
		
		/**
		 * 補充方法を決定し、補充数量を計算する
		 */
		protected MCList<OPRqst_Srch02_RsltR> calcRqstQty() {
			// 補充方法決定
			MCList<OPRqst_Srch02_RsltR> routeL = getRplRoute();
			setRplMtdTyp(routeL);
			
			// 補充数量計算
			MCIndexKey idx = routeL.createIndex(_itmDtlKey);
			for (OPRqst_Srch02_RsltR r : routeL.groupBy(_itmDtlKey)) {
				calcRqstQty(routeL.subList(idx, getVals(_itmDtlKey, r)));
			}
			//ロットサイジングＦＬＧと品目詳細マスタの設定を考慮して、補充数量を計算する
			calcRqstQtyBySzg(routeL);
			return routeL;
		}

		/**
		 * 優先順位、オーダ比率により補充数量を計算する
		 */
		protected void calcRqstQty(MCList<OPRqst_Srch02_RsltR> itmL) {
			// 案分比率の補完
			for (OPRqst_Srch02_RsltR r : itmL) {
				if (isNull(r.order_ratio()) || MCNumber.ZERO.gte(r.order_ratio())) {
					r.order_ratio(MCNumber.ONE);
				}
			}
			
			// 補充数計算
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$prio);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$mfg_loc_cd);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$bom_ptn);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$sppl_cd);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$maker_cd);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$rqst_loc_cd);
			sp.add(SortType.ASC, OPRqst_Srch02_RsltR.$rqst_str_ln_cd);
			itmL.sort(sp);
			MCNumber sumQty = itmL.get(0).rqst_qty();
			MCNumber sumRatio = itmL.sum(OPRqst_Srch02_RsltR.$order_ratio);
			for (int i = 0; i < itmL.size(); i++) {
				OPRqst_Srch02_RsltR tgtR = itmL.get(i);
				if (isNull(sumQty) || MCNumber.ZERO.gte(sumQty)) {

					tgtR.rqst_qty(MCNumber.ZERO);
					continue;
				}
				MCNumber rqstQty = sumQty;
				if (i < itmL.size() - 1) {
					rqstQty = sumQty.multiply(
							tgtR.order_ratio()).divide(
									sumRatio,
									tgtR.dec_place().intValue(),
									MAC_RND_TYP.RNDUP.toMC());
					sumQty = sumQty.subtract(rqstQty);
					sumRatio = sumRatio.subtract(tgtR.order_ratio());
					if (sumQty.lt(MCNumber.ZERO)) {
						rqstQty = rqstQty.add(sumQty);
						sumQty = MCNumber.ZERO;
					}
				}
				else {
					rqstQty = sumQty;
				}
				tgtR.rqst_qty(rqstQty);
			}
			
		}

		/**
		 * ロットサイジングＦＬＧと品目詳細マスタの設定を考慮して、補充数量を計算する
		 */
		protected void calcRqstQtyBySzg(MCList<OPRqst_Srch02_RsltR> routeL) {
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create("T");

			MCList<OPRqst_Srch02_RsltR> splitL = MCList.create(OPRqst_Srch02_RsltR.class);
			MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
			dbcStkL_bldr.setSelect(t.lot_sizing_flg);
			dbcStkL_bldr.addSelect(t.rord_rqst_qty);
			FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R> cacheStk = new FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R>(dbcStkL_bldr, routeL,
					new String[] {
							OPRqst_Srch02_RsltR.$itm_cd,
							OPRqst_Srch02_RsltR.$itm_sub1,
							OPRqst_Srch02_RsltR.$itm_sub2,
							OPRqst_Srch02_RsltR.$itm_sub3,
							OPRqst_Srch02_RsltR.$strg_loc_cd
							});
			for (OPRqst_Srch02_RsltR tgtR :routeL) {
				MAM_STK_RPL_R dbcStkR = cacheStk.get(tgtR.master_dt(), tgtR.itm_cd(), tgtR.itm_sub1(), tgtR.itm_sub2(), tgtR.itm_sub3(), tgtR.strg_loc_cd());
				if(!isNull(tgtR.min_lot_qty()) && isNull(dbcStkR.rord_rqst_qty()) && dbcStkR.lot_sizing_flg()) {
					MCNumber min_lot_qty = tgtR.min_lot_qty();
					MCNumber max_lot_qty = tgtR.max_lot_qty();
					MCNumber batch_lot_qty = tgtR.batch_lot_qty();
					MCNumber yield_schd_qty = tgtR.yield_schd_qty();
					MCNumber mfg_inst_qty = tgtR.mfg_inst_qty();
					MCNumber fxd_rqmt_qty = nvl(tgtR.fxd_rqmt_qty(),MCNumber.ZERO);
					if(!MSC_OP_RPL_MTD_TYP.isMFG(tgtR.op_rpl_mtd_typ())) {
						yield_schd_qty = MCNumber.ONE;
						mfg_inst_qty = MCNumber.ONE;
						fxd_rqmt_qty = MCNumber.ZERO;
					}
					if (batch_lot_qty.eq(MCNumber.ZERO) || max_lot_qty.eq(min_lot_qty)) {
						batch_lot_qty = MCNumber.ONE.divide(Math.pow(10, tgtR.dec_place().intValue()));
					}
					if (min_lot_qty.subtract(max_lot_qty).gt(MCNumber.ZERO)) {
						max_lot_qty = MCNumber.ZERO;
					}
					//最大ロット補正
					MCNumber max_lot_qty_h = max_lot_qty.subtract(min_lot_qty).divide(batch_lot_qty,
																					tgtR.dec_place().intValue(),
																					MAC_RND_TYP.CUTOFF.toMC()).multiply(batch_lot_qty).add(min_lot_qty);
					//最小正味供給数
					MCNumber supply_min = (min_lot_qty.subtract(fxd_rqmt_qty).multiply(yield_schd_qty).divide(mfg_inst_qty,tgtR.dec_place().intValue(), MAC_RND_TYP.CUTOFF.toMC()));
					//最大正味供給数
					MCNumber supply_max = (max_lot_qty_h.subtract(fxd_rqmt_qty).multiply(yield_schd_qty).divide(mfg_inst_qty,tgtR.dec_place().intValue(), MAC_RND_TYP.CUTOFF.toMC()));
					//指図件数 
					MCNumber mfg_cnt = MCNumber.ONE;
					if (!max_lot_qty.eq(MCNumber.ZERO)) {
						mfg_cnt = tgtR.rqst_qty().divide(supply_max, MCNumber.ZERO.intValue(), MAC_RND_TYP.RNDUP.toMC());
					}
					//供給数をいったん残数
					MCNumber supply_tmp = tgtR.rqst_qty().subtract(supply_min.multiply(mfg_cnt));
					if (supply_tmp.isNegative()) {
						supply_tmp = MCNumber.ZERO;
					}

					for (int j = 0; j < mfg_cnt.intValue(); j++) {
						OPRqst_Srch02_RsltR splitR = tgtR.clone();
						MCNumber supply_qty;
						if(supply_min.add(supply_tmp).gt(supply_max) && !max_lot_qty.eq(MCNumber.ZERO)) {
							//供給数
							supply_qty = supply_max.subtract(supply_min);
						}
						else {
							supply_qty = supply_tmp;
						}
						MCNumber yield_schd_qty_tmp = supply_min.add(supply_qty);
						MCNumber mfg_inst_qty_tmp = yield_schd_qty_tmp.multiply(mfg_inst_qty).divide(yield_schd_qty,tgtR.dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()).add(fxd_rqmt_qty).subtract(min_lot_qty).divide(batch_lot_qty, 0, MAC_RND_TYP.RNDUP.toMC()).multiply(batch_lot_qty).add(min_lot_qty);
						supply_tmp = supply_tmp.subtract(supply_qty);
						splitR.rqst_qty(mfg_inst_qty_tmp);
						splitL.add(splitR);
					}
					if(mfg_cnt.eq(MCNumber.ZERO)) {
						splitL.add(tgtR);
					}
				}
				else {
					splitL.add(tgtR);
				}
			}
			routeL.clear();
			routeL.addAll(splitL);
		}

		/**
		 * 補充方法判定
		 */
		protected void setRplMtdTyp(MCList<OPRqst_Srch02_RsltR> rplL) {
			for (OPRqst_Srch02_RsltR r : rplL) {
				if (!isNullOrNullVal(r.mfg_loc_cd())) {
					if (!isNullOrNullVal(r.mfg_loc_sppl_cd())) {
						r.op_rpl_mtd_typ(MSC_OP_RPL_MTD_TYP.OUTSRC.value());
					}
					else {
						r.op_rpl_mtd_typ(MSC_OP_RPL_MTD_TYP.MFG.value());
					}
				}
				else if (!isNullOrNullVal(r.sppl_cd())) {
					r.op_rpl_mtd_typ(MSC_OP_RPL_MTD_TYP.PURC.value());
				}
				else if (!isNullOrNullVal(r.rqst_loc_cd())) {
					r.op_rpl_mtd_typ(MSC_OP_RPL_MTD_TYP.XFR.value());
				}
			}
		}

		/**
		 * 補充ルート取得
		 */
		protected MCList<OPRqst_Srch02_RsltR> getRplRoute() {
			MCList<OPRqst_Srch02_RsltR> downL = MCList.create(OPRqst_Srch02_RsltR.class);
			for (OPRqst_Srch02_RsltR upR : up0()) {
				MCList<OPRqst_Srch02_RsltR> itmDtlL = getItmDtlInfo(upR);
				if (isNull(itmDtlL)) {
					downL.add(upR);
					continue;
				}
				// 依頼先場所がすでに指定された場合
				if (!isNullOrNullVal(upR.rqst_loc_cd())) {
					downL.add(upR);
					continue;
				}
				// 移動・移送かどうか
				MCList<OPRqst_Srch02_RsltR> rsltL0 = MCList.create(OPRqst_Srch02_RsltR.class);
				MCList<OPRqst_Srch02_RsltR> xfrL = itmDtlL.groupBy(OPRqst_Srch02_RsltR.$rqst_loc_cd);
				for (OPRqst_Srch02_RsltR r : xfrL) {
					if (!isNullOrNullVal(r.rqst_loc_cd())) {
						rsltL0.addAll(itmDtlL.subList(OPRqst_Srch02_RsltR.$rqst_loc_cd, r.rqst_loc_cd()));
					}
				}
				if (!isNull(rsltL0)) {
					downL.addAll(rsltL0);
					continue;
				}
				// 購買かどうか
				MCList<OPRqst_Srch02_RsltR> spplL = itmDtlL.groupBy(OPRqst_Srch02_RsltR.$sppl_cd);
				for (OPRqst_Srch02_RsltR r : spplL) {
					if (!isNullOrNullVal(r.sppl_cd())) {
						rsltL0.addAll(itmDtlL.subList(OPRqst_Srch02_RsltR.$sppl_cd, r.sppl_cd()));
					}
				}
				if (!isNull(rsltL0)) {
					downL.addAll(rsltL0);
					continue;
				}
				// 製造・外注の判断
				// 製造場所＝格納場所の設定が存在するか
				MCList<OPRqst_Srch02_RsltR> rsltL1 = itmDtlL.subList(OPRqst_Srch02_RsltR.$mfg_loc_cd, upR.strg_loc_cd());
				if (!isNull(rsltL1)) {
					MCList<OPRqst_Srch02_RsltR> notOutsrcMfgLocL = rsltL1.subList(new notOutsrcMfgLocMatcher());
					if (!isNull(notOutsrcMfgLocL)) {
						downL.addAll(notOutsrcMfgLocL);
						continue;
					}
				}
				// 引当制御マスタの設定により専用経路の判断
				MCList<MAM_ALLOC_CTL_R> cacheL = _cacheAllocCtlL.getCache(
						new Comparable[] {
							upR.strg_loc_cd()
						});
				// 格納場所と結ぶ経路が存在するか
				MCList<OPRqst_Srch02_RsltR> rsltL2 = MCList.create(OPRqst_Srch02_RsltR.class);
				if (!isNull(cacheL)) {
					MCList<MAM_ALLOC_CTL_R> alcCtlL = MCList.create(MAM_ALLOC_CTL_R.class);
					cacheL.sort(SortType.DESC, MAM_ALLOC_CTL_R.$prio);
					for (MAM_ALLOC_CTL_R r : cacheL) {
						if (r.prio().gte(MCNumber.ZERO)) {
							if (isSameItm(upR, r) || isNullOrNullVal(r.itm_cd())) {
								alcCtlL.add(r);
							}
						}
						else {
							if (isSameItm(upR, r)) {
								alcCtlL.removeAll(alcCtlL.subList(MAM_ALLOC_CTL_R.$fr_loc_cd, r.fr_loc_cd()));
							}
						}
					}
					for (MAM_ALLOC_CTL_R r : alcCtlL) {
						MCList<OPRqst_Srch02_RsltR> frMfgLocL = itmDtlL.subList(OPRqst_Srch02_RsltR.$mfg_loc_cd, r.fr_loc_cd());
						rsltL2.addAll(frMfgLocL.subList(new notOutsrcMfgLocMatcher()));
					}
				}
				if (!isNull(rsltL2)) {
					downL.addAll(rsltL2);
					continue;
				}
				// 格納場所と結ぶ禁止経路が存在するか
				MCList<OPRqst_Srch02_RsltR> rsltL3 = MCList.create(OPRqst_Srch02_RsltR.class);
				if (!isNull(cacheL)) {
					cacheL.sort(SortType.ASC, MAM_ALLOC_CTL_R.$prio);
					MCList<MAM_ALLOC_CTL_R> alcCtlL = MCList.create(MAM_ALLOC_CTL_R.class);
					for (MAM_ALLOC_CTL_R r : cacheL) {
						if (r.prio().lt(MCNumber.ZERO)) {
							if (isSameItm(upR, r) || isNullOrNullVal(r.itm_cd())) {
								alcCtlL.add(r);
							}
						}
						else {
							if (isSameItm(upR, r)) {
								alcCtlL.removeAll(alcCtlL.subList(MAM_ALLOC_CTL_R.$fr_loc_cd, r.fr_loc_cd()));
							}
						}
					}
					for (MAM_ALLOC_CTL_R r : alcCtlL) {
						itmDtlL.removeAll(itmDtlL.subList(OPRqst_Srch02_RsltR.$mfg_loc_cd, r.fr_loc_cd()));
					}
				}
				// 同一場所Ｇの製造場所が存在するか
				for (OPRqst_Srch02_RsltR r : itmDtlL) {
					// 格納場所が外注場所の場合は対象外
					if (!isNull(r.getStringNE("strg_sppl_cd"))) {
						continue;
					}
					if (isSame(r.strg_loc_grp_cd(), r.mfg_loc_grp_cd())
							|| isNullOrNullVal(r.mfg_loc_grp_cd())) {
						rsltL3.add(r);
					}
				}
				if (!isNull(rsltL3)) {
					downL.addAll(rsltL3);
				}
				else {
					downL.add(upR);
				}
			}
			return downL;
		}

		public class notOutsrcMfgLocMatcher implements MCRowMatcher<OPRqst_Srch02_RsltR> {
			@Override
			public boolean match(OPRqst_Srch02_RsltR r) {
				// 格納場所が外注場所の場合は対象外
				if (!isNull(r.getStringNE("strg_sppl_cd"))) {
					return false;
				}
				return true;
			}
		}

		protected MCList<OPRqst_Srch02_RsltR> getItmDtlInfo(OPRqst_Srch02_RsltR con) {
			return _cacheItmDtlL.getCache(getVals(_itmDtlKey, con));
		}

		protected boolean isSameItm(MCRow row1, MCRow row2) {
			return isSame(row1.getStringNE(MAM_ITM_R.$itm_cd), row2.getStringNE(MAM_ITM_R.$itm_cd)) &&
					isSame(row1.getStringNE(MAM_ITM_R.$itm_sub1), row2.getStringNE(MAM_ITM_R.$itm_sub1)) &&
					isSame(row1.getStringNE(MAM_ITM_R.$itm_sub2), row2.getStringNE(MAM_ITM_R.$itm_sub2)) &&
					isSame(row1.getStringNE(MAM_ITM_R.$itm_sub3), row2.getStringNE(MAM_ITM_R.$itm_sub3));
		}

		protected Map_MAM_STK_RPL_R_OPRqst_Srch02_RsltR<MAM_STK_RPL_R, OPRqst_Srch02_RsltR> createMap_MAM_STK_RPL_R_OPRqst_Srch02_RsltR() {
			return new Map_MAM_STK_RPL_R_OPRqst_Srch02_RsltR<MAM_STK_RPL_R, OPRqst_Srch02_RsltR>();
		}
		public class Map_MAM_STK_RPL_R_OPRqst_Srch02_RsltR<D extends MAM_STK_RPL_R, S extends OPRqst_Srch02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAM_STK_RPL_R.$itm_cd, OPRqst_Srch02_RsltR.$itm_cd);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub1, OPRqst_Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub2, OPRqst_Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MAM_STK_RPL_R.$itm_sub3, OPRqst_Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MAM_STK_RPL_R.$loc_cd, OPRqst_Srch02_RsltR.$strg_loc_cd);
			}
		}

		protected Map_OPRqst_Srch02_RsltR_OPRqst_Srch02_RsltR<OPRqst_Srch02_RsltR, OPRqst_Srch02_RsltR> createMap_OPRqst_Srch02_RsltR_OPRqst_Srch02_RsltR() {
			return new Map_OPRqst_Srch02_RsltR_OPRqst_Srch02_RsltR<OPRqst_Srch02_RsltR, OPRqst_Srch02_RsltR>();
		}
		public class Map_OPRqst_Srch02_RsltR_OPRqst_Srch02_RsltR<D extends OPRqst_Srch02_RsltR, S extends OPRqst_Srch02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_qty, OPRqst_Srch02_RsltR.$rqst_qty);
				addColumnPathMap(OPRqst_Srch02_RsltR.$dec_place, OPRqst_Srch02_RsltR.$dec_place);
				addColumnPathMap(OPRqst_Srch02_RsltR.$master_dt, OPRqst_Srch02_RsltR.$master_dt);
			}
		}
		
		protected void editDown(MCList<OPRqst_Srch02_RsltR> downL) {
			down0().setAll(downL);
		}
		
	}

	/**
	 * OPRqst_Chk01オペレーション.<p>
	 *
	 */
	public class OPRqst_Chk01 extends MSBEL_OPStkRplService_MC_A.OPRqst_Chk01 {
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
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 0)) {
				if (isSame(column, OPRqst_Chk01_RsltR.$rqst_wg_cd)) {
					if (MSC_OP_RPL_MTD_TYP
							.isPURC(row.getString(OPRqst_Chk01_RsltR.$op_rpl_mtd_typ))
							&& MAC_ASSET_MNG_TYP.isNOT_MNG(
									row.getString(OPRqst_Chk01_RsltR.$asset_mng_typ))) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<OPRqst_Chk01_RsltR> notErrL = getChkList(up0());
			for (OPRqst_Chk01_RsltR upR : notErrL) {
				if (isNull(upR.st_schd_dt()) && isNull(upR.end_schd_dt())) {
					upR.st_schd_dt(getToday());
				}
				if (isNull(upR.master_dt())) {
					upR.master_dt(getToday());
				}
			}
			// 予定日計算
			MCList<Ord_Sprt03_RsltR> schdDtL = callOrdRegSvcSprt3(notErrL);
			MCIndexKey schdDtKey = schdDtL.createIndex(Ord_Sprt03_RsltR.$peg_no);
			for(OPRqst_Chk01_RsltR upR : notErrL) {
				Ord_Sprt03_RsltR ordSprt03RsltR = schdDtL.getFirst(schdDtKey, upR.peg_no());
				if(!isNull(ordSprt03RsltR)) {
					setStSchdDt(upR, ordSprt03RsltR);
					setEndSchdDt(upR, ordSprt03RsltR);
				}
			}

			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			// 品目詳細マスタの存在チェックを行う
			for(OPRqst_Chk01_RsltR upR : notErrL) {
				// 手配ＮＯ１～４
				// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno1_mng_typ())) {
					upR.sno1(nullValToNull(upR.sno1()));
					if (isNull(upR.sno1())) {
						msgL.add(new MCMessage(upR, OPRqst_Chk01_RsltR.$sno1,
								MSUCL0009, toDispItm(upR.itm_cd(), upR.itm_sub1(),
										upR.itm_sub2(), upR.itm_sub3()),
								toDispGUIIndex(upR)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno2_mng_typ())) {
					upR.sno2(nullValToNull(upR.sno2()));
					if (isNull(upR.sno2())) {
						msgL.add(new MCMessage(upR, OPRqst_Chk01_RsltR.$sno2,
								MSUCL0010, toDispItm(upR.itm_cd(), upR.itm_sub1(),
										upR.itm_sub2(), upR.itm_sub3()),
								toDispGUIIndex(upR)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno3_mng_typ())) {
					upR.sno3(nullValToNull(upR.sno3()));
					if (isNull(upR.sno3())) {
						msgL.add(new MCMessage(upR, OPRqst_Chk01_RsltR.$sno3,
								MSUCL0011, toDispItm(upR.itm_cd(), upR.itm_sub1(),
										upR.itm_sub2(), upR.itm_sub3()),
								toDispGUIIndex(upR)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(upR.sno4_mng_typ())) {
					upR.sno4(nullValToNull(upR.sno4()));
					if (isNull(upR.sno4())) {
						msgL.add(new MCMessage(upR, OPRqst_Chk01_RsltR.$sno4,
								MSUCL0012, toDispItm(upR.itm_cd(), upR.itm_sub1(),
										upR.itm_sub2(), upR.itm_sub3()),
								toDispGUIIndex(upR)));
					}
				}

				if(MSC_OP_RPL_MTD_TYP.isXFR(upR.op_rpl_mtd_typ())) {
					if(!isSame(upR.strg_wg_cd(), upR.rqst_wg_cd())) {
						MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
						copy(itmDtlR, upR, createMap_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR());
						itmDtlL.add(itmDtlR);
					}
				}
				else {
					MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
					copy(itmDtlR, upR, createMap_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR());
					itmDtlL.add(itmDtlR);					
				}
			}
			if(!isNull(itmDtlL)) {
				msgL.addAll(MSUCL_ProdUtil.chkItmDtlKey(itmDtlL));
				setErrFlg(up0());
				notErrL = getChkList(up0());
			}
			
			MCList<OPRqst_Chk01_RsltR> notErrVerL = notErrL.subList(OPRqst_Chk01_RsltR.$ver_flg, true);
						
			// 版マスタ・キャッシュ
			MCList<MAM_ITM_VER_R> dbcL = MCList.create(MAM_ITM_VER_R.class);
			addAll(dbcL,
					notErrVerL.groupBy(OPRqst_Chk01_RsltR.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd,
							OPRqst_Chk01_RsltR.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub2,
							OPRqst_Chk01_RsltR.$itm_sub3,
							OPRqst_Chk01_RsltR.$strg_site_cd),
					createMap_MAM_ITM_VER_R_OPRqst_Chk01_RsltR());
			
			createItmVerCache(dbcL);
			
			for(OPRqst_Chk01_RsltR r : notErrVerL) {
				if(isNull(r.ver_no())) {
					if (MSC_OP_RPL_MTD_TYP.isPURC(r.op_rpl_mtd_typ())
							|| MSC_OP_RPL_MTD_TYP.isOUTSRC(r.op_rpl_mtd_typ())
							|| MSC_OP_RPL_MTD_TYP.isXFR(r.op_rpl_mtd_typ())) {
						
						r.ver_no(getItmVerCache(r));
						if(isNull(r.ver_no())) {
							msgL.add(new MCMessage(r, null, MSBEL0124,
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
											r.itm_sub3()),
									r.strg_site_cd(), toYMDString(r.end_schd_dt()),
									toDispGUIIndex(r)));
						}
					}
				}
			}
			
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		protected Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<MAM_ITM_DTL_R,OPRqst_Chk01_RsltR> createMap_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR() {
			return new Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<MAM_ITM_DTL_R, OPRqst_Chk01_RsltR>();
		}

		public class Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<D extends MAM_ITM_DTL_R, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAM_ITM_DTL_R.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MAM_ITM_DTL_R.$mfg_loc_cd, OPRqst_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$rqst_loc_cd, OPRqst_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$bom_ptn, OPRqst_Chk01_RsltR.$bom_ptn);
				addColumnPathMap(MAM_ITM_DTL_R.$wg_cd, OPRqst_Chk01_RsltR.$strg_wg_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$st_dt, OPRqst_Chk01_RsltR.$master_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(isNullOrNullVal(src.mfg_loc_cd())) {
					dest.sppl_cd(src.sppl_cd());
					dest.maker_cd(src.maker_cd());
				}
				else {
					dest.sppl_cd(MAC_STR.NULL_VAL.value());
					dest.maker_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		protected Map_MAM_ITM_VER_R_OPRqst_Chk01_RsltR<MAM_ITM_VER_R, OPRqst_Chk01_RsltR> createMap_MAM_ITM_VER_R_OPRqst_Chk01_RsltR() {
			return new Map_MAM_ITM_VER_R_OPRqst_Chk01_RsltR<MAM_ITM_VER_R, OPRqst_Chk01_RsltR>();
		}
		public class Map_MAM_ITM_VER_R_OPRqst_Chk01_RsltR<D extends MAM_ITM_VER_R, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAM_ITM_VER_R.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MAM_ITM_VER_R.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MAM_ITM_VER_R.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MAM_ITM_VER_R.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MAM_ITM_VER_R.$site_cd, OPRqst_Chk01_RsltR.$strg_site_cd);
			}
		}
	}
	/**
	 * OPRqst_Ins01オペレーション.<p>
	 *
	 */
	public class OPRqst_Ins01 extends MSBEL_OPStkRplService_MC_A.OPRqst_Ins01 {

		/**
		 * 場所マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;

		/**
		 * 品目詳細スタ・キャッシュ
		 */
		protected FXUCL_Cache<MCList<MAM_ITM_DTL_R>> _cacheitmDtl;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			crtCache();
			callShipDmndRqstSvc();
			callOrdRegSvc();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp() {
			for (OPRqst_Chk01_RsltR upR : up0()) {
				if (isNull(upR.st_schd_dt()) && isNull(upR.end_schd_dt())) {
					upR.st_schd_dt(getToday());
				}
				if (isNull(upR.master_dt())) {
					upR.master_dt(getToday());
				}
			}
		}

		/**
		 * キャッシュ初期化
		 */
		protected void crtCache() {
			MAM_LOC_R t = MAM_LOC_R.create("T");

			// 場所マスタ
			MCQueryApiBuilder dbcLocL_bldr = MCQueryApiBuilder.create(t);
			dbcLocL_bldr.setSelect(t.loc_cd);
			dbcLocL_bldr.addSelect(t.sppl_cd);
			dbcLocL_bldr.addSelect(t.maker_cd);
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcLocL_bldr, up0(), new String[] {
				OPRqst_Chk01_RsltR.$mfg_loc_cd
			});
			MAM_ITM_DTL_R t1 = MAM_ITM_DTL_R.create("T");
			MAW_ITM_DTL_KEY_R wk = MAW_ITM_DTL_KEY_R.create("WK");

			// 品目詳細マスタ
			MCList<MAM_ITM_DTL_R> dbcItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MCQueryApiBuilder dbcItmDtlL_bldr = MCQueryApiBuilder.create(t1);
			addAll(dbcItmDtlL, up0(), createMap_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR());
			dbWkDelete("MSBEL5070_MAW_ITM_DTL_D01", dbcItmDtlL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5070_MAW_ITM_DTL_I01", dbcItmDtlL, dbcItmDtlL_bldr.getBaseDbc());
			dbcItmDtlL_bldr.setSelect(t1.itm_cd);
			dbcItmDtlL_bldr.addSelect(t1.itm_sub1);
			dbcItmDtlL_bldr.addSelect(t1.itm_sub2);
			dbcItmDtlL_bldr.addSelect(t1.itm_sub3);
			dbcItmDtlL_bldr.addSelect(t1.mfg_loc_cd);
			dbcItmDtlL_bldr.addSelect(t1.sppl_cd);
			dbcItmDtlL_bldr.addSelect(t1.maker_cd);
			dbcItmDtlL_bldr.addSelect(t1.rqst_loc_cd);
			dbcItmDtlL_bldr.addSelect(t1.wg_cd);
			dbcItmDtlL_bldr.addSelect(t1.bom_ptn);
			dbcItmDtlL_bldr.addSelect(t1.oper_ptn);
			dbcItmDtlL_bldr.addSelect(t1.rqst_wg_cd);
			dbcItmDtlL_bldr.addInnerJoin(wk, bracket(wk.itm_cd.eq(t1.itm_cd)
					.and(wk.itm_sub1.eq(t1.itm_sub1))
					.and(wk.itm_sub2.eq(t1.itm_sub2))
					.and(wk.itm_sub3.eq(t1.itm_sub3))
					.and(wk.mfg_loc_cd.eq(t1.mfg_loc_cd))
					.and(wk.sppl_cd.eq(t1.sppl_cd))
					.and(wk.maker_cd.eq(t1.maker_cd))
					.and(wk.rqst_loc_cd.eq(t1.rqst_loc_cd))
					.and(wk.wg_cd.eq(t1.wg_cd))
					.and(wk.bom_ptn.eq(t1.bom_ptn))
					.and(wk.st_dt.gte(t1.st_dt))
					.and(wk.st_dt.lte(t1.end_dt))));
			dbSelect("MSBEL5070_MAM_ITM_DTL_S01", dbcItmDtlL, dbcItmDtlL_bldr);
			_cacheitmDtl = new FXUCL_Cache<MCList<MAM_ITM_DTL_R>>();
			_cacheitmDtl.setFixMaxCacheSize(-1);
			String[] itmDtlKeys = new String[] {
					MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$sppl_cd,
					MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd,
					MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$bom_ptn
			};
			for (MCList<MAM_ITM_DTL_R> subL : dbcItmDtlL.groupList(itmDtlKeys)) {
				_cacheitmDtl.putCache(getVals(itmDtlKeys, subL.get(0)), subL);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * （出荷・供給サービス）購買依頼先ワーキンググループ取得
		 */
		protected String getRqstWgCd(OPRqst_Chk01_RsltR upR) {
			String[] itmDtlKeys = new String[] {
					OPRqst_Chk01_RsltR.$itm_cd,
					OPRqst_Chk01_RsltR.$itm_sub1,
					OPRqst_Chk01_RsltR.$itm_sub2,
					OPRqst_Chk01_RsltR.$itm_sub3,
					OPRqst_Chk01_RsltR.$mfg_loc_cd,
					OPRqst_Chk01_RsltR.$sppl_cd,
					OPRqst_Chk01_RsltR.$maker_cd,
					OPRqst_Chk01_RsltR.$rqst_loc_cd,
					OPRqst_Chk01_RsltR.$strg_wg_cd ,
					OPRqst_Chk01_RsltR.$bom_ptn
			};
			MCList<MAM_ITM_DTL_R> l = _cacheitmDtl.getCache(getVals(itmDtlKeys, upR));
			if (!isNull(l)) {
				return l.get(0).rqst_wg_cd();
			}
			return null;
		}

		/**
		 * （オーダ登録サービス）工程パタン取得
		 */
		protected String getOperPtn(OPRqst_Chk01_RsltR upR) {
			String[] itmDtlKeys = new String[] {
					OPRqst_Chk01_RsltR.$itm_cd,
					OPRqst_Chk01_RsltR.$itm_sub1,
					OPRqst_Chk01_RsltR.$itm_sub2,
					OPRqst_Chk01_RsltR.$itm_sub3,
					OPRqst_Chk01_RsltR.$mfg_loc_cd,
					OPRqst_Chk01_RsltR.$sppl_cd,
					OPRqst_Chk01_RsltR.$maker_cd,
					OPRqst_Chk01_RsltR.$rqst_loc_cd,
					OPRqst_Chk01_RsltR.$bom_ptn
			};
			MCList<MAM_ITM_DTL_R> l = _cacheitmDtl.getCache(getVals(itmDtlKeys,
					upR));
			if (!isNull(l)) {
				return l.get(0).oper_ptn();
			}
			return null;
		}

		/**
		 * 出荷・供給サービスを呼び出す。
		 */
		protected void callShipDmndRqstSvc() {
			MCList<OPRqst_Chk01_RsltR> regL = getRegL(MSC_OP_RPL_MTD_TYP.PURC.value(),
					MSC_OP_RPL_MTD_TYP.OUTSRC.value(), MSC_OP_RPL_MTD_TYP.XFR.value());
			if (isNull(regL)) {
				return;
			}

			MCList<ShipDmndRqst_Upd01_DtlR> svcUpL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			// 予定日計算
			MCList<Ord_Sprt03_RsltR> schdDtL = callOrdRegSvcSprt3(regL);
			addAll(svcUpL, schdDtL, createMap_ShipDmndRqst_Upd01_DtlR_Ord_Sprt03_RsltR());

			MCIndexKey schdDtKey = schdDtL.createIndex(Ord_Sprt03_RsltR.$peg_no);
			for(OPRqst_Chk01_RsltR upR : regL) {
				Ord_Sprt03_RsltR ordSprt03RsltR = schdDtL.getFirst(schdDtKey, upR.peg_no());
				if(!isNull(ordSprt03RsltR)) {
					setStSchdDt(upR, ordSprt03RsltR);
					setEndSchdDt(upR, ordSprt03RsltR);
				}
			}

			// 上り電文項目補完
			MCJoinKey<MCList<OPRqst_Chk01_RsltR>> jk = svcUpL.join(
					ShipDmndRqst_Upd01_DtlR.$peg_no, regL, OPRqst_Chk01_RsltR.$peg_no);
			join(svcUpL, jk, createMap_ShipDmndRqst_Upd01_DtlR_OPRqst_Chk01_RsltR());
			svcUpL.addBooleanColumn("err_flg", false);

			// 出荷・供給サービスを呼び出す
			callShipDmndRqstChk01(svcUpL);
			MCList<ShipDmndRqst_Upd01_DtlR> notErrL = svcUpL.subList("err_flg", false);
			if (!isNull(notErrL)) {
				callShipDmndRqstUpd01(notErrL);
			}
		}

		/**
		 * 出荷・供給サービスの登録前チェック処理を呼び出す。
		 */
		protected void callShipDmndRqstChk01(MCList<ShipDmndRqst_Upd01_DtlR> svcUpL) {
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 svc = MSBAL_ShipDmndRqstService
					.crtShipDmndRqst_Chk01();
			addAll(svc.up0(), svcUpL,
					createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
			svc.exec();
			copyErrFlg(up0(), svc.down0());
			// 下り電文より項目補完
			MCJoinKey<MCList<ShipDmndRqst_Chk01_DtlR>> jk = svcUpL.join(
					ShipDmndRqst_Upd01_DtlR.$peg_no,
					svc.down0(),
					ShipDmndRqst_Chk01_DtlR.$peg_no);
			join(svcUpL, jk, createMap_ShipDmndRqst_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR());
		}

		/**
		 * 出荷・供給サービスの登録処理を呼び出す。
		 */
		protected void callShipDmndRqstUpd01(MCList<ShipDmndRqst_Upd01_DtlR> svcUpL) {
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 svc = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			svc.up0().setAll(svcUpL);
			svc.exec();
		}

		/**
		 * オーダ登録サービスを呼び出す。
		 */
		protected void callOrdRegSvc() {
			MCList<OPRqst_Chk01_RsltR> regL = getRegL(MSC_OP_RPL_MTD_TYP.MFG.value());
			if (isNull(regL)) {
				return;
			}
			// 電文編集
			MCList<Ord_Upd01_Dtl1R> svcUpL = editOrdUpL(regL);
			callOrdRegChk01(svcUpL);
			copyErrFlg(up0(), svcUpL);
			MCList<Ord_Upd01_Dtl1R> notErrL = svcUpL.subList(Ord_Upd01_Dtl1R.$err_flg, false);
			if (!isNull(notErrL)) {
				callOrdRegUpd01(notErrL);
			}
		}

		/**
		 * オーダ登録サービスを呼び出す。
		 */
		protected void callOrdRegChk01(MCList<Ord_Upd01_Dtl1R> svcUpL) {
			MSBCL_OrdRegService.Ord_Chk01 svc = MSBCL_OrdRegService.crtOrd_Chk01();
			svc.up0().setAll(svcUpL);
			svc.exec();
		}

		/**
		 * オーダ登録サービスを呼び出す。
		 */
		protected void callOrdRegUpd01(MCList<Ord_Upd01_Dtl1R> svcUpL) {
			MSBCL_OrdRegService.Ord_Upd01 svc = MSBCL_OrdRegService.crtOrd_Upd01();
			svc.up0().setAll(svcUpL);
			svc.exec();
		}

		/**
		 * オーダ登録の上り電文編集
		 */
		protected MCList<Ord_Upd01_Dtl1R> editOrdUpL(MCList<OPRqst_Chk01_RsltR> srcL) {
			MCList<Ord_Upd01_Dtl1R> destL = callOrdRegSvcSprt4(srcL);
			for (Ord_Upd01_Dtl1R r : destL) {
				r.mrp_typ(MSC_MRP_TYP.MRP.value());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				r.ord_gnrt_typ(MSC_ORD_GNRT_TYP.MNL.value());
				r.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				r.oper_ord_pr_flg(true);
				r.io_schd_pr_flg(true);
			}
			MCJoinKey<MCList<OPRqst_Chk01_RsltR>> jk = destL.join(
					Ord_Upd01_Dtl1R.$peg_no, srcL, OPRqst_Chk01_RsltR.$peg_no);
			join(destL, jk, createMap_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR_ByOth());
			return destL;
		}

		/**
		 * 品目オーダ項目補完
		 * オーダ更新サービスの補完処理を呼び出す
		 */
		protected MCList<Ord_Upd01_Dtl1R> callOrdRegSvcSprt4(
				MCList<OPRqst_Chk01_RsltR> tgtL) {
			MSBCL_OrdRegService.Ord_Sprt04 svc = MSBCL_OrdRegService.crtOrd_Sprt04();
			addAll(svc.up0(), tgtL, createMap_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR());
			// 予定日計算
			MCList<Ord_Sprt03_RsltR> schdDtL = callOrdRegSvcSprt3(tgtL);
			copyByPegNo(svc.up0(), new String[] {Ord_Upd01_Dtl1R.$strg_schd_dt},
					schdDtL, new String[] {Ord_Sprt03_RsltR.$strg_schd_dt});
			svc.exec();
			return svc.down0();
		}

		/**
		 * 対象補充区分のリスト取得
		 */
		protected MCList<OPRqst_Chk01_RsltR> getRegL(String... rplMtdTypL) {
			MCList<OPRqst_Chk01_RsltR> retL = MCList.create(OPRqst_Chk01_RsltR.class);
			for (String rplMtdTyp : rplMtdTypL) {
				retL.addAll(up0().subList(OPRqst_Chk01_RsltR.$op_rpl_mtd_typ, rplMtdTyp));
			}
			return retL;
		}

		protected Map_ShipDmndRqst_Upd01_DtlR_OPRqst_Chk01_RsltR<ShipDmndRqst_Upd01_DtlR, OPRqst_Chk01_RsltR> createMap_ShipDmndRqst_Upd01_DtlR_OPRqst_Chk01_RsltR() {
			return new Map_ShipDmndRqst_Upd01_DtlR_OPRqst_Chk01_RsltR<ShipDmndRqst_Upd01_DtlR, OPRqst_Chk01_RsltR>();
		}
		public class Map_ShipDmndRqst_Upd01_DtlR_OPRqst_Chk01_RsltR<D extends ShipDmndRqst_Upd01_DtlR, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$peg_no, OPRqst_Chk01_RsltR.$peg_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_cd, OPRqst_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd, OPRqst_Chk01_RsltR.$strg_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1, OPRqst_Chk01_RsltR.$sno1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2, OPRqst_Chk01_RsltR.$sno2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3, OPRqst_Chk01_RsltR.$sno3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4, OPRqst_Chk01_RsltR.$sno4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$ver_no, OPRqst_Chk01_RsltR.$ver_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_qty, OPRqst_Chk01_RsltR.$rqst_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_cd, OPRqst_Chk01_RsltR.$unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_qty, OPRqst_Chk01_RsltR.$rqst_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_cd, OPRqst_Chk01_RsltR.$unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, OPRqst_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bom_ptn, OPRqst_Chk01_RsltR.$bom_ptn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, OPRqst_Chk01_RsltR.$inst_po_cnt_rmrks);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$master_dt, OPRqst_Chk01_RsltR.$master_dt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setAttributes(src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.wg_rqst_typ(getWgRastTyp(src));
				dest.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.OP_RPL.value());
				dest.rqst_dt(getToday());
				if (isSame(dest.wg_rqst_typ(), MSC_WG_RQST_TYP.XFR.value())) {
					dest.gi_loc_cd(src.rqst_loc_cd());
					dest.gi_rqst_tm(src.st_schd_dt());
					dest.gi_str_ln_cd(src.rqst_str_ln_cd());
				}
				if (isSame(src.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())
						|| isSame(src.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
					
					if(src.screen_crct_flg() && MAC_ASSET_MNG_TYP.isNOT_MNG(src.asset_mng_typ())) {
						dest.rqst_to_wg_cd(src.rqst_wg_cd());
					}
					else {
						dest.rqst_to_wg_cd(getRqstWgCd(src));
					}
				}
				else {
					dest.rqst_to_wg_cd(src.rqst_wg_cd());
				}
				
				dest.avl_schd_dt(src.end_schd_dt());
				dest.gr_rqst_tm(dest.strg_schd_dt());
				if(src.ver_flg()) {
					dest.ver_no(getItmVerCache(src));					
				}
				dest.sno1_null_flg(false);
				dest.sno2_null_flg(false);
				dest.sno3_null_flg(false);
				dest.sno4_null_flg(false);
				dest.gd_cd(getDefaultFeedStkGd().gd_cd());
				if (isSame(src.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())) {
					dest.sppl_cd(src.sppl_cd());
					dest.maker_cd(src.maker_cd());
				}
				else if (isSame(src.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
					MAM_LOC_R r = _cacheLoc.get(src.mfg_loc_cd());
					dest.sppl_cd(r.sppl_cd());
					dest.maker_cd(r.maker_cd());
				}
				dest.master_dt(src.master_dt());
			}
		}

		protected Map_ShipDmndRqst_Upd01_DtlR_Ord_Sprt03_RsltR<ShipDmndRqst_Upd01_DtlR, Ord_Sprt03_RsltR> createMap_ShipDmndRqst_Upd01_DtlR_Ord_Sprt03_RsltR() {
			return new Map_ShipDmndRqst_Upd01_DtlR_Ord_Sprt03_RsltR<ShipDmndRqst_Upd01_DtlR, Ord_Sprt03_RsltR>();
		}
		public class Map_ShipDmndRqst_Upd01_DtlR_Ord_Sprt03_RsltR<D extends ShipDmndRqst_Upd01_DtlR, S extends Ord_Sprt03_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$peg_no, Ord_Sprt03_RsltR.$peg_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$po_schd_dt, Ord_Sprt03_RsltR.$po_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt, Ord_Sprt03_RsltR.$mfg_st_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt, Ord_Sprt03_RsltR.$mfg_end_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_schd_dt, Ord_Sprt03_RsltR.$gi_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$strg_schd_dt, Ord_Sprt03_RsltR.$strg_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt, Ord_Sprt03_RsltR.$accpt_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$insp_st_schd_dt, Ord_Sprt03_RsltR.$insp_st_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt, Ord_Sprt03_RsltR.$insp_end_schd_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$avl_schd_dt, Ord_Sprt03_RsltR.$avl_schd_dt);
			}
		}

		protected Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR<Ord_Upd01_Dtl1R, OPRqst_Chk01_RsltR> createMap_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR() {
			return new Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR<Ord_Upd01_Dtl1R, OPRqst_Chk01_RsltR>();
		}
		public class Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR<D extends Ord_Upd01_Dtl1R, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, OPRqst_Chk01_RsltR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, OPRqst_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, OPRqst_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, OPRqst_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, OPRqst_Chk01_RsltR.$maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, OPRqst_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, OPRqst_Chk01_RsltR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, OPRqst_Chk01_RsltR.$rqst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, OPRqst_Chk01_RsltR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, OPRqst_Chk01_RsltR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, OPRqst_Chk01_RsltR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, OPRqst_Chk01_RsltR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, OPRqst_Chk01_RsltR.$sno4);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_typ(getOrdTyp(src));
				dest.oper_ptn(getOperPtn(src));
				dest.po_schd_dt(getPoSchdDt(src));
				dest.gi_schd_dt(getGiSchdDt(src));
				dest.mfg_st_schd_dt(getMfgStSchdDt(src));
				dest.mfg_end_schd_dt(getMfgEndSchdDt(src));
				dest.strg_schd_dt(getStrgSchdDt(src));
				dest.accpt_schd_dt(getAccptSchdDt(src));
				dest.insp_st_schd_dt(getInspStSchdDt(src));
				dest.insp_end_schd_dt(getInspEndSchdDt(src));
				dest.avl_schd_dt(getAvlSchdDt(src));
			}
		}

		protected Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR_ByOth<Ord_Upd01_Dtl1R, OPRqst_Chk01_RsltR> createMap_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR_ByOth() {
			return new Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR_ByOth<Ord_Upd01_Dtl1R, OPRqst_Chk01_RsltR>();
		}
		public class Map_Ord_Upd01_Dtl1R_OPRqst_Chk01_RsltR_ByOth<D extends Ord_Upd01_Dtl1R, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_po_cnt_rmrks, OPRqst_Chk01_RsltR.$inst_po_cnt_rmrks);
			}
		}

		protected Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<ShipDmndRqst_Chk01_DtlR, ShipDmndRqst_Upd01_DtlR> createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<ShipDmndRqst_Chk01_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}
		public class Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<D extends ShipDmndRqst_Chk01_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, ShipDmndRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_typ);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_no, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_dt, ShipDmndRqst_Upd01_DtlR.$rqst_dt);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_fr_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_wg_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_nm, ShipDmndRqst_Upd01_DtlR.$itm_nm);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno1_null_flg, ShipDmndRqst_Upd01_DtlR.$sno1_null_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno2_null_flg, ShipDmndRqst_Upd01_DtlR.$sno2_null_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno3_null_flg, ShipDmndRqst_Upd01_DtlR.$sno3_null_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno4_null_flg, ShipDmndRqst_Upd01_DtlR.$sno4_null_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$ver_no, ShipDmndRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_qty, ShipDmndRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_cd, ShipDmndRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$slo_no, ShipDmndRqst_Upd01_DtlR.$slo_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$slo_d_no, ShipDmndRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cd, ShipDmndRqst_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_nm, ShipDmndRqst_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cntct_dpt, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cntct_psn, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr1, ShipDmndRqst_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr2, ShipDmndRqst_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr3, ShipDmndRqst_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr4, ShipDmndRqst_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_tel, ShipDmndRqst_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_fax, ShipDmndRqst_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_nm, ShipDmndRqst_Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr1, ShipDmndRqst_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr2, ShipDmndRqst_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr3, ShipDmndRqst_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr4, ShipDmndRqst_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_tel, ShipDmndRqst_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_fax, ShipDmndRqst_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_ord_no, ShipDmndRqst_Upd01_DtlR.$itm_ord_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$abort_flg, ShipDmndRqst_Upd01_DtlR.$abort_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$abort_can_flg, ShipDmndRqst_Upd01_DtlR.$abort_can_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$cred_no_up_flg, ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$po_schd_src_typ, ShipDmndRqst_Upd01_DtlR.$po_schd_src_typ);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$po_schd_src_no, ShipDmndRqst_Upd01_DtlR.$po_schd_src_no);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$xfr_src_typ, ShipDmndRqst_Upd01_DtlR.$xfr_src_typ);
				addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$xfr_src_no, ShipDmndRqst_Upd01_DtlR.$xfr_src_no);
			}
		}

		protected Map_ShipDmndRqst_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<ShipDmndRqst_Upd01_DtlR, ShipDmndRqst_Chk01_DtlR> createMap_ShipDmndRqst_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR() {
			return new Map_ShipDmndRqst_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<ShipDmndRqst_Upd01_DtlR, ShipDmndRqst_Chk01_DtlR>();
		}
		public class Map_ShipDmndRqst_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<D extends ShipDmndRqst_Upd01_DtlR, S extends ShipDmndRqst_Chk01_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ, ShipDmndRqst_Chk01_DtlR.$wg_rqst_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_typ, ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no, ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_dt, ShipDmndRqst_Chk01_DtlR.$rqst_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd, ShipDmndRqst_Chk01_DtlR.$rqst_fr_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_wg_cd, ShipDmndRqst_Chk01_DtlR.$gr_loc_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_cd, ShipDmndRqst_Chk01_DtlR.$gr_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd, ShipDmndRqst_Chk01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Chk01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Chk01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub3, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_nm, ShipDmndRqst_Chk01_DtlR.$itm_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1, ShipDmndRqst_Chk01_DtlR.$sno1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1_null_flg, ShipDmndRqst_Chk01_DtlR.$sno1_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2, ShipDmndRqst_Chk01_DtlR.$sno2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2_null_flg, ShipDmndRqst_Chk01_DtlR.$sno2_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3, ShipDmndRqst_Chk01_DtlR.$sno3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3_null_flg, ShipDmndRqst_Chk01_DtlR.$sno3_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4, ShipDmndRqst_Chk01_DtlR.$sno4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4_null_flg, ShipDmndRqst_Chk01_DtlR.$sno4_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$ver_no, ShipDmndRqst_Chk01_DtlR.$ver_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_qty, ShipDmndRqst_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_cd, ShipDmndRqst_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Chk01_DtlR.$maker_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_no, ShipDmndRqst_Chk01_DtlR.$slo_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_d_no, ShipDmndRqst_Chk01_DtlR.$slo_d_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cd, ShipDmndRqst_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg, ShipDmndRqst_Chk01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_nm, ShipDmndRqst_Chk01_DtlR.$dlv_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt, ShipDmndRqst_Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn, ShipDmndRqst_Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd, ShipDmndRqst_Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr1, ShipDmndRqst_Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr2, ShipDmndRqst_Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr3, ShipDmndRqst_Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr4, ShipDmndRqst_Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_tel, ShipDmndRqst_Chk01_DtlR.$dlv_tel);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_fax, ShipDmndRqst_Chk01_DtlR.$dlv_fax);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_cd, ShipDmndRqst_Chk01_DtlR.$tdlv_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg, ShipDmndRqst_Chk01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_nm, ShipDmndRqst_Chk01_DtlR.$tdlv_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd, ShipDmndRqst_Chk01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr1, ShipDmndRqst_Chk01_DtlR.$tdlv_addr1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr2, ShipDmndRqst_Chk01_DtlR.$tdlv_addr2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr3, ShipDmndRqst_Chk01_DtlR.$tdlv_addr3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr4, ShipDmndRqst_Chk01_DtlR.$tdlv_addr4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_tel, ShipDmndRqst_Chk01_DtlR.$tdlv_tel);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_fax, ShipDmndRqst_Chk01_DtlR.$tdlv_fax);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_ord_no, ShipDmndRqst_Chk01_DtlR.$itm_ord_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bom_ptn, ShipDmndRqst_Chk01_DtlR.$bom_ptn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$abort_flg, ShipDmndRqst_Chk01_DtlR.$abort_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$abort_can_flg, ShipDmndRqst_Chk01_DtlR.$abort_can_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg, ShipDmndRqst_Chk01_DtlR.$cred_no_up_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$po_schd_src_typ, ShipDmndRqst_Chk01_DtlR.$po_schd_src_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$po_schd_src_no, ShipDmndRqst_Chk01_DtlR.$po_schd_src_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$xfr_src_typ, ShipDmndRqst_Chk01_DtlR.$xfr_src_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$xfr_src_no, ShipDmndRqst_Chk01_DtlR.$xfr_src_no);
				addColumnPathMap("err_flg", ShipDmndRqst_Chk01_DtlR.$err_flg);
			}
		}

		protected Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<MAM_ITM_DTL_R, OPRqst_Chk01_RsltR> createMap_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR() {
			return new Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<MAM_ITM_DTL_R, OPRqst_Chk01_RsltR>();
		}
		public class Map_MAM_ITM_DTL_R_OPRqst_Chk01_RsltR<D extends MAM_ITM_DTL_R, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MAM_ITM_DTL_R.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MAM_ITM_DTL_R.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MAM_ITM_DTL_R.$wg_cd, OPRqst_Chk01_RsltR.$strg_wg_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$mfg_loc_cd, OPRqst_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$sppl_cd, OPRqst_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$maker_cd, OPRqst_Chk01_RsltR.$maker_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$rqst_loc_cd, OPRqst_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MAM_ITM_DTL_R.$bom_ptn, OPRqst_Chk01_RsltR.$bom_ptn);
				addColumnPathMap(MAM_ITM_DTL_R.$st_dt, OPRqst_Chk01_RsltR.$master_dt);
			}
		}
	}

	/**
	 * 予定日計算
	 * オーダ更新サービスの予定日補完処理を呼び出す
	 */
	protected MCList<Ord_Sprt03_RsltR> callOrdRegSvcSprt3(
			MCList<OPRqst_Chk01_RsltR> tgtL) {
		MSBCL_OrdRegService.Ord_Sprt03 svc = MSBCL_OrdRegService.crtOrd_Sprt03();
		addAll(svc.up0(), tgtL, createMap_Ord_Sprt03_DtlR_OPRqst_Chk01_RsltR());
		svc.exec();
		return svc.down0();
	}
	
	protected Map_Ord_Sprt03_DtlR_OPRqst_Chk01_RsltR<Ord_Sprt03_DtlR, OPRqst_Chk01_RsltR> createMap_Ord_Sprt03_DtlR_OPRqst_Chk01_RsltR() {
		return new Map_Ord_Sprt03_DtlR_OPRqst_Chk01_RsltR<Ord_Sprt03_DtlR, OPRqst_Chk01_RsltR>();
	}
	public class Map_Ord_Sprt03_DtlR_OPRqst_Chk01_RsltR<D extends Ord_Sprt03_DtlR, S extends OPRqst_Chk01_RsltR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, OPRqst_Chk01_RsltR.$peg_no);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, OPRqst_Chk01_RsltR.$master_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, OPRqst_Chk01_RsltR.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, OPRqst_Chk01_RsltR.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, OPRqst_Chk01_RsltR.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, OPRqst_Chk01_RsltR.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, OPRqst_Chk01_RsltR.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, OPRqst_Chk01_RsltR.$sppl_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, OPRqst_Chk01_RsltR.$maker_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd, OPRqst_Chk01_RsltR.$rqst_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, OPRqst_Chk01_RsltR.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, OPRqst_Chk01_RsltR.$strg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, OPRqst_Chk01_RsltR.$rqst_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(getOrdTyp(src));
			dest.po_schd_dt(getPoSchdDt(src));
			dest.gi_schd_dt(getGiSchdDt(src));
			dest.mfg_st_schd_dt(getMfgStSchdDt(src));
			dest.mfg_end_schd_dt(getMfgEndSchdDt(src));
			dest.strg_schd_dt(getStrgSchdDt(src));
			dest.accpt_schd_dt(getAccptSchdDt(src));
			dest.insp_st_schd_dt(getInspStSchdDt(src));
			dest.insp_end_schd_dt(getInspEndSchdDt(src));
			dest.avl_schd_dt(getAvlSchdDt(src));
		}
	}
	
	/**
	 * オーダ区分判断
	 */
	protected String getOrdTyp(OPRqst_Chk01_RsltR upR) {
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value())) {
			return MSC_ITM_ORD_TYP.MFG.value();
		}
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())) {
			return MSC_ITM_ORD_TYP.PURC.value();
		}
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
			return MSC_ITM_ORD_TYP.OUTSRC.value();
		}
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
			return MSC_ITM_ORD_TYP.XFR.value();
		}
		return null;
	}

	/**
	 * ＷＧ間依頼種類区分判断
	 */
	protected String getWgRastTyp(OPRqst_Chk01_RsltR upR) {
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())) {
			return MSC_WG_RQST_TYP.PURC.value();
		}
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
			return MSC_WG_RQST_TYP.PURC.value();
		}
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
			return MSC_WG_RQST_TYP.XFR.value();
		}
		return null;
	}

	/**
	 * 発注予定日
	 */
	protected MCDate getPoSchdDt(OPRqst_Chk01_RsltR upR) {
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())
				|| isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
			return upR.st_schd_dt();
		}
		return null;
	}

	/**
	 * 出庫予定日
	 */
	protected MCDate getGiSchdDt(OPRqst_Chk01_RsltR upR) {
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
			return upR.st_schd_dt();
		}
		return null;
	}

	/**
	 * 製造着手予定日
	 */
	protected MCDate getMfgStSchdDt(OPRqst_Chk01_RsltR upR) {
		if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value())) {
			return upR.st_schd_dt();
		}
		return null;
	}

	/**
	 * 製造終了予定日
	 */
	protected MCDate getMfgEndSchdDt(OPRqst_Chk01_RsltR upR) {
		return null;
	}

	/**
	 * 格納完了予定日
	 */
	protected MCDate getStrgSchdDt(OPRqst_Chk01_RsltR upR) {
		return null;
	}

	/**
	 * 検収予定日
	 */
	protected MCDate getAccptSchdDt(OPRqst_Chk01_RsltR upR) {
		return null;
	}

	/**
	 * 検査着手予定日
	 */
	protected MCDate getInspStSchdDt(OPRqst_Chk01_RsltR upR) {
		return null;
	}

	/**
	 * 検査終了予定日
	 */
	protected MCDate getInspEndSchdDt(OPRqst_Chk01_RsltR upR) {
		return null;
	}

	/**
	 * 使用可能予定日
	 */
	protected MCDate getAvlSchdDt(OPRqst_Chk01_RsltR upR) {
		return upR.end_schd_dt();
	}
	
	/**
	 * 補充方法区分によって着手予定日を設定
	 */
	protected void setStSchdDt(OPRqst_Chk01_RsltR upR, Ord_Sprt03_RsltR ordSprt03RsltR) {
		if(MSC_OP_RPL_MTD_TYP.isMFG(upR.op_rpl_mtd_typ())) {
			upR.st_schd_dt(ordSprt03RsltR.mfg_st_schd_dt());
		}
		else if (MSC_OP_RPL_MTD_TYP.isOUTSRC(upR.op_rpl_mtd_typ())
				|| MSC_OP_RPL_MTD_TYP.isPURC(upR.op_rpl_mtd_typ())) {
			upR.st_schd_dt(ordSprt03RsltR.po_schd_dt());
		}
		else if(MSC_OP_RPL_MTD_TYP.isXFR(upR.op_rpl_mtd_typ())) {
			upR.st_schd_dt(ordSprt03RsltR.gi_schd_dt());
		}
	}
	
	/**
	 * 補充方法区分によって納入希望日を設定
	 */
	protected void setEndSchdDt(OPRqst_Chk01_RsltR upR, Ord_Sprt03_RsltR ordSprt03RsltR) {
		upR.end_schd_dt(ordSprt03RsltR.avl_schd_dt());
	}
	
	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	//FMCB CUSTOM END
}