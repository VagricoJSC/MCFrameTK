package mcframe.serverMSBB.MSBBL0130;

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
 * [MSBBL_MlySPlnFmtReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL0130.Srch01.UP.BLOCK0")){
			return MS_MSBBL0130_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Srch02.UP.BLOCK0")){
			return MS_MSBBL0130_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Srch02.DOWN.BLOCK0")){
			return MS_MSBBL0130_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Chk01.UP.BLOCK0")){
			return MS_MSBBL0130_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Chk01.UP.BLOCK1")){
			return MS_MSBBL0130_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0130.Chk01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Chk02.UP.BLOCK0")){
			return MS_MSBBL0130_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Chk02.DOWN.BLOCK0")){
			return MS_MSBBL0130_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Sprt01.UP.BLOCK0")){
			return MS_MSBBL0130_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Imp01.UP.BLOCK0")){
			return MS_MSBBL0130_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Imp01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Upd01.UP.BLOCK0")){
			return MS_MSBBL0130_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Del01.UP.BLOCK0")){
			return MS_MSBBL0130_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0130.Del01.DOWN.BLOCK0")){
			return MS_MSBBL0130_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBBL0130_Srch01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("spln_st_ym_fr", "spln_st_ym_fr"),
				MCItemDef.create("spln_st_ym_to", "spln_st_ym_to"),
				MCItemDef.create("spln_end_ym_fr", "spln_end_ym_fr"),
				MCItemDef.create("spln_end_ym_to", "spln_end_ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
	
	static final MCOperationInfo MS_MSBBL0130_Srch02_INFO = new MCOperationInfo("MS", "MSBBL0130", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("spln_st_ym_fr", "spln_st_ym_fr"),
				MCItemDef.create("spln_st_ym_to", "spln_st_ym_to"),
				MCItemDef.create("spln_end_ym_fr", "spln_end_ym_fr"),
				MCItemDef.create("spln_end_ym_to", "spln_end_ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Chk01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
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

	public static MCContainerDef MS_MSBBL0130_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Chk02_INFO = new MCOperationInfo("MS", "MSBBL0130", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sprt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
			MCBlockDef.create("Sprt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Imp01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("spln_set_typ_nm", "spln_set_typ_nm"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Upd01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("spln_set_typ", "spln_set_typ"),
				MCItemDef.create("cst_cd_unit_flg", "cst_cd_unit_flg"),
				MCItemDef.create("wrk_no_unit_flg", "wrk_no_unit_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
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


	public static MCContainerDef MS_MSBBL0130_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0130_Del01_INFO = new MCOperationInfo("MS", "MSBBL0130", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0130_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Del01",
			new MCItemDef[]{
				MCItemDef.create("spln_fmt_no", "spln_fmt_no"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBBL0130_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL0130", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

