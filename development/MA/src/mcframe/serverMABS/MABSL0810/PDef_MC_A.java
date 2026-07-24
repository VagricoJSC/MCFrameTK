package mcframe.serverMABS.MABSL0810;

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
 * [MABSL_WgRqstCtlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0810.WgRqstCtl_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0810_WgRqstCtl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.WgRqstCtl_Upd01.UP.BLOCK0")){
			return MA_MABSL0810_WgRqstCtl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.WgRqstCtl_DelChk01.UP.BLOCK0")){
			return MA_MABSL0810_WgRqstCtl_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.WgRqstCtl_Del01.UP.BLOCK0")){
			return MA_MABSL0810_WgRqstCtl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.Srch01.UP.BLOCK0")){
			return MA_MABSL0810_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0810_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.Upd01.UP.BLOCK0")){
			return MA_MABSL0810_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0810.Del01.UP.BLOCK0")){
			return MA_MABSL0810_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABSL0810_WgRqstCtl_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0810", "WgRqstCtl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_WgRqstCtl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "WgRqstCtl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("check_fr_dpt_cd", "check_fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgRqstCtl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0810_WgRqstCtl_Upd01_INFO = new MCOperationInfo("MA", "MABSL0810", "WgRqstCtl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_WgRqstCtl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "WgRqstCtl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgRqstCtl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0810_WgRqstCtl_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0810", "WgRqstCtl_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_WgRqstCtl_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "WgRqstCtl_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgRqstCtl_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0810_WgRqstCtl_Del01_INFO = new MCOperationInfo("MA", "MABSL0810", "WgRqstCtl_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_WgRqstCtl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "WgRqstCtl_Del01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgRqstCtl_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0810_Srch01_INFO = new MCOperationInfo("MA", "MABSL0810", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("to_wg_nm", "to_wg_nm"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("fr_wg_nm", "fr_wg_nm"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("fr_dpt_nm", "fr_dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0810_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("to_wg_nm", "to_wg_nm"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("fr_wg_nm", "fr_wg_nm"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_typ_nm", "wg_rqst_typ_nm"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("fr_dpt_nm", "fr_dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
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
	
	static final MCOperationInfo MA_MABSL0810_Upd01_INFO = new MCOperationInfo("MA", "MABSL0810", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("check_fr_dpt_cd", "check_fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
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
	
	static final MCOperationInfo MA_MABSL0810_Del01_INFO = new MCOperationInfo("MA", "MABSL0810", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0810_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0810", "Del01",
			new MCItemDef[]{
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("fr_dpt_cd", "fr_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

