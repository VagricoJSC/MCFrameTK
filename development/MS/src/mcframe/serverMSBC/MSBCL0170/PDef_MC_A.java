package mcframe.serverMSBC.MSBCL0170;

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
 * [MSBCL_SimIoTrnsSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0170.Srch01.UP.BLOCK0")){
			return MS_MSBCL0170_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0170_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL0170_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0170.Srch02.UP.BLOCK0")){
			return MS_MSBCL0170_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch02.DOWN.BLOCK0")){
			return MS_MSBCL0170_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch02.DOWN.BLOCK1")){
			return MS_MSBCL0170_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0170.Srch03.UP.BLOCK0")){
			return MS_MSBCL0170_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch03.DOWN.BLOCK0")){
			return MS_MSBCL0170_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0170.Srch03.DOWN.BLOCK1")){
			return MS_MSBCL0170_Srch03_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL0170_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0170", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0170_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("gr_prcd_flg", "gr_prcd_flg"),
				MCItemDef.create("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg"),
				MCItemDef.create("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg"),
				MCItemDef.create("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg"),
				MCItemDef.create("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg"),
				MCItemDef.create("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg"),
				MCItemDef.create("gr_act_flg", "gr_act_flg"),
				MCItemDef.create("gi_prcd_flg", "gi_prcd_flg"),
				MCItemDef.create("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg"),
				MCItemDef.create("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg"),
				MCItemDef.create("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg"),
				MCItemDef.create("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg"),
				MCItemDef.create("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg"),
				MCItemDef.create("gi_act_flg", "gi_act_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("missing_flg", "missing_flg"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_flg", "sim_flg"),
				MCItemDef.create("purc_dt_fr", "purc_dt_fr"),
				MCItemDef.create("purc_dt_to", "purc_dt_to"),
				MCItemDef.create("tgt_ver_flg", "tgt_ver_flg"),
				MCItemDef.create("non_cmpl_ver_flg", "non_cmpl_ver_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("alloc_gi_flg", "alloc_gi_flg"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sum_unit_typ", "sum_unit_typ"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0170_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	public static MCContainerDef MS_MSBCL0170_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("gr_schd_qty", "gr_schd_qty"),
				MCItemDef.create("gi_schd_qty", "gi_schd_qty"),
				MCItemDef.create("gr_act_qty", "gr_act_qty"),
				MCItemDef.create("gi_act_qty", "gi_act_qty"),
				MCItemDef.create("stk_qty", "stk_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("stk_amt", "stk_amt"),
				MCItemDef.create("sim_flg", "sim_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0170_Srch02_INFO = new MCOperationInfo("MS", "MSBCL0170", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0170_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("gr_prcd_flg", "gr_prcd_flg"),
				MCItemDef.create("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg"),
				MCItemDef.create("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg"),
				MCItemDef.create("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg"),
				MCItemDef.create("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg"),
				MCItemDef.create("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg"),
				MCItemDef.create("gr_act_flg", "gr_act_flg"),
				MCItemDef.create("gi_prcd_flg", "gi_prcd_flg"),
				MCItemDef.create("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg"),
				MCItemDef.create("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg"),
				MCItemDef.create("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg"),
				MCItemDef.create("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg"),
				MCItemDef.create("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg"),
				MCItemDef.create("gi_act_flg", "gi_act_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("missing_flg", "missing_flg"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_flg", "sim_flg"),
				MCItemDef.create("purc_dt_fr", "purc_dt_fr"),
				MCItemDef.create("purc_dt_to", "purc_dt_to"),
				MCItemDef.create("tgt_ver_flg", "tgt_ver_flg"),
				MCItemDef.create("non_cmpl_ver_flg", "non_cmpl_ver_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("alloc_gi_flg", "alloc_gi_flg"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sum_unit_typ", "sum_unit_typ"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0170_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	public static MCContainerDef MS_MSBCL0170_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("gr_schd_qty", "gr_schd_qty"),
				MCItemDef.create("gi_schd_qty", "gi_schd_qty"),
				MCItemDef.create("gr_act_qty", "gr_act_qty"),
				MCItemDef.create("gi_act_qty", "gi_act_qty"),
				MCItemDef.create("stk_qty", "stk_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("stk_amt", "stk_amt"),
				MCItemDef.create("sim_flg", "sim_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0170_Srch03_INFO = new MCOperationInfo("MS", "MSBCL0170", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0170_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("gr_prcd_flg", "gr_prcd_flg"),
				MCItemDef.create("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg"),
				MCItemDef.create("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg"),
				MCItemDef.create("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg"),
				MCItemDef.create("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg"),
				MCItemDef.create("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg"),
				MCItemDef.create("gr_act_flg", "gr_act_flg"),
				MCItemDef.create("gi_prcd_flg", "gi_prcd_flg"),
				MCItemDef.create("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg"),
				MCItemDef.create("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg"),
				MCItemDef.create("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg"),
				MCItemDef.create("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg"),
				MCItemDef.create("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg"),
				MCItemDef.create("gi_act_flg", "gi_act_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("missing_flg", "missing_flg"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_flg", "sim_flg"),
				MCItemDef.create("purc_dt_fr", "purc_dt_fr"),
				MCItemDef.create("purc_dt_to", "purc_dt_to"),
				MCItemDef.create("tgt_ver_flg", "tgt_ver_flg"),
				MCItemDef.create("non_cmpl_ver_flg", "non_cmpl_ver_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("alloc_gi_flg", "alloc_gi_flg"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sum_unit_typ", "sum_unit_typ"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0170_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	public static MCContainerDef MS_MSBCL0170_Srch03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0170", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("gr_schd_qty", "gr_schd_qty"),
				MCItemDef.create("gi_schd_qty", "gi_schd_qty"),
				MCItemDef.create("gr_act_qty", "gr_act_qty"),
				MCItemDef.create("gi_act_qty", "gi_act_qty"),
				MCItemDef.create("stk_qty", "stk_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("stk_amt", "stk_amt"),
				MCItemDef.create("sim_flg", "sim_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

