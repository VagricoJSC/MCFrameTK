package mcframe.serverMABC.MABCL5010;

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
 * [MABCL_SundryItmRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL5010.SundryItm_Chk01.UP.BLOCK0")){
			return MA_MABCL5010_SundryItm_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL5010.SundryItm_Chk01.DOWN.BLOCK0")){
			return MA_MABCL5010_SundryItm_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL5010.SundryItm_Upd01.UP.BLOCK0")){
			return MA_MABCL5010_SundryItm_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABCL5010_SundryItm_Chk01_INFO = new MCOperationInfo("MA", "MABCL5010", "SundryItm_Chk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL5010_SundryItm_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL5010", "SundryItm_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_nm", "itm_nm")
			}
			,
			MCBlockDef.create("SundryItm_Chk01_Dtl")
		);
	}


	public static MCContainerDef MA_MABCL5010_SundryItm_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL5010", "SundryItm_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("SundryItm_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL5010_SundryItm_Upd01_INFO = new MCOperationInfo("MA", "MABCL5010", "SundryItm_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL5010_SundryItm_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL5010", "SundryItm_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_nm", "itm_nm")
			}
			,
			MCBlockDef.create("SundryItm_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

