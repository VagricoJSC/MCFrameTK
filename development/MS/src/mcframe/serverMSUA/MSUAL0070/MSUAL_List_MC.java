package mcframe.serverMSUA.MSUAL0070;

import static mcframe.commonMS.notice.MS_Msg.MSBFL0104;
import static mcframe.commonMS.notice.MS_Msg.MSBFL0105;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.getEditString;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.toDispItm;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.queryapi.IFMCSQL.MCTempView;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;


abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- SublotNo:サブロットＮＯ (START)
	@Override
	protected void getSublotNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		super.getSublotNo_Set(row, builder, t, result);
		getSublotNo_addSelectJoinCustom(row, builder, t, result);
		getSublotNo_addWhereCustom(row, builder, t, result);
	}

	@Override
	protected MCList<?> getSublotNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MCList<?> l = super.getSublotNo_AfterSelect(row, builder, t, result);
		// 区分名の設定
		l.addStringColumn(MSC_STK_INSP_TYP.$NAME);
		l.addStringColumn(MAC_QUALITY_TYP.$NAME);
		l.addStringColumn(MSC_MRKT_JUDG_STS_TYP.$NAME);
		l.addStringColumn(MSC_INSP_APRV_STS_TYP.$NAME);
		l.addStringColumn(MSC_PLNT_APRV_STS_TYP.$NAME);
		l.addStringColumn(MSC_MFG_APRV_STS_TYP.$NAME);
		l.addStringColumn(MAC_LMT_DT_FRM_TYP.$NAME);
		MSC_STK_INSP_TYP.putNameNE(l, MSC_STK_INSP_TYP.$VALUE, MSC_STK_INSP_TYP.$NAME);
		MAC_QUALITY_TYP.putNameNE(l, MAC_QUALITY_TYP.$VALUE, MAC_QUALITY_TYP.$NAME);
		MSC_MFG_APRV_STS_TYP.putNameNE(l, MSC_MFG_APRV_STS_TYP.$VALUE, MSC_MFG_APRV_STS_TYP.$NAME);
		MSC_INSP_APRV_STS_TYP.putNameNE(l, MSC_INSP_APRV_STS_TYP.$VALUE, MSC_INSP_APRV_STS_TYP.$NAME);
		MSC_PLNT_APRV_STS_TYP.putNameNE(l, MSC_PLNT_APRV_STS_TYP.$VALUE, MSC_PLNT_APRV_STS_TYP.$NAME);
		MSC_MRKT_JUDG_STS_TYP.putNameNE(l, MSC_MRKT_JUDG_STS_TYP.$VALUE, MSC_MRKT_JUDG_STS_TYP.$NAME);
		MAC_LMT_DT_FRM_TYP.putNameNE(l, MAC_LMT_DT_FRM_TYP.$VALUE, MAC_LMT_DT_FRM_TYP.$NAME);
		return l;
	}

	protected void getSublotNo_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		// なし
		
		// Select句、結合の設定
		builder.addLeftOuterJoin(itm,
				itm.itm_cd.eq(t.itm_cd)
				.and(itm.itm_sub1.eq(t.itm_sub1))
				.and(itm.itm_sub2.eq(t.itm_sub2))
				.and(itm.itm_sub3.eq(t.itm_sub3)));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
	}

	protected void getSublotNo_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");

		// 固定条件（行ごとに条件値が同じ条件）
		// なし
		builder.addWhereWithAnd(
				bracket(itm.sublot_mng_typ.neq(value(MAC_SUBLOT_MNG_TYP.STK.value()))
						.or(t.sublot_no.neq(value(MAC_STR.NULL_VAL.value())))));
		
		// リストロジックチェック時はこれ以上の条件を追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(SublotNoCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(SublotNoCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(SublotNoCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(SublotNoCols.$i_itm_sub3));
		builder.addWhereWithAnd(
				t.lot_no.eq(subQuery()
						.select(cases()
								.when(itm.lot_mng_typ
										.eq(value(MAC_LOT_MNG_TYP.NOT_MNG.value()))
										.and(itm.sublot_mng_typ.eq(
												value(MAC_SUBLOT_MNG_TYP.STK.value()))))
								.then(value(MAC_STR.NULL_VAL.value()))
								.otherwise(bind("1")))),
				row.getStringNE(SublotNoCols.$i_lot_no));
	}
	
	protected MCMessage getSublotNo_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

			String itmInfo = toDispItm(row.getStringNE(SublotNoCols.$i_itm_cd),
				row.getStringNE(SublotNoCols.$i_itm_sub1),
				row.getStringNE(SublotNoCols.$i_itm_sub2),
				row.getStringNE(SublotNoCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBFL0105, itmInfo,
				row.getStringNE(SublotNoCols.$i_lot_no), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SublotNo:サブロットＮＯ (END)

	// -- LotNo:ロットＮＯ (START)
	@Override
	protected void getLotNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		super.getLotNo_Set(row, builder, t, result);
		getLotNo_addSelectJoinCustom(row, builder, t, result);
		getLotNo_addWhereCustom(row, builder, t, result);
	}

	@Override
	protected MCList<?> getLotNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MCList<?> l = super.getLotNo_AfterSelect(row, builder, t, result);
		// 区分名の設定
		l.addStringColumn(MSC_STK_INSP_TYP.$NAME);
		l.addStringColumn(MAC_QUALITY_TYP.$NAME);
		l.addStringColumn(MSC_MRKT_JUDG_STS_TYP.$NAME);
		l.addStringColumn(MSC_INSP_APRV_STS_TYP.$NAME);
		l.addStringColumn(MSC_PLNT_APRV_STS_TYP.$NAME);
		l.addStringColumn(MSC_MFG_APRV_STS_TYP.$NAME);
		l.addStringColumn(MAC_LMT_DT_FRM_TYP.$NAME);
		MSC_STK_INSP_TYP.putNameNE(l, MSC_STK_INSP_TYP.$VALUE, MSC_STK_INSP_TYP.$NAME);
		MAC_QUALITY_TYP.putNameNE(l, MAC_QUALITY_TYP.$VALUE, MAC_QUALITY_TYP.$NAME);
		MSC_MFG_APRV_STS_TYP.putNameNE(l, MSC_MFG_APRV_STS_TYP.$VALUE, MSC_MFG_APRV_STS_TYP.$NAME);
		MSC_INSP_APRV_STS_TYP.putNameNE(l, MSC_INSP_APRV_STS_TYP.$VALUE, MSC_INSP_APRV_STS_TYP.$NAME);
		MSC_PLNT_APRV_STS_TYP.putNameNE(l, MSC_PLNT_APRV_STS_TYP.$VALUE, MSC_PLNT_APRV_STS_TYP.$NAME);
		MSC_MRKT_JUDG_STS_TYP.putNameNE(l, MSC_MRKT_JUDG_STS_TYP.$VALUE, MSC_MRKT_JUDG_STS_TYP.$NAME);
		MAC_LMT_DT_FRM_TYP.putNameNE(l, MAC_LMT_DT_FRM_TYP.$VALUE, MAC_LMT_DT_FRM_TYP.$NAME);
		return l;
	}

	protected void getLotNo_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		// なし
		
		// Select句、結合の設定
		builder.removeSelect(MSVT_LOT_LIST_R.$sublot_no);
		builder.addSelect(
				decode(itm.sublot_mng_typ,
						value(MAC_SUBLOT_MNG_TYP.STK.value()),
						decode(t.sublot_no,
								value(MAC_STR.NULL_VAL.value()),
								nullValue(),
								t.sublot_no),
						t.sublot_no)
				.as("sublot_no"));
		builder.addLeftOuterJoin(itm,
				itm.itm_cd.eq(t.itm_cd)
				.and(itm.itm_sub1.eq(t.itm_sub1))
				.and(itm.itm_sub2.eq(t.itm_sub2))
				.and(itm.itm_sub3.eq(t.itm_sub3)));
		
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
	protected void getLotNo_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result) {
		MCTempView tempView = createTempView("TEMP");
		MAM_ITM__R itm = MAM_ITM__R.create("ITM");
		MST_STK_R stk = MST_STK_R.create("STK");
		MST_IO_SCHD_R io = MST_IO_SCHD_R.create("IO");

		// 固定条件（行ごとに条件値が同じ条件）
		// なし
		
		// リストロジックチェック時はこれ以上の条件を追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithAnd(t.itm_cd.eq(bind("1")), row.getStringNE(LotNoCols.$i_itm_cd));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("1")), row.getStringNE(LotNoCols.$i_itm_sub1));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("1")), row.getStringNE(LotNoCols.$i_itm_sub2));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("1")), row.getStringNE(LotNoCols.$i_itm_sub3));
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(itm.itm_nm.like(bind("1")), getEditString(row, LotNoCols.$i_itm_nm));
		builder.addWhereWithCutOffAnd(t.lot_no.like(bind("1")), getEditString(row, LotNoCols.$i_lot_no));
		builder.addWhereWithCutOffAnd(t.ver_no.like(bind("1")), getEditString(row, LotNoCols.$i_ver_no));
		builder.addWhereWithCutOffAnd(t.mfg_aprv_sts_typ.like(bind("1")), getEditString(row, LotNoCols.$i_mfg_aprv_sts_typ));
		builder.addWhereWithCutOffAnd(t.stk_insp_typ.like(bind("1")), getEditString(row, LotNoCols.$i_stk_insp_typ));
		builder.addWhereWithCutOffAnd(t.quality_typ.like(bind("1")), getEditString(row, LotNoCols.$i_quality_typ));
		builder.addWhereWithCutOffAnd(t.insp_aprv_sts_typ.like(bind("1")), getEditString(row, LotNoCols.$i_insp_aprv_sts_typ));
		builder.addWhereWithCutOffAnd(t.plnt_aprv_sts_typ.like(bind("1")), getEditString(row, LotNoCols.$i_plnt_aprv_sts_typ));
		builder.addWhereWithCutOffAnd(t.mrkt_judg_sts_typ.like(bind("1")), getEditString(row, LotNoCols.$i_mrkt_judg_sts_typ));
		builder.addWhereWithCutOffAnd(t.vld_dt.gte(bind("1")), row.getDateNE(LotNoCols.$i_vld_dt_fr));
		builder.addWhereWithCutOffAnd(t.vld_dt.lte(bind("1")), row.getDateNE(LotNoCols.$i_vld_dt_to));
		builder.addWhereWithCutOffAnd(t.lmt_dt.gte(bind("1")), row.getDateNE(LotNoCols.$i_lmt_dt_fr));
		builder.addWhereWithCutOffAnd(t.lmt_dt.lte(bind("1")), row.getDateNE(LotNoCols.$i_lmt_dt_to));
		builder.addWhereWithCutOffAnd(t.first_gr_dt.gte(bind("1")), row.getDateNE(LotNoCols.$i_first_gr_dt_fr));
		builder.addWhereWithCutOffAnd(t.first_gr_dt.lte(bind("1")), row.getDateNE(LotNoCols.$i_first_gr_dt_to));
		builder.addWhereWithCutOffAnd(t.lot_rmrks.like(bind("1")), getEditString(row, LotNoCols.$i_lot_rmrks));
		if (!row.getBooleanNE(LotNoCols.$i_srch_no_stk_and_io_flg)) {
			builder.addWhereWithAnd(
					exists(subQuery()
							.select(value("X"))
							.from(subQuery()
									.selectDistinct(stk.itm_cd, stk.itm_sub1,
											stk.itm_sub2, stk.itm_sub3, stk.lot_no)
									.from(stk)
									.where(value(0).eq(value(0))
											.and(stk.itm_cd.eq(t.itm_cd))
											.and(stk.itm_sub1.eq(t.itm_sub1))
											.and(stk.itm_sub2.eq(t.itm_sub2))
											.and(stk.itm_sub3.eq(t.itm_sub3))
											.and(stk.lot_no.eq(t.lot_no)))
									.union(subQuery()
											.selectDistinct(io.itm_cd, io.itm_sub1,
													io.itm_sub2, io.itm_sub3, io.lot_no)
											.from(io)
											.where(value(0).eq(value(0))
													.and(io.itm_cd.eq(t.itm_cd))
													.and(io.itm_sub1.eq(t.itm_sub1))
													.and(io.itm_sub2.eq(t.itm_sub2))
													.and(io.itm_sub3.eq(t.itm_sub3))
													.and(io.lot_no.eq(t.lot_no))
													.and(io.io_typ.eq(value(
															MSC_IO_TYP.GR.value())))))
									.view(tempView))));
		}
	}
	
	protected MCMessage getLotNo_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		String itmInfo = toDispItm(row.getStringNE(LotNoCols.$i_itm_cd),
				row.getStringNE(LotNoCols.$i_itm_sub1),
				row.getStringNE(LotNoCols.$i_itm_sub2),
				row.getStringNE(LotNoCols.$i_itm_sub3));

		MCMessage msg = new MCMessage(MSBFL0104, itmInfo, info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- LotNo:ロットＮＯ (END)

}
