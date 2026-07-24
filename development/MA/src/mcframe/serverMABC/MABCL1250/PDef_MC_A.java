package mcframe.serverMABC.MABCL1250;

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
 * [MABCL_SchdPayReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1250.SchdPay_UpdChk01.UP.BLOCK0")){
			return MA_MABCL1250_SchdPay_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.SchdPay_Upd01.UP.BLOCK0")){
			return MA_MABCL1250_SchdPay_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.SchdPay_DelChk01.UP.BLOCK0")){
			return MA_MABCL1250_SchdPay_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.SchdPay_Del01.UP.BLOCK0")){
			return MA_MABCL1250_SchdPay_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.Srch01.UP.BLOCK0")){
			return MA_MABCL1250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.Upd01.UP.BLOCK0")){
			return MA_MABCL1250_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1250.Del01.UP.BLOCK0")){
			return MA_MABCL1250_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABCL1250_SchdPay_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL1250", "SchdPay_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_SchdPay_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "SchdPay_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("dpt_id_flg", "dpt_id_flg"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abstract1", "abstract1"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SchdPay_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_SchdPay_Upd01_INFO = new MCOperationInfo("MA", "MABCL1250", "SchdPay_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_SchdPay_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "SchdPay_Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("dpt_id_flg", "dpt_id_flg"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abstract1", "abstract1"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SchdPay_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_SchdPay_DelChk01_INFO = new MCOperationInfo("MA", "MABCL1250", "SchdPay_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_SchdPay_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "SchdPay_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SchdPay_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_SchdPay_Del01_INFO = new MCOperationInfo("MA", "MABCL1250", "SchdPay_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_SchdPay_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "SchdPay_Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SchdPay_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_Srch01_INFO = new MCOperationInfo("MA", "MABCL1250", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL1250_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("pay_ap_typ_nm", "pay_ap_typ_nm"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("foreign_typ_nm", "foreign_typ_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("dpt_id_flg", "dpt_id_flg"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("ac_nm", "ac_nm"),
				MCItemDef.create("sub_flg", "sub_flg"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("sub_ac_nm", "sub_ac_nm"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abs_typ_nm", "abs_typ_nm"),
				MCItemDef.create("abstract1", "abstract1"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_Upd01_INFO = new MCOperationInfo("MA", "MABCL1250", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("foreign_typ", "foreign_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("dpt_id_flg", "dpt_id_flg"),
				MCItemDef.create("slip_cnt_id", "slip_cnt_id"),
				MCItemDef.create("ac_cd", "ac_cd"),
				MCItemDef.create("sub_ac_cd", "sub_ac_cd"),
				MCItemDef.create("abs_typ", "abs_typ"),
				MCItemDef.create("abstract1", "abstract1"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABCL1250_Del01_INFO = new MCOperationInfo("MA", "MABCL1250", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1250_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL1250", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_ap_typ", "pay_ap_typ"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

