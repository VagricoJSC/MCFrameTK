package mcframe.serverMSBD.MSBDL5170;

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
 * [MSBDL_PurcRetRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.DOWN.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.DOWN.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Ins01.DOWN.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Upd01.DOWN.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Del01.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Del01.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Del01.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk01.DOWN.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.DOWN.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk02.DOWN.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.UP.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.UP.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.DOWN.BLOCK0")){
			return MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.DOWN.BLOCK1")){
			return MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_Chk03.DOWN.BLOCK2")){
			return MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk01.DOWN.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk02.DOWN.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk03.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk03.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk04_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Chk04.DOWN.BLOCK2")){
			return MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Ins01.DOWN.BLOCK2")){
			return MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd01.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd01.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd01.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd02.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd02.UP.BLOCK1")){
			return MS_MSBDL5170_Schd_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd02.UP.BLOCK2")){
			return MS_MSBDL5170_Schd_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5170_Schd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Upd02.DOWN.BLOCK1")){
			return MS_MSBDL5170_Schd_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5170.Schd_Del01.UP.BLOCK0")){
			return MS_MSBDL5170_Schd_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5170.PurcRet_RevUpd01.UP.BLOCK0")){
			return MS_MSBDL5170_PurcRet_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
															
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Ins01_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg"),
				MCItemDef.create("purc_ret_dt", "purc_ret_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("ret_sppl_fax", "ret_sppl_fax"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_str_ln_cd", "bd_str_ln_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_dt", "purc_ret_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("io_make_flg", "io_make_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("ret_sppl_fax", "ret_sppl_fax"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("purc_dtl_upd_flg", "purc_dtl_upd_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_str_ln_cd", "bd_str_ln_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Del01_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Del01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("io_make_flg", "io_make_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_str_ln_cd", "bd_str_ln_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_ret_dt", "purc_ret_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_dt", "purc_ret_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("purc_dtl_upd_flg", "purc_dtl_upd_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_Chk03_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("purc_ret_sppl_cd", "purc_ret_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_str_ln_cd", "bd_str_ln_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("str_ln_cd", "str_ln_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_PurcRet_Chk03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_Chk03",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_act_io_no", "purc_ret_act_io_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no")
			}
			,
			MCBlockDef.create("Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("cmpl_flg", "cmpl_flg")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Chk03_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk03",
			new MCItemDef[]{
				MCItemDef.create("pr_schd_upd_cntr", "pr_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Chk04_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("cmpl_flg", "cmpl_flg")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Chk04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_wg_cd", "purc_ret_loc_wg_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Ins01_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("ret_sppl_fax", "ret_sppl_fax"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("ret_sppl_fax", "ret_sppl_fax"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pr_schd_upd_cntr", "pr_schd_upd_cntr"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ref_rcpt_iv_no", "ref_rcpt_iv_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ret_sppl_nm", "ret_sppl_nm"),
				MCItemDef.create("ret_sppl_zip_cd", "ret_sppl_zip_cd"),
				MCItemDef.create("ret_sppl_addr1", "ret_sppl_addr1"),
				MCItemDef.create("ret_sppl_addr2", "ret_sppl_addr2"),
				MCItemDef.create("ret_sppl_addr3", "ret_sppl_addr3"),
				MCItemDef.create("ret_sppl_addr4", "ret_sppl_addr4"),
				MCItemDef.create("ret_sppl_cntct_dpt", "ret_sppl_cntct_dpt"),
				MCItemDef.create("ret_sppl_cntct_psn", "ret_sppl_cntct_psn"),
				MCItemDef.create("ret_sppl_cntct_psn_title", "ret_sppl_cntct_psn_title"),
				MCItemDef.create("ret_sppl_tel", "ret_sppl_tel"),
				MCItemDef.create("ret_sppl_fax", "ret_sppl_fax"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("purc_ret_print_rmrks", "purc_ret_print_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pr_schd_upd_cntr", "pr_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("purc_ret_print_d_rmrks", "purc_ret_print_d_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_no", "ref_purc_act_no"),
				MCItemDef.create("ref_purc_act_seq", "ref_purc_act_seq"),
				MCItemDef.create("ref_purc_act_rev", "ref_purc_act_rev"),
				MCItemDef.create("ref_purc_act_d_no", "ref_purc_act_d_no"),
				MCItemDef.create("ref_purc_act_d_seq", "ref_purc_act_d_seq"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5170_Schd_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no"),
				MCItemDef.create("purc_ret_loc_cd", "purc_ret_loc_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_arr_act_no", "ref_arr_act_no"),
				MCItemDef.create("ref_arr_act_rev", "ref_arr_act_rev"),
				MCItemDef.create("ref_purc_act_io_no", "ref_purc_act_io_no"),
				MCItemDef.create("ref_purc_act_io_seq", "ref_purc_act_io_seq"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}


	public static MCContainerDef MS_MSBDL5170_Schd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Schd_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5170_Schd_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ret_schd_io_no", "purc_ret_schd_io_no")
			}
			,
			MCBlockDef.create("Schd_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_Schd_Del01_INFO = new MCOperationInfo("MS", "MSBDL5170", "Schd_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_Schd_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "Schd_Del01",
			new MCItemDef[]{
				MCItemDef.create("purc_ret_schd_no", "purc_ret_schd_no"),
				MCItemDef.create("pr_schd_upd_cntr", "pr_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Schd_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5170_PurcRet_RevUpd01_INFO = new MCOperationInfo("MS", "MSBDL5170", "PurcRet_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5170_PurcRet_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5170", "PurcRet_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("Po_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

