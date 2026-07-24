package mcframe.serverMGBD.MGBDL0310;

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
 * [MGBDL_BatchOutReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0310.Srch01.UP.BLOCK0")){
			return MG_MGBDL0310_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0310_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk01.UP.BLOCK0")){
			return MG_MGBDL0310_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk01.UP.BLOCK1")){
			return MG_MGBDL0310_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0310.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0310_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk02.UP.BLOCK0")){
			return MG_MGBDL0310_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0310_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk03.UP.BLOCK0")){
			return MG_MGBDL0310_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Chk03.DOWN.BLOCK0")){
			return MG_MGBDL0310_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Upd01.UP.BLOCK0")){
			return MG_MGBDL0310_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0310_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Upd02.UP.BLOCK0")){
			return MG_MGBDL0310_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Del01.UP.BLOCK0")){
			return MG_MGBDL0310_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0310_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Imp01.UP.BLOCK0")){
			return MG_MGBDL0310_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0310.Imp01.DOWN.BLOCK0")){
			return MG_MGBDL0310_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MG_MGBDL0310_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0310", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("batch_typ", "batch_typ"),
				MCItemDef.create("batch_typ_nm", "batch_typ_nm"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("batch_typ", "batch_typ"),
				MCItemDef.create("batch_typ_nm", "batch_typ_nm"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0310", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0310_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("batch_typ_nm", "batch_typ_nm")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0310", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Chk03_INFO = new MCOperationInfo("MG", "MGBDL0310", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("batch_typ", "batch_typ"),
				MCItemDef.create("calc_no", "calc_no")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("batch_typ", "batch_typ"),
				MCItemDef.create("calc_no", "calc_no")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0310", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Upd02_INFO = new MCOperationInfo("MG", "MGBDL0310", "Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("batch_typ", "batch_typ"),
				MCItemDef.create("calc_no", "calc_no")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Del01_INFO = new MCOperationInfo("MG", "MGBDL0310", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0310_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0310", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0310_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0310_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0310", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".batch_typ", "batch_typ"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("batch_typ_nm", "batch_typ_nm")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

