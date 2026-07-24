package mcframe.clientMSBB.MSBBP1260;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_SloPrmsListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1260.Srch01.UP.BLOCK0")){
			return MS_MSBBL1260_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1260_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Srch02.UP.BLOCK0")){
			return MS_MSBBL1260_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Srch02.DOWN.BLOCK0")){
			return MS_MSBBL1260_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Upd01.UP.BLOCK0")){
			return MS_MSBBL1260_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Upd01.UP.BLOCK1")){
			return MS_MSBBL1260_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1260.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1260_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Del01.UP.BLOCK0")){
			return MS_MSBBL1260_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Del01.UP.BLOCK1")){
			return MS_MSBBL1260_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1260.Del01.DOWN.BLOCK0")){
			return MS_MSBBL1260_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1260_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1260.Prnt01.UP.BLOCK1")){
			return MS_MSBBL1260_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1260.Prnt01.DOWN.BLOCK0")){
			return MS_MSBBL1260_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBBL1260_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1260", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1260_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("not_edi_flg", "not_edi_flg"),
				MCItemDef.create("not_prms_flg", "not_prms_flg"),
				MCItemDef.create("prms_flg", "prms_flg"),
				MCItemDef.create("prms_not_prnted", "prms_not_prnted"),
				MCItemDef.create("prms_prnted", "prms_prnted"),
				MCItemDef.create("slo_dt_fr", "slo_dt_fr"),
				MCItemDef.create("slo_dt_to", "slo_dt_to"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd_fr", "dlv_inst_dt_fr"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm_fr", "dlv_inst_hm_fr"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd_to", "dlv_inst_dt_to"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm_to", "dlv_inst_hm_to"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd_fr", "ship_rqst_dt_fr"),
				MCItemDef.create("ship_rqst_dt_p" + ".hm_fr", "ship_rqst_hm_fr"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd_to", "ship_rqst_dt_to"),
				MCItemDef.create("ship_rqst_dt_p" + ".hm_to", "ship_rqst_hm_to"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd_fr", "pd_inst_dlv_dt_fr"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".hm_fr", "pd_inst_dlv_hm_fr"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd_to", "pd_inst_dlv_dt_to"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".hm_to", "pd_inst_dlv_hm_to"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_dt_p" + ".hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_dt_p" + ".hm_to", "ship_schd_hm_to"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd_fr", "dlv_schd_dt_fr"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm_fr", "dlv_schd_hm_fr"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd_to", "dlv_schd_dt_to"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm_to", "dlv_schd_hm_to"),
				MCItemDef.create("prms_dt_p" + ".ymd_fr", "prms_dt_fr"),
				MCItemDef.create("prms_dt_p" + ".hm_fr", "prms_hm_fr"),
				MCItemDef.create("prms_dt_p" + ".ymd_to", "prms_dt_to"),
				MCItemDef.create("prms_dt_p" + ".hm_to", "prms_hm_to"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1260_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "sls_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("slo_trd_unit_cd", "slo_trd_unit_cd"),
				MCItemDef.create("slo_trd_unit_nm", "slo_trd_unit_nm"),
				MCItemDef.create("slo_trd_unit_dec_place", "slo_trd_unit_dec_place"),
				MCItemDef.create("slo_trd_unit_qty_p" + ".qty", "slo_trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("dlv_inst_qty_p" + ".qty", "dlv_inst_qty"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm", "dlv_inst_hm"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_dt_p" + ".hm", "ship_rqst_hm"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".hm", "pd_inst_dlv_hm"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ship_schd_dt_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_dt_p" + ".hm", "prms_dlv_hm"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("last_edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("edi_send_flg", "edi_send_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
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
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("after_exec_flg", "after_exec_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1260_Srch02_INFO = new MCOperationInfo("MS", "MSBBL1260", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1260_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("not_edi_flg", "not_edi_flg"),
				MCItemDef.create("not_prms_flg", "not_prms_flg"),
				MCItemDef.create("prms_flg", "prms_flg"),
				MCItemDef.create("prms_not_prnted", "prms_not_prnted"),
				MCItemDef.create("prms_prnted", "prms_prnted"),
				MCItemDef.create("slo_dt_fr", "slo_dt_fr"),
				MCItemDef.create("slo_dt_to", "slo_dt_to"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd_fr", "dlv_inst_dt_fr"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm_fr", "dlv_inst_hm_fr"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd_to", "dlv_inst_dt_to"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm_to", "dlv_inst_hm_to"),
				MCItemDef.create("prms_dt_p" + ".ymd_fr", "prms_dt_fr"),
				MCItemDef.create("prms_dt_p" + ".hm_fr", "prms_hm_fr"),
				MCItemDef.create("prms_dt_p" + ".ymd_to", "prms_dt_to"),
				MCItemDef.create("prms_dt_p" + ".hm_to", "prms_hm_to"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("incl_can_flg", "incl_can_flg"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1260_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "sls_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("slo_trd_unit_cd", "slo_trd_unit_cd"),
				MCItemDef.create("slo_trd_unit_nm", "slo_trd_unit_nm"),
				MCItemDef.create("slo_trd_unit_dec_place", "slo_trd_unit_dec_place"),
				MCItemDef.create("slo_trd_unit_qty_p" + ".qty", "slo_trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("dlv_inst_qty_p" + ".qty", "dlv_inst_qty"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm", "dlv_inst_hm"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_dt_p" + ".hm", "prms_dlv_hm"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("last_edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("edi_send_flg", "edi_send_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
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
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("after_exec_flg", "after_exec_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1260_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1260", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1260_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_tm"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd", "pd_inst_dlv_tm"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_tm"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBBL1260_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBBL1260_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1260_Del01_INFO = new MCOperationInfo("MS", "MSBBL1260", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1260_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Del01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_tm"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd", "pd_inst_dlv_tm"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_tm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_tm"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBBL1260_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Del01",
			new MCItemDef[]{
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBBL1260_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Del01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("org_slo_prms_h_no", "org_slo_prms_h_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1260_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1260", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1260_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBBL1260_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBBL1260_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1260", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

