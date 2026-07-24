package mcframe.clientMSBB.MSBBP4020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_SloRsnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL4020.Srch01.UP.BLOCK0")){
			return MS_MSBBL4020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL4020.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL4020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL4020.Upd01.UP.BLOCK0")){
			return MS_MSBBL4020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL4020.Del01.UP.BLOCK0")){
			return MS_MSBBL4020_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBBL4020_Srch01_INFO = new MCOperationInfo("MS", "MSBBL4020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL4020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL4020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_rsn_cd", "slo_rsn_cd"),
				MCItemDef.create("slo_rsn_nm", "slo_rsn_nm"),
				MCItemDef.create("off_qtn_term_flg", "off_qtn_term_flg"),
				MCItemDef.create("on_qtn_term_flg", "on_qtn_term_flg"),
				MCItemDef.create("off_qtn_rslt_flg", "off_qtn_rslt_flg"),
				MCItemDef.create("on_qtn_rslt_flg", "on_qtn_rslt_flg"),
				MCItemDef.create("off_slo_can_flg", "off_slo_can_flg"),
				MCItemDef.create("on_slo_can_flg", "on_slo_can_flg"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL4020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL4020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("slo_rsn_cd", "slo_rsn_cd"),
				MCItemDef.create("slo_rsn_nm", "slo_rsn_nm"),
				MCItemDef.create("qtn_term_flg", "qtn_term_flg"),
				MCItemDef.create("qtn_term_sort_seq", "qtn_term_sort_seq"),
				MCItemDef.create("qtn_rslt_flg", "qtn_rslt_flg"),
				MCItemDef.create("qtn_rslt_sort_seq", "qtn_rslt_sort_seq"),
				MCItemDef.create("slo_can_flg", "slo_can_flg"),
				MCItemDef.create("slo_can_sort_seq", "slo_can_sort_seq"),
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
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL4020_Upd01_INFO = new MCOperationInfo("MS", "MSBBL4020", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL4020_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL4020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("slo_rsn_cd", "slo_rsn_cd"),
				MCItemDef.create("slo_rsn_nm", "slo_rsn_nm"),
				MCItemDef.create("qtn_term_flg", "qtn_term_flg"),
				MCItemDef.create("qtn_term_sort_seq", "qtn_term_sort_seq"),
				MCItemDef.create("qtn_rslt_flg", "qtn_rslt_flg"),
				MCItemDef.create("qtn_rslt_sort_seq", "qtn_rslt_sort_seq"),
				MCItemDef.create("slo_can_flg", "slo_can_flg"),
				MCItemDef.create("slo_can_sort_seq", "slo_can_sort_seq"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL4020_Del01_INFO = new MCOperationInfo("MS", "MSBBL4020", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL4020_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL4020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("slo_rsn_cd", "slo_rsn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

