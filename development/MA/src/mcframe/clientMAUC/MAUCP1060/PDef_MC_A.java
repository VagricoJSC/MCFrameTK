package mcframe.clientMAUC.MAUCP1060;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MAUCP_TrdUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL1060.Srch01.UP.BLOCK0")){
			return MA_MAUCL1060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL1060.Srch01.DOWN.BLOCK0")){
			return MA_MAUCL1060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL1060.Srch02.UP.BLOCK0")){
			return MA_MAUCL1060_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL1060.Srch02.DOWN.BLOCK0")){
			return MA_MAUCL1060_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MAUCL1060_Srch01_INFO = new MCOperationInfo("MA", "MAUCL1060", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL1060_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Deftrd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("Deftrd")
		);
	}


	public static MCContainerDef MA_MAUCL1060_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Deftrd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd")
			}
			,
			MCBlockDef.create("Deftrd")
		);
	}
	
	static final MCOperationInfo MA_MAUCL1060_Srch02_INFO = new MCOperationInfo("MA", "MAUCL1060", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MAUCL1060_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Trd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL1060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd")
			}
			,
			MCBlockDef.create("Trd")
		);
	}


	public static MCContainerDef MA_MAUCL1060_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Trd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL1060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("slip_form_cd", "slip_form_cd"),
				MCItemDef.create("auto_adopt_flg", "auto_adopt_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Trd")
		);
	}
	//FMCB DEF_CLASSES END
}

