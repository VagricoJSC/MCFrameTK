package mcframe.serverMSBG.MSBGL5010;

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
 * [MSBGL_ArCmnService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5010.ArCmn_Upd01.UP.BLOCK0")){
			return MS_MSBGL5010_ArCmn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5010.ArCmn_Upd01.UP.BLOCK1")){
			return MS_MSBGL5010_ArCmn_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL5010_ArCmn_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5010", "ArCmn_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5010_ArCmn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5010", "ArCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("inpt_ac_dt", "inpt_ac_dt"),
				MCItemDef.create("inpt_ac_ym", "inpt_ac_ym"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_iv_no", "bill_iv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_amt1", "trd_cur_amt1"),
				MCItemDef.create("trd_cur_amt2", "trd_cur_amt2"),
				MCItemDef.create("trd_cur_amt3", "trd_cur_amt3"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_amt1", "base_cur_amt1"),
				MCItemDef.create("base_cur_amt2", "base_cur_amt2"),
				MCItemDef.create("base_cur_amt3", "base_cur_amt3"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("par_act_no", "par_act_no"),
				MCItemDef.create("par_act_seq", "par_act_seq"),
				MCItemDef.create("bill_d_typ", "bill_d_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("tgt_flg", "tgt_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("bill_cl_dt", "bill_cl_dt"),
				MCItemDef.create("bill_d_no", "bill_d_no")
			}
			,
			MCBlockDef.create("ArCmn_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL5010_ArCmn_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5010", "ArCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ar_ope_typ", "ar_ope_typ")
			}
			,
			MCBlockDef.create("ArCmn_Upd01_OpeTyp")
		);
	}


	//FMCB DEF_CLASSES END
}

