package mcframe.serverMABC.MABCL0033;

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
 * [MABCL_MultiReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0033.Wg_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_Wg_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Wg_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_Wg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WgLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_WgLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WgLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_WgLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Wg_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_Wg_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Wg_Del01.UP.BLOCK0")){
			return MA_MABCL0033_Wg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Oper_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_Oper_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Oper_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_Oper_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.OperLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_OperLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.OperLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_OperLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Oper_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_Oper_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Oper_Del01.UP.BLOCK0")){
			return MA_MABCL0033_Oper_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCost_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkCost_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCost_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_WkCost_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCostLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkCostLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCostLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_WkCostLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCost_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkCost_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkCost_Del01.UP.BLOCK0")){
			return MA_MABCL0033_WkCost_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsn_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.WkRsn_Del01.UP.BLOCK0")){
			return MA_MABCL0033_WkRsn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRank_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRank_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRank_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRank_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRankLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRankLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRankLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRankLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRank_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRank_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SlsUpriRank_Del01.UP.BLOCK0")){
			return MA_MABCL0033_SlsUpriRank_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.SetoffGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0033_SetoffGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValid_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValid_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValid_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValid_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValidLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValidLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValidLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValidLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValid_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValid_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ShipValid_Del01.UP.BLOCK0")){
			return MA_MABCL0033_ShipValid_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrp_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.ItmShipGrp_Del01.UP.BLOCK0")){
			return MA_MABCL0033_ItmShipGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Trnspt_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_Trnspt_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Trnspt_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_Trnspt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.TrnsptLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0033_TrnsptLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.TrnsptLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0033_TrnsptLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Trnspt_DelChk01.UP.BLOCK0")){
			return MA_MABCL0033_Trnspt_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0033.Trnspt_Del01.UP.BLOCK0")){
			return MA_MABCL0033_Trnspt_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																																																												
	
	static final MCOperationInfo MA_MABCL0033_Wg_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Wg_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Wg_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Wg_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("ar_flg", "ar_flg"),
				MCItemDef.create("ap_flg", "ap_flg"),
				MCItemDef.create("sd_flg", "sd_flg"),
				MCItemDef.create("mrp_prefix", "mrp_prefix"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("not_xfr_flg", "not_xfr_flg"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("plm_flg", "plm_flg"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("cmn_upri_flg", "cmn_upri_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wg_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Wg_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "Wg_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Wg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Wg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("ar_flg", "ar_flg"),
				MCItemDef.create("ap_flg", "ap_flg"),
				MCItemDef.create("sd_flg", "sd_flg"),
				MCItemDef.create("mrp_prefix", "mrp_prefix"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("not_xfr_flg", "not_xfr_flg"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("plm_flg", "plm_flg"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("cmn_upri_flg", "cmn_upri_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wg_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WgLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WgLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WgLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WgLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WgLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "WgLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WgLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WgLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WgLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Wg_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Wg_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Wg_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Wg_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wg_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Wg_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "Wg_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Wg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Wg_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wg_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Oper_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Oper_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Oper_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Oper_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_alc_grp", "oper_alc_grp"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Oper_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Oper_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "Oper_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Oper_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Oper_Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_alc_grp", "oper_alc_grp"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Oper_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_OperLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "OperLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_OperLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "OperLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_OperLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "OperLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_OperLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "OperLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Oper_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Oper_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Oper_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Oper_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Oper_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Oper_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "Oper_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Oper_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Oper_Del01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Oper_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCost_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCost_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCost_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCost_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCost_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCost_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCost_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCost_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCost_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCost_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCostLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCostLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCostLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCostLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCostLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCostLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCostLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCostLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCostLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCostLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCost_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCost_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCost_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCost_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCost_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkCost_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkCost_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkCost_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkCost_Del01",
			new MCItemDef[]{
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkCost_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_WkRsn_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "WkRsn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_WkRsn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "WkRsn_Del01",
			new MCItemDef[]{
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("WkRsn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("sls_upri_grp_nm", "sls_upri_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("sls_upri_grp_nm", "sls_upri_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("sls_upri_grp_nm", "sls_upri_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("sls_upri_grp_nm", "sls_upri_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_grp_cd", "sls_upri_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRank_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRank_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRank_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRank_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("sls_upri_rank_nm", "sls_upri_rank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRank_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRank_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRank_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRank_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRank_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("sls_upri_rank_nm", "sls_upri_rank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRank_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRankLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRankLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRankLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRankLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("sls_upri_rank_nm", "sls_upri_rank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRankLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRankLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRankLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRankLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRankLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("sls_upri_rank_nm", "sls_upri_rank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRankLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRank_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRank_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRank_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRank_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRank_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SlsUpriRank_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "SlsUpriRank_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SlsUpriRank_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SlsUpriRank_Del01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SlsUpriRank_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("setoff_grp_nm", "setoff_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("setoff_grp_nm", "setoff_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("setoff_grp_nm", "setoff_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("setoff_grp_nm", "setoff_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_SetoffGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "SetoffGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_SetoffGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "SetoffGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("setoff_grp_cd", "setoff_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SetoffGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValid_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValid_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValid_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValid_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("ship_valid_grp_nm", "ship_valid_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValid_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValid_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValid_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValid_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValid_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("ship_valid_grp_nm", "ship_valid_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValid_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValidLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValidLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValidLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValidLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_valid_grp_nm", "ship_valid_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValidLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValidLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValidLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValidLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValidLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ship_valid_grp_nm", "ship_valid_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValidLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValid_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValid_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValid_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValid_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValid_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ShipValid_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "ShipValid_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ShipValid_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ShipValid_Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ShipValid_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("itm_ship_grp_nm", "itm_ship_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("itm_ship_grp_nm", "itm_ship_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_ship_grp_nm", "itm_ship_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_ship_grp_nm", "itm_ship_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_ItmShipGrp_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "ItmShipGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_ItmShipGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "ItmShipGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmShipGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Trnspt_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Trnspt_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Trnspt_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Trnspt_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("sort_seq", "sort_seq"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trnspt_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Trnspt_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "Trnspt_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Trnspt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Trnspt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("sort_seq", "sort_seq"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trnspt_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_TrnsptLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "TrnsptLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_TrnsptLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "TrnsptLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("TrnsptLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_TrnsptLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0033", "TrnsptLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_TrnsptLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "TrnsptLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("TrnsptLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Trnspt_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0033", "Trnspt_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Trnspt_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Trnspt_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trnspt_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0033_Trnspt_Del01_INFO = new MCOperationInfo("MA", "MABCL0033", "Trnspt_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0033_Trnspt_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0033", "Trnspt_Del01",
			new MCItemDef[]{
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Trnspt_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

