package mcframe.serverMSBF.MSBFL5050;

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
 * [MSBFL_InspActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk01.DOWN.BLOCK2")){
			return MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk02.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk02.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Chk04_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.DOWN.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk04.DOWN.BLOCK2")){
			return MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.DOWN.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd01.DOWN.BLOCK2")){
			return MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd02.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd02.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd02.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd02.DOWN.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Upd03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.UP.BLOCK3")){
			return MS_MSBFL5050_InspAct_Upd03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.UP.BLOCK4")){
			return MS_MSBFL5050_InspAct_Upd03_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.DOWN.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.DOWN.BLOCK2")){
			return MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd03.DOWN.BLOCK3")){
			return MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd04.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd04.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Del01.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Del01.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Del01.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Del01.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk03.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk03.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk03.UP.BLOCK2")){
			return MS_MSBFL5050_InspAct_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Chk03.DOWN.BLOCK0")){
			return MS_MSBFL5050_InspAct_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd05.UP.BLOCK0")){
			return MS_MSBFL5050_InspAct_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5050.InspAct_Upd05.UP.BLOCK1")){
			return MS_MSBFL5050_InspAct_Upd05_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ttl_stk_qty", "ttl_stk_qty"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("stt_can_ac_dt", "stt_can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("so_qty", "so_qty"),
				MCItemDef.create("smpl_qty", "smpl_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk01_Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("InspAct_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspAct_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("InspAct_Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Chk04_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Chk04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk04",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Chk04_Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ttl_stk_qty", "ttl_stk_qty"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("no_call_io_act_upd_flg", "no_call_io_act_upd_flg"),
				MCItemDef.create("insp_schd_srv_flg", "insp_schd_srv_flg"),
				MCItemDef.create("stt_can_ac_dt", "stt_can_ac_dt"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_act_no", "ext_insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_act_d_no", "ext_insp_act_d_no")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("insp_smpl_act" + ".insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_smpl_act" + ".insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_smpl_act" + ".insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_smpl_act" + ".itm_cd", "itm_cd"),
				MCItemDef.create("insp_smpl_act" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("insp_smpl_act" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("insp_smpl_act" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_smpl_act" + ".so_qty", "so_qty"),
				MCItemDef.create("insp_smpl_act" + ".smpl_qty", "smpl_qty"),
				MCItemDef.create("insp_smpl_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("insp_smpl_act" + ".pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_smpl_act" + ".pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_smpl_act" + ".pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("insp_smpl_act" + ".pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("insp_smpl_act" + ".loc_cd", "loc_cd"),
				MCItemDef.create("insp_smpl_act" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("insp_smpl_act" + ".quality_typ", "quality_typ"),
				MCItemDef.create("insp_smpl_act" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("insp_smpl_act" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("insp_smpl_act" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("insp_smpl_act" + ".gd_cd", "gd_cd"),
				MCItemDef.create("insp_smpl_act" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("insp_smpl_act" + ".lot_no", "lot_no"),
				MCItemDef.create("insp_smpl_act" + ".sublot_no", "sublot_no"),
				MCItemDef.create("insp_smpl_act" + ".sno1", "sno1"),
				MCItemDef.create("insp_smpl_act" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("insp_smpl_act" + ".sno2", "sno2"),
				MCItemDef.create("insp_smpl_act" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("insp_smpl_act" + ".sno3", "sno3"),
				MCItemDef.create("insp_smpl_act" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("insp_smpl_act" + ".sno4", "sno4"),
				MCItemDef.create("insp_smpl_act" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("insp_smpl_act" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("insp_smpl_act" + ".fix_no", "fix_no"),
				MCItemDef.create("insp_smpl_act" + ".ac_dt", "ac_dt"),
				MCItemDef.create("insp_smpl_act" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("insp_smpl_act" + ".so_cmpl_flg", "so_cmpl_flg"),
				MCItemDef.create("insp_smpl_act" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("insp_smpl_act" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("insp_smpl_act" + ".sub_char1", "sub_char1"),
				MCItemDef.create("insp_smpl_act" + ".sub_char2", "sub_char2"),
				MCItemDef.create("insp_smpl_act" + ".sub_char3", "sub_char3"),
				MCItemDef.create("insp_smpl_act" + ".lims_flg", "lims_flg"),
				MCItemDef.create("insp_smpl_act" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("insp_smpl_act" + ".ext_insp_smpl_act_no", "ext_insp_smpl_act_no"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_stt_d_no", "insp_stt_d_no")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_smpl_act" + ".insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_smpl_act" + ".insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd01_Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspAct_Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspAct_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("InspAct_Upd02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no")
			}
			,
			MCBlockDef.create("InspAct_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Upd03_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("insp_smpl_act_upd_flg", "insp_smpl_act_upd_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_stt_d_no", "insp_stt_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Stt_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_act_d_no", "ext_insp_act_d_no")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Act_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Judg_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Yield_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_stt_d_no", "insp_stt_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Stt_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Act_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5050_InspAct_Upd03_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd03_Judg_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Upd04_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd04",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Upd04_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd04",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Upd04_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Del01_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("InspAct_Del01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("InspAct_Del01_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("InspAct_Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Chk03_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("judg_flg", "judg_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("old_quality_typ", "old_quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ")
			}
			,
			MCBlockDef.create("InspAct_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("old_quality_typ", "old_quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk03_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd")
			}
			,
			MCBlockDef.create("InspAct_Chk03_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5050_InspAct_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspAct_Chk03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5050_InspAct_Upd05_INFO = new MCOperationInfo("MS", "MSBFL5050", "InspAct_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspAct_Upd05_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5050_InspAct_Upd05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5050", "InspAct_Upd05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no")
			}
			,
			MCBlockDef.create("InspAct_Upd05_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

