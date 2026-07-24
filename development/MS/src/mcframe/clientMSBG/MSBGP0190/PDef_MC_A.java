package mcframe.clientMSBG.MSBGP0190;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_NoteSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0190.Srch01.UP.BLOCK0")){
			return MS_MSBGL0190_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0190.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0190_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0190_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0190", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0190_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("not_mat_flg", "not_mat_flg"),
				MCItemDef.create("mat_flg", "mat_flg"),
				MCItemDef.create("fb_t_flg", "fb_t_flg"),
				MCItemDef.create("fb_f_flg", "fb_f_flg"),
				MCItemDef.create("rcv_dt_fr", "rcv_dt_fr"),
				MCItemDef.create("rcv_dt_to", "rcv_dt_to"),
				MCItemDef.create("draw_dt_fr", "draw_dt_fr"),
				MCItemDef.create("draw_dt_to", "draw_dt_to"),
				MCItemDef.create("due_dt_fr", "due_dt_fr"),
				MCItemDef.create("due_dt_to", "due_dt_to"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_usr_nm", "rcv_usr_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg1", "rcv_grp_flg1"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd1", "rcv_grp_cd1"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm1", "rcv_grp_nm1"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg2", "rcv_grp_flg2"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd2", "rcv_grp_cd2"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm2", "rcv_grp_nm2"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg3", "rcv_grp_flg3"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd3", "rcv_grp_cd3"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm3", "rcv_grp_nm3"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg4", "rcv_grp_flg4"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd4", "rcv_grp_cd4"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm4", "rcv_grp_nm4"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg5", "rcv_grp_flg5"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd5", "rcv_grp_cd5"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm5", "rcv_grp_nm5"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg6", "rcv_grp_flg6"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd6", "rcv_grp_cd6"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm6", "rcv_grp_nm6"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg7", "rcv_grp_flg7"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd7", "rcv_grp_cd7"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm7", "rcv_grp_nm7"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg8", "rcv_grp_flg8"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd8", "rcv_grp_cd8"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm8", "rcv_grp_nm8"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg9", "rcv_grp_flg9"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd9", "rcv_grp_cd9"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm9", "rcv_grp_nm9"),
				MCItemDef.create("rcv_grp" + ".bp_grp_flg10", "rcv_grp_flg10"),
				MCItemDef.create("rcv_grp" + ".bp_grp_cd10", "rcv_grp_cd10"),
				MCItemDef.create("rcv_grp" + ".bp_grp_nm10", "rcv_grp_nm10"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg1", "bill_grp_flg1"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd1", "bill_grp_cd1"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm1", "bill_grp_nm1"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg2", "bill_grp_flg2"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd2", "bill_grp_cd2"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm2", "bill_grp_nm2"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg3", "bill_grp_flg3"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd3", "bill_grp_cd3"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm3", "bill_grp_nm3"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg4", "bill_grp_flg4"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd4", "bill_grp_cd4"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm4", "bill_grp_nm4"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg5", "bill_grp_flg5"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd5", "bill_grp_cd5"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm5", "bill_grp_nm5"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg6", "bill_grp_flg6"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd6", "bill_grp_cd6"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm6", "bill_grp_nm6"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg7", "bill_grp_flg7"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd7", "bill_grp_cd7"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm7", "bill_grp_nm7"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg8", "bill_grp_flg8"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd8", "bill_grp_cd8"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm8", "bill_grp_nm8"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg9", "bill_grp_flg9"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd9", "bill_grp_cd9"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm9", "bill_grp_nm9"),
				MCItemDef.create("bill_grp" + ".bp_grp_flg10", "bill_grp_flg10"),
				MCItemDef.create("bill_grp" + ".bp_grp_cd10", "bill_grp_cd10"),
				MCItemDef.create("bill_grp" + ".bp_grp_nm10", "bill_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0190_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mat_flg", "mat_flg"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("rcv_usr_nm", "rcv_usr_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
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
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("fb_flg", "fb_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_rcv_no", "ext_rcv_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd1", "rcv_grp_cd1"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm1", "rcv_grp_nm1"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd2", "rcv_grp_cd2"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm2", "rcv_grp_nm2"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd3", "rcv_grp_cd3"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm3", "rcv_grp_nm3"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd4", "rcv_grp_cd4"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm4", "rcv_grp_nm4"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd5", "rcv_grp_cd5"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm5", "rcv_grp_nm5"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd6", "rcv_grp_cd6"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm6", "rcv_grp_nm6"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd7", "rcv_grp_cd7"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm7", "rcv_grp_nm7"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd8", "rcv_grp_cd8"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm8", "rcv_grp_nm8"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd9", "rcv_grp_cd9"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm9", "rcv_grp_nm9"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_cd10", "rcv_grp_cd10"),
				MCItemDef.create("rcv_grp_p" + ".bp_grp_nm10", "rcv_grp_nm10"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd1", "bill_grp_cd1"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm1", "bill_grp_nm1"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd2", "bill_grp_cd2"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm2", "bill_grp_nm2"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd3", "bill_grp_cd3"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm3", "bill_grp_nm3"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd4", "bill_grp_cd4"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm4", "bill_grp_nm4"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd5", "bill_grp_cd5"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm5", "bill_grp_nm5"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd6", "bill_grp_cd6"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm6", "bill_grp_nm6"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd7", "bill_grp_cd7"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm7", "bill_grp_nm7"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd8", "bill_grp_cd8"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm8", "bill_grp_nm8"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd9", "bill_grp_cd9"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm9", "bill_grp_nm9"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_cd10", "bill_grp_cd10"),
				MCItemDef.create("bill_grp_p" + ".bp_grp_nm10", "bill_grp_nm10"),
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
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

