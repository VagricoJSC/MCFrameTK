package mcframe.serverMAUA.MAUAL0010;

import java.util.ArrayList;
import java.util.List;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCForeignInfo;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import mcframe.serverMA.dbc.*;
import static mcframe.commonCore.lang.MCBooleanUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonCore.lang.MCStringUtil.nullToBlank;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

// abstract public class MAUAL_List_MC extends MAUAL_List_MC_A {
abstract public class MAUAL_List_MC extends MAUAL_ListLoc_MC {

	// -- Tax:税 (START)
	@Override
	protected void getTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t,
			MCList<?> result) {
		super.getTax_Set(row, builder, t, result);

		for (String col : new String[] {
				TaxCols.$i_inc_tax_flg, TaxCols.$i_sls_flg, TaxCols.$i_purc_flg,
				TaxCols.$i_prov_flg
		}) {
			if (row.contains(col)) {
				builder.addWhereWithAnd(
						MCQueryApiBuilder.makeEq(t.getColumn$(col), bind("1")),
						booleanToDBString(row.getBooleanNE(col)));
			}
		}
	}

	protected MCMessage getTax_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String[] msgBind = {
				TaxCols.$i_inc_tax_flg, TaxCols.$i_sls_flg, TaxCols.$i_purc_flg,
				TaxCols.$i_prov_flg
		};
		int count = 0;
		for (int i = 0; i < msgBind.length; i++) {
			if (row.contains(msgBind[i])) {
				msgBind[i] = row.getBoolean(msgBind[i]) ? MAC_STR.MSG_FLG_ON.name()
						: MAC_STR.MSG_FLG_OFF.name();
			}
			else {
				msgBind[i] = null;
				count++;
			}
		}
		MCMessage msg = null;
		if (count < 4) {
			msg = new MCMessage(MAUAL0323, msgBind[0], msgBind[1], msgBind[2], msgBind[3],
					info);
		}
		else {
			msg = new MCMessage(MAUAL0121, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- Tax:税 (END)
	// -- SlsTax:売上税 (START)
	@Override
	protected void getSlsTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t,
			MCList<?> result) {
		super.getSlsTax_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_flg.eq(value(true)));
	}

	// -- SlsTax:売上税 (END)
	// -- PurcTax:仕入税 (START)
	@Override
	protected void getPurcTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t,
			MCList<?> result) {
		super.getPurcTax_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.purc_flg.eq(value(true)));
	}

	// -- PrucTax:仕入税 (END)
	// -- ProvTax:支給税 (START)
	@Override
	protected void getProvTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t,
			MCList<?> result) {
		super.getProvTax_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.prov_flg.eq(value(true)));
		if(row.getBooleanNE(ProvTaxCols.$i_repurc_obli_flg)) {
			builder.addWhereWithAnd(
					MCQueryApiBuilder.makeNeq(t.tax_typ, bind("1")),
					MAC_TAX_TYP.TAX_ABL.value());
		}
	}
	public <E extends MCRow> MCList getProvTax_SrvChk(MCRow inRow, MCList<E> rsltL) {
		boolean repurcObliFlg = inRow.getBooleanNE(ProvTaxCols.$i_repurc_obli_flg);
		MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
				return repurcObliFlg ? !MAC_TAX_TYP.isTAX_ABL(row.getStringNE(ProvTaxCols.$o_tax_typ)) : true;
			}
		});
		return subRsltL;

	}
	protected MCMessage getProvTax_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if(row.getBooleanNE(ProvTaxCols.$i_repurc_obli_flg)) {
			msg = new MCMessage(MAUAL0601, info);
		}else {
			msg = new MCMessage(MAUAL0079, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ProvTax:支給税 (END)
	// -- AcSubtypem:予備科目区分 (START)
	@Override
	protected void getAcSubtypem_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		super.getAcSubtypem_Set(row, builder, t, result);
		if (row.contains(AcSubtypemCols.$i_ac_subtyp)) {
			builder.addWhereWithAnd(t.ac_subtyp.eq(bind("1")),
					row.getStringNE(AcSubtypemCols.$i_ac_subtyp));
		}
	}

	protected MCMessage getAcSubtypem_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0006,
				row.getStringNE(AcSubtypemCols.$i_ac_subtyp), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AcSubtypem:予備科目区分 (END)
	// -- SubAccount:補助勘定科目 (START)
	@Override
	protected void getSubAccount_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_SUB_ACCOUNT_R t, MCList<?> result) {
		super.getSubAccount_Set(row, builder, t, result);
		if (row.contains(SubAccountCols.$i_ac_cd)) {
			builder.addWhereWithAnd(t.ac_cd.eq(bind("1")),
					row.getStringNE(SubAccountCols.$i_ac_cd));
		}
	}

	protected MCMessage getSubAccount_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0009, row.getStringNE(SubAccountCols.$i_ac_cd),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SubAccount:補助勘定科目 (END)
	// -- AllocGrp:総量引当場所グループ (START)
	@Override
	protected void getAllocGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALLOC_GRP_R t, MCList<?> result) {
		MAVM_RD_ALLOC_GRP_R rd = MAVM_RD_ALLOC_GRP_R.create("RD");
		MAVM_WR_ALLOC_GRP_R wr = MAVM_WR_ALLOC_GRP_R.create("WR");

		super.getAllocGrp_Set(row, builder, t, result);
		// DAC対応
		if (row.getBooleanNE(AllocGrpCols.$i_rd_flg)) {
			builder.addInnerJoin(rd, bracket(rd.alloc_grp_cd.eq(t.alloc_grp_cd)));
		}
		if (row.getBooleanNE(AllocGrpCols.$i_wr_flg)) {
			builder.addInnerJoin(wr, bracket(wr.alloc_grp_cd.eq(t.alloc_grp_cd)));
		}
	}

	protected void getAllocGrp_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(AllocGrpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(AllocGrpCols.$o_alloc_grp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- AllocGrp:総量引当場所グループ (END)
	// -- BankBranch:銀行支店 (START)
	@Override
	protected void getBankBranch_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BANK_BRANCH_R t, MCList<?> result) {
		super.getBankBranch_Set(row, builder, t, result);
		if (row.contains(BankBranchCols.$i_bank_cd)) {
			builder.addWhereWithAnd(t.bank_cd.eq(bind("1")),
					row.getStringNE(BankBranchCols.$i_bank_cd));
		}
	}

	protected MCMessage getBankBranch_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0002,
				row.getStringNE(BankBranchCols.$i_bank_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- BankBranch:銀行支店 (END)
	// -- Unit:単位 (START)
	@Override
	protected void getUnit_Set(MCRow row, MCQueryApiBuilder builder, MAM_UNIT_R t,
			MCList<?> result) {
		MAM_UNIT_CONV_R m1 = MAM_UNIT_CONV_R.create("M1");

		super.getUnit_Set(row, builder, t, result);
		result.addNumberColumn(UnitCols.$o_conv_base_qty);
		result.addNumberColumn(UnitCols.$o_conv_qty);
		if (!isSrvChk(row) && !isNull(row.getStringNE(UnitCols.$i_base_unit_cd))) {
			builder.addSelect(m1.qty.as("conv_base_qty"));
			builder.addSelect(m1.conv_qty);
			builder.addLeftOuterJoin(m1, bracket(m1.unit_cd.eq(t.unit_cd)
					.and(m1.base_unit_cd.eq(bind("base_unit_cd")))));
		}
	}

	// -- Unit:単位 (END)
	// -- ItmGrp:品目分類 (START)
	@Override
	protected void getItmGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp_Set(row, builder, t, result);
		if (row.contains(ItmGrpCols.$i_itm_grp_typ)) {
			builder.addWhereWithAnd(t.itm_grp_typ.eq(bind("1")),
					row.getStringNE(ItmGrpCols.$i_itm_grp_typ));
		}
	}

	protected MCMessage getItmGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0032,
				row.getStringNE(ItmGrpCols.$i_itm_grp_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmGrp:品目分類 (END)
	// -- Oper:工程 (START)
	protected void getOper_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(OperCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(OperCols.$o_oper_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- Oper:工程 (END)
	// -- BpGrp:取引先分類 (START)
	@Override
	protected void getBpGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp_Set(row, builder, t, result);
		if (row.contains(BpGrpCols.$i_bp_grp_typ)) {
			builder.addWhereWithAnd(t.bp_grp_typ.eq(bind("1")),
					row.getStringNE(BpGrpCols.$i_bp_grp_typ));
		}
	}

	protected MCMessage getBpGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0038, row.getStringNE(BpGrpCols.$i_bp_grp_typ),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- BpGrp:取引先分類 (END)
	// -- Tterm:取引条件 (START)
	@Override
	protected void getTterm_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t,
			MCList<?> result) {
		super.getTterm_Set(row, builder, t, result);
		if (row.contains(TtermCols.$i_tterm_typ)) {
			builder.addWhereWithAnd(t.tterm_typ.eq(bind("1")),
					row.getStringNE(TtermCols.$i_tterm_typ));
		}
	}

	protected MCMessage getTterm_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0039, row.getStringNE(TtermCols.$i_tterm_typ),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- Tterm:取引条件 (END)
	// -- Trd:取引 (START)
	@Override
	protected void getTrd_Set(MCRow row, MCQueryApiBuilder builder, MAM_TRD_R t,
			MCList<?> result) {
		super.getTrd_Set(row, builder, t, result);
		getTrd_addSelectJoinCustom(row, builder, t, result);
		getTrd_addWhereCustom(row, builder, t, result);
	}

	protected void getTrd_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_TRD_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

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

	protected void getTrd_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_TRD_R t, MCList<?> result) {
		MAC_TRD_PTN_CTL_R S1TPC = MAC_TRD_PTN_CTL_R.create("TPC");

		// 固定条件（行ごとに条件値が同じ条件）
		if (isNull(row.getStringNE(TrdCols.$i_trd_ptn_typ))
				&& !isNull(row.getStringNE(TrdCols.$i_func_id))) {
			builder.addWhereWithAnd(exists(subQuery().select(S1TPC.prAll()).from(S1TPC)
					.where(value(0).eq(value(0)).and(S1TPC.trd_ptn_typ.eq(t.trd_ptn_typ))
							.and(S1TPC.func_id.eq(bind("1"))))),
					row.getStringNE(TrdCols.$i_func_id));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (isNull(row.getStringNE(TrdCols.$i_trd_ptn_typ))) {
		}
		else {
			builder.addWhereWithAnd(t.trd_ptn_typ.eq(bind("1")),
					row.getStringNE(TrdCols.$i_trd_ptn_typ));
		}
	}

	protected MCMessage getTrd_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0046, row.getStringNE(TrdCols.$i_trd_ptn_typ),
				row.getStringNE(TrdCols.$i_func_id), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- Trd:取引 (END)
	// -- Wg:ＷＧ (START)
	@Override
	protected void getWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getWg_Set(row, builder, t, result);
		// DAC対応
		if (row.getBooleanNE(WgCols.$i_rd_flg)) {
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(WgCols.$i_wr_flg)) {
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(WgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(WgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- Wg:ＷＧ (END)
	// -- Site:工場・物流倉庫 (START)
	@Override
	protected void getSite_Set(MCRow row, MCQueryApiBuilder builder, MAM_SITE_R t,
			MCList<?> result) {
		super.getSite_Set(row, builder, t, result);
		getSite_addSelectJoinCustom(row, builder, t, result);
		getSite_addWhereCustom(row, builder, t, result);
	}

	protected void getSite_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SITE_R t, MCList<?> result) {

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

	protected void getSite_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SITE_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
	}

	protected void getSite_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SiteCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SiteCols.$o_site_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- Site:工場・物流倉庫 (END)
	// -- StrLn:棚・ライン(START)
	@Override
	protected void getStrLn_Set(MCRow row, MCQueryApiBuilder builder, MAM_STR_LN_R t,
			MCList<?> result) {
		super.getStrLn_Set(row, builder, t, result);
		if (row.contains(StrLnCols.$i_loc_cd)) {
			builder.addWhereWithAnd(t.loc_cd.eq(bind("1")),
					row.getStringNE(StrLnCols.$i_loc_cd));
		}
	}

	protected void getStrLn_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(StrLnCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(StrLnCols.$o_str_ln_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getStrLn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0058, row.getStringNE(StrLnCols.$i_loc_cd),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- StrLn:棚・ライン(END)
	// -- ItmTypD:品目区分詳細(START)
	@Override
	protected void getItmTypD_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_TYP_D_R t,
			MCList<?> result) {
		super.getItmTypD_Set(row, builder, t, result);
		if (row.contains(ItmTypDCols.$i_itm_typ)) {
			builder.addWhereWithAnd(t.itm_typ.eq(bind("1")),
					row.getStringNE(ItmTypDCols.$i_itm_typ));
		}
		if (row.contains(ItmTypDCols.$i_itm_typ_d_cd)) {
			builder.addWhereWithAnd(t.itm_typ_d_cd.eq(bind("1")),
					row.getStringNE(ItmTypDCols.$i_itm_typ_d_cd));
		}
	}

	protected MCMessage getItmTypD_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0059, row.getStringNE(ItmTypDCols.$i_itm_typ),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmTypD:品目区分詳細(END)
	// -- SpecDesc:仕様項目(START)
	@Override
	protected void getSpecDesc_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_SPEC_DESC_R t, MCList<?> result) {
		super.getSpecDesc_Set(row, builder, t, result);
		if (row.contains(SpecDescCols.$i_spec_cd)) {
			builder.addWhereWithAnd(t.spec_cd.eq(bind("1")),
					row.getStringNE(SpecDescCols.$i_spec_cd));
		}
	}

	protected MCMessage getSpecDesc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0061, row.getStringNE(SpecDescCols.$i_spec_cd),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SpecDesc:仕様項目(END)
	// -- NumPtn:発番パタン(START)
	@Override
	protected void getNumPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_NUM_PTN_R t,
			MCList<?> result) {
		super.getNumPtn_Set(row, builder, t, result);
		getNumPtn_addSelectJoinCustom(row, builder, t, result);
		getNumPtn_addWhereCustom(row, builder, t, result);
	}

	protected void getNumPtn_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_NUM_PTN_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		// なし

		// Select句、結合の設定
		// なし
	}

	protected void getNumPtn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_NUM_PTN_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		if (row.contains(NumPtnCols.$i_num_biz_typ)) {
			builder.addWhereWithAnd(t.num_biz_typ.eq(bind("1")),
					row.getStringNE(NumPtnCols.$i_num_biz_typ));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		// なし
	}

	protected MCMessage getNumPtn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0068,
				row.getStringNE(NumPtnCols.$i_num_biz_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- NumPtn:発番パタン(END)
	// -- Account:勘定科目(START)
	@Override
	protected void getAccount_Set(MCRow row, MCQueryApiBuilder builder, MAM_ACCOUNT_R t,
			MCList<?> result) {
		super.getAccount_Set(row, builder, t, result);
		getAccount_addSelectJoinCustom(row, builder, t, result);
		getAccount_addWhereCustom(row, builder, t, result);
	}

	protected void getAccount_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_ACCOUNT_R t, MCList<?> result) {
		MAM_AC_SUBTYPEM_R ap_typ = MAM_AC_SUBTYPEM_R.create("AP_TYP");
		MAM_AC_SUBTYPEM_R ar_typ = MAM_AC_SUBTYPEM_R.create("AR_TYP");
		MAM_AC_SUBTYPEM_R ac_typ1 = MAM_AC_SUBTYPEM_R.create("AC_TYP1");
		MAM_AC_SUBTYPEM_R ac_typ2 = MAM_AC_SUBTYPEM_R.create("AC_TYP2");
		MAM_AC_SUBTYPEM_R ac_typ3 = MAM_AC_SUBTYPEM_R.create("AC_TYP3");
		MAM_AC_SUBTYPEM_R ac_typ4 = MAM_AC_SUBTYPEM_R.create("AC_TYP4");
		MAM_AC_SUBTYPEM_R ac_typ5 = MAM_AC_SUBTYPEM_R.create("AC_TYP5");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(AccountCols.$o_ap_typ_nm);
		result.addStringColumn(AccountCols.$o_ar_typ_nm);
		result.addStringColumn(AccountCols.$o_ac_typ_nm1);
		result.addStringColumn(AccountCols.$o_ac_typ_nm2);
		result.addStringColumn(AccountCols.$o_ac_typ_nm3);
		result.addStringColumn(AccountCols.$o_ac_typ_nm4);
		result.addStringColumn(AccountCols.$o_ac_typ_nm5);

		// Select句、結合の設定
		builder.addSelect(ap_typ.ac_typ_nm.as("ap_typ_nm"));
		builder.addSelect(ar_typ.ac_typ_nm.as("ar_typ_nm"));
		builder.addSelect(ac_typ1.ac_typ_nm.as("ac_typ_nm1"));
		builder.addSelect(ac_typ2.ac_typ_nm.as("ac_typ_nm2"));
		builder.addSelect(ac_typ3.ac_typ_nm.as("ac_typ_nm3"));
		builder.addSelect(ac_typ4.ac_typ_nm.as("ac_typ_nm4"));
		builder.addSelect(ac_typ5.ac_typ_nm.as("ac_typ_nm5"));

		builder.addLeftOuterJoin(ap_typ, bracket(ap_typ.ac_typ.eq(t.ap_typ)
				.and(ap_typ.ac_subtyp.eq(value(MAC_AC_SUBTYP.AP.value())))));
		builder.addLeftOuterJoin(ar_typ, bracket(ar_typ.ac_typ.eq(t.ar_typ)
				.and(ar_typ.ac_subtyp.eq(value(MAC_AC_SUBTYP.AR.value())))));
		builder.addLeftOuterJoin(ac_typ1, bracket(ac_typ1.ac_typ.eq(t.ac_typ1)
				.and(ac_typ1.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB1.value())))));
		builder.addLeftOuterJoin(ac_typ2, bracket(ac_typ2.ac_typ.eq(t.ac_typ2)
				.and(ac_typ2.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB2.value())))));
		builder.addLeftOuterJoin(ac_typ3, bracket(ac_typ3.ac_typ.eq(t.ac_typ3)
				.and(ac_typ3.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB3.value())))));
		builder.addLeftOuterJoin(ac_typ4, bracket(ac_typ4.ac_typ.eq(t.ac_typ4)
				.and(ac_typ4.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB4.value())))));
		builder.addLeftOuterJoin(ac_typ5, bracket(ac_typ5.ac_typ.eq(t.ac_typ5)
				.and(ac_typ5.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB5.value())))));

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

	protected void getAccount_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_ACCOUNT_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		if (row.getBooleanNE(AccountCols.$i_sub_flg)) {
			builder.addWhereWithAnd(t.sub_flg.eq(value(true)));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
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
		builder.addWhereWithCutOffAnd(t.ac_cd.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_cd));
		builder.addWhereWithCutOffAnd(t.ac_nm.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_nm));
		builder.addWhereWithCutOffAnd(t.ac_nm2.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_nm2));
		builder.addWhereWithCutOffAnd(t.dc_typ.like(bind("1")),
				getEditString(row, AccountCols.$i_dc_typ));
		builder.addWhereWithCutOffAnd(t.ac_typ.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ));
		builder.addWhereWithCutOffAnd(t.ac_tax_cd.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_tax_cd));
		builder.addWhereWithCutOffAnd(MCQueryApiBuilder
				.makeLike(t.getColumn$(MAM_ACCOUNT_R.$ac_tax_nm), bind("1")),
				getEditString(row, AccountCols.$i_ac_tax_nm));
		builder.addWhereWithCutOffAnd(t.ap_typ.like(bind("1")),
				getEditString(row, AccountCols.$i_ap_typ));
		builder.addWhereWithCutOffAnd(t.ar_typ.like(bind("1")),
				getEditString(row, AccountCols.$i_ar_typ));
		builder.addWhereWithCutOffAnd(t.ac_typ1.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ1));
		builder.addWhereWithCutOffAnd(t.ac_typ2.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ2));
		builder.addWhereWithCutOffAnd(t.ac_typ3.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ3));
		builder.addWhereWithCutOffAnd(t.ac_typ4.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ4));
		builder.addWhereWithCutOffAnd(t.ac_typ5.like(bind("1")),
				getEditString(row, AccountCols.$i_ac_typ5));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, AccountCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, AccountCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, AccountCols.$i_memo3));
	}

	@Override
	protected MCList<?> getAccount_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_ACCOUNT_R t, MCList<?> result) {
		MCList<?> l = super.getAccount_AfterSelect(row, builder, t, result);
		// 区分名の設定
		l.addStringColumn(MAC_DC_TYP.$NAME);
		l.addStringColumn(MAC_AC_TYP.$NAME);
		MAC_DC_TYP.putNameNE(l, MAC_DC_TYP.$VALUE, MAC_DC_TYP.$NAME);
		MAC_AC_TYP.putNameNE(l, MAC_AC_TYP.$VALUE, MAC_AC_TYP.$NAME);
		return l;
	}

	// -- Account:勘定科目(END)
	// -- AcSubTyp:科目区分値 (START)
	@Override
	protected void getAcSubtyp1_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.SUB1, AcSubtyp1Cols.outAll(), builder);
	}

	@Override
	protected void getAcSubtyp2_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.SUB2, AcSubtyp2Cols.outAll(), builder);
	}

	@Override
	protected void getAcSubtyp3_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.SUB3, AcSubtyp3Cols.outAll(), builder);
	}

	@Override
	protected void getAcSubtyp4_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.SUB4, AcSubtyp4Cols.outAll(), builder);
	}

	@Override
	protected void getAcSubtyp5_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.SUB5, AcSubtyp5Cols.outAll(), builder);
	}

	@Override
	protected void getApSubtyp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.AP, ApSubtypCols.outAll(), builder);
	}

	@Override
	protected void getArSubtyp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_SUBTYPEM_R t, MCList<?> result) {
		setAcTyp_SubTyp(row, MAC_AC_SUBTYP.AR, ArSubtypCols.outAll(), builder);
	}

	// -- AcSubTyp:科目区分値 (END)
	// -- JnlPtnSeq:自動仕訳パタン（連番） (START)
	// 数値項目
	@Override
	protected void getJnlPtnSeq_Set(MCRow row, MCQueryApiBuilder builder, MAM_JNL_PTN_R t,
			MCList<?> result) {
		super.getJnlPtnSeq_Set(row, builder, t, result);
		if (row.contains(JnlPtnSeqCols.$i_jnl_ptn_cd)) {
			builder.addWhereWithAnd(t.jnl_ptn_cd.eq(bind("1")),
					row.getStringNE(JnlPtnSeqCols.$i_jnl_ptn_cd));
		}
	}

	protected MCMessage getJnlPtnSeq_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0120,
				row.getStringNE(JnlPtnSeqCols.$i_jnl_ptn_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- JnlPtnSeq:自動仕訳パタン（連番） (END)
	// -- CostIoConf:受払項目 (START)
	@Override
	protected void getCostIoConf_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_IO_CONF_R t, MCList<?> result) {
		super.getCostIoConf_Set(row, builder, t, result);
		builder.addWhereWithCutOffAnd(t.cost_io_id.eq(bind("1")),
				row.getNumberNE(CostIoConfCols.$i_cost_io_id));
		String tgt = row.getStringNE(CostIoConfCols.$i_io_tgt_val);
		String slip = row.getStringNE(CostIoConfCols.$i_ac_slip_val);
		String rsn = row.getStringNE(CostIoConfCols.$i_ac_rsn_val);
		if (!isNullAnd(tgt, slip, rsn)) {
			builder.addWhereWithAnd(t.io_sml_typ.in(bind("1"), bind("2"), bind("3")), tgt,
					slip, rsn);
		}
	}

	protected MCMessage getCostIoConf_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String valstring = "";
		if (!isNull(row.getStringNE(CostIoConfCols.$i_io_tgt_val))) {
			valstring = valstring + row.getStringNE(CostIoConfCols.$i_io_tgt_val);
		}
		if (!isNull(row.getStringNE(CostIoConfCols.$i_ac_slip_val))) {
			if (valstring.length() != 0) {
				valstring = valstring + ",";
			}
			valstring = valstring + row.getStringNE(CostIoConfCols.$i_ac_slip_val);
		}
		if (!isNull(row.getStringNE(CostIoConfCols.$i_ac_rsn_val))) {
			if (valstring.length() != 0) {
				valstring = valstring + ",";
			}
			valstring = valstring + row.getStringNE(CostIoConfCols.$i_ac_rsn_val);
		}
		if (valstring.length() == 0) {
			valstring = " ";
		}
		MCMessage msg = new MCMessage(MAUAL0119,
				row.getNumberNE(CostIoConfCols.$i_cost_io_id), valstring, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- CostIoConf:受払項目 (END)
	// -- Expns:原価費目 (START)
	@Override
	protected void getExpns_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_R t,
			MCList<?> result) {
		super.getExpns_Set(row, builder, t, result);
		getExpns_addSelectJoinCustom(row, builder, t, result);
		getExpns_addWhereCustom(row, builder, t, result);
	}

	protected void getExpns_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_EXPNS_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_EXPNS_R.$grp_seq);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 固定のSelect句、結合の設定
	}

	protected void getExpns_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_EXPNS_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithCutOffAnd(t.expns_typ.eq(bind("1")),
				row.getStringNE(ExpnsCols.$i_expns_typ));
		builder.addWhereWithCutOffAnd(t.direct_typ.eq(bind("1")),
				row.getStringNE(ExpnsCols.$i_direct_typ));
		builder.addWhereWithCutOffAnd(t.var_typ.eq(bind("1")),
				row.getStringNE(ExpnsCols.$i_var_typ));
		builder.addWhereWithCutOffAnd(t.expns_grp_cd.eq(bind("1")),
				row.getStringNE(ExpnsCols.$i_expns_grp_cd));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件
	}

	protected MCMessage getExpns_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(ExpnsCols.$i_expns_typ))
				&& (isNull(row.getStringNE(ExpnsCols.$i_direct_typ)))
				&& (isNull(row.getStringNE(ExpnsCols.$i_var_typ)))) {
			msg = new MCMessage(MAUAL0053, info);
		}
		else {
			msg = new MCMessage(MAUAL0329, row.getStringNE(ExpnsCols.$i_expns_typ),
					row.getStringNE(ExpnsCols.$i_direct_typ),
					row.getStringNE(ExpnsCols.$i_var_typ),
					row.getStringNE(ExpnsCols.$i_expns_grp_cd), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- Expns:原価費目 (END)
	// -- ItmGrp1:品目分類（品目分類区分１） (START)
	@Override
	protected void getItmGrp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp1_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())));
	}

	// -- ItmGrp1:品目分類（品目分類区分１） (END)
	// -- ItmGrp2:品目分類（品目分類区分２） (START)
	@Override
	protected void getItmGrp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp2_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())));
	}

	// -- ItmGrp2:品目分類（品目分類区分２） (END)
	// -- ItmGrp3:品目分類（品目分類区分３） (START)
	@Override
	protected void getItmGrp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp3_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())));
	}

	// -- ItmGrp3:品目分類（品目分類区分３） (END)
	// -- ItmGrp4:品目分類（品目分類区分４） (START)
	@Override
	protected void getItmGrp4_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp4_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())));
	}

	// -- ItmGrp4:品目分類（品目分類区分４） (END)
	// -- ItmGrp5:品目分類（品目分類区分５） (START)
	@Override
	protected void getItmGrp5_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp5_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())));
	}

	// -- ItmGrp5:品目分類（品目分類区分５） (END)
	// -- ItmGrp6:品目分類（品目分類区分６） (START)
	@Override
	protected void getItmGrp6_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp6_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())));
	}

	// -- ItmGrp6:品目分類（品目分類区分６） (END)
	// -- ItmGrp7:品目分類（品目分類区分７） (START)
	@Override
	protected void getItmGrp7_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp7_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())));
	}

	// -- ItmGrp7:品目分類（品目分類区分７） (END)
	// -- ItmGrp8:品目分類（品目分類区分８） (START)
	@Override
	protected void getItmGrp8_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp8_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())));
	}

	// -- ItmGrp8:品目分類（品目分類区分８） (END)
	// -- ItmGrp9:品目分類（品目分類区分９） (START)
	@Override
	protected void getItmGrp9_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp9_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())));
	}

	// -- ItmGrp9:品目分類（品目分類区分９） (END)
	// -- ItmGrp10:品目分類（品目分類区分１０） (START)
	@Override
	protected void getItmGrp10_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t,
			MCList<?> result) {
		super.getItmGrp10_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())));
	}

	// -- ItmGrp10:品目分類（品目分類区分１０） (END)
	// -- BpGrp1:取引先分類（取引先分類区分１） (START)
	@Override
	protected void getBpGrp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp1_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value())));
	}

	// -- BpGrp1:取引先分類（取引先分類区分１） (END)
	// -- BpGrp2:取引先分類（取引先分類区分２） (START)
	@Override
	protected void getBpGrp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp2_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value())));
	}

	// -- BpGrp2:取引先分類（取引先分類区分２） (END)
	// -- BpGrp3:取引先分類（取引先分類区分３） (START)
	@Override
	protected void getBpGrp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp3_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value())));
	}

	// -- BpGrp3:取引先分類（取引先分類区分３） (END)
	// -- BpGrp4:取引先分類（取引先分類区分４） (START)
	@Override
	protected void getBpGrp4_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp4_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value())));
	}

	// -- BpGrp4:取引先分類（取引先分類区分４） (END)
	// -- BpGrp5:取引先分類（取引先分類区分５） (START)
	@Override
	protected void getBpGrp5_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp5_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value())));
	}

	// -- BpGrp5:取引先分類（取引先分類区分５） (END)
	// -- BpGrp6:取引先分類（取引先分類区分６） (START)
	@Override
	protected void getBpGrp6_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp6_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value())));
	}

	// -- BpGrp6:取引先分類（取引先分類区分６） (END)
	// -- BpGrp7:取引先分類（取引先分類区分７） (START)
	@Override
	protected void getBpGrp7_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp7_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value())));
	}

	// -- BpGrp7:取引先分類（取引先分類区分７） (END)
	// -- BpGrp8:取引先分類（取引先分類区分８） (START)
	@Override
	protected void getBpGrp8_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp8_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value())));
	}

	// -- BpGrp8:取引先分類（取引先分類区分８） (END)
	// -- BpGrp9:取引先分類（取引先分類区分９） (START)
	@Override
	protected void getBpGrp9_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp9_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value())));
	}

	// -- BpGrp9:取引先分類（取引先分類区分９） (END)
	// -- BpGrp10:取引先分類（取引先分類区分１０） (START)
	@Override
	protected void getBpGrp10_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t,
			MCList<?> result) {
		super.getBpGrp10_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value())));
	}

	// -- BpGrp10:取引先分類（取引先分類区分１０） (END)
	// -- Usr:担当者(START)
	@Override
	protected void getUsr_Set(MCRow row, MCQueryApiBuilder builder, MAM_USR_R t,
			MCList<?> result) {
		super.getUsr_Set(row, builder, t, result);
		getUsr_addSelectJoinCustom(row, builder, t, result);
		getUsr_addWhereCustom(row, builder, t, result);
	}

	protected void getUsr_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_USR_R t, MCList<?> result) {
		MAM_USR_ACL_R acl = MAM_USR_ACL_R.create("ACL");
		MAM_DPT_R dpt0 = MAM_DPT_R.create("DPT0");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
		MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
		MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
		MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
		MAM_DPT_R dpt7 = MAM_DPT_R.create("DPT7");
		MAM_DPT_R dpt8 = MAM_DPT_R.create("DPT8");
		MAM_DPT_R dpt9 = MAM_DPT_R.create("DPT9");

		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(UsrCols.$o_dpt_cd);
		result.addStringColumn(UsrCols.$o_dpt_nm);
		result.addStringColumn(UsrCols.$o_add_dpt_cd1);
		result.addStringColumn(UsrCols.$o_add_dpt_nm1);
		result.addStringColumn(UsrCols.$o_add_dpt_cd2);
		result.addStringColumn(UsrCols.$o_add_dpt_nm2);
		result.addStringColumn(UsrCols.$o_add_dpt_cd3);
		result.addStringColumn(UsrCols.$o_add_dpt_nm3);
		result.addStringColumn(UsrCols.$o_add_dpt_cd4);
		result.addStringColumn(UsrCols.$o_add_dpt_nm4);
		result.addStringColumn(UsrCols.$o_add_dpt_cd5);
		result.addStringColumn(UsrCols.$o_add_dpt_nm5);
		result.addStringColumn(UsrCols.$o_add_dpt_cd6);
		result.addStringColumn(UsrCols.$o_add_dpt_nm6);
		result.addStringColumn(UsrCols.$o_add_dpt_cd7);
		result.addStringColumn(UsrCols.$o_add_dpt_nm7);
		result.addStringColumn(UsrCols.$o_add_dpt_cd8);
		result.addStringColumn(UsrCols.$o_add_dpt_nm8);
		result.addStringColumn(UsrCols.$o_add_dpt_cd9);
		result.addStringColumn(UsrCols.$o_add_dpt_nm9);
		result.addTimestampColumn(UsrCols.$o_acl_ins_ts);
		result.addTimestampColumn(UsrCols.$o_acl_upd_ts);

		// Select句、結合の設定
		// なし

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		if (!isNull(row.getDateNE(UsrCols.$i_dt))) {
			// 担当者権限マスタから部門関連の情報を取得
			// 主部門は直接入力時にも必要、リストロジックチェック時には不要
			builder.addSelect(acl.dpt_cd);
			builder.addSelect(dpt0.dpt_nm);
			// 日付が未入力の場合は、担当者権限マスタを参照しない
			// 担当者権限マスタ参照ＦＬＧがオンの場合のみ、担当者を絞り込む
			if (row.getBooleanNE(UsrCols.$i_referring_usr_acl_flg)) {
				builder.addInnerJoin(acl, bracket(acl.usr_cd.eq(t.usr_cd)
						.and(bind("dt").between(acl.st_dt, acl.end_dt))));
			}
			else {
				builder.addLeftOuterJoin(acl, bracket(acl.usr_cd.eq(t.usr_cd)
						.and(bind("dt").between(acl.st_dt, acl.end_dt))));
			}
			builder.addLeftOuterJoin(dpt0, bracket(dpt0.dpt_cd.eq(acl.dpt_cd)
					.and(bind("dt").between(dpt0.st_dt, dpt0.end_dt))));
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 入力補助画面からのリスト取得時
		if (!isNull(row.getDateNE(UsrCols.$i_dt))) {
			// 担当者権限マスタから部門関連の情報を取得
			// 主部門以外は入力補助画面専用項目
			builder.addSelect(acl.ins_ts.as("acl_ins_ts"));
			builder.addSelect(acl.upd_ts.as("acl_upd_ts"));
			builder.addSelect(acl.add_dpt_cd1);
			builder.addSelect(acl.add_dpt_cd2);
			builder.addSelect(acl.add_dpt_cd3);
			builder.addSelect(acl.add_dpt_cd4);
			builder.addSelect(acl.add_dpt_cd5);
			builder.addSelect(acl.add_dpt_cd6);
			builder.addSelect(acl.add_dpt_cd7);
			builder.addSelect(acl.add_dpt_cd8);
			builder.addSelect(acl.add_dpt_cd9);
			builder.addSelect(dpt1.dpt_nm.as("add_dpt_nm1"));
			builder.addSelect(dpt2.dpt_nm.as("add_dpt_nm2"));
			builder.addSelect(dpt3.dpt_nm.as("add_dpt_nm3"));
			builder.addSelect(dpt4.dpt_nm.as("add_dpt_nm4"));
			builder.addSelect(dpt5.dpt_nm.as("add_dpt_nm5"));
			builder.addSelect(dpt6.dpt_nm.as("add_dpt_nm6"));
			builder.addSelect(dpt7.dpt_nm.as("add_dpt_nm7"));
			builder.addSelect(dpt8.dpt_nm.as("add_dpt_nm8"));
			builder.addSelect(dpt9.dpt_nm.as("add_dpt_nm9"));
			builder.addLeftOuterJoin(dpt1, bracket(dpt1.dpt_cd.eq(acl.add_dpt_cd1)
					.and(bind("dt").between(dpt1.st_dt, dpt1.end_dt))));
			builder.addLeftOuterJoin(dpt2, bracket(dpt2.dpt_cd.eq(acl.add_dpt_cd2)
					.and(bind("dt").between(dpt2.st_dt, dpt2.end_dt))));
			builder.addLeftOuterJoin(dpt3, bracket(dpt3.dpt_cd.eq(acl.add_dpt_cd3)
					.and(bind("dt").between(dpt3.st_dt, dpt3.end_dt))));
			builder.addLeftOuterJoin(dpt4, bracket(dpt4.dpt_cd.eq(acl.add_dpt_cd4)
					.and(bind("dt").between(dpt4.st_dt, dpt4.end_dt))));
			builder.addLeftOuterJoin(dpt5, bracket(dpt5.dpt_cd.eq(acl.add_dpt_cd5)
					.and(bind("dt").between(dpt5.st_dt, dpt5.end_dt))));
			builder.addLeftOuterJoin(dpt6, bracket(dpt6.dpt_cd.eq(acl.add_dpt_cd6)
					.and(bind("dt").between(dpt6.st_dt, dpt6.end_dt))));
			builder.addLeftOuterJoin(dpt7, bracket(dpt7.dpt_cd.eq(acl.add_dpt_cd7)
					.and(bind("dt").between(dpt7.st_dt, dpt7.end_dt))));
			builder.addLeftOuterJoin(dpt8, bracket(dpt8.dpt_cd.eq(acl.add_dpt_cd8)
					.and(bind("dt").between(dpt8.st_dt, dpt8.end_dt))));
			builder.addLeftOuterJoin(dpt9, bracket(dpt9.dpt_cd.eq(acl.add_dpt_cd9)
					.and(bind("dt").between(dpt9.st_dt, dpt9.end_dt))));
		}
	}

	protected void getUsr_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_USR_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
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
		builder.addWhereWithCutOffAnd(t.usr_cd.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_cd));
		builder.addWhereWithCutOffAnd(t.usr_nm.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_nm));
		builder.addWhereWithCutOffAnd(t.usr_alt_nm1.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_alt_nm1));
		builder.addWhereWithCutOffAnd(t.usr_alt_nm2.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_alt_nm2));
		builder.addWhereWithCutOffAnd(t.usr_alt_nm3.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_alt_nm3));
		builder.addWhereWithCutOffAnd(t.usr_alt_nm4.like(bind("1")),
				getEditString(row, UsrCols.$i_usr_alt_nm4));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, UsrCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, UsrCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, UsrCols.$i_memo3));

		if (!isNull(row.getDateNE(UsrCols.$i_dt))) {
			MAM_USR_ACL_R acl = MAM_USR_ACL_R.create("ACL");
			MAM_DPT_R dpt0 = MAM_DPT_R.create("DPT0");
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
			MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
			MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
			MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
			MAM_DPT_R dpt7 = MAM_DPT_R.create("DPT7");
			MAM_DPT_R dpt8 = MAM_DPT_R.create("DPT8");
			MAM_DPT_R dpt9 = MAM_DPT_R.create("DPT9");

			// 担当者権限マスタから部門関連の情報を取得
			builder.addWhereWithCutOffAnd(acl.dpt_cd.like(bind("1")),
					getEditString(row, UsrCols.$i_dpt_cd));
			builder.addWhereWithCutOffAnd(dpt0.dpt_nm.like(bind("1")),
					getEditString(row, UsrCols.$i_dpt_nm));
			// 所属部門の値が、担当者権限マスタで主部門もしくは兼務部門１～９のいずれかに設定されている担当者を検索
			builder.addWhereWithCutOffAnd(
					bracket(acl.dpt_cd.like(bind("1"))
							.or(acl.add_dpt_cd1.like(bind("1")))
							.or(acl.add_dpt_cd2.like(bind("1")))
							.or(acl.add_dpt_cd3.like(bind("1")))
							.or(acl.add_dpt_cd4.like(bind("1")))
							.or(acl.add_dpt_cd5.like(bind("1")))
							.or(acl.add_dpt_cd6.like(bind("1")))
							.or(acl.add_dpt_cd7.like(bind("1")))
							.or(acl.add_dpt_cd8.like(bind("1")))
							.or(acl.add_dpt_cd9.like(bind("1")))),
					getEditString(row, UsrCols.$i_aff_dpt_cd));
			builder.addWhereWithCutOffAnd(bracket(dpt0.dpt_nm.like(bind("1"))
					.or(dpt1.dpt_nm.like(bind("1"))).or(dpt2.dpt_nm.like(bind("1")))
					.or(dpt3.dpt_nm.like(bind("1"))).or(dpt4.dpt_nm.like(bind("1")))
					.or(dpt5.dpt_nm.like(bind("1"))).or(dpt6.dpt_nm.like(bind("1")))
					.or(dpt7.dpt_nm.like(bind("1"))).or(dpt8.dpt_nm.like(bind("1")))
					.or(dpt9.dpt_nm.like(bind("1")))),
					getEditString(row, UsrCols.$i_aff_dpt_nm));
		}
	}
	
	protected void getUsr_NullVal(MCRow row, MCList<MCRow> down) {
		if(row.getBooleanNE(UsrCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(UsrCols.$o_usr_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- Usr:担当者(END)
	// -- LgGrp:物流グループ(START)
	@Override
	protected void getLgGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t,
			MCList<?> result) {
		super.getLgGrp_Set(row, builder, t, result);
		getLgGrp_addSelectJoinCustom(row, builder, t, result);
		getLgGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getLgGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		MAVM_RD_LG_GRP_R rd_lg_grp = MAVM_RD_LG_GRP_R.create("RD_LG_GRP");
		MAVM_WR_LG_GRP_R wr_lg_grp = MAVM_WR_LG_GRP_R.create("WR_LG_GRP");

		// 固定のSelect句、結合の設定
		if (row.getBooleanNE(LgGrpCols.$i_rd_flg)) {
			builder.addInnerJoin(rd_lg_grp, bracket(rd_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
		}
		if (row.getBooleanNE(LgGrpCols.$i_wr_flg)) {
			builder.addInnerJoin(wr_lg_grp, bracket(wr_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
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

	protected void getLgGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		if (row.contains(LgGrpCols.$i_loc_flg)) {
			builder.addWhereWithAnd(t.loc_flg.eq(bind("1")),
					booleanToDBString(row.getBooleanNE(LgGrpCols.$i_loc_flg)));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")),
				row.getStringNE(LgGrpCols.$i_wg_cd));
	}

	protected void getLgGrp_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LgGrpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LgGrpCols.$o_lg_grp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getLgGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(LgGrpCols.$i_wg_cd))
				&& !(row.getBooleanNE(LgGrpCols.$i_loc_flg))) {
			msg = new MCMessage(MAUAL0023, info);
		}
		else {
			msg = new MCMessage(MAUAL0327, row.getStringNE(LgGrpCols.$i_wg_cd),
					row.getBooleanNE(LgGrpCols.$i_loc_flg), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- LgGrp:物流グループ(END)
	// -- LocGrp:製造場所グループ(START)
	@Override
	protected void getLocGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_GRP_R t,
			MCList<?> result) {
		super.getLocGrp_Set(row, builder, t, result);
		getLocGrp_addSelectJoinCustom(row, builder, t, result);
		getLocGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getLocGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LOC_GRP_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

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

	protected void getLocGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LOC_GRP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")),
				row.getStringNE(LocGrpCols.$i_wg_cd));
	}

	protected MCMessage getLocGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(LocGrpCols.$i_wg_cd))) {
			msg = new MCMessage(MAUAL0024, info);
		}
		else {
			msg = new MCMessage(MAUAL0328, row.getStringNE(LocGrpCols.$i_wg_cd), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- LocGrp:製造場所グループ(END)
	// -- AlcAcGrp:配賦科目グループ(START)
	@Override
	protected void getAlcAcGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_AC_GRP_R t, MCList<?> result) {
		super.getAlcAcGrp_Set(row, builder, t, result);
		if (row.contains(AlcAcGrpCols.$i_alc_ac_grp_typ)) {
			builder.addWhereWithAnd(t.alc_ac_grp_typ.eq(bind("1")),
					row.getStringNE(AlcAcGrpCols.$i_alc_ac_grp_typ));
		}
	}

	protected MCMessage getAlcAcGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0138,
				row.getStringNE(AlcAcGrpCols.$i_alc_ac_grp_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcAcGrp:配賦科目グループ(END)
	// -- CostIoNotInCostIoConf:受払表（個別受払表構成未登録）(START)
	@Override
	protected void getCostIoNotInCostIoConf_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_IO_R t, MCList<?> result) {
		MAM_COST_IO_CONF_R S1M1 = MAM_COST_IO_CONF_R.create("M1");

		super.getCostIoNotInCostIoConf_Set(row, builder, t, result);
		builder.addWhereWithAnd(notExists(subQuery().select(S1M1.prAll()).from(S1M1)
				.where(S1M1.cost_io_id.eq(t.cost_io_id))));
	}

	// -- CostIoNotInCostIoConf:受払表（個別受払表構成未登録） (END)
	// -- CostMenuNotInMenuConfig:原価メニュー（原価メニュー構成未登録）(START)
	@Override
	protected void getCostMenuNotInMenuConfig_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_MENU_R t, MCList<?> result) {
		MAM_MENU_CONFIG_R S1M1 = MAM_MENU_CONFIG_R.create("M1");

		super.getCostMenuNotInMenuConfig_Set(row, builder, t, result);
		builder.addWhereWithAnd(notExists(subQuery().select(S1M1.prAll()).from(S1M1)
				.where(S1M1.menu_cd.eq(t.menu_cd))));

	}

	// -- CostMenuNotInMenuConfig:原価メニュー（原価メニュー構成未登録） (END)
	// -- AcSlipTypInCostSlipJnl:会計伝票区分（原価会計伝票区分仕訳マスタ登録済）(START)
	@Override
	protected void getAcSlipTypInCostSlipJnl_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_SLIP_JNL_R t, MCList<?> result) {
		super.getAcSlipTypInCostSlipJnl_Set(row, builder, t, result);
		result.addStringColumn(AcSlipTypInCostSlipJnlCols.$o_chk_calc_grp_cd);
		builder.addSelect(t.calc_grp_cd.as("chk_calc_grp_cd"));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		builder.removeSelect(t.calc_grp_cd.as("chk_calc_grp_cd"));
		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getStringNE(AcSlipTypInCostSlipJnlCols.$i_calc_grp_cd))) {
			builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")),
					row.getStringNE(AcSlipTypInCostSlipJnlCols.$i_calc_grp_cd));
		}
		else {
			builder.setDistinct();
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	public <E extends MCRow> MCList getAcSlipTypInCostSlipJnl_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		MCList subRsltL = rsltL.subList("chk_calc_grp_cd",
				inRow.getStringNE(AcSlipTypInCostSlipJnlCols.$i_calc_grp_cd));
		return subRsltL;
	}

	@Override
	protected MCList<?> getAcSlipTypInCostSlipJnl_AfterSelect(MCRow row,
			MCQueryApiBuilder builder, MAM_COST_SLIP_JNL_R t, MCList<?> result) {
		MCList<?> l = super.getAcSlipTypInCostSlipJnl_AfterSelect(row, builder, t,
				result);
		l.addStringColumn(AcSlipTypInCostSlipJnlCols.$o_ac_slip_typ_nm);
		MAC_AC_SLIP_TYP.putNameNE(l, AcSlipTypInCostSlipJnlCols.$o_ac_slip_typ,
				AcSlipTypInCostSlipJnlCols.$o_ac_slip_typ_nm);
		return l;
	}

	protected MCMessage getAcSlipTypInCostSlipJnl_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0389,
				row.getStringNE(AcSlipTypInCostSlipJnlCols.$i_calc_grp_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AcSlipTypInCostSlipJnl:会計伝票区分（原価会計伝票区分仕訳マスタ登録済） (END)
	// -- AlcAcGrp1:配賦科目グループ（区分１） (START)
	@Override
	protected void getAlcAcGrp1_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_AC_GRP_R t, MCList<?> result) {
		super.getAlcAcGrp1_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				t.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value())));
	}

	// -- AlcAcGrp1:配賦科目グループ（区分１） (END)
	// -- AlcAcGrp2:配賦科目グループ（区分２） (START)
	@Override
	protected void getAlcAcGrp2_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_AC_GRP_R t, MCList<?> result) {
		super.getAlcAcGrp2_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				t.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value())));
	}

	// -- AlcAcGrp2:配賦科目グループ（区分２） (END)
	// -- AlcAcGrp3:配賦科目グループ（区分３） (START)
	@Override
	protected void getAlcAcGrp3_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_AC_GRP_R t, MCList<?> result) {
		super.getAlcAcGrp3_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				t.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value())));
	}

	// -- AlcAcGrp3:配賦科目グループ（区分３） (END)
	// -- Tterm1:取引条件（区分１） (START)
	@Override
	protected void getTterm1_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t,
			MCList<?> result) {
		super.getTterm1_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.tterm_typ.eq(value(MAC_TTERM_TYP.TTERM1.value())));
	}

	// -- Tterm1:取引条件（区分１） (END)
	// -- Tterm2:取引条件（区分２） (START)
	@Override
	protected void getTterm2_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t,
			MCList<?> result) {
		super.getTterm2_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.tterm_typ.eq(value(MAC_TTERM_TYP.TTERM2.value())));
	}

	// -- Tterm2:取引条件（区分２） (END)
	// -- Tterm3:取引条件（区分３） (START)
	@Override
	protected void getTterm3_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t,
			MCList<?> result) {
		super.getTterm3_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.tterm_typ.eq(value(MAC_TTERM_TYP.TTERM3.value())));
	}

	// -- Tterm3:取引条件（区分３） (END)
	// -- SlsAnly:販売分析 (START)
	@Override
	protected void getSlsAnly_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t,
			MCList<?> result) {
		super.getSlsAnly_Set(row, builder, t, result);
		if (row.contains(SlsAnlyCols.$i_sls_anly_typ)) {
			builder.addWhereWithAnd(t.sls_anly_typ.eq(bind("1")),
					row.getStringNE(SlsAnlyCols.$i_sls_anly_typ));
		}
	}

	protected MCMessage getSlsAnly_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0151,
				row.getStringNE(SlsAnlyCols.$i_sls_anly_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SlsAnly:販売分析 (END)
	// -- SlsAnly1:販売分析（区分１） (START)
	@Override
	protected void getSlsAnly1_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t,
			MCList<?> result) {
		super.getSlsAnly1_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY1.value())));
	}

	// -- SlsAnly1:販売分析（区分１） (END)
	// -- SlsAnly2:販売分析（区分２） (START)
	@Override
	protected void getSlsAnly2_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t,
			MCList<?> result) {
		super.getSlsAnly2_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY2.value())));
	}

	// -- SlsAnly2:販売分析（区分２） (END)
	// -- SlsAnly3:販売分析（区分３） (START)
	@Override
	protected void getSlsAnly3_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t,
			MCList<?> result) {
		super.getSlsAnly3_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY3.value())));
	}

	// -- SlsAnly3:販売分析（区分３） (END)
	// -- PurcBizRsn:業務理由（仕入） (START)
	@Override
	protected void getPurcBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getPurcBizRsn_Set(row, builder, t, result);
		getPurcBizRsn_addSelectJoinCustom(row, builder, t, result);
		getPurcBizRsn_addWhereCustom(row, builder, t, result);
	}

	protected void getPurcBizRsn_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getPurcBizRsn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.purc_flg.eq(value(true)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		boolean xpns = row.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg);
		boolean notxpns = row.getBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg);
		if (xpns || notxpns) {
			MCPredicate xpflgp = value(0).eq(value(1));
			if (xpns) {
				xpflgp = xpflgp.or(t.xpns_purc_flg.eq(value(true)));
			}
			if (notxpns) {
				xpflgp = xpflgp.or(t.xpns_purc_flg.eq(value(false)));
			}
			builder.addWhereWithAnd(bracket(xpflgp));
		}
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	public MCList getPurcBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg))
				&& (!(inRow.getBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg)))) {
			return rsltL.subList("xpns_purc_flg", true);
		}
		else if ((!(inRow.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg)))
				&& (inRow.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg))) {
			return rsltL.subList("xpns_purc_flg", false);
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getPurcBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (row.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg)
				&& row.getBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0122, info);
		}
		else if (row.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0321, MAC_STR.MSG_FLG_ON.name(), info);
		}
		else if (row.getBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0321, MAC_STR.MSG_FLG_OFF.name(), info);
		}
		else {
			msg = new MCMessage(MAUAL0122, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PurcBizRsn:業務理由（仕入） (END)
	// -- PurcRtnBizRsn:業務理由（仕入返品） (START)
	@Override
	protected void getPurcRtnBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getPurcRtnBizRsn_Set(row, builder, t, result);
		getPurcRtnBizRsn_addSelectJoinCustom(row, builder, t, result);
		getPurcRtnBizRsn_addWhereCustom(row, builder, t, result);
	}

	protected void getPurcRtnBizRsn_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getPurcRtnBizRsn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.purc_rtn_flg.eq(value(true)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		boolean xpns = row.getBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg);
		boolean notxpns = row.getBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg);
		if (xpns || notxpns) {
			MCPredicate xpflgp = value(0).eq(value(1));
			if (xpns) {
				xpflgp = xpflgp.or(t.xpns_purc_flg.eq(value(true)));
			}
			if (notxpns) {
				xpflgp = xpflgp.or(t.xpns_purc_flg.eq(value(false)));
			}
			builder.addWhereWithAnd(bracket(xpflgp));
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	public MCList getPurcRtnBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg))
				&& (!(inRow.getBooleanNE(PurcRtnBizRsnCols.$i_not_xpns_purc_flg)))) {
			return rsltL.subList("xpns_purc_flg", true);
		}
		else if ((!(inRow.getBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg)))
				&& (inRow.getBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg))) {
			return rsltL.subList("xpns_purc_flg", false);
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getPurcRtnBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (row.getBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg)
				&& row.getBooleanNE(PurcRtnBizRsnCols.$i_not_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0123, info);
		}
		else if (row.getBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0322, MAC_STR.MSG_FLG_ON.name(), info);
		}
		else if (row.getBooleanNE(PurcRtnBizRsnCols.$i_not_xpns_purc_flg)) {
			msg = new MCMessage(MAUAL0322, MAC_STR.MSG_FLG_OFF.name(), info);
		}
		else {
			msg = new MCMessage(MAUAL0123, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PurcRtnBizRsn:業務理由（仕入返品） (END)
	// -- PurcDscntBizRsn:業務理由（仕入調整） (START)
	@Override
	protected void getPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getPurcDscntBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.purc_dscnt_flg.eq(value(true)));
		String typ = row.getStringNE(PurcDscntBizRsnCols.$i_purc_dscnt_loc_mng_typ);
		if (MAC_LOC_MNG_TYP.isSLS(typ)) {
			builder.addWhereWithAnd(
					t.purc_dscnt_loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.SLS.value())));
		}
		else if (MAC_LOC_MNG_TYP.isPRD(typ)) {
			builder.addWhereWithAnd(
					t.purc_dscnt_loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.PRD.value())));
		}
	}

	protected MCMessage getPurcDscntBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (!isNull(row.getStringNE(PurcDscntBizRsnCols.$i_purc_dscnt_loc_mng_typ))) {
			msg = new MCMessage(MAUAL0325,
					row.getStringNE(PurcDscntBizRsnCols.$i_purc_dscnt_loc_mng_typ), info);
		}
		else {
			msg = new MCMessage(MAUAL0124, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PurcDscntBizRsn:業務理由（仕入調整） (END)
	// -- HPurcDscntBizRsn:業務理由（販売資産仕入調整） (START)
	@Override
	protected void getHPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getHPurcDscntBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.purc_dscnt_flg.eq(value(true)));
		builder.addWhereWithAnd(
				t.purc_dscnt_loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.SLS.value())));
	}

	// -- HPurcDscntBizRsn:業務理由（販売資産仕入調整） (END)
	// -- SPurcDscntBizRsn:業務理由（生産資産仕入調整） (START)
	@Override
	protected void getSPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getSPurcDscntBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.purc_dscnt_flg.eq(value(true)));
		builder.addWhereWithAnd(
				t.purc_dscnt_loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.PRD.value())));
	}

	// -- SPurcDscntBizRsn:業務理由（生産資産仕入調整） (END)
	// -- SlsBizRsn:業務理由（売上） (START)
	@Override
	protected void getSlsBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t,
			MCList<?> result) {
		super.getSlsBizRsn_Set(row, builder, t, result);
		getSlsBizRsn_addSelectJoinCustom(row, builder, t, result);
		getSlsBizRsn_addWhereCustom(row, builder, t, result);
	}

	protected void getSlsBizRsn_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSlsBizRsn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.sls_flg.eq(value(true)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		boolean acxfr = row.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg);
		boolean notacxfr = row.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg);
		if (acxfr || notacxfr) {
			MCPredicate saflgp = value(0).eq(value(1));
			if (acxfr) {
				saflgp = saflgp.or(t.sls_acxfr_flg.eq(value(true)));
			}
			if (notacxfr) {
				saflgp = saflgp.or(t.sls_acxfr_flg.eq(value(false)));
			}
			builder.addWhereWithAnd(bracket(saflgp));
		}
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	public MCList getSlsBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(SlsBizRsnCols.$i_sls_acxfr_flg))
				&& (!(inRow.getBooleanNE(SlsBizRsnCols.$i_not_sls_acxfr_flg)))) {
			return rsltL.subList("sls_acxfr_flg", true);
		}
		else if ((!(inRow.getBooleanNE(SlsBizRsnCols.$i_sls_acxfr_flg)))
				&& (inRow.getBooleanNE(SlsBizRsnCols.$i_not_sls_acxfr_flg))) {
			return rsltL.subList("sls_acxfr_flg", false);
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getSlsBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (row.getBooleanNE(SlsBizRsnCols.$i_sls_acxfr_flg)
				&& row.getBooleanNE(SlsBizRsnCols.$i_not_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0125, info);
		}
		else if (row.getBooleanNE(SlsBizRsnCols.$i_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0368, MAC_STR.MSG_FLG_ON.name(), info);
		}
		else if (row.getBooleanNE(SlsBizRsnCols.$i_not_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0368, MAC_STR.MSG_FLG_OFF.name(), info);
		}
		else {
			msg = new MCMessage(MAUAL0125, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SlsBizRsn:業務理由（売上） (END)
	// -- SlsRtnBizRsn:業務理由（売上返品） (START)
	@Override
	protected void getSlsRtnBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getSlsRtnBizRsn_Set(row, builder, t, result);
		getSlsRtnBizRsn_addSelectJoinCustom(row, builder, t, result);
		getSlsRtnBizRsn_addWhereCustom(row, builder, t, result);
	}

	protected void getSlsRtnBizRsn_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSlsRtnBizRsn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.sls_rtn_flg.eq(value(true)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		boolean acxfr = row.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg);
		boolean notacxfr = row.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg);
		if (acxfr || notacxfr) {
			MCPredicate saflgp = value(0).eq(value(1));
			if (acxfr) {
				saflgp = saflgp.or(t.sls_acxfr_flg.eq(value(true)));
			}
			if (notacxfr) {
				saflgp = saflgp.or(t.sls_acxfr_flg.eq(value(false)));
			}
			builder.addWhereWithAnd(bracket(saflgp));
		}
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	public MCList getSlsRtnBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg))
				&& (!(inRow.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg)))) {
			return rsltL.subList("sls_acxfr_flg", true);
		}
		else if ((!(inRow.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg)))
				&& (inRow.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg))) {
			return rsltL.subList("sls_acxfr_flg", false);
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getSlsRtnBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (row.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg)
				&& row.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0126, info);
		}
		else if (row.getBooleanNE(SlsRtnBizRsnCols.$i_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0369, MAC_STR.MSG_FLG_ON.name(), info);
		}
		else if (row.getBooleanNE(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg)) {
			msg = new MCMessage(MAUAL0369, MAC_STR.MSG_FLG_OFF.name(), info);
		}
		else {
			msg = new MCMessage(MAUAL0126, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SlsRtnBizRsn:業務理由（売上返品） (END)
	// -- SlsDscntBizRsn:業務理由（売上調整） (START)
	@Override
	protected void getSlsDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getSlsDscntBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_dscnt_flg.eq(value(true)));
	}

	// -- SlsDscntBizRsn:業務理由（売上調整） (END)
	// -- AcxfrGrBizRsn:業務理由（他勘定入庫） (START)
	@Override
	protected void getAcxfrGrBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getAcxfrGrBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.acxfr_gr_flg.eq(value(true)));
	}

	// -- AcxfrGrBizRsn:業務理由（他勘定入庫） (END)
	// -- AcxfrGrBizRsn:業務理由（他勘定出庫） (START)
	@Override
	protected void getAcxfrGiBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getAcxfrGiBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.acxfr_gi_flg.eq(value(true)));
	}

	// -- AcxfrGrBizRsn:業務理由（他勘定出庫） (END)
	// -- DispBizRsn:業務理由（廃棄） (START)
	@Override
	protected void getDispBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getDispBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.disp_flg.eq(value(true)));
	}

	// -- DispBizRsn:業務理由（廃棄） (END)
	// -- StkXfrBizRsn:業務理由（在庫振替） (START)
	@Override
	protected void getStkXfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getStkXfrBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.stk_xfr_flg.eq(value(true)));
	}

	// -- StkXfrBizRsn:業務理由（在庫振替） (END)
	// -- XfrBizRsn:業務理由（移送） (START)
	@Override
	protected void getXfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t,
			MCList<?> result) {
		super.getXfrBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.xfr_flg.eq(value(true)));
	}

	// -- XfrBizRsn:業務理由（移送） (END)
	// -- YieldBizRsn:業務理由（出来高） (START)
	@Override
	protected void getYieldBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getYieldBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.yield_flg.eq(value(true)));
		if (row.contains(YieldBizRsnCols.$i_yield_typ)) {
			builder.addWhereWithAnd(t.yield_typ.eq(bind("1")),
					row.getStringNE(YieldBizRsnCols.$i_yield_typ));
		}
	}

	protected MCMessage getYieldBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(YieldBizRsnCols.$i_yield_typ))) {
			msg = new MCMessage(MAUAL0132, info);
		}
		else {
			msg = new MCMessage(MAUAL0326, row.getStringNE(YieldBizRsnCols.$i_yield_typ),
					info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- YieldBizRsn:業務理由（出来高） (END)
	// -- LossBizRsn:業務理由（ロス） (START)
	@Override
	protected void getLossBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getLossBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.loss_flg.eq(value(true)));
	}

	// -- LossBizRsn:業務理由（ロス） (END)
	// -- DfctBizRsn:業務理由（検査不良） (START)
	@Override
	protected void getDfctBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getDfctBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.dfct_flg.eq(value(true)));
	}

	// -- DfctBizRsn:業務理由（検査不良） (END)
	// -- InptBizRsn:業務理由（投入） (START)
	@Override
	protected void getInptBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getInptBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.inpt_flg.eq(value(true)));
	}

	// -- InptBizRsn:業務理由（投入） (END)
	// -- StkGd:格付 (START)
	@Override
	protected void getStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t,
			MCList<?> result) {
		super.getStkGd_Set(row, builder, t, result);
		if (row.getBooleanNE(StkGdCols.$i_slo_flg)) {
			builder.addWhereWithAnd(t.slo_flg.eq(value(true)));
		}
	}

	// -- StkGd:格付 (END)
	// -- SloStkGd:格付（受注） (START)
	@Override
	protected void getSloStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t,
			MCList<?> result) {
		super.getSloStkGd_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.slo_flg.eq(value(true)));
	}
	// -- SloStkGd:格付（受注） (END)

	// -- SlsWg:ＷＧ（販売） (START)
	@Override
	protected void getSlsWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getSlsWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sls_flg.eq(value(true)));
		if (row.getBooleanNE(SlsWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(SlsWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getSlsWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SlsWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SlsWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- SlsWg:ＷＧ（販売） (END)
	// -- LgWg:ＷＧ（物流） (START)
	@Override
	protected void getLgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getLgWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.lg_flg.eq(value(true)));
		if (row.getBooleanNE(LgWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(LgWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getLgWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LgWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LgWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- LgWg:ＷＧ（物流） (END)
	// -- MfgWg:ＷＧ（製造） (START)
	@Override
	protected void getMfgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getMfgWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.mfg_flg.eq(value(true)));
		if (row.getBooleanNE(MfgWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(MfgWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getMfgWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(MfgWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(MfgWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- MfgWg:ＷＧ（製造） (END)
	// -- PurcWg:ＷＧ（購買） (START)
	@Override
	protected void getPurcWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getPurcWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.purc_flg.eq(value(true)));
		if (row.getBooleanNE(PurcWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(PurcWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getPurcWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(PurcWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(PurcWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- PurcWg:ＷＧ（購買） (END)
	// -- ArWg:ＷＧ（債権） (START)
	@Override
	protected void getArWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getArWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ar_flg.eq(value(true)));
		if (row.getBooleanNE(ArWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(ArWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getArWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ArWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ArWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ArWg:ＷＧ（債権） (END)
	// -- ApWg:ＷＧ（債務） (START)
	@Override
	protected void getApWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getApWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ap_flg.eq(value(true)));
		if (row.getBooleanNE(ApWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(ApWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getApWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ApWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ApWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ApWg:ＷＧ（債務） (END)
	// -- SdWg:ＷＧ（需給） (START)
	@Override
	protected void getSdWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getSdWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.sd_flg.eq(value(true)));
		if (row.getBooleanNE(SdWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(SdWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getSdWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SdWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SdWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- SdWg:ＷＧ（需給） (END)
	// -- IntBankAc:社内口座 (START)
	@Override
	protected void getIntBankAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t,
			MCList<?> result) {
		super.getIntBankAc_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ext_flg.eq(value(false)));
	}

	// -- IntBankAc:社内口座 (END)
	// -- ExtBankAc:社外口座 (START)
	@Override
	protected void getExtBankAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t,
			MCList<?> result) {
		super.getExtBankAc_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ext_flg.eq(value(true)));
	}

	// -- ExtBankAc:社外口座 (END)
	// -- CostSls:原価売上分類 (START)
	@Override
	protected void getCostSls_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls_Set(row, builder, t, result);
		if (row.contains(CostSlsCols.$i_cost_sls_typ)) {
			builder.addWhereWithAnd(t.cost_sls_typ.eq(bind("1")),
					row.getStringNE(CostSlsCols.$i_cost_sls_typ));
		}
	}

	protected MCMessage getCostSls_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0152,
				row.getStringNE(CostSlsCols.$i_cost_sls_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- CostSls:原価売上分類 (END)
	// -- CostSls1:原価売上分類 （区分１） (START)
	@Override
	protected void getCostSls1_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls1_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S1.value())));
	}

	// -- CostSls1:原価売上分類 （区分１） (END)
	// -- CostSls2:原価売上分類 （区分２） (START)
	@Override
	protected void getCostSls2_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls2_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S2.value())));
	}

	// -- CostSls2:原価売上分類 （区分２） (END)
	// -- CostSls3:原価売上分類 （区分３） (START)
	@Override
	protected void getCostSls3_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls3_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S3.value())));
	}

	// -- CostSls3:原価売上分類 （区分３） (END)
	// -- CostSls4:原価売上分類 （区分４） (START)
	@Override
	protected void getCostSls4_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls4_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S4.value())));
	}

	// -- CostSls4:原価売上分類 （区分４） (END)
	// -- CostSls5:原価売上分類 （区分５） (START)
	@Override
	protected void getCostSls5_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t,
			MCList<?> result) {
		super.getCostSls5_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S5.value())));
	}

	// -- CostSls5:原価売上分類 （区分５） (END)
	// -- GpAlc:汎用配賦分類 (START)
	@Override
	protected void getGpAlc_Set(MCRow row, MCQueryApiBuilder builder, MAM_GP_ALC_R t,
			MCList<?> result) {
		super.getGpAlc_Set(row, builder, t, result);
	}

	// -- GpAlc:汎用配賦分類 (END)
	// -- Sttl:決済方法（全部） (START)
	@Override
	protected void getSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t,
			MCList<?> result) {
		super.getSttl_Set(row, builder, t, result);
		result.addStringColumn(ArSttlSetoffDrWtaxCols.$o_tax_cd);
		if (!isNull(row.getDateNE(ArSttlSetoffDrWtaxCols.$i_dt))) {
			builder.addSelect(bracket(cases()
					.when(t.sls_purc_typ.eq(value(MAC_SLS_PURC_TYP.SLS.value())))
					.then(MAPA_TAX$F_GET_SLS_TAX_CD(nullValue(), nullValue(), nullValue(),
							nullValue(), nullValue(), bind("dt")))
					.otherwise(cases()
							.when(t.sls_purc_typ.eq(value(MAC_SLS_PURC_TYP.PURC.value())))
							.then(MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(),
									nullValue(), nullValue(), nullValue(), bind("dt")))
							.otherwise(nullValue()))).as("tax_cd"));
		}

		String typ = row.getStringNE(SttlCols.$i_ar_sttl_typ);
		if (!isNull(typ)) {
			if (MAC_AR_STTL_TYP.isBANK(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.BANK.value())));
			}
			else if (MAC_AR_STTL_TYP.isCASH(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.CASH.value())));
			}
			else if (MAC_AR_STTL_TYP.isNOTE(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.NOTE.value())));
			}
			else if (MAC_AR_STTL_TYP.isSETOFF_CR(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.SETOFF_CR.value())));
			}
			else if (MAC_AR_STTL_TYP.isSETOFF_DR(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.SETOFF_DR.value())));
			}
			else if (MAC_AR_STTL_TYP.isWTAX(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.WTAX.value())));
			}
			else if (MAC_AR_STTL_TYP.isSW(typ)) {
				builder.addWhereWithAnd(
						t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.SW.value())));
			}
		}
	}

	@Override
	protected MCList<?> getSttl_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		if (!isNull(row.getDateNE(SttlCols.$i_dt))) {
			getSttl_AfterSelectSub(row, builder, t, result);
		}
		return super.getSttl_AfterSelect(row, builder, t, result);
	}

	protected MCMessage getSttl_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (!isNull(row.getStringNE(SttlCols.$i_ar_sttl_typ))) {
			msg = new MCMessage(MAUAL0330, row.getStringNE(SttlCols.$i_ar_sttl_typ),
					info);
		}
		else {
			msg = new MCMessage(MAUAL0173, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	protected void getSttl_AfterSelectSub(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		MCList<MAM_STTL_R> sttlL = (MCList<MAM_STTL_R>) result;

		String[] taxCdKeys = {
				"tax_cd"
		};
		MCList<MCRow> taxCdList = sttlL.subColumns(taxCdKeys);
		MCList<MAM_TAX_R> taxL = getSttl_TaxList(taxCdList);
		MCIndexKey taxCdIdx = taxL.createIndex(taxCdKeys);

		String[] taxRateKeys = {
				"tax_rate"
		};
		MCList<MCRow> taxRateList = taxL.subColumns(taxRateKeys);
		MCQueryApiBuilder taxbuilder = MCQueryApiBuilder.create(MAM_TAX_R.create("T"));
		MCList srchTaxCdList = getSttl_SrchTaxCd(taxbuilder, taxRateList);
		MCIndexKey taxRateIdx = srchTaxCdList.createIndex(taxRateKeys);

		for (MAM_STTL_R sttlR : sttlL) {
			if (!isNull(sttlR.ap_sttl_typ())
					&& !MAC_AP_STTL_TYP.is_com_paid(sttlR.ap_sttl_typ())) {
				sttlR.setStringNE("tax_cd", null);
				continue;
			}
			MAM_TAX_R taxR = taxL.getFirst(taxCdIdx, sttlR.toArray(taxCdKeys));

			if (!MAC_TAX_TYP.isTAX_ABL(taxR.tax_typ())) {
				sttlR.setStringNE("tax_cd", null);
				continue;
			}
			if (taxR.inc_tax_flg()) {
				continue;
			}

			MCList srchTaxCdListSub = srchTaxCdList.subList(taxRateIdx,
					taxR.toArray(taxRateKeys));
			MCRow r = null;
			if (MAC_SLS_PURC_TYP.isSLS(sttlR.getStringNE("sls_purc_typ"))) {
				r = srchTaxCdListSub.getFirst("sls_flg", true);
			}
			else if (MAC_SLS_PURC_TYP.isPURC(sttlR.getStringNE("sls_purc_typ"))) {
				r = srchTaxCdListSub.getFirst("purc_flg", true);
			}

			if (isNull(r)) {
				sttlR.setStringNE("tax_cd", null);
			}
			else {
				sttlR.setStringNE("tax_cd", r.getStringNE("tax_cd"));
			}
		}
	}

	protected mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache<MAM_TAX_R> _taxL;

	protected MCList<MAM_TAX_R> getSttl_TaxList(MCList<MCRow> taxCdList) {
		if (null == _taxL) {
			_taxL = new mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
		}
		MCList<MAM_TAX_R> taxList = MCList.create(MAM_TAX_R.class);
		for (MCRow r : taxCdList.groupBy("tax_cd")) {
			taxList.add(_taxL.get(r.getStringNE("tax_cd")));
		}
		return taxList;
	}

	protected MCList getSttl_SrchTaxCd(MCQueryApiBuilder builder,
			MCList<MCRow> taxRateList) {

		MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
		MAM_TAX_R t = (MAM_TAX_R) builder.getBaseDbc();
		builder.setSelect(t.tax_cd);
		builder.addSelect(t.tax_rate);
		builder.addSelect(t.sls_flg);
		builder.addSelect(t.purc_flg);
		builder.setWhere(t.inc_tax_flg.eq(value(true)));
		builder.addWhereWithAnd(
				bracket(t.sls_flg.eq(value(true)).or(t.purc_flg.eq(value(true)))));

		List<MCNumber> taxRates = new ArrayList<MCNumber>();
		for (MCRow r : taxRateList.groupBy("tax_rate")) {
			taxRates.add(r.getNumberNE("tax_rate"));
		}
		builder.addWhereInWithAnd(t.tax_rate, taxRates);

		builder.setOrderByAsc(t.tax_cd);

		dbSelect(createSqlId("MA.MAUAL0010.Sttl_getSttl_SrchTaxCd", t, "S01"), taxL,
				builder);
		return taxL;
	}

	// -- Sttl:決済方法（全部） (END)
	// -- ArSttlSetoffDrWtax:決済方法（全部） (START)
	@Override
	protected void getArSttlSetoffDrWtax_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		super.getArSttlSetoffDrWtax_Set(row, builder, t, result);
		result.addStringColumn(ArSttlSetoffDrWtaxCols.$o_tax_cd);
		if (!isNull(row.getDateNE(ArSttlSetoffDrWtaxCols.$i_dt))) {
			builder.addSelect(bracket(
					cases().when(t.sls_purc_typ.eq(value(MAC_SLS_PURC_TYP.SLS.value())))
							.then(MAPA_TAX$F_GET_SLS_TAX_CD(nullValue(), nullValue(),
									nullValue(), nullValue(), nullValue(), bind("dt")))
							.when(t.sls_purc_typ.eq(value(MAC_SLS_PURC_TYP.PURC.value())))
							.then(MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(),
									nullValue(), nullValue(), nullValue(), bind("dt")))
							.otherwise(nullValue())).as("tax_cd"));
		}
		builder.addWhereWithAnd(t.ar_sttl_typ.in(value(MAC_AR_STTL_TYP.SETOFF_DR.value()),
				value(MAC_AR_STTL_TYP.WTAX.value())));
	}

	@Override
	protected MCList<?> getArSttlSetoffDrWtax_AfterSelect(MCRow row,
			MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result) {
		if (!isNull(row.getDateNE(ArSttlSetoffDrWtaxCols.$i_dt))) {
			// Sttlと共用
			getSttl_AfterSelectSub(row, builder, t, result);
		}
		return super.getArSttlSetoffDrWtax_AfterSelect(row, builder, t, result);
	}

	// -- ArSttlSetoffDrWtax:決済方法（全部） (END)
	// -- AlcRuleAlcPtnAsExpnsCostOrProfit:配賦方法_配賦パタン（費目別原価または利益） (START)
	@Override
	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_Set(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		super.getAlcRuleAlcPtnAsExpnsCostOrProfit_Set(row, builder, t, result);
		getAlcRuleAlcPtnAsExpnsCostOrProfit_addSelectJoinCustom(row, builder, t, result);
		getAlcRuleAlcPtnAsExpnsCostOrProfit_addWhereCustom(row, builder, t, result);
	}

	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ALC_RULE_R.$alc_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		result.addDateColumn(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$o_out_term);
		result.addDateColumn(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$o_out_term_end_ym);
		builder.addWhereWithAnd(
				bracket(t.alc_rule_typ.eq(value(MAC_ALC_RULE_TYP.EXPNS_COST.value()))
						.or(t.alc_rule_typ.eq(value(MAC_ALC_RULE_TYP.PROFIT.value())))));
		builder.addSelect(t.term.as("out_term"));
		if (row.getBooleanNE(
				AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_mode_this_term_flg)) {
			builder.addSelect(term.term_end_ym.as("out_term_end_ym"));
			builder.addInnerJoin(term, bracket(term.term.eq(t.term)));
		}
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(
				AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_mode_this_term_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getTermForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getTermForDpt(row));
		}
		else {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term));
		}
	}

	public <E extends MCRow> MCList getAlcRuleAlcPtnAsExpnsCostOrProfit_SrvChk(
			MCRow inRow, MCList<E> rsltL) {
		if (inRow.getBooleanNE(
				AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_mode_this_term_flg)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				配賦方法マスタの期終了年月 <= 引数の期(実行年月)
					boolean cnd1 = row.getDateNE("out_term_end_ym").gteDate(inRow
							.getDateNE(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term));
//				配賦方法マスタの期 >= 引数の期(実行年月)
					boolean cnd2 = row.getDateNE("out_term").lteDate(inRow
							.getDateNE(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term));
					return (cnd1 && cnd2);
				}
			});
			return subRsltL;
		}
		else {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				原価部門マスタの期 = 引数の期
					boolean cnd1 = (row.getDateNE("out_term").eqDate(inRow
							.getDateNE(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term)));
					return (cnd1);
				}
			});
			return subRsltL;
		}
	}

	protected MCMessage getAlcRuleAlcPtnAsExpnsCostOrProfit_Msg(MCRow causeRow,
			String causeCol, MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0181,
				toYMString(row.getDateNE(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term)),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcRuleAlcPtnAsExpnsCostOrProfit:配賦方法_配賦パタン（費目別原価または利益） (END)
	// -- AlcRuleAlcPtnAsInptQty:配賦方法_配賦パタン（投入） (START)
	@Override
	protected void getAlcRuleAlcPtnAsInptQty_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_RULE_R t, MCList<?> result) {
		super.getAlcRuleAlcPtnAsInptQty_Set(row, builder, t, result);
		getAlcRuleAlcPtnAsInptQty_addSelectJoinCustom(row, builder, t, result);
		getAlcRuleAlcPtnAsInptQty_addWhereCustom(row, builder, t, result);
	}

	protected void getAlcRuleAlcPtnAsInptQty_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ALC_RULE_R.$alc_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		result.addDateColumn(AlcRuleAlcPtnAsInptQtyCols.$o_out_term);
		result.addDateColumn(AlcRuleAlcPtnAsInptQtyCols.$o_out_term_end_ym);
		builder.addWhereWithAnd(
				bracket(t.alc_rule_typ.eq(value(MAC_ALC_RULE_TYP.INPT_QTY.value()))));
		builder.addSelect(t.term.as("out_term"));
		if (row.getBooleanNE(AlcRuleAlcPtnAsInptQtyCols.$i_mode_this_term_flg)) {
			builder.addSelect(term.term_end_ym.as("out_term_end_ym"));
			builder.addInnerJoin(term, bracket(term.term.eq(t.term)));
		}
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAlcRuleAlcPtnAsInptQty_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(AlcRuleAlcPtnAsInptQtyCols.$i_mode_this_term_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getTermForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getTermForDpt(row));
		}
		else {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(AlcRuleAlcPtnAsInptQtyCols.$i_term));
		}
	}

	public <E extends MCRow> MCList getAlcRuleAlcPtnAsInptQty_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		if (inRow.getBooleanNE(AlcRuleAlcPtnAsInptQtyCols.$i_mode_this_term_flg)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				配賦方法マスタの期終了年月 <= 引数の期(実行年月)
					boolean cnd1 = row.getDateNE("out_term_end_ym")
							.gteDate(inRow.getDateNE(AlcRuleAlcPtnAsInptQtyCols.$i_term));
//				配賦方法マスタの期 >= 引数の期(実行年月)
					boolean cnd2 = row.getDateNE("out_term")
							.lteDate(inRow.getDateNE(AlcRuleAlcPtnAsInptQtyCols.$i_term));
					return (cnd1 && cnd2);
				}
			});
			return subRsltL;
		}
		else {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				原価部門マスタの期 = 引数の期
					boolean cnd1 = (row.getDateNE("out_term")
							.eqDate(inRow.getDateNE(AlcRuleAlcPtnAsInptQtyCols.$i_term)));
					return (cnd1);
				}
			});
			return subRsltL;
		}
	}

	protected MCMessage getAlcRuleAlcPtnAsInptQty_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0380,
				toYMString(row.getDateNE(AlcRuleAlcPtnAsInptQtyCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcRuleAlcPtnAsInptQty:配賦方法_配賦パタン（投入） (END)
	// -- AlcRuleAlcPtnAsOtherVal:配賦方法_配賦パタン（任意配賦基準値） (START)
	@Override
	protected void getAlcRuleAlcPtnAsOtherVal_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_RULE_R t, MCList<?> result) {
		super.getAlcRuleAlcPtnAsOtherVal_Set(row, builder, t, result);
		getAlcRuleAlcPtnAsOtherVal_addSelectJoinCustom(row, builder, t, result);
		getAlcRuleAlcPtnAsOtherVal_addWhereCustom(row, builder, t, result);
	}

	protected void getAlcRuleAlcPtnAsOtherVal_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ALC_RULE_R.$alc_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		result.addDateColumn(AlcRuleAlcPtnAsOtherValCols.$o_out_term);
		result.addDateColumn(AlcRuleAlcPtnAsOtherValCols.$o_out_term_end_ym);
		builder.addWhereWithAnd(
				bracket(t.alc_rule_typ.eq(value(MAC_ALC_RULE_TYP.OTHER_VAL.value()))));
		builder.addSelect(t.term.as("out_term"));
		if (row.getBooleanNE(AlcRuleAlcPtnAsOtherValCols.$i_mode_this_term_flg)) {
			builder.addSelect(term.term_end_ym.as("out_term_end_ym"));
			builder.addInnerJoin(term, bracket(term.term.eq(t.term)));
		}
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAlcRuleAlcPtnAsOtherVal_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(AlcRuleAlcPtnAsOtherValCols.$i_mode_this_term_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getTermForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getTermForDpt(row));
		}
		else {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(AlcRuleAlcPtnAsOtherValCols.$i_term));
		}
	}

	public <E extends MCRow> MCList getAlcRuleAlcPtnAsOtherVal_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		if (inRow.getBooleanNE(AlcRuleAlcPtnAsOtherValCols.$i_mode_this_term_flg)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				配賦方法マスタの期終了年月 <= 引数の期(実行年月)
					boolean cnd1 = row.getDateNE("out_term_end_ym").gteDate(
							inRow.getDateNE(AlcRuleAlcPtnAsOtherValCols.$i_term));
//				配賦方法マスタの期 >= 引数の期(実行年月)
					boolean cnd2 = row.getDateNE("out_term").lteDate(
							inRow.getDateNE(AlcRuleAlcPtnAsOtherValCols.$i_term));
					return (cnd1 && cnd2);
				}
			});
			return subRsltL;
		}
		else {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				原価部門マスタの期 = 引数の期
					boolean cnd1 = (row.getDateNE("out_term").eqDate(
							inRow.getDateNE(AlcRuleAlcPtnAsOtherValCols.$i_term)));
					return (cnd1);
				}
			});
			return subRsltL;
		}
	}

	protected MCMessage getAlcRuleAlcPtnAsOtherVal_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0381,
				toYMString(row.getDateNE(AlcRuleAlcPtnAsOtherValCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcRuleAlcPtnAsOtherVal:配賦方法_配賦パタン（任意配賦基準値） (END)
	// -- AlcTgtAlcPtnAsAlc:配賦対象区分_配賦パタン（汎用配賦） (START)
	@Override
	protected void getAlcTgtAlcPtnAsAlc_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_RULE_R t, MCList<?> result) {
		super.getAlcTgtAlcPtnAsAlc_Set(row, builder, t, result);
		getAlcTgtAlcPtnAsAlc_addSelectJoinCustom(row, builder, t, result);
		getAlcTgtAlcPtnAsAlc_addWhereCustom(row, builder, t, result);
	}

	protected void getAlcTgtAlcPtnAsAlc_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ALC_RULE_R.$alc_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		result.addDateColumn(AlcTgtAlcPtnAsAlcCols.$o_out_term);
		result.addDateColumn(AlcTgtAlcPtnAsAlcCols.$o_out_term_end_ym);
		builder.addWhereWithAnd(
				bracket(t.alc_tgt_typ.eq(value(MAC_ALC_TGT_TYP.ALC.value()))));
		builder.addSelect(t.term.as("out_term"));
		if (row.getBooleanNE(AlcTgtAlcPtnAsAlcCols.$i_mode_this_term_flg)) {
			builder.addSelect(term.term_end_ym.as("out_term_end_ym"));
			builder.addInnerJoin(term, bracket(term.term.eq(t.term)));
		}
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAlcTgtAlcPtnAsAlc_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(AlcTgtAlcPtnAsAlcCols.$i_mode_this_term_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getTermForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getTermForDpt(row));
		}
		else {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(AlcTgtAlcPtnAsAlcCols.$i_term));
		}
	}

	public <E extends MCRow> MCList getAlcTgtAlcPtnAsAlc_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		if (inRow.getBooleanNE(AlcTgtAlcPtnAsAlcCols.$i_mode_this_term_flg)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				配賦方法マスタの期終了年月 <= 引数の期(実行年月)
					boolean cnd1 = row.getDateNE("out_term_end_ym")
							.gteDate(inRow.getDateNE(AlcTgtAlcPtnAsAlcCols.$i_term));
//				配賦方法マスタの期 >= 引数の期(実行年月)
					boolean cnd2 = row.getDateNE("out_term")
							.lteDate(inRow.getDateNE(AlcTgtAlcPtnAsAlcCols.$i_term));
					return (cnd1 && cnd2);
				}
			});
			return subRsltL;
		}
		else {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				原価部門マスタの期 = 引数の期
					boolean cnd1 = (row.getDateNE("out_term")
							.eqDate(inRow.getDateNE(AlcTgtAlcPtnAsAlcCols.$i_term)));
					return (cnd1);
				}
			});
			return subRsltL;
		}
	}

	protected MCMessage getAlcTgtAlcPtnAsAlc_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0382,
				toYMString(row.getDateNE(AlcTgtAlcPtnAsAlcCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcTgtAlcPtnAsAlc:配賦対象区分_配賦パタン（汎用配賦） (END)
	// -- PreAlcRate:一次配賦基準 (START)
	@Override
	protected void getPreAlcRate_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		super.getPreAlcRate_Set(row, builder, t, result);
		if (row.contains(PreAlcRateCols.$i_pre_alc_ptn_cd)) {
			builder.addWhereWithAnd(t.pre_alc_ptn_cd.eq(bind("1")),
					row.getString(PreAlcRateCols.$i_pre_alc_ptn_cd));
		}
	}

	protected MCMessage getPreAlcRate_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(PreAlcRateCols.$i_pre_alc_ptn_cd))) {
			msg = new MCMessage(MAUAL0182, info);
		}
		else {
			msg = new MCMessage(MAUAL0332,
					row.getStringNE(PreAlcRateCols.$i_pre_alc_ptn_cd), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PreAlcRate:一次配賦基準 (END)
	// -- PreAlcRateInPreAlcCtg:一次配賦基準（一次配賦基準カテゴリ登録済） (START)
	@Override
	protected void getPreAlcRateInPreAlcCtg_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		super.getPreAlcRateInPreAlcCtg_Set(row, builder, t, result);
		getPreAlcRateInPreAlcCtg_addSelectJoinCustom(row, builder, t, result);
		getPreAlcRateInPreAlcCtg_addWhereCustom(row, builder, t, result);
	}

	protected void getPreAlcRateInPreAlcCtg_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_CTG_R m1 = MAM_PRE_ALC_CTG_R.create("M1");

		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(PreAlcRateInPreAlcCtgCols.$o_chk_calc_ctg_cd);
		result.addStringColumn(PreAlcRateInPreAlcCtgCols.$o_chk_wg_cd);
		result.addDateColumn(PreAlcRateInPreAlcCtgCols.$o_chk_term);
		result.addBooleanColumn(PreAlcRateInPreAlcCtgCols.$o_chk_pln_mly_flg);
		result.addBooleanColumn(PreAlcRateInPreAlcCtgCols.$o_chk_act_mly_flg);

		// Select句、結合の設定
		builder.addSelect(m1.calc_ctg_cd.as("chk_calc_ctg_cd"));
		builder.addSelect(m1.wg_cd.as("chk_wg_cd"));
		builder.addSelect(m1.term.as("chk_term"));
		builder.addSelect(t.pln_mly_flg.as("chk_pln_mly_flg"));
		builder.addSelect(t.act_mly_flg.as("chk_act_mly_flg"));

		builder.addInnerJoin(m1, bracket(m1.pre_alc_rate_cd.eq(t.pre_alc_rate_cd)));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getPreAlcRateInPreAlcCtg_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		MAM_PRE_ALC_CTG_R m1 = MAM_PRE_ALC_CTG_R.create("M1");

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithCutOffAnd(t.pre_alc_set_typ.eq(bind("1")),
				row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ));

		if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str)
				|| row.contains(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str)) {
			boolean pln = row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str);
			boolean act = row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str);
			if (pln && act) {
				if (row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_or_flg_str)) {
					builder.addWhereWithAnd(bracket(t.pln_mly_flg.eq(value(true))
							.or(t.act_mly_flg.eq(value(true)))));
				}
				else {
					builder.addWhereWithAnd(bracket(t.pln_mly_flg.eq(value(true))
							.and(t.act_mly_flg.eq(value(true)))));
				}
			}
			else if (pln) {
				builder.addWhereWithAnd(t.pln_mly_flg.eq(value(true)));
			}
			else if (act) {
				builder.addWhereWithAnd(t.act_mly_flg.eq(value(true)));
			}
		}

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(m1.calc_ctg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd));
		builder.addWhereWithAnd(m1.wg_cd.eq(bind("1")),
				row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd));
		builder.addWhereWithAnd(m1.term.eq(bind("1")),
				row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term));

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	public <E extends MCRow> MCList getPreAlcRateInPreAlcCtg_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		// 計算カテゴリＣＤとワーキンググループＣＤと期は必須
		MCList subRsltL = rsltL.subList("chk_calc_ctg_cd",
				inRow.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd));
		subRsltL = subRsltL.subList("chk_wg_cd",
				inRow.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd));
		subRsltL = subRsltL.subList("chk_term",
				inRow.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term));
		subRsltL = subRsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
				if (!inRow.contains(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str)
						|| !inRow
								.contains(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str)) {
					return true;
				}
				boolean in_pln = inRow
						.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str);
				boolean in_act = inRow
						.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str);
				boolean out_pln = row
						.getBooleanNE(PreAlcRateInPreAlcCtgCols.$o_chk_pln_mly_flg);
				boolean out_act = row
						.getBooleanNE(PreAlcRateInPreAlcCtgCols.$o_chk_act_mly_flg);

				if (in_pln && in_act) {
					if (inRow.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_or_flg_str)) {
						return out_pln || out_act;
					}
					else {
						return out_pln && out_act;
					}
				}
				else if (in_pln) {
					return out_pln;
				}
				else if (in_act) {
					return out_act;
				}
				return false;
			}
		});

		return subRsltL;
	}

	protected MCMessage getPreAlcRateInPreAlcCtg_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = null;
		if (!row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str)
				&& !row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str)) {
			if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ)) {
				msg = new MCMessage(MAUAL0183,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ),
						info);
			}
			else {
				msg = new MCMessage(MAUAL0383,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						info);
			}
		}
		else if (row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str)
				&& !row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str)) {
			if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ)) {
				msg = new MCMessage(MAUAL0342,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ),
						info);
			}
			else {
				msg = new MCMessage(MAUAL0384,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						info);
			}
		}
		else if (!row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_pln_mly_flg_str)
				&& row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_act_mly_flg_str)) {
			if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ)) {
				msg = new MCMessage(MAUAL0343,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ),
						info);
			}
			else {
				msg = new MCMessage(MAUAL0385,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						info);
			}
		}
		else if (row.getBooleanNE(PreAlcRateInPreAlcCtgCols.$i_or_flg_str)) {
			if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ)) {
				msg = new MCMessage(MAUAL0345,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ),
						info);
			}
			else {
				msg = new MCMessage(MAUAL0387,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						info);
			}
		}
		else {
			if (row.contains(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ)) {
				msg = new MCMessage(MAUAL0344,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_pre_alc_set_typ),
						info);
			}
			else {
				msg = new MCMessage(MAUAL0386,
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_calc_ctg_cd),
						row.getStringNE(PreAlcRateInPreAlcCtgCols.$i_wg_cd),
						toYMString(row.getDateNE(PreAlcRateInPreAlcCtgCols.$i_term)),
						info);
			}
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PreAlcRateInPreAlcCtg:一次配賦基準（一次配賦基準カテゴリ登録済） (END)
	// -- PreAlcRateNotPreAlcPtn:一次配賦基準（月次比率絞り込み） (START)
	@Override
	protected void getPreAlcRateNotPreAlcPtn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_PRE_ALC_RATE_R t, MCList<?> result) {
		super.getPreAlcRateNotPreAlcPtn_Set(row, builder, t, result);

		builder.addWhereWithCutOffAnd(t.pre_alc_set_typ.eq(bind("1")),
				row.getStringNE(PreAlcRateNotPreAlcPtnCols.$i_pre_alc_set_typ));

		boolean pln = row.getBooleanNE(PreAlcRateNotPreAlcPtnCols.$i_pln_mly_flg_str);
		boolean act = row.getBooleanNE(PreAlcRateNotPreAlcPtnCols.$i_act_mly_flg_str);
		if (pln && act) {
			if (row.getBooleanNE(PreAlcRateNotPreAlcPtnCols.$i_or_flg_str)) {
				builder.addWhereWithAnd(bracket(
						t.pln_mly_flg.eq(value(true)).or(t.act_mly_flg.eq(value(true)))));
			}
			else {
				builder.addWhereWithAnd(bracket(t.pln_mly_flg.eq(value(true))
						.and(t.act_mly_flg.eq(value(true)))));
			}
		}
		else if (pln) {
			builder.addWhereWithAnd(t.pln_mly_flg.eq(value(true)));
		}
		else if (act) {
			builder.addWhereWithAnd(t.act_mly_flg.eq(value(true)));
		}
	}

	// -- PreAlcRateNotPreAlcPtn:一次配賦基準（月次比率絞り込み） (END)
	// -- CostCtg:原価品群 (START)
	@Override
	protected void getCostCtg_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_CTG_R t,
			MCList<?> result) {
		super.getCostCtg_Set(row, builder, t, result);
		if (row.contains(CostCtgCols.$i_ctg_config_typ)) {
			builder.addWhereWithAnd(t.ctg_config_typ.eq(bind("1")),
					row.getStringNE(CostCtgCols.$i_ctg_config_typ));
		}
	}

	protected MCMessage getCostCtg_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(CostCtgCols.$i_ctg_config_typ))) {
			msg = new MCMessage(MAUAL0184, info);
		}
		else {
			msg = new MCMessage(MAUAL0331, row.getStringNE(CostCtgCols.$i_ctg_config_typ),
					info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- CostCtg:原価品群 (END)
	// -- CalcGrp:計算グループ (START)
	@Override
	protected void getCalcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t,
			MCList<?> result) {
		super.getCalcGrp_Set(row, builder, t, result);
		getCalcGrp_addSelectJoinCustom(row, builder, t, result);
		getCalcGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getCalcGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_GRP_R t, MCList<?> result) {
		// 固定条件

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getCalcGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_GRP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		if (row.getBooleanNE(CalcGrpCols.$i_std_flg)) {
			builder.addWhereWithAnd(
					t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.COST_STD.value())));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_calc_stk_flg)) {
			builder.addWhereWithAnd(
					t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value())));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_exp_or_not_stk_or_calc_stk_flg)) {
			builder.addWhereWithAnd(bracket(t.exp_calc_typ
					.neq(value(MAC_EXP_CALC_TYP.NON.value()))
					.or(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.NOT_STK.value())))
					.or(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value())))));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_exp_flg)) {
			builder.addWhereWithAnd(
					t.exp_calc_typ.neq(value(MAC_EXP_CALC_TYP.NON.value())));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_st_stk_flg)) {
			builder.addWhereWithAnd(bracket(t.exp_calc_typ
					.neq(value(MAC_EXP_CALC_TYP.NON.value()))
					.or(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value())))));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_alc_or_not_stk_or_calc_stk_flg)) {
			builder.addWhereWithAnd(bracket(t.alc_calc_typ
					.neq(value(MAC_ALC_CALC_TYP.NON.value()))
					.or(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.NOT_STK.value())))
					.or(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value())))));
		}
		if (row.getBooleanNE(CalcGrpCols.$i_alc_flg)) {
			builder.addWhereWithAnd(
					t.alc_calc_typ.neq(value(MAC_ALC_CALC_TYP.NON.value())));
		}

		if (row.contains(CalcGrpCols.$i_wk_calc_flg)) {
			builder.addWhereWithAnd(t.wk_calc_flg.eq(bind("1")),
					booleanToDBString(row.getBooleanNE(CalcGrpCols.$i_wk_calc_flg)));
		}

		if (row.contains(CalcGrpCols.$i_pre_alc_calc_flg)) {
			builder.addWhereWithAnd(
					t.pre_alc_calc_typ.eq(value(MAC_PRE_ALC_CALC_TYP.CALC.value())));
		}

		if (row.contains(CalcGrpCols.$i_prov_calc_flg)) {
			builder.addWhereWithAnd(t.prov_calc_flg.eq(bind("1")),
					booleanToDBString(row.getBooleanNE(CalcGrpCols.$i_prov_calc_flg)));
		}

		if (row.contains(CalcGrpCols.$i_inpt_calc_flg)) {
			builder.addWhereWithAnd(t.inpt_calc_flg.eq(bind("1")),
					booleanToDBString(row.getBooleanNE(CalcGrpCols.$i_inpt_calc_flg)));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
	}

	protected MCMessage getCalcGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0082, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- CalcGrp:計算グループ (END)
	// -- AlcCoefAsConfig:配賦係数（配賦係数構成マスタ） (START)
	@Override
	protected void getAlcCoefAsConfig_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_COEF_R t, MCList<?> result) {
		super.getAlcCoefAsConfig_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				t.coef_config_typ.eq(value(MAC_COEF_CONFIG_TYP.CONFIG.value())));
	}

	// -- AlcCoefAsConfig:配賦係数（配賦係数構成マスタ） (END)
	// -- AlcCoefAsNotConfig:配賦係数（配賦係数構成マスタ） (START)
	@Override
	protected void getAlcCoefAsNotConfig_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_COEF_R t, MCList<?> result) {
		super.getAlcCoefAsNotConfig_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				t.coef_config_typ.neq(value(MAC_COEF_CONFIG_TYP.CONFIG.value())));
	}

	// -- AlcCoefAsNotConfig:配賦係数（配賦係数構成マスタ） (END)
	// -- DptAlcGrp:部門配賦グループ (START)
	@Override
	protected void getDptAlcGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_DPT_R t, MCList<?> result) {
		super.getDptAlcGrp_Set(row, builder, t, result);
		getDptAlcGrp_addSelectJoinCustom(row, builder, t, result);
		getDptAlcGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getDptAlcGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_DPT_R t, MCList<?> result) {
		// 固定条件
		builder.setDistinct();

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getDptAlcGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_DPT_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.dpt_alc_grp.isNotNull(), row);

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.term.eq(bind("1")),
				row.getDateNE(DptAlcGrpCols.$i_term));
	}

	protected MCMessage getDptAlcGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0373,
				toYMString(row.getDateNE(DptAlcGrpCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- DptAlcGrp:部門配賦グループ (END)
	// -- LocAlcGrp:場所配賦グループ (START)
	@Override
	protected void getLocAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t,
			MCList<?> result) {
		super.getLocAlcGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.loc_alc_grp.isNotNull(), row);
	}

	// -- LocAlcGrp:場所配賦グループ (END)
	// -- OperAlcGrp:工程配賦グループ (START)
	@Override
	protected void getOperAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_OPER_R t,
			MCList<?> result) {
		super.getOperAlcGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.oper_alc_grp.isNotNull(), row);
	}

	// -- OperAlcGrp:工程配賦グループ (END)
	// -- BpAlcGrp:取引先配賦グループ (START)
	@Override
	protected void getBpAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		super.getBpAlcGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.bp_alc_grp.isNotNull(), row);
	}

	// -- BpAlcGrp:取引先配賦グループ (END)
	// -- CtgAlcGrp:品群配賦グループ (START)
	@Override
	protected void getCtgAlcGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_CTG_R t, MCList<?> result) {
		super.getCtgAlcGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.ctg_alc_grp.isNotNull(), row);
	}

	// -- CtgAlcGrp:品群配賦グループ (END)
	// -- ItmAlcGrp:品目配賦グループ (START)
	@Override
	protected void getItmAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t,
			MCList<?> result) {
		super.getItmAlcGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.itm_alc_grp.isNotNull(), row);
	}

	// -- ItmAlcGrp:品目配賦グループ (END)
	// -- CalcGrpRptCmpConf:計算グループ（原価レポート比較構成マスタ） (START)
	@Override
	protected void getCalcGrpRptCmpConf_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_GRP_R t, MCList<?> result) {
		super.getCalcGrpRptCmpConf_Set(row, builder, t, result);
		getCalcGrpRptCmpConf_addSelectJoinCustom(row, builder, t, result);
		getCalcGrpRptCmpConf_addWhereCustom(row, builder, t, result);
	}

	protected void getCalcGrpRptCmpConf_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result) {
		MAM_CALC_RPT_PTN_R cptn1 = MAM_CALC_RPT_PTN_R.create("CPTN1");
		MAM_RPT_CMP_R cmp1 = MAM_RPT_CMP_R.create("CMP1");

		result.addStringColumn(CalcGrpRptCmpConfCols.$o_chk_cmp_ptn_cd);

		if (row.contains(CalcGrpRptCmpConfCols.$i_cmp_ptn_cd)
				|| row.contains(getLLBindNm(CalcGrpRptCmpConfCols.$i_cmp_ptn_cd))) {
			builder.addSelect(cmp1.cmp_ptn_cd.as("chk_cmp_ptn_cd"));
			builder.addInnerJoin(cptn1, bracket(cptn1.calc_grp_cd.eq(t.calc_grp_cd)));
			builder.addInnerJoin(cmp1, bracket(cmp1.rpt_ptn_cd.eq(cptn1.rpt_ptn_cd)
					.and(cmp1.rpt_key_cd.eq(cptn1.rpt_key_cd))));
		}

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getCalcGrpRptCmpConf_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result) {
		MAM_RPT_CMP_R cmp1 = MAM_RPT_CMP_R.create("CMP1");
		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(cmp1.cmp_ptn_cd.eq(bind("1")),
				row.getStringNE(CalcGrpRptCmpConfCols.$i_cmp_ptn_cd));
	}

	public MCList getCalcGrpRptCmpConf_SrvChk(MCRow inRow, MCList rsltL) {
		if (!isNull(inRow.getStringNE(CalcGrpRptCmpConfCols.$i_cmp_ptn_cd))) {
			return rsltL.subList("chk_cmp_ptn_cd",
					inRow.getStringNE(CalcGrpRptCmpConfCols.$i_cmp_ptn_cd));
		}
		else {
			return rsltL;
		}
	}

	// -- CalcGrpRptCmpConf:計算グループ（原価レポート比較構成マスタ） (END)
	// -- ColCmpPtnRptCmpConf:項目（原価レポート比較集計マスタ） (START)
	@Override
	protected void getColCmpPtnRptCmpConf_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_RPT_CMP_CONF_R t, MCList<?> result) {
		super.getColCmpPtnRptCmpConf_Set(row, builder, t, result);
		getColCmpPtnRptCmpConf_addSelectJoinCustom(row, builder, t, result);
		getColCmpPtnRptCmpConf_addWhereCustom(row, builder, t, result);
	}

	protected void getColCmpPtnRptCmpConf_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result) {
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getColCmpPtnRptCmpConf_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		if (row.contains(ColCmpPtnRptCmpConfCols.$i_sml_flg)) {
			boolean sml = row.getBooleanNE(ColCmpPtnRptCmpConfCols.$i_sml_flg);
			builder.addWhereWithAnd(t.sml_flg.eq(bind("1")), booleanToDBString(sml));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）	
		builder.addWhereWithCutOffAnd(t.cmp_ptn_cd.eq(bind("1")),
				row.getStringNE(ColCmpPtnRptCmpConfCols.$i_cmp_ptn_cd));

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	protected MCMessage getColCmpPtnRptCmpConf_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(ColCmpPtnRptCmpConfCols.$i_cmp_ptn_cd))
				&& !row.getBooleanNE(ColCmpPtnRptCmpConfCols.$i_sml_flg)) {
			msg = new MCMessage(MAUAL0191, info);
		}
		else {
			msg = new MCMessage(MAUAL0341,
					row.getStringNE(ColCmpPtnRptCmpConfCols.$i_cmp_ptn_cd),
					row.getBooleanNE(ColCmpPtnRptCmpConfCols.$i_sml_flg), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ColCmpPtnRptCmpConf:項目（原価レポート比較集計マスタ） (END)
	// -- LgOrMfgWg:ＷＧ（物流または製造） (START)
	@Override
	protected void getLgOrMfgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getLgOrMfgWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				bracket(t.lg_flg.eq(value(true)).or(t.mfg_flg.eq(value(true)))));
		if (row.getBooleanNE(LgOrMfgWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(LgOrMfgWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getLgOrMfgWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LgOrMfgWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LgOrMfgWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- LgOrMfgWg:ＷＧ（物流または製造） (END)
	// -- LgGrpForLoc:物流グループ（場所設定可） (START)
	@Override
	protected void getLgGrpForLoc_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		super.getLgGrpForLoc_Set(row, builder, t, result);
		getLgGrpForLoc_addSelectJoinCustom(row, builder, t, result);
		getLgGrpForLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getLgGrpForLoc_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		MAVM_RD_LG_GRP_R rd_lg_grp = MAVM_RD_LG_GRP_R.create("RD_LG_GRP");
		MAVM_WR_LG_GRP_R wr_lg_grp = MAVM_WR_LG_GRP_R.create("WR_LG_GRP");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");

		// 固定のSelect句、結合の設定
		result.addStringColumn(LgGrpForLocCols.$o_out_alloc_grp_cd);
		if (row.getBooleanNE(LgGrpForLocCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_LG_GRPと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_lg_grp, bracket(rd_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
		}
		if (row.getBooleanNE(LgGrpForLocCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_LG_GRPと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_lg_grp, bracket(wr_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
		}

		// リストロジックチェック時
		if (isSrvChk(row)) {
			builder.addSelect(loc.alloc_grp_cd.as("out_alloc_grp_cd"));
			builder.addLeftOuterJoin(loc, bracket(loc.lg_grp_cd.eq(t.lg_grp_cd)));
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 動的のSelect句、結合の設定
		// なし
	}

	protected void getLgGrpForLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		MAM_LOC_R S1X = MAM_LOC_R.create("X");

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.loc_flg.eq(value(true)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")),
				row.getStringNE(LgGrpForLocCols.$i_wg_cd));
		builder.addWhereWithCutOffAnd(
				exists(subQuery().select(value("X")).from(S1X)
						.where(S1X.lg_grp_cd.eq(t.lg_grp_cd)
								.and(S1X.alloc_grp_cd.eq(bind("1"))))),
				row.getStringNE(LgGrpForLocCols.$i_alloc_grp_cd));
	}

	protected MCMessage getLgGrpForLoc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (!isNull(row.getStringNE(LgGrpForLocCols.$i_alloc_grp_cd))) {
			msg = new MCMessage(MAUAL0370, info);
		}
		else if (isNull(row.getStringNE(LgGrpForLocCols.$i_wg_cd))) {
			msg = new MCMessage(MAUAL0180, info);
		}
		else {
			msg = new MCMessage(MAUAL0324, row.getStringNE(LgGrpForLocCols.$i_wg_cd),
					info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	public MCList getLgGrpForLoc_SrvChk(MCRow inRow, MCList rsltL) {
		if (!isNull(inRow.getStringNE(LgGrpForLocCols.$i_alloc_grp_cd))) {
			return rsltL.subList("out_alloc_grp_cd",
					inRow.getStringNE(LgGrpForLocCols.$i_alloc_grp_cd));
		}
		else {
			return rsltL;
		}
	}

	protected void getLgGrpForLoc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LgGrpForLocCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LgGrpForLocCols.$o_lg_grp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- LgGrpForLoc:物流グループ（場所設定可） (END)
	// -- RptKeyWithTyp:原価レポートキー（区分も表示） (START)
	@Override
	protected void getRptKeyWithTyp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_RPT_KEY_R t, MCList<?> result) {
		super.getRptKeyWithTyp_Set(row, builder, t, result);
		result.addStringColumn(RptKeyWithTypCols.$o_rpt_key_typ_nm);
		builder.addSelect(nullValue().as("rpt_key_typ_nm"));
	}

	// -- RptKeyWithTyp:原価レポートキー（区分も表示） (END)
	// -- RptRow:原価レポート行 (START)
	@Override
	protected void getRptRow_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CONF_R t,
			MCList<?> result) {
		super.getRptRow_Set(row, builder, t, result);
		if (row.contains(RptRowCols.$i_rpt_ptn_cd)) {
			builder.addWhereWithAnd(t.rpt_ptn_cd.eq(bind("1")),
					row.getStringNE(RptRowCols.$i_rpt_ptn_cd));
		}
		if (row.contains(RptRowCols.$i_sml_flg)) {
			builder.addWhereWithAnd(t.sml_flg.eq(bind("1")),
					row.getBooleanNE(RptRowCols.$i_sml_flg));
		}
	}

	protected MCMessage getRptRow_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		if (row.contains(RptRowCols.$i_sml_flg)) {
			MCMessage msg = new MCMessage(MAUAL0195,
					row.getStringNE(RptRowCols.$i_rpt_ptn_cd),
					row.getBooleanNE(RptRowCols.$i_sml_flg), info);
			return msg.setCauseRow(causeRow, causeCol);
		}
		else {
			MCMessage msg = new MCMessage(MAUAL0377,
					row.getStringNE(RptRowCols.$i_rpt_ptn_cd), info);
			return msg.setCauseRow(causeRow, causeCol);
		}
	}

	// -- RptRow:原価レポート行 (END)
	// -- CostCalcGrp:計算グループ（原価計算） (START)
	@Override
	protected void getCostCalcGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_GRP_R t, MCList<?> result) {
		super.getCostCalcGrp_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				bracket(t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.NOT_STK.value())).or(
						t.cost_calc_typ.eq(value(MAC_COST_CALC_TYP.CALC_STK.value())))));
	}

	// -- CostCalcGrp:計算グループ（原価計算） (END)
	// -- SlsItmGrpBtm:品目体系（最下層） (START)
	@Override
	protected void getSlsItmGrpBtm_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_SLS_ITM_GRP_R t, MCList<?> result) {
		super.getSlsItmGrpBtm_Set(row, builder, t, result);
		getSlsItmGrpBtm_addSelectJoinCustom(row, builder, t, result);
		getSlsItmGrpBtm_addWhereCustom(row, builder, t, result);
	}

	protected void getSlsItmGrpBtm_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_SLS_ITM_GRP_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

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

	protected void getSlsItmGrpBtm_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SLS_ITM_GRP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.sls_itm_grp_lvl.eq(bind("1")),
				row.getNumberNE(SlsItmGrpBtmCols.$i_sls_itm_grp_lvl));
	}

	protected MCMessage getSlsItmGrpBtm_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getNumberNE(SlsItmGrpBtmCols.$i_sls_itm_grp_lvl))) {
			msg = new MCMessage(MAUAL0198, info);
		}
		else {
			msg = new MCMessage(MAUAL0333,
					row.getNumberNE(SlsItmGrpBtmCols.$i_sls_itm_grp_lvl), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SlsItmGrpBtm:品目体系（最下層） (END)
	// -- PreAlcDptInTerm:配賦先部門パタン（期ごと） (START)
	@Override
	protected void getPreAlcDptInTerm_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_PRE_ALC_DPT_R t, MCList<?> result) {
		super.getPreAlcDptInTerm_Set(row, builder, t, result);
		builder.setDistinct();
		if (row.contains(PreAlcDptInTermCols.$i_term)) {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(PreAlcDptInTermCols.$i_term));
		}
	}

	protected MCMessage getPreAlcDptInTerm_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0178,
				toYMString(row.getDateNE(PreAlcDptInTermCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- PreAlcDptInTerm:配賦先部門パタン（期ごと） (END)
	// -- RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録） (START)
	@Override
	protected void getRptKeyWithTypNotInRptKeyConf_Set(MCRow row,
			MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result) {
		MAM_RPT_KEY_CONF_R S1M1 = MAM_RPT_KEY_CONF_R.create("M1");

		super.getRptKeyWithTypNotInRptKeyConf_Set(row, builder, t, result);
		result.addStringColumn(RptKeyWithTypNotInRptKeyConfCols.$o_rpt_key_typ_nm);
		builder.addSelect(
				nullValue().as(RptKeyWithTypNotInRptKeyConfCols.$o_rpt_key_typ_nm));
		builder.addWhereWithAnd(notExists(subQuery().select(S1M1.prAll()).from(S1M1)
				.where(S1M1.rpt_key_cd.eq(t.rpt_key_cd))));
	}

	// -- RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録） (END)
	// -- RptPtnNotInRptConf:原価レポートパタン（レポート構成未登録） (START)
	@Override
	protected void getRptPtnNotInRptConf_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_RPT_PTN_R t, MCList<?> result) {
		MAM_RPT_CONF_R S1M1 = MAM_RPT_CONF_R.create("M1");

		super.getRptPtnNotInRptConf_Set(row, builder, t, result);
		builder.addWhereWithAnd(notExists(subQuery().select(S1M1.prAll()).from(S1M1)
				.where(S1M1.rpt_ptn_cd.eq(t.rpt_ptn_cd))));
	}

	// -- RptPtnNotInRptConf:原価レポートパタン（レポート構成未登録） (END)
	// -- ProdOrSgaExpns:原価費目（製造・売上原価費目または販売・一般管理費目） (START)
	@Override
	protected void getProdOrSgaExpns_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_EXPNS_R t, MCList<?> result) {
		super.getProdOrSgaExpns_Set(row, builder, t, result);
		builder.addWhereWithAnd(bracket(t.expns_typ.eq(value(MAC_EXPNS_TYP.PROD.value()))
				.or(t.expns_typ.eq(value(MAC_EXPNS_TYP.SGA.value())))));
	}

	// -- ProdOrSgaExpns:原価費目（製造・売上原価費目または販売・一般管理費目） (END)
	// -- AlcRuleAlcPtnAsWk:配賦方法_配賦パタン（工数） (START)
	@Override
	protected void getAlcRuleAlcPtnAsWk_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ALC_RULE_R t, MCList<?> result) {
		super.getAlcRuleAlcPtnAsWk_Set(row, builder, t, result);
		getAlcRuleAlcPtnAsWk_addSelectJoinCustom(row, builder, t, result);
		getAlcRuleAlcPtnAsWk_addWhereCustom(row, builder, t, result);
	}

	protected void getAlcRuleAlcPtnAsWk_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ALC_RULE_R.$alc_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		result.addDateColumn(AlcRuleAlcPtnAsWkCols.$o_out_term);
		result.addDateColumn(AlcRuleAlcPtnAsWkCols.$o_out_term_end_ym);
		builder.addWhereWithAnd(t.alc_rule_typ.eq(value(MAC_ALC_RULE_TYP.WK.value())));
		builder.addSelect(t.term.as("out_term"));
		if (row.getBooleanNE(AlcRuleAlcPtnAsWkCols.$i_mode_this_term_flg)) {
			builder.addSelect(term.term_end_ym.as("out_term_end_ym"));
			builder.addInnerJoin(term, bracket(term.term.eq(t.term)));
		}
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAlcRuleAlcPtnAsWk_addWhereCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(AlcRuleAlcPtnAsWkCols.$i_mode_this_term_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getTermForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getTermForDpt(row));
		}
		else {
			builder.addWhereWithAnd(t.term.eq(bind("1")),
					row.getDateNE(AlcRuleAlcPtnAsWkCols.$i_term));
		}
	}

	public <E extends MCRow> MCList getAlcRuleAlcPtnAsWk_SrvChk(MCRow inRow,
			MCList<E> rsltL) {
		if (inRow.getBooleanNE(AlcRuleAlcPtnAsWkCols.$i_mode_this_term_flg)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				配賦方法マスタの期終了年月 <= 引数の期(実行年月)
					boolean cnd1 = row.getDateNE("out_term_end_ym")
							.gteDate(inRow.getDateNE(AlcRuleAlcPtnAsWkCols.$i_term));
//				配賦方法マスタの期 >= 引数の期(実行年月)
					boolean cnd2 = row.getDateNE("out_term")
							.lteDate(inRow.getDateNE(AlcRuleAlcPtnAsWkCols.$i_term));
					return (cnd1 && cnd2);
				}
			});
			return subRsltL;
		}
		else {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
//				原価部門マスタの期 = 引数の期
					boolean cnd1 = (row.getDateNE("out_term")
							.eqDate(inRow.getDateNE(AlcRuleAlcPtnAsWkCols.$i_term)));
					return (cnd1);
				}
			});
			return subRsltL;
		}
	}

	protected MCMessage getAlcRuleAlcPtnAsWk_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		MCMessage msg = new MCMessage(MAUAL0211,
				toYMString(row.getDateNE(AlcRuleAlcPtnAsWkCols.$i_term)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AlcRuleAlcPtnAsWk:配賦方法_配賦パタン（工数） (END)
	// -- AprvRt:承認ルートパタン (START)
	@Override
	protected void getAprvRt_Set(MCRow row, MCQueryApiBuilder builder, MAM_APRV_RT_R t,
			MCList<?> result) {
		super.getAprvRt_Set(row, builder, t, result);
		builder.setDistinct();
		if (row.contains(AprvRtCols.$i_aprv_func_typ)) {
			builder.addWhereWithAnd(t.aprv_func_typ.eq(bind("1")),
					row.getStringNE(AprvRtCols.$i_aprv_func_typ));
		}
	}

	protected MCMessage getAprvRt_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0213,
				row.getStringNE(AprvRtCols.$i_aprv_func_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AprvRt:承認ルートパタン (END)
	// -- LgOrMfgOrSlsWg:ＷＧ（物流または製造または販売） (START)
	@Override
	protected void getLgOrMfgOrSlsWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getLgOrMfgOrSlsWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(bracket(t.lg_flg.eq(value(true))
				.or(t.mfg_flg.eq(value(true))).or(t.sls_flg.eq(value(true)))));
		if (row.getBooleanNE(LgOrMfgOrSlsWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(LgOrMfgOrSlsWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getLgOrMfgOrSlsWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LgOrMfgOrSlsWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LgOrMfgOrSlsWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- LgOrMfgOrSlsWg:ＷＧ（物流または製造または販売） (END)
	// -- ItmInspPtn:品目検査パタン (START)
	@Override
	protected void getItmInspPtn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ITM_INSP_PTN_R t, MCList<?> result) {
		super.getItmInspPtn_Set(row, builder, t, result);
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ITM_INSP_PTN_R.$insp_ptn_nm);
		builder.removeSelect(MAM_ITM_INSP_PTN_R.$insp_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);
		builder.addSelectNEActiveForeign(MAM_ITM_INSP_PTN_R.$insp_ptn_nm,
				t.getColumn$(MAM_ITM_INSP_PTN_R.$insp_ptn_nm));

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(ItmInspPtnCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmInspPtnCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmInspPtnCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmInspPtnCols.$i_itm_sub3));
			builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)),
					row.getDateNE(ItmInspPtnCols.$i_dt));
		}
	}

	protected MCMessage getItmInspPtn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmInspPtnCols.$i_itm_cd),
				row.getStringNE(ItmInspPtnCols.$i_itm_sub1),
				row.getStringNE(ItmInspPtnCols.$i_itm_sub2),
				row.getStringNE(ItmInspPtnCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0215, itmInfo,
				toYMDString(row.getDateNE(ItmInspPtnCols.$i_dt)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmInspPtn:品目検査パタン (END)
	// -- LgGrpNotForLoc:物流グループ（場所設定不可） (START)
	@Override
	protected void getLgGrpNotForLoc_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		super.getLgGrpNotForLoc_Set(row, builder, t, result);
		getLgGrpNotForLoc_addSelectJoinCustom(row, builder, t, result);
		getLgGrpNotForLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getLgGrpNotForLoc_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		MAVM_RD_LG_GRP_R rd_lg_grp = MAVM_RD_LG_GRP_R.create("RD_LG_GRP");
		MAVM_WR_LG_GRP_R wr_lg_grp = MAVM_WR_LG_GRP_R.create("WR_LG_GRP");

		// 固定のSelect句、結合の設定
		if (row.getBooleanNE(LgGrpNotForLocCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_LG_GRPと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_lg_grp, bracket(rd_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
		}
		if (row.getBooleanNE(LgGrpNotForLocCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_LG_GRPと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_lg_grp, bracket(wr_lg_grp.lg_grp_cd.eq(t.lg_grp_cd)));
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

	protected void getLgGrpNotForLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_GRP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）	
		builder.addWhereWithAnd(t.loc_flg.eq(value(false)));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")),
				row.getStringNE(LgGrpNotForLocCols.$i_wg_cd));
	}

	protected MCMessage getLgGrpNotForLoc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(LgGrpNotForLocCols.$i_wg_cd))) {
			msg = new MCMessage(MAUAL0206, info);
		}
		else {
			msg = new MCMessage(MAUAL0334, row.getStringNE(LgGrpNotForLocCols.$i_wg_cd),
					info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- LgGrpNotForLoc:物流グループ（場所設定不可） (END)
	// -- ItmInspPtnAsSpec:品目検査パタン（抜取規格検査） (START)
	@Override
	protected void getItmInspPtnAsSpec_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_ITM_INSP_PTN_R t, MCList<?> result) {

		super.getItmInspPtnAsSpec_Set(row, builder, t, result);

		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_ITM_INSP_PTN_R.$insp_ptn_nm);
		builder.removeSelect(MAM_ITM_INSP_PTN_R.$insp_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);
		builder.addSelectNEActiveForeign(MAM_ITM_INSP_PTN_R.$insp_ptn_nm,
				t.getColumn$(MAM_ITM_INSP_PTN_R.$insp_ptn_nm));

		builder.addWhereWithAnd(t.insp_mtd_typ.eq(value(MAC_INSP_MTD_TYP.SPEC.value())));
		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub3));
			builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)),
					row.getDateNE(ItmInspPtnAsSpecCols.$i_dt));
		}
	}

	protected MCMessage getItmInspPtnAsSpec_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_cd),
				row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub1),
				row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub2),
				row.getStringNE(ItmInspPtnAsSpecCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0220, itmInfo,
				toYMDString(row.getDateNE(ItmInspPtnAsSpecCols.$i_dt)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmInspPtnAsSpec:品目検査パタン（抜取規格検査） (END)
	// -- BomPtn:構成パタン (START)
	@Override
	protected void getBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t,
			MCList<?> result) {
		super.getBomPtn_Set(row, builder, t, result);
		builder.setDistinct();

		builder.addWhereWithAnd(t.par_itm_cd.eq(bind("1")),
				row.getString(BomPtnCols.$i_par_itm_cd));
		builder.addWhereWithAnd(t.par_itm_sub1.eq(bind("1")),
				row.getStringNE(BomPtnCols.$i_par_itm_sub1));
		builder.addWhereWithAnd(t.par_itm_sub2.eq(bind("1")),
				row.getStringNE(BomPtnCols.$i_par_itm_sub2));
		builder.addWhereWithAnd(t.par_itm_sub3.eq(bind("1")),
				row.getStringNE(BomPtnCols.$i_par_itm_sub3));
		builder.addWhereWithCutOffAnd(
				bracket(t.wg_cd.eq(bind("1"))
						.or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				row.getStringNE(BomPtnCols.$i_wg_cd));
	}

	// -- BomPtn:構成パタン (END)
	// -- BomPtnParChd:構成パタン(親子)(START)
	@Override
	protected void getBomPtnParChd_Set(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t,
			MCList<?> result) {
		super.getBomPtnParChd_Set(row, builder, t, result);
		builder.setDistinct();

		builder.addWhereWithAnd(bracket(t.par_itm_cd.eq(bind("1"))
				.and(t.par_itm_sub1.eq(bind("2"))).and(t.par_itm_sub2.eq(bind("3")))
				.and(t.par_itm_sub3.eq(bind("4"))).or(t.chd_itm_cd.eq(bind("1")))
				.and(t.chd_itm_sub1.eq(bind("2"))).and(t.chd_itm_sub2.eq(bind("3")))
				.and(t.chd_itm_sub3.eq(bind("4")))),
				row.getString(BomPtnParChdCols.$i_itm_cd),
				row.getStringNE(BomPtnParChdCols.$i_itm_sub1),
				row.getStringNE(BomPtnParChdCols.$i_itm_sub2),
				row.getStringNE(BomPtnParChdCols.$i_itm_sub3));
		builder.addWhereWithCutOffAnd(
				bracket(t.wg_cd.eq(bind("1"))
						.or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				row.getStringNE(BomPtnParChdCols.$i_wg_cd));
	}

	// -- BomPtnParChd:構成パタン構成パタン(親子) (END)
	// -- SplnItm:販売計画品目 (START)
	@Override
	protected void getSplnItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SPLN_ITM_R t,
			MCList<?> result) {
		super.getSplnItm_Set(row, builder, t, result);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm1);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm2);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm3);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm4);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm5);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm6);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm7);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm8);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm9);
		result.addStringColumn(SplnItmCols.$o_itm_grp_nm10);
		setSelectJoinOfItmGrpForItm(row, builder);

		if (!isSrvChk(row)) {
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
			builder.addWhereWithCutOffAnd(t.spln_itm_cd.like(bind("1")),
					getEditString(row, SplnItmCols.$i_spln_itm_cd));
			builder.addWhereWithCutOffAnd(t.spln_itm_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_spln_itm_nm));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd1.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd1));
			builder.addWhereWithCutOffAnd(grp1.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm1));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd2.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd2));
			builder.addWhereWithCutOffAnd(grp2.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm2));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd3.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd3));
			builder.addWhereWithCutOffAnd(grp3.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm3));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd4.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd4));
			builder.addWhereWithCutOffAnd(grp4.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm4));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd5.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd5));
			builder.addWhereWithCutOffAnd(grp5.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm5));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd6.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd6));
			builder.addWhereWithCutOffAnd(grp6.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm6));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd7.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd7));
			builder.addWhereWithCutOffAnd(grp7.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm7));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd8.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd8));
			builder.addWhereWithCutOffAnd(grp8.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm8));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd9.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd9));
			builder.addWhereWithCutOffAnd(grp9.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm9));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd10.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_cd10));
			builder.addWhereWithCutOffAnd(grp10.itm_grp_nm.like(bind("1")),
					getEditString(row, SplnItmCols.$i_itm_grp_nm10));
		}
	}

	@Override
	protected MCList<?> getSplnItm_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_SPLN_ITM_R t, MCList<?> result) {
		MCList<?> l = super.getSplnItm_AfterSelect(row, builder, t, result);
		l.addStringColumn(SplnItmCols.$o_spln_set_typ_nm);
		MAC_SPLN_SET_TYP.putNameNE(l, SplnItmCols.$o_spln_set_typ,
				SplnItmCols.$o_spln_set_typ_nm);
		return l;
	}

	protected void getSplnItm_NullVal(MCRow row, MCList<MCRow> down) {
//		if (row.getBooleanNE(SplnItmCols.$i_mode_nullval_flg)) {
//			MCRow r = down.createRow();
//			r.setStringNE(SplnItmCols.$o_spln_itm_cd, MAC_STR.NULL_VAL.value());
//			down.add(r);
//		}
	}

	// -- SplnItm:販売計画品目 (END)
	// -- ItmVer:版 (START)
	@Override
	protected void getItmVer_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_VER_R t,
			MCList<?> result) {
		super.getItmVer_Set(row, builder, t, result);
		getItmVer_addSelectJoinCustom(row, builder, t, result);
		getItmVer_addWhereCustom(row, builder, t, result);
	}

	protected void getItmVer_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_ITM_VER_R t, MCList<?> result) {

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(ItmVerCols.$o_disp_purc_st_dt);

		// Select句、結合の設定
		if (!isSrvChk(row)) {
			builder.setDistinct();
			builder.setSelect(t.ver_no, t.purc_st_dt);
		}
	}

	protected void getItmVer_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_ITM_VER_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
				row.getStringNE(ItmVerCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
				row.getStringNE(ItmVerCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
				row.getStringNE(ItmVerCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
				row.getStringNE(ItmVerCols.$i_itm_sub3));
		if (row.contains(ItmVerCols.$i_site_cd)) {
			builder.addWhereWithAnd(t.site_cd.eq(bind("1")),
					row.getString(ItmVerCols.$i_site_cd));
		}
	}

	protected MCMessage getItmVer_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmVerCols.$i_itm_cd),
				row.getStringNE(ItmVerCols.$i_itm_sub1),
				row.getStringNE(ItmVerCols.$i_itm_sub2),
				row.getStringNE(ItmVerCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0051, itmInfo,
				nullToBlank(row.getStringNE(ItmVerCols.$i_site_cd)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmVer:版 (END)
	// -- PlmWg:ＷＧ（ＰＬＭ） (START)
	@Override
	protected void getPlmWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {
		MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
		MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");

		super.getPlmWg_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.plm_flg.eq(value(true)));
		if (row.getBooleanNE(PlmWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(PlmWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getPlmWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(PlmWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(PlmWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	// -- PlmWg:ＷＧ（ＰＬＭ） (END)

	// -- Rsrc:資源 (START)
	@Override
	protected void getRsrc_Set(MCRow row, MCQueryApiBuilder builder, MAM_RSRC_R t,
			MCList<?> result) {
		super.getRsrc_Set(row, builder, t, result);
		getRsrc_addSelectJoinCustom(row, builder, t, result);
		getRsrc_addWhereCustom(row, builder, t, result);
	}

	protected void getRsrc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_RSRC_R t, MCList<?> result) {
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(RsrcCols.$o_loc_cd);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			builder.addSelect(m1.loc_cd);
			builder.addLeftOuterJoin(m1,
					bracket(m1.rsrc_cd1.eq(t.rsrc_cd).or(m1.rsrc_cd2.eq(t.rsrc_cd))));
		}
	}

	protected void getRsrc_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_RSRC_R t, MCList<?> result) {
		MAM_LOC_R S1LOC = MAM_LOC_R.create("LOC");

		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (!isNull(row.getStringNE(RsrcCols.$i_loc_cd))) {
			builder.addWhereWithAnd(
					exists(subQuery().select(value("X")).from(S1LOC)
							.where(S1LOC.loc_cd.eq(bind("1"))
									.and(S1LOC.rsrc_cd1.eq(t.rsrc_cd)
											.or(S1LOC.rsrc_cd2.eq(t.rsrc_cd))))),
					row.getString(RsrcCols.$i_loc_cd));
		}
	}

	public MCList getRsrc_SrvChk(MCRow inRow, MCList rsltL) {
		if (!isNull(inRow.getStringNE(RsrcCols.$i_loc_cd))) {
			return rsltL.subList("loc_cd", inRow.getStringNE(RsrcCols.$i_loc_cd));
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getRsrc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(RsrcCols.$i_loc_cd))) {
			msg = new MCMessage(MAUAL0233, info);
		}
		else {
			msg = new MCMessage(MAUAL0336, row.getStringNE(RsrcCols.$i_loc_cd), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- Rsrc:資源 (END)
	// -- ItmUnit:品目単位 (START)
	@Override
	protected void getItmUnit_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_UNIT_R t,
			MCList<?> result) {
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");

		super.getItmUnit_Set(row, builder, t, result);
		result.addStringColumn(ItmUnitCols.$o_unit_nm);
		builder.addSelect(unit.unit_nm);
		builder.addInnerJoin(unit, bracket(unit.unit_cd.eq(t.unit_cd)));

		if (!isSrvChk(row)) {
			builder.addWhereWithCutOffAnd(t.unit_cd.eq(bind("1")),
					row.getStringNE(ItmUnitCols.$i_unit_cd));
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(ItmUnitCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmUnitCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmUnitCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmUnitCols.$i_itm_sub3));
		}
	}

	protected MCMessage getItmUnit_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmUnitCols.$i_itm_cd),
				row.getStringNE(ItmUnitCols.$i_itm_sub1),
				row.getStringNE(ItmUnitCols.$i_itm_sub2),
				row.getStringNE(ItmUnitCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0242, itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmUnit:品目単位 (END)
	// -- AltGrp:代替グループ (START)
	@Override
	protected void getAltGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP_R t,
			MCList<?> result) {
		super.getAltGrp_Set(row, builder, t, result);
		if (!isSrvChk(row)) {
			builder.addWhereWithCutOffAnd(t.alt_grp_cd.eq(bind("1")),
					row.getStringNE(AltGrpCols.$i_alt_grp_cd));
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")),
					row.getStringNE(AltGrpCols.$i_wg_cd));
		}
	}

	protected MCMessage getAltGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0251, row.getStringNE(AltGrpCols.$i_wg_cd),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AltGrp:代替グループ (END)
	// -- AltGrpBom:代替グループ（ＢＯＭ登録） (START)
	@Override
	protected void getAltGrpBom_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP__R t,
			MCList<?> result) {
		super.getAltGrpBom_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.del_flg.eq(value(false)));
		if (!isSrvChk(row)) {
			builder.addWhereWithCutOffAnd(t.alt_grp_cd.eq(bind("1")),
					row.getStringNE(AltGrpBomCols.$i_alt_grp_cd));
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")),
					row.getStringNE(AltGrpBomCols.$i_wg_cd));
		}
	}

	protected MCMessage getAltGrpBom_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0251, row.getStringNE(AltGrpBomCols.$i_wg_cd),
				info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AltGrpBom:代替グループ（ＢＯＭ登録） (END)
	// -- ItmSpec:品目仕様 (START)
	@Override
	protected void getItmSpec_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SPEC_R t,
			MCList<?> result) {
		super.getItmSpec_Set(row, builder, t, result);

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.itm_spec_grp_cd.eq(bind("1")),
					row.getStringNE(ItmSpecCols.$i_itm_spec_grp_cd));
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(ItmSpecCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmSpecCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmSpecCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmSpecCols.$i_itm_sub3));
		}
	}

	protected MCMessage getItmSpec_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmSpecCols.$i_itm_cd),
				row.getStringNE(ItmSpecCols.$i_itm_sub1),
				row.getStringNE(ItmSpecCols.$i_itm_sub2),
				row.getStringNE(ItmSpecCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0252, itmInfo,
				row.getStringNE(ItmSpecCols.$i_itm_spec_grp_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmSpec:品目仕様 (END)
	// -- BpItm:取引先品目 (START)
	@Override
	protected void getBpItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t,
			MCList<?> result) {
		super.getBpItm_Set(row, builder, t, result);

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.bp_cd.eq(bind("1")),
					row.getStringNE(BpItmCols.$i_bp_cd));
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(BpItmCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(BpItmCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(BpItmCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(BpItmCols.$i_itm_sub3));
			builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)),
					row.getDateNE(BpItmCols.$i_dt));
		}
	}

	protected MCMessage getBpItm_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(BpItmCols.$i_itm_cd),
				row.getStringNE(BpItmCols.$i_itm_sub1),
				row.getStringNE(BpItmCols.$i_itm_sub2),
				row.getStringNE(BpItmCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0253, row.getStringNE(BpItmCols.$i_bp_cd),
				itmInfo, toYMDString(row.getDateNE(BpItmCols.$i_dt)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- BpItm:取引先品目 (END)
	// -- ItmLcl:品目（ロケール別） (START)
	@Override
	protected void getItmLcl_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_LCL_R t,
			MCList<?> result) {
		super.getItmLcl_Set(row, builder, t, result);

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.lcl_cd.eq(bind("1")),
					row.getStringNE(ItmLclCols.$i_lcl_cd));
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getStringNE(ItmLclCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmLclCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmLclCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmLclCols.$i_itm_sub3));
		}
	}

	// -- ItmLcl:品目（ロケール別） (END)
	// -- ItmOper:品目工程 (START)
	@Override
	protected void getItmOper_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t,
			MCList<?> result) {
		super.getItmOper_Set(row, builder, t, result);
		builder.setDistinct();
		result.addStringColumn(ItmOperCols.$o_chk_loc_cd); // リストロジックチェックで使用
		builder.addSelect(t.loc_cd.as("chk_loc_cd"));

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
					row.getString(ItmOperCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
					row.getStringNE(ItmOperCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
					row.getStringNE(ItmOperCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
					row.getStringNE(ItmOperCols.$i_itm_sub3));
			builder.addWhereWithCutOffAnd(
					bracket(t.loc_cd.eq(bind("1"))
							.or(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value())))),
					row.getStringNE(ItmOperCols.$i_loc_cd));
			builder.addWhereWithCutOffAnd(bracket(bind("1").between(t.st_dt, t.end_dt)),
					row.getDateNE(ItmOperCols.$i_dt));
		}
	}

	protected void getItmOper_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmOperCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmOperCols.$o_oper_ptn, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getItmOper_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmOperCols.$i_itm_cd),
				row.getStringNE(ItmOperCols.$i_itm_sub1),
				row.getStringNE(ItmOperCols.$i_itm_sub2),
				row.getStringNE(ItmOperCols.$i_itm_sub3));
		MCMessage msg = new MCMessage(MAUAL0255, itmInfo,
				row.getStringNE(ItmOperCols.$i_loc_cd),
				toYMDString(row.getDateNE(ItmOperCols.$i_dt)), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	public MCList getItmOper_SrvChk(MCRow inRow, MCList rsltL) {
		if (isNull(inRow.getStringNE(ItmOperCols.$i_loc_cd))) {
			return rsltL;
		}
		else {
			MCList ret = rsltL.subList("chk_loc_cd",
					inRow.getStringNE(ItmOperCols.$i_loc_cd));
			// 場所が一致するレコードを抽出し結果が無ければ、NULL文字で再抽出する
			if (ret.isEmpty()) {
				ret = rsltL.subList("chk_loc_cd", MAC_STR.NULL_VAL.value());
			}
			return ret;
		}
	}

	// -- ItmOper:品目工程 (END)
	// -- ShipTerm:出荷条件 (START)
	@Override
	public MCList<MCRow> getShipTerm(MCRow row) {
		MCList<MAM_SHIP_TERM_R> result = MCList.create(MAM_SHIP_TERM_R.class);
		MAM_SHIP_TERM_R dbc = MAM_SHIP_TERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipTerm_Set(row, builder, dbc, result);//DBコンテナの設定
		if (!isSrvChk(row) && (isNull(row.getStringNE(ShipTermCols.$i_fr_lg_grp_cd))
				|| isNull(row.getStringNE(ShipTermCols.$i_to_lg_grp_cd)))) {
			dbSelect(createSqlId("MA.MAUAL0010.ShipTerm_getShipTerm", dbc, "S02"), result,
					builder);
		}
		else if (isSrvChk(row) && (isNull(
				row.getStringNE(getLLBindNm(ShipTermCols.$i_fr_lg_grp_cd)))
				|| isNull(row.getStringNE(getLLBindNm(ShipTermCols.$i_to_lg_grp_cd))))) {
			dbSelect(createSqlId("MA.MAUAL0010.ShipTerm_getShipTerm", dbc, "S03"), result,
					builder);
		}
		else {
			getShipTerm_addSelectJoinWk(row, builder, dbc, result);
		}
		MCList<? extends MCRow> down = getShipTerm_AfterSelect(row, builder, dbc, result);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ShipTerm");
		if (isNull(down)) return null;
		return getShipTerm_SubColumns(row, down);
	}

	@Override
	protected void getShipTerm_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_TERM_R t, MCList<?> result) {
		super.getShipTerm_Set(row, builder, t, result);
		getShipTerm_addSelectJoinCustom(row, builder, t, result);
	}

	protected void getShipTerm_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_TERM_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定	
		result.addStringColumn(ShipTermCols.$o_ship_wk_grp_cd);
		result.addStringColumn(ShipTermCols.$o_ship_wk_grp_nm);
		result.addStringColumn(ShipTermCols.$o_chk_fr_lg_grp_cd);
		result.addStringColumn(ShipTermCols.$o_chk_to_lg_grp_cd);
		result.addStringColumn(ShipTermCols.$o_lc_ship_term_cd);
		result.addStringColumn(ShipTermCols.$o_ship_wk_cd);
		result.addStringColumn(ShipTermCols.$o_ship_wk_nm);
	}

	protected void getShipTerm_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_TERM_R t, MCList<?> result) {
		MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
		MCQueryApiBuilder lgctlbuilder = MCQueryApiBuilder.create(lgCtlL.createRow());
		MCDBContainer bdbc = lgctlbuilder.getBaseDbc();
		String sqlidpre = "MA.MAUAL0010.ShipTerm_getShipTerm_addSelectJoinWk";
		dbWkDelete(createSqlId(sqlidpre, bdbc.getPkWorkDbc(), "D01"), bdbc);

		if (isSrvChk(row)) {
			String[] frLgGrp = (String[]) convDataArray(
					row.getStringNE(getLLBindNm(ShipTermCols.$i_fr_lg_grp_cd)));
			String[] toLgGrp = (String[]) convDataArray(
					row.getStringNE(getLLBindNm(ShipTermCols.$i_to_lg_grp_cd)));
			for (int i = 0; i < frLgGrp.length; i++) {
				MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create();
				lgCtlR.fr_lg_grp_cd(frLgGrp[i]);
				lgCtlR.to_lg_grp_cd(toLgGrp[i]);
				lgCtlL.add(lgCtlR);
			}
		}
		else {
			MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create();
			lgCtlR.fr_lg_grp_cd(row.getStringNE(ShipTermCols.$i_fr_lg_grp_cd));
			lgCtlR.to_lg_grp_cd(row.getStringNE(ShipTermCols.$i_to_lg_grp_cd));
			lgCtlL.add(lgCtlR);
		}
		dbWkInsert(createSqlId(sqlidpre, bdbc.getPkWorkDbc(), "I01"), lgCtlL, bdbc);

		getShipTermJoinWkMainQuery(createSqlId(sqlidpre, bdbc, "S04"))
				.executeQuery(result);

		dbWkDelete(createSqlId(sqlidpre, bdbc.getPkWorkDbc(), "D02"), bdbc);
	}

	protected MCMainQuery getShipTermJoinWkMainQuery(String sqlid) {
		MAM_SHIP_TERM_R S0M = MAM_SHIP_TERM_R.create("M");
		MCTempView S0W = createTempView("W");
		MAW_LG_CTL_KEY_R S1W1 = MAW_LG_CTL_KEY_R.create("W1");
		MAM_LG_CTL_R S1M1 = MAM_LG_CTL_R.create("M1");
		MAM_SHIP_WK_GRP_R S1M3 = MAM_SHIP_WK_GRP_R.create("M3");
		MAM_SHIP_WK_R S1M4 = MAM_SHIP_WK_R.create("M4");
		MAW_LG_CTL_KEY_R S2W1 = MAW_LG_CTL_KEY_R.create("W1");
		MAM_LG_CTL_R S2M1 = MAM_LG_CTL_R.create("M1");
		MAM_SHIP_TERM_R S2M2 = MAM_SHIP_TERM_R.create("M2");
		MAM_SHIP_WK_GRP_R S2M3 = MAM_SHIP_WK_GRP_R.create("M3");
		MAM_SHIP_WK_R S2M4 = MAM_SHIP_WK_R.create("M4");
		MAM_LG_CTL_R S3X = MAM_LG_CTL_R.create("X");

		return sql(sqlid).mainQuery()
				.select(S0M.ship_term_cd, S0M.ship_term_nm, S0W.pr(S1M1.xfr_lt),
						S0W.pr(S1M1.fin_cl_time), S0W.pr(S1M1.alloc_days),
						S0W.pr(S1M1.iv_trd_flg), S0W.pr(S1M1.def_tdlv_cd),
						S0W.pr(S1M1.ship_wk_grp_cd), S0W.pr(S1M3.ship_wk_grp_nm),
						S0W.pr(S1M1.fr_lg_grp_cd).as("chk_fr_lg_grp_cd"),
						S0W.pr(S1M1.to_lg_grp_cd).as("chk_to_lg_grp_cd"),
						S0W.pr(S1M3.ship_wk_cd), S0W.pr(S1M4.ship_wk_nm))
				.from(S0M.innerJoin(subQuery()
						.select(S1M1.fr_lg_grp_cd, S1M1.to_lg_grp_cd, S1M1.ship_term_cd,
								S1M1.xfr_lt, S1M1.fin_cl_time, S1M1.alloc_days,
								S1M1.iv_trd_flg, S1M1.def_tdlv_cd, S1M1.ship_wk_grp_cd,
								S1M3.ship_wk_grp_nm, S1M3.ship_wk_cd, S1M4.ship_wk_nm)
						.from(S1W1.innerJoin(S1M1)
								.on(S1M1.ship_term_cd.neq(value(MAC_STR.NULL_VAL.value()))
										.and(S1M1.fr_lg_grp_cd.eq(S1W1.fr_lg_grp_cd))
										.and(S1M1.to_lg_grp_cd.eq(S1W1.to_lg_grp_cd)))
								.leftOuterJoin(S1M3)
								.on(S1M3.ship_wk_grp_cd.eq(S1M1.ship_wk_grp_cd))
								.leftOuterJoin(S1M4)
								.on(S1M4.ship_wk_cd.eq(S1M3.ship_wk_cd)))
						.where(value(0).eq(value(0)))
						.unionAll(subQuery().select(S2M1.fr_lg_grp_cd, S2M1.to_lg_grp_cd,
								S2M2.ship_term_cd, S2M1.xfr_lt, S2M1.fin_cl_time,
								S2M1.alloc_days, S2M1.iv_trd_flg, S2M1.def_tdlv_cd,
								S2M1.ship_wk_grp_cd, S2M3.ship_wk_grp_nm,
								S2M3.ship_wk_cd, S2M4.ship_wk_nm)
								.from(S2W1.innerJoin(S2M1).on(S2M1.ship_term_cd
										.eq(value(MAC_STR.NULL_VAL.value()))
										.and(S2M1.fr_lg_grp_cd.eq(S2W1.fr_lg_grp_cd))
										.and(S2M1.to_lg_grp_cd.eq(S2W1.to_lg_grp_cd)))
										.crossJoin(S2M2).leftOuterJoin(S2M3)
										.on(S2M3.ship_wk_grp_cd.eq(S2M1.ship_wk_grp_cd))
										.leftOuterJoin(S2M4)
										.on(S2M4.ship_wk_cd.eq(S2M3.ship_wk_cd)))
								.where(value(0).eq(value(0)).and(notExists(subQuery()
										.select(value("X")).from(S3X)
										.where(value(0).eq(value(0))
												.and(S3X.fr_lg_grp_cd
														.eq(S2M1.fr_lg_grp_cd))
												.and(S3X.to_lg_grp_cd
														.eq(S2M1.to_lg_grp_cd))
												.and(S3X.ship_term_cd
														.eq(S2M2.ship_term_cd)))))))
						.view(S0W)).on(S0M.ship_term_cd.eq(S0W.pr(S1M1.ship_term_cd))))
				.where(value(0).eq(value(0)));
	}

	protected void getShipTerm_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ShipTermCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ShipTermCols.$o_ship_term_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getShipTerm_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(ShipTermCols.$i_fr_lg_grp_cd))
				&& isNull(row.getStringNE(ShipTermCols.$i_to_lg_grp_cd))) {
			msg = new MCMessage(MAUAL0041, info);
		}
		else {
			msg = new MCMessage(MAUAL0346, row.getStringNE(ShipTermCols.$i_fr_lg_grp_cd),
					row.getString(ShipTermCols.$i_to_lg_grp_cd), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	public MCList getShipTerm_SrvChk(MCRow inRow, MCList rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		if (!isNull(inRow.getStringNE(ShipTermCols.$i_fr_lg_grp_cd))) {
			subRsltL = subRsltL.subList("chk_fr_lg_grp_cd",
					inRow.getStringNE(ShipTermCols.$i_fr_lg_grp_cd));
		}
		if (!isNull(inRow.getStringNE(ShipTermCols.$i_to_lg_grp_cd))) {
			subRsltL = subRsltL.subList("chk_to_lg_grp_cd",
					inRow.getStringNE(ShipTermCols.$i_to_lg_grp_cd));
		}
		return subRsltL;
	}

	@Override
	protected MCList<?> getShipTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_TERM_R t, MCList<?> result) {
		MCList<?> l = super.getShipTerm_AfterSelect(row, builder, t, result);
		if (!isSrvChk(row)) {
			// *のデータに対して重複するデータが出る場合があるので、重複分を取り除く
			// コンボボックスへの表示項目が増える場合は以下の部分も対応が必要
			if ((isNull(row.getStringNE(ShipTermCols.$i_fr_lg_grp_cd)))
					|| (isNull(row.getStringNE(ShipTermCols.$i_to_lg_grp_cd)))) {
				l = l.groupBy("ship_term_cd", "ship_term_nm");
			}
		}
		return l;
	}

	// -- ShipTerm:出荷条件 (END)
	// -- ItmShipGrp:品目出荷グループ (START)
	protected void getItmShipGrp_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmShipGrpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmShipGrpCols.$o_itm_ship_grp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ItmShipGrp:品目出荷グループ (END)
	// -- AcDpt:会計部門 (START)
	@Override
	protected void getAcDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_DPT_R t,
			MCList<?> result) {
		super.getAcDpt_Set(row, builder, t, result);
		getAcDpt_addSelectJoinCustom(row, builder, t, result);
		getAcDpt_addWhereCustom(row, builder, t, result);
	}

	protected void getAcDpt_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_DPT_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAcDpt_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_AC_DPT_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (!row.getBooleanNE(AcDptCols.$i_ignore_dt_flg)) {
			builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)),
					getDtForAcDpt(row));
		}

	}

	public <E extends MCRow> MCList getAcDpt_SrvChk(MCRow inRow, MCList<E> rsltL) {
		if (inRow.getBooleanNE(AcDptCols.$i_ignore_dt_flg)) {
			return rsltL;
		}
		MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
//				会計部門マスタの適用終了日 <= 引数の適用日
				boolean cnd1 = row.getDateNE("end_dt")
						.gteDate(inRow.getDateNE(AcDptCols.$i_dt));
//				会計部門マスタの適用開始日 >= 引数の適用日
				boolean cnd2 = row.getDateNE("st_dt")
						.lteDate(inRow.getDateNE(AcDptCols.$i_dt));
				return (cnd1 && cnd2);
			}
		});
		return subRsltL;
	}

	protected MCMessage getAcDpt_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg;
		if (row.getBooleanNE(AcDptCols.$i_ignore_dt_flg)) {
			msg = new MCMessage(MAUAL0393, info);
		}
		else {
			msg = new MCMessage(MAUAL0005, toYMDString(row.getDateNE(AcDptCols.$i_dt)),
					info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AcDpt:会計部門 (END)
	// -- CostDpt:原価部門 (START)
	@Override
	protected void getCostDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t,
			MCList<?> result) {
		super.getCostDpt_Set(row, builder, t, result);
		getCostDpt_addSelectJoinCustom(row, builder, t, result);
		getCostDpt_addWhereCustom(row, builder, t, result);
	}

	protected void getCostDpt_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_DPT_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");

		// 固定のSelect句、結合の設定
		builder.addSelect(term.term_end_ym.as("term_end_ym"));
		builder.addSelect(t.dpt_config_typ.as("chk_dpt_config_typ"));
		builder.addInnerJoin(term, bracket(term.term.eq(t.term)));

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getCostDpt_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_COST_DPT_R t, MCList<?> result) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (!row.getBooleanNE(CostDptCols.$i_ignore_ym_flg)) {
			builder.addWhereWithAnd(bind("1").gte(term.term), getYmForDpt(row));
			builder.addWhereWithAnd(bind("1").lt(term.term_end_ym), getYmForDpt(row));
		}
		builder.addWhereWithCutOffAnd(t.dpt_config_typ.eq(bind("1")),
				row.getStringNE(CostDptCols.$i_dpt_config_typ));

	}

	protected MCMessage getCostDpt_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg;
		if (row.getBooleanNE(CostDptCols.$i_ignore_ym_flg)) {
			msg = new MCMessage(MAUAL0372, info);
		}
		else {
			msg = new MCMessage(MAUAL0177, toYMString(getYmForDpt(row)), info);
		}
		;
		return msg.setCauseRow(causeRow, causeCol);
	}

	public <E extends MCRow> MCList getCostDpt_SrvChk(MCRow inRow, MCList<E> rsltL) {
		if ((inRow.getBooleanNE(CostDptCols.$i_mode_nullval_flg)) && isSame(
				inRow.getStringNE(CostDptCols.$o_dpt_cd), MAC_STR.NULL_VAL.value())) {
			return rsltL;
		}

		if (inRow.getBooleanNE(CostDptCols.$i_ignore_ym_flg)) {
			return rsltL;
		}
		MCList subRsltL = rsltL.shallowClone();
		if (!isNull(inRow.getStringNE(CostDptCols.$i_dpt_config_typ))) {
			subRsltL = subRsltL.subList("chk_dpt_config_typ",
					inRow.getStringNE(CostDptCols.$i_dpt_config_typ));
		}
		MCList subRsltL2 = subRsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
				// 原価部門マスタの期終了年月 > 引数の適用年月 
				boolean cnd1 = row.getDateNE("term_end_ym")
						.gtDate(inRow.getDateNE(CostDptCols.$i_ym));
				// 原価部門マスタの期 <= 引数の適用年月 
				boolean cnd2 = row.getDateNE("term")
						.lteDate(inRow.getDateNE(CostDptCols.$i_ym));
				return (cnd1 && cnd2);
			}
		});
		return subRsltL2;
	}

	protected void getCostDpt_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(CostDptCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(CostDptCols.$o_dpt_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- CostDpt:原価部門 (END)
	// -- LossRsn:ロス理由(START)
	@Override
	protected void getLossRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOSS_RSN_R t,
			MCList<?> result) {

		super.getLossRsn_Set(row, builder, t, result);

		MCForeignInfo biz = t.getForeignInfoByColumn(MAM_LOSS_RSN_R.$loss_rsn_nm);
		MAM_BIZ_RSN_R bizr = biz.getRefTableDbc();
		result.addBooleanColumn(LossRsnCols.$o_fxd_loss_flg);
		builder.addSelect(LossRsnCols.$o_fxd_loss_flg, bizr.fxd_loss_flg);
		builder.inactiveForeign(biz);
		builder.activeForeignEQ(biz);

		if (!isSrvChk(row)) {
			builder.addWhereWithAnd(t.itm_typ.eq(bind("1")),
					row.getStringNE(LossRsnCols.$i_itm_typ));
			builder.addWhereWithAnd(t.itm_typ_d_cd.eq(bind("1")),
					row.getStringNE(LossRsnCols.$i_itm_typ_d_cd));
		}
	}

	protected MCMessage getLossRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0257, row.getStringNE(LossRsnCols.$i_itm_typ),
				row.getStringNE(LossRsnCols.$i_itm_typ_d_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- LossRsn:ロス理由 (END)
	// -- AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄） (START)
	@Override
	protected void getAcxfrGrAcxfrGiDispBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		super.getAcxfrGrAcxfrGiDispBizRsn_Set(row, builder, t, result);
		result.addBooleanColumn(AcxfrGrAcxfrGiDispBizRsnCols.$o_out_acxfr_gr_flg);
		result.addBooleanColumn(AcxfrGrAcxfrGiDispBizRsnCols.$o_out_acxfr_gi_flg);
		result.addBooleanColumn(AcxfrGrAcxfrGiDispBizRsnCols.$o_out_disp_flg);
		builder.addSelect(t.acxfr_gr_flg.as("out_acxfr_gr_flg"));
		builder.addSelect(t.acxfr_gi_flg.as("out_acxfr_gi_flg"));
		builder.addSelect(t.disp_flg.as("out_disp_flg"));

		boolean gr = row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg);
		boolean gi = row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg);
		boolean disp = row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg);

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		if (gr || gi || disp) {
			MCPredicate acxfrp = value(0).eq(value(1));
			if (gr) {
				acxfrp = acxfrp.or(t.acxfr_gr_flg.eq(value(true)));
			}
			if (gi) {
				acxfrp = acxfrp.or(t.acxfr_gi_flg.eq(value(true)));
			}
			if (disp) {
				acxfrp = acxfrp.or(t.disp_flg.eq(value(true)));
			}
			builder.addWhereWithAnd(bracket(acxfrp));
		}
	}

	public MCList getAcxfrGrAcxfrGiDispBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg))
				&& (inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg))
				&& (inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg))) {
			return rsltL;
		}
		else if ((!inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg))
				&& (!inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg))
				&& (!inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg))) {
			return rsltL;
		}
		else if (inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg)) {
			return rsltL.subList("out_acxfr_gr_flg", true);
		}
		else if (inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg)) {
			return rsltL.subList("out_acxfr_gi_flg", true);
		}
		else if (inRow.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg)) {
			return rsltL.subList("out_disp_flg", true);
		}
		return rsltL;
	}

	protected MCMessage getAcxfrGrAcxfrGiDispBizRsn_Msg(MCRow causeRow, String causeCol,
			MCRow row, String info) {
		String gr = null;
		String gi = null;
		String disp = null;

		if (row.contains(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg)) {
			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg)) {
				gr = MAC_STR.MSG_FLG_ON.name();
			}
		}

		if (row.contains(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg)) {
			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg)) {
				gi = MAC_STR.MSG_FLG_ON.name();
			}
		}
		if (row.contains(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg)) {
			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg)) {
				disp = MAC_STR.MSG_FLG_ON.name();
			}
		}
		MCMessage msg = new MCMessage(MAUAL0337, gr, gi, disp, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄） (END)
	// -- ExtSys:外部システム (START)
	@Override
	protected void getExtSys_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t,
			MCList<?> result) {
		super.getExtSys_Set(row, builder, t, result);
		builder.addWhereWithCutOffAnd(t.ext_sys_typ.eq(bind("1")),
				row.getStringNE(ExtSysCols.$i_ext_sys_typ));
	}

	protected void getExtSys_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ExtSysCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ExtSysCols.$o_ext_sys_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ExtSys:外部システム (END)
	// -- ArrBizRsn:業務理由（仕入、経費購買、売上返品、販売他勘定、移送、他勘定出庫） (START)
	@Override
	protected void getArrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t,
			MCList<?> result) {

		super.getArrBizRsn_Set(row, builder, t, result);

		result.addBooleanColumn(ArrBizRsnCols.$o_out_purc_flg);
		result.addBooleanColumn(ArrBizRsnCols.$o_out_sls_rtn_flg);
		result.addBooleanColumn(ArrBizRsnCols.$o_out_xfr_flg);
		builder.addSelect(t.purc_flg.as("out_purc_flg"));
		builder.addSelect(t.sls_rtn_flg.as("out_sls_rtn_flg"));
		builder.addSelect(t.xfr_flg.as("out_xfr_flg"));

		boolean purc = row.getBooleanNE(ArrBizRsnCols.$i_purc_flg);
		boolean xpns = row.getBooleanNE(ArrBizRsnCols.$i_xpns_purc_flg);
		boolean slsrtn = row.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg);
		boolean xfr = row.getBooleanNE(ArrBizRsnCols.$i_xfr_flg);

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		if (purc || xpns || slsrtn || xfr) {
			MCPredicate pdc = value(0).eq(value(1));
			if (purc) {
				pdc = pdc.or(t.purc_flg.eq(value(true)));
			}
			if (xpns) {
				pdc = pdc.or(t.xpns_purc_flg.eq(value(true)));
			}
			if (slsrtn) {
				pdc = pdc.or(t.sls_rtn_flg.eq(value(true)));
			}
			if (xfr) {
				pdc = pdc.or(t.xfr_flg.eq(value(true)));
			}
			builder.addWhereWithAnd(bracket(pdc));
		}
	}

	public MCList getArrBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(ArrBizRsnCols.$i_purc_flg))
				&& (inRow.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg))
				&& (inRow.getBooleanNE(ArrBizRsnCols.$i_xfr_flg))) {
			return rsltL;
		}
		else if ((!inRow.getBooleanNE(ArrBizRsnCols.$i_purc_flg))
				&& (!inRow.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg))
				&& (!inRow.getBooleanNE(ArrBizRsnCols.$i_xfr_flg))) {
			return rsltL;
		}
		else if (inRow.getBooleanNE(ArrBizRsnCols.$i_purc_flg)) {
			return rsltL.subList("out_purc_flg", true);
		}
		else if (inRow.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg)) {
			return rsltL.subList("out_sls_rtn_flg", true);
		}
		else if (inRow.getBooleanNE(ArrBizRsnCols.$i_xfr_flg)) {
			return rsltL.subList("out_xfr_flg", true);
		}
		return rsltL;
	}

	protected MCMessage getArrBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String purc = null;
		String xpns = null;
		String slsrtn = null;

		if (row.contains(ArrBizRsnCols.$i_purc_flg)) {
			if (row.getBooleanNE(ArrBizRsnCols.$i_purc_flg)) {
				purc = MAC_STR.MSG_FLG_ON.name();
			}
		}
		if (row.contains(ArrBizRsnCols.$i_xpns_purc_flg)) {
			if (row.getBooleanNE(ArrBizRsnCols.$i_xpns_purc_flg)) {
				xpns = MAC_STR.MSG_FLG_ON.name();
			}
		}
		if (row.contains(ArrBizRsnCols.$i_sls_rtn_flg)) {
			if (row.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg)) {
				slsrtn = MAC_STR.MSG_FLG_ON.name();
			}
		}
		MCMessage msg = new MCMessage(MAUAL0338, purc, xpns, slsrtn, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ArrBizRsn:（仕入、経費購買、売上返品、販売他勘定、移送、他勘定出庫） (END)
	// -- ShipBizRsn:業務理由（売上、販売他勘定、移送、他勘定出庫） (START)
	@Override
	protected void getShipBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		super.getShipBizRsn_Set(row, builder, t, result);

		result.addBooleanColumn(ShipBizRsnCols.$o_out_sls_flg);
		result.addBooleanColumn(ShipBizRsnCols.$o_out_xfr_flg);
		builder.addSelect(t.sls_flg.as("out_sls_flg"));
		builder.addSelect(t.xfr_flg.as("out_xfr_flg"));

		boolean sls = row.getBooleanNE(ShipBizRsnCols.$i_sls_flg);
		boolean xfr = row.getBooleanNE(ShipBizRsnCols.$i_xfr_flg);

		if (sls || xfr) {
			MCPredicate pdc = value(0).eq(value(1));
			if (sls) {
				pdc = pdc.or(t.sls_flg.eq(value(true)));
			}
			if (xfr) {
				pdc = pdc.or(t.xfr_flg.eq(value(true)));
			}
			builder.addWhereWithAnd(bracket(pdc));
		}
	}

	public MCList getShipBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		if ((inRow.getBooleanNE(ShipBizRsnCols.$i_sls_flg))
				&& (inRow.getBooleanNE(ShipBizRsnCols.$i_xfr_flg))) {
			return rsltL;
		}
		else if ((!inRow.getBooleanNE(ShipBizRsnCols.$i_sls_flg))
				&& (!inRow.getBooleanNE(ShipBizRsnCols.$i_xfr_flg))) {
			return rsltL;
		}
		else if (inRow.getBooleanNE(ShipBizRsnCols.$i_sls_flg)) {
			return rsltL.subList("out_sls_flg", true);
		}
		else if (inRow.getBooleanNE(ShipBizRsnCols.$i_xfr_flg)) {
			return rsltL.subList("out_xfr_flg", true);
		}
		return rsltL;
	}

	protected MCMessage getShipBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String sls = null;
		String xfr = null;

		if (row.contains(ShipBizRsnCols.$i_sls_flg)) {
			if (row.getBooleanNE(ShipBizRsnCols.$i_sls_flg)) {
				sls = MAC_STR.MSG_FLG_ON.name();
			}
		}

		if (row.contains(ShipBizRsnCols.$i_xfr_flg)) {
			if (row.getBooleanNE(ShipBizRsnCols.$i_xfr_flg)) {
				xfr = MAC_STR.MSG_FLG_ON.name();
			}
		}
		MCMessage msg = new MCMessage(MAUAL0339, sls, xfr, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ShipBizRsn:業務理由（売上、販売他勘定、移送、他勘定出庫） (END)
	// -- SlsAllBizRsn:業務理由（売上、売上返品、売上調整） (START)
	@Override
	protected void getSlsAllBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getSlsAllBizRsn_Set(row, builder, t, result);
		getSlsAllBizRsn_addSelectJoinCustom(row, builder, t, result);
		getSlsAllBizRsn_addWhereCustom(row, builder, t, result);
	}

	protected void getSlsAllBizRsn_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSlsAllBizRsn_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {

		// 固定条件（行ごとに条件値が同じ条件）		
		result.addBooleanColumn(SlsAllBizRsnCols.$o_out_sls_flg);
		result.addBooleanColumn(SlsAllBizRsnCols.$o_out_sls_rtn_flg);
		result.addBooleanColumn(SlsAllBizRsnCols.$o_out_sls_dscnt_flg);
		builder.addSelect(t.sls_flg.as("out_sls_flg"));
		builder.addSelect(t.sls_rtn_flg.as("out_sls_rtn_flg"));
		builder.addSelect(t.sls_dscnt_flg.as("out_sls_dscnt_flg"));

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		boolean sls = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_flg);
		boolean slsrtn = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg);
		boolean slsdscnt = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg);

		if (sls || slsrtn || slsdscnt) {
			MCPredicate pdc = value(0).eq(value(1));
			if (sls) {
				pdc = pdc.or(t.sls_flg.eq(value(true)));
			}
			if (slsrtn) {
				pdc = pdc.or(t.sls_rtn_flg.eq(value(true)));
			}
			if (slsdscnt) {
				pdc = pdc.or(t.sls_dscnt_flg.eq(value(true)));
			}
			builder.addWhereWithAnd(bracket(pdc));
		}
		boolean acxfr = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_acxfr_flg);
		boolean notacxfr = row.getBooleanNE(SlsAllBizRsnCols.$i_not_sls_acxfr_flg);
		if (acxfr || notacxfr) {
			MCPredicate pdc = value(0).eq(value(1));
			if (acxfr) {
				pdc = pdc.or(t.sls_acxfr_flg.eq(value(true)));
			}
			if (notacxfr) {
				pdc = pdc.or(t.sls_acxfr_flg.eq(value(false)));
			}
			builder.addWhereWithAnd(bracket(pdc));
		}
	}

	public MCList getSlsAllBizRsn_SrvChk(MCRow inRow, MCList rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		subRsltL.clear();
		if ((inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_acxfr_flg))
				&& (!(inRow.getBooleanNE(SlsAllBizRsnCols.$i_not_sls_acxfr_flg)))) {
			subRsltL.addAll(rsltL.subList("sls_acxfr_flg", true));
		}
		else if ((!(inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_acxfr_flg)))
				&& (inRow.getBooleanNE(SlsAllBizRsnCols.$i_not_sls_acxfr_flg))) {
			subRsltL.addAll(rsltL.subList("sls_acxfr_flg", false));
		}
		else if ((!inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_flg))
				&& (!inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg))
				&& (!inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg))) {
			return rsltL;
		}
		if (inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_flg)) {
			subRsltL.addAll(rsltL.subList("out_sls_flg", true));
		}
		if (inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg)) {
			subRsltL.addAll(rsltL.subList("out_sls_rtn_flg", true));
		}
		if (inRow.getBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg)) {
			subRsltL.addAll(rsltL.subList("out_sls_dscnt_flg", true));
		}
		return subRsltL;
	}

	protected MCMessage getSlsAllBizRsn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String sls = null;
		String slsrtn = null;
		String slsdscnt = null;
		String acxfr = null;

		if (row.contains(SlsAllBizRsnCols.$i_sls_flg)) {
			if (row.getBooleanNE(SlsAllBizRsnCols.$i_sls_flg)) {
				sls = MAC_STR.MSG_FLG_ON.name();
			}
		}

		if (row.contains(SlsAllBizRsnCols.$i_sls_rtn_flg)) {
			if (row.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg)) {
				slsrtn = MAC_STR.MSG_FLG_ON.name();
			}
		}
		if (row.contains(SlsAllBizRsnCols.$i_sls_dscnt_flg)) {
			if (row.getBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg)) {
				slsdscnt = MAC_STR.MSG_FLG_ON.name();
			}
		}

		if (row.getBooleanNE(SlsAllBizRsnCols.$i_sls_acxfr_flg)) {
			if (!row.getBooleanNE(SlsAllBizRsnCols.$i_not_sls_acxfr_flg)) {
				acxfr = MAC_STR.MSG_FLG_ON.name();
			}
		}
		else if (row.getBooleanNE(SlsAllBizRsnCols.$i_not_sls_acxfr_flg)) {
			acxfr = MAC_STR.MSG_FLG_OFF.name();
		}

		MCMessage msg = new MCMessage(MAUAL0340, sls, slsrtn, slsdscnt, acxfr, info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SlsAllBizRsn:業務理由（売上、売上返品、売上調整） (END)
	// -- SlsUpriGrp:販売単価分類 (START)
	protected void getSlsUpriGrp_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SlsUpriGrpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SlsUpriGrpCols.$o_sls_upri_grp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- SlsUpriGrp:販売単価分類 (END)
	// -- SlsUpriRank:販売単価ランク (START)
	protected void getSlsUpriRank_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(SlsUpriRankCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(SlsUpriRankCols.$o_sls_upri_rank_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- SlsUpriRank:販売単価ランク (END)
	// -- ShipWk:出荷作業 (START)
	@Override
	protected void getShipWk_Set(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_R t,
			MCList<?> result) {
		super.getShipWk_Set(row, builder, t, result);
		getShipWk_addSelectJoinCustom(row, builder, t, result);
		getShipWk_addWhereCustom(row, builder, t, result);
	}

	protected void getShipWk_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_WK_R t, MCList<?> result) {
		MAM_SHIP_WK_GRP_R grp = MAM_SHIP_WK_GRP_R.create("GRP");
		MAM_SHIP_WK_JDG_R jdg = MAM_SHIP_WK_JDG_R.create("JDG");

		// 固定のSelect句、結合の設定
		result.addStringColumn(ShipWkCols.$o_chk_ship_wk_grp_cd);
		result.addStringColumn(ShipWkCols.$o_chk_dlv_ded_time);
		result.addStringColumn(ShipWkCols.$o_chk_ship_schd_time);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 動的のSelect句、結合の設定
		if (isNull(row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd))) {
			// パターン1

		}
		else if ((isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm)) || isSame(
				(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")), "0000"))
				&& (isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)) || isSame(
						row.getStringNE(ShipWkCols.$i_ship_schd_time), "0000"))) {

		}
		else if (!isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm))
				&& ((isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)))
						|| (isSame(row.getStringNE(ShipWkCols.$i_ship_schd_time),
								"0000")))
				&& (!isSame((row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")),
						"0000"))) {
			//パターン6
			builder.removeSelect(MAM_SHIP_WK_R.$ship_wk_cd);
			builder.addSelect(jdg.ship_wk_cd);
			builder.addSelect(jdg.ship_wk_grp_cd.as("chk_ship_wk_grp_cd"));
			builder.addSelect(jdg.dlv_ded_time.as("chk_dlv_ded_time"));
			builder.addLeftOuterJoin(jdg, bracket(jdg.ship_wk_cd.eq(t.ship_wk_cd)));

		}
		else if (!isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm))
				&& (!isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)))
				&& (!isSame(row.getStringNE(ShipWkCols.$i_ship_schd_time), "0000"))
				&& (!isSame((row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")),
						"0000"))) {
			//パターン7
			builder.removeSelect(MAM_SHIP_WK_R.$ship_wk_cd);
			builder.addSelect(jdg.ship_wk_cd);
			builder.addSelect(jdg.ship_wk_grp_cd.as("chk_ship_wk_grp_cd"));
			builder.addSelect(jdg.ship_schd_time.as("chk_ship_schd_time"));
			builder.addSelect(jdg.dlv_ded_time.as("chk_dlv_ded_time"));
			builder.addLeftOuterJoin(jdg, bracket(jdg.ship_wk_cd.eq(t.ship_wk_cd)));
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getShipWk_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_SHIP_WK_R t, MCList<?> result) {
		MAM_SHIP_WK_GRP_R grp = MAM_SHIP_WK_GRP_R.create("GRP");
		MAM_SHIP_WK_JDG_R jdg = MAM_SHIP_WK_JDG_R.create("JDG");
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		if (isNull(row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd))) {
			// パターン1
		}
		else if ((isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm)) || isSame(
				(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")), "0000"))
				&& (isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)) || isSame(
						row.getStringNE(ShipWkCols.$i_ship_schd_time), "0000"))) {
			// パターン2
		}
		else if (!isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm))
				&& ((isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)))
						|| (isSame(row.getStringNE(ShipWkCols.$i_ship_schd_time),
								"0000")))
				&& (!isSame((row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")),
						"0000"))) {
			//パターン6
			builder.addWhereWithAnd(jdg.ship_wk_grp_cd.eq(bind("1")),
					row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd));
			builder.addWhereWithAnd(jdg.dlv_ded_time.lte(bind("1")),
					row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm"));

		}
		else if (!isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm))
				&& (!isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time)))
				&& (!isSame(row.getStringNE(ShipWkCols.$i_ship_schd_time), "0000"))
				&& (!isSame((row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")),
						"0000"))) {
			//パターン7
			builder.addWhereWithAnd(jdg.ship_wk_grp_cd.eq(bind("1")),
					row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd));
			String i_dlv_rqst_tm_hhmm = row.getDateNE(ShipWkCols.$i_dlv_rqst_tm)
					.toString("HHmm");
			if (row.getStringNE(ShipWkCols.$i_ship_schd_time)
					.compareTo(i_dlv_rqst_tm_hhmm) > 0) {
				i_dlv_rqst_tm_hhmm = String
						.valueOf(Integer.parseInt(i_dlv_rqst_tm_hhmm) + 2400);
			}
			builder.addWhereWithAnd(
					bracket(cases().when(jdg.ship_schd_time.gt(jdg.dlv_ded_time))
							.then(toChar(toNumber(jdg.dlv_ded_time).add(value(2400)),
									MAM_SHIP_WK_JDG_R.dlv_ded_time_META.length(),
									MAM_SHIP_WK_JDG_R.dlv_ded_time_META.scale(),
									MCNumberFmtOpt.FILL_MODE))
							.otherwise(jdg.dlv_ded_time)).lte(bind("1")),
					i_dlv_rqst_tm_hhmm);
			builder.addWhereWithAnd(jdg.ship_schd_time.gte(bind("1")),
					row.getStringNE(ShipWkCols.$i_ship_schd_time));
		}
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	protected MCMessage getShipWk_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		if (isNull(row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd))
				&& isNull(row.getStringNE(ShipWkCols.$i_ship_schd_time))) {
			msg = new MCMessage(MAUAL0258, info);
		}
		else {
			msg = new MCMessage(MAUAL0347, row.getStringNE(ShipWkCols.$i_ship_wk_grp_cd),
					row.getStringNE(ShipWkCols.$i_ship_schd_time), info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	@Override
	protected MCList<?> getShipWk_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_R t, MCList<?> result) {
		MCList<?> l = super.getShipWk_AfterSelect(row, builder, t, result);
		
		// 納入希望日時を指定しているが出荷作業判定マスタが取得できない場合、出荷作業マスタの情報を返却する
		if (!isNull(row.getDateNE(ShipWkCols.$i_dlv_rqst_tm))
				&& !isSame((row.getDateNE(ShipWkCols.$i_dlv_rqst_tm).toString("HHmm")), "0000")
				&& result.isEmpty()) {

			MCList<MAM_SHIP_WK_R> rsltL = MCList.create(MAM_SHIP_WK_R.class);
			rsltL.addStringColumn(MAM_SHIP_WK_JDG_R.$ship_wk_grp_cd);
			rsltL.addStringColumn(MAM_SHIP_WK_JDG_R.$dlv_ded_time);
			rsltL.addStringColumn(MAM_SHIP_WK_JDG_R.$ship_schd_time);
			
			MAM_SHIP_WK_JDG_R jdg = MAM_SHIP_WK_JDG_R.create("T1");
			
			MCQueryApiBuilder afsBuilder = MCQueryApiBuilder.create(t);
			afsBuilder.addMax(jdg.dlv_ded_time, MAM_SHIP_WK_JDG_R.$dlv_ded_time);
			afsBuilder.addLeftOuterJoin(jdg, jdg.ship_wk_cd.eq(t.ship_wk_cd).and(jdg.ship_wk_grp_cd.eq(bind("ship_wk_grp_cd"))));
			afsBuilder.addGroupBy(t.ship_wk_cd);
			afsBuilder.addGroupBy(t.ship_wk_nm);
			afsBuilder.addGroupBy(jdg.ship_wk_grp_cd);
			afsBuilder.addGroupBy(jdg.ship_schd_time);
			
			MCList<MCRow> mergebinds = MCList.create(MCRow.class);
			mergebinds.add(builder.getMergeBind());
			
			afsBuilder.buildSelect(createSqlId("MA.MAUAL0010.ShipWk_getShipWk_AfterSelect", t, "S01")).executeQuery(row, mergebinds, rsltL);
			
			for (MAM_SHIP_WK_R rsltR :rsltL) {
				MCRow r = l.add();
				r.setStringNE("ship_wk_cd", rsltR.ship_wk_cd());
				r.setStringNE("ship_wk_nm", rsltR.ship_wk_nm());
				// 出荷作業判定マスタが存在しないときは以下の項目は設定されない
				r.setStringNE("chk_ship_wk_grp_cd", rsltR.getString(MAM_SHIP_WK_JDG_R.$ship_wk_grp_cd));
				r.setStringNE("chk_dlv_ded_time", rsltR.getString(MAM_SHIP_WK_JDG_R.$dlv_ded_time));
				r.setStringNE("chk_ship_schd_time", rsltR.getString(MAM_SHIP_WK_JDG_R.$ship_schd_time));
			}
		}
		return l;
	}

	// -- ShipWk:出荷作業 (END)
	// -- InptAcxfrBizRsn:投入用他勘定振替理由 (START)
	@Override
	protected void getInptAcxfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_BIZ_RSN_R t, MCList<?> result) {
		super.getInptAcxfrBizRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.inpt_acxfr_sort_seq.isNotNull());
	}

	// -- InptAcxfrBizRsn:投入用他勘定振替理由 (END)
	// -- ArSttl:債権決済方法 (START)
	@Override
	protected void getArSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t,
			MCList<?> result) {
		super.getArSttl_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ar_sttl_flg.eq(value(true)));
	}

	// -- ArSttl:債権決済方法 (END)
	// -- ApSttl:債務決済方法 (START)
	@Override
	protected void getApSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t,
			MCList<?> result) {
		super.getApSttl_Set(row, builder, t, result);
		result.addStringColumn(ApSttlCols.$o_tax_cd);
		if (!isNull(row.getDateNE(ApSttlCols.$i_dt))) {
			builder.addSelect(MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(),
					nullValue(), nullValue(), nullValue(), bind("dt")).as("tax_cd"));
		}
		builder.addWhereWithAnd(t.ap_sttl_flg.eq(value(true)));
	}

	@Override
	protected MCList<?> getApSttl_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		MCList<?> sl = super.getApSttl_AfterSelect(row, builder, t, result);
		if (!isNull(row.getDateNE(ApSttlCols.$i_dt))) {
			result.setStringNE("sls_purc_typ", MAC_SLS_PURC_TYP.PURC.value());
			getSttl_AfterSelectSub(row, builder, t, result);
		}
		return result;
	}

	// -- ApSttl:債務決済方法 (END)
	// -- ApSttlPaySchdCtl:債務決済方法（源泉税、残高振替以外） (START)
	@Override
	protected void getApSttlPaySchdCtl_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		super.getApSttlPaySchdCtl_Set(row, builder, t, result);
		result.addStringColumn(ApSttlCols.$o_tax_cd);
		if (!isNull(row.getDateNE(ApSttlCols.$i_dt))) {
			builder.addSelect(MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(),
					nullValue(), nullValue(), nullValue(), bind("dt")).as("tax_cd"));
		}
		builder.addWhereWithAnd(t.ap_sttl_flg.eq(value(true)));
		builder.addWhereWithAnd(
				t.ap_sttl_typ.notIn(bind("1"), bind("2"), bind("3"), bind("4"),
						bind("5")),
				MAC_AP_STTL_TYP.WTAX.value(), MAC_AP_STTL_TYP.APSW_OUT_CHK.value(),
				MAC_AP_STTL_TYP.APSW_IN_CHK.value(),
				MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value(),
				MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value());
	}

	// -- ApSttlPaySchdCtl:債務決済方法（源泉税、残高振替以外） (END)
	// -- ArSttlNotWtax:債権決済方法（源泉税以外） (START)
	@Override
	protected void getArSttlNotRcvSchd_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_STTL_R t, MCList<?> result) {
		super.getArSttlNotRcvSchd_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ar_sttl_flg.eq(value(true)));
		builder.addWhereWithAnd(
				t.ar_sttl_typ.neq(value(MAC_AR_STTL_TYP.SETOFF_CR.value())));
		builder.addWhereWithAnd(t.ar_sttl_typ.neq(value(MAC_AR_STTL_TYP.WTAX.value())));
		builder.addWhereWithAnd(t.ar_sttl_typ.neq(value(MAC_AR_STTL_TYP.SW.value())));
	}

	// -- ArSttlNotWtax:債権決済方法（源泉税以外） (END)
	// -- SlsItmGrpLvl:販売品目体系階層 (START)
	@Override
	protected void getSlsItmGrpLvl_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_SLS_ITM_GRP_R t, MCList<?> result) {
		super.getSlsItmGrpLvl_Set(row, builder, t, result);
		builder.setDistinct();
	}

	// -- SlsItmGrpLvl:販売品目体系階層 (END)
	// -- ParmRemark:システムパラメータ概要 (START)
	@Override
	protected void getParmRemark_Set(MCRow row, MCQueryApiBuilder builder,
			MAC_SYS_PARM_REMARK_R t, MCList<?> result) {
		super.getParmRemark_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.lcl_cd.eq(bind("1")), MCSys.user.locale().toString());
	}

	// -- ParmRemark:システムパラメータ概要 (END)
	// -- ParmBizGrp:システムパラメータ業務分類 (START)
	@Override
	protected void getParmBizGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAC_SYS_PARM_REMARK_R t, MCList<?> result) {
		super.getParmBizGrp_Set(row, builder, t, result);
		builder.setDistinct();
		builder.addWhereWithAnd(t.lcl_cd.eq(bind("1")), MCSys.user.locale().toString());
	}

	// -- ParmBizGrp:システムパラメータ業務分類 (END)
	// -- DptForEndDtChk:部門（適用終了日チェック用） (START)
	@Override
	protected void getDptForEndDtChk_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_DPT_R t, MCList<?> result) {
		super.getDptForEndDtChk_Set(row, builder, t, result);
		getDptForEndDtChk_addSelectJoinCustom(row, builder, t, result);
		getDptForEndDtChk_addWhereCustom(row, builder, t, result);
	}

	protected void getDptForEndDtChk_addSelectJoinCustom(MCRow row,
			MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目
		result.addDateColumn(DptForEndDtChkCols.$o_chk_st_dt);
		result.addDateColumn(DptForEndDtChkCols.$o_chk_end_dt);

		// Select句、結合の設定
		// なし

		if (isSrvChk(row)) {
			builder.addSelect(trunc(t.st_dt, MCDateFmt.DD).as("chk_st_dt"));
			builder.addSelect(trunc(t.base_end_dt, MCDateFmt.DD).as("chk_end_dt"));
			return;
		}
	}

	protected void getDptForEndDtChk_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_DPT_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		// なし

		if (isSrvChk(row)) {
			return;
		}
	}

	public MCList getDptForEndDtChk_SrvChk(MCRow inRow, MCList rsltL) {
		MCList subRsltL = rsltL.shallowClone();
		if (!isNull(inRow.getDateNE(DptForEndDtChkCols.$i_st_dt))) {
			subRsltL = subRsltL.subList(DptForEndDtChkCols.$o_chk_st_dt,
					inRow.getDateNE(DptForEndDtChkCols.$i_st_dt).startTimeOfDay());
		}
		if (!isNull(inRow.getDateNE(DptForEndDtChkCols.$i_end_dt))) {
			subRsltL = subRsltL.subList(DptForEndDtChkCols.$o_chk_end_dt,
					inRow.getDateNE(DptForEndDtChkCols.$i_end_dt).startTimeOfDay());
		}
		return subRsltL;
	}

	protected MCMessage getDptForEndDtChk_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		return new MCMessage(MAUAL0275,
				toYMDString(row.getDateNE(DptForEndDtChkCols.$i_st_dt)),
				toYMDString(row.getDateNE(DptForEndDtChkCols.$i_end_dt)), info);
	}

	// -- DptForEndDtChk:部門（適用終了日チェック用） (END)
	// -- ExtSysEdi:外部システム（ＥＤＩ） (START)
	@Override
	protected void getExtSysEdi_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t,
			MCList<?> result) {
		super.getExtSysEdi_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				bracket(t.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI.value()))
						.or(t.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI_MCF.value())))));
	}

	protected void getExtSysEdi_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ExtSysEdiCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ExtSysEdiCols.$o_ext_sys_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ExtSysEdi:外部システム（ＥＤＩ） (END)
	// -- SetGrp:品揃グループ (START)
	@Override
	protected void getSetGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_SET_GRP_R t,
			MCList<?> result) {
		MAM_SET_ITM_R S1M = MAM_SET_ITM_R.create("M");

		super.getSetGrp_Set(row, builder, t, result);
		if (!isNull(row.getStringNE(SetGrpCols.$i_itm_cd))
				&& !isNull(row.getStringNE(SetGrpCols.$i_itm_sub1))
				&& !isNull(row.getStringNE(SetGrpCols.$i_itm_sub2))
				&& !isNull(row.getStringNE(SetGrpCols.$i_itm_sub3))) {
			builder.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1M)
					.where(value(0).eq(value(0)).and(t.set_grp_cd.eq(S1M.set_grp_cd))
							.and(S1M.main_itm_cd.eq(bind("itm_cd")))
							.and(S1M.main_itm_sub1.eq(bind("itm_sub1")))
							.and(S1M.main_itm_sub2.eq(bind("itm_sub2")))
							.and(S1M.main_itm_sub3.eq(bind("itm_sub3"))))));
		}
	}
	// -- SetGrp:品揃グループ (END)

	// -- CostWg:ＷＧ（原価用） (START)
	@Override
	protected void getCostWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t,
			MCList<?> result) {

		super.getSlsWg_Set(row, builder, t, result);
		builder.addSelect(t.sls_flg.as("sls_flg"));
		builder.addSelect(t.lg_flg.as("lg_flg"));
		builder.addSelect(t.mfg_flg.as("mfg_flg"));
		builder.addSelect(t.purc_flg.as("purc_flg"));

		MCPredicate predicate = t.sls_flg.eq(value(false)).and(t.lg_flg.eq(value(false)))
				.and(t.mfg_flg.eq(value(false))).and(t.purc_flg.eq(value(false)))
				.and(t.ar_flg.eq(value(false))).and(t.ap_flg.eq(value(false)))
				.and(t.sd_flg.eq(value(false))).and(t.plm_flg.eq(value(false)));

		if (row.getBooleanNE(CostWgCols.$i_non_flg)) {
			builder.addWhereWithAnd(predicate);
		}
		else {
			builder.addWhereWithAnd(bracket(t.sls_flg.eq(value(true))
					.or(t.lg_flg.eq(value(true))).or(t.mfg_flg.eq(value(true)))
					.or(t.purc_flg.eq(value(true))).or(predicate)));
			for (String col : new String[] {
					CostWgCols.$i_sls_flg, CostWgCols.$i_lg_flg, CostWgCols.$i_mfg_flg,
					CostWgCols.$i_purc_flg
			}) {
				if (row.contains(col)) {
					builder.addWhereWithAnd(
							MCQueryApiBuilder.makeEq(t.getColumn$(col), bind("1")),
							booleanToDBString(row.getBooleanNE(col)));
				}
			}
		}
		if (row.getBooleanNE(CostWgCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
			MAVM_RD_WG_R rd_wg = MAVM_RD_WG_R.create("RD_WG");
			builder.addInnerJoin(rd_wg, bracket(rd_wg.wg_cd.eq(t.wg_cd)));
		}
		if (row.getBooleanNE(CostWgCols.$i_wr_flg)) {
			// 更新可能ＦＬＧが指定された場合はMAVM_WR_WGと結合することで絞り込む(DAC対応)
			MAVM_WR_WG_R wr_wg = MAVM_WR_WG_R.create("WR_WG");
			builder.addInnerJoin(wr_wg, bracket(wr_wg.wg_cd.eq(t.wg_cd)));
		}
	}

	protected void getCostWg_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(CostWgCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(CostWgCols.$o_wg_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getCostWg_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg;
		if (row.getBooleanNE(CostWgCols.$i_non_flg)) {
			msg = new MCMessage(MAUAL0394, info);
		}
		else {
			if (row.getBooleanNE(CostWgCols.$i_sls_flg)
					|| row.getBooleanNE(CostWgCols.$i_lg_flg)
					|| row.getBooleanNE(CostWgCols.$i_mfg_flg)
					|| row.getBooleanNE(CostWgCols.$i_purc_flg)) {
				msg = new MCMessage(MAUAL0378, info);
			}
			else {
				msg = new MCMessage(MAUAL0371, info);
			}
		}
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- CostWg:ＷＧ（原価用） (END)

	// -- RptPtnInCalcRptPtn:原価レポートパタン（計算グループレポートマスタ） (START)
	@Override
	protected void getRptPtnInCalcRptPtn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_RPT_PTN_R t, MCList<?> result) {

		super.getRptPtnInCalcRptPtn_Set(row, builder, t, result);
		builder.setDistinct();

		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_CALC_RPT_PTN_R.$rpt_ptn_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")),
				row.getStringNE(RptPtnInCalcRptPtnCols.$i_calc_grp_cd));
	}

	// -- RptPtnInCalcRptPtn:原価レポートパタン（計算グループレポートマスタ） (END)
	// -- RptKeyWithTypInCalcRptPtn:原価レポートキー（計算グループレポートマスタ） (START)
	@Override
	protected void getRptKeyWithTypInCalcRptPtn_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_RPT_PTN_R t, MCList<?> result) {

		super.getRptKeyWithTypInCalcRptPtn_Set(row, builder, t, result);
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_CALC_RPT_PTN_R.$rpt_key_nm);
		MAM_RPT_KEY_R rpt_key = fi.getRefTableDbc();
		builder.addSelect(RptKeyWithTypInCalcRptPtnCols.$o_rpt_key_typ,
				rpt_key.rpt_key_typ);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);

		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")),
				row.getStringNE(RptKeyWithTypInCalcRptPtnCols.$i_calc_grp_cd));
		builder.addWhereWithAnd(t.rpt_ptn_cd.eq(bind("1")),
				row.getStringNE(RptKeyWithTypInCalcRptPtnCols.$i_rpt_ptn_cd));
	}

	@Override
	protected MCList<?> getRptKeyWithTypInCalcRptPtn_AfterSelect(MCRow row,
			MCQueryApiBuilder builder, MAM_CALC_RPT_PTN_R t, MCList<?> result) {
		MCList<?> l = super.getRptKeyWithTypInCalcRptPtn_AfterSelect(row, builder, t,
				result);
		// 区分名の設定
		l.addStringColumn(MAC_RPT_KEY_TYP.$NAME);
		MAC_RPT_KEY_TYP.putNameNE(l, MAC_RPT_KEY_TYP.$VALUE, MAC_RPT_KEY_TYP.$NAME);
		return l;
	}

	// -- RptKeyWithTypInCalcRptPtn:原価レポートキー（計算グループレポートマスタ） (END)

	// -- CostIoInCalcCostIo:受払表（計算グループ受払表マスタ） (START)
	@Override
	protected void getCostIoInCalcCostIo_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_COST_IO_R t, MCList<?> result) {

		super.getCostIoInCalcCostIo_Set(row, builder, t, result);
		MCForeignInfo fi = t.getForeignInfoByColumn(MAM_COST_IO_R.$cost_io_nm);
		builder.removeSelect(MAM_COST_IO_R.$cost_io_nm);
		builder.inactiveForeign(fi);
		builder.activeForeignEQ(fi);
		builder.addSelectNEActiveForeign(MAM_COST_IO_R.$cost_io_nm,
				t.getColumn$(MAM_COST_IO_R.$cost_io_nm));
		builder.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
	}
	// -- CostIoInCalcCostIo:受払表（計算グループ受払表マスタ） (END)

	// -- FixCalcGrp:計算グループ（確定用） (START)
	@Override
	protected void getFixCalcGrp_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_CALC_GRP_R t, MCList<?> result) {
		super.getFixCalcGrp_Set(row, builder, t, result);
		builder.addWhereWithAnd(bracket(t.cost_calc_typ.in(bind("1"), bind("2"))
				.or(t.cost_calc_typ.eq(bind("3"))).and(t.pre_alc_calc_typ.eq(bind("4")))),
				MAC_COST_CALC_TYP.NOT_STK.value(), MAC_COST_CALC_TYP.CALC_STK.value(),
				MAC_COST_CALC_TYP.OTHER.value(), MAC_PRE_ALC_CALC_TYP.CALC.value());
	}

	// -- FixCalcGrp:計算グループ（確定用） (END)
	// -- ExtSysScm:外部システム（ＳＣＭ）(START)
	@Override
	protected void getExtSysScm_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t,
			MCList<?> result) {
		super.getExtSysScm_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.ext_sys_typ.in(bind("1"), bind("2")),
				MAC_EXT_SYS_TYP.SCM.value(), MAC_EXT_SYS_TYP.SCM_MD.value());
	}

	protected void getExtSysScm_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ExtSysScmCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ExtSysScmCols.$o_ext_sys_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ExtSysScm:外部システム（ＳＣＭ） (END)
	// -- LgCtl:物流制御情報(START)
	@Override
	protected void getLgCtl_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_CTL_R t,
			MCList<?> result) {
		super.getLgCtl_Set(row, builder, t, result);
		getLgCtl_addWhereCustom(row, builder, t, result);
	}

	protected void getLgCtl_addWhereCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_CTL_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		// 全てのキーが引数に指定されている場合は
		// 出荷条件ＣＤ＝ＮＵＬＬ文字のレコードも取得する
		if (isSpecifyAllKeys_LgCtl(row)) {
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithCutOffAnd(t.ship_term_cd.in(bind("1"), bind("2")),
					row.getStringNE(LgCtlCols.$i_ship_term_cd), MAC_STR.NULL_VAL.value());
		}
		builder.addWhereWithAnd(t.fr_lg_grp_cd.eq(bind("1")),
				row.getStringNE(LgCtlCols.$i_fr_lg_grp_cd));
		builder.addWhereWithAnd(t.to_lg_grp_cd.eq(bind("1")),
				row.getStringNE(LgCtlCols.$i_to_lg_grp_cd));
	}

	@Override
	protected MCList<?> getLgCtl_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_LG_CTL_R t, MCList<?> result) {
		// 全てのキーが引数に指定されている場合に
		// 出荷条件ＣＤ＝ＮＵＬＬ文字とそうでないレコードの２件が取得された場合、ＮＵＬＬ文字のレコードを削除する
		if (isSpecifyAllKeys_LgCtl(row) && result.size() == 2) {
			result.removeAll(
					result.subList(MAM_LG_CTL_R.$ship_term_cd, MAC_STR.NULL_VAL.value()));
		}
		return super.getLgCtl_AfterSelect(row, builder, t, result);
	}

	/** 
	 * 全てのキーが引数に指定されている場合にtrueを返す
	 */
	protected boolean isSpecifyAllKeys_LgCtl(MCRow row) {
		return !isNullOr(row.getStringNE(LgCtlCols.$i_fr_lg_grp_cd),
				row.getStringNE(LgCtlCols.$i_to_lg_grp_cd),
				row.getStringNE(LgCtlCols.$i_ship_term_cd));
	}

	public <E extends MCRow> MCList getLgCtl_SrvChk(MCRow inRow, MCList<E> rsltL) {
		String frLgGrp = inRow.getStringNE(LgCtlCols.$i_fr_lg_grp_cd);
		String toLgGrp = inRow.getStringNE(LgCtlCols.$i_to_lg_grp_cd);
		String shipTerm = inRow.getStringNE(LgCtlCols.$i_ship_term_cd);

		MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
			@Override
			public boolean match(E row) {
				if (!isNull(frLgGrp)
						&& !isSame(frLgGrp, row.getStringNE(LgCtlCols.$i_fr_lg_grp_cd))) {
					return false;
				}
				if (!isNull(toLgGrp)
						&& !isSame(toLgGrp, row.getStringNE(LgCtlCols.$i_to_lg_grp_cd))) {
					return false;
				}
				if (!isNull(shipTerm) && !isSame(shipTerm,
						row.getStringNE(LgCtlCols.$i_ship_term_cd))) {
					return false;
				}
				return true;
			}
		});
		return subRsltL;
	}

	protected MCMessage getLgCtl_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = new MCMessage(MAUAL0505,
				row.getStringNE(LgCtlCols.$i_fr_lg_grp_cd),
				row.getStringNE(LgCtlCols.$i_to_lg_grp_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- LgCtl:物流制御情報(END)
	// -- StrgTgtReport:保存対象帳票(START)
	@Override
	protected void getStrgTgtReport_Set(MCRow row, MCQueryApiBuilder builder,
			MAM_STRG_TGT_REPORT_R t, MCList<?> result) {
		super.getStrgTgtReport_Set(row, builder, t, result);
		getStrgTgtReport_addSelectJoinCustom(row, builder, t, result);
	}
	protected void getStrgTgtReport_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_STRG_TGT_REPORT_R t, MCList<?> result) {

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(StrgTgtReportCols.$o_report_nm);
	}

	@Override
	protected MCList<?> getStrgTgtReport_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_STRG_TGT_REPORT_R t, MCList<?> result) {
		getStrgTgtReport_AfterSelectSub(row, builder, t, result);
		return super.getStrgTgtReport_AfterSelect(row, builder, t, result);
	}
	protected void getStrgTgtReport_AfterSelectSub(MCRow row, MCQueryApiBuilder builder,
			MAM_STRG_TGT_REPORT_R t, MCList<?> result) {
		MCList<MAM_STRG_TGT_REPORT_R> l = (MCList<MAM_STRG_TGT_REPORT_R>) result;
		mcframe.serverCore.report.MCServerReportDefine rd = new
				mcframe.serverCore.report.MCServerReportDefine();
		for (MAM_STRG_TGT_REPORT_R r : l) {
			String[] id = rd.getId(r.report_id());
			if (id != null) {
				r.setStringNE(StrgTgtReportCols.$o_report_nm, rd.getReportName(id[0], r.report_id()));
			}
		}
	}
	// -- StrgTgtReport:保存対象帳票(END)
	// -- ExtSysEdi:外部システム（ＡＣ） (START)
	@Override
	protected void getExtSysAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t,
			MCList<?> result) {
		super.getExtSysAc_Set(row, builder, t, result);
		builder.addWhereWithAnd(
				bracket(t.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.AC.value()))
						.or(t.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.AC_SAP.value())))));
	}

	protected void getExtSysAc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ExtSysAcCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ExtSysAcCols.$o_ext_sys_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	// -- ExtSysEdi:外部システム（ＡＣ） (END)
}
