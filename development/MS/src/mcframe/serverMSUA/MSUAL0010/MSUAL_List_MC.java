package mcframe.serverMSUA.MSUAL0010;

import static mcframe.commonMS.notice.MS_Msg.MSUAL0007;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.isNull;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;

abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- SpplByLoc:発注先（場所対応） (START)
	@Override
	protected void getSpplByLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		super.getSpplByLoc_Set(row, builder, t, result);
		getSpplByLoc_addSelectJoinCustom(row, builder, t, result);
		getSpplByLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getSpplByLoc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAM_BP_R m1 = MAM_BP_R.create("M1");

		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_LOC_R.$sppl_nm);
		builder.inactiveForeign("BP1");

		// Select句、結合の設定
		builder.addSelectNEActiveForeign(m1.bp_nm.as("sppl_nm"));
		builder.addInnerJoin(m1, bracket(m1.bp_cd.eq(t.sppl_cd)));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSpplByLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.loc_cd.eq(bind("1")),
				row.getStringNE(SpplByLocCols.$i_loc_cd));

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSpplByLoc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SpplByLocCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SpplByLocCols.$o_sppl_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getSpplByLoc_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = new MCMessage(MSUAL0007, row.getStringNE(SpplByLocCols.$i_loc_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- SpplByLoc:発注先（場所対応） (END)
	// -- CstItm:得意先品目 (START)
	@Override
	public MCList<MCRow> getCstItm(MCRow row) {
		if (isInput(row) && (isNull(row.getStringNE(CstItmCols.$i_bp_cd)) || isNull(row.getDateNE(CstItmCols.$i_dt)))) {
			return null;
		}
		MCList<MAM_BP_ITM_R> rslt = MCList.create(MAM_BP_ITM_R.class);
		MAM_BP_ITM_R dbc = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCstItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0010.CstItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0010.CstItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCstItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0010.CstItm");
		if(isNull(down)) return null;
		return getCstItm_SubColumns(row, down);
	}
	
	@Override
	protected void getCstItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		super.getCstItm_Set(row, builder, t, result);
		getCstItm_addSelectJoinCustom(row, builder, t, result);
		getCstItm_addWhereCustom(row, builder, t, result);
	}
	
	protected void getCstItm_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result) {
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_ITM__R m2 = MAM_ITM__R.create("M2");
		MAM_ITM_TYP_D_R m3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_PF_GRP_R m4 = MAM_PF_GRP_R.create("M4");
		
		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(CstItmCols.$o_itm_typ);
		result.addStringColumn(CstItmCols.$o_itm_typ_d_cd);
		result.addStringColumn(CstItmCols.$o_itm_typ_d_nm);
		result.addStringColumn(CstItmCols.$o_stk_mng_typ);
		result.addStringColumn(CstItmCols.$o_asset_mng_typ);
		result.addBooleanColumn(CstItmCols.$o_sundry_itm_flg);
		
		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_BP_ITM_R.$bp_nm);
		builder.inactiveForeign("BP1");
		builder.removeSelect(MAM_BP_ITM_R.$itm_nm);
		builder.inactiveForeign("ITM1");
		builder.removeSelect(MAM_BP_ITM_R.$pf_grp_nm);
		builder.inactiveForeign("PF_GRP1");
		
		// Select句、結合の設定
		builder.addSelect(m2.itm_typ);
		builder.addSelect(m2.itm_typ_d_cd);
		builder.addSelect(m2.stk_mng_typ);
		builder.addSelect(m2.asset_mng_typ);
		builder.addSelect(m2.sundry_itm_flg);
		builder.addSelect(m3.itm_typ_d_nm);
		builder.addSelectNEActiveForeign(m1.bp_nm);
		builder.addSelectNEActiveForeign(m2.itm_nm);
		builder.addSelectNEActiveForeign(m4.pf_grp_nm);
		builder.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t.bp_cd)));
		builder.addLeftOuterJoin(m2,
				bracket(m2.itm_cd.eq(t.itm_cd)
						.and(m2.itm_sub1.eq(t.itm_sub1))
						.and(m2.itm_sub2.eq(t.itm_sub2))
						.and(m2.itm_sub3.eq(t.itm_sub3))));
		builder.addLeftOuterJoin(m3,
				bracket(m3.itm_typ.eq(m2.itm_typ)
						.and(m3.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
		builder.addLeftOuterJoin(m4, bracket(m4.pf_grp_cd.eq(t.pf_grp_cd)));
				
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}
	
	protected void getCstItm_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result) {
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_ITM__R m2 = MAM_ITM__R.create("M2");
		
		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.del_flg.eq(value(false)));
		builder.addWhereWithAnd(m1.cst_flg.eq(value(true)));
		builder.addWhereWithAnd(m2.release_flg.eq(value(true)));
		
		// 得意先、適用日が入力されてる場合に条件追加
		String bpCd = row.getStringNE(CstItmCols.$i_bp_cd);
		MCDate dt = row.getDateNE(CstItmCols.$i_dt);
		
		if (!isNull(bpCd)) {
			builder.addWhereWithAnd(t.bp_cd.eq(bind("1")), row.getStringNE(CstItmCols.$i_bp_cd));
		}
		if (!isNull(dt)) {
			builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)), row.getDateNE(CstItmCols.$i_dt));
		}
		
		// 検索区分が追加されている場合に条件追加
		String cstItmIsSrchTyp = row.getStringNE(CstItmCols.$i_cst_itm_is_srch_typ);
		if (!isNull(cstItmIsSrchTyp)) {
			if (MAC_ITM_IS_SRCH_TYP.isSTK1(cstItmIsSrchTyp)) {
				builder.addWhereWithAnd(m2.stk_mng_typ.eq(value("1")));
			}
			else if (MAC_ITM_IS_SRCH_TYP.isSTK2(cstItmIsSrchTyp)) {
				builder.addWhereWithAnd(m2.stk_mng_typ.eq(value("2")));
			}
			else if (MAC_ITM_IS_SRCH_TYP.isNOT_ASSET3_NOT_COMP_SPEC(cstItmIsSrchTyp)) {
				builder.addWhereWithAnd(m2.comp_spec_typ.neq(value("2")));
			}
		}
		
		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		// なし
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		MAM_ITM_TYP_D_R m3 = MAM_ITM_TYP_D_R.create("M3");
		
		builder.addWhereWithCutOffAnd(m1.bp_nm.like(bind("1")),
				getEditString(row, CstItmCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.bp_itm_cd.like(bind("1")),
				getEditString(row, CstItmCols.$i_bp_itm_cd));
		builder.addWhereWithCutOffAnd(t.bp_itm_nm.like(bind("1")),
				getEditString(row, CstItmCols.$i_bp_itm_nm));
		builder.addWhereWithCutOffAnd(m2.itm_cd.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_cd));
		builder.addWhereWithCutOffAnd(m2.itm_sub1.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_sub1));
		builder.addWhereWithCutOffAnd(m2.itm_sub2.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_sub2));
		builder.addWhereWithCutOffAnd(m2.itm_sub3.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_sub3));
		builder.addWhereWithCutOffAnd(m2.itm_nm.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_nm));
		builder.addWhereWithCutOffAnd(m2.itm_typ.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_typ));
		builder.addWhereWithCutOffAnd(m2.itm_typ_d_cd.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_typ_d_cd));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_nm.like(bind("1")),
				getEditString(row, CstItmCols.$i_itm_typ_d_nm));
		
		boolean sundryItmFlgOn = row.getBooleanNE(CstItmCols.$i_sundry_itm_flg_on);
		boolean sundryItmFlgOff = row.getBooleanNE(CstItmCols.$i_sundry_itm_flg_off);
		
		if (sundryItmFlgOn && !sundryItmFlgOff) {
			builder.addWhereWithCutOffAnd(m2.sundry_itm_flg.eq(value(true)));
		}
		else if (!sundryItmFlgOn && sundryItmFlgOff) {
			builder.addWhereWithCutOffAnd(m2.sundry_itm_flg.eq(value(false)));
		}
		
		builder.addWhereWithCutOffAnd(m2.stk_mng_typ.like(bind("1")),
				getEditString(row, CstItmCols.$i_stk_mng_typ));
		builder.addWhereWithCutOffAnd(m2.asset_mng_typ.like(bind("1")),
				getEditString(row, CstItmCols.$i_asset_mng_typ));
	}
	
	@Override
	protected MCList<?> getCstItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		MCList<?> l = super.getCstItm_AfterSelect(row, builder, t, result);
		// 直接入力時
		if (isInput(row) && l.size() > 1) {
			MCSortPolicy sp = crtSortVH();
			l.sort(sp);
		}
		
		// 品目区分名、在庫管理区分名、資産管理区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		
		return l;
	}
	
	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.DESC, "def_flg");
		sp.add(SortType.ASC_NULL_AHEAD, "itm_cd");
		sp.add(SortType.ASC_NULL_AHEAD, "itm_sub1");
		sp.add(SortType.ASC_NULL_AHEAD, "itm_sub2");
		sp.add(SortType.ASC_NULL_AHEAD, "itm_sub3");
		return sp;
	}
	// -- CstItm:得意先品目 (END)

}