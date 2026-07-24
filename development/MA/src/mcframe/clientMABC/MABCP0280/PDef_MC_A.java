package mcframe.clientMABC.MABCP0280;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_DptReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0280.Srch01.UP.BLOCK0")){
			return MA_MABCL0280_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0280.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0280_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0280.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0280_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0280.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0280_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0280.Upd01.UP.BLOCK0")){
			return MA_MABCL0280_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0280.Upd01.UP.BLOCK1")){
			return MA_MABCL0280_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0280.Upd01.UP.BLOCK2")){
			return MA_MABCL0280_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL0280.Del01.UP.BLOCK0")){
			return MA_MABCL0280_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL0280_Srch01_INFO = new MCOperationInfo("MA", "MABCL0280", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0280_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ope", "ope")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0280_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dpt_his_rmrks", "dpt_his_rmrks"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptHis")
		);
	}
	public static MCContainerDef MA_MABCL0280_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dpt_nm_lcl", "dpt_nm_lcl"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("up_lv_dpt_cd", "up_lv_dpt_cd"),
				MCItemDef.create("up_lv_dpt_nm", "up_lv_dpt_nm"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("lg_flg", "lg_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("ar_flg", "ar_flg"),
				MCItemDef.create("ap_flg", "ap_flg"),
				MCItemDef.create("sd_flg", "sd_flg"),
				MCItemDef.create("rcv_bank_ac_cd", "rcv_bank_ac_cd"),
				MCItemDef.create("rcv_bank_ac_nm", "rcv_bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("asst_dpt_flg", "asst_dpt_flg"),
				MCItemDef.create("ar_dpt_flg", "ar_dpt_flg"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("sls_dpt_flg", "sls_dpt_flg"),
				MCItemDef.create("purc_dpt_flg", "purc_dpt_flg"),
				MCItemDef.create("ship_dpt_flg", "ship_dpt_flg"),
				MCItemDef.create("arr_dpt_flg", "arr_dpt_flg"),
				MCItemDef.create("mfg_dpt_flg", "mfg_dpt_flg"),
				MCItemDef.create("sd_dpt_flg", "sd_dpt_flg"),
				MCItemDef.create("insp_dpt_flg", "insp_dpt_flg"),
				MCItemDef.create("bd_dpt_flg", "bd_dpt_flg"),
				MCItemDef.create("cost_dpt_cd", "cost_dpt_cd"),
				MCItemDef.create("cost_dpt_nm", "cost_dpt_nm"),
				MCItemDef.create("ac_dpt_cd", "ac_dpt_cd"),
				MCItemDef.create("ac_dpt_nm", "ac_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
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
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0280_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap")
		);
	}
	
	static final MCOperationInfo MA_MABCL0280_Upd01_INFO = new MCOperationInfo("MA", "MABCL0280", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0280_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dpt_his_rmrks", "dpt_his_rmrks"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptHis")
		);
	}

	public static MCContainerDef MA_MABCL0280_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_cd_key", "dpt_cd_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("up_lv_dpt_cd", "up_lv_dpt_cd"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rcv_bank_ac_cd", "rcv_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("asst_dpt_flg", "asst_dpt_flg"),
				MCItemDef.create("ar_dpt_flg", "ar_dpt_flg"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("sls_dpt_flg", "sls_dpt_flg"),
				MCItemDef.create("purc_dpt_flg", "purc_dpt_flg"),
				MCItemDef.create("ship_dpt_flg", "ship_dpt_flg"),
				MCItemDef.create("arr_dpt_flg", "arr_dpt_flg"),
				MCItemDef.create("mfg_dpt_flg", "mfg_dpt_flg"),
				MCItemDef.create("sd_dpt_flg", "sd_dpt_flg"),
				MCItemDef.create("insp_dpt_flg", "insp_dpt_flg"),
				MCItemDef.create("bd_dpt_flg", "bd_dpt_flg"),
				MCItemDef.create("cost_dpt_cd", "cost_dpt_cd"),
				MCItemDef.create("ac_dpt_cd", "ac_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("new_flg", "new_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0280_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("old_dpt_cd", "old_dpt_cd"),
				MCItemDef.create("old_dpt_cd_key", "old_dpt_cd_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("new_dpt_cd", "new_dpt_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("DptMap")
		);
	}
	
	static final MCOperationInfo MA_MABCL0280_Del01_INFO = new MCOperationInfo("MA", "MABCL0280", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0280_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0280", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

