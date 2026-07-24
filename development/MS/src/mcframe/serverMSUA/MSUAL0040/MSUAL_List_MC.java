package mcframe.serverMSUA.MSUAL0040;

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMS.notice.MS_Msg.MSBCL0084;
import static mcframe.commonMS.notice.MS_Msg.MSUAL0006;
import static mcframe.commonMS.notice.MS_Msg.MSUAL0008;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.util.MCDBUtil.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.getToday;
import static mcframe.serverMA.dbc.MABSFunction.MAPA_BP$F_GET_AP_DPT_CD_NE;
import static mcframe.serverMA.dbc.MABSFunction.MAPA_BP$F_GET_BP_ADDR;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getCo;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.createSqlId;

import java.util.Arrays;
import java.util.List;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.queryapi.IFMCSQL.MCPredicate;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys;
import mcframe.serverMS.dbc.*;

abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- ItmDtlMfgLoc:製造場所 (START)
	@Override
	public MCList<MCRow> getItmDtlMfgLoc(MCRow row) {
		if (!row.getBooleanNE(ItmDtlMfgLocCols.$i_mfg_flg)
				&& !row.getBooleanNE(ItmDtlMfgLocCols.$i_outsrc_flg)) {
			row.setBooleanNE(ItmDtlMfgLocCols.$i_mfg_flg, true);
			row.setBooleanNE(ItmDtlMfgLocCols.$i_outsrc_flg, true);
		}
		
		return super.getItmDtlMfgLoc(row);
	}

	@Override
	protected void getItmDtlMfgLoc_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_SITE_R site = MAM_SITE_R.create("SITE");
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MAM_BP_R bp2 = MAM_BP_R.create("BP2");
		MAVM_ITM_WG_R itm_wg = MAVM_ITM_WG_R.create("ITM_WG");
		MAVM_WR_LOC_R wr_loc = MAVM_WR_LOC_R.create("WR_LOC");

		super.getItmDtlMfgLoc_Set(row, builder, t, result);
		// MAVM_ITM_DTL_MFGにて、発注先・メーカ・依頼先場所のすべてにNULL文字が設定されているレコードが抽出される
		result.addBooleanColumn("mfg_str_ln_tgt_flg");
		result.addStringColumn("mfg_inst_unit_typ");
		result.addBooleanColumn("inpt_itm_add_flg");
		result.addBooleanColumn("inpt_itm_del_flg");
		result.addBooleanColumn("repurc_obli_flg");
		result.addStringColumn("outsrc_upri_typ");
		
		builder.setDistinct();
		builder.setSelect(t.mfg_loc_cd);
		builder.addSelect(loc.loc_nm.as("mfg_loc_nm"));
		builder.addSelect(loc.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"));
		builder.addSelect(loc.wg_cd.as("mfg_loc_wg_cd"));
		builder.addSelect(wg.wg_nm.as("mfg_loc_wg_nm"));
		builder.addSelect(loc.site_cd.as("mfg_loc_site_cd"));
		builder.addSelect(site.site_nm.as("mfg_loc_site_nm"));
		builder.addSelect(loc.sppl_cd);
		builder.addSelect(bp.bp_nm.as("sppl_nm"));
		builder.addSelect(loc.maker_cd);
		builder.addSelect(bp2.bp_nm.as("maker_nm"));
		builder.addSelect(itm_wg.mfg_inst_unit_typ.as("mfg_inst_unit_typ"));
		builder.addSelect(itm_wg.inpt_itm_add_flg.as("inpt_itm_add_flg"));
		builder.addSelect(itm_wg.inpt_itm_del_flg.as("inpt_itm_del_flg"));
		builder.addSelect(t.purc_id_typ);
		builder.addSelect(nvl(t.purc_basis_typ, bp.purc_basis_typ).as("purc_basis_typ"));
		builder.addSelect(bp.repurc_obli_flg);
		builder.addSelect(nvl(bp.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"));
		builder.addInnerJoin(loc, t.mfg_loc_cd.eq(loc.loc_cd));
		builder.addInnerJoin(site, loc.site_cd.eq(site.site_cd));
		builder.addInnerJoin(wg, loc.wg_cd.eq(wg.wg_cd));
		builder.addLeftOuterJoin(bp, loc.sppl_cd.eq(bp.bp_cd));
		builder.addLeftOuterJoin(bp2, loc.maker_cd.eq(bp2.bp_cd));
		builder.addLeftOuterJoin(itm_wg,
				t.itm_cd.eq(itm_wg.itm_cd)
				.and(t.itm_sub1.eq(itm_wg.itm_sub1))
				.and(t.itm_sub2.eq(itm_wg.itm_sub2))
				.and(t.itm_sub3.eq(itm_wg.itm_sub3))
				.and(loc.wg_cd.eq(itm_wg.wg_cd)));
		if (row.contains(ItmDtlMfgLocCols.$i_wr_flg)
				&& row.getBooleanNE(ItmDtlMfgLocCols.$i_wr_flg)) {
			builder.addInnerJoin(wr_loc, wr_loc.loc_cd.eq(t.mfg_loc_cd));
		}
		
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmDtlMfgLocCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmDtlMfgLocCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(ItmDtlMfgLocCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(ItmDtlMfgLocCols.$i_itm_sub3));
		// 製造指図時には格納先は製造場所よりも後に入力するため、カットオフする
		builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")), row.getStringNE(ItmDtlMfgLocCols.$i_wg_cd));
		
		if (!isNull(row.getDateNE(ItmDtlMfgLocCols.$i_master_dt))) {
			builder.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), row.getDateNE(ItmDtlMfgLocCols.$i_master_dt));
		}
		
		if(!row.getBooleanNE(ItmDtlMfgLocCols.$i_mfg_flg)) {
			builder.addWhereWithAnd(loc.sppl_cd.isNotNull());
		}
		else if(!row.getBooleanNE(ItmDtlMfgLocCols.$i_outsrc_flg)) {
			builder.addWhereWithAnd(loc.sppl_cd.isNull());
		}
	}
	
	@Override
	protected MCList<?> getItmDtlMfgLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlMfgLoc_AfterSelect(row, builder, t, result);
		getItmDtlMfgLoc_complPurcBasisTyp(row, l);
		
		if (l.size() < 2) {
			return l;
		}
		
		String[] keyCols = {
				"mfg_loc_cd"
		};
		String[] chkCols = {
				"purc_id_typ", "purc_basis_typ"
		};
		
		l = getNoDupListSub(l, keyCols, chkCols);
		return l;
	}

	protected void getItmDtlMfgLoc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmDtlMfgLocCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmDtlMfgLocCols.$o_mfg_loc_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	
	/**
	 * 仕入計上区分を補完します。
	 */
	protected void getItmDtlMfgLoc_complPurcBasisTyp(MCRow row, MCList<?> list) {
		list.forEach(r -> {
			if (!isNull(r.getStringNE("sppl_nm"))) {
				r.setStringNE(ItmDtlBomPtnCols.$o_purc_basis_typ, nvl(r.getStringNE(ItmDtlBomPtnCols.$o_purc_basis_typ), MAC_PURC_BASIS_TYP.ANY_BASIS.value()));
			}
		});
	}
	// -- ItmDtlMfgLoc:製造場所 (END)

	// -- ItmDtlBomPtn:構成パタン(START)
	protected MCMessage getItmDtlBomPtn_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(ItmDtlBomPtnCols.$i_itm_cd),
				row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub1),
				row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub2),
				row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSUAL0006,
				toYMDString(row.getDateNE(ItmDtlBomPtnCols.$i_dt)), itmInfo,
				row.getStringNE(ItmDtlBomPtnCols.$i_wg_cd),
				row.getStringNE(ItmDtlBomPtnCols.$i_mfg_loc_cd),
				row.getStringNE(ItmDtlBomPtnCols.$i_sppl_cd),
				row.getStringNE(ItmDtlBomPtnCols.$i_maker_cd),
				row.getStringNE(ItmDtlBomPtnCols.$i_rqst_loc_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	
	@Override
	protected void getItmDtlBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAVM_ITM_WG_R itm_wg = MAVM_ITM_WG_R.create("ITM_WG");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_BP_R bp = MAM_BP_R.create("BP");

		super.getItmDtlBomPtn_Set(row, builder, t, result);
		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(ItmDtlBomPtnCols.$o_rqst_wg_nm);
		result.addStringColumn("mfg_inst_unit_typ");
		result.addBooleanColumn("inpt_itm_add_flg");
		result.addBooleanColumn("inpt_itm_del_flg");
		
		// Select句、結合の設定
		builder.removeSelect(MAVM_ITM_DTL_MFG_R.$rqst_wg_cd);
		builder.addSelect(nvl( t.rqst_wg_cd, t.wg_cd).as("rqst_wg_cd"));
		builder.addSelect(wg.wg_nm.as("rqst_wg_nm"));
		builder.addSelect(itm_wg.mfg_inst_unit_typ.as("mfg_inst_unit_typ"));
		builder.addSelect(itm_wg.inpt_itm_add_flg.as("inpt_itm_add_flg"));
		builder.addSelect(itm_wg.inpt_itm_del_flg.as("inpt_itm_del_flg"));
		builder.addSelect(bp.bp_nm.as("sppl_nm"));
		builder.addSelect(t.purc_id_typ);
		builder.addSelect(nvl(t.purc_basis_typ, bp.purc_basis_typ).as("purc_basis_typ"));
		builder.addLeftOuterJoin(loc, t.mfg_loc_cd.eq(loc.loc_cd));
		builder.addLeftOuterJoin(wg, t.rqst_wg_cd.eq(wg.wg_cd)); // MAVM_ITM_DTL_MFGでNVLしている
		builder.addLeftOuterJoin(bp, loc.sppl_cd.eq(bp.bp_cd));
		builder.addLeftOuterJoin(itm_wg,
				t.itm_cd.eq(itm_wg.itm_cd)
				.and(t.itm_sub1.eq(itm_wg.itm_sub1))
				.and(t.itm_sub2.eq(itm_wg.itm_sub2))
				.and(t.itm_sub3.eq(itm_wg.itm_sub3))
				.and(t.wg_cd.eq(itm_wg.wg_cd)));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		if (row.getBooleanNE(ItmDtlBomPtnCols.$i_dt_opt_flg)) {
			builder.addWhereWithCutOffAnd(bind("1").between(t.st_dt, t.end_dt), row.getDateNE(ItmDtlBomPtnCols.$i_dt));
		}
		else {
			builder.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), row.getDateNE(ItmDtlBomPtnCols.$i_dt));
		}
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_itm_sub3));
		builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_wg_cd));
		builder.addWhereWithAnd(t.mfg_loc_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_mfg_loc_cd));
		builder.addWhereWithCutOffAnd(t.sppl_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_sppl_cd));
		builder.addWhereWithCutOffAnd(t.maker_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_maker_cd));
		builder.addWhereWithCutOffAnd(t.rqst_loc_cd.eq(bind("1")), row.getStringNE(ItmDtlBomPtnCols.$i_rqst_loc_cd));
	}
	
	@Override
	protected MCList<?> getItmDtlBomPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlBomPtn_AfterSelect(row, builder, t, result);
		getItmDtlMfgLoc_complPurcBasisTyp(row, l);
		
		return l;
	}
	
	// -- ItmDtlBomPtn:構成パタン (END)

	// -- ItmDtlSppl:発注先(START)
	@Override
	public MCList<MCRow> getItmDtlSppl(MCRow row) {
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		
		tmpL.addAll(super.getItmDtlSppl(row));
		// 仕入計上区分取得フラグがオン、かつ資産管理対象外品の場合は、品目詳細マスタから発注先を取得する。
		if (row.getBooleanNE(ItmDtlSpplCols.$i_purc_basis_typ_flg)
				&& row.getBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg)
				&& !isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				&& !MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlSpplCols.$i_asset_mng_typ))) {
			tmpL = getItmDtlSppl_mergeNotMngList(row, tmpL);
		}

		return tmpL;
	}
	
	@Override
	protected void getItmDtlSppl_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		super.getItmDtlSppl_Set(row, builder, t, result);
		MCDate dt2 = row.getDateNE(ItmDtlSpplCols.$i_master_dt2);
		if (isNull(dt2)) {
			row.setDateNE(ItmDtlSpplCols.$i_master_dt2, 
					row.getDateNE(ItmDtlSpplCols.$i_master_dt));
		}
		getItmDtlSppl_addSelectJoinCustom(row, builder, t, result);
		getItmDtlSppl_addWhereCustom(row, builder, t, result);
	}
	
	@Override
	protected MCList<?> getItmDtlSppl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlSppl_AfterSelect(row, builder, t, result);
		getItmDtlSppl_complPurcBasisTyp(row, l);
		
		String[] keyCols = {
				"bp_cd"
		};
		l = getNoDupList(l, keyCols);
		itmDtlSpplMaker_SetDbcValues(row, l);
		return l;
	}

	protected void getItmDtlSppl_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R area = MAM_AREA_R.create("AREA");
		MAM_CO_R co = MAM_CO_R.create("CO");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");

		// DBコンテナの項目に定義されていない項目
		builder.setDistinct();
		result.addNumberColumn(ItmDtlSpplCols.$o_amt_dec_place);
		result.addNumberColumn(ItmDtlSpplCols.$o_upri_dec_place);
		result.addBooleanColumn(ItmDtlSpplCols.$o_foreign_flg);
		result.addStringColumn(ItmDtlSpplCols.$o_rqst_wg_cd);
		result.addStringColumn(ItmDtlSpplCols.$o_rqst_wg_nm);
		result.addStringColumn(ItmDtlSpplCols.$o_purc_id_typ);
		result.addStringColumn(ItmDtlSpplCols.$o_purc_usr_cd);
		result.addStringColumn(ItmDtlSpplCols.$o_purc_dpt_cd);
		result.addDateColumn(ItmDtlSpplCols.$o_st_dt);
		result.addDateColumn(ItmDtlSpplCols.$o_end_dt);
		result.addBooleanColumn(BpCols.$o_edi_po_send_tgt_flg);
		result.addBooleanColumn(BpCols.$o_edi_accpt_send_tgt_flg);
		result.addStringColumn(BpCols.$o_bp_grp_nm1);
		result.addStringColumn(BpCols.$o_bp_grp_nm2);
		result.addStringColumn(BpCols.$o_bp_grp_nm3);
		result.addStringColumn(BpCols.$o_bp_grp_nm4);
		result.addStringColumn(BpCols.$o_bp_grp_nm5);
		result.addStringColumn(BpCols.$o_bp_grp_nm6);
		result.addStringColumn(BpCols.$o_bp_grp_nm7);
		result.addStringColumn(BpCols.$o_bp_grp_nm8);
		result.addStringColumn(BpCols.$o_bp_grp_nm9);
		result.addStringColumn(BpCols.$o_bp_grp_nm10);
		
		// リストロジックの出力として設定されているZ項目（後でDbcCacheにより追加するもの）
		builder.inactiveForeign("BP1");
		builder.removeSelect(MAM_BP_R.$acst_nm);
		builder.inactiveForeign("AREA1");
		builder.removeSelect(MAM_AREA_R.$area_nm);
		builder.inactiveForeign("CNTRY1");
		builder.removeSelect(MAM_CNTRY_R.$cntry_nm);
		builder.inactiveForeign("TTERM1");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm1);
		builder.inactiveForeign("TTERM2");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm2);
		builder.inactiveForeign("TTERM3");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm3);
		builder.inactiveForeign("CUR1");
		builder.removeSelect(MAM_CUR_R.$cur_nm);
		// リストロジックの出力として設定されているが、定数等を参照して検索するもの
		builder.removeSelect(MAM_BP_R.$zip_cd, MAM_BP_R.$addr1, MAM_BP_R.$addr2, MAM_BP_R.$addr3, MAM_BP_R.$addr4,
				MAM_BP_R.$tel, MAM_BP_R.$fax, MAM_BP_R.$ap_dpt_cd, MAM_BP_R.$sppl_cntct_dpt, MAM_BP_R.$sppl_cntct_psn);

		// Select句、結合の設定
		builder.removeSelect(MAM_BP_R.$purc_upri_req_typ);
		builder.removeSelect(MAM_BP_R.$outsrc_upri_typ);
		builder.addSelect(
				bracket(
						cases()
						.when(t.cntry_cd.eq(co.cntry_cd))
						.then(value(false))
						.otherwise(value(true)))
				.as("foreign_flg"));
		builder.addSelect(
				nvl(t.purc_upri_req_typ, co.purc_upri_req_typ).as("purc_upri_req_typ"));
		builder.addSelect(
				nvl(t.outsrc_upri_typ, co.outsrc_upri_typ).as("outsrc_upri_typ"));
		if(!isNull(row.getDateNE(ItmDtlSpplCols.$i_master_dt2))) {
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value()))
					.as("zip_cd"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.ADDR1.value()))
					.as("addr1"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.ADDR2.value()))
					.as("addr2"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.ADDR3.value()))
					.as("addr3"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.ADDR4.value()))
					.as("addr4"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.TEL.value()))
					.as("tel"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.FAX.value()))
					.as("fax"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value()))
					.as("sppl_cntct_dpt"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt2"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value()))
					.as("sppl_cntct_psn"));
			builder.addSelect(
					MAPA_BP$F_GET_AP_DPT_CD_NE(
							t.asppl_cd,
							bind("master_dt2"),
							value(true))
					.as("ap_dpt_cd"));
		}
		// 入力補助画面からのリスト取得時
		if (!isInput(row)) {
			builder.addLeftOuterJoin(cntry, cntry.cntry_cd.eq(t.cntry_cd));
			builder.addLeftOuterJoin(area, area.area_cd.eq(t.area_cd));
		}
		builder.addInnerJoin(co, value(0).eq(value(0)));
		row.addDateColumn("edi_today", getToday());
		
		// マニュアル発注ＦＬＧオフ、または棚卸資産管理する場合
		if (!row.getBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg)
				|| isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				|| MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlSpplCols.$i_asset_mng_typ))) {
			builder.removeSelect(MAM_BP_R.$bp_cd);
			builder.addSelect(nvl(loc.sppl_cd, dtl.sppl_cd).as("bp_cd"));
			builder.addSelect(nvl(dtl.rqst_wg_cd, dtl.wg_cd).as("rqst_wg_cd"));
			builder.addSelect(dtl.purc_id_typ);
			builder.addSelect(nvl(dtl.purc_basis_typ, t.purc_basis_typ).as("purc_basis_typ"));
			builder.addLeftOuterJoin(loc,
					t.bp_cd.eq(loc.sppl_cd));
			builder.addInnerJoin(dtl,
					bracket(t.bp_cd.eq(dtl.sppl_cd)
							.or(loc.loc_cd.eq(dtl.mfg_loc_cd)))
					.and(dtl.itm_cd.eq(bind("itm_cd")))
					.and(dtl.itm_sub1.eq(bind("itm_sub1")))
					.and(dtl.itm_sub2.eq(bind("itm_sub2")))
					.and(dtl.itm_sub3.eq(bind("itm_sub3")))
					.and(dtl.wg_cd.eq(bind("wg_cd"))));
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面からのリスト取得時
		setSelectJoinOfBpGrpForBp(row, builder);
	}

	protected void getItmDtlSppl_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R area = MAM_AREA_R.create("AREA");
		MAM_CO_R co = MAM_CO_R.create("CO");
		MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
		MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
		MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
		MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
		MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
		MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
		MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
		MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
		MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
		MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		if (row.getBooleanNE(ItmDtlSpplCols.$i_foreign_flg)) {
			builder.addWhereWithAnd(t.cntry_cd.neq(co.cntry_cd));
		}
		// マニュアル発注ＦＬＧオフ、または棚卸資産管理する場合
		if (!row.getBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg)
				|| isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				|| MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlSpplCols.$i_asset_mng_typ))) {
			if (row.getBooleanNE(ItmDtlSpplCols.$i_inc_outsrc_flg)) {
				getItmDtlSppl_WhereIncOutsrc(row, builder, t, result);
			}
			else {
				getItmDtlSppl_WhereNotIncOutsrc(row, builder, t, result);
			}
		}
		
		// 直接入力時は以下の条件は追加しない
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.bp_cd.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_cd));
		builder.addWhereWithCutOffAnd(t.bp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.ein.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_ein));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm1.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_alt_nm1));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm2.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_alt_nm2));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm3.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_alt_nm3));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm4.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_alt_nm4));
		builder.addWhereWithCutOffAnd(t.cntry_cd.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_cntry_cd));
		builder.addWhereWithCutOffAnd(cntry.cntry_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_cntry_nm));
		builder.addWhereWithCutOffAnd(t.area_cd.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_area_cd));
		builder.addWhereWithCutOffAnd(area.area_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_area_nm));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm1));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm2));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm4));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm5));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm6));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm7));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm8));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm9));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlSpplCols.$i_bp_grp_nm10));
	}

	protected void getItmDtlSppl_WhereIncOutsrc(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");

		if (isNull(row.getDateNE(ItmDtlSpplCols.$i_master_dt))) {
			builder.addWhereWithAnd(
					bracket(
							dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
							.and(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.cutoff$and(nvl(loc.sppl_cd, dtl.sppl_cd).eq(bind("1"))))
					.or(dtl.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(loc.sppl_cd.isNotNull())
							.cutoff$and(nvl(loc.sppl_cd, dtl.sppl_cd).eq(bind("2")))),
					row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
					row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
		else {
			builder.addWhereWithAnd(
					bracket(
							dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
							.and(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.cutoff$and(nvl(loc.sppl_cd, dtl.sppl_cd).eq(bind("1")))
							.and(bind("2").between(dtl.st_dt, dtl.end_dt)))
					.or(dtl.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(loc.sppl_cd.isNotNull())
							.cutoff$and(nvl(loc.sppl_cd, dtl.sppl_cd).eq(bind("3")))
							.and(bind("4").between(dtl.st_dt, dtl.end_dt))),
					row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
					row.getValueNE(ItmDtlSpplCols.$i_master_dt),
					row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
					row.getValueNE(ItmDtlSpplCols.$i_master_dt));
		}
	}

	protected void getItmDtlSppl_WhereNotIncOutsrc(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");

		builder.addWhereWithAnd(dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithAnd(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithAnd(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithCutOffAnd(nvl(loc.sppl_cd, dtl.sppl_cd).eq(bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		if (!isNull(row.getDateNE(ItmDtlSpplCols.$i_master_dt))) {
			builder.addWhereWithAnd(bind("1").between(dtl.st_dt, dtl.end_dt), row.getDateNE(ItmDtlSpplCols.$i_master_dt));
		}
	}

	protected void getItmDtlSppl_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmDtlSpplCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmDtlSpplCols.$o_bp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	
	/**
	 * 資産管理対象外品を品目詳細マスタから取得してマージします。
	 */
	protected MCList<MCRow> getItmDtlSppl_mergeNotMngList(MCRow row, MCList<MCRow> list) {
		MCList<MCRow> notMngL = getItmDtlSppl_getNotMng(row);
		if (isNull(notMngL)) {
			return list;
		}

		MCIndexKey idx = notMngL.createIndex(ItmDtlSpplCols.$o_bp_cd);
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		list.forEach(r -> {
			MCRow notMngR = notMngL.getFirst(idx, r.getStringNE(ItmDtlSpplCols.$o_bp_cd));
			if (!isNull(notMngR)) {
				tmpL.add(notMngR);
			}
			else {
				tmpL.add(r);
			}
		});
		
		return tmpL;
	}
	
	/**
	 * 資産管理対象外品を品目詳細マスタから取得します。
	 */
	protected MCList<MCRow> getItmDtlSppl_getNotMng(MCRow row) {
		MCRow tmpRow = MCRow.create();
		MCRow.copyall(tmpRow, row);
		tmpRow.setBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg, false);
		
		_itmDtlSpplMakerCache = new DbcCacheMap();
		return super.getItmDtlSppl(tmpRow);
	}
	
	/**
	 * 仕入計上区分を補完します。
	 */
	protected void getItmDtlSppl_complPurcBasisTyp(MCRow row, MCList<?> list) {
		if (!row.getBooleanNE(ItmDtlSpplCols.$i_purc_basis_typ_flg)) {
			return;
		}
		
		list.forEach(r -> {
			r.setStringNE(ItmDtlSpplCols.$o_purc_basis_typ, nvl(r.getStringNE(ItmDtlSpplCols.$o_purc_basis_typ), MAC_PURC_BASIS_TYP.ANY_BASIS.value()));
		});
	}
	// -- ItmDtlSppl:発注先 (END)

	// -- ItmDtlMaker:メーカ(START)
	@Override
	public MCList<MCRow> getItmDtlMaker(MCRow row) {
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		tmpL.addAll(super.getItmDtlMaker(row));
		
		// 仕入計上区分取得フラグがオン、かつ資産管理対象外品の場合は、品目詳細マスタから発注先を取得する。
		if (row.getBooleanNE(ItmDtlSpplCols.$i_purc_basis_typ_flg)
				&& row.getBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg)
				&& !isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				&& !MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlSpplCols.$i_asset_mng_typ))) {
			tmpL = getItmDtlMaker_mergeNotMngList(row, tmpL);
		}
		
		tmpL.addAll(getItmDtlMaker_getNullVal(row));
		
		// メーカがNULL文字の品目詳細マスタがない、かつ資産管理対象外品の場合のみNULL文字の行を追加する
		if (row.getBooleanNE(ItmDtlSpplCols.$i_mode_nullval_flg)
				&& !isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				&& !MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))) {
			MCIndexKey downKey = tmpL.createIndex(ItmDtlMakerCols.$o_bp_cd);
			MCRow chkRow = tmpL.getFirst(downKey, MAC_STR.NULL_VAL.value());
			if(isNull(chkRow)) {
				MCRow r = tmpL.createRow();
				r.setStringNE(ItmDtlSpplCols.$o_bp_cd, MAC_STR.NULL_VAL.value());
				r.addStringColumn(ItmDtlSpplCols.$o_bp_nm);
				tmpL.add(r);
			}
		}
		
		getItmDtlMaker_complPurcBasisTyp(row, tmpL);
		return tmpL;
	}
	
	/**
	 * ＮＵＬＬ文字のメーカを品目詳細マスタから取得します。
	 */
	protected MCList<MCRow> getItmDtlMaker_getNullVal(MCRow row) {
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setDistinct();
		result.addBooleanColumn("foreign_flg");
		result.addBooleanColumn("cst_flg");
		result.addBooleanColumn("cst_sundry_flg");
		result.addBooleanColumn("acst_flg");
		result.addBooleanColumn("bcst_flg");
		result.addBooleanColumn("rcst_flg");
		result.addBooleanColumn("dlv_flg");
		result.addBooleanColumn("dlv_sundry_flg");
		result.addBooleanColumn("tdlv_flg");
		result.addBooleanColumn("dest_flg");
		result.addBooleanColumn("cred_flg");
		result.addBooleanColumn("sppl_flg");
		result.addBooleanColumn("asppl_flg");
		result.addBooleanColumn("bsppl_flg");
		result.addBooleanColumn("psppl_flg");
		result.addBooleanColumn("maker_flg");
		result.addBooleanColumn("sls_upri_cng_flg");
		result.addBooleanColumn("stk_lst_issue_flg");
		result.addBooleanColumn("sls_tax_cd_prio_flg");
		result.addBooleanColumn("wrk_ar_flg");
		result.addBooleanColumn("cst_iv_flg");
		result.addBooleanColumn("tax_on_bill_flg");
		result.addBooleanColumn("sls_interim_cl_flg");
		result.addBooleanColumn("bfw_bal_disp_flg");
		result.addBooleanColumn("bill_dtl_outp_flg");
		result.addBooleanColumn("bill_dtl_rcv_flg");
		result.addBooleanColumn("auto_line_appl_flg");
		result.addBooleanColumn("rcv_auto_appl_tgt_flg");
		result.addBooleanColumn("rcv_amt_match_flg");
		result.addBooleanColumn("ar_sttl_typ_match_flg");
		result.addBooleanColumn("calc_com_paid_flg");
		result.addBooleanColumn("subcon_flg");
		result.addBooleanColumn("purc_upri_cng_flg");
		result.addBooleanColumn("purc_tax_cd_prio_flg");
		result.addBooleanColumn("wrk_po_flg");
		result.addBooleanColumn("wrk_ap_flg");
		result.addBooleanColumn("onr_prsppl_flg");
		result.addBooleanColumn("prov_upri_cng_flg");
		result.addBooleanColumn("prov_tax_cd_prio_flg");
		result.addBooleanColumn("sppl_iv_flg");
		result.addBooleanColumn("prms_recv_flg");
		result.addBooleanColumn("pay_spot_flg");
		result.addBooleanColumn("purc_interim_cl_flg");
		result.addBooleanColumn("pri_prnt_flg");
		result.addBooleanColumn("cnsgn_stktk_flg");
		result.addBooleanColumn("tdlv_req_flg");
		result.addBooleanColumn("repurc_obli_flg");

		result.addNumberColumn("amt_dec_place");
		result.addNumberColumn("upri_dec_place");
		result.addNumberColumn("bill_crryovr_times");
		result.addNumberColumn("bill_cl_day1");
		result.addNumberColumn("bill_cl_day2");
		result.addNumberColumn("bill_cl_day3");
		result.addNumberColumn("bill_cl_day4");
		result.addNumberColumn("bill_cl_day5");
		result.addNumberColumn("bill_cl_delay_days");
		result.addNumberColumn("auto_appl_delay_days");
		result.addNumberColumn("pay_crryovr_times");
		result.addNumberColumn("psppl_cl_day1");
		result.addNumberColumn("psppl_cl_day2");
		result.addNumberColumn("psppl_cl_day3");
		result.addNumberColumn("psppl_cl_day4");
		result.addNumberColumn("psppl_cl_day5");
		result.addNumberColumn("note_days");
		result.addStringColumn("bp_grp_nm1");
		result.addStringColumn("bp_grp_nm2");
		result.addStringColumn("bp_grp_nm3");
		result.addStringColumn("bp_grp_nm4");
		result.addStringColumn("bp_grp_nm5");
		result.addStringColumn("bp_grp_nm6");
		result.addStringColumn("bp_grp_nm7");
		result.addStringColumn("bp_grp_nm8");
		result.addStringColumn("bp_grp_nm9");
		result.addStringColumn("bp_grp_nm10");

		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		
		// select句構築
		builder.inactiveForeign("WG2");
		builder.setSelect(t.maker_cd.as("bp_cd"));
		builder.addSelect(nvl(t.rqst_wg_cd, t.wg_cd).as("rqst_wg_cd"));
		builder.addSelectNEActiveForeign(wg.wg_nm.as("rqst_wg_nm"));
		builder.addSelect(t.purc_id_typ);
		builder.addSelect(t.purc_basis_typ);
		builder.addSelect(nullValue().as("bp_nm"));
		builder.addSelect(nullValue().as("bp_alt_nm1"));
		builder.addSelect(nullValue().as("bp_alt_nm2"));
		builder.addSelect(nullValue().as("bp_alt_nm3"));
		builder.addSelect(nullValue().as("bp_alt_nm4"));
		builder.addSelect(nullValue().as("ein"));
		builder.addSelect(nullValue().as("cntry_cd"));
		builder.addSelect(nullValue().as("cntry_nm"));
		builder.addSelect(value(false).as("foreign_flg"));
		builder.addSelect(nullValue().as("area_cd"));
		builder.addSelect(nullValue().as("area_nm"));
		builder.addSelect(nullValue().as("cur_cd"));
		builder.addSelect(nullValue().as("cur_nm"));
		builder.addSelect(nullValue().as("amt_dec_place"));
		builder.addSelect(nullValue().as("upri_dec_place"));
		builder.addSelect(value(false).as("cst_flg"));
		builder.addSelect(value(false).as("cst_sundry_flg"));
		builder.addSelect(value(false).as("acst_flg"));
		builder.addSelect(value(false).as("bcst_flg"));
		builder.addSelect(value(false).as("rcst_flg"));
		builder.addSelect(value(false).as("dlv_flg"));
		builder.addSelect(value(false).as("dlv_sundry_flg"));
		builder.addSelect(value(false).as("tdlv_flg"));
		builder.addSelect(value(false).as("dest_flg"));
		builder.addSelect(value(false).as("cred_flg"));
		builder.addSelect(value(false).as("sppl_flg"));
		builder.addSelect(value(false).as("asppl_flg"));
		builder.addSelect(value(false).as("bsppl_flg"));
		builder.addSelect(value(false).as("psppl_flg"));
		builder.addSelect(value(false).as("maker_flg"));
		builder.addSelect(nullValue().as("memo1"));
		builder.addSelect(nullValue().as("memo2"));
		builder.addSelect(nullValue().as("memo3"));
		builder.addSelect(nullValue().as("ins_ts"));
		builder.addSelect(nullValue().as("upd_ts"));
		builder.addSelect(nullValue().as("std_co_cd"));
		builder.addSelect(nullValue().as("prnt_lcl_cd"));
		builder.addSelect(nullValue().as("bp_grp_cd1"));
		builder.addSelect(nullValue().as("bp_grp_cd2"));
		builder.addSelect(nullValue().as("bp_grp_cd3"));
		builder.addSelect(nullValue().as("bp_grp_cd4"));
		builder.addSelect(nullValue().as("bp_grp_cd5"));
		builder.addSelect(nullValue().as("bp_grp_cd6"));
		builder.addSelect(nullValue().as("bp_grp_cd7"));
		builder.addSelect(nullValue().as("bp_grp_cd8"));
		builder.addSelect(nullValue().as("bp_grp_cd9"));
		builder.addSelect(nullValue().as("bp_grp_cd10"));
		builder.addSelect(nullValue().as("bp_alc_grp"));
		builder.addSelect(nullValue().as("ar_dpt_typ"));
		builder.addSelect(nullValue().as("sls_upri_req_typ"));
		builder.addSelect(value(false).as("sls_upri_cng_flg"));
		builder.addSelect(nullValue().as("sls_upri_rnd_typ"));
		builder.addSelect(nullValue().as("sls_amt_rnd_typ"));
		builder.addSelect(nullValue().as("sls_tax_calc_typ"));
		builder.addSelect(nullValue().as("sls_tax_rnd_typ"));
		builder.addSelect(nullValue().as("sls_basis_typ"));
		builder.addSelect(nullValue().as("bill_basis_typ"));
		builder.addSelect(nullValue().as("ship_schd_split_typ"));
		builder.addSelect(nullValue().as("bill_crryovr_times"));
		builder.addSelect(nullValue().as("lot_back_stop_typ"));
		builder.addSelect(nullValue().as("slip_each_lot_typ"));
		builder.addSelect(nullValue().as("cst_ship_form_cd"));
		builder.addSelect(value(false).as("stk_lst_issue_flg"));
		builder.addSelect(nullValue().as("stk_lst_form_cd"));
		builder.addSelect(value(false).as("sls_tax_cd_prio_flg"));
		builder.addSelect(value(false).as("wrk_ar_flg"));
		builder.addSelect(value(false).as("cst_iv_flg"));
		builder.addSelect(nullValue().as("cst_tterm_cd1"));
		builder.addSelect(nullValue().as("cst_tterm_cd2"));
		builder.addSelect(nullValue().as("cst_tterm_cd3"));
		builder.addSelect(nullValue().as("cst_tterm_nm1"));
		builder.addSelect(nullValue().as("cst_tterm_nm2"));
		builder.addSelect(nullValue().as("cst_tterm_nm3"));
		builder.addSelect(nullValue().as("acst_cd"));
		builder.addSelect(nullValue().as("acst_nm"));
		builder.addSelect(nullValue().as("bcst_cd"));
		builder.addSelect(nullValue().as("rcst_cd"));
		builder.addSelect(nullValue().as("ar_cred_cd"));
		builder.addSelect(nullValue().as("bill_dpt_typ"));
		builder.addSelect(nullValue().as("bill_cl_typ"));
		builder.addSelect(nullValue().as("bill_cl_day1"));
		builder.addSelect(nullValue().as("bill_cl_day2"));
		builder.addSelect(nullValue().as("bill_cl_day3"));
		builder.addSelect(nullValue().as("bill_cl_day4"));
		builder.addSelect(nullValue().as("bill_cl_day5"));
		builder.addSelect(value(false).as("tax_on_bill_flg"));
		builder.addSelect(nullValue().as("bill_tax_rnd_typ"));
		builder.addSelect(nullValue().as("bill_cl_delay_days"));
		builder.addSelect(nullValue().as("bill_cl_ba_typ"));
		builder.addSelect(value(false).as("sls_interim_cl_flg"));
		builder.addSelect(nullValue().as("bill_cal_cd"));
		builder.addSelect(nullValue().as("rcv_ba_typ"));
		builder.addSelect(value(false).as("bfw_bal_disp_flg"));
		builder.addSelect(nullValue().as("sls_dtl_outp_typ"));
		builder.addSelect(nullValue().as("bill_prnt_typ"));
		builder.addSelect(value(false).as("bill_dtl_outp_flg"));
		builder.addSelect(value(false).as("bill_dtl_rcv_flg"));
		builder.addSelect(nullValue().as("bill_dtl_subttl_typ"));
		builder.addSelect(nullValue().as("bill_dtl_brk_typ"));
		builder.addSelect(nullValue().as("bill_dtl_sort_typ"));
		builder.addSelect(nullValue().as("bill_can_slip_typ"));
		builder.addSelect(value(false).as("auto_line_appl_flg"));
		builder.addSelect(nullValue().as("ar_setoff_grp_cd"));
		builder.addSelect(nullValue().as("xfr_psn"));
		builder.addSelect(value(false).as("rcv_auto_appl_tgt_flg"));
		builder.addSelect(value(false).as("rcv_amt_match_flg"));
		builder.addSelect(value(false).as("ar_sttl_typ_match_flg"));
		builder.addSelect(value(false).as("calc_com_paid_flg"));
		builder.addSelect(nullValue().as("auto_appl_delay_days"));
		builder.addSelect(nullValue().as("asppl_cd"));
		builder.addSelect(value(false).as("subcon_flg"));
		builder.addSelect(nullValue().as("po_print_cd"));
		builder.addSelect(nullValue().as("sppl_ship_form_cd"));
		builder.addSelect(nullValue().as("pay_crryovr_times"));
		builder.addSelect(nullValue().as("purc_upri_req_typ"));
		builder.addSelect(value(false).as("purc_upri_cng_flg"));
		builder.addSelect(nullValue().as("purc_amt_rnd_typ"));
		builder.addSelect(nullValue().as("purc_tax_rnd_typ"));
		builder.addSelect(nullValue().as("purc_tax_calc_typ"));
		builder.addSelect(value(false).as("purc_tax_cd_prio_flg"));
		builder.addSelect(value(false).as("wrk_po_flg"));
		builder.addSelect(value(false).as("wrk_ap_flg"));
		builder.addSelect(nullValue().as("prov_rcv_typ"));
		builder.addSelect(value(false).as("onr_prsppl_flg"));
		builder.addSelect(nullValue().as("prov_basis_typ"));
		builder.addSelect(value(false).as("prov_upri_cng_flg"));
		builder.addSelect(nullValue().as("prov_amt_rnd_typ"));
		builder.addSelect(nullValue().as("prov_tax_rnd_typ"));
		builder.addSelect(nullValue().as("prov_tax_calc_typ"));
		builder.addSelect(value(false).as("prov_tax_cd_prio_flg"));
		builder.addSelect(nullValue().as("sppl_cal_cd"));
		builder.addSelect(value(false).as("sppl_iv_flg"));
		builder.addSelect(value(false).as("prms_recv_flg"));
		builder.addSelect(nullValue().as("sppl_tterm_cd1"));
		builder.addSelect(nullValue().as("sppl_tterm_cd2"));
		builder.addSelect(nullValue().as("sppl_tterm_cd3"));
		builder.addSelect(nullValue().as("bsppl_cd"));
		builder.addSelect(nullValue().as("psppl_cd"));
		builder.addSelect(nullValue().as("ap_cred_cd"));
		builder.addSelect(value(false).as("pay_spot_flg"));
		builder.addSelect(nullValue().as("psppl_cl_day1"));
		builder.addSelect(nullValue().as("psppl_cl_day2"));
		builder.addSelect(nullValue().as("psppl_cl_day3"));
		builder.addSelect(nullValue().as("psppl_cl_day4"));
		builder.addSelect(nullValue().as("psppl_cl_day5"));
		builder.addSelect(value(false).as("purc_interim_cl_flg"));
		builder.addSelect(nullValue().as("ap_setoff_grp_cd"));
		builder.addSelect(nullValue().as("pay_bank_ac_cd"));
		builder.addSelect(nullValue().as("psppl_rmrks"));
		builder.addSelect(nullValue().as("note_days"));
		builder.addSelect(value(false).as("pri_prnt_flg"));
		builder.addSelect(value(false).as("cnsgn_stktk_flg"));
		builder.addSelect(nullValue().as("via_dlv_typ"));
		builder.addSelect(value(false).as("tdlv_req_flg"));
		builder.addSelect(nullValue().as("lg_grp_cd"));
		builder.addSelect(nullValue().as("dlv_cal_cd"));
		builder.addSelect(nullValue().as("dlv_chnnl1"));
		builder.addSelect(nullValue().as("dlv_chnnl2"));
		builder.addSelect(nullValue().as("dlv_chnnl3"));
		builder.addSelect(value(false).as("repurc_obli_flg"));
		builder.addSelect(nullValue().as("outsrc_upri_typ"));
		builder.addSelect(nullValue().as("zip_cd"));
		builder.addSelect(nullValue().as("addr1"));
		builder.addSelect(nullValue().as("addr2"));
		builder.addSelect(nullValue().as("addr3"));
		builder.addSelect(nullValue().as("addr4"));
		builder.addSelect(nullValue().as("tel"));
		builder.addSelect(nullValue().as("fax"));
		builder.addSelect(nullValue().as("ap_dpt_cd"));
		builder.addSelect(nullValue().as("ar_dpt_cd"));
		builder.addSelect(nullValue().as("cst_cntct_dpt"));
		builder.addSelect(nullValue().as("cst_cntct_psn"));
		builder.addSelect(nullValue().as("cst_cntct_psn_title"));
		builder.addSelect(nullValue().as("bill_zip_cd"));
		builder.addSelect(nullValue().as("bill_addr1"));
		builder.addSelect(nullValue().as("bill_addr2"));
		builder.addSelect(nullValue().as("bill_addr3"));
		builder.addSelect(nullValue().as("bill_addr4"));
		builder.addSelect(nullValue().as("bill_tel"));
		builder.addSelect(nullValue().as("bill_bcst_nm"));
		builder.addSelect(nullValue().as("bill_bcst_dpt"));
		builder.addSelect(nullValue().as("bill_bcst_psn"));
		builder.addSelect(nullValue().as("bill_bcst_psn_title"));
		builder.addSelect(nullValue().as("sppl_cntct_dpt"));
		builder.addSelect(nullValue().as("sppl_cntct_psn"));
		builder.addSelect(nullValue().as("sppl_cntct_psn_title"));
		builder.addSelect(nullValue().as("dlv_cntct_dpt"));
		builder.addSelect(nullValue().as("dlv_cntct_psn"));
		builder.addSelect(nullValue().as("dlv_cntct_psn_title"));
		builder.addSelect(nullValue().as("purc_usr_cd"));
		builder.addSelect(nullValue().as("purc_dpt_cd"));
		builder.addSelect(nullValue().as("st_dt"));
		builder.addSelect(nullValue().as("end_dt"));

		builder.addLeftOuterJoin(wg, bracket(wg.wg_cd.eq(nvl(t.rqst_wg_cd, t.wg_cd))));
		builder.addLeftOuterJoin(loc, bracket(loc.loc_cd.eq(t.mfg_loc_cd)));
		// getItmDtlMaker_addWhereCustom と同等のWhere句を追加する。
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmDtlSpplCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmDtlSpplCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(ItmDtlSpplCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(ItmDtlSpplCols.$i_itm_sub3));
		builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(ItmDtlSpplCols.$i_wg_cd));
		
		if (!isNull(row.getDateNE(ItmDtlMakerCols.$i_master_dt))) {
			builder.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), row.getDateNE(ItmDtlMakerCols.$i_master_dt));
		}
		// 購買
		MCPredicate where = 
				bracket(value(0).eq(value(0))
					.and(t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
					.and(t.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
					.cutoff$and(t.sppl_cd.eq(bind("1")))
					.and(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
					.and(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
				);
		// 外注
		if (row.getBooleanNE(ItmDtlMakerCols.$i_inc_outsrc_flg)) {
			where = 
				where.or(
					bracket(value(0).eq(value(0))
							.and(t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value())))
							.cutoff$and(loc.sppl_cd.eq(bind("1")))
							.and(loc.sppl_cd.isNotNull())
							.and(bracket(loc.maker_cd.eq(value(MAC_STR.NULL_VAL.value())).or(loc.maker_cd.isNull())))
							)
					);
		}
		builder.addWhereWithAnd(bracket(where), row.getStringNE(ItmDtlMakerCols.$i_sppl_cd));
		
		String sqlid = createSqlId("MS.MSUAL0040.ItmDtlMaker_getNullVal", t, "S01");
		dbSelect(sqlid, result, builder, row);
		
		String[] keyCols = {
				"bp_cd"
		};
		result = (MCList<MAM_ITM_DTL_R>) getNoDupList(result, keyCols);
		
		return super.getItmDtlMaker_SubColumns(row, result);
	}

	@Override
	protected void getItmDtlMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		super.getItmDtlMaker_Set(row, builder, t, result);
		
		getItmDtlMaker_addSelectJoinCustom(row, builder, t, result);
		getItmDtlMaker_addWhereCustom(row, builder, t, result);
	}

	@Override
	protected MCList<?> getItmDtlMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MCList<?> down = super.getItmDtlMaker_AfterSelect(row, builder, t, result);
		String[] keyCols = {
				"bp_cd"
		};
		down = getNoDupList(down, keyCols);
		itmDtlSpplMaker_SetDbcValues(row, down);
		return down;
	}

	protected void getItmDtlMaker_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R area = MAM_AREA_R.create("AREA");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");
		// DBコンテナの項目に定義されていない項目
		builder.setDistinct();
		result.addNumberColumn(ItmDtlMakerCols.$o_amt_dec_place);
		result.addNumberColumn(ItmDtlMakerCols.$o_upri_dec_place);
		result.addBooleanColumn(ItmDtlMakerCols.$o_foreign_flg);
		result.addStringColumn(ItmDtlMakerCols.$o_rqst_wg_cd);
		result.addStringColumn(ItmDtlMakerCols.$o_rqst_wg_nm);
		result.addStringColumn(ItmDtlMakerCols.$o_purc_id_typ);
		result.addStringColumn(ItmDtlMakerCols.$o_purc_usr_cd);
		result.addStringColumn(ItmDtlMakerCols.$o_purc_dpt_cd);
		result.addDateColumn(ItmDtlMakerCols.$o_st_dt);
		result.addDateColumn(ItmDtlMakerCols.$o_end_dt);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm1);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm2);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm3);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm4);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm5);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm6);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm7);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm8);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm9);
		result.addStringColumn(ItmDtlMakerCols.$o_bp_grp_nm10);
		

		// リストロジックの出力として設定されているZ項目（後でDbcCacheにより追加するもの）
		builder.inactiveForeign("BP1");
		builder.removeSelect(MAM_BP_R.$acst_nm);
		builder.inactiveForeign("AREA1");
		builder.removeSelect(MAM_AREA_R.$area_nm);
		builder.inactiveForeign("CNTRY1");
		builder.removeSelect(MAM_CNTRY_R.$cntry_nm);
		builder.inactiveForeign("TTERM1");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm1);
		builder.inactiveForeign("TTERM2");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm2);
		builder.inactiveForeign("TTERM3");
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm3);
		builder.inactiveForeign("CUR1");
		builder.removeSelect(MAM_CUR_R.$cur_nm);
		// リストロジックの出力として設定されているが、定数等を参照して検索するもの
		builder.removeSelect(MAM_BP_R.$zip_cd, MAM_BP_R.$addr1, MAM_BP_R.$addr2, MAM_BP_R.$addr3, MAM_BP_R.$addr4,
				MAM_BP_R.$tel, MAM_BP_R.$fax, MAM_BP_R.$ap_dpt_cd, MAM_BP_R.$sppl_cntct_dpt, MAM_BP_R.$sppl_cntct_psn, MAM_BP_R.$outsrc_upri_typ);

		// Select句、結合の設定
		builder.addSelect(
				cases()
				.when(t.cntry_cd.eq(value(MAUCL_AppSys.getCo().cntry_cd()))).then(value("0"))
				.otherwise(value("1"))
				.as("foreign_flg"));
		if(!isNull(row.getDateNE(ItmDtlMakerCols.$i_master_dt))) {
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value()))
					.as("zip_cd"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.ADDR1.value()))
					.as("addr1"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.ADDR2.value()))
					.as("addr2"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.ADDR3.value()))
					.as("addr3"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.ADDR4.value()))
					.as("addr4"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.TEL.value()))
					.as("tel"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.FAX.value()))
					.as("fax"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value()))
					.as("sppl_cntct_dpt"));
			builder.addSelect(
					MAPA_BP$F_GET_BP_ADDR(
							t.bp_cd,
							bind("master_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value()))
					.as("sppl_cntct_psn"));
		}
		builder.addSelect(
				nvl(t.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"));
		// 入力補助画面からのリスト取得時
		if (!isInput(row)) {
			builder.addLeftOuterJoin(cntry, cntry.cntry_cd.eq(t.cntry_cd));
			builder.addLeftOuterJoin(area, area.area_cd.eq(t.area_cd));
		}

		// マニュアル発注ＦＬＧオフ、または棚卸資産管理する場合
		if (!row.getBooleanNE(ItmDtlMakerCols.$i_manual_sppl_flg)
				|| isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				|| MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))) {
			builder.removeSelect(MAM_BP_R.$bp_cd);
			builder.addSelect(nvl(loc.maker_cd, dtl.maker_cd).as("bp_cd"));
			builder.addSelect(nvl(dtl.rqst_wg_cd, dtl.wg_cd).as("rqst_wg_cd"));
			builder.addSelect(dtl.purc_id_typ);
			builder.addSelect(dtl.purc_basis_typ);
			builder.addLeftOuterJoin(loc, t.bp_cd.eq(loc.maker_cd));
			builder.addLeftOuterJoin(dtl, 
					bracket(t.bp_cd.eq(dtl.maker_cd)
							.or(loc.loc_cd.eq(dtl.mfg_loc_cd)))
					.and(dtl.itm_cd.eq(bind("itm_cd")))
					.and(dtl.itm_sub1.eq(bind("itm_sub1")))
					.and(dtl.itm_sub2.eq(bind("itm_sub2")))
					.and(dtl.itm_sub3.eq(bind("itm_sub3")))
					.and(dtl.wg_cd.eq(bind("wg_cd"))));
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
		// 入力補助画面からのリスト取得時
		setSelectJoinOfBpGrpForBp(row, builder);
	}

	protected void getItmDtlMaker_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R area = MAM_AREA_R.create("AREA");
		MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
		MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
		MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
		MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
		MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
		MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
		MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
		MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
		MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
		MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.maker_flg.eq(value(true)));
		if (row.getBooleanNE(ItmDtlMakerCols.$i_foreign_flg)) {
			builder.addWhereWithAnd(t.cntry_cd.neq(bind("1")), MAUCL_AppSys.getCo().cntry_cd());
		}
		// マニュアル発注ＦＬＧオフ、または棚卸資産管理する場合
		if (!row.getBooleanNE(ItmDtlMakerCols.$i_manual_sppl_flg)
				|| isNull(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))
				|| MAC_ASSET_MNG_TYP.isMNG(row.getStringNE(ItmDtlMakerCols.$i_asset_mng_typ))) {
			if (row.getBooleanNE(ItmDtlMakerCols.$i_inc_outsrc_flg)) {
				getItmDtlMaker_WhereIncOutsrc(row, builder, t, result);
			}
			else {
				getItmDtlMaker_WhereNotIncOutsrc(row, builder, t, result);
			}
		}
		
		// 直接入力時は以下の条件は追加しない
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.bp_cd.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_cd));
		builder.addWhereWithCutOffAnd(t.bp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.ein.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_ein));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm1.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_alt_nm1));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm2.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_alt_nm2));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm3.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_alt_nm3));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm4.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_alt_nm4));
		builder.addWhereWithCutOffAnd(t.cntry_cd.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_cntry_cd));
		builder.addWhereWithCutOffAnd(cntry.cntry_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_cntry_nm));
		builder.addWhereWithCutOffAnd(t.area_cd.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_area_cd));
		builder.addWhereWithCutOffAnd(area.area_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_area_nm));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm1));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm2));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm4));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm5));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm6));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm7));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm8));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm9));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.bp_grp_nm.like(bind("1")),
				getEditString(row, ItmDtlMakerCols.$i_bp_grp_nm10));
	}

	protected void getItmDtlMaker_WhereIncOutsrc(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");

		if (isNull(row.getDateNE(ItmDtlSpplCols.$i_master_dt))) {
			builder.addWhereWithAnd(
					bracket(
							bracket(value(0).eq(value(0))
								.cutoff$and(dtl.sppl_cd.eq(bind("1")))
								.and(dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.and(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(bracket(dtl.maker_cd.eq(value(MAC_STR.NULL_VAL.value())).or(t.bp_cd.isNotNull())))
								.cutoff$and(nvl(loc.maker_cd, dtl.maker_cd).eq(bind("2")))
								).
							or(bracket(
									dtl.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
									.cutoff$and(loc.sppl_cd.eq(bind("3")))
									.and(loc.maker_cd.isNotNull())
									.cutoff$and(nvl(loc.maker_cd, dtl.maker_cd).eq(bind("4")))
								))
							),
						row.getStringNE(ItmDtlMakerCols.$i_sppl_cd),
						row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
						row.getStringNE(ItmDtlMakerCols.$i_sppl_cd),
						row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL)
					);
		}
		else {
			builder.addWhereWithAnd(
					bracket(
							bracket(value(0).eq(value(0))
								.cutoff$and(dtl.sppl_cd.eq(bind("1")))
								.and(dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.and(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(bracket(dtl.maker_cd.eq(value(MAC_STR.NULL_VAL.value())).or(t.bp_cd.isNotNull())))
								.cutoff$and(nvl(loc.maker_cd, dtl.maker_cd).eq(bind("2")))
								.and(bind("3").between(dtl.st_dt, dtl.end_dt))
								).
							or(bracket(
									dtl.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
									.cutoff$and(loc.sppl_cd.eq(bind("4")))
									.and(loc.maker_cd.isNotNull())
									.cutoff$and(nvl(loc.maker_cd, dtl.maker_cd).eq(bind("5")))
									.and(bind("6").between(dtl.st_dt, dtl.end_dt))
								))
							),
						row.getStringNE(ItmDtlMakerCols.$i_sppl_cd),
						row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
						row.getValueNE(ItmDtlMakerCols.$i_master_dt),
						row.getStringNE(ItmDtlMakerCols.$i_sppl_cd),
						row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL),
						row.getValueNE(ItmDtlMakerCols.$i_master_dt)
					);
		}
	}

	protected void getItmDtlMaker_WhereNotIncOutsrc(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ITM_DTL_R dtl = MAM_ITM_DTL_R.create("DTL");

		builder.addWhereWithCutOffAnd(dtl.sppl_cd.eq(bind("1")),
				row.getStringNE(ItmDtlMakerCols.$i_sppl_cd));
		builder.addWhereWithAnd(dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithAnd(dtl.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithAnd(dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
		builder.addWhereWithAnd(
				dtl.maker_cd.eq(value(MAC_STR.NULL_VAL.value()))
				.or(t.bp_cd.isNotNull()));
		builder.addWhereWithCutOffAnd(nvl(loc.maker_cd, dtl.maker_cd).eq(bind("1")),
				row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		if (!isNull(row.getDateNE(ItmDtlMakerCols.$i_master_dt))) {
			builder.addWhereWithAnd(bind("1").between(dtl.st_dt, dtl.end_dt),
					row.getDateNE(ItmDtlMakerCols.$i_master_dt));
		}
	}
	
	/**
	 * 資産管理対象外品を品目詳細マスタから取得してマージします。
	 */
	protected MCList<MCRow> getItmDtlMaker_mergeNotMngList(MCRow row, MCList<MCRow> list) {
		MCList<MCRow> notMngL = getItmDtlMaker_getNotMng(row);
		if (isNull(notMngL)) {
			return list;
		}

		MCIndexKey idx = notMngL.createIndex(ItmDtlSpplCols.$o_bp_cd);
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		list.forEach(r -> {
			MCRow notMngR = notMngL.getFirst(idx, r.getStringNE(ItmDtlSpplCols.$o_bp_cd));
			if (!isNull(notMngR)) {
				tmpL.add(notMngR);
			}
			else {
				tmpL.add(r);
			}
		});
		
		return tmpL;
	}
	
	/**
	 * 資産管理対象外品を品目詳細マスタから取得します。
	 */
	protected MCList<MCRow> getItmDtlMaker_getNotMng(MCRow row) {
		MCRow tmpRow = MCRow.create();
		MCRow.copyall(tmpRow, row);
		tmpRow.setBooleanNE(ItmDtlSpplCols.$i_manual_sppl_flg, false);
		
		_itmDtlSpplMakerCache = new DbcCacheMap();
		return super.getItmDtlSppl(tmpRow);
	}
	
	/**
	 * 仕入計上区分を補完します。
	 */
	protected void getItmDtlMaker_complPurcBasisTyp(MCRow row, MCList<MCRow> list) {
		if (!row.getBooleanNE(ItmDtlSpplCols.$i_purc_basis_typ_flg)
				|| isNull(row.getStringNE(ItmDtlMakerCols.$i_sppl_cd))) {
			return;
		}
		
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
		bp_bldr.addSelect(t.purc_basis_typ);
		bp_bldr.setWhere(t.bp_cd.eq(bind(ItmDtlMakerCols.$i_sppl_cd)));
		MAM_BP_R result = MAM_BP_R.create();
		
		String sqlid = createSqlId("MS.MSUAL0040.ItmDtlMaker_complPurcBasisTyp", t, "S01");
		dbSelect(sqlid, result, bp_bldr, row);
		
		if (isNull(result)) {
			return;
		}
		
		list.forEach(r -> {
			if (isNull(r.getStringNE(ItmDtlSpplCols.$o_purc_basis_typ))) {
				r.setStringNE(ItmDtlSpplCols.$o_purc_basis_typ, nvl(result.getStringNE(ItmDtlSpplCols.$o_purc_basis_typ), MAC_PURC_BASIS_TYP.ANY_BASIS.value()));
			}
		});
	}
	// -- ItmDtlMaker:メーカ (END)

	// -- ItmDtlRqstLoc:依頼先場所(START)
	@Override
	public MCList<MCRow> getItmDtlRqstLoc(MCRow row) {
		if (MSC_ITM_ORD_TYP.isWG_XFR(row.getStringNE(ItmDtlRqstLocCols.$i_itm_ord_typ))) {
			return super.getItmDtlRqstLoc(row);
		}
		else if (MSC_ITM_ORD_TYP.isXFR(row.getStringNE(ItmDtlRqstLocCols.$i_itm_ord_typ))) {
			return getItmDtlRqstLoc_XFR(row);
		}
		
		return super.getItmDtlRqstLoc(row);
	}

	@Override
	protected void getItmDtlRqstLoc_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_RQST_R t, MCList<?> result){
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAM_LOC_GRP_R loc_grp = MAM_LOC_GRP_R.create("LOC_GRP");
		MAM_ALLOC_GRP_R alloc_grp = MAM_ALLOC_GRP_R.create("ALLOC_GRP");
		MAM_SITE_R site = MAM_SITE_R.create("SITE");
		MAM_LG_GRP_R lg_grp = MAM_LG_GRP_R.create("LG_GRP");

		super.getItmDtlRqstLoc_Set(row, builder, t, result);
		// MAVM_ITM_DTL_RQSTにて、製造場所・構成パタン・発注先・メーカのすべてにNULL文字が設定されているレコードが抽出される
		
		result.addBooleanColumn("str_ln_tgt_flg");
		builder.setSelect(t.rqst_loc_cd);
		builder.addSelect(loc.loc_nm.as("rqst_loc_nm"));
		builder.addSelect(loc.wg_cd.as("rqst_wg_cd"));
		builder.addSelect(wg.wg_nm.as("rqst_wg_nm"));
		builder.addSelect(loc.str_ln_tgt_flg);
		builder.addSelect(loc.site_cd);
		builder.addSelect(site.site_nm);
		builder.addSelect(loc.lg_grp_cd);
		builder.addSelect(lg_grp.lg_grp_nm);
		builder.addSelect(loc.alloc_grp_cd);
		builder.addSelect(alloc_grp.alloc_grp_nm);
		builder.addSelect(loc.loc_grp_cd);
		builder.addSelect(loc_grp.loc_grp_nm);
		builder.addInnerJoin(loc,
				t.rqst_loc_cd.eq(loc.loc_cd));
		builder.addInnerJoin(wg,
				loc.wg_cd.eq(wg.wg_cd));
		builder.addLeftOuterJoin(loc_grp,
				loc_grp.loc_grp_cd.eq(loc.loc_grp_cd));
		builder.addLeftOuterJoin(alloc_grp,
				alloc_grp.alloc_grp_cd.eq(loc.alloc_grp_cd));
		builder.addLeftOuterJoin(site,
				site.site_cd.eq(loc.site_cd));
		builder.addLeftOuterJoin(lg_grp,
				lg_grp.lg_grp_cd.eq(loc.lg_grp_cd));

		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_itm_sub3));
		builder.addWhereWithAnd(t.wg_cd.eq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_wg_cd));
		builder.addWhereWithAnd(t.rqst_loc_cd.neq(bind("1")),
				row.getStringNE(ItmDtlRqstLocCols.$i_strg_loc_cd));
		if (!isNull(row.getDateNE(ItmDtlRqstLocCols.$i_master_dt))) {
			builder.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt),
					row.getDateNE(ItmDtlRqstLocCols.$i_master_dt));
		}
	}

	@SuppressWarnings("unchecked")
	protected MCList<MCRow> getItmDtlRqstLoc_XFR(MCRow row) {
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		String strgLocCd = row.getStringNE(ItmDtlRqstLocCols.$i_strg_loc_cd);
		
		if (isNull(strgLocCd)){
			List<String> nmList = Arrays.asList(tmpL.getNameArray());
			for (String outNm : ItmDtlRqstLocCols.outAll()) {
				if (!nmList.contains(outNm)) {
					tmpL.addStringColumn(outNm);
				}
			}
		}
		else {
			// 入庫
			MAM_LOC_R strgLoc = MAM_LOC_R.create();
			MCRow strgBind = MCRow.create();
			MAM_LOC_R strgResult = strgLoc.createInstance();
			MCQueryApiBuilder strgBuilder = MCQueryApiBuilder.create(strgLoc);
			strgBuilder.setSelect(strgLoc.loc_cd);
			strgBuilder.addSelect(strgLoc.wg_cd);
			strgBuilder.addSelect(strgLoc.lg_grp_cd);
			
			strgBind.addStringColumn(MAM_LOC_R.$loc_cd, strgLocCd);
			String strgSqlid = createSqlId("MS.MSUAL0040.ItmDtlRqstLoc_XFR", strgLoc, "S02");
			dbSelectKey(strgSqlid, strgResult, strgBuilder, strgBind);

			// 出庫
			MAM_WG_R wg = MAM_WG_R.create("WG");
			MAM_LOC_GRP_R loc_grp = MAM_LOC_GRP_R.create("LOC_GRP");
			MAM_ALLOC_GRP_R alloc_grp = MAM_ALLOC_GRP_R.create("ALLOC_GRP");
			MAM_SITE_R site = MAM_SITE_R.create("SITE");
			MAM_LG_GRP_R lg_grp = MAM_LG_GRP_R.create("LG_GRP");

			MCList<MAM_LOC_R> giResult = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R giLoc = MAM_LOC_R.create("T");
			MCQueryApiBuilder giBuilder = MCQueryApiBuilder.create(giLoc);
			giBuilder.setSelect(giLoc.loc_cd.as("rqst_loc_cd"));
			giBuilder.addSelect(giLoc.loc_nm.as("rqst_loc_nm"));
			giBuilder.addSelect(giLoc.wg_cd.as("rqst_wg_cd"));
			giBuilder.addSelect(wg.wg_nm.as("rqst_wg_nm"));
			giBuilder.addSelect(giLoc.str_ln_tgt_flg);
			giBuilder.addSelect(giLoc.site_cd);
			giBuilder.addSelect(site.site_nm);
			giBuilder.addSelect(giLoc.lg_grp_cd);
			giBuilder.addSelect(lg_grp.lg_grp_nm);
			giBuilder.addSelect(giLoc.alloc_grp_cd);
			giBuilder.addSelect(alloc_grp.alloc_grp_nm);
			giBuilder.addSelect(giLoc.loc_grp_cd);
			giBuilder.addSelect(loc_grp.loc_grp_nm);
			giBuilder.addInnerJoin(wg,
					giLoc.wg_cd.eq(wg.wg_cd));
			giBuilder.addLeftOuterJoin(loc_grp,
					loc_grp.loc_grp_cd.eq(giLoc.loc_grp_cd));
			giBuilder.addLeftOuterJoin(alloc_grp,
					alloc_grp.alloc_grp_cd.eq(giLoc.alloc_grp_cd));
			giBuilder.addLeftOuterJoin(site,
					site.site_cd.eq(giLoc.site_cd));
			giBuilder.addLeftOuterJoin(lg_grp,
					lg_grp.lg_grp_cd.eq(giLoc.lg_grp_cd));

			giBuilder.addWhereWithCutOffAnd(giLoc.loc_cd.eq(bind("1")),
					row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
			giBuilder.addWhereWithAnd(giLoc.loc_cd.neq(bind("1")), strgResult.loc_cd());
			giBuilder.addWhereWithAnd(giLoc.wg_cd.eq(bind("1")), strgResult.wg_cd());
			giBuilder.addWhereWithAnd(giLoc.lg_grp_cd.neq(bind("1")), strgResult.lg_grp_cd());

			String giSqlid = createSqlId("MS.MSUAL0040.ItmDtlRqstLoc_XFR", giLoc, "S03");
			dbSelect(giSqlid, giResult, giBuilder, row);

			MCList<? extends MCRow> down = getItmDtlRqstLoc_XFR_AfterSelect(row, giBuilder, giLoc, giResult);
			down = listlogicCommon_AfterSelect(row, giResult, down, "MS.MSUAL0040.ItmDtlRqstLoc");
			tmpL = (MCList<MCRow>) down;
		}
		if(isNull(tmpL)) return null;
		return super.getItmDtlRqstLoc_SubColumns(row, tmpL);
	}
	
	@Override
	protected MCList<?> getItmDtlRqstLoc_AfterSelect(
			MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_RQST_R t, MCList<?> result) {
		MCList<?> down = super.getItmDtlRqstLoc_AfterSelect(row, builder, t, result);
		String[] keyCols = {
				"rqst_loc_cd"
		};
		// 同一キーで属性が異なる項目はないので、chkColsには空の配列を渡す
		down = getNoDupListSub(down, keyCols, new String[]{});
		return down;
	}
	
	/** 
	  * ItmDtlRqstLoc_XFR: ItmDtlRqstLocにおいて、オーダ区分が「WG間移送」である場合の検索結果の修正を行います。<p>
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param t MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?>  getItmDtlRqstLoc_XFR_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		return (MCList<?>) result;
	}

	protected void getItmDtlRqstLoc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(ItmDtlRqstLocCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(ItmDtlRqstLocCols.$o_rqst_loc_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	// -- ItmDtlRqstLoc:依頼先場所 (END)

	// -- DivSeq:分割連番(START)
	@Override
	protected void getDivSeq_Set(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MSVT_WRK_SNO_R wrk_sno = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAM_STR_LN_R str_ln = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R bp = MAM_BP_R.create("BP");

		super.getDivSeq_Set(row, builder, t, result);
		
		builder.addWhereWithAnd(t.mfg_inst_no.eq(bind("1")), row.getStringNE(DivSeqCols.$i_mfg_inst_no));
		
		builder.addSelect(itm.itm_nm.as("imi_itm_nm"));
		builder.addSelect(itm.unit_cd.as("imi_base_unit_cd"));
		builder.addSelect(unit.unit_nm.as("imi_base_unit_nm"));
		builder.addSelect(wrk_sno.wrk_no.as("imi_wrk_no"));
		builder.addSelect(wrk_sno.wrk_nm.as("imi_wrk_nm"));
		builder.addSelect(loc.loc_nm.as("imi_mfg_loc_nm"));
		builder.addSelect(str_ln.str_ln_nm.as("imi_mfg_str_ln_nm"));
		builder.addSelect(bp.bp_nm.as("imi_sppl_nm"));

		builder.addLeftOuterJoin(itm,
				t.imi_itm_cd.eq(itm.itm_cd)
				.and(t.imi_itm_sub1.eq(itm.itm_sub1))
				.and(t.imi_itm_sub2.eq(itm.itm_sub2))
				.and(t.imi_itm_sub3.eq(itm.itm_sub3)));
		builder.addLeftOuterJoin(unit,
				itm.unit_cd.eq(unit.unit_cd));
		builder.addLeftOuterJoin(loc,
				t.imi_mfg_loc_cd.eq(loc.loc_cd));
		builder.addLeftOuterJoin(wrk_sno,
				t.imi_sno1.eq(wrk_sno.sno1));
		builder.addLeftOuterJoin(str_ln,
				t.imi_mfg_loc_cd.eq(str_ln.loc_cd)
				.and(t.imi_mfg_str_ln_cd.eq(str_ln.str_ln_cd)));
		builder.addLeftOuterJoin(bp,
				t.imi_sppl_cd.eq(bp.bp_cd));
	}
	// -- DivSeq:分割連番 (END)

	// -- MfgInstNo:製造指図ＮＯ(START)
	@Override
	protected void getMfgInstNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		super.getMfgInstNo_Set(row, builder, t, result);
		getMfgInstNo_addSelectJoinCustom(row, builder, t, result);
		getMfgInstNo_addWhereCustom(row, builder, t, result);
	}

	protected void getMfgInstNo_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result) {
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R itm_d = MAM_ITM_TYP_D_R.create("ITM_D");
		MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MSVT_WRK_SNO_R wrk_sno = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAM_STR_LN_R str_ln = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MST_PO_D_R po_d = MST_PO_D_R.create("PO_D");
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

		// 固定のSelect句、結合の設定
		builder.addSelect(itm.itm_nm.as("imi_itm_nm"));
		builder.addSelect(itm.unit_cd.as("imi_base_unit_cd"));
		builder.addSelect(unit.unit_nm.as("imi_base_unit_nm"));
		builder.addSelect(itm.itm_typ.as("itm_typ"));
		builder.addSelect(itm.itm_typ_d_cd.as("itm_typ_d_cd"));
		builder.addSelect(wrk_sno.wrk_no.as("imi_wrk_no"));
		builder.addSelect(wrk_sno.wrk_nm.as("imi_wrk_nm"));
		builder.addSelect(loc.loc_nm.as("imi_mfg_loc_nm"));
		builder.addSelect(str_ln.str_ln_nm.as("imi_mfg_str_ln_nm"));
		builder.addSelect(bp.bp_nm.as("imi_sppl_nm"));

		builder.addSelect(trunc(t.mi_st_schd_tm, MCDateFmt.DD).as("mi_st_schd_dt"));
		builder.addSelect(
				cases().when(t.mi_st_schd_tm.gt(trunc(t.mi_st_schd_tm, MCDateFmt.DD))).then(t.mi_st_schd_tm)
				.otherwise(nullValue())
				.as("mi_st_schd_hm"));
		builder.addSelect(trunc(t.mi_end_schd_tm, MCDateFmt.DD).as("mi_end_schd_dt"));
		builder.addSelect(
				cases().when(t.mi_end_schd_tm.gt(trunc(t.mi_end_schd_tm, MCDateFmt.DD))).then(t.mi_end_schd_tm)
				.otherwise(nullValue())
				.as("mi_end_schd_hm"));
		builder.addSelect(trunc(t.ma_st_act_tm, MCDateFmt.DD).as("ma_st_act_dt"));
		builder.addSelect(
				cases().when(t.ma_st_act_tm.gt(trunc(t.ma_st_act_tm, MCDateFmt.DD))).then(t.ma_st_act_tm)
				.otherwise(nullValue())
				.as("ma_st_act_hm"));
		builder.addSelect(trunc(t.ma_end_act_tm, MCDateFmt.DD).as("ma_end_act_dt"));
		builder.addSelect(
				cases().when(t.ma_end_act_tm.gt(trunc(t.ma_end_act_tm, MCDateFmt.DD))).then(t.ma_end_act_tm)
				.otherwise(nullValue())
				.as("ma_end_act_hm"));
		
		builder.addSelect(trunc(t.mi_rqst_dlv_rqst_tm, MCDateFmt.DD).as("mi_rqst_dlv_rqst_dt"));
		builder.addSelect(
				cases().when(t.mi_rqst_dlv_rqst_tm.gt(trunc(t.mi_rqst_dlv_rqst_tm, MCDateFmt.DD))).then(t.mi_rqst_dlv_rqst_tm)
						.otherwise(nullValue())
						.as("mi_rqst_dlv_rqst_hm"));
		
		builder.addSelect(trunc(po_d.dlv_rqst_tm, MCDateFmt.DD).as("po_dlv_rqst_dt"));
		builder.addSelect(
				cases().when(po_d.dlv_rqst_tm.gt(trunc(po_d.dlv_rqst_tm, MCDateFmt.DD))).then(po_d.dlv_rqst_tm)
						.otherwise(nullValue())
						.as("po_dlv_rqst_hm"));
		
		builder.addLeftOuterJoin(itm,
				t.imi_itm_cd.eq(itm.itm_cd)
				.and(t.imi_itm_sub1.eq(itm.itm_sub1))
				.and(t.imi_itm_sub2.eq(itm.itm_sub2))
				.and(t.imi_itm_sub3.eq(itm.itm_sub3)));
		builder.addLeftOuterJoin(itm_d,
				itm_d.itm_typ.eq(itm.itm_typ)
				.and(itm_d.itm_typ_d_cd.eq(itm.itm_typ_d_cd)));
		builder.addLeftOuterJoin(unit, itm.unit_cd.eq(unit.unit_cd));
		builder.addLeftOuterJoin(loc, t.imi_mfg_loc_cd.eq(loc.loc_cd));
		builder.addLeftOuterJoin(wrk_sno, t.imi_sno1.eq(wrk_sno.sno1));
		builder.addLeftOuterJoin(str_ln,
				t.imi_mfg_loc_cd.eq(str_ln.loc_cd)
				.and(t.imi_mfg_str_ln_cd.eq(str_ln.str_ln_cd)));
		builder.addLeftOuterJoin(bp, t.imi_sppl_cd.eq(bp.bp_cd));
		builder.addLeftOuterJoin(po_d, t.mi_po_d_no.eq(po_d.po_d_no));

		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd1),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm1))) {
			builder.addLeftOuterJoin(grp1,
					grp1.itm_grp_typ.eq(value("01"))
					.and(grp1.itm_grp_cd.eq(itm.itm_grp_cd1)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd2),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm2))) {
			builder.addLeftOuterJoin(grp2,
					grp2.itm_grp_typ.eq(value("02"))
					.and(grp2.itm_grp_cd.eq(itm.itm_grp_cd2)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd3),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm3))) {
			builder.addLeftOuterJoin(grp3,
					grp3.itm_grp_typ.eq(value("03"))
					.and(grp3.itm_grp_cd.eq(itm.itm_grp_cd3)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd4),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm4))) {
			builder.addLeftOuterJoin(grp4,
					grp4.itm_grp_typ.eq(value("04"))
					.and(grp4.itm_grp_cd.eq(itm.itm_grp_cd4)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd5),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm5))) {
			builder.addLeftOuterJoin(grp5,
					grp5.itm_grp_typ.eq(value("05"))
					.and(grp5.itm_grp_cd.eq(itm.itm_grp_cd5)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd6),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm6))) {
			builder.addLeftOuterJoin(grp6,
					grp6.itm_grp_typ.eq(value("06"))
					.and(grp6.itm_grp_cd.eq(itm.itm_grp_cd6)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd7),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm7))) {
			builder.addLeftOuterJoin(grp7,
					grp7.itm_grp_typ.eq(value("07"))
					.and(grp7.itm_grp_cd.eq(itm.itm_grp_cd7)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd8),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm8))) {
			builder.addLeftOuterJoin(grp8,
					grp8.itm_grp_typ.eq(value("08"))
					.and(grp8.itm_grp_cd.eq(itm.itm_grp_cd8)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd9),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm9))) {
			builder.addLeftOuterJoin(grp9,
					grp9.itm_grp_typ.eq(value("09"))
					.and(grp9.itm_grp_cd.eq(itm.itm_grp_cd9)));
		}
		if (!isNullAnd(getEditString(row, MfgInstNoCols.$i_itm_grp_cd10),
				getEditString(row, MfgInstNoCols.$i_itm_grp_nm10))) {
			builder.addLeftOuterJoin(grp10,
					grp10.itm_grp_typ.eq(value("010"))
					.and(grp10.itm_grp_cd.eq(itm.itm_grp_cd10)));
		}

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

	protected void getMfgInstNo_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result) {
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R itm_d = MAM_ITM_TYP_D_R.create("ITM_D");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MSVT_WRK_SNO_R wrk_sno = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAM_STR_LN_R str_ln = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R bp = MAM_BP_R.create("BP");
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

		// 固定条件（行ごとに条件値が同じ条件）
		// なし
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
		builder.addWhereWithCutOffAnd(t.imi_mfg_mtd_typ.eq(bind("1")), row.getStringNE(MfgInstNoCols.$i_imi_mfg_mtd_typ));
		builder.addWhereWithCutOffAnd(itm.itm_typ.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_typ));
		builder.addWhereWithCutOffAnd(itm.itm_typ_d_cd.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_typ_d_cd));
		builder.addWhereWithCutOffAnd(itm_d.itm_typ_d_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_typ_d_nm));
		builder.addWhereWithCutOffAnd(t.imi_itm_cd.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_itm_cd));
		builder.addWhereWithCutOffAnd(t.imi_itm_sub1.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_itm_sub1));
		builder.addWhereWithCutOffAnd(t.imi_itm_sub2.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_itm_sub2));
		builder.addWhereWithCutOffAnd(t.imi_itm_sub3.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_itm_sub3));
		builder.addWhereWithCutOffAnd(itm.itm_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_itm_nm));
		builder.addWhereWithCutOffAnd(t.imi_lot_no.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_lot_no));
		builder.addWhereWithCutOffAnd(t.imi_sublot_no.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sublot_no));
		builder.addWhereWithCutOffAnd(t.imi_sno1.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sno1));
		builder.addWhereWithCutOffAnd(t.imi_sno2.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sno2));
		builder.addWhereWithCutOffAnd(t.imi_sno3.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sno3));
		builder.addWhereWithCutOffAnd(t.imi_sno4.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sno4));
		builder.addWhereWithCutOffAnd(wrk_sno.wrk_no.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_wrk_no));
		builder.addWhereWithCutOffAnd(wrk_sno.wrk_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_wrk_nm));
		builder.addWhereWithCutOffAnd(t.imi_mfg_loc_cd.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_mfg_loc_cd));
		builder.addWhereWithCutOffAnd(loc.loc_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_mfg_loc_nm));
		builder.addWhereWithCutOffAnd(t.imi_mfg_str_ln_cd.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_mfg_str_ln_cd));
		builder.addWhereWithCutOffAnd(str_ln.str_ln_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_mfg_str_ln_nm));
		builder.addWhereWithCutOffAnd(t.mfg_inst_no.like(bind("1")), getEditString(row, MfgInstNoCols.$i_mfg_inst_no));
		builder.addWhereWithCutOffAnd(t.div_seq.eq(bind("1")), row.getNumberNE(MfgInstNoCols.$i_div_seq));
		builder.addWhereWithCutOffAnd(t.imi_sppl_cd.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sppl_cd));
		builder.addWhereWithCutOffAnd(bp.bp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_imi_sppl_nm));
		builder.addWhereWithAnd(itm.del_flg.eq(value(false)));

		if (row.getBooleanNE(MfgInstNoCols.$i_mi_po_d_no_req_flg)) {
			builder.addWhereWithCutOffAnd(t.mi_po_d_no.eq(bind("1")), row.getStringNE(MfgInstNoCols.$i_mi_po_d_no));
		} else {
			builder.addWhereWithCutOffAnd(t.mi_po_d_no.like(bind("1")), getEditString(row, MfgInstNoCols.$i_mi_po_d_no));
		}
		
		if (row.contains(MfgInstNoCols.$i_mi_st_schd_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.mi_st_schd_tm.gte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_st_schd_dt_fr));
		}
		if (row.contains(MfgInstNoCols.$i_mi_st_schd_dt_to)) {
			builder.addWhereWithCutOffAnd(t.mi_st_schd_tm.lte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_st_schd_dt_to));
		}
		if (row.contains(MfgInstNoCols.$i_mi_end_schd_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.mi_end_schd_tm.gte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_end_schd_dt_fr));
		}
		if (row.contains(MfgInstNoCols.$i_mi_end_schd_dt_to)) {
			builder.addWhereWithCutOffAnd(t.mi_end_schd_tm.lte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_end_schd_dt_to));
		}
		if (row.contains(MfgInstNoCols.$i_ma_st_act_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.ma_st_act_tm.gte(bind("1")), row.getDate(MfgInstNoCols.$i_ma_st_act_dt_fr));
		}
		if (row.contains(MfgInstNoCols.$i_ma_st_act_dt_to)) {
			builder.addWhereWithCutOffAnd(t.ma_st_act_tm.lte(bind("1")), row.getDate(MfgInstNoCols.$i_ma_st_act_dt_to));
		}
		if (row.contains(MfgInstNoCols.$i_ma_end_act_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.ma_end_act_tm.gte(bind("1")), row.getDate(MfgInstNoCols.$i_ma_end_act_dt_fr));
		}
		if (row.contains(MfgInstNoCols.$i_ma_end_act_dt_to)) {
			builder.addWhereWithCutOffAnd(t.ma_end_act_tm.lte(bind("1")), row.getDate(MfgInstNoCols.$i_ma_end_act_dt_to));
		}
		if (row.contains(MfgInstNoCols.$i_mi_rqst_dlv_rqst_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.mi_rqst_dlv_rqst_tm.gte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_rqst_dlv_rqst_dt_fr));
		}
		if (row.contains(MfgInstNoCols.$i_mi_rqst_dlv_rqst_dt_to)) {
			builder.addWhereWithCutOffAnd(t.mi_rqst_dlv_rqst_tm.lte(bind("1")), row.getDate(MfgInstNoCols.$i_mi_rqst_dlv_rqst_dt_to));
		}

		builder.addWhereWithCutOffAnd(itm.itm_grp_cd1.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm1));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd2.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm2));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd3.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm3));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd4.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm4));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd5.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm5));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd6.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm6));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd7.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm7));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd8.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm8));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd9.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm9));
		builder.addWhereWithCutOffAnd(itm.itm_grp_cd10.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.itm_grp_nm.like(bind("1")), getEditString(row, MfgInstNoCols.$i_itm_grp_nm10));

		MCPredicate pred = value(1).neq(value(0));
		if (row.getBooleanNE(MfgInstNoCols.$i_sav_flg)) {
			pred = pred
					.cutoff$or(t.mpr_mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.SAV.value())));
		}
		if (row.getBooleanNE(MfgInstNoCols.$i_ord_flg)) {
			pred = pred
					.cutoff$or(t.mpr_mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.ORD.value())));
		}
		if (row.getBooleanNE(MfgInstNoCols.$i_stt_flg)) {
			pred = pred
					.cutoff$or(t.mpr_mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value())));
		}
		if (row.getBooleanNE(MfgInstNoCols.$i_cmpl_flg)) {
			pred = pred
					.cutoff$or(t.mpr_mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.CMPL.value())));
		}
		builder.addWhereWithAnd(pred);
	}

	@Override
	protected MCList<?> getMfgInstNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result) {
		MCList<?> l = super.getMfgInstNo_AfterSelect(row, builder, t, result);
		// 区分名の設定
		l.addStringColumn(MfgInstNoCols.$o_mpr_mfg_sts_typ_nm);
		MSC_MFG_STS_TYP.putNameNE(l, MfgInstNoCols.$o_mpr_mfg_sts_typ, MfgInstNoCols.$o_mpr_mfg_sts_typ_nm);
		return l;
	}
	// -- MfgInstNo:製造指図ＮＯ (END)

	// -- MpsItmGrp:ＭＰＳ品目グループ (START)
	@Override
	protected void getMpsItmGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_MPS_ITM_R t, MCList<?> result) {
		super.getMpsItmGrp_Set(row, builder, t, result);

		if (!row.contains($LIST_LOGIC_VAL) ) {
			builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(MpsItmGrpCols.$i_itm_cd));
			builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(MpsItmGrpCols.$i_itm_sub1));
			builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(MpsItmGrpCols.$i_itm_sub2));
			builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(MpsItmGrpCols.$i_itm_sub3));
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(MpsItmGrpCols.$i_wg_cd));
		}
	}

	protected MCMessage getMpsItmGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		String itmInfo = toDispItm(row.getStringNE(MpsItmGrpCols.$i_itm_cd),
				row.getStringNE(MpsItmGrpCols.$i_itm_sub1),
				row.getStringNE(MpsItmGrpCols.$i_itm_sub2),
				row.getStringNE(MpsItmGrpCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBCL0084, itmInfo,
				row.getStringNE(MpsItmGrpCols.$i_wg_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- MpsItmGrp:ＭＰＳ品目グループ (END)

	// -- ItmOperLoc:品目工程場所 (START)
	@Override
	protected void getItmOperLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result){
		super.getItmOperLoc_Set(row, builder, t, result);
		getItmOperLoc_addSelectJoinCustom(row, builder, t, result);
		getItmOperLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getItmOperLoc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn("wg_cd");
		
		// Select句、結合の設定
		builder.addSelect(loc.wg_cd);
		builder.addInnerJoin(loc, t.loc_cd.eq(loc.loc_cd));
	}

	protected void getItmOperLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		// 固定条件なし
		
		// リストロジックチェック時はこれ以上の条件を追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_itm_sub3));
		builder.addWhereWithAnd(t.oper_ptn.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_oper_ptn));
		builder.addWhereWithAnd(t.oper_cd.eq(bind("1")), row.getStringNE(ItmOperLocCols.$i_oper_cd));
		builder.addWhereWithAnd(t.oper_seq.eq(bind("1")), row.getNumberNE(ItmOperLocCols.$i_oper_seq));
		builder.addWhereWithAnd(bracket(bind("1").between(t.st_dt, t.end_dt)), row.getDateNE(ItmOperLocCols.$i_dt));
	}

	protected MCMessage getItmOperLoc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		String itmInfo = toDispItm(row.getStringNE(ItmOperLocCols.$i_itm_cd),
				row.getStringNE(ItmOperLocCols.$i_itm_sub1),
				row.getStringNE(ItmOperLocCols.$i_itm_sub2),
				row.getStringNE(ItmOperLocCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSUAL0008,
				toYMDString(row.getDateNE(ItmOperLocCols.$i_dt)), itmInfo,
				row.getStringNE(ItmOperLocCols.$i_oper_ptn),
				row.getStringNE(ItmOperLocCols.$i_oper_cd),
				row.getNumberNE(ItmOperLocCols.$i_oper_seq), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ItmOperLoc:品目工程場所 (END)

	// -- ItmDtlWithSpplMaker:品目詳細（発注先、メーカ） (START)
	@Override
	public MCList<MCRow> getItmDtlWithSpplMaker(MCRow row) {
		// マスタ管理の品目詳細リストロジックを利用して取得
		MCList<?> down = getListItmDtl(row, "getItmDtl");
		if (isNull(down)) {
			return null;
		}
		return getItmDtlWithSpplMaker_SubColumns(row, getItmDtlWithSpplMaker_sub(row, down));
	}

	@Override
	public MCList<MCRow> getItmDtlSub1WithSpplMaker(MCRow row) {
		MCList<?> down = getListItmDtl(row, "getItmDtlSub1");
		if (isNull(down)) {
			return null;
		}
		return getItmDtlSub1WithSpplMaker_SubColumns(row, getItmDtlWithSpplMaker_sub(row, down));
	}

	@Override
	public MCList<MCRow> getItmDtlSub2WithSpplMaker(MCRow row) {
		MCList<?> down = getListItmDtl(row, "getItmDtlSub2");
		if (isNull(down)) {
			return null;
		}
		return getItmDtlSub2WithSpplMaker_SubColumns(row, getItmDtlWithSpplMaker_sub(row, down));
	}

	@Override
	public MCList<MCRow> getItmDtlSub3WithSpplMaker(MCRow row) {
		MCList<?> down = getListItmDtl(row, "getItmDtlSub3");
		if (isNull(down)) {
			return null;
		}
		return getItmDtlSub3WithSpplMaker_SubColumns(row, getItmDtlWithSpplMaker_sub(row, down));
	}

	/**
	 * 発注先およびメーカの品目詳細を取得・設定する
	 * @param row 検索条件
	 * @param down 品目詳細リストロジックの検索結果
	 * @return 検索結果
	 */
	protected MCList<?> getItmDtlWithSpplMaker_sub(MCRow row, MCList<?> down) {

		// 一時カラムを追加
		getItmDtlWithSpplMaker_addColumns(down);

		if (isInput(row)) {
			MCRow r = down.get(0);

			// 発注先（品目詳細）
			if (row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_get_sppl_flg)
					&& !isNull(r.getStringNE(ItmDtlCols.$o_sppl_cd))) {
				setListItmDtlSppl(row, r);
			}

			// メーカ（品目詳細）
			if (row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_get_maker_flg)
					&& !isNull(r.getStringNE(ItmDtlCols.$o_maker_cd))) {
				setListItmDtlMaker(row, r);
			}
		}
		else {
			// 発注先（品目詳細）
			if (row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_get_sppl_flg)) {
				setListItmDtlSppl(row, down);
			}
		}
		for (MCRow r : down) {
			if (isNull(r.getString("purc_upri_req_typ"))) {
				r.setString("purc_upri_req_typ", getCo().purc_upri_req_typ());
			}
		}

		return down;
	}

	/**
	 * マスタ管理の品目詳細リストロジックに定義されていない分のカラムを追加する
	 * @param down 検索結果
	 */
	protected void getItmDtlWithSpplMaker_addColumns(MCList<?> down) {
		down.addNumberColumn(ItmDtlWithSpplMakerCols.$o_amt_dec_place);
		down.addNumberColumn(ItmDtlWithSpplMakerCols.$o_upri_dec_place);
		down.addStringColumn(ItmDtlWithSpplMakerCols.$o_ap_dpt_cd);
		down.addStringColumn(ItmDtlWithSpplMakerCols.$o_purc_usr_cd);
		down.addStringColumn(ItmDtlWithSpplMakerCols.$o_purc_dpt_cd);
		down.addBooleanColumn(ItmDtlWithSpplMakerCols.$o_sppl_purc_upri_cng_flg);
		down.addBooleanColumn(ItmDtlWithSpplMakerCols.$o_edi_po_send_tgt_flg);
	}

	/**
	 * マスタ管理の品目詳細リストロジックを利用して品目詳細情報を取得します。
	 * @param row 検索条件
	 * @return 検索結果
	 */
	protected MCList<?> getListItmDtl(MCRow row, String method) {
		String clazz = "mcframe.serverMAUA.MAUAL0010.MAUAL_List";

		Object o = MCFactory.create(Object.class, clazz);
		return (MCList<?>)MCFactory.invoke(o, method, new Class[] {MCRow.class}, new Object[] {row});
	}

	/**
	 * 発注先（品目詳細）リストロジックを利用して発注先に関する情報を取得・設定する
	 * @param row 検索条件
	 * @param result 検索結果
	 */
	protected void setListItmDtlSppl(MCRow row, MCRow result) {
		MCRow up1 = MCRow.create();
		up1.addDateColumn(ItmDtlSpplCols.$i_master_dt, row.getDateNE(ItmDtlWithSpplMakerCols.$i_dt));
		up1.addDateColumn(ItmDtlSpplCols.$i_master_dt2, row.getDateNE(ItmDtlWithSpplMakerCols.$i_dt2));
		up1.addStringColumn(ItmDtlSpplCols.$i_itm_cd, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_cd));
		up1.addStringColumn(ItmDtlSpplCols.$i_itm_sub1, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub1));
		up1.addStringColumn(ItmDtlSpplCols.$i_itm_sub2, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub2));
		up1.addStringColumn(ItmDtlSpplCols.$i_itm_sub3, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub3));
		up1.addStringColumn(ItmDtlSpplCols.$i_wg_cd, result.getStringNE(ItmDtlWithSpplMakerCols.$o_wg_cd));
		up1.addBooleanColumn(ItmDtlSpplCols.$i_manual_sppl_flg, row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_manual_sppl_flg));
		up1.addBooleanColumn(ItmDtlSpplCols.$i_inc_outsrc_flg, row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_inc_outsrc_flg));
		up1.addStringColumn(ItmDtlSpplCols.$i_asset_mng_typ, result.getStringNE(ItmDtlCols.$o_asset_mng_typ));
		up1.addStringColumn(FXBAC_ListLogicBase.$INPUT_VAL, result.getStringNE(ItmDtlCols.$o_sppl_cd));

		String clazz = "mcframe.serverMSUA.MSUAL0040.MSUAL_List";
		String method = "getItmDtlSppl";
		Object o = MCFactory.create(Object.class, clazz);
		MCList<?> l = (MCList<?>)MCFactory.invoke(o, method, new Class[] {MCRow.class}, new Object[] {up1});

		if (!isNull(l)) {
			MCRow r = l.get(0);
			String[][] cols = {
				{ItmDtlWithSpplMakerCols.$o_purc_usr_cd, ItmDtlSpplCols.$o_purc_usr_cd},
				{ItmDtlWithSpplMakerCols.$o_purc_dpt_cd, ItmDtlSpplCols.$o_purc_dpt_cd},
				{ItmDtlWithSpplMakerCols.$o_ap_dpt_cd, ItmDtlSpplCols.$o_ap_dpt_cd},
				{ItmDtlWithSpplMakerCols.$o_sppl_purc_upri_cng_flg, ItmDtlSpplCols.$o_purc_upri_cng_flg},
				{ItmDtlWithSpplMakerCols.$o_edi_po_send_tgt_flg, ItmDtlSpplCols.$o_edi_po_send_tgt_flg},
				{ItmDtlWithSpplMakerCols.$o_amt_dec_place, ItmDtlSpplCols.$o_amt_dec_place},
				{ItmDtlWithSpplMakerCols.$o_upri_dec_place, ItmDtlSpplCols.$o_upri_dec_place},
				{ItmDtlWithSpplMakerCols.$o_repurc_obli_flg, ItmDtlSpplCols.$o_repurc_obli_flg},
				{ItmDtlWithSpplMakerCols.$o_outsrc_upri_typ, ItmDtlSpplCols.$o_outsrc_upri_typ}
			};
			for (String[] c : cols) {
				result.setValueNE(c[0], r.getValueNE(c[1]));
			}
		}
	}

	protected void setListItmDtlSppl(MCRow row, MCList<?> down) {
		MAW_BP_KEY_R wk = MAW_BP_KEY_R.create("WK");
		MAM_CUR_R cur = MAM_CUR_R.create("CUR");
		MAM_SPPL_USR_R su = MAM_SPPL_USR_R.create("SU");
		MAM_EDI_IF_CTL_R ec = MAM_EDI_IF_CTL_R.create("EC");

		MCList<MAM_BP_R> result = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		for (MCRow r : down.groupBy("sppl_cd")) {
			if (!isNull(r.getStringNE("sppl_cd"))) {
				MAM_BP_R dbcR = MAM_BP_R.create();
				dbcR.bp_cd(r.getStringNE("sppl_cd"));
				result.add(dbcR);
			}
		}
		String delid = createSqlId("MS.MSUAL0040.ItmDtlWithSpplMaker_setListItmDtlSppl", t, "D01");
		String insid = createSqlId("MS.MSUAL0040.ItmDtlWithSpplMaker_setListItmDtlSppl", t, "I01");
		dbWkDelete(delid, builder.getBaseDbc());
		dbWkInsert(insid, result, builder.getBaseDbc());
		result.clear();
		result.addBooleanColumn("edi_po_send_tgt_flg");

		builder.setSelect(t.bp_cd, t.purc_upri_cng_flg);
		builder.addSelect(
				MAPA_BP$F_GET_AP_DPT_CD_NE(t.asppl_cd, bind("dt2"), value(false))
						.as("ap_dpt_cd"));
		builder.addSelect(cur.amt_dec_place);
		builder.addSelect(cur.upri_dec_place);
		builder.addSelect(su.purc_usr_cd);
		builder.addSelect(su.purc_dpt_cd);
		builder.addSelect(
				cases()
				.when(ec.if_proc_typ.isNull()).then(value(false))
				.otherwise(value(true))
				.as("edi_po_send_tgt_flg"));
		builder.addSelect(
				cases()
				.when(t.outsrc_upri_typ.isNull()).then(value(getCo().outsrc_upri_typ()))
				.otherwise(t.outsrc_upri_typ)
				.as("outsrc_upri_typ"));
		builder.addInnerJoin(wk, bracket(wk.bp_cd.eq(t.bp_cd)));
		builder.addLeftOuterJoin(cur, bracket(cur.cur_cd.eq(t.cur_cd)));
		builder.addLeftOuterJoin(su,
				bracket(su.sppl_cd.eq(t.bp_cd)
						.and(bind("dt2").between(su.st_dt, su.end_dt))));
		builder.addLeftOuterJoin(ec,
				bracket(ec.bp_cd.eq(t.bp_cd)
						.and(bind("edi_today").between(ec.st_dt, ec.end_dt))
						.and(ec.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))));

		MCRow bindR = MCRow.create();
		bindR.setDateNE("edi_today", getToday());
		bindR.setDateNE("dt2", nvl(row.getDateNE("dt2"), row.getDateNE("dt")));
		String selectid = createSqlId("MS.MSUAL0040.ItmDtlWithSpplMaker_setListItmDtlSppl", t, "S04");
		dbSelect(selectid, result, builder, bindR);

		MCIndexKey idxkey = result.createIndex("bp_cd");
		for (MCRow r : down) {
			MAM_BP_R bpR = result.getFirst(idxkey, r.getString("sppl_cd"));
			if (bpR != null) {
				r.setStringNE("purc_usr_cd", bpR.getStringNE("purc_usr_cd"));
				r.setStringNE("purc_dpt_cd", bpR.getStringNE("purc_dpt_cd"));
				r.setStringNE("ap_dpt_cd", bpR.getStringNE("ap_dpt_cd"));
				r.setBooleanNE("sppl_purc_upri_cng_flg", bpR.purc_upri_cng_flg());
				r.setBooleanNE("edi_po_send_tgt_flg", bpR.getBooleanNE("edi_po_send_tgt_flg"));
				r.setNumberNE("amt_dec_place", bpR.getNumberNE("amt_dec_place"));
				r.setNumberNE("upri_dec_place", bpR.getNumberNE("upri_dec_place"));
				r.setStringNE("outsrc_upri_typ", bpR.getStringNE("outsrc_upri_typ"));
			}
		}
	}

	/**
	 * メーカ（品目詳細）リストロジックを利用してメーカに関する情報を取得・設定する
	 * @param row 検索条件
	 * @param result 検索結果
	 */
	protected void setListItmDtlMaker(MCRow row, MCRow result) {
		MCRow up1 = MCRow.create();
		up1.addDateColumn(ItmDtlMakerCols.$i_master_dt, row.getDateNE(ItmDtlWithSpplMakerCols.$i_dt));
		up1.addStringColumn(ItmDtlMakerCols.$i_itm_cd, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_cd));
		up1.addStringColumn(ItmDtlMakerCols.$i_itm_sub1, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub1));
		up1.addStringColumn(ItmDtlMakerCols.$i_itm_sub2, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub2));
		up1.addStringColumn(ItmDtlMakerCols.$i_itm_sub3, result.getStringNE(ItmDtlWithSpplMakerCols.$o_itm_sub3));
		up1.addStringColumn(ItmDtlMakerCols.$i_asset_mng_typ, result.getStringNE(ItmDtlCols.$o_asset_mng_typ));
		up1.addStringColumn(ItmDtlMakerCols.$i_sppl_cd, result.getStringNE(ItmDtlWithSpplMakerCols.$o_sppl_cd));
		up1.addStringColumn(ItmDtlMakerCols.$i_wg_cd, result.getStringNE(ItmDtlWithSpplMakerCols.$o_wg_cd));
		up1.addBooleanColumn(ItmDtlSpplCols.$i_mode_nullval_flg, true);
		up1.addBooleanColumn(ItmDtlSpplCols.$i_manual_sppl_flg, row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_manual_sppl_flg));
		up1.addBooleanColumn(ItmDtlSpplCols.$i_inc_outsrc_flg, row.getBooleanNE(ItmDtlWithSpplMakerCols.$i_inc_outsrc_flg));
		up1.addStringColumn(FXBAC_ListLogicBase.$INPUT_VAL, result.getStringNE(ItmDtlCols.$o_maker_cd));

		String clazz = "mcframe.serverMSUA.MSUAL0040.MSUAL_List";
		String method = "getItmDtlMaker";
		Object o = MCFactory.create(Object.class, clazz);
		MCList<?> l = (MCList<?>)MCFactory.invoke(o, method, new Class[] {MCRow.class}, new Object[] {up1});

		if (!isNull(l)) {
			MCRow r = l.get(0);
			//購買識別区分が取得できない場合は上書きしない
			if(isNull(r.getStringNE(ItmDtlMakerCols.$o_purc_id_typ))) {
				return;
			}
			String[][] cols = {
				{ItmDtlWithSpplMakerCols.$o_purc_id_typ, ItmDtlMakerCols.$o_purc_id_typ}
			};
			for (String[] c : cols) {
				result.setValueNE(c[0], r.getValueNE(c[1]));
			}
		}
	}

	/**
	 * 発注先（品目詳細）、メーカ（品目詳細）のＤＢコンテナキャッシュ
	 */
	protected DbcCacheMap _itmDtlSpplMakerCache = new DbcCacheMap();

	/**
	 * 品目詳細で使用するＤＢコンテナキャッシュを生成します。
	 * 
	 * @param bindL キャッシュ生成の元になるバインドリスト
	 */
	protected void itmDtlSpplMaker_InitCache(MCList<?> bindL) {

		MAM_SPPL_USR_R spplUsrDbc = MAM_SPPL_USR_R.create("T");
		MCQueryApiBuilder spplUsrBuilder = MCQueryApiBuilder.create(spplUsrDbc);
		spplUsrBuilder.setSelect(
				spplUsrDbc.purc_usr_cd,
				spplUsrDbc.purc_dpt_cd,
				spplUsrDbc.st_dt,
				spplUsrDbc.end_dt);
		_itmDtlSpplMakerCache.set("MAM_SPPL_USR", new FXUCL_MCDbcCacheStEnd<>(spplUsrBuilder, bindL, "bp_cd"));

		MAM_CUR_R curDbc = MAM_CUR_R.create("T");
		MCQueryApiBuilder curBuilder = MCQueryApiBuilder.create(curDbc);
		curBuilder.setSelect(
				curDbc.cur_nm,
				curDbc.amt_dec_place,
				curDbc.upri_dec_place);
		_itmDtlSpplMakerCache.set("MAM_CUR", curBuilder, bindL, "cur_cd");

		_itmDtlSpplMakerCache.set("MAM_CNTRY", "cntry_nm", bindL, "cntry_cd");
		_itmDtlSpplMakerCache.set("MAM_AREA", "area_nm", bindL, "area_cd");
		_itmDtlSpplMakerCache.set("MAM_WG", "wg_nm", bindL, "rqst_wg_cd");

		MCList<?> list = bindL.createInstance();
		String[][] cols = {
			{"cst_tterm_cd1", "cst_tterm_cd1"},
			{"cst_tterm_cd2", "cst_tterm_cd1"},
			{"cst_tterm_cd3", "cst_tterm_cd1"},
			{"acst_cd", "bp_cd"},
			{"bp_cd", "bp_cd"}
		};
		for (String[] col : cols) {
			bindL.groupBy(col[0])
				.subList(r -> !isNullOrNullVal(r.getStringNE(col[0])))
				.forEach(r -> list.add().setStringNE(col[1], r.getStringNE(col[0])));
		}
		_itmDtlSpplMakerCache.set("MAM_TTERM", "tterm_cd", list, "cst_tterm_cd1");
		_itmDtlSpplMakerCache.set("MAVM_BP_NM", "bp_nm", list, "bp_cd");

		MCList<?> ediList = bindL.createInstance();
		ediList.addStringColumn("if_proc_typ");
		for (MCRow r : bindL.groupBy("bp_cd")) {
			for (String typ : new String[]{MAC_IF_PROC_TYP.PO_SEND.value(), MAC_IF_PROC_TYP.ACCPT_SEND.value()}) {
				r.setStringNE("if_proc_typ", typ);
				MCRow.copyvalue(ediList.add(), r.clone());
			}
		}
		MAM_EDI_IF_CTL_R ediIfCtlDbc = MAM_EDI_IF_CTL_R.create("T");
		MCQueryApiBuilder ediIfCtlBuilder = MCQueryApiBuilder.create(ediIfCtlDbc);
		ediIfCtlBuilder.setSelect(
				ediIfCtlDbc.if_proc_typ,
				ediIfCtlDbc.bp_cd,
				ediIfCtlDbc.st_dt,
				ediIfCtlDbc.end_dt);
		_itmDtlSpplMakerCache.set("MAM_EDI_IF_CTL", new FXUCL_MCDbcCacheStEnd<>(ediIfCtlBuilder, ediList, "bp_cd", "if_proc_typ"));
	}
	
	/**
	 * 検索結果に対してＤＢコンテナキャッシュから属性情報を補完します。
	 * 
	 * @param row 検索条件
	 * @param result 検索結果
	 */
	protected void itmDtlSpplMaker_SetDbcValues(MCRow row, MCList<?> result) {
		itmDtlSpplMaker_InitCache(result);
		for (MCRow r : result) {
			MAM_SPPL_USR_R spplUsrR = _itmDtlSpplMakerCache.get(MAM_SPPL_USR_R.class, row.getDateNE("master_dt2"), r.getStringNE("bp_cd"));
			r.setStringNE("purc_usr_cd", spplUsrR.purc_usr_cd());
			r.setStringNE("purc_dpt_cd", spplUsrR.purc_dpt_cd());
			r.setDateNE("st_dt", spplUsrR.st_dt());
			r.setDateNE("end_dt", spplUsrR.end_dt());

			r.setStringNE("cntry_nm", _itmDtlSpplMakerCache.get(MAM_CNTRY_R.class, r.getStringNE("cntry_cd")).cntry_nm());
			r.setStringNE("area_nm", _itmDtlSpplMakerCache.get(MAM_AREA_R.class, r.getStringNE("area_cd")).area_nm());

			MAM_CUR_R curR = _itmDtlSpplMakerCache.get(MAM_CUR_R.class, r.getStringNE("cur_cd"));
			r.setStringNE("cur_nm", curR.cur_nm());
			r.setNumberNE("amt_dec_place", curR.amt_dec_place());
			r.setNumberNE("upri_dec_place", curR.upri_dec_place());

			r.setStringNE("cst_tterm_nm1", _itmDtlSpplMakerCache.get(MAM_TTERM_R.class, r.getStringNE("cst_tterm_cd1")).tterm_nm());
			r.setStringNE("cst_tterm_nm2", _itmDtlSpplMakerCache.get(MAM_TTERM_R.class, r.getStringNE("cst_tterm_cd2")).tterm_nm());
			r.setStringNE("cst_tterm_nm3", _itmDtlSpplMakerCache.get(MAM_TTERM_R.class, r.getStringNE("cst_tterm_cd3")).tterm_nm());
			r.setStringNE("acst_nm", _itmDtlSpplMakerCache.get(MAVM_BP_NM_R.class, r.getStringNE("acst_cd")).bp_nm());
			r.setStringNE("bp_nm", _itmDtlSpplMakerCache.get(MAVM_BP_NM_R.class, r.getStringNE("bp_cd")).bp_nm());
			r.setStringNE("rqst_wg_nm", _itmDtlSpplMakerCache.get(MAM_WG_R.class, r.getStringNE("rqst_wg_cd")).wg_nm());

			MAM_EDI_IF_CTL_R ediIfCtlPoR = _itmDtlSpplMakerCache.get(
					MAM_EDI_IF_CTL_R.class, row.getDateNE("edi_today"), r.getStringNE("bp_cd"), MAC_IF_PROC_TYP.PO_SEND.value());
			r.setBooleanNE("edi_po_send_tgt_flg", !isNull(ediIfCtlPoR.if_proc_typ()));

			MAM_EDI_IF_CTL_R ediIfCtlAccptR = _itmDtlSpplMakerCache.get
					(MAM_EDI_IF_CTL_R.class, row.getDateNE("edi_today"), r.getStringNE("bp_cd"), MAC_IF_PROC_TYP.ACCPT_SEND.value());
			r.setBooleanNE("edi_accpt_send_tgt_flg", !isNull(ediIfCtlAccptR.if_proc_typ()));
		}
	}
	// -- ItmDtlWithSpplMaker:品目詳細（発注先、メーカ） (END)

	/**
	 * 検索結果に対象カラムの値が重複するレコードが存在している場合、
	 * 「入力条件によって一意に定まる項目のカラムと対象カラム」以外にnullをセットした上で、重複レコードを１つにまとめたリストを返します。
	 * 重複がないレコードには何もしません。
	 *
	 * @param d DBコンテナ
	 * @param sl 検索結果
	 * @param keyCol キーカラム（String型データに限る）
	 * @param listLogicId　リストロジックＩＤ
	 * @return 検索結果から重複を除いたリスト
	 */
	protected MCList<?> getNoDupList(MCList sl, String[] keyCols) {
		if (sl.size() < 2) {
			return sl;
		}
		
		// キーカラムセット
		final String[] chkCols = {
				"rqst_wg_cd", "purc_id_typ", "purc_basis_typ"
		};
		
		return getNoDupListSub(sl, keyCols, chkCols);
	}
	
	protected MCList<?> getNoDupListSub(
			MCList sl, String[] keyCols, String[] chkCols) {
		// 一時カラムを保持した空のリストを生成
		MCList noDupList = sl.shallowClone();
		noDupList.clear();
		
		MCSortPolicy sp = new MCSortPolicy();
		for (String str : keyCols) {
			sp.add(MCList.SortType.ASC, str);
		}
		for (String str : chkCols) {
			sp.add(MCList.SortType.ASC, str);
		}		
		// 前処理
		sl.sort(sp);
		
		MCRow pre = null;
		int diffFirstCol = chkCols.length;
		for (Object o : sl) {
			MCRow sr = (MCRow) o;
			boolean keyChg = false;
			if (pre != null) {
				for (String keyCol : keyCols) {
					if (!isSame(pre.getStringNE(keyCol), sr.getStringNE(keyCol))) {
						keyChg = true;
						break;
					}
				}
				
				// キーが変わった場合は表示
				if (keyChg) {
					noDupList.add(sr);
				}
				else {
					boolean chg = false;
					for (int i = 0; i < diffFirstCol; i++) {
						if (!isSame(pre.getStringNE(chkCols[i]), sr.getStringNE(chkCols[i]))) {
							chg = true;
							break;
						}
					}
					// 属性項目が異なる場合はクリアする
					if (chg) {
						pre.setValueNE("rqst_wg_cd", null);
						pre.setValueNE("rqst_wg_nm", null);
						pre.setValueNE("purc_id_typ", null);
						pre.setValueNE("purc_basis_typ", null);
					}
				}
			}
			else {
				noDupList.add(sr);
			}
			pre = sr;
		}
		
		// ソートはlistlogicCommon_AfterSelectで実施
		return noDupList;
	}
}
