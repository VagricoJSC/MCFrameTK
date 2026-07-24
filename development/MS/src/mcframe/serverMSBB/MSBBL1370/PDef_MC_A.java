package mcframe.serverMSBB.MSBBL1370;

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
 * [MSBBL_SlsDtlModReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1370.Srch01.UP.BLOCK0")){
			return MS_MSBBL1370_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1370_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Chk01.UP.BLOCK0")){
			return MS_MSBBL1370_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Chk01.DOWN.BLOCK0")){
			return MS_MSBBL1370_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Upd01.UP.BLOCK0")){
			return MS_MSBBL1370_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Upd01.UP.BLOCK1")){
			return MS_MSBBL1370_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1370.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1370_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt01.UP.BLOCK0")){
			return MS_MSBBL1370_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL1370_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt02.UP.BLOCK0")){
			return MS_MSBBL1370_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt02.DOWN.BLOCK0")){
			return MS_MSBBL1370_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt03.UP.BLOCK0")){
			return MS_MSBBL1370_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1370.Sprt03.DOWN.BLOCK0")){
			return MS_MSBBL1370_Sprt03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBBL1370_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1370", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("disp_unit", "disp_unit"),
				MCItemDef.create("sls", "sls"),
				MCItemDef.create("sls_ret", "sls_ret"),
				MCItemDef.create("sls_dscnt", "sls_dscnt"),
				MCItemDef.create("iv_tgt_flg", "iv_tgt_flg"),
				MCItemDef.create("iv_not_tgt_flg", "iv_not_tgt_flg"),
				MCItemDef.create("not_interim_flg", "not_interim_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("rjct_flg", "rjct_flg"),
				MCItemDef.create("last_rjct_flg", "last_rjct_flg"),
				MCItemDef.create("not_aprv_flg", "not_aprv_flg"),
				MCItemDef.create("sls_dt_fr", "sls_dt_fr"),
				MCItemDef.create("sls_dt_to", "sls_dt_to"),
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("ship_dt_fr", "ship_dt_fr"),
				MCItemDef.create("ship_hm_fr", "ship_hm_fr"),
				MCItemDef.create("ship_dt_to", "ship_dt_to"),
				MCItemDef.create("ship_hm_to", "ship_hm_to"),
				MCItemDef.create("dlv_dt_fr", "dlv_dt_fr"),
				MCItemDef.create("dlv_hm_fr", "dlv_hm_fr"),
				MCItemDef.create("dlv_dt_to", "dlv_dt_to"),
				MCItemDef.create("dlv_hm_to", "dlv_hm_to"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("io_sub_char1", "io_sub_char1"),
				MCItemDef.create("io_sub_char2", "io_sub_char2"),
				MCItemDef.create("io_sub_char3", "io_sub_char3"),
				MCItemDef.create("dis_can_disp_flg", "dis_can_disp_flg"),
				MCItemDef.create("sign_rev_flg", "sign_rev_flg"),
				MCItemDef.create("inc_past_flg", "inc_past_flg"),
				MCItemDef.create("cst_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("bcst_grp_flg1", "bcst_grp_flg1"),
				MCItemDef.create("bcst_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_flg2", "bcst_grp_flg2"),
				MCItemDef.create("bcst_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_flg3", "bcst_grp_flg3"),
				MCItemDef.create("bcst_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_flg4", "bcst_grp_flg4"),
				MCItemDef.create("bcst_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_flg5", "bcst_grp_flg5"),
				MCItemDef.create("bcst_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_flg6", "bcst_grp_flg6"),
				MCItemDef.create("bcst_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_flg7", "bcst_grp_flg7"),
				MCItemDef.create("bcst_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_flg8", "bcst_grp_flg8"),
				MCItemDef.create("bcst_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_flg9", "bcst_grp_flg9"),
				MCItemDef.create("bcst_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_flg10", "bcst_grp_flg10"),
				MCItemDef.create("bcst_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_nm10", "bcst_grp_nm10"),
				MCItemDef.create("acst_grp_flg1", "acst_grp_flg1"),
				MCItemDef.create("acst_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_flg2", "acst_grp_flg2"),
				MCItemDef.create("acst_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_flg3", "acst_grp_flg3"),
				MCItemDef.create("acst_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_flg4", "acst_grp_flg4"),
				MCItemDef.create("acst_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_flg5", "acst_grp_flg5"),
				MCItemDef.create("acst_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_flg6", "acst_grp_flg6"),
				MCItemDef.create("acst_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_flg7", "acst_grp_flg7"),
				MCItemDef.create("acst_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_flg8", "acst_grp_flg8"),
				MCItemDef.create("acst_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_flg9", "acst_grp_flg9"),
				MCItemDef.create("acst_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_flg10", "acst_grp_flg10"),
				MCItemDef.create("acst_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_nm10", "acst_grp_nm10"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("comp_spec_typ_nm", "comp_spec_typ_nm"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("sls_upri_req_typ_nm", "sls_upri_req_typ_nm"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("old_trd_cur_upri", "old_trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_unit_qty_for_upri", "trd_unit_qty_for_upri"),
				MCItemDef.create("schd_trd_unit_cd", "schd_trd_unit_cd"),
				MCItemDef.create("schd_trd_unit_nm", "schd_trd_unit_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("prof_amt", "prof_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("sls_cost_amt", "sls_cost_amt"),
				MCItemDef.create("sls_cost_upri", "sls_cost_upri"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("ship_dt", "ship_dt"),
				MCItemDef.create("ship_hm", "ship_hm"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("dlv_hm", "dlv_hm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bcst_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_nm10", "bcst_grp_nm10"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("acst_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_nm10", "acst_grp_nm10"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("purc_ddlv_po_no", "purc_ddlv_po_no"),
				MCItemDef.create("purc_ddlv_po_d_no", "purc_ddlv_po_d_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("biz_rsn_cd", "biz_rsn_cd"),
				MCItemDef.create("biz_rsn_nm", "biz_rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("io_sub_char1", "io_sub_char1"),
				MCItemDef.create("io_sub_char2", "io_sub_char2"),
				MCItemDef.create("io_sub_char3", "io_sub_char3"),
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
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("hdr_upd_cntr", "hdr_upd_cntr"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("sls_close_flg", "sls_close_flg"),
				MCItemDef.create("bef_bd_dpt_cd", "bef_bd_dpt_cd"),
				MCItemDef.create("ddlv_sls_flg", "ddlv_sls_flg"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1370_Chk01_INFO = new MCOperationInfo("MS", "MSBBL1370", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("biz_rsn_cd", "biz_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("hdr_upd_cntr", "hdr_upd_cntr"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("chk_grp_no", "chk_grp_no"),
				MCItemDef.create("sls_cost_upri", "sls_cost_upri")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("biz_rsn_cd", "biz_rsn_cd"),
				MCItemDef.create("biz_rsn_nm", "biz_rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("hdr_upd_cntr", "hdr_upd_cntr"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("chk_grp_no", "chk_grp_no"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("sls_rtn_flg", "sls_rtn_flg"),
				MCItemDef.create("sls_dscnt_flg", "sls_dscnt_flg"),
				MCItemDef.create("sls_close_flg", "sls_close_flg"),
				MCItemDef.create("sls_cost_upri", "sls_cost_upri")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1370_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1370", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("biz_rsn_cd", "biz_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("hdr_upd_cntr", "hdr_upd_cntr"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("sls_cost_upri", "sls_cost_upri")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1370_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1370_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL1370", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("grp_no", "grp_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri", "sls_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1370_Sprt02_INFO = new MCOperationInfo("MS", "MSBBL1370", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate_dt", "xrate_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate", "xrate")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1370_Sprt03_INFO = new MCOperationInfo("MS", "MSBBL1370", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1370_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("tax_dt", "tax_dt")
			}
			,
			MCBlockDef.create("Sprt03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1370_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1370", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate")
			}
			,
			MCBlockDef.create("Sprt03_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

