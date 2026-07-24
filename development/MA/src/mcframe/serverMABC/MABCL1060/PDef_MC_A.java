package mcframe.serverMABC.MABCL1060;

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
 * [MABCL_JnlPatternReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1060.JnlPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL1060_JnlPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.JnlPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL1060_JnlPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.JnlPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL1060_JnlPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.JnlPtn_Del01.UP.BLOCK0")){
			return MA_MABCL1060_JnlPtn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.Srch01.UP.BLOCK0")){
			return MA_MABCL1060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.Upd01.UP.BLOCK0")){
			return MA_MABCL1060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1060.Upd01.UP.BLOCK1")){
			return MA_MABCL1060_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL1060.Del01.UP.BLOCK0")){
			return MA_MABCL1060_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABCL1060_JnlPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL1060", "JnlPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_JnlPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "JnlPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("dr_dpt_typ", "dr_dpt_typ"),
				MCItemDef.create("dr_dpt_cd", "dr_dpt_cd"),
				MCItemDef.create("cr_dpt_typ", "cr_dpt_typ"),
				MCItemDef.create("cr_dpt_cd", "cr_dpt_cd"),
				MCItemDef.create("dr_ptn_typ", "dr_ptn_typ"),
				MCItemDef.create("dr_grp_cd", "dr_grp_cd"),
				MCItemDef.create("cr_ptn_typ", "cr_ptn_typ"),
				MCItemDef.create("cr_grp_cd", "cr_grp_cd"),
				MCItemDef.create("dr_ac_cd", "dr_ac_cd"),
				MCItemDef.create("dr_sub_ac_cd", "dr_sub_ac_cd"),
				MCItemDef.create("cr_ac_cd", "cr_ac_cd"),
				MCItemDef.create("cr_sub_ac_cd", "cr_sub_ac_cd"),
				MCItemDef.create("dr_ac_tax_cd", "dr_ac_tax_cd"),
				MCItemDef.create("cr_ac_tax_cd", "cr_ac_tax_cd"),
				MCItemDef.create("dr_bp_typ", "dr_bp_typ"),
				MCItemDef.create("cr_bp_typ", "cr_bp_typ"),
				MCItemDef.create("dr_bp_cd", "dr_bp_cd"),
				MCItemDef.create("cr_bp_cd", "cr_bp_cd"),
				MCItemDef.create("dr_itm_typ", "dr_itm_typ"),
				MCItemDef.create("cr_itm_typ", "cr_itm_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("dr_amt_typ", "dr_amt_typ"),
				MCItemDef.create("cr_amt_typ", "cr_amt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("un_fix_typ", "un_fix_typ"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("inv_loc_typ", "inv_loc_typ"),
				MCItemDef.create("amt_sign_typ", "amt_sign_typ"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("mon01_invalid_flg", "mon01_invalid_flg"),
				MCItemDef.create("mon02_invalid_flg", "mon02_invalid_flg"),
				MCItemDef.create("mon03_invalid_flg", "mon03_invalid_flg"),
				MCItemDef.create("mon04_invalid_flg", "mon04_invalid_flg"),
				MCItemDef.create("mon05_invalid_flg", "mon05_invalid_flg"),
				MCItemDef.create("mon06_invalid_flg", "mon06_invalid_flg"),
				MCItemDef.create("mon07_invalid_flg", "mon07_invalid_flg"),
				MCItemDef.create("mon08_invalid_flg", "mon08_invalid_flg"),
				MCItemDef.create("mon09_invalid_flg", "mon09_invalid_flg"),
				MCItemDef.create("mon10_invalid_flg", "mon10_invalid_flg"),
				MCItemDef.create("mon11_invalid_flg", "mon11_invalid_flg"),
				MCItemDef.create("mon12_invalid_flg", "mon12_invalid_flg"),
				MCItemDef.create("carry_flg", "carry_flg"),
				MCItemDef.create("dr_abs_typ", "dr_abs_typ"),
				MCItemDef.create("dr_abstract", "dr_abstract"),
				MCItemDef.create("cr_abs_typ", "cr_abs_typ"),
				MCItemDef.create("cr_abstract", "cr_abstract"),
				MCItemDef.create("dr_trd_sml_flg", "dr_trd_sml_flg"),
				MCItemDef.create("cr_trd_sml_flg", "cr_trd_sml_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_JnlPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL1060", "JnlPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_JnlPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "JnlPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("dr_dpt_typ", "dr_dpt_typ"),
				MCItemDef.create("dr_dpt_cd", "dr_dpt_cd"),
				MCItemDef.create("cr_dpt_typ", "cr_dpt_typ"),
				MCItemDef.create("cr_dpt_cd", "cr_dpt_cd"),
				MCItemDef.create("dr_ptn_typ", "dr_ptn_typ"),
				MCItemDef.create("dr_grp_cd", "dr_grp_cd"),
				MCItemDef.create("cr_ptn_typ", "cr_ptn_typ"),
				MCItemDef.create("cr_grp_cd", "cr_grp_cd"),
				MCItemDef.create("dr_ac_cd", "dr_ac_cd"),
				MCItemDef.create("dr_sub_ac_cd", "dr_sub_ac_cd"),
				MCItemDef.create("cr_ac_cd", "cr_ac_cd"),
				MCItemDef.create("cr_sub_ac_cd", "cr_sub_ac_cd"),
				MCItemDef.create("dr_ac_tax_cd", "dr_ac_tax_cd"),
				MCItemDef.create("cr_ac_tax_cd", "cr_ac_tax_cd"),
				MCItemDef.create("dr_bp_typ", "dr_bp_typ"),
				MCItemDef.create("cr_bp_typ", "cr_bp_typ"),
				MCItemDef.create("dr_bp_cd", "dr_bp_cd"),
				MCItemDef.create("cr_bp_cd", "cr_bp_cd"),
				MCItemDef.create("dr_itm_typ", "dr_itm_typ"),
				MCItemDef.create("cr_itm_typ", "cr_itm_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("dr_amt_typ", "dr_amt_typ"),
				MCItemDef.create("cr_amt_typ", "cr_amt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("un_fix_typ", "un_fix_typ"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("inv_loc_typ", "inv_loc_typ"),
				MCItemDef.create("amt_sign_typ", "amt_sign_typ"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("mon01_invalid_flg", "mon01_invalid_flg"),
				MCItemDef.create("mon02_invalid_flg", "mon02_invalid_flg"),
				MCItemDef.create("mon03_invalid_flg", "mon03_invalid_flg"),
				MCItemDef.create("mon04_invalid_flg", "mon04_invalid_flg"),
				MCItemDef.create("mon05_invalid_flg", "mon05_invalid_flg"),
				MCItemDef.create("mon06_invalid_flg", "mon06_invalid_flg"),
				MCItemDef.create("mon07_invalid_flg", "mon07_invalid_flg"),
				MCItemDef.create("mon08_invalid_flg", "mon08_invalid_flg"),
				MCItemDef.create("mon09_invalid_flg", "mon09_invalid_flg"),
				MCItemDef.create("mon10_invalid_flg", "mon10_invalid_flg"),
				MCItemDef.create("mon11_invalid_flg", "mon11_invalid_flg"),
				MCItemDef.create("mon12_invalid_flg", "mon12_invalid_flg"),
				MCItemDef.create("carry_flg", "carry_flg"),
				MCItemDef.create("dr_abs_typ", "dr_abs_typ"),
				MCItemDef.create("dr_abstract", "dr_abstract"),
				MCItemDef.create("cr_abs_typ", "cr_abs_typ"),
				MCItemDef.create("cr_abstract", "cr_abstract"),
				MCItemDef.create("dr_trd_sml_flg", "dr_trd_sml_flg"),
				MCItemDef.create("cr_trd_sml_flg", "cr_trd_sml_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_JnlPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL1060", "JnlPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_JnlPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "JnlPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_JnlPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL1060", "JnlPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_JnlPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "JnlPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("JnlPtn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_Srch01_INFO = new MCOperationInfo("MA", "MABCL1060", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("jnl_seq", "jnl_seq")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL1060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("dr_dpt_typ", "dr_dpt_typ"),
				MCItemDef.create("dr_dpt_typ_nm", "dr_dpt_typ_nm"),
				MCItemDef.create("dr_dpt_cd", "dr_dpt_cd"),
				MCItemDef.create("dr_dpt_nm", "dr_dpt_nm"),
				MCItemDef.create("dr_ptn_typ", "dr_ptn_typ"),
				MCItemDef.create("dr_ptn_typ_nm", "dr_ptn_typ_nm"),
				MCItemDef.create("dr_grp_cd", "dr_grp_cd"),
				MCItemDef.create("dr_grp_nm", "dr_grp_nm"),
				MCItemDef.create("dr_ac_cd", "dr_ac_cd"),
				MCItemDef.create("dr_ac_nm", "dr_ac_nm"),
				MCItemDef.create("dr_sub_ac_cd", "dr_sub_ac_cd"),
				MCItemDef.create("dr_sub_ac_nm", "dr_sub_ac_nm"),
				MCItemDef.create("dr_bp_typ", "dr_bp_typ"),
				MCItemDef.create("dr_bp_typ_nm", "dr_bp_typ_nm"),
				MCItemDef.create("dr_bp_cd", "dr_bp_cd"),
				MCItemDef.create("dr_bp_nm", "dr_bp_nm"),
				MCItemDef.create("dr_ac_tax_cd", "dr_ac_tax_cd"),
				MCItemDef.create("dr_ac_tax_nm", "dr_ac_tax_nm"),
				MCItemDef.create("dr_itm_typ", "dr_itm_typ"),
				MCItemDef.create("dr_itm_typ_nm", "dr_itm_typ_nm"),
				MCItemDef.create("dr_amt_typ", "dr_amt_typ"),
				MCItemDef.create("dr_amt_typ_nm", "dr_amt_typ_nm"),
				MCItemDef.create("dr_abs_typ", "dr_abs_typ"),
				MCItemDef.create("dr_abs_typ_nm", "dr_abs_typ_nm"),
				MCItemDef.create("dr_abstract", "dr_abstract"),
				MCItemDef.create("dr_trd_sml_flg", "dr_trd_sml_flg"),
				MCItemDef.create("dr_sub_flg", "dr_sub_flg"),
				MCItemDef.create("dr_bp_flg", "dr_bp_flg"),
				MCItemDef.create("cr_dpt_typ", "cr_dpt_typ"),
				MCItemDef.create("cr_dpt_typ_nm", "cr_dpt_typ_nm"),
				MCItemDef.create("cr_dpt_cd", "cr_dpt_cd"),
				MCItemDef.create("cr_dpt_nm", "cr_dpt_nm"),
				MCItemDef.create("cr_ptn_typ", "cr_ptn_typ"),
				MCItemDef.create("cr_ptn_typ_nm", "cr_ptn_typ_nm"),
				MCItemDef.create("cr_grp_cd", "cr_grp_cd"),
				MCItemDef.create("cr_grp_nm", "cr_grp_nm"),
				MCItemDef.create("cr_ac_cd", "cr_ac_cd"),
				MCItemDef.create("cr_ac_nm", "cr_ac_nm"),
				MCItemDef.create("cr_sub_ac_cd", "cr_sub_ac_cd"),
				MCItemDef.create("cr_sub_ac_nm", "cr_sub_ac_nm"),
				MCItemDef.create("cr_bp_typ", "cr_bp_typ"),
				MCItemDef.create("cr_bp_typ_nm", "cr_bp_typ_nm"),
				MCItemDef.create("cr_bp_cd", "cr_bp_cd"),
				MCItemDef.create("cr_bp_nm", "cr_bp_nm"),
				MCItemDef.create("cr_ac_tax_cd", "cr_ac_tax_cd"),
				MCItemDef.create("cr_ac_tax_nm", "cr_ac_tax_nm"),
				MCItemDef.create("cr_itm_typ", "cr_itm_typ"),
				MCItemDef.create("cr_itm_typ_nm", "cr_itm_typ_nm"),
				MCItemDef.create("cr_amt_typ", "cr_amt_typ"),
				MCItemDef.create("cr_amt_typ_nm", "cr_amt_typ_nm"),
				MCItemDef.create("cr_abs_typ", "cr_abs_typ"),
				MCItemDef.create("cr_abs_typ_nm", "cr_abs_typ_nm"),
				MCItemDef.create("cr_abstract", "cr_abstract"),
				MCItemDef.create("cr_trd_sml_flg", "cr_trd_sml_flg"),
				MCItemDef.create("cr_sub_flg", "cr_sub_flg"),
				MCItemDef.create("cr_bp_flg", "cr_bp_flg"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("carry_flg", "carry_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_typ_nm", "purc_typ_nm"),
				MCItemDef.create("un_fix_typ", "un_fix_typ"),
				MCItemDef.create("un_fix_typ_nm", "un_fix_typ_nm"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("foreign_typ_nm", "foreign_typ_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("inv_loc_typ", "inv_loc_typ"),
				MCItemDef.create("inv_loc_typ_nm", "inv_loc_typ_nm"),
				MCItemDef.create("amt_sign_typ", "amt_sign_typ"),
				MCItemDef.create("amt_sign_typ_nm", "amt_sign_typ_nm"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("mon01_invalid_flg", "mon01_invalid_flg"),
				MCItemDef.create("mon02_invalid_flg", "mon02_invalid_flg"),
				MCItemDef.create("mon03_invalid_flg", "mon03_invalid_flg"),
				MCItemDef.create("mon04_invalid_flg", "mon04_invalid_flg"),
				MCItemDef.create("mon05_invalid_flg", "mon05_invalid_flg"),
				MCItemDef.create("mon06_invalid_flg", "mon06_invalid_flg"),
				MCItemDef.create("mon07_invalid_flg", "mon07_invalid_flg"),
				MCItemDef.create("mon08_invalid_flg", "mon08_invalid_flg"),
				MCItemDef.create("mon09_invalid_flg", "mon09_invalid_flg"),
				MCItemDef.create("mon10_invalid_flg", "mon10_invalid_flg"),
				MCItemDef.create("mon11_invalid_flg", "mon11_invalid_flg"),
				MCItemDef.create("mon12_invalid_flg", "mon12_invalid_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_Upd01_INFO = new MCOperationInfo("MA", "MABCL1060", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("dr_dpt_typ", "dr_dpt_typ"),
				MCItemDef.create("dr_dpt_cd", "dr_dpt_cd"),
				MCItemDef.create("cr_dpt_typ", "cr_dpt_typ"),
				MCItemDef.create("cr_dpt_cd", "cr_dpt_cd"),
				MCItemDef.create("dr_ptn_typ", "dr_ptn_typ"),
				MCItemDef.create("dr_grp_cd", "dr_grp_cd"),
				MCItemDef.create("cr_ptn_typ", "cr_ptn_typ"),
				MCItemDef.create("cr_grp_cd", "cr_grp_cd"),
				MCItemDef.create("dr_ac_cd", "dr_ac_cd"),
				MCItemDef.create("dr_sub_ac_cd", "dr_sub_ac_cd"),
				MCItemDef.create("cr_ac_cd", "cr_ac_cd"),
				MCItemDef.create("cr_sub_ac_cd", "cr_sub_ac_cd"),
				MCItemDef.create("dr_ac_tax_cd", "dr_ac_tax_cd"),
				MCItemDef.create("cr_ac_tax_cd", "cr_ac_tax_cd"),
				MCItemDef.create("dr_bp_typ", "dr_bp_typ"),
				MCItemDef.create("cr_bp_typ", "cr_bp_typ"),
				MCItemDef.create("dr_bp_cd", "dr_bp_cd"),
				MCItemDef.create("cr_bp_cd", "cr_bp_cd"),
				MCItemDef.create("dr_itm_typ", "dr_itm_typ"),
				MCItemDef.create("cr_itm_typ", "cr_itm_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("dr_amt_typ", "dr_amt_typ"),
				MCItemDef.create("cr_amt_typ", "cr_amt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("un_fix_typ", "un_fix_typ"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("inv_loc_typ", "inv_loc_typ"),
				MCItemDef.create("amt_sign_typ", "amt_sign_typ"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("mon01_invalid_flg", "mon01_invalid_flg"),
				MCItemDef.create("mon02_invalid_flg", "mon02_invalid_flg"),
				MCItemDef.create("mon03_invalid_flg", "mon03_invalid_flg"),
				MCItemDef.create("mon04_invalid_flg", "mon04_invalid_flg"),
				MCItemDef.create("mon05_invalid_flg", "mon05_invalid_flg"),
				MCItemDef.create("mon06_invalid_flg", "mon06_invalid_flg"),
				MCItemDef.create("mon07_invalid_flg", "mon07_invalid_flg"),
				MCItemDef.create("mon08_invalid_flg", "mon08_invalid_flg"),
				MCItemDef.create("mon09_invalid_flg", "mon09_invalid_flg"),
				MCItemDef.create("mon10_invalid_flg", "mon10_invalid_flg"),
				MCItemDef.create("mon11_invalid_flg", "mon11_invalid_flg"),
				MCItemDef.create("mon12_invalid_flg", "mon12_invalid_flg"),
				MCItemDef.create("carry_flg", "carry_flg"),
				MCItemDef.create("dr_abs_typ", "dr_abs_typ"),
				MCItemDef.create("dr_abstract", "dr_abstract"),
				MCItemDef.create("cr_abs_typ", "cr_abs_typ"),
				MCItemDef.create("cr_abstract", "cr_abstract"),
				MCItemDef.create("dr_trd_sml_flg", "dr_trd_sml_flg"),
				MCItemDef.create("cr_trd_sml_flg", "cr_trd_sml_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL1060_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABCL1060_Del01_INFO = new MCOperationInfo("MA", "MABCL1060", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_seq", "jnl_seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

