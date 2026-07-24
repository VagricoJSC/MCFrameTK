package mcframe.commonPFBB.PFBBR5030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_PurcSlipPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5030";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5030.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta inpDate_META_0 = new MCReportMeta("inpDate", "", "10", "", true);
	static public final MCReportMeta voucherNo_META_0 = new MCReportMeta("voucherNo", "", "20", "", true);
	static public final MCReportMeta customerCode_META_0 = new MCReportMeta("customerCode", "", "20", "", true);
	static public final MCReportMeta delivToCode_META_0 = new MCReportMeta("delivToCode", "", "20", "", true);
	static public final MCReportMeta deptCode_META_0 = new MCReportMeta("deptCode", "", "20", "", true);
	static public final MCReportMeta inchargeCode_META_0 = new MCReportMeta("inchargeCode", "", "20", "", true);
	static public final MCReportMeta ar_PatternCode_META_0 = new MCReportMeta("ar_PatternCode", "", "20", "", true);
	static public final MCReportMeta currencyCode_META_0 = new MCReportMeta("currencyCode", "", "20", "", true);
	static public final MCReportMeta rateTypeCode_META_0 = new MCReportMeta("rateTypeCode", "", "20", "", true);
	static public final MCReportMeta rate_META_0 = new MCReportMeta("rate", "", "14,9", "", true);
	static public final MCReportMeta taxableCode_META_0 = new MCReportMeta("taxableCode", "", "20", "", true);
	static public final MCReportMeta taxType_META_0 = new MCReportMeta("taxType", "", "1", "", true);
	static public final MCReportMeta header_DescriptCode_META_0 = new MCReportMeta("header_DescriptCode", "", "20", "", true);
	static public final MCReportMeta header_DescriptName_META_0 = new MCReportMeta("header_DescriptName", "", "100", "", true);
	static public final MCReportMeta postpadColor_META_0 = new MCReportMeta("postpadColor", "", "8", "", true);
	static public final MCReportMeta postpadText_META_0 = new MCReportMeta("postpadText", "", "50", "", true);
	static public final MCReportMeta settleMethod_META_0 = new MCReportMeta("settleMethod", "", "20", "", true);
	static public final MCReportMeta bankAcct_Own_META_0 = new MCReportMeta("bankAcct_Own", "", "20", "", true);
	static public final MCReportMeta bankAcct_Corresp_META_0 = new MCReportMeta("bankAcct_Corresp", "", "20", "", true);
	static public final MCReportMeta paymentTerms_META_0 = new MCReportMeta("paymentTerms", "", "100", "", true);
	static public final MCReportMeta dueDate_META_0 = new MCReportMeta("dueDate", "", "10", "", true);
	static public final MCReportMeta fileName_META_0 = new MCReportMeta("fileName", "", "100", "", true);
	static public final MCReportMeta journalType_META_0 = new MCReportMeta("journalType", "", "1", "", true);
	static public final MCReportMeta invoiceNo_META_0 = new MCReportMeta("invoiceNo", "", "20", "", true);
	static public final MCReportMeta approveGroupCode_META_0 = new MCReportMeta("approveGroupCode", "", "20", "", true);
	static public final MCReportMeta iraiCode_META_0 = new MCReportMeta("iraiCode", "", "20", "", true);
	static public final MCReportMeta header_UserMaster_META_0 = new MCReportMeta("header_UserMaster", "", "20", "", true);
	static public final MCReportMeta header_UserText_META_0 = new MCReportMeta("header_UserText", "", "100", "", true);
	static public final MCReportMeta header_FlexMaster1_META_0 = new MCReportMeta("header_FlexMaster1", "", "20", "", true);
	static public final MCReportMeta header_FlexMaster2_META_0 = new MCReportMeta("header_FlexMaster2", "", "20", "", true);
	static public final MCReportMeta header_FlexCode1_META_0 = new MCReportMeta("header_FlexCode1", "", "20", "", true);
	static public final MCReportMeta header_FlexCode2_META_0 = new MCReportMeta("header_FlexCode2", "", "20", "", true);
	static public final MCReportMeta header_FlexText1_META_0 = new MCReportMeta("header_FlexText1", "", "100", "", true);
	static public final MCReportMeta header_FlexText2_META_0 = new MCReportMeta("header_FlexText2", "", "100", "", true);
	static public final MCReportMeta header_FlexText3_META_0 = new MCReportMeta("header_FlexText3", "", "100", "", true);
	static public final MCReportMeta header_FlexText4_META_0 = new MCReportMeta("header_FlexText4", "", "100", "", true);
	static public final MCReportMeta header_FlexText5_META_0 = new MCReportMeta("header_FlexText5", "", "100", "", true);
	static public final MCReportMeta header_FlexDate_META_0 = new MCReportMeta("header_FlexDate", "", "10", "", true);
	static public final MCReportMeta remarks1_META_0 = new MCReportMeta("remarks1", "", "100", "", true);
	static public final MCReportMeta remarks2_META_0 = new MCReportMeta("remarks2", "", "100", "", true);
	static public final MCReportMeta remarks3_META_0 = new MCReportMeta("remarks3", "", "100", "", true);
	static public final MCReportMeta remarks4_META_0 = new MCReportMeta("remarks4", "", "100", "", true);
	static public final MCReportMeta remarks5_META_0 = new MCReportMeta("remarks5", "", "100", "", true);
	static public final MCReportMeta remarks6_META_0 = new MCReportMeta("remarks6", "", "100", "", true);
	static public final MCReportMeta remarks7_META_0 = new MCReportMeta("remarks7", "", "100", "", true);
	static public final MCReportMeta remarks8_META_0 = new MCReportMeta("remarks8", "", "100", "", true);
	static public final MCReportMeta remarks9_META_0 = new MCReportMeta("remarks9", "", "100", "", true);
	static public final MCReportMeta remarks10_META_0 = new MCReportMeta("remarks10", "", "100", "", true);
	static public final MCReportMeta remarks11_META_0 = new MCReportMeta("remarks11", "", "100", "", true);
	static public final MCReportMeta remarks12_META_0 = new MCReportMeta("remarks12", "", "100", "", true);
	static public final MCReportMeta remarks13_META_0 = new MCReportMeta("remarks13", "", "100", "", true);
	static public final MCReportMeta remarks14_META_0 = new MCReportMeta("remarks14", "", "100", "", true);
	static public final MCReportMeta remarks15_META_0 = new MCReportMeta("remarks15", "", "100", "", true);
	static public final MCReportMeta remarks16_META_0 = new MCReportMeta("remarks16", "", "100", "", true);
	static public final MCReportMeta remarks17_META_0 = new MCReportMeta("remarks17", "", "100", "", true);
	static public final MCReportMeta remarks18_META_0 = new MCReportMeta("remarks18", "", "100", "", true);
	static public final MCReportMeta remarks19_META_0 = new MCReportMeta("remarks19", "", "100", "", true);
	static public final MCReportMeta remarks20_META_0 = new MCReportMeta("remarks20", "", "100", "", true);
	static public final MCReportMeta remarks21_META_0 = new MCReportMeta("remarks21", "", "100", "", true);
	static public final MCReportMeta remarks22_META_0 = new MCReportMeta("remarks22", "", "100", "", true);
	static public final MCReportMeta remarks23_META_0 = new MCReportMeta("remarks23", "", "100", "", true);
	static public final MCReportMeta remarks24_META_0 = new MCReportMeta("remarks24", "", "100", "", true);
	static public final MCReportMeta remarks25_META_0 = new MCReportMeta("remarks25", "", "100", "", true);
	static public final MCReportMeta remarks26_META_0 = new MCReportMeta("remarks26", "", "100", "", true);
	static public final MCReportMeta remarks27_META_0 = new MCReportMeta("remarks27", "", "100", "", true);
	static public final MCReportMeta remarks28_META_0 = new MCReportMeta("remarks28", "", "100", "", true);
	static public final MCReportMeta remarks29_META_0 = new MCReportMeta("remarks29", "", "100", "", true);
	static public final MCReportMeta remarks30_META_0 = new MCReportMeta("remarks30", "", "100", "", true);
	static public final MCReportMeta rowNo_META_0 = new MCReportMeta("rowNo", "", "4", "", true);
	static public final MCReportMeta customerNo_META_0 = new MCReportMeta("customerNo", "", "50", "", true);
	static public final MCReportMeta detailType_META_0 = new MCReportMeta("detailType", "", "1", "", true);
	static public final MCReportMeta detail_DeptCode_META_0 = new MCReportMeta("detail_DeptCode", "", "20", "", true);
	static public final MCReportMeta warehouse_META_0 = new MCReportMeta("warehouse", "", "20", "", true);
	static public final MCReportMeta locationCode_META_0 = new MCReportMeta("locationCode", "", "20", "", true);
	static public final MCReportMeta lotNo_META_0 = new MCReportMeta("lotNo", "", "20", "", true);
	static public final MCReportMeta goodsGroup_META_0 = new MCReportMeta("goodsGroup", "", "20", "", true);
	static public final MCReportMeta goodsCode_META_0 = new MCReportMeta("goodsCode", "", "100", "", true);
	static public final MCReportMeta chargesCode_META_0 = new MCReportMeta("chargesCode", "", "20", "", true);
	static public final MCReportMeta corresp_Goods_META_0 = new MCReportMeta("corresp_Goods", "", "100", "", true);
	static public final MCReportMeta unitType_META_0 = new MCReportMeta("unitType", "", "1", "", true);
	static public final MCReportMeta detail_TaxableCode_META_0 = new MCReportMeta("detail_TaxableCode", "", "20", "", true);
	static public final MCReportMeta detail_TaxType_META_0 = new MCReportMeta("detail_TaxType", "", "1", "", true);
	static public final MCReportMeta unitPrice_META_0 = new MCReportMeta("unitPrice", "", "20,6", "", true);
	static public final MCReportMeta qty_Plus_META_0 = new MCReportMeta("qty_Plus", "", "14,4", "", true);
	static public final MCReportMeta inpAmount_Fc_META_0 = new MCReportMeta("inpAmount_Fc", "", "16,2", "", true);
	static public final MCReportMeta taxAmount_Fc_META_0 = new MCReportMeta("taxAmount_Fc", "", "16,2", "", true);
	static public final MCReportMeta taxableAmount_Fc_META_0 = new MCReportMeta("taxableAmount_Fc", "", "16,2", "", true);
	static public final MCReportMeta inpAmount_Sc_META_0 = new MCReportMeta("inpAmount_Sc", "", "16,2", "", true);
	static public final MCReportMeta taxAmount_Sc_META_0 = new MCReportMeta("taxAmount_Sc", "", "16,2", "", true);
	static public final MCReportMeta taxableAmount_Sc_META_0 = new MCReportMeta("taxableAmount_Sc", "", "16,2", "", true);
	static public final MCReportMeta packingUnitCode_META_0 = new MCReportMeta("packingUnitCode", "", "20", "", true);
	static public final MCReportMeta packingUnitPrice_META_0 = new MCReportMeta("packingUnitPrice", "", "20,6", "", true);
	static public final MCReportMeta packingUnitQty_META_0 = new MCReportMeta("packingUnitQty", "", "10,0", "", true);
	static public final MCReportMeta detail_Descript_Code_META_0 = new MCReportMeta("detail_Descript_Code", "", "20", "", true);
	static public final MCReportMeta detail_Descript_Name_META_0 = new MCReportMeta("detail_Descript_Name", "", "100", "", true);
	static public final MCReportMeta detail_UserMaster1_META_0 = new MCReportMeta("detail_UserMaster1", "", "20", "", true);
	static public final MCReportMeta detail_UserMaster2_META_0 = new MCReportMeta("detail_UserMaster2", "", "20", "", true);
	static public final MCReportMeta detail_UserMaster3_META_0 = new MCReportMeta("detail_UserMaster3", "", "20", "", true);
	static public final MCReportMeta detail_UserMaster4_META_0 = new MCReportMeta("detail_UserMaster4", "", "20", "", true);
	static public final MCReportMeta detail_UserMaster5_META_0 = new MCReportMeta("detail_UserMaster5", "", "20", "", true);
	static public final MCReportMeta detail_UserCode_META_0 = new MCReportMeta("detail_UserCode", "", "20", "", true);
	static public final MCReportMeta detail_UserText_META_0 = new MCReportMeta("detail_UserText", "", "100", "", true);
	static public final MCReportMeta detail_UserDate_META_0 = new MCReportMeta("detail_UserDate", "", "10", "", true);
	static public final MCReportMeta detail_UserQty_META_0 = new MCReportMeta("detail_UserQty", "", "14,4", "", true);
	static public final MCReportMeta detail_FlexMaster_META_0 = new MCReportMeta("detail_FlexMaster", "", "20", "", true);
	static public final MCReportMeta detail_FlexCode_META_0 = new MCReportMeta("detail_FlexCode", "", "20", "", true);
	static public final MCReportMeta detail_FlexText1_META_0 = new MCReportMeta("detail_FlexText1", "", "100", "", true);
	static public final MCReportMeta detail_FlexText2_META_0 = new MCReportMeta("detail_FlexText2", "", "100", "", true);
	static public final MCReportMeta detail_FlexDate_META_0 = new MCReportMeta("detail_FlexDate", "", "10", "", true);
	static public final MCReportMeta sub_Descript_Code_META_0 = new MCReportMeta("sub_Descript_Code", "", "20", "", true);
	static public final MCReportMeta sub_Descript_Name_META_0 = new MCReportMeta("sub_Descript_Name", "", "100", "", true);
	static public final MCReportMeta sub_UserMaster1_META_0 = new MCReportMeta("sub_UserMaster1", "", "20", "", true);
	static public final MCReportMeta sub_UserMaster2_META_0 = new MCReportMeta("sub_UserMaster2", "", "20", "", true);
	static public final MCReportMeta sub_UserMaster3_META_0 = new MCReportMeta("sub_UserMaster3", "", "20", "", true);
	static public final MCReportMeta sub_UserMaster4_META_0 = new MCReportMeta("sub_UserMaster4", "", "20", "", true);
	static public final MCReportMeta sub_UserMaster5_META_0 = new MCReportMeta("sub_UserMaster5", "", "20", "", true);
	static public final MCReportMeta sub_UserCode_META_0 = new MCReportMeta("sub_UserCode", "", "20", "", true);
	static public final MCReportMeta sub_UserText_META_0 = new MCReportMeta("sub_UserText", "", "100", "", true);
	static public final MCReportMeta sub_UserDate_META_0 = new MCReportMeta("sub_UserDate", "", "10", "", true);
	static public final MCReportMeta sub_UserQty_META_0 = new MCReportMeta("sub_UserQty", "", "14,4", "", true);
	static public final MCReportMeta lot_FlexMaster_META_0 = new MCReportMeta("lot_FlexMaster", "", "20", "", true);
	static public final MCReportMeta lot_FlexText1_META_0 = new MCReportMeta("lot_FlexText1", "", "100", "", true);
	static public final MCReportMeta lot_FlexText2_META_0 = new MCReportMeta("lot_FlexText2", "", "100", "", true);
	static public final MCReportMeta lot_FlexDate_META_0 = new MCReportMeta("lot_FlexDate", "", "10", "", true);
	static public final MCReportMeta billtocode_META_0 = new MCReportMeta("billtocode", "", "20", "", true);
	static public final MCReportMeta endusercode_META_0 = new MCReportMeta("endusercode", "", "20", "", true);
	static public final MCReportMeta succeedVoucherNo_META_0 = new MCReportMeta("succeedVoucherNo", "", "20", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			inpDate_META_0,
			voucherNo_META_0,
			customerCode_META_0,
			delivToCode_META_0,
			deptCode_META_0,
			inchargeCode_META_0,
			ar_PatternCode_META_0,
			currencyCode_META_0,
			rateTypeCode_META_0,
			rate_META_0,
			taxableCode_META_0,
			taxType_META_0,
			header_DescriptCode_META_0,
			header_DescriptName_META_0,
			postpadColor_META_0,
			postpadText_META_0,
			settleMethod_META_0,
			bankAcct_Own_META_0,
			bankAcct_Corresp_META_0,
			paymentTerms_META_0,
			dueDate_META_0,
			fileName_META_0,
			journalType_META_0,
			invoiceNo_META_0,
			approveGroupCode_META_0,
			iraiCode_META_0,
			header_UserMaster_META_0,
			header_UserText_META_0,
			header_FlexMaster1_META_0,
			header_FlexMaster2_META_0,
			header_FlexCode1_META_0,
			header_FlexCode2_META_0,
			header_FlexText1_META_0,
			header_FlexText2_META_0,
			header_FlexText3_META_0,
			header_FlexText4_META_0,
			header_FlexText5_META_0,
			header_FlexDate_META_0,
			remarks1_META_0,
			remarks2_META_0,
			remarks3_META_0,
			remarks4_META_0,
			remarks5_META_0,
			remarks6_META_0,
			remarks7_META_0,
			remarks8_META_0,
			remarks9_META_0,
			remarks10_META_0,
			remarks11_META_0,
			remarks12_META_0,
			remarks13_META_0,
			remarks14_META_0,
			remarks15_META_0,
			remarks16_META_0,
			remarks17_META_0,
			remarks18_META_0,
			remarks19_META_0,
			remarks20_META_0,
			remarks21_META_0,
			remarks22_META_0,
			remarks23_META_0,
			remarks24_META_0,
			remarks25_META_0,
			remarks26_META_0,
			remarks27_META_0,
			remarks28_META_0,
			remarks29_META_0,
			remarks30_META_0,
			rowNo_META_0,
			customerNo_META_0,
			detailType_META_0,
			detail_DeptCode_META_0,
			warehouse_META_0,
			locationCode_META_0,
			lotNo_META_0,
			goodsGroup_META_0,
			goodsCode_META_0,
			chargesCode_META_0,
			corresp_Goods_META_0,
			unitType_META_0,
			detail_TaxableCode_META_0,
			detail_TaxType_META_0,
			unitPrice_META_0,
			qty_Plus_META_0,
			inpAmount_Fc_META_0,
			taxAmount_Fc_META_0,
			taxableAmount_Fc_META_0,
			inpAmount_Sc_META_0,
			taxAmount_Sc_META_0,
			taxableAmount_Sc_META_0,
			packingUnitCode_META_0,
			packingUnitPrice_META_0,
			packingUnitQty_META_0,
			detail_Descript_Code_META_0,
			detail_Descript_Name_META_0,
			detail_UserMaster1_META_0,
			detail_UserMaster2_META_0,
			detail_UserMaster3_META_0,
			detail_UserMaster4_META_0,
			detail_UserMaster5_META_0,
			detail_UserCode_META_0,
			detail_UserText_META_0,
			detail_UserDate_META_0,
			detail_UserQty_META_0,
			detail_FlexMaster_META_0,
			detail_FlexCode_META_0,
			detail_FlexText1_META_0,
			detail_FlexText2_META_0,
			detail_FlexDate_META_0,
			sub_Descript_Code_META_0,
			sub_Descript_Name_META_0,
			sub_UserMaster1_META_0,
			sub_UserMaster2_META_0,
			sub_UserMaster3_META_0,
			sub_UserMaster4_META_0,
			sub_UserMaster5_META_0,
			sub_UserCode_META_0,
			sub_UserText_META_0,
			sub_UserDate_META_0,
			sub_UserQty_META_0,
			lot_FlexMaster_META_0,
			lot_FlexText1_META_0,
			lot_FlexText2_META_0,
			lot_FlexDate_META_0,
			billtocode_META_0,
			endusercode_META_0,
			succeedVoucherNo_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_PurcSlipPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

