package mcframe.clientMABG.MABGP0700;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_CostSlipJnlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0700.Srch01.UP.BLOCK0")){
			return MA_MABGL0700_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0700.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0700_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0700.Upd01.UP.BLOCK0")){
			return MA_MABGL0700_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0700.Del01.UP.BLOCK0")){
			return MA_MABGL0700_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0700_Srch01_INFO = new MCOperationInfo("MA", "MABGL0700", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0700_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("summary_typ", "summary_typ"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0700_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("summary_typ", "summary_typ"),
				MCItemDef.create("summary_typ_nm", "summary_typ_nm"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("jnl_act_nm", "jnl_act_nm"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("itm_sum_flg", "itm_sum_flg"),
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
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0700_Upd01_INFO = new MCOperationInfo("MA", "MABGL0700", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0700_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("summary_typ", "summary_typ"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("itm_sum_flg", "itm_sum_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0700_Del01_INFO = new MCOperationInfo("MA", "MABGL0700", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0700_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0700", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

