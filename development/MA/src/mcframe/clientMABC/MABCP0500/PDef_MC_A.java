package mcframe.clientMABC.MABCP0500;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_BpLclReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0500.Srch01.UP.BLOCK0")){
			return MA_MABCL0500_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0500.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0500_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0500.Upd01.UP.BLOCK0")){
			return MA_MABCL0500_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0500.Del01.UP.BLOCK0")){
			return MA_MABCL0500_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL0500_Srch01_INFO = new MCOperationInfo("MA", "MABCL0500", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0500_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm_std", "bp_nm_std"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("reg_flg", "reg_flg"),
				MCItemDef.create("yet_flg", "yet_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
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
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0500_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("yet_flg", "yet_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm_std", "bp_nm_std"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
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
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0500_Upd01_INFO = new MCOperationInfo("MA", "MABCL0500", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0500_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0500_Del01_INFO = new MCOperationInfo("MA", "MABCL0500", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0500_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0500", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

