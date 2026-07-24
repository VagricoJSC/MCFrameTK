package mcframe.serverMBBB.MBBBL0110;

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
 * [MBBBL_JnlHistory]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0110.Srch01.UP.BLOCK0")){
			return MB_MBBBL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Srch01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Chk01.UP.BLOCK0")){
			return MB_MBBBL0110_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Chk01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Chk02.UP.BLOCK0")){
			return MB_MBBBL0110_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Chk02.DOWN.BLOCK0")){
			return MB_MBBBL0110_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del01.UP.BLOCK0")){
			return MB_MBBBL0110_Del01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Upd01.UP.BLOCK0")){
			return MB_MBBBL0110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Upd01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Ins01.UP.BLOCK0")){
			return MB_MBBBL0110_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Ins01.UP.BLOCK1")){
			return MB_MBBBL0110_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBBL0110.Ins01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del02.UP.BLOCK0")){
			return MB_MBBBL0110_Del02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del02.DOWN.BLOCK0")){
			return MB_MBBBL0110_Del02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MB_MBBBL0110_Srch01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("jnl_del_flg", "jnl_del_flg"),
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("data_typ_nm", "data_typ_nm"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Chk01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".ac_ym", "ac_ym"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".ac_ym", "ac_ym"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Chk02_INFO = new MCOperationInfo("MB", "MBBBL0110", "Chk02", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Del01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".ac_ym", "ac_ym"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Upd01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Ins01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MB_MBBBL0110_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Del02_INFO = new MCOperationInfo("MB", "MBBBL0110", "Del02", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

