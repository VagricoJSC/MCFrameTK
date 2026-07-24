package mcframe.serverMSBG.MSBGL5080;

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
 * [MSBGL_CredService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5080.Cred_Srch01.UP.BLOCK0")){
			return MS_MSBGL5080_Cred_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Srch01.DOWN.BLOCK0")){
			return MS_MSBGL5080_Cred_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Upd01.UP.BLOCK0")){
			return MS_MSBGL5080_Cred_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Upd01.DOWN.BLOCK0")){
			return MS_MSBGL5080_Cred_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Upd01.DOWN.BLOCK1")){
			return MS_MSBGL5080_Cred_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Upd02.UP.BLOCK0")){
			return MS_MSBGL5080_Cred_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5080.Cred_Upd02.DOWN.BLOCK0")){
			return MS_MSBGL5080_Cred_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBGL5080_Cred_Srch01_INFO = new MCOperationInfo("MS", "MSBGL5080", "Cred_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5080_Cred_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", true, "cur_cd")
			}
			,
			MCBlockDef.create("Cred_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5080_Cred_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_amt", "cred_amt"),
				MCItemDef.create("cred_limit", "cred_limit"),
				MCItemDef.create("cred_bal", "cred_bal")
			}
			,
			MCBlockDef.create("Cred_Srch01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5080_Cred_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5080", "Cred_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5080_Cred_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", true, "cur_cd"),
				MCItemDef.create("trd_ptn_typ", true, "trd_ptn_typ"),
				MCItemDef.create("amt", true, "amt"),
				MCItemDef.create("cred_upd_typ", true, "cred_upd_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Cred_Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5080_Cred_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd")
			}
			,
			MCBlockDef.create("Cred_Upd01_Cnd")
		);
	}
	public static MCContainerDef MS_MSBGL5080_Cred_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cred_amt", "cred_amt"),
				MCItemDef.create("cred_limit", "cred_limit")
			}
			,
			MCBlockDef.create("Cred_Upd01_Err")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5080_Cred_Upd02_INFO = new MCOperationInfo("MS", "MSBGL5080", "Cred_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5080_Cred_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Upd02",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", true, "cur_cd"),
				MCItemDef.create("amt", true, "amt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Cred_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5080_Cred_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5080", "Cred_Upd02",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd")
			}
			,
			MCBlockDef.create("Cred_Upd02_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

