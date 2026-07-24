package mcframe.serverMSBE.MSBEL0010;

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
import static mcframe.serverMSBE.MSBEL0010.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverMSBE.MSBEL5040.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkSrch_MC extends MSBEL_StkSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 現時点在庫あるいは引当可能数量を照会する<br>
	 */
	public class Srch01 extends MSBEL_StkSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			if (isSame(up0().ope(), "1") || isSame(up0().ope(), "4")) {
				MCQueryPlan sql = MSBEL0010_MST_STK_S01();
				String[] cols = getOrderByCols(up0());
				sql.addDynamicSQLInfo(getOrderByClause(up0()));
				searchForDL(sql, up0(), down0(), cols);
			}
			else {
				searchAlloc();
			}
		}

		protected void setUpTmpCol(Srch01_CndR up) {

			// 部門取得基準日
			up.addDateColumn("base_dt", getToday());

			// 納品先・配送先在庫を除く
			up.addStringColumn("only_int_true", toTrueStr(up.only_int_flg()));

			// 期限未設定のみ
			up.addStringColumn("only_unreg_lmt_true", toTrueStr(up.unreg_lmt_flg()));

			// 現品票出力対象のみ
			up.addStringColumn("only_stk_lst_flg_true", toTrueStr(isSame(up0().ope(), "4")));

			// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
			if (!isNull(up0().itm_cd()) && !isNullAnd(up0().sno1(), up0().sno2(), up0().sno3(), up0().sno4())) {

				MAM_ITM_R itm = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
				itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
				itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd"))
						.and(t.itm_sub1.eq(bind("itm_sub1")))
						.and(t.itm_sub2.eq(bind("itm_sub2")))
						.and(t.itm_sub3.eq(bind("itm_sub3"))));
				dbSelect("MSBEL0010_MAM_ITM_S01", itm, itm_bldr, up0());
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

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}

		protected void searchAlloc() {
			MCQueryApiBuilder allocItm_bldr = MCQueryApiBuilder.create(MSW_ALLOC_ITM_R.create("T"));
			execDbWkDelete("MSBEL0010_MSW_ALLOC_ITM_D01", allocItm_bldr.getBaseDbc());
			executeUpdate(MSBEL0010_MSW_ALLOC_ITM_I01(), up0());
			dbWkDelete("MSBEL0010_MSW_ALLOC_LOCK_KEY_D01", MST_ALLOC_LOCK_R.create());
			executeUpdate(MSBEL0010_MSW_ALLOC_LOCK_KEY_I01(), up0());

			getCache();

			Alloc_Avl_Srch01_CndR up0 = Alloc_Avl_Srch01_CndR.create();
			setUp0(up0);
			String[] cols = getOrderByCols(up0());
			searchForDL(MSBEL_AllocMngService.getQuery(up0, false, cols), up0, down0(), cols);
			
		}

		protected void setUp0(Alloc_Avl_Srch01_CndR up0) {
			up0.short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			up0.all_pri_flg(false);
			up0.except_alloc_wait_flg(up0().except_alloc_wait_flg());
			up0.except_zero_flg(false);
//			up0.dt_fr();
//			up0.dt_to();
//			up0.avl_schd_dt();
			up0.except_invld_lot_flg(false);
			if (isSame(up0().ope(), "3")) {
				// 総量引当
				up0.alloc_grp_srch_flg(true);
			}
			else {
				// 場所引当
				up0.alloc_grp_srch_flg(false);
			}
			up0.ignore_margin_days(up0().ignore_margin_days());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (down0().isEmpty()) return;

			if (isSame(up0().ope(), "2") || isSame(up0().ope(), "3")) {
				MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv = MSBEL_AllocMngService.crtAlloc_Avl_Srch01();
				setUp0(avl01Sv.up0());
				for (Srch01_RsltR r :down0()) {
					r.alloc().lot_quality_typ(r.lot_quality_typ());
					avl01Sv.up3().add(r.alloc());
				}
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

				down0().clear();
				addAll(down0(), avl01Sv.down0().subList(crtCndMatcher(up0())), createMap_Srch01_RsltR_Avl_ListR());
				addAll(down0(), avl01Sv.down1().subList(crtCndMatcher(up0())), createMap_Srch01_RsltR_Avl_ListR());
				addAll(down0(), avl01Sv.down2().subList(crtCndMatcher(up0())), createMap_Srch01_RsltR_Avl_ListR());
				addAll(down0(), avl01Sv.down3().subList(crtCndMatcher(up0())), createMap_Srch01_RsltR_Avl_ListR());

				setCache();
			}

			for (Srch01_RsltR r : down0()) {

				// 実際有効成分の設定
				setActContQty(r);

				// 標準有効成分の設定
				setStdContQty(r);
			}

			//集計処理
			getTotalList(down0());

			//ソート処理
			down0().sort(getOrderByCols(up0()));
		}

		protected cndMatcher crtCndMatcher(Srch01_CndR up) {
			return new cndMatcher(up);
		}

		public class cndMatcher implements MCRowMatcher<Avl_ListR> {

			Srch01_CndR _up = Srch01_CndR.create();

			public cndMatcher(Srch01_CndR cndR) {
				_up = cndR;
			}

			public boolean match(Avl_ListR row) {

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
				if (_up.unreg_lmt_flg() && !row.unreg_lmt_flg()) {
					return false;
				}
				if (!isNull(_up.first_gr_dt_fr()) && !_up.first_gr_dt_fr().lte(row.first_gr_dt())) {
					return false;
				}
				if (!isNull(_up.first_gr_dt_to()) && !_up.first_gr_dt_to().gte(row.first_gr_dt())) {
					return false;
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
		}

		/**
		 * ORDER BY句の文字列を返す 
		 */
		protected MCDynamicSQLInfo[] getOrderByClause(Srch01_CndR cndR) {
			List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

			if (isSame(cndR.ope(), "1") || isSame(cndR.ope(), "4")) {
				if(cndR.loc_flg() == true) {
					l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$loc_cd).asc()));
				}
				if(cndR.str_ln_flg() == true) {
					l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$str_ln_cd).asc()));
				}
			}
			l.add(when(null).orderBy(ORDERBY,
					pr(Srch01_CndR.$itm_cd).asc(),
					pr(Srch01_CndR.$itm_sub1).asc(),
					pr(Srch01_CndR.$itm_sub2).asc(),
					pr(Srch01_CndR.$itm_sub3).asc()));
			
			return l.toArray(new MCDynamicSQLInfo[0]);
		}

		/**
		 * SQLのORDER BYに使う項目
		 */
		protected String[] getOrderByCols(Srch01_CndR cndR) {
			List<String> cols = new ArrayList<String>();

			if (isSame(cndR.ope(), "1") || isSame(cndR.ope(), "4")) {
				if(cndR.loc_flg() == true) {
					cols.add(MST_STK_R.$loc_cd);
				}
				if(cndR.str_ln_flg() == true) {
					cols.add(MST_STK_R.$str_ln_cd);
				}
			}
			
			cols.add(MST_STK_R.$itm_cd);
			cols.add(MST_STK_R.$itm_sub1);
			cols.add(MST_STK_R.$itm_sub2);
			cols.add(MST_STK_R.$itm_sub3);

			return cols.toArray(new String[cols.size()]);
		}

		protected void getTotalList(MCList<Srch01_RsltR> down0) {

			if (down0.isEmpty()) {
				return;
			}

			if (isSame(up0().ope(), "1") || isSame(up0().ope(), "4")) {
				if (isAllSumFlgOn()) {
					if (up0().negative_stk_qty_flg()) {
						down0().setAll(down0().subList(r -> r.stk_qty().isNegative()));
					}
					else if (up0().positive_stk_qty_flg()) {
						down0().setAll(down0().subList(r -> r.stk_qty().isPositive()));
					}
					return;
				}
			}

			List<String> removeArray = new ArrayList<String>();
			setRemoveArray(removeArray);

			MCList<Srch01_RsltR> retL = MCList.create(Srch01_RsltR.class);
			retL.addAll(down0());

			//集計関連カラムをグループ化対象から除く
			String[] grpCols = MCCollectionUtil.remove(getGroupCols(), new String[0], removeArray.toArray(new String[0]));

			MCGroupByPolicy policy = new MCGroupByPolicy(grpCols);
			policy.sum(getSumCols());
			policy.max(getMaxCols());
			retL.setAll(retL.groupBy(policy));

			if (isSame(up0().ope(), "1") || isSame(up0().ope(), "4")) {
				// 在庫表示または現品票発行の場合、在庫数の正数/負数のみフラグによる絞込
				if (up0().negative_stk_qty_flg()) {
					retL.setAll(retL.subList(r -> r.stk_qty().isNegative()));
				}
				else if (up0().positive_stk_qty_flg()) {
					retL.setAll(retL.subList(r -> r.stk_qty().isPositive()));
				}
			}
			else if (isSame(up0().ope(), "2") || isSame(up0().ope(), "3")) {
				// 場所引当表示または総量引当表示の場合、引当可能数の正数/負数のみフラグによる絞込
				if (up0().negative_alloc_qty_flg()) {
					retL.setAll(retL.subList(r -> r.alloc_avl_qty().isNegative()));
				}
				else if (up0().positive_alloc_qty_flg()) {
					retL.setAll(retL.subList(r -> r.alloc_avl_qty().isPositive()));
				}
				// 引当異状フラグによる絞込
				if (up0().abnormal_alloc_flg()) {
					retL.setAll(retL.subList(r -> r.abnormal_alloc_flg()));
				}
			}

			down0.setAll(retL);
		}

		protected boolean isAllSumFlgOn() {
			return up0().dpt_flg()
					&& up0().wg_flg()
					&& up0().loc_flg()
					&& up0().str_ln_flg()
					&& up0().stk_arrv_bp_flg()
					&& up0().site_flg()
					&& up0().loc_grp_flg()
					&& up0().lg_grp_flg()
					&& up0().alloc_grp_flg()
					&& up0().pack_unit_flg()
					&& up0().gd_flg()
					&& up0().lot_flg()
					&& up0().sublot_flg()
					&& up0().sno1_flg()
					&& up0().sno2_flg()
					&& up0().sno3_flg()
					&& up0().sno4_flg()
					&& up0().fix_no_typ_flg()
					&& up0().fix_no_flg()
					&& up0().bp_lot_flg();
		}

		protected String[] getGroupCols() {
			return new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$wg_nm,
					Srch01_RsltR.$dpt_cd,
					Srch01_RsltR.$dpt_nm,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$itm_nm,
					Srch01_RsltR.$ver_no,
					Srch01_RsltR.$lot_no,
					Srch01_RsltR.$sublot_no,
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
					Srch01_RsltR.$in_xfr_typ,
					Srch01_RsltR.$in_xfr_typ_nm,
					Srch01_RsltR.$asst_typ,
					Srch01_RsltR.$asst_typ_nm,
					Srch01_RsltR.$stk_id_typ,
					Srch01_RsltR.$stk_id_typ_nm,
					Srch01_RsltR.$stk_bp_cd,
					Srch01_RsltR.$stk_bp_nm,
					Srch01_RsltR.$fix_no_typ,
					Srch01_RsltR.$fix_no_typ_nm,
					Srch01_RsltR.$fix_no,
					Srch01_RsltR.$stk_arrv_bp_cd,
					Srch01_RsltR.$stk_arrv_bp_nm,
					Srch01_RsltR.$pack_unit_cd,
					Srch01_RsltR.$pack_unit_nm,
					Srch01_RsltR.$pack_unit_dec_place,
					Srch01_RsltR.$base_unit_cd,
					Srch01_RsltR.$base_unit_nm,
					Srch01_RsltR.$base_unit_dec_place,
					Srch01_RsltR.$alloc_unit_cd,
					Srch01_RsltR.$alloc_unit_nm,
					Srch01_RsltR.$alloc_unit_dec_place,
					Srch01_RsltR.$std_unit_cost,
					Srch01_RsltR.$base_cur_cd,
					Srch01_RsltR.$base_cur_nm,
					Srch01_RsltR.$stk_amt_dec_place,
					Srch01_RsltR.$stk_amt_rnd_typ,
					Srch01_RsltR.$act_cont_fctr,
					Srch01_RsltR.$cont_fctr_unit_cd,
					Srch01_RsltR.$cont_fctr_unit_nm,
					Srch01_RsltR.$cont_fctr_flg,
					Srch01_RsltR.$std_cont_fctr,
					Srch01_RsltR.$cont_fctr_rnd_typ,
					Srch01_RsltR.$cont_fctr_dec_place,
					Srch01_RsltR.$bp_lot_no,
					Srch01_RsltR.$in_prmt_insp_flg,
					Srch01_RsltR.$mfg_aprv_sts_typ,
					Srch01_RsltR.$mfg_aprv_sts_typ_nm,
					Srch01_RsltR.$lot_quality_typ,
					Srch01_RsltR.$lot_quality_typ_nm,
					Srch01_RsltR.$lot_stk_insp_typ,
					Srch01_RsltR.$lot_stk_insp_typ_nm,
					Srch01_RsltR.$plnt_aprv_sts_typ,
					Srch01_RsltR.$plnt_aprv_sts_typ_nm,
					Srch01_RsltR.$first_gr_dt,
					Srch01_RsltR.$unreg_lmt_flg,
					Srch01_RsltR.$vld_dt,
					Srch01_RsltR.$lmt_dt,
					Srch01_RsltR.$mrkt_judg_sts_typ,
					Srch01_RsltR.$mrkt_judg_sts_typ_nm,
					Srch01_RsltR.$stk_sub_char1,
					Srch01_RsltR.$stk_sub_char2,
					Srch01_RsltR.$stk_sub_char3,
					Srch01_RsltR.$lot_rmrks,
					Srch01_RsltR.$lot_sub_char1,
					Srch01_RsltR.$lot_sub_char2,
					Srch01_RsltR.$lot_sub_char3,
					Srch01_RsltR.$itm_typ,
					Srch01_RsltR.$itm_typ_nm,
					Srch01_RsltR.$itm_typ_d_cd,
					Srch01_RsltR.$itm_typ_d_nm,
					Srch01_RsltR.$itm_grp_cd1,
					Srch01_RsltR.$itm_grp_nm1,
					Srch01_RsltR.$itm_grp_cd2,
					Srch01_RsltR.$itm_grp_nm2,
					Srch01_RsltR.$itm_grp_cd3,
					Srch01_RsltR.$itm_grp_nm3,
					Srch01_RsltR.$itm_grp_cd4,
					Srch01_RsltR.$itm_grp_nm4,
					Srch01_RsltR.$itm_grp_cd5,
					Srch01_RsltR.$itm_grp_nm5,
					Srch01_RsltR.$itm_grp_cd6,
					Srch01_RsltR.$itm_grp_nm6,
					Srch01_RsltR.$itm_grp_cd7,
					Srch01_RsltR.$itm_grp_nm7,
					Srch01_RsltR.$itm_grp_cd8,
					Srch01_RsltR.$itm_grp_nm8,
					Srch01_RsltR.$itm_grp_cd9,
					Srch01_RsltR.$itm_grp_nm9,
					Srch01_RsltR.$itm_grp_cd10,
					Srch01_RsltR.$itm_grp_nm10,
					Srch01_RsltR.$ins_usr_id,
					Srch01_RsltR.$ins_usr_nm,
					Srch01_RsltR.$ins_func_id,
					Srch01_RsltR.$ins_func_nm,
					Srch01_RsltR.$ins_ts,
					Srch01_RsltR.$upd_usr_id,
					Srch01_RsltR.$upd_usr_nm,
					Srch01_RsltR.$upd_func_id,
					Srch01_RsltR.$upd_func_nm,
					Srch01_RsltR.$upd_ts,
					Srch01_RsltR.$upd_srv_req_no
			};
		}

		protected String[] getSumCols() {
			return new String[] {
					Srch01_RsltR.$pack_unit_qty,
					Srch01_RsltR.$stk_qty,
					Srch01_RsltR.$gr_schd_qty,
					Srch01_RsltR.$alloc_qty,
					Srch01_RsltR.$wait_qty,
					Srch01_RsltR.$alloc_avl_qty,
					Srch01_RsltR.$stk_amt,
					Srch01_RsltR.$act_cont_qty,
					Srch01_RsltR.$std_cont_qty
			};
		}

		protected String[] getMaxCols() {
			return new String[] {
					Srch01_RsltR.$abnormal_alloc_flg,
			};
		}

		protected void setRemoveArray(List<String> removeArray) {
			setRemoveArrayDpt(removeArray);
			setRemoveArrayWg(removeArray);
			setRemoveArrayLoc(removeArray);
			setRemoveArrayStrLn(removeArray);
			setRemoveArrayStkArrvBp(removeArray);
			setRemoveArraySite(removeArray);
			setRemoveArrayLocGrp(removeArray);
			setRemoveArrayLgGrp(removeArray);
			setRemoveArrayAllocGrp(removeArray);
			setRemoveArrayPackUnit(removeArray);
			setRemoveArrayGd(removeArray);
			setRemoveArrayLot(removeArray);
			setRemoveArraySublot(removeArray);
			setRemoveArrayLotInfo(removeArray);
			setRemoveArraySno1(removeArray);
			setRemoveArraySno2(removeArray);
			setRemoveArraySno3(removeArray);
			setRemoveArraySno4(removeArray);
			setRemoveArrayFixNoTyp(removeArray);
			setRemoveArrayFixNo(removeArray);
			setRemoveArrayExctrlCols(removeArray);
		}

		protected void setRemoveArrayDpt(List<String> removeArray) {
			if (!up0().dpt_flg()) {
				removeArray.add(Srch01_RsltR.$dpt_cd);
				removeArray.add(Srch01_RsltR.$dpt_nm);
			}
		}

		protected void setRemoveArrayWg(List<String> removeArray) {
			if (!up0().wg_flg()) {
				removeArray.add(Srch01_RsltR.$wg_cd);
				removeArray.add(Srch01_RsltR.$wg_nm);
				removeArray.add(Srch01_RsltR.$std_unit_cost);
				removeArray.add(Srch01_RsltR.$stk_amt);
				removeArray.add(Srch01_RsltR.$base_cur_cd);
				removeArray.add(Srch01_RsltR.$base_cur_nm);
				removeArray.add(Srch01_RsltR.$stk_amt_rnd_typ);
				removeArray.add(Srch01_RsltR.$stk_amt_dec_place);
			}
		}

		protected void setRemoveArrayLoc(List<String> removeArray) {
			if (!up0().loc_flg()) {
				removeArray.add(Srch01_RsltR.$loc_cd);
				removeArray.add(Srch01_RsltR.$loc_nm);
			}
		}

		protected void setRemoveArrayStrLn(List<String> removeArray) {
			if (!up0().str_ln_flg()) {
				removeArray.add(Srch01_RsltR.$str_ln_cd);
				removeArray.add(Srch01_RsltR.$str_ln_nm);
				removeArray.add(Srch01_RsltR.$str_ln_cd_none_flg);
			}
		}

		protected void setRemoveArrayStkArrvBp(List<String> removeArray) {
			if (!up0().stk_arrv_bp_flg()) {
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

		protected void setRemoveArrayPackUnit(List<String> removeArray) {
			if (!up0().pack_unit_flg()) {
				removeArray.add(Srch01_RsltR.$pack_unit_cd);
				removeArray.add(Srch01_RsltR.$pack_unit_nm);
				removeArray.add(Srch01_RsltR.$pack_unit_qty);
				removeArray.add(Srch01_RsltR.$pack_unit_dec_place);
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

		protected void setRemoveArrayLot(List<String> removeArray) {
			if (!up0().lot_flg()) {
				removeArray.add(Srch01_RsltR.$lot_no);
			}
		}

		protected void setRemoveArraySublot(List<String> removeArray) {
			if (!up0().sublot_flg()) {
				removeArray.add(Srch01_RsltR.$sublot_no);
			}
		}

		protected void setRemoveArrayLotInfo(List<String> removeArray) {
			//ロットとサブロットのいずれかが集計されたらロット管理情報の項目、有効成分の項目は非表示にする
			if ((up0().lot_flg() && up0().sublot_flg())) {
				//業者ロットＮＯは集計項目のため、ロット、サブロットの集計がされていない場合に非表示にするか判断する
				setRemoveArrayBpLot(removeArray);
			}
			else {
				removeArray.add(Srch01_RsltR.$ver_no);
				removeArray.add(Srch01_RsltR.$act_cont_qty);
				removeArray.add(Srch01_RsltR.$act_cont_fctr);
				removeArray.add(Srch01_RsltR.$std_cont_qty);
				removeArray.add(Srch01_RsltR.$std_cont_fctr);
				removeArray.add(Srch01_RsltR.$cont_fctr_unit_cd);
				removeArray.add(Srch01_RsltR.$cont_fctr_unit_nm);
				removeArray.add(Srch01_RsltR.$cont_fctr_rnd_typ);
				removeArray.add(Srch01_RsltR.$cont_fctr_dec_place);
				removeArray.add(Srch01_RsltR.$lot_quality_typ);
				removeArray.add(Srch01_RsltR.$lot_quality_typ_nm);
				removeArray.add(Srch01_RsltR.$lot_stk_insp_typ);
				removeArray.add(Srch01_RsltR.$lot_stk_insp_typ_nm);
				removeArray.add(Srch01_RsltR.$mfg_aprv_sts_typ);
				removeArray.add(Srch01_RsltR.$mfg_aprv_sts_typ_nm);
				removeArray.add(Srch01_RsltR.$plnt_aprv_sts_typ);
				removeArray.add(Srch01_RsltR.$plnt_aprv_sts_typ_nm);
				removeArray.add(Srch01_RsltR.$first_gr_dt);
				removeArray.add(Srch01_RsltR.$unreg_lmt_flg);
				removeArray.add(Srch01_RsltR.$vld_dt);
				removeArray.add(Srch01_RsltR.$lmt_dt);
				removeArray.add(Srch01_RsltR.$mrkt_judg_sts_typ);
				removeArray.add(Srch01_RsltR.$mrkt_judg_sts_typ_nm);
				removeArray.add(Srch01_RsltR.$lot_rmrks);
				removeArray.add(Srch01_RsltR.$lot_sub_char1);
				removeArray.add(Srch01_RsltR.$lot_sub_char2);
				removeArray.add(Srch01_RsltR.$lot_sub_char3);
				removeArray.add(Srch01_RsltR.$bp_lot_no);
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


		protected void setRemoveArrayFixNoTyp(List<String> removeArray) {
			if (!up0().fix_no_typ_flg()) {
				removeArray.add(Srch01_RsltR.$fix_no_typ);
				removeArray.add(Srch01_RsltR.$fix_no_typ_nm);
			}
		}

		protected void setRemoveArrayFixNo(List<String> removeArray) {
			if (!up0().fix_no_flg()) {
				removeArray.add(Srch01_RsltR.$fix_no);
			}
		}

		protected void setRemoveArrayBpLot(List<String> removeArray) {
			if (!up0().bp_lot_flg()) {
				removeArray.add(Srch01_RsltR.$bp_lot_no);
			}
		}

		protected void setRemoveArrayExctrlCols(List<String> removeArray) {
			//ひとつでも集計されたら制御用カラムは非表示
			if (!isAllSumFlgOn()) {
				removeArray.add(Srch01_RsltR.$ins_usr_id);
				removeArray.add(Srch01_RsltR.$ins_usr_nm);
				removeArray.add(Srch01_RsltR.$ins_func_id);
				removeArray.add(Srch01_RsltR.$ins_func_nm);
				removeArray.add(Srch01_RsltR.$ins_ts);
				removeArray.add(Srch01_RsltR.$upd_usr_id);
				removeArray.add(Srch01_RsltR.$upd_usr_nm);
				removeArray.add(Srch01_RsltR.$upd_func_id);
				removeArray.add(Srch01_RsltR.$upd_func_nm);
				removeArray.add(Srch01_RsltR.$upd_ts);
				removeArray.add(Srch01_RsltR.$upd_srv_req_no);
			}
		}

		protected void setActContQty(Srch01_RsltR r) {
			if (r.cont_fctr_flg()) {
				MCNumber qty = convToContFctrUnit(r.stk_qty(), r.act_cont_fctr(), 
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.act_cont_qty(qty);
			}
		}

		protected void setStdContQty(Srch01_RsltR r) {
			if (r.cont_fctr_flg()) {
				MCNumber qty = convToContFctrUnit(r.stk_qty(), r.std_cont_fctr(), 
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.std_cont_qty(qty);
			}
		}

		protected void setCache() {
			for (Srch01_RsltR r :down0()) {
				// 品目関連、諸口品
				setItmCache(r);
				// 場所関連
				setLocCache(r);
				// 棚・ライン
				setStrLnCache(r);
				// 格付
				setStkGdCache(r);
				// 案件
				setWrkSnoCache(r);
				// 品目マスタ（工場・物流倉庫）
				setItmSiteCache(r);
				// 在庫取引先
				setStkBpCache(r);
				// 在庫着荷先
				setStkArrvBpCache(r);
				// 荷姿単位、引当単位
				setUnitCache(r);
				// ロット管理情報
				setLotCache(r);
			}
		}

		protected void setItmCache(Srch01_RsltR r) {
			MAM_ITM_R itm = _itm.getFirst(_itmIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAM_SUNDRY_ITM_R si = _si.getFirst(_siIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(), r.sno4());
			if (!isNull(si)) {
				r.itm_nm(si.itm_nm());
			}
			else if (!isNull(itm)) {
				r.itm_nm(itm.itm_nm());
			}
			if (!isNull(itm)) {
				r.itm_typ(itm.itm_typ());
				r.itm_typ_d_cd(itm.itm_typ_d_cd());
				r.itm_typ_d_nm(itm.getString(MAM_ITM_TYP_D_R.$itm_typ_d_nm));
				r.base_unit_nm(itm.getString("BASE_UNIT_NM"));
				r.cont_fctr_unit_cd(itm.cont_fctr_unit_cd());
				r.cont_fctr_unit_nm(itm.getString("CONT_FCTR_UNIT_NM"));
				if (up0().itm_grp_flg1()) {r.itm_grp_cd1(itm.itm_grp_cd1()); r.itm_grp_nm1(itm.getString("ITM_GRP_NM1"));}
				if (up0().itm_grp_flg2()) {r.itm_grp_cd2(itm.itm_grp_cd2()); r.itm_grp_nm2(itm.getString("ITM_GRP_NM2"));}
				if (up0().itm_grp_flg3()) {r.itm_grp_cd3(itm.itm_grp_cd3()); r.itm_grp_nm3(itm.getString("ITM_GRP_NM3"));}
				if (up0().itm_grp_flg4()) {r.itm_grp_cd4(itm.itm_grp_cd4()); r.itm_grp_nm4(itm.getString("ITM_GRP_NM4"));}
				if (up0().itm_grp_flg5()) {r.itm_grp_cd5(itm.itm_grp_cd5()); r.itm_grp_nm5(itm.getString("ITM_GRP_NM5"));}
				if (up0().itm_grp_flg6()) {r.itm_grp_cd6(itm.itm_grp_cd6()); r.itm_grp_nm6(itm.getString("ITM_GRP_NM6"));}
				if (up0().itm_grp_flg7()) {r.itm_grp_cd7(itm.itm_grp_cd7()); r.itm_grp_nm7(itm.getString("ITM_GRP_NM7"));}
				if (up0().itm_grp_flg8()) {r.itm_grp_cd8(itm.itm_grp_cd8()); r.itm_grp_nm8(itm.getString("ITM_GRP_NM8"));}
				if (up0().itm_grp_flg9()) {r.itm_grp_cd9(itm.itm_grp_cd9()); r.itm_grp_nm9(itm.getString("ITM_GRP_NM9"));}
				if (up0().itm_grp_flg10()) {r.itm_grp_cd10(itm.itm_grp_cd10()); r.itm_grp_nm10(itm.getString("ITM_GRP_NM10"));}
			}
		}

		protected void setLocCache(Srch01_RsltR r) {
			MAM_LOC_R loc = _loc.getFirst(_locIdx, r.loc_cd());
			if (!isNull(loc)) {
				if (up0().wg_flg()) {r.wg_cd(loc.wg_cd()); r.wg_nm(loc.getString(MAM_WG_R.$wg_nm));}
				if (up0().dpt_flg()) {r.dpt_cd(loc.getString("DPT_CD")); r.dpt_nm(loc.getString(MAM_DPT_R.$dpt_nm));}
				r.loc_nm(loc.loc_nm());
				if (up0().site_flg()) {r.site_cd(loc.site_cd()); r.site_nm(loc.getString(MAM_SITE_R.$site_nm));}
				if (up0().lg_grp_flg()) r.lg_grp_nm(loc.getString(MAM_LG_GRP_R.$lg_grp_nm));
				if (up0().alloc_grp_flg()) r.alloc_grp_nm(loc.getString(MAM_ALLOC_GRP_R.$alloc_grp_nm));
				if (up0().loc_grp_flg()) {r.loc_grp_cd(loc.loc_grp_cd()); r.loc_grp_nm(loc.getString(MAM_LOC_GRP_R.$loc_grp_nm));}
			}
		}

		protected void setStrLnCache(Srch01_RsltR r) {
			if (up0().str_ln_flg()) {
				MAM_STR_LN_R strLn = _strLn.getFirst(_strLnIdx, r.loc_cd(), r.str_ln_cd());
				if (!isNull(strLn)) {
					r.str_ln_nm(strLn.str_ln_nm());
//					r.str_ln_cd_none_flg();
				}
			}
		}

		protected void setStkGdCache(Srch01_RsltR r) {
			if (up0().gd_flg()) {
				MAM_STK_GD_R stkGd = _stkGd.getFirst(_stkGdIdx, r.gd_cd());
				if (!isNull(stkGd)) r.gd_nm(stkGd.gd_nm());
			}
		}

		protected void setWrkSnoCache(Srch01_RsltR r) {
			if (up0().sno1_flg()) {
				MSVT_WRK_SNO_R wrkSno = _wrkSno.getFirst(_wrkSnoIdx, r.sno1());
				if (!isNull(wrkSno)) {
					r.wrk_no(wrkSno.wrk_no());
					r.wrk_nm(wrkSno.wrk_nm());
				}
			}
		}

		protected void setItmSiteCache(Srch01_RsltR r) {
			MAM_ITM_SITE_R itmSite = _itmSite.getFirst(_itmSiteIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd());
			if (!isNull(itmSite)) r.in_prmt_insp_flg(itmSite.in_prmt_insp_flg());
		}

		protected void setStkBpCache(Srch01_RsltR r) {
			MAM_BP_R stkBp = _stkBp.getFirst(_stkBpIdx, r.stk_bp_cd());
			if (!isNull(stkBp)) r.stk_bp_nm(stkBp.bp_nm());
		}

		protected void setStkArrvBpCache(Srch01_RsltR r) {
			MAM_BP_R stkArrvBp = _stkArrvBp.getFirst(_stkArrvBpIdx, r.stk_arrv_bp_cd());
			if (!isNull(stkArrvBp)) r.stk_arrv_bp_nm(stkArrvBp.bp_nm());
		}

		protected void setUnitCache(Srch01_RsltR r) {
			MAM_UNIT_R packUnit = _unit.getFirst(_unitIdx, r.pack_unit_cd());
			if (!isNull(packUnit)) r.pack_unit_nm(packUnit.unit_nm());

			MAM_UNIT_R allocUnit = _unit.getFirst(_unitIdx, r.alloc_unit_cd());
			if (!isNull(allocUnit)) r.alloc_unit_nm(allocUnit.unit_nm());
		}

		protected void setLotCache(Srch01_RsltR r) {
			MSVT_LOT_LIST_R lot = _lot.getFirst(_lotIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
			if (!isNull(lot)) {
				r.mfg_aprv_sts_typ(lot.mfg_aprv_sts_typ());
				r.lot_quality_typ(lot.quality_typ());
				r.lot_stk_insp_typ(lot.stk_insp_typ());
				r.lot_rmrks(lot.lot_rmrks());
				r.lot_sub_char1(lot.lot_sub_char1());
				r.lot_sub_char2(lot.lot_sub_char2());
				r.lot_sub_char3(lot.lot_sub_char3());
			}
		}

		protected void getCache() {
			// 品目関連
			getItmCache();
			// 諸口品
			getSiCache();
			// 場所関連
			getLocCache();
			// 棚・ライン
			getStrLnCache();
			// 格付
			getStkGdCache();
			// 案件
			getWrkSnoCache();
			// 品目マスタ（工場・物流倉庫）
			getItmSiteCache();
			// 在庫取引先
			getStkBpCache();
			// 在庫着荷先
			getStkArrvBpCache();
			// 荷姿単位、引当単位
			getUnitCache();
			// ロット管理情報
			getLotCache();
		}

		protected MCList<MAM_ITM_R> _itm = MCList.create(MAM_ITM_R.class);
		protected MCIndexKey _itmIdx;
		protected void getItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			MAM_ITM_TYP_D_R m2 = MAM_ITM_TYP_D_R.create("M2");
			MAM_UNIT_R m14 = MAM_UNIT_R.create("M14");
			MAM_UNIT_R m16 = MAM_UNIT_R.create("M16");
			MAM_ITM_GRP_R mm1 = MAM_ITM_GRP_R.create("MM1");
			MAM_ITM_GRP_R mm2 = MAM_ITM_GRP_R.create("MM2");
			MAM_ITM_GRP_R mm3 = MAM_ITM_GRP_R.create("MM3");
			MAM_ITM_GRP_R mm4 = MAM_ITM_GRP_R.create("MM4");
			MAM_ITM_GRP_R mm5 = MAM_ITM_GRP_R.create("MM5");
			MAM_ITM_GRP_R mm6 = MAM_ITM_GRP_R.create("MM6");
			MAM_ITM_GRP_R mm7 = MAM_ITM_GRP_R.create("MM7");
			MAM_ITM_GRP_R mm8 = MAM_ITM_GRP_R.create("MM8");
			MAM_ITM_GRP_R mm9 = MAM_ITM_GRP_R.create("MM9");
			MAM_ITM_GRP_R mm10 = MAM_ITM_GRP_R.create("MM10");
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");

			itm_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.itm_nm, t.itm_typ, t.itm_typ_d_cd, t.cont_fctr_unit_cd);
			itm_bldr.addSelect(m2.itm_typ_d_nm, m14.unit_nm.as("base_unit_nm"), m16.unit_nm.as("cont_fctr_unit_nm"));
			itm_bldr.addLeftOuterJoin(m2, bracket( t.itm_typ.eq(m2.itm_typ)
					.and(t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
			itm_bldr.addLeftOuterJoin(m14, bracket( t.unit_cd.eq(m14.unit_cd)));
			itm_bldr.addLeftOuterJoin(m16, bracket( t.cont_fctr_unit_cd.eq(m16.unit_cd)));
			if (up0().itm_grp_flg1()) {
				itm_bldr.addSelect(t.itm_grp_cd1, mm1.itm_grp_nm.as("itm_grp_nm1"));
				itm_bldr.addLeftOuterJoin(mm1, bracket( mm1.itm_grp_typ.eq(value("01"))
						.and(mm1.itm_grp_cd.eq(t.itm_grp_cd1))));
			}
			if (up0().itm_grp_flg2()) {
				itm_bldr.addSelect(t.itm_grp_cd2, mm2.itm_grp_nm.as("itm_grp_nm2"));
				itm_bldr.addLeftOuterJoin(mm2, bracket( mm2.itm_grp_typ.eq(value("02"))
						.and(mm2.itm_grp_cd.eq(t.itm_grp_cd2))));
			}
			if (up0().itm_grp_flg3()) {
				itm_bldr.addSelect(t.itm_grp_cd3, mm3.itm_grp_nm.as("itm_grp_nm3"));
				itm_bldr.addLeftOuterJoin(mm3, bracket( mm3.itm_grp_typ.eq(value("03"))
						.and(mm3.itm_grp_cd.eq(t.itm_grp_cd3))));
			}
			if (up0().itm_grp_flg4()) {
				itm_bldr.addSelect(t.itm_grp_cd4, mm4.itm_grp_nm.as("itm_grp_nm4"));
				itm_bldr.addLeftOuterJoin(mm4, bracket( mm4.itm_grp_typ.eq(value("04"))
						.and(mm4.itm_grp_cd.eq(t.itm_grp_cd4))));
			}
			if (up0().itm_grp_flg5()) {
				itm_bldr.addSelect(t.itm_grp_cd5, mm5.itm_grp_nm.as("itm_grp_nm5"));
				itm_bldr.addLeftOuterJoin(mm5, bracket( mm5.itm_grp_typ.eq(value("05"))
						.and(mm5.itm_grp_cd.eq(t.itm_grp_cd5))));
			}
			if (up0().itm_grp_flg6()) {
				itm_bldr.addSelect(t.itm_grp_cd6, mm6.itm_grp_nm.as("itm_grp_nm6"));
				itm_bldr.addLeftOuterJoin(mm6, bracket( mm6.itm_grp_typ.eq(value("06"))
						.and(mm6.itm_grp_cd.eq(t.itm_grp_cd6))));
			}
			if (up0().itm_grp_flg7()) {
				itm_bldr.addSelect(t.itm_grp_cd7, mm7.itm_grp_nm.as("itm_grp_nm7"));
				itm_bldr.addLeftOuterJoin(mm7, bracket( mm7.itm_grp_typ.eq(value("07"))
						.and(mm7.itm_grp_cd.eq(t.itm_grp_cd7))));
			}
			if (up0().itm_grp_flg8()) {
				itm_bldr.addSelect(t.itm_grp_cd8, mm8.itm_grp_nm.as("itm_grp_nm8"));
				itm_bldr.addLeftOuterJoin(mm8, bracket( mm8.itm_grp_typ.eq(value("08"))
						.and(mm8.itm_grp_cd.eq(t.itm_grp_cd8))));
			}
			if (up0().itm_grp_flg9()) {
				itm_bldr.addSelect(t.itm_grp_cd9, mm9.itm_grp_nm.as("itm_grp_nm9"));
				itm_bldr.addLeftOuterJoin(mm9, bracket( mm9.itm_grp_typ.eq(value("09"))
						.and(mm9.itm_grp_cd.eq(t.itm_grp_cd9))));
			}
			if (up0().itm_grp_flg10()) {
				itm_bldr.addSelect(t.itm_grp_cd10, mm10.itm_grp_nm.as("itm_grp_nm10"));
				itm_bldr.addLeftOuterJoin(mm10, bracket( mm10.itm_grp_typ.eq(value("10"))
						.and(mm10.itm_grp_cd.eq(t.itm_grp_cd10))));
			}
			itm_bldr.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(S1W)
						.where(value(0).eq(value(0)) 
								.and(S1W.itm_cd.eq(t.itm_cd))
								.and(S1W.itm_sub1.eq(t.itm_sub1))
								.and(S1W.itm_sub2.eq(t.itm_sub2))
								.and(S1W.itm_sub3.eq(t.itm_sub3)))));
			dbSelect("MSBEL0010_MAM_ITM_S02", _itm, itm_bldr);
			_itmIdx = _itm.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}

		protected MCList<MAM_SUNDRY_ITM_R> _si = MCList.create(MAM_SUNDRY_ITM_R.class);
		protected MCIndexKey _siIdx;
		protected void getSiCache() {
			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder si_bldr = MCQueryApiBuilder.create(t);
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");

			si_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sno1, t.sno2, t.sno3, t.sno4, t.itm_nm);
			si_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
					.where( value(0).eq(value(0)) 
						.and(S1W.itm_cd.eq(t.itm_cd))
						.and(S1W.itm_sub1.eq(t.itm_sub1))
						.and(S1W.itm_sub2.eq(t.itm_sub2))
						.and(S1W.itm_sub3.eq(t.itm_sub3))
						.and(S1W.sno1.eq(t.sno1))
						.and(S1W.sno2.eq(t.sno2))
						.and(S1W.sno3.eq(t.sno3))
						.and(S1W.sno4.eq(t.sno4)))));
			dbSelect("MSBEL0010_MAM_SUNDRY_ITM_S01", _si, si_bldr);
			_siIdx = _si.createIndex(MAM_SUNDRY_ITM_R.$itm_cd, MAM_SUNDRY_ITM_R.$itm_sub1, MAM_SUNDRY_ITM_R.$itm_sub2, MAM_SUNDRY_ITM_R.$itm_sub3, MAM_SUNDRY_ITM_R.$sno1, MAM_SUNDRY_ITM_R.$sno2, MAM_SUNDRY_ITM_R.$sno3, MAM_SUNDRY_ITM_R.$sno4);
		}

		protected MCList<MAM_LOC_R> _loc = MCList.create(MAM_LOC_R.class);
		protected MCIndexKey _locIdx;
		protected void getLocCache() {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(t);
			MAM_SITE_R m4 = MAM_SITE_R.create("M4");
			MAM_WG_R m5 = MAM_WG_R.create("M5");
			MAM_LG_GRP_R m6 = MAM_LG_GRP_R.create("M6");
			MAM_ALLOC_GRP_R m7 = MAM_ALLOC_GRP_R.create("M7");
			MAM_LOC_GRP_R m8 = MAM_LOC_GRP_R.create("M8");
			MAM_DPT_R m18 = MAM_DPT_R.create("M18");
			MSW_ALLOC_LOCK_KEY_R S1W = MSW_ALLOC_LOCK_KEY_R.create("W");

				loc_bldr.setSelect(t.loc_cd, t.loc_nm, t.wg_cd, t.site_cd, t.loc_grp_cd, t.sppl_cd);
				if (up0().site_flg()) {
					loc_bldr.addSelect(m4.site_nm);
					loc_bldr.addLeftOuterJoin(m4, bracket( t.site_cd.eq(m4.site_cd)));
				}
				if (up0().wg_flg()) {
					loc_bldr.addSelect(m5.wg_nm);
					loc_bldr.addLeftOuterJoin(m5, bracket( t.wg_cd.eq(m5.wg_cd)));
				}
				if (up0().lg_grp_flg()) {
					loc_bldr.addSelect(m6.lg_grp_nm);
					loc_bldr.addLeftOuterJoin(m6, bracket( t.lg_grp_cd.eq(m6.lg_grp_cd)));
				}
				if (up0().alloc_grp_flg()) {
					loc_bldr.addSelect(m7.alloc_grp_nm);
					loc_bldr.addLeftOuterJoin(m7, bracket( t.alloc_grp_cd.eq(m7.alloc_grp_cd)));
				}
				if (up0().loc_grp_flg()) {
					loc_bldr.addSelect(m8.loc_grp_nm);
					loc_bldr.addLeftOuterJoin(m8, bracket( t.loc_grp_cd.eq(m8.loc_grp_cd)));
				}
				if (up0().dpt_flg()) {
					loc_bldr.addSelect(MAPA_LOC$F_GET_ASST_DPT_CD_NE( t.loc_cd, bind("base_dt"), value(false)).as("dpt_cd"),m18.dpt_nm);
					loc_bldr.addLeftOuterJoin(m18, bracket( MAPA_LOC$F_GET_ASST_DPT_CD_NE( t.loc_cd, bind("base_dt"), value(false) ).eq(m18.dpt_cd)
							.and(bind("base_dt").between(m18.st_dt, m18.end_dt))));
				}
				loc_bldr.addWhereWithAnd(exists(
						subQuery().select(value("X")).from(S1W)
							.where(value(0).eq(value(0))
									.and(S1W.loc_cd.eq(t.loc_cd)))));
				MCRow row = MCRow.create();
				row.addDateColumn("base_dt", getToday());
				dbSelect("MSBEL0010_MAM_LOC_S01", _loc, loc_bldr, row);
				_locIdx = _loc.createIndex(MAM_LOC_R.$loc_cd);
		}

		protected MCList<MAM_STR_LN_R> _strLn = MCList.create(MAM_STR_LN_R.class);
		protected MCIndexKey _strLnIdx;
		protected void getStrLnCache() {
			MSW_ALLOC_LOCK_KEY_R S1W = MSW_ALLOC_LOCK_KEY_R.create("W");

			if (up0().str_ln_flg()) {
				MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
				MCQueryApiBuilder strLn_bldr = MCQueryApiBuilder.create(t);
				strLn_bldr.setSelect(t.loc_cd, t.str_ln_cd, t.str_ln_nm);
				strLn_bldr.addWhereWithAnd(exists(
						subQuery().select(value("X")).from(S1W)
							.where(value(0).eq(value(0))
									.and(S1W.loc_cd.eq(t.loc_cd)))));
				dbSelect("MSBEL0010_MAM_STR_LN_S01", _strLn, strLn_bldr);
				_strLnIdx = _strLn.createIndex(MAM_STR_LN_R.$loc_cd, MAM_STR_LN_R.$str_ln_cd);
			}
		}

		protected MCList<MAM_STK_GD_R> _stkGd = MCList.create(MAM_STK_GD_R.class);
		protected MCIndexKey _stkGdIdx;
		protected void getStkGdCache() {
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");
			if (up0().gd_flg()) {
				MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
				MCQueryApiBuilder stkGd_bldr = MCQueryApiBuilder.create(t);
				stkGd_bldr.setSelect(t.gd_cd, t.gd_nm);
				stkGd_bldr.addWhereWithAnd(exists(
						subQuery().select(value("X")).from(S1W)
							.where(value(0).eq(value(0))
									.and(S1W.gd_cd.eq(t.gd_cd)))));
				dbSelect("MSBEL0010_MAM_STK_GD_S01", _stkGd, stkGd_bldr);
				_stkGdIdx = _stkGd.createIndex(MAM_STK_GD_R.$gd_cd);
			}
		}

		protected MCList<MSVT_WRK_SNO_R> _wrkSno = MCList.create(MSVT_WRK_SNO_R.class);
		protected MCIndexKey _wrkSnoIdx;
		protected void getWrkSnoCache() {
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");

			if (up0().sno1_flg()) {
				MSVT_WRK_SNO_R t = MSVT_WRK_SNO_R.create("T");
				MCQueryApiBuilder wrkSno_bldr = MCQueryApiBuilder.create(t);
				wrkSno_bldr.setSelect(t.sno1, t.wrk_no, t.wrk_nm);
				wrkSno_bldr.addWhereWithAnd(exists(
						subQuery().select(value("X")).from(S1W)
							.where(value(0).eq(value(0))
									.and(S1W.sno1.eq(t.sno1)))));
				dbSelect("MSBEL0010_MSVT_WRK_SNO_S01", _wrkSno, wrkSno_bldr);
				_wrkSnoIdx = _wrkSno.createIndex(MSVT_WRK_SNO_R.$sno1);
			}
		}

		protected MCList<MAM_ITM_SITE_R> _itmSite = MCList.create(MAM_ITM_SITE_R.class);
		protected MCIndexKey _itmSiteIdx;
		protected void getItmSiteCache() {
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder itmSite_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m = MAM_LOC_R.create("M");
			MSW_ALLOC_LOCK_KEY_R S1W = MSW_ALLOC_LOCK_KEY_R.create("W");

			itmSite_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.in_prmt_insp_flg);
			itmSite_bldr.addSelect(m.loc_cd);
			itmSite_bldr.addInnerJoin(m, bracket( t.site_cd.eq(m.site_cd)));
			itmSite_bldr.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(S1W)
						.where(value(0).eq(value(0))
								.and(S1W.itm_cd.eq(t.itm_cd))
								.and(S1W.itm_sub1.eq(t.itm_sub1))
								.and(S1W.itm_sub2.eq(t.itm_sub2))
								.and(S1W.itm_sub3.eq(t.itm_sub3))
								.and(S1W.loc_cd.eq(m.loc_cd)))));
			dbSelect("MSBEL0010_MAM_ITM_SITE_S01", _itmSite, itmSite_bldr);
			_itmSiteIdx = _itmSite.createIndex(MAM_ITM_SITE_R.$itm_cd, MAM_ITM_SITE_R.$itm_sub1, MAM_ITM_SITE_R.$itm_sub2,
					MAM_ITM_SITE_R.$itm_sub3, MAM_LOC_R.$loc_cd);
		}

		protected MCList<MAM_BP_R> _stkBp = MCList.create(MAM_BP_R.class);
		protected MCIndexKey _stkBpIdx;
		protected void getStkBpCache() {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder stkBp_bldr = MCQueryApiBuilder.create(t);
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");

			stkBp_bldr.setSelect(t.bp_cd, t.bp_nm);
			stkBp_bldr.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(S1W)
						.where(value(0).eq(value(0))
								.and(S1W.stk_bp_cd.eq(t.bp_cd)))));
			dbSelect("MSBEL0010_MAM_BP_S01", _stkBp, stkBp_bldr);
			_stkBpIdx = _stkBp.createIndex(MAM_BP_R.$bp_cd);
		}

		protected MCList<MAM_BP_R> _stkArrvBp = MCList.create(MAM_BP_R.class);
		protected MCIndexKey _stkArrvBpIdx;
		protected void getStkArrvBpCache() {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder stkArrvBp_bldr = MCQueryApiBuilder.create(t);

			// 在庫着荷先には外注先のみ設定されるので、場所の発注先で代用する
			stkArrvBp_bldr.setSelect(t.bp_cd, t.bp_nm);
			stkArrvBp_bldr.addWhereWithAnd(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBEL0010_MAM_BP_S02", _stkArrvBp, stkArrvBp_bldr, _loc.groupBy(MAM_LOC_R.$sppl_cd));
			_stkArrvBpIdx = _stkArrvBp.createIndex(MAM_BP_R.$bp_cd);
		}

		protected MCList<MAM_UNIT_R> _unit = MCList.create(MAM_UNIT_R.class);
		protected MCIndexKey _unitIdx;
		protected void getUnitCache() {
			MAM_UNIT_R t = MAM_UNIT_R.create("T");
			MCQueryApiBuilder unit_bldr = MCQueryApiBuilder.create(t);

			// 単位マスタを絞り込む条件は無いが、単位マスタは件数は少ないので全件取得する
			unit_bldr.setSelect(t.unit_cd, t.unit_nm);
			dbSelect("MSBEL0010_MAM_UNIT_S01", _unit, unit_bldr);
			_unitIdx = _unit.createIndex(MAM_UNIT_R.$unit_cd);
		}

		protected MCList<MSVT_LOT_LIST_R> _lot = MCList.create(MSVT_LOT_LIST_R.class);
		protected MCIndexKey _lotIdx;
		protected void getLotCache() {
			MSVT_LOT_LIST_R t = MSVT_LOT_LIST_R.create("T");
			MCQueryApiBuilder lot_bldr = MCQueryApiBuilder.create(t);
			MSW_ALLOC_ITM_R S1W = MSW_ALLOC_ITM_R.create("W");

			lot_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.lot_no, t.sublot_no, t.mfg_aprv_sts_typ, t.quality_typ, t.stk_insp_typ, t.lot_rmrks, t.lot_sub_char1, t.lot_sub_char2, t.lot_sub_char3);
			lot_bldr.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(S1W)
						.where(value(0).eq(value(0))
								.and(S1W.itm_cd.eq(t.itm_cd))
								.and(S1W.itm_sub1.eq(t.itm_sub1))
								.and(S1W.itm_sub2.eq(t.itm_sub2))
								.and(S1W.itm_sub3.eq(t.itm_sub3)))));
			lot_bldr.addWhereWithCutOffAnd(t.lot_no.like(bind("lot_no")));
			lot_bldr.addWhereWithCutOffAnd(t.sublot_no.like(bind("sublot_no")));
			dbSelect("MSBEL0010_MSVT_LOT_LIST_S01", _lot, lot_bldr, up0());
			_lotIdx = _lot.createIndex(MSVT_LOT_LIST_R.$itm_cd, MSVT_LOT_LIST_R.$itm_sub1, MSVT_LOT_LIST_R.$itm_sub2, MSVT_LOT_LIST_R.$itm_sub3, MSVT_LOT_LIST_R.$lot_no, MSVT_LOT_LIST_R.$sublot_no);
		}
	}

	protected Map_Srch01_RsltR_Avl_ListR<Srch01_RsltR,Avl_ListR> createMap_Srch01_RsltR_Avl_ListR() {
		return new Map_Srch01_RsltR_Avl_ListR<Srch01_RsltR, Avl_ListR>();
	}

	public class Map_Srch01_RsltR_Avl_ListR<D extends Srch01_RsltR, S extends Avl_ListR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_RsltR.$schd_stk_typ, Avl_ListR.$schd_stk_typ);
