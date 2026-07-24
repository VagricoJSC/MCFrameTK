package mcframe.serverMSBH.MSBHL5080;

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
 * [MSBHL_ApSetoffService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch01.UP.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch01.DOWN.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch03.UP.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch03.DOWN.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch04.UP.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5080.ApSetoff_Srch04.DOWN.BLOCK0")){
			return MS_MSBHL5080_ApSetoff_Srch04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBHL5080_ApSetoff_Srch01_INFO = new MCOperationInfo("MS", "MSBHL5080", "ApSetoff_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch01",
			new MCItemDef[]{
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ar_typ", "ar_typ")
			}
			,
			MCBlockDef.create("ApSetoff_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch01",
			new MCItemDef[]{
				MCItemDef.create("ar_bal_amt", "ar_bal_amt")
			}
			,
			MCBlockDef.create("ApSetoff_Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5080_ApSetoff_Srch03_INFO = new MCOperationInfo("MS", "MSBHL5080", "ApSetoff_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch03",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("ApSetoff_Srch03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch03",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("onr_prov_bal", "onr_prov_bal")
			}
			,
			MCBlockDef.create("ApSetoff_Srch03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5080_ApSetoff_Srch04_INFO = new MCOperationInfo("MS", "MSBHL5080", "ApSetoff_Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch04",
			new MCItemDef[]{
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dac_vld_flg", "dac_vld_flg"),
				MCItemDef.create("is_src_payschd_flg", "is_src_payschd_flg"),
				MCItemDef.create("asppl_grp_flg1", "asppl_grp_flg1"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_flg2", "asppl_grp_flg2"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_flg3", "asppl_grp_flg3"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_flg4", "asppl_grp_flg4"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_flg5", "asppl_grp_flg5"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_flg6", "asppl_grp_flg6"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_flg7", "asppl_grp_flg7"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_flg8", "asppl_grp_flg8"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_flg9", "asppl_grp_flg9"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_flg10", "asppl_grp_flg10"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10")
			}
			,
			MCBlockDef.create("ApSetoff_Srch04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5080_ApSetoff_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5080", "ApSetoff_Srch04",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("init_bal", "init_bal"),
				MCItemDef.create("onr_prov_amt", "onr_prov_amt"),
				MCItemDef.create("onr_prov_ret_amt", "onr_prov_ret_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("setoff_schd_amt", "setoff_schd_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("end_bal", "end_bal"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_init_bal", "base_cur_init_bal"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_onr_prov_ret_amt", "base_cur_onr_prov_ret_amt"),
				MCItemDef.create("base_cur_setoff_amt", "base_cur_setoff_amt"),
				MCItemDef.create("base_cur_setoff_schd_amt", "base_cur_setoff_schd_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_end_bal", "base_cur_end_bal"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10"),
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
			MCBlockDef.create("ApSetoff_Srch04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

