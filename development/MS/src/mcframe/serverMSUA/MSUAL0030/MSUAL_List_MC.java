package mcframe.serverMSUA.MSUAL0030;

import static mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase.$INPUT_VAL;
import static mcframe.commonMA.notice.MA_Msg.MAUDL0002;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.$COMBO_MODE;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.$LIST_LOGIC_VAL;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.getLLBindNm;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getCo;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getDefaultFeedStkGd;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

import java.util.function.Consumer;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUA.MAUAL0010.MAUAL_List;
import mcframe.serverMAUC.MAUCL0160.MAUCL_ItmListLogic;
import mcframe.serverMS.dbc.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsListLogic;
import static mcframe.serverMSUA.MSUAL0030.Query.*;


abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- WrkMng:案件管理 (START)
	@Override
	protected void getWrkMng_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result) {
		super.getWrkMng_Set(row, builder, t, result);
		builder.setDistinct();

		String typ = row.getStringNE(WrkMngCols.$i_wrk_mng_typ);
		if (!isNull(typ)) {
			// 案件状況
			if (MSC_WRK_MNG_TYP.isWRK_STS(typ)) {
				builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_STS.value())));
			}
			// 受注確度
			else if (MSC_WRK_MNG_TYP.isSLO_ACC(typ)) {
				builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.SLO_ACC.value())));
			}
			// 案件活動状況
			else if (MSC_WRK_MNG_TYP.isWRK_ACT_STS(typ)) {
				builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_ACT_STS.value())));
			}
		}
	}
	// -- WrkMng:案件管理 (END)

	// -- WrkSts:案件状況 (START)
	@Override
	protected void getWrkSts_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result) {
		super.getWrkSts_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_STS.value())));
	}
	// -- WrkSts:案件状況 (END)

	// -- SloAcc:受注確度 (START)
	@Override
	protected void getSloAcc_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result) {
		super.getSloAcc_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.SLO_ACC.value())));
	}
	// -- SloAcc:受注確度(END)

	// -- ActSts:活動状況 (START)
	@Override
	protected void getActSts_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result) {
		super.getActSts_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_ACT_STS.value())));
	}
	// -- ActSts:活動状況 (END)

	// -- SloCanRsn:受注取消理由 (START)
	@Override
	protected void getSloCanRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result) {
		super.getSloCanRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.slo_can_flg.eq(value(true)));
	}
	// -- SloCanRsn:受注取消理由 (END)

	// -- QtnRsltRsn:見積結果理由 (START)
	@Override
	protected void getQtnRsltRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result) {
		super.getQtnRsltRsn_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.qtn_rslt_flg.eq(value(true)));
	}
	// -- QtnRsltRsn:見積結果理由 (END)

	// -- QtnTerm:見積条件 (START)
	@Override
	protected void getQtnTerm_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result) {
		super.getQtnTerm_Set(row, builder, t, result);
		builder.addWhereWithAnd(t.qtn_term_flg.eq(value(true)));
	}
	// -- QtnTerm:見積条件 (END)

	// -- SlsBdgGrp:予算分類 (START)
	@Override
	protected void getSlsBdgGrp_Set(MCRow row, MCQueryApiBuilder builder, MST_SLS_BDG_R t, MCList<?> result) {
		super.getSlsBdgGrp_Set(row, builder, t, result);
		builder.setDistinct();

		if (row.contains(SlsBdgGrpCols.$i_rd_flg)
				&& row.getBoolean(SlsBdgGrpCols.$i_rd_flg)) {
			// 検索可能ＦＬＧが指定された場合はMAVM_RD_WGと結合することで絞り込む(DAC対応)
		}
		if (row.contains(SlsBdgGrpCols.$i_dpt_flg)
				&& row.getBoolean(SlsBdgGrpCols.$i_dpt_flg)) {
			builder.addWhereWithAnd(t.sls_dpt_cd.isNotNull());
		}
		if (row.contains(SlsBdgGrpCols.$i_itm_grp_flg)
				&& row.getBoolean(SlsBdgGrpCols.$i_itm_grp_flg)) {
			builder.addWhereWithAnd(t.sls_itm_grp_cd.isNotNull());
		}
		builder.addWhereWithAnd(t.sls_bdg_grp.isNotNull());
	}
	// -- SlsBdgGrp:予算分類 (END)

	// -- WrkNo:案件ＮＯ (START)
	protected void getWrkNo_NullVal(
			MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(WrkNoCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(WrkNoCols.$o_wrk_no, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	@Override
	protected void getWrkNo_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_R t, MCList<?> result) {
		super.getWrkNo_Set(row, builder, t, result);

		builder.addWhereWithAnd(t.can_flg.eq(value(false)));
		builder.addWhereWithCutOffAnd(t.wrk_no.like(bind("1")),
				getEditString(row, WrkNoCols.$i_wrk_no));
		builder.addWhereWithCutOffAnd(t.wrk_nm.like(bind("1")),
				getEditString(row, WrkNoCols.$i_wrk_nm));

		if (row.contains(WrkNoCols.$i_st_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind("1")),
					row.getDate(WrkNoCols.$i_st_dt_fr));
		}
		if (row.contains(WrkNoCols.$i_st_dt_to)) {
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind("1")),
					row.getDate(WrkNoCols.$i_st_dt_to));
		}
		if (row.contains(WrkNoCols.$i_end_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind("1")),
					row.getDate(WrkNoCols.$i_end_dt_fr));
		}
		if (row.contains(WrkNoCols.$i_end_dt_to)) {
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind("1")),
					row.getDate(WrkNoCols.$i_end_dt_to));
		}
	}
	// -- WrkNo:案件ＮＯ (END)

	// -- Sno1_WrkNo:手配ＮＯ１＿案件ＮＯ (START)
	@Override
	protected void getSno1_WrkNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_WRK_SNO_R t, MCList<?> result) {
		super.getSno1_WrkNo_Set(row, builder, t, result);

		builder.addWhereWithAnd(t.can_flg.eq(value(false)));
		builder.addWhereWithCutOffAnd(t.sno1.like(bind("1")),
				getEditString(row, Sno1_WrkNoCols.$i_sno1));
		builder.addWhereWithCutOffAnd(t.wrk_no.like(bind("1")),
				getEditString(row, Sno1_WrkNoCols.$i_wrk_no));
		builder.addWhereWithCutOffAnd(t.wrk_nm.like(bind("1")),
				getEditString(row, Sno1_WrkNoCols.$i_wrk_nm));

		if (row.contains(Sno1_WrkNoCols.$i_st_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind("1")),
					row.getDate(Sno1_WrkNoCols.$i_st_dt_fr));
		}
		if (row.contains(Sno1_WrkNoCols.$i_st_dt_to)) {
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind("1")),
					row.getDate(Sno1_WrkNoCols.$i_st_dt_to));
		}
		if (row.contains(Sno1_WrkNoCols.$i_end_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind("1")),
					row.getDate(Sno1_WrkNoCols.$i_end_dt_fr));
		}
		if (row.contains(Sno1_WrkNoCols.$i_end_dt_to)) {
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind("1")),
					row.getDate(Sno1_WrkNoCols.$i_end_dt_to));
		}
	}
	// -- Sno1_WrkNo:手配ＮＯ１＿案件ＮＯ (END)

	// -- SloNo:受注ＮＯ (START)
	@Override
	protected void getSloNo_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_R t, MCList<?> result) {
		super.getSloNo_Set(row, builder, t, result);
		getSloNo_addSelectJoinCustom(row, builder, t, result);
		getSloNo_addWhereCustom(row, builder, t, result);
	}

	protected void getSloNo_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MST_SLO_R t, MCList<?> result) {
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MST_WRK_R t3 = MST_WRK_R.create("T3");
		MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_DPT_R m2 = MAM_DPT_R.create("M2");
		MAM_USR_R m3 = MAM_USR_R.create("M3");
		MAVM_RD_DPT_R m0 = MAVM_RD_DPT_R.create("M0");
		MAM_ITM_R m4 = MAM_ITM_R.create("M4");

		// 固定のSelect句、結合の設定
		result.addStringColumn(SloNoCols.$o_slo_d_no);
		result.addStringColumn(SloNoCols.$o_cst_nm);
		result.addStringColumn(SloNoCols.$o_sls_usr_nm);
		result.addStringColumn(SloNoCols.$o_sls_dpt_nm);
		result.addStringColumn(SloNoCols.$o_wrk_nm);
		result.addStringColumn(SloNoCols.$o_itm_cd);
		result.addStringColumn(SloNoCols.$o_itm_sub1);
		result.addStringColumn(SloNoCols.$o_itm_sub2);
		result.addStringColumn(SloNoCols.$o_itm_sub3);
		result.addStringColumn(SloNoCols.$o_itm_nm);
		result.addStringColumn(SloNoCols.$o_cst_itm_cd);
		result.addStringColumn(SloNoCols.$o_cst_itm_nm);
		result.addBooleanColumn(SloNoCols.$o_vmi_flg);

		builder.addSelect(t3.wrk_nm);
		builder.addSelect(m1.bp_nm.as("cst_nm"));
		builder.addSelect(m2.dpt_nm.as("sls_dpt_nm"));
		builder.addSelect(m3.usr_nm.as("sls_usr_nm"));

		if ((!isInput(row)) && (row.getBooleanNE(SloNoCols.$i_slo_d_no_srh_flg))) {
			builder.addSelect(t2.slo_d_no.as("slo_d_no"));
			builder.addSelect(t2.itm_cd.as("itm_cd"));
			builder.addSelect(t2.itm_sub1.as("itm_sub1"));
			builder.addSelect(t2.itm_sub2.as("itm_sub2"));
			builder.addSelect(t2.itm_sub3.as("itm_sub3"));
			builder.addSelect(nvl( t2.itm_nm, m4.itm_nm).as("itm_nm"));
			builder.addSelect(t2.cst_itm_cd.as("cst_itm_cd"));
			builder.addSelect(t2.cst_itm_nm.as("cst_itm_nm"));
			builder.addSelect(t2.vmi_flg);
			builder.addInnerJoin(t2, bracket( t.slo_no.eq(t2.slo_no)));
			builder.addInnerJoin(t4, bracket(t2.slo_d_no.eq(t4.slo_d_no)));
		}

		builder.addLeftOuterJoin(t3, bracket(t.wrk_no.eq(t3.wrk_no)));
		builder.addLeftOuterJoin(m1, bracket(t.cst_cd.eq(m1.bp_cd)));
		builder.addLeftOuterJoin(m2,
				bracket(t.sls_dpt_cd.eq(m2.dpt_cd)
				.and(t.slo_dt.between(m2.st_dt, m2.end_dt))));
		builder.addLeftOuterJoin(m3, bracket(t.sls_usr_cd.eq(m3.usr_cd)));

		if (row.getBooleanNE(SloNoCols.$i_ref_auth_flg)) {
			builder.addInnerJoin(m0, bracket(t.sls_dpt_cd.eq(m0.dpt_cd)));
		}
		
		if ((!isInput(row)) && (row.getBooleanNE(SloNoCols.$i_slo_d_no_srh_flg))) {
			builder.addLeftOuterJoin(m4,
					bracket(t2.itm_cd.eq(m4.itm_cd)
					.and(t2.itm_sub1.eq(m4.itm_sub1))
					.and(t2.itm_sub2.eq(m4.itm_sub2))
					.and(t2.itm_sub3.eq(m4.itm_sub3))
					.cutoff$and(m4.itm_nm.like(bind("itm_nm")))));
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

	protected void getSloNo_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MST_SLO_R t, MCList<?> result) {
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MST_WRK_R t3 = MST_WRK_R.create("T3");
		

		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithAnd(t.can_flg.eq(value(false)));
		
		if (row.getBooleanNE(SloNoCols.$i_adv_rcv_flg)) {
			builder.addWhereWithAnd(
					t.adv_ship_ctrl_typ.eq(value(MSC_ADV_SHIP_CTRL_TYP.SHIP_STOP.value())));
		}

		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		String sloNo = row.getStringNE(SloNoCols.$i_slo_no);
		String sloDNo = row.getStringNE(SloNoCols.$i_in_slo_d_no);
		boolean vmiFlg = row.getBooleanNE(SloNoCols.$i_vmi_flg);

		if (vmiFlg) {
			if (!isNull(sloNo) && isNull(sloDNo)) {
				builder.addWhereWithAnd(
						t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())));
			}
			else if (!isNull(sloNo) && !isNull(sloDNo)) {
				builder.addWhereWithAnd(t2.vmi_flg.eq(value(true)));
			}
		}
		else {
			builder.addWhereWithAnd(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())));
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}

		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.slo_no.like(bind("1")),
				getEditString(row, SloNoCols.$i_slo_no));
		builder.addWhereWithCutOffAnd(t.wrk_no.like(bind("1")),
				getEditString(row, SloNoCols.$i_wrk_no));
		builder.addWhereWithCutOffAnd(t3.wrk_nm.like(bind("1")),
				getEditString(row, SloNoCols.$i_wrk_nm));

		if (row.contains(SloNoCols.$i_slo_dt_fr)) {
			builder.addWhereWithCutOffAnd(t.slo_dt.gte(bind("1")),
					row.getDate(SloNoCols.$i_slo_dt_fr));
		}
		if (row.contains(SloNoCols.$i_slo_dt_to)) {
			builder.addWhereWithCutOffAnd(t.slo_dt.lte(bind("1")),
					row.getDate(SloNoCols.$i_slo_dt_to));
		}

		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_DPT_R m2 = MAM_DPT_R.create("M2");
		MAM_USR_R m3 = MAM_USR_R.create("M3");

		builder.addWhereWithCutOffAnd(t.cst_cd.like(bind("1")),
				getEditString(row, SloNoCols.$i_cst_cd));
		builder.addWhereWithCutOffAnd(m1.bp_nm.like(bind("1")),
				getEditString(row, SloNoCols.$i_cst_nm));
		builder.addWhereWithCutOffAnd(t.sls_dpt_cd.like(bind("1")),
				getEditString(row, SloNoCols.$i_sls_dpt_cd));
		builder.addWhereWithCutOffAnd(m2.dpt_nm.like(bind("1")),
				getEditString(row, SloNoCols.$i_sls_dpt_nm));
		builder.addWhereWithCutOffAnd(t.sls_usr_cd.like(bind("1")),
				getEditString(row, SloNoCols.$i_sls_usr_cd));
		builder.addWhereWithCutOffAnd(m3.usr_nm.like(bind("1")),
				getEditString(row, SloNoCols.$i_sls_usr_nm));

		if ((!isInput(row)) && (row.getBooleanNE(SloNoCols.$i_slo_d_no_srh_flg))) {
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			MAM_ITM_R m4 = MAM_ITM_R.create("M4");
			builder.addWhereWithAnd(t2.can_flg.eq(value(false)));
			builder.addWhereWithAnd(t2.abort_flg.eq(value(false))
					.or(bracket(t2.abort_flg.eq(value(true)).and(t4.ship_schd_abort_qty.lt(t4.base_unit_qty)))));
			builder.addWhereWithCutOffAnd(t2.slo_d_no.like(bind("1")),
					getEditString(row, SloNoCols.$i_in_slo_d_no));
			builder.addWhereWithCutOffAnd(t2.itm_cd.like(bind("1")),
					getEditString(row, SloNoCols.$i_itm_cd));
			builder.addWhereWithCutOffAnd(t2.itm_sub1.like(bind("1")),
					getEditString(row, SloNoCols.$i_itm_sub1));
			builder.addWhereWithCutOffAnd(t2.itm_sub2.like(bind("1")),
					getEditString(row, SloNoCols.$i_itm_sub2));
			builder.addWhereWithCutOffAnd(t2.itm_sub3.like(bind("1")),
					getEditString(row, SloNoCols.$i_itm_sub3));
			builder.addWhereWithCutOffAnd(nvl(t2.itm_nm, m4.itm_nm).like(bind("itm_nm")));
			// Join句でも使うために、あえてrowにセットする
			if (row.contains(SloNoCols.$i_itm_nm)) {
				row.setString(SloNoCols.$i_itm_nm,
						getEditString(row, SloNoCols.$i_itm_nm));
			}
			builder.addWhereWithCutOffAnd(t2.cst_itm_cd.like(bind("1")),
					getEditString(row, SloNoCols.$i_cst_itm_cd));
			builder.addWhereWithCutOffAnd(t2.cst_itm_nm.like(bind("1")),
					getEditString(row, SloNoCols.$i_cst_itm_nm));
		}
	}

	// エラーメッセージ切替
	protected MCMessage getSloNo_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		String slo = row.getStringNE(SloNoCols.$i_slo_no);
		String slo_d = row.getStringNE(SloNoCols.$i_in_slo_d_no);
		String rowInfo = new MCMessage(MAUDL0002, causeRow.getGUIIndex() + 1)
				.toString(MCLocaleConst.message(MCSys.user.locale()));
		MCMessage msg = new MCMessage(MSBBL0060, slo, rowInfo);
		
		if (row.getBooleanNE(SloNoCols.$i_vmi_flg)) {
			
			if (!isNull(slo) && isNull(slo_d)) {
				msg = new MCMessage(MSBBL0252, slo, rowInfo);
				return msg.setCauseRow(causeRow, causeCol);
			}
			else if (!isNull(slo) && !isNull(slo_d)) {
				msg = new MCMessage(MSBBL0253, slo, slo_d, rowInfo);
				return msg.setCauseRow(causeRow, causeCol);
			}
		}
		else {
			if (!isNull(slo) && !isNull(slo_d)) {
				msg = new MCMessage(MSBBL0061, slo, slo_d, rowInfo);
				return msg.setCauseRow(causeRow, causeCol);
			}
			if (!isNull(slo)) {
				msg = new MCMessage(MSBBL0060, slo, rowInfo);
				return msg.setCauseRow(causeRow, causeCol);
			}
			if (!isNull(slo_d)) {
				msg = new MCMessage(MSBBL0062, rowInfo);
				return msg.setCauseRow(causeRow, causeCol);
			}
		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// サーバチェックロジック 
	public MCList<?> getSloNo_SrvChk(MCRow inRow, MCList<?> rsltL) {
		MCList<?> list = rsltL;
		String sloNo = inRow.getStringNE(SloNoCols.$i_slo_no);
		String sloDNo = inRow.getStringNE(SloNoCols.$i_in_slo_d_no);
		boolean vmiFlg = inRow.getBooleanNE(SloNoCols.$i_vmi_flg);
		
		if (vmiFlg) {
			
			if (!isNull(sloNo) && isNull(sloDNo)) {
				list = list.subList(SloNoCols.$o_trd_ptn_typ, MAC_TRD_PTN_TYP.SHIP.value());
			}
			else if (!isNull(sloNo) && !isNull(sloDNo)) {
				
				list = list.subList(SloNoCols.$o_vmi_flg, true);
			}
		}
		else {
			list = list.subList(SloNoCols.$o_trd_ptn_typ, MAC_TRD_PTN_TYP.SLS.value());
		}

		if ((!isNull(inRow.getStringNE(SloNoCols.$i_in_slo_d_no)))
				&& (inRow.getBooleanNE(SloNoCols.$i_slo_d_no_srh_flg))) {
			return list.subList(SloNoCols.$o_slo_d_no, inRow.getStringNE(SloNoCols.$i_in_slo_d_no));
		}

		if (inRow.getBooleanNE(SloNoCols.$i_vmi_flg)) {
		}

		return list;
	}
	// -- SloNo:受注ＮＯ (END)

	// -- SloLoc:受注場所 (START)
	@Override
	protected void getSloLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		super.getSloLoc_Set(row, builder, t, result);
		getSloLoc_addSelectJoinCustom(row, builder, t, result);
		getSloLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getSloLoc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(SloLocCols.$o_tdlv_cd);
		result.addStringColumn(SloLocCols.$o_dlv_cd);
		result.addStringColumn(SloLocCols.$o_itm_cd);
		result.addStringColumn(SloLocCols.$o_itm_sub1);
		result.addStringColumn(SloLocCols.$o_itm_sub2);
		result.addStringColumn(SloLocCols.$o_itm_sub3);
		result.addDateColumn(SloLocCols.$o_base_dt);
		
		// 補助マスタから取得するため削除
		builder.removeSelect(MAM_LOC_R.$sls_dpt_cd);

		// Select句、結合の設定
		getSloLoc_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSloLoc_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		new MSUAL_SelectJoinWk<MAM_LOC_R, MSW_SLO_LOC_LL_R>(
				row, builder, MAM_LOC_R.class, MSW_SLO_LOC_LL_R.class
				).get_addSelectJoinWk();
	}

	/**
	 * SloLocについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param d　ＤＢコンテナ
	 */
	protected void getSloLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAM_SLO_ALLOC_R m1 = MAM_SLO_ALLOC_R.create("M1");
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");
		MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
		MSW_SLO_LOC_LL_R w = MSW_SLO_LOC_LL_R.create("W");

		builder.addWhereWithAnd(bracket(exists(subQuery()
				.select(value("X"))
				.from(m1)
				.where(t.loc_cd.eq(m1.loc_cd)
						.and(bracket(
								m1.to_lg_grp_cd.eq(subQuery()
										.select(bp.lg_grp_cd)
										.from(bp)
										.where(bp.bp_cd.eq(nvl(w.tdlv_cd, w.dlv_cd)))))
												.cutoff$or(m1.to_lg_grp_cd.eq(
														bind("dlv_lg_grp_cd")))
												.cutoff$or(m1.to_lg_grp_cd.eq(
														bind("tdlv_lg_grp_cd")))
												.or(m1.to_lg_grp_cd.eq(
														value(MAC_STR.NULL_VAL.value()))))
						.and(bracket(m1.itm_ship_grp_cd.eq(subQuery()
								.select(itm.itm_ship_grp_cd)
								.from(itm)
								.where(itm.itm_cd.eq(w.itm_cd)
										.and(itm.itm_sub1.eq(w.itm_sub1))
										.and(itm.itm_sub2.eq(w.itm_sub2))
										.and(itm.itm_sub3.eq(w.itm_sub3)))))
												.or(m1.itm_ship_grp_cd
														.eq(value(MAC_STR.NULL_VAL.value()))))
						.and(m1.wg_cd.eq(subQuery()
								.select(dpt.wg_cd)
								.from(dpt)
								.where(dpt.dpt_cd.eq(w.sls_dpt_cd)
										.and(w.base_dt.between(dpt.st_dt,dpt.end_dt)))))))));
	}

	protected MCMessage getSloLoc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(SloLocCols.$i_itm_cd),
				row.getStringNE(SloLocCols.$i_itm_sub1),
				row.getStringNE(SloLocCols.$i_itm_sub2),
				row.getStringNE(SloLocCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBBL0067, row.getStringNE(SloLocCols.$i_dlv_cd),
				row.getStringNE(SloLocCols.$i_tdlv_cd),
				row.getStringNE(SloLocCols.$i_sls_dpt_cd),
				toYMDString(row.getDateNE(SloLocCols.$i_base_dt)), itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- SloLoc:受注場所 (END)

	// -- SloAllocGrp:受注総量引当場所グループ (START)
	@Override
	protected void getSloAllocGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result) {
		super.getSloAllocGrp_Set(row, builder, t, result);
		getSloAllocGrp_addSelectJoinCustom(row, builder, t, result);
		getSloAllocGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getSloAllocGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(SloAllocGrpCols.$o_tdlv_cd);
		result.addStringColumn(SloAllocGrpCols.$o_dlv_cd);
		result.addStringColumn(SloAllocGrpCols.$o_itm_cd);
		result.addStringColumn(SloAllocGrpCols.$o_itm_sub1);
		result.addStringColumn(SloAllocGrpCols.$o_itm_sub2);
		result.addStringColumn(SloAllocGrpCols.$o_itm_sub3);
		result.addStringColumn(SloAllocGrpCols.$o_sls_dpt_cd);
		result.addDateColumn(SloAllocGrpCols.$o_base_dt);

		// Select句、結合の設定
		getSloAllocGrp_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getSloAllocGrp_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result) {
		new MSUAL_SelectJoinWk<MAM_ALLOC_GRP_R, MSW_SLO_ALLOC_GRP_LL_R>(
				row, builder, MAM_ALLOC_GRP_R.class, MSW_SLO_ALLOC_GRP_LL_R.class
				).get_addSelectJoinWk();
	}

	/**
	 * SloAllocGrpについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param d　ＤＢコンテナ
	 */
	protected void getSloAllocGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result) {
		MAM_SLO_ALLOC_R m1 = MAM_SLO_ALLOC_R.create("M1");
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");
		MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
		MSW_SLO_ALLOC_GRP_LL_R w = MSW_SLO_ALLOC_GRP_LL_R.create("W");

		builder.addWhereWithAnd(bracket(exists(subQuery()
				.select(value("X"))
				.from(m1)
				.where(t.alloc_grp_cd.eq(m1.alloc_grp_cd)
						.and(bracket(m1.to_lg_grp_cd.eq(subQuery()
								.select(bp.lg_grp_cd)
								.from(bp)
								.where(bp.bp_cd.eq(nvl(w.tdlv_cd, w.dlv_cd)))))
										.cutoff$or(m1.to_lg_grp_cd
												.eq(bind("dlv_lg_grp_cd")))
										.cutoff$or(m1.to_lg_grp_cd
												.eq(bind("tdlv_lg_grp_cd")))
										.or(m1.to_lg_grp_cd.eq(
												value(MAC_STR.NULL_VAL.value()))))
						.and(bracket(m1.itm_ship_grp_cd.eq(subQuery()
								.select(itm.itm_ship_grp_cd)
								.from(itm)
								.where(itm.itm_cd.eq(w.itm_cd)
										.and(itm.itm_sub1.eq(w.itm_sub1))
										.and(itm.itm_sub2.eq(w.itm_sub2))
										.and(itm.itm_sub3.eq(w.itm_sub3)))))
												.or(m1.itm_ship_grp_cd.eq(
														value(MAC_STR.NULL_VAL.value()))))
						.and(m1.wg_cd.eq(subQuery()
								.select(dpt.wg_cd)
								.from(dpt)
								.where(dpt.dpt_cd.eq(w.sls_dpt_cd)
										.and(w.base_dt.between(dpt.st_dt, dpt.end_dt)))))))));
	}

	protected MCMessage getSloAllocGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(SloAllocGrpCols.$i_itm_cd),
				row.getStringNE(SloAllocGrpCols.$i_itm_sub1),
				row.getStringNE(SloAllocGrpCols.$i_itm_sub2),
				row.getStringNE(SloAllocGrpCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBBL0068,
				row.getStringNE(SloAllocGrpCols.$i_dlv_cd),
				row.getStringNE(SloAllocGrpCols.$i_tdlv_cd),
				row.getStringNE(SloAllocGrpCols.$i_sls_dpt_cd),
				toYMDString(row.getDateNE(SloAllocGrpCols.$i_base_dt)), itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- SloAllocGrp:受注総量引当場所グループ (END)

	// -- SloLgGrp:受注物流グループ (START)
	@Override
	protected void getSloLgGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		super.getSloLgGrp_Set(row, builder, t, result);
		getSloLgGrp_addSelectJoinCustom(row, builder, t, result);
		getSloLgGrp_addWhereCustom(row, builder, t, result);
	}

	protected void getSloLgGrp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(SloLgGrpCols.$o_tdlv_cd);
		result.addStringColumn(SloLgGrpCols.$o_dlv_cd);
		result.addStringColumn(SloLgGrpCols.$o_itm_cd);
		result.addStringColumn(SloLgGrpCols.$o_itm_sub1);
		result.addStringColumn(SloLgGrpCols.$o_itm_sub2);
		result.addStringColumn(SloLgGrpCols.$o_itm_sub3);
		result.addStringColumn(SloLgGrpCols.$o_sls_dpt_cd);
		result.addDateColumn(SloLgGrpCols.$o_base_dt);

		// Select句、結合の設定
		getSloLgGrp_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}
	
	protected void getSloLgGrp_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		new MSUAL_SelectJoinWk<MAM_LG_GRP_R, MSW_SLO_LG_GRP_LL_R>(
				row, builder, MAM_LG_GRP_R.class, MSW_SLO_LG_GRP_LL_R.class
				).get_addSelectJoinWk();

		MSW_SLO_LG_GRP_LL_R w = MSW_SLO_LG_GRP_LL_R.create("W");
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");
		MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
		MAM_SLO_ALLOC_R m1 = MAM_SLO_ALLOC_R.create("M1");
		if (!isNull(row.getStringNE(SloLgGrpCols.$i_tdlv_cd)) || 
				!isNull(row.getStringNE(SloLgGrpCols.$i_dlv_cd))) {
			builder.addInnerJoin(bp,
					bracket(bp.bp_cd.eq(nvl(w.tdlv_cd, w.dlv_cd))));
		}
		if (!isNull(row.getStringNE(SloLgGrpCols.$i_itm_cd)) && !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub1))
				&& !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub2)) && !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub3))) {
			builder.addInnerJoin(itm,
					bracket(itm.itm_cd.eq(w.itm_cd)
					.and(itm.itm_sub1.eq(w.itm_sub1))
					.and(itm.itm_sub2.eq(w.itm_sub2))
					.and(itm.itm_sub3.eq(w.itm_sub3))));
		}
		builder.addInnerJoin(dpt,
				bracket(dpt.dpt_cd.eq(w.sls_dpt_cd)
				.and(w.base_dt.between(dpt.st_dt, dpt.end_dt))));
		builder.addInnerJoin(m1,
				bracket(m1.lg_grp_cd.eq(t.lg_grp_cd)
				.and(m1.wg_cd.eq(dpt.wg_cd))));
		builder.setDistinct();
	}

	/**
	 * SloLgGrpについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param d　ＤＢコンテナ
	 */
	protected void getSloLgGrp_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result) {
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");
		MAM_SLO_ALLOC_R m1 = MAM_SLO_ALLOC_R.create("M1");
		if (!isNull(row.getStringNE(SloLgGrpCols.$i_tdlv_cd)) || 
				!isNull(row.getStringNE(SloLgGrpCols.$i_dlv_cd))) {
			builder.addWhereWithAnd(
					bracket(m1.to_lg_grp_cd.eq(bp.lg_grp_cd)
							.cutoff$or(m1.to_lg_grp_cd.eq(bind("dlv_lg_grp_cd")))
							.cutoff$or(m1.to_lg_grp_cd.eq(bind("tdlv_lg_grp_cd")))
							.or(m1.to_lg_grp_cd.eq(value(MAC_STR.NULL_VAL.value())))));
		}else {
			builder.addWhereWithAnd(
					bracket(m1.to_lg_grp_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.cutoff$or(m1.to_lg_grp_cd.eq(bind("dlv_lg_grp_cd")))
							.cutoff$or(m1.to_lg_grp_cd.eq(bind("tdlv_lg_grp_cd")))));
		}
		if (!isNull(row.getStringNE(SloLgGrpCols.$i_itm_cd)) && !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub1))
				&& !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub2)) && !isNull(row.getStringNE(SloLgGrpCols.$i_itm_sub3))) {
			builder.addWhereWithAnd(
					bracket(m1.itm_ship_grp_cd.eq(itm.itm_ship_grp_cd)
							.or(m1.itm_ship_grp_cd.eq(value(MAC_STR.NULL_VAL.value())))));
		}else {
			builder.addWhereWithAnd(
					bracket(m1.itm_ship_grp_cd.eq(value(MAC_STR.NULL_VAL.value()))));
		}
	}

	protected MCMessage getSloLgGrp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		String itmInfo = toDispItm(row.getStringNE(SloLgGrpCols.$i_itm_cd),
				row.getStringNE(SloLgGrpCols.$i_itm_sub1),
				row.getStringNE(SloLgGrpCols.$i_itm_sub2),
				row.getStringNE(SloLgGrpCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBBL0069, row.getStringNE(SloLgGrpCols.$i_dlv_cd),
				row.getStringNE(SloLgGrpCols.$i_tdlv_cd),
				row.getStringNE(SloLgGrpCols.$i_sls_dpt_cd),
				toYMDString(row.getDateNE(SloLgGrpCols.$i_base_dt)), itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- SloLgGrp:受注物流グループ (END)

	// -- CstSloStkGd:受注引当可能格付（得意先対応） (START)
	@Override
	public MCList<MCRow> getCstSloStkGd(MCRow row) {
		MCList<MAM_SLO_ALLOC_GD_R> rslt = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R dbc = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);

		getCstSloStkGd_addSelectJoinWk(row, builder, dbc, rslt);
		executeQuery(rslt, MSUAL0030_MSW_SLO_ALLOC_GD_LL_S01(), row);
		MCList<? extends MCRow> down = getCstSloStkGd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down, "MS.MSUAL0030.CstSloStkGd");
		if (isNull(down)) return null;
		return getCstSloStkGd_SubColumns(row, down);
	}

	protected void getCstSloStkGd_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_SLO_ALLOC_GD_R t, MCList<?> result) {
		MSW_SLO_ALLOC_GD_LL_R slo_alloc_gd_ll = MSW_SLO_ALLOC_GD_LL_R.create("T");

		// ワークテーブルを作成＋結合
		MCList<MSW_SLO_ALLOC_GD_LL_R> sd = MCList.create(MSW_SLO_ALLOC_GD_LL_R.class);
		String delid = createSqlId("MS.MSUAL0030.CstSloStkGd_addSelectJoinWk", slo_alloc_gd_ll, "D01");
		execDbWkDelete(delid, slo_alloc_gd_ll);

		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(slo_alloc_gd_ll);
		String insid = createSqlId("MS.MSUAL0030.CstSloStkGd_addSelectJoinWk", slo_alloc_gd_ll, "I01");
		insBuilder.setValuesAll();
		String[] gdCd = null;
		String[] cstCd = null;
		String[] dlvCd = null;
		if (isSrvChk(row)) {
			boolean containDlvCd = row.contains(getLLBindNm(CstSloStkGdCols.$i_dlv_cd));

			gdCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			cstCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(CstSloStkGdCols.$i_cst_cd)));
			// 納品先が設定されている場合
			if (containDlvCd) {
				dlvCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(CstSloStkGdCols.$i_dlv_cd)));
			}

			for (int i = 0; i < gdCd.length; i++) {
				MSW_SLO_ALLOC_GD_LL_R sr = MSW_SLO_ALLOC_GD_LL_R.create();
				sr.gd_cd(gdCd[i]);
				sr.cst_cd(cstCd[i]);
				// 納品先が設定されている場合
				if (containDlvCd) {
					sr.dlv_cd(dlvCd[i]);
				}
				sd.add(sr);
			}
			dbInsert(insid, sd, insBuilder);
		}
		else {
			MSW_SLO_ALLOC_GD_LL_R sr = MSW_SLO_ALLOC_GD_LL_R.create();
			sr.cst_cd(row.getStringNE(CstSloStkGdCols.$i_cst_cd));
			sr.dlv_cd(row.getStringNE(CstSloStkGdCols.$i_dlv_cd));
			sd.add(sr);
			dbInsert(insid, sd, insBuilder);
		}
	}

	protected MCMessage getCstSloStkGd_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		MCMessage msg = new MCMessage(MSBBL0086,
				row.getStringNE(CstSloStkGdCols.$i_cst_cd),
				row.getStringNE(CstSloStkGdCols.$i_dlv_cd), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- CstSloStkGd:受注引当可能格付（得意先対応） (END)

	// -- SplnVers:集計別販売計画バージョン (START)
	@Override
	protected void getSplnVers_Set(MCRow row, MCQueryApiBuilder builder, MST_SPLN_SUM_VERS_R t, MCList<?> result) {
		super.getSplnVers_Set(row, builder, t, result);
		builder.setDistinct();

		builder.addWhereWithCutOffAnd(t.ym.eq(bind("1")), row.getDateNE(SplnVersCols.$i_ym));
		builder.addWhereWithCutOffAnd(t.dpt_cd.eq(bind("1")), row.getStringNE(SplnVersCols.$i_dpt_cd));
		builder.addWhereWithCutOffAnd(t.cst_cd.eq(bind("1")), row.getStringNE(SplnVersCols.$i_cst_cd));
		builder.addWhereWithCutOffAnd(t.wrk_no.eq(bind("1")), row.getStringNE(SplnVersCols.$i_wrk_no));
		builder.addWhereWithCutOffAnd(t.spln_vers.neq(bind("1")), row.getStringNE(SplnVersCols.$i_excluded_vers));
	}

	// -- SplnVers:集計別販売計画バージョン (END)

	// -- SetItm:品揃 (START)
	@Override
	protected void getSetItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SET_ITM_R t, MCList<?> result) {
		super.getSetItm_Set(row, builder, t, result);
		
		MAVM_ITM_UNIT_R itmunit = MAVM_ITM_UNIT_R.create("ITM_UNIT1");
		
		result.addNumberColumn(SetItmCols.$o_qty);
		result.addBooleanColumn(SetItmCols.$o_ship_assort_flg);
		
		MAM_SET_GRP_R setgrp = (MAM_SET_GRP_R)t.getForeignInfoByColumn(MAM_SET_ITM_R.$set_grp_nm).getRefTableDbc();
		builder.addSelect(setgrp.ship_assort_flg);
		builder.addSelect(setgrp.st_dt);
		builder.addSelect(setgrp.end_dt);
		builder.addSelect(itmunit.dec_place);
		
		// SetItmCols.$o_qtyの計算用
		builder.addSelect(t.set_itm_qty);
		builder.addSelect(t.main_itm_qty);

		builder.addLeftOuterJoin(itmunit,
				bracket(t.set_itm_cd.eq(itmunit.itm_cd)
						.and(t.set_itm_sub1.eq(itmunit.itm_sub1))
						.and(t.set_itm_sub2.eq(itmunit.itm_sub2))
						.and(t.set_itm_sub3.eq(itmunit.itm_sub3))));

		builder.addWhereWithCutOffAnd(t.set_grp_cd.like(bind("1")), row.getStringNE(SetItmCols.$i_set_grp_cd));
		builder.addWhereWithCutOffAnd(setgrp.set_grp_nm.like(bind("1")), row.getStringNE(SetItmCols.$i_set_grp_nm));

		builder.addWhereWithAnd(t.main_itm_cd.eq(bind("1")), row.getStringNE(SetItmCols.$i_main_itm_cd));
		builder.addWhereWithAnd(t.main_itm_sub1.eq(bind("1")), row.getStringNE(SetItmCols.$i_main_itm_sub1));
		builder.addWhereWithAnd(t.main_itm_sub2.eq(bind("1")), row.getStringNE(SetItmCols.$i_main_itm_sub2));
		builder.addWhereWithAnd(t.main_itm_sub3.eq(bind("1")), row.getStringNE(SetItmCols.$i_main_itm_sub3));
		builder.addWhereWithAnd(t.main_itm_unit_cd.eq(bind("1")), row.getStringNE(SetItmCols.$i_main_itm_unit_cd));

		builder.addWhereWithCutOffAnd(bind("1").between(setgrp.st_dt, setgrp.end_dt), row.getDateNE(SetItmCols.$i_base_dt));
	}

	@Override
	protected MCList<?> getSetItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SET_ITM_R t, MCList<?> result) {
		// (:main_itm_qty * t.set_itm_qty) / t.main_itm_qty
		MCNumber condMainItmQty = row.getNumberNE(SetItmCols.$i_main_itm_qty);
		
		result.addNumberColumn(SetItmCols.$o_qty);
		if (!isNull(condMainItmQty)) {
			for (MCRow r : result) {
				MCNumber qty = condMainItmQty
						.multiply(r.getNumberNE(MAM_SET_ITM_R.$main_itm_qty))
						.divide(r.getNumberNE(MAM_SET_ITM_R.$set_itm_qty));
				r.setNumber(SetItmCols.$o_qty, qty);
			}
		}
		return result;
	}
	// -- SetItm:品揃 (END)

	// -- DmndLoc:需要場所 (START)
	@Override
	protected void getDmndLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		super.getDmndLoc_Set(row, builder, t, result);
		getDmndLoc_addSelectJoinCustom(row, builder, t, result);
		getDmndLoc_addWhereCustom(row, builder, t, result);
	}

	protected void getDmndLoc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAM_SITE_R m1 = MAM_SITE_R.create("M1");
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAM_LG_GRP_R m3 = MAM_LG_GRP_R.create("M3");
		MAM_ALLOC_GRP_R m4 = MAM_ALLOC_GRP_R.create("M4");
		MAM_LOC_GRP_R m5 = MAM_LOC_GRP_R.create("M5");

		// DBコンテナの項目に定義されていない項目
		result.addStringColumn(DmndLocCols.$o_tdlv_cd);
		result.addStringColumn(DmndLocCols.$o_dlv_cd);
		result.addStringColumn(DmndLocCols.$o_itm_cd);
		result.addStringColumn(DmndLocCols.$o_itm_sub1);
		result.addStringColumn(DmndLocCols.$o_itm_sub2);
		result.addStringColumn(DmndLocCols.$o_itm_sub3);
		result.addDateColumn(DmndLocCols.$o_dt);

		// 親クラスの処理で自動追加されたleft outer joinを削除
		builder.removeSelect(MAM_LOC_R.$site_nm);
		builder.inactiveForeign("SITE1");
		builder.removeSelect(MAM_LOC_R.$wg_nm);
		builder.inactiveForeign("WG1");
		builder.removeSelect(MAM_LOC_R.$lg_grp_nm);
		builder.inactiveForeign("LG_GRP1");
		builder.removeSelect(MAM_LOC_R.$alloc_grp_nm);
		builder.inactiveForeign("ALLOC_GRP1");
		builder.removeSelect(MAM_LOC_R.$loc_grp_nm);
		builder.inactiveForeign("LOC_GRP1");
		// 補助マスタから取得するため削除
		builder.removeSelect(MAM_LOC_R.$sls_dpt_cd);
		
		// Select句、結合の設定
		builder.addSelectNEActiveForeign(m1.site_nm);
		builder.addSelectNEActiveForeign(m2.wg_nm);
		builder.addSelectNEActiveForeign(m3.lg_grp_nm);
		builder.addSelectNEActiveForeign(m4.alloc_grp_nm);
		builder.addSelectNEActiveForeign(m5.loc_grp_nm);
		builder.addLeftOuterJoin(m1, bracket(m1.site_cd.eq(t.site_cd)));
		builder.addLeftOuterJoin(m2, bracket(m2.wg_cd.eq(t.wg_cd)));
		builder.addLeftOuterJoin(m3, bracket(m3.lg_grp_cd.eq(t.lg_grp_cd)));
		builder.addLeftOuterJoin(m4, bracket(m4.alloc_grp_cd.eq(t.alloc_grp_cd)));
		builder.addLeftOuterJoin(m5, bracket(m5.loc_grp_cd.eq(t.loc_grp_cd)));
		
		getDmndLoc_addSelectJoinWk(row, builder, t, result);
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}
	
	/**
	 * MSW_XXX_LL と結合する共通処理を保持するクラス。
	 *
	 * @param <T> メインのDBコンテナ
	 * @param <W> メインのDBコンテナに対応するMSW_XXX_LL のDBコンテナ
	 */
	protected class MSUAL_SelectJoinWk<T extends MCDBContainer, W extends MCDBContainer> {
		protected final MCRow _row;
		protected final MCQueryApiBuilder _builder;
		protected final Class<T> _t;
		protected final Class<W> _wk;
		
		MSUAL_SelectJoinWk(MCRow row, MCQueryApiBuilder builder, Class<T> t, Class<W> wk) {
			_row = row;
			_builder = builder;
			_t = t;
			_wk = wk;
		}
		
		/**
		 * MSW_XXX_LL と結合する共通処理
		 */
		protected void get_addSelectJoinWk() {
			MCRow row = _row;
			MCQueryApiBuilder builder = _builder;
			W wk_ll = createDbc(_wk);
			W w  = (W)createDbc(_wk);
			w.setAlias("W");
			
			// LLと結合するキーは1つの前提
			MCDBContainer t = builder.getBaseDbc();
			String tkeycol = t.getKeyColumn()[0];

			// ワークテーブルを作成＋結合
			MCList<W> sd = MCList.create(w);
			String delid = createSqlId("MS.MSUAL0030.get_addSelectJoinWk", wk_ll, "D01");
			execDbWkDelete(delid, wk_ll);

			MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(wk_ll);
			String insid = createSqlId("MS.MSUAL0030.get_addSelectJoinWk", wk_ll, "I01");
			insBuilder.setValuesAll();
			if (isSrvChk(row)) {
				String[] key = null;
				String[] tdlv_cd = null;
				String[] dlv_cd = null;
				String[] sls_dpt_cd = null;
				MCDate[] dt = null;
				String[] itm_cd = null;
				String[] itm_sub1 = null;
				String[] itm_sub2 = null;
				String[] itm_sub3 = null;
				boolean containDt = row.contains(getLLBindNm($i_dt()));
				boolean containTdlv = row.contains(getLLBindNm($i_tdlv_cd()));
				boolean containDlv = row.contains(getLLBindNm($i_dlv_cd()));
				boolean containSlsDpt = row.contains(getLLBindNm($i_dpt_cd()));
				boolean containItm = row.contains(getLLBindNm($i_itm_cd()));
				boolean containItmsub1 = row.contains(getLLBindNm($i_itm_sub1()));
				boolean containItmsub2 = row.contains(getLLBindNm($i_itm_sub2()));
				boolean containItmsub3 = row.contains(getLLBindNm($i_itm_sub3()));

				key = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
				// 配送先、または納品先が指定されている場合
				if (containTdlv) {
					tdlv_cd = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_tdlv_cd())));
				}
				else if (containDlv) {
					dlv_cd = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_dlv_cd())));
				}
				
				// 売上部門ＣＤと適用日が共に指定されている場合
				if ((containDt) && (containSlsDpt)) {
					dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm($i_dt())));
					sls_dpt_cd = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_dpt_cd())));
				}
				
				// 品目コードが指定されている場合
				if (containItm) {
					itm_cd = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_itm_cd())));
				}
				if (containItmsub1) {
					itm_sub1 = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_itm_sub1())));				
				}
				if (containItmsub2) {
					itm_sub2 = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_itm_sub2())));
				}
				if (containItmsub3) {
					itm_sub3 = (String[]) convDataArray(row.getStringNE(getLLBindNm($i_itm_sub3())));
				}
				
				for (int i = 0; i < key.length; i++) {
					W sr = createDbc(_wk);
					sr.setValue(tkeycol, key[i]);
					
					// 配送先、または納品先が指定されている場合
					if (containTdlv) {
						sr.setValue($i_tdlv_cd(), tdlv_cd[i]);
					}
					else if (containDlv) {
						sr.setValue($i_dlv_cd(), dlv_cd[i]);
					}

					// 売上部門ＣＤと適用日が共に指定されている場合
					if ((containDt) && (containSlsDpt)) {
						sr.setValue($i_dt(), dt[i]);
						sr.setValue($i_dpt_cd(), sls_dpt_cd[i]);
					}
			
					// 品目コードが指定されている場合
					if (containItm) {
						sr.setValue($i_itm_cd(), itm_cd[i]);
					}
					if (containItmsub1) {
						sr.setValue($i_itm_sub1(), itm_sub1[i]);
					}
					if (containItmsub2) {
						sr.setValue($i_itm_sub2(), itm_sub2[i]);
					}
					if (containItmsub3) {
						sr.setValue($i_itm_sub3(), itm_sub3[i]);
					}
					sd.add(sr);
				}
				dbInsert(insid, sd, insBuilder);

				// ワークテーブルと結合したSELECT句を追加
				builder.addSelect(w.getColumn$($i_dlv_cd())); // リストロジックチェックで使用
				builder.addSelect(w.getColumn$($i_tdlv_cd()));
				builder.addSelect(w.getColumn$($i_dpt_cd()));
				builder.addSelect(w.getColumn$($i_dt()));
				builder.addSelect(w.getColumn$($i_itm_cd())); 
				builder.addSelect(w.getColumn$($i_itm_sub1())); 
				builder.addSelect(w.getColumn$($i_itm_sub2()));
				builder.addSelect(w.getColumn$($i_itm_sub3()));
				
				builder.addInnerJoin(w, MCQueryApiBuilder.makeEq(
						w.getColumn$(tkeycol), t.getColumn$(tkeycol)));

			} else {
				W sr = createDbc(_wk);
				sr.setValue($i_dlv_cd(), row.getStringNE($i_dlv_cd()));
				sr.setValue($i_tdlv_cd(), row.getStringNE($i_tdlv_cd()));
				sr.setValue($i_dpt_cd(), row.getStringNE($i_dpt_cd()));
				sr.setValue($i_dt(), row.getDateNE($i_dt()));
				sr.setValue($i_itm_cd(), row.getStringNE($i_itm_cd()));
				sr.setValue($i_itm_sub1(), row.getStringNE($i_itm_sub1()));
				sr.setValue($i_itm_sub2(), row.getStringNE($i_itm_sub2()));
				sr.setValue($i_itm_sub3(), row.getStringNE($i_itm_sub3()));
				sd.add(sr);
				dbInsert(insid, sd, insBuilder);

				// ワークテーブルと結合したSELECT句を追加
				builder.addLeftOuterJoin(w, bracket( value(0).eq(value(0))));
			}
		}
		
		/** dt項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_base_dt */
		protected String $i_dt() {
			return SloLocCols.$i_base_dt;
		}

		/** tdlv_cd項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_tdlv_cd */
		protected String $i_tdlv_cd() {
			return SloLocCols.$i_tdlv_cd;
		}

		/** dlv_cd項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_dlv_cd */
		protected String $i_dlv_cd() {
			return SloLocCols.$i_dlv_cd;
		}

		/** dpt_cd項目を返す。W と リストロジック項目が同じ前提。 
		 * デフォルト：SloLocCols.$i_sls_dpt_cd */
		protected String $i_dpt_cd() {
			return SloLocCols.$i_sls_dpt_cd;
		}

		/** itm_cd項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_itm_cd */
		protected String $i_itm_cd() {
			return SloLocCols.$i_itm_cd;
		}

		/** itm_sub1項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_itm_sub1 */
		protected String $i_itm_sub1() {
			return SloLocCols.$i_itm_sub1;
		}

		/** itm_sub2項目を返す。W と リストロジック項目が同じ前提。
		 * デフォルト：SloLocCols.$i_itm_sub2 */
		protected String $i_itm_sub2() {
			return SloLocCols.$i_itm_sub2;
		}

		/** itm_sub3項目を返す。W と リストロジック項目が同じ前提。 
		 * デフォルト：SloLocCols.$i_itm_sub3 */
		protected String $i_itm_sub3() {
			return SloLocCols.$i_itm_sub3;
		}
	}
	
	protected void getDmndLoc_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder,
			MAM_LOC_R t, MCList<?> result) {
		new MSUAL_SelectJoinWk<MAM_LOC_R, MSW_DMND_LOC_LL_R>(row, builder,
				MAM_LOC_R.class, MSW_DMND_LOC_LL_R.class) {
			@Override
			protected String $i_dt() {
				return DmndLocCols.$i_dt;
			}
		}.get_addSelectJoinWk();
	}

	/**
	 * DmndLocについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param d　ＤＢコンテナ
	 */
	protected void getDmndLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）