//			addColumnPathMap(Srch01_RsltR.$wg_cd, );
//			addColumnPathMap(Srch01_RsltR.$wg_nm, );
//			addColumnPathMap(Srch01_RsltR.$dpt_cd, );
//			addColumnPathMap(Srch01_RsltR.$dpt_nm, );
			addColumnPathMap(Srch01_RsltR.$itm_cd, Avl_ListR.$itm_cd);
			addColumnPathMap(Srch01_RsltR.$itm_sub1, Avl_ListR.$itm_sub1);
			addColumnPathMap(Srch01_RsltR.$itm_sub2, Avl_ListR.$itm_sub2);
			addColumnPathMap(Srch01_RsltR.$itm_sub3, Avl_ListR.$itm_sub3);
			addColumnPathMap(Srch01_RsltR.$ver_no, Avl_ListR.$ver_no);
			addColumnPathMap(Srch01_RsltR.$alloc_grp_cd, Avl_ListR.$stk_alloc_grp_cd);
			addColumnPathMap(Srch01_RsltR.$stk_arrv_bp_cd, Avl_ListR.$stk_arrv_bp_cd);
			addColumnPathMap(Srch01_RsltR.$asst_typ, Avl_ListR.$asst_typ);
			addColumnPathMap(Srch01_RsltR.$in_xfr_typ, Avl_ListR.$in_xfr_typ);
			addColumnPathMap(Srch01_RsltR.$quality_typ, Avl_ListR.$quality_typ);
			addColumnPathMap(Srch01_RsltR.$stk_insp_typ, Avl_ListR.$stk_insp_typ);
			addColumnPathMap(Srch01_RsltR.$stk_id_typ, Avl_ListR.$stk_id_typ);
			addColumnPathMap(Srch01_RsltR.$stk_bp_cd, Avl_ListR.$stk_bp_cd);
			addColumnPathMap(Srch01_RsltR.$gd_cd, Avl_ListR.$gd_cd);
			addColumnPathMap(Srch01_RsltR.$lot_no, Avl_ListR.$lot_no);
			addColumnPathMap(Srch01_RsltR.$sublot_no, Avl_ListR.$sublot_no);
			addColumnPathMap(Srch01_RsltR.$sno1, Avl_ListR.$sno1);
			addColumnPathMap(Srch01_RsltR.$sno2, Avl_ListR.$sno2);
			addColumnPathMap(Srch01_RsltR.$sno3, Avl_ListR.$sno3);
			addColumnPathMap(Srch01_RsltR.$sno4, Avl_ListR.$sno4);
			addColumnPathMap(Srch01_RsltR.$first_gr_dt, Avl_ListR.$first_gr_dt);
			addColumnPathMap(Srch01_RsltR.$unreg_lmt_flg, Avl_ListR.$unreg_lmt_flg);
			addColumnPathMap(Srch01_RsltR.$vld_dt, Avl_ListR.$vld_dt);
			addColumnPathMap(Srch01_RsltR.$lmt_dt, Avl_ListR.$lmt_dt);
			addColumnPathMap(Srch01_RsltR.$pack_unit_cd, Avl_ListR.$pack_unit_cd);
