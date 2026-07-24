package mcframe.clientMSBD.MSBDP0180;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PurcDscntReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0180.Srch01.UP.BLOCK0")){
			return MS_MSBDL0180_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0180_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Srch01.DOWN.BLOCK1")){
			return MS_MSBDL0180_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Srch02.UP.BLOCK0")){
			return MS_MSBDL0180_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0180_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Srch02.DOWN.BLOCK1")){
			return MS_MSBDL0180_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Ins01.UP.BLOCK0")){
			return MS_MSBDL0180_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Ins01.UP.BLOCK1")){
			return MS_MSBDL0180_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Ins01.DOWN.BLOCK0")){
			return MS_MSBDL0180_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Ins01.DOWN.BLOCK1")){
			return MS_MSBDL0180_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Upd01.UP.BLOCK0")){
			return MS_MSBDL0180_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Upd01.UP.BLOCK1")){
			return MS_MSBDL0180_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0180_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Upd01.DOWN.BLOCK1")){
			return MS_MSBDL0180_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0180.Del01.UP.BLOCK0")){
			return MS_MSBDL0180_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0180.Del01.UP.BLOCK1")){
			return MS_MSBDL0180_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBDL0180_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0180", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0180_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0180_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_p" + ".cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_p" + ".cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_p" + ".tel", "sppl_tel"),
				MCItemDef.create("sppl_p" + ".fax", "sppl_fax"),
				MCItemDef.create("sppl_p" + ".cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_p" + ".cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_p" + ".zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_p" + ".addr1", "sppl_addr1"),
				MCItemDef.create("sppl_p" + ".addr2", "sppl_addr2"),
				MCItemDef.create("sppl_p" + ".addr3", "sppl_addr3"),
				MCItemDef.create("sppl_p" + ".addr4", "sppl_addr4"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_pay_crryovr_times", "sppl_pay_crryovr_times"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("prax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0180_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("itm_pay_crryovr_times", "itm_pay_crryovr_times"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "wtax_amt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_typ_nm", "purc_typ_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("act_ac_dt", "act_ac_dt"),
				MCItemDef.create("act_unit_qty", "act_unit_qty"),
				MCItemDef.create("act_unit_cd", "act_unit_cd"),
				MCItemDef.create("act_unit_nm", "act_unit_nm"),
				MCItemDef.create("act_cur_upri", "act_cur_upri"),
				MCItemDef.create("act_cur_amt", "act_cur_amt"),
				MCItemDef.create("act_tax_amt", "act_tax_amt"),
				MCItemDef.create("act_tax_cd", "act_tax_cd"),
				MCItemDef.create("act_tax_nm", "act_tax_nm"),
				MCItemDef.create("act_tax_rate", "act_tax_rate"),
				MCItemDef.create("act_cur_tax_amt", "act_cur_tax_amt"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0180_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0180", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0180_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no"),
				MCItemDef.create("rev_no", "rev_no"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0180_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_p" + ".cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_p" + ".cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_p" + ".tel", "sppl_tel"),
				MCItemDef.create("sppl_p" + ".fax", "sppl_fax"),
				MCItemDef.create("sppl_p" + ".cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_p" + ".cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_p" + ".zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_p" + ".addr1", "sppl_addr1"),
				MCItemDef.create("sppl_p" + ".addr2", "sppl_addr2"),
				MCItemDef.create("sppl_p" + ".addr3", "sppl_addr3"),
				MCItemDef.create("sppl_p" + ".addr4", "sppl_addr4"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_pay_crryovr_times", "sppl_pay_crryovr_times"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("prax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0180_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("itm_pay_crryovr_times", "itm_pay_crryovr_times"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("purc_dtl_upd_flg", "purc_dtl_upd_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "wtax_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_typ_nm", "purc_typ_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("act_ac_dt", "act_ac_dt"),
				MCItemDef.create("act_unit_qty", "act_unit_qty"),
				MCItemDef.create("act_unit_cd", "act_unit_cd"),
				MCItemDef.create("act_unit_nm", "act_unit_nm"),
				MCItemDef.create("act_cur_upri", "act_cur_upri"),
				MCItemDef.create("act_cur_amt", "act_cur_amt"),
				MCItemDef.create("act_tax_amt", "act_tax_amt"),
				MCItemDef.create("act_tax_cd", "act_tax_cd"),
				MCItemDef.create("act_tax_nm", "act_tax_nm"),
				MCItemDef.create("act_tax_rate", "act_tax_rate"),
				MCItemDef.create("act_cur_tax_amt", "act_cur_tax_amt"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0180_Ins01_INFO = new MCOperationInfo("MS", "MSBDL0180", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0180_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("prax_xrate_p" + ".xrate", "ptax_xrate")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0180_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0180_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_rev", "purc_act_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0180_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0180_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0180", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0180_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("prax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0180_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0180_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_rev", "purc_act_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0180_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0180_Del01_INFO = new MCOperationInfo("MS", "MSBDL0180", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0180_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Del01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0180_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0180", "Del01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

