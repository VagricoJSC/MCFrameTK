package mcframe.serverMABS.MABSL1070;

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
 * [MABSL_SetItmLst]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1070.SetItmLst_DelChk01.UP.BLOCK0")){
			return MA_MABSL1070_SetItmLst_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1070.SetItmLst_Del01.UP.BLOCK0")){
			return MA_MABSL1070_SetItmLst_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1070.Srch01.UP.BLOCK0")){
			return MA_MABSL1070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1070.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1070_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1070.Upd01.UP.BLOCK0")){
			return MA_MABSL1070_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1070.Del01.UP.BLOCK0")){
			return MA_MABSL1070_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MA_MABSL1070_SetItmLst_DelChk01_INFO = new MCOperationInfo("MA", "MABSL1070", "SetItmLst_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1070_SetItmLst_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "SetItmLst_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetItmLst_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1070_SetItmLst_Del01_INFO = new MCOperationInfo("MA", "MABSL1070", "SetItmLst_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1070_SetItmLst_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "SetItmLst_Del01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetItmLst_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1070_Srch01_INFO = new MCOperationInfo("MA", "MABSL1070", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1070_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("main_itm_typ", "main_itm_typ"),
				MCItemDef.create("main_itm_typ_d_cd", "main_itm_typ_d_cd"),
				MCItemDef.create("main_itm_typ_d_nm", "main_itm_typ_d_nm"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_itm_nm", "main_itm_nm"),
				MCItemDef.create("set_itm_typ", "set_itm_typ"),
				MCItemDef.create("set_itm_typ_d_cd", "set_itm_typ_d_cd"),
				MCItemDef.create("set_itm_typ_d_nm", "set_itm_typ_d_nm"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("set_itm_nm", "set_itm_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("main_itm_grp_cd1", "main_itm_grp_cd1"),
				MCItemDef.create("main_itm_grp_nm1", "main_itm_grp_nm1"),
				MCItemDef.create("main_itm_grp_cd2", "main_itm_grp_cd2"),
				MCItemDef.create("main_itm_grp_nm2", "main_itm_grp_nm2"),
				MCItemDef.create("main_itm_grp_cd3", "main_itm_grp_cd3"),
				MCItemDef.create("main_itm_grp_nm3", "main_itm_grp_nm3"),
				MCItemDef.create("main_itm_grp_cd4", "main_itm_grp_cd4"),
				MCItemDef.create("main_itm_grp_nm4", "main_itm_grp_nm4"),
				MCItemDef.create("main_itm_grp_cd5", "main_itm_grp_cd5"),
				MCItemDef.create("main_itm_grp_nm5", "main_itm_grp_nm5"),
				MCItemDef.create("main_itm_grp_cd6", "main_itm_grp_cd6"),
				MCItemDef.create("main_itm_grp_nm6", "main_itm_grp_nm6"),
				MCItemDef.create("main_itm_grp_cd7", "main_itm_grp_cd7"),
				MCItemDef.create("main_itm_grp_nm7", "main_itm_grp_nm7"),
				MCItemDef.create("main_itm_grp_cd8", "main_itm_grp_cd8"),
				MCItemDef.create("main_itm_grp_nm8", "main_itm_grp_nm8"),
				MCItemDef.create("main_itm_grp_cd9", "main_itm_grp_cd9"),
				MCItemDef.create("main_itm_grp_nm9", "main_itm_grp_nm9"),
				MCItemDef.create("main_itm_grp_cd10", "main_itm_grp_cd10"),
				MCItemDef.create("main_itm_grp_nm10", "main_itm_grp_nm10"),
				MCItemDef.create("set_itm_grp_cd1", "set_itm_grp_cd1"),
				MCItemDef.create("set_itm_grp_nm1", "set_itm_grp_nm1"),
				MCItemDef.create("set_itm_grp_cd2", "set_itm_grp_cd2"),
				MCItemDef.create("set_itm_grp_nm2", "set_itm_grp_nm2"),
				MCItemDef.create("set_itm_grp_cd3", "set_itm_grp_cd3"),
				MCItemDef.create("set_itm_grp_nm3", "set_itm_grp_nm3"),
				MCItemDef.create("set_itm_grp_cd4", "set_itm_grp_cd4"),
				MCItemDef.create("set_itm_grp_nm4", "set_itm_grp_nm4"),
				MCItemDef.create("set_itm_grp_cd5", "set_itm_grp_cd5"),
				MCItemDef.create("set_itm_grp_nm5", "set_itm_grp_nm5"),
				MCItemDef.create("set_itm_grp_cd6", "set_itm_grp_cd6"),
				MCItemDef.create("set_itm_grp_nm6", "set_itm_grp_nm6"),
				MCItemDef.create("set_itm_grp_cd7", "set_itm_grp_cd7"),
				MCItemDef.create("set_itm_grp_nm7", "set_itm_grp_nm7"),
				MCItemDef.create("set_itm_grp_cd8", "set_itm_grp_cd8"),
				MCItemDef.create("set_itm_grp_nm8", "set_itm_grp_nm8"),
				MCItemDef.create("set_itm_grp_cd9", "set_itm_grp_cd9"),
				MCItemDef.create("set_itm_grp_nm9", "set_itm_grp_nm9"),
				MCItemDef.create("set_itm_grp_cd10", "set_itm_grp_cd10"),
				MCItemDef.create("set_itm_grp_nm10", "set_itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL1070_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_itm_nm", "main_itm_nm"),
				MCItemDef.create("main_itm_typ", "main_itm_typ"),
				MCItemDef.create("main_itm_typ_nm", "main_itm_typ_nm"),
				MCItemDef.create("main_itm_typ_d_cd", "main_itm_typ_d_cd"),
				MCItemDef.create("main_itm_typ_d_nm", "main_itm_typ_d_nm"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("set_itm_nm", "set_itm_nm"),
				MCItemDef.create("set_itm_typ", "set_itm_typ"),
				MCItemDef.create("set_itm_typ_nm", "set_itm_typ_nm"),
				MCItemDef.create("set_itm_typ_d_cd", "set_itm_typ_d_cd"),
				MCItemDef.create("set_itm_typ_d_nm", "set_itm_typ_d_nm"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("main_itm_unit_nm", "main_itm_unit_nm"),
				MCItemDef.create("main_itm_dec_place", "main_itm_dec_place"),
				MCItemDef.create("main_itm_qty", "main_itm_qty"),
				MCItemDef.create("set_itm_unit_cd", "set_itm_unit_cd"),
				MCItemDef.create("set_itm_unit_nm", "set_itm_unit_nm"),
				MCItemDef.create("set_itm_dec_place", "set_itm_dec_place"),
				MCItemDef.create("set_itm_qty", "set_itm_qty"),
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
	
	static final MCOperationInfo MA_MABSL1070_Upd01_INFO = new MCOperationInfo("MA", "MABSL1070", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1070_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("main_itm_qty", "main_itm_qty"),
				MCItemDef.create("set_itm_unit_cd", "set_itm_unit_cd"),
				MCItemDef.create("set_itm_qty", "set_itm_qty"),
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
	
	static final MCOperationInfo MA_MABSL1070_Del01_INFO = new MCOperationInfo("MA", "MABSL1070", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1070_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

