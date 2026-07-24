package mcframe.serverMSUA.MSUAL0080;

import static mcframe.commonMS.notice.MS_Msg.MSBGL0071;
import static mcframe.commonMS.notice.MS_Msg.MSBGL0117;
import static mcframe.commonMSUA.MSUAC0080.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.util.MCDBUtil.dbSelect;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.isNull;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.createSqlId;

import java.util.ArrayList;
import java.util.List;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.MAC_AR_STTL_TYP;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;

abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- SttlRcv:決済方法（入金） (START)
	@Override
	protected void getSttlRcv_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result) {
		super.getSttlRcv_Set(row, builder, t, result);
		builder.addSelect(nullValue().as("xfr_psn"));

		// 入金のみ
		builder.addWhereWithAnd(
				t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.CASH.value()))
				.or(t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.BANK.value())))
				.or(t.ar_sttl_typ.eq(value(MAC_AR_STTL_TYP.NOTE.value()))));
		// さらに条件を絞る
		if (row.contains(SttlRcvCols.$i_ar_sttl_typ)) {
			builder.addWhereWithCutOffAnd(t.ar_sttl_typ.eq(bind("1")), row.getStringNE(SttlRcvCols.$i_ar_sttl_typ));
		}
		// 複数の入金登録区分から絞る
		List<String> typL = new ArrayList<String>();
		if (row.contains(SttlRcvCols.$i_rcv_reg_typ1)) {
			typL.add(row.getString(SttlRcvCols.$i_rcv_reg_typ1));
		}
		if (row.contains(SttlRcvCols.$i_rcv_reg_typ2)) {
			typL.add(row.getString(SttlRcvCols.$i_rcv_reg_typ2));
		}
		if (row.contains(SttlRcvCols.$i_rcv_reg_typ3)) {
			typL.add(row.getString(SttlRcvCols.$i_rcv_reg_typ3));
		}

		builder.addWhereInWithAnd(t.rcv_reg_typ, typL);
		
		// 手形を除く
		if (row.getBooleanNE(SttlRcvCols.$i_except_note_flg)) {
			builder.addWhereWithAnd(t.ar_sttl_typ.neq(value(MAC_AR_STTL_TYP.NOTE.value())));
		}
	}

	@Override
	protected MCList<?> getSttlRcv_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		// 入金先ＣＤが設定された場合は、債権決済区分「振込（BANK）」のレコードに振込人名を設定
		// 振込人名は存在チェック時には不要
		if (row.contains(SttlRcvCols.$i_rcst_cd)) {
			MAM_BP_R bp = MAM_BP_R.create("T");
			MAM_BP_R bpResult = MAM_BP_R.create();
			MCQueryApiBuilder bpBuilder = MCQueryApiBuilder.create(bp);
			bpBuilder.setSelect(bp.xfr_psn);
			bpBuilder.addWhereWithAnd(bp.rcst_flg.eq(value(true)));
			bpBuilder.addWhereWithAnd(bp.bp_cd.eq(bind("1")), row.getStringNE(SttlRcvCols.$i_rcst_cd));
			String sqlid = createSqlId("MS.MSUAL0080.SttlRcv_AfterSelect", bp, "S01");
			dbSelect(sqlid, bpResult, bpBuilder);

			if (!isNull(bpResult.xfr_psn())) {
				@SuppressWarnings("unchecked")
				MCList<MAM_STTL_R> sttl = (MCList<MAM_STTL_R>) result;
				sttl.addStringColumn(SttlRcvCols.$o_xfr_psn);
				String xfrPsn = bpResult.xfr_psn();
				for (MAM_STTL_R r : sttl) {
					if (MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())) {
						r.setStringNE(SttlRcvCols.$o_xfr_psn, xfrPsn);
					}
				}
				return sttl;
			}
		}
		return super.getSttlRcv_AfterSelect(row, builder, t, result);
	}
	
	protected MCMessage getSttlRcv_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = null;
		String typstring = "";
		if (!isNull(row.getStringNE(SttlRcvCols.$i_rcv_reg_typ1))) {
			typstring = typstring + row.getStringNE(SttlRcvCols.$i_rcv_reg_typ1);
		}
		if (!isNull(row.getStringNE(SttlRcvCols.$i_rcv_reg_typ2))) {
			if (typstring.length() != 0) {
				typstring = typstring + ",";
			}
			typstring = typstring + row.getStringNE(SttlRcvCols.$i_rcv_reg_typ2);
		}
		if (!isNull(row.getStringNE(SttlRcvCols.$i_rcv_reg_typ3))) {
			if (typstring.length() != 0) {
				typstring = typstring + ",";
			}
			typstring = typstring + row.getStringNE(SttlRcvCols.$i_rcv_reg_typ3);
		}
		if (typstring.length() == 0) {
			typstring = " ";
		}
		
		if (row.getBooleanNE(SttlRcvCols.$i_except_note_flg)) {
			msg = new MCMessage(MSBGL0117, typstring,
					row.getStringNE(SttlRcvCols.$i_rcst_cd),
					row.getStringNE(SttlRcvCols.$i_ar_sttl_typ), info);
		}
		else {
			msg = new MCMessage(MSBGL0071, typstring,
					row.getStringNE(SttlRcvCols.$i_rcst_cd),
					row.getStringNE(SttlRcvCols.$i_ar_sttl_typ), info);

		}
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- SttlRcv:決済方法（入金） (END)

	//-- Bcst_BillClDay:請求先（請求締日）(START)
	@Override
	protected void getBcst_BillClDay_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {

		builder.setSelect(t.bill_cl_day1);
		builder.addSelect(t.bill_cl_day2);
		builder.addSelect(t.bill_cl_day3);
		builder.addSelect(t.bill_cl_day4);
		builder.addSelect(t.bill_cl_day5);

		builder.addWhereWithAnd(t.bp_cd.eq(bind("1")), row.getString("bcst_cd"));
		builder.addWhereWithAnd(t.bcst_flg.eq(bind("1")), true);

		// 入力値による絞込みはしない
	}

	@Override
	protected MCList<?> getBcst_BillClDay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_BP_R tmpR = (MAM_BP_R)result.get(0);
		MCList<MAM_BP_R> retD = MCList.create(MAM_BP_R.class);
		retD.addNumberColumn("bill_cl_day");

		MCNumber day1 = tmpR.bill_cl_day1();
		if (!isNull(day1)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bill_cl_day", day1);
			retD.add(r);
		}

		MCNumber day2 = tmpR.bill_cl_day2();
		if (!isNull(day2)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bill_cl_day", day2);
			retD.add(r);
		}

		MCNumber day3 = tmpR.bill_cl_day3();
		if (!isNull(day3)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bill_cl_day", day3);
			retD.add(r);
		}

		MCNumber day4 = tmpR.bill_cl_day4();
		if (!isNull(day4)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bill_cl_day", day4);
			retD.add(r);
		}

		MCNumber day5 = tmpR.bill_cl_day5();
		if (!isNull(day5)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bill_cl_day", day5);
			retD.add(r);
		}

		if (!retD.isEmpty()) {
			retD.sort("bill_cl_day");
		}

		return (MCList<?>)retD;
	}
	//-- Bcst_BillClDay:請求先（請求締日）(END)

}
