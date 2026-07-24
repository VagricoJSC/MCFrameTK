package mcframe.serverMSBF.MSBFL5100;

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
import mcframe.serverMSBF.MSBFL5100.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMAUC.MAUCL5010.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_PlntAprvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_PlntAprvService_MC extends MSBFL_PlntAprvService_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBFL_PlntAprvService> CLAZZ = MSBFL_PlntAprvService.class;
	/**
	 * 場所マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;

	/**
	 * 品目マスタ(工場・物流倉庫)コンテナキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _cacheItmSiteL = null;

	/**
	 * 場所マスタコンテナを取得する。
	 * 
	 * @param rsltL キャッシュ条件
	 * @return 場所マスタコンテナ
	 */
	protected static void initLocCache(MCList<PlntAprv_Chk01_RsltR> rsltL) {
		object(CLAZZ)._initLocCache(rsltL);
	}

	/**
	 * 場所マスタコンテナキャッシュを初期化する。
	 * 
	 * @param rsltL キャッシュ条件
	 */
	protected void _initLocCache(MCList<PlntAprv_Chk01_RsltR> rsltL) {
		if (_cacheLocL == null) {
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, rsltL, MAM_LOC_R.$loc_cd);
		}
	}
	// このstaticメソッドをChk01とUpd01で共有して使う。
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		return object(CLAZZ)._cacheLocL;
	}

	/**
	 * 品目マスタ(工場・物流倉庫)コンテナを取得する。
	 * 
	 * @param rsltL キャッシュ条件
	 * @return 品目マスタ(工場・物流倉庫)コンテナ
	 */
	protected static void initItmSiteCache(MCList<PlntAprv_Chk01_RsltR> rsltL) {
		object(CLAZZ)._initItmSiteCache(rsltL);
	}

	/**
	 * 品目マスタ(工場・物流倉庫)コンテナキャッシュを初期化する。
	 * 
	 * @param rsltL キャッシュ条件
	 */
	protected void _initItmSiteCache(MCList<PlntAprv_Chk01_RsltR> rsltL) {
		if (_cacheItmSiteL == null) {
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.plnt_aprv_role_cd);
			dbc_bldr.addSelect(t.plnt_aprv_flg);
			_cacheItmSiteL = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(dbc_bldr, rsltL, 
					PlntAprv_Chk01_RsltR.$itm_cd, PlntAprv_Chk01_RsltR.$itm_sub1, PlntAprv_Chk01_RsltR.$itm_sub2, PlntAprv_Chk01_RsltR.$itm_sub3, PlntAprv_Chk01_RsltR.$site_cd);
		}
	}
	// このstaticメソッドをChk01とUpd01で共有して使う。
	protected static FXUCL_MCDbcCache<MAM_ITM_SITE_R> getItmSiteCache() {
		return object(CLAZZ)._cacheItmSiteL;
	}

	/**
	 * PlntAprv_Chk01オペレーション.<p>
	 *
	 * 工場出荷承認予定登録前チェックを行う。<br>
	 */
	public class PlntAprv_Chk01 extends MSBFL_PlntAprvService_MC_A.PlntAprv_Chk01 {
		// 工場出荷承認ヘッダのグループ化の単位
		protected String[] _hdrGroupCols = null;
		MCList<PlntAprv_Chk01_RsltR> _chkUpL = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();

			// キャッシュ取得
			doInit();

			// 前処理
			prepare();

			// チェック対象作成
			editChkL();

			// チェック処理実行
			lockAndChk(msgL);

			// 下り電文設定
			setDown();

			MCMessagePool.addAll(msgL);
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			initLocCache(up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			_chkUpL = setSiteCdForUp(up0());;
			initItmSiteCache(_chkUpL);
		}

		/**
		 * ロック、チェック処理。
		 * 
		 * @param msgL エラーメッセージリスト
		 */
		protected void lockAndChk(MCMessageList msgL) {
			MCList<MST_PLNT_APRV_R> aprvL = MCList.create(MST_PLNT_APRV_R.class);
			for (PlntAprv_Chk01_RsltR dtlR : _chkUpL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					MAM_ITM_SITE_R itmSiteR = getItmSiteR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.site_cd());
					if (!isNull(itmSiteR) && itmSiteR.plnt_aprv_flg()) {
						dtlR.plnt_aprv_role_cd(itmSiteR.plnt_aprv_role_cd());
					}
				}
				if (!isNull(dtlR.plnt_aprv_no())) {
					MST_PLNT_APRV_R aprvR = MST_PLNT_APRV_R.create();

					aprvR.plnt_aprv_no(dtlR.plnt_aprv_no());
					aprvL.add(aprvR);
				}
			}

			//工場出荷承認実績ＮＯ順にロックを取得。
			aprvL.sort(MST_PLNT_APRV_R.$plnt_aprv_no);

			MCIndexKey idxkey = _chkUpL.createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_no);
			for (MST_PLNT_APRV_R dbR : aprvL) {
				MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
				MCQueryApiBuilder dbR_bldr = MCQueryApiBuilder.create(t);
				dbR_bldr.setSelect(t.plnt_aprv_no);
				dbR_bldr.addSelect(t.plnt_aprv_sts_typ);
				//このタイミングで工場出荷承認ヘッダが存在しない可能性がある。
				//そのためExメソッドを使用している。
				dbSelectKeyForUpdateEx("MSBFL5100_MST_PLNT_APRV_S01", dbR, dbR_bldr, dbR);

				if (!isNull(dbR)) {
					PlntAprv_Chk01_RsltR curChkR = _chkUpL.getFirst(idxkey, dbR.plnt_aprv_no());
					if (MSC_PLNT_APRV_STS_TYP.isACPT(dbR.plnt_aprv_sts_typ())
							|| MSC_PLNT_APRV_STS_TYP.isRJCT(dbR.plnt_aprv_sts_typ())) {
						msgL.add(new MCMessage(curChkR, null, MSBFL0012, toDispGUIIndex(curChkR)));
						curChkR.err_flg(true);
					}
				}
			}
			
			// 工場出荷承認役割ＣＤが取得できないか
			MCList<PlntAprv_Chk01_RsltR> crtList = _chkUpL.subList(PlntAprv_Chk01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<PlntAprv_Chk01_RsltR> subChkUpL = crtList.subList(PlntAprv_Chk01_RsltR.$err_flg, false);
			MCIndexKey itmIdxkey = crtList.createIndex(PlntAprv_Chk01_RsltR.$itm_cd, PlntAprv_Chk01_RsltR.$itm_sub1, PlntAprv_Chk01_RsltR.$itm_sub2, PlntAprv_Chk01_RsltR.$itm_sub3, PlntAprv_Chk01_RsltR.$site_cd);
			for (PlntAprv_Chk01_RsltR chkR : subChkUpL.groupBy(PlntAprv_Chk01_RsltR.$itm_cd, PlntAprv_Chk01_RsltR.$itm_sub1, PlntAprv_Chk01_RsltR.$itm_sub2, PlntAprv_Chk01_RsltR.$itm_sub3, PlntAprv_Chk01_RsltR.$site_cd)) {
				MCList<PlntAprv_Chk01_RsltR> errChkL = crtList.subList(itmIdxkey, chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3(), chkR.site_cd());
				MCList<PlntAprv_Chk01_RsltR> errL = errChkL.subList(r -> isNull(r.plnt_aprv_role_cd()));
				if (!errL.isEmpty()) {
					msgL.add(new MCMessage(chkR, null, MSBFL0118, toDispItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3()), 
							chkR.site_cd(), toDispGUIIndex(errL.get(0))));
					errL.setBooleanNE(PlntAprv_Chk01_RsltR.$err_flg, true);
				}
			}
		}

		/**
		 * 上り電文(CRTの行)を工場出荷承認ヘッダの単位でグループ化し、
		 * チェック対象を作成する。
		 */
		protected void editChkL() {
			MCList<PlntAprv_Chk01_RsltR> crtList = _chkUpL.subList(PlntAprv_Chk01_RsltR.$data_crud_typ,
							MAC_DATA_CRUD_TYP.CRT.value());
			
			MCList<PlntAprv_Chk01_RsltR> newChkL = MCList.create(PlntAprv_Chk01_RsltR.class);
			for (PlntAprv_Chk01_RsltR rsltR : crtList.groupBy(getHdrGroupCols())) {
				MST_PLNT_APRV_R hdrR = MST_PLNT_APRV_R.create();

				hdrR.itm_cd(rsltR.itm_cd());
				hdrR.itm_sub1(rsltR.itm_sub1());
				hdrR.itm_sub2(rsltR.itm_sub2());
				hdrR.itm_sub3(rsltR.itm_sub3());
				hdrR.lot_no(rsltR.lot_no());
				hdrR.sublot_no(rsltR.sublot_no());
				hdrR.site_cd(rsltR.site_cd());

				//一旦サブロットに対応する承認前の工場出荷承認実績ＮＯを取得する。
				//ただし、この時点でロックは取得していない。

				//※工場出荷承認実績ＮＯ順でロックするために、
				//一旦ロックなしで工場出荷承認実績ＮＯを取得し、
				//後の処理で工場出荷承認実績ＮＯでソート後、ロックを取得する。
				String strPlntAprvNo = selPlntAprvNo(hdrR);
				if (!isNull(strPlntAprvNo)) {
					rsltR.plnt_aprv_no(strPlntAprvNo);
					newChkL.add(rsltR);
				}
			}

			_chkUpL.addAll(newChkL);
		}

		/**
		 * 工場出荷承認ヘッダのグループ化の単位を取得する。
		 */
		protected String[] getHdrGroupCols() {
			if (_hdrGroupCols == null) {
				_hdrGroupCols = new String[] {
						MST_PLNT_APRV_R.$itm_cd, MST_PLNT_APRV_R.$itm_sub1,
						MST_PLNT_APRV_R.$itm_sub2, MST_PLNT_APRV_R.$itm_sub3,
						MST_PLNT_APRV_R.$lot_no, MST_PLNT_APRV_R.$sublot_no,
						MST_PLNT_APRV_R.$site_cd
				};	
			}
			return _hdrGroupCols;
		}
	}
	/**
	 * PlntAprv_Chk02オペレーション.<p>
	 *
	 * 出荷可能チェックを行う。<br>
	 */
	public class PlntAprv_Chk02 extends MSBFL_PlntAprvService_MC_A.PlntAprv_Chk02 {
		/**
		 * 品目マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();

			// キャッシュ取得
			doInit();

			// データ補完
			compData();

			// 出荷可能チェック
			msgL.addAll(checkMain());

			// 下り電文設定
			setDown();

			MCMessagePool.addAll(msgL);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			initItmCache(up0());
		}

		/**
		 * データ補完
		 */
		protected void compData() {
			for (PlntAprv_Chk02_RsltR r : up0()) {
				MAM_ITM_R itmR = _cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmR)) {
					r.sublot_mng_typ(itmR.sublot_mng_typ());
				}
				// サブロットＮＯ
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
						|| MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
					r.bind_sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.bind_sublot_no(r.sublot_no());
				}
			}
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void initItmCache(MCList<PlntAprv_Chk02_RsltR> bindL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, bindL, 
					PlntAprv_Chk02_RsltR.$itm_cd, PlntAprv_Chk02_RsltR.$itm_sub1, PlntAprv_Chk02_RsltR.$itm_sub2, PlntAprv_Chk02_RsltR.$itm_sub3);
		}

		/**
		 * 出荷可能チェック
		 * 
		 */
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_LOT_R> dbL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.plnt_aprv_sts_typ);
			dbL_bldr.addSelect(t.itm_cd);
			dbL_bldr.addSelect(t.itm_sub1);
			dbL_bldr.addSelect(t.itm_sub2);
			dbL_bldr.addSelect(t.itm_sub3);
			dbL_bldr.addSelect(t.lot_no);
			dbL_bldr.addSelect(t.sublot_no);
			dbL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dbL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			dbL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("bind_sublot_no")));
			dbSelect("MSBFL5100_MST_LOT_S01", dbL, dbL_bldr, up0());

			MCIndexKey idx = dbL.createIndex(getGroupCols());

			MST_LOT_R lotR = null;
			for (PlntAprv_Chk02_RsltR r : up0()) {
				lotR = dbL.getFirst(idx, new String[] {
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(),
						r.bind_sublot_no()
				});

				if (!isNull(lotR) && !isNull(lotR.plnt_aprv_sts_typ())) {
					if (r.pre_inst_flg()
							&& MSC_PLNT_APRV_STS_TYP.isRJCT(lotR.plnt_aprv_sts_typ())) {
						msgL.add(new MCMessage(r, null, MSBFL0083,
								lotR.plnt_aprv_sts_typ(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
										r.itm_sub3()),
								r.lot_no(), r.bind_sublot_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
					else if (!r.pre_inst_flg()
							&& !MSC_PLNT_APRV_STS_TYP.isACPT(lotR.plnt_aprv_sts_typ())) {
						msgL.add(new MCMessage(r, null, MSBFL0036,
								lotR.plnt_aprv_sts_typ(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
										r.itm_sub3()),
								r.lot_no(), r.bind_sublot_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}

			return msgL;
		}

		/**
		 * 工場出荷承認ヘッダのグループ化の単位を取得する。
		 */
		protected String[] getGroupCols() {
			return new String[] {
						MST_PLNT_APRV_R.$itm_cd, MST_PLNT_APRV_R.$itm_sub1,
						MST_PLNT_APRV_R.$itm_sub2, MST_PLNT_APRV_R.$itm_sub3,
						MST_PLNT_APRV_R.$lot_no, MST_PLNT_APRV_R.$sublot_no
				};
		}
	}
	/**
	 * PlntAprv_Upd01オペレーション.<p>
	 *
	 * 工場出荷承認予定登録を行う。<br>
	 */
	public class PlntAprv_Upd01 extends MSBFL_PlntAprvService_MC_A.PlntAprv_Upd01 {
		// 工場出荷承認ヘッダのグループ化の単位
		protected String[] _hdrGroupCols = null;
		// 空更新対象の工場出荷承認ヘッダのリスト
		protected MCList<MST_PLNT_APRV_R> _aprvLForUpdTs = null;
		protected MST_PLNT_APRV_R _aprvLForUpdTs_t = MST_PLNT_APRV_R.create("T");
		protected MCQueryApiBuilder _aprvLForUpdTs_bldr = MCQueryApiBuilder.create(_aprvLForUpdTs_t);
		// 工場出荷承認ヘッダの登録用リスト
		protected MCList<MST_PLNT_APRV_R> _insPlntAprvL = null;
		protected MST_PLNT_APRV_R _insPlntAprvL_t = MST_PLNT_APRV_R.create("T");
		protected MCQueryApiBuilder _insPlntAprvL_bldr = MCQueryApiBuilder.create(_insPlntAprvL_t);
		// 工場出荷承認ヘッダの削除用リスト
		protected MCList<MST_PLNT_APRV_R> _delPlntAprvL = null;
		protected MST_PLNT_APRV_R _delPlntAprvL_t = MST_PLNT_APRV_R.create("T");
		protected MCQueryApiBuilder _delPlntAprvL_bldr = MCQueryApiBuilder.create(_delPlntAprvL_t);

		protected MCList<MST_INSP_SCHD_R> _inspSchdL = null;
		protected MST_INSP_SCHD_R _inspSchdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _inspSchdL_bldr = MCQueryApiBuilder.create(_inspSchdL_t);
		protected MCList<MST_INSP_ACT_D_R> _inspActDL = null;
		protected MST_INSP_ACT_D_R _inspActDL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _inspActDL_bldr = MCQueryApiBuilder.create(_inspActDL_t);
		protected MCList<MST_INSP_SMPL_ACT_R> _inspSmplActL = null;
		protected MST_INSP_SMPL_ACT_R _inspSmplActL_t = MST_INSP_SMPL_ACT_R.create("T");
		protected MCQueryApiBuilder _inspSmplActL_bldr = MCQueryApiBuilder.create(_inspSmplActL_t);
		protected MCIndexKey _schdIdxkey = null;
		protected MCIndexKey _actDIdxkey = null;
		protected MCIndexKey _smplIdxkey = null;
		protected MCList<MST_INSP_SCHD_R> _orgInspSchdL = null;
		protected MST_INSP_SCHD_R _orgInspSchdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _orgInspSchdL_bldr = MCQueryApiBuilder.create(_orgInspSchdL_t);
		protected MCIndexKey _orgSchdIdxkey = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// キャッシュ取得
			doInit();

			// 前処理
			prepare();

			// 工場出荷承認ヘッダの登録情報作成
			setCrtHdr();

			// 工場出荷承認の登録・更新・削除
			updMain();

			// ロット情報サービスの区分更新
			callLotUpd05();

			// プッシュ通知
			callPushNtc();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			_aprvLForUpdTs = MCList.create(MST_PLNT_APRV_R.class);
			_insPlntAprvL = MCList.create(MST_PLNT_APRV_R.class);
			_delPlntAprvL = MCList.create(MST_PLNT_APRV_R.class);

			up0().setAll(setSiteCdForUp(up0()));;

			// データ補完
			compData();
		}

		/**
		 * 初期処理を実行する
		 */
		protected void doInit() {
			initLocCache(up0());
			createInspCache();
		}

		/**
		 * データ補完
		 */
		protected void compData() {
			initItmSiteCache(up0());
			compPlntAprvRoleCd();
		}

		protected void createInspCache() {
			MCList<PlntAprv_Chk01_RsltR> subUpL = up0().subList(r -> (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			if (subUpL.isEmpty()) {
				return;
			}
			_inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			_inspActDL = MCList.create(MST_INSP_ACT_D_R.class);
			_inspSmplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			_orgInspSchdL = MCList.create(MST_INSP_SCHD_R.class);

			MST_INSP_ACT_R t1 = MST_INSP_ACT_R.create("T1");
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T2");

			_inspSchdL_bldr.setSelect(_inspSchdL_t.insp_no);
			_inspSchdL_bldr.addSelect(_inspSchdL_t.src_no4);
			_inspSchdL_bldr.addSelect(_inspSchdL_t.base_unit_qty);
			_inspSchdL_bldr.addSelect(_inspSchdL_t.in_prmt_insp_flg);
			_inspSchdL_bldr.addSelect(_inspSchdL_t.org_insp_schd_no);
			_inspSchdL_bldr.setWhere(_inspSchdL_t.insp_no.eq(bind("insp_no")));
			_inspSchdL_bldr.addWhereWithAnd(_inspSchdL_t.latest_flg.eq(value(true)));
			dbSelect("MSBFL5100_MST_INSP_SCHD_S01", _inspSchdL, _inspSchdL_bldr, subUpL);

			_inspActDL.addStringColumn(MST_INSP_INST_R.$insp_no);
			_inspActDL_bldr.setSelect(_inspActDL_t.fix_no);
			_inspActDL_bldr.addSelect(_inspActDL_t.base_unit_qty);
			_inspActDL_bldr.addSelect(t2.insp_no);
			_inspActDL_bldr.addInnerJoin(t1, _inspActDL_t.insp_act_no.eq(t1.insp_act_no));
			_inspActDL_bldr.addInnerJoin(t2, t1.insp_no.eq(t2.insp_no));
			_inspActDL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));
			_inspActDL_bldr.addWhereWithAnd(
					_inspActDL_t.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())));
			dbSelect("MSBFL5100_MST_INSP_ACT_D_S01", _inspActDL, _inspActDL_bldr, subUpL);

			// 初回検査予定ＮＯが同一の検査予定を取得
			_orgInspSchdL_bldr.setSelect(_orgInspSchdL_t.insp_schd_no);
			_orgInspSchdL_bldr.addSelect(_orgInspSchdL_t.org_insp_schd_no);
			_orgInspSchdL_bldr.setWhere(_orgInspSchdL_t.org_insp_schd_no.eq(bind("org_insp_schd_no")));
			dbSelect("MSBFL5100_MST_INSP_SCHD_S02", _orgInspSchdL, _orgInspSchdL_bldr, _inspSchdL);

			// 初回検査予定ＮＯが同一の検査予定に対する検査抜取実績を取得
			_inspSmplActL_bldr.setSelect(_inspSmplActL_t.insp_schd_no);
			_inspSmplActL_bldr.addSelect(_inspSmplActL_t.so_qty);
			_inspSmplActL_bldr.setWhere(_inspSmplActL_t.insp_schd_no.eq(bind("insp_schd_no")));
			dbSelect("MSBFL5100_MST_INSP_SMPL_ACT_S01", _inspSmplActL, _inspSmplActL_bldr, _orgInspSchdL);

			_schdIdxkey = _inspSchdL.createIndex(MST_INSP_SCHD_R.$insp_no, MST_INSP_SCHD_R.$src_no4);
			_actDIdxkey = _inspActDL.createIndex(MST_INSP_INST_R.$insp_no, MST_INSP_ACT_D_R.$fix_no);
			_smplIdxkey = _inspSmplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_schd_no);
			_orgSchdIdxkey = _orgInspSchdL.createIndex(MST_INSP_SCHD_R.$org_insp_schd_no);
		}
		/**
		 * 工場出荷承認役割ＣＤを補完する。
		 */
		protected void compPlntAprvRoleCd() {
			MCList<MST_PLNT_APRV_R>  plntAprvL = getPlntAprvL();
			MCIndexKey idxkey = plntAprvL.createIndex(MST_PLNT_APRV_R.$plnt_aprv_no);
			for (PlntAprv_Chk01_RsltR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_PLNT_APRV_R plntAprvR = plntAprvL.getFirst(idxkey, r.plnt_aprv_no());
					if (!isNull(plntAprvR)) {
						r.plnt_aprv_role_cd(plntAprvR.plnt_aprv_role_cd());
					}
				}
				else {
					MAM_ITM_SITE_R itmSiteR = getItmSiteR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.site_cd());
					if (!isNull(itmSiteR) && itmSiteR.plnt_aprv_flg()) {
						r.plnt_aprv_role_cd(itmSiteR.plnt_aprv_role_cd());
					}
				}
			}
		}

		/**
		 * 既存の工場出荷承認情報を取得する。
		 * @return
		 */
		protected MCList<MST_PLNT_APRV_R> getPlntAprvL() {
			MCList<MST_PLNT_APRV_R> selectL = MCList.create(MST_PLNT_APRV_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_PLNT_APRV_R.create("T"));
			dbSelectKey("MSBFL5100_MST_PLNT_APRV_S02", selectL, selectL_bldr, up0());
			return selectL;
		}

		/**
		 * 上り電文(CRTの行)を工場出荷承認ヘッダの単位でグループ化し、
		 * MST_PLNT_APRVコンテナに格納する。
		 */
		protected void setCrtHdr() {
			MCList<PlntAprv_Chk01_RsltR> crtList = up0().subList(PlntAprv_Chk01_RsltR.$data_crud_typ,
							MAC_DATA_CRUD_TYP.CRT.value());

			for (PlntAprv_Chk01_RsltR rsltR : crtList.groupBy(getHdrGroupCols())) {
				MST_PLNT_APRV_R hdrR = MST_PLNT_APRV_R.create();

				hdrR.itm_cd(rsltR.itm_cd());
				hdrR.itm_sub1(rsltR.itm_sub1());
				hdrR.itm_sub2(rsltR.itm_sub2());
				hdrR.itm_sub3(rsltR.itm_sub3());
				hdrR.lot_no(rsltR.lot_no());
				hdrR.sublot_no(rsltR.sublot_no());
				hdrR.site_cd(rsltR.site_cd());
				hdrR.plnt_aprv_role_cd(rsltR.plnt_aprv_role_cd());

				//一旦サブロットに対応する承認前の工場出荷承認実績ＮＯを取得する。
				//ただし、この時点でロックは取得していない。

				//※工場出荷承認実績ＮＯ順でロックするために、
				//一旦ロックなしで工場出荷承認実績ＮＯを取得し、
				//後の処理で工場出荷承認実績ＮＯでソート後、ロックを取得する。
				String strPlntAprvNo = selPlntAprvNo(hdrR);
				if (isNull(strPlntAprvNo)) {
					hdrR.seq(MCNumber.ONE);
					_insPlntAprvL.add(hdrR);
				}
				else {
					for (PlntAprv_Chk01_RsltR crtR : crtList.subList(getHdrGroupCols(), getHdrGroupVals(rsltR))) {
						crtR.plnt_aprv_no(strPlntAprvNo);
						crtR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					hdrR.setAttributes(rsltR);
					hdrR.plnt_aprv_no(strPlntAprvNo);
					_aprvLForUpdTs.add(hdrR);
				}
			}
		}

		/**
		 * メイン処理
		 */
		protected void updMain() {

			// 工場出荷承認ヘッダの登録情報編集
			editHdr();

			// 工場出荷承認ヘッダの登録
			insHdr();

			// 工場出荷承認明細の削除
			delDtl();

			// 工場出荷承認明細の登録
			insDtl();

			// 工場出荷承認ヘッダの削除
			delHdr();

			// 工場出荷承認ヘッダの更新
			updHdrTs();
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 */
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			for (MST_PLNT_APRV_R r : _insPlntAprvL) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				
				oR.insp_no(null);
				oR.insp_typ(null);
				oR.lmt_up_flg(false);
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				oR.plnt_aprv_sts_typ(r.plnt_aprv_sts_typ());
				oR.insp_aprv_sts_typ(null);
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(true);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			MCIndexKey idxkey = up0().createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_no);
			if (!_insPlntAprvL.isEmpty()) {
				MCList<PlntAprv_Chk01_RsltR> tmpJudgL = MCList.create(PlntAprv_Chk01_RsltR.class);
				MCList<PlntAprv_Chk01_RsltR> tmpL = MCList.create(PlntAprv_Chk01_RsltR.class);
				for (MST_PLNT_APRV_R plntR : _insPlntAprvL) {
					PlntAprv_Chk01_RsltR rsltR = up0().getFirst(idxkey, plntR.plnt_aprv_no());
					if (isNull(rsltR.insp_act_judg_dt())) {
						tmpL.add(rsltR);
					}
					else {
						tmpJudgL.add(rsltR);
					}
				}

				MCIndexKey insJudgIdxkey = tmpJudgL.createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_judg_dt);
				for (PlntAprv_Chk01_RsltR rsltR : tmpJudgL.groupBy(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_judg_dt)) {
					int cnt = tmpJudgL.subList(insJudgIdxkey, rsltR.plnt_aprv_role_cd(), rsltR.insp_act_judg_dt()).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RQST);
					info.setMsg(new MCMessage(MSBFL0094, cnt));
					info.addAprvRole(rsltR.plnt_aprv_role_cd(), nvl(rsltR.insp_act_judg_dt(), getToday()));
					info.addScrBind(MSC_PLNT_APRV_REG_OPE.OPE_APRV_RJCT.value());

					mgr.exec();
				}

				MCIndexKey insIdxkey = tmpL.createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_end_tm);
				for (PlntAprv_Chk01_RsltR rsltR : tmpL.groupBy(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_end_tm)) {
					int cnt = tmpL.subList(insIdxkey, rsltR.plnt_aprv_role_cd(), rsltR.insp_act_end_tm()).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RQST);
					info.setMsg(new MCMessage(MSBFL0094, cnt));
					info.addAprvRole(rsltR.plnt_aprv_role_cd(), nvl(rsltR.insp_act_end_tm(), getToday()));
					info.addScrBind(MSC_PLNT_APRV_REG_OPE.OPE_APRV_RJCT.value());

					mgr.exec();
				}
			}

			if (!_delPlntAprvL.isEmpty()) {
				MCList<PlntAprv_Chk01_RsltR> tmpJudgL = MCList.create(PlntAprv_Chk01_RsltR.class);
				MCList<PlntAprv_Chk01_RsltR> tmpL = MCList.create(PlntAprv_Chk01_RsltR.class);
				for (MST_PLNT_APRV_R plntR : _delPlntAprvL) {
					PlntAprv_Chk01_RsltR rsltR = up0().getFirst(idxkey, plntR.plnt_aprv_no());
					if (isNull(rsltR.insp_act_judg_dt())) {
						tmpL.add(rsltR);
					}
					else {
						tmpJudgL.add(rsltR);
					}
				}

				MCIndexKey insJudgIdxkey = tmpJudgL.createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_judg_dt);
				for (PlntAprv_Chk01_RsltR rsltR : tmpJudgL.groupBy(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_judg_dt)) {
					int cnt = tmpJudgL.subList(insJudgIdxkey, rsltR.plnt_aprv_role_cd(), rsltR.insp_act_judg_dt()).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RQST);
					info.setMsg(new MCMessage(MSBFL0101, cnt));
					info.addAprvRole(rsltR.plnt_aprv_role_cd(), nvl(rsltR.insp_act_judg_dt(), getToday()));
					mgr.exec();
				}

				MCIndexKey insIdxkey = tmpL.createIndex(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_end_tm);
				for (PlntAprv_Chk01_RsltR rsltR : tmpL.groupBy(PlntAprv_Chk01_RsltR.$plnt_aprv_role_cd, PlntAprv_Chk01_RsltR.$insp_act_end_tm)) {
					int cnt = tmpL.subList(insIdxkey, rsltR.plnt_aprv_role_cd(), rsltR.insp_act_end_tm()).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.PLNT_APRV_RQST);
					info.setMsg(new MCMessage(MSBFL0101, cnt));
					info.addAprvRole(rsltR.plnt_aprv_role_cd(), nvl(rsltR.insp_act_end_tm(), getToday()));
					mgr.exec();
				}
			}
		}

		/**
		 * 工場出荷承認ヘッダの登録情報を編集する。
		 */
		protected void editHdr() {
			if (_insPlntAprvL.isEmpty()) {
				return;
			}
			MCIndexKey idxKey = _insPlntAprvL.createIndex(getHdrGroupCols());
			
			MST_PLNT_APRV_R hdrR = null;
			for (PlntAprv_Chk01_RsltR rsltR : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(rsltR.data_crud_typ())) {
					hdrR = getHdrR(idxKey, rsltR);

					//工場出荷承認ヘッダはup0から作成されているので
					//getHdrRがnullを返すことはありえない。
					//よってhdrRがnullである可能性を考慮しない。
					if (isNull(hdrR.plnt_aprv_no())) {
						//発番
						hdrR.plnt_aprv_no(getStrSeq(MSC_NUM_SYS_TYP.PLNTAPRV));
					}
					hdrR.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.OPN.value());
					//明細の更新用に値を設定。
					rsltR.plnt_aprv_no(hdrR.plnt_aprv_no());
				}
			}
		}

		/**
		 * 工場出荷承認ヘッダを登録する。
		 */
		protected void insHdr() {
			if (!_insPlntAprvL.isEmpty()) {
				dbInsert("MSBFL5100_MST_PLNT_APRV_I01", _insPlntAprvL, _insPlntAprvL_bldr);
			}
		}

		/**
		 * 工場出荷承認明細を削除する。
		 */
		protected void delDtl() {
			MCList<MST_PLNT_APRV_D_R> aprvDL = MCList.create(MST_PLNT_APRV_D_R.class);

			for (PlntAprv_Chk01_RsltR rsltR : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(rsltR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(rsltR.data_crud_typ())) {
					MST_PLNT_APRV_D_R apvrDR = MST_PLNT_APRV_D_R.create();
					apvrDR.plnt_aprv_d_no(rsltR.plnt_aprv_d_no());
					aprvDL.add(apvrDR);
				}
			}
			if (!aprvDL.isEmpty()) {
				MCQueryApiBuilder aprvDL_bldr = MCQueryApiBuilder.create(MST_PLNT_APRV_D_R.create("T"));
				dbDeleteKey("MSBFL5100_MST_PLNT_APRV_D_D01", aprvDL, aprvDL_bldr);
			}
		}

		/**
		 * 工場出荷承認明細を登録する。
		 */
		protected void insDtl() {
			MCList<MST_PLNT_APRV_D_R> aprvDL = MCList.create(MST_PLNT_APRV_D_R.class);

			MCList<MST_INSP_ACT_R> inspActL = getInspActL();
			MCIndexKey idxkey = inspActL.createIndex(MST_INSP_ACT_R.$insp_no);
			for (PlntAprv_Chk01_RsltR rsltR : up0()) {
				MST_INSP_ACT_R inspActR = inspActL.getFirst(idxkey, rsltR.insp_no());
				if (MAC_DATA_CRUD_TYP.isCRT(rsltR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(rsltR.data_crud_typ())) {

					MST_PLNT_APRV_D_R apvrDR = MST_PLNT_APRV_D_R.create();

					copy(apvrDR, rsltR, createMap_MST_PLNT_APRV_D_R_PlntAprv_Chk01_RsltR());

					if (!isNull(inspActR)) {
						apvrDR.base_unit_qty(MCNumber.ZERO);
						apvrDR.base_unit_cd(inspActR.base_unit_cd());
						if (isNull(apvrDR.insp_typ())) {
							apvrDR.insp_typ(inspActR.insp_typ());
						}
						rsltR.insp_act_end_tm(
								inspActR.end_tm().trunc(MCDateFieldType.DAY));
						rsltR.insp_act_judg_dt(inspActR.judg_dt());
					}
					rsltR.plnt_aprv_d_no(getStrSeq(MSC_NUM_SYS_TYP.PLNTAPRVD));
					apvrDR.plnt_aprv_d_no(rsltR.plnt_aprv_d_no());
					apvrDR.setStringNE("insp_schd_no", rsltR.insp_schd_no());
					aprvDL.add(apvrDR);
				}
			}
			if (!aprvDL.isEmpty()) {
				editPlntAprvD(aprvDL);
				MCQueryApiBuilder aprvDL_bldr = MCQueryApiBuilder.create(MST_PLNT_APRV_D_R.create("T"));
				dbInsert("MSBFL5100_MST_PLNT_APRV_D_I01", aprvDL, aprvDL_bldr);
			}
		}

		protected void editPlntAprvD(MCList<MST_PLNT_APRV_D_R> aprvDL) {
			for (MST_PLNT_APRV_D_R r : aprvDL) {
				if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
					editPlntAprvD_LOT(r);
				}
				else {
					editPlntAprvD_SUB(r);
				}
			}
		}
		/**
		 * 基準単位数量の設定：ロット検査時
		 * @param aprvDR
		 */
		protected void editPlntAprvD_LOT(MST_PLNT_APRV_D_R aprvDR) {
			if (isNull(aprvDR.getStringNE("insp_schd_no"))) {
				return;
			}
			MCList<MST_INSP_ACT_D_R> subInspActDL = _inspActDL.subList(_actDIdxkey, aprvDR.insp_no(), aprvDR.getStringNE("insp_schd_no"));
			if (subInspActDL.isEmpty()) {
				aprvDR.base_unit_qty(MCNumber.ZERO);
			}
			else {
				aprvDR.base_unit_qty(nvl(subInspActDL.sum(MST_INSP_ACT_D_R.$base_unit_qty), MCNumber.ZERO));
			}
		}
		
		/**
		 * 基準単位数量の設定：製造・受入検査時
		 * @param aprvDR
		 */
		protected void editPlntAprvD_SUB(MST_PLNT_APRV_D_R aprvDR) {
			if (isNull(aprvDR.src_no4())) {
				return;
			}
			MST_INSP_SCHD_R schdR = _inspSchdL.getFirst(_schdIdxkey, aprvDR.insp_no(), aprvDR.src_no4());
			if (isNull(schdR)) {
				return;
			}
			// 検査中使用許可ＦＬＧがオンの場合
			if (schdR.in_prmt_insp_flg()) {
				// 初回検査予定ＮＯに紐づく検査予定リスト取得
				MCList<MST_INSP_SCHD_R> subOrgInspSchdL = _orgInspSchdL.subList(_orgSchdIdxkey, schdR.org_insp_schd_no());
				MCNumber sumSoQty = MCNumber.ZERO;
				for (MST_INSP_SCHD_R subOrgInspSchdR : subOrgInspSchdL) {
					MCList<MST_INSP_SMPL_ACT_R> subSmplActL = _inspSmplActL.subList(_smplIdxkey, subOrgInspSchdR.insp_schd_no());
					if (!subSmplActL.isEmpty()) {
						for (MST_INSP_SMPL_ACT_R subSmplActR : subSmplActL) {
							sumSoQty = sumSoQty.add(nvl(subSmplActR.so_qty(), MCNumber.ZERO));
						}
					}
				}
				aprvDR.base_unit_qty(schdR.base_unit_qty().subtract(sumSoQty));
			}
			else {
				MCList<MST_INSP_ACT_D_R> subInspActDL = _inspActDL.subList(_actDIdxkey, aprvDR.insp_no(), aprvDR.src_no4());
				if (subInspActDL.isEmpty()) {
					aprvDR.base_unit_qty(MCNumber.ZERO);
				}
				else {
					aprvDR.base_unit_qty(nvl(subInspActDL.sum(MST_INSP_ACT_D_R.$base_unit_qty), MCNumber.ZERO));
				}
			}
		}
		/**
		 * 工場出荷承認ヘッダを削除する。<br>
		 * ※工場出荷承認明細のメンテナンスが終わったあとに実行すること。
		 */
		protected void delHdr() {
			//ヘッダに紐づく明細がない場合は、MST_PLNT_APRVを削除する。
			for (PlntAprv_Chk01_RsltR rsltR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(rsltR.data_crud_typ())) {
					MST_PLNT_APRV_R aprvR = MST_PLNT_APRV_R.create();
					
					if (!existsDtl(rsltR.plnt_aprv_no())) {
						aprvR.plnt_aprv_no(rsltR.plnt_aprv_no());
						_delPlntAprvL.add(aprvR);
					}
					else {
						//明細だけ削除し、ヘッダを削除しない場合は
						//空更新対象とする。
						if (!existsUpdTsList(rsltR.plnt_aprv_no())) {
							aprvR.plnt_aprv_no(rsltR.plnt_aprv_no());
							_aprvLForUpdTs.add(aprvR);
						}
					}
				}
			}
			if (!_delPlntAprvL.isEmpty()) {
				dbDeleteKey("MSBFL5100_MST_PLNT_APRV_D01", _delPlntAprvL, _delPlntAprvL_bldr);
			}
		}

		/**
		 * 工場出荷承認ヘッダを空更新する。
		 */
		protected void updHdrTs() {
			for (PlntAprv_Chk01_RsltR rsltR : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(rsltR.data_crud_typ())) {
					if (!existsUpdTsList(rsltR.plnt_aprv_no())) {
						MST_PLNT_APRV_R aprvR = MST_PLNT_APRV_R.create();
						aprvR.plnt_aprv_no(rsltR.plnt_aprv_no());
						_aprvLForUpdTs.add(aprvR);
					}
				}
			}
			if (!_aprvLForUpdTs.isEmpty()) {
				dbTsUpdateKey("MSBFL5100_MST_PLNT_APRV_U01", _aprvLForUpdTs, _aprvLForUpdTs_bldr.getBaseDbc());
			}
		}

		/**
		 * ヘッダに紐づく明細が存在するかどうか。
		 * 
		 * @param strPlntAprvNo 工場出荷承認ＮＯ
		 * @return
		 */
		protected boolean existsDtl(String strPlntAprvNo) {
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			int cnt = execDbCount("MSBFL5100_MST_PLNT_APRV_D_S01", t, t.plnt_aprv_no.eq(bind("1")), strPlntAprvNo);
			return cnt > 0;
		}

		/**
		 * 工場出荷承認ＮＯが空更新対象のリストに既に存在するかどうか
		 * 
		 * @param strPlntAprvNo 工場出荷承認ＮＯ
		 * @return
		 */
		protected boolean existsUpdTsList(String strPlntAprvNo) {
			return !isNull(_aprvLForUpdTs.getFirst(MST_PLNT_APRV_R.$plnt_aprv_no, strPlntAprvNo));
		}

		/**
		 * 検査実績ヘッダ情報を取得する。
		 * 
		 * @param 検査実績ヘッダ情報
		 */
		protected MCList<MST_INSP_ACT_R>  getInspActL() {
			MCList<MST_INSP_ACT_R> bindL = MCList.create(MST_INSP_ACT_R.class);
			for (PlntAprv_Chk01_RsltR r : up0()) {
				if (!isNull(r.insp_no())){
					MST_INSP_ACT_R bindR = MST_INSP_ACT_R.create();
					bindR.insp_no(r.insp_no());
					bindL.add(bindR);
				}
			}
			
			if (bindL.isEmpty()) {
				return bindL;
			}
			MCList<MST_INSP_ACT_R> dbc = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.addSelect(t.base_unit_qty);
			dbc_bldr.addSelect(t.base_unit_cd);
			dbc_bldr.addSelect(t.insp_typ);
			dbc_bldr.addSelect(t.end_tm);
			dbc_bldr.addSelect(t.judg_dt);
			dbSelectColumn("MSBFL5100_MST_INSP_ACT_S01", dbc, dbc_bldr, bindL, MST_INSP_ACT_R.$insp_no);

			return dbc;
		}

		/**
		 * 工場出荷承認ヘッダコンテナからrsltRに紐づくヘッダとなるべき行を取得する。
		 * 
		 * @param idxKey キー
		 * @param dtlR 上り電文の行
		 * @return
		 */
		protected MST_PLNT_APRV_R getHdrR(MCIndexKey idxKey, PlntAprv_Chk01_RsltR dtlR) {
			return _insPlntAprvL.getFirst(idxKey, getHdrGroupVals(dtlR));
		}
		
		/**
		 * getHdrGroupColsで取得される列の値を配列として返す。
		 * @param dtlR
		 * @return
		 */
		protected String[] getHdrGroupVals(PlntAprv_Chk01_RsltR dtlR) {
			String[] ret = new String[getHdrGroupCols().length];
			for (int i = 0; i < ret.length; i++) {
				//getHdrGroupColsで返されたカラムはStringである前提で
				//getStringしている。
				ret[i] = dtlR.getString(getHdrGroupCols()[i]);
			}
			return ret;
		}

		/**
		 * 工場出荷承認ヘッダのグループ化の単位を取得する。
		 */
		protected String[] getHdrGroupCols() {
			if (_hdrGroupCols == null) {
				_hdrGroupCols = new String[] {
						MST_PLNT_APRV_R.$itm_cd, MST_PLNT_APRV_R.$itm_sub1,
						MST_PLNT_APRV_R.$itm_sub2, MST_PLNT_APRV_R.$itm_sub3,
						MST_PLNT_APRV_R.$lot_no, MST_PLNT_APRV_R.$sublot_no,
						MST_PLNT_APRV_R.$site_cd, MST_PLNT_APRV_R.$plnt_aprv_role_cd
				};	
			}
			return _hdrGroupCols;
		}
	}

	/**
	 * 工場・物流倉庫ＣＤを補完する。
	 * 
	 * @param upL 上り電文リスト
	 */
	protected MCList<PlntAprv_Chk01_RsltR> setSiteCdForUp(MCList<PlntAprv_Chk01_RsltR> upL) {
		MCList<PlntAprv_Chk01_RsltR> newUpL = MCList.create(PlntAprv_Chk01_RsltR.class);
		for (PlntAprv_Chk01_RsltR upR : upL) {
			MAM_LOC_R locR = getLocR(upR.loc_cd());
			// 販売場所の場合、工場・物流倉庫ＣＤを補完しない
			if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
				continue;
			}
			upR.site_cd(nvl(locR.site_cd(), MAC_STR.NULL_VAL.value()));
			newUpL.add(upR);
		}

		return newUpL;
	}

	/**
	 * 場所マスタコンテナを取得する。
	 * 
	 * @param locCd 場所ＣＤ
	 * @return 場所マスタコンテナ
	 */
	protected MAM_LOC_R getLocR(String locCd) {
		Comparable<?>[] in = {locCd};
		MAM_LOC_R retR = getLocCache().getCache(in);
		if (retR == null) {
			retR = MAM_LOC_R.create();
		}

		return retR;
	}

	/**
	 * 品目マスタ(工場・物流倉庫)コンテナを取得する。
	 * 
	 * @param itmCd 品目ＣＤ
	 * @param itmSub1 枝番１
	 * @param itmSub2 枝番２
	 * @param itmSub3 枝番３
	 * @param siteCd 工場・物流倉庫
	 * 
	 * @return 品目マスタコンテナ
	 */
	protected MAM_ITM_SITE_R getItmSiteR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String siteCd) {

		Comparable<?>[] in = {itmCd, itmSub1, itmSub2, itmSub3, siteCd};
		MAM_ITM_SITE_R retR = getItmSiteCache().getCache(in);
		if (retR == null) {
			retR = MAM_ITM_SITE_R.create();
		}
		
		return retR;
	}

	/**
	 * 上り電文のサブロットに対応する、承認前の工場出荷承認ヘッダが
	 * 存在する場合、その工場出荷承認実績ＮＯを返す。
	 * 存在しない場合はNULLを返す。
	 * @return 
	 */
	protected String selPlntAprvNo(MST_PLNT_APRV_R hdrR) {
		//同一サブロットの工場出荷承認ヘッダが複数件取得された場合は、
		//NOの新しいものを採用する。
		//※以下のオペレーションを行うと複数件取得されることがある。
		//１．一旦あるサブロットを工場出荷承認する。
		//２．同一のサブロットの検査実績を異なるタイミングで登録し承認前のデータを作る。
		//３．１の工場出荷承認を取り消す。
		MCList<MST_PLNT_APRV_R> plntAprvL = MCList.create(MST_PLNT_APRV_R.class);
		MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
		MCQueryApiBuilder plntAprvL_bldr = MCQueryApiBuilder.create(t);
		plntAprvL_bldr.setSelect(t.plnt_aprv_no);
		plntAprvL_bldr.setWhere(t.itm_cd.eq(bind("1")), hdrR.itm_cd());
		plntAprvL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), hdrR.itm_sub1());
		plntAprvL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), hdrR.itm_sub2());
		plntAprvL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), hdrR.itm_sub3());
		plntAprvL_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), hdrR.lot_no());
		plntAprvL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("1")), hdrR.sublot_no());
		plntAprvL_bldr.addWhereWithAnd(t.site_cd.eq(bind("1")), hdrR.site_cd());
		plntAprvL_bldr.addWhereWithAnd(t.plnt_aprv_sts_typ.eq(bind("1")), MSC_PLNT_APRV_STS_TYP.OPN.value());

		plntAprvL_bldr.addOrderByDesc(t.plnt_aprv_no);
		dbSelect("MSBFL5100_MST_PLNT_APRV_S03", plntAprvL, plntAprvL_bldr);

		if (plntAprvL.isEmpty()) {
			return null;
		}
		else {
			return plntAprvL.get(0).plnt_aprv_no();
		}
	}

	// Mapping
	protected Map_MST_PLNT_APRV_D_R_PlntAprv_Chk01_RsltR<MST_PLNT_APRV_D_R,PlntAprv_Chk01_RsltR> createMap_MST_PLNT_APRV_D_R_PlntAprv_Chk01_RsltR() {
		return new Map_MST_PLNT_APRV_D_R_PlntAprv_Chk01_RsltR<MST_PLNT_APRV_D_R, PlntAprv_Chk01_RsltR>();
	}

	public class Map_MST_PLNT_APRV_D_R_PlntAprv_Chk01_RsltR<D extends MST_PLNT_APRV_D_R, S extends PlntAprv_Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PLNT_APRV_D_R.$plnt_aprv_no, PlntAprv_Chk01_RsltR.$plnt_aprv_no);
			addColumnPathMap(MST_PLNT_APRV_D_R.$insp_typ, PlntAprv_Chk01_RsltR.$insp_typ);
			addColumnPathMap(MST_PLNT_APRV_D_R.$insp_no, PlntAprv_Chk01_RsltR.$insp_no);
			addColumnPathMap(MST_PLNT_APRV_D_R.$src_no1, PlntAprv_Chk01_RsltR.$src_no1);
			addColumnPathMap(MST_PLNT_APRV_D_R.$src_no2, PlntAprv_Chk01_RsltR.$src_no2);
			addColumnPathMap(MST_PLNT_APRV_D_R.$src_no3, PlntAprv_Chk01_RsltR.$src_no3);
			addColumnPathMap(MST_PLNT_APRV_D_R.$src_no4, PlntAprv_Chk01_RsltR.$src_no4);
		}
	}

	//FMCB CUSTOM END
}