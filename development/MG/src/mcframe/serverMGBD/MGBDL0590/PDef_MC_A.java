package mcframe.serverMGBD.MGBDL0590;

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
 * [MGBDL_ItmSlsReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0590.Srch01.UP.BLOCK0")){
			return MG_MGBDL0590_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0590_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Chk01.UP.BLOCK0")){
			return MG_MGBDL0590_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Chk01.UP.BLOCK1")){
			return MG_MGBDL0590_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0590.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0590_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Chk02.UP.BLOCK0")){
			return MG_MGBDL0590_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Chk02.UP.BLOCK1")){
			return MG_MGBDL0590_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0590.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0590_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Upd01.UP.BLOCK0")){
			return MG_MGBDL0590_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Upd01.UP.BLOCK1")){
			return MG_MGBDL0590_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0590.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0590_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Del01.UP.BLOCK0")){
			return MG_MGBDL0590_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Del01.UP.BLOCK1")){
			return MG_MGBDL0590_Del01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0590.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0590_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Imp01.UP.BLOCK0")){
			return MG_MGBDL0590_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0590.Imp01.UP.BLOCK1")){
			return MG_MGBDL0590_Imp01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0590.Imp01.DOWN.BLOCK0")){
			return MG_MGBDL0590_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MG_MGBDL0590_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0590", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_cntry_cd", "cst_cntry_cd"),
				MCItemDef.create("cst_cntry_nm", "cst_cntry_nm"),
				MCItemDef.create("cst_area_cd", "cst_area_cd"),
				MCItemDef.create("cst_area_nm", "cst_area_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_area_cd", "dlv_area_cd"),
				MCItemDef.create("dlv_area_nm", "dlv_area_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("off_non_calc_flg", "off_non_calc_flg"),
				MCItemDef.create("on_non_calc_flg", "on_non_calc_flg"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("upri", "upri"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("alc_val1", "alc_val1"),
				MCItemDef.create("alc_val2", "alc_val2"),
				MCItemDef.create("alc_val3", "alc_val3"),
				MCItemDef.create("alc_val4", "alc_val4"),
				MCItemDef.create("alc_val5", "alc_val5"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("non_calc_flg", "non_calc_flg"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0590_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0590", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".base_qty", "base_qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".upri", "upri"),
				MCItemDef.create("dbc" + ".prio", "prio"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_upri", "calc_upri")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0590_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".base_qty", "base_qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".upri", "upri"),
				MCItemDef.create("dbc" + ".prio", "prio"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("calc_upri", "calc_upri"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0590_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0590", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0590_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Chk02_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0590_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0590", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_upri", "calc_upri"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".base_qty", "base_qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".upri", "upri"),
				MCItemDef.create("dbc" + ".prio", "prio"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0590_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0590_Del01_INFO = new MCOperationInfo("MG", "MGBDL0590", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0590_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Del01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0590_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0590", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0590_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".base_qty", "base_qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".upri", "upri"),
				MCItemDef.create("dbc" + ".prio", "prio"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0590_Imp01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg")
			}
			,
			MCBlockDef.create("Imp01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0590_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0590", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".base_qty", "base_qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".upri", "upri"),
				MCItemDef.create("dbc" + ".prio", "prio"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

