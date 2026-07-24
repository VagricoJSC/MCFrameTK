package mcframe.clientMSBG.MSBGP0160;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_RcvDivReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0160.Srch01.UP.BLOCK0")){
			return MS_MSBGL0160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0160.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0160.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0160_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0160.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0160_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0160.Upd01.UP.BLOCK0")){
			return MS_MSBGL0160_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0160.Upd01.UP.BLOCK1")){
			return MS_MSBGL0160_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0160.Upd01.DOWN.BLOCK0")){
			return MS_MSBGL0160_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0160.Upd01.DOWN.BLOCK1")){
			return MS_MSBGL0160_Upd01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0160_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0160_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_schd_dt_fr", "rcv_schd_dt_fr"),
				MCItemDef.create("rcv_schd_dt_to", "rcv_schd_dt_to"),
				MCItemDef.create("inc_not_cl_flg", "inc_not_cl_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0160_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_usr_nm", "rcv_usr_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
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
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("rcv_proc_amt_p" + ".amt", "rcv_proc_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
				MCItemDef.create("auto_appl_sts_typ", "auto_appl_sts_typ"),
				MCItemDef.create("auto_appl_sts_typ_nm", "auto_appl_sts_typ_nm"),
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
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("rcv_dat_typ", "rcv_dat_typ"),
				MCItemDef.create("div_src_rcv_no", "div_src_rcv_no")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBGL0160_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_RcvDiv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("rcv_proc_amt_p" + ".amt", "rcv_proc_amt"),
				MCItemDef.create("not_proc_amt_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("div_src_rcv_upd_cntr", "div_src_rcv_upd_cntr")
			}
			,
			MCBlockDef.create("RcvDiv")
		);
	}
	public static MCContainerDef MS_MSBGL0160_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_RcvSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("rcv_schd_amt_p" + ".amt", "rcv_schd_amt"),
				MCItemDef.create("bill_no", "bill_no")
			}
			,
			MCBlockDef.create("RcvSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0160_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0160", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0160_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBGL0160_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_RcvDiv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("not_proc_amt_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("com_paid_p" + ".amt", "com_paid"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_sub_char1", "rcv_sub_char1"),
				MCItemDef.create("rcv_sub_char2", "rcv_sub_char2"),
				MCItemDef.create("rcv_sub_char3", "rcv_sub_char3"),
				MCItemDef.create("div_src_rcv_upd_cntr", "div_src_rcv_upd_cntr")
			}
			,
			MCBlockDef.create("RcvDiv")
		);
	}


	public static MCContainerDef MS_MSBGL0160_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_proc_amt_p" + ".amt", "rcv_proc_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("div_flg", "div_flg")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBGL0160_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_RcvDiv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("RcvDiv")
		);
	}
	//FMCB DEF_CLASSES END
}

