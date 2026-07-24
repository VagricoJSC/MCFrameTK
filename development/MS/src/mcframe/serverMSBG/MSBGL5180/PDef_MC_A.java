package mcframe.serverMSBG.MSBGL5180;

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
 * [MSBGL_RcvRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5180.Rcv_Chk01.UP.BLOCK0")){
			return MS_MSBGL5180_Rcv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Chk01.DOWN.BLOCK0")){
			return MS_MSBGL5180_Rcv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Chk02.UP.BLOCK0")){
			return MS_MSBGL5180_Rcv_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Chk02.DOWN.BLOCK0")){
			return MS_MSBGL5180_Rcv_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Ins01.UP.BLOCK0")){
			return MS_MSBGL5180_Rcv_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Ins01.DOWN.BLOCK0")){
			return MS_MSBGL5180_Rcv_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Upd01.UP.BLOCK0")){
			return MS_MSBGL5180_Rcv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5180.Rcv_Del01.UP.BLOCK0")){
			return MS_MSBGL5180_Rcv_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBGL5180_Rcv_Chk01_INFO = new MCOperationInfo("MS", "MSBGL5180", "Rcv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5180_Rcv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL5180_Rcv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5180_Rcv_Chk02_INFO = new MCOperationInfo("MS", "MSBGL5180", "Rcv_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5180_Rcv_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("note_mng_no", "note_mng_no")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL5180_Rcv_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("note_mng_no", "note_mng_no")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5180_Rcv_Ins01_INFO = new MCOperationInfo("MS", "MSBGL5180", "Rcv_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5180_Rcv_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL5180_Rcv_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("dat_typ", "dat_typ")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5180_Rcv_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5180", "Rcv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5180_Rcv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5180_Rcv_Del01_INFO = new MCOperationInfo("MS", "MSBGL5180", "Rcv_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5180_Rcv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5180", "Rcv_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("note_mng_no", "note_mng_no")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

