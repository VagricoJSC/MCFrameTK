package mcframe.clientMSBC.MSBCP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_MstrPlnReg]の入出力情報となる電文（上り・下り電文）と
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
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
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
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_MtrxRslt] に対する電文項目定義 */
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
			MCBlockDef.create("Pln")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("old_due_dt", "old_due_dt"),
				MCItemDef.create("rqmt_qty_p" + ".qty", "rqmt_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
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
			MCBlockDef.create("ReqRslt")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_MaxQtyRslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("qty_00_p" + ".qty", "qty_00"),
				MCItemDef.create("qty_01_p" + ".qty", "qty_01"),
				MCItemDef.create("qty_02_p" + ".qty", "qty_02"),
				MCItemDef.create("qty_03_p" + ".qty", "qty_03"),
				MCItemDef.create("qty_04_p" + ".qty", "qty_04"),
				MCItemDef.create("qty_05_p" + ".qty", "qty_05"),
				MCItemDef.create("qty_06_p" + ".qty", "qty_06"),
				MCItemDef.create("qty_07_p" + ".qty", "qty_07"),
				MCItemDef.create("qty_08_p" + ".qty", "qty_08"),
				MCItemDef.create("qty_09_p" + ".qty", "qty_09"),
				MCItemDef.create("qty_10_p" + ".qty", "qty_10"),
				MCItemDef.create("qty_11_p" + ".qty", "qty_11"),
				MCItemDef.create("qty_12_p" + ".qty", "qty_12"),
				MCItemDef.create("qty_13_p" + ".qty", "qty_13"),
				MCItemDef.create("qty_14_p" + ".qty", "qty_14"),
				MCItemDef.create("qty_15_p" + ".qty", "qty_15"),
				MCItemDef.create("qty_16_p" + ".qty", "qty_16"),
				MCItemDef.create("qty_17_p" + ".qty", "qty_17"),
				MCItemDef.create("qty_18_p" + ".qty", "qty_18"),
				MCItemDef.create("qty_19_p" + ".qty", "qty_19"),
				MCItemDef.create("qty_20_p" + ".qty", "qty_20"),
				MCItemDef.create("qty_21_p" + ".qty", "qty_21"),
				MCItemDef.create("qty_22_p" + ".qty", "qty_22"),
				MCItemDef.create("qty_23_p" + ".qty", "qty_23"),
				MCItemDef.create("qty_24_p" + ".qty", "qty_24"),
				MCItemDef.create("qty_25_p" + ".qty", "qty_25"),
				MCItemDef.create("qty_26_p" + ".qty", "qty_26"),
				MCItemDef.create("qty_27_p" + ".qty", "qty_27"),
				MCItemDef.create("qty_28_p" + ".qty", "qty_28"),
				MCItemDef.create("qty_29_p" + ".qty", "qty_29"),
				MCItemDef.create("qty_30_p" + ".qty", "qty_30"),
				MCItemDef.create("qty_31_p" + ".qty", "qty_31"),
				MCItemDef.create("qty_32_p" + ".qty", "qty_32"),
				MCItemDef.create("qty_33_p" + ".qty", "qty_33"),
				MCItemDef.create("qty_34_p" + ".qty", "qty_34"),
				MCItemDef.create("qty_35_p" + ".qty", "qty_35"),
				MCItemDef.create("qty_36_p" + ".qty", "qty_36"),
				MCItemDef.create("qty_37_p" + ".qty", "qty_37"),
				MCItemDef.create("qty_38_p" + ".qty", "qty_38"),
				MCItemDef.create("qty_39_p" + ".qty", "qty_39"),
				MCItemDef.create("qty_40_p" + ".qty", "qty_40"),
				MCItemDef.create("qty_41_p" + ".qty", "qty_41"),
				MCItemDef.create("qty_42_p" + ".qty", "qty_42"),
				MCItemDef.create("qty_43_p" + ".qty", "qty_43"),
				MCItemDef.create("qty_44_p" + ".qty", "qty_44"),
				MCItemDef.create("qty_45_p" + ".qty", "qty_45"),
				MCItemDef.create("qty_46_p" + ".qty", "qty_46"),
				MCItemDef.create("qty_47_p" + ".qty", "qty_47"),
				MCItemDef.create("qty_48_p" + ".qty", "qty_48"),
				MCItemDef.create("qty_49_p" + ".qty", "qty_49"),
				MCItemDef.create("qty_50_p" + ".qty", "qty_50"),
				MCItemDef.create("qty_51_p" + ".qty", "qty_51"),
				MCItemDef.create("qty_52_p" + ".qty", "qty_52"),
				MCItemDef.create("qty_53_p" + ".qty", "qty_53"),
				MCItemDef.create("qty_54_p" + ".qty", "qty_54"),
				MCItemDef.create("qty_55_p" + ".qty", "qty_55"),
				MCItemDef.create("qty_56_p" + ".qty", "qty_56"),
				MCItemDef.create("qty_57_p" + ".qty", "qty_57"),
				MCItemDef.create("qty_58_p" + ".qty", "qty_58"),
				MCItemDef.create("qty_59_p" + ".qty", "qty_59"),
				MCItemDef.create("qty_60_p" + ".qty", "qty_60"),
				MCItemDef.create("qty_61_p" + ".qty", "qty_61"),
				MCItemDef.create("qty_62_p" + ".qty", "qty_62"),
				MCItemDef.create("qty_63_p" + ".qty", "qty_63"),
				MCItemDef.create("qty_64_p" + ".qty", "qty_64"),
				MCItemDef.create("qty_65_p" + ".qty", "qty_65"),
				MCItemDef.create("qty_66_p" + ".qty", "qty_66"),
				MCItemDef.create("qty_67_p" + ".qty", "qty_67"),
				MCItemDef.create("qty_68_p" + ".qty", "qty_68"),
				MCItemDef.create("qty_69_p" + ".qty", "qty_69"),
				MCItemDef.create("qty_70_p" + ".qty", "qty_70"),
				MCItemDef.create("qty_71_p" + ".qty", "qty_71"),
				MCItemDef.create("qty_72_p" + ".qty", "qty_72"),
				MCItemDef.create("qty_73_p" + ".qty", "qty_73"),
				MCItemDef.create("qty_74_p" + ".qty", "qty_74"),
				MCItemDef.create("qty_75_p" + ".qty", "qty_75"),
				MCItemDef.create("qty_76_p" + ".qty", "qty_76"),
				MCItemDef.create("qty_77_p" + ".qty", "qty_77"),
				MCItemDef.create("qty_78_p" + ".qty", "qty_78"),
				MCItemDef.create("qty_79_p" + ".qty", "qty_79"),
				MCItemDef.create("qty_80_p" + ".qty", "qty_80"),
				MCItemDef.create("qty_81_p" + ".qty", "qty_81"),
				MCItemDef.create("qty_82_p" + ".qty", "qty_82"),
				MCItemDef.create("qty_83_p" + ".qty", "qty_83"),
				MCItemDef.create("qty_84_p" + ".qty", "qty_84"),
				MCItemDef.create("qty_85_p" + ".qty", "qty_85"),
				MCItemDef.create("qty_86_p" + ".qty", "qty_86"),
				MCItemDef.create("qty_87_p" + ".qty", "qty_87"),
				MCItemDef.create("qty_88_p" + ".qty", "qty_88"),
				MCItemDef.create("qty_89_p" + ".qty", "qty_89"),
				MCItemDef.create("qty_90_p" + ".qty", "qty_90"),
				MCItemDef.create("qty_91_p" + ".qty", "qty_91"),
				MCItemDef.create("qty_92_p" + ".qty", "qty_92"),
				MCItemDef.create("qty_93_p" + ".qty", "qty_93")
			}
			,
			MCBlockDef.create("MpsMaxRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty_p" + ".qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0020_Del01_INFO = new MCOperationInfo("MS", "MSBCL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0020_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL0020_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}


	public static MCContainerDef MS_MSBCL0020_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL0020_Del01_DOWN_BLOCK1() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("ReqRslt")
		);
	}
	//FMCB DEF_CLASSES END
}

