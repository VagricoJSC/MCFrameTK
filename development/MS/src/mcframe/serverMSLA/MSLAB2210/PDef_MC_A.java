package mcframe.serverMSLA.MSLAB2210;

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
 * [MSLAB_OrdRecvIfImp]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAB2210.OrdRecvIfImp_Upd01.UP.BLOCK0")){
			return MS_MSLAB2210_OrdRecvIfImp_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAB2210_OrdRecvIfImp_Upd01_INFO = new MCOperationInfo("MS", "MSLAB2210", "OrdRecvIfImp_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAB2210_OrdRecvIfImp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAB2210", "OrdRecvIfImp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd1", "ext_sys_cd1"),
				MCItemDef.create("ext_sys_cd2", "ext_sys_cd2"),
				MCItemDef.create("ext_sys_cd3", "ext_sys_cd3"),
				MCItemDef.create("ext_sys_cd4", "ext_sys_cd4"),
				MCItemDef.create("ext_sys_cd5", "ext_sys_cd5"),
				MCItemDef.create("ext_sys_cd6", "ext_sys_cd6"),
				MCItemDef.create("ext_sys_cd7", "ext_sys_cd7"),
				MCItemDef.create("ext_sys_cd8", "ext_sys_cd8"),
				MCItemDef.create("ext_sys_cd9", "ext_sys_cd9"),
				MCItemDef.create("ext_sys_cd10", "ext_sys_cd10"),
				MCItemDef.create("ord_rep_flg", "ord_rep_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("allow_outsrc_schd_flg", "allow_outsrc_schd_flg")
			}
			,
			MCBlockDef.create("OrdRecvIfImp_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

