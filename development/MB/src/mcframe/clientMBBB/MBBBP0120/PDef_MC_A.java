package mcframe.clientMBBB.MBBBP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBBP_JournalSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0120.Srch01.UP.BLOCK0")){
			return MB_MBBBL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0120.Srch01.DOWN.BLOCK0")){
			return MB_MBBBL0120_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL0120_Srch01_INFO = new MCOperationInfo("MB", "MBBBL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0120_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("jnl_no", "jnl_no"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("sub_ac_nm", "sub_ac_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0120_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("ac_if_typ_nm", "ac_if_typ_nm"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("jnl_no", "jnl_no"),
				MCItemDef.create("jnl_no_seq", "jnl_no_seq"),
				MCItemDef.create("dc_typ", "dc_typ"),
				MCItemDef.create("dc_typ_nm", "dc_typ_nm"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("sub_ac_nm", "sub_ac_nm"),
				MCItemDef.create("project_cd", "project_cd"),
				MCItemDef.create("summary_cd0", "summary_cd0"),
				MCItemDef.create("summary_cd1", "summary_cd1"),
				MCItemDef.create("summary_cd2", "summary_cd2"),
				MCItemDef.create("summary_cd3", "summary_cd3"),
				MCItemDef.create("summary_cd4", "summary_cd4"),
				MCItemDef.create("summary_cd5", "summary_cd5"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("bp_typ", "bp_typ"),
				MCItemDef.create("bp_typ_nm", "bp_typ_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_sum_amt", "base_cur_sum_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_sum_amt", "trd_cur_sum_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_sum_amt", "ptax_cur_sum_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_cd", "ptax_xrate_cd"),
				MCItemDef.create("ptax_xrate_nm", "ptax_xrate_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("cls_jnl_typ", "cls_jnl_typ"),
				MCItemDef.create("cls_jnl_typ_nm", "cls_jnl_typ_nm"),
				MCItemDef.create("alloc_jnl_flg", "alloc_jnl_flg"),
				MCItemDef.create("spot_flg", "spot_flg"),
				MCItemDef.create("sttl_schd_dt", "sttl_schd_dt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("other_ac_cd", "other_ac_cd"),
				MCItemDef.create("other_ac_nm", "other_ac_nm"),
				MCItemDef.create("other_sub_ac_cd", "other_sub_ac_cd"),
				MCItemDef.create("other_sub_ac_nm", "other_sub_ac_nm"),
				MCItemDef.create("other_dpt_cd", "other_dpt_cd"),
				MCItemDef.create("other_dpt_nm", "other_dpt_nm"),
				MCItemDef.create("abstract1", "abstract1"),
				MCItemDef.create("abstract2", "abstract2"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("send_flg", "send_flg"),
				MCItemDef.create("jnl_ptn", "jnl_ptn"),
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
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

