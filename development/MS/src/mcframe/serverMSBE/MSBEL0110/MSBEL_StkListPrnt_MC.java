package mcframe.serverMSBE.MSBEL0110;

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
import mcframe.serverMSBE.MSBEL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import mcframe.serverCore.sys.MCSys;
import mcframe.commonMSBE.MSBER0010.*;
import mcframe.serverMSBE.MSBEL5930.*;
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBC.MSBCL6110.*;
import mcframe.serverCore.report.MCServerReportManager;
import static mcframe.serverMSBE.MSBEL0110.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMA.dbc.MAFunction.*;
import mcframe.serverCore.dbc.FCM_CO_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkListPrnt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkListPrnt_MC extends MSBEL_StkListPrnt_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 現品情報を検索します。<br>
	 */
	public class Srch01 extends MSBEL_StkListPrnt_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
			srchDtl();
			setQty();
			setName();
		}

		/**
		 * 現品情報を検索する
		 */
		protected void srchDtl() {

			if (!isNull(up0().get(0).arr_act_no())) {

				MCList<MST_ARR_ACT_R> arrActL = srchArrAct();
				addAll(down0(), arrActL, createMap_Srch01_DtlR_MST_ARR_ACT_R());
			}
			else if (!isNull(up0().get(0).ship_act_no())) {

				MCList<MST_SHIP_ACT_D_R> shipActDL = srchShipActD();
				addAll(down0(), shipActDL, createMap_Srch01_DtlR_MST_SHIP_ACT_D_R());
			}
			else if (!isNull(up0().get(0).ship_inst_no())) {

				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = srchShipAllocSts();
				addAll(down0(), shipAllocStsL, createMap_Srch01_DtlR_MST_SHIP_ALLOC_STS_R());
			}
			else if (!isNull(up0().get(0).mfg_act_no())) {

				MCList<MST_YIELD_ACT_R> yieldActL = srchYieldAct();
				addAll(down0(), yieldActL, createMap_Srch01_DtlR_MST_YIELD_ACT_R());
			}
			else if (!isNull(up0().get(0).mfg_inst_no())) {

				MCList<MST_YIELD_SCHD_R> yieldSchdL = srchYieldSchd();
				addAll(down0(), yieldSchdL, createMap_Srch01_DtlR_MST_YIELD_SCHD_R());
			}
			else {

				MCList<Srch01_DtlR> stkL = srchStk();
				down0().addAll(stkL);
			}
			if (down0().isEmpty()) {
				throw new MCAppException(MAUDL0029);
			}
		}

		/**
		 * 入荷実績情報を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_ARR_ACT_R> srchArrAct() {

			MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t);

			insArrWk(up0());

			arrActL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.lot_no,
					t.sublot_no,
					t.stk_lst_prnt_flg,
					t.pack_unit_cd,
					t.pack_unit_qty,
					t.base_unit_cd,
					t.base_unit_qty,
					t.arr_loc_cd.as("loc_cd"),
					t.str_ln_cd,
					t.quality_typ,
					t.gd_cd,
					t.stk_arrv_bp_cd,
					t.arr_act_no,
					t.arr_dpt_cd,
					t.arr_usr_cd,
					t.sub_char1.as("arr_act_sub_char1"),
					t.sub_char2.as("arr_act_sub_char2"),
					t.sub_char3.as("arr_act_sub_char3"));

			// 入荷実績ＷＫ
			MSW_ARR_ACT_KEY_R w = MSW_ARR_ACT_KEY_R.create("W");
			arrActL_bldr.addInnerJoin(w, bracket(t.arr_act_no.eq(w.arr_act_no)));

			// ロット管理情報
			MSVT_LOT_LIST_R t1 = MSVT_LOT_LIST_R.create("T1");
			arrActL_bldr.addLeftOuterJoin(t1,
					bracket(t.itm_cd.eq(t1.itm_cd)
							.and(t.itm_sub1.eq(t1.itm_sub1))
							.and(t.itm_sub2.eq(t1.itm_sub2))
							.and(t.itm_sub3.eq(t1.itm_sub3))
							.and(t.lot_no.eq(t1.lot_no))
							.and(t.sublot_no.eq(t1.sublot_no))));
			arrActL_bldr.addSelect(t1.ver_no);
			arrActL_bldr.addSelect(t1.bp_lot_no);
			arrActL.addBooleanColumn("unreg_lmt_flg");
			arrActL_bldr.addSelect(t1.unreg_lmt_flg);
			arrActL_bldr.addSelect(t1.vld_dt);
			arrActL_bldr.addSelect(t1.lmt_dt);
			arrActL_bldr.addSelect(t1.lot_rmrks);

			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			//案件紐つき情報
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			arrActL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			arrActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t2.wrk_no).as("wrk_no"));
			arrActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t2.wrk_nm).as("wrk_nm"));

			MAM_SUNDRY_ITM_R m11 = MAM_SUNDRY_ITM_R.create("M11");
			// 品目マスタ
			arrActL_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			arrActL_bldr.addSelect(decode(t.sundry_itm_flg, value(true),
					nvl(t.itm_nm, m11.itm_nm), m1.itm_nm).as("itm_nm"));
			arrActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno1).as("sno1"));
			arrActL_bldr.addSelect(decode(m1.sno2_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno2).as("sno2"));
			arrActL_bldr.addSelect(decode(m1.sno3_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno3).as("sno3"));
			arrActL_bldr.addSelect(decode(m1.sno4_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno4).as("sno4"));
			arrActL_bldr.addSelect(m1.itm_alt_nm1);
			arrActL_bldr.addSelect(m1.itm_alt_nm2);
			arrActL_bldr.addSelect(m1.itm_alt_nm3);
			arrActL_bldr.addSelect(m1.itm_alt_nm4);

			// 単位マスタ（基準単位）
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAVM_ITM_UNIT_R m3iu = MAVM_ITM_UNIT_R.create("M3IU");
			arrActL_bldr.addLeftOuterJoin(m3, bracket(t.base_unit_cd.eq(m3.unit_cd)));
			arrActL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			arrActL_bldr.addLeftOuterJoin(m3iu,
					bracket(t.itm_cd.eq(m3iu.itm_cd)
							.and(t.itm_sub1.eq(m3iu.itm_sub1))
							.and(t.itm_sub2.eq(m3iu.itm_sub2))
							.and(t.itm_sub3.eq(m3iu.itm_sub3))
							.and(t.base_unit_cd.eq(m3iu.unit_cd))));
			arrActL_bldr.addSelect(m3iu.dec_place.as("base_unit_dec_place"));
			arrActL_bldr.addSelect(m3iu.rnd_typ.as("base_unit_rnd_typ"));

			// 単位マスタ（荷姿単位）
			MAM_UNIT_R m4 = MAM_UNIT_R.create("M4");
			MAVM_ITM_UNIT_R m4iu = MAVM_ITM_UNIT_R.create("M4IU");
			arrActL_bldr.addLeftOuterJoin(m4, bracket(t.pack_unit_cd.eq(m4.unit_cd)));
			arrActL_bldr.addSelect(m4.unit_nm.as("pack_unit_nm"));
			arrActL_bldr.addLeftOuterJoin(m4iu,
					bracket(t.itm_cd.eq(m4iu.itm_cd)
							.and(t.itm_sub1.eq(m4iu.itm_sub1))
							.and(t.itm_sub2.eq(m4iu.itm_sub2))
							.and(t.itm_sub3.eq(m4iu.itm_sub3))
							.and(t.pack_unit_cd.eq(m4iu.unit_cd))));
			arrActL_bldr.addSelect(m4iu.dec_place.as("pack_unit_dec_place"));

			MAM_LOC_R m5 = MAM_LOC_R.create("M5");
			// 場所マスタ
			arrActL_bldr.addLeftOuterJoin(m5, bracket(t.arr_loc_cd.eq(m5.loc_cd)));
			arrActL_bldr.addSelect(m5.loc_nm);
			arrActL_bldr.addSelect(m5.site_cd);
			arrActL_bldr.addSelect(m5.wg_cd);
			arrActL_bldr.addSelect(m5.loc_grp_cd);

			// 棚･ラインマスタ
			MAM_STR_LN_R m6 = MAM_STR_LN_R.create("M6");
			arrActL_bldr.addLeftOuterJoin(m6, bracket(
					t.arr_loc_cd.eq(m6.loc_cd)
					.and(t.str_ln_cd.eq(m6.str_ln_cd))));
			arrActL_bldr.addSelect(m6.str_ln_nm);

			// 工場･物流倉庫マスタ
			MAM_SITE_R m7 = MAM_SITE_R.create("M7");
			arrActL_bldr.addLeftOuterJoin(m7, bracket(m5.site_cd.eq(m7.site_cd)));
			arrActL_bldr.addSelect(m7.site_nm);

			// ワーキンググループマスタ
			MAM_WG_R m8 = MAM_WG_R.create("M8");
			arrActL_bldr.addLeftOuterJoin(m8, bracket(m5.wg_cd.eq(m8.wg_cd)));
			arrActL_bldr.addSelect(m8.wg_nm);

			// 製造場所グループマスタ
			MAM_LOC_GRP_R m9 = MAM_LOC_GRP_R.create("M9");
			arrActL_bldr.addLeftOuterJoin(m9, bracket(m5.loc_grp_cd.eq(m9.loc_grp_cd)));
			arrActL_bldr.addSelect(m9.loc_grp_nm);

			// 格付マスタ
			MAM_STK_GD_R m10 = MAM_STK_GD_R.create("M10");
			arrActL_bldr.addLeftOuterJoin(m10, bracket(t.gd_cd.eq(m10.gd_cd)));
			arrActL_bldr.addSelect(m10.gd_nm);

			//諸口品マスタ
			arrActL_bldr.addLeftOuterJoin(m11,
					bracket(t.itm_cd.eq(m11.itm_cd)
							.and(t.itm_sub1.eq(m11.itm_sub1))
							.and(t.itm_sub2.eq(m11.itm_sub2))
							.and(t.itm_sub3.eq(m11.itm_sub3))
							.and(t.sno1.eq(m11.sno1))
							.and(t.sno2.eq(m11.sno2))
							.and(t.sno3.eq(m11.sno3))
							.and(t.sno4.eq(m11.sno4))));

			// 取引先マスタ
			MAM_BP_R s1m11 = MAM_BP_R.create("S1M11");
			arrActL_bldr.addLeftOuterJoin(s1m11, bracket(t.stk_arrv_bp_cd.eq(s1m11.bp_cd)));
			arrActL_bldr.addSelect(s1m11.bp_nm.as("stk_arrv_bp_nm"));

			MST_ARR_SCHD_R s1t2 = MST_ARR_SCHD_R.create("S1T2");
			// 入荷予定
			arrActL_bldr.addLeftOuterJoin(s1t2, bracket(t.arr_schd_no.eq(s1t2.arr_schd_no)));
			arrActL_bldr.addSelect(s1t2.dlv_slip_no);

			// 入荷進捗
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			arrActL_bldr.addLeftOuterJoin(t3, bracket(s1t2.arr_pr_no.eq(t3.arr_pr_no)));
			arrActL_bldr.addSelect(t3.po_d_no);
			arrActL_bldr.addSelect(t3.rqst_dpt_cd.as("acpt_dpt_cd"));
			arrActL_bldr.addSelect(t3.rqst_usr_cd.as("acpt_usr_cd"));
			arrActL_bldr.addSelect(t3.dlv_slip_d_no);

			// 担当者マスタ
			MAM_USR_R m12 = MAM_USR_R.create("M12");
			arrActL_bldr.addLeftOuterJoin(m12, bracket(t.arr_usr_cd.eq(m12.usr_cd)));
			arrActL_bldr.addSelect(m12.usr_nm.as("arr_usr_nm"));

			// 部門マスタ
			MAM_DPT_R m13 = MAM_DPT_R.create("M13");
			arrActL_bldr.addLeftOuterJoin(m13, bracket(t.arr_dpt_cd.eq(m13.dpt_cd)
					.and(t.arr_tm.between(m13.st_dt, m13.end_dt))));
			arrActL_bldr.addSelect(m13.dpt_nm.as("arr_dpt_nm"));

			// 担当者マスタ
			MAM_USR_R m14 = MAM_USR_R.create("M14");
			arrActL_bldr.addLeftOuterJoin(m14, bracket(t.rqst_usr_cd.eq(m14.usr_cd)));
			arrActL_bldr.addSelect(m14.usr_nm.as("acpt_usr_nm"));

			// 部門マスタ
			MAM_DPT_R m15 = MAM_DPT_R.create("M15");
			arrActL_bldr.addLeftOuterJoin(m15, bracket(t3.rqst_dpt_cd.eq(m15.dpt_cd)
					.and(t3.arr_tm.between(m15.st_dt, m15.end_dt))));
			arrActL_bldr.addSelect(m15.dpt_nm.as("acpt_dpt_nm"));

			arrActL_bldr.addWhereWithAnd(m1.stk_lst_flg.eq(value(true)));
			dbSelect("MSBEL0110_MST_ARR_ACT_S01", arrActL, arrActL_bldr);

			// 遷移元画面での表示順でソート
			arrActL.sort(Srch01_DtlR.$arr_act_no);

			return arrActL;
		}

		/**
		 * 入荷実績ＷＫに処理対象を登録する
		 * @param sum_up
		 */
		protected void insArrWk(MCList<Srch01_DtlR> stkList) {
			MCList<MST_ARR_ACT_R> insWkL = MCList.create(MST_ARR_ACT_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
			
			dbWkDelete("MSBEL0110_MSW_ARR_ACT_D01", insWkL_bldr.getBaseDbc());
			
			addAll(insWkL, stkList, createMap_MST_ARR_ACT_R_Srch01_DtlR());	
			
			dbWkInsert("MSBEL0110_MSW_ARR_ACT_I01",
					insWkL.groupBy(insWkL_bldr.getBaseDbc().getKeyColumn()), insWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_ARR_ACT_R_Srch01_DtlR<MST_ARR_ACT_R,Srch01_DtlR> createMap_MST_ARR_ACT_R_Srch01_DtlR() {
			return new Map_MST_ARR_ACT_R_Srch01_DtlR<MST_ARR_ACT_R, Srch01_DtlR>();
		}

		public class Map_MST_ARR_ACT_R_Srch01_DtlR<D extends MST_ARR_ACT_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ARR_ACT_R.$arr_act_no, Srch01_DtlR.$arr_act_no);
			}
		}
		
		protected Map_Srch01_DtlR_MST_ARR_ACT_R<Srch01_DtlR,MST_ARR_ACT_R> createMap_Srch01_DtlR_MST_ARR_ACT_R() {
			return new Map_Srch01_DtlR_MST_ARR_ACT_R<Srch01_DtlR, MST_ARR_ACT_R>();
		}

		public class Map_Srch01_DtlR_MST_ARR_ACT_R<D extends Srch01_DtlR, S extends MST_ARR_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$itm_cd, MST_ARR_ACT_R.$itm_cd);
				addColumnPathMap(Srch01_DtlR.$itm_sub1, MST_ARR_ACT_R.$itm_sub1);
				addColumnPathMap(Srch01_DtlR.$itm_sub2, MST_ARR_ACT_R.$itm_sub2);
				addColumnPathMap(Srch01_DtlR.$itm_sub3, MST_ARR_ACT_R.$itm_sub3);
				addColumnPathMap(Srch01_DtlR.$itm_nm, "itm_nm");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$lot_no, MST_ARR_ACT_R.$lot_no);
				addColumnPathMap(Srch01_DtlR.$sublot_no, MST_ARR_ACT_R.$sublot_no);
				addColumnPathMap(Srch01_DtlR.$ver_no, "ver_no");
				addColumnPathMap(Srch01_DtlR.$stk_lst_prnt_flg, MST_ARR_ACT_R.$stk_lst_prnt_flg);
				addColumnPathMap(Srch01_DtlR.$pack_unit_cd, MST_ARR_ACT_R.$pack_unit_cd);
				addColumnPathMap(Srch01_DtlR.$pack_unit_nm, "pack_unit_nm");
				addColumnPathMap(Srch01_DtlR.$pack_unit_dec_place, "pack_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$pack_unit_qty, MST_ARR_ACT_R.$pack_unit_qty);
				addColumnPathMap(Srch01_DtlR.$base_unit_cd, MST_ARR_ACT_R.$base_unit_cd);
				addColumnPathMap(Srch01_DtlR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(Srch01_DtlR.$base_unit_dec_place, "base_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_rnd_typ, "base_unit_rnd_typ");
				addColumnPathMap(Srch01_DtlR.$base_unit_qty, MST_ARR_ACT_R.$base_unit_qty);
				addColumnPathMap(Srch01_DtlR.$loc_cd, "loc_cd");
				addColumnPathMap(Srch01_DtlR.$loc_nm, "loc_nm");
				addColumnPathMap(Srch01_DtlR.$str_ln_cd, MST_ARR_ACT_R.$str_ln_cd);
				addColumnPathMap(Srch01_DtlR.$str_ln_nm, "str_ln_nm");
				addColumnPathMap(Srch01_DtlR.$site_cd, "site_cd");
				addColumnPathMap(Srch01_DtlR.$site_nm, "site_nm");
				addColumnPathMap(Srch01_DtlR.$wg_cd, "wg_cd");
				addColumnPathMap(Srch01_DtlR.$wg_nm, "wg_nm");
				addColumnPathMap(Srch01_DtlR.$loc_grp_cd, "loc_grp_cd");
				addColumnPathMap(Srch01_DtlR.$loc_grp_nm, "loc_grp_nm");
				addColumnPathMap(Srch01_DtlR.$sno1, MST_ARR_ACT_R.$sno1);
				addColumnPathMap(Srch01_DtlR.$sno2, MST_ARR_ACT_R.$sno2);
				addColumnPathMap(Srch01_DtlR.$sno3, MST_ARR_ACT_R.$sno3);
				addColumnPathMap(Srch01_DtlR.$sno4, MST_ARR_ACT_R.$sno4);
				addColumnPathMap(Srch01_DtlR.$wrk_no, "wrk_no");
				addColumnPathMap(Srch01_DtlR.$wrk_nm, "wrk_nm");
				addColumnPathMap(Srch01_DtlR.$bp_lot_no, "bp_lot_no");
				addColumnPathMap(Srch01_DtlR.$unreg_lmt_flg, "unreg_lmt_flg");
				addColumnPathMap(Srch01_DtlR.$vld_dt, "vld_dt");
				addColumnPathMap(Srch01_DtlR.$lmt_dt, "lmt_dt");;
				addColumnPathMap(Srch01_DtlR.$quality_typ, MST_ARR_ACT_R.$quality_typ);
				addColumnPathMap(Srch01_DtlR.$gd_cd, MST_ARR_ACT_R.$gd_cd);
				addColumnPathMap(Srch01_DtlR.$gd_nm, "gd_nm");
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_cd, MST_ARR_ACT_R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_nm, "stk_arrv_bp_nm");
				addColumnPathMap(Srch01_DtlR.$arr_act_no, MST_ARR_ACT_R.$arr_act_no);
				addColumnPathMap(Srch01_DtlR.$arr_act_sub_char1, "arr_act_sub_char1");
				addColumnPathMap(Srch01_DtlR.$arr_act_sub_char2, "arr_act_sub_char2");
				addColumnPathMap(Srch01_DtlR.$arr_act_sub_char3, "arr_act_sub_char3");
				addColumnPathMap(Srch01_DtlR.$arr_dpt_cd, MST_ARR_ACT_R.$arr_dpt_cd);
				addColumnPathMap(Srch01_DtlR.$arr_dpt_nm, "arr_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$arr_usr_cd, MST_ARR_ACT_R.$arr_usr_cd);
				addColumnPathMap(Srch01_DtlR.$arr_usr_nm, "arr_usr_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_cd, "acpt_dpt_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_nm, "acpt_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_cd, "acpt_usr_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_nm, "acpt_usr_nm");
				addColumnPathMap(Srch01_DtlR.$po_d_no, "po_d_no");
				addColumnPathMap(Srch01_DtlR.$dlv_slip_no, MST_ARR_ACT_R.$dlv_slip_no);
				addColumnPathMap(Srch01_DtlR.$dlv_slip_d_no, MST_ARR_ACT_R.$dlv_slip_d_no);
				addColumnPathMap(Srch01_DtlR.$lot_rmrks, "lot_rmrks");

			}
		}

		/**
		 * 出荷実績明細情報を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_SHIP_ACT_D_R> srchShipActD() {

			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			MSVT_LOT_LIST_R t1 = MSVT_LOT_LIST_R.create("T1");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			MST_SHIP_ACT_R t5 = MST_SHIP_ACT_R.create("T5");
			MST_DLV_INST_RCPT_R t6 = MST_DLV_INST_RCPT_R.create("T6");
			MSVT_WRK_SNO_R t7 = MSVT_WRK_SNO_R.create("T7");
			MST_SLO_D_R t8 = MST_SLO_D_R.create("T8");
			MST_SLO_R t9 = MST_SLO_R.create("T9");
			MST_DLV_SLIP_D_R t10 = MST_DLV_SLIP_D_R.create("T10");
			MST_DLV_SLIP_R t11 = MST_DLV_SLIP_R.create("T11");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAVM_ITM_UNIT_R m3iu = MAVM_ITM_UNIT_R.create("M3IU");
			MAM_UNIT_R m4 = MAM_UNIT_R.create("M4");
			MAVM_ITM_UNIT_R m4iu = MAVM_ITM_UNIT_R.create("M4IU");
			MAM_UNIT_R m5 = MAM_UNIT_R.create("M5");
			MAM_LOC_R m6 = MAM_LOC_R.create("M6");
			MAM_STR_LN_R m7 = MAM_STR_LN_R.create("M7");
			MAM_SITE_R m8 = MAM_SITE_R.create("M8");
			MAM_WG_R m9 = MAM_WG_R.create("M9");
			MAM_LOC_GRP_R m10 = MAM_LOC_GRP_R.create("M10");
			MAM_STK_GD_R m11 = MAM_STK_GD_R.create("M11");
			MAM_SUNDRY_ITM_R m12 = MAM_SUNDRY_ITM_R.create("M12");
			MAM_CO_R m14 = MAM_CO_R.create("M14");
			FCM_CO_R m15 = FCM_CO_R.create("M15");
			MAM_BP_R m16 = MAM_BP_R.create("M16");
			MAM_BP_R m17 = MAM_BP_R.create("M17");
			MAM_BP_R m18 = MAM_BP_R.create("M18");
			MAM_BP_R m19 = MAM_BP_R.create("M19");
			MAM_BP_R m20 = MAM_BP_R.create("M20");
			MAM_USR_R m21 = MAM_USR_R.create("M21");
			MAM_DPT_R m22 = MAM_DPT_R.create("M22");
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);

			insShipActD(up0());

			shipActDL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.cst_itm_cd,
					t.cst_itm_nm,
					t.lot_no,
					t.sublot_no,
					t.stk_lst_prnt_flg,
					t.pack_unit_cd,
					t.pack_unit_qty,
					t.base_unit_cd,
					t.base_unit_qty,
					t.ship_loc_cd.as("loc_cd"),
					t.ship_str_ln_cd.as("str_ln_cd"),
					t.quality_typ,
					t.gd_cd,
					t.stk_insp_typ,
					t.stk_id_typ,
					t.stk_bp_cd,
					t.dlv_id_cd.as("dlv_cd"),
					t.dlv_id_cd,
					t.stk_arrv_bp_cd,
					t.cst_dlv_inst_no,
					t.cst_dlv_inst_d_no,
					t.cst_po_no,
					t.cst_po_d_no,
					t.trd_d_rmrks,
					t.sub_char1.as("ship_act_d_sub_char1"),
					t.sub_char2.as("ship_act_d_sub_char2"),
					t.sub_char3.as("ship_act_d_sub_char3"),
					t.ship_act_no,
					t.ship_act_d_no);

			// 出荷実績明細ＷＫ
			shipActDL_bldr.addInnerJoin(w, bracket(t.ship_act_no.eq(w.ship_act_no)));

			// ロット管理情報
			shipActDL_bldr.addLeftOuterJoin(t1,
					bracket(t.itm_cd.eq(t1.itm_cd)
							.and(t.itm_sub1.eq(t1.itm_sub1))
							.and(t.itm_sub2.eq(t1.itm_sub2))
							.and(t.itm_sub3.eq(t1.itm_sub3))
							.and(t.lot_no.eq(t1.lot_no))
							.and(t.sublot_no.eq(t1.sublot_no))));
			shipActDL_bldr.addSelect(t1.ver_no);
			shipActDL_bldr.addSelect(t1.bp_lot_no);
			shipActDL.addBooleanColumn("unreg_lmt_flg");
			shipActDL_bldr.addSelect(t1.unreg_lmt_flg);
			shipActDL_bldr.addSelect(t1.vld_dt);
			shipActDL_bldr.addSelect(t1.lmt_dt);

			// 出荷引当状況
			shipActDL_bldr.addLeftOuterJoin(t2,
					bracket(t.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no)));
			shipActDL_bldr.addSelect(t2.ship_inst_d_no);
			shipActDL_bldr.addSelect(t2.sub_char1.as("ship_alloc_sts_sub_char1"));
			shipActDL_bldr.addSelect(t2.sub_char2.as("ship_alloc_sts_sub_char2"));
			shipActDL_bldr.addSelect(t2.sub_char3.as("ship_alloc_sts_sub_char3"));
			shipActDL_bldr.addSelect(t2.dlv_slip_no);
			shipActDL_bldr.addSelect(t2.dlv_slip_d_no);

			// 出荷予定
			shipActDL_bldr.addLeftOuterJoin(t3,
					bracket(t2.ship_schd_no.eq(t3.ship_schd_no)));

			// 出荷進捗
			shipActDL_bldr.addLeftOuterJoin(t4, bracket(t3.ship_pr_no.eq(t4.ship_pr_no)));

			//出荷実績
			shipActDL_bldr.addLeftOuterJoin(t5,
					bracket(t.ship_act_no.eq(t5.ship_act_no)));
			shipActDL_bldr.addSelect(t5.ship_inst_no);
			shipActDL_bldr.addSelect(t5.cst_cd);

			// 納入指示受領
			shipActDL_bldr.addLeftOuterJoin(t6,
					bracket(t3.dlv_inst_rcpt_no.eq(t6.dlv_inst_rcpt_no)));
			shipActDL_bldr.addSelect(t6.trd_unit_qty.as("dlv_inst_qty"));
			shipActDL_bldr.addSelect(t6.dlv_rqst_tm);
			shipActDL_bldr.addSelect(t6.dlv_rqst_tm.as("dlv_rqst_dt"));

			//案件紐つき情報
			shipActDL_bldr.addLeftOuterJoin(t7, bracket(t.sno1.eq(t7.sno1)));
			shipActDL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t7.wrk_no).as("wrk_no"));
			shipActDL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t7.wrk_nm).as("wrk_nm"));

			// 受注明細
			shipActDL_bldr.addLeftOuterJoin(t8, bracket(t4.slo_d_no.eq(t8.slo_d_no)));

			// 受注
			shipActDL_bldr.addLeftOuterJoin(t9, bracket(t8.slo_no.eq(t9.slo_no)));
			shipActDL_bldr.addSelect(nvl(t5.cst_cd, t9.cst_cd).as("cst_cd"));

			// 納品伝票明細
			shipActDL_bldr.addLeftOuterJoin(t10, bracket(t.dlv_slip_no.eq(t10.dlv_slip_no)
					.and(t.dlv_slip_d_no.eq(t10.dlv_slip_d_no))
					.and(t.dlv_slip_seq.eq(t10.dlv_slip_seq))));


			// 納品伝票ヘッダ
			shipActDL_bldr.addLeftOuterJoin(t11,
					bracket(t10.dlv_slip_no.eq(t11.dlv_slip_no)
							.and(t10.dlv_slip_seq.eq(t11.dlv_slip_seq))));
			shipActDL_bldr.addSelect(t11.dpt_cd.as("acpt_dpt_cd"));
			shipActDL_bldr.addSelect(t11.usr_cd.as("acpt_usr_cd"));

			// 品目マスタ
			shipActDL_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			shipActDL_bldr.addSelect(decode(t.sundry_itm_flg, value(true),
					nvl(t.itm_nm, m12.itm_nm), m1.itm_nm).as("itm_nm"));
			shipActDL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno1).as("sno1"));
			shipActDL_bldr.addSelect(decode(m1.sno2_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno2).as("sno2"));
			shipActDL_bldr.addSelect(decode(m1.sno3_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno3).as("sno3"));
			shipActDL_bldr.addSelect(decode(m1.sno4_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno4).as("sno4"));
			shipActDL_bldr.addSelect(m1.itm_alt_nm1);
			shipActDL_bldr.addSelect(m1.itm_alt_nm2);
			shipActDL_bldr.addSelect(m1.itm_alt_nm3);
			shipActDL_bldr.addSelect(m1.itm_alt_nm4);

			// 単位マスタ（基準単位）
			shipActDL_bldr.addLeftOuterJoin(m3, bracket(t.base_unit_cd.eq(m3.unit_cd)));
			shipActDL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			shipActDL_bldr.addLeftOuterJoin(m3iu,
					bracket(t.itm_cd.eq(m3iu.itm_cd)
							.and(t.itm_sub1.eq(m3iu.itm_sub1))
							.and(t.itm_sub2.eq(m3iu.itm_sub2))
							.and(t.itm_sub3.eq(m3iu.itm_sub3))
							.and(t.base_unit_cd.eq(m3iu.unit_cd))));
			shipActDL_bldr.addSelect(m3iu.dec_place.as("base_unit_dec_place"));
			shipActDL_bldr.addSelect(m3iu.rnd_typ.as("base_unit_rnd_typ"));

			// 単位マスタ（荷姿単位）
			shipActDL_bldr.addLeftOuterJoin(m4, bracket(t.pack_unit_cd.eq(m4.unit_cd)));
			shipActDL_bldr.addSelect(m4.unit_nm.as("pack_unit_nm"));
			shipActDL_bldr.addLeftOuterJoin(m4iu,
					bracket(t.itm_cd.eq(m4iu.itm_cd)
							.and(t.itm_sub1.eq(m4iu.itm_sub1))
							.and(t.itm_sub2.eq(m4iu.itm_sub2))
							.and(t.itm_sub3.eq(m4iu.itm_sub3))
							.and(t.pack_unit_cd.eq(m4iu.unit_cd))));
			shipActDL_bldr.addSelect(m4iu.dec_place.as("pack_unit_dec_place"));

			// 単位マスタ（納入指示単位）
			shipActDL_bldr.addLeftOuterJoin(m5, bracket(t6.trd_unit_cd.eq(m5.unit_cd)));
			shipActDL_bldr.addSelect(m5.unit_cd.as("dlv_inst_unit_cd"));
			shipActDL_bldr.addSelect(m5.unit_nm.as("dlv_inst_unit_nm"));
			shipActDL_bldr.addSelect(m5.dec_place.as("dlv_inst_unit_dec_place"));

			// 場所マスタ
			shipActDL_bldr.addLeftOuterJoin(m6, bracket(t.ship_loc_cd.eq(m6.loc_cd)));
			shipActDL_bldr.addSelect(m6.loc_nm);
			shipActDL_bldr.addSelect(m6.site_cd);
			shipActDL_bldr.addSelect(m6.wg_cd);
			shipActDL_bldr.addSelect(m6.loc_grp_cd);

			// 棚･ラインマスタ
			shipActDL_bldr.addLeftOuterJoin(m7, bracket(
					t.ship_loc_cd.eq(m7.loc_cd)
					.and(t.ship_str_ln_cd.eq(m7.str_ln_cd))));
			shipActDL_bldr.addSelect(m7.str_ln_nm);

			// 工場･物流倉庫マスタ
			shipActDL_bldr.addLeftOuterJoin(m8, bracket(m6.site_cd.eq(m8.site_cd)));
			shipActDL_bldr.addSelect(m8.site_nm);

			// ワーキンググループマスタ
			shipActDL_bldr.addLeftOuterJoin(m9, bracket(m6.wg_cd.eq(m9.wg_cd)));
			shipActDL_bldr.addSelect(m9.wg_nm);

			// 製造場所グループマスタ
			shipActDL_bldr.addLeftOuterJoin(m10,
					bracket(m6.loc_grp_cd.eq(m10.loc_grp_cd)));
			shipActDL_bldr.addSelect(m10.loc_grp_nm);

			// 格付マスタ
			shipActDL_bldr.addLeftOuterJoin(m11, bracket(t.gd_cd.eq(m11.gd_cd)));
			shipActDL_bldr.addSelect(m11.gd_nm);

			// 諸口品マスタ
			shipActDL_bldr.addLeftOuterJoin(m12,
					bracket(t.itm_cd.eq(m12.itm_cd)
							.and(t.itm_sub1.eq(m12.itm_sub1))
							.and(t.itm_sub2.eq(m12.itm_sub2))
							.and(t.itm_sub3.eq(m12.itm_sub3))
							.and(t.sno1.eq(m12.sno1))
							.and(t.sno2.eq(m12.sno2))
							.and(t.sno3.eq(m12.sno3))
							.and(t.sno4.eq(m12.sno4))));

			// 会社マスタ
			shipActDL_bldr.addInnerJoin(m14, bracket(value(1).eq(value(1))));
			shipActDL_bldr.addSelect(m14.std_co_cd);

			// 会社基本マスタ
			shipActDL_bldr.addInnerJoin(m15, bracket(m14.co_cd.eq(m15.co_cd)));
			shipActDL_bldr.addSelect(m15.co_nm);

			// 取引先マスタ
			shipActDL_bldr.addLeftOuterJoin(m16, bracket(t.stk_arrv_bp_cd.eq(m16.bp_cd)));
			shipActDL_bldr.addSelect(m16.bp_nm.as("stk_arrv_bp_nm"));

			// 取引先マスタ
			shipActDL_bldr.addLeftOuterJoin(m17, bracket(t.stk_bp_cd.eq(m17.bp_cd)));
			shipActDL_bldr.addSelect(m17.bp_nm.as("stk_bp_nm"));

			// 取引先マスタ
			shipActDL_bldr.addLeftOuterJoin(m18, bracket(t.dlv_id_cd.eq(m18.bp_cd)));
			shipActDL_bldr.addSelect(
					decode(t.dlv_sundry_flg, value(true), t.dlv_id_nm, m18.bp_nm)
							.as("dlv_nm"));
			shipActDL_bldr.addSelect(
					decode(t.dlv_sundry_flg, value(true), t.dlv_id_nm, m18.bp_nm)
							.as("dlv_id_nm"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm1.as("dlv_alt_nm1"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm2.as("dlv_alt_nm2"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm3.as("dlv_alt_nm3"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm4.as("dlv_alt_nm4"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm1.as("dlv_id_alt_nm1"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm2.as("dlv_id_alt_nm2"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm3.as("dlv_id_alt_nm3"));
			shipActDL_bldr.addSelect(m18.bp_alt_nm4.as("dlv_id_alt_nm4"));

			// 取引先マスタ
			shipActDL_bldr.addLeftOuterJoin(m19, bracket(t5.cst_cd.eq(m19.bp_cd)));

			// 取引先マスタ
			shipActDL_bldr.addLeftOuterJoin(m20, bracket(t9.cst_cd.eq(m20.bp_cd)));
			shipActDL_bldr.addSelect(
					decode(t5.cst_cd, nullValue(), m20.bp_nm, m19.bp_nm).as("cst_nm"));
			shipActDL_bldr.addSelect(
					decode(t5.cst_cd, nullValue(), m20.bp_alt_nm1, m19.bp_alt_nm1)
							.as("cst_alt_nm1"));
			shipActDL_bldr.addSelect(
					decode(t5.cst_cd, nullValue(), m20.bp_alt_nm2, m19.bp_alt_nm2)
							.as("cst_alt_nm2"));
			shipActDL_bldr.addSelect(
					decode(t5.cst_cd, nullValue(), m20.bp_alt_nm3, m19.bp_alt_nm3)
							.as("cst_alt_nm3"));
			shipActDL_bldr.addSelect(
					decode(t5.cst_cd, nullValue(), m20.bp_alt_nm4, m19.bp_alt_nm4)
							.as("cst_alt_nm4"));

			// 担当者マスタ
			shipActDL_bldr.addLeftOuterJoin(m21, bracket(t11.usr_cd.eq(m21.usr_cd)));
			shipActDL_bldr.addSelect(m21.usr_nm.as("acpt_usr_nm"));

			// 部門マスタ
			shipActDL_bldr.addLeftOuterJoin(m22, bracket(t11.dpt_cd.eq(m22.dpt_cd)
					.and(t11.ac_dt.between(m22.st_dt, m22.end_dt))));
			shipActDL_bldr.addSelect(m22.dpt_nm.as("acpt_dpt_nm"));

			shipActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			shipActDL_bldr.addWhereWithAnd(m1.stk_lst_flg.eq(value(true)));
			shipActDL_bldr.addWhereWithAnd(
					bracket(t.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.DLV.value()))
							.and(decode(t5.cst_cd, nullValue(),
					m20.stk_lst_issue_flg, m19.stk_lst_issue_flg).eq(value(true))))
					.or(t.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
			);
			dbSelect("MSBEL0110_MST_SHIP_ACT_D_S01", shipActDL, shipActDL_bldr);

			// 遷移元画面での表示順でソート
			shipActDL.sort(Srch01_DtlR.$ship_act_d_no);

			return shipActDL;
		}

		/**
		 * 出荷実績ＷＫに処理対象を登録する
		 * @param sum_up
		 */
		protected void insShipActD(MCList<Srch01_DtlR> stkList) {
			MCList<MST_SHIP_ACT_R> insWkL = MCList.create(MST_SHIP_ACT_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
			
			dbWkDelete("MSBEL0110_MSW_SHIP_ACT_D01", insWkL_bldr.getBaseDbc());
			
			addAll(insWkL, stkList, createMap_MST_SHIP_ACT_R_Srch01_DtlR());	

			dbWkInsert("MSBEL0110_MSW_SHIP_ACT_I01",
					insWkL.groupBy(insWkL_bldr.getBaseDbc().getKeyColumn()), insWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_SHIP_ACT_R_Srch01_DtlR<MST_SHIP_ACT_R,Srch01_DtlR> createMap_MST_SHIP_ACT_R_Srch01_DtlR() {
			return new Map_MST_SHIP_ACT_R_Srch01_DtlR<MST_SHIP_ACT_R, Srch01_DtlR>();
		}

		public class Map_MST_SHIP_ACT_R_Srch01_DtlR<D extends MST_SHIP_ACT_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SHIP_ACT_R.$ship_act_no, Srch01_DtlR.$ship_act_no);
			}
		}
		
		protected Map_Srch01_DtlR_MST_SHIP_ACT_D_R<Srch01_DtlR,MST_SHIP_ACT_D_R> createMap_Srch01_DtlR_MST_SHIP_ACT_D_R() {
			return new Map_Srch01_DtlR_MST_SHIP_ACT_D_R<Srch01_DtlR, MST_SHIP_ACT_D_R>();
		}

		public class Map_Srch01_DtlR_MST_SHIP_ACT_D_R<D extends Srch01_DtlR, S extends MST_SHIP_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$itm_cd, MST_SHIP_ACT_D_R.$itm_cd);
				addColumnPathMap(Srch01_DtlR.$itm_sub1, MST_SHIP_ACT_D_R.$itm_sub1);
				addColumnPathMap(Srch01_DtlR.$itm_sub2, MST_SHIP_ACT_D_R.$itm_sub2);
				addColumnPathMap(Srch01_DtlR.$itm_sub3, MST_SHIP_ACT_D_R.$itm_sub3);
				addColumnPathMap(Srch01_DtlR.$itm_nm, "itm_nm");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$cst_itm_cd, MST_SHIP_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(Srch01_DtlR.$cst_itm_nm, MST_SHIP_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(Srch01_DtlR.$lot_no, MST_SHIP_ACT_D_R.$lot_no);
				addColumnPathMap(Srch01_DtlR.$sublot_no, MST_SHIP_ACT_D_R.$sublot_no);
				addColumnPathMap(Srch01_DtlR.$ver_no, "ver_no");
				addColumnPathMap(Srch01_DtlR.$stk_lst_prnt_flg, MST_SHIP_ACT_D_R.$stk_lst_prnt_flg);
				addColumnPathMap(Srch01_DtlR.$pack_unit_cd, MST_SHIP_ACT_D_R.$pack_unit_cd);
				addColumnPathMap(Srch01_DtlR.$pack_unit_nm, "pack_unit_nm");
				addColumnPathMap(Srch01_DtlR.$pack_unit_dec_place, "pack_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_rnd_typ, "base_unit_rnd_typ");
				addColumnPathMap(Srch01_DtlR.$pack_unit_qty, MST_SHIP_ACT_D_R.$pack_unit_qty);
				addColumnPathMap(Srch01_DtlR.$base_unit_cd, MST_SHIP_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Srch01_DtlR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(Srch01_DtlR.$base_unit_dec_place, "base_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_qty, MST_SHIP_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_cd, "dlv_inst_unit_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_nm, "dlv_inst_unit_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_dec_place, "dlv_inst_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_qty, "dlv_inst_qty");
				addColumnPathMap(Srch01_DtlR.$loc_cd, "loc_cd");
				addColumnPathMap(Srch01_DtlR.$loc_nm, "loc_nm");
				addColumnPathMap(Srch01_DtlR.$str_ln_cd, "str_ln_cd");
				addColumnPathMap(Srch01_DtlR.$str_ln_nm, "str_ln_nm");
				addColumnPathMap(Srch01_DtlR.$site_cd, "site_cd");
				addColumnPathMap(Srch01_DtlR.$site_nm, "site_nm");
				addColumnPathMap(Srch01_DtlR.$wg_cd, "wg_cd");
				addColumnPathMap(Srch01_DtlR.$wg_nm, "wg_nm");
				addColumnPathMap(Srch01_DtlR.$loc_grp_cd, "loc_grp_cd");
				addColumnPathMap(Srch01_DtlR.$loc_grp_nm, "loc_grp_nm");
				addColumnPathMap(Srch01_DtlR.$sno1, MST_SHIP_ACT_D_R.$sno1);
				addColumnPathMap(Srch01_DtlR.$sno2, MST_SHIP_ACT_D_R.$sno2);
				addColumnPathMap(Srch01_DtlR.$sno3, MST_SHIP_ACT_D_R.$sno3);
				addColumnPathMap(Srch01_DtlR.$sno4, MST_SHIP_ACT_D_R.$sno4);
				addColumnPathMap(Srch01_DtlR.$wrk_no, "wrk_no");
				addColumnPathMap(Srch01_DtlR.$wrk_nm, "wrk_nm");
				addColumnPathMap(Srch01_DtlR.$bp_lot_no, "bp_lot_no");
				addColumnPathMap(Srch01_DtlR.$unreg_lmt_flg, "unreg_lmt_flg");
				addColumnPathMap(Srch01_DtlR.$vld_dt, "vld_dt");
				addColumnPathMap(Srch01_DtlR.$lmt_dt, "lmt_dt");
				addColumnPathMap(Srch01_DtlR.$quality_typ, MST_SHIP_ACT_D_R.$quality_typ);
				addColumnPathMap(Srch01_DtlR.$gd_cd, MST_SHIP_ACT_D_R.$gd_cd);
				addColumnPathMap(Srch01_DtlR.$gd_nm, "gd_nm");
				addColumnPathMap(Srch01_DtlR.$stk_insp_typ, MST_SHIP_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(Srch01_DtlR.$stk_id_typ, MST_SHIP_ACT_D_R.$stk_id_typ);
				addColumnPathMap(Srch01_DtlR.$stk_bp_cd, MST_SHIP_ACT_D_R.$stk_bp_cd);
				addColumnPathMap(Srch01_DtlR.$stk_bp_nm, "stk_bp_nm");
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_cd, MST_SHIP_ACT_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_nm, "stk_arrv_bp_nm");
				addColumnPathMap(Srch01_DtlR.$cst_cd, "cst_cd");
				addColumnPathMap(Srch01_DtlR.$cst_nm, "cst_nm");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm1, "cst_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm2, "cst_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm3, "cst_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm4, "cst_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$dlv_cd, "dlv_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_nm, "dlv_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm1, "dlv_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm2, "dlv_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm3, "dlv_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm4, "dlv_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$dlv_cd, "dlv_id_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_nm, "dlv_id_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_id_cd, "dlv_id_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_id_nm, "dlv_id_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm1, "dlv_id_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm2, "dlv_id_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm3, "dlv_id_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm4, "dlv_id_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$cst_po_no, MST_SHIP_ACT_D_R.$cst_po_no);
				addColumnPathMap(Srch01_DtlR.$cst_po_d_no, MST_SHIP_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(Srch01_DtlR.$prnt_lcl_cd, "prnt_lcl_cd");
				addColumnPathMap(Srch01_DtlR.$cst_dlv_inst_no, "cst_dlv_inst_no");
				addColumnPathMap(Srch01_DtlR.$cst_dlv_inst_d_no, "cst_dlv_inst_d_no");
				addColumnPathMap(Srch01_DtlR.$ship_inst_no, "ship_inst_no");
				addColumnPathMap(Srch01_DtlR.$ship_inst_d_no, "ship_inst_d_no");
				addColumnPathMap(Srch01_DtlR.$ship_act_no, "ship_act_no");
				addColumnPathMap(Srch01_DtlR.$ship_act_d_no, "ship_act_d_no");
				addColumnPathMap(Srch01_DtlR.$co_cd, "std_co_cd");
				addColumnPathMap(Srch01_DtlR.$co_nm, "co_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_rqst_dt, "dlv_rqst_dt");
				addColumnPathMap(Srch01_DtlR.$dlv_rqst_tm, "dlv_rqst_tm");
				addColumnPathMap(Srch01_DtlR.$trd_d_rmrks, "trd_d_rmrks");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char1, "ship_alloc_sts_sub_char1");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char2, "ship_alloc_sts_sub_char2");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char3, "ship_alloc_sts_sub_char3");
				addColumnPathMap(Srch01_DtlR.$ship_act_d_sub_char1, "ship_act_d_sub_char1");
				addColumnPathMap(Srch01_DtlR.$ship_act_d_sub_char2, "ship_act_d_sub_char2");
				addColumnPathMap(Srch01_DtlR.$ship_act_d_sub_char3, "ship_act_d_sub_char3");
				addColumnPathMap(Srch01_DtlR.$dlv_slip_no, MST_SHIP_ACT_D_R.$dlv_slip_no);
				addColumnPathMap(Srch01_DtlR.$dlv_slip_d_no, MST_SHIP_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_cd, "acpt_dpt_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_nm, "acpt_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_cd, "acpt_usr_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_nm, "acpt_usr_nm");

			}
		}

		/**
		 * 出荷引当状況情報を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> srchShipAllocSts() {

			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MSVT_LOT_LIST_R t2 = MSVT_LOT_LIST_R.create("T2");
			MSVT_WRK_SNO_R t3 = MSVT_WRK_SNO_R.create("T3");
			MST_SHIP_INST_D_R t4 = MST_SHIP_INST_D_R.create("T4");
			MSW_SHIP_INST_KEY_R w = MSW_SHIP_INST_KEY_R.create("W");
			MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
			MST_SLO_D_R t6 = MST_SLO_D_R.create("T6");
			MST_DLV_INST_RCPT_R t7 = MST_DLV_INST_RCPT_R.create("T7");
			MST_SLO_R t8 = MST_SLO_R.create("T8");
			MST_DLV_SLIP_D_R t9 = MST_DLV_SLIP_D_R.create("T9");
			MST_DLV_SLIP_R t10 = MST_DLV_SLIP_R.create("T10");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAVM_ITM_UNIT_R m3iu = MAVM_ITM_UNIT_R.create("M3IU");
			MAM_UNIT_R m4 = MAM_UNIT_R.create("M4");
			MAVM_ITM_UNIT_R m4iu = MAVM_ITM_UNIT_R.create("M4IU");
			MAM_LOC_R m5 = MAM_LOC_R.create("M5");
			MAM_STR_LN_R m6 = MAM_STR_LN_R.create("M6");
			MAM_SITE_R m7 = MAM_SITE_R.create("M7");
			MAM_WG_R m8 = MAM_WG_R.create("M8");
			MAM_LOC_GRP_R m9 = MAM_LOC_GRP_R.create("M9");
			MAM_STK_GD_R m10 = MAM_STK_GD_R.create("M10");
			MAM_SUNDRY_ITM_R m12 = MAM_SUNDRY_ITM_R.create("M12");
			MAM_CO_R m13 = MAM_CO_R.create("M13");
			MAM_UNIT_R m14 = MAM_UNIT_R.create("M14");
			MAM_BP_R m15 = MAM_BP_R.create("M15");
			FCM_CO_R m16 = FCM_CO_R.create("M16");
			MAM_BP_R m17 = MAM_BP_R.create("M17");
			MAM_BP_R m18 = MAM_BP_R.create("M18");
			MAM_BP_R m19 = MAM_BP_R.create("M19");
			MAM_BP_R m20 = MAM_BP_R.create("M20");
			MAM_USR_R m21 = MAM_USR_R.create("M21");
			MAM_DPT_R m22 = MAM_DPT_R.create("M22");
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(t);

			insShipAllocSts(up0());

			shipAllocStsL_bldr.setSelect(
					t.lot_no,
					t.sublot_no,
					t.stk_lst_prnt_flg,
					t.pack_unit_cd,
					t.pack_unit_qty,
					t.base_unit_cd,
					t.base_unit_qty,
					t.ship_loc_cd.as("loc_cd"),
					t.ship_str_ln_cd.as("str_ln_cd"),
					t.quality_typ,
					t.gd_cd,
					t.stk_insp_typ,
					t.stk_id_typ,
					t.stk_bp_cd,
					t.gd_cd,
					t.stk_arrv_bp_cd,
					t.ship_alloc_sts_no,
					t.sub_char1.as("ship_alloc_sts_sub_char1"),
					t.sub_char2.as("ship_alloc_sts_sub_char2"),
					t.sub_char3.as("ship_alloc_sts_sub_char3"),
					t.dlv_slip_no,
					t.dlv_slip_d_no);

			// 出荷予定
			shipAllocStsL_bldr.addLeftOuterJoin(t1,
					bracket(t.ship_schd_no.eq(t1.ship_schd_no)));
			shipAllocStsL_bldr.addSelect(t1.itm_cd);
			shipAllocStsL_bldr.addSelect(t1.itm_sub1);
			shipAllocStsL_bldr.addSelect(t1.itm_sub2);
			shipAllocStsL_bldr.addSelect(t1.itm_sub3);
			shipAllocStsL_bldr.addSelect(t1.ship_inst_d_no);

			// ロット管理情報
			shipAllocStsL_bldr.addLeftOuterJoin(t2,
					bracket(t1.itm_cd.eq(t2.itm_cd)
							.and(t1.itm_sub1.eq(t2.itm_sub1))
							.and(t1.itm_sub2.eq(t2.itm_sub2))
							.and(t1.itm_sub3.eq(t2.itm_sub3))
							.and(t.lot_no.eq(t2.lot_no))
							.and(t.sublot_no.eq(t2.sublot_no))));
			shipAllocStsL_bldr.addSelect(t2.ver_no);
			shipAllocStsL_bldr.addSelect(t2.bp_lot_no);
			shipAllocStsL.addBooleanColumn("unreg_lmt_flg");
			shipAllocStsL_bldr.addSelect(t2.unreg_lmt_flg);
			shipAllocStsL_bldr.addSelect(t2.vld_dt);
			shipAllocStsL_bldr.addSelect(t2.lmt_dt);

			//案件紐つき情報
			shipAllocStsL_bldr.addLeftOuterJoin(t3, bracket(t.sno1.eq(t3.sno1)));
			shipAllocStsL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t3.wrk_no).as("wrk_no"));
			shipAllocStsL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t3.wrk_nm).as("wrk_nm"));

			// 出荷指図明細
			shipAllocStsL_bldr.addLeftOuterJoin(t4,
					bracket(t1.ship_inst_d_no.eq(t4.ship_inst_d_no)));
			shipAllocStsL_bldr.addSelect(t4.ship_inst_no);

			// 出荷引当状況ＷＫ
			shipAllocStsL_bldr.addInnerJoin(w,
					bracket(t4.ship_inst_no.eq(w.ship_inst_no)));

			// 出荷進捗
			shipAllocStsL_bldr.addLeftOuterJoin(t5,
					bracket(t1.ship_pr_no.eq(t5.ship_pr_no)));

			// 受注明細
			shipAllocStsL_bldr.addLeftOuterJoin(t6, bracket(t5.slo_d_no.eq(t6.slo_d_no)));
			shipAllocStsL_bldr.addSelect(t6.cst_itm_cd);
			shipAllocStsL_bldr.addSelect(t6.cst_itm_nm);
			shipAllocStsL_bldr.addSelect(t6.cst_po_d_no);
			shipAllocStsL_bldr.addSelect(nvl(t1.dlv_cd, t6.dlv_cd).as("dlv_cd"));
			shipAllocStsL_bldr.addSelect(nvl(t1.dlv_cd, t6.dlv_cd).as("dlv_id_cd"));
			shipAllocStsL_bldr.addSelect(t6.trd_d_rmrks.as("trd_d_rmrks"));

			// 納入指示受領
			shipAllocStsL_bldr.addLeftOuterJoin(t7,
					bracket(t1.dlv_inst_rcpt_no.eq(t7.dlv_inst_rcpt_no)));
			shipAllocStsL_bldr.addSelect(t7.trd_unit_qty.as("dlv_inst_qty"));
			shipAllocStsL_bldr.addSelect(t7.dlv_rqst_tm);
			shipAllocStsL_bldr.addSelect(t7.dlv_rqst_tm.as("dlv_rqst_dt"));
			shipAllocStsL_bldr.addSelect(t7.cst_dlv_inst_no);
			shipAllocStsL_bldr.addSelect(t7.cst_dlv_inst_d_no);

			// 受注
			shipAllocStsL_bldr.addLeftOuterJoin(t8, bracket(t6.slo_no.eq(t8.slo_no)));
			shipAllocStsL_bldr.addSelect(t8.cst_cd);
			shipAllocStsL_bldr.addSelect(t8.cst_po_no);

			// 納品伝票明細
			shipAllocStsL_bldr.addLeftOuterJoin(t9, bracket(t.dlv_slip_no.eq(t9.dlv_slip_no)
					.and(t.dlv_slip_d_no.eq(t9.dlv_slip_d_no))
					.and(t.dlv_slip_seq.eq(t9.dlv_slip_seq))));

			// 納品伝票ヘッダ
			shipAllocStsL_bldr.addLeftOuterJoin(t10,
					bracket(t9.dlv_slip_no.eq(t10.dlv_slip_no)
							.and(t9.dlv_slip_seq.eq(t10.dlv_slip_seq))));
			shipAllocStsL_bldr.addSelect(t10.dpt_cd.as("acpt_dpt_cd"));
			shipAllocStsL_bldr.addSelect(t10.usr_cd.as("acpt_usr_cd"));

			// 品目マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			shipAllocStsL_bldr.addSelect(decode(t1.sundry_itm_flg, value(true),
					nvl(t1.itm_nm, m12.itm_nm), m1.itm_nm).as("itm_nm"));
			shipAllocStsL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno1).as("sno1"));
			shipAllocStsL_bldr.addSelect(decode(m1.sno2_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno2).as("sno2"));
			shipAllocStsL_bldr.addSelect(decode(m1.sno3_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno3).as("sno3"));
			shipAllocStsL_bldr.addSelect(decode(m1.sno4_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno4).as("sno4"));
			shipAllocStsL_bldr.addSelect(m1.itm_alt_nm1);
			shipAllocStsL_bldr.addSelect(m1.itm_alt_nm2);
			shipAllocStsL_bldr.addSelect(m1.itm_alt_nm3);
			shipAllocStsL_bldr.addSelect(m1.itm_alt_nm4);

			// 単位マスタ（基準単位）
			shipAllocStsL_bldr.addLeftOuterJoin(m3,
					bracket(t.base_unit_cd.eq(m3.unit_cd)));
			shipAllocStsL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			shipAllocStsL_bldr.addLeftOuterJoin(m3iu,
					bracket(t1.itm_cd.eq(m3iu.itm_cd)
							.and(t1.itm_sub1.eq(m3iu.itm_sub1))
							.and(t1.itm_sub2.eq(m3iu.itm_sub2))
							.and(t1.itm_sub3.eq(m3iu.itm_sub3))
							.and(t1.base_unit_cd.eq(m3iu.unit_cd))));
			shipAllocStsL_bldr.addSelect(m3iu.dec_place.as("base_unit_dec_place"));
			shipAllocStsL_bldr.addSelect(m3iu.rnd_typ.as("base_unit_rnd_typ"));

			// 単位マスタ（荷姿単位）
			shipAllocStsL_bldr.addLeftOuterJoin(m4,
					bracket(t.pack_unit_cd.eq(m4.unit_cd)));
			shipAllocStsL_bldr.addSelect(m4.unit_nm.as("pack_unit_nm"));
			shipAllocStsL_bldr.addLeftOuterJoin(m4iu,
					bracket(t1.itm_cd.eq(m4iu.itm_cd)
							.and(t1.itm_sub1.eq(m4iu.itm_sub1))
							.and(t1.itm_sub2.eq(m4iu.itm_sub2))
							.and(t1.itm_sub3.eq(m4iu.itm_sub3))
							.and(t.pack_unit_cd.eq(m4iu.unit_cd))));
			shipAllocStsL_bldr.addSelect(m4iu.dec_place.as("pack_unit_dec_place"));

			// 場所マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m5, bracket(t.ship_loc_cd.eq(m5.loc_cd)));
			shipAllocStsL_bldr.addSelect(m5.loc_nm);
			shipAllocStsL_bldr.addSelect(m5.site_cd);
			shipAllocStsL_bldr.addSelect(m5.wg_cd);
			shipAllocStsL_bldr.addSelect(m5.loc_grp_cd);

			// 棚･ラインマスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m6, bracket(
					t.ship_loc_cd.eq(m6.loc_cd)
					.and(t.ship_str_ln_cd.eq(m6.str_ln_cd))));
			shipAllocStsL_bldr.addSelect(m6.str_ln_nm);

			// 工場･物流倉庫マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m7, bracket(m5.site_cd.eq(m7.site_cd)));
			shipAllocStsL_bldr.addSelect(m7.site_nm);

			// ワーキンググループマスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m8, bracket(m5.wg_cd.eq(m8.wg_cd)));
			shipAllocStsL_bldr.addSelect(m8.wg_nm);

			// 製造場所グループマスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m9,
					bracket(m5.loc_grp_cd.eq(m9.loc_grp_cd)));
			shipAllocStsL_bldr.addSelect(m9.loc_grp_nm);

			// 格付マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m10, bracket(t.gd_cd.eq(m10.gd_cd)));
			shipAllocStsL_bldr.addSelect(m10.gd_nm);

			//諸口品マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m12,
					bracket(t1.itm_cd.eq(m12.itm_cd)
							.and(t1.itm_sub1.eq(m12.itm_sub1))
							.and(t1.itm_sub2.eq(m12.itm_sub2))
							.and(t1.itm_sub3.eq(m12.itm_sub3))
							.and(t1.sno1.eq(m12.sno1))
							.and(t1.sno2.eq(m12.sno2))
							.and(t1.sno3.eq(m12.sno3))
							.and(t1.sno4.eq(m12.sno4))));

			// 会社マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m13, bracket(value(1).eq(value(1))));
			shipAllocStsL_bldr.addSelect(m13.std_co_cd);

			// 単位マスタ（納入指示単位）
			shipAllocStsL_bldr.addLeftOuterJoin(m14,
					bracket(t6.trd_unit_cd.eq(m14.unit_cd)));
			shipAllocStsL_bldr.addSelect(m14.unit_cd.as("dlv_inst_unit_cd"));
			shipAllocStsL_bldr.addSelect(m14.unit_nm.as("dlv_inst_unit_nm"));
			shipAllocStsL_bldr.addSelect(m14.dec_place.as("dlv_inst_unit_dec_place"));

			// 取引先マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m15, bracket(t8.cst_cd.eq(m15.bp_cd)));
			shipAllocStsL_bldr.addSelect(m15.bp_nm.as("cst_nm"));
			shipAllocStsL_bldr.addSelect(m15.bp_alt_nm1.as("cst_alt_nm1"));
			shipAllocStsL_bldr.addSelect(m15.bp_alt_nm2.as("cst_alt_nm2"));
			shipAllocStsL_bldr.addSelect(m15.bp_alt_nm3.as("cst_alt_nm3"));
			shipAllocStsL_bldr.addSelect(m15.bp_alt_nm4.as("cst_alt_nm4"));

			// 会社基本マスタ
			shipAllocStsL_bldr.addInnerJoin(m16, bracket(m13.co_cd.eq(m16.co_cd)));
			shipAllocStsL_bldr.addSelect(m16.co_nm);

			// 取引先マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m17,
					bracket(t.stk_arrv_bp_cd.eq(m17.bp_cd)));
			shipAllocStsL_bldr.addSelect(m17.bp_nm.as("stk_arrv_bp_nm"));

			// 取引先マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m18, bracket(t.stk_bp_cd.eq(m18.bp_cd)));
			shipAllocStsL_bldr.addSelect(m18.bp_nm.as("stk_bp_nm"));

			// 取引先マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m19, bracket(t6.dlv_cd.eq(m19.bp_cd)));
			shipAllocStsL_bldr.addLeftOuterJoin(m20, bracket(t1.dlv_cd.eq(m20.bp_cd)));
			shipAllocStsL_bldr.addSelect(nvl2(t1.dlv_cd,
					decode(t1.dlv_sundry_flg, value(true), t1.dlv_nm, m20.bp_nm),
					decode(t6.dlv_sundry_flg, value(true), t6.dlv_nm, m19.bp_nm))
							.as("dlv_nm"));
			shipAllocStsL_bldr.addSelect(nvl2(t1.dlv_cd,
					decode(t1.dlv_sundry_flg, value(true), t1.dlv_nm, m20.bp_nm),
					decode(t6.dlv_sundry_flg, value(true), t6.dlv_nm, m19.bp_nm))
							.as("dlv_id_nm"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm1, m19.bp_alt_nm1).as("dlv_alt_nm1"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm2, m19.bp_alt_nm2).as("dlv_alt_nm2"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm3, m19.bp_alt_nm3).as("dlv_alt_nm3"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm4, m19.bp_alt_nm4).as("dlv_alt_nm4"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm1, m19.bp_alt_nm1).as("dlv_id_alt_nm1"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm2, m19.bp_alt_nm2).as("dlv_id_alt_nm2"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm3, m19.bp_alt_nm3).as("dlv_id_alt_nm3"));
			shipAllocStsL_bldr.addSelect(
					nvl2(t1.dlv_cd, m20.bp_alt_nm4, m19.bp_alt_nm4).as("dlv_id_alt_nm4"));

			// 担当者マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m21, bracket(t10.usr_cd.eq(m21.usr_cd)));
			shipAllocStsL_bldr.addSelect(m21.usr_nm.as("acpt_usr_nm"));

			// 部門マスタ
			shipAllocStsL_bldr.addLeftOuterJoin(m22, bracket(t10.dpt_cd.eq(m22.dpt_cd)
					.and(t10.ship_tm.between(m22.st_dt, m22.end_dt))));
			shipAllocStsL_bldr.addSelect(m22.dpt_nm.as("acpt_dpt_nm"));

			shipAllocStsL_bldr.addWhereWithAnd(m1.stk_lst_flg.eq(value(true)));
			shipAllocStsL_bldr.addWhereWithAnd(
					bracket(t5.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.DLV.value()))
							.and(m15.stk_lst_issue_flg.eq(value(true))))
					.or(t5.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.LOC.value())))
			);
			dbSelect("MSBEL0110_MST_SHIP_ALLOC_STS_S01", shipAllocStsL, shipAllocStsL_bldr);

			// 遷移元画面での表示順でソート
			shipAllocStsL.sort(Srch01_DtlR.$ship_alloc_sts_no);

			return shipAllocStsL;
		}

		/**
		 * 出荷指図ＷＫに処理対象を登録する
		 * @param sum_up
		 */
		protected void insShipAllocSts(MCList<Srch01_DtlR> stkList) {
			MCList<MST_SHIP_INST_R> insWkL = MCList.create(MST_SHIP_INST_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			
			dbWkDelete("MSBEL0110_MSW_SHIP_INST_D01", insWkL_bldr.getBaseDbc());
			
			addAll(insWkL, stkList, createMap_MST_SHIP_INST_R_Srch01_DtlR());	

			dbWkInsert("MSBEL0110_MSW_SHIP_INST_I01",
					insWkL.groupBy(insWkL_bldr.getBaseDbc().getKeyColumn()), insWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_SHIP_INST_R_Srch01_DtlR<MST_SHIP_INST_R,Srch01_DtlR> createMap_MST_SHIP_INST_R_Srch01_DtlR() {
			return new Map_MST_SHIP_INST_R_Srch01_DtlR<MST_SHIP_INST_R, Srch01_DtlR>();
		}

		public class Map_MST_SHIP_INST_R_Srch01_DtlR<D extends MST_SHIP_INST_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SHIP_INST_R.$ship_inst_no, Srch01_DtlR.$ship_inst_no);
			}
		}
		
		protected Map_Srch01_DtlR_MST_SHIP_ALLOC_STS_R<Srch01_DtlR,MST_SHIP_ALLOC_STS_R> createMap_Srch01_DtlR_MST_SHIP_ALLOC_STS_R() {
			return new Map_Srch01_DtlR_MST_SHIP_ALLOC_STS_R<Srch01_DtlR, MST_SHIP_ALLOC_STS_R>();
		}

		public class Map_Srch01_DtlR_MST_SHIP_ALLOC_STS_R<D extends Srch01_DtlR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$itm_cd, "itm_cd");
				addColumnPathMap(Srch01_DtlR.$itm_sub1, "itm_sub1");
				addColumnPathMap(Srch01_DtlR.$itm_sub2, "itm_sub2");
				addColumnPathMap(Srch01_DtlR.$itm_sub3, "itm_sub3");
				addColumnPathMap(Srch01_DtlR.$itm_nm, "itm_nm");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$cst_itm_cd, "cst_itm_cd");
				addColumnPathMap(Srch01_DtlR.$cst_itm_nm, "cst_itm_nm");
				addColumnPathMap(Srch01_DtlR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
				addColumnPathMap(Srch01_DtlR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
				addColumnPathMap(Srch01_DtlR.$ver_no, "ver_no");
				addColumnPathMap(Srch01_DtlR.$stk_lst_prnt_flg, "stk_lst_prnt_flg");
				addColumnPathMap(Srch01_DtlR.$pack_unit_cd, "pack_unit_cd");
				addColumnPathMap(Srch01_DtlR.$pack_unit_nm, "pack_unit_nm");
				addColumnPathMap(Srch01_DtlR.$pack_unit_dec_place, "pack_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$pack_unit_qty, "pack_unit_qty");
				addColumnPathMap(Srch01_DtlR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
				addColumnPathMap(Srch01_DtlR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(Srch01_DtlR.$base_unit_rnd_typ, "base_unit_rnd_typ");
				addColumnPathMap(Srch01_DtlR.$base_unit_dec_place, "base_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_cd, "dlv_inst_unit_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_nm, "dlv_inst_unit_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_unit_dec_place, "dlv_inst_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$dlv_inst_qty, "dlv_inst_qty");
				addColumnPathMap(Srch01_DtlR.$loc_cd, "loc_cd");
				addColumnPathMap(Srch01_DtlR.$loc_nm, "loc_nm");
				addColumnPathMap(Srch01_DtlR.$str_ln_cd, "str_ln_cd");
				addColumnPathMap(Srch01_DtlR.$str_ln_nm, "str_ln_nm");
				addColumnPathMap(Srch01_DtlR.$site_cd, "site_cd");
				addColumnPathMap(Srch01_DtlR.$site_nm, "site_nm");
				addColumnPathMap(Srch01_DtlR.$wg_cd, "wg_cd");
				addColumnPathMap(Srch01_DtlR.$wg_nm, "wg_nm");
				addColumnPathMap(Srch01_DtlR.$loc_grp_cd, "loc_grp_cd");
				addColumnPathMap(Srch01_DtlR.$loc_grp_nm, "loc_grp_nm");
				addColumnPathMap(Srch01_DtlR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
				addColumnPathMap(Srch01_DtlR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
				addColumnPathMap(Srch01_DtlR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
				addColumnPathMap(Srch01_DtlR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
				addColumnPathMap(Srch01_DtlR.$wrk_no, "wrk_no");
				addColumnPathMap(Srch01_DtlR.$wrk_nm, "wrk_nm");
				addColumnPathMap(Srch01_DtlR.$bp_lot_no, "bp_lot_no");
				addColumnPathMap(Srch01_DtlR.$unreg_lmt_flg, "unreg_lmt_flg");
				addColumnPathMap(Srch01_DtlR.$vld_dt, "vld_dt");
				addColumnPathMap(Srch01_DtlR.$lmt_dt, "lmt_dt");
				addColumnPathMap(Srch01_DtlR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
				addColumnPathMap(Srch01_DtlR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
				addColumnPathMap(Srch01_DtlR.$gd_nm, "gd_nm");
				addColumnPathMap(Srch01_DtlR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
				addColumnPathMap(Srch01_DtlR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
				addColumnPathMap(Srch01_DtlR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
				addColumnPathMap(Srch01_DtlR.$stk_bp_nm, "stk_bp_nm");
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch01_DtlR.$stk_arrv_bp_nm, "stk_arrv_bp_nm");
				addColumnPathMap(Srch01_DtlR.$cst_cd, "cst_cd");
				addColumnPathMap(Srch01_DtlR.$cst_nm, "cst_nm");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm1, "cst_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm2, "cst_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm3, "cst_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$cst_alt_nm4, "cst_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$dlv_cd, "dlv_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_nm, "dlv_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm1, "dlv_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm2, "dlv_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm3, "dlv_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$dlv_alt_nm4, "dlv_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$dlv_id_cd, "dlv_id_cd");
				addColumnPathMap(Srch01_DtlR.$dlv_id_nm, "dlv_id_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm1, "dlv_id_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm2, "dlv_id_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm3, "dlv_id_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$dlv_id_alt_nm4, "dlv_id_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$cst_po_no,"cst_po_no");
				addColumnPathMap(Srch01_DtlR.$cst_po_d_no, "cst_po_d_no");
				addColumnPathMap(Srch01_DtlR.$prnt_lcl_cd, "prnt_lcl_cd");
				addColumnPathMap(Srch01_DtlR.$cst_dlv_inst_no, "cst_dlv_inst_no");
				addColumnPathMap(Srch01_DtlR.$cst_dlv_inst_d_no, "cst_dlv_inst_d_no");
				addColumnPathMap(Srch01_DtlR.$ship_inst_no, "ship_inst_no");
				addColumnPathMap(Srch01_DtlR.$ship_inst_d_no, "ship_inst_d_no");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_no, "ship_alloc_sts_no");
				addColumnPathMap(Srch01_DtlR.$co_cd, "std_co_cd");
				addColumnPathMap(Srch01_DtlR.$co_nm, "co_nm");
				addColumnPathMap(Srch01_DtlR.$dlv_rqst_dt, "dlv_rqst_dt");
				addColumnPathMap(Srch01_DtlR.$dlv_rqst_tm, "dlv_rqst_tm");
				addColumnPathMap(Srch01_DtlR.$trd_d_rmrks, "trd_d_rmrks");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char1, "ship_alloc_sts_sub_char1");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char2, "ship_alloc_sts_sub_char2");
				addColumnPathMap(Srch01_DtlR.$ship_alloc_sts_sub_char3, "ship_alloc_sts_sub_char3");
				addColumnPathMap(Srch01_DtlR.$dlv_slip_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_no);
				addColumnPathMap(Srch01_DtlR.$dlv_slip_d_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no);
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_cd, "acpt_dpt_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_nm, "acpt_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_cd, "acpt_usr_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_nm, "acpt_usr_nm");

			}
		}

		/**
		 * 出来高実績情報を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_YIELD_ACT_R> srchYieldAct() {

			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(t);

			insYieldAct(up0());

			yieldActL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.lot_no,
					t.sublot_no,
					t.stk_lst_prnt_flg,
					t.trd_unit_cd.as("pack_unit_cd"),
					t.trd_unit_qty.as("pack_unit_qty"),
					t.base_unit_cd,
					t.base_unit_qty,
					t.strg_loc_cd.as("loc_cd"),
					t.strg_str_ln_cd.as("str_ln_cd"),
					t.gd_cd,
					value(MAC_STR.NULL_VAL.value()).as("stk_arrv_bp_cd"),
					t.yield_act_no,
					t.mfg_act_no,
					t.sub_char1.as("yield_act_sub_char1"),
					t.sub_char2.as("yield_act_sub_char2"),
					t.sub_char3.as("yield_act_sub_char3"));

			yieldActL.addBooleanColumn("byprod_flg");
			yieldActL_bldr.addSelect(MAC_YIELD_TYP$IS_BYPROD(t.yield_typ).as("byprod_flg"));

			// 製造実績ＷＫ
			MSW_MFG_ACT_KEY_R w = MSW_MFG_ACT_KEY_R.create("W");
			yieldActL_bldr.addInnerJoin(w, bracket(t.mfg_act_no.eq(w.mfg_act_no)));

			// ロット管理情報
			MSVT_LOT_LIST_R t1 = MSVT_LOT_LIST_R.create("T1");
			yieldActL_bldr.addLeftOuterJoin(t1,
					bracket(t.itm_cd.eq(t1.itm_cd)
							.and(t.itm_sub1.eq(t1.itm_sub1))
							.and(t.itm_sub2.eq(t1.itm_sub2))
							.and(t.itm_sub3.eq(t1.itm_sub3))
							.and(t.lot_no.eq(t1.lot_no))
							.and(t.sublot_no.eq(t1.sublot_no))));
			yieldActL_bldr.addSelect(t1.ver_no);
			yieldActL_bldr.addSelect(t1.bp_lot_no);
			yieldActL.addBooleanColumn("unreg_lmt_flg");
			yieldActL_bldr.addSelect(t1.unreg_lmt_flg);
			yieldActL_bldr.addSelect(t1.vld_dt);
			yieldActL_bldr.addSelect(t1.lmt_dt);

			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			//案件紐つき情報
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			yieldActL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			yieldActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t2.wrk_no).as("wrk_no"));
			yieldActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t2.wrk_nm).as("wrk_nm"));

			MAM_SUNDRY_ITM_R m12 = MAM_SUNDRY_ITM_R.create("M12");
			// 品目マスタ
			yieldActL_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			yieldActL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno1).as("sno1"));
			yieldActL_bldr.addSelect(decode(m1.sno2_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno2).as("sno2"));
			yieldActL_bldr.addSelect(decode(m1.sno3_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno3).as("sno3"));
			yieldActL_bldr.addSelect(decode(m1.sno4_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno4).as("sno4"));
			yieldActL_bldr.addSelect(nvl(m12.itm_nm, m1.itm_nm).as("itm_nm"));
			yieldActL_bldr.addSelect(m1.itm_alt_nm1);
			yieldActL_bldr.addSelect(m1.itm_alt_nm2);
			yieldActL_bldr.addSelect(m1.itm_alt_nm3);
			yieldActL_bldr.addSelect(m1.itm_alt_nm4);

			// 単位マスタ（基準単位）
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAVM_ITM_UNIT_R m3iu = MAVM_ITM_UNIT_R.create("M3IU");
			yieldActL_bldr.addLeftOuterJoin(m3, bracket(t.base_unit_cd.eq(m3.unit_cd)));
			yieldActL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			yieldActL_bldr.addLeftOuterJoin(m3iu,
					bracket(t.itm_cd.eq(m3iu.itm_cd)
							.and(t.itm_sub1.eq(m3iu.itm_sub1))
							.and(t.itm_sub2.eq(m3iu.itm_sub2))
							.and(t.itm_sub3.eq(m3iu.itm_sub3))
							.and(t.base_unit_cd.eq(m3iu.unit_cd))));
			yieldActL_bldr.addSelect(m3iu.dec_place.as("base_unit_dec_place"));
			yieldActL_bldr.addSelect(m3iu.rnd_typ.as("base_unit_rnd_typ"));

			// 単位マスタ（荷姿単位）
			MAM_UNIT_R m4 = MAM_UNIT_R.create("M4");
			MAVM_ITM_UNIT_R m4iu = MAVM_ITM_UNIT_R.create("M4IU");
			yieldActL_bldr.addLeftOuterJoin(m4, bracket(t.trd_unit_cd.eq(m4.unit_cd)));
			yieldActL_bldr.addSelect(m4.unit_nm.as("pack_unit_nm"));
			yieldActL_bldr.addLeftOuterJoin(m4iu,
					bracket(t.itm_cd.eq(m4iu.itm_cd)
							.and(t.itm_sub1.eq(m4iu.itm_sub1))
							.and(t.itm_sub2.eq(m4iu.itm_sub2))
							.and(t.itm_sub3.eq(m4iu.itm_sub3))
							.and(t.trd_unit_cd.eq(m4iu.unit_cd))));
			yieldActL_bldr.addSelect(m4iu.dec_place.as("pack_unit_dec_place"));

			// 場所マスタ
			MAM_LOC_R m5 = MAM_LOC_R.create("M5");
			yieldActL_bldr.addLeftOuterJoin(m5, bracket(t.strg_loc_cd.eq(m5.loc_cd)));
			yieldActL_bldr.addSelect(m5.loc_nm);
			yieldActL_bldr.addSelect(m5.site_cd);
			yieldActL_bldr.addSelect(m5.wg_cd);
			yieldActL_bldr.addSelect(m5.loc_grp_cd);

			// 棚･ラインマスタ
			MAM_STR_LN_R m6 = MAM_STR_LN_R.create("M6");
			yieldActL_bldr.addLeftOuterJoin(m6, bracket(
					t.strg_loc_cd.eq(m6.loc_cd)
					.and(t.strg_str_ln_cd.eq(m6.str_ln_cd))));
			yieldActL_bldr.addSelect(m6.str_ln_nm);

			// 工場･物流倉庫マスタ
			MAM_SITE_R m7 = MAM_SITE_R.create("M7");
			yieldActL_bldr.addLeftOuterJoin(m7, bracket(m5.site_cd.eq(m7.site_cd)));
			yieldActL_bldr.addSelect(m7.site_nm);

			// ワーキンググループマスタ
			MAM_WG_R m8 = MAM_WG_R.create("M8");
			yieldActL_bldr.addLeftOuterJoin(m8, bracket(m5.wg_cd.eq(m8.wg_cd)));
			yieldActL_bldr.addSelect(m8.wg_nm);

			// 製造場所グループマスタ
			MAM_LOC_GRP_R m9 = MAM_LOC_GRP_R.create("M9");
			yieldActL_bldr.addLeftOuterJoin(m9, bracket(m5.loc_grp_cd.eq(m9.loc_grp_cd)));
			yieldActL_bldr.addSelect(m9.loc_grp_nm);

			// 格付マスタ
			MAM_STK_GD_R m10 = MAM_STK_GD_R.create("M10");
			yieldActL_bldr.addLeftOuterJoin(m10, bracket(t.gd_cd.eq(m10.gd_cd)));
			yieldActL_bldr.addSelect(m10.gd_nm);

			//諸口品マスタ
			yieldActL_bldr.addLeftOuterJoin(m12,
					bracket(t.itm_cd.eq(m12.itm_cd)
							.and(t.itm_sub1.eq(m12.itm_sub1))
							.and(t.itm_sub2.eq(m12.itm_sub2))
							.and(t.itm_sub3.eq(m12.itm_sub3))
							.and(t.sno1.eq(m12.sno1))
							.and(t.sno2.eq(m12.sno2))
							.and(t.sno3.eq(m12.sno3))
							.and(t.sno4.eq(m12.sno4))));

			// 製造実績
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			yieldActL_bldr.addLeftOuterJoin(t3, bracket(t.mfg_act_no.eq(t3.mfg_act_no)));
			yieldActL_bldr.addSelect(t3.mfg_inst_no);
			yieldActL_bldr.addSelect(t3.act_dpt_cd.as("acpt_dpt_cd"));
			yieldActL_bldr.addSelect(t3.act_usr_cd.as("acpt_usr_cd"));

			// 担当者マスタ
			MAM_USR_R m13 = MAM_USR_R.create("M13");
			yieldActL_bldr.addLeftOuterJoin(m13, bracket(t3.act_usr_cd.eq(m13.usr_cd)));
			yieldActL_bldr.addSelect(m13.usr_nm.as("acpt_usr_nm"));

			// 部門マスタ
			MAM_DPT_R m14 = MAM_DPT_R.create("M14");
			yieldActL_bldr.addLeftOuterJoin(m14, bracket(t3.act_dpt_cd.eq(m14.dpt_cd)
					.and(t3.st_ac_dt.between(m14.st_dt, m14.end_dt))));
			yieldActL_bldr.addSelect(m14.dpt_nm.as("acpt_dpt_nm"));

			yieldActL_bldr.addWhereWithAnd(m1.stk_lst_flg.eq(value(true)));
			dbSelect("MSBEL0110_MST_YIELD_ACT_S01", yieldActL, yieldActL_bldr);

			// 遷移元画面での表示順でソート
			yieldActL.sort(Srch01_DtlR.$yield_act_no);

			return yieldActL;
		}

		/**
		 * 製造実績ＷＫに処理対象を登録する
		 * @param sum_up
		 */
		protected void insYieldAct(MCList<Srch01_DtlR> stkList) {
			MCList<MST_MFG_ACT_R> insWkL = MCList.create(MST_MFG_ACT_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
			
			dbWkDelete("MSBEL0110_MSW_MFG_ACT_D01", insWkL_bldr.getBaseDbc());
			
			addAll(insWkL, stkList, createMap_MST_MFG_ACT_R_Srch01_DtlR());	

			dbWkInsert("MSBEL0110_MSW_MFG_ACT_I01",
					insWkL.groupBy(insWkL_bldr.getBaseDbc().getKeyColumn()), insWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_MFG_ACT_R_Srch01_DtlR<MST_MFG_ACT_R,Srch01_DtlR> createMap_MST_MFG_ACT_R_Srch01_DtlR() {
			return new Map_MST_MFG_ACT_R_Srch01_DtlR<MST_MFG_ACT_R, Srch01_DtlR>();
		}

		public class Map_MST_MFG_ACT_R_Srch01_DtlR<D extends MST_MFG_ACT_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MFG_ACT_R.$mfg_act_no, Srch01_DtlR.$mfg_act_no);
			}
		}		
		
		
		protected Map_Srch01_DtlR_MST_YIELD_ACT_R<Srch01_DtlR,MST_YIELD_ACT_R> createMap_Srch01_DtlR_MST_YIELD_ACT_R() {
			return new Map_Srch01_DtlR_MST_YIELD_ACT_R<Srch01_DtlR, MST_YIELD_ACT_R>();
		}

		public class Map_Srch01_DtlR_MST_YIELD_ACT_R<D extends Srch01_DtlR, S extends MST_YIELD_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$itm_cd, MST_YIELD_ACT_R.$itm_cd);
				addColumnPathMap(Srch01_DtlR.$itm_sub1, MST_YIELD_ACT_R.$itm_sub1);
				addColumnPathMap(Srch01_DtlR.$itm_sub2, MST_YIELD_ACT_R.$itm_sub2);
				addColumnPathMap(Srch01_DtlR.$itm_sub3, MST_YIELD_ACT_R.$itm_sub3);
				addColumnPathMap(Srch01_DtlR.$itm_nm, "itm_nm");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$lot_no, MST_YIELD_ACT_R.$lot_no);
				addColumnPathMap(Srch01_DtlR.$sublot_no, MST_YIELD_ACT_R.$sublot_no);
				addColumnPathMap(Srch01_DtlR.$ver_no, "ver_no");
				addColumnPathMap(Srch01_DtlR.$byprod_flg, "byprod_flg");
				addColumnPathMap(Srch01_DtlR.$stk_lst_prnt_flg, "stk_lst_prnt_flg");
				addColumnPathMap(Srch01_DtlR.$pack_unit_cd, "pack_unit_cd");
				addColumnPathMap(Srch01_DtlR.$pack_unit_nm, "pack_unit_nm");
				addColumnPathMap(Srch01_DtlR.$pack_unit_dec_place, "pack_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$pack_unit_qty, "pack_unit_qty");
				addColumnPathMap(Srch01_DtlR.$base_unit_cd, MST_YIELD_ACT_R.$base_unit_cd);
				addColumnPathMap(Srch01_DtlR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(Srch01_DtlR.$base_unit_dec_place, "base_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_rnd_typ, "base_unit_rnd_typ");
				addColumnPathMap(Srch01_DtlR.$base_unit_qty, MST_YIELD_ACT_R.$base_unit_qty);
				addColumnPathMap(Srch01_DtlR.$loc_cd, "loc_cd");
				addColumnPathMap(Srch01_DtlR.$loc_nm, "loc_nm");
				addColumnPathMap(Srch01_DtlR.$str_ln_cd, "str_ln_cd");
				addColumnPathMap(Srch01_DtlR.$str_ln_nm, "str_ln_nm");
				addColumnPathMap(Srch01_DtlR.$site_cd, "site_cd");
				addColumnPathMap(Srch01_DtlR.$site_nm, "site_nm");
				addColumnPathMap(Srch01_DtlR.$wg_cd, "wg_cd");
				addColumnPathMap(Srch01_DtlR.$wg_nm, "wg_nm");
				addColumnPathMap(Srch01_DtlR.$loc_grp_cd, "loc_grp_cd");
				addColumnPathMap(Srch01_DtlR.$loc_grp_nm, "loc_grp_nm");
				addColumnPathMap(Srch01_DtlR.$sno1, MST_YIELD_ACT_R.$sno1);
				addColumnPathMap(Srch01_DtlR.$sno2, MST_YIELD_ACT_R.$sno2);
				addColumnPathMap(Srch01_DtlR.$sno3, MST_YIELD_ACT_R.$sno3);
				addColumnPathMap(Srch01_DtlR.$sno4, MST_YIELD_ACT_R.$sno4);
				addColumnPathMap(Srch01_DtlR.$wrk_no, "wrk_no");
				addColumnPathMap(Srch01_DtlR.$wrk_nm, "wrk_nm");
				addColumnPathMap(Srch01_DtlR.$bp_lot_no, "bp_lot_no");
				addColumnPathMap(Srch01_DtlR.$unreg_lmt_flg, "unreg_lmt_flg");
				addColumnPathMap(Srch01_DtlR.$vld_dt, "vld_dt");
				addColumnPathMap(Srch01_DtlR.$lmt_dt, "lmt_dt");
				addColumnPathMap(Srch01_DtlR.$gd_cd, MST_YIELD_ACT_R.$gd_cd);
				addColumnPathMap(Srch01_DtlR.$gd_nm, "gd_nm");
				addColumnPathMap(Srch01_DtlR.$yield_schd_no, MST_YIELD_ACT_R.$yield_schd_no);
				addColumnPathMap(Srch01_DtlR.$yield_act_no, MST_YIELD_ACT_R.$yield_act_no);
				addColumnPathMap(Srch01_DtlR.$mfg_act_no, MST_YIELD_ACT_R.$mfg_act_no);
				addColumnPathMap(Srch01_DtlR.$yield_act_sub_char1, "yield_act_sub_char1");
				addColumnPathMap(Srch01_DtlR.$yield_act_sub_char2, "yield_act_sub_char2");
				addColumnPathMap(Srch01_DtlR.$yield_act_sub_char3, "yield_act_sub_char3");
				addColumnPathMap(Srch01_DtlR.$mfg_inst_no, "mfg_inst_no");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_cd, "acpt_dpt_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_nm, "acpt_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_cd, "acpt_usr_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_nm, "acpt_usr_nm");

			}
		}

		/**
		 * 出来高予定情報を取得する
		 * 
		 * @return
		 */
		protected MCList<MST_YIELD_SCHD_R> srchYieldSchd() {

			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yieldSchdL_bldr = MCQueryApiBuilder.create(t);

			insYieldInst(up0());

			yieldSchdL_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.lot_no,
					t.sublot_no,
					t.trd_unit_cd.as("pack_unit_cd"),
					t.trd_unit_yield_qty.as("pack_unit_qty"),
					t.base_unit_cd,
					t.base_unit_yield_qty.as("base_unit_qty"),
					t.strg_loc_cd.as("loc_cd"),
					t.strg_str_ln_cd.as("str_ln_cd"),
					value(MAC_STR.NULL_VAL.value()).as("stk_arrv_bp_cd"),
					t.mfg_inst_no,
					t.yield_schd_no,
					t.sub_char1.as("yield_schd_sub_char1"),
					t.sub_char2.as("yield_schd_sub_char2"),
					t.sub_char3.as("yield_schd_sub_char3"));

			yieldSchdL.addBooleanColumn("byprod_flg");
			yieldSchdL_bldr.addSelect(MAC_YIELD_TYP$IS_BYPROD(t.yield_typ).as("byprod_flg"));

			// 製造指図ＷＫ
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");
			yieldSchdL_bldr.addInnerJoin(w, bracket(t.mfg_inst_no.eq(w.mfg_inst_no)));

			// ロット管理情報
			MSVT_LOT_LIST_R t1 = MSVT_LOT_LIST_R.create("T1");
			yieldSchdL_bldr.addLeftOuterJoin(t1,
					bracket(t.itm_cd.eq(t1.itm_cd)
							.and(t.itm_sub1.eq(t1.itm_sub1))
							.and(t.itm_sub2.eq(t1.itm_sub2))
							.and(t.itm_sub3.eq(t1.itm_sub3))
							.and(t.lot_no.eq(t1.lot_no))
							.and(t.sublot_no.eq(t1.sublot_no))));
			yieldSchdL_bldr.addSelect(t1.ver_no);
			yieldSchdL_bldr.addSelect(t1.bp_lot_no);
			yieldSchdL.addBooleanColumn("unreg_lmt_flg");
			yieldSchdL_bldr.addSelect(t1.unreg_lmt_flg);
			yieldSchdL_bldr.addSelect(t1.vld_dt);
			yieldSchdL_bldr.addSelect(t1.lmt_dt);

			// 出来高進捗ビュー
			MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
			yieldSchdL_bldr.addLeftOuterJoin(t2,
					bracket(t.yield_schd_no.eq(t2.yield_schd_no)));
			yieldSchdL.addBooleanColumn("stk_lst_prnt_flg");
			yieldSchdL_bldr.addSelect(t2.stk_lst_prnt_flg);

			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			//案件紐つき情報
			MSVT_WRK_SNO_R t4 = MSVT_WRK_SNO_R.create("T4");
			yieldSchdL_bldr.addLeftOuterJoin(t4, bracket(t.sno1.eq(t4.sno1)));
			yieldSchdL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t4.wrk_no).as("wrk_no"));
			yieldSchdL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					nullValue(), t4.wrk_nm).as("wrk_nm"));

			MAM_SUNDRY_ITM_R m12 = MAM_SUNDRY_ITM_R.create("M12");
			// 品目マスタ
			yieldSchdL_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			yieldSchdL_bldr.addSelect(decode(m1.sno1_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno1).as("sno1"));
			yieldSchdL_bldr.addSelect(decode(m1.sno2_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno2).as("sno2"));
			yieldSchdL_bldr.addSelect(decode(m1.sno3_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno3).as("sno3"));
			yieldSchdL_bldr.addSelect(decode(m1.sno4_mng_typ, value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value()),
					value(MAC_STR.NULL_VAL.value()), t.sno4).as("sno4"));
			yieldSchdL_bldr.addSelect(nvl(m12.itm_nm, m1.itm_nm).as("itm_nm"));
			yieldSchdL_bldr.addSelect(m1.itm_alt_nm1);
			yieldSchdL_bldr.addSelect(m1.itm_alt_nm2);
			yieldSchdL_bldr.addSelect(m1.itm_alt_nm3);
			yieldSchdL_bldr.addSelect(m1.itm_alt_nm4);

			// 単位マスタ（基準単位）
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAVM_ITM_UNIT_R m3iu = MAVM_ITM_UNIT_R.create("M3IU");
			yieldSchdL_bldr.addLeftOuterJoin(m3, bracket(t.base_unit_cd.eq(m3.unit_cd)));
			yieldSchdL_bldr.addSelect(m3.unit_nm.as("base_unit_nm"));
			yieldSchdL_bldr.addLeftOuterJoin(m3iu,
					bracket(t.itm_cd.eq(m3iu.itm_cd)
							.and(t.itm_sub1.eq(m3iu.itm_sub1))
							.and(t.itm_sub2.eq(m3iu.itm_sub2))
							.and(t.itm_sub3.eq(m3iu.itm_sub3))
							.and(t.base_unit_cd.eq(m3iu.unit_cd))));
			yieldSchdL_bldr.addSelect(m3iu.dec_place.as("base_unit_dec_place"));
			yieldSchdL_bldr.addSelect(m3iu.rnd_typ.as("base_unit_rnd_typ"));

			// 単位マスタ（荷姿単位）
			MAM_UNIT_R m4 = MAM_UNIT_R.create("M4");
			MAVM_ITM_UNIT_R m4iu = MAVM_ITM_UNIT_R.create("M4IU");
			yieldSchdL_bldr.addLeftOuterJoin(m4, bracket(t.trd_unit_cd.eq(m4.unit_cd)));
			yieldSchdL_bldr.addSelect(m4.unit_nm.as("pack_unit_nm"));
			yieldSchdL_bldr.addLeftOuterJoin(m4iu,
					bracket(t.itm_cd.eq(m4iu.itm_cd)
							.and(t.itm_sub1.eq(m4iu.itm_sub1))
							.and(t.itm_sub2.eq(m4iu.itm_sub2))
							.and(t.itm_sub3.eq(m4iu.itm_sub3))
							.and(t.trd_unit_cd.eq(m4iu.unit_cd))));
			yieldSchdL_bldr.addSelect(m4iu.dec_place.as("pack_unit_dec_place"));

			// 場所マスタ
			MAM_LOC_R m5 = MAM_LOC_R.create("M5");
			yieldSchdL_bldr.addLeftOuterJoin(m5, bracket(t.strg_loc_cd.eq(m5.loc_cd)));
			yieldSchdL_bldr.addSelect(m5.loc_nm);
			yieldSchdL_bldr.addSelect(m5.site_cd);
			yieldSchdL_bldr.addSelect(m5.wg_cd);
			yieldSchdL_bldr.addSelect(m5.loc_grp_cd);

			// 棚･ラインマスタ
			MAM_STR_LN_R m6 = MAM_STR_LN_R.create("M6");
			yieldSchdL_bldr.addLeftOuterJoin(m6, bracket(
					t.strg_loc_cd.eq(m6.loc_cd)
					.and(t.strg_str_ln_cd.eq(m6.str_ln_cd))));
			yieldSchdL_bldr.addSelect(m6.str_ln_nm);

			// 工場･物流倉庫マスタ
			MAM_SITE_R m7 = MAM_SITE_R.create("M7");
			yieldSchdL_bldr.addLeftOuterJoin(m7, bracket(m5.site_cd.eq(m7.site_cd)));
			yieldSchdL_bldr.addSelect(m7.site_nm);

			// ワーキンググループマスタ
			MAM_WG_R m8 = MAM_WG_R.create("M8");
			yieldSchdL_bldr.addLeftOuterJoin(m8, bracket(m5.wg_cd.eq(m8.wg_cd)));
			yieldSchdL_bldr.addSelect(m8.wg_nm);

			// 製造場所グループマスタ
			MAM_LOC_GRP_R m9 = MAM_LOC_GRP_R.create("M9");
			yieldSchdL_bldr.addLeftOuterJoin(m9,
					bracket(m5.loc_grp_cd.eq(m9.loc_grp_cd)));
			yieldSchdL_bldr.addSelect(m9.loc_grp_nm);

			//諸口品マスタ
			yieldSchdL_bldr.addLeftOuterJoin(m12,
					bracket(t.itm_cd.eq(m12.itm_cd)
							.and(t.itm_sub1.eq(m12.itm_sub1))
							.and(t.itm_sub2.eq(m12.itm_sub2))
							.and(t.itm_sub3.eq(m12.itm_sub3))
							.and(t.sno1.eq(m12.sno1))
							.and(t.sno2.eq(m12.sno2))
							.and(t.sno3.eq(m12.sno3))
							.and(t.sno4.eq(m12.sno4))));

			MST_MFG_INST_R t3 = MST_MFG_INST_R.create("T3");
			// 製造指図
			yieldSchdL_bldr.addLeftOuterJoin(t3,
					bracket(t3.mfg_inst_no.eq(t.mfg_inst_no)));
			yieldSchdL_bldr.addSelect(t3.inst_dpt_cd.as("acpt_dpt_cd"));
			yieldSchdL_bldr.addSelect(t3.inst_usr_cd.as("acpt_usr_cd"));

			// 担当者マスタ
			MAM_USR_R m13 = MAM_USR_R.create("M13");
			yieldSchdL_bldr.addLeftOuterJoin(m13, bracket(t3.inst_usr_cd.eq(m13.usr_cd)));
			yieldSchdL_bldr.addSelect(m13.usr_nm.as("acpt_usr_nm"));

			// 部門マスタ
			MAM_DPT_R m14 = MAM_DPT_R.create("M14");
			yieldSchdL_bldr.addLeftOuterJoin(m14, bracket(t3.inst_dpt_cd.eq(m14.dpt_cd)
					.and(t3.inst_dt.between(m14.st_dt, m14.end_dt))));

			yieldSchdL_bldr.addSelect(m14.dpt_nm.as("acpt_dpt_nm"));

			yieldSchdL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			yieldSchdL_bldr.addWhereWithAnd(m1.stk_lst_flg.eq(value(true)));
			dbSelect("MSBEL0110_MST_YIELD_SCHD_S01", yieldSchdL, yieldSchdL_bldr);

			String gdCd = getDefaultFeedStkGd().gd_cd();
			String gdNm = getDefaultFeedStkGd().gd_nm();
			for (MST_YIELD_SCHD_R r : yieldSchdL) {
				r.setStringNE("gd_cd", gdCd);
				r.setStringNE("gd_nm", gdNm);
			}

			// 遷移元画面での表示順でソート
			yieldSchdL.sort(Srch01_DtlR.$mfg_inst_no);

			return yieldSchdL;
		}

		/**
		 * 製造指図ＷＫに処理対象を登録する
		 * @param sum_up
		 */
		protected void insYieldInst(MCList<Srch01_DtlR> stkList) {
			MCList<MST_MFG_INST_R> insWkL = MCList.create(MST_MFG_INST_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			
			dbWkDelete("MSBEL0110_MSW_MFG_INST_D01", insWkL_bldr.getBaseDbc());
			
			addAll(insWkL, stkList, createMap_MST_MFG_INST_R_Srch01_DtlR());	

			dbWkInsert("MSBEL0110_MSW_MFG_INST_I01",
					insWkL.groupBy(insWkL_bldr.getBaseDbc().getKeyColumn()), insWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_MFG_INST_R_Srch01_DtlR<MST_MFG_INST_R,Srch01_DtlR> createMap_MST_MFG_INST_R_Srch01_DtlR() {
			return new Map_MST_MFG_INST_R_Srch01_DtlR<MST_MFG_INST_R, Srch01_DtlR>();
		}

		public class Map_MST_MFG_INST_R_Srch01_DtlR<D extends MST_MFG_INST_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MFG_INST_R.$mfg_inst_no, Srch01_DtlR.$mfg_inst_no);
			}
		}		
		
		protected Map_Srch01_DtlR_MST_YIELD_SCHD_R<Srch01_DtlR,MST_YIELD_SCHD_R> createMap_Srch01_DtlR_MST_YIELD_SCHD_R() {
			return new Map_Srch01_DtlR_MST_YIELD_SCHD_R<Srch01_DtlR, MST_YIELD_SCHD_R>();
		}

		public class Map_Srch01_DtlR_MST_YIELD_SCHD_R<D extends Srch01_DtlR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$itm_cd, MST_YIELD_SCHD_R.$itm_cd);
				addColumnPathMap(Srch01_DtlR.$itm_sub1, MST_YIELD_SCHD_R.$itm_sub1);
				addColumnPathMap(Srch01_DtlR.$itm_sub2, MST_YIELD_SCHD_R.$itm_sub2);
				addColumnPathMap(Srch01_DtlR.$itm_sub3, MST_YIELD_SCHD_R.$itm_sub3);
				addColumnPathMap(Srch01_DtlR.$itm_nm, "itm_nm");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(Srch01_DtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(Srch01_DtlR.$lot_no, MST_YIELD_SCHD_R.$lot_no);
				addColumnPathMap(Srch01_DtlR.$sublot_no, MST_YIELD_SCHD_R.$sublot_no);
				addColumnPathMap(Srch01_DtlR.$ver_no, "ver_no");
				addColumnPathMap(Srch01_DtlR.$byprod_flg, "byprod_flg");
				addColumnPathMap(Srch01_DtlR.$stk_lst_prnt_flg, "stk_lst_prnt_flg");
				addColumnPathMap(Srch01_DtlR.$pack_unit_cd, "pack_unit_cd");
				addColumnPathMap(Srch01_DtlR.$pack_unit_nm, "pack_unit_nm");
				addColumnPathMap(Srch01_DtlR.$pack_unit_dec_place, "pack_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$pack_unit_qty, "pack_unit_qty");
				addColumnPathMap(Srch01_DtlR.$base_unit_cd, MST_YIELD_SCHD_R.$base_unit_cd);
				addColumnPathMap(Srch01_DtlR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(Srch01_DtlR.$base_unit_dec_place, "base_unit_dec_place");
				addColumnPathMap(Srch01_DtlR.$base_unit_rnd_typ, "base_unit_rnd_typ");
				addColumnPathMap(Srch01_DtlR.$base_unit_qty, "base_unit_qty");
				addColumnPathMap(Srch01_DtlR.$loc_cd, "loc_cd");
				addColumnPathMap(Srch01_DtlR.$loc_nm, "loc_nm");
				addColumnPathMap(Srch01_DtlR.$str_ln_cd, "str_ln_cd");
				addColumnPathMap(Srch01_DtlR.$str_ln_nm, "str_ln_nm");
				addColumnPathMap(Srch01_DtlR.$site_cd, "site_cd");
				addColumnPathMap(Srch01_DtlR.$site_nm, "site_nm");
				addColumnPathMap(Srch01_DtlR.$wg_cd, "wg_cd");
				addColumnPathMap(Srch01_DtlR.$wg_nm, "wg_nm");
				addColumnPathMap(Srch01_DtlR.$loc_grp_cd, "loc_grp_cd");
				addColumnPathMap(Srch01_DtlR.$loc_grp_nm, "loc_grp_nm");
				addColumnPathMap(Srch01_DtlR.$sno1, MST_YIELD_SCHD_R.$sno1);
				addColumnPathMap(Srch01_DtlR.$sno2, MST_YIELD_SCHD_R.$sno2);
				addColumnPathMap(Srch01_DtlR.$sno3, MST_YIELD_SCHD_R.$sno3);
				addColumnPathMap(Srch01_DtlR.$sno4, MST_YIELD_SCHD_R.$sno4);
				addColumnPathMap(Srch01_DtlR.$wrk_no, "wrk_no");
				addColumnPathMap(Srch01_DtlR.$wrk_nm, "wrk_nm");
				addColumnPathMap(Srch01_DtlR.$bp_lot_no, "bp_lot_no");
				addColumnPathMap(Srch01_DtlR.$unreg_lmt_flg, "unreg_lmt_flg");
				addColumnPathMap(Srch01_DtlR.$vld_dt, "vld_dt");
				addColumnPathMap(Srch01_DtlR.$lmt_dt, "lmt_dt");
				addColumnPathMap(Srch01_DtlR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(Srch01_DtlR.$mfg_inst_no, MST_YIELD_SCHD_R.$mfg_inst_no);
				addColumnPathMap(Srch01_DtlR.$yield_schd_sub_char1, "yield_schd_sub_char1");
				addColumnPathMap(Srch01_DtlR.$yield_schd_sub_char2, "yield_schd_sub_char2");
				addColumnPathMap(Srch01_DtlR.$yield_schd_sub_char3, "yield_schd_sub_char3");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_cd, "acpt_dpt_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_dpt_nm, "acpt_dpt_nm");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_cd, "acpt_usr_cd");
				addColumnPathMap(Srch01_DtlR.$acpt_usr_nm, "acpt_usr_nm");

			}
		}

		/**
		 * 現状在庫情報を取得する
		 * 
		 * @return
		 */
		protected MCList<Srch01_DtlR> srchStk() {

			// 処理対象を検索
			MCList<Srch01_DtlR> stkL = MCList.create(Srch01_DtlR.class);
			
			setRowNo();
			
			insStkListWk(up0());
			
			MCRow row = MCRow.create();
			row.addDateColumn("base_dt", getToday());
			executeQuery(stkL, MSBEL0110_MST_STK_S01(), row);

			return stkL;
		}

		/**
		 * 現状在庫ワークに処理対象を登録する
		 * @param sum_up
		 */
		protected void insStkListWk(MCList<Srch01_DtlR> stkList) {
			MCList<MSW_STK_LST_R> insWkL = MCList.create(MSW_STK_LST_R.class);

			execDbWkDelete("MSBEL0110_MSW_STK_LST_D01", MSW_STK_LST_R.create());

			addAll(insWkL, stkList, createMap_MSW_STK_LST_R_Srch01_DtlR());

			dbInsert("MSBEL0110_MSW_STK_LST_I01", insWkL,
					MCQueryApiBuilder.create(MSW_STK_LST_R.create("T")));
		}
		
		/**
		 * 現品票発行Wkへのマッピング
		 * <p>
		 */	
		protected Map_MSW_STK_LST_R_Srch01_DtlR<MSW_STK_LST_R,Srch01_DtlR> createMap_MSW_STK_LST_R_Srch01_DtlR() {
			return new Map_MSW_STK_LST_R_Srch01_DtlR<MSW_STK_LST_R, Srch01_DtlR>();
		}

		public class Map_MSW_STK_LST_R_Srch01_DtlR<D extends MSW_STK_LST_R, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_STK_LST_R.$itm_cd, Srch01_DtlR.$itm_cd);
				addColumnPathMap(MSW_STK_LST_R.$itm_sub1, Srch01_DtlR.$itm_sub1);
				addColumnPathMap(MSW_STK_LST_R.$itm_sub2, Srch01_DtlR.$itm_sub2);
				addColumnPathMap(MSW_STK_LST_R.$itm_sub3, Srch01_DtlR.$itm_sub3);
				addColumnPathMap(MSW_STK_LST_R.$loc_cd, Srch01_DtlR.$loc_cd);
				addColumnPathMap(MSW_STK_LST_R.$str_ln_cd, Srch01_DtlR.$str_ln_cd);
				addColumnPathMap(MSW_STK_LST_R.$stk_arrv_bp_cd, Srch01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(MSW_STK_LST_R.$lot_no, Srch01_DtlR.$lot_no);
				addColumnPathMap(MSW_STK_LST_R.$sublot_no, Srch01_DtlR.$sublot_no);
				addColumnPathMap(MSW_STK_LST_R.$sno1, Srch01_DtlR.$sno1);
				addColumnPathMap(MSW_STK_LST_R.$sno2, Srch01_DtlR.$sno2);
				addColumnPathMap(MSW_STK_LST_R.$sno3, Srch01_DtlR.$sno3);
				addColumnPathMap(MSW_STK_LST_R.$sno4, Srch01_DtlR.$sno4);
				addColumnPathMap(MSW_STK_LST_R.$fix_no_typ, Srch01_DtlR.$fix_no_typ);
				addColumnPathMap(MSW_STK_LST_R.$fix_no, Srch01_DtlR.$fix_no);
				addColumnPathMap(MSW_STK_LST_R.$pack_unit_cd, Srch01_DtlR.$pack_unit_cd);
				addColumnPathMap(MSW_STK_LST_R.$gd_cd, Srch01_DtlR.$gd_cd);
				addColumnPathMap(MSW_STK_LST_R.$in_xfr_typ, Srch01_DtlR.$in_xfr_typ);
				addColumnPathMap(MSW_STK_LST_R.$quality_typ, Srch01_DtlR.$quality_typ);
				addColumnPathMap(MSW_STK_LST_R.$stk_insp_typ, Srch01_DtlR.$stk_insp_typ);
				addColumnPathMap(MSW_STK_LST_R.$asst_typ, Srch01_DtlR.$asst_typ);
				addColumnPathMap(MSW_STK_LST_R.$stk_id_typ, Srch01_DtlR.$stk_id_typ);
				addColumnPathMap(MSW_STK_LST_R.$stk_bp_cd, Srch01_DtlR.$stk_bp_cd);
				addColumnPathMap(MSW_STK_LST_R.$disp_seq, Srch01_DtlR.$row_no);
			}
		}
		
		
		/**
		 * 遷移元画面における表示順を保持する
		 */
		protected void setRowNo() {

			int i = 0;

			for (Srch01_DtlR r : up0()){

				r.row_no(i);
				i++;
			}
		}

		/**
		 * 区分の名称を設定する
		 */
		protected void setName() {

			Locale lclCd;
			if (!isNull(down0().get(0).prnt_lcl_cd())) {
				lclCd = toLocaleFromLclCd(down0().get(0).prnt_lcl_cd());
			}
			else {
				lclCd = MCSys.user.locale();
			}

			MAC_QUALITY_TYP.putNameNE(down0(), Srch01_DtlR.$quality_typ, Srch01_DtlR.$quality_typ_nm, lclCd);
			MSC_STK_INSP_TYP.putNameNE(down0(), Srch01_DtlR.$stk_insp_typ, Srch01_DtlR.$stk_insp_typ_nm, lclCd);
			MSC_STK_ID_TYP.putNameNE(down0(), Srch01_DtlR.$stk_id_typ, Srch01_DtlR.$stk_id_typ_nm, lclCd);
			MSC_FIX_NO_TYP.putNameNE(down0(), Srch01_DtlR.$fix_no_typ, Srch01_DtlR.$fix_no_typ_nm, lclCd);
			MAC_ASST_TYP.putNameNE(down0(), Srch01_DtlR.$asst_typ, Srch01_DtlR.$asst_typ_nm, lclCd);
		}

		/**
		 * 印刷枚数の初期値、梱包入数、端数を設定する
		 */
		protected void setQty(){
			MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
			MAVM_ITM_UNIT_R itm_unit = MAVM_ITM_UNIT_R.create("ITM_UNIT");
			//荷姿の品目単位マスタ情報を取得するキャッシュ
			MAVM_ITM_UNIT_R packDbc_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder packDbc_bldr = MCQueryApiBuilder.create(packDbc_t);
			packDbc_bldr.setSelect(packDbc_t.itm_cd);
			packDbc_bldr.addSelect(packDbc_t.itm_sub1);
			packDbc_bldr.addSelect(packDbc_t.itm_sub2);
			packDbc_bldr.addSelect(packDbc_t.itm_sub3);
			packDbc_bldr.addSelect(packDbc_t.unit_cd);
			packDbc_bldr.addSelect(packDbc_t.conv_base_qty);
			packDbc_bldr.addSelect(packDbc_t.conv_qty);
			packDbc_bldr.addSelect(packDbc_t.dec_place);
			packDbc_bldr.addSelect(packDbc_t.pckg_flg);
			packDbc_bldr.addLeftOuterJoin(unit, bracket(packDbc_t.unit_cd.eq(unit.unit_cd)));
			packDbc_bldr.addSelect(unit.unit_nm);

			FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> packCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					packDbc_bldr, down0(), Srch01_DtlR.$itm_cd, Srch01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub3, Srch01_DtlR.$pack_unit_cd);

			//デフォルト梱包単位を取得するキャッシュ
			MAM_ITM_R defPckgDbc_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder defPckgDbc_bldr = MCQueryApiBuilder.create(defPckgDbc_t);
			defPckgDbc_bldr.setSelect(defPckgDbc_t.itm_cd);
			defPckgDbc_bldr.addSelect(defPckgDbc_t.itm_sub1);
			defPckgDbc_bldr.addSelect(defPckgDbc_t.itm_sub2);
			defPckgDbc_bldr.addSelect(defPckgDbc_t.itm_sub3);
			defPckgDbc_bldr.addLeftOuterJoin(itm_unit,
					bracket(defPckgDbc_t.itm_cd.eq(itm_unit.itm_cd)
							.and(defPckgDbc_t.itm_sub1.eq(itm_unit.itm_sub1))
							.and(defPckgDbc_t.itm_sub2.eq(itm_unit.itm_sub2))
							.and(defPckgDbc_t.itm_sub3.eq(itm_unit.itm_sub3))
							.and(defPckgDbc_t.pckg_unit_cd.eq(itm_unit.unit_cd))));
			defPckgDbc_bldr.addLeftOuterJoin(unit,
					bracket(defPckgDbc_t.pckg_unit_cd.eq(unit.unit_cd)));
			defPckgDbc_bldr.addSelect(itm_unit.unit_cd);
			defPckgDbc_bldr.addSelect(itm_unit.conv_base_qty);
			defPckgDbc_bldr.addSelect(itm_unit.conv_qty);
			defPckgDbc_bldr.addSelect(itm_unit.dec_place);
			defPckgDbc_bldr.addSelect(unit.unit_nm);

			FXUCL_MCDbcCache<MAM_ITM_R> defPckgCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
					defPckgDbc_bldr, down0(), Srch01_DtlR.$itm_cd, Srch01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub3);
			
			for (Srch01_DtlR r : down0()){
				MAVM_ITM_UNIT_R packUnitR = packCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pack_unit_cd());

				if (!isSame(r.pack_unit_cd(), r.base_unit_cd()) && packUnitR.pckg_flg()){
					//荷姿単位≠基準単位かつ対象の現品情報の荷姿が梱包単位の場合は、その単位で単位換算する
					setPckgUnitQtySub(r, packUnitR);
				}
				else {
					//対象の現品情報の荷姿が梱包単位でない場合は、デフォルト梱包単位で単位換算する
					MAM_ITM_R defPckgUnitR = defPckgCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (!isNull(defPckgUnitR.unit_cd())) { // 注意：ここでは便宜的にunit_cd項目にデフォルトの梱包単位CDを格納している
						setPckgUnitQtySub(r, defPckgUnitR);
					}
					else {
						//デフォルト梱包単位が存在しない場合は、適当な印刷枚数を算出できないため、
						//印刷枚数を１で固定する
						//梱包入数には、基準単位数を設定する

						r.prnt_all_qty(MCNumber.ONE);

						r.qty_per_pckg_unit(r.base_unit_qty());
						r.unit_cd_per_pckg_unit(r.base_unit_cd());
						r.unit_nm_per_pckg_unit(r.base_unit_nm());
						r.pckg_unit_cd(r.base_unit_cd());
						r.pckg_unit_nm(r.base_unit_nm());
					}
				}
			}
		}

		/**
		 * 印刷枚数、梱包入数、端数を設定する（実部）
		 * @param r
		 * @param itmUnitR
		 */
		protected void setPckgUnitQtySub(Srch01_DtlR r, MCRow itmUnitR){
			MCNumber[] num = r.base_unit_qty().multiply(itmUnitR.getNumberNE("conv_base_qty")).divideAndRemainder(itmUnitR.getNumberNE("conv_qty"));

			r.prnt_all_qty(num[0].setScale(0));
			r.qty_per_pckg_unit(convToBaseUnit(MCNumber.ONE, itmUnitR.getNumberNE("conv_base_qty"), itmUnitR.getNumberNE("conv_qty")
					, r.base_unit_dec_place(), r.base_unit_rnd_typ()));
			r.unit_cd_per_pckg_unit(r.base_unit_cd());
			r.unit_nm_per_pckg_unit(r.base_unit_nm());
			r.pckg_unit_cd(itmUnitR.getStringNE("unit_cd"));
			r.pckg_unit_nm(itmUnitR.getStringNE("unit_nm"));

			if (!num[1].isZero()){
				r.rmndr_unit_qty(num[1].setScale(r.base_unit_dec_place().intValue(), MAC_RND_TYP.get(r.base_unit_rnd_typ()).toMC()));
				r.rmndr_unit_cd(r.base_unit_cd());
				r.rmndr_unit_nm(r.base_unit_nm());
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 現品票を発行します。<br>
	 */
	public class Prnt01 extends MSBEL_StkListPrnt_MC_A.Prnt01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Srch01_DtlR> notErrL = up0().subList(Srch01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				beforePrnt(notErrL);
				compRptId(notErrL);
				prnt(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Srch01_DtlR.$peg_no, up0());

			setRowNo();
		}

		/**
		 * 印刷前処理
		 */
		protected void beforePrnt(MCList<Srch01_DtlR> notErrL) {
			updArrAct(notErrL);
			updShipAct(notErrL);
			updShipAllocSts(notErrL);
			updYieldActRem(notErrL);
		}

		/**
		 * 上り電文の順番を保持
		 */
		protected void setRowNo() {

			// 上り電文の順番を保持
			for (int i=0; i<up0().size(); i++) {
				up0().get(i).row_no(i);
			}

			boolean sort = false;

			Srch01_DtlR r = up0().get(0);
			if (sort = !isNull(r.arr_act_no())){
				up0().sort(Srch01_DtlR.$arr_act_no, Srch01_DtlR.$row_no);
			}
			else if (sort = !isNull(r.ship_act_no())) {
				up0().sort(Srch01_DtlR.$ship_act_no, Srch01_DtlR.$cst_po_d_no, Srch01_DtlR.$row_no);
			}
			else if (sort = !isNull(r.ship_inst_no())) {
				up0().sort(Srch01_DtlR.$ship_inst_no, Srch01_DtlR.$cst_po_d_no, Srch01_DtlR.$row_no);
			}
			else if (sort = !isNull(r.yield_act_no())) {
				up0().sort(Srch01_DtlR.$row_no, Srch01_DtlR.$yield_schd_no, Srch01_DtlR.$yield_act_no);
			}
			else if (sort = !isNull(r.mfg_inst_no())) {
				up0().sort(Srch01_DtlR.$mfg_inst_no, Srch01_DtlR.$row_no);
			}

			if (sort) {
				// 各条件ごとのソート順を保持
				for (int i=0; i<up0().size(); i++) {
					up0().get(i).row_no(i);
				}
			}
		}

		/**
		 * 入荷実績を更新する
		 */
		protected void updArrAct(MCList<Srch01_DtlR> notErrL) {

			if (isNull(notErrL.get(0).arr_act_no())){
				return;
			}

			MSBEL_ArrActService.ArrAct_Upd02 ope = MSBEL_ArrActService.crtArrAct_Upd02();
			for (Srch01_DtlR r : notErrL) {
				copy(ope.up0(), r, createMap_ArrAct_DtlR_Srch01_DtlR());
				ope.exec();
			}
		}

		protected Map_ArrAct_DtlR_Srch01_DtlR<ArrAct_DtlR,Srch01_DtlR> createMap_ArrAct_DtlR_Srch01_DtlR() {
			return new Map_ArrAct_DtlR_Srch01_DtlR<ArrAct_DtlR, Srch01_DtlR>();
		}

		public class Map_ArrAct_DtlR_Srch01_DtlR<D extends ArrAct_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrAct_DtlR.$arr_act_no, Srch01_DtlR.$arr_act_no);

			}
		}

		/**
		 * 出荷実績を更新する
		 */
		protected void updShipAct(MCList<Srch01_DtlR> notErrL) {

			if (isNull(notErrL.get(0).ship_act_d_no())){
				return;
			}

			MSBEL_ShipActService.ShipAct_Upd03 ope = MSBEL_ShipActService.crtShipAct_Upd03();
			addAll(ope.up0(), notErrL, createMap_ShipAct_DtlR_Srch01_DtlR());
			ope.exec();
		}

		protected Map_ShipAct_DtlR_Srch01_DtlR<ShipAct_DtlR,Srch01_DtlR> createMap_ShipAct_DtlR_Srch01_DtlR() {
			return new Map_ShipAct_DtlR_Srch01_DtlR<ShipAct_DtlR, Srch01_DtlR>();
		}

		public class Map_ShipAct_DtlR_Srch01_DtlR<D extends ShipAct_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_DtlR.$ship_act_d_no, Srch01_DtlR.$ship_act_d_no);

			}
		}

		/**
		 * 出荷引当状況を更新する
		 */
		protected void updShipAllocSts(MCList<Srch01_DtlR> notErrL) {

			if (isNull(notErrL.get(0).ship_alloc_sts_no())){
				return;
			}

			MSBEL_ShipSchdService.ShipSchd_Upd07 ope = MSBEL_ShipSchdService.crtShipSchd_Upd07();
			addAll(ope.up0(), notErrL, createMap_ShipSchd_Upd07_DtlR_Srch01_DtlR());
			ope.exec();
		}

		protected Map_ShipSchd_Upd07_DtlR_Srch01_DtlR<ShipSchd_Upd07_DtlR,Srch01_DtlR> createMap_ShipSchd_Upd07_DtlR_Srch01_DtlR() {
			return new Map_ShipSchd_Upd07_DtlR_Srch01_DtlR<ShipSchd_Upd07_DtlR, Srch01_DtlR>();
		}

		public class Map_ShipSchd_Upd07_DtlR_Srch01_DtlR<D extends ShipSchd_Upd07_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipSchd_Upd07_DtlR.$ship_alloc_sts_no, Srch01_DtlR.$ship_alloc_sts_no);
			}
		}

		/**
		 * 出来高実績残を更新する
		 */
		protected void updYieldActRem(MCList<Srch01_DtlR> notErrL) {
			
			if (isNull(notErrL.get(0).yield_act_no()) && isNull(notErrL.get(0).yield_schd_no())){
				return;
			}

			MSBCL_MfgInstActComService.MfgInstActCom_Upd06 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd06();
			addAll(ope.up0(), notErrL, createMap_MfgInstActCom_Upd06_DtlR_Srch01_DtlR());
			ope.exec();
		}

		protected Map_MfgInstActCom_Upd06_DtlR_Srch01_DtlR<MfgInstActCom_Upd06_DtlR,Srch01_DtlR> createMap_MfgInstActCom_Upd06_DtlR_Srch01_DtlR() {
			return new Map_MfgInstActCom_Upd06_DtlR_Srch01_DtlR<MfgInstActCom_Upd06_DtlR, Srch01_DtlR>();
		}

		public class Map_MfgInstActCom_Upd06_DtlR_Srch01_DtlR<D extends MfgInstActCom_Upd06_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd06_DtlR.$yield_schd_no, Srch01_DtlR.$yield_schd_no);
				addColumnPathMap(MfgInstActCom_Upd06_DtlR.$yield_act_no, Srch01_DtlR.$yield_act_no);

			}
		}

		/**
		 * 帳票ＩＤの補完
		 * @param notErrL
		 */
		protected void compRptId(MCList<Srch01_DtlR> notErrL) {
			// 得意先ＣＤが設定されている場合、取引先マスタの現品票ＣＤから伝票帳票マスタを参照し、帳票ＩＤを取得する
			MCList<Srch01_DtlR> tgtL = notErrL.subList(r -> !isNull(r.cst_cd()));
			MCList<MAM_SLIP_FORM_R> formL = MCList.create(MAM_SLIP_FORM_R.class);
			MAM_SLIP_FORM_R t = MAM_SLIP_FORM_R.create("T");
			MCQueryApiBuilder formL_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R t1 = MAM_BP_R.create("T1");
			formL_bldr.setSelect(t.slip_form_id);
			formL_bldr.addSelect(t1.bp_cd.as("cst_cd"));
			formL_bldr.addInnerJoin(t1, bracket(t.slip_form_cd.eq(t1.stk_lst_form_cd)));
			formL_bldr.setWhere(t1.bp_cd.eq(bind("cst_cd")));
			dbSelect("MSBEL0110_MAM_SLIP_FORM_S01",
					formL, formL_bldr, tgtL.groupBy(Srch01_DtlR.$cst_cd));
			
			if (formL.isEmpty()) {
				return;
			}

			MCIndexKey cstKey = formL.createIndex("CST_CD");
			
			// notErrLに帳票ＩＤを設定する
			for (Srch01_DtlR r : notErrL) {
				if (isNull(r.cst_cd())) {
					continue;
				}
				MAM_SLIP_FORM_R formR = formL.getFirst(cstKey, r.cst_cd());
				if (isNull(formR)) {
					continue;
				}
				r.slip_form_id(formR.slip_form_id());
			}
		}

		/**
		 * レポートセットのまとめグループ
		 */
		protected String[] _prntGrpKey = {
			Srch01_DtlR.$itm_cd,
			Srch01_DtlR.$itm_sub1,
			Srch01_DtlR.$itm_sub2,
			Srch01_DtlR.$itm_sub3,
			Srch01_DtlR.$itm_nm,
			Srch01_DtlR.$lot_no,
			Srch01_DtlR.$sublot_no,
			Srch01_DtlR.$bp_lot_no,
			Srch01_DtlR.$mfg_inst_no,
			Srch01_DtlR.$arr_act_no,
			Srch01_DtlR.$ship_inst_no,
			Srch01_DtlR.$ship_inst_d_no,
			Srch01_DtlR.$ship_act_no,
			Srch01_DtlR.$ship_act_d_no,
			Srch01_DtlR.$yield_schd_no,
			Srch01_DtlR.$mfg_act_no,
			Srch01_DtlR.$yield_act_no
		};

		/**
		 * 印刷処理
		 */
		protected void prnt(MCList<Srch01_DtlR> notErrL) {

			// 帳票ＩＤ毎に印刷処理を実行する
			for (MCList<Srch01_DtlR> grpL : notErrL.groupList(Srch01_DtlR.$slip_form_id)) {
				MSBCR_StkList reportSet = setData(grpL);

				// 帳票ＩＤの設定
				Srch01_DtlR grpR = grpL.get(0);
				if (!isNull(grpR.slip_form_id())) {
					reportSet.setReportID(grpR.slip_form_id());
				}
				
				MCServerReportManager.request(reportSet);
			}
		}

		protected MSBCR_StkList setData(MCList<Srch01_DtlR> notErrL) {

			MSBCR_StkList reportSet = MSBCR_StkList.create();
			reportSet.setPersistent(false);	// まとめ分は永続データとしない
			reportSet.setRegister(false);

			// 上り電文の順番を優先に並び替える
			MCList<Srch01_DtlR>[] grpL = notErrL.groupList(_prntGrpKey);
			for (int i=0; i<grpL.length; i++) {
				grpL[i].sort(Srch01_DtlR.$row_no);
			}
			Arrays.sort(grpL, new Comparator<MCList<Srch01_DtlR>>() {
				public int compare(MCList<Srch01_DtlR> o1, MCList<Srch01_DtlR> o2) {
					return o1.get(0).row_no().compareTo(o2.get(0).row_no());
				}
			});

			for (MCList<Srch01_DtlR> l : grpL) {
				MSBCR_StkList rptSet = MSBCR_StkList.create();
				setBizInfo(rptSet, l.get(0));
				
				MCList<StkListDtlR> list = MCList.create(StkListDtlR.class);
				for (Srch01_DtlR r : l) {
					StkListDtlR dtlR = StkListDtlR.create();
					setPrntDat(dtlR, r);
					addPrntDat(dtlR, r, list);
				}

				putPrntStr(list, StkListDtlR.$lot_no_view, StkListDtlR.$lot_no_data);
				putPrntStr(list, StkListDtlR.$sublot_no_view, StkListDtlR.$sublot_no_data);
				putPrntItmSub1(list, StkListDtlR.$itm_sub1_view, StkListDtlR.$itm_sub1_data);
				putPrntItmSub2(list, StkListDtlR.$itm_sub2_view, StkListDtlR.$itm_sub2_data);
				putPrntItmSub3(list, StkListDtlR.$itm_sub3_view, StkListDtlR.$itm_sub3_data);
				putNumStr(rptSet, list, StkListDtlR.$s_base_unit_qty,  StkListDtlR.$base_unit_qty, "base_unit_dec_place");
				putNumStr(rptSet, list, StkListDtlR.$s_dlv_inst_qty,  StkListDtlR.$dlv_inst_qty, "trd_unit_dec_place");
				putNumStr(rptSet, list, StkListDtlR.$s_cntnr_qty,  StkListDtlR.$cntnr_qty, "cntnr_unit_dec_place");
				putPrntSnoLabel1(list, StkListDtlR.$sno1_lbl);
				putPrntSno1(list, StkListDtlR.$sno1_view, StkListDtlR.$sno1_data);
				putPrntSnoLabel2(list, StkListDtlR.$sno2_lbl);
				putPrntSno2(list, StkListDtlR.$sno2_view, StkListDtlR.$sno2_data);
				putPrntSnoLabel3(list, StkListDtlR.$sno3_lbl);
				putPrntSno3(list, StkListDtlR.$sno3_view, StkListDtlR.$sno3_data);
				putPrntSnoLabel4(list, StkListDtlR.$sno4_lbl);
				putPrntSno4(list, StkListDtlR.$sno4_view, StkListDtlR.$sno4_data);

				// 印刷データ登録用レポートセットへ追加
				rptSet.addAll(list);
				MCServerReportManager.request(rptSet, false);

				// 印刷用レポートセットへ追加
				reportSet.addAll(rptSet.getAll());
			}

			return reportSet;
		}

		protected void setPrntDat(StkListDtlR dtlR, Srch01_DtlR r) {

			dtlR.bp_nm(r.cst_nm());
			if (!isNull(r.cst_itm_cd())) {
				dtlR.dlv_slip_itm_cd(r.cst_itm_cd());
			}
			else {
				dtlR.dlv_slip_itm_cd(r.itm_cd());
			}
			dtlR.lot_no_data(r.lot_no());
			dtlR.sublot_no_data(r.sublot_no());
			dtlR.base_unit_qty(r.qty_per_pckg_unit());
			dtlR.addNumberColumn("base_unit_dec_place", r.base_unit_dec_place());
			if (!isNull(r.cst_itm_nm())) {
				dtlR.dlv_slip_itm_nm(r.cst_itm_nm());
			}
			else {
				dtlR.dlv_slip_itm_nm(r.itm_nm());
			}
			dtlR.dlv_cd(r.dlv_cd());
			dtlR.dlv_nm(r.dlv_nm());
			dtlR.dlv_alt_nm1(r.dlv_alt_nm1());
			dtlR.dlv_alt_nm2(r.dlv_alt_nm2());
			dtlR.dlv_alt_nm3(r.dlv_alt_nm3());
			dtlR.dlv_alt_nm4(r.dlv_alt_nm4());
			dtlR.dlv_inst_qty(r.pack_unit_qty());
			dtlR.addNumberColumn("trd_unit_dec_place", r.pack_unit_dec_place());
			dtlR.co_nm(r.co_nm());
			dtlR.co_cd(r.co_cd());
			dtlR.qr_cd(r.itm_cd());
			dtlR.cst_po_no(r.cst_po_no());
			dtlR.cst_po_d_no(r.cst_po_d_no());
			dtlR.cst_dlv_inst_no(r.cst_dlv_inst_no());
			dtlR.cst_dlv_inst_d_no(r.cst_dlv_inst_d_no());
			dtlR.dlv_rqst_dt(r.dlv_rqst_dt());
			dtlR.dlv_rqst_tm(r.dlv_rqst_tm());
			dtlR.trd_d_rmrks(r.trd_d_rmrks());
			dtlR.itm_cd(r.itm_cd());
			dtlR.itm_sub1_data(r.itm_sub1());
			dtlR.itm_sub2_data(r.itm_sub2());
			dtlR.itm_sub3_data(r.itm_sub3());
			dtlR.itm_nm(r.itm_nm());
			dtlR.itm_alt_nm1(r.itm_alt_nm1());
			dtlR.itm_alt_nm2(r.itm_alt_nm2());
			dtlR.itm_alt_nm3(r.itm_alt_nm3());
			dtlR.itm_alt_nm4(r.itm_alt_nm4());
			dtlR.prnt_dt(MCDate.now());
			dtlR.cst_nm(r.cst_nm());
			dtlR.cst_alt_nm1(r.cst_alt_nm1());
			dtlR.cst_alt_nm2(r.cst_alt_nm2());
			dtlR.cst_alt_nm3(r.cst_alt_nm3());
			dtlR.cst_alt_nm4(r.cst_alt_nm4());
			dtlR.dlv_id_cd(r.dlv_id_cd());
			dtlR.dlv_id_nm(r.dlv_id_nm());
			dtlR.dlv_id_alt_nm1(r.dlv_id_alt_nm1());
			dtlR.dlv_id_alt_nm2(r.dlv_id_alt_nm2());
			dtlR.dlv_id_alt_nm3(r.dlv_id_alt_nm3());
			dtlR.dlv_id_alt_nm4(r.dlv_id_alt_nm4());
			if (!isNull(r.ver_no())) {
				dtlR.ver_no_lbl(MSC_STKLST_STR.VER_NO.name(getUsrLocale()));
				dtlR.ver_no(r.ver_no());
			}
			dtlR.sno1_data(r.sno1());
			dtlR.sno2_data(r.sno2());
			dtlR.sno3_data(r.sno3());
			dtlR.sno4_data(r.sno4());
			dtlR.cntnr_qty(r.qty_per_pckg_unit());
			dtlR.base_unit_cd(r.unit_cd_per_pckg_unit());
			dtlR.base_unit_nm(r.unit_nm_per_pckg_unit());
			dtlR.cntnr_unit_cd(r.pckg_unit_cd());
			dtlR.cntnr_unit_nm(r.pckg_unit_nm());
			dtlR.addNumberColumn("cntnr_unit_dec_place", r.base_unit_dec_place());
			dtlR.vld_dt(r.vld_dt());
			dtlR.lmt_dt(r.lmt_dt());
			dtlR.bp_lot_no(r.bp_lot_no());
			dtlR.mfg_inst_no(r.mfg_inst_no());
			dtlR.po_d_no(r.po_d_no());
			dtlR.dlv_slip_no(r.dlv_slip_no());
			dtlR.dlv_slip_d_no(r.dlv_slip_d_no());
			dtlR.arr_dpt_cd(r.arr_dpt_cd());
			dtlR.arr_dpt_nm(r.arr_dpt_nm());
			dtlR.arr_usr_cd(r.arr_usr_cd());
			dtlR.arr_usr_nm(r.arr_usr_nm());
			dtlR.acpt_dpt_cd(r.acpt_dpt_cd());
			dtlR.acpt_dpt_nm(r.acpt_dpt_nm());
			dtlR.acpt_usr_cd(r.acpt_usr_cd());
			dtlR.acpt_usr_nm(r.acpt_usr_nm());
			dtlR.lot_rmrks(r.lot_rmrks());
			dtlR.cntnr_flg(true);
			dtlR.ship_act_d_sub_char1(r.ship_act_d_sub_char1());
			dtlR.ship_act_d_sub_char2(r.ship_act_d_sub_char2());
			dtlR.ship_act_d_sub_char3(r.ship_act_d_sub_char3());
			dtlR.ship_alloc_sts_sub_char1(r.ship_alloc_sts_sub_char1());
			dtlR.ship_alloc_sts_sub_char2(r.ship_alloc_sts_sub_char2());
			dtlR.ship_alloc_sts_sub_char3(r.ship_alloc_sts_sub_char3());
			dtlR.arr_act_sub_char1(r.arr_act_sub_char1());
			dtlR.arr_act_sub_char2(r.arr_act_sub_char2());
			dtlR.arr_act_sub_char3(r.arr_act_sub_char3());
			dtlR.yield_schd_sub_char1(r.yield_schd_sub_char1());
			dtlR.yield_schd_sub_char2(r.yield_schd_sub_char2());
			dtlR.yield_schd_sub_char3(r.yield_schd_sub_char3());
			dtlR.yield_act_sub_char1(r.yield_act_sub_char1());
			dtlR.yield_act_sub_char2(r.yield_act_sub_char2());
			dtlR.yield_act_sub_char3(r.yield_act_sub_char3());
			dtlR.stk_sub_char1(r.stk_sub_char1());
			dtlR.stk_sub_char2(r.stk_sub_char2());
			dtlR.stk_sub_char3(r.stk_sub_char3());
			dtlR.addBooleanColumn("rmndr_prnt_flg", r.rmndr_prnt_flg());
			dtlR.prnt_user_id(MCSys.user.ID());
			dtlR.loc_cd(r.loc_cd());
			dtlR.site_cd(r.site_cd());
			if (isNull(r.client_typ())) {
				dtlR.client_typ(MAC_CLIENT_TYP.PC.value());
			}else{
				dtlR.client_typ(r.client_typ());
			}	
		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param reportSet
		 */
		protected void setBizInfo(MSBCR_StkList reportSet, Srch01_DtlR r) {
			reportSet.setAppItmCd(r.itm_cd());
			reportSet.setAppItmSub1(r.itm_sub1());
			reportSet.setAppItmSub2(r.itm_sub2());
			reportSet.setAppItmSub3(r.itm_sub3());
			reportSet.setAppItmNm(r.itm_nm());
			reportSet.setAppRmrks1(r.lot_no());
			reportSet.setAppRmrks2(r.sublot_no());
			reportSet.setAppRmrks3(r.bp_lot_no());
			reportSet.setAppRmrks4(r.mfg_inst_no());
			if (!isNull(r.arr_act_no())) {
				reportSet.setAppReportNo1(r.arr_act_no());
			}
			else if (!isNull(r.ship_act_no())) {
				reportSet.setAppReportNo1(r.ship_act_no());
				reportSet.setAppReportNo2(r.ship_act_d_no());
			}
			else if (!isNull(r.ship_alloc_sts_no())) {
				reportSet.setAppReportNo1(r.ship_inst_no());
				reportSet.setAppReportNo2(r.ship_inst_d_no());
			}
			else if (!isNull(r.yield_act_no())) {
				reportSet.setAppReportNo1(r.yield_act_no());
			}
			else if (!isNull(r.yield_schd_no())) {
				reportSet.setAppReportNo1(r.yield_schd_no());
			}
			if(!isNull(r.slip_form_id())) {
				reportSet.setReportID(r.slip_form_id());
			}
		}

		/**
		 * 印刷枚数分印刷データを追加し、端数印刷する場合は端数分のデータを加える。
		 * 
		 * @param list
		 */
		protected void addPrntDat(StkListDtlR dtlR, Srch01_DtlR r, MCList<StkListDtlR> list) {

			int prntAllQty = r.prnt_all_qty().intValue();
			if (r.rmndr_prnt_flg()) {
				prntAllQty += 1;
			}

			for (int i = 1; i <=  prntAllQty; i++) {

				StkListDtlR clnR = dtlR.clone();

				if (i == prntAllQty && r.rmndr_prnt_flg()){
					clnR.cntnr_qty(r.rmndr_unit_qty());
					clnR.base_unit_qty(r.rmndr_unit_qty());
					clnR.base_unit_cd(r.rmndr_unit_cd());
					clnR.base_unit_nm(r.rmndr_unit_nm());
					clnR.cntnr_unit_cd(null);
					clnR.cntnr_unit_nm(null);
					clnR.cntnr_flg(false);
					
				}
				clnR.page_sum(prntAllQty);
				clnR.page_cnt(i);;

				list.add(clnR);
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_StkListPrnt.Chk01 ope = MSBEL_StkListPrnt.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected void handleSuccess(MCList<Srch01_DtlR> l) {
		dbTran().commit();
		for (Srch01_DtlR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e,
			MCList<Srch01_DtlR> l) {
		dbTran().rollback();
		
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);

		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		for (Srch01_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 現品票発行前のチェックを行います。<br>
	 */
	public class Chk01 extends MSBEL_StkListPrnt_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Srch01_DtlR> notErrL = getChkList(up0());

			MCNumber limit_num = getCo().stk_lst_limit_num();
			if (isNull(limit_num) || !limit_num.isPositive()) {
				limit_num = MCNumber.ONE.multiply(1000);
			}
			for (Srch01_DtlR r : notErrL) {
			// 印刷上限枚数を超えているため、出力できません。
				if (r.prnt_all_qty().gt(limit_num)) {
					msgL.add(new MCMessage(r, Srch01_DtlR.$prnt_all_qty, MSBEL0312, limit_num, toDispGUIIndex(r)));
				}
			}
			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}