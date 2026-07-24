package mcframe.serverMABC.MABCL2090;

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
 * [MABCL_CostDptReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL2090.CostDpt_UpdChk01.UP.BLOCK0")){
			return MA_MABCL2090_CostDpt_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDpt_Upd01.UP.BLOCK0")){
			return MA_MABCL2090_CostDpt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDptLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL2090_CostDptLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDptLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL2090_CostDptLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDpt_DelChk01.UP.BLOCK0")){
			return MA_MABCL2090_CostDpt_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDpt_Del01.UP.BLOCK0")){
			return MA_MABCL2090_CostDpt_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDpt_InsChk01.UP.BLOCK0")){
			return MA_MABCL2090_CostDpt_InsChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.CostDpt_InsChk01.DOWN.BLOCK0")){
			return MA_MABCL2090_CostDpt_InsChk01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.Srch01.UP.BLOCK0")){
			return MA_MABCL2090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.Srch01.DOWN.BLOCK0")){
			return MA_MABCL2090_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.Srch01.DOWN.BLOCK1")){
			return MA_MABCL2090_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL2090.Upd01.UP.BLOCK0")){
			return MA_MABCL2090_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.Upd01.UP.BLOCK1")){
			return MA_MABCL2090_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL2090.Del01.UP.BLOCK0")){
			return MA_MABCL2090_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2090.Ins01.UP.BLOCK0")){
			return MA_MABCL2090_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
											
	
	static final MCOperationInfo MA_MABCL2090_CostDpt_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDpt_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDpt_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_alc_grp", "dpt_alc_grp"),
				MCItemDef.create("dpt_config_typ", "dpt_config_typ"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDpt_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDpt_Upd01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDpt_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDpt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_alc_grp", "dpt_alc_grp"),
				MCItemDef.create("dpt_config_typ", "dpt_config_typ"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDpt_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDptLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDptLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDptLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDptLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDptLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDptLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDptLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDptLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDptLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDptLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDpt_DelChk01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDpt_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDpt_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDpt_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDpt_Del01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDpt_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDpt_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_Del01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostDpt_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_CostDpt_InsChk01_INFO = new MCOperationInfo("MA", "MABCL2090", "CostDpt_InsChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_CostDpt_InsChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_InsChk01",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt"),
				MCItemDef.create("ins_only_flg", "ins_only_flg")
			}
			,
			MCBlockDef.create("CostDpt_InsChk01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL2090_CostDpt_InsChk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "CostDpt_InsChk01",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt"),
				MCItemDef.create("ins_only_flg", "ins_only_flg")
			}
			,
			MCBlockDef.create("CostDpt_InsChk01_Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_Srch01_INFO = new MCOperationInfo("MA", "MABCL2090", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_fr_nm", "term_fr_nm"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("term_to_nm", "term_to_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm_lcl", "dpt_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL2090_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm_lcl", "dpt_nm_lcl"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("dpt_alc_grp", "dpt_alc_grp"),
				MCItemDef.create("dpt_config_typ", "dpt_config_typ"),
				MCItemDef.create("dpt_config_typ_nm", "dpt_config_typ_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABCL2090_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_Upd01_INFO = new MCOperationInfo("MA", "MABCL2090", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_alc_grp", "dpt_alc_grp"),
				MCItemDef.create("dpt_config_typ", "dpt_config_typ"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
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

	public static MCContainerDef MA_MABCL2090_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_Del01_INFO = new MCOperationInfo("MA", "MABCL2090", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Del01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABCL2090_Ins01_INFO = new MCOperationInfo("MA", "MABCL2090", "Ins01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2090_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL2090", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("tgt_dt", "tgt_dt"),
				MCItemDef.create("ins_only_flg", "ins_only_flg")
			}
			,
			MCBlockDef.create("Ins01_Ins")
		);
	}


	//FMCB DEF_CLASSES END
}