//			addColumnPathMap(Srch01_RsltR.$pack_unit_qty, ); ⇒  valueCopy
			addColumnPathMap(Srch01_RsltR.$pack_unit_dec_place, Avl_ListR.$pack_unit_dec_place);
			addColumnPathMap(Srch01_RsltR.$base_unit_cd, Avl_ListR.$base_unit_cd);
			addColumnPathMap(Srch01_RsltR.$base_unit_dec_place, Avl_ListR.$base_unit_dec_place);
			addColumnPathMap(Srch01_RsltR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);
			addColumnPathMap(Srch01_RsltR.$act_cont_fctr, Avl_ListR.$act_cont_fctr);
			addColumnPathMap(Srch01_RsltR.$std_cont_fctr, Avl_ListR.$std_cont_fctr);
			addColumnPathMap(Srch01_RsltR.$bp_lot_no, Avl_ListR.$bp_lot_no);
			addColumnPathMap(Srch01_RsltR.$plnt_aprv_sts_typ, Avl_ListR.$plnt_aprv_sts_typ);
			addColumnPathMap(Srch01_RsltR.$mrkt_judg_sts_typ, Avl_ListR.$mrkt_judg_sts_typ);
//			addColumnPathMap(Srch01_RsltR.$itm_nm, );
			addColumnPathMap(Srch01_RsltR.$loc_cd, Avl_ListR.$stk_loc_cd);
