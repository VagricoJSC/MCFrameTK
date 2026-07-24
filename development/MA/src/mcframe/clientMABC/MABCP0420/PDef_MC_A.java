package mcframe.clientMABC.MABCP0420;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_BpSubReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0420.Srch01.UP.BLOCK0")){
			return MA_MABCL0420_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0420.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0420_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0420.Sprt01.UP.BLOCK0")){
			return MA_MABCL0420_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0420.Sprt01.DOWN.BLOCK0")){
			return MA_MABCL0420_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0420.Upd01.UP.BLOCK0")){
			return MA_MABCL0420_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0420.Del01.UP.BLOCK0")){
			return MA_MABCL0420_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0420_Srch01_INFO = new MCOperationInfo("MA", "MABCL0420", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0420_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt_p" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt_p" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt_p" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("new_st_dt", "new_st_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bcst_dpt_nm", "bcst_dpt_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("vmi_purc_dpt_nm", "vmi_purc_dpt_nm"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("tax_abl_only_flg", "tax_abl_only_flg"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("dlv_flg", "dlv_flg"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("cred_flg", "cred_flg"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("maker_flg", "maker_flg"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0420_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("dlv_flg", "dlv_flg"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("cred_flg", "cred_flg"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("maker_flg", "maker_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_nm1", "sls_anly_nm1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_nm2", "sls_anly_nm2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("sls_anly_nm3", "sls_anly_nm3"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bcst_dpt_nm", "bcst_dpt_nm"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("vmi_purc_dpt_nm", "vmi_purc_dpt_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_cntct_psn_title", "dlv_cntct_psn_title"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
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
	
	static final MCOperationInfo MA_MABCL0420_Sprt01_INFO = new MCOperationInfo("MA", "MABCL0420", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0420_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("dlv_flg", "dlv_flg"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("cred_flg", "cred_flg"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("maker_flg", "maker_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_nm1", "sls_anly_nm1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_nm2", "sls_anly_nm2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("sls_anly_nm3", "sls_anly_nm3"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bcst_dpt_nm", "bcst_dpt_nm"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("vmi_purc_dpt_nm", "vmi_purc_dpt_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_cntct_psn_title", "dlv_cntct_psn_title"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABCL0420_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("dlv_flg", "dlv_flg"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("cred_flg", "cred_flg"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("maker_flg", "maker_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_nm1", "sls_anly_nm1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_nm2", "sls_anly_nm2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("sls_anly_nm3", "sls_anly_nm3"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bcst_dpt_nm", "bcst_dpt_nm"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("vmi_purc_dpt_nm", "vmi_purc_dpt_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_cntct_psn_title", "dlv_cntct_psn_title"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
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
	
	static final MCOperationInfo MA_MABCL0420_Upd01_INFO = new MCOperationInfo("MA", "MABCL0420", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0420_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_cntct_psn_title", "dlv_cntct_psn_title"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0420_Del01_INFO = new MCOperationInfo("MA", "MABCL0420", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0420_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0420", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

