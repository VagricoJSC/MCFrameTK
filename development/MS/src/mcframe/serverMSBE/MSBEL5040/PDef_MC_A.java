package mcframe.serverMSBE.MSBEL5040;

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
 * [MSBEL_AllocMngService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5040.Alloc_Lock_Upd01.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Lock_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.UP.BLOCK3")){
			return MS_MSBEL5040_Alloc_Srch01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.UP.BLOCK4")){
			return MS_MSBEL5040_Alloc_Srch01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.DOWN.BLOCK3")){
			return MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch01.DOWN.BLOCK4")){
			return MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch02.DOWN.BLOCK3")){
			return MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Srch03.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK4")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK5")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.UP.BLOCK6")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK4")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK5")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK6")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK7")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch01.DOWN.BLOCK8")){
			return MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK8();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.UP.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.UP.BLOCK4")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.DOWN.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch02.DOWN.BLOCK4")){
			return MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.UP.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch03.DOWN.BLOCK3")){
			return MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.UP.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.UP.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.DOWN.BLOCK1")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Srch04.DOWN.BLOCK2")){
			return MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Sprt01.UP.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5040.Alloc_Avl_Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL5040_Alloc_Avl_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Lock_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Lock_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Lock_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Lock_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Alloc_Lock_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Srch01_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("short_ope_typ", "short_ope_typ"),
				MCItemDef.create("lot_prop_typ", "lot_prop_typ"),
				MCItemDef.create("except_alloc_wait_flg", "except_alloc_wait_flg"),
				MCItemDef.create("nm_srch_flg", "nm_srch_flg"),
				MCItemDef.create("cont_fctr_calc_flg", "cont_fctr_calc_flg"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("gi_alloc_flg", "gi_alloc_flg"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_flg", "alt_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
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
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_fr_grp", "vld_dt_fr_grp"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("stk_alloc_flg", "stk_alloc_flg"),
				MCItemDef.create("except_alloc_wait_flg", "except_alloc_wait_flg"),
				MCItemDef.create("stk_info_loc_typ", "stk_info_loc_typ"),
				MCItemDef.create("def_ship_lg_grp_cd", "def_ship_lg_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("chk_ship_flg", "chk_ship_flg")
			}
			,
			MCBlockDef.create("Srch_Tgt")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Srch_Stk")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq")
			}
			,
			MCBlockDef.create("Srch_Io_Schd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
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
			MCBlockDef.create("Srch_Io_Schd_Sub")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_sppl_cd", "inpt_sppl_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("stk_str_ln_tgt_flg", "stk_str_ln_tgt_flg"),
				MCItemDef.create("stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_sppl_cd", "stk_sppl_cd"),
				MCItemDef.create("stk_alloc_grp_cd", "stk_alloc_grp_cd"),
				MCItemDef.create("stk_lg_grp_cd", "stk_lg_grp_cd"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_rnd_typ", "pack_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("rqst_sno1", "rqst_sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("rqst_sno2", "rqst_sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("rqst_sno3", "rqst_sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("rqst_sno4", "rqst_sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_sppl_nm", "inpt_sppl_nm"),
				MCItemDef.create("dlv_lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("gi_lg_grp_nm", "gi_lg_grp_nm"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("stk_loc_nm", "stk_loc_nm"),
				MCItemDef.create("stk_str_ln_nm", "stk_str_ln_nm"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("stk_sppl_nm", "stk_sppl_nm"),
				MCItemDef.create("stk_alloc_grp_nm", "stk_alloc_grp_nm"),
				MCItemDef.create("stk_lg_grp_nm", "stk_lg_grp_nm"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("base_unit_nm", "base_unit_nm")
			}
			,
			MCBlockDef.create("Srch_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_alloc_qty", "not_alloc_qty"),
				MCItemDef.create("not_alloc_cont_qty", "not_alloc_cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm")
			}
			,
			MCBlockDef.create("Alt_UnAvl")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_flg", "alt_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
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
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_fr_grp", "vld_dt_fr_grp"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("stk_alloc_flg", "stk_alloc_flg")
			}
			,
			MCBlockDef.create("Srch_Tgt_UnAvl")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Loc_UnAvl_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Grs_UnAvl_List")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Srch02_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("short_ope_typ", "short_ope_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("schd_stk_typ", "schd_stk_typ"),
				MCItemDef.create("schd_stk_prio", "schd_stk_prio"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_seq", "io_schd_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("pack_alloc_flg", "pack_alloc_flg"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_flg", "alt_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_wg_cd", "gr_wg_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("stk_alloc_grp_cd", "stk_alloc_grp_cd"),
				MCItemDef.create("stk_lg_grp_cd", "stk_lg_grp_cd"),
				MCItemDef.create("stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("stk_str_ln_tgt_flg", "stk_str_ln_tgt_flg"),
				MCItemDef.create("stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_sppl_cd", "stk_sppl_cd"),
				MCItemDef.create("stk_ln_flg", "stk_ln_flg"),
				MCItemDef.create("stk_alloc_lmt_flg", "stk_alloc_lmt_flg"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("alloc_days", "alloc_days"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("rqst_sno1", "rqst_sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("rqst_sno2", "rqst_sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("rqst_sno3", "rqst_sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("rqst_sno4", "rqst_sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("lot_quality_typ", "lot_quality_typ"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_src_qty", "pack_unit_src_qty"),
				MCItemDef.create("pack_unit_lot_qty", "pack_unit_lot_qty"),
				MCItemDef.create("pack_unit_not_lot_qty", "pack_unit_not_lot_qty"),
				MCItemDef.create("pack_unit_lg_lot_qty", "pack_unit_lg_lot_qty"),
				MCItemDef.create("pack_unit_lg_not_lot_qty", "pack_unit_lg_not_lot_qty"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_lot_alloc_qty", "pack_unit_lot_alloc_qty"),
				MCItemDef.create("pack_unit_not_lot_alloc_qty", "pack_unit_not_lot_alloc_qty"),
				MCItemDef.create("pack_unit_lg_lot_alloc_qty", "pack_unit_lg_lot_alloc_qty"),
				MCItemDef.create("pack_unit_lg_not_lot_alloc_qty", "pack_unit_lg_not_lot_alloc_qty"),
				MCItemDef.create("pack_unit_grs_alloc_qty", "pack_unit_grs_alloc_qty"),
				MCItemDef.create("pack_unit_alloc_qty", "pack_unit_alloc_qty"),
				MCItemDef.create("pack_unit_lot_wait_qty", "pack_unit_lot_wait_qty"),
				MCItemDef.create("pack_unit_not_lot_wait_qty", "pack_unit_not_lot_wait_qty"),
				MCItemDef.create("pack_unit_lg_lot_wait_qty", "pack_unit_lg_lot_wait_qty"),
				MCItemDef.create("pack_unit_lg_not_lot_wait_qty", "pack_unit_lg_not_lot_wait_qty"),
				MCItemDef.create("pack_unit_grs_wait_qty", "pack_unit_grs_wait_qty"),
				MCItemDef.create("pack_unit_wait_qty", "pack_unit_wait_qty"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_rnd_typ", "pack_unit_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_src_qty", "base_unit_src_qty"),
				MCItemDef.create("base_unit_lot_qty", "base_unit_lot_qty"),
				MCItemDef.create("base_unit_not_lot_qty", "base_unit_not_lot_qty"),
				MCItemDef.create("base_unit_lg_lot_qty", "base_unit_lg_lot_qty"),
				MCItemDef.create("base_unit_lg_not_lot_qty", "base_unit_lg_not_lot_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_lot_alloc_qty", "base_unit_lot_alloc_qty"),
				MCItemDef.create("base_unit_not_lot_alloc_qty", "base_unit_not_lot_alloc_qty"),
				MCItemDef.create("base_unit_lg_lot_alloc_qty", "base_unit_lg_lot_alloc_qty"),
				MCItemDef.create("base_unit_lg_not_lot_alloc_qty", "base_unit_lg_not_lot_alloc_qty"),
				MCItemDef.create("base_unit_grs_alloc_qty", "base_unit_grs_alloc_qty"),
				MCItemDef.create("base_unit_alloc_qty", "base_unit_alloc_qty"),
				MCItemDef.create("base_unit_lot_wait_qty", "base_unit_lot_wait_qty"),
				MCItemDef.create("base_unit_not_lot_wait_qty", "base_unit_not_lot_wait_qty"),
				MCItemDef.create("base_unit_lg_lot_wait_qty", "base_unit_lg_lot_wait_qty"),
				MCItemDef.create("base_unit_lg_not_lot_wait_qty", "base_unit_lg_not_lot_wait_qty"),
				MCItemDef.create("base_unit_grs_wait_qty", "base_unit_grs_wait_qty"),
				MCItemDef.create("base_unit_wait_qty", "base_unit_wait_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_fr_grp", "vld_dt_fr_grp"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("stk_info_loc_typ", "stk_info_loc_typ"),
				MCItemDef.create("lno", "lno"),
				MCItemDef.create("can_gi_flg", "can_gi_flg"),
				MCItemDef.create("alloc_grp_non_tgt_flg", "alloc_grp_non_tgt_flg"),
				MCItemDef.create("alloc_grp_srch_flg", "alloc_grp_srch_flg"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("lot_back_stop_typ", "lot_back_stop_typ"),
				MCItemDef.create("chk_ship_flg", "chk_ship_flg")
			}
			,
			MCBlockDef.create("Avl_List")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_alloc_qty", "not_alloc_qty"),
				MCItemDef.create("not_alloc_cont_qty", "not_alloc_cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg")
			}
			,
			MCBlockDef.create("Alt_UnAvl")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rem_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt_UnAvl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Srch03_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("short_ope_typ", "short_ope_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
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
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_fr_grp", "vld_dt_fr_grp"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("stk_alloc_flg", "stk_alloc_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ")
			}
			,
			MCBlockDef.create("Srch_Tgt")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Avl_List")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Rem_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Srch03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt_UnAvl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Avl_Srch01_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Avl_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("short_ope_typ", "short_ope_typ"),
				MCItemDef.create("gi_alloc_flg", "gi_alloc_flg"),
				MCItemDef.create("all_pri_flg", "all_pri_flg"),
				MCItemDef.create("except_alloc_wait_flg", "except_alloc_wait_flg"),
				MCItemDef.create("except_zero_flg", "except_zero_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("except_invld_lot_flg", "except_invld_lot_flg"),
				MCItemDef.create("cont_fctr_calc_flg", "cont_fctr_calc_flg"),
				MCItemDef.create("alloc_grp_srch_flg", "alloc_grp_srch_flg"),
				MCItemDef.create("dtl_calc_flg", "dtl_calc_flg"),
				MCItemDef.create("ignore_margin_days", "ignore_margin_days"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ")
			}
			,
			MCBlockDef.create("Alloc_Avl_Srch01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_schd_dt", "inpt_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alt_flg", "alt_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
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
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_lot_fix_flg", "not_lot_fix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_fr_grp", "vld_dt_fr_grp"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("stk_alloc_flg", "stk_alloc_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_grp_srch_flg", "alloc_grp_srch_flg")
			}
			,
			MCBlockDef.create("Pri_Srch_Tgt")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Srch_Stk")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm")
			}
			,
			MCBlockDef.create("Srch_Lot_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_no", "io_schd_no")
			}
			,
			MCBlockDef.create("Srch_Io_Schd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Loc_Avl_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Grs_Avl_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Loc_UnAvl_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Grs_UnAvl_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt_Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_alloc_qty", "not_alloc_qty"),
				MCItemDef.create("not_alloc_cont_qty", "not_alloc_cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg")
			}
			,
			MCBlockDef.create("Srch_Tgt_Alt_UnAvl")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Tgt_UnAvl")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK7() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Can_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch01_DOWN_BLOCK8() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno_List")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Avl_Srch02_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Avl_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("except_zero_flg", "except_zero_flg"),
				MCItemDef.create("dtl_calc_flg", "dtl_calc_flg"),
				MCItemDef.create("ignore_margin_dt", "ignore_margin_dt")
			}
			,
			MCBlockDef.create("Alloc_Avl_Srch02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_Fix_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_Not_Fix_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno_List")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_Fix_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_Not_Fix_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Can_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch02_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch02",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno_List")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Avl_Srch03_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Avl_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("except_zero_flg", "except_zero_flg"),
				MCItemDef.create("dtl_calc_flg", "dtl_calc_flg"),
				MCItemDef.create("ignore_margin_dt", "ignore_margin_dt")
			}
			,
			MCBlockDef.create("Alloc_Avl_Srch03_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno_List")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Can_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch03_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch03",
			new MCItemDef[]{
				MCItemDef.create("gi_lno", "gi_lno"),
				MCItemDef.create("gr_lno", "gr_lno")
			}
			,
			MCBlockDef.create("Lno_List")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Avl_Srch04_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Avl_Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("one_flg", "one_flg"),
				MCItemDef.create("gr_no_sort_flg", "gr_no_sort_flg"),
				MCItemDef.create("except_zero_flg", "except_zero_flg"),
				MCItemDef.create("short_ope_typ", "short_ope_typ"),
				MCItemDef.create("proc_typ", "proc_typ")
			}
			,
			MCBlockDef.create("Alloc_Avl_Srch04_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_List")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Stk_Gr_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Gi_List")
		);
	}
	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Srch04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Srch_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5040_Alloc_Avl_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL5040", "Alloc_Avl_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt")
			}
			,
			MCBlockDef.create("Alloc_Avl_Sprt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5040_Alloc_Avl_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5040", "Alloc_Avl_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("exceed_alloc_days_flg", "exceed_alloc_days_flg")
			}
			,
			MCBlockDef.create("Alloc_Avl_Sprt01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

