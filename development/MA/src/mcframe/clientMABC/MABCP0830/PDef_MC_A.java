package mcframe.clientMABC.MABCP0830;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_AttachInfoChk]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0830.Srch01.UP.BLOCK0")){
			return MA_MABCL0830_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0830.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0830_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABCL0830_Srch01_INFO = new MCOperationInfo("MA", "MABCL0830", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0830_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0830", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("attach_info_typ", "attach_info_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0830_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0830", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("attach_info_key1", "attach_info_key1"),
				MCItemDef.create("attach_info_key2", "attach_info_key2"),
				MCItemDef.create("attach_info_key3", "attach_info_key3"),
				MCItemDef.create("attach_info_key4", "attach_info_key4"),
				MCItemDef.create("attach_info_key5", "attach_info_key5"),
				MCItemDef.create("attach_info_id", "attach_info_id"),
				MCItemDef.create("attach_info_typ", "attach_info_typ"),
				MCItemDef.create("attach_info_typ_nm", "attach_info_typ_nm"),
				MCItemDef.create("ext_sys_no_attach", "ext_sys_no_attach"),
				MCItemDef.create("attach_info_rmrks", "attach_info_rmrks"),
				MCItemDef.create("attach_info_path", "attach_info_path"),
				MCItemDef.create("attach_info_bin", "attach_info_bin"),
				MCItemDef.create("attach_info_bin_nm", "attach_info_bin_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

