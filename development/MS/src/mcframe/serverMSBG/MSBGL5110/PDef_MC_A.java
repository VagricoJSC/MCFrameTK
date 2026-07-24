package mcframe.serverMSBG.MSBGL5110;

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
 * [MSBGL_NoteIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5110.NoteIf_Ins01.UP.BLOCK0")){
			return MS_MSBGL5110_NoteIf_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5110.NoteIf_Ins01.DOWN.BLOCK0")){
			return MS_MSBGL5110_NoteIf_Ins01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL5110_NoteIf_Ins01_INFO = new MCOperationInfo("MS", "MSBGL5110", "NoteIf_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5110_NoteIf_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5110", "NoteIf_Ins01",
			new MCItemDef[]{
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("rcv_act_flg", "rcv_act_flg")
			}
			,
			MCBlockDef.create("NoteIf_Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5110_NoteIf_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5110", "NoteIf_Ins01",
			new MCItemDef[]{
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("NoteIf_Ins01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

