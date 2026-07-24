package mcframe.serverMGBF.MGBFL0230;

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
 * [MGBFL_CostReportListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0230.Srch01.UP.BLOCK0")){
			return MG_MGBFL0230_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0230_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Chk01.UP.BLOCK0")){
			return MG_MGBFL0230_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Chk01.DOWN.BLOCK0")){
			return MG_MGBFL0230_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Chk02.UP.BLOCK0")){
			return MG_MGBFL0230_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Chk02.DOWN.BLOCK0")){
			return MG_MGBFL0230_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Upd01.UP.BLOCK0")){
			return MG_MGBFL0230_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Del01.UP.BLOCK0")){
			return MG_MGBFL0230_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0230.Del01.DOWN.BLOCK0")){
			return MG_MGBFL0230_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MG_MGBFL0230_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0230", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0230_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd"),
				MCItemDef.create("rpt_key_nm", "rpt_key_nm"),
				MCItemDef.create("rpt_key_typ", "rpt_key_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("unmake_flg", "unmake_flg"),
				MCItemDef.create("made_flg", "made_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0230_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("made_flg", "made_flg"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd"),
				MCItemDef.create("rpt_key_nm", "rpt_key_nm"),
				MCItemDef.create("rpt_key_typ", "rpt_key_typ"),
				MCItemDef.create("rpt_key_typ_nm", "rpt_key_typ_nm"),
				MCItemDef.create("auto_flg", "auto_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0230_Chk01_INFO = new MCOperationInfo("MG", "MGBFL0230", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0230_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBFL0230_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0230_Chk02_INFO = new MCOperationInfo("MG", "MGBFL0230", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0230_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBFL0230_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0230_Upd01_INFO = new MCOperationInfo("MG", "MGBFL0230", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0230_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBFL0230_Del01_INFO = new MCOperationInfo("MG", "MGBFL0230", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0230_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBFL0230_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0230", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

