package mcframe.serverMSLA.MSLAL8260;

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
 * [MSLAL_InptActRecvConvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv01.UP.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv01.DOWN.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv02.UP.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv02.DOWN.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv03.UP.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv03.UP.BLOCK1")){
			return MS_MSLAL8260_InptActRecvConv_Conv03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL8260.InptActRecvConv_Conv03.DOWN.BLOCK0")){
			return MS_MSLAL8260_InptActRecvConv_Conv03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSLAL8260_InptActRecvConv_Conv01_INFO = new MCOperationInfo("MS", "MSLAL8260", "InptActRecvConv_Conv01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL8260_InptActRecvConv_Conv02_INFO = new MCOperationInfo("MS", "MSLAL8260", "InptActRecvConv_Conv02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL8260_InptActRecvConv_Conv03_INFO = new MCOperationInfo("MS", "MSLAL8260", "InptActRecvConv_Conv03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv03",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("trd_typ_cd", "trd_typ_cd"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("mfg_itm_nm", "mfg_itm_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("act_hm", "act_hm"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("acxfr_rsn_nm", "acxfr_rsn_nm"),
				MCItemDef.create("acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("acxfr_bd_dpt_nm", "acxfr_bd_dpt_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("act_trd_rmrks", "act_trd_rmrks"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("if_inpt_typ", "if_inpt_typ"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_rsn_nm", "loss_rsn_nm"),
				MCItemDef.create("old_loss_rsn_cd", "old_loss_rsn_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_nm", "co_nm"),
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
				MCItemDef.create("sub_dt5", "sub_dt5")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL8260_InptActRecvConv_Conv03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL8260", "InptActRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

