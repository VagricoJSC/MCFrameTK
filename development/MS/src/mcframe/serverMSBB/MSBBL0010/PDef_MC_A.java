package mcframe.serverMSBB.MSBBL0010;

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
 * [MSBBL_CstFrcstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL0010.Srch01.UP.BLOCK0")){
			return MS_MSBBL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.UP.BLOCK0")){
			return MS_MSBBL0010_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.UP.BLOCK1")){
			return MS_MSBBL0010_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Chk01.UP.BLOCK0")){
			return MS_MSBBL0010_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Chk01.UP.BLOCK1")){
			return MS_MSBBL0010_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Chk01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Chk01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Chk02.UP.BLOCK0")){
			return MS_MSBBL0010_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Chk02.DOWN.BLOCK0")){
			return MS_MSBBL0010_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.UP.BLOCK0")){
			return MS_MSBBL0010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.UP.BLOCK1")){
			return MS_MSBBL0010_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.UP.BLOCK0")){
			return MS_MSBBL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.UP.BLOCK1")){
			return MS_MSBBL0010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Del01.UP.BLOCK0")){
			return MS_MSBBL0010_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.UP.BLOCK0")){
			return MS_MSBBL0010_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Imp01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBBL0010_Srch01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("frcst_dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("frcst_usr_nm", "frcst_usr_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_period_typ_nm", "frcst_period_typ_nm"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("last_qty", "last_qty"),
				MCItemDef.create("last_cst_frcst_prnt_dt", "last_cst_frcst_prnt_dt"),
				MCItemDef.create("last_rcpt_dt", "last_rcpt_dt"),
				MCItemDef.create("prms_qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("slo_qty", "slo_qty"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Sprt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("last_qty", "last_qty"),
				MCItemDef.create("last_cst_frcst_prnt_dt", "last_cst_frcst_prnt_dt"),
				MCItemDef.create("last_rcpt_dt", "last_rcpt_dt"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("slo_qty", "slo_qty")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Chk01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("hdr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("hdr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("hdr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl" + ".cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + ".fix_flg", "fix_flg"),
				MCItemDef.create("dtl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dtl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dtl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dtl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dtl" + ".frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("dtl" + ".frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("dtl" + ".frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("dtl" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dtl" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("dtl" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dtl" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dtl" + ".cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + ".prms_qty", "prms_qty"),
				MCItemDef.create("dtl" + ".frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl" + ".intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + ".sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl" + ".sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl" + ".sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("hdr" + ".can_flg", "can_flg"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("hdr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("hdr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("hdr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("frcst_usr_nm", "frcst_usr_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("frcst_dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dtl" + ".cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + ".fix_flg", "fix_flg"),
				MCItemDef.create("dtl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dtl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dtl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dtl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dtl" + ".frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("dtl" + ".frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("dtl" + ".frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("dtl" + ".frcst_dt", "frcst_dt"),
				MCItemDef.create("dtl" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dtl" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dtl" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dtl" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("dtl" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dtl" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dtl" + ".cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dtl" + ".prms_qty", "prms_qty"),
				MCItemDef.create("dtl" + ".frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl" + ".intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + ".sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl" + ".sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl" + ".sub_char3", "dtl_sub_char3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("frcst_period_typ_nm", "frcst_period_typ_nm"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Chk02_INFO = new MCOperationInfo("MS", "MSBBL0010", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Ins01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("hdr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("hdr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("hdr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("hdr" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + ".fix_flg", "fix_flg"),
				MCItemDef.create("dtl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dtl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dtl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dtl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dtl" + ".frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("dtl" + ".frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("dtl" + ".frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("dtl" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dtl" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("dtl" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dtl" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dtl" + ".cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + ".prms_qty", "prms_qty"),
				MCItemDef.create("dtl" + ".frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl" + ".intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + ".sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl" + ".sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl" + ".sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + ".cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + ".frcst_dt", "frcst_dt"),
				MCItemDef.create("dtl" + ".disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Upd01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("hdr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("hdr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("hdr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + ".cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + ".fix_flg", "fix_flg"),
				MCItemDef.create("dtl" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dtl" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dtl" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dtl" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dtl" + ".frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("dtl" + ".frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("dtl" + ".frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("dtl" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dtl" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dtl" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("dtl" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dtl" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dtl" + ".cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + ".prms_qty", "prms_qty"),
				MCItemDef.create("dtl" + ".frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl" + ".intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + ".sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl" + ".sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl" + ".sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + ".cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + ".frcst_dt", "frcst_dt"),
				MCItemDef.create("dtl" + ".disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Del01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("hdr" + ".can_rmrks", "can_rmrks"),
				MCItemDef.create("hdr" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Imp01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_no + "", "cst_frcst_no"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_prnt_dt + "", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_slip_no + "", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_cd + "", "cst_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$dlv_cd + "", "dlv_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$frcst_usr_cd + "", "frcst_usr_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$frcst_dpt_cd + "", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$wrk_no + "", "wrk_no"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$rcpt_dt + "", "rcpt_dt"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$intr_rmrks + "", "intr_rmrks"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char1 + "", "sub_char1"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char2 + "", "sub_char2"),
				MCItemDef.create("hdr" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char3 + "", "sub_char3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_d_no + "", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$fix_flg + "", "fix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_cd + "", "itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub1 + "", "itm_sub1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub2 + "", "itm_sub2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub3 + "", "itm_sub3"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_period_typ + "", "frcst_period_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_st_dt + "", "frcst_st_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_end_dt + "", "frcst_end_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_qty + "", "trd_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_cd + "", "trd_unit_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$gi_loc_cd + "", "gi_loc_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_cd + "", "cst_itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_nm + "", "cst_itm_nm"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_slip_d_no + "", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$prms_qty + "", "prms_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_stop_flg + "", "frcst_stop_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_intr_rmrks + "", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char1 + "", "dtl_sub_char1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char2 + "", "dtl_sub_char2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char3 + "", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("hdr" + ".cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("hdr" + ".cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("hdr" + ".cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("hdr" + ".cst_cd", "cst_cd"),
				MCItemDef.create("hdr" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("hdr" + ".frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("hdr" + ".frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("hdr" + ".wrk_no", "wrk_no"),
				MCItemDef.create("hdr" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("hdr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("hdr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("hdr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("hdr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("frcst_usr_nm", "frcst_usr_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("frcst_dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Imp01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Imp01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_d_no + "", "cst_frcst_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$fix_flg + "", "fix_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_cd + "", "itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub1 + "", "itm_sub1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub2 + "", "itm_sub2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub3 + "", "itm_sub3"),
				MCItemDef.create("dtl" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_period_typ + "", "frcst_period_typ"),
				MCItemDef.create("dtl" + ".frcst_period_typ_nm", "frcst_period_typ_nm"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_st_dt + "", "frcst_st_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_end_dt + "", "frcst_end_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_dt + "", "frcst_dt"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_qty + "", "trd_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_cd + "", "trd_unit_cd"),
				MCItemDef.create("dtl" + ".trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("dtl" + ".trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("dtl" + ".trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("dtl" + ".trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("dtl" + ".trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$base_unit_qty + "", "base_unit_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$base_unit_cd + "", "base_unit_cd"),
				MCItemDef.create("dtl" + ".base_unit_nm", "base_unit_nm"),
				MCItemDef.create("dtl" + ".base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("dtl" + ".base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$gi_loc_cd + "", "gi_loc_cd"),
				MCItemDef.create("dtl" + ".gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_cd + "", "cst_itm_cd"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_nm + "", "cst_itm_nm"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_slip_d_no + "", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$prms_qty + "", "prms_qty"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_stop_flg + "", "frcst_stop_flg"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_intr_rmrks + "", "dtl_intr_rmrks"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char1 + "", "dtl_sub_char1"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char2 + "", "dtl_sub_char2"),
				MCItemDef.create("dtl" + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char3 + "", "dtl_sub_char3"),
				MCItemDef.create("dtl" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

