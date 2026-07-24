package mcframe.serverMABS.MABSL0350;

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
 * [MABSL_ItmSiteReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0350.ItmSite_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0350_ItmSite_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.ItmSite_Upd01.UP.BLOCK0")){
			return MA_MABSL0350_ItmSite_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.ItmSite_DelChk01.UP.BLOCK0")){
			return MA_MABSL0350_ItmSite_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.ItmSite_Del01.UP.BLOCK0")){
			return MA_MABSL0350_ItmSite_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.Srch01.UP.BLOCK0")){
			return MA_MABSL0350_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0350_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.Upd01.UP.BLOCK0")){
			return MA_MABSL0350_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0350.Del01.UP.BLOCK0")){
			return MA_MABSL0350_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABSL0350_ItmSite_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0350", "ItmSite_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_ItmSite_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "ItmSite_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSite_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0350_ItmSite_Upd01_INFO = new MCOperationInfo("MA", "MABSL0350", "ItmSite_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_ItmSite_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "ItmSite_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSite_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0350_ItmSite_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0350", "ItmSite_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_ItmSite_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "ItmSite_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSite_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0350_ItmSite_Del01_INFO = new MCOperationInfo("MA", "MABSL0350", "ItmSite_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_ItmSite_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "ItmSite_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmSite_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0350_Srch01_INFO = new MCOperationInfo("MA", "MABSL0350", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0350_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_mng_typ_nm", "lot_mng_typ_nm"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_mng_typ_nm", "sublot_mng_typ_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("plnt_aprv_role_nm", "plnt_aprv_role_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("insp_aprv_role_nm", "insp_aprv_role_nm"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_role_nm", "mfg_aprv_role_nm"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
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
	
	static final MCOperationInfo MA_MABSL0350_Upd01_INFO = new MCOperationInfo("MA", "MABSL0350", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
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
	
	static final MCOperationInfo MA_MABSL0350_Del01_INFO = new MCOperationInfo("MA", "MABSL0350", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0350_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0350", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

