package mcframe.clientMABS.MABSP1060;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_SetItmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1060.Srch01.UP.BLOCK0")){
			return MA_MABSL1060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1060.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1060.Srch01.DOWN.BLOCK1")){
			return MA_MABSL1060_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL1060.Srch01.DOWN.BLOCK2")){
			return MA_MABSL1060_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABSL1060.Upd01.UP.BLOCK0")){
			return MA_MABSL1060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1060.Upd01.UP.BLOCK1")){
			return MA_MABSL1060_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL1060.Upd01.UP.BLOCK2")){
			return MA_MABSL1060_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABSL1060.Del01.UP.BLOCK0")){
			return MA_MABSL1060_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABSL1060_Srch01_INFO = new MCOperationInfo("MA", "MABSL1060", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1060_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm_lcl"),
				MCItemDef.create("main_itm_p" + ".itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_p" + ".itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_p" + ".itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_p" + ".itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_itm_p" + ".itm_nm", "main_itm_nm"),
				MCItemDef.create("set_itm_p" + ".itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_p" + ".itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_p" + ".itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_p" + ".itm_sub3", "set_itm_sub3"),
				MCItemDef.create("set_itm_p" + ".itm_nm", "set_itm_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL1060_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm_lcl", "set_grp_nm_lcl"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("ship_assort_flg", "ship_assort_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
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
	public static MCContainerDef MA_MABSL1060_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_p" + ".itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_p" + ".itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_p" + ".itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_p" + ".itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_itm_p" + ".itm_nm", "main_itm_nm"),
				MCItemDef.create("main_itm_typ", "main_itm_typ"),
				MCItemDef.create("main_itm_typ_nm", "main_itm_typ_nm"),
				MCItemDef.create("main_itm_typ_d_cd", "main_itm_typ_d_cd"),
				MCItemDef.create("main_itm_typ_d_nm", "main_itm_typ_d_nm"),
				MCItemDef.create("set_itm_p" + ".itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_p" + ".itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_p" + ".itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_p" + ".itm_sub3", "set_itm_sub3"),
				MCItemDef.create("set_itm_p" + ".itm_nm", "set_itm_nm"),
				MCItemDef.create("set_itm_typ", "set_itm_typ"),
				MCItemDef.create("set_itm_typ_nm", "set_itm_typ_nm"),
				MCItemDef.create("set_itm_typ_d_cd", "set_itm_typ_d_cd"),
				MCItemDef.create("set_itm_typ_d_nm", "set_itm_typ_d_nm"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("main_itm_unit_nm", "main_itm_unit_nm"),
				MCItemDef.create("main_itm_dec_place", "main_itm_dec_place"),
				MCItemDef.create("main_itm_qty_p" + ".qty", "main_itm_qty"),
				MCItemDef.create("set_itm_unit_cd", "set_itm_unit_cd"),
				MCItemDef.create("set_itm_unit_nm", "set_itm_unit_nm"),
				MCItemDef.create("set_itm_dec_place", "set_itm_dec_place"),
				MCItemDef.create("set_itm_qty_p" + ".qty", "set_itm_qty"),
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
			MCBlockDef.create("DtlSetItmAll")
		);
	}
	public static MCContainerDef MA_MABSL1060_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
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
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABSL1060_Upd01_INFO = new MCOperationInfo("MA", "MABSL1060", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1060_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("ship_assort_flg", "ship_assort_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
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

	public static MCContainerDef MA_MABSL1060_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("main_itm_p" + ".itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_p" + ".itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_p" + ".itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_p" + ".itm_sub3", "main_itm_sub3"),
				MCItemDef.create("set_itm_p" + ".itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_p" + ".itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_p" + ".itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_p" + ".itm_sub3", "set_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("main_itm_qty_p" + ".qty", "main_itm_qty"),
				MCItemDef.create("set_itm_unit_cd", "set_itm_unit_cd"),
				MCItemDef.create("set_itm_qty_p" + ".qty", "set_itm_qty"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DtlSetItmAll")
		);
	}

	public static MCContainerDef MA_MABSL1060_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABSL1060_Del01_INFO = new MCOperationInfo("MA", "MABSL1060", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1060_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

