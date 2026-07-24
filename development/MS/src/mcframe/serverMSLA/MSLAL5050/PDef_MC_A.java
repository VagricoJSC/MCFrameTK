package mcframe.serverMSLA.MSLAL5050;

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
 * [MSLAL_ShipActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL5050_ShipActRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL5050_ShipActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd03.UP.BLOCK1")){
			return MS_MSLAL5050_ShipActRecvIf_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd04.UP.BLOCK1")){
			return MS_MSLAL5050_ShipActRecvIf_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5050.ShipActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL5050_ShipActRecvIf_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL5050_ShipActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL5050", "ShipActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Chk01",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Chk01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Chk01",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Chk01",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Chk01_DOWN_BLOCK1(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5050_ShipActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5050", "ShipActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd01",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5050_ShipActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5050", "ShipActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd02",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd02",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd02_UP_BLOCK1(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd02",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd02_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5050_ShipActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL5050", "ShipActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd03",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd03",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd03_UP_BLOCK1(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd03",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5050_ShipActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL5050", "ShipActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd04",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd04",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd04_UP_BLOCK1(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5050_ShipActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5050", "ShipActRecvIf_Upd04",
			mcframe.serverMSLA.MSLAL6040.PDef.MS_MSLAL6040_ArrActRecvIf_Upd04_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ArrActRecvIf_Upd04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

