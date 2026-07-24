package mcframe.serverMGBA.MGBAL0010;

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
 * [MGBAL_PlnSlsReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBAL0010.Srch01.UP.BLOCK0")){
			return MG_MGBAL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Srch01.DOWN.BLOCK0")){
			return MG_MGBAL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk01.UP.BLOCK0")){
			return MG_MGBAL0010_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk01.UP.BLOCK1")){
			return MG_MGBAL0010_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBAL0010.Chk01.DOWN.BLOCK0")){
			return MG_MGBAL0010_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk02.UP.BLOCK0")){
			return MG_MGBAL0010_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk02.DOWN.BLOCK0")){
			return MG_MGBAL0010_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk03.UP.BLOCK0")){
			return MG_MGBAL0010_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk03.DOWN.BLOCK0")){
			return MG_MGBAL0010_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk04.UP.BLOCK0")){
			return MG_MGBAL0010_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Chk04.DOWN.BLOCK0")){
			return MG_MGBAL0010_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Upd01.UP.BLOCK0")){
			return MG_MGBAL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Upd01.DOWN.BLOCK0")){
			return MG_MGBAL0010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Del01.UP.BLOCK0")){
			return MG_MGBAL0010_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Del01.DOWN.BLOCK0")){
			return MG_MGBAL0010_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Del02.UP.BLOCK0")){
			return MG_MGBAL0010_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Imp01.UP.BLOCK0")){
			return MG_MGBAL0010_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Imp01.DOWN.BLOCK0")){
			return MG_MGBAL0010_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Ins01.UP.BLOCK0")){
			return MG_MGBAL0010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Ins02.UP.BLOCK0")){
			return MG_MGBAL0010_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0010.Ins02.UP.BLOCK1")){
			return MG_MGBAL0010_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBAL0010.Ins03.UP.BLOCK0")){
			return MG_MGBAL0010_Ins03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MG_MGBAL0010_Srch01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
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
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("asst_typ", "asst_typ"),
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
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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


	public static MCContainerDef MG_MGBAL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pln_sls_key", "pln_sls_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
	
	static final MCOperationInfo MG_MGBAL0010_Chk01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBAL0010_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("file_ins_flg", "file_ins_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Chk02_INFO = new MCOperationInfo("MG", "MGBAL0010", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Chk03_INFO = new MCOperationInfo("MG", "MGBAL0010", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Chk04_INFO = new MCOperationInfo("MG", "MGBAL0010", "Chk04", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("sls_pln_imp_typ", "sls_pln_imp_typ")
			}
			,
			MCBlockDef.create("Chk04_Cnd")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("sls_pln_imp_typ", "sls_pln_imp_typ")
			}
			,
			MCBlockDef.create("Chk04_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Upd01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Del01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Del02_INFO = new MCOperationInfo("MG", "MGBAL0010", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Imp01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0010_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Ins01_INFO = new MCOperationInfo("MG", "MGBAL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Ins02_INFO = new MCOperationInfo("MG", "MGBAL0010", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBAL0010_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_sls_key", "pln_sls_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".unit_cd", "unit_cd"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0010_Ins03_INFO = new MCOperationInfo("MG", "MGBAL0010", "Ins03", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0010_Ins03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0010", "Ins03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("sls_pln_imp_typ", "sls_pln_imp_typ")
			}
			,
			MCBlockDef.create("Ins03_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

