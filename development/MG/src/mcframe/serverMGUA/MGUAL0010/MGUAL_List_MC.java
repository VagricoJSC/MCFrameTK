package mcframe.serverMGUA.MGUAL0010;

import static mcframe.commonCore.lang.MCStringUtil.arrayValueJoin;
import static mcframe.commonMG.notice.MG_Msg.*;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.createSqlId;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.dbInsert;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.execDbDelete;

import java.util.ArrayList;
import java.util.List;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMG.dbc.*;
import static mcframe.serverCore.util.MCDBUtil.*;


abstract public class MGUAL_List_MC extends MGUAL_List_MC_A {
	// -- CalcMenu:計算メニュー(START)
	@Override
	protected void getCalcMenu_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_MENU_R t, MCList<?> result) {
		super.getCalcMenu_Set(row, builder, t, result);
		builder.addSelect(MAM_COST_MENU_R.$menu_nm, t.getColumn$(MAM_COST_MENU_R.$menu_nm));
		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind(CalcMenuCols.$i_calc_grp_cd)));
	}

	// -- CalcMenu:計算メニュー(END)

	// -- ItmOperPtn:原価品目工程パタン(START)
	@Override
	protected void getItmOperPtn_Set(MCRow row, MCQueryApiBuilder builder, MGT_ITM_OPER_R t, MCList<?> result) {
		super.getItmOperPtn_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.term.eq(bind("1")),
				row.getDate(ItmOperPtnCols.$i_term));
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
				row.getStringNE(ItmOperPtnCols.$i_itm_cd));
		builder.addWhereWithCutOffAnd(t.itm_sub1.eq(bind("1")),
				row.getStringNE(ItmOperPtnCols.$i_itm_sub1));
		builder.addWhereWithCutOffAnd(t.itm_sub2.eq(bind("1")),
				row.getStringNE(ItmOperPtnCols.$i_itm_sub2));
		builder.addWhereWithCutOffAnd(t.itm_sub3.eq(bind("1")),
				row.getStringNE(ItmOperPtnCols.$i_itm_sub3));
		builder.addWhereWithCutOffAnd(t.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(ItmOperPtnCols.$i_calc_ctg_cd));
		if (!isNullOrNullVal(row.getStringNE(ItmOperPtnCols.$i_wg_cd))) {
			builder.addWhereWithAnd(
					t.wg_cd.eq(bind("1"))
							.or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))),
					row.getStringNE(ItmOperPtnCols.$i_wg_cd));
		}
	}
	// -- ItmOperPtn:原価品目工程パタン(END)

	// -- BomPtn:原価構成パタン(START)
	@Override
	protected void getBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MGT_BOM_R t, MCList<?> result) {
		super.getBomPtn_Set(row, builder, t, result);
		builder.setDistinct();
		if (row.getBooleanNE(BomPtnCols.$i_par_itm_flg)) {
			builder.addWhereWithAnd(t.par_itm_cd.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_cd));
			builder.addWhereWithCutOffAnd(t.par_itm_sub1.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub1));
			builder.addWhereWithCutOffAnd(t.par_itm_sub2.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub2));
			builder.addWhereWithCutOffAnd(t.par_itm_sub3.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub3));
		}
		if (row.getBooleanNE(BomPtnCols.$i_chd_itm_flg)) {
			builder.addWhereWithAnd(t.chd_itm_cd.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_cd));
			builder.addWhereWithCutOffAnd(t.chd_itm_sub1.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub1));
			builder.addWhereWithCutOffAnd(t.chd_itm_sub2.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub2));
			builder.addWhereWithCutOffAnd(t.chd_itm_sub3.eq(bind("1")),
					row.getStringNE(BomPtnCols.$i_itm_sub3));
		}
		if (!isNullOrNullVal(row.getStringNE(BomPtnCols.$i_wg_cd))) {
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1"))
					.or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))),
					row.getStringNE(BomPtnCols.$i_wg_cd));
		}
		builder.addWhereWithCutOffAnd(t.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(BomPtnCols.$i_calc_ctg_cd));
		builder.addWhereWithAnd(t.term.eq(bind("1")), row.getDate(BomPtnCols.$i_term));
	}
	// -- BomPtn:原価構成パタン(END)

	// -- CalcNo:原価計算ＮＯ（入力補助）(START)
	@Override
	protected void getCalcNo_Set(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		super.getCalcNo_Set(row, builder, t, result);
		getCalcNo_addSelectJoinCustom(row, builder, t, result);
		setCalcNo_Cnd(row, result);
		getCalcNo_addWhereCustom(row, builder, t, result);
	}

	protected void getCalcNo_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		MAM_CALC_GRP_R calc_grp = MAM_CALC_GRP_R.create("CALC_GRP");
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(CalcNoCols.$o_calc_grp_nm);
		result.addStringColumn(CalcNoCols.$o_term_nm);
		result.addDateColumn(CalcNoCols.$o_year_src);
		result.addNumberColumn(CalcNoCols.$o_month_src);

		// Select句、結合の設定
		builder.addSelect(calc_grp.calc_grp_nm.as("calc_grp_nm"));
		builder.addSelect(term.term_nm.as("term_nm"));
		builder.addSelect(t.end_ym.as("year_src"));
		builder.addSelect(extract(MCDateTimeFld.MONTH, t.end_ym).as("month_src"));
		builder.addLeftOuterJoin(calc_grp,
				calc_grp.calc_grp_cd.eq(t.calc_grp_cd));
		builder.addLeftOuterJoin(term, term.term.eq(t.term));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面からのリスト取得時
		// なし
	}

	protected void setCalcNo_Cnd(MCRow row, MCList<?> result) {
		if (isNull(row.getNumberNE(CalcNoCols.$i_m_fr))
				&& isNull(row.getNumberNE(CalcNoCols.$i_m_to))) {
			return;
		}
		
		List<String> mList = new ArrayList<String>();
		MCNumber st = isNull(row.getNumberNE(CalcNoCols.$i_m_fr))
				? MCNumber.ONE 
				: row.getNumberNE(CalcNoCols.$i_m_fr);
		MCNumber ed = isNull(row.getNumberNE(CalcNoCols.$i_m_to))
				? MCNumber.valueOf(12)
				: row.getNumberNE(CalcNoCols.$i_m_to);
		if (st.gt(ed)) {
			ed = ed.add(12);
		}
		for (int i = st.intValue(); i <= ed.intValue(); i++) {
			mList.add(String.format("%1$02d", i > 12 ? i - 12 : i));
		}
		row.addStringColumn("months", arrayValueJoin(mList.toArray(new String[0])));
	}

	protected void getCalcNo_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		MAM_CALC_GRP_R calc_grp = MAM_CALC_GRP_R.create("CALC_GRP");
		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")), row.getStringNE(CalcNoCols.$i_calc_grp_cd));
		
		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.term.eq(bind("1")),
				row.getDateNE(CalcNoCols.$i_term));
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		getCalcNo_addWhereByFixFlg(row, builder, t, result);
		builder.addWhereWithCutOffAnd(t.rmrks.like(bind("1")), getEditString(row, CalcNoCols.$i_rmrks));
		builder.addWhereWithCutOffAnd(calc_grp.calc_grp_nm.like(bind("1")), getEditString(row, CalcNoCols.$i_calc_grp_nm));
		builder.addWhereWithCutOffAnd(t.calc_no.like(bind("1")), getEditString(row,CalcNoCols.$i_calc_no));
		builder.addWhereWithCutOffAnd(t.term.gte(bind("1")), row.getDateNE(CalcNoCols.$i_term_fr));
		builder.addWhereWithCutOffAnd(t.term.lte(bind("1")), row.getDateNE(CalcNoCols.$i_term_to));
		builder.addWhereWithCutOffAnd(extract(MCDateTimeFld.YEAR, t.end_ym).gte(bind("1")), row.getNumberNE(CalcNoCols.$i_y_fr));
		builder.addWhereWithCutOffAnd(extract(MCDateTimeFld.YEAR, t.end_ym).gte(bind("1")), row.getNumberNE(CalcNoCols.$i_y_to));
		builder.addWhereWithCutOffAnd(toChar(t.end_ym, MCDateTimeFmt.MM).like(bind("months")));
		builder.addWhereWithCutOffAnd(t.end_ym.gte(bind("1")), row.getDateNE(CalcNoCols.$i_ym_fr));
		builder.addWhereWithCutOffAnd(t.end_ym.lte(bind("1")), row.getDateNE(CalcNoCols.$i_ym_to));
		builder.addWhereWithCutOffAnd(t.sub_char1.like(bind("1")), getEditString(row, CalcNoCols.$i_sub_char1));
		builder.addWhereWithCutOffAnd(t.sub_char2.like(bind("1")), getEditString(row, CalcNoCols.$i_sub_char2));
		builder.addWhereWithCutOffAnd(t.sub_char3.like(bind("1")), getEditString(row, CalcNoCols.$i_sub_char3));
	}
	
	protected void getCalcNo_addWhereByFixFlg(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		// 入力補助画面から起動した時のみ実行する。（入力補助画面の検索枠内の確定ＦＬＧに値が存在するかどうかで判定）
		if (!row.contains(CalcNoCols.$i_fix_flg)) {
			return;
		}
		if (row.getBooleanNE(CalcNoCols.$i_fix_flg)) {
			MGT_CALC_FIX_R t2 = MGT_CALC_FIX_R.create("T2");
			//MGT_CALC_FIXに存在する計算ＮＯのみを表示
			builder.addWhereWithAnd(
					exists(subQuery()
							.select(t2.prAll())
							.from(t2)
							.where(t.calc_grp_cd.eq(t2.calc_grp_cd)
									.and(t.calc_no.eq(t2.calc_no)))));
		}
		else {
			MGT_YM_NO_R t2 = MGT_YM_NO_R.create("T2");
			//MGT_YM_NOに存在する計算ＮＯのみを表示
			builder.addWhereWithAnd(
					exists(subQuery()
							.select(t2.prAll())
							.from(t2)
							.where(t.calc_grp_cd.eq(t2.calc_grp_cd)
									.and(t.calc_no.eq(t2.calc_no)))));
		}

	}
	
	// -- CalcNo:原価計算ＮＯ（入力補助）(END)

	// -- CalcParm:原価計算パラメータ(START)
	@Override
	protected void getCalcParm_Set(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result) {
		super.getCalcParm_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.lcl_cd.eq(FCPA_CONTEXT$F_GET_LOCALE()));
	}
	// -- CalcParm:原価計算パラメータ(END)

	// -- BizGrp:原価業務分類(START)
	@Override
	protected void getBizGrp_Set(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result) {
		super.getBizGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.lcl_cd.eq(FCPA_CONTEXT$F_GET_LOCALE()));
	}
	// -- BizGrp:原価業務分類(END)

	// -- StkEvalWithUpriSetTypIsNotNull:在庫評価（単価設定）(START)
	@Override
	protected void getStkEvalWithUpriSetTypIsNotNull_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result) {
		super.getStkEvalWithUpriSetTypIsNotNull_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.upri_set_typ.isNotNull());
	}
	// -- StkEvalWithUpriSetTypIsNotNull:在庫評価（単価設定）(END)

	// -- StkEvalWithLumpRateFlgOff:在庫評価（一括指定しない）(START)
	@Override
	protected void getStkEvalWithLumpRateFlgOff_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result) {
		super.getStkEvalWithLumpRateFlgOff_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.lump_rate_flg.eq(value(false)));
	}
	// -- StkEvalWithLumpRateFlgOff:在庫評価（一括指定しない）(END)

	// -- PreAlcRateWithPtn:一次配賦基準(START)
	@Override
	protected void getPreAlcRateWithPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_PTN_R pre_alc_ptn = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");

		super.getPreAlcRateWithPtn_Set(row, builder, t, result);
		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_PRE_ALC_RATE_R.$pre_alc_ptn_nm);
		builder.inactiveForeign("PRE_ALC_PTN1");
		// 固定のSelect句、結合の設定
		builder.addInnerJoin(pre_alc_ptn, pre_alc_ptn.pre_alc_ptn_cd.eq(t.pre_alc_ptn_cd));
		builder.addSelectNEActiveForeign(pre_alc_ptn.pre_alc_ptn_nm.as("pre_alc_ptn_nm"));
		builder.addSelect(pre_alc_ptn.dpt_alc_typ.as("dpt_alc_typ"));
		builder.addSelect(pre_alc_ptn.loc_alc_typ.as("loc_alc_typ"));
		builder.addSelect(pre_alc_ptn.oper_alc_typ.as("oper_alc_typ"));
		builder.addSelect(pre_alc_ptn.bp_alc_typ.as("bp_alc_typ"));
		builder.addSelect(pre_alc_ptn.ctg_alc_typ.as("ctg_alc_typ"));
		builder.addSelect(pre_alc_ptn.itm_alc_typ.as("itm_alc_typ"));
		builder.addSelect(pre_alc_ptn.lot_alc_typ.as("lot_alc_typ"));
		builder.addSelect(pre_alc_ptn.sublot_alc_typ.as("sublot_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno1_alc_typ.as("sno1_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno2_alc_typ.as("sno2_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno3_alc_typ.as("sno3_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno4_alc_typ.as("sno4_alc_typ"));
		builder.addSelect(pre_alc_ptn.inst_alc_typ.as("inst_alc_typ"));
		builder.addSelect(pre_alc_ptn.iv_alc_typ.as("iv_alc_typ"));
		builder.addSelect(pre_alc_ptn.po_alc_typ.as("po_alc_typ"));
		builder.addSelect(pre_alc_ptn.slo_alc_typ.as("slo_alc_typ"));
		builder.addSelect(pre_alc_ptn.alc_ac_alc_typ.as("alc_ac_alc_typ"));
		builder.addSelect(pre_alc_ptn.wg_alc_typ.as("wg_alc_typ"));
		if (row.getBooleanNE(PreAlcRateWithPtnCols.$i_term_flg)) {
			builder.addWhereWithAnd(
					t.pln_mly_flg.eq(value(false))
					.or(t.act_mly_flg.eq(value(false))
							.and(t.pln_rule_flg.eq(value(false)))));
		}
		else {
			builder.addWhereWithCutOffAnd(
					t.pln_mly_flg.eq(bind("pln_mly_flg_str")));
			builder.addWhereWithCutOffAnd(
					t.act_mly_flg.eq(bind("act_mly_flg_str")));
		}
	}

	// -- PreAlcRateWithPtn:一次配賦基準(END)
	
	// -- CalcArgYm:原価計算年月(START)
	@Override
	protected void getCalcArgYm_Set(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		// ここではinput_valの絞込みは行わないのでsuperは呼び出さない
		// super.getCalcArgYm_Set(row, builder, t, result);
		builder.setSelect(t.st_ym, t.end_ym);
		builder.addWhereWithAnd(t.calc_no.eq(bind("1")),
				row.getString(CalcArgYmCols.$i_calc_no));
		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")),
				row.getString(CalcArgYmCols.$i_calc_grp_cd));
	}

	@Override
	protected MCList<?> getCalcArgYm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result) {
		super.getCalcArgYm_AfterSelect(row, builder, t, result);
		if (result.isEmpty()) {
			return result;
		}
		MCDate inputDt = row.getDateNE(FXBAC_ListLogicBase.$INPUT_VAL);
		MGT_ARG_R arg = (MGT_ARG_R) result.get(0);
		MCList<MCRow> ret = MCList.create(MCRow.class);
		ret.addDateColumn(CalcArgYmCols.$o_ym);
		if (isNull(inputDt)) {
			// リスト表示の場合
			for (MCDate ym = arg.st_ym(); ym.lte(arg.end_ym()); ym = ym.addMonth(1)) {
				MCRow r = ret.createRow();
				r.setDate(CalcArgYmCols.$o_ym, ym);
				ret.add(r);
			}
		}
		else {
			// 手入力の場合
			if (arg.st_ym().lte(inputDt) && inputDt.lte(arg.end_ym())) {
				MCRow r = ret.createRow();
				r.setDate(CalcArgYmCols.$o_ym, inputDt);
				ret.add(r);
			}

		}
		return ret;
	}
	// -- CalcArgYm:原価計算年月(END)

	// -- PreAlcRateInPreAlcCtgWithPtn:一次配賦基準（一次配賦基準カテゴリ登録済、一次配賦パタン取得）(START)
	@Override
	protected void getPreAlcRateInPreAlcCtgWithPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		super.getPreAlcRateInPreAlcCtgWithPtn_Set(row, builder, t, result);
		getPreAlcRateInPreAlcCtgWithPtn_addSelectJoinCustom(row, builder, t, result);
		getPreAlcRateInPreAlcCtgWithPtn_addWhereCustom(row, builder, t, result);
	}
	
	protected void getPreAlcRateInPreAlcCtgWithPtn_addSelectJoinCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_PTN_R pre_alc_ptn = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");
		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");

		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_PRE_ALC_RATE_R.$pre_alc_ptn_nm);
		builder.inactiveForeign("PRE_ALC_PTN1");
		// 固定のSelect句、結合の設定
		builder.addInnerJoin(pre_alc_ptn,
				pre_alc_ptn.pre_alc_ptn_cd.eq(t.pre_alc_ptn_cd));
		builder.addInnerJoin(pre_alc_ctg,
				pre_alc_ctg.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
		builder.addSelectNEActiveForeign(pre_alc_ptn.pre_alc_ptn_nm.as("pre_alc_ptn_nm"));
		builder.addSelect(pre_alc_ptn.dpt_alc_typ.as("dpt_alc_typ"));
		builder.addSelect(pre_alc_ptn.loc_alc_typ.as("loc_alc_typ"));
		builder.addSelect(pre_alc_ptn.oper_alc_typ.as("oper_alc_typ"));
		builder.addSelect(pre_alc_ptn.bp_alc_typ.as("bp_alc_typ"));
		builder.addSelect(pre_alc_ptn.ctg_alc_typ.as("ctg_alc_typ"));
		builder.addSelect(pre_alc_ptn.itm_alc_typ.as("itm_alc_typ"));
		builder.addSelect(pre_alc_ptn.lot_alc_typ.as("lot_alc_typ"));
		builder.addSelect(pre_alc_ptn.sublot_alc_typ.as("sublot_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno1_alc_typ.as("sno1_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno2_alc_typ.as("sno2_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno3_alc_typ.as("sno3_alc_typ"));
		builder.addSelect(pre_alc_ptn.sno4_alc_typ.as("sno4_alc_typ"));
		builder.addSelect(pre_alc_ptn.inst_alc_typ.as("inst_alc_typ"));
		builder.addSelect(pre_alc_ptn.iv_alc_typ.as("iv_alc_typ"));
		builder.addSelect(pre_alc_ptn.po_alc_typ.as("po_alc_typ"));
		builder.addSelect(pre_alc_ptn.slo_alc_typ.as("slo_alc_typ"));
		builder.addSelect(pre_alc_ptn.alc_ac_alc_typ.as("alc_ac_alc_typ"));
		builder.addSelect(pre_alc_ptn.wg_alc_typ.as("wg_alc_typ"));
		builder.addSelect(pre_alc_ctg.calc_ctg_cd.as("chk_calc_ctg_cd"));
		builder.addSelect(pre_alc_ctg.wg_cd.as("chk_wg_cd"));
		builder.addSelect(pre_alc_ctg.term.as("chk_term"));
		if (row.getBooleanNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_term_flg)) {
			builder.addWhereWithAnd(
					t.pln_mly_flg.eq(value(false))
					.or(t.act_mly_flg.eq(value(false))
							.and(t.pln_rule_flg.eq(value(false)))));
		}
		else {
			builder.addWhereWithCutOffAnd(
					t.pln_mly_flg.eq(bind("pln_mly_flg_str")));
			builder.addWhereWithCutOffAnd(
					t.act_mly_flg.eq(bind("act_mly_flg_str")));
		}

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
 		// 動的のSelect句、結合の設定
	}
	
	protected void getPreAlcRateInPreAlcCtgWithPtn_addWhereCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(pre_alc_ctg.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_calc_ctg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.wg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_wg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.term.eq(bind("1")),
				row.getDateNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_term));
	}

	protected MCMessage getPreAlcRateInPreAlcCtgWithPtn_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = new MCMessage(
				MGUAL0002,
				row.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_calc_ctg_cd),
				row.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_wg_cd),
				toYMString(row.getDateNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_term)),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	public MCList getPreAlcRateInPreAlcCtgWithPtn_SrvChk(MCRow inRow, MCList rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		subRsltL = subRsltL.subList("chk_calc_ctg_cd",
				inRow.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_calc_ctg_cd));
		subRsltL = subRsltL.subList("chk_wg_cd", inRow.getStringNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_wg_cd));
		subRsltL = subRsltL.subList("chk_term", inRow.getDateNE(PreAlcRateInPreAlcCtgWithPtnCols.$i_term));
		return subRsltL;
	}
	// -- PreAlcRateInPreAlcCtgWithPtn:一次配賦基準（一次配賦基準カテゴリ登録済、一次配賦パタン取得）(END)

	// -- ItmJnlInRptKeyConf:品目仕訳（原価レポートキー構成登録）(START)
	@Override
	protected void getItmJnlInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_JNL_R t, MCList<?> result) {
		MAM_RPT_KEY_CONF_R rpt_key_conf = MAM_RPT_KEY_CONF_R.create("RPT_KEY_CONF");

		super.getItmJnlInRptKeyConf_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addInnerJoin(rpt_key_conf,
				rpt_key_conf.itm_jnl_cd.eq(t.itm_jnl_cd));
		builder.addWhereWithCutOffAnd(rpt_key_conf.rpt_key_cd.eq(bind("1")),
				row.getStringNE(ItmJnlInRptKeyConfCols.$i_rpt_key_cd));
	}
	// -- ItmJnlInRptKeyConf:品目仕訳（原価レポートキー構成登録）(END)

	// -- ItmGrpInRptKeyConf:品目分類（原価レポートキー構成登録）(START)
	@Override
	protected void getItmGrpInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result) {
		MAM_RPT_KEY_CONF_R rpt_key_conf = MAM_RPT_KEY_CONF_R.create("RPT_KEY_CONF");

		super.getItmGrpInRptKeyConf_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addInnerJoin(rpt_key_conf,
				rpt_key_conf.itm_grp_typ.eq(t.itm_grp_typ)
				.and(rpt_key_conf.itm_grp_cd.eq(t.itm_grp_cd)));
		builder.addWhereWithCutOffAnd(rpt_key_conf.rpt_key_cd.eq(bind("1")),
				row.getStringNE(ItmGrpInRptKeyConfCols.$i_rpt_key_cd));
	}
	// -- ItmGrpInRptKeyConf:品目分類（原価レポートキー構成登録）(END)

	// -- :原価部門（原価レポートキー構成登録）(START)
	@Override
	protected void getCostDptInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result) {
		MAM_RPT_KEY_CONF_R rpt_key_conf = MAM_RPT_KEY_CONF_R.create("RPT_KEY_CONF");
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		super.getCostDptInRptKeyConf_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addInnerJoin(rpt_key_conf,
				rpt_key_conf.dpt_cd.eq(t.dpt_cd));
		builder.addInnerJoin(term,
				term.term.eq(t.term));
		builder.addWhereWithCutOffAnd(rpt_key_conf.rpt_key_cd.eq(bind("1")),
				row.getStringNE(CostDptInRptKeyConfCols.$i_rpt_key_cd));
		builder.addWhereWithAnd(bind("1").gte(term.term), getYmForDpt(row));
		builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getYmForDpt(row));
	}
	// -- CostDptInRptKeyConf:原価部門（原価レポートキー構成登録）(END)

	// -- CostCmpPtn:比較パタン（原価計算）(START)
	@Override
	protected void getCostCmpPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_R t, MCList<?> result) {
		MAM_RPT_PTN_R m1 = MAM_RPT_PTN_R.create("M1");
		MAM_RPT_KEY_R m2 = MAM_RPT_KEY_R.create("M2");
		MAM_RPT_CMP_CONF_R w = MAM_RPT_CMP_CONF_R.create("W");
		MAM_CALC_GRP_R w2 = MAM_CALC_GRP_R.create("W2");

		super.getCostCmpPtn_Set(row, builder, t, result);
		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_RPT_CMP_R.$rpt_ptn_cd);
		builder.removeSelect(MAM_RPT_CMP_R.$rpt_key_cd);
		builder.inactiveForeign("RPT_PTN1");
		builder.inactiveForeign("RPT_KEY1");
		// 固定のSelect句、結合の設定
		builder.addInnerJoin(m1, t.rpt_ptn_cd.eq(m1.rpt_ptn_cd));
		builder.addInnerJoin(m2, t.rpt_key_cd.eq(m2.rpt_key_cd));
		builder.addSelect(m1.rpt_ptn_cd);
		builder.addSelect(m2.rpt_key_cd);
		builder.addSelectNEActiveForeign(m1.rpt_ptn_nm.as("rpt_ptn_nm"));
		builder.addSelectNEActiveForeign(m2.rpt_key_nm.as("rpt_key_nm"));
		builder.addSelect(m2.rpt_key_typ.as("rpt_key_typ"));
		builder.addWhereWithAnd(
				exists(subQuery()
						.select(w.prAll())
						.from(w)
						.where(w.cmp_ptn_cd.eq(t.cmp_ptn_cd)
								.and(exists(subQuery()
										.select(w2.prAll())
										.from(w2)
										.where(w2.calc_grp_cd.eq(w.calc_grp_cd)
												.and(w2.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.NOT_STK.value()))
														.or(w2.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value()))))))))));
	}
	// -- CostCmpPtn:比較パタン（原価計算）(END)

	// -- PreAlcRateWithPtnNotInPreRateTerm:一次配賦基準（一次配賦期間比率未登録）(START)
	@Override
	protected void getPreAlcRateWithPtnNotInPreRateTerm_Set(
			MCRow row,MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		super.getPreAlcRateWithPtnNotInPreRateTerm_Set(row, builder, t, result);
		getPreAlcRateWithPtnNotInPreRateTerm_addSelectJoinCustom(row, builder, t, result);
		getPreAlcRateWithPtnNotInPreRateTerm_addWhereCustom(row, builder, t, result);
	}

	protected void getPreAlcRateWithPtnNotInPreRateTerm_addSelectJoinCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_PTN_R pre_alc_ptn = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");
		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");
		MGT_PRE_RATE_TERM_R pre_rate_term = MGT_PRE_RATE_TERM_R.create("PRE_RATE_TERM");

		// 固定のSelect句、結合の設定
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk2_calc_ctg_cd);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk2_wg_cd);
		result.addDateColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk2_term);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk3_calc_ctg_cd);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk3_wg_cd);
		result.addDateColumn(PreAlcRateWithPtnNotInPreRateTermCols.$o_chk3_term);

		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_PRE_ALC_RATE_R.$pre_alc_ptn_nm);
		builder.inactiveForeign("PRE_ALC_PTN1");

		builder.addInnerJoin(pre_alc_ptn,
				pre_alc_ptn.pre_alc_ptn_cd.eq(t.pre_alc_ptn_cd));
		builder.addSelectNEActiveForeign(pre_alc_ptn.pre_alc_ptn_nm.as("pre_alc_ptn_nm"));
		builder.addInnerJoin(pre_alc_ctg,
				pre_alc_ctg.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
		builder.addSelect(pre_alc_ctg.calc_ctg_cd.as("chk_calc_ctg_cd"));
		builder.addSelect(pre_alc_ctg.wg_cd.as("chk_wg_cd"));
		builder.addSelect(pre_alc_ctg.term.as("chk_term"));
		getPreAlcRateWithPtnNotInPreRateTerm_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			builder.addSelect(pre_rate_term.calc_ctg_cd.as("chk2_calc_ctg_cd"));
			builder.addSelect(pre_rate_term.wg_cd.as("chk2_wg_cd"));
			builder.addSelect(pre_rate_term.term.as("chk2_term"));
			builder.addLeftOuterJoin(pre_rate_term,
					pre_rate_term.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}

 		// 動的のSelect句、結合の設定
	}

	protected void getPreAlcRateWithPtnNotInPreRateTerm_addSelectJoinWk(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MGW_PRE_RATE_TERM_LL_R w = MGW_PRE_RATE_TERM_LL_R.create("W");

		if (!isSrvChk(row)) {
			return;
		}
		// ワークテーブルを作成＋結合
		MGW_PRE_RATE_TERM_LL_R pre_rate_term_ll = MGW_PRE_RATE_TERM_LL_R.create("T");
		MCList<MGW_PRE_RATE_TERM_LL_R> sd = MCList.create(pre_rate_term_ll);
		String delid = createSqlId("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm_addSelectJoinWk", pre_rate_term_ll, "D01");
		execDbWkDelete(delid, pre_rate_term_ll);

		String[] prealcrateCd;
		String[] calcctgCd;
		String[] wgCd;
		MCDate[] term;
		prealcrateCd = (String[]) convDataArray(row.getStringNE(
				MAUAC_List.$LIST_LOGIC_VAL));
		term = (MCDate[]) convDataArray(
				row.getStringNE(MAUAC_List
						.getLLBindNm(PreAlcRateWithPtnNotInPreRateTermCols.$i_term)));
		calcctgCd = (String[]) convDataArray(
				row.getStringNE(MAUAC_List.getLLBindNm(
						PreAlcRateWithPtnNotInPreRateTermCols.$i_calc_ctg_cd)));
		wgCd = (String[]) convDataArray(
				row.getStringNE(MAUAC_List.getLLBindNm(
						PreAlcRateWithPtnNotInPreRateTermCols.$i_wg_cd)));

		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(pre_rate_term_ll);
		String insid = createSqlId("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm_addSelectJoinWk", pre_rate_term_ll, "I01");
		insBuilder.setValuesAll();
		for (int i = 0; i < prealcrateCd.length; i++) {
			MGW_PRE_RATE_TERM_LL_R sr = MGW_PRE_RATE_TERM_LL_R.create();
			sr.pre_alc_rate_cd(prealcrateCd[i]);
			sr.term(term[i]);
			sr.calc_ctg_cd(calcctgCd[i]);
			sr.wg_cd(wgCd[i]);
			sd.add(sr);
		}
		dbInsert(insid, sd, insBuilder);

		// ワークテーブルと結合したSELECT句を追加
		builder.addSelect(w.term.as("chk3_term")); // リストロジックチェックで使用
		builder.addSelect(w.calc_ctg_cd.as("chk3_calc_ctg_cd")); // リストロジックチェックで使用
		builder.addSelect(w.wg_cd.as("chk3_wg_cd")); // リストロジックチェックで使用
		builder.addInnerJoin(w, w.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
	}

	protected void getPreAlcRateWithPtnNotInPreRateTerm_addWhereCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MGT_PRE_RATE_TERM_R t2 = MGT_PRE_RATE_TERM_R.create("T2");
		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(
				t.pln_mly_flg.eq(value(false))
				.or(t.act_mly_flg.eq(value(false))
						.and(t.pln_rule_flg.eq(value(false)))));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(pre_alc_ctg.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_calc_ctg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.wg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_wg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.term.eq(bind("1")),
				row.getDateNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_term));
		builder.addWhereWithAnd(
				notExists(subQuery()
						.select(value("X"))
						.from(t2)
						.where(t2.pre_alc_rate_cd.eq(t.pre_alc_rate_cd)
								.and(t2.calc_ctg_cd.eq(bind("calc_ctg_cd")))
								.and(t2.wg_cd.eq(bind("wg_cd")))
								.and(t2.term.eq(bind("term"))))));
	}

	protected MCMessage getPreAlcRateWithPtnNotInPreRateTerm_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = new MCMessage(MGUAL0003,
				row.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_calc_ctg_cd),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_wg_cd),
				toYMString(row.getDateNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_term)),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	public <E extends MCRow> MCList getPreAlcRateWithPtnNotInPreRateTerm_SrvChk(MCRow inRow, MCList<E> rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		subRsltL = subRsltL.subList("chk_calc_ctg_cd", inRow.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_calc_ctg_cd));
		subRsltL = subRsltL.subList("chk_wg_cd", inRow.getStringNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_wg_cd));
		subRsltL = subRsltL.subList("chk_term", inRow.getDateNE(PreAlcRateWithPtnNotInPreRateTermCols.$i_term));
		MCList existL = subRsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
