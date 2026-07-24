package mcframe.serverMSUA.MSUAL0090;

import static mcframe.commonMSUA.MSUAC0090.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.getEditString;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.isNull;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;

abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {
	
	//-- Bsppl_PaySchdClDay:支払予定管理先（支払締日）(START)
	@Override
	protected void getBsppl_PaySchdClDay_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		builder.setSelect(t.psppl_cl_day1);
		builder.addSelect(t.psppl_cl_day2);
		builder.addSelect(t.psppl_cl_day3);
		builder.addSelect(t.psppl_cl_day4);
		builder.addSelect(t.psppl_cl_day5);

		builder.addWhereWithAnd(t.bp_cd.eq(bind("1")), row.getString("bsppl_cd"));
		builder.addWhereWithAnd(t.bsppl_flg.eq(bind("1")), true);
		// 入力値による絞込みはしない
	}

	@Override
	protected MCList<?> getBsppl_PaySchdClDay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		MAM_BP_R tmpR = (MAM_BP_R)result.get(0);
		MCList<MAM_BP_R> retD = MCList.create(MAM_BP_R.class);
		retD.addNumberColumn("bsppl_cl_day");

		MCNumber day1 = tmpR.psppl_cl_day1();
		if (!isNull(day1)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bsppl_cl_day", day1);
			retD.add(r);
		}

		MCNumber day2 = tmpR.psppl_cl_day2();
		if (!isNull(day2)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bsppl_cl_day", day2);
			retD.add(r);
		}

		MCNumber day3 = tmpR.psppl_cl_day3();
		if (!isNull(day3)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bsppl_cl_day", day3);
			retD.add(r);
		}

		MCNumber day4 = tmpR.psppl_cl_day4();
		if (!isNull(day4)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bsppl_cl_day", day4);
			retD.add(r);
		}

		MCNumber day5 = tmpR.psppl_cl_day5();
		if (!isNull(day5)) {
			MAM_BP_R r = MAM_BP_R.create();
			r.setNumberNE("bsppl_cl_day", day5);
			retD.add(r);
		}

		if (!retD.isEmpty()) {
			retD.sort("bsppl_cl_day");
		}

		return (MCList<?>)retD;

	}
	//-- Bsppl_PaySchdClDay:支払予定管理先（支払締日）(END)

	//--AdvPay:前渡金(START)
	@Override
	protected void getAdvPay_Set(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result){
		super.getAdvPay_Set(row, builder, t, result);
		
		getAdvPay_addSelectJoinCustom(row, builder, t, result);
		getAdvPay_addWhereCustom(row, builder, t, result);
		
	}

	protected void getAdvPay_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result) {
		MAM_DPT_R m1 = MAM_DPT_R.create("M1");
		MAM_DPT_R m6 = MAM_DPT_R.create("M6");
		MAM_STTL_R m2 = MAM_STTL_R.create("M2");
		MAM_USR_R m3 = MAM_USR_R.create("M3");
		MAM_WG_R m8 = MAM_WG_R.create("M8");
		MST_PAY_NOTE_R t2 = MST_PAY_NOTE_R.create("T2");
		MAM_BANK_R m4 = MAM_BANK_R.create("M4");
		MAM_BANK_BRANCH_R m5 = MAM_BANK_BRANCH_R.create("M5");
		MAM_NOTE_RSN_R m7 = MAM_NOTE_RSN_R.create("M7");
		MAVM_RD_DPT_R d1 = MAVM_RD_DPT_R.create("D1");
		MAVM_RD_DPT_R d2 = MAVM_RD_DPT_R.create("D2");

		// 固定のSelect句、結合の設定
		result.addStringColumn(AdvPayCols.$o_pay_dpt_nm);
		result.addStringColumn(AdvPayCols.$o_bd_dpt_nm);
		result.addStringColumn(AdvPayCols.$o_ap_sttl_nm);
		result.addStringColumn(AdvPayCols.$o_pay_usr_nm);
		result.addStringColumn(AdvPayCols.$o_note_no);
		result.addStringColumn(AdvPayCols.$o_note_typ);
		result.addStringColumn(AdvPayCols.$o_note_rsn_cd);
		result.addStringColumn(AdvPayCols.$o_note_rsn_nm);
		result.addDateColumn(AdvPayCols.$o_draw_dt);
		result.addDateColumn(AdvPayCols.$o_due_dt);
		result.addNumberColumn(AdvPayCols.$o_note_days);	
		result.addStringColumn(AdvPayCols.$o_drawer_nm);
		result.addStringColumn(AdvPayCols.$o_draw_bank_cd);
		result.addStringColumn(AdvPayCols.$o_draw_bank_nm);
		result.addStringColumn(AdvPayCols.$o_draw_branch_cd);
		result.addStringColumn(AdvPayCols.$o_draw_branch_nm);
		result.addStringColumn(AdvPayCols.$o_endrsr);
		result.addStringColumn(AdvPayCols.$o_accptr);
		
		builder.addSelect(m1.dpt_nm.as("pay_dpt_nm"));
		builder.addSelect(m6.dpt_nm.as("bd_dpt_nm"));
		builder.addSelect(m2.sttl_nm.as("ap_sttl_nm"));
		builder.addSelect(m3.usr_nm.as("pay_usr_nm"));
		builder.addSelect(t2.note_no);
		builder.addSelect(t2.note_typ);
		builder.addSelect(t2.note_rsn_cd);
		builder.addSelect(m7.note_rsn_nm);
		builder.addSelect(t2.draw_dt);
		builder.addSelect(t2.due_dt);
		builder.addSelect(t2.note_days);
		builder.addSelect(t2.drawer_nm);
		builder.addSelect(t2.draw_bank_cd);
		builder.addSelect(m4.bank_nm.as("draw_bank_nm"));
		builder.addSelect(t2.draw_branch_cd);
		builder.addSelect(m5.branch_nm.as("draw_branch_nm"));
		builder.addSelect(t2.endrsr);
		builder.addSelect(t2.accptr);
		builder.addLeftOuterJoin(m1,
				t.pay_dpt_cd.eq(m1.dpt_cd)
				.and(t.ac_dt.between(m1.st_dt, m1.end_dt)));
		builder.addLeftOuterJoin(m6,
				t.bd_dpt_cd.eq(m6.dpt_cd)
				.and(t.ac_dt.between(m6.st_dt, m6.end_dt)));
		builder.addLeftOuterJoin(m2, t.ap_sttl_cd.eq(m2.sttl_cd));
		builder.addLeftOuterJoin(m3, t.pay_usr_cd.eq(m3.usr_cd));
		builder.addLeftOuterJoin(m8, t.wg_cd.eq(m8.wg_cd));
		
		//手形情報
		builder.addLeftOuterJoin(t2,
				t.adv_pay_act_no.eq(t2.adv_pay_act_no)
				.and(t.adv_pay_act_seq.eq(t2.adv_pay_act_seq)));
		builder.addLeftOuterJoin(m4, t2.draw_bank_cd.eq(m4.bank_cd));
		builder.addLeftOuterJoin(m5,
				t2.draw_bank_cd.eq(m5.bank_cd)
				.and(t2.draw_branch_cd.eq(m5.branch_cd)));
		builder.addLeftOuterJoin(m7, t2.note_rsn_cd.eq(m7.note_rsn_cd));
		//DAC処理	
		builder.addLeftOuterJoin(d1, d1.dpt_cd.eq(t.bsppl_dpt_cd));
		builder.addLeftOuterJoin(d2, d2.dpt_cd.eq(t.pay_dpt_cd));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getAdvPay_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result) {
		MAM_DPT_R m1 = MAM_DPT_R.create("M1");
		MAM_STTL_R m2 = MAM_STTL_R.create("M2");
		MAM_USR_R m3 = MAM_USR_R.create("M3");
		MAM_WG_R m8 = MAM_WG_R.create("M8");
		MST_PAY_NOTE_R t2 = MST_PAY_NOTE_R.create("T2");

		MAVM_RD_DPT_R d1 = MAVM_RD_DPT_R.create("D1");
		MAVM_RD_DPT_R d2 = MAVM_RD_DPT_R.create("D2");

		//DAC処理
		builder.addWhereWithAnd(
				d1.dpt_cd.isNotNull()
				.or(d2.dpt_cd.isNotNull()));
		//検索条件
		builder.addWhereWithCutOffAnd(t.bsppl_cd.eq(bind("1")), row.getString(AdvPayCols.$i_bsppl_cd));
		builder.addWhereWithCutOffAnd(t.trd_cur_cd.eq(bind("1")), row.getString(AdvPayCols.$i_trd_cur_cd));
		builder.addWhereWithCutOffAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		builder.addWhereWithCutOffAnd(t.trd_cur_not_proc_bal.neq(value(0)));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
		
		builder.addWhereWithCutOffAnd(t.pay_usr_cd.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_usr_cd));
		builder.addWhereWithCutOffAnd(m3.usr_nm.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_usr_nm));
		builder.addWhereWithCutOffAnd(t.pay_dpt_cd.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_dpt_cd));
		builder.addWhereWithCutOffAnd(m1.dpt_nm.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_dpt_nm));
		builder.addWhereWithCutOffAnd(t.wg_cd.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_dpt_wg_cd));
		builder.addWhereWithCutOffAnd(m8.wg_nm.like(bind("1")), getEditString(row, AdvPayCols.$i_pay_dpt_wg_nm));
		builder.addWhereWithCutOffAnd(t.bd_dpt_cd.like(bind("1")), getEditString(row, AdvPayCols.$i_bd_dpt_cd));
		builder.addWhereWithCutOffAnd(t.ap_sttl_cd.like(bind("1")), getEditString(row, AdvPayCols.$i_ap_sttl_cd));
		builder.addWhereWithCutOffAnd(m2.sttl_nm.like(bind("1")), getEditString(row, AdvPayCols.$i_ap_sttl_nm));
		builder.addWhereWithCutOffAnd(t.pay_act_dt.gte(bind("1")), row.getDateNE(AdvPayCols.$i_pay_act_dt_fr));
		builder.addWhereWithCutOffAnd(t.pay_act_dt.lte(bind("1")), row.getDateNE(AdvPayCols.$i_pay_act_dt_to));
		builder.addWhereWithCutOffAnd(t.ac_dt.gte(bind("1")), row.getDateNE(AdvPayCols.$i_ac_dt_fr));
		builder.addWhereWithCutOffAnd(t.ac_dt.lte(bind("1")), row.getDateNE(AdvPayCols.$i_ac_dt_to));
		builder.addWhereWithCutOffAnd(t.adv_pay_act_no.like(bind("1")), getEditString(row, AdvPayCols.$i_adv_pay_act_no));
		builder.addWhereWithCutOffAnd(t2.note_no.like(bind("1")), getEditString(row, AdvPayCols.$i_note_no));
	}

	protected MCList<?> getAdvPay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result){
		//区分名の取得
		MCList<?> l = super.getAdvPay_AfterSelect(row, builder, t, result);
		l.addStringColumn(MAC_AP_STTL_TYP.$NAME);
		l.addStringColumn(MAC_NOTE_TYP.$NAME);
		MAC_AP_STTL_TYP.putNameNE(l,MAC_AP_STTL_TYP.$VALUE,MAC_AP_STTL_TYP.$NAME);
		MAC_NOTE_TYP.putNameNE(l,MAC_NOTE_TYP.$VALUE,MAC_NOTE_TYP.$NAME);

		return l;
	}

	//--AdvPay:前渡金(END)
}
