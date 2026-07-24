package mcframe.clientMABC.MABCP1070;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_AutoJnlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1070.Srch01.UP.BLOCK0")){
			return MA_MABCL1070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1070.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1070_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1070.Upd01.UP.BLOCK0")){
			return MA_MABCL1070_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1070.Del01.UP.BLOCK0")){
			return MA_MABCL1070_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL1070_Srch01_INFO = new MCOperationInfo("MA", "MABCL1070", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1070_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("no_auto_jnl_key_flg", "no_auto_jnl_key_flg"),
				MCItemDef.create("auto_jnl_grp", "auto_jnl_grp"),
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("dt_p" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt_p" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt_p" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt_p" + ".end_dt_to", "end_dt_to"),
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


	public static MCContainerDef MA_MABCL1070_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_key_nm", "auto_jnl_key_nm"),
				MCItemDef.create("auto_jnl_grp", "auto_jnl_grp"),
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("jnl_ptn_nm", "jnl_ptn_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("ac_if_typ_nm", "ac_if_typ_nm"),
				MCItemDef.create("id_typ", "id_typ"),
				MCItemDef.create("id_typ_nm", "id_typ_nm"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("std_rnd_typ_nm", "std_rnd_typ_nm"),
				MCItemDef.create("cls_jnl_typ", "cls_jnl_typ"),
				MCItemDef.create("cls_jnl_typ_nm", "cls_jnl_typ_nm"),
				MCItemDef.create("compound_jnl_typ", "compound_jnl_typ"),
				MCItemDef.create("compound_jnl_typ_nm", "compound_jnl_typ_nm"),
				MCItemDef.create("alloc_jnl_flg", "alloc_jnl_flg"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("rev_flg", "rev_flg"),
				MCItemDef.create("minus_rev_flg", "minus_rev_flg"),
				MCItemDef.create("default_flg", "default_flg"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abs_typ_nm", "abs_typ_nm"),
				MCItemDef.create("abstract1", "abstract1"),
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
	
	static final MCOperationInfo MA_MABCL1070_Upd01_INFO = new MCOperationInfo("MA", "MABCL1070", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1070_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_grp", "auto_jnl_grp"),
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("id_typ", "id_typ"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("cls_jnl_typ", "cls_jnl_typ"),
				MCItemDef.create("compound_jnl_typ", "compound_jnl_typ"),
				MCItemDef.create("alloc_jnl_flg", "alloc_jnl_flg"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("rev_flg", "rev_flg"),
				MCItemDef.create("minus_rev_flg", "minus_rev_flg"),
				MCItemDef.create("default_flg", "default_flg"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abstract1", "abstract1"),
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
	
	static final MCOperationInfo MA_MABCL1070_Del01_INFO = new MCOperationInfo("MA", "MABCL1070", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1070_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("auto_jnl_grp", "auto_jnl_grp"),
				MCItemDef.create("jnl_ptn_cd", "jnl_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

