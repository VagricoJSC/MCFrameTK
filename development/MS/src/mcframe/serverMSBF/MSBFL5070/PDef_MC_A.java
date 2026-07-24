package mcframe.serverMSBF.MSBFL5070;

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
 * [MSBFL_InspActRcptIFService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.UP.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.UP.BLOCK1")){
			return MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.UP.BLOCK2")){
			return MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.UP.BLOCK3")){
			return MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.DOWN.BLOCK1")){
			return MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd01.DOWN.BLOCK2")){
			return MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd02.UP.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd02.UP.BLOCK1")){
			return MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd02.UP.BLOCK2")){
			return MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd02.DOWN.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Upd02.DOWN.BLOCK1")){
			return MS_MSBFL5070_InspActIF_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Del01.UP.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Del01.UP.BLOCK1")){
			return MS_MSBFL5070_InspActIF_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5070.InspActIF_Del01.DOWN.BLOCK0")){
			return MS_MSBFL5070_InspActIF_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBFL5070_InspActIF_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5070", "InspActIF_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_freq_upd_flg", "insp_freq_upd_flg"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no1_upd_flg", "src_no1_upd_flg"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no2_upd_flg", "src_no2_upd_flg"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_upd_flg", "insp_typ_upd_flg"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_upd_flg", "insp_mtd_typ_upd_flg"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_upd_flg", "insp_sts_typ_upd_flg"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_upd_flg", "insp_aprv_sts_typ_upd_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_upd_flg", "itm_cd_upd_flg"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_upd_flg", "itm_sub1_upd_flg"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_upd_flg", "itm_sub2_upd_flg"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_upd_flg", "itm_sub3_upd_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_no_upd_flg", "ver_no_upd_flg"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_cd_upd_flg", "dfct_rsn_cd_upd_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_cd_upd_flg", "sppl_cd_upd_flg"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_cd_upd_flg", "maker_cd_upd_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_cd_upd_flg", "mfg_loc_cd_upd_flg"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("from_site_cd_upd_flg", "from_site_cd_upd_flg"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_qty_upd_flg", "base_unit_qty_upd_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_cd_upd_flg", "base_unit_cd_upd_flg"),
				MCItemDef.create("ttl_stk_qty", "ttl_stk_qty"),
				MCItemDef.create("ttl_stk_qty_upd_flg", "ttl_stk_qty_upd_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("st_hm_upd_flg", "st_hm_upd_flg"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("end_hm_upd_flg", "end_hm_upd_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_cd_upd_flg", "act_usr_cd_upd_flg"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_dpt_cd_upd_flg", "act_dpt_cd_upd_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_upd_flg", "lmt_dt_frm_typ_upd_flg"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("lmt_dt_frm_upd_flg", "lmt_dt_frm_upd_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("lmt_dt_upd_flg", "lmt_dt_upd_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_fctr_upd_flg", "act_cont_fctr_upd_flg"),
				MCItemDef.create("stt_can_ac_dt", "stt_can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("lot_rmrks_upd_flg", "lot_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("insp_inst_upd_cntr", "insp_inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_act_no", "ext_insp_act_no")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_upd_flg", "itm_cd_upd_flg"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_upd_flg", "itm_sub1_upd_flg"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_upd_flg", "itm_sub2_upd_flg"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_upd_flg", "itm_sub3_upd_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_cd_upd_flg", "loc_cd_upd_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_upd_flg", "str_ln_cd_upd_flg"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_upd_flg", "fix_no_typ_upd_flg"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("fix_no_upd_flg", "fix_no_upd_flg"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_qty_upd_flg", "pack_unit_qty_upd_flg"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_cd_upd_flg", "pack_unit_cd_upd_flg"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_qty_upd_flg", "base_unit_qty_upd_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_cd_upd_flg", "base_unit_cd_upd_flg"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_upd_flg", "pack_xfr_pack_unit_qty_upd_flg"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_cd_upd_flg", "pack_xfr_pack_unit_cd_upd_flg"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty_upd_flg", "pack_xfr_base_unit_qty_upd_flg"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_cd_upd_flg", "pack_xfr_base_unit_cd_upd_flg"),
				MCItemDef.create("dfct_rsn_cd", "dfct_rsn_cd"),
				MCItemDef.create("dfct_rsn_cd_upd_flg", "dfct_rsn_cd_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_dt_upd_flg", "ac_dt_upd_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_act_d_no", "ext_insp_act_d_no")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_upd_flg", "itm_cd_upd_flg"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_upd_flg", "itm_sub1_upd_flg"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_upd_flg", "itm_sub2_upd_flg"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_upd_flg", "itm_sub3_upd_flg"),
				MCItemDef.create("so_qty", "so_qty"),
				MCItemDef.create("so_qty_upd_flg", "so_qty_upd_flg"),
				MCItemDef.create("smpl_qty", "smpl_qty"),
				MCItemDef.create("smpl_qty_upd_flg", "smpl_qty_upd_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_cd_upd_flg", "base_unit_cd_upd_flg"),
				MCItemDef.create("pack_xfr_pack_unit_qty", "pack_xfr_pack_unit_qty"),
				MCItemDef.create("pack_xfr_pack_unit_qty_upd_flg", "pack_xfr_pack_unit_qty_upd_flg"),
				MCItemDef.create("pack_xfr_pack_unit_cd", "pack_xfr_pack_unit_cd"),
				MCItemDef.create("pack_xfr_pack_unit_cd_upd_flg", "pack_xfr_pack_unit_cd_upd_flg"),
				MCItemDef.create("pack_xfr_base_unit_qty", "pack_xfr_base_unit_qty"),
				MCItemDef.create("pack_xfr_base_unit_qty_upd_flg", "pack_xfr_base_unit_qty_upd_flg"),
				MCItemDef.create("pack_xfr_base_unit_cd", "pack_xfr_base_unit_cd"),
				MCItemDef.create("pack_xfr_base_unit_cd_upd_flg", "pack_xfr_base_unit_cd_upd_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_cd_upd_flg", "loc_cd_upd_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_upd_flg", "str_ln_cd_upd_flg"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_upd_flg", "quality_typ_upd_flg"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_upd_flg", "stk_insp_typ_upd_flg"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_upd_flg", "stk_id_typ_upd_flg"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_cd_upd_flg", "stk_bp_cd_upd_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_cd_upd_flg", "gd_cd_upd_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd_upd_flg", "stk_arrv_bp_cd_upd_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("lot_no_upd_flg", "lot_no_upd_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sublot_no_upd_flg", "sublot_no_upd_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_upd_flg", "sno1_upd_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_upd_flg", "sno2_upd_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_upd_flg", "sno3_upd_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_upd_flg", "sno4_upd_flg"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_upd_flg", "fix_no_typ_upd_flg"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("fix_no_upd_flg", "fix_no_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_dt_upd_flg", "ac_dt_upd_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("act_hm", "act_hm"),
				MCItemDef.create("act_hm_upd_flg", "act_hm_upd_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_cd_upd_flg", "bd_dpt_cd_upd_flg"),
				MCItemDef.create("so_cmpl_flg", "so_cmpl_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("rmrks_upd_flg", "rmrks_upd_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_insp_smpl_act_no", "ext_insp_smpl_act_no")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Smpl")
		);
	}


	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_smpl_act_no", "insp_smpl_act_no"),
				MCItemDef.create("insp_act_no", "insp_act_no")
			}
			,
			MCBlockDef.create("InspActIF_Upd01_Smpl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5070_InspActIF_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5070", "InspActIF_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("InspActIF_Upd02_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd02",
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
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("insp_inst_upd_cntr", "insp_inst_upd_cntr")
			}
			,
			MCBlockDef.create("InspActIF_Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
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
			MCBlockDef.create("InspActIF_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ")
			}
			,
			MCBlockDef.create("InspActIF_Upd02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5070_InspActIF_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_act_d_no", "insp_act_d_no"),
				MCItemDef.create("insp_judg_d_no", "insp_judg_d_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ")
			}
			,
			MCBlockDef.create("InspActIF_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5070_InspActIF_Del01_INFO = new MCOperationInfo("MS", "MSBFL5070", "InspActIF_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5070_InspActIF_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("InspActIF_Del01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBFL5070_InspActIF_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("insp_schd_upd_cntr", "insp_schd_upd_cntr"),
				MCItemDef.create("insp_inst_upd_cntr", "insp_inst_upd_cntr"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("InspActIF_Del01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5070_InspActIF_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5070", "InspActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ")
			}
			,
			MCBlockDef.create("InspActIF_Del01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

