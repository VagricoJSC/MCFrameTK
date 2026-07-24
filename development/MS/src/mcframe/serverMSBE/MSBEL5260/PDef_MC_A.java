package mcframe.serverMSBE.MSBEL5260;

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
 * [MSBEL_ProvSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5260.ProvSchd_Upd01.UP.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5260.ProvSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5260.ProvSchd_Chk01.UP.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5260.ProvSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5260.ProvSchd_Sprt01.UP.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5260.ProvSchd_Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL5260_ProvSchd_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL5260_ProvSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5260", "ProvSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5260_ProvSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ps" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ps" + ".prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("ps" + ".prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("ps" + ".prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("ps" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ps" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ps" + ".xfr_rsn_cd", "xfr_rsn_cd"),
				MCItemDef.create("ps" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ps" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ps" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ps" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ps" + ".prsppl_cd", "prsppl_cd"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ps" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ps" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ps" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ps" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ps" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("ps" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ps" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ps" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ps" + ".sub_char3", "sub_char3"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("not_completion_flg", "not_completion_flg")
			}
			,
			MCBlockDef.create("ProvSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5260_ProvSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ps" + ".prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ps" + ".prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("ps" + ".prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("ps" + ".prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ps" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ps" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ps" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ps" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ps" + ".wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("ProvSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5260_ProvSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5260", "ProvSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5260_ProvSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ps" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ps" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ps" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ps" + ".prsppl_cd", "prsppl_cd"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_flg", "inpt_flg")
			}
			,
			MCBlockDef.create("ProvSchdChk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5260_ProvSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ProvSchdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5260_ProvSchd_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL5260", "ProvSchd_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5260_ProvSchd_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ps" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ps" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ps" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ps" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ps" + ".prsppl_cd", "prsppl_cd"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ps" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ps" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("not_completion_flg", "not_completion_flg")
			}
			,
			MCBlockDef.create("ProvSchd_Sprt01")
		);
	}


	public static MCContainerDef MS_MSBEL5260_ProvSchd_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5260", "ProvSchd_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ps" + ".prov_typ", "prov_typ"),
				MCItemDef.create("ps" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ps" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ps" + ".xrate", "xrate"),
				MCItemDef.create("ps" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ps" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ps" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ps" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ps" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ps" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ps" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ps" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ps" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ps" + ".wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("ProvSchd_Sprt01")
		);
	}
	//FMCB DEF_CLASSES END
}

