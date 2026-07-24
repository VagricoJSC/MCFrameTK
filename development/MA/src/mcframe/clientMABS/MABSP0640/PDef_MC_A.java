package mcframe.clientMABS.MABSP0640;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_BpItmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0640.Srch01.UP.BLOCK0")){
			return MA_MABSL0640_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0640.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0640_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0640.Sprt01.UP.BLOCK0")){
			return MA_MABSL0640_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0640.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0640_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0640.Upd01.UP.BLOCK0")){
			return MA_MABSL0640_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0640.Del01.UP.BLOCK0")){
			return MA_MABSL0640_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABSL0640_Srch01_INFO = new MCOperationInfo("MA", "MABSL0640", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0640_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0640_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
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
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0640_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0640", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0640_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0640_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
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
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0640_Upd01_INFO = new MCOperationInfo("MA", "MABSL0640", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0640_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0640_Del01_INFO = new MCOperationInfo("MA", "MABSL0640", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0640_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0640", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

