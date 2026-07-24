package mcframe.serverMABS.MABSL5030;

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
 * [MABSL_ProcUpriService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL5030.ProcUpri_Sprt01.UP.BLOCK0")){
			return MA_MABSL5030_ProcUpri_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL5030.ProcUpri_Sprt01.DOWN.BLOCK0")){
			return MA_MABSL5030_ProcUpri_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABSL5030_ProcUpri_Sprt01_INFO = new MCOperationInfo("MA", "MABSL5030", "ProcUpri_Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL5030_ProcUpri_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL5030", "ProcUpri_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("proc_upri_srv" + ".peg_no", "peg_no"),
				MCItemDef.create("proc_upri_srv" + ".grp_no", "grp_no"),
				MCItemDef.create("proc_upri_srv" + ".wg_cd", "wg_cd"),
				MCItemDef.create("proc_upri_srv" + ".itm_cd", "itm_cd"),
				MCItemDef.create("proc_upri_srv" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("proc_upri_srv" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("proc_upri_srv" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("proc_upri_srv" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("proc_upri_srv" + ".maker_cd", "maker_cd"),
				MCItemDef.create("proc_upri_srv" + ".unit_cd", "unit_cd"),
				MCItemDef.create("proc_upri_srv" + ".qty", "qty"),
				MCItemDef.create("proc_upri_srv" + ".cur_cd", "cur_cd"),
				MCItemDef.create("proc_upri_srv" + ".loc_cd", "loc_cd"),
				MCItemDef.create("proc_upri_srv" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("proc_upri_srv" + ".proc_upri_typ", "proc_upri_typ"),
				MCItemDef.create("proc_upri_srv" + ".dt", "dt")
			}
			,
			MCBlockDef.create("ProcUpri_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL5030_ProcUpri_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL5030", "ProcUpri_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("proc_upri_srv" + ".peg_no", "peg_no"),
				MCItemDef.create("proc_upri_srv" + ".upri", "upri"),
				MCItemDef.create("proc_upri_srv" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("ProcUpri_Sprt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

