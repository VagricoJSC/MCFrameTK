package mcframe.serverMSBE.MSBEL0090;

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
import static mcframe.serverMSBE.MSBEL0090.Query.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IoSchdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IoSchdSrch_MC extends MSBEL_IoSchdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指定された期間の入出庫の予定を受払予定として照会する<br>
	 */
	public class Srch01 extends MSBEL_IoSchdSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp0();

			MCQueryPlan sql = editSql(up0());
			String[] cols = getOrderByCols(up0());
			searchForDL(sql, up0(), down0(), cols);
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			//登録機能名・更新機能名を補完する
			setFuncNm(down0());

			//集計タブの受払予定伝票ＮＯがチェックオフの場合、集計を行う
			if(!up0().slip_schd_no_flg()) {
				MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
				rsltL.setAll(down0());

				List<String> remove = new ArrayList<String>();
				collectDispCols(remove);

				List<String> group = new ArrayList<String>(Arrays.asList(down0().getColumnPathArray()));
				group.removeAll(remove);

				down0().setAll(aggregate(rsltL, group.toArray(new String[group.size()])));
			}
			down0().sort(getOrderByCols(up0()));
		}

		protected void editUp0() {
			up0().addStringColumn("sno1_null_flg", booleanToString(up0().sno1_null_ng_flg(), up0().sno1_null_ok_flg()));
			up0().addStringColumn("sno2_null_flg", booleanToString(up0().sno2_null_ng_flg(), up0().sno2_null_ok_flg()));
			up0().addStringColumn("sno3_null_flg", booleanToString(up0().sno3_null_ng_flg(), up0().sno3_null_ok_flg()));
			up0().addStringColumn("sno4_null_flg", booleanToString(up0().sno4_null_ng_flg(), up0().sno4_null_ok_flg()));
			up0().addStringColumn("alloc_tgt_flg", booleanToString(up0().non_alloc_tgt_flg(), up0().is_alloc_tgt_flg()));
			up0().addStringColumn("alloc_flg", booleanToString(up0().yet_allocate_flg(), up0().allocated_flg()));
			up0().addStringColumn("alloc_wait_flg", booleanToString(up0().non_alloc_wait_flg(), up0().is_alloc_wait_flg()));

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
				dbSelect("MSBEL0090_MAM_ITM_S01", itm, itm_bldr, up0());
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

		protected MCQueryPlan editSql(Srch01_CndR cndR) {
			MST_IO_SCHD_R S0T1 = MST_IO_SCHD_R.create("T");
			MST_ORD_IO_SCHD_R S0T2 = MST_ORD_IO_SCHD_R.create("T");
			MST_SAVORD_IO_SCHD_R S0T3 = MST_SAVORD_IO_SCHD_R.create("T");
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
			MCDynamicSQLID REP3 = createDynamicSQLID("REP3");
			
			MCQueryPlan sql = MSBEL0090_MST_IO_SCHD_S01(REP1);
			
			MCMainQuery mainQuery= sql.getQuery();
			MCSubQuery subQuery1 = MSBEL0090_MST_IO_SCHD_S01(REP2).toSubQuery();
			MCSubQuery subQuery2 = MSBEL0090_MST_IO_SCHD_S01(REP3).toSubQuery();
				
			MCMainQuery edit = mainQuery.unionAll(subQuery1).unionAll(subQuery2).orderBy(getOrderByClause(cndR));
			
			sql.setQuery(edit);
			
			sql.addDynamicSQLInfo(when(null).view(REP1, v -> S0T1).view(REP2, v -> S0T2).view(REP3, v -> S0T3));

			return sql;
		}

		/**
		 * ORDER BY句の文字列を返す 
		 */
		protected MCOrder[] getOrderByClause(Srch01_CndR cndR) {
			List<MCOrder> orderList = new ArrayList<>();
			
			if (cndR.slip_schd_no_flg() == true) {
				orderList.add(pr("slip_schd_no").asc());
			}
			if (cndR.loc_flg() == true) {
				orderList.add(pr("loc_cd").asc());
			}
			if (cndR.str_ln_flg() == true) {
				orderList.add(pr("str_ln_cd").asc());
			}

			orderList.add(pr("itm_cd").asc());
			orderList.add(pr("itm_sub1").asc());
			orderList.add(pr("itm_sub2").asc());
			orderList.add(pr("itm_sub3").asc());
			
			return orderList.toArray(new MCOrder[0]);
		}

		/**
		 * SQLのORDER BYに使う項目
		 */
		protected String[] getOrderByCols(Srch01_CndR cndR) {
			List<String> cols = new ArrayList<String>();

			if (cndR.slip_schd_no_flg() == true) {
				cols.add("SLIP_SCHD_NO");
			}
			if (cndR.loc_flg() == true) {
				cols.add("LOC_CD");
			}
			if (cndR.str_ln_flg() == true) {
				cols.add("STR_LN_CD");
			}

			cols.add("ITM_CD");
			cols.add("ITM_SUB1");
			cols.add("ITM_SUB2");
			cols.add("ITM_SUB3");

			return cols.toArray(new String[cols.size()]);
		}

		/**
		* 引数のboolean値の内容によりＤＢのＦＬＧを返す.<br>
		* 
		* @param flg0 比較対象値
		* @param flg1 比較対象値
		* @return flg0=true/flg1=falseの場合'0'、flg0=false/flg1=trueの場合'1'。以外、null
		*/
		protected String booleanToString(boolean flg0, boolean flg1) {
			if (flg0 && !flg1) {
				return MCBooleanUtil.booleanToDBString(false);
			}
			else if (!flg0 && flg1) {
				return MCBooleanUtil.booleanToDBString(true);
			}
			else {
				return null;
			}
		}

		/**
		 * 集計項目を集約する。
		 */
		protected void collectDispCols(List<String> list) {
			addDispSumCols(list);
			addDispCols(list);
			addDefaultCols(list);
		}

		/**
		 * 合計用の数量項目を対象listに追加。
		 * 
		 * @param list リスト
		 */
		protected void addDispSumCols(List<String> list) {
			list.add(Srch01_RsltR.$i_pack_unit_qty);
			list.add(Srch01_RsltR.$o_pack_unit_qty);
			list.add(Srch01_RsltR.$i_base_unit_qty);
			list.add(Srch01_RsltR.$o_base_unit_qty);
		}

		/**
		 * 画面集計タブの集計項目を対象listに追加。
		 * 
		 * @param list リスト
		 */
		protected void addDispCols(List<String> list) {
			list.add(Srch01_RsltR.$slip_schd_no);

			if(!up0().schd_dt_flg()) {
				list.add(Srch01_RsltR.$schd_dt);
			}
			if(!up0().accpt_schd_dt_flg()) {
				list.add(Srch01_RsltR.$accpt_schd_dt);
			}
			if(!up0().avl_schd_dt_flg()) {
				list.add(Srch01_RsltR.$avl_schd_dt);
			}
			if(!up0().loc_flg()) {
				list.add(Srch01_RsltR.$loc_cd);
				list.add(Srch01_RsltR.$loc_nm);
			}
			if(!up0().str_ln_flg()) {
				list.add(Srch01_RsltR.$str_ln_cd);
				list.add(Srch01_RsltR.$str_ln_nm);
				list.add(Srch01_RsltR.$str_ln_cd_none_flg);
			}
			if(!up0().stk_arrv_flg()) {
				list.add(Srch01_RsltR.$stk_arrv_bp_cd);
				list.add(Srch01_RsltR.$stk_arrv_bp_nm);
			}
			if(!up0().site_flg()) {
				list.add(Srch01_RsltR.$site_cd);
				list.add(Srch01_RsltR.$site_nm);
			}
			if(!up0().wg_flg()) {
				list.add(Srch01_RsltR.$wg_cd);
				list.add(Srch01_RsltR.$wg_nm);
			}
			if(!up0().lg_grp_flg()) {
				list.add(Srch01_RsltR.$lg_grp_cd);
				list.add(Srch01_RsltR.$lg_grp_nm);
			}
			if(!up0().alloc_grp_flg()) {
				list.add(Srch01_RsltR.$alloc_grp_cd);
				list.add(Srch01_RsltR.$alloc_grp_nm);
			}
			if(!up0().loc_grp_flg()) {
				list.add(Srch01_RsltR.$loc_grp_cd);
				list.add(Srch01_RsltR.$loc_grp_nm);
			}
			if(!up0().sppl_flg()) {
				list.add(Srch01_RsltR.$sppl_cd);
				list.add(Srch01_RsltR.$sppl_nm);
			}
			if(!up0().lot_no_flg()) {
				list.add(Srch01_RsltR.$lot_no);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().sublot_no_flg()) {
				list.add(Srch01_RsltR.$sublot_no);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().sno1_flg()) {
				list.add(Srch01_RsltR.$sno1_null_flg);
				list.add(Srch01_RsltR.$sno1);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().sno2_flg()) {
				list.add(Srch01_RsltR.$sno2_null_flg);
				list.add(Srch01_RsltR.$sno2);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().sno3_flg()) {
				list.add(Srch01_RsltR.$sno3_null_flg);
				list.add(Srch01_RsltR.$sno3);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().sno4_flg()) {
				list.add(Srch01_RsltR.$sno4_null_flg);
				list.add(Srch01_RsltR.$sno4);
				list.add(Srch01_RsltR.$ver_no);
			}
			if(!up0().pack_flg()) {
				list.add(Srch01_RsltR.$i_pack_unit_qty);
				list.add(Srch01_RsltR.$o_pack_unit_qty);
				list.add(Srch01_RsltR.$pack_unit_cd);
				list.add(Srch01_RsltR.$pack_unit_nm);
			}
			if(!up0().alt_grp_flg()) {
				list.add(Srch01_RsltR.$alt_grp_cd);
				list.add(Srch01_RsltR.$alt_grp_nm);
				list.add(Srch01_RsltR.$alt_grp_seq);
				list.add(Srch01_RsltR.$oper_inst_no);
				list.add(Srch01_RsltR.$oper_ord_no);
				list.add(Srch01_RsltR.$alt_qty);
				list.add(Srch01_RsltR.$alt_itm_typ);
				list.add(Srch01_RsltR.$alt_itm_typ_nm);
				list.add(Srch01_RsltR.$alt_itm_ratio);
				list.add(Srch01_RsltR.$alt_alloc_prio);
			}
			if(!up0().gd_flg()) {
				list.add(Srch01_RsltR.$gd_cd);
				list.add(Srch01_RsltR.$gd_nm);
			}
		}

		/**
		 * デフォールトの集計項目を対象listに追加。
		 * 
		 * @param list リスト
		 */
		protected void addDefaultCols(List<String> list) {
			list.add(Srch01_RsltR.$alloc_tgt_flg);
			list.add(Srch01_RsltR.$alloc_scope_typ);
			list.add(Srch01_RsltR.$alloc_scope_typ_nm);
			list.add(Srch01_RsltR.$alloc_flg);
			list.add(Srch01_RsltR.$alloc_wait_flg);
			list.add(Srch01_RsltR.$vld_dt_fr);
			list.add(Srch01_RsltR.$vld_dt_to);
			list.add(Srch01_RsltR.$inpt_ctl_typ);
			list.add(Srch01_RsltR.$inpt_ctl_typ_nm);
			list.add(Srch01_RsltR.$io_schd_no);
			list.add(Srch01_RsltR.$io_schd_seq);
			list.add(Srch01_RsltR.$io_schd_sub_typ1);
			list.add(Srch01_RsltR.$io_schd_sub_typ_nm1);
			list.add(Srch01_RsltR.$io_schd_sub_no1);
			list.add(Srch01_RsltR.$io_schd_sub_seq1);
			list.add(Srch01_RsltR.$io_schd_sub_typ2);
			list.add(Srch01_RsltR.$io_schd_sub_typ_nm2);
			list.add(Srch01_RsltR.$io_schd_sub_no2);
			list.add(Srch01_RsltR.$io_schd_sub_seq2);
			list.add(Srch01_RsltR.$io_schd_sub_typ3);
			list.add(Srch01_RsltR.$io_schd_sub_typ_nm3);
			list.add(Srch01_RsltR.$io_schd_sub_no3);
			list.add(Srch01_RsltR.$io_schd_sub_seq3);
			list.add(Srch01_RsltR.$io_schd_sub_typ4);
			list.add(Srch01_RsltR.$io_schd_sub_typ_nm4);
			list.add(Srch01_RsltR.$io_schd_sub_no4);
			list.add(Srch01_RsltR.$io_schd_sub_seq4);
			list.add(Srch01_RsltR.$io_schd_pr_no);
			list.add(Srch01_RsltR.$sub_char1);
			list.add(Srch01_RsltR.$sub_char2);
			list.add(Srch01_RsltR.$sub_char3);
			list.add(Srch01_RsltR.$sub_char4);
			list.add(Srch01_RsltR.$sub_char5);
			list.add(Srch01_RsltR.$sub_num1);
			list.add(Srch01_RsltR.$sub_num2);
			list.add(Srch01_RsltR.$sub_num3);
			list.add(Srch01_RsltR.$sub_dt1);
			list.add(Srch01_RsltR.$sub_dt2);
			list.add(Srch01_RsltR.$sub_dt3);
			list.add(Srch01_RsltR.$ins_usr_id);
			list.add(Srch01_RsltR.$ins_usr_nm);
			list.add(Srch01_RsltR.$ins_ts);
			list.add(Srch01_RsltR.$ins_func_id);
			list.add(Srch01_RsltR.$ins_func_nm);
			list.add(Srch01_RsltR.$upd_usr_id);
			list.add(Srch01_RsltR.$upd_usr_nm);
			list.add(Srch01_RsltR.$upd_ts);
			list.add(Srch01_RsltR.$upd_func_id);
			list.add(Srch01_RsltR.$upd_func_nm);
			list.add(Srch01_RsltR.$upd_srv_req_no);
		}

		/**
		 * リストを集計する。
		 * 
		 * @param list リスト
		 * @param names グループ化するカラム名
		 * @return 集計したリスト
		 */
		protected MCList<Srch01_RsltR> aggregate(MCList<Srch01_RsltR> list, String... names) {
			MCGroupByPolicy p = new MCGroupByPolicy(names);

			if(up0().pack_flg()) {
				p.sum(Srch01_RsltR.$i_pack_unit_qty);
				p.sum(Srch01_RsltR.$o_pack_unit_qty);
			}

			p.sum(Srch01_RsltR.$i_base_unit_qty);
			p.sum(Srch01_RsltR.$o_base_unit_qty);

			return list.groupBy(p);
		}

	}

	//FMCB CUSTOM END
}