//				一次配賦月次比率とワーク値が一致してしないことをチェック
				boolean cnd1 = isSame(row.getStringNE("chk2_wg_cd"), row.getStringNE("chk3_wg_cd"));
				boolean cnd2 = isSame(row.getStringNE("chk2_calc_ctg_cd"), row.getStringNE("chk3_calc_ctg_cd"));
				boolean cnd3 = isSame(row.getDateNE("chk2_term"),row.getDateNE("chk3_term"));
				return cnd1 && cnd2 && cnd3;
			}
		});
		
		if (existL.size() > 0) {
			subRsltL.clear(); 
		}

		return subRsltL;
	}
	// -- PreAlcRateWithPtnNotInPreRateTerm:一次配賦基準（一次配賦期間比率未登録）(END)

	// -- PreAlcRateWithPtnNotInPreRateMly:一次配賦基準（一次配賦月次比率未登録）(START)
	@Override
	protected void getPreAlcRateWithPtnNotInPreRateMly_Set(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		super.getPreAlcRateWithPtnNotInPreRateMly_Set(row, builder, t, result);
		getPreAlcRateWithPtnNotInPreRateMly_addSelectJoinCustom(row, builder, t, result);
		getPreAlcRateWithPtnNotInPreRateMly_addWhereCustom(row, builder, t, result);
	}

	protected void getPreAlcRateWithPtnNotInPreRateMly_addSelectJoinCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_PTN_R pre_alc_ptn = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");
		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");
		MGT_PRE_RATE_MLY_R pre_rate_mly = MGT_PRE_RATE_MLY_R.create("PRE_RATE_MLY");

		// 固定のSelect句、結合の設定
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk2_calc_ctg_cd);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk2_wg_cd);
		result.addDateColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk2_ym);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk2_sa_typ);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk3_calc_ctg_cd);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk3_wg_cd);
		result.addDateColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk3_ym);
		result.addStringColumn(PreAlcRateWithPtnNotInPreRateMlyCols.$o_chk3_sa_typ);

		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_PRE_ALC_RATE_R.$pre_alc_ptn_nm);
		builder.inactiveForeign("PRE_ALC_PTN1");

		builder.addInnerJoin(pre_alc_ptn,
				pre_alc_ptn.pre_alc_ptn_cd.eq(t.pre_alc_ptn_cd));
		builder.addSelectNEActiveForeign(pre_alc_ptn.pre_alc_ptn_nm.as("pre_alc_ptn_nm"));
		builder.addInnerJoin(pre_alc_ctg,
				pre_alc_ctg.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
		builder.addSelect(pre_alc_ctg.calc_ctg_cd.as("chk_calc_ctg_cd"));
		builder.addSelect(pre_alc_ctg.wg_cd.as("chk_wg_cd"));
		builder.addSelect(pre_alc_ctg.term.as("chk_term"));
		getPreAlcRateWithPtnNotInPreRateMly_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			builder.addLeftOuterJoin(pre_rate_mly,
					pre_rate_mly.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
			builder.addSelect(pre_rate_mly.calc_ctg_cd.as("chk2_calc_ctg_cd"));
			builder.addSelect(pre_rate_mly.wg_cd.as("chk2_wg_cd"));
			builder.addSelect(pre_rate_mly.ym.as("chk2_ym"));
			builder.addSelect(pre_rate_mly.sa_typ.as("chk2_sa_typ"));
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 動的のSelect句、結合の設定
	}

	protected void getPreAlcRateWithPtnNotInPreRateMly_addSelectJoinWk(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MGW_PRE_RATE_MLY_LL_R w = MGW_PRE_RATE_MLY_LL_R.create("W");

		if (!isSrvChk(row)) {
			return;
		}
		// ワークテーブルを作成＋結合
		MGW_PRE_RATE_MLY_LL_R rate_mly_ll = MGW_PRE_RATE_MLY_LL_R.create("T");
		MCList<MGW_PRE_RATE_MLY_LL_R> sd = MCList.create(rate_mly_ll);
		String delid = createSqlId("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm_addSelectJoinWk", rate_mly_ll, "D02");
		execDbWkDelete(delid, rate_mly_ll);
		String[] prealcrateCd;
		String[] calcctgCd;
		String[] wgCd;
		String[] saTyp;
		MCDate[] ym;
		prealcrateCd = (String[]) convDataArray(row.getStringNE(
				mcframe.commonMAUA.MAUAC0010.MAUAC_List.$LIST_LOGIC_VAL));
		ym = (MCDate[]) convDataArray(
				row.getStringNE(mcframe.commonMAUA.MAUAC0010.MAUAC_List
						.getLLBindNm(PreAlcRateWithPtnNotInPreRateMlyCols.$i_ym)));
		calcctgCd = (String[]) convDataArray(
				row.getStringNE(mcframe.commonMAUA.MAUAC0010.MAUAC_List.getLLBindNm(
						PreAlcRateWithPtnNotInPreRateMlyCols.$i_calc_ctg_cd)));
		wgCd = (String[]) convDataArray(
				row.getStringNE(mcframe.commonMAUA.MAUAC0010.MAUAC_List
						.getLLBindNm(PreAlcRateWithPtnNotInPreRateMlyCols.$i_wg_cd)));
		saTyp = (String[]) convDataArray(
				row.getStringNE(mcframe.commonMAUA.MAUAC0010.MAUAC_List.getLLBindNm(
						PreAlcRateWithPtnNotInPreRateMlyCols.$i_sa_typ)));

		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(rate_mly_ll);
		String insid = createSqlId("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateMly_addSelectJoinWk", rate_mly_ll, "I02");
		insBuilder.setValuesAll();
		for (int i = 0; i < prealcrateCd.length; i++) {
			MGW_PRE_RATE_MLY_LL_R sr = MGW_PRE_RATE_MLY_LL_R.create();
			sr.pre_alc_rate_cd(prealcrateCd[i]);
			sr.ym(ym[i]);
			sr.calc_ctg_cd(calcctgCd[i]);
			sr.wg_cd(wgCd[i]);
			sr.sa_typ(saTyp[i]);
			sd.add(sr);
		}
		dbInsert(insid, sd, insBuilder);

		// ワークテーブルと結合したSELECT句を追加
		builder.addSelect(w.ym.as("chk3_ym")); // リストロジックチェックで使用
		builder.addSelect(w.sa_typ.as("chk3_sa_typ")); // リストロジックチェックで使用
		builder.addSelect(w.calc_ctg_cd.as("chk3_calc_ctg_cd")); // リストロジックチェックで使用
		builder.addSelect(w.wg_cd.as("chk3_wg_cd")); // リストロジックチェックで使用
		builder.addInnerJoin(w, w.pre_alc_rate_cd.eq(t.pre_alc_rate_cd));
	}

	protected void getPreAlcRateWithPtnNotInPreRateMly_addWhereCustom(
			MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MGT_PRE_RATE_MLY_R t2 = MGT_PRE_RATE_MLY_R.create("T2");
		MAM_PRE_ALC_CTG_R pre_alc_ctg = MAM_PRE_ALC_CTG_R.create("PRE_ALC_CTG");

		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(pre_alc_ctg.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_calc_ctg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.wg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_wg_cd));
		builder.addWhereWithAnd(pre_alc_ctg.term.eq(bind("1")),
				row.getDateNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_term));
		builder.addWhereWithAnd(notExists(subQuery().select(value("X"))
				.from(t2)
				.where(t2.pre_alc_rate_cd.eq(t.pre_alc_rate_cd)
						.and(t2.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(t2.wg_cd.eq(bind("wg_cd")))
						.and(t2.ym.eq(bind("ym")))
						.and(t2.sa_typ.eq(bind("sa_typ"))))));
		String typ = row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_sa_typ);
		if (MAC_SA_TYP.isPLN(typ)) {
			builder.addWhereWithAnd(t.pln_mly_flg.eq(value(true)));
		}
		if (MAC_SA_TYP.isACT(typ)) {
			builder.addWhereWithAnd(t.act_mly_flg.eq(value(true)));
		}

	}

	protected MCMessage getPreAlcRateWithPtnNotInPreRateMly_Msg(MCRow causeRow,
			String causeCol, MCRow row, String info) {
		MCMessage msg = new MCMessage(MGUAL0004,
				row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_calc_ctg_cd),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_wg_cd),
				toYMString(row.getDateNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_term)),
				toYMString(row.getDateNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_ym)),
				row.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_sa_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	public <E extends MCRow> MCList getPreAlcRateWithPtnNotInPreRateMly_SrvChk(MCRow inRow, MCList rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		subRsltL = subRsltL.subList("chk_calc_ctg_cd",
				inRow.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_calc_ctg_cd));
		subRsltL = subRsltL.subList("chk_wg_cd",
				inRow.getStringNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_wg_cd));
		subRsltL = subRsltL.subList("chk_term",
				inRow.getDateNE(PreAlcRateWithPtnNotInPreRateMlyCols.$i_term));
		
		MCList existL = subRsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
//				一次配賦月次比率とワーク値が一致してしないことをチェック
				boolean cnd1 = isSame(row.getStringNE("chk2_wg_cd"), row.getStringNE("chk3_wg_cd"));
				boolean cnd2 = isSame(row.getStringNE("chk2_calc_ctg_cd"), row.getStringNE("chk3_calc_ctg_cd"));
				boolean cnd3 = isSame(row.getDateNE("chk2_ym"),row.getDateNE("chk3_ym"));
				boolean cnd4 = isSame(row.getStringNE("chk2_sa_typ"), row.getStringNE("chk3_sa_typ"));
				return cnd1 && cnd2 && cnd3 && cnd4;
			}
		});
		if (existL.size() > 0) {
			subRsltL.clear(); 
		}
		
		return subRsltL;
	}

	// -- PreAlcRateWithPtnNotInPreRateMly:一次配賦基準（一次配賦月次比率未登録）(END)

}
