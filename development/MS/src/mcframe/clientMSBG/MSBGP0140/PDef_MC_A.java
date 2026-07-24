package mcframe.clientMSBG.MSBGP0140;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_RcvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0140.Srch01.UP.BLOCK0")){
			return MS_MSBGL0140_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0140_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Ins01.UP.BLOCK0")){
			return MS_MSBGL0140_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Ins01.DOWN.BLOCK0")){
			return MS_MSBGL0140_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Upd01.UP.BLOCK0")){
			return MS_MSBGL0140_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Del01.UP.BLOCK0")){
			return MS_MSBGL0140_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0140.Prnt01.UP.BLOCK0")){
			return MS_MSBGL0140_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBGL0140_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0140", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0140_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0140_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "rcv_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "rcv_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("rcv_proc_amt_p" + ".amt", "rcv_proc_amt"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("def_bank_ac_cd", "def_bank_ac_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("auto_appl_delay_days", "auto_appl_delay_days"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
				MCItemDef.create("auto_appl_sts_typ", "auto_appl_sts_typ"),
				MCItemDef.create("auto_appl_sts_typ_nm", "auto_appl_sts_typ_nm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_bank_nm", "draw_bank_nm"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("draw_branch_nm", "draw_branch_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("dat_typ", "dat_typ")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0140_Ins01_INFO = new MCOperationInfo("MS", "MSBGL0140", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0140_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "rcv_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
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
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL0140_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("dat_typ", "dat_typ")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0140_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0140", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0140_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "rcv_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
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
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0140_Del01_INFO = new MCOperationInfo("MS", "MSBGL0140", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0140_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Del01",
			new MCItemDef[]{
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0140_Prnt01_INFO = new MCOperationInfo("MS", "MSBGL0140", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0140_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0140", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

