package mcframe.serverMSBE.MSBEL1480;

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
 * [MSBEL_ShipStkRplLst]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1480.Srch01.UP.BLOCK0")){
			return MS_MSBEL1480_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1480_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk01.UP.BLOCK0")){
			return MS_MSBEL1480_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1480_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk02.UP.BLOCK0")){
			return MS_MSBEL1480_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk02.DOWN.BLOCK0")){
			return MS_MSBEL1480_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk03.UP.BLOCK0")){
			return MS_MSBEL1480_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Chk03.DOWN.BLOCK0")){
			return MS_MSBEL1480_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Upd01.UP.BLOCK0")){
			return MS_MSBEL1480_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1480_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Del01.UP.BLOCK0")){
			return MS_MSBEL1480_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Del01.DOWN.BLOCK0")){
			return MS_MSBEL1480_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Upd02.UP.BLOCK0")){
			return MS_MSBEL1480_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1480.Upd02.DOWN.BLOCK0")){
			return MS_MSBEL1480_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL1480_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1480", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("schd_dt_fr", "schd_dt_fr"),
				MCItemDef.create("schd_dt_to", "schd_dt_to"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("pack_unit_short_qty", "pack_unit_short_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_rnd_typ", "pack_unit_rnd_typ"),
				MCItemDef.create("pack_unit_conv_base_qty", "pack_unit_conv_base_qty"),
				MCItemDef.create("pack_unit_conv_qty", "pack_unit_conv_qty"),
				MCItemDef.create("base_unit_short_qty", "base_unit_short_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("slip_schd_no", "slip_schd_no"),
				MCItemDef.create("io_schd_sub_typ1", "io_schd_sub_typ1"),
				MCItemDef.create("io_schd_sub_typ_nm1", "io_schd_sub_typ_nm1"),
				MCItemDef.create("io_schd_sub_no1", "io_schd_sub_no1"),
				MCItemDef.create("io_schd_sub_typ2", "io_schd_sub_typ2"),
				MCItemDef.create("io_schd_sub_typ_nm2", "io_schd_sub_typ_nm2"),
				MCItemDef.create("io_schd_sub_no2", "io_schd_sub_no2"),
				MCItemDef.create("io_schd_sub_typ3", "io_schd_sub_typ3"),
				MCItemDef.create("io_schd_sub_typ_nm3", "io_schd_sub_typ_nm3"),
				MCItemDef.create("io_schd_sub_no3", "io_schd_sub_no3"),
				MCItemDef.create("io_schd_sub_typ4", "io_schd_sub_typ4"),
				MCItemDef.create("io_schd_sub_typ_nm4", "io_schd_sub_typ_nm4"),
				MCItemDef.create("io_schd_sub_no4", "io_schd_sub_no4"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("exec_tm", "exec_tm"),
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
	
	static final MCOperationInfo MS_MSBEL1480_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1480", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("pack_unit_short_qty", "pack_unit_short_qty"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("pack_unit_short_qty", "pack_unit_short_qty"),
				MCItemDef.create("base_unit_short_qty", "base_unit_short_qty"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1480_Chk02_INFO = new MCOperationInfo("MS", "MSBEL1480", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1480_Chk03_INFO = new MCOperationInfo("MS", "MSBEL1480", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1480_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1480", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("pack_unit_short_qty", "pack_unit_short_qty"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1480_Del01_INFO = new MCOperationInfo("MS", "MSBEL1480", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Del01",
			new MCItemDef[]{
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1480_Upd02_INFO = new MCOperationInfo("MS", "MSBEL1480", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1480_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("batch_data_no", "batch_data_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL1480_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1480", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

