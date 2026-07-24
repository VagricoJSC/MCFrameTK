package mcframe.clientMSBE.MSBEP1450;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_ShipActListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1450.Srch01.UP.BLOCK0")){
			return MS_MSBEL1450_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1450_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1450_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1450.Ins01.UP.BLOCK0")){
			return MS_MSBEL1450_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Ins01.UP.BLOCK1")){
			return MS_MSBEL1450_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1450.Ins01.UP.BLOCK2")){
			return MS_MSBEL1450_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1450.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1450_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Del01.UP.BLOCK0")){
			return MS_MSBEL1450_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Del01.UP.BLOCK1")){
			return MS_MSBEL1450_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1450.Del01.UP.BLOCK2")){
			return MS_MSBEL1450_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1450.Del01.DOWN.BLOCK0")){
			return MS_MSBEL1450_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1450_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1450.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1450_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1450.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1450_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL1450_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1450", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1450_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("md", "srch_mode"),
				MCItemDef.create("not_ship_flg", "not_ship_flg"),
				MCItemDef.create("ship_flg", "ship_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg"),
				MCItemDef.create("dlv_rqst_flg", "dlv_rqst_flg"),
				MCItemDef.create("ship_rqst_flg", "ship_rqst_flg"),
				MCItemDef.create("pd_inst_dlv_flg", "pd_inst_dlv_flg"),
				MCItemDef.create("dlv_not_prnted", "dlv_not_prnted"),
				MCItemDef.create("dlv_prnted", "dlv_prnted"),
				MCItemDef.create("adv_not_prnted", "adv_not_prnted"),
				MCItemDef.create("adv_prnted", "adv_prnted"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ssdt_p" + ".ymd_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ssdt_p" + ".hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ssdt_p" + ".ymd_to", "ship_schd_dt_to"),
				MCItemDef.create("ssdt_p" + ".hm_to", "ship_schd_hm_to"),
				MCItemDef.create("sidt_p" + ".ymd_fr", "ship_inst_dt_fr"),
				MCItemDef.create("sidt_p" + ".hm_fr", "ship_inst_hm_fr"),
				MCItemDef.create("sidt_p" + ".ymd_to", "ship_inst_dt_to"),
				MCItemDef.create("sidt_p" + ".hm_to", "ship_inst_hm_to"),
				MCItemDef.create("sdt_p" + ".ymd_fr", "ship_dt_fr"),
				MCItemDef.create("sdt_p" + ".hm_fr", "ship_hm_fr"),
				MCItemDef.create("sdt_p" + ".ymd_to", "ship_dt_to"),
				MCItemDef.create("sdt_p" + ".hm_to", "ship_hm_to"),
				MCItemDef.create("dsdt_p" + ".ymd_fr", "dlv_schd_dt_fr"),
				MCItemDef.create("dsdt_p" + ".hm_fr", "dlv_schd_hm_fr"),
				MCItemDef.create("dsdt_p" + ".ymd_to", "dlv_schd_dt_to"),
				MCItemDef.create("dsdt_p" + ".hm_to", "dlv_schd_hm_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("can_disp_flg", "can_disp_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
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


	public static MCContainerDef MS_MSBEL1450_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ship_p" + ".ymd", "ship_dt"),
				MCItemDef.create("ship_p" + ".hm", "ship_hm"),
				MCItemDef.create("dlv_p" + ".ymd", "dlv_dt"),
				MCItemDef.create("dlv_p" + ".hm", "dlv_hm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ship_inst_p" + ".ymd", "ship_inst_dt"),
				MCItemDef.create("ship_inst_p" + ".hm", "ship_inst_hm"),
				MCItemDef.create("ship_schd_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ship_schd_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_p" + ".bp_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_p" + ".bp_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("ship_to_p" + ".dlv_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_p" + ".dlv_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("ver_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "inst_qty"),
				MCItemDef.create("act_cont_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("dlv_rqst_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("pd_inst_dlv_p" + ".ymd", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_p" + ".hm", "pd_inst_dlv_hm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlv_day_week_typ_nm", "dlv_day_week_typ_nm"),
				MCItemDef.create("ship_rqst_p" + ".ymd", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_p" + ".hm", "ship_rqst_hm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_p" + ".str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("ship_str_ln_p" + ".str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("d_cnt", "d_cnt"),
				MCItemDef.create("wt", "wt"),
				MCItemDef.create("dim", "dim"),
				MCItemDef.create("slip_cnt", "slip_cnt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ship_inst_disp_seq", "ship_inst_disp_seq"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "act_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "act_dpt_nm"),
				MCItemDef.create("dlv_prnted_flg", "dlv_prnted_flg"),
				MCItemDef.create("adv_prnted_flg", "adv_prnted_flg"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("can_flg", "can_flg"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBEL1450_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1450_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1450", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1450_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_p" + ".ymd", "ship_tm"),
				MCItemDef.create("dlv_p" + ".ymd", "dlv_tm"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "act_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "act_dpt_cd"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1450_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1450_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("not_wms_flg", "not_wms_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1450_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("ship_act_no", "ship_act_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1450_Del01_INFO = new MCOperationInfo("MS", "MSBEL1450", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1450_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt_p" + ".ac_dt", "can_ac_dt"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1450_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1450_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1450_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1450_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1450", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1450_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("adv_prnt_flg", "adv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1450_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BulkSet")
		);
	}


	public static MCContainerDef MS_MSBEL1450_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1450", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

