package mcframe.serverMSBB.MSBBL6080;

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
 * [MSBBL_SloStsRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6080.SloSts_Ins01.UP.BLOCK0")){
			return MS_MSBBL6080_SloSts_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6080.SloSts_Ins02.UP.BLOCK0")){
			return MS_MSBBL6080_SloSts_Ins02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBL6080_SloSts_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6080", "SloSts_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6080_SloSts_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6080", "SloSts_Ins01",
			new MCItemDef[]{
				MCItemDef.create("slo_sts" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_sts" + ".slo_sts_typ", "slo_sts_typ"),
				MCItemDef.create("slo_sts" + ".unit_cd", "unit_cd"),
				MCItemDef.create("slo_sts" + ".qty", "qty"),
				MCItemDef.create("slo_sts" + ".cur_cd", "cur_cd"),
				MCItemDef.create("slo_sts" + ".upri", "upri"),
				MCItemDef.create("slo_sts" + ".amt", "amt"),
				MCItemDef.create("slo_sts" + ".tax_cd", "tax_cd"),
				MCItemDef.create("slo_sts" + ".tax_amt", "tax_amt"),
				MCItemDef.create("slo_sts" + ".loc_cd", "loc_cd"),
				MCItemDef.create("slo_sts" + ".ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("slo_sts" + ".alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("slo_sts" + ".slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_sts" + ".iv_no", "iv_no"),
				MCItemDef.create("slo_sts" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_sts" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("slo_sts" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("slo_sts" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("slo_sts" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("slo_sts" + ".bill_no", "bill_no"),
				MCItemDef.create("slo_sts" + ".ac_dt", "ac_dt"),
				MCItemDef.create("slo_sts" + ".biz_tm", "biz_tm"),
				MCItemDef.create("slo_sts" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("slo_sts" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("slo_sts" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("slo_sts" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("slo_sts" + ".ship_inst_no", "ship_inst_no"),
				MCItemDef.create("slo_sts" + ".ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("slo_sts" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("slo_sts" + ".sls_act_no", "sls_act_no"),
				MCItemDef.create("slo_sts" + ".sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("slo_sts" + ".po_no", "po_no"),
				MCItemDef.create("slo_sts" + ".po_d_no", "po_d_no"),
				MCItemDef.create("slo_sts" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("slo_sts" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("slo_sts" + ".wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_sts" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("slo_sts" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("slo_sts" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("slo_sts" + ".insp_no", "insp_no"),
				MCItemDef.create("slo_sts" + ".insp_act_no", "insp_act_no"),
				MCItemDef.create("slo_sts" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("slo_sts" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("slo_sts" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("slo_sts" + ".xfr_act_d_no", "xfr_act_d_no")
			}
			,
			MCBlockDef.create("SloSts_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6080_SloSts_Ins02_INFO = new MCOperationInfo("MS", "MSBBL6080", "SloSts_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6080_SloSts_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6080", "SloSts_Ins02",
			new MCItemDef[]{
				MCItemDef.create("slo_sts" + ".slo_sts_typ", "slo_sts_typ"),
				MCItemDef.create("slo_sts" + ".unit_cd", "unit_cd"),
				MCItemDef.create("slo_sts" + ".qty", "qty"),
				MCItemDef.create("slo_sts" + ".cur_cd", "cur_cd"),
				MCItemDef.create("slo_sts" + ".upri", "upri"),
				MCItemDef.create("slo_sts" + ".amt", "amt"),
				MCItemDef.create("slo_sts" + ".tax_cd", "tax_cd"),
				MCItemDef.create("slo_sts" + ".tax_amt", "tax_amt"),
				MCItemDef.create("slo_sts" + ".loc_cd", "loc_cd"),
				MCItemDef.create("slo_sts" + ".ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("slo_sts" + ".alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("slo_sts" + ".slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_sts" + ".iv_no", "iv_no"),
				MCItemDef.create("slo_sts" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_sts" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("slo_sts" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("slo_sts" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("slo_sts" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("slo_sts" + ".bill_no", "bill_no"),
				MCItemDef.create("slo_sts" + ".ac_dt", "ac_dt"),
				MCItemDef.create("slo_sts" + ".biz_tm", "biz_tm"),
				MCItemDef.create("slo_sts" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("slo_sts" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("slo_sts" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("slo_sts" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("slo_sts" + ".ship_inst_no", "ship_inst_no"),
				MCItemDef.create("slo_sts" + ".ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("slo_sts" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("slo_sts" + ".sls_act_no", "sls_act_no"),
				MCItemDef.create("slo_sts" + ".sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("slo_sts" + ".po_no", "po_no"),
				MCItemDef.create("slo_sts" + ".po_d_no", "po_d_no"),
				MCItemDef.create("slo_sts" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("slo_sts" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("slo_sts" + ".wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("slo_sts" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_sts" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("slo_sts" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("slo_sts" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("slo_sts" + ".insp_no", "insp_no"),
				MCItemDef.create("slo_sts" + ".insp_act_no", "insp_act_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("SloSts_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

