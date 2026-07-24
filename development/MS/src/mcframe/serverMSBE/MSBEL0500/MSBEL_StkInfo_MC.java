package mcframe.serverMSBE.MSBEL0500;

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
import mcframe.serverMSBE.MSBEL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL0500.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkInfo"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkInfo_MC extends MSBEL_StkInfo_MC_A{
	//FMCB CUSTOM START
	/** グループ化項目（基本品目項目＋画面設定） */
	protected String[] _grpCols = null;
	/** 非表示項目（画面設定の不要項目） */
	protected String[] _removeCols = null;
	/** 品目キャッシュ */
	protected Map<String, Srch01_RsltR> _itmCache = new HashMap<String, Srch01_RsltR>();
	/** 諸口品キャッシュ */
	protected Map<String, Srch01_RsltR> _sundryItmCache = new HashMap<String, Srch01_RsltR>();
	/** 場所キャッシュ */
	protected Map<String, Srch01_RsltR> _locCache = new HashMap<String, Srch01_RsltR>();
	/** 案件ＮＯキャッシュ */
	protected Map<String, Srch01_RsltR> _wrkCache = new HashMap<String, Srch01_RsltR>();
	/** 棚・ラインキャッシュ */
	protected Map<String, String> _strLnCache = new HashMap<String, String>();
	/** 格付キャッシュ */
	protected Map<String, String> _gdCache = new HashMap<String, String>();
	/** 在庫着荷先キャッシュ */
	protected Map<String, String> _stkArrvCache = new HashMap<String, String>();
	/** 在庫取引先キャッシュ */
	protected Map<String, String> _stkBpCache = new HashMap<String, String>();
	/** 単位キャッシュ */
	protected Map<String, String> _unitCache = new HashMap<String, String>();

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 現時点在庫あるいは引当可能数量を照会する<br>
	 */
	public class Srch01 extends MSBEL_StkInfo_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件の編集処理
			editUp();

			// 使用可能在庫を取得する
			callAllocSrchSV();

			// 使用可能在庫以外の在庫を取得する
			addDown();

			// 検索結果の編集
			editDown();

			// 検索結果のソート
			sortDown();
		}

		/**
		 * 上り電文に設定された「ＦＬＧ」の検索条件を編集する。
		 */
		protected void editUp() {
			setOnlyIntFlgOn();   // 納品先を除く
			setUnregLmtFlgOn();  // 期限未設定を含む
			setQualityTyp();     // 良品区分
			setStkInspTyp();     // 在庫検査区分
			setStkIdTyp();       // 在庫識別区分
			setPlntAprvStsTyp(); // 工場出荷承認状況区分
			setMrktJudgStsTyp(); // 市場出荷判定状況区分
			setSNO();            // 手配ＮＯ
			editSno();           // 手配ＮＯの編集
		}

		// 納品先在庫を除く
		protected void setOnlyIntFlgOn() {
			up0().addStringColumn("only_int_true", toTrueStr(up0().only_int_flg()));
		}

		// 期限未設定を含む
		protected void setUnregLmtFlgOn() {
			up0().addStringColumn("unreg_lmt_true", toTrueStr(up0().unreg_lmt_flg()));
		}

		// 良品区分
		protected void setQualityTyp() {
			if (up0().quality_typ_good_flg()) {
				up0().addStringColumn("good", MAC_QUALITY_TYP.GOOD.value());
			}
			if (up0().quality_typ_dfct_oper_flg()) {
				up0().addStringColumn("dfct_oper", MAC_QUALITY_TYP.DFCT_OPER.value());
			}
			if (up0().quality_typ_dfct_insp_flg()) {
				up0().addStringColumn("dfct_insp", MAC_QUALITY_TYP.DFCT_INSP.value());
			}
			if (up0().quality_typ_sspnd_flg()) {
				up0().addStringColumn("sspnd", MAC_QUALITY_TYP.SSPND.value());
			}
		}

		// 在庫検査区分
		protected void setStkInspTyp() {
			if (up0().stk_insp_typ_yet_flg()) {
				up0().addStringColumn("yet", MSC_STK_INSP_TYP.YET.value());
			}
			if (up0().stk_insp_typ_ing_flg()) {
				up0().addStringColumn("ing", MSC_STK_INSP_TYP.ING.value());
			}
			if (up0().stk_insp_typ_wait_judg_flg()) {
				up0().addStringColumn("wait_judg", MSC_STK_INSP_TYP.WAIT_JUDG.value());
			}
			if (up0().stk_insp_typ_fin_flg()) {
				up0().addStringColumn("fin", MSC_STK_INSP_TYP.FIN.value());
			}
		}

		// 在庫識別区分
		protected void setStkIdTyp() {
			if (up0().stk_id_typ_costk_flg()) {
				up0().addStringColumn("costk", MSC_STK_ID_TYP.COSTK.value());
			}
			if (up0().stk_id_typ_rtn_pre_accpt_flg()) {
				up0().addStringColumn("rtn_pre_accpt", MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());
			}
			if (up0().stk_id_typ_cststk_flg()) {
				up0().addStringColumn("cststk", MSC_STK_ID_TYP.CSTSTK.value());
			}
			if (up0().stk_id_typ_rnt_rcv_flg()) {
				up0().addStringColumn("rnt_rcv", MSC_STK_ID_TYP.RNT_RCV.value());
			}
			if (up0().stk_id_typ_purc_pre_accpt_flg()) {
				up0().addStringColumn("purc_pre_accpt", MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
			}
			if (up0().stk_id_typ_accpt_dfct_flg()) {
				up0().addStringColumn("accpt_dfct", MSC_STK_ID_TYP.ACCPT_DFCT.value());
			}
			if (up0().stk_id_typ_ncv_rcv_flg()) {
				up0().addStringColumn("ncv_rcv", MSC_STK_ID_TYP.NCV_RCV.value());
			}
			if (up0().stk_id_typ_onr_prov_flg()) {
				up0().addStringColumn("onr_prov", MSC_STK_ID_TYP.ONR_PROV.value());
			}
		}

		// 工場出荷承認状況区分
		protected void setPlntAprvStsTyp() {
			if (up0().plnt_aprv_sts_typ_opn_flg()) {
				up0().addStringColumn("plnt_aprv_sts_typ_opn", MSC_PLNT_APRV_STS_TYP.OPN.value());
			}
			if (up0().plnt_aprv_sts_typ_acpt_flg()) {
				up0().addStringColumn("plnt_aprv_sts_typ_acpt", MSC_PLNT_APRV_STS_TYP.ACPT.value());
			}
			if (up0().plnt_aprv_sts_typ_rjct_flg()) {
				up0().addStringColumn("plnt_aprv_sts_typ_rjct", MSC_PLNT_APRV_STS_TYP.RJCT.value());
			}
			if (up0().plnt_aprv_sts_typ_non_flg()) {
				up0().addStringColumn("plnt_aprv_sts_typ_non", "1");
			}
		}

		// 市場出荷判定状況区分
		protected void setMrktJudgStsTyp() {
			if (up0().mrkt_judg_sts_typ_opn_flg()) {
				up0().addStringColumn("mrkt_judg_sts_typ_opn", MSC_MRKT_JUDG_STS_TYP.OPN.value());
			}
			if (up0().mrkt_judg_sts_typ_acpt_flg()) {
				up0().addStringColumn("mrkt_judg_sts_typ_acpt", MSC_MRKT_JUDG_STS_TYP.ACPT.value());
			}
			if (up0().mrkt_judg_sts_typ_not_acpt_flg()) {
				up0().addStringColumn("mrkt_judg_sts_typ_not_acpt", MSC_MRKT_JUDG_STS_TYP.NOT_ACPT.value());
			}
			if (up0().mrkt_judg_sts_typ_non_flg()) {
				up0().addStringColumn("mrkt_judg_sts_typ_non", "1");
			}
		}

		// 手配ＮＯ
		protected void setSNO() {
			// 手配ＮＯ１
			if (!isNull(up0().sno1())) {
				if (up0().sno1_null_flg()) {
					up0().addStringColumn("sno1_expt_val", MAC_STR.NULL_VAL.value());
				}
			}
			// 手配ＮＯ２
			if (!isNull(up0().sno2())) {
				if (up0().sno2_null_flg()) {
					up0().addStringColumn("sno2_expt_val", MAC_STR.NULL_VAL.value());
				}
			}
			// 手配ＮＯ３
			if (!isNull(up0().sno3())) {
				if (up0().sno3_null_flg()) {
					up0().addStringColumn("sno3_expt_val", MAC_STR.NULL_VAL.value());
				}
			}
			// 手配ＮＯ４
			if (!isNull(up0().sno4())) {
				if (up0().sno4_null_flg()) {
					up0().addStringColumn("sno4_expt_val", MAC_STR.NULL_VAL.value());
				}
			}
		}
		protected void editSno() {
			// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
			if (!isNull(up0().itm_cd()) && !isNullAnd(up0().sno1(), up0().sno2(), up0().sno3(), up0().sno4())) {
				MAM_ITM_R itm = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
				itm_bldr.setSelect(
						t.sno1_mng_typ,
						t.sno2_mng_typ,
						t.sno3_mng_typ,
						t.sno4_mng_typ);
				itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd"))
						.and(t.itm_sub1.eq(bind("itm_sub1")))
						.and(t.itm_sub2.eq(bind("itm_sub2")))
						.and(t.itm_sub3.eq(bind("itm_sub3"))));
				dbSelect("MSBEL0500_MAM_ITM_S01", itm, itm_bldr, up0());
				if (!isNull(up0().sno1()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
					up0().sno1(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno2()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
					up0().sno2(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno3()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
					up0().sno3(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno4()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
					up0().sno4(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 使用可能在庫を取得する。
		 */
		protected void callAllocSrchSV() {

			if (MSC_STK_INFO_SRCH_TYP.isVMI(up0().stk_info_srch_typ())
				|| !up0().stk_insp_typ_fin_flg()
				|| !up0().stk_id_typ_accpt_dfct_flg() && !up0().stk_id_typ_costk_flg() && !up0().stk_id_typ_cststk_flg()
					&& !up0().stk_id_typ_ncv_rcv_flg() && !up0().stk_id_typ_onr_prov_flg() && !up0().stk_id_typ_rnt_rcv_flg()
					) {
				return;
			}

			// ワークデータ作成
			doInsItm();
			doInsLoc();

			// キャッシュ取得
			getCache();

			// 引当管理サービスの「使用可能在庫検索」処理で、選択可能な在庫データを取得する。
			MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv = MSBEL_AllocMngService.crtAlloc_Avl_Srch01();
			execAllocSv(avl01Sv);

			// 検索結果の受け取り
			setDown(avl01Sv);

			// キャッシュ設定
			setCache();
		}

		protected void doInsItm() {
			execDbWkDelete("MSBEL0500_MSW_ALLOC_ITM_D01", MSW_ALLOC_ITM_R.create("T"));
			executeUpdate(replaceSql(MSBEL0500_MSW_ALLOC_ITM_I01()), up0());
		}

		protected void doInsLoc() {
			dbWkDelete("MSBEL0500_MSW_ALLOC_LOCK_KEY_D01", MST_ALLOC_LOCK_R.create());
			executeUpdate(replaceSql(MSBEL0500_MSW_ALLOC_LOCK_KEY_I01()), up0());
		}

		protected void getCache() {
			// キャッシュデータの取得
			MCList<Srch01_RsltR> cacheDataL = MCList.create(Srch01_RsltR.class);
			executeQuery(cacheDataL, replaceSql(MSBEL0500_MSVT_AVL_STK_CACHE_S01()), up0());
			// キャッシュデータの保持
			saveCacheData(cacheDataL);
		}

		protected void saveCacheData(MCList<Srch01_RsltR> cacheDataL) {
			if (isNull(cacheDataL)) {
				return;
			}

			String key;
			for (Srch01_RsltR cR : cacheDataL) {
				// 品目キャッシュ
				key = getItmKey(cR);
				if (key != null && !_itmCache.containsKey(key)) {
					_itmCache.put(key, cR);
				}
				// 諸口品キャッシュ
				key = getSundryItmKey(cR);
				if (key != null && !_sundryItmCache.containsKey(key) && !isNull(cR.sundry_itm_nm())) {
					_sundryItmCache.put(key, cR);
				}
				// 場所キャッシュ
				key = getLocKey(cR);
				if (key != null && !_locCache.containsKey(key)) {
					_locCache.put(key, cR);
				}
				// 案件ＮＯキャッシュ
				key = cR.sno1();
				if (key != null && !_wrkCache.containsKey(key)) {
					_wrkCache.put(key, cR);
				}
				// 棚・ラインキャッシュ
				key = getStrLnKey(cR);
				if (key != null && !_strLnCache.containsKey(key)) {
					_strLnCache.put(key, cR.str_ln_nm());
				}
				// 格付キャッシュ
				key = cR.gd_cd();
				if (key != null && !_gdCache.containsKey(key)) {
					_gdCache.put(key, cR.gd_nm());
				}
				// 在庫着荷先キャッシュ
				key = cR.stk_arrv_bp_cd();
				if (key != null && !_stkArrvCache.containsKey(key)) {
					_stkArrvCache.put(key, cR.stk_arrv_bp_nm());
				}
				// 在庫取引先キャッシュ
				key = cR.stk_bp_cd();
				if (key != null && !_stkBpCache.containsKey(key)) {
					_stkBpCache.put(key, cR.stk_bp_nm());
				}
				// 単位キャッシュ
				key = cR.base_unit_cd();
				if (key != null && !_unitCache.containsKey(key)) {
					_unitCache.put(key, cR.base_unit_nm());
				}
				key = cR.pack_unit_cd();
				if (key != null && !_unitCache.containsKey(key)) {
					_unitCache.put(key, cR.pack_unit_nm());
				}
				key = cR.cont_fctr_unit_cd();
				if (key != null && !_unitCache.containsKey(key)) {
					_unitCache.put(key, cR.cont_fctr_unit_nm());
				}
			}
		}

		protected String getItmKey(Srch01_RsltR cR) {
			return MCStringUtil.arrayValueJoin(
					cR.itm_cd(),
					cR.itm_sub1(),
					cR.itm_sub2(),
					cR.itm_sub3()
				);
		}

		protected String getSundryItmKey(Srch01_RsltR cR) {
			return MCStringUtil.arrayValueJoin(
					cR.itm_cd(),
					cR.itm_sub1(),
					cR.itm_sub2(),
					cR.itm_sub3(),
					cR.sno1(),
					cR.sno2(),
					cR.sno3(),
					cR.sno4()
				);
		}

		protected String getLocKey(Srch01_RsltR cR) {
			return MCStringUtil.arrayValueJoin(
					cR.loc_cd()
				);
		}

		protected String getStrLnKey(Srch01_RsltR cR) {
			return MCStringUtil.arrayValueJoin(
					cR.loc_cd(),
					cR.str_ln_cd()
				);
		}

		protected void execAllocSv(MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv) {
			avl01Sv.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			avl01Sv.up0().all_pri_flg(false);
			avl01Sv.up0().except_alloc_wait_flg(up0().except_alloc_wait_flg());
			avl01Sv.up0().except_zero_flg(false);
			avl01Sv.up0().dt_fr(up0().schd_dt_fr());
			avl01Sv.up0().dt_to(up0().schd_dt_to());
			avl01Sv.up0().alloc_grp_srch_flg(up0().grs_alloc_flg());
			avl01Sv.up0().dtl_calc_flg(true);
			avl01Sv.up4().lot_no(up0().lot_no());
			avl01Sv.up4().sublot_no(up0().sublot_no());
			avl01Sv.up4().ver_no(up0().ver_no());
			avl01Sv.up4().bp_lot_no(up0().bp_lot_no());
			avl01Sv.up4().str_ln_cd(up0().str_ln_cd());
			avl01Sv.up4().str_ln_nm(up0().str_ln_nm());
			avl01Sv.up4().stk_arrv_bp_cd(up0().stk_arrv_bp_cd());
			avl01Sv.up4().stk_arrv_bp_nm(up0().stk_arrv_bp_nm());
			avl01Sv.up4().pack_unit_cd(up0().pack_unit_cd());
			avl01Sv.up4().pack_unit_nm(up0().pack_unit_nm());
			avl01Sv.exec();
		}

		protected void setDown(MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv) {
			boolean plntAprvStsTypFlg = up0().plnt_aprv_sts_typ_opn_flg()
					&& up0().plnt_aprv_sts_typ_acpt_flg()
					&& up0().plnt_aprv_sts_typ_rjct_flg()
					&& up0().plnt_aprv_sts_typ_non_flg();
			boolean mrktJudgStsTypFlg = up0().mrkt_judg_sts_typ_opn_flg()
					&& up0().mrkt_judg_sts_typ_acpt_flg()
					&& up0().mrkt_judg_sts_typ_not_acpt_flg()
					&& up0().mrkt_judg_sts_typ_non_flg();

			addAll(down0(), avl01Sv.down0().subList(crtCndMatcher(up0(), plntAprvStsTypFlg, mrktJudgStsTypFlg)), createMap_Srch01_RsltR_Avl_ListR());
			addAll(down0(), avl01Sv.down1().subList(crtCndMatcher(up0(), plntAprvStsTypFlg, mrktJudgStsTypFlg)), createMap_Srch01_RsltR_Avl_ListR());
			addAll(down0(), avl01Sv.down2().subList(crtCndMatcher(up0(), plntAprvStsTypFlg, mrktJudgStsTypFlg)), createMap_Srch01_RsltR_Avl_ListR());
			addAll(down0(), avl01Sv.down3().subList(crtCndMatcher(up0(), plntAprvStsTypFlg, mrktJudgStsTypFlg)), createMap_Srch01_RsltR_Avl_ListR());
		}

		protected cndMatcher crtCndMatcher(Srch01_CndR up, boolean plntAprvStsTypFlg, boolean mrktJudgStsTypFlg) {
			return new cndMatcher(up, plntAprvStsTypFlg, mrktJudgStsTypFlg);
		}

		public class cndMatcher implements MCRowMatcher<Avl_ListR> {

			Srch01_CndR _up = Srch01_CndR.create();
			boolean _plntAprvStsTypFlg;
			boolean _mrktJudgStsTypFlg;

			public cndMatcher(Srch01_CndR cndR, boolean plntAprvStsTypFlg, boolean mrktJudgStsTypFlg) {
				_up = cndR;
				_plntAprvStsTypFlg = plntAprvStsTypFlg;
				_mrktJudgStsTypFlg = mrktJudgStsTypFlg;
			}

			public boolean match(Avl_ListR row) {

				if (isNull(_up.getString("unreg_lmt_true"))) {
					if (!matchDt(row)) {
						return false;
					}
				}
				else {
					if (!row.unreg_lmt_flg()) {
						if (!matchDt(row)) {
							return false;
						}
					}
				}
				if (!isNull(_up.first_gr_dt_fr()) && !_up.first_gr_dt_fr().lte(row.first_gr_dt())) {
					return false;
				}
				if (!isNull(_up.first_gr_dt_to()) && !_up.first_gr_dt_to().gte(row.first_gr_dt())) {
					return false;
				}
				// 工場出荷承認状況区分
				if (!_plntAprvStsTypFlg) {
					if (!_up.plnt_aprv_sts_typ_opn_flg() && MSC_PLNT_APRV_STS_TYP.isOPN(row.plnt_aprv_sts_typ())) {
						return false;
					}
					if (!_up.plnt_aprv_sts_typ_acpt_flg() && MSC_PLNT_APRV_STS_TYP.isACPT(row.plnt_aprv_sts_typ())) {
						return false;
					}
					if (!_up.plnt_aprv_sts_typ_rjct_flg() && MSC_PLNT_APRV_STS_TYP.isRJCT(row.plnt_aprv_sts_typ())) {
						return false;
					}
					if (!_up.plnt_aprv_sts_typ_non_flg() && isNull(row.plnt_aprv_sts_typ())) {
						return false;
					}
				}
				// 市場出荷判定状況区分
				if (!_mrktJudgStsTypFlg) {
					if (!_up.mrkt_judg_sts_typ_opn_flg() && MSC_MRKT_JUDG_STS_TYP.isOPN(row.mrkt_judg_sts_typ())) {
						return false;
					}
					if (!_up.mrkt_judg_sts_typ_acpt_flg() && MSC_MRKT_JUDG_STS_TYP.isACPT(row.mrkt_judg_sts_typ())) {
						return false;
					}
					if (!_up.mrkt_judg_sts_typ_not_acpt_flg() && MSC_MRKT_JUDG_STS_TYP.isNOT_ACPT(row.mrkt_judg_sts_typ())) {
						return false;
					}
					if (!_up.mrkt_judg_sts_typ_non_flg() && isNull(row.mrkt_judg_sts_typ())) {
						return false;
					}
				}
				if (!(MSC_SCHD_STK_TYP.isSTK(row.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isTGT_GR_SCHD(row.schd_stk_typ())
						|| MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(row.schd_stk_typ()))) {
					if (row.pack_alloc_flg()) {
						if (row.pack_unit_qty().isZero()) {
							return false;
						}
					}
					else {
						if (row.base_unit_qty().isZero()) {
							return false;
						}
					}
				}
				return true;
			}

			protected boolean matchDt(Avl_ListR row) {
				if (!isNull(_up.vld_dt_fr()) && !_up.vld_dt_fr().lte(row.vld_dt())) {
					return false;
				}
				if (!isNull(_up.vld_dt_to()) && !_up.vld_dt_to().gte(row.vld_dt())) {
					return false;
				}
				if (!isNull(_up.lmt_dt_fr()) && !_up.lmt_dt_fr().lte(row.lmt_dt())) {
					return false;
				}
				if (!isNull(_up.lmt_dt_to()) && !_up.lmt_dt_to().gte(row.lmt_dt())) {
					return false;
				}
				return true;
			}
		}

		protected void setCache() {
			if (isNull(down0())) {
				return;
			}

			for (Srch01_RsltR dR : down0()) {
				// キャッシュデータにより補完
				addDownCacheDate(dR);
				// 実際有効成分の設定
				setActContQty(dR);
				// 標準有効成分の設定
				setStdContQty(dR);
			}
		}

		protected void addDownCacheDate(Srch01_RsltR dR) {
			// 品目関連
			addItmCacheData(dR);
			// 諸口品関連
			addSundryItmCacheData(dR);
			// 場所関連
			addLocCacheData(dR);
			// 案件ＮＯ
			addWrkCacheData(dR);
			// マスタ名
			addMstNameCacheData(dR);
			// 単位名
			addUnitNameCacheData(dR);
		}

		protected void addItmCacheData(Srch01_RsltR dR) {
			Srch01_RsltR cR = _itmCache.get(getItmKey(dR));
			if (cR != null) {
				dR.itm_nm(cR.itm_nm());                                   // 品名
				dR.cont_fctr_unit_cd(cR.cont_fctr_unit_cd());             // 有効成分単位ＣＤ
			}
		}

		protected void addSundryItmCacheData(Srch01_RsltR dR) {
			Srch01_RsltR cR = _sundryItmCache.get(getSundryItmKey(dR));
			if (cR != null) {
				dR.itm_nm(cR.sundry_itm_nm());                            // 品名
			}
		}

		protected void addLocCacheData(Srch01_RsltR dR) {
			Srch01_RsltR cR = _locCache.get(getLocKey(dR));
			if (cR != null) {
				dR.loc_cd(cR.loc_cd());                                   // 場所ＣＤ
				dR.loc_nm(cR.loc_nm());                                   // 場所名
				dR.wg_cd(cR.wg_cd());                                     // ワーキンググループＣＤ
				dR.wg_nm(cR.wg_nm());                                     // ワーキンググループ名
				dR.site_cd(cR.site_cd());                                 // 工場・物流倉庫ＣＤ
				dR.site_nm(cR.site_nm());                                 // 工場・物流倉庫名
				dR.lg_grp_cd(cR.lg_grp_cd());                             // 物流グループＣＤ
				dR.lg_grp_nm(cR.lg_grp_nm());                             // 物流グループ名
				dR.alloc_grp_cd(cR.alloc_grp_cd());                       // 総量引当場所グループＣＤ
				dR.alloc_grp_nm(cR.alloc_grp_nm());                       // 総量引当場所グループ名
				dR.loc_grp_cd(cR.loc_grp_cd());                           // 製造場所グループＣＤ
				dR.loc_grp_nm(cR.loc_grp_nm());                           // 製造場所グループ名
			}
		}

		protected void addWrkCacheData(Srch01_RsltR dR) {
			Srch01_RsltR cR = _wrkCache.get(dR.sno1());
			if (cR != null) {
				dR.wrk_no(cR.wrk_no());                                   // 案件ＮＯ
				dR.wrk_nm(cR.wrk_nm());                                   // 案件名
			}
		}

		protected void addMstNameCacheData(Srch01_RsltR dR) {
			dR.gd_nm(_gdCache.get(dR.gd_cd()));                           // 格付名
			dR.str_ln_nm(_strLnCache.get(getStrLnKey(dR)));               // 棚・ライン名
			dR.stk_bp_nm(_stkBpCache.get(dR.stk_bp_cd()));                // 在庫取引先名
			dR.stk_arrv_bp_nm(_stkArrvCache.get(dR.stk_arrv_bp_cd()));    // 在庫着荷先名
		}

		protected void addUnitNameCacheData(Srch01_RsltR dR) {
			dR.base_unit_nm(_unitCache.get(dR.base_unit_cd()));           // 基準単位名
			dR.pack_unit_nm(_unitCache.get(dR.pack_unit_cd()));           // 荷姿単位名
			dR.cont_fctr_unit_nm(_unitCache.get(dR.cont_fctr_unit_cd())); // 有効成分単位名
		}

		protected void setActContQty(Srch01_RsltR dR) {
			MCNumber contQty;
			if (dR.cont_fctr_flg()) {
				contQty = convToContFctrUnit(dR.base_stk_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.stk_act_cont_qty(contQty);       // 実際有効成分（在庫）
				contQty = convToContFctrUnit(dR.base_gr_schd_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.schd_act_cont_qty(contQty);      // 実際有効成分（入庫）
				contQty = convToContFctrUnit(dR.base_alloc_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.alloc_act_cont_qty(contQty);     // 実際有効成分（引当）
				contQty = convToContFctrUnit(dR.base_wait_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.wait_act_cont_qty(contQty);      // 実際有効成分（保留）
				contQty = convToContFctrUnit(dR.base_alloc_avl_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.avl_act_cont_qty(contQty);       // 実際有効成分（引当可）
				dR.lot_avl_act_cont_qty(convToContFctrUnit(dR.base_lot_alloc_avl_qty(), dR.act_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ()));
			}
		}

		protected void setStdContQty(Srch01_RsltR dR) {
			MCNumber contQty;
			if (dR.cont_fctr_flg()) {
				contQty = convToContFctrUnit(dR.base_stk_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.stk_std_cont_qty(contQty);       // 標準有効成分（在庫）
				contQty = convToContFctrUnit(dR.base_gr_schd_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.schd_std_cont_qty(contQty);      // 標準有効成分（入庫）
				contQty = convToContFctrUnit(dR.base_alloc_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.alloc_std_cont_qty(contQty);     // 標準有効成分（引当）
				contQty = convToContFctrUnit(dR.base_wait_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.wait_std_cont_qty(contQty);      // 標準有効成分（保留）
				contQty = convToContFctrUnit(dR.base_alloc_avl_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ());
				dR.avl_std_cont_qty(contQty);       // 標準有効成分（引当可）
				dR.lot_avl_std_cont_qty(convToContFctrUnit(dR.base_lot_alloc_avl_qty(), dR.std_cont_fctr(), dR.cont_fctr_dec_place(), dR.cont_fctr_rnd_typ()));
			}
		}

		/**
		 * 使用可能在庫以外の在庫を取得する
		 */
		protected void addDown() {
			if (MSC_STK_INFO_SRCH_TYP.isAVL(up0().stk_info_srch_typ())) {
				return;
			}

			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);
			executeQuery(list, replaceSqlAdd(MSBEL0500_MST_STK_S01()), up0());
			down0().addAll(list);
		}

		/**
		 * 下り電文のグループ化編集処理を行う。
		 */
		protected void editDown() {
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(getGroupByCols());
			gp.sum(getSumCols());

			// 棚・ラインの無しチェック
			for (Srch01_RsltR r : down0()) {
				if (isNull(r.str_ln_cd()) || MAC_STR.isNULL_VAL(r.str_ln_cd())) {
					r.str_ln_cd_none_flg(true);
				}
			}

			MCList<Srch01_RsltR> gbL = down0().groupBy(gp);

			if (up0().positive_flg() || !up0().stk_schd_flg()) {
				down0().clear();
				for (Srch01_RsltR rR : gbL) {
					// 引当可能数が０より大きいもののみを取得する場合
					if (up0().positive_flg()) {
						if (isNull(rR.base_alloc_avl_qty()) || !rR.base_alloc_avl_qty().isPositive()) {
							continue;
						}
					}
					// 在庫数量が０より大きいもののみを取得する場合
					 if (!up0().stk_schd_flg()) {
						if (isNull(rR.base_stk_qty()) || !rR.base_stk_qty().isPositive()) {
							continue;
						}
					 }
					down0().add(rR);
				}
			}
			else {
				down0().setAll(gbL);
			}
		}

		/**
		 * 下り電文をソートする
		 */
		protected void sortDown() {
			// ソート項目取得（非表示項目を除く）
			String[] sortCols = MCCollectionUtil.remove(getSortCols(), new String[0], getRemoveCols());

			// ソートする。
			down0().sort(sortCols);
		}

		/**
		 * グループ化項目の配列を取得する。
		 * @return 項目配列
		 */
		protected String[] getGroupByCols() {
			// 全グループ化対象項目から、画面上で外した項目を除外する
			if (_grpCols == null ) {
				_grpCols = MCCollectionUtil.remove(getOrgGroupByCols(), new String[0], getRemoveCols());
			}

			return _grpCols;
		}

		protected String[] getOrgGroupByCols() {
			return new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$wg_nm,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$itm_nm,
					Srch01_RsltR.$ver_no,
					Srch01_RsltR.$lot_no,
					Srch01_RsltR.$sublot_no,
					Srch01_RsltR.$bp_lot_no,
					Srch01_RsltR.$loc_cd,
					Srch01_RsltR.$loc_nm,
					Srch01_RsltR.$str_ln_cd,
					Srch01_RsltR.$str_ln_nm,
					Srch01_RsltR.$str_ln_cd_none_flg,
					Srch01_RsltR.$site_cd,
					Srch01_RsltR.$site_nm,
					Srch01_RsltR.$lg_grp_cd,
					Srch01_RsltR.$lg_grp_nm,
					Srch01_RsltR.$alloc_grp_cd,
					Srch01_RsltR.$alloc_grp_nm,
					Srch01_RsltR.$loc_grp_cd,
					Srch01_RsltR.$loc_grp_nm,
					Srch01_RsltR.$gd_cd,
					Srch01_RsltR.$gd_nm,
					Srch01_RsltR.$in_xfr_typ,
					Srch01_RsltR.$in_xfr_typ_nm,
					Srch01_RsltR.$quality_typ,
					Srch01_RsltR.$quality_typ_nm,
					Srch01_RsltR.$stk_insp_typ,
					Srch01_RsltR.$stk_insp_typ_nm,
					Srch01_RsltR.$sno1,
					Srch01_RsltR.$sno2,
					Srch01_RsltR.$sno3,
					Srch01_RsltR.$sno4,
					Srch01_RsltR.$wrk_no,
					Srch01_RsltR.$wrk_nm,
					Srch01_RsltR.$stk_id_typ,
					Srch01_RsltR.$stk_id_typ_nm,
					Srch01_RsltR.$stk_bp_cd,
					Srch01_RsltR.$stk_bp_nm,
					Srch01_RsltR.$asst_typ,
					Srch01_RsltR.$asst_typ_nm,
					Srch01_RsltR.$fix_no_typ,
					Srch01_RsltR.$fix_no_typ_nm,
					Srch01_RsltR.$fix_no,
					Srch01_RsltR.$stk_arrv_bp_cd,
					Srch01_RsltR.$stk_arrv_bp_nm,
					Srch01_RsltR.$pack_unit_cd,
					Srch01_RsltR.$pack_unit_nm,
					Srch01_RsltR.$pack_unit_dec_place,
					Srch01_RsltR.$pack_unit_rnd_typ,
					Srch01_RsltR.$conv_base_qty,
					Srch01_RsltR.$conv_qty,
					Srch01_RsltR.$base_unit_cd,
					Srch01_RsltR.$base_unit_nm,
					Srch01_RsltR.$base_unit_dec_place,
					Srch01_RsltR.$base_unit_rnd_typ,
					Srch01_RsltR.$act_cont_fctr,
					Srch01_RsltR.$cont_fctr_unit_cd,
					Srch01_RsltR.$cont_fctr_unit_nm,
					Srch01_RsltR.$std_cont_fctr,
					Srch01_RsltR.$cont_fctr_flg,
					Srch01_RsltR.$cont_fctr_dec_place,
					Srch01_RsltR.$cont_fctr_rnd_typ,
					Srch01_RsltR.$first_gr_dt,
					Srch01_RsltR.$unreg_lmt_flg,
					Srch01_RsltR.$vld_dt,
					Srch01_RsltR.$lmt_dt,
					Srch01_RsltR.$plnt_aprv_sts_typ,
					Srch01_RsltR.$plnt_aprv_sts_typ_nm,
					Srch01_RsltR.$mrkt_judg_sts_typ,
					Srch01_RsltR.$mrkt_judg_sts_typ_nm,
					Srch01_RsltR.$schd_dt,
			};
		}

		protected String[] getSumCols() {
			return new String[] {
					Srch01_RsltR.$pack_stk_qty,
					Srch01_RsltR.$pack_gr_schd_qty,
					Srch01_RsltR.$pack_alloc_qty,
					Srch01_RsltR.$pack_wait_qty,
					Srch01_RsltR.$pack_alloc_avl_qty,
					Srch01_RsltR.$pack_lot_alloc_avl_qty,
					Srch01_RsltR.$base_stk_qty,
					Srch01_RsltR.$base_gr_schd_qty,
					Srch01_RsltR.$base_alloc_qty,
					Srch01_RsltR.$base_wait_qty,
					Srch01_RsltR.$base_lot_alloc_avl_qty,
					Srch01_RsltR.$base_alloc_avl_qty,
					Srch01_RsltR.$stk_act_cont_qty,
					Srch01_RsltR.$schd_act_cont_qty,
					Srch01_RsltR.$alloc_act_cont_qty,
					Srch01_RsltR.$wait_act_cont_qty,
					Srch01_RsltR.$lot_avl_act_cont_qty,
					Srch01_RsltR.$avl_act_cont_qty,
					Srch01_RsltR.$stk_std_cont_qty,
					Srch01_RsltR.$schd_std_cont_qty,
					Srch01_RsltR.$alloc_std_cont_qty,
					Srch01_RsltR.$wait_std_cont_qty,
					Srch01_RsltR.$lot_avl_std_cont_qty,
					Srch01_RsltR.$avl_std_cont_qty
			};
		}

		protected String[] getSortCols() {
			return new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$lot_no,
					Srch01_RsltR.$sublot_no,
					Srch01_RsltR.$loc_cd,
					Srch01_RsltR.$str_ln_cd,
					Srch01_RsltR.$site_cd,
					Srch01_RsltR.$lg_grp_cd,
					Srch01_RsltR.$alloc_grp_cd,
					Srch01_RsltR.$loc_grp_cd,
					Srch01_RsltR.$gd_cd,
					Srch01_RsltR.$in_xfr_typ,
					Srch01_RsltR.$quality_typ,
					Srch01_RsltR.$stk_insp_typ,
					Srch01_RsltR.$sno1,
					Srch01_RsltR.$sno2,
					Srch01_RsltR.$sno3,
					Srch01_RsltR.$sno4,
					Srch01_RsltR.$stk_id_typ,
					Srch01_RsltR.$stk_bp_cd,
					Srch01_RsltR.$asst_typ,
					Srch01_RsltR.$fix_no_typ,
					Srch01_RsltR.$fix_no,
					Srch01_RsltR.$stk_arrv_bp_cd,
					Srch01_RsltR.$pack_unit_cd
			};
		}

		/**
		 * 非表示項目（画面で指定したグループ化対象外項目）
		 * @return 項目配列
		 */
		protected String[] getRemoveCols() {
			if (_removeCols == null) {
				List<String> removeArray = getRemoveArray();
				_removeCols = removeArray.toArray(new String[0]);
			}

			return _removeCols;
		}

		protected List<String> getRemoveArray() {
			List<String> removeArray = new ArrayList<String>();

			setRemoveArrayWg(removeArray);
			setRemoveArrayVer(removeArray);
			setRemoveArrayLot(removeArray);
			setRemoveArrayLoc(removeArray);
			setRemoveArraySite(removeArray);
			setRemoveArrayLgGrp(removeArray);
			setRemoveArrayAllocGrp(removeArray);
			setRemoveArrayLocGrp(removeArray);
			setRemoveArrayGd(removeArray);
			setRemoveArraySno1(removeArray);
			setRemoveArraySno2(removeArray);
			setRemoveArraySno3(removeArray);
			setRemoveArraySno4(removeArray);
			setRemoveArrayStkId(removeArray);
			setRemoveArrayFixNo(removeArray);
			setRemoveArraySchdDt(removeArray);

			return removeArray;
		}

		protected void setRemoveArrayWg(List<String> removeArray) {
			if (!up0().wg_flg()) {
				removeArray.add(Srch01_RsltR.$wg_cd);
				removeArray.add(Srch01_RsltR.$wg_nm);
			}
		}

		protected void setRemoveArrayVer(List<String> removeArray) {
			if (!up0().ver_flg()) {
				removeArray.add(Srch01_RsltR.$ver_no);
			}
		}

		protected void setRemoveArrayLot(List<String> removeArray) {
			if (!up0().lot_flg()) {
				removeArray.add(Srch01_RsltR.$lot_no);
				removeArray.add(Srch01_RsltR.$sublot_no);
				removeArray.add(Srch01_RsltR.$bp_lot_no);
				removeArray.add(Srch01_RsltR.$first_gr_dt);
				removeArray.add(Srch01_RsltR.$unreg_lmt_flg);
				removeArray.add(Srch01_RsltR.$vld_dt);
				removeArray.add(Srch01_RsltR.$lmt_dt);
				removeArray.add(Srch01_RsltR.$plnt_aprv_sts_typ);
				removeArray.add(Srch01_RsltR.$mrkt_judg_sts_typ);
			}
		}

		protected void setRemoveArrayLoc(List<String> removeArray) {
			if (!up0().loc_flg()) {
				removeArray.add(Srch01_RsltR.$loc_cd);
				removeArray.add(Srch01_RsltR.$loc_nm);
				removeArray.add(Srch01_RsltR.$str_ln_cd);
				removeArray.add(Srch01_RsltR.$str_ln_nm);
				removeArray.add(Srch01_RsltR.$str_ln_cd_none_flg);
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_nm);
			}
		}

		protected void setRemoveArraySite(List<String> removeArray) {
			if (!up0().site_flg()) {
				removeArray.add(Srch01_RsltR.$site_cd);
				removeArray.add(Srch01_RsltR.$site_nm);
			}
		}

		protected void setRemoveArrayLgGrp(List<String> removeArray) {
			if (!up0().lg_grp_flg()) {
				removeArray.add(Srch01_RsltR.$lg_grp_cd);
				removeArray.add(Srch01_RsltR.$lg_grp_nm);
			}
		}

		protected void setRemoveArrayAllocGrp(List<String> removeArray) {
			if (!up0().alloc_grp_flg()) {
				removeArray.add(Srch01_RsltR.$alloc_grp_cd);
				removeArray.add(Srch01_RsltR.$alloc_grp_nm);
			}
		}

		protected void setRemoveArrayLocGrp(List<String> removeArray) {
			if (!up0().loc_grp_flg()) {
				removeArray.add(Srch01_RsltR.$loc_grp_cd);
				removeArray.add(Srch01_RsltR.$loc_grp_nm);
			}
		}

		protected void setRemoveArrayGd(List<String> removeArray) {
			if (!up0().gd_flg()) {
				removeArray.add(Srch01_RsltR.$gd_cd);
				removeArray.add(Srch01_RsltR.$gd_nm);
			}
		}

		protected void setRemoveArraySno1(List<String> removeArray) {
			if (!up0().sno1_flg()) {
				removeArray.add(Srch01_RsltR.$sno1);
				removeArray.add(Srch01_RsltR.$wrk_no);
				removeArray.add(Srch01_RsltR.$wrk_nm);
			}
		}

		protected void setRemoveArraySno2(List<String> removeArray) {
			if (!up0().sno2_flg()) {
				removeArray.add(Srch01_RsltR.$sno2);
			}
		}

		protected void setRemoveArraySno3(List<String> removeArray) {
			if (!up0().sno3_flg()) {
				removeArray.add(Srch01_RsltR.$sno3);
			}
		}

		protected void setRemoveArraySno4(List<String> removeArray) {
			if (!up0().sno4_flg()) {
				removeArray.add(Srch01_RsltR.$sno4);
			}
		}

		protected void setRemoveArrayStkId(List<String> removeArray) {
			if (!up0().stk_id_flg()) {
				removeArray.add(Srch01_RsltR.$stk_id_typ);
				removeArray.add(Srch01_RsltR.$stk_id_typ_nm);
				removeArray.add(Srch01_RsltR.$stk_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_bp_nm);
				removeArray.add(Srch01_RsltR.$asst_typ);
				removeArray.add(Srch01_RsltR.$asst_typ_nm);
			}
		}

		protected void setRemoveArrayFixNo(List<String> removeArray) {
			if (!up0().fix_no_flg()) {
				removeArray.add(Srch01_RsltR.$fix_no_typ);
				removeArray.add(Srch01_RsltR.$fix_no_typ_nm);
				removeArray.add(Srch01_RsltR.$fix_no);
			}
		}

		protected void setRemoveArraySchdDt(List<String> removeArray) {
			if (!up0().schd_dt_flg()) {
				removeArray.add(Srch01_RsltR.$schd_dt);
			}
		}

		protected MCQueryPlan replaceSql(MCQueryPlan sql) {
			return replaceLoc(replaceItm(sql));
		}

		protected MCQueryPlan replaceSqlAdd(MCQueryPlan sql) {
			return replaceSrch(replaceLoc(replaceItm(sql)));
		}
		
		protected MCQueryPlan replaceItm(MCQueryPlan sql) {
			MCDynamicSQLID REP_ITM = createDynamicSQLID("REP_ITM");
			List<MCDynamicSQLInfo> infoList = new ArrayList<>();
			MAM_ITM_R S0M6 = MAM_ITM_R.create("M6");
			
			if (MSC_STK_INFO_ITM_TYP.isNOT_ASSET3(up0().stk_info_itm_typ())) {
				infoList.add(when(null).predicate(REP_ITM,
						p -> p.and(S0M6.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
								.and(S0M6.asset_mng_typ.neq(value(MAC_ASSET_MNG_TYP.PHANTOM.value())))));
			}
			else {
				String stkMngTyp = MSC_STK_INFO_ITM_TYP.stk_mng_typ(up0().stk_info_itm_typ());
				if (!isNull(stkMngTyp)) {
					infoList.add(when(null).predicate(REP_ITM,
							p -> p.and(S0M6.stk_mng_typ.eq(value(stkMngTyp)))));
				}
				String assetMngTyp = MSC_STK_INFO_ITM_TYP.asset_mng_typ(up0().stk_info_itm_typ());
				if (!isNull(assetMngTyp)) {
					infoList.add(when(null).predicate(REP_ITM,
							p -> p.and(S0M6.stk_mng_typ.eq(value(assetMngTyp)))));
				}
			}
			return sql.addDynamicSQLInfo(infoList.toArray(new MCDynamicSQLInfo[0]));
		}
		
		protected MCQueryPlan replaceLoc(MCQueryPlan sql) {
			List<MCDynamicSQLInfo> infoList = new ArrayList<MCDynamicSQLInfo>();
			MCDynamicSQLID REP_LOC = createDynamicSQLID("REP_LOC");
			MAVM_RD_LOC_R S0M0 = MAVM_RD_LOC_R.create("M0");
			MAM_SLO_ALLOC_R SLO_ALLOC = MAM_SLO_ALLOC_R.create("SLO_ALLOC");
			MAM_ITM_R S0M6 = MAM_ITM_R.create("M6");
			MST_STK_R S0T1 = MST_STK_R.create("T1");

			if (MSC_STK_INFO_LOC_TYP.isHOUSE(up0().stk_info_loc_typ())) {
				infoList.add(when(null).predicate(REP_LOC, p -> p.and(S0M0.sppl_cd.isNull())));
			}
			else if (MSC_STK_INFO_LOC_TYP.isOUTSIDE(up0().stk_info_loc_typ())) {
				infoList.add(when(null).predicate(REP_LOC, p -> p.and(S0M0.sppl_cd.isNotNull())));
			}
			else if (MSC_STK_INFO_LOC_TYP.isSLO_LOC(up0().stk_info_loc_typ())) {
				infoList.add(when(null).predicate(REP_LOC, p -> p.and(exists(subQuery()
						.select(value("X"))
						.from(SLO_ALLOC)
						.where(value(0).eq(value(0))
								.and(bracket(SLO_ALLOC.to_lg_grp_cd.eq(bind("slo_lg_grp_cd"))
										.or(SLO_ALLOC.to_lg_grp_cd.eq(value(MAC_STR.NULL_VAL.value())))))
								.and(bracket(SLO_ALLOC.itm_ship_grp_cd.eq(S0M6.itm_ship_grp_cd)
										.or(SLO_ALLOC.itm_ship_grp_cd.eq(value(MAC_STR.NULL_VAL.value())))))
								.and(bracket(SLO_ALLOC.wg_cd.eq(bind("slo_wg_cd"))
										.or(SLO_ALLOC.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))))
								.and(bracket(SLO_ALLOC.alloc_grp_cd.eq(S0M0.alloc_grp_cd)
										.or(SLO_ALLOC.lg_grp_cd.eq(S0M0.lg_grp_cd))
										.or(SLO_ALLOC.ship_loc_cd.eq(S0T1.loc_cd)))))))));
			}
			return sql.addDynamicSQLInfo(infoList.toArray(new MCDynamicSQLInfo[0]));
		}

		protected MCQueryPlan replaceSrch(MCQueryPlan sql) {
			List<MCDynamicSQLInfo> infoList = new ArrayList<MCDynamicSQLInfo>();
			MCDynamicSQLID REP_SRCH = createDynamicSQLID("REP_SRCH");
			MST_STK_R S0T1 = MST_STK_R.create("T1");
			MAM_LOC_R S0M3 = MAM_LOC_R.create("M3");

			// 貸出在庫は「在庫着荷先が納品先、在庫識別区分が自社在庫、確定ＮＯ区分がなし」
			if (MSC_STK_INFO_SRCH_TYP.isVMI(up0().stk_info_srch_typ())) {
				infoList.add(when(null).predicate(REP_SRCH,
						p -> p.and(S0M3.sppl_cd.isNull())
						.and(S0T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
						.and(S0T1.stk_id_typ.eq(value(MSC_STK_ID_TYP.COSTK.value())))
						.and(S0T1.fix_no_typ.eq(value(MSC_FIX_NO_TYP.NON.value())))));
			}
			// 在庫調整は「在庫着荷先が納品先、あるいは確定ＮＯ区分がなし以外の在庫」
			else if (MSC_STK_INFO_SRCH_TYP.isSTK_ADJST(up0().stk_info_srch_typ())) {
				infoList.add(when(null).predicate(REP_SRCH,
						p -> p.and(bracket(S0M3.sppl_cd.isNull()
								.and(S0T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
								.or(S0T1.fix_no_typ.neq(value(MSC_FIX_NO_TYP.NON.value())))))));
			}
			// 使用可能在庫以外の在庫を取得する
			else {
				infoList.add(when(null).predicate(REP_SRCH,
						// 検査済でない在庫を取得する
						p -> p.and(bracket(S0T1.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.FIN.value()))
								// 返品検収前、仕入検収前の在庫を取得する
								.or(S0T1.stk_id_typ.in(
										value(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value()),
										value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value())))))));
			}
			return sql.addDynamicSQLInfo(infoList.toArray(new MCDynamicSQLInfo[0]));
		}

		protected Map_Srch01_RsltR_Avl_ListR<Srch01_RsltR,Avl_ListR> createMap_Srch01_RsltR_Avl_ListR() {
			return new Map_Srch01_RsltR_Avl_ListR<Srch01_RsltR, Avl_ListR>();
		}

		public class Map_Srch01_RsltR_Avl_ListR<D extends Srch01_RsltR, S extends Avl_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// コメントアウト項目について、呼び出し先サービスにないため、キャッシュ機能で補完する
//				addColumnPathMap(Srch01_RsltR.$wg_cd, Avl_ListR.$wg_cd);                             // ワーキンググループＣＤ
//				addColumnPathMap(Srch01_RsltR.$wg_nm, Avl_ListR.$wg_nm);                             // ワーキンググループ名
				addColumnPathMap(Srch01_RsltR.$itm_cd, Avl_ListR.$itm_cd);                           // 品目ＣＤ
				addColumnPathMap(Srch01_RsltR.$itm_sub1, Avl_ListR.$itm_sub1);                       // 枝番１
				addColumnPathMap(Srch01_RsltR.$itm_sub2, Avl_ListR.$itm_sub2);                       // 枝番２
				addColumnPathMap(Srch01_RsltR.$itm_sub3, Avl_ListR.$itm_sub3);                       // 枝番３
//				addColumnPathMap(Srch01_RsltR.$itm_nm, Avl_ListR.$itm_nm);                           // 品名
				addColumnPathMap(Srch01_RsltR.$ver_no, Avl_ListR.$ver_no);                           // 版ＮＯ
				addColumnPathMap(Srch01_RsltR.$lot_no, Avl_ListR.$lot_no);                           // ロットＮＯ
				addColumnPathMap(Srch01_RsltR.$sublot_no, Avl_ListR.$sublot_no);                     // サブロットＮＯ
				addColumnPathMap(Srch01_RsltR.$loc_cd, Avl_ListR.$stk_loc_cd);                       // 場所ＣＤ
//				addColumnPathMap(Srch01_RsltR.$loc_nm, Avl_ListR.$loc_nm);                           // 場所名
				addColumnPathMap(Srch01_RsltR.$str_ln_cd, Avl_ListR.$stk_str_ln_cd);                 // 棚・ラインＣＤ
//				addColumnPathMap(Srch01_RsltR.$str_ln_nm, Avl_ListR.$str_ln_nm);                     // 棚・ライン名
//				addColumnPathMap(Srch01_RsltR.$site_cd, Avl_ListR.$site_cd);                         // 工場・物流倉庫ＣＤ
//				addColumnPathMap(Srch01_RsltR.$site_nm, Avl_ListR.$site_nm);                         // 工場・物流倉庫名
				addColumnPathMap(Srch01_RsltR.$lg_grp_cd, Avl_ListR.$stk_lg_grp_cd);                 // 物流グループＣＤ
//				addColumnPathMap(Srch01_RsltR.$lg_grp_nm, Avl_ListR.$lg_grp_nm);                     // 物流グループ名
				addColumnPathMap(Srch01_RsltR.$alloc_grp_cd, Avl_ListR.$alloc_grp_cd);               // 総量引当場所グループＣＤ
//				addColumnPathMap(Srch01_RsltR.$alloc_grp_nm, Avl_ListR.$alloc_grp_nm);               // 総量引当場所グループ名
//				addColumnPathMap(Srch01_RsltR.$loc_grp_cd, Avl_ListR.$loc_grp_cd);                   // 製造場所グループＣＤ
//				addColumnPathMap(Srch01_RsltR.$loc_grp_nm, Avl_ListR.$loc_grp_nm);                   // 製造場所グループ名
				addColumnPathMap(Srch01_RsltR.$gd_cd, Avl_ListR.$gd_cd);                             // 格付ＣＤ
//				addColumnPathMap(Srch01_RsltR.$gd_nm, Avl_ListR.$gd_nm);                             // 格付名
				addColumnPathMap(Srch01_RsltR.$in_xfr_typ, Avl_ListR.$in_xfr_typ);                   // 積送品区分
				addColumnPathMap(Srch01_RsltR.$quality_typ, Avl_ListR.$quality_typ);                 // 良品区分
				addColumnPathMap(Srch01_RsltR.$stk_insp_typ, Avl_ListR.$stk_insp_typ);               // 在庫検査区分
				addColumnPathMap(Srch01_RsltR.$sno1, Avl_ListR.$sno1);                               // 手配ＮＯ１
				addColumnPathMap(Srch01_RsltR.$sno2, Avl_ListR.$sno2);                               // 手配ＮＯ２
				addColumnPathMap(Srch01_RsltR.$sno3, Avl_ListR.$sno3);                               // 手配ＮＯ３
				addColumnPathMap(Srch01_RsltR.$sno4, Avl_ListR.$sno4);                               // 手配ＮＯ４
//				addColumnPathMap(Srch01_RsltR.$wrk_no, Avl_ListR.$wrk_no);                           // 案件ＮＯ
//				addColumnPathMap(Srch01_RsltR.$wrk_nm, Avl_ListR.$wrk_nm);                           // 案件名
				addColumnPathMap(Srch01_RsltR.$stk_id_typ, Avl_ListR.$stk_id_typ);                   // 在庫識別区分
				addColumnPathMap(Srch01_RsltR.$stk_bp_cd, Avl_ListR.$stk_bp_cd);                     // 在庫取引先ＣＤ
//				addColumnPathMap(Srch01_RsltR.$stk_bp_nm, Avl_ListR.$stk_bp_nm);                     // 在庫取引先名
				addColumnPathMap(Srch01_RsltR.$asst_typ, Avl_ListR.$asst_typ);                       // 資産区分
//				addColumnPathMap(Srch01_RsltR.$fix_no_typ, Avl_ListR.$fix_no_typ);                   // 確定ＮＯ区分
//				addColumnPathMap(Srch01_RsltR.$fix_no, Avl_ListR.$fix_no);                           // 確定ＮＯ
				addColumnPathMap(Srch01_RsltR.$stk_arrv_bp_cd, Avl_ListR.$stk_arrv_bp_cd);           // 在庫着荷先ＣＤ
//				addColumnPathMap(Srch01_RsltR.$stk_arrv_bp_nm, Avl_ListR.$stk_arrv_bp_nm);           // 在庫着荷先名
				addColumnPathMap(Srch01_RsltR.$pack_unit_cd, Avl_ListR.$pack_unit_cd);               // 荷姿単位ＣＤ
//				addColumnPathMap(Srch01_RsltR.$pack_unit_nm, Avl_ListR.$pack_unit_nm);               // 荷姿単位名
				addColumnPathMap(Srch01_RsltR.$pack_unit_dec_place, Avl_ListR.$pack_unit_dec_place); // 荷姿単位小数部有効桁数
				addColumnPathMap(Srch01_RsltR.$pack_unit_rnd_typ, Avl_ListR.$pack_unit_rnd_typ);     // 荷姿単位端数処理区分
				addColumnPathMap(Srch01_RsltR.$conv_base_qty, Avl_ListR.$conv_base_qty);             // 換算基準数量
				addColumnPathMap(Srch01_RsltR.$conv_qty, Avl_ListR.$conv_qty);                       // 換算数量
				addColumnPathMap(Srch01_RsltR.$base_unit_cd, Avl_ListR.$base_unit_cd);               // 基準単位ＣＤ
				addColumnPathMap(Srch01_RsltR.$base_unit_dec_place, Avl_ListR.$base_unit_dec_place); // 基準単位小数部有効桁数
				addColumnPathMap(Srch01_RsltR.$base_unit_rnd_typ, Avl_ListR.$base_unit_rnd_typ);     // 基準単位端数処理区分
//				addColumnPathMap(Srch01_RsltR.$base_unit_nm, Avl_ListR.$base_unit_nm);               // 基準単位名

				// 数量項目について、予定在庫区分によりの分岐処理が必要なため、「valueCopy」関数で設定される。
//				addColumnPathMap(Srch01_RsltR.$pack_stk_qty, Avl_ListR.$pack_unit_src_qty);          // 在庫数量（荷）
//				addColumnPathMap(Srch01_RsltR.$pack_gr_schd_qty, Avl_ListR.$pack_gr_schd_qty);       // 入庫予定数量（荷）
//				addColumnPathMap(Srch01_RsltR.$pack_alloc_qty, Avl_ListR.$pack_unit_alloc_qty);      // 引当数量（荷）
//				addColumnPathMap(Srch01_RsltR.$pack_wait_qty, Avl_ListR.$pack_unit_wait_qty);        // 保留数量（荷）
//				addColumnPathMap(Srch01_RsltR.$pack_alloc_avl_qty, Avl_ListR.$pack_unit_qty);        // 引当可能数量（荷）
//				addColumnPathMap(Srch01_RsltR.$base_stk_qty, Avl_ListR.$base_unit_src_qty);          // 在庫数量（基）
//				addColumnPathMap(Srch01_RsltR.$base_gr_schd_qty, Avl_ListR.$base_gr_schd_qty);       // 入庫予定数量（基）
//				addColumnPathMap(Srch01_RsltR.$base_alloc_qty, Avl_ListR.$base_unit_alloc_qty);      // 引当数量（基）
//				addColumnPathMap(Srch01_RsltR.$base_wait_qty, Avl_ListR.$base_unit_wait_qty);        // 保留数量（基）
//				addColumnPathMap(Srch01_RsltR.$base_alloc_avl_qty, Avl_ListR.$base_unit_qty);        // 引当可能数量（基）

				// 有効成分項目に関して、品目マスタと連結し、算出する必要なため、後続「setCache」で設定される。
//				addColumnPathMap(Srch01_RsltR.$stk_act_cont_qty, Avl_ListR.$stk_act_cont_qty);       // 実際有効成分（在庫）
//				addColumnPathMap(Srch01_RsltR.$schd_act_cont_qty, Avl_ListR.$schd_act_cont_qty);     // 実際有効成分（入庫）
//				addColumnPathMap(Srch01_RsltR.$alloc_act_cont_qty, Avl_ListR.$alloc_act_cont_qty);   // 実際有効成分（引当）
//				addColumnPathMap(Srch01_RsltR.$wait_act_cont_qty, Avl_ListR.$wait_act_cont_qty);     // 実際有効成分（保留）
//				addColumnPathMap(Srch01_RsltR.$avl_act_cont_qty, Avl_ListR.$avl_act_cont_qty);       // 実際有効成分（引当可）
				addColumnPathMap(Srch01_RsltR.$act_cont_fctr, Avl_ListR.$act_cont_fctr);             // 実際有効成分係数
//				addColumnPathMap(Srch01_RsltR.$stk_std_cont_qty, Avl_ListR.$stk_std_cont_qty);       // 標準有効成分（在庫）
//				addColumnPathMap(Srch01_RsltR.$schd_std_cont_qty, Avl_ListR.$schd_std_cont_qty);     // 標準有効成分（入庫）
//				addColumnPathMap(Srch01_RsltR.$alloc_std_cont_qty, Avl_ListR.$alloc_std_cont_qty);   // 標準有効成分（引当）
//				addColumnPathMap(Srch01_RsltR.$wait_std_cont_qty, Avl_ListR.$wait_std_cont_qty);     // 標準有効成分（保留）
//				addColumnPathMap(Srch01_RsltR.$avl_std_cont_qty, Avl_ListR.$avl_std_cont_qty);       // 標準有効成分（引当可）
//				addColumnPathMap(Srch01_RsltR.$cont_fctr_unit_cd, Avl_ListR.$cont_fctr_unit_cd);     // 有効成分単位ＣＤ
//				addColumnPathMap(Srch01_RsltR.$cont_fctr_unit_nm, Avl_ListR.$cont_fctr_unit_nm);     // 有効成分単位名
				addColumnPathMap(Srch01_RsltR.$std_cont_fctr, Avl_ListR.$std_cont_fctr);             // 標準有効成分係数
				addColumnPathMap(Srch01_RsltR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);             // 有効成分対象
				addColumnPathMap(Srch01_RsltR.$cont_fctr_dec_place, Avl_ListR.$cont_fctr_dec_place); // 有効成分小数部有効桁数
				addColumnPathMap(Srch01_RsltR.$cont_fctr_rnd_typ, Avl_ListR.$cont_fctr_rnd_typ);     // 有効成分換算端数処理区分

				// ロット関連項目、呼び出し先から設定される。
				addColumnPathMap(Srch01_RsltR.$bp_lot_no, Avl_ListR.$bp_lot_no);                     // 業者ロットＮＯ
				addColumnPathMap(Srch01_RsltR.$first_gr_dt, Avl_ListR.$first_gr_dt);                 // 最古入庫日
				addColumnPathMap(Srch01_RsltR.$unreg_lmt_flg, Avl_ListR.$unreg_lmt_flg);             // 期限未設定
				addColumnPathMap(Srch01_RsltR.$vld_dt, Avl_ListR.$vld_dt);                           // 有効期限
				addColumnPathMap(Srch01_RsltR.$lmt_dt, Avl_ListR.$lmt_dt);                           // 使用期限
				addColumnPathMap(Srch01_RsltR.$plnt_aprv_sts_typ, Avl_ListR.$plnt_aprv_sts_typ);     // 工場出荷承認状況区分
				addColumnPathMap(Srch01_RsltR.$mrkt_judg_sts_typ, Avl_ListR.$mrkt_judg_sts_typ);     // 市場出荷判定状況区分

				// 入庫予定関連項目
				addColumnPathMap(Srch01_RsltR.$schd_dt, Avl_ListR.$schd_dt);                         // 予定日
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 棚・ラインの無しチェック
				if (isNull(dest.str_ln_cd()) || MAC_STR.isNULL_VAL(dest.str_ln_cd())) {
					dest.str_ln_cd_none_flg(true);
				}

				// 確定ＮＯをNULLにする
				dest.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
				dest.fix_no(MAC_STR.NULL_VAL.value());

				MCNumber packNotLotAllocQty = src.pack_unit_not_lot_alloc_qty().add(src.pack_unit_lg_not_lot_alloc_qty()).add(src.pack_unit_grs_alloc_qty());
				MCNumber packNotLotWaitQty = src.pack_unit_not_lot_wait_qty().add(src.pack_unit_lg_not_lot_wait_qty()).add(src.pack_unit_grs_wait_qty());
				MCNumber packLotAllocAvlQty = src.pack_unit_qty().add(packNotLotAllocQty).add(packNotLotWaitQty);

				MCNumber baseNotLotAllocQty = null;
				MCNumber baseNotLotWaitQty = null;
				MCNumber baseLotAllocAvlQty = null;
				if (!isNull(src.base_unit_not_lot_alloc_qty()) || !isNull(src.base_unit_not_lot_alloc_qty()) || !isNull(src.base_unit_grs_alloc_qty())) {
					baseNotLotAllocQty = src.base_unit_not_lot_alloc_qty().add(src.base_unit_lg_not_lot_alloc_qty()).add(src.base_unit_grs_alloc_qty());
				}
				if (!isNull(src.base_unit_not_lot_wait_qty()) || !isNull(src.base_unit_lg_not_lot_wait_qty()) || !isNull(src.base_unit_grs_wait_qty())) {
					baseNotLotWaitQty = src.base_unit_not_lot_wait_qty().add(src.base_unit_lg_not_lot_wait_qty()).add(src.base_unit_grs_wait_qty());
				}
				if (!isNull(src.base_unit_qty())) {
					baseLotAllocAvlQty = src.base_unit_qty().add(baseNotLotAllocQty).add(baseNotLotWaitQty);
				}
				// 数量項目の計算
				if (MSC_SCHD_STK_TYP.isSTK(src.schd_stk_typ())) {
					dest.pack_stk_qty(src.pack_unit_src_qty());
					dest.pack_gr_schd_qty(MCNumber.ZERO);
					dest.pack_alloc_qty(src.pack_unit_alloc_qty());
					dest.pack_wait_qty(src.pack_unit_wait_qty());
					dest.pack_alloc_avl_qty(src.pack_unit_qty());
					dest.base_stk_qty(src.base_unit_src_qty());
					dest.base_gr_schd_qty(MCNumber.ZERO);
					dest.base_alloc_qty(src.base_unit_alloc_qty());
					dest.base_wait_qty(src.base_unit_wait_qty());
					dest.base_alloc_avl_qty(src.base_unit_qty());
					dest.pack_lot_alloc_avl_qty(packLotAllocAvlQty);
					dest.base_lot_alloc_avl_qty(baseLotAllocAvlQty);
				}
				else if (MSC_SCHD_STK_TYP.isMINUS_STK(src.schd_stk_typ())) {
					dest.pack_stk_qty(src.pack_unit_src_qty().negate());
					dest.pack_gr_schd_qty(MCNumber.ZERO);
					dest.pack_alloc_qty(src.pack_unit_alloc_qty().negate());
					dest.pack_wait_qty(src.pack_unit_wait_qty().negate());
					dest.pack_alloc_avl_qty(src.pack_unit_qty().negate());
					dest.base_stk_qty(src.base_unit_src_qty().negate());
					dest.base_gr_schd_qty(MCNumber.ZERO);
					dest.base_alloc_qty(src.base_unit_alloc_qty().negate());
					dest.base_wait_qty(src.base_unit_wait_qty().negate());
					dest.base_alloc_avl_qty(src.base_unit_qty().negate());
					dest.pack_lot_alloc_avl_qty(packLotAllocAvlQty.negate());
					dest.base_lot_alloc_avl_qty(baseLotAllocAvlQty.negate());
				}
				else {
					dest.pack_stk_qty(MCNumber.ZERO);
					dest.base_stk_qty(MCNumber.ZERO);
					dest.schd_stk_typ(MSC_SCHD_STK_TYP.GR_SCHD.value());
					if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(src.schd_stk_typ()) || MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(src.schd_stk_typ())) {
						dest.pack_gr_schd_qty(src.pack_unit_src_qty());
						dest.pack_alloc_qty(src.pack_unit_alloc_qty());
						dest.pack_wait_qty(src.pack_unit_wait_qty());
						dest.pack_alloc_avl_qty(src.pack_unit_qty());
						dest.base_gr_schd_qty(src.base_unit_src_qty());
						dest.base_alloc_qty(src.base_unit_alloc_qty());
						dest.base_wait_qty(src.base_unit_wait_qty());
						dest.base_alloc_avl_qty(src.base_unit_qty());
						dest.pack_lot_alloc_avl_qty(packLotAllocAvlQty);
						dest.base_lot_alloc_avl_qty(baseLotAllocAvlQty);
					}
					else {
						dest.pack_gr_schd_qty(MCNumber.ZERO);
						dest.pack_alloc_avl_qty(src.pack_unit_qty().negate());
						dest.base_gr_schd_qty(MCNumber.ZERO);
						if (!isNull(src.base_unit_qty())) {
							dest.base_alloc_avl_qty(src.base_unit_qty().negate());
						}
						dest.pack_lot_alloc_avl_qty(packLotAllocAvlQty.negate());
						if (!isNull(baseLotAllocAvlQty)) {
							dest.base_lot_alloc_avl_qty(baseLotAllocAvlQty.negate());
						}

						if (MSC_SCHD_STK_TYP.isLOC_GI_SCHD(src.schd_stk_typ()) || MSC_SCHD_STK_TYP.isGRS_GI_SCHD(src.schd_stk_typ())) {
							dest.pack_alloc_qty(src.pack_unit_qty());
							dest.pack_wait_qty(MCNumber.ZERO);
							dest.base_alloc_qty(src.base_unit_qty());
							dest.base_wait_qty(MCNumber.ZERO);
						}
						else {
							dest.pack_alloc_qty(MCNumber.ZERO);
							dest.pack_wait_qty(src.pack_unit_qty());
							dest.base_alloc_qty(MCNumber.ZERO);
							dest.base_wait_qty(src.base_unit_qty());
						}
					}
				}
			}
		}
	}

	//FMCB CUSTOM END
}