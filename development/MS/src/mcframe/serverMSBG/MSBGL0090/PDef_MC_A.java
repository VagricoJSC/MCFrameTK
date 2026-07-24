package mcframe.serverMSBG.MSBGL0090;

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
 * [MSBGL_MlyArBalSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0090.Srch01.UP.BLOCK0")){
			return MS_MSBGL0090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0090.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0090_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0090_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0090", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0090_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_dpt_flg", "ar_dpt_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("trd_cur_flg", "trd_cur_flg"),
				MCItemDef.create("wrk_no_flg", "wrk_no_flg"),
				MCItemDef.create("ar_typ_flg", "ar_typ_flg"),
				MCItemDef.create("acst_grp_flg1", "acst_grp_flg1"),
				MCItemDef.create("acst_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_flg2", "acst_grp_flg2"),
				MCItemDef.create("acst_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_flg3", "acst_grp_flg3"),
				MCItemDef.create("acst_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_flg4", "acst_grp_flg4"),
				MCItemDef.create("acst_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_flg5", "acst_grp_flg5"),
				MCItemDef.create("acst_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_flg6", "acst_grp_flg6"),
				MCItemDef.create("acst_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_flg7", "acst_grp_flg7"),
				MCItemDef.create("acst_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_flg8", "acst_grp_flg8"),
				MCItemDef.create("acst_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_flg9", "acst_grp_flg9"),
				MCItemDef.create("acst_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_flg10", "acst_grp_flg10"),
				MCItemDef.create("acst_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_nm10", "acst_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0090_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("init_bal", "init_bal"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("cl_day", "cl_day"),
				MCItemDef.create("bef_cl_sls_amt", "bef_cl_sls_amt"),
				MCItemDef.create("aft_cl_sls_amt", "aft_cl_sls_amt"),
				MCItemDef.create("end_bal", "end_bal"),
				MCItemDef.create("not_appl_note", "not_appl_note"),
				MCItemDef.create("mly_not_appl_note", "mly_not_appl_note"),
				MCItemDef.create("cash_amt", "cash_amt"),
				MCItemDef.create("note_amt", "note_amt"),
				MCItemDef.create("xfr_amt", "xfr_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_amt_dec_place", "base_amt_dec_place"),
				MCItemDef.create("base_cur_init_bal", "base_cur_init_bal"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_bef_cl_sls_amt", "base_cur_bef_cl_sls_amt"),
				MCItemDef.create("base_cur_aft_cl_sls_amt", "base_cur_aft_cl_sls_amt"),
				MCItemDef.create("base_cur_end_bal", "base_cur_end_bal"),
				MCItemDef.create("base_cur_not_appl_note", "base_cur_not_appl_note"),
				MCItemDef.create("base_cur_mly_not_appl_note", "base_cur_mly_not_appl_note"),
				MCItemDef.create("base_cur_cash_amt", "base_cur_cash_amt"),
				MCItemDef.create("base_cur_note_amt", "base_cur_note_amt"),
				MCItemDef.create("base_cur_xfr_amt", "base_cur_xfr_amt"),
				MCItemDef.create("base_cur_setoff_amt", "base_cur_setoff_amt"),
				MCItemDef.create("base_cur_sw_amt", "base_cur_sw_amt"),
				MCItemDef.create("exc_gain_loss", "exc_gain_loss"),
				MCItemDef.create("total_exc_gain_loss", "total_exc_gain_loss"),
				MCItemDef.create("acst_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_nm10", "acst_grp_nm10"),
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
	//FMCB DEF_CLASSES END
}

