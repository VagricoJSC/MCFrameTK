package mcframe.clientMSBF.MSBFP0040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBFP_InspInstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0040.Srch01.UP.BLOCK0")){
			return MS_MSBFL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch01.DOWN.BLOCK1")){
			return MS_MSBFL0040_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Srch01.DOWN.BLOCK2")){
			return MS_MSBFL0040_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0040.Srch02.UP.BLOCK0")){
			return MS_MSBFL0040_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0040_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch02.DOWN.BLOCK1")){
			return MS_MSBFL0040_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Srch02.DOWN.BLOCK2")){
			return MS_MSBFL0040_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0040.Srch03.UP.BLOCK0")){
			return MS_MSBFL0040_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch03.DOWN.BLOCK0")){
			return MS_MSBFL0040_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch03.DOWN.BLOCK1")){
			return MS_MSBFL0040_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Srch04.UP.BLOCK0")){
			return MS_MSBFL0040_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch04.DOWN.BLOCK0")){
			return MS_MSBFL0040_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Srch04.DOWN.BLOCK1")){
			return MS_MSBFL0040_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Ins01.UP.BLOCK0")){
			return MS_MSBFL0040_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Ins01.UP.BLOCK1")){
			return MS_MSBFL0040_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Ins01.UP.BLOCK2")){
			return MS_MSBFL0040_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0040.Ins01.DOWN.BLOCK0")){
			return MS_MSBFL0040_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Ins01.DOWN.BLOCK1")){
			return MS_MSBFL0040_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Upd01.UP.BLOCK0")){
			return MS_MSBFL0040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Upd01.UP.BLOCK1")){
			return MS_MSBFL0040_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Upd01.UP.BLOCK2")){
			return MS_MSBFL0040_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL0040.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0040_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Upd02.UP.BLOCK0")){
			return MS_MSBFL0040_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Upd02.DOWN.BLOCK0")){
			return MS_MSBFL0040_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Del01.UP.BLOCK0")){
			return MS_MSBFL0040_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Del01.UP.BLOCK1")){
			return MS_MSBFL0040_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0040.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0040_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Del02.UP.BLOCK0")){
			return MS_MSBFL0040_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Del02.DOWN.BLOCK0")){
			return MS_MSBFL0040_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0040.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0040_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBFL0040_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("CndSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_dt"),
				MCItemDef.create("st_dt_p" + ".hm", "st_hm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_dt"),
				MCItemDef.create("end_dt_p" + ".hm", "end_hm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("master_plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("is_invalid_insp_ptn_flg", "is_invalid_insp_ptn_flg"),
				MCItemDef.create("spl_qty", "spl_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_dec_place", "pack_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("smpl_schd_qty_p" + ".qty", "smpl_schd_qty"),
				MCItemDef.create("smpl_inst_qty_p" + ".qty", "smpl_inst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_dt"),
				MCItemDef.create("st_dt_p" + ".hm", "st_hm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_dt"),
				MCItemDef.create("end_dt_p" + ".hm", "end_hm"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0040", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_no", "insp_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("lmt_up_flg", "lmt_up_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_dt"),
				MCItemDef.create("st_dt_p" + ".hm", "st_hm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_dt"),
				MCItemDef.create("end_dt_p" + ".hm", "end_hm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("master_plnt_aprv_flg", "master_plnt_aprv_flg"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_usr_cd_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_cd_p" + ".usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_usr_cd_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_cd_p" + ".dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("last_lims_flg", "last_lims_flg"),
				MCItemDef.create("aprv_lims_flg", "aprv_lims_flg"),
				MCItemDef.create("last_aprv_lims_flg", "last_aprv_lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("is_invalid_insp_ptn_flg", "is_invalid_insp_ptn_flg"),
				MCItemDef.create("spl_qty", "spl_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_DtlSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_dec_place", "pack_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("smpl_schd_qty_p" + ".qty", "smpl_schd_qty"),
				MCItemDef.create("smpl_inst_qty_p" + ".qty", "smpl_inst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_dt"),
				MCItemDef.create("st_dt_p" + ".hm", "st_hm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_dt"),
				MCItemDef.create("end_dt_p" + ".hm", "end_hm"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
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
			MCBlockDef.create("DtlSchd")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("add_point_flg", "add_point_flg")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Srch03_INFO = new MCOperationInfo("MS", "MSBFL0040", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Srch03_UP_BLOCK0() {
		/** Ope.のBlock [Srch03_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Srch03_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch03_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("master_plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("spl_qty", "spl_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch03_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch03_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Srch04_INFO = new MCOperationInfo("MS", "MSBFL0040", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Srch04_UP_BLOCK0() {
		/** Ope.のBlock [Srch04_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Srch04_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch04_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("master_plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("spl_qty", "spl_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Srch04_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch04_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Ins01_INFO = new MCOperationInfo("MS", "MSBFL0040", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_tm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0040_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("add_point_flg", "add_point_flg")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}

	public static MCContainerDef MS_MSBFL0040_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_DtlSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("smpl_inst_qty_p" + ".qty", "smpl_inst_qty"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0040_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0040", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("st_dt_p" + ".ymd", "st_tm"),
				MCItemDef.create("end_dt_p" + ".ymd", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("inst_usr_cd_p" + ".usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_cd_p" + ".dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0040_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("add_point_flg", "add_point_flg")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}

	public static MCContainerDef MS_MSBFL0040_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_DtlSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("smpl_inst_qty_p" + ".qty", "smpl_inst_qty"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_DtlStd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no")
			}
			,
			MCBlockDef.create("DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0040", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_usr_cd_p" + ".usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_cd_p" + ".dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_lims_flg", "lims_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Del01_INFO = new MCOperationInfo("MS", "MSBFL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0040_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_DtlSchd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DtlSchd")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Del02_INFO = new MCOperationInfo("MS", "MSBFL0040", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("aprv_rsn_p" + ".txt", "aprv_rsn"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("aprv_lims_flg", "lims_flg"),
				MCItemDef.create("insp_freq", "insp_freq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0040_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0040_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0040", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0040_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBFL0040", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

