package mcframe.clientMBBB.MBBBP0140;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBBP_JournalSrchByBp]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0140.Srch01.UP.BLOCK0")){
			return MB_MBBBL0140_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0140.Srch01.DOWN.BLOCK0")){
			return MB_MBBBL0140_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL0140_Srch01_INFO = new MCOperationInfo("MB", "MBBBL0140", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0140_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("ac_typ", "ac_typ"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("bp_typ", "bp_typ"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("slip_cnt_flg", "slip_cnt_flg"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("sub_ac_flg", "sub_ac_flg"),
				MCItemDef.create("tax_flg", "tax_flg"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp" + ".bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL0140_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBBL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_if_typ", "ac_if_typ"),
				MCItemDef.create("ac_if_typ_nm", "ac_if_typ_nm"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_typ", "bp_typ"),
				MCItemDef.create("bp_typ_nm", "bp_typ_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("sub_ac_nm", "sub_ac_nm"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("d_amt", "d_amt"),
				MCItemDef.create("d_tax_amt", "d_tax_amt"),
				MCItemDef.create("c_amt", "c_amt"),
				MCItemDef.create("c_tax_amt", "c_tax_amt"),
				MCItemDef.create("total_amt", "total_amt"),
				MCItemDef.create("total_tax_amt", "total_tax_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("d_trd_amt", "d_trd_amt"),
				MCItemDef.create("d_trd_tax_amt", "d_trd_tax_amt"),
				MCItemDef.create("c_trd_amt", "c_trd_amt"),
				MCItemDef.create("c_trd_tax_amt", "c_trd_tax_amt"),
				MCItemDef.create("total_trd_amt", "total_trd_amt"),
				MCItemDef.create("total_trd_tax_amt", "total_trd_tax_amt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

