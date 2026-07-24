package mcframe.serverMAUA.MAUAL0010;

import mcframe.commonCore.container.*;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.util.MCListLogicUtil;
import mcframe.commonMA.constant.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import mcframe.serverMA.dbc.*;
import static mcframe.commonMA.notice.MA_Msg.*;

abstract public class MAUAL_ListItm_MC extends MAUAL_ListDpt_MC {
	// -- Itm:品目 (START)
	@Override
	protected void getItm_Set(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		super.getItm_Set(row, builder, t, result);
		getItm_addSelectJoinCustom(row, builder, t, result);
		getItm_addWhereCustom(row, builder, t, result);
	}

	protected void getItm_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R fctr_unit = MAM_UNIT_R.create("FCTR_UNIT");
		MAM_ITM_TYP_D_R itypd = MAM_ITM_TYP_D_R.create("ITYPD");
		MAM_BP_ITM_R bp_itm = MAM_BP_ITM_R.create("BP_ITM");

		// 品目ＣＤ、枝番１～２はリストロジックチェックで使用しない想定のため、リストロジックチェックかどうかの場合分けはしない

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(ItmCols.$o_unit_nm);
		result.addStringColumn(ItmCols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmCols.$o_itm_grp_nm1);
		result.addStringColumn(ItmCols.$o_itm_grp_nm2);
		result.addStringColumn(ItmCols.$o_itm_grp_nm3);
		result.addStringColumn(ItmCols.$o_itm_grp_nm4);
		result.addStringColumn(ItmCols.$o_itm_grp_nm5);
		result.addStringColumn(ItmCols.$o_itm_grp_nm6);
		result.addStringColumn(ItmCols.$o_itm_grp_nm7);
		result.addStringColumn(ItmCols.$o_itm_grp_nm8);
		result.addStringColumn(ItmCols.$o_itm_grp_nm9);
		result.addStringColumn(ItmCols.$o_itm_grp_nm10);
		result.addStringColumn(ItmCols.$o_bp_itm_cd);
		result.addStringColumn(ItmCols.$o_bp_itm_nm);
		result.addStringColumn(ItmCols.$o_cont_fctr_unit_nm);

		// Select句、結合の設定
		builder.addSelect(unit.unit_nm);
		builder.addSelect(fctr_unit.unit_nm.as("cont_fctr_unit_nm"));
		builder.addSelect(itypd.itm_typ_d_nm);
		builder.addLeftOuterJoin(unit, unit.unit_cd.eq(t.unit_cd));
		builder.addLeftOuterJoin(fctr_unit, fctr_unit.unit_cd.eq(t.cont_fctr_unit_cd));
		builder.addLeftOuterJoin(itypd,
				itypd.itm_typ_d_cd.eq(t.itm_typ_d_cd)
						.and(itypd.itm_typ.eq(t.itm_typ)));

