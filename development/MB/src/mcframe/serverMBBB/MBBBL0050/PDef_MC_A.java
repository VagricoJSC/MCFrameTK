package mcframe.serverMBBB.MBBBL0050;

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
 * [MBBBL_AcRcvSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0050.Srch01.UP.BLOCK0")){
			return MB_MBBBL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0050.Srch01.DOWN.BLOCK0")){
			return MB_MBBBL0050_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL0050_Srch01_INFO = new MCOperationInfo("MB", "MBBBL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0050_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0050_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_dpt_nm", "rcv_dpt_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("sub_dpt_cd1", "sub_dpt_cd1"),
				MCItemDef.create("sub_dpt_nm1", "sub_dpt_nm1"),
				MCItemDef.create("sub_dpt_cd2", "sub_dpt_cd2"),
				MCItemDef.create("sub_dpt_nm2", "sub_dpt_nm2"),
				MCItemDef.create("sub_dpt_cd3", "sub_dpt_cd3"),
				MCItemDef.create("sub_dpt_nm3", "sub_dpt_nm3"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
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
				MCItemDef.create("jnl_fin_cnt", "jnl_fin_cnt"),
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
	//FMCB DEF_CLASSES END
}

