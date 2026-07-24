package mcframe.serverMSBE.MSBEL6510;

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
 * [MSBEL_StkXfrActRcptIFService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6510.Chk01.UP.BLOCK0")){
			return MS_MSBEL6510_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.UP.BLOCK1")){
			return MS_MSBEL6510_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.UP.BLOCK2")){
			return MS_MSBEL6510_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.UP.BLOCK3")){
			return MS_MSBEL6510_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL6510_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL6510_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.DOWN.BLOCK2")){
			return MS_MSBEL6510_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6510.Chk01.DOWN.BLOCK3")){
			return MS_MSBEL6510_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL6510.StkXfrActIF_Upd01.UP.BLOCK0")){
			return MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6510.StkXfrActIF_Upd01.UP.BLOCK1")){
			return MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6510.StkXfrActIF_Upd01.UP.BLOCK2")){
			return MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6510.StkXfrActIF_Upd01.UP.BLOCK3")){
			return MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL6510.StkXfrActIF_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL6510_StkXfrActIF_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL6510_Chk01_INFO = new MCOperationInfo("MS", "MSBEL6510", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6510_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL6510_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_dpt_cd_upd_flg", "act_dpt_cd_upd_flg"),
				MCItemDef.create("act_usr_cd_upd_flg", "act_usr_cd_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6510_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6510_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6510_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Ctrl")
		);
	}
	public static MCContainerDef MS_MSBEL6510_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_dpt_cd_upd_flg", "act_dpt_cd_upd_flg"),
				MCItemDef.create("act_usr_cd_upd_flg", "act_usr_cd_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6510_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL6510_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6510_StkXfrActIF_Upd01_INFO = new MCOperationInfo("MS", "MSBEL6510", "StkXfrActIF_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "StkXfrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "StkXfrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_dpt_cd_upd_flg", "act_dpt_cd_upd_flg"),
				MCItemDef.create("act_usr_cd_upd_flg", "act_usr_cd_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "StkXfrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6510_StkXfrActIF_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "StkXfrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StkXfrActIF_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6510_StkXfrActIF_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6510", "StkXfrActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("StkXfrActIF_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

