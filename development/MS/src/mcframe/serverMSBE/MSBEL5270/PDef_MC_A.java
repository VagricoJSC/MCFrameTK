package mcframe.serverMSBE.MSBEL5270;

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
 * [MSBEL_ProvActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5270.ProvAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL5270_ProvAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5270.ProvAct_Chk01.UP.BLOCK1")){
			return MS_MSBEL5270_ProvAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5270.ProvAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5270_ProvAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5270.ProvAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL5270_ProvAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5270.ProvAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL5270_ProvAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5270.ProvAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5270_ProvAct_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL5270_ProvAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5270", "ProvAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5270_ProvAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("accpt_dt", "accpt_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("prov_src_act_no", "prov_src_act_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("arr_act_no", "arr_act_no")
			}
			,
			MCBlockDef.create("ProvActChk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5270_ProvAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("upd_flg", "upd_flg"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ProvActUpd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5270_ProvAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ProvActChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5270_ProvAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5270", "ProvAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5270_ProvAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("not_completion_flg", "not_completion_flg"),
				MCItemDef.create("pa" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("pa" + ".prov_act_no", "prov_act_no"),
				MCItemDef.create("pa" + ".prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("pa" + ".prov_src_act_no", "prov_src_act_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("pa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("pa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pa" + ".xfr_rsn_cd", "xfr_rsn_cd"),
				MCItemDef.create("pa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pa" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pa" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pa" + ".accpt_dt", "accpt_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pa" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("pa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".prsppl_cd", "prsppl_cd"),
				MCItemDef.create("pa" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pa" + ".prov_typ", "prov_typ"),
				MCItemDef.create("pa" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pa" + ".tax_cd", "tax_cd"),
				MCItemDef.create("pa" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pa" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pa" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pa" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pa" + ".loc_cd", "loc_cd"),
				MCItemDef.create("pa" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pa" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("pa" + ".lot_no", "lot_no"),
				MCItemDef.create("pa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("pa" + ".sno1", "sno1"),
				MCItemDef.create("pa" + ".sno2", "sno2"),
				MCItemDef.create("pa" + ".sno3", "sno3"),
				MCItemDef.create("pa" + ".sno4", "sno4"),
				MCItemDef.create("pa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("pa" + ".quality_typ", "quality_typ"),
				MCItemDef.create("pa" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("pa" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pa" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pa" + ".base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("ProvActUpd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5270_ProvAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("upd_flg", "upd_flg"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ProvActUpd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5270_ProvAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5270", "ProvAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pa" + ".prov_act_no", "prov_act_no"),
				MCItemDef.create("pa" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("pa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("pa" + ".prov_typ", "prov_typ"),
				MCItemDef.create("pa" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("pa" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("pa" + ".stk_bp_cd", "stk_bp_cd")
			}
			,
			MCBlockDef.create("ProvActUpd01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

