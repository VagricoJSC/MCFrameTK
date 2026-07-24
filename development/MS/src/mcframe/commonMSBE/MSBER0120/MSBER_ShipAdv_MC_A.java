package mcframe.commonMSBE.MSBER0120;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_ShipAdv_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0120";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass SHIPADVHDRR_RC = new MCReportClass("ShipAdvHdr", mcframe.commonMSBE.MSBER0120.ShipAdvHdrR.class);
	static public final MCReportClass SHIPADVDTLL_RC = new MCReportClass("ShipAdvDtl", mcframe.commonMSBE.MSBER0120.ShipAdvDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		SHIPADVHDRR_RC,
		SHIPADVDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_nm_META_0 = new MCReportMeta("slip_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_0 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta adjst_slip_flg_META_0 = new MCReportMeta("adjst_slip_flg", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_rev_META_0 = new MCReportMeta("dlv_slip_rev", "", "", "", true);
	static public final MCReportMeta ship_dt_META_0 = new MCReportMeta("ship_dt", "YMD", "", "", true);
	static public final MCReportMeta lg_grp_nm_META_0 = new MCReportMeta("lg_grp_nm", "", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);
	static public final MCReportMeta ship_dpt_cd_META_0 = new MCReportMeta("ship_dpt_cd", "", "", "", true);
	static public final MCReportMeta ship_dpt_nm_META_0 = new MCReportMeta("ship_dpt_nm", "", "", "", true);
	static public final MCReportMeta ship_usr_cd_META_0 = new MCReportMeta("ship_usr_cd", "", "", "", true);
	static public final MCReportMeta ship_usr_nm_META_0 = new MCReportMeta("ship_usr_nm", "", "", "", true);
	static public final MCReportMeta cst_po_no_lbl_META_0 = new MCReportMeta("cst_po_no_lbl", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_0 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta ship_to_id_typ_META_0 = new MCReportMeta("ship_to_id_typ", "", "", "", true);
	static public final MCReportMeta ship_to_id_nm_META_0 = new MCReportMeta("ship_to_id_nm", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm1_META_0 = new MCReportMeta("ship_to_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm2_META_0 = new MCReportMeta("ship_to_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm3_META_0 = new MCReportMeta("ship_to_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm4_META_0 = new MCReportMeta("ship_to_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta ship_to_id_cd_META_0 = new MCReportMeta("ship_to_id_cd", "", "", "", true);
	static public final MCReportMeta ship_to_zip_cd_META_0 = new MCReportMeta("ship_to_zip_cd", "", "", "", true);
	static public final MCReportMeta ship_to_addr1_META_0 = new MCReportMeta("ship_to_addr1", "", "", "", true);
	static public final MCReportMeta ship_to_addr2_META_0 = new MCReportMeta("ship_to_addr2", "", "", "", true);
	static public final MCReportMeta ship_to_addr3_META_0 = new MCReportMeta("ship_to_addr3", "", "", "", true);
	static public final MCReportMeta ship_to_addr4_META_0 = new MCReportMeta("ship_to_addr4", "", "", "", true);
	static public final MCReportMeta ship_to_addr_META_0 = new MCReportMeta("ship_to_addr", "", "", "", true);
	static public final MCReportMeta ship_to_tel_META_0 = new MCReportMeta("ship_to_tel", "", "", "", true);
	static public final MCReportMeta ship_to_fax_META_0 = new MCReportMeta("ship_to_fax", "", "", "", true);
	static public final MCReportMeta ship_to_cntct_dpt_META_0 = new MCReportMeta("ship_to_cntct_dpt", "", "", "", true);
	static public final MCReportMeta ship_to_cntct_psn_META_0 = new MCReportMeta("ship_to_cntct_psn", "", "", "", true);
	static public final MCReportMeta ship_to_cntct_psn_title_META_0 = new MCReportMeta("ship_to_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta ship_to_cntry_nm_META_0 = new MCReportMeta("ship_to_cntry_nm", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta addr_META_0 = new MCReportMeta("addr", "", "", "", true);
	static public final MCReportMeta tel_META_0 = new MCReportMeta("tel", "", "", "", true);
	static public final MCReportMeta fax_META_0 = new MCReportMeta("fax", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_cd_META_0 = new MCReportMeta("dpt_cd", "", "", "", true);
	static public final MCReportMeta usr_nm_META_0 = new MCReportMeta("usr_nm", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta cntry_nm_META_0 = new MCReportMeta("cntry_nm", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta sno1_META_1 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_1 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_1 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_1 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta lot_plural_flg_META_1 = new MCReportMeta("lot_plural_flg", "", "", "", true);
	static public final MCReportMeta s_lot_plural_flg_META_1 = new MCReportMeta("s_lot_plural_flg", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_plural_flg_META_1 = new MCReportMeta("sublot_plural_flg", "", "", "", true);
	static public final MCReportMeta s_sublot_plural_flg_META_1 = new MCReportMeta("s_sublot_plural_flg", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_1 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_1 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_1 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("ShipAdvHdr",
			prnt_tm_META_0,
			trd_nm_META_0,
			trd_cd_META_0,
			trd_ptn_typ_META_0,
			slip_sts_typ_nm_META_0,
			slip_sts_typ_META_0,
			adjst_slip_flg_META_0,
			dlv_slip_no_META_0,
			dlv_slip_rev_META_0,
			ship_dt_META_0,
			lg_grp_nm_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0,
			ship_dpt_cd_META_0,
			ship_dpt_nm_META_0,
			ship_usr_cd_META_0,
			ship_usr_nm_META_0,
			cst_po_no_lbl_META_0,
			cst_po_no_META_0,
			ship_to_id_typ_META_0,
			ship_to_id_nm_META_0,
			ship_to_id_alt_nm1_META_0,
			ship_to_id_alt_nm2_META_0,
			ship_to_id_alt_nm3_META_0,
			ship_to_id_alt_nm4_META_0,
			ship_to_id_cd_META_0,
			ship_to_zip_cd_META_0,
			ship_to_addr1_META_0,
			ship_to_addr2_META_0,
			ship_to_addr3_META_0,
			ship_to_addr4_META_0,
			ship_to_addr_META_0,
			ship_to_tel_META_0,
			ship_to_fax_META_0,
			ship_to_cntct_dpt_META_0,
			ship_to_cntct_psn_META_0,
			ship_to_cntct_psn_title_META_0,
			ship_to_cntry_nm_META_0,
			co_nm_META_0,
			zip_cd_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			addr_META_0,
			tel_META_0,
			fax_META_0,
			dpt_nm_META_0,
			dpt_cd_META_0,
			usr_nm_META_0,
			usr_cd_META_0,
			cntry_nm_META_0,
			trd_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("ShipAdvDtl",
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_view_META_1,
			itm_sub2_data_META_1,
			itm_sub3_view_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			sno1_META_1,
			sno2_META_1,
			sno3_META_1,
			sno4_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			lot_plural_flg_META_1,
			s_lot_plural_flg_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
			sublot_plural_flg_META_1,
			s_sublot_plural_flg_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			trd_unit_nm_META_1,
			trd_unit_cd_META_1,
			base_unit_nm_META_1,
			base_unit_cd_META_1,
			trd_d_rmrks_META_1,
			dlv_slip_d_no_META_1,
			cst_po_d_no_META_1,
			d_sub_char1_META_1,
			d_sub_char2_META_1,
			d_sub_char3_META_1,
			cst_itm_cd_META_1,
			cst_itm_nm_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_ShipAdv_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

