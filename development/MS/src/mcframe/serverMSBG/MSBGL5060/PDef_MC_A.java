package mcframe.serverMSBG.MSBGL5060;

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
 * [MSBGL_ApSetoffRcvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5060.ApSetoffRcv_Chk01.UP.BLOCK0")){
			return MS_MSBGL5060_ApSetoffRcv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5060.ApSetoffRcv_Chk01.DOWN.BLOCK0")){
			return MS_MSBGL5060_ApSetoffRcv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5060.ApSetoffRcv_Upd01.UP.BLOCK0")){
			return MS_MSBGL5060_ApSetoffRcv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5060.ApSetoffRcv_Upd01.DOWN.BLOCK0")){
			return MS_MSBGL5060_ApSetoffRcv_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL5060_ApSetoffRcv_Chk01_INFO = new MCOperationInfo("MS", "MSBGL5060", "ApSetoffRcv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5060_ApSetoffRcv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5060", "ApSetoffRcv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd")
			}
			,
			MCBlockDef.create("ApSetoffRcv_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL5060_ApSetoffRcv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5060", "ApSetoffRcv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApSetoffRcv_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5060_ApSetoffRcv_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5060", "ApSetoffRcv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5060_ApSetoffRcv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5060", "ApSetoffRcv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcv_usr_cd", "rcv_usr_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("ar_typ", "ar_typ")
			}
			,
			MCBlockDef.create("ApSetoffRcv_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL5060_ApSetoffRcv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5060", "ApSetoffRcv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("ApSetoffRcv_Upd01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