//			addColumnPathMap(Srch01_RsltR.$loc_nm, );
			addColumnPathMap(Srch01_RsltR.$str_ln_cd, Avl_ListR.$stk_str_ln_cd);
//			addColumnPathMap(Srch01_RsltR.$str_ln_nm, );
//			addColumnPathMap(Srch01_RsltR.$str_ln_cd_none_flg, );
//			addColumnPathMap(Srch01_RsltR.$site_cd, );
//			addColumnPathMap(Srch01_RsltR.$site_nm, );
			addColumnPathMap(Srch01_RsltR.$lg_grp_cd, Avl_ListR.$stk_lg_grp_cd);
//			addColumnPathMap(Srch01_RsltR.$lg_grp_nm, );
//			addColumnPathMap(Srch01_RsltR.$alloc_grp_nm, );
//			addColumnPathMap(Srch01_RsltR.$loc_grp_cd, );
//			addColumnPathMap(Srch01_RsltR.$loc_grp_nm, );
//			addColumnPathMap(Srch01_RsltR.$gd_nm, );
//			addColumnPathMap(Srch01_RsltR.$quality_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$stk_insp_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$wrk_no, );
//			addColumnPathMap(Srch01_RsltR.$wrk_nm, );
//			addColumnPathMap(Srch01_RsltR.$in_xfr_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$asst_typ_nm, );		⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$stk_id_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$stk_bp_nm, );
//			addColumnPathMap(Srch01_RsltR.$fix_no_typ, );		⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$fix_no_typ_nm, );	⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$fix_no, );			⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$stk_arrv_bp_nm, );
//			addColumnPathMap(Srch01_RsltR.$pack_unit_nm, );
//			addColumnPathMap(Srch01_RsltR.$stk_qty, );			⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$base_unit_nm, );
//			addColumnPathMap(Srch01_RsltR.$gr_schd_qty, );		⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$alloc_qty, );		⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$wait_qty, );			⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$alloc_avl_qty, );	⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$alloc_unit_cd, );	⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$alloc_unit_nm, );
//			addColumnPathMap(Srch01_RsltR.$alloc_unit_dec_place, ); ⇒  valueCopy
//			addColumnPathMap(Srch01_RsltR.$act_cont_qty, );		⇒ 後で計算する
//			addColumnPathMap(Srch01_RsltR.$std_cont_qty, );		⇒ 後で計算する
//			addColumnPathMap(Srch01_RsltR.$cont_fctr_unit_cd, );
//			addColumnPathMap(Srch01_RsltR.$cont_fctr_unit_nm, );
			addColumnPathMap(Srch01_RsltR.$cont_fctr_rnd_typ, Avl_ListR.$cont_fctr_rnd_typ);
			addColumnPathMap(Srch01_RsltR.$cont_fctr_dec_place, Avl_ListR.$cont_fctr_dec_place);
