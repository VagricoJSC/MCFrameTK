package mcframe.clientMSBC.MSBCP0360;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_PssblPrdQtySrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0360.Srch01.UP.BLOCK0")){
			return MS_MSBCL0360_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0360.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0360_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL0360_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0360", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0360_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0360", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("order", "order"),
				MCItemDef.create("srchItemOrder", "srchItemOrder"),
				MCItemDef.create("stk", "skt_flg"),
				MCItemDef.create("plan_in", "plan_in_flg"),
				MCItemDef.create("unfirm_in", "unfirm_in_flg"),
				MCItemDef.create("plan_out", "plan_out_flg"),
				MCItemDef.create("unfirm_out", "unfirm_out_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
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


	public static MCContainerDef MS_MSBCL0360_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0360", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hrrchy", "hrrchy"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("schd_in_dt", "schd_in_dt"),
				MCItemDef.create("prod_avlbl_sts", "prod_avlbl_sts"),
				MCItemDef.create("purc_itm_sts", "purc_itm_sts"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ord_qty", "ord_qty"),
				MCItemDef.create("need_qty", "need_qty"),
				MCItemDef.create("alloc_avlbl_qty", "alloc_avlbl_qty"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("prod_avlbl_qty", "prod_avlbl_qty"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ_nm", "itm_ord_sts_typ_nm"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("offst_typ", "offst_typ"),
				MCItemDef.create("offst_typ_nm", "offst_typ_nm"),
				MCItemDef.create("offst", "offst"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("rnd_typ_nm", "rnd_typ_nm"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