//		// １．配送先がNOT NUULだったら配送先ＣＤに対応する物流グループを求める
//		//  配送先がNUULだったら納品先ＣＤに対応する物流グループを求める
//		//  納品先ＣＤがNULLだったら物流グループは使用せず、抽出する
//		// ２．売上部門ＣＤと基準日で、部門マスタからワーキンググループを求める
//		// ３．品目ＣＤ，枝番１～３で、品目マスタから品目出荷グループを求める
//		StringBuilder cnd = new StringBuilder();
//		cnd.append("AND (");
//		// 受注引当マスタに対して、場所ＣＤで抽出
//		cnd.append("EXISTS (SELECT 'X' FROM MAM_SLO_ALLOC M21 "
//				+ "WHERE T.LOC_CD = M21.LOC_CD "
//				+ "[AND (M21.TO_LG_GRP_CD = (SELECT lg_grp_cd FROM MAM_BP BP WHERE BP.bp_cd = NVL(W.tdlv_cd,W.dlv_cd)) OR M21.TO_LG_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND (M21.ITM_SHIP_GRP_CD = (SELECT itm_ship_grp_cd FROM MAM_ITM_ ITM WHERE ITM.itm_cd = W.itm_cd AND ITM.itm_sub1 = W.itm_sub1 AND ITM.itm_sub2 = W.itm_sub2 AND ITM.itm_sub3 = W.itm_sub3) OR M21.ITM_SHIP_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND M21.WG_CD = (SELECT wg_cd FROM MAM_DPT DPT WHERE DPT.dpt_cd = W.sls_dpt_cd AND (W.dt BETWEEN DPT.st_dt AND DPT.end_dt))]) ");
//		// 受注引当マスタに対して、物流グループＣＤで抽出
//		cnd.append("OR EXISTS (SELECT 'X' FROM MAM_SLO_ALLOC M21 "
//				+ "WHERE T.LG_GRP_CD = M21.LG_GRP_CD "
//				+ "[AND (M21.TO_LG_GRP_CD = (SELECT lg_grp_cd FROM MAM_BP BP WHERE BP.bp_cd = NVL(W.tdlv_cd,W.dlv_cd)) OR M21.TO_LG_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND (M21.ITM_SHIP_GRP_CD = (SELECT itm_ship_grp_cd FROM MAM_ITM_ ITM WHERE ITM.itm_cd = W.itm_cd AND ITM.itm_sub1 = W.itm_sub1 AND ITM.itm_sub2 = W.itm_sub2 AND ITM.itm_sub3 = W.itm_sub3) OR M21.ITM_SHIP_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND M21.WG_CD = (SELECT wg_cd FROM MAM_DPT DPT WHERE DPT.dpt_cd = W.sls_dpt_cd AND (W.dt BETWEEN DPT.st_dt AND DPT.end_dt))]) ");
//		// 受注引当マスタに対して、総量引当場所グループＣＤで抽出
//		cnd.append("OR EXISTS (SELECT 'X' FROM MAM_SLO_ALLOC M21 "
//				+ "WHERE T.ALLOC_GRP_CD = M21.ALLOC_GRP_CD "
//				+ "[AND (M21.TO_LG_GRP_CD = (SELECT lg_grp_cd FROM MAM_BP BP WHERE BP.bp_cd = NVL(W.tdlv_cd,W.dlv_cd)) OR M21.TO_LG_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND (M21.ITM_SHIP_GRP_CD = (SELECT itm_ship_grp_cd FROM MAM_ITM_ ITM WHERE ITM.itm_cd = W.itm_cd AND ITM.itm_sub1 = W.itm_sub1 AND ITM.itm_sub2 = W.itm_sub2 AND ITM.itm_sub3 = W.itm_sub3) OR M21.ITM_SHIP_GRP_CD = MAC_STR.NULL_VAL)] "
//				+ "[AND M21.WG_CD = (SELECT wg_cd FROM MAM_DPT DPT WHERE DPT.dpt_cd = W.sls_dpt_cd AND (W.dt BETWEEN DPT.st_dt AND DPT.end_dt))]) ");
//		cnd.append(")");
	}
	
	protected MCMessage getDmndLoc_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		String itmInfo = toDispItm(row.getStringNE(DmndLocCols.$i_itm_cd),
				row.getStringNE(DmndLocCols.$i_itm_sub1),
				row.getStringNE(DmndLocCols.$i_itm_sub2),
				row.getStringNE(DmndLocCols.$o_itm_sub3));

		MCMessage msg = new MCMessage(MSBBL0174, row.getStringNE(DmndLocCols.$i_dlv_cd),
				row.getStringNE(DmndLocCols.$i_tdlv_cd),
				row.getStringNE(DmndLocCols.$i_sls_dpt_cd),
				toYMDString(row.getDateNE(DmndLocCols.$i_dt)), itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- DmndLoc:需要場所 (END)

	// -- SloItm:受注品目 (START)
	public MCList<MCRow> getSloItm(MCRow row) {
		MCList<MCRow> list = new mcframe.serverMAUA.MAUAL0010.MAUAL_List().getItm(row);
		_remapSloItmValues(list);
		_setSloItmDefaultValues(row, list);

		return list;
	}

	protected void _remapSloItmValues(MCList<MCRow> list) {
		if (list == null || list.size() == 0) {
			return;
		}
		
		list.forEach(new java.util.function.Consumer<MCRow>() {
			@Override
			public void accept(MCRow r) {
				r.setNumberNE(SloItmCols.$o_itm_bill_crryovr_times, 
						r.getNumberNE(SloItmCols.$o_bill_crryovr_times));
				r.setNumberNE(SloItmCols.$o_bill_crryovr_times, null);
				
				r.setStringNE(SloItmCols.$o_def_ship_inst_typ, 
						r.getStringNE(SloItmCols.$o_ship_inst_typ));
				r.setStringNE(SloItmCols.$o_ship_inst_typ, null);
				r.setStringNE(SloItmCols.$o_def_ship_inst_typ_nm, 
						r.getStringNE("ship_inst_typ_nm"));
				r.setStringNE("ship_inst_typ_nm", null);
			}
		});
	}

	protected void _setSloItmDefaultValues(MCRow row, MCList<MCRow> list) {
		if (row.getStringNE($INPUT_VAL) == null 
				&& !row.getBooleanNE($COMBO_MODE)
				|| list == null) {
			return;
		}

		if (!row.getBooleanNE(SloItmCols.$i_from_slo_reg)) {
			return;
		}

		list.forEach(new Consumer<MCRow>() {
			@Override
			public void accept(MCRow down) {
				if (!_isItmFix(down)) {
					return;
				}

				_setSloItmDefaultValuesToRow(row, down);
			}
		});
	}

	protected boolean _isItmFix(MCRow down) {
		return (down.getStringNE(SloItmCols.$o_itm_cd) != null
				&& down.getStringNE(SloItmCols.$o_itm_sub1) != null
				&& down.getStringNE(SloItmCols.$o_itm_sub2) != null
				&& down.getStringNE(SloItmCols.$o_itm_sub3) != null);
	}

	protected void _setSloItmDefaultValuesToRow(MCRow row, MCRow down) {
		if (down.getStringNE(SloItmCols.$o_itm_cd) == null
				|| down.getStringNE(SloItmCols.$o_itm_sub1) == null
				|| down.getStringNE(SloItmCols.$o_itm_sub2) == null
				|| down.getStringNE(SloItmCols.$o_itm_sub3) == null) {

			return;
		}

		MAUAL_List logic = new MAUAL_List();
		MAUCL_ItmListLogic itmLogic = new MAUCL_ItmListLogic();
		MSUCL_SlsListLogic slsLogic = new MSUCL_SlsListLogic();

		_copyHdrToDtl(row, down);
		_setDefaultSlsUpriReqTyp(row, down);
		_setDefaultBillCrryovrTimes(row, down);
		// _setDefaultShipSchdSplitTyp(row, down); // setProcTypの後にする
		// _setDefaultTaxCd(row, down, logic, slsLogic); // _copyHdrToDtlShipRqstDtの後にする
		_setDefaultCostUpri(row, down);
		_setDefaultWtaxRate(row, down, itmLogic);
		_setDefaultGdCd(row, down);
		_setIvItmNm(row, down, itmLogic);
		_setCstItm(row, down);
		_setProcTyp(row, down);
		_setDefaultShipSchdSplitTyp(row, down);
		_setViaDlvTyp(row, down);

		// クライアントサイドのisEditable()はカラムの編集可否を書き換えるので、今、この判定を行っても正しい結果がとれない。
		// isEditable(columnDtl_dlv_day_week_typ_nm)が条件に使用しているproc_typとvia_dlv_typが確定するまでこの処理を遅延させる。
		_copyHdrToDtlDlvDayWeekTypNm(row, down);

		_setAllocTyp(row, down);
		_setShipInstTyp(row, down);

		// クライアントサイドのisEditable()はカラムの編集可否を書き換えるので、今、この判定を行っても正しい結果がとれない。
		// isEditable(columnDtl_dlv_rqst_dt)が条件に使用しているvia_dlv_typとship_inst_typが確定するまでこの処理を遅延させる。
		_copyHdrToDtlDlvRqstDt(row, down);

		// クライアントサイドのisEditable()はカラムの編集可否を書き換えるので、今、この判定を行っても正しい結果がとれない。
		// isEditable(columnDtl_ship_rqst_dt)が条件に使用しているvia_dlv_typ、proc_typ、ship_inst_typが確定するまでこの処理を遅延させる。
		_copyHdrToDtlShipRqstDt(row, down);

		// dlv_rqst_dtとship_rqst_dtが必要なのでここで処理する。
		_setDefaultTaxCd(row, down, logic, slsLogic);

		_setColByDscntItm(row, down, logic);
		_setCntryOrg(row, down, logic);
		_setShipTerm(row, down, logic);
		_setTrdUnit(row, down, logic); // 必ず_setColByDscntItmより後に実行する
	}

	protected void _copyHdrToDtl(MCRow up, MCRow down) {
		if (MAC_TRD_PTN_TYP.isSHIP(up.getStringNE(SloItmCols.$i_trd_ptn_typ))){
			down.setBooleanNE(SloItmCols.$o_vmi_flg, true);
			down.setNumberNE(SloItmCols.$o_trd_cur_upri, null);
			// down.setNumberNE(SloItmCols.$o_trd_cur_amt, null); // amtはupriがsetValueされたときに自動的に計算されるので、リストロジックでは設定しない。以下同様。
			down.setNumberNE(SloItmCols.$o_cost_upri, null);
			// down.setNumberNE(SloItmCols.$o_cost_amt, null);
			// down.setNumberNE(SloItmCols.$o_trd_cur_tax_amt, null);
			// down.setNumberNE(SloItmCols.$o_trd_cur_inc_tax_amt, null);
			// down.setNumberNE(SloItmCols.$o_trd_cur_dscnt_amt, null);
			down.setStringNE(SloItmCols.$o_dscnt_rsn_cd, null);
			down.setStringNE(SloItmCols.$o_dscnt_rsn_nm, null);
			down.setBooleanNE(SloItmCols.$o_sls_cststk_flg, false);
		}
		// MSBBP1210では上記条件を満たさないとき値はそのまま
		else {
			down.setBooleanNE(SloItmCols.$o_vmi_flg, up.getBooleanNE(SloItmCols.$i_vmi_flg));
			down.setNumberNE(SloItmCols.$o_trd_cur_upri, up.getNumberNE(SloItmCols.$i_trd_cur_upri));
			// down.setNumberNE(SloItmCols.$o_trd_cur_amt, up.getNumberNE(SloItmCols.$i_trd_cur_amt));
			down.setNumberNE(SloItmCols.$o_cost_upri, up.getNumberNE(SloItmCols.$i_cost_upri));
			// down.setNumberNE(SloItmCols.$o_cost_amt, up.getNumberNE(SloItmCols.$i_cost_amt));
			// down.setNumberNE(SloItmCols.$o_trd_cur_tax_amt, up.getNumberNE(SloItmCols.$i_trd_cur_tax_amt));
			// down.setNumberNE(SloItmCols.$o_trd_cur_inc_tax_amt, up.getNumberNE(SloItmCols.$i_trd_cur_inc_tax_amt));
			// down.setNumberNE(SloItmCols.$o_trd_cur_dscnt_amt, up.getNumberNE(SloItmCols.$i_trd_cur_dscnt_amt));
			down.setStringNE(SloItmCols.$o_dscnt_rsn_cd, up.getStringNE(SloItmCols.$i_dscnt_rsn_cd));
			down.setStringNE(SloItmCols.$o_dscnt_rsn_nm, up.getStringNE(SloItmCols.$i_dscnt_rsn_nm));
			down.setBooleanNE(SloItmCols.$o_sls_cststk_flg, up.getBooleanNE(SloItmCols.$i_sls_cststk_flg));
		}

		if (_isEditableDlvCd(up, down) && isNull(up.getString(SloItmCols.$i_dlv_cd))) {
			down.setStringNE(SloItmCols.$o_dlv_cd, up.getStringNE(SloItmCols.$i_hdr_dlv_cd));
			down.setStringNE(SloItmCols.$o_dlv_nm, up.getStringNE(SloItmCols.$i_hdr_dlv_nm));
			down.setBooleanNE(SloItmCols.$o_dlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_hdr_dlv_sundry_flg));
			down.setBooleanNE(SloItmCols.$o_pri_prnt_flg, up.getBooleanNE(SloItmCols.$i_hdr_pri_prnt_flg));
			down.setStringNE(SloItmCols.$o_dlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_hdr_dlv_lg_grp_cd));
			down.setStringNE(SloItmCols.$o_dlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_hdr_dlv_lg_grp_nm));
			down.setStringNE(SloItmCols.$o_dlv_cntry_cd, up.getStringNE(SloItmCols.$i_hdr_dlv_cntry_cd));
			down.setStringNE(SloItmCols.$o_dlv_cntry_nm, up.getStringNE(SloItmCols.$i_hdr_dlv_cntry_nm));
			down.setStringNE(SloItmCols.$o_dlv_zip_cd, up.getStringNE(SloItmCols.$i_hdr_dlv_zip_cd));
			down.setStringNE(SloItmCols.$o_dlv_addr1, up.getStringNE(SloItmCols.$i_hdr_dlv_addr1));
			down.setStringNE(SloItmCols.$o_dlv_addr2, up.getStringNE(SloItmCols.$i_hdr_dlv_addr2));
			down.setStringNE(SloItmCols.$o_dlv_addr3, up.getStringNE(SloItmCols.$i_hdr_dlv_addr3));
			down.setStringNE(SloItmCols.$o_dlv_addr4, up.getStringNE(SloItmCols.$i_hdr_dlv_addr4));
			down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_hdr_dlv_tel));
			down.setStringNE(SloItmCols.$o_dlv_fax, up.getStringNE(SloItmCols.$i_hdr_dlv_fax));
			down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_hdr_dlv_tel));
			down.setStringNE(SloItmCols.$o_dlv_cntct_dpt, up.getStringNE(SloItmCols.$i_hdr_dlv_cntct_dpt));
			down.setStringNE(SloItmCols.$o_dlv_cntct_psn, up.getStringNE(SloItmCols.$i_hdr_dlv_cntct_psn));
			down.setBooleanNE(SloItmCols.$o_tdlv_req_flg, up.getBooleanNE(SloItmCols.$i_hdr_tdlv_req_flg));
			down.setStringNE(SloItmCols.$o_prnt_lcl_cd, up.getStringNE(SloItmCols.$i_hdr_prnt_lcl_cd));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_dlv_cd, up.getStringNE(SloItmCols.$i_dlv_cd));
		// 	down.setStringNE(SloItmCols.$o_dlv_nm, up.getStringNE(SloItmCols.$i_dlv_nm));
		// 	down.setBooleanNE(SloItmCols.$o_dlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_dlv_sundry_flg));
		// 	down.setBooleanNE(SloItmCols.$o_pri_prnt_flg, up.getBooleanNE(SloItmCols.$i_pri_prnt_flg));
		// 	down.setStringNE(SloItmCols.$o_dlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_dlv_lg_grp_cd));
		// 	down.setStringNE(SloItmCols.$o_dlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_dlv_lg_grp_nm));
		// 	down.setStringNE(SloItmCols.$o_dlv_cntry_cd, up.getStringNE(SloItmCols.$i_dlv_cntry_cd));
		// 	down.setStringNE(SloItmCols.$o_dlv_cntry_nm, up.getStringNE(SloItmCols.$i_dlv_cntry_nm));
		// 	down.setStringNE(SloItmCols.$o_dlv_zip_cd, up.getStringNE(SloItmCols.$i_dlv_zip_cd));
		// 	down.setStringNE(SloItmCols.$o_dlv_addr1, up.getStringNE(SloItmCols.$i_dlv_addr1));
		// 	down.setStringNE(SloItmCols.$o_dlv_addr2, up.getStringNE(SloItmCols.$i_dlv_addr2));
		// 	down.setStringNE(SloItmCols.$o_dlv_addr3, up.getStringNE(SloItmCols.$i_dlv_addr3));
		// 	down.setStringNE(SloItmCols.$o_dlv_addr4, up.getStringNE(SloItmCols.$i_dlv_addr4));
		// 	down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_dlv_tel));
		// 	down.setStringNE(SloItmCols.$o_dlv_fax, up.getStringNE(SloItmCols.$i_dlv_fax));
		// 	down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_dlv_tel));
		// 	down.setStringNE(SloItmCols.$o_dlv_cntct_dpt, up.getStringNE(SloItmCols.$i_dlv_cntct_dpt));
		// 	down.setStringNE(SloItmCols.$o_dlv_cntct_psn, up.getStringNE(SloItmCols.$i_dlv_cntct_psn));
		// 	down.setBooleanNE(SloItmCols.$o_tdlv_req_flg, up.getBooleanNE(SloItmCols.$i_tdlv_req_flg));
		// 	down.setStringNE(SloItmCols.$o_prnt_lcl_cd, up.getStringNE(SloItmCols.$i_prnt_lcl_cd));
		// }
		else {
			down.setStringNE(SloItmCols.$o_dlv_cd, up.getStringNE(SloItmCols.$i_dlv_cd));
			down.setStringNE(SloItmCols.$o_dlv_nm, up.getStringNE(SloItmCols.$i_dlv_nm));
			down.setBooleanNE(SloItmCols.$o_dlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_dlv_sundry_flg));
			down.setBooleanNE(SloItmCols.$o_pri_prnt_flg, up.getBooleanNE(SloItmCols.$i_pri_prnt_flg));
			down.setStringNE(SloItmCols.$o_dlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_dlv_lg_grp_cd));
			down.setStringNE(SloItmCols.$o_dlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_dlv_lg_grp_nm));
			down.setStringNE(SloItmCols.$o_dlv_cntry_cd, up.getStringNE(SloItmCols.$i_dlv_cntry_cd));
			down.setStringNE(SloItmCols.$o_dlv_cntry_nm, up.getStringNE(SloItmCols.$i_dlv_cntry_nm));
			down.setStringNE(SloItmCols.$o_dlv_zip_cd, up.getStringNE(SloItmCols.$i_dlv_zip_cd));
			down.setStringNE(SloItmCols.$o_dlv_addr1, up.getStringNE(SloItmCols.$i_dlv_addr1));
			down.setStringNE(SloItmCols.$o_dlv_addr2, up.getStringNE(SloItmCols.$i_dlv_addr2));
			down.setStringNE(SloItmCols.$o_dlv_addr3, up.getStringNE(SloItmCols.$i_dlv_addr3));
			down.setStringNE(SloItmCols.$o_dlv_addr4, up.getStringNE(SloItmCols.$i_dlv_addr4));
			down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_dlv_tel));
			down.setStringNE(SloItmCols.$o_dlv_fax, up.getStringNE(SloItmCols.$i_dlv_fax));
			down.setStringNE(SloItmCols.$o_dlv_tel, up.getStringNE(SloItmCols.$i_dlv_tel));
			down.setStringNE(SloItmCols.$o_dlv_cntct_dpt, up.getStringNE(SloItmCols.$i_dlv_cntct_dpt));
			down.setStringNE(SloItmCols.$o_dlv_cntct_psn, up.getStringNE(SloItmCols.$i_dlv_cntct_psn));
			down.setBooleanNE(SloItmCols.$o_tdlv_req_flg, up.getBooleanNE(SloItmCols.$i_tdlv_req_flg));
			down.setStringNE(SloItmCols.$o_prnt_lcl_cd, up.getStringNE(SloItmCols.$i_prnt_lcl_cd));
		}

		if (_isEditableDestCd1(up, down) && isNull(up.getString(SloItmCols.$i_dest_cd1))) {
			down.setStringNE(SloItmCols.$o_dest_cd1, up.getStringNE(SloItmCols.$i_hdr_dest_cd1));
			down.setStringNE(SloItmCols.$o_dest_nm1, up.getStringNE(SloItmCols.$i_hdr_dest_nm1));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_dest_cd1, up.getStringNE(SloItmCols.$i_dest_cd1));
		// 	down.setStringNE(SloItmCols.$o_dest_nm1, up.getStringNE(SloItmCols.$i_dest_nm1));
		// }
		 else {
			down.setStringNE(SloItmCols.$o_dest_cd1, up.getStringNE(SloItmCols.$i_dest_cd1));
			down.setStringNE(SloItmCols.$o_dest_nm1, up.getStringNE(SloItmCols.$i_dest_nm1));
		}

		if (_isEditableDestCd2(up, down) && isNull(up.getString(SloItmCols.$i_dest_cd2))) {
			down.setStringNE(SloItmCols.$o_dest_cd2, up.getStringNE(SloItmCols.$i_hdr_dest_cd2));
			down.setStringNE(SloItmCols.$o_dest_nm2, up.getStringNE(SloItmCols.$i_hdr_dest_nm2));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_dest_cd2, up.getStringNE(SloItmCols.$i_dest_cd2));
		// 	down.setStringNE(SloItmCols.$o_dest_nm2, up.getStringNE(SloItmCols.$i_dest_nm2));
		// }
		else {
			down.setStringNE(SloItmCols.$o_dest_cd2, up.getStringNE(SloItmCols.$i_dest_cd2));
			down.setStringNE(SloItmCols.$o_dest_nm2, up.getStringNE(SloItmCols.$i_dest_nm2));
		}

		if (_isEditableDestCd3(up, down) && isNull(up.getString(SloItmCols.$i_dest_cd3))) {
			down.setStringNE(SloItmCols.$o_dest_cd3, up.getStringNE(SloItmCols.$i_hdr_dest_cd3));
			down.setStringNE(SloItmCols.$o_dest_nm3, up.getStringNE(SloItmCols.$i_hdr_dest_nm3));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_dest_cd3, up.getStringNE(SloItmCols.$i_dest_cd3));
		// 	down.setStringNE(SloItmCols.$o_dest_nm3, up.getStringNE(SloItmCols.$i_dest_nm3));
		// }
		else {
			down.setStringNE(SloItmCols.$o_dest_cd3, up.getStringNE(SloItmCols.$i_dest_cd3));
			down.setStringNE(SloItmCols.$o_dest_nm3, up.getStringNE(SloItmCols.$i_dest_nm3));
		}

		// _setViaDlvTyp(up, down); // setProcTypの後にする。setViaDlvTyp()の行ステータスの操作はクライアントサイドで行う。

		if (_isEditableTdlvCd(up, down) && isNull(up.getString(SloItmCols.$i_tdlv_cd))) {
			down.setStringNE(SloItmCols.$o_tdlv_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_cd));
			down.setBooleanNE(SloItmCols.$o_tdlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_hdr_tdlv_sundry_flg));
			down.setStringNE(SloItmCols.$o_tdlv_nm, up.getStringNE(SloItmCols.$i_hdr_tdlv_nm));
			down.setStringNE(SloItmCols.$o_tdlv_cntct_dpt, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntct_dpt));
			down.setStringNE(SloItmCols.$o_tdlv_cntct_psn, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntct_psn));
			down.setStringNE(SloItmCols.$o_tdlv_zip_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_zip_cd));
			down.setStringNE(SloItmCols.$o_tdlv_addr1, up.getStringNE(SloItmCols.$i_hdr_tdlv_addr1));
			down.setStringNE(SloItmCols.$o_tdlv_addr2, up.getStringNE(SloItmCols.$i_hdr_tdlv_addr2));
			down.setStringNE(SloItmCols.$o_tdlv_addr3, up.getStringNE(SloItmCols.$i_hdr_tdlv_addr3));
			down.setStringNE(SloItmCols.$o_tdlv_addr4, up.getStringNE(SloItmCols.$i_hdr_tdlv_addr4));
			down.setStringNE(SloItmCols.$o_tdlv_tel, up.getStringNE(SloItmCols.$i_hdr_tdlv_tel));
			down.setStringNE(SloItmCols.$o_tdlv_fax, up.getStringNE(SloItmCols.$i_hdr_tdlv_fax));
			down.setStringNE(SloItmCols.$o_tdlv_cntry_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntry_cd));
			down.setStringNE(SloItmCols.$o_tdlv_cntry_nm, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntry_nm));
			down.setStringNE(SloItmCols.$o_tdlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_lg_grp_cd));
			down.setStringNE(SloItmCols.$o_tdlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_hdr_tdlv_lg_grp_nm));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_tdlv_cd, up.getStringNE(SloItmCols.$i_tdlv_cd));
		// 	down.setBooleanNE(SloItmCols.$o_tdlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_tdlv_sundry_flg));
		// 	down.setStringNE(SloItmCols.$o_tdlv_nm, up.getStringNE(SloItmCols.$i_tdlv_nm));
		// 	down.setStringNE(SloItmCols.$o_tdlv_cntct_dpt, up.getStringNE(SloItmCols.$i_tdlv_cntct_dpt));
		// 	down.setStringNE(SloItmCols.$o_tdlv_cntct_psn, up.getStringNE(SloItmCols.$i_tdlv_cntct_psn));
		// 	down.setStringNE(SloItmCols.$o_tdlv_zip_cd, up.getStringNE(SloItmCols.$i_tdlv_zip_cd));
		// 	down.setStringNE(SloItmCols.$o_tdlv_addr1, up.getStringNE(SloItmCols.$i_tdlv_addr1));
		// 	down.setStringNE(SloItmCols.$o_tdlv_addr2, up.getStringNE(SloItmCols.$i_tdlv_addr2));
		// 	down.setStringNE(SloItmCols.$o_tdlv_addr3, up.getStringNE(SloItmCols.$i_tdlv_addr3));
		// 	down.setStringNE(SloItmCols.$o_tdlv_addr4, up.getStringNE(SloItmCols.$i_tdlv_addr4));
		// 	down.setStringNE(SloItmCols.$o_tdlv_tel, up.getStringNE(SloItmCols.$i_tdlv_tel));
		// 	down.setStringNE(SloItmCols.$o_tdlv_fax, up.getStringNE(SloItmCols.$i_tdlv_fax));
		// 	down.setStringNE(SloItmCols.$o_tdlv_cntry_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntry_cd));
		// 	down.setStringNE(SloItmCols.$o_tdlv_cntry_nm, up.getStringNE(SloItmCols.$i_hdr_tdlv_cntry_nm));
		// 	down.setStringNE(SloItmCols.$o_tdlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_hdr_tdlv_lg_grp_cd));
		// 	down.setStringNE(SloItmCols.$o_tdlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_hdr_tdlv_lg_grp_nm));
		// }
		else {
			down.setStringNE(SloItmCols.$o_tdlv_cd, up.getStringNE(SloItmCols.$i_tdlv_cd));
			down.setBooleanNE(SloItmCols.$o_tdlv_sundry_flg, up.getBooleanNE(SloItmCols.$i_tdlv_sundry_flg));
			down.setStringNE(SloItmCols.$o_tdlv_nm, up.getStringNE(SloItmCols.$i_tdlv_nm));
			down.setStringNE(SloItmCols.$o_tdlv_cntct_dpt, up.getStringNE(SloItmCols.$i_tdlv_cntct_dpt));
			down.setStringNE(SloItmCols.$o_tdlv_cntct_psn, up.getStringNE(SloItmCols.$i_tdlv_cntct_psn));
			down.setStringNE(SloItmCols.$o_tdlv_zip_cd, up.getStringNE(SloItmCols.$i_tdlv_zip_cd));
			down.setStringNE(SloItmCols.$o_tdlv_addr1, up.getStringNE(SloItmCols.$i_tdlv_addr1));
			down.setStringNE(SloItmCols.$o_tdlv_addr2, up.getStringNE(SloItmCols.$i_tdlv_addr2));
			down.setStringNE(SloItmCols.$o_tdlv_addr3, up.getStringNE(SloItmCols.$i_tdlv_addr3));
			down.setStringNE(SloItmCols.$o_tdlv_addr4, up.getStringNE(SloItmCols.$i_tdlv_addr4));
			down.setStringNE(SloItmCols.$o_tdlv_tel, up.getStringNE(SloItmCols.$i_tdlv_tel));
			down.setStringNE(SloItmCols.$o_tdlv_fax, up.getStringNE(SloItmCols.$i_tdlv_fax));
			down.setStringNE(SloItmCols.$o_tdlv_cntry_cd, up.getStringNE(SloItmCols.$i_tdlv_cntry_cd));
			down.setStringNE(SloItmCols.$o_tdlv_cntry_nm, up.getStringNE(SloItmCols.$i_tdlv_cntry_nm));
			down.setStringNE(SloItmCols.$o_tdlv_lg_grp_cd, up.getStringNE(SloItmCols.$i_tdlv_lg_grp_cd));
			down.setStringNE(SloItmCols.$o_tdlv_lg_grp_nm, up.getStringNE(SloItmCols.$i_tdlv_lg_grp_nm));
		}

		// この時点では判定に必要な値がそろわないので、後で実行する
		// if (_isEditableDlvDayWeekTypNm(up, down)) {
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ, up.getStringNE(SloItmCols.$i_hdr_dlv_day_week_typ));
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ_nm,up.getStringNE(SloItmCols.$i_hdr_dlv_day_week_typ_nm));
		// }
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ, up.getStringNE(SloItmCols.$i_dlv_day_week_typ));
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ_nm,up.getStringNE(SloItmCols.$i_dlv_day_week_typ_nm));
		// }

		// この時点では判定に必要な値がそろわないので、後で実行する
		// if (_isEditableDlvRqstDt(up, down)) {
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_dt, up.getDateNE(SloItmCols.$i_hdr_dlv_rqst_dt));
		// }
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_dt, up.getDateNE(SloItmCols.$i_dlv_rqst_dt));
		// }
		// 
		// if (_isEditableDlvRqstDt(up, down)) {
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_hm, up.getDateNE(SloItmCols.$i_hdr_dlv_rqst_hm));
		// }
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_hm, up.getDateNE(SloItmCols.$i_dlv_rqst_hm));
		// }

		// この時点では判定に必要な値がそろわないので、後で実行する
		// if (_isEditableShipRqstDt(up, down)) {
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_dt, up.getDateNE(SloItmCols.$i_hdr_ship_rqst_dt));
		// }
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_dt, up.getDateNE(SloItmCols.$i_ship_rqst_dt));
		// }
		// 
		// if (_isEditableShipRqstDt(up, down)) {
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_hm, up.getDateNE(SloItmCols.$i_hdr_ship_rqst_hm));
		// }
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_hm, up.getDateNE(SloItmCols.$i_ship_rqst_hm));
		// }
	}

	/**
	 * 
	 * @param up
	 * @param down
	 */
	protected void _copyHdrToDtlDlvDayWeekTypNm(MCRow up, MCRow down) {
		if (_isEditableDlvDayWeekTypNm(up, down) && isNull(up.getString(SloItmCols.$i_dlv_day_week_typ))) {
			down.setStringNE(SloItmCols.$o_dlv_day_week_typ, up.getStringNE(SloItmCols.$i_hdr_dlv_day_week_typ));
			down.setStringNE(SloItmCols.$o_dlv_day_week_typ_nm,up.getStringNE(SloItmCols.$i_hdr_dlv_day_week_typ_nm));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ, up.getStringNE(SloItmCols.$i_dlv_day_week_typ));
		// 	down.setStringNE(SloItmCols.$o_dlv_day_week_typ_nm,up.getStringNE(SloItmCols.$i_dlv_day_week_typ_nm));
		// }
		else {
			down.setStringNE(SloItmCols.$o_dlv_day_week_typ, up.getStringNE(SloItmCols.$i_dlv_day_week_typ));
			down.setStringNE(SloItmCols.$o_dlv_day_week_typ_nm, up.getStringNE(SloItmCols.$i_dlv_day_week_typ_nm));
		}
	}

	/**
	 * 
	 * @param up
	 * @param down
	 */
	protected void _copyHdrToDtlDlvRqstDt(MCRow up, MCRow down) {
		if (_isEditableDlvRqstDt(up, down) && isNull(up.getDateNE(SloItmCols.$i_dlv_rqst_dt))) {
			down.setDateNE(SloItmCols.$o_dlv_rqst_dt, up.getDateNE(SloItmCols.$i_hdr_dlv_rqst_dt));
			down.setDateNE(SloItmCols.$o_dlv_rqst_hm, up.getDateNE(SloItmCols.$i_hdr_dlv_rqst_hm));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_dt, up.getDateNE(SloItmCols.$i_dlv_rqst_dt));
		// 	down.setDateNE(SloItmCols.$o_dlv_rqst_hm, up.getDateNE(SloItmCols.$i_dlv_rqst_hm));
		// }
		else {
			down.setDateNE(SloItmCols.$o_dlv_rqst_dt, up.getDateNE(SloItmCols.$i_dlv_rqst_dt));
			down.setDateNE(SloItmCols.$o_dlv_rqst_hm, up.getDateNE(SloItmCols.$i_dlv_rqst_hm));
		}
	}

	/**
	 * 
	 * @param up
	 * @param down
	 */
	protected void _copyHdrToDtlShipRqstDt(MCRow up, MCRow down) {
		if (_isEditableShipRqstDt(up, down) && isNull(up.getDateNE(SloItmCols.$i_ship_rqst_dt))) {
			down.setDateNE(SloItmCols.$o_ship_rqst_dt, up.getDateNE(SloItmCols.$i_hdr_ship_rqst_dt));
			down.setDateNE(SloItmCols.$o_ship_rqst_hm, up.getDateNE(SloItmCols.$i_hdr_ship_rqst_hm));
		}
		// 編集不可の場合は何もしない
		// else {
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_dt, up.getDateNE(SloItmCols.$i_ship_rqst_dt));
		// 	down.setDateNE(SloItmCols.$o_ship_rqst_hm, up.getDateNE(SloItmCols.$i_ship_rqst_hm));
		// }
		else {
			down.setDateNE(SloItmCols.$o_ship_rqst_dt, up.getDateNE(SloItmCols.$i_ship_rqst_dt));
			down.setDateNE(SloItmCols.$o_ship_rqst_hm, up.getDateNE(SloItmCols.$i_ship_rqst_hm));
		}
	}

	protected boolean _isEditableDlvCd(MCRow up, MCRow down) {
		boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dlv_cd);
		return editable;
	}

	protected boolean _isEditableTdlvCd(MCRow up, MCRow down) {
		boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_tdlv_cd);
		return editable;
	}

	protected boolean _isEditableDestCd1(MCRow up, MCRow down) {
		boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dest_cd1);
		return editable;
	}

	/**
	 * isEditable()による判定は受動的な現在のステータスの確認にとどまらず、CellConfigを用いたモード変更を伴う。
	 * 
	 * MSBBP1210.MSBBP_SloRegでisEditable(columnDtl_dest_cd2, index)をコールしたときに呼び出される
	 * DtlCellConfig.getPriorMode()のdest_cd2に関するコードブロックと同等の処理
	 * @param up
	 * @param down
	 * @return
	 */
	protected boolean _isEditableDestCd2(MCRow up, MCRow down) {
		// 値が変わると編集可否も動的に変化するので、元の編集可否は判断に使わない
		// boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dest_cd2);
		boolean readonly = isNull(down.getStringNE(SloItmCols.$o_dest_cd1));
		return !readonly;
	}

	/**
	 * isEditable()による判定は受動的な現在のステータスの確認にとどまらず、CellConfigを用いたモード変更を伴う。
	 * 
	 * MSBBP1210.MSBBP_SloRegでisEditable(columnDtl_dest_cd3, index)をコールしたときに呼び出される
	 * DtlCellConfig.getPriorMode()のdest_cd3に関するコードブロックと同等の処理
	 * @param up
	 * @param down
	 * @return
	 */
	protected boolean _isEditableDestCd3(MCRow up, MCRow down) {
		// 値が変わると編集可否も動的に変化するので、元の編集可否は判断に使わない
		// boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dest_cd3);
		boolean readonly = isNull(down.getStringNE(SloItmCols.$o_dest_cd2));
		return !readonly;
	}

	/**
	 * isEditable()による判定は受動的な現在のステータスの確認にとどまらず、CellConfigを用いたモード変更を伴う。
	 * 
	 * MSBBP1210.MSBBP_SloRegでisEditable(columnDtl_dlv_day_week_typ, index)をコールしたときに呼び出される
	 * DtlCellConfig.getPriorMode()のdlv_day_week_typに関するコードブロックと同等の処理
	 * @param up
	 * @param down
	 * @return
	 */
	protected boolean _isEditableDlvDayWeekTypNm(MCRow up, MCRow down) {
		// 値が変わると編集可否も動的に変化するので、元の編集可否は判断に使わない
		// boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dlv_day_week_typ_nm);

		// 注意：copyHdrToDtlの時点ではo_proc_typの演算が完了していない。
		boolean readonly = MAC_SLO_PROC_TYP.isPURC_DDLV(down.getStringNE(SloItmCols.$o_proc_typ)) 
				|| MAC_VIA_DLV_TYP.isVIA(down.getStringNE(SloItmCols.$o_via_dlv_typ));
		return !readonly;
	}

	/**
	 * isEditable()による判定は受動的な現在のステータスの確認にとどまらず、CellConfigを用いたモード変更を伴う。
	 * 
	 * MSBBP1210.MSBBP_SloRegでisEditable(columnDtl_ship_rqst_dt, index)をコールしたときに呼び出される
	 * DtlCellConfig.getPriorMode()のship_rqst_dtに関するコードブロックと同等の処理
	 * @param up
	 * @param down
	 * @return
	 */
	protected boolean _isEditableShipRqstDt(MCRow up, MCRow down) {
		// 値が変わると編集可否も動的に変化するので、元の編集可否は判断に使わない
		// boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_ship_rqst_dt);

		// 注意：copyHdrToDtlの時点ではo_proc_typの演算が完了していない。
		// 注意：copyHdrToDtlの時点ではo_ship_inst_typの演算が完了していない。
		boolean readonly = MAC_SLO_PROC_TYP.isPURC_DDLV(down.getStringNE(SloItmCols.$o_proc_typ))
				|| MAC_SHIP_INST_TYP.isNO_PICK(down.getStringNE(SloItmCols.$o_ship_inst_typ))
				|| !isNull(down.getDateNE(SloItmCols.$o_dlv_rqst_dt))
				&& (!up.getBooleanNE(SloItmCols.$i_cst_iv_flg)
						|| !MAC_VIA_DLV_TYP.isVIA(down.getStringNE(SloItmCols.$o_via_dlv_typ)));
		return !readonly;
	}

	/**
	 * isEditable()による判定は受動的な現在のステータスの確認にとどまらず、CellConfigを用いたモード変更を伴う。
	 * 
	 * MSBBP1210.MSBBP_SloRegでisEditable(columnDtl_dlv_rqst_dt, index)をコールしたときに呼び出される
	 * DtlCellConfig.getPriorMode()のdlv_rqst_dtに関するコードブロックと同等の処理
	 * @param up
	 * @param down
	 * @return
	 */
	protected boolean _isEditableDlvRqstDt(MCRow up, MCRow down) {
		// 値が変わると編集可否も動的に変化するので、元の編集可否は判断に使わない
		// boolean editable = up.getBooleanNE(SloItmCols.$i_is_editable_dlv_rqst_dt);

		// 注意：copyHdrToDtlの時点ではo_ship_inst_typの演算が完了していない。
		boolean readonly = (MAC_SHIP_INST_TYP.isNO_PICK(down.getStringNE(SloItmCols.$o_ship_inst_typ))
				|| !isNull(down.getDateNE(SloItmCols.$o_ship_rqst_dt)))
				&& (!up.getBooleanNE(SloItmCols.$i_cst_iv_flg)
						|| !MAC_VIA_DLV_TYP.isVIA(down.getStringNE(SloItmCols.$o_via_dlv_typ)));
		return !readonly;
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setViaDlvTyp()と同等の処理
	 * 行ステータスの操作はクライアントサイドで行う
	 * @param up
	 * @param down
	 */
	protected void _setViaDlvTyp(MCRow up, MCRow down) {
		if (!up.getBooleanNE(SloItmCols.$i_cst_iv_flg) 
				|| MAC_SLO_PROC_TYP.isPURC_DDLV(down.getStringNE(SloItmCols.$o_proc_typ))) {
			down.setStringNE(SloItmCols.$o_via_dlv_typ, MAC_VIA_DLV_TYP.NOT_VIA.value());
			down.setStringNE(SloItmCols.$o_via_dlv_typ_nm, null);
			MAC_VIA_DLV_TYP.putNameNE(down, SloItmCols.$o_via_dlv_typ, SloItmCols.$o_via_dlv_typ_nm);
		}
		else {
			// 行ステータスの変更はクライアントサイドで行う
			// if (dtlR.isStatusNone() && !isSame(dtlR.via_dlv_typ(), viaDlvtyp)) {
			// 	dtlR.setStatus(MCRow.Status.MODIFY);
			// }
			if (!isNull(up.getString(SloItmCols.$i_via_dlv_typ))) {
				down.setStringNE(SloItmCols.$o_via_dlv_typ, up.getStringNE(SloItmCols.$i_via_dlv_typ));
				down.setStringNE(SloItmCols.$o_via_dlv_typ_nm, up.getStringNE(SloItmCols.$i_via_dlv_typ_nm));
			}
			else {
				down.setStringNE(SloItmCols.$o_via_dlv_typ, up.getStringNE(SloItmCols.$i_hdr_via_dlv_typ));
				down.setStringNE(SloItmCols.$o_via_dlv_typ_nm, up.getStringNE(SloItmCols.$i_hdr_via_dlv_typ_nm));
			}
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultSlsUpriReqTyp()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setDefaultSlsUpriReqTyp(MCRow up, MCRow down) {
		if (MAC_TRD_PTN_TYP.isSLS(up.getStringNE(SloItmCols.$i_trd_ptn_typ)) 
				&& !isNull(up.getStringNE(SloItmCols.$i_bp_cd))) {
			down.setStringNE(SloItmCols.$o_sls_upri_req_typ, 
					nvl(up.getStringNE(SloItmCols.$i_hdr_sls_upri_req_typ), getCo().sls_upri_req_typ()));
		}
		// MSBBP1210では上記条件を満たさないとき値はそのまま
		else {
			down.setStringNE(SloItmCols.$o_sls_upri_req_typ, 
					up.getStringNE(SloItmCols.$i_sls_upri_req_typ));
		}
		// MA.MAUAP0010.SlsBasisTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultBillCrryovrTimes()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setDefaultBillCrryovrTimes(MCRow up, MCRow down) {
		if (MAC_TRD_PTN_TYP.isSLS(up.getStringNE(SloItmCols.$i_trd_ptn_typ)) 
				&& !isNull(up.getStringNE(SloItmCols.$i_bp_cd))) {
			down.setNumberNE(SloItmCols.$o_bill_crryovr_times, 
					nvl(down.getNumberNE(SloItmCols.$o_itm_bill_crryovr_times), // 注意：この値はMA.MAUAL0010.Itm(_remapSloItmValues)で事前に設定
							up.getNumberNE(SloItmCols.$i_cst_bill_crryovr_times)));
		}
		// MSBBP1210では上記条件を満たさないとき値はそのまま
		else {
			down.setNumberNE(SloItmCols.$o_bill_crryovr_times, 
					up.getNumberNE(SloItmCols.$i_bill_crryovr_times));
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.isIvNoNotNull()と同等の処理
	 * @param up
	 * @param down
	 */
	protected boolean _isIvNoNotNull(MCRow up, MCRow down) {
		return !isNull(up.getStringNE(SloItmCols.$i_iv_no)) || up.getBooleanNE(SloItmCols.$i_iv_num_flg);
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultShipSchdSplitTyp()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setDefaultShipSchdSplitTyp(MCRow up, MCRow down) {
		if (!isNull(up.getStringNE(SloItmCols.$i_bp_cd))) {
			if (MAC_STK_MNG_TYP.isMNG(down.getStringNE(SloItmCols.$o_stk_mng_typ))) {
				if (_isIvNoNotNull(up, down) 
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(down.getStringNE(SloItmCols.$o_proc_typ)) // 注意：この値はsetProcTyp()で事前に設定
						|| MSC_SHIP_ASSORT_TYP.isAST(up.getStringNE(SloItmCols.$i_assort_typ))
						|| !isNull(up.getNumberNE(SloItmCols.$i_set_itm_grp_no))) {
					down.setStringNE(SloItmCols.$o_ship_schd_split_typ, 
							MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
				}
				else {
					down.setStringNE(SloItmCols.$o_ship_schd_split_typ, 
							nvl(up.getStringNE(SloItmCols.$i_hdr_ship_schd_split_typ), 
									getCo().ship_schd_split_typ()));
				}
			}
			else if (MAC_STK_MNG_TYP.isNOT_MNG(down.getStringNE(SloItmCols.$o_stk_mng_typ))) {
				down.setStringNE(SloItmCols.$o_ship_schd_split_typ, MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
			}
		}
		else {
			down.setStringNE(SloItmCols.$o_ship_schd_split_typ, 
					up.getStringNE(SloItmCols.$i_ship_schd_split_typ));
		}
		// MA.MAUAP0010.ShipSchdSplitTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultTaxCd()と同等の処理
	 * @param up
	 * @param down
	 * @param slsLogic
	 */
	protected void _setDefaultTaxCd(MCRow up, MCRow down, 
			MAUAL_List logic, MSUCL_SlsListLogic slsLogic) {
		if (MAC_TRD_PTN_TYP.isSLS(up.getStringNE(SloItmCols.$i_trd_ptn_typ)) 
				&& !isNull(up.getStringNE(SloItmCols.$i_bp_cd))) {

			if (down.getBooleanNE(SloItmCols.$o_vmi_flg)) { // この値はcopyHdrToDtl()で事前に設定
				// 無効になるので設定の必要がなくなる
				// // MSBBP1210では上記条件を満たさないとき値はそのまま
				// down.setStringNE(SloItmCols.$o_tax_cd, up.getStringNE(SloItmCols.$i_tax_cd));
				// // MA.MAUAP0010.SlsTaxも肩代わり
				// down.setStringNE(SloItmCols.$o_tax_nm, up.getStringNE(SloItmCols.$i_tax_nm));
				// down.setNumberNE(SloItmCols.$o_tax_rate, up.getNumberNE(SloItmCols.$i_tax_rate));
				// down.setStringNE(SloItmCols.$o_tax_typ, up.getStringNE(SloItmCols.$i_tax_typ));
				// down.setBooleanNE(SloItmCols.$o_inc_tax_flg, up.getBooleanNE(SloItmCols.$i_inc_tax_flg));
				return;
			}

			MCRow upSlsTaxCd = MCRow.create();
			upSlsTaxCd.addStringColumn("itm_cd", down.getStringNE(SloItmCols.$o_itm_cd));
			upSlsTaxCd.addStringColumn("itm_sub1", down.getStringNE(SloItmCols.$o_itm_sub1));
			upSlsTaxCd.addStringColumn("itm_sub2", down.getStringNE(SloItmCols.$o_itm_sub2));
			upSlsTaxCd.addStringColumn("itm_sub3", down.getStringNE(SloItmCols.$o_itm_sub3));
			upSlsTaxCd.addStringColumn("cst_cd", up.getStringNE(SloItmCols.$i_bp_cd));
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(up.getStringNE(SloItmCols.$i_sls_basis_typ))) {
				upSlsTaxCd.addDateColumn("base_dt", nvl(up.getDateNE(SloItmCols.$i_sls_schd_dt),
						nvl(down.getDateNE(SloItmCols.$o_ship_rqst_dt), // 注意：この値はcopyHdrToDtl()で事前に設定
								up.getDateNE(SloItmCols.$i_dt))));
			}
			else if (MAC_SLS_BASIS_TYP.isIN_BASIS(up.getStringNE(SloItmCols.$i_sls_basis_typ)) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(up.getStringNE(SloItmCols.$i_sls_basis_typ))) {
				upSlsTaxCd.addDateColumn("base_dt", nvl(up.getDateNE(SloItmCols.$i_sls_schd_dt),
						nvl(down.getDateNE(SloItmCols.$o_dlv_rqst_dt), // 注意：この値はcopyHdrToDtl()で事前に設定
								up.getDateNE(SloItmCols.$i_dt))));
			}
			else {
				return;
			}
			MCRow downSlsTaxCd = slsLogic._getSlsTaxCd(upSlsTaxCd);
			String taxCd = downSlsTaxCd.getStringNE("tax_cd");
			down.setStringNE(SloItmCols.$o_tax_cd, taxCd);
			
			// MA.MAUAP0010.SlsTaxも肩代わり
			_setTax(up, down, logic);
		}
		// 無効になるので設定の必要がなくなる
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setStringNE(SloItmCols.$o_tax_cd, up.getStringNE(SloItmCols.$i_tax_cd));
		// 	// MA.MAUAP0010.SlsTaxも肩代わり
		// 	down.setStringNE(SloItmCols.$o_tax_nm, up.getStringNE(SloItmCols.$i_tax_nm));
		// 	down.setNumberNE(SloItmCols.$o_tax_rate, up.getNumberNE(SloItmCols.$i_tax_rate));
		// 	down.setStringNE(SloItmCols.$o_tax_typ, up.getStringNE(SloItmCols.$i_tax_typ));
		// 	down.setBooleanNE(SloItmCols.$o_inc_tax_flg, up.getBooleanNE(SloItmCols.$i_inc_tax_flg));
		// }
	}

	/**
	 * MA.MAUAP0010.SlsTaxと同等の処理
	 * @param up
	 * @param down
	 * @param logic
	 */
	protected void _setTax(MCRow up, MCRow down, MAUAL_List logic) {
		String taxCd = down.getStringNE(SloItmCols.$o_tax_cd);

		if (taxCd == null) {
			return;
		}

		MCRow upSlsTax = MCRow.create();
		upSlsTax.addStringColumn($INPUT_VAL, taxCd);
		MCList<MCRow> downSlsTax = logic.getSlsTax(upSlsTax);
		if (downSlsTax == null) {
			return;
		}

		downSlsTax.forEach(new Consumer<MCRow>() {
			@Override
			public void accept(MCRow r) {
				if (taxCd.equals(r.getStringNE("tax_cd"))) {
					down.setStringNE(SloItmCols.$o_tax_nm, r.getStringNE("tax_nm"));
					down.setNumberNE(SloItmCols.$o_tax_rate, r.getNumberNE("tax_rate"));
					down.setStringNE(SloItmCols.$o_tax_typ, r.getStringNE("tax_typ"));
					down.setBooleanNE(SloItmCols.$o_inc_tax_flg, r.getBoolean("inc_tax_flg"));
				}
			}
		});
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultCostUpri()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setDefaultCostUpri(MCRow up, MCRow down) {
		if (MAC_TRD_PTN_TYP.isSLS(up.getStringNE(SloItmCols.$i_trd_ptn_typ))) {
			MCNumber stdCost = mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil.getStdCost(
					down.getStringNE(SloItmCols.$o_itm_cd), 
					down.getStringNE(SloItmCols.$o_itm_sub1),
					down.getStringNE(SloItmCols.$o_itm_sub2),
					down.getStringNE(SloItmCols.$o_itm_sub3),
					up.getDateNE(SloItmCols.$i_dt),
					up.getStringNE(SloItmCols.$i_hdr_wg_cd),
					getCo().gm_std_upri_typ()
			);
			down.setNumberNE(SloItmCols.$o_cost_upri, stdCost);
		}
		// 品目が変わっているのでいったん値をクリア
		// // MSBBP1210では上記条件を満たさないとき値はそのまま
		// else {
		// 	down.setNumberNE(SloItmCols.$o_cost_upri, up.getNumberNE(SloItmCols.$i_cost_upri));
		// }
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.isWtaxRateEditable()と同等の処理
	 * @param up
	 * @param down
	 * @param itmLogic
	 */
	protected boolean _isWtaxRateEditable(MCRow up) {
		String trdCurCd = up.getStringNE(SloItmCols.$i_trd_cur_cd);
		String baseCurCd = up.getStringNE(SloItmCols.$i_base_cur_cd);
		String ptaxCurCd = up.getStringNE(SloItmCols.$i_ptax_cur_cd);
		if (!isNull(trdCurCd)
				&& isSame(trdCurCd, baseCurCd)
				&& (isSame(trdCurCd, ptaxCurCd) || isNull(ptaxCurCd))) {
			return true;
		}
		return false;
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultWtaxRate()と同等の処理
	 * @param up
	 * @param down
	 * @param itmLogic
	 */
	protected void _setDefaultWtaxRate(MCRow up, MCRow down, MAUCL_ItmListLogic itmLogic) {
		if (MAC_TRD_PTN_TYP.isSLS(up.getStringNE(SloItmCols.$i_trd_ptn_typ))
				&& _isWtaxRateEditable(up)
				// && Dtl_itm_p_PPanel.isItmFixLight(index)
				&& !isNull(up.getDateNE(SloItmCols.$i_dt))) {
			MCRow upWtaxRate = MCRow.create();
			upWtaxRate.addStringColumn("itm_cd", down.getStringNE(SloItmCols.$o_itm_cd));
			upWtaxRate.addStringColumn("itm_sub1", down.getStringNE(SloItmCols.$o_itm_sub1));
			upWtaxRate.addStringColumn("itm_sub2", down.getStringNE(SloItmCols.$o_itm_sub2));
			upWtaxRate.addStringColumn("itm_sub3", down.getStringNE(SloItmCols.$o_itm_sub3));
			upWtaxRate.addDateColumn("dt", up.getDateNE(SloItmCols.$i_dt));
			MCRow downWtaxRate = itmLogic._getWtaxRate(upWtaxRate);
			down.setNumberNE(SloItmCols.$o_wtax_rate, downWtaxRate.getNumberNE("wtax_rate"));
		}
		else {
			down.setNumberNE(SloItmCols.$o_wtax_rate, null);
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setDefaultGdCd()と同等の処理
	 * @param up
	 * @param down
	 * @param itmLogic
	 */
	protected void _setDefaultGdCd(MCRow up, MCRow down) {
		if (MAC_STK_MNG_TYP.isMNG(down.getStringNE(SloItmCols.$o_stk_mng_typ))) { // 注意：この値はMA.MAUAL0010.Itmが事前に設定
			down.setStringNE(SloItmCols.$o_gd_cd, getDefaultFeedStkGd().gd_cd());
			// MS.MSUAP0030.CstSloStkGdも肩代わり
			down.setStringNE(SloItmCols.$o_gd_nm, getDefaultFeedStkGd().gd_nm());
		}
		else {
			down.setStringNE(SloItmCols.$o_gd_cd, null);
			// MS.MSUAP0030.CstSloStkGdも肩代わり
			down.setStringNE(SloItmCols.$o_gd_nm, null);
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setIvItmNm()と同等の処理
	 * @param up
	 * @param down
	 * @param itmLogic
	 */
	protected void _setIvItmNm(MCRow up, MCRow down, MAUCL_ItmListLogic itmLogic) {
		if (!up.getBooleanNE(SloItmCols.$i_cst_iv_flg)) {
			down.setStringNE(SloItmCols.$o_iv_itm_nm, null);
		}
		else {
			MCRow upIvItm = MCRow.create();
			upIvItm.addStringColumn("lcl_cd", down.getStringNE(SloItmCols.$o_prnt_lcl_cd)); // 注意：この値はcopyHdrToDtlが事前に設定
			upIvItm.addStringColumn("itm_cd", down.getStringNE(SloItmCols.$o_itm_cd));
			upIvItm.addStringColumn("itm_sub1", down.getStringNE(SloItmCols.$o_itm_sub1));
			upIvItm.addStringColumn("itm_sub2", down.getStringNE(SloItmCols.$o_itm_sub2));
			upIvItm.addStringColumn("itm_sub3", down.getStringNE(SloItmCols.$o_itm_sub3));
			MCRow downIvItm = itmLogic._getItmLcl(upIvItm);
			// DOWN電文が取得できない場合は値をなにも設定しない（MSBBP_SloRegのsetIvItmNm()に準じた処理）
			if (downIvItm != null) {
				String itmNm = downIvItm.getStringNE("itm_nm");
				// DOWN電文が取得できていて、ロケールの品名がブランクのときだけ、品目マスタの名称を設定する処理をする（MSBBP_SloRegのsetIvItmNm()に準じた処理）
				if (itmNm == null || itmNm.equals("")) {
					down.setStringNE(SloItmCols.$o_iv_itm_nm, down.getStringNE(SloItmCols.$o_itm_nm));
				}
				else {
					down.setStringNE(SloItmCols.$o_iv_itm_nm, itmNm);
				}
			}
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setCstItm()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setCstItm(MCRow up, MCRow down) {
		MCRow upCstItm = MCRow.create();
		upCstItm.addStringColumn("itm_cd", down.getStringNE(SloItmCols.$o_itm_cd));
		upCstItm.addStringColumn("itm_sub1", down.getStringNE(SloItmCols.$o_itm_sub1));
		upCstItm.addStringColumn("itm_sub2", down.getStringNE(SloItmCols.$o_itm_sub2));
		upCstItm.addStringColumn("itm_sub3", down.getStringNE(SloItmCols.$o_itm_sub3));
		upCstItm.addDateColumn("dt", up.getDateNE(SloItmCols.$i_dt));
		upCstItm.addStringColumn("bp_cd", up.getStringNE(SloItmCols.$i_bp_cd));
		MCRow downCstItm = _getBpItm(upCstItm);
		if (isNull(downCstItm)) {
			down.setStringNE(SloItmCols.$o_bp_itm_cd, null);
			down.setStringNE(SloItmCols.$o_bp_itm_nm, null);
		}
		else {
			down.setStringNE(SloItmCols.$o_bp_itm_cd, downCstItm.getStringNE("bp_itm_cd"));
			down.setStringNE(SloItmCols.$o_bp_itm_nm, downCstItm.getStringNE("bp_itm_nm"));
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setProcTyp()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setProcTyp(MCRow up, MCRow down) {
		String stkMngTyp = down.getStringNE(SloItmCols.$o_stk_mng_typ); // 注意：この値はMA.MAUAL0010.Itmが事前に設定
		String sloProcTyp = down.getStringNE(SloItmCols.$o_slo_proc_typ); // 注意：この値はMA.MAUAL0010.Itmが事前に設定
		String procTyp = null;

		if (!_isIvNoNotNull(up, down) || !MAC_SLO_PROC_TYP.isPURC_DDLV(sloProcTyp)) {
			procTyp = sloProcTyp;
		}

		if (!down.getBooleanNE(SloItmCols.$o_slo_proc_flg)) { // 注意：この値はMA.MAUAL0010.Itmが事前に取得
			if (MAC_STK_MNG_TYP.isMNG(stkMngTyp)) {
				procTyp = MAC_SLO_PROC_TYP.ALLOC.value();
			}
			else if (MAC_STK_MNG_TYP.isNOT_MNG(stkMngTyp)) {
				procTyp = null;
			}
		}

		down.setStringNE(SloItmCols.$o_proc_typ, procTyp);
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setAllocTyp()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setAllocTyp(MCRow up, MCRow down) {
		String stkMngTyp = down.getStringNE(SloItmCols.$o_stk_mng_typ); // 注意：この値は、MA.MAUAL0010.Itmが事前に設定
		
		if (MAC_STK_MNG_TYP.isNOT_MNG(stkMngTyp)) {
			down.setStringNE(SloItmCols.$o_alloc_scope_typ, null);
			down.setStringNE(SloItmCols.$o_alloc_typ, null);
			// MA.MAUAP0010.AllocScopeTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
			// MA.MAUAP0010.AllocTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
		}
		// MSBBP1210では上記条件を満たさないとき値はそのまま
		else {
			down.setStringNE(SloItmCols.$o_alloc_scope_typ, up.getStringNE(SloItmCols.$i_alloc_scope_typ));
			down.setStringNE(SloItmCols.$o_alloc_typ, up.getStringNE(SloItmCols.$i_alloc_typ));
			// MA.MAUAP0010.AllocScopeTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
			// MA.MAUAP0010.AllocTypは定数定義のクライアントロジックなのでこのリストロジックにはマージしない
		}
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setShipInstTyp()と同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setShipInstTyp(MCRow up, MCRow down) {
		down.setStringNE(SloItmCols.$o_ship_inst_typ, 
				down.getStringNE(SloItmCols.$o_def_ship_inst_typ)); // この値はMA.MAUAL0010.Itmで事前に設定
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setColByDscntItm()と同等の処理
	 * 注意：必ず_setTrdUnit()より前に実行する。
	 * @param up
	 * @param down
	 */
	protected void _setColByDscntItm(MCRow up, MCRow down, MAUAL_List logic) {
		if (down.getBooleanNE(SloItmCols.$o_dscnt_itm_flg)) { // 注意：この値はMA.MAUAL0010.Itmで事前に設定済
			down.setStringNE(SloItmCols.$o_ship_unit_cd,
					down.getStringNE(SloItmCols.$o_unit_cd)); // 注意：この値はMA.MAUAL0010.Itmで事前に設定済
			down.setNumberNE(SloItmCols.$o_ship_unit_qty, MCNumber.ONE);

			// 受注画面で単位コードのリストロジック発火を抑制しているので、単位に付随する項目も更新する
			down.setStringNE(SloItmCols.$o_ship_unit_nm,
					down.getStringNE(SloItmCols.$o_unit_nm)); // 注意：この値はMA.MAUAL0010.Itmで事前に設定済
			down.setNumberNE(SloItmCols.$o_ship_unit_dec_place,
					down.getNumberNE(SloItmCols.$o_dec_place)); // 注意：この値はMA.MAUAL0010.Itmで事前に設定済
		}
		// MSBBP1210では上記条件を満たさないとき値はそのまま
		else {
			// ship_unit_cdはどのみちMA.MAUAL0010.Itmで設定される

			// ship_unit_qtyはサブパネルMA.MAUBP5040.Qtyのitm_LCイベントでクリアされるので上書きしないならnullを返す
			// down.setNumberNE(SloItmCols.$o_ship_unit_qty, up.getNumberNE(SloItmCols.$i_trd_unit_qty));
		}
	}
	
	/**
	 * MA.MAUAP0010.Cntryと同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setCntryOrg(MCRow up, MCRow down, MAUAL_List logic) {
		String cntryOrgCd = down.getStringNE(SloItmCols.$o_cntry_org_cd);
		if (cntryOrgCd == null || cntryOrgCd.isEmpty()) {
			return;
		}

		MCRow upCntry = MCRow.create();
		upCntry.addStringColumn($INPUT_VAL, cntryOrgCd);
		MCList<MCRow> downCntry = logic.getCntry(upCntry);
		if (downCntry == null) {
			return;
		}

		downCntry.forEach(new Consumer<MCRow>() {
			@Override
			public void accept(MCRow t) {
				if (cntryOrgCd.equals(t.getStringNE("cntry_cd"))) {
					down.setStringNE(SloItmCols.$o_cntry_org_nm, t.getStringNE("cntry_nm"));
				}
			}
		});
	}

	/**
	 * MA.MAUAP0010.ShipTermと同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setShipTerm(MCRow up, MCRow down, MAUAL_List logic) {
		String shipTermCd = down.getStringNE(SloItmCols.$o_ship_term_cd);
		if (shipTermCd == null || shipTermCd.isEmpty()) {
			return;
		}

		MCRow upShipTerm = MCRow.create();
		upShipTerm.addStringColumn($INPUT_VAL, shipTermCd);
		MCList<MCRow> downShipTerm = logic.getShipTerm(upShipTerm);
		if (downShipTerm == null) {
			return;
		}

		downShipTerm.forEach(new Consumer<MCRow>() {
			@Override
			public void accept(MCRow r) {
				if (shipTermCd.equals(r.getStringNE("ship_term_cd"))) {
					down.setStringNE(SloItmCols.$o_ship_term_nm, r.getStringNE("ship_term_nm"));
				}
			}
		});
	}

	/**
	 * MA.MAUAP0010.ItmUnitと同等の処理
	 * @param up
	 * @param down
	 */
	protected void _setTrdUnit(MCRow up, MCRow down, MAUAL_List logic) {
		String shipUnitCd = down.getStringNE(SloItmCols.$o_ship_unit_cd);
		if (shipUnitCd == null || shipUnitCd.isEmpty()) {
			return;
		}
		MCRow upItmUnit = MCRow.create();
		upItmUnit.addStringColumn("itm_cd", down.getStringNE(SloItmCols.$o_itm_cd));
		upItmUnit.addStringColumn("itm_sub1", down.getStringNE(SloItmCols.$o_itm_sub1));
		upItmUnit.addStringColumn("itm_sub2", down.getStringNE(SloItmCols.$o_itm_sub2));
		upItmUnit.addStringColumn("itm_sub3", down.getStringNE(SloItmCols.$o_itm_sub3));
		upItmUnit.addStringColumn($INPUT_VAL, shipUnitCd);
		MCList<MCRow> downItmUnit = logic.getItmUnit(upItmUnit);
		if (downItmUnit == null) {
			return;
		}

		downItmUnit.forEach(new Consumer<MCRow>() {
			@Override
			public void accept(MCRow r) {
				if (shipUnitCd.equals(r.getStringNE("unit_cd"))) {
					down.addStringColumn(SloItmCols.$o_ship_unit_nm, r.getStringNE("unit_nm"));
					down.addNumberColumn(SloItmCols.$o_ship_unit_dec_place, r.getNumberNE("dec_place"));
					down.addNumberColumn(SloItmCols.$o_ship_unit_conv_base_qty, r.getNumberNE("conv_base_qty"));
					down.addNumberColumn(SloItmCols.$o_ship_unit_conv_qty, r.getNumberNE("conv_qty"));
				}
			}
		});
	}

	/**
	 * 取引先品目を取得する。
	 * @param up 検索条件
	 * @return 取引先品目
	 */
	protected MCRow _getBpItm(MCRow up) {
		MAM_BP_ITM_R t = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		MAM_BP_ITM_R result = MAM_BP_ITM_R.create();

		builder.setSelect(t.bp_cd);
		builder.addSelect(t.itm_cd);
		builder.addSelect(t.itm_sub1);
		builder.addSelect(t.itm_sub2);
		builder.addSelect(t.itm_sub3);
		builder.addSelect(t.bp_itm_cd);
		builder.addSelect(t.bp_itm_nm);

		builder.addWhereWithAnd(t.bp_cd.eq(bind("1")), up.getString("bp_cd"));
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), up.getString("itm_cd"));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), up.getString("itm_sub1"));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), up.getString("itm_sub2"));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), up.getString("itm_sub3"));
		builder.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), up.getDate("dt"));

		String sqlid = createSqlId("MS.MSUAL0030.SloItm__getBpItm", t, "select");
		dbSelect(sqlid, result, builder);

		return result;
	}
	// -- SloItm:受注品目 (END)

	// -- SloItm:受注品目枝番１ (START)
	public MCList<MCRow> getSloItmSub1(MCRow row) {
		MCList<MCRow> list = new mcframe.serverMAUA.MAUAL0010.MAUAL_List().getItmSub1(row);
		_remapSloItmValues(list);
		_setSloItmDefaultValues(row, list);

		return list;
	}
	// -- SloItm:受注品目枝番１ (END)

	// -- SloItm:受注品目枝番２ (START)
	public MCList<MCRow> getSloItmSub2(MCRow row) {
		MCList<MCRow> list = new mcframe.serverMAUA.MAUAL0010.MAUAL_List().getItmSub2(row);
		_remapSloItmValues(list);
		_setSloItmDefaultValues(row, list);

		return list;
	}
	// -- SloItm:受注品目枝番２ (END)

	// -- SloItm:受注品目枝番３ (START)
	public MCList<MCRow> getSloItmSub3(MCRow row) {
		MCList<MCRow> list = new mcframe.serverMAUA.MAUAL0010.MAUAL_List().getItmSub3(row);
		_remapSloItmValues(list);
		_setSloItmDefaultValues(row, list);

		return list;
	}
	// -- SloItm:受注品目枝番３ (END)
}