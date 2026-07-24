package mcframe.clientMABC.MABCP0400;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_ItmRlsReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0400.Srch01.UP.BLOCK0")){
			return MA_MABCL0400_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0400.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0400_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0400.Upd01.UP.BLOCK0")){
			return MA_MABCL0400_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0400.Del01.UP.BLOCK0")){
			return MA_MABCL0400_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0400.Upd02.UP.BLOCK0")){
			return MA_MABCL0400_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0400.Upd02.UP.BLOCK1")){
			return MA_MABCL0400_Upd02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0400_Srch01_INFO = new MCOperationInfo("MA", "MABCL0400", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0400_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itmtyp_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itmtyp_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itmtyp_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("release_flg_on", "release_flg_on"),
				MCItemDef.create("release_flg_off", "release_flg_off"),
				MCItemDef.create("memo1_c", "memo1_c"),
				MCItemDef.create("memo2_c", "memo2_c"),
				MCItemDef.create("memo3_c", "memo3_c"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("sls_tar_out_flg", "sls_tar_out_flg"),
				MCItemDef.create("sls_tar_flg", "sls_tar_flg"),
				MCItemDef.create("sls_no_input_flg", "sls_no_input_flg"),
				MCItemDef.create("sls_input_flg", "sls_input_flg"),
				MCItemDef.create("mfg_tar_out_flg", "mfg_tar_out_flg"),
				MCItemDef.create("mfg_tar_flg", "mfg_tar_flg"),
				MCItemDef.create("mfg_no_input_flg", "mfg_no_input_flg"),
				MCItemDef.create("mfg_input_flg", "mfg_input_flg"),
				MCItemDef.create("purc_tar_out_flg", "purc_tar_out_flg"),
				MCItemDef.create("purc_tar_flg", "purc_tar_flg"),
				MCItemDef.create("purc_no_input_flg", "purc_no_input_flg"),
				MCItemDef.create("purc_input_flg", "purc_input_flg"),
				MCItemDef.create("insp_tar_out_flg", "insp_tar_out_flg"),
				MCItemDef.create("insp_tar_flg", "insp_tar_flg"),
				MCItemDef.create("insp_no_input_flg", "insp_no_input_flg"),
				MCItemDef.create("insp_input_flg", "insp_input_flg"),
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


	public static MCContainerDef MA_MABCL0400_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("release_flg", "release_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("sls_input_flg", "sls_input_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("mfg_input_flg", "mfg_input_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("purc_input_flg", "purc_input_flg"),
				MCItemDef.create("purc_upri", "purc_upri"),
				MCItemDef.create("cst_upri", "cst_upri"),
				MCItemDef.create("itm_upri", "itm_upri"),
				MCItemDef.create("std_upri", "std_upri"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("proc_upri", "proc_upri"),
				MCItemDef.create("insp_flg", "insp_flg"),
				MCItemDef.create("insp_input_flg", "insp_input_flg"),
				MCItemDef.create("memo1_c", "memo1_c"),
				MCItemDef.create("memo2_c", "memo2_c"),
				MCItemDef.create("memo3_c", "memo3_c"),
				MCItemDef.create("release_usr_cd", "release_usr_cd"),
				MCItemDef.create("release_usr_nm", "release_usr_nm"),
				MCItemDef.create("release_tm", "release_tm"),
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
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0400_Upd01_INFO = new MCOperationInfo("MA", "MABCL0400", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0400_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0400_Del01_INFO = new MCOperationInfo("MA", "MABCL0400", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0400_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0400_Upd02_INFO = new MCOperationInfo("MA", "MABCL0400", "Upd02", "000000", new PDef());

	public static MCContainerDef MA_MABCL0400_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0400_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0400", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("tgt_dt", "tgt_dt")
			}
			,
			MCBlockDef.create("DtlBtn")
		);
	}


	//FMCB DEF_CLASSES END
}

