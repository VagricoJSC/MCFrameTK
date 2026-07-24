package mcframe.clientMSBG.MSBGP0280;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_CredDtlSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0280.Srch01.UP.BLOCK0")){
			return MS_MSBGL0280_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0280.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0280_Srch01_DOWN_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0280_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0280", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0280_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cur_cd", "cur_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_HdrRslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cred_nm", "cred_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("cred_limit_p" + ".amt", "cred_limit"),
				MCItemDef.create("ttl_cred_amt_p" + ".amt", "ttl_cred_amt"),
				MCItemDef.create("cred_bal_p" + ".amt", "cred_bal"),
				MCItemDef.create("ttl_ym", "ttl_ym"),
				MCItemDef.create("ttl_ym_ap", "ttl_ym_ap"),
				MCItemDef.create("ttl_end_bal_p" + ".amt", "ttl_end_bal"),
				MCItemDef.create("ttl_init_bal_p" + ".amt", "ttl_init_bal"),
				MCItemDef.create("ttl_sls_p" + ".amt", "ttl_sls"),
				MCItemDef.create("ttl_rcv_p" + ".amt", "ttl_rcv"),
				MCItemDef.create("ttl_adv_p" + ".amt", "ttl_adv"),
				MCItemDef.create("ttl_init_bal_ap_p" + ".amt", "ttl_init_bal_ap"),
				MCItemDef.create("ttl_purc_p" + ".amt", "ttl_purc"),
				MCItemDef.create("ttl_pay_p" + ".amt", "ttl_pay"),
				MCItemDef.create("ttl_adv_pay_p" + ".amt", "ttl_adv_pay"),
				MCItemDef.create("not_appl_note_p" + ".amt", "not_appl_note"),
				MCItemDef.create("not_appl_adv_note_p" + ".amt", "not_appl_adv_note"),
				MCItemDef.create("ttl_backord_p" + ".amt", "ttl_backord"),
				MCItemDef.create("ttl_qtn_p" + ".amt", "ttl_qtn"),
				MCItemDef.create("ttl_po_backord_p" + ".amt", "ttl_po_backord")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlRslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("init_bal_p" + ".amt", "init_bal"),
				MCItemDef.create("sls_amt_p" + ".amt", "sls_amt"),
				MCItemDef.create("cash_amt_p" + ".amt", "cash_amt"),
				MCItemDef.create("note_amt_p" + ".amt", "note_amt"),
				MCItemDef.create("xfr_amt_p" + ".amt", "xfr_amt"),
				MCItemDef.create("setoff_amt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("sw_amt_p" + ".amt", "sw_amt"),
				MCItemDef.create("end_bal_p" + ".amt", "end_bal"),
				MCItemDef.create("not_appl_no_p" + ".amt", "not_appl_note"),
				MCItemDef.create("backord_amt_p" + ".amt", "backord_amt"),
				MCItemDef.create("cred_amt_p" + ".amt", "cred_amt"),
				MCItemDef.create("qtn_amt_p" + ".amt", "qtn_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBGL0280_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_DtlApRslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0280", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("init_bal_p" + ".amt", "init_bal"),
				MCItemDef.create("purc_amt_p" + ".amt", "purc_amt"),
				MCItemDef.create("cash_amt_p" + ".amt", "cash_amt"),
				MCItemDef.create("note_amt_p" + ".amt", "note_amt"),
				MCItemDef.create("xfr_amt_p" + ".amt", "xfr_amt"),
				MCItemDef.create("setoff_amt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("sw_amt_p" + ".amt", "sw_amt"),
				MCItemDef.create("end_bal_p" + ".amt", "end_bal"),
				MCItemDef.create("backord_amt_p" + ".amt", "backord_amt"),
				MCItemDef.create("cred_amt_p" + ".amt", "cred_amt")
			}
			,
			MCBlockDef.create("DtlAp")
		);
	}
	//FMCB DEF_CLASSES END
}

