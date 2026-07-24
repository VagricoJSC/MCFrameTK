package mcframe.serverMSBE.MSBEL5720;

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
 * [MSBEL_ExRptService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt01.UP.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt01.UP.BLOCK1")){
			return MS_MSBEL5720_ExRpt_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt02.UP.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt02.UP.BLOCK1")){
			return MS_MSBEL5720_ExRpt_Prnt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt02.DOWN.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt03.UP.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt03.DOWN.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt04.UP.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5720.ExRpt_Prnt04.DOWN.BLOCK0")){
			return MS_MSBEL5720_ExRpt_Prnt04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL5720_ExRpt_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL5720", "ExRpt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("ExRpt_Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5720_ExRpt_Prnt02_INFO = new MCOperationInfo("MS", "MSBEL5720", "ExRpt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("ExRpt_Prnt02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5720_ExRpt_Prnt03_INFO = new MCOperationInfo("MS", "MSBEL5720", "ExRpt_Prnt03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("ExRpt_Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5720_ExRpt_Prnt04_INFO = new MCOperationInfo("MS", "MSBEL5720", "ExRpt_Prnt04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt04",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("ExRpt_Prnt02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5720_ExRpt_Prnt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5720", "ExRpt_Prnt04",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ExRpt_Prnt02_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

