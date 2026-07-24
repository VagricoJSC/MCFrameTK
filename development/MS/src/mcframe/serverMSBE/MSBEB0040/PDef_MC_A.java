package mcframe.serverMSBE.MSBEB0040;

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
 * [MSBEB_InptStkRplBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEB0040.InptStkRplBatch_Upd01.UP.BLOCK0")){
			return MS_MSBEB0040_InptStkRplBatch_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0040.InptStkRplBatch_Del01.UP.BLOCK0")){
			return MS_MSBEB0040_InptStkRplBatch_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEB0040_InptStkRplBatch_Upd01_INFO = new MCOperationInfo("MS", "MSBEB0040", "InptStkRplBatch_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0040_InptStkRplBatch_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0040", "InptStkRplBatch_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("xfr_schd_crt_flg", "xfr_schd_crt_flg"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("ord_sav_flg", "ord_sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("mfg_sav_flg", "mfg_sav_flg"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("stt_flg", "stt_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("int_flg", "int_flg"),
				MCItemDef.create("ext_flg", "ext_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("InptStkRplBatch_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEB0040_InptStkRplBatch_Del01_INFO = new MCOperationInfo("MS", "MSBEB0040", "InptStkRplBatch_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0040_InptStkRplBatch_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0040", "InptStkRplBatch_Del01",
			new MCItemDef[]{
				MCItemDef.create("inpt_stk_rpl_lst_del_flg", "inpt_stk_rpl_lst_del_flg"),
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("int_flg", "int_flg"),
				MCItemDef.create("ext_flg", "ext_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("InptStkRplBatch_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

