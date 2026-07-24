package mcframe.serverMABS.MABSL1030;

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
 * [MABSL_ComPaidReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1030.ComPaid_UpdChk01.UP.BLOCK0")){
			return MA_MABSL1030_ComPaid_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.ComPaid_Upd01.UP.BLOCK0")){
			return MA_MABSL1030_ComPaid_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.ComPaid_DelChk01.UP.BLOCK0")){
			return MA_MABSL1030_ComPaid_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.ComPaid_Del01.UP.BLOCK0")){
			return MA_MABSL1030_ComPaid_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.Srch01.UP.BLOCK0")){
			return MA_MABSL1030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.Upd01.UP.BLOCK0")){
			return MA_MABSL1030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1030.Del01.UP.BLOCK0")){
			return MA_MABSL1030_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABSL1030_ComPaid_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL1030", "ComPaid_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_ComPaid_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "ComPaid_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ComPaid_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_ComPaid_Upd01_INFO = new MCOperationInfo("MA", "MABSL1030", "ComPaid_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_ComPaid_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "ComPaid_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ComPaid_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_ComPaid_DelChk01_INFO = new MCOperationInfo("MA", "MABSL1030", "ComPaid_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_ComPaid_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "ComPaid_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ComPaid_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_ComPaid_Del01_INFO = new MCOperationInfo("MA", "MABSL1030", "ComPaid_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_ComPaid_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "ComPaid_Del01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ComPaid_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_Srch01_INFO = new MCOperationInfo("MA", "MABSL1030", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL1030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_Upd01_INFO = new MCOperationInfo("MA", "MABSL1030", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABSL1030_Del01_INFO = new MCOperationInfo("MA", "MABSL1030", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1030_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL1030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

