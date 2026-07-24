package mcframe.serverMSBH.MSBHL5090;

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
 * [MSBHL_ApPrntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt01.UP.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt02.UP.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt02.DOWN.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt03.UP.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt03.UP.BLOCK1")){
			return MS_MSBHL5090_ApPrnt_Prnt03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5090.ApPrnt_Prnt03.DOWN.BLOCK0")){
			return MS_MSBHL5090_ApPrnt_Prnt03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBHL5090_ApPrnt_Prnt01_INFO = new MCOperationInfo("MS", "MSBHL5090", "ApPrnt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5090_ApPrnt_Prnt02_INFO = new MCOperationInfo("MS", "MSBHL5090", "ApPrnt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5090_ApPrnt_Prnt03_INFO = new MCOperationInfo("MS", "MSBHL5090", "ApPrnt_Prnt03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5090_ApPrnt_Prnt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5090", "ApPrnt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApPrnt_Prnt03_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

