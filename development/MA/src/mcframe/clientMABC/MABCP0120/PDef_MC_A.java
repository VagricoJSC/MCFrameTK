package mcframe.clientMABC.MABCP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_AprvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0120.Srch01.UP.BLOCK0")){
			return MA_MABCL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0120.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0120.Sprt01.UP.BLOCK0")){
			return MA_MABCL0120_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0120.Sprt01.DOWN.BLOCK0")){
			return MA_MABCL0120_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0120.Upd01.UP.BLOCK0")){
			return MA_MABCL0120_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0120.Del01.UP.BLOCK0")){
			return MA_MABCL0120_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0120_Srch01_INFO = new MCOperationInfo("MA", "MABCL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0120_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt_p" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt_p" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt_p" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_rt_ptn", "aprv_rt_ptn"),
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


	public static MCContainerDef MA_MABCL0120_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_func_typ_nm", "aprv_func_typ_nm"),
				MCItemDef.create("aprv_row_num", "aprv_row_num"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("aprv_rt_ptn", "aprv_rt_ptn"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_del_flg", "aprv_del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_typ_nm", "itm_grp_typ_nm"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_grp_typ", "bp_grp_typ"),
				MCItemDef.create("bp_grp_typ_nm", "bp_grp_typ_nm"),
				MCItemDef.create("bp_grp_cd", "bp_grp_cd"),
				MCItemDef.create("bp_grp_nm", "bp_grp_nm"),
				MCItemDef.create("cur_cd1", "cur_cd1"),
				MCItemDef.create("cur_nm1", "cur_nm1"),
				MCItemDef.create("val_min1", "val_min1"),
				MCItemDef.create("val_max1", "val_max1"),
				MCItemDef.create("bind_cond1", "bind_cond1"),
				MCItemDef.create("bind_cond1_nm", "bind_cond1_nm"),
				MCItemDef.create("cur_cd2", "cur_cd2"),
				MCItemDef.create("cur_nm2", "cur_nm2"),
				MCItemDef.create("val_min2", "val_min2"),
				MCItemDef.create("val_max2", "val_max2"),
				MCItemDef.create("bind_cond2", "bind_cond2"),
				MCItemDef.create("bind_cond2_nm", "bind_cond2_nm"),
				MCItemDef.create("cur_cd3", "cur_cd3"),
				MCItemDef.create("cur_nm3", "cur_nm3"),
				MCItemDef.create("val_min3", "val_min3"),
				MCItemDef.create("val_max3", "val_max3"),
				MCItemDef.create("ext_key1", "ext_key1"),
				MCItemDef.create("ext_key2", "ext_key2"),
				MCItemDef.create("ext_key3", "ext_key3"),
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
	
	static final MCOperationInfo MA_MABCL0120_Sprt01_INFO = new MCOperationInfo("MA", "MABCL0120", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0120_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_row_num", "aprv_row_num"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("aprv_rt_ptn", "aprv_rt_ptn"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_del_flg", "aprv_del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_grp_typ", "bp_grp_typ"),
				MCItemDef.create("bp_grp_cd", "bp_grp_cd"),
				MCItemDef.create("bp_grp_nm", "bp_grp_nm"),
				MCItemDef.create("cur_cd1", "cur_cd1"),
				MCItemDef.create("cur_nm1", "cur_nm1"),
				MCItemDef.create("val_min1", "val_min1"),
				MCItemDef.create("val_max1", "val_max1"),
				MCItemDef.create("bind_cond1", "bind_cond1"),
				MCItemDef.create("cur_cd2", "cur_cd2"),
				MCItemDef.create("cur_nm2", "cur_nm2"),
				MCItemDef.create("val_min2", "val_min2"),
				MCItemDef.create("val_max2", "val_max2"),
				MCItemDef.create("bind_cond2", "bind_cond2"),
				MCItemDef.create("cur_cd3", "cur_cd3"),
				MCItemDef.create("cur_nm3", "cur_nm3"),
				MCItemDef.create("val_min3", "val_min3"),
				MCItemDef.create("val_max3", "val_max3"),
				MCItemDef.create("ext_key1", "ext_key1"),
				MCItemDef.create("ext_key2", "ext_key2"),
				MCItemDef.create("ext_key3", "ext_key3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABCL0120_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_func_typ_nm", "aprv_func_typ_nm"),
				MCItemDef.create("aprv_row_num", "aprv_row_num"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("aprv_rt_ptn", "aprv_rt_ptn"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_del_flg", "aprv_del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_typ_nm", "itm_grp_typ_nm"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_grp_typ", "bp_grp_typ"),
				MCItemDef.create("bp_grp_typ_nm", "bp_grp_typ_nm"),
				MCItemDef.create("bp_grp_cd", "bp_grp_cd"),
				MCItemDef.create("bp_grp_nm", "bp_grp_nm"),
				MCItemDef.create("cur_cd1", "cur_cd1"),
				MCItemDef.create("cur_nm1", "cur_nm1"),
				MCItemDef.create("val_min1", "val_min1"),
				MCItemDef.create("val_max1", "val_max1"),
				MCItemDef.create("bind_cond1", "bind_cond1"),
				MCItemDef.create("bind_cond1_nm", "bind_cond1_nm"),
				MCItemDef.create("cur_cd2", "cur_cd2"),
				MCItemDef.create("cur_nm2", "cur_nm2"),
				MCItemDef.create("val_min2", "val_min2"),
				MCItemDef.create("val_max2", "val_max2"),
				MCItemDef.create("bind_cond2", "bind_cond2"),
				MCItemDef.create("bind_cond2_nm", "bind_cond2_nm"),
				MCItemDef.create("cur_cd3", "cur_cd3"),
				MCItemDef.create("cur_nm3", "cur_nm3"),
				MCItemDef.create("val_min3", "val_min3"),
				MCItemDef.create("val_max3", "val_max3"),
				MCItemDef.create("ext_key1", "ext_key1"),
				MCItemDef.create("ext_key2", "ext_key2"),
				MCItemDef.create("ext_key3", "ext_key3"),
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
	
	static final MCOperationInfo MA_MABCL0120_Upd01_INFO = new MCOperationInfo("MA", "MABCL0120", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0120_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_row_num", "aprv_row_num"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("aprv_rt_ptn", "aprv_rt_ptn"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_del_flg", "aprv_del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_grp_typ", "bp_grp_typ"),
				MCItemDef.create("bp_grp_cd", "bp_grp_cd"),
				MCItemDef.create("cur_cd1", "cur_cd1"),
				MCItemDef.create("val_min1", "val_min1"),
				MCItemDef.create("val_max1", "val_max1"),
				MCItemDef.create("bind_cond1", "bind_cond1"),
				MCItemDef.create("cur_cd2", "cur_cd2"),
				MCItemDef.create("val_min2", "val_min2"),
				MCItemDef.create("val_max2", "val_max2"),
				MCItemDef.create("bind_cond2", "bind_cond2"),
				MCItemDef.create("cur_cd3", "cur_cd3"),
				MCItemDef.create("val_min3", "val_min3"),
				MCItemDef.create("val_max3", "val_max3"),
				MCItemDef.create("ext_key1", "ext_key1"),
				MCItemDef.create("ext_key2", "ext_key2"),
				MCItemDef.create("ext_key3", "ext_key3"),
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
	
	static final MCOperationInfo MA_MABCL0120_Del01_INFO = new MCOperationInfo("MA", "MABCL0120", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0120_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0120", "Del01",
			new MCItemDef[]{
				MCItemDef.create("aprv_func_typ", "aprv_func_typ"),
				MCItemDef.create("aprv_row_num", "aprv_row_num"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

