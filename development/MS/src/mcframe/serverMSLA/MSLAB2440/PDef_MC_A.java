package mcframe.serverMSLA.MSLAB2440;

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
 * [MSLAB_SendSchdOrdLnk]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAB2440.SendSchdOrdLnk_Upd01.UP.BLOCK0")){
			return MS_MSLAB2440_SendSchdOrdLnk_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAB2440_SendSchdOrdLnk_Upd01_INFO = new MCOperationInfo("MS", "MSLAB2440", "SendSchdOrdLnk_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAB2440_SendSchdOrdLnk_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAB2440", "SendSchdOrdLnk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("term_from", "term_from"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("SendSchdOrdLnk_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

