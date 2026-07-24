package mcframe.serverMSBC.MSBCL0140;

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
 * [MSBCL_PrcdOrdReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0140.Srch01.UP.BLOCK0")){
			return MS_MSBCL0140_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0140_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL0140_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0140.Sprt01.UP.BLOCK0")){
			return MS_MSBCL0140_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL0140_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Sprt02.UP.BLOCK0")){
			return MS_MSBCL0140_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL0140_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Sprt03.UP.BLOCK0")){
			return MS_MSBCL0140_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL0140_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Chk01.UP.BLOCK0")){
			return MS_MSBCL0140_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Chk01.UP.BLOCK1")){
			return MS_MSBCL0140_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0140.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0140_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Chk01.DOWN.BLOCK1")){
			return MS_MSBCL0140_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0140.Chk02.UP.BLOCK0")){
			return MS_MSBCL0140_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Chk02.DOWN.BLOCK0")){
			return MS_MSBCL0140_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Upd01.UP.BLOCK0")){
			return MS_MSBCL0140_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Upd01.UP.BLOCK1")){
			return MS_MSBCL0140_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0140.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0140_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0140.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL0140_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0140.Del01.UP.BLOCK0")){
			return MS_MSBCL0140_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBCL0140_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0140", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ_nm", "itm_ord_sts_typ_nm"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mst_mfg_loc_cd", "mst_mfg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_sppl_cd", "mfg_sppl_cd"),
				MCItemDef.create("mfg_maker_cd", "mfg_maker_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("nmr_qty", "nmr_qty"),
				MCItemDef.create("dnm_qty", "dnm_qty"),
				MCItemDef.create("fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_inst_qty", "cont_fctr_inst_qty"),
				MCItemDef.create("cont_fctr_schd_yield", "cont_fctr_schd_yield"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("insp_flg", "insp_flg"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("itm_order_upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0140_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("oper_conv_schd_qty", "oper_conv_schd_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst_typ_nm", "oper_offst_typ_nm"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL0140", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt")
			}
			,
			MCBlockDef.create("Sprt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("insp_flg", "insp_flg")
			}
			,
			MCBlockDef.create("Sprt01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL0140", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt")
			}
			,
			MCBlockDef.create("Sprt02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("mst_mfg_loc_cd", "mst_mfg_loc_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("oper_conv_schd_qty", "oper_conv_schd_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst_typ_nm", "oper_offst_typ_nm"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sprt02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL0140", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_sppl_cd", "mfg_sppl_cd"),
				MCItemDef.create("mfg_maker_cd", "mfg_maker_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt")
			}
			,
			MCBlockDef.create("Sprt03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("insp_flg", "insp_flg"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst")
			}
			,
			MCBlockDef.create("Sprt03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0140", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ord" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ord" + ".rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("ord" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0140_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0140_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Chk02_INFO = new MCOperationInfo("MS", "MSBCL0140", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0140", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ord" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ord" + ".rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".master_dt", "master_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL0140_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0140_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL0140_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ_nm", "oper_ord_sts_typ_nm")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0140_Del01_INFO = new MCOperationInfo("MS", "MSBCL0140", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0140_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0140", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".upd_cntr", "itm_order_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

