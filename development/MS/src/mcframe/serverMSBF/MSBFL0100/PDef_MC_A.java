package mcframe.serverMSBF.MSBFL0100;

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
 * [MSBFL_MrktJudgReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0100.Srch01.UP.BLOCK0")){
			return MS_MSBFL0100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Srch02.UP.BLOCK0")){
			return MS_MSBFL0100_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Srch02.DOWN.BLOCK0")){
			return MS_MSBFL0100_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk01.UP.BLOCK0")){
			return MS_MSBFL0100_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk02.UP.BLOCK0")){
			return MS_MSBFL0100_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0100_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk03.UP.BLOCK0")){
			return MS_MSBFL0100_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk03.DOWN.BLOCK0")){
			return MS_MSBFL0100_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk04.UP.BLOCK0")){
			return MS_MSBFL0100_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Chk04.DOWN.BLOCK0")){
			return MS_MSBFL0100_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Imp01.UP.BLOCK0")){
			return MS_MSBFL0100_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Imp01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Upd01.UP.BLOCK0")){
			return MS_MSBFL0100_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Upd02.UP.BLOCK0")){
			return MS_MSBFL0100_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Upd02.UP.BLOCK1")){
			return MS_MSBFL0100_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0100.Upd02.DOWN.BLOCK0")){
			return MS_MSBFL0100_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Del01.UP.BLOCK0")){
			return MS_MSBFL0100_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Del02.UP.BLOCK0")){
			return MS_MSBFL0100_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Del02.UP.BLOCK1")){
			return MS_MSBFL0100_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0100.Del02.DOWN.BLOCK0")){
			return MS_MSBFL0100_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0100_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0100.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0100_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBFL0100_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("not_acpt_flg", "not_acpt_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("judg_dt_fr", "judg_dt_fr"),
				MCItemDef.create("judg_dt_to", "judg_dt_to"),
				MCItemDef.create("upd_ts_fr", "upd_ts_fr"),
				MCItemDef.create("upd_ts_to", "upd_ts_to"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("main_flg", "main_flg"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("not_input_flg", "not_input_flg"),
				MCItemDef.create("input_flg", "input_flg"),
				MCItemDef.create("mrkt_judg_not_prnt_flg", "mrkt_judg_not_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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


	public static MCContainerDef MS_MSBFL0100_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("not_acpt_flg", "not_acpt_flg"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("mrkt_upd_usr_cd", "mrkt_upd_usr_cd"),
				MCItemDef.create("mrkt_upd_usr_nm", "mrkt_upd_usr_nm"),
				MCItemDef.create("mrkt_upd_dpt_cd", "mrkt_upd_dpt_cd"),
				MCItemDef.create("mrkt_upd_dpt_nm", "mrkt_upd_dpt_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("main_flg", "main_flg"),
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_tm", "mrkt_judg_prnt_tm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("mfg_so_aprv_typ_nm", "mfg_so_aprv_typ_nm"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("quality_mng_typ_nm", "quality_mng_typ_nm"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("mfg_mng_typ_nm", "mfg_mng_typ_nm"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_typ_nm", "deviant_typ_nm"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("deviant_msr_typ_nm", "deviant_msr_typ_nm"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("prod_itm_info_typ_nm", "prod_itm_info_typ_nm"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ_nm", "chd_itm_info_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("input_flg", "input_flg"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
	
	static final MCOperationInfo MS_MSBFL0100_Srch02_INFO = new MCOperationInfo("MS", "MSBFL0100", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("mfg_so_aprv_typ_nm", "mfg_so_aprv_typ_nm"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("quality_mng_typ_nm", "quality_mng_typ_nm"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("mfg_mng_typ_nm", "mfg_mng_typ_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("mrkt_upd_usr_cd", "mrkt_upd_usr_cd"),
				MCItemDef.create("mrkt_upd_dpt_cd", "mrkt_upd_dpt_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mrkt_upd_usr_nm", "mrkt_upd_usr_nm"),
				MCItemDef.create("mrkt_upd_dpt_nm", "mrkt_upd_dpt_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("mfg_so_aprv_typ_nm", "mfg_so_aprv_typ_nm"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("quality_mng_typ_nm", "quality_mng_typ_nm"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("mfg_mng_typ_nm", "mfg_mng_typ_nm"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_typ_nm", "deviant_typ_nm"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("deviant_msr_typ_nm", "deviant_msr_typ_nm"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("prod_itm_info_typ_nm", "prod_itm_info_typ_nm"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ_nm", "chd_itm_info_typ_nm")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0100", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("not_acpt_flg", "not_acpt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("mrkt_judg_role_cd", "mrkt_judg_role_cd"),
				MCItemDef.create("main_flg", "main_flg"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Chk03_INFO = new MCOperationInfo("MS", "MSBFL0100", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Chk04_INFO = new MCOperationInfo("MS", "MSBFL0100", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("mrkt_judg_role_cd", "mrkt_judg_role_cd")
			}
			,
			MCBlockDef.create("Chk04_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Imp01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("mrkt_upd_usr_cd", "mrkt_upd_usr_cd"),
				MCItemDef.create("mrkt_upd_dpt_cd", "mrkt_upd_dpt_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("mrkt_upd_usr_cd", "mrkt_upd_usr_cd"),
				MCItemDef.create("mrkt_upd_usr_nm", "mrkt_upd_usr_nm"),
				MCItemDef.create("mrkt_upd_dpt_cd", "mrkt_upd_dpt_cd"),
				MCItemDef.create("mrkt_upd_dpt_nm", "mrkt_upd_dpt_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("mfg_so_aprv_typ_nm", "mfg_so_aprv_typ_nm"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("quality_mng_typ_nm", "quality_mng_typ_nm"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("mfg_mng_typ_nm", "mfg_mng_typ_nm"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_typ_nm", "deviant_typ_nm"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("deviant_msr_typ_nm", "deviant_msr_typ_nm"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("prod_itm_info_typ_nm", "prod_itm_info_typ_nm"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ_nm", "chd_itm_info_typ_nm"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("mrkt_upd_usr_cd", "mrkt_upd_usr_cd"),
				MCItemDef.create("mrkt_upd_dpt_cd", "mrkt_upd_dpt_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0100", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("not_acpt_flg", "not_acpt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("main_flg", "main_flg"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_rsn", "judg_rsn"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0100_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("Upd02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_tm", "mrkt_judg_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Del01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Del02_INFO = new MCOperationInfo("MS", "MSBFL0100", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("Del02_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0100_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Del02",
			new MCItemDef[]{
				MCItemDef.create("judg_rsn", "judg_rsn")
			}
			,
			MCBlockDef.create("Del02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_tm", "mrkt_judg_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0100_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0100", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0100_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0100_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0100", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_prnt_flg", "mrkt_judg_prnt_flg"),
				MCItemDef.create("mrkt_judg_prnt_tm", "mrkt_judg_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

