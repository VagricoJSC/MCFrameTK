package mcframe.serverMSLA.MSLAL9010;

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
 * [MSLAL_RcvRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL9010_RcvRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9010.RcvRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL9010_RcvRecvIf_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL9010_RcvRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL9010", "RcvRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("rcv" + ".rcst_cd", "rcst_cd"),
				MCItemDef.create("rcv" + ".bcst_cd", "bcst_cd"),
				MCItemDef.create("rcv" + ".bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("rcv" + ".rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv" + ".rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv" + ".rcv_dt", "rcv_dt"),
				MCItemDef.create("rcv" + ".rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcv" + ".xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv" + ".ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("rcv" + ".bank_cd", "bank_cd"),
				MCItemDef.create("rcv" + ".xrate", "xrate"),
				MCItemDef.create("rcv" + ".rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv" + ".com_paid", "com_paid"),
				MCItemDef.create("rcv" + ".rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv" + ".note_no", "note_no"),
				MCItemDef.create("rcv" + ".note_typ", "note_typ"),
				MCItemDef.create("rcv" + ".draw_dt", "draw_dt"),
				MCItemDef.create("rcv" + ".due_dt", "due_dt"),
				MCItemDef.create("rcv" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("rcv" + ".endrsr", "endrsr"),
				MCItemDef.create("rcv" + ".accptr", "accptr"),
				MCItemDef.create("rcv" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("rcv" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("rcv" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("rcv" + ".batch_log_no", "batch_log_no"),
				MCItemDef.create("rcv" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("rcv" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("rcv" + ".data_lno", "data_lno"),
				MCItemDef.create("rcv" + ".data_no", "data_no"),
				MCItemDef.create("rcv" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv" + ".ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("rcv" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("rcv" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("rcv" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("rcv" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("rcv" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("rcv" + ".imp_flg", "imp_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt")
			}
			,
			MCBlockDef.create("RcvRecvIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("rcv" + ".rcst_cd", "rcst_cd"),
				MCItemDef.create("rcv" + ".data_lno", "data_lno"),
				MCItemDef.create("rcv" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("auto_appl_basis_dt", "auto_appl_basis_dt")
			}
			,
			MCBlockDef.create("RcvRecvIf_Chk01_Cnd")
		);
	}
	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("opn_flg", "opn_flg"),
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
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place")
			}
			,
			MCBlockDef.create("RcvRecvIf_Chk01_Dtl01")
		);
	}
	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("RcvRecvIf_Chk01_Dtl02")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9010_RcvRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL9010", "RcvRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9010_RcvRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL9010", "RcvRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9010_RcvRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL9010", "RcvRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("rcv" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("rcv" + ".rcst_cd", "rcst_cd"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("data_lno", "data_lno")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9010_RcvRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL9010", "RcvRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("rcv" + ".rcst_cd", "rcst_cd"),
				MCItemDef.create("rcv" + ".bcst_cd", "bcst_cd"),
				MCItemDef.create("rcv" + ".bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("rcv" + ".rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv" + ".rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv" + ".rcv_dt", "rcv_dt"),
				MCItemDef.create("rcv" + ".rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcv" + ".xfr_psn", "xfr_psn"),
				MCItemDef.create("rcv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv" + ".xrate", "xrate"),
				MCItemDef.create("rcv" + ".rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv" + ".com_paid", "com_paid"),
				MCItemDef.create("rcv" + ".rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv" + ".note_no", "note_no"),
				MCItemDef.create("rcv" + ".note_typ", "note_typ"),
				MCItemDef.create("rcv" + ".draw_dt", "draw_dt"),
				MCItemDef.create("rcv" + ".due_dt", "due_dt"),
				MCItemDef.create("rcv" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("rcv" + ".endrsr", "endrsr"),
				MCItemDef.create("rcv" + ".accptr", "accptr"),
				MCItemDef.create("rcv" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("rcv" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("rcv" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("rcv" + ".batch_log_no", "batch_log_no"),
				MCItemDef.create("rcv" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("rcv" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("rcv" + ".data_lno", "data_lno"),
				MCItemDef.create("rcv" + ".data_no", "data_no"),
				MCItemDef.create("rcv" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv" + ".ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("rcv" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("rcv" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("rcv" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("rcv" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("rcv" + ".imp_flg", "imp_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9010_RcvRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9010", "RcvRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("rcv" + ".rcst_cd", "rcst_cd"),
				MCItemDef.create("rcv" + ".data_lno", "data_lno"),
				MCItemDef.create("rcv" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

