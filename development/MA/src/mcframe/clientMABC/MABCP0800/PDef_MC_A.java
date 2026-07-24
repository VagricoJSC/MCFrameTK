package mcframe.clientMABC.MABCP0800;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_SeqReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0800.Srch01.UP.BLOCK0")){
			return MA_MABCL0800_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0800.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0800_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0800.Upd01.UP.BLOCK0")){
			return MA_MABCL0800_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0800.Del01.UP.BLOCK0")){
			return MA_MABCL0800_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL0800_Srch01_INFO = new MCOperationInfo("MA", "MABCL0800", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0800_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0800", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("key_elm", "key_elm"),
				MCItemDef.create("seq_typ", "seq_typ"),
				MCItemDef.create("ora_seq_nm", "ora_seq_nm"),
				MCItemDef.create("non_num_ptn", "non_num_ptn")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0800_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0800", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_biz_typ_nm", "num_biz_typ_nm"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("key_elm", "key_elm"),
				MCItemDef.create("seq_typ", "seq_typ"),
				MCItemDef.create("seq_typ_old", "seq_typ_old"),
				MCItemDef.create("seq_typ_nm", "seq_typ_nm"),
				MCItemDef.create("ora_seq_nm", "ora_seq_nm"),
				MCItemDef.create("min_val", "min_val"),
				MCItemDef.create("max_val", "max_val"),
				MCItemDef.create("increment_by", "increment_by"),
				MCItemDef.create("cycl_flg", "cycl_flg"),
				MCItemDef.create("last_val", "last_val"),
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
	
	static final MCOperationInfo MA_MABCL0800_Upd01_INFO = new MCOperationInfo("MA", "MABCL0800", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0800_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0800", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("key_elm", "key_elm"),
				MCItemDef.create("seq_typ", "seq_typ"),
				MCItemDef.create("ora_seq_nm", "ora_seq_nm"),
				MCItemDef.create("num_upd_flg", "num_upd_flg"),
				MCItemDef.create("min_val", "min_val"),
				MCItemDef.create("max_val", "max_val"),
				MCItemDef.create("increment_by", "increment_by"),
				MCItemDef.create("cycl_flg", "cycl_flg"),
				MCItemDef.create("last_val", "last_val"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0800_Del01_INFO = new MCOperationInfo("MA", "MABCL0800", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0800_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0800", "Del01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("key_elm", "key_elm"),
				MCItemDef.create("seq_typ", "seq_typ"),
				MCItemDef.create("ora_seq_nm", "ora_seq_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

