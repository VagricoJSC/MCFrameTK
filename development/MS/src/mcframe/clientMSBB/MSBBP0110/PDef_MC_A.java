package mcframe.clientMSBB.MSBBP0110;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_MlySPlnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL0110.Srch01.UP.BLOCK0")){
			return MS_MSBBL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL0110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL0110_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Srch01.DOWN.BLOCK2")){
			return MS_MSBBL0110_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL0110.Srch02.UP.BLOCK0")){
			return MS_MSBBL0110_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch02.DOWN.BLOCK0")){
			return MS_MSBBL0110_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch02.DOWN.BLOCK1")){
			return MS_MSBBL0110_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Srch02.DOWN.BLOCK2")){
			return MS_MSBBL0110_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL0110.Srch02.DOWN.BLOCK3")){
			return MS_MSBBL0110_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBBL0110.Srch03.UP.BLOCK0")){
			return MS_MSBBL0110_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch03.DOWN.BLOCK0")){
			return MS_MSBBL0110_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch03.DOWN.BLOCK1")){
			return MS_MSBBL0110_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Srch04.UP.BLOCK0")){
			return MS_MSBBL0110_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch04.DOWN.BLOCK0")){
			return MS_MSBBL0110_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Srch04.DOWN.BLOCK1")){
			return MS_MSBBL0110_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Sprt01.UP.BLOCK0")){
			return MS_MSBBL0110_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL0110_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Upd01.UP.BLOCK0")){
			return MS_MSBBL0110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Upd01.UP.BLOCK1")){
			return MS_MSBBL0110_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Upd01.UP.BLOCK2")){
			return MS_MSBBL0110_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL0110.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL0110_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Upd02.UP.BLOCK0")){
			return MS_MSBBL0110_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Upd02.UP.BLOCK1")){
			return MS_MSBBL0110_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Upd02.UP.BLOCK2")){
			return MS_MSBBL0110_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL0110.Upd02.DOWN.BLOCK0")){
			return MS_MSBBL0110_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Upd03.UP.BLOCK0")){
			return MS_MSBBL0110_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Del01.UP.BLOCK0")){
			return MS_MSBBL0110_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Del01.UP.BLOCK1")){
			return MS_MSBBL0110_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Del02.UP.BLOCK0")){
			return MS_MSBBL0110_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Del02.UP.BLOCK1")){
			return MS_MSBBL0110_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0110.Del03.UP.BLOCK0")){
			return MS_MSBBL0110_Del03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0110.Del04.UP.BLOCK0")){
			return MS_MSBBL0110_Del04_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBBL0110_Srch01_INFO = new MCOperationInfo("MS", "MSBBL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("pre_flg", "pre_flg"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("usr_ym", "ym"),
				MCItemDef.create("usr_usr_cd", "usr_cd"),
				MCItemDef.create("usr_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("usr_spln_ym_to", "spln_ym_to"),
				MCItemDef.create("usr_reg_t_flg", "reg_t_flg"),
				MCItemDef.create("usr_reg_f_flg", "reg_f_flg"),
				MCItemDef.create("usr_fix_t_flg", "fix_t_flg"),
				MCItemDef.create("usr_fix_f_flg", "fix_f_flg"),
				MCItemDef.create("usr_dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_nm", "dpt_nm"),
				MCItemDef.create("usr_cst_cd", "cst_cd"),
				MCItemDef.create("usr_cst_nm", "cst_nm"),
				MCItemDef.create("usr_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("usr_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("usr_spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("usr_spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("usr_itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("usr_itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("usr_itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("usr_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("usr_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("usr_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("usr_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("usr_itm_p" + ".itm_nm", "itm_nm"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("hdr_del_flg", "hdr_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_ym", "ym"),
				MCItemDef.create("usr_usr_cd", "usr_cd"),
				MCItemDef.create("usr_usr_nm", "usr_nm"),
				MCItemDef.create("usr_edited_flg", "edited_flg"),
				MCItemDef.create("usr_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("usr_sub_char1", "sub_char1"),
				MCItemDef.create("usr_sub_char2", "sub_char2"),
				MCItemDef.create("usr_sub_char3", "sub_char3"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("qty_dec_place", "qty_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("pre_spln_qty", "pre_spln_qty"),
				MCItemDef.create("pre_spln_amt", "pre_spln_amt"),
				MCItemDef.create("frcst_qty", "frcst_qty"),
				MCItemDef.create("frcst_amt", "frcst_amt"),
				MCItemDef.create("pre_slo_qty", "pre_slo_qty"),
				MCItemDef.create("pre_slo_amt", "pre_slo_amt"),
				MCItemDef.create("slo_qty", "slo_qty"),
				MCItemDef.create("slo_amt", "slo_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Srch02_INFO = new MCOperationInfo("MS", "MSBBL0110", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("pre_flg", "pre_flg"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("sum_ym", "ym"),
				MCItemDef.create("sum_dpt_cd", "dpt_cd"),
				MCItemDef.create("sum_cst_cd", "cst_cd"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sum_spln_vers", "spln_vers"),
				MCItemDef.create("sum_ref_vers", "ref_vers"),
				MCItemDef.create("sum_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("sum_spln_ym_to", "spln_ym_to"),
				MCItemDef.create("sum_reg_t_flg", "reg_t_flg"),
				MCItemDef.create("sum_reg_f_flg", "reg_f_flg"),
				MCItemDef.create("sum_fix_t_flg", "fix_t_flg"),
				MCItemDef.create("sum_fix_f_flg", "fix_f_flg"),
				MCItemDef.create("sum_spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("sum_spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("sum_itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("sum_itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("sum_itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sum_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sum_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sum_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sum_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sum_itm_p" + ".itm_nm", "itm_nm"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("hdr_del_flg", "hdr_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sum_ym", "ym"),
				MCItemDef.create("sum_dpt_cd", "dpt_cd"),
				MCItemDef.create("sum_dpt_nm", "dpt_nm"),
				MCItemDef.create("sum_dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("sum_cst_cd", "cst_cd"),
				MCItemDef.create("sum_cst_nm", "cst_nm"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("sum_spln_vers", "spln_vers"),
				MCItemDef.create("sum_edited_flg", "edited_flg"),
				MCItemDef.create("sum_adopted_flg", "adopted_flg"),
				MCItemDef.create("sum_locked_flg", "locked_flg"),
				MCItemDef.create("sum_usr_cd", "usr_cd"),
				MCItemDef.create("sum_usr_nm", "usr_nm"),
				MCItemDef.create("sum_ref_vers", "ref_vers"),
				MCItemDef.create("sum_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sum_sub_char1", "sub_char1"),
				MCItemDef.create("sum_sub_char2", "sub_char2"),
				MCItemDef.create("sum_sub_char3", "sub_char3"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("qty_dec_place", "qty_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("pre_spln_qty", "pre_spln_qty"),
				MCItemDef.create("pre_spln_amt", "pre_spln_amt"),
				MCItemDef.create("ref_spln_qty", "ref_spln_qty"),
				MCItemDef.create("ref_spln_amt", "ref_spln_amt"),
				MCItemDef.create("frcst_qty", "frcst_qty"),
				MCItemDef.create("frcst_amt", "frcst_amt"),
				MCItemDef.create("pre_slo_qty", "pre_slo_qty"),
				MCItemDef.create("pre_slo_amt", "pre_slo_amt"),
				MCItemDef.create("slo_qty", "slo_qty"),
				MCItemDef.create("slo_amt", "slo_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch02_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch02_UsrDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_spln_qty", "spln_qty"),
				MCItemDef.create("usr_spln_amt", "spln_amt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks")
			}
			,
			MCBlockDef.create("UsrDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Srch03_INFO = new MCOperationInfo("MS", "MSBBL0110", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Srch03_UP_BLOCK0() {
		/** Ope.のBlock [Srch03_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ref_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("ref_spln_ym_to", "spln_ym_to"),
				MCItemDef.create("ref_usr_cd", "usr_cd"),
				MCItemDef.create("ref_usr_nm", "usr_nm"),
				MCItemDef.create("ref_dpt_cd", "dpt_cd"),
				MCItemDef.create("ref_dpt_nm", "dpt_nm"),
				MCItemDef.create("ref_wg_cd", "wg_cd"),
				MCItemDef.create("ref_wg_nm", "wg_nm"),
				MCItemDef.create("ref_cst_cd", "cst_cd"),
				MCItemDef.create("ref_cst_nm", "cst_nm"),
				MCItemDef.create("ref_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ref_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ref_ym_fr", "ym_fr"),
				MCItemDef.create("ref_ym_to", "ym_to"),
				MCItemDef.create("ref_spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("ref_spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("ref_fix_f_flg", "fix_f_flg"),
				MCItemDef.create("ref_del_flg", "del_flg"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ref_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ref_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ref_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ref_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ref_itm_p" + ".itm_nm", "itm_nm"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Srch03_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch03_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("qty_dec_place", "qty_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("usr_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("usr_sub_char1", "sub_char1"),
				MCItemDef.create("usr_sub_char2", "sub_char2"),
				MCItemDef.create("usr_sub_char3", "sub_char3"),
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
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch03_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("RefDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Srch04_INFO = new MCOperationInfo("MS", "MSBBL0110", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Srch04_UP_BLOCK0() {
		/** Ope.のBlock [Srch04_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("ref_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("ref_spln_ym_to", "spln_ym_to"),
				MCItemDef.create("ref_usr_cd", "usr_cd"),
				MCItemDef.create("ref_usr_nm", "usr_nm"),
				MCItemDef.create("ref_dpt_cd", "dpt_cd"),
				MCItemDef.create("ref_dpt_nm", "dpt_nm"),
				MCItemDef.create("ref_wg_cd", "wg_cd"),
				MCItemDef.create("ref_wg_nm", "wg_nm"),
				MCItemDef.create("ref_cst_cd", "cst_cd"),
				MCItemDef.create("ref_cst_nm", "cst_nm"),
				MCItemDef.create("ref_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ref_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ref_ym_fr", "ym_fr"),
				MCItemDef.create("ref_ym_to", "ym_to"),
				MCItemDef.create("ref_spln_vers", "spln_vers"),
				MCItemDef.create("ref_spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("ref_spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("ref_fix_f_flg", "fix_f_flg"),
				MCItemDef.create("ref_del_flg", "del_flg"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("ref_itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ref_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ref_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ref_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ref_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ref_itm_p" + ".itm_nm", "itm_nm"),
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
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_p" + ".bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Srch04_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch04_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("adopted_flg", "adopted_flg"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("qty_dec_place", "qty_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sum_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sum_sub_char1", "sub_char1"),
				MCItemDef.create("sum_sub_char2", "sub_char2"),
				MCItemDef.create("sum_sub_char3", "sub_char3"),
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
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	public static MCContainerDef MS_MSBBL0110_Srch04_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch04_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("RefDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL0110", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("SprtAmtQtyCalDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Upd01_INFO = new MCOperationInfo("MS", "MSBBL0110", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_usr_cd", "usr_cd"),
				MCItemDef.create("usr_ym", "ym"),
				MCItemDef.create("usr_edited_flg", "edited_flg"),
				MCItemDef.create("usr_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("usr_sub_char1", "sub_char1"),
				MCItemDef.create("usr_sub_char2", "sub_char2"),
				MCItemDef.create("usr_sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Upd02_INFO = new MCOperationInfo("MS", "MSBBL0110", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("sum_ym", "ym"),
				MCItemDef.create("sum_dpt_cd", "dpt_cd"),
				MCItemDef.create("sum_cst_cd", "cst_cd"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sum_spln_vers", "spln_vers"),
				MCItemDef.create("sum_edited_flg", "edited_flg"),
				MCItemDef.create("sum_adopted_flg", "adopted_flg"),
				MCItemDef.create("sum_locked_flg", "locked_flg"),
				MCItemDef.create("sum_usr_cd", "usr_cd"),
				MCItemDef.create("sum_ref_vers", "ref_vers"),
				MCItemDef.create("sum_intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sum_sub_char1", "sub_char1"),
				MCItemDef.create("sum_sub_char2", "sub_char2"),
				MCItemDef.create("sum_sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("grp_peg_no", "grp_peg_no")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Upd02_UP_BLOCK2() {
		/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("grp_peg_no", "grp_peg_no"),
				MCItemDef.create("spln_ym", "spln_ym"),
				MCItemDef.create("sum_flg", "sum_flg"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0110_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Upd03_INFO = new MCOperationInfo("MS", "MSBBL0110", "Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Upd03_UP_BLOCK0() {
		/** Ope.のBlock [Upd03_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("copy_spln_vers", "copy_spln_vers"),
				MCItemDef.create("new_spln_vers", "new_spln_vers"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Hdr4")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Del01_INFO = new MCOperationInfo("MS", "MSBBL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("usr_usr_cd", "usr_cd"),
				MCItemDef.create("usr_ym", "ym"),
				MCItemDef.create("usr_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("usr_spln_ym_to", "spln_ym_to"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Del02_INFO = new MCOperationInfo("MS", "MSBBL0110", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("sum_ym", "ym"),
				MCItemDef.create("sum_dpt_cd", "dpt_cd"),
				MCItemDef.create("sum_cst_cd", "cst_cd"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sum_spln_vers", "spln_vers"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("sum_spln_ym_fr", "spln_ym_fr"),
				MCItemDef.create("sum_spln_ym_to", "spln_ym_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0110_Del02_UP_BLOCK1() {
		/** Ope.のBlock [Del02_FixDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd")
			}
			,
			MCBlockDef.create("FixDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Del03_INFO = new MCOperationInfo("MS", "MSBBL0110", "Del03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Del03_UP_BLOCK0() {
		/** Ope.のBlock [Del03_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del03",
			new MCItemDef[]{
				MCItemDef.create("usr_usr_cd", "usr_cd"),
				MCItemDef.create("usr_ym", "ym"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0110_Del04_INFO = new MCOperationInfo("MS", "MSBBL0110", "Del04", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0110_Del04_UP_BLOCK0() {
		/** Ope.のBlock [Del04_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0110", "Del04",
			new MCItemDef[]{
				MCItemDef.create("sum_ym", "ym"),
				MCItemDef.create("sum_dpt_cd", "dpt_cd"),
				MCItemDef.create("sum_cst_cd", "cst_cd"),
				MCItemDef.create("sum_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sum_spln_vers", "spln_vers"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

