package mcframe.serverMSBH.MSBHL0020;

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
 * [MSBHL_PaySchdListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0020.Srch01.UP.BLOCK0")){
			return MS_MSBHL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0020_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0020.Srch01.DOWN.BLOCK2")){
			return MS_MSBHL0020_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0020.Srch01.DOWN.BLOCK3")){
			return MS_MSBHL0020_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.UP.BLOCK0")){
			return MS_MSBHL0020_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.UP.BLOCK1")){
			return MS_MSBHL0020_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.UP.BLOCK2")){
			return MS_MSBHL0020_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.UP.BLOCK3")){
			return MS_MSBHL0020_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.DOWN.BLOCK0")){
			return MS_MSBHL0020_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.DOWN.BLOCK1")){
			return MS_MSBHL0020_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.DOWN.BLOCK2")){
			return MS_MSBHL0020_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0020.Chk01.DOWN.BLOCK3")){
			return MS_MSBHL0020_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0020.Chk02.UP.BLOCK0")){
			return MS_MSBHL0020_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Chk02.DOWN.BLOCK0")){
			return MS_MSBHL0020_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.UP.BLOCK0")){
			return MS_MSBHL0020_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.UP.BLOCK1")){
			return MS_MSBHL0020_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.UP.BLOCK2")){
			return MS_MSBHL0020_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.UP.BLOCK3")){
			return MS_MSBHL0020_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.UP.BLOCK4")){
			return MS_MSBHL0020_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL0020.Ins01.DOWN.BLOCK0")){
			return MS_MSBHL0020_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Del01.UP.BLOCK0")){
			return MS_MSBHL0020_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Del01.DOWN.BLOCK0")){
			return MS_MSBHL0020_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Prnt01.UP.BLOCK0")){
			return MS_MSBHL0020_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0020.Prnt01.UP.BLOCK1")){
			return MS_MSBHL0020_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0020.Prnt01.DOWN.BLOCK0")){
			return MS_MSBHL0020_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBHL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("reg_dt_fr", "reg_dt_fr"),
				MCItemDef.create("reg_dt_to", "reg_dt_to"),
				MCItemDef.create("unchk_flg", "unchk_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("aprv_opn_flg", "aprv_opn_flg"),
				MCItemDef.create("aprv_fix_flg", "aprv_fix_flg"),
				MCItemDef.create("aprv_acpt_flg", "aprv_acpt_flg"),
				MCItemDef.create("aprv_rjct_flg", "aprv_rjct_flg"),
				MCItemDef.create("aprv_last_rjct_flg", "aprv_last_rjct_flg"),
				MCItemDef.create("aprv_none_flg", "aprv_none_flg"),
				MCItemDef.create("not_prnt_flg", "not_prnt_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("bsppl_cl_dt_fr", "bsppl_cl_dt_fr"),
				MCItemDef.create("bsppl_cl_dt_to", "bsppl_cl_dt_to"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("inc_no_pay_flg", "inc_no_pay_flg"),
				MCItemDef.create("inc_interim_flg", "inc_interim_flg"),
				MCItemDef.create("manual_flg", "manual_flg"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("bsppl_grp_flg1", "bsppl_grp_flg1"),
				MCItemDef.create("new_flg", "new_flg"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bsppl_grp_cd1", "bsppl_grp_cd1"),
				MCItemDef.create("bsppl_grp_nm1", "bsppl_grp_nm1"),
				MCItemDef.create("bsppl_grp_flg2", "bsppl_grp_flg2"),
				MCItemDef.create("bsppl_grp_cd2", "bsppl_grp_cd2"),
				MCItemDef.create("bsppl_grp_nm2", "bsppl_grp_nm2"),
				MCItemDef.create("bsppl_grp_flg3", "bsppl_grp_flg3"),
				MCItemDef.create("bsppl_grp_cd3", "bsppl_grp_cd3"),
				MCItemDef.create("bsppl_grp_nm3", "bsppl_grp_nm3"),
				MCItemDef.create("bsppl_grp_flg4", "bsppl_grp_flg4"),
				MCItemDef.create("bsppl_grp_cd4", "bsppl_grp_cd4"),
				MCItemDef.create("bsppl_grp_nm4", "bsppl_grp_nm4"),
				MCItemDef.create("bsppl_grp_flg5", "bsppl_grp_flg5"),
				MCItemDef.create("bsppl_grp_cd5", "bsppl_grp_cd5"),
				MCItemDef.create("bsppl_grp_nm5", "bsppl_grp_nm5"),
				MCItemDef.create("bsppl_grp_flg6", "bsppl_grp_flg6"),
				MCItemDef.create("bsppl_grp_cd6", "bsppl_grp_cd6"),
				MCItemDef.create("bsppl_grp_nm6", "bsppl_grp_nm6"),
				MCItemDef.create("bsppl_grp_flg7", "bsppl_grp_flg7"),
				MCItemDef.create("bsppl_grp_cd7", "bsppl_grp_cd7"),
				MCItemDef.create("bsppl_grp_nm7", "bsppl_grp_nm7"),
				MCItemDef.create("bsppl_grp_flg8", "bsppl_grp_flg8"),
				MCItemDef.create("bsppl_grp_cd8", "bsppl_grp_cd8"),
				MCItemDef.create("bsppl_grp_nm8", "bsppl_grp_nm8"),
				MCItemDef.create("bsppl_grp_flg9", "bsppl_grp_flg9"),
				MCItemDef.create("bsppl_grp_cd9", "bsppl_grp_cd9"),
				MCItemDef.create("bsppl_grp_nm9", "bsppl_grp_nm9"),
				MCItemDef.create("bsppl_grp_flg10", "bsppl_grp_flg10"),
				MCItemDef.create("bsppl_grp_cd10", "bsppl_grp_cd10"),
				MCItemDef.create("bsppl_grp_nm10", "bsppl_grp_nm10"),
				MCItemDef.create("psppl_grp_flg1", "psppl_grp_flg1"),
				MCItemDef.create("psppl_grp_cd1", "psppl_grp_cd1"),
				MCItemDef.create("psppl_grp_nm1", "psppl_grp_nm1"),
				MCItemDef.create("psppl_grp_flg2", "psppl_grp_flg2"),
				MCItemDef.create("psppl_grp_cd2", "psppl_grp_cd2"),
				MCItemDef.create("psppl_grp_nm2", "psppl_grp_nm2"),
				MCItemDef.create("psppl_grp_flg3", "psppl_grp_flg3"),
				MCItemDef.create("psppl_grp_cd3", "psppl_grp_cd3"),
				MCItemDef.create("psppl_grp_nm3", "psppl_grp_nm3"),
				MCItemDef.create("psppl_grp_flg4", "psppl_grp_flg4"),
				MCItemDef.create("psppl_grp_cd4", "psppl_grp_cd4"),
				MCItemDef.create("psppl_grp_nm4", "psppl_grp_nm4"),
				MCItemDef.create("psppl_grp_flg5", "psppl_grp_flg5"),
				MCItemDef.create("psppl_grp_cd5", "psppl_grp_cd5"),
				MCItemDef.create("psppl_grp_nm5", "psppl_grp_nm5"),
				MCItemDef.create("psppl_grp_flg6", "psppl_grp_flg6"),
				MCItemDef.create("psppl_grp_cd6", "psppl_grp_cd6"),
				MCItemDef.create("psppl_grp_nm6", "psppl_grp_nm6"),
				MCItemDef.create("psppl_grp_flg7", "psppl_grp_flg7"),
				MCItemDef.create("psppl_grp_cd7", "psppl_grp_cd7"),
				MCItemDef.create("psppl_grp_nm7", "psppl_grp_nm7"),
				MCItemDef.create("psppl_grp_flg8", "psppl_grp_flg8"),
				MCItemDef.create("psppl_grp_cd8", "psppl_grp_cd8"),
				MCItemDef.create("psppl_grp_nm8", "psppl_grp_nm8"),
				MCItemDef.create("psppl_grp_flg9", "psppl_grp_flg9"),
				MCItemDef.create("psppl_grp_cd9", "psppl_grp_cd9"),
				MCItemDef.create("psppl_grp_nm9", "psppl_grp_nm9"),
				MCItemDef.create("psppl_grp_flg10", "psppl_grp_flg10"),
				MCItemDef.create("psppl_grp_cd10", "psppl_grp_cd10"),
				MCItemDef.create("psppl_grp_nm10", "psppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_d" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ap_d" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ap_d" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("ap_d" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_d" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("bsppl_usr_nm", "bsppl_usr_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("com_paid_tax_amt", "com_paid_tax_amt"),
				MCItemDef.create("last_pay_schd_amt", "last_pay_schd_amt"),
				MCItemDef.create("account_amt", "account_amt"),
				MCItemDef.create("cash_amt", "cash_amt"),
				MCItemDef.create("note_amt", "note_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("setoff_tax_amt", "setoff_tax_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("schd_pay_amt", "schd_pay_amt"),
				MCItemDef.create("adv_pay_bal", "adv_pay_bal"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("inc_interim_flg", "inc_interim_flg"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("unchk_flg", "unchk_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("tax_on_pay_flg", "tax_on_pay_flg"),
				MCItemDef.create("manual_flg", "manual_flg"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("min_ac_dt", "min_ac_dt"),
				MCItemDef.create("max_ac_dt", "max_ac_dt"),
				MCItemDef.create("bsppl_grp_cd1", "bsppl_grp_cd1"),
				MCItemDef.create("bsppl_grp_nm1", "bsppl_grp_nm1"),
				MCItemDef.create("bsppl_grp_cd2", "bsppl_grp_cd2"),
				MCItemDef.create("bsppl_grp_nm2", "bsppl_grp_nm2"),
				MCItemDef.create("bsppl_grp_cd3", "bsppl_grp_cd3"),
				MCItemDef.create("bsppl_grp_nm3", "bsppl_grp_nm3"),
				MCItemDef.create("bsppl_grp_cd4", "bsppl_grp_cd4"),
				MCItemDef.create("bsppl_grp_nm4", "bsppl_grp_nm4"),
				MCItemDef.create("bsppl_grp_cd5", "bsppl_grp_cd5"),
				MCItemDef.create("bsppl_grp_nm5", "bsppl_grp_nm5"),
				MCItemDef.create("bsppl_grp_cd6", "bsppl_grp_cd6"),
				MCItemDef.create("bsppl_grp_nm6", "bsppl_grp_nm6"),
				MCItemDef.create("bsppl_grp_cd7", "bsppl_grp_cd7"),
				MCItemDef.create("bsppl_grp_nm7", "bsppl_grp_nm7"),
				MCItemDef.create("bsppl_grp_cd8", "bsppl_grp_cd8"),
				MCItemDef.create("bsppl_grp_nm8", "bsppl_grp_nm8"),
				MCItemDef.create("bsppl_grp_cd9", "bsppl_grp_cd9"),
				MCItemDef.create("bsppl_grp_nm9", "bsppl_grp_nm9"),
				MCItemDef.create("bsppl_grp_cd10", "bsppl_grp_cd10"),
				MCItemDef.create("bsppl_grp_nm10", "bsppl_grp_nm10"),
				MCItemDef.create("psppl_grp_cd1", "psppl_grp_cd1"),
				MCItemDef.create("psppl_grp_nm1", "psppl_grp_nm1"),
				MCItemDef.create("psppl_grp_cd2", "psppl_grp_cd2"),
				MCItemDef.create("psppl_grp_nm2", "psppl_grp_nm2"),
				MCItemDef.create("psppl_grp_cd3", "psppl_grp_cd3"),
				MCItemDef.create("psppl_grp_nm3", "psppl_grp_nm3"),
				MCItemDef.create("psppl_grp_cd4", "psppl_grp_cd4"),
				MCItemDef.create("psppl_grp_nm4", "psppl_grp_nm4"),
				MCItemDef.create("psppl_grp_cd5", "psppl_grp_cd5"),
				MCItemDef.create("psppl_grp_nm5", "psppl_grp_nm5"),
				MCItemDef.create("psppl_grp_cd6", "psppl_grp_cd6"),
				MCItemDef.create("psppl_grp_nm6", "psppl_grp_nm6"),
				MCItemDef.create("psppl_grp_cd7", "psppl_grp_cd7"),
				MCItemDef.create("psppl_grp_nm7", "psppl_grp_nm7"),
				MCItemDef.create("psppl_grp_cd8", "psppl_grp_cd8"),
				MCItemDef.create("psppl_grp_nm8", "psppl_grp_nm8"),
				MCItemDef.create("psppl_grp_cd9", "psppl_grp_cd9"),
				MCItemDef.create("psppl_grp_nm9", "psppl_grp_nm9"),
				MCItemDef.create("psppl_grp_cd10", "psppl_grp_cd10"),
				MCItemDef.create("psppl_grp_nm10", "psppl_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Apd")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_PayAct")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_AdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0020_Chk01_INFO = new MCOperationInfo("MS", "MSBHL0020", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pay_act_not_ref_flg", "pay_act_not_ref_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Apd")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_PayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_AdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pay_act_not_ref_flg", "pay_act_not_ref_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Apd")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_PayAct")
		);
	}
	public static MCContainerDef MS_MSBHL0020_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_AdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0020_Chk02_INFO = new MCOperationInfo("MS", "MSBHL0020", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0020_Ins01_INFO = new MCOperationInfo("MS", "MSBHL0020", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pay_act_not_ref_flg", "pay_act_not_ref_flg")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Apd")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_PayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_AdvPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Ins01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_sts_typ_nm", "pay_sts_typ_nm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0020_Del01_INFO = new MCOperationInfo("MS", "MSBHL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0020_Prnt01_INFO = new MCOperationInfo("MS", "MSBHL0020", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0020_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBHL0020_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0020_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0020", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