//			addColumnPathMap(Srch01_RsltR.$bp_lot_no, );
//			addColumnPathMap(Srch01_RsltR.$in_prmt_insp_flg, );
//			addColumnPathMap(Srch01_RsltR.$mfg_aprv_sts_typ, );
//			addColumnPathMap(Srch01_RsltR.$mfg_aprv_sts_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$lot_quality_typ, );
//			addColumnPathMap(Srch01_RsltR.$lot_quality_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$lot_stk_insp_typ, );
//			addColumnPathMap(Srch01_RsltR.$lot_stk_insp_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$plnt_aprv_sts_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$unreg_lmt_flg, );
//			addColumnPathMap(Srch01_RsltR.$mrkt_judg_sts_typ_nm, );	⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$stk_sub_char1, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$stk_sub_char2, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$stk_sub_char3, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$lot_rmrks, );
//			addColumnPathMap(Srch01_RsltR.$lot_sub_char1, );
//			addColumnPathMap(Srch01_RsltR.$lot_sub_char2, );
//			addColumnPathMap(Srch01_RsltR.$lot_sub_char3, );
//			addColumnPathMap(Srch01_RsltR.$itm_typ, );
//			addColumnPathMap(Srch01_RsltR.$itm_typ_nm, );		⇒  定数名
//			addColumnPathMap(Srch01_RsltR.$itm_typ_d_cd, );
//			addColumnPathMap(Srch01_RsltR.$itm_typ_d_nm, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd1, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm1, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd2, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm2, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd3, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm3, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd4, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm4, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd5, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm5, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd6, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm6, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd7, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm7, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd8, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm8, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd9, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm9, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_cd10, );
//			addColumnPathMap(Srch01_RsltR.$itm_grp_nm10, );
//			addColumnPathMap(Srch01_RsltR.$ins_usr_id, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$ins_usr_nm, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$ins_func_id, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$ins_func_nm, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$ins_ts, );		⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_usr_id, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_usr_nm, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_func_id, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_func_nm, );	⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_ts, );		⇒  不要
//			addColumnPathMap(Srch01_RsltR.$upd_srv_req_no, );	⇒  不要
			addColumnPathMap(Srch01_RsltR.$abnormal_alloc_flg, Avl_ListR.$abnormal_alloc_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
//			dest.fix_no_typ_nm();
			dest.fix_no(MAC_STR.NULL_VAL.value());

			if (MSC_SCHD_STK_TYP.isSTK(src.schd_stk_typ())) {
				dest.pack_unit_qty(src.pack_unit_src_qty());
				dest.stk_qty(src.base_unit_src_qty());
				dest.gr_schd_qty(MCNumber.ZERO);
				if (src.pack_alloc_flg()) {
					dest.alloc_qty(src.pack_unit_alloc_qty());
					dest.wait_qty(src.pack_unit_wait_qty());
					dest.alloc_avl_qty(src.pack_unit_qty());
				}
				else {
					dest.alloc_qty(src.base_unit_alloc_qty());
					dest.wait_qty(src.base_unit_wait_qty());
					dest.alloc_avl_qty(src.base_unit_qty());
				}
			}
			else {
				dest.pack_unit_qty(MCNumber.ZERO);
				dest.stk_qty(MCNumber.ZERO);
				if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(src.schd_stk_typ()) || MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(src.schd_stk_typ())) {
					if (src.pack_alloc_flg()) {
						dest.gr_schd_qty(src.pack_unit_src_qty());
						dest.alloc_qty(src.pack_unit_alloc_qty());
						dest.wait_qty(src.pack_unit_wait_qty());
						dest.alloc_avl_qty(src.pack_unit_qty());
					}
					else {
						dest.gr_schd_qty(src.base_unit_src_qty());
						dest.alloc_qty(src.base_unit_alloc_qty());
						dest.wait_qty(src.base_unit_wait_qty());
						dest.alloc_avl_qty(src.base_unit_qty());
					}
				}
				else {
					dest.gr_schd_qty(MCNumber.ZERO);

					if (src.pack_alloc_flg()) {
						dest.alloc_avl_qty(src.pack_unit_qty().negate());
					}
					else {
						dest.alloc_avl_qty(src.base_unit_qty().negate());
					}

					if (MSC_SCHD_STK_TYP.isLOC_GI_SCHD(src.schd_stk_typ()) || MSC_SCHD_STK_TYP.isGRS_GI_SCHD(src.schd_stk_typ())) {
						if (src.pack_alloc_flg()) {
							dest.alloc_qty(src.pack_unit_qty());
							dest.wait_qty(MCNumber.ZERO);
						}
						else {
							dest.alloc_qty(src.base_unit_qty());
							dest.wait_qty(MCNumber.ZERO);
						}
					}
					else {
						if (src.pack_alloc_flg()) {
							dest.alloc_qty(MCNumber.ZERO);
							dest.wait_qty(src.pack_unit_qty());
						}
						else {
							dest.alloc_qty(MCNumber.ZERO);
							dest.wait_qty(src.base_unit_qty());
						}
					}
				}
			}

			if (src.pack_alloc_flg()) {
				dest.alloc_unit_cd(src.pack_unit_cd());
				dest.alloc_unit_dec_place(src.pack_unit_dec_place());
			}
			else {
				dest.alloc_unit_cd(src.base_unit_cd());
				dest.alloc_unit_dec_place(src.base_unit_dec_place());
			}
		}
	}

	//FMCB CUSTOM END
}