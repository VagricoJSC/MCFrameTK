package mcframe.serverMSLA.MSLAL7120;

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
 * [MSLAL_SloRecvConvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv01.UP.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv01.DOWN.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv02.UP.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv02.DOWN.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv03.UP.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv03.UP.BLOCK1")){
			return MS_MSLAL7120_SloRecvConv_Conv03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL7120.SloRecvConv_Conv03.DOWN.BLOCK0")){
			return MS_MSLAL7120_SloRecvConv_Conv03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSLAL7120_SloRecvConv_Conv01_INFO = new MCOperationInfo("MS", "MSLAL7120", "SloRecvConv_Conv01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7120_SloRecvConv_Conv02_INFO = new MCOperationInfo("MS", "MSLAL7120", "SloRecvConv_Conv02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7120_SloRecvConv_Conv03_INFO = new MCOperationInfo("MS", "MSLAL7120", "SloRecvConv_Conv03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv03",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("trd_typ_cd", "trd_typ_cd"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("po_crud_typ", "po_crud_typ"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_co_cd", "po_co_cd"),
				MCItemDef.create("po_co_nm", "po_co_nm"),
				MCItemDef.create("po_co_cntry_cd", "po_co_cntry_cd"),
				MCItemDef.create("slo_co_cd", "slo_co_cd"),
				MCItemDef.create("slo_co_nm", "slo_co_nm"),
				MCItemDef.create("slo_co_cntry_cd", "slo_co_cntry_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("crct_rsn_nm", "crct_rsn_nm"),
				MCItemDef.create("crct_rsn_rmrks", "crct_rsn_rmrks"),
				MCItemDef.create("po_print_txt", "po_print_txt"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("po_co_itm_cd", "po_co_itm_cd"),
				MCItemDef.create("po_co_itm_sub1", "po_co_itm_sub1"),
				MCItemDef.create("po_co_itm_sub2", "po_co_itm_sub2"),
				MCItemDef.create("po_co_itm_sub3", "po_co_itm_sub3"),
				MCItemDef.create("po_co_itm_nm", "po_co_itm_nm"),
				MCItemDef.create("po_co_iv_itm_nm", "po_co_iv_itm_nm"),
				MCItemDef.create("po_co_sundry_itm_flg", "po_co_sundry_itm_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("drct_dlv_flg", "drct_dlv_flg"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("in_to_id_typ", "in_to_id_typ"),
				MCItemDef.create("in_to_id_cd", "in_to_id_cd"),
				MCItemDef.create("in_to_nm", "in_to_nm"),
				MCItemDef.create("in_to_zip_cd", "in_to_zip_cd"),
				MCItemDef.create("in_to_addr1", "in_to_addr1"),
				MCItemDef.create("in_to_addr2", "in_to_addr2"),
				MCItemDef.create("in_to_addr3", "in_to_addr3"),
				MCItemDef.create("in_to_addr4", "in_to_addr4"),
				MCItemDef.create("in_to_cntct_dpt", "in_to_cntct_dpt"),
				MCItemDef.create("in_to_cntct_psn", "in_to_cntct_psn"),
				MCItemDef.create("in_to_tel", "in_to_tel"),
				MCItemDef.create("in_to_fax", "in_to_fax"),
				MCItemDef.create("in_to_sundry_flg", "in_to_sundry_flg"),
				MCItemDef.create("in_to_cntry_cd", "in_to_cntry_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("drct_dlv_bp_cd", "drct_dlv_bp_cd"),
				MCItemDef.create("drct_dlv_bp_nm", "drct_dlv_bp_nm"),
				MCItemDef.create("drct_dlv_cntry_cd", "drct_dlv_cntry_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("dschrg_port_nm", "dschrg_port_nm"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_port_nm", "via_port_nm"),
				MCItemDef.create("slo_co_itm_cd", "slo_co_itm_cd"),
				MCItemDef.create("slo_co_itm_sub1", "slo_co_itm_sub1"),
				MCItemDef.create("slo_co_itm_sub2", "slo_co_itm_sub2"),
				MCItemDef.create("slo_co_itm_sub3", "slo_co_itm_sub3"),
				MCItemDef.create("slo_co_itm_nm", "slo_co_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ship_wh_cd", "ship_wh_cd"),
				MCItemDef.create("ship_wh_nm", "ship_wh_nm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
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
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL7120_SloRecvConv_Conv03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7120", "SloRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

