package mcframe.serverMSBC.MSBCL0020;

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
 * [MSBCL_MstrPlnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0020.Srch01.UP.BLOCK0")){
			return MS_MSBCL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL0020_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Srch01.DOWN.BLOCK2")){
			return MS_MSBCL0020_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL0020.Sprt01.UP.BLOCK0")){
			return MS_MSBCL0020_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL0020_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Chk01.UP.BLOCK0")){
			return MS_MSBCL0020_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Chk01.UP.BLOCK1")){
			return MS_MSBCL0020_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0020_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Chk01.DOWN.BLOCK1")){
			return MS_MSBCL0020_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Chk02.UP.BLOCK0")){
			return MS_MSBCL0020_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Chk02.UP.BLOCK1")){
			return MS_MSBCL0020_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Chk02.DOWN.BLOCK0")){
			return MS_MSBCL0020_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Chk02.DOWN.BLOCK1")){
			return MS_MSBCL0020_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Upd01.UP.BLOCK0")){
			return MS_MSBCL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Upd01.UP.BLOCK1")){
			return MS_MSBCL0020_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0020_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL0020_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Del01.UP.BLOCK0")){
			return MS_MSBCL0020_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Del01.UP.BLOCK1")){
			return MS_MSBCL0020_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0020.Del01.DOWN.BLOCK0")){
			return MS_MSBCL0020_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0020.Del01.DOWN.BLOCK1")){
			return MS_MSBCL0020_Del01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBCL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("due_dt_fr", "due_dt_fr"),
				MCItemDef.create("due_dt_to", "due_dt_to"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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


	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("proc_cd", "proc_cd"),
				MCItemDef.create("proc_nm", "proc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("prcd_rqmt_qty", "prcd_rqmt_qty"),
				MCItemDef.create("ship_schd_qty", "ship_schd_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg")
			}
			,
			MCBlockDef.create("Srch01_MtrxRslt")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("old_due_dt", "old_due_dt"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_gnrt_typ_nm", "rqmt_gnrt_typ_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("qty_00", "qty_00"),
				MCItemDef.create("qty_01", "qty_01"),
				MCItemDef.create("qty_02", "qty_02"),
				MCItemDef.create("qty_03", "qty_03"),
				MCItemDef.create("qty_04", "qty_04"),
				MCItemDef.create("qty_05", "qty_05"),
				MCItemDef.create("qty_06", "qty_06"),
				MCItemDef.create("qty_07", "qty_07"),
				MCItemDef.create("qty_08", "qty_08"),
				MCItemDef.create("qty_09", "qty_09"),
				MCItemDef.create("qty_10", "qty_10"),
				MCItemDef.create("qty_11", "qty_11"),
				MCItemDef.create("qty_12", "qty_12"),
				MCItemDef.create("qty_13", "qty_13"),
				MCItemDef.create("qty_14", "qty_14"),
				MCItemDef.create("qty_15", "qty_15"),
				MCItemDef.create("qty_16", "qty_16"),
				MCItemDef.create("qty_17", "qty_17"),
				MCItemDef.create("qty_18", "qty_18"),
				MCItemDef.create("qty_19", "qty_19"),
				MCItemDef.create("qty_20", "qty_20"),
				MCItemDef.create("qty_21", "qty_21"),
				MCItemDef.create("qty_22", "qty_22"),
				MCItemDef.create("qty_23", "qty_23"),
				MCItemDef.create("qty_24", "qty_24"),
				MCItemDef.create("qty_25", "qty_25"),
				MCItemDef.create("qty_26", "qty_26"),
				MCItemDef.create("qty_27", "qty_27"),
				MCItemDef.create("qty_28", "qty_28"),
				MCItemDef.create("qty_29", "qty_29"),
				MCItemDef.create("qty_30", "qty_30"),
				MCItemDef.create("qty_31", "qty_31"),
				MCItemDef.create("qty_32", "qty_32"),
				MCItemDef.create("qty_33", "qty_33"),
				MCItemDef.create("qty_34", "qty_34"),
				MCItemDef.create("qty_35", "qty_35"),
				MCItemDef.create("qty_36", "qty_36"),
				MCItemDef.create("qty_37", "qty_37"),
				MCItemDef.create("qty_38", "qty_38"),
				MCItemDef.create("qty_39", "qty_39"),
				MCItemDef.create("qty_40", "qty_40"),
				MCItemDef.create("qty_41", "qty_41"),
				MCItemDef.create("qty_42", "qty_42"),
				MCItemDef.create("qty_43", "qty_43"),
				MCItemDef.create("qty_44", "qty_44"),
				MCItemDef.create("qty_45", "qty_45"),
				MCItemDef.create("qty_46", "qty_46"),
				MCItemDef.create("qty_47", "qty_47"),
				MCItemDef.create("qty_48", "qty_48"),
				MCItemDef.create("qty_49", "qty_49"),
				MCItemDef.create("qty_50", "qty_50"),
				MCItemDef.create("qty_51", "qty_51"),
				MCItemDef.create("qty_52", "qty_52"),
				MCItemDef.create("qty_53", "qty_53"),
				MCItemDef.create("qty_54", "qty_54"),
				MCItemDef.create("qty_55", "qty_55"),
				MCItemDef.create("qty_56", "qty_56"),
				MCItemDef.create("qty_57", "qty_57"),
				MCItemDef.create("qty_58", "qty_58"),
				MCItemDef.create("qty_59", "qty_59"),
				MCItemDef.create("qty_60", "qty_60"),
				MCItemDef.create("qty_61", "qty_61"),
				MCItemDef.create("qty_62", "qty_62"),
				MCItemDef.create("qty_63", "qty_63"),
				MCItemDef.create("qty_64", "qty_64"),
				MCItemDef.create("qty_65", "qty_65"),
				MCItemDef.create("qty_66", "qty_66"),
				MCItemDef.create("qty_67", "qty_67"),
				MCItemDef.create("qty_68", "qty_68"),
				MCItemDef.create("qty_69", "qty_69"),
				MCItemDef.create("qty_70", "qty_70"),
				MCItemDef.create("qty_71", "qty_71"),
				MCItemDef.create("qty_72", "qty_72"),
				MCItemDef.create("qty_73", "qty_73"),
				MCItemDef.create("qty_74", "qty_74"),
				MCItemDef.create("qty_75", "qty_75"),
				MCItemDef.create("qty_76", "qty_76"),
				MCItemDef.create("qty_77", "qty_77"),
				MCItemDef.create("qty_78", "qty_78"),
				MCItemDef.create("qty_79", "qty_79"),
				MCItemDef.create("qty_80", "qty_80"),
				MCItemDef.create("qty_81", "qty_81"),
				MCItemDef.create("qty_82", "qty_82"),
				MCItemDef.create("qty_83", "qty_83"),
				MCItemDef.create("qty_84", "qty_84"),
				MCItemDef.create("qty_85", "qty_85"),
				MCItemDef.create("qty_86", "qty_86"),
				MCItemDef.create("qty_87", "qty_87"),
				MCItemDef.create("qty_88", "qty_88"),
				MCItemDef.create("qty_89", "qty_89"),
				MCItemDef.create("qty_90", "qty_90"),
				MCItemDef.create("qty_91", "qty_91"),
				MCItemDef.create("qty_92", "qty_92"),
				MCItemDef.create("qty_93", "qty_93")
			}
			,
			MCBlockDef.create("Srch01_MaxQtyRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_gnrt_typ_nm", "rqmt_gnrt_typ_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Chk02_INFO = new MCOperationInfo("MS", "MSBCL0020", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Del01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Del01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

