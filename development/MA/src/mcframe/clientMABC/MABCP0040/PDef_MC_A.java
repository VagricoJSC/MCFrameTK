package mcframe.clientMABC.MABCP0040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_MultiSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0040.Srch01.UP.BLOCK0")){
			return MA_MABCL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0040.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0040_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABCL0040_Srch01_INFO = new MCOperationInfo("MA", "MABCL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0040_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_nm_nm", "mst_nm_nm"),
				MCItemDef.create("partial_flg", "partial_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0040_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mst_nm", "mst_nm"),
				MCItemDef.create("mst_nm_nm", "mst_nm_nm"),
				MCItemDef.create("mst_set_typ_nm", "mst_set_typ_nm"),
				MCItemDef.create("mst_key", "mst_key"),
				MCItemDef.create("lcl_flg", "lcl_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

