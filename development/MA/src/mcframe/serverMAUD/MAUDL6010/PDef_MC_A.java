package mcframe.serverMAUD.MAUDL6010;

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
 * [MAUDL_RLUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUDL6010.Srch01.UP.BLOCK0")){
			return MA_MAUDL6010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUDL6010.Srch01.DOWN.BLOCK0")){
			return MA_MAUDL6010_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MAUDL6010_Srch01_INFO = new MCOperationInfo("MA", "MAUDL6010", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MAUDL6010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUDL6010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MAUDL6010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUDL6010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_set_typ", "mst_set_typ"),
				MCItemDef.create("mst_set_typ_nm", "mst_set_typ_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

