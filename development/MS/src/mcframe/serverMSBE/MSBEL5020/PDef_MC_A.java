package mcframe.serverMSBE.MSBEL5020;

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
 * [MSBEL_IoSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5020.IoSchd_Ins01.UP.BLOCK0")){
			return MS_MSBEL5020_IoSchd_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5020.IoSchd_Del01.UP.BLOCK0")){
			return MS_MSBEL5020_IoSchd_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5020.IoSchd_Del02.UP.BLOCK0")){
			return MS_MSBEL5020_IoSchd_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5020.IoSchd_Del02.UP.BLOCK1")){
			return MS_MSBEL5020_IoSchd_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5020.IoSchd_Upd01.UP.BLOCK0")){
			return MS_MSBEL5020_IoSchd_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL5020_IoSchd_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5020", "IoSchd_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5020_IoSchd_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5020", "IoSchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("io_schd" + ".io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd" + ".io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd" + ".io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd" + ".io_schd_seq", "io_schd_seq"),
				MCItemDef.create("io_schd" + ".io_schd_sub_typ1", "io_schd_sub_typ1"),
				MCItemDef.create("io_schd" + ".io_schd_sub_no1", "io_schd_sub_no1"),
				MCItemDef.create("io_schd" + ".io_schd_sub_seq1", "io_schd_sub_seq1"),
				MCItemDef.create("io_schd" + ".io_schd_sub_typ2", "io_schd_sub_typ2"),
				MCItemDef.create("io_schd" + ".io_schd_sub_no2", "io_schd_sub_no2"),
				MCItemDef.create("io_schd" + ".io_schd_sub_seq2", "io_schd_sub_seq2"),
				MCItemDef.create("io_schd" + ".io_schd_sub_typ3", "io_schd_sub_typ3"),
				MCItemDef.create("io_schd" + ".io_schd_sub_no3", "io_schd_sub_no3"),
				MCItemDef.create("io_schd" + ".io_schd_sub_seq3", "io_schd_sub_seq3"),
				MCItemDef.create("io_schd" + ".io_schd_sub_typ4", "io_schd_sub_typ4"),
				MCItemDef.create("io_schd" + ".io_schd_sub_no4", "io_schd_sub_no4"),
				MCItemDef.create("io_schd" + ".io_schd_sub_seq4", "io_schd_sub_seq4"),
				MCItemDef.create("io_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_cmpl_schd_dt", "insp_cmpl_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
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
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_wait_flg", "alloc_wait_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_gd_cd", "gr_gd_cd"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("ex_cmpl_schd_dt", "ex_cmpl_schd_dt"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("IoSchd_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5020_IoSchd_Del01_INFO = new MCOperationInfo("MS", "MSBEL5020", "IoSchd_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5020_IoSchd_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5020", "IoSchd_Del01",
			new MCItemDef[]{
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq")
			}
			,
			MCBlockDef.create("IoSchd_Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5020_IoSchd_Del02_INFO = new MCOperationInfo("MS", "MSBEL5020", "IoSchd_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5020_IoSchd_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5020", "IoSchd_Del02",
			new MCItemDef[]{
				MCItemDef.create("io_schd_sub_typ1", "io_schd_sub_typ1"),
				MCItemDef.create("io_schd_sub_no1", "io_schd_sub_no1"),
				MCItemDef.create("io_schd_sub_seq1", "io_schd_sub_seq1"),
				MCItemDef.create("io_schd_sub_typ2", "io_schd_sub_typ2"),
				MCItemDef.create("io_schd_sub_no2", "io_schd_sub_no2"),
				MCItemDef.create("io_schd_sub_seq2", "io_schd_sub_seq2"),
				MCItemDef.create("io_schd_sub_typ3", "io_schd_sub_typ3"),
				MCItemDef.create("io_schd_sub_no3", "io_schd_sub_no3"),
				MCItemDef.create("io_schd_sub_seq3", "io_schd_sub_seq3"),
				MCItemDef.create("io_schd_sub_typ4", "io_schd_sub_typ4"),
				MCItemDef.create("io_schd_sub_no4", "io_schd_sub_no4"),
				MCItemDef.create("io_schd_sub_seq4", "io_schd_sub_seq4"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("IoSchd_Del02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5020_IoSchd_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5020", "IoSchd_Del02",
			new MCItemDef[]{
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ")
			}
			,
			MCBlockDef.create("IoSchd_Del02_Cnd2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5020_IoSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5020", "IoSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5020_IoSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5020", "IoSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("upd_io_schd_sts_typ", "upd_io_schd_sts_typ"),
				MCItemDef.create("upd_insp_cmpl_schd_dt", "upd_insp_cmpl_schd_dt")
			}
			,
			MCBlockDef.create("IoSchd_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

