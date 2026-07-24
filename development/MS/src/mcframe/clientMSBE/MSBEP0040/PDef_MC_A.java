package mcframe.clientMSBE.MSBEP0040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_AllocSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0040.Srch01.UP.BLOCK0")){
			return MS_MSBEL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0040.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0040.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL0040_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0040.Srch01.DOWN.BLOCK2")){
			return MS_MSBEL0040_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL0040.Srch01.DOWN.BLOCK3")){
			return MS_MSBEL0040_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.UP.BLOCK0")){
			return MS_MSBEL0040_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL0040_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL0040_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.DOWN.BLOCK2")){
			return MS_MSBEL0040_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.DOWN.BLOCK3")){
			return MS_MSBEL0040_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL0040.Srch02.DOWN.BLOCK4")){
			return MS_MSBEL0040_Srch02_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL0040_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0040_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("gr_prcd", "gr_prcd"),
				MCItemDef.create("gr_sts_opn_grp", "gr_sts_opn_grp"),
				MCItemDef.create("gr_sts_ordsav_grp", "gr_sts_ordsav_grp"),
				MCItemDef.create("gr_sts_fix_grp", "gr_sts_fix_grp"),
				MCItemDef.create("gr_sts_schd_grp", "gr_sts_schd_grp"),
				MCItemDef.create("gr_sts_ord_grp", "gr_sts_ord_grp"),
				MCItemDef.create("gr_act", "gr_act"),
				MCItemDef.create("gi_prcd", "gi_prcd"),
				MCItemDef.create("gi_sts_opn_grp", "gi_sts_opn_grp"),
				MCItemDef.create("gi_sts_ordsav_grp", "gi_sts_ordsav_grp"),
				MCItemDef.create("gi_sts_fix_grp", "gi_sts_fix_grp"),
				MCItemDef.create("gi_sts_schd_grp", "gi_sts_schd_grp"),
				MCItemDef.create("gi_sts_ord_grp", "gi_sts_ord_grp"),
				MCItemDef.create("gi_act", "gi_act"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("alloc_gi_flg", "alloc_gi_flg"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0040_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_RsltQty] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_base_qty_p" + ".qty", "stk_qty"),
				MCItemDef.create("stk_base_qty2_p" + ".qty", "stk_qty2"),
				MCItemDef.create("stk_base_qty3_p" + ".qty", "stk_qty3"),
				MCItemDef.create("stk_base_qty4_p" + ".qty", "stk_qty4"),
				MCItemDef.create("gr_base_qty_p" + ".qty", "gr_qty"),
				MCItemDef.create("gr_base_qty2_p" + ".qty", "gr_qty2"),
				MCItemDef.create("gr_base_qty3_p" + ".qty", "gr_qty3"),
				MCItemDef.create("gr_base_qty4_p" + ".qty", "gr_qty4"),
				MCItemDef.create("gi_base_qty_p" + ".qty", "gi_qty"),
				MCItemDef.create("gi_base_qty2_p" + ".qty", "gi_qty2"),
				MCItemDef.create("gi_base_qty3_p" + ".qty", "gi_qty3"),
				MCItemDef.create("gi_base_qty4_p" + ".qty", "gi_qty4"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place")
			}
			,
			MCBlockDef.create("HdrQty")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_RsltContFctr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_cont_qty_p" + ".cont_qty", "stk_qty"),
				MCItemDef.create("stk_cont_qty2_p" + ".cont_qty", "stk_qty2"),
				MCItemDef.create("stk_cont_qty3_p" + ".cont_qty", "stk_qty3"),
				MCItemDef.create("stk_cont_qty4_p" + ".cont_qty", "stk_qty4"),
				MCItemDef.create("gr_cont_qty_p" + ".cont_qty", "gr_qty"),
				MCItemDef.create("gr_cont_qty2_p" + ".cont_qty", "gr_qty2"),
				MCItemDef.create("gr_cont_qty3_p" + ".cont_qty", "gr_qty3"),
				MCItemDef.create("gr_cont_qty4_p" + ".cont_qty", "gr_qty4"),
				MCItemDef.create("gi_cont_qty_p" + ".cont_qty", "gi_qty"),
				MCItemDef.create("gi_cont_qty2_p" + ".cont_qty", "gi_qty2"),
				MCItemDef.create("gi_cont_qty3_p" + ".cont_qty", "gi_qty3"),
				MCItemDef.create("gi_cont_qty4_p" + ".cont_qty", "gi_qty4"),
				MCItemDef.create("cont_fctr_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ")
			}
			,
			MCBlockDef.create("HdrContFctr")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_RsltGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("schd_stk_typ_nm", "schd_stk_typ_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("grs_alloc_avl_qty_p" + ".qty", "grs_alloc_avl_qty"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_ptn_typ_nm", "trd_ptn_typ_nm"),
				MCItemDef.create("trn_typ", "trn_typ"),
				MCItemDef.create("trn_typ_nm", "trn_typ_nm"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("io_act_typ_nm", "io_act_typ_nm")
			}
			,
			MCBlockDef.create("RsltGr")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_RsltGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("schd_stk_typ_nm", "schd_stk_typ_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("grs_alloc_avl_qty_p" + ".qty", "grs_alloc_avl_qty"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_ptn_typ_nm", "trd_ptn_typ_nm"),
				MCItemDef.create("trn_typ", "trn_typ"),
				MCItemDef.create("trn_typ_nm", "trn_typ_nm"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("io_act_typ_nm", "io_act_typ_nm")
			}
			,
			MCBlockDef.create("RsltGi")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0040_Srch02_INFO = new MCOperationInfo("MS", "MSBEL0040", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0040_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("tgt", "tgt"),
				MCItemDef.create("gr_prcd", "gr_prcd"),
				MCItemDef.create("gr_sts_opn_grp", "gr_sts_opn_grp"),
				MCItemDef.create("gr_sts_ordsav_grp", "gr_sts_ordsav_grp"),
				MCItemDef.create("gr_sts_fix_grp", "gr_sts_fix_grp"),
				MCItemDef.create("gr_sts_schd_grp", "gr_sts_schd_grp"),
				MCItemDef.create("gr_sts_ord_grp", "gr_sts_ord_grp"),
				MCItemDef.create("gr_act", "gr_act"),
				MCItemDef.create("gi_prcd", "gi_prcd"),
				MCItemDef.create("gi_sts_opn_grp", "gi_sts_opn_grp"),
				MCItemDef.create("gi_sts_ordsav_grp", "gi_sts_ordsav_grp"),
				MCItemDef.create("gi_sts_fix_grp", "gi_sts_fix_grp"),
				MCItemDef.create("gi_sts_schd_grp", "gi_sts_schd_grp"),
				MCItemDef.create("gi_sts_ord_grp", "gi_sts_ord_grp"),
				MCItemDef.create("gi_act", "gi_act"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("except_invld_lot_flg", "except_invld_lot_flg"),
				MCItemDef.create("except_alloc_wait_flg", "except_alloc_wait_flg"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0040_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_RsltQty] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("stk_base_qty_p" + ".qty", "stk_qty"),
				MCItemDef.create("stk_base_qty2_p" + ".qty", "stk_qty2"),
				MCItemDef.create("stk_base_qty3_p" + ".qty", "stk_qty3"),
				MCItemDef.create("stk_base_qty4_p" + ".qty", "stk_qty4"),
				MCItemDef.create("gr_base_qty_p" + ".qty", "gr_qty"),
				MCItemDef.create("gr_base_qty2_p" + ".qty", "gr_qty2"),
				MCItemDef.create("gr_base_qty3_p" + ".qty", "gr_qty3"),
				MCItemDef.create("gr_base_qty4_p" + ".qty", "gr_qty4"),
				MCItemDef.create("gi_base_qty_p" + ".qty", "gi_qty"),
				MCItemDef.create("gi_base_qty2_p" + ".qty", "gi_qty2"),
				MCItemDef.create("gi_base_qty3_p" + ".qty", "gi_qty3"),
				MCItemDef.create("gi_base_qty4_p" + ".qty", "gi_qty4"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place")
			}
			,
			MCBlockDef.create("HdrQty")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_RsltContFctr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("stk_cont_qty_p" + ".cont_qty", "stk_qty"),
				MCItemDef.create("stk_cont_qty2_p" + ".cont_qty", "stk_qty2"),
				MCItemDef.create("stk_cont_qty3_p" + ".cont_qty", "stk_qty3"),
				MCItemDef.create("stk_cont_qty4_p" + ".cont_qty", "stk_qty4"),
				MCItemDef.create("gr_cont_qty_p" + ".cont_qty", "gr_qty"),
				MCItemDef.create("gr_cont_qty2_p" + ".cont_qty", "gr_qty2"),
				MCItemDef.create("gr_cont_qty3_p" + ".cont_qty", "gr_qty3"),
				MCItemDef.create("gr_cont_qty4_p" + ".cont_qty", "gr_qty4"),
				MCItemDef.create("gi_cont_qty_p" + ".cont_qty", "gi_qty"),
				MCItemDef.create("gi_cont_qty2_p" + ".cont_qty", "gi_qty2"),
				MCItemDef.create("gi_cont_qty3_p" + ".cont_qty", "gi_qty3"),
				MCItemDef.create("gi_cont_qty4_p" + ".cont_qty", "gi_qty4"),
				MCItemDef.create("cont_fctr_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ")
			}
			,
			MCBlockDef.create("HdrContFctr")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_RsltGr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("schd_stk_typ_nm", "schd_stk_typ_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("lot_alloc_qty_p" + ".qty", "lot_alloc_qty"),
				MCItemDef.create("lot_wait_qty_p" + ".qty", "lot_wait_qty"),
				MCItemDef.create("lot_alloc_avl_qty_p" + ".qty", "lot_alloc_avl_qty"),
				MCItemDef.create("not_lot_alloc_qty_p" + ".qty", "not_lot_alloc_qty"),
				MCItemDef.create("not_lot_wait_qty_p" + ".qty", "not_lot_wait_qty"),
				MCItemDef.create("not_lot_alloc_avl_qty_p" + ".qty", "not_lot_alloc_avl_qty"),
				MCItemDef.create("lg_lot_alloc_qty_p" + ".qty", "lg_lot_alloc_qty"),
				MCItemDef.create("lg_lot_wait_qty_p" + ".qty", "lg_lot_wait_qty"),
				MCItemDef.create("lg_lot_alloc_avl_qty_p" + ".qty", "lg_lot_alloc_avl_qty"),
				MCItemDef.create("lg_not_lot_alloc_qty_p" + ".qty", "lg_not_lot_alloc_qty"),
				MCItemDef.create("lg_not_lot_wait_qty_p" + ".qty", "lg_not_lot_wait_qty"),
				MCItemDef.create("lg_not_lot_alloc_avl_qty_p" + ".qty", "lg_not_lot_alloc_avl_qty"),
				MCItemDef.create("grs_alloc_qty_p" + ".qty", "grs_alloc_qty"),
				MCItemDef.create("grs_wait_qty_p" + ".qty", "grs_wait_qty"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("wait_qty_p" + ".qty", "wait_qty"),
				MCItemDef.create("grs_alloc_avl_qty_p" + ".qty", "grs_alloc_avl_qty"),
				MCItemDef.create("alloc_unit_cd", "alloc_unit_cd"),
				MCItemDef.create("alloc_unit_nm", "alloc_unit_nm"),
				MCItemDef.create("alloc_unit_dec_place", "alloc_unit_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_alloc_qty_p" + ".cont_qty", "act_cont_alloc_qty"),
				MCItemDef.create("act_cont_wait_qty_p" + ".cont_qty", "act_cont_wait_qty"),
				MCItemDef.create("act_cont_alloc_avl_qty_p" + ".cont_qty", "act_cont_alloc_avl_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_alloc_qty_p" + ".cont_qty", "std_cont_alloc_qty"),
				MCItemDef.create("std_cont_wait_qty_p" + ".cont_qty", "std_cont_wait_qty"),
				MCItemDef.create("std_cont_alloc_avl_qty_p" + ".cont_qty", "std_cont_alloc_avl_qty"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
				MCItemDef.create("loc_sppl_nm", "loc_sppl_nm"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("overdue_alloc_flg", "overdue_alloc_flg"),
				MCItemDef.create("another_loc_alloc_flg", "another_loc_alloc_flg"),
				MCItemDef.create("abnormal_alloc_flg", "abnormal_alloc_flg"),
				MCItemDef.create("lno", "lno")
			}
			,
			MCBlockDef.create("RsltGr")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch02_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch02_RsltGi] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("schd_stk_typ_nm", "schd_stk_typ_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("lot_alloc_qty_p" + ".qty", "lot_alloc_qty"),
				MCItemDef.create("lot_wait_qty_p" + ".qty", "lot_wait_qty"),
				MCItemDef.create("lot_alloc_avl_qty_p" + ".qty", "lot_alloc_avl_qty"),
				MCItemDef.create("not_lot_alloc_qty_p" + ".qty", "not_lot_alloc_qty"),
				MCItemDef.create("not_lot_wait_qty_p" + ".qty", "not_lot_wait_qty"),
				MCItemDef.create("not_lot_alloc_avl_qty_p" + ".qty", "not_lot_alloc_avl_qty"),
				MCItemDef.create("lg_lot_alloc_qty_p" + ".qty", "lg_lot_alloc_qty"),
				MCItemDef.create("lg_lot_wait_qty_p" + ".qty", "lg_lot_wait_qty"),
				MCItemDef.create("lg_lot_alloc_avl_qty_p" + ".qty", "lg_lot_alloc_avl_qty"),
				MCItemDef.create("lg_not_lot_alloc_qty_p" + ".qty", "lg_not_lot_alloc_qty"),
				MCItemDef.create("lg_not_lot_wait_qty_p" + ".qty", "lg_not_lot_wait_qty"),
				MCItemDef.create("lg_not_lot_alloc_avl_qty_p" + ".qty", "lg_not_lot_alloc_avl_qty"),
				MCItemDef.create("grs_alloc_qty_p" + ".qty", "grs_alloc_qty"),
				MCItemDef.create("grs_wait_qty_p" + ".qty", "grs_wait_qty"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("wait_qty_p" + ".qty", "wait_qty"),
				MCItemDef.create("grs_alloc_avl_qty_p" + ".qty", "grs_alloc_avl_qty"),
				MCItemDef.create("alloc_unit_cd", "alloc_unit_cd"),
				MCItemDef.create("alloc_unit_nm", "alloc_unit_nm"),
				MCItemDef.create("alloc_unit_dec_place", "alloc_unit_dec_place"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_alloc_qty_p" + ".cont_qty", "act_cont_alloc_qty"),
				MCItemDef.create("act_cont_wait_qty_p" + ".cont_qty", "act_cont_wait_qty"),
				MCItemDef.create("act_cont_alloc_avl_qty_p" + ".cont_qty", "act_cont_alloc_avl_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_alloc_qty_p" + ".cont_qty", "std_cont_alloc_qty"),
				MCItemDef.create("std_cont_wait_qty_p" + ".cont_qty", "std_cont_wait_qty"),
				MCItemDef.create("std_cont_alloc_avl_qty_p" + ".cont_qty", "std_cont_alloc_avl_qty"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
				MCItemDef.create("loc_sppl_nm", "loc_sppl_nm"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("overdue_alloc_flg", "overdue_alloc_flg"),
				MCItemDef.create("another_loc_alloc_flg", "another_loc_alloc_flg"),
				MCItemDef.create("abnormal_alloc_flg", "abnormal_alloc_flg"),
				MCItemDef.create("lno", "lno")
			}
			,
			MCBlockDef.create("RsltGi")
		);
	}
	public static MCContainerDef MS_MSBEL0040_Srch02_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch02_Lno] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno")
		);
	}
	//FMCB DEF_CLASSES END
}

