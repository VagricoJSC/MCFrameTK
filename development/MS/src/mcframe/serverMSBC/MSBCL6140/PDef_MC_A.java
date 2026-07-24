package mcframe.serverMSBC.MSBCL6140;

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
 * [MSBCL_ReExtHstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6140.ReExtHst_Chk01.UP.BLOCK0")){
			return MS_MSBCL6140_ReExtHst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6140.ReExtHst_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL6140_ReExtHst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6140.ReExtHst_Ins01.UP.BLOCK0")){
			return MS_MSBCL6140_ReExtHst_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6140.ReExtHst_Upd01.UP.BLOCK0")){
			return MS_MSBCL6140_ReExtHst_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL6140_ReExtHst_Chk01_INFO = new MCOperationInfo("MS", "MSBCL6140", "ReExtHst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6140_ReExtHst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6140", "ReExtHst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("ref_ord", "ref_ord")
			}
			,
			MCBlockDef.create("ReExtHst_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL6140_ReExtHst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6140", "ReExtHst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ReExtHst_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6140_ReExtHst_Ins01_INFO = new MCOperationInfo("MS", "MSBCL6140", "ReExtHst_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6140_ReExtHst_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6140", "ReExtHst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("oper_chng_flg", "oper_chng_flg"),
				MCItemDef.create("plm_cnt_rmrks", "plm_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("ReExtHst_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6140_ReExtHst_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6140", "ReExtHst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6140_ReExtHst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6140", "ReExtHst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("ReExtHst_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

