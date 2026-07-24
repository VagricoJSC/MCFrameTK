package mcframe.serverMSBE.MSBEL0050;

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
import mcframe.serverMSBE.MSBEL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL0050.Query.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkAnlySrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkAnlySrch_MC extends MSBEL_StkAnlySrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 滞留在庫の検索を行う<br>
	 */
	public class Srch01 extends MSBEL_StkAnlySrch_MC_A.Srch01 {
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
			
			// 対象データの取得
			delMlyStkWk();
			executeUpdate(MSBEL0050_MSW_MLY_STK_DTL_KEY_I01(), up0());
			delNonMovStkWk();
			executeUpdate(MSBEL0050_MSW_NON_MOV_STK_KEY_I01(), up0());
			
			// ワークテーブルの件数が1件以上かどうか
			if (cntWk(up0()) != 0) {
				getCache(up0());
				getCtlIoActSchdTyp();
				searchForDL(getSql(up0()), up0(), down0());
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
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			if (down0().isEmpty()) return;
			
			insItmWk(down0());
			editListMainSub();
			setCache(up0(), down0());
			afterProc();
			
			//集計処理
			getTotalList(down0());
			
			// 滞留月数算出、滞留月数による絞り込み
			calcNonMovMons(down0());
			
			//ソート処理
			down0().sort(getOrderByCols());
		}
		
		protected void editListMainSub() {
			
			// 月末在庫の取得
			MCList<RsltR> rsltL1 = MCList.create(RsltR.class);
			executeQuery(rsltL1, MSBEL0050_MST_MLY_STK_DTL_S01(), up0());
			// 滞留基準年月の取得
			MCList<RsltR> rsltL2 =MCList.create(RsltR.class);
			executeQuery(rsltL2, MSBEL0050_MST_MLY_STK_DTL_S02(), up0());
			// 直近出庫予定日の取得
			MCList<RsltR> rsltL3 = MCList.create(RsltR.class);
			executeQuery(rsltL3, MSBEL0050_MST_MLY_STK_DTL_S03(), up0());
			// 滞留在庫情報（移行用データ）の取得
			MCList<RsltR> rsltL4 = MCList.create(RsltR.class);
			executeQuery(rsltL4, MSBEL0050_MST_NON_MOV_STK_S01(), up0());
			
			MCIndexKey index2 = rsltL2.createIndex(
					RsltR.$itm_cd
					,RsltR.$itm_sub1
					,RsltR.$itm_sub2
					,RsltR.$itm_sub3
					,RsltR.$loc_cd
					,RsltR.$str_ln_cd
					,RsltR.$stk_arrv_bp_cd
					,RsltR.$lot_no
					,RsltR.$sublot_no
					,RsltR.$sno1
					,RsltR.$sno2
					,RsltR.$sno3
					,RsltR.$sno4
					,RsltR.$pack_unit_cd
					,RsltR.$gd_cd
					,RsltR.$in_xfr_typ
					,RsltR.$quality_typ
					,RsltR.$asst_typ
					,RsltR.$stk_insp_typ
					,RsltR.$stk_id_typ
					,RsltR.$stk_bp_cd);
			
			MCIndexKey index3 = rsltL3.createIndex(
					RsltR.$itm_cd
					,RsltR.$itm_sub1
					,RsltR.$itm_sub2
					,RsltR.$itm_sub3
					,RsltR.$loc_cd
					,RsltR.$str_ln_cd
					,RsltR.$stk_arrv_bp_cd
					,RsltR.$lot_no
					,RsltR.$sublot_no
					,RsltR.$sno1
					,RsltR.$sno2
					,RsltR.$sno3
					,RsltR.$sno4
					,RsltR.$pack_unit_cd
					,RsltR.$gd_cd
					,RsltR.$in_xfr_typ
					,RsltR.$quality_typ
					,RsltR.$asst_typ
					,RsltR.$stk_insp_typ
					,RsltR.$stk_id_typ
					,RsltR.$stk_bp_cd);
			
			MCIndexKey index4 = rsltL4.createIndex(
					RsltR.$itm_cd
					,RsltR.$itm_sub1
					,RsltR.$itm_sub2
					,RsltR.$itm_sub3
					,RsltR.$loc_cd
					,RsltR.$str_ln_cd
					,RsltR.$stk_arrv_bp_cd
					,RsltR.$lot_no
					,RsltR.$sublot_no
					,RsltR.$sno1
					,RsltR.$sno2
					,RsltR.$sno3
					,RsltR.$sno4
					,RsltR.$pack_unit_cd
					,RsltR.$gd_cd
					,RsltR.$in_xfr_typ
					,RsltR.$quality_typ
					,RsltR.$asst_typ
					,RsltR.$stk_insp_typ
					,RsltR.$stk_id_typ
					,RsltR.$stk_bp_cd);
			
			for (RsltR r : rsltL1) {
				
				RsltR rsltR2 = rsltL2.getFirst(index2, 
						r.itm_cd()
						,r.itm_sub1()
						,r.itm_sub2()
						,r.itm_sub3()
						,r.loc_cd()
						,r.str_ln_cd()
						,r.stk_arrv_bp_cd()
						,r.lot_no()
						,r.sublot_no()
						,r.sno1()
						,r.sno2()
						,r.sno3()
						,r.sno4()
						,r.pack_unit_cd()
						,r.gd_cd()
						,r.in_xfr_typ()
						,r.quality_typ()
						,r.asst_typ()
						,r.stk_insp_typ()
						,r.stk_id_typ()
						,r.stk_bp_cd());
				
				if (!isNull(rsltR2)) {
					r.non_mov_base_ym(rsltR2.non_mov_base_ym());
				} 
				else {
					r.non_mov_base_ym(null);
				}
				
				RsltR rsltR3 = rsltL3.getFirst(index3, 
						r.itm_cd()
						,r.itm_sub1()
						,r.itm_sub2()
						,r.itm_sub3()
						,r.loc_cd()
						,r.str_ln_cd()
						,r.stk_arrv_bp_cd()
						,r.lot_no()
						,r.sublot_no()
						,r.sno1()
						,r.sno2()
						,r.sno3()
						,r.sno4()
						,r.pack_unit_cd()
						,r.gd_cd()
						,r.in_xfr_typ()
						,r.quality_typ()
						,r.asst_typ()
						,r.stk_insp_typ()
						,r.stk_id_typ()
						,r.stk_bp_cd());
				
				if (!isNull(rsltR3)) {
					r.rcnt_gi_schd_dt(rsltR3.rcnt_gi_schd_dt());
				}
				
				RsltR rsltR4 = rsltL4.getFirst(index4, 
						r.itm_cd()
						,r.itm_sub1()
						,r.itm_sub2()
						,r.itm_sub3()
						,r.loc_cd()
						,r.str_ln_cd()
						,r.stk_arrv_bp_cd()
						,r.lot_no()
						,r.sublot_no()
						,r.sno1()
						,r.sno2()
						,r.sno3()
						,r.sno4()
						,r.pack_unit_cd()
						,r.gd_cd()
						,r.in_xfr_typ()
						,r.quality_typ()
						,r.asst_typ()
						,r.stk_insp_typ()
						,r.stk_id_typ()
						,r.stk_bp_cd());
				
				// 滞留基準年月は月次在庫情報から取得された年月を優先的に採用したいので、
				// 月次在庫情報から取得できている、かつ、対応する滞留在庫情報がある場合、
				// 対応する滞留在庫情報の滞留基準年月をnullに設定する
				if (!isNull(r.non_mov_base_ym()) && !isNull(rsltR4)) {
					rsltR4.non_mov_base_ym(null);
				}
			}
			
			down0().setAll(rsltL1);
			down0().addAll(rsltL4);
		}

		protected void afterProc() {
			
			down0().addDateColumn("base_dt", getToday());
			down0().addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
			getStdCostL(RsltR.$std_unit_cost, down0(), RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, "base_dt", RsltR.$wg_cd, "stk_std_upri_typ");
			
			for (RsltR r : down0()) {
				r.stk_amt_dec_place(getCo().stk_amt_dec_place());
				r.stk_amt_rnd_typ(getCo().stk_amt_rnd_typ());
				r.stk_amt(getAmt(r.std_unit_cost(), r.stk_qty(), r.stk_amt_dec_place(), r.stk_amt_rnd_typ()));
				r.base_cur_cd(getCo().base_cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
			}
		}

		protected void getTotalList(MCList<RsltR> down0) {

			if (down0.isEmpty()) {
				return;
			}

			List<String> removeArray = new ArrayList<String>();
			setRemoveArray(removeArray, up0());

			MCList<RsltR> retL = MCList.create(RsltR.class);
			retL.addAll(down0());

			//集計関連カラムをグループ化対象から除く
			String[] grpCols = MCCollectionUtil.remove(getGroupCols(), new String[0], removeArray.toArray(new String[0]));

			MCGroupByPolicy policy = new MCGroupByPolicy(grpCols);
			policy.sum(getSumCols());
			policy.min(getMinCols());
			retL.setAll(retL.groupBy(policy));
			
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
					&& up0().sno4_flg();
		}
		
		protected String[] getGroupCols() {
			return new String[] {
					RsltR.$wg_cd,
					RsltR.$wg_nm,
					RsltR.$dpt_cd,
					RsltR.$dpt_nm,
					RsltR.$itm_cd,
					RsltR.$itm_sub1,
					RsltR.$itm_sub2,
					RsltR.$itm_sub3,
					RsltR.$itm_nm,
					RsltR.$lot_no,
					RsltR.$sublot_no,
					RsltR.$loc_cd,
					RsltR.$loc_nm,
					RsltR.$str_ln_cd,
					RsltR.$str_ln_nm,
					RsltR.$str_ln_cd_none_flg,
					RsltR.$site_cd,
					RsltR.$site_nm,
					RsltR.$lg_grp_cd,
					RsltR.$lg_grp_nm,
					RsltR.$alloc_grp_cd,
					RsltR.$alloc_grp_nm,
					RsltR.$loc_grp_cd,
					RsltR.$loc_grp_nm,
					RsltR.$gd_cd,
					RsltR.$gd_nm,
					RsltR.$quality_typ,
					RsltR.$quality_typ_nm,
					RsltR.$stk_insp_typ,
					RsltR.$stk_insp_typ_nm,
					RsltR.$sno1,
					RsltR.$sno2,
					RsltR.$sno3,
					RsltR.$sno4,
					RsltR.$wrk_no,
					RsltR.$wrk_nm,
					RsltR.$in_xfr_typ,
					RsltR.$in_xfr_typ_nm,
					RsltR.$asst_typ,
					RsltR.$asst_typ_nm,
					RsltR.$stk_id_typ,
					RsltR.$stk_id_typ_nm,
					RsltR.$stk_bp_cd,
					RsltR.$stk_bp_nm,
					RsltR.$stk_arrv_bp_cd,
					RsltR.$stk_arrv_bp_nm,
					RsltR.$pack_unit_cd,
					RsltR.$pack_unit_nm,
					RsltR.$pack_unit_dec_place,
					RsltR.$base_unit_cd,
					RsltR.$base_unit_nm,
					RsltR.$base_unit_dec_place,
					RsltR.$std_unit_cost,
					RsltR.$base_cur_cd,
					RsltR.$base_cur_nm,
					RsltR.$stk_amt_dec_place,
					RsltR.$stk_amt_rnd_typ,
					RsltR.$itm_typ,
					RsltR.$itm_typ_nm,
					RsltR.$itm_typ_d_cd,
					RsltR.$itm_typ_d_nm,
					RsltR.$itm_grp_cd1,
					RsltR.$itm_grp_nm1,
					RsltR.$itm_grp_cd2,
					RsltR.$itm_grp_nm2,
					RsltR.$itm_grp_cd3,
					RsltR.$itm_grp_nm3,
					RsltR.$itm_grp_cd4,
					RsltR.$itm_grp_nm4,
					RsltR.$itm_grp_cd5,
					RsltR.$itm_grp_nm5,
					RsltR.$itm_grp_cd6,
					RsltR.$itm_grp_nm6,
					RsltR.$itm_grp_cd7,
					RsltR.$itm_grp_nm7,
					RsltR.$itm_grp_cd8,
					RsltR.$itm_grp_nm8,
					RsltR.$itm_grp_cd9,
					RsltR.$itm_grp_nm9,
					RsltR.$itm_grp_cd10,
					RsltR.$itm_grp_nm10
			};
		}
		
		protected String[] getSumCols() {
			return new String[] {
					RsltR.$pack_unit_qty,
					RsltR.$stk_qty,
					RsltR.$stk_amt
			};
		}
		
		protected String[] getMinCols() {
			return new String[] {
					RsltR.$non_mov_base_ym,
					RsltR.$rcnt_gi_schd_dt
			};
		}
		
		protected void getCtlIoActSchdTyp() {
			MCList<MSC_STK_ANLY_CTL_R> stkL = MCList.create(MSC_STK_ANLY_CTL_R.class);
			MSC_STK_ANLY_CTL_R t1 = MSC_STK_ANLY_CTL_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t1);
			stkL_bldr.setWhere(t1.ctl_tgt_typ.eq(bind("1")), MSC_CTL_TGT_TYP.NON_MOV.value());
			dbSelect("MSBEL0050_MSC_STK_ANLY_CTL_S01", stkL, stkL_bldr);
			for (MSC_STK_ANLY_CTL_R stkR : stkL) {
				ActTypR down1R = ActTypR.create();
				down1R.io_act_typ(stkR.io_act_typ());
				down1().add(down1R);
			}
			
			MCList<MSC_NON_MOV_SCHD_CTL_R> schdL = MCList.create(MSC_NON_MOV_SCHD_CTL_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MSC_NON_MOV_SCHD_CTL_R.create("T"));
			dbSelect("MSBEL0050_MSC_NON_MOV_SCHD_CTL_S01", schdL, schdL_bldr);
			for (MSC_NON_MOV_SCHD_CTL_R schdR : schdL) {
				SchdTypR down2R = SchdTypR.create();
				down2R.io_schd_typ(schdR.io_schd_typ());
				down2().add(down2R);
			}
		}
		
		protected void calcNonMovMons(MCList<RsltR> down0) {
			
			if (down0.isEmpty()) {
				return;
			}
			
			down0().setAll(down0().subList(r -> r.stk_qty().neq(MCNumber.ZERO)));
			
			for (RsltR r : down0) {
				if (isNull(r.non_mov_base_ym())) {
					r.non_mov_mons(null);
				}
				else {
					r.non_mov_mons(up0().non_mov_cmp_ym().diffMonth(r.non_mov_base_ym()));
				}
			}
			
			// 滞留月数による絞込
			if (!isNull(up0().non_mov_mons_fr())) {
				down0().setAll(down0().subList(r -> !isNull(r.non_mov_mons()) && r.non_mov_mons().gte(up0().non_mov_mons_fr())));
			}
			if (!isNull(up0().non_mov_mons_to())) {
				down0().setAll(down0().subList(r -> !isNull(r.non_mov_mons()) && r.non_mov_mons().lte(up0().non_mov_mons_to())));
			}
			// 滞留基準年月による絞込
			if (!isNull(up0().non_mov_base_ym_fr())) {
				down0().setAll(down0().subList(r -> !isNull(r.non_mov_base_ym()) && r.non_mov_base_ym().gteDate(up0().non_mov_base_ym_fr())));
			}
			if (!isNull(up0().non_mov_base_ym_to())) {
				down0().setAll(down0().subList(r -> !isNull(r.non_mov_base_ym()) && r.non_mov_base_ym().lteDate(up0().non_mov_base_ym_to())));
			}
		}

	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 在庫回転の検索を行う<br>
	 */
	public class Srch02 extends MSBEL_StkAnlySrch_MC_A.Srch02 {
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
			
			// 対象データの取得
			delMlyStkWk();
			executeUpdate(MSBEL0050_MSW_MLY_STK_DTL_KEY_I02(), up0());
			
			// ワークテーブルの件数が1件以上かどうか
			if (cntWk(up0()) != 0) {
				getCache(up0());
				getCtlIoActTyp();
				searchForDL(getSql(up0()), up0(), down0());
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
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			if (down0().isEmpty()) return;
			
			insItmWk(down0());
			editListMainSub();
			setCache(up0(), down0());
			afterProc();
			
			//集計処理
			getTotalList(down0());
			
			// 計算処理
			calcStkTrn();
			
			//ソート処理
			down0().sort(getOrderByCols());
		}
		
		protected void editListMainSub() {
			
			// 出庫数の取得
			MCList<RsltR> rsltL1 = MCList.create(RsltR.class);
			executeQuery(rsltL1, MSBEL0050_MST_MLY_STK_DTL_S04(), up0());
			// 平均在庫数の取得
			MCList<RsltR> rsltL2 =MCList.create(RsltR.class);
			executeQuery(rsltL2, MSBEL0050_MST_MLY_STK_DTL_S05(), up0());
			
			MCIndexKey index = rsltL1.createIndex(
					RsltR.$ac_ym
					,RsltR.$itm_cd
					,RsltR.$itm_sub1
					,RsltR.$itm_sub2
					,RsltR.$itm_sub3
					,RsltR.$loc_cd
					,RsltR.$str_ln_cd
					,RsltR.$stk_arrv_bp_cd
					,RsltR.$lot_no
					,RsltR.$sublot_no
					,RsltR.$sno1
					,RsltR.$sno2
					,RsltR.$sno3
					,RsltR.$sno4
					,RsltR.$pack_unit_cd
					,RsltR.$gd_cd
					,RsltR.$in_xfr_typ
					,RsltR.$quality_typ
					,RsltR.$asst_typ
					,RsltR.$stk_insp_typ
					,RsltR.$stk_id_typ
					,RsltR.$stk_bp_cd);
			
			// 表示対象リスト
			MCList<RsltR> rsltL = MCList.create(RsltR.class);
			
			for (RsltR r : rsltL2) {
				
				RsltR rsltR = rsltL1.getFirst(index, 
						r.ac_ym()
						,r.itm_cd()
						,r.itm_sub1()
						,r.itm_sub2()
						,r.itm_sub3()
						,r.loc_cd()
						,r.str_ln_cd()
						,r.stk_arrv_bp_cd()
						,r.lot_no()
						,r.sublot_no()
						,r.sno1()
						,r.sno2()
						,r.sno3()
						,r.sno4()
						,r.pack_unit_cd()
						,r.gd_cd()
						,r.in_xfr_typ()
						,r.quality_typ()
						,r.asst_typ()
						,r.stk_insp_typ()
						,r.stk_id_typ()
						,r.stk_bp_cd());
				
				if (!isNull(rsltR)) {
					r.ttl_gi_qty(rsltR.ttl_gi_qty());
					r.base_unit_ttl_gi_qty(rsltR.base_unit_ttl_gi_qty());
				}
				else {
					r.ttl_gi_qty(MCNumber.ZERO);
					r.base_unit_ttl_gi_qty(MCNumber.ZERO);
				}
				
				// 合計出庫数もしくは平均在庫数が0ではない場合は表示対象
				if (!(r.avg_stk_qty().isZero() && r.ttl_gi_qty().isZero())) {
					rsltL.add(r);
				}
			}
			
			down0().setAll(rsltL);
		}

		protected void afterProc() {
			
			down0().addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
			getStdCostL(RsltR.$std_unit_cost, down0(), RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$ac_ym, RsltR.$wg_cd, "stk_std_upri_typ");
			
			for (RsltR r : down0()) {
				r.stk_amt_dec_place(getCo().stk_amt_dec_place());
				r.stk_amt_rnd_typ(getCo().stk_amt_rnd_typ());
				r.ttl_gi_amt(getAmt(r.std_unit_cost(), r.base_unit_ttl_gi_qty(), r.stk_amt_dec_place(), r.stk_amt_rnd_typ()));
				r.avg_stk_amt(getAmt(r.std_unit_cost(), r.base_unit_avg_stk_qty(), r.stk_amt_dec_place(), r.stk_amt_rnd_typ()));
				r.base_cur_cd(getCo().base_cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
			}
		}

		protected void getTotalList(MCList<RsltR> down0) {

			if (down0.isEmpty()) {
				return;
			}

			if (isAllSumFlgOn()) {
				return;
			}

			List<String> removeArray = new ArrayList<String>();
			setRemoveArray(removeArray, up0());

			MCList<RsltR> retL = MCList.create(RsltR.class);
			retL.addAll(down0());

			//集計関連カラムをグループ化対象から除く
			String[] grpCols = MCCollectionUtil.remove(getGroupCols(), new String[0], removeArray.toArray(new String[0]));

			MCGroupByPolicy policy = new MCGroupByPolicy(grpCols);
			policy.sum(getSumCols());
			retL.setAll(retL.groupBy(policy));
			
			down0.setAll(retL);
		}
		
		protected boolean isAllSumFlgOn() {
			return  up0().ym_flg()
					&& up0().dpt_flg()
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
					&& up0().sno4_flg();
		}
		
		protected String[] getGroupCols() {
			return new String[] {
					RsltR.$ac_ym,
					RsltR.$wg_cd,
					RsltR.$wg_nm,
					RsltR.$dpt_cd,
					RsltR.$dpt_nm,
					RsltR.$itm_cd,
					RsltR.$itm_sub1,
					RsltR.$itm_sub2,
					RsltR.$itm_sub3,
					RsltR.$itm_nm,
					RsltR.$lot_no,
					RsltR.$sublot_no,
					RsltR.$loc_cd,
					RsltR.$loc_nm,
					RsltR.$str_ln_cd,
					RsltR.$str_ln_nm,
					RsltR.$str_ln_cd_none_flg,
					RsltR.$site_cd,
					RsltR.$site_nm,
					RsltR.$lg_grp_cd,
					RsltR.$lg_grp_nm,
					RsltR.$alloc_grp_cd,
					RsltR.$alloc_grp_nm,
					RsltR.$loc_grp_cd,
					RsltR.$loc_grp_nm,
					RsltR.$gd_cd,
					RsltR.$gd_nm,
					RsltR.$quality_typ,
					RsltR.$quality_typ_nm,
					RsltR.$stk_insp_typ,
					RsltR.$stk_insp_typ_nm,
					RsltR.$sno1,
					RsltR.$sno2,
					RsltR.$sno3,
					RsltR.$sno4,
					RsltR.$wrk_no,
					RsltR.$wrk_nm,
					RsltR.$in_xfr_typ,
					RsltR.$in_xfr_typ_nm,
					RsltR.$asst_typ,
					RsltR.$asst_typ_nm,
					RsltR.$stk_id_typ,
					RsltR.$stk_id_typ_nm,
					RsltR.$stk_bp_cd,
					RsltR.$stk_bp_nm,
					RsltR.$stk_arrv_bp_cd,
					RsltR.$stk_arrv_bp_nm,
					RsltR.$pack_unit_cd,
					RsltR.$pack_unit_nm,
					RsltR.$pack_unit_dec_place,
					RsltR.$base_unit_cd,
					RsltR.$base_unit_nm,
					RsltR.$base_unit_dec_place,
					RsltR.$std_unit_cost,
					RsltR.$base_cur_cd,
					RsltR.$base_cur_nm,
					RsltR.$stk_amt_dec_place,
					RsltR.$stk_amt_rnd_typ,
					RsltR.$itm_typ,
					RsltR.$itm_typ_nm,
					RsltR.$itm_typ_d_cd,
					RsltR.$itm_typ_d_nm,
					RsltR.$itm_grp_cd1,
					RsltR.$itm_grp_nm1,
					RsltR.$itm_grp_cd2,
					RsltR.$itm_grp_nm2,
					RsltR.$itm_grp_cd3,
					RsltR.$itm_grp_nm3,
					RsltR.$itm_grp_cd4,
					RsltR.$itm_grp_nm4,
					RsltR.$itm_grp_cd5,
					RsltR.$itm_grp_nm5,
					RsltR.$itm_grp_cd6,
					RsltR.$itm_grp_nm6,
					RsltR.$itm_grp_cd7,
					RsltR.$itm_grp_nm7,
					RsltR.$itm_grp_cd8,
					RsltR.$itm_grp_nm8,
					RsltR.$itm_grp_cd9,
					RsltR.$itm_grp_nm9,
					RsltR.$itm_grp_cd10,
					RsltR.$itm_grp_nm10,
					RsltR.$loc_cal_cd,
					RsltR.$lg_grp_cal_cd
			};
		}
		
		protected String[] getSumCols() {
			return new String[] {
					RsltR.$ttl_gi_qty,
					RsltR.$base_unit_ttl_gi_qty,
					RsltR.$ttl_gi_amt,
					RsltR.$avg_stk_qty,
					RsltR.$base_unit_avg_stk_qty,
					RsltR.$avg_stk_amt
			};
		}
		
		protected void getCtlIoActTyp() {
			MCList<MSC_STK_ANLY_CTL_R> stkL = MCList.create(MSC_STK_ANLY_CTL_R.class);
			MSC_STK_ANLY_CTL_R t = MSC_STK_ANLY_CTL_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
			stkL_bldr.setWhere(t.ctl_tgt_typ.eq(bind("1")), MSC_CTL_TGT_TYP.STK_TRN.value());
			dbSelect("MSBEL0050_MSC_STK_ANLY_CTL_S02", stkL, stkL_bldr);
			for (MSC_STK_ANLY_CTL_R stkR : stkL) {
				ActTypR down1R = ActTypR.create();
				down1R.io_act_typ(stkR.io_act_typ());
				down1().add(down1R);
			}
		}
		
		protected void calcStkTrn() {
			
			if (down0().isEmpty()) {
				return;
			}
			
			calcDays();
			
			// 対象年月の月数を求める
			long tagMons = up0().ym_to().diffMonth(up0().ym_fr()) + 1;
			
			for (RsltR r : down0()) {
				// 集計タブの年月がオフの場合は、対象年月の月数で平均在庫数を割る
				if (!up0().ym_flg()) {
					r.avg_stk_qty((r.avg_stk_qty().divide(tagMons, RsltR.avg_stk_qty_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
					r.base_unit_avg_stk_qty((r.base_unit_avg_stk_qty().divide(tagMons, RsltR.base_unit_avg_stk_qty_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
					r.avg_stk_amt((r.avg_stk_amt().divide(tagMons, RsltR.avg_stk_amt_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
				}
				// 在庫回転率、在庫回転期間を計算する
				calcTrnOvr(r);
				
				// 一日当たり平均出庫数、一日当たり平均出庫金額、出庫対応日数を計算する
				calcAvgDays(r);
			}
		}
		
		protected void calcTrnOvr(RsltR r) {
			
			// 集計タブの荷姿単位がオフの場合は基準単位数量を使用する
			if (!up0().pack_unit_flg()) {
				r.ttl_gi_qty(r.base_unit_ttl_gi_qty());
				r.avg_stk_qty(r.base_unit_avg_stk_qty());
			}
			
			if (isNullOr(r.ttl_gi_qty(), r.avg_stk_qty()) || 
					r.ttl_gi_qty().isZero() || r.avg_stk_qty().isZero()) {
				r.stk_trn_ovr_rate(MCNumber.ZERO.setScale(RsltR.stk_trn_ovr_rate_META.scale()));
				r.stk_trn_ovr_pd(MCNumber.ZERO);
			}
			else {
				r.stk_trn_ovr_rate((r.ttl_gi_qty().divide(r.avg_stk_qty(), RsltR.stk_trn_ovr_rate_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
				r.stk_trn_ovr_pd(r.avg_stk_qty().divide(r.ttl_gi_qty(), 2, MAC_RND_TYP.RNDUP.toMC()));
			}
		}
		
		protected void calcAvgDays(RsltR r) {
			
			if (isNull(r.ttl_gi_qty())) {
				r.avg_gi_qty(null);
				r.gi_days(null);
			}
			else if (r.ttl_gi_qty().isZero()) {
				r.avg_gi_qty(MCNumber.ZERO);
				r.gi_days(MCNumber.ZERO);
			}
			else {
				r.avg_gi_qty((r.ttl_gi_qty().divide(r.cal_days(), RsltR.avg_gi_qty_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
				if (isNull(r.avg_stk_qty()) || r.avg_gi_qty().isZero()) {
					r.gi_days(null);
				}
				else if (r.avg_stk_qty().isZero()) {
					r.gi_days(MCNumber.ZERO);
				}
				else {
					r.gi_days(r.avg_stk_qty().divide(r.avg_gi_qty(), 2, MAC_RND_TYP.RNDUP.toMC()));
				}
			}
			
			if (isNull(r.ttl_gi_amt())) {
				r.avg_gi_amt(null);
			}
			else if (r.ttl_gi_amt().isZero()) {
				r.avg_gi_amt(MCNumber.ZERO);
			}
			else {
				r.avg_gi_amt((r.ttl_gi_amt().divide(r.cal_days(), RsltR.avg_gi_amt_META.scale(), MAC_RND_TYP.RNDUP.toMC())).stripTrailingZeros());
			}
		}
		
		protected String getCalCd(RsltR r) {
			
			if (!isNull(r.loc_cal_cd())) {
				return r.loc_cal_cd();
			}
			else if (!isNull(r.lg_grp_cal_cd())) {
				return r.lg_grp_cal_cd();
			}
			else {
				return getCo().std_cal_cd();
			}
		}
		
		protected void calcDays() {
			down0().addStringColumn("cal_cd");
			for (RsltR r : down0()) {
				r.setString("cal_cd", getCalCd(r));
			}
			
			MCList<RsltR> grpL = MCList.create(RsltR.class);
			if (up0().ym_flg()) {
				grpL = down0().groupBy(RsltR.$ac_ym ,"cal_cd");
				for (RsltR r : grpL) {
					r.setDateNE("ym_st", getYmStDt(r.ac_ym()));
					r.setDateNE("ym_end", getYmEndDt(r.ac_ym()));
				}
			}
			else {
				grpL = down0().groupBy("cal_cd");
				grpL.addDateColumn("ym_st", getYmStDt(up0().ym_fr()));
				grpL.addDateColumn("ym_end", getYmEndDt(up0().ym_to()));
			}
			
			// 対象年月の月初から月末までのカレンダの稼働日数を計算する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DAYS", "01"), MABCFunction.getFunctionExecuter("MAPA_DT$F_CAL_DAYS"), RsltR.$cal_days,
					grpL, "ym_st", "ym_end", "cal_cd");
			
			MCIndexKey grpLKey = grpL.createIndex(RsltR.$ac_ym, "cal_cd");
			for (RsltR r : down0()) {
				RsltR grpR = grpL.getFirst(grpLKey, r.ac_ym(), r.getStringNE("cal_cd"));
				r.cal_days(grpR.cal_days());
			}
		}
	}


	protected void setUpTmpCol(CndR up) {

		// 部門取得基準日
		up.addDateColumn("base_dt", getToday());

		// 納品先・配送先在庫を除く
		up.addStringColumn("only_int_true", toTrueStr(up.only_int_flg()));

		// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
		if (!isNull(up.itm_cd()) && !isNullAnd(up.sno1(), up.sno2(), up.sno3(), up.sno4())) {
			MAM_ITM_R itm = MAM_ITM_R.create();
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
			itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3"))));
			dbSelect("MSBEL0050_MAM_ITM_S01", itm, itm_bldr, up);
			if (!isNull(up.sno1()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
				up.sno1(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up.sno2()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
				up.sno2(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up.sno3()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
				up.sno3(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up.sno4()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
				up.sno4(MAC_STR.NULL_VAL.value());
			}
		}
	}

	/**
	 * 処理対象（品目）を取得するsqlを作成する
	 */
	protected MCQueryPlan getSql(CndR up0) {
		MCMainQuery query = null;
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			query = sql("MSBEL0050_MSW_MLY_STK_DTL_KEY_S01").mainQuery().selectDistinct(
					S1W.pr("itm_cd"),
					S1W.pr("itm_sub1"),
					S1W.pr("itm_sub2"),
					S1W.pr("itm_sub3"))
					.from(subQuery()
					.select(S2.itm_cd, S2.itm_sub1, S2.itm_sub2, S2.itm_sub3)
					.from(S2).unionAll(subQuery()
							.select(S3.itm_cd, S3.itm_sub1, S3.itm_sub2, S3.itm_sub3)
							.from(S3)).view(S1W));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			query = sql("MSBEL0050_MSW_MLY_STK_DTL_KEY_S02").mainQuery().selectDistinct(
					S2.itm_cd,
					S2.itm_sub1,
					S2.itm_sub2,
					S2.itm_sub3)
					.from(S2);
		}
		
		query = query.orderBy(pr(RsltR.$itm_cd).asc(),
				pr(RsltR.$itm_sub1).asc(),
				pr(RsltR.$itm_sub2).asc(),
				pr(RsltR.$itm_sub3).asc());
		
		return createQueryPlan().setQuery(query);
	}
	
	/**
	 * ソート項目
	 */
	protected String[] getOrderByCols() {
		List<String> cols = new ArrayList<String>();
		
		cols.add("ITM_CD");
		cols.add("ITM_SUB1");
		cols.add("ITM_SUB2");
		cols.add("ITM_SUB3");

		return cols.toArray(new String[cols.size()]);
	}
	
	/**
	 * 処理対象（品目）をワークに格納する
	 */
	protected void insItmWk(MCList<RsltR> down0) {
		delItmWk();
		
		MCList<MAM_ITM_R> wkL = MCList.create(MAM_ITM_R.class);
		for (RsltR r : down0) {
			MAM_ITM_R x = MAM_ITM_R.create();
			x.itm_cd(r.itm_cd());
			x.itm_sub1(r.itm_sub1());
			x.itm_sub2(r.itm_sub2());
			x.itm_sub3(r.itm_sub3());
			wkL.add(x);
		}
		
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		dbWkInsert("MSBEL0050_MAW_ITM_I01", wkL, wkL_bldr.getBaseDbc());
	}
	
	/**
	 * 処理対象（品目）をワークから削除する
	 */
	protected void delItmWk() {
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		dbWkDelete("MSBEL0050_MAW_ITM_D01", wkL_bldr.getBaseDbc());
	}
	
	/**
	 * 処理対象（月次受払情報）をワークから削除する
	 */
	protected void delMlyStkWk() {
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MLY_STK_DTL_R.create("T"));
		dbWkDelete("MSBEL0050_MSW_MLY_STK_DTL_D01", wkL_bldr.getBaseDbc());
	}
	
	/**
	 * 処理対象（滞留在庫情報）をワークから削除する
	 */
	protected void delNonMovStkWk() {
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_NON_MOV_STK_R.create("T"));
		dbWkDelete("MSBEL0050_MSW_NON_MOV_STK_D01", wkL_bldr.getBaseDbc());
	}
	
	/**
	 * ワークテーブルのデータ件数を取得する
	 */
	protected int cntWk(CndR up0) {
		int cnt = 0;
		MSW_MLY_STK_DTL_KEY_R T1 = MSW_MLY_STK_DTL_KEY_R.create("T");
		MCMainQuery msdk_query = sql("MSBEL0050_MSW_MLY_STK_DTL_KEY_S03").mainQuery().select(countAll().as("CNT")).from(T1);
		MCRow msdk_result = MCRow.create();
		msdk_query.executeQuery(msdk_result);
		cnt = msdk_result.getNumber("CNT").intValue();

		if (cnt == 0 && !isNull(up0.non_mov_cmp_ym())) {
			MSW_NON_MOV_STK_KEY_R T2 = MSW_NON_MOV_STK_KEY_R.create("T");
			MCMainQuery nmsk_query = sql("MSBL0050_MSW_NON_MOV_STK_KEY_S01").mainQuery().select(countAll().as("CNT")).from(T2);
			MCRow nmsk_result = MCRow.create();
			nmsk_query.executeQuery(nmsk_result);
			cnt = msdk_result.getNumber("CNT").intValue();
		}
		return cnt;
	}

	protected void getCache(CndR up0) {
		// 品目関連
		getItmCache(up0);
		// 諸口品
		getSiCache(up0);
		// 場所関連
		getLocCache(up0);
		// 棚・ライン
		getStrLnCache(up0);
		// 格付
		getStkGdCache(up0);
		// 案件
		getWrkSnoCache(up0);
		// 在庫取引先
		getStkBpCache(up0);
		// 在庫着荷先
		getStkArrvBpCache(up0);
		// 荷姿単位
		getUnitCache(up0);
	}

	protected void setCache(CndR up0, MCList<RsltR> down0) {
		for (RsltR r :down0) {
			// 品目関連、諸口品
			setItmCache(up0, r);
			// 場所関連
			setLocCache(up0, r);
			// 棚・ライン
			setStrLnCache(up0, r);
			// 格付
			setStkGdCache(up0, r);
			// 案件
			setWrkSnoCache(up0, r);
			// 在庫取引先
			setStkBpCache(r);
			// 在庫着荷先
			setStkArrvBpCache(r);
			// 荷姿単位
			setUnitCache(r);
		}
	}

	protected MCList<MAM_ITM_R> _itm = MCList.create(MAM_ITM_R.class);
	protected MCIndexKey _itmIdx;
	protected void getItmCache(CndR up0) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MAM_ITM_TYP_D_R m2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_UNIT_R m14 = MAM_UNIT_R.create("M14");
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
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));

		itm_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.itm_nm, t.itm_typ, t.itm_typ_d_cd, t.unit_cd);
		itm_bldr.addSelect(m2.itm_typ_d_nm, m14.unit_nm.as("base_unit_nm"));
		itm_bldr.addLeftOuterJoin(m2, bracket( t.itm_typ.eq(m2.itm_typ)
				.and(t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
		itm_bldr.addLeftOuterJoin(m14, bracket( t.unit_cd.eq(m14.unit_cd)));
		if (up0.itm_grp_flg1()) {
			itm_bldr.addSelect(t.itm_grp_cd1, mm1.itm_grp_nm.as("itm_grp_nm1"));
			itm_bldr.addLeftOuterJoin(mm1, bracket( mm1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(mm1.itm_grp_cd.eq(t.itm_grp_cd1))));
		}
		if (up0.itm_grp_flg2()) {
			itm_bldr.addSelect(t.itm_grp_cd2, mm2.itm_grp_nm.as("itm_grp_nm2"));
			itm_bldr.addLeftOuterJoin(mm2, bracket( mm2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(mm2.itm_grp_cd.eq(t.itm_grp_cd2))));
		}
		if (up0.itm_grp_flg3()) {
			itm_bldr.addSelect(t.itm_grp_cd3, mm3.itm_grp_nm.as("itm_grp_nm3"));
			itm_bldr.addLeftOuterJoin(mm3, bracket( mm3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(mm3.itm_grp_cd.eq(t.itm_grp_cd3))));
		}
		if (up0.itm_grp_flg4()) {
			itm_bldr.addSelect(t.itm_grp_cd4, mm4.itm_grp_nm.as("itm_grp_nm4"));
			itm_bldr.addLeftOuterJoin(mm4, bracket( mm4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(mm4.itm_grp_cd.eq(t.itm_grp_cd4))));
		}
		if (up0.itm_grp_flg5()) {
			itm_bldr.addSelect(t.itm_grp_cd5, mm5.itm_grp_nm.as("itm_grp_nm5"));
			itm_bldr.addLeftOuterJoin(mm5, bracket( mm5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(mm5.itm_grp_cd.eq(t.itm_grp_cd5))));
		}
		if (up0.itm_grp_flg6()) {
			itm_bldr.addSelect(t.itm_grp_cd6, mm6.itm_grp_nm.as("itm_grp_nm6"));
			itm_bldr.addLeftOuterJoin(mm6, bracket( mm6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(mm6.itm_grp_cd.eq(t.itm_grp_cd6))));
		}
		if (up0.itm_grp_flg7()) {
			itm_bldr.addSelect(t.itm_grp_cd7, mm7.itm_grp_nm.as("itm_grp_nm7"));
			itm_bldr.addLeftOuterJoin(mm7, bracket( mm7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(mm7.itm_grp_cd.eq(t.itm_grp_cd7))));
		}
		if (up0.itm_grp_flg8()) {
			itm_bldr.addSelect(t.itm_grp_cd8, mm8.itm_grp_nm.as("itm_grp_nm8"));
			itm_bldr.addLeftOuterJoin(mm8, bracket( mm8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(mm8.itm_grp_cd.eq(t.itm_grp_cd8))));
		}
		if (up0.itm_grp_flg9()) {
			itm_bldr.addSelect(t.itm_grp_cd9, mm9.itm_grp_nm.as("itm_grp_nm9"));
			itm_bldr.addLeftOuterJoin(mm9, bracket( mm9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(mm9.itm_grp_cd.eq(t.itm_grp_cd9))));
		}
		if (up0.itm_grp_flg10()) {
			itm_bldr.addSelect(t.itm_grp_cd10, mm10.itm_grp_nm.as("itm_grp_nm10"));
			itm_bldr.addLeftOuterJoin(mm10, bracket( mm10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(mm10.itm_grp_cd.eq(t.itm_grp_cd10))));
		}
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			itm_bldr.addWhereWithAnd(
					exists(subQuery()
							.select(value("X")).from(
									subQuery()
											.select(S2.itm_cd, S2.itm_sub1, S2.itm_sub2,
													S2.itm_sub3)
											.from(S2)
											.unionAll(subQuery()
													.select(S3.itm_cd, S3.itm_sub1,
															S3.itm_sub2, S3.itm_sub3)
													.from(S3))
											.view(S1W))
							.where(value(0).eq(value(0))
									.and(S1W.pr(S2.itm_cd).eq(t.itm_cd))
									.and(S1W.pr(S2.itm_sub1).eq(t.itm_sub1))
									.and(S1W.pr(S2.itm_sub2).eq(t.itm_sub2))
									.and(S1W.pr(S2.itm_sub3).eq(t.itm_sub3)))));
		}
		else { 
			MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
			itm_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
					.where(value(0).eq(value(0)).and(W.itm_cd.eq(t.itm_cd))
							.and(W.itm_sub1.eq(t.itm_sub1))
							.and(W.itm_sub2.eq(t.itm_sub2))
							.and(W.itm_sub3.eq(t.itm_sub3)))));
		}
		dbSelect("MSBEL0050_MAM_ITM_S02", _itm, itm_bldr);
		_itmIdx = _itm.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}

	protected MCList<MAM_SUNDRY_ITM_R> _si = MCList.create(MAM_SUNDRY_ITM_R.class);
	protected MCIndexKey _siIdx;
	protected void getSiCache(CndR up0) {
		MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
		MCQueryApiBuilder si_bldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));

		si_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sno1, t.sno2, t.sno3, t.sno4, t.itm_nm);
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			si_bldr.addWhereWithAnd(
					exists(subQuery().select(value("X"))
							.from(subQuery().select(S2.itm_cd, S2.itm_sub1, S2.itm_sub2,
									S2.itm_sub3, S2.sno1, S2.sno2, S2.sno3, S2.sno4)
									.from(S2)
									.unionAll(subQuery().select(S3.itm_cd, S3.itm_sub1,
											S3.itm_sub2, S3.itm_sub3, S3.sno1, S3.sno2,
											S3.sno3, S3.sno4).from(S3))
									.view(S1W))
							.where(value(0).eq(value(0))
									.and(S1W.pr(S2.itm_cd).eq(t.itm_cd))
									.and(S1W.pr(S2.itm_sub1).eq(t.itm_sub1))
									.and(S1W.pr(S2.itm_sub2).eq(t.itm_sub2))
									.and(S1W.pr(S2.itm_sub3).eq(t.itm_sub3))
									.and(S1W.pr(S2.sno1).eq(t.sno1))
									.and(S1W.pr(S2.sno2).eq(t.sno2))
									.and(S1W.pr(S2.sno3).eq(t.sno3))
									.and(S1W.pr(S2.sno4).eq(t.sno4)))));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
			si_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
					.where(value(0).eq(value(0)).and(W.itm_cd.eq(t.itm_cd))
							.and(W.itm_sub1.eq(t.itm_sub1))
							.and(W.itm_sub2.eq(t.itm_sub2))
							.and(W.itm_sub3.eq(t.itm_sub3)).and(W.sno1.eq(t.sno1))
							.and(W.sno2.eq(t.sno2)).and(W.sno3.eq(t.sno3))
							.and(W.sno4.eq(t.sno4)))));
		}
		dbSelect("MSBEL0050_MAM_SUNDRY_ITM_S01", _si, si_bldr);
		_siIdx = _si.createIndex(MAM_SUNDRY_ITM_R.$itm_cd, MAM_SUNDRY_ITM_R.$itm_sub1, MAM_SUNDRY_ITM_R.$itm_sub2, MAM_SUNDRY_ITM_R.$itm_sub3, MAM_SUNDRY_ITM_R.$sno1, MAM_SUNDRY_ITM_R.$sno2, MAM_SUNDRY_ITM_R.$sno3, MAM_SUNDRY_ITM_R.$sno4);
	}

	protected MCList<MAM_LOC_R> _loc = MCList.create(MAM_LOC_R.class);
	protected MCIndexKey _locIdx;
	protected void getLocCache(CndR up0) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MAM_LG_GRP_R m6 = MAM_LG_GRP_R.create("M6");
		MAM_SITE_R m4 = MAM_SITE_R.create("M4");
		MAM_WG_R m5 = MAM_WG_R.create("M5");
		MAM_ALLOC_GRP_R m7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R m8 = MAM_LOC_GRP_R.create("M8");
		MAM_DPT_R m18 = MAM_DPT_R.create("M18");
		MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));

		loc_bldr.setSelect(t.loc_cd, t.loc_nm, t.wg_cd, t.site_cd, t.lg_grp_cd, t.loc_grp_cd, t.alloc_grp_cd, t.sppl_cd);
		loc_bldr.addSelect(nvl( t.cal_cd, m6.cal_cd).as("loc_cal_cd"));
		loc_bldr.addLeftOuterJoin(m6, bracket( t.lg_grp_cd.eq(m6.lg_grp_cd)));
		if (up0.site_flg()) {
			loc_bldr.addSelect(m4.site_nm);
			loc_bldr.addLeftOuterJoin(m4, bracket( t.site_cd.eq(m4.site_cd)));
		}
		if (up0.wg_flg()) {
			loc_bldr.addSelect(m5.wg_nm);
			loc_bldr.addLeftOuterJoin(m5, bracket( t.wg_cd.eq(m5.wg_cd)));
		}
		if (up0.lg_grp_flg()) {
			loc_bldr.addSelect(m6.lg_grp_nm,m6.cal_cd.as("lg_grp_cal_cd"));
		}
		if (up0.alloc_grp_flg()) {
			loc_bldr.addSelect(m7.alloc_grp_nm);
			loc_bldr.addLeftOuterJoin(m7, bracket( t.alloc_grp_cd.eq(m7.alloc_grp_cd)));
		}
		if (up0.loc_grp_flg()) {
			loc_bldr.addSelect(m8.loc_grp_nm);
			loc_bldr.addLeftOuterJoin(m8, bracket( t.loc_grp_cd.eq(m8.loc_grp_cd)));
		}
		if (up0.dpt_flg()) {
			loc_bldr.addSelect(MAPA_LOC$F_GET_ASST_DPT_CD_NE( t.loc_cd, bind("base_dt"), value(false)).as("dpt_cd"),m18.dpt_nm);
			loc_bldr.addLeftOuterJoin(m18, bracket( MAPA_LOC$F_GET_ASST_DPT_CD_NE( t.loc_cd, bind("base_dt"), value(false) ).eq(m18.dpt_cd)
					.and(bind("base_dt").between(m18.st_dt, m18.end_dt))));
		}
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();

			loc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
					.from(subQuery().select(S2.loc_cd).from(S2)
							.unionAll(subQuery().select(S3.loc_cd).from(S3)).view(S1W))
					.where(value(0).eq(value(0))
							.and(S1W.pr(S2.loc_cd).eq(t.loc_cd)))));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R S1W = MSW_MLY_STK_DTL_KEY_R.create("W");

			loc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
					.where(value(0).eq(value(0))
							.and(S1W.loc_cd.eq(t.loc_cd)))));
		}
		MCRow row = MCRow.create();
		row.addDateColumn("base_dt", getToday());
		dbSelect("MSBEL0050_MAM_LOC_S01", _loc, loc_bldr, row);
		_locIdx = _loc.createIndex(MAM_LOC_R.$loc_cd);
	}

	protected MCList<MAM_STR_LN_R> _strLn = MCList.create(MAM_STR_LN_R.class);
	protected MCIndexKey _strLnIdx;
	protected void getStrLnCache(CndR up0) {
		MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
		MCQueryApiBuilder strLn_bldr = MCQueryApiBuilder.create(MAM_STR_LN_R.create("T"));
		
		if (up0.str_ln_flg()) {
			strLn_bldr.setSelect(t.loc_cd, t.str_ln_cd, t.str_ln_nm);
			if (!isNull(up0.non_mov_cmp_ym())) {
				MCTempView S1W = createTempView("W");
				MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
				MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
				strLn_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
						.from(subQuery().select(S2.loc_cd).from(S2)
								.unionAll(subQuery().select(S3.loc_cd).from(S3))
								.view(S1W))
						.where(value(0).eq(value(0))
								.and(S1W.pr(S2.loc_cd).eq(t.loc_cd)))));
			}
			else {
				MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
				strLn_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
						.where(value(0).eq(value(0))
								.and(W.loc_cd.eq(t.loc_cd)))));
			}
			dbSelect("MSBEL0050_MAM_STR_LN_S01", _strLn, strLn_bldr);
			_strLnIdx = _strLn.createIndex(MAM_STR_LN_R.$loc_cd, MAM_STR_LN_R.$str_ln_cd);
		}
	}

	protected MCList<MAM_STK_GD_R> _stkGd = MCList.create(MAM_STK_GD_R.class);
	protected MCIndexKey _stkGdIdx;
	protected void getStkGdCache(CndR up0) {
		MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
		MCQueryApiBuilder stkGd_bldr = MCQueryApiBuilder.create(MAM_STK_GD_R.create("T"));

		if (up0.gd_flg()) {
			stkGd_bldr.setSelect(t.gd_cd, t.gd_nm);
			if (!isNull(up0.non_mov_cmp_ym())) {
				MCTempView S1W = createTempView("W");
				MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
				MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
				stkGd_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
						.from(subQuery().select(S2.gd_cd).from(S2)
								.unionAll(subQuery().select(S3.gd_cd).from(S3)).view(S1W))
						.where(value(0).eq(value(0))
								.and(S1W.pr(S2.gd_cd).eq(t.gd_cd)))));
			}
			else {
				MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
				stkGd_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
						.where(value(0).eq(value(0))
								.and(W.gd_cd.eq(t.gd_cd)))));
			}
			dbSelect("MSBEL0050_MAM_STK_GD_S01", _stkGd, stkGd_bldr);
			_stkGdIdx = _stkGd.createIndex(MAM_STK_GD_R.$gd_cd);
		}
	}

	protected MCList<MSVT_WRK_SNO_R> _wrkSno = MCList.create(MSVT_WRK_SNO_R.class);
	protected MCIndexKey _wrkSnoIdx;
	protected void getWrkSnoCache(CndR up0) {
		MSVT_WRK_SNO_R t = MSVT_WRK_SNO_R.create("T");
		MCQueryApiBuilder wrkSno_bldr = MCQueryApiBuilder.create(MSVT_WRK_SNO_R.create("T"));

		if (up0.sno1_flg()) {
			wrkSno_bldr.setSelect(t.sno1, t.wrk_no, t.wrk_nm);
			if (!isNull(up0.non_mov_cmp_ym())) {
				MCTempView S1W = createTempView("W");
				MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
				MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
				wrkSno_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
						.from(subQuery().select(S2.sno1).from(S2)
								.unionAll(subQuery().select(S3.sno1).from(S3)).view(S1W))
						.where(value(0).eq(value(0))
								.and(S1W.pr(S2.sno1).eq(t.sno1)))));
			}
			else {
				MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
				wrkSno_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
						.where(value(0).eq(value(0))
								.and(W.sno1.eq(t.sno1)))));
			}
			dbSelect("MSBEL0050_MSVT_WRK_SNO_S01", _wrkSno, wrkSno_bldr);
			_wrkSnoIdx = _wrkSno.createIndex(MSVT_WRK_SNO_R.$sno1);
		}
	}
	
	protected MCList<MAM_BP_R> _stkBp = MCList.create(MAM_BP_R.class);
	protected MCIndexKey _stkBpIdx;
	protected void getStkBpCache(CndR up0) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder stkBp_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
		
		stkBp_bldr.setSelect(t.bp_cd, t.bp_nm);
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			stkBp_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
					.from(subQuery().select(S2.stk_bp_cd).from(S2)
							.unionAll(subQuery().select(S3.stk_bp_cd).from(S3)).view(S1W))
					.where(value(0).eq(value(0))
							.and(S1W.pr(S2.stk_bp_cd).eq(t.bp_cd)))));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
			stkBp_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
					.where(value(0).eq(value(0))
							.and(W.stk_bp_cd.eq(t.bp_cd)))));
		}
		dbSelect("MSBEL0050_MAM_BP_S01", _stkBp, stkBp_bldr);
		_stkBpIdx = _stkBp.createIndex(MAM_BP_R.$bp_cd);
	}

	protected MCList<MAM_BP_R> _stkArrvBp = MCList.create(MAM_BP_R.class);
	protected MCIndexKey _stkArrvBpIdx;
	protected void getStkArrvBpCache(CndR up0) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder stkArrvBp_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));

		stkArrvBp_bldr.setSelect(t.bp_cd, t.bp_nm);
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			stkArrvBp_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
					.from(subQuery().select(S2.stk_arrv_bp_cd).from(S2)
							.unionAll(subQuery().select(S3.stk_arrv_bp_cd).from(S3))
							.view(S1W))
					.where(value(0).eq(value(0))
							.and(S1W.pr(S2.stk_arrv_bp_cd).eq(t.bp_cd)))));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
			stkArrvBp_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
					.where(value(0).eq(value(0))
							.and(W.stk_arrv_bp_cd.eq(t.bp_cd)))));
		}
		dbSelect("MSBEL0050_MAM_BP_S02", _stkArrvBp, stkArrvBp_bldr);
		_stkArrvBpIdx = _stkArrvBp.createIndex(MAM_BP_R.$bp_cd);
	}

	protected MCList<MAM_UNIT_R> _unit = MCList.create(MAM_UNIT_R.class);
	protected MCIndexKey _unitIdx;
	protected void getUnitCache(CndR up0) {
		MAM_UNIT_R t = MAM_UNIT_R.create("T");
		MCQueryApiBuilder unit_bldr = MCQueryApiBuilder.create(MAM_UNIT_R.create("T"));
		
		unit_bldr.setSelect(t.unit_cd, t.unit_nm, t.dec_place);
		if (!isNull(up0.non_mov_cmp_ym())) {
			MCTempView S1W = createTempView("W");
			MSW_MLY_STK_DTL_KEY_R S2 = MSW_MLY_STK_DTL_KEY_R.create();
			MSW_NON_MOV_STK_KEY_R S3 = MSW_NON_MOV_STK_KEY_R.create();
			unit_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
					.from(subQuery().select(S2.pack_unit_cd).from(S2)
							.unionAll(subQuery().select(S3.pack_unit_cd).from(S3))
							.view(S1W))
					.where(value(0).eq(value(0))
							.and(S1W.pr(S2.pack_unit_cd).eq(t.unit_cd)))));
		}
		else {
			MSW_MLY_STK_DTL_KEY_R W = MSW_MLY_STK_DTL_KEY_R.create("W");
			unit_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(W)
					.where(value(0).eq(value(0))
							.and(W.pack_unit_cd.eq(t.unit_cd)))));
		}
		dbSelect("MSBEL0050_MAM_UNIT_S01", _unit, unit_bldr);
		_unitIdx = _unit.createIndex(MAM_UNIT_R.$unit_cd);
	}

	protected void setItmCache(CndR up0, RsltR r) {
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
			r.base_unit_cd(itm.unit_cd());
			r.base_unit_nm(itm.getString("BASE_UNIT_NM"));
			if (up0.itm_grp_flg1()) {r.itm_grp_cd1(itm.itm_grp_cd1()); r.itm_grp_nm1(itm.getString("ITM_GRP_NM1"));}
			if (up0.itm_grp_flg2()) {r.itm_grp_cd2(itm.itm_grp_cd2()); r.itm_grp_nm2(itm.getString("ITM_GRP_NM2"));}
			if (up0.itm_grp_flg3()) {r.itm_grp_cd3(itm.itm_grp_cd3()); r.itm_grp_nm3(itm.getString("ITM_GRP_NM3"));}
			if (up0.itm_grp_flg4()) {r.itm_grp_cd4(itm.itm_grp_cd4()); r.itm_grp_nm4(itm.getString("ITM_GRP_NM4"));}
			if (up0.itm_grp_flg5()) {r.itm_grp_cd5(itm.itm_grp_cd5()); r.itm_grp_nm5(itm.getString("ITM_GRP_NM5"));}
			if (up0.itm_grp_flg6()) {r.itm_grp_cd6(itm.itm_grp_cd6()); r.itm_grp_nm6(itm.getString("ITM_GRP_NM6"));}
			if (up0.itm_grp_flg7()) {r.itm_grp_cd7(itm.itm_grp_cd7()); r.itm_grp_nm7(itm.getString("ITM_GRP_NM7"));}
			if (up0.itm_grp_flg8()) {r.itm_grp_cd8(itm.itm_grp_cd8()); r.itm_grp_nm8(itm.getString("ITM_GRP_NM8"));}
			if (up0.itm_grp_flg9()) {r.itm_grp_cd9(itm.itm_grp_cd9()); r.itm_grp_nm9(itm.getString("ITM_GRP_NM9"));}
			if (up0.itm_grp_flg10()) {r.itm_grp_cd10(itm.itm_grp_cd10()); r.itm_grp_nm10(itm.getString("ITM_GRP_NM10"));}
		}
	}

	protected void setLocCache(CndR up0, RsltR r) {
		MAM_LOC_R loc = _loc.getFirst(_locIdx, r.loc_cd());
		if (!isNull(loc)) {
			if (up0.wg_flg()) {r.wg_cd(loc.wg_cd()); r.wg_nm(loc.getString(MAM_WG_R.$wg_nm));}
			if (up0.dpt_flg()) {r.dpt_cd(loc.getString("DPT_CD")); r.dpt_nm(loc.getString(MAM_DPT_R.$dpt_nm));}
			r.loc_nm(loc.loc_nm());
			r.loc_cal_cd(loc.getString("LOC_CAL_CD"));
			if (up0.site_flg()) {r.site_cd(loc.site_cd()); r.site_nm(loc.getString(MAM_SITE_R.$site_nm));}
			if (up0.lg_grp_flg()) {
				r.lg_grp_cd(loc.lg_grp_cd());
				r.lg_grp_nm(loc.getString(MAM_LG_GRP_R.$lg_grp_nm));
				r.lg_grp_cal_cd(loc.getString("LG_GRP_CAL_CD"));
			}
			if (up0.site_flg()) {r.site_cd(loc.site_cd()); r.site_nm(loc.getString(MAM_SITE_R.$site_nm));}
			if (up0.lg_grp_flg()) {r.lg_grp_cd(loc.lg_grp_cd()); r.lg_grp_nm(loc.getString(MAM_LG_GRP_R.$lg_grp_nm));}
			if (up0.alloc_grp_flg()) {r.alloc_grp_cd(loc.alloc_grp_cd()); r.alloc_grp_nm(loc.getString(MAM_ALLOC_GRP_R.$alloc_grp_nm));}
			if (up0.loc_grp_flg()) {r.loc_grp_cd(loc.loc_grp_cd()); r.loc_grp_nm(loc.getString(MAM_LOC_GRP_R.$loc_grp_nm));}
		}
	}

	protected void setStrLnCache(CndR up0, RsltR r) {
		if (up0.str_ln_flg()) {
			MAM_STR_LN_R strLn = _strLn.getFirst(_strLnIdx, r.loc_cd(), r.str_ln_cd());
			if (!isNull(strLn)) {
				r.str_ln_nm(strLn.str_ln_nm());
			}
		}
	}

	protected void setStkGdCache(CndR up0, RsltR r) {
		if (up0.gd_flg()) {
			MAM_STK_GD_R stkGd = _stkGd.getFirst(_stkGdIdx, r.gd_cd());
			if (!isNull(stkGd)) r.gd_nm(stkGd.gd_nm());
		}
	}

	protected void setWrkSnoCache(CndR up0, RsltR r) {
		if (up0.sno1_flg()) {
			MSVT_WRK_SNO_R wrkSno = _wrkSno.getFirst(_wrkSnoIdx, r.sno1());
			if (!isNull(wrkSno)) {
				r.wrk_no(wrkSno.wrk_no());
				r.wrk_nm(wrkSno.wrk_nm());
			}
		}
	}

	protected void setStkBpCache(RsltR r) {
		MAM_BP_R stkBp = _stkBp.getFirst(_stkBpIdx, r.stk_bp_cd());
		if (!isNull(stkBp)) r.stk_bp_nm(stkBp.bp_nm());
	}

	protected void setStkArrvBpCache(RsltR r) {
		MAM_BP_R stkArrvBp = _stkArrvBp.getFirst(_stkArrvBpIdx, r.stk_arrv_bp_cd());
		if (!isNull(stkArrvBp)) r.stk_arrv_bp_nm(stkArrvBp.bp_nm());
	}

	protected void setUnitCache(RsltR r) {
		MAM_UNIT_R packUnit = _unit.getFirst(_unitIdx, r.pack_unit_cd());
		MAM_UNIT_R baseUnit = _unit.getFirst(_unitIdx, r.base_unit_cd());
		if (!isNull(packUnit)) {
			r.pack_unit_nm(packUnit.unit_nm());
			r.pack_unit_dec_place(packUnit.dec_place());
		}
		if (!isNull(baseUnit)) {
			r.base_unit_nm(baseUnit.unit_nm());
			r.base_unit_dec_place(baseUnit.dec_place());
		}
	}
	
	protected void setRemoveArray(List<String> removeArray, CndR up0) {
		setRemoveArrayYm(removeArray, up0);
		setRemoveArrayDpt(removeArray, up0);
		setRemoveArrayWg(removeArray, up0);
		setRemoveArrayLoc(removeArray, up0);
		setRemoveArrayStrLn(removeArray, up0);
		setRemoveArrayStkArrvBp(removeArray, up0);
		setRemoveArraySite(removeArray, up0);
		setRemoveArrayLocGrp(removeArray, up0);
		setRemoveArrayLgGrp(removeArray, up0);
		setRemoveArrayAllocGrp(removeArray, up0);
		setRemoveArrayPackUnit(removeArray, up0);
		setRemoveArrayGd(removeArray, up0);
		setRemoveArrayLot(removeArray, up0);
		setRemoveArraySublot(removeArray, up0);
		setRemoveArraySno1(removeArray, up0);
		setRemoveArraySno2(removeArray, up0);
		setRemoveArraySno3(removeArray, up0);
		setRemoveArraySno4(removeArray, up0);
	}
	
	protected void setRemoveArrayYm(List<String> removeArray, CndR up0) {
		if (!up0.ym_flg()) {
			removeArray.add(RsltR.$ac_ym);
		}
	}
	
	protected void setRemoveArrayDpt(List<String> removeArray, CndR up0) {
		if (!up0.dpt_flg()) {
			removeArray.add(RsltR.$dpt_cd);
			removeArray.add(RsltR.$dpt_nm);
		}
	}

	protected void setRemoveArrayWg(List<String> removeArray, CndR up0) {
		if (!up0.wg_flg()) {
			removeArray.add(RsltR.$wg_cd);
			removeArray.add(RsltR.$wg_nm);
			removeArray.add(RsltR.$std_unit_cost);
			removeArray.add(RsltR.$stk_amt);
			removeArray.add(RsltR.$ttl_gi_amt);
			removeArray.add(RsltR.$avg_stk_amt);
			removeArray.add(RsltR.$base_cur_cd);
			removeArray.add(RsltR.$base_cur_nm);
			removeArray.add(RsltR.$stk_amt_rnd_typ);
			removeArray.add(RsltR.$stk_amt_dec_place);
		}
	}

	protected void setRemoveArrayLoc(List<String> removeArray, CndR up0) {
		if (!up0.loc_flg()) {
			removeArray.add(RsltR.$loc_cd);
			removeArray.add(RsltR.$loc_nm);
			removeArray.add(RsltR.$loc_cal_cd);
		}
	}

	protected void setRemoveArrayStrLn(List<String> removeArray, CndR up0) {
		if (!up0.str_ln_flg()) {
			removeArray.add(RsltR.$str_ln_cd);
			removeArray.add(RsltR.$str_ln_nm);
			removeArray.add(RsltR.$str_ln_cd_none_flg);
		}
	}

	protected void setRemoveArrayStkArrvBp(List<String> removeArray, CndR up0) {
		if (!up0.stk_arrv_bp_flg()) {
			removeArray.add(RsltR.$stk_arrv_bp_cd);
			removeArray.add(RsltR.$stk_arrv_bp_nm);
		}
	}

	protected void setRemoveArraySite(List<String> removeArray, CndR up0) {
		if (!up0.site_flg()) {
			removeArray.add(RsltR.$site_cd);
			removeArray.add(RsltR.$site_nm);
		}
	}

	protected void setRemoveArrayLgGrp(List<String> removeArray, CndR up0) {
		if (!up0.lg_grp_flg()) {
			removeArray.add(RsltR.$lg_grp_cd);
			removeArray.add(RsltR.$lg_grp_nm);
			removeArray.add(RsltR.$lg_grp_cal_cd);
		}
	}

	protected void setRemoveArrayAllocGrp(List<String> removeArray, CndR up0) {
		if (!up0.alloc_grp_flg()) {
			removeArray.add(RsltR.$alloc_grp_cd);
			removeArray.add(RsltR.$alloc_grp_nm);
		}
	}

	protected void setRemoveArrayPackUnit(List<String> removeArray, CndR up0) {
		if (!up0.pack_unit_flg()) {
			removeArray.add(RsltR.$pack_unit_qty);
			removeArray.add(RsltR.$ttl_gi_qty);
			removeArray.add(RsltR.$avg_stk_qty);
			removeArray.add(RsltR.$pack_unit_cd);
			removeArray.add(RsltR.$pack_unit_nm);
			removeArray.add(RsltR.$pack_unit_dec_place);
		}
	}

	protected void setRemoveArrayLocGrp(List<String> removeArray, CndR up0) {
		if (!up0.loc_grp_flg()) {
			removeArray.add(RsltR.$loc_grp_cd);
			removeArray.add(RsltR.$loc_grp_nm);
		}
	}

	protected void setRemoveArrayGd(List<String> removeArray, CndR up0) {
		if (!up0.gd_flg()) {
			removeArray.add(RsltR.$gd_cd);
			removeArray.add(RsltR.$gd_nm);
		}
	}

	protected void setRemoveArrayLot(List<String> removeArray, CndR up0) {
		if (!up0.lot_flg()) {
			removeArray.add(RsltR.$lot_no);
		}
	}

	protected void setRemoveArraySublot(List<String> removeArray, CndR up0) {
		if (!up0.sublot_flg()) {
			removeArray.add(RsltR.$sublot_no);
		}
	}

	protected void setRemoveArraySno1(List<String> removeArray, CndR up0) {
		if (!up0.sno1_flg()) {
			removeArray.add(RsltR.$sno1);
			removeArray.add(RsltR.$wrk_no);
			removeArray.add(RsltR.$wrk_nm);
		}
	}

	protected void setRemoveArraySno2(List<String> removeArray, CndR up0) {
		if (!up0.sno2_flg()) {
			removeArray.add(RsltR.$sno2);
		}
	}

	protected void setRemoveArraySno3(List<String> removeArray, CndR up0) {
		if (!up0.sno3_flg()) {
			removeArray.add(RsltR.$sno3);
		}
	}

	protected void setRemoveArraySno4(List<String> removeArray, CndR up0) {
		if (!up0.sno4_flg()) {
			removeArray.add(RsltR.$sno4);
		}
	}

	//FMCB CUSTOM END
}