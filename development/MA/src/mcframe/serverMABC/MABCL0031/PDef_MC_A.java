package mcframe.serverMABC.MABCL0031;

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
 * [MABCL_MultiReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0031.Da_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Da_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Da_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Da_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DaLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_DaLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DaLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_DaLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Da_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Da_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Da_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Da_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBase_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptBase_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBase_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_DptBase_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBaseLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptBaseLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBaseLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_DptBaseLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBase_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptBase_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptBase_Del01.UP.BLOCK0")){
			return MA_MABCL0031_DptBase_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvlLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvlLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvlLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvlLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvl_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvl_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.DptLvl_Del01.UP.BLOCK0")){
			return MA_MABCL0031_DptLvl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRole_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRole_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRole_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRole_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRoleLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRoleLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRoleLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRoleLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRole_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRole_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AprvRole_Del01.UP.BLOCK0")){
			return MA_MABCL0031_AprvRole_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cntry_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Cntry_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cntry_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Cntry_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.CntryLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_CntryLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.CntryLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_CntryLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cntry_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Cntry_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cntry_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Cntry_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Area_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Area_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Area_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Area_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AreaLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_AreaLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.AreaLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_AreaLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Area_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Area_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Area_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Area_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cur_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Cur_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cur_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Cur_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.CurLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_CurLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.CurLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_CurLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cur_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Cur_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Cur_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Cur_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Unit_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Unit_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Unit_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Unit_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.UnitLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_UnitLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.UnitLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_UnitLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Unit_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Unit_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Unit_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Unit_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Bank_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_Bank_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Bank_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_Bank_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_BankLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_BankLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Bank_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_Bank_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.Bank_Del01.UP.BLOCK0")){
			return MA_MABCL0031_Bank_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranch_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranch_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranch_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranch_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranchLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranchLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranchLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranchLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranch_DelChk01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranch_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0031.BankBranch_Del01.UP.BLOCK0")){
			return MA_MABCL0031_BankBranch_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																																																												
	
	static final MCOperationInfo MA_MABCL0031_Da_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Da_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Da_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Da_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Da_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Da_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Da_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Da_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Da_Upd01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Da_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DaLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DaLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DaLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DaLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DaLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DaLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "DaLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DaLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DaLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DaLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Da_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Da_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Da_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Da_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Da_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Da_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Da_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Da_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Da_Del01",
			new MCItemDef[]{
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Da_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBase_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBase_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBase_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBase_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("def_dpt_nm", "def_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBase_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBase_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBase_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBase_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBase_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("def_dpt_nm", "def_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBase_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBaseLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBaseLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBaseLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBaseLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("def_dpt_nm", "def_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBaseLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBaseLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBaseLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBaseLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBaseLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("def_dpt_nm", "def_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBaseLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBase_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBase_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBase_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBase_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBase_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptBase_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptBase_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptBase_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptBase_Del01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptBase_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvlLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvlLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvlLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvlLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvlLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvlLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvlLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvlLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvlLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvlLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvl_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvl_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvl_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvl_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvl_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_DptLvl_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "DptLvl_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_DptLvl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "DptLvl_Del01",
			new MCItemDef[]{
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptLvl_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRole_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRole_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRole_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRole_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRole_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRole_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRole_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRole_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRole_Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRole_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRoleLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRoleLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRoleLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRoleLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRoleLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRoleLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRoleLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRoleLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRoleLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRoleLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRole_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRole_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRole_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRole_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRole_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AprvRole_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "AprvRole_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AprvRole_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AprvRole_Del01",
			new MCItemDef[]{
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AprvRole_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cntry_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cntry_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cntry_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cntry_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cntry_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cntry_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cntry_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cntry_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cntry_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cntry_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_CntryLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "CntryLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_CntryLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "CntryLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CntryLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_CntryLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "CntryLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_CntryLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "CntryLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CntryLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cntry_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cntry_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cntry_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cntry_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cntry_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cntry_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cntry_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cntry_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cntry_Del01",
			new MCItemDef[]{
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cntry_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Area_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Area_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Area_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Area_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Area_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Area_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Area_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Area_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Area_Upd01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Area_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AreaLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "AreaLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AreaLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AreaLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AreaLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_AreaLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "AreaLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_AreaLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "AreaLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AreaLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Area_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Area_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Area_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Area_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Area_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Area_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Area_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Area_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Area_Del01",
			new MCItemDef[]{
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Area_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cur_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cur_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cur_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cur_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cur_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cur_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cur_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cur_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cur_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cur_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_CurLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "CurLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_CurLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "CurLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CurLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_CurLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "CurLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_CurLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "CurLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CurLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cur_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cur_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cur_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cur_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cur_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Cur_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Cur_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Cur_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Cur_Del01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Cur_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Unit_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Unit_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Unit_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Unit_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Unit_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Unit_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Unit_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Unit_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Unit_Upd01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Unit_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_UnitLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "UnitLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_UnitLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "UnitLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UnitLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_UnitLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "UnitLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_UnitLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "UnitLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UnitLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Unit_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Unit_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Unit_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Unit_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Unit_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Unit_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Unit_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Unit_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Unit_Del01",
			new MCItemDef[]{
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Unit_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Bank_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Bank_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Bank_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Bank_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bank_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Bank_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "Bank_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Bank_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Bank_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bank_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Bank_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "Bank_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Bank_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Bank_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bank_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_Bank_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "Bank_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_Bank_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "Bank_Del01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bank_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranch_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranch_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranch_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranch_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranch_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranch_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranch_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranch_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranch_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranch_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranchLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranchLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranchLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranchLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranchLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranchLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranchLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranchLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranchLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranchLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranch_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranch_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranch_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranch_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranch_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0031_BankBranch_Del01_INFO = new MCOperationInfo("MA", "MABCL0031", "BankBranch_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0031_BankBranch_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0031", "BankBranch_Del01",
			new MCItemDef[]{
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BankBranch_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

