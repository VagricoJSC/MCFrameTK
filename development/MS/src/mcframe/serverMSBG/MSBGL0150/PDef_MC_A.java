package mcframe.serverMSBG.MSBGL0150;

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
 * [MSBGL_NotApplSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0150.Srch01.UP.BLOCK0")){
			return MS_MSBGL0150_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0150.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0150_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0150.Prnt01.UP.BLOCK0")){
			return MS_MSBGL0150_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0150.Prnt01.UP.BLOCK1")){
			return MS_MSBGL0150_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0150.Prnt01.DOWN.BLOCK0")){
			return MS_MSBGL0150_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0150_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0150", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0150_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("scr_ope_flg", "scr_ope_flg"),
				MCItemDef.create("rcv_flg", "rcv_flg"),
				MCItemDef.create("susp_flg", "susp_flg"),
				MCItemDef.create("adv_flg", "adv_flg"),
				MCItemDef.create("ap_flg", "ap_flg"),
				MCItemDef.create("not_prnt_flg", "not_prnt_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("fb_t_flg", "fb_t_flg"),
				MCItemDef.create("fb_f_flg", "fb_f_flg"),
				MCItemDef.create("rcv_dt_fr", "rcv_dt_fr"),
				MCItemDef.create("rcv_dt_to", "rcv_dt_to"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_usr_nm", "rcv_usr_nm"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("auto_appl_sts_typ", "auto_appl_sts_typ"),
				MCItemDef.create("if_rcv_no", "if_rcv_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("proc_flg", "proc_flg"),
				MCItemDef.create("rcv_grp_flg1", "rcv_grp_flg1"),
				MCItemDef.create("rcv_grp_cd1", "rcv_grp_cd1"),
				MCItemDef.create("rcv_grp_nm1", "rcv_grp_nm1"),
				MCItemDef.create("rcv_grp_flg2", "rcv_grp_flg2"),
				MCItemDef.create("rcv_grp_cd2", "rcv_grp_cd2"),
				MCItemDef.create("rcv_grp_nm2", "rcv_grp_nm2"),
				MCItemDef.create("rcv_grp_flg3", "rcv_grp_flg3"),
				MCItemDef.create("rcv_grp_cd3", "rcv_grp_cd3"),
				MCItemDef.create("rcv_grp_nm3", "rcv_grp_nm3"),
				MCItemDef.create("rcv_grp_flg4", "rcv_grp_flg4"),
				MCItemDef.create("rcv_grp_cd4", "rcv_grp_cd4"),
				MCItemDef.create("rcv_grp_nm4", "rcv_grp_nm4"),
				MCItemDef.create("rcv_grp_flg5", "rcv_grp_flg5"),
				MCItemDef.create("rcv_grp_cd5", "rcv_grp_cd5"),
				MCItemDef.create("rcv_grp_nm5", "rcv_grp_nm5"),
				MCItemDef.create("rcv_grp_flg6", "rcv_grp_flg6"),
				MCItemDef.create("rcv_grp_cd6", "rcv_grp_cd6"),
				MCItemDef.create("rcv_grp_nm6", "rcv_grp_nm6"),
				MCItemDef.create("rcv_grp_flg7", "rcv_grp_flg7"),
				MCItemDef.create("rcv_grp_cd7", "rcv_grp_cd7"),
				MCItemDef.create("rcv_grp_nm7", "rcv_grp_nm7"),
				MCItemDef.create("rcv_grp_flg8", "rcv_grp_flg8"),
				MCItemDef.create("rcv_grp_cd8", "rcv_grp_cd8"),
				MCItemDef.create("rcv_grp_nm8", "rcv_grp_nm8"),
				MCItemDef.create("rcv_grp_flg9", "rcv_grp_flg9"),
				MCItemDef.create("rcv_grp_cd9", "rcv_grp_cd9"),
				MCItemDef.create("rcv_grp_nm9", "rcv_grp_nm9"),
				MCItemDef.create("rcv_grp_flg10", "rcv_grp_flg10"),
				MCItemDef.create("rcv_grp_cd10", "rcv_grp_cd10"),
				MCItemDef.create("rcv_grp_nm10", "rcv_grp_nm10"),
				MCItemDef.create("bill_grp_flg1", "bill_grp_flg1"),
				MCItemDef.create("bill_grp_cd1", "bill_grp_cd1"),
				MCItemDef.create("bill_grp_nm1", "bill_grp_nm1"),
				MCItemDef.create("bill_grp_flg2", "bill_grp_flg2"),
				MCItemDef.create("bill_grp_cd2", "bill_grp_cd2"),
				MCItemDef.create("bill_grp_nm2", "bill_grp_nm2"),
				MCItemDef.create("bill_grp_flg3", "bill_grp_flg3"),
				MCItemDef.create("bill_grp_cd3", "bill_grp_cd3"),
				MCItemDef.create("bill_grp_nm3", "bill_grp_nm3"),
				MCItemDef.create("bill_grp_flg4", "bill_grp_flg4"),
				MCItemDef.create("bill_grp_cd4", "bill_grp_cd4"),
				MCItemDef.create("bill_grp_nm4", "bill_grp_nm4"),
				MCItemDef.create("bill_grp_flg5", "bill_grp_flg5"),
				MCItemDef.create("bill_grp_cd5", "bill_grp_cd5"),
				MCItemDef.create("bill_grp_nm5", "bill_grp_nm5"),
				MCItemDef.create("bill_grp_flg6", "bill_grp_flg6"),
				MCItemDef.create("bill_grp_cd6", "bill_grp_cd6"),
				MCItemDef.create("bill_grp_nm6", "bill_grp_nm6"),
				MCItemDef.create("bill_grp_flg7", "bill_grp_flg7"),
				MCItemDef.create("bill_grp_cd7", "bill_grp_cd7"),
				MCItemDef.create("bill_grp_nm7", "bill_grp_nm7"),
				MCItemDef.create("bill_grp_flg8", "bill_grp_flg8"),
				MCItemDef.create("bill_grp_cd8", "bill_grp_cd8"),
				MCItemDef.create("bill_grp_nm8", "bill_grp_nm8"),
				MCItemDef.create("bill_grp_flg9", "bill_grp_flg9"),
				MCItemDef.create("bill_grp_cd9", "bill_grp_cd9"),
				MCItemDef.create("bill_grp_nm9", "bill_grp_nm9"),
				MCItemDef.create("bill_grp_flg10", "bill_grp_flg10"),
				MCItemDef.create("bill_grp_cd10", "bill_grp_cd10"),
				MCItemDef.create("bill_grp_nm10", "bill_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0150_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_dat_typ", "rcv_dat_typ"),
				MCItemDef.create("rcv_dat_typ_nm", "rcv_dat_typ_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_usr_nm", "rcv_usr_nm"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal", "not_proc_bal"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("auto_appl_sts_typ", "auto_appl_sts_typ"),
				MCItemDef.create("auto_appl_sts_typ_nm", "auto_appl_sts_typ_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("rcv_rmrks", "rcv_rmrks"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("div_src_rcv_no", "div_src_rcv_no"),
				MCItemDef.create("src_rcv_act_no", "src_rcv_act_no"),
				MCItemDef.create("if_rcv_no", "if_rcv_no"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_grp_cd1", "rcv_grp_cd1"),
				MCItemDef.create("rcv_grp_nm1", "rcv_grp_nm1"),
				MCItemDef.create("rcv_grp_cd2", "rcv_grp_cd2"),
				MCItemDef.create("rcv_grp_nm2", "rcv_grp_nm2"),
				MCItemDef.create("rcv_grp_cd3", "rcv_grp_cd3"),
				MCItemDef.create("rcv_grp_nm3", "rcv_grp_nm3"),
				MCItemDef.create("rcv_grp_cd4", "rcv_grp_cd4"),
				MCItemDef.create("rcv_grp_nm4", "rcv_grp_nm4"),
				MCItemDef.create("rcv_grp_cd5", "rcv_grp_cd5"),
				MCItemDef.create("rcv_grp_nm5", "rcv_grp_nm5"),
				MCItemDef.create("rcv_grp_cd6", "rcv_grp_cd6"),
				MCItemDef.create("rcv_grp_nm6", "rcv_grp_nm6"),
				MCItemDef.create("rcv_grp_cd7", "rcv_grp_cd7"),
				MCItemDef.create("rcv_grp_nm7", "rcv_grp_nm7"),
				MCItemDef.create("rcv_grp_cd8", "rcv_grp_cd8"),
				MCItemDef.create("rcv_grp_nm8", "rcv_grp_nm8"),
				MCItemDef.create("rcv_grp_cd9", "rcv_grp_cd9"),
				MCItemDef.create("rcv_grp_nm9", "rcv_grp_nm9"),
				MCItemDef.create("rcv_grp_cd10", "rcv_grp_cd10"),
				MCItemDef.create("rcv_grp_nm10", "rcv_grp_nm10"),
				MCItemDef.create("bill_grp_cd1", "bill_grp_cd1"),
				MCItemDef.create("bill_grp_nm1", "bill_grp_nm1"),
				MCItemDef.create("bill_grp_cd2", "bill_grp_cd2"),
				MCItemDef.create("bill_grp_nm2", "bill_grp_nm2"),
				MCItemDef.create("bill_grp_cd3", "bill_grp_cd3"),
				MCItemDef.create("bill_grp_nm3", "bill_grp_nm3"),
				MCItemDef.create("bill_grp_cd4", "bill_grp_cd4"),
				MCItemDef.create("bill_grp_nm4", "bill_grp_nm4"),
				MCItemDef.create("bill_grp_cd5", "bill_grp_cd5"),
				MCItemDef.create("bill_grp_nm5", "bill_grp_nm5"),
				MCItemDef.create("bill_grp_cd6", "bill_grp_cd6"),
				MCItemDef.create("bill_grp_nm6", "bill_grp_nm6"),
				MCItemDef.create("bill_grp_cd7", "bill_grp_cd7"),
				MCItemDef.create("bill_grp_nm7", "bill_grp_nm7"),
				MCItemDef.create("bill_grp_cd8", "bill_grp_cd8"),
				MCItemDef.create("bill_grp_nm8", "bill_grp_nm8"),
				MCItemDef.create("bill_grp_cd9", "bill_grp_cd9"),
				MCItemDef.create("bill_grp_nm9", "bill_grp_nm9"),
				MCItemDef.create("bill_grp_cd10", "bill_grp_cd10"),
				MCItemDef.create("bill_grp_nm10", "bill_grp_nm10"),
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
	
	static final MCOperationInfo MS_MSBGL0150_Prnt01_INFO = new MCOperationInfo("MS", "MSBGL0150", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0150_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0150", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBGL0150_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0150", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_RCnd")
		);
	}


	public static MCContainerDef MS_MSBGL0150_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0150", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

