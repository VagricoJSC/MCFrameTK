package mcframe.serverMABC.MABCL0270;

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
 * [MABCL_DptMapReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0270.DptMap_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0270_DptMap_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.DptMap_Upd01.UP.BLOCK0")){
			return MA_MABCL0270_DptMap_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.DptMap_DelChk01.UP.BLOCK0")){
			return MA_MABCL0270_DptMap_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.DptMap_Del01.UP.BLOCK0")){
			return MA_MABCL0270_DptMap_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.Srch01.UP.BLOCK0")){
			return MA_MABCL0270_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0270_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.Upd01.UP.BLOCK0")){
			return MA_MABCL0270_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0270.Del01.UP.BLOCK0")){
			return MA_MABCL0270_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABCL0270_DptMap_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0270", "DptMap_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_DptMap_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "DptMap_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_DptMap_Upd01_INFO = new MCOperationInfo("MA", "MABCL0270", "DptMap_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_DptMap_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "DptMap_Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_DptMap_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0270", "DptMap_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_DptMap_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "DptMap_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_DptMap_Del01_INFO = new MCOperationInfo("MA", "MABCL0270", "DptMap_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_DptMap_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "DptMap_Del01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_Srch01_INFO = new MCOperationInfo("MA", "MABCL0270", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("old_dpt_nm", "old_dpt_nm"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("new_dpt_nm", "new_dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0270_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dpt_his_rmrks", "dpt_his_rmrks"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("old_dpt_nm", "old_dpt_nm"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("new_dpt_nm", "new_dpt_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_Upd01_INFO = new MCOperationInfo("MA", "MABCL0270", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0270_Del01_INFO = new MCOperationInfo("MA", "MABCL0270", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0270_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0270", "Del01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

