package mcframe.serverMABS.MABSL0180;

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
 * [MABSL_InspSpecReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0180.InspSpec_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0180_InspSpec_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.InspSpec_Upd01.UP.BLOCK0")){
			return MA_MABSL0180_InspSpec_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.InspSpec_DelChk01.UP.BLOCK0")){
			return MA_MABSL0180_InspSpec_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.InspSpec_Del01.UP.BLOCK0")){
			return MA_MABSL0180_InspSpec_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Srch01.UP.BLOCK0")){
			return MA_MABSL0180_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0180_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Sprt01.UP.BLOCK0")){
			return MA_MABSL0180_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0180_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Upd01.UP.BLOCK0")){
			return MA_MABSL0180_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0180.Del01.UP.BLOCK0")){
			return MA_MABSL0180_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABSL0180_InspSpec_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0180", "InspSpec_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_InspSpec_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "InspSpec_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspSpec_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_InspSpec_Upd01_INFO = new MCOperationInfo("MA", "MABSL0180", "InspSpec_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_InspSpec_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "InspSpec_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspSpec_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_InspSpec_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0180", "InspSpec_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_InspSpec_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "InspSpec_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspSpec_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_InspSpec_Del01_INFO = new MCOperationInfo("MA", "MABSL0180", "InspSpec_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_InspSpec_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "InspSpec_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InspSpec_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_Srch01_INFO = new MCOperationInfo("MA", "MABSL0180", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0180_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("pre_insp_inf_typ_nm", "pre_insp_inf_typ_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0180", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0180_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("pre_insp_inf_typ_nm", "pre_insp_inf_typ_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_Upd01_INFO = new MCOperationInfo("MA", "MABSL0180", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0180_Del01_INFO = new MCOperationInfo("MA", "MABSL0180", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0180_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0180", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

