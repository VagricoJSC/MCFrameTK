package mcframe.serverMSBE.MSBEL0030;

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
import static mcframe.serverMSBE.MSBEL0030.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.util.List;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_MlyIoStkDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_MlyIoStkDtlSrch_MC extends MSBEL_MlyIoStkDtlSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指定された締月度、締日の月次受払在庫情報を照会する<br>
	 */
	public class Srch01 extends MSBEL_MlyIoStkDtlSrch_MC_A.Srch01 {
		/** チェック項目（基本品目項目＋画面設定） */
		private String[] _chkCols = null;
		/** グループ化項目（チェック項目＋締月度） */
		private String[] _grpCols = null;
		/** 非表示項目（画面設定の不要項目） */
		private String[] _removeCols = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
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
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件編集
			editCnd();

			// データを検索する。
			MCQueryPlan mlyStkSql = MSBEL0030_MST_MLY_STK_DTL_S01();
			String[] cols = getOrderByCols(up0());
			mlyStkSql.addDynamicSQLInfo(getOrderByClause(up0()));
			searchForDL(mlyStkSql, up0(), down0(), cols);
		}

		protected void editCnd() {
			// 締月度の設定チェック。（念のための処理）
			if (isNull(up0().mly_io_cl_ym_fr())) {
				up0().mly_io_cl_ym_fr(getToday().startOfMonth());
			}
			else {
				up0().mly_io_cl_ym_fr(up0().mly_io_cl_ym_fr().startOfMonth());
			}
			if (isNull(up0().mly_io_cl_ym_to())) {
				up0().mly_io_cl_ym_to(getToday().endOfMonth());
			}
			else {
				up0().mly_io_cl_ym_to(up0().mly_io_cl_ym_to().endOfMonth());
			}

			// 指定締月度ＦＲＯＭより前の計上年月（最新）を取得する。（最初の月初在庫を取得するため）
			MCDate clYm = getStkClYm();
			if (!isNull(clYm) && clYm.lt(up0().mly_io_cl_ym_fr())) {
				up0().last_ac_ym(clYm);
			}
			else {
				up0().last_ac_ym(up0().mly_io_cl_ym_fr().addMonth(-1));
			}

			// 実棚入力可能のみ
			up0().addStringColumn("only_enable_true", toTrueStr(up0().only_enable_flg()));

			// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
			if (!isNull(up0().itm_cd()) && !isNullAnd(up0().sno1(), up0().sno2(), up0().sno3(), up0().sno4())) {
				MAM_ITM_R itm = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
				itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
				itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")).and(t.itm_sub1.eq(bind("itm_sub1"))).and(t.itm_sub2.eq(bind("itm_sub2"))).and(t.itm_sub3.eq(bind("itm_sub3"))));
				dbSelect("MSBEL0030_MAM_ITM_S01", itm, itm_bldr, up0());
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

		@Override
		protected void editListMain() {
			super.editListMain();

			if (down0().isEmpty()) {
				return;
			}
			
			//会社マスタ関連情報をセット
			setBase(down0());

			//標準単価をセット
			setStdUnitCost(down0());

			down0().sort(getDptLostCols());

			// 下り電文の作成（グループ化、数値項目設定）受払区分により、数量項目の分類や出庫計と入庫計の算出
			Srch01_RsltR rsltR = null;
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			java.math.RoundingMode baseCurRndTypMode = toRoundingMode(getCo().stk_amt_rnd_typ());
			for (Srch01_RsltR sR : down0()) {
				//在庫金額計算
				sR.stk_amt(sR.std_unit_cost().multiply(sR.base_unit_qty(), sR.base_cur_dec_place().intValue(), baseCurRndTypMode));
				
				// グループ化キー項目は同じ値の場合、数値項目に値を加算する
				if (isColSame(rsltR, sR, getGroupByCols())) {
					sumToAddedLine(rsltR, sR);
				}
				else {
					// 検索結果のリストに追加
					addRow(rsltR, rsltL);
					// 年月と部門CD、もしくは年月のみ変わった場合、前月の月末在庫を月初在庫に設定する
					if (!isColSame(rsltR, sR, Srch01_RsltR.$mly_io_cl_ym) && isColSame(rsltR, sR, getCngChkCols())) {
						if (isSame(up0().disp_unit(), "AMT")) {
							if (!isSame(rsltR.std_unit_cost(), sR.std_unit_cost())) {
								sR.ini_stk_amt(sR.std_unit_cost().multiply(rsltR.end_stk_qty(), sR.base_cur_dec_place().intValue(), baseCurRndTypMode));
							}
							else {
								sR.ini_stk_amt(rsltR.end_stk_amt());
							}
						}
						sR.ini_stk_qty(rsltR.end_stk_qty());
					}
					// グループ化キー項目が変わった場合、月初在庫は0としておく
					else {
						if (isSame(up0().disp_unit(), "AMT")) {
							sR.ini_stk_amt(MCNumber.ZERO);
						}
						sR.ini_stk_qty(MCNumber.ZERO);
					}
					// 新規行を作成する
					rsltR = createNewLine(sR, getRemoveCols());
				}
			}

			// 検索結果のリストに追加
			addRow(rsltR, rsltL);

			rsltR = null;
			MCList<Srch01_RsltR> reRsltL = MCList.create(Srch01_RsltR.class);
			if(!up0().loc_flg() && up0().dpt_flg()) {
				rsltL.sort(getLocLostCols());
				for(Srch01_RsltR r : rsltL) {

					// グループ化キー項目は同じ値の場合、数値項目に値を加算する
					if (isColSame(rsltR, r, getLocLostCols())) {
						totalAdd(rsltR, r);
					}
					else {
						// 検索結果のリストに追加
						addRow(rsltR, reRsltL);

						// 新規行を作成する
						rsltR = r;
					}
				}
				// 検索結果のリストに追加
				addRow(rsltR, reRsltL);
				reRsltL.sort(getDptLocLostCols());
			}

			if(!reRsltL.isEmpty()) {
				rsltL.setAll(reRsltL);
			}

			MCList<Srch01_RsltR> removeL = MCList.create(Srch01_RsltR.class);
			for(Srch01_RsltR chkDptR : rsltL) {
				if(!isNull(up0().dpt_cd()) && !isLike(chkDptR.dpt_cd(), up0().dpt_cd())
						|| !isNull(up0().dpt_nm()) && !isLike(chkDptR.dpt_nm(), up0().dpt_nm())) {
					removeL.add(chkDptR);
				}
			}

			if(!removeL.isEmpty()) {
				rsltL.removeAll(removeL);
			}

			if(!up0().loc_flg()) {
				rsltL.clear(getLocCols());
			}

			// 下り電文の設定
			down0().setAll(rsltL);
		}

		/**
		 * ORDER BY句の文字列を返す 
		 */
		protected MCDynamicSQLInfo[] getOrderByClause(Srch01_CndR cndR) {
			List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");

			if(cndR.loc_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$loc_cd).asc()));
			}
			if(cndR.str_ln_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$str_ln_cd).asc()));
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

			if(cndR.loc_flg() == true) {
				cols.add("LOC_CD");
			}
			if(cndR.str_ln_flg() == true) {
				cols.add("STR_LN_CD");
			}

			cols.add("ITM_CD");
			cols.add("ITM_SUB1");
			cols.add("ITM_SUB2");
			cols.add("ITM_SUB3");

			return cols.toArray(new String[cols.size()]);
		}

		protected void setBase(MCList<Srch01_RsltR> list){
			list.setString(Srch01_RsltR.$base_cur_cd, getBaseCur().cur_cd());
			list.setString(Srch01_RsltR.$base_cur_nm, getBaseCur().cur_nm());
			list.setNumber(Srch01_RsltR.$base_cur_dec_place, getCo().stk_amt_dec_place());
			list.setString(Srch01_RsltR.$base_cur_rnd_typ, getCo().stk_amt_rnd_typ());
		}
		
		protected void setStdUnitCost(MCList<Srch01_RsltR> list){
			list.setStringNE("stk_std_upri_typ", getCo().stk_std_upri_typ());
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_STD_COST$F_GET_STD_UPRI", "01"), MABCFunction.getFunctionExecuter("MAPA_STD_COST$F_GET_STD_UPRI"), "STD_UNIT_COST", list, "ITM_CD", "ITM_SUB1", "ITM_SUB2", "ITM_SUB3", "MLY_IO_CL_YM", "WG_CD", "STK_STD_UPRI_TYP");
		}
		
		protected java.math.RoundingMode toRoundingMode(String rndTyp) {
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
			if (typ == null) {
				return null;
			}
			else {
				return typ.toMC();
			}
		}

		protected Srch01_RsltR createNewLine(Srch01_RsltR sR, String[] removeCols) {
			Srch01_RsltR newR = sR.clone();

			// 表示単位の設定
			if (isSame(up0().disp_unit(), "BASE_UNIT")) {
				newR.unit_cd(sR.base_unit_cd());
				newR.unit_nm(sR.base_unit_nm());
				newR.dec_place(sR.base_unit_dec_place());
				newR.rnd_typ(sR.base_unit_rnd_typ());
			}
			if (isSame(up0().disp_unit(), "PACK_UNIT")) {
				newR.unit_cd(sR.pack_unit_cd());
				newR.unit_nm(sR.pack_unit_nm());
				newR.dec_place(sR.pack_unit_dec_place());
				newR.rnd_typ(sR.pack_unit_rnd_typ());
			}

			// 数量項目の分類
			if (isSame(up0().disp_unit(), "AMT")) {
				setAmtCtgValue(newR, sR);
			}
			setQtyCtgValue(newR, sR);

			// 非表示項目のクリア
			newR.clear(removeCols);

			return newR;
		}

		protected void sumToAddedLine(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			// 合計項目の加算
			for ( String colName : getSumCols()) {
				dstR.setNumber(colName, MCNumber.sum(dstR.getNumber(colName), orgR.getNumber(colName)));
			}

			// 数量項目の分類
			if (isSame(up0().disp_unit(), "AMT")) {
				setAmtCtgValue(dstR, orgR);
			}
			setQtyCtgValue(dstR, orgR);
		}

		protected void totalAdd(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			if (isSame(up0().disp_unit(), "AMT")) {
				for ( String getAmt : getAmtCols()) {
					dstR.setNumber(getAmt, MCNumber.sum(dstR.getNumber(getAmt), orgR.getNumber(getAmt)));
				}
			}
			for ( String getQty : getQtyCols()) {
				dstR.setNumber(getQty, MCNumber.sum(dstR.getNumber(getQty), orgR.getNumber(getQty)));
			}
		}

		protected void setAmtCtgValue(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			if (dstR == null || orgR == null) {
				return;
			}

			MCNumber addAmtVal = orgR.stk_amt();
			if (isNull(addAmtVal) || addAmtVal.isZero()) {
				return;
			}

			// ---------------------------------- 入庫額 ----------------------------------
			// 入荷額
			if (MSC_IO_ACT_TYP.isARR(orgR.io_act_typ())) {
				dstR.arr_amt(MCNumber.sum(dstR.arr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 仕入入庫額
			if (MSC_IO_ACT_TYP.isPURC_GR(orgR.io_act_typ())) {
				dstR.purc_gr_amt(MCNumber.sum(dstR.purc_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GR(orgR.io_act_typ())) {
				dstR.onr_rcv_gr_amt(MCNumber.sum(dstR.onr_rcv_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 仕入返品入庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_rtn_gr_amt(MCNumber.sum(dstR.purc_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償受給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GR(orgR.io_act_typ())) {
				dstR.onr_rcv_ret_gr_amt(MCNumber.sum(dstR.onr_rcv_ret_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 経費購買入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GR(orgR.io_act_typ())) {
				dstR.xpns_purc_gr_amt(MCNumber.sum(dstR.xpns_purc_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 経費購買返品入庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GR(orgR.io_act_typ())) {
				dstR.xpns_purc_rtn_gr_amt(MCNumber.sum(dstR.xpns_purc_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検収不良入庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GR(orgR.io_act_typ())) {
				dstR.accpt_dfct_gr_amt(MCNumber.sum(dstR.accpt_dfct_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 製造額
			if (MSC_IO_ACT_TYP.isMFG(orgR.io_act_typ())) {
				dstR.mfg_amt(MCNumber.sum(dstR.mfg_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 副産品製造額
			if (MSC_IO_ACT_TYP.isBYMFG(orgR.io_act_typ())) {
				dstR.bymfg_amt(MCNumber.sum(dstR.bymfg_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 無償支給入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GR(orgR.io_act_typ())) {
				dstR.ffr_prov_gr_amt(MCNumber.sum(dstR.ffr_prov_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償支給入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GR(orgR.io_act_typ())) {
				dstR.onr_prov_gr_amt(MCNumber.sum(dstR.onr_prov_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 無償支給返品入庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.ffr_prov_rtn_gr_amt(MCNumber.sum(dstR.ffr_prov_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 有償支給返品入庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.onr_prov_rtn_gr_amt(MCNumber.sum(dstR.onr_prov_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検査入庫額
			if (MSC_IO_ACT_TYP.isINSP_GR(orgR.io_act_typ())) {
				dstR.insp_gr_amt(MCNumber.sum(dstR.insp_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検査完了入庫額
			if (MSC_IO_ACT_TYP.isINSP_CMPL_GR(orgR.io_act_typ())) {
				dstR.insp_cmpl_gr_amt(MCNumber.sum(dstR.insp_cmpl_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 検査判定入庫額
			if (MSC_IO_ACT_TYP.isINSP_JUDG_GR(orgR.io_act_typ())) {
				dstR.insp_judg_gr_amt(MCNumber.sum(dstR.insp_judg_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 再検査入庫額
			if (MSC_IO_ACT_TYP.isREINSP_GR(orgR.io_act_typ())) {
				dstR.reinsp_gr_amt(MCNumber.sum(dstR.reinsp_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 棚卸差異増耗額
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GR(orgR.io_act_typ())) {
				dstR.stk_adjst_gr_amt(MCNumber.sum(dstR.stk_adjst_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 倉入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GR(orgR.io_act_typ())) {
				dstR.prdct_wh_gr_amt(MCNumber.sum(dstR.prdct_wh_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 戻入入庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GR(orgR.io_act_typ())) {
				dstR.prdct_wh_rtn_gr_amt(MCNumber.sum(dstR.prdct_wh_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送入庫額
			if (MSC_IO_ACT_TYP.isXFR_GR(orgR.io_act_typ())) {
				dstR.xfr_gr_amt(MCNumber.sum(dstR.xfr_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 転入額
			if (MSC_IO_ACT_TYP.isXFR_IN(orgR.io_act_typ())) {
				dstR.xfr_in_amt(MCNumber.sum(dstR.xfr_in_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 仕入転入額
			if (MSC_IO_ACT_TYP.isPURC_XFR_IN(orgR.io_act_typ())) {
				dstR.purc_xfr_in_amt(MCNumber.sum(dstR.purc_xfr_in_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送返品入庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GR(orgR.io_act_typ())) {
				dstR.xfr_rtn_gr_amt(MCNumber.sum(dstR.xfr_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 他勘定振替入庫額
			if (MSC_IO_ACT_TYP.isACXFR_GR(orgR.io_act_typ())) {
				dstR.acxfr_gr_amt(MCNumber.sum(dstR.acxfr_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 預り入庫額
			if (MSC_IO_ACT_TYP.isARR_CSTSTK(orgR.io_act_typ())) {
				dstR.arr_cststk_amt(MCNumber.sum(dstR.arr_cststk_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 品目振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GR(orgR.io_act_typ())) {
				dstR.xfr_itm_gr_amt(MCNumber.sum(dstR.xfr_itm_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// ロット・手配ＮＯ振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GR(orgR.io_act_typ())) {
				dstR.xfr_lot_sno_gr_amt(MCNumber.sum(dstR.xfr_lot_sno_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 格付・良品区分振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_GRD_GR(orgR.io_act_typ())) {
				dstR.xfr_grd_gr_amt(MCNumber.sum(dstR.xfr_grd_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 荷姿振替入庫額
			if (MSC_IO_ACT_TYP.isXFR_PACK_GR(orgR.io_act_typ())) {
				dstR.xfr_pack_gr_amt(MCNumber.sum(dstR.xfr_pack_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 着荷額
			if (MSC_IO_ACT_TYP.isSHIP_IN(orgR.io_act_typ())) {
				dstR.ship_in_amt(MCNumber.sum(dstR.ship_in_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 輸出着荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_IN(orgR.io_act_typ())) {
				dstR.ex_ship_in_amt(MCNumber.sum(dstR.ex_ship_in_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 出荷返品入庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(orgR.io_act_typ())) {
				dstR.ship_rtn_gr_amt(MCNumber.sum(dstR.ship_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}
			// 売上返品入庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GR(orgR.io_act_typ())) {
				dstR.sls_rtn_gr_amt(MCNumber.sum(dstR.sls_rtn_gr_amt(), addAmtVal));
				dstR.gr_total_amt(MCNumber.sum(dstR.gr_total_amt(), addAmtVal));
				return;
			}

			// ---------------------------------- 出庫額 ----------------------------------
			// 入荷返品額
			if (MSC_IO_ACT_TYP.isARR_RTN(orgR.io_act_typ())) {
				dstR.arr_rtn_amt(MCNumber.sum(dstR.arr_rtn_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 仕入出庫額
			if (MSC_IO_ACT_TYP.isPURC_GI(orgR.io_act_typ())) {
				dstR.purc_gi_amt(MCNumber.sum(dstR.purc_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償受給出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_GI(orgR.io_act_typ())) {
				dstR.onr_rcv_gi_amt(MCNumber.sum(dstR.onr_rcv_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 仕入返品出庫額
			if (MSC_IO_ACT_TYP.isPURC_RTN_GI(orgR.io_act_typ())) {
				dstR.purc_rtn_gi_amt(MCNumber.sum(dstR.purc_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償受給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GI(orgR.io_act_typ())) {
				dstR.onr_rcv_ret_gi_amt(MCNumber.sum(dstR.onr_rcv_ret_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 経費購買出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GI(orgR.io_act_typ())) {
				dstR.xpns_purc_gi_amt(MCNumber.sum(dstR.xpns_purc_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 経費購買返品出庫額
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(orgR.io_act_typ())) {
				dstR.xpns_purc_rtn_gi_amt(MCNumber.sum(dstR.xpns_purc_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 検収不良出庫額
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GI(orgR.io_act_typ())) {
				dstR.accpt_dfct_gi_amt(MCNumber.sum(dstR.accpt_dfct_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 投入額
			if (MSC_IO_ACT_TYP.isINPT(orgR.io_act_typ())) {
				dstR.inpt_amt(MCNumber.sum(dstR.inpt_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// ロス額
			if (MSC_IO_ACT_TYP.isLOSS(orgR.io_act_typ())) {
				dstR.loss_amt(MCNumber.sum(dstR.loss_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 無償支給出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_GI(orgR.io_act_typ())) {
				dstR.ffr_prov_gi_amt(MCNumber.sum(dstR.ffr_prov_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償支給出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_GI(orgR.io_act_typ())) {
				dstR.onr_prov_gi_amt(MCNumber.sum(dstR.onr_prov_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 無償支給返品出庫額
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.ffr_prov_rtn_gi_amt(MCNumber.sum(dstR.ffr_prov_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 有償支給返品出庫額
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.onr_prov_rtn_gi_amt(MCNumber.sum(dstR.onr_prov_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 検査出庫額
			if (MSC_IO_ACT_TYP.isINSP_GI(orgR.io_act_typ())) {
				dstR.insp_gi_amt(MCNumber.sum(dstR.insp_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 検査完了出庫額
			if (MSC_IO_ACT_TYP.isINSP_CMPL_GI(orgR.io_act_typ())) {
				dstR.insp_cmpl_gi_amt(MCNumber.sum(dstR.insp_cmpl_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 検査判定出庫額
			if (MSC_IO_ACT_TYP.isINSP_JUDG_GI(orgR.io_act_typ())) {
				dstR.insp_judg_gi_amt(MCNumber.sum(dstR.insp_judg_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 再検査出庫額
			if (MSC_IO_ACT_TYP.isREINSP_GI(orgR.io_act_typ())) {
				dstR.reinsp_gi_amt(MCNumber.sum(dstR.reinsp_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 検査抜取額
			if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(orgR.io_act_typ())) {
				dstR.insp_smpl_gi_amt(MCNumber.sum(dstR.insp_smpl_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 棚卸差異減耗額
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(orgR.io_act_typ())) {
				dstR.stk_adjst_gi_amt(MCNumber.sum(dstR.stk_adjst_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 倉入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(orgR.io_act_typ())) {
				dstR.prdct_wh_gi_amt(MCNumber.sum(dstR.prdct_wh_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 戻入出庫額
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GI(orgR.io_act_typ())) {
				dstR.prdct_wh_rtn_gi_amt(MCNumber.sum(dstR.prdct_wh_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送出庫額
			if (MSC_IO_ACT_TYP.isXFR_GI(orgR.io_act_typ())) {
				dstR.xfr_gi_amt(MCNumber.sum(dstR.xfr_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 転出額
			if (MSC_IO_ACT_TYP.isXFR_OUT(orgR.io_act_typ())) {
				dstR.xfr_out_amt(MCNumber.sum(dstR.xfr_out_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 仕入転出額
			if (MSC_IO_ACT_TYP.isPURC_XFR_OUT(orgR.io_act_typ())) {
				dstR.purc_xfr_out_amt(MCNumber.sum(dstR.purc_xfr_out_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 移動・移送返品出庫額
			if (MSC_IO_ACT_TYP.isXFR_RTN_GI(orgR.io_act_typ())) {
				dstR.xfr_rtn_gi_amt(MCNumber.sum(dstR.xfr_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 他勘定振替出庫額
			if (MSC_IO_ACT_TYP.isACXFR_GI(orgR.io_act_typ())) {
				dstR.acxfr_gi_amt(MCNumber.sum(dstR.acxfr_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 廃棄額
			if (MSC_IO_ACT_TYP.isSCRP(orgR.io_act_typ())) {
				dstR.scrp_amt(MCNumber.sum(dstR.scrp_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 品目振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_ITM_GI(orgR.io_act_typ())) {
				dstR.xfr_itm_gi_amt(MCNumber.sum(dstR.xfr_itm_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// ロット・手配ＮＯ振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GI(orgR.io_act_typ())) {
				dstR.xfr_lot_sno_gi_amt(MCNumber.sum(dstR.xfr_lot_sno_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 格付・良品区分振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_GRD_GI(orgR.io_act_typ())) {
				dstR.xfr_grd_gi_amt(MCNumber.sum(dstR.xfr_grd_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 荷姿振替出庫額
			if (MSC_IO_ACT_TYP.isXFR_PACK_GI(orgR.io_act_typ())) {
				dstR.xfr_pack_gi_amt(MCNumber.sum(dstR.xfr_pack_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 出荷額
			if (MSC_IO_ACT_TYP.isSHIP_OUT(orgR.io_act_typ())) {
				dstR.ship_out_amt(MCNumber.sum(dstR.ship_out_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 輸出出荷額
			if (MSC_IO_ACT_TYP.isEX_SHIP_OUT(orgR.io_act_typ())) {
				dstR.ex_ship_out_amt(MCNumber.sum(dstR.ex_ship_out_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 出荷返品出庫額
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GI(orgR.io_act_typ())) {
				dstR.ship_rtn_gi_amt(MCNumber.sum(dstR.ship_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 売上返品出庫額
			if (MSC_IO_ACT_TYP.isSLS_RTN_GI(orgR.io_act_typ())) {
				dstR.sls_rtn_gi_amt(MCNumber.sum(dstR.sls_rtn_gi_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}
			// 売上額
			if (MSC_IO_ACT_TYP.isSLS(orgR.io_act_typ())) {
				dstR.sls_amt(MCNumber.sum(dstR.sls_amt(), addAmtVal));
				dstR.gi_total_amt(MCNumber.sum(dstR.gi_total_amt(), addAmtVal));
				return;
			}

			// ---------------------------------- 月初月末在庫 ----------------------------------
			// 月初在庫額
			if (MSC_IO_ACT_TYP.isINI_STK(orgR.io_act_typ())) {
				dstR.ini_stk_amt(MCNumber.sum(dstR.ini_stk_amt(), addAmtVal));
				return;
			}
			// 月末在庫額
			if (MSC_IO_ACT_TYP.isEND_STK(orgR.io_act_typ())) {
				dstR.end_stk_amt(MCNumber.sum(dstR.end_stk_amt(), addAmtVal));
				return;
			}
		}

		protected void setQtyCtgValue(Srch01_RsltR dstR, Srch01_RsltR orgR) {
			if (dstR == null || orgR == null) {
				return;
			}

			MCNumber addQtyVal = orgR.pack_unit_qty();
			if (isSame(up0().disp_unit(), "BASE_UNIT") || isSame(up0().disp_unit(), "AMT")) {
				addQtyVal = orgR.base_unit_qty();
			}
			if (isNull(addQtyVal) || addQtyVal.isZero()) {
				return;
			}

			// ---------------------------------- 入庫数 ----------------------------------
			// 入荷数
			if (MSC_IO_ACT_TYP.isARR(orgR.io_act_typ())) {
				dstR.arr_qty(MCNumber.sum(dstR.arr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 仕入入庫数
			if (MSC_IO_ACT_TYP.isPURC_GR(orgR.io_act_typ())) {
				dstR.purc_gr_qty(MCNumber.sum(dstR.purc_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給入庫数
			if (MSC_IO_ACT_TYP.isONR_RCV_GR(orgR.io_act_typ())) {
				dstR.onr_rcv_gr_qty(MCNumber.sum(dstR.onr_rcv_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 仕入返品入庫数
			if (MSC_IO_ACT_TYP.isPURC_RTN_GR(orgR.io_act_typ())) {
				dstR.purc_rtn_gr_qty(MCNumber.sum(dstR.purc_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償受給返品入庫数
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GR(orgR.io_act_typ())) {
				dstR.onr_rcv_ret_gr_qty(MCNumber.sum(dstR.onr_rcv_ret_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 経費購買入庫数
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GR(orgR.io_act_typ())) {
				dstR.xpns_purc_gr_qty(MCNumber.sum(dstR.xpns_purc_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 経費購買返品入庫数
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GR(orgR.io_act_typ())) {
				dstR.xpns_purc_rtn_gr_qty(MCNumber.sum(dstR.xpns_purc_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検収不良入庫数
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GR(orgR.io_act_typ())) {
				dstR.accpt_dfct_gr_qty(MCNumber.sum(dstR.accpt_dfct_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 製造数
			if (MSC_IO_ACT_TYP.isMFG(orgR.io_act_typ())) {
				dstR.mfg_qty(MCNumber.sum(dstR.mfg_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 副産品製造数
			if (MSC_IO_ACT_TYP.isBYMFG(orgR.io_act_typ())) {
				dstR.bymfg_qty(MCNumber.sum(dstR.bymfg_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 無償支給入庫数
			if (MSC_IO_ACT_TYP.isFFR_PROV_GR(orgR.io_act_typ())) {
				dstR.ffr_prov_gr_qty(MCNumber.sum(dstR.ffr_prov_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償支給入庫数
			if (MSC_IO_ACT_TYP.isONR_PROV_GR(orgR.io_act_typ())) {
				dstR.onr_prov_gr_qty(MCNumber.sum(dstR.onr_prov_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 無償支給返品入庫数
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.ffr_prov_rtn_gr_qty(MCNumber.sum(dstR.ffr_prov_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 有償支給返品入庫数
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GR(orgR.io_act_typ())) {
				dstR.onr_prov_rtn_gr_qty(MCNumber.sum(dstR.onr_prov_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検査入庫数
			if (MSC_IO_ACT_TYP.isINSP_GR(orgR.io_act_typ())) {
				dstR.insp_gr_qty(MCNumber.sum(dstR.insp_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検査完了入庫数
			if (MSC_IO_ACT_TYP.isINSP_CMPL_GR(orgR.io_act_typ())) {
				dstR.insp_cmpl_gr_qty(MCNumber.sum(dstR.insp_cmpl_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 検査判定入庫数
			if (MSC_IO_ACT_TYP.isINSP_JUDG_GR(orgR.io_act_typ())) {
				dstR.insp_judg_gr_qty(MCNumber.sum(dstR.insp_judg_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 再検査入庫数
			if (MSC_IO_ACT_TYP.isREINSP_GR(orgR.io_act_typ())) {
				dstR.reinsp_gr_qty(MCNumber.sum(dstR.reinsp_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 棚卸差異増耗数
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GR(orgR.io_act_typ())) {
				dstR.stk_adjst_gr_qty(MCNumber.sum(dstR.stk_adjst_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 倉入入庫数
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GR(orgR.io_act_typ())) {
				dstR.prdct_wh_gr_qty(MCNumber.sum(dstR.prdct_wh_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 戻入入庫数
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GR(orgR.io_act_typ())) {
				dstR.prdct_wh_rtn_gr_qty(MCNumber.sum(dstR.prdct_wh_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送入庫数
			if (MSC_IO_ACT_TYP.isXFR_GR(orgR.io_act_typ())) {
				dstR.xfr_gr_qty(MCNumber.sum(dstR.xfr_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 転入数
			if (MSC_IO_ACT_TYP.isXFR_IN(orgR.io_act_typ())) {
				dstR.xfr_in_qty(MCNumber.sum(dstR.xfr_in_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 仕入転入数
			if (MSC_IO_ACT_TYP.isPURC_XFR_IN(orgR.io_act_typ())) {
				dstR.purc_xfr_in_qty(MCNumber.sum(dstR.purc_xfr_in_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送返品入庫数
			if (MSC_IO_ACT_TYP.isXFR_RTN_GR(orgR.io_act_typ())) {
				dstR.xfr_rtn_gr_qty(MCNumber.sum(dstR.xfr_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 他勘定振替入庫数
			if (MSC_IO_ACT_TYP.isACXFR_GR(orgR.io_act_typ())) {
				dstR.acxfr_gr_qty(MCNumber.sum(dstR.acxfr_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 預り入庫数
			if (MSC_IO_ACT_TYP.isARR_CSTSTK(orgR.io_act_typ())) {
				dstR.arr_cststk_qty(MCNumber.sum(dstR.arr_cststk_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 品目振替入庫数
			if (MSC_IO_ACT_TYP.isXFR_ITM_GR(orgR.io_act_typ())) {
				dstR.xfr_itm_gr_qty(MCNumber.sum(dstR.xfr_itm_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// ロット・手配ＮＯ振替入庫数
			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GR(orgR.io_act_typ())) {
				dstR.xfr_lot_sno_gr_qty(MCNumber.sum(dstR.xfr_lot_sno_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 格付・良品区分振替入庫数
			if (MSC_IO_ACT_TYP.isXFR_GRD_GR(orgR.io_act_typ())) {
				dstR.xfr_grd_gr_qty(MCNumber.sum(dstR.xfr_grd_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 荷姿振替入庫数
			if (MSC_IO_ACT_TYP.isXFR_PACK_GR(orgR.io_act_typ())) {
				dstR.xfr_pack_gr_qty(MCNumber.sum(dstR.xfr_pack_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 着荷数
			if (MSC_IO_ACT_TYP.isSHIP_IN(orgR.io_act_typ())) {
				dstR.ship_in_qty(MCNumber.sum(dstR.ship_in_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 輸出着荷数
			if (MSC_IO_ACT_TYP.isEX_SHIP_IN(orgR.io_act_typ())) {
				dstR.ex_ship_in_qty(MCNumber.sum(dstR.ex_ship_in_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 出荷返品入庫数
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GR(orgR.io_act_typ())) {
				dstR.ship_rtn_gr_qty(MCNumber.sum(dstR.ship_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}
			// 売上返品入庫数
			if (MSC_IO_ACT_TYP.isSLS_RTN_GR(orgR.io_act_typ())) {
				dstR.sls_rtn_gr_qty(MCNumber.sum(dstR.sls_rtn_gr_qty(), addQtyVal));
				dstR.gr_total_qty(MCNumber.sum(dstR.gr_total_qty(), addQtyVal));
				return;
			}

			// ---------------------------------- 出庫数 ----------------------------------
			// 入荷返品数
			if (MSC_IO_ACT_TYP.isARR_RTN(orgR.io_act_typ())) {
				dstR.arr_rtn_qty(MCNumber.sum(dstR.arr_rtn_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 仕入出庫数
			if (MSC_IO_ACT_TYP.isPURC_GI(orgR.io_act_typ())) {
				dstR.purc_gi_qty(MCNumber.sum(dstR.purc_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償受給出庫数
			if (MSC_IO_ACT_TYP.isONR_RCV_GI(orgR.io_act_typ())) {
				dstR.onr_rcv_gi_qty(MCNumber.sum(dstR.onr_rcv_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 仕入返品出庫数
			if (MSC_IO_ACT_TYP.isPURC_RTN_GI(orgR.io_act_typ())) {
				dstR.purc_rtn_gi_qty(MCNumber.sum(dstR.purc_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償受給返品出庫数
			if (MSC_IO_ACT_TYP.isONR_RCV_RET_GI(orgR.io_act_typ())) {
				dstR.onr_rcv_ret_gi_qty(MCNumber.sum(dstR.onr_rcv_ret_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 経費購買出庫数
			if (MSC_IO_ACT_TYP.isXPNS_PURC_GI(orgR.io_act_typ())) {
				dstR.xpns_purc_gi_qty(MCNumber.sum(dstR.xpns_purc_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 経費購買返品出庫数
			if (MSC_IO_ACT_TYP.isXPNS_PURC_RTN_GI(orgR.io_act_typ())) {
				dstR.xpns_purc_rtn_gi_qty(MCNumber.sum(dstR.xpns_purc_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 検収不良出庫数
			if (MSC_IO_ACT_TYP.isACCPT_DFCT_GI(orgR.io_act_typ())) {
				dstR.accpt_dfct_gi_qty(MCNumber.sum(dstR.accpt_dfct_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 投入数
			if (MSC_IO_ACT_TYP.isINPT(orgR.io_act_typ())) {
				dstR.inpt_qty(MCNumber.sum(dstR.inpt_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// ロス数
			if (MSC_IO_ACT_TYP.isLOSS(orgR.io_act_typ())) {
				dstR.loss_qty(MCNumber.sum(dstR.loss_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 無償支給出庫数
			if (MSC_IO_ACT_TYP.isFFR_PROV_GI(orgR.io_act_typ())) {
				dstR.ffr_prov_gi_qty(MCNumber.sum(dstR.ffr_prov_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償支給出庫数
			if (MSC_IO_ACT_TYP.isONR_PROV_GI(orgR.io_act_typ())) {
				dstR.onr_prov_gi_qty(MCNumber.sum(dstR.onr_prov_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 無償支給返品出庫数
			if (MSC_IO_ACT_TYP.isFFR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.ffr_prov_rtn_gi_qty(MCNumber.sum(dstR.ffr_prov_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 有償支給返品出庫数
			if (MSC_IO_ACT_TYP.isONR_PROV_RTN_GI(orgR.io_act_typ())) {
				dstR.onr_prov_rtn_gi_qty(MCNumber.sum(dstR.onr_prov_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 検査出庫数
			if (MSC_IO_ACT_TYP.isINSP_GI(orgR.io_act_typ())) {
				dstR.insp_gi_qty(MCNumber.sum(dstR.insp_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 検査完了出庫数
			if (MSC_IO_ACT_TYP.isINSP_CMPL_GI(orgR.io_act_typ())) {
				dstR.insp_cmpl_gi_qty(MCNumber.sum(dstR.insp_cmpl_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 検査判定出庫数
			if (MSC_IO_ACT_TYP.isINSP_JUDG_GI(orgR.io_act_typ())) {
				dstR.insp_judg_gi_qty(MCNumber.sum(dstR.insp_judg_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 再検査出庫数
			if (MSC_IO_ACT_TYP.isREINSP_GI(orgR.io_act_typ())) {
				dstR.reinsp_gi_qty(MCNumber.sum(dstR.reinsp_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 検査抜取数
			if (MSC_IO_ACT_TYP.isINSP_SMPL_GI(orgR.io_act_typ())) {
				dstR.insp_smpl_gi_qty(MCNumber.sum(dstR.insp_smpl_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 棚卸差異減耗数
			if (MSC_IO_ACT_TYP.isSTK_ADJST_GI(orgR.io_act_typ())) {
				dstR.stk_adjst_gi_qty(MCNumber.sum(dstR.stk_adjst_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 倉入出庫数
			if (MSC_IO_ACT_TYP.isPRDCT_WH_GI(orgR.io_act_typ())) {
				dstR.prdct_wh_gi_qty(MCNumber.sum(dstR.prdct_wh_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 戻入出庫数
			if (MSC_IO_ACT_TYP.isPRDCT_WH_RTN_GI(orgR.io_act_typ())) {
				dstR.prdct_wh_rtn_gi_qty(MCNumber.sum(dstR.prdct_wh_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送出庫数
			if (MSC_IO_ACT_TYP.isXFR_GI(orgR.io_act_typ())) {
				dstR.xfr_gi_qty(MCNumber.sum(dstR.xfr_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 転出数
			if (MSC_IO_ACT_TYP.isXFR_OUT(orgR.io_act_typ())) {
				dstR.xfr_out_qty(MCNumber.sum(dstR.xfr_out_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 仕入転出数
			if (MSC_IO_ACT_TYP.isPURC_XFR_OUT(orgR.io_act_typ())) {
				dstR.purc_xfr_out_qty(MCNumber.sum(dstR.purc_xfr_out_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 移動・移送返品出庫数
			if (MSC_IO_ACT_TYP.isXFR_RTN_GI(orgR.io_act_typ())) {
				dstR.xfr_rtn_gi_qty(MCNumber.sum(dstR.xfr_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 他勘定振替出庫数
			if (MSC_IO_ACT_TYP.isACXFR_GI(orgR.io_act_typ())) {
				dstR.acxfr_gi_qty(MCNumber.sum(dstR.acxfr_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 廃棄数
			if (MSC_IO_ACT_TYP.isSCRP(orgR.io_act_typ())) {
				dstR.scrp_qty(MCNumber.sum(dstR.scrp_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 品目振替出庫数
			if (MSC_IO_ACT_TYP.isXFR_ITM_GI(orgR.io_act_typ())) {
				dstR.xfr_itm_gi_qty(MCNumber.sum(dstR.xfr_itm_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// ロット・手配ＮＯ振替出庫数
			if (MSC_IO_ACT_TYP.isXFR_LOT_SNO_GI(orgR.io_act_typ())) {
				dstR.xfr_lot_sno_gi_qty(MCNumber.sum(dstR.xfr_lot_sno_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 格付・良品区分振替出庫数
			if (MSC_IO_ACT_TYP.isXFR_GRD_GI(orgR.io_act_typ())) {
				dstR.xfr_grd_gi_qty(MCNumber.sum(dstR.xfr_grd_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 荷姿振替出庫数
			if (MSC_IO_ACT_TYP.isXFR_PACK_GI(orgR.io_act_typ())) {
				dstR.xfr_pack_gi_qty(MCNumber.sum(dstR.xfr_pack_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 出荷数
			if (MSC_IO_ACT_TYP.isSHIP_OUT(orgR.io_act_typ())) {
				dstR.ship_out_qty(MCNumber.sum(dstR.ship_out_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 輸出出荷数
			if (MSC_IO_ACT_TYP.isEX_SHIP_OUT(orgR.io_act_typ())) {
				dstR.ex_ship_out_qty(MCNumber.sum(dstR.ex_ship_out_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 出荷返品出庫数
			if (MSC_IO_ACT_TYP.isSHIP_RTN_GI(orgR.io_act_typ())) {
				dstR.ship_rtn_gi_qty(MCNumber.sum(dstR.ship_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 売上返品出庫数
			if (MSC_IO_ACT_TYP.isSLS_RTN_GI(orgR.io_act_typ())) {
				dstR.sls_rtn_gi_qty(MCNumber.sum(dstR.sls_rtn_gi_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}
			// 売上数
			if (MSC_IO_ACT_TYP.isSLS(orgR.io_act_typ())) {
				dstR.sls_qty(MCNumber.sum(dstR.sls_qty(), addQtyVal));
				dstR.gi_total_qty(MCNumber.sum(dstR.gi_total_qty(), addQtyVal));
				return;
			}

			// ---------------------------------- 月初月末在庫 ----------------------------------
			// 月初在庫数
			if (MSC_IO_ACT_TYP.isINI_STK(orgR.io_act_typ())) {
				dstR.ini_stk_qty(MCNumber.sum(dstR.ini_stk_qty(), addQtyVal));
				return;
			}
			// 月末在庫数
			if (MSC_IO_ACT_TYP.isEND_STK(orgR.io_act_typ())) {
				dstR.end_stk_qty(MCNumber.sum(dstR.end_stk_qty(), addQtyVal));
				return;
			}
		}

		protected void addRow(Srch01_RsltR rsltR, MCList<Srch01_RsltR> rsltL) {
			if (isNull(rsltR)) {
				return;
			}
			boolean isZeroAmt = false;
			
			// 値が設定されなかった行は追加しない
			if (isSame(up0().disp_unit(), "AMT") && chkZero(rsltR, true)) {
				rsltR.end_stk_amt(MCNumber.ZERO);
				isZeroAmt = true;
			}
			if (chkZero(rsltR, false)) {
				rsltR.end_stk_qty(MCNumber.ZERO);
				return;
			}
			// 合計項目は常に値を表示する
			if (isSame(up0().disp_unit(), "AMT") && !isZeroAmt) {
				if (isNull(rsltR.gr_total_amt())) {
					rsltR.gr_total_amt(MCNumber.ZERO);
				}
				if (isNull(rsltR.gi_total_amt())) {
					rsltR.gi_total_amt(MCNumber.ZERO);
				}
				// 月末在庫は再計算する。
				rsltR.end_stk_amt(rsltR.ini_stk_amt().add(rsltR.gr_total_amt()).subtract(rsltR.gi_total_amt()));
			}
			if (isNull(rsltR.gr_total_qty())) {
				rsltR.gr_total_qty(MCNumber.ZERO);
			}
			if (isNull(rsltR.gi_total_qty())) {
				rsltR.gi_total_qty(MCNumber.ZERO);
			}
			// 月末在庫は再計算する。
			rsltR.end_stk_qty(rsltR.ini_stk_qty().add(rsltR.gr_total_qty()).subtract(rsltR.gi_total_qty()));
			
			if (!isZeroAmt) {
				rsltL.add(rsltR);
			}
		}

		protected boolean chkZero(Srch01_RsltR rsltR, boolean chkAmt) {
			if (chkAmt) {
				return
						isSame(nvl(rsltR.ini_stk_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_total_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_ret_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.mfg_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.bymfg_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_cmpl_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_judg_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.reinsp_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stk_adjst_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_in_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_xfr_in_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.acxfr_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_cststk_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_itm_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_lot_sno_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_grd_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_pack_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_in_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ex_ship_in_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_rtn_gr_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_total_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_rtn_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_ret_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.inpt_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.loss_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_cmpl_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_judg_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.reinsp_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_smpl_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stk_adjst_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_out_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_xfr_out_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.acxfr_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.scrp_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_itm_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_lot_sno_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_grd_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_pack_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_out_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ex_ship_out_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_rtn_gi_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_amt(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.end_stk_amt(), MCNumber.ZERO), MCNumber.ZERO)
						;
			}
			else {
				return
						isSame(nvl(rsltR.ini_stk_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gr_total_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_ret_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.mfg_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.bymfg_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_cmpl_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_judg_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.reinsp_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stk_adjst_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_in_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_xfr_in_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.acxfr_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_cststk_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_itm_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_lot_sno_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_grd_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_pack_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_in_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ex_ship_in_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_rtn_gr_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.gi_total_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.arr_rtn_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_rcv_ret_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xpns_purc_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.accpt_dfct_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.inpt_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.loss_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ffr_prov_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.onr_prov_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_cmpl_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_judg_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.reinsp_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.insp_smpl_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.stk_adjst_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.prdct_wh_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_out_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.purc_xfr_out_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.acxfr_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.scrp_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_itm_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_lot_sno_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_grd_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.xfr_pack_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_out_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ex_ship_out_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.ship_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_rtn_gi_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.sls_qty(), MCNumber.ZERO), MCNumber.ZERO)
						&& isSame(nvl(rsltR.end_stk_qty(), MCNumber.ZERO), MCNumber.ZERO)
						;
			}
		}

		/**
		 * グループ化項目の配列を取得する。
		 * @return 項目配列
		 */
		protected String[] getGroupByCols() {
			// 全グループ化対象項目から、画面上で外した項目を除外する
			if (_grpCols == null ) {
				_grpCols = MCCollectionUtil.remove(getGroupCols(), new String[0], getRemoveCols());
			}

			return _grpCols;
		}

		protected String[] getDptLostCols() {
			String[] dptLostCols = MCCollectionUtil.remove(getGroupCols(), new String[0], getRemoveCols());
			dptLostCols = MCCollectionUtil.remove(dptLostCols, new String[0], getDptCols());

			return dptLostCols;
		}

		protected String[] getLocLostCols() {
			String[] locLostCols = MCCollectionUtil.remove(getGroupCols(), new String[0], getRemoveCols());
			locLostCols = MCCollectionUtil.remove(locLostCols, new String[0], getLocCols());

			return locLostCols;
		}

		protected String[] getDptLocLostCols() {
			String[] dptLocLostCols = MCCollectionUtil.remove(getGroupCols(), new String[0], getRemoveCols());
			dptLocLostCols = MCCollectionUtil.remove(dptLocLostCols, new String[0], getDptCols());
			dptLocLostCols = MCCollectionUtil.remove(dptLocLostCols, new String[0], getLocCols());

			return dptLocLostCols;
		}

		/**
		 * チェック項目の配列を取得する。
		 * @return 項目配列
		 */
		protected String[] getCngChkCols() {
			// 全グループ化対象項目から、画面上で外した項目を除外する
			if (_chkCols == null ) {
				_chkCols = MCCollectionUtil.remove(getChkCols(), new String[0], getRemoveCols());
			}

			return _chkCols;
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
			setRemoveArrayDpt(removeArray);
			setRemoveArrayLot(removeArray);
			setRemoveArraySublot(removeArray);
			setRemoveArrayLoc(removeArray);
			setRemoveArrayStrLn(removeArray);
			setRemoveArraySite(removeArray);
			setRemoveArrayLgGrp(removeArray);
			setRemoveArrayAllocGrp(removeArray);
			setRemoveArrayLocGrp(removeArray);
			setRemoveArrayGd(removeArray);
			setRemoveArraySno1(removeArray);
			setRemoveArraySno2(removeArray);
			setRemoveArraySno3(removeArray);
			setRemoveArraySno4(removeArray);
			setRemoveArrayFixNoTyp(removeArray);
			setRemoveArrayFixNo(removeArray);
			setRemoveArrayStkArrvBp(removeArray);
			setRemoveArrayPackUnit(removeArray);

			return removeArray;
		}

		protected void setRemoveArrayWg(List<String> removeArray) {
			if (!up0().wg_flg()) {
				removeArray.add(Srch01_RsltR.$wg_cd);
				removeArray.add(Srch01_RsltR.$wg_nm);
			}
		}

		protected void setRemoveArrayDpt(List<String> removeArray) {
			if (!up0().dpt_flg()) {
				removeArray.add(Srch01_RsltR.$dpt_cd);
				removeArray.add(Srch01_RsltR.$dpt_nm);
			}
		}

		protected void setRemoveArrayLot(List<String> removeArray) {
			if (!up0().lot_no_flg()) {
				removeArray.add(Srch01_RsltR.$lot_no);
				removeArray.add(Srch01_RsltR.$ver_no);
			}
		}

		protected void setRemoveArraySublot(List<String> removeArray) {
			if (!up0().sublot_no_flg()) {
				removeArray.add(Srch01_RsltR.$sublot_no);
				if (up0().lot_no_flg()) {
					removeArray.add(Srch01_RsltR.$ver_no);
				}
			}
		}

		protected void setRemoveArrayLoc(List<String> removeArray) {
			if (!up0().loc_flg() && !up0().dpt_flg()) {
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

		protected void setRemoveArrayStkArrvBp(List<String> removeArray) {
			if (!up0().stk_arrv_bp_flg()) {
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_nm);
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

		protected String[] getGroupCols() {
			return new String[] {
				Srch01_RsltR.$loc_cd,
				Srch01_RsltR.$str_ln_cd,
				Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1,
				Srch01_RsltR.$itm_sub2,
				Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$itm_nm,
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$dpt_cd,
				Srch01_RsltR.$lot_no,
				Srch01_RsltR.$sublot_no,
				Srch01_RsltR.$site_cd,
				Srch01_RsltR.$lg_grp_cd,
				Srch01_RsltR.$alloc_grp_cd,
				Srch01_RsltR.$loc_grp_cd,
				Srch01_RsltR.$gd_cd,
				Srch01_RsltR.$sno1,
				Srch01_RsltR.$sno2,
				Srch01_RsltR.$sno3,
				Srch01_RsltR.$sno4,
				Srch01_RsltR.$asst_typ,
				Srch01_RsltR.$in_xfr_typ,
				Srch01_RsltR.$quality_typ,
				Srch01_RsltR.$stk_insp_typ,
				Srch01_RsltR.$stk_id_typ,
				Srch01_RsltR.$stk_bp_cd,
				Srch01_RsltR.$stk_arrv_bp_cd,
				Srch01_RsltR.$fix_no_typ,
				Srch01_RsltR.$fix_no,
				Srch01_RsltR.$pack_unit_cd,
				Srch01_RsltR.$mly_io_cl_ym
			};
		}

		protected String[] getChkCols() {
			return new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$itm_nm,
					Srch01_RsltR.$lot_no,
					Srch01_RsltR.$sublot_no,
					Srch01_RsltR.$loc_cd,
					Srch01_RsltR.$str_ln_cd,
					Srch01_RsltR.$site_cd,
					Srch01_RsltR.$lg_grp_cd,
					Srch01_RsltR.$alloc_grp_cd,
					Srch01_RsltR.$loc_grp_cd,
					Srch01_RsltR.$gd_cd,
					Srch01_RsltR.$sno1,
					Srch01_RsltR.$sno2,
					Srch01_RsltR.$sno3,
					Srch01_RsltR.$sno4,
					Srch01_RsltR.$asst_typ,
					Srch01_RsltR.$in_xfr_typ,
					Srch01_RsltR.$quality_typ,
					Srch01_RsltR.$stk_insp_typ,
					Srch01_RsltR.$stk_id_typ,
					Srch01_RsltR.$stk_bp_cd,
					Srch01_RsltR.$stk_arrv_bp_cd,
					Srch01_RsltR.$fix_no_typ,
					Srch01_RsltR.$fix_no,
					Srch01_RsltR.$pack_unit_cd
			};
		}

		protected String[] getSumCols() {
			return new String[] {
					Srch01_RsltR.$pack_unit_qty, 
					Srch01_RsltR.$base_unit_qty, 
					Srch01_RsltR.$stk_amt
			};
		}

		protected String[] getDptCols() {
			return new String[] {
					Srch01_RsltR.$dpt_cd,
					Srch01_RsltR.$dpt_nm
			};
		}

		protected String[] getLocCols() {
			return new String[] {
					Srch01_RsltR.$loc_cd,
					Srch01_RsltR.$loc_nm
			};
		}

		protected String[] getAmtCols() {
			return new String[] {
					Srch01_RsltR.$ini_stk_amt,
					Srch01_RsltR.$gr_total_amt,
					Srch01_RsltR.$arr_amt,
					Srch01_RsltR.$purc_gr_amt,
					Srch01_RsltR.$onr_rcv_gr_amt,
					Srch01_RsltR.$purc_rtn_gr_amt,
					Srch01_RsltR.$onr_rcv_ret_gr_amt,
					Srch01_RsltR.$xpns_purc_gr_amt,
					Srch01_RsltR.$xpns_purc_rtn_gr_amt,
					Srch01_RsltR.$accpt_dfct_gr_amt,
					Srch01_RsltR.$mfg_amt,
					Srch01_RsltR.$bymfg_amt,
					Srch01_RsltR.$ffr_prov_gr_amt,
					Srch01_RsltR.$onr_prov_gr_amt,
					Srch01_RsltR.$ffr_prov_rtn_gr_amt,
					Srch01_RsltR.$onr_prov_rtn_gr_amt,
					Srch01_RsltR.$insp_gr_amt,
					Srch01_RsltR.$insp_cmpl_gr_amt,
					Srch01_RsltR.$insp_judg_gr_amt,
					Srch01_RsltR.$reinsp_gr_amt,
					Srch01_RsltR.$stk_adjst_gr_amt,
					Srch01_RsltR.$prdct_wh_gr_amt,
					Srch01_RsltR.$prdct_wh_rtn_gr_amt,
					Srch01_RsltR.$xfr_gr_amt,
					Srch01_RsltR.$xfr_in_amt,
					Srch01_RsltR.$purc_xfr_in_amt,
					Srch01_RsltR.$xfr_rtn_gr_amt,
					Srch01_RsltR.$acxfr_gr_amt,
					Srch01_RsltR.$arr_cststk_amt,
					Srch01_RsltR.$xfr_itm_gr_amt,
					Srch01_RsltR.$xfr_lot_sno_gr_amt,
					Srch01_RsltR.$xfr_grd_gr_amt,
					Srch01_RsltR.$xfr_pack_gr_amt,
					Srch01_RsltR.$ship_in_amt,
					Srch01_RsltR.$ex_ship_in_amt,
					Srch01_RsltR.$ship_rtn_gr_amt,
					Srch01_RsltR.$sls_rtn_gr_amt,
					Srch01_RsltR.$gi_total_amt,
					Srch01_RsltR.$arr_rtn_amt,
					Srch01_RsltR.$purc_gi_amt,
					Srch01_RsltR.$onr_rcv_gi_amt,
					Srch01_RsltR.$purc_rtn_gi_amt,
					Srch01_RsltR.$onr_rcv_ret_gi_amt,
					Srch01_RsltR.$xpns_purc_gi_amt,
					Srch01_RsltR.$xpns_purc_rtn_gi_amt,
					Srch01_RsltR.$accpt_dfct_gi_amt,
					Srch01_RsltR.$inpt_amt,
					Srch01_RsltR.$loss_amt,
					Srch01_RsltR.$ffr_prov_gi_amt,
					Srch01_RsltR.$onr_prov_gi_amt,
					Srch01_RsltR.$ffr_prov_rtn_gi_amt,
					Srch01_RsltR.$onr_prov_rtn_gi_amt,
					Srch01_RsltR.$insp_gi_amt,
					Srch01_RsltR.$insp_cmpl_gi_amt,
					Srch01_RsltR.$insp_judg_gi_amt,
					Srch01_RsltR.$reinsp_gi_amt,
					Srch01_RsltR.$insp_smpl_gi_amt,
					Srch01_RsltR.$stk_adjst_gi_amt,
					Srch01_RsltR.$prdct_wh_gi_amt,
					Srch01_RsltR.$prdct_wh_rtn_gi_amt,
					Srch01_RsltR.$xfr_gi_amt,
					Srch01_RsltR.$xfr_out_amt,
					Srch01_RsltR.$purc_xfr_out_amt,
					Srch01_RsltR.$xfr_rtn_gi_amt,
					Srch01_RsltR.$acxfr_gi_amt,
					Srch01_RsltR.$scrp_amt,
					Srch01_RsltR.$xfr_itm_gi_amt,
					Srch01_RsltR.$xfr_lot_sno_gi_amt,
					Srch01_RsltR.$xfr_grd_gi_amt,
					Srch01_RsltR.$xfr_pack_gi_amt,
					Srch01_RsltR.$ship_out_amt,
					Srch01_RsltR.$ex_ship_out_amt,
					Srch01_RsltR.$ship_rtn_gi_amt,
					Srch01_RsltR.$sls_rtn_gi_amt,
					Srch01_RsltR.$sls_amt,
					Srch01_RsltR.$end_stk_amt
			};
		}

		protected String[] getQtyCols() {
			return new String[] {
					Srch01_RsltR.$ini_stk_qty,
					Srch01_RsltR.$gr_total_qty,
					Srch01_RsltR.$arr_qty,
					Srch01_RsltR.$purc_gr_qty,
					Srch01_RsltR.$onr_rcv_gr_qty,
					Srch01_RsltR.$purc_rtn_gr_qty,
					Srch01_RsltR.$onr_rcv_ret_gr_qty,
					Srch01_RsltR.$xpns_purc_gr_qty,
					Srch01_RsltR.$xpns_purc_rtn_gr_qty,
					Srch01_RsltR.$accpt_dfct_gr_qty,
					Srch01_RsltR.$mfg_qty,
					Srch01_RsltR.$bymfg_qty,
					Srch01_RsltR.$ffr_prov_gr_qty,
					Srch01_RsltR.$onr_prov_gr_qty,
					Srch01_RsltR.$ffr_prov_rtn_gr_qty,
					Srch01_RsltR.$onr_prov_rtn_gr_qty,
					Srch01_RsltR.$insp_gr_qty,
					Srch01_RsltR.$insp_cmpl_gr_qty,
					Srch01_RsltR.$insp_judg_gr_qty,
					Srch01_RsltR.$reinsp_gr_qty,
					Srch01_RsltR.$stk_adjst_gr_qty,
					Srch01_RsltR.$prdct_wh_gr_qty,
					Srch01_RsltR.$prdct_wh_rtn_gr_qty,
					Srch01_RsltR.$xfr_gr_qty,
					Srch01_RsltR.$xfr_in_qty,
					Srch01_RsltR.$purc_xfr_in_qty,
					Srch01_RsltR.$xfr_rtn_gr_qty,
					Srch01_RsltR.$acxfr_gr_qty,
					Srch01_RsltR.$arr_cststk_qty,
					Srch01_RsltR.$xfr_itm_gr_qty,
					Srch01_RsltR.$xfr_lot_sno_gr_qty,
					Srch01_RsltR.$xfr_grd_gr_qty,
					Srch01_RsltR.$xfr_pack_gr_qty,
					Srch01_RsltR.$ship_in_qty,
					Srch01_RsltR.$ex_ship_in_qty,
					Srch01_RsltR.$ship_rtn_gr_qty,
					Srch01_RsltR.$sls_rtn_gr_qty,
					Srch01_RsltR.$gi_total_qty,
					Srch01_RsltR.$arr_rtn_qty,
					Srch01_RsltR.$purc_gi_qty,
					Srch01_RsltR.$onr_rcv_gi_qty,
					Srch01_RsltR.$purc_rtn_gi_qty,
					Srch01_RsltR.$onr_rcv_ret_gi_qty,
					Srch01_RsltR.$xpns_purc_gi_qty,
					Srch01_RsltR.$xpns_purc_rtn_gi_qty,
					Srch01_RsltR.$accpt_dfct_gi_qty,
					Srch01_RsltR.$inpt_qty,
					Srch01_RsltR.$loss_qty,
					Srch01_RsltR.$ffr_prov_gi_qty,
					Srch01_RsltR.$onr_prov_gi_qty,
					Srch01_RsltR.$ffr_prov_rtn_gi_qty,
					Srch01_RsltR.$onr_prov_rtn_gi_qty,
					Srch01_RsltR.$insp_gi_qty,
					Srch01_RsltR.$insp_cmpl_gi_qty,
					Srch01_RsltR.$insp_judg_gi_qty,
					Srch01_RsltR.$reinsp_gi_qty,
					Srch01_RsltR.$insp_smpl_gi_qty,
					Srch01_RsltR.$stk_adjst_gi_qty,
					Srch01_RsltR.$prdct_wh_gi_qty,
					Srch01_RsltR.$prdct_wh_rtn_gi_qty,
					Srch01_RsltR.$xfr_gi_qty,
					Srch01_RsltR.$xfr_out_qty,
					Srch01_RsltR.$purc_xfr_out_qty,
					Srch01_RsltR.$xfr_rtn_gi_qty,
					Srch01_RsltR.$acxfr_gi_qty,
					Srch01_RsltR.$scrp_qty,
					Srch01_RsltR.$xfr_itm_gi_qty,
					Srch01_RsltR.$xfr_itm_gi_qty,
					Srch01_RsltR.$xfr_grd_gi_qty,
					Srch01_RsltR.$xfr_pack_gi_qty,
					Srch01_RsltR.$ship_out_qty,
					Srch01_RsltR.$ex_ship_out_qty,
					Srch01_RsltR.$ship_rtn_gi_qty,
					Srch01_RsltR.$sls_rtn_gi_qty,
					Srch01_RsltR.$sls_qty,
					Srch01_RsltR.$end_stk_qty
			};
		}
	}

	//FMCB CUSTOM END
}