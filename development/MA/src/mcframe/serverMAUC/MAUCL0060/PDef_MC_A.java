package mcframe.serverMAUC.MAUCL0060;

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
 * [MAUCL_Num]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0060.Upd01.UP.BLOCK0")){
			return MA_MAUCL0060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0060.Upd01.DOWN.BLOCK0")){
			return MA_MAUCL0060_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MAUCL0060_Upd01_INFO = new MCOperationInfo("MA", "MAUCL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", true, "num_biz_typ"),
				MCItemDef.create("elm_args" + ".num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("elm_args" + ".itm_cd", "itm_cd"),
				MCItemDef.create("elm_args" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("elm_args" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("elm_args" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("elm_args" + ".loc_cd", "loc_cd"),
				MCItemDef.create("elm_args" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("elm_args" + ".co_cd", "co_cd"),
				MCItemDef.create("elm_args" + ".bp_cd", "bp_cd"),
				MCItemDef.create("elm_args" + ".wg_cd", "wg_cd"),
				MCItemDef.create("elm_args" + ".trd_cd", "trd_cd"),
				MCItemDef.create("elm_args" + ".site_cd", "site_cd"),
				MCItemDef.create("elm_args" + ".lot_no", "lot_no"),
				MCItemDef.create("elm_args" + ".chd_lot_no", "chd_lot_no"),
				MCItemDef.create("elm_args" + ".chd_sublot_no", "chd_sublot_no"),
				MCItemDef.create("elm_args" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("elm_args" + ".sno1", "sno1"),
				MCItemDef.create("elm_args" + ".sno2", "sno2"),
				MCItemDef.create("elm_args" + ".sno3", "sno3"),
				MCItemDef.create("elm_args" + ".sno4", "sno4"),
				MCItemDef.create("elm_args" + ".dt", "dt"),
				MCItemDef.create("elm_args" + ".str", "str"),
				MCItemDef.create("elm_args" + ".str2", "str2"),
				MCItemDef.create("elm_args" + ".str3", "str3"),
				MCItemDef.create("elm_args" + ".num", "num"),
				MCItemDef.create("elm_args" + ".itm_cd_label_nm", "itm_cd_label_nm"),
				MCItemDef.create("elm_args" + ".itm_sub1_label_nm", "itm_sub1_label_nm"),
				MCItemDef.create("elm_args" + ".itm_sub2_label_nm", "itm_sub2_label_nm"),
				MCItemDef.create("elm_args" + ".itm_sub3_label_nm", "itm_sub3_label_nm"),
				MCItemDef.create("elm_args" + ".loc_cd_label_nm", "loc_cd_label_nm"),
				MCItemDef.create("elm_args" + ".dpt_cd_label_nm", "dpt_cd_label_nm"),
				MCItemDef.create("elm_args" + ".co_cd_label_nm", "co_cd_label_nm"),
				MCItemDef.create("elm_args" + ".bp_cd_label_nm", "bp_cd_label_nm"),
				MCItemDef.create("elm_args" + ".wg_cd_label_nm", "wg_cd_label_nm"),
				MCItemDef.create("elm_args" + ".site_cd_label_nm", "site_cd_label_nm"),
				MCItemDef.create("elm_args" + ".lot_no_label_nm", "lot_no_label_nm"),
				MCItemDef.create("elm_args" + ".chd_lot_no_label_nm", "chd_lot_no_label_nm"),
				MCItemDef.create("elm_args" + ".chd_sublot_no_label_nm", "chd_sublot_no_label_nm"),
				MCItemDef.create("elm_args" + ".bp_lot_no_label_nm", "bp_lot_no_label_nm"),
				MCItemDef.create("elm_args" + ".sno1_label_nm", "sno1_label_nm"),
				MCItemDef.create("elm_args" + ".sno2_label_nm", "sno2_label_nm"),
				MCItemDef.create("elm_args" + ".sno3_label_nm", "sno3_label_nm"),
				MCItemDef.create("elm_args" + ".sno4_label_nm", "sno4_label_nm"),
				MCItemDef.create("elm_args" + ".trd_cd_label_nm", "trd_cd_label_nm"),
				MCItemDef.create("elm_args" + ".dt_label_nm", "dt_label_nm"),
				MCItemDef.create("elm_args" + ".str_label_nm", "str_label_nm"),
				MCItemDef.create("elm_args" + ".str2_label_nm", "str2_label_nm"),
				MCItemDef.create("elm_args" + ".str3_label_nm", "str3_label_nm"),
				MCItemDef.create("elm_args" + ".num_label_nm", "num_label_nm")
			}
			,
			MCBlockDef.create("Args")
		);
	}


	public static MCContainerDef MA_MAUCL0060_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("num", "num")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

