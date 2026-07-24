package mcframe.serverMSUC.MSUCL0090;

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
 * [MSUCL_SCMLinkUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch01.UP.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch01.DOWN.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch02.UP.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch02.DOWN.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch03.UP.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0090.SCMLinkUtil_Srch03.DOWN.BLOCK0")){
			return MS_MSUCL0090_SCMLinkUtil_Srch03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSUCL0090_SCMLinkUtil_Srch01_INFO = new MCOperationInfo("MS", "MSUCL0090", "SCMLinkUtil_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("dlv_slip_split_flg", "dlv_slip_split_flg"),
				MCItemDef.create("null_val_if_flg", "null_val_if_flg")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSUCL0090_SCMLinkUtil_Srch02_INFO = new MCOperationInfo("MS", "MSUCL0090", "SCMLinkUtil_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSUCL0090_SCMLinkUtil_Srch03_INFO = new MCOperationInfo("MS", "MSUCL0090", "SCMLinkUtil_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch03_Cnd")
		);
	}


	public static MCContainerDef MS_MSUCL0090_SCMLinkUtil_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0090", "SCMLinkUtil_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lims_flg", "lims_flg")
			}
			,
			MCBlockDef.create("SCMLinkUtil_Srch03_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

