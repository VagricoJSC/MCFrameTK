package mcframe.serverMSBH.MSBHL0030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [MSBHL_PaySchdReg]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("MS.MSBHL0030.Srch01.UP.BLOCK0")){
			return MS_MSBHL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0030_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Srch01.DOWN.BLOCK2")){
			return MS_MSBHL0030_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Srch01.DOWN.BLOCK3")){
			return MS_MSBHL0030_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0030.Srch01.DOWN.BLOCK4")){
			return MS_MSBHL0030_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0030.Srch02.UP.BLOCK0")){
			return MS_MSBHL0030_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Srch02.DOWN.BLOCK0")){
			return MS_MSBHL0030_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Srch02.DOWN.BLOCK1")){
			return MS_MSBHL0030_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Srch02.DOWN.BLOCK2")){
			return MS_MSBHL0030_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Sprt01.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt01.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt02.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt02.UP.BLOCK1")){
			return MS_MSBHL0030_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Sprt02.UP.BLOCK2")){
			return MS_MSBHL0030_Sprt02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Sprt02.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt03.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt03.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt04.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt04.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt05.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt05.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt06.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt06.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt07.UP.BLOCK0")){
			return MS_MSBHL0030_Sprt07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Sprt07.DOWN.BLOCK0")){
			return MS_MSBHL0030_Sprt07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.UP.BLOCK0")){
			return MS_MSBHL0030_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.UP.BLOCK1")){
			return MS_MSBHL0030_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.UP.BLOCK2")){
			return MS_MSBHL0030_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.UP.BLOCK3")){
			return MS_MSBHL0030_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.UP.BLOCK4")){
			return MS_MSBHL0030_Chk01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.DOWN.BLOCK0")){
			return MS_MSBHL0030_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.DOWN.BLOCK1")){
			return MS_MSBHL0030_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.DOWN.BLOCK2")){
			return MS_MSBHL0030_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.DOWN.BLOCK3")){
			return MS_MSBHL0030_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0030.Chk01.DOWN.BLOCK4")){
			return MS_MSBHL0030_Chk01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.UP.BLOCK0")){
			return MS_MSBHL0030_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.UP.BLOCK1")){
			return MS_MSBHL0030_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.UP.BLOCK2")){
			return MS_MSBHL0030_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.DOWN.BLOCK0")){
			return MS_MSBHL0030_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.DOWN.BLOCK1")){
			return MS_MSBHL0030_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Chk02.DOWN.BLOCK2")){
			return MS_MSBHL0030_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Chk03.UP.BLOCK0")){
			return MS_MSBHL0030_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Chk03.DOWN.BLOCK0")){
			return MS_MSBHL0030_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.UP.BLOCK0")){
			return MS_MSBHL0030_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.UP.BLOCK1")){
			return MS_MSBHL0030_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.UP.BLOCK2")){
			return MS_MSBHL0030_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.UP.BLOCK3")){
			return MS_MSBHL0030_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.UP.BLOCK4")){
			return MS_MSBHL0030_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.DOWN.BLOCK0")){
			return MS_MSBHL0030_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.DOWN.BLOCK1")){
			return MS_MSBHL0030_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Ins01.DOWN.BLOCK2")){
			return MS_MSBHL0030_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.UP.BLOCK0")){
			return MS_MSBHL0030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.UP.BLOCK1")){
			return MS_MSBHL0030_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.UP.BLOCK2")){
			return MS_MSBHL0030_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.UP.BLOCK3")){
			return MS_MSBHL0030_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.UP.BLOCK4")){
			return MS_MSBHL0030_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.DOWN.BLOCK0")){
			return MS_MSBHL0030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.DOWN.BLOCK1")){
			return MS_MSBHL0030_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Upd01.DOWN.BLOCK2")){
			return MS_MSBHL0030_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Del01.UP.BLOCK0")){
			return MS_MSBHL0030_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0030.Del01.UP.BLOCK1")){
			return MS_MSBHL0030_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0030.Del01.UP.BLOCK2")){
			return MS_MSBHL0030_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0030.Prnt01.UP.BLOCK0")){
			return MS_MSBHL0030_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																
	
	static final MCOperationInfo MS_MSBHL0030_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("bsppl_usr_nm", "bsppl_usr_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("ap_amt", "ap_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_amt", "trd_cur_com_paid_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid_amt", "base_cur_com_paid_amt"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("last_pay_schd_amt", "last_pay_schd_amt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("schd_pay_amt", "schd_pay_amt"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_RsltChk")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_mtd_typ_nm", "pay_mtd_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("co_bsppl_cl_ym", "co_bsppl_cl_ym"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("crryovr_flg", "crryovr_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("org_ap_d_no", "org_ap_d_no"),
				MCItemDef.create("crryovr_ap_d_no", "crryovr_ap_d_no"),
				MCItemDef.create("crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("sw_src_rcv_bill_no", "sw_src_rcv_bill_no"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("co_src_trd_cur_amt", "co_src_trd_cur_amt"),
				MCItemDef.create("co_src_trd_cur_tax_amt", "co_src_trd_cur_tax_amt"),
				MCItemDef.create("co_src_trd_cur_proc_amt", "co_src_trd_cur_proc_amt"),
				MCItemDef.create("co_src_trd_cur_onr_prov_amt", "co_src_trd_cur_onr_prov_amt"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm")
			}
			,
			MCBlockDef.create("Srch01_RsltApd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("ap_setoff_act_flg", "ap_setoff_act_flg"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_amt", "adv_amt"),
				MCItemDef.create("setoff_schd_amt", "setoff_schd_amt"),
				MCItemDef.create("setoff_act_amt", "setoff_act_amt"),
				MCItemDef.create("not_proc_bal", "not_proc_bal"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_bank_nm", "draw_bank_nm"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("draw_branch_nm", "draw_branch_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("sw_flg", "sw_flg"),
				MCItemDef.create("trd_cur_appl_amt", "trd_cur_appl_amt"),
				MCItemDef.create("last_setoff_act_flg", "last_setoff_act_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Srch01_RsltSchd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_RsltAct")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_RsltAdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Srch02_INFO = new MCOperationInfo("MS", "MSBHL0030", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("bsppl_cl_dt_fr", "bsppl_cl_dt_fr"),
				MCItemDef.create("bsppl_cl_dt_to", "bsppl_cl_dt_to"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("reg_dt", "reg_dt")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_mtd_typ_nm", "pay_mtd_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("crryovr_flg", "crryovr_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("org_ap_d_no", "org_ap_d_no"),
				MCItemDef.create("crryovr_ap_d_no", "crryovr_ap_d_no"),
				MCItemDef.create("crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("sw_src_rcv_bill_no", "sw_src_rcv_bill_no"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_RsltAct")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_RsltAdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("base_dt", "base_dt")
			}
			,
			MCBlockDef.create("Sprt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("ap_setoff_act_flg", "ap_setoff_act_flg"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt02_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("Sprt02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("Sprt02_CndPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Sprt02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("Sprt02_CndAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_mtd_typ_nm", "pay_mtd_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("crryovr_flg", "crryovr_flg"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("org_ap_d_no", "org_ap_d_no"),
				MCItemDef.create("crryovr_ap_d_no", "crryovr_ap_d_no"),
				MCItemDef.create("crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("sw_src_rcv_bill_no", "sw_src_rcv_bill_no"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm")
			}
			,
			MCBlockDef.create("Sprt02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt03_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd")
			}
			,
			MCBlockDef.create("Sprt03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("setoff_limit_amt", "setoff_limit_amt"),
				MCItemDef.create("ar_typ", "ar_typ")
			}
			,
			MCBlockDef.create("Sprt03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt04_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt04", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("Sprt04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("onr_prov_bal", "onr_prov_bal")
			}
			,
			MCBlockDef.create("Sprt04_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt05_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt05", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt05",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg")
			}
			,
			MCBlockDef.create("Sprt05_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt05",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Sprt05_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt06_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt06", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg")
			}
			,
			MCBlockDef.create("Sprt06_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt06",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Sprt06_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Sprt07_INFO = new MCOperationInfo("MS", "MSBHL0030", "Sprt07", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Sprt07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg")
			}
			,
			MCBlockDef.create("Sprt07_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Sprt07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("last_pay_schd_amt", "last_pay_schd_amt")
			}
			,
			MCBlockDef.create("Sprt07_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Chk01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ap_d" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_d" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_d" + ".ap_typ", "ap_typ"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DtlPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("DtlAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".man_reg_flg", "man_reg_flg"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("co_ap_d_no", "co_ap_d_no"),
				MCItemDef.create("co_src_ap_d_no", "co_src_ap_d_no"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_schd" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_schd" + ".trd_cur_exc_com_paid", "trd_cur_exc_com_paid"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DtlPayAct")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("DtlAdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Chk02_INFO = new MCOperationInfo("MS", "MSBHL0030", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("co_ap_d_no", "co_ap_d_no"),
				MCItemDef.create("co_src_ap_d_no", "co_src_ap_d_no")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Chk03_INFO = new MCOperationInfo("MS", "MSBHL0030", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_no", "pay_chk_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Ins01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ap_d" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_d" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_d" + ".ap_typ", "ap_typ"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("DtlPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Ins01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("DtlAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk" + ".pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_chk" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("pay_chk" + ".aprv_no", "aprv_no"),
				MCItemDef.create("pay_chk" + ".aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("pay_chk" + ".pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Upd01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ap_d" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_d" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_d" + ".ap_typ", "ap_typ"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("DtlPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("DtlAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL0030_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_chk" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("pay_chk" + ".aprv_no", "aprv_no"),
				MCItemDef.create("pay_chk" + ".aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("pay_chk" + ".pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL0030_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Del01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL0030_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0030_Prnt01_INFO = new MCOperationInfo("MS", "MSBHL0030", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0030_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("pay_schd_dtl_prnt_flg", "pay_schd_dtl_prnt_flg"),
				MCItemDef.create("pay_ntc_prnt_flg", "pay_ntc_prnt_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

