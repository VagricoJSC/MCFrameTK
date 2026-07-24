package mcframe.serverMSBF.MSBFL0020;

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
 * [MSBFL_PrcdLotInspReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0020.Srch01.UP.BLOCK0")){
			return MS_MSBFL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Chk01.UP.BLOCK0")){
			return MS_MSBFL0020_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Chk02.UP.BLOCK0")){
			return MS_MSBFL0020_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Ins01.UP.BLOCK0")){
			return MS_MSBFL0020_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Ins01.DOWN.BLOCK0")){
			return MS_MSBFL0020_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0020.Del01.UP.BLOCK0")){
			return MS_MSBFL0020_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBFL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pre_insp_valid_flg", "pre_insp_valid_flg"),
				MCItemDef.create("no_spec_flg", "no_spec_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0020_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0020", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0020_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0020_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0020", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0020_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("Chk02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0020_Ins01_INFO = new MCOperationInfo("MS", "MSBFL0020", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0020_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0020_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0020_Del01_INFO = new MCOperationInfo("MS", "MSBFL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0020_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_schd_no", "insp_schd_no")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

