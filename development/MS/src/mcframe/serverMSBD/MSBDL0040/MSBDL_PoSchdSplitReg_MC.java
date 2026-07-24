package mcframe.serverMSBD.MSBDL0040;

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
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBD.MSBDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR;
import mcframe.serverMSBD.MSBDL5090.MSBDL_PoSchdRegService;
import mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR;
import mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR;
import mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR;
import mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR;
import mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService;
import mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR;
import mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import static mcframe.serverMSBD.MSBDL0040.Query.*;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.commonCore.container.MCRow.Status;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoSchdSplitReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoSchdSplitReg_MC extends MSBDL_PoSchdSplitReg_MC_A{
	//FMCB CUSTOM START
	//----------------------------
	// Cache
	//----------------------------
	/** 発注予定 */
	MCList<MST_PO_SCHD_R> _poSchdL = MCList.create(MST_PO_SCHD_R.class);
	/** 場所 */
	MCList<MAM_LOC_R> _locL = MCList.create(MAM_LOC_R.class);
	/** 品目詳細 */
	FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R> _cacheItmDtl = null;
	/** 取引先 */
	FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null; 
	/** 支給単価 */
	FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _cacheProvUpri = null;
	/** 品目製造指図 */
	protected MCList<MST_ITM_MFG_INST_R> _cacheItmMnfctInst = MCList.create(MST_ITM_MFG_INST_R.class);
	protected MAM_LOC_R _locR = MAM_LOC_R.create();
	//----------------------------
	// IndexKey
	//----------------------------
	/** 発注予定 */
	MCIndexKey _idxPoSchdL = null;
	/** 場所 */
	MCIndexKey _idxLocL = null;
	/** 品目製造指図 */
	MCIndexKey _idxCacheItmMnfctInst = null;
	//----------------------------
	String _sysParm = getSysParm("MASTER_DT_BASE");
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Srch01 extends MSBDL_PoSchdSplitReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索対象に合わせて検索キーを設定
			setUpTmpCol(up0());
			// 基準通貨の設定
			up0().addStringColumn("base_cur_cd", getBaseCur().cur_cd());
			// 納税通貨の設定
			up0().addStringColumn("ptax_cur_cd", getPtaxCur().cur_cd());
			// 分割元の検索
			executeQuery(down0(), MSBDL0040_MST_PO_SCHD_S01(), up0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setDtl(down0());
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			// 論理削除オフのデータのみ対象とする
			return true;
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Srch02 extends MSBDL_PoSchdSplitReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索対象に合わせて検索キーを設定
			setUpTmpCol(up0());
			// 基準通貨の設定
			up0().addStringColumn("base_cur_cd", getBaseCur().cur_cd());
			// 納税通貨の設定
			up0().addStringColumn("ptax_cur_cd", getPtaxCur().cur_cd());
			// 分割元の検索
			int cnt = executeQuery(down0(), MSBDL0040_MST_PO_SCHD_S02(), up0());
			
			// ヘッダが検索できない場合、処理終了
			if (isSame(cnt, 0)) {
				return;
			}
			
			// 分割先の検索
			executeQuery(down1(), MSBDL0040_MST_PO_SCHD_S03(), up0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setDtl(down0());
			setDtl(down1());
		}
		
	}
	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 検索対象区分：分割元発注予定ＮＯ
		if (MSC_PURC_SRCH_TGT_TYP.isSPLIT_SRC_PO_SCHD_NO(up.srch_tgt_typ())) {
			up.addStringColumn("split_src_po_schd_no", up.srch_tgt_no());
		}
		// 検索対象区分：分割先発注予定ＮＯ
		else if (MSC_PURC_SRCH_TGT_TYP.isSPLIT_DST_PO_SCHD_NO(up.srch_tgt_typ())) {
			up.addStringColumn("split_dst_po_schd_no", up.srch_tgt_no());
		}
	}
	/**
	 * 検索結果を補完します
	 * @param dtlL
	 */
	protected void setDtl (MCList<Srch01_Rslt1R> dtlL) {
		for (Srch01_Rslt1R r : dtlL) {
			// 為替レートＣＤ
			dtlL.setStringNE(Srch01_Rslt1R.$xrate_cd, getCo().purc_xrate_cd());
			// 基準通貨金額の算出処理でのみ使用（画面では使用しないので一時カラムとする）
			dtlL.setStringNE("xrate_rnd_typ", getCo().xrate_rnd_typ());
			
			// 基準通貨金額を設定する
			MSBDL_PurcUtil.setBaseCurInfo(r);
			
			// 納税通貨金額を設定する
			MSBDL_PurcUtil.setPtaxCurInfo(r);
			
			// 有効成分を設定する
			if (r.cont_fctr_flg()) {
				MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
						  r.base_unit_qty()
						, r.std_cont_fctr()
						, r.cont_fctr_dec_place()
						, r.cont_fctr_rnd_typ());
				
				r.cont_qty(contQty);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Sprt01 extends MSBDL_PoSchdSplitReg_MC_A.Sprt01 {
		//-------------------------------------
		// indexKey
		//-------------------------------------
		/** 品目詳細 */
		MCIndexKey _idxItmDtlCache = null;
		/**　版 */
		MCIndexKey _idxItmVerCache = null;
		
		//-------------------------------------
		// cache
		//-------------------------------------
		/** 品目詳細 */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		/** 取引先マスタ（発注先） */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;
		/**　版 */
		protected MCList<MAM_ITM_VER_R> _cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
		//-------------------------------------
		// cache作成
		//-------------------------------------
		/**
		 * キャッシュ作成（品目詳細マスタ）
		 * @param list
		 */
		protected void createItmDtlCache() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MCList<Sprt01_DtlR> bindL = up0().groupBy(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$in_to_loc_wg_cd, isSame(_sysParm, "1") ? Sprt01_DtlR.$rqst_avl_rqst_dt : Sprt01_DtlR.$po_schd_dt);
			
			bindL.setStringNE("mfg_loc_cd", MAC_STR.NULL_VAL.value());
			bindL.addStringColumn("rqst_loc_cd", MAC_STR.NULL_VAL.value());
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(bind("rqst_loc_cd")));
			
			if (isSame(_sysParm,"1")) {
				cacheItmDtl_bldr.addWhereWithAnd(bind("rqst_avl_rqst_dt").between(t.st_dt, t.end_dt));
			}
			else {
				cacheItmDtl_bldr.addWhereWithAnd(bind("po_schd_dt").between(t.st_dt, t.end_dt));
			}
			dbSelect("MSBDL0040_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, bindL);
			_idxItmDtlCache = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
		}
		
		/**
		 * キャッシュ作成（取引先マスタ（発注先））
		 * @param r
		 */
		protected void createBpCache() {
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, _cacheItmDtl.groupBy(MAM_ITM_DTL_R.$sppl_cd), MAM_ITM_DTL_R.$sppl_cd);
		}
		
		/**
		 * キャッシュ作成（版マスタ）
		 * @param list
		 */
		protected void createItmVerCache() {
			_cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
			MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
			MCQueryApiBuilder cacheItmVer_bldr = MCQueryApiBuilder.create(t);
			MCList<Sprt01_DtlR> bindL = up0().groupBy(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$site_cd);
			cacheItmVer_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmVer_bldr.addWhereWithAnd(t.site_cd.eq(bind("site_cd")));
			dbSelect("MSBDL0040_MAM_ITM_VER_S01", _cacheItmVer, cacheItmVer_bldr, bindL);
			_idxItmVerCache = _cacheItmVer.createIndex(MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1, MAM_ITM_VER_R.$itm_sub2, MAM_ITM_VER_R.$itm_sub3, MAM_ITM_VER_R.$site_cd);
		}
		//-------------------------------------
		// cache取得
		//-------------------------------------
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtl(Sprt01_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCache, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd());
			MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (isSame(_sysParm, "1")) {
					if (dtlR.rqst_avl_rqst_dt().lte(r.end_dt())
							&& dtlR.rqst_avl_rqst_dt().gte(r.st_dt())
							&& (isNull(dtlR.sppl_cd()) || isSame(dtlR.sppl_cd(), r.sppl_cd()))) {
						rslt.add(r);
					}
				}
				else {
					if (dtlR.po_schd_dt().lte(r.end_dt())
							&& dtlR.po_schd_dt().gte(r.st_dt())
							&& (isNull(dtlR.sppl_cd()) || isSame(dtlR.sppl_cd(), r.sppl_cd()))) {
						rslt.add(r);
					}
				}
			}
			return rslt;
		}
		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}
		/**
		 * キャッシュ取得（版マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_VER_R> getCacheItmVer(Sprt01_DtlR row){
			MCList<MAM_ITM_VER_R> itmVerL = _cacheItmVer.subList(_idxItmVerCache, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.site_cd());
			return itmVerL;
		}
		//-------------------------------------
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 最新マスタのキャッシュ作成
			createMstr();
			
			// 最新マスタ値の反映
			setLatestMstr();
			
			// 購買ユーティリティ呼出し
			callPurcUtilSrch01();
			
			// 詳細情報の設定
			cmplBaseInfo();
			
			// 下り電文設定
			setDown();
		}
		
		/**
		 * マスタを再取得します
		 */
		protected void createMstr() {
			// 品目詳細
			createItmDtlCache();
			// 取引先
			createBpCache();
			// 版
			createItmVerCache();
		}
		/**
		 * マスタ最新値を設定します
		 */
		protected void setLatestMstr() {
			for (Sprt01_DtlR r : up0()) {
				if (!r.outsrc_flg()) {
					// 発注先・メーカ
					setSpplInfo(r);
				}
				// 通貨
				setCurInfo(r);
			}
		}
		/**
		 * 発注先を設定します
		 * @param dtlR
		 */
		protected void setSpplInfo(Sprt01_DtlR dtlR) {
			if (!isNull(dtlR.sppl_cd()) && !isNull(dtlR.maker_cd())) {
				return;
			}
			MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtl(dtlR);
			itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
			if (isNull(itmDtlL)) {
				return;
			}
			MAM_ITM_DTL_R itmDtlR = itmDtlL.get(0);
			dtlR.sppl_cd(itmDtlR.sppl_cd());
			dtlR.maker_cd(itmDtlR.maker_cd());
		}

		/**
		 * 通貨を設定します
		 * @param dtlR
		 */
		protected void setCurInfo(Sprt01_DtlR dtlR) {
			if (isNull(dtlR.sppl_cd())) {
				return;
			}
			MAM_BP_R bpR = getCacheBp(dtlR.sppl_cd());
			dtlR.trd_cur_cd(bpR.cur_cd());
		}
		
		/**
		 * 版ＮＯを設定します
		 * @param dtlR
		 */
		protected void setItmVerInfo(Sprt01_DtlR dtlR) {
			MCList<MAM_ITM_VER_R> itmVerL = getCacheItmVer(dtlR);
			if (isNull(itmVerL)) {
				return;
			}
			itmVerL.sort(mcframe.commonCore.container.MCList.SortType.DESC, MAM_ITM_VER_R.$purc_st_dt);
			for (MAM_ITM_VER_R itmVerR : itmVerL) {
				if (dtlR.rqst_avl_rqst_dt().gte(itmVerR.purc_st_dt())) {
					dtlR.ver_no(itmVerR.ver_no());
					return;
				}
			}
		}
		/**
		 * 購買ユーティリティを呼出す
		 */
		protected void callPurcUtilSrch01() {
			// 購買ユーティリティ実行
			setPegNo(up0());
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), up0(), createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR());
			purcUtilSrch01.exec();
			
			// 実行結果反映
			String[] srcCols = {PurcUtil_Srch01_DtlR.$po_schd_dt, PurcUtil_Srch01_DtlR.$rqst_dlv_rqst_dt, PurcUtil_Srch01_DtlR.$dlv_rqst_dt, PurcUtil_Srch01_DtlR.$purc_schd_dt};
			String[] destCols = {Sprt01_DtlR.$po_schd_dt, Sprt01_DtlR.$rqst_avl_rqst_dt, Sprt01_DtlR.$dlv_rqst_dt, Sprt01_DtlR.$purc_schd_dt};
			copyByPegNo(up0(), destCols, purcUtilSrch01.down0(), srcCols);
		}
		
		/**
		 * 基本情報の補完
		 */
		protected void cmplBaseInfo() {
			// 補完
			for (Sprt01_DtlR r : up0()) {
				// 版ＮＯ
				if (r.ver_flg() && isNull(r.ver_no())) {
					setItmVerInfo(r);
				}
			}
		}
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR,Sprt01_DtlR> createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR, Sprt01_DtlR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$rqst_dlv_rqst_dt, Sprt01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_rqst_dt, Sprt01_DtlR.$dlv_rqst_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, Sprt01_DtlR.$po_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$purc_schd_dt, Sprt01_DtlR.$purc_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Sprt01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Sprt01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Sprt01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Sprt01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Sprt01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!isNull(src.outsrc_sppl_cd())) {
					dest.prov_ddlv_flg(true);
				}
				if (isSame(_sysParm,"1")) {
					dest.base_dt(src.rqst_avl_rqst_dt());
				}
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 単価を再取得する<br>
	 */
	public class Sprt02 extends MSBDL_PoSchdSplitReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setUpriInfo();
		}
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			setPegNo(up0());
			
			MCList<Sprt02_DtlR> tmpL = MCList.create(Sprt02_DtlR.class);
			for (Sprt02_DtlR r : up0()) {
				// 発注予定の段階では単価は必須ではない（また、単価取得に必要な発注先なども必須ではない）ので、単価が取得できない場合は特に何もしない。
				if (!isNullOr(
						  r.base_dt()
						, r.sppl_cd()
						, r.trd_cur_cd()
						, r.in_to_loc_wg_cd()
						, r.in_to_loc_cd()
						, r.itm_cd()
						, r.itm_sub1()
						, r.itm_sub2()
						, r.itm_sub3()
						, r.trd_unit_cd()
						, r.trd_unit_qty()
						, r.base_unit_qty())){
					
					if (isSame(_sysParm, "1")) {
						if (r.outsrc_flg() 
								&& (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.rqst_avl_rqst_dt(), r.rqst_avl_rqst_dt()))) {
							continue;
						}
					}
					else {
						if (r.outsrc_flg() 
								&& (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.po_schd_dt(), r.rqst_avl_rqst_dt()))) {
							continue;
						}
					}
					tmpL.add(r);
				}
			}
			
			// 単価取得対象が存在しない場合中断
			if (tmpL.size() == 0) {
				return;
			}
			
			// サービスコール
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), tmpL, createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR());
			
			purcUtilSrch02.up0();
			purcUtilSrch02.exec();
			String[] destCols = {Sprt02_DtlR.$trd_cur_upri, Sprt02_DtlR.$trd_cur_proc_upri, Sprt02_DtlR.$trd_cur_onr_prov_upri, Sprt02_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(up0(), destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(up0());
		}
		
		protected Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR,Sprt02_DtlR> createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR, Sprt02_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Sprt02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Sprt02_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Sprt02_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Sprt02_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Sprt02_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Sprt02_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, Sprt02_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Sprt02_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Sprt02_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Sprt02_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, Sprt02_DtlR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Sprt02_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Sprt02_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Sprt02_DtlR.$base_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Sprt02_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Sprt02_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Sprt02_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, Sprt02_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Sprt02_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Sprt02_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Sprt02_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Sprt02_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Sprt02_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Sprt02_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.grp_no(dest.peg_no().toString());
				if (isSame(_sysParm, "1")) {
					dest.itmdtl_base_dt(src.rqst_avl_rqst_dt());
				}
				else {
					dest.itmdtl_base_dt(src.po_schd_dt());
				}
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェック<br>
	 */
	public class Chk01 extends MSBDL_PoSchdSplitReg_MC_A.Chk01 {
		//-----------------------------
		// Cache
		//-----------------------------
		/** 受注明細 */
		FXUCL_MCDbcCache<MST_SLO_D_R> _cacheSloD = null;
		//-----------------------------
		// IndexKey
		//-----------------------------
		
		//-----------------------------
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callPoSchdChkSrv();
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCahe();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(thisCheck());
			msgL.addAll(thisCheckExistItmDtl());
			return msgL;
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCahe() {
			// 発注予定
			createCachePoSchd(up0(), up1());
			// 場所
			createCacheLoc();
			// 受注明細
			createCacheSloD();
			// 品目製造指図
			createCacheItmMnfctInst(up0(), up1());
		}
		/**
		 * キャッシュ作成（受注明細） 
		 */
		protected void createCacheSloD() {
			// 対応する受注情報を取得
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			_cacheSloD = new FXUCL_MCDbcCache<MST_SLO_D_R>(sloDL_bldr, up1().groupBy(Chk01_Dtl2R.$slo_d_no), Chk01_Dtl2R.$slo_d_no);
		}
		
		/**
		 * 補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定の補完
			msgL.addAll(completionPoSchd());
			return msgL;
		}
		/**
		 * 発注予定のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList completionPoSchd() {
			MCMessageList msgL = new MCMessageList();
			// 分割元発注予定のロック
			Chk01_Dtl1R hdrR = up0().get(0);
			MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, hdrR.po_schd_no());
			msgL.addAll(checkUpdCntrNE(hdrR, Chk01_Dtl1R.$po_schd_upd_cntr, poSchdR));
			
			MAM_LOC_R locR = _locL.getFirst(_idxLocL, poSchdR.in_to_loc_cd());
			String outsrcSpplCd = locR.sppl_cd();
			
			// 分割元発注予定の補完
			hdrR.abort_flg(poSchdR.abort_flg());
			hdrR.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
			hdrR.pln_itm_ord_no(poSchdR.pln_itm_ord_no());
			hdrR.outsrc_flg(poSchdR.outsrc_flg());
			hdrR.split_src_schd_no(poSchdR.split_src_schd_no());
			hdrR.po_schd_src_typ(poSchdR.po_schd_src_typ());
			hdrR.po_schd_src_no(poSchdR.po_schd_src_no());
			hdrR.po_flg(poSchdR.po_flg());
			hdrR.outsrc_sppl_cd(outsrcSpplCd);
			
			// 分割先発注予定の補完
			for (Chk01_Dtl2R r :up1()) {
				// 入力不可項目となる箇所を、発注予定から補完する
				r.po_schd_no(poSchdR.po_schd_no());
				r.po_schd_src_typ(poSchdR.po_schd_src_typ());
				r.po_schd_src_no(poSchdR.po_schd_src_no());
				r.io_schd_pr_no(poSchdR.io_schd_pr_no());
				r.trd_cd(poSchdR.trd_cd());
				r.trd_ptn_typ(poSchdR.trd_ptn_typ());
				r.itm_cd(poSchdR.itm_cd());
				r.itm_sub1(poSchdR.itm_sub1());
				r.itm_sub2(poSchdR.itm_sub2());
				r.itm_sub3(poSchdR.itm_sub3());
				r.itm_nm(poSchdR.itm_nm());
				r.iv_itm_nm(poSchdR.iv_itm_nm());
				r.sundry_itm_flg(poSchdR.sundry_itm_flg());
				r.sno1(poSchdR.sno1());
				r.sno2(poSchdR.sno2());
				r.sno3(poSchdR.sno3());
				r.sno4(poSchdR.sno4());
				r.in_to_loc_cd(poSchdR.in_to_loc_cd());
				r.site_cd(locR.site_cd());
				r.str_ln_cd(poSchdR.str_ln_cd());
				r.dlv_cd(poSchdR.dlv_cd());
				r.dlv_sundry_flg(poSchdR.dlv_sundry_flg());
				r.dlv_nm(poSchdR.dlv_nm());
				r.dlv_cntct_dpt(poSchdR.dlv_cntct_dpt());
				r.dlv_cntct_psn(poSchdR.dlv_cntct_psn());
				r.dlv_zip_cd(poSchdR.dlv_zip_cd());
				r.dlv_addr1(poSchdR.dlv_addr1());
				r.dlv_addr2(poSchdR.dlv_addr2());
				r.dlv_addr3(poSchdR.dlv_addr3());
				r.dlv_addr4(poSchdR.dlv_addr4());
				r.dlv_tel(poSchdR.dlv_tel());
				r.dlv_fax(poSchdR.dlv_fax());
				r.tdlv_cd(poSchdR.tdlv_cd());
				r.tdlv_sundry_flg(poSchdR.tdlv_sundry_flg());
				r.tdlv_nm(poSchdR.tdlv_nm());
				r.tdlv_cntct_dpt(poSchdR.tdlv_cntct_dpt());
				r.tdlv_cntct_psn(poSchdR.tdlv_cntct_psn());
				r.tdlv_zip_cd(poSchdR.tdlv_zip_cd());
				r.tdlv_addr1(poSchdR.tdlv_addr1());
				r.tdlv_addr2(poSchdR.tdlv_addr2());
				r.tdlv_addr3(poSchdR.tdlv_addr3());
				r.tdlv_addr4(poSchdR.tdlv_addr4());
				r.tdlv_tel(poSchdR.tdlv_tel());
				r.tdlv_fax(poSchdR.tdlv_fax());
				r.split_src_schd_no(poSchdR.po_schd_no());
				r.outsrc_flg(poSchdR.outsrc_flg());
				if (r.outsrc_flg()) {
					r.dlv_rqst_dt(poSchdR.dlv_rqst_tm());
				}
				r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
				r.pln_itm_ord_no(poSchdR.pln_itm_ord_no());
				r.base_unit_cd(poSchdR.base_unit_cd());
				r.rqst_dlv_rqst_dt(poSchdR.rqst_dlv_rqst_tm());
				r.drct_dlv_typ(poSchdR.drct_dlv_typ());
				r.slo_no(poSchdR.slo_no());
				r.slo_d_no(poSchdR.slo_d_no());
				r.po_no(poSchdR.po_no());
				r.rqst_wg_cd(poSchdR.rqst_wg_cd());
				r.sub_char1(poSchdR.sub_char1());
				r.sub_char2(poSchdR.sub_char2());
				r.sub_char3(poSchdR.sub_char3());
				if (!MSC_PO_SCHD_SRC_TYP.isUPLND(poSchdR.po_schd_src_typ())) {
					r.rqst_dlv_rqst_dt(poSchdR.rqst_dlv_rqst_tm());
					r.rqst_avl_rqst_dt(poSchdR.rqst_avl_rqst_dt());
				}
				else {
					r.rqst_dlv_rqst_dt(r.dlv_rqst_dt());
				}
				r.outsrc_sppl_cd(outsrcSpplCd);
				r.add_flg(poSchdR.add_flg());
			}
			return msgL;
		}
		
		/**
		 * 本画面固有のチェック処理
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			//-----------------------------------
			// 分割件数のチェック
			//-----------------------------------
			if (up1().size() <= 1) {
				msgL.add(new MCMessage(MSBDL0011));
			}
			MCList<Chk01_Dtl2R> notErrSrcL = getChkList(up1());
			if (notErrSrcL.size() == 0) {
				return msgL;
			}
			//-----------------------------------
			// 分割元のチェック
			//-----------------------------------
			Chk01_Dtl1R hdrR = up0().get(0);
			if (hdrR.outsrc_flg()) {
				MST_ITM_MFG_INST_R itmInstR = _cacheItmMnfctInst.getFirst(_idxCacheItmMnfctInst, hdrR.outsrc_itm_ord_no());
				if (!isNull(itmInstR)) {
					// 製造指図があったら不可
					msgL.add(new MCMessage(hdrR, null , MSBDL0070, hdrR.po_schd_no(), toDispGUIIndex(hdrR)));
				}
			}
			if (hdrR.abort_flg()) {
				// 打切済の予定は分割および分割解除不可
				msgL.add(new MCMessage(hdrR, null , MSBDL0100, hdrR.po_schd_no()));
			}
			if (hdrR.po_flg()) {
				// 発注済のため更新不可
				msgL.add(new MCMessage(hdrR, null , MSBDL0069, hdrR.po_schd_no(), toDispGUIIndex(hdrR)));
			}
			
			//-----------------------------------
			//　分割元のチェック（便宜上分割先行を利用する）
			//-----------------------------------
			Chk01_Dtl2R tmpR = notErrSrcL.get(0);
			MST_SLO_D_R sloDR = _cacheSloD.get(tmpR.slo_d_no());
			if (!isNull(sloDR) && MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
				// 仕入直送不可
				msgL.add(new MCMessage(tmpR, null , MSBDL0012, tmpR.split_src_schd_no()));
			}
			if (tmpR.dscnt_itm_flg()) {
				// 値引品不可
				msgL.add(new MCMessage(tmpR, null , MSBDL0013, tmpR.split_src_schd_no(), tmpR.itm_cd()));
			}
			// 更新前DACチェック
			MST_PO_SCHD_R poSchdFrR = _poSchdL.getFirst(_idxPoSchdL, hdrR.po_schd_no());
			if (!isNull(poSchdFrR)) {
				poSchdFrR.setAttributes(hdrR);
				msgL.addAll(checkWritableWgCdDac(poSchdFrR, MST_PO_SCHD_R.$wg_cd));
			}
			//-----------------------------------
			// 分割先のチェック
			//-----------------------------------
			for (Chk01_Dtl2R r : notErrSrcL) {
				// 更新後DACチェック
				msgL.addAll(checkWritableWgCdDac(r, Chk01_Dtl2R.$wg_cd));
				// 条件付必須チェック
				if (r.ver_flg()) {
					msgL.addAll(check(r, Chk01_Dtl2R.$ver_no, new FXUCL_RequiredValidater()));
				}
				if (r.xrate_inpt_flg()) {
					msgL.addAll(check(r, Chk01_Dtl2R.$xrate, new FXUCL_RequiredValidater()));
				}
				if (r.ptax_xrate_inpt_flg()) {
					msgL.addAll(check(r, Chk01_Dtl2R.$ptax_xrate, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.purc_rsn_cd())) {
					// 資産管理する品目に経費理由を設定できない
					if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ()) && r.xpns_purc_flg()) {
						msgL.add(new MCMessage(r, null, MSBDL0150, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.purc_rsn_cd(), toDispGUIIndex(r)));
					}
					// 資産管理しない品目には経費理由しか設定できない
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ()) && !r.xpns_purc_flg()) {
						msgL.add(new MCMessage(r, null, MSBDL0151, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.purc_rsn_cd(), toDispGUIIndex(r)));
					}
				}
			}
			msgL.addAll(existBdCheck(notErrSrcL));
			return msgL;
		}
		/**
		 * 品目詳細マスタの存在チェックを行います。
		 * @return
		 */
		protected MCMessageList thisCheckExistItmDtl() {
			MCList<Chk01_Dtl2R> subL = getChkList(up1());
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			for (Chk01_Dtl2R r : subL) {
				// 条件を満たさない場合は、品目詳細のチェックは行わない。
				if (isNull(r.sppl_cd())) {
					continue;
				}
				// 品目詳細マスタの存在チェックを行う
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(r);
				itmDtlR.itm_cd(r.itm_cd());
				itmDtlR.itm_sub1(r.itm_sub1());
				itmDtlR.itm_sub2(r.itm_sub2());
				itmDtlR.itm_sub3(r.itm_sub3());
				itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
				if(isNullOrNullVal(r.mfg_loc_cd())) {
					itmDtlR.sppl_cd(r.sppl_cd());
					itmDtlR.maker_cd(r.maker_cd());
				}
				else {
					itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
					itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
				}
				itmDtlR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				itmDtlR.wg_cd(r.in_to_loc_wg_cd());
				itmDtlR.bom_ptn(r.bom_ptn());
				if (isSame(_sysParm,"1")) {
					itmDtlR.st_dt(r.rqst_avl_rqst_dt());
				}
				else {
					itmDtlR.st_dt(r.po_schd_dt());
				}
				itmDtlL.add(itmDtlR);
			}
			return MSUCL_ProdUtil.chkItmDtlKey(itmDtlL);
		}
		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規のみ)
		 * @return メッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<Chk01_Dtl2R> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_Dtl2R> bdLotChkTgtL = MCList.create(Chk01_Dtl2R.class);
			for (Chk01_Dtl2R dr : dtlL) {
				if (!isNull(dr.bd_po_no())) {
					if (!existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, Chk01_Dtl2R.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, Chk01_Dtl2R.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					if (!existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, Chk01_Dtl2R.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
				
			}		
			callLotServiceChkBdItm(bdLotChkTgtL);
			return msgL;
		}

		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 */
		protected void callLotServiceChkBdItm(MCList<Chk01_Dtl2R> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_Dtl2R());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}
		
		protected Map_Lot_Chk03_CndR_Chk01_Dtl2R<Lot_Chk03_CndR,Chk01_Dtl2R> createMap_Lot_Chk03_CndR_Chk01_Dtl2R() {
			return new Map_Lot_Chk03_CndR_Chk01_Dtl2R<Lot_Chk03_CndR, Chk01_Dtl2R>();
		}

		public class Map_Lot_Chk03_CndR_Chk01_Dtl2R<D extends Lot_Chk03_CndR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_Dtl2R.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_Dtl2R.$bd_itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_Dtl2R.$bd_itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_Dtl2R.$bd_itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_Dtl2R.$bd_itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_Dtl2R.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_Dtl2R.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_Dtl2R.$err_flg);
			}
		}		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		
		/**
		 * 発注予定登録サービスの分割処理前チェック処理を実行する
		 */
		protected void callPoSchdChkSrv() {
			MSBDL_PoSchdRegService.PoSchd_Chk02 ope = MSBDL_PoSchdRegService.crtPoSchd_Chk02();
			addAll(ope.up0(), up0(), createMap_PoSchd_Chk02_DtlR_Chk01_Dtl1R());
			ope.exec();
			copyErrFlg(up0(), ope.down0());
		}
	}
	
	
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 削除前チェック<br>
	 */
	public class Chk02 extends MSBDL_PoSchdSplitReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callPoSchdChkSrv();
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCahe();
			// 補完処理
			completion();
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(thisCheck());
			return msgL;
		}
		/**
		 * キャッシュ作成
		 */
		protected void createCahe() {
			// 発注予定キャッシュの作成
			createCachePoSchd(up1(), up0());
			// 場所
			createCacheLoc();
			// 品目製造指図
			createCacheItmMnfctInst(up1(), up0());
		}
		
		/**
		 * 補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定の補完
			msgL.addAll(completionPoSchd());
			return msgL;
		}
		/**
		 * 発注予定のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList completionPoSchd() {
			MCMessageList msgL = new MCMessageList();
			// 分割先発注予定のロック
			for (Chk01_Dtl1R r : up1()) {
				r.setStatus(Status.DELETE);
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_Dtl1R.$po_schd_upd_cntr, poSchdR));
				r.abort_flg(poSchdR.abort_flg());
				r.po_schd_src_no(poSchdR.po_schd_src_no());
				r.po_schd_src_typ(poSchdR.po_schd_src_typ());
				r.split_src_schd_no(poSchdR.split_src_schd_no());
				r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
				r.pln_itm_ord_no(poSchdR.pln_itm_ord_no());
				r.outsrc_flg(poSchdR.outsrc_flg());
				r.po_flg(poSchdR.po_flg());
				r.outsrc_sppl_cd(_locL.getFirst(_idxLocL, poSchdR.in_to_loc_cd()).sppl_cd());
			}
			
			// 分割元発注予定の補完
			Chk01_Dtl2R hdrR = up0().get(0);
			hdrR.setStatus(Status.DELETE);
			MST_PO_SCHD_R poSchdRHdr = _poSchdL.getFirst(_idxPoSchdL, hdrR.po_schd_no());
			hdrR.po_schd(poSchdRHdr);
			hdrR.outsrc_sppl_cd(_locL.getFirst(_idxLocL, hdrR.in_to_loc_cd()).sppl_cd());
			return msgL;
			
		}
		/**
		 * 本画面固有のチェック処理
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_Dtl1R> notErrSrcL = getChkList(up1());
			// 更新前DACチェック
			MST_PO_SCHD_R poSchdFrR = _poSchdL.getFirst(_idxPoSchdL, up0().get(0).po_schd_no());
			if (!isNull(poSchdFrR)) {
				poSchdFrR.setAttributes(up0().get(0));
				msgL.addAll(checkWritableWgCdDac(poSchdFrR, MST_PO_SCHD_R.$wg_cd));
			}
			
			MAM_ITM_R itmR = MAM_ITM_R.create();
			MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBDL0040_MAM_ITM_S01", itmR, itmR_bldr, poSchdFrR.itm_cd(), poSchdFrR.itm_sub1(), poSchdFrR.itm_sub2(), poSchdFrR.itm_sub3());
			
			if (itmR.isEmpty()) {
				msgL.add(new MCMessage(poSchdFrR, null, MAUAL0189
						, toDispItm(poSchdFrR.itm_cd(), poSchdFrR.itm_sub1(), poSchdFrR.itm_sub2(), poSchdFrR.itm_sub3()), toDispGUIIndex(poSchdFrR)));
			}
			
			//-----------------------------------
			// 分割先のチェック
			//-----------------------------------
			for (Chk01_Dtl1R r : notErrSrcL) {
				if (r.outsrc_flg()) {
					MST_ITM_MFG_INST_R itmInstR = _cacheItmMnfctInst.getFirst(_idxCacheItmMnfctInst, r.outsrc_itm_ord_no());
					if (!isNull(itmInstR)) {
						// 製造指図があったら不可
						msgL.add(new MCMessage(r, null, MSBDL0070, r.po_schd_no(), toDispGUIIndex(r)));
					}
				}
				if (r.abort_flg()) {
					// 打切済の予定は分割および分割解除不可
					msgL.add(new MCMessage(r, null, MSBDL0100, r.po_schd_no(), toDispGUIIndex(r)));
				}
				if (r.po_flg()) {
					// 発注済のため更新不可
					msgL.add(new MCMessage(r, null, MSBDL0069, r.po_schd_no(), toDispGUIIndex(r)));
				}
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				if (!isNull(poSchdR)) {
					// 更新前DACチェック
					poSchdR.setAttributes(r);
					msgL.addAll(checkWritableWgCdDac(poSchdR, MST_PO_SCHD_R.$wg_cd));
				}
				if (MSC_PO_SCHD_CHG_TYP.isDIV_DEL(poSchdR.po_schd_chg_typ())) {
					msgL.add(new MCMessage(r, null, MSBDL0027, r.po_schd_no(), toDispGUIIndex(r)));
				}
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
		 * 発注予定登録サービスの分割処理前チェック処理を実行する
		 */
		protected void callPoSchdChkSrv() {
			MSBDL_PoSchdRegService.PoSchd_Chk02 ope = MSBDL_PoSchdRegService.crtPoSchd_Chk02();
			addAll(ope.up0(), up1(), createMap_PoSchd_Chk02_DtlR_Chk01_Dtl1R());
			ope.exec();
			copyErrFlg(up1(), ope.down0());
		}
		
	}

	/**
	 * 発注予定情報
	 * @param dtlL  明細リスト
	 * @param dtl2L 明細に対応するまとめリスト
	 */
	protected void createCachePoSchd (MCList<Chk01_Dtl1R> dtlL, MCList<Chk01_Dtl2R> dtl2L) {
		_poSchdL = MCList.create(MST_PO_SCHD_R.class);
		MCList<MST_PO_SCHD_R> bindL = MCList.create(MST_PO_SCHD_R.class);
		for (Chk01_Dtl1R r : dtlL) {
			MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
			poSchdR.po_schd_no(r.po_schd_no());
			bindL.add(poSchdR);
		}
		for (Chk01_Dtl2R r : dtl2L) {
			MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
			poSchdR.po_schd_no(r.po_schd_no());
			bindL.add(poSchdR);
		}
		MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(MST_PO_SCHD_R.create("T"));
		dbSelectKey("MSBDL0040_MST_PO_SCHD_S01", _poSchdL, poSchdL_bldr, bindL.groupBy(MST_PO_SCHD_R.$po_schd_no));
		_idxPoSchdL = _poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	
	/**
	 * キャッシュ作成（場所）
	 */
	protected void createCacheLoc () {
		_locL = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
		locL_bldr.setWhere(t.loc_cd.eq(bind("in_to_loc_cd")));
		dbSelect("MSBDL0040_MAM_LOC_S01", _locL, locL_bldr, _poSchdL);
		_idxLocL = _locL.createIndex(MAM_LOC_R.$loc_cd);
	}
	
	/**
	 * キャッシュ作成（品目製造指図）
	 */
	protected void createCacheItmMnfctInst(MCList<Chk01_Dtl1R> dtlL, MCList<Chk01_Dtl2R> dtl2L) {
		MCList<MST_ITM_MFG_INST_R> bindL = MCList.create(MST_ITM_MFG_INST_R.class);
		// 発注予定の外注品目オーダNOに対応する品目製造指図を取得する
		for (Chk01_Dtl1R r : dtlL) {
			MST_ITM_MFG_INST_R bindR = MST_ITM_MFG_INST_R.create();
			bindR.itm_ord_no(r.outsrc_itm_ord_no());
			bindL.add(bindR);
		}
		for (Chk01_Dtl2R r : dtl2L) {
			MST_ITM_MFG_INST_R bindR = MST_ITM_MFG_INST_R.create();
			bindR.itm_ord_no(r.outsrc_itm_ord_no());
			bindL.add(bindR);
		}
		_cacheItmMnfctInst = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder cacheItmMnfctInst_bldr = MCQueryApiBuilder.create(t);
		cacheItmMnfctInst_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
		cacheItmMnfctInst_bldr.addWhereWithAnd(t.can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
		dbSelect("MSBDL0040_MST_ITM_MFG_INST_S01", _cacheItmMnfctInst, cacheItmMnfctInst_bldr, bindL.groupBy(MST_ITM_MFG_INST_R.$itm_ord_no));
		_idxCacheItmMnfctInst = _cacheItmMnfctInst.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
	}
	
	/** 発注予定登録ＳＶ（分割処理前チェック）） */
	protected Map_PoSchd_Chk02_DtlR_Chk01_Dtl1R<PoSchd_Chk02_DtlR,Chk01_Dtl1R> createMap_PoSchd_Chk02_DtlR_Chk01_Dtl1R() {
		return new Map_PoSchd_Chk02_DtlR_Chk01_Dtl1R<PoSchd_Chk02_DtlR, Chk01_Dtl1R>();
	}
	public class Map_PoSchd_Chk02_DtlR_Chk01_Dtl1R<D extends PoSchd_Chk02_DtlR, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSchd_Chk02_DtlR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(PoSchd_Chk02_DtlR.$po_schd_no, Chk01_Dtl1R.$po_schd_no);
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 発注予定を分割する。<br>
	 */
	public class Ins01 extends MSBDL_PoSchdSplitReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// チェック処理の実行
			callThisChk01();
			throwUpdErr();
			
			// キャッシュ作成
			createCache();
			
			// 補完処理
			completion();
			
			// 受払予定削除
			callIoSchdDel01Srv();
			
			// 品目オーダ作成
			updItmOrd();
			
			// 発注予定登録サービス分割
			callPoSchdRegUpd03Srv();
			
			// 検査終了予定日算出
			callInspSchd();
			
			// 受払予定作成
			callIoSchdInsSrv01(up1());
			
			// オーダ登録サービス
			callOrdRegUpd04Srv();
			
			// 下り電文設定
			setDown();
		}
		
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 場所
			createCachePoSchd(up0(), up1());
			createCacheLoc(up1().get(0).in_to_loc_cd());
			createCacheItmDtl(up0(), up1(), false);
			// 取引先（支給先）
			createCacheBp(up1());
			// 支給単価
			createCacheProvUpri(up1());
		}
		/**
		 * キャッシュ作成（場所）
		 * @param bindR
		 */
		protected void createCacheLoc(String locCd) {
			_locR = MAM_LOC_R.create();
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			dbSelectKey("MSBDL0040_MAM_LOC_S02", _locR, locR_bldr, locCd);
		}
		/**
		 * 補完処理
		 */
		protected void completion() {
			// 基本的な情報の補完
			completionBase();
			// 支給先情報の補完
			completionProv();
		}
		/**
		 * 補完処理（基本的な情報）
		 */
		protected void completionBase() {
			for (Chk01_Dtl2R r : up1()) {	
				// 基準単位数量算出
				MCNumber baseUnitQty = convToBaseUnit(
										  r.trd_unit_qty()
										, r.trd_unit_conv_base_qty()
										, r.trd_unit_conv_qty()
										, r.base_unit_dec_place()
										, r.base_unit_rnd_typ());
				r.base_unit_qty(baseUnitQty);
				
				// 取引通貨金額算出
				MSBDL_PurcUtil.setTrdCurInfo(r);
				if(r.outsrc_flg()) {
					MAM_BP_R spplR = _cacheBp.get(r.sppl_cd());
					// 買戻し義務がオンの場合、加工金額を元に税額を再計算する
					if(spplR.repurc_obli_flg()) {
						MCNumber amt = MAUCL_AmtUtil.getAmt(r.trd_cur_upri(),
								r.trd_unit_qty(),
								r.trd_cur_amt_dec_place(),
								r.purc_amt_rnd_typ());
						if(r.inc_tax_flg()) {
							// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
							MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(r.trd_cur_proc_upri(),
									r.trd_unit_qty(),
									r.trd_cur_amt_dec_place(),
									r.purc_amt_rnd_typ());
							r.trd_cur_proc_amt(proc_inc_tax_amt);
							// 有償支給金額は金額-加工金額
							r.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
						}
						MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
								r.trd_cur_proc_amt(),
								r.tax_rate(),
								r.trd_cur_amt_dec_place(),
								r.purc_tax_rnd_typ(),
								r.inc_tax_flg()
								);
						r.trd_cur_tax_amt(trdCurTaxAmt);
						if(r.inc_tax_flg()) {
							amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
							MCNumber proc_amt = !isNull(r.trd_cur_proc_amt()) ? r.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
							r.trd_cur_amt(amt);
							r.trd_cur_proc_amt(proc_amt);
						}
					}
				}
				
				// 直納区分
				if (isNull(r.outsrc_sppl_cd())) {
					r.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
				}
				else {
					r.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
				}
				
				// 購入ＬＴ
				MAM_ITM_DTL_R itmDtlR = _cacheItmDtl.get(
											  r.rqst_avl_rqst_dt()
											, r.itm_cd()
											, r.itm_sub1()
											, r.itm_sub2()
											, r.itm_sub3()
											, r.mfg_loc_cd()
											, r.sppl_cd()
											, r.maker_cd()
											, MAC_STR.NULL_VAL.value()
											, r.in_to_loc_wg_cd()
											, r.bom_ptn());
				if (!isNull(itmDtlR)) {
					r.purc_lt(itmDtlR.purc_lt());
				}
			}
		}
		/**
		 * 補完処理（支給関連）
		 */
		protected void completionProv() {
			for (Chk01_Dtl2R r : up1()) {
				MAM_BP_R bpR = _cacheBp.get(r.outsrc_sppl_cd());
				MAM_PROV_UPRI_R provUpriR = _cacheProvUpri.get(r.rqst_avl_rqst_dt(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.outsrc_sppl_cd(), r.outsrc_sppl_cur_cd(), r.in_to_loc_wg_cd());
				if (!isNull(bpR)) {
					r.prov_basis_typ(bpR.prov_basis_typ());
				}
				if (!isNull(provUpriR)) {
					r.prov_typ(provUpriR.prov_typ());
				}
			}
		}
		/**
		 * 上り電文の編集をする
		 */
		protected void editUp() {
			setPegNo(Chk01_Dtl1R.$peg_no, up0());
			setPegNo(Chk01_Dtl2R.$peg_no, up1());
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().addAll(up1());
		}
		/**
		 * チェック処理を呼出す
		 */
		protected void callThisChk01() {
			MSBDL_PoSchdSplitReg.Chk01 ope = MSBDL_PoSchdSplitReg.crtChk01();
			
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			// 補完
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 受払予定削除
		 */
		protected void callIoSchdDel01Srv() {
			MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();			
			// 入庫予定を削除
			setAll(ope.up0(), up0(), createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1());
			if (up0().get(0).outsrc_flg()) {
				// 入庫予定に対応する投入予定を削除
				addAll(ope.up0(), up0(), createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2());
			}
			ope.exec();
		}
		
		/**
		 * 品目オーダを再作成する
		 */
		protected void updItmOrd() {
			// 外注のデータのみ処理対象(分割元が外注品で分割先が外注品でない、という場合は不可のため考慮不要)
			Chk01_Dtl1R hdrR = up0().get(0);
			if (!hdrR.outsrc_flg()) {
				return;
			}
			// 品目オーダ補完サービス
			MSBCL_OrdRegService.Ord_Sprt04 sub = MSBCL_OrdRegService.crtOrd_Sprt04();
			// 品目オーダ登録サービス
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			
			// 品目オーダ補完
			setAll(sub.up0(), up1(), createMap_Ord_Upd01_Dtl1R_Chk01_Dtl2R());
			sub.up0().setStringNE(Ord_Upd01_Dtl1R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			sub.exec();
			
			/*
			 *  品目オーダ登録
			 *  ※分割元の品目オーダは削除しないで残しておく。（そのため分割取消時には再作成などをしない）
			 */
			setFixedValue(sub.down0(), up1());
			ope.up0().setAll(sub.down0());
			ope.exec();
			
			// 登録した品目オーダＮＯを上り電文の外注品目オーダＮＯに設定する
			String[] destCols = new String[] {Chk01_Dtl2R.$outsrc_itm_ord_no};
			String[] srcCols = new String[] {Ord_Upd01_Rslt1R.$itm_ord_no};
			copyByPegNo(up1(), destCols, ope.down0(), srcCols);
		}
		
		
		
		/**
		 * 発注予定登録サービスを呼出す
		 */
		protected void callPoSchdRegUpd03Srv() {
			MSBDL_PoSchdRegService.PoSchd_Upd03 ope = MSBDL_PoSchdRegService.crtPoSchd_Upd03();
			
			// 分割元の設定
			addAll(ope.up0(), up0(), createMap_PoSchd_Upd03_HdrR_Chk01_Dtl1R());
			
			// 分割先の設定
			addAll(ope.up1(), up1(), createMap_PoSchd_Upd03_DtlR_Chk01_Dtl2R());
			ope.exec();
			
			// 分割登録された発注予定ＮＯを設定
			String[] destCols = new String[] {Chk01_Dtl2R.$po_schd_no};
			String[] srcCols = new String[] {PoSchd_Upd03_DtlR.$po_schd_no};
			copyByPegNo(up1(), destCols, ope.down0(), srcCols);
		}
		
		/**
		 * 検査予定登録サービス呼び出し処理
		 */
		protected void callInspSchd(){
			MSBFL_InspSchdService.InspSchd_Srch03 inspSchdSrch03 = MSBFL_InspSchdService.crtInspSchd_Srch03();
			inspSchdSrch03.up0();
			addAll(inspSchdSrch03.up0(), up1(), createMap_InspSchd_Srch03_CndR_Chk01_Dtl2R());
			inspSchdSrch03.exec();
			String[] srcCols = {InspSchd_Srch03_CndR.$end_dt};
			String[] destCols = {Chk01_Dtl2R.$insp_schd_end_dt};
			copyByPegNo(up1(), destCols, inspSchdSrch03.down0(), srcCols);
		}
		
		/**
		 * 品目オーダ実績項目更新
		 */
		protected void callOrdRegUpd04Srv() {
			Chk01_Dtl1R hdrR = up0().get(0);
			if (!isNull(hdrR.pln_itm_ord_no())) {
				return;
			}
			
			// 計画で作成された品目オーダに対してのみ品目オーダを更新する。
			MSBCL_OrdRegService.Ord_Upd04 ope = MSBCL_OrdRegService.crtOrd_Upd04();
			setAll(ope.up0(), up0(), createMap_Ord_Upd04_DtlR_Chk01_Dtl1R());
			ope.exec();
		}
		
		
		/** 発注予定登録ＳＶ（削除対象） */
		protected Map_PoSchd_Upd03_HdrR_Chk01_Dtl1R<PoSchd_Upd03_HdrR,Chk01_Dtl1R> createMap_PoSchd_Upd03_HdrR_Chk01_Dtl1R() {
			return new Map_PoSchd_Upd03_HdrR_Chk01_Dtl1R<PoSchd_Upd03_HdrR, Chk01_Dtl1R>();
		}
		public class Map_PoSchd_Upd03_HdrR_Chk01_Dtl1R<D extends PoSchd_Upd03_HdrR, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd03_HdrR.$po_schd_no, Chk01_Dtl1R.$po_schd_no);
				addColumnPathMap(PoSchd_Upd03_HdrR.$po_schd_src_typ, Chk01_Dtl1R.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd03_HdrR.$po_schd_src_no, Chk01_Dtl1R.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd03_HdrR.$pln_itm_ord_no, Chk01_Dtl1R.$pln_itm_ord_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		/** 発注予定登録ＳＶ（追加対象） */
		protected Map_PoSchd_Upd03_DtlR_Chk01_Dtl2R<PoSchd_Upd03_DtlR,Chk01_Dtl2R> createMap_PoSchd_Upd03_DtlR_Chk01_Dtl2R() {
			return new Map_PoSchd_Upd03_DtlR_Chk01_Dtl2R<PoSchd_Upd03_DtlR, Chk01_Dtl2R>();
		}
		
		public class Map_PoSchd_Upd03_DtlR_Chk01_Dtl2R<D extends PoSchd_Upd03_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd03_DtlR.$peg_no, Chk01_Dtl2R.$peg_no);
				addColumnPathMap(PoSchd_Upd03_DtlR.$po_schd, Chk01_Dtl2R.$po_schd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		/** オーダ実績項目更新 */
		protected Map_Ord_Upd04_DtlR_Chk01_Dtl1R<Ord_Upd04_DtlR,Chk01_Dtl1R> createMap_Ord_Upd04_DtlR_Chk01_Dtl1R() {
			return new Map_Ord_Upd04_DtlR_Chk01_Dtl1R<Ord_Upd04_DtlR, Chk01_Dtl1R>();
		}
		public class Map_Ord_Upd04_DtlR_Chk01_Dtl1R<D extends Ord_Upd04_DtlR, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, Chk01_Dtl1R.$pln_itm_ord_no);
			}			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.outsrc_flg()) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
				}
			}
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発注予定の分割取消をする。<br>
	 */
	public class Del01 extends MSBDL_PoSchdSplitReg_MC_A.Del01 {
		
		/** 構成展開で取得する子品目情報 */
		protected MCList<Ord_Sprt02_RsltR> chdItmList = MCList.create(Ord_Sprt02_RsltR.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// チェック処理の実行
			callThisChk02();
			throwUpdErr();
			
			// キャッシュ作成
			createCache();
			
			// 補完処理
			completion();
			
			// 受払予定削除
			callIoSchdDel01Srv();
			
			// 発注予定の更新・削除
			callPoSchdUpd03Srv();
			
			// 品目オーダ作成
			updItmOrd();
			
			// 検査予定サービス登録
			callInspSchd();
			
			// 受払予定サービス登録
			callIoSchdInsSrv01(up0());
			
			// 品目オーダ実績項目更新
			callOrdRegUpd04Srv();
		}
		
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			createCachePoSchd(up1(), up0());
			createCacheLoc(up1());
			createCacheItmDtl(up1(), up0(), true);
			// 取引先（支給先）
			createCacheBp(up0());
			// 支給単価
			createCacheProvUpri(up0());
		}
		protected void createCacheLoc(MCList<Chk01_Dtl1R> dtlL) {
			Chk01_Dtl1R dtlR = dtlL.get(0);
			MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, dtlR.po_schd_no());
			_locR = MAM_LOC_R.create();
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			dbSelectKey("MSBDL0040_MAM_LOC_S03", _locR, locR_bldr, poSchdR.in_to_loc_cd());
		}
		/**
		 * 補完処理
		 */
		protected void completion() {
			// 支給先情報の補完
			completionProv();
		}
		/**
		 * 補完処理（支給関連）
		 */
		protected void completionProv() {
			for (Chk01_Dtl2R r : up0()) {
				MAM_BP_R bpR = _cacheBp.get(r.outsrc_sppl_cd());
				MAM_PROV_UPRI_R provUpriR = _cacheProvUpri.get(r.rqst_avl_rqst_dt(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.outsrc_sppl_cd(), r.outsrc_sppl_cur_cd(), r.in_to_loc_wg_cd());
				if (!isNull(bpR)) {
					r.prov_basis_typ(bpR.prov_basis_typ());
				}
				if (!isNull(provUpriR)) {
					r.prov_typ(provUpriR.prov_typ());
				}
			}
		}
		/**
		 * 上り電文の編集をする
		 */
		protected void editUp() {
			setPegNo(Chk01_Dtl1R.$peg_no, up0());
			setPegNo(Chk01_Dtl2R.$peg_no, up1());
		}
		/**
		 * チェック処理を呼出す
		 */
		protected void callThisChk02() {
			MSBDL_PoSchdSplitReg.Chk02 ope = MSBDL_PoSchdSplitReg.crtChk02();
			
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			// 補完
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 受払予定削除
		 */
		protected void callIoSchdDel01Srv() {
			MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();
			// 入庫予定の削除
			setAll(ope.up0(), up1(), createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1());
			
			if (up1().get(0).outsrc_flg()) {
				// 入庫予定に対応する投入予定も削除する
				addAll(ope.up0(), up1(), createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2());
			}
			ope.exec();
		}
		
		/**
		 * 発注予定登録サービスの分割取消処理を呼出す
		 */
		protected void callPoSchdUpd03Srv() {
			MSBDL_PoSchdRegService.PoSchd_Upd03 ope = MSBDL_PoSchdRegService.crtPoSchd_Upd03();
			// 分割元
			setAll(ope.up0(), up0(), createMap_PoSchd_Upd03_HdrR_Chk01_Dtl2R());
			// 分割先
			setAll(ope.up1(), up1(), createMap_PoSchd_Upd03_DtlR_Chk01_Dtl1R());
			ope.exec();
		}
		
		/**
		 * 品目オーダを再作成する
		 */
		protected void updItmOrd() {
			/*
			 *  分割先品目オーダ削除
			 *  ※分割元の品目オーダは分割時削除しないので作り直さない。
			 */
			callOrdRegUpd01Srv();
		}
		
		/**
		 * オーダ登録サービス.品目オーダ更新処理を呼出す
		 */
		protected void callOrdRegUpd01Srv() {
			// 分割先の品目オーダを削除する
			MCList<Chk01_Dtl1R> dtlL = up1().subList(Chk01_Dtl1R.$outsrc_flg, true);
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			setAll(ope.up0(), dtlL, createMap_Ord_Upd01_Dtl1R_Chk01_Dtl1R());
			ope.exec();
		}
		
		/**
		 * 検査予定登録サービス呼び出し処理
		 */
		protected void callInspSchd(){
			MSBFL_InspSchdService.InspSchd_Srch03 inspSchdSrch03 = MSBFL_InspSchdService.crtInspSchd_Srch03();
			inspSchdSrch03.up0();
			addAll(inspSchdSrch03.up0(), up0(), createMap_InspSchd_Srch03_CndR_Chk01_Dtl2R());
			inspSchdSrch03.exec();
			String[] srcCols = {InspSchd_Srch03_CndR.$end_dt};
			String[] destCols = {Chk01_Dtl2R.$insp_schd_end_dt};
			copyByPegNo(up0(), destCols, inspSchdSrch03.down0(), srcCols);
		}
		
		/**
		 * 品目オーダ実績項目更新
		 */
		protected void callOrdRegUpd04Srv() {
			MSBCL_OrdRegService.Ord_Upd04 ope = MSBCL_OrdRegService.crtOrd_Upd04();
			setAll(ope.up0(), up0(), createMap_Ord_Upd04_DtlR_Chk01_Dtl2R());
			ope.exec();
		}
		
		//-------------------------------------------------------------------------
		// マッパー
		//-------------------------------------------------------------------------
		/** 発注予定登録ＳＶ（追加対象） */
		protected Map_PoSchd_Upd03_HdrR_Chk01_Dtl2R<PoSchd_Upd03_HdrR,Chk01_Dtl2R> createMap_PoSchd_Upd03_HdrR_Chk01_Dtl2R() {
			return new Map_PoSchd_Upd03_HdrR_Chk01_Dtl2R<PoSchd_Upd03_HdrR, Chk01_Dtl2R>();
		}
		public class Map_PoSchd_Upd03_HdrR_Chk01_Dtl2R<D extends PoSchd_Upd03_HdrR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd03_DtlR.$po_schd, Chk01_Dtl2R.$po_schd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		/** 発注予定登録ＳＶ（取消対象） */
		protected Map_PoSchd_Upd03_DtlR_Chk01_Dtl1R<PoSchd_Upd03_DtlR,Chk01_Dtl1R> createMap_PoSchd_Upd03_DtlR_Chk01_Dtl1R() {
			return new Map_PoSchd_Upd03_DtlR_Chk01_Dtl1R<PoSchd_Upd03_DtlR, Chk01_Dtl1R>();
		}
		public class Map_PoSchd_Upd03_DtlR_Chk01_Dtl1R<D extends PoSchd_Upd03_DtlR, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd03_DtlR.$po_schd_no, Chk01_Dtl1R.$po_schd_no);
				addColumnPathMap(PoSchd_Upd03_DtlR.$split_src_schd_no, Chk01_Dtl1R.$split_src_schd_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		/** 品目オーダ実績反映ＳＶ */
		protected Map_Ord_Upd04_DtlR_Chk01_Dtl2R<Ord_Upd04_DtlR,Chk01_Dtl2R> createMap_Ord_Upd04_DtlR_Chk01_Dtl2R() {
			return new Map_Ord_Upd04_DtlR_Chk01_Dtl2R<Ord_Upd04_DtlR, Chk01_Dtl2R>();
		}
		public class Map_Ord_Upd04_DtlR_Chk01_Dtl2R<D extends Ord_Upd04_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, Chk01_Dtl2R.$outsrc_itm_ord_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.outsrc_flg()) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
				}
			}
		}
	}
	//------------------------------------------------------------------
	// 更新処理関連共通キャッシュ作成メソッド
	//------------------------------------------------------------------
	/**
	 * キャッシュ作成（品目詳細マスタ）
	 * @param r
	 */
	protected void createCacheItmDtl(MCList<Chk01_Dtl1R> dtlL, MCList<Chk01_Dtl2R> dtl2L, boolean isDel) {
		MCList<MAM_ITM_DTL_R> bindL = MCList.create(MAM_ITM_DTL_R.class);
		for (Chk01_Dtl2R r : dtl2L) {
			MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
			if (isDel) {
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				bindL.add(createItmDtlBindR(poSchdR, poSchdR.outsrc_flg()));
				continue;
			}
			bindR.itm_cd(r.itm_cd());
			bindR.itm_sub1(r.itm_sub1());
			bindR.itm_sub2(r.itm_sub2());
			bindR.itm_sub3(r.itm_sub3());
			bindR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			bindR.wg_cd(r.in_to_loc_wg_cd());
			if (r.outsrc_flg()) {
				bindR.sppl_cd(MAC_STR.NULL_VAL.value());
				bindR.maker_cd(MAC_STR.NULL_VAL.value());
				bindR.mfg_loc_cd(r.mfg_loc_cd());
				bindR.bom_ptn(r.bom_ptn());
			}
			else {
				bindR.sppl_cd(r.sppl_cd());
				bindR.maker_cd(r.maker_cd());
				bindR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				bindR.bom_ptn(MAC_STR.NULL_VAL.value());
			}
			bindL.add(bindR);
		}
		for (Chk01_Dtl1R r : dtlL) {
			MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
			bindL.add(createItmDtlBindR(poSchdR, r.outsrc_flg()));
		}
		_cacheItmDtl = new FXUCL_MCDbcCacheStEnd<MAM_ITM_DTL_R>(
				MCQueryApiBuilder.create(MAM_ITM_DTL_R.create("T")),
				bindL,
				MAM_ITM_DTL_R.$itm_cd,
				MAM_ITM_DTL_R.$itm_sub1,
				MAM_ITM_DTL_R.$itm_sub2,
				MAM_ITM_DTL_R.$itm_sub3,
				MAM_ITM_DTL_R.$mfg_loc_cd,
				MAM_ITM_DTL_R.$sppl_cd,
				MAM_ITM_DTL_R.$maker_cd,
				MAM_ITM_DTL_R.$rqst_loc_cd,
				MAM_ITM_DTL_R.$wg_cd,
				MAM_ITM_DTL_R.$bom_ptn);
	}
	protected MAM_ITM_DTL_R createItmDtlBindR(MST_PO_SCHD_R poSchdR, boolean isOutSrc) {
		MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
		bindR.itm_cd(poSchdR.itm_cd());
		bindR.itm_sub1(poSchdR.itm_sub1());
		bindR.itm_sub2(poSchdR.itm_sub2());
		bindR.itm_sub3(poSchdR.itm_sub3());
		bindR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
		bindR.wg_cd(_locR.wg_cd());
		if (isOutSrc) {
			bindR.sppl_cd(MAC_STR.NULL_VAL.value());
			bindR.maker_cd(MAC_STR.NULL_VAL.value());
			bindR.mfg_loc_cd(poSchdR.mfg_loc_cd());
			bindR.bom_ptn(poSchdR.bom_ptn());
		}
		else {
			bindR.sppl_cd(poSchdR.sppl_cd());
			bindR.maker_cd(poSchdR.maker_cd());
			bindR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			bindR.bom_ptn(MAC_STR.NULL_VAL.value());
		}
		return bindR;
	}

	protected MAM_ITM_DTL_R getItmDtlR(String poSchdNo) {
		MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, poSchdNo);
		MAM_ITM_DTL_R itmDtlR = _cacheItmDtl.get(isSame(_sysParm, "1") ? poSchdR.rqst_avl_rqst_dt() : poSchdR.po_schd_dt(), poSchdR.itm_cd(), poSchdR.itm_sub1(),
				poSchdR.itm_sub2(), poSchdR.itm_sub3(), poSchdR.mfg_loc_cd(), poSchdR.sppl_cd(), poSchdR.maker_cd(),
				MAC_STR.NULL_VAL.value(), _locR.wg_cd(), poSchdR.bom_ptn());
		return itmDtlR;
	}
	/**
	 * キャッシュ作成（支給単価マスタ）
	 * @param r
	 */
	protected void createCacheProvUpri(MCList<Chk01_Dtl2R> dtl2L) {
		for (Chk01_Dtl2R dtl2R : dtl2L) {
			if (!isNull(dtl2R.outsrc_sppl_cd())) {
				MAM_BP_R outSrcSpplR = _cacheBp.get(dtl2R.outsrc_sppl_cd());
				if (!isNull(outSrcSpplR)) {
					dtl2R.outsrc_sppl_cur_cd(outSrcSpplR.cur_cd());
				}
			}
		}
		MCList<Chk01_Dtl2R> bindL 
			= dtl2L.groupBy(
					 Chk01_Dtl2R.$itm_cd
					,Chk01_Dtl2R.$itm_sub1
					,Chk01_Dtl2R.$itm_sub2
					,Chk01_Dtl2R.$itm_sub3
					,Chk01_Dtl2R.$outsrc_sppl_cd
					,Chk01_Dtl2R.$outsrc_sppl_cur_cd
					,Chk01_Dtl2R.$in_to_loc_wg_cd);
		
		_cacheProvUpri = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T")),
				bindL,
				Chk01_Dtl2R.$itm_cd,
				Chk01_Dtl2R.$itm_sub1,
				Chk01_Dtl2R.$itm_sub2,
				Chk01_Dtl2R.$itm_sub3,
				Chk01_Dtl2R.$outsrc_sppl_cd,
				Chk01_Dtl2R.$outsrc_sppl_cur_cd,
				Chk01_Dtl2R.$in_to_loc_wg_cd);
	}
	/**
	 * キャッシュ作成（取引先マスタ（支給先））
	 * @param r
	 */
	protected void createCacheBp(MCList<Chk01_Dtl2R> dtl2L) {
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")), dtl2L.groupBy(Chk01_Dtl2R.$outsrc_sppl_cd), Chk01_Dtl2R.$outsrc_sppl_cd);
	}
	//------------------------------------------------------------------
	// 更新処理関連共通メソッド
	//------------------------------------------------------------------
	/**
	 * 受払予定区分を設定します
	 * @param dest
	 * @param src
	 */
	protected String setIoSchdTyp(String outsrcSpplCd,MAM_ITM_DTL_R itmDtlR ) {

		String purcIdTyp = isNull(itmDtlR) ? MAC_PURC_ID_TYP.PURC.value() : itmDtlR.purc_id_typ();
		// 仕入直送は分割不可によりありえないため考慮しない
		if (!isNull(outsrcSpplCd)) {
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				return MSC_IO_SCHD_TYP.ARR_PROV.value();
			}
			else {
				return MSC_IO_SCHD_TYP.PURC_GR_PROV.value();				
			}
		}
		else {
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp) || MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
				return MSC_IO_SCHD_TYP.ARR.value();
			}
			else {
				return MSC_IO_SCHD_TYP.PURC_GR.value();
			}
		}
	}
	/**
	 * 品目オーダ登録呼出しのための固定値設定
	 */
	protected void setFixedValue(MCList<Ord_Upd01_Dtl1R> ordDtlL, MCList<Chk01_Dtl2R> dtlL) {
		ordDtlL.setStringNE(Ord_Upd01_Dtl1R.$mrp_typ, MSC_MRP_TYP.MRP.value());
		ordDtlL.setStringNE(Ord_Upd01_Dtl1R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		ordDtlL.setStringNE(Ord_Upd01_Dtl1R.$itm_ord_typ, MSC_ITM_ORD_TYP.OUTSRC.value());
		ordDtlL.setStringNE(Ord_Upd01_Dtl1R.$ord_gnrt_typ, MSC_ORD_GNRT_TYP.UPLND.value());
		ordDtlL.setStringNE(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, MSC_ITM_ORD_STS_TYP.FIX.value());
		ordDtlL.setBooleanNE(Ord_Upd01_Dtl1R.$not_fix_flg, false);
		ordDtlL.setBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, true);
		ordDtlL.setBooleanNE(Ord_Upd01_Dtl1R.$io_schd_pr_flg, true);
		
		String[] destCols = {Ord_Upd01_Dtl1R.$rqst_wg_cd, Ord_Upd01_Dtl1R.$io_schd_pr_no};
		String[] srcCols = {Chk01_Dtl2R.$wg_cd, Chk01_Dtl2R.$io_schd_pr_no};
		copyByPegNo(ordDtlL, destCols, dtlL, srcCols);
		
	}
	
	/**
	 * 投入予定（受払予定）の上り電文を作成します。
	 * @return
	 */
	protected void callIoSchdInsSrv01(MCList<Chk01_Dtl2R> dtlL) {
		MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
		// 入庫予定の作成
		addAll(ioSchdIns01.up0(), dtlL, createMap_IoSchd_Ins01_DtlR_Chk01_Dtl2R());
		MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
		MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
		MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(t);
		operOrderL_bldr.setWhere(t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
		dbSelect("MSBDL0040_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr, dtlL);
		MCIndexKey idxOperOrderL = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
		
		// 投入品の出庫予定の作成
		for (Chk01_Dtl2R r : dtlL) {
			MCList<IoSchd_Ins01_DtlR> tmpL = MCList.create(IoSchd_Ins01_DtlR.class);
			if (r.outsrc_flg()) {
				// 構成展開サービスを呼び出すために着手予定日を取得する
				MSBCL_OrdRegService.Ord_Sprt03 calc = MSBCL_OrdRegService.crtOrd_Sprt03();
				Ord_Sprt03_DtlR calcUp0 = Ord_Sprt03_DtlR.create();
				copy(calcUp0, r, createMap_Ord_Sprt03_DtlR_Chk01_Dtl2R());
				calc.up0().add(calcUp0);
				calc.exec();
				
				// 構成展開
				MSBCL_OrdRegService.Ord_Sprt02 ope = MSBCL_OrdRegService.crtOrd_Sprt02();
				ope.up0().inst_exp_flg(false);
				ope.up0().get_prov_upri_flg(false);
				Ord_Sprt02_DtlR dtlR = Ord_Sprt02_DtlR.create();
				copy(dtlR, r, createMap_Ord_Sprt02_DtlR_Chk01_Dtl2R());
				ope.up1().add(dtlR);
				
				// 予定日計算の結果を構成展開の上り電文に設定
				String[] destCols = new String[] {
						Ord_Sprt02_DtlR.$mfg_st_schd_dt, 
						Ord_Sprt02_DtlR.$st_schd_tm , 
						Ord_Sprt02_DtlR.$end_schd_tm};
				String[] srcCols = new String[] {
						Ord_Sprt03_RsltR.$mfg_st_schd_dt, 
						Ord_Sprt03_RsltR.$mfg_st_schd_dt, 
						Ord_Sprt03_RsltR.$mfg_end_schd_dt};
				copyByPegNo(ope.up1(), destCols, calc.down0(), srcCols);
				
				ope.exec();
				
				// 投入の受払予定を作成
				addAll(tmpL, ope.down0(), createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
				// 受払進捗管理ＮＯを設定
				tmpL.setStringNE(IoSchd_Ins01_DtlR.$io_schd_pr_no, r.io_schd_pr_no());
				// 工程オーダＮＯを設定
				MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(idxOperOrderL, r.outsrc_itm_ord_no());
				tmpL.setStringNE(IoSchd_Ins01_DtlR.$oper_ord_no, operOrderR.oper_ord_no());
				ioSchdIns01.up0().addAll(tmpL);
			}
		}
		
		ioSchdIns01.exec();
	}
	
	//------------------------------------------------------------------
	// 更新処理関連共通マッパー
	//------------------------------------------------------------------
	/** 検査予定ＳＶ */
	protected Map_InspSchd_Srch03_CndR_Chk01_Dtl2R<InspSchd_Srch03_CndR,Chk01_Dtl2R> createMap_InspSchd_Srch03_CndR_Chk01_Dtl2R() {
		return new Map_InspSchd_Srch03_CndR_Chk01_Dtl2R<InspSchd_Srch03_CndR, Chk01_Dtl2R>();
	}
	public class Map_InspSchd_Srch03_CndR_Chk01_Dtl2R<D extends InspSchd_Srch03_CndR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, Chk01_Dtl2R.$itm_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, Chk01_Dtl2R.$itm_sub1);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, Chk01_Dtl2R.$itm_sub2);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, Chk01_Dtl2R.$itm_sub3);
			addColumnPathMap(InspSchd_Srch03_CndR.$sppl_cd, Chk01_Dtl2R.$sppl_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$maker_cd, Chk01_Dtl2R.$maker_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt, Chk01_Dtl2R.$dlv_rqst_dt);
			addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, Chk01_Dtl2R.$in_to_loc_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
		}
	}
	/** 受払予定ＳＶ（入庫予定の削除） */ 
	protected Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1<MSW_IO_SCHD_DEL_R,Chk01_Dtl1R> createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1() {
		return new Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1<MSW_IO_SCHD_DEL_R, Chk01_Dtl1R>();
	}
	public class Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R1<D extends MSW_IO_SCHD_DEL_R, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_PO_SCHD_R.$po_schd_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_ITM_DTL_R itmDtlR = getItmDtlR(src.po_schd_no());
			dest.io_schd_typ(setIoSchdTyp(src.outsrc_sppl_cd(), itmDtlR));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
		}
	}
	/** 受払予定ＳＶ（投入予定の削除） */ 
	protected Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2<MSW_IO_SCHD_DEL_R,Chk01_Dtl1R> createMap_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2() {
		return new Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2<MSW_IO_SCHD_DEL_R, Chk01_Dtl1R>();
	}
	public class Map_MSW_IO_SCHD_DEL_R_Chk01_Dtl1R2<D extends MSW_IO_SCHD_DEL_R, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_PO_SCHD_R.$outsrc_itm_ord_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
		}
		
	}
	/** 受払予定登録ＳＶ（登録） */
	protected Map_IoSchd_Ins01_DtlR_Chk01_Dtl2R<IoSchd_Ins01_DtlR,Chk01_Dtl2R> createMap_IoSchd_Ins01_DtlR_Chk01_Dtl2R() {
		return new Map_IoSchd_Ins01_DtlR_Chk01_Dtl2R<IoSchd_Ins01_DtlR, Chk01_Dtl2R>();
	}
	public class Map_IoSchd_Ins01_DtlR_Chk01_Dtl2R<D extends IoSchd_Ins01_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, Chk01_Dtl2R.$po_schd_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, Chk01_Dtl2R.$io_schd_pr_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Chk01_Dtl2R.$dlv_rqst_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, Chk01_Dtl2R.$purc_schd_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt, Chk01_Dtl2R.$insp_schd_end_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Chk01_Dtl2R.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Chk01_Dtl2R.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Chk01_Dtl2R.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Chk01_Dtl2R.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Chk01_Dtl2R.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Chk01_Dtl2R.$in_to_loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, Chk01_Dtl2R.$str_ln_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Chk01_Dtl2R.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Chk01_Dtl2R.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Chk01_Dtl2R.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Chk01_Dtl2R.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Chk01_Dtl2R.$trd_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Chk01_Dtl2R.$trd_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Chk01_Dtl2R.$base_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Chk01_Dtl2R.$base_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, Chk01_Dtl2R.$sppl_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$rsn_cd, Chk01_Dtl2R.$purc_rsn_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_ITM_DTL_R itmDtlR =_cacheItmDtl.get(
					src.rqst_avl_rqst_dt()
					, src.itm_cd()
					, src.itm_sub1()
					, src.itm_sub2()
					, src.itm_sub3()
					, src.mfg_loc_cd()
					, src.sppl_cd()
					, src.maker_cd()
					, MAC_STR.NULL_VAL.value()
					, _locR.wg_cd()
					, src.bom_ptn());
			dest.io_schd_typ(setIoSchdTyp(src.outsrc_sppl_cd(), itmDtlR));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			String purcIdTyp = isNull(itmDtlR) ? MAC_PURC_ID_TYP.PURC.value() : itmDtlR.purc_id_typ();
			dest.stk_arrv_bp_cd(setStkArrvBpCd(src.outsrc_sppl_cd(), src.prov_basis_typ(), src.prov_typ(), purcIdTyp));
			dest.stk_id_typ(setStkIdTyp(src.prov_basis_typ(), src.outsrc_sppl_cd(), src.prov_typ(), purcIdTyp));
			dest.stk_bp_cd(setStkBpCd(dest.stk_id_typ(), src.outsrc_sppl_cd(), src.sppl_cd()));
			if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)
					|| MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp)
					|| (!isNull(src.outsrc_sppl_cd())
							&& MAC_PURC_ID_TYP.isVMI(purcIdTyp))) {
				dest.accpt_schd_dt(src.purc_schd_dt());
			}
			dest.gd_cd(MAUCL_AppSys.getDefaultFeedStkGd().gd_cd());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.lot_no(MAC_STR.NULL_VAL.value());
			dest.sublot_no(MAC_STR.NULL_VAL.value());
			if (src.outsrc_flg()) {
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				dest.io_schd_sub_no1(src.outsrc_itm_ord_no());
			}
		}
		/**
		 * 在庫着荷先ＣＤを設定します
		 * @param dest
		 * @param src
		 */
		protected String setStkArrvBpCd(String outsrc_sppl_cd, String prov_basis_typ, String prov_typ, String purc_id_typ) {
			if (!isNull(outsrc_sppl_cd)
					&& (!MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)
							|| !MAC_PROV_TYP.isONR_PROV(prov_typ)
							|| MAC_PURC_ID_TYP.isFFR_RCV(purc_id_typ))) {
				return outsrc_sppl_cd;
			}
			else {
				return null;
			}
		}
		/**
		 * 在庫識別区分を設定します
		 */
		protected String setStkIdTyp(String prov_basis_typ, String outsrc_sppl_cd, String prov_typ, String purcIdTyp) {
			if (!isNull(outsrc_sppl_cd) 
					&& !MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)
					&& MAC_PROV_TYP.isONR_PROV(prov_typ)
					&& !MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				return MSC_STK_ID_TYP.ONR_PROV.value();
			} 
			else {
				if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
					return MSC_STK_ID_TYP.NCV_RCV.value();
				}
				else if (isNull(outsrc_sppl_cd) && MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
					return MSC_STK_ID_TYP.RNT_RCV.value();
				}
				else {
					return MSC_STK_ID_TYP.COSTK.value();
				}
			}
		}
		/**
		 * 在庫取引先を設定します
		 * @param stkIdTyp
		 * @param outsrc_sppl_cd
		 * @return
		 */
		protected String setStkBpCd(String stkIdTyp, String outsrc_sppl_cd, String sppl_cd) {
			if (MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
				return outsrc_sppl_cd;
			}
			else if (MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp) || MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)) {
				return sppl_cd;
			}
			else {
				return MAC_STR.NULL_VAL.value();
			}
		}
	}
	/** 品目オーダ登録ＳＶ（オーダ削除） */
	protected Map_Ord_Upd01_Dtl1R_Chk01_Dtl1R<Ord_Upd01_Dtl1R,Chk01_Dtl1R> createMap_Ord_Upd01_Dtl1R_Chk01_Dtl1R() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_Dtl1R<Ord_Upd01_Dtl1R, Chk01_Dtl1R>();
	}
	public class Map_Ord_Upd01_Dtl1R_Chk01_Dtl1R<D extends Ord_Upd01_Dtl1R, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_Dtl1R.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk01_Dtl1R.$outsrc_itm_ord_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.mrp_typ(MSC_MRP_TYP.MRP.value());
		}
	}
	/** 品目オーダ登録ＳＶ（オーダ作成） */
	protected Map_Ord_Upd01_Dtl1R_Chk01_Dtl2R<Ord_Upd01_Dtl1R,Chk01_Dtl2R> createMap_Ord_Upd01_Dtl1R_Chk01_Dtl2R() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_Dtl2R<Ord_Upd01_Dtl1R, Chk01_Dtl2R>();
	}
	public class Map_Ord_Upd01_Dtl1R_Chk01_Dtl2R<D extends Ord_Upd01_Dtl1R, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk01_Dtl2R.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk01_Dtl2R.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk01_Dtl2R.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk01_Dtl2R.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Chk01_Dtl2R.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Chk01_Dtl2R.$in_to_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Chk01_Dtl2R.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Chk01_Dtl2R.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Chk01_Dtl2R.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Chk01_Dtl2R.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Chk01_Dtl2R.$base_unit_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Chk01_Dtl2R.$rqst_avl_rqst_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Chk01_Dtl2R.$rqst_avl_rqst_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Chk01_Dtl2R.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Chk01_Dtl2R.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Chk01_Dtl2R.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Chk01_Dtl2R.$sno4);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
		}
	}
	/** オーダ登録ＳＶ（予定日計算） */
	protected Map_Ord_Sprt03_DtlR_Chk01_Dtl2R<Ord_Sprt03_DtlR,Chk01_Dtl2R> createMap_Ord_Sprt03_DtlR_Chk01_Dtl2R() {
		return new Map_Ord_Sprt03_DtlR_Chk01_Dtl2R<Ord_Sprt03_DtlR, Chk01_Dtl2R>();
	}
	public class Map_Ord_Sprt03_DtlR_Chk01_Dtl2R<D extends Ord_Sprt03_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, Chk01_Dtl2R.$rqst_avl_rqst_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Chk01_Dtl2R.$po_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Chk01_Dtl2R.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Chk01_Dtl2R.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Chk01_Dtl2R.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Chk01_Dtl2R.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Chk01_Dtl2R.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, Chk01_Dtl2R.$sppl_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, Chk01_Dtl2R.$maker_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Chk01_Dtl2R.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Chk01_Dtl2R.$in_to_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Chk01_Dtl2R.$base_unit_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
		}
	}
	/** オーダ登録ＳＶ（構成展開 up1） */
	protected Map_Ord_Sprt02_DtlR_Chk01_Dtl2R<Ord_Sprt02_DtlR,Chk01_Dtl2R> createMap_Ord_Sprt02_DtlR_Chk01_Dtl2R() {
		return new Map_Ord_Sprt02_DtlR_Chk01_Dtl2R<Ord_Sprt02_DtlR, Chk01_Dtl2R>();
	}
	public class Map_Ord_Sprt02_DtlR_Chk01_Dtl2R<D extends Ord_Sprt02_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_ord_no, Chk01_Dtl2R.$outsrc_itm_ord_no);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, Chk01_Dtl2R.$itm_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, Chk01_Dtl2R.$itm_sub1);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, Chk01_Dtl2R.$itm_sub2);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, Chk01_Dtl2R.$itm_sub3);
			addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, Chk01_Dtl2R.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, Chk01_Dtl2R.$bom_ptn);
			addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, Chk01_Dtl2R.$base_unit_qty);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno1, Chk01_Dtl2R.$sno1);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno2, Chk01_Dtl2R.$sno2);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno3, Chk01_Dtl2R.$sno3);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno4, Chk01_Dtl2R.$sno4);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.oper_cd(MAC_STR.NULL_VAL.value());
			dest.oper_seq(MCNumber.ZERO);
		}
	}
	/** 投入予定 */
	protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
		return new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
	}
	public class Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<D extends IoSchd_Ins01_DtlR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, Ord_Sprt02_RsltR.$itm_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Ord_Sprt02_RsltR.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
			addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, Ord_Sprt02_RsltR.$oper_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, Ord_Sprt02_RsltR.$alt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_itm_ratio);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Ord_Sprt02_RsltR.$loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Ord_Sprt02_RsltR.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Ord_Sprt02_RsltR.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Ord_Sprt02_RsltR.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Ord_Sprt02_RsltR.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, Ord_Sprt02_RsltR.$oper_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
			dest.io_schd_sub_no1(src.itm_ord_no());
			dest.str_ln_cd(MAC_STR.NULL_VAL.value());
			dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			dest.lot_no(MAC_STR.NULL_VAL.value());
			dest.sublot_no(MAC_STR.NULL_VAL.value());
			dest.gd_cd(getDefaultFeedStkGd().gd_cd());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
				dest.sno1_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
				dest.sno2_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
				dest.sno3_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
				dest.sno4_null_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}