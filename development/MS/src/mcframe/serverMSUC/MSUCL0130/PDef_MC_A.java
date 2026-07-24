package mcframe.serverMSUC.MSUCL0130;

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
 * [MSUCL_AmtUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUCL0130.AmtUtil_Calc01.UP.BLOCK0")){
			return MS_MSUCL0130_AmtUtil_Calc01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0130.AmtUtil_Calc01.UP.BLOCK1")){
			return MS_MSUCL0130_AmtUtil_Calc01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0130.AmtUtil_Calc01.DOWN.BLOCK0")){
			return MS_MSUCL0130_AmtUtil_Calc01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSUCL0130_AmtUtil_Calc01_INFO = new MCOperationInfo("MS", "MSUCL0130", "AmtUtil_Calc01", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0130_AmtUtil_Calc01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0130", "AmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("tax_rnd_typ", "tax_rnd_typ"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg")
			}
			,
			MCBlockDef.create("AmtUtil_Calc01_Hdr")
		);
	}

	public static MCContainerDef MS_MSUCL0130_AmtUtil_Calc01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0130", "AmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate")
			}
			,
			MCBlockDef.create("AmtUtil_Calc01_Dtl")
		);
	}


	public static MCContainerDef MS_MSUCL0130_AmtUtil_Calc01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0130", "AmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("AmtUtil_Calc01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

