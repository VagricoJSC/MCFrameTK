package mcframe.serverMGBD.MGBDL0060;

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
 * [MGBDL_CalcCostSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0060.Chk01.UP.BLOCK0")){
			return MG_MGBDL0060_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0060.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0060_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0060.Del01.UP.BLOCK0")){
			return MG_MGBDL0060_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0060.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0060_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0060.Srch01.UP.BLOCK0")){
			return MG_MGBDL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0060.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0060_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBDL0060_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0060", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0060_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0060_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0060_Del01_INFO = new MCOperationInfo("MG", "MGBDL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0060_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0060_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_usr_cd", "calc_usr_cd"),
				MCItemDef.create("calc_usr_nm", "calc_usr_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("calc_usr_cd", "calc_usr_cd"),
				MCItemDef.create("calc_usr_nm", "calc_usr_nm"),
				MCItemDef.create("calc_st", "calc_st"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

