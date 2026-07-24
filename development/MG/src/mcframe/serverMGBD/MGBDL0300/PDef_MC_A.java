package mcframe.serverMGBD.MGBDL0300;

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
 * [MGBDL_CostTermCalcCtgPtnCopy]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0300.Chk01.UP.BLOCK0")){
			return MG_MGBDL0300_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Chk01.UP.BLOCK1")){
			return MG_MGBDL0300_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0300_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Chk01.DOWN.BLOCK1")){
			return MG_MGBDL0300_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Ins01.UP.BLOCK0")){
			return MG_MGBDL0300_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Ins01.UP.BLOCK1")){
			return MG_MGBDL0300_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Ins02.UP.BLOCK0")){
			return MG_MGBDL0300_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Ins02.UP.BLOCK1")){
			return MG_MGBDL0300_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Ins03.UP.BLOCK0")){
			return MG_MGBDL0300_Ins03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Ins03.UP.BLOCK1")){
			return MG_MGBDL0300_Ins03_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Ins04.UP.BLOCK0")){
			return MG_MGBDL0300_Ins04_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Ins04.UP.BLOCK1")){
			return MG_MGBDL0300_Ins04_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Srch01.UP.BLOCK0")){
			return MG_MGBDL0300_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0300.Srch01.UP.BLOCK1")){
			return MG_MGBDL0300_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0300.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0300_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MG_MGBDL0300_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0300", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0300_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MG_MGBDL0300_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("DelDtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0300_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0300", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0300_Ins02_INFO = new MCOperationInfo("MG", "MGBDL0300", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0300_Ins03_INFO = new MCOperationInfo("MG", "MGBDL0300", "Ins03", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Ins03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Ins03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins03",
			new MCItemDef[]{
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0300_Ins04_INFO = new MCOperationInfo("MG", "MGBDL0300", "Ins04", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Ins04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins04",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Ins04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Ins04",
			new MCItemDef[]{
				MCItemDef.create("tab_ctg_typ", "tab_ctg_typ"),
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0300_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0300", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0300_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MG_MGBDL0300_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cost_copy_typ_key", "cost_copy_typ_key")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0300_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0300", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cnt_fr", "cnt_fr"),
				MCItemDef.create("cnt_to", "cnt_to")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

