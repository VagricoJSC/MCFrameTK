package mcframe.serverMSBC.MSBCL6090;

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
 * [MSBCL_MfgRptService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt01.UP.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt02.UP.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt02.DOWN.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt03.UP.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6090.MfgRpt_Prnt03.DOWN.BLOCK0")){
			return MS_MSBCL6090_MfgRpt_Prnt03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL6090_MfgRpt_Prnt01_INFO = new MCOperationInfo("MS", "MSBCL6090", "MfgRpt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6090_MfgRpt_Prnt02_INFO = new MCOperationInfo("MS", "MSBCL6090", "MfgRpt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("act_prnt_flg", "act_prnt_flg"),
				MCItemDef.create("act_prnt_tm", "act_prnt_tm")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6090_MfgRpt_Prnt03_INFO = new MCOperationInfo("MS", "MSBCL6090", "MfgRpt_Prnt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6090_MfgRpt_Prnt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6090", "MfgRpt_Prnt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("MfgRpt_Prnt03_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

