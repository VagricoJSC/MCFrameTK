package mcframe.serverMABS.MABSL5010;

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
 * [MABSL_SlsUpriService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL5010.SlsUpri_Sprt01.UP.BLOCK0")){
			return MA_MABSL5010_SlsUpri_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL5010.SlsUpri_Sprt01.DOWN.BLOCK0")){
			return MA_MABSL5010_SlsUpri_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABSL5010_SlsUpri_Sprt01_INFO = new MCOperationInfo("MA", "MABSL5010", "SlsUpri_Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL5010_SlsUpri_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL5010", "SlsUpri_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_srv" + ".peg_no", "peg_no"),
				MCItemDef.create("sls_upri_srv" + ".grp_no", "grp_no"),
				MCItemDef.create("sls_upri_srv" + ".wg_cd", "wg_cd"),
				MCItemDef.create("sls_upri_srv" + ".sls_upri_flg", "sls_upri_flg"),
				MCItemDef.create("sls_upri_srv" + ".std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("sls_upri_srv" + ".std_upri_flg", "std_upri_flg"),
				MCItemDef.create("sls_upri_srv" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sls_upri_srv" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sls_upri_srv" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sls_upri_srv" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sls_upri_srv" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sls_upri_srv" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_upri_srv" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("sls_upri_srv" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("sls_upri_srv" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("sls_upri_srv" + ".unit_cd", "unit_cd"),
				MCItemDef.create("sls_upri_srv" + ".qty", "qty"),
				MCItemDef.create("sls_upri_srv" + ".cur_cd", "cur_cd"),
				MCItemDef.create("sls_upri_srv" + ".dt", "dt"),
				MCItemDef.create("sls_upri_srv" + ".std_upri_wg_cd", "std_upri_wg_cd"),
				MCItemDef.create("not_err_flg", "not_err_flg")
			}
			,
			MCBlockDef.create("SlsUpri_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL5010_SlsUpri_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL5010", "SlsUpri_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_srv" + ".peg_no", "peg_no"),
				MCItemDef.create("sls_upri_srv" + ".sls_upri", "sls_upri"),
				MCItemDef.create("sls_upri_srv" + ".std_sls_upri", "std_sls_upri"),
				MCItemDef.create("sls_upri_srv" + ".std_upri", "std_upri"),
				MCItemDef.create("sls_upri_srv" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("SlsUpri_Sprt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

