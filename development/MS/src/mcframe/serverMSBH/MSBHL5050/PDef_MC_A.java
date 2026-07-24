package mcframe.serverMSBH.MSBHL5050;

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
 * [MSBHL_AdvPayRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5050.AdvPay_Chk01.UP.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Chk02.UP.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Chk02.DOWN.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Ins01.UP.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Ins01.DOWN.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Upd01.UP.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Upd01.DOWN.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5050.AdvPay_Del01.UP.BLOCK0")){
			return MS_MSBHL5050_AdvPay_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBHL5050_AdvPay_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5050", "AdvPay_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5050_AdvPay_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("apa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apa" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("apa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("apa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("apa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("apa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("apa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("apa" + ".xrate", "xrate"),
				MCItemDef.create("apa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("apa" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("apa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("apa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("apa" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apa" + ".trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("apa" + ".pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("apa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("apa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("apa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("apa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("apa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5050_AdvPay_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("note_data_crud_typ", "note_data_crud_typ"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("apa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("apa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apa" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("apa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("apa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("apa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("apa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("apa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("apa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("apa" + ".xrate", "xrate"),
				MCItemDef.create("apa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("apa" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("apa" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("apa" + ".com_paid_ac_rsn_cd", "com_paid_ac_rsn_cd"),
				MCItemDef.create("apa" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("apa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("apa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("apa" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apa" + ".trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("apa" + ".pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("apa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("apa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("apa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("apa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("apa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pn" + ".pay_note_mng_no", "pay_note_mng_no"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5050_AdvPay_Chk02_INFO = new MCOperationInfo("MS", "MSBHL5050", "AdvPay_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5050_AdvPay_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5050_AdvPay_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pn" + ".pay_note_mng_no", "pay_note_mng_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5050_AdvPay_Ins01_INFO = new MCOperationInfo("MS", "MSBHL5050", "AdvPay_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5050_AdvPay_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("apa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("apa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apa" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("apa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("apa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("apa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("apa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("apa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("apa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("apa" + ".xrate", "xrate"),
				MCItemDef.create("apa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("apa" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("apa" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("apa" + ".com_paid_ac_rsn_cd", "com_paid_ac_rsn_cd"),
				MCItemDef.create("apa" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("apa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("apa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("apa" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apa" + ".trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("apa" + ".pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("apa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("apa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("apa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("apa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("apa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5050_AdvPay_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("apa" + ".adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("apa" + ".ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5050_AdvPay_Upd01_INFO = new MCOperationInfo("MS", "MSBHL5050", "AdvPay_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5050_AdvPay_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("note_data_crud_typ", "note_data_crud_typ"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("apa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("apa" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apa" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("apa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("apa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("apa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("apa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("apa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("apa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("apa" + ".xrate", "xrate"),
				MCItemDef.create("apa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("apa" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("apa" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("apa" + ".com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("apa" + ".com_paid_ac_rsn_cd", "com_paid_ac_rsn_cd"),
				MCItemDef.create("apa" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("apa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("apa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("apa" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apa" + ".trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("apa" + ".pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("apa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("apa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("apa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("apa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("apa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5050_AdvPay_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("apa" + ".adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("apa" + ".ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5050_AdvPay_Del01_INFO = new MCOperationInfo("MS", "MSBHL5050", "AdvPay_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5050_AdvPay_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5050", "AdvPay_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("apa" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("apa" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pn" + ".pay_note_mng_no", "pay_note_mng_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("AdvPay_Chk01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

