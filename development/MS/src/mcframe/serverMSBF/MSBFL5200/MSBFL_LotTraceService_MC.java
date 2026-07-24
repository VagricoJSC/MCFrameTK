package mcframe.serverMSBF.MSBFL5200;

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
import mcframe.serverMSBF.MSBFL5200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBF.MSBFL5200.Query.*;
import mcframe.serverFXUC.FXUCL0030.*;

import java.util.HashMap;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotTraceService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotTraceService_MC extends MSBFL_LotTraceService_MC_A{
	//FMCB CUSTOM START

	/**
	 * LotTrace_Chk01オペレーション.<p>
	 *
	 * 出荷時構成チェックを行う。<br>
	 */
	public class LotTrace_Chk01 extends MSBFL_LotTraceService_MC_A.LotTrace_Chk01 {

		// 場所マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;
		// 品目マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		// 品目マスタ（工場・物流倉庫）コンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _cacheItmSiteL = null;
		// ロット管理コンテナキャッシュ
		protected FXUCL_MCDbcCache<MST_LOT_R> _cacheLotL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			MCMessageList msgL = new MCMessageList();

			if (isChkExec()) {

				// 前処理
				prepare();
				
				// 出荷時構成チェック
				msgL.addAll(checkMain());
			}

			if (!up1().no_err_msg_flg()) {
				MCMessagePool.addAll(msgL);
			}

			// 下り電文設定
			setDown();
		}
		protected boolean isChkExec() {
			if (up0().isEmpty()) {
				return false;
			}
			if (up0().get(0).plnt_aprv_flg()) {
				return true;
			}
			if (isSame(getSysParm("IN_PRMT_INSP_ENABLE_FLG"), "1")) {
				return true;
			}
			return false;
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			for (LotTrace_Chk01_RsltR r : up0()) {
				if (isNull(r.site_cd())) {
					MAM_LOC_R locR = getLocR(r.loc_cd());
					r.site_cd(locR.site_cd());
				}
				r.sublot_mng_typ(getItmR(r).sublot_mng_typ());
			}
		}

		/**
		 * 自身又は構成品に検査中又は不良品のサブロットが存在するかどうかをチェックする。
		 * 
		 */
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();

			MCList<LotTrace_Srch02_RsltR> lotTraceSrch02DownL = execLotTraceSrch02OrSrch04();
			MCIndexKey idxkey = lotTraceSrch02DownL.createIndex(LotTrace_Chk01_RsltR.$peg_no);

			for (LotTrace_Chk01_RsltR r : up0()) {
				if (isNoLot(r)) {
					continue;
				}
				
				if (isChkMaterials(r)) {
					MCList<LotTrace_Srch02_RsltR> subLotTraceRsltL = lotTraceSrch02DownL.subList(idxkey, r.peg_no_chk());
					// 構成品の各区分の設定
					setCompItmTyp(r, subLotTraceRsltL);

					if (r.no_chk_flg()) {
						continue;
					}

					//不要なレコードを探索しないようにするためトップの階層をsubListする。
					MCList<LotTrace_Srch02_RsltR> rsltL = subLotTraceRsltL.subList(LotTrace_Srch02_RsltR.$hrrchy, getTopHrrchy());

					if (isTraceLotInspTyp(r)) {
						if (hasDuringInsp(rsltL)) {
							msgL.add(new MCMessage(r, null, MSBFL0001
									, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
									, r.lot_no(), r.sublot_no()
									, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
					if (isTraceLotQualityTyp(r)) {
						if (hasNotGood(rsltL)) {
							msgL.add(new MCMessage(r, null, MSBFL0002
									, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
									, r.lot_no(), r.sublot_no()
									, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}

					if (isTraceLotMfgAprvStsTyp(r)) {
						if (hasDuringProdAprv(rsltL)) {
							msgL.add(new MCMessage(r, null, MSBFL0003
									, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
									, r.lot_no(), r.sublot_no()
									, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
				else {
					if (isChkLotMfgAprvStsTyp(r)) {
						if (isNotOwnlotMfgAprv(r)) {
							msgL.add(new MCMessage(r, null, MSBFL0004
									, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
									, r.lot_no(), r.sublot_no()
									, toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
			}

			return msgL;
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected MCList<LotTrace_Srch02_RsltR> execLotTraceSrch02OrSrch04() {
			MCList<LotTrace_Chk01_RsltR> subUpL = up0().subList(r -> isChkMaterials(r));

			MCList<LotTrace_Chk01_RsltR> grL = subUpL.groupBy(LotTrace_Chk01_RsltR.$itm_cd, LotTrace_Chk01_RsltR.$itm_sub1, LotTrace_Chk01_RsltR.$itm_sub2, LotTrace_Chk01_RsltR.$itm_sub3,
					 LotTrace_Chk01_RsltR.$lot_no, LotTrace_Chk01_RsltR.$sublot_no, 
					 LotTrace_Chk01_RsltR.$sno1, LotTrace_Chk01_RsltR.$sno2, LotTrace_Chk01_RsltR.$sno3, LotTrace_Chk01_RsltR.$sno4);

			setPegNo(grL);
			MCIndexKey idxkey = up0().createIndex(LotTrace_Chk01_RsltR.$itm_cd, LotTrace_Chk01_RsltR.$itm_sub1, LotTrace_Chk01_RsltR.$itm_sub2, LotTrace_Chk01_RsltR.$itm_sub3,
					 LotTrace_Chk01_RsltR.$lot_no, LotTrace_Chk01_RsltR.$sublot_no, LotTrace_Chk01_RsltR.$sno1, LotTrace_Chk01_RsltR.$sno2, LotTrace_Chk01_RsltR.$sno3, LotTrace_Chk01_RsltR.$sno4);

			MCList<LotTrace_Srch02_CndR> upL = MCList.create(LotTrace_Srch02_CndR.class);
			for (LotTrace_Chk01_RsltR upR : grL) {
				// チェック用のpeg_no_chkを設定
				up0().subList(idxkey, upR.itm_cd()
						, upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.lot_no(), upR.sublot_no()
						, upR.sno1(), upR.sno2(), upR.sno3(), upR.sno4()).setNumber(LotTrace_Chk01_RsltR.$peg_no_chk, upR.peg_no());
				LotTrace_Srch02_CndR cndR = LotTrace_Srch02_CndR.create();
				copy(cndR, upR, createMap_LotTrace_Srch02_CndR_LotTrace_Chk01_RsltR());
				upL.add(cndR);
			}

			if (up1().lst_reg_flg()) {
				MSBFL_LotTraceService.LotTrace_Srch04 o = MSBFL_LotTraceService.crtLotTrace_Srch04();
				o.up0().addAll(upL);
				o.exec();
				return o.down0();
			}
			else {
				MSBFL_LotTraceService.LotTrace_Srch02 o = MSBFL_LotTraceService.crtLotTrace_Srch02();
				o.up0().addAll(upL);
				o.exec();
				return o.down0();
			}
		}

		/**
		 * 構成品の検査区分、良品区分、製造承認区分を設定する。
		 * 
		 * @param r
		 * @param lotRsltL ロットトレース情報リスト
		 */
		protected void setCompItmTyp(LotTrace_Chk01_RsltR r, MCList<LotTrace_Srch02_RsltR> lotRsltL) {
			// 構成品検査区分
			MCList<LotTrace_Srch02_RsltR> subL = lotRsltL.subList(chkR -> isNotInspFinRow(chkR));
			if (subL.isEmpty()) {
				r.comp_itm_insp_typ(MSC_COMP_ITM_INSP_TYP.CMPL.value());
			}
			else {
				r.comp_itm_insp_typ(MSC_COMP_ITM_INSP_TYP.YET.value());
			}

			// 構成品良品区分
			subL = lotRsltL.subList(chkR -> isNotGoodRow(chkR));
			if (subL.isEmpty()) {
				r.comp_itm_quality_typ(MSC_COMP_ITM_QUALITY_TYP.GOOD.value());
			}
			else {
				r.comp_itm_quality_typ(MSC_COMP_ITM_QUALITY_TYP.DFCT.value());
			}

			// 構成品製造承認区分
			subL = lotRsltL.subList(chkR -> isNotActAcptRow(chkR));
			if (subL.isEmpty()) {
				r.comp_itm_mfg_aprv_typ(MSC_COMP_ITM_MFG_APRV_TYP.ACPT.value());
			}
			else {
				r.comp_itm_mfg_aprv_typ(MSC_COMP_ITM_MFG_APRV_TYP.OPN.value());
			}
		}
		
		/**
		 * 検査未完了の情報があるか判定する
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isNotInspFinRow(LotTrace_Srch02_RsltR r) {
			if (MSC_STK_INSP_TYP.isYET(r.stk_insp_typ()) 
					|| MSC_STK_INSP_TYP.isING(r.stk_insp_typ())
					|| MSC_STK_INSP_TYP.isWAIT_JUDG(r.stk_insp_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 不良品があるか判定する
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isNotGoodRow(LotTrace_Srch02_RsltR r) {
			if (MAC_QUALITY_TYP.isDFCT_INSP(r.quality_typ()) 
					|| MAC_QUALITY_TYP.isDFCT_OPER(r.quality_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 製造未承認の情報があるか判定する
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isNotActAcptRow(LotTrace_Srch02_RsltR r) {
			if (MSC_MFG_APRV_STS_TYP.isINST_OPN(r.mfg_aprv_sts_typ()) 
					|| MSC_MFG_APRV_STS_TYP.isINST_ACPT(r.mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isACT_OPN(r.mfg_aprv_sts_typ())) {
				return true;
			}
			return false;
		}

		/**
		 * ロットが設定されているかを返す。ロットＮＯ、サブロットＮＯが両方ともＮＵＬＬ文字の場合はチェック対象外とする。
		 * @param r
		 * @return
		 */
		protected boolean isNoLot(LotTrace_Chk01_RsltR r) {
			if (MAC_STR.isNULL_VAL(r.lot_no()) && MAC_STR.isNULL_VAL(r.sublot_no())) {
				return true;
			}
			return false;
		}
		/**
		 * 構成品チェックを行うかどうかを返す。
		 * @param r
		 * @return
		 */
		protected boolean isChkMaterials(LotTrace_Chk01_RsltR r) {
			return isTraceLotInspTyp(r) || isTraceLotQualityTyp(r) || isTraceLotMfgAprvStsTyp(r);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 *
		 * @param r 指定条件
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_R getItmR(LotTrace_Chk01_RsltR r) {
			if (_cacheItmL == null) {
				MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
				for (LotTrace_Chk01_RsltR upR : up0()) {
					MAM_ITM_R bindR = MAM_ITM_R.create();

					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindL.add(bindR);
				}
				createItmCache(bindL);
			}

			MAM_ITM_R retR = _cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (retR == null) {
				retR = MAM_ITM_R.create();
			}
			return retR;
		}

		/**
		 * 品目マスタ（工場・物流倉庫）コンテナを取得する。
		 *
		 * @param r 指定条件
		 * @return 品目マスタ（工場・物流倉庫）コンテナ
		 */
		protected MAM_ITM_SITE_R getItmSiteR(LotTrace_Chk01_RsltR r) {
			if (_cacheItmSiteL == null) {
				MCList<MAM_ITM_SITE_R> bindL = MCList.create(MAM_ITM_SITE_R.class);
				for (LotTrace_Chk01_RsltR upR : up0()) {
					MAM_ITM_SITE_R bindR = MAM_ITM_SITE_R.create();

					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindR.site_cd(upR.site_cd());
					bindL.add(bindR);
				}
				createItmSiteCache(bindL);
			}

			MAM_ITM_SITE_R retR = _cacheItmSiteL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.site_cd());
			if (retR == null) {
				retR = MAM_ITM_SITE_R.create();
			}
			return retR;
		}

		/**
		 * ロット管理コンテナを取得する。
		 * 
		 * @param r 指定条件
		 * @return ロット管理コンテナ
		 */
		protected MST_LOT_R getLotR(LotTrace_Chk01_RsltR r) {
			if (_cacheLotL == null) {
				MCList<MST_LOT_R> bindL = MCList.create(MST_LOT_R.class);
				for (LotTrace_Chk01_RsltR upR : up0()) {
					MST_LOT_R bindR = MST_LOT_R.create();
					bindR.itm_cd(upR.itm_cd());
					bindR.itm_sub1(upR.itm_sub1());
					bindR.itm_sub2(upR.itm_sub2());
					bindR.itm_sub3(upR.itm_sub3());
					bindR.lot_no(upR.lot_no());
					if (MAC_SUBLOT_MNG_TYP.isSTK(upR.sublot_mng_typ())) {
						bindR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						bindR.sublot_no(upR.sublot_no());
					}

					bindL.add(bindR);
				}
				createLotCache(bindL);
			}

			String strSublotNo = r.sublot_no();
			if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
				strSublotNo = MAC_STR.NULL_VAL.value();
			}
			MST_LOT_R retR = _cacheLotL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), strSublotNo);
			if (retR == null) {
				retR = MST_LOT_R.create();
			}

			return retR;
		}

		/**
		 * 場所マスタコンテナを取得する。
		 * 
		 * @param locCd 場所ＣＤ
		 * @return 場所マスタコンテナ
		 */
		protected MAM_LOC_R getLocR(String locCd) {
			if (_cacheLocL == null) {
				MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
				for (LotTrace_Chk01_RsltR upR : up0()) {
					MAM_LOC_R bindR = MAM_LOC_R.create();
					bindR.loc_cd(upR.loc_cd());
					bindL.add(bindR);
				}
				createLocCache(bindL);
			}

			MAM_LOC_R retR = _cacheLocL.get(locCd);
			if (retR == null) {
				retR = MAM_LOC_R.create();
			}
			return retR;
		}

		/**
		 * 場所マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL 検索条件
		 */
		protected void createLocCache(MCList<MAM_LOC_R> bindL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.site_cd);
			_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, bindL, MAM_LOC_R.$loc_cd);
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL 検索条件
		 */
		protected void createItmCache(MCList<MAM_ITM_R> bindL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, bindL, MAM_ITM_SITE_R.$itm_cd,
					MAM_ITM_SITE_R.$itm_sub1, MAM_ITM_SITE_R.$itm_sub2,
					MAM_ITM_SITE_R.$itm_sub3);
		}

		/**
		 * 品目マスタ（工場・物流倉庫）コンテナキャッシュを初期化する。
		 * 
		 * @param bindL 検索条件
		 */
		protected void createItmSiteCache(MCList<MAM_ITM_SITE_R> bindL) {
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.so_prmt_insp_flg);
			_cacheItmSiteL = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(dbc_bldr, bindL,
					MAM_ITM_SITE_R.$itm_cd, MAM_ITM_SITE_R.$itm_sub1,
					MAM_ITM_SITE_R.$itm_sub2, MAM_ITM_SITE_R.$itm_sub3,
					MAM_ITM_SITE_R.$site_cd);
		}

		/**
		 * ロット管理コンテナキャッシュを初期化する。
		 * 
		 * @param bindL 検索条件
		 */
		protected void createLotCache(MCList<MST_LOT_R> bindL) {
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.mfg_aprv_sts_typ);
			_cacheLotL = new FXUCL_MCDbcCache<MST_LOT_R>(dbc_bldr, bindL, MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		}

		/**
		* 自身が検査中もしくは、検査中のサブロットを構成品に含むかどうかを返す。
		*/
		protected boolean hasDuringInsp(MCList<LotTrace_Srch02_RsltR> rsltL) {
			//自身が検査中かどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$stk_insp_flg, true))) {
				return true;
			}

			//構成品が検査中かどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$hrchy_stk_insp_flg, true))) {
				return true;
			}

			return false;
		}

		/**
		* 自身が良品以外もしくは、良品以外のサブロットを構成品に含むかどうかを返す。
		*/
		protected boolean hasNotGood(MCList<LotTrace_Srch02_RsltR> rsltL) {
			//自身が良品以外かどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$not_quality_good_flg, true))) {
				return true;
			}
			//構成品が良品以外かどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$hrchy_not_quality_good_flg, true))) {
				return true;
			}
			return false;
		}

		/**
		* 自身が記録承認されていないもしくは、記録承認されていないサブロットを構成品に含むかどうかを返す。
		*/
		protected boolean hasDuringProdAprv(MCList<LotTrace_Srch02_RsltR> rsltL) {
			//自身が記録承認されていないかどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$not_mfg_aprv_acpt_flg, true))) {
				return true;
			}
			//構成品が記録承認されていないかどうか
			if (!isNull(rsltL.getFirst(LotTrace_Srch02_RsltR.$hrchy_not_mfg_aprv_acpt_flg, true))) {
				return true;
			}
			return false;
		}

		/**
		 * 検査中出荷許可品かつ検査中の品目が
		 * 構成品に存在するかどうかのチェックを行う場合trueを返す。
		 * @param r
		 * @return
		 */
		protected boolean isTraceLotInspTyp(LotTrace_Chk01_RsltR r) {
			if (r.skip_chk_ship_flg()) {
				return false;
			}

			if (!r.plnt_aprv_flg()) { 
				MAM_ITM_SITE_R itmR = getItmSiteR(r);
				return !itmR.so_prmt_insp_flg();
			}
			else {
				return true;
			}
		}

		/**
		 * 検査中使用許可品かつ不良品が
		 * 構成品に存在するかどうかのチェックを行う場合trueを返す。
		 * @param r	
		 * @return
		 */
		protected boolean isTraceLotQualityTyp(LotTrace_Chk01_RsltR r) {
			if (r.skip_chk_ship_flg()) {
				return false;
			}
			
			return true;
		}

		/**
		 * 構成品に製造記録未承認のロットが存在するかどうかのチェックを行う場合trueを返す。
		 * @param r
		 * @return
		 */
		protected boolean isTraceLotMfgAprvStsTyp(LotTrace_Chk01_RsltR r) {
			if (r.skip_chk_ship_flg()) {
				return false;
			}
			
			if (r.plnt_aprv_flg()) {
				// 製造記録承認されていないロットの工場出荷を止めたい場合は、
				// 工場出荷承認対象としてもらう想定なので、
				// 製造記録承認済みか否かのチェックは、工場出荷承認時にだけ行う仕様。
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * ロットトレースは行わず、処理対象のロットの製造承認状況のみチェックする場合にtrueを返す
		 * @param r
		 * @return
		 */
		protected boolean isChkLotMfgAprvStsTyp(LotTrace_Chk01_RsltR r) {
			if (r.plnt_aprv_flg()) {
				// 工場出荷承認から実行された場合かつ、出荷時構成チェックを行わない場合、
				// 自身の製造承認状況のみチェックするために、trueを返す。
				if (!isTraceLotMfgAprvStsTyp(r)) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 処理対象のロットの製造記録承認が行われていない場合trueを返す。
		 * ※NULLの場合はfalseを返す。
		 * @param r
		 * @return
		 */
		protected boolean isNotOwnlotMfgAprv(LotTrace_Chk01_RsltR r) {
			MST_LOT_R lotR = getLotR(r);

			if (isNull(lotR.mfg_aprv_sts_typ())) {
				return false;
			}
			else if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(lotR.mfg_aprv_sts_typ())) {
				return false;
			}
			else {
				return true;
			}
		}

		/**
		 * トップ階層の階層番号を返す。
		 * @return
		 */
		protected MCNumber getTopHrrchy() {
			return MCNumber.ZERO;
		}
	}
	/**
	 * LotTrace_Srch01オペレーション.<p>
	 *
	 * ロットトレース入出庫情報を検索する。<br>
	 */
	public class LotTrace_Srch01 extends MSBFL_LotTraceService_MC_A.LotTrace_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// ロットトレース入出庫情報取得
			srchLot();

			// 承認・判定情報取得
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				srchAprvJudg();
			}
		}

		/**
		 * ロットトレース入出庫情報を取得する。
		 */
		protected void srchLot(){
			for (LotTrace_Srch01_CndR cndR : up0()) {

				// ロットトレース入庫情報取得
				selLotTraceGr(cndR);

				// ロットトレース出庫情報取得
				selLotTraceGi(cndR);
			}
		}

		/**
		 * 承認・判定情報を取得する。
		 */
		protected void srchAprvJudg() {
			// 製造情報設定
			setMfgAct();
			// 検査情報設定
			setInspAct();
			// 工場出荷情報設定
			setPlntAprv();
			// 市場出荷情報設定
			setMrktJudg();

			// 定数名設定
			putNames();
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_MFG_APRV_STS_TYP.putNameNE(down2(), LotTrace_Srch01_RsltAprvJudgR.$mfg_aprv_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$mfg_aprv_sts_typ_nm, getUsrLocale());
			MSC_INSP_APRV_STS_TYP.putNameNE(down2(), LotTrace_Srch01_RsltAprvJudgR.$insp_aprv_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$insp_aprv_sts_typ_nm, getUsrLocale());
			MSC_INSP_JUDG_RSLT_TYP.putNameNE(down2(), LotTrace_Srch01_RsltAprvJudgR.$insp_judg_rslt_typ, LotTrace_Srch01_RsltAprvJudgR.$insp_judg_rslt_typ_nm, getUsrLocale());
			MSC_PLNT_APRV_STS_TYP.putNameNE(down2(), LotTrace_Srch01_RsltAprvJudgR.$plnt_aprv_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$plnt_aprv_sts_typ_nm, getUsrLocale());
			MSC_MRKT_JUDG_STS_TYP.putNameNE(down2(), LotTrace_Srch01_RsltAprvJudgR.$mrkt_judg_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$mrkt_judg_sts_typ_nm, getUsrLocale());
		}

		/**
		 * ロットトレース入庫情報を取得する。
		 * 
		 * @param cndR
		 */
		protected void selLotTraceGr(LotTrace_Srch01_CndR cndR) {
			MCList<LotTrace_Srch01_RsltGrR> rsltL = MCList.create(LotTrace_Srch01_RsltGrR.class);

			executeQuery(rsltL, MSBFL5200_MST_LOT_TRACE_GR_S01(), cndR);

			down0().addAll(rsltL);
		}

		/**
		 * ロットトレース出庫情報を取得する。
		 * 
		 * @param cndR
		 */
		protected void selLotTraceGi(LotTrace_Srch01_CndR cndR) {
			MCList<LotTrace_Srch01_RsltGiR> rsltL = MCList.create(LotTrace_Srch01_RsltGiR.class);

			executeQuery(rsltL, MSBFL5200_MST_LOT_TRACE_GI_S01(), cndR);

			down1().addAll(rsltL);
		}

		/**
		 * 製造実績情報を設定する。
		 */
		protected void setMfgAct() {
			MCList<MST_YIELD_ACT_R> yieldL =  MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t1 = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldL_bldr = MCQueryApiBuilder.create(t1);
			MST_MFG_ACT_R t2 = MST_MFG_ACT_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			yieldL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			yieldL_bldr.addSelect(m2.itm_nm);
			yieldL_bldr.addSelect(t2.mfg_aprv_sts_typ);
			yieldL_bldr.addSelect(t2.aprv_dt);
			yieldL_bldr.addSelect(decode(t1.yield_typ, value(MAC_YIELD_TYP.GOOD.value()),
					t1.base_unit_qty, value(0)).as("yield_base_unit_qty"));

			yieldL_bldr.addInnerJoin(t2, bracket(t1.mfg_act_no.eq(t2.mfg_act_no)));
			yieldL_bldr.addLeftOuterJoin(m1, bracket(t1.base_unit_cd.eq(m1.unit_cd)));
			yieldL_bldr.addLeftOuterJoin(m2,
					bracket(t1.itm_cd.eq(m2.itm_cd)
							.and(t1.itm_sub1.eq(m2.itm_sub1))
							.and(t1.itm_sub2.eq(m2.itm_sub2))
							.and(t1.itm_sub3.eq(m2.itm_sub3))));

			yieldL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
			yieldL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			yieldL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			yieldL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			yieldL_bldr.addWhereWithAnd(t1.lot_no.eq(bind("lot_no")));
			yieldL_bldr.addWhereWithAnd(t1.sublot_no.eq(bind("sublot_no")));
			yieldL_bldr.addWhereWithAnd(t2.mfg_aprv_sts_typ.isNotNull());

			dbSelect("MSBFL5200_MST_YIELD_ACT_S01", yieldL, yieldL_bldr, up0());

			MCList<LotTrace_Srch01_RsltAprvJudgR> aprvJudgL = MCList.create(LotTrace_Srch01_RsltAprvJudgR.class);
			for (MST_YIELD_ACT_R yieldR : yieldL) {
				LotTrace_Srch01_RsltAprvJudgR aprvJudgR = LotTrace_Srch01_RsltAprvJudgR.create();
				
				aprvJudgR.itm_cd(yieldR.itm_cd());
				aprvJudgR.itm_sub1(yieldR.itm_sub1());
				aprvJudgR.itm_sub2(yieldR.itm_sub2());
				aprvJudgR.itm_sub3(yieldR.itm_sub3());
				aprvJudgR.itm_nm(yieldR.getStringNE("ITM_NM"));
				aprvJudgR.lot_no(yieldR.lot_no());
				aprvJudgR.sublot_no(yieldR.sublot_no());
				aprvJudgR.mfg_aprv_sts_typ(yieldR.getStringNE("MFG_APRV_STS_TYP"));
				aprvJudgR.mfg_aprv_dt(yieldR.getDateNE("APRV_DT"));
				aprvJudgR.yield_base_unit_qty(yieldR.getNumberNE("YIELD_BASE_UNIT_QTY"));
				aprvJudgR.yield_base_unit_cd(yieldR.getStringNE("BASE_UNIT_CD"));
				aprvJudgR.yield_base_unit_nm(yieldR.getStringNE("BASE_UNIT_NM"));
				aprvJudgL.add(aprvJudgR);
			}

			if (!aprvJudgL.isEmpty()) {
				MCGroupByPolicy gp = new MCGroupByPolicy(LotTrace_Srch01_RsltAprvJudgR.$itm_cd, LotTrace_Srch01_RsltAprvJudgR.$itm_sub1, 
						LotTrace_Srch01_RsltAprvJudgR.$itm_sub2, LotTrace_Srch01_RsltAprvJudgR.$itm_sub3, LotTrace_Srch01_RsltAprvJudgR.$itm_nm, 
						LotTrace_Srch01_RsltAprvJudgR.$lot_no, LotTrace_Srch01_RsltAprvJudgR.$sublot_no, 
						LotTrace_Srch01_RsltAprvJudgR.$mfg_aprv_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$mfg_aprv_dt,
						LotTrace_Srch01_RsltAprvJudgR.$yield_base_unit_cd, LotTrace_Srch01_RsltAprvJudgR.$yield_base_unit_nm);
				gp.sum(LotTrace_Srch01_RsltAprvJudgR.$yield_base_unit_qty);
				
				down2().addAll(aprvJudgL.groupBy(gp));
			}
		}

		/**
		 * 検査実績情報を設定する。
		 */
		protected void setInspAct() {
			MCList<MST_INSP_INST_R> inspL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t1 = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder inspL_bldr = MCQueryApiBuilder.create(t1);
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			inspL_bldr.addSelect(t1.insp_aprv_sts_typ);
			inspL_bldr.addSelect(t2.judg_dt);
			inspL_bldr.addSelect(t2.good_qty);
			inspL_bldr.addSelect(t2.insp_judg_rslt_typ);
			inspL_bldr.addSelect(t2.base_unit_cd);
			inspL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			inspL_bldr.addSelect(nvl(t1.itm_nm, m2.itm_nm).as("itm_nm"));
			inspL_bldr.addInnerJoin(t2, bracket(t1.insp_no.eq(t2.insp_no)));
			inspL_bldr.addLeftOuterJoin(m1, bracket(t1.base_unit_cd.eq(m1.unit_cd)));
			inspL_bldr.addLeftOuterJoin(m2,
					bracket(t1.itm_cd.eq(m2.itm_cd)
							.and(t1.itm_sub1.eq(m2.itm_sub1))
							.and(t1.itm_sub2.eq(m2.itm_sub2))
							.and(t1.itm_sub3.eq(m2.itm_sub3))));

			inspL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
			inspL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			inspL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			inspL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			inspL_bldr.addWhereWithAnd(t1.lot_no.eq(bind("lot_no")));
			inspL_bldr.addWhereWithAnd(t1.sublot_no.eq(bind("sublot_no")));
			inspL_bldr.addWhereWithAnd(t1.insp_aprv_flg.eq(value(true)));

			dbSelect("MSBFL5200_MST_INSP_INST_S01", inspL, inspL_bldr, up0());

			for (MST_INSP_INST_R inspR : inspL) {
				LotTrace_Srch01_RsltAprvJudgR aprvJudgR = LotTrace_Srch01_RsltAprvJudgR.create();
				aprvJudgR.itm_cd(inspR.itm_cd());
				aprvJudgR.itm_sub1(inspR.itm_sub1());
				aprvJudgR.itm_sub2(inspR.itm_sub2());
				aprvJudgR.itm_sub3(inspR.itm_sub3());
				aprvJudgR.itm_nm(inspR.getStringNE("ITM_NM"));
				aprvJudgR.lot_no(inspR.lot_no());
				aprvJudgR.sublot_no(inspR.sublot_no());
				aprvJudgR.insp_aprv_sts_typ(inspR.insp_aprv_sts_typ());
				aprvJudgR.insp_judg_dt(inspR.getDateNE("JUDG_DT"));
				aprvJudgR.insp_good_qty(inspR.getNumberNE("GOOD_QTY"));
				aprvJudgR.insp_base_unit_cd(inspR.getStringNE("BASE_UNIT_CD"));
				aprvJudgR.insp_base_unit_nm(inspR.getStringNE("BASE_UNIT_NM"));
				aprvJudgR.insp_judg_rslt_typ(inspR.getStringNE("INSP_JUDG_RSLT_TYP"));
				down2().add(aprvJudgR);
			}
		}

		/**
		 * 工場出荷承認情報を設定する。
		 */
		protected void setPlntAprv() {
			MCList<MST_PLNT_APRV_R> plntL = MCList.create(MST_PLNT_APRV_R.class);
			MST_PLNT_APRV_R t1 = MST_PLNT_APRV_R.create("T");
			MCQueryApiBuilder plntL_bldr = MCQueryApiBuilder.create(t1);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_ITM_SITE_R m2 = MAM_ITM_SITE_R.create("M2");
			plntL_bldr.addSelect(m1.itm_nm);
			plntL_bldr.addSelect(m2.ntfy_nm);
			plntL_bldr.addLeftOuterJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			plntL_bldr.addLeftOuterJoin(m2,
					bracket(t1.itm_cd.eq(m2.itm_cd)
							.and(t1.itm_sub1.eq(m2.itm_sub1))
							.and(t1.itm_sub2.eq(m2.itm_sub2))
							.and(t1.itm_sub3.eq(m2.itm_sub3))
							.and(t1.site_cd.eq(m2.site_cd))));
			plntL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
			plntL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			plntL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			plntL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			plntL_bldr.addWhereWithAnd(t1.lot_no.eq(bind("lot_no")));
			plntL_bldr.addWhereWithAnd(t1.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBFL5200_MST_PLNT_APRV_S01", plntL, plntL_bldr, up0());

			MAM_UNIT_R m3 = MAM_UNIT_R.create("M1");
			MCList<MST_PLNT_APRV_D_R> plntDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder plntDL_bldr = MCQueryApiBuilder.create(t2);
			plntDL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			plntDL_bldr.addLeftOuterJoin(m3, bracket(t2.base_unit_cd.eq(m3.unit_cd)));
			if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
				plntDL_bldr.addOrderByDesc(t2.plnt_aprv_d_no);
			}
			plntDL_bldr.setWhere(t2.plnt_aprv_no.eq(bind("plnt_aprv_no")));
			dbSelect("MSBFL5200_MST_PLNT_APRV_D_S01", plntDL, plntDL_bldr, plntL);

			MCIndexKey idxkey = plntDL.createIndex(MST_PLNT_APRV_D_R.$plnt_aprv_no);
			MCList<LotTrace_Srch01_RsltAprvJudgR> aprvJudgL = MCList.create(LotTrace_Srch01_RsltAprvJudgR.class);
			for (MST_PLNT_APRV_R plntR : plntL) {
				MCList<MST_PLNT_APRV_D_R> subL = plntDL.subList(idxkey, plntR.plnt_aprv_no());
				LotTrace_Srch01_RsltAprvJudgR aprvJudgR = LotTrace_Srch01_RsltAprvJudgR.create();
				aprvJudgR.itm_cd(plntR.itm_cd());
				aprvJudgR.itm_sub1(plntR.itm_sub1());
				aprvJudgR.itm_sub2(plntR.itm_sub2());
				aprvJudgR.itm_sub3(plntR.itm_sub3());
				aprvJudgR.itm_nm(plntR.getStringNE("ITM_NM"));
				aprvJudgR.ntfy_nm(plntR.getStringNE("NTFY_NM"));
				aprvJudgR.lot_no(plntR.lot_no());
				aprvJudgR.sublot_no(plntR.sublot_no());
				aprvJudgR.plnt_aprv_sts_typ(plntR.plnt_aprv_sts_typ());
				aprvJudgR.plnt_aprv_dt(plntR.aprv_dt());
				if (!subL.isEmpty()) {
					if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
						aprvJudgR.plnt_base_unit_qty(subL.get(0).base_unit_qty());
					}
					else {
						aprvJudgR.plnt_base_unit_qty(subL.sum(MST_PLNT_APRV_D_R.$base_unit_qty));
					}
					aprvJudgR.plnt_base_unit_cd(subL.get(0).base_unit_cd());
					aprvJudgR.plnt_base_unit_nm(subL.get(0).getStringNE("BASE_UNIT_NM"));
				}
				aprvJudgL.add(aprvJudgR);
			}

			if (!aprvJudgL.isEmpty()) {
				MCGroupByPolicy gp = new MCGroupByPolicy(LotTrace_Srch01_RsltAprvJudgR.$itm_cd, LotTrace_Srch01_RsltAprvJudgR.$itm_sub1, 
						LotTrace_Srch01_RsltAprvJudgR.$itm_sub2, LotTrace_Srch01_RsltAprvJudgR.$itm_sub3, LotTrace_Srch01_RsltAprvJudgR.$itm_nm, 
						LotTrace_Srch01_RsltAprvJudgR.$ntfy_nm, LotTrace_Srch01_RsltAprvJudgR.$lot_no, LotTrace_Srch01_RsltAprvJudgR.$sublot_no, 
						LotTrace_Srch01_RsltAprvJudgR.$plnt_aprv_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$plnt_aprv_dt,
						LotTrace_Srch01_RsltAprvJudgR.$plnt_base_unit_cd, LotTrace_Srch01_RsltAprvJudgR.$plnt_base_unit_nm);
				gp.sum(LotTrace_Srch01_RsltAprvJudgR.$plnt_base_unit_qty);
				
				down2().addAll(aprvJudgL.groupBy(gp));
			}
		}

		/**
		 * 市場出荷判定情報を設定する。
		 */
		protected void setMrktJudg() {
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_ITM_SITE_R m2 = MAM_ITM_SITE_R.create("M2");
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MCList<MST_MRKT_JUDG_R> mrktL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t1 = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder mrktL_bldr = MCQueryApiBuilder.create(t1);
			mrktL_bldr.addSelect(m1.itm_nm);
			mrktL_bldr.addSelect(m2.ntfy_nm);
			mrktL_bldr.addSelect("BASE_UNIT_NM", m3.unit_nm);
			mrktL_bldr.addLeftOuterJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			mrktL_bldr.addLeftOuterJoin(m2,
					bracket(t1.itm_cd.eq(m2.itm_cd)
							.and(t1.itm_sub1.eq(m2.itm_sub1))
							.and(t1.itm_sub2.eq(m2.itm_sub2))
							.and(t1.itm_sub3.eq(m2.itm_sub3))
							.and(t1.site_cd.eq(m2.site_cd))));
			mrktL_bldr.addLeftOuterJoin(m3,
					bracket(t1.base_unit_cd.eq(m3.unit_cd)));
			mrktL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
			mrktL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			mrktL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			mrktL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			mrktL_bldr.addWhereWithAnd(t1.lot_no.eq(bind("lot_no")));
			dbSelect("MSBFL5200_MST_MRKT_JUDG_S01", mrktL, mrktL_bldr, up0());

			MCList<LotTrace_Srch01_RsltAprvJudgR> aprvJudgL = MCList.create(LotTrace_Srch01_RsltAprvJudgR.class);
			for (MST_MRKT_JUDG_R mrktR : mrktL) {
				LotTrace_Srch01_RsltAprvJudgR aprvJudgR = LotTrace_Srch01_RsltAprvJudgR.create();
				aprvJudgR.mrkt_judg_sts_typ(mrktR.mrkt_judg_sts_typ());
				aprvJudgR.mrkt_judg_dt(mrktR.judg_dt());
				aprvJudgR.itm_cd(mrktR.itm_cd());
				aprvJudgR.itm_sub1(mrktR.itm_sub1());
				aprvJudgR.itm_sub2(mrktR.itm_sub2());
				aprvJudgR.itm_sub3(mrktR.itm_sub3());
				aprvJudgR.itm_nm(mrktR.getStringNE("ITM_NM"));
				aprvJudgR.ntfy_nm(mrktR.getStringNE("NTFY_NM"));
				aprvJudgR.lot_no(mrktR.lot_no());
				aprvJudgR.mrkt_base_unit_qty(mrktR.base_unit_qty());
				aprvJudgR.mrkt_base_unit_cd(mrktR.base_unit_cd());
				aprvJudgR.mrkt_base_unit_nm(mrktR.getStringNE("BASE_UNIT_NM"));
				aprvJudgL.add(aprvJudgR);
			}

			if (!aprvJudgL.isEmpty()) {
				MCGroupByPolicy gp = new MCGroupByPolicy(LotTrace_Srch01_RsltAprvJudgR.$itm_cd, LotTrace_Srch01_RsltAprvJudgR.$itm_sub1, 
						LotTrace_Srch01_RsltAprvJudgR.$itm_sub2, LotTrace_Srch01_RsltAprvJudgR.$itm_sub3, LotTrace_Srch01_RsltAprvJudgR.$itm_nm, 
						LotTrace_Srch01_RsltAprvJudgR.$ntfy_nm, LotTrace_Srch01_RsltAprvJudgR.$lot_no, 
						LotTrace_Srch01_RsltAprvJudgR.$mrkt_judg_sts_typ, LotTrace_Srch01_RsltAprvJudgR.$mrkt_judg_dt,
						LotTrace_Srch01_RsltAprvJudgR.$mrkt_base_unit_cd, LotTrace_Srch01_RsltAprvJudgR.$mrkt_base_unit_nm);
				gp.sum(LotTrace_Srch01_RsltAprvJudgR.$mrkt_base_unit_qty);
				
				down2().addAll(aprvJudgL.groupBy(gp));
			}
		}
	}
	/**
	 * LotTrace_Srch02オペレーション.<p>
	 *
	 * ロットトレース（原因調査）を行う。<br>
	 */
	public class LotTrace_Srch02 extends MSBFL_LotTraceService_MC_A.LotTrace_Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// ロットトレース（原因調査）情報取得
			srchLotTrace();
		}

		/**
		 * ロットトレース（原因調査）情報を取得する。
		 */
		protected void srchLotTrace() {

			for (LotTrace_Srch02_CndR upR : up0()) {
				MCList<LotTrace_Srch02_RsltR> lotTraceL = MCList.create(LotTrace_Srch02_RsltR.class);

				// ロットトレース正展開情報作成
				execLotTraceProc(upR);

				// ロットトレース正展開情報取得
				selLotTrace(upR, lotTraceL);

				// 展開番号設定
				setExtno(lotTraceL);

				// ソート順設定
				setSort(lotTraceL);

				// 継承情報設定
				setHrrchyVal(lotTraceL);

				if (!isNull(upR.peg_no())) {
					lotTraceL.setNumber(LotTrace_Srch02_RsltR.$peg_no, upR.peg_no());
				}
				down0().addAll(lotTraceL);
			}
		}

		/**
		 * ロットトレース正展開情報を作成する。
		 * 
		 * @param upR
		 */
		protected void execLotTraceProc(LotTrace_Srch02_CndR upR) {
			MCRow inbind = MCRow.create();
			inbind.addNumberColumn("I_HRRCHY", upR.hrrchy());
			inbind.addStringColumn("I_ITM_CD", upR.itm_cd());
			inbind.addStringColumn("I_ITM_SUB1", upR.itm_sub1());
			inbind.addStringColumn("I_ITM_SUB2", upR.itm_sub2());
			inbind.addStringColumn("I_ITM_SUB3", upR.itm_sub3());
			inbind.addStringColumn("I_LOT_NO", upR.lot_no());
			inbind.addStringColumn("I_SUBLOT_NO", upR.sublot_no());
			inbind.addStringColumn("I_SNO1", upR.sno1());
			inbind.addStringColumn("I_SNO2", upR.sno2());
			inbind.addStringColumn("I_SNO3", upR.sno3());
			inbind.addStringColumn("I_SNO4", upR.sno4());

			if(upR.not_mng_flg()){
				inbind.addNumberColumn("I_LOT_NOT_MNG", MCNumber.ONE);
			}else{
				inbind.addNumberColumn("I_LOT_NOT_MNG", MCNumber.ZERO);
			}

			if(upR.dupl_abl_flg()){
				inbind.addNumberColumn("I_LOT_DUPL_ABL", MCNumber.ONE);
			}else{
				inbind.addNumberColumn("I_LOT_DUPL_ABL", MCNumber.ZERO);
			}

			// ロットトレース正展開情報作成プロシージャの実行
			String procId = "MSPA_LOT_TRC$P_INS_LOT_TRC_HRRCHY";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, 
					":I_HRRCHY,"+
					":I_ITM_CD," +
					":I_ITM_SUB1," +
					":I_ITM_SUB2," +
					":I_ITM_SUB3," +
					":I_LOT_NO," +
					":I_SUBLOT_NO," +
					":I_SNO1," +
					":I_SNO2," +
					":I_SNO3," +
					":I_SNO4," +
					":I_LOT_NOT_MNG," +
					":I_LOT_DUPL_ABL");
		}

		/**
		 * ロットトレース逆展開情報を取得する。
		 * 
		 * @param upR
		 * @param lotTraceL
		 */
		protected void selLotTrace(LotTrace_Srch02_CndR upR, MCList<LotTrace_Srch02_RsltR> lotTraceL) {
			executeQuery(lotTraceL, MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_S01(), upR);
		}
	}

	/**
	 * 展開番号を設定する。
	 * 
	 * @param downL
	 */
	protected void setExtno(MCList<LotTrace_Srch02_RsltR> downL) {
		HashMap<Integer, Integer> ext_map = new HashMap<Integer, Integer>();
		
		int num = 1;

		// extno、par_extnoの設定
		int currLevel = 0;
		for (LotTrace_Srch02_RsltR r : downL) {
			currLevel = r.hrrchy().intValue();
			
			//ひとつ上のLEVELのext_noをpar_extnoに設定
			Integer extno = ext_map.get(currLevel - 1);
			// トップ階層でない場合
			if (extno != null) {
				r.par_extno(extno);
			}
			r.extno(num);
			ext_map.put(currLevel, num);
			num = num + 1;
		}
	}

	/**
	 * ソート順を設定する。
	 * 
	 * @param downL
	 */
	protected void setSort(MCList<LotTrace_Srch02_RsltR> downL) {
		downL.sort(SortType.DESC, LotTrace_Srch02_RsltR.$extno);
	}

	/**
	 * 継承情報を設定する。
	 * 
	 * @param downL
	 */
	protected void setHrrchyVal(MCList<LotTrace_Srch02_RsltR> downL){

		for (LotTrace_Srch02_RsltR r : downL){

			// 継承在庫検査ＦＬＧの設定
			if(r.stk_insp_flg() || r.hrchy_stk_insp_flg()){
				for(LotTrace_Srch02_RsltR r2 : downL){
					if(isSame(r.par_extno(),r2.extno())){
						r2.hrchy_stk_insp_flg(true);
					}
				}
			}

			// 継承良品以外ＦＬＧの設定
			if (r.not_quality_good_flg() || r.hrchy_not_quality_good_flg()) {
				for (LotTrace_Srch02_RsltR r2 : downL){
					if(isSame(r.par_extno(),r2.extno())){
						r2.hrchy_not_quality_good_flg(true);
					}
				}
			}

			// 継承製造未承認ＦＬＧの設定
			if(r.not_mfg_aprv_acpt_flg() || r.hrchy_not_mfg_aprv_acpt_flg()){
				for(LotTrace_Srch02_RsltR r2 : downL){
					if(isSame(r.par_extno(),r2.extno())){
						r2.hrchy_not_mfg_aprv_acpt_flg(true);
					}
				}
			}
		}
	}
	/**
	 * LotTrace_Srch03オペレーション.<p>
	 *
	 * ロットトレース（影響調査）を行う。<br>
	 */
	public class LotTrace_Srch03 extends MSBFL_LotTraceService_MC_A.LotTrace_Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// ロットトレース（影響調査）情報取得
			srchLotTrace();
		}

		/**
		 * ロットトレース（影響調査）情報を取得する。
		 */
		protected void srchLotTrace() {

			for (LotTrace_Srch03_CndR upR : up0()) {
				MCList<LotTrace_Srch03_RsltR> lotTraceL = MCList.create(LotTrace_Srch03_RsltR.class);

				// ロットトレース逆展開情報作成
				execLotTraceProc(upR);

				// ロットトレース逆展開情報取得
				selLotTrace(upR, lotTraceL);

				// 展開番号設定
				setExtno(lotTraceL);

				if (upR.bottom_layer_only_flg()) {
					getBottomLayer(lotTraceL);
				}

				// ソート順設定
				setSort(lotTraceL);

				down0().addAll(lotTraceL);
			}
		}

		/**
		 * ロットトレース逆展開情報を作成する。
		 * 
		 * @param upR
		 */
		protected void execLotTraceProc(LotTrace_Srch03_CndR upR) {
			MCRow inbind = MCRow.create();
			inbind.addNumberColumn("I_HRRCHY", upR.hrrchy());
			inbind.addStringColumn("I_ITM_CD", upR.itm_cd());
			inbind.addStringColumn("I_ITM_SUB1", upR.itm_sub1());
			inbind.addStringColumn("I_ITM_SUB2", upR.itm_sub2());
			inbind.addStringColumn("I_ITM_SUB3", upR.itm_sub3());
			inbind.addStringColumn("I_LOT_NO", upR.lot_no());
			inbind.addStringColumn("I_SUBLOT_NO", upR.sublot_no());
			inbind.addStringColumn("I_SNO1", upR.sno1());
			inbind.addStringColumn("I_SNO2", upR.sno2());
			inbind.addStringColumn("I_SNO3", upR.sno3());
			inbind.addStringColumn("I_SNO4", upR.sno4());
			inbind.addStringColumn("I_BP_LOT_NO", upR.bp_lot_no());
			inbind.addStringColumn("I_VER_NO", upR.ver_no());

			if(upR.not_mng_flg()){
				inbind.addNumberColumn("I_LOT_NOT_MNG", MCNumber.ONE);
			}else{
				inbind.addNumberColumn("I_LOT_NOT_MNG", MCNumber.ZERO);
			}
			if(upR.dupl_abl_flg()){
				inbind.addNumberColumn("I_LOT_DUPL_ABL", MCNumber.ONE);
			}else{
				inbind.addNumberColumn("I_LOT_DUPL_ABL", MCNumber.ZERO);
			}

			// ロットトレース逆展開情報作成プロシージャの実行
			String procId = "MSPA_LOT_TRC$P_INS_LOT_TRC_HRRCHY_BKWD";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, 
					":I_HRRCHY," +
					":I_ITM_CD," +
					":I_ITM_SUB1," +
					":I_ITM_SUB2," +
					":I_ITM_SUB3," +
					":I_LOT_NO," +
					":I_SUBLOT_NO," +
					":I_SNO1," +
					":I_SNO2," +
					":I_SNO3," +
					":I_SNO4," +
					":I_BP_LOT_NO," +
					":I_VER_NO," +
					":I_LOT_NOT_MNG," +
					":I_LOT_DUPL_ABL");
		}

		/**
		 * ロットトレース逆展開情報を取得する。
		 * 
		 * @param upR
		 * @param lotTraceL
		 */
		protected void selLotTrace(LotTrace_Srch03_CndR upR, MCList<LotTrace_Srch03_RsltR> lotTraceL) {
			executeQuery(lotTraceL, MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_S02(), upR);
		}

		/**
		 * 展開番号を設定する。
		 * 
		 * @param downL
		 */
		protected void setExtno(MCList<LotTrace_Srch03_RsltR> downL) {
			HashMap<Integer, Integer> ext_map = new HashMap<Integer, Integer>();
			
			int num = 1;

			// extno、par_extnoの設定
			int currLevel = 0;
			for (LotTrace_Srch03_RsltR r : downL) {
				currLevel = r.hrrchy().intValue();
				
				//ひとつ上のLEVELのext_noをpar_extnoに設定
				Integer extno = ext_map.get(currLevel - 1);
				// トップ階層でない場合
				if (extno != null) {
					r.par_extno(extno);
				}
				r.extno(num);
				ext_map.put(currLevel, num);
				num = num + 1;
			}
		}

		/**
		 * ソート順を設定する。
		 * 
		 * @param downL
		 */
		protected void setSort(MCList<LotTrace_Srch03_RsltR> downL) {
			downL.sort(SortType.DESC, LotTrace_Srch03_RsltR.$extno);
		}
		
		protected void getBottomLayer(MCList<LotTrace_Srch03_RsltR> downL) {
			MCList<LotTrace_Srch03_RsltR> removeLayerL = MCList.create(LotTrace_Srch03_RsltR.class);
			MCIndexKey chkBottomIdx = downL.createIndex(LotTrace_Srch03_RsltR.$par_extno);
			
			for (LotTrace_Srch03_RsltR r : downL) {
				if (!isNull(r.par_extno()) && !isNull(downL.subList(chkBottomIdx, r.extno()))) {
					removeLayerL.add(r);
				}
			}
			downL.removeAll(removeLayerL);

			downL.sort(LotTrace_Srch03_RsltR.$extno);
			MCNumber num = MCNumber.ZERO;
			LotTrace_Srch03_RsltR topLayerR = downL.get(0);
			for (LotTrace_Srch03_RsltR r : downL) {
				r.extno(topLayerR.extno().add(num));
				r.setNumberNE("sort_no", topLayerR.getNumberNE("sort_no").add(num));
				if (isNull(r.par_extno())) {
					topLayerR = r;
					num = MCNumber.ONE;
				}
				else {
					r.hrrchy(MCNumber.ONE);
					r.par_extno(topLayerR.extno());
					num = num.add(MCNumber.ONE);
				}
			}
		}
	}
	/**
	 * LotTrace_Upd01オペレーション.<p>
	 *
	 * ロットトレース情報を追加・更新・削除する。<br>
	 */
	public class LotTrace_Upd01 extends MSBFL_LotTraceService_MC_A.LotTrace_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// ロットトレース入庫情報更新
			updLotTraceGr();

			// ロットトレース出庫情報更新
			updLotTraceGi();
		}

		/**
		 * ロットトレース入庫情報を更新する。
		 */

		protected void updLotTraceGr() {
			MCList<MST_LOT_TRACE_GR_R> insL = MCList.create(MST_LOT_TRACE_GR_R.class);
			MCList<MST_LOT_TRACE_GR_R> updL = MCList.create(MST_LOT_TRACE_GR_R.class);
			MCList<MST_LOT_TRACE_GR_R> delL = MCList.create(MST_LOT_TRACE_GR_R.class);
			
			for (LotTrace_Upd01_DtlGrR upR : up0()) {
				if (MAC_TRD_PTN_TYP.isSLS_RTN(upR.trd_ptn_typ())
						&& MSC_IO_ACT_TYP.isACXFR_GR(upR.io_act_typ())) {
					// 売上返品で発生する他勘定入庫はロットトレース作成の対象外とする（入荷時のロットトレースと重複するため）
					continue;
				}
				
				MST_LOT_TRACE_GR_R row = MST_LOT_TRACE_GR_R.create();
				copy(row, upR, createMap_MST_LOT_TRACE_GR_R_LotTrace_Upd01_DtlGrR());

				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					if (!MSC_SCHD_ACT_TYP.isSCHD(upR.schd_act_typ()) 
							|| !isNullOr(upR.lot_no(), upR.sublot_no())) {
						if (MSC_IO_SCHD_TYP.isPURC_GR(upR.io_schd_typ())
								|| MSC_IO_SCHD_TYP.isPURC_GR_PROV(upR.io_schd_typ())) {
							if (MSC_IO_SCHD_STS_TYP.isARR(upR.io_schd_sts_typ())
									|| MSC_IO_SCHD_STS_TYP.isINSP(upR.io_schd_sts_typ())) {
								continue;
							}
						}
						compMfgActNo(upR, row);
						insL.add(row);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					// 予定実績区分が予定、かつ、ロットＮＯとサブロットＮＯの少なくとも一方がNULLである場合、
					// データ更新区分に関わらずロットトレース入庫情報を削除する
					if (MSC_SCHD_ACT_TYP.isSCHD(upR.schd_act_typ()) 
							&& isNullOr(upR.lot_no(), upR.sublot_no())) {
						delL.add(row);
					}
					else {
						compMfgActNo(upR, row);
						updL.add(row);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					delL.add(row);
				}
			}

			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_LOT_TRACE_GR_R.create("T"));
				dbInsert("MSBFL5200_MST_LOT_TRACE_GR_I01", insL, insL_bldr);
			}
			
			if (!updL.isEmpty()) {
				MCList<MST_LOT_TRACE_GR_R> updSlipL = updL
						.subList(r -> !isNull(r.slip_no()) && isNull(r.slip_schd_no()));
				MCList<MST_LOT_TRACE_GR_R> updSlipSchdL = updL
						.subList(r -> isNull(r.slip_no()) && !isNull(r.slip_schd_no()));

				// 伝票ＮＯで更新
				if (!updSlipL.isEmpty()) {
					MST_LOT_TRACE_GR_R t1 = MST_LOT_TRACE_GR_R.create("T");
					MCQueryApiBuilder updSlipL_bldr = MCQueryApiBuilder.create(t1);
					editLotTraceGrLSetStmt(updSlipL, t1, updSlipL_bldr);
					updSlipL_bldr.setWhere(t1.slip_no.eq(bindEx("slip_no")));
					dbUpdate("MSBFL5200_MST_LOT_TRACE_GR_U01", updSlipL, updSlipL_bldr);
				}

				// 受払予定伝票ＮＯで更新
				if (!updSlipSchdL.isEmpty()) {
					MST_LOT_TRACE_GR_R t2 = MST_LOT_TRACE_GR_R.create("T");
					MCQueryApiBuilder updSlipSchdL_bldr = MCQueryApiBuilder.create(t2);
					editLotTraceGrLSetStmt(updSlipSchdL, t2, updSlipSchdL_bldr);
					updSlipSchdL_bldr.setWhere(t2.slip_schd_no.eq(bindEx("slip_schd_no")));
					dbUpdate("MSBFL5200_MST_LOT_TRACE_GR_U02", updSlipSchdL, updSlipSchdL_bldr);
				}
			}

			if (!delL.isEmpty()) {
				MCList<MST_LOT_TRACE_GR_R> delSlipL = delL
						.subList(r -> !isNull(r.slip_no()) && isNull(r.slip_schd_no()));
				MCList<MST_LOT_TRACE_GR_R> delSlipSchdL = delL
						.subList(r -> isNull(r.slip_no()) && !isNull(r.slip_schd_no()));

				MST_LOT_TRACE_GR_R t3 = MST_LOT_TRACE_GR_R.create("T");
				// 伝票ＮＯで削除
				if (!delSlipL.isEmpty()) {
					execDbDelete("MSBFL5200_MST_LOT_TRACE_GR_D01",
							t3, t3.slip_no.eq(bind("slip_no")), delSlipL);
				}
				
				// 受払予定伝票ＮＯで削除
				if (!delSlipSchdL.isEmpty()) {
					execDbDelete("MSBFL5200_MST_LOT_TRACE_GR_D02",
							t3, t3.slip_schd_no.eq(bind("slip_schd_no")), delSlipSchdL);
			}
			}
		}

		/**
		 * 外注入荷実績の場合に製造指図ＮＯから製造実績ＮＯを補完する。
		 * @param upR
		 * @param row
		 */
		protected void compMfgActNo(LotTrace_Upd01_DtlGrR upR, MST_LOT_TRACE_GR_R row) {
			if (MSC_SCHD_ACT_TYP.isACT(upR.schd_act_typ())
					&& MSC_IO_ACT_TYP.isARR(upR.io_act_typ())
					&& !isNull(upR.mfg_inst_no())) {
				MCList<MST_MFG_ACT_R> maL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(t);
				maL_bldr.setSelect(t.mfg_act_no);
				maL_bldr.addSelect(t.mfg_inst_no);
				maL_bldr.setWhere(t.mfg_inst_no.eq(bind("1")), upR.mfg_inst_no());
				dbSelect("MSBFL5200_MST_MFG_ACT_S01", maL, maL_bldr);
				
				if (isNull(row.mfg_act_no()) && !maL.isEmpty()) {
					row.mfg_act_no(maL.get(0).mfg_act_no());
					row.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
				}
			}
		}

		/**
		 * ロットトレース入庫情報テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editLotTraceGrLSetStmt(MCList<MST_LOT_TRACE_GR_R> updL, MST_LOT_TRACE_GR_R t, MCQueryApiBuilder updL_bldr) {

			updL_bldr.setSet(t.itm_mfg_inst_no);
			updL_bldr.addSet(t.mfg_act_no);
			updL_bldr.addSet(t.stk_xfr_act_no);
			updL_bldr.addSet(t.base_unit_qty);
			updL_bldr.addSet(t.base_unit_cd);
			updL_bldr.addSet(t.mfg_loc_cd);
			updL_bldr.addSet(t.strg_loc_cd);
			updL_bldr.addSet(t.schd_dt);
			updL_bldr.addSet(t.act_dt);
			updL_bldr.addSet(t.trd_ptn_typ);
			updL_bldr.addSet(t.io_act_typ);
			updL_bldr.addSet(t.schd_act_typ);
			updL_bldr.addSet(t.mfg_inst_unit_typ);
			// 主キー項目も更新対象とする
			updL_bldr.addSet(t.itm_cd);
			updL_bldr.addSet(t.itm_sub1);
			updL_bldr.addSet(t.itm_sub2);
			updL_bldr.addSet(t.itm_sub3);
			updL_bldr.addSet(t.lot_no);
			updL_bldr.addSet(t.sublot_no);
			updL_bldr.addSet(t.sno1);
			updL_bldr.addSet(t.sno2);
			updL_bldr.addSet(t.sno3);
			updL_bldr.addSet(t.sno4);
		}

		/**
		 * ロットトレース出庫情報を更新する。
		 */
		protected void updLotTraceGi() {
			MCList<MST_LOT_TRACE_GI_R> insL = MCList.create(MST_LOT_TRACE_GI_R.class);
			MCList<MST_LOT_TRACE_GI_R> updL = MCList.create(MST_LOT_TRACE_GI_R.class);
			MCList<MST_LOT_TRACE_GI_R> delL = MCList.create(MST_LOT_TRACE_GI_R.class);

			for (LotTrace_Upd01_DtlGiR upR : up1()) {
				if (MAC_TRD_PTN_TYP.isSLS(upR.trd_ptn_typ())
						&& MSC_IO_ACT_TYP.isACXFR_GI(upR.io_act_typ())) {
					// 売上で発生する他勘定出庫はロットトレース作成の対象外とする（出荷時のロットトレースと重複するため）
					continue;
				}
				MST_LOT_TRACE_GI_R row = MST_LOT_TRACE_GI_R.create();
				copy(row, upR, createMap_MST_LOT_TRACE_GI_R_LotTrace_Upd01_DtlGiR());

				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					if (!MSC_SCHD_ACT_TYP.isSCHD(upR.schd_act_typ()) 
							|| !isNullOr(upR.lot_no(), upR.sublot_no())) {
						if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(upR.io_act_typ())) {
							row.itm_mfg_inst_no(null);
							row.mfg_act_no(null);
						}
						insL.add(row);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					// 予定実績区分が予定、かつ、ロットＮＯとサブロットＮＯの少なくとも一方がNULLである場合、
					// データ更新区分に関わらずロットトレース出庫情報を削除する
					if (MSC_SCHD_ACT_TYP.isSCHD(upR.schd_act_typ()) 
							&& isNullOr(upR.lot_no(), upR.sublot_no())) {
						delL.add(row);
					}
					else {
						if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(upR.io_act_typ())) {
							row.itm_mfg_inst_no(null);
							row.mfg_act_no(null);
						}
						updL.add(row);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					delL.add(row);
				}
			}

			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_LOT_TRACE_GI_R.create("T"));
				dbInsert("MSBFL5200_MST_LOT_TRACE_GI_I01", insL, insL_bldr);
			}
			
			if (!updL.isEmpty()) {
				MCList<MST_LOT_TRACE_GI_R> updSlipL = updL
						.subList(r -> !isNull(r.slip_no()) && isNull(r.slip_schd_no()));
				MCList<MST_LOT_TRACE_GI_R> updSlipSchdL = updL
						.subList(r -> isNull(r.slip_no()) && !isNull(r.slip_schd_no()));

				// 伝票ＮＯで更新
				if (!updSlipL.isEmpty()) {
					MST_LOT_TRACE_GI_R t1 = MST_LOT_TRACE_GI_R.create("T");
					MCQueryApiBuilder updSlipL_bldr = MCQueryApiBuilder.create(t1);
					editLotTraceGiLSetStmt(updSlipL, t1, updSlipL_bldr);
					updSlipL_bldr.setWhere(t1.slip_no.eq(bindEx("slip_no")));
					dbUpdate("MSBFL5200_MST_LOT_TRACE_GI_U01", updSlipL, updSlipL_bldr);
				}

				// 受払予定伝票ＮＯで更新
				if (!updSlipSchdL.isEmpty()) {
					MST_LOT_TRACE_GI_R t2 = MST_LOT_TRACE_GI_R.create("T");
					MCQueryApiBuilder updSlipSchdL_bldr = MCQueryApiBuilder.create(t2);
					editLotTraceGiLSetStmt(updSlipSchdL, t2, updSlipSchdL_bldr);
					updSlipSchdL_bldr.setWhere(t2.slip_schd_no.eq(bindEx("slip_schd_no")));
					dbUpdate("MSBFL5200_MST_LOT_TRACE_GI_U02", updSlipSchdL, updSlipSchdL_bldr);
			}
			}

			if (!delL.isEmpty()) {
				MCList<MST_LOT_TRACE_GI_R> delSlipL = delL
						.subList(r -> !isNull(r.slip_no()) && isNull(r.slip_schd_no()));
				MCList<MST_LOT_TRACE_GI_R> delSlipSchdL = delL
						.subList(r -> isNull(r.slip_no()) && !isNull(r.slip_schd_no()));

				MST_LOT_TRACE_GI_R t3 = MST_LOT_TRACE_GI_R.create("T");
				// 伝票ＮＯで削除
				if (!delSlipL.isEmpty()) {
					execDbDelete("MSBFL5200_MST_LOT_TRACE_GI_D01",
							t3, t3.slip_no.eq(bind("slip_no")), delSlipL);
				}
				
				// 受払予定伝票ＮＯで削除
				if (!delSlipSchdL.isEmpty()) {
					execDbDelete("MSBFL5200_MST_LOT_TRACE_GI_D02",
							t3, t3.slip_schd_no.eq(bind("slip_schd_no")), delSlipSchdL);
				}
			}
		}

		/**
		 * ロットトレース出庫情報テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editLotTraceGiLSetStmt(MCList<MST_LOT_TRACE_GI_R> updL, MST_LOT_TRACE_GI_R t, MCQueryApiBuilder updL_bldr) {

			updL_bldr.setSet(t.itm_mfg_inst_no);
			updL_bldr.addSet(t.mfg_act_no);
			updL_bldr.addSet(t.stk_xfr_act_no);
			updL_bldr.addSet(t.base_unit_qty);
			updL_bldr.addSet(t.base_unit_cd);
			updL_bldr.addSet(t.dlv_cd);
			updL_bldr.addSet(t.tdlv_cd);
			updL_bldr.addSet(t.loc_cd);
			updL_bldr.addSet(t.schd_dt);
			updL_bldr.addSet(t.act_dt);
			updL_bldr.addSet(t.trd_ptn_typ);
			updL_bldr.addSet(t.io_act_typ);
			updL_bldr.addSet(t.schd_act_typ);
			updL_bldr.addSet(t.mfg_inst_unit_typ);
			// 主キー項目も更新対象とする
			updL_bldr.addSet(t.itm_cd);
			updL_bldr.addSet(t.itm_sub1);
			updL_bldr.addSet(t.itm_sub2);
			updL_bldr.addSet(t.itm_sub3);
			updL_bldr.addSet(t.lot_no);
			updL_bldr.addSet(t.sublot_no);
			updL_bldr.addSet(t.sno1);
			updL_bldr.addSet(t.sno2);
			updL_bldr.addSet(t.sno3);
			updL_bldr.addSet(t.sno4);
		}
	}

	// mapping
	protected Map_LotTrace_Srch02_CndR_LotTrace_Chk01_RsltR<LotTrace_Srch02_CndR,LotTrace_Chk01_RsltR> createMap_LotTrace_Srch02_CndR_LotTrace_Chk01_RsltR() {
		return new Map_LotTrace_Srch02_CndR_LotTrace_Chk01_RsltR<LotTrace_Srch02_CndR, LotTrace_Chk01_RsltR>();
	}

	public class Map_LotTrace_Srch02_CndR_LotTrace_Chk01_RsltR<D extends LotTrace_Srch02_CndR, S extends LotTrace_Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(LotTrace_Srch02_CndR.$peg_no, LotTrace_Chk01_RsltR.$peg_no);
			addColumnPathMap(LotTrace_Srch02_CndR.$itm_cd, LotTrace_Chk01_RsltR.$itm_cd);
			addColumnPathMap(LotTrace_Srch02_CndR.$itm_sub1, LotTrace_Chk01_RsltR.$itm_sub1);
			addColumnPathMap(LotTrace_Srch02_CndR.$itm_sub2, LotTrace_Chk01_RsltR.$itm_sub2);
			addColumnPathMap(LotTrace_Srch02_CndR.$itm_sub3, LotTrace_Chk01_RsltR.$itm_sub3);
			addColumnPathMap(LotTrace_Srch02_CndR.$lot_no, LotTrace_Chk01_RsltR.$lot_no);
			addColumnPathMap(LotTrace_Srch02_CndR.$sublot_no, LotTrace_Chk01_RsltR.$sublot_no);
			addColumnPathMap(LotTrace_Srch02_CndR.$sno1, LotTrace_Chk01_RsltR.$sno1);
			addColumnPathMap(LotTrace_Srch02_CndR.$sno2, LotTrace_Chk01_RsltR.$sno2);
			addColumnPathMap(LotTrace_Srch02_CndR.$sno3, LotTrace_Chk01_RsltR.$sno3);
			addColumnPathMap(LotTrace_Srch02_CndR.$sno4, LotTrace_Chk01_RsltR.$sno4);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dupl_abl_flg(true);
		}
	}

	protected Map_MST_LOT_TRACE_GR_R_LotTrace_Upd01_DtlGrR<MST_LOT_TRACE_GR_R,LotTrace_Upd01_DtlGrR> createMap_MST_LOT_TRACE_GR_R_LotTrace_Upd01_DtlGrR() {
		return new Map_MST_LOT_TRACE_GR_R_LotTrace_Upd01_DtlGrR<MST_LOT_TRACE_GR_R, LotTrace_Upd01_DtlGrR>();
	}

	public class Map_MST_LOT_TRACE_GR_R_LotTrace_Upd01_DtlGrR<D extends MST_LOT_TRACE_GR_R, S extends LotTrace_Upd01_DtlGrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_LOT_TRACE_GR_R.$itm_cd, LotTrace_Upd01_DtlGrR.$itm_cd);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$itm_sub1, LotTrace_Upd01_DtlGrR.$itm_sub1);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$itm_sub2, LotTrace_Upd01_DtlGrR.$itm_sub2);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$itm_sub3, LotTrace_Upd01_DtlGrR.$itm_sub3);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$lot_no, LotTrace_Upd01_DtlGrR.$lot_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sublot_no, LotTrace_Upd01_DtlGrR.$sublot_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sno1, LotTrace_Upd01_DtlGrR.$sno1);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sno2, LotTrace_Upd01_DtlGrR.$sno2);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sno3, LotTrace_Upd01_DtlGrR.$sno3);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sno4, LotTrace_Upd01_DtlGrR.$sno4);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$slip_no, LotTrace_Upd01_DtlGrR.$slip_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$slip_schd_no, LotTrace_Upd01_DtlGrR.$slip_schd_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$itm_mfg_inst_no, LotTrace_Upd01_DtlGrR.$itm_mfg_inst_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$mfg_act_no, LotTrace_Upd01_DtlGrR.$mfg_act_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$stk_xfr_act_no, LotTrace_Upd01_DtlGrR.$stk_xfr_act_no);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$base_unit_qty, LotTrace_Upd01_DtlGrR.$base_gr_qty);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$base_unit_cd, LotTrace_Upd01_DtlGrR.$base_unit_cd);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$sppl_cd, LotTrace_Upd01_DtlGrR.$sppl_cd);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$mfg_loc_cd, LotTrace_Upd01_DtlGrR.$mfg_loc_cd);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$strg_loc_cd, LotTrace_Upd01_DtlGrR.$strg_loc_cd);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$schd_dt, LotTrace_Upd01_DtlGrR.$schd_dt);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$act_dt, LotTrace_Upd01_DtlGrR.$act_dt);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$trd_ptn_typ, LotTrace_Upd01_DtlGrR.$trd_ptn_typ);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$io_act_typ, LotTrace_Upd01_DtlGrR.$io_act_typ);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$schd_act_typ, LotTrace_Upd01_DtlGrR.$schd_act_typ);
			addColumnPathMap(MST_LOT_TRACE_GR_R.$mfg_inst_unit_typ, LotTrace_Upd01_DtlGrR.$mfg_inst_unit_typ);
		}
	}

	protected Map_MST_LOT_TRACE_GI_R_LotTrace_Upd01_DtlGiR<MST_LOT_TRACE_GI_R,LotTrace_Upd01_DtlGiR> createMap_MST_LOT_TRACE_GI_R_LotTrace_Upd01_DtlGiR() {
		return new Map_MST_LOT_TRACE_GI_R_LotTrace_Upd01_DtlGiR<MST_LOT_TRACE_GI_R, LotTrace_Upd01_DtlGiR>();
	}

	public class Map_MST_LOT_TRACE_GI_R_LotTrace_Upd01_DtlGiR<D extends MST_LOT_TRACE_GI_R, S extends LotTrace_Upd01_DtlGiR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_LOT_TRACE_GI_R.$itm_cd, LotTrace_Upd01_DtlGiR.$itm_cd);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$itm_sub1, LotTrace_Upd01_DtlGiR.$itm_sub1);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$itm_sub2, LotTrace_Upd01_DtlGiR.$itm_sub2);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$itm_sub3, LotTrace_Upd01_DtlGiR.$itm_sub3);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$lot_no, LotTrace_Upd01_DtlGiR.$lot_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$sublot_no, LotTrace_Upd01_DtlGiR.$sublot_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$sno1, LotTrace_Upd01_DtlGiR.$sno1);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$sno2, LotTrace_Upd01_DtlGiR.$sno2);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$sno3, LotTrace_Upd01_DtlGiR.$sno3);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$sno4, LotTrace_Upd01_DtlGiR.$sno4);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$slip_no, LotTrace_Upd01_DtlGiR.$slip_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$slip_schd_no, LotTrace_Upd01_DtlGiR.$slip_schd_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$itm_mfg_inst_no, LotTrace_Upd01_DtlGiR.$itm_mfg_inst_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$mfg_act_no, LotTrace_Upd01_DtlGiR.$mfg_act_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$stk_xfr_act_no, LotTrace_Upd01_DtlGiR.$stk_xfr_act_no);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$base_unit_qty, LotTrace_Upd01_DtlGiR.$base_gi_qty);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$base_unit_cd, LotTrace_Upd01_DtlGiR.$base_unit_cd);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$dlv_cd, LotTrace_Upd01_DtlGiR.$dlv_cd);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$tdlv_cd, LotTrace_Upd01_DtlGiR.$tdlv_cd);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$loc_cd, LotTrace_Upd01_DtlGiR.$loc_cd);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$schd_dt, LotTrace_Upd01_DtlGiR.$schd_dt);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$act_dt, LotTrace_Upd01_DtlGiR.$act_dt);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$trd_ptn_typ, LotTrace_Upd01_DtlGiR.$trd_ptn_typ);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$io_act_typ, LotTrace_Upd01_DtlGiR.$io_act_typ);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$schd_act_typ, LotTrace_Upd01_DtlGiR.$schd_act_typ);
			addColumnPathMap(MST_LOT_TRACE_GI_R.$mfg_inst_unit_typ, LotTrace_Upd01_DtlGiR.$mfg_inst_unit_typ);
		}
	}
	/**
	 * LotTrace_Srch04オペレーション.<p>
	 *
	 * ロットトレース（原因調査）を行う。<br>
	 */
	public class LotTrace_Srch04 extends MSBFL_LotTraceService_MC_A.LotTrace_Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			srchLotTrace();
		}

		/**
		 * ロットトレース（原因調査）情報を取得する。
		 */
		protected void srchLotTrace() {
			MCList<LotTrace_Srch02_RsltR> lotTraceAllL = MCList.create(LotTrace_Srch02_RsltR.class);

			// ロットトレース正展開情報作成
			execLotTraceProc();

			// ロットトレース正展開情報取得
			selLotTrace(lotTraceAllL);

			for (MCList<LotTrace_Srch02_RsltR> lotTraceL : lotTraceAllL.groupList(LotTrace_Srch02_RsltR.$peg_no)) {

				lotTraceL.sort(SortType.ASC, LotTrace_Srch02_RsltR.$sort_no);
				// 展開番号設定
				setExtno(lotTraceL);

				// ソート順設定
				setSort(lotTraceL);

				// 継承情報設定
				setHrrchyVal(lotTraceL);

				down0().addAll(lotTraceL);
			}
		}

		/**
		 * ロットトレース正展開情報を作成する。
		 */
		protected void execLotTraceProc() {
			MCList<MSW_LOT_TRACE_MULTI_INPUT_R> dbc = MCList.create(MSW_LOT_TRACE_MULTI_INPUT_R.class);
			addAll(dbc, up0(), createMSW_LOT_TRACE_MULTI_INPUT_R_LotTrace_Srch02_CndR());
			MSW_LOT_TRACE_MULTI_INPUT_R S0 = MSW_LOT_TRACE_MULTI_INPUT_R.create();
			execDbWkDelete("MSBFL5200_MSW_LOT_TRACE_MULTI_INPUT_D01", S0);
			dbInsert("MSBFL5200_MSW_LOT_TRACE_MULTI_INPUT_I01", dbc, MCQueryApiBuilder.create(MSW_LOT_TRACE_MULTI_INPUT_R.create("T")));

			// ロットトレース正展開情報作成プロシージャの実行
			String procId = "MSPA_LOT_TRC$P_INS_LOT_TRC_HRRCHY_MULTI_INPUT";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId);
		}

		/**
		 * ロットトレース正展開情報を取得する。
		 * 
		 * @param lotTraceAllL
		 */
		protected void selLotTrace(MCList<LotTrace_Srch02_RsltR> lotTraceAllL) {
			executeQuery(lotTraceAllL, MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_S01());
		}

		protected Map_MSW_LOT_TRACE_MULTI_INPUT_R_LotTrace_Srch02_CndR<MSW_LOT_TRACE_MULTI_INPUT_R, LotTrace_Srch02_CndR> createMSW_LOT_TRACE_MULTI_INPUT_R_LotTrace_Srch02_CndR() {
			return new Map_MSW_LOT_TRACE_MULTI_INPUT_R_LotTrace_Srch02_CndR<MSW_LOT_TRACE_MULTI_INPUT_R, LotTrace_Srch02_CndR>();
		}

		public class Map_MSW_LOT_TRACE_MULTI_INPUT_R_LotTrace_Srch02_CndR<D extends MSW_LOT_TRACE_MULTI_INPUT_R, S extends LotTrace_Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$peg_no, LotTrace_Srch02_CndR.$peg_no);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$itm_cd, LotTrace_Srch02_CndR.$itm_cd);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$itm_sub1, LotTrace_Srch02_CndR.$itm_sub1);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$itm_sub2, LotTrace_Srch02_CndR.$itm_sub2);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$itm_sub3, LotTrace_Srch02_CndR.$itm_sub3);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$lot_no, LotTrace_Srch02_CndR.$lot_no);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$sublot_no, LotTrace_Srch02_CndR.$sublot_no);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$sno1, LotTrace_Srch02_CndR.$sno1);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$sno2, LotTrace_Srch02_CndR.$sno2);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$sno3, LotTrace_Srch02_CndR.$sno3);
				addColumnPathMap(MSW_LOT_TRACE_MULTI_INPUT_R.$sno4, LotTrace_Srch02_CndR.$sno4);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if(src.not_mng_flg()){
					dest.lot_not_mng(MCNumber.ONE);
				}else{
					dest.lot_not_mng(MCNumber.ZERO);
				}

				if(src.dupl_abl_flg()){
					dest.lot_dupl_abl(MCNumber.ONE);
				}else{
					dest.lot_dupl_abl(MCNumber.ZERO);
				}
			}
		}
	}

	//FMCB CUSTOM END
}