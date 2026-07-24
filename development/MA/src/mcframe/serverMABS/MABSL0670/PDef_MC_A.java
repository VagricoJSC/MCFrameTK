package mcframe.serverMABS.MABSL0670;

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
 * [MABSL_SpplUsrReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0670.SpplUsr_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0670_SpplUsr_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.SpplUsr_Upd01.UP.BLOCK0")){
			return MA_MABSL0670_SpplUsr_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.SpplUsr_DelChk01.UP.BLOCK0")){
			return MA_MABSL0670_SpplUsr_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.SpplUsr_Del01.UP.BLOCK0")){
			return MA_MABSL0670_SpplUsr_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Srch01.UP.BLOCK0")){
			return MA_MABSL0670_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0670_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Sprt01.UP.BLOCK0")){
			return MA_MABSL0670_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0670_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Upd01.UP.BLOCK0")){
			return MA_MABSL0670_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0670.Del01.UP.BLOCK0")){
			return MA_MABSL0670_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABSL0670_SpplUsr_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0670", "SpplUsr_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_SpplUsr_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "SpplUsr_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SpplUsr_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_SpplUsr_Upd01_INFO = new MCOperationInfo("MA", "MABSL0670", "SpplUsr_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_SpplUsr_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "SpplUsr_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SpplUsr_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_SpplUsr_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0670", "SpplUsr_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_SpplUsr_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "SpplUsr_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SpplUsr_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_SpplUsr_Del01_INFO = new MCOperationInfo("MA", "MABSL0670", "SpplUsr_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_SpplUsr_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "SpplUsr_Del01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SpplUsr_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_Srch01_INFO = new MCOperationInfo("MA", "MABSL0670", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_usr_nm", "outsrc_usr_nm"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("outsrc_dpt_nm", "outsrc_dpt_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0670_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_usr_nm", "outsrc_usr_nm"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("outsrc_dpt_nm", "outsrc_dpt_nm"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0670", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_usr_nm", "outsrc_usr_nm"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("outsrc_dpt_nm", "outsrc_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0670_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_usr_nm", "outsrc_usr_nm"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("outsrc_dpt_nm", "outsrc_dpt_nm"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_Upd01_INFO = new MCOperationInfo("MA", "MABSL0670", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0670_Del01_INFO = new MCOperationInfo("MA", "MABSL0670", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0670_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0670", "Del01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

