package mcframe.clientMBBB.MBBBP0110;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBBP_JnlHistory]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0110.Ins01.UP.BLOCK0")){
			return MB_MBBBL0110_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Ins01.UP.BLOCK1")){
			return MB_MBBBL0110_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBBL0110.Ins01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Upd01.UP.BLOCK0")){
			return MB_MBBBL0110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Upd01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del01.UP.BLOCK0")){
			return MB_MBBBL0110_Del01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0110.Del01.DOWN.BLOCK0")){
			return MB_MBBBL0110_Del01_DOWN_BLOCK0();
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
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
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
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
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
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Ins01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MB_MBBBL0110_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("LPnl")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Upd01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Del01_INFO = new MCOperationInfo("MB", "MBBBL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0110_Del02_INFO = new MCOperationInfo("MB", "MBBBL0110", "Del02", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0110_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MB_MBBBL0110_Del02_DOWN_BLOCK0() {
	/** Ope.のBlock [Del02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0110", "Del02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

