package mcframe.clientMSBE.MSBEP0170;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_OPStkRpl]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0170.Srch01.UP.BLOCK0")){
			return MS_MSBEL0170_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0170.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0170_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0170.Sprt01.UP.BLOCK0")){
			return MS_MSBEL0170_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0170.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL0170_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0170.Ins01.UP.BLOCK0")){
			return MS_MSBEL0170_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0170.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL0170_Ins01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL0170_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0170", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0170_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("gr_schd_dt_to", "gr_schd_dt_to"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_wg_nm", "strg_wg_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
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
				MCItemDef.create("shortage_flg", "shortage_flg"),
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


	public static MCContainerDef MS_MSBEL0170_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("op_rpl_mtd_typ_nm", "op_rpl_mtd_typ_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_loc_sppl_cd", "mfg_loc_sppl_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_str_ln_tgt_flg", "rqst_str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "rqst_str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "rqst_str_ln_cd_none_flg"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rqst_qty_p" + ".qty", "rqst_qty"),
				MCItemDef.create("gr_schd_qty_p" + ".qty", "gr_schd_qty"),
				MCItemDef.create("stk_qty_p" + ".qty", "stk_qty"),
				MCItemDef.create("gi_schd_qty_p" + ".qty", "gi_schd_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("rord_stk_qty_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("shortage_qty_p" + ".qty", "shortage_qty"),
				MCItemDef.create("rord_rqst_qty_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("gr_schd_cont_qty_p" + ".cont_qty", "gr_schd_cont_qty"),
				MCItemDef.create("stk_cont_qty_p" + ".cont_qty", "stk_cont_qty"),
				MCItemDef.create("gi_schd_cont_qty_p" + ".cont_qty", "gi_schd_cont_qty"),
				MCItemDef.create("shortage_cont_qty_p" + ".cont_qty", "shortage_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_wg_nm", "strg_wg_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("shortage_flg", "shortage_flg"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0170_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL0170", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0170_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_qty_p" + ".qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL0170_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0170_Ins01_INFO = new MCOperationInfo("MS", "MSBEL0170", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0170_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_qty_p" + ".qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL0170_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0170", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

