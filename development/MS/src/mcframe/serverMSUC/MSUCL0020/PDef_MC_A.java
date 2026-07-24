package mcframe.serverMSUC.MSUCL0020;

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
 * [MSUCL_ConvQtyAmtUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc01.UP.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc01.UP.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc01.DOWN.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc01.DOWN.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc02.UP.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc02.UP.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc02.DOWN.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc03.UP.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc03.UP.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc03.UP.BLOCK2")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc03.DOWN.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc04.UP.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc04.UP.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc04.UP.BLOCK2")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK2();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc04.DOWN.BLOCK0")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0020.ConvQtyAmtUtil_Calc04.DOWN.BLOCK1")){
			return MS_MSUCL0020_ConvQtyAmtUtil_Calc04_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSUCL0020_ConvQtyAmtUtil_Calc01_INFO = new MCOperationInfo("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc01", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty")
			}
			,
			MCBlockDef.create("ConvQtyAmtUtil_Calc01_Hdr")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("grp_no", "grp_no"),
				MCItemDef.create("grp_no2", "grp_no2"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("schd_trd_unit_cd", "schd_trd_unit_cd"),
				MCItemDef.create("schd_trd_unit_conv_qty", "schd_trd_unit_conv_qty"),
				MCItemDef.create("schd_trd_unit_conv_base_qty", "schd_trd_unit_conv_base_qty"),
				MCItemDef.create("schd_trd_unit_dec_place", "schd_trd_unit_dec_place"),
				MCItemDef.create("schd_trd_unit_rnd_typ", "schd_trd_unit_rnd_typ")
			}
			,
			MCBlockDef.create("ConvQtyAmtUtil_Calc01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd")
			}
			,
			MCBlockDef.create("ConvQtyAmtUtil_Calc01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no")
			}
			,
			MCBlockDef.create("ConvQtyAmtUtil_Calc01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSUCL0020_ConvQtyAmtUtil_Calc02_INFO = new MCOperationInfo("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc02", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("act_tax_rate", "act_tax_rate"),
				MCItemDef.create("act_inc_tax_flg", "act_inc_tax_flg"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("tax_rnd_typ", "tax_rnd_typ"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_amt_input_flg", "dscnt_amt_input_flg"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("wtax_rate", "wtax_rate")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}


	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	
	static final MCOperationInfo MS_MSUCL0020_ConvQtyAmtUtil_Calc03_INFO = new MCOperationInfo("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc03", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("tax_rnd_typ", "tax_rnd_typ")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSUCL0020_ConvQtyAmtUtil_Calc04_INFO = new MCOperationInfo("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("act_tax_rate", "act_tax_rate"),
				MCItemDef.create("act_inc_tax_flg", "act_inc_tax_flg"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("tax_rnd_typ", "tax_rnd_typ"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_amt_input_flg", "dscnt_amt_input_flg"),
				MCItemDef.create("wtax_rate", "wtax_rate")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc04_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("grp_no", "grp_no"),
				MCItemDef.create("grp_no2", "grp_no2"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSUCL0020_ConvQtyAmtUtil_Calc04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0020", "ConvQtyAmtUtil_Calc04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	//FMCB DEF_CLASSES END
}

