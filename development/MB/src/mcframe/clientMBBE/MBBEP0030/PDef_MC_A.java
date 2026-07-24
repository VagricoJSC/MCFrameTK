package mcframe.clientMBBE.MBBEP0030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBEP_BizDatDL]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0030.Srch01.UP.BLOCK0")){
			return MB_MBBEL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0030.Srch01.DOWN.BLOCK0")){
			return MB_MBBEL0030_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBEL0030_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0030_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBEL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("res_flg", "res_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0030_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBEL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("biz_dat_get_typ", "biz_dat_get_typ"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.IGNORE_ITEM("upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("str_cnd_list", "str_cnd_list"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("form_file_nm", "form_file_nm"),
				MCItemDef.create("cartridge", "cartridge"),
				MCItemDef.create("print_flg", "print_flg"),
				MCItemDef.create("dwnld_flg", "dwnld_flg"),
				MCItemDef.create("dt_cond_col1", "dt_cond_col1"),
				MCItemDef.create("dt_cond_col2", "dt_cond_col2"),
				MCItemDef.create("dt_cond_col3", "dt_cond_col3"),
				MCItemDef.create("dt_cond_col4", "dt_cond_col4"),
				MCItemDef.create("dt_cond_col5", "dt_cond_col5"),
				MCItemDef.create("dt_cond_col6", "dt_cond_col6"),
				MCItemDef.create("dt_cond_col7", "dt_cond_col7"),
				MCItemDef.create("dt_cond_col8", "dt_cond_col8"),
				MCItemDef.create("dt_cond_col9", "dt_cond_col9"),
				MCItemDef.create("dt_cond_col10", "dt_cond_col10"),
				MCItemDef.create("str_cond_col1", "str_cond_col1"),
				MCItemDef.create("str_cond_col2", "str_cond_col2"),
				MCItemDef.create("str_cond_col3", "str_cond_col3"),
				MCItemDef.create("str_cond_col4", "str_cond_col4"),
				MCItemDef.create("str_cond_col5", "str_cond_col5"),
				MCItemDef.create("num_cond_col1", "num_cond_col1"),
				MCItemDef.create("num_cond_col2", "num_cond_col2"),
				MCItemDef.create("num_cond_col3", "num_cond_col3"),
				MCItemDef.create("num_cond_col4", "num_cond_col4"),
				MCItemDef.create("num_cond_col5", "num_cond_col5"),
				MCItemDef.create("flg_cond_col1", "flg_cond_col1"),
				MCItemDef.create("flg_cond_col2", "flg_cond_col2"),
				MCItemDef.create("flg_cond_col3", "flg_cond_col3"),
				MCItemDef.create("flg_cond_col4", "flg_cond_col4"),
				MCItemDef.create("flg_cond_col5", "flg_cond_col5"),
				MCItemDef.create("dt_lbl1", "dt_lbl1"),
				MCItemDef.create("dt_lbl2", "dt_lbl2"),
				MCItemDef.create("dt_lbl3", "dt_lbl3"),
				MCItemDef.create("dt_lbl4", "dt_lbl4"),
				MCItemDef.create("dt_lbl5", "dt_lbl5"),
				MCItemDef.create("dt_lbl6", "dt_lbl6"),
				MCItemDef.create("dt_lbl7", "dt_lbl7"),
				MCItemDef.create("dt_lbl8", "dt_lbl8"),
				MCItemDef.create("dt_lbl9", "dt_lbl9"),
				MCItemDef.create("dt_lbl10", "dt_lbl10"),
				MCItemDef.create("str_lbl1", "str_lbl1"),
				MCItemDef.create("str_lbl2", "str_lbl2"),
				MCItemDef.create("str_lbl3", "str_lbl3"),
				MCItemDef.create("str_lbl4", "str_lbl4"),
				MCItemDef.create("str_lbl5", "str_lbl5"),
				MCItemDef.create("num_lbl1", "num_lbl1"),
				MCItemDef.create("num_lbl2", "num_lbl2"),
				MCItemDef.create("num_lbl3", "num_lbl3"),
				MCItemDef.create("num_lbl4", "num_lbl4"),
				MCItemDef.create("num_lbl5", "num_lbl5"),
				MCItemDef.create("flg_lbl1", "flg_lbl1"),
				MCItemDef.create("flg_lbl2", "flg_lbl2"),
				MCItemDef.create("flg_lbl3", "flg_lbl3"),
				MCItemDef.create("flg_lbl4", "flg_lbl4"),
				MCItemDef.create("flg_lbl5", "flg_lbl5")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