		// サーバチェックは枝番3にて実行するため、動的条件前ではリターンしない

		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getDateNE(ItmCols.$i_dt)) && !isNull(row.getStringNE(ItmCols.$i_bp_cd))) {
			builder.addSelect(bp_itm.bp_itm_cd);
			builder.addSelect(bp_itm.bp_itm_nm);
			builder.addLeftOuterJoin(bp_itm,
					bp_itm.itm_cd.eq(t.itm_cd)
					.and(bp_itm.itm_sub1.eq(t.itm_sub1))
					.and(bp_itm.itm_sub2.eq(t.itm_sub2))
					.and(bp_itm.itm_sub3.eq(t.itm_sub3))
					.and(bp_itm.bp_cd.eq(bind("bp_cd")))
					.and(bind("dt").between(bp_itm.st_dt, bp_itm.end_dt)));
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}

		setSelectJoinOfItmGrpForItm(row, builder);
	}


	protected void getItm_addWhereCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		// 品目ＣＤ、枝番１～２はリストロジックチェックで使用しない想定のため、リストロジックチェックかどうかの場合分けはしない

		// 固定条件（行ごとに条件値が同じ条件）
		final String R_ON = "release_flg_on";
		final String R_OFF = "release_flg_off";
		if (row.getBooleanNE(R_ON) && row.getBooleanNE(R_OFF)) {
			;
		}
		else if (row.getBooleanNE(R_ON)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
		else if (row.getBooleanNE(R_OFF)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(false)));
		}
		else {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}

		// オン/オフの両方共チェック済の場合に全てを検索対象
		boolean sun_on = row.getBooleanNE(ItmCols.$i_sundry_itm_flg_on);
		boolean sun_off = row.getBooleanNE(ItmCols.$i_sundry_itm_flg_off);
		if (sun_on && sun_off) {
			;
		}
		else if (sun_on) {
			builder.addWhereWithAnd(t.sundry_itm_flg.eq(value(true)));
		}
		else if (sun_off) {
			builder.addWhereWithAnd(t.sundry_itm_flg.eq(value(false)));
		}

		// 検索区分の条件
		setItmConditionByItmIsSrchTyp(row, builder,
				row.getStringNE(ItmCols.$i_itm_is_srch_typ));

		MAM_BP_ITM_R bp_itm = MAM_BP_ITM_R.create("BP_ITM");
		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getDateNE(ItmCols.$i_dt)) && !isNull(row.getStringNE(ItmCols.$i_bp_cd))) {
			builder.addWhereWithCutOffAnd(bp_itm.bp_itm_cd.like(bind("1")),
					getEditString(row, ItmCols.$i_bp_itm_cd));
			builder.addWhereWithCutOffAnd(bp_itm.bp_itm_nm.like(bind("1")),
					getEditString(row, ItmCols.$i_bp_itm_nm));
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}

		MAM_ITM_TYP_D_R itypd = MAM_ITM_TYP_D_R.create("ITYPD");

		MAM_ITM_GRP_R grp1 = MAM_ITM_GRP_R.create("GRP1");
		MAM_ITM_GRP_R grp2 = MAM_ITM_GRP_R.create("GRP2");
		MAM_ITM_GRP_R grp3 = MAM_ITM_GRP_R.create("GRP3");
		MAM_ITM_GRP_R grp4 = MAM_ITM_GRP_R.create("GRP4");
		MAM_ITM_GRP_R grp5 = MAM_ITM_GRP_R.create("GRP5");
		MAM_ITM_GRP_R grp6 = MAM_ITM_GRP_R.create("GRP6");
		MAM_ITM_GRP_R grp7 = MAM_ITM_GRP_R.create("GRP7");
		MAM_ITM_GRP_R grp8 = MAM_ITM_GRP_R.create("GRP8");
		MAM_ITM_GRP_R grp9 = MAM_ITM_GRP_R.create("GRP9");
		MAM_ITM_GRP_R grp10 = MAM_ITM_GRP_R.create("GRP10");

		// 入力補助画面からの条件
		builder.addWhereWithCutOffAnd(t.itm_cd.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_cd));
		builder.addWhereWithCutOffAnd(t.itm_sub1.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_sub1));
		builder.addWhereWithCutOffAnd(t.itm_sub2.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_sub2));
		builder.addWhereWithCutOffAnd(t.itm_sub3.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_sub3));
		builder.addWhereWithCutOffAnd(t.itm_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_nm));
		builder.addWhereWithCutOffAnd(t.itm_alt_nm1.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_alt_nm1));
		builder.addWhereWithCutOffAnd(t.itm_alt_nm2.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_alt_nm2));
		builder.addWhereWithCutOffAnd(t.itm_alt_nm3.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_alt_nm3));
		builder.addWhereWithCutOffAnd(t.itm_alt_nm4.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_alt_nm4));
		builder.addWhereWithCutOffAnd(t.itm_typ.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_typ));
		builder.addWhereWithCutOffAnd(t.itm_typ_d_cd.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_typ_d_cd));
		builder.addWhereWithCutOffAnd(itypd.itm_typ_d_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_typ_d_nm));
		builder.addWhereWithCutOffAnd(t.stk_mng_typ.like(bind("1")),
				getEditString(row, ItmCols.$i_stk_mng_typ));
		builder.addWhereWithCutOffAnd(t.asset_mng_typ.like(bind("1")),
				getEditString(row, ItmCols.$i_asset_mng_typ));
		builder.addWhereWithCutOffAnd(t.memo1_c.like(bind("1")),
				getEditString(row, ItmCols.$i_memo1_c));
		builder.addWhereWithCutOffAnd(t.memo2_c.like(bind("1")),
				getEditString(row, ItmCols.$i_memo2_c));
		builder.addWhereWithCutOffAnd(t.memo3_c.like(bind("1")),
				getEditString(row, ItmCols.$i_memo3_c));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, ItmCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, ItmCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, ItmCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd1.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm1));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd2.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm2));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd3.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm3));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd4.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm4));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd5.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm5));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd6.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm6));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd7.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm7));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd8.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm8));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd9.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm9));
		builder.addWhereWithCutOffAnd(t.itm_grp_cd10.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.itm_grp_nm.like(bind("1")),
				getEditString(row, ItmCols.$i_itm_grp_nm10));
	}

	@Override
	protected MCList<?> getItm_AfterSelect(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result){
		MCList<?> l = super.getItm_AfterSelect(row, builder, t, result);
		if (isInput(row)) {
			l = getItm_NoDupList(row, result, l, ItmCols.$o_itm_cd, "MA.MAUAL0010.Itm");
		}
		setTypNmForItm(row, builder, l);
		return l;
	}

	protected void getItm_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmCols.$o_itm_cd, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmCols.$o_itm_sub1, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmCols.$o_itm_sub2, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmCols.$o_itm_sub3, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- Itm:品目 (END)
	// -- ItmSub1:枝番１ (START)

	@Override
	protected void getItmSub1_Set(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		super.getItmSub1_Set(row, builder, t, result);
		getItmSub1_addSelectJoinCustom(row, builder, t, result);
		getItmSub1_addWhereCustom(row, builder, t, result);
	}

	protected void getItmSub1_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R fctr_unit = MAM_UNIT_R.create("FCTR_UNIT");
		MAM_ITM_TYP_D_R itypd = MAM_ITM_TYP_D_R.create("ITYPD");
		MAM_BP_ITM_R bp_itm = MAM_BP_ITM_R.create("BP_ITM");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(ItmSub1Cols.$o_unit_nm);
		result.addStringColumn(ItmSub1Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm1);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm2);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm3);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm4);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm5);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm6);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm7);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm8);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm9);
		result.addStringColumn(ItmSub1Cols.$o_itm_grp_nm10);
		result.addStringColumn(ItmSub1Cols.$o_bp_itm_cd);
		result.addStringColumn(ItmSub1Cols.$o_bp_itm_nm);
		result.addStringColumn(ItmSub1Cols.$o_cont_fctr_unit_nm);

		// Select句、結合の設定
		builder.addSelect(unit.unit_nm);
		builder.addSelect(fctr_unit.unit_nm.as("cont_fctr_unit_nm"));
		builder.addSelect(itypd.itm_typ_d_nm);
		builder.addLeftOuterJoin(unit,
				unit.unit_cd.eq(t.unit_cd));
		builder.addLeftOuterJoin(fctr_unit,
				fctr_unit.unit_cd.eq(t.cont_fctr_unit_cd));
		builder.addLeftOuterJoin(itypd,
				itypd.itm_typ_d_cd.eq(t.itm_typ_d_cd)
				.and(itypd.itm_typ.eq(t.itm_typ)));

		// 枝番は入力補助画面でないため、品目区分詳細、品目分類の情報は結合しない

		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getDateNE(ItmSub1Cols.$i_dt)) && !isNull(row.getStringNE(ItmSub1Cols.$i_bp_cd))) {
			builder.addSelect(bp_itm.bp_itm_cd);
			builder.addSelect(bp_itm.bp_itm_nm);
			builder.addLeftOuterJoin(bp_itm,
					bp_itm.itm_cd.eq(t.itm_cd)
					.and(bp_itm.itm_sub1.eq(t.itm_sub1))
					.and(bp_itm.itm_sub2.eq(t.itm_sub2))
					.and(bp_itm.itm_sub3.eq(t.itm_sub3))
					.and(bp_itm.bp_cd.eq(bind("bp_cd")))
					.and(bind("dt").between(bp_itm.st_dt, bp_itm.end_dt)));
		}

	}

	protected void getItmSub1_addWhereCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		// 品目ＣＤ、枝番１～２はリストロジックチェックで使用しない想定のため、リストロジックチェックかどうかの場合分けはしない
		
		// 固定条件（行ごとに条件値が同じ条件）
		final String R_ON = "release_flg_on";
		final String R_OFF = "release_flg_off";
		if (row.getBooleanNE(R_ON) && row.getBooleanNE(R_OFF)) {
			;
		}
		else if (row.getBooleanNE(R_ON)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
		else if (row.getBooleanNE(R_OFF)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(false)));
		}
		else {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}

		// 検索区分の条件
		setItmConditionByItmIsSrchTyp(row, builder, row.getStringNE(ItmSub1Cols.$i_itm_is_srch_typ));

		// 動的条件
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmSub1Cols.$i_itm_cd));
	}

	@Override
	protected MCList<?> getItmSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result){
		MCList<?> l = super.getItmSub1_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItm_NoDupList(row, result, l, ItmCols.$o_itm_sub1, "MA.MAUAL0010.ItmSub1");
		}
		setTypNmForItm(row, builder, l);
		return l;
	}

	protected void getItmSub1_NullVal(
			MCRow row, MCList<MCRow> down) {
		if (isSame(row.getStringNE(ItmSub1Cols.$i_itm_cd), MAC_STR.NULL_VAL.value())) {
			MCRow r = down.createRow();
			r.setStringNE(ItmSub1Cols.$o_itm_cd, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub1Cols.$o_itm_sub1, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub1Cols.$o_itm_sub2, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub1Cols.$o_itm_sub3, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ItmSub1:枝番１ (END)
	// -- ItmSub2:枝番２ (START)

	@Override
	protected void getItmSub2_Set(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		super.getItmSub2_Set(row, builder, t, result);
		getItmSub2_addSelectJoinCustom(row, builder, t, result);
		getItmSub2_addWhereCustom(row, builder, t, result);
	}

	protected void getItmSub2_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R fctr_unit = MAM_UNIT_R.create("FCTR_UNIT");
		MAM_ITM_TYP_D_R itypd = MAM_ITM_TYP_D_R.create("ITYPD");
		MAM_BP_ITM_R bp_itm = MAM_BP_ITM_R.create("BP_ITM");

		// 品目ＣＤ、枝番１～２はリストロジックチェックで使用しない想定のため、リストロジックチェックかどうかの場合分けはしない

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(ItmSub2Cols.$o_unit_nm);
		result.addStringColumn(ItmSub2Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm1);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm2);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm3);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm4);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm5);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm6);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm7);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm8);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm9);
		result.addStringColumn(ItmSub2Cols.$o_itm_grp_nm10);
		result.addStringColumn(ItmSub2Cols.$o_bp_itm_cd);
		result.addStringColumn(ItmSub2Cols.$o_bp_itm_nm);
		result.addStringColumn(ItmSub2Cols.$o_cont_fctr_unit_nm);

		// Select句、結合の設定
		builder.addSelect(unit.unit_nm);
		builder.addSelect(fctr_unit.unit_nm.as("cont_fctr_unit_nm"));
		builder.addSelect(itypd.itm_typ_d_nm);
		builder.addLeftOuterJoin(unit, unit.unit_cd.eq(t.unit_cd));
		builder.addLeftOuterJoin(fctr_unit, fctr_unit.unit_cd.eq(t.cont_fctr_unit_cd));
		builder.addLeftOuterJoin(itypd, itypd.itm_typ_d_cd.eq(t.itm_typ_d_cd).and(itypd.itm_typ.eq(t.itm_typ)));

		// 枝番は入力補助画面でないため、品目区分詳細、品目分類の情報は結合しない

		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getDateNE(ItmSub2Cols.$i_dt)) && !isNull(row.getStringNE(ItmSub2Cols.$i_bp_cd))) {
			builder.addSelect(bp_itm.bp_itm_cd);
			builder.addSelect(bp_itm.bp_itm_nm);
			builder.addLeftOuterJoin(bp_itm, bp_itm.itm_cd.eq(t.itm_cd)
					.and(bp_itm.itm_sub1.eq(t.itm_sub1))
					.and(bp_itm.itm_sub2.eq(t.itm_sub2))
					.and(bp_itm.itm_sub3.eq(t.itm_sub3))
					.and(bp_itm.bp_cd.eq(bind("bp_cd")))
					.and(bind("dt").between(bp_itm.st_dt, bp_itm.end_dt)));
		}
	}

	protected void getItmSub2_addWhereCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		// 品目ＣＤ、枝番１～２はリストロジックチェックで使用しない想定のため、リストロジックチェックかどうかの場合分けはしない

		// 固定条件（行ごとに条件値が同じ条件）
		final String R_ON = "release_flg_on";
		final String R_OFF = "release_flg_off";
		if (row.getBooleanNE(R_ON) && row.getBooleanNE(R_OFF)) {
			;
		}
		else if (row.getBooleanNE(R_ON)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
		else if (row.getBooleanNE(R_OFF)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(false)));
		}
		else {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}

		// 検索区分の条件
		setItmConditionByItmIsSrchTyp(row, builder, row.getStringNE(ItmSub2Cols.$i_itm_is_srch_typ));

		// 動的条件
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmSub2Cols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmSub2Cols.$i_itm_sub1));
	}

	@Override
	protected MCList<?> getItmSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result){
		MCList<?> l = super.getItmSub2_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItm_NoDupList(row, result, l, ItmCols.$o_itm_sub2, "MA.MAUAL0010.ItmSub2");
		}
		setTypNmForItm(row, builder, l);
		return l;
	}

	protected void getItmSub2_NullVal(
			MCRow row, MCList<MCRow> down) {
		if (isSame(row.getStringNE(ItmSub2Cols.$i_itm_cd), MAC_STR.NULL_VAL.value())) {
			MCRow r = down.createRow();
			r.setStringNE(ItmSub2Cols.$o_itm_cd, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub2Cols.$o_itm_sub1, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub2Cols.$o_itm_sub2, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub2Cols.$o_itm_sub3, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ItmSub2:枝番２ (END)
	// -- ItmSub3:枝番３ (START)

	@Override
	protected void getItmSub3_Set(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		super.getItmSub3_Set(row, builder, t, result);
		getItmSub3_addSelectJoinCustom(row, builder, t, result);
		getItmSub3_addWhereCustom(row, builder, t, result);
	}

	protected void getItmSub3_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R fctr_unit = MAM_UNIT_R.create("FCTR_UNIT");
		MAM_ITM_TYP_D_R itypd = MAM_ITM_TYP_D_R.create("ITYPD");
		MAM_BP_ITM_R bp_itm = MAM_BP_ITM_R.create("BP_ITM");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(ItmSub3Cols.$o_unit_nm);
		result.addStringColumn(ItmSub3Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm1);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm2);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm3);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm4);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm5);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm6);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm7);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm8);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm9);
		result.addStringColumn(ItmSub3Cols.$o_itm_grp_nm10);
		result.addStringColumn(ItmSub3Cols.$o_bp_itm_cd);
		result.addStringColumn(ItmSub3Cols.$o_bp_itm_nm);
		result.addStringColumn(ItmSub3Cols.$o_cont_fctr_unit_nm);

		// Select句、結合の設定
		builder.addSelect(unit.unit_nm);
		builder.addSelect(fctr_unit.unit_nm.as("cont_fctr_unit_nm"));
		builder.addSelect(itypd.itm_typ_d_nm);
		builder.addLeftOuterJoin(unit,
				unit.unit_cd.eq(t.unit_cd));
		builder.addLeftOuterJoin(fctr_unit,
				fctr_unit.unit_cd.eq(t.cont_fctr_unit_cd));
		builder.addLeftOuterJoin(itypd,
				itypd.itm_typ_d_cd.eq(t.itm_typ_d_cd).and(itypd.itm_typ.eq(t.itm_typ)));

		// 枝番は入力補助画面でないため、品目区分詳細、品目分類の情報は結合しない

		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getDateNE(ItmSub3Cols.$i_dt)) && !isNull(row.getStringNE(ItmSub3Cols.$i_bp_cd))) {
			builder.addSelect(bp_itm.bp_itm_cd);
			builder.addSelect(bp_itm.bp_itm_nm);
			builder.addLeftOuterJoin(bp_itm,
					bp_itm.itm_cd.eq(t.itm_cd)
					.and(bp_itm.itm_sub1.eq(t.itm_sub1))
					.and(bp_itm.itm_sub2.eq(t.itm_sub2))
					.and(bp_itm.itm_sub3.eq(t.itm_sub3))
					.and(bp_itm.bp_cd.eq(bind("bp_cd")))
					.and(bind("dt").between(bp_itm.st_dt, bp_itm.end_dt)));
		}
	}

	protected void getItmSub3_addWhereCustom(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// 検索区分の条件
		setItmConditionByItmIsSrchTyp(row, builder, row.getStringNE(ItmSub3Cols.$i_itm_is_srch_typ));

		// リストロジックチェック時は以下の条件は追加しない（共通処理で判定する）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmSub3Cols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmSub3Cols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(ItmSub3Cols.$i_itm_sub2));

		final String R_ON = "release_flg_on";
		final String R_OFF = "release_flg_off";
		if (row.getBooleanNE(R_ON) && row.getBooleanNE(R_OFF)) {
			;
		}
		else if (row.getBooleanNE(R_ON)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
		else if (row.getBooleanNE(R_OFF)) {
			builder.addWhereWithAnd(t.release_flg.eq(value(false)));
		}
		else {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
	}

	@Override
	protected MCList<?> getItmSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder , MAM_ITM__R t, MCList<?> result){
		MCList<?> l = super.getItmSub3_AfterSelect(row, builder, t, result);
		setTypNmForItm(row, builder, l);
		return l;
	}

	public <E extends MCRow> MCList getItmSub3_SrvChk(MCRow inRow, MCList<E> rsltL) {
		final String R_ON = "release_flg_on";
		final String R_OFF = "release_flg_off";
		MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
				// サーバチェックでは両方オン、またはともに指定していない場合のみ考慮
				if (inRow.getBooleanNE(R_ON) && inRow.getBooleanNE(R_OFF)) {
					return true;
				}
				else {
					return row.getBooleanNE("release_flg");
				}
			}
		});
		return subRsltL;
	}

	protected void getItmSub3_NullVal(
			MCRow row, MCList<MCRow> down) {
		if (isSame(row.getStringNE(ItmSub3Cols.$i_itm_cd), MAC_STR.NULL_VAL.value())) {
			MCRow r = down.createRow();
			r.setStringNE(ItmSub3Cols.$o_itm_cd, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub3Cols.$o_itm_sub1, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub3Cols.$o_itm_sub2, MAC_STR.NULL_VAL.value());
			r.setStringNE(ItmSub3Cols.$o_itm_sub3, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	public boolean getItmSub3_IsNullVal(MCRow row) {
		return MAC_STR.isNULL_VAL(row.getStringNE(ItmSub3Cols.$i_itm_cd))
				&& MAC_STR.isNULL_VAL(row.getStringNE(ItmSub3Cols.$i_itm_sub1))
				&& MAC_STR.isNULL_VAL(row.getStringNE(ItmSub3Cols.$i_itm_sub2))
				&& MAC_STR.isNULL_VAL(row.getStringNE(ItmSub3Cols.$o_itm_sub3)); // 第一キーは出力カラムの最初の項目名と同じ
	}

	protected MCMessage getItmSub3_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmSub3Cols.$i_itm_cd),
				row.getStringNE(ItmSub3Cols.$i_itm_sub1),
				row.getStringNE(ItmSub3Cols.$i_itm_sub2),
				row.getStringNE(ItmSub3Cols.$o_itm_sub3));
		MCMessage msg = null;
		String typ = row.getStringNE(ItmSub3Cols.$i_itm_is_srch_typ);

		if (isNull(typ) || MAC_ITM_IS_SRCH_TYP.isCOMM(typ)) {
			msg = new MCMessage(MAUAL0189, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isNOT_ASSET3(typ)) {
			msg = new MCMessage(MAUAL0276, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1(typ)) {
			msg = new MCMessage(MAUAL0277, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK2(typ)) {
			msg = new MCMessage(MAUAL0278, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK3(typ)) {
			msg = new MCMessage(MAUAL0279, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isASSET1(typ)) {
			msg = new MCMessage(MAUAL0280, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isASSET2(typ)) {
			msg = new MCMessage(MAUAL0281, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isASSET3(typ)) {
			msg = new MCMessage(MAUAL0282, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_ASSET1(typ)) {
			msg = new MCMessage(MAUAL0283, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_ASSET2(typ)) {
			msg = new MCMessage(MAUAL0284, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK2_ASSET1(typ)) {
			msg = new MCMessage(MAUAL0285, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK2_ASSET2(typ)) {
			msg = new MCMessage(MAUAL0286, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSUNDRY(typ)) {
			msg = new MCMessage(MAUAL0287, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0288, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isASSET1_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0289, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_ASSET1_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0290, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_ASSET2_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0291, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK2_ASSET1_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0292, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isVER(typ)) {
			msg = new MCMessage(MAUAL0293, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isITM_INSP_PTN(typ)) {
			msg = new MCMessage(MAUAL0294, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSPLN(typ)) {
			msg = new MCMessage(MAUAL0295, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isPAR_ITM_BOM(typ)) {
			msg = new MCMessage(MAUAL0296, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isCOMP_CORE_ITM(typ)) {
			msg = new MCMessage(MAUAL0297, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isNOT_ASSET3_NOT_COMP_SPEC(typ)) {
			msg = new MCMessage(MAUAL0298, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_NOT_COMP_SPEC(typ)) {
			msg = new MCMessage(MAUAL0299, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isPURC_FRCST(typ)) {
			msg = new MCMessage(MAUAL0300, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isITM_INSP_SPEC(typ)) {
			msg = new MCMessage(MAUAL0301, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isLOT(typ)) {
			msg = new MCMessage(MAUAL0302, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isOP(typ)) {
			msg = new MCMessage(MAUAL0303, itmInfo, toDispGUIIndex(causeRow));
		}
		else if (MAC_ITM_IS_SRCH_TYP.isLOT_INH_DEST(typ)) {
			msg = new MCMessage(MAUAL0501, itmInfo, toDispGUIIndex(causeRow));
		}

		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmSub3:枝番３ (END)

	/**
	 * 検索結果に対象カラムの値が重複するレコードが存在している場合、
	 * 対象カラム以外のカラムにnullをセットした上で、重複レコードを１つにまとめたリストを返します。
	 * 重複がないレコードには何もしません。
	 *
	 * @param row 検索条件
	 * @param d DBコンテナ
	 * @param sl 検索結果
	 * @param tarCol 対象カラム（String型データに限る）
	 * @return 検索結果から重複を除いたリスト
	 */
	protected MCList<?> getItm_NoDupList(
			MCRow row, MCList<?> result, MCList sl, String tarCol, String listLogicId) {
		if (sl.size() < 2) {
			return sl;
		}

		// キーカラムセット
		final String[] chkCols = {
				"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3"
		};

		return getItm_NoDupListSub(row, result, sl, tarCol, listLogicId, chkCols);
	}

	protected MCList<?> getItm_NoDupListSub(
			MCRow row, MCList<?> result, MCList sl, String tarCol, String listLogicId, String[] chkCols) {
		// 一時カラムを保持した空のリストを生成
		MCList noDupList = sl.shallowClone();
		noDupList.clear();

		// 前処理
		sl.sort(chkCols);

		MCRow pre = null;
		int diffFirstCol = chkCols.length - 1;
		for (Object o : sl) {
			MCRow sr = (MCRow) o;
			// 対象カラムが重複しているか
			if (pre != null && isSame(pre.getStringNE(tarCol), sr.getStringNE(tarCol))) {
				// キーカラムセットのうち、値が異なる最初のカラムを探索
				// 適切なソートが前提
				for (int i = 0; i < diffFirstCol; i++) {
					if (isSame(pre.getStringNE(chkCols[i]), sr.getStringNE(chkCols[i]))) {
						continue;
					}
					diffFirstCol = i;
					break;
				}
				// 値が重複するカラム(「値が異なる最初のカラム」までのカラム)は値を残す
				pre.clear();
				getItm_CopyUniqueValues(pre, sr, chkCols, diffFirstCol, listLogicId);
			}
			else {
				noDupList.add(sr);
				pre = sr;
				diffFirstCol = chkCols.length - 1;
			}
		}

		// ソートはlistlogicCommon_AfterSelectで実施
		return noDupList;
	}

	/**
	 * 一意に定まる出力項目をコピーします。
	 *
	 * @param dest コピー先
	 * @param src コピー元
	 * @param cols キーカラムセット
	 * @param diffFirstCol 値が異なる最初のカラム
	 * @param listLogicId リストロジックＩＤ
	 */
	protected void getItm_CopyUniqueValues(MCRow dest, MCRow src, String[] chkCols, int diffFirstCol, String listLogicId) {
		if (isNull(dest) || isNull(src)) {
			return;
		}

		// ItmDtlのための比較カラム設定
		// Itmでは全てelseブロックに入る
		final int ITM_SUB3 = 3;
		final int WG_CD = 4;
		String cmpCol = null;
		if (diffFirstCol > WG_CD) {
			// 品目ＷＧマスタの項目をコピー
			cmpCol = "mfg_loc_cd";
		}
		else if (diffFirstCol > ITM_SUB3) {
			// 品目マスタの項目をコピー
			cmpCol = "wg_cd";
		}
		else {
			cmpCol = chkCols[diffFirstCol];
		}

		// リストロジックの項目定義順に依存する処理
		for (String col : MCListLogicUtil.getOutColumns(listLogicId)) {
			if (isSame(col, cmpCol)) {
				return;
			}
			dest.setValuesByName(src, col);
		}
	}

}