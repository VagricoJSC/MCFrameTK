package mcframe.serverMSLA.MSLAL9980;

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
 * [MSLAL_FileLinkBase]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL9980.FileLinkBase_Chk01.UP.BLOCK0")){
			return MS_MSLAL9980_FileLinkBase_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9980.FileLinkBase_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL9980_FileLinkBase_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9980.FileLinkBase_Upd01.UP.BLOCK0")){
			return MS_MSLAL9980_FileLinkBase_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSLAL9980_FileLinkBase_Chk01_INFO = new MCOperationInfo("MS", "MSLAL9980", "FileLinkBase_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9980_FileLinkBase_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9980", "FileLinkBase_Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("Link_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9980_FileLinkBase_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9980", "FileLinkBase_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Link_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9980_FileLinkBase_Upd01_INFO = new MCOperationInfo("MS", "MSLAL9980", "FileLinkBase_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9980_FileLinkBase_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9980", "FileLinkBase_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("Link_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

