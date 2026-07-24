package mcframe.clientMGBF.MGBFP0240;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBFP_RptSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0240.Srch01.UP.BLOCK0")){
			return MG_MGBFL0240_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0240.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0240_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0240.Srch01.DOWN.BLOCK1")){
			return MG_MGBFL0240_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBFL0240_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0240", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0240_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no_p" + ".calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("rpt_key_typ", "rpt_key_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0240_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rpt_seq", "rpt_seq"),
				MCItemDef.create("rpt_tgt_typ", "rpt_tgt_typ"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("rpt_pre_word", "rpt_pre_word"),
				MCItemDef.create("rpt_row_nm", "rpt_row_nm"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("rpt_key_typ", "rpt_key_typ"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("itm_jnl_cd2", "itm_jnl_cd2"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("cost_io_typ", "cost_io_typ"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("col_all", "col_all")
			}
			,
			MCBlockDef.create("DispDtl")
		);
	}
	public static MCContainerDef MG_MGBFL0240_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Key] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cd", "cd"),
				MCItemDef.create("nm", "nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm")
			}
			,
			MCBlockDef.create("Key")
		);
	}
	//FMCB DEF_CLASSES END
}

