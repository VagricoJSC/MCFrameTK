package mcframe.serverMABS.MABSL0290;

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
 * [MABSL_ItmCompReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0290.ItmComp_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0290_ItmComp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.ItmComp_Upd01.UP.BLOCK0")){
			return MA_MABSL0290_ItmComp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.ItmComp_DelChk01.UP.BLOCK0")){
			return MA_MABSL0290_ItmComp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.ItmComp_Del01.UP.BLOCK0")){
			return MA_MABSL0290_ItmComp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.Srch01.UP.BLOCK0")){
			return MA_MABSL0290_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0290_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.Upd01.UP.BLOCK0")){
			return MA_MABSL0290_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0290.Del01.UP.BLOCK0")){
			return MA_MABSL0290_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABSL0290_ItmComp_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0290", "ItmComp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_ItmComp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "ItmComp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("core_itm_qty", "core_itm_qty"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("comp_itm_unit_cd", "comp_itm_unit_cd"),
				MCItemDef.create("comp_itm_qty", "comp_itm_qty"),
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmComp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0290_ItmComp_Upd01_INFO = new MCOperationInfo("MA", "MABSL0290", "ItmComp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_ItmComp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "ItmComp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("core_itm_qty", "core_itm_qty"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("comp_itm_unit_cd", "comp_itm_unit_cd"),
				MCItemDef.create("comp_itm_qty", "comp_itm_qty"),
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmComp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0290_ItmComp_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0290", "ItmComp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_ItmComp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "ItmComp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmComp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0290_ItmComp_Del01_INFO = new MCOperationInfo("MA", "MABSL0290", "ItmComp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_ItmComp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "ItmComp_Del01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmComp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0290_Srch01_INFO = new MCOperationInfo("MA", "MABSL0290", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_typ", "core_itm_typ"),
				MCItemDef.create("core_itm_typ_d_cd", "core_itm_typ_d_cd"),
				MCItemDef.create("core_itm_typ_d_nm", "core_itm_typ_d_nm"),
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("core_itm_nm", "core_itm_nm"),
				MCItemDef.create("comp_itm_typ", "comp_itm_typ"),
				MCItemDef.create("comp_itm_typ_d_cd", "comp_itm_typ_d_cd"),
				MCItemDef.create("comp_itm_typ_d_nm", "comp_itm_typ_d_nm"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("comp_itm_nm", "comp_itm_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("core_itm_grp_cd1", "core_itm_grp_cd1"),
				MCItemDef.create("core_itm_grp_nm1", "core_itm_grp_nm1"),
				MCItemDef.create("core_itm_grp_cd2", "core_itm_grp_cd2"),
				MCItemDef.create("core_itm_grp_nm2", "core_itm_grp_nm2"),
				MCItemDef.create("core_itm_grp_cd3", "core_itm_grp_cd3"),
				MCItemDef.create("core_itm_grp_nm3", "core_itm_grp_nm3"),
				MCItemDef.create("core_itm_grp_cd4", "core_itm_grp_cd4"),
				MCItemDef.create("core_itm_grp_nm4", "core_itm_grp_nm4"),
				MCItemDef.create("core_itm_grp_cd5", "core_itm_grp_cd5"),
				MCItemDef.create("core_itm_grp_nm5", "core_itm_grp_nm5"),
				MCItemDef.create("core_itm_grp_cd6", "core_itm_grp_cd6"),
				MCItemDef.create("core_itm_grp_nm6", "core_itm_grp_nm6"),
				MCItemDef.create("core_itm_grp_cd7", "core_itm_grp_cd7"),
				MCItemDef.create("core_itm_grp_nm7", "core_itm_grp_nm7"),
				MCItemDef.create("core_itm_grp_cd8", "core_itm_grp_cd8"),
				MCItemDef.create("core_itm_grp_nm8", "core_itm_grp_nm8"),
				MCItemDef.create("core_itm_grp_cd9", "core_itm_grp_cd9"),
				MCItemDef.create("core_itm_grp_nm9", "core_itm_grp_nm9"),
				MCItemDef.create("core_itm_grp_cd10", "core_itm_grp_cd10"),
				MCItemDef.create("core_itm_grp_nm10", "core_itm_grp_nm10"),
				MCItemDef.create("comp_itm_grp_cd1", "comp_itm_grp_cd1"),
				MCItemDef.create("comp_itm_grp_nm1", "comp_itm_grp_nm1"),
				MCItemDef.create("comp_itm_grp_cd2", "comp_itm_grp_cd2"),
				MCItemDef.create("comp_itm_grp_nm2", "comp_itm_grp_nm2"),
				MCItemDef.create("comp_itm_grp_cd3", "comp_itm_grp_cd3"),
				MCItemDef.create("comp_itm_grp_nm3", "comp_itm_grp_nm3"),
				MCItemDef.create("comp_itm_grp_cd4", "comp_itm_grp_cd4"),
				MCItemDef.create("comp_itm_grp_nm4", "comp_itm_grp_nm4"),
				MCItemDef.create("comp_itm_grp_cd5", "comp_itm_grp_cd5"),
				MCItemDef.create("comp_itm_grp_nm5", "comp_itm_grp_nm5"),
				MCItemDef.create("comp_itm_grp_cd6", "comp_itm_grp_cd6"),
				MCItemDef.create("comp_itm_grp_nm6", "comp_itm_grp_nm6"),
				MCItemDef.create("comp_itm_grp_cd7", "comp_itm_grp_cd7"),
				MCItemDef.create("comp_itm_grp_nm7", "comp_itm_grp_nm7"),
				MCItemDef.create("comp_itm_grp_cd8", "comp_itm_grp_cd8"),
				MCItemDef.create("comp_itm_grp_nm8", "comp_itm_grp_nm8"),
				MCItemDef.create("comp_itm_grp_cd9", "comp_itm_grp_cd9"),
				MCItemDef.create("comp_itm_grp_nm9", "comp_itm_grp_nm9"),
				MCItemDef.create("comp_itm_grp_cd10", "comp_itm_grp_cd10"),
				MCItemDef.create("comp_itm_grp_nm10", "comp_itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0290_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("core_itm_nm", "core_itm_nm"),
				MCItemDef.create("core_itm_typ", "core_itm_typ"),
				MCItemDef.create("core_itm_typ_nm", "core_itm_typ_nm"),
				MCItemDef.create("core_itm_typ_d_cd", "core_itm_typ_d_cd"),
				MCItemDef.create("core_itm_typ_d_nm", "core_itm_typ_d_nm"),
				MCItemDef.create("core_itm_unit_cd", "core_itm_unit_cd"),
				MCItemDef.create("core_itm_unit_nm", "core_itm_unit_nm"),
				MCItemDef.create("core_itm_dec_place", "core_itm_dec_place"),
				MCItemDef.create("core_itm_qty", "core_itm_qty"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("comp_itm_nm", "comp_itm_nm"),
				MCItemDef.create("comp_itm_typ", "comp_itm_typ"),
				MCItemDef.create("comp_itm_typ_nm", "comp_itm_typ_nm"),
				MCItemDef.create("comp_itm_typ_d_cd", "comp_itm_typ_d_cd"),
				MCItemDef.create("comp_itm_typ_d_nm", "comp_itm_typ_d_nm"),
				MCItemDef.create("comp_itm_unit_cd", "comp_itm_unit_cd"),
				MCItemDef.create("comp_itm_unit_nm", "comp_itm_unit_nm"),
				MCItemDef.create("comp_itm_dec_place", "comp_itm_dec_place"),
				MCItemDef.create("comp_itm_qty", "comp_itm_qty"),
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("itm_comp_grp_nm", "itm_comp_grp_nm"),
				MCItemDef.create("def_flg", "def_flg"),
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
	
	static final MCOperationInfo MA_MABSL0290_Upd01_INFO = new MCOperationInfo("MA", "MABSL0290", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("core_itm_qty", "core_itm_qty"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("comp_itm_unit_cd", "comp_itm_unit_cd"),
				MCItemDef.create("comp_itm_qty", "comp_itm_qty"),
				MCItemDef.create("itm_comp_grp_cd", "itm_comp_grp_cd"),
				MCItemDef.create("def_flg", "def_flg"),
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
	
	static final MCOperationInfo MA_MABSL0290_Del01_INFO = new MCOperationInfo("MA", "MABSL0290", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0290_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0290", "Del01",
			new MCItemDef[]{
				MCItemDef.create("core_itm_cd", "core_itm_cd"),
				MCItemDef.create("core_itm_sub1", "core_itm_sub1"),
				MCItemDef.create("core_itm_sub2", "core_itm_sub2"),
				MCItemDef.create("core_itm_sub3", "core_itm_sub3"),
				MCItemDef.create("comp_itm_cd", "comp_itm_cd"),
				MCItemDef.create("comp_itm_sub1", "comp_itm_sub1"),
				MCItemDef.create("comp_itm_sub2", "comp_itm_sub2"),
				MCItemDef.create("comp_itm_sub3", "comp_itm_sub3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